/*
 * StructureObject.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: StructureObject.java,v 1.28 2004-05-23 15:26:19 piso Exp $
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

    public LispClass classOf()
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

    public String writeToString() throws ConditionThrowable
    {
        // FIXME
        if (typep(Symbol.RESTART) != NIL) {
            Symbol PRINT_RESTART = PACKAGE_SYS.intern("PRINT-RESTART");
            LispObject fun = PRINT_RESTART.getSymbolFunction();
            StringOutputStream stream = new StringOutputStream();
            funcall2(fun, this, stream, LispThread.currentThread());
            return stream.getString().getStringValue();
        }
        StringBuffer sb = new StringBuffer("#S(");
        try {
            LispObject effectiveSlots = structureClass.getEffectiveSlots();
            LispObject[] effectiveSlotsArray = effectiveSlots.copyToArray();
            Debug.assertTrue(effectiveSlotsArray.length == slots.length);
            sb.append(structureClass.getSymbol().writeToString());
            final LispObject printLength = _PRINT_LENGTH_.symbolValue();
            final int limit;
            if (printLength instanceof Fixnum)
                limit = Math.min(slots.length,
                                 ((Fixnum)printLength).getValue());
            else
                limit = slots.length;
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
                sb.append(slots[i].writeToString());
            }
            if (limit < slots.length)
                sb.append(" ...");
        }
        catch (Throwable t) {
            Debug.trace(t);
        }
        sb.append(')');
        return sb.toString();
    }

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
                return signal(new LispError("internal error"));
            }
        }
    };

    private static final Primitive1 _STRUCTURE_REF_0 =
        new Primitive1("%structure-ref-0", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((StructureObject)arg).slots[0];
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.STRUCTURE_OBJECT));
            }
            catch (ArrayIndexOutOfBoundsException e) {
                // Shouldn't happen.
                return signal(new LispError("internal error"));
            }
        }
    };

    private static final Primitive1 _STRUCTURE_REF_1 =
        new Primitive1("%structure-ref-1", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((StructureObject)arg).slots[1];
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.STRUCTURE_OBJECT));
            }
            catch (ArrayIndexOutOfBoundsException e) {
                // Shouldn't happen.
                return signal(new LispError("internal error"));
            }
        }
    };

    private static final Primitive1 _STRUCTURE_REF_2 =
        new Primitive1("%structure-ref-2", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((StructureObject)arg).slots[2];
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.STRUCTURE_OBJECT));
            }
            catch (ArrayIndexOutOfBoundsException e) {
                // Shouldn't happen.
                return signal(new LispError("internal error"));
            }
        }
    };

    // ### %structure-set
    // %structure-set instance index new-value => new-value
    private static final Primitive3 _STRUCTURE_SET =
        new Primitive3("%structure-set", PACKAGE_SYS, false)
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
                return signal(new LispError("internal error"));
            }
        }
    };

    private static final Primitive1 _STRUCTURE_SET_0 =
        new Primitive1("%structure-set-0", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                ((StructureObject)first).slots[0] = second;
                return second;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(first, Symbol.STRUCTURE_OBJECT));
            }
            catch (ArrayIndexOutOfBoundsException e) {
                // Shouldn't happen.
                return signal(new LispError("internal error"));
            }
        }
    };

    private static final Primitive1 _STRUCTURE_SET_1 =
        new Primitive1("%structure-set-1", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                ((StructureObject)first).slots[1] = second;
                return second;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(first, Symbol.STRUCTURE_OBJECT));
            }
            catch (ArrayIndexOutOfBoundsException e) {
                // Shouldn't happen.
                return signal(new LispError("internal error"));
            }
        }
    };

    private static final Primitive1 _STRUCTURE_SET_2 =
        new Primitive1("%structure-set-2", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                ((StructureObject)first).slots[2] = second;
                return second;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(first, Symbol.STRUCTURE_OBJECT));
            }
            catch (ArrayIndexOutOfBoundsException e) {
                // Shouldn't happen.
                return signal(new LispError("internal error"));
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
