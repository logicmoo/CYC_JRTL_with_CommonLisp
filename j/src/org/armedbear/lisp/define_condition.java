/*
 * define_condition.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: define_condition.java,v 1.2 2003-09-21 15:09:05 piso Exp $
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

    // define-condition name (parent-type*) ({slot-spec}*) option* => name
    public LispObject execute(LispObject[] args) throws ConditionThrowable
    {
        if (args.length != 4)
            throw new ConditionThrowable(new WrongNumberOfArgumentsException(this));
        Symbol symbol = checkSymbol(args[0]);
        Debug.trace("symbol = " + symbol);
        LispObject parentTypes = checkCons(args[1]);
        LispObject slotSpecs = args[2];
        LispObject options = args[3];

        StandardClass c = new StandardClass(symbol, parentTypes);
        LispClass.addClass(symbol, c);
        return c;
    }

    private static final define_condition DEFINE_CONDITION =
        new define_condition("%define-condition", PACKAGE_SYS, false);
}
