/*
 * Cons.java
 *
 * Copyright (C) 2002-2004 Peter Graves
 * $Id: Cons.java,v 1.43 2004-05-23 15:19:45 piso Exp $
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

public final class Cons extends LispObject
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

    public Cons(String name, LispObject value)
    {
        this.car = new SimpleString(name);
        this.cdr = value != null ? value : UNBOUND;
        ++count;
    }

    public LispObject typeOf()
    {
        return Symbol.CONS;
    }

    public LispClass classOf()
    {
        return BuiltInClass.CONS;
    }

    public LispObject typep(LispObject typeSpecifier) throws ConditionThrowable
    {
        if (typeSpecifier == Symbol.LIST)
            return T;
        if (typeSpecifier == Symbol.CONS)
            return T;
        if (typeSpecifier == Symbol.SEQUENCE)
            return T;
        if (typeSpecifier == BuiltInClass.LIST)
            return T;
        if (typeSpecifier == BuiltInClass.CONS)
            return T;
        if (typeSpecifier == BuiltInClass.SEQUENCE)
            return T;
        if (typeSpecifier == Symbol.ATOM)
            return NIL;
        return super.typep(typeSpecifier);
    }

    public final boolean constantp()
    {
        if (car == Symbol.QUOTE) {
            if (cdr instanceof Cons)
                if (((Cons)cdr).cdr == NIL)
                    return true;
        }
        return false;
    }

    public LispObject ATOM()
    {
        return NIL;
    }

    public boolean atom()
    {
        return false;
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

    public final LispObject cadr() throws ConditionThrowable
    {
        return cdr.car();
    }

    public final LispObject cddr() throws ConditionThrowable
    {
        return cdr.cdr();
    }

    public final LispObject push(LispObject obj)
    {
        return new Cons(obj, this);
    }

    public final int hashCode()
    {
        return computeHashCode(this, 4);
    }

    private static final int computeHashCode(LispObject obj, int depth)
    {
        if (obj instanceof Cons) {
            if (depth > 0) {
                int n1 = computeHashCode(((Cons)obj).car(), depth - 1);
                int n2 = computeHashCode(((Cons)obj).cdr(), depth - 1);
                return n1 ^ n2;
            } else {
                // This number comes from SBCL, but since we're not really
                // using SBCL's SXHASH algorithm, it's probably not optimal.
                return 261835505;
            }
        } else
            return obj.hashCode();
    }

    public final boolean equal(LispObject obj) throws ConditionThrowable
    {
        if (this == obj)
            return true;
        if (obj instanceof Cons) {
            if (car.equal(((Cons)obj).car) && cdr.equal(((Cons)obj).cdr))
                return true;
        }
        return false;
    }

    public final boolean equalp(LispObject obj) throws ConditionThrowable
    {
        if (this == obj)
            return true;
        if (obj instanceof Cons) {
            if (car.equalp(((Cons)obj).car) && cdr.equalp(((Cons)obj).cdr))
                return true;
        }
        return false;
    }

    public final int length() throws ConditionThrowable
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
            signal(new TypeError(obj, "list"));
        }
        return length;
    }

    public LispObject elt(int index) throws ConditionThrowable
    {
        if (index < 0) {
            signal(new TypeError("ELT: invalid index " + index + " for " +
                                 writeToString()));
        }
        int i = 0;
        Cons cons = this;
        try {
            while (true) {
                if (i == index)
                    return cons.car;
                cons = (Cons) cons.cdr;
                ++i;
            }
        }
        catch (ClassCastException e) {
            if (cons.cdr == NIL)
                signal(new TypeError("ELT: invalid index " + index + " for " +
                                     writeToString()));
            else
                signal(new TypeError(this, "proper sequence"));
            // Not reached.
            return NIL;
        }
    }

    public final LispObject nreverse() throws ConditionThrowable
    {
        // Following code is adapted from CLISP.
        if (cdr instanceof Cons) {
            Cons cons = (Cons) cdr;
            if (cons.cdr instanceof Cons) {
                Cons cons1 = cons;
                LispObject list = NIL;
                do {
                    Cons h = (Cons) cons.cdr;
                    cons.cdr = list;
                    list = cons;
                    cons = h;
                } while (cons.cdr instanceof Cons);
                cdr = list;
                cons1.cdr = cons;
            }
            LispObject h = car;
            car = cons.car;
            cons.car = h;
        }
        return this;
    }

    public final boolean listp()
    {
        return true;
    }

    public final LispObject LISTP()
    {
        return T;
    }

    public final boolean endp()
    {
        return false;
    }

    public final LispObject ENDP()
    {
        return NIL;
    }

    public final LispObject[] copyToArray() throws ConditionThrowable
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

    public String writeToString() throws ConditionThrowable
    {
        final LispObject printLength = _PRINT_LENGTH_.symbolValue();
        final int limit;
        if (printLength instanceof Fixnum)
            limit = ((Fixnum)printLength).value;
        else
            limit = Integer.MAX_VALUE;
        StringBuffer sb = new StringBuffer();
        if (car == Symbol.QUOTE) {
            if (cdr instanceof Cons) {
                // Not a dotted list.
                if (cdr.cdr() == NIL) {
                    sb.append('\'');
                    sb.append(cdr.car().writeToString());
                    return sb.toString();
                }
            }
        }
        if (car == Symbol.FUNCTION) {
            if (cdr instanceof Cons) {
                // Not a dotted list.
                if (cdr.cdr() == NIL) {
                    sb.append("#'");
                    sb.append(cdr.car().writeToString());
                    return sb.toString();
                }
            }
        }
        int count = 0;
        boolean truncated = false;
        sb.append('(');
        if (count < limit) {
            LispObject p = this;
            sb.append(p.car().writeToString());
            ++count;
            while ((p = p.cdr()) instanceof Cons) {
                if (count < limit) {
                    sb.append(' ');
                    sb.append(p.car().writeToString());
                    ++count;
                } else {
                    truncated = true;
                    break;
                }
            }
            if (!truncated && p != NIL) {
                sb.append(" . ");
                sb.append(p.writeToString());
            }
        } else
            truncated = true;
        if (truncated)
            sb.append(" ...");
        sb.append(')');
        return sb.toString();
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
