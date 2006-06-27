/*
 * SlimeOutputStream.java
 *
 * Copyright (C) 2004-2005 Andras Simon, Peter Graves
 * $Id: SlimeOutputStream.java,v 1.10 2006-06-27 19:41:03 asimon Exp $
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

public final class SlimeOutputStream extends Stream
{
    private final StringWriter stringWriter;
    final Function f;

    private SlimeOutputStream(Function f)
    {
        this.elementType = Symbol.CHARACTER;
        isInputStream = false;
        isOutputStream = true;
        isCharacterStream = true;
        isBinaryStream = false;
        setWriter(stringWriter = new StringWriter());
        this.f = f;
    }

    public LispObject typeOf()
    {
        return Symbol.SLIME_OUTPUT_STREAM;
    }

    public LispObject classOf()
    {
        return BuiltInClass.SLIME_OUTPUT_STREAM;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.SLIME_OUTPUT_STREAM)
            return T;
        if (type == Symbol.STRING_STREAM)
            return T;
        if (type == BuiltInClass.SLIME_OUTPUT_STREAM)
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
        signal(new TypeError("Attempt to write to a string output stream of element type NIL."));
    }

    protected long _getFilePosition() throws ConditionThrowable
    {
        if (elementType == NIL)
            return 0;
        return stringWriter.toString().length();
    }

    public void _finishOutput() throws ConditionThrowable
    {
        super._finishOutput ();
        if (stringWriter.getBuffer().length() > 0) {
            String s = stringWriter.toString();
            stringWriter.getBuffer().setLength(0);
            LispThread.currentThread().execute(f, new SimpleString(s));
        }
    }

    public String toString()
    {
        return unreadableString("SLIME-OUTPUT-STREAM");
    }

    // ### %make-slime-output-stream
    // %make-slime-output-stream function => stream
    private static final Primitive MAKE_SLIME_OUTPUT_STREAM =
        new Primitive("make-slime-output-stream", PACKAGE_EXT, true, "function")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            final Function fun;
            if (arg instanceof Symbol)
                fun = (Function)arg.getSymbolFunction();
            else
                fun = (Function)arg;
            return new SlimeOutputStream(fun);
        }
    };
}
