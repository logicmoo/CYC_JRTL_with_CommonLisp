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

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
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
public class Load {
	private static class _load extends JavaPrimitive {
		_load() {
			super("%load", Lisp.PACKAGE_SYS, false, "filespec verbose print if-does-not-exist");
		}

		public SubLObject execute(SubLObject filespec, SubLObject verbose, SubLObject print,
				SubLObject ifDoesNotExist) {
			return Load.load(filespec, verbose, print, ifDoesNotExist, Lisp.NIL);
		}
	}

	private static class _load_returning_last_result extends JavaPrimitive {
		_load_returning_last_result() {
			super("%load-returning-last-result", Lisp.PACKAGE_SYS, false, "filespec verbose print if-does-not-exist");
		}

		public SubLObject execute(SubLObject filespec, SubLObject verbose, SubLObject print,
				SubLObject ifDoesNotExist) {
			return Load.load(filespec, verbose, print, ifDoesNotExist, Lisp.T);
		}
	}

	private static class FaslVersionMismatch extends Error {
		private SubLObject version;

		public FaslVersionMismatch(SubLObject version) {
			this.version = version;
		}

		public SubLObject getVersion() {
			return this.version;
		}
	}

	private static class init_fasl extends JavaPrimitive {
		init_fasl() {
			super("init-fasl", Lisp.PACKAGE_SYS, true, "&key version");
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			if (first == Keyword.VERSION)
				if (second.eql(Load._FASL_VERSION_.getSymbolValue())) {
					// OK
					LispThread thread = LispThread.currentThread();
					thread.bindSpecial(Load._FASL_ANONYMOUS_PACKAGE_, Lisp.NIL);
					thread.bindSpecial(Lisp._SOURCE_, Lisp.NIL);
					return Load.faslLoadStream(thread);
				}
			throw new FaslVersionMismatch(second);
		}
	}

	private static class load_system_file extends JavaPrimitive {
		load_system_file() {
			super("load-system-file", Lisp.PACKAGE_SYS, true);
		}

		public SubLObject execute(SubLObject arg) {
			LispThread thread = LispThread.currentThread();
			return Load.loadSystemFile(arg.getString(), LispSymbols.LOAD_VERBOSE.symbolValue(thread) != Lisp.NIL,
					LispSymbols.LOAD_PRINT.symbolValue(thread) != Lisp.NIL, false);
		}
	}

	static SubLObject COMPILE_FILE_INIT_FASL_TYPE = LispObjectFactory.makeString("_");

	// ### *fasl-version*
	// internal symbol
	static SubLSymbol _FASL_VERSION_ = Lisp.exportConstant("*FASL-VERSION*", Lisp.PACKAGE_SYS,
			LispObjectFactory.makeInteger(35));

	// ### *fasl-external-format*
	// internal symbol
	private static SubLSymbol _FASL_EXTERNAL_FORMAT_ = Lisp.internConstant("*FASL-EXTERNAL-FORMAT*", Lisp.PACKAGE_SYS,
			LispObjectFactory.makeString("UTF-8"));

	// ### *fasl-anonymous-package*
	// internal symbol
	/**
	 * This variable gets bound to a package with no name in which the reader
	 * can intern its uninterned symbols.
	 *
	 */
	public static SubLSymbol _FASL_ANONYMOUS_PACKAGE_ = Lisp.internSpecial("*FASL-ANONYMOUS-PACKAGE*", Lisp.PACKAGE_SYS,
			Lisp.NIL);

	// ### init-fasl &key version
	private static Primitive INIT_FASL = new init_fasl();

	// ### %load filespec verbose print if-does-not-exist => generalized-boolean
	private static Primitive _LOAD = new _load();

	// ### %load-returning-last-result filespec verbose print if-does-not-exist
	// => object
	private static Primitive _LOAD_RETURNING_LAST_RESULT = new _load_returning_last_result();

	// ### load-system-file
	private static Primitive LOAD_SYSTEM_FILE = new load_system_file();

