/*
 * MessageDialog.java
 *
 * Copyright (C) 1999-2002 Peter Graves
 * $Id: MessageDialog.java,v 1.1.1.1 2002-09-24 16:09:26 piso Exp $
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

import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class MessageDialog extends AbstractDialog
{
    private Editor editor;

    protected MessageDialog(Editor editor)
    {
        super(editor);
        this.editor = editor;
    }

    public static void showMessageDialog(Editor editor, String text,
        String title)
    {
        MessageDialog d = new MessageDialog(editor != null ? editor :
            Editor.currentEditor());
        d.initialize(text, title);
        if (editor != null)
            editor.setDefaultCursor();
        d.show();
    }

    public final static void showMessageDialog(String text, String title)
    {
        showMessageDialog(Editor.currentEditor(), text, title);
    }

    protected void initialize(String text, String title)
    {
        setModal(true);
        setTitle(title);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(18, 18, 6, 18));
        JTextArea textArea = new JTextArea(text);
        textArea.setAlignmentX(LEFT_ALIGNMENT);
        textArea.setEditable(false);
        textArea.setBorder(BorderFactory.createEmptyBorder());
        textArea.setBackground(UIManager.getColor("control"));
        mainPanel.add(textArea);
        mainPanel.add(Box.createVerticalStrut(14));
        addButtons();
        pack();
        centerDialog();
        if (okButton != null)
            okButton.requestFocus();
    }

    protected void addButtons()
    {
        addOK();
    }

    public void keyPressed(KeyEvent e)
    {
        if (e.getModifiers() == 0) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_ENTER:
                case KeyEvent.VK_SPACE:
                    enter();
                    break;
                case KeyEvent.VK_ESCAPE:
                    escape();
                    break;
            }
        }
    }
}
