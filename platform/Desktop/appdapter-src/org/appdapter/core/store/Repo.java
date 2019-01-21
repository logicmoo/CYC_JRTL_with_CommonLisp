package org.appdapter.core.store;

import com.hp.hpl.jena.sdb.Store;
import org.appdapter.core.store.dataset.RemoteDatasetProviderSpec;
import com.hp.hpl.jena.query.QuerySolution;
import java.lang.reflect.InvocationTargetException;
import org.appdapter.core.jvm.SetObject;
import org.appdapter.core.name.FreeIdent;
import org.appdapter.core.jvm.GetObject;
import java.util.Map;
import com.hp.hpl.jena.rdf.listeners.StatementListener;
import java.util.Set;
import com.hp.hpl.jena.rdf.model.Model;
import org.appdapter.core.name.Ident;
import java.util.List;
import com.hp.hpl.jena.query.Dataset;

public interface Repo extends QueryProcessor
{
    Dataset getMainQueryDataset();

    List<GraphStat> getGraphStats();

    Model getNamedModel(final Ident p0);

    Set<Object> assembleRootsFromNamedModel(final Ident p0);

    public static class GraphStat extends StatementListener implements Map.Entry<Ident, Model>
    {
        public String graphURI;
        private GetObject<Model> model;

        @Override
		public Ident getKey() {
            return (Ident)new FreeIdent(this.graphURI);
        }

        public GraphStat(final String uri, final GetObject<Model> mdl) {
            this.graphURI = uri;
            this.model = mdl;
        }

        @Override
		public String toString() {
            return "[GraphStat uri=" + this.graphURI + ", stmtCnt=" + this.getStatementCount() + "]";
        }

        @Override
		public Model getValue() {
            return (Model)this.model.getValue();
        }

        @Override
		public Model setValue(final Model value) {
            final Model mdl = (Model)this.model.getValue();
            if (mdl == value) {
                return mdl;
            }
            if (this.model instanceof SetObject) {
                try {
                    ((SetObject)this.model).setObject((Object)value);
                    return mdl;
                }
                catch (InvocationTargetException e) {
                    throw new RuntimeException(e.getCause());
                }
               // if(true)throw new UnsupportedOperationException("Cannot change the model in this graphStat to " + value);
            }
            throw new UnsupportedOperationException("Cannot change the model in this graphStat to " + value);
        }

        public long getStatementCount() {
            return ((Model)this.model.getValue()).size();
        }
    }

    public interface WithDirectory extends WithFallbackModelClient
    {
        Model getDirectoryModel();

        ModelClient getDirectoryModelClient();

        InitialBinding makeInitialBinding();

        void addLoadTask(final String p0, final Runnable p1);

        List<QuerySolution> queryIndirectForAllSolutions(final Ident p0, final Ident p1, final QuerySolution p2);

        List<QuerySolution> queryIndirectForAllSolutions(final String p0, final String p1, final QuerySolution p2);

        List<QuerySolution> queryDirectForAllSolutions(final String p0, final QuerySolution p1);
    }

    public interface WithFallbackModelClient extends Repo, ModelClient
    {
        ModelClient getFallbackModelClient();
    }

    public interface Mutable extends Repo, Updatable
    {
        void importGraphFromURL(final String p0, final String p1, final boolean p2);

        String getUploadHomePath();

        void formatRepoIfNeeded();
    }

    public interface Updatable extends Repo
    {
        void addNamedModel(final Ident p0, final Model p1);

        void replaceNamedModel(final Ident p0, final Model p1);
    }

    public interface SharedModels extends DatasetProvider
    {
        void setNamedModelShareType(final List<Ident> p0, final String p1, final boolean p2, final boolean p3, final boolean p4, final boolean p5, final RemoteDatasetProviderSpec p6);

        void setNamedModelShareType(final List<ShareSpec> p0, final RemoteDatasetProviderSpec p1);

        Map<Ident, ShareSpec> getSharedModelSpecs();
    }

    public interface DatasetProvider
    {
        Dataset getMainQueryDataset();

        boolean isRemote();

        Model getNamedModel(final Ident p0, final boolean p1);
    }

    public interface Stored extends Repo
    {
        Store getStore();
    }
}

/*

	Total time: 34 ms

*/