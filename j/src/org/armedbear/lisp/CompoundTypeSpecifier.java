/*
 * CompoundTypeSpecifier.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: CompoundTypeSpecifier.java,v 1.3 2003-07-15 15:36:35 piso Exp $
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

public abstract class CompoundTypeSpecifier extends TypeSpecifier
{
    public static TypeSpecifier getInstance(LispObject args)
        throws LispError
    {
        Cons cons = checkCons(args);
        LispObject car = cons.car();
        if (car == Symbol.OR)
            return new OrTypeSpecifier(cons);
        if (car == Symbol.ARRAY || car == Symbol.SIMPLE_ARRAY)
            return new ArrayTypeSpecifier(cons);
        if (car == Symbol.VECTOR)
            return new VectorTypeSpecifier(cons);
        throw new LispError("unsupported compound type specifier " + args);
    }
}
