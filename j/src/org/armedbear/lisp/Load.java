/*
 * Load.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Load.java,v 1.7 2003-03-04 12:57:38 piso Exp $
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
    // ### *modules*
    private static final Symbol _MODULES_ =
        exportSpecial("*MODULES*", PACKAGE_CL, NIL);

    // ### *load-verbose*
    private static final Symbol _LOAD_VERBOSE_ =
        exportSpecial("*LOAD-VERBOSE*", PACKAGE_CL, T);

    // ### *load-print*
    private static final Symbol _LOAD_PRINT_ =
        exportSpecial("*LOAD-PRINT*", PACKAGE_CL, NIL);

    // ### *load-truename*
    private static final Symbol _LOAD_TRUENAME_ =
        exportSpecial("*LOAD-TRUENAME*", PACKAGE_CL, NIL);

    // ### *load-depth*
    // internal symbol
    private static final Symbol _LOAD_DEPTH_ =
        internSpecial("*LOAD-DEPTH*", PACKAGE_CL, new Fixnum(0));

    /*package*/ static final LispObject load(String filename)
        throws Condition
    {
        return load(filename, _LOAD_VERBOSE_.symbolValueNoThrow() != NIL,
            _LOAD_PRINT_.symbolValueNoThrow() != NIL);
    }

    private static final LispObject load(final String filename,
        boolean verbose, boolean print) throws Condition
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
                LispString.getValue(_DEFAULT_PATHNAME_DEFAULTS_.symbolValue());
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
            throw new LispError("file not found: " + filename);
        String truename = filename;
        InputStream in = null;
        try {
            in = new FileInputStream(file);
            truename = file.getCanonicalPath();
        }
        catch (FileNotFoundException e) {
            throw new LispError("file not found: " + filename);
        }
        catch (IOException e) {
            throw new LispError(e.getMessage());
        }
        return loadFileFromStream(truename, in, verbose, print);
    }

    /*package*/ static final LispObject _load(final String filename,
        boolean verbose, boolean print) throws Condition
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
            // Look in current directory.
            File file = new File(System.getProperty("user.dir"), filename);
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
        if (in != null)
            return loadFileFromStream(truename, in, verbose, print);
        throw new LispError("file not found: " + filename);
    }

    private static final LispObject loadFileFromStream(String truename,
        InputStream in, boolean verbose, boolean print) throws Condition
    {
        long start = System.currentTimeMillis();
        Environment oldDynEnv = dynEnv;
        dynEnv = new Environment(dynEnv);
        dynEnv.bind(_PACKAGE_, _PACKAGE_.symbolValue());
        long loadDepth = Fixnum.getValue(_LOAD_DEPTH_.symbolValue());
        dynEnv.bind(_LOAD_DEPTH_, new Fixnum(++loadDepth));
        StringBuffer sb = new StringBuffer();
        for (long i = 0; i < loadDepth; i++)
            sb.append(';');
        String semicolons = sb.toString();
        try {
            dynEnv.bind(_LOAD_TRUENAME_, new LispString(truename));
            if (verbose) {
                CharacterOutputStream out = getStandardOutput();
                out.writeString(semicolons);
                out.writeLine(" Loading " + truename + " ...");
                out.finishOutput();
            }
            LispObject result = loadStream(in, print);
            if (verbose) {
                long elapsed = System.currentTimeMillis() - start;
                CharacterOutputStream out = getStandardOutput();
                out.writeString(semicolons);
                out.writeString(" Loaded ");
                out.writeString(truename);
                out.writeString(" (");
                out.writeString(String.valueOf(((float)elapsed)/1000));
                out.writeLine(" seconds)");
                out.finishOutput();
            }
            return result;
        }
        finally {
            dynEnv = oldDynEnv;
        }
    }

    private static final LispObject loadStream(InputStream inputStream,
        boolean print) throws Condition
    {
        CharacterInputStream in = new CharacterInputStream(inputStream);
        int lineNumber = 0;
        int offset = 0;
        try {
            while (true) {
                lineNumber = in.getLineNumber();
                offset = in.getOffset();
                LispObject obj = in.read(false, EOF, true);
                if (obj == EOF)
                    break;
                LispObject result = eval(obj, new Environment());
                if (print) {
                    CharacterOutputStream out = getStandardOutput();
                    out.writeLine(String.valueOf(result));
                    out.finishOutput();
                }
            }
            return T;
        }
        catch (LispError e) {
            CharacterOutputStream out = getStandardOutput();
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
            sb.append(lineNumber + 1);
            sb.append(" (offset ");
            sb.append(offset);
            sb.append(')');
            out.writeLine(sb.toString());
            throw e;
        }
    }

    // Returns extension including leading '.'
    private static final String getExtension(String filename)
    {
        int index = filename.lastIndexOf('.');
        if (index < 0)
            return null;
        if (index < filename.lastIndexOf(java.io.File.separatorChar))
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


    // (member string list :test #'string=)
    private static final boolean containsString(LispString string,
        LispObject list) throws LispError
    {
        LispObject rest = checkList(list);
        String s = string.getValue();
        while (rest != NIL) {
            LispObject car = rest.car();
            if (car instanceof LispString)
                if (s.equalsIgnoreCase(((LispString)car).getValue()))
                    return true;
            rest = rest.cdr();
        }
        return false;
    }

    // ### load
    // Need to support keyword args.
    // load filespec &key verbose print if-does-not-exist external-format
    public static final Primitive LOAD = new Primitive("load") {
        public LispObject execute(LispObject[] args) throws Condition
        {
            if (args.length == 0)
                throw new WrongNumberOfArgumentsException(this);
            // For now we require a string, but we should also support streams
            // and pathnames.
            String filename = LispString.getValue(args[0]);
            return load(filename, _LOAD_VERBOSE_.symbolValueNoThrow() != NIL,
                _LOAD_PRINT_.symbolValueNoThrow() != NIL);
        }
    };

    // ### %load
    // FIXME This function should not be exported from COMMON-LISP!
    public static final Primitive1 _LOAD = new Primitive1("%load") {
        public LispObject execute(LispObject arg) throws Condition
        {
            String filename = LispString.getValue(arg);
            return _load(filename, _LOAD_VERBOSE_.symbolValueNoThrow() != NIL,
                _LOAD_PRINT_.symbolValueNoThrow() != NIL);
        }
    };

    // ### provide
    public static final Primitive1 PROVIDE = new Primitive1("provide") {
        public final LispObject execute(LispObject arg) throws LispError
        {
            LispString string = string(arg);
            LispObject list = _MODULES_.getSymbolValue();
            if (!containsString(string, list)) {
                list = new Cons(string, list);
                _MODULES_.setSymbolValue(list);
            }
            return NIL;
        }
    };

    // ### require
    // require module-name &optional pathname-list => implementation-dependent
    public static final Primitive REQUIRE = new Primitive("require") {
        public final LispObject execute(LispObject[] args) throws Condition
        {
            if (args.length < 1)
                throw new WrongNumberOfArgumentsException(this);
            LispString string = string(args[0]);
            LispObject list = _MODULES_.getSymbolValue();
            if (containsString(string, list))
                return T;
            return load(string.getValue());
        }
    };
}
