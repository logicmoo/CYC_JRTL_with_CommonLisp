/*
 * VectorTypeSpecifier.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: VectorTypeSpecifier.java,v 1.2 2003-08-14 01:52:50 piso Exp $
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

public final class VectorTypeSpecifier extends CompoundTypeSpecifier
{
    private final TypeSpecifier elementTypeSpecifier;
    private final LispObject size;

    public VectorTypeSpecifier(Cons args) throws LispError
    {
        switch (args.length()) {
            case 1:
                elementTypeSpecifier = UnspecifiedTypeSpecifier.getInstance();
                size = Symbol.UNSPECIFIED;
                break;
            case 2:
                elementTypeSpecifier = TypeSpecifier.getInstance(args.cadr());
                size = Symbol.UNSPECIFIED;
                break;
            case 3:
                elementTypeSpecifier = TypeSpecifier.getInstance(args.cadr());
                size = args.cddr().car();
                break;
            default:
                throw new LispError("bad type specifier: " + args);
        }
    }

    public LispObject test(LispObject obj) throws LispError
    {
        if (obj instanceof AbstractVector) {
            AbstractVector v = (AbstractVector) obj;
            if (elementTypeSpecifier != UnspecifiedTypeSpecifier.getInstance()) {
                TypeSpecifier ts = TypeSpecifier.getInstance(v.getElementType());
                if (elementTypeSpecifier.isSubtypeOf(ts) == NIL) {
                    LispThread.currentThread().setValues(null);
                    return NIL;
                }
                LispThread.currentThread().setValues(null);
            }
            if (size == Symbol.UNSPECIFIED)
                return T;
            if (Fixnum.getValue(size) == v.capacity())
                return T;
        }
        return NIL;
    }
}
