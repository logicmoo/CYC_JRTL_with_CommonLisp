package com.cyc.baseclient.util;

//// Internal Imports


//// External Imports
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Provides a concise formatter for java logging output.<br>
 * 
 * @version $Id: ConciseLoggingFormatter.java 150787 2014-04-26 01:55:03Z nwinant $
 * @author Stephen L. Reed  
 */
public class ConciseLoggingFormatter extends SimpleFormatter {
  
  //// Constructors
  
  /** Creates a new instance of ConciseLoggingFormatter */
  public ConciseLoggingFormatter() {
  }
  
  //// Public Area
  
  /**
   * Formats the given log record.
   */
  public String format (LogRecord logRecord) {
    StringBuffer stringBuffer = new StringBuffer();
    if (logRecord == null)
      stringBuffer.append("null logRecord received by ConciseLoggingFormatter");
    else if (logRecord.getMessage() == null)
      stringBuffer.append("null logRecord message received by ConciseLoggingFormatter");
    else
      stringBuffer.append(logRecord.getMessage());
    stringBuffer.append('\n');
    return stringBuffer.toString();
  }
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
    
  //// Main
  
}
