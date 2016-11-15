/*
 * probe_file.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: probe_file.java 12290 2009-11-30 22:28:50Z vvoutilainen $
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

import java.io.File;
import java.io.IOException;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;

public class FilesystemFunctions {

	private static class _make_logical_pathname extends JavaPrimitive {
		_make_logical_pathname() {
			super("%make-logical-pathname", Lisp.PACKAGE_SYS, true, "namestring");
		}

		public SubLObject execute(SubLObject arg)

		{
			// Check for a logical pathname host.
			String s = arg.getString();
			String h = Pathname.getHostString(s);
			if (h != null) {
				if (h.length() == 0)
					// "The null string, "", is not a valid value for any
					// component of a logical pathname." 19.3.2.2
					return Lisp.error(new LispError("Invalid logical host name: \"" + h + '"'));
				if (Pathname.LOGICAL_PATHNAME_TRANSLATIONS.getHT(LispObjectFactory.makeString(h)) != null)
					// A defined logical pathname host.
					return new LogicalPathname(h, s.substring(s.indexOf(':') + 1));
			}
			return Lisp.error(new TypeError("Logical namestring does not specify a host: \"" + s + '"'));
		}
	}

	private static class canonicalize_logical_host extends JavaPrimitive {
		canonicalize_logical_host() {
			super("canonicalize-logical-host", Lisp.PACKAGE_SYS, true, "host");
		}

		public SubLObject execute(SubLObject arg) {
			SubLString s = Lisp.checkString(arg);
			if (s.cl_length() == 0)
				// "The null string, "", is not a valid value for any
				// component of a logical pathname." 19.3.2.2
				return Lisp.error(new LispError("Invalid logical host name: \"" + s.getString() + '"'));
			return LogicalPathname.canonicalizeStringComponent(s);
		}
	}

	// ### create-new-file
	static public class create_new_file extends JavaPrimitive {
		protected create_new_file() {
			super("create-new-file", Lisp.PACKAGE_SYS, true, "namestring");
		}

		public SubLObject execute(SubLObject arg) {
			String namestring = arg.getString();
			try {
				return new File(namestring).createNewFile() ? Lisp.T : Lisp.NIL;
			} catch (IOException e) {
				return Lisp.error(new StreamError(null, e));
			}
		}

	}

	static public class delete_file extends JavaPrimitive {
		protected delete_file() {
			super("delete-file", "filespec");
		}

		// ### delete-file filespec => t

		public SubLObject execute(SubLObject arg) {
			// Don't follow symlinks! We want to delete the symlink itself, not
			// the linked-to file.
			Pathname pathname = Lisp.coerceToPathname(arg);
			if (arg instanceof LispStream)
				((LispStream) arg)._close();
			if (pathname instanceof LogicalPathname)
				pathname = LogicalPathname.translateLogicalPathname((LogicalPathname) pathname);
			if (pathname.isWild())
				return Lisp.error(new FileError("Bad place for a wild pathname.", pathname));
			Pathname defaultedPathname = Pathname.mergePathnames(pathname,
					Lisp.coerceToPathname(LispSymbols.DEFAULT_PATHNAME_DEFAULTS.symbolValue()), Lisp.NIL);
			String namestring = defaultedPathname.getNamestring();
			if (namestring == null)
				return Lisp.error(new FileError("Pathname has no namestring: " + defaultedPathname.writeToString(),
						defaultedPathname));
			File file = new File(namestring);
			ZipCache.remove(file);
			if (file.exists()) {
				// File exists.
				for (int i = 0; i < 5; i++) {
					if (file.delete())
						return Lisp.T;
					System.gc();
					Thread.yield();
				}
				Pathname truename = new Pathname(file.getAbsolutePath());
				StringBuilder sb = new StringBuilder("Unable to delete ");
				sb.append(file.isDirectory() ? "directory " : "file ");
				sb.append(truename.writeToString());
				sb.append('.');
				return Lisp.error(new FileError(sb.toString(), truename));
			} else
				// File does not exist.
				return Lisp.T;
		}

	}

	// ### file-author
	static public class file_author extends JavaPrimitive {
		protected file_author() {
			super("file-author");
		}

		public SubLObject execute(SubLObject arg) {
			Pathname pathname = Lisp.coerceToPathname(arg);
			if (pathname.isWild())
				Lisp.error(new FileError("Bad place for a wild pathname.", pathname));
			return Lisp.NIL;
		}

	}

	// ### file-error-pathname
	static public class file_error_pathname extends JavaPrimitive {
		protected file_error_pathname() {
			super("file-error-pathname");
		}

		public SubLObject execute(SubLObject arg) {
			return arg instanceof FileError ? ((FileError) arg).getPathname() : Lisp.NIL;
		}

	}

	static public class file_length extends JavaPrimitive {
		protected file_length() {
			super("file-length", "stream");
		}

		// ### file-length
		// file-length stream => length

		public SubLObject execute(SubLObject arg) {
			return Lisp.checkStream(arg).fileLength();
		}

	}

	// ### file-string-length
	static public class file_string_length extends JavaPrimitive {
		protected file_string_length() {
			super("file-string-length", "stream object");
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			return Lisp.checkStream(first).fileStringLength(second);
		}

	}

	// ### file-write-date
	static public class file_write_date extends JavaPrimitive {
		protected file_write_date() {
			super("file-write-date");
		}

		public SubLObject execute(SubLObject arg) {
			Pathname pathname = Lisp.coerceToPathname(arg);
			if (pathname.isWild())
				Lisp.error(new FileError("Bad place for a wild pathname.", pathname));
			long lastModified = pathname.getLastModified();
			if (lastModified == 0)
				return Lisp.NIL;
			return Lisp.number(lastModified / 1000 + 2208988800L);
		}

	}

	// ### canonicalize-logical-host host => canonical-host
	private static Primitive CANONICALIZE_LOGICAL_HOST = new canonicalize_logical_host();

	// ### %make-logical-pathname namestring => logical-pathname
	private static Primitive _MAKE_LOGICAL_PATHNAME = new _make_logical_pathname();

	// ### probe-file
	// probe-file pathspec => truename
	private static Primitive PROBE_FILE = new JavaPrimitive("probe-file", "pathspec") {

		public SubLObject execute(SubLObject arg) {
			return Pathname.truename(arg, false);
		}
	};

	// ### truename
	// truename filespec => truename
	private static Primitive TRUENAME = new JavaPrimitive("truename", "filespec") {

		public SubLObject execute(SubLObject arg) {
			return Pathname.truename(arg, true);
		}
	};

	// ### probe-directory
	// probe-directory pathspec => truename
	private static Primitive PROBE_DIRECTORY = new JavaPrimitive("probe-directory", Lisp.PACKAGE_EXT, true) {

		public SubLObject execute(SubLObject arg) {
			Pathname pathname = Lisp.coerceToPathname(arg);
			if (pathname.isWild())
				Lisp.error(new FileError("Bad place for a wild pathname.", pathname));
			File file = Utilities.getFile(pathname);
			return file.isDirectory() ? Utilities.getDirectoryPathname(file) : Lisp.NIL;
		}
	};

	// ### file-directory-p
	// file-directory-p pathspec => generalized-boolean
	private static Primitive FILE_DIRECTORY_P = new JavaPrimitive("file-directory-p", Lisp.PACKAGE_EXT, true) {

		public SubLObject execute(SubLObject arg) {
			Pathname pathname = Lisp.coerceToPathname(arg);
			if (pathname.isWild())
				Lisp.error(new FileError("Bad place for a wild pathname.", pathname));
			File file = Utilities.getFile(pathname);
			return file.isDirectory() ? Lisp.T : Lisp.NIL;
		}
	};

	private static Primitive CREATE_NEW_FILE = new create_new_file();

	private static Primitive DELETE_FILE = new delete_file();

	private static Primitive FILE_AUTHOR = new file_author();

	private static file_error_pathname FILE_ERROR_PATHNAME = new file_error_pathname();

	private static Primitive FILE_LENGTH = new file_length();

	private static Primitive FILE_STRING_LENGTH = new file_string_length();

	private static Primitive FILE_WRITE_DATE = new file_write_date();

}
