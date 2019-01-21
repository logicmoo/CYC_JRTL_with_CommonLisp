package org.appdapter.core.store;

import org.appdapter.bind.rdf.jena.assembly.AssemblerUtils;
import java.util.Set;
import org.appdapter.bind.rdf.jena.query.JenaArqQueryFuncs;
import org.appdapter.bind.rdf.jena.query.JenaArqResultSetProcessor;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.Query;
import org.appdapter.core.jvm.GetObject;
import java.util.Iterator;
import java.util.ArrayList;
import org.appdapter.core.store.dataset.RemoteDatasetProviderSpec;
import java.util.List;
import com.hp.hpl.jena.shared.Lock;
import java.util.HashMap;
import org.appdapter.core.store.dataset.RepoDatasetFactory;
import org.appdapter.core.name.Ident;
import java.util.Map;
import org.appdapter.core.store.dataset.UserDatasetFactory;
import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.rdf.model.Model;
import org.appdapter.core.store.dataset.SpecialRepoLoader;

public abstract class BasicRepoImpl extends BasicQueryProcessorImpl implements Repo, Repo.SharedModels, Repo.DatasetProvider
{
    public static boolean LOAD_SINGLE_THREADED;
    public boolean loadSingleThread;
    SpecialRepoLoader specialRepoLoader;
    Model repoEvents;
    protected boolean isUpdatedFromDirModel;
    protected Dataset myMainQueryDataset;
    public final Object loadingLock;
    public boolean isLoadingStarted;
    public boolean isLoadingLocked;
    public boolean isLoadingFinished;
    protected UserDatasetFactory datasetProvider;
    public String datasetType;
    protected final Map<Ident, ShareSpec> sharedModelSpecs;
    
    protected SpecialRepoLoader getRepoLoader() {
        return this.specialRepoLoader;
    }
    
    protected BasicRepoImpl(final SpecialRepoLoader srepoLoader) {
        this.loadSingleThread = BasicRepoImpl.LOAD_SINGLE_THREADED;
        this.isUpdatedFromDirModel = false;
        this.loadingLock = new Object();
        this.isLoadingStarted = false;
        this.isLoadingLocked = false;
        this.isLoadingFinished = false;
        this.datasetProvider = RepoDatasetFactory.DEFAULT;
        this.sharedModelSpecs = new HashMap<Ident, ShareSpec>();
        this.specialRepoLoader = srepoLoader;
    }
    
    protected BasicRepoImpl() {
        this.loadSingleThread = BasicRepoImpl.LOAD_SINGLE_THREADED;
        this.isUpdatedFromDirModel = false;
        this.loadingLock = new Object();
        this.isLoadingStarted = false;
        this.isLoadingLocked = false;
        this.isLoadingFinished = false;
        this.datasetProvider = RepoDatasetFactory.DEFAULT;
        this.sharedModelSpecs = new HashMap<Ident, ShareSpec>();
        (this.specialRepoLoader = new SpecialRepoLoader(this)).setSingleThreaded(this.loadSingleThread);
    }
    
    public Model getEventsModel() {
        if (this.repoEvents == null) {
            this.repoEvents = RepoDatasetFactory.createDefaultModel();
        }
        return this.repoEvents;
    }
    
    public void addLoadTask(final String nym, final Runnable r) {
        final SpecialRepoLoader repoLoader = this.getRepoLoader();
        repoLoader.addTask(nym, r);
    }
    
    public void addLoadTask(final String nym, final Runnable r, final boolean forGround) {
        if (forGround) {
            r.run();
            return;
        }
        final SpecialRepoLoader repoLoader = this.getRepoLoader();
        repoLoader.addTask(nym, r);
    }
    
    public void replaceNamedModel(final Ident modelID, final Model jenaModel) {
        final Dataset repoDset = this.getMainQueryDataset();
        final Lock lock = repoDset.getLock();
        String name = modelID.getAbsUriString();
        name = RepoOper.correctModelName(name);
        try {
            lock.enterCriticalSection(false);
            repoDset.replaceNamedModel(name, jenaModel);
        }
        finally {
            lock.leaveCriticalSection();
        }
    }
    
