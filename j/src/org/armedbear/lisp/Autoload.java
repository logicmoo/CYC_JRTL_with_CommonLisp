/*
 * Autoload.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: Autoload.java,v 1.138 2004-01-20 00:58:32 piso Exp $
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

public class Autoload extends Function
{
    protected final Symbol symbol;
    protected final String fileName;
    protected final String className;

    protected Autoload(Symbol symbol)
    {
        this.symbol = symbol;
        fileName = null;
        className = null;
    }

    protected Autoload(Symbol symbol, String fileName, String className)
    {
        this.symbol = symbol;
        this.fileName = fileName;
        this.className = className;
    }

    public static void autoload(String symbolName, String className)
    {
        autoload(PACKAGE_CL, symbolName, className);
    }

    public static void autoload(Package pkg, String symbolName,
                                String className)
    {
        autoload(pkg, symbolName, className, false);
    }

    public static void autoload(Package pkg, String symbolName,
                                String className, boolean exported)
    {
        Symbol symbol = intern(symbolName.toUpperCase(), pkg);
        if (pkg != PACKAGE_CL && exported) {
            try {
                pkg.export(symbol);
            }
            catch (ConditionThrowable t) {
                Debug.assertTrue(false);
            }
        }
        if (symbol.getSymbolFunction() == null)
            symbol.setSymbolFunction(new Autoload(symbol, null,
                                                  "org.armedbear.lisp.".concat(className)));
    }

    public void load() throws ConditionThrowable
    {
        if (className != null) {
            final LispThread thread = LispThread.currentThread();
            final Environment oldDynEnv = thread.getDynamicEnvironment();
            int loadDepth = Fixnum.getInt(_LOAD_DEPTH_.symbolValue());
            thread.bindSpecial(_LOAD_DEPTH_, new Fixnum(++loadDepth));
            try {
                if (_AUTOLOAD_VERBOSE_.symbolValueNoThrow() != NIL) {
                    final String prefix = Load.getLoadVerbosePrefix(loadDepth);
                    CharacterOutputStream out = getStandardOutput();
                    out.writeString(prefix);
                    out.writeString(" Autoloading ");
                    out.writeString(className);
                    out.writeLine(" ...");
                    out.flushOutput();
                    long start = System.currentTimeMillis();
                    Class.forName(className);
                    long elapsed = System.currentTimeMillis() - start;
                    out.writeString(prefix);
                    out.writeString(" Autoloaded ");
                    out.writeString(className);
                    out.writeString(" (");
                    out.writeString(String.valueOf(((float)elapsed)/1000));
                    out.writeLine(" seconds)");
                    out.flushOutput();
                } else
                    Class.forName(className);
            }
            catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            finally {
                thread.setDynamicEnvironment(oldDynEnv);
            }
        } else
            Load._load(getFileName(), true);
    }

    public final Symbol getSymbol()
    {
        return symbol;
    }

    protected final String getFileName()
    {
        if (fileName != null)
            return fileName;
        return symbol.getName().toLowerCase().concat(".lisp");
    }

    public final int getFunctionalType()
    {
        return FTYPE_AUTOLOAD;
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("#<AUTOLOAD ");
        sb.append(symbol);
        sb.append(" \"");
        sb.append(getFileName());
        sb.append("\">");
        return sb.toString();
    }

    private static final Primitive AUTOLOAD =
        new Primitive("autoload", PACKAGE_EXT, true)
    {
        public LispObject execute(LispObject first) throws ConditionThrowable
        {
            if (first instanceof Symbol) {
                Symbol symbol = (Symbol) first;
                symbol.setSymbolFunction(new Autoload(symbol));
                return T;
            }
            if (first instanceof Cons) {
                for (LispObject list = first; list != NIL; list = list.cdr()) {
                    Symbol symbol = checkSymbol(list.car());
                    symbol.setSymbolFunction(new Autoload(symbol));
                }
                return T;
            }
            return signal(new TypeError(first));
        }
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            final String fileName = LispString.getValue(second);
            if (first instanceof Symbol) {
                Symbol symbol = (Symbol) first;
                symbol.setSymbolFunction(new Autoload(symbol, fileName, null));
                return T;
            }
            if (first instanceof Cons) {
                for (LispObject list = first; list != NIL; list = list.cdr()) {
                    Symbol symbol = checkSymbol(list.car());
                    symbol.setSymbolFunction(new Autoload(symbol, fileName, null));
                }
                return T;
            }
            return signal(new TypeError(first));
        }
    };

    // ### resolve
    // Force autoload to be resolved.
    private static final Primitive1 RESOLVE =
        new Primitive1("resolve", PACKAGE_EXT, true)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            Symbol symbol = checkSymbol(arg);
            LispObject fun = symbol.getSymbolFunction();
            if (fun instanceof Autoload) {
                Autoload autoload = (Autoload) fun;
                autoload.load();
                return autoload.getSymbol().getSymbolFunction();
            }
            return fun;
        }
    };

    // ### autoloadp
    private static final Primitive1 AUTOLOADP =
        new Primitive1("autoloadp", PACKAGE_EXT, true)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof Symbol) {
                if (arg.getSymbolFunction() instanceof Autoload)
                    return T;
            }
            return NIL;
        }
    };

    static {
        autoload("array-displacement", "DisplacedArray");
        autoload("ash", "ash");
        autoload("atan", "atan");
        autoload("cell-error-name", "cell_error_name");
        autoload("char-equal", "CharacterFunctions");
        autoload("char-greaterp", "CharacterFunctions");
        autoload("char-lessp", "CharacterFunctions");
        autoload("char-not-greaterp", "CharacterFunctions");
        autoload("char-not-lessp", "CharacterFunctions");
        autoload("char=", "CharacterFunctions");
        autoload("class-name", "LispClass");
        autoload("clrhash", "HashTable");
        autoload("copy-structure", "StructureObject");
        autoload("delete-file", "delete_file");
        autoload("delete-package", "PackageFunctions");
        autoload("describe", "describe");
        autoload("file-author", "file_author");
        autoload("file-error-pathname", "file_error_pathname");
        autoload("file-write-date", "file_write_date");
        autoload("find-class", "LispClass");
        autoload("get-internal-real-time", "Time");
        autoload("get-internal-run-time", "Time");
        autoload("get-output-stream-string", "StringOutputStream");
        autoload("get-properties", "get_properties");
        autoload("get-universal-time", "Time");
        autoload("gethash", "HashTable");
        autoload("hash-table-count", "HashTable");
        autoload("hash-table-p", "HashTable");
        autoload("hash-table-rehash-size", "HashTable");
        autoload("hash-table-rehash-threshold", "HashTable");
        autoload("hash-table-size", "HashTable");
        autoload("hash-table-test", "HashTable");
        autoload("import", "PackageFunctions");
        autoload("input-stream-p", "input_stream_p");
        autoload("interactive-stream-p", "interactive_stream_p");
        autoload("last", "last");
        autoload("lisp-implementation-type", "lisp_implementation_type");
        autoload("lisp-implementation-version", "lisp_implementation_version");
        autoload("list-all-packages", "PackageFunctions");
        autoload("logand", "logand");
        autoload("logandc1", "logandc1");
        autoload("logandc2", "logandc2");
        autoload("logbitp", "logbitp");
        autoload("logcount", "logcount");
        autoload("logeqv", "logeqv");
        autoload("logior", "logior");
        autoload("lognand", "lognand");
        autoload("lognor", "lognor");
        autoload("lognot", "lognot");
        autoload("logorc1", "logorc1");
        autoload("logorc2", "logorc2");
        autoload("logtest", "logtest");
        autoload("logxor", "logxor");
        autoload("make-string-input-stream", "StringInputStream");
        autoload("make-string-output-stream", "StringOutputStream");
        autoload("open-stream-p", "open_stream_p");
        autoload("output-stream-p", "output_stream_p");
        autoload("package-name", "PackageFunctions");
        autoload("package-nicknames", "PackageFunctions");
        autoload("package-shadowing-symbols", "PackageFunctions");
        autoload("package-use-list", "PackageFunctions");
        autoload("package-used-by-list", "PackageFunctions");
        autoload("packagep", "PackageFunctions");
        autoload("peek-char", "peek_char");
        autoload("probe-file", "probe_file");
        autoload("read-char-no-hang", "read_char_no_hang");
        autoload("remhash", "HashTable");
        autoload("rename-package", "PackageFunctions");
        autoload("room", "room");
        autoload("shadow", "PackageFunctions");
        autoload("shadowing-import", "PackageFunctions");
        autoload("stream-element-type", "stream_element_type");
        autoload("sxhash", "HashTable");
        autoload("truename", "probe_file");
        autoload("unbound-slot-instance", "unbound_slot_instance");
        autoload("unexport", "PackageFunctions");
        autoload("unuse-package", "PackageFunctions");
        autoload(PACKAGE_EXT, "add-class", "LispClass", true);
        autoload(PACKAGE_EXT, "arglist", "arglist", true);
        autoload(PACKAGE_EXT, "assq", "assq", true);
        autoload(PACKAGE_EXT, "assql", "assql", true);
        autoload(PACKAGE_EXT, "classp", "LispClass", true);
        autoload(PACKAGE_EXT, "file-directory-p", "probe_file", true);
        autoload(PACKAGE_EXT, "gc", "gc", true);
        autoload(PACKAGE_EXT, "probe-directory", "probe_file", true);
        autoload(PACKAGE_EXT, "string-input-stream-current", "StringInputStream", true);
        autoload(PACKAGE_JAVA, "%load-java-class-from-byte-array", "RuntimeClass");
        autoload(PACKAGE_JAVA, "%jnew-proxy", "JProxy");
        autoload(PACKAGE_JAVA, "%jnew-runtime-class", "RuntimeClass");
        autoload(PACKAGE_JAVA, "%jredefine-method", "RuntimeClass");
        autoload(PACKAGE_JAVA, "%jregister-handler", "JHandler");
        autoload(PACKAGE_PROF, "%start-profiler", "Profiler", true);
        autoload(PACKAGE_PROF, "stop-profiler", "Profiler", true);
        autoload(PACKAGE_SYS, "%defpackage", "PackageFunctions");
        autoload(PACKAGE_SYS, "%make-array", "make_array");
        autoload(PACKAGE_SYS, "%make-condition", "make_condition");
        autoload(PACKAGE_SYS, "%make-hash-table", "HashTable");
        autoload(PACKAGE_SYS, "%make-structure", "StructureObject");
        autoload(PACKAGE_SYS, "%nstring-capitalize", "StringFunctions");
        autoload(PACKAGE_SYS, "%nstring-downcase", "StringFunctions");
        autoload(PACKAGE_SYS, "%nstring-upcase", "StringFunctions");
        autoload(PACKAGE_SYS, "%open-input-file", "open");
        autoload(PACKAGE_SYS, "%open-output-file", "open");
        autoload(PACKAGE_SYS, "%set-arglist", "arglist");
        autoload(PACKAGE_SYS, "%set-class-direct-methods", "LispClass");
        autoload(PACKAGE_SYS, "%set-class-direct-slots", "SlotClass");
        autoload(PACKAGE_SYS, "%set-class-layout", "LispClass");
        autoload(PACKAGE_SYS, "%set-class-slots", "SlotClass");
        autoload(PACKAGE_SYS, "%set-generic-function-discriminating-function", "GenericFunction");
        autoload(PACKAGE_SYS, "%set-instance-ref", "StandardObject");
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
        autoload(PACKAGE_SYS, "%structure-ref", "StructureObject");
        autoload(PACKAGE_SYS, "%structure-ref-0", "StructureObject");
        autoload(PACKAGE_SYS, "%structure-ref-1", "StructureObject");
        autoload(PACKAGE_SYS, "%structure-ref-2", "StructureObject");
        autoload(PACKAGE_SYS, "%structure-set", "StructureObject");
        autoload(PACKAGE_SYS, "%structure-set-0", "StructureObject");
        autoload(PACKAGE_SYS, "%structure-set-1", "StructureObject");
        autoload(PACKAGE_SYS, "%structure-set-2", "StructureObject");
        autoload(PACKAGE_SYS, "%time", "Time");
        autoload(PACKAGE_SYS, "allocate-slot-storage", "StandardObject");
        autoload(PACKAGE_SYS, "allocate-std-instance", "StandardObject");
        autoload(PACKAGE_SYS, "class-direct-methods", "LispClass");
        autoload(PACKAGE_SYS, "class-direct-slots", "SlotClass");
        autoload(PACKAGE_SYS, "class-layout", "LispClass");
        autoload(PACKAGE_SYS, "class-slots", "SlotClass");
        autoload(PACKAGE_SYS, "default-time-zone", "Time");
        autoload(PACKAGE_SYS, "generic-function-discriminating-function", "GenericFunction");
        autoload(PACKAGE_SYS, "hash-table-entries", "HashTable");
        autoload(PACKAGE_SYS, "instance-ref", "StandardObject");
        autoload(PACKAGE_SYS, "layout-class", "Layout");
        autoload(PACKAGE_SYS, "layout-length", "Layout");
        autoload(PACKAGE_SYS, "make-fill-pointer-output-stream", "FillPointerOutputStream");
        autoload(PACKAGE_SYS, "make-instance-standard-class", "StandardClass");
        autoload(PACKAGE_SYS, "make-layout", "Layout");
        autoload(PACKAGE_SYS, "make-structure-class", "StructureClass");
        autoload(PACKAGE_SYS, "make-symbol-macro", "SymbolMacro");
        autoload(PACKAGE_SYS, "puthash", "HashTable");
        autoload(PACKAGE_SYS, "std-instance-slots", "StandardObject");
    }
}
