/*
 * Throw.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Throw.java,v 1.3 2003-04-27 16:08:05 piso Exp $
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

public final class Throw extends LispError
{
    private final LispObject tag;
    private final LispObject result;
    private final LispObject[] values;

    public Throw(LispObject tag, LispObject result)
    {
        this.tag = tag;
        this.result = result;
        values = LispThread.currentThread().getValues();
    }

    public LispObject getTag()
    {
        return tag;
    }

    public LispObject getResult()
    {
        LispThread.currentThread().setValues(values);
        return result;
    }
}
