/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.tool.subl.ui;

import java.awt.Dimension;
import java.awt.Event;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.InputMap;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.JTextComponent;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLReader;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.util.SafeRunnable;
import com.cyc.tool.subl.util.SubLCommandHistory;
import com.cyc.tool.subl.util.TextAreaInputStream;
import com.cyc.tool.subl.util.TextAreaOutputStream;

public class SubLReaderPanel extends javax.swing.JPanel {

	//// Constructors

	class RedoAction extends AbstractAction {
		public RedoAction() {
			super("Redo");
			this.setEnabled(false);
		}

		public void actionPerformed(ActionEvent e) {
			try {
				SubLReaderPanel.this.undo.redo();
			} catch (CannotRedoException ex) {
				System.out.println("Unable to redo: " + ex);
				ex.printStackTrace();
			}
			this.updateRedoState();
			SubLReaderPanel.this.undoAction.updateUndoState();
		}

		protected void updateRedoState() {
			if (SubLReaderPanel.this.undo.canRedo()) {
				this.setEnabled(true);
				this.putValue(Action.NAME, SubLReaderPanel.this.undo.getRedoPresentationName());
			} else {
				this.setEnabled(false);
				this.putValue(Action.NAME, "Redo");
			}
		}
	}

	// This one listens for edits that can be undone.
	protected class SubLReaderUndoableEditListener implements UndoableEditListener {
		public void undoableEditHappened(UndoableEditEvent e) {
			SubLReaderPanel.this.undo.addEdit(e.getEdit());
			SubLReaderPanel.this.undoAction.updateUndoState();
			SubLReaderPanel.this.redoAction.updateRedoState();
		}
	}

	class UndoAction extends AbstractAction {
		public UndoAction() {
			super("Undo");
			this.setEnabled(false);
		}

		public void actionPerformed(ActionEvent e) {
			try {
				SubLReaderPanel.this.undo.undo();
			} catch (CannotUndoException ex) {
				Errors.handleError("Unable to undo in read-eval loop GUI.", ex);
			}
			this.updateUndoState();
			SubLReaderPanel.this.redoAction.updateRedoState();
		}

		protected void updateUndoState() {
			if (SubLReaderPanel.this.undo.canUndo()) {
				this.setEnabled(true);
				this.putValue(Action.NAME, SubLReaderPanel.this.undo.getUndoPresentationName());
			} else {
				this.setEnabled(false);
				this.putValue(Action.NAME, "Undo");
			}
		}
	}

	private static JFrame mainFrame;

	//// Public Area

	//// Protected Area

	//// Private Area

	private static SubLReaderPanel mainReaderPanel;

	private static Robot robot;

	static {
		try {
			SubLReaderPanel.robot = new Robot();
		} catch (Exception e) {
			Errors.handleError("Unable to create UI robot.", e);
		}
	}

	public static SubLReader startReadloopWindow() {
		SubLEnvironment env = SubLEnvironment.currentEnvironment();
		SubLReaderPanel mainReaderPanel = new SubLReaderPanel(env);
		JFrame mainFrame = new JFrame("SubL Interpreter");
		mainFrame.setContentPane(mainReaderPanel);
		mainFrame.setSize(700, 850);
		mainFrame.validate();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension curSize = mainFrame.getSize();
		mainFrame.setLocation(screenSize.width / 2 - curSize.width / 2, screenSize.height / 2 - curSize.height / 2);
		mainFrame.setVisible(true);
		// mainReaderPanel.entryTextArea.grabFocus();
		return mainReaderPanel.getReader();
	}

	private SubLEnvironment env;

	private int historyNum = 1;

	private SubLCommandHistory history = new SubLCommandHistory();

	private InputStream inStream;

	private OutputStream outStream;

	private SubLReader sublReader;

	// undo helpers
	private UndoAction undoAction = new UndoAction();

	private RedoAction redoAction = new RedoAction();

	private UndoManager undo = new UndoManager();

	private HashMap actions;

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton ClearEntryButton;

	private javax.swing.JButton clearButton;

	private javax.swing.JButton downButton;

	private javax.swing.JButton enterButton;

	private javax.swing.JPanel entryButtonPanel;

	private javax.swing.JPanel entryEditorPanel;

	//// Internal Rep

