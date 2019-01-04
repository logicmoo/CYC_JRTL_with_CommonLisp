package org.appdapter.gui.editors;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import org.appdapter.gui.api.BT;
import org.appdapter.gui.api.BrowserPanelGUI;
import org.appdapter.gui.browse.Utility;

public class RenameDialog extends JFrame {
	public JTextField nameField = new JTextField(10);
	public JButton okButton = new JButton("OK");
	public JButton cancelButton = new JButton("Cancel");
	BT value;
	BrowserPanelGUI context;

	public RenameDialog(BrowserPanelGUI context, BT value) {
		super("Rename");
		this.context = context;
		setIconImage(Icons.loadImage("mainFrame.gif"));
		this.value = value;

		JPanel top = new JPanel(new FlowLayout());
		top.add(new JLabel("Rename " + value.getShortLabel() + " to: "));
		top.add(nameField);
		nameField.setText(value.getShortLabel());
		nameField.selectAll();

		JPanel bottom = new JPanel(new FlowLayout());
		bottom.add(cancelButton);
		bottom.add(okButton);

		getContentPane().setLayout(new BorderLayout());

		Box box = new Box(BoxLayout.Y_AXIS);
		box.add(top);
		box.add(bottom);
		getContentPane().add("Center", box);
		pack();

		Utility.centerWindow(this);

		nameField.getDocument().addDocumentListener(new DocumentListener() {
			public void insertUpdate(DocumentEvent evt) {
				checkControls();
			}

			public void changedUpdate(DocumentEvent evt) {
				checkControls();
			}

			public void removeUpdate(DocumentEvent evt) {
				checkControls();
			}
		});

		nameField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				okPressed();
			}
		});

		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				dispose();
			}
		});

		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				okPressed();
			}
		});

		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}

	private void okPressed() {

		String prevName = value.getShortLabel();
		String name = nameField.getText();
		if (isNameValid(name)) {
			try {
				context.renameObject(prevName, name);
			} catch (PropertyVetoException err) {
				context.showError(null, err);
			}
			dispose();
		} else {
			context.showError("Invalid name - there is already another value named '" + name + "'", null);
		}
	}

	private void checkControls() {
		String newName = nameField.getText();
		okButton.setEnabled(isNameValid(newName));
	}

	private synchronized boolean isNameValid(String n) {
		if (n == null || n.equals("")) {
			return false;
		} else {
			return context.findObjectByName(n) == null;
		}
	}
}
