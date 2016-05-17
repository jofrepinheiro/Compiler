/* This file was generated by SableCC (http://www.sablecc.org/). */

package cminus.node;

import java.util.*;
import cminus.analysis.*;

@SuppressWarnings("nls")
public final class AFunDeclaracao extends PDeclaracao
{
    private PTipo _tipo_;
    private TId _id_;
    private final LinkedList<PParametro> _parametro_ = new LinkedList<PParametro>();
    private PInstrucoesCompostas _instrucoesCompostas_;

    public AFunDeclaracao()
    {
        // Constructor
    }

    public AFunDeclaracao(
        @SuppressWarnings("hiding") PTipo _tipo_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") List<?> _parametro_,
        @SuppressWarnings("hiding") PInstrucoesCompostas _instrucoesCompostas_)
    {
        // Constructor
        setTipo(_tipo_);

        setId(_id_);

        setParametro(_parametro_);

        setInstrucoesCompostas(_instrucoesCompostas_);

    }

    @Override
    public Object clone()
    {
        return new AFunDeclaracao(
            cloneNode(this._tipo_),
            cloneNode(this._id_),
            cloneList(this._parametro_),
            cloneNode(this._instrucoesCompostas_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFunDeclaracao(this);
    }

    public PTipo getTipo()
    {
        return this._tipo_;
    }

    public void setTipo(PTipo node)
    {
        if(this._tipo_ != null)
        {
            this._tipo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipo_ = node;
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public LinkedList<PParametro> getParametro()
    {
        return this._parametro_;
    }

    public void setParametro(List<?> list)
    {
        for(PParametro e : this._parametro_)
        {
            e.parent(null);
        }
        this._parametro_.clear();

        for(Object obj_e : list)
        {
            PParametro e = (PParametro) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._parametro_.add(e);
        }
    }

    public PInstrucoesCompostas getInstrucoesCompostas()
    {
        return this._instrucoesCompostas_;
    }

    public void setInstrucoesCompostas(PInstrucoesCompostas node)
    {
        if(this._instrucoesCompostas_ != null)
        {
            this._instrucoesCompostas_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._instrucoesCompostas_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipo_)
            + toString(this._id_)
            + toString(this._parametro_)
            + toString(this._instrucoesCompostas_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipo_ == child)
        {
            this._tipo_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._parametro_.remove(child))
        {
            return;
        }

        if(this._instrucoesCompostas_ == child)
        {
            this._instrucoesCompostas_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tipo_ == oldChild)
        {
            setTipo((PTipo) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        for(ListIterator<PParametro> i = this._parametro_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PParametro) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._instrucoesCompostas_ == oldChild)
        {
            setInstrucoesCompostas((PInstrucoesCompostas) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
