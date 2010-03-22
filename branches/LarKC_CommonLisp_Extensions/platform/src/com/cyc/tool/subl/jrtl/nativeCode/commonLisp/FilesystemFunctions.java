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

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;

import java.io.File;
import java.io.IOException;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;


public final class FilesystemFunctions
{

  // ### canonicalize-logical-host host => canonical-host
  private static final Primitive CANONICALIZE_LOGICAL_HOST = new canonicalize_logical_host();
  private static class canonicalize_logical_host extends JavaPrimitive {
      canonicalize_logical_host() {
          super("canonicalize-logical-host", PACKAGE_SYS, true, "host");
      }
      @Override
      public SubLObject execute(SubLObject arg)
      {
          SubLString s = checkString(arg);
          if (s.cl_length() == 0) {
              // "The null string, "", is not a valid value for any
              // component of a logical pathname." 19.3.2.2
              return error(new LispError("Invalid logical host name: \"" +
                                         s.getString() + '"'));
          }
          return LogicalPathname.canonicalizeStringComponent(s);
      }
  }

  // ### %make-logical-pathname namestring => logical-pathname
  private static final Primitive _MAKE_LOGICAL_PATHNAME = new _make_logical_pathname();
  private static class _make_logical_pathname extends JavaPrimitive {
      _make_logical_pathname() {
          super("%make-logical-pathname", PACKAGE_SYS, true, "namestring");
      }
      @Override
      public SubLObject execute(SubLObject arg)

      {
          // Check for a logical pathname host.
          String s = arg.getString();
          String h = LogicalPathname.getHostString(s);
          if (h != null) {
              if (h.length() == 0) {
                  // "The null string, "", is not a valid value for any
                  // component of a logical pathname." 19.3.2.2
                  return error(new LispError("Invalid logical host name: \"" +
                                              h + '"'));
              }
              if (Pathname.LOGICAL_PATHNAME_TRANSLATIONS.getHT(makeString(h)) != null) {
                  // A defined logical pathname host.
                  return new LogicalPathname(h, s.substring(s.indexOf(':') + 1));
              }
          }
          return error(new TypeError("Logical namestring does not specify a host: \"" + s + '"'));
      }
  }
    // ### probe-file
    // probe-file pathspec => truename
    private static final Primitive PROBE_FILE =
        new JavaPrimitive("probe-file", "pathspec")
    {
        @Override
        public SubLObject execute(SubLObject arg)
        {
            return Pathname.truename(arg, false);
        }
    };

    // ### truename
    // truename filespec => truename
    private static final Primitive TRUENAME =
        new JavaPrimitive("truename", "filespec")
    {
        @Override
        public SubLObject execute(SubLObject arg)
        {
            return Pathname.truename(arg, true);
        }
    };

    // ### probe-directory
    // probe-directory pathspec => truename
    private static final Primitive PROBE_DIRECTORY =
        new JavaPrimitive("probe-directory", PACKAGE_EXT, true)
    {
        @Override
        public SubLObject execute(SubLObject arg)
        {
            Pathname pathname = coerceToPathname(arg);
            if (pathname.isWild())
                error(new FileError("Bad place for a wild pathname.", pathname));
            File file = Utilities.getFile(pathname);
            return file.isDirectory() ? Utilities.getDirectoryPathname(file) : NIL;
        }
    };

    // ### file-directory-p
    // file-directory-p pathspec => generalized-boolean
    private static final Primitive FILE_DIRECTORY_P =
        new JavaPrimitive("file-directory-p", PACKAGE_EXT, true)
    {
        @Override
        public SubLObject execute(SubLObject arg)
        {
            Pathname pathname = coerceToPathname(arg);
            if (pathname.isWild())
                error(new FileError("Bad place for a wild pathname.", pathname));
            File file = Utilities.getFile(pathname);
            return file.isDirectory() ? T : NIL;
        }
    };
    

    // ### create-new-file
    static public final class create_new_file extends JavaPrimitive {
    	protected create_new_file() {
        super("create-new-file", PACKAGE_SYS, true, "namestring");
      }

