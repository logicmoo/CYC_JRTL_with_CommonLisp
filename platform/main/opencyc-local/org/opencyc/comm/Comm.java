package org.opencyc.comm;

import org.opencyc.api.CycConnectionInterface;
import java.io.IOException;
import java.io.InputStream;

public interface Comm
{
    InputStream sendRequest(final byte[] p0, final String p1, final RequestType p2) throws CommException, IOException;
    
    String makeRequestSummary(final String p0);
    
    void close() throws IOException;
    
    CycConnectionInterface getCycConnection();
    
    void setCycConnection(final CycConnectionInterface p0);
    
    public enum RequestType
    {
        NORMAL, 
        INIT;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 28 ms
	
	Decompiled with Procyon 0.5.32.
*/