	static SubLObject faslLoadStream(LispThread thread) {
		LispStream in = (LispStream) Lisp._LOAD_STREAM_.symbolValue(thread);
		Environment env = new Environment();
		SpecialBindingsMark mark = thread.markSpecialBindings();
		SubLObject result = Lisp.NIL;
		try {
			thread.bindSpecial(Load._FASL_ANONYMOUS_PACKAGE_, new SubLPackage());
			thread.bindSpecial(Lisp.AUTOLOADING_CACHE, AutoloadedFunctionProxy.makePreloadingContext());
			in.setExternalFormat(Load._FASL_EXTERNAL_FORMAT_.symbolValue(thread));
			while (true) {
				SubLObject obj = in.faslRead(false, Lisp.EOF, true, thread);
				if (obj == Lisp.EOF)
					break;
				result = Lisp.eval(obj, env, thread);
			}
		} finally {
			thread.resetSpecialBindings(mark);
		}
		return result;
		// There's no point in using here the returnLastResult flag like in
		// loadStream(): this function is only called from init-fasl, which is
		// only called from load, which already has its own policy for choosing
		// whether to return T or the last value.
	}

	/**
	 * @return Pathname of loadable file based on NAME, or null if none can be
	 *         determined.
	 */
	private static Pathname findLoadableFile(Pathname name) {
		SubLObject truename = Pathname.truename(name, false);
		if (truename instanceof Pathname) {
			Pathname t = (Pathname) truename;
			if (t.name != Lisp.NIL && t.name != null)
				return t;
		}
		if (name.type == Lisp.NIL && (name.name != Lisp.NIL || name.name != null)) {
			Pathname lispPathname = new Pathname(name);
			lispPathname.type = LispObjectFactory.makeString("lisp");
			lispPathname.invalidateNamestring();
			SubLObject lisp = Pathname.truename(lispPathname, false);
			Pathname abclPathname = new Pathname(name);
			abclPathname.type = LispObjectFactory.makeString("abcl");
			abclPathname.invalidateNamestring();
			SubLObject abcl = Pathname.truename(abclPathname, false);
			if (lisp instanceof Pathname && abcl instanceof Pathname) {
				lispPathname = (Pathname) lisp;
				abclPathname = (Pathname) abcl;
				long lispLastModified = lispPathname.getLastModified();
				long abclLastModified = abclPathname.getLastModified();
				if (abclLastModified > lispLastModified)
					return lispPathname;
				else
					return abclPathname;
			} else if (abcl instanceof Pathname)
				return (Pathname) abcl;
			else if (lisp instanceof Pathname)
				return (Pathname) lisp;
		}
		if (name.isJar())
			if (name.type.equals(Lisp.NIL)) {
				name.type = Load.COMPILE_FILE_INIT_FASL_TYPE;
				name.invalidateNamestring();
				Pathname result = Load.findLoadableFile(name);
				if (result != null)
					return result;
				name.type = LispObjectFactory.makeString(Lisp.COMPILE_FILE_TYPE);
				name.invalidateNamestring();
				result = Load.findLoadableFile(name);
				if (result != null)
					return result;
			}
		return null;
	}

	public static String getLoadVerbosePrefix(int loadDepth) {
		StringBuilder sb = new StringBuilder(";");
		for (int i = loadDepth - 1; i-- > 0;)
			sb.append(' ');
		return sb.toString();
	}

	public static SubLObject load(Pathname pathname, boolean verbose, boolean print, boolean ifDoesNotExist) {
		return Load.load(pathname, verbose, print, ifDoesNotExist, false);
	}

	public static SubLObject load(Pathname pathname, boolean verbose, boolean print, boolean ifDoesNotExist,
			boolean returnLastResult)

