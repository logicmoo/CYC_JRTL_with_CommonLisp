/*
 * StringOutputStream.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: StringOutputStream.java,v 1.1 2003-01-17 19:43:29 piso Exp $
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

import java.io.StringWriter;

public final class StringOutputStream extends CharacterOutputStream
{
    private final StringWriter stringWriter;

    public StringOutputStream()
    {
        super();
        setWriter(stringWriter = new StringWriter());
    }

    public LispString getString()
    {
        String s = stringWriter.toString();
        stringWriter.getBuffer().setLength(0);
        return new LispString(s);
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("#<STRING-OUTPUT-STREAM ");
        sb.append(super.toString());
        sb.append('>');
        return sb.toString();
    }
}
