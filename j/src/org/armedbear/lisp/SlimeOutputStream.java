/*
 * SlimeOutputStream.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: SlimeOutputStream.java,v 1.3 2004-09-26 18:42:38 piso Exp $
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

    public LispClass classOf()
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
        try {
            funcall1(f, new SimpleString(stringWriter.toString()), LispThread.currentThread());
        }
        catch (Throwable t) {
        }
        super._finishOutput();
    }

    public String toString()
    {
        return unreadableString("SLIME-OUTPUT-STREAM");
    }

    // ### %make-string-output-stream
    // %make-string-output-stream element-type => string-stream
    private static final Primitive1 MAKE_SLIME_OUTPUT_STREAM =
        new Primitive1("make-slime-output-stream", PACKAGE_EXT, true, "function")
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