	{
		Pathname mergedPathname = null;
		if (!pathname.isAbsolute() && !pathname.isJar()) {
			Pathname pathnameDefaults = Lisp.coerceToPathname(LispSymbols.DEFAULT_PATHNAME_DEFAULTS.symbolValue());
			mergedPathname = Pathname.mergePathnames(pathname, pathnameDefaults);
		}

		Pathname truename = Load.findLoadableFile(mergedPathname != null ? mergedPathname : pathname);

		if (truename == null || truename.equals(Lisp.NIL))
			if (ifDoesNotExist)
				return Lisp.error(new FileError("File not found.", pathname));
			else {
				Debug.warn("Failed to load " + pathname.getNamestring());
				return Lisp.NIL;
			}

		if (Utilities.checkZipFile(truename)) {
			String n = truename.getNamestring();
			if (n.startsWith("jar:"))
				n = "jar:" + n + "!/" + truename.name.getString() + "." + Load.COMPILE_FILE_INIT_FASL_TYPE;
			else
				n = "jar:file:" + n + "!/" + truename.name.getString() + "."
						+ Load.COMPILE_FILE_INIT_FASL_TYPE.getString();
			mergedPathname = new Pathname(n);
			SubLObject initTruename = Pathname.truename(mergedPathname);
			if (initTruename == null || initTruename.equals(Lisp.NIL)) {
				// Maybe the enclosing JAR has been renamed?
				Pathname p = new Pathname(mergedPathname);
				p.name = Keyword.WILD;
				p.invalidateNamestring();
				SubLObject result = Pathname.MATCH_WILD_JAR_PATHNAME.execute(p);

				if (result instanceof SubLCons && ((SubLCons) result).cl_length() == 1
						&& ((SubLCons) result).car() instanceof Pathname)
					initTruename = result.car();
				else {
					String errorMessage = "Loadable FASL not found for " + "'" + pathname + "'" + " in " + "'"
							+ mergedPathname + "'";
					if (ifDoesNotExist)
						return Lisp.error(new FileError(errorMessage, mergedPathname));
					else {
						Debug.trace(errorMessage);
						return Lisp.NIL;
					}
				}
			}
			truename = (Pathname) initTruename;
		}

		InputStream in = truename.getInputStream();
		Debug.assertTrue(in != null);

		try {
			return Load.loadFileFromStream(pathname, truename,
					LispObjectFactory.makeStream(LispSymbols.SYSTEM_STREAM, in, LispSymbols.CHARACTER), verbose, print,
					false, returnLastResult);
		} catch (FaslVersionMismatch e) {
			StringBuilder sb = new StringBuilder("Incorrect fasl version: ");
			sb.append(truename);
			return Lisp.error(new SimpleError(sb.toString()));
		} finally {
			if (in != null)
				try {
					in.close();
				} catch (IOException e) {
					return Lisp.error(new LispError(e.getMessage()));
				}
		}
	}

	public static SubLObject load(String filename) {
		LispThread thread = LispThread.currentThread();
		return Load.load(new Pathname(filename), LispSymbols.LOAD_VERBOSE.symbolValue(thread) != Lisp.NIL,
				LispSymbols.LOAD_PRINT.symbolValue(thread) != Lisp.NIL, true);
	}

	static SubLObject load(SubLObject filespec, SubLObject verbose, SubLObject print, SubLObject ifDoesNotExist,
			SubLObject returnLastResult) {
		if (filespec instanceof LispStream)
			if (((LispStream) filespec).isOpen()) {
				SubLObject pathname;
				if (filespec instanceof FileStream)
					pathname = ((FileStream) filespec).getPathname();
				else
					pathname = Lisp.NIL;
				SubLObject truename;
				if (pathname instanceof Pathname)
					truename = pathname;
				else
					truename = Lisp.NIL;
				return Load.loadFileFromStream(pathname, truename, (LispStream) filespec, verbose != Lisp.NIL,
						print != Lisp.NIL, false, returnLastResult != Lisp.NIL);
			}
		// If stream is closed, fall through...
		Pathname pathname = Lisp.coerceToPathname(filespec);
		if (pathname instanceof LogicalPathname)
			pathname = LogicalPathname.translateLogicalPathname((LogicalPathname) pathname);
		return Load.load(pathname, verbose != Lisp.NIL, print != Lisp.NIL, ifDoesNotExist != Lisp.NIL,
				returnLastResult != Lisp.NIL);
	}

