/*
 * BinaryOutputStream.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: BinaryOutputStream.java,v 1.7 2003-12-13 00:58:50 piso Exp $
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

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class BinaryOutputStream extends LispOutputStream
{
    private final BufferedOutputStream out;

    public BinaryOutputStream(OutputStream outputStream)
    {
        out = new BufferedOutputStream(outputStream);
    }

    public void writeByte(int n) throws ConditionThrowable
    {
        try {
            out.write(n);
        }
        catch (IOException e) {
            signal(new StreamError(e));
        }
    }

    public void flushOutput() throws ConditionThrowable
    {
        try {
            out.flush();
        }
        catch (IOException e) {
            signal(new StreamError(e));
        }
    }

    // Returns true if stream was open, otherwise implementation-dependent.
    public LispObject close(LispObject abort) throws ConditionThrowable
    {
        try {
            out.close();
            return T;
        }
        catch (IOException e) {
            return signal(new StreamError(e));
        }
    }

    public String toString()
    {
        return unreadableString("STREAM [binary output]");
    }
}
