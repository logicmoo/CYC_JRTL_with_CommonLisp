/*
 * Primitive1.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Primitive1.java,v 1.9 2003-12-08 05:06:10 piso Exp $
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

public class Primitive1 extends Function
{
    public Primitive1()
    {
    }

    public Primitive1(String name)
    {
        super(name);
    }

    public Primitive1(String name, Package pkg)
    {
        super(name, pkg);
    }

    public Primitive1(String name, Package pkg, boolean exported)
    {
        super(name, pkg, exported);
    }

    public Primitive1(String name, Package pkg, boolean exported,
                      String arglist, String docstring)
    {
        super(name, pkg, exported, arglist, docstring);
    }

    public LispObject execute() throws ConditionThrowable
    {
        throw new ConditionThrowable(new WrongNumberOfArgumentsException(this));
    }

    public LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
        throw new ConditionThrowable(new WrongNumberOfArgumentsException(this));
    }

    public LispObject execute(LispObject first, LispObject second,
        LispObject third) throws ConditionThrowable
    {
        throw new ConditionThrowable(new WrongNumberOfArgumentsException(this));
    }

    public LispObject execute(LispObject[] args) throws ConditionThrowable
    {
        if (args.length != 1)
            throw new ConditionThrowable(new WrongNumberOfArgumentsException(this));
        return execute(args[0]);
    }
}
