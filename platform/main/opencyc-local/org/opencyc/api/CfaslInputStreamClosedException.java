package org.opencyc.api;

public class CfaslInputStreamClosedException extends RuntimeException
{
    public CfaslInputStreamClosedException() {
    }
    
    public CfaslInputStreamClosedException(final String s) {
        super(s);
    }
    
    public CfaslInputStreamClosedException(final String s, final Throwable cause) {
        super(s, cause);
    }
    
    public CfaslInputStreamClosedException(final Throwable cause) {
        super(cause);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 12 ms
	
	Decompiled with Procyon 0.5.32.
*/