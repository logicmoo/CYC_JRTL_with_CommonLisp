/*
 * ClassTypeSpecifier.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: ClassTypeSpecifier.java,v 1.1 2003-07-15 17:31:56 piso Exp $
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

public class ClassTypeSpecifier extends TypeSpecifier
{
    private final LispClass c;

    public ClassTypeSpecifier(LispClass c) throws LispError
    {
        this.c = c;
    }

    public final LispClass getLispClass()
    {
        return c;
    }

    public LispObject isSubtypeOf(TypeSpecifier ts) throws LispError
    {
        if (ts instanceof AtomicTypeSpecifier) {
            AtomicTypeSpecifier ats = (AtomicTypeSpecifier) ts;
            Type type = Type.findType(c);
            if (type != null)
                return type.isSubtypeOf(ats.getType());
        }

        LispObject[] values = new LispObject[2];
        values[0] = NIL;
        values[1] = NIL;
        LispThread.currentThread().setValues(values);
        return NIL;
    }
}
