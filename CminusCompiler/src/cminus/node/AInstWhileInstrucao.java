/* This file was generated by SableCC (http://www.sablecc.org/). */

package cminus.node;

import cminus.analysis.*;

@SuppressWarnings("nls")
public final class AInstWhileInstrucao extends PInstrucao
{
    private PExprLogica _exprLogica_;
    private PInstrucao _instrucao_;

    public AInstWhileInstrucao()
    {
        // Constructor
    }

    public AInstWhileInstrucao(
        @SuppressWarnings("hiding") PExprLogica _exprLogica_,
        @SuppressWarnings("hiding") PInstrucao _instrucao_)
    {
        // Constructor
        setExprLogica(_exprLogica_);

        setInstrucao(_instrucao_);

    }

    @Override
    public Object clone()
    {
        return new AInstWhileInstrucao(
            cloneNode(this._exprLogica_),
            cloneNode(this._instrucao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInstWhileInstrucao(this);
    }

    public PExprLogica getExprLogica()
    {
        return this._exprLogica_;
    }

    public void setExprLogica(PExprLogica node)
    {
        if(this._exprLogica_ != null)
        {
            this._exprLogica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exprLogica_ = node;
    }

    public PInstrucao getInstrucao()
    {
        return this._instrucao_;
    }

    public void setInstrucao(PInstrucao node)
    {
        if(this._instrucao_ != null)
        {
            this._instrucao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._instrucao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exprLogica_)
            + toString(this._instrucao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exprLogica_ == child)
        {
            this._exprLogica_ = null;
            return;
        }

        if(this._instrucao_ == child)
        {
            this._instrucao_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exprLogica_ == oldChild)
        {
            setExprLogica((PExprLogica) newChild);
            return;
        }

        if(this._instrucao_ == oldChild)
        {
            setInstrucao((PInstrucao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
