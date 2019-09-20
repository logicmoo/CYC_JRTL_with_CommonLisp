package org.opencyc.api;

import java.io.Serializable;

public class CycServer extends Server implements Serializable
{
    private static final long serialVersionUID = 1L;
    public static final int CYC_ASCII_PORT_OFFSET = 1;
    public static final int CYC_HTTP_PORT_OFFSET = 2;
    public static final int CYC_SERVLET_PORT_OFFSET = 3;
    public static final int CYC_CFASL_PORT_OFFSET = 14;
    protected int asciiPortOffset;
    protected int cfaslPortOffset;
    protected int httpPortOffset;
    protected int servletPortOffset;
    
    public CycServer(final String hostName, final int basePort) {
        super(hostName, (basePort < 100) ? (3600 + basePort) : basePort);
        this.asciiPortOffset = 1;
        this.cfaslPortOffset = 14;
        this.httpPortOffset = 2;
        this.servletPortOffset = 3;
    }
    
    protected CycServer() {
        this.asciiPortOffset = 1;
        this.cfaslPortOffset = 14;
        this.httpPortOffset = 2;
        this.servletPortOffset = 3;
    }
    
    public static boolean isValidString(final String string) {
        if (!Server.isValidString(string)) {
            return false;
        }
        final Server server = Server.fromString(string);
        if (server.getPort() == null) {
            return false;
        }
        final String portString = server.getPort().toString();
        return portString.length() == 1 || portString.length() == 2 || portString.length() == 4;
    }
    
    public static CycServer fromString(final String string) {
        final String[] tokens = string.split(":");
        return new CycServer(tokens[0], Integer.valueOf(tokens[1]));
    }
    
    public static Integer guessBasePortFromOffsetPort(final int port) {
        if (port >= 3600 && port <= 3699) {
            final int suffix = port % 100;
            int image = suffix / 10 * 10;
            int offset = suffix % 10;
            if (suffix / 10 % 2 == 1) {
                image -= 10;
                offset += 10;
            }
            if (offset == 0 || isAPortOffset(offset)) {
                return 3600 + image;
            }
        }
        return null;
    }
    
    private static boolean isAPortOffset(final int offset) {
        return offset == 1 || offset == 2 || offset == 3 || offset == 14;
    }
    
    public void setBasePort(final Integer basePort) {
        super.setPort(basePort);
    }
    
    public Integer getBasePort() {
        return super.getPort();
    }
    
    public Integer getAsciiPort() {
        return this.getBasePort() + this.asciiPortOffset;
    }
    
    public Integer getCfaslPort() {
        return this.getBasePort() + this.cfaslPortOffset;
    }
    
    public Integer getHttpPort() {
        return this.getBasePort() + this.httpPortOffset;
    }
    
    public Integer getServletPort() {
        return this.getBasePort() + this.servletPortOffset;
    }
    
    public boolean isDefined() {
        return super.isDefined() && this.getPort() != null;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 27 ms
	
	Decompiled with Procyon 0.5.32.
*/