/*
 * delete_file.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: delete_file.java,v 1.9 2005-09-25 20:48:43 piso Exp $
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

public final class delete_file extends Primitive
{
    private delete_file()
    {
        super("delete-file", "filespec");
    }

    // ### delete-file filespec => t
    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
        // Don't follow symlinks! We want to delete the symlink itself, not
        // the linked-to file.
        Pathname pathname = Pathname.coerceToPathname(arg);
        if (arg instanceof Stream)
            ((Stream)arg)._close();
        if (pathname instanceof LogicalPathname)
            pathname = LogicalPathname.translateLogicalPathname((LogicalPathname)pathname);
        if (pathname.isWild())
            return signal(new FileError("Bad place for a wild pathname.",
                                        pathname));
        final Pathname defaultedPathname =
            Pathname.mergePathnames(pathname,
                                    Pathname.coerceToPathname(_DEFAULT_PATHNAME_DEFAULTS_.symbolValue()),
                                    NIL);
        final String namestring = defaultedPathname.getNamestring();
        if (namestring == null)
            return signal(new FileError("Pathname has no namestring: " + defaultedPathname.writeToString(),
                                        defaultedPathname));
        final File file = new File(namestring);
        if (file.exists()) {
            // File exists.
            for (int i = 0; i < 5; i++) {
                if (file.delete())
                    return T;
                System.gc();
                Thread.yield();
            }
            Pathname truename = new Pathname(file.getAbsolutePath());
            FastStringBuffer sb = new FastStringBuffer("Unable to delete ");
            sb.append(file.isDirectory() ? "directory " : "file ");
            sb.append(truename.writeToString());
            sb.append('.');
            return signal(new FileError(sb.toString(), truename));
        } else {
            // File does not exist.
            return T;
        }
    }

    private static final Primitive DELETE_FILE = new delete_file();
}
