/*
 * Menu.java
 *
 * Copyright (C) 1998-2003 Peter Graves
 * $Id: Menu.java,v 1.2 2003-06-12 16:43:05 piso Exp $
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

import javax.swing.JMenu;
import javax.swing.KeyStroke;

public final class Menu extends JMenu implements Constants
{
    public Menu(String s)
    {
        super(s);
    }

    public Menu(String s, char mnemonic)
    {
        super(s);
        if (Editor.preferences().getBooleanProperty(Property.USE_MENU_MNEMONICS))
            setMnemonic(mnemonic);
        addMenuListener(MenuBar.getListener());
    }

    public void setPopupMenuVisible(boolean b)
    {
        if (b) {
            final Editor editor = Editor.currentEditor();
            editor.getMode().populateMenu(editor, this);
        }
        super.setPopupMenuVisible(b);
        if (!b)
            removeAll();
    }

    public MenuItem add(Editor editor, String label, char mnemonic,
        String methodName, boolean enabled)
    {
        KeyStroke keyStroke = null;
        // Look in buffer-local keymap first.
        keyStroke = editor.getBuffer().getKeyMapForMode().getKeyStroke(methodName);
        // If not found there, try global keymap.
        if (keyStroke == null) {
            keyStroke = KeyMap.getGlobalKeyMap().getKeyStroke(methodName);

            // Don't let a global mapping hide a different mapping of the same
            // keystroke in the buffer-local keymap!
            if (keyStroke != null &&
                editor.getBuffer().getKeyMapForMode().lookup(keyStroke) != null)
                keyStroke = null;
        }
        // Construct accelerator text.
        final String acceleratorText =
            keyStroke != null ? Utilities.getKeyText(keyStroke) : "";
        MenuItem menuItem = new MenuItem(label, acceleratorText);
        if (mnemonic != '\0')
            menuItem.setMnemonic(mnemonic);
        menuItem.setActionCommand(methodName);
        menuItem.addActionListener(editor.getDispatcher());
        if (!enabled)
            menuItem.setEnabled(false);
        add(menuItem);
        return menuItem;
    }

    public MenuItem add(Editor editor, String label, char mnemonic,
        String methodName)
    {
        return add(editor, label, mnemonic, methodName, true);
    }
}
