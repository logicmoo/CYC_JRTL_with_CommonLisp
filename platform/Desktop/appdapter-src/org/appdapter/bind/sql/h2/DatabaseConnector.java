package org.appdapter.bind.sql.h2;

import org.slf4j.LoggerFactory;
import java.sql.DriverManager;
import com.hp.hpl.jena.sdb.SDB;
import org.h2.tools.Server;
import java.sql.Connection;
import org.slf4j.Logger;

public class DatabaseConnector
{
    static Logger theLogger;
    private Connection myConn;
    private Server myTcpServer;
    private Server myWebServer;
    
    public void init(final Config conf) throws Throwable {
        SDB.init();
        this.myTcpServer = this.makeTcpServer(conf.tcpPort);
        this.myWebServer = this.makeWebServer(conf.webPort);
        this.myConn = this.makeConnection(conf.dbFilePath, conf.dbUser, conf.dbPassword);
        this.myTcpServer.start();
        this.myWebServer.start();
    }
    
    protected void stop() throws Throwable {
        this.myTcpServer.stop();
        this.myConn.close();
    }
    
    protected Connection makeConnection(final String dbFilePath, final String dbUser, final String dbPassword) throws Throwable {
        Class.forName("org.h2.Driver").newInstance();
        final Connection conn = DriverManager.getConnection("jdbc:h2:file:" + dbFilePath, dbUser, dbPassword);
        return conn;
    }
    
    protected Server makeTcpServer(final String tcpPort) throws Throwable {
        final Server tcpServer = Server.createTcpServer(new String[] { "-tcpAllowOthers", "true", "-tcpPort", tcpPort });
        return tcpServer;
    }
    
    protected Server makeWebServer(final String webPort) throws Throwable {
        final Server tcpServer = Server.createTcpServer(new String[] { "-webAllowOthers", "false", "-webPort", webPort });
        return tcpServer;
    }
    
    static {
        DatabaseConnector.theLogger = LoggerFactory.getLogger((Class)DatabaseConnector.class);
    }
    
    public static class Config
    {
        public String dbFilePath;
        public String dbUser;
        public String dbPassword;
        public String tcpPort;
        public String webPort;
        public boolean forQuads;
        
        public Config() {
            this.forQuads = true;
        }
    }
}

/*

	Total time: 23 ms
	
*/