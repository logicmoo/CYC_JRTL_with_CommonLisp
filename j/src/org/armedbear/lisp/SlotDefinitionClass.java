/*
 * SlotDefinitionClass.java
 *
 * Copyright (C) 2005 Peter Graves
 * $Id$
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

public final class SlotDefinitionClass extends StandardClass
{
    public static final int SLOT_INDEX_NAME             = 0;
    public static final int SLOT_INDEX_INITFUNCTION     = 1;
    public static final int SLOT_INDEX_INITFORM         = 2;
    public static final int SLOT_INDEX_INITARGS         = 3;
    public static final int SLOT_INDEX_READERS          = 4;
    public static final int SLOT_INDEX_WRITERS          = 5;
    public static final int SLOT_INDEX_ALLOCATION       = 6;
    public static final int SLOT_INDEX_ALLOCATION_CLASS = 7;
    public static final int SLOT_INDEX_LOCATION         = 8;

    public SlotDefinitionClass()
    {
        super(Symbol.SLOT_DEFINITION, list1(StandardClass.STANDARD_OBJECT));
        Package pkg = PACKAGE_SYS;
        LispObject[] instanceSlotNames = {
            pkg.intern("NAME"),
            pkg.intern("INITFUNCTION"),
            pkg.intern("INITFORM"),
            pkg.intern("INITARGS"),
            pkg.intern("READERS"),
            pkg.intern("WRITERS"),
            pkg.intern("ALLOCATION"),
            pkg.intern("ALLOCATION-CLASS"),
            pkg.intern("LOCATION")
        };
        setClassLayout(new Layout(this, instanceSlotNames, NIL));
        setFinalized(true);
    }
}
