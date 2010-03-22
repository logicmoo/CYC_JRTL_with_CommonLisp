/*
 * Load.java
 *
 * Copyright (C) 2002-2007 Peter Graves
 * $Id: Load.java 12550 2010-03-16 15:20:01Z mevenson $
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
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.LispPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

/* This file holds ABCL's (FASL and non-FASL) loading behaviours.
 *
 * The loading process works like this:
 *   The loader associates the input filename with a special variable
 *   and starts evaluating the forms in the file.
 *
 *   If one of the forms is (INIT-FASL :VERSION <version>), from that
 *   point the file is taken to be a FASL.
 *   The FASL loader takes over and retrieves the file being loaded
 *   from the special variable and continues loading from there.
 *
 */
public final class Load
{
    public static final SubLObject load(String filename)
    {
        final LispThread thread = LispThread.currentThread();
        return load(new Pathname(filename),
                    LispSymbols.LOAD_VERBOSE.symbolValue(thread) != NIL,
                    LispSymbols.LOAD_PRINT.symbolValue(thread) != NIL,
                    true);
    }
  
    /** @return Pathname of loadable file based on NAME, or null if
     * none can be determined. */
    private static final Pathname findLoadableFile(Pathname name) {
        SubLObject truename  = Pathname.truename(name, false);
        if (truename instanceof Pathname) {
            Pathname t = (Pathname)truename;
            if (t.name != NIL
                && t.name != null) {
                return t;
            }
        }
        if (name.type == NIL
            && (name.name != NIL || name.name != null)) {
            Pathname lispPathname = new Pathname(name);
            lispPathname.type = makeString("lisp");
            lispPathname.invalidateNamestring();
            SubLObject lisp = Pathname.truename(lispPathname, false);
            Pathname abclPathname = new Pathname(name);
            abclPathname.type = makeString("abcl");
            abclPathname.invalidateNamestring();
            SubLObject abcl = Pathname.truename(abclPathname, false);
            if (lisp instanceof Pathname && abcl instanceof Pathname) {
                lispPathname = (Pathname)lisp;
                abclPathname = (Pathname)abcl;
                long lispLastModified = lispPathname.getLastModified();
                long abclLastModified = abclPathname.getLastModified();
              if (abclLastModified > lispLastModified) {
                  return lispPathname;
              } else {
                  return abclPathname;
              }
            } else if (abcl instanceof Pathname) {
                return (Pathname) abcl;
            } else if (lisp instanceof Pathname) { 
                return (Pathname) lisp;
            }
        }
        if (name.isJar()) {
            if (name.type.equals(NIL)) {
                name.type = COMPILE_FILE_INIT_FASL_TYPE;
                name.invalidateNamestring();
                Pathname result = findLoadableFile(name);
                if (result != null) {
                    return result;
                }
                name.type = makeString(COMPILE_FILE_TYPE);
                name.invalidateNamestring();
                result = findLoadableFile(name);
                if (result != null) {
                    return result;
                }
            }
        }
        return null;
    }
  
    public static final SubLObject load(Pathname pathname,
                                        boolean verbose,
                                        boolean print,
                                        boolean ifDoesNotExist)
    {
        return load(pathname, verbose, print, ifDoesNotExist, false);
    }

    public static final SubLObject load(final Pathname pathname,
                                        boolean verbose,
                                        boolean print,
                                        boolean ifDoesNotExist,
                                        boolean returnLastResult)

