/*
 * Pathname.java
 *
 * Copyright (C) 2003-2007 Peter Graves
 * $Id: Pathname.java 12551 2010-03-16 18:06:28Z mevenson $
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
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.StringTokenizer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class Pathname extends AbstractLispObject {

	private static class pf_directory_namestring extends JavaPrimitive {
		pf_directory_namestring() {
			super("directory-namestring", "pathname");
		}

		public SubLObject execute(SubLObject arg) {
			return LispObjectFactory.makeString(Lisp.coerceToPathname(arg).getDirectoryNamestring());
		}
	}

	private static class pf_file_namestring extends JavaPrimitive {
		pf_file_namestring() {
			super("file-namestring", "pathname");
		}

		public SubLObject execute(SubLObject arg) {
			Pathname p = Lisp.coerceToPathname(arg);
			StringBuilder sb = new StringBuilder();
			if (p.name instanceof SubLString)
				sb.append(p.name.getString());
			else if (p.name == Keyword.WILD)
				sb.append('*');
			else
				return Lisp.NIL;
			if (p.type instanceof SubLString) {
				sb.append('.');
				sb.append(p.type.getString());
			} else if (p.type == Keyword.WILD)
				sb.append(".*");
			return LispObjectFactory.makeString(sb);
		}
	}

	private static class pf_host_namestring extends JavaPrimitive {
		pf_host_namestring() {
			super("host-namestring", "pathname");
		}

		public SubLObject execute(SubLObject arg) {
			return Lisp.coerceToPathname(arg).host;
		}
	}

	private static class pf_list_directory extends JavaPrimitive {
		pf_list_directory() {
			super("list-directory", Lisp.PACKAGE_SYS, true, "directory");
		}

		public SubLObject execute(SubLObject arg) {
			Pathname pathname = Lisp.coerceToPathname(arg);
			if (pathname instanceof LogicalPathname)
				pathname = LogicalPathname.translateLogicalPathname((LogicalPathname) pathname);

			SubLObject result = Lisp.NIL;
			if (pathname.isJar()) {
				String directory = pathname.asEntryPath();
				Debug.assertTrue(directory != null); // We should only be
														// listing directories

				if (pathname.device.rest() instanceof SubLCons)
					return Lisp.error(new FileError("Unimplemented directory listing of JAR within JAR.", pathname));

				if (directory.length() == 0)
					directory = "/*";
				else if (directory.endsWith("/"))
					directory = "/" + directory + "*";
				else
					directory = "/" + directory + "/*";
				SubLString wildcard = LispObjectFactory.makeString(directory);
				SubLString wildcardDirectory = LispObjectFactory.makeString(directory + "/");

				ZipFile jar = ZipCache.get(pathname.device.first());
				SubLObject matches;
				for (Enumeration<? extends ZipEntry> entries = jar.entries(); entries.hasMoreElements();) {
					ZipEntry entry = entries.nextElement();
					String entryName = "/" + entry.getName();

					if (entryName.endsWith("/"))
						matches = LispSymbols.PATHNAME_MATCH_P.execute(LispObjectFactory.makeString(entryName),
								wildcardDirectory);
					else
						matches = LispSymbols.PATHNAME_MATCH_P.execute(LispObjectFactory.makeString(entryName),
								wildcard);
					if (!matches.equals(Lisp.NIL)) {
						String namestring = new String(pathname.getNamestring());
						namestring = namestring.substring(0, namestring.lastIndexOf("!/") + 2) + entry.getName();
						Pathname p = new Pathname(namestring);
						result = LispObjectFactory.makeCons(p, result);
					}
				}
				return result;
			}

			String s = pathname.getNamestring();
			if (s != null) {
				File f = new File(s);
				if (f.isDirectory())
					try {
						File[] files = f.listFiles();
						for (int i = files.length; i-- > 0;) {
							File file = files[i];
							Pathname p;
							if (file.isDirectory())
								p = Utilities.getDirectoryPathname(file);
							else
								p = new Pathname(file.getCanonicalPath());
							result = LispObjectFactory.makeCons(p, result);
						}
					} catch (IOException e) {
						return Lisp.error(
								new FileError("Unable to list directory " + pathname.writeToString() + ".", pathname));
					} catch (SecurityException e) {
						Debug.trace(e);
					} catch (NullPointerException e) {
						Debug.trace(e);
					}
			}
			return result;
		}
	}

	private static class pf_logical_pathname_p extends JavaPrimitive {
		pf_logical_pathname_p() {
			super("logical-pathname-p", Lisp.PACKAGE_SYS, true, "object");
		}

		public SubLObject execute(SubLObject arg) {
			return arg instanceof LogicalPathname ? Lisp.T : Lisp.NIL;
		}
	}

	private static class pf_make_pathname extends JavaPrimitive {
		pf_make_pathname() {
			super("make-pathname", "&key host device directory name type version defaults case");
		}

		public SubLObject execute(SubLObject[] args) {
			return Pathname._makePathname(args);
		}
	}

	private static class pf_match_wild_jar_pathname extends JavaPrimitive {
		pf_match_wild_jar_pathname() {
			super("match-wild-jar-pathname", Lisp.PACKAGE_SYS, false, "wild-jar-pathname");
		}

		public SubLObject execute(SubLObject arg) {
			Pathname pathname = Lisp.coerceToPathname(arg);
			if (pathname instanceof LogicalPathname)
				pathname = LogicalPathname.translateLogicalPathname((LogicalPathname) pathname);
			if (!pathname.isJar())
				return new FileError("Not a jar pathname.", pathname);
			if (!pathname.isWild())
				return new FileError("Not a wild pathname.", pathname);
			Pathname jarPathname = new Pathname(pathname);
			jarPathname.directory = Lisp.NIL;
			jarPathname.name = Lisp.NIL;
			jarPathname.type = Lisp.NIL;
			jarPathname.invalidateNamestring();
			// will propagate an appropiate Lisp error if jarPathname
			// doesn't exist.
			SubLObject jarTruename = Pathname.truename(jarPathname, true);

			SubLObject result = Lisp.NIL;
			String wild = "/" + pathname.asEntryPath();

			if (pathname.device.rest() instanceof SubLCons)
				return Lisp.error(new FileError("Unimplemented directory listing of JAR within JAR.", pathname));

			SubLString wildcard = LispObjectFactory.makeString(wild);

			ZipFile jar = ZipCache.get(pathname.device.first());

			for (Enumeration<? extends ZipEntry> entries = jar.entries(); entries.hasMoreElements();) {
				ZipEntry entry = entries.nextElement();
				String entryName = "/" + entry.getName();

				SubLObject matches = LispSymbols.PATHNAME_MATCH_P.execute(LispObjectFactory.makeString(entryName),
						wildcard);

				if (!matches.equals(Lisp.NIL)) {
					String namestring = new String(pathname.getNamestring());
					namestring = namestring.substring(0, namestring.lastIndexOf("!/") + 2) + entry.getName();
					Pathname p = new Pathname(namestring);
					result = LispObjectFactory.makeCons(p, result);
				}
			}
			return result;
		}
	}

	static class pf_merge_pathnames extends JavaPrimitive {
		pf_merge_pathnames() {
			super("merge-pathnames", "pathname &optional default-pathname default-version");
		}

		public SubLObject execute(SubLObject arg) {
			Pathname pathname = Lisp.coerceToPathname(arg);
			Pathname defaultPathname = Lisp.coerceToPathname(LispSymbols.DEFAULT_PATHNAME_DEFAULTS.symbolValue());
			SubLObject defaultVersion = Keyword.NEWEST;
			return Pathname.mergePathnames(pathname, defaultPathname, defaultVersion);
		}

		public SubLObject execute(SubLObject first, SubLObject second) {
			Pathname pathname = Lisp.coerceToPathname(first);
			Pathname defaultPathname = Lisp.coerceToPathname(second);
			SubLObject defaultVersion = Keyword.NEWEST;
			return Pathname.mergePathnames(pathname, defaultPathname, defaultVersion);
		}

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			Pathname pathname = Lisp.coerceToPathname(first);
			Pathname defaultPathname = Lisp.coerceToPathname(second);
			SubLObject defaultVersion = third;
			return Pathname.mergePathnames(pathname, defaultPathname, defaultVersion);
		}
	}

	private static class pf_mkdir extends JavaPrimitive {
		pf_mkdir() {
			super("mkdir", Lisp.PACKAGE_SYS, false, "pathname");
		}

		public SubLObject execute(SubLObject arg) {
			Pathname pathname = Lisp.coerceToPathname(arg);
			if (pathname.isWild())
				Lisp.error(new FileError("Bad place for a wild pathname.", pathname));
			Pathname defaultedPathname = Pathname.mergePathnames(pathname,
					Lisp.coerceToPathname(LispSymbols.DEFAULT_PATHNAME_DEFAULTS.symbolValue()), Lisp.NIL);
			File file = Utilities.getFile(defaultedPathname);
			return file.mkdir() ? Lisp.T : Lisp.NIL;
		}
	}

	private static class pf_namestring extends JavaPrimitive {
		pf_namestring() {
			super("namestring", "pathname");
		}

		public SubLObject execute(SubLObject arg) {
			Pathname pathname = Lisp.coerceToPathname(arg);
			String namestring = pathname.getNamestring();
			if (namestring == null)
				Lisp.error(new SimpleError("Pathname has no namestring: " + pathname.writeToString()));
			return LispObjectFactory.makeString(namestring);
		}
	}

	private static class pf_parse_namestring extends JavaPrimitive {
		pf_parse_namestring() {
			super("%parse-namestring", Lisp.PACKAGE_SYS, false, "namestring host default-pathname");
		}

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			LispThread thread = LispThread.currentThread();
			SubLString namestring = Lisp.checkString(first);
			// The HOST parameter must be a string or NIL.
			if (second == Lisp.NIL) {
				// "If HOST is NIL, DEFAULT-PATHNAME is a logical pathname, and
				// THING is a syntactically valid logical pathname namestring
				// without an explicit host, then it is parsed as a logical
				// pathname namestring on the host that is the host component
				// of DEFAULT-PATHNAME."
				third = Lisp.coerceToPathname(third);
				if (third instanceof LogicalPathname)
					second = ((LogicalPathname) third).host;
				else
					return thread.setValues(Pathname.parseNamestring(namestring), namestring.LENGTH());
			}
			Debug.assertTrue(second != Lisp.NIL);
			SubLString host = Lisp.checkString(second);
			return thread.setValues(Pathname.parseNamestring(namestring, host), namestring.LENGTH());
		}
	}

	private static class pf_pathname extends JavaPrimitive {
		pf_pathname() {
			super("pathname", "pathspec");
		}

		public SubLObject execute(SubLObject arg) {
			return Lisp.coerceToPathname(arg);
		}
	}

	private static class pf_pathname_device extends JavaPrimitive {
		pf_pathname_device() {
			super("%pathname-device", Lisp.PACKAGE_SYS, false);
		}

		public SubLObject execute(SubLObject first, SubLObject second) {
			Pathname.checkCaseArgument(second);
			return Lisp.coerceToPathname(first).device;
		}
	}

	private static class pf_pathname_directory extends JavaPrimitive {
		pf_pathname_directory() {
			super("%pathname-directory", Lisp.PACKAGE_SYS, false);
		}

		public SubLObject execute(SubLObject first, SubLObject second) {
			Pathname.checkCaseArgument(second);
			return Lisp.coerceToPathname(first).directory;
		}
	}

	private static class pf_pathname_host extends JavaPrimitive {
		pf_pathname_host() {
			super("%pathname-host", Lisp.PACKAGE_SYS, false);
		}

		public SubLObject execute(SubLObject first, SubLObject second) {
			Pathname.checkCaseArgument(second);
			return Lisp.coerceToPathname(first).host;
		}
	}

	private static class pf_pathname_jar_p extends JavaPrimitive {
		pf_pathname_jar_p() {
			super("pathname-jar-p", Lisp.PACKAGE_SYS, true, "pathname",
					"Predicate for whether PATHNAME references a JAR.");
		}

		public SubLObject execute(SubLObject arg) {
			Pathname p = Lisp.coerceToPathname(arg);
			return p.isJar() ? Lisp.T : Lisp.NIL;
		}
	}

	private static class pf_pathname_name extends JavaPrimitive {
		pf_pathname_name() {
			super("%pathname-name", Lisp.PACKAGE_SYS, false);
		}

		public SubLObject execute(SubLObject first, SubLObject second) {
			Pathname.checkCaseArgument(second);
			return Lisp.coerceToPathname(first).name;
		}
	}

	private static class pf_pathname_type extends JavaPrimitive {
		pf_pathname_type() {
			super("%pathname-type", Lisp.PACKAGE_SYS, false);
		}

		public SubLObject execute(SubLObject first, SubLObject second) {
			Pathname.checkCaseArgument(second);
			return Lisp.coerceToPathname(first).type;
		}
	}

	private static class pf_pathname_version extends JavaPrimitive {
		pf_pathname_version() {
			super("pathname-version", "pathname");
		}

		public SubLObject execute(SubLObject arg) {
			return Lisp.coerceToPathname(arg).version;
		}
	}

	private static class pf_pathnamep extends JavaPrimitive {
		pf_pathnamep() {
			super("pathnamep", "object");
		}

		public SubLObject execute(SubLObject arg) {
			return arg instanceof Pathname ? Lisp.T : Lisp.NIL;
		}
	}

	private static class pf_rename_file extends JavaPrimitive {
		pf_rename_file() {
			super("rename-file", "filespec new-name");
		}

		public SubLObject execute(SubLObject first, SubLObject second) {
			Pathname original = (Pathname) Pathname.truename(first, true);
			String originalNamestring = original.getNamestring();
			Pathname newName = Lisp.coerceToPathname(second);
			if (newName.isWild())
				Lisp.error(new FileError("Bad place for a wild pathname.", newName));
			newName = Pathname.mergePathnames(newName, original, Lisp.NIL);
			String newNamestring;
			if (newName instanceof LogicalPathname)
				newNamestring = LogicalPathname.translateLogicalPathname((LogicalPathname) newName).getNamestring();
			else
				newNamestring = newName.getNamestring();
			if (originalNamestring != null && newNamestring != null) {
				File source = new File(originalNamestring);
				File destination = new File(newNamestring);
				if (Utilities.isPlatformWindows)
					if (destination.isFile()) {
						ZipCache.remove(destination);
						destination.delete();
					}
				if (source.renameTo(destination))
					return LispThread.currentThread().setValues(newName, original, Pathname.truename(newName, true));
			}
			return Lisp.error(new FileError(
					"Unable to rename " + original.writeToString() + " to " + newName.writeToString() + "."));
		}
	}

	private static class pf_user_homedir_pathname extends JavaPrimitive {
		pf_user_homedir_pathname() {
			super("user-homedir-pathname", "&optional host");
		}

		public SubLObject execute(SubLObject[] args) {
			switch (args.length) {
			case 0: {
				String s = System.getProperty("user.home");
				if (!s.endsWith(File.separator))
					s = s.concat(File.separator);
				return new Pathname(s);
			}
			case 1:
				return Lisp.NIL; // ??? huh? -- ME 20100206
			default:
				return Lisp.error(new WrongNumberOfArgumentsException(this));
			}
		}
	}

	static class pf_wild_pathname_p extends JavaPrimitive {
		pf_wild_pathname_p() {
			super("%wild-pathname-p", Lisp.PACKAGE_SYS, true);
		}

		public SubLObject execute(SubLObject first, SubLObject second) {
			Pathname pathname = Lisp.coerceToPathname(first);
			if (second == Lisp.NIL)
				return pathname.isWild() ? Lisp.T : Lisp.NIL;
			if (second == Keyword.DIRECTORY) {
				if (pathname.directory instanceof SubLCons) {
					if (Lisp.memq(Keyword.WILD, pathname.directory))
						return Lisp.T;
					if (Lisp.memq(Keyword.WILD_INFERIORS, pathname.directory))
						return Lisp.T;
				}
				return Lisp.NIL;
			}
			SubLObject value;
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
				return Lisp.error(new ProgramError("Unrecognized keyword " + second.writeToString() + "."));
			if (value == Keyword.WILD || value == Keyword.WILD_INFERIORS)
				return Lisp.T;
			else
				return Lisp.NIL;
		}
	}

	static private String jarSeparator = "!/";

	// A logical host is represented as the string that names it.
	// (defvar *logical-pathname-translations* (make-hash-table :test 'equal))
	public static EqualHashTable LOGICAL_PATHNAME_TRANSLATIONS = new EqualHashTable(64, Lisp.NIL, Lisp.NIL);

	private static SubLSymbol _LOGICAL_PATHNAME_TRANSLATIONS_ = Lisp.exportSpecial("*LOGICAL-PATHNAME-TRANSLATIONS*",
			Lisp.PACKAGE_SYS, Pathname.LOGICAL_PATHNAME_TRANSLATIONS);

	// ### %pathname-host
	private static Primitive _PATHNAME_HOST = new pf_pathname_host();

	// ### %pathname-device
	private static Primitive _PATHNAME_DEVICE = new pf_pathname_device();

	// ### %pathname-directory
	private static Primitive _PATHNAME_DIRECTORY = new pf_pathname_directory();
	// ### %pathname-name
	private static Primitive _PATHNAME_NAME = new pf_pathname_name();

	// ### %pathname-type
	private static Primitive _PATHNAME_TYPE = new pf_pathname_type();

	// ### pathname-version
	private static Primitive PATHNAME_VERSION = new pf_pathname_version();

	// ### namestring
	// namestring pathname => namestring
	private static Primitive NAMESTRING = new pf_namestring();

	// ### directory-namestring
	// directory-namestring pathname => namestring
	private static Primitive DIRECTORY_NAMESTRING = new pf_directory_namestring();

	// ### pathname pathspec => pathname
	private static Primitive PATHNAME = new pf_pathname();

	// ### %parse-namestring string host default-pathname => pathname, position
	private static Primitive _PARSE_NAMESTRING = new pf_parse_namestring();

	// ### make-pathname
	private static Primitive MAKE_PATHNAME = new pf_make_pathname();

	// ### pathnamep
	private static Primitive PATHNAMEP = new pf_pathnamep();

	// ### logical-pathname-p
	private static Primitive LOGICAL_PATHNAME_P = new pf_logical_pathname_p();

	// ### user-homedir-pathname &optional host => pathname
	private static Primitive USER_HOMEDIR_PATHNAME = new pf_user_homedir_pathname();

	// ### list-directory directory
	private static Primitive LIST_DIRECTORY = new pf_list_directory();

	// ### match-wild-jar-pathname wild-jar-pathname
	static Primitive MATCH_WILD_JAR_PATHNAME = new pf_match_wild_jar_pathname();

	// ### PATHNAME-JAR-P
	private static Primitive PATHNAME_JAR_P = new pf_pathname_jar_p();

	// ### %wild-pathname-p
	private static Primitive _WILD_PATHNAME_P = new pf_wild_pathname_p();

	// ### merge-pathnames pathname &optional default-pathname default-version"
	private static Primitive MERGE_PATHNAMES = new pf_merge_pathnames();

	// ### mkdir pathname
	private static Primitive MKDIR = new pf_mkdir();

	// ### rename-file filespec new-name => defaulted-new-name, old-truename,
	// new-truename
	private static Primitive RENAME_FILE = new pf_rename_file();

	// ### file-namestring pathname => namestring
	private static Primitive FILE_NAMESTRING = new pf_file_namestring();

	// ### host-namestring pathname => namestring
	private static Primitive HOST_NAMESTRING = new pf_host_namestring();

	static {
		SubLObject obj = LispSymbols.DEFAULT_PATHNAME_DEFAULTS.getSymbolValue();
		LispSymbols.DEFAULT_PATHNAME_DEFAULTS.setSymbolValue(Lisp.coerceToPathname(obj));
	}

	static Pathname _makePathname(SubLObject[] args) {
		if (args.length % 2 != 0)
			Lisp.error(new ProgramError("Odd number of keyword arguments."));
		SubLObject host = Lisp.NIL;
		SubLObject device = Lisp.NIL;
		SubLObject directory = Lisp.NIL;
		SubLObject name = Lisp.NIL;
		SubLObject type = Lisp.NIL;
		SubLObject version = Lisp.NIL;
		Pathname defaults = null;
		boolean deviceSupplied = false;
		boolean nameSupplied = false;
		boolean typeSupplied = false;
		for (int i = 0; i < args.length; i += 2) {
			SubLObject key = args[i];
			SubLObject value = args[i + 1];
			if (key == Keyword.HOST)
				host = value;
			else if (key == Keyword.DEVICE) {
				device = value;
				deviceSupplied = true;
			} else if (key == Keyword.DIRECTORY) {
				if (value instanceof SubLString)
					directory = Lisp.list(Keyword.ABSOLUTE, value);
				else if (value == Keyword.WILD)
					directory = Lisp.list(Keyword.ABSOLUTE, Keyword.WILD);
				else
					directory = value;
			} else if (key == Keyword.NAME) {
				name = value;
				nameSupplied = true;
			} else if (key == Keyword.TYPE) {
				type = value;
				typeSupplied = true;
			} else if (key == Keyword.VERSION)
				version = value;
			else if (key == Keyword.DEFAULTS)
				defaults = Lisp.coerceToPathname(value);
			else if (key == Keyword.CASE) {
				// Ignored.
			}
		}
		if (defaults != null) {
			if (host == Lisp.NIL)
				host = defaults.host;
			if (directory == Lisp.NIL && defaults != null)
				directory = defaults.directory;
			if (!deviceSupplied)
				device = defaults.device;
			if (!nameSupplied)
				name = defaults.name;
			if (!typeSupplied)
				type = defaults.type;
		}
		Pathname p;
		boolean logical;
		if (host != Lisp.NIL) {
			if (host instanceof SubLString)
				host = LogicalPathname.canonicalizeStringComponent((SubLString) host);
			if (Pathname.LOGICAL_PATHNAME_TRANSLATIONS.getHT(host) == null)
				// Not a defined logical pathname host.
				Lisp.error(new LispError(host.writeToString() + " is not defined as a logical pathname host."));
			p = new LogicalPathname();
			logical = true;
			p.host = host;
			p.device = Keyword.UNSPECIFIC;
		} else {
			p = new Pathname();
			logical = false;
		}
		if (device != Lisp.NIL)
			if (logical) {
				// "The device component of a logical pathname is always
				// :UNSPECIFIC."
				if (device != Keyword.UNSPECIFIC)
					Lisp.error(new LispError("The device component of a logical pathname must be :UNSPECIFIC."));
			} else
				p.device = device;
		if (directory != Lisp.NIL)
			if (logical) {
				if (directory.isList()) {
					SubLObject d = Lisp.NIL;
					while (directory != Lisp.NIL) {
						SubLObject component = directory.first();
						if (component instanceof SubLString)
							d = d.push(LogicalPathname.canonicalizeStringComponent((SubLString) component));
						else
							d = d.push(component);
						directory = directory.rest();
					}
					p.directory = d.nreverse();
				} else if (directory == Keyword.WILD || directory == Keyword.WILD_INFERIORS)
					p.directory = directory;
				else
					Lisp.error(new LispError(
							"Invalid directory component for logical pathname: " + directory.writeToString()));
			} else
				p.directory = directory;
		if (name != Lisp.NIL)
			if (logical && name instanceof SubLString)
				p.name = LogicalPathname.canonicalizeStringComponent((SubLString) name);
			else if (name instanceof SubLString)
				p.name = Pathname.validateStringComponent((SubLString) name);
			else
				p.name = name;
		if (type != Lisp.NIL)
			if (logical && type instanceof SubLString)
				p.type = LogicalPathname.canonicalizeStringComponent((SubLString) type);
			else
				p.type = type;
		p.version = version;
		return p;
	}

	static void checkCaseArgument(SubLObject arg) {
		if (arg != Keyword.COMMON && arg != Keyword.LOCAL)
			Lisp.type_error(arg, Lisp.list(LispSymbols.MEMBER, Keyword.COMMON, Keyword.LOCAL));
	}

	// "one or more uppercase letters, digits, and hyphens"
	protected static String getHostString(String s) {
		int colon = s.indexOf(':');
		if (colon >= 0)
			return s.substring(0, colon).toUpperCase();
		else
			return null;
	}

	public static boolean isSupportedProtocol(String protocol) {
		return "jar".equals(protocol) || "file".equals(protocol);
	}

	/** Make a JarURL from a Pathname that references a file */
	private static URL makeJarURL(Pathname p) {
		String jarURL = "jar:file:" + p.getNamestring() + "!/";
		URL result = null;
		try {
			result = new URL(jarURL);
		} catch (MalformedURLException ex) {
			// XXX
			Debug.trace("Could not form URL from pathname " + "'" + jarURL + "'" + " because " + ex);
		}
		return result;
	}

	public static Pathname makePathname(File file) {
		String namestring = null;
		try {
			namestring = file.getCanonicalPath();
		} catch (IOException e) {
			Debug.trace("Failed to make a Pathname from " + "." + file + "'");
			return null;
		}
		return new Pathname(namestring);
	}

	// Used by the #p reader.
	public static Pathname makePathname(SubLObject args) {
		return Pathname._makePathname(args.copyToArray());
	}

	protected static URL makeURL(SubLObject device) {
		URL result = null;
		try {
			if (device instanceof SubLString)
				result = new URL(((SubLString) device).getString());
			else {
				// XXX ensure that we have cannonical path.
				Pathname p = (Pathname) device;
				result = new URL("file:" + p.getNamestring());
			}
		} catch (MalformedURLException e) {
			Debug.trace("Could not form URL from " + device);
		}
		return result;
	}

	private static SubLObject mergeDirectories(SubLObject dir, SubLObject defaultDir) {
		if (dir == Lisp.NIL)
			return defaultDir;
		if (dir.first() == Keyword.RELATIVE && defaultDir != Lisp.NIL) {
			SubLObject result = Lisp.NIL;
			while (defaultDir != Lisp.NIL) {
				result = LispObjectFactory.makeCons(defaultDir.first(), result);
				defaultDir = defaultDir.rest();
			}
			dir = dir.rest(); // Skip :RELATIVE.
			while (dir != Lisp.NIL) {
				result = LispObjectFactory.makeCons(dir.first(), result);
				dir = dir.rest();
			}
			SubLObject[] array = result.copyToArray();
			for (int i = 0; i < array.length - 1; i++)
				if (array[i] == Keyword.BACK)
					if (array[i + 1] instanceof SubLString || array[i + 1] == Keyword.WILD) {
						array[i] = null;
						array[i + 1] = null;
					}
			result = Lisp.NIL;
			for (int i = 0; i < array.length; i++)
				if (array[i] != null)
					result = LispObjectFactory.makeCons(array[i], result);
			return result;
		}
		return dir;
	}

	public static Pathname mergePathnames(Pathname pathname, Pathname defaultPathname) {
		return Pathname.mergePathnames(pathname, defaultPathname, Keyword.NEWEST);
	}

	public static Pathname mergePathnames(Pathname pathname, Pathname defaultPathname, SubLObject defaultVersion) {
		Pathname result;
		Pathname p = new Pathname(pathname);
		Pathname d;

		if (pathname instanceof LogicalPathname) {
			result = new LogicalPathname();
			d = new Pathname(defaultPathname);
		} else {
			result = new Pathname();
			if (defaultPathname instanceof LogicalPathname)
				d = LogicalPathname.translateLogicalPathname((LogicalPathname) defaultPathname);
			else
				d = new Pathname(defaultPathname);
		}
		if (pathname.host != Lisp.NIL)
			result.host = p.host;
		else
			result.host = d.host;

		if (pathname.device != Lisp.NIL)
			// merge
			result.device = p.device;
		else
			result.device = d.device;

		if (pathname.isJar()) {
			SubLCons jars = (SubLCons) result.device;
			SubLObject jar = jars.first();
			if (jar instanceof Pathname) {
				Pathname defaults = new Pathname(d);
				if (defaults.isJar())
					defaults.device = Lisp.NIL;
				Pathname o = Pathname.mergePathnames((Pathname) jar, defaults);
				if (o.directory instanceof SubLCons && ((SubLCons) o.directory).cl_length() == 1)
					// (:ABSOLUTE)
					// or
					// (:RELATIVE)
					o.directory = Lisp.NIL;
				((SubLCons) result.device).setFirst(o);
			}
			result.directory = p.directory;
		} else
			result.directory = Pathname.mergeDirectories(p.directory, d.directory);

		// A JAR always has absolute directories
		// if (result.isJar()
		// && result.directory instanceof Cons
		// && result.directory.car().equals(Keyword.ABSOLUTE)) {
		// if (result.directory.cdr().equals(NIL)) {
		// result.directory = NIL;
		// } else {
		// ((Cons)result.directory).car = Keyword.RELATIVE;
		// }
		// }

		if (pathname.name != Lisp.NIL)
			result.name = p.name;
		else
			result.name = d.name;
		if (pathname.type != Lisp.NIL)
			result.type = p.type;
		else
			result.type = d.type;
		if (pathname.version != Lisp.NIL)
			result.version = pathname.version;
		else if (pathname.name instanceof SubLString)
			result.version = defaultVersion;
		else if (defaultPathname.version != Lisp.NIL)
			result.version = defaultPathname.version;
		else
			result.version = defaultVersion;
		if (pathname instanceof LogicalPathname) {
			// When we're returning a logical
			result.device = Keyword.UNSPECIFIC;
			if (result.directory.isList()) {
				SubLObject original = result.directory;
				SubLObject canonical = Lisp.NIL;
				while (original != Lisp.NIL) {
					SubLObject component = original.first();
					if (component instanceof SubLString)
						component = LogicalPathname.canonicalizeStringComponent((SubLString) component);
					canonical = canonical.push(component);
					original = original.rest();
				}
				result.directory = canonical.nreverse();
			}
			if (result.name instanceof SubLString)
				result.name = LogicalPathname.canonicalizeStringComponent((SubLString) result.name);
			if (result.type instanceof SubLString)
				result.type = LogicalPathname.canonicalizeStringComponent((SubLString) result.type);
		}
		result.invalidateNamestring();
		return result;
	}

	private static SubLObject parseDirectory(String d) {
		if (d.equals("/") || Utilities.isPlatformWindows && d.equals("\\"))
			return LispObjectFactory.makeCons(Keyword.ABSOLUTE);
		SubLObject result;
		if (d.startsWith("/") || Utilities.isPlatformWindows && d.startsWith("\\"))
			result = LispObjectFactory.makeCons(Keyword.ABSOLUTE);
		else
			result = LispObjectFactory.makeCons(Keyword.RELATIVE);
		StringTokenizer st = new StringTokenizer(d, "/\\");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			SubLObject obj;
			if (token.equals("*"))
				obj = Keyword.WILD;
			else if (token.equals("**"))
				obj = Keyword.WILD_INFERIORS;
			else if (token.equals("..")) {
				if (result.first() instanceof SubLString) {
					result = result.rest();
					continue;
				}
				obj = Keyword.UP;
			} else
				obj = LispObjectFactory.makeString(token);
			result = LispObjectFactory.makeCons(obj, result);
		}
		return result.nreverse();
	}

	public static Pathname parseNamestring(String s) {
		return new Pathname(s);
	}

	public static Pathname parseNamestring(SubLString namestring) {
		// Check for a logical pathname host.
		String s = namestring.getString();
		String h = Pathname.getHostString(s);
		if (h != null && Pathname.LOGICAL_PATHNAME_TRANSLATIONS.getHT(LispObjectFactory.makeString(h)) != null)
			// A defined logical pathname host.
			return new LogicalPathname(h, s.substring(s.indexOf(':') + 1));
		return new Pathname(s);
	}

	public static Pathname parseNamestring(SubLString namestring, SubLString host) {
		// Look for a logical pathname host in the namestring.
		String s = namestring.getString();
		String h = Pathname.getHostString(s);
		if (h != null) {
			if (!h.equals(host.getString())) {
				Lisp.error(new LispError("Host in " + s + " does not match requested host " + host.getString()));
				// Not reached.
				return null;
			}
			// Remove host prefix from namestring.
			s = s.substring(s.indexOf(':') + 1);
		}
		if (Pathname.LOGICAL_PATHNAME_TRANSLATIONS.getHT(host) != null)
			// A defined logical pathname host.
			return new LogicalPathname(host.getString(), s);
		Lisp.error(new LispError(host.writeToString() + " is not defined as a logical pathname host."));
		// Not reached.
		return null;
	}

	public static SubLObject truename(Pathname pathname) {
		return Pathname.truename(pathname, false);
	}

	/**
	 * @return The canonical TRUENAME as a Pathname if the pathname exists,
	 *         otherwise returns NIL or possibly a subtype of LispError if there
	 *         are logical problems with the input.
	 */
	public static SubLObject truename(Pathname pathname, boolean errorIfDoesNotExist) {
		if (pathname instanceof LogicalPathname)
			pathname = LogicalPathname.translateLogicalPathname((LogicalPathname) pathname);
		if (pathname.isWild())
			return Lisp.error(new FileError("Bad place for a wild pathname.", pathname));
		if (!(pathname.device instanceof SubLCons)) {
			pathname = Pathname.mergePathnames(pathname,
					Lisp.coerceToPathname(LispSymbols.DEFAULT_PATHNAME_DEFAULTS.symbolValue()), Lisp.NIL);
			String namestring = pathname.getNamestring();
			if (namestring == null)
				return Lisp.error(new FileError("Pathname has no namestring: " + pathname.writeToString(), pathname));

			File file = new File(namestring);
			if (file.isDirectory())
				return Utilities.getDirectoryPathname(file);
			if (file.exists())
				try {
					return new Pathname(file.getCanonicalPath());
				} catch (IOException e) {
					return Lisp.error(new FileError(e.getMessage(), pathname));
				}
		} else
			jarfile: {
				// Possibly canonicalize jar file directory
				SubLCons jars = (SubLCons) pathname.device;
				SubLObject o = jars.first();
				if (o instanceof Pathname) {
					SubLObject truename = Pathname.truename((Pathname) o, errorIfDoesNotExist);
					if (truename != null && truename instanceof Pathname)
						jars.setFirst(truename);
					else
						break jarfile;
				}

				// Check for existence of a JAR file and/or JarEntry
				//
				// Cases:
				// 1. JAR
				// 2. JAR in JAR
				// 3. JAR with Entry
				// 4. JAR in JAR with Entry
				ZipFile jarFile = ZipCache.get(jars.first());
				String entryPath = pathname.asEntryPath();
				if (jarFile != null)
					if (jars.rest() instanceof SubLCons) {
						Pathname inner = (Pathname) jars.rest().first();
						InputStream inputStream = Utilities.getInputStream(jarFile, inner);
						if (inputStream != null)
							if (entryPath.length() == 0)
								return pathname; // Case 2
							else {
								ZipInputStream zipInputStream = new ZipInputStream(inputStream);
								ZipEntry entry = Utilities.getEntry(zipInputStream, entryPath, false);
								if (entry != null)
									// XXX this could possibly be a directory?
									return pathname; // Case 4
							}
					} else if (entryPath.length() == 0)
						return pathname; // Case 1
					else {
						ZipEntry entry = jarFile.getEntry(entryPath);
						if (entry != null)
							// ensure this isn't a directory
							try {
							InputStream input = jarFile.getInputStream(entry);
							if (input != null)
							return pathname; // Case 3
							} catch (IOException e) {
							break jarfile;
							}
					}
			}
		error: if (errorIfDoesNotExist) {
			StringBuilder sb = new StringBuilder("The file ");
			sb.append(pathname.writeToString());
			sb.append(" does not exist.");
			return Lisp.error(new FileError(sb.toString(), pathname));
		}
		return Lisp.NIL;
	}

	public static SubLObject truename(SubLObject arg) {
		return Pathname.truename(arg, false);
	}

	public static SubLObject truename(SubLObject arg, boolean errorIfDoesNotExist) {
		Pathname pathname = Lisp.coerceToPathname(arg);
		return Pathname.truename(pathname, errorIfDoesNotExist);
	}

	private static SubLString validateStringComponent(SubLString s) {
		int limit = s.cl_length();
		for (int i = 0; i < limit; i++) {
			char c = s.charAt(i);
			if (c == '/' || c == '\\' && Utilities.isPlatformWindows) {
				Lisp.error(new LispError("Invalid character #\\" + c + " in pathname component \"" + s + '"'));
				// Not reached.
				return null;
			}
		}
		return s;
	}

	protected SubLObject host = Lisp.NIL;

	protected SubLObject device = Lisp.NIL;

	protected SubLObject directory = Lisp.NIL;

	protected SubLObject name = Lisp.NIL;

	// A string, NIL, :WILD or :UNSPECIFIC.
	protected SubLObject type = Lisp.NIL;

	// A positive integer, or NIL, :WILD, :UNSPECIFIC, or :NEWEST.
	protected SubLObject version = Lisp.NIL;

	private String namestring;

	protected Pathname() {
	}

	/** Copy constructor which shares no structure with the original. */
	protected Pathname(Pathname p) {
		if (p.host != Lisp.NIL)
			if (p.host instanceof SubLString)
				this.host = LispObjectFactory.makeString(((SubLString) p.host).getString());
			else if (p.host instanceof SubLSymbol)
				this.host = p.host;
			else
				Debug.assertTrue(false);
		if (p.device != Lisp.NIL)
			if (p.device instanceof SubLString)
				this.device = LispObjectFactory.makeString(((SubLString) p.device).getString());
			else if (p.device instanceof SubLCons) {
				SubLCons jars = (SubLCons) p.device;
				this.device = LispObjectFactory.makeCons(Lisp.NIL, Lisp.NIL);
				SubLObject first = jars.first();
				if (first instanceof SubLString)
					((SubLCons) this.device).setFirst(LispObjectFactory.makeString(((SubLString) first).getString()));
				else if (first instanceof Pathname)
					((SubLCons) this.device).setFirst(new Pathname((Pathname) first));
				else
					Debug.assertTrue(false);
				if (!jars.rest().equals(Lisp.NIL))
					if (jars.rest() instanceof SubLCons)
						((SubLCons) this.device).setCdr(
								LispObjectFactory.makeCons(new Pathname((Pathname) jars.rest().first()), Lisp.NIL));
					else
						Debug.assertTrue(false);
			} else if (p.device instanceof SubLSymbol)
				this.device = p.device;
			else
				Debug.assertTrue(false);
		if (p.directory != Lisp.NIL)
			if (p.directory instanceof SubLCons) {
				this.directory = Lisp.NIL;
				for (SubLObject list = p.directory; list != Lisp.NIL; list = list.rest()) {
					SubLObject o = list.first();
					if (o instanceof SubLSymbol)
						this.directory = this.directory.push(o);
					else if (o instanceof SubLString)
						this.directory = this.directory
								.push(LispObjectFactory.makeString(((SubLString) o).getString()));
					else
						Debug.assertTrue(false);
				}
				this.directory.nreverse();
			} else
				Debug.assertTrue(false);
		if (p.name != Lisp.NIL)
			if (p.name instanceof SubLString)
				this.name = LispObjectFactory.makeString(((SubLString) p.name).getString());
			else if (p.name instanceof SubLSymbol)
				this.name = p.name;
			else
				Debug.assertTrue(false);
		if (p.type != Lisp.NIL)
			if (p.type instanceof SubLString)
				this.type = LispObjectFactory.makeString(((SubLString) p.type).getString());
			else if (p.type instanceof SubLSymbol)
				this.type = p.type;
			else
				Debug.assertTrue(false);
	}

	public Pathname(String s) {
		this.init(s);
	}

	public Pathname(URL url) {
		String protocol = url.getProtocol();
		if (!Pathname.isSupportedProtocol(protocol))
			Lisp.error(new LispError("Unsupported URL: '" + url.toString() + "'"));

		if ("jar".equals(protocol)) {
			this.init(url.toString());
			return;
		} else if ("file".equals(protocol)) {
			String s;
			try {
				s = URLDecoder.decode(url.getPath(), "UTF-8");
			} catch (java.io.UnsupportedEncodingException uee) {
				// Can't happen: every Java is supposed to support
				// at least UTF-8 encoding
				Debug.assertTrue(false);
				s = null;
			}
			if (s != null) {
				if (Utilities.isPlatformWindows)
					// Workaround for Java's idea of URLs
					// new (URL"file:///c:/a/b").getPath() --> "/c:/a/b"
					// whereas we need "c" to be the DEVICE.
					if (s.length() > 2 && s.charAt(0) == '/' && s.charAt(2) == ':')
					s = s.substring(1);
				this.init(s);
				return;
			}
		}
		Lisp.error(new LispError("Failed to construct Pathname from URL: " + "'" + url.toString() + "'"));
	}

	/**
	 * @return The representation of this pathname suitable for referencing an
	 *         entry in a Zip/JAR file
	 */
	protected String asEntryPath() {
		Pathname p = new Pathname();
		p.directory = this.directory;
		p.name = this.name;
		p.type = this.type;
		String path = p.getNamestring();
		StringBuilder result = new StringBuilder();
		if (Utilities.isPlatformWindows)
			for (int i = 0; i < path.length(); i++) {
				char c = path.charAt(i);
				if (c == '\\')
					result.append('/');
				else
					result.append(c);
			}
		else
			result.append(path);
		// Entries in jar files are always relative, but Pathname
		// directories are :ABSOLUTE.
		if (result.length() > 1 && result.substring(0, 1).equals("/"))
			return result.substring(1);
		return result.toString();
	}

	public SubLObject classOf() {
		return BuiltInClass.PATHNAME;
	}

	public boolean equal(SubLObject obj) {
		if (this == obj)
			return true;
		if (obj instanceof Pathname) {
			Pathname p = (Pathname) obj;
			if (Utilities.isPlatformWindows) {
				if (!this.host.equalp(p.host))
					return false;
				if (!this.device.equalp(p.device))
					return false;
				if (!this.directory.equalp(p.directory))
					return false;
				if (!this.name.equalp(p.name))
					return false;
				if (!this.type.equalp(p.type))
					return false;
			} else {
				// Unix.
				if (!this.host.equal(p.host))
					return false;
				if (!this.device.equal(p.device))
					return false;
				if (!this.directory.equal(p.directory))
					return false;
				if (!this.name.equal(p.name))
					return false;
				if (!this.type.equal(p.type))
					return false;
			}
			return true;
		}
		return false;
	}

	public boolean equalp(SubLObject obj) {
		return this.equal(obj);
	}

	public SubLObject getDevice() {
		return this.device;
	}

	protected String getDirectoryNamestring() {
		this.validateDirectory(true);
		StringBuilder sb = new StringBuilder();
		// "If a pathname is converted to a namestring, the symbols NIL and
		// :UNSPECIFIC cause the field to be treated as if it were empty. That
		// is, both NIL and :UNSPECIFIC cause the component not to appear in
		// the namestring." 19.2.2.2.3.1
		if (this.directory != Lisp.NIL) {
			char separatorChar;
			if (this.device instanceof SubLCons)
				separatorChar = '/'; // Jar file.
			else
				separatorChar = File.separatorChar;
			SubLObject temp = this.directory;
			SubLObject part = temp.first();
			temp = temp.rest();
			if (part == Keyword.ABSOLUTE)
				sb.append(separatorChar);
			else if (part == Keyword.RELATIVE) {
				if (temp == Lisp.NIL) {
					// #p"./"
					sb.append('.');
					sb.append(separatorChar);
				}
				// else: Nothing to do.
			} else
				Lisp.error(new FileError("Unsupported directory component " + part.writeToString() + ".", this));
			while (temp != Lisp.NIL) {
				part = temp.first();
				if (part instanceof SubLString)
					sb.append(part.getString());
				else if (part == Keyword.WILD)
					sb.append('*');
				else if (part == Keyword.WILD_INFERIORS)
					sb.append("**");
				else if (part == Keyword.UP)
					sb.append("..");
				else
					Lisp.error(new FileError("Unsupported directory component " + part.writeToString() + ".", this));
				sb.append(separatorChar);
				temp = temp.rest();
			}
		}
		return sb.toString();
	}

	public InputStream getInputStream() {
		InputStream result = null;
		if (this.isJar()) {
			String entryPath = this.asEntryPath();
			// XXX We only return the bytes of an entry in a JAR
			Debug.assertTrue(entryPath != null);
			ZipFile jarFile = ZipCache.get(this.device.first());
			Debug.assertTrue(jarFile != null);
			// Is this a JAR within a JAR?
			if (this.device.rest() instanceof SubLCons) {
				Pathname inner = (Pathname) this.device.rest().first();
				InputStream input = Utilities.getInputStream(jarFile, inner);
				ZipInputStream zipInputStream = new ZipInputStream(input);
				result = Utilities.getEntryAsInputStream(zipInputStream, entryPath);
			} else {
				ZipEntry entry = jarFile.getEntry(entryPath);
				if (entry == null) {
					Debug.trace("Failed to get InputStream for " + "'" + this.getNamestring() + "'");

					Debug.assertTrue(false);
				}
				try {
					result = jarFile.getInputStream(entry);
				} catch (IOException e) {
					Debug.trace("Failed to get InputStream from " + "'" + this.getNamestring() + "'" + ": " + e);
				}
			}
		} else {
			File file = Utilities.getFile(this);
			try {
				result = new FileInputStream(file);
			} catch (IOException e) {
				Debug.trace("Failed to get InputStream for read from " + "'" + this.getNamestring() + "'" + ": " + e);
			}
		}
		return result;
	}

	/**
	 * @return Time in milliseconds since the UNIX epoch at which the resource
	 *         was last modified, or 0 if the time is unknown.
	 */
	public long getLastModified() {
		if (!(this.device instanceof SubLCons)) {
			File f = Utilities.getFile(this);
			return f.lastModified();
		}
		// JAR cases
		// 0. JAR from URL
		// 1. JAR
		// 2. JAR in JAR
		// 3. Entry in JAR
		// 4. Entry in JAR in JAR
		String entryPath = this.asEntryPath();
		SubLCons d = (SubLCons) this.device;
		if (d.rest().equals(Lisp.NIL)) {
			if (entryPath.length() == 0) {
				SubLObject o = d.first();
				if (o instanceof SubLString)
					// 0. JAR from URL
					// URL u = makeJarURL(o.getStringValue());
					// XXX unimplemented
					Debug.assertTrue(false);
				// URLConnection c = null;
				// try {
				// c = u.openConnection();
				// } catch(IOException e) {
				// Debug.trace("Failed to open Connection for URL "
				// + "'" + u + "'");
				// return 0;
				// }
				// c.getLastModified();
				else
					// 1. JAR
					return ((Pathname) o).getLastModified();
			} else {
				// 3. Entry in JAR
				ZipEntry entry = ZipCache.get(this.device.first()).getEntry(entryPath);
				if (entry == null)
					return 0;
				long time = entry.getTime();
				if (time == -1)
					return 0;
				return time;
			}
		} else {
			ZipFile outerJar = ZipCache.get(d.first());
			if (entryPath.length() == 0) {
				// 4. JAR in JAR
				String jarPath = ((Pathname) d.rest()).asEntryPath();
				ZipEntry entry = outerJar.getEntry(jarPath);
				long time = entry.getTime();
				if (time == -1)
					return 0;
				return time;
			} else {
				// 5. Entry in JAR in JAR
				String innerJarPath = ((Pathname) d.rest()).asEntryPath();
				ZipEntry entry = outerJar.getEntry(entryPath);
				ZipInputStream innerJarInputStream = Utilities.getZipInputStream(outerJar, innerJarPath);
				ZipEntry innerEntry = Utilities.getEntry(innerJarInputStream, entryPath);
				long time = innerEntry.getTime();
				if (time == -1)
					return 0;
				return time;
			}
		}
		return 0;
	}

	public String getNamestring() {
		if (this.namestring != null)
			return this.namestring;
		if (this.name == Lisp.NIL && this.type != Lisp.NIL) {
			Debug.assertTrue(this.namestring == null);
			return null;
		}
		if (this.directory instanceof SubLString)
			Debug.assertTrue(false);
		StringBuilder sb = new StringBuilder();
		// "If a pathname is converted to a namestring, the symbols NIL and
		// :UNSPECIFIC cause the field to be treated as if it were empty. That
		// is, both NIL and :UNSPECIFIC cause the component not to appear in
		// the namestring." 19.2.2.2.3.1
		if (this.host != Lisp.NIL) {
			Debug.assertTrue(this.host instanceof SubLString);
			if (!(this instanceof LogicalPathname))
				sb.append("\\\\"); // UNC file support; if there's a host, it's
									// a UNC path.
			sb.append(this.host.getString());
			if (this instanceof LogicalPathname)
				sb.append(':');
			else
				sb.append(File.separatorChar);
		}
		if (this.device == Lisp.NIL) {
		} else if (this.device == Keyword.UNSPECIFIC) {
		} else if (this.device instanceof SubLCons) {
			SubLObject[] jars = ((SubLCons) this.device).copyToArray();
			int i = 0;
			if (jars[0] instanceof SubLString) {
				sb.append("jar:");
				sb.append(((SubLString) jars[0]).getString());
				sb.append("!/");
				i = 1;
			}
			StringBuilder prefix = new StringBuilder();
			for (; i < jars.length; i++) {
				prefix.append("jar:");
				if (i == 0)
					sb.append("file:");
				if (jars[i] instanceof Pathname)
					sb.append(((Pathname) jars[i]).getNamestring());
				sb.append("!/");
			}
			sb = prefix.append(sb);
		} else if (this.device instanceof SubLString && this.device.getString().startsWith("jar:"))
			sb.append(this.device.getString());
		else if (this.device instanceof SubLString) {
			sb.append(this.device.getString());
			if (this instanceof LogicalPathname || this.host == Lisp.NIL)
				sb.append(':'); // non-UNC paths
		} else
			Debug.assertTrue(false);
		String directoryNamestring = this.getDirectoryNamestring();
		if (this.isJar()) {
			if (directoryNamestring.startsWith("/"))
				sb.append(directoryNamestring.substring(1));
			else
				sb.append(directoryNamestring);
		} else
			sb.append(directoryNamestring);
		if (this.name instanceof SubLString) {
			String n = this.name.getString();
			if (n.indexOf(File.separatorChar) >= 0) {
				Debug.assertTrue(this.namestring == null);
				return null;
			}
			sb.append(n);
		} else if (this.name == Keyword.WILD)
			sb.append('*');
		if (this.type != Lisp.NIL && this.type != Keyword.UNSPECIFIC) {
			sb.append('.');
			if (this.type instanceof SubLString) {
				String t = this.type.getString();
				if (t.indexOf('.') >= 0) {
					Debug.assertTrue(this.namestring == null);
					return null;
				}
				sb.append(t);
			} else if (this.type == Keyword.WILD)
				sb.append('*');
			else
				Debug.assertTrue(false);
		}
		if (this instanceof LogicalPathname)
			if (this.version.isInteger()) {
				sb.append('.');
				int base = LispSymbols.PRINT_BASE.symbolValue().intValue();
				if (this.version instanceof Fixnum)
					sb.append(Integer.toString(((Fixnum) this.version).value, base).toUpperCase());
				else if (this.version instanceof Bignum)
					sb.append(((Bignum) this.version).bigIntegerValue().toString(base).toUpperCase());
			} else if (this.version == Keyword.WILD)
				sb.append(".*");
			else if (this.version == Keyword.NEWEST)
				sb.append(".NEWEST");
		return this.namestring = sb.toString();
	}

	public SubLObject getParts() {
		SubLObject parts = Lisp.NIL;
		parts = parts.push(LispObjectFactory.makeCons("HOST", this.host));
		parts = parts.push(LispObjectFactory.makeCons("DEVICE", this.device));
		parts = parts.push(LispObjectFactory.makeCons("DIRECTORY", this.directory));
		parts = parts.push(LispObjectFactory.makeCons("NAME", this.name));
		parts = parts.push(LispObjectFactory.makeCons("TYPE", this.type));
		parts = parts.push(LispObjectFactory.makeCons("VERSION", this.version));
		return parts.nreverse();
	}

	private void init(String s) {
		if (s == null)
			return;
		if (s.equals(".") || s.equals("./") || Utilities.isPlatformWindows && s.equals(".\\")) {
			this.directory = LispObjectFactory.makeCons(Keyword.RELATIVE);
			return;
		}
		if (s.equals("..") || s.equals("../")) {
			this.directory = Lisp.list(Keyword.RELATIVE, Keyword.UP);
			return;
		}
		if (Utilities.isPlatformWindows)
			if (s.startsWith("\\\\")) {
				// UNC path support
				// match \\<server>\<share>\[directories-and-files]

				int shareIndex = s.indexOf('\\', 2);
				int dirIndex = s.indexOf('\\', shareIndex + 1);

				if (shareIndex == -1 || dirIndex == -1)
					Lisp.error(new LispError("Unsupported UNC path format: \"" + s + '"'));

				this.host = LispObjectFactory.makeString(s.substring(2, shareIndex));
				this.device = LispObjectFactory.makeString(s.substring(shareIndex + 1, dirIndex));

				Pathname p = new Pathname(s.substring(dirIndex));
				this.directory = p.directory;
				this.name = p.name;
				this.type = p.type;
				this.version = p.version;
				return;
			}

		// A JAR file
		if (s.startsWith("jar:") && s.endsWith(Pathname.jarSeparator)) {
			SubLObject jars = Lisp.NIL;
			int i = s.lastIndexOf(Pathname.jarSeparator, s.length() - Pathname.jarSeparator.length() - 1);
			String jar = null;
			if (i == -1)
				jar = s;
			else {
				// There can be no more than two jar references and the
				// inner one must be a file reference within the outer.
				jar = "jar:file:" + s.substring(i + Pathname.jarSeparator.length());
				s = s.substring("jar:".length(), i + Pathname.jarSeparator.length());
				Pathname p = new Pathname(s);
				SubLObject first = ((SubLCons) p.device).first();
				if (first instanceof SubLString)
					jars = jars.push(first);
				else
					jars = jars.push(p.device.first());
			}
			if (jar.startsWith("jar:file:")) {
				String jarString = jar.substring("jar:".length(), jar.length() - Pathname.jarSeparator.length());
				// Use URL constructor to normalize Windows' use of device
				URL url = null;
				try {
					url = new URL(jarString);
				} catch (MalformedURLException e) {
					Lisp.error(new LispError("Failed to parse '" + jarString + "'" + " as URL:" + e.getMessage()));
				}
				Pathname jarPathname = new Pathname(url);
				if (jarString.endsWith(Pathname.jarSeparator))
					jars = jars.push(jarPathname.device);
				else
					jars = jars.push(jarPathname);
			} else {
				URL url = null;
				try {
					url = new URL(jar.substring("jar:".length(), jar.length() - 2));
					jars = jars.push(LispObjectFactory.makeString(url.toString()));
				} catch (MalformedURLException e) {
					Lisp.error(new LispError("Failed to parse url '" + url + "'" + e.getMessage()));
				}
			}
			jars = jars.nreverse();
			this.device = jars;
			return;
		}

		// An entry in a JAR file
		int separatorIndex = s.lastIndexOf(Pathname.jarSeparator);
		if (separatorIndex > 0 && s.startsWith("jar:")) {
			String jarURL = s.substring(0, separatorIndex + Pathname.jarSeparator.length());
			Pathname d = new Pathname(jarURL);
			if (this.device instanceof SubLCons) {
				SubLObject[] jars = d.copyToArray();
				// XXX Is this ever reached? If so, need to append lists
				Debug.assertTrue(false);
			} else
				this.device = d.device;
			s = "/" + s.substring(separatorIndex + Pathname.jarSeparator.length());
			Pathname p = new Pathname(s);
			this.directory = p.directory;
			this.name = p.name;
			this.type = p.type;
			this.version = p.version;
			return;
		}

		if (Utilities.isPlatformWindows)
			if (!s.contains(Pathname.jarSeparator))
				s = s.replace("/", "\\");
			else {
				StringBuilder result = new StringBuilder();
				for (int i = 0; i < s.length(); i++) {
					char c = s.charAt(i);
					if (c != '/')
						result.append(c);
					else if (i != 0 && s.charAt(i - 1) != '!')
						result.append("\\");
					else
						result.append(c);
				}
				s = result.toString();
			}

		// Expand user home directories
		if (Utilities.isPlatformUnix)
			if (s.equals("~"))
				s = System.getProperty("user.home").concat("/");
			else if (s.startsWith("~/"))
				s = System.getProperty("user.home").concat(s.substring(1));
		this.namestring = s;
		if (Utilities.isPlatformWindows)
			if (s.length() >= 2 && s.charAt(1) == ':') {
				this.device = LispObjectFactory.makeString(s.charAt(0));
				s = s.substring(2);
			}
		String d = null;
		// Find last file separator char.
		if (Utilities.isPlatformWindows)
			for (int i = s.length(); i-- > 0;) {
				char c = s.charAt(i);
				if (c == '/' || c == '\\') {
					d = s.substring(0, i + 1);
					s = s.substring(i + 1);
					break;
				}
			}
		else
			for (int i = s.length(); i-- > 0;)
				if (s.charAt(i) == '/') {
					d = s.substring(0, i + 1);
					s = s.substring(i + 1);
					break;
				}
		if (d != null) {
			if (s.equals("..")) {
				d = d.concat(s);
				s = "";
			}
			this.directory = Pathname.parseDirectory(d);
		}
		if (s.startsWith(".")
				// No TYPE can be parsed
				&& (s.indexOf(".", 1) == -1 || s.substring(s.length() - 1).equals("."))) {
			this.name = LispObjectFactory.makeString(s);
			return;
		}
		int index = s.lastIndexOf('.');
		String n = null;
		String t = null;
		if (index > 0) {
			n = s.substring(0, index);
			t = s.substring(index + 1);
		} else if (s.length() > 0)
			n = s;
		if (n != null)
			if (n.equals("*"))
				this.name = Keyword.WILD;
			else
				this.name = LispObjectFactory.makeString(n);
		if (t != null)
			if (t.equals("*"))
				this.type = Keyword.WILD;
			else
				this.type = LispObjectFactory.makeString(t);
	}

	/**
	 * The protocol for changing any instance field (i.e. 'host', 'type', etc.)
	 * is to call this method after changing the field to recompute the
	 * namestring. We could do this with setter/getters, but that choose not to
	 * in order to avoid the performance indirection penalty.
	 */
	public void invalidateNamestring() {
		this.namestring = null;
	}

	public boolean isAbsolute() {
		if (!this.directory.equals(Lisp.NIL) || !(this.directory == null))
			if (this.directory instanceof SubLCons)
				if (((SubLCons) this.directory).first().equals(Keyword.ABSOLUTE))
					return true;
		return false;
	}

	public boolean isJar() {
		if (this.device instanceof SubLCons)
			return true;
		return false;
	}

	public boolean isWild() {
		if (this.host == Keyword.WILD || this.host == Keyword.WILD_INFERIORS)
			return true;
		if (this.device == Keyword.WILD || this.device == Keyword.WILD_INFERIORS)
			return true;
		if (this.directory instanceof SubLCons) {
			if (Lisp.memq(Keyword.WILD, this.directory))
				return true;
			if (Lisp.memq(Keyword.WILD_INFERIORS, this.directory))
				return true;
		}
		if (this.name == Keyword.WILD || this.name == Keyword.WILD_INFERIORS)
			return true;
		if (this.type == Keyword.WILD || this.type == Keyword.WILD_INFERIORS)
			return true;
		if (this.version == Keyword.WILD || this.version == Keyword.WILD_INFERIORS)
			return true;
		return false;
	}

	public int sxhash() {
		return (this.host.sxhash() ^ this.device.sxhash() ^ this.directory.sxhash() ^ this.name.sxhash()
				^ this.type.sxhash()) & 0x7fffffff;
	}

	public String toString() {
		return this.getNamestring();
	}

	public SubLObject typeOf() {
		return LispSymbols.PATHNAME;
	}

	public SubLObject typep(SubLObject type) {
		if (type == LispSymbols.PATHNAME)
			return Lisp.T;
		if (type == BuiltInClass.PATHNAME)
			return Lisp.T;
		return super.typep(type);
	}

	private boolean validateDirectory(boolean signalError) {
		SubLObject temp = this.directory;
		while (temp != Lisp.NIL) {
			SubLObject first = temp.first();
			temp = temp.rest();
			if (first == Keyword.ABSOLUTE || first == Keyword.WILD_INFERIORS) {
				SubLObject second = temp.first();
				if (second == Keyword.UP || second == Keyword.BACK) {
					if (signalError) {
						StringBuilder sb = new StringBuilder();
						sb.append(first.writeToString());
						sb.append(" may not be followed immediately by ");
						sb.append(second.writeToString());
						sb.append('.');
						Lisp.error(new FileError(sb.toString(), this));
					}
					return false;
				}
			}
		}
		return true;
	}

	public String writeToString() {
		LispThread thread = LispThread.currentThread();
		boolean printReadably = LispSymbols.PRINT_READABLY.symbolValue(thread) != Lisp.NIL;
		boolean printEscape = LispSymbols.PRINT_ESCAPE.symbolValue(thread) != Lisp.NIL;
		boolean useNamestring;
		String s = null;
		s = this.getNamestring();
		if (s != null) {
			useNamestring = true;
			if (printReadably)
				// We have a namestring. Check for pathname components that
				// can't be read from the namestring.
				if (this.host != Lisp.NIL || this.version != Lisp.NIL)
				useNamestring = false;
				else if (this.name instanceof SubLString) {
				String n = this.name.getString();
				if (n.equals(".") || n.equals(".."))
				useNamestring = false;
				else if (n.indexOf(File.separatorChar) >= 0)
				useNamestring = false;
				}
		} else
			useNamestring = false;
		StringBuilder sb = new StringBuilder();
		if (useNamestring) {
			if (printReadably || printEscape)
				sb.append("#P\"");
			int limit = s.length();
			for (int i = 0; i < limit; i++) {
				char c = s.charAt(i);
				if (printReadably || printEscape)
					if (c == '\"' || c == '\\')
						sb.append('\\');
				sb.append(c);
			}
			if (printReadably || printEscape)
				sb.append('"');
		} else {
			sb.append("#P(");
			if (this.host != Lisp.NIL) {
				sb.append(":HOST ");
				sb.append(this.host.writeToString());
				sb.append(' ');
			}
			if (this.device != Lisp.NIL) {
				sb.append(":DEVICE ");
				sb.append(this.device.writeToString());
				sb.append(' ');
			}
			if (this.directory != Lisp.NIL) {
				sb.append(":DIRECTORY ");
				sb.append(this.directory.writeToString());
				sb.append(" ");
			}
			if (this.name != Lisp.NIL) {
				sb.append(":NAME ");
				sb.append(this.name.writeToString());
				sb.append(' ');
			}
			if (this.type != Lisp.NIL) {
				sb.append(":TYPE ");
				sb.append(this.type.writeToString());
				sb.append(' ');
			}
			if (this.version != Lisp.NIL) {
				sb.append(":VERSION ");
				sb.append(this.version.writeToString());
				sb.append(' ');
			}
			if (sb.charAt(sb.length() - 1) == ' ')
				sb.setLength(sb.length() - 1);
			sb.append(')');
		}
		return sb.toString();
	}
}
