/*
 * StandardObjectFunctions.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: StandardObjectFunctions.java,v 1.1 2004-11-28 15:41:04 piso Exp $
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

public class StandardObjectFunctions extends Lisp
{
    // ### std-instance-layout
    private static final Primitive STD_INSTANCE_LAYOUT =
        new Primitive("std-instance-layout", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((StandardObject)arg).getInstanceLayout();
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.STANDARD_OBJECT));
            }
        }
    };

    // ### %set-std-instance-layout
    private static final Primitive _SET_STD_INSTANCE_LAYOUT =
        new Primitive("%set-std-instance-layout", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                ((StandardObject)first).layout = (Layout) second;
                return second;
            }
            catch (ClassCastException e) {
                if (!(first instanceof StandardObject))
                    return signal(new TypeError(first, Symbol.STANDARD_OBJECT));
                if (!(second instanceof Layout))
                    return signal(new TypeError(second, "layout"));
                // Not reached.
                return NIL;
            }
        }
    };

    // ### std-instance-class
    private static final Primitive STD_INSTANCE_CLASS =
        new Primitive("std-instance-class", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof StandardObject)
                return ((StandardObject)arg).layout.getLispClass();
            return signal(new TypeError(arg, Symbol.STANDARD_OBJECT));
        }
    };

    // ### std-instance-slots
    private static final Primitive STD_INSTANCE_SLOTS =
        new Primitive("std-instance-slots", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof StandardObject)
                return ((StandardObject)arg).slots;
            return signal(new TypeError(arg, Symbol.STANDARD_OBJECT));
        }
    };

    // ### %set-std-instance-slots
    private static final Primitive _SET_STD_INSTANCE_SLOTS =
        new Primitive("%set-std-instance-slots", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            if (first instanceof StandardObject) {
                if (second instanceof SimpleVector) {
                    ((StandardObject)first).slots = (SimpleVector) second;
                    return second;
                }
                return signal(new TypeError(second, Symbol.SIMPLE_VECTOR));
            }
            return signal(new TypeError(first, Symbol.STANDARD_OBJECT));
        }
    };

    // ### standard-instance-access instance location => value
    private static final Primitive STANDARD_INSTANCE_ACCESS =
        new Primitive("standard-instance-access", PACKAGE_SYS, true,
                      "instance location")
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                return ((StandardObject)first).slots.AREF(second);
            }
            catch (ClassCastException e) {
                return signal(new TypeError(first, Symbol.STANDARD_OBJECT));
            }
        }
    };

    // ### %set-standard-instance-access instance location new-value => new-value
    private static final Primitive _SET_STANDARD_INSTANCE_ACCESS =
        new Primitive("%set-standard-instance-access", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second,
                                  LispObject third)
            throws ConditionThrowable
        {
            try {
                ((StandardObject)first).slots.setRowMajor(Fixnum.getValue(second),
                                                          third);
                return third;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(first, Symbol.STANDARD_OBJECT));
            }
        }
    };

    // ### std-slot-boundp
    private static final Primitive STD_SLOT_BOUNDP =
        new Primitive("std-slot-boundp", PACKAGE_SYS, false,
                      "instance slot-name")
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            StandardObject instance;
            try {
                instance = (StandardObject) first;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(first, Symbol.STANDARD_OBJECT));
            }
            Layout layout = instance.getInstanceLayout();
            int index = layout.getSlotIndex(second);
            if (index >= 0) {
                // Found instance slot.
                LispObject value = instance.slots.getRowMajor(index);
                return value != UNBOUND_VALUE ? T : NIL;
            }
            // Check for class slot.
            LispObject location = layout.getClassSlotLocation(second);
            if (location != null) {
                LispObject value = location.cdr();
                return value != UNBOUND_VALUE ? T : NIL;
            }
            final LispThread thread = LispThread.currentThread();
            LispObject value =
                thread.execute(Symbol.SLOT_MISSING, instance.getLispClass(),
                               instance, second, Symbol.SLOT_BOUNDP);
            // "If slot-missing is invoked and returns a value, a boolean
            // equivalent to its primary value is returned by slot-boundp."
            thread._values = null;
            return value != NIL ? T : NIL;
        }
    };

    // ### std-slot-value
    private static final Primitive STD_SLOT_VALUE =
        new Primitive("std-slot-value", PACKAGE_SYS, false,
                      "instance slot-name")
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            LispObject value = null;
            StandardObject instance;
            try {
                instance = (StandardObject) first;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(first, Symbol.STANDARD_OBJECT));
            }
            Layout layout = instance.getInstanceLayout();
            int index = layout.getSlotIndex(second);
            if (index >= 0) {
                // Found instance slot.
                value = instance.slots.getRowMajor(index);
            } else {
                // Check for class slot.
                LispObject location = layout.getClassSlotLocation(second);
                if (location == null)
                    return Symbol.SLOT_MISSING.execute(instance.getLispClass(),
                                                       instance, second,
                                                       Symbol.SLOT_VALUE);
                value = location.cdr();
            }
            if (value == UNBOUND_VALUE)
                return Symbol.SLOT_UNBOUND.execute(instance.getLispClass(),
                                                   instance, second);
            return value;
        }
    };

    // ### %set-std-slot-value
    private static final Primitive _SET_STD_SLOT_VALUE =
        new Primitive("%set-std-slot-value", PACKAGE_SYS, false,
                      "instance slot-name new-value")
    {
        public LispObject execute(LispObject first, LispObject second,
                                  LispObject third)
            throws ConditionThrowable
        {
            StandardObject instance;
            try {
                instance = (StandardObject) first;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(first, Symbol.STANDARD_OBJECT));
            }
            Layout layout = instance.getInstanceLayout();
            int index = layout.getSlotIndex(second);
            if (index >= 0) {
                // Found instance slot.
                instance.slots.setRowMajor(index, third);
                return third;
            }
            // Check for class slot.
            LispObject location = layout.getClassSlotLocation(second);
            if (location != null) {
                location.setCdr(third);
                return third;
            }
            LispObject[] args = new LispObject[5];
            args[0] = instance.getLispClass();
            args[1] = instance;
            args[2] = second;
            args[3] = Symbol.SETF;
            args[4] = third;
            Symbol.SLOT_MISSING.execute(args);
            return third;
        }
    };

    // ### allocate-slot-storage size initial-value
    private static final Primitive ALLOCATE_SLOT_STORAGE =
        new Primitive("allocate-slot-storage", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                SimpleVector v = new SimpleVector(((Fixnum)first).value);
                v.fill(second);
                return v;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(first, Symbol.FIXNUM));
            }
        }
    };

    // ### allocate-std-instance class slots => instance
    private static final Primitive ALLOCATE_STD_INSTANCE =
        new Primitive("allocate-std-instance", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            if (first == BuiltInClass.STANDARD_CLASS)
                return new StandardClass();
            if (first instanceof LispClass) {
                if (second instanceof SimpleVector) {
                    Symbol symbol = ((LispClass)first).getSymbol();
                    SimpleVector slots = (SimpleVector) second;
                    if (symbol == Symbol.STANDARD_GENERIC_FUNCTION)
                        return new GenericFunction((LispClass)first, slots);
                    if (symbol == Symbol.STANDARD_METHOD)
                        return new Method((LispClass)first, slots);
                    LispObject cpl = ((LispClass)first).getCPL();
                    while (cpl != NIL) {
                        LispObject obj = cpl.car();
                        if (obj == BuiltInClass.CONDITION)
                            return new Condition((LispClass)first, slots);
                        cpl = cpl.cdr();
                    }
                    return new StandardObject((LispClass)first, slots);
                }
                return signal(new TypeError(second, Symbol.SIMPLE_VECTOR));
            }
            return signal(new TypeError(first, Symbol.CLASS));
        }
    };
}
