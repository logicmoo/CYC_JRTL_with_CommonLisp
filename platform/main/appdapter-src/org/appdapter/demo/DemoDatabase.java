package org.appdapter.demo;

import org.slf4j.LoggerFactory;
import java.io.File;
import org.appdapter.bind.sql.h2.DatabaseConnector;
import org.slf4j.Logger;

public class DemoDatabase
{
    static Logger theLogger;
    
    public static DatabaseConnector initConnector() {
        DatabaseConnector dbc = null;
        final DatabaseConnector.Config dbcc = new DatabaseConnector.Config();
        dbcc.dbFilePath = "demodata/h2/db01";
        dbcc.dbUser = "sa";
        dbcc.dbPassword = "";
        dbcc.tcpPort = "9330";
        dbcc.webPort = "9331";
        dbc = new DatabaseConnector();
        try {
            new File(dbcc.dbFilePath).deleteOnExit();
            dbc.init(dbcc);
            DemoDatabase.theLogger.info(DemoDatabase.class.getCanonicalName() + ".initConnector() appears to have succeeded, try a web connection using H2 console to: " + dbcc);
        }
        catch (Throwable t) {
            DemoDatabase.theLogger.error("Problem in " + DemoDatabase.class.getCanonicalName() + ".initConnector()", t);
            dbc = null;
        }
        return dbc;
    }
    
    static {
        DemoDatabase.theLogger = LoggerFactory.getLogger((Class)DemoDatabase.class);
    }
}

/*

	Total time: 29 ms
	
*/