/*
 * read_char_no_hang.java
 *
 * Copyright (C) 2004-2005 Peter Graves
 * $Id: read_char_no_hang.java,v 1.5 2007-02-23 21:17:36 piso Exp $
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

// ### read-char-no-hang &optional input-stream eof-error-p eof-value
// recursive-p => char
public final class read_char_no_hang extends Primitive
{
    private read_char_no_hang()
    {
        super("read-char-no-hang",
              "&optional input-stream eof-error-p eof-value recursive-p");
    }

    public LispObject execute(LispObject[] args) throws ConditionThrowable
    {
        int length = args.length;
        if (length > 4)
            error(new WrongNumberOfArgumentsException(this));
        Stream stream =
            length > 0 ? inSynonymOf(args[0]) : getStandardInput();
        boolean eofError = length > 1 ? (args[1] != NIL) : true;
        LispObject eofValue = length > 2 ? args[2] : NIL;
        // recursive-p is ignored
        // boolean recursive = length > 3 ? (args[3] != NIL) : false;
        return stream.readCharNoHang(eofError, eofValue);
    }

    private static final Primitive READ_CHAR_NO_HANG = new read_char_no_hang();
}
