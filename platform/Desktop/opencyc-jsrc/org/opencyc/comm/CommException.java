/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opencyc.comm;

/**
 *
 * @author vijay
 */
public class CommException extends Exception {

  public CommException(Exception e) {
    super(e);
  }
  
  
  public CommException (String msg) {
    super(msg);
  }
  
  //TODO: Add constructors that Exception has
  
  
}
