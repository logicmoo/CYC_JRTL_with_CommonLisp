/*
 * CharacterOutputStream.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: CharacterOutputStream.java,v 1.3 2003-08-11 16:10:56 piso Exp $
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

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

public class CharacterOutputStream extends LispStream
{
    private static final String lineSeparator =
        System.getProperty("line.separator");

    private Writer writer;

    // The number of characters on the current line of output (-1 if unknown).
    private int charPos;

    protected CharacterOutputStream()
    {
    }

    public CharacterOutputStream(OutputStream out)
    {
        writer = new OutputStreamWriter(out);
    }

    protected void setWriter(Writer writer)
    {
        this.writer = writer;
    }

    public int getCharPos()
    {
        return charPos;
    }

    public void setCharPos(int n)
    {
        charPos = n;
    }

    public LispObject terpri() throws StreamError
    {
        try {
            writer.write(System.getProperty("line.separator"));
            charPos = 0;
        }
        catch (IOException e) {
            throw new StreamError(e);
        }
        return NIL;
    }

    public LispObject freshLine() throws StreamError
    {
        if (charPos == 0)
            return NIL;
        try {
            writer.write(System.getProperty("line.separator"));
            charPos = 0;
        }
        catch (IOException e) {
            throw new StreamError(e);
        }
        return T;
    }

    public void print(LispObject obj) throws StreamError
    {
        try {
            writer.write(String.valueOf(obj));
        }
        catch (IOException e) {
            throw new StreamError(e);
        }
    }

    public void print(char c) throws StreamError
    {
        try {
            writer.write(c);
        }
        catch (IOException e) {
            throw new StreamError(e);
        }
        if (c == '\n')
            charPos = 0;
        else
            ++charPos;
    }

    // PRINC is just like PRIN1 except that the output has no escape
    // characters. It binds *PRINT-ESCAPE* to false and *PRINT-READABLY* to
    // false. The general rule is that output from PRINC is intended to look
    // good to people, while output from PRIN1 is intended to be acceptable to
    // READ.
    public void princ(LispObject obj) throws StreamError
    {
        LispThread thread = LispThread.currentThread();
        Environment oldDynEnv = thread.getDynamicEnvironment();
        thread.bindSpecial(_PRINT_ESCAPE_, NIL);
        String s = String.valueOf(obj);
        thread.setDynamicEnvironment(oldDynEnv);
        try {
            writer.write(s);
        }
        catch (IOException e) {
            throw new StreamError(e);
        }
        int index = s.lastIndexOf('\n');
        if (index < 0)
            charPos += s.length();
        else
            charPos = s.length() - (index + 1);
    }

    // PRIN1 produces output suitable for input to READ.
    // Binds *PRINT-ESCAPE* to true.
    public void prin1(LispObject obj) throws StreamError
    {
        String s = String.valueOf(obj);
        try {
            writer.write(s);
        }
        catch (IOException e) {
            throw new StreamError(e);
        }
        int index = s.lastIndexOf('\n');
        if (index < 0)
            charPos += s.length();
        else
            charPos = s.length() - (index + 1);
    }

    public void writeChar(char c) throws StreamError
    {
        try {
            writer.write(c);
        }
        catch (IOException e) {
            throw new StreamError(e);
        }
    }

    public void writeString(LispString string) throws StreamError
    {
        writeString(string.getValue());
    }

    public void writeString(String s) throws StreamError
    {
        try {
            writer.write(s);
            int index = s.lastIndexOf('\n');
            if (index < 0)
                charPos += s.length();
            else
                charPos = s.length() - (index + 1);
        }
        catch (IOException e) {
            throw new StreamError(e);
        }
    }

    public void writeLine(String s) throws StreamError
    {
        try {
            writer.write(s);
            writer.write(lineSeparator);
            charPos = 0;
        }
        catch (IOException e) {
            throw new StreamError(e);
        }
    }

    public void printStackTrace(Throwable t) throws StreamError
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        try {
            writer.write(sw.toString());
            writer.write(System.getProperty("line.separator"));
            charPos = 0;
        }
        catch (IOException e) {
            throw new StreamError(e);
        }
    }

    public void finishOutput() throws StreamError
    {
        try {
            writer.flush();
        }
        catch (IOException e) {
            throw new StreamError(e);
        }
    }

    // Returns true if stream was open, otherwise implementation-dependent.
    public LispObject close(LispObject abort) throws StreamError
    {
        try {
            writer.close();
            return T;
        }
        catch (IOException e) {
            throw new StreamError(e);
        }
    }
}
