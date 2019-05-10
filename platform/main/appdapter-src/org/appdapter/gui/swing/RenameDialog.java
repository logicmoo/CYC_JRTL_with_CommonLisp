package org.appdapter.gui.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.api.NamedObjectCollection;
import org.appdapter.gui.browse.Utility;

public class RenameDialog extends JFrame {
	public JButton cancelButton = new JButton("Cancel");
	DisplayContext context;
	public JTextField nameField = new JTextField(10);
	BT object;
	public JButton okButton = new JButton("OK");
	NamedObjectCollection noc;

	public RenameDialog(DisplayContext context, BT object) {
		super("Rename");
		this.context = context;
		setIconImage(Utility.getImage(Utility.getResource("mainFrame.gif")));
		this.object = object;

		java.util.Map nocmap = noc.getNameToBoxIndex();

		JPanel top = new JPanel(new FlowLayout());
		top.add(new JLabel("Rename " + object.generateUniqueName(nocmap) + " to: "));
		top.add(nameField);
		nameField.setText(object.generateUniqueName(nocmap));
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
		org.appdapter.gui.browse.Utility.centerWindow(this);

		nameField.getDocument().addDocumentListener(new DocumentListener() {
			@Override public void changedUpdate(DocumentEvent evt) {
				checkControls();
			}

			@Override public void insertUpdate(DocumentEvent evt) {
				checkControls();
			}

			@Override public void removeUpdate(DocumentEvent evt) {
				checkControls();
			}
		});

		nameField.addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent evt) {
				okPressed();
			}
		});

		cancelButton.addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent evt) {
				dispose();
			}
		});

		okButton.addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent evt) {
				okPressed();
			}
		});

		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}

	private void checkControls() {
		String newName = nameField.getText();
		okButton.setEnabled(isNameValid(newName));
	}

	private synchronized boolean isNameValid(String n) {
		if (n == null || n.equals("")) {
			return false;
		} else {
			return context.getLocalBoxedChildren().findBoxByName(n) == null;
		}
	}

	private void okPressed() {
		String name = nameField.getText();
		if (isNameValid(name)) {
			try {
				java.util.Map nocmap = noc.getNameToBoxIndex();
				object.setUniqueName(name, nocmap);
				context.getLocalBoxedChildren().reload();
			} catch (Exception err) {
				Utility.showError(context, null, err);
			}
			dispose();
		} else {
			Utility.showError(context, "Invalid name - there is already another object named '" + name + "'", null);
		}
	}
}