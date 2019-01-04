package com.netbreeze.swing;

import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

import org.logicmoo.bb.BeansContext;

import java.awt.*;
import java.awt.dnd.*;
import java.awt.datatransfer.*;


/**
 * A GUI component that shows what a Collection contains,
 * and lets you add and remove elements.
 *
 * @author Henrik Kniberg
 */
public class CollectionContentsPanel extends JPanel implements SmallBeanView.RemoveListener, DropTargetListener {

  Collection collection;
  BeansContext context;
  JPanel panel;
  JScrollPane scroll;
  Border defaultScrollBorder;
  JButton reloadButton;

  DropTarget dropTarget;

  //An invisible panel in front of the list of contents, which
  //captures drag/drop operations
  JPanel dropGlass;

  public CollectionContentsPanel(BeansContext context, Collection collection) {
    this.collection = collection;
    this.context = context;
    initGUI();
  }

  public CollectionContentsPanel(Collection collection) throws Exception {
    this(SwingEnvironment.getBeansContext(), collection);
  }

  private void initGUI() {
    panel = new JPanel();
    panel.setLayout(new VerticalLayout());

    dropGlass = new JPanel();
    dropGlass.setOpaque(false);
    dropTarget = new DropTarget(dropGlass, this);

    scroll = new JScrollPane(panel);
    defaultScrollBorder = scroll.getBorder();

    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    reloadButton = new JButton("Update");
    buttonPanel.add(reloadButton);
    buttonPanel.add(new JLabel("To add objects just drag them into the panel below."));
    reloadButton.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent event) {
          reloadContents();
        }
      }
    );

    JPanel stack = new JPanel();
    stack.setLayout(new OverlayLayout(stack));
    stack.add(dropGlass);
    stack.add(scroll);

    //setBorder(new TitledBorder(new , "XYZ"));
    setLayout(new BorderLayout());
    add("North", buttonPanel);
    add("Center", stack);

    reloadContents();
  }

  public void beanRemoved(Object bean, Collection parent) {
    reloadContents();
  }

  public void reloadContents() {
    panel.removeAll();
    if(collection==null) return;
    Iterator it = collection.iterator();
    while (it.hasNext()) {
      Object bean = it.next();
      SmallBeanView view = new SmallBeanView(context, bean, true, true, true, collection);
      view.setRemoveListener(this);
      panel.add(view);
    }
    invalidate();
    validate();
    repaint();
  }

//======= Drag/Drop methods ====================================0

  public void dragEnter(DropTargetDragEvent event) {
    event.acceptDrag (DnDConstants.ACTION_MOVE);
  }

  public void dragExit(DropTargetEvent dtde) {
  }
  public void dragOver(DropTargetDragEvent dtde) {
  }
  public void drop(DropTargetDropEvent event) {
    Transferable t = event.getTransferable();
    try {
      Object o = t.getTransferData(new DataFlavor(DataFlavor.javaJVMLocalObjectMimeType));
      collection.add(o);
      reloadContents();
    } catch (Exception err) {
      new ErrorDialog("An error occurred while handling a drop operation", err).show();
    }
  }
  public void dropActionChanged(DropTargetDragEvent dtde) {
  }
}