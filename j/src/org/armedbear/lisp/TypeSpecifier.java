/*
 * TypeSpecifier.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: TypeSpecifier.java,v 1.5 2003-09-12 01:34:02 piso Exp $
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

public abstract class TypeSpecifier extends LispObject
{
    public static TypeSpecifier getInstance(LispObject arg) throws LispError
    {
        if (arg == Symbol.UNSPECIFIED)
            return UnspecifiedTypeSpecifier.getInstance();
        if (arg == Symbol.INTEGER)
            return new IntegerTypeSpecifier();
        if (arg instanceof Symbol)
            return new AtomicTypeSpecifier((Symbol)arg);
        if (arg instanceof LispClass)
            return new ClassTypeSpecifier((LispClass)arg);
        if (arg instanceof Cons)
            return CompoundTypeSpecifier.getInstance(arg);
        throw new LispError("bad type specifier: " + arg);
    }

    public LispObject test(LispObject obj) throws LispError
    {
        throw new LispError(String.valueOf(getClass()) + ".test(): not implemented");
    }

    public LispObject isSubtypeOf(TypeSpecifier ts) throws LispError
    {
        return values(NIL, NIL);
    }
}
