package org.appdapter.bind.rdf.jena.assembly;

import org.slf4j.LoggerFactory;
import org.appdapter.bind.rdf.jena.model.JenaFileManagerUtils;
import java.net.URL;
import com.hp.hpl.jena.util.FileManager;
import java.util.Iterator;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.assembler.AssemblerHelp;
import java.util.HashSet;
import java.util.Set;
import com.hp.hpl.jena.assembler.Mode;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.assembler.Assembler;
import java.util.HashMap;
import org.appdapter.core.component.ComponentCache;
import java.util.Map;
import org.appdapter.core.log.BasicDebugger;
import org.slf4j.Logger;

public class AssemblerUtils
{
    static Logger theLogger;
    static BasicDebugger theDbg;
    private static AssemblerSession theDefaultSession;
    private static Map<AssemblerSession, Map<Class, ComponentCache>> theSessionComponentCacheMap;
    
    public static void clearCacheForAssemblerSubclassForSession(final Class c, final AssemblerSession s) {
        final Map<Class, ComponentCache> map = getComponentCacheMap(s);
        map.put(c, null);
    }
    
    public static void clearAllSubclassCachesForSession(final AssemblerSession s) {
        final Map<Class, ComponentCache> map = getComponentCacheMap(s);
        map.clear();
    }
    
    public static AssemblerSession getDefaultSession() {
        return AssemblerUtils.theDefaultSession;
    }
    
    public static Map<Class, ComponentCache> getComponentCacheMap(final AssemblerSession session) {
        Map<Class, ComponentCache> map = AssemblerUtils.theSessionComponentCacheMap.get(session);
        if (map == null) {
            map = new HashMap<Class, ComponentCache>();
            AssemblerUtils.theSessionComponentCacheMap.put(session, map);
        }
        return map;
    }
    
    public static Set<Object> buildAllRootsInModel(final Assembler jenaAssembler, final Model jenaModel, final Mode jenaAssemblyMode) {
        final Set<Object> results = new HashSet<Object>();
        final Set<Resource> aroots = (Set<Resource>)AssemblerHelp.findAssemblerRoots(jenaModel);
        AssemblerUtils.theLogger.info("Found " + aroots.size() + " assembler-roots in model");
        for (final Resource aroot : aroots) {
            try {
                final Object result = jenaAssembler.open(jenaAssembler, aroot, jenaAssemblyMode);
                results.add(result);
            }
            catch (Throwable t) {
                AssemblerUtils.theLogger.error("Cannot assemble item " + aroot, t);
            }
        }
        return results;
    }
    
    public static Set<Object> buildAllRootsInModel(final Model jenaModel) {
        return buildAllRootsInModel((Assembler)Assembler.general, jenaModel, Mode.DEFAULT);
    }
    
    public static Set<Object> buildAllObjectsInRdfFile(final String rdfURL) {
        final Model loadedModel = FileManager.get().loadModel(rdfURL);
        final Set<Object> results = buildAllRootsInModel(loadedModel);
        return results;
    }
    
    public static Set<Object> buildAllObjectsInRdfFile(final URL rdfURL) {
        final Model loadedModel = FileManager.get().loadModel(rdfURL.toExternalForm());
        final Set<Object> results = buildAllRootsInModel(loadedModel);
        return results;
    }
    
    public static Set<Object> buildObjSetFromPath(final String rdfConfigFlexPath, final ClassLoader optResourceClassLoader) {
        if (optResourceClassLoader != null) {
            AssemblerUtils.theDbg.logDebug("Ensuring registration of classLoader: " + optResourceClassLoader);
            JenaFileManagerUtils.ensureClassLoaderRegisteredWithDefaultJenaFM(optResourceClassLoader);
        }
        AssemblerUtils.theDbg.logInfo("Loading triples from flex-path: " + rdfConfigFlexPath);
        final Set<Object> loadedStuff = buildAllObjectsInRdfFile(rdfConfigFlexPath);
        return loadedStuff;
    }
    
    public static <T> T readOneConfigObjFromPath(final Class<T> configType, final String rdfConfigFlexPath, final ClassLoader optResourceClassLoader) {
        final Set<Object> loadedStuff = buildObjSetFromPath(rdfConfigFlexPath, optResourceClassLoader);
        final int objCount = loadedStuff.size();
        if (objCount != 1) {
            throw new RuntimeException("Expected one config thing but got " + objCount + " from path[" + rdfConfigFlexPath + "]");
        }
        final Object singleConfigObj = loadedStuff.toArray()[0];
        final Class objClass = singleConfigObj.getClass();
        if (configType.isAssignableFrom(objClass)) {
            return (T)singleConfigObj;
        }
        throw new RuntimeException("Expected config object type " + configType + " but got " + objClass);
    }
    
    static {
        AssemblerUtils.theLogger = LoggerFactory.getLogger((Class)AssemblerUtils.class);
        AssemblerUtils.theDbg = new BasicDebugger();
        AssemblerUtils.theDefaultSession = new AssemblerSession();
        AssemblerUtils.theSessionComponentCacheMap = new HashMap<AssemblerSession, Map<Class, ComponentCache>>();
    }
}

/*

	Total time: 44 ms
	
*/