	private static SubLObject loadFileFromStream(Pathname pathname, Pathname truename, LispStream in, boolean verbose,
			boolean print, boolean auto) {
		return Load.loadFileFromStream(pathname == null ? Lisp.NIL : pathname, truename == null ? Lisp.NIL : truename,
				in, verbose, print, auto, false);
	}

	// A nil TRUENAME signals a load from stream which has no possible path
	private static SubLObject loadFileFromStream(SubLObject pathname, SubLObject truename, LispStream in,
			boolean verbose, boolean print, boolean auto, boolean returnLastResult)

	{
		long start = System.currentTimeMillis();
		LispThread thread = LispThread.currentThread();
		SpecialBindingsMark mark = thread.markSpecialBindings();
		// "LOAD binds *READTABLE* and *PACKAGE* to the values they held before
		// loading the file."
		thread.bindSpecialToCurrentValue(LispSymbols.CURRENT_READTABLE);
		thread.bindSpecialToCurrentValue(LispSymbols._PACKAGE_);
		int loadDepth = Lisp._LOAD_DEPTH_.symbolValue(thread).intValue();
		thread.bindSpecial(Lisp._LOAD_DEPTH_, LispObjectFactory.makeInteger(++loadDepth));
		// Compiler policy.
		thread.bindSpecialToCurrentValue(Lisp._SPEED_);
		thread.bindSpecialToCurrentValue(Lisp._SPACE_);
		thread.bindSpecialToCurrentValue(Lisp._SAFETY_);
		thread.bindSpecialToCurrentValue(Lisp._DEBUG_);
		thread.bindSpecialToCurrentValue(Lisp._EXPLAIN_);
		String prefix = Load.getLoadVerbosePrefix(loadDepth);
		try {
			thread.bindSpecial(LispSymbols.LOAD_PATHNAME, pathname);

			// The motivation behind the following piece of complexity
			// is the need to preserve the semantics of
			// *LOAD-TRUENAME* as always containing the truename of
			// the current "Lisp file". Since an ABCL packed FASL
			// actually has a Lisp file (aka "the init FASL") and one
			// or more Java classes from the compiler, we endeavor to
			// make *LOAD-TRUENAME* refer to the "overall" truename so
			// that a (LOAD *LOAD-TRUENAME*) would be equivalent to
			// reloading the complete current "Lisp file". If this
			// value diverges from the "true" truename, we set the
			// symbol SYS::*LOAD-TRUENAME-FASL* to that divergent
			// value. Currently the only code that uses this value is
			// Lisp.readFunctionBytes().
			Pathname truePathname = null;
			if (!truename.equals(Lisp.NIL)) {
				truePathname = new Pathname(((Pathname) truename).getNamestring());
				String type = truePathname.type.getString();
				if (type.equals(Lisp.COMPILE_FILE_TYPE) || type.equals(Load.COMPILE_FILE_INIT_FASL_TYPE.getString())) {
					Pathname truenameFasl = new Pathname(truePathname);
					thread.bindSpecial(LispSymbols.LOAD_TRUENAME_FASL, truenameFasl);
				}
				if (truePathname.type.getString().equals(Load.COMPILE_FILE_INIT_FASL_TYPE.getString())
						&& truePathname.isJar()) {
					if (truePathname.device.rest() != Lisp.NIL) {
						// We set *LOAD-TRUENAME* to the argument that
						// a user would pass to LOAD.
						Pathname enclosingJar = (Pathname) truePathname.device.cdr().car();
						truePathname.device = LispObjectFactory.makeCons(truePathname.device.car(), Lisp.NIL);
						truePathname.host = Lisp.NIL;
						truePathname.directory = enclosingJar.directory;
						if (truePathname.directory.car().car().equals(Keyword.RELATIVE))
							truePathname.car().setCar(Keyword.ABSOLUTE);
						truePathname.name = enclosingJar.name;
						truePathname.type = enclosingJar.type;
						truePathname.invalidateNamestring();
					} else // XXX There is something fishy in the asymmetry
					// between the "jar:jar:http:" and "jar:jar:file:"
					// cases but this currently passes the tests.
					if (!(truePathname.device.first() instanceof SubLString)) {
						truePathname = (Pathname) truePathname.device.first();
						truePathname.invalidateNamestring();
					}
					thread.bindSpecial(LispSymbols.LOAD_TRUENAME, truePathname);
				} else
					thread.bindSpecial(LispSymbols.LOAD_TRUENAME, truename);
			} else
				thread.bindSpecial(LispSymbols.LOAD_TRUENAME, truename);
			thread.bindSpecial(Lisp._SOURCE_, pathname != null ? pathname : Lisp.NIL);
			if (verbose) {
				LispStream out = Lisp.getStandardOutput();
				out.freshLine();
				out._writeString(prefix);
				out._writeString(auto ? " Autoloading " : " Loading ");
				out._writeString(!truename.equals(Lisp.NIL) ? truePathname.writeToString() : "stream");
				out._writeLine(" ...");
				out._finishOutput();
				SubLObject result = Load.loadStream(in, print, thread, returnLastResult);
				long elapsed = System.currentTimeMillis() - start;
				out.freshLine();
				out._writeString(prefix);
				out._writeString(auto ? " Autoloaded " : " Loaded ");
				out._writeString(!truename.equals(Lisp.NIL) ? truePathname.writeToString() : "stream");
				out._writeString(" (");
				out._writeString(String.valueOf((float) elapsed / 1000));
				out._writeLine(" seconds)");
				out._finishOutput();
				return result;
			} else
				return Load.loadStream(in, print, thread, returnLastResult);
		} finally {
			thread.resetSpecialBindings(mark);
		}
	}

