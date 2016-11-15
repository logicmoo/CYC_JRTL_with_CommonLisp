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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

/**
 * See autoloads.lisp for a general explanation of what we're trying to achieve
 * here.
 */
public class Autoload extends Function {
	// ### autoload
	private static Primitive AUTOLOAD = new JavaPrimitive("autoload", Lisp.PACKAGE_EXT, true) {

		public SubLObject execute(SubLObject first) {
			if (first instanceof SubLSymbol) {
				SubLSymbol symbol = (SubLSymbol) first;
				symbol.setSymbolFunction(new Autoload(symbol));
				return Lisp.T;
			}
			if (first instanceof SubLCons) {
				for (SubLObject list = first; list != Lisp.NIL; list = list.rest()) {
					SubLSymbol symbol = Lisp.checkSymbol(list.first());
					symbol.setSymbolFunction(new Autoload(symbol));
				}
				return Lisp.T;
			}
			return Lisp.error(new TypeError(first));
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			String fileName = second.getString();
			if (first instanceof SubLSymbol) {
				SubLSymbol symbol = (SubLSymbol) first;
				symbol.setSymbolFunction(new Autoload(symbol, fileName, null));
				return Lisp.T;
			}
			if (first instanceof SubLCons) {
				for (SubLObject list = first; list != Lisp.NIL; list = list.rest()) {
					SubLSymbol symbol = Lisp.checkSymbol(list.first());
					symbol.setSymbolFunction(new Autoload(symbol, fileName, null));
				}
				return Lisp.T;
			}
			return Lisp.error(new TypeError(first));
		}
	};
	// ### resolve
	// Force autoload to be resolved.
	private static Primitive RESOLVE = new JavaPrimitive("resolve", Lisp.PACKAGE_EXT, true, "symbol") {

		public SubLObject execute(SubLObject arg) {
			SubLSymbol symbol = Lisp.checkSymbol(arg);
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
	private static Primitive AUTOLOADP = new JavaPrimitive("autoloadp", Lisp.PACKAGE_EXT, true, "symbol") {

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof SubLSymbol)
				if (arg.getSymbolFunction() instanceof Autoload)
					return Lisp.T;
			return Lisp.NIL;
		}
	};

