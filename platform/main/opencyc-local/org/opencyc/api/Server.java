package org.opencyc.api;

import java.io.Serializable;

public class Server implements Serializable, Comparable<Server>
{
    private static final long serialVersionUID = 1L;
    public static final String VALID_IP_ADDR_REGEX = "^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
    public static final String VALID_HOST_NAME_REGEX = "^(([a-zA-Z]|[a-zA-Z][a-zA-Z0-9\\-]*[a-zA-Z0-9])\\.)*([A-Za-z]|[A-Za-z][A-Za-z0-9\\-]*[A-Za-z0-9])$";
    private String hostName;
    private Integer port;
    
    public Server(final String hostName, final Integer port) {
        this.hostName = null;
        this.port = null;
        this.setHostName(hostName);
        this.setPort(port);
    }
    
    protected Server() {
        this.hostName = null;
        this.port = null;
    }
    
    public static boolean isValidString(final String string) {
        if (string != null && !string.isEmpty()) {
            final String[] tokens = string.split(":");
            if (tokens.length >= 1 && tokens.length <= 2 && (tokens[0].matches("^(([a-zA-Z]|[a-zA-Z][a-zA-Z0-9\\-]*[a-zA-Z0-9])\\.)*([A-Za-z]|[A-Za-z][A-Za-z0-9\\-]*[A-Za-z0-9])$") || tokens[0].matches("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$"))) {
                if (tokens.length == 1) {
                    return string.length() == tokens[0].length();
                }
                if (!tokens[1].isEmpty()) {
                    try {
                        Integer.parseInt(tokens[1]);
                        return tokens[1].length() <= 5;
                    }
                    catch (Exception ex) {}
                }
            }
        }
        return false;
    }
    
    public static Server fromString(final String string) {
        final String[] tokens = string.split(":");
        if (tokens.length == 1) {
            return new Server(tokens[0], null);
        }
        return new Server(tokens[0], Integer.valueOf(tokens[1]));
    }
    
    public void setHostName(final String hostName) {
        this.hostName = hostName;
    }
    
    public String getHostName() {
        return this.hostName;
    }
    
    public void setPort(final Integer port) {
        this.port = port;
    }
    
    public Integer getPort() {
        return this.port;
    }
    
    public boolean isDefined() {
        return this.getHostName() != null;
    }
    
    @Override
    public String toString() {
        if (!this.isDefined()) {
            return "Server unspecified";
        }
        return this.getHostName() + ((this.getPort() != null) ? (":" + this.getPort()) : "");
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + ((null == this.getHostName()) ? 0 : this.getHostName().hashCode());
        hash = 31 * hash + this.getPort();
        return hash;
    }
    
    @Override
    public boolean equals(final Object obj) {
        return this == obj || (obj != null && obj.getClass() == this.getClass() && this.hashCode() == ((Server)obj).hashCode());
    }
    
    @Override
    public int compareTo(final Server o) {
        if (o == null) {
            return 1;
        }
        if (o != null) {
            if (this.getHostName().compareTo(o.getHostName()) != 0) {
                return this.getHostName().compareTo(o.getHostName());
            }
            if (this.getHostName().compareTo(o.getHostName()) != 0) {
                return this.getHostName().compareTo(o.getHostName());
            }
        }
        return new Integer(this.getPort()).compareTo(o.getPort());
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 141 ms
	
	Decompiled with Procyon 0.5.32.
*/