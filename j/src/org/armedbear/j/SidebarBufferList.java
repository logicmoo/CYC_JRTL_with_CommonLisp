/*
 * SidebarBufferList.java
 *
 * Copyright (C) 2000-2002 Peter Graves
 * $Id: SidebarBufferList.java,v 1.2 2002-10-02 02:11:33 piso Exp $
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
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.ToolTipManager;

public final class SidebarBufferList extends SidebarList implements Constants,
    NavigationComponent, ActionListener, KeyListener, MouseListener, MouseMotionListener
{
    private JPopupMenu popup;
    private int updateFlag;

    public SidebarBufferList(Sidebar sidebar)
    {
        super(sidebar);
        addKeyListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void paintComponent(Graphics g)
    {
        if ((updateFlag & SIDEBAR_MODIFIED_BUFFER_COUNT) != 0)
            updateLabel();
        super.paintComponent(g);
    }

    public synchronized void setUpdateFlag(int mask)
    {
        updateFlag |= mask;
    }

    public synchronized void updateBufferList()
    {
        if (!SwingUtilities.isEventDispatchThread())
            Debug.bug("SidebarBufferList.updateBufferList called in background thread!!");
        if ((updateFlag & SIDEBAR_BUFFER_LIST_CHANGED) != 0) {
            refresh();
            updateFlag |= SIDEBAR_REPAINT_BUFFER_LIST;
        }
        if ((updateFlag & SIDEBAR_MODIFIED_BUFFER_COUNT) != 0)
            updateLabel();
        // Select active buffer.
        Buffer buffer = sidebar.getEditor().getBuffer();
        if (buffer != getSelectedValue())
            setSelectedValue(buffer, true);
        // Scroll active buffer to center of list.
        int index = getSelectedIndex();
        if (index >= 0)
            centerIndex(index);
        boolean repaint = (updateFlag & SIDEBAR_REPAINT_BUFFER_LIST) != 0;
        updateFlag = 0;
        if (repaint) {
            // Schedule a repaint.
            repaint();
        }
    }

    public String getLabelText()
    {
        int count = 0;
        for (BufferIterator it = new BufferIterator(); it.hasNext();) {
            if (it.nextBuffer().isModified())
                ++count;
        }
        FastStringBuffer sb = new FastStringBuffer("Buffers");
        if (count > 0) {
            sb.append(" (");
            sb.append(count);
            sb.append(" modified)");
        }
        return sb.toString();
    }

    private synchronized void updateLabel()
    {
        sidebar.setBufferListLabelText(getLabelText());
        updateFlag &= ~SIDEBAR_MODIFIED_BUFFER_COUNT;
    }

    public void refresh()
    {
        final ArrayList arrayList = new ArrayList();

        for (BufferIterator it = new BufferIterator(); it.hasNext();) {
            Buffer buf = it.nextBuffer();
            if (buf.isPrimary()) {
                arrayList.add(buf);
                // Add secondary buffer (if any) right after the corresponding
                // primary buffer.
                Buffer secondary = buf.getSecondary();
                if (secondary != null)
                    arrayList.add(secondary);
            }
        }
        final Object[] listData = arrayList.toArray();
        if (SwingUtilities.isEventDispatchThread())
            setListData(listData);
        else {
            Runnable r = new Runnable() {
                public void run()
                {
                    setListData(listData);
                }
            };
            SwingUtilities.invokeLater(r);
        }
    }

    private void switchToBuffer()
    {
        Object obj = getSelectedValue();
        if (obj != null) {
            Editor editor = sidebar.getEditor();
            if (Editor.preferences().getIntegerProperty(Property.REORDER_BUFFERS) > 1)
                editor.makeNext((Buffer)obj);
            editor.switchToBuffer((Buffer)obj);
            Editor.currentEditor().setFocusToDisplay();
            editor.updateDisplay();
        }
    }

    private void closeSelectedBuffers()
    {
        int index = getSelectedIndex();
        Editor editor = sidebar.getEditor();
        Object[] array = getSelectedValues();
        for (int i = 0; i < array.length; i++)
            editor.maybeKillBuffer((Buffer)array[i]);
        EditorIterator iter = new EditorIterator();
        while (iter.hasNext())
            iter.nextEditor().updateDisplay();
        for (int i = 0; i < Editor.getFrameCount(); i++) {
            Frame frame = Editor.getFrame(i);
            Sidebar sidebar = frame.getSidebar();
            if (sidebar != null) {
                sidebar.setUpdateFlag(SIDEBAR_BUFFER_LIST_ALL);
                SidebarBufferList sidebarBufferList = sidebar.getBufferList();
                if (sidebarBufferList != null)
                    sidebarBufferList.updateBufferList();
            }
        }
        if (index >= 0) {
            if (index > getModel().getSize()-1)
                index = getModel().getSize()-1;
            setSelectedIndex(index);
            ensureIndexIsVisible(index);
        }
    }

    private void saveSelectedBuffers()
    {
        Editor editor = sidebar.getEditor();
        Object[] array = getSelectedValues();
        for (int i = 0; i < array.length; i++)
            editor.save((Buffer) array[i]);
        Sidebar.repaintBufferListInAllFrames();
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getActionCommand().equals("close"))
            closeSelectedBuffers();
        else if (e.getActionCommand().equals("save"))
            saveSelectedBuffers();
    }

    private void showPopup(Component c, int x, int y)
    {
        popup = new JPopupMenu();
        JMenuItem menuItem = new JMenuItem("Save");
        menuItem.setActionCommand("save");
        menuItem.addActionListener(this);
        popup.add(menuItem);
        menuItem = new JMenuItem("Close");
        menuItem.setActionCommand("close");
        menuItem.addActionListener(this);
        popup.add(menuItem);
        popup.pack();
        popup.show(c, x, y);
    }

    public String getToolTipText(MouseEvent e)
    {
        String text = null;
        int index = locationToIndex(e.getPoint());
        if (index >= 0 && index < getModel().getSize()) {
            Buffer buffer = (Buffer) getModel().getElementAt(index);
            if (buffer.getFile() != null)
                text = buffer.getFile().netPath();
            else
                text = buffer.getTitle();
        }
        return text;
    }

    public void keyPressed(KeyEvent e)
    {
        final int keyCode = e.getKeyCode();
        // Mask off the bits we don't care about (Java 1.4).
        final int modifiers = e.getModifiers() & 0x0f;
        final Editor editor = sidebar.getEditor();
        switch (keyCode) {
            // Ignore modifier keystrokes.
            case KeyEvent.VK_SHIFT:
            case KeyEvent.VK_CONTROL:
            case KeyEvent.VK_ALT:
            case KeyEvent.VK_META:
                return;
            case KeyEvent.VK_ENTER:
                e.consume();
                switchToBuffer();
                if (modifiers == KeyEvent.ALT_MASK)
                    editor.toggleSidebar();
                return;
            case KeyEvent.VK_TAB:
                e.consume();
                if (modifiers == 0) {
                    if (sidebar.getBottomComponent() != null)
                        editor.setFocus((JComponent)sidebar.getBottomComponent());
                }
                return;
            case KeyEvent.VK_ESCAPE:
                e.consume();
                if (popup != null && popup.isVisible()) {
                    popup.setVisible(false);
                    popup = null;
                } else {
                    editor.getSidebar().setBuffer();
                    editor.getSidebar().updatePosition();
                    editor.setFocusToDisplay();
                }
                return;
            case KeyEvent.VK_DELETE:
                e.consume();
                closeSelectedBuffers();
                return;
        }
        editor.getDispatcher().setEnabled(false);
    }

    public void keyReleased(KeyEvent e)
    {
        e.consume();
        sidebar.getEditor().getDispatcher().setEnabled(true);
    }

    public void keyTyped(KeyEvent e)
    {
        e.consume();
    }

    public void mousePressed(MouseEvent e)
    {
        Editor editor = sidebar.getEditor();
        editor.ensureActive();
        // Mask off the bits we don't care about (Java 1.4).
        int modifiers = e.getModifiers() & 0x1f;
        if (modifiers == InputEvent.BUTTON1_MASK || modifiers == InputEvent.BUTTON2_MASK) {
            setSelectedIndex(locationToIndex(e.getPoint()));
            paintImmediately(0, 0, getWidth(), getHeight());
            switchToBuffer();
        } else if (modifiers == InputEvent.BUTTON3_MASK) {
            setSelectedIndex(locationToIndex(e.getPoint()));
            sidebar.getFrame().setFocus(this);
            paintImmediately(0, 0, getWidth(), getHeight());
        } else
            sidebar.getFrame().setFocus(this);
    }

    public void mouseReleased(MouseEvent e)
    {
    }

    public void mouseClicked(MouseEvent e)
    {
        if (e.getModifiers() == InputEvent.BUTTON3_MASK)
            showPopup(e.getComponent(), e.getX(), e.getY());
    }

    public void mouseMoved(MouseEvent e)
    {
        String text = getToolTipText(e);
        if (text == null)
            text = "";
        sidebar.getFrame().setStatusText(text);
    }

    public void mouseEntered(MouseEvent e)
    {
    }

    public void mouseExited(MouseEvent e)
    {
        final Frame frame = sidebar.getFrame();
        final StatusBar statusBar = frame.getStatusBar();
        if (statusBar != null) {
            statusBar.setText(null);
            statusBar.repaintNow();
        }

        // Force tool tip to be hidden.
        ToolTipManager.sharedInstance().setEnabled(false);
        ToolTipManager.sharedInstance().setEnabled(true);

        if (popup == null || !popup.isVisible()) {
            if (frame.getFocusedComponent() == this) {
                Editor editor = sidebar.getEditor();
                sidebar.setBuffer();
                editor.setFocusToDisplay();
            }
        }
    }

    public void mouseDragged(MouseEvent e)
    {
    }
}