/*
 * CaseFrobStream.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: CaseFrobStream.java,v 1.1 2004-06-08 11:26:09 piso Exp $
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

public final class CaseFrobStream extends Stream
{
    private final Stream target;
    private final LispObject kind;

    public CaseFrobStream(Stream target, LispObject kind)
        throws ConditionThrowable
    {
        Debug.assertTrue(target.isCharacterStream());
        Debug.assertTrue(target.isOutputStream());
        this.target = target;
        this.kind = kind;
    }

    public LispObject getElementType() throws ConditionThrowable
    {
        return target.getElementType();
    }

    public LispObject typeOf()
    {
        return Symbol.CASE_FROB_STREAM;
    }

    public LispClass classOf()
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

    public boolean isCharacterStream() throws ConditionThrowable
    {
        return true;
    }

    public boolean isBinaryStream() throws ConditionThrowable
    {
        return false;
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

    public void _writeChar(char c) throws ConditionThrowable
    {
        if (kind == Keyword.UPCASE)
            c = Utilities.toUpperCase(c);
        else if (kind == Keyword.DOWNCASE)
            c = Utilities.toLowerCase(c);
        // FIXME CAPITALIZE, CAPITALIZE_FIRST
        target._writeChar(c);
    }

    public void _writeChars(char[] chars, int start, int end)
        throws ConditionThrowable
    {
        target._writeChars(chars, start, end);
    }

    public void _writeString(String s) throws ConditionThrowable
    {
        if (kind == Keyword.UPCASE)
            s = s.toUpperCase();
        else if (kind == Keyword.DOWNCASE)
            s = s.toLowerCase();
        // FIXME CAPITALIZE, CAPITALIZE_FIRST
        target._writeString(s);
    }

    public void _writeLine(String s) throws ConditionThrowable
    {
        if (kind == Keyword.UPCASE)
            s = s.toUpperCase();
        else if (kind == Keyword.DOWNCASE)
            s = s.toLowerCase();
        // FIXME CAPITALIZE, CAPITALIZE_FIRST
        target._writeLine(s);
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
        signal(new TypeError("Operation is not supported for streams of type CASE-FROB-STREAM."));
    }

    // ### make-case-frob-stream target => case-frob-stream
    private static final Primitive2 MAKE_CASE_FROB_STREAM =
        new Primitive2("make-case-frob-stream", PACKAGE_SYS, false, "target kind")
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            Stream target = checkCharacterOutputStream(first);
            LispObject kind = second;
            if (!memq(kind, list4(Keyword.UPCASE, Keyword.DOWNCASE,
                                  Keyword.CAPITALIZE, Keyword.CAPITALIZE_FIRST)))
                return signal(new TypeError(
                    "Kind must be :UPCASE, :DOWNCASE, :CAPITALIZE or :CAPITALIZE-FIRST."));
            return new CaseFrobStream(target, kind);
        }
    };
}
