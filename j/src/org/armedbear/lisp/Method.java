/*
 * Method.java
 *
 * Copyright (C) 2004-2005 Peter Graves
 * $Id: Method.java,v 1.6 2005-04-05 23:23:05 piso Exp $
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
    private LispObject specializers;

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

    public LispObject getSpecializers()
    {
        return specializers;
    }

    public void setSpecializers(LispObject specializers)
    {
        this.specializers = specializers;
    }

    public String writeToString() throws ConditionThrowable
    {
        if (genericFunction instanceof GenericFunction) {
            LispObject name =
                ((GenericFunction)genericFunction).getGenericFunctionName();
            if (name != null) {
                StringBuffer sb = new StringBuffer();
                sb.append(getLispClass().getSymbol().writeToString());
                sb.append(' ');
                sb.append(name.writeToString());
                if (specializers != null) {
                    LispObject specs = specializers;
                    LispObject names = NIL;
                    while (specs != NIL) {
                        LispObject spec = specs.car();
                        if (spec instanceof LispClass)
                            names = names.push(((LispClass)spec).getSymbol());
                        else
                            names = names.push(spec);
                        specs = specs.cdr();
                    }
                    sb.append(' ');
                    sb.append(names.nreverse().writeToString());
                }
                return unreadableString(sb.toString());
            }
        }
        return super.writeToString();
    }

    private static final Primitive _METHOD_GENERIC_FUNCTION =
        new Primitive("%method-generic-function", PACKAGE_SYS, false)
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

    private static final Primitive _SET_METHOD_GENERICFUNCTION =
        new Primitive("%set-method-generic-function", PACKAGE_SYS, false)
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

    private static final Primitive METHOD_FUNCTION =
        new Primitive("method-function", PACKAGE_SYS, false)
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

    private static final Primitive _SET_METHOD_FUNCTION =
        new Primitive("%set-method-function", PACKAGE_SYS, false)
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

    private static final Primitive _METHOD_SPECIALIZERS =
        new Primitive("%method-specializers", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((Method)arg).getSpecializers();
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.METHOD));
            }
        }
    };

    private static final Primitive _SET_METHOD_SPECIALIZERS =
        new Primitive("%set-method-specializers", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                ((Method)first).setSpecializers(second);
                return second;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(first, Symbol.METHOD));
            }
        }
    };
}