	private static SubLObject loadStream(LispStream in, boolean print, LispThread thread) {
		return Load.loadStream(in, print, thread, false);
	}

	private static SubLObject loadStream(LispStream in, boolean print, LispThread thread, boolean returnLastResult)

	{
		SpecialBindingsMark mark = thread.markSpecialBindings();
		thread.bindSpecial(Lisp._LOAD_STREAM_, in);
		SpecialBinding sourcePositionBinding = thread.bindSpecial(Lisp._SOURCE_POSITION_, Fixnum.ZERO);
		try {
			Environment env = new Environment();
			SubLObject result = Lisp.NIL;
			while (true) {
				sourcePositionBinding.value = LispObjectFactory.makeInteger(in.getOffset());
				SubLObject obj = in.read(false, Lisp.EOF, false, thread);
				if (obj == Lisp.EOF)
					break;
				result = Lisp.eval(obj, env, thread);
				if (print) {
					LispStream out = Lisp.checkCharacterOutputStream(LispSymbols.STANDARD_OUTPUT.symbolValue(thread));
					out._writeLine(result.writeToString());
					out._finishOutput();
				}
			}
			if (returnLastResult)
				return result;
			else
				return Lisp.T;
		} finally {
			thread.resetSpecialBindings(mark);
		}
	}

	public static SubLObject loadSystemFile(String filename)

	{
		LispThread thread = LispThread.currentThread();
		return Load.loadSystemFile(filename, LispSymbols.LOAD_VERBOSE.symbolValue(thread) != Lisp.NIL,
				LispSymbols.LOAD_PRINT.symbolValue(thread) != Lisp.NIL, false);
	}

	public static SubLObject loadSystemFile(String filename, boolean auto)

