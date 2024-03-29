/*
 * AbstractLine.java
 *
 * Copyright (C) 1999-2002 Peter Graves
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

public abstract class AbstractLine implements Line
{
    private Line prev;
    private Line next;
    private int lineNumber = -1;
    private int originalLineNumber = -1;
    private int hidden;
    private Annotation annotation;

    @Override
	public final synchronized Line previous()
    {
        return prev;
    }

    @Override
	public final synchronized void setPrevious(Line line)
    {
        prev = line;
    }

    @Override
	public final synchronized Line next()
    {
        return next;
    }

    @Override
	public final synchronized void setNext(Line line)
    {
        next = line;
    }

    @Override
	public final synchronized void insertAfter(Line line)
    {
        if (line != null) {
            Line n = line.next();
            setNext(n);
            if (n != null)
                n.setPrevious(this);
            line.setNext(this);
            setPrevious(line);
        } else
            Debug.bug();
    }

    @Override
	public final synchronized int lineNumber()
    {
        return lineNumber;
    }

    @Override
	public final synchronized void setLineNumber(int n)
    {
        lineNumber = n;
    }

    @Override
	public final synchronized int originalLineNumber()
    {
        return originalLineNumber;
    }

    @Override
	public final synchronized void setOriginalLineNumber(int n)
    {
        originalLineNumber = n;
    }

    @Override
	public int getHeight()
    {
        return Display.getCharHeight();
    }

    @Override
	public int getWidth()
    {
        return 0;
    }

    // Derived classes override this!
    @Override
	public String getText()
    {
        return null;
    }

    // Derived classes override this!
    @Override
	public String getOriginalText()
    {
        return null;
    }

    // Derived classes override this!
    @Override
	public void setOriginalText(String s)
    {
        // Do nothing.
    }

    // Derived classes override this!
    @Override
	public boolean isModified()
    {
        return false;
    }

    // Derived classes override this!
    @Override
	public boolean isNew()
    {
        return false;
    }

    // Derived classes override this!
    @Override
	public void setNew(boolean b)
    {
        // Do nothing.
    }

    // Derived classes override this!
    @Override
	public boolean isSaved()
    {
        return false;
    }

    // Derived classes override this!
    @Override
	public void setSaved(boolean b)
    {
        // Do nothing.
    }

    // Derived classes override this!
    @Override
	public void unmodified()
    {
        // Do nothing.
    }

    // Returns offset (not column) of first non-whitespace character.
    @Override
	public int getIndentation()
    {
        String text = getText();
        if (text == null)
            return 0;
        int limit = text.length();
        for (int i = 0; i < limit; i++)
            if (!Character.isWhitespace(text.charAt(i)))
                return i;
        return limit;
    }

    @Override
	public final boolean isHidden()
    {
        return hidden > 0;
    }

    @Override
	public final void hide()
    {
        ++hidden;
    }

    @Override
	public final void unhide()
    {
        --hidden;
        if (Editor.isDebugEnabled() && hidden < 0)
            Debug.bug("hidden < 0");
    }

    @Override
	public final void show()
    {
        hidden = 0;
    }

    @Override
	public final int getHidden()
    {
        return hidden;
    }

    @Override
	public final void setHidden(int hidden)
    {
        this.hidden = hidden;
    }

    @Override
	public final synchronized Line previousVisible()
    {
        Line line = previous();
        while (line != null && line.isHidden())
            line = line.previous();
        return line;
    }

    @Override
	public final synchronized Line nextVisible()
    {
        Line line = next();
        while (line != null && line.isHidden())
            line = line.next();
        return line;
    }

    @Override
	public final boolean isBefore(Line line)
    {
        return lineNumber < line.lineNumber();
    }

    // Derived classes override this!
    @Override
	public Line copy()
    {
        return null;
    }

    // Derived classes override this!
    @Override
	public void copy(Line line)
    {
        // Do nothing.
    }

    @Override
	public final Annotation getAnnotation()
    {
        return annotation;
    }

    @Override
	public final void setAnnotation(Annotation annotation)
    {
        this.annotation = annotation;
    }

    @Override
	public final String toString()
    {
        FastStringBuffer sb = new FastStringBuffer();
        sb.append("line ");
        sb.append(lineNumber()+1);
        String s = getText();
        if (s != null) {
            sb.append(" text = \"");
            sb.append(s);
            sb.append('"');
        } else
            sb.append(" text = null");
        return sb.toString();
    }
}
