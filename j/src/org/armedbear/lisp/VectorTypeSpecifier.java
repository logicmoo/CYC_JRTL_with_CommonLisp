/*
 * VectorTypeSpecifier.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: VectorTypeSpecifier.java,v 1.1 2003-07-15 03:06:14 piso Exp $
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
    private final LispObject type;
    private final LispObject elementType;
    private final LispObject size;

    public VectorTypeSpecifier(Cons args) throws LispError
    {
        this.type = args.car();
        switch (args.length()) {
            case 1:
                elementType = Symbol.UNSPECIFIED;
                size = Symbol.UNSPECIFIED;
                break;
            case 2:
                elementType = args.cadr();
                size = Symbol.UNSPECIFIED;
                break;
            case 3:
                elementType = args.cadr();
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
            if (elementType != Symbol.UNSPECIFIED) {
                if (elementType != v.getElementType())
                    return NIL;
            }
            if (size == Symbol.UNSPECIFIED)
                return T;
            if (Fixnum.getValue(size) == v.capacity())
                return T;
        }
        return NIL;
    }
}