    {
        Pathname mergedPathname = null;
        if (!pathname.isAbsolute() && !pathname.isJar()) {
            Pathname pathnameDefaults 
                = coerceToPathname(LispSymbols.DEFAULT_PATHNAME_DEFAULTS.symbolValue());
            mergedPathname = Pathname.mergePathnames(pathname, pathnameDefaults);
        }

        Pathname truename = findLoadableFile(mergedPathname != null ? mergedPathname : pathname);

        if (truename == null || truename.equals(NIL)) {
            if (ifDoesNotExist) {
                return error(new FileError("File not found.", pathname));
            } else {
                Debug.warn("Failed to load " + pathname.getNamestring());
                return NIL;
            }
        }

        if (Utilities.checkZipFile(truename)) {
            String n = truename.getNamestring();
            if (n.startsWith("jar:")) {
                n = "jar:" + n + "!/" + truename.name.getString() + "."
                    + COMPILE_FILE_INIT_FASL_TYPE;
            } else {
                n = "jar:file:" + n + "!/" + truename.name.getString() + "."
                    + COMPILE_FILE_INIT_FASL_TYPE.getString();
            }
            mergedPathname = new Pathname(n);
            SubLObject initTruename = Pathname.truename(mergedPathname);
            if (initTruename == null || initTruename.equals(NIL)) {
                // Maybe the enclosing JAR has been renamed?
                Pathname p = new Pathname(mergedPathname);
                p.name = Keyword.WILD;
                p.invalidateNamestring();
                SubLObject result = Pathname.MATCH_WILD_JAR_PATHNAME.execute(p);

                if      (result instanceof SubLCons
                    && ((SubLCons)result).cl_length() == 1
                    && ((SubLCons)result).car() instanceof Pathname) {
                    initTruename = (Pathname)result.car();
                } else {
                  String errorMessage
                      = "Loadable FASL not found for "
                      + "'" + pathname + "'"
                      + " in "
                      + "'" + mergedPathname + "'";
                  if (ifDoesNotExist) {
                      return error(new FileError(errorMessage, mergedPathname));
                  } else {
                      Debug.trace(errorMessage);
                      return NIL;
                  }
                }
            }
            truename = (Pathname)initTruename;
        }
        
        InputStream in = truename.getInputStream();
        Debug.assertTrue(in != null);
    
        try {
            return loadFileFromStream(pathname, truename,
                                      makeStream(LispSymbols.SYSTEM_STREAM, in, LispSymbols.CHARACTER),
                                      verbose, print, false, returnLastResult);
        }
        catch (FaslVersionMismatch e) {
            StringBuilder sb =
                new StringBuilder("Incorrect fasl version: ");
            sb.append(truename);
            return error(new SimpleError(sb.toString()));
        }
        finally {
            if (in != null) {
                try {
                   in.close();
                }
                catch (IOException e) {
                    return error(new LispError(e.getMessage()));
                }
            }
        }
    }

    public static final SubLObject loadSystemFile(String filename)

    {
        final LispThread thread = LispThread.currentThread();
        return loadSystemFile(filename,
                              LispSymbols.LOAD_VERBOSE.symbolValue(thread) != NIL,
                              LispSymbols.LOAD_PRINT.symbolValue(thread) != NIL,
                              false);
    }

    public static final SubLObject loadSystemFile(String filename, boolean auto)

    {
        LispThread thread = LispThread.currentThread();
        if (auto) {
            final SpecialBindingsMark mark = thread.markSpecialBindings();
            thread.bindSpecial(LispSymbols.CURRENT_READTABLE,
                               STANDARD_READTABLE.symbolValue(thread));
            thread.bindSpecial(LispSymbols._PACKAGE_, PACKAGE_CL_USER);
            try {
                return loadSystemFile(filename,
                                      _AUTOLOAD_VERBOSE_.symbolValue(thread) != NIL,
                                      LispSymbols.LOAD_PRINT.symbolValue(thread) != NIL,
                                      auto);
            }
            finally {
                thread.resetSpecialBindings(mark);
            }
        } else {
            return loadSystemFile(filename,
                                  LispSymbols.LOAD_VERBOSE.symbolValue(thread) != NIL,
                                  LispSymbols.LOAD_PRINT.symbolValue(thread) != NIL,
                                  auto);
        }
    }

    static final SubLObject COMPILE_FILE_INIT_FASL_TYPE = makeString("_");

    public static final SubLObject loadSystemFile(final String filename,
                                                  boolean verbose,
                                                  boolean print,
                                                  boolean auto)

