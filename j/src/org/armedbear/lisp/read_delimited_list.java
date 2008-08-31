/*
 * read_delimited_list.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id$
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

// ### read-delimited-list char &optional input-stream recursive-p => list
public final class read_delimited_list extends Primitive
{
    private read_delimited_list()
    {
        super("read-delimited-list", "char &optional input-stream recursive-p");
    }

    public LispObject execute(LispObject[] args) throws ConditionThrowable
    {
        int length = args.length;
        if (length < 1 || length > 3)
            error(new WrongNumberOfArgumentsException(this));
        char c = LispCharacter.getValue(args[0]);
        Stream stream =
            length > 1 ? inSynonymOf(args[1]) : getStandardInput();
        return stream.readDelimitedList(c);
    }

    private static final Primitive READ_DELIMITED_LIST = new read_delimited_list();
}
