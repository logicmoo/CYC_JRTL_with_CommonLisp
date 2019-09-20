package org.opencyc.comm;

import java.io.IOException;
import java.io.OutputStream;

public class DefaultCommOutputStream implements CommOutputStream
{
    private OutputStream os;
    
    public DefaultCommOutputStream(final OutputStream os) {
        this.os = os;
    }
    
    public void write(final int b) throws IOException {
        this.os.write(b);
    }
    
    public void write(final byte[] b) throws IOException {
        this.os.write(b);
    }
    
    public void write(final byte[] b, final int off, final int len) throws IOException {
        this.os.write(b, off, len);
    }
    
    public void flush() throws IOException {
        this.os.flush();
    }
    
    public void close() throws IOException {
        this.os.close();
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 8 ms
	
	Decompiled with Procyon 0.5.32.
*/