    public void addNamedModel(final Ident modelID, final Model jenaModel) {
        final Dataset repoDset = this.getMainQueryDataset();
        final Lock lock = repoDset.getLock();
        try {
            lock.enterCriticalSection(false);
            String name = modelID.getAbsUriString();
            name = RepoOper.correctModelName(name);
            if (!repoDset.containsNamedModel(name)) {
                repoDset.addNamedModel(name, jenaModel);
            }
            else {
                final Model before = repoDset.getNamedModel(name);
                jenaModel.add(before);
                repoDset.replaceNamedModel(name, jenaModel);
            }
        }
        finally {
            lock.leaveCriticalSection();
        }
    }
    
    @Override
	public boolean isRemote() {
        return false;
    }
    
    @Override
	public void setNamedModelShareType(final List<Ident> modelIDs, final String shareName, final boolean clearRemote, final boolean clearLocal, final boolean mergeAfterClear, final boolean isSharedAfterMerge, final RemoteDatasetProviderSpec remoteDatasetProviderSpec) {
        final List<ShareSpec> shareSpecs = new ArrayList<ShareSpec>();
        for (final Ident modelId : modelIDs) {
            shareSpecs.add((ShareSpec)new ShareSpecImpl(modelId, shareName, clearRemote, clearLocal, mergeAfterClear, isSharedAfterMerge, remoteDatasetProviderSpec, TaskState.TaskNeedsStart));
        }
        this.setNamedModelShareType(shareSpecs, (RemoteDatasetProviderSpec)remoteDatasetProviderSpec.getRemoteDatasetProvider());
    }
    
    @Override
	public void setNamedModelShareType(final List<ShareSpec> shareSpecs, final RemoteDatasetProviderSpec remoteDatasetProvider) {
        this.finishLoading();
        final Map<Ident, ShareSpec> prev = this.getSharedModelSpecs();
        for (final ShareSpec shareSpec : shareSpecs) {
            final ShareSpec shareSpecBefore = prev.get(shareSpec.getLocalModelId());
            final Runnable work = shareSpecBefore.requiredWork((Repo.DatasetProvider)this, shareSpec, remoteDatasetProvider);
            if (work == null) {
                continue;
            }
            this.addLoadTask("setNamedModelShareType " + work, work);
        }
        this.finishLoading();
    }
    
    @Override
	public Map<Ident, ShareSpec> getSharedModelSpecs() {
        return this.sharedModelSpecs;
    }
    
    @Override
	public Model getNamedModel(final Ident modelID, final boolean createIfMissing) {
        final Dataset repoDset = this.getMainQueryDataset();
        final Lock lock = repoDset.getLock();
        String name = modelID.getAbsUriString();
        name = RepoOper.correctModelName(name);
        Model jenaModel = null;
        try {
            lock.enterCriticalSection(false);
            if (!repoDset.containsNamedModel(name)) {
                jenaModel = this.createLocalNamedModel(modelID);
                repoDset.addNamedModel(name, jenaModel);
            }
            else {
                jenaModel = repoDset.getNamedModel(name);
            }
        }
        finally {
            lock.leaveCriticalSection();
        }
        return jenaModel;
    }
    
    public Model createLocalNamedModel(final Ident modelID) {
        String name = modelID.getAbsUriString();
        name = RepoOper.correctModelName(name);
        return RepoDatasetFactory.createModel(this.getDatasetType(), name, this.getShareName());
    }
    
    public String getShareName() {
        return RepoDatasetFactory.DATASET_SHARE_NAME;
    }
    
    public String getDatasetType() {
        if (this.datasetProvider != null) {
            return this.datasetProvider.getDatasetType();
        }
        return this.datasetType;
    }
    
    protected Dataset makeMainQueryDataset() {
        if (this.datasetProvider != null) {
            return this.datasetProvider.createDefault();
        }
        if (this.datasetType != null) {
            return this.datasetProvider.createDefault();
        }
        final Dataset ds = RepoDatasetFactory.createDefault();
        return ds;
    }
    
    public void setMyMainQueryDataset(final Dataset myMainQueryDataset) {
        this.myMainQueryDataset = myMainQueryDataset;
    }
    
