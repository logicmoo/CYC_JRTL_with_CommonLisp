/*
 * StreamError.java
 *
 * Copyright (C) 2002-2004 Peter Graves
 * $Id: StreamError.java,v 1.11 2004-03-05 16:02:23 piso Exp $
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

public class StreamError extends LispError
{
    private final LispObject stream;
    private final Throwable cause;

    public StreamError(Stream stream)
    {
        this.stream = stream != null ? stream : NIL;
        cause = null;
    }

    public StreamError(LispObject initArgs) throws ConditionThrowable
    {
        LispObject stream = NIL;
        LispObject first, second;
        while (initArgs != NIL) {
            first = initArgs.car();
            initArgs = initArgs.cdr();
            second = initArgs.car();
            initArgs = initArgs.cdr();
            if (first == Keyword.STREAM)
                stream = second;
        }
        this.stream = stream;
        cause = null;
    }

    public StreamError(Stream stream, String message)
    {
        super(message);
        this.stream = stream != null ? stream : NIL;
        cause = null;
    }

    public StreamError(Stream stream, Throwable cause)
    {
        super();
        this.stream = stream != null ? stream : NIL;
        this.cause = cause;
    }

    public LispObject typeOf()
    {
        return Symbol.STREAM_ERROR;
    }

    public LispClass classOf()
    {
        return BuiltInClass.STREAM_ERROR;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.STREAM_ERROR)
            return T;
        if (type == BuiltInClass.STREAM_ERROR)
            return T;
        return super.typep(type);
    }

    public String getMessage()
    {
        if (cause != null) {
            String message = cause.getMessage();
            if (message != null && message.length() > 0)
                return message;
        }
        return "Stream error.";
    }

    // ### stream-error-stream
    private static final Primitive1 STREAM_ERROR_STREAM =
        new Primitive1("stream-error-stream", "condition")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((StreamError)arg).stream;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.STREAM_ERROR));
            }
        }
    };
}
