/*
 * SidebarBufferTree.java
 *
 * Copyright (C) 2003 Mike Rutter, Peter Graves
 * $Id: SidebarBufferTree.java,v 1.1 2003-08-07 17:32:31 piso Exp $
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
import java.awt.Graphics;
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
import javax.swing.JList;
import javax.swing.JTree;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.ToolTipManager;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
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
        super(new DefaultTreeModel(new DefaultMutableTreeNode("")));
        this.sidebar = sidebar;
        setCellRenderer(new SidebarTreeCellRenderer(sidebar));
        addKeyListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
        // We support tooltip text.
        setToolTipText("");
        // There is only one root, so this will be a dummy that holds all of
        // the real nodes.
        setRootVisible(false);
        // There is a row height preference for the JList. Maybe either use it
        // for the tree, or create a new property specifically for the tree...
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
        DefaultTreeModel model = (DefaultTreeModel)getModel();
        model.setRoot(rootNode);
        // See if we should display the root handles or not.
        boolean showRootHandles = false;
        for (int i = 0, n = rootNode.getChildCount(); i < n; i++) {
            if (rootNode.getChildAt(i).getChildCount() > 0) {
                showRootHandles = true;
                break;
            }
        }
        setShowsRootHandles(showRootHandles);
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
        // Scroll active buffer to center of list.
        int[] rows = getSelectionRows();
        if (rows.length > 0 && rows[0] >= 0)
            scrollRowToCenter(rows[0]);
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

    /**
     * Convenience method for grabbing the last element of the given path,
     * getting the user object if it's a <code>DefaultMutableTreeNode</code>,
     * and returning it if it is a <code>Buffer</code>.  If the last element
     * is not a <code>DefaultMutableTreeNode</code>, or the user object is not
     * a <code>Buffer</code>, <code>null</code> will be returned.
     *
     * @param path      The tree path to extract the last element from.
     * @return          The <code>Buffer</code> that is the user object for the
     *                  last <code>DefaultMutableTreeNode</code> in the given
     *                  path.
     */
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
        DefaultMutableTreeNode node = getNodeForObject(buffer);
        if (node != null) {
            TreePath path = new TreePath(node.getPath());
            setSelectionPath(path);
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

    public void refresh()
    {
        if (SwingUtilities.isEventDispatchThread()) {
            initializeTreeStructure();
        } else {
            Runnable r = new Runnable() {
                public void run()
                {
                    initializeTreeStructure();
                }
            };
            SwingUtilities.invokeLater(r);
        }
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

    /**
     * Searches all of the nodes in the tree for the given user object.
     *
     * @param userObj   The <code>Buffer</code> or <code>BufferFolder</code>
     *                  to search for.
     * @return          The node with the specified object as its user object,
     *                  or <code>null</code>.
     */
    private DefaultMutableTreeNode getNodeForObject(Object userObj)
    {
        Enumeration enum = rootNode.breadthFirstEnumeration();
        while (enum.hasMoreElements()) {
            Object next = enum.nextElement();
            if (next instanceof DefaultMutableTreeNode) {
                Object obj =
                    ((DefaultMutableTreeNode)next).getUserObject();
                if (userObj.equals(obj)) {
                    return (DefaultMutableTreeNode)next;
                }
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

    private static class SidebarTreeCellRenderer extends DefaultTreeCellRenderer
    {
        private static ImageIcon openIcon =
            Utilities.getIconFromFile("dir_open.png");
        private static ImageIcon closedIcon =
            Utilities.getIconFromFile("dir_close.png");
        private static Color noFocusSelectionBackground = new Color(208, 208, 208);
        private static Border noFocusBorder;

        private Sidebar sidebar;
        private Color oldBackgroundSelectionColor;

        public SidebarTreeCellRenderer(Sidebar sidebar)
        {
            super();
            this.sidebar = sidebar;
            noFocusBorder = new EmptyBorder(1, 1, 1, 1);
            setOpaque(true);
            oldBackgroundSelectionColor = getBackgroundSelectionColor();
            setOpenIcon(openIcon);
            setClosedIcon(closedIcon);
        }

        public Component getTreeCellRendererComponent(JTree tree,
                                                      Object value,
                                                      boolean selected,
                                                      boolean expanded,
                                                      boolean leaf,
                                                      int row,
                                                      boolean hasFocus)
        {
            // value should always be a DefaultMutableTreeNode.
            if (value instanceof DefaultMutableTreeNode)
                value = ((DefaultMutableTreeNode)value).getUserObject();

            // Set up the appropriate leaf icon.
            Border innerBorder = null;
            // Let our super do its business.
            super.getTreeCellRendererComponent(tree, value, selected, expanded,
                                               leaf, row, hasFocus);

            if (value instanceof Buffer) {
                setText(value.toString());
                Buffer buffer = (Buffer) value;
                setIcon(buffer.getIcon());
                if (buffer.isSecondary())
                    innerBorder = new EmptyBorder(0, 10, 0, 0);
            } else if (value instanceof LocalTag) {
                LocalTag tag = (LocalTag) value;
                setText(tag.getSidebarText());
                setIcon(tag.getIcon());
            } else {
                setIcon(null);
            }

            Frame frame = sidebar.getFrame();
            if (selected) {
                if (frame.isActive() && tree.hasFocus())
                    setBackground(getBackgroundSelectionColor());
                else
                    setBackground(noFocusSelectionBackground);
                setForeground(getTextSelectionColor());
            } else {
                setBackground(getBackgroundNonSelectionColor());
                setForeground(getTextNonSelectionColor());
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
