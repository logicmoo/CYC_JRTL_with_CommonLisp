/*
 * atan.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: atan.java,v 1.2 2003-09-19 01:46:42 piso Exp $
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

public final class atan extends Lisp
{
    // ### atan
    private static final Primitive ATAN = new Primitive("atan") {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            LispFloat n = LispFloat.coerceToFloat(arg);
            return new LispFloat(Math.atan(n.getValue()));
        }

        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            LispFloat n1 = LispFloat.coerceToFloat(first);
            LispFloat n2 = LispFloat.coerceToFloat(second);
            LispObject quotient = n1.divideBy(n2);
            return new LispFloat(Math.atan(((LispFloat)quotient).getValue()));
        }
    };
}
