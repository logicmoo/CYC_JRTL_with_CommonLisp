/*
 * Extensions.java
 *
 * Copyright (C) 2002-2004 Peter Graves
 * $Id: Extensions.java,v 1.33 2004-11-03 15:38:52 piso Exp $
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
    // ### *ed-functions*
    public static final Symbol _ED_FUNCTIONS_ =
        exportSpecial("*ED-FUNCTIONS*", PACKAGE_EXT,
                      list1(intern("DEFAULT-ED-FUNCTION", PACKAGE_SYS)));

    // ### neq
    private static final Primitive NEQ =
        new Primitive("neq", PACKAGE_EXT, true)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            return first != second ? T : NIL;
        }
    };

    // ### memq item list => tail
    private static final Primitive MEMQ =
        new Primitive("memq", PACKAGE_EXT, true, "item list")
    {
        public LispObject execute(LispObject item, LispObject list)
            throws ConditionThrowable
        {
            while (list != NIL) {
                if (item == list.car())
                    return list;
                list = list.cdr();
            }
            return NIL;
        }
    };

    // ### memql item list => tail
    private static final Primitive MEMQL =
        new Primitive("memql", PACKAGE_EXT, true, "item list")
    {
        public LispObject execute(LispObject item, LispObject list)
            throws ConditionThrowable
        {
            while (list != NIL) {
                if (item.eql(list.car()))
                    return list;
                list = list.cdr();
            }
            return NIL;
        }
    };

    // ### special-variable-p
    private static final Primitive SPECIAL_VARIABLE_P =
        new Primitive("special-variable-p", PACKAGE_EXT, true)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return arg.isSpecialVariable() ? T : NIL;
        }
    };

    // ### charpos
    // charpos stream => position
    private static final Primitive CHARPOS =
        new Primitive("charpos", PACKAGE_EXT, true)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            Stream stream = checkCharacterOutputStream(arg);
            return new Fixnum(stream.getCharPos());
        }
    };

    // ### %set-charpos
    // %set-charpos stream newval => newval
    private static final Primitive _SET_CHARPOS =
        new Primitive("%set-charpos", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            Stream stream = checkCharacterOutputStream(first);
            stream.setCharPos(Fixnum.getValue(second));
            return second;
        }
    };

    // ### source
    private static final Primitive SOURCE =
        new Primitive("source", PACKAGE_EXT, true)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return get(checkSymbol(arg), Symbol._SOURCE, NIL);
        }
    };

    // ### source-file-position
    private static final Primitive SOURCE_FILE_POSITION =
        new Primitive("source-file-position", PACKAGE_EXT, true)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            LispObject obj = get(checkSymbol(arg), Symbol._SOURCE, NIL);
            if (obj instanceof Cons)
                return obj.cdr();
            return NIL;
        }
    };

    // ### source-pathname
    private static final Primitive SOURCE_PATHNAME =
        new Primitive("source-pathname", PACKAGE_EXT, true)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            LispObject obj = get(checkSymbol(arg), Symbol._SOURCE, NIL);
            if (obj instanceof Cons)
                return obj.car();
            if (obj instanceof Pathname)
                return obj;
            return NIL;
        }
    };

    // ### exit
    private static final Primitive EXIT =
        new Primitive("exit", PACKAGE_EXT, true)
    {
        public LispObject execute() throws ConditionThrowable
        {
            exit();
            return LispThread.currentThread().nothing();
        }
    };

    // ### quit
    private static final Primitive QUIT =
        new Primitive("quit", PACKAGE_EXT, true)
    {
        public LispObject execute() throws ConditionThrowable
        {
            exit();
            return LispThread.currentThread().nothing();
        }
    };
}
