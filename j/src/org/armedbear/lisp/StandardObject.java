/*
 * StandardObject.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: StandardObject.java,v 1.3 2003-10-11 00:17:18 piso Exp $
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

public class StandardObject extends LispObject
{
    // Slots.
    private LispObject cls;
    private LispObject slots; // A simple vector.

    protected StandardObject()
    {
    }

    private StandardObject(LispObject cls, LispObject slots)
    {
        this.cls = cls;
        this.slots = slots;
    }

    public LispObject typeOf()
    {
        return Symbol.STANDARD_OBJECT;
    }

    public LispClass classOf()
    {
        return BuiltInClass.STANDARD_OBJECT;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.STANDARD_OBJECT)
            return T;
        if (type == BuiltInClass.STANDARD_OBJECT)
            return T;
        return super.typep(type);
    }

    private static final Primitive1 STD_INSTANCE_SLOTS =
        new Primitive1("std-instance-slots", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof StandardObject)
                return ((StandardObject)arg).slots;
            throw new ConditionThrowable(new TypeError(arg, "standard object"));
        }
    };

    // ### allocate-std-instance
    // allocate-std-instance class slots => instance
    private static final Primitive2 ALLOCATE_STD_INSTANCE =
        new Primitive2("allocate-std-instance", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
        {
            if (first == BuiltInClass.STANDARD_CLASS)
                return new StandardClass();
            return new StandardObject(first, second);
        }
    };
}
