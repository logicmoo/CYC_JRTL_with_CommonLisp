/*
 * JdbControlDialog.java
 *
 * Copyright (C) 2002 Peter Graves
 * $Id: JdbControlDialog.java,v 1.1.1.1 2002-09-24 16:09:43 piso Exp $
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

package org.armedbear.j.jdb;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import org.armedbear.j.Constants;
import org.armedbear.j.DefaultTextFieldHandler;
import org.armedbear.j.Editor;
import org.armedbear.j.EditorIterator;
import org.armedbear.j.Expansion;
import org.armedbear.j.History;
import org.armedbear.j.HistoryTextField;
import org.armedbear.j.SessionProperties;

public final class JdbControlDialog extends JDialog implements Constants,
    ActionListener, ComponentListener, KeyListener
{
    private static final String commandKey = "jdb.command";

    private static final SessionProperties sessionProperties =
        Editor.getSessionProperties();

    private final Jdb jdb;
    private final JToolBar toolBar;
    private final HistoryTextField commandTextField;
    private final History commandHistory;

    public JdbControlDialog(Jdb jdb)
    {
        super(Editor.getCurrentFrame(), "Jdb", false);
        this.jdb = jdb;
        toolBar = new JToolBar();
        toolBar.setOrientation(JToolBar.HORIZONTAL);
        toolBar.setFloatable(false);
        toolBar.putClientProperty("JToolBar.isRollover", Boolean.FALSE);
        addButton("Set/Clear Breakpoint", null, "jdbToggleBreakpoint");
        addButton("Next", null, "jdbNext");
        addButton("Step", null, "jdbStep");
        addButton("Step Out", null, "jdbStepOut");
        addButton("Go", null, "jdbResume");
        getContentPane().add(toolBar, "North");
        JTabbedPane tabbedPane = new JTabbedPane();
        StackPanel stackPanel = new StackPanel(jdb, this);
        tabbedPane.addTab("Stack", stackPanel.getComponent());
        ThreadPanel threadPanel = new ThreadPanel(jdb, this);
        tabbedPane.addTab("Threads", threadPanel.getComponent());
        BreakpointPanel breakpointPanel = new BreakpointPanel(jdb, this);
        tabbedPane.addTab("Breakpoints", breakpointPanel.getComponent());
        getContentPane().add(tabbedPane, "Center");
        JPanel commandPanel = new JPanel();
        commandPanel.setLayout(new BoxLayout(commandPanel, BoxLayout.X_AXIS));
        commandPanel.setBorder(BorderFactory.createEmptyBorder(3, 3, 4, 3));
        commandPanel.add(new JLabel("Command:"));
        commandTextField = new HistoryTextField(20);
        commandHistory = new History(commandKey);
        commandTextField.setHistory(commandHistory);
        commandTextField.setHandler(new CommandTextFieldHandler(commandTextField));
        commandPanel.add(commandTextField);
        getContentPane().add(commandPanel, "South");
        pack();
        addComponentListener(this);
        addWindowListener(new WindowMonitor());
        commandTextField.addKeyListener(this);
        if (jdb.getStartSuspended())
            tabbedPane.setSelectedComponent(breakpointPanel.getComponent());
        requestDefaultFocus();
    }

    public void requestDefaultFocus()
    {
        commandTextField.requestFocus();
    }

    private void addButton(String text, String iconFile, String command)
    {
        JButton button = null;
        if (iconFile != null) {
            URL url = Editor.class.getResource("images/" + iconFile);
            if (url != null) {
                button = new JButton();
                button.setIcon(new ImageIcon(url));
                button.setToolTipText(text);
            }
        }
        if (button == null)
            button = new JButton(text);
        if (command != null)
            button.setActionCommand(command);
        button.addActionListener(this);
        button.setRequestFocusEnabled(false);
        toolBar.add(button);
    }

    public void show()
    {
        int width = sessionProperties.getIntegerProperty("jdb.width", 350);
        int height = sessionProperties.getIntegerProperty("jdb.height", 200);
        setSize(width, height);
        int x = sessionProperties.getIntegerProperty("jdb.x", -1);
        int y = sessionProperties.getIntegerProperty("jdb.y", -1);
        if (x >= 0 && y >= 0) {
            setLocation(x, y);
        } else {
            // First time.
            Editor editor = null;
            for (EditorIterator it = new EditorIterator(); it.hasNext();) {
                Editor ed = it.nextEditor();
                if (ed.getBuffer() == jdb) {
                    editor = ed;
                    break;
                }
            }
            if (editor != null) {
                Dimension parent = editor.getFrame().getSize();
                Dimension dialog = getSize();
                Point p = editor.getFrame().getLocation();
                p.translate(parent.width - dialog.width - 30,
                    parent.height - dialog.height - 50);
                setLocation(p);
            } else
                Editor.currentEditor().centerDialog(this);
        }
        super.show();
    }

    public void actionPerformed(ActionEvent e)
    {
        Editor.currentEditor().getDispatcher().actionPerformed(e);
    }

    public void keyPressed(KeyEvent e)
    {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            // Mask off the bits we don't care about (Java 1.4).
            if ((e.getModifiers() & 0x0f) == 0) {
                String command = commandTextField.getText().trim();
                if (command.length() > 0) {
                    jdb.doCommand(commandTextField.getText());
                    commandTextField.setText("");
                } else {
                    command = jdb.getLastCommand();
                    if (command != null) {
                        if (command.equals("next") || command.equals("step"))
                            jdb.doCommand(command);
                    }
                }
            }
        }
    }

    public void keyReleased(KeyEvent e) {}

    public void keyTyped(KeyEvent e) {}

    public void componentResized(ComponentEvent e)
    {
        saveWindowPlacement();
    }

    public void componentMoved(ComponentEvent e)
    {
        saveWindowPlacement();
    }

    public void componentShown(ComponentEvent e)
    {
        saveWindowPlacement();
    }

    public void componentHidden(ComponentEvent e) {}

    private void saveWindowPlacement()
    {
        Rectangle r = getBounds();
        sessionProperties.setIntegerProperty("jdb.x", r.x);
        sessionProperties.setIntegerProperty("jdb.y", r.y);
        sessionProperties.setIntegerProperty("jdb.width", r.width);
        sessionProperties.setIntegerProperty("jdb.height", r.height);
    }

    private class WindowMonitor extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            setVisible(false);
            dispose();
            jdb.doCommand("quit");
        }
    }

    private class CommandTextFieldHandler extends DefaultTextFieldHandler
    {
        CommandTextFieldHandler(HistoryTextField textField)
        {
            super(textField);
        }

        public void enter()
        {
            commandHistory.append(textField.getText());
        }

        public void escape()
        {
            textField.setText("");
        }

        public Expansion getExpansion(String prefix)
        {
            Expansion expansion = new Expansion(jdb, prefix, prefix);
            EditorIterator iter = new EditorIterator();
            while (iter.hasNext()) {
                Editor ed = iter.nextEditor();
                if (ed.getModeId() == JAVA_MODE) {
                    Expansion exp =
                        new Expansion(ed.getBuffer(), prefix, prefix, ed.getDot());
                    expansion.appendCandidates(exp.getCandidates());
                }
            }
            return expansion;
        }
    }
}
