/*
 * WrongNumberOfArgumentsException.java
 *
 * Copyright (C) 2002-2004 Peter Graves
 * $Id: WrongNumberOfArgumentsException.java,v 1.5 2004-02-04 15:11:32 piso Exp $
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

public final class WrongNumberOfArgumentsException extends ProgramError
{
    private final LispObject object;
    private final String name;

    public WrongNumberOfArgumentsException(LispObject obj)
    {
        this.object = obj;
        name = null;
    }

    public WrongNumberOfArgumentsException(String name)
    {
        object = null;
        this.name = name;
    }

    public String getMessage()
    {
        StringBuffer sb = new StringBuffer("Wrong number of arguments");
        if (name != null) {
            sb.append(" for ");
            sb.append(name);
        } else if (object != null && object.getName() != null) {
            sb.append(" for ");
            sb.append(object.getName());
        }
        sb.append('.');
        return sb.toString();
    }
}
