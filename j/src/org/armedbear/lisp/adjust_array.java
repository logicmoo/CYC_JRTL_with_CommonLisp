/*
 * adjust_array.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: adjust_array.java,v 1.6 2004-02-23 19:56:58 piso Exp $
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

// ### %adjust-array array new-dimensions element-type initial-element
// initial-element-p initial-contents fill-pointer displaced-to displaced-index-offset
// => new-array
public final class adjust_array extends Primitive
{
    public adjust_array()
    {
        super("%adjust-array", PACKAGE_SYS, false);
    }

    public LispObject execute(LispObject[] args) throws ConditionThrowable
    {
        if (args.length != 9)
            return signal(new WrongNumberOfArgumentsException(this));
        AbstractArray array = checkArray(args[0]);
        LispObject dimensions = args[1];
        LispObject elementType = args[2];
        LispObject initialElement = args[3];
        LispObject initialElementProvided = args[4];
        LispObject initialContents = args[5];
        LispObject fillPointer = args[6];
        LispObject displacedTo = args[7];
        LispObject displacedIndexOffset = args[8];
        if (initialElementProvided != NIL && initialContents != NIL) {
            return signal(new LispError("ADJUST-ARRAY: cannot specify both initial element and initial contents."));
        }
        if (elementType != array.getElementType() &&
            getUpgradedArrayElementType(elementType) != array.getElementType())
        {
            return signal(new LispError("ADJUST-ARRAY: incompatible element type."));
        }
        final int displacement;
        if (displacedIndexOffset == NIL)
            displacement = 0;
        else
            displacement = Fixnum.getValue(displacedIndexOffset);
        if (array instanceof Vector) {
            Vector v = (Vector) array;
            LispObject newSize = null;
            if (dimensions instanceof Cons) {
                if (dimensions.length() == 1)
                    newSize = dimensions.car();
            } else
                newSize = dimensions;
            if (newSize != null) {
                v.adjustArray(Fixnum.getValue(newSize), initialElement,
                              initialContents);
                if (fillPointer != NIL)
                    v.setFillPointer(fillPointer);
                return v;
            }
        }
        if (array instanceof SimpleString) {
            SimpleString s = (SimpleString) array;
            LispObject newSize = null;
            if (dimensions instanceof Cons) {
                if (dimensions.length() == 1)
                    newSize = dimensions.car();
            } else
                newSize = dimensions;
            if (newSize != null) {
                AbstractString s2;
                if (displacedTo != NIL)
                    s2 = (AbstractString) s.adjustArray(Fixnum.getValue(newSize),
                                                        checkArray(displacedTo),
                                                        displacement);
                else
                    s2 = (AbstractString) s.adjustArray(Fixnum.getValue(newSize),
                                                        initialElement,
                                                        initialContents);
                if (fillPointer != NIL)
                    s2.setFillPointer(fillPointer);
                return s2;
            }
        }
        if (array instanceof ComplexString) {
            ComplexString s = (ComplexString) array;
            LispObject newSize = null;
            if (dimensions instanceof Cons) {
                if (dimensions.length() == 1)
                    newSize = dimensions.car();
            } else
                newSize = dimensions;
            if (newSize != null) {
                if (displacedTo != NIL)
                    s.adjustArray(Fixnum.getValue(newSize),
                                  checkArray(displacedTo),
                                  displacement);
                else
                    s.adjustArray(Fixnum.getValue(newSize), initialElement,
                                  initialContents);
                if (fillPointer != NIL)
                    s.setFillPointer(fillPointer);
                return s;
            }
        }
        return signal(new LispError("ADJUST-ARRAY: unsupported case."));
    }

    private static final Primitive _ADJUST_ARRAY = new adjust_array();
}
