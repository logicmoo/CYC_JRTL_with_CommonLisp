/*
 * coerce.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: coerce.java,v 1.9 2003-12-09 20:26:23 asimon Exp $
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

public final class coerce extends Lisp
{
    // ### coerce
    // coerce object result-type => result
    private static final Primitive2 COERCE = new Primitive2("coerce","object result-type") {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            if (second == T)
                return first;
            if (first.typep(second) == T)
                return first;
            if (second == Symbol.CHARACTER) {
                if (first instanceof LispString) {
                    if (first.length() == 1)
                        return ((LispString)first).get(0);
                } else if (first instanceof Symbol) {
                    String name = first.getName();
                    if (name.length() == 1)
                        return LispCharacter.getInstance(name.charAt(0));
                }
                throw new ConditionThrowable(new TypeError());
            }
            if (second == Symbol.FLOAT || second == Symbol.SINGLE_FLOAT ||
                second == Symbol.DOUBLE_FLOAT || second == Symbol.SHORT_FLOAT ||
                second == Symbol.LONG_FLOAT) {
                return LispFloat.coerceToFloat(first);
            }
            if (second == Symbol.COMPLEX) {
                if (first.numberp()) {
                    if (first instanceof LispFloat)
                        return Complex.getInstance(first, LispFloat.ZERO);
                    return first;
                }
                throw new ConditionThrowable(new TypeError(first, "number"));
            }
            if (first instanceof AbstractVector) {
                if (second == Symbol.BIT_VECTOR ||
                    second == Symbol.SIMPLE_BIT_VECTOR) {
                    AbstractVector v1 = (AbstractVector) first;
                    BitVector v2 = new BitVector(v1.length());
                    for (int i = v1.length(); i-- > 0;)
                        v2.set(i, v1.get(i));
                    return v2;
                }
                if (second == Symbol.SIMPLE_VECTOR) {
                    AbstractVector v1 = (AbstractVector) first;
                    Vector v2 = new Vector(v1.length());
                    for (int i = v1.length(); i-- > 0;)
                        v2.set(i, v1.get(i));
                    return v2;
                }
                if (second == Symbol.LIST) {
                    AbstractVector v = (AbstractVector) first;
                    LispObject result = NIL;
                    for (int i = first.length(); i-- > 0;)
                        result = new Cons(v.get(i), result);
                    return result;
                }
            } else if (first.listp()) {
                if (second == Symbol.BIT_VECTOR ||
                    second == Symbol.SIMPLE_BIT_VECTOR) {
                    BitVector v = new BitVector(first.length());
                    int i = 0;
                    while (first != NIL) {
                        v.set(i++, first.car());
                        first = first.cdr();
                    }
                    return v;
                }
                if (second == Symbol.VECTOR ||
                    second == Symbol.SIMPLE_VECTOR ||
                    (second instanceof LispClass &&
                        second.getName().equals("VECTOR"))) {
                    Vector v = new Vector(first.length());
                    int i = 0;
                    while (first != NIL) {
                        v.set(i++, first.car());
                        first = first.cdr();
                    }
                    return v;
                }
                if (second == Symbol.STRING ||
                    second == Symbol.SIMPLE_STRING ||
                    second == Symbol.BASE_STRING ||
                    second == Symbol.SIMPLE_BASE_STRING) {
                    LispString string = new LispString(first.length());
                    int i = 0;
                    while (first != NIL) {
                        string.set(i++, first.car());
                        first = first.cdr();
                    }
                    return string;
                }
                if (second == Symbol.FUNCTION) {
                    if (first.car() == Symbol.LAMBDA)
                        return new Closure(first.cadr(), first.cddr(),
                            new Environment());
                }
            } else if (first instanceof Symbol) {
                if (second == Symbol.FUNCTION) {
                    LispObject obj = first.getSymbolFunction();
                    if (obj instanceof Function) {
                        if (obj instanceof SpecialOperator)
                            throw new ConditionThrowable(new TypeError());
                        return obj;
                    }
                }
            }
            throw new ConditionThrowable(new TypeError());
        }
    };
}
