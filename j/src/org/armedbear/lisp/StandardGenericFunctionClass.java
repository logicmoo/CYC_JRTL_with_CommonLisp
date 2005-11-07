/*
 * StandardGenericFunctionClass.java
 *
 * Copyright (C) 2005 Peter Graves
 * $Id: StandardGenericFunctionClass.java,v 1.7 2005-11-07 20:33:16 piso Exp $
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

public final class StandardGenericFunctionClass extends StandardClass
{
    public static final int SLOT_INDEX_NAME                      = 0;
    public static final int SLOT_INDEX_LAMBDA_LIST               = 1;
    public static final int SLOT_INDEX_REQUIRED_ARGS             = 2;
    public static final int SLOT_INDEX_INITIAL_METHODS           = 3;
    public static final int SLOT_INDEX_METHODS                   = 4;
    public static final int SLOT_INDEX_METHOD_CLASS              = 5;
    public static final int SLOT_INDEX_METHOD_COMBINATION        = 6;
    public static final int SLOT_INDEX_ARGUMENT_PRECEDENCE_ORDER = 7;
    public static final int SLOT_INDEX_CLASSES_TO_EMF_TABLE      = 8;
    public static final int SLOT_INDEX_DOCUMENTATION             = 9;

    public StandardGenericFunctionClass()
    {
        super(Symbol.STANDARD_GENERIC_FUNCTION, list1(StandardClass.GENERIC_FUNCTION));
        Package pkg = PACKAGE_SYS;
        LispObject[] instanceSlotNames = {
            pkg.intern("NAME"),
            pkg.intern("LAMBDA-LIST"),
            pkg.intern("REQUIRED-ARGS"),
            pkg.intern("INITIAL-METHODS"),
            pkg.intern("METHODS"),
            pkg.intern("METHOD-CLASS"),
            pkg.intern("METHOD-COMBINATION"),
            pkg.intern("ARGUMENT-PRECEDENCE-ORDER"),
            pkg.intern("CLASSES-TO-EMF-TABLE"),
            Symbol.DOCUMENTATION
        };
        setClassLayout(new Layout(this, instanceSlotNames, NIL));
        setFinalized(true);
    }

    public LispObject allocateInstance()
    {
        return new StandardGenericFunction();
    }
}
