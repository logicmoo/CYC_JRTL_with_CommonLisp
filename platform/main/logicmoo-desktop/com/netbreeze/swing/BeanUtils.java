

package com.netbreeze.swing;
import com.netbreeze.swing.editors.*;
import java.beans.*;
import java.awt.*;
import java.util.*;

import org.logicmoo.bb.BeansContext;

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