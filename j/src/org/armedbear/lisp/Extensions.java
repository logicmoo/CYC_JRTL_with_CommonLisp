/*
 * Extensions.java
 *
 * Copyright (C) 2002-2004 Peter Graves
 * $Id: Extensions.java,v 1.24 2004-05-27 20:40:38 piso Exp $
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

import java.net.Socket;

public final class Extensions extends Lisp
{
    // ### neq
    private static final Primitive2 NEQ =
        new Primitive2("neq", PACKAGE_EXT, true)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            return first != second ? T : NIL;
        }
    };

    // ### memq item list => tail
    private static final Primitive2 MEMQ =
        new Primitive2("memq", PACKAGE_EXT, true)
    {
        public LispObject execute(LispObject item, LispObject list)
            throws ConditionThrowable
        {
            LispObject tail = checkList(list);
            while (tail != NIL) {
                if (item == tail.car())
                    return tail;
                tail = tail.cdr();
            }
            return NIL;
        }
    };

    // ### memql item list => tail
    private static final Primitive2 MEMQL =
        new Primitive2("memql", PACKAGE_EXT, true)
    {
        public LispObject execute(LispObject item, LispObject list)
            throws ConditionThrowable
        {
            LispObject tail = checkList(list);
            while (tail != NIL) {
                if (item.eql(tail.car()))
                    return tail;
                tail = tail.cdr();
            }
            return NIL;
        }
    };

    // ### special-variable-p
    private static final Primitive1 SPECIAL_VARIABLE_P =
        new Primitive1("special-variable-p", PACKAGE_EXT, true) {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return arg.isSpecialVariable() ? T : NIL;
        }
    };

    // ### charpos
    // charpos stream => position
    private static final Primitive1 CHARPOS =
        new Primitive1("charpos", PACKAGE_EXT, true) {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            Stream stream = checkCharacterOutputStream(arg);
            return new Fixnum(stream.getCharPos());
        }
    };

    // ### %set-charpos
    // %set-charpos stream newval => newval
    private static final Primitive2 _SET_CHARPOS =
        new Primitive2("%set-charpos", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            Stream stream = checkCharacterOutputStream(first);
            stream.setCharPos(Fixnum.getValue(second));
            return second;
        }
    };

    private static final Primitive0 EXIT =
        new Primitive0("exit", PACKAGE_EXT, true)
    {
        public LispObject execute() throws ConditionThrowable
        {
            exit();
            return LispThread.currentThread().nothing();
        }
    };

    private static final Primitive0 QUIT =
        new Primitive0("quit", PACKAGE_EXT, true)
    {
        public LispObject execute() throws ConditionThrowable
        {
            exit();
            return LispThread.currentThread().nothing();
        }
    };
}
