package com.cyc.baseclient.api;

/**
 * Class CycApiException indicates an error condition during a Cyc API call.
 *
 * @version $Id: CycUnknownHostException.java 150787 2014-04-26 01:55:03Z nwinant $
 * @author Stephen L. Reed
 */

public class CycUnknownHostException extends RuntimeException {


    /**
     * Construct a CycApiException object with no specified message.
     */
    public CycUnknownHostException() {
        super();
    }

    /**
     * Construct a CycApiException object with a specified message.
     * @param s a message describing the exception.
     */
    public CycUnknownHostException(String s) {
        super(s);
    }
    
    public CycUnknownHostException(String s, Throwable cause) {
      super(s, cause);
    }
    
    public CycUnknownHostException(Throwable cause) {
      super(cause);
    }
}
