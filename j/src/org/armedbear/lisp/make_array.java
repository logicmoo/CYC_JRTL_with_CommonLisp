/*
 * make_array.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: make_array.java,v 1.14 2004-02-24 01:54:40 piso Exp $
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

// ### %make-array dimensions element-type initial-element initial-element-p
// initial-contents adjustable fill-pointer displaced-to displaced-index-offset
// => new-array
public final class make_array extends Primitive
{
    public make_array()
    {
        super("%make-array", PACKAGE_SYS, false);
    }

    public LispObject execute(LispObject[] args) throws ConditionThrowable
    {
        if (args.length != 9)
            return signal(new WrongNumberOfArgumentsException(this));
        LispObject dimensions = args[0];
        LispObject elementType = args[1];
        LispObject initialElement = args[2];
        LispObject initialElementProvided = args[3];
        LispObject initialContents = args[4];
        LispObject adjustable = args[5];
        LispObject fillPointer = args[6];
        LispObject displacedTo = args[7];
        LispObject displacedIndexOffset = args[8];
        if (initialElementProvided != NIL && initialContents != NIL) {
            return signal(new LispError("MAKE-ARRAY: cannot specify both " +
                                        ":INITIAL-ELEMENT AND :INITIAL-CONTENTS"));
        }
        final int rank = dimensions.listp() ? dimensions.length() : 1;
        int[] dimv = new int[rank];
        if (dimensions.listp()) {
            for (int i = 0; i < rank; i++) {
                LispObject dim = dimensions.car();
                dimv[i] = Fixnum.getValue(dim);
                dimensions = dimensions.cdr();
            }
        } else
            dimv[0] = Fixnum.getValue(dimensions);
        if (displacedTo != NIL) {
            final AbstractArray array = checkArray(displacedTo);
            if (initialElementProvided != NIL)
                return signal(new LispError(":INITIAL-ELEMENT must not be specified with :DISPLACED-TO"));
            if (initialContents != NIL)
                return signal(new LispError(":INITIAL-CONTENTS must not be specified with :DISPLACED-TO"));
            final int displacement;
            if (displacedIndexOffset != NIL)
                displacement = Fixnum.getValue(displacedIndexOffset);
            else
                displacement = 0;
            if (rank == 1 && array.stringp()) {
                ComplexString string = new ComplexString(dimv[0], array, displacement);
                if (fillPointer != NIL)
                    string.setFillPointer(fillPointer);
                return string;
            }
            DisplacedArray displacedArray = new DisplacedArray(dimv, array, displacement);
            if (rank == 1 && fillPointer != NIL)
                displacedArray.setFillPointer(fillPointer);
            return displacedArray;
        }
        if (rank == 1) {
            final int size = dimv[0];
            int limit =
                Fixnum.getValue(Symbol.ARRAY_DIMENSION_LIMIT.getSymbolValue());
            if (size < 0 || size >= limit) {
                StringBuffer sb = new StringBuffer();
                sb.append("The size specified for this array (");
                sb.append(size);
                sb.append(')');
                if (size >= limit) {
                    sb.append(" is >= ARRAY-DIMENSION-LIMIT (");
                    sb.append(limit);
                    sb.append(").");
                } else
                    sb.append(" is negative.");
                return signal(new LispError(sb.toString()));
            }
            AbstractVector v;
            LispObject upgradedType =
                getUpgradedArrayElementType(elementType);
            if (upgradedType == Symbol.CHARACTER) {
                if (fillPointer != NIL || adjustable != NIL)
                    v = new ComplexString(size);
                else
                    v = new SimpleString(size);
            } else if (upgradedType == Symbol.BIT)
                v = new BitVector(size);
            else if (upgradedType == NIL)
                v = new NilVector(size);
            else {
                if (fillPointer != NIL || adjustable != NIL)
                    v = new Vector(size);
                else
                    v = new SimpleVector(size);
            }
            if (initialElementProvided != NIL) {
                // Initial element was specified.
                v.fill(initialElement);
            } else if (initialContents != NIL) {
                if (initialContents.listp()) {
                    LispObject list = initialContents;
                    for (int i = 0; i < size; i++) {
                        v.set(i, list.car());
                        list = list.cdr();
                    }
                } else if (initialContents.vectorp()) {
                    for (int i = 0; i < size; i++)
                        v.set(i, initialContents.elt(i));
                } else
                    return signal(new TypeError(initialContents, Symbol.SEQUENCE));
            }
            if (fillPointer != NIL)
                v.setFillPointer(fillPointer);
            return v;
        }
        // rank != 1
        Array array;
        if (initialContents != NIL) {
            array = new Array(dimv, initialContents);
        } else {
            array = new Array(dimv);
            if (initialElementProvided != NIL)
                array.fill(initialElement);
        }
        return array;
    }

    private static final Primitive _MAKE_ARRAY = new make_array();
}
