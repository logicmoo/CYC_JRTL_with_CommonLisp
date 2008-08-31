/*
 * stream_external_format.java
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

// ### stream-external-format
public final class stream_external_format extends Primitive
{
    private stream_external_format()
    {
        super("stream-external-format", "stream");
    }

    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
        if (arg instanceof Stream)
            return Keyword.DEFAULT;
        else
            return error(new TypeError(arg, Symbol.STREAM));
    }

    private static final Primitive STREAM_EXTERNAL_FORMAT =
        new stream_external_format();
}