    @Override
	public Dataset getMainQueryDataset() {
        this.beginLoading();
        if (this.myMainQueryDataset == null) {
            this.myMainQueryDataset = this.makeMainQueryDataset();
        }
        if (!this.isLoadingFinished) {
            this.finishLoading();
        }
        return this.myMainQueryDataset;
    }
    
    public final void beginLoading() {
        if (this.isLoadingStarted || this.isLoadingLocked) {
            return;
        }
        synchronized (this.loadingLock) {
            this.isLoadingStarted = true;
            this.isLoadingLocked = true;
            this.isLoadingFinished = false;
            this.addLoadTask("beginLoading", new Runnable() {
                @Override
                public void run() {
                    final SpecialRepoLoader repoLoader = BasicRepoImpl.this.getRepoLoader();
                    repoLoader.setSynchronous(false);
                    synchronized (BasicRepoImpl.this.loadingLock) {
                        BasicRepoImpl.this.callLoadingInLock();
                    }
                    BasicRepoImpl.this.isLoadingLocked = false;
                    repoLoader.setLastJobSubmitted();
                    repoLoader.waitUntilLastJobComplete();
                }
            }, true);
        }
    }
    
    public abstract void callLoadingInLock();
    
    public final void finishLoading() {
        synchronized (this.loadingLock) {
        }
        // monitorexit(this.loadingLock)
        final SpecialRepoLoader repoLoader = this.getRepoLoader();
        repoLoader.waitUntilLastJobComplete();
        this.isLoadingFinished = true;
    }
    
    @Override
	public List<Repo.GraphStat> getGraphStats() {
        final List<Repo.GraphStat> stats = new ArrayList<Repo.GraphStat>();
        final Dataset mainDset = this.getMainQueryDataset();
        final Iterator<String> nameIt = (Iterator<String>)mainDset.listNames();
        while (nameIt.hasNext()) {
            final String modelName = nameIt.next();
            final Repo.GraphStat gs = new Repo.GraphStat(modelName, (GetObject)new GetObject<Model>() {
                @Override
				public Model getValue() {
                    return mainDset.getNamedModel(modelName);
                }
            });
            stats.add(gs);
        }
        return stats;
    }
    
    @Override
	public <ResType> ResType processQuery(final Query parsedQuery, final QuerySolution initBinding, final JenaArqResultSetProcessor<ResType> resProc) {
        ResType result = null;
        try {
            final Dataset ds = this.getMainQueryDataset();
            result = (ResType)JenaArqQueryFuncs.processDatasetQuery(ds, parsedQuery, initBinding, (JenaArqResultSetProcessor)resProc);
        }
        catch (Throwable t) {
            this.getLogger().error("problem in processQuery [{}]", (Object)parsedQuery, (Object)t);
        }
        return result;
    }
    
    @Override
	public List<QuerySolution> findAllSolutions(final Query parsedQuery, final QuerySolution initBinding) {
        final Dataset ds = this.getMainQueryDataset();
        return (List<QuerySolution>)JenaArqQueryFuncs.findAllSolutions(ds, parsedQuery, initBinding);
    }
    
    @Override
	public Model getNamedModel(final Ident graphNameIdent) {
        final Dataset mqd = this.getMainQueryDataset();
        String absURI = graphNameIdent.getAbsUriString();
        absURI = RepoOper.correctModelName(absURI);
        return mqd.getNamedModel(absURI);
    }
    
    @Override
	public Set<Object> assembleRootsFromNamedModel(final Ident graphNameIdent) {
        final Model loadedModel = this.getNamedModel(graphNameIdent);
        if (loadedModel == null) {
            this.getLogger().error("No model found at {}", (Object)graphNameIdent);
            return null;
        }
        final Set<Object> results = (Set<Object>)AssemblerUtils.buildAllRootsInModel(loadedModel);
        return results;
    }
    
    static {
        BasicRepoImpl.LOAD_SINGLE_THREADED = true;
    }
    
    public enum TaskState
    {
        TaskNeedsStart, 
        TaskStarting, 
        TaskClearingCaches, 
        TaskMerging, 
        TaskBranching, 
        TaskComplete, 
        TaskPretasks;
    }
}

/*

	Total time: 73 ms
	
*/