/*
 * file_error_pathname.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: file_error_pathname.java,v 1.1 2004-01-02 19:03:01 piso Exp $
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

// ### file-error-pathname
public final class file_error_pathname extends Primitive1
{
    private file_error_pathname()
    {
        super("file-error-pathname");
    }

    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
        return arg instanceof FileError ? ((FileError)arg).getPathname() : NIL;
    }

    private static final file_error_pathname FILE_ERROR_PATHNAME =
        new file_error_pathname();
}
