package org.opencyc.api;

import java.util.Map;
import java.net.UnknownHostException;
import java.io.InputStream;
import java.util.UUID;
import org.opencyc.cycobject.CycList;
import org.opencyc.util.TimeOutException;
import org.opencyc.util.Timer;
import java.io.IOException;

public interface CycConnectionInterface
{
    Object[] converse(final Object p0) throws IOException, CycApiException;
    
    Object[] converse(final Object p0, final Timer p1) throws IOException, TimeOutException, CycApiException;
    
    Object[] converseBinary(final CycList p0, final Timer p1) throws IOException, TimeOutException, CycApiException;
    
    void converseBinary(final SubLWorker p0) throws IOException, TimeOutException, CycApiException;
    
    String connectionInfo();
    
    void close();
    
    int getTrace();
    
    int getConnectionType();
    
    boolean connectedToStaticCyc();
    
    void setTrace(final int p0);
    
    void traceOff();
    
    void traceOn();
    
    void traceOnDetailed();
    
    UUID getUuid();
    
    String getHostName();
    
    int getBasePort();
    
    int getHttpPort();
    
    void cancelCommunication(final SubLWorker p0) throws IOException;
    
    void abortCommunication(final SubLWorker p0) throws IOException;
    
    void setupNewCommConnection(final InputStream p0) throws IOException, UnknownHostException, CycApiException;
    
    Map<String, CycLeaseManager> getCycLeaseManagerMap();
    
    void setCycLeaseManagerMap(final Map<String, CycLeaseManager> p0);
    
    Map<InputStream, CycLeaseManager> getCycLeaseManagerCommMap();
    
    void setCycLeaseManagerCommMap(final Map<InputStream, CycLeaseManager> p0);
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 15 ms
	
	Decompiled with Procyon 0.5.32.
*/