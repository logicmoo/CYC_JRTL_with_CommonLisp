package org.opencyc.api;

public class CycKBContentException extends RuntimeException
{
    public CycKBContentException() {
    }
    
    public CycKBContentException(final String s) {
        super(s);
    }
    
    public CycKBContentException(final String s, final Throwable cause) {
        super(s, cause);
    }
    
    public CycKBContentException(final Throwable cause) {
        super(cause);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 8 ms
	
	Decompiled with Procyon 0.5.32.
*/