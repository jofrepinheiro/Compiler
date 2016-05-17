/* This file was generated by SableCC (http://www.sablecc.org/). */

package cminus.node;

import cminus.analysis.*;

@SuppressWarnings("nls")
public final class TKwVoid extends Token
{
    public TKwVoid()
    {
        super.setText("void");
    }

    public TKwVoid(int line, int pos)
    {
        super.setText("void");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TKwVoid(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTKwVoid(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TKwVoid text.");
    }
}