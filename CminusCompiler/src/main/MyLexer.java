package main;

import java.io.IOException;

import cminus.lexer.Lexer;
import cminus.lexer.LexerException;
import cminus.node.EOF;
import cminus.node.TComment;
import cminus.node.TCommentEnd;

public class MyLexer extends Lexer {
	private int count;
	private TComment comment;
	private StringBuffer text;
	private int lastPos = -1;
	private int lastLine = -1;
	private int firstOpenCommentPos = -1;
	private int firstOpenCommentLine = -1;

	// We define a constructor
	public MyLexer(java.io.PushbackReader in) {
		super(in);
	}

	// We define a filter that recognizes nested comments.
	protected void filter() { // if we are in the comment state
		if (state.equals(State.COMMENT)) { // if we are just entering this state
			if (comment == null) { // The token is supposed to be a comment.
									// We keep a reference to it and set the
									// count to one
				comment = (TComment) token;
				text = new StringBuffer(comment.getText());
				count = 1;
				firstOpenCommentLine = token.getLine();
				firstOpenCommentPos = token.getPos();
				token = null; // continue to scan the input.
			} else { // we were already in the comment state
				text.append(token.getText()); // accumulate the text.
				if (token instanceof TComment)
					count++;
				else if (token instanceof TCommentEnd)
					count--;
				else if (token instanceof EOF)
					if (count > 0)
						throw new RuntimeException("You forgot to close your freaking comment :) Line: "
								+ firstOpenCommentLine + " Position: " + firstOpenCommentPos);
					else if (count < 0)
						throw new RuntimeException("You closed too many comments :) Line: " + token.getLine()
								+ " Position: " + token.getPos());

				if (count != 0)
					token = null; // continue to scan the input.
				else {
					comment.setText(text.toString());
					token = comment; // return a comment with the full text.
					state = State.NORMAL; // go back to normal.
					comment = null; // We release this reference.
				}
			}
		} else if(token instanceof TCommentEnd)
			throw new RuntimeException("You closed too many comments :) Line: " + token.getLine()
			+ " Position: " + token.getPos());
	}
}