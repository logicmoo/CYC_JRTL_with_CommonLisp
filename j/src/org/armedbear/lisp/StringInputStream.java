/*
 * StringInputStream.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: StringInputStream.java,v 1.6 2003-12-09 20:26:23 asimon Exp $
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

public final class StringInputStream extends CharacterInputStream
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
        this.s = s;
        this.start = start;
        this.end = end;
        offset = start;
    }

    public LispClass classOf()
    {
        return BuiltInClass.STRING_STREAM;
    }

    protected int read()
    {
        if (offset >= end)
            return -1;
        int n = s.charAt(offset);
        ++offset;
        if (n == '\n')
            ++lineNumber;
        return n;
    }

    protected void unread(int n)
    {
        if (offset > start) {
            --offset;
            if (n == '\n')
                --lineNumber;
        }
    }

    protected boolean ready()
    {
        return true;
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
}
