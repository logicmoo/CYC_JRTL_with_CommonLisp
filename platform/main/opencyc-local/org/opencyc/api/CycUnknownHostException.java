package org.opencyc.api;

public class CycUnknownHostException extends RuntimeException
{
    public CycUnknownHostException() {
    }
    
    public CycUnknownHostException(final String s) {
        super(s);
    }
    
    public CycUnknownHostException(final String s, final Throwable cause) {
        super(s, cause);
    }
    
    public CycUnknownHostException(final Throwable cause) {
        super(cause);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 7 ms
	
	Decompiled with Procyon 0.5.32.
*/