package org.opencyc.util;

public class TimeOutException extends RuntimeException
{
    public TimeOutException() {
    }
    
    public TimeOutException(final String message) {
        super(message);
    }
    
    public TimeOutException(final String message, final Throwable t) {
        super(message, t);
    }
    
    public TimeOutException(final Throwable t) {
        super(t);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 9 ms
	
	Decompiled with Procyon 0.5.32.
*/