/*
 * Throw.java
 *
 * Copyright (C) 2002-2004 Peter Graves
 * $Id: Throw.java,v 1.10 2004-06-02 11:44:09 piso Exp $
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
    private final LispObject tag;
    private final LispObject result;
    private final LispObject[] values;

    public Throw(LispObject tag, LispObject result) throws ConditionThrowable
    {
        this.tag = tag;
        this.result = result;
        values = LispThread.currentThread().getValues();
    }

    public LispObject getTag()
    {
        return tag;
    }

    public LispObject getResult() throws ConditionThrowable
    {
        if (values != null)
            LispThread.currentThread().setValues(values);
        else
            LispThread.currentThread().clearValues();
        return result;
    }

    public LispObject getCondition()
    {
        return new ControlError("attempt to throw to the nonexistent tag " + tag);
    }
}
