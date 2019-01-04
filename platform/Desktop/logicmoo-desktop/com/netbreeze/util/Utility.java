

package com.netbreeze.util;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URL;

import javax.swing.JComponent;

import org.armedbear.lisp.Lisp;

import java.io.*;
import com.netbreeze.util.*;
import java.net.*;

public class Utility {
  private Utility() {
  }

  public static String loadFile(File file) throws IOException {
    FileInputStream fileIn = new FileInputStream(file);
    ByteArrayOutputStream stringOut = new ByteArrayOutputStream();
    copyStream(fileIn, stringOut);
    fileIn.close();
    return new String(stringOut.toByteArray());
  }

  public static String loadURL(URL url) throws Exception {
    InputStream in = url.openStream();
    ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();

    com.netbreeze.util.Utility.copyStream(in, bytesOut);
    in.close();
    bytesOut.close();
    return new String(bytesOut.toByteArray());
  }

  public static void saveFile(File file, String contents) throws IOException {
    FileOutputStream fileOut = new FileOutputStream(file);
    PrintWriter writer = new PrintWriter(fileOut);
    writer.print(contents);
    writer.close();
  }

  public static void copyStream(InputStream from, OutputStream to) throws IOException {
    int i = from.read();
    while(i > -1) {
      to.write(i);
      i = from.read();
    }
  }

  public static boolean isEqual(Object o1, Object o2) {
    if (o1 == null)
      return (o2 == null);
    else
      return (o1.equals(o2));
  }

  /**
    Checks if the given object is null, or if toString().trim() == "".
  */
  public static boolean isEmpty(Object o) {
    if (o == null) {
      return true;
    } else {
      return o.toString().trim().equals("");
    }
  }


  /**
  * Moves the given window to the center of the screen
  */
  public static void centerWindow(Container win) {

		Container cont2;
		if (win instanceof JComponent) {
			cont2 = ((JComponent) win).getTopLevelAncestor();
		} else {
			cont2 = win.getParent();
		}
		if (cont2 != null && cont2 != win) {
			centerWindow(cont2);
			return;
		}
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension dim = win.getSize();
		win.setLocation((screen.width / 2) - (dim.width / 2),
				(screen.height / 2)/* - (dim.height / 2) */);
	  }

  public static void centerWindow(Window win) {
  	Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension dim = win.getSize();
    win.setLocation((screen.width / 2) - (dim.width / 2), (screen.height / 2) - (dim.height / 2));
  }

  public static Dimension getConstrainedDimension(Dimension min, Dimension pref, Dimension max) {
    Dimension result =  getMinDimension(max, getMaxDimension(min, pref));
    return result;
  }

  public static Dimension getMaxDimension(Dimension a, Dimension b) {
    return new Dimension(Math.max(a.width, b.width), Math.max(a.height, b.height));
  }

  public static Dimension getMinDimension(Dimension a, Dimension b) {
    return new Dimension(Math.min(a.width, b.width), Math.min(a.height, b.height));
  }

  public static String getShortClassName(Class c) {
	  if(true) {
		  return Lisp.getDotName(c);
	  }
    String name = c.getName();
    int i = name.lastIndexOf(".");
    if (i == -1)
      return name;
    else
      return name.substring(i + 1);
  }

  /**
    Replace all occurences of 'a' in string 's' with 'b'
  */
  public static String replace(String s, String a, String b) {

    int aLength = a.length();
    int bLength = b.length();
    StringBuffer buf = new StringBuffer(s);

    //how much length changes after each replacement
    int dif = b.length() - a.length();

    int len = s.length();
    int i = buf.toString().indexOf(a);
    int startFrom = 0;
    while (i != -1) {
      buf.replace(i, i + aLength, b);
      startFrom = i + bLength;
      i = buf.toString().indexOf(a, startFrom);
    }

    return buf.toString();
  }

  public static  byte[] serialize(Object o) throws Exception {
    ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
    ObjectOutputStream objectOut = new ObjectOutputStream(bytesOut);
    objectOut.writeObject(o);
    objectOut.close();
    return bytesOut.toByteArray();
  }

  public static Object deserialize(byte[] bytes) throws Exception {
    ByteArrayInputStream bytesIn = new ByteArrayInputStream(bytes);
    ObjectInputStream objectIn = new ObjectInputStream(bytesIn);
    Object o = objectIn.readObject();
    objectIn.close();
    return o;
  }

}

