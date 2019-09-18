/* $Id: DefaultCancelable.java 150536 2014-04-15 20:54:59Z nwinant $
 *
 * Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 */

package com.cyc.baseclient.util;

//// Internal Imports

//// External Imports

/**
 * The current implementation is a toy implementation that merely makes
 * it possible to write a unit test for CancelManager.
 * <P>DefaultCancelable is designed to...
 *
 * <P>Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * @author zelal
 * @date October 14, 2005, 2:29 PM
 * @version $Id: DefaultCancelable.java 150536 2014-04-15 20:54:59Z nwinant $
 */
public class DefaultCancelable implements Cancelable {
  
  //// Constructors
  
  /** Creates a new instance of DefaultCancelable. */
 public DefaultCancelable(String name) {
   this.taskName = name;
 }
  
  //// Public Area
  
  public void cancelTask() {
    System.out.println("Task " + taskName + " canceled!");
  }
  
  public String toString() {
    return taskName;
  }
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  String taskName;
  
  //// Main
  
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  }
  

  
}
