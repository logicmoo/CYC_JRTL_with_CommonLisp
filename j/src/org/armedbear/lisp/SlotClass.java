/*
 * SlotClass.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: SlotClass.java,v 1.11 2005-06-19 23:04:34 piso Exp $
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
    private LispObject slots = NIL;
    private LispObject directDefaultInitargs = NIL;
    private LispObject defaultInitargs = NIL;

    public SlotClass()
    {
    }

    public SlotClass(Symbol symbol, LispObject directSuperclasses)
    {
        super(symbol, directSuperclasses);
    }

    public LispObject getParts() throws ConditionThrowable
    {
        LispObject result = super.getParts().nreverse();
        result = result.push(new Cons("DIRECT-SLOTS", directSlots));
        result = result.push(new Cons("SLOTS", slots));
        result = result.push(new Cons("DIRECT-DEFAULT-INITARGS", directDefaultInitargs));
        result = result.push(new Cons("DEFAULT-INITARGS", defaultInitargs));
        return result.nreverse();
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        return super.typep(type);
    }

    public LispObject getDirectSlots()
    {
        return directSlots;
    }

    public void setDirectSlots(LispObject directSlots)
    {
        this.directSlots = directSlots;
    }

    public final LispObject getSlots()
    {
        return slots;
    }

    public void setSlots(LispObject slots)
    {
        this.slots = slots;
    }

    public void finalizeClassLayout()
    {
        if (isFinalized())
            return;
        try {
            Debug.assertTrue(slots == NIL);
            LispObject cpl = getCPL();
            Debug.assertTrue(cpl != null);
            Debug.assertTrue(cpl.listp());
            while (cpl != NIL) {
                LispObject car = cpl.car();
                if (car instanceof StandardClass) {
                    StandardClass cls = (StandardClass) car;
                    LispObject directSlots = cls.getDirectSlots();
                    Debug.assertTrue(directSlots != null);
                    Debug.assertTrue(directSlots.listp());
                    while (directSlots != NIL) {
                        slots = slots.push(directSlots.car());
                        directSlots = directSlots.cdr();
                    }
                }
                cpl = cpl.cdr();
            }
            slots = slots.nreverse();
            LispObject[] instanceSlotNames = new LispObject[slots.length()];
            int i = 0;
            LispObject tail = slots;
            while (tail != NIL) {
                SlotDefinition slotDefinition = (SlotDefinition) tail.car();
                slotDefinition.setLocation(i);
                instanceSlotNames[i++] = slotDefinition.getName();
                tail = tail.cdr();
            }
            setClassLayout(new Layout(this, instanceSlotNames, NIL));
            setFinalized(true);
        }
        catch (Throwable t) {
            Debug.trace(t);
        }
    }

    // ### class-direct-slots
    private static final Primitive CLASS_DIRECT_SLOTS =
        new Primitive("class-direct-slots", PACKAGE_SYS, true)
    {
        public LispObject execute(LispObject arg)
            throws ConditionThrowable
        {
            if (arg instanceof SlotClass)
                return ((SlotClass)arg).directSlots;
            if (arg instanceof BuiltInClass)
                return NIL;
            return signal(new TypeError(arg, Symbol.STANDARD_CLASS));
        }
    };

    // ### %set-class-direct-slots
    private static final Primitive _SET_CLASS_DIRECT_SLOTS =
        new Primitive("%set-class-direct-slots", PACKAGE_SYS, true)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                ((SlotClass)first).directSlots = second;
                return second;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(first, Symbol.STANDARD_CLASS));
            }
        }
    };

    // ### class-slots
    private static final Primitive CLASS_SLOTS =
        new Primitive("class-slots", PACKAGE_SYS, true)
    {
        public LispObject execute(LispObject arg)
            throws ConditionThrowable
        {
            if (arg instanceof SlotClass)
                return ((SlotClass)arg).slots;
            if (arg instanceof BuiltInClass)
                return NIL;
            return signal(new TypeError(arg, Symbol.STANDARD_CLASS));
        }
    };

    // ### %set-class-slots
    private static final Primitive _SET_CLASS_SLOTS =
        new Primitive("%set-class-slots", PACKAGE_SYS, true)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                ((SlotClass)first).slots = second;
                return second;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(first, Symbol.STANDARD_CLASS));
            }
        }
    };

    // ### class-direct-default-initargs
    private static final Primitive CLASS_DIRECT_DEFAULT_INITARGS =
        new Primitive("class-direct-default-initargs", PACKAGE_SYS, true)
    {
        public LispObject execute(LispObject arg)
            throws ConditionThrowable
        {
            if (arg instanceof SlotClass)
                return ((SlotClass)arg).directDefaultInitargs;
            if (arg instanceof BuiltInClass)
                return NIL;
            return signal(new TypeError(arg, Symbol.STANDARD_CLASS));
        }
    };

    // ### %set-class-direct-default-initargs
    private static final Primitive _SET_CLASS_DIRECT_DEFAULT_INITARGS =
        new Primitive("%set-class-direct-default-initargs", PACKAGE_SYS, true)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                ((SlotClass)first).directDefaultInitargs = second;
                return second;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(first, Symbol.STANDARD_CLASS));
            }
        }
    };

    // ### class-default-initargs
    private static final Primitive CLASS_DEFAULT_INITARGS =
        new Primitive("class-default-initargs", PACKAGE_SYS, true)
    {
        public LispObject execute(LispObject arg)
            throws ConditionThrowable
        {
            if (arg instanceof SlotClass)
                return ((SlotClass)arg).defaultInitargs;
            if (arg instanceof BuiltInClass)
                return NIL;
            return signal(new TypeError(arg, Symbol.STANDARD_CLASS));
        }
    };

    // ### %set-class-default-initargs
    private static final Primitive _SET_CLASS_DEFAULT_INITARGS =
        new Primitive("%set-class-default-initargs", PACKAGE_SYS, true)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            if (first instanceof SlotClass) {
                ((SlotClass)first).defaultInitargs = second;
                return second;
            }
            return signal(new TypeError(first, Symbol.STANDARD_CLASS));
        }
    };
}
