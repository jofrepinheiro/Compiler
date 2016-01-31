/* This file was generated by SableCC (http://www.sablecc.org/). */

package cminus.node;

import cminus.analysis.*;

@SuppressWarnings("nls")
public final class TCommentBody extends Token
{
    public TCommentBody(String text)
    {
        setText(text);
    }

    public TCommentBody(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TCommentBody(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCommentBody(this);
    }
}
