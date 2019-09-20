package org.opencyc.export;

public class ExportException extends Exception
{
    public ExportException(final Throwable cause) {
        super(cause);
    }
    
    public ExportException(final String message, final Throwable cause) {
        super(message, cause);
    }
    
    public ExportException(final String message) {
        super(message);
    }
    
    public ExportException() {
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 8 ms
	
	Decompiled with Procyon 0.5.32.
*/