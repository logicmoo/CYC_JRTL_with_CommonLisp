package org.opencyc.util;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.LayoutManager;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.Action;
import javax.swing.JPanel;

public class ListBox extends JPanel
{
    protected Action addAction;
    protected Action removeAction;
    protected Action updateAction;
    protected JList list;
    protected JTextField field;
    protected JButton addButton;
    protected JButton removeButton;
    protected Object lastSelected;
    
    public ListBox(final String title, final int rowCount) {
        this(null, null, null, title, rowCount);
    }
    
    public ListBox(final Action addAction, final Action removeAction, final Action updateAction, final String title, final int rowCount) {
        this.list = new JList();
        this.field = new JTextField();
        this.addButton = new JButton("Add");
        this.removeButton = new JButton("Remove");
        this.lastSelected = null;
        this.addAction = addAction;
        this.removeAction = removeAction;
        this.setLayout(new BorderLayout());
        this.removeButton.setEnabled(false);
        this.list.setVisibleRowCount(rowCount);
        this.list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(final ListSelectionEvent ev) {
                final int idx = ev.getFirstIndex();
                if (idx == -1) {
                    ListBox.this.lastSelected = null;
                }
                else {
                    ListBox.this.lastSelected = ((JList)ev.getSource()).getModel().getElementAt(idx);
                }
                if (ev.getValueIsAdjusting()) {
                    return;
                }
                if (((JList)ev.getSource()).getSelectedIndex() == -1) {
                    ListBox.this.removeButton.setEnabled(false);
                }
                else {
                    ListBox.this.removeButton.setEnabled(true);
                }
            }
        });
        this.setLayout(new BorderLayout());
        final JPanel listPanel = new JPanel();
        listPanel.setLayout(new BorderLayout());
        final JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(2, 2));
        listPanel.add(new JLabel(title), "North");
        listPanel.add(new JScrollPane(this.list, 22, 30), "Center");
        gridPanel.add(this.addButton);
        gridPanel.add(this.field);
        gridPanel.add(this.removeButton);
        this.add(listPanel, "Center");
        this.add(gridPanel, "South");
        if (addAction != null) {
            this.addButton.addActionListener(addAction);
        }
        if (removeAction != null) {
            this.removeButton.addActionListener(removeAction);
        }
        if (updateAction != null) {
            this.addButton.addActionListener(updateAction);
            this.removeButton.addActionListener(updateAction);
            updateAction.actionPerformed(new ActionEvent(this, 0, null));
        }
    }
    
    public void setActions(final Action add, final Action remove, final Action update) {
        if (this.addAction != null) {
            this.addButton.removeActionListener(this.addAction);
        }
        if (this.removeAction != null) {
            this.removeButton.removeActionListener(this.removeAction);
        }
        if (this.updateAction != null) {
            this.addButton.removeActionListener(this.updateAction);
            this.removeButton.removeActionListener(this.updateAction);
        }
        this.addAction = add;
        this.removeAction = remove;
        this.updateAction = update;
        if (this.addAction != null) {
            this.addButton.addActionListener(this.addAction);
        }
        if (this.removeAction != null) {
            this.removeButton.addActionListener(this.removeAction);
        }
        if (this.updateAction != null) {
            this.addButton.addActionListener(this.updateAction);
            this.removeButton.addActionListener(this.updateAction);
            this.updateAction.actionPerformed(new ActionEvent(this, 0, null));
        }
    }
    
    public Object getSelectedValue() {
        return this.lastSelected;
    }
    
    public JList getList() {
        return this.list;
    }
    
    public JTextField getField() {
        return this.field;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 110 ms
	
	Decompiled with Procyon 0.5.32.
*/