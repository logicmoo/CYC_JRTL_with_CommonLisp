/*
 * Pathname.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: Pathname.java,v 1.34 2004-01-05 15:39:44 piso Exp $
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
import java.io.IOException;
import java.util.StringTokenizer;

public final class Pathname extends LispObject
{
    private LispObject host = NIL;
    private LispObject device = NIL;
    private LispObject directory = NIL;
    private LispObject name = NIL;

    // A string, NIL, :wild or :unspecific.
    private LispObject type = NIL;

    // A positive integer, or NIL, :WILD, :UNSPECIFIC, or :NEWEST.
    private LispObject version = NIL;

    private String namestring;

    private Pathname()
    {
    }

    public Pathname(String s) throws ConditionThrowable
    {
        if (s != null) {
            if (Utilities.isPlatformUnix()) {
                if (s.equals("~"))
                    s = System.getProperty("user.home").concat("/");
                else if (s.startsWith("~/"))
                    s = System.getProperty("user.home").concat(s.substring(1));
            }
            this.namestring = s;
            String d = null;
            // Find last file separator char.
            for (int i = s.length(); i-- > 0;) {
                char c = s.charAt(i);
                if (c == '/' || c == '\\') {
                    d = s.substring(0, i + 1);
                    s = s.substring(i + 1);
                    break;
                }
            }
            if (d != null)
                directory = parseDirectory(d);
            int index = s.lastIndexOf('.');
            String n = null;
            String t = null;
            if (index > 0) {
                n = s.substring(0, index);
                t = s.substring(index + 1);
            } else if (s.length() > 0)
                n = s;
            if (n != null) {
                if (n.equals("*"))
                    name = Keyword.WILD;
                else
                    name = new LispString(n);
            }
            if (t != null) {
                if (t.equals("*"))
                    type = Keyword.WILD;
                else
                    type = new LispString(t);
            }
        }
    }

    private static final LispObject parseDirectory(String d)
        throws ConditionThrowable
    {
        if (d.equals("/"))
            return list1(Keyword.ABSOLUTE);
        LispObject result = new Cons(Keyword.ABSOLUTE);
        StringTokenizer st = new StringTokenizer(d, "/\\");
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            LispObject obj;
            if (token.equals("*"))
                obj = Keyword.WILD;
            else if (token.equals("**"))
                obj = Keyword.WILD_INFERIORS;
            else
                obj = new LispString(token);
            result = new Cons(obj, result);
        }
        return result.nreverse();
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

    public String getNamestring() throws ConditionThrowable
    {
        if (namestring != null)
            return namestring;
        StringBuffer sb = new StringBuffer();
        if (directory instanceof LispString)
            Debug.assertTrue(false);
        if (directory != NIL) {
            LispObject temp = directory;
            LispObject part = temp.car();
            if (part == Keyword.ABSOLUTE)
                sb.append(File.separatorChar);
            else if (part == Keyword.RELATIVE)
                ;
            else
                signal(new LispError("Unsupported directory component " + part + "."));
            temp = temp.cdr();
            while (temp != NIL) {
                part = temp.car();
                if (part instanceof LispString)
                    sb.append(((LispString)part).getValue());
                else if (part == Keyword.WILD)
                    sb.append("*");
                else
                    signal(new LispError("Unsupported directory component " + part + "."));
                sb.append(File.separatorChar);
                temp = temp.cdr();
            }
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) != File.separatorChar)
            sb.append(File.separatorChar);
        if (name instanceof LispString)
            sb.append(((LispString)name).getValue());
        else if (name == Keyword.WILD)
            sb.append('*');
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

    public boolean equalp(LispObject obj) throws ConditionThrowable
    {
        return equal(obj);
    }

    public String toString()
    {
        try {
            StringBuffer sb = new StringBuffer("#P");
            if (name != NIL) {
                sb.append('"');
                sb.append(getNamestring());
                sb.append('"');
            } else if (directory != NIL && type == NIL) {
                sb.append('"');
                sb.append(getNamestring());
                sb.append('"');
            } else {
                sb.append('(');
                if (host != NIL) {
                    sb.append(":HOST ");
                    sb.append(host);
                    sb.append(' ');
                }
                if (device != NIL) {
                    sb.append(":DEVICE ");
                    sb.append(device);
                    sb.append(' ');
                }
                if (directory != NIL) {
                    sb.append(":DIRECTORY ");
                    sb.append(directory);
                    sb.append(" ");
                }
                if (type != NIL) {
                    sb.append(":TYPE ");
                    sb.append(type);
                    sb.append(' ');
                }
                if (version != NIL) {
                    sb.append(":VERSION ");
                    sb.append(version);
                    sb.append(' ');
                }
                if (sb.charAt(sb.length() - 1) == ' ')
                    sb.setLength(sb.length() - 1);
                sb.append(')');
            }
            return sb.toString();
        }
        catch (ConditionThrowable t) {
            return unreadableString("PATHNAME");
        }
    }

    public static Pathname parseNamestring(String namestring)
        throws ConditionThrowable
    {
        return new Pathname(namestring);
    }

    public static Pathname coerceToPathname(LispObject arg)
        throws ConditionThrowable
    {
        if (arg instanceof Pathname)
            return (Pathname) arg;
        if (arg instanceof LispString)
            return new Pathname(((LispString)arg).getValue());
        if (arg instanceof LispStream) {
            LispObject pathname = ((LispStream)arg).getPathname();
            if (pathname instanceof Pathname)
                return (Pathname) pathname;
        }
        signal(new TypeError(arg, "pathname designator"));
        // Not reached.
        return null;
    }

    private static final void checkCaseArgument(LispObject arg)
        throws ConditionThrowable
    {
        if (arg != Keyword.COMMON && arg != Keyword.LOCAL)
            signal(new TypeError(arg, list3(Symbol.MEMBER, Keyword.COMMON,
                                            Keyword.LOCAL)));
    }

    private static final Primitive2 _PATHNAME_HOST =
        new Primitive2("%pathname-host", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            checkCaseArgument(second);
            return coerceToPathname(first).host;
        }
    };

    private static final Primitive2 _PATHNAME_DEVICE =
        new Primitive2("%pathname-device", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            checkCaseArgument(second);
            return coerceToPathname(first).device;
        }
    };

    private static final Primitive2 _PATHNAME_DIRECTORY =
        new Primitive2("%pathname-directory", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            checkCaseArgument(second);
            return coerceToPathname(first).directory;
        }
    };

    private static final Primitive2 _PATHNAME_NAME =
        new Primitive2("%pathname-name", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            checkCaseArgument(second);
            return coerceToPathname(first).name;
        }
    };

    private static final Primitive2 _PATHNAME_TYPE =
        new Primitive2("%pathname-type", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            checkCaseArgument(second);
            return coerceToPathname(first).type;
        }
    };

    private static final Primitive1 PATHNAME_VERSION =
        new Primitive1("pathname-version", "pathname")
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

    private static final Primitive MAKE_PATHNAME =
        new Primitive("make-pathname", "&key host device directory name type version defaults case")
    {
        public LispObject execute(LispObject[] args)
            throws ConditionThrowable
        {
            return _makePathname(args);
        }
    };

    public static final Pathname makePathname(LispObject args)
        throws ConditionThrowable
    {
        return _makePathname(args.copyToArray());
    }

    private static final Pathname _makePathname(LispObject[] args)
        throws ConditionThrowable
    {
        if (args.length % 2 != 0)
            signal(new ProgramError("Odd number of keyword arguments."));
        Pathname p = new Pathname();
        Pathname defaults = null;
        for (int i = 0; i < args.length; i += 2) {
            LispObject key = args[i];
            LispObject value = args[i+1];
            if (key == Keyword.HOST) {
                p.host = value;
            } else if (key == Keyword.DEVICE) {
                p.device = value;
            } else if (key == Keyword.DIRECTORY) {
                if (value instanceof LispString)
                    p.directory = list2(Keyword.ABSOLUTE, value);
                else if (value == Keyword.WILD)
                    p.directory = list2(Keyword.ABSOLUTE, Keyword.WILD);
                else
                    p.directory = validateDirectory(value);
            } else if (key == Keyword.NAME) {
                p.name = value;
            } else if (key == Keyword.TYPE) {
                p.type = value;
            } else if (key == Keyword.VERSION) {
                p.version = value;
            } else if (key == Keyword.DEFAULTS) {
                defaults = coerceToPathname(value);
            } else if (key == Keyword.CASE) {
                ; // Ignored.
            }
        }
        if (defaults != null) {
            // Ignore host and device. FIXME Windows!
            if (p.directory == NIL)
                p.directory = defaults.directory;
            if (p.name == NIL)
                p.name = defaults.name;
            if (p.type == NIL)
                p.type = defaults.type;
        }
        return p;
    }

    private static final LispObject validateDirectory(LispObject obj)
        throws ConditionThrowable
    {
        LispObject temp = obj;
        while (temp != NIL) {
            LispObject first = temp.car();
            temp = temp.cdr();
            if (first == Keyword.ABSOLUTE || first == Keyword.WILD_INFERIORS) {
                LispObject second = temp.car();
                if (second == Keyword.UP || second == Keyword.BACK) {
                    StringBuffer sb = new StringBuffer();
                    sb.append(first);
                    sb.append(" may not be followed immediately by ");
                    sb.append(second);
                    sb.append('.');
                    return signal(new FileError(sb.toString()));
                }
            }
        }
        return obj;
    }

    // ### pathnamep
    private static final Primitive1 PATHNAMEP =
        new Primitive1("pathnamep", "object")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return arg instanceof Pathname ? T : NIL;
        }
    };

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

    private static final Primitive1 _DIRECTORY =
        new Primitive1("%directory", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            Pathname pathname = Pathname.coerceToPathname(arg);
            LispObject result = NIL;
            String s = pathname.getNamestring();
            File f = new File(s);
            if (f.isDirectory()) {
                File[] files = f.listFiles();
                try {
                    for (int i = files.length; i-- > 0;) {
                        Pathname p = new Pathname(files[i].getCanonicalPath());
                        result = new Cons(p, result);
                    }
                }
                catch (IOException e) {
                    return signal(new FileError("Unable to list directory " +
                                                pathname + "."));
                }
            }
            return result;
        }
    };

    private static final Primitive2 _WILD_PATHNAME_P =
        new Primitive2("%wild-pathname-p", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            Pathname pathname = Pathname.coerceToPathname(first);
            if (second == NIL) {
                if (pathname.host == Keyword.WILD || pathname.host == Keyword.WILD_INFERIORS)
                    return T;
                if (pathname.device == Keyword.WILD || pathname.device == Keyword.WILD_INFERIORS)
                    return T;
                if (pathname.directory instanceof Cons) {
                    if (memq(Keyword.WILD, pathname.directory))
                        return T;
                    if (memq(Keyword.WILD_INFERIORS, pathname.directory))
                        return T;
                }
                if (pathname.name == Keyword.WILD || pathname.name == Keyword.WILD_INFERIORS)
                    return T;
                if (pathname.type == Keyword.WILD || pathname.type == Keyword.WILD_INFERIORS)
                    return T;
                if (pathname.version == Keyword.WILD || pathname.version == Keyword.WILD_INFERIORS)
                    return T;
                return NIL;
            }
            if (second == Keyword.DIRECTORY) {
                if (pathname.directory instanceof Cons) {
                    if (memq(Keyword.WILD, pathname.directory))
                        return T;
                    if (memq(Keyword.WILD_INFERIORS, pathname.directory))
                        return T;
                }
                return NIL;
            }
            LispObject value;
            if (second == Keyword.HOST)
                value = pathname.host;
            else if (second == Keyword.DEVICE)
                value = pathname.device;
            else if (second == Keyword.NAME)
                value = pathname.name;
            else if (second == Keyword.TYPE)
                value = pathname.type;
            else if (second == Keyword.VERSION)
                value = pathname.version;
            else
                return signal(new ProgramError("Unrecognized keyword " + second + "."));
            if (value == Keyword.WILD || value == Keyword.WILD_INFERIORS)
                return T;
            else
                return NIL;
        }
    };

    private static final Primitive MERGE_PATHNAMES =
        new Primitive("merge-pathnames", "pathname &optional default-pathname default-version")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            Pathname pathname = coerceToPathname(arg);
            Pathname defaultPathname =
                coerceToPathname(_DEFAULT_PATHNAME_DEFAULTS_.symbolValue());
            LispObject defaultVersion = Keyword.NEWEST;
            return mergePathnames(pathname, defaultPathname, defaultVersion);
        }
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            Pathname pathname = coerceToPathname(first);
            Pathname defaultPathname =
                coerceToPathname(second);
            LispObject defaultVersion = Keyword.NEWEST;
            return mergePathnames(pathname, defaultPathname, defaultVersion);
        }
        public LispObject execute(LispObject first, LispObject second,
                                  LispObject third)
            throws ConditionThrowable
        {
            Pathname pathname = coerceToPathname(first);
            Pathname defaultPathname =
                coerceToPathname(second);
            LispObject defaultVersion = third;
            return mergePathnames(pathname, defaultPathname, defaultVersion);
        }
    };

    public static final Pathname mergePathnames(Pathname pathname,
                                                Pathname defaultPathname,
                                                LispObject defaultVersion)
        throws ConditionThrowable
    {
        Pathname p = new Pathname();
        if (pathname.host != NIL)
            p.host = pathname.host;
        else
            p.host = defaultPathname.host;
        if (pathname.device != NIL)
            p.device = pathname.device;
        else
            p.device = defaultPathname.device;
        if (pathname.directory != NIL)
            p.directory = pathname.directory;
        else
            p.directory = defaultPathname.directory;
        if (pathname.name != NIL)
            p.name = pathname.name;
        else
            p.name = defaultPathname.name;
        if (pathname.type != NIL)
            p.type = pathname.type;
        else
            p.type = defaultPathname.type;
        if (pathname.version != NIL)
            p.version = pathname.version;
        else if (pathname.name instanceof LispString)
            p.version = defaultVersion;
        else if (defaultPathname.version != NIL)
            p.version = defaultPathname.version;
        else
            p.version = defaultVersion;
        return p;
    }

    static {
        try {
            LispObject obj = _DEFAULT_PATHNAME_DEFAULTS_.getSymbolValue();
            _DEFAULT_PATHNAME_DEFAULTS_.setSymbolValue(coerceToPathname(obj));
        }
        catch (Throwable t) {
            Debug.trace(t);
        }
    }
}
