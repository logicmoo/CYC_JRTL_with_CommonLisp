/*
 * define_condition.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: define_condition.java,v 1.1 2003-09-20 16:56:02 piso Exp $
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

public final class define_condition extends Primitive
{
    private define_condition(String name, Package pkg, boolean exported)
    {
        super(name, pkg, exported);
    }

    public LispObject execute(LispObject[] args) throws ConditionThrowable
    {
        if (args.length < 1)
            throw new ConditionThrowable(new WrongNumberOfArgumentsException(this));
        return NIL;
    }

    private static final define_condition DEFINE_CONDITION =
        new define_condition("%define-condition", PACKAGE_SYS, false);
}
