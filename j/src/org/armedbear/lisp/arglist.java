/*
 * arglist.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: arglist.java,v 1.1 2003-12-07 17:01:41 piso Exp $
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

public final class arglist extends Lisp
{
    // ### arglist
    private static final Primitive1 ARGLIST =
        new Primitive1("arglist", PACKAGE_EXT, true)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            Function function = coerceToFunction(arg);
            LispObject arglist = function.getArglist();
            final LispObject value1, value2;
            if (arglist != null) {
                value1 = arglist;
                value2 = T;
            } else {
                value1 = NIL;
                value2 = NIL;
            }
            return LispThread.currentThread().setValues(value1, value2);
        }
    };

    // ### %set-arglist
    private static final Primitive2 _SET_ARGLIST =
        new Primitive2("%set-arglist", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            coerceToFunction(first).setArglist(second);
            return second;
        }
    };
}
