/*
 * StandardObject.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: StandardObject.java,v 1.37 2004-11-28 15:43:50 piso Exp $
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
//     private Layout layout;
//     private SimpleVector slots;
    public Layout layout; // FIXME! Should be private!
    public SimpleVector slots; // FIXME! Should be private!

    protected StandardObject()
    {
        layout = new Layout(BuiltInClass.STANDARD_OBJECT, NIL, NIL);
    }

    protected StandardObject(LispClass cls, SimpleVector slots)
    {
        layout = cls.getClassLayout();
        Debug.assertTrue(layout != null);
        this.slots = slots;
    }

    public final Layout getInstanceLayout()
    {
        return layout;
    }

    public LispObject getParts() throws ConditionThrowable
    {
        LispObject parts = NIL;
        parts = parts.push(new Cons("LAYOUT", layout));
        if (layout != null) {
            LispObject[] slotNames = layout.getSlotNames();
            if (slotNames != null) {
                for (int i = 0; i < slotNames.length; i++) {
                    parts = parts.push(new Cons(slotNames[i],
                                                slots.getRowMajor(i)));
                }
            }
        }
        return parts.nreverse();
    }

    public final LispClass getLispClass()
    {
        return layout.getLispClass();
    }

    public LispObject typeOf()
    {
        // "For objects of metaclass structure-class or standard-class, and for
        // conditions, type-of returns the proper name of the class returned by
        // class-of if it has a proper name, and otherwise returns the class
        // itself."
        Symbol symbol = layout.getLispClass().getSymbol();
        if (symbol != NIL)
            return symbol;
        return layout.getLispClass();
    }

    public LispObject classOf()
    {
        return layout.getLispClass();
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.STANDARD_OBJECT)
            return T;
        if (type == BuiltInClass.STANDARD_OBJECT)
            return T;
        LispClass cls = layout != null ? layout.getLispClass() : null;
        if (cls != null) {
            if (type == cls)
                return T;
            if (type == cls.getSymbol())
                return T;
            LispObject cpl = cls.getCPL();
            while (cpl != NIL) {
                if (type == cpl.car())
                    return T;
                if (type == ((LispClass)cpl.car()).getSymbol())
                    return T;
                cpl = cpl.cdr();
            }
        }
        return super.typep(type);
    }

    public String writeToString() throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        int maxLevel = Integer.MAX_VALUE;
        LispObject printLevel = _PRINT_LEVEL_.symbolValue(thread);
        if (printLevel instanceof Fixnum)
            maxLevel = ((Fixnum)printLevel).value;
        LispObject currentPrintLevel =
            _CURRENT_PRINT_LEVEL_.symbolValue(thread);
        int currentLevel = Fixnum.getValue(currentPrintLevel);
        if (currentLevel >= maxLevel)
            return "#";
        LispClass cls = layout.getLispClass();
        return unreadableString(cls != null ? cls.getSymbol().getName() : "STANDARD-OBJECT");
    }

}
