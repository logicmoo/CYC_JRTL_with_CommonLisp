/*
 * MenuItem.java
 *
 * Copyright (C) 1998-2002 Peter Graves
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

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import javax.swing.JMenuItem;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.UIManager;

public final class MenuItem extends JMenuItem
{
    private static Font acceleratorFont;
    private static Color acceleratorForeground;
    private static Color acceleratorSelectionForeground;

    static {
        acceleratorFont = UIManager.getFont("MenuItem.acceleratorFont");
        acceleratorForeground = UIManager.getColor("MenuItem.acceleratorForeground");
        acceleratorSelectionForeground = UIManager.getColor("MenuItem.acceleratorSelectionForeground");
    }

    private String acceleratorText;

    public MenuItem(String label, String acceleratorText)
    {
        super(label);
        this.acceleratorText = acceleratorText;
    }

    public Dimension getPreferredSize()
    {
        Dimension d = super.getPreferredSize();
        if (acceleratorText != null)
            d.width += getToolkit().getFontMetrics(acceleratorFont).stringWidth(acceleratorText) + 30;
        return d;
    }

    // We paint our own menu items so the accelerator text will be consistent
    // with our key map format.
    public void paint(Graphics g)
    {
        super.paint(g);
        if (acceleratorText != null) {
            g.setFont(acceleratorFont);
            g.setColor(getModel().isArmed() ? acceleratorSelectionForeground : acceleratorForeground);
            FontMetrics fm = g.getFontMetrics();
            Insets insets = getInsets();
            g.drawString(acceleratorText,
                getWidth() - (fm.stringWidth(acceleratorText) + insets.right + insets.left),
                getFont().getSize() + (insets.top - 1));
        }
    }

    public void processKeyEvent(KeyEvent e, MenuElement path[], MenuSelectionManager manager)
    {
        super.processKeyEvent(e, path, manager);
        if (!Platform.isJava141())
            if (Character.toUpperCase(e.getKeyChar()) == getMnemonic())
                e.consume();
    }
}
