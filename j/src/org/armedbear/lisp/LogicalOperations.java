/*
 * LogicalOperations.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: LogicalOperations.java,v 1.1 2003-09-10 13:45:11 piso Exp $
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

public final class LogicalOperations extends Lisp
{
    // ### logand
    // logand &rest integers => result-integer
    private static final Primitive LOGAND = new Primitive("logand") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            if (first instanceof Fixnum && second instanceof Fixnum) {
                return new Fixnum(((Fixnum)first).getValue() &
                                  ((Fixnum)second).getValue());
            } else {
                BigInteger n1, n2;
                if (first instanceof Fixnum)
                    n1 = ((Fixnum)first).getBigInteger();
                else if (first instanceof Bignum)
                    n1 = ((Bignum)first).getValue();
                else
                    throw new TypeError(first, "integer");
                if (second instanceof Fixnum)
                    n2 = ((Fixnum)second).getBigInteger();
                else if (second instanceof Bignum)
                    n2 = ((Bignum)second).getValue();
                else
                    throw new TypeError(second, "integer");
                return number(n1.and(n2));
            }
        }
        public LispObject execute(LispObject[] args) throws LispError
        {
            BigInteger result = BigInteger.valueOf(-1);
            for (int i = 0; i < args.length; i++) {
                BigInteger n;
                if (args[i] instanceof Fixnum)
                    n = ((Fixnum)args[i]).getBigInteger();
                else if (args[i] instanceof Bignum)
                    n = ((Bignum)args[i]).getValue();
                else
                    throw new TypeError(args[i], "integer");
                result = result.and(n);
            }
            return number(result);
        }
    };

    // ### logior
    // logior &rest integers => result-integer
    private static final Primitive LOGIOR = new Primitive("logior") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            BigInteger result = BigInteger.ZERO;
            for (int i = 0; i < args.length; i++) {
                BigInteger n;
                if (args[i] instanceof Fixnum)
                    n = ((Fixnum)args[i]).getBigInteger();
                else if (args[i] instanceof Bignum)
                    n = ((Bignum)args[i]).getValue();
                else
                    throw new TypeError(args[i], "integer");
                result = result.or(n);
            }
            return number(result);
        }
    };

    // ### lognot
    private static final Primitive1 LOGNOT = new Primitive1("lognot") {
        public LispObject execute(LispObject arg) throws LispError
        {
            if (arg instanceof Fixnum)
                return number(~((Fixnum)arg).getValue());
            if (arg instanceof Bignum)
                return number(((Bignum)arg).getValue().not());
            throw new TypeError(arg, "integer");
        }
    };

    // ### logbitp
    // logbitp index integer => generalized-boolean
    private static final Primitive2 LOGBITP = new Primitive2("logbitp") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            int index = -1;
            if (first instanceof Fixnum) {
                index = ((Fixnum)first).getValue();
            } else if (first instanceof Bignum) {
                // FIXME If the number is really that big, we're not checking
                // the right bit...
                if (((Bignum)first).getValue().signum() > 0)
                    index = Integer.MAX_VALUE;
            }
            if (index < 0)
                throw new TypeError(first, "non-negative integer");
            BigInteger n;
            if (second instanceof Fixnum)
                n = ((Fixnum)second).getBigInteger();
            else if (second instanceof Bignum)
                n = ((Bignum)second).getValue();
            else
                throw new TypeError(second, "integer");
            // FIXME See above.
            if (index == Integer.MAX_VALUE)
                return n.signum() < 0 ? T : NIL;
            return n.testBit(index) ? T : NIL;
        }
    };
}
