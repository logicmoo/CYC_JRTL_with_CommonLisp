/*
 * MemberTypeSpecifier.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: MemberTypeSpecifier.java,v 1.1 2003-09-11 16:07:19 piso Exp $
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

public final class MemberTypeSpecifier extends CompoundTypeSpecifier
{
    private final LispObject objects;

    public MemberTypeSpecifier(Cons args)
    {
        Debug.assertTrue(args.car() == Symbol.MEMBER);
        objects = args.cdr();
    }

    public LispObject test(LispObject obj) throws LispError
    {
        LispObject list = objects;
        while (list != NIL) {
            if (obj.eql(list.car()))
                return T;
            list = list.cdr();
        }
        return NIL;
    }

    public LispObject isSubtypeOf(TypeSpecifier ts) throws LispError
    {
        if (ts instanceof AtomicTypeSpecifier) {
            AtomicTypeSpecifier ats = (AtomicTypeSpecifier) ts;
            Type type = ats.TYPE();
            LispObject list = objects;
            while (list != NIL) {
                LispObject obj = list.car();
                if (obj.typep(type) == NIL)
                    return values(NIL, NIL);
                list = list.cdr();
            }
            return values(T, T);
        }
        return values(NIL, NIL);
    }
}
