/*
 * simple_list_remove_duplicates.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: simple_list_remove_duplicates.java,v 1.1 2004-03-13 17:49:00 piso Exp $
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

// ### simple-list-remove-duplicates
public final class simple_list_remove_duplicates extends Primitive1
{
    private simple_list_remove_duplicates()
    {
        super("simple-list-remove-duplicates", PACKAGE_SYS, false, "list");
    }

    public LispObject execute(LispObject list) throws ConditionThrowable
    {
        LispObject result = NIL;
        while (list != NIL) {
            LispObject item = list.car();
            boolean duplicate = false;
            LispObject tail = list.cdr();
            while (tail != NIL) {
                if (item.eql(tail.car())) {
                    duplicate = true;
                    break;
                }
                tail = tail.cdr();
            }
            if (!duplicate)
                result = new Cons(item, result);
            list = list.cdr();
        }
        return result.nreverse();
    }

    private static final Primitive1 SIMPLE_LIST_REMOVE_DUPLICATES =
        new simple_list_remove_duplicates();
}
