/*
 * LispClass.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: LispClass.java,v 1.15 2003-09-19 11:50:18 piso Exp $
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

    private final Symbol symbol;

    private LispClass(Symbol symbol)
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
        return Symbol.BUILT_IN_CLASS;
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("#<BUILT-IN-CLASS ");
        sb.append(symbol.getName());
        sb.append('>');
        return sb.toString();
    }

    private static LispClass addClass(Symbol symbol)
    {
        LispClass c = new LispClass(symbol);
        map.put(symbol, c);
        return c;
    }

    // We can't call this class T!
    public static final LispClass CLASS_T          = addClass(T);

    public static final LispClass ARRAY            = addClass(Symbol.ARRAY);
    public static final LispClass BIGNUM           = addClass(Symbol.BIGNUM);
    public static final LispClass BIT_VECTOR       = addClass(Symbol.BIT_VECTOR);
    public static final LispClass BUILT_IN_CLASS   = addClass(Symbol.BUILT_IN_CLASS);
    public static final LispClass CHARACTER        = addClass(Symbol.CHARACTER);
    public static final LispClass CLASS            = addClass(Symbol.CLASS);
    public static final LispClass COMPLEX          = addClass(Symbol.COMPLEX);
    public static final LispClass CONDITION        = addClass(Symbol.CONDITION);
    public static final LispClass CONS             = addClass(Symbol.CONS);
    public static final LispClass FIXNUM           = addClass(Symbol.FIXNUM);
    public static final LispClass FLOAT            = addClass(Symbol.FLOAT);
    public static final LispClass FUNCTION         = addClass(Symbol.FUNCTION);
    public static final LispClass HASH_TABLE       = addClass(Symbol.HASH_TABLE);
    public static final LispClass INTEGER          = addClass(Symbol.INTEGER);
    public static final LispClass LIST             = addClass(Symbol.LIST);
    public static final LispClass NULL             = addClass(Symbol.NULL);
    public static final LispClass NUMBER           = addClass(Symbol.NUMBER);
    public static final LispClass PACKAGE          = addClass(Symbol.PACKAGE);
    public static final LispClass PATHNAME         = addClass(Symbol.PATHNAME);
    public static final LispClass RANDOM_STATE     = addClass(Symbol.RANDOM_STATE);
    public static final LispClass RATIO            = addClass(Symbol.RATIO);
    public static final LispClass RATIONAL         = addClass(Symbol.RATIONAL);
    public static final LispClass REAL             = addClass(Symbol.REAL);
    public static final LispClass SEQUENCE         = addClass(Symbol.SEQUENCE);
    public static final LispClass STANDARD_CLASS   = addClass(Symbol.STANDARD_CLASS);
    public static final LispClass STANDARD_OBJECT  = addClass(Symbol.STANDARD_OBJECT);
    public static final LispClass STREAM           = addClass(Symbol.STREAM);
    public static final LispClass STRING           = addClass(Symbol.STRING);
    public static final LispClass STRING_STREAM    = addClass(Symbol.STRING_STREAM);
    public static final LispClass STRUCTURE_CLASS  = addClass(Symbol.STRUCTURE_CLASS);
    public static final LispClass STRUCTURE_OBJECT = addClass(Symbol.STRUCTURE_OBJECT);
    public static final LispClass SYMBOL           = addClass(Symbol.SYMBOL);
    public static final LispClass TWO_WAY_STREAM   = addClass(Symbol.TWO_WAY_STREAM);
    public static final LispClass VECTOR           = addClass(Symbol.VECTOR);

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
