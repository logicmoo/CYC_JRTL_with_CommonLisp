/*
 * delete_file.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: delete_file.java,v 1.3 2004-01-05 16:32:32 piso Exp $
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

public final class delete_file extends Primitive1
{
    private delete_file()
    {
        super("delete-file","filespec");
    }

    // ### delete-file
    // delete-file filespec => t
    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
        Pathname pathname = Pathname.coerceToPathname(arg);
        Utilities.getFile(pathname).delete();
        return T;
    }

    private static final delete_file DELETE_FILE = new delete_file();
}
