/*
 * ftruncate.java
 *
 * Copyright (C) 2004-2005 Peter Graves
 * $Id: ftruncate.java,v 1.5 2005-03-17 15:03:56 piso Exp $
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

// ### ftruncate number &optional divisor => quotient, remainder
// (defun ftruncate (number &optional (divisor 1))
//  (multiple-value-bind (tru rem) (truncate number divisor)
//   (values (float tru) rem)))

// "FFLOOR, FCEILING, FTRUNCATE, and FROUND handle arguments of different types
// in the following way: If number is a float, and divisor is not a float of
// longer format, then the first result is a float of the same type as number.
// Otherwise, the first result is of the type determined by contagion rules."
public final class ftruncate extends Primitive
{
    private ftruncate()
    {
        super("ftruncate", "number &optional divisor");
    }

    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
        LispObject q = arg.truncate(Fixnum.ONE); // an integer
        if (arg instanceof DoubleFloat) {
            if (q instanceof Fixnum)
                q = new DoubleFloat(((Fixnum)q).value);
            else
                q = new DoubleFloat(((Bignum)q).doubleValue());
        } else {
            if (q instanceof Fixnum)
                q = new SingleFloat(((Fixnum)q).value);
            else
                q = new SingleFloat(((Bignum)q).floatValue());
        }
        LispThread.currentThread()._values[0] = q;
        return q;
    }

    public LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
        LispObject q = first.truncate(second); // an integer
        if (first instanceof DoubleFloat || second instanceof DoubleFloat) {
            if (q instanceof Fixnum)
                q = new DoubleFloat(((Fixnum)q).value);
            else
                q = new DoubleFloat(((Bignum)q).doubleValue());
        } else {
            if (q instanceof Fixnum)
                q = new SingleFloat(((Fixnum)q).value);
            else
                q = new SingleFloat(((Bignum)q).floatValue());
        }
        LispThread.currentThread()._values[0] = q;
        return q;
    }

    private static final Primitive FTRUNCATE = new ftruncate();
}
