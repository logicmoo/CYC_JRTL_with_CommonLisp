/*
 * StringOutputStream.java
 *
 * Copyright (C) 2002-2004 Peter Graves
 * $Id: StringOutputStream.java,v 1.10 2004-01-31 01:16:55 piso Exp $
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
        elementType = Symbol.CHARACTER;
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

    public LispClass classOf()
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

    public LispString getString()
    {
        String s = stringWriter.toString();
        stringWriter.getBuffer().setLength(0);
        return new LispString(s);
    }

    public String toString()
    {
        return unreadableString("STRING-OUTPUT-STREAM");
    }

    // ### make-string-output-stream
    // make-string-output-stream &key element-type => string-stream
    private static final Primitive MAKE_STRING_OUTPUT_STREAM =
        new Primitive("make-string-output-stream", "&key element-type")
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length > 1)
                return signal(new WrongNumberOfArgumentsException(this));
            // FIXME Ignore arg for now.
            return new StringOutputStream();
        }
    };

    // ### get-output-stream-string
    // get-output-stream-string string-output-stream => string
    private static final Primitive1 GET_OUTPUT_STREAM_STRING =
        new Primitive1("get-output-stream-string", "string-output-stream")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof StringOutputStream)
                return ((StringOutputStream)arg).getString();
            return signal(new TypeError(this, Symbol.STRING_OUTPUT_STREAM));
        }
    };
}