    {
        InputStream in = null;
        Pathname pathname = null;
        Pathname truename = null;
        pathname = new Pathname(filename);
        SubLObject bootPath = Site.getLispHome();
        Pathname mergedPathname;
        if (bootPath instanceof Pathname) {
            mergedPathname = Pathname.mergePathnames(pathname, (Pathname)bootPath);
        } else {
            mergedPathname = pathname;
        }
        URL url = null;
        truename = findLoadableFile(mergedPathname);
        if (truename == null || truename.equals(NIL) || bootPath.equals(NIL)) {
            // Make an attempt to use the boot classpath
            String path = pathname.asEntryPath();
            url = Lisp.class.getResource(path);
            if (url == null || url.toString().endsWith("/")) {
                url = Lisp.class.getResource(path + ".abcl");
                if (url == null) {
                    url = Lisp.class.getResource(path + ".lisp");
                }                
            }
            if (url == null) {
                return error(new LispError("Failed to find loadable system file "
                                           + "'" + path + "'"
                                           + " in boot classpath."));
            }                
            if (!bootPath.equals(NIL)) {
                Pathname urlPathname = new Pathname(url);
                truename = findLoadableFile(urlPathname);
                if (truename == null) {
                    return error(new LispError("Failed to find loadable system file in boot classpath "
                                               + "'" + url + "'"));
                }
            } else {
                truename = null; // We can't represent the FASL in a Pathname (q.v. OSGi)
            }
        }

        // Look for a init FASL inside a packed FASL
        if (truename != null
            && truename.type.writeToString().equals(COMPILE_FILE_TYPE) && Utilities.checkZipFile(truename))  {
            Pathname init = new Pathname(truename.getNamestring());
            init.type = COMPILE_FILE_INIT_FASL_TYPE;
            SubLObject t = Pathname.truename(init);
            if (t instanceof Pathname) {
                truename = (Pathname)t;
            } else {
                return error (new LispError("Failed to find loadable init FASL in "
                                            + "'" + init.getNamestring() + "'"));
            }
        }

        if (truename != null) {
            in = truename.getInputStream();
        } else { 
            try {
                Debug.assertTrue(url != null);
                in = url.openStream();
            } catch (IOException e) {
                error(new FileError("Failed to load system file: " 
                                    + "'" + filename + "'"
                                    + " from URL: " 
                                    + "'" + url + "'"));
            } 
        }

        if (in != null) {
            final LispThread thread = LispThread.currentThread();
            final SpecialBindingsMark mark = thread.markSpecialBindings();
            thread.bindSpecial(_WARN_ON_REDEFINITION_, NIL);
            try {
                LispStream stream = makeStream(LispSymbols.SYSTEM_STREAM, in, LispSymbols.CHARACTER);
                return loadFileFromStream(pathname, truename, stream,
                                          verbose, print, auto);
            } catch (FaslVersionMismatch e) {
                StringBuilder sb =
                    new StringBuilder("; Incorrect fasl version: ");
                sb.append(truename);
                System.err.println(sb.toString());
            } finally {
                thread.resetSpecialBindings(mark);
                try {
                    in.close();
                }
                catch (IOException e) {
                    return error(new LispError(e.getMessage()));
                }
            }
        }
        return error(new FileError("Failed to load system file: " 
                                   + "'" + filename + "'"
                                   + " resolved as " 
                                   + "'" + mergedPathname + "'" , 
                                   truename));
    }

    // ### *fasl-version*
    // internal symbol
    static final SubLSymbol _FASL_VERSION_ =
        exportConstant("*FASL-VERSION*", PACKAGE_SYS, LispObjectFactory.makeInteger(35));

    // ### *fasl-external-format*
    // internal symbol
    private static final SubLSymbol _FASL_EXTERNAL_FORMAT_ =
        internConstant("*FASL-EXTERNAL-FORMAT*", PACKAGE_SYS,
                       makeString("UTF-8"));

    // ### *fasl-anonymous-package*
    // internal symbol
    /**
     * This variable gets bound to a package with no name in which the
     * reader can intern its uninterned symbols.
     *
     */
    public static final SubLSymbol _FASL_ANONYMOUS_PACKAGE_ =
        internSpecial("*FASL-ANONYMOUS-PACKAGE*", PACKAGE_SYS, NIL);

