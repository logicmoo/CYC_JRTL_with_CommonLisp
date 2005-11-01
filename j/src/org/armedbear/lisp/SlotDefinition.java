/*
 * SlotDefinition.java
 *
 * Copyright (C) 2005 Peter Graves
 * $Id: SlotDefinition.java,v 1.5 2005-11-01 00:58:02 piso Exp $
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

public final class SlotDefinition extends StandardObject
{
    public SlotDefinition()
    {
        super(StandardClass.SLOT_DEFINITION,
              StandardClass.SLOT_DEFINITION.getClassLayout().getLength());
        slots[SlotDefinitionClass.SLOT_INDEX_LOCATION] = NIL;
    }

    public SlotDefinition(LispObject name, LispObject readers)
    {
        this();
        try {
            Debug.assertTrue(name instanceof Symbol);
            slots[SlotDefinitionClass.SLOT_INDEX_NAME] = name;
            slots[SlotDefinitionClass.SLOT_INDEX_INITFUNCTION] = NIL;
            slots[SlotDefinitionClass.SLOT_INDEX_INITARGS] =
                new Cons(PACKAGE_KEYWORD.intern(((Symbol)name).getName()));
            slots[SlotDefinitionClass.SLOT_INDEX_READERS] = readers;
            slots[SlotDefinitionClass.SLOT_INDEX_ALLOCATION] = Keyword.INSTANCE;
        }
        catch (Throwable t) {
            Debug.trace(t);
        }
    }

    public SlotDefinition(LispObject name, LispObject readers,
                          LispObject initForm)
    {
        this();
        try {
            Debug.assertTrue(name instanceof Symbol);
            slots[SlotDefinitionClass.SLOT_INDEX_NAME] = name;
            slots[SlotDefinitionClass.SLOT_INDEX_INITFUNCTION] = NIL;
            slots[SlotDefinitionClass.SLOT_INDEX_INITFORM] = initForm;
            slots[SlotDefinitionClass.SLOT_INDEX_INITARGS] =
                new Cons(PACKAGE_KEYWORD.intern(((Symbol)name).getName()));
            slots[SlotDefinitionClass.SLOT_INDEX_READERS] = readers;
            slots[SlotDefinitionClass.SLOT_INDEX_ALLOCATION] = Keyword.INSTANCE;
        }
        catch (Throwable t) {
            Debug.trace(t);
        }
    }

    public final LispObject getName()
    {
        return slots[SlotDefinitionClass.SLOT_INDEX_NAME];
    }

    public final void setLocation(int i)
    {
        slots[SlotDefinitionClass.SLOT_INDEX_LOCATION] = new Fixnum(i);
    }

    public String writeToString() throws ConditionThrowable
    {
        FastStringBuffer sb =
            new FastStringBuffer(Symbol.SLOT_DEFINITION.writeToString());
        LispObject name = slots[SlotDefinitionClass.SLOT_INDEX_NAME];
        if (name != null && name != NIL) {
            sb.append(' ');
            sb.append(name.writeToString());
        }
        return unreadableString(sb.toString());
    }

    // ### make-slot-definition
    private static final Primitive MAKE_SLOT_DEFINITION =
        new Primitive("make-slot-definition", PACKAGE_SYS, true, "")
    {
        public LispObject execute() throws ConditionThrowable
        {
            return new SlotDefinition();
        }
    };

    // ### %slot-definition-name
    private static final Primitive _SLOT_DEFINITION_NAME =
        new Primitive("%slot-definition-name", PACKAGE_SYS, true,
                      "slot-definition")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((SlotDefinition)arg).slots[SlotDefinitionClass.SLOT_INDEX_NAME];
            }
            catch (ClassCastException e) {
                return signalTypeError(arg, Symbol.SLOT_DEFINITION);
            }
        }
    };

    // ### set-slot-definition-name
    private static final Primitive SET_SLOT_DEFINITION_NAME =
        new Primitive("set-slot-definition-name", PACKAGE_SYS, true,
                      "slot-definition name")
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                ((SlotDefinition)first).slots[SlotDefinitionClass.SLOT_INDEX_NAME] = second;
                return second;
            }
            catch (ClassCastException e) {
                return signalTypeError(first, Symbol.SLOT_DEFINITION);
            }
        }
    };

    // ### %slot-definition-initfunction
    private static final Primitive _SLOT_DEFINITION_INITFUNCTION =
        new Primitive("%slot-definition-initfunction", PACKAGE_SYS, true,
                      "slot-definition")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((SlotDefinition)arg).slots[SlotDefinitionClass.SLOT_INDEX_INITFUNCTION];
            }
            catch (ClassCastException e) {
                return signalTypeError(arg, Symbol.SLOT_DEFINITION);
            }
        }
    };

    // ### set-slot-definition-initfunction
    private static final Primitive SET_SLOT_DEFINITION_INITFUNCTION =
        new Primitive("set-slot-definition-initfunction", PACKAGE_SYS, true,
                      "slot-definition initfunction")
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                ((SlotDefinition)first).slots[SlotDefinitionClass.SLOT_INDEX_INITFUNCTION] = second;
                return second;
            }
            catch (ClassCastException e) {
                return signalTypeError(first, Symbol.SLOT_DEFINITION);
            }
        }
    };

    // ### %slot-definition-initform
    private static final Primitive _SLOT_DEFINITION_INITFORM =
        new Primitive("%slot-definition-initform", PACKAGE_SYS, true,
                      "slot-definition")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((SlotDefinition)arg).slots[SlotDefinitionClass.SLOT_INDEX_INITFORM];
            }
            catch (ClassCastException e) {
                return signalTypeError(arg, Symbol.SLOT_DEFINITION);
            }
        }
    };

    // ### set-slot-definition-initform
    private static final Primitive SET_SLOT_DEFINITION_INITFORM =
        new Primitive("set-slot-definition-initform", PACKAGE_SYS, true,
                      "slot-definition initform")
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                ((SlotDefinition)first).slots[SlotDefinitionClass.SLOT_INDEX_INITFORM] = second;
                return second;
            }
            catch (ClassCastException e) {
                return signalTypeError(first, Symbol.SLOT_DEFINITION);
            }
        }
    };

    // ### %slot-definition-initargs
    private static final Primitive _SLOT_DEFINITION_INITARGS =
        new Primitive("%slot-definition-initargs", PACKAGE_SYS, true,
                      "slot-definition")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((SlotDefinition)arg).slots[SlotDefinitionClass.SLOT_INDEX_INITARGS];
            }
            catch (ClassCastException e) {
                return signalTypeError(arg, Symbol.SLOT_DEFINITION);
            }
        }
    };

    // ### set-slot-definition-initargs
    private static final Primitive SET_SLOT_DEFINITION_INITARGS =
        new Primitive("set-slot-definition-initargs", PACKAGE_SYS, true,
                      "slot-definition initargs")
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                ((SlotDefinition)first).slots[SlotDefinitionClass.SLOT_INDEX_INITARGS] = second;
                return second;
            }
            catch (ClassCastException e) {
                return signalTypeError(first, Symbol.SLOT_DEFINITION);
            }
        }
    };

    // ### %slot-definition-readers
    private static final Primitive _SLOT_DEFINITION_READERS =
        new Primitive("%slot-definition-readers", PACKAGE_SYS, true,
                      "slot-definition")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((SlotDefinition)arg).slots[SlotDefinitionClass.SLOT_INDEX_READERS];
            }
            catch (ClassCastException e) {
                return signalTypeError(arg, Symbol.SLOT_DEFINITION);
            }
        }
    };

    // ### set-slot-definition-readers
    private static final Primitive SET_SLOT_DEFINITION_READERS =
        new Primitive("set-slot-definition-readers", PACKAGE_SYS, true,
                      "slot-definition readers")
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                ((SlotDefinition)first).slots[SlotDefinitionClass.SLOT_INDEX_READERS] = second;
                return second;
            }
            catch (ClassCastException e) {
                return signalTypeError(first, Symbol.SLOT_DEFINITION);
            }
        }
    };

    // ### %slot-definition-writers
    private static final Primitive _SLOT_DEFINITION_WRITERS =
        new Primitive("%slot-definition-writers", PACKAGE_SYS, true,
                      "slot-definition")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((SlotDefinition)arg).slots[SlotDefinitionClass.SLOT_INDEX_WRITERS];
            }
            catch (ClassCastException e) {
                return signalTypeError(arg, Symbol.SLOT_DEFINITION);
            }
        }
    };

    // ### set-slot-definition-writers
    private static final Primitive SET_SLOT_DEFINITION_WRITERS =
        new Primitive("set-slot-definition-writers", PACKAGE_SYS, true,
                      "slot-definition writers")
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                ((SlotDefinition)first).slots[SlotDefinitionClass.SLOT_INDEX_WRITERS] = second;
                return second;
            }
            catch (ClassCastException e) {
                return signalTypeError(first, Symbol.SLOT_DEFINITION);
            }
        }
    };

    // ### %slot-definition-allocation
    private static final Primitive _SLOT_DEFINITION_ALLOCATION =
        new Primitive("%slot-definition-allocation", PACKAGE_SYS, true,
                      "slot-definition")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((SlotDefinition)arg).slots[SlotDefinitionClass.SLOT_INDEX_ALLOCATION];
            }
            catch (ClassCastException e) {
                return signalTypeError(arg, Symbol.SLOT_DEFINITION);
            }
        }
    };

    // ### set-slot-definition-allocation
    private static final Primitive SET_SLOT_DEFINITION_ALLOCATION =
        new Primitive("set-slot-definition-allocation", PACKAGE_SYS, true,
                      "slot-definition allocation")
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                ((SlotDefinition)first).slots[SlotDefinitionClass.SLOT_INDEX_ALLOCATION] = second;
                return second;
            }
            catch (ClassCastException e) {
                return signalTypeError(first, Symbol.SLOT_DEFINITION);
            }
        }
    };

    // ### %slot-definition-allocation-class
    private static final Primitive _SLOT_DEFINITION_ALLOCATION_CLASS =
        new Primitive("%slot-definition-allocation-class", PACKAGE_SYS, true,
                      "slot-definition")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((SlotDefinition)arg).slots[SlotDefinitionClass.SLOT_INDEX_ALLOCATION_CLASS];
            }
            catch (ClassCastException e) {
                return signalTypeError(arg, Symbol.SLOT_DEFINITION);
            }
        }
    };

    // ### set-slot-definition-allocation-class
    private static final Primitive SET_SLOT_DEFINITION_ALLOCATION_CLASS =
        new Primitive("set-slot-definition-allocation-class", PACKAGE_SYS, true,
                      "slot-definition allocation-class")
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                ((SlotDefinition)first).slots[SlotDefinitionClass.SLOT_INDEX_ALLOCATION_CLASS] = second;
                return second;
            }
            catch (ClassCastException e) {
                return signalTypeError(first, Symbol.SLOT_DEFINITION);
            }
        }
    };

    // ### %slot-definition-location
    private static final Primitive _SLOT_DEFINITION_LOCATION =
        new Primitive("%slot-definition-location", PACKAGE_SYS, true, "slot-definition")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((SlotDefinition)arg).slots[SlotDefinitionClass.SLOT_INDEX_LOCATION];
            }
            catch (ClassCastException e) {
                return signalTypeError(arg, Symbol.SLOT_DEFINITION);
            }
        }
    };

    // ### set-slot-definition-location
    private static final Primitive SET_SLOT_DEFINITION_LOCATION =
        new Primitive("set-slot-definition-location", PACKAGE_SYS, true, "slot-definition location")
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                ((SlotDefinition)first).slots[SlotDefinitionClass.SLOT_INDEX_LOCATION] = second;
                return second;
            }
            catch (ClassCastException e) {
                return signalTypeError(first, Symbol.SLOT_DEFINITION);
            }
        }
    };
}
