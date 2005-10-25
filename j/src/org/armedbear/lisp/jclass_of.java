/*
 * jclass_of.java
 *
 * Copyright (C) 2005 Peter Graves
 * $Id: jclass_of.java,v 1.1 2005-10-25 13:58:32 piso Exp $
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

// ### jclass-of object &optional name
public final class jclass_of extends Primitive
{
    private jclass_of()
    {
        super(Symbol.JCLASS_OF, "object &optional name");
    }

    public LispObject execute(LispObject arg)
        throws ConditionThrowable
    {
        final String className;
        if (arg instanceof AbstractString)
            className = "java.lang.String";
        else if (arg instanceof JavaObject)
            className = ((JavaObject)arg).getObject().getClass().getName();
        else
            return signalTypeError(arg, Symbol.JAVA_OBJECT);
        SimpleString value = new SimpleString(className);
        return LispThread.currentThread().setValues(value, value);
    }

    public LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
        final String className;
        if (first instanceof AbstractString)
            className = "java.lang.String";
        else if (first instanceof JavaObject)
            className = ((JavaObject)first).getObject().getClass().getName();
        else
            return signalTypeError(first, Symbol.JAVA_OBJECT);
        String suppliedName = javaString(second);
        return LispThread.currentThread().setValues(className.equals(suppliedName) ? T : NIL,
                                                    new SimpleString(className));
    }

    private static final Primitive JCLASS_OF = new jclass_of();
}
