/*
 * JavaObject.java
 *
 * Copyright (C) 2002-2004 Peter Graves
 * $Id: JavaObject.java,v 1.15 2004-04-12 23:05:07 piso Exp $
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

    public Object javaInstance()
    {
        return obj;
    }

    public Object javaInstance(Class c)
    {
        return javaInstance();
    }

    public static final Object getObject(LispObject o) throws ConditionThrowable
    {
        try {
	    return ((JavaObject)o).obj;
        }
        catch (ClassCastException e) {
            signal (new TypeError(o, "Java object"));
            // Not reached.
            return null;
        }
    }

    public final boolean equal(LispObject other)
    {
        if (this == other)
            return true;
        if (other instanceof JavaObject)
            return (obj == ((JavaObject)other).obj);
        return false;
    }

    public final boolean equalp(LispObject other)
    {
        return equal(other);
    }

    public Fixnum sxhash()
    {
        return obj == null ? null : new Fixnum(obj.hashCode() & 0x7ffffff);
    }

    public String toString()
    {
        if (obj instanceof ConditionThrowable)
            return obj.toString();
        StringBuffer sb = new StringBuffer("#<JAVAOBJECT ");
        if (obj == null)
            sb.append("null");
        else {
            sb.append(obj.getClass().getName());
            sb.append(" @ #x");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb.append(">");
        return sb.toString();
    }
}
