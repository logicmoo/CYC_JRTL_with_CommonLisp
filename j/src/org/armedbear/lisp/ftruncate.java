/*
 * ftruncate.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: ftruncate.java,v 1.1 2004-03-07 01:07:26 piso Exp $
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
        final LispThread thread = LispThread.currentThread();
        arg.truncate(Fixnum.ONE);
        LispObject[] values = thread.getValues();
        values[0] = LispFloat.coerceToFloat(values[0]);
        thread.setValues(values);
        return values[0];
    }

    public LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        first.truncate(second);
        LispObject[] values = thread.getValues();
        values[0] = LispFloat.coerceToFloat(values[0]);
        thread.setValues(values);
        return values[0];
    }

    private static final Primitive FTRUNCATE = new ftruncate();
}
