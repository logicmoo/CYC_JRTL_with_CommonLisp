/*
 * SidebarBufferTree.java
 *
 * Copyright (C) 2003-2004 Mike Rutter, Peter Graves
 * $Id: SidebarBufferTree.java,v 1.8 2004-03-19 01:35:28 piso Exp $
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
import java.awt.Point;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTree;
import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.ToolTipManager;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

// Consider an option to make the folders either the first things or last
// things in the buffer list. That way all of the folders will be listed
// together, and all of the buffers will be listed together.
public final class SidebarBufferTree extends SidebarTree implements Constants,
    NavigationComponent, ActionListener, KeyListener, MouseListener,
    MouseMotionListener
{
    private JPopupMenu popup;
    private int updateFlag;
    private DefaultMutableTreeNode rootNode;
    private Sidebar sidebar;

    public SidebarBufferTree(Sidebar sidebar)
    {
        super(null);
        this.sidebar = sidebar;
        setCellRenderer(new SidebarTreeCellRenderer(sidebar));
        setFocusTraversalKeysEnabled(false);
        addKeyListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
        setToolTipText("");
        setRootVisible(false);
    }

    // Grabs the rough tree structure from the current session and builds the
    // data tree out of it. Also caches the session name so that we can check
    // against that later on. If the session changes, this needs to be called
    // again to repopulate the tree.
    private void initializeTreeStructure()
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
        // Re-create the tree.
        rootNode = new DefaultMutableTreeNode("");
        buildTreeFromList(rootNode, arrayList);
        setModel(new DefaultTreeModel(rootNode));
    }

    private void buildTreeFromList(DefaultMutableTreeNode node, List buffers)
    {
        Iterator iter = buffers.iterator();
        while (iter.hasNext()) {
            Object next = iter.next();
            if (next instanceof Buffer) {
                Buffer buffer = (Buffer) next;
                node.add(new DefaultMutableTreeNode(buffer));
            }
        }
    }

    public synchronized void setUpdateFlag(int mask)
    {
        updateFlag |= mask;
    }

    public synchronized void updateBufferList()
    {
        if (!SwingUtilities.isEventDispatchThread())
            Debug.bug();
        if ((updateFlag & SIDEBAR_BUFFER_LIST_CHANGED) != 0) {
            refresh();
            updateFlag |= SIDEBAR_REPAINT_BUFFER_LIST;
        }
        if ((updateFlag & SIDEBAR_MODIFIED_BUFFER_COUNT) != 0) {
            // When this happens, we need to redraw at least one of the icons,
            // so make sure that a repaint gets scheduled.
            updateFlag |= SIDEBAR_REPAINT_BUFFER_LIST;
            updateLabel();
        }
        // Select active buffer.
        Buffer buffer = sidebar.getEditor().getBuffer();
        if (buffer != getSelectedBuffer())
            setSelectedBuffer(buffer);
        else
            scrollPathToVisible(getSelectionPath());
        boolean repaint = (updateFlag & SIDEBAR_REPAINT_BUFFER_LIST) != 0;
        updateFlag = 0;
        if (repaint) {
            // Schedule a repaint.
            repaint();
        }
    }

    public Buffer getSelectedBuffer()
    {
        if (getSelectionCount() > 0)
            return getBufferFromPath(getSelectionPath());
        else
            return null;
    }

    public Buffer[] getSelectedBuffers()
    {
        int numSelected = getSelectionCount();
        // Check to make sure there is something selected.
        if (numSelected <= 0)
            return new Buffer[0];
        Buffer[] buffers = new Buffer[numSelected];
        // Grab active buffers
        TreePath[] paths = getSelectionPaths();
        for (int i = 0; i < paths.length; i++)
            buffers[i] = getBufferFromPath(paths[i]);
        return buffers;
    }

    public int[] getSelectionRows()
    {
        int[] rows = super.getSelectionRows();
        if (rows == null)
            rows = new int[0];
        return rows;
    }

    private Buffer getBufferFromPath(TreePath path)
    {
        TreeNode endNode = (TreeNode)path.getLastPathComponent();
        if (endNode instanceof DefaultMutableTreeNode) {
            Object obj = ((DefaultMutableTreeNode)endNode).getUserObject();
            if (obj instanceof Buffer)
                return (Buffer) obj;
        }
        return null;
    }

    public void setSelectedBuffer(Buffer buffer)
    {
        DefaultMutableTreeNode node = findNodeForObject(buffer);
        if (node != null) {
            TreePath path = new TreePath(node.getPath());
            setSelectionPath(path);
            scrollPathToVisible(path);
        }
    }

    public void scrollPathToVisible(TreePath path)
    {
	if (path != null) {
	    makeVisible(path);
	    Rectangle bounds = getPathBounds(path);
	    if (bounds != null) {
                bounds.y = Math.max(bounds.y - 17, 0);
                bounds.height = bounds.height + 34;
		scrollRectToVisible(bounds);
		if (accessibleContext != null)
		    ((AccessibleJTree)accessibleContext).fireVisibleDataPropertyChange();
	    }
	}
    }

    public String getLabelText()
    {
        int total = 0;
        int modified = 0;
        for (BufferIterator it = new BufferIterator(); it.hasNext();) {
            ++total;
            if (it.nextBuffer().isModified())
                ++modified;
        }
        FastStringBuffer sb = new FastStringBuffer("Buffers");
        sb.append(" (");
        sb.append(total);
        if (modified > 0) {
            sb.append("; ");
            sb.append(modified);
            sb.append(" modified");
        }
        sb.append(')');
        return sb.toString();
    }

    private synchronized void updateLabel()
    {
        sidebar.setBufferListLabelText(getLabelText());
        updateFlag &= ~SIDEBAR_MODIFIED_BUFFER_COUNT;
    }

    private final Runnable refreshRunnable = new Runnable() {
        public void run()
        {
            if ((updateFlag & SIDEBAR_MODIFIED_BUFFER_COUNT) != 0)
                updateLabel();
            initializeTreeStructure();
        }
    };

    public void refresh()
    {
        if (SwingUtilities.isEventDispatchThread())
            refreshRunnable.run();
        else
            SwingUtilities.invokeLater(refreshRunnable);
    }

    public void updatePosition()
    {
    }

    private void switchToBuffer()
    {
        Buffer buffer = getSelectedBuffer();
        if (buffer != null) {
            Editor editor = sidebar.getEditor();
            if (Editor.preferences().getIntegerProperty(Property.REORDER_BUFFERS) > 1)
                editor.makeNext(buffer);
            editor.switchToBuffer(buffer);
            Editor.currentEditor().setFocusToDisplay();
            editor.updateDisplay();
        }
    }

    private void closeBuffers(Buffer[] array)
    {
        Editor editor = sidebar.getEditor();
        for (int i = 0; i < array.length; i++)
            editor.maybeKillBuffer(array[i]);
        EditorIterator iter = new EditorIterator();
        while (iter.hasNext())
            iter.nextEditor().updateDisplay();
        for (int i = 0; i < Editor.getFrameCount(); i++) {
            Frame frame = Editor.getFrame(i);
            Sidebar sidebar = frame.getSidebar();
            if (sidebar != null) {
                sidebar.setUpdateFlag(SIDEBAR_BUFFER_LIST_ALL);
                SidebarBufferTree sidebarBufferTree = sidebar.getBufferTree();
                if (sidebarBufferTree != null)
                    sidebarBufferTree.updateBufferList();
            }
        }
    }

    private void closeSelectedBuffers() {
        int index = -1;
        int[] rows = getSelectionRows();
        if (rows.length > 0)
            index = rows[0];
        Buffer[] array = getSelectedBuffers();
        closeBuffers(array);
        if (index >= 0) {
            // This works if getRowCount() returns the number of rows that can
            // be displayed with the current expansions, as opposed to the
            // number of rows that are currently being drawn.
            if (index > getRowCount() - 1)
                index = getRowCount() - 1;
            setSelectionRow(index);
            scrollRowToVisible(index);
        }
    }

    private void saveSelectedBuffers()
    {
        Editor editor = sidebar.getEditor();
        Buffer[] array = getSelectedBuffers();
        for (int i = 0; i < array.length; i++)
            editor.save(array[i]);
        Sidebar.repaintBufferListInAllFrames();
    }

    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();
        if (command.equals("close"))
            closeSelectedBuffers();
        else if (command.equals("save"))
            saveSelectedBuffers();
    }

    private void showPopup(Component c, int x, int y)
    {
        popup = new JPopupMenu();
        TreePath path = getPathForLocation(x, y);
        String bufferName = null;
        if (path != null) {
            Object last = path.getLastPathComponent();
            Object value = ((DefaultMutableTreeNode)last).getUserObject();
            if (value instanceof Buffer) {
                bufferName = last.toString();
            }
        }
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
        Point p = e.getPoint();
        int index = getRowForLocation(p.x, p.y);
        if (index >= 0 && index < getRowCount()) {
            TreePath path = getPathForRow(index);
            Buffer buffer = getBufferFromPath(path);
            if (buffer == null)
                return null;
            File file = buffer.getFile();
            if (file != null)
                text = file.isRemote() ? file.netPath() : file.canonicalPath();
            else
                text = buffer.getTitle();
        }
        return text;
    }

    private DefaultMutableTreeNode findNodeForObject(Object userObj)
    {
        Enumeration enumeration = rootNode.breadthFirstEnumeration();
        while (enumeration.hasMoreElements()) {
            Object next = enumeration.nextElement();
            if (next instanceof DefaultMutableTreeNode) {
                Object obj = ((DefaultMutableTreeNode)next).getUserObject();
                if (userObj.equals(obj))
                    return (DefaultMutableTreeNode) next;
            }
        }
        return null;
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
                    if (sidebar.getBottomComponent() != null) {
                        sidebar.setBuffer();
                        editor.setFocus((JComponent)sidebar.getBottomComponent());
                    }
                }
                return;
            case KeyEvent.VK_ESCAPE:
                e.consume();
                if (popup != null && popup.isVisible()) {
                    popup.setVisible(false);
                    popup = null;
                } else {
                    sidebar.setBuffer();
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
        Point p = e.getPoint();
        if (modifiers == InputEvent.BUTTON1_MASK ||
            modifiers == InputEvent.BUTTON2_MASK)
        {
            setSelectionRow(getRowForLocation(p.x, p.y));
            paintImmediately(0, 0, getWidth(), getHeight());
            switchToBuffer();
        } else if (modifiers == InputEvent.BUTTON3_MASK) {
            //setSelectedIndex(locationToIndex(e.getPoint()));
            setSelectionRow(getRowForLocation(p.x, p.y));
            sidebar.getFrame().setFocus(this);
            paintImmediately(0, 0, getWidth(), getHeight());
        } else {
            sidebar.getFrame().setFocus(this);
        }
    }

    public void mouseReleased(MouseEvent e)
    {
    }

    public void mouseClicked(MouseEvent e)
    {
        // Mask off the bits we don't care about (Java 1.4).
        int modifiers = e.getModifiers() & 0x1f;
        Point p = e.getPoint();
        // If the user clicks with the first or second mouse button while
        // there is a popup menu visible, the tree doesn't get painted
        // properly unless we repaint it here.
        if (modifiers == InputEvent.BUTTON1_MASK ||
            modifiers == InputEvent.BUTTON2_MASK)
        {
            setSelectionRow(getRowForLocation(p.x, p.y));
            paintImmediately(0, 0, getWidth(), getHeight());
            switchToBuffer();
        } else if (e.getModifiers() == InputEvent.BUTTON3_MASK) {
            showPopup(e.getComponent(), e.getX(), e.getY());
        }
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

    private static class SidebarTreeCellRenderer extends JLabel
        implements TreeCellRenderer
    {
        private static final Color textForeground =
            UIManager.getColor("Tree.textForeground");
        private static final Color textBackground =
            UIManager.getColor("Tree.textBackground");
        private static final Color selectionForeground =
            UIManager.getColor("Tree.selectionForeground");
        private static final Color selectionBackground =
            UIManager.getColor("Tree.selectionBackground");
        private static final Color noFocusSelectionBackground =
            new Color(208, 208, 208);
        private static final Border noFocusBorder =
            new EmptyBorder(1, 1, 1, 1);

        private Sidebar sidebar;

        public SidebarTreeCellRenderer(Sidebar sidebar)
        {
            super();
            this.sidebar = sidebar;
            setOpaque(true);
        }

        public Component getTreeCellRendererComponent(JTree tree, Object value,
                                                      boolean selected,
                                                      boolean expanded,
                                                      boolean leaf, int row,
                                                      boolean hasFocus)
        {
            Object userObject = null;
            if (value instanceof DefaultMutableTreeNode)
                userObject = ((DefaultMutableTreeNode)value).getUserObject();
            Border innerBorder = null;
            if (userObject instanceof Buffer) {
                setText(userObject.toString());
                Buffer buffer = (Buffer) userObject;
                setIcon(buffer.getIcon());
                if (buffer.isSecondary())
                    innerBorder = new EmptyBorder(0, 10, 0, 0);
            } else
                setIcon(null);
            Frame frame = sidebar.getFrame();
            if (selected) {
                if (frame.isActive() && tree.hasFocus())
                    setBackground(selectionBackground);
                else
                    setBackground(noFocusSelectionBackground);
                setForeground(selectionForeground);
            } else {
                setBackground(textBackground);
                setForeground(textForeground);
            }
            setEnabled(tree.isEnabled());
            setFont(tree.getFont());
            Border outerBorder;
            if (hasFocus)
                outerBorder = UIManager.getBorder("List.focusCellHighlightBorder");
            else
                outerBorder = noFocusBorder;
            setBorder(new CompoundBorder(outerBorder, innerBorder));
            return this;
        }
    }
}
