/*
 * logandc2.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: logandc2.java,v 1.7 2004-02-28 17:25:45 piso Exp $
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

import java.math.BigInteger;

// ### logandc2
// logandc2 integer-1 integer-2 => result-integer
// and integer-1 with complement of integer-2
public final class logandc2 extends Primitive2
{
    private logandc2()
    {
        super("logandc2", "integer-1 integer-2");
    }

    public LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
        if (first instanceof Fixnum) {
            if (second instanceof Fixnum)
                return new Fixnum(((Fixnum)first).value &
                                  ~((Fixnum)second).value);
            if (second instanceof Bignum) {
                BigInteger n1 = ((Fixnum)first).getBigInteger();
                BigInteger n2 = ((Bignum)second).value;
                return number(n1.and(n2.not()));
            }
            return signal(new TypeError(second, Symbol.INTEGER));
        }
        if (first instanceof Bignum) {
            BigInteger n1 = ((Bignum)first).value;
            if (second instanceof Fixnum) {
                BigInteger n2 = ((Fixnum)second).getBigInteger();
                return number(n1.and(n2.not()));
            }
            if (second instanceof Bignum) {
                BigInteger n2 = ((Bignum)second).value;
                return number(n1.and(n2.not()));
            }
            return signal(new TypeError(second, Symbol.INTEGER));
        }
        return signal(new TypeError(first, Symbol.INTEGER));
    }

    private static final Primitive2 LOGANDC2 = new logandc2();
}
