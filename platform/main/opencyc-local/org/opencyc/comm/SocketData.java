package org.opencyc.comm;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class SocketData
{
    private String hostName;
    private int port;
    private Socket socket;
    private InputStream cis;
    private CommOutputStream cos;
    private Socket initSocket;
    private InputStream initCis;
    private CommOutputStream initCos;
    
    public SocketData(final String hostName, final int portNum) throws IOException {
        this.hostName = hostName;
        this.port = portNum + 14;
        this.socket = new Socket(this.hostName, this.port);
        final int val = this.socket.getReceiveBufferSize();
        this.socket.setReceiveBufferSize(val * 2);
        this.socket.setTcpNoDelay(true);
        this.socket.setKeepAlive(true);
        this.cis = this.socket.getInputStream();
        this.cos = (CommOutputStream)new DefaultCommOutputStream(this.socket.getOutputStream());
        this.initSocket = new Socket(this.hostName, this.port);
        final int val2 = this.initSocket.getReceiveBufferSize();
        this.initSocket.setReceiveBufferSize(val2 * 2);
        this.initSocket.setTcpNoDelay(true);
        this.initSocket.setKeepAlive(true);
        this.initCis = this.initSocket.getInputStream();
        this.initCos = (CommOutputStream)new DefaultCommOutputStream(this.initSocket.getOutputStream());
    }
    
    public String getHostName() {
        return this.hostName;
    }
    
    public int getPort() {
        return this.port;
    }
    
    public InputStream getCis() {
        return this.cis;
    }
    
    public CommOutputStream getCos() {
        return this.cos;
    }
    
    public Socket getSocket() {
        return this.socket;
    }
    
    public Socket getInitSocket() {
        return this.initSocket;
    }
    
    public InputStream getInitCis() {
        return this.initCis;
    }
    
    public CommOutputStream getInitCos() {
        return this.initCos;
    }
    
    @Override
    public String toString() {
        return "Socket with Host: " + this.hostName + " Port: " + this.port;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 17 ms
	
	Decompiled with Procyon 0.5.32.
*/