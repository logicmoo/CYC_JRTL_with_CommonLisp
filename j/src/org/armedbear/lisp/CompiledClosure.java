/*
 * CompiledClosure.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: CompiledClosure.java,v 1.1 2004-07-11 12:39:57 piso Exp $
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

public class CompiledClosure extends Function
{
    private final ClosureTemplateFunction ctf;
    private final LispObject[] context;

    public CompiledClosure(ClosureTemplateFunction ctf, LispObject[] context)
    {
        this.ctf = ctf;
        this.context = context;
    }

    protected final LispObject[] processArgs(LispObject[] args, int extra)
        throws ConditionThrowable
    {
        return ctf.processArgs(args, extra);
    }

    public LispObject execute() throws ConditionThrowable
    {
        LispObject[] args = new LispObject[0];
        return ctf.execute(args, context);
    }

    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
        LispObject[] args = new LispObject[1];
        args[0] = arg;
        return ctf.execute(args, context);
    }

    public LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
        LispObject[] args = new LispObject[2];
        args[0] = first;
        args[1] = second;
        return ctf.execute(args, context);
    }

    public LispObject execute(LispObject first, LispObject second,
                              LispObject third)
        throws ConditionThrowable
    {
        LispObject[] args = new LispObject[3];
        args[0] = first;
        args[1] = second;
        args[2] = third;
        return ctf.execute(args, context);
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
        return ctf.execute(args, context);
    }

    public LispObject execute(LispObject[] args) throws ConditionThrowable
    {
        return ctf.execute(args, context);
    }
}
