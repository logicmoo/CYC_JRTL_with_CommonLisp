package org.opencyc.comm;

import org.opencyc.api.CycConnectionInterface;
import java.util.Iterator;
import org.opencyc.api.CycAccess;
import java.io.InputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SocketCommRoundRobin extends AbstractComm implements Comm
{
    private List<SocketData> socketList;
    private int socketIdx;
    private int targetRoundRobinSize;
    private boolean isInitialized;
    
    public SocketCommRoundRobin() {
        this.targetRoundRobinSize = 2;
        this.isInitialized = false;
        this.socketList = new ArrayList<SocketData>();
        this.socketIdx = 0;
    }
    
    public CommOutputStream createOutputStream() throws CommException, IOException {
        return null;
    }
    
    public synchronized InputStream sendRequest(final byte[] request, final String requestSummary, final Comm.RequestType requestType) throws CommException, IOException {
        switch (requestType) {
            case INIT: {
                final String host = "localhost";
                final int port = 3600 + 20 * this.socketList.size();
                final SocketData socketData = new SocketData(host, port);
                this.socketList.add(socketData);
                final CommOutputStream initOutputStream = socketData.getInitCos();
                synchronized (initOutputStream) {
                    initOutputStream.write(request);
                    initOutputStream.flush();
                }
                return socketData.getInitCis();
            }
            case NORMAL: {
                this.possiblyInitializeCommWIthServer();
                final SocketData sd = this.socketList.get(this.socketIdx);
                synchronized (sd.getCos()) {
                    sd.getCos().write(request);
                    sd.getCos().flush();
                }
                this.socketIdx = (this.socketIdx + 1) % this.socketList.size();
                return sd.getInitCis();
            }
            default: {
                throw new IllegalArgumentException("Don't know about RequestType: " + requestType);
            }
        }
    }
    
    public synchronized void possiblyInitializeCommWIthServer() throws CommException, IOException {
        if (this.isInitialized) {
            return;
        }
        if (this.socketList.size() >= this.targetRoundRobinSize - 1) {
            this.isInitialized = true;
        }
        final byte[] initializationRequest = CycAccess.getCycInitializationRequest(this.getCycConnection().getUuid());
        final InputStream is = this.sendRequest(initializationRequest, this.makeRequestSummary("initialization request"), Comm.RequestType.INIT);
        CycAccess.handleCycInitializationRequestResponse(is);
        this.getCycConnection().setupNewCommConnection(is);
    }
    
    public String makeRequestSummary(final String request) {
        return request;
    }
    
    public synchronized void close() throws IOException {
        for (final SocketData sd : this.socketList) {
            if (sd.getSocket() == null) {
                return;
            }
            if (!sd.getSocket().isClosed()) {
                sd.getSocket().close();
            }
            if (sd.getInitSocket() == null) {
                return;
            }
            if (sd.getInitSocket().isClosed()) {
                continue;
            }
            sd.getInitSocket().close();
        }
        this.socketList.clear();
    }
    
    public void setCycConnection(final CycConnectionInterface conn) {
        this.isInitialized = false;
        super.setCycConnection(conn);
    }
    
    public String toString() {
        return "SocketCommRoundRobin - Socket List: " + this.socketList.toString();
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 62 ms
	
	Decompiled with Procyon 0.5.32.
*/