/*
 * Throw.java
 *
 * Copyright (C) 2002-2005 Peter Graves
 * $Id: Throw.java,v 1.14 2005-11-01 01:37:47 piso Exp $
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

public final class Throw extends ConditionThrowable
{
    public final LispObject tag;
    private final LispObject result;
    private final LispObject[] values;

    public Throw(LispObject tag, LispObject result, LispThread thread)
        throws ConditionThrowable
    {
        this.tag = tag;
        this.result = result;
        values = thread._values;
    }

    public LispObject getResult(LispThread thread) throws ConditionThrowable
    {
        thread._values = values;
        return result;
    }

    public LispObject getCondition() throws ConditionThrowable
    {
        try {
            return new ControlError("Attempt to throw to the nonexistent tag " +
                                    tag + ".");
        }
        catch (Throwable t) {
            Debug.trace(t);
            return new Condition();
        }
    }
}
