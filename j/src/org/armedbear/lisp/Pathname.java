/*
 * Pathname.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: Pathname.java,v 1.21 2003-12-13 00:58:51 piso Exp $
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

    private Pathname(String namestring)
    {
        this.namestring = namestring;
    }

    private Pathname(String directory, String name)
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

    public LispObject typeOf()
    {
        return Symbol.PATHNAME;
    }

    public LispClass classOf()
    {
        return BuiltInClass.PATHNAME;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.PATHNAME)
            return T;
        if (type == BuiltInClass.PATHNAME)
            return T;
        return super.typep(type);
    }

    public String getNamestring()
    {
        return namestring;
    }

    public boolean equal(LispObject obj)
    {
        if (this == obj)
            return true;
        if (obj instanceof Pathname) {
            if (Utilities.isPlatformWindows())
                return namestring.equalsIgnoreCase(((Pathname)obj).getNamestring());
            return namestring.equals(((Pathname)obj).getNamestring());
        }
        return false;
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("#P");
        sb.append('"');
        sb.append(getNamestring());
        sb.append('"');
        return sb.toString();
    }

    public static Pathname parseNamestring(String namestring)
        throws ConditionThrowable
    {
        return new Pathname(namestring);
    }

    // ### namestring
    // namestring pathname => namestring
    // FIXME arg can be a stream, too...
    private static final Primitive1 NAMESTRING = new Primitive1("namestring","pathname")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof LispString)
                return arg;
            if (arg instanceof Pathname)
                return new LispString(((Pathname)arg).getNamestring());
            return signal(new TypeError(arg, "pathname designator"));
        }
    };

    // ### directory-namestring
    // directory-namestring pathname => namestring
    // FIXME arg can be a stream, too...
    private static final Primitive1 DIRECTORY_NAMESTRING =
        new Primitive1("directory-namestring","pathname")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            String namestring;
            if (arg instanceof LispString)
                namestring = ((LispString)arg).getValue();
            else if (arg instanceof Pathname)
                namestring = ((Pathname)arg).getNamestring();
            else
                return signal(new TypeError(arg, "pathname designator"));
            if (namestring != null) {
                for (int i = namestring.length(); i-- > 0;) {
                    char c = namestring.charAt(i);
                    if (c == '/' || c == '\\')
                        return new LispString(namestring.substring(0, i + 1));
                }
            }
            return NIL;
        }
    };

    // ### pathname
    // pathname pathspec => pathname
    // FIXME pathspec can be a stream, too...
    private static final Primitive1 PATHNAME = new Primitive1("pathname","pathspec")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof Pathname)
                return arg;
            if (arg instanceof LispString)
                return new Pathname(((LispString)arg).getValue());
            return signal(new TypeError(arg, "pathname designator"));
        }
    };

    // ### %make-pathname
    // %make-pathname host device directory name type version defaults case =>
    // pathname
    // FIXME Very incomplete.
    private static final Primitive _MAKE_PATHNAME =
        new Primitive("%make-pathname", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length != 8)
                return signal(new WrongNumberOfArgumentsException(this));
            LispObject host = args[0];
            LispObject device = args[1];
            LispObject directory = args[2];
            LispObject name = args[3];
            LispObject type = args[4];
            LispObject version = args[5]; // Ignored.
            LispObject defaults = args[6];
            LispObject _case = args[7]; // Ignored.
            // FIXME
            if (host != NIL || device != NIL || directory != NIL)
                return signal(new LispError("MAKE-PATHNAME: not implemented"));
            String d = ""; // directory
            String n = ""; // name
            String t = ""; // type
            String defaultNamestring = null;
            if (defaults instanceof Pathname)
                defaultNamestring = ((Pathname)defaults).getNamestring();
            else if (defaults instanceof LispString)
                defaultNamestring = ((LispString)defaults).getValue();
            if (defaultNamestring != null) {
                File file = new File(defaultNamestring);
                d = file.getParent();
                n = file.getName();
                int index = n.lastIndexOf('.');
                if (index >= 0) {
                    t = n.substring(index + 1);
                    n = n.substring(0, index);
                }
            }
            if (name == Keyword.WILD)
                n = "*";
            else if (name instanceof LispString)
                n = ((LispString)name).getValue();
            if (type == Keyword.WILD)
                t = "*";
            else if (type instanceof LispString)
                t = ((LispString)type).getValue();
            if (t.length() > 0)
                n = n + "." + t;
            return new Pathname(d, n);
        }
    };

    // ### pathnamep
    private static final Primitive1 PATHNAMEP = new Primitive1("pathnamep","object")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return arg instanceof Pathname ? T : NIL;
        }
    };

    // ### pathname-type
    private static final Primitive1 PATHNAME_TYPE = new Primitive1("pathname-type","pathname &key case")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            String namestring;
            if (arg instanceof LispString)
                namestring = ((LispString)arg).getValue();
            else if (arg instanceof Pathname)
                namestring = ((Pathname)arg).getNamestring();
            else
                return signal(new TypeError(arg, "pathname designator"));
            if (namestring != null) {
                for (int i = namestring.length(); i-- > 0;) {
                    char c = namestring.charAt(i);
                    if (c == '.')
                        return new LispString(namestring.substring(i + 1));
                }
            }
            return NIL;
        }
    };

    // ### user-homedir-pathname
    // user-homedir-pathname &optional host => pathname
    private static final Primitive USER_HOMEDIR_PATHNAME =
        new Primitive("user-homedir-pathname","&optional host")
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            switch (args.length) {
                case 0: {
                    String s = System.getProperty("user.home");
                    // For compatibility with SBCL and ACL (and maybe other
                    // Lisps), we want the namestring of a directory to end
                    // with a '/' on Unix.
                    // FIXME Do we need to do something similar on Windows?
                    if (s.startsWith("/")) {
                        // Unix.
                        if (!s.endsWith("/"))
                            s = s.concat("/");
                    }
                    return new Pathname(s);
                }
                case 1:
                    return NIL;
                default:
                    return signal(new WrongNumberOfArgumentsException(this));
            }
        }
    };
}
