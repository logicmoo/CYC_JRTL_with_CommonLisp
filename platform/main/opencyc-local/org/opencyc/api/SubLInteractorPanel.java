package org.opencyc.api;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Insets;
import javax.swing.BorderFactory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagConstraints;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.Component;
import java.awt.event.ComponentListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentAdapter;
import java.awt.Dimension;
import javax.swing.JFrame;
import org.opencyc.cycobject.DefaultCycObject;
import javax.swing.SwingUtilities;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.ByteArrayOutputStream;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.util.List;
import javax.swing.JPanel;

public class SubLInteractorPanel extends JPanel
{
    private final SubLInteractor interactor;
    private boolean isRunning;
    private static final List<String> TIMEOUT_OPTION_STRINGS;
    private static final List<Integer> TIMEOUT_OPTION_VALUES;
    private JPanel buttonPanel;
    private JButton clearButton;
    private JButton evalCancelButton;
    private JLabel hostInfoLabel;
    private JTextArea inputField;
    private JScrollPane inputFieldScrollPane;
    private JSplitPane jSplitPane1;
    private JLabel mainTitleLabel;
    private JTextArea outputField;
    private JScrollPane outputFieldScrollPane;
    private JButton quitButton;
    private JLabel resultsLabel;
    private JPanel resultsPanel;
    private JComboBox timeoutComboBox;
    private JLabel timeoutLabel;
    
    public SubLInteractorPanel(final SubLInteractor interactor) {
        this.isRunning = false;
        this.interactor = interactor;
        this.initComponents();
        this.setTimeoutMsecsFromTimeoutComboBox();
    }
    
    private ComboBoxModel makeTimeoutComboBoxModel() {
        return new DefaultComboBoxModel(SubLInteractorPanel.TIMEOUT_OPTION_STRINGS.toArray());
    }
    
    private void displayResult(final List result) {
        final StringBuilder resultStringBuilder = new StringBuilder();
        if (result == null) {
            resultStringBuilder.append(this.getResultString(result));
        }
        else if (result.size() == 1) {
            resultStringBuilder.append(this.getResultString(result.get(0)));
        }
        else {
            for (int i = 0; i < result.size(); ++i) {
                final Object resultObj = result.get(i);
                resultStringBuilder.append("Value " + i + ": " + this.getResultString(resultObj) + '\n');
            }
        }
        this.displayOutput(Color.BLACK, resultStringBuilder.toString());
    }
    
    private void displayException(final Exception e) {
        final ByteArrayOutputStream stream = new ByteArrayOutputStream();
        final PrintWriter pw = new PrintWriter(stream);
        e.printStackTrace(pw);
        pw.flush();
        this.displayOutput(Color.RED, stream.toString());
    }
    