	{
		LispThread thread = LispThread.currentThread();
		if (auto) {
			SpecialBindingsMark mark = thread.markSpecialBindings();
			thread.bindSpecial(LispSymbols.CURRENT_READTABLE, Lisp.STANDARD_READTABLE.symbolValue(thread));
			thread.bindSpecial(LispSymbols._PACKAGE_, Lisp.PACKAGE_CL_USER);
			try {
				return Load.loadSystemFile(filename, Lisp._AUTOLOAD_VERBOSE_.symbolValue(thread) != Lisp.NIL,
						LispSymbols.LOAD_PRINT.symbolValue(thread) != Lisp.NIL, auto);
			} finally {
				thread.resetSpecialBindings(mark);
			}
		} else
			return Load.loadSystemFile(filename, LispSymbols.LOAD_VERBOSE.symbolValue(thread) != Lisp.NIL,
					LispSymbols.LOAD_PRINT.symbolValue(thread) != Lisp.NIL, auto);
	}

	public static SubLObject loadSystemFile(String filename, boolean verbose, boolean print, boolean auto)

	{
		InputStream in = null;
		Pathname pathname = null;
		Pathname truename = null;
		pathname = new Pathname(filename);
		SubLObject bootPath = Site.getLispHome();
		Pathname mergedPathname;
		if (bootPath instanceof Pathname)
			mergedPathname = Pathname.mergePathnames(pathname, (Pathname) bootPath);
		else
			mergedPathname = pathname;
		URL url = null;
		truename = Load.findLoadableFile(mergedPathname);
		if (truename == null || truename.equals(Lisp.NIL) || bootPath.equals(Lisp.NIL)) {
			// Make an attempt to use the boot classpath
			String path = pathname.asEntryPath();
			url = Lisp.class.getResource(path);
			if (url == null || url.toString().endsWith("/")) {
				url = Lisp.class.getResource(path + ".abcl");
				if (url == null)
					url = Lisp.class.getResource(path + ".lisp");
			}
			if (url == null)
				return Lisp.error(new LispError(
						"Failed to find loadable system file " + "'" + path + "'" + " in boot classpath."));
			if (!bootPath.equals(Lisp.NIL)) {
				Pathname urlPathname = new Pathname(url);
				truename = Load.findLoadableFile(urlPathname);
				if (truename == null)
					return Lisp.error(
							new LispError("Failed to find loadable system file in boot classpath " + "'" + url + "'"));
			} else
				truename = null; // We can't represent the FASL in a Pathname
									// (q.v. OSGi)
		}

		// Look for a init FASL inside a packed FASL
		if (truename != null && truename.type.writeToString().equals(Lisp.COMPILE_FILE_TYPE)
				&& Utilities.checkZipFile(truename)) {
			Pathname init = new Pathname(truename.getNamestring());
			init.type = Load.COMPILE_FILE_INIT_FASL_TYPE;
			SubLObject t = Pathname.truename(init);
			if (t instanceof Pathname)
				truename = (Pathname) t;
			else
				return Lisp.error(
						new LispError("Failed to find loadable init FASL in " + "'" + init.getNamestring() + "'"));
		}

		if (truename != null)
			in = truename.getInputStream();
		else
			try {
				Debug.assertTrue(url != null);
				in = url.openStream();
			} catch (IOException e) {
				Lisp.error(new FileError(
						"Failed to load system file: " + "'" + filename + "'" + " from URL: " + "'" + url + "'"));
			}

		if (in != null) {
			LispThread thread = LispThread.currentThread();
			SpecialBindingsMark mark = thread.markSpecialBindings();
			thread.bindSpecial(Lisp._WARN_ON_REDEFINITION_, Lisp.NIL);
			try {
				LispStream stream = LispObjectFactory.makeStream(LispSymbols.SYSTEM_STREAM, in, LispSymbols.CHARACTER);
				return Load.loadFileFromStream(pathname, truename, stream, verbose, print, auto);
			} catch (FaslVersionMismatch e) {
				StringBuilder sb = new StringBuilder("; Incorrect fasl version: ");
				sb.append(truename);
				System.err.println(sb.toString());
			} finally {
				thread.resetSpecialBindings(mark);
				try {
					in.close();
				} catch (IOException e) {
					return Lisp.error(new LispError(e.getMessage()));
				}
			}
		}
		return Lisp.error(new FileError(
				"Failed to load system file: " + "'" + filename + "'" + " resolved as " + "'" + mergedPathname + "'",
				truename));
	}
}
