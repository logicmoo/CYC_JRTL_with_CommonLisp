/*
 * Function.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Function.java,v 1.27 2003-12-09 06:07:05 asimon Exp $
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

public abstract class Function extends Functional
{
    private final String name;
    protected final int index;

    private int callCount;

    private LispObject arglist;

    protected Function()
    {
        name = null;
        index = 0;
    }

    public Function(String name)
    {
        this.name = name != null ? name.toUpperCase() : null;
        index = 0;
        if (name != null)
            setLambdaName(Symbol.addFunction(this.name, this));
    }

    public Function(String name, String arglist)
    {
        this(name);
        this.arglist = new LispString(arglist);
    }

    public Function(String name, Package pkg)
    {
        this(name, pkg, false);
    }

    public Function(String name, Package pkg, boolean exported)
    {
        this(name, pkg, exported, null, null);
    }

    public Function(String name, Package pkg, boolean exported,
                    String arglist, String docstring)
    {
        this.name = name != null ? name.toUpperCase() : null;
        index = 0;
        if (arglist instanceof String)
            this.arglist = new LispString(arglist);
        if (name != null) {
            Symbol symbol = pkg.intern(this.name);
            symbol.setSymbolFunction(this);
            setLambdaName(symbol);
            if (exported) {
                try {
                    pkg.export(symbol);
                }
                catch (ConditionThrowable t) {
                    Debug.assertTrue(false);
                }
            }
            if (docstring != null) {
                try {
                    symbol.setFunctionDocumentation(docstring);
                }
                catch (ConditionThrowable t) {
                    Debug.assertTrue(false);
                }
            }
        }
    }

    public LispObject typeOf()
    {
        return Symbol.FUNCTION;
    }

    public LispClass classOf()
    {
        return BuiltInClass.FUNCTION;
    }

    public LispObject typep(LispObject typeSpecifier) throws ConditionThrowable
    {
        if (typeSpecifier == Symbol.FUNCTION)
            return T;
        if (typeSpecifier == Symbol.COMPILED_FUNCTION)
            return T;
        if (typeSpecifier == BuiltInClass.FUNCTION)
            return T;
        return super.typep(typeSpecifier);
    }

    public final String getName()
    {
        return name;
    }

    public final LispObject getArglist()
    {
        return arglist;
    }

    public final void setArglist(LispObject obj)
    {
        arglist = obj;
    }

    // Primitive
    public LispObject execute(LispObject[] args) throws ConditionThrowable
    {
        throw new ConditionThrowable(new WrongNumberOfArgumentsException(name));
    }

    // Primitive1
    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
        LispObject[] args = new LispObject[1];
        args[0] = arg;
        return execute(args);
    }

    // Primitive2
    public LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
        LispObject[] args = new LispObject[2];
        args[0] = first;
        args[1] = second;
        return execute(args);
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("FUNCTION");
        if (name != null) {
            sb.append(' ');
            sb.append(name);
        }
        return unreadableString(sb.toString());
    }

    // Profiling.
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
}
