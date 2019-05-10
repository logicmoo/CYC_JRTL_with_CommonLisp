package org.appdapter.core.store.dataset;

import org.appdapter.demo.DemoResources;
import java.util.HashMap;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import com.hp.hpl.jena.graph.compose.MultiUnion;
import com.hp.hpl.jena.graph.Node;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.sdb.store.StoreFormatter;
import org.appdapter.demo.DemoDatabase;
import com.hp.hpl.jena.query.DatasetFactory;
import com.hp.hpl.jena.graph.Factory;
import com.hp.hpl.jena.graph.compose.Union;
import com.hp.hpl.jena.shared.PrefixMapping;
import com.hp.hpl.jena.sdb.Store;
import com.hp.hpl.jena.sdb.SDBFactory;
import org.appdapter.bind.rdf.jena.sdb.SdbStoreFactory;
import org.appdapter.bind.rdf.jena.model.JenaFileManagerUtils;
import org.appdapter.core.store.RepoOper;
import com.hp.hpl.jena.sdb.SDB;
import org.appdapter.core.store.StatementSync;
import com.hp.hpl.jena.rdf.model.ModelChangedListener;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.rdf.listeners.StatementListener;
import com.hp.hpl.jena.graph.Graph;
import java.util.Iterator;
import java.util.Collection;
import org.appdapter.core.convert.ReflectUtils;
import java.util.HashSet;
import org.appdapter.core.log.Debuggable;
import org.appdapter.core.name.FreeIdent;
import com.hp.hpl.jena.rdf.model.Model;
import java.util.List;
import com.hp.hpl.jena.query.Dataset;
import java.util.Map;
import org.slf4j.Logger;
import org.appdapter.core.debug.UIAnnotations;
import org.appdapter.api.trigger.AnyOper;

@UIAnnotations.UIHidden
public class RepoDatasetFactory implements AnyOper, UIAnnotations.UtilClass
{
    static Logger theLogger;
    @UIAnnotations.UISalient
    public static boolean allModelNoDelete;
    @UIAnnotations.UISalient
    public static boolean datasetNoDeleteModels;
    @UIAnnotations.UISalient
    public static boolean allModelsTheSame;
    public static boolean alwaysShareDataset;
    public static boolean allwaysRenameModels;
    public static final String DATASET_TYPE_DEFAULT_MEMFILE_TYPE = "memory";
    public static final String DATASET_TYPE_DEFAULT_SHARE_TYPE = "shared";
    public static String DATASET_SHARE_NAME;
    public static String DATASET_TYPE_UNSHARED;
    public static String DATASET_TYPE_DEFAULT;
    public static String DATASET_TYPE_SHARED;
    static final Map<String, String> datasetClassTypesMap;
    public static UserDatasetFactory DEFAULT;
    public static Dataset globalDS;
    static long serialNumber;
    static final UserDatasetFactory jenaSDBDatasetFactory;
    static final UserDatasetFactory jenaUnsharedMemoryDatasetFactory;
    static final Map<String, UserDatasetFactory> registeredUserDatasetFactoryByName;
    static final List<UserDatasetFactory> registeredUserDatasetFactorys;
    private static final boolean VANILLA = false;
    public static String STORE_CONFIG_PATH;
    static Model universalModel;
    
    public static boolean verifyURI(final String uri) {
        return FreeIdent.verifyURI(uri);
    }
    
    public static String fixURI(final String uri) {
        return FreeIdent.previousURI(uri);
    }
    
    @UIAnnotations.UISalient
    public static void addDatasetSync(final Dataset d1, final Dataset d2) {
        Debuggable.notImplemented(new Object[] { "AddDatasetSync", d1, d2 });
        final HashSet<String> nameSet = new HashSet<String>();
        ReflectUtils.addAllNew((Collection)nameSet, d1.listNames());
        ReflectUtils.addAllNew((Collection)nameSet, d2.listNames());
        for (final String uri : nameSet) {
            addModelSync(uri, d1, d2);
        }
    }
    
    public static Model createModelForGraph(Graph graph) {
        if (!(graph instanceof CheckedGraph)) {
            graph = (Graph)new CheckedGraph(graph, false, false, true);
        }
        return (Model)new CheckedModel((CheckedGraph)graph);
    }
    
