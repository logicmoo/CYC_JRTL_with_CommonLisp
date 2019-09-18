package com.cyc.baseclient.api;

/**
 * Class CycApiException indicates an error condition during a Cyc API call.
 *
 * @version $Id: CycIOException.java 150787 2014-04-26 01:55:03Z nwinant $
 * @author Stephen L. Reed
 */

public class CycIOException extends RuntimeException {


    /**
     * Construct a CycApiException object with no specified message.
     */
    public CycIOException() {
        super();
    }

    /**
     * Construct a CycApiException object with a specified message.
     * @param s a message describing the exception.
     */
    public CycIOException(String s) {
        super(s);
    }
    
    public CycIOException(String s, Throwable cause) {
      super(s, cause);
    }
    
    public CycIOException(Throwable cause) {
      super(cause);
    }
}