	static {
		Autoload.autoload("acos", "MathFunctions");
		Autoload.autoload("acosh", "MathFunctions");
		Autoload.autoload("arithmetic-error-operands", "ArithmeticError");
		Autoload.autoload("arithmetic-error-operation", "ArithmeticError");
		Autoload.autoload("ash", "MathFunctions");
		Autoload.autoload("asin", "MathFunctions");
		Autoload.autoload("asinh", "MathFunctions");
		Autoload.autoload("atan", "MathFunctions");
		Autoload.autoload("atanh", "MathFunctions");
		Autoload.autoload("broadcast-stream-streams", "StreamFunctions");
		Autoload.autoload("ceiling", "MathFunctions");
		Autoload.autoload("cell-error-name", "ConditionFunctions");
		Autoload.autoload("char", "StringFunctions");
		Autoload.autoload("char-equal", "CharacterFunctions");
		Autoload.autoload("char-greaterp", "CharacterFunctions");
		Autoload.autoload("char-lessp", "CharacterFunctions");
		Autoload.autoload("char-not-greaterp", "CharacterFunctions");
		Autoload.autoload("char-not-lessp", "CharacterFunctions");
		Autoload.autoload("char<", "CharacterFunctions");
		Autoload.autoload("char<=", "CharacterFunctions");
		Autoload.autoload("char=", "CharacterFunctions");
		Autoload.autoload("cis", "MathFunctions");
		Autoload.autoload("clrhash", "HashTableFunctions");
		Autoload.autoload("clrhash", "HashTableFunctions");
		Autoload.autoload("concatenated-stream-streams", "StreamFunctions");
		Autoload.autoload("cos", "MathFunctions");
		Autoload.autoload("cosh", "MathFunctions");
		Autoload.autoload("delete-file", "FilesystemFunctions");
		Autoload.autoload("delete-package", "PackageFunctions");
		Autoload.autoload("echo-stream-input-stream", "StreamFunctions");
		Autoload.autoload("echo-stream-output-stream", "StreamFunctions");
		Autoload.autoload("exp", "MathFunctions");
		Autoload.autoload("expt", "MathFunctions");
		Autoload.autoload("file-author", "FilesystemFunctions");
		Autoload.autoload("file-error-pathname", "FilesystemFunctions");
		Autoload.autoload("file-length", "FilesystemFunctions");
		Autoload.autoload("file-string-length", "FilesystemFunctions");
		Autoload.autoload("file-write-date", "FilesystemFunctions");
		Autoload.autoload("float", "FloatFunctions");
		Autoload.autoload("float-digits", "FloatFunctions");
		Autoload.autoload("float-radix", "FloatFunctions");
		Autoload.autoload("float-sign", "MathFunctions");
		Autoload.autoload("floatp", "FloatFunctions");
		Autoload.autoload("floor", "MathFunctions");
		Autoload.autoload("ftruncate", "MathFunctions");
		Autoload.autoload("get-internal-real-time", "Time");
		Autoload.autoload("get-internal-run-time", "Time");
		Autoload.autoload("get-output-stream-string", "StreamFunctions");
		Autoload.autoload("get-properties", "ConsFunctions");
		Autoload.autoload("get-universal-time", "Time");
		Autoload.autoload("gethash", "HashTableFunctions");
		Autoload.autoload("gethash", "HashTableFunctions");
		Autoload.autoload("hash-table-count", "HashTableFunctions");
		Autoload.autoload("hash-table-count", "HashTableFunctions");
		Autoload.autoload("hash-table-p", "HashTableFunctions");
		Autoload.autoload("hash-table-p", "HashTableFunctions");
		Autoload.autoload("hash-table-rehash-size", "HashTableFunctions");
		Autoload.autoload("hash-table-rehash-size", "HashTableFunctions");
		Autoload.autoload("hash-table-rehash-threshold", "HashTableFunctions");
		Autoload.autoload("hash-table-rehash-threshold", "HashTableFunctions");
		Autoload.autoload("hash-table-size", "HashTableFunctions");
		Autoload.autoload("hash-table-size", "HashTableFunctions");
		Autoload.autoload("hash-table-test", "HashTableFunctions");
		Autoload.autoload("hash-table-test", "HashTableFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "inlined-primitive-p", "InlinedPrimitiveRegistry", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "inlined-primitive-method", "InlinedPrimitiveRegistry", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "%import", "PackageFunctions");
		Autoload.autoload("input-stream-p", "StreamFunctions");
		Autoload.autoload("integer-decode-float", "FloatFunctions");
		Autoload.autoload("interactive-stream-p", "StreamFunctions");
		Autoload.autoload("last", "ConsFunctions");
		Autoload.autoload("lisp-implementation-type", "Site");
		Autoload.autoload("lisp-implementation-version", "Site");
		Autoload.autoload("list-all-packages", "PackageFunctions");
		Autoload.autoload("listen", "StreamFunctions");
		Autoload.autoload("log", "MathFunctions");
		Autoload.autoload("logand", "MathFunctions");
		Autoload.autoload("logandc1", "MathFunctions");
		Autoload.autoload("logandc2", "MathFunctions");
		Autoload.autoload("logbitp", "MathFunctions");
		Autoload.autoload("logcount", "MathFunctions");
		Autoload.autoload("logeqv", "MathFunctions");
		Autoload.autoload("logior", "MathFunctions");
		Autoload.autoload("lognand", "MathFunctions");
		Autoload.autoload("lognor", "MathFunctions");
		Autoload.autoload("lognot", "MathFunctions");
		Autoload.autoload("logorc1", "MathFunctions");
		Autoload.autoload("logorc2", "MathFunctions");
		Autoload.autoload("logtest", "MathFunctions");
		Autoload.autoload("logxor", "MathFunctions");
		Autoload.autoload("long-site-name", "Site");
		Autoload.autoload("machine-instance", "Site");
		Autoload.autoload("machine-type", "Site");
		Autoload.autoload("machine-version", "Site");
		Autoload.autoload("make-broadcast-stream", "StreamFunctions");
		Autoload.autoload("make-concatenated-stream", "StreamFunctions");
		Autoload.autoload("make-echo-stream", "StreamFunctions");
		Autoload.autoload("make-string-input-stream", "StreamFunctions");
		Autoload.autoload("make-synonym-stream", "StreamFunctions");
		Autoload.autoload("maphash", "HashTableFunctions");
		Autoload.autoload("mod", "MathFunctions");
		Autoload.autoload("open-stream-p", "StreamFunctions");
		Autoload.autoload("output-stream-p", "StreamFunctions");
		Autoload.autoload("package-error-package", "ConditionFunctions");
		Autoload.autoload("package-name", "PackageFunctions");
		Autoload.autoload("package-nicknames", "PackageFunctions");
		Autoload.autoload("package-shadowing-symbols", "PackageFunctions");
		Autoload.autoload("package-use-list", "PackageFunctions");
		Autoload.autoload("package-used-by-list", "PackageFunctions");
		Autoload.autoload("packagep", "PackageFunctions");
		Autoload.autoload("peek-char", "StreamFunctions");
		Autoload.autoload("print-not-readable-object", "PrintNotReadable");
		Autoload.autoload("probe-file", "FilesystemFunctions");
		Autoload.autoload("rational", "FloatFunctions");
		Autoload.autoload("rem", "MathFunctions");
		Autoload.autoload("remhash", "HashTableFunctions");
		Autoload.autoload("remhash", "HashTableFunctions");
		Autoload.autoload("rename-package", "PackageFunctions");
		Autoload.autoload("room", "room");
		Autoload.autoload("scale-float", "FloatFunctions");
		Autoload.autoload("schar", "StringFunctions");
		Autoload.autoload("shadow", "PackageFunctions");
		Autoload.autoload("shadowing-import", "PackageFunctions");
		Autoload.autoload("short-site-name", "Site");
		Autoload.autoload("simple-condition-format-arguments", "SimpleCondition");
		Autoload.autoload("simple-condition-format-control", "SimpleCondition");
		Autoload.autoload("simple-string-p", "StringFunctions");
		Autoload.autoload("sin", "MathFunctions");
		Autoload.autoload("sinh", "MathFunctions");
		Autoload.autoload("software-type", "Site");
		Autoload.autoload("software-version", "Site");
		Autoload.autoload("sqrt", "MathFunctions");
		Autoload.autoload("stream-element-type", "StreamFunctions");
		Autoload.autoload("stream-error-stream", "StreamError");
		Autoload.autoload("stream-external-format", "StreamFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%set-stream-external-format", "StreamFunctions");
		Autoload.autoload("stringp", "StringFunctions");
		Autoload.autoload("sxhash", "HashTableFunctions");
		Autoload.autoload("sxhash", "HashTableFunctions");
		Autoload.autoload("synonym-stream-symbol", "StreamFunctions");
		Autoload.autoload("tan", "MathFunctions");
		Autoload.autoload("tanh", "MathFunctions");
		Autoload.autoload("truename", "FilesystemFunctions");
		Autoload.autoload("truncate", "MathFunctions");
		Autoload.autoload("type-error-datum", "TypeError");
		Autoload.autoload("type-error-expected-type", "TypeError");
		Autoload.autoload("unbound-slot-instance", "ConditionFunctions");
		Autoload.autoload("unexport", "PackageFunctions");
		Autoload.autoload("unuse-package", "PackageFunctions");
		Autoload.autoload(Lisp.PACKAGE_EXT, "arglist", "function_info", true);
		Autoload.autoload(Lisp.PACKAGE_EXT, "assq", "ConsFunctions", true);
		Autoload.autoload(Lisp.PACKAGE_EXT, "assql", "ConsFunctions", true);
		Autoload.autoload(Lisp.PACKAGE_EXT, "file-directory-p", "FilesystemFunctions", true);
		Autoload.autoload(Lisp.PACKAGE_EXT, "gc", "gc", true);
		Autoload.autoload(Lisp.PACKAGE_EXT, "get-floating-point-modes", "FloatFunctions", true);
		Autoload.autoload(Lisp.PACKAGE_EXT, "make-slime-input-stream", "StreamFunctions", true);
		Autoload.autoload(Lisp.PACKAGE_EXT, "make-slime-output-stream", "StreamFunctions", true);
		Autoload.autoload(Lisp.PACKAGE_EXT, "probe-directory", "FilesystemFunctions", true);
		Autoload.autoload(Lisp.PACKAGE_EXT, "set-floating-point-modes", "FloatFunctions", true);
		Autoload.autoload(Lisp.PACKAGE_EXT, "simple-string-fill", "StringFunctions");
		Autoload.autoload(Lisp.PACKAGE_EXT, "simple-string-search", "StringFunctions");
		Autoload.autoload(Lisp.PACKAGE_EXT, "string-input-stream-current", "StreamFunctions", true);
		Autoload.autoload(Lisp.PACKAGE_EXT, "string-find", "StringFunctions");
		Autoload.autoload(Lisp.PACKAGE_EXT, "string-position", "StringFunctions");
		Autoload.autoload(Lisp.PACKAGE_JAVA, "%jnew-proxy", "JProxy");
		Autoload.autoload(Lisp.PACKAGE_JAVA, "%find-java-class", "JavaClass");
		Autoload.autoload(Lisp.PACKAGE_JAVA, "%jmake-invocation-handler", "JProxy");
		Autoload.autoload(Lisp.PACKAGE_JAVA, "%jmake-proxy", "JProxy");
		Autoload.autoload(Lisp.PACKAGE_JAVA, "%jnew-runtime-class", "RuntimeClass");
		Autoload.autoload(Lisp.PACKAGE_JAVA, "%jredefine-method", "RuntimeClass");
		Autoload.autoload(Lisp.PACKAGE_JAVA, "%jregister-handler", "JHandler");
		Autoload.autoload(Lisp.PACKAGE_JAVA, "%load-java-class-from-byte-array", "RuntimeClass");
		Autoload.autoload(Lisp.PACKAGE_MOP, "funcallable-instance-function", "StandardGenericFunctionTrampolines",
				false);
		Autoload.autoload(Lisp.PACKAGE_MOP, "generic-function-name", "StandardGenericFunctionTrampolines", true);
		Autoload.autoload(Lisp.PACKAGE_MOP, "method-qualifiers", "StandardMethod", true);
		Autoload.autoload(Lisp.PACKAGE_MOP, "method-specializers", "StandardMethod", true);
		Autoload.autoload(Lisp.PACKAGE_MOP, "set-funcallable-instance-function", "StandardGenericFunctionTrampolines",
				true);
		Autoload.autoload(Lisp.PACKAGE_PROF, "%start-profiler", "Profiler", true);
		Autoload.autoload(Lisp.PACKAGE_PROF, "stop-profiler", "Profiler", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "%%string=", "StringFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%adjust-array", "ArrayFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%defpackage", "PackageFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%finalize-generic-function", "StandardGenericFunctionTrampolines", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "%generic-function-lambda-list", "StandardGenericFunctionTrampolines",
				true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "%generic-function-name", "StandardGenericFunctionTrampolines", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "%get-output-stream-bytes", "StreamFunctions"); // AS
		// 20090325
		Autoload.autoload(Lisp.PACKAGE_SYS, "%get-output-stream-array", "StreamFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%make-array", "ArrayFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%make-byte-array-input-stream", "ByteArrayInputStream"); // AS
		// 20100317
		Autoload.autoload(Lisp.PACKAGE_SYS, "%make-condition", "ConditionFunctions", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "%make-hash-table", "HashTableFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%make-hash-table", "HashTableFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%make-logical-pathname", "LogicalPathname", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "%make-server-socket", "SocketFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%make-socket", "SocketFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%make-string", "StringFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%make-string-output-stream", "StringOutputStream");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%method-fast-function", "StandardMethod", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "%method-function", "StandardMethod", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "%method-generic-function", "StandardMethod", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "%method-specializers", "StandardMethod", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "%nstring-capitalize", "StringFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%nstring-downcase", "StringFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%nstring-upcase", "StringFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%run-shell-command", "ShellCommand");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%server-socket-close", "SocketFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%set-arglist", "function_info");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%set-class-direct-slots", "SlotClass", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "%set-function-info", "function_info");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%set-generic-function-lambda-list", "StandardGenericFunctionTrampolines",
				true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "%set-generic-function-name", "StandardGenericFunctionTrampolines", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "%set-gf-required-args", "StandardGenericFunctionTrampolines", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "%set-method-fast-function", "StandardMethod", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "%set-method-function", "StandardMethod", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "%set-method-generic-function", "StandardMethod", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "%set-method-specializers", "StandardMethod", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "%simple-bit-vector-bit-and", "SimpleBitVector");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%simple-bit-vector-bit-andc1", "SimpleBitVector");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%simple-bit-vector-bit-andc2", "SimpleBitVector");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%simple-bit-vector-bit-eqv", "SimpleBitVector");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%simple-bit-vector-bit-ior", "SimpleBitVector");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%simple-bit-vector-bit-nand", "SimpleBitVector");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%simple-bit-vector-bit-nor", "SimpleBitVector");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%simple-bit-vector-bit-not", "SimpleBitVector");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%simple-bit-vector-bit-orc1", "SimpleBitVector");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%simple-bit-vector-bit-orc2", "SimpleBitVector");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%simple-bit-vector-bit-xor", "SimpleBitVector");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%slot-definition-allocation", "SlotDefinition", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "%slot-definition-allocation-class", "SlotDefinition", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "%slot-definition-initargs", "SlotDefinition", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "%slot-definition-initform", "SlotDefinition", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "%slot-definition-initfunction", "SlotDefinition", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "%slot-definition-location", "SlotDefinition", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "%slot-definition-name", "SlotDefinition", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "%slot-definition-readers", "SlotDefinition", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "%slot-definition-writers", "SlotDefinition", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "%socket-accept", "SocketFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%socket-close", "SocketFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%socket-stream", "SocketFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%string-capitalize", "StringFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%string-downcase", "StringFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%string-equal", "StringFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%string-greaterp", "StringFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%string-lessp", "StringFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%string-not-equal", "StringFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%string-not-greaterp", "StringFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%string-not-lessp", "StringFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%string-upcase", "StringFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%string/=", "StringFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%string<", "StringFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%string<=", "StringFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%string=", "StringFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%string>", "StringFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%string>=", "StringFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%time", "Time");
		Autoload.autoload(Lisp.PACKAGE_SYS, "cache-emf", "StandardGenericFunctionTrampolines", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "cache-slot-location", "StandardGenericFunctionTrampolines", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "canonicalize-logical-host", "FilesystemFunctions", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "class-direct-slots", "SlotClass");
		Autoload.autoload(Lisp.PACKAGE_SYS, "%float-bits", "FloatFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "coerce-to-double-float", "FloatFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "coerce-to-single-float", "FloatFunctions");
		// todo autoload(PACKAGE_SYS, "compute-class-direct-slots", "SlotClass",
		// true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "create-new-file", "FilesystemFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "default-time-zone", "Time");
		Autoload.autoload(Lisp.PACKAGE_SYS, "disassemble-class-bytes", "disassemble_class_bytes", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "disable-zip-cache", "ZipCache", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "double-float-high-bits", "FloatFunctions", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "double-float-low-bits", "FloatFunctions", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "float-infinity-p", "FloatFunctions", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "float-nan-p", "FloatFunctions", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "float-string", "FloatFunctions", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "function-info", "function_info");
		Autoload.autoload(Lisp.PACKAGE_SYS, "generic-function-argument-precedence-order",
				"StandardGenericFunctionTrampolines", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "generic-function-classes-to-emf-table",
				"StandardGenericFunctionTrampolines", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "generic-function-documentation", "StandardGenericFunctionTrampolines",
				true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "generic-function-initial-methods", "StandardGenericFunctionTrampolines",
				true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "generic-function-method-class", "StandardGenericFunctionTrampolines",
				true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "generic-function-method-combination", "StandardGenericFunctionTrampolines",
				true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "generic-function-methods", "StandardGenericFunctionTrampolines", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "get-cached-emf", "StandardGenericFunctionTrampolines", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "get-cached-slot-location", "StandardGenericFunctionTrampolines", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "get-function-info-value", "function_info");
		Autoload.autoload(Lisp.PACKAGE_SYS, "gf-required-args", "StandardGenericFunctionTrampolines", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "hash-table-entries", "HashTableFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "hash-table-entries", "HashTableFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "layout-class", "Layout", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "layout-length", "Layout", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "layout-slot-index", "Layout", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "layout-slot-location", "Layout", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "make-case-frob-stream", "StreamFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "make-double-float", "FloatFunctions", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "make-file-stream", "FileStream");
		Autoload.autoload(Lisp.PACKAGE_SYS, "make-fill-pointer-output-stream", "StreamFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "make-forward-referenced-class", "ForwardReferencedClass", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "make-layout", "Layout", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "make-single-float", "FloatFunctions", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "make-slot-definition", "SlotDefinition", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "make-structure-class", "StructureClass");
		Autoload.autoload(Lisp.PACKAGE_SYS, "make-symbol-macro", "SymbolMacro");
		Autoload.autoload(Lisp.PACKAGE_SYS, "method-documentation", "StandardMethod", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "method-lambda-list", "StandardMethod", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "psxhash", "HashTableFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "puthash", "HashTableFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "puthash", "HashTableFunctions");
		Autoload.autoload(Lisp.PACKAGE_SYS, "remove-zip-cache-entry", "ZipCache");
		Autoload.autoload(Lisp.PACKAGE_SYS, "set-function-info-value", "function_info");
		Autoload.autoload(Lisp.PACKAGE_SYS, "set-generic-function-argument-precedence-order",
				"StandardGenericFunctionTrampolines", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "set-generic-function-classes-to-emf-table",
				"StandardGenericFunctionTrampolines", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "set-generic-function-documentation", "StandardGenericFunctionTrampolines",
				true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "set-generic-function-initial-methods",
				"StandardGenericFunctionTrampolines", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "set-generic-function-method-class", "StandardGenericFunctionTrampolines",
				true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "set-generic-function-method-combination",
				"StandardGenericFunctionTrampolines", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "set-generic-function-methods", "StandardGenericFunctionTrampolines", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "set-method-documentation", "StandardMethod", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "set-method-lambda-list", "StandardMethod", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "set-method-qualifiers", "StandardMethod", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "set-slot-definition-allocation", "SlotDefinition", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "set-slot-definition-allocation-class", "SlotDefinition", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "set-slot-definition-initargs", "SlotDefinition", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "set-slot-definition-initform", "SlotDefinition", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "set-slot-definition-initfunction", "SlotDefinition", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "set-slot-definition-location", "SlotDefinition", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "set-slot-definition-name", "SlotDefinition", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "set-slot-definition-readers", "SlotDefinition", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "set-slot-definition-writers", "SlotDefinition", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "simple-list-remove-duplicates", "simple_list_remove_duplicates");
		Autoload.autoload(Lisp.PACKAGE_SYS, "single-float-bits", "FloatFunctions", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "std-allocate-instance", "StandardObjectFunctions", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "unzip", "unzip", true);
		Autoload.autoload(Lisp.PACKAGE_SYS, "zip", "zip", true);

		Autoload.autoload(Lisp.PACKAGE_SYS, "proxy-preloaded-function", "AutoloadedFunctionProxy", false);
		// autoload(PACKAGE_SYS, "make-function-preloading-context",
		// "AutoloadedFunctionProxy", false);
		Autoload.autoload(Lisp.PACKAGE_SYS, "function-preload", "AutoloadedFunctionProxy", false);

		Autoload.autoload(LispSymbols.COPY_LIST, "ConsFunctions");

		Autoload.autoload(LispSymbols.SET_CHAR, "StringFunctions");
		Autoload.autoload(LispSymbols.SET_SCHAR, "StringFunctions");

		Autoload.autoload(LispSymbols.SET_CLASS_SLOTS, "SlotClass");
		Autoload.autoload(LispSymbols._CLASS_SLOTS, "SlotClass");

		Autoload.autoload(LispSymbols.JAVA_EXCEPTION_CAUSE, "JavaException");
		Autoload.autoload(LispSymbols.JCLASS_NAME, "jclass_name");
		Autoload.autoload(LispSymbols.JCLASS_OF, "jclass_of");
		Autoload.autoload(LispSymbols.JMETHOD_RETURN_TYPE, "jmethod_return_type");

	}

	public static void autoload(String symbolName, String className) {
		Autoload.autoload(Lisp.PACKAGE_CL, symbolName, className);
	}

	public static void autoload(SubLPackage pkg, String symbolName, String className) {
		Autoload.autoload(pkg, symbolName, className, false);
	}

	public static void autoload(SubLPackage pkg, String symbolName, String className, boolean exported) {
		SubLSymbol symbol = Lisp.intern(symbolName.toUpperCase(), pkg);
		if (pkg != Lisp.PACKAGE_CL && exported)
			pkg.export(symbol);
		if (symbol.getSymbolFunction() == null)
			symbol.setSymbolFunction(
					new Autoload(symbol, null, "com.cyc.tool.subl.jrtl.nativeCode.commonLisp.".concat(className)));
	}

	public static void autoload(SubLSymbol symbol, String className) {
		if (symbol.getSymbolFunction() == null)
			symbol.setSymbolFunction(
					new Autoload(symbol, null, "com.cyc.tool.subl.jrtl.nativeCode.commonLisp.".concat(className)));
	}

	protected String fileName;

	protected String className;

	private SubLSymbol symbol;

	protected Autoload(SubLSymbol symbol) {
		super();
		this.fileName = null;
		this.className = null;
		this.symbol = symbol;
		symbol.setBuiltInFunction(false);
	}

	protected Autoload(SubLSymbol symbol, String fileName, String className) {
		super();
		this.fileName = fileName;
		this.className = className;
		this.symbol = symbol;
		symbol.setBuiltInFunction(false);
	}

	public SubLObject execute() {
		this.load();
		return this.symbol.execute();
	}

	public SubLObject execute(SubLObject arg) {
		this.load();
		return this.symbol.execute(arg);
	}

	public SubLObject execute(SubLObject first, SubLObject second)

	{
		this.load();
		return this.symbol.execute(first, second);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

	{
		this.load();
		return this.symbol.execute(first, second, third);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth)

	{
		this.load();
		return this.symbol.execute(first, second, third, fourth);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth)

	{
		this.load();
		return this.symbol.execute(first, second, third, fourth, fifth);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth)

	{
		this.load();
		return this.symbol.execute(first, second, third, fourth, fifth, sixth);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth, SubLObject seventh)

	{
		this.load();
		return this.symbol.execute(first, second, third, fourth, fifth, sixth, seventh);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth, SubLObject seventh, SubLObject eighth)

	{
		this.load();
		return this.symbol.execute(first, second, third, fourth, fifth, sixth, seventh, eighth);
	}

	public SubLObject execute(SubLObject[] args) {
		this.load();
		return this.symbol.execute(args);
	}

	protected String getFileName() {
		if (this.fileName != null)
			return this.fileName;
		return this.symbol.getJavaSymbolName().toLowerCase();
	}

	protected SubLSymbol getSymbol() {
		return this.symbol;
	}

	public void load() {
		if (this.className != null) {
			LispThread thread = LispThread.currentThread();
			SpecialBindingsMark mark = thread.markSpecialBindings();
			int loadDepth = Lisp._LOAD_DEPTH_.symbolValue().intValue();
			thread.bindSpecial(Lisp._LOAD_DEPTH_, LispObjectFactory.makeInteger(++loadDepth));
			try {
				if (Lisp._AUTOLOAD_VERBOSE_.symbolValue(thread) != Lisp.NIL
						|| "Y".equals(System.getProperty("abcl.autoload.verbose"))) {
					String prefix = Load.getLoadVerbosePrefix(loadDepth);
					LispStream out = Lisp.getStandardOutput();
					out._writeString(prefix);
					out._writeString(" Autoloading ");
					out._writeString(this.className);
					out._writeLine(" ...");
					out._finishOutput();
					long start = System.currentTimeMillis();
					Class.forName(this.className);
					long elapsed = System.currentTimeMillis() - start;
					out._writeString(prefix);
					out._writeString(" Autoloaded ");
					out._writeString(this.className);
					out._writeString(" (");
					out._writeString(String.valueOf((float) elapsed / 1000));
					out._writeLine(" seconds)");
					out._finishOutput();
				} else
					Class.forName(this.className);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} finally {
				thread.resetSpecialBindings(mark);
			}
		} else
			Load.loadSystemFile(this.getFileName(), true);
		if (Lisp.debug)
			if (this.symbol != null)
				if (this.symbol.getSymbolFunction() instanceof Autoload)
					Debug.trace("Unable to autoload " + this.symbol.writeToString() + " " + this.getFileName());
		// System.exit(-1);
	}

	public String writeToString() {
		StringBuffer sb = new StringBuffer("#<AUTOLOAD ");
		sb.append(this.symbol.writeToString());
		sb.append(" \"");
		if (this.className != null) {
			int index = this.className.lastIndexOf('.');
			if (index >= 0)
				sb.append(this.className.substring(index + 1));
			else
				sb.append(this.className);
			sb.append(".class");
		} else
			sb.append(this.getFileName());
		sb.append("\">");
		return sb.toString();
	}
}
