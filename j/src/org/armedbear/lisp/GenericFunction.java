/*
 * GenericFunction.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: GenericFunction.java,v 1.4 2003-12-13 00:58:51 piso Exp $
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

public final class GenericFunction extends StandardObject
{
    private LispObject discriminatingFunction;

    public GenericFunction(LispClass cls, LispObject slots)
    {
        super(cls, slots);
    }

    public LispObject getDiscriminatingFunction()
    {
        return discriminatingFunction;
    }

    public void setDiscriminatingFunction(LispObject function)
    {
        discriminatingFunction = function;
    }

    public LispObject execute() throws ConditionThrowable
    {
        LispObject[] args = new LispObject[0];
        return execute(args);
    }

    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
        LispObject[] args = new LispObject[1];
        args[0] = arg;
        return execute(args);
    }

    public LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
        LispObject[] args = new LispObject[2];
        args[0] = first;
        args[1] = second;
        return execute(args);
    }

    public LispObject execute(LispObject first, LispObject second,
                              LispObject third) throws ConditionThrowable
    {
        LispObject[] args = new LispObject[3];
        args[0] = first;
        args[1] = second;
        args[2] = third;
        return execute(args);
    }

    public LispObject execute(LispObject[] args) throws ConditionThrowable
    {
        return funcall(getDiscriminatingFunction(), args, LispThread.currentThread());
    }

    public String toString()
    {
        LispObject slots = getSlots();
        if (slots instanceof AbstractVector) {
            AbstractVector v = (AbstractVector) slots;
            try {
                if (v.length() > 0) {
                    LispObject name = v.get(0);
                    if (name != null) {
                        StringBuffer sb = new StringBuffer("#<");
                        sb.append(String.valueOf(getLispClass().getSymbol()));
                        sb.append(' ');
                        sb.append(String.valueOf(name));
                        sb.append('>');
                        return sb.toString();
                    }
                }
            }
            catch (Throwable t) {
                Debug.trace(t);
            }
        }
        return super.toString();
    }

    private static final Primitive1 GENERIC_FUNCTION_DISCRIMINATING_FUNCTION =
        new Primitive1("generic-function-discriminating-function", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof GenericFunction)
                return ((GenericFunction)arg).getDiscriminatingFunction();
            return signal(new TypeError(arg, "generic function"));
        }
    };

    private static final Primitive1 _SET_GENERIC_FUNCTION_DISCRIMINATING_FUNCTION =
        new Primitive1("%set-generic-function-discriminating-function", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            if (first instanceof GenericFunction) {
                ((GenericFunction)first).setDiscriminatingFunction(second);
                return second;
            }
            return signal(new TypeError(first, "generic function"));
        }
    };
}
