package org.opencyc.api;

public class CycApiException extends RuntimeException
{
    public CycApiException() {
    }
    
    public CycApiException(final String s) {
        super(s);
    }
    
    public CycApiException(final String s, final Throwable cause) {
        super(s, cause);
    }
    
    public CycApiException(final Throwable cause) {
        super(cause);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 8 ms
	
	Decompiled with Procyon 0.5.32.
*/