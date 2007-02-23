/*
 * CaseFrobStream.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: CaseFrobStream.java,v 1.7 2007-02-23 21:17:32 piso Exp $
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

public abstract class CaseFrobStream extends Stream
{
    protected final Stream target;

    protected CaseFrobStream(Stream target)
        throws ConditionThrowable
    {
        Debug.assertTrue(target.isCharacterOutputStream());
        this.target = target;
    }

    public LispObject getElementType() throws ConditionThrowable
    {
        return target.getElementType();
    }

    public LispObject typeOf()
    {
        return Symbol.CASE_FROB_STREAM;
    }

    public LispObject classOf()
    {
        return BuiltInClass.CASE_FROB_STREAM;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.CASE_FROB_STREAM)
            return T;
        if (type == BuiltInClass.CASE_FROB_STREAM)
            return T;
        return super.typep(type);
    }

    public boolean isInputStream()
    {
        return false;
    }

    public boolean isOutputStream()
    {
        return true;
    }

    public boolean isCharacterInputStream() throws ConditionThrowable
    {
        return false;
    }

    public boolean isBinaryInputStream() throws ConditionThrowable
    {
        return false;
    }

    public boolean isCharacterOutputStream() throws ConditionThrowable
    {
        return true;
    }

    public boolean isBinaryOutputStream() throws ConditionThrowable
    {
        return false;
    }

    public int getCharPos()
    {
        return target.getCharPos();
    }

    public void setCharPos(int n)
    {
        target.setCharPos(n);
    }

    // Returns -1 at end of file.
    protected int _readChar() throws ConditionThrowable
    {
        notSupported();
        // Not reached.
        return -1;
    }

    protected void _unreadChar(int n) throws ConditionThrowable
    {
        notSupported();
    }

    protected boolean _charReady() throws ConditionThrowable
    {
        notSupported();
        // Not reached.
        return false;
    }

    public void _writeChars(char[] chars, int start, int end)
        throws ConditionThrowable
    {
        _writeString(new String(chars, start, end));
    }

    // Reads an 8-bit byte.
    public int _readByte() throws ConditionThrowable
    {
        notSupported();
        // Not reached.
        return -1;
    }

    // Writes an 8-bit byte.
    public void _writeByte(int n) throws ConditionThrowable
    {
        notSupported();
    }

    public void _finishOutput() throws ConditionThrowable
    {
        target._finishOutput();
    }

    public void _clearInput() throws ConditionThrowable
    {
        notSupported();
    }

    public LispObject close(LispObject abort) throws ConditionThrowable
    {
        setOpen(false);
        return T;
    }

    public LispObject listen() throws ConditionThrowable
    {
        notSupported();
        // Not reached.
        return NIL;
    }

    public LispObject terpri() throws ConditionThrowable
    {
        return target.terpri();
    }

    public LispObject freshLine() throws ConditionThrowable
    {
        return target.freshLine();
    }

    public String writeToString()
    {
        return unreadableString("CASE-FROB-STREAM");
    }

    private void notSupported() throws ConditionThrowable
    {
        error(new TypeError("Operation is not supported for streams of type CASE-FROB-STREAM."));
    }

    // ### make-case-frob-stream target => case-frob-stream
    private static final Primitive MAKE_CASE_FROB_STREAM =
        new Primitive("make-case-frob-stream", PACKAGE_SYS, false, "target kind")
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            Stream target = checkCharacterOutputStream(first);
            if (second == Keyword.UPCASE)
                return new UpcaseStream(target);
            if (second == Keyword.DOWNCASE)
                return new DowncaseStream(target);
            if (second == Keyword.CAPITALIZE)
                return new CapitalizeStream(target);
            if (second == Keyword.CAPITALIZE_FIRST)
                return new CapitalizeFirstStream(target);
            return error(new TypeError(
                "Kind must be :UPCASE, :DOWNCASE, :CAPITALIZE or :CAPITALIZE-FIRST."));
        }
    };
}
