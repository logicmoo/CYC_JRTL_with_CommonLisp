/*
 * SimpleVectorTypeSpecifier.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: SimpleVectorTypeSpecifier.java,v 1.1 2003-08-14 01:53:37 piso Exp $
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

public final class SimpleVectorTypeSpecifier extends CompoundTypeSpecifier
{
    private final LispObject size;

    public SimpleVectorTypeSpecifier(Cons args) throws LispError
    {
        Debug.assertTrue(args.car() == Symbol.SIMPLE_VECTOR);
        switch (args.length()) {
            case 1:
                size = Symbol.UNSPECIFIED;
                break;
            case 2:
                size = args.cadr();
                break;
            default:
                throw new LispError("bad type specifier: " + args);
        }
    }

    public LispObject test(LispObject obj) throws LispError
    {
        if (obj instanceof AbstractVector) {
            AbstractVector v = (AbstractVector) obj;
            if (v.isSimpleVector()) {
                if (size == Symbol.UNSPECIFIED)
                    return T;
                if (Fixnum.getValue(size) == v.capacity())
                    return T;
            }
        }
        return NIL;
    }
}
