/*
 * StructureClass.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: StructureClass.java,v 1.7 2004-01-24 20:14:15 piso Exp $
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

public class StructureClass extends SlotClass
{
    private StructureClass(Symbol symbol)
    {
        super(symbol, new Cons(BuiltInClass.STRUCTURE_OBJECT));
    }

    public StructureClass(Symbol symbol, LispObject directSuperclasses)
    {
        super(symbol, directSuperclasses);
    }

    public LispObject typeOf()
    {
        return Symbol.STRUCTURE_CLASS;
    }

    public LispClass classOf()
    {
        return BuiltInClass.STRUCTURE_CLASS;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.STRUCTURE_CLASS)
            return T;
        if (type == BuiltInClass.STRUCTURE_CLASS)
            return T;
        return super.typep(type);
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("#<STRUCTURE-CLASS ");
        sb.append(symbol.getName());
        sb.append('>');
        return sb.toString();
    }

    // ### make-structure-class
    private static final Primitive3 MAKE_STRUCTURE_CLASS =
        new Primitive3("make-structure-class", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second,
                                  LispObject third)
            throws ConditionThrowable
        {
            Symbol symbol = checkSymbol(first);
            LispObject directSlots = checkList(second);
            LispObject slots = checkList(third);
            StructureClass c = new StructureClass(symbol);
            c.setCPL(c, BuiltInClass.STRUCTURE_OBJECT, BuiltInClass.CLASS_T);
            c.setDirectSlots(directSlots);
            c.setEffectiveSlots(slots);
            addClass(symbol, c);
            return c;
        }
    };
}
