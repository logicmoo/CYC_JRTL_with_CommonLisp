/*
 * Autoload.java
 *
 * Copyright (C) 2003-2006 Peter Graves
 * $Id: Autoload.java 12557 2010-03-17 16:55:29Z astalla $
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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

/** See autoloads.lisp for a general explanation of what we're
 * trying to achieve here.
 */
public class Autoload extends Function
{
    protected final String fileName;
    protected final String className;

    private final SubLSymbol symbol;

    protected Autoload(SubLSymbol symbol)
    {
        super();
        fileName = null;
        className = null;
        this.symbol = symbol;
        symbol.setBuiltInFunction(false);
    }

    protected Autoload(SubLSymbol symbol, String fileName, String className)
    {
        super();
        this.fileName = fileName;
        this.className = className;
        this.symbol = symbol;
        symbol.setBuiltInFunction(false);
    }

    protected final SubLSymbol getSymbol()
    {
        return symbol;
    }

    public static void autoload(String symbolName, String className)
    {
        autoload(PACKAGE_CL, symbolName, className);
    }

    public static void autoload(SubLPackage pkg, String symbolName,
                                String className)
    {
        autoload(pkg, symbolName, className, false);
    }

    public static void autoload(SubLPackage pkg, String symbolName,
                                String className, boolean exported)
    {
        SubLSymbol symbol = intern(symbolName.toUpperCase(), pkg);
        if (pkg != PACKAGE_CL && exported) {
            pkg.export(symbol);
        }
        if (symbol.getSymbolFunction() == null)
            symbol.setSymbolFunction(new Autoload(symbol, null,
                                                  "com.cyc.tool.subl.jrtl.nativeCode.commonLisp.".concat(className)));
    }

    public static void autoload(SubLSymbol symbol, String className)
    {
        if (symbol.getSymbolFunction() == null)
            symbol.setSymbolFunction(new Autoload(symbol, null,
                                                  "com.cyc.tool.subl.jrtl.nativeCode.commonLisp.".concat(className)));
    }

    public void load()
    {
        if (className != null) {
            final LispThread thread = LispThread.currentThread();
            final SpecialBindingsMark mark = thread.markSpecialBindings();
            int loadDepth = _LOAD_DEPTH_.symbolValue().intValue();
            thread.bindSpecial(_LOAD_DEPTH_, LispObjectFactory.makeInteger(++loadDepth));
            try {
                if (_AUTOLOAD_VERBOSE_.symbolValue(thread) != NIL
                    || "Y".equals(System.getProperty("abcl.autoload.verbose")))
                {
                    final String prefix = Load.getLoadVerbosePrefix(loadDepth);
                    LispStream out = getStandardOutput();
                    out._writeString(prefix);
                    out._writeString(" Autoloading ");
                    out._writeString(className);
                    out._writeLine(" ...");
                    out._finishOutput();
                    long start = System.currentTimeMillis();
                    Class.forName(className);
                    long elapsed = System.currentTimeMillis() - start;
                    out._writeString(prefix);
                    out._writeString(" Autoloaded ");
                    out._writeString(className);
                    out._writeString(" (");
                    out._writeString(String.valueOf(((float)elapsed)/1000));
                    out._writeLine(" seconds)");
                    out._finishOutput();
                } else
                    Class.forName(className);
            }
            catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            finally {
                thread.resetSpecialBindings(mark);
            }
        } else
            Load.loadSystemFile(getFileName(), true);
        if (debug) {
            if (symbol != null) {
                if (symbol.getSymbolFunction() instanceof Autoload) {
                    Debug.trace("Unable to autoload " + symbol.writeToString() + " " + getFileName());
                   // System.exit(-1);
                }
            }
        }
    }

    protected final String getFileName()
    {
        if (fileName != null)
            return fileName;
        return symbol.getJavaSymbolName().toLowerCase();
    }

    @Override
    public SubLObject execute()
    {
        load();
        return symbol.execute();
    }

    @Override
    public SubLObject execute(SubLObject arg)
    {
        load();
        return symbol.execute(arg);
    }

    @Override
    public SubLObject execute(SubLObject first, SubLObject second)

    {
        load();
        return symbol.execute(first, second);
    }

    @Override
    public SubLObject execute(SubLObject first, SubLObject second,
                              SubLObject third)

    {
        load();
        return symbol.execute(first, second, third);
    }

