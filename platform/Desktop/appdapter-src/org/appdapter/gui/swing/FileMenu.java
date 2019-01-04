package org.appdapter.gui.swing;

import java.io.File;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.Action;

import org.appdapter.gui.browse.Settings;

public class FileMenu extends SafeJMenu {


	/**
	 *
	 */
	private final CollectionEditorUtil collectionEditorUtil;
	Vector recentFiles = new Vector();

	FileMenu(String name, CollectionEditorUtil val) {
		super(false, name, val);
		this.collectionEditorUtil = val;
		try {
			addItems();
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	private void addItems() {
		add(this.collectionEditorUtil.newAction);
		add(this.collectionEditorUtil.openAction);
		addSeparator();
		add(this.collectionEditorUtil.saveAction);
		add(this.collectionEditorUtil.saveAsAction);
		addSeparator();

		recentFiles = new Vector();
		Iterator it = Settings.getRecentFiles();
		while (it.hasNext()) {
			File file = (File) it.next();
			Action a = this.collectionEditorUtil.new RecentFileAction(file);
			recentFiles.addElement(a);
			add(a);
		}
	}

	public void refreshRecentFileList() {
		removeAll();
		addItems();
	}
}