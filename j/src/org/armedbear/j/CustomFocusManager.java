/*
 * CustomFocusManager.java
 *
 * Copyright (C) 1999-2003 Peter Graves
 * $Id: CustomFocusManager.java,v 1.4 2003-06-13 16:17:01 piso Exp $
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
import javax.swing.JDialog;
import javax.swing.JMenu;

public final class CustomFocusManager extends DefaultFocusManager
{
    public void processKeyEvent(Component focusedComponent, KeyEvent e)
    {
        if (!Platform.isJava14() && e.getKeyCode() == KeyEvent.VK_TAB) {
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
        if (e.getID() == KeyEvent.KEY_PRESSED) {
            if (isComponentHookable(focusedComponent)) {
                KeyMapping km;
                int keyCode = e.getKeyCode();
                if (keyCode != 0)
                    km = new KeyMapping(keyCode, e.getModifiers(), null);
                else
                    km = new KeyMapping(e.getKeyChar(), null);
                Editor.invokeHook("key-pressed-hook",
                    "\"" + km.toString() + "\"");
            }
        }
        super.processKeyEvent(focusedComponent, e);
    }

    private static final boolean isComponentHookable(Component c)
    {
        if (c instanceof Display)
            return false;
        if (c == null)
            return false;
        if (!Editor.preferences().getBooleanProperty(Property.ENABLE_KEY_PRESSED_HOOK))
            return false;
        while (true) {
            if (c instanceof JDialog)
                return false;
            c = c.getParent();
            if (c == null)
                return true;
        }
    }
}
