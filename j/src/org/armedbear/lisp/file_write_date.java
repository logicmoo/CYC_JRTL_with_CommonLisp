/*
 * file_write_date.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: file_write_date.java,v 1.2 2004-01-07 19:02:06 piso Exp $
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

// ### file-write-date
public final class file_write_date extends Primitive1
{
    private file_write_date()
    {
        super("file-write-date");
    }

    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
        Pathname pathname = Pathname.coerceToPathname(arg);
        if (pathname.isWild())
            signal(new FileError("Bad place for a wild pathname."));
        File file = Utilities.getFile(pathname);
        long lastModified = file.lastModified();
        if (lastModified == 0)
            return NIL;
        return number(lastModified / 1000 + 2208988800L);
    }

    private static final Primitive1 FILE_WRITE_DATE = new file_write_date();
}
