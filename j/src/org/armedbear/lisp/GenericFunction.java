/*
 * GenericFunction.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: GenericFunction.java,v 1.13 2004-10-11 18:03:59 piso Exp $
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
    private LispObject name;
    private LispObject discriminatingFunction;
    private LispObject methods;
    private LispObject requiredArgs;

    public GenericFunction(LispClass cls, SimpleVector slots)
    {
        super(cls, slots);
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.COMPILED_FUNCTION) {
            if (discriminatingFunction != null)
                return discriminatingFunction.typep(type);
            else
                return NIL;
        }
        return super.typep(type);
    }

    public LispObject getGenericFunctionName()
    {
        return name;
    }

    public void setGenericFunctionName(LispObject name)
    {
        this.name = name;
    }

    public LispObject getDiscriminatingFunction()
    {
        return discriminatingFunction;
    }

    public void setDiscriminatingFunction(LispObject function)
    {
        discriminatingFunction = function;
    }

    public LispObject getMethods()
    {
        return methods;
    }

    public void setMethods(LispObject methods)
    {
        this.methods = methods;
    }

    public LispObject getRequiredArgs()
    {
        return requiredArgs;
    }

    public void setRequiredArgs(LispObject requiredArgs)
    {
        this.requiredArgs = requiredArgs;
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
                              LispObject third)
        throws ConditionThrowable
    {
        LispObject[] args = new LispObject[3];
        args[0] = first;
        args[1] = second;
        args[2] = third;
        return execute(args);
    }

    public LispObject execute(LispObject first, LispObject second,
                              LispObject third, LispObject fourth)
        throws ConditionThrowable
    {
        LispObject[] args = new LispObject[4];
        args[0] = first;
        args[1] = second;
        args[2] = third;
        args[3] = fourth;
        return execute(args);
    }

    public LispObject execute(LispObject[] args) throws ConditionThrowable
    {
        return funcall(getDiscriminatingFunction(), args, LispThread.currentThread());
    }

    public String writeToString() throws ConditionThrowable
    {
        LispObject slots = getSlots();
        if (slots instanceof AbstractVector) {
            AbstractVector v = (AbstractVector) slots;
            if (v.length() > 0) {
                LispObject name = v.getRowMajor(0);
                if (name != null) {
                    StringBuffer sb = new StringBuffer("#<");
                    sb.append(getLispClass().getSymbol().writeToString());
                    sb.append(' ');
                    sb.append(name.writeToString());
                    sb.append('>');
                    return sb.toString();
                }
            }
        }
        return super.writeToString();
    }

    // Profiling.
    private int callCount;

    public final int getCallCount()
    {
        return callCount;
    }

    public void setCallCount(int n)
    {
        callCount = n;
    }

    public final void incrementCallCount()
    {
        ++callCount;
    }

    private static final Primitive _GENERIC_FUNCTION_NAME =
        new Primitive("%generic-function-name", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((GenericFunction)arg).getGenericFunctionName();
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.GENERIC_FUNCTION));
            }
        }
    };

    private static final Primitive _SET_GENERIC_FUNCTION_NAME =
        new Primitive("%set-generic-function-name", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                ((GenericFunction)first).setGenericFunctionName(second);
                return second;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(first, Symbol.GENERIC_FUNCTION));
            }
        }
    };

    private static final Primitive GENERIC_FUNCTION_DISCRIMINATING_FUNCTION =
        new Primitive("generic-function-discriminating-function", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof GenericFunction)
                return ((GenericFunction)arg).getDiscriminatingFunction();
            return signal(new TypeError(arg, Symbol.GENERIC_FUNCTION));
        }
    };

    private static final Primitive _SET_GENERIC_FUNCTION_DISCRIMINATING_FUNCTION =
        new Primitive("%set-generic-function-discriminating-function", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            if (first instanceof GenericFunction) {
                ((GenericFunction)first).setDiscriminatingFunction(second);
                return second;
            }
            return signal(new TypeError(first, Symbol.GENERIC_FUNCTION));
        }
    };

    private static final Primitive GENERIC_FUNCTION_METHODS =
        new Primitive("generic-function-methods", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((GenericFunction)arg).getMethods();
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.GENERIC_FUNCTION));
            }
        }
    };

    private static final Primitive _SET_GENERIC_FUNCTION_METHODS =
        new Primitive("%set-generic-function-methods", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                ((GenericFunction)first).setMethods(second);
                return second;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(first, Symbol.GENERIC_FUNCTION));
            }
        }
    };

    private static final Primitive GF_REQUIRED_ARGS =
        new Primitive("gf-required-args", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((GenericFunction)arg).getRequiredArgs();
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.GENERIC_FUNCTION));
            }
        }
    };

    private static final Primitive _SET_GF_REQUIRED_ARGS =
        new Primitive("%set-gf-required-args", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                ((GenericFunction)first).setRequiredArgs(second);
                return second;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(first, Symbol.GENERIC_FUNCTION));
            }
        }
    };
}
