/*
 * SlotClass.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: SlotClass.java,v 1.16 2005-11-01 16:39:33 piso Exp $
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
    private LispObject directSlotDefinitions = NIL;
    private LispObject slotDefinitions = NIL;
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
        result = result.push(new Cons("DIRECT-SLOTS", directSlotDefinitions));
        result = result.push(new Cons("SLOTS", slotDefinitions));
        result = result.push(new Cons("DIRECT-DEFAULT-INITARGS", directDefaultInitargs));
        result = result.push(new Cons("DEFAULT-INITARGS", defaultInitargs));
        return result.nreverse();
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        return super.typep(type);
    }

    public LispObject getDirectSlotDefinitions()
    {
        return directSlotDefinitions;
    }

    public void setDirectSlotDefinitions(LispObject directSlotDefinitions)
    {
        this.directSlotDefinitions = directSlotDefinitions;
    }

    public final LispObject getSlotDefinitions()
    {
        return slotDefinitions;
    }

    public void setSlotDefinitions(LispObject slotDefinitions)
    {
        this.slotDefinitions = slotDefinitions;
    }

    public void setDirectDefaultInitargs(LispObject directDefaultInitargs)
    {
        this.directDefaultInitargs = directDefaultInitargs;
    }

    public void setDefaultInitargs(LispObject defaultInitargs)
    {
        this.defaultInitargs = defaultInitargs;
    }

    public void finalizeClassLayout()
    {
        if (isFinalized())
            return;
        try {
            Debug.assertTrue(slotDefinitions == NIL);
            LispObject cpl = getCPL();
            Debug.assertTrue(cpl != null);
            Debug.assertTrue(cpl.listp());
            cpl = cpl.reverse();
            while (cpl != NIL) {
                LispObject car = cpl.car();
                if (car instanceof StandardClass) {
                    StandardClass cls = (StandardClass) car;
                    LispObject defs = cls.getDirectSlotDefinitions();
                    Debug.assertTrue(defs != null);
                    Debug.assertTrue(defs.listp());
                    while (defs != NIL) {
                        slotDefinitions = slotDefinitions.push(defs.car());
                        defs = defs.cdr();
                    }
                }
                cpl = cpl.cdr();
            }
            slotDefinitions = slotDefinitions.nreverse();
            LispObject[] instanceSlotNames = new LispObject[slotDefinitions.length()];
            int i = 0;
            LispObject tail = slotDefinitions;
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
                return ((SlotClass)arg).directSlotDefinitions;
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
                ((SlotClass)first).directSlotDefinitions = second;
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
                return ((SlotClass)arg).slotDefinitions;
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
                ((SlotClass)first).slotDefinitions = second;
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
