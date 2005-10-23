/*
 * file_author.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: file_author.java,v 1.4 2005-10-23 16:22:15 piso Exp $
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

// ### file-author
public final class file_author extends Primitive
{
    private file_author()
    {
        super("file-author");
    }

    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
        Pathname pathname = coerceToPathname(arg);
        if (pathname.isWild())
            signal(new FileError("Bad place for a wild pathname.", pathname));
        return NIL;
    }

    private static final Primitive FILE_AUTHOR = new file_author();
}
