/*
 * ArrayTypeSpecifier.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: ArrayTypeSpecifier.java,v 1.5 2003-09-11 16:34:55 piso Exp $
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

public final class ArrayTypeSpecifier extends CompoundTypeSpecifier
{
    private final Type type;
    private final LispObject elementType;
    private final LispObject dimensions;

    public ArrayTypeSpecifier(Cons args) throws LispError
    {
        type = Type.getInstance(args.car());
        Debug.assertTrue(type == Type.ARRAY || type == Type.SIMPLE_ARRAY);
        switch (args.length()) {
            case 1:
                elementType = Symbol.UNSPECIFIED;
                dimensions = Symbol.UNSPECIFIED;
                break;
            case 2:
                elementType = args.cadr();
                dimensions = Symbol.UNSPECIFIED;
                break;
            case 3:
                elementType = args.cadr();
                dimensions = args.cddr().car();
                break;
            default:
                throw new LispError("bad type specifier: " + args);
        }
    }

    public LispObject test(LispObject obj) throws LispError
    {
        if (obj instanceof AbstractArray) {
            AbstractArray a = (AbstractArray) obj;
            if (elementType != Symbol.UNSPECIFIED) {
                if (elementType != a.getElementType())
                    return NIL;
            }
            if (dimensions == Symbol.UNSPECIFIED)
                return T;
            int rank = a.getRank();
            if (dimensions == NIL)
                return rank == 0 ? T : NIL;
            if (dimensions instanceof Fixnum)
                return ((Fixnum)dimensions).getValue() == rank ? T : NIL;
            if (dimensions instanceof Cons) {
                if (dimensions.length() != rank)
                    return NIL;
                LispObject dims = dimensions;
                for (int i = 0; i < rank; i++) {
                    LispObject dim = dims.car();
                    if (dim == Symbol.UNSPECIFIED)
                        ;
                    else if (dim instanceof Fixnum) {
                        if (((Fixnum)dim).getValue() != a.getDimension(i))
                            return NIL;
                    } else
                        return NIL;
                    dims = dims.cdr();
                }
                return T;
            }
        }
        return NIL;
    }

    public LispObject isSubtypeOf(TypeSpecifier ts) throws LispError
    {
        if (ts instanceof AtomicTypeSpecifier) {
            AtomicTypeSpecifier ats = (AtomicTypeSpecifier) ts;
            return type.isSubtypeOf(ats.TYPE());
        }
        LispObject subtypep = NIL;
        LispObject validp = NIL;
        if (ts instanceof ArrayTypeSpecifier) {
            ArrayTypeSpecifier ats = (ArrayTypeSpecifier) ts;
            if (type == ats.type) {
                if (elementType == ats.elementType) {
                    if (dimensions == ats.dimensions) {
                        subtypep = T;
                        validp = T;
                    }
                }
            }
        }
        return values(subtypep, validp);
    }
}
