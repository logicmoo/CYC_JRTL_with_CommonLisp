/*
 * Macro.java
 *
 * Copyright (C) 1998-2002 Peter Graves
 * $Id: Macro.java,v 1.2 2002-10-10 18:43:48 piso Exp $
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

import java.util.ArrayList;
import javax.swing.undo.CompoundEdit;

public final class Macro
{
    private ArrayList list = new ArrayList();

    public Macro()
    {
    }

    public synchronized boolean isEmpty()
    {
        return list.isEmpty();
    }

    public synchronized void record(String command)
    {
        list.add(command);
    }

    public synchronized void record(char c)
    {
        list.add(new Character(c));
    }

    public synchronized void playback()
    {
        final Editor editor = Editor.currentEditor();
        final Buffer buffer = editor.getBuffer();
        try {
            buffer.lockWrite();
        }
        catch (InterruptedException e) {
            Log.debug(e);
            return;
        }
        try {
            CompoundEdit compoundEdit = buffer.beginCompoundEdit();
            final int size = list.size();
            for (int i = 0; i < size; i++) {
                Object object = list.get(i);
                if (object instanceof String)
                    editor.executeCommand((String)object);
                else if (object instanceof Character)
                    editor.insertNormalChar(((Character) object).charValue());
            }
            buffer.endCompoundEdit(compoundEdit);
        }
        finally {
            buffer.unlockWrite();
        }
    }
}