	private javax.swing.JLabel entryLabel;
	private javax.swing.JPanel entryPanel;
	private javax.swing.JScrollPane entryScrollPane;
	private javax.swing.JTextArea entryTextArea;
	private javax.swing.JPanel entryTopPanel;
	private javax.swing.JButton findButton;
	private javax.swing.JButton historyGotoButton;
	private javax.swing.JLabel historyGotoLabel;
	private javax.swing.JPanel historyGotoPanel;
	private javax.swing.JTextField historyGotoTextField;
	private javax.swing.JButton loadFileButton;
	private javax.swing.JSplitPane mainSplitPane;
	private javax.swing.JButton quitButton;

	private javax.swing.JPanel resultBottomPanel;
	private javax.swing.JLabel resultsLabel;
	private javax.swing.JPanel resultsPanel;
	private javax.swing.JScrollPane resultsScrollPane;
	private javax.swing.JTextArea resultsTextArea;
	private javax.swing.JPanel resultsTopPanel;
	private javax.swing.JButton upButton;
	private javax.swing.JProgressBar workingProgressBar;

	// End of variables declaration//GEN-END:variables
	/** Creates new form SubLReaderPanel. */
	public SubLReaderPanel(SubLEnvironment env) {
		this.initComponents();
		this.init(env);
		try {
			this.inStream = new TextAreaInputStream(this.entryTextArea);
			this.outStream = new TextAreaOutputStream(this.resultsTextArea, this.resultsScrollPane);
			this.sublReader = new SubLReader(true, this.inStream, this.outStream) {

				protected void setIsBusy(boolean isBusy) {
					super.isBusy();
					SubLReaderPanel.this.workingProgressBar.setIndeterminate(isBusy);
					SubLReaderPanel.this.enterButton.setEnabled(!this.isBusy());
					SubLReaderPanel.this.loadFileButton.setEnabled(!this.isBusy());
				}

				public void writeCommand(String command) {
					System.out.print(command);
					System.out.flush();
				}

				public void writePrompt(String prompt) {
					super.writePrompt(prompt);
					SubLReaderPanel.this.entryLabel.setText(prompt);
				}

				public void writeResults(String results) {
					super.writeResults(results);
					SubLReaderPanel.this.scrollEntryTextAreaToBottom();
				}
			};
		} catch (Exception e) {
			Errors.error("Can't create read loop UI.", e);
		}
	}

	// Add a couple of emacs key bindings for navigation.
	protected void addBindings(InputMap inputMap) {
		KeyStroke key = KeyStroke.getKeyStroke(KeyEvent.VK_B, Event.CTRL_MASK);
		inputMap.put(key, DefaultEditorKit.backwardAction);
		key = KeyStroke.getKeyStroke(KeyEvent.VK_F, Event.CTRL_MASK);
		inputMap.put(key, DefaultEditorKit.forwardAction);
		key = KeyStroke.getKeyStroke(KeyEvent.VK_P, Event.CTRL_MASK);
		inputMap.put(key, DefaultEditorKit.upAction);
		key = KeyStroke.getKeyStroke(KeyEvent.VK_N, Event.CTRL_MASK);
		inputMap.put(key, DefaultEditorKit.downAction);
		key = KeyStroke.getKeyStroke(KeyEvent.VK_E, Event.CTRL_MASK);
		inputMap.put(key, DefaultEditorKit.endLineAction);
		key = KeyStroke.getKeyStroke(KeyEvent.VK_A, Event.CTRL_MASK);
		inputMap.put(key, DefaultEditorKit.beginLineAction);
		key = KeyStroke.getKeyStroke(KeyEvent.VK_D, Event.CTRL_MASK);
		inputMap.put(key, DefaultEditorKit.deleteNextCharAction);
		key = KeyStroke.getKeyStroke(KeyEvent.VK_A, Event.ALT_MASK);
		inputMap.put(key, DefaultEditorKit.selectAllAction);

		key = KeyStroke.getKeyStroke(KeyEvent.VK_X, Event.CTRL_MASK);
		inputMap.put(key, DefaultEditorKit.cutAction);
		key = KeyStroke.getKeyStroke(KeyEvent.VK_C, Event.CTRL_MASK);
		inputMap.put(key, DefaultEditorKit.copyAction);
		key = KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK);
		inputMap.put(key, DefaultEditorKit.pasteAction);
		key = KeyStroke.getKeyStroke(KeyEvent.VK_Z, Event.CTRL_MASK);
		inputMap.put(key, this.undoAction);
		key = KeyStroke.getKeyStroke(KeyEvent.VK_Y, Event.CTRL_MASK);
		inputMap.put(key, this.redoAction);

