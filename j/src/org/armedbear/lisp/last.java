/*
 * last.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: last.java,v 1.4 2003-12-10 08:55:00 asimon Exp $
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

// ### last
// last list &optional n => tail
public final class last extends Primitive {
    public last(String name, String arglist)
    {
        super(name,arglist);
    }

    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
        LispObject list = checkList(arg);
        if (list == NIL)
            return NIL;
        LispObject result = list;
        int n = 1;
        while (list instanceof Cons) {
            list = list.cdr();
            if (n-- <= 0)
                result = result.cdr();
        }
        return result;
    }

    public LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
        LispObject list = checkList(first);
        if (second instanceof Fixnum) {
            int n = ((Fixnum)second).getValue();
            if (n >= 0) {
                if (list == NIL)
                    return NIL;
                LispObject result = list;
                while (list instanceof Cons) {
                    list = list.cdr();
                    if (n-- <= 0)
                        result = result.cdr();
                }
                return result;
            }
        } else if (second instanceof Bignum) {
            if (list == NIL)
                return NIL;
            LispObject n = second;
            LispObject result = list;
            while (list instanceof Cons) {
                list = list.cdr();
                if (!n.plusp())
                    result = result.cdr();
                n = n.decr();
            }
            return result;
        }
        throw new ConditionThrowable(new TypeError(second, "non-negative integer"));
    }

    private static final last LAST = new last("last","list &optional n");
}