    private void displayOutput(final Color color, final String output) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SubLInteractorPanel.this.outputField.append("\n==============================================\n");
                SubLInteractorPanel.this.outputField.append("Input: " + SubLInteractorPanel.this.inputField.getText());
                SubLInteractorPanel.this.outputField.append("\n\nResult:\n");
                SubLInteractorPanel.this.outputField.append(output);
                SubLInteractorPanel.this.setGUIToIdleMode();
            }
        });
    }
    
    private String getResultString(final Object resultObj) {
        return DefaultCycObject.isCycLObject(resultObj) ? DefaultCycObject.cyclify(resultObj) : ((resultObj == null) ? "null" : resultObj.toString());
    }
    
    private void setTimeoutMsecsFromTimeoutComboBox() {
        final String selectedString = (String)this.timeoutComboBox.getSelectedItem();
        final int value = SubLInteractorPanel.TIMEOUT_OPTION_VALUES.get(SubLInteractorPanel.TIMEOUT_OPTION_STRINGS.indexOf(selectedString));
        this.interactor.setTimeoutMsecs(value);
    }
    
    private void setGUIToRunningMode() {
        this.inputField.setEditable(false);
        this.inputField.setForeground(Color.DARK_GRAY);
        this.evalCancelButton.setText("Cancel");
        this.isRunning = true;
    }
    
    private void setGUIToIdleMode() {
        this.inputField.setEditable(true);
        this.inputField.setForeground(Color.BLACK);
        this.evalCancelButton.setText("Eval");
        this.isRunning = false;
    }
    
    public static void main(final String[] args) {
        try {
            final CycAccess cycAccess = CycAccess.getNewCycAccessInteractively();
            if (cycAccess == null) {
                System.exit(-1);
            }
            final SubLInteractor interactor = new SubLInteractor(cycAccess);
            final JFrame frame = new JFrame();
            frame.setTitle("SubL Interactor (" + cycAccess.getHostName() + ":" + cycAccess.getBasePort() + ")");
            frame.setMinimumSize(new Dimension(300, 300));
            frame.setPreferredSize(new Dimension(400, 600));
            final SubLInteractorPanel interactorPanel = new SubLInteractorPanel(interactor);
            interactorPanel.addComponentListener(new ComponentAdapter() {
                @Override
                public void componentHidden(final ComponentEvent e) {
                    System.exit(0);
                }
            });
            frame.getContentPane().add(interactorPanel);
            frame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(final WindowEvent e) {
                    System.exit(0);
                }
            });
            frame.pack();
            frame.setVisible(true);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void initComponents() {
        this.mainTitleLabel = new JLabel();
        this.hostInfoLabel = new JLabel();
        this.buttonPanel = new JPanel();
        this.evalCancelButton = new JButton();
        this.clearButton = new JButton();
        this.timeoutLabel = new JLabel();
        this.timeoutComboBox = new JComboBox();
        this.quitButton = new JButton();
        this.jSplitPane1 = new JSplitPane();
        this.inputFieldScrollPane = new JScrollPane();
        this.inputField = new JTextArea();
        this.resultsPanel = new JPanel();
        this.resultsLabel = new JLabel();
        this.outputFieldScrollPane = new JScrollPane();
        this.outputField = new JTextArea();
        this.setMinimumSize(new Dimension(400, 600));
        this.setLayout(new GridBagLayout());
        this.mainTitleLabel.setFont(this.mainTitleLabel.getFont().deriveFont(this.mainTitleLabel.getFont().getStyle() | 0x1, this.mainTitleLabel.getFont().getSize() + 4));
        this.mainTitleLabel.setText("SubL Interactor");
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridwidth = 0;
        this.add(this.mainTitleLabel, gridBagConstraints);
        this.hostInfoLabel.setText(this.interactor.getCycAccess().toString());
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridwidth = 0;
        this.add(this.hostInfoLabel, gridBagConstraints);
        this.evalCancelButton.setText("Eval");
        this.evalCancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                SubLInteractorPanel.this.evalCancelButtonActionPerformed(evt);
            }
        });
        this.buttonPanel.add(this.evalCancelButton);
        this.clearButton.setText("Clear");
        this.clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                SubLInteractorPanel.this.clearButtonActionPerformed(evt);
            }
        });
        this.buttonPanel.add(this.clearButton);
        this.timeoutLabel.setText("timeout:");
        this.buttonPanel.add(this.timeoutLabel);
        this.timeoutComboBox.setModel(this.makeTimeoutComboBoxModel());
        this.timeoutComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                SubLInteractorPanel.this.timeoutComboBoxActionPerformed(evt);
            }
        });
        this.buttonPanel.add(this.timeoutComboBox);
        this.quitButton.setText("Quit");
        this.quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                SubLInteractorPanel.this.quitButtonActionPerformed(evt);
            }
        });
        this.buttonPanel.add(this.quitButton);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridwidth = 0;
        this.add(this.buttonPanel, gridBagConstraints);
        this.jSplitPane1.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
        this.jSplitPane1.setOrientation(0);
        this.jSplitPane1.setResizeWeight(0.5);
        this.jSplitPane1.setOneTouchExpandable(true);
        this.inputField.setFont(this.inputField.getFont().deriveFont(this.inputField.getFont().getSize() + 3.0f));
        this.inputField.setLineWrap(true);
        this.inputField.setRows(5);
        this.inputField.setWrapStyleWord(true);
        this.inputFieldScrollPane.setViewportView(this.inputField);
        this.jSplitPane1.setTopComponent(this.inputFieldScrollPane);
        this.resultsPanel.setLayout(new GridBagLayout());
        this.resultsLabel.setText("Results");
        this.resultsLabel.setAlignmentY(0.0f);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridwidth = 0;
        this.resultsPanel.add(this.resultsLabel, gridBagConstraints);
        this.outputField.setColumns(20);
        this.outputField.setEditable(false);
        this.outputField.setLineWrap(true);
        this.outputField.setRows(5);
        this.outputField.setWrapStyleWord(true);
        this.outputFieldScrollPane.setViewportView(this.outputField);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.resultsPanel.add(this.outputFieldScrollPane, gridBagConstraints);
        this.jSplitPane1.setRightComponent(this.resultsPanel);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(2, 10, 2, 10);
        this.add(this.jSplitPane1, gridBagConstraints);
    }
    
    private void evalCancelButtonActionPerformed(final ActionEvent evt) {
        if (this.isRunning) {
            try {
                this.interactor.cancelLastCommand();
            }
            catch (Exception ex) {}
            this.setGUIToIdleMode();
        }
        else {
            this.setGUIToRunningMode();
            new Thread() {
                @Override
                public void run() {
                    try {
                        final List result = SubLInteractorPanel.this.interactor.submitSubL(SubLInteractorPanel.this.inputField.getText());
                        SubLInteractorPanel.this.displayResult(result);
                    }
                    catch (Exception ex) {
                        Logger.getLogger(SubLInteractorPanel.class.getName()).log(Level.SEVERE, null, ex);
                        SubLInteractorPanel.this.displayException(ex);
                    }
                }
            }.start();
        }
    }
    
    private void clearButtonActionPerformed(final ActionEvent evt) {
        this.inputField.setText("");
    }
    
    private void timeoutComboBoxActionPerformed(final ActionEvent evt) {
        this.setTimeoutMsecsFromTimeoutComboBox();
    }
    
    private void quitButtonActionPerformed(final ActionEvent evt) {
        this.setVisible(false);
        this.interactor.quit();
    }
    
    static {
        TIMEOUT_OPTION_STRINGS = Arrays.asList("None", "1 second", "5 seconds", "30 seconds", "1 minute", "5 minutes");
        TIMEOUT_OPTION_VALUES = Arrays.asList(0, 1000, 5000, 30000, 60000, 300000);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 216 ms
	
	Decompiled with Procyon 0.5.32.
*/