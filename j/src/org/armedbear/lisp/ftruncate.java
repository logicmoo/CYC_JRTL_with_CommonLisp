/*
 * ftruncate.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: ftruncate.java,v 1.3 2004-06-05 02:08:28 piso Exp $
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
public final class ftruncate extends Primitive
{
    private ftruncate()
    {
        super("ftruncate", "number &optional divisor");
    }

    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
        if (arg instanceof LispFloat)
            return ((LispFloat)arg).ftruncate(Fixnum.ONE);
        LispObject q = arg.truncate(Fixnum.ONE); // an integer
        if (q instanceof Fixnum)
            q = new LispFloat(((Fixnum)q).value);
        else
            q = new LispFloat(((Bignum)q).floatValue());
        LispThread.currentThread()._values[0] = q;
        return q;
    }

    public LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
        if (first instanceof LispFloat)
            return ((LispFloat)first).ftruncate(second);
        LispObject q = first.truncate(second); // an integer
        if (q instanceof Fixnum)
            q = new LispFloat(((Fixnum)q).value);
        else
            q = new LispFloat(((Bignum)q).floatValue());
        LispThread.currentThread()._values[0] = q;
        return q;
    }

    private static final Primitive FTRUNCATE = new ftruncate();
}