    public static void invalidateModel(final Model m) {
        if (m == RepoDatasetFactory.universalModel) {
            return;
        }
        RepoDatasetFactory.theLogger.error("Invalidating model: " + m);
        m.register((ModelChangedListener)new StatementListener() {
            @Override
			public void addedStatement(final Statement s) {
                super.addedStatement(s);
                throw new RuntimeException("addNoMods: Dead Model " + m);
            }
            
            @Override
			public void removedStatement(final Statement s) {
                super.removedStatement(s);
                throw new RuntimeException("addNoMods: Dead Model " + m);
            }
        });
    }
    
    @UIAnnotations.UISalient
    public static void addModelSync(final Model m1, final Model m2) {
        Debuggable.notImplemented(new Object[] { "addModelSync", m1, m2 });
        final StatementSync ss = StatementSync.getStatementSyncerOfModels(m1, m2);
        ss.enableSync();
        ss.completeSync();
    }
    
    private static void addModelSync(final String uri, final Dataset... dsDatasets) {
        untested(new Object[0]);
        final Model model = findOrCreateGlobalModel(uri);
        for (final Dataset newDs : dsDatasets) {
            addModelSync(model, findOrCreateModel(newDs, uri));
        }
    }
    
    private static Dataset connectDataset(final String storeConfigPath) {
        untested(new Object[0]);
        SDB.init();
        final ClassLoader classLoader = RepoOper.class.getClassLoader();
        JenaFileManagerUtils.ensureClassLoaderRegisteredWithDefaultJenaFM(classLoader);
        final Store store = SdbStoreFactory.connectSdbStoreFromResPath(storeConfigPath, classLoader);
        try {
            SDBFactory.connectDataset(store).listNames();
        }
        catch (Exception e) {
            ensureQuadStore(store);
        }
        final Dataset dataset = SDBFactory.connectDataset(store);
        return dataset;
    }
    
    @UIAnnotations.UISalient
    public static Dataset createDataset(final String typeOf) {
        return createDataset(typeOf, RepoDatasetFactory.DATASET_SHARE_NAME);
    }
    
    @UIAnnotations.UISalient
    public static Dataset createDataset(final String typeOf, final String shareName) {
        final Dataset ds = createDataset0(typeOf, shareName);
        if (typeOf != null) {
            synchronized (RepoDatasetFactory.datasetClassTypesMap) {
                RepoDatasetFactory.datasetClassTypesMap.put(ds.getClass().getName(), typeOf);
            }
        }
        return ds;
    }
    
    static Dataset createDataset0(String typeOf, final String shareName) {
        if (typeOf == null) {
            typeOf = RepoDatasetFactory.DATASET_TYPE_DEFAULT;
        }
        else {
            typeOf = typeOf.toLowerCase();
        }
        final Map<String, UserDatasetFactory> dsfMap = RepoDatasetFactory.registeredUserDatasetFactoryByName;
        UserDatasetFactory udsf0 = null;
        synchronized (dsfMap) {
            udsf0 = dsfMap.get(typeOf);
        }
        if (udsf0 != null) {
            return udsf0.createType(typeOf, shareName);
        }
        for (final UserDatasetFactory udsf2 : getRegisteredUserDatasetFactories()) {
            if (udsf2.canCreateType(typeOf, shareName)) {
                return udsf2.createType(typeOf, shareName);
            }
        }
        return RepoDatasetFactory.jenaUnsharedMemoryDatasetFactory.createType(typeOf, shareName);
    }
    
    @UIAnnotations.UISalient
    public static Dataset createMem() {
        if (RepoDatasetFactory.alwaysShareDataset) {
            return createShared();
        }
        return createDataset("memory");
    }
    
    @UIAnnotations.UISalient
    public static Dataset createDefault() {
        if (RepoDatasetFactory.alwaysShareDataset) {
            return createShared();
        }
        return createDataset(RepoDatasetFactory.DATASET_TYPE_DEFAULT);
    }
    
    public static Model createUnion(final Model m1, final Model m2) {
        final Model shared = createUnionNoPrefixShare(m1, m2);
        shared.withDefaultMappings((PrefixMapping)m1);
        shared.withDefaultMappings((PrefixMapping)m2);
        return shared;
    }
    
    public static Model createUnionNoPrefixShare(final Model m1, final Model m2) {
        if (RepoDatasetFactory.allModelNoDelete) {
            return wrapNoDelete(createUnionImpl(m1, m2));
        }
        return wrapPrefixCheck(createUnionImpl(m1, m2));
    }
    
    private static Model createUnionImpl(final Model m1, final Model m2) {
        return createModelForGraph((Graph)new Union(m1.getGraph(), m2.getGraph()));
    }
    
    public static Model createDefaultModelNoDelete() {
        final Model nonuniversalModel = createDefaultModelImpl();
        return wrapPrefixCheck(wrapNoDelete(nonuniversalModel));
    }
    
