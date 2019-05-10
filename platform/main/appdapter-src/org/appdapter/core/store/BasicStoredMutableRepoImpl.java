package org.appdapter.core.store;

import java.util.Iterator;
import org.appdapter.core.jvm.GetObject;
import com.hp.hpl.jena.graph.Node;
import java.util.ArrayList;
import java.util.List;
import org.appdapter.bind.rdf.jena.sdb.SdbStoreFactory;
import com.hp.hpl.jena.sdb.SDBFactory;
import com.hp.hpl.jena.rdf.model.Model;
import org.appdapter.core.name.Ident;
import com.hp.hpl.jena.sdb.store.DatasetStore;
import com.hp.hpl.jena.query.Dataset;
import org.appdapter.bind.rdf.jena.sdb.GraphUploadTask;
import com.hp.hpl.jena.sdb.util.StoreUtils;
import com.hp.hpl.jena.sdb.Store;

public class BasicStoredMutableRepoImpl extends BasicRepoImpl implements Repo.Stored, Repo.Mutable
{
    private Store myStore;
    
    @Override
	public void callLoadingInLock() {
        this.formatRepoIfNeeded();
    }
    
    protected BasicStoredMutableRepoImpl(final Store aStore) {
        this.myStore = aStore;
    }
    
    @Override
	public Store getStore() {
        return this.myStore;
    }
    
    @Override
	public String getUploadHomePath() {
        return ".";
    }
    
    protected void setStore(final Store store) {
        this.myStore = store;
    }
    
    @Override
	public void formatRepoIfNeeded() {
        final Store store = this.getStore();
        if (store == null) {
            throw new RuntimeException("Improperly asked to format store with no store open.");
        }
        try {
            final boolean isFormatted = StoreUtils.isFormatted(store);
            this.logInfo("isFormatted returned  " + isFormatted);
            if (!isFormatted) {
                this.logInfo("Creating SDB tables in store: " + store);
                this.myStore.getTableFormatter().create();
            }
            else {
                this.logWarning("Store " + store + " is already formatted, so ignoring init command.");
            }
        }
        catch (Throwable t) {
            this.logError("problem in formatIfNeeded", t);
        }
    }
    
    @Override
	public void importGraphFromURL(final String tgtGraphName, final String sourceURL, final boolean replaceTgtFlag) {
        final boolean timingEnabledFlag = true;
        final boolean verboseFlag = true;
        final boolean quietFlag = false;
        final GraphUploadTask ut = new GraphUploadTask(timingEnabledFlag, verboseFlag, quietFlag);
        ut.loadOneGraphIntoStoreFromURL(this.myStore, tgtGraphName, sourceURL, replaceTgtFlag);
    }
    
    @Override
	public Dataset makeMainQueryDataset() {
        final Store store = this.getStore();
        final Dataset ds = DatasetStore.create(store);
        return ds;
    }
    
    protected Model connectNamedModel(final Ident modelID) {
        return SDBFactory.connectNamedModel(this.getStore(), modelID.getAbsUriString());
    }
    
    @Override
	public void addNamedModel(final Ident modelID, final Model srcModel) {
        final Model connModel = this.connectNamedModel(modelID);
        connModel.add(srcModel);
    }
    
    @Override
	public void replaceNamedModel(final Ident modelID, final Model srcModel) {
        final Model connModel = this.connectNamedModel(modelID);
        connModel.removeAll();
        connModel.add(srcModel);
    }
    
    public static BasicStoredMutableRepoImpl openBasicRepoFromConfigPath(final String storeConfigPath, final ClassLoader optCL) {
        getLoggerForClass((Class)BasicStoredMutableRepoImpl.class).info("Getting Muttable Model from SdbStoreFactory: " + storeConfigPath);
        final Store s = SdbStoreFactory.connectSdbStoreFromResPath(storeConfigPath, optCL);
        final BasicStoredMutableRepoImpl repo = new BasicStoredMutableRepoImpl(s);
        return repo;
    }
    
    protected List<Repo.GraphStat> unusedDirectGraphStatFetcher(final Store store) {
        final List<Repo.GraphStat> stats = new ArrayList<Repo.GraphStat>();
        final Iterator<Node> nodeIt = (Iterator<Node>)StoreUtils.storeGraphNames(store);
        while (nodeIt.hasNext()) {
            final Node n = nodeIt.next();
            final Repo.GraphStat stat = new Repo.GraphStat(n.getURI(), (GetObject)null);
            final Model m = SDBFactory.connectNamedModel(store, stat.graphURI);
            stat.setValue(m);
            this.logInfo("Found graph with URI: " + stat.graphURI + " and size: " + stat.getStatementCount());
            stats.add(stat);
        }
        return stats;
    }
}

/*

	Total time: 41 ms
	
*/