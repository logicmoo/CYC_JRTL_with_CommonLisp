/*
 * Layout.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: Layout.java,v 1.4 2003-12-20 03:05:51 piso Exp $
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

public final class Layout extends LispObject
{
    private final LispClass cls;
    private final LispObject length;
    private final LispObject instanceSlots; // A list of slot names.

    public Layout(LispClass cls, LispObject length, LispObject instanceSlots)
    {
        this.cls = cls;
        this.length = length;
        this.instanceSlots = instanceSlots;
    }

    public LispClass getLispClass()
    {
        return cls;
    }

    // ### make-layout
    private static final Primitive3 MAKE_LAYOUT =
        new Primitive3("make-layout", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second,
                                  LispObject third)
            throws ConditionThrowable
        {
            try {
                return new Layout((LispClass)first, second, third);
            }
            catch (ClassCastException e) {
                return signal(new TypeError(first, "class"));
            }
        }

    };

    // ### layout-class
    private static final Primitive1 LAYOUT_CLASS =
        new Primitive1("layout-class", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((Layout)arg).cls;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, "layout"));
            }
        }
    };

    // ### layout-length
    private static final Primitive1 LAYOUT_LENGTH =
        new Primitive1("layout-length", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((Layout)arg).length;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, "layout"));
            }
        }
    };

    // ### instance-slot-index
    // instance-slot-index layout slot-name => index
    private static final Primitive2 INSTANCE_SLOT_INDEX =
        new Primitive2("instance-slot-index", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                LispObject list = ((Layout)first).instanceSlots;
                int index = 0;
                while (list != NIL) {
                    if (list.car() == second)
                        return new Fixnum(index);
                    list = list.cdr();
                    ++index;
                }
                return NIL;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(first, "layout"));
            }
        }
    };
}
