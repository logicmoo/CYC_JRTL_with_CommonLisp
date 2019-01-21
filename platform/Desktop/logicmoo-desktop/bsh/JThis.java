/*****************************************************************************
 *                                                                           *
 *  This file is part of the BeanShell Java Scripting distribution.          *
 *  Documentation and updates may be found at http://www.beanshell.org/      *
 *                                                                           *
 *  Sun Public License Notice:                                               *
 *                                                                           *
 *  The contents of this file are subject to the Sun Public License Version  *
 *  1.0 (the "License"); you may not use this file except in compliance with *
 *  the License. A copy of the License is available at http://www.sun.com    * 
 *                                                                           *
 *  The Original Code is BeanShell. The Initial Developer of the Original    *
 *  Code is Pat Niemeyer. Portions created by Pat Niemeyer are Copyright     *
 *  (C) 2000.  All Rights Reserved.                                          *
 *                                                                           *
 *  GNU Public License Notice:                                               *
 *                                                                           *
 *  Alternatively, the contents of this file may be used under the terms of  *
 *  the GNU Lesser General Public License (the "LGPL"), in which case the    *
 *  provisions of LGPL are applicable instead of those above. If you wish to *
 *  allow use of your version of this file only under the  terms of the LGPL *
 *  and not to allow others to use your version of this file under the SPL,  *
 *  indicate your decision by deleting the provisions above and replace      *
 *  them with the notice and other provisions required by the LGPL.  If you  *
 *  do not delete the provisions above, a recipient may use your version of  *
 *  this file under either the SPL or the LGPL.                              *
 *                                                                           *
 *  Patrick Niemeyer (pat@pat.net)                                           *
 *  Author of Learning Java, O'Reilly & Associates                           *
 *  http://www.pat.net/~pat/                                                 *
 *                                                                           *
 *****************************************************************************/


package bsh;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import java.beans.*;

