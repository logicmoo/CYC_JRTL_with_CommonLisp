/*
 * Primitive2.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Primitive2.java,v 1.11 2003-12-20 09:01:10 asimon Exp $
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

public class Primitive2 extends Function
{
    public Primitive2()
    {
    }

    public Primitive2(String name)
    {
        super(name);
    }

    public Primitive2(String name, String arglist)
    {
        super(name,arglist);
    }

    public Primitive2(String name, Package pkg)
    {
        super(name, pkg);
    }

    public Primitive2(String name, Package pkg, boolean exported)
    {
        super(name, pkg, exported);
    }

    public Primitive2(String name, Package pkg, boolean exported,
                     String arglist)
    {
        super(name, pkg, exported, arglist);
    }

    public LispObject execute() throws ConditionThrowable
    {
        return signal(new WrongNumberOfArgumentsException(this));
    }

    public LispObject execute(LispObject first)
        throws ConditionThrowable
    {
        return signal(new WrongNumberOfArgumentsException(this));
    }

    public LispObject execute(LispObject first, LispObject second,
        LispObject third) throws ConditionThrowable
    {
        return signal(new WrongNumberOfArgumentsException(this));
    }

    public LispObject execute(LispObject[] args) throws ConditionThrowable
    {
        if (args.length != 2)
            return signal(new WrongNumberOfArgumentsException(this));
        return execute(args[0], args[1]);
    }
}
