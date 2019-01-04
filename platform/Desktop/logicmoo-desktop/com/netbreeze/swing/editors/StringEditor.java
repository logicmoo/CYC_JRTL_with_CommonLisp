
package com.netbreeze.swing.editors;
import com.netbreeze.swing.*;
import java.beans.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import com.netbreeze.util.*;

public class StringEditor extends PropertyEditorSupport {
  public void setAsText(String s) {
    setValue(s);
  }

  public String getAsText() {
    return (String) getValue();
  }
}