    // ### init-fasl &key version
    private static final Primitive INIT_FASL = new init_fasl();
    private static class init_fasl extends JavaPrimitive {
        init_fasl() {
            super("init-fasl", PACKAGE_SYS, true, "&key version");
        }
        @Override
        public SubLObject execute(SubLObject first, SubLObject second)

        {
            if (first == Keyword.VERSION) {
                if (second.eql(_FASL_VERSION_.getSymbolValue())) {
                    // OK
                    final LispThread thread = LispThread.currentThread();
                    thread.bindSpecial(_FASL_ANONYMOUS_PACKAGE_, NIL);
                    thread.bindSpecial(_SOURCE_, NIL);
                    return faslLoadStream(thread);
                }
            }
            throw new FaslVersionMismatch(second);
        }
    }

    private static final SubLObject loadFileFromStream(Pathname pathname,
                                                       Pathname truename,
                                                       LispStream in,
                                                       boolean verbose,
                                                       boolean print,
                                                       boolean auto)
        {
            return loadFileFromStream(pathname == null ? NIL : pathname, 
                                      truename == null ? NIL : truename, 
                                      in, verbose, print, auto, false);
    }

    // A nil TRUENAME signals a load from stream which has no possible path
    private static final SubLObject loadFileFromStream(SubLObject pathname,
                                                       SubLObject truename,
                                                       LispStream in,
                                                       boolean verbose,
                                                       boolean print,
                                                       boolean auto,
                                                       boolean returnLastResult)

    {
        long start = System.currentTimeMillis();
        final LispThread thread = LispThread.currentThread();
        final SpecialBindingsMark mark = thread.markSpecialBindings();
        // "LOAD binds *READTABLE* and *PACKAGE* to the values they held before
        // loading the file."
        thread.bindSpecialToCurrentValue(LispSymbols.CURRENT_READTABLE);
        thread.bindSpecialToCurrentValue(LispSymbols._PACKAGE_);
        int loadDepth = _LOAD_DEPTH_.symbolValue(thread).intValue();
        thread.bindSpecial(_LOAD_DEPTH_, LispObjectFactory.makeInteger(++loadDepth));
        // Compiler policy.
        thread.bindSpecialToCurrentValue(_SPEED_);
        thread.bindSpecialToCurrentValue(_SPACE_);
        thread.bindSpecialToCurrentValue(_SAFETY_);
        thread.bindSpecialToCurrentValue(_DEBUG_);
        thread.bindSpecialToCurrentValue(_EXPLAIN_);
        final String prefix = getLoadVerbosePrefix(loadDepth);
        try {
            thread.bindSpecial(LispSymbols.LOAD_PATHNAME, pathname);

            // The motivation behind the following piece of complexity
            // is the need to preserve the semantics of
            // *LOAD-TRUENAME* as always containing the truename of
            // the current "Lisp file".  Since an ABCL packed FASL
            // actually has a Lisp file (aka "the init FASL") and one
            // or more Java classes from the compiler, we endeavor to
            // make *LOAD-TRUENAME* refer to the "overall" truename so
            // that a (LOAD *LOAD-TRUENAME*) would be equivalent to
            // reloading the complete current "Lisp file".  If this
            // value diverges from the "true" truename, we set the
            // symbol SYS::*LOAD-TRUENAME-FASL* to that divergent
            // value.  Currently the only code that uses this value is
            // Lisp.readFunctionBytes().
            Pathname truePathname = null;
            if (!truename.equals(NIL)) {
                truePathname = new Pathname(((Pathname)truename).getNamestring());
                String type = truePathname.type.getString();
                if (type.equals(COMPILE_FILE_TYPE)
                    || type.equals(COMPILE_FILE_INIT_FASL_TYPE.getString())) {
                    Pathname truenameFasl = new Pathname(truePathname);
                    thread.bindSpecial(LispSymbols.LOAD_TRUENAME_FASL, truenameFasl);
                }
                if (truePathname.type.getString()
                    .equals(COMPILE_FILE_INIT_FASL_TYPE.getString())
                    && truePathname.isJar()) {
                    if (truePathname.device.rest() != NIL ) {
                        // We set *LOAD-TRUENAME* to the argument that
                        // a user would pass to LOAD.
                        Pathname enclosingJar = (Pathname)truePathname.device.cdr().car();
                        truePathname.device = makeCons(truePathname.device.car(), NIL);
                        truePathname.host = NIL;
                        truePathname.directory = enclosingJar.directory;
                        if (truePathname.directory.car().car().equals(Keyword.RELATIVE)) {
                            truePathname.car().setCar(Keyword.ABSOLUTE);
                        }
                        truePathname.name = enclosingJar.name;
                        truePathname.type = enclosingJar.type;
                        truePathname.invalidateNamestring();
                    } else {
                        // XXX There is something fishy in the asymmetry
                        // between the "jar:jar:http:" and "jar:jar:file:"
                        // cases but this currently passes the tests.
                        if (!(truePathname.device.first() instanceof SubLString)) {
                            truePathname = (Pathname)truePathname.device.first();
                            truePathname.invalidateNamestring();
                        }
                    }
                    thread.bindSpecial(LispSymbols.LOAD_TRUENAME, truePathname);
                } else {
                    thread.bindSpecial(LispSymbols.LOAD_TRUENAME, truename);
                }
            } else {
                thread.bindSpecial(LispSymbols.LOAD_TRUENAME, truename);
            }
            thread.bindSpecial(_SOURCE_,
                               pathname != null ? pathname : NIL);
            if (verbose) {
                LispStream out = getStandardOutput();
                out.freshLine();
                out._writeString(prefix);
                out._writeString(auto ? " Autoloading " : " Loading ");
                out._writeString(!truename.equals(NIL) ? truePathname.writeToString() : "stream");
                out._writeLine(" ...");
                out._finishOutput();
                SubLObject result = loadStream(in, print, thread, returnLastResult);
                long elapsed = System.currentTimeMillis() - start;
                out.freshLine();
                out._writeString(prefix);
                out._writeString(auto ? " Autoloaded " : " Loaded ");
                out._writeString(!truename.equals(NIL) ? truePathname.writeToString() : "stream");
                out._writeString(" (");
                out._writeString(String.valueOf(((float)elapsed)/1000));
                out._writeLine(" seconds)");
                out._finishOutput();
                return result;
            } else
                return loadStream(in, print, thread, returnLastResult);
        }
        finally {
            thread.resetSpecialBindings(mark);
        }
    }

