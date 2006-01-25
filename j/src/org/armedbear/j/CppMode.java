/*
 * CppMode.java
 *
 * Copyright (C) 1998-2006 Peter Graves
 * $Id: CppMode.java,v 1.2 2006-01-25 12:18:35 piso Exp $
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

public final class CppMode extends CMode implements Constants, Mode
{
    private static final String[] cppConditionals = {
        "if",
        "else",
        "do",
        "while",
        "for",
        "switch",
        "try",
        "catch"
    };

    // Since this class is final, we may as well construct the singleton class
    // instance right away.
    private static CppMode mode = new CppMode();

    private CppMode()
    {
        super(CPP_MODE, CPP_MODE_NAME);
        keywords = new Keywords(this);
        conditionals = cppConditionals;
    }

    public static final Mode getMode()
    {
        return mode;
    }

    public final String getCommentStart()
    {
        return "// ";
    }

    public final String getCommentEnd()
    {
        return null;
    }

    public final Formatter getFormatter(Buffer buffer)
    {
        return new CFormatter(buffer, LANGUAGE_CPP);
    }

    protected void setKeyMapDefaults(KeyMap km)
    {
        super.setKeyMapDefaults(km);
        km.unmapKey(':'); // No electric ':'.
    }

    public Tagger getTagger(SystemBuffer buffer)
    {
        return new CppTagger(buffer);
    }

    public boolean hasQualifiedNames()
    {
        return true;
    }

    public boolean isQualifiedName(String s)
    {
        return s.indexOf("::") >= 0;
    }

    public int getCorrectIndentation(Line line, Buffer buffer)
    {
        String trim = line.trim();
        if (trim.equals("public:") || trim.equals("private:"))
            return 0;
        return super.getCorrectIndentation(line, buffer);
    }
}