    @Override
    public SubLObject execute(SubLObject first, SubLObject second,
                              SubLObject third, SubLObject fourth)

    {
        load();
        return symbol.execute(first, second, third, fourth);
    }

    @Override
    public SubLObject execute(SubLObject first, SubLObject second,
                              SubLObject third, SubLObject fourth,
                              SubLObject fifth)

    {
        load();
        return symbol.execute(first, second, third, fourth, fifth);
    }

    @Override
    public SubLObject execute(SubLObject first, SubLObject second,
                              SubLObject third, SubLObject fourth,
                              SubLObject fifth, SubLObject sixth)

    {
        load();
        return symbol.execute(first, second, third, fourth, fifth, sixth);
    }

    @Override
    public SubLObject execute(SubLObject first, SubLObject second,
                              SubLObject third, SubLObject fourth,
                              SubLObject fifth, SubLObject sixth,
                              SubLObject seventh)

    {
        load();
        return symbol.execute(first, second, third, fourth, fifth, sixth,
                              seventh);
    }

    @Override
    public SubLObject execute(SubLObject first, SubLObject second,
                              SubLObject third, SubLObject fourth,
                              SubLObject fifth, SubLObject sixth,
                              SubLObject seventh, SubLObject eighth)

    {
        load();
        return symbol.execute(first, second, third, fourth, fifth, sixth,
                              seventh, eighth);
    }

    @Override
    public SubLObject execute(SubLObject[] args)
    {
        load();
        return symbol.execute(args);
    }

    @Override
    public String writeToString()
    {
        StringBuffer sb = new StringBuffer("#<AUTOLOAD ");
        sb.append(symbol.writeToString());
        sb.append(" \"");
        if (className != null) {
            int index = className.lastIndexOf('.');
            if (index >= 0)
                sb.append(className.substring(index + 1));
            else
                sb.append(className);
            sb.append(".class");
        } else
            sb.append(getFileName());
        sb.append("\">");
        return sb.toString();
    }

    // ### autoload
    private static final Primitive AUTOLOAD =
        new JavaPrimitive("autoload", PACKAGE_EXT, true)
    {
        @Override
        public SubLObject execute(SubLObject first)
        {
            if (first instanceof SubLSymbol) {
                SubLSymbol symbol = (SubLSymbol) first;
                symbol.setSymbolFunction(new Autoload(symbol));
                return T;
            }
            if (first instanceof SubLCons) {
                for (SubLObject list = first; list != NIL; list = list.rest()) {
                    SubLSymbol symbol = checkSymbol(list.first());
                    symbol.setSymbolFunction(new Autoload(symbol));
                }
                return T;
            }
            return error(new TypeError(first));
        }
        @Override
        public SubLObject execute(SubLObject first, SubLObject second)

        {
            final String fileName = second.getString();
            if (first instanceof SubLSymbol) {
                SubLSymbol symbol = (SubLSymbol) first;
                symbol.setSymbolFunction(new Autoload(symbol, fileName, null));
                return T;
            }
            if (first instanceof SubLCons) {
                for (SubLObject list = first; list != NIL; list = list.rest()) {
                    SubLSymbol symbol = checkSymbol(list.first());
                    symbol.setSymbolFunction(new Autoload(symbol, fileName, null));
                }
                return T;
            }
            return error(new TypeError(first));
        }
    };

    // ### resolve
    // Force autoload to be resolved.
    private static final Primitive RESOLVE =
        new JavaPrimitive("resolve", PACKAGE_EXT, true, "symbol")
    {
        @Override
        public SubLObject execute(SubLObject arg)
        {
            SubLSymbol symbol = checkSymbol(arg);
            SubLObject fun = symbol.getSymbolFunction();
            if (fun instanceof Autoload) {
                Autoload autoload = (Autoload) fun;
                autoload.load();
                return symbol.getSymbolFunction();
            }
            return fun;
        }
    };

    // ### autoloadp
    private static final Primitive AUTOLOADP =
        new JavaPrimitive("autoloadp", PACKAGE_EXT, true, "symbol")
    {
        @Override
        public SubLObject execute(SubLObject arg)
        {
            if (arg instanceof SubLSymbol) {
                if (arg.getSymbolFunction() instanceof Autoload)
                    return T;
            }
            return NIL;
        }
    };

