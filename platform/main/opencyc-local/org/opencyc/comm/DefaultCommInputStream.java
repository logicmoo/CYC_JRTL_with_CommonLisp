package org.opencyc.comm;

import java.io.IOException;
import java.io.InputStream;

public class DefaultCommInputStream extends CommInputStream
{
    private InputStream is;
    
    public DefaultCommInputStream(final InputStream is) {
        this.is = is;
    }
    
    public int read() throws IOException {
        return this.is.read();
    }
    
    public int read(final byte[] b) throws IOException {
        return this.is.read(b);
    }
    
    public int read(final byte[] b, final int off, final int len) throws IOException {
        return this.is.read(b, off, len);
    }
    
    public long skip(final long n) throws IOException {
        return this.is.skip(n);
    }
    
    public int available() throws IOException {
        return this.is.available();
    }
    
    public void close() throws IOException {
        this.is.close();
    }
    
    public void mark(final int readlimit) {
        this.is.mark(readlimit);
    }
    
    public void reset() throws IOException {
        this.is.reset();
    }
    
    public boolean markSupported() {
        return this.is.markSupported();
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 13 ms
	
	Decompiled with Procyon 0.5.32.
*/