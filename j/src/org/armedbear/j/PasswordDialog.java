/*
 * PasswordDialog.java
 *
 * Copyright (C) 1998-2003 Peter Graves
 * $Id: PasswordDialog.java,v 1.2 2003-07-04 12:45:41 piso Exp $
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

import java.awt.BorderLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

public final class PasswordDialog extends JDialog implements FocusListener,
    KeyListener
{
    private final Editor editor;
    private final JPasswordField textField;
    private String input;

    private PasswordDialog(Editor editor, String prompt, String title)
    {
        super(editor.getFrame(), title, true);
        this.editor = editor;
        input = null;
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        JLabel label = new JLabel(prompt);
        panel.add(label);
        textField = new JPasswordField(20);
        textField.setAlignmentX(LEFT_ALIGNMENT);
        textField.addKeyListener(this);
        panel.add(textField);
        getContentPane().add(panel, BorderLayout.CENTER);
        pack();
        addFocusListener(this);
    }

    public void keyPressed(KeyEvent e)
    {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_ENTER:
                input = textField.getText();
                dispose();
                return;
            case KeyEvent.VK_ESCAPE:
                dispose();
                return;
        }
    }

    public void keyReleased(KeyEvent e) {}

    public void keyTyped(KeyEvent e) {}

    public static String showPasswordDialog(Editor editor, String prompt, String title)
    {
        PasswordDialog d = new PasswordDialog(editor, prompt, title);
        editor.centerDialog(d);
        d.show();
        return d.input;
    }

    public void dispose()
    {
        super.dispose();
        editor.restoreFocus();
    }

    public void focusGained(FocusEvent e)
    {
        textField.requestFocus();
    }

    public void focusLost(FocusEvent e) {}
}
