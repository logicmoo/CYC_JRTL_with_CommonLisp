/*
 * Function.java
 *
 * Copyright (C) 2002-2005 Peter Graves
 * $Id: Function.java,v 1.44 2005-03-19 20:00:24 piso Exp $
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
    private Symbol symbol;

    private int callCount;

    protected Function()
    {
        symbol = null;
    }

    public Function(String name)
    {
        if (name != null) {
            symbol = Symbol.addFunction(name.toUpperCase(), this);
            if (cold)
                symbol.setBuiltInFunction(true);
            setLambdaName(symbol);
        } else
            symbol = null;
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
        if (arglist instanceof String)
            setArglist(new SimpleString(arglist));
        if (name != null) {
            try {
                if (exported)
                    symbol = pkg.internAndExport(name.toUpperCase());
                else
                    symbol = pkg.intern(name.toUpperCase());
                symbol.setSymbolFunction(this);
                if (cold)
                    symbol.setBuiltInFunction(true);
                setLambdaName(symbol);
                if (docstring != null)
                    symbol.setFunctionDocumentation(docstring);
            }
            catch (ConditionThrowable t) {
                Debug.assertTrue(false);
            }
        }
    }

    public Function(Symbol symbol)
    {
        this.symbol = symbol;
    }

    public LispObject typeOf()
    {
        return Symbol.FUNCTION;
    }

    public LispObject classOf()
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

    public Symbol getSymbol()
    {
        return symbol;
    }

    public final String getName()
    {
        return symbol != null ? symbol.getName() : null;
    }

    public LispObject execute() throws ConditionThrowable
    {
        return signal(new WrongNumberOfArgumentsException(this));
    }

    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
        return signal(new WrongNumberOfArgumentsException(this));
    }

    public LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
        return signal(new WrongNumberOfArgumentsException(this));
    }

    public LispObject execute(LispObject first, LispObject second,
                              LispObject third)
        throws ConditionThrowable
    {
        return signal(new WrongNumberOfArgumentsException(this));
    }

    public LispObject execute(LispObject first, LispObject second,
                              LispObject third, LispObject fourth)
        throws ConditionThrowable
    {
        return signal(new WrongNumberOfArgumentsException(this));
    }

    public LispObject execute(LispObject first, LispObject second,
                              LispObject third, LispObject fourth,
                              LispObject fifth)
        throws ConditionThrowable
    {
        return signal(new WrongNumberOfArgumentsException(this));
    }

    public LispObject execute(LispObject first, LispObject second,
                              LispObject third, LispObject fourth,
                              LispObject fifth, LispObject sixth)
        throws ConditionThrowable
    {
        return signal(new WrongNumberOfArgumentsException(this));
    }

    public LispObject execute(LispObject[] args) throws ConditionThrowable
    {
        return signal(new WrongNumberOfArgumentsException(this));
    }

    public String writeToString() throws ConditionThrowable
    {
        LispObject name = getLambdaName();
        if (name == null)
            name = getSymbol();
        if (name != null) {
            StringBuffer sb = new StringBuffer("#<FUNCTION");
            sb.append(' ');
            sb.append(name.writeToString());
            sb.append(" {");
            sb.append(Integer.toHexString(System.identityHashCode(this)).toUpperCase());
            sb.append("}>");
            return sb.toString();
        } else
            return unreadableString("FUNCTION");
    }

    // Used by the JVM compiler.
    public final void argCountError() throws ConditionThrowable
    {
        signal(new WrongNumberOfArgumentsException(this));
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
