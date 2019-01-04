package org.appdapter.bind.rdf.jena.sdb;

import org.slf4j.LoggerFactory;
import com.hp.hpl.jena.util.FileUtils;
import com.hp.hpl.jena.graph.GraphListener;
import org.appdapter.bind.rdf.jena.model.GraphUploadMonitor;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.sdb.SDBFactory;
import com.hp.hpl.jena.graph.Graph;
import com.hp.hpl.jena.sdb.Store;
import arq.cmdline.ModTime;
import org.slf4j.Logger;

public class GraphUploadTask
{
    static Logger theLogger;
    ModTime myModTime;
    boolean myVerboseFlag;
    boolean myQuietFlag;
    
    public GraphUploadTask() {
        this(true, true, false);
    }
    
    public GraphUploadTask(final boolean timingEnabledFlag, final boolean verboseFlag, final boolean quietFlag) {
        (this.myModTime = new ModTime()).setTimingEnabled(timingEnabledFlag);
        this.myVerboseFlag = verboseFlag;
        this.myQuietFlag = quietFlag;
    }
    
    protected ModTime getModTime() {
        return this.myModTime;
    }
    
    protected boolean isVerbose() {
        return this.myVerboseFlag;
    }
    
    protected boolean isQuiet() {
        return this.myQuietFlag;
    }
    
    public Graph getGraph(final Store store, final String graphName) {
        if (graphName == null) {
            return SDBFactory.connectDefaultGraph(store);
        }
        return SDBFactory.connectNamedGraph(store, graphName);
    }
    
    public Model getModel(final Store store, final String graphName) {
        if (graphName == null) {
            return SDBFactory.connectDefaultModel(store);
        }
        return SDBFactory.connectNamedModel(store, graphName);
    }
    
    public void loadOneGraphIntoStoreFromURL(final Store store, final String tgtGraphName, String sourceURL, final boolean replaceTgtFlag) {
        GraphUploadMonitor monitor = null;
        final Model tgtStoreModel = this.getModel(store, tgtGraphName);
        final Graph graph = tgtStoreModel.getGraph();
        if (replaceTgtFlag) {
            if (this.isVerbose()) {
                GraphUploadTask.theLogger.info("Emptying graph: " + tgtGraphName);
            }
            tgtStoreModel.removeAll();
        }
        if (sourceURL.indexOf(58) == -1) {
            sourceURL = "file:" + sourceURL;
        }
        if (this.isVerbose() || this.getModTime().timingEnabled()) {
            GraphUploadTask.theLogger.info("Start loading from: " + sourceURL);
        }
        if (this.getModTime().timingEnabled()) {
            monitor = new GraphUploadMonitor(store.getLoader().getChunkSize(), this.isVerbose());
            graph.getEventManager().register((GraphListener)monitor);
        }
        final String lang = FileUtils.guessLang(sourceURL);
        this.getModTime().startTimer();
        tgtStoreModel.read(sourceURL, lang);
        final long timeMilli = this.getModTime().endTimer();
        final long addedCnt = monitor.getAddCount();
        if (monitor != null) {
            GraphUploadTask.theLogger.info("Added " + addedCnt + " triples");
            if (this.getModTime().timingEnabled() && !this.isQuiet()) {
                final String outputMsg = String.format("Loaded in %.3f seconds [%d triples/s]\n", timeMilli / 1000.0, 1000L * addedCnt / timeMilli);
                GraphUploadTask.theLogger.info(outputMsg);
            }
            graph.getEventManager().unregister((GraphListener)monitor);
        }
    }
    
    static {
        GraphUploadTask.theLogger = LoggerFactory.getLogger((Class)GraphUploadTask.class);
    }
}

/*

	Total time: 38 ms
	
*/