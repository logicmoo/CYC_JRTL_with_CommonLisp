/*
 * MouseWheelListener.java
 *
 * Copyright (C) 2002 Peter Graves
 * $Id: MouseWheelListener.java,v 1.2 2003-01-06 02:47:39 piso Exp $
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

import java.awt.event.MouseWheelEvent;

public final class MouseWheelListener implements java.awt.event.MouseWheelListener
{
    private final Editor editor;

    private MouseWheelListener(Editor editor)
    {
        this.editor = editor;
    }

    public void mouseWheelMoved(MouseWheelEvent e)
    {
        // Without this, focus ends up in the location bar textfield if you use
        // the mouse wheel in the edit window after using the openFile
        // completion list to open a file.
        // See also Editor.mouseMoveDotToPoint(MouseEvent).
        Editor.currentEditor().setFocusToDisplay();

        if (e.getWheelRotation() < 0)
            editor.getDisplay().windowUp(5);
        else
            editor.getDisplay().windowDown(5);
    }

    public static void addListener(Editor editor)
    {
        MouseWheelListener listener = new MouseWheelListener(editor);
        editor.addMouseWheelListener(listener);
    }
}
