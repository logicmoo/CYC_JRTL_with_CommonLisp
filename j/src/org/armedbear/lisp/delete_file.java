/*
 * delete_file.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: delete_file.java,v 1.4 2004-05-13 01:51:11 piso Exp $
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

public final class delete_file extends Primitive1
{
    private delete_file()
    {
        super("delete-file", "filespec");
    }

    // ### delete-file filespec => t
    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
        LispObject truename = Pathname.truename(arg, false);
        if (arg instanceof Stream)
            ((Stream)arg)._close();
        if (truename instanceof Pathname) {
            // File exists.
            File file = Utilities.getFile((Pathname)truename);
            if (file.delete()) {
                return T;
            } else {
                StringBuffer sb = new StringBuffer("Unable to delete ");
                sb.append(file.isDirectory() ? "directory " : "file ");
                sb.append(truename.writeToString());
                sb.append('.');
                return signal(new FileError(sb.toString()));
            }
        } else {
            // File does not exist.
            return T;
        }
    }

    private static final Primitive1 DELETE_FILE = new delete_file();
}
