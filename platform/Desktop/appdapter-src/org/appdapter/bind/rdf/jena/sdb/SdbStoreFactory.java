package org.appdapter.bind.rdf.jena.sdb;

import com.hp.hpl.jena.util.FileManager;
import com.hp.hpl.jena.sdb.SDBFactory;
import org.appdapter.bind.rdf.jena.model.JenaFileManagerUtils;
import com.hp.hpl.jena.sdb.shared.Env;
import com.hp.hpl.jena.sdb.Store;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class SdbStoreFactory
{
    public static Logger getLogger() {
        return LoggerFactory.getLogger((Class)SdbStoreFactory.class);
    }
    
    public static Store connectSdbStoreFromResPath(final String storeConfigPath, final ClassLoader optLoaderToAdd) {
        getLogger().info("Connecting store using storeConfigPath[{}] and optionalCL[{}]", (Object)storeConfigPath, (Object)optLoaderToAdd);
        if (optLoaderToAdd != null) {
            final FileManager sdbEnvFM = Env.fileManager();
            JenaFileManagerUtils.ensureClassLoaderRegisteredWithJenaFM(sdbEnvFM, optLoaderToAdd);
        }
        final Store store = SDBFactory.connectStore(storeConfigPath);
        return store;
    }
}

/*

	Total time: 19 ms
	
*/