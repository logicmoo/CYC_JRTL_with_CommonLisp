package com.cyc.baseclient.parser;

//// Internal Imports
import com.cyc.baseclient.cycobject.CycGuid;

//// External Imports
import java.util.*;

/**
 * <P>Thrown whenever the CycL parser tries to parse a constant
 by its CycGuid, and the Cyc server does not already have a constant
 by that CycGuid defined.
 *
 * @version $Id: InvalidConstantGuidException.java 150787 2014-04-26 01:55:03Z nwinant $
 * @author Tony Brusseau
 */
public class InvalidConstantGuidException extends Exception {
  
  //// Constructors
  
  /** Creates a new instance of InvalidConstantName. */
  public InvalidConstantGuidException(CycGuid invalidConstantGuid) {
    this.invalidConstantGuids = new ArrayList();
    this.invalidConstantGuids.add(invalidConstantGuid);
  }
  
  public InvalidConstantGuidException() {
  }
  
  //// Public Area
  
  public String getMessage() {
    StringBuffer buf = new StringBuffer("Invalid constant GUID(s): ");
    if (getInvalidConstantNames() != null) {
      for (Iterator iter = getInvalidConstantNames().iterator(); iter.hasNext(); ) {
        buf.append("#G").append(iter.next());
        if (iter.hasNext()) {
          buf.append(", ");
        }
      }
    }
    return buf.toString();
  }
  
  public void addInvalidConstantGuid(CycGuid invalidConstantGuid) {
    if (invalidConstantGuids == null) {
      invalidConstantGuids = new ArrayList();
    }
    invalidConstantGuids.add(invalidConstantGuid);
  }
  
  public List getInvalidConstantNames() { 
    return invalidConstantGuids;
  }
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  private List invalidConstantGuids;
  
  //// Main
  
}
