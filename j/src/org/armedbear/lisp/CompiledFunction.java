/*
 * CompiledFunction.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: CompiledFunction.java,v 1.6 2003-08-07 16:30:46 piso Exp $
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

public class CompiledFunction extends Closure
{
    public CompiledFunction(String name, LispObject lambdaList,
                            LispObject body, Environment env)
        throws LispError
    {
        super(name, lambdaList, body, env);
    }

    public final int getType()
    {
        return TYPE_COMPILED_FUNCTION;
    }

    public LispObject typep(LispObject typeSpecifier) throws LispError
    {
        if (typeSpecifier == Symbol.COMPILED_FUNCTION)
            return T;
        return super.typep(typeSpecifier);
    }

    public LispObject execute(LispObject arg) throws Condition
    {
        LispObject[] args = new LispObject[1];
        args[0] = arg;
        return execute(args);
    }

    public LispObject execute(LispObject first, LispObject second)
        throws Condition
    {
        LispObject[] args = new LispObject[2];
        args[0] = first;
        args[1] = second;
        return execute(args);
    }

    public LispObject execute(LispObject first, LispObject second,
                              LispObject third)
        throws Condition
    {
        LispObject[] args = new LispObject[3];
        args[0] = first;
        args[1] = second;
        args[2] = third;
        return execute(args);
    }

    public LispObject execute(LispObject[] args) throws Condition
    {
        throw new LispError("not implemented");
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("#<COMPILED-FUNCTION @ ");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(">");
        return sb.toString();
    }

    // ### make-compiled-function
    // make-compiled-function name lambda-list body => object
    private static final Primitive3 MAKE_COMPILED_FUNCTION =
        new Primitive3("make-compiled-function", PACKAGE_SYS, false) {
        public LispObject execute(LispObject first, LispObject second,
                                  LispObject third)
            throws LispError
        {
            String name;
            if (first == NIL)
                name = null;
            else
                name = LispString.getValue(first);
            LispObject lambdaList = second;
            LispObject body = third;
            return new CompiledFunction(name, lambdaList, body,
                                        new Environment());
        }
    };

    private static final Primitive1 LOAD_COMPILED_FUNCTION =
        new Primitive1("load-compiled-function", PACKAGE_SYS, false) {
        public LispObject execute(LispObject arg) throws LispError
        {
            String className = ((LispString)arg).getValue();
            if (className.endsWith(".class")) {
                try {
                    JavaClassLoader loader = new JavaClassLoader();
                    Class c = loader.loadClassFromFile(className);
                    if (c != null) {
                        Class[] parameterTypes = new Class[0];
                        java.lang.reflect.Constructor constructor =
                            c.getConstructor(parameterTypes);
                        Object[] initargs = new Object[0];
                        LispObject obj =
                            (LispObject) constructor.newInstance(initargs);
                        return obj;
                    }
                }
                catch (Throwable t) {
                    Debug.trace(t);
                }
            }
            throw new LispError("unable to load ".concat(className));
        }
    };

    private static final Primitive1 VARLIST =
        new Primitive1("varlist", PACKAGE_SYS, false) {
        public LispObject execute(LispObject arg) throws LispError {
            if (arg instanceof CompiledFunction)
                return ((CompiledFunction)arg).getVariableList();
            throw new TypeError(arg, "compiled function");
        }
    };
}
