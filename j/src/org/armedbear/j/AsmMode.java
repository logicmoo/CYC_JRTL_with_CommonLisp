/*
 * AsmMode.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: AsmMode.java,v 1.1 2003-12-29 19:21:33 piso Exp $
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
    }

    public boolean canIndent()
    {
        return true;
    }

    public boolean canIndentPaste()
    {
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
