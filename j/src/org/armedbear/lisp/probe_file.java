/*
 * probe_file.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: probe_file.java,v 1.6 2003-09-25 13:17:54 piso Exp $
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
    private static final Primitive1 PROBE_FILE = new Primitive1("probe-file") {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            File file = getFile(arg);
            if (!file.exists())
                return NIL;
            try {
                return new LispString(file.getCanonicalPath());
            }
            catch (IOException e) {
                throw new ConditionThrowable(new LispError(e.getMessage()));
            }
        }
    };

    // ### probe-directory
    // probe-directory pathspec => truename
    private static final Primitive1 PROBE_DIRECTORY =
        new Primitive1("probe-directory", PACKAGE_EXT, true)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            File file = getFile(arg);
            if (!file.isDirectory())
                return NIL;
            try {
                return new LispString(file.getCanonicalPath());
            }
            catch (IOException e) {
                throw new ConditionThrowable(new LispError(e.getMessage()));
            }
        }
    };

    // ### file-directory-p
    // file-directory-p pathspec => generalized-boolean
    private static final Primitive1 FILE_DIRECTORY_P =
        new Primitive1("file-directory-p", PACKAGE_EXT, true)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            File file = getFile(arg);
            return file.isDirectory() ? T : NIL;
        }
    };

    private static File getFile(LispObject pathspec) throws ConditionThrowable
    {
        String namestring;
        if (pathspec instanceof LispString)
            namestring = ((LispString)pathspec).getValue();
        else if (pathspec instanceof Pathname)
            namestring = ((Pathname)pathspec).getNamestring();
        else
            throw new ConditionThrowable(new TypeError(pathspec,
                                                       "pathname designator"));
        if (isNamestringAbsolute(namestring))
            return new File(namestring);
        return new File(
            LispString.getValue(_DEFAULT_PATHNAME_DEFAULTS_.symbolValue()),
            namestring);
    }

    private static boolean isNamestringAbsolute(String namestring)
    {
        if (System.getProperty("os.name").startsWith("Windows")) {
            if (namestring.length() >= 3) {
                if (namestring.charAt(1) == ':')
                    if (namestring.charAt(2) == '\\')
                        return true;
            }
        } else if (namestring.length() > 0) {
            if (namestring.charAt(0) == '/')
                return true;
        }
        return false;
    }
}
