/*
 * LispClass.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: LispClass.java,v 1.20 2003-09-20 18:20:47 piso Exp $
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

import java.util.HashMap;

public class LispClass extends StandardObject
{
    protected static final HashMap map = new HashMap();

    protected final Symbol symbol;

    protected LispClass(Symbol symbol)
    {
        this.symbol = symbol;
    }

    public Symbol getSymbol()
    {
        return symbol;
    }

    public String getName()
    {
        return symbol.getName();
    }

    public LispObject typeOf()
    {
        return Symbol.CLASS;
    }

    public LispClass classOf()
    {
        return BuiltInClass.CLASS;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.CLASS)
            return T;
        if (type == BuiltInClass.CLASS)
            return T;
        return super.typep(type);
    }

    public static LispClass findClass(Symbol symbol)
    {
        return (LispClass) map.get(symbol);
    }

    // ### find-class
    private static final Primitive FIND_CLASS = new Primitive("find-class") {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length < 1)
                throw new ConditionThrowable(new WrongNumberOfArgumentsException(this));
            LispObject obj = (LispObject) map.get(checkSymbol(args[0]));
            return obj != null ? obj : NIL;
        }
    };

    // ### class-name
    private static final Primitive1 CLASS_NAME = new Primitive1("class-name") {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((LispClass)arg).symbol;
            }
            catch (ClassCastException e) {
                throw new ConditionThrowable(new TypeError(arg, "class"));
            }
        }
    };
}
