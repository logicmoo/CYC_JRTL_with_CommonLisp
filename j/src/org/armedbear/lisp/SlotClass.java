/*
 * SlotClass.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: SlotClass.java,v 1.5 2004-01-24 20:13:50 piso Exp $
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

public class SlotClass extends LispClass
{
    private LispObject directSlots = NIL;
    private LispObject effectiveSlots = NIL;
    private LispObject directDefaultInitargs = NIL;
    private LispObject effectiveDefaultInitargs = NIL;

    public SlotClass()
    {
    }

    public SlotClass(Symbol symbol, LispObject directSuperclasses)
    {
        super(symbol, directSuperclasses);
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        return super.typep(type);
    }

    public void setDirectSlots(LispObject directSlots)
    {
        this.directSlots = directSlots;
    }

    public final LispObject getEffectiveSlots()
    {
        return effectiveSlots;
    }

    public void setEffectiveSlots(LispObject slots)
    {
        this.effectiveSlots = slots;
    }

    // ### class-direct-slots
    private static final Primitive1 CLASS_DIRECT_SLOTS =
        new Primitive1("class-direct-slots", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg)
            throws ConditionThrowable
        {
            if (arg instanceof SlotClass)
                return ((SlotClass)arg).directSlots;
            if (arg instanceof BuiltInClass)
                return NIL;
            return signal(new TypeError(arg, "standard class"));
        }
    };

    // ### %set-class-direct-slots
    private static final Primitive2 _SET_CLASS_DIRECT_SLOTS =
        new Primitive2("%set-class-direct-slots", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            if (first instanceof SlotClass) {
                ((SlotClass)first).directSlots = second;
                return second;
            }
            return signal(new TypeError(first, "standard class"));
        }
    };

    // ### class-slots
    private static final Primitive1 CLASS_SLOTS =
        new Primitive1("class-slots", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg)
            throws ConditionThrowable
        {
            if (arg instanceof SlotClass)
                return ((SlotClass)arg).effectiveSlots;
            if (arg instanceof BuiltInClass)
                return NIL;
            return signal(new TypeError(arg, "standard class"));
        }
    };

    // ### %set-class-slots
    private static final Primitive2 _SET_CLASS_SLOTS =
        new Primitive2("%set-class-slots", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            if (first instanceof SlotClass) {
                ((SlotClass)first).effectiveSlots = second;
                return second;
            }
            return signal(new TypeError(first, "standard class"));
        }
    };

    // ### class-direct-default-initargs
    private static final Primitive1 CLASS_DIRECT_DEFAULT_INITARGS =
        new Primitive1("class-direct-default-initargs", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg)
            throws ConditionThrowable
        {
            if (arg instanceof SlotClass)
                return ((SlotClass)arg).directDefaultInitargs;
            if (arg instanceof BuiltInClass)
                return NIL;
            return signal(new TypeError(arg, "standard class"));
        }
    };

    // ### %set-class-direct-default-initargs
    private static final Primitive2 _SET_CLASS_DIRECT_DEFAULT_INITARGS =
        new Primitive2("%set-class-direct-default-initargs", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            if (first instanceof SlotClass) {
                ((SlotClass)first).directDefaultInitargs = second;
                return second;
            }
            return signal(new TypeError(first, "standard class"));
        }
    };

    // ### class-default-initargs
    private static final Primitive1 CLASS_DEFAULT_INITARGS =
        new Primitive1("class-default-initargs", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg)
            throws ConditionThrowable
        {
            if (arg instanceof SlotClass)
                return ((SlotClass)arg).effectiveDefaultInitargs;
            if (arg instanceof BuiltInClass)
                return NIL;
            return signal(new TypeError(arg, "standard class"));
        }
    };

    // ### %set-class-default-initargs
    private static final Primitive2 _SET_CLASS_DEFAULT_INITARGS =
        new Primitive2("%set-class-default-initargs", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            if (first instanceof SlotClass) {
                ((SlotClass)first).effectiveDefaultInitargs = second;
                return second;
            }
            return signal(new TypeError(first, "standard class"));
        }
    };
}