/**
	JThis is a dynamically loaded extension which extends This and adds 
	explicit support for AWT and JFC events, etc.  This is a backwards 
	compatability measure for JDK 1.2.  With 1.3+ there is a general 
	reflection proxy mechanism that allows the base This to implement 
	arbitrary interfaces.

	The NameSpace getThis() method will produce instances of JThis if 
	the java version is prior to 1.3 and swing is available...  (e.g. 1.2
	or 1.1 + swing installed)  

	Users of 1.1 without swing will have minimal interface support (just run()).
	
	Bsh doesn't run on 1.02 and below because there is no reflection! 

	Note: This module relies on features of Swing and will only compile
	with JDK1.2 or JDK1.1 + the swing package.  For other environments simply 
	do not compile this class.
*/
class JThis extends This implements
	// All core AWT listeners
	ActionListener, AdjustmentListener, ComponentListener,
	ContainerListener, FocusListener, ItemListener, KeyListener,
	MouseListener, MouseMotionListener, TextListener, WindowListener,
	PropertyChangeListener, 
	// All listeners in javax.swing.event as of Swing 1.1
	AncestorListener, CaretListener, CellEditorListener, ChangeListener,
	DocumentListener, HyperlinkListener, 
	InternalFrameListener, ListDataListener, ListSelectionListener, 
	MenuDragMouseListener, MenuKeyListener, MenuListener, MouseInputListener, 
	PopupMenuListener, TableColumnModelListener, TableModelListener, 
	TreeExpansionListener, TreeModelListener, TreeSelectionListener, 
	TreeWillExpandListener, UndoableEditListener
{

	JThis( NameSpace namespace, Interpreter declaringInterp ) { 
		super( namespace, declaringInterp );
	}

	@Override
	public String toString() {
		return "'this' reference (JThis) to Bsh object: " + namespace.getName();
	}

	void event(String name, Object event)
	{
		CallStack callstack = new CallStack( namespace );
		BshMethod method = null;

		// handleEvent gets all events
		try {
			method = namespace.getMethod( 
				"handleEvent", new Class [] { null } );
		} catch ( UtilEvalError e ) {/*squeltch*/  }

		if (method != null)
			try {
				method.invoke( 
					new Object[] { event }, declaringInterpreter, callstack, null );
			} catch(EvalError e) {
				declaringInterpreter.error(
					"local event hander method invocation error:" + e );
			}

		// send to specific event handler
		try {
			method = namespace.getMethod( name, new Class [] { null } );
		} catch ( UtilEvalError e ) { /*squeltch*/ }
		if (method != null)
			try {
				method.invoke( 
					new Object[] { event }, declaringInterpreter, callstack, null );
			} catch(EvalError e) {
				declaringInterpreter.error(
					"local event hander method invocation error:" + e );
			}
	}

	// Listener interfaces

    @Override
	public void ancestorAdded(AncestorEvent e) { event("ancestorAdded", e); }
    @Override
	public void ancestorRemoved(AncestorEvent e) { event("ancestorRemoved", e); }
    @Override
	public void ancestorMoved(AncestorEvent e) { event("ancestorMoved", e); }
    @Override
	public void caretUpdate(CaretEvent e) { event("caretUpdate", e); }
    @Override
	public void editingStopped(ChangeEvent e) { event("editingStopped", e); }
    @Override
	public void editingCanceled(ChangeEvent e) { event("editingCanceled", e); }
    @Override
	public void stateChanged(ChangeEvent e) { event("stateChanged", e); }
    @Override
	public void insertUpdate(DocumentEvent e) { event("insertUpdate", e); }
    @Override
	public void removeUpdate(DocumentEvent e) { event("removeUpdate", e); }
    @Override
	public void changedUpdate(DocumentEvent e) { event("changedUpdate", e); }
    @Override
	public void hyperlinkUpdate(HyperlinkEvent e) { event("internalFrameOpened", e); }
    @Override
	public void internalFrameOpened(InternalFrameEvent e) { event("internalFrameOpened", e); }
    @Override
	public void internalFrameClosing(InternalFrameEvent e) { event("internalFrameClosing", e); }
    @Override
	public void internalFrameClosed(InternalFrameEvent e) { event("internalFrameClosed", e); }
    @Override
	public void internalFrameIconified(InternalFrameEvent e) { event("internalFrameIconified", e); }
    @Override
	public void internalFrameDeiconified(InternalFrameEvent e) { event("internalFrameDeiconified", e); }
    @Override
	public void internalFrameActivated(InternalFrameEvent e) { event("internalFrameActivated", e); }
    @Override
	public void internalFrameDeactivated(InternalFrameEvent e) { event("internalFrameDeactivated", e); }
    @Override
	public void intervalAdded(ListDataEvent e) { event("intervalAdded", e); }
    @Override
	public void intervalRemoved(ListDataEvent e) { event("intervalRemoved", e); }
    @Override
	public void contentsChanged(ListDataEvent e) { event("contentsChanged", e); }
  	@Override
	public void valueChanged(ListSelectionEvent e) { event("valueChanged", e); }
    @Override
	public void menuDragMouseEntered(MenuDragMouseEvent e) { event("menuDragMouseEntered", e); }
    @Override
	public void menuDragMouseExited(MenuDragMouseEvent e) { event("menuDragMouseExited", e); }
    @Override
	public void menuDragMouseDragged(MenuDragMouseEvent e) { event("menuDragMouseDragged", e); }
    @Override
	public void menuDragMouseReleased(MenuDragMouseEvent e) { event("menuDragMouseReleased", e); }
    @Override
	public void menuKeyTyped(MenuKeyEvent e) { event("menuKeyTyped", e); }
    @Override
	public void menuKeyPressed(MenuKeyEvent e) { event("menuKeyPressed", e); }
    @Override
	public void menuKeyReleased(MenuKeyEvent e) { event("menuKeyReleased", e); }
    @Override
	public void menuSelected(MenuEvent e) { event("menuSelected", e); }
    @Override
	public void menuDeselected(MenuEvent e) { event("menuDeselected", e); }
    @Override
	public void menuCanceled(MenuEvent e) { event("menuCanceled", e); }
    @Override
	public void popupMenuWillBecomeVisible(PopupMenuEvent e) { event("popupMenuWillBecomeVisible", e); }
    @Override
	public void popupMenuWillBecomeInvisible(PopupMenuEvent e) { event("popupMenuWillBecomeInvisible", e); }
    @Override
	public void popupMenuCanceled(PopupMenuEvent e) { event("popupMenuCanceled", e); }
    @Override
	public void columnAdded(TableColumnModelEvent e) { event("columnAdded", e); }
    @Override
	public void columnRemoved(TableColumnModelEvent e) { event("columnRemoved", e); }
    @Override
	public void columnMoved(TableColumnModelEvent e) { event("columnMoved", e); }
    @Override
	public void columnMarginChanged(ChangeEvent e) { event("columnMarginChanged", e); }
    @Override
	public void columnSelectionChanged(ListSelectionEvent e) { event("columnSelectionChanged", e); }
    @Override
	public void tableChanged(TableModelEvent e) { event("tableChanged", e); }
    @Override
	public void treeExpanded(TreeExpansionEvent e) { event("treeExpanded", e); }
    @Override
	public void treeCollapsed(TreeExpansionEvent e) { event("treeCollapsed", e); }
    @Override
	public void treeNodesChanged(TreeModelEvent e) { event("treeNodesChanged", e); }
    @Override
	public void treeNodesInserted(TreeModelEvent e) { event("treeNodesInserted", e); }
    @Override
	public void treeNodesRemoved(TreeModelEvent e) { event("treeNodesRemoved", e); }
    @Override
	public void treeStructureChanged(TreeModelEvent e) { event("treeStructureChanged", e); }
    @Override
	public void valueChanged(TreeSelectionEvent e) { event("valueChanged", e); }
    @Override
	public void treeWillExpand(TreeExpansionEvent e) { event("treeWillExpand", e); }
    @Override
	public void treeWillCollapse(TreeExpansionEvent e) { event("treeWillCollapse", e); }
    @Override
	public void undoableEditHappened(UndoableEditEvent e) { event("undoableEditHappened", e); }

	// Listener interfaces
	@Override
	public void actionPerformed(ActionEvent e) { event("actionPerformed", e); }
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) { event("adjustmentValueChanged", e); }
	@Override
	public void componentResized(ComponentEvent e) { event("componentResized", e); }
	@Override
	public void componentMoved(ComponentEvent e) { event("componentMoved", e); }
	@Override
	public void componentShown(ComponentEvent e) { event("componentShown", e); }
	@Override
	public void componentHidden(ComponentEvent e) { event("componentHidden", e); }
	@Override
	public void componentAdded(ContainerEvent e) { event("componentAdded", e); }
	@Override
	public void componentRemoved(ContainerEvent e) { event("componentRemoved", e); }
	@Override
	public void focusGained(FocusEvent e) { event("focusGained", e); }
	@Override
	public void focusLost(FocusEvent e) { event("focusLost", e); }
	@Override
	public void itemStateChanged(ItemEvent e) { event("itemStateChanged", e); }
	@Override
	public void keyTyped(KeyEvent e) { event("keyTyped", e); }
	@Override
	public void keyPressed(KeyEvent e) { event("keyPressed", e); }
	@Override
	public void keyReleased(KeyEvent e) { event("keyReleased", e); }
	@Override
	public void mouseClicked(MouseEvent e) { event("mouseClicked", e); }
	@Override
	public void mousePressed(MouseEvent e) { event("mousePressed", e); }
	@Override
	public void mouseReleased(MouseEvent e) { event("mouseReleased", e); }
	@Override
	public void mouseEntered(MouseEvent e) { event("mouseEntered", e); }
	@Override
	public void mouseExited(MouseEvent e) { event("mouseExited", e); }
	@Override
	public void mouseDragged(MouseEvent e) { event("mouseDragged", e); }
	@Override
	public void mouseMoved(MouseEvent e) { event("mouseMoved", e); }
	@Override
	public void textValueChanged(TextEvent e) { event("textValueChanged", e); }
	@Override
	public void windowOpened(WindowEvent e) { event("windowOpened", e); }
	@Override
	public void windowClosing(WindowEvent e) { event("windowClosing", e); }
	@Override
	public void windowClosed(WindowEvent e) { event("windowClosed", e); }
	@Override
	public void windowIconified(WindowEvent e) { event("windowIconified", e); }
	@Override
	public void windowDeiconified(WindowEvent e) { event("windowDeiconified", e); }
	@Override
	public void windowActivated(WindowEvent e) { event("windowActivated", e); }
	@Override
	public void windowDeactivated(WindowEvent e) { event("windowDeactivated", e); }

	@Override
	public void propertyChange(PropertyChangeEvent e) { 
		event("propertyChange", e ); }
    public void vetoableChange(PropertyChangeEvent e) {
		event("vetoableChange", e ); }

    public boolean imageUpdate(java.awt.Image img, int infoflags,
                               int x, int y, int width, int height) {

		BshMethod method = null;
		try {
			method = namespace.getMethod( "imageUpdate",
				new Class [] { null, null, null, null, null, null } );
		} catch ( UtilEvalError e ) {/*squeltch*/ }

		if(method != null)
			try {
				CallStack callstack = new CallStack( namespace );
				method.invoke( 
					new Object[] { 
						img, new Primitive(infoflags), new Primitive(x), 
						new Primitive(y), new Primitive(width), 
						new Primitive(height) }, 
					declaringInterpreter, callstack, null
				);
			} catch(EvalError e) {
				declaringInterpreter.error(
					"local event handler imageUpdate: method invocation error:" + e );
			}
		return true;
	}

}

