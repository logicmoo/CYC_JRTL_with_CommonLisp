/*
 * Load.java
 *
 * Copyright (C) 2002-2004 Peter Graves
 * $Id: Load.java,v 1.30 2004-01-24 19:29:58 piso Exp $
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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public final class Load extends Lisp
{
    public static final LispObject load(String filename)
        throws ConditionThrowable
    {
        return load(filename,
                    _LOAD_VERBOSE_.symbolValueNoThrow() != NIL,
                    _LOAD_PRINT_.symbolValueNoThrow() != NIL);
    }

    public static final LispObject load(final String filename,
                                         boolean verbose, boolean print)
        throws ConditionThrowable
    {
        File file = null;
        boolean isFile = false;
        if (Utilities.isFilenameAbsolute(filename)) {
            file = new File(filename);
            if (file != null) {
                isFile = file.isFile();
                if (!isFile) {
                    String extension = getExtension(filename);
                    if (extension == null) {
                        // No extension specified. Try appending ".lisp".
                        file = new File(filename.concat(".lisp"));
                        isFile = file.isFile();
                    }
                }
            }
        } else {
            // Filename is not absolute.
            String dir =
                Pathname.coerceToPathname(_DEFAULT_PATHNAME_DEFAULTS_.symbolValue()).getNamestring();
            file = new File(dir, filename);
            if (file != null) {
                isFile = file.isFile();
                if (!isFile) {
                    String extension = getExtension(filename);
                    if (extension == null) {
                        // No extension specified. Try appending ".lisp".
                        file = new File(dir, filename.concat(".lisp"));
                        isFile = file.isFile();
                    }
                }
            }
        }
        if (!isFile)
            return signal(new LispError("file not found: " + filename));
        String truename = filename;
        InputStream in = null;
        try {
            in = new FileInputStream(file);
            truename = file.getCanonicalPath();
        }
        catch (FileNotFoundException e) {
            return signal(new LispError("file not found: " + filename));
        }
        catch (IOException e) {
            return signal(new LispError(e.getMessage()));
        }
        LispObject result =
            loadFileFromStream(truename, in, verbose, print, false);
        try {
            in.close();
        }
        catch (IOException e) {
            return signal(new LispError(e.getMessage()));
        }
        return result;
    }

    public static final LispObject _load(String filename)
        throws ConditionThrowable
    {
        return _load(filename,
                     _LOAD_VERBOSE_.symbolValueNoThrow() != NIL,
                     _LOAD_PRINT_.symbolValueNoThrow() != NIL,
                     false);
    }

    public static final LispObject _load(String filename, boolean auto)
        throws ConditionThrowable
    {
        boolean verbose;
        if (auto)
            verbose = _AUTOLOAD_VERBOSE_.symbolValueNoThrow() != NIL;
        else
            verbose = _LOAD_VERBOSE_.symbolValueNoThrow() != NIL;
        return _load(filename,
                     verbose,
                     _LOAD_PRINT_.symbolValueNoThrow() != NIL,
                     auto);
    }

    public static final LispObject _load(final String filename,
                                         boolean verbose, boolean print,
                                         boolean auto)
        throws ConditionThrowable
    {
        InputStream in = null;
        String truename = null;
        URL url = Lisp.class.getResource(filename);
        if (url != null) {
            try {
                in = url.openStream();
                truename = url.getPath();
            }
            catch (IOException e) {
                in = null;
            }
        } else {
            final String dir = Site.getLispHome();
            if (dir != null) {
                File file = new File(dir, filename);
                if (file.isFile()) {
                    try {
                        in = new FileInputStream(file);
                        truename = file.getCanonicalPath();
                    }
                    catch (IOException e) {
                        in = null;
                    }
                }
            }
        }
        if (in != null) {
            LispObject result =
                loadFileFromStream(truename, in, verbose, print, auto);
            try {
                in.close();
            }
            catch (IOException e) {
                return signal(new LispError(e.getMessage()));
            }
            return result;
        }
        return signal(new LispError("file not found: " + filename));
    }

    private static final LispObject loadFileFromStream(String truename,
                                                       InputStream in,
                                                       boolean verbose,
                                                       boolean print,
                                                       boolean auto)
        throws ConditionThrowable
    {
        long start = System.currentTimeMillis();
        LispThread thread = LispThread.currentThread();
        Environment oldDynEnv = thread.getDynamicEnvironment();
        thread.bindSpecial(_PACKAGE_, _PACKAGE_.symbolValue());
        int loadDepth = Fixnum.getInt(_LOAD_DEPTH_.symbolValue());
        thread.bindSpecial(_LOAD_DEPTH_, new Fixnum(++loadDepth));
        final String prefix = getLoadVerbosePrefix(loadDepth);
        try {
            thread.bindSpecial(_LOAD_TRUENAME_, new LispString(truename));
            if (verbose) {
                Stream out = getStandardOutput();
                out.freshLine();
                out.writeString(prefix);
                out.writeString(auto ? " Autoloading " : " Loading ");
                out.writeString(truename);
                out.writeLine(" ...");
                out.flushOutput();
                LispObject result = loadStream(in, print);
                long elapsed = System.currentTimeMillis() - start;
                out.freshLine();
                out.writeString(prefix);
                out.writeString(auto ? " Autoloaded " : " Loaded ");
                out.writeString(truename);
                out.writeString(" (");
                out.writeString(String.valueOf(((float)elapsed)/1000));
                out.writeLine(" seconds)");
                out.flushOutput();
                return result;
            } else
                return loadStream(in, print);
        }
        finally {
            thread.setDynamicEnvironment(oldDynEnv);
        }
    }

    public static String getLoadVerbosePrefix(int loadDepth)
    {
        StringBuffer sb = new StringBuffer(";");
        for (int i = loadDepth - 1; i-- > 0;)
            sb.append(' ');
        return sb.toString();
    }

    private static final LispObject loadStream(InputStream inputStream,
                                               boolean print)
        throws ConditionThrowable
    {
        Stream in = new Stream(inputStream, Symbol.CHARACTER);
        final LispThread thread = LispThread.currentThread();
        try {
            final Environment env = new Environment();
            while (true) {
                LispObject obj = in.read(false, EOF, true);
                if (obj == EOF)
                    break;
                LispObject result = eval(obj, env, thread);
                if (print) {
                    Stream out = getStandardOutput();
                    out.writeLine(String.valueOf(result));
                    out.flushOutput();
                }
            }
            return T;
        }
        catch (ConditionThrowable t) {
            if (debug)
                thread.saveBacktrace();
            Stream out = getStandardOutput();
            String truename = null;
            LispObject obj = _LOAD_TRUENAME_.symbolValueNoThrow();
            if (obj instanceof LispString)
                truename = ((LispString)obj).getValue();
            StringBuffer sb = new StringBuffer("Error");
            if (truename != null) {
                sb.append(" in ");
                sb.append(truename);
            }
            sb.append(" at line ");
            sb.append(in.getLineNumber() + 1);
            sb.append(" (offset ");
            sb.append(in.getOffset());
            sb.append(')');
            out.writeLine(sb.toString());
            throw t;
        }
    }

    // Returns extension including leading '.'
    private static final String getExtension(String filename)
    {
        int index = filename.lastIndexOf('.');
        if (index < 0)
            return null;
        if (index < filename.lastIndexOf(File.separatorChar))
            return null; // Last dot was in path part of filename.
        return filename.substring(index);
    }

    private static final String getPath(URL url)
    {
        if (url != null) {
            String path = url.getPath();
            if (path != null) {
                if (System.getProperty("os.name").startsWith("Windows")) {
                    if (path.length() > 0 && path.charAt(0) == '/')
                        path = path.substring(1);
                }
                return path;
            }
        }
        return null;
    }

    // ### load
    // Need to support keyword args.
    // load filespec &key verbose print if-does-not-exist external-format
    public static final Primitive LOAD =
        new Primitive("load", "filespec &key verbose print if-does-not-exist external-format")
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length == 0)
                return signal(new WrongNumberOfArgumentsException(this));
            // FIXME Need to support streams as well as pathname designators.
            String filename;
            if (args[0] instanceof LispString)
                filename = ((LispString)args[0]).getValue();
            else if (args[0] instanceof Pathname)
                filename = ((Pathname)args[0]).getNamestring();
            else
                return signal(new TypeError(args[0], "pathname designator"));
            if (filename.endsWith(".compiled"))
                filename = filename.substring(0, filename.length() - 9);
            return load(filename,
                        _LOAD_VERBOSE_.symbolValueNoThrow() != NIL,
                        _LOAD_PRINT_.symbolValueNoThrow() != NIL);
        }
    };

    // ### %load
    public static final Primitive1 _LOAD =
        new Primitive1("%load", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return _load(LispString.getValue(arg),
                         _LOAD_VERBOSE_.symbolValueNoThrow() != NIL,
                         _LOAD_PRINT_.symbolValueNoThrow() != NIL,
                         false);
        }
    };
}
