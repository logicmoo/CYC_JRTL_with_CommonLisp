/*
 * GenericFunction.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: GenericFunction.java,v 1.1 2003-10-12 16:11:51 piso Exp $
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

    private static final Primitive1 GENERIC_FUNCTION_DISCRIMINATING_FUNCTION =
        new Primitive1("generic-function-discriminating-function", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof GenericFunction)
                return ((GenericFunction)arg).getDiscriminatingFunction();
            throw new ConditionThrowable(new TypeError(arg, "generic function"));
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
            throw new ConditionThrowable(new TypeError(first, "generic function"));
        }
    };
}
