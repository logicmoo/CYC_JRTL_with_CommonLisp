/*
 * Cons.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Cons.java,v 1.4 2003-02-15 17:47:27 piso Exp $
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package org.armedbear.lisp;

public final class Cons extends LispObject implements SequenceType
{
    private LispObject car;
    private LispObject cdr;

    public Cons(LispObject car, LispObject cdr)
    {
        this.car = car;
        this.cdr = cdr;
        ++count;
    }

    public Cons(LispObject car)
    {
        this.car = car;
        this.cdr = NIL;
        ++count;
    }

    public int getType()
    {
        return TYPE_CONS;
    }

    public LispObject typeOf()
    {
        return Symbol.CONS;
    }

    public final LispObject car()
    {
        return car;
    }

    public final LispObject cdr()
    {
        return cdr;
    }

    public final void setCar(LispObject car)
    {
        this.car = car;
    }

    public final void setCdr(LispObject cdr)
    {
        this.cdr = cdr;
    }

    public final LispObject cadr() throws LispError
    {
        return cdr.car();
    }

    public final LispObject cddr() throws LispError
    {
        return cdr.cdr();
    }

    public final int length() throws LispError
    {
        int length = 0;
        LispObject obj = this;
        try {
            while (obj != NIL) {
                ++length;
                obj = ((Cons)obj).cdr;
            }
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "list");
        }
        return length;
    }

    public LispObject elt(long index) throws LispError
    {
        if (index < 0) {
            throw new LispError("ELT: invalid index " + index + " for " +
                this);
        }
        long i = 0;
        LispObject obj = this;
        while (true) {
            if (i == index)
                return obj.car();
            obj = obj.cdr();
            if (obj == NIL) {
                throw new LispError("ELT: invalid index " + index +
                    " for " + this);
            }
            ++i;
        }
    }

    public final boolean listp()
    {
        return true;
    }

    public LispObject remove(LispObject item) throws LispError
    {
        LispObject result = NIL;
        LispObject splice = null;
        for (LispObject list = this; list != NIL; list = list.cdr()) {
            LispObject obj = list.car();
            if (!eql(obj, item)) {
                if (splice == null) {
                    splice = new Cons(obj);
                    result = splice;
                } else {
                    Cons temp = new Cons(obj);
                    splice.setCdr(temp);
                    splice = temp;
                }
            }
        }
        return result;
    }

    public final LispObject[] copyToArray() throws LispError
    {
        final int length = length();
        LispObject[] array = new LispObject[length];
        LispObject rest = this;
        for (int i = 0; i < length; i++) {
            array[i] = rest.car();
            rest = rest.cdr();
        }
        return array;
    }

    public String toString()
    {
        try {
            StringBuffer sb = new StringBuffer();
            if (car == Symbol.QUOTE) {
                sb.append('\'');
                sb.append(cdr.car());
            } else if (car == Symbol.FUNCTION && cdr instanceof Cons) {
                sb.append("#'");
                sb.append(cdr.car());
            } else {
                sb.append('(');
                LispObject p = this;
                sb.append(p.car().toString());
                while ((p = p.cdr()) instanceof Cons) {
                    sb.append(' ');
                    sb.append(p.car().toString());
                }
                if (p != NIL) {
                    sb.append(" . ");
                    sb.append(p);
                }
                sb.append(')');
            }
            return sb.toString();
        }
        catch (Throwable t) {
            Debug.trace(t);
            return "";
        }
    }

    // Statistics for TIME.
    private static long count;

    /*package*/ static long getCount()
    {
        return count;
    }

    /*package*/ static void setCount(long n)
    {
        count = n;
    }
}
