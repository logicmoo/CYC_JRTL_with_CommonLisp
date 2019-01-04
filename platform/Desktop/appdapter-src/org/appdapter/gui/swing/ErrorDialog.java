package org.appdapter.gui.swing;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Window;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import org.appdapter.gui.browse.Utility;

public class ErrorDialog extends JPanel {

	public JDialog dlg = new JDialog();
	public ErrorPanel errorPanel;

	public static void main(String[] args) {
		(new ErrorDialog("Testing, testing...", new Exception("XYZ!"))).show();
	}

	public ErrorDialog(ErrorPanel displayIt, Window insideThis, boolean center, boolean modal) {
		super(false);
		this.dlg = toJDialog(insideThis);
		this.errorPanel = displayIt;
		Object error = displayIt.getValue();
		if (error instanceof RuntimeException) {
			dlg.setTitle("Runtime exception " + error);
		} else if (error instanceof Exception) {
			dlg.setTitle("Exception " + error);
		} else {
			dlg.setTitle("Error " + error);
		}

		java.awt.Container p = dlg.getContentPane();
		p.setLayout(new BorderLayout());
		p.add("Center", errorPanel);

		if (modal)
			dlg.setModal(true);
		dlg.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		dlg.pack();
		if (center)
			Utility.centerWindow(dlg);

	}

	public static JDialog toJDialog(Window insideThis) {
		if (insideThis == null)
			return new JDialog();
		if (insideThis instanceof JDialog)
			return (JDialog) insideThis;
		if (insideThis instanceof Dialog)
			return new JDialog((Dialog) insideThis);
		return new JDialog(insideThis);
	}

	public ErrorDialog(String message, Throwable error) {
		this(new ErrorPanel(message, error), new JDialog(), true, true);
	}

	public ErrorDialog(Throwable error) {
		this("Something went wrong!", error);
	}

	public ErrorDialog(String message) {
		this(message, null);
	}

	public Object getValue() {
		return errorPanel.getValue();
	}

}