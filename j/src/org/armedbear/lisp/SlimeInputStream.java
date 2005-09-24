/*
 * SlimeInputStream.java
 *
 * Copyright (C) 2004 Andras Simon, Peter Graves
 * $Id: SlimeInputStream.java,v 1.5 2005-09-24 19:41:01 piso Exp $
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

public class SlimeInputStream extends Stream
{
    String s;
    int length;
    final Function f;
    final Stream ostream;

    public SlimeInputStream(Function f, Stream ostream)
    {
        elementType = Symbol.CHARACTER;
        isInputStream = true;
        isOutputStream = false;
        isCharacterStream = true;
        isBinaryStream = false;
        this.f = f;
        this.ostream = ostream;
    }

    public LispObject typeOf()
    {
        return Symbol.SLIME_INPUT_STREAM;
    }

    public LispObject classOf()
    {
        return BuiltInClass.SLIME_INPUT_STREAM;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.SLIME_INPUT_STREAM)
            return T;
        if (type == Symbol.STRING_STREAM)
            return T;
        if (type == BuiltInClass.SLIME_INPUT_STREAM)
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
        return offset < length ? T : NIL;
    }

    protected int _readChar()
    {
        if (offset >= length) {
            try {
                ostream.finishOutput();
                s = LispThread.currentThread().execute(f).getStringValue();
            }
            catch (Throwable t) {
                return -1;
            }
            if (s.length() == 0)
                return -1;
            offset = 0;
            length = s.length();
        }
        int n = s.charAt(offset);
        ++offset;
        if (n == '\n')
            ++lineNumber;
        return n;
    }

    protected void _unreadChar(int n)
    {
        if (offset > 0) {
            --offset;
            if (n == '\n')
                --lineNumber;
        }
    }

    protected boolean _charReady()
    {
        return offset < length ? true : false;
    }


    public void _clearInput() throws ConditionThrowable
    {
        super._clearInput();
        s = "";
        offset = 0;
        length = 0;
        lineNumber = 0;
    }


    public String toString()
    {
        return unreadableString("SLIME-INPUT-STREAM");
    }

    // ### make-slime-input-stream
    // make-slime-input-stream function output-stream => slime-input-stream
    private static final Primitive MAKE_SLIME_INPUT_STREAM =
        new Primitive("make-slime-input-stream", PACKAGE_EXT, true,
                      "function output-stream")
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            final Function fun;
            final Stream os;
            if (first instanceof Symbol)
                fun = (Function)first.getSymbolFunction();
            else
                fun = (Function)first;
            os = checkCharacterOutputStream(second);
            return new SlimeInputStream(fun, os);
        }
    };
}
