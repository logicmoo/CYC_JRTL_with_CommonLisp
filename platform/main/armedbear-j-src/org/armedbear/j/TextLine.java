/*
 * TextLine.java
 *
 * Copyright (C) 1998-2002 Peter Graves
 * $Id: TextLine.java,v 1.3 2002/10/03 15:23:55 piso Exp $
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

package org.armedbear.j;

import java.io.UnsupportedEncodingException;

public class TextLine extends AbstractLine implements Line
{
    private static final int SAVED = 0x0001;
    private static final int NEW   = 0x0002;

    private int flags;
    private String text;
    private String originalText;
    private int bits;

    protected TextLine()
    {
    }

    public TextLine(String s)
    {
        text = s;
    }

    protected final void init(String s)
    {
        text = s;
    }

    @Override
	public final synchronized int flags()
    {
        return flags;
    }

    @Override
	public final synchronized void setFlags(int flags)
    {
        this.flags = flags;
    }

    @Override
	public final synchronized String getText()
    {
        return text != null ? text : "";
    }

    @Override
	public final synchronized void setText(String s)
    {
        if (originalText == null)
            originalText = text;
        text = s;
        if (text != null && text.equals(originalText))
            originalText = null;
        bits &= ~SAVED;
    }

    @Override
	public final String getOriginalText()
    {
        return originalText;
    }

    @Override
	public final void setOriginalText(String s)
    {
        originalText = s;
    }

    @Override
	public final boolean isModified()
    {
        return originalText != null || isNew();
    }

    @Override
	public final boolean isNew()
    {
        return (bits & NEW) == NEW;
    }

    @Override
	public final void setNew(boolean b)
    {
        if (b)
            bits |= NEW;
        else
            bits &= ~NEW;
    }

    @Override
	public final boolean isSaved()
    {
        return (bits & SAVED) == SAVED;
    }

    @Override
	public final void setSaved(boolean b)
    {
        if (b)
            bits |= SAVED;
        else
            bits &= ~SAVED;
    }

    @Override
	public final void unmodified()
    {
        originalText = null;
        bits &= (~SAVED & ~NEW);
    }

    @Override
	public final char charAt(int i)
    {
        return getText().charAt(i);
    }

    @Override
	public final String substring(int beginIndex)
    {
        return getText().substring(beginIndex);
    }

    @Override
	public final String substring(int beginIndex, int endIndex)
    {
        return getText().substring(beginIndex, endIndex);
    }

    @Override
	public final String trim()
    {
        return getText().trim();
    }

    @Override
	public final int length()
    {
        return getText().length();
    }

    @Override
	public final int getWidth()
    {
        return length() * Display.getCharWidth();
    }

    @Override
	public final byte[] getBytes(String encoding) throws UnsupportedEncodingException
    {
        byte[] bytes = getText().getBytes(encoding);
        if (bytes.length >= 2) {
            if ((bytes[0] == (byte) 0xfe && bytes[1] == (byte) 0xff) ||
                (bytes[0] == (byte) 0xff && bytes[1] == (byte) 0xfe)) {
                // Get rid of byte order mark.
                byte[] newBytes = new byte[bytes.length-2];
                for (int i = 0; i < newBytes.length; i++)
                    newBytes[i] = bytes[i+2];
                return newBytes;
            }
        }
        return bytes;
    }

    @Override
	public final boolean isBlank()
    {
        String s = getText();

        for (int i = s.length(); i-- > 0;)
            if (!Character.isWhitespace(s.charAt(i)))
                return false;

        return true;
    }

    // Copies text, original text, and bit flags only.
    @Override
	public Line copy()
    {
        TextLine line = new TextLine(text);
        line.originalText = originalText;
        line.bits = bits;
        return line;
    }

    // Copies text, original text, and bit flags only.
    @Override
	public void copy(Line line)
    {
        if (line instanceof TextLine) {
            TextLine textLine = (TextLine) line;
            text = textLine.text;
            originalText = textLine.originalText;
            bits = textLine.bits;
        } else
            Debug.bug();
    }
}
