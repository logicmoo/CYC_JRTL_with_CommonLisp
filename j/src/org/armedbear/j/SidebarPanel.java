/*
 * SidebarPanel.java
 *
 * Copyright (C) 2000-2002 Peter Graves
 * $Id: SidebarPanel.java,v 1.1.1.1 2002-09-24 16:08:02 piso Exp $
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
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public final class SidebarPanel extends JPanel implements MouseListener
{
    private final Sidebar sidebar;
    private JLabel label;
    private JScrollPane scrollPane;

    public SidebarPanel(Sidebar sidebar)
    {
        super();
        this.sidebar = sidebar;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    public void removeAll()
    {
        label = null;
        scrollPane = null;
        super.removeAll();
    }

    public void setLabelText(String s)
    {
        if (s == null || s.length() == 0) {
            // Remove label.
            if (label != null) {
                remove(label);
                label = null;
            }
        } else {
            if (label == null) {
                // Add label.
                if (scrollPane != null) {
                    remove(scrollPane);
                    add(label = new Label());
                    add(scrollPane);
                    validate();
                }
            }
            if (label != null && !s.equals(label.getText())) {
                label.setText(s);
                // Don't let width of label constrain width of sidebar.
                Dimension dim = label.getPreferredSize();
                dim.width = 0;
                label.setMinimumSize(dim);
            }
        }
    }

    public void addScrollPane(JScrollPane scrollPane)
    {
        if (label == null)
            add(label = new Label());
        if (scrollPane.getVerticalScrollBar() != null)
            scrollPane.getVerticalScrollBar().addMouseListener(this);
        this.scrollPane = scrollPane;
        add(scrollPane);
    }

    public void removeScrollPane()
    {
        if (scrollPane != null) {
            if (scrollPane.getVerticalScrollBar() != null)
                scrollPane.getVerticalScrollBar().removeMouseListener(this);
            remove(scrollPane);
            scrollPane = null;
        }
    }

    public void mouseClicked(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void mousePressed(MouseEvent e)
    {
        if (scrollPane != null) {
            if (scrollPane.getViewport() != null) {
                Component c = scrollPane.getViewport().getView();
                if (c instanceof JComponent)
                    sidebar.getEditor().setFocus((JComponent)c);
            }
        }
    }

    public void mouseReleased(MouseEvent e) {}

    private static class Label extends JLabel
    {
        private Label()
        {
            super();
            super.setBorder(BorderFactory.createEmptyBorder(3, 3, 3, 3));
        }
    }
}
