//
// For LarKC
//
package com.cyc.tool.subl.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
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

public class SubLReaderPanel extends JPanel {
	protected class SubLReaderUndoableEditListener implements UndoableEditListener {
		@Override
		public void undoableEditHappened(UndoableEditEvent e) {
			undo.addEdit(e.getEdit());
			undoAction.updateUndoState();
			redoAction.updateRedoState();
		}
	}

	class RedoAction extends AbstractAction {
		public RedoAction() {
			super("Redo");
			setEnabled(false);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				undo.redo();
			} catch (CannotRedoException ex) {
				System.out.println("Unable to redo: " + ex);
				ex.printStackTrace();
			}
			updateRedoState();
			undoAction.updateUndoState();
		}

		protected void updateRedoState() {
			if (undo.canRedo()) {
				setEnabled(true);
				putValue("Name", undo.getRedoPresentationName());
			} else {
				setEnabled(false);
				putValue("Name", "Redo");
			}
		}
	}

	class UndoAction extends AbstractAction {
		public UndoAction() {
			super("Undo");
			setEnabled(false);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				undo.undo();
			} catch (CannotUndoException ex) {
				Errors.handleError("Unable to undo in read-eval loop GUI.", ex);
			}
			updateUndoState();
			redoAction.updateRedoState();
		}

		protected void updateUndoState() {
			if (undo.canUndo()) {
				setEnabled(true);
				putValue("Name", undo.getUndoPresentationName());
			} else {
				setEnabled(false);
				putValue("Name", "Undo");
			}
		}
	}

	public SubLReaderPanel(SubLEnvironment env) {
		historyNum = 1;
		history = new SubLCommandHistory();
		undoAction = new UndoAction();
		redoAction = new RedoAction();
		undo = new UndoManager();
		initComponents();
		init(env);
		try {
			inStream = new TextAreaInputStream(entryTextArea);
			outStream = new TextAreaOutputStream(resultsTextArea, resultsScrollPane);
			sublReader = new SubLReader(true, inStream, outStream) {
				@Override
				public void writeCommand(String command) {
					System.out.print(command);
					System.out.flush();
				}

				@Override
				public void writePrompt(String prompt) {
					super.writePrompt(prompt);
					entryLabel.setText(prompt);
				}

				@Override
				public void writeResults(String results) {
					super.writeResults(results);
					SubLReaderPanel.this.scrollEntryTextAreaToBottom();
				}

				@Override
				protected void setIsBusy(boolean isBusy) {
					super.isBusy();
					workingProgressBar.setIndeterminate(isBusy);
					enterButton.setEnabled(!isBusy());
					loadFileButton.setEnabled(!isBusy());
				}
			};
		} catch (Exception e) {
			Errors.error("Can't create read loop UI.", e);
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
		return mainReaderPanel.getReader();
	}

	private SubLEnvironment env;
	private int historyNum;
	private SubLCommandHistory history;
	private InputStream inStream;
	private OutputStream outStream;
	private SubLReader sublReader;
	private UndoAction undoAction;
	private RedoAction redoAction;
	private UndoManager undo;
	private HashMap actions;
	private JButton ClearEntryButton;
	private JButton clearButton;
	private JButton downButton;
	private JButton enterButton;
	private JPanel entryButtonPanel;
	private JPanel entryEditorPanel;
	private JLabel entryLabel;
	private JPanel entryPanel;
	private JScrollPane entryScrollPane;
	private JTextArea entryTextArea;
	private JPanel entryTopPanel;
	private JButton findButton;
	private JButton historyGotoButton;
	private JLabel historyGotoLabel;
	private JPanel historyGotoPanel;
	private JTextField historyGotoTextField;
	private JButton loadFileButton;
	private JSplitPane mainSplitPane;
	private JButton quitButton;
	private JPanel resultBottomPanel;
	private JLabel resultsLabel;
	private JPanel resultsPanel;
	private JScrollPane resultsScrollPane;
	private JTextArea resultsTextArea;
	private JPanel resultsTopPanel;
	private JButton upButton;
	private JProgressBar workingProgressBar;
	private static JFrame mainFrame;
	private static SubLReaderPanel mainReaderPanel;
	private static Robot robot;
	static {
		try {
			SubLReaderPanel.robot = new Robot();
		} catch (Exception e) {
			Errors.handleError("Unable to create UI robot.", e);
		}
	}

	private void clearButtonActionPerformed(ActionEvent evt) {
	}

	private void ClearEntryButtonActionPerformed(ActionEvent evt) {
		entryTextArea.setText("");
		entryTextArea.grabFocus();
	}

	private void createActionTable(JTextComponent textComponent) {
		actions = new HashMap();
		Action[] actionsArray = textComponent.getActions();
		for (int i = 0; i < actionsArray.length; ++i) {
			Action a = actionsArray[i];
			actions.put(a.getValue("Name"), a);
		}
	}

	private void downButtonActionPerformed(ActionEvent evt) {
	}

	private void enterButtonActionPerformed(ActionEvent evt) {
		forceEvaluation();
		entryTextArea.grabFocus();
	}

	private void findButtonActionPerformed(ActionEvent evt) {
	}

	private void forceEvaluation() {
		entryTextArea.grabFocus();
		entryTextArea.setCaretPosition(entryTextArea.getText().length());
		entryTextArea.setSelectionStart(0);
		entryTextArea.setSelectionEnd(0);
		SubLReaderPanel.robot.keyPress(10);
		SubLReaderPanel.robot.keyRelease(10);
	}

	private Action getActionByName(String name) {
		return (Action) actions.get(name);
	}

	private void historyGotoButtonActionPerformed(ActionEvent evt) {
	}

	private void historyGotoTextFieldActionPerformed(ActionEvent evt) {
	}

	private void init(SubLEnvironment env) {
		entryTextArea.setTabSize(2);
		resultsTextArea.setTabSize(2);
		entryTextArea.getDocument().addUndoableEditListener(new SubLReaderUndoableEditListener());
		createActionTable(entryTextArea);
		addBindings(entryTextArea.getInputMap());
		this.env = env;
		findButton.setEnabled(false);
		historyGotoTextField.setEnabled(false);
		historyGotoLabel.setEnabled(false);
		historyGotoButton.setEnabled(false);
		upButton.setEnabled(false);
		downButton.setEnabled(false);
		loadFileButton.setEnabled(true);
		entryTextArea.grabFocus();
	}

	private void initComponents() {
		mainSplitPane = new JSplitPane();
		resultsPanel = new JPanel();
		resultsScrollPane = new JScrollPane();
		resultsTextArea = new JTextArea();
		resultsTopPanel = new JPanel();
		resultsLabel = new JLabel();
		resultBottomPanel = new JPanel();
		workingProgressBar = new JProgressBar();
		clearButton = new JButton();
		findButton = new JButton();
		historyGotoPanel = new JPanel();
		historyGotoLabel = new JLabel();
		historyGotoTextField = new JTextField();
		historyGotoButton = new JButton();
		upButton = new JButton();
		downButton = new JButton();
		entryPanel = new JPanel();
		entryButtonPanel = new JPanel();
		enterButton = new JButton();
		ClearEntryButton = new JButton();
		loadFileButton = new JButton();
		quitButton = new JButton();
		entryEditorPanel = new JPanel();
		entryScrollPane = new JScrollPane();
		entryTextArea = new JTextArea();
		entryTopPanel = new JPanel();
		entryLabel = new JLabel();
		setLayout(new BorderLayout());
		setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		setPreferredSize(new Dimension(700, 900));
		mainSplitPane.setDividerLocation(200);
		mainSplitPane.setOrientation(0);
		mainSplitPane.setOneTouchExpandable(true);
		resultsPanel.setLayout(new BorderLayout());
		resultsTextArea.setEditable(false);
		resultsTextArea.setFont(new Font("Monospaced", 0, 12));
		resultsTextArea.setMargin(new Insets(7, 7, 7, 7));
		resultsScrollPane.setViewportView(resultsTextArea);
		resultsPanel.add(resultsScrollPane, "Center");
		resultsTopPanel.setLayout(new FlowLayout(0));
		resultsLabel.setFont(new Font("DialogInput", 1, 12));
		resultsLabel.setText("Results:");
		resultsTopPanel.add(resultsLabel);
		resultsPanel.add(resultsTopPanel, "North");
		resultBottomPanel.setLayout(new FlowLayout(2, 15, 5));
		resultBottomPanel.add(workingProgressBar);
		clearButton.setMnemonic('a');
		clearButton.setText("Clear");
		clearButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				SubLReaderPanel.this.clearButtonActionPerformed(evt);
			}
		});
		resultBottomPanel.add(clearButton);
		findButton.setMnemonic('F');
		findButton.setText("Find");
		findButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				SubLReaderPanel.this.findButtonActionPerformed(evt);
			}
		});
		resultBottomPanel.add(findButton);
		historyGotoPanel.setBorder(BorderFactory.createEtchedBorder(0));
		historyGotoLabel.setLabelFor(historyGotoTextField);
		historyGotoLabel.setText("Go to: ");
		historyGotoPanel.add(historyGotoLabel);
		historyGotoTextField.setColumns(5);
		historyGotoTextField.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				SubLReaderPanel.this.historyGotoTextFieldActionPerformed(evt);
			}
		});
		historyGotoPanel.add(historyGotoTextField);
		historyGotoButton.setMnemonic('g');
		historyGotoButton.setText("Go");
		historyGotoButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				SubLReaderPanel.this.historyGotoButtonActionPerformed(evt);
			}
		});
		historyGotoPanel.add(historyGotoButton);
		resultBottomPanel.add(historyGotoPanel);
		upButton.setMnemonic('u');
		upButton.setText("Up");
		upButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				SubLReaderPanel.this.upButtonActionPerformed(evt);
			}
		});
		resultBottomPanel.add(upButton);
		downButton.setMnemonic('d');
		downButton.setText("Down");
		downButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				SubLReaderPanel.this.downButtonActionPerformed(evt);
			}
		});
		resultBottomPanel.add(downButton);
		resultsPanel.add(resultBottomPanel, "South");
		mainSplitPane.setBottomComponent(resultsPanel);
		entryPanel.setLayout(new BorderLayout());
		entryButtonPanel.setLayout(new FlowLayout(2, 15, 5));
		enterButton.setMnemonic('e');
		enterButton.setText("Evaluate");
		enterButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				SubLReaderPanel.this.enterButtonActionPerformed(evt);
			}
		});
		entryButtonPanel.add(enterButton);
		ClearEntryButton.setMnemonic('C');
		ClearEntryButton.setText("Clear");
		ClearEntryButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				SubLReaderPanel.this.ClearEntryButtonActionPerformed(evt);
			}
		});
		entryButtonPanel.add(ClearEntryButton);
		loadFileButton.setMnemonic('l');
		loadFileButton.setText("Load");
		loadFileButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				SubLReaderPanel.this.loadFileButtonActionPerformed(evt);
			}
		});
		entryButtonPanel.add(loadFileButton);
		quitButton.setMnemonic('q');
		quitButton.setText("Quit");
		quitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				SubLReaderPanel.this.quitButtonActionPerformed(evt);
			}
		});
		entryButtonPanel.add(quitButton);
		entryPanel.add(entryButtonPanel, "South");
		entryEditorPanel.setLayout(new BorderLayout());
		entryTextArea.setFont(new Font("Monospaced", 0, 12));
		entryTextArea.setMargin(new Insets(7, 7, 7, 7));
		entryScrollPane.setViewportView(entryTextArea);
		entryEditorPanel.add(entryScrollPane, "Center");
		entryPanel.add(entryEditorPanel, "Center");
		entryTopPanel.setLayout(new FlowLayout(0));
		entryLabel.setFont(new Font("DialogInput", 1, 12));
		entryLabel.setText("Enter:");
		entryTopPanel.add(entryLabel);
		entryPanel.add(entryTopPanel, "North");
		mainSplitPane.setTopComponent(entryPanel);
		this.add(mainSplitPane, "Center");
	}

	private void loadFile() {
		JFileChooser chooser = new JFileChooser();
		int returnVal = chooser.showOpenDialog(SubLReaderPanel.mainFrame);
		if (returnVal == 0) {
			String fileName = chooser.getSelectedFile().getAbsolutePath();
			String command = "(load \"" + fileName + "\")";
			entryTextArea.setText(command);
			forceEvaluation();
		}
	}

	private void loadFileButtonActionPerformed(ActionEvent evt) {
		loadFile();
		entryTextArea.grabFocus();
	}

	private void quitButtonActionPerformed(ActionEvent evt) {
		verifyQuit();
	}

	private void resetUIAfterProcessing() {
		Runnable runnable = new SafeRunnable() {
			@Override
			public void safeRun() {
				resultsTextArea.setCaretPosition(resultsTextArea.getText().length());
				enterButton.setEnabled(true);
				entryTextArea.setEnabled(true);
				entryTextArea.setText("");
				entryTextArea.grabFocus();
			}
		};
		SwingUtilities.invokeLater(runnable);
	}

	private void upButtonActionPerformed(ActionEvent evt) {
	}

	private void verifyQuit() {
		int result = JOptionPane.showConfirmDialog(SubLReaderPanel.mainReaderPanel,
				"Do you want to quit the application?", "Quit?", 0, 3);
		if (result == 0)
			SubLMain.me.doSystemCleanupAndExit(0);
	}

	public SubLReader getReader() {
		return sublReader;
	}

	public void scrollEntryTextAreaToBottom() {
		JScrollBar sb = entryScrollPane.getVerticalScrollBar();
		sb.setValue(sb.getMaximum());
	}

	protected void addBindings(InputMap inputMap) {
		KeyStroke key = KeyStroke.getKeyStroke(66, 2);
		inputMap.put(key, "caret-backward");
		key = KeyStroke.getKeyStroke(70, 2);
		inputMap.put(key, "caret-forward");
		key = KeyStroke.getKeyStroke(80, 2);
		inputMap.put(key, "caret-up");
		key = KeyStroke.getKeyStroke(78, 2);
		inputMap.put(key, "caret-down");
		key = KeyStroke.getKeyStroke(69, 2);
		inputMap.put(key, "caret-end-line");
		key = KeyStroke.getKeyStroke(65, 2);
		inputMap.put(key, "caret-begin-line");
		key = KeyStroke.getKeyStroke(68, 2);
		inputMap.put(key, "delete-next");
		key = KeyStroke.getKeyStroke(65, 8);
		inputMap.put(key, "select-all");
		key = KeyStroke.getKeyStroke(88, 2);
		inputMap.put(key, "cut-to-clipboard");
		key = KeyStroke.getKeyStroke(67, 2);
		inputMap.put(key, "copy-to-clipboard");
		key = KeyStroke.getKeyStroke(86, 2);
		inputMap.put(key, "paste-from-clipboard");
		key = KeyStroke.getKeyStroke(90, 2);
		inputMap.put(key, undoAction);
		key = KeyStroke.getKeyStroke(89, 2);
		inputMap.put(key, redoAction);
	}

	protected JMenu createEditMenu() {
		JMenu menu = new JMenu("Edit");
		menu.add(undoAction);
		menu.add(redoAction);
		menu.addSeparator();
		menu.add(getActionByName("cut-to-clipboard"));
		menu.add(getActionByName("copy-to-clipboard"));
		menu.add(getActionByName("paste-from-clipboard"));
		menu.addSeparator();
		menu.add(getActionByName("select-all"));
		return menu;
	}
}
