/*
 * Primitive3.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Primitive3.java,v 1.5 2003-07-02 15:24:25 piso Exp $
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

public class Primitive3 extends Function
{
    public Primitive3()
    {
    }

    public Primitive3(String name)
    {
        super(name);
    }

    public Primitive3(String name, Package pkg)
    {
        super(name, pkg);
    }

    public Primitive3(String name, Package pkg, boolean exported)
    {
        super(name, pkg, exported);
    }

    public Primitive3(Module module, String name, int index)
    {
        super(module, name, index);
    }

    public final int getType()
    {
        return TYPE_PRIMITIVE3;
    }

    public LispObject execute() throws Condition
    {
        throw new WrongNumberOfArgumentsException(this);
    }

    public LispObject execute(LispObject first)
        throws Condition
    {
        throw new WrongNumberOfArgumentsException(this);
    }

    public LispObject execute(LispObject first, LispObject second)
        throws Condition
    {
        throw new WrongNumberOfArgumentsException(this);
    }

    public LispObject execute(LispObject[] args) throws Condition
    {
        if (args.length != 3)
            throw new WrongNumberOfArgumentsException(this);
        return execute(args[0], args[1], args[2]);
    }
}
