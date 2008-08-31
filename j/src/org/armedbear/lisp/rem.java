/*
 * rem.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id$
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

// ### rem number divisor => remainder
public final class rem extends Primitive
{
    private rem()
    {
        super("rem", "number divisor");
    }

    public LispObject execute(LispObject number, LispObject divisor)
        throws ConditionThrowable
    {
        number.truncate(divisor);
        final LispThread thread = LispThread.currentThread();
        LispObject remainder = thread._values[1];
        thread.clearValues();
        return remainder;
    }

    private static final Primitive REM = new rem();
}
