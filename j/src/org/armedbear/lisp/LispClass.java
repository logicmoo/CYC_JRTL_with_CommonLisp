/*
 * LispClass.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: LispClass.java,v 1.21 2003-09-21 15:04:48 piso Exp $
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

    public static void addClass(Symbol symbol, LispClass c)
    {
        synchronized (map) {
            map.put(symbol, c);
        }
    }

    public static LispClass findClass(Symbol symbol)
    {
        synchronized (map) {
            return (LispClass) map.get(symbol);
        }
    }

    protected final Symbol symbol;
    private LispObject directSuperclasses; // A list.

    protected LispClass(Symbol symbol)
    {
        this.symbol = symbol;
        this.directSuperclasses = NIL;
    }

    protected LispClass(Symbol symbol, LispObject directSuperclasses)
    {
        this.symbol = symbol;
        this.directSuperclasses = directSuperclasses;
    }

    public final Symbol getSymbol()
    {
        return symbol;
    }

    public final LispObject getDirectSuperclasses()
    {
        return directSuperclasses;
    }

    public final void setDirectSuperclasses(Cons directSuperclasses)
    {
        this.directSuperclasses = directSuperclasses;
    }

    // When there's only one direct superclass...
    public final void setDirectSuperclass(LispObject superclass)
    {
        directSuperclasses = new Cons(superclass);
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

    private static final Primitive1 CLASS_DIRECT_SUPERCLASSES =
        new Primitive1("class-direct-superclasses", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof LispClass)
                return ((LispClass)arg).getDirectSuperclasses();
            throw new ConditionThrowable(new TypeError(arg, "class"));
        }
    };
}
