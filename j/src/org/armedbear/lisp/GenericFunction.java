/*
 * GenericFunction.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: GenericFunction.java,v 1.20 2005-04-29 23:30:49 piso Exp $
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
    private LispObject lambdaList;
    private LispObject discriminatingFunction;
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

//     public LispObject getDiscriminatingFunction()
//     {
//         return discriminatingFunction;
//     }

//     public void setDiscriminatingFunction(LispObject function)
//     {
//         discriminatingFunction = function;
//     }

//     public LispObject getRequiredArgs()
//     {
//         return requiredArgs;
//     }

//     public void setRequiredArgs(LispObject requiredArgs)
//     {
//         this.requiredArgs = requiredArgs;
//     }

    public LispObject execute() throws ConditionThrowable
    {
//         return LispThread.currentThread().execute(discriminatingFunction);
        return discriminatingFunction.execute();
    }

    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
//         return LispThread.currentThread().execute(discriminatingFunction,
//                                                   arg);
        return discriminatingFunction.execute(arg);
    }

    public LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
//         return LispThread.currentThread().execute(discriminatingFunction,
//                                                   first, second);
        return discriminatingFunction.execute(first, second);
    }

    public LispObject execute(LispObject first, LispObject second,
                              LispObject third)
        throws ConditionThrowable
    {
//         return LispThread.currentThread().execute(discriminatingFunction,
//                                                   first, second, third);
        return discriminatingFunction.execute(first, second, third);
    }

    public LispObject execute(LispObject first, LispObject second,
                              LispObject third, LispObject fourth)
        throws ConditionThrowable
    {
//         return LispThread.currentThread().execute(discriminatingFunction,
//                                                   first, second, third, fourth);
        return discriminatingFunction.execute(first, second, third, fourth);
    }

    public LispObject execute(LispObject first, LispObject second,
                              LispObject third, LispObject fourth,
                              LispObject fifth)
        throws ConditionThrowable
    {
//         return LispThread.currentThread().execute(discriminatingFunction,
//                                                   first, second, third, fourth,
//                                                   fifth);
        return discriminatingFunction.execute(first, second, third, fourth,
                                              fifth);
    }

    public LispObject execute(LispObject first, LispObject second,
                              LispObject third, LispObject fourth,
                              LispObject fifth, LispObject sixth)
        throws ConditionThrowable
    {
//         return LispThread.currentThread().execute(discriminatingFunction,
//                                                   first, second, third, fourth,
//                                                   fifth, sixth);
        return discriminatingFunction.execute(first, second, third, fourth,
                                              fifth, sixth);
    }

    public LispObject execute(LispObject[] args) throws ConditionThrowable
    {
//         return LispThread.currentThread().execute(discriminatingFunction,
//                                                   args);
        return discriminatingFunction.execute(args);
    }

    public String writeToString() throws ConditionThrowable
    {
        LispObject name = getGenericFunctionName();
        if (name != null) {
            StringBuffer sb = new StringBuffer("#<");
            sb.append(getLispClass().getSymbol().writeToString());
            sb.append(' ');
            sb.append(name.writeToString());
            sb.append('>');
            return sb.toString();
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

    // ### %generic-function-lambda-list
    private static final Primitive _GENERIC_FUNCTION_LAMBDA_LIST =
        new Primitive("%generic-function-lambda-list", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((GenericFunction)arg).lambdaList;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.GENERIC_FUNCTION));
            }
        }
    };

    // ### %set-generic-function-lambdaList
    private static final Primitive _SET_GENERIC_FUNCTION_LAMBDA_LIST =
        new Primitive("%set-generic-function-lambda-list", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                ((GenericFunction)first).lambdaList = second;
                return second;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(first, Symbol.GENERIC_FUNCTION));
            }
        }
    };

    // ### %generic-function-name
    private static final Primitive _GENERIC_FUNCTION_NAME =
        new Primitive("%generic-function-name", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((GenericFunction)arg).name;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.GENERIC_FUNCTION));
            }
        }
    };

    // ### %set-generic-function-name
    private static final Primitive _SET_GENERIC_FUNCTION_NAME =
        new Primitive("%set-generic-function-name", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                ((GenericFunction)first).name = second;
                return second;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(first, Symbol.GENERIC_FUNCTION));
            }
        }
    };

    // ### generic-function-discriminating-function
    private static final Primitive GENERIC_FUNCTION_DISCRIMINATING_FUNCTION =
        new Primitive("generic-function-discriminating-function", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((GenericFunction)arg).discriminatingFunction;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.GENERIC_FUNCTION));
            }
        }
    };

    // ### %set-generic-function-discriminating-function
    private static final Primitive _SET_GENERIC_FUNCTION_DISCRIMINATING_FUNCTION =
        new Primitive("%set-generic-function-discriminating-function", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                ((GenericFunction)first).discriminatingFunction = second;
                return second;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(first, Symbol.GENERIC_FUNCTION));
            }
        }
    };

    // ### gf-required-args
    private static final Primitive GF_REQUIRED_ARGS =
        new Primitive("gf-required-args", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((GenericFunction)arg).requiredArgs;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.GENERIC_FUNCTION));
            }
        }
    };

    // ### %set-gf-required-args
    private static final Primitive _SET_GF_REQUIRED_ARGS =
        new Primitive("%set-gf-required-args", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                ((GenericFunction)first).requiredArgs = second;
                return second;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(first, Symbol.GENERIC_FUNCTION));
            }
        }
    };
}