    public static String getLoadVerbosePrefix(int loadDepth)
    {
        StringBuilder sb = new StringBuilder(";");
        for (int i = loadDepth - 1; i-- > 0;)
            sb.append(' ');
        return sb.toString();
    }

    private static final SubLObject loadStream(LispStream in, boolean print,
                                               LispThread thread)
        {
        return loadStream(in, print, thread, false);
    }

    private static final SubLObject loadStream(LispStream in, boolean print,
                                               LispThread thread, boolean returnLastResult)

    {
        final SpecialBindingsMark mark = thread.markSpecialBindings();
        thread.bindSpecial(_LOAD_STREAM_, in);
        SpecialBinding sourcePositionBinding =
            thread.bindSpecial(_SOURCE_POSITION_, Fixnum.ZERO);
        try {
            final Environment env = new Environment();
            SubLObject result = NIL;
            while (true) {
                sourcePositionBinding.value = LispObjectFactory.makeInteger(in.getOffset());
                SubLObject obj = in.read(false, EOF, false, thread);
                if (obj == EOF)
                    break;
                result = eval(obj, env, thread);
                if (print) {
                    LispStream out =
                        checkCharacterOutputStream(LispSymbols.STANDARD_OUTPUT.symbolValue(thread));
                    out._writeLine(result.writeToString());
                    out._finishOutput();
                }
            }
            if(returnLastResult) {
                return result;
            } else {
                return T;
            }
        }
        finally {
            thread.resetSpecialBindings(mark);
        }
    }

