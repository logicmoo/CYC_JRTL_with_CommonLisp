

package com.netbreeze.swing;
import java.awt.Color;
import java.beans.Introspector;
import java.beans.PropertyEditorManager;
import java.util.Date;

import org.logicmoo.bb.BeansContext;

import com.netbreeze.swing.editors.BooleanEditor;
import com.netbreeze.swing.editors.ColorEditor;
import com.netbreeze.swing.editors.DateEditor;
import com.netbreeze.swing.editors.IntEditor;

public class BeanUtils {
  private static BeansContext context = null;

  private BeanUtils() {
  }

  public static void setDefaultContext(BeansContext c) {
    context = c;
  }

  public static BeansContext getDefaultContext() {
    return context;
  }

  public static void registerEditors() {
    PropertyEditorManager.registerEditor(int.class, IntEditor.class);
    PropertyEditorManager.registerEditor(Integer.class, IntEditor.class);

    PropertyEditorManager.registerEditor(boolean.class, BooleanEditor.class);
    PropertyEditorManager.registerEditor(Boolean.class, BooleanEditor.class);

    PropertyEditorManager.registerEditor(Color.class, ColorEditor.class);

    PropertyEditorManager.registerEditor(Date.class, DateEditor.class);

    PropertyEditorManager.setEditorSearchPath(new String[] {"com.netbreeze.swing.editors"});
  }

  public static void setBeanInfoSearchPath() {
    Introspector.setBeanInfoSearchPath(new String[] {"com.netbreeze.swing.editors"});
  }
}