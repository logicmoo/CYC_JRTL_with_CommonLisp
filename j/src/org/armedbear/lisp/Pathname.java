/*
 * Pathname.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: Pathname.java,v 1.23 2004-01-01 00:40:35 piso Exp $
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

public final class Pathname extends LispObject
{
    private LispObject host = NIL;
    private LispObject device = NIL;
    private LispObject directory = NIL;
    private LispObject name = NIL;

    // A string, NIL, :wild or :unspecific.
    private LispObject type = NIL;

    // A positive integer, or NIL, :wild, :unspecific, or :newest.
    private LispObject version = NIL;

    private String namestring;

    private Pathname()
    {
    }

    private Pathname(String namestring)
    {
        this.namestring = namestring;
        if (namestring != null) {
            for (int i = namestring.length(); i-- > 0;) {
                char c = namestring.charAt(i);
                if (c == '/' || c == '\\') {
                    directory = new LispString(namestring.substring(0, i + 1));
                    String s = namestring.substring(i + 1);
                    int index = s.lastIndexOf('.');
                    if (index >= 0) {
                        name = new LispString(s.substring(0, index));
                        type = new LispString(s.substring(index + 1));
                    } else
                        name = new LispString(s);
                    break;
                }
            }
            if (name == NIL)
                name = new LispString(namestring);
        }
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
        if (namestring != null)
            return namestring;
        StringBuffer sb = new StringBuffer();
        if (directory instanceof LispString)
            sb.append(((LispString)directory).getValue());
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) != File.separatorChar)
            sb.append(File.separatorChar);
        if (name instanceof LispString)
            sb.append(((LispString)name).getValue());
        if (type instanceof LispString) {
            sb.append('.');
            sb.append(((LispString)type).getValue());
        }
        return namestring = sb.toString();
    }

    public boolean equal(LispObject obj) throws ConditionThrowable
    {
        if (this == obj)
            return true;
        if (obj instanceof Pathname) {
            Pathname p = (Pathname) obj;
            if (Utilities.isPlatformWindows()) {
                if (!host.equalp(p.host))
                    return false;
                if (!device.equalp(p.device))
                    return false;
                if (!directory.equalp(p.directory))
                    return false;
                if (!name.equalp(p.name))
                    return false;
                if (!type.equalp(p.type))
                    return false;
                if (!version.equalp(p.version))
                    return false;
            } else {
                if (!host.equal(p.host))
                    return false;
                if (!device.equal(p.device))
                    return false;
                if (!directory.equal(p.directory))
                    return false;
                if (!name.equal(p.name))
                    return false;
                if (!type.equal(p.type))
                    return false;
                if (!version.equal(p.version))
                    return false;
            }
            return true;
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
    {
        return new Pathname(namestring);
    }

    private static Pathname coerceToPathname(LispObject arg)
        throws ConditionThrowable
    {
        if (arg instanceof Pathname)
            return (Pathname) arg;
        if (arg instanceof LispString)
            return new Pathname(((LispString)arg).getValue());
        signal(new TypeError(arg, "pathname designator"));
        // Not reached.
        return null;
    }

    // ### pathname-host
    private static final Primitive PATHNAME_HOST =
        new Primitive("pathname-host", "pathname &key case")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return coerceToPathname(arg).host;
        }
    };

    // ### pathname-device
    private static final Primitive PATHNAME_DEVICE =
        new Primitive("pathname-device", "pathname &key case")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return coerceToPathname(arg).device;
        }
    };

    // ### pathname-directory
    private static final Primitive PATHNAME_DIRECTORY =
        new Primitive("pathname-directory", "pathname &key case")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return coerceToPathname(arg).directory;
        }
    };

    // ### pathname-name
    private static final Primitive PATHNAME_NAME =
        new Primitive("pathname-name", "pathname &key case")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return coerceToPathname(arg).name;
        }
    };

    // ### pathname-type
    private static final Primitive PATHNAME_TYPE =
        new Primitive("pathname-type", "pathname &key case")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return coerceToPathname(arg).type;
        }
    };

    // ### pathname-version
    private static final Primitive PATHNAME_VERSION =
        new Primitive("pathname-version", "pathname &key case")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return coerceToPathname(arg).version;
        }
    };

    // ### namestring
    // namestring pathname => namestring
    // FIXME arg can be a stream, too...
    private static final Primitive1 NAMESTRING = new Primitive1("namestring", "pathname")
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
        new Primitive1("directory-namestring", "pathname")
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
    private static final Primitive1 PATHNAME =
        new Primitive1("pathname", "pathspec")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return coerceToPathname(arg);
        }
    };

    // ### %make-pathname
    // %make-pathname host device directory name type version defaults case =>
    // pathname
    // FIXME Incomplete.
    private static final Primitive _MAKE_PATHNAME =
        new Primitive("%make-pathname", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length != 8)
                return signal(new WrongNumberOfArgumentsException(this));
            Pathname p = new Pathname();
            p.host = args[0];
            p.device = args[1];
            p.directory = args[2];
            p.name = args[3];
            p.type = args[4];
            p.version = args[5]; // Ignored.
            LispObject defaults = args[6];
            LispObject _case = args[7]; // Ignored.
            return p;
        }
    };

    // ### pathnamep
    private static final Primitive1 PATHNAMEP =
        new Primitive1("pathnamep", "object")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return arg instanceof Pathname ? T : NIL;
        }
    };

//     // ### pathname-type
//     private static final Primitive1 PATHNAME_TYPE =
//         new Primitive1("pathname-type", "pathname &key case")
//     {
//         public LispObject execute(LispObject arg) throws ConditionThrowable
//         {
//             String namestring;
//             if (arg instanceof LispString)
//                 namestring = ((LispString)arg).getValue();
//             else if (arg instanceof Pathname)
//                 namestring = ((Pathname)arg).getNamestring();
//             else
//                 return signal(new TypeError(arg, "pathname designator"));
//             if (namestring != null) {
//                 for (int i = namestring.length(); i-- > 0;) {
//                     char c = namestring.charAt(i);
//                     if (c == '.')
//                         return new LispString(namestring.substring(i + 1));
//                 }
//             }
//             return NIL;
//         }
//     };

    // ### user-homedir-pathname
    // user-homedir-pathname &optional host => pathname
    private static final Primitive USER_HOMEDIR_PATHNAME =
        new Primitive("user-homedir-pathname", "&optional host")
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
