/*
 * Function.java
 *
 * Copyright (C) 2002-2004 Peter Graves
 * $Id: Function.java,v 1.36 2004-05-05 18:09:08 piso Exp $
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

    private int callCount;

    protected Function()
    {
        name = null;
    }

    public Function(String name)
    {
        this.name = name != null ? name.toUpperCase() : null;
        if (name != null) {
            Symbol symbol = Symbol.addFunction(this.name, this);
            if (cold)
                symbol.setBuiltInFunction(true);
            setLambdaName(symbol);
        }
    }

    public Function(String name, String arglist)
    {
        this(name);
        setArglist(new SimpleString(arglist));
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
                    String arglist)
    {
        this(name, pkg, exported, arglist, null);
    }

    public Function(String name, Package pkg, boolean exported,
                    String arglist, String docstring)
    {
        this.name = name != null ? name.toUpperCase() : null;
        if (arglist instanceof String)
            setArglist(new SimpleString(arglist));
        if (name != null) {
            Symbol symbol = pkg.intern(this.name);
            symbol.setSymbolFunction(this);
            if (cold)
                symbol.setBuiltInFunction(true);
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

    // Primitive0
    public LispObject execute() throws ConditionThrowable
    {
        return signal(new WrongNumberOfArgumentsException(this));
    }

    // Primitive1
    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
        return signal(new WrongNumberOfArgumentsException(this));
    }

    // Primitive2
    public LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
        return signal(new WrongNumberOfArgumentsException(this));
    }

    // Primitive3
    public LispObject execute(LispObject first, LispObject second,
                              LispObject third)
        throws ConditionThrowable
    {
        return signal(new WrongNumberOfArgumentsException(this));
    }

    // Primitive4
    public LispObject execute(LispObject first, LispObject second,
                              LispObject third, LispObject fourth)
        throws ConditionThrowable
    {
        return signal(new WrongNumberOfArgumentsException(this));
    }

    // Primitive
    public LispObject execute(LispObject[] args) throws ConditionThrowable
    {
        return signal(new WrongNumberOfArgumentsException(this));
    }

    public String toString()
    {
        if (name != null) {
            StringBuffer sb = new StringBuffer("#<FUNCTION");
            sb.append(' ');
            sb.append(name);
            sb.append('>');
            return sb.toString();
        }
        return unreadableString("FUNCTION");
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
