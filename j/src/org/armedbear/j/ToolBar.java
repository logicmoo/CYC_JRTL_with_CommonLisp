/*
 * ToolBar.java
 *
 * Copyright (C) 2000-2002 Peter Graves
 * $Id: ToolBar.java,v 1.1.1.1 2002-09-24 16:08:17 piso Exp $
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

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class ToolBar extends JToolBar implements ActionListener, ToolBarConstants
{
    private static final int STYLE_DEFAULT   = 0;
    private static final int STYLE_TEXT_ONLY = 1;
    private static final int STYLE_ICON_ONLY = 2;

    private static final Preferences preferences = Editor.preferences();

    protected Frame frame;
    protected int style = STYLE_DEFAULT;

    public ToolBar(Frame frame)
    {
        this(frame, STYLE_DEFAULT);
    }

    public ToolBar(Frame frame, int style)
    {
        this.frame = frame;
        this.style = style;
        setFloatable(false);
    }

    public ToolBarButton addButton(String text, String iconFile, String methodName)
    {
        ToolBarButton button = new ToolBarButton(frame, methodName, this);
        switch (style) {
            case STYLE_DEFAULT:
                if (textEnabled())
                    button.setText(text);
                else
                    button.setToolTipText(text);
                if (iconsEnabled())
                    button.setIconFromFile(iconFile);
                button.setHorizontalTextPosition(JButton.CENTER);
                button.setVerticalTextPosition(JButton.BOTTOM);
                break;
            case STYLE_ICON_ONLY:
                button.setIconFromFile(iconFile);
                button.setToolTipText(text);
                break;
            case STYLE_TEXT_ONLY:
                button.setText(text);
                break;
        }
        // Setting the minimum button size doesn't work with Java 1.4.0-beta.
        if (!System.getProperty("java.version").startsWith("1.4")) {
            if (button.getText() != null && button.getText().length() != 0) {
                Dimension dim = button.getPreferredSize();
                if (dim.width < 40) {
                    dim.width = 40;
                    button.setMaximumSize(dim);
                    button.setMinimumSize(dim);
                }
            }
        }
        button.setRolloverEnabled(isRolloverEnabled());
        add(button);
        return button;
    }

    public ToolBarButton maybeAddInboxButton()
    {
        if (Editor.isMailEnabled())
            if (preferences.getStringProperty(Property.INBOX) != null)
                return addButton("Inbox", ICON_MAIL_INBOX, "inbox");
        return null;
    }

    public static final boolean isToolBarEnabled()
    {
        return textEnabled() || iconsEnabled();
    }

    private static final boolean textEnabled()
    {
        // Defaults to true for j's default look and feel.
        return preferences.getBooleanProperty(Property.TOOL_BAR_SHOW_TEXT,
            Editor.lookAndFeel == null);
    }

    private static final boolean iconsEnabled()
    {
        // Defaults to true in all cases.
        return preferences.getBooleanProperty(Property.TOOL_BAR_SHOW_ICONS);
    }

    public static final boolean isRolloverEnabled()
    {
        // Defaults to true for j's default look and feel.
        return preferences.getBooleanProperty(Property.TOOL_BAR_IS_ROLLOVER,
                                              Editor.lookAndFeel == null);
    }

    public void actionPerformed(ActionEvent e)
    {
        final Editor editor = frame.getCurrentEditor();
        editor.setFocusToDisplay();
        editor.getDispatcher().actionPerformed(e);
    }
}
