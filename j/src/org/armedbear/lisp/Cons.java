/*
 * Cons.java
 *
 * Copyright (C) 2002-2004 Peter Graves
 * $Id: Cons.java,v 1.52 2004-11-28 15:43:49 piso Exp $
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
        this.cdr = value != null ? value : UNBOUND_VALUE;
        ++count;
    }

    public LispObject typeOf()
    {
        return Symbol.CONS;
    }

    public LispObject classOf()
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

    public final void setCar(LispObject obj)
    {
        car = obj;
    }

    public LispObject RPLACA(LispObject obj) throws ConditionThrowable
    {
        car = obj;
        return this;
    }

    public LispObject _RPLACA(LispObject obj) throws ConditionThrowable
    {
        car = obj;
        return obj;
    }

    public final void setCdr(LispObject obj)
    {
        cdr = obj;
    }

    public LispObject RPLACD(LispObject obj) throws ConditionThrowable
    {
        cdr = obj;
        return this;
    }

    public LispObject _RPLACD(LispObject obj) throws ConditionThrowable
    {
        cdr = obj;
        return obj;
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

    public final int sxhash()
    {
        return computeHash(this, 4);
    }

    private static final int computeHash(LispObject obj, int depth)
    {
        if (obj instanceof Cons) {
            if (depth > 0) {
                int n1 = computeHash(((Cons)obj).car, depth - 1);
                int n2 = computeHash(((Cons)obj).cdr, depth - 1);
                return n1 ^ n2;
            } else {
                // This number comes from SBCL, but since we're not really
                // using SBCL's SXHASH algorithm, it's probably not optimal.
                // But who knows?
                return 261835505;
            }
        } else
            return obj.sxhash();
    }

    public final int psxhash() //throws ConditionThrowable
    {
        return computeEqualpHash(this, 4);
    }

    private static final int computeEqualpHash(LispObject obj, int depth)
    {
        if (obj instanceof Cons) {
            if (depth > 0) {
                int n1 = computeEqualpHash(((Cons)obj).car, depth - 1);
                int n2 = computeEqualpHash(((Cons)obj).cdr, depth - 1);
                return n1 ^ n2;
            } else
                return 261835505; // See above.
        } else
            return obj.psxhash();
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
            signal(new TypeError(obj, Symbol.LIST));
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

    public LispObject execute(LispObject[] args) throws ConditionThrowable
    {
        if (car == Symbol.LAMBDA) {
            Closure closure = new Closure(cdr.car(), cdr.cdr(),
                                          new Environment());
            return closure.execute(args);
        }
        return signal(new TypeError(this, list3(Symbol.OR, Symbol.FUNCTION,
                                                Symbol.SYMBOL)));
    }

    public LispObject execute() throws ConditionThrowable
    {
        if (car == Symbol.LAMBDA) {
            Closure closure = new Closure(cdr.car(), cdr.cdr(),
                                          new Environment());
            return closure.execute();
        }
        return signal(new TypeError(this, list3(Symbol.OR, Symbol.FUNCTION,
                                                Symbol.SYMBOL)));
    }

    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
        if (car == Symbol.LAMBDA) {
            Closure closure = new Closure(cdr.car(), cdr.cdr(),
                                          new Environment());
            return closure.execute(arg);
        }
        return signal(new TypeError(this, list3(Symbol.OR, Symbol.FUNCTION,
                                                Symbol.SYMBOL)));
    }

    public LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
        if (car == Symbol.LAMBDA) {
            Closure closure = new Closure(cdr.car(), cdr.cdr(),
                                          new Environment());
            return closure.execute(first, second);
        }
        return signal(new TypeError(this, list3(Symbol.OR, Symbol.FUNCTION,
                                                Symbol.SYMBOL)));
    }

    public LispObject execute(LispObject first, LispObject second,
                              LispObject third)
        throws ConditionThrowable
    {
        if (car == Symbol.LAMBDA) {
            Closure closure = new Closure(cdr.car(), cdr.cdr(),
                                          new Environment());
            return closure.execute(first, second, third);
        }
        return signal(new TypeError(this, list3(Symbol.OR, Symbol.FUNCTION,
                                                Symbol.SYMBOL)));
    }

    public LispObject execute(LispObject first, LispObject second,
                              LispObject third, LispObject fourth)
        throws ConditionThrowable
    {
        if (car == Symbol.LAMBDA) {
            Closure closure = new Closure(cdr.car(), cdr.cdr(),
                                          new Environment());
            return closure.execute(first, second, third, fourth);
        }
        return signal(new TypeError(this, list3(Symbol.OR, Symbol.FUNCTION,
                                                Symbol.SYMBOL)));
    }

    public String writeToString() throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        final LispObject printLength = _PRINT_LENGTH_.symbolValue(thread);
        final int maxLength;
        if (printLength instanceof Fixnum)
            maxLength = ((Fixnum)printLength).value;
        else
            maxLength = Integer.MAX_VALUE;
        final LispObject printLevel = _PRINT_LEVEL_.symbolValue(thread);
        final int maxLevel;
        if (printLevel instanceof Fixnum)
            maxLevel = ((Fixnum)printLevel).value;
        else
            maxLevel = Integer.MAX_VALUE;
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
        LispObject currentPrintLevel =
            _CURRENT_PRINT_LEVEL_.symbolValue(thread);
        int currentLevel = Fixnum.getValue(currentPrintLevel);
        if (currentLevel < maxLevel) {
            Binding lastSpecialBinding = thread.lastSpecialBinding;
            thread.bindSpecial(_CURRENT_PRINT_LEVEL_, currentPrintLevel.incr());
            try {
                int count = 0;
                boolean truncated = false;
                sb.append('(');
                if (count < maxLength) {
                    LispObject p = this;
                    sb.append(p.car().writeToString());
                    ++count;
                    while ((p = p.cdr()) instanceof Cons) {
                        sb.append(' ');
                        if (count < maxLength) {
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
                    sb.append("...");
                sb.append(')');
            }
            finally {
                thread.lastSpecialBinding = lastSpecialBinding;
            }
        } else
            sb.append('#');
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
