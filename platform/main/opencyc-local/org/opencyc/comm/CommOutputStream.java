package org.opencyc.comm;

import java.io.IOException;
import java.io.Flushable;
import java.io.Closeable;

public interface CommOutputStream extends Closeable, Flushable
{
    void write(final int p0) throws IOException;
    
    void write(final byte[] p0) throws IOException;
    
    void write(final byte[] p0, final int p1, final int p2) throws IOException;
    
    void flush() throws IOException;
    
    void close() throws IOException;
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 4 ms
	
	Decompiled with Procyon 0.5.32.
*/