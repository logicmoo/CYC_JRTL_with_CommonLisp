package org.appdapter.gui.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.AbstractAction;
import javax.swing.AbstractButton;
import javax.swing.Action;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.WindowConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoManager;

import org.appdapter.core.debug.UIAnnotations.UISalient;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.repo.ModelAsTurtleEditor;
import org.appdapter.gui.trigger.MouseAdapterWithAppendablePopup;

import com.jidesoft.swing.SearchableUtils;

public class SimpleTextEditor extends JAutoResizingTextArea implements ActionListener, DocumentListener, WindowConstants, ClipboardOwner {

	/**
	* Empty implementation of the ClipboardOwner interface.
	*/
	public void lostOwnership(Clipboard aClipboard, Transferable aContents) {
		//do nothing
	}

	/**
	* Place a String on the clipboard, and make this class the
	* owner of the Clipboard's contents.
	*/
	public void setClipboardContents(String aString) {
		StringSelection stringSelection = new StringSelection(aString);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, this);
	}

	private UndoManager undoManager = new UndoManager();
	private UndoAction undoAction = new UndoAction();
	private RedoAction redoAction = new RedoAction();

	public class EditKeysAdapter extends KeyAdapter {
		boolean ctrlPressed = false;

		@Override public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {

			case KeyEvent.VK_CONTROL:
				ctrlPressed = true;
				break;
			}

			if (ctrlPressed) {
				handleKey(e, true);
			}
		}

		@Override public void keyReleased(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_CONTROL:
				ctrlPressed = false;
				break;
			}

			if (ctrlPressed) {
				//handleKey(e, true);
			}
		}
	}

	class UndoListener implements UndoableEditListener {
		public void undoableEditHappened(UndoableEditEvent e) {
			undoManager.addEdit(e.getEdit());
			undoAction.update();
			redoAction.update();
		}
	}

	class UndoAction extends AbstractAction {
		public UndoAction() {
			update();
		}

		public Object getValue(String key) {
			update();
			return super.getValue(key);
		}

		public void actionPerformed(ActionEvent e) {
			if (this.isEnabled()) {
				undo();
			}
		}

		public void update() {
			this.putValue(Action.NAME, undoManager.getUndoPresentationName());
			this.setEnabled(undoManager.canUndo());
		}
	}

	class RedoAction extends AbstractAction {
		public RedoAction() {
			update();
		}

		public Object getValue(String key) {
			update();
			return super.getValue(key);
		}

		public void actionPerformed(ActionEvent e) {
			if (this.isEnabled()) {
				redo();
			}
		}

		public void update() {
			this.putValue(Action.NAME, undoManager.getRedoPresentationName());
			this.setEnabled(undoManager.canRedo());
		}

	}

	public void redo() {
		undoManager.redo();
		undoAction.update();
		redoAction.update();
	}

	public void undo() {
		undoManager.redo();
		undoAction.update();
		redoAction.update();
	}

	/**
	* Get the String residing on the clipboard.
	*
	* @return any text found on the Clipboard; if none found, return an
	* empty String.
	*/
	public String getClipboardContents() {
		String result = "";
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		//odd: the Object param of getContents is not currently used
		Transferable contents = clipboard.getContents(null);
		boolean hasTransferableText = (contents != null) && contents.isDataFlavorSupported(DataFlavor.stringFlavor);
		if (hasTransferableText) {
			try {
				result = (String) contents.getTransferData(DataFlavor.stringFlavor);
			} catch (UnsupportedFlavorException ex) {
				//highly unlikely since we are using a standard DataFlavor
				System.out.println(ex);
				ex.printStackTrace();
			} catch (IOException ex) {
				System.out.println(ex);
				ex.printStackTrace();
			}
		}
		return result;

	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenuBar mBar = null;
	//private JMenu fileMenu, 
	//JMenu cutsMenu; // Menu references
	//private JMenuItem cutItem, copyItem, pasteItem, selectItem;
	//private JMenuItem quitItem, openItem; // File items
	//private JMenuItem saveItem, saveAsItem, saveExitItem; // more File items
	private SimpleTextEditor display = this;
	private Vector<String> recentCuts = new Vector<String>();

	private File currentFile = null;//new File("Untitled");
	private String startDir; // the directory form where the editor was started
	private JFileChooser openFileChooser, saveFileChooser;

	// Keeps track of if file has been changed since last change
	public boolean fileSaved = true;

	//private JTextField statusLine = new JTextField(contentPane.getWidth());
	private JTextField statusLine = new JTextField(10);

	private JMenu cutsMenu, textColorMenu;
	private JMenuItem fontItem, tabItem;
	private JMenuItem[] colorItems;
	private String[] fontValues = { "10", "12", "14", "16", "18", "20" };
	private Font defaultFont;
	private int defaultFontSize = 10;;
	private int defaultTabSize;
	private String[] colorValues = { "red", "green", "blue", "black", "orange", "cyan", "magenta" };
	public JJPanel contentPane = new JJPanel();
	private MouseAdapterWithAppendablePopup appendablePopup = new MouseAdapterWithAppendablePopup() {
		@Override public void mouseReleased(MouseEvent e) {
			this.lastEvent = e;
			mouseEvent(e);
		}

		@Override public void mousePressed(MouseEvent e) {
			this.lastEvent = e;
			mouseEvent(e);
		}

	};

	/**
	  SimpleTextEditor() constructor sets the layout for the GUI
	   and calls methods to initialize the menus.
	*/
	public SimpleTextEditor() {
		//contentPane.setTitle("Simple Text Editor");
		contentPane.setDefaultCloseOperation(ModelAsTurtleEditor.DO_NOTHING_ON_CLOSE);

		contentPane.setLayout(new BorderLayout());
		// make text area scrollable
		JScrollPane scroller = new JScrollPane(display, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroller.setPreferredSize(new Dimension(600, 400));
		contentPane.add("Center", scroller);
		contentPane.add(new JScrollPane(display, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));

		display.setLineWrap(true);
		display.getDocument().addDocumentListener(this);
		display.addKeyListener(new EditKeysAdapter());
		contentPane.add("South", statusLine);
		statusLine.setEditable(false);

		//initFileMenu(); // Create the menus
		if (false) {
			mBar = new JMenuBar(); // Create the menu bar
			initEditMenu(false);
			contentPane.setJMenuBar(mBar);
			mBar = null;
		}

		startDir = System.getProperty("user.dir");
		openFileChooser = new JFileChooser(startDir);
		saveFileChooser = new JFileChooser(startDir);
		saveFileChooser.setDialogTitle("Save As");

		addMouseListener(appendablePopup);
		SearchableUtils.installSearchable(this);
		getDocument().addUndoableEditListener(new UndoListener());
	}

	protected void handleKey(KeyEvent e, boolean ctrl) {
		if (ctrl) {
			switch (e.getKeyChar()) {
			case 'c': {
				copy();
				return;
			}
			case 'v': {
				paste();
				return;
			}
			case 'x': {
				cut();
				return;
			}
			case 'z': {
				undo();
				return;
			}
			case 'y': {
				redo();
				return;
			}
			case 'a': {
				selectAll();
				return;
			}

			case 's': {
				fileSave();
				return;
			}
			case 'o': {
				fileOpenAndRead();
				return;
			}

			default: {
			}
			}
		}
	}

	public void mouseEvent(MouseEvent e) {
		if (e.isPopupTrigger()) {
			showMenu(e);
		}
	}

	public void showMenu(MouseEvent e) {
		showMenu(e.getX() + 5, e.getY() + 5, e);
	}

	public void showMenu(int x, int y, MouseEvent e) {
		JPopupMenu popup = new JPopupMenu("appendable..");
		appendablePopup.setPopup(popup);
		for (Action m : getActions()) {
			popup.add(m);
		}
		popup.show(e.getComponent(), x, y);
	}

	public Action[] getActions() {
		ArrayList actions = new ArrayList<Action>();
		for (Component c : initEditMenu(true).getMenuComponents()) {
			Action act = null;
			if (c instanceof JMenuItem) {
				JMenuItem mi = (JMenuItem) c;
				act = mi.getAction();
			} else if (c instanceof AbstractButton) {
				AbstractButton mi = (AbstractButton) c;
				act = mi.getAction();
			}
			if (act != null)
				actions.add(act);
		}
		return (Action[]) actions.toArray(new Action[actions.size()]);
	}

	/**
	    Creates the edit menu and adds its individual menu items. 
		Note the each menu item is registered with an ActionListener.
	 */
	public JMenu initEditMenu(boolean addSubs) {

		JMenu editMenu = new JMenu("Edit"); // Create the edit menu
		if (mBar != null)
			mBar.add(editMenu); //  and add it to menu bar

		addMenuItem(editMenu, "Cut");

		addMenuItem(editMenu, "Copy");

		addMenuItem(editMenu, "Paste");

		editMenu.addSeparator();

		addMenuItem(editMenu, "Select All"); // Select item

		editMenu.addSeparator();

		addMenuItem(editMenu, "Undo", new UndoAction());

		addMenuItem(editMenu, "Redo", new RedoAction());

		editMenu.addSeparator();

		JMenu rcParent = new JMenu("Recent Cuts"); // Recent cuts submenu

		if (addSubs)
			editMenu.add(rcParent);

		if (mBar != null) {
			cutsMenu = rcParent;
		}
		addRecentCuts(rcParent);
		editMenu.addSeparator();
		if (addSubs)
			editMenu.add(initFileMenu());

		if (addSubs)
			editMenu.add(initPreferencesMenu());
		return editMenu;
	}

	public void addRecentCuts(JMenu cutsMenu) {
		if (cutsMenu == null)
			return;
		cutsMenu.removeAll();
		for (int k = 0; k < recentCuts.size(); k++) {
			String str = (String) recentCuts.elementAt(k);
			JMenuItem item = new JMenuItem(maxSize(str, 60));
			item.putClientProperty("paste", str);
			cutsMenu.add(item);
			item.addActionListener(this);
		}
	}

	private String maxSize(String elementAt, int i) {
		int len = elementAt.length();
		if (len < (i + 2))
			return elementAt;
		i = i / 2;
		return elementAt.substring(0, i) + "..." + elementAt.substring(len - i - 1, i);
	}

	public JMenuItem addMenuItem(JMenu editMenu, String label) {
		JMenuItem pasteItem = new JMenuItem(label);
		pasteItem.addActionListener(this);
		editMenu.add(pasteItem);
		return pasteItem;
	}

	public JMenuItem addMenuItem(JMenu editMenu, String label, Action act) {
		JMenuItem pasteItem = new JMenuItem(act);
		pasteItem.setText(label);
		editMenu.add(pasteItem);
		return pasteItem;
	}

	/**
	   Creates the preferences menu and adds its individual menu items. 
	*/
	public JMenu initPreferencesMenu() {
		JMenu preferencesMenu = new JMenu("Preferences");
		if (mBar != null)
			mBar.add(preferencesMenu); //  and add it to menu bar

		fontItem = new JMenuItem("Font Size"); // Cut item
		fontItem.addActionListener(this);
		preferencesMenu.add(fontItem);

		tabItem = new JMenuItem("Tab Size"); // Cut item
		tabItem.addActionListener(this);
		preferencesMenu.add(tabItem);

		textColorMenu = new JMenu("Text Color");
		colorItems = new JMenuItem[colorValues.length];
		for (int i = 0; i < colorValues.length; i++) {
			colorItems[i] = new JMenuItem(colorValues[i]);
			colorItems[i].addActionListener(this);
			textColorMenu.add(colorItems[i]);
		}
		preferencesMenu.add(textColorMenu);
		return preferencesMenu;
	}

	/**
	    Creates the file menu and adds its individual menu items. 
		Note the each menu item is registered with an ActionListener.
	 */
	private JMenu initFileMenu() {
		JMenu fileMenu = new JMenu("File"); // Create the file menu
		if (mBar != null)
			mBar.add(fileMenu); // and add it to the menu bar
		addMenuItem(fileMenu, "Open"); // Open item
		addMenuItem(fileMenu, "Save"); // Save item
		addMenuItem(fileMenu, "Save As"); // Save As item

		fileMenu.addSeparator(); // Logical separator

		addMenuItem(fileMenu, "Save-Exit"); // Save item
		addMenuItem(fileMenu, "Quit"); // Quit item
		return fileMenu;
	}

	/**
		Listen for text changes to update the status line.
	*/
	public void changedUpdate(DocumentEvent e) {
		displayStatus("");
		fileSaved = false;
	}

	/**
	 * Update status for insert
	*/
	public void insertUpdate(DocumentEvent e) {
		displayStatus("");
		fileSaved = false;
	}

	/**
	 * Update status for remove
	*/
	public void removeUpdate(DocumentEvent e) {
		displayStatus("");
		fileSaved = false;
	}

	/**
		Display a status line.
	*/
	public void displayStatus(String message) {
		displayStatus(currentFile, message);
	}

	public String getStatus(File currentFile) {
		String str = display.getText();
		String li = "0 chars";
		if (str != null) {
			li = str.length() + " chars";
			li = display.getLineCount() + " lines " + li;
		}
		return " " + (currentFile == null ? "Unsaved" : currentFile.getName()) + " " + li;
	}

	/**
		Display a status line with an optional filename parameter.
	*/
	public void displayStatus(File fileobj, String message) {
		if (display.getLineCount() >= 0)
			statusLine.setText(getStatus(fileobj) + " " + message);
	}

	/**
	   Handles the user's menu selections.

	   @param e -- the ActionEvent that led to this method call
	 */
	public void actionPerformed(ActionEvent e) {
		// Get the selected menu item
		JMenuItem m0 = (JMenuItem) e.getSource();
		String mn = m0.getText().toLowerCase();
		if (mn.startsWith("font")) {
			selectAndSetFont();
		} else if (mn.startsWith("tab")) {
			selectAndSetTab();
		} else if (mn.startsWith("saveExit")) {
			fileSave();
			fileClose();
		} else if (isColorItem(mn)) {
			// get the text associated with the menu item
			String color = m0.getActionCommand();
			Color newColor = Color.getColor(color);
			display.setForeground(newColor);
		}
		if (mn.startsWith("quit")) {
			fileClose();

		} else if (mn.startsWith("open")) {
			fileOpenAndRead();
		} else if (mn.equals("save")) {
			fileSave();
		} else if (mn.startsWith("save as")) {
			fileSaveAs();
		} else if (mn.startsWith("cut")) {
			// Cut the selected text
			display.cut();
		} else if (mn.startsWith("copy")) {
			display.copy();
			//setScratchPad(display.getSelectedText());
		} else if (mn.startsWith("paste")) {
			display.paste();
			//display.insert(getScratchPad(), display.getCaretPosition());
		} else if (mn.startsWith("select")) {
			display.selectAll();
		} else {
			JMenuItem item = (JMenuItem) e.getSource();
			setScratchPad(item.getActionCommand());
		}

	}

	public void menu_Cut() {
		//display.cut();
		setScratchPad(display.getSelectedText());
		display.replaceRange("", display.getSelectionStart(), display.getSelectionEnd());
		addRecentCut(getScratchPad());
	}

	/**
		Check if given menu item is one of the color change menu items.
		@param item A JMenuItem that was clicked.
		@return  true if the menu item is a color change item, false otherwise.
	*/
	private boolean isColorItem(JMenuItem item) {
		for (int i = 0; i < colorItems.length; i++) {
			if (item == colorItems[i]) {
				return true;
			}
		}
		return false;
	}

	private boolean isColorItem(String item) {
		if (colorItems == null)
			return false;
		for (int i = 0; i < colorItems.length; i++) {
			if (colorItems[i].getLabel().toLowerCase().startsWith(item)) {
				return true;
			}
		}
		return false;
	}

	/**
		Create a dialog with user to set up font size.
	*/
	public void selectAndSetFont() {

		String fontSize = (String) JOptionPane.showInputDialog(null, "Select Font Size", "Font Size Selector", JOptionPane.QUESTION_MESSAGE, null, fontValues, fontValues[0]);
		if (fontSize != null) {
			defaultFontSize = Integer.parseInt(fontSize);
			defaultFont = new Font("Serif", Font.PLAIN, defaultFontSize);
			display.setFont(defaultFont);
		}

	}

	/**
		Create a dialog with user to set up tab size.
	*/
	public void selectAndSetTab() {
		String tabSize = (String) JOptionPane.showInputDialog(this, "Select Tab Size");
		if (tabSize != null) {
			defaultTabSize = Integer.parseInt(tabSize);
			display.setTabSize(defaultTabSize);
		}
	}

	/**
		Confirm with the user  to save modified file before quitting the editor.
	*/
	@UISalient(MenuName = "Quit")//
	public void fileClose() {
		if (!confirmSaved()) {
			return;
		}
		//	System.exit(0);
	}

	/**
		Start a file chooser to select a file and read it in.
		<ul>
		<li>
		If the user was already editing a file, they are asked to confirm
		to save the file if it was modified. Then the text area is cleared
		to open the new file.
		</li>
		<li>
		If the selected file does not exist, the file is created.
		</li>
		<li>
		If the user selects nothing, the default file name is Untitled,
		which is created in the current directory.
		</li>
		</ul>
	*/
	@UISalient(MenuName = "Open")//
	public boolean fileOpenAndRead() {
		if (!confirmSaved())
			return false;
		// clear text area to open new file
		display.setText("");
		displayStatus("");
		// set up a new default file name
		currentFile = new File("Untitled");

		int returnVal = openFileChooser.showOpenDialog(Utility.getAppFrame());
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			currentFile = openFileChooser.getSelectedFile();
			try {
				BufferedReader in = new BufferedReader(new FileReader(currentFile));
				display.read(in, null);
				// Need to add the DocumentListener again since read replaces
				// the Document object.
				display.getDocument().addDocumentListener(this);
				display.setCaretPosition(display.getDocument().getLength() - 1);
				displayStatus(" read");
				fileSaved = true;
			} catch (FileNotFoundException e) {
				try {
					currentFile.createNewFile();
					statusLine.setText(currentFile.getName() + "  [New file]");
				} catch (IOException e1) {
					String message = e1.getMessage();
					JOptionPane.showMessageDialog(Utility.getAppFrame(), message);
				}
			} catch (IOException e) {
				String message = e.getMessage();
				JOptionPane.showMessageDialog(Utility.getAppFrame(), message);
			}
		}
		return fileSaved;
	}

	/**
	 * 
	 * @return false on cancel to cancel the caller method
	 */
	public boolean confirmSaved() {
		// if current file is modified, confirm for save
		if (!fileSaved) {
			int returnValue = JOptionPane.showConfirmDialog(Utility.getAppFrame(), "Save Current File?");
			if (returnValue == JOptionPane.YES_OPTION) {
				fileSave();
				return true;
			} else if (returnValue == JOptionPane.CANCEL_OPTION) {
				return false;
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	/**
		Save edited file.
	*/
	public void fileSave() {
		try {
			if (currentFile == null) {
				fileSaveAs();
				return;
			}
			reallySave();
			displayStatus(" written");
			fileSaved = true;
		} catch (IOException e) {
			String message = e.getMessage();
			JOptionPane.showMessageDialog(Utility.getAppFrame(), message);
		}

	}

	public void reallySave() throws IOException {
		FileWriter out = null;
		try {
			out = new FileWriter(currentFile);
			display.write(out);
		} finally {
			if (out != null)
				out.close();
		}
	}

	/**
		Save edited file to specified file.
	*/
	public void fileSave(File saveFile) {
		try {
			FileWriter out = new FileWriter(saveFile);
			display.write(out);
			out.close();
			displayStatus(saveFile, " written");
			fileSaved = true;
		} catch (IOException e) {
			String message = e.getMessage();
			JOptionPane.showMessageDialog(Utility.getAppFrame(), message);
		}

	}

	/**
		Start a file chooser to let user select a file to save as.
		<ul>
		<li>
		If the file already exists, the user is asked to confirm overwriting it.
		</li>
		<li>
		If the selected file does not exist, the file is created.
		</li>
		<li>
		If the user selects nothing, then no action is taken. 
		</li>
		</ul>
	*/
	public void fileSaveAs() {
		File saveFile;

		int returnVal = saveFileChooser.showSaveDialog(Utility.getAppFrame());
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			saveFile = saveFileChooser.getSelectedFile();
			if (saveFile.exists()) {
				int returnValue = JOptionPane.showConfirmDialog(Utility.getAppFrame(), "Overwrite Existing File: " + saveFile.getName() + "?", "Question", JOptionPane.YES_NO_OPTION);
				if (returnValue != JOptionPane.YES_OPTION)
					return;
			}
			fileSave(saveFile);
		}
	}

	/**
	   Adds its parameter to the recent cut menu, a menu which grows dynamically as the 
	   user cuts text from a document.  Recent cuts are stored in a vector. When inserting 
	   a cut into the menu the menu is first cleared (using removeAll()), and then
	   the recent cuts are inserted in last-in-first-out order. Each newly inserted cut 
	   is assigned an ActionListener.  

	   @param cut -- the text to be added as the menu item
	*/

	public void addRecentCut(String cut) {
		recentCuts.insertElementAt(cut, 0);
		if (cutsMenu != null)
			addRecentCuts(cutsMenu);
	}

	/**
	Creates an instance of the SimpleTextEditor
	*/
	public static void main(String args[]) {
		// Need to make the variable f final so it can be accessed from the
		// inner class in the addWindowListener call below.
		final SimpleTextEditor te = new SimpleTextEditor();
		JFrame f = new JFrame();
		f.setContentPane(te.getContentPane());
		f.setSize(800, 600);
		f.setVisible(true);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosed(WindowEvent e) {
				te.fileClose();
			}
		});
	}

	public Container getContentPane() {
		return contentPane;
	}

	public void setContentPane(Container cont) {
		if (contentPane == null) {
			contentPane = new JJPanel();
		}
		if (contentPane != cont) {
			if (contentPane.contains(cont))
				contentPane.add(cont);
		}
	}

	public String getScratchPad() {
		String conts = getClipboardContents();
		return (conts == null) ? "" : conts;
	}

	public void setScratchPad(String scratchPad) {
		setClipboardContents(scratchPad);
	}

	public void addActionListener(final ActionListener actionListener) {
		display.addFocusListener(new FocusListener() {

			@Override public void focusLost(FocusEvent e) {
				actionListener.actionPerformed(new ActionEvent(e.getSource(), e.getID(), "focusLost"));

			}

			@Override public void focusGained(FocusEvent e) {
				actionListener.actionPerformed(new ActionEvent(e.getSource(), e.getID(), "focusGained"));
			}
		});

	}

}