/*
 * IntegerTypeSpecifier.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: IntegerTypeSpecifier.java,v 1.1 2003-09-11 14:54:27 piso Exp $
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

public final class IntegerTypeSpecifier extends CompoundTypeSpecifier
{
    // These limits are always inclusive.
    private LispObject lowerLimit;
    private LispObject upperLimit;

    public IntegerTypeSpecifier(Cons args) throws LispError
    {
        Debug.assertTrue(args.car() == Symbol.INTEGER);
        switch (args.length()) {
            case 1:
                lowerLimit = upperLimit = Symbol.UNSPECIFIED;
                break;
            case 2:
                lowerLimit = args.cadr();
                upperLimit = Symbol.UNSPECIFIED;
                break;
            case 3:
                lowerLimit = args.cadr();
                upperLimit = args.cdr().cdr().car();
                break;
            default:
                throw new LispError("bad type specifier: " + args);
        }
        if (lowerLimit != Symbol.UNSPECIFIED) {
            if (lowerLimit instanceof Cons) {
                // Must be a singleton list.
                if (lowerLimit.cdr() != NIL)
                    throw new LispError("bad type specifier: " + args);
                // Make limit inclusive.
                lowerLimit = lowerLimit.car().incr();
            } else if (lowerLimit instanceof Fixnum || lowerLimit instanceof Bignum) {
                ;
            } else
                throw new LispError("bad type specifier: " + args);
        }
        if (upperLimit != Symbol.UNSPECIFIED) {
            if (upperLimit instanceof Cons) {
                // Must be a singleton list.
                if (upperLimit.cdr() != NIL)
                    throw new LispError("bad type specifier: " + args);
                // Make limit inclusive.
                upperLimit = upperLimit.car().decr();
            } else if (upperLimit instanceof Fixnum || upperLimit instanceof Bignum) {
                ;
            } else
                throw new LispError("bad type specifier: " + args);
        }
    }

    public LispObject test(LispObject obj) throws LispError
    {
        if (obj.integerp()) {
            if (lowerLimit != Symbol.UNSPECIFIED) {
                if (obj.isLessThan(lowerLimit))
                    return NIL;
            }
            if (upperLimit != Symbol.UNSPECIFIED) {
                if (obj.isGreaterThan(upperLimit))
                    return NIL;
            }
            return T;
        }
        return NIL;
    }

    public LispObject isSubtypeOf(TypeSpecifier ts) throws LispError
    {
        if (ts instanceof AtomicTypeSpecifier) {
            AtomicTypeSpecifier ats = (AtomicTypeSpecifier) ts;
            Type type = ats.getType();
            if (type == Type.INTEGER)
                return T;
            if (type == Type.FIXNUM) {
                if (lowerLimit.isLessThan(MOST_NEGATIVE_FIXNUM.getSymbolValue()))
                    return values(NIL, NIL);
                if (upperLimit.isGreaterThan(MOST_POSITIVE_FIXNUM.getSymbolValue()))
                    return values(NIL, NIL);
                return values(T, T);
            }
            if (type == Type.BIGNUM) {
                if (upperLimit.isLessThan(MOST_NEGATIVE_FIXNUM.getSymbolValue()))
                    if (lowerLimit.isLessThan(upperLimit))
                        return values(T, T);
                if (lowerLimit.isGreaterThan(MOST_POSITIVE_FIXNUM.getSymbolValue()))
                    if (upperLimit.isGreaterThan(lowerLimit))
                        return values(T, T);
            }
            return values(NIL, NIL);
        }
        if (ts instanceof IntegerTypeSpecifier) {
            IntegerTypeSpecifier its = (IntegerTypeSpecifier) ts;
            if (lowerLimit.isGreaterThanOrEqualTo(its.lowerLimit))
                if (upperLimit.isLessThanOrEqualTo(its.upperLimit))
                    return values(T, T);
        }
        return super.isSubtypeOf(ts);
    }
}
