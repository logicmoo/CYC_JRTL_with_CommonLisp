/*
 * LispClass.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: LispClass.java,v 1.5 2003-06-21 03:51:54 piso Exp $
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

public final class LispClass extends LispObject
{
    private static final HashMap map = new HashMap();

    private final String name;

    public LispClass(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("#<BUILT-IN-CLASS ");
        sb.append(name);
        sb.append('>');
        return sb.toString();
    }

    private static LispObject findClass(Symbol symbol)
    {
        LispObject obj = (LispObject) map.get(symbol.getName());
        return obj != null ? obj : NIL;
    }

    private static void addClass(String name)
    {
        map.put(name, new LispClass(name));
    }

    static {
        addClass("ARRAY");
        addClass("BIT-VECTOR");
        addClass("VECTOR");
    }

    // ### find-class
    private static final Primitive FIND_CLASS = new Primitive("find-class") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length < 1)
                throw new WrongNumberOfArgumentsException(this);
            return findClass(checkSymbol(args[0]));
        }
    };

    // ### class-name
    private static final Primitive1 CLASS_NAME = new Primitive1("class-name") {
        public LispObject execute(LispObject arg) throws LispError
        {
            if (arg instanceof LispClass)
                return new LispString(((LispClass)arg).getName());
            throw new TypeError(arg, "class");
        }
    };
}
