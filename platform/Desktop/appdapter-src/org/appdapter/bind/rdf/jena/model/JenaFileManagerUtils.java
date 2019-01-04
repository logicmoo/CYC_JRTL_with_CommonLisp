package org.appdapter.bind.rdf.jena.model;

import org.slf4j.LoggerFactory;
import com.hp.hpl.jena.sdb.shared.Env;
import java.util.List;
import java.util.Iterator;
import com.hp.hpl.jena.util.Locator;
import com.hp.hpl.jena.util.LocatorClassLoader;
import com.hp.hpl.jena.util.FileManager;
import org.slf4j.Logger;

public class JenaFileManagerUtils
{
    static Logger theLogger;
    
    public static void ensureClassLoaderRegisteredWithJenaFM(final FileManager fm, final ClassLoader cl) {
        final LocatorClassLoader candidateLCL = new LocatorClassLoader(cl);
        try {
            final Iterator<Locator> locs = (Iterator<Locator>)fm.locators();
            while (locs.hasNext()) {
                final Locator l = locs.next();
                if (candidateLCL.equals((Object)l)) {
                    JenaFileManagerUtils.theLogger.info("Found existing equivalent Jena FM loader for: " + cl);
                    return;
                }
            }
        }
        catch (UnsupportedOperationException uoe) {
            uoe.printStackTrace();
        }
        JenaFileManagerUtils.theLogger.info("Registering new Jena FM loader for: " + cl);
        fm.addLocator((Locator)candidateLCL);
    }
    
    public static void ensureClassLoadersRegisteredWithJenaFM(final FileManager fm, final List<ClassLoader> clList) {
        for (final ClassLoader cl : clList) {
            ensureClassLoaderRegisteredWithJenaFM(fm, cl);
        }
    }
    
    public static FileManager getDefaultJenaFM() {
        final FileManager fManagerE = Env.fileManager();
        final FileManager fManager = FileManager.get();
        if (fManager != fManagerE) {
            JenaFileManagerUtils.theLogger.error("Mismatched Jena FMs: " + fManagerE + "!=" + fManager);
        }
        return fManagerE;
    }
    
    public static void ensureClassLoaderRegisteredWithDefaultJenaFM(final ClassLoader cl) {
        final FileManager fm = getDefaultJenaFM();
        ensureClassLoaderRegisteredWithJenaFM(fm, cl);
    }
    
    public static void ensureClassLoadersRegisteredWithDefaultJenaFM(final List<ClassLoader> clList) {
        final FileManager fm = getDefaultJenaFM();
        ensureClassLoadersRegisteredWithJenaFM(fm, clList);
    }
    
    static {
        JenaFileManagerUtils.theLogger = LoggerFactory.getLogger((Class)JenaFileManagerUtils.class);
    }
}

/*

	Total time: 35 ms
	
*/