/*
 * SystemSelection.java
 *
 * Copyright (C) 2002 Peter Graves
 * $Id: SystemSelection.java,v 1.2 2002-10-05 18:08:11 piso Exp $
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

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.Toolkit;
import java.lang.reflect.Method;

public final class SystemSelection implements ClipboardOwner
{
    private static SystemSelection instance;

    private final Clipboard clipboard;
    private String primarySelection;

    private SystemSelection(Clipboard clipboard)
    {
        this.clipboard = clipboard;
    }

    public static SystemSelection getInstance()
    {
        if (instance == null) {
            try {
                Method method = Toolkit.class.getMethod("getSystemSelection",
                    new Class[0]);
                Clipboard clipboard = (Clipboard) method.invoke(
                    Toolkit.getDefaultToolkit(), new Object[0]);
                instance = new SystemSelection(clipboard);
            }
            catch (Exception e) {}
        }
        return instance;
    }

    public void lostOwnership(Clipboard clipboard, Transferable contents)
    {
        primarySelection = null;
    }

    public void update(Editor editor)
    {
        try {
            if (clipboard != null) {
                StringSelection ss = null;
                if (editor.getMark() != null && !editor.isColumnSelection()) {
                    primarySelection = new Region(editor).toString();
                    ss = new StringSelection(primarySelection);
                } else if (primarySelection != null) {
                    // We own the primary selection.
                    ss = new StringSelection("");
                }
                if (ss != null)
                    clipboard.setContents(ss, this);
            }
        }
        catch (OutOfMemoryError e) {
            Log.error("SystemSelection.update() OutOfMemoryError");
        }
    }

    public String getPrimarySelection()
    {
        if (primarySelection != null) {
            // We own the primary selection.
            return primarySelection;
        }
        Transferable t = clipboard.getContents(this);
        if (t != null) {
            try {
                return (String) t.getTransferData(DataFlavor.stringFlavor);
            }
            catch (Exception e) {}
        }
        return null;
    }
}
