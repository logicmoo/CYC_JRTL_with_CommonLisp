/*
 * StructureObject.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: StructureObject.java,v 1.2 2003-07-12 15:28:01 piso Exp $
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
    private final Symbol name;
    private final LispObject[] slots;

    public StructureObject(Symbol name, LispObject list) throws LispError
    {
        this.name = name;
        slots = list.copyToArray();
    }

    public LispObject typeOf()
    {
        return Symbol.STRUCTURE_OBJECT;
    }

    public LispObject get(int index) throws LispError
    {
        try {
            return slots[index];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            getStandardOutput().printStackTrace(e);
            throw new LispError("internal error");
        }
    }

    public void set(int index, LispObject newValue) throws LispError
    {
        try {
            slots[index] = newValue;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            getStandardOutput().printStackTrace(e);
            throw new LispError("internal error");
        }
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("#S(");
        // FIXME Use *PRINT-LENGTH*.
        final int limit = Math.min(slots.length, 10);
        for (int i = 0; i < limit; i++) {
            if (i > 0)
                sb.append(' ');
            sb.append(slots[i]);
        }
        if (limit < slots.length)
            sb.append(" ...");
        sb.append(')');
        return sb.toString();
    }

    // ### %instance-ref
    // %instance-ref instance index => value
    private static final Primitive2 _STRUCTURE_REF =
        new Primitive2("%structure-ref", PACKAGE_SYS, false) {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            try {
                return ((StructureObject)first).get(((Fixnum)second).getValue());
            }
            catch (ClassCastException e) {
                throw new TypeError();
            }
        }
    };

    // ### %instance-set
    // %instance-set instance index new-value => new-value
    private static final Primitive3 _STRUCTURE_SET =
        new Primitive3("%structure-set", PACKAGE_SYS, false) {
        public LispObject execute(LispObject first, LispObject second,
                                  LispObject third)
            throws LispError
        {
            try {
                ((StructureObject)first).set(((Fixnum)second).getValue(), third);
                return third;
            }
            catch (ClassCastException e) {
                throw new TypeError();
            }
        }
    };

    // ### %make-structure
    // %make-structure name slot-values => object
    private static final Primitive2 _MAKE_STRUCTURE =
        new Primitive2("%make-structure", PACKAGE_SYS, false) {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            return new StructureObject(checkSymbol(first), checkList(second));
        }
    };
}
