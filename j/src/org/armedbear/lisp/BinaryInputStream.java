/*
 * BinaryInputStream.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: BinaryInputStream.java,v 1.9 2004-01-16 17:11:58 piso Exp $
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

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class BinaryInputStream extends LispInputStream
{
    private final BufferedInputStream in;

    public BinaryInputStream(InputStream inputStream)
    {
        in = new BufferedInputStream(inputStream);
    }

    public BinaryInputStream(InputStream inputStream, LispObject pathname)
    {
        this(inputStream);
        setPathname(pathname);
    }

    // read-byte stream &optional eof-error-p eof-value => byte
    public LispObject readByte(boolean eofError, LispObject eofValue)
        throws ConditionThrowable
    {
        int n;
        try {
            n = in.read();
        }
        catch (IOException e) {
            return signal(new StreamError(e));
        }
        if (n < 0) {
            if (eofError)
                return signal(new EndOfFile());
            else
                return eofValue;
        }
        return new Fixnum(n);
    }

    // Returns true if stream was open, otherwise implementation-dependent.
    public LispObject close(LispObject abort) throws ConditionThrowable
    {
        try {
            in.close();
            setOpen(false);
            return T;
        }
        catch (IOException e) {
            return signal(new StreamError(e));
        }
    }

    public String toString()
    {
        return unreadableString("STREAM [binary input]");
    }
}
