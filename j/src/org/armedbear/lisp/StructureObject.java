/*
 * StructureObject.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: StructureObject.java,v 1.36 2004-11-03 15:06:05 piso Exp $
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

public final class StructureObject extends LispObject
{
    private final LispClass structureClass;
    private final LispObject[] slots;

    public StructureObject(Symbol symbol, LispObject list) throws ConditionThrowable
    {
        structureClass = LispClass.findClass(symbol); // Might return null.
        Debug.assertTrue(structureClass instanceof StructureClass);
        slots = list.copyToArray();
    }

    public StructureObject(StructureObject obj)
    {
        this.structureClass = obj.structureClass;
        slots = new LispObject[obj.slots.length];
        for (int i = slots.length; i-- > 0;)
            slots[i] = obj.slots[i];
    }

    public LispObject typeOf()
    {
        return structureClass.getSymbol();
    }

    public LispObject classOf()
    {
        return structureClass;
    }

    public LispObject getParts() throws ConditionThrowable
    {
        LispObject result = NIL;
        result = result.push(new Cons("class", structureClass));
        LispObject effectiveSlots = structureClass.getEffectiveSlots();
        LispObject[] effectiveSlotsArray = effectiveSlots.copyToArray();
        for (int i = 0; i < slots.length; i++) {
            SimpleVector slotDefinition = (SimpleVector) effectiveSlotsArray[i];
            LispObject slotName = slotDefinition.getRowMajor(1);
            result = result.push(new Cons(slotName, slots[i]));
        }
        return result.nreverse();
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type instanceof StructureClass)
            return memq(type, structureClass.getCPL()) ? T : NIL;
        if (type == structureClass.getSymbol())
            return T;
        if (type == Symbol.STRUCTURE_OBJECT)
            return T;
        if (type == BuiltInClass.STRUCTURE_OBJECT)
            return T;
        if (type instanceof Symbol) {
            LispClass c = LispClass.findClass((Symbol)type);
            if (c != null) {
                return memq(c, structureClass.getCPL()) ? T : NIL;
            }
        }
        return super.typep(type);
    }

    public boolean equalp(LispObject obj) throws ConditionThrowable
    {
        if (this == obj)
            return true;
        if (obj instanceof StructureObject) {
            StructureObject o = (StructureObject) obj;
            if (structureClass != o.structureClass)
                return false;
            for (int i = 0; i < slots.length; i++) {
                if (!slots[i].equalp(o.slots[i]))
                    return false;
            }
            return true;
        }
        return false;
    }

    public LispObject getSlotValue(int index) throws ConditionThrowable
    {
        try {
            return slots[index];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            return signal(new LispError("Invalid slot index " + index +
                                        "  for " + writeToString()));
        }
    }

    public LispObject setSlotValue(int index, LispObject value)
        throws ConditionThrowable
    {
        try {
            slots[index] = value;
            return value;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            return signal(new LispError("Invalid slot index " + index +
                                        "  for " + writeToString()));
        }
    }

    public String writeToString() throws ConditionThrowable
    {
        try {
            final LispThread thread = LispThread.currentThread();
            // FIXME
            if (typep(Symbol.RESTART) != NIL) {
                Symbol PRINT_RESTART = PACKAGE_SYS.intern("PRINT-RESTART");
                LispObject fun = PRINT_RESTART.getSymbolFunction();
                StringOutputStream stream = new StringOutputStream();
                funcall2(fun, this, stream, thread);
                return stream.getString().getStringValue();
            }
            if (_PRINT_STRUCTURE_.symbolValue(thread) == NIL)
                return unreadableString(structureClass.getSymbol().writeToString());
            int maxLevel = Integer.MAX_VALUE;
            LispObject printLevel = _PRINT_LEVEL_.symbolValue(thread);
            if (printLevel instanceof Fixnum)
                maxLevel = ((Fixnum)printLevel).value;
            LispObject currentPrintLevel =
                _CURRENT_PRINT_LEVEL_.symbolValue(thread);
            int currentLevel = Fixnum.getValue(currentPrintLevel);
            if (currentLevel >= maxLevel && slots.length > 0)
                return "#";
            StringBuffer sb = new StringBuffer("#S(");
            sb.append(structureClass.getSymbol().writeToString());
            if (currentLevel < maxLevel) {
                LispObject effectiveSlots = structureClass.getEffectiveSlots();
                LispObject[] effectiveSlotsArray = effectiveSlots.copyToArray();
                Debug.assertTrue(effectiveSlotsArray.length == slots.length);
                final LispObject printLength = _PRINT_LENGTH_.symbolValue(thread);
                final int limit;
                if (printLength instanceof Fixnum)
                    limit = Math.min(slots.length,
                                     ((Fixnum)printLength).getValue());
                else
                    limit = slots.length;
                final boolean printCircle =
                    _PRINT_CIRCLE_.symbolValue(thread) != NIL;
                for (int i = 0; i < limit; i++) {
                    sb.append(' ');
                    SimpleVector slotDefinition = (SimpleVector) effectiveSlotsArray[i];
                    LispObject slotName = slotDefinition.getRowMajor(1);
                    if (slotName instanceof Symbol) {
                        sb.append(':');
                        sb.append(((Symbol)slotName).getName());
                    } else
                        sb.append(slotName);
                    sb.append(' ');
                    if (printCircle) {
                        StringOutputStream stream = new StringOutputStream();
                        funcall2(Symbol.OUTPUT_OBJECT.getSymbolFunction(),
                                 slots[i], stream, thread);
                        sb.append(stream.getString().getStringValue());
                    } else
                        sb.append(slots[i].writeToString());
                }
                if (limit < slots.length)
                    sb.append(" ...");
            }
            sb.append(')');
            return sb.toString();
        }
        catch (StackOverflowError e) {
            signal(new StorageCondition("Stack overflow."));
            return null; // Not reached.
        }
    }

    // ### structure-length instance => length
    private static final Primitive STRUCTURE_LENGTH =
        new Primitive("structure-length", PACKAGE_SYS, true, "instance")
    {
        public LispObject execute(LispObject arg)
            throws ConditionThrowable
        {
            try {
                return new Fixnum(((StructureObject)arg).slots.length);
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.STRUCTURE_OBJECT));
            }
        }
    };

    // ### %structure-ref
    // %structure-ref instance index => value
    private static final Primitive2 _STRUCTURE_REF =
        new Primitive2("%structure-ref", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                return ((StructureObject)first).slots[((Fixnum)second).getValue()];
            }
            catch (ClassCastException e) {
                if (first instanceof StructureObject)
                    return signal(new TypeError(second, Symbol.FIXNUM));
                else
                    return signal(new TypeError(first, Symbol.STRUCTURE_OBJECT));
            }
            catch (ArrayIndexOutOfBoundsException e) {
                // Shouldn't happen.
                return signal(new LispError("Internal error."));
            }
        }
    };

    // ### %structure-set
    // %structure-set instance index new-value => new-value
    private static final Primitive _STRUCTURE_SET =
        new Primitive("%structure-set", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second,
                                  LispObject third)
            throws ConditionThrowable
        {
            try {
                ((StructureObject)first).slots[((Fixnum)second).getValue()] = third;
                return third;
            }
            catch (ClassCastException e) {
                return signal(new TypeError());
            }
            catch (ArrayIndexOutOfBoundsException e) {
                // Shouldn't happen.
                return signal(new LispError("Internal error."));
            }
        }
    };

    // ### %make-structure
    // %make-structure name slot-values => object
    private static final Primitive2 _MAKE_STRUCTURE =
        new Primitive2("%make-structure", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            return new StructureObject(checkSymbol(first), checkList(second));
        }
    };

    // ### copy-structure
    // copy-structure structure => copy
    private static final Primitive1 COPY_STRUCTURE =
        new Primitive1("copy-structure", "structure")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return new StructureObject((StructureObject)arg);
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, "STRUCTURE-OBJECT"));
            }
        }
    };
}
