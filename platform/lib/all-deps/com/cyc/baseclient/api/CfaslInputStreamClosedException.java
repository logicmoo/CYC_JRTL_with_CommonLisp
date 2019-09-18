/* $Id: CfaslInputStreamClosedException.java 150787 2014-04-26 01:55:03Z nwinant $
 *
 * Copyright (c) 2003 - 2006 Cycorp, Inc.  All rights reserved.
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 */

package com.cyc.baseclient.api;

//// Internal Imports

//// External Imports

/**
 * Class CfaslInputStreamClosedException indicates that the peer (usually the Cyc server)
 * closed the socket connection.
 *
 * @version $Id: CfaslInputStreamClosedException.java 150787 2014-04-26 01:55:03Z nwinant $
 * @author Stephen L. Reed
 */
public class CfaslInputStreamClosedException extends RuntimeException {
  
  //// Constructors
  
  /** Creates a new instance of CfaslInputStreamClosedException. */
  public CfaslInputStreamClosedException() {
  }
  
  //// Public Area
  
    /**
     * Construct a CfaslInputStreamClosedException object with a specified message.
     * @param s a message describing the exception.
     */
    public CfaslInputStreamClosedException(String s) {
        super(s);
    }
    
    public CfaslInputStreamClosedException(String s, Throwable cause) {
      super(s, cause);
    }
    
    public CfaslInputStreamClosedException(Throwable cause) {
      super(cause);
    }
    
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  //// Main
  
}
