package com.cyc.baseclient.export;

/**
 * General class for exceptions thrown during export.
 * @author baxter
 */
public class ExportException extends Exception {

  public ExportException(Throwable cause) {
    super(cause);
  }

  public ExportException(String message, Throwable cause) {
    super(message, cause);
  }

  public ExportException(String message) {
    super(message);
  }

  public ExportException() {
  }
  
}
