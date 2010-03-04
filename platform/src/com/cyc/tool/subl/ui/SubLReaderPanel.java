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

package  com.cyc.tool.subl.ui;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLReader;
import com.cyc.tool.subl.util.*;
import javax.swing.*;
import java.awt.Toolkit;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.JTextComponent;
import javax.swing.undo.*;

public  class SubLReaderPanel extends javax.swing.JPanel {
  
  //// Constructors
  
  /** Creates new form SubLReaderPanel. */
  public SubLReaderPanel(SubLEnvironment env) {
    initComponents();
    init(env);
    try {
      inStream = new TextAreaInputStream(entryTextArea);
      outStream = new TextAreaOutputStream(resultsTextArea, resultsScrollPane);
      sublReader = new SubLReader(true, inStream, outStream) {
        
        protected void setIsBusy(boolean isBusy) {
          super.isBusy();
          workingProgressBar.setIndeterminate(isBusy);
          enterButton.setEnabled(!isBusy());
          loadFileButton.setEnabled(!isBusy());
        }
        
        public void writePrompt(String prompt) {
          super.writePrompt(prompt);
          entryLabel.setText(prompt);
        }
        
        public void writeCommand(String command) {
          System.out.print(command);
          System.out.flush();
        }
        
        public void writeResults(String results) {
          super.writeResults(results);
          scrollEntryTextAreaToBottom();
        }
      };
    } catch (Exception e) {
      Errors.error("Can't create read loop UI.", e);
    }
  }
  
  public void scrollEntryTextAreaToBottom() {
    JScrollBar sb = entryScrollPane.getVerticalScrollBar();
    sb.setValue(sb.getMaximum());
  }
  
  public SubLReader getReader() {
    return sublReader;
  }
  
  public static SubLReader startReadloopWindow() {
    SubLEnvironment env = SubLEnvironment.currentEnvironment();
    SubLReaderPanel mainReaderPanel = new SubLReaderPanel(env);
    JFrame mainFrame = new JFrame("SubL Interpreter");
    mainFrame.setContentPane(mainReaderPanel);
    mainFrame.setSize(700,850);
    mainFrame.validate();
    Dimension screenSize =
      Toolkit.getDefaultToolkit().getScreenSize();
    Dimension curSize = mainFrame.getSize();
    mainFrame.setLocation(screenSize.width/2 - (curSize.width/2),
      screenSize.height/2 - (curSize.height/2));
    mainFrame.setVisible(true); 
    // mainReaderPanel.entryTextArea.grabFocus();
    return mainReaderPanel.getReader();
  }
  
  //// Public Area
  
  //// Protected Area
  
  //// Private Area
  
  //Add a couple of emacs key bindings for navigation.
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
    inputMap.put(key, undoAction);
    key = KeyStroke.getKeyStroke(KeyEvent.VK_Y, Event.CTRL_MASK);
    inputMap.put(key, redoAction);
    
