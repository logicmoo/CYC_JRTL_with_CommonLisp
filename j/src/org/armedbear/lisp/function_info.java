/*
 * function_info.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: function_info.java,v 1.2 2004-08-21 16:21:37 piso Exp $
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

public final class function_info extends Lisp
{
    static {
        FUNCTION_TABLE = new EqualHashTable(64, NIL, NIL);
    }

    // ### function-info name
    private static final Primitive1 FUNCTION_INFO =
        new Primitive1("function-info", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            LispObject info = FUNCTION_TABLE.get(arg);
            return info != null ? info : NIL;
        }
    };

    // ### %set-function-info name value
    private static final Primitive2 _SET_FUNCTION_INFO =
        new Primitive2("%set-function-info", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            if (second == NIL)
                FUNCTION_TABLE.remhash(first);
            FUNCTION_TABLE.put(first, second);
            return second;
        }
    };
}
