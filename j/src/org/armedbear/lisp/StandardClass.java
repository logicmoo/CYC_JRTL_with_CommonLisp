/*
 * StandardClass.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: StandardClass.java,v 1.3 2003-09-21 15:07:13 piso Exp $
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

public class StandardClass extends LispClass
{
    public StandardClass(Symbol symbol, LispObject directSuperclasses)
    {
        super(symbol, directSuperclasses);
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("#<STANDARD-CLASS ");
        sb.append(symbol.getName());
        sb.append('>');
        return sb.toString();
    }
}
