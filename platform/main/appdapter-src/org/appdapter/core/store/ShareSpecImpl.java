package org.appdapter.core.store;

import org.appdapter.core.name.FreeIdent;
import org.appdapter.core.store.dataset.RepoDatasetFactory;
import com.hp.hpl.jena.query.Dataset;
import org.appdapter.core.store.dataset.RemoteDatasetProviderSpec;
import org.appdapter.core.store.dataset.RemoteDatasetProvider;
import com.hp.hpl.jena.rdf.model.Model;
import org.appdapter.core.name.Ident;

public class ShareSpecImpl implements Runnable, ShareSpec
{
    private BasicRepoImpl.TaskState taskState;
    private boolean isUnsharedAfterMerge;
    Ident localModelID;
    private String shareName;
    boolean clearRemote;
    boolean clearLocal;
    boolean mergedAfterClear;
    boolean isSharedAfterMerge;
    Runnable nextDoRunnable;
    Runnable beforeDoRunnable;
    private Model localModel;
    private Model remoteModel;
    private Ident remoteModelID;
    public Repo.DatasetProvider localSpec;
    public RemoteDatasetProvider remoteSpec;
    
    public ShareSpecImpl(final Ident modelID, final String shareName, final boolean clearRemote, final boolean clearLocal, final boolean mergedAfterClear, final boolean isSharedAfterMerge, final RemoteDatasetProviderSpec remoteSpec, final BasicRepoImpl.TaskState taskState) {
        this.nextDoRunnable = null;
        this.beforeDoRunnable = null;
        this.localModelID = modelID;
        this.shareName = shareName;
        this.clearRemote = clearRemote;
        this.clearLocal = clearLocal;
        this.mergedAfterClear = mergedAfterClear;
        this.isSharedAfterMerge = isSharedAfterMerge;
        this.isUnsharedAfterMerge = !isSharedAfterMerge;
        this.remoteSpec = remoteSpec.getRemoteDatasetProvider();
        this.taskState = taskState;
    }
    
    @Override
	public Runnable requiredWork(final Repo.DatasetProvider local, final ShareSpec goalShareSpec, final RemoteDatasetProviderSpec remoteDatasetProvider) {
        if (goalShareSpec.getTaskState() != BasicRepoImpl.TaskState.TaskNeedsStart) {
            return null;
        }
        if (goalShareSpec.sameOutcome((ShareSpec)this) && this.taskState != BasicRepoImpl.TaskState.TaskNeedsStart) {
            return null;
        }
        this.localSpec = local;
        this.remoteSpec = remoteDatasetProvider.getRemoteDatasetProvider();
        return this;
    }
    
    @Override
	public boolean sameOutcome(final ShareSpec shareSpec0) {
        if (shareSpec0 == null) {
            return false;
        }
        final ShareSpecImpl shareSpec = (ShareSpecImpl)shareSpec0;
        return shareSpec.isSharedAfterMerge == this.isSharedAfterMerge && shareSpec.remoteSpec == this.remoteSpec && shareSpec.mergedAfterClear == this.mergedAfterClear && shareSpec.clearLocal == this.clearLocal && shareSpec.clearRemote == this.clearRemote && this.getGlobalName().equals(shareSpec.getGlobalName());
    }
    
    @Override
    public void run() {
        if (this.taskState != BasicRepoImpl.TaskState.TaskNeedsStart) {
            return;
        }
        this.taskState = BasicRepoImpl.TaskState.TaskStarting;
        if (this.beforeDoRunnable != null) {
            this.taskState = BasicRepoImpl.TaskState.TaskPretasks;
            this.beforeDoRunnable.run();
        }
        try {
            this.taskState = BasicRepoImpl.TaskState.TaskClearingCaches;
            if (this.clearLocal) {
                this.localModel = this.getLocalModel(false);
                if (this.localModel != null) {
                    this.localModel.removeAll();
                }
            }
            if (this.clearRemote) {
                this.remoteModel = this.getRemoteModel(false);
                if (this.remoteModel != null) {
                    this.remoteModel.removeAll();
                }
            }
            if (this.mergedAfterClear) {
                StatementSync.syncTwoModels(this.getLocalModel(true), this.getRemoteModel(true));
            }
            if (this.isSharedAfterMerge) {
                StatementSync.syncTwoModels(this.getLocalModel(true), this.getRemoteModel(true));
            }
            if (this.nextDoRunnable != null) {
                this.taskState = BasicRepoImpl.TaskState.TaskBranching;
                this.nextDoRunnable.run();
            }
        }
        finally {
            this.taskState = BasicRepoImpl.TaskState.TaskComplete;
        }
    }
    
    @Override
	public String getGlobalName() {
        final String plString = this.remoteSpec.getProviderBase();
        return plString + "-" + this.shareName + "@" + this.localModelID.getAbsUriString();
    }
    
    public Model getLocalModel(final boolean createIfMissing) {
        final String modelUriString = this.getLocalURI();
        if (this.localModel != null) {
            final Dataset lds = this.getLocalDataset();
            this.localModel = lds.getNamedModel(modelUriString);
            if (this.localModel != null) {
                return this.localModel;
            }
            if (createIfMissing) {
                this.localModel = this.localSpec.getNamedModel(this.localModelID, createIfMissing);
            }
        }
        return this.localModel;
    }
    
    public String getLocalURI() {
        return this.localModelID.getAbsUriString();
    }
    
    public Dataset getLocalDataset() {
        return this.localSpec.getMainQueryDataset();
    }
    
    public Model createEmptyLocalModel() {
        return this.localSpec.getNamedModel(this.localModelID, true);
    }
    
    public String getDatasetType(final Dataset localDataset) {
        return RepoDatasetFactory.getDatasetType(localDataset);
    }
    
    public Model getRemoteModel(final boolean createIfMissing) {
        final String modelUriString = this.getRemoteURI();
        if (this.remoteModel != null) {
            final Dataset lds = this.getRemoteDataset();
            this.remoteModel = lds.getNamedModel(modelUriString);
            if (this.remoteModel != null) {
                return this.remoteModel;
            }
            if (createIfMissing) {
                this.remoteModel = this.createEmptyRemoteModel(this.remoteModelID);
            }
        }
        return this.remoteModel;
    }
    
    public String getRemoteURI() {
        return this.remoteModelID.getAbsUriString();
    }
    
    public Dataset getRemoteDataset() {
        return this.remoteSpec.getMainQueryDataset();
    }
    
    public Model createEmptyRemoteModel(final Ident remoteModelID) {
        final String dsType = this.getDatasetType(this.getRemoteDataset());
        return this.remoteSpec.getNamedModel((Ident)new FreeIdent(remoteModelID), true);
    }
    
    @Override
	public BasicRepoImpl.TaskState getTaskState() {
        return this.taskState;
    }
    
    @Override
	public Ident getLocalModelId() {
        return this.localModelID;
    }
}

/*

	Total time: 35 ms
	
*/