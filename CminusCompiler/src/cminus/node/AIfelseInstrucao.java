/* This file was generated by SableCC (http://www.sablecc.org/). */

package cminus.node;

import cminus.analysis.*;

@SuppressWarnings("nls")
public final class AIfelseInstrucao extends PInstrucao
{
    private PExprLogica _exprLogica_;
    private PInstrucao _true_;
    private PInstrucao _false_;

    public AIfelseInstrucao()
    {
        // Constructor
    }

    public AIfelseInstrucao(
        @SuppressWarnings("hiding") PExprLogica _exprLogica_,
        @SuppressWarnings("hiding") PInstrucao _true_,
        @SuppressWarnings("hiding") PInstrucao _false_)
    {
        // Constructor
        setExprLogica(_exprLogica_);

        setTrue(_true_);

        setFalse(_false_);

    }

    @Override
    public Object clone()
    {
        return new AIfelseInstrucao(
            cloneNode(this._exprLogica_),
            cloneNode(this._true_),
            cloneNode(this._false_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIfelseInstrucao(this);
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

    public PInstrucao getTrue()
    {
        return this._true_;
    }

    public void setTrue(PInstrucao node)
    {
        if(this._true_ != null)
        {
            this._true_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._true_ = node;
    }

    public PInstrucao getFalse()
    {
        return this._false_;
    }

    public void setFalse(PInstrucao node)
    {
        if(this._false_ != null)
        {
            this._false_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._false_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exprLogica_)
            + toString(this._true_)
            + toString(this._false_);
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

        if(this._true_ == child)
        {
            this._true_ = null;
            return;
        }

        if(this._false_ == child)
        {
            this._false_ = null;
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

        if(this._true_ == oldChild)
        {
            setTrue((PInstrucao) newChild);
            return;
        }

        if(this._false_ == oldChild)
        {
            setFalse((PInstrucao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}