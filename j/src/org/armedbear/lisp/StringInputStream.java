/*
 * StringInputStream.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: StringInputStream.java,v 1.13 2004-01-31 13:43:09 piso Exp $
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

public final class StringInputStream extends Stream
{
    final String s;
    final int start;
    final int end;

    public StringInputStream(String s)
    {
        this(s, 0, s.length());
    }

    public StringInputStream(String s, int start)
    {
        this(s, start, s.length());
    }

    public StringInputStream(String s, int start, int end)
    {
        elementType = Symbol.CHARACTER;
        isInputStream = true;
        isOutputStream = false;
        isCharacterStream = true;
        isBinaryStream = false;
        this.s = s;
        this.start = start;
        this.end = end;
        offset = start;
    }

    public LispObject typeOf()
    {
        return Symbol.STRING_INPUT_STREAM;
    }

    public LispClass classOf()
    {
        return BuiltInClass.STRING_INPUT_STREAM;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.STRING_INPUT_STREAM)
            return T;
        if (type == Symbol.STRING_STREAM)
            return T;
        if (type == BuiltInClass.STRING_INPUT_STREAM)
            return T;
        if (type == BuiltInClass.STRING_STREAM)
            return T;
        return super.typep(type);
    }

    public LispObject close(LispObject abort) throws ConditionThrowable
    {
        setOpen(false);
        return T;
    }

    public LispObject listen()
    {
        return offset < end ? T : NIL;
    }

    protected int _readChar()
    {
        if (offset >= end)
            return -1;
        int n = s.charAt(offset);
        ++offset;
        if (n == '\n')
            ++lineNumber;
        return n;
    }

    protected void _unreadChar(int n)
    {
        if (offset > start) {
            --offset;
            if (n == '\n')
                --lineNumber;
        }
    }

    protected boolean _charReady()
    {
        return true;
    }

    public String toString()
    {
        return unreadableString("STRING-INPUT-STREAM");
    }

    // ### make-string-input-stream
    // make-string-input-stream string &optional start end => string-stream
    private static final Primitive MAKE_STRING_INPUT_STREAM =
        new Primitive("make-string-input-stream","string &optional start end")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return new StringInputStream(LispString.getValue(arg));
        }
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            String s = LispString.getValue(first);
            int start = Fixnum.getValue(second);
            return new StringInputStream(s.substring(start));
        }
        public LispObject execute(LispObject first, LispObject second,
                                  LispObject third)
            throws ConditionThrowable
        {
            String s = LispString.getValue(first);
            int start = Fixnum.getValue(second);
            if (third == NIL)
                return new StringInputStream(s.substring(start));
            int end = Fixnum.getValue(third);
            return new StringInputStream(s.substring(start, end));
        }
    };

    private static final Primitive1 STRING_INPUT_STREAM_CURRENT =
        new Primitive1("string-input-stream-current", PACKAGE_EXT, true, "stream")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof StringInputStream)
                return new Fixnum(((StringInputStream)arg).getOffset());
            return signal(new TypeError(String.valueOf(arg) +
                                        " is not a string input stream."));
        }
    };
}
