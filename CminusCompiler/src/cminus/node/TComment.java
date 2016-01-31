/* This file was generated by SableCC (http://www.sablecc.org/). */

package cminus.node;

import cminus.analysis.*;

@SuppressWarnings("nls")
public final class TComment extends Token
{
    public TComment()
    {
        super.setText("/*");
    }

    public TComment(int line, int pos)
    {
        super.setText("/*");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TComment(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTComment(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TComment text.");
    }
}
