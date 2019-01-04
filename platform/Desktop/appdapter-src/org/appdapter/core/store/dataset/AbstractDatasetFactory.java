package org.appdapter.core.store.dataset;

import java.util.Map;
import com.hp.hpl.jena.assembler.Assembler;
import com.hp.hpl.jena.sparql.ARQException;
import com.hp.hpl.jena.sparql.util.graph.GraphUtils;
import com.hp.hpl.jena.sparql.core.assembler.DatasetAssembler;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.sparql.core.DatasetImpl;
import java.util.ArrayList;
import com.hp.hpl.jena.sparql.util.DatasetUtils;
import com.hp.hpl.jena.util.FileManager;
import java.util.List;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.sparql.graph.GraphFactory;
import com.hp.hpl.jena.sparql.core.DatasetGraphFactory;
import com.hp.hpl.jena.sparql.core.DatasetGraph;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.query.Dataset;

public abstract class AbstractDatasetFactory implements UserDatasetFactory
{
    public boolean canCreateModelOfType(final String typeOf, final String sharedNameIgnoredPresently) {
        return this.canCreateType(typeOf, sharedNameIgnoredPresently);
    }
    
    public abstract Dataset createDefault();
    
    public abstract Dataset createType(final String p0, final String p1);
    
    public abstract Dataset createRemotePeer();
    
    public abstract Dataset create(final Model p0);
    
    public abstract Dataset create(final Dataset p0);
    
    public abstract Dataset create(final DatasetGraph p0);
    
    public abstract Model createModelOfType(final String p0, final String p1) throws Throwable;
    
    public abstract String getDatasetType();
    
    public Dataset createMem() {
        return this.create(DatasetGraphFactory.createMem());
    }
    
    public Dataset createMemFixed() {
        return this.create(DatasetGraphFactory.createMemFixed());
    }
    
    @Deprecated
    public final Dataset create() {
        return this.create(ModelFactory.createModelForGraph(GraphFactory.createDefaultGraph()));
    }
    
    public Dataset create(final List<String> uriList, final List<String> namedSourceList, final FileManager fileManager, final String baseURI) {
        final Dataset ds = this.createDefault();
        DatasetUtils.addInGraphs(ds, (List)uriList, (List)namedSourceList, fileManager, baseURI);
        return ds;
    }
    
    public Dataset create(final List<String> uriList) {
        return this.create(uriList, null, null, null);
    }
    
    public Dataset create(final String uri) {
        return this.create(uri, null, null, null);
    }
    
    public Dataset create(final List<String> uriList, final FileManager fileManager) {
        return this.create(uriList, null, fileManager, null);
    }
    
    public Dataset create(final String uri, final FileManager fileManager) {
        return this.create(uri, null, fileManager, null);
    }
    
    public Dataset createNamed(final List<String> namedSourceList, final FileManager fileManager) {
        return this.create((List<String>)null, namedSourceList, fileManager, null);
    }
    
    public Dataset create(final List<String> uriList, final List<String> namedSourceList) {
        return this.create(uriList, namedSourceList, null, null);
    }
    
    public Dataset create(final String uri, final List<String> namedSourceList) {
        return this.create(uri, namedSourceList, null, null);
    }
    
    public Dataset create(final String uri, final List<String> namedSourceList, final FileManager fileManager, final String baseURI) {
        final List<String> uriList = new ArrayList<String>();
        uriList.add(uri);
        return this.create(uriList, namedSourceList, fileManager, baseURI);
    }
    
    public Dataset make(final Dataset ds, final Model defaultModel) {
        final Dataset ds2 = (Dataset)new DatasetImpl(ds);
        ds2.setDefaultModel(defaultModel);
        return ds2;
    }
    
    public Dataset assemble(final String filename) {
        final Model model = FileManager.get().loadModel(filename);
        return this.assemble(model);
    }
    
    public Dataset assemble(final String filename, final String resourceURI) {
        final Model model = FileManager.get().loadModel(filename);
        final Resource r = model.createResource(resourceURI);
        return this.assemble(r);
    }
    
    public Dataset assemble(final Model model) {
        final Resource r = GraphUtils.findRootByType(model, DatasetAssembler.getType());
        if (r == null) {
            throw new ARQException("No root found for type <" + DatasetAssembler.getType() + ">");
        }
        return this.assemble(r);
    }
    
    public Dataset assemble(final Resource resource) {
        final Dataset ds = (Dataset)Assembler.general.open(resource);
        return ds;
    }
    
    public boolean canCreateType(final String typeOf, final String sharedNameIgnoredPresently) {
        final Map<String, UserDatasetFactory> registeredUserDatasetFactoryByName = (Map<String, UserDatasetFactory>)RepoDatasetFactory.registeredUserDatasetFactoryByName;
        synchronized (registeredUserDatasetFactoryByName) {
            if (typeOf != null && registeredUserDatasetFactoryByName.get(typeOf) == this) {
                return true;
            }
            if (sharedNameIgnoredPresently != null && registeredUserDatasetFactoryByName.get(sharedNameIgnoredPresently) == this) {
                return true;
            }
        }
        return false;
    }
}

/*

	Total time: 41 ms
	
*/