		/*
		 * key = KeyStroke.getKeyStroke(KeyEvent.VK_A, Event.ALT_MASK);
		 * inputMap.put(key, DefaultEditorKit.previousWord); key =
		 * KeyStroke.getKeyStroke(KeyEvent.VK_A, Event.ALT_MASK);
		 * inputMap.put(key, DefaultEditorKit.nextWord); key =
		 * KeyStroke.getKeyStroke(KeyEvent.VK_A, Event.ALT_MASK);
		 * inputMap.put(key, DefaultEditorKit.pageDownAction); key =
		 * KeyStroke.getKeyStroke(KeyEvent.VK_A, Event.ALT_MASK);
		 * inputMap.put(key, DefaultEditorKit.pageUpAction);
		 */
	}

	private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_clearButtonActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_clearButtonActionPerformed

	private void ClearEntryButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ClearEntryButtonActionPerformed
		this.entryTextArea.setText("");
		this.entryTextArea.grabFocus();
	}// GEN-LAST:event_ClearEntryButtonActionPerformed

	private void createActionTable(JTextComponent textComponent) {
		this.actions = new HashMap();
		Action[] actionsArray = textComponent.getActions();
		for (int i = 0; i < actionsArray.length; i++) {
			Action a = actionsArray[i];
			this.actions.put(a.getValue(Action.NAME), a);
		}
	}

	// Create the edit menu.
	protected JMenu createEditMenu() {
		JMenu menu = new JMenu("Edit");
		menu.add(this.undoAction);
		menu.add(this.redoAction);

		menu.addSeparator();

		menu.add(this.getActionByName(DefaultEditorKit.cutAction));
		menu.add(this.getActionByName(DefaultEditorKit.copyAction));
		menu.add(this.getActionByName(DefaultEditorKit.pasteAction));

		menu.addSeparator();

		menu.add(this.getActionByName(DefaultEditorKit.selectAllAction));
		return menu;
	}

	private void downButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_downButtonActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_downButtonActionPerformed

	private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_enterButtonActionPerformed
		this.forceEvaluation();
		this.entryTextArea.grabFocus();
	}// GEN-LAST:event_enterButtonActionPerformed

	private void findButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_findButtonActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_findButtonActionPerformed

	private void forceEvaluation() {
		this.entryTextArea.grabFocus();
		this.entryTextArea.setCaretPosition(this.entryTextArea.getText().length());
		this.entryTextArea.setSelectionStart(0);
		this.entryTextArea.setSelectionEnd(0);
		SubLReaderPanel.robot.keyPress(KeyEvent.VK_ENTER);
		SubLReaderPanel.robot.keyRelease(KeyEvent.VK_ENTER);
	}

	private Action getActionByName(String name) {
		return (Action) this.actions.get(name);
	}

	public SubLReader getReader() {
		return this.sublReader;
	}

	private void historyGotoButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_historyGotoButtonActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_historyGotoButtonActionPerformed

	private void historyGotoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_historyGotoTextFieldActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_historyGotoTextFieldActionPerformed

	private void init(SubLEnvironment env) {
		this.entryTextArea.setTabSize(2);
		this.resultsTextArea.setTabSize(2);
		this.entryTextArea.getDocument().addUndoableEditListener(new SubLReaderUndoableEditListener());
		this.createActionTable(this.entryTextArea);
		this.addBindings(this.entryTextArea.getInputMap());
		this.env = env;
		this.findButton.setEnabled(false);
		this.historyGotoTextField.setEnabled(false);
		this.historyGotoLabel.setEnabled(false);
		this.historyGotoButton.setEnabled(false);
		this.upButton.setEnabled(false);
		this.downButton.setEnabled(false);
		this.loadFileButton.setEnabled(true);
		this.entryTextArea.grabFocus();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc=" Generated Code
	// ">//GEN-BEGIN:initComponents
	private void initComponents() {
		this.mainSplitPane = new javax.swing.JSplitPane();
		this.resultsPanel = new javax.swing.JPanel();
		this.resultsScrollPane = new javax.swing.JScrollPane();
		this.resultsTextArea = new javax.swing.JTextArea();
		this.resultsTopPanel = new javax.swing.JPanel();
		this.resultsLabel = new javax.swing.JLabel();
		this.resultBottomPanel = new javax.swing.JPanel();
		this.workingProgressBar = new javax.swing.JProgressBar();
		this.clearButton = new javax.swing.JButton();
		this.findButton = new javax.swing.JButton();
		this.historyGotoPanel = new javax.swing.JPanel();
		this.historyGotoLabel = new javax.swing.JLabel();
		this.historyGotoTextField = new javax.swing.JTextField();
		this.historyGotoButton = new javax.swing.JButton();
		this.upButton = new javax.swing.JButton();
		this.downButton = new javax.swing.JButton();
		this.entryPanel = new javax.swing.JPanel();
		this.entryButtonPanel = new javax.swing.JPanel();
		this.enterButton = new javax.swing.JButton();
		this.ClearEntryButton = new javax.swing.JButton();
		this.loadFileButton = new javax.swing.JButton();
		this.quitButton = new javax.swing.JButton();
		this.entryEditorPanel = new javax.swing.JPanel();
		this.entryScrollPane = new javax.swing.JScrollPane();
		this.entryTextArea = new javax.swing.JTextArea();
		this.entryTopPanel = new javax.swing.JPanel();
		this.entryLabel = new javax.swing.JLabel();

		this.setLayout(new java.awt.BorderLayout());

		this.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
		this.setPreferredSize(new java.awt.Dimension(700, 900));
		this.mainSplitPane.setDividerLocation(200);
		this.mainSplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
		this.mainSplitPane.setOneTouchExpandable(true);
		this.resultsPanel.setLayout(new java.awt.BorderLayout());

		this.resultsTextArea.setEditable(false);
		this.resultsTextArea.setFont(new java.awt.Font("Monospaced", 0, 12));
		this.resultsTextArea.setMargin(new java.awt.Insets(7, 7, 7, 7));
		this.resultsScrollPane.setViewportView(this.resultsTextArea);

		this.resultsPanel.add(this.resultsScrollPane, java.awt.BorderLayout.CENTER);

		this.resultsTopPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

		this.resultsLabel.setFont(new java.awt.Font("DialogInput", 1, 12));
		this.resultsLabel.setText("Results:");
		this.resultsTopPanel.add(this.resultsLabel);

		this.resultsPanel.add(this.resultsTopPanel, java.awt.BorderLayout.NORTH);

		this.resultBottomPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 15, 5));

		this.resultBottomPanel.add(this.workingProgressBar);

		this.clearButton.setMnemonic('a');
		this.clearButton.setText("Clear");
		this.clearButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				SubLReaderPanel.this.clearButtonActionPerformed(evt);
			}
		});

		this.resultBottomPanel.add(this.clearButton);

		this.findButton.setMnemonic('F');
		this.findButton.setText("Find");
		this.findButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				SubLReaderPanel.this.findButtonActionPerformed(evt);
			}
		});

		this.resultBottomPanel.add(this.findButton);

		this.historyGotoPanel
				.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
		this.historyGotoLabel.setLabelFor(this.historyGotoTextField);
		this.historyGotoLabel.setText("Go to: ");
		this.historyGotoPanel.add(this.historyGotoLabel);

		this.historyGotoTextField.setColumns(5);
		this.historyGotoTextField.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				SubLReaderPanel.this.historyGotoTextFieldActionPerformed(evt);
			}
		});

		this.historyGotoPanel.add(this.historyGotoTextField);

		this.historyGotoButton.setMnemonic('g');
		this.historyGotoButton.setText("Go");
		this.historyGotoButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				SubLReaderPanel.this.historyGotoButtonActionPerformed(evt);
			}
		});

		this.historyGotoPanel.add(this.historyGotoButton);

		this.resultBottomPanel.add(this.historyGotoPanel);

		this.upButton.setMnemonic('u');
		this.upButton.setText("Up");
		this.upButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				SubLReaderPanel.this.upButtonActionPerformed(evt);
			}
		});

		this.resultBottomPanel.add(this.upButton);

		this.downButton.setMnemonic('d');
		this.downButton.setText("Down");
		this.downButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				SubLReaderPanel.this.downButtonActionPerformed(evt);
			}
		});

		this.resultBottomPanel.add(this.downButton);

		this.resultsPanel.add(this.resultBottomPanel, java.awt.BorderLayout.SOUTH);

		this.mainSplitPane.setBottomComponent(this.resultsPanel);

		this.entryPanel.setLayout(new java.awt.BorderLayout());

		this.entryButtonPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 15, 5));

		this.enterButton.setMnemonic('e');
		this.enterButton.setText("Evaluate");
		this.enterButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				SubLReaderPanel.this.enterButtonActionPerformed(evt);
			}
		});

		this.entryButtonPanel.add(this.enterButton);

		this.ClearEntryButton.setMnemonic('C');
		this.ClearEntryButton.setText("Clear");
		this.ClearEntryButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				SubLReaderPanel.this.ClearEntryButtonActionPerformed(evt);
			}
		});

		this.entryButtonPanel.add(this.ClearEntryButton);

		this.loadFileButton.setMnemonic('l');
		this.loadFileButton.setText("Load");
		this.loadFileButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				SubLReaderPanel.this.loadFileButtonActionPerformed(evt);
			}
		});

		this.entryButtonPanel.add(this.loadFileButton);

		this.quitButton.setMnemonic('q');
		this.quitButton.setText("Quit");
		this.quitButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				SubLReaderPanel.this.quitButtonActionPerformed(evt);
			}
		});

		this.entryButtonPanel.add(this.quitButton);

		this.entryPanel.add(this.entryButtonPanel, java.awt.BorderLayout.SOUTH);

		this.entryEditorPanel.setLayout(new java.awt.BorderLayout());

		this.entryTextArea.setFont(new java.awt.Font("Monospaced", 0, 12));
		this.entryTextArea.setMargin(new java.awt.Insets(7, 7, 7, 7));
		this.entryScrollPane.setViewportView(this.entryTextArea);

		this.entryEditorPanel.add(this.entryScrollPane, java.awt.BorderLayout.CENTER);

		this.entryPanel.add(this.entryEditorPanel, java.awt.BorderLayout.CENTER);

		this.entryTopPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

		this.entryLabel.setFont(new java.awt.Font("DialogInput", 1, 12));
		this.entryLabel.setText("Enter:");
		this.entryTopPanel.add(this.entryLabel);

		this.entryPanel.add(this.entryTopPanel, java.awt.BorderLayout.NORTH);

		this.mainSplitPane.setTopComponent(this.entryPanel);

		this.add(this.mainSplitPane, java.awt.BorderLayout.CENTER);

	}// </editor-fold>//GEN-END:initComponents

	private void loadFile() {
		JFileChooser chooser = new JFileChooser();
		int returnVal = chooser.showOpenDialog(SubLReaderPanel.mainFrame);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			String fileName = chooser.getSelectedFile().getAbsolutePath();
			String command = "(load \"" + fileName + "\")";
			this.entryTextArea.setText(command);
			this.forceEvaluation();
		}
	}

	private void loadFileButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_loadFileButtonActionPerformed
		this.loadFile();
		this.entryTextArea.grabFocus();
	}// GEN-LAST:event_loadFileButtonActionPerformed

	private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_quitButtonActionPerformed
		this.verifyQuit();
	}// GEN-LAST:event_quitButtonActionPerformed

	private void resetUIAfterProcessing() {
		Runnable runnable = new SafeRunnable() {
			public void safeRun() {
				SubLReaderPanel.this.resultsTextArea
						.setCaretPosition(SubLReaderPanel.this.resultsTextArea.getText().length());
				SubLReaderPanel.this.enterButton.setEnabled(true);
				SubLReaderPanel.this.entryTextArea.setEnabled(true);
				SubLReaderPanel.this.entryTextArea.setText("");
				SubLReaderPanel.this.entryTextArea.grabFocus();
			}
		};
		SwingUtilities.invokeLater(runnable);
	}

	public void scrollEntryTextAreaToBottom() {
		JScrollBar sb = this.entryScrollPane.getVerticalScrollBar();
		sb.setValue(sb.getMaximum());
	}

	private void upButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_upButtonActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_upButtonActionPerformed

	private void verifyQuit() {
		int result = JOptionPane.showConfirmDialog(SubLReaderPanel.mainReaderPanel,
				"Do you want to quit the application?", "Quit?", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE);
		if (result == JOptionPane.YES_OPTION)
			SubLMain.me.doSystemCleanupAndExit(0);
	}

}
