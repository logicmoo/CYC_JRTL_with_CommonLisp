/*
 * JavaObject.java
 *
 * Copyright (C) 2002-2005 Peter Graves
 * $Id: JavaObject.java,v 1.18 2005-10-22 14:11:08 piso Exp $
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

public final class JavaObject extends LispObject
{
    private final Object obj;

    public JavaObject(Object obj)
    {
        this.obj = obj;
    }

    public LispObject typeOf()
    {
        return Symbol.JAVA_OBJECT;
    }

    public LispObject classOf()
    {
        return BuiltInClass.JAVA_OBJECT;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.JAVA_OBJECT)
            return T;
        if (type == BuiltInClass.JAVA_OBJECT)
            return T;
        return super.typep(type);
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

    public static final Object getObject(LispObject o)
        throws ConditionThrowable
    {
        try {
	    return ((JavaObject)o).obj;
        }
        catch (ClassCastException e) {
            signalTypeError(o, Symbol.JAVA_OBJECT);
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

    public int sxhash()
    {
        return obj == null ? 0 : (obj.hashCode() & 0x7ffffff);
    }

    public String writeToString()
    {
        if (obj instanceof ConditionThrowable)
            return obj.toString();
        FastStringBuffer sb = new FastStringBuffer("JAVAOBJECT ");
        sb.append(obj == null ? "null" : obj.getClass().getName());
        return unreadableString(sb.toString());
    }
}
