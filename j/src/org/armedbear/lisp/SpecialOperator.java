/*
 * SpecialOperator.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: SpecialOperator.java,v 1.6 2003-03-13 18:19:32 piso Exp $
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

public class SpecialOperator extends Functional
{
    private final Module module;
    private final String name;
    private final int index;

    private long callCount;

    public SpecialOperator(String name)
    {
        this.module = null;
        this.name = name.toUpperCase();
        this.index = 0;
        setLambdaName(Symbol.addFunction(this.name, this));
    }

    public SpecialOperator(Module module, String name, int index)
    {
        this.module = module;
        this.name = name.toUpperCase();
        this.index = index;
        setLambdaName(Symbol.addFunction(this.name, this));
    }

    public final int getType()
    {
        return TYPE_SPECIAL_OPERATOR;
    }

    public final String getName()
    {
        return name;
    }

    public LispObject execute(LispObject args, Environment env)
        throws Condition
    {
        return module.dispatch(args, env, index);
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("#<SPECIAL-OPERATOR ");
        sb.append(name);
        sb.append(">");
        return sb.toString();
    }

    // Profiling.
    public final long getCallCount()
    {
        return callCount;
    }

    public final void setCallCount(long l)
    {
        callCount = l;
    }

    public final void incrementCallCount()
    {
        ++callCount;
    }
}
