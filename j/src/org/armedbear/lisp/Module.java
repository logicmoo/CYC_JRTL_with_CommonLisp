/*
 * Module.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Module.java,v 1.6 2003-09-19 14:44:10 piso Exp $
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

public abstract class Module extends Lisp
{
    protected Module() {}

    public LispObject dispatch(LispObject args, Environment env, int index)
        throws ConditionThrowable
    {
        throw new ConditionThrowable(new LispError());
    }

    public LispObject dispatch(LispObject[] args, int index)
        throws ConditionThrowable
    {
        throw new ConditionThrowable(new LispError());
    }

    public LispObject dispatch(LispObject arg, int index) throws ConditionThrowable
    {
        throw new ConditionThrowable(new LispError());
    }

    public LispObject dispatch(LispObject first, LispObject second, int index)
        throws ConditionThrowable
    {
        throw new ConditionThrowable(new LispError());
    }

    protected void definePrimitive(String name, int index)
    {
        new Primitive(this, name, index);
    }

    protected void definePrimitive1(String name, int index)
    {
        new Primitive1(this, name, index);
    }

    protected void definePrimitive2(String name, int index)
    {
        new Primitive2(this, name, index);
    }

    protected void defineSpecialOperator(String name, int index)
    {
        new SpecialOperator(this, name, index);
    }
}