      @Override
      public SubLObject execute(SubLObject arg) {
        final String namestring = arg.getString();
        try {
          return new File(namestring).createNewFile() ? T : NIL;
        } catch (IOException e) {
          return error(new StreamError(null, e));
        }
      }

    }

    private static final Primitive CREATE_NEW_FILE = new create_new_file();

    static public final class delete_file extends JavaPrimitive {
    	protected delete_file() {
        super("delete-file", "filespec");
      }

      // ### delete-file filespec => t
      @Override
      public SubLObject execute(SubLObject arg) {
        // Don't follow symlinks! We want to delete the symlink itself, not
        // the linked-to file.
        Pathname pathname = coerceToPathname(arg);
        if (arg instanceof LispStream)
          ((LispStream) arg)._close();
        if (pathname instanceof LogicalPathname)
          pathname = LogicalPathname.translateLogicalPathname((LogicalPathname) pathname);
        if (pathname.isWild())
          return error(new FileError("Bad place for a wild pathname.", pathname));
        final Pathname defaultedPathname = Pathname.mergePathnames(pathname,
            coerceToPathname(LispSymbols.DEFAULT_PATHNAME_DEFAULTS.symbolValue()), NIL);
        final String namestring = defaultedPathname.getNamestring();
        if (namestring == null)
          return error(new FileError("Pathname has no namestring: " + defaultedPathname.writeToString(),
              defaultedPathname));
        final File file = new File(namestring);
        ZipCache.remove(file);
        if (file.exists()) {
          // File exists.
          for (int i = 0; i < 5; i++) {
            if (file.delete())
              return T;
            System.gc();
            Thread.yield();
          }
          Pathname truename = new Pathname(file.getAbsolutePath());
          StringBuilder sb = new StringBuilder("Unable to delete ");
          sb.append(file.isDirectory() ? "directory " : "file ");
          sb.append(truename.writeToString());
          sb.append('.');
          return error(new FileError(sb.toString(), truename));
        } else {
          // File does not exist.
          return T;
        }
      }

    }

    private static final Primitive DELETE_FILE = new delete_file();

    // ### file-author
    static public final class file_author extends JavaPrimitive {
    	protected file_author() {
        super("file-author");
      }

      @Override
      public SubLObject execute(SubLObject arg) {
        Pathname pathname = coerceToPathname(arg);
        if (pathname.isWild())
          error(new FileError("Bad place for a wild pathname.", pathname));
        return NIL;
      }

    }

    private static final Primitive FILE_AUTHOR = new file_author();

    // ### file-error-pathname
    static public final class file_error_pathname extends JavaPrimitive {
    	protected file_error_pathname() {
        super("file-error-pathname");
      }

      @Override
      public SubLObject execute(SubLObject arg) {
        return arg instanceof FileError ? ((FileError) arg).getPathname() : NIL;
      }

    }

    private static final file_error_pathname FILE_ERROR_PATHNAME = new file_error_pathname();

    static public final class file_length extends JavaPrimitive {
    	protected file_length() {
        super("file-length", "stream");
      }

      // ### file-length
      // file-length stream => length
      @Override
      public SubLObject execute(SubLObject arg) {
        return checkStream(arg).fileLength();
      }

    }

    private static final Primitive FILE_LENGTH = new file_length();

    // ### file-string-length
    static public final class file_string_length extends JavaPrimitive {
      protected file_string_length() {
        super("file-string-length", "stream object");
      }

      @Override
      public SubLObject execute(SubLObject first, SubLObject second)

      {
        return checkStream(first).fileStringLength(second);
      }

    }

    private static final Primitive FILE_STRING_LENGTH = new file_string_length();

    // ### file-write-date
    static public final class file_write_date extends JavaPrimitive {
    	protected file_write_date() {
        super("file-write-date");
      }

      @Override
      public SubLObject execute(SubLObject arg) {
        Pathname pathname = coerceToPathname(arg);
        if (pathname.isWild())
          error(new FileError("Bad place for a wild pathname.", pathname));
        long lastModified = pathname.getLastModified();
        if (lastModified == 0)
          return NIL;
        return number(lastModified / 1000 + 2208988800L);
      }

    }

    private static final Primitive FILE_WRITE_DATE = new file_write_date();

}
