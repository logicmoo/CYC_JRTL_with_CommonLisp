/*
 * file_length.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: file_length.java,v 1.1 2004-01-26 18:36:57 piso Exp $
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

public final class file_length extends Primitive1
{
    private file_length()
    {
        super("file-length", "stream");
    }

    // ### file-length
    // file-length stream => length
    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
        if (arg instanceof FileStream) {
            FileStream stream = (FileStream) arg;
            Pathname pathname = stream.getPathname();
            File file = new File(pathname.getNamestring());
            long length = file.length();
            // FIXME
            // "For a binary file, the length is measured in units of the
            // element type of the stream."
            return number(length);
        }
        return signal(new TypeError(String.valueOf(arg) +
                                    " is not a stream associated with a file."));
    }

    private static final Primitive1 FILE_LENGTH = new file_length();
}
