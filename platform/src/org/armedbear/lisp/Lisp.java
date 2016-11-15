/*
 * Lisp.java
 *
 * Copyright (C) 2002-2007 Peter Graves <peter@armedbear.org>
 * $Id: Lisp.java 12524 2010-03-11 15:49:05Z mevenson $
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
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
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

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.URL;
import java.util.Hashtable;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class Lisp {

	static class nullValue extends AbstractLispObject {

		public String writeToString() {
			return "null";
		}
	}

	static class unboundValue extends AbstractLispObject {

		public String writeToString() {
			return "#<UNBOUND>";
		}
	}

	public static boolean debug = true;

	public static boolean cold = true;
	public static boolean initialized;
	// Packages.
	public static SubLPackage PACKAGE_CL = LispPackages.createPackage("COMMON-LISP", 1024);
	public static SubLPackage PACKAGE_CL_USER = LispPackages.createPackage("COMMON-LISP-USER", 1024);
	public static SubLPackage PACKAGE_KEYWORD = LispPackages.findPackage("KEYWORD").toPackage();
	public static SubLPackage PACKAGE_SYS = LispPackages.createPackage("SYSTEM");
	public static SubLPackage PACKAGE_MOP = LispPackages.createPackage("MOP");
	public static SubLPackage PACKAGE_TPL = LispPackages.createPackage("TOP-LEVEL");
	public static SubLPackage PACKAGE_EXT = LispPackages.createPackage("EXTENSIONS");
	public static SubLPackage PACKAGE_JVM = LispPackages.createPackage("JVM");
	public static SubLPackage PACKAGE_LOOP = LispPackages.createPackage("LOOP");
	public static SubLPackage PACKAGE_PROF = LispPackages.createPackage("PROFILER");
	public static SubLPackage PACKAGE_JAVA = LispPackages.createPackage("JAVA");
	public static SubLPackage PACKAGE_LISP = LispPackages.createPackage("LISP");
	public static SubLPackage PACKAGE_THREADS = LispPackages.createPackage("THREADS");
	public static SubLPackage PACKAGE_FORMAT = LispPackages.createPackage("FORMAT");
	public static SubLPackage PACKAGE_XP = LispPackages.createPackage("XP");
	public static SubLPackage PACKAGE_PRECOMPILER = LispPackages.createPackage("PRECOMPILER");

	public static SubLPackage PACKAGE_SEQUENCE = LispPackages.createPackage("SEQUENCE");

	public static SubLPackage PACKAGE_USER = LispPackages.createPackage("USER");

	// ### nil
	public static SubLObject NIL = Nil.NIL;

	// We need NIL before we can call usePackage().
	static {
		Lisp.PACKAGE_CL.addNickname("CL");
		// PACKAGE_CL_USER.addNickname("USER");
		Lisp.PACKAGE_CL_USER.addNickname("CL-USER");
		Lisp.PACKAGE_CL_USER.usePackage(Lisp.PACKAGE_CL);
		Lisp.PACKAGE_CL_USER.usePackage(Lisp.PACKAGE_EXT);
		Lisp.PACKAGE_CL_USER.usePackage(Lisp.PACKAGE_JAVA);
		Lisp.PACKAGE_SYS.addNickname("SYS");
		Lisp.PACKAGE_SYS.usePackage(Lisp.PACKAGE_CL);
		Lisp.PACKAGE_SYS.usePackage(Lisp.PACKAGE_EXT);
		Lisp.PACKAGE_MOP.usePackage(Lisp.PACKAGE_CL);
		Lisp.PACKAGE_MOP.usePackage(Lisp.PACKAGE_EXT);
		Lisp.PACKAGE_MOP.usePackage(Lisp.PACKAGE_SYS);
		Lisp.PACKAGE_TPL.addNickname("TPL");
		Lisp.PACKAGE_TPL.usePackage(Lisp.PACKAGE_CL);
		Lisp.PACKAGE_TPL.usePackage(Lisp.PACKAGE_EXT);
		Lisp.PACKAGE_EXT.addNickname("EXT");
		Lisp.PACKAGE_EXT.usePackage(Lisp.PACKAGE_CL);
		Lisp.PACKAGE_EXT.usePackage(Lisp.PACKAGE_THREADS);
		Lisp.PACKAGE_JVM.usePackage(Lisp.PACKAGE_CL);
		Lisp.PACKAGE_JVM.usePackage(Lisp.PACKAGE_EXT);
		Lisp.PACKAGE_JVM.usePackage(Lisp.PACKAGE_SYS);
		Lisp.PACKAGE_LOOP.usePackage(Lisp.PACKAGE_CL);
		Lisp.PACKAGE_PROF.addNickname("PROF");
		Lisp.PACKAGE_PROF.usePackage(Lisp.PACKAGE_CL);
		Lisp.PACKAGE_PROF.usePackage(Lisp.PACKAGE_EXT);
		Lisp.PACKAGE_JAVA.usePackage(Lisp.PACKAGE_CL);
		Lisp.PACKAGE_JAVA.usePackage(Lisp.PACKAGE_EXT);
		Lisp.PACKAGE_LISP.usePackage(Lisp.PACKAGE_CL);
		Lisp.PACKAGE_LISP.usePackage(Lisp.PACKAGE_EXT);
		Lisp.PACKAGE_LISP.usePackage(Lisp.PACKAGE_SYS);
		Lisp.PACKAGE_THREADS.usePackage(Lisp.PACKAGE_CL);
		Lisp.PACKAGE_THREADS.usePackage(Lisp.PACKAGE_EXT);
		Lisp.PACKAGE_THREADS.usePackage(Lisp.PACKAGE_SYS);
		Lisp.PACKAGE_FORMAT.usePackage(Lisp.PACKAGE_CL);
		Lisp.PACKAGE_FORMAT.usePackage(Lisp.PACKAGE_EXT);
		Lisp.PACKAGE_XP.usePackage(Lisp.PACKAGE_CL);
		Lisp.PACKAGE_PRECOMPILER.addNickname("PRE");
		Lisp.PACKAGE_PRECOMPILER.usePackage(Lisp.PACKAGE_CL);
		Lisp.PACKAGE_PRECOMPILER.usePackage(Lisp.PACKAGE_EXT);
		Lisp.PACKAGE_PRECOMPILER.usePackage(Lisp.PACKAGE_SYS);
		Lisp.PACKAGE_SEQUENCE.usePackage(Lisp.PACKAGE_CL);
		// :user package for backwards compat
		Lisp.PACKAGE_USER.usePackage(Lisp.PACKAGE_CL);
		Lisp.PACKAGE_USER.usePackage(Lisp.PACKAGE_EXT);
		Lisp.PACKAGE_USER.usePackage(Lisp.PACKAGE_JAVA);
		Lisp.PACKAGE_USER.usePackage(Lisp.PACKAGE_CL_USER);
		Lisp.PACKAGE_USER.usePackage(Lisp.PACKAGE_LISP);
		// PACKAGE_USER.usePackage(PACKAGE_SYS);
	}

	// End-of-file marker.
	public static SubLObject EOF = new BlockLispObject();

	public static boolean profiling = true;

	public static boolean sampling = false;

	public static volatile boolean sampleNow;

	// ### interactive-eval
	private static Primitive INTERACTIVE_EVAL = new JavaPrimitive("interactive-eval", Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject object) {
			final LispThread thread = LispThread.currentThread();
			thread.setSpecialVariable(LispSymbols.MINUS, object);
			SubLObject result;
			try {
				result = thread.execute(LispSymbols.EVAL.getSymbolFunction(), object);
			} catch (OutOfMemoryError e) {
				return Lisp.error(new LispError("Out of memory."));
			} catch (StackOverflowError e) {
				thread.setSpecialVariable(Lisp._SAVED_BACKTRACE_, thread.backtrace(0));
				return Lisp.error(new StorageCondition("Stack overflow."));
			} catch (ControlTransfer c) {
				throw c;
			} catch (Throwable t) // ControlTransfer handled above
			{
				Debug.trace(t);
				thread.setSpecialVariable(Lisp._SAVED_BACKTRACE_, thread.backtrace(0));
				return Lisp.error(new LispError("Caught " + t + "."));
			}
			Debug.assertTrue(result != null);
			thread.setSpecialVariable(LispSymbols.STAR_STAR_STAR, thread.safeSymbolValue(LispSymbols.STAR_STAR));
			thread.setSpecialVariable(LispSymbols.STAR_STAR, thread.safeSymbolValue(LispSymbols.STAR));
			thread.setSpecialVariable(LispSymbols.STAR, result);
			thread.setSpecialVariable(LispSymbols.PLUS_PLUS_PLUS, thread.safeSymbolValue(LispSymbols.PLUS_PLUS));
			thread.setSpecialVariable(LispSymbols.PLUS_PLUS, thread.safeSymbolValue(LispSymbols.PLUS));
			thread.setSpecialVariable(LispSymbols.PLUS, thread.safeSymbolValue(LispSymbols.MINUS));
			SubLObject[] values = thread._values;
			thread.setSpecialVariable(LispSymbols.SLASH_SLASH_SLASH, thread.safeSymbolValue(LispSymbols.SLASH_SLASH));
			thread.setSpecialVariable(LispSymbols.SLASH_SLASH, thread.safeSymbolValue(LispSymbols.SLASH));
			if (values != null) {
				SubLObject slash = Lisp.NIL;
				for (int i = values.length; i-- > 0;)
					slash = LispObjectFactory.makeCons(values[i], slash);
				thread.setSpecialVariable(LispSymbols.SLASH, slash);
			} else
				thread.setSpecialVariable(LispSymbols.SLASH, LispObjectFactory.makeCons(result));
			return result;
		}
	};

	public static volatile boolean interrupted;

	public static int CALL_REGISTERS_MAX = 8;

	static {
		// ### *gensym-counter*
		LispSymbols.GENSYM_COUNTER.initializeSpecial(Fixnum.ZERO);
	}

	private static BigInteger INT_MIN = BigInteger.valueOf(Integer.MIN_VALUE);

	private static BigInteger INT_MAX = BigInteger.valueOf(Integer.MAX_VALUE);

	public static SubLObject FUNCTION_NAME = Lisp.list(LispSymbols.OR, LispSymbols.SYMBOL,
			Lisp.list(LispSymbols.CONS, Lisp.list(LispSymbols.EQL, LispSymbols.SETF),
					Lisp.list(LispSymbols.CONS, LispSymbols.SYMBOL, LispSymbols.NULL)));

	public static SubLObject UNSIGNED_BYTE_8 = Lisp.list(LispSymbols.UNSIGNED_BYTE, Fixnum.constants[8]);

	public static SubLObject UNSIGNED_BYTE_16 = Lisp.list(LispSymbols.UNSIGNED_BYTE, Fixnum.constants[16]);

	public static SubLObject UNSIGNED_BYTE_32 = Lisp.list(LispSymbols.UNSIGNED_BYTE, Fixnum.constants[32]);

	public static SubLObject UNSIGNED_BYTE_32_MAX_VALUE = LispObjectFactory.makeBignum(4294967296L);

	// The compiler's object table.
	static Hashtable<String, SubLObject> objectTable = new Hashtable<String, SubLObject>();

	// ### remember
	public static Primitive REMEMBER = new JavaPrimitive("remember", Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject key, SubLObject value)

		{
			Lisp.objectTable.put(key.STRING().getString(), value);
			return Lisp.NIL;
		}
	};

	// ### recall
	public static Primitive RECALL = new JavaPrimitive("recall", Lisp.PACKAGE_SYS, true) {
		public SubLObject execute(SubLObject key) {
			return this.execute(key, Lisp.NIL);
		}

		public SubLObject execute(SubLObject key, SubLObject value)

		{
			String sk = key.STRING().getString();
			if (!Lisp.objectTable.containsKey(sk))
				return value;
			value = Lisp.objectTable.get(sk);
			return value;
		}
	};

	static {
		String userDir = System.getProperty("user.dir");
		if (userDir != null && userDir.length() > 0)
			if (userDir.charAt(userDir.length() - 1) != File.separatorChar)
				userDir = userDir.concat(File.separator);
		// This string will be converted to a pathname when Pathname.java is
		// loaded.
		LispSymbols.DEFAULT_PATHNAME_DEFAULTS.initializeSpecial(LispObjectFactory.makeString(userDir));
	}

	static {
		LispSymbols._PACKAGE_.initializeSpecial(Lisp.PACKAGE_CL_USER);
	}

	static {
		LispSymbols.CURRENT_READTABLE.initializeSpecial(new Readtable());
	}

	// ### +standard-readtable+
	// internal symbol
	public static SubLSymbol STANDARD_READTABLE = Lisp.internConstant("+STANDARD-READTABLE+", Lisp.PACKAGE_SYS,
			new Readtable());

	static {
		LispSymbols.READ_SUPPRESS.initializeSpecial(Lisp.NIL);
		LispSymbols.DEBUGGER_HOOK.initializeSpecial(Lisp.NIL);
	}

	static {
		LispSymbols.MOST_POSITIVE_FIXNUM.initializeConstant(LispObjectFactory.makeInteger(Integer.MAX_VALUE));
		LispSymbols.MOST_NEGATIVE_FIXNUM.initializeConstant(LispObjectFactory.makeInteger(Integer.MIN_VALUE));
		LispSymbols.MOST_POSITIVE_JAVA_LONG.initializeConstant(LispObjectFactory.makeBignum(Long.MAX_VALUE));
		LispSymbols.MOST_NEGATIVE_JAVA_LONG.initializeConstant(LispObjectFactory.makeBignum(Long.MIN_VALUE));
	}

	// ### t
	public static SubLSymbol T = LispSymbols.T;

	static {
		Lisp.T.initializeConstant(Lisp.T);
	}

	static {
		LispSymbols.READ_EVAL.initializeSpecial(Lisp.T);
	}

	// ### *features*
	static {
		LispSymbols.FEATURES.initializeSpecial(Lisp.NIL);
		String osName = System.getProperty("os.name");
		if (osName.startsWith("Linux"))
			LispSymbols.FEATURES.setSymbolValue(Lisp.list(Keyword.ARMEDBEAR, Keyword.ABCL, Keyword.COMMON_LISP,
					Keyword.ANSI_CL, Keyword.UNIX, Keyword.LINUX, Keyword.CDR6));
		else if (osName.startsWith("SunOS"))
			LispSymbols.FEATURES.setSymbolValue(Lisp.list(Keyword.ARMEDBEAR, Keyword.ABCL, Keyword.COMMON_LISP,
					Keyword.ANSI_CL, Keyword.UNIX, Keyword.SUNOS, Keyword.CDR6));
		else if (osName.startsWith("Mac OS X") || osName.startsWith("Darwin"))
			LispSymbols.FEATURES.setSymbolValue(Lisp.list(Keyword.ARMEDBEAR, Keyword.ABCL, Keyword.COMMON_LISP,
					Keyword.ANSI_CL, Keyword.UNIX, Keyword.DARWIN, Keyword.CDR6));
		else if (osName.startsWith("FreeBSD"))
			LispSymbols.FEATURES.setSymbolValue(Lisp.list(Keyword.ARMEDBEAR, Keyword.ABCL, Keyword.COMMON_LISP,
					Keyword.ANSI_CL, Keyword.UNIX, Keyword.FREEBSD, Keyword.CDR6));
		else if (osName.startsWith("OpenBSD"))
			LispSymbols.FEATURES.setSymbolValue(Lisp.list(Keyword.ARMEDBEAR, Keyword.ABCL, Keyword.COMMON_LISP,
					Keyword.ANSI_CL, Keyword.UNIX, Keyword.OPENBSD, Keyword.CDR6));
		else if (osName.startsWith("NetBSD"))
			LispSymbols.FEATURES.setSymbolValue(Lisp.list(Keyword.ARMEDBEAR, Keyword.ABCL, Keyword.COMMON_LISP,
					Keyword.ANSI_CL, Keyword.UNIX, Keyword.NETBSD, Keyword.CDR6));
		else if (osName.startsWith("Windows"))
			LispSymbols.FEATURES.setSymbolValue(Lisp.list(Keyword.ARMEDBEAR, Keyword.ABCL, Keyword.COMMON_LISP,
					Keyword.ANSI_CL, Keyword.WINDOWS, Keyword.CDR6));
		else
			LispSymbols.FEATURES.setSymbolValue(
					Lisp.list(Keyword.ARMEDBEAR, Keyword.ABCL, Keyword.COMMON_LISP, Keyword.ANSI_CL, Keyword.CDR6));
	}

	static {
		final String version = System.getProperty("java.version");
		if (version.startsWith("1.5"))
			LispSymbols.FEATURES.setSymbolValue(
					LispObjectFactory.makeCons(Keyword.JAVA_1_5, LispSymbols.FEATURES.getSymbolValue()));
		else if (version.startsWith("1.6"))
			LispSymbols.FEATURES.setSymbolValue(
					LispObjectFactory.makeCons(Keyword.JAVA_1_6, LispSymbols.FEATURES.getSymbolValue()));
		else if (version.startsWith("1.7"))
			LispSymbols.FEATURES.setSymbolValue(
					LispObjectFactory.makeCons(Keyword.JAVA_1_7, LispSymbols.FEATURES.getSymbolValue()));
	}

	static {
		String os_arch = System.getProperty("os.arch");
		if (os_arch != null)
			if (os_arch.equals("amd64"))
				LispSymbols.FEATURES.setSymbolValue(
						LispObjectFactory.makeCons(Keyword.X86_64, LispSymbols.FEATURES.getSymbolValue()));
			else if (os_arch.equals("x86"))
				LispSymbols.FEATURES
						.setSymbolValue(LispObjectFactory.makeCons(Keyword.X86, LispSymbols.FEATURES.getSymbolValue()));
	}

	static {
		LispSymbols.MODULES.initializeSpecial(Lisp.NIL);
	}

	static {
		LispSymbols.LOAD_VERBOSE.initializeSpecial(Lisp.NIL);
		LispSymbols.LOAD_PRINT.initializeSpecial(Lisp.NIL);
		LispSymbols.LOAD_PATHNAME.initializeSpecial(Lisp.NIL);
		LispSymbols.LOAD_TRUENAME.initializeSpecial(Lisp.NIL);
		LispSymbols.LOAD_TRUENAME_FASL.initializeSpecial(Lisp.NIL);
		LispSymbols.COMPILE_VERBOSE.initializeSpecial(Lisp.T);
		LispSymbols.COMPILE_PRINT.initializeSpecial(Lisp.T);
		LispSymbols._COMPILE_FILE_PATHNAME_.initializeSpecial(Lisp.NIL);
		LispSymbols.COMPILE_FILE_TRUENAME.initializeSpecial(Lisp.NIL);
	}

	// ### *double-colon-package-separators*
	// internal symbol
	public static SubLSymbol DOUBLE_COLON_PACKAGE_SEPARATORS = Lisp.internSpecial("*DOUBLE-COLON-PACKAGE-SEPARATORS*",
			Lisp.PACKAGE_SYS, Lisp.NIL);

	// ### *load-depth*
	// internal symbol
	public static SubLSymbol _LOAD_DEPTH_ = Lisp.internSpecial("*LOAD-DEPTH*", Lisp.PACKAGE_SYS, Fixnum.ZERO);

	// ### *load-stream*
	// internal symbol
	public static SubLSymbol _LOAD_STREAM_ = Lisp.internSpecial("*LOAD-STREAM*", Lisp.PACKAGE_SYS, Lisp.NIL);

	// ### *source*
	// internal symbol
	public static SubLSymbol _SOURCE_ = Lisp.exportSpecial("*SOURCE*", Lisp.PACKAGE_SYS, Lisp.NIL);

	// ### *source-position*
	// internal symbol
	public static SubLSymbol _SOURCE_POSITION_ = Lisp.exportSpecial("*SOURCE-POSITION*", Lisp.PACKAGE_SYS, Lisp.NIL);

	// ### *autoload-verbose*
	// internal symbol
	public static SubLSymbol _AUTOLOAD_VERBOSE_ = Lisp.exportSpecial("*AUTOLOAD-VERBOSE*", Lisp.PACKAGE_EXT, Lisp.NIL);

	// ### *preloading-cache*
	public static SubLSymbol AUTOLOADING_CACHE = Lisp.internSpecial("*AUTOLOADING-CACHE*", Lisp.PACKAGE_SYS, Lisp.NIL);

	// ### *compile-file-type*
	public static String COMPILE_FILE_TYPE = "abcl";

	public static SubLSymbol _COMPILE_FILE_TYPE_ = Lisp.internConstant("*COMPILE-FILE-TYPE*", Lisp.PACKAGE_SYS,
			LispObjectFactory.makeString(Lisp.COMPILE_FILE_TYPE));

	// ### *compile-file-zip*
	public static SubLSymbol _COMPILE_FILE_ZIP_ = Lisp.exportSpecial("*COMPILE-FILE-ZIP*", Lisp.PACKAGE_SYS, Lisp.T);

	static {
		LispSymbols.MACROEXPAND_HOOK.initializeSpecial(LispSymbols.FUNCALL);
	}

	public static int ARRAY_DIMENSION_MAX = Integer.MAX_VALUE;

	static {
		// ### array-dimension-limit
		LispSymbols.ARRAY_DIMENSION_LIMIT.initializeConstant(LispObjectFactory.makeInteger(Lisp.ARRAY_DIMENSION_MAX));
	}

	// ### char-code-limit
	// "The upper exclusive bound on the value returned by the function
	// CHAR-CODE."
	public static int CHAR_MAX = Character.MAX_VALUE;

	static {
		LispSymbols.CHAR_CODE_LIMIT.initializeConstant(LispObjectFactory.makeInteger(Lisp.CHAR_MAX + 1));
	}

	static {
		LispSymbols.READ_BASE.initializeSpecial(Fixnum.constants[10]);
	}

	static {
		LispSymbols.READ_DEFAULT_FLOAT_FORMAT.initializeSpecial(LispSymbols.SINGLE_FLOAT);
	}

	// Printer control variables.
	static {
		LispSymbols.PRINT_ARRAY.initializeSpecial(Lisp.T);
		LispSymbols.PRINT_BASE.initializeSpecial(Fixnum.constants[10]);
		LispSymbols.PRINT_CASE.initializeSpecial(Keyword.UPCASE);
		LispSymbols.PRINT_CIRCLE.initializeSpecial(Lisp.NIL);
		LispSymbols.PRINT_ESCAPE.initializeSpecial(Lisp.T);
		LispSymbols.PRINT_GENSYM.initializeSpecial(Lisp.T);
		LispSymbols.PRINT_LENGTH.initializeSpecial(Lisp.NIL);
		LispSymbols.PRINT_LEVEL.initializeSpecial(Lisp.NIL);
		LispSymbols.PRINT_LINES.initializeSpecial(Lisp.NIL);
		LispSymbols.PRINT_MISER_WIDTH.initializeSpecial(Lisp.NIL);
		LispSymbols.PRINT_PPRINT_DISPATCH.initializeSpecial(Lisp.NIL);
		LispSymbols.PRINT_PRETTY.initializeSpecial(Lisp.NIL);
		LispSymbols.PRINT_RADIX.initializeSpecial(Lisp.NIL);
		LispSymbols.PRINT_READABLY.initializeSpecial(Lisp.NIL);
		LispSymbols.PRINT_RIGHT_MARGIN.initializeSpecial(Lisp.NIL);
	}

	public static SubLSymbol _PRINT_STRUCTURE_ = Lisp.exportSpecial("*PRINT-STRUCTURE*", Lisp.PACKAGE_EXT, Lisp.T);

	// ### *current-print-length*
	public static SubLSymbol _CURRENT_PRINT_LENGTH_ = Lisp.exportSpecial("*CURRENT-PRINT-LENGTH*", Lisp.PACKAGE_SYS,
			Fixnum.ZERO);

	// ### *current-print-level*
	public static SubLSymbol _CURRENT_PRINT_LEVEL_ = Lisp.exportSpecial("*CURRENT-PRINT-LEVEL*", Lisp.PACKAGE_SYS,
			Fixnum.ZERO);

	public static SubLSymbol _PRINT_FASL_ = Lisp.internSpecial("*PRINT-FASL*", Lisp.PACKAGE_SYS, Lisp.NIL);

	static {
		LispSymbols._RANDOM_STATE_.initializeSpecial(new RandomState());
	}
	static {
		LispSymbols.STAR.initializeSpecial(Lisp.NIL);
		LispSymbols.STAR_STAR.initializeSpecial(Lisp.NIL);
		LispSymbols.STAR_STAR_STAR.initializeSpecial(Lisp.NIL);
		LispSymbols.MINUS.initializeSpecial(Lisp.NIL);
		LispSymbols.PLUS.initializeSpecial(Lisp.NIL);
		LispSymbols.PLUS_PLUS.initializeSpecial(Lisp.NIL);
		LispSymbols.PLUS_PLUS_PLUS.initializeSpecial(Lisp.NIL);
		LispSymbols.SLASH.initializeSpecial(Lisp.NIL);
		LispSymbols.SLASH_SLASH.initializeSpecial(Lisp.NIL);
		LispSymbols.SLASH_SLASH_SLASH.initializeSpecial(Lisp.NIL);
	}

	// Floating point constants.
	static {
		LispSymbols.PI.initializeConstant(LispObjectFactory.makeDouble(Math.PI));
		LispSymbols.SHORT_FLOAT_EPSILON.initializeConstant(LispObjectFactory.makeSingle((float) 5.960465E-8));
		LispSymbols.SINGLE_FLOAT_EPSILON.initializeConstant(LispObjectFactory.makeSingle((float) 5.960465E-8));
		LispSymbols.DOUBLE_FLOAT_EPSILON.initializeConstant(LispObjectFactory.makeDouble(1.1102230246251568E-16));
		LispSymbols.LONG_FLOAT_EPSILON.initializeConstant(LispObjectFactory.makeDouble(1.1102230246251568E-16));
		LispSymbols.SHORT_FLOAT_NEGATIVE_EPSILON.initializeConstant(LispObjectFactory.makeSingle(2.9802326e-8f));
		LispSymbols.SINGLE_FLOAT_NEGATIVE_EPSILON.initializeConstant(LispObjectFactory.makeSingle(2.9802326e-8f));
		LispSymbols.DOUBLE_FLOAT_NEGATIVE_EPSILON
				.initializeConstant(LispObjectFactory.makeDouble(5.551115123125784E-17));
		LispSymbols.LONG_FLOAT_NEGATIVE_EPSILON.initializeConstant(LispObjectFactory.makeDouble(5.551115123125784E-17));
		LispSymbols.MOST_POSITIVE_SHORT_FLOAT.initializeConstant(LispObjectFactory.makeSingle(Float.MAX_VALUE));
		LispSymbols.MOST_POSITIVE_SINGLE_FLOAT.initializeConstant(LispObjectFactory.makeSingle(Float.MAX_VALUE));
		LispSymbols.MOST_POSITIVE_DOUBLE_FLOAT.initializeConstant(LispObjectFactory.makeDouble(Double.MAX_VALUE));
		LispSymbols.MOST_POSITIVE_LONG_FLOAT.initializeConstant(LispObjectFactory.makeDouble(Double.MAX_VALUE));
		LispSymbols.LEAST_POSITIVE_SHORT_FLOAT.initializeConstant(LispObjectFactory.makeSingle(Float.MIN_VALUE));
		LispSymbols.LEAST_POSITIVE_SINGLE_FLOAT.initializeConstant(LispObjectFactory.makeSingle(Float.MIN_VALUE));
		LispSymbols.LEAST_POSITIVE_DOUBLE_FLOAT.initializeConstant(LispObjectFactory.makeDouble(Double.MIN_VALUE));
		LispSymbols.LEAST_POSITIVE_LONG_FLOAT.initializeConstant(LispObjectFactory.makeDouble(Double.MIN_VALUE));
		LispSymbols.LEAST_POSITIVE_NORMALIZED_SHORT_FLOAT
				.initializeConstant(LispObjectFactory.makeSingle(1.17549435e-38f));
		LispSymbols.LEAST_POSITIVE_NORMALIZED_SINGLE_FLOAT
				.initializeConstant(LispObjectFactory.makeSingle(1.17549435e-38f));
		LispSymbols.LEAST_POSITIVE_NORMALIZED_DOUBLE_FLOAT
				.initializeConstant(LispObjectFactory.makeDouble(2.2250738585072014e-308d));
		LispSymbols.LEAST_POSITIVE_NORMALIZED_LONG_FLOAT
				.initializeConstant(LispObjectFactory.makeDouble(2.2250738585072014e-308d));
		LispSymbols.MOST_NEGATIVE_SHORT_FLOAT.initializeConstant(LispObjectFactory.makeSingle(-Float.MAX_VALUE));
		LispSymbols.MOST_NEGATIVE_SINGLE_FLOAT.initializeConstant(LispObjectFactory.makeSingle(-Float.MAX_VALUE));
		LispSymbols.MOST_NEGATIVE_DOUBLE_FLOAT.initializeConstant(LispObjectFactory.makeDouble(-Double.MAX_VALUE));
		LispSymbols.MOST_NEGATIVE_LONG_FLOAT.initializeConstant(LispObjectFactory.makeDouble(-Double.MAX_VALUE));
		LispSymbols.LEAST_NEGATIVE_SHORT_FLOAT.initializeConstant(LispObjectFactory.makeSingle(-Float.MIN_VALUE));
		LispSymbols.LEAST_NEGATIVE_SINGLE_FLOAT.initializeConstant(LispObjectFactory.makeSingle(-Float.MIN_VALUE));
		LispSymbols.LEAST_NEGATIVE_DOUBLE_FLOAT.initializeConstant(LispObjectFactory.makeDouble(-Double.MIN_VALUE));
		LispSymbols.LEAST_NEGATIVE_LONG_FLOAT.initializeConstant(LispObjectFactory.makeDouble(-Double.MIN_VALUE));
		LispSymbols.LEAST_NEGATIVE_NORMALIZED_SHORT_FLOAT
				.initializeConstant(LispObjectFactory.makeSingle(-1.17549435e-38f));
		LispSymbols.LEAST_NEGATIVE_NORMALIZED_SINGLE_FLOAT
				.initializeConstant(LispObjectFactory.makeSingle(-1.17549435e-38f));
		LispSymbols.LEAST_NEGATIVE_NORMALIZED_DOUBLE_FLOAT
				.initializeConstant(LispObjectFactory.makeDouble(-2.2250738585072014e-308d));
		LispSymbols.LEAST_NEGATIVE_NORMALIZED_LONG_FLOAT
				.initializeConstant(LispObjectFactory.makeDouble(-2.2250738585072014e-308d));
	}

	static {
		LispSymbols.BOOLE_CLR.initializeConstant(Fixnum.ZERO);
		LispSymbols.BOOLE_SET.initializeConstant(Fixnum.ONE);
		LispSymbols.BOOLE_1.initializeConstant(Fixnum.TWO);
		LispSymbols.BOOLE_2.initializeConstant(Fixnum.constants[3]);
		LispSymbols.BOOLE_C1.initializeConstant(Fixnum.constants[4]);
		LispSymbols.BOOLE_C2.initializeConstant(Fixnum.constants[5]);
		LispSymbols.BOOLE_AND.initializeConstant(Fixnum.constants[6]);
		LispSymbols.BOOLE_IOR.initializeConstant(Fixnum.constants[7]);
		LispSymbols.BOOLE_XOR.initializeConstant(Fixnum.constants[8]);
		LispSymbols.BOOLE_EQV.initializeConstant(Fixnum.constants[9]);
		LispSymbols.BOOLE_NAND.initializeConstant(Fixnum.constants[10]);
		LispSymbols.BOOLE_NOR.initializeConstant(Fixnum.constants[11]);
		LispSymbols.BOOLE_ANDC1.initializeConstant(Fixnum.constants[12]);
		LispSymbols.BOOLE_ANDC2.initializeConstant(Fixnum.constants[13]);
		LispSymbols.BOOLE_ORC1.initializeConstant(Fixnum.constants[14]);
		LispSymbols.BOOLE_ORC2.initializeConstant(Fixnum.constants[15]);
	}

	static {
		// ### call-arguments-limit
		LispSymbols.CALL_ARGUMENTS_LIMIT.initializeConstant(Fixnum.constants[50]);
	}

	static {
		// ### lambda-parameters-limit
		LispSymbols.LAMBDA_PARAMETERS_LIMIT.initializeConstant(Fixnum.constants[50]);
	}

	static {
		// ### multiple-values-limit
		LispSymbols.MULTIPLE_VALUES_LIMIT.initializeConstant(Fixnum.constants[20]);
	}

	static {
		// ### internal-time-units-per-second
		LispSymbols.INTERNAL_TIME_UNITS_PER_SECOND.initializeConstant(LispObjectFactory.makeInteger(1000));
	}

	static {
		LispSymbols.LAMBDA_LIST_KEYWORDS.initializeConstant(Lisp.list(LispSymbols.AND_OPTIONAL, LispSymbols.AND_REST,
				LispSymbols.AND_KEY, LispSymbols.AND_AUX, LispSymbols.AND_BODY, LispSymbols.AND_WHOLE,
				LispSymbols.AND_ALLOW_OTHER_KEYS, LispSymbols.AND_ENVIRONMENT));
	}

	// ### call-registers-limit
	public static SubLSymbol CALL_REGISTERS_LIMIT = Lisp.exportConstant("CALL-REGISTERS-LIMIT", Lisp.PACKAGE_SYS,
			Fixnum.constants[Lisp.CALL_REGISTERS_MAX]);

	// ### *warn-on-redefinition*
	public static SubLSymbol _WARN_ON_REDEFINITION_ = Lisp.exportSpecial("*WARN-ON-REDEFINITION*", Lisp.PACKAGE_EXT,
			Lisp.T);

	// ### *saved-backtrace*
	public static SubLSymbol _SAVED_BACKTRACE_ = Lisp.exportSpecial("*SAVED-BACKTRACE*", Lisp.PACKAGE_EXT, Lisp.NIL);

	// ### *command-line-argument-list*
	public static SubLSymbol _COMMAND_LINE_ARGUMENT_LIST_ = Lisp.exportSpecial("*COMMAND-LINE-ARGUMENT-LIST*",
			Lisp.PACKAGE_EXT, Lisp.NIL);

	// ### *batch-mode*
	public static SubLSymbol _BATCH_MODE_ = Lisp.exportSpecial("*BATCH-MODE*", Lisp.PACKAGE_EXT, Lisp.NIL);

	// ### *noinform*
	public static SubLSymbol _NOINFORM_ = Lisp.exportSpecial("*NOINFORM*", Lisp.PACKAGE_SYS, Lisp.NIL);

	// ### *disassembler*
	public static SubLSymbol _DISASSEMBLER_ = Lisp.exportSpecial("*DISASSEMBLER*", Lisp.PACKAGE_EXT,
			LispObjectFactory.makeString("jad -a -p")); // or
	// "jad
	// -dis
	// -p"

	// ### *speed* compiler policy
	public static SubLSymbol _SPEED_ = Lisp.exportSpecial("*SPEED*", Lisp.PACKAGE_SYS, Fixnum.TWO);

	// ### *space* compiler policy
	public static SubLSymbol _SPACE_ = Lisp.exportSpecial("*SPACE*", Lisp.PACKAGE_SYS, Fixnum.ONE);

	// ### *safety* compiler policy
	public static SubLSymbol _SAFETY_ = Lisp.exportSpecial("*SAFETY*", Lisp.PACKAGE_SYS, Fixnum.ONE);

	// ### *debug* compiler policy
	public static SubLSymbol _DEBUG_ = Lisp.exportSpecial("*DEBUG*", Lisp.PACKAGE_SYS, Fixnum.ONE);

	// ### *explain* compiler policy
	public static SubLSymbol _EXPLAIN_ = Lisp.exportSpecial("*EXPLAIN*", Lisp.PACKAGE_SYS, Lisp.NIL);

	// ### *enable-inline-expansion*
	public static SubLSymbol _ENABLE_INLINE_EXPANSION_ = Lisp.exportSpecial("*ENABLE-INLINE-EXPANSION*",
			Lisp.PACKAGE_EXT, Lisp.T);

	// ### *require-stack-frame*
	public static SubLSymbol _REQUIRE_STACK_FRAME_ = Lisp.exportSpecial("*REQUIRE-STACK-FRAME*", Lisp.PACKAGE_EXT,
			Lisp.NIL);

	static {
		LispSymbols.SUPPRESS_COMPILER_WARNINGS.initializeSpecial(Lisp.NIL);
	}

	public static SubLSymbol _COMPILE_FILE_ENVIRONMENT_ = Lisp.exportSpecial("*COMPILE-FILE-ENVIRONMENT*",
			Lisp.PACKAGE_SYS, Lisp.NIL);

	public static SubLObject UNBOUND_VALUE = new unboundValue();

	public static SubLObject NULL_VALUE = new nullValue();

	public static SubLSymbol _SLOT_UNBOUND_ = Lisp.exportConstant("+SLOT-UNBOUND+", Lisp.PACKAGE_SYS,
			Lisp.UNBOUND_VALUE);

	public static SubLSymbol _CL_PACKAGE_ = Lisp.exportConstant("+CL-PACKAGE+", Lisp.PACKAGE_SYS, Lisp.PACKAGE_CL);

	public static SubLSymbol _KEYWORD_PACKAGE_ = Lisp.exportConstant("+KEYWORD-PACKAGE+", Lisp.PACKAGE_SYS,
			Lisp.PACKAGE_KEYWORD);

	// ### *backquote-count*
	public static SubLSymbol _BACKQUOTE_COUNT_ = Lisp.internSpecial("*BACKQUOTE-COUNT*", Lisp.PACKAGE_SYS, Fixnum.ZERO);

	// ### *bq-vector-flag*
	public static SubLSymbol _BQ_VECTOR_FLAG_ = Lisp.internSpecial("*BQ-VECTOR-FLAG*", Lisp.PACKAGE_SYS,
			Lisp.list(LispObjectFactory.makeSymbol("bqv")));

	// ### *traced-names*
	public static SubLSymbol _TRACED_NAMES_ = Lisp.exportSpecial("*TRACED-NAMES*", Lisp.PACKAGE_SYS, Lisp.NIL);

	// Floating point traps.
	protected static boolean TRAP_OVERFLOW = true;

	protected static boolean TRAP_UNDERFLOW = true;

	// Extentions
	static {
		LispSymbols._INSPECTOR_HOOK_.initializeSpecial(Lisp.NIL);
	}

	static {
		Lisp.loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Primitives");
		Lisp.loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SpecialOperators");
		Lisp.loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.StreamFunctions");
		Lisp.loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.StringFunctions");
		Lisp.loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.ArrayFunctions");
		Lisp.loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.CharacterFunctions");
		Lisp.loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Extensions");
		Lisp.loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.CompiledClosure");
		Lisp.loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Autoload");
		Lisp.loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.AutoloadMacro");
		Lisp.loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.ConsFunctions");
		Lisp.loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Do");
		Lisp.loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Pathname");
		Lisp.loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispClass");
		Lisp.loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.BuiltInClass");
		Lisp.loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.StructureObject");
		Lisp.loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.MathFunctions");
		Lisp.loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.ConditionFunctions");
		Lisp.loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.function_info");
		Lisp.loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.JavaFunctions");
		Lisp.loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.PackageFunctions");
		Lisp.loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Profiler");
		Lisp.cold = false;
	}

	private static LispStream stdin = LispObjectFactory.makeStream(LispSymbols.SYSTEM_STREAM, System.in,
			LispSymbols.CHARACTER, true);

	private static LispStream stdout = LispObjectFactory.makeStream(LispSymbols.SYSTEM_STREAM, System.out,
			LispSymbols.CHARACTER, true);

	static {
		LispSymbols.STANDARD_INPUT.initializeSpecial(Lisp.stdin);
		LispSymbols.STANDARD_OUTPUT.initializeSpecial(Lisp.stdout);
		LispSymbols.ERROR_OUTPUT.initializeSpecial(Lisp.stdout);
		LispSymbols.TRACE_OUTPUT.initializeSpecial(Lisp.stdout);
		LispSymbols.TERMINAL_IO.initializeSpecial(new TwoWayStream(Lisp.stdin, Lisp.stdout, true));
		LispSymbols.QUERY_IO.initializeSpecial(new TwoWayStream(Lisp.stdin, Lisp.stdout, true));
		LispSymbols.DEBUG_IO.initializeSpecial(new TwoWayStream(Lisp.stdin, Lisp.stdout, true));
	}

	public static SubLObject assq(SubLObject item, SubLObject alist)

	{
		while (alist instanceof SubLCons) {
			SubLObject entry = ((SubLCons) alist).first();
			if (entry instanceof SubLCons) {
				if (((SubLCons) entry).first() == item)
					return entry;
			} else if (entry != Lisp.NIL)
				return Lisp.type_error(entry, LispSymbols.LIST);
			alist = ((SubLCons) alist).rest();
		}
		if (alist != Lisp.NIL)
			return Lisp.type_error(alist, LispSymbols.LIST);
		return Lisp.NIL;
	}

	public static void bindArg(SubLObject ownSpecials, SubLSymbol sym, SubLObject value, Environment env,
			LispThread thread)

	{
		if (Lisp.isSpecial(sym, ownSpecials, env)) {
			env.declareSpecial(sym);
			thread.bindSpecial(sym, value);
		} else
			env.bindSymbolVoid(sym, value);
	}

	public static AbstractArray checkArray(SubLObject obj)

	{
		if (obj instanceof AbstractArray)
			return (AbstractArray) obj;
		return (AbstractArray) // Not reached.
		Lisp.type_error(obj, LispSymbols.ARRAY);
	}

	public static LispStream checkBinaryInputStream(SubLObject obj)

	{
		final LispStream stream = Lisp.checkStream(obj);
		if (stream.isBinaryInputStream())
			return stream;
		return (LispStream) // Not reached.
		Lisp.error(new TypeError("The value " + obj.writeToString() + " is not a binary input stream."));
	}

	public static void checkBounds(int start, int end, int length)

	{
		if (start < 0 || end < 0 || start > end || end > length) {
			StringBuilder sb = new StringBuilder("The bounding indices ");
			sb.append(start);
			sb.append(" and ");
			sb.append(end);
			sb.append(" are bad for a sequence of length ");
			sb.append(length);
			sb.append('.');
			Lisp.error(new TypeError(sb.toString()));
		}
	}

	public static LispCharacter checkCharacter(SubLObject obj)

	{
		if (obj instanceof LispCharacter)
			return (LispCharacter) obj;
		return (LispCharacter) // Not reached.
		Lisp.type_error(obj, LispSymbols.CHARACTER);
	}

	public static LispStream checkCharacterInputStream(SubLObject obj)

	{
		final LispStream stream = Lisp.checkStream(obj);
		if (stream.isCharacterInputStream())
			return stream;
		return (LispStream) // Not reached.
		Lisp.error(new TypeError("The value " + obj.writeToString() + " is not a character input stream."));
	}

	public static LispStream checkCharacterOutputStream(SubLObject obj)

	{
		final LispStream stream = Lisp.checkStream(obj);
		if (stream.isCharacterOutputStream())
			return stream;
		return (LispStream) // Not reached.
		Lisp.error(new TypeError("The value " + obj.writeToString() + " is not a character output stream."));
	}

	public static LispClass checkClass(SubLObject obj)

	{
		if (obj instanceof LispClass)
			return (LispClass) obj;
		return (LispClass) // Not reached.
		Lisp.type_error(obj, LispSymbols.CLASS);
	}

	public static DoubleFloat checkDoubleFloat(SubLObject obj)

	{
		if (obj instanceof DoubleFloat)
			return (DoubleFloat) obj;
		return (DoubleFloat) // Not reached.
		Lisp.type_error(obj, LispSymbols.DOUBLE_FLOAT);
	}

	public static Environment checkEnvironment(SubLObject obj)

	{
		if (obj instanceof Environment)
			return (Environment) obj;
		return (Environment) // Not reached.
		Lisp.type_error(obj, LispSymbols.ENVIRONMENT);
	}

	public static Function checkFunction(SubLObject obj)

	{
		if (obj instanceof Function)
			return (Function) obj;
		return (Function) // Not reached.
		Lisp.type_error(obj, LispSymbols.FUNCTION);
	}

	public static LispInteger checkInteger(SubLObject obj)

	{
		if (obj instanceof LispInteger)
			return (LispInteger) obj;
		return (LispInteger) // Not reached.
		Lisp.type_error(obj, LispSymbols.INTEGER);
	}

	public static Layout checkLayout(SubLObject obj)

	{
		if (obj instanceof Layout)
			return (Layout) obj;
		return (Layout) // Not reached.
		Lisp.type_error(obj, LispSymbols.LAYOUT);
	}

	public static SubLObject checkList(SubLObject obj)

	{
		if (obj.isList())
			return obj;
		return Lisp.type_error(obj, LispSymbols.LIST);
	}

	public static SubLPackage checkPackage(SubLObject obj)

	{
		if (obj instanceof SubLPackage)
			return (SubLPackage) obj;
		return (SubLPackage) // Not reached.
		Lisp.type_error(obj, LispSymbols.PACKAGE);
	}

	public static Readtable checkReadtable(SubLObject obj)

	{
		if (obj instanceof Readtable)
			return (Readtable) obj;
		return (Readtable) // Not reached.
		Lisp.type_error(obj, LispSymbols.READTABLE);
	}

	public static SingleFloat checkSingleFloat(SubLObject obj)

	{
		if (obj instanceof SingleFloat)
			return (SingleFloat) obj;
		return (SingleFloat) // Not reached.
		Lisp.type_error(obj, LispSymbols.SINGLE_FLOAT);
	}

	public static StackFrame checkStackFrame(SubLObject obj)

	{
		if (obj instanceof StackFrame)
			return (StackFrame) obj;
		return (StackFrame) // Not reached.
		Lisp.type_error(obj, LispSymbols.STACK_FRAME);
	}

	public static LispStream checkStream(SubLObject obj)

	{
		if (obj instanceof LispStream)
			return (LispStream) obj;
		return (LispStream) // Not reached.
		Lisp.type_error(obj, LispSymbols.STREAM);
	}

	public static SubLString checkString(SubLObject obj)

	{
		if (obj instanceof SubLString)
			return (SubLString) obj;
		return (SubLString) // Not reached.
		Lisp.type_error(obj, LispSymbols.STRING);
	}

	public static SubLSymbol checkSymbol(SubLObject obj) {
		if (obj instanceof SubLSymbol)
			return (SubLSymbol) obj;
		return (SubLSymbol) // Not reached.
		Lisp.type_error(obj, LispSymbols.SYMBOL);
	}

	public static AbstractVector checkVector(SubLObject obj)

	{
		if (obj instanceof AbstractVector)
			return (AbstractVector) obj;
		return (AbstractVector) // Not reached.
		Lisp.type_error(obj, LispSymbols.VECTOR);
	}

	public static SubLObject coerceJavaByteToLispObject(byte b) {
		return Fixnum.constants[b & 0xff];
	}

	public static byte coerceLispObjectToJavaByte(SubLObject obj)

	{
		return (byte) obj.intValue();
	}

	public static SubLObject coerceToFunction(SubLObject obj)

	{
		if (obj instanceof Function)
			return obj;
		if (obj instanceof StandardGenericFunction)
			return obj;
		if (obj instanceof SubLSymbol) {
			SubLObject fun = obj.getSymbolFunction();
			if (fun instanceof Function)
				return fun;
		} else if (obj instanceof SubLCons && obj.first() == LispSymbols.LAMBDA)
			return new Closure(obj, new Environment());
		Lisp.error(new UndefinedFunction(obj));
		// Not reached.
		return null;
	}

	// Returns package or throws exception.
	public static SubLPackage coerceToPackage(SubLObject obj)

	{
		if (obj instanceof SubLPackage)
			return (SubLPackage) obj;
		SubLPackage pkg = LispPackages.findPackage(Lisp.javaString(obj));
		if (pkg != null)
			return pkg;
		Lisp.error(new PackageError(obj.writeToString() + " is not the name of a package."));
		// Not reached.
		return null;
	}

	public static Pathname coerceToPathname(SubLObject arg)

	{
		if (arg instanceof Pathname)
			return (Pathname) arg;
		if (arg instanceof SubLString)
			return Pathname.parseNamestring((SubLString) arg);
		if (arg instanceof FileStream)
			return ((FileStream) arg).getPathname();
		Lisp.type_error(arg,
				Lisp.list(LispSymbols.OR, LispSymbols.PATHNAME, LispSymbols.STRING, LispSymbols.FILE_STREAM));
		// Not reached.
		return null;
	}

	public static Readtable currentReadtable() {
		return (Readtable) LispSymbols.CURRENT_READTABLE.symbolValue();
	}

	public static Readtable designator_readtable(SubLObject obj)

	{
		if (obj == Lisp.NIL)
			obj = Lisp.STANDARD_READTABLE.symbolValue();
		if (obj == null)
			throw new NullPointerException();
		return Lisp.checkReadtable(obj);
	}

	public static SubLObject error(SubLObject condition)
	{
		if (Main.isSubLisp)
			return Errors.error(condition.getParts().writeToString());
		Lisp.pushJavaStackFrames();
		return LispSymbols.ERROR.execute(condition);
	}

	public static SubLObject error(SubLObject condition, SubLObject message)

	{
		Lisp.pushJavaStackFrames();
		return LispSymbols.ERROR.execute(condition, Keyword.FORMAT_CONTROL, message);
	}

	public static SubLObject eval(SubLObject obj)

	{
		return Lisp.eval(obj, new Environment(), LispThread.currentThread());
	}

	public static SubLObject eval(SubLObject obj, Environment env, LispThread thread)

	{
		thread._values = null;
		if (Lisp.interrupted)
			Lisp.handleInterrupt();
		if (thread.isDestroyed())
			throw new ThreadDestroyed();
		if (obj instanceof SubLSymbol) {
			SubLSymbol symbol = (SubLSymbol) obj;
			SubLObject result;
			if (symbol.isSpecialVariable()) {
				if (symbol.constantp())
					return symbol.getSymbolValue();
				else
					result = thread.lookupSpecial(symbol);
			} else if (env.isDeclaredSpecial(symbol))
				result = thread.lookupSpecial(symbol);
			else
				result = env.lookup(symbol);
			if (result == null) {
				result = symbol.getSymbolValue();
				if (result == null)
					return Lisp.error(new UnboundVariable(obj));
			}
			if (result instanceof SymbolMacro)
				return Lisp.eval(((SymbolMacro) result).getExpansion(), env, thread);
			return result;
		} else if (obj instanceof SubLCons) {
			SubLCons cobj = (SubLCons) obj;
			SubLObject first = cobj.first();
			if (first instanceof SubLSymbol) {
				SubLObject fun = env.lookupFunction(first);
				if (fun instanceof SpecialOperator) {
					if (Lisp.profiling)
						if (!Lisp.sampling)
							fun.incrementCallCount(cobj.cl_length() - 1);
					// Don't eval args!
					return fun.execute(cobj.rest(), env);
				}
				if (fun instanceof MacroObject)
					return Lisp.eval(Lisp.macroexpand(obj, env, thread), env, thread);
				if (fun instanceof Autoload) {
					Autoload autoload = (Autoload) fun;
					autoload.load();
					return Lisp.eval(obj, env, thread);
				}
				return Lisp.evalCall(fun != null ? fun : first, cobj.rest(), env, thread);
			} else if (first.first() == LispSymbols.LAMBDA) {
				Closure closure = new Closure(first, env);
				return Lisp.evalCall(closure, ((SubLCons) obj).rest(), env, thread);
			} else
				return Lisp.error(new ProgramError("Illegal function object: " + first.writeToString()));
		} else
			return obj;
	}

	// Also used in JProxy.java.
	public static SubLObject evalCall(SubLObject function, SubLObject args, Environment env, LispThread thread)

	{
		if (args == Lisp.NIL)
			return thread.execute(function);
		SubLObject first = Lisp.eval(args.first(), env, thread);
		args = ((SubLCons) args).rest();
		if (args == Lisp.NIL) {
			thread._values = null;
			return thread.execute(function, first);
		}
		SubLObject second = Lisp.eval(args.first(), env, thread);
		args = ((SubLCons) args).rest();
		if (args == Lisp.NIL) {
			thread._values = null;
			return thread.execute(function, first, second);
		}
		SubLObject third = Lisp.eval(args.first(), env, thread);
		args = ((SubLCons) args).rest();
		if (args == Lisp.NIL) {
			thread._values = null;
			return thread.execute(function, first, second, third);
		}
		SubLObject fourth = Lisp.eval(args.first(), env, thread);
		args = ((SubLCons) args).rest();
		if (args == Lisp.NIL) {
			thread._values = null;
			return thread.execute(function, first, second, third, fourth);
		}
		SubLObject fifth = Lisp.eval(args.first(), env, thread);
		args = ((SubLCons) args).rest();
		if (args == Lisp.NIL) {
			thread._values = null;
			return thread.execute(function, first, second, third, fourth, fifth);
		}
		SubLObject sixth = Lisp.eval(args.first(), env, thread);
		args = ((SubLCons) args).rest();
		if (args == Lisp.NIL) {
			thread._values = null;
			return thread.execute(function, first, second, third, fourth, fifth, sixth);
		}
		SubLObject seventh = Lisp.eval(args.first(), env, thread);
		args = ((SubLCons) args).rest();
		if (args == Lisp.NIL) {
			thread._values = null;
			return thread.execute(function, first, second, third, fourth, fifth, sixth, seventh);
		}
		SubLObject eighth = Lisp.eval(args.first(), env, thread);
		args = ((SubLCons) args).rest();
		if (args == Lisp.NIL) {
			thread._values = null;
			return thread.execute(function, first, second, third, fourth, fifth, sixth, seventh, eighth);
		}
		// More than CALL_REGISTERS_MAX arguments.
		final int length = args.cl_length() + Lisp.CALL_REGISTERS_MAX;
		SubLObject[] array = LispObjectFactory.makeLispObjectArray(length);
		array[0] = first;
		array[1] = second;
		array[2] = third;
		array[3] = fourth;
		array[4] = fifth;
		array[5] = sixth;
		array[6] = seventh;
		array[7] = eighth;
		for (int i = Lisp.CALL_REGISTERS_MAX; i < length; i++) {
			array[i] = Lisp.eval(args.first(), env, thread);
			args = args.rest();
		}
		thread._values = null;
		return thread.execute(function, array);
	}

	public static void exit(int status) {
		Interpreter interpreter = Interpreter.getInstance();
		if (interpreter != null)
			interpreter.kill(status);
	}

	public static SubLSymbol exportConstant(String name, SubLPackage pkg, SubLObject value) {
		SubLSymbol symbol = pkg.intern(name);
		pkg.export(symbol); // FIXME Inefficient!
		symbol.initializeConstant(value);
		return symbol;
	}

	public static SubLSymbol exportSpecial(String name, SubLPackage pkg, SubLObject value) {
		SubLSymbol symbol = pkg.intern(name);
		pkg.export(symbol); // FIXME Inefficient!
		symbol.setSpecial(true);
		symbol.setSymbolValue(value);
		return symbol;
	}

	public static String format(SubLObject formatControl, SubLObject formatArguments)

	{
		final LispThread thread = LispThread.currentThread();
		String control = formatControl.getString();
		SubLObject[] args = formatArguments.copyToArray();
		StringBuffer sb = new StringBuffer();
		if (control != null) {
			final int limit = control.length();
			int j = 0;
			final int NEUTRAL = 0;
			final int TILDE = 1;
			int state = NEUTRAL;
			for (int i = 0; i < limit; i++) {
				char c = control.charAt(i);
				if (state == NEUTRAL) {
					if (c == '~')
						state = TILDE;
					else
						sb.append(c);
				} else if (state == TILDE) {
					if (c == 'A' || c == 'a') {
						if (j < args.length) {
							SubLObject obj = args[j++];
							final SpecialBindingsMark mark = thread.markSpecialBindings();
							thread.bindSpecial(LispSymbols.PRINT_ESCAPE, Lisp.NIL);
							thread.bindSpecial(LispSymbols.PRINT_READABLY, Lisp.NIL);
							try {
								sb.append(obj.writeToString());
							} finally {
								thread.resetSpecialBindings(mark);
							}
						}
					} else if (c == 'S' || c == 's') {
						if (j < args.length) {
							SubLObject obj = args[j++];
							final SpecialBindingsMark mark = thread.markSpecialBindings();
							thread.bindSpecial(LispSymbols.PRINT_ESCAPE, Lisp.T);
							try {
								sb.append(obj.writeToString());
							} finally {
								thread.resetSpecialBindings(mark);
							}
						}
					} else if (c == 'D' || c == 'd') {
						if (j < args.length) {
							SubLObject obj = args[j++];
							final SpecialBindingsMark mark = thread.markSpecialBindings();
							thread.bindSpecial(LispSymbols.PRINT_ESCAPE, Lisp.NIL);
							thread.bindSpecial(LispSymbols.PRINT_RADIX, Lisp.NIL);
							thread.bindSpecial(LispSymbols.PRINT_BASE, Fixnum.constants[10]);
							try {
								sb.append(obj.writeToString());
							} finally {
								thread.resetSpecialBindings(mark);
							}
						}
					} else if (c == 'X' || c == 'x') {
						if (j < args.length) {
							SubLObject obj = args[j++];
							final SpecialBindingsMark mark = thread.markSpecialBindings();
							thread.bindSpecial(LispSymbols.PRINT_ESCAPE, Lisp.NIL);
							thread.bindSpecial(LispSymbols.PRINT_RADIX, Lisp.NIL);
							thread.bindSpecial(LispSymbols.PRINT_BASE, Fixnum.constants[16]);
							try {
								sb.append(obj.writeToString());
							} finally {
								thread.resetSpecialBindings(mark);
							}
						}
					} else if (c == '%')
						sb.append('\n');
					state = NEUTRAL;
				} else
					// There are no other valid states.
					Debug.assertTrue(false);
			}
		}
		return sb.toString();
	}

	// args must not be null!
	public static SubLObject funcall(SubLObject fun, SubLObject[] args, LispThread thread)

	{
		thread._values = null;

		// 26-07-2009: For some reason we cannot "just" call the array version;
		// it causes an error (Wrong number of arguments for LOOP-FOR-IN)
		// which is probably a sign of an issue in our design?
		switch (args.length) {
		case 0:
			return thread.execute(fun);
		case 1:
			return thread.execute(fun, args[0]);
		case 2:
			return thread.execute(fun, args[0], args[1]);
		case 3:
			return thread.execute(fun, args[0], args[1], args[2]);
		case 4:
			return thread.execute(fun, args[0], args[1], args[2], args[3]);
		case 5:
			return thread.execute(fun, args[0], args[1], args[2], args[3], args[4]);
		case 6:
			return thread.execute(fun, args[0], args[1], args[2], args[3], args[4], args[5]);
		case 7:
			return thread.execute(fun, args[0], args[1], args[2], args[3], args[4], args[5], args[6]);
		case 8:
			return thread.execute(fun, args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7]);
		default:
			return thread.execute(fun, args);
		}
	}

	public static SubLSymbol gensym(LispThread thread)

	{
		return Lisp.gensym("G", thread);
	}

	public static SubLSymbol gensym(String prefix, LispThread thread)

	{
		StringBuilder sb = new StringBuilder(prefix);
		SpecialBinding binding = thread.getSpecialBinding(LispSymbols.GENSYM_COUNTER);
		final SubLObject oldValue;
		if (binding != null) {
			oldValue = binding.value;
			if (oldValue instanceof Fixnum || oldValue instanceof Bignum)
				binding.value = oldValue.inc();
			else {
				LispSymbols.GENSYM_COUNTER.setSymbolValue(Fixnum.ZERO);
				Lisp.error(new TypeError("The value of *GENSYM-COUNTER* was not a nonnegative integer. Old value: "
						+ oldValue.writeToString() + " New value: 0"));
			}
		} else
			// we're manipulating a global resource
			// make sure we operate thread-safely
			synchronized (LispSymbols.GENSYM_COUNTER) {
			oldValue = LispSymbols.GENSYM_COUNTER.getSymbolValue();
			if (oldValue instanceof Fixnum || oldValue instanceof Bignum)
			LispSymbols.GENSYM_COUNTER.setSymbolValue(oldValue.inc());
			else {
			LispSymbols.GENSYM_COUNTER.setSymbolValue(Fixnum.ZERO);
			Lisp.error(new TypeError("The value of *GENSYM-COUNTER* was not a nonnegative integer. Old value: " + oldValue.writeToString() + " New value: 0"));
			}
			}

		// Decimal representation.
		if (oldValue instanceof Fixnum)
			sb.append(((Fixnum) oldValue).value);
		else if (oldValue instanceof Bignum)
			sb.append(((Bignum) oldValue).bigIntegerValue().toString());

		return LispObjectFactory.makeSymbol(LispObjectFactory.makeString(sb));
	}

	public static SubLObject get(SubLObject symbol, SubLObject indicator)

	{
		SubLObject list = Lisp.checkSymbol(symbol).getPropertyList();
		while (list != Lisp.NIL) {
			if (list.first() == indicator)
				return list.second();
			list = list.cddr();
		}
		return Lisp.NIL;
	}

	public static SubLObject get(SubLObject symbol, SubLObject indicator, SubLObject defaultValue)

	{
		SubLObject list = Lisp.checkSymbol(symbol).getPropertyList();
		while (list != Lisp.NIL) {
			if (list.first() == indicator)
				return list.second();
			list = list.cddr();
		}
		return defaultValue;
	}

	public static SubLPackage getCurrentPackage() {
		return (SubLPackage) LispSymbols._PACKAGE_.symbolValueNoThrow();
	}

	// Property lists.
	public static SubLObject getf(SubLObject plist, SubLObject indicator, SubLObject defaultValue)

	{
		SubLObject list = plist;
		while (list != Lisp.NIL) {
			if (list.first() == indicator)
				return list.second();
			if (list.rest() instanceof SubLCons)
				list = list.cddr();
			else
				return Lisp.error(new TypeError("Malformed property list: " + plist.writeToString()));
		}
		return defaultValue;
	}

	public static LispStream getStandardInput() {
		return (LispStream) LispSymbols.STANDARD_INPUT.symbolValueNoThrow();
	}

	public static LispStream getStandardOutput() {
		return Lisp.checkCharacterOutputStream(LispSymbols.STANDARD_OUTPUT.symbolValue());
	}

	public static TwoWayStream getTerminalIO() {
		return (TwoWayStream) LispSymbols.TERMINAL_IO.symbolValueNoThrow();
	}

	public static SubLObject getUpgradedArrayElementType(SubLObject type)

	{
		if (type instanceof SubLSymbol) {
			if (type == LispSymbols.CHARACTER || type == LispSymbols.BASE_CHAR || type == LispSymbols.STANDARD_CHAR)
				return LispSymbols.CHARACTER;
			if (type == LispSymbols.BIT)
				return LispSymbols.BIT;
			if (type == Lisp.NIL)
				return Lisp.NIL;
		}
		if (type == BuiltInClass.CHARACTER)
			return LispSymbols.CHARACTER;
		if (type instanceof SubLCons) {
			if (type.equal(Lisp.UNSIGNED_BYTE_8))
				return type;
			if (type.equal(Lisp.UNSIGNED_BYTE_16))
				return type;
			if (type.equal(Lisp.UNSIGNED_BYTE_32))
				return type;
			SubLObject car = type.first();
			if (car == LispSymbols.INTEGER) {
				SubLObject lower = type.second();
				SubLObject upper = type.rest().second();
				// Convert to inclusive bounds.
				if (lower instanceof SubLCons)
					lower = lower.first().inc();
				if (upper instanceof SubLCons)
					upper = upper.first().dec();
				if (lower.isInteger() && upper.isInteger()) {
					if (lower instanceof Fixnum && upper instanceof Fixnum) {
						int l = ((Fixnum) lower).value;
						if (l >= 0) {
							int u = ((Fixnum) upper).value;
							if (u <= 1)
								return LispSymbols.BIT;
							if (u <= 255)
								return Lisp.UNSIGNED_BYTE_8;
							if (u <= 65535)
								return Lisp.UNSIGNED_BYTE_16;
							return Lisp.UNSIGNED_BYTE_32;
						}
					}
					if (lower.numGE(Fixnum.ZERO))
						if (lower.numL(Lisp.UNSIGNED_BYTE_32_MAX_VALUE))
							if (upper.numL(Lisp.UNSIGNED_BYTE_32_MAX_VALUE))
								return Lisp.UNSIGNED_BYTE_32;
				}
			} else if (car == LispSymbols.EQL) {
				SubLObject obj = type.second();
				if (obj instanceof Fixnum) {
					int val = ((Fixnum) obj).value;
					if (val >= 0) {
						if (val <= 1)
							return LispSymbols.BIT;
						if (val <= 255)
							return Lisp.UNSIGNED_BYTE_8;
						if (val <= 65535)
							return Lisp.UNSIGNED_BYTE_16;
						return Lisp.UNSIGNED_BYTE_32;
					}
				} else if (obj instanceof Bignum)
					if (obj.numGE(Fixnum.ZERO))
						if (obj.numL(Lisp.UNSIGNED_BYTE_32_MAX_VALUE))
							return Lisp.UNSIGNED_BYTE_32;
			} else if (car == LispSymbols.MEMBER) {
				SubLObject rest = type.rest();
				while (rest != Lisp.NIL) {
					SubLObject obj = rest.first();
					if (obj instanceof LispCharacter)
						rest = rest.rest();
					else
						return Lisp.T;
				}
				return LispSymbols.CHARACTER;
			}
		}
		return Lisp.T;
	}

	public static void handleInterrupt() {
		Lisp.setInterrupted(false);
		LispSymbols.BREAK.getSymbolFunction().execute();
		Lisp.setInterrupted(false);
	}

	public static LispStream inSynonymOf(SubLObject obj)

	{
		if (obj instanceof LispStream)
			return (LispStream) obj;
		if (obj == Lisp.T)
			return Lisp.checkCharacterInputStream(LispSymbols.TERMINAL_IO.symbolValue());
		if (obj == Lisp.NIL)
			return Lisp.checkCharacterInputStream(LispSymbols.STANDARD_INPUT.symbolValue());
		return (LispStream) // Not reached.
		Lisp.type_error(obj, LispSymbols.STREAM);
	}

	public static SubLSymbol intern(String name, SubLPackage pkg) {
		return pkg.intern(name);
	}

	public static SubLSymbol internConstant(String name, SubLPackage pkg, SubLObject value) {
		SubLSymbol symbol = pkg.intern(name);
		symbol.initializeConstant(value);
		return symbol;
	}

	// Used by the compiler.
	public static SubLSymbol internInPackage(String name, String packageName)

	{
		SubLPackage pkg = LispPackages.findPackage(packageName);
		if (pkg == null)
			Lisp.error(new LispError(packageName + " is not the name of a package."));
		return pkg.intern(name);
	}

	public static SubLSymbol internKeyword(String s) {
		return Lisp.PACKAGE_KEYWORD.intern(s);
	}

	public static SubLSymbol internSpecial(String name, SubLPackage pkg, SubLObject value) {
		SubLSymbol symbol = pkg.intern(name);
		symbol.setSpecial(true);
		symbol.setSymbolValue(value);
		return symbol;
	}

	// Environment wrappers.
	private static boolean isSpecial(SubLSymbol sym, SubLObject ownSpecials, Environment env)

	{
		if (ownSpecials != null) {
			if (sym.isSpecialVariable())
				return true;
			for (; ownSpecials != Lisp.NIL; ownSpecials = ownSpecials.rest())
				if (sym == ownSpecials.first())
					return true;
		}
		return false;
	}

	public static boolean isValidMacroFunctionName(SubLObject obj) {
		if (obj instanceof SubLCons) {
			SubLCons cons = (SubLCons) obj;
			if (cons.first() == LispSymbols.MACRO_FUNCTION && cons.rest() instanceof SubLCons) {
				SubLCons cdr = (SubLCons) cons.rest();
				return cdr.first() instanceof SubLSymbol && cdr.rest() == Lisp.NIL;
			}
		}
		return false;
	}

	public static boolean isValidSetfFunctionName(SubLObject obj) {
		if (obj instanceof SubLCons) {
			SubLCons cons = (SubLCons) obj;
			if (cons.first() == LispSymbols.SETF && cons.rest() instanceof SubLCons) {
				SubLCons cdr = (SubLCons) cons.rest();
				return cdr.first() instanceof SubLSymbol && cdr.rest() == Lisp.NIL;
			}
		}
		return false;
	}

	public static String javaString(SubLObject arg)

	{
		if (arg instanceof SubLString)
			return arg.getString();
		if (arg instanceof SubLSymbol)
			return ((SubLSymbol) arg).getJavaSymbolName();
		if (arg instanceof LispCharacter)
			return String.valueOf(new char[] { ((LispCharacter) arg).value });
		Lisp.type_error(arg, Lisp.list(LispSymbols.OR, LispSymbols.STRING, LispSymbols.SYMBOL, LispSymbols.CHARACTER));
		// Not reached.
		return null;
	}

	public static SubLCons list(SubLObject obj1, SubLObject... remaining) {
		SubLCons theList = null;
		if (remaining.length > 0) {
			theList = LispObjectFactory.makeCons(remaining[remaining.length - 1]);
			for (int i = remaining.length - 2; i >= 0; i--)
				theList = LispObjectFactory.makeCons(remaining[i], theList);
		}
		return theList == null ? LispObjectFactory.makeCons(obj1) : LispObjectFactory.makeCons(obj1, theList);
	}

	@Deprecated
	public static SubLCons list1(SubLObject obj1) {
		return LispObjectFactory.makeCons(obj1);
	}

	@Deprecated
	public static SubLCons list2(SubLObject obj1, SubLObject obj2) {
		return LispObjectFactory.makeCons(obj1, LispObjectFactory.makeCons(obj2));
	}

	@Deprecated
	public static SubLCons list3(SubLObject obj1, SubLObject obj2, SubLObject obj3) {
		return LispObjectFactory.makeCons(obj1, LispObjectFactory.makeCons(obj2, LispObjectFactory.makeCons(obj3)));
	}

	@Deprecated
	public static SubLCons list4(SubLObject obj1, SubLObject obj2, SubLObject obj3, SubLObject obj4) {
		return LispObjectFactory.makeCons(obj1,
				LispObjectFactory.makeCons(obj2, LispObjectFactory.makeCons(obj3, LispObjectFactory.makeCons(obj4))));
	}

	@Deprecated
	public static SubLCons list5(SubLObject obj1, SubLObject obj2, SubLObject obj3, SubLObject obj4, SubLObject obj5) {
		return LispObjectFactory.makeCons(obj1, LispObjectFactory.makeCons(obj2,
				LispObjectFactory.makeCons(obj3, LispObjectFactory.makeCons(obj4, LispObjectFactory.makeCons(obj5)))));
	}

	@Deprecated
	public static SubLCons list6(SubLObject obj1, SubLObject obj2, SubLObject obj3, SubLObject obj4, SubLObject obj5,
			SubLObject obj6) {
		return LispObjectFactory.makeCons(obj1, LispObjectFactory.makeCons(obj2, LispObjectFactory.makeCons(obj3,
				LispObjectFactory.makeCons(obj4, LispObjectFactory.makeCons(obj5, LispObjectFactory.makeCons(obj6))))));
	}

	@Deprecated
	public static SubLCons list7(SubLObject obj1, SubLObject obj2, SubLObject obj3, SubLObject obj4, SubLObject obj5,
			SubLObject obj6, SubLObject obj7) {
		return LispObjectFactory.makeCons(obj1,
				LispObjectFactory.makeCons(obj2,
						LispObjectFactory.makeCons(obj3, LispObjectFactory.makeCons(obj4, LispObjectFactory
								.makeCons(obj5, LispObjectFactory.makeCons(obj6, LispObjectFactory.makeCons(obj7)))))));
	}

	@Deprecated
	public static SubLCons list8(SubLObject obj1, SubLObject obj2, SubLObject obj3, SubLObject obj4, SubLObject obj5,
			SubLObject obj6, SubLObject obj7, SubLObject obj8) {
		return LispObjectFactory.makeCons(obj1,
				LispObjectFactory.makeCons(obj2,
						LispObjectFactory.makeCons(obj3, LispObjectFactory.makeCons(obj4,
								LispObjectFactory.makeCons(obj5, LispObjectFactory.makeCons(obj6,
										LispObjectFactory.makeCons(obj7, LispObjectFactory.makeCons(obj8))))))));
	}

	@Deprecated
	public static SubLCons list9(SubLObject obj1, SubLObject obj2, SubLObject obj3, SubLObject obj4, SubLObject obj5,
			SubLObject obj6, SubLObject obj7, SubLObject obj8, SubLObject obj9) {
		return LispObjectFactory.makeCons(obj1,
				LispObjectFactory.makeCons(obj2,
						LispObjectFactory.makeCons(obj3, LispObjectFactory.makeCons(obj4, LispObjectFactory
								.makeCons(obj5, LispObjectFactory.makeCons(obj6, LispObjectFactory.makeCons(obj7,
										LispObjectFactory.makeCons(obj8, LispObjectFactory.makeCons(obj9)))))))));
	}

	private static void loadClass(String className) {
		try {
			Class.forName(className);
		} catch (ClassNotFoundException e) {
			Debug.trace(e);
		}
	}

	public static Function loadClassBytes(byte[] bytes) {
		return Lisp.loadClassBytes(bytes, new JavaClassLoader());
	}

	public static Function loadClassBytes(byte[] bytes, JavaClassLoader cl) {
		Class<?> c = cl.loadClassFromByteArray(null, bytes, 0, bytes.length);
		Function obj = Lisp.makeCompiledFunctionFromClass(c);
		if (obj != null)
			obj.setClassBytes(bytes);
		return obj;
	}

	public static SubLObject loadCompiledFunction(InputStream in, int size) {
		byte[] bytes = Lisp.readFunctionBytes(in, size);
		if (bytes != null)
			return Lisp.loadClassBytes(bytes);
		else
			return Lisp.error(new FileError("Can't read file off stream."));
	}

	@Deprecated
	public static SubLObject loadCompiledFunction(String namestring) {
		Pathname name = new Pathname(namestring);
		byte[] bytes = Lisp.readFunctionBytes(name);
		if (bytes != null)
			return Lisp.loadClassBytes(bytes);

		return null;
	}

	// Used by the compiler.
	public static SubLObject loadTimeValue(SubLObject obj)

	{
		final LispThread thread = LispThread.currentThread();
		if (LispSymbols.LOAD_TRUENAME.symbolValue(thread) != Lisp.NIL)
			return Lisp.eval(obj, new Environment(), thread);
		else
			return Lisp.NIL;
	}

	public static SubLObject macroexpand(SubLObject form, Environment env, LispThread thread)

	{
		SubLObject expanded = Lisp.NIL;
		while (true) {
			form = Lisp.macroexpand_1(form, env, thread);
			SubLObject[] values = thread._values;
			if (values[1] == Lisp.NIL) {
				values[1] = expanded;
				return form;
			}
			expanded = Lisp.T;
		}
	}

	public static SubLObject macroexpand_1(SubLObject form, Environment env, LispThread thread)

	{
		if (form instanceof SubLCons) {
			SubLObject car = ((SubLCons) form).first();
			if (car instanceof SubLSymbol) {
				SubLObject obj = env.lookupFunction(car);
				if (obj instanceof Autoload) {
					Autoload autoload = (Autoload) obj;
					autoload.load();
					obj = car.getSymbolFunction();
				}
				if (obj instanceof SpecialOperator) {
					obj = Lisp.get(car, LispSymbols.MACROEXPAND_MACRO, null);
					if (obj instanceof Autoload) {
						Autoload autoload = (Autoload) obj;
						autoload.load();
						obj = Lisp.get(car, LispSymbols.MACROEXPAND_MACRO, null);
					}
				}
				if (obj instanceof MacroObject) {
					SubLObject expander = ((MacroObject) obj).expander;
					if (Lisp.profiling)
						if (!Lisp.sampling) // let the macro track it (it adds
											// to
							// expander to(
							obj.incrementCallCount(form.cl_length() - 1);
					SubLObject hook = Lisp.coerceToFunction(LispSymbols.MACROEXPAND_HOOK.symbolValue(thread));
					return thread.setValues(hook.execute(expander, form, env), Lisp.T);
				}
			}
		} else if (form instanceof SubLSymbol) {
			SubLSymbol symbol = (SubLSymbol) form;
			SubLObject obj = null;
			if (symbol.isSpecialVariable())
				obj = thread.lookupSpecial(symbol);
			else
				obj = env.lookup(symbol);
			if (obj == null)
				obj = symbol.getSymbolValue();
			if (obj instanceof SymbolMacro)
				return thread.setValues(((SymbolMacro) obj).getExpansion(), Lisp.T);
		}
		// Not a macro.
		return thread.setValues(form, Lisp.NIL);
	}

	public static SubLObject makeCompiledClosure(SubLObject template, ClosureBinding[] context)

	{
		return ((CompiledClosure) template).dup().setContext(context);
	}

	public static Function makeCompiledFunctionFromClass(Class<?> c) {
		try {
			if (c != null) {
				Function obj = (Function) c.newInstance();
				return obj;
			} else
				return null;
		} catch (InstantiationException e) {
		} // ### FIXME
		catch (IllegalAccessException e) {
		} // ### FIXME

		return null;
	}

	public static boolean memq(SubLObject item, SubLObject list)

	{
		while (list instanceof SubLCons) {
			if (item == ((SubLCons) list).first())
				return true;
			list = ((SubLCons) list).rest();
		}
		if (list != Lisp.NIL)
			Lisp.type_error(list, LispSymbols.LIST);
		return false;
	}

	public static boolean memql(SubLObject item, SubLObject list)

	{
		while (list instanceof SubLCons) {
			if (item.eql(((SubLCons) list).first()))
				return true;
			list = ((SubLCons) list).rest();
		}
		if (list != Lisp.NIL)
			Lisp.type_error(list, LispSymbols.LIST);
		return false;
	}

	// Adapted from SBCL.
	public static int mix(long x, long y) {
		long xy = x * 3 + y;
		return (int) (536870911L & (441516657L ^ xy ^ xy >> 5));
	}

	public static int mod(int number, int divisor)

	{
		final int r;
		try {
			r = number % divisor;
		} catch (ArithmeticException e) {
			Lisp.error(new ArithmeticError("Division by zero."));
			// Not reached.
			return 0;
		}
		if (r == 0)
			return r;
		if (divisor < 0) {
			if (number > 0)
				return r + divisor;
		} else if (number < 0)
			return r + divisor;
		return r;
	}

	// Used by the compiler for MULTIPLE-VALUE-CALLs with a single values form.
	public static SubLObject multipleValueCall1(SubLObject result, SubLObject function, LispThread thread)

	{
		SubLObject[] values = thread._values;
		thread._values = null;
		if (values == null)
			return thread.execute(Lisp.coerceToFunction(function), result);
		else
			return Lisp.funcall(Lisp.coerceToFunction(function), values, thread);
	}

	// Used by the compiler.
	public static SubLObject multipleValueList(SubLObject result)

	{
		LispThread thread = LispThread.currentThread();
		SubLObject[] values = thread._values;
		if (values == null)
			return LispObjectFactory.makeCons(result);
		thread._values = null;
		SubLObject list = Lisp.NIL;
		for (int i = values.length; i-- > 0;)
			list = LispObjectFactory.makeCons(values[i], list);
		return list;
	}

	/**
	 * Throws a Go exception to cause a non-local transfer of control event,
	 * after checking that the extent of the catching tagbody hasn't ended yet.
	 *
	 * This version is used by the interpreter.
	 */
	public static SubLObject nonLocalGo(Binding binding, SubLObject tag)

	{
		if (binding.env.inactive)
			return Lisp.error(new ControlError(
					"Unmatched tag " + binding.symbol.writeToString() + " for GO outside of lexical extent."));

		throw new Go(binding.env, binding.symbol);
	}

	/**
	 * Throws a Go exception to cause a non-local transfer of control event,
	 * after checking that the extent of the catching tagbody hasn't ended yet.
	 *
	 * This version is used by the compiler.
	 */
	public static SubLObject nonLocalGo(SubLObject tagbody, SubLObject tag)

	{
		if (tagbody == null)
			return Lisp.error(
					new ControlError("Unmatched tag " + tag.writeToString() + " for GO outside lexical extent."));

		throw new Go(tagbody, tag);
	}

	/**
	 * Throws a Return exception to cause a non-local transfer of control event,
	 * after checking that the extent of the catching block hasn't ended yet.
	 *
	 * This version is used by the interpreter.
	 */
	public static SubLObject nonLocalReturn(Binding binding, SubLSymbol block, SubLObject result)

	{
		if (binding == null)
			return Lisp.error(new LispError("No block named " + block.getJavaSymbolName() + " is currently visible."));

		if (binding.env.inactive)
			return Lisp.error(new ControlError("Unmatched block " + binding.symbol.writeToString()
					+ " for RETURN-FROM outside of" + " lexical extent."));

		throw new Return(binding.symbol, binding.value, result);
	}

	/**
	 * Throws a Return exception to cause a non-local transfer of control event,
	 * after checking that the extent of the catching block hasn't ended yet.
	 *
	 * This version is used by the compiler.
	 */
	public static SubLObject nonLocalReturn(SubLObject blockId, SubLObject blockName, SubLObject result)

	{
		if (blockId == null)
			return Lisp.error(new ControlError(
					"Unmatched block " + blockName.writeToString() + " for " + "RETURN-FROM outside lexical extent."));

		throw new Return(blockId, result);
	}

	public static SubLObject number(BigInteger n) {
		if (n.compareTo(Lisp.INT_MIN) >= 0 && n.compareTo(Lisp.INT_MAX) <= 0)
			return LispObjectFactory.makeInteger(n.intValue());
		else
			return LispObjectFactory.makeInteger(n);
	}

	public static SubLObject number(BigInteger numerator, BigInteger denominator)

	{
		if (denominator.signum() == 0)
			Lisp.error(new DivisionByZero());
		if (denominator.signum() < 0) {
			numerator = numerator.negate();
			denominator = denominator.negate();
		}
		BigInteger gcd = numerator.gcd(denominator);
		if (!gcd.equals(BigInteger.ONE)) {
			numerator = numerator.divide(gcd);
			denominator = denominator.divide(gcd);
		}
		if (denominator.equals(BigInteger.ONE))
			return Lisp.number(numerator);
		else
			return new Ratio(numerator, denominator);
	}

	public static SubLObject number(long n) {
		if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE)
			return LispObjectFactory.makeInteger((int) n);
		else
			return LispObjectFactory.makeBignum(n);
	}

	public static LispStream outSynonymOf(SubLObject obj)

	{
		if (obj instanceof LispStream)
			return (LispStream) obj;
		if (obj == Lisp.T)
			return Lisp.checkCharacterOutputStream(LispSymbols.TERMINAL_IO.symbolValue());
		if (obj == Lisp.NIL)
			return Lisp.checkCharacterOutputStream(LispSymbols.STANDARD_OUTPUT.symbolValue());
		return (LispStream) // Not reached.
		Lisp.type_error(obj, LispSymbols.STREAM);
	}

	public static SubLObject parseBody(SubLObject body, boolean documentationAllowed)

	{
		SubLObject decls = Lisp.NIL;
		SubLObject doc = Lisp.NIL;

		while (body != Lisp.NIL) {
			SubLObject form = body.first();
			if (documentationAllowed && form instanceof SubLString && body.rest() != Lisp.NIL) {
				doc = body.first();
				documentationAllowed = false;
			} else if (form instanceof SubLCons && form.first() == LispSymbols.DECLARE)
				decls = LispObjectFactory.makeCons(form, decls);
			else
				break;

			body = body.rest();
		}
		return Lisp.list(body, decls.nreverse(), doc);
	}

	public static SubLObject parseSpecials(SubLObject forms)

	{
		SubLObject specials = Lisp.NIL;
		while (forms != Lisp.NIL) {
			SubLObject decls = forms.first();

			Debug.assertTrue(decls instanceof SubLCons);
			Debug.assertTrue(decls.first() == LispSymbols.DECLARE);
			decls = decls.rest();
			while (decls != Lisp.NIL) {
				SubLObject decl = decls.first();

				if (decl instanceof SubLCons && decl.first() == LispSymbols.SPECIAL) {
					decl = decl.rest();
					while (decl != Lisp.NIL) {
						specials = LispObjectFactory.makeCons(Lisp.checkSymbol(decl.first()), specials);
						decl = decl.rest();
					}
				}

				decls = decls.rest();
			}

			forms = forms.rest();
		}

		return specials;
	}

	public static SubLObject preprocessTagBody(SubLObject body, Environment env)

	{
		SubLObject localTags = Lisp.NIL; // Tags that are local to this TAGBODY.
		while (body != Lisp.NIL) {
			SubLObject current = body.first();
			body = ((SubLCons) body).rest();
			if (current instanceof SubLCons)
				continue;
			// It's a tag.
			env.addTagBinding(current, body);
			localTags = LispObjectFactory.makeCons(current, localTags);
		}
		return localTags;
	}

	public static SubLObject processTagBody(SubLObject body, SubLObject localTags, Environment env)

	{
		SubLObject remaining = body;
		LispThread thread = LispThread.currentThread();
		while (remaining != Lisp.NIL) {
			SubLObject current = remaining.first();
			if (current instanceof SubLCons)
				try {
					// Handle GO inline if possible.
					if (((SubLCons) current).first() == LispSymbols.GO) {
						if (Lisp.interrupted)
							Lisp.handleInterrupt();
						SubLObject tag = current.second();
						Binding binding = env.getTagBinding(tag);
						if (binding == null)
							return Lisp.error(
									new ControlError("No tag named " + tag.writeToString() + " is currently visible."));
						else if (Lisp.memql(tag, localTags))
							if (binding.value != null) {
								remaining = binding.value;
								continue;
							}
						throw new Go(binding.env, tag);
					}
					Lisp.eval(current, env, thread);
				} catch (Go go) {
					SubLObject tag;
					if (go.getTagBody() == env && Lisp.memql(tag = go.getTag(), localTags)) {
						Binding binding = env.getTagBinding(tag);
						if (binding != null && binding.value != null) {
							remaining = binding.value;
							continue;
						}
					}
					throw go;
				}
			remaining = ((SubLCons) remaining).rest();
		}
		thread._values = null;
		return Lisp.NIL;
	}

	public static SubLObject progn(SubLObject body, Environment env, LispThread thread)

	{
		SubLObject result = Lisp.NIL;
		while (body != Lisp.NIL) {
			result = Lisp.eval(body.first(), env, thread);
			body = ((SubLCons) body).rest();
		}
		return result;
	}

	public static void progvBindVars(SubLObject symbols, SubLObject values, LispThread thread)

	{
		for (SubLObject list = symbols; list != Lisp.NIL; list = list.rest()) {
			SubLSymbol symbol = Lisp.checkSymbol(list.first());
			SubLObject value;
			if (values != Lisp.NIL) {
				value = values.first();
				values = values.rest();
			} else
				// "If too few values are supplied, the remaining symbols are
				// bound and then made to have no value."
				value = null;
			thread.bindSpecial(symbol, value);
		}
	}

	private static void pushJavaStackFrames() {
		final LispThread thread = LispThread.currentThread();
		final StackTraceElement[] frames = thread.getJavaStackTrace();

		// Search for last Primitive in the StackTrace; that was the
		// last entry point from Lisp.
		int last = frames.length - 1;
		for (int i = 0; i <= last; i++)
			// if
			// (frames[i].getClassName().startsWith("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Primitive"))
			// last = i;
			if (frames[i].getClassName().startsWith("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Primitive"))
				last = i;
		// Do not include the first three frames:
		// Thread.getStackTrace, LispThread.getJavaStackTrace,
		// Lisp.pushJavaStackFrames.
		while (last > 3) {
			thread.pushStackFrame(new JavaStackFrame(frames[last]));
			last--;
		}
	}

	public static SubLObject put(SubLSymbol symbol, SubLObject indicator, SubLObject value)

	{
		SubLObject list = symbol.getPropertyList();
		while (list != Lisp.NIL) {
			if (list.first() == indicator) {
				// Found it!
				SubLObject rest = list.rest();
				rest.setCar(value);
				return value;
			}
			list = list.cddr();
		}
		// Not found.
		symbol.setPropertyList(
				LispObjectFactory.makeCons(indicator, LispObjectFactory.makeCons(value, symbol.getPropertyList())));
		return value;
	}

	public static SubLObject putf(SubLObject plist, SubLObject indicator, SubLObject value)

	{
		SubLObject list = plist;
		while (list != Lisp.NIL) {
			if (list.first() == indicator) {
				// Found it!
				SubLObject rest = list.rest();
				rest.setCar(value);
				return plist;
			}
			list = list.cddr();
		}
		// Not found.
		return LispObjectFactory.makeCons(indicator, LispObjectFactory.makeCons(value, plist));
	}

	private static byte[] readFunctionBytes(InputStream in, int size) {
		try {
			byte[] bytes = new byte[size];
			int bytesRemaining = size;
			int bytesRead = 0;
			while (bytesRemaining > 0) {
				int n = in.read(bytes, bytesRead, bytesRemaining);
				if (n < 0)
					break;
				bytesRead += n;
				bytesRemaining -= n;
			}
			in.close();
			if (bytesRemaining > 0)
				Debug.trace("bytesRemaining = " + bytesRemaining);

			return bytes;
		} catch (IOException t) {
			Debug.trace(t); // FIXME: call error()?
		}
		return null;
	}

	public static byte[] readFunctionBytes(Pathname name) {
		final LispThread thread = LispThread.currentThread();
		Pathname load = null;
		SubLObject truenameFasl = LispSymbols.LOAD_TRUENAME_FASL.symbolValue(thread);
		SubLObject truename = LispSymbols.LOAD_TRUENAME.symbolValue(thread);
		Pathname fasl = null;
		if (truenameFasl instanceof Pathname)
			load = Pathname.mergePathnames(name, (Pathname) truenameFasl, Keyword.NEWEST);
		else if (truename instanceof Pathname)
			load = Pathname.mergePathnames(name, (Pathname) truename, Keyword.NEWEST);
		else if (!Pathname.truename(name).equals(Lisp.NIL))
			load = name;
		else
			load = null;
		InputStream input = null;
		if (load != null)
			input = load.getInputStream();
		else {
			// Make a last-ditch attempt to load from the boot classpath XXX
			// OSGi hack
			URL url = null;
			try {
				url = Lisp.class.getResource(name.getNamestring());
				input = url.openStream();
			} catch (IOException e) {
				Lisp.error(new LispError("Failed to read class bytes from boot class " + url));
			}
		}
		byte[] bytes = new byte[4096];
		try {
			if (input == null) {
				Debug.trace("Pathname: " + name);
				Debug.trace("LOAD_TRUENAME_FASL: " + truenameFasl);
				Debug.trace("LOAD_TRUENAME: " + truename);
				Debug.assertTrue(input != null);
			}

			int n = 0;
			java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
			try {
				while (n >= 0) {
					n = input.read(bytes, 0, 4096);
					if (n >= 0)
						baos.write(bytes, 0, n);
				}
			} catch (IOException e) {
				Debug.trace("Failed to read bytes from " + "'" + name.getNamestring() + "'");
				return null;
			}
			bytes = baos.toByteArray();
		} finally {
			try {
				input.close();
			} catch (IOException e) {
				Debug.trace("Failed to close InputStream: " + e);
			}
		}
		return bytes;
	}

	// Used by the compiler.
	public static SubLObject readObjectFromString(String s) {
		return new StringInputStream(s).faslRead(true, Lisp.NIL, false, LispThread.currentThread());
	}

	public static SubLObject recall(String key) {
		return Lisp.objectTable.remove(key);
	}

	public static SubLObject recall(SubLString key) {
		return Lisp.recall(key.getString());
	}

	public static SubLObject remprop(SubLSymbol symbol, SubLObject indicator)

	{
		SubLObject list = Lisp.checkList(symbol.getPropertyList());
		SubLObject prev = null;
		while (list != Lisp.NIL) {
			if (!(list.rest() instanceof SubLCons))
				Lisp.error(new ProgramError(
						"The symbol " + symbol.writeToString() + " has an odd number of items in its property list."));
			if (list.first() == indicator) {
				// Found it!
				if (prev != null)
					prev.setCdr(list.cddr());
				else
					symbol.setPropertyList(list.cddr());
				return Lisp.T;
			}
			prev = list.rest();
			list = list.cddr();
		}
		// Not found.
		return Lisp.NIL;
	}

	// Used in org/armedbear/j/JLisp.java.
	public static void resetIO() {
		Lisp.resetIO(LispObjectFactory.makeStream(LispSymbols.SYSTEM_STREAM, System.in, LispSymbols.CHARACTER, true),
				LispObjectFactory.makeStream(LispSymbols.SYSTEM_STREAM, System.out, LispSymbols.CHARACTER, true));
	}

	public static void resetIO(LispStream in, LispStream out) {
		Lisp.stdin = in;
		Lisp.stdout = out;
		LispSymbols.STANDARD_INPUT.setSymbolValue(Lisp.stdin);
		LispSymbols.STANDARD_OUTPUT.setSymbolValue(Lisp.stdout);
		LispSymbols.ERROR_OUTPUT.setSymbolValue(Lisp.stdout);
		LispSymbols.TRACE_OUTPUT.setSymbolValue(Lisp.stdout);
		LispSymbols.TERMINAL_IO.setSymbolValue(new TwoWayStream(Lisp.stdin, Lisp.stdout, true));
		LispSymbols.QUERY_IO.setSymbolValue(new TwoWayStream(Lisp.stdin, Lisp.stdout, true));
		LispSymbols.DEBUG_IO.setSymbolValue(new TwoWayStream(Lisp.stdin, Lisp.stdout, true));
	}

	public static String safeWriteToString(SubLObject obj) {
		try {
			return obj.writeToString();
		} catch (NullPointerException e) {
			Debug.trace(e);
			return "null";
		}
	}

	public static synchronized void setInterrupted(boolean b) {
		Lisp.interrupted = b;
	}

	public static SubLObject type_error(SubLObject datum, SubLObject expectedType)

	{
		return Lisp.error(new TypeError(datum, expectedType));
	}

	public static void writeByte(int n, SubLObject obj)

	{
		if (n < 0 || n > 255)
			Lisp.type_error(LispObjectFactory.makeInteger(n), Lisp.UNSIGNED_BYTE_8);
		Lisp.checkStream(obj)._writeByte(n);
	}
}