    private static Model createDefaultModelImpl() {
        return (Model)new CheckedModel(Factory.createGraphMem(), false, false, false);
    }
    
    public static Model createPrivateMemModel() {
        if (RepoDatasetFactory.allModelNoDelete) {
            return createDefaultModelNoDelete();
        }
        return wrapPrefixCheck(createDefaultModelImpl());
    }
    
    public static Model createDefaultModel() {
        if (RepoDatasetFactory.allModelsTheSame) {
            return getSharedModel();
        }
        if (RepoDatasetFactory.allModelNoDelete) {
            return createDefaultModelNoDelete();
        }
        return createPrivateMemModel();
    }
    
    public static Model wrapNoDelete(final Model nonuniversalModel) {
        final Graph modelGraph = nonuniversalModel.getGraph();
        if (modelGraph instanceof CheckedGraph) {
            ((CheckedGraph)modelGraph).setNoDelete(true);
            return nonuniversalModel;
        }
        return createModelForGraph((Graph)new CheckedGraph(modelGraph, false, true, true));
    }
    
    public static Model wrapReadOnly(final Model nonuniversalModel) {
        final Graph modelGraph = nonuniversalModel.getGraph();
        if (modelGraph instanceof CheckedGraph) {
            ((CheckedGraph)modelGraph).setNoAdd(true);
            ((CheckedGraph)modelGraph).setNoDelete(true);
            return nonuniversalModel;
        }
        return createModelForGraph((Graph)new CheckedGraph(modelGraph, true, true, true));
    }
    
    public static Model wrapPrefixCheck(final Model nonuniversalModel) {
        final Graph modelGraph = nonuniversalModel.getGraph();
        if (modelGraph instanceof CheckedGraph) {
            ((CheckedGraph)modelGraph).setPrefixCheck(true);
            return nonuniversalModel;
        }
        return (Model)new CheckedModel(new CheckedGraph(modelGraph, false, false, true));
    }
    
    public static Model createModel(final String typeOf) {
        return createModel(typeOf, null, RepoDatasetFactory.DATASET_SHARE_NAME);
    }
    
    private static Model createModelForDataset(final String uri, final Dataset newDs) {
        return createDefaultModel();
    }
    
    @UIAnnotations.UISalient
    public static Model createModel(String typeOf, final String modelName, final String shareName) {
        if (typeOf == null) {
            typeOf = RepoDatasetFactory.DATASET_TYPE_DEFAULT;
        }
        else {
            typeOf = typeOf.toLowerCase();
        }
        final Map<String, UserDatasetFactory> dsfMap = RepoDatasetFactory.registeredUserDatasetFactoryByName;
        UserDatasetFactory udsf0 = null;
        synchronized (dsfMap) {
            udsf0 = dsfMap.get(typeOf);
        }
        if (udsf0 != null) {
            return udsf0.createModelOfType(typeOf, modelName, shareName);
        }
        for (final UserDatasetFactory udsf2 : getRegisteredUserDatasetFactories()) {
            if (udsf2.canCreateModelOfType(typeOf, shareName)) {
                return udsf2.createModelOfType(typeOf, modelName, shareName);
            }
        }
        return RepoDatasetFactory.jenaUnsharedMemoryDatasetFactory.createModelOfType(typeOf, modelName, shareName);
    }
    
    public static String createNewName() {
        ++RepoDatasetFactory.serialNumber;
        return "S" + RepoDatasetFactory.serialNumber;
    }
    
    public static Dataset createPrivateMem() {
        if (RepoDatasetFactory.alwaysShareDataset) {
            return getGlobalDShared();
        }
        return (Dataset)new CheckedDataset(DatasetFactory.createMem());
    }
    
    @UIAnnotations.UISalient
    public static Dataset createShared() {
        if (RepoDatasetFactory.alwaysShareDataset) {
            return getGlobalDShared();
        }
        final Dataset memDataset = createMem();
        return linkWithShared(memDataset);
    }
    
    private static void ensureQuadStore(final Store store) {
        DemoDatabase.initConnector();
        final StoreFormatter formaterObject = store.getTableFormatter();
        formaterObject.create();
        formaterObject.format();
        formaterObject.dropIndexes();
        formaterObject.addIndexes();
    }
    
    public static Model findOrCreateGlobalModel(final String uri) {
        return findOrCreateModel(getGlobalDShared(), uri);
    }
    
