/*
 * LogicalPathname.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: LogicalPathname.java,v 1.3 2004-02-23 14:24:47 piso Exp $
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

import java.util.HashMap;

public final class LogicalPathname extends Pathname
{
    private static final HashMap map = new HashMap();

    private LogicalPathname()
    {
        // "The device component of a logical pathname is always :unspecific;
        // no other component of a logical pathname can be :unspecific."
        device = Keyword.UNSPECIFIC;
    }

    public LispObject typeOf()
    {
        return Symbol.LOGICAL_PATHNAME;
    }

    public LispClass classOf()
    {
        return BuiltInClass.LOGICAL_PATHNAME;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.LOGICAL_PATHNAME)
            return T;
        if (type == BuiltInClass.LOGICAL_PATHNAME)
            return T;
        return super.typep(type);
    }

    // ### %set-logical-pathname-translations
    // %set-logical-pathname-translations host new-translations => newval
    private static final Primitive2 _SET_LOGICAL_PATHNAME_TRANSLATIONS =
        new Primitive2("%set-logical-pathname-translations", PACKAGE_SYS, false,
                       "host new-translations")
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            String host = first.getStringValue().toUpperCase();
            map.put(host, NIL); // FIXME
            return NIL;
        }
    };

    // ### logical-pathname-translations host => translations
    private static final Primitive1 LOGICAL_PATHNAME_TRANSLATIONS =
        new Primitive1("logical-pathname-translations", "host")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return NIL;
        }
    };

    // ### load-logical-pathname-translations host => just-loaded
    private static final Primitive1 LOAD_LOGICAL_PATHNAME_TRANSLATIONS =
        new Primitive1("load-logical-pathname-translations", "host")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            String host = arg.getStringValue().toUpperCase();
            if (map.get(host) != null)
                return NIL;
            return signal(new LispError("LOAD-LOGICAL-PATHNAME-TRANSLATIONS is not implemented."));
        }
    };

    // ### logical-pathname pathspec => logical-pathname
    private static final Primitive1 LOGICAL_PATHNAME =
        new Primitive1("logical-pathname", "pathspec")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof LogicalPathname)
                return arg;
            if (arg instanceof AbstractString) {
                String s = arg.getStringValue();
                int index = s.indexOf(':');
                if (index >= 0) {
                    String host = s.substring(0, index).toUpperCase();
                    LogicalPathname p = new LogicalPathname();
                    p.host = new SimpleString(host);
                    return p;
                }
                return NIL;
            }
            if (arg instanceof Stream)
                return NIL;
            return signal(new TypeError(String.valueOf(arg) +
                                        " is not a string, stream, or logical pathname."));
        }
    };
}
