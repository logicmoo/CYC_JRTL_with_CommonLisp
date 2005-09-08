/*
 * LogicalPathname.java
 *
 * Copyright (C) 2004-2005 Peter Graves
 * $Id: LogicalPathname.java,v 1.8 2005-09-08 16:03:01 piso Exp $
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

    public LogicalPathname(String host, String rest) throws ConditionThrowable
    {
        this.host = new SimpleString(host);

        // "The device component of a logical pathname is always :UNSPECIFIC;
        // no other component of a logical pathname can be :UNSPECIFIC."
        device = Keyword.UNSPECIFIC;

        int semi = rest.lastIndexOf(';');
        if (semi >= 0) {
            // FIXME directory
            rest = rest.substring(semi + 1);
        }

        int dot = rest.indexOf('.');
        if (dot >= 0) {
            String n = rest.substring(0, dot);
            if (n.equals("*"))
                name = Keyword.WILD;
            else
                name = new SimpleString(n.toUpperCase());
            rest = rest.substring(dot + 1);
            dot = rest.indexOf('.');
            if (dot >= 0) {
                String t = rest.substring(0, dot);
                if (t.equals("*"))
                    type = Keyword.WILD;
                else
                    type = new SimpleString(t.toUpperCase());
                // What's left is the version.
                String v = rest.substring(dot + 1);
                if (v.equals("*"))
                    version = Keyword.WILD;
                else if (v.equals("NEWEST") || v.equals("newest"))
                    version = Keyword.NEWEST;
                else
                    version = PACKAGE_CL.intern("PARSE-INTEGER").execute(new SimpleString(v));
            } else {
                String t = rest;
                if (t.equals("*"))
                    type = Keyword.WILD;
                else
                    type = new SimpleString(t.toUpperCase());
            }
        } else {
            String n = rest;
            if (n.equals("*"))
                name = Keyword.WILD;
            else
                name = new SimpleString(n.toUpperCase());
        }
    }

    public LispObject typeOf()
    {
        return Symbol.LOGICAL_PATHNAME;
    }

    public LispObject classOf()
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

    public String writeToString() throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        boolean printReadably = (_PRINT_READABLY_.symbolValue(thread) != NIL);
        boolean printEscape = (_PRINT_ESCAPE_.symbolValue(thread) != NIL);
        FastStringBuffer sb = new FastStringBuffer();
        if (printReadably || printEscape)
            sb.append("#P\"");
        sb.append(host.getStringValue());
        sb.append(':');
        // FIXME directory
        sb.append(name.getStringValue());
        if (type != NIL) {
            sb.append('.');
            if (type == Keyword.WILD)
                sb.append('*');
            else
                sb.append(type.getStringValue());
        }
        if (version.integerp()) {
            sb.append('.');
            int base = Fixnum.getValue(_PRINT_BASE_.symbolValue(thread));
            if (version instanceof Fixnum)
                sb.append(Integer.toString(((Fixnum)version).value, base).toUpperCase());
            else if (version instanceof Bignum)
                sb.append(((Bignum)version).value.toString(base).toUpperCase());
        } else if (version == Keyword.WILD) {
            sb.append('*');
        }
        if (printReadably || printEscape)
            sb.append('"');
        return sb.toString();
    }

    // ### %make-logical-pathname namestring => logical-pathname
    private static final Primitive _MAKE_LOGICAL_PATHNAME =
        new Primitive("%make-logical-pathname", PACKAGE_SYS, true,
                      "namestring")
    {
        public LispObject execute(LispObject arg)
            throws ConditionThrowable
        {
            // Check for a logical pathname host.
            String s = arg.getStringValue();
            String h = getHostString(s);
            if (h != null && Pathname.LOGICAL_PATHNAME_TRANSLATIONS.get(new SimpleString(h)) != null) {
                // A defined logical pathname host.
                return new LogicalPathname(h, s.substring(s.indexOf(':') + 1));
            }
            return signal(new TypeError("Logical namestring does not specify a host: \"" + s + '"'));
        }
    };
}
