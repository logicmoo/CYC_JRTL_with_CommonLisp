/*
 * LocationBar.java
 *
 * Copyright (C) 2002 Peter Graves
 * $Id: LocationBar.java,v 1.3 2002-11-15 15:06:39 piso Exp $
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
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public final class LocationBar extends JPanel implements Constants,
    ActionListener, MouseListener
{
    private Editor editor;
    private final JLabel label;
    private final HistoryTextField textField;
    private JButton closeButton;

    private static String[] prompts = {
        "Location:",
        "Command:",
        "Tag:",
        "Pattern:",
    };

    public static final int PROMPT_LOCATION = 0;
    public static final int PROMPT_COMMAND  = 1;
    public static final int PROMPT_TAG      = 2;
    public static final int PROMPT_PATTERN  = 3;

    public LocationBar(final Editor editor)
    {
        this.editor = editor;
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        setBorder(BorderFactory.createEmptyBorder(3, 3, 4, 3));
        // Make the label wide enough for the widest string that needs to go
        // there.
        label = new JLabel(getWidestPrompt());
        label.setBorder(BorderFactory.createEmptyBorder(3, 0, 1, 0));
        Dimension dim = label.getPreferredSize();
        label.setPreferredSize(dim);
        label.setMinimumSize(dim);
        label.setMaximumSize(dim);
        label.setHorizontalAlignment(JLabel.RIGHT);
        add(label);
        textField = new HistoryTextField(editor, 20);
        if (Platform.isJava14())
            Utilities.setFocusTraversalKeysEnabled(textField, false);
        add(textField);
        addCloseButton();
        textField.addMouseListener(this);
        textField.setHandler(new OpenFileTextFieldHandler(editor, textField));
        // Don't let the width of the location bar prevent the user from
        // making the sidebar wider.
        dim = getPreferredSize();
        dim.width = 0;
        setMinimumSize(dim);
        setLabelText(PROMPT_LOCATION);
    }

    private void addCloseButton()
    {
        closeButton = new JButton();
        URL url = Editor.class.getResource("images/close_frame.png");
        if (url != null)
            closeButton.setIcon(new ImageIcon(url));
        Dimension dim = textField.getPreferredSize();
        dim.width = dim.height = 16;
        closeButton.setPreferredSize(dim);
        closeButton.setMinimumSize(dim);
        closeButton.setMaximumSize(dim);
        closeButton.setBorder(null);
        add(javax.swing.Box.createHorizontalStrut(3));
        add(closeButton);
        add(javax.swing.Box.createHorizontalStrut(3));
        closeButton.addActionListener(this);
    }

    private static String widest = null;

    private static String getWidestPrompt()
    {
        if (widest == null) {
            Font font = new JLabel().getFont();
            FontMetrics fm = Toolkit.getDefaultToolkit().getFontMetrics(font);
            int maxWidth = -1;
            for (int i = 0; i < prompts.length; i++) {
                int width = fm.stringWidth(prompts[i]);
                if (width > maxWidth) {
                    widest = prompts[i];
                    maxWidth = width;
                }
            }
        }
        return widest;
    }

    public final void setLabelText(int index)
    {
        Debug.assertTrue(index >= 0);
        Debug.assertTrue(index < prompts.length);
        label.setText(prompts[index]);
    }

    public void update()
    {
        setLabelText(PROMPT_LOCATION);
        textField.setHandler(new OpenFileTextFieldHandler(editor, textField));
        textField.setHistory(new History("openFile.file", 30));
        Buffer buffer = editor.getBuffer();
        if (buffer != null)
            textField.setText(buffer.getFileNameForDisplay());
    }

    public final HistoryTextField getTextField()
    {
        return textField;
    }

    public final JButton getCloseButton()
    {
        return closeButton;
    }

    public static void cancelInput()
    {
        // Cancel location bar activity (if any).
        for (EditorIterator it = new EditorIterator(); it.hasNext();) {
            Editor ed = it.nextEditor();
            if (ed.getFocusedComponent() == ed.getLocationBarTextField())
                ed.getLocationBarTextField().getHandler().escape();
        }
    }

    public void actionPerformed(ActionEvent e)
    {
        final Frame frame = editor.getFrame();

        // Before we close the editor, if either the editor being closed or the
        // other editor in the same frame is looking at a secondary buffer,
        // promote it.
        frame.promoteSecondaryBuffers();

        frame.closeEditor(editor);
        frame.getCurrentEditor().setFocusToDisplay();
        Sidebar sidebar = frame.getSidebar();
        if (sidebar != null)
            sidebar.setUpdateFlag(SIDEBAR_SET_BUFFER);
    }

    public void mouseClicked(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void mousePressed(MouseEvent e)
    {
        editor.ensureActive();
        editor.getFrame().setFocus(textField);
    }

    public void mouseReleased(MouseEvent e) {}
}