    public static Model findOrCreateModel(final Dataset newDs, String uri) {
        uri = RepoOper.correctModelName(uri);
        if (!newDs.containsNamedModel(uri)) {
            newDs.addNamedModel(uri, createModelForDataset(uri, newDs));
        }
        return newDs.getNamedModel(uri);
    }
    
    public static String getDatasetType(final Dataset localDataset) {
        String typeOfString = null;
        synchronized (RepoDatasetFactory.datasetClassTypesMap) {
            typeOfString = RepoDatasetFactory.datasetClassTypesMap.get(localDataset.getClass().getName());
            if (typeOfString != null) {
                return typeOfString;
            }
        }
        return null;
    }
    
    public static synchronized Dataset getGlobalDShared() {
        if (RepoDatasetFactory.globalDS == null && RepoDatasetFactory.allModelNoDelete) {
            RepoDatasetFactory.globalDS = (Dataset)new CheckedDataset();
        }
        if (RepoDatasetFactory.globalDS == null) {
            SDB.getContext();
            RepoDatasetFactory.globalDS = connectDataset(RepoDatasetFactory.STORE_CONFIG_PATH);
        }
        if (RepoDatasetFactory.alwaysShareDataset) {
            return RepoDatasetFactory.globalDS;
        }
        return DatasetFactory.create(RepoDatasetFactory.globalDS);
    }
    
    public static String getGlobalName(String modelName, String shareName) {
        if (modelName == null) {
            modelName = "Model_" + createNewName();
        }
        if (shareName == null) {
            shareName = RepoDatasetFactory.DATASET_SHARE_NAME;
        }
        return modelName + "_V_" + shareName;
    }
    
    private static List<UserDatasetFactory> getRegisteredUserDatasetFactories() {
        return (List<UserDatasetFactory>)ReflectUtils.copyOf((Collection)RepoDatasetFactory.registeredUserDatasetFactorys);
    }
    
    public static Model getSharedModel() {
        if (RepoDatasetFactory.universalModel == null) {
            RepoDatasetFactory.universalModel = createDefaultModelNoDelete();
        }
        return RepoDatasetFactory.universalModel;
    }
    
    public static Dataset linkWithShared(final Dataset memDataset) {
        untested(new Object[0]);
        addDatasetSync(memDataset, getGlobalDShared());
        return memDataset;
    }
    
    public static void registerDatasetFactory(final String datasetTypeName, final UserDatasetFactory udf) {
        final Map<String, UserDatasetFactory> dsfMap = RepoDatasetFactory.registeredUserDatasetFactoryByName;
        synchronized (dsfMap) {
            dsfMap.put(datasetTypeName, udf);
        }
        final List<UserDatasetFactory> lst = RepoDatasetFactory.registeredUserDatasetFactorys;
        synchronized (lst) {
            lst.remove(udf);
            lst.add(0, udf);
        }
    }
    
    @UIAnnotations.UISalient
    public static void addOrReplaceViaFactory(final RepoOper.ReloadableDataset myRepo, final UserDatasetFactory factory, final Resource unionOrReplace) {
        untested(new Object[0]);
        final Dataset oldDs = myRepo.getMainQueryDataset();
        final Dataset newDs = factory.create(oldDs);
        myRepo.setMyMainQueryDataset(newDs);
        RepoOper.addOrReplaceDatasetElements(newDs, oldDs, unionOrReplace);
    }
    
    @UIAnnotations.UISalient
    public static void addOrReplaceWithDB(final RepoOper.ReloadableDataset myRepo, final Resource unionOrReplace) {
        untested(new Object[0]);
        final Dataset oldDs = myRepo.getMainQueryDataset();
        final Dataset newDs = getGlobalDShared();
        myRepo.setMyMainQueryDataset(newDs);
        RepoOper.addOrReplaceDatasetElements(newDs, oldDs, unionOrReplace);
    }
    
    @UIAnnotations.UISalient
    public static void addOrReplaceWitMemory(final RepoOper.ReloadableDataset myRepo, final Resource unionOrReplace) {
        untested(new Object[0]);
        final Dataset oldDs = myRepo.getMainQueryDataset();
        final Dataset newDs = DatasetFactory.createMem();
        myRepo.setMyMainQueryDataset(newDs);
        RepoOper.addOrReplaceDatasetElements(newDs, oldDs, unionOrReplace);
    }
    
    static void untested(final Object... args) {
        throw new NullPointerException("" + args);
    }
    
