/*
 * Return.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Return.java,v 1.2 2003-02-15 16:48:17 piso Exp $
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

public final class Return extends LispError
{
    private final LispObject name;
    private final LispObject result;

    public Return(LispObject name, LispObject result)
    {
        this.name = name;
        this.result = result;
    }

    public LispObject getName()
    {
        return name;
    }

    public LispObject getResult()
    {
        return result;
    }

    public String getMessage()
    {
        StringBuffer sb = new StringBuffer("no block named ");
        sb.append(name);
        sb.append(" is currently visible");
        return sb.toString();
    }
}
