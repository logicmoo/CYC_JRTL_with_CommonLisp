package com.cyc.tool.subl.jrtl.nativeCode.commonLisp.java.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.java.DialogPromptStream;

public class SwingDialogPromptStream extends DialogPromptStream {

	JDialog dialog = new JDialog((Frame) null, true);
	private JLabel prompt = new JLabel();
	private JTextField input = new JTextField(32);

	public SwingDialogPromptStream() {
		this("Prompt");
	}

	public SwingDialogPromptStream(String title) {
		super();
		this.dialog.setTitle(title);
		JPanel tmpPanel = new JPanel();
		tmpPanel.add(this.prompt);
		tmpPanel.add(this.input);
		this.dialog.add(tmpPanel);
		JButton okBtn = new JButton("Ok");
		okBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				synchronized (SwingDialogPromptStream.this.dialog) {
					SwingDialogPromptStream.this.dialog.dispose();
				}
			}
		});
		tmpPanel = new JPanel(new FlowLayout());
		tmpPanel.add(okBtn);
		this.dialog.add(tmpPanel, BorderLayout.SOUTH);
	}

	protected void closeDialog() {
		this.dialog.dispose();
	}

	protected String readInputFromModalDialog(String promptText) {
		this.prompt.setText(promptText);
		this.dialog.pack();
		this.dialog.setVisible(true);
		return this.input.getText();
	}

}
