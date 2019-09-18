package com.cyc.baseclient.parser;

//// Internal Imports
import com.cyc.baseclient.cycobject.CycConstant;

//// External Imports

/**
 * <P>Provides 
 *
 * @version $Id: UnsupportedVocabularyException.java 150787 2014-04-26 01:55:03Z nwinant $
 * @author Tony Brusseau
 */
public class UnsupportedVocabularyException extends Exception {
  
  //// Constructors
  
  /** Creates a new instance of InvalidConstantName. */
  public UnsupportedVocabularyException(CycConstant invalidConstant) {
    this.invalidConstant = invalidConstant;
  }
  
  //// Public Area
  
  public String getMessage() {
    return "The following vocabulary is not supported: '" + invalidConstant.cyclify() + "'.";
  }
  
  public CycConstant getInvalidVocabulary() { return invalidConstant; }
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  private CycConstant invalidConstant;
  
  //// Main
  
}
