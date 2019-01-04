/*
 * AsmMode.java
 *
 * Copyright (C) 2003-2015 Peter Graves
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
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.armedbear.j;

import java.awt.event.KeyEvent;

public final class AsmMode extends AbstractMode implements Constants, Mode
{
    private static final AsmMode mode = new AsmMode();

    private AsmMode()
    {
        super(ASM_MODE, ASM_MODE_NAME);
        setProperty(Property.INDENT_SIZE, 8);
    }

    public static AsmMode getMode()
    {
        return mode;
    }

    public String getCommentStart()
    {
        return "; ";
    }

    public Formatter getFormatter(Buffer buffer)
    {
        return new AsmFormatter(buffer);
    }

    protected void setKeyMapDefaults(KeyMap km)
    {
        km.mapKey(KeyEvent.VK_ENTER, 0, "newlineAndIndent");
        km.mapKey(KeyEvent.VK_F9, 0, "compile");
        km.mapKey(KeyEvent.VK_F9, CTRL_MASK, "recompile");
        km.mapKey(KeyEvent.VK_T, CTRL_MASK, "findTag");
        km.mapKey(KeyEvent.VK_PERIOD, ALT_MASK, "findTagAtDot");
    }

    public Tagger getTagger(SystemBuffer buffer)
    {
        return new AsmTagger(buffer);
    }

    public boolean isTaggable()
    {
        return true;
    }

    public boolean canIndent()
    {
        return true;
    }

    public boolean canIndentPaste()
    {
        return false;
    }

    public boolean isIdentifierStart(char c)
    {
        if (c >= 'a' && c <= 'z')
            return true;
        if (c >='A' && c <= 'Z')
            return true;
        if (c == '_')
            return true;
        // NASM
        if (c == '?')
            return true;
        return false;
    }

    public boolean isIdentifierPart(char c)
    {
        if (c >= 'a' && c <= 'z')
            return true;
        if (c >='A' && c <= 'Z')
            return true;
        if (c >= '0' && c <= '9')
            return true;
        if (c == '_')
            return true;
        // NASM
        if (c == '@' || c == '?')
            return true;
        return false;
    }

    public int getCorrectIndentation(Line line, Buffer buffer)
    {
        final int indentSize = buffer.getIndentSize();
        final Line model = findModel(line);
        if (model == null)
            return 0;
        if (model.getText().trim().endsWith(":"))
            return indentSize;
        return buffer.getIndentation(model);
    }

    private Line findModel(Line line)
    {
        Line model = line.previous();
        while (model != null && model.isBlank())
            model = model.previous();
        return model;
    }
}
