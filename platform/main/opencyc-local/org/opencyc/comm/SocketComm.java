package org.opencyc.comm;

import org.opencyc.api.CycConnectionInterface;
import org.opencyc.api.CycAccess;
import java.util.logging.Logger;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class SocketComm extends AbstractComm implements Comm
{
    private final String hostName;
    private final int port;
    private Socket socket;
    private InputStream inputStream;
    private CommOutputStream outputStream;
    private boolean isInitialized;
    
    public SocketComm(final String hostName, final int portNum) throws IOException {
        this.isInitialized = false;
        this.hostName = hostName;
        this.port = portNum + 14;
    }
    
    public InputStream sendRequest(final byte[] request, final String requestSummary, final Comm.RequestType requestType) throws CommException, IOException {
        Logger.getLogger(Socket.class.getCanonicalName()).fine(requestSummary);
        switch (requestType) {
            case INIT: {
                this.socket = new Socket(this.hostName, this.port);
                final int val1 = this.socket.getReceiveBufferSize();
                this.socket.setReceiveBufferSize(val1 * 2);
                this.socket.setTcpNoDelay(true);
                this.socket.setKeepAlive(true);
                this.outputStream = (CommOutputStream)new DefaultCommOutputStream(this.socket.getOutputStream());
                final Socket initSocket = new Socket(this.hostName, this.port);
                final int val2 = initSocket.getReceiveBufferSize();
                initSocket.setReceiveBufferSize(val2 * 2);
                initSocket.setTcpNoDelay(true);
                initSocket.setKeepAlive(true);
                final InputStream inputStream = initSocket.getInputStream();
                this.inputStream = inputStream;
                final InputStream initInputStream = inputStream;
                final CommOutputStream initOutputStream = (CommOutputStream)new DefaultCommOutputStream(initSocket.getOutputStream());
                synchronized (initOutputStream) {
                    initOutputStream.write(request);
                    initOutputStream.flush();
                }
                return initInputStream;
            }
            case NORMAL: {
                this.possiblyInitializeCommWIthServer();
                final CommOutputStream oStream = this.outputStream;
                synchronized (oStream) {
                    oStream.write(request);
                    oStream.flush();
                }
                return this.inputStream;
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
        this.isInitialized = true;
        final byte[] initializationRequest = CycAccess.getCycInitializationRequest(this.getCycConnection().getUuid());
        final InputStream is = this.sendRequest(initializationRequest, this.makeRequestSummary("initialization request"), Comm.RequestType.INIT);
        CycAccess.handleCycInitializationRequestResponse(is);
        this.getCycConnection().setupNewCommConnection(is);
    }
    
    public String makeRequestSummary(final String request) {
        return request;
    }
    
    public synchronized void close() throws IOException {
        if (this.socket == null) {
            return;
        }
        if (!this.socket.isClosed()) {
            this.socket.close();
        }
    }
    
    public void setCycConnection(final CycConnectionInterface conn) {
        this.isInitialized = false;
        super.setCycConnection(conn);
    }
    
    public String toString() {
        return "SocketComm with Host: " + this.hostName + " Port: " + this.port;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 72 ms
	
	Decompiled with Procyon 0.5.32.
*/