    public static Node correctModelName(String onlyModel) {
        if (RepoDatasetFactory.allwaysRenameModels) {
            if (onlyModel.endsWith("_22")) {}
            if (onlyModel.endsWith("#")) {
                onlyModel = onlyModel.substring(0, onlyModel.length() - 1);
                return Node.createURI(correctModelName(onlyModel) + "#");
            }
            for (boolean remove = true; remove; remove = true) {
                remove = false;
                final char[] array = "1234567890_".toCharArray();
                for (int i = 0; i < array.length; ++i) {
                    final char c = array[i];
                    if (onlyModel.endsWith("" + c)) {
                        onlyModel = onlyModel.substring(0, onlyModel.length() - 1);
                        break;
                    }
                }
            }
        }
        return Node.createURI(onlyModel);
    }
    
    public static Graph getUnderlyingGraph(Graph graph) {
        while (graph instanceof CheckedGraph) {
            graph = ((CheckedGraph)graph).getDataGraph();
        }
        return graph;
    }
    
    public static Model createGroup(final Model srcM) {
        final Graph g = RepoOper.getUnderlyingGraph(srcM.getGraph());
        return createModelForGraph((Graph)new MultiUnion(new Graph[] { g }));
    }
    
    public static Model createGroup(final Model destM, final Model srcM) {
        final Graph g = RepoOper.getUnderlyingGraph(destM.getGraph());
        final Graph sg = getUnderlyingGraph(srcM.getGraph());
        if (subsumes(g, sg)) {
            return destM;
        }
        if (!(g instanceof MultiUnion)) {
            return createModelForGraph((Graph)new MultiUnion(new Graph[] { g, sg }));
        }
        if (g == sg) {
            return destM;
        }
        ((MultiUnion)g).addGraph(sg);
        return destM;
    }
    
    private static boolean subsumes(Graph g, Graph sg) {
        g = RepoOper.getUnderlyingGraph(g);
        sg = getUnderlyingGraph(sg);
        return subsumes0(g, sg);
    }
    
    private static boolean subsumes0(final Graph g, final Graph sg) {
        final ArrayList<Graph> gl = new ArrayList<Graph>();
        RepoOper.addConstituentGraphs(g, (Collection)gl, true);
        return gl.contains(sg);
    }
    
    static {
        RepoDatasetFactory.theLogger = LoggerFactory.getLogger((Class)RepoDatasetFactory.class);
        RepoDatasetFactory.allModelNoDelete = false;
        RepoDatasetFactory.datasetNoDeleteModels = false;
        RepoDatasetFactory.allModelsTheSame = false;
        RepoDatasetFactory.alwaysShareDataset = false;
        RepoDatasetFactory.allwaysRenameModels = false;
        RepoDatasetFactory.DATASET_SHARE_NAME = "robot01";
        RepoDatasetFactory.DATASET_TYPE_UNSHARED = "memory";
        RepoDatasetFactory.DATASET_TYPE_DEFAULT = RepoDatasetFactory.DATASET_TYPE_UNSHARED;
        RepoDatasetFactory.DATASET_TYPE_SHARED = "shared";
        datasetClassTypesMap = new HashMap<String, String>();
        RepoDatasetFactory.globalDS = null;
        RepoDatasetFactory.serialNumber = 111666L;
        jenaSDBDatasetFactory = (UserDatasetFactory)new JenaSDBWrappedDatasetFactory();
        jenaUnsharedMemoryDatasetFactory = (UserDatasetFactory)new JenaDatasetFactory();
        registeredUserDatasetFactoryByName = new HashMap<String, UserDatasetFactory>();
        registeredUserDatasetFactorys = new ArrayList<UserDatasetFactory>();
        RepoDatasetFactory.STORE_CONFIG_PATH = DemoResources.STORE_CONFIG_PATH;
        RepoDatasetFactory.universalModel = null;
        registerDatasetFactory("default", RepoDatasetFactory.jenaUnsharedMemoryDatasetFactory);
        registerDatasetFactory("jena", RepoDatasetFactory.jenaUnsharedMemoryDatasetFactory);
        registerDatasetFactory("memory", RepoDatasetFactory.jenaUnsharedMemoryDatasetFactory);
        registerDatasetFactory("instance", RepoDatasetFactory.jenaSDBDatasetFactory);
        registerDatasetFactory("database", RepoDatasetFactory.jenaSDBDatasetFactory);
        registerDatasetFactory("shared", RepoDatasetFactory.jenaSDBDatasetFactory);
        registerDatasetFactory("memory", RepoDatasetFactory.jenaUnsharedMemoryDatasetFactory);
        registerDatasetFactory("shared", RepoDatasetFactory.jenaSDBDatasetFactory);
    }
}

/*

	Total time: 97 ms
	
*/