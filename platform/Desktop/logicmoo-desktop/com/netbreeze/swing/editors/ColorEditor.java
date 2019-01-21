

package com.netbreeze.swing.editors;

import java.beans.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.netbreeze.util.*;
import java.util.*;
import javax.swing.event.*;

/**
* JavaBeans PropertyEditor implementation for boolean values.
* Basically a checkbox...
*/
public class ColorEditor extends PropertyEditorSupport  {
  GUI gui = null;
  ComboModel model;


  public ColorEditor() {
    model = new ComboModel();
  }

  @Override
public void setAsText(String text) throws IllegalArgumentException {
    setValue(model.getColor(text));
  }

  @Override
public String getAsText() {
    return model.getColorName(model.getSelectedColor());
  }

  @Override
public void setValue(Object value) {
    if (value instanceof Color) {
      super.setValue(value);
      if (gui != null)
        gui.setSelectedItem(getColorValue());
    }
  }

  public Color getColorValue() {
    try {
      return (Color) getValue();
    } catch (Exception err) {
      return null;
    }
  }

  @Override
public Component getCustomEditor() {
    if (gui == null) {
      gui = new GUI(model);
    }
    return gui;
  }

  @Override
public boolean supportsCustomEditor() {
    return true;
  }

  class GUI extends JComboBox {
    public GUI(ComboModel model) {
      super(model);
    }
  }

  class ComboModel extends AbstractListModel implements ComboBoxModel {
    Color selected = null;
    PairTable table = new PairTable();
    Vector names = new Vector();

    public ComboModel() {
      table.add(Color.black, "Black");
      names.addElement("Black");
      table.add(Color.blue, "Blue");
      names.addElement("Blue");
      table.add(Color.cyan , "Cyan");
      names.addElement("Cyan");
      table.add(Color.darkGray, "Dark Gray");
      names.addElement("Dark Gray");
      table.add(Color.gray, "Gray");
      names.addElement("Gray");
      table.add(Color.green, "Green");
      names.addElement("Green");
      table.add(Color.lightGray, "Light Gray");
      names.addElement("Light Gray");
      table.add(Color.magenta, "Magenta");
      names.addElement("Magenta");
      table.add(Color.orange, "Orange");
      names.addElement("Orange");
      table.add(Color.pink, "Pink");
      names.addElement("Pink");
      table.add(Color.red, "Red");
      names.addElement("Red");
      table.add(Color.white, "White");
      names.addElement("White");
      table.add(Color.yellow, "Yellow");
      names.addElement("Yellow");

    }

    @Override
	public synchronized void setSelectedItem(Object anItem) {
      Color old = selected;
      if (anItem == null) {
        selected = null;
      } else if (anItem instanceof Color) {
        selected = (Color) anItem;
      } else if (anItem instanceof String) {
        selected = (Color) table.findBrother(anItem);
      }

      fireContentsChanged(this, -1, -1);
      if (selected != old) {
        setValue(selected);
      }
    }

    @Override
	public Object getSelectedItem() {
      return table.findBrother(selected);
    }

    public Color getSelectedColor() {
      return (Color) selected;
    }

    public Color getColor(String name) {
      return (Color) table.findBrother(name);
    }

    public String getColorName(Color color) {
      return (String) table.findBrother(color);
    }

    @Override
	public int getSize() {
      return names.size();
    }

    @Override
	public Object getElementAt(int index) {
      try {
        return names.elementAt(index);
      } catch (Exception err) {
        return null;
      }
    }
  }
}

