/*
 * JavaObject.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: JavaObject.java,v 1.4 2003-04-10 01:06:15 piso Exp $
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

public class JavaObject extends LispObject
{
    private final Object obj;

    public JavaObject(Object obj)
    {
        this.obj = obj;
    }

    public final Object getObject()
    {
        return obj;
    }

    public static final Object getObject(LispObject o) throws TypeError
    {
        try {
            return ((JavaObject)o).obj;
        }
        catch (ClassCastException e) {
            throw new TypeError(o, "Java object");
        }
    }

    public String toString()
    {
        if (obj instanceof Condition)
            return obj.toString();

        StringBuffer sb = new StringBuffer("#<JAVAOBJECT ");
        String s = obj.toString();
        if (s.startsWith("org.armedbear.lisp."))
            sb.append(s.substring(19));
        else
            sb.append(s);
        sb.append('>');
        return sb.toString();
    }
}
