/*
 * probe_file.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: probe_file.java,v 1.13 2004-01-08 17:42:02 piso Exp $
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
import java.io.IOException;

public final class probe_file extends Lisp
{
    // ### probe-file
    // probe-file pathspec => truename
    private static final Primitive1 PROBE_FILE =
        new Primitive1("probe-file", "pathspec")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return Pathname.truename(arg, false);
        }
    };

    // ### truename
    // truename filespec => truename
    private static final Primitive1 TRUENAME =
        new Primitive1("truename", "filespec")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return Pathname.truename(arg, true);
        }
    };

    // ### probe-directory
    // probe-directory pathspec => truename
    private static final Primitive1 PROBE_DIRECTORY =
        new Primitive1("probe-directory", PACKAGE_EXT, true)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            Pathname pathname = Pathname.coerceToPathname(arg);
            if (pathname.isWild())
                signal(new FileError("Bad place for a wild pathname."));
            File file = Utilities.getFile(pathname);
            return file.isDirectory() ? Utilities.getDirectoryPathname(file) : NIL;
        }
    };

    // ### file-directory-p
    // file-directory-p pathspec => generalized-boolean
    private static final Primitive1 FILE_DIRECTORY_P =
        new Primitive1("file-directory-p", PACKAGE_EXT, true)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            Pathname pathname = Pathname.coerceToPathname(arg);
            if (pathname.isWild())
                signal(new FileError("Bad place for a wild pathname."));
            File file = Utilities.getFile(pathname);
            return file.isDirectory() ? T : NIL;
        }
    };
}