    static final SubLObject faslLoadStream(LispThread thread)
    {
        LispStream in = (LispStream) _LOAD_STREAM_.symbolValue(thread);
        final Environment env = new Environment();
        final SpecialBindingsMark mark = thread.markSpecialBindings();
        SubLObject result = NIL;
        try {
            thread.bindSpecial(_FASL_ANONYMOUS_PACKAGE_, new SubLPackage());
            thread.bindSpecial(AUTOLOADING_CACHE,
                               AutoloadedFunctionProxy.makePreloadingContext());
            in.setExternalFormat(_FASL_EXTERNAL_FORMAT_.symbolValue(thread));
            while (true) {
                SubLObject obj = in.faslRead(false, EOF, true, thread);
                if (obj == EOF)
                    break;
                result = eval(obj, env, thread);
            }
        }
        finally {
            thread.resetSpecialBindings(mark);
        }
        return result;
        //There's no point in using here the returnLastResult flag like in
        //loadStream(): this function is only called from init-fasl, which is
        //only called from load, which already has its own policy for choosing
        //whether to return T or the last value.
    }


    // ### %load filespec verbose print if-does-not-exist => generalized-boolean
    private static final Primitive _LOAD = new _load();
    private static class _load extends JavaPrimitive {
        _load() {
            super("%load", PACKAGE_SYS, false,
                  "filespec verbose print if-does-not-exist");
        }
        @Override
        public SubLObject execute(SubLObject filespec, SubLObject verbose,
                                  SubLObject print, SubLObject ifDoesNotExist)
        {
            return load(filespec, verbose, print, ifDoesNotExist, NIL);
        }
    }

    // ### %load-returning-last-result filespec verbose print if-does-not-exist => object
    private static final Primitive _LOAD_RETURNING_LAST_RESULT = new _load_returning_last_result();
    private static class _load_returning_last_result extends JavaPrimitive {
        _load_returning_last_result() {
            super("%load-returning-last-result", PACKAGE_SYS, false,
                  "filespec verbose print if-does-not-exist");
        }
        @Override
        public SubLObject execute(SubLObject filespec, SubLObject verbose,
                                  SubLObject print, SubLObject ifDoesNotExist)
            {
            return load(filespec, verbose, print, ifDoesNotExist, T);
        }
    }

    static final SubLObject load(SubLObject filespec,
                                         SubLObject verbose,
                                         SubLObject print,
                                         SubLObject ifDoesNotExist,
                                         SubLObject returnLastResult)
        {
        if (filespec instanceof LispStream) {
            if (((LispStream)filespec).isOpen()) {
                SubLObject pathname;
                if (filespec instanceof FileStream)
                    pathname = ((FileStream)filespec).getPathname();
                else
                    pathname = NIL;
                SubLObject truename;
                if (pathname instanceof Pathname)
                    truename = pathname;
                else
                    truename = NIL;
                return loadFileFromStream(pathname,
                                          truename,
                                          (LispStream) filespec,
                                          verbose != NIL,
                                          print != NIL,
                                          false,
                                          returnLastResult != NIL);
            }
            // If stream is closed, fall through...
        }
        Pathname pathname = coerceToPathname(filespec);
        if (pathname instanceof LogicalPathname)
            pathname = LogicalPathname.translateLogicalPathname((LogicalPathname)pathname);
        return load(pathname,
                    verbose != NIL,
                    print != NIL,
                    ifDoesNotExist != NIL,
                    returnLastResult != NIL);
    }

    // ### load-system-file
    private static final Primitive LOAD_SYSTEM_FILE = new load_system_file();
    private static class load_system_file extends JavaPrimitive {
        load_system_file () {
            super("load-system-file", PACKAGE_SYS, true);
        }
        @Override
        public SubLObject execute(SubLObject arg)
        {
            final LispThread thread = LispThread.currentThread();
            return loadSystemFile(arg.getString(),
                                  LispSymbols.LOAD_VERBOSE.symbolValue(thread) != NIL,
                                  LispSymbols.LOAD_PRINT.symbolValue(thread) != NIL,
                                  false);
        }
    }

    private static class FaslVersionMismatch extends Error
    {
        private final SubLObject version;

        public FaslVersionMismatch(SubLObject version)
        {
            this.version = version;
        }

        public SubLObject getVersion()
        {
            return version;
        }
    }
}
