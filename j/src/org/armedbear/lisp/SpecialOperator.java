/*
 * SpecialOperator.java
 *
 * Copyright (C) 2002-2005 Peter Graves
 * $Id: SpecialOperator.java,v 1.22 2007-02-23 21:17:34 piso Exp $
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

public class SpecialOperator extends Operator
{
    private int callCount;

    public SpecialOperator(Symbol symbol)
    {
        symbol.setSymbolFunction(this);
        setLambdaName(symbol);
    }

    public SpecialOperator(Symbol symbol, String arglist)
    {
        symbol.setSymbolFunction(this);
        setLambdaName(symbol);
        setLambdaList(new SimpleString(arglist));
    }

    public SpecialOperator(String name, Package pkg, boolean exported,
                           String arglist)
    {
        try {
            Symbol symbol;
            if (exported)
                symbol = pkg.internAndExport(name.toUpperCase());
            else
                symbol = pkg.intern(name.toUpperCase());
            symbol.setSymbolFunction(this);
            setLambdaName(symbol);
            setLambdaList(new SimpleString(arglist));
        }
        catch (ConditionThrowable t) {
            Debug.assertTrue(false);
        }
    }

    public LispObject execute() throws ConditionThrowable
    {
        return error(new UndefinedFunction(getLambdaName()));
    }

    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
        return error(new UndefinedFunction(getLambdaName()));
    }

    public LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
        return error(new UndefinedFunction(getLambdaName()));
    }

    public LispObject execute(LispObject first, LispObject second,
                              LispObject third)
        throws ConditionThrowable
    {
        return error(new UndefinedFunction(getLambdaName()));
    }

    public LispObject execute(LispObject first, LispObject second,
                              LispObject third, LispObject fourth)
        throws ConditionThrowable
    {
        return error(new UndefinedFunction(getLambdaName()));
    }

    public LispObject execute(LispObject first, LispObject second,
                              LispObject third, LispObject fourth,
                              LispObject fifth)
        throws ConditionThrowable
    {
        return error(new UndefinedFunction(getLambdaName()));
    }

    public LispObject execute(LispObject first, LispObject second,
                              LispObject third, LispObject fourth,
                              LispObject fifth, LispObject sixth)
        throws ConditionThrowable
    {
        return error(new UndefinedFunction(getLambdaName()));
    }

    public LispObject execute(LispObject first, LispObject second,
                              LispObject third, LispObject fourth,
                              LispObject fifth, LispObject sixth,
                              LispObject seventh)
        throws ConditionThrowable
    {
        return error(new UndefinedFunction(getLambdaName()));
    }

    public LispObject execute(LispObject first, LispObject second,
                              LispObject third, LispObject fourth,
                              LispObject fifth, LispObject sixth,
                              LispObject seventh, LispObject eighth)
        throws ConditionThrowable
    {
        return error(new UndefinedFunction(getLambdaName()));
    }

    public LispObject execute(LispObject[] args) throws ConditionThrowable
    {
        return error(new UndefinedFunction(getLambdaName()));
    }

    public String writeToString() throws ConditionThrowable
    {
        StringBuffer sb = new StringBuffer("#<SPECIAL-OPERATOR ");
        sb.append(lambdaName.writeToString());
        sb.append(">");
        return sb.toString();
    }

    // Profiling.
    public final int getCallCount()
    {
        return callCount;
    }

    public final void setCallCount(int n)
    {
        callCount = n;
    }

    public final void incrementCallCount()
    {
        ++callCount;
    }
}
