package org.opencyc.comm;

public class CommException extends Exception
{
    public CommException(final Exception e) {
        super(e);
    }
    
    public CommException(final String msg) {
        super(msg);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 7 ms
	
	Decompiled with Procyon 0.5.32.
*/