/*
 * CustomFocusManager.java
 *
 * Copyright (C) 1999-2002 Peter Graves
 * $Id: CustomFocusManager.java,v 1.1.1.1 2002-09-24 16:08:28 piso Exp $
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

import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.DefaultFocusManager;
import javax.swing.JMenu;

public final class CustomFocusManager extends DefaultFocusManager
{
    public void processKeyEvent(Component focusedComponent, KeyEvent e)
    {
        if (e.getKeyCode() == KeyEvent.VK_TAB) {
            if (focusedComponent instanceof JMenu ||
                focusedComponent instanceof Display) {
                switch (e.getID()) {
                    case KeyEvent.KEY_PRESSED:
                        Editor.currentEditor().getDispatcher().keyPressed(e);
                        e.consume();
                        break;
                    case KeyEvent.KEY_RELEASED:
                        Editor.currentEditor().getDispatcher().keyReleased(e);
                        e.consume();
                        break;
                    default:
                        break;
                }
            }
            return;
        }
        super.processKeyEvent(focusedComponent, e);
    }
}
