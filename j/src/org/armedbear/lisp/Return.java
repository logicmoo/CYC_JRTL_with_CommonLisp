/*
 * Return.java
 *
 * Copyright (C) 2002-2004 Peter Graves
 * $Id: Return.java,v 1.8 2004-07-23 18:33:43 piso Exp $
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

public final class Return extends ConditionThrowable
{
    public final LispObject tag;
    public final LispObject block;
    public final LispObject result;

    public Return(LispObject tag, LispObject block, LispObject result)
    {
        this.tag = tag;
        this.block = block;
        this.result = result;
    }

    public Return(LispObject tag, LispObject result)
    {
        this.tag = tag;
        this.block = null;
        this.result = result;
    }

    public LispObject getTag()
    {
        return tag;
    }

    public LispObject getBlock()
    {
        return block;
    }

    public LispObject getResult()
    {
        return result;
    }

    public LispObject getCondition()
    {
        StringBuffer sb = new StringBuffer("No block named ");
        sb.append(tag.getName());
        sb.append(" is currently visible.");
        return new ControlError(sb.toString());
    }
}