    /*key = KeyStroke.getKeyStroke(KeyEvent.VK_A, Event.ALT_MASK);
    inputMap.put(key, DefaultEditorKit.previousWord);
    key = KeyStroke.getKeyStroke(KeyEvent.VK_A, Event.ALT_MASK);
    inputMap.put(key, DefaultEditorKit.nextWord);
    key = KeyStroke.getKeyStroke(KeyEvent.VK_A, Event.ALT_MASK);
    inputMap.put(key, DefaultEditorKit.pageDownAction);
    key = KeyStroke.getKeyStroke(KeyEvent.VK_A, Event.ALT_MASK);
    inputMap.put(key, DefaultEditorKit.pageUpAction);*/
  }
  
  //Create the edit menu.
  protected JMenu createEditMenu() {
    JMenu menu = new JMenu("Edit");
    menu.add(undoAction);
    menu.add(redoAction);
    
    menu.addSeparator();
    
    menu.add(getActionByName(DefaultEditorKit.cutAction));
    menu.add(getActionByName(DefaultEditorKit.copyAction));
    menu.add(getActionByName(DefaultEditorKit.pasteAction));
    
    menu.addSeparator();
    
    menu.add(getActionByName(DefaultEditorKit.selectAllAction));
    return menu;
  }
  private Action getActionByName(String name) {
    return (Action)(actions.get(name));
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
  
  private void resetUIAfterProcessing() {
    Runnable runnable = new SafeRunnable() {
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
  
  private void loadFile() {
    JFileChooser chooser = new JFileChooser();
    int returnVal = chooser.showOpenDialog(mainFrame);
    if(returnVal == JFileChooser.APPROVE_OPTION) {
      String fileName = chooser.getSelectedFile().getAbsolutePath();
      String command = "(load \"" + fileName + "\")";
      entryTextArea.setText(command);
      forceEvaluation();
    }
  }
  
  private void forceEvaluation() {
    entryTextArea.grabFocus();
    entryTextArea.setCaretPosition(entryTextArea.getText().length());
    entryTextArea.setSelectionStart(0);
    entryTextArea.setSelectionEnd(0);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
  }
  
  private void verifyQuit() {
    int result = JOptionPane.showConfirmDialog(mainReaderPanel,
      "Do you want to quit the application?", "Quit?", JOptionPane.YES_NO_OPTION,
      JOptionPane.QUESTION_MESSAGE);
    if (result == JOptionPane.YES_OPTION) {
      SubLMain.me.doSystemCleanupAndExit(0);
    }
  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
  private void initComponents() {
    mainSplitPane = new javax.swing.JSplitPane();
    resultsPanel = new javax.swing.JPanel();
    resultsScrollPane = new javax.swing.JScrollPane();
    resultsTextArea = new javax.swing.JTextArea();
    resultsTopPanel = new javax.swing.JPanel();
    resultsLabel = new javax.swing.JLabel();
    resultBottomPanel = new javax.swing.JPanel();
    workingProgressBar = new javax.swing.JProgressBar();
    clearButton = new javax.swing.JButton();
    findButton = new javax.swing.JButton();
    historyGotoPanel = new javax.swing.JPanel();
    historyGotoLabel = new javax.swing.JLabel();
    historyGotoTextField = new javax.swing.JTextField();
    historyGotoButton = new javax.swing.JButton();
    upButton = new javax.swing.JButton();
    downButton = new javax.swing.JButton();
    entryPanel = new javax.swing.JPanel();
    entryButtonPanel = new javax.swing.JPanel();
    enterButton = new javax.swing.JButton();
    ClearEntryButton = new javax.swing.JButton();
    loadFileButton = new javax.swing.JButton();
    quitButton = new javax.swing.JButton();
    entryEditorPanel = new javax.swing.JPanel();
    entryScrollPane = new javax.swing.JScrollPane();
    entryTextArea = new javax.swing.JTextArea();
    entryTopPanel = new javax.swing.JPanel();
    entryLabel = new javax.swing.JLabel();

    setLayout(new java.awt.BorderLayout());

    setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
    setPreferredSize(new java.awt.Dimension(700, 900));
    mainSplitPane.setDividerLocation(200);
    mainSplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
    mainSplitPane.setOneTouchExpandable(true);
    resultsPanel.setLayout(new java.awt.BorderLayout());

    resultsTextArea.setEditable(false);
    resultsTextArea.setFont(new java.awt.Font("Monospaced", 0, 12));
    resultsTextArea.setMargin(new java.awt.Insets(7, 7, 7, 7));
    resultsScrollPane.setViewportView(resultsTextArea);

    resultsPanel.add(resultsScrollPane, java.awt.BorderLayout.CENTER);

    resultsTopPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

    resultsLabel.setFont(new java.awt.Font("DialogInput", 1, 12));
    resultsLabel.setText("Results:");
    resultsTopPanel.add(resultsLabel);

    resultsPanel.add(resultsTopPanel, java.awt.BorderLayout.NORTH);

    resultBottomPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 15, 5));

    resultBottomPanel.add(workingProgressBar);

    clearButton.setMnemonic('a');
    clearButton.setText("Clear");
    clearButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        clearButtonActionPerformed(evt);
      }
    });

    resultBottomPanel.add(clearButton);

    findButton.setMnemonic('F');
    findButton.setText("Find");
    findButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        findButtonActionPerformed(evt);
      }
    });

    resultBottomPanel.add(findButton);

    historyGotoPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
    historyGotoLabel.setLabelFor(historyGotoTextField);
    historyGotoLabel.setText("Go to: ");
    historyGotoPanel.add(historyGotoLabel);

    historyGotoTextField.setColumns(5);
    historyGotoTextField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        historyGotoTextFieldActionPerformed(evt);
      }
    });

    historyGotoPanel.add(historyGotoTextField);

    historyGotoButton.setMnemonic('g');
    historyGotoButton.setText("Go");
    historyGotoButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        historyGotoButtonActionPerformed(evt);
      }
    });

    historyGotoPanel.add(historyGotoButton);

    resultBottomPanel.add(historyGotoPanel);

    upButton.setMnemonic('u');
    upButton.setText("Up");
    upButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        upButtonActionPerformed(evt);
      }
    });

    resultBottomPanel.add(upButton);

    downButton.setMnemonic('d');
    downButton.setText("Down");
    downButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        downButtonActionPerformed(evt);
      }
    });

    resultBottomPanel.add(downButton);

    resultsPanel.add(resultBottomPanel, java.awt.BorderLayout.SOUTH);

    mainSplitPane.setBottomComponent(resultsPanel);

    entryPanel.setLayout(new java.awt.BorderLayout());

    entryButtonPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 15, 5));

    enterButton.setMnemonic('e');
    enterButton.setText("Evaluate");
    enterButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        enterButtonActionPerformed(evt);
      }
    });

    entryButtonPanel.add(enterButton);

    ClearEntryButton.setMnemonic('C');
    ClearEntryButton.setText("Clear");
    ClearEntryButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        ClearEntryButtonActionPerformed(evt);
      }
    });

    entryButtonPanel.add(ClearEntryButton);

    loadFileButton.setMnemonic('l');
    loadFileButton.setText("Load");
    loadFileButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        loadFileButtonActionPerformed(evt);
      }
    });

    entryButtonPanel.add(loadFileButton);

    quitButton.setMnemonic('q');
    quitButton.setText("Quit");
    quitButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        quitButtonActionPerformed(evt);
      }
    });

    entryButtonPanel.add(quitButton);

    entryPanel.add(entryButtonPanel, java.awt.BorderLayout.SOUTH);

    entryEditorPanel.setLayout(new java.awt.BorderLayout());

    entryTextArea.setFont(new java.awt.Font("Monospaced", 0, 12));
    entryTextArea.setMargin(new java.awt.Insets(7, 7, 7, 7));
    entryScrollPane.setViewportView(entryTextArea);

    entryEditorPanel.add(entryScrollPane, java.awt.BorderLayout.CENTER);

    entryPanel.add(entryEditorPanel, java.awt.BorderLayout.CENTER);

    entryTopPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

    entryLabel.setFont(new java.awt.Font("DialogInput", 1, 12));
    entryLabel.setText("Enter:");
    entryTopPanel.add(entryLabel);

    entryPanel.add(entryTopPanel, java.awt.BorderLayout.NORTH);

    mainSplitPane.setTopComponent(entryPanel);

    add(mainSplitPane, java.awt.BorderLayout.CENTER);

  }// </editor-fold>//GEN-END:initComponents
  
  private void ClearEntryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearEntryButtonActionPerformed
    entryTextArea.setText("");
    entryTextArea.grabFocus();
  }//GEN-LAST:event_ClearEntryButtonActionPerformed
  
  private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
    verifyQuit();
  }//GEN-LAST:event_quitButtonActionPerformed
  
  private void loadFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFileButtonActionPerformed
    loadFile();
    entryTextArea.grabFocus();
  }//GEN-LAST:event_loadFileButtonActionPerformed
  
  private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
    forceEvaluation();
    entryTextArea.grabFocus();
  }//GEN-LAST:event_enterButtonActionPerformed
  
  private void downButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downButtonActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_downButtonActionPerformed
  
  private void upButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upButtonActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_upButtonActionPerformed
  
  private void historyGotoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyGotoButtonActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_historyGotoButtonActionPerformed
  
  private void findButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButtonActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_findButtonActionPerformed
  
  private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_clearButtonActionPerformed
  
  private void historyGotoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyGotoTextFieldActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_historyGotoTextFieldActionPerformed
  
  private void createActionTable(JTextComponent textComponent) {
    actions = new HashMap();
    Action[] actionsArray = textComponent.getActions();
    for (int i = 0; i < actionsArray.length; i++) {
      Action a = actionsArray[i];
      actions.put(a.getValue(Action.NAME), a);
    }
  }
  
  //// Internal Rep
  
  private SubLEnvironment env;
  private int historyNum = 1;
  private SubLCommandHistory history = new SubLCommandHistory();
  private static JFrame mainFrame;
  private static SubLReaderPanel mainReaderPanel;
  private InputStream inStream;
  private OutputStream outStream;
  private SubLReader sublReader;
  private static Robot robot;
  //undo helpers
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
  
  //This one listens for edits that can be undone.
  protected class SubLReaderUndoableEditListener
    implements UndoableEditListener {
    public void undoableEditHappened(UndoableEditEvent e) {
      undo.addEdit(e.getEdit());
      undoAction.updateUndoState();
      redoAction.updateRedoState();
    }
  }
  
  
  
  class UndoAction extends AbstractAction {
    public UndoAction() {
      super("Undo");
      setEnabled(false);
    }
    
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
        putValue(Action.NAME, undo.getUndoPresentationName());
      } else {
        setEnabled(false);
        putValue(Action.NAME, "Undo");
      }
    }
  }
  
  class RedoAction extends AbstractAction {
    public RedoAction() {
      super("Redo");
      setEnabled(false);
    }
    
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
        putValue(Action.NAME, undo.getRedoPresentationName());
      } else {
        setEnabled(false);
        putValue(Action.NAME, "Redo");
      }
    }
  }
  
  static {
    try {
      robot = new Robot();
    } catch (Exception e) {
      Errors.handleError("Unable to create UI robot.", e);
    }
  }
  
}
