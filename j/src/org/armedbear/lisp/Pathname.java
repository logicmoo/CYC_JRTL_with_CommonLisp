/*
 * Pathname.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: Pathname.java,v 1.3 2003-08-10 00:43:56 piso Exp $
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

import java.io.File;

// FIXME Not much of an implementation...
public final class Pathname extends LispObject
{
    private String namestring;

    public Pathname(String namestring)
    {
        this.namestring = namestring;
    }

    public Pathname(String directory, String name)
    {
        StringBuffer sb = new StringBuffer();
        if (directory != null && directory.length() > 0) {
            sb.append(directory);
            if (!directory.endsWith(File.separator))
                sb.append(File.separator);
        }
        if (name != null && name.length() > 0) {
            sb.append(name);
        }
        namestring = sb.toString();
    }

    public String getNamestring()
    {
        return namestring;
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("#P");
        sb.append('"');
        sb.append(getNamestring());
        sb.append('"');
        return sb.toString();
    }

    // ### namestring
    // namestring pathname => namestring
    // FIXME arg can be a stream, too...
    private static final Primitive1 NAMESTRING = new Primitive1("namestring") {
        public LispObject execute(LispObject arg) throws Condition
        {
            if (arg instanceof LispString)
                return arg;
            if (arg instanceof Pathname)
                return new LispString(((Pathname)arg).getNamestring());
            throw new TypeError(arg, "pathname designator");
        }
    };

    // ### pathname
    // pathname pathspec => pathname
    // FIXME pathspec can be a stream, too...
    private static final Primitive1 PATHNAME = new Primitive1("pathname") {
        public LispObject execute(LispObject arg) throws Condition
        {
            if (arg instanceof Pathname)
                return arg;
            if (arg instanceof LispString)
                return new Pathname(((LispString)arg).getValue());
            throw new TypeError(arg, "pathname designator");
        }
    };

    // ### %make-pathname
    // %make-pathname host device directory name type version defaults case =>
    // pathname
    // FIXME Very incomplete.
    private static final Primitive _MAKE_PATHNAME =
        new Primitive("%make-pathname", PACKAGE_SYS, false) {
        public LispObject execute(LispObject[] args) throws Condition
        {
            if (args.length != 8)
                throw new WrongNumberOfArgumentsException(this);
            LispObject host = args[0];
            LispObject device = args[1];
            LispObject directory = args[2];
            LispObject name = args[3];
            LispObject type = args[4];
            LispObject version = args[5]; // Ignored.
            LispObject defaults = args[6];
            LispObject _case = args[7]; // Ignored.
            // FIXME
            if (host != NIL || device != NIL || directory != NIL || name != NIL)
                throw new LispError("MAKE-PATHNAME: not implemented");
            if (defaults instanceof LispString) {
                String namestring = ((LispString)defaults).getValue();
                if (type instanceof LispString) {
                    File file = new File(namestring);
                    String d = file.getParent();
                    String n = file.getName();
                    String t = ((LispString)type).getValue();
                    int index = n.lastIndexOf('.');
                    if (index >= 0)
                        n = n.substring(0, index);
                    n = n + "." + t;
                    return new Pathname(d, n);
                }
            }
            return NIL;
        }
    };
}
