package org.appdapter.bind.rdf.jena.sdb;

import org.slf4j.LoggerFactory;
import java.sql.Connection;
import org.slf4j.Logger;

public class MetaRepo
{
    static Logger theLogger;
    private String myH2_JDBC_URL;
    private String mySDB_ConfigPath;
    private Connection myDBC;
    
    static {
        MetaRepo.theLogger = LoggerFactory.getLogger((Class)MetaRepo.class);
    }
}

/*

	Total time: 17 ms
	
*/