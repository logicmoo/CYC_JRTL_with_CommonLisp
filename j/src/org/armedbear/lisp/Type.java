/*
 * Type.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: Type.java,v 1.21 2003-09-17 18:26:06 piso Exp $
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

import java.util.ArrayList;
import java.util.HashMap;

public class Type extends LispObject
{
    private static final HashMap map = new HashMap();

    private final ArrayList supertypes = new ArrayList();

    private final Symbol symbol;

    private Type(Symbol symbol)
    {
        this.symbol = symbol;
        synchronized (map) {
            map.put(symbol, this);
        }
    }

    private Type(Symbol symbol, Type supertype)
    {
        this.symbol = symbol;
        synchronized (map) {
            map.put(symbol, this);
        }
        synchronized (supertypes) {
            supertypes.add(supertype);
        }
    }

    private Type(Symbol symbol, Type supertype1, Type supertype2)
    {
        this.symbol = symbol;
        synchronized (map) {
            map.put(symbol, this);
        }
        synchronized (supertypes) {
            supertypes.add(supertype1);
            supertypes.add(supertype2);
        }
    }

    private void addSupertype(Type supertype)
    {
        synchronized (supertypes) {
            supertypes.add(supertype);
        }
    }

    public static final Type findType(LispClass c)
    {
        synchronized (map) {
            return (Type) map.get(c.getSymbol());
        }
    }

    public static final Type getInstance(LispObject typeSpecifier)
        throws TypeError
    {
        if (typeSpecifier instanceof Symbol) {
            synchronized (map) {
                Type type = (Type) map.get(typeSpecifier);
                if (type != null)
                    return type;
            }
        } else if (typeSpecifier instanceof LispClass) {
            Symbol symbol = ((LispClass)typeSpecifier).getSymbol();
            synchronized (map) {
                Type type = (Type) map.get(symbol);
                if (type != null)
                    return type;
            }
        }
        throw new TypeError(typeSpecifier);
    }

//     public boolean _isSubtypeOf(Type otherType)
//     {
//         if (otherType == this)
//             return true;
//         for (int i = 0; i < supertypes.size(); i++) {
//             if (supertypes.get(i) == otherType)
//                 return true;
//         }
//         for (int i = 0; i < supertypes.size(); i++) {
//             Type supertype = (Type) supertypes.get(i);
//             // Avoid loops!
//             if (supertype._isSubtypeOf(this))
//                 continue;
//             if (supertype._isSubtypeOf(otherType))
//                 return true;
//         }
//         return false;
//     }

    public String toString()
    {
        if (symbol != null)
            return symbol.getName();
        return "unknown type";
    }

    public static final Type TYPE_T    = new Type(Symbol.T);

    public static final Type TYPE_NIL  = new Type((Symbol)NIL) {
//         public boolean _isSubtypeOf(Type otherType)
//         {
//             return true;
//         }
    };

    public static final Type ATOM      = new Type(Symbol.ATOM, TYPE_T);
    public static final Type SYMBOL    = new Type(Symbol.SYMBOL, TYPE_T, ATOM);
    public static final Type SEQUENCE  = new Type(Symbol.SEQUENCE, TYPE_T);
    public static final Type ARRAY     = new Type(Symbol.ARRAY, TYPE_T);
    public static final Type CHARACTER = new Type(Symbol.CHARACTER, TYPE_T, ATOM);
    public static final Type NUMBER    = new Type(Symbol.NUMBER, TYPE_T, ATOM);
    public static final Type STREAM    = new Type(Symbol.STREAM, TYPE_T);
    public static final Type CONDITION = new Type(Symbol.CONDITION, TYPE_T);
    public static final Type FUNCTION  = new Type(Symbol.FUNCTION, TYPE_T);
    public static final Type STANDARD_OBJECT =
        new Type(Symbol.STANDARD_OBJECT, TYPE_T);

    // Subtypes of SYMBOL
    public static final Type BOOLEAN   = new Type(Symbol.BOOLEAN, SYMBOL);
    public static final Type KEYWORD   = new Type(Symbol.KEYWORD, SYMBOL);

    // Subtypes of SEQUENCE
    public static final Type VECTOR    = new Type(Symbol.VECTOR, ARRAY, SEQUENCE);
    public static final Type STRING    = new Type(Symbol.STRING, VECTOR);
    public static final Type LIST      = new Type(Symbol.LIST, SEQUENCE);
    public static final Type CONS      = new Type(Symbol.CONS, LIST);
    public static final Type NULL      = new Type(Symbol.NULL, SYMBOL, LIST);

    // SIMPLE-ARRAY, SIMPLE-VECTOR
    public static final Type SIMPLE_ARRAY =
        new Type(Symbol.SIMPLE_ARRAY, ARRAY);
    public static final Type SIMPLE_VECTOR =
        new Type(Symbol.SIMPLE_VECTOR, VECTOR, SIMPLE_ARRAY);

    // Subtypes of STRING
    public static final Type SIMPLE_STRING =
        new Type(Symbol.SIMPLE_STRING, STRING, SIMPLE_ARRAY);
    public static final Type BASE_STRING =
        new Type(Symbol.BASE_STRING, STRING);
    public static final Type SIMPLE_BASE_STRING =
        new Type(Symbol.SIMPLE_BASE_STRING, SIMPLE_STRING, BASE_STRING);

    public static final Type BIT_VECTOR =
        new Type(Symbol.BIT_VECTOR, VECTOR);
    public static final Type SIMPLE_BIT_VECTOR =
        new Type(Symbol.SIMPLE_BIT_VECTOR, BIT_VECTOR, SIMPLE_ARRAY);

    // Subtypes of CHARACTER
    public static final Type BASE_CHAR = new Type(Symbol.BASE_CHAR, CHARACTER);
    public static final Type EXTENDED_CHAR =
        new Type(Symbol.EXTENDED_CHAR, CHARACTER, TYPE_NIL);
    public static final Type STANDARD_CHAR =
        new Type(Symbol.STANDARD_CHAR, BASE_CHAR);

    static {
        CHARACTER.addSupertype(BASE_CHAR);
    }

    // Subtypes of NUMBER
    public static final Type COMPLEX  = new Type(Symbol.COMPLEX, NUMBER);
    public static final Type REAL     = new Type(Symbol.REAL, NUMBER);
    public static final Type RATIONAL = new Type(Symbol.RATIONAL, REAL);
    public static final Type FLOAT    = new Type(Symbol.FLOAT, REAL);
    public static final Type INTEGER  = new Type(Symbol.INTEGER, RATIONAL);
    public static final Type RATIO    = new Type(Symbol.RATIO, RATIONAL);
    public static final Type BIT      = new Type(Symbol.BIT, INTEGER);
    public static final Type FIXNUM   = new Type(Symbol.FIXNUM, INTEGER);
    public static final Type BIGNUM   = new Type(Symbol.BIGNUM, INTEGER);

    // Subtypes of STREAM
    public static final Type TWO_WAY_STREAM = new Type(Symbol.TWO_WAY_STREAM,
                                                       STREAM);

    // Subtypes of CONDITION.
    public static final Type SERIOUS_CONDITION = new Type(Symbol.SERIOUS_CONDITION,
                                                          CONDITION);
    public static final Type ERROR             = new Type(Symbol.ERROR,
                                                          SERIOUS_CONDITION);
    public static final Type PACKAGE_ERROR     = new Type(Symbol.PACKAGE_ERROR,
                                                          ERROR);
    public static final Type PROGRAM_ERROR     = new Type(Symbol.PROGRAM_ERROR,
                                                          ERROR);
    public static final Type TYPE_ERROR        = new Type(Symbol.TYPE_ERROR,
                                                          ERROR);
}
