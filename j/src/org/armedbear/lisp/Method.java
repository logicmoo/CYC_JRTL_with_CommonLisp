/*
 * Method.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: Method.java,v 1.2 2004-10-11 19:06:40 piso Exp $
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

public final class Method extends StandardObject
{
    private LispObject genericFunction;
    private LispObject function;

    public Method(LispClass cls, SimpleVector slots)
    {
        super(cls, slots);
    }

    public LispObject getGenericFunction()
    {
        return genericFunction;
    }

    public void setGenericFunction(LispObject genericFunction)
    {
        this.genericFunction = genericFunction;
    }

    public LispObject getFunction()
    {
        return function;
    }

    public void setFunction(LispObject function)
    {
        this.function = function;
    }

    private static final Primitive1 _METHOD_GENERIC_FUNCTION =
        new Primitive1("%method-generic-function", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((Method)arg).getGenericFunction();
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.METHOD));
            }
        }
    };

    private static final Primitive1 _SET_METHOD_GENERICFUNCTION =
        new Primitive1("%set-method-generic-function", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                ((Method)first).setGenericFunction(second);
                return second;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(first, Symbol.METHOD));
            }
        }
    };

    private static final Primitive1 METHOD_FUNCTION =
        new Primitive1("method-function", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((Method)arg).getFunction();
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.METHOD));
            }
        }
    };

    private static final Primitive1 _SET_METHOD_FUNCTION =
        new Primitive1("%set-method-function", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                ((Method)first).setFunction(second);
                return second;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(first, Symbol.METHOD));
            }
        }
    };
}
