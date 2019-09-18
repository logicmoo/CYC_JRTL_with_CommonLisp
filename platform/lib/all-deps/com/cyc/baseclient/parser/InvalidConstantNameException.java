package com.cyc.baseclient.parser;

//// Internal Imports

//// External Imports
import java.util.*;

/**
 * <P>Thrown whenever the CycL parser tries to parse a constant
 * by its name, and the Cyc server does not already have a constant
 * by that name defined.
 *
 * @version $Id: InvalidConstantNameException.java 150787 2014-04-26 01:55:03Z nwinant $
 * @author Tony Brusseau
 */
public class InvalidConstantNameException extends Exception {
  
  //// Constructors
  
  /** Creates a new instance of InvalidConstantName. */
  public InvalidConstantNameException(String invalidConstantName) {
    this.invalidConstantNames = new ArrayList();
    this.invalidConstantNames.add(invalidConstantName);
  }
  
  public InvalidConstantNameException() {
  }
  
  //// Public Area
  
  public String getMessage() {
    StringBuffer buf = new StringBuffer("Invalid constant name(s): ");
    if (getInvalidConstantNames() != null) {
      for (Iterator iter = invalidConstantNames.iterator(); iter.hasNext(); ) {
        buf.append("#$").append(iter.next());
        if (iter.hasNext()) {
          buf.append(", ");
        }
      }
    }
    return buf.toString();
  }
  
  public void addInvalidConstantName(String constantName) {
    if (invalidConstantNames == null) {
      invalidConstantNames = new ArrayList();
    }
    invalidConstantNames.add(constantName);
  }
  
  public List getInvalidConstantNames() { 
    return invalidConstantNames;
  }
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  private List invalidConstantNames;
  
  //// Main
  
}
