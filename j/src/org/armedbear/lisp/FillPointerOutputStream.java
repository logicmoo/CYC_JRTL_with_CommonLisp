/*
 * FillPointerOutputStream.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: FillPointerOutputStream.java,v 1.10 2004-05-28 18:12:41 piso Exp $
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

public final class FillPointerOutputStream extends Stream
{
    private ComplexString string;

    private FillPointerOutputStream(ComplexString string)
    {
        elementType = Symbol.CHARACTER;
        isOutputStream = true;
        isInputStream = false;
        isCharacterStream = true;
        isBinaryStream = false;
        this.string = string;
        setWriter(new Writer());
    }

    // ### make-fill-pointer-output-stream
    // make-fill-pointer-output-stream string => string-stream
    private static final Primitive1 MAKE_FILL_POINTER_OUTPUT_STREAM =
        new Primitive1("make-fill-pointer-output-stream", PACKAGE_SYS, false) {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof ComplexString) {
                ComplexString string = (ComplexString) arg;
                if (string.getFillPointer() >= 0)
                    return new FillPointerOutputStream(string);
            }
            return signal(new TypeError(arg.writeToString() +
                                        " is not a string with a fill pointer."));
        }
    };

    private class Writer extends java.io.Writer
    {
        public void write(char cbuf[], int off, int len)
        {
            int fp = string.getFillPointer();
            if (fp >= 0) {
                final int capacity = string.capacity();
                final int limit = Math.min(cbuf.length, off + len);
                for (int i = off; i < limit && fp < capacity; i++) {
                    try {
                        string.setChar(fp, cbuf[i]);
                    }
                    catch (ConditionThrowable t) {
                        // Shouldn't happen.
                        Debug.trace(t);
                    }
                    ++fp;
                }
            }
            string.setFillPointer(fp);
        }

        public void flush()
        {
        }

        public void close()
        {
        }
    }
}