    static {
        autoload("acos", "MathFunctions");
        autoload("acosh", "MathFunctions");
        autoload("arithmetic-error-operands", "ArithmeticError");
        autoload("arithmetic-error-operation", "ArithmeticError");
        autoload("ash", "MathFunctions");
        autoload("asin", "MathFunctions");
        autoload("asinh", "MathFunctions");
        autoload("atan", "MathFunctions");
        autoload("atanh", "MathFunctions");
        autoload("broadcast-stream-streams", "StreamFunctions");
        autoload("ceiling", "MathFunctions");
        autoload("cell-error-name", "ConditionFunctions");
        autoload("char", "StringFunctions");
        autoload("char-equal", "CharacterFunctions");
        autoload("char-greaterp", "CharacterFunctions");
        autoload("char-lessp", "CharacterFunctions");
        autoload("char-not-greaterp", "CharacterFunctions");
        autoload("char-not-lessp", "CharacterFunctions");
        autoload("char<", "CharacterFunctions");
        autoload("char<=", "CharacterFunctions");
        autoload("char=", "CharacterFunctions");
        autoload("cis", "MathFunctions");
        autoload("clrhash", "HashTableFunctions");
        autoload("clrhash", "HashTableFunctions");
        autoload("concatenated-stream-streams", "StreamFunctions");
        autoload("cos", "MathFunctions");
        autoload("cosh", "MathFunctions");
        autoload("delete-file", "FilesystemFunctions");
        autoload("delete-package", "PackageFunctions");
        autoload("echo-stream-input-stream", "StreamFunctions");
        autoload("echo-stream-output-stream", "StreamFunctions");
        autoload("exp", "MathFunctions");
        autoload("expt", "MathFunctions");
        autoload("file-author", "FilesystemFunctions");
        autoload("file-error-pathname", "FilesystemFunctions");
        autoload("file-length", "FilesystemFunctions");
        autoload("file-string-length", "FilesystemFunctions");
        autoload("file-write-date", "FilesystemFunctions");
        autoload("float", "FloatFunctions");
        autoload("float-digits", "FloatFunctions");
        autoload("float-radix", "FloatFunctions");
        autoload("float-sign", "MathFunctions");
        autoload("floatp", "FloatFunctions");
        autoload("floor", "MathFunctions");
        autoload("ftruncate", "MathFunctions");
        autoload("get-internal-real-time", "Time");
        autoload("get-internal-run-time", "Time");
        autoload("get-output-stream-string", "StreamFunctions");
        autoload("get-properties", "ConsFunctions");
        autoload("get-universal-time", "Time");
        autoload("gethash", "HashTableFunctions");
        autoload("gethash", "HashTableFunctions");
        autoload("hash-table-count", "HashTableFunctions");
        autoload("hash-table-count", "HashTableFunctions");
        autoload("hash-table-p", "HashTableFunctions");
        autoload("hash-table-p", "HashTableFunctions");
        autoload("hash-table-rehash-size", "HashTableFunctions");
        autoload("hash-table-rehash-size", "HashTableFunctions");
        autoload("hash-table-rehash-threshold", "HashTableFunctions");
        autoload("hash-table-rehash-threshold", "HashTableFunctions");
        autoload("hash-table-size", "HashTableFunctions");
        autoload("hash-table-size", "HashTableFunctions");
        autoload("hash-table-test", "HashTableFunctions");
        autoload("hash-table-test", "HashTableFunctions");
        autoload(PACKAGE_SYS, "inlined-primitive-p", "InlinedPrimitiveRegistry", true);
        autoload(PACKAGE_SYS, "inlined-primitive-method", "InlinedPrimitiveRegistry", true);
        autoload(PACKAGE_SYS,"%import", "PackageFunctions");
        autoload("input-stream-p", "StreamFunctions");
        autoload("integer-decode-float", "FloatFunctions");
        autoload("interactive-stream-p", "StreamFunctions");
        autoload("last", "ConsFunctions");
        autoload("lisp-implementation-type", "Site");
        autoload("lisp-implementation-version", "Site");
        autoload("list-all-packages", "PackageFunctions");
        autoload("listen", "StreamFunctions");
        autoload("log", "MathFunctions");
        autoload("logand", "MathFunctions");
        autoload("logandc1", "MathFunctions");
        autoload("logandc2", "MathFunctions");
        autoload("logbitp", "MathFunctions");
        autoload("logcount", "MathFunctions");
        autoload("logeqv", "MathFunctions");
        autoload("logior", "MathFunctions");
        autoload("lognand", "MathFunctions");
        autoload("lognor", "MathFunctions");
        autoload("lognot", "MathFunctions");
        autoload("logorc1", "MathFunctions");
        autoload("logorc2", "MathFunctions");
        autoload("logtest", "MathFunctions");
        autoload("logxor", "MathFunctions");
        autoload("long-site-name", "Site");
        autoload("machine-instance", "Site");
        autoload("machine-type", "Site");
        autoload("machine-version", "Site");
        autoload("make-broadcast-stream", "StreamFunctions");
        autoload("make-concatenated-stream", "StreamFunctions");
        autoload("make-echo-stream", "StreamFunctions");
        autoload("make-string-input-stream", "StreamFunctions");
        autoload("make-synonym-stream", "StreamFunctions");
        autoload("maphash", "HashTableFunctions");
        autoload("mod", "MathFunctions");
        autoload("open-stream-p", "StreamFunctions");
        autoload("output-stream-p", "StreamFunctions");
        autoload("package-error-package", "ConditionFunctions");
        autoload("package-name", "PackageFunctions");
        autoload("package-nicknames", "PackageFunctions");
        autoload("package-shadowing-symbols", "PackageFunctions");
        autoload("package-use-list", "PackageFunctions");
        autoload("package-used-by-list", "PackageFunctions");
        autoload("packagep", "PackageFunctions");
        autoload("peek-char", "StreamFunctions");
        autoload("print-not-readable-object", "PrintNotReadable");
        autoload("probe-file", "FilesystemFunctions");
        autoload("rational", "FloatFunctions");
        autoload("rem", "MathFunctions");
        autoload("remhash", "HashTableFunctions");
        autoload("remhash", "HashTableFunctions");
        autoload("rename-package", "PackageFunctions");
        autoload("room", "room");
        autoload("scale-float", "FloatFunctions");
        autoload("schar", "StringFunctions");
        autoload("shadow", "PackageFunctions");
        autoload("shadowing-import", "PackageFunctions");
        autoload("short-site-name", "Site");
        autoload("simple-condition-format-arguments", "SimpleCondition");
        autoload("simple-condition-format-control", "SimpleCondition");
        autoload("simple-string-p", "StringFunctions");
        autoload("sin", "MathFunctions");
        autoload("sinh", "MathFunctions");
        autoload("software-type", "Site");
        autoload("software-version", "Site");
        autoload("sqrt", "MathFunctions");
        autoload("stream-element-type", "StreamFunctions");
        autoload("stream-error-stream", "StreamError");
        autoload("stream-external-format", "StreamFunctions");
        autoload(PACKAGE_SYS,"%set-stream-external-format", "StreamFunctions");
        autoload("stringp", "StringFunctions");
        autoload("sxhash", "HashTableFunctions");
        autoload("sxhash", "HashTableFunctions");
        autoload("synonym-stream-symbol", "StreamFunctions");
        autoload("tan", "MathFunctions");
        autoload("tanh", "MathFunctions");
        autoload("truename", "FilesystemFunctions");
        autoload("truncate", "MathFunctions");
        autoload("type-error-datum", "TypeError");
        autoload("type-error-expected-type", "TypeError");
        autoload("unbound-slot-instance", "ConditionFunctions");
        autoload("unexport", "PackageFunctions");
        autoload("unuse-package", "PackageFunctions");
        autoload(PACKAGE_EXT, "arglist", "function_info", true);
        autoload(PACKAGE_EXT, "assq", "ConsFunctions", true);
        autoload(PACKAGE_EXT, "assql", "ConsFunctions", true);
        autoload(PACKAGE_EXT, "file-directory-p", "FilesystemFunctions", true);
        autoload(PACKAGE_EXT, "gc", "gc", true);
        autoload(PACKAGE_EXT, "get-floating-point-modes", "FloatFunctions", true);
        autoload(PACKAGE_EXT, "make-slime-input-stream", "StreamFunctions", true);
        autoload(PACKAGE_EXT, "make-slime-output-stream", "StreamFunctions", true);
        autoload(PACKAGE_EXT, "probe-directory", "FilesystemFunctions", true);
        autoload(PACKAGE_EXT, "set-floating-point-modes", "FloatFunctions", true);
        autoload(PACKAGE_EXT, "simple-string-fill", "StringFunctions");
        autoload(PACKAGE_EXT, "simple-string-search", "StringFunctions");
        autoload(PACKAGE_EXT, "string-input-stream-current", "StreamFunctions", true);
        autoload(PACKAGE_EXT, "string-find", "StringFunctions");
        autoload(PACKAGE_EXT, "string-position", "StringFunctions");
        autoload(PACKAGE_JAVA, "%jnew-proxy", "JProxy");
        autoload(PACKAGE_JAVA, "%find-java-class", "JavaClass");
        autoload(PACKAGE_JAVA, "%jmake-invocation-handler", "JProxy");
        autoload(PACKAGE_JAVA, "%jmake-proxy", "JProxy");
        autoload(PACKAGE_JAVA, "%jnew-runtime-class", "RuntimeClass");
        autoload(PACKAGE_JAVA, "%jredefine-method", "RuntimeClass");
        autoload(PACKAGE_JAVA, "%jregister-handler", "JHandler");
        autoload(PACKAGE_JAVA, "%load-java-class-from-byte-array", "RuntimeClass");
        autoload(PACKAGE_MOP, "funcallable-instance-function", "StandardGenericFunctionTrampolines", false);
        autoload(PACKAGE_MOP, "generic-function-name", "StandardGenericFunctionTrampolines", true);
        autoload(PACKAGE_MOP, "method-qualifiers", "StandardMethod", true);
        autoload(PACKAGE_MOP, "method-specializers", "StandardMethod", true);
        autoload(PACKAGE_MOP, "set-funcallable-instance-function", "StandardGenericFunctionTrampolines", true);
        autoload(PACKAGE_PROF, "%start-profiler", "Profiler", true);
        autoload(PACKAGE_PROF, "stop-profiler", "Profiler", true);
        autoload(PACKAGE_SYS, "%%string=", "StringFunctions");
        autoload(PACKAGE_SYS, "%adjust-array", "ArrayFunctions");
        autoload(PACKAGE_SYS, "%defpackage", "PackageFunctions");
        autoload(PACKAGE_SYS, "%finalize-generic-function", "StandardGenericFunctionTrampolines", true);
        autoload(PACKAGE_SYS, "%generic-function-lambda-list", "StandardGenericFunctionTrampolines", true);
        autoload(PACKAGE_SYS, "%generic-function-name", "StandardGenericFunctionTrampolines", true);
        autoload(PACKAGE_SYS, "%get-output-stream-bytes", "StreamFunctions"); //AS 20090325
        autoload(PACKAGE_SYS, "%get-output-stream-array", "StreamFunctions");
        autoload(PACKAGE_SYS, "%make-array", "ArrayFunctions");
        autoload(PACKAGE_SYS, "%make-byte-array-input-stream", "ByteArrayInputStream"); //AS 20100317
        autoload(PACKAGE_SYS, "%make-condition", "ConditionFunctions", true);
        autoload(PACKAGE_SYS, "%make-hash-table", "HashTableFunctions");
        autoload(PACKAGE_SYS, "%make-hash-table", "HashTableFunctions");
        autoload(PACKAGE_SYS, "%make-logical-pathname", "LogicalPathname", true);
        autoload(PACKAGE_SYS, "%make-server-socket", "SocketFunctions");
        autoload(PACKAGE_SYS, "%make-socket", "SocketFunctions");
        autoload(PACKAGE_SYS, "%make-string", "StringFunctions");
        autoload(PACKAGE_SYS, "%make-string-output-stream", "StringOutputStream");
        autoload(PACKAGE_SYS, "%method-fast-function", "StandardMethod", true);
        autoload(PACKAGE_SYS, "%method-function", "StandardMethod", true);
        autoload(PACKAGE_SYS, "%method-generic-function", "StandardMethod", true);
        autoload(PACKAGE_SYS, "%method-specializers", "StandardMethod", true);
        autoload(PACKAGE_SYS, "%nstring-capitalize", "StringFunctions");
        autoload(PACKAGE_SYS, "%nstring-downcase", "StringFunctions");
        autoload(PACKAGE_SYS, "%nstring-upcase", "StringFunctions");
        autoload(PACKAGE_SYS, "%run-shell-command", "ShellCommand");
        autoload(PACKAGE_SYS, "%server-socket-close", "SocketFunctions");
        autoload(PACKAGE_SYS, "%set-arglist", "function_info");
        autoload(PACKAGE_SYS, "%set-class-direct-slots", "SlotClass", true);
        autoload(PACKAGE_SYS, "%set-function-info", "function_info");
        autoload(PACKAGE_SYS, "%set-generic-function-lambda-list", "StandardGenericFunctionTrampolines", true);
        autoload(PACKAGE_SYS, "%set-generic-function-name", "StandardGenericFunctionTrampolines", true);
        autoload(PACKAGE_SYS, "%set-gf-required-args", "StandardGenericFunctionTrampolines", true);
        autoload(PACKAGE_SYS, "%set-method-fast-function", "StandardMethod", true);
        autoload(PACKAGE_SYS, "%set-method-function", "StandardMethod", true);
        autoload(PACKAGE_SYS, "%set-method-generic-function", "StandardMethod", true);
        autoload(PACKAGE_SYS, "%set-method-specializers", "StandardMethod", true);
        autoload(PACKAGE_SYS, "%simple-bit-vector-bit-and", "SimpleBitVector");
        autoload(PACKAGE_SYS, "%simple-bit-vector-bit-andc1", "SimpleBitVector");
        autoload(PACKAGE_SYS, "%simple-bit-vector-bit-andc2", "SimpleBitVector");
        autoload(PACKAGE_SYS, "%simple-bit-vector-bit-eqv", "SimpleBitVector");
        autoload(PACKAGE_SYS, "%simple-bit-vector-bit-ior", "SimpleBitVector");
        autoload(PACKAGE_SYS, "%simple-bit-vector-bit-nand", "SimpleBitVector");
        autoload(PACKAGE_SYS, "%simple-bit-vector-bit-nor", "SimpleBitVector");
        autoload(PACKAGE_SYS, "%simple-bit-vector-bit-not", "SimpleBitVector");
        autoload(PACKAGE_SYS, "%simple-bit-vector-bit-orc1", "SimpleBitVector");
        autoload(PACKAGE_SYS, "%simple-bit-vector-bit-orc2", "SimpleBitVector");
        autoload(PACKAGE_SYS, "%simple-bit-vector-bit-xor", "SimpleBitVector");
        autoload(PACKAGE_SYS, "%slot-definition-allocation", "SlotDefinition", true);
        autoload(PACKAGE_SYS, "%slot-definition-allocation-class", "SlotDefinition", true);
        autoload(PACKAGE_SYS, "%slot-definition-initargs", "SlotDefinition", true);
        autoload(PACKAGE_SYS, "%slot-definition-initform", "SlotDefinition", true);
        autoload(PACKAGE_SYS, "%slot-definition-initfunction", "SlotDefinition", true);
        autoload(PACKAGE_SYS, "%slot-definition-location", "SlotDefinition", true);
        autoload(PACKAGE_SYS, "%slot-definition-name", "SlotDefinition", true);
        autoload(PACKAGE_SYS, "%slot-definition-readers", "SlotDefinition", true);
        autoload(PACKAGE_SYS, "%slot-definition-writers", "SlotDefinition", true);
        autoload(PACKAGE_SYS, "%socket-accept", "SocketFunctions");
        autoload(PACKAGE_SYS, "%socket-close", "SocketFunctions");
        autoload(PACKAGE_SYS, "%socket-stream", "SocketFunctions");
        autoload(PACKAGE_SYS, "%string-capitalize", "StringFunctions");
        autoload(PACKAGE_SYS, "%string-downcase", "StringFunctions");
        autoload(PACKAGE_SYS, "%string-equal", "StringFunctions");
        autoload(PACKAGE_SYS, "%string-greaterp", "StringFunctions");
        autoload(PACKAGE_SYS, "%string-lessp", "StringFunctions");
        autoload(PACKAGE_SYS, "%string-not-equal", "StringFunctions");
        autoload(PACKAGE_SYS, "%string-not-greaterp", "StringFunctions");
        autoload(PACKAGE_SYS, "%string-not-lessp", "StringFunctions");
        autoload(PACKAGE_SYS, "%string-upcase", "StringFunctions");
        autoload(PACKAGE_SYS, "%string/=", "StringFunctions");
        autoload(PACKAGE_SYS, "%string<", "StringFunctions");
        autoload(PACKAGE_SYS, "%string<=", "StringFunctions");
        autoload(PACKAGE_SYS, "%string=", "StringFunctions");
        autoload(PACKAGE_SYS, "%string>", "StringFunctions");
        autoload(PACKAGE_SYS, "%string>=", "StringFunctions");
        autoload(PACKAGE_SYS, "%time", "Time");
        autoload(PACKAGE_SYS, "cache-emf", "StandardGenericFunctionTrampolines", true);
        autoload(PACKAGE_SYS, "cache-slot-location", "StandardGenericFunctionTrampolines", true);
        autoload(PACKAGE_SYS, "canonicalize-logical-host", "FilesystemFunctions", true);
        autoload(PACKAGE_SYS, "class-direct-slots", "SlotClass");
	autoload(PACKAGE_SYS, "%float-bits", "FloatFunctions");
        autoload(PACKAGE_SYS, "coerce-to-double-float", "FloatFunctions");
        autoload(PACKAGE_SYS, "coerce-to-single-float", "FloatFunctions");
        //todo autoload(PACKAGE_SYS, "compute-class-direct-slots", "SlotClass", true);
        autoload(PACKAGE_SYS, "create-new-file", "FilesystemFunctions");
        autoload(PACKAGE_SYS, "default-time-zone", "Time");
        autoload(PACKAGE_SYS, "disassemble-class-bytes", "disassemble_class_bytes", true);
        autoload(PACKAGE_SYS, "disable-zip-cache", "ZipCache", true);
        autoload(PACKAGE_SYS, "double-float-high-bits", "FloatFunctions", true);
        autoload(PACKAGE_SYS, "double-float-low-bits", "FloatFunctions", true);
        autoload(PACKAGE_SYS, "float-infinity-p", "FloatFunctions", true);
        autoload(PACKAGE_SYS, "float-nan-p", "FloatFunctions", true);
        autoload(PACKAGE_SYS, "float-string", "FloatFunctions", true);
        autoload(PACKAGE_SYS, "function-info", "function_info");
        autoload(PACKAGE_SYS, "generic-function-argument-precedence-order","StandardGenericFunctionTrampolines", true);
        autoload(PACKAGE_SYS, "generic-function-classes-to-emf-table","StandardGenericFunctionTrampolines", true);
        autoload(PACKAGE_SYS, "generic-function-documentation","StandardGenericFunctionTrampolines", true);
        autoload(PACKAGE_SYS, "generic-function-initial-methods","StandardGenericFunctionTrampolines", true);
        autoload(PACKAGE_SYS, "generic-function-method-class","StandardGenericFunctionTrampolines", true);
        autoload(PACKAGE_SYS, "generic-function-method-combination","StandardGenericFunctionTrampolines", true);
        autoload(PACKAGE_SYS, "generic-function-methods","StandardGenericFunctionTrampolines", true);
        autoload(PACKAGE_SYS, "get-cached-emf", "StandardGenericFunctionTrampolines", true);
        autoload(PACKAGE_SYS, "get-cached-slot-location", "StandardGenericFunctionTrampolines", true);
        autoload(PACKAGE_SYS, "get-function-info-value", "function_info");
        autoload(PACKAGE_SYS, "gf-required-args", "StandardGenericFunctionTrampolines", true);
        autoload(PACKAGE_SYS, "hash-table-entries", "HashTableFunctions");
        autoload(PACKAGE_SYS, "hash-table-entries", "HashTableFunctions");
        autoload(PACKAGE_SYS, "layout-class", "Layout", true);
        autoload(PACKAGE_SYS, "layout-length", "Layout", true);
        autoload(PACKAGE_SYS, "layout-slot-index", "Layout", true);
        autoload(PACKAGE_SYS, "layout-slot-location", "Layout", true);
        autoload(PACKAGE_SYS, "make-case-frob-stream", "StreamFunctions");
        autoload(PACKAGE_SYS, "make-double-float", "FloatFunctions", true);
        autoload(PACKAGE_SYS, "make-file-stream", "FileStream");
        autoload(PACKAGE_SYS, "make-fill-pointer-output-stream", "StreamFunctions");
        autoload(PACKAGE_SYS, "make-forward-referenced-class", "ForwardReferencedClass", true);
        autoload(PACKAGE_SYS, "make-layout", "Layout", true);
        autoload(PACKAGE_SYS, "make-single-float", "FloatFunctions", true);
        autoload(PACKAGE_SYS, "make-slot-definition", "SlotDefinition", true);
        autoload(PACKAGE_SYS, "make-structure-class", "StructureClass");
        autoload(PACKAGE_SYS, "make-symbol-macro", "SymbolMacro");
        autoload(PACKAGE_SYS, "method-documentation", "StandardMethod", true);
        autoload(PACKAGE_SYS, "method-lambda-list", "StandardMethod", true);
        autoload(PACKAGE_SYS, "psxhash", "HashTableFunctions");
        autoload(PACKAGE_SYS, "puthash", "HashTableFunctions");
        autoload(PACKAGE_SYS, "puthash", "HashTableFunctions");
        autoload(PACKAGE_SYS, "remove-zip-cache-entry", "ZipCache");
        autoload(PACKAGE_SYS, "set-function-info-value", "function_info");
        autoload(PACKAGE_SYS, "set-generic-function-argument-precedence-order","StandardGenericFunctionTrampolines", true);
        autoload(PACKAGE_SYS, "set-generic-function-classes-to-emf-table","StandardGenericFunctionTrampolines", true);
        autoload(PACKAGE_SYS, "set-generic-function-documentation","StandardGenericFunctionTrampolines", true);
        autoload(PACKAGE_SYS, "set-generic-function-initial-methods","StandardGenericFunctionTrampolines", true);
        autoload(PACKAGE_SYS, "set-generic-function-method-class","StandardGenericFunctionTrampolines", true);
        autoload(PACKAGE_SYS, "set-generic-function-method-combination","StandardGenericFunctionTrampolines", true);
        autoload(PACKAGE_SYS, "set-generic-function-methods","StandardGenericFunctionTrampolines", true);
        autoload(PACKAGE_SYS, "set-method-documentation", "StandardMethod", true);
        autoload(PACKAGE_SYS, "set-method-lambda-list", "StandardMethod", true);
        autoload(PACKAGE_SYS, "set-method-qualifiers", "StandardMethod", true);
        autoload(PACKAGE_SYS, "set-slot-definition-allocation", "SlotDefinition", true);
        autoload(PACKAGE_SYS, "set-slot-definition-allocation-class", "SlotDefinition", true);
        autoload(PACKAGE_SYS, "set-slot-definition-initargs", "SlotDefinition", true);
        autoload(PACKAGE_SYS, "set-slot-definition-initform", "SlotDefinition", true);
        autoload(PACKAGE_SYS, "set-slot-definition-initfunction", "SlotDefinition", true);
        autoload(PACKAGE_SYS, "set-slot-definition-location", "SlotDefinition", true);
        autoload(PACKAGE_SYS, "set-slot-definition-name", "SlotDefinition", true);
        autoload(PACKAGE_SYS, "set-slot-definition-readers", "SlotDefinition", true);
        autoload(PACKAGE_SYS, "set-slot-definition-writers", "SlotDefinition", true);
        autoload(PACKAGE_SYS, "simple-list-remove-duplicates", "simple_list_remove_duplicates");
        autoload(PACKAGE_SYS, "single-float-bits", "FloatFunctions", true);
        autoload(PACKAGE_SYS, "std-allocate-instance", "StandardObjectFunctions", true);
        autoload(PACKAGE_SYS, "unzip", "unzip", true);
        autoload(PACKAGE_SYS, "zip", "zip", true);

        autoload(PACKAGE_SYS, "proxy-preloaded-function",
                 "AutoloadedFunctionProxy", false);
        //autoload(PACKAGE_SYS, "make-function-preloading-context",
        //         "AutoloadedFunctionProxy", false);
        autoload(PACKAGE_SYS, "function-preload",
                 "AutoloadedFunctionProxy", false);

        autoload(LispSymbols.COPY_LIST, "ConsFunctions");

        autoload(LispSymbols.SET_CHAR, "StringFunctions");
        autoload(LispSymbols.SET_SCHAR, "StringFunctions");

        autoload(LispSymbols.SET_CLASS_SLOTS, "SlotClass");
        autoload(LispSymbols._CLASS_SLOTS, "SlotClass");

        autoload(LispSymbols.JAVA_EXCEPTION_CAUSE, "JavaException");
        autoload(LispSymbols.JCLASS_NAME, "jclass_name");
        autoload(LispSymbols.JCLASS_OF, "jclass_of");
        autoload(LispSymbols.JMETHOD_RETURN_TYPE, "jmethod_return_type");
       
    }
}
