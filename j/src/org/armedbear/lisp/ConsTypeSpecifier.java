/*
 * ConsTypeSpecifier.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: ConsTypeSpecifier.java,v 1.1 2003-09-11 17:13:17 piso Exp $
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

public final class ConsTypeSpecifier extends CompoundTypeSpecifier
{
    // These limits are always inclusive.
    private LispObject first;
    private LispObject second;

    public ConsTypeSpecifier(Cons args) throws LispError
    {
        Debug.assertTrue(args.car() == Symbol.CONS);
        switch (args.length()) {
            case 1:
                first = second = T;
                break;
            case 2:
                first = args.cadr();
                if (first == Symbol.UNSPECIFIED)
                    first = T;
                second = T;
                break;
            case 3:
                first = args.cadr();
                if (first == Symbol.UNSPECIFIED)
                    first = T;
                second = args.cdr().cdr().car();
                if (second == Symbol.UNSPECIFIED)
                    second = T;
                break;
            default:
                throw new LispError("bad type specifier: " + args);
        }
    }

    public LispObject test(LispObject obj) throws LispError
    {
        if (obj instanceof Cons) {
            if (first != T) {
                if (obj.car().typep(first) == NIL)
                    return NIL;
            }
            if (second != T) {
                if (obj.cdr().typep(second) == NIL)
                    return NIL;
            }
            return T;
        }
        return NIL;
    }
}
