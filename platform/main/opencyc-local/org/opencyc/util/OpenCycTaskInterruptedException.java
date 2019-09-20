package org.opencyc.util;

public class OpenCycTaskInterruptedException extends RuntimeException
{
    public OpenCycTaskInterruptedException(final InterruptedException ie) {
        super(ie);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 6 ms
	
	Decompiled with Procyon 0.5.32.
*/