package com.netbreeze.swing;

import javax.swing.*;
import javax.swing.event.*;
import com.netbreeze.util.*;
import java.util.*;
import java.io.*;
/**
 * A ComboBox model for lists of classes. The list of classes
 * is limited by choosing an ancestor, a certain
 * interface or class that all other classes must extend
 * or implement, either directly or indirectly.
 *
 * Optionally a package name can also be provided, this will
 * limit the choices to classes that are part of that package only
 * (and speed up performance a bit).
 *
 * @author Henrik Kniberg
 *
 */
public class ClassSelectionComboBoxModel extends DefaultComboBoxModel {
  public ClassSelectionComboBoxModel(Class ancestor) throws IOException {
    super(getClassList(null, ancestor).toArray());
  }

  public ClassSelectionComboBoxModel(String packageName, Class ancestor) throws IOException {
    super(getClassList(packageName, ancestor).toArray());
  }

  /**
   * Returns a sorted list of classes
   */
  private static List getClassList(String packageName, Class ancestor) throws IOException {
    Set classSet = ClassFinder.getClasses(packageName, ancestor);
    List classList = new LinkedList(classSet);

    Comparator classComparator = new Comparator() {
      @Override
	public int compare(Object a, Object b) {
        return a.toString().compareTo(b.toString());
      }
    };

    Collections.sort(classList, classComparator);
    return classList;
  }

//===== Module test program ================================

  public static void main(String[] args) {
    try {
      JFrame frame = new JFrame("Test");
      JComboBox combo = new JComboBox(new ClassSelectionComboBoxModel("com.netbreeze", com.netbreeze.util.PairTable.class));
      frame.getContentPane().add(combo);
      frame.pack();
      frame.show();
    } catch (Throwable err) {
      err.printStackTrace();
    }
  }
}