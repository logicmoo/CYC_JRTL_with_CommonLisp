/*
 * StringOutputStream.java
 *
 * Copyright (C) 2002-2004 Peter Graves
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

import java.io.StringWriter;

public final class StringOutputStream extends Stream
{
    private final StringWriter stringWriter;

    public StringOutputStream()
    {
        this(Symbol.CHARACTER);
    }

    private StringOutputStream(LispObject elementType)
    {
        this.elementType = elementType;
        isInputStream = false;
        isOutputStream = true;
        isCharacterStream = true;
        isBinaryStream = false;
        setWriter(stringWriter = new StringWriter());
    }

    public LispObject typeOf()
    {
        return Symbol.STRING_OUTPUT_STREAM;
    }

    public LispObject classOf()
    {
        return BuiltInClass.STRING_OUTPUT_STREAM;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.STRING_OUTPUT_STREAM)
            return T;
        if (type == Symbol.STRING_STREAM)
            return T;
        if (type == BuiltInClass.STRING_OUTPUT_STREAM)
            return T;
        if (type == BuiltInClass.STRING_STREAM)
            return T;
        return super.typep(type);
    }

    public void _writeChar(char c) throws ConditionThrowable
    {
        if (elementType == NIL)
            writeError();
        super._writeChar(c);
    }

    public void _writeChars(char[] chars, int start, int end)
        throws ConditionThrowable
    {
        if (elementType == NIL)
            writeError();
        super._writeChars(chars, start, end);
    }

    public void _writeString(String s) throws ConditionThrowable
    {
        if (elementType == NIL)
            writeError();
        super._writeString(s);
    }

    public void _writeLine(String s) throws ConditionThrowable
    {
        if (elementType == NIL)
            writeError();
        super._writeLine(s);
    }

    private void writeError() throws ConditionThrowable
    {
        error(new TypeError("Attempt to write to a string output stream of element type NIL."));
    }

    protected long _getFilePosition() throws ConditionThrowable
    {
        if (elementType == NIL)
            return 0;
        return stringWriter.toString().length();
    }

    public LispObject getString() throws ConditionThrowable
    {
        if (elementType == NIL)
            return new NilVector(0);
        StringBuffer sb = stringWriter.getBuffer();
        SimpleString s = new SimpleString(sb);
        sb.setLength(0);
        return s;
    }

    public String toString()
    {
        return unreadableString("STRING-OUTPUT-STREAM");
    }

    // ### %make-string-output-stream
    // %make-string-output-stream element-type => string-stream
    private static final Primitive MAKE_STRING_OUTPUT_STREAM =
        new Primitive("%make-string-output-stream", PACKAGE_SYS, false,
                       "element-type")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return new StringOutputStream(arg);
        }
    };

    // ### get-output-stream-string
    // get-output-stream-string string-output-stream => string
    private static final Primitive GET_OUTPUT_STREAM_STRING =
        new Primitive("get-output-stream-string", "string-output-stream")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((StringOutputStream)arg).getString();
            }
            catch (ClassCastException e) {
                return error(new TypeError(this, Symbol.STRING_OUTPUT_STREAM));
            }
        }
    };
}
