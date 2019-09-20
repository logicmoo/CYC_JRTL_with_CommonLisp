package org.opencyc.api;

public class CycApiServerSideException extends CycApiException
{
    public CycApiServerSideException() {
    }
    
    public CycApiServerSideException(final String s) {
        super(s);
    }
    
    public CycApiServerSideException(final String s, final Throwable cause) {
        super(s, cause);
    }
    
    public CycApiServerSideException(final Throwable cause) {
        super(cause);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 12 ms
	
	Decompiled with Procyon 0.5.32.
*/