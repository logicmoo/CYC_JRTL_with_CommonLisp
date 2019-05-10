package org.appdapter.core.store;

import org.appdapter.api.trigger.Box;
import org.appdapter.demo.DemoResources;
import org.appdapter.trigger.bind.jena.TriggerImpl;
import org.slf4j.LoggerFactory;
import org.apache.jena.riot.Lang;
import java.io.StringWriter;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.riot.RDFFormat;
import org.appdapter.core.store.dataset.CheckedGraph;
import com.hp.hpl.jena.n3.N3JenaWriterPP;
import com.hp.hpl.jena.graph.compose.Polyadic;
import com.hp.hpl.jena.graph.compose.Dyadic;
import com.hp.hpl.jena.graph.compose.CompositionBase;
import com.hp.hpl.jena.sparql.core.DatasetGraph;
import java.util.Set;
import java.util.ArrayList;
import com.hp.hpl.jena.graph.Triple;
import com.hp.hpl.jena.graph.NodeFactory;
import com.hp.hpl.jena.sparql.graph.GraphFactory;
import java.io.Writer;
import java.io.PrintWriter;
import com.hp.hpl.jena.vocabulary.RDF;
import java.util.Collection;
import com.hp.hpl.jena.shared.impl.PrefixMappingImpl;
import com.hp.hpl.jena.graph.Node;
import java.io.FileWriter;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.File;
import org.appdapter.core.store.dataset.UserDatasetFactory;
import java.util.Enumeration;
import java.util.HashSet;
import com.hp.hpl.jena.shared.Lock;
import com.hp.hpl.jena.shared.PrefixMapping;
import java.io.IOException;
import java.util.Iterator;
import java.io.InputStream;
import org.appdapter.fileconv.FileStreamUtils;
import java.io.Reader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.List;
import com.hp.hpl.jena.rdf.model.ModelChangedListener;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Statement;
import java.util.Map;
import com.hp.hpl.jena.rdf.listeners.StatementListener;
import java.util.HashMap;
import com.hp.hpl.jena.query.DatasetFactory;
import org.appdapter.core.log.Debuggable;
import com.hp.hpl.jena.rdf.model.Resource;
import org.appdapter.core.store.dataset.RepoDatasetFactory;
import com.hp.hpl.jena.graph.Graph;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.graph.compose.MultiUnion;
import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.rdf.model.Model;
import org.slf4j.Logger;
import org.appdapter.core.debug.UIAnnotations;
import org.appdapter.api.trigger.AnyOper;

@UIAnnotations.UIHidden
public class RepoOper implements AnyOper, UIAnnotations.UtilClass
{
    static Logger theLogger;
    @UIAnnotations.UISalient
    public static boolean inPlaceReplacements;
    @UIAnnotations.UISalient(Description = "isMergeDefault means addModelToDataset with some data will add withotu replacing")
    public static boolean isMergeDefault;
    
    @UIAnnotations.UISalient
    public static void replaceModelElements(final Model dest, final Model src) {
        addModelElements(dest, src, true);
    }
    
    @UIAnnotations.UISalient
    public static void addModelElements(final Model dest, final Model src, final boolean clearFirst) {
        if (src == dest) {
            return;
        }
        if (clearFirst) {
            dest.removeAll();
        }
        dest.add(src);
        dest.setNsPrefixes(src.getNsPrefixMap());
    }
    
    public static Model unionAll(final Dataset ds, final Model... more) {
        final Graph[] gs = getAllGraphs(ds, more);
        final Model m = ModelFactory.createModelForGraph((Graph)new MultiUnion(gs));
        return m;
    }
    
    public static void addUnionModel(final Dataset ds, String src, String dest) {
        src = correctModelName(src);
        dest = correctModelName(dest);
        Model destM = ds.getNamedModel(dest);
        final Model srcM = ds.getNamedModel(src);
        if (destM == srcM) {
            return;
        }
        if (srcM == null) {
            throw new RuntimeException("Missing Model named: " + srcM);
        }
        if (destM == null) {
            destM = RepoDatasetFactory.createGroup(srcM);
            ds.addNamedModel(dest, destM);
        }
        else {
            destM = RepoDatasetFactory.createGroup(destM, srcM);
            RepoOper.theLogger.info("Made Merged Model from " + src + " and " + dest);
            ds.replaceNamedModel(dest, destM);
        }
    }
    
    public static void replaceSingleDatasetModel(final Dataset dest, final Dataset src, String onlyModel) {
        onlyModel = correctModelName(onlyModel);
        putSingleOrAllDatasetModel(dest, src, onlyModel, true);
    }
    
    public static String correctModelName(final String onlyModel) {
        return RepoDatasetFactory.correctModelName(onlyModel).getURI();
    }
    
    public static void putSingleDatasetModel(final Dataset dest, final Dataset src, final String onlyModel, final Resource unionOrReplace) {
        putSingleOrAllDatasetModel(dest, src, onlyModel, isReplace(unionOrReplace));
    }
    
    public static void putAllDatasetModels(final Dataset dest, final Dataset src, final Resource unionOrReplace) {
        putSingleOrAllDatasetModel(dest, src, null, isReplace(unionOrReplace));
    }
    
    private static void putSingleOrAllDatasetModel(final Dataset dest, final Dataset src, String onlyModel, final boolean isReplace) {
        if (onlyModel == null) {
            Debuggable.notImplemented(new Object[] { "putAllDatasetModels..." });
        }
        onlyModel = correctModelName(onlyModel);
        if (!(dest instanceof Dataset)) {
            RepoOper.theLogger.error("Destination is not a datasource! " + dest.getClass() + " " + dest);
            return;
        }
        boolean onSrc = true;
        boolean onDest = true;
        if (!dest.containsNamedModel(onlyModel)) {
            onSrc = false;
            RepoOper.theLogger.warn("Orginal did not contain model" + onlyModel);
        }
        if (!src.containsNamedModel(onlyModel)) {
            onDest = false;
            RepoOper.theLogger.warn("New did not contain model " + onlyModel);
        }
        if (onSrc && onDest) {
            final Model destModel = src.getNamedModel(onlyModel);
            final Model srcModel = dest.getNamedModel(onlyModel);
            addModelElements(destModel, srcModel, isReplace);
            RepoOper.theLogger.info("Replaced model " + onlyModel);
            return;
        }
        if (onSrc) {
            dest.addNamedModel(onlyModel, src.getNamedModel(onlyModel));
            RepoOper.theLogger.info("Added model " + onlyModel);
            return;
        }
        if (onDest) {
            if (isReplace) {
                dest.getNamedModel(onlyModel).removeAll();
                RepoOper.theLogger.info("clearing model " + onlyModel);
            }
        }
    }
    
    public static void readDatasetFromURL(final String srcPath, final Dataset target, final Resource unionOrReplace) throws IOException {
        final Model loaderModel = RepoDatasetFactory.createPrivateMemModel();
        final Dataset loaderDataset = DatasetFactory.createMem();
        Model m = loaderDataset.getDefaultModel();
        if (m == null) {
            m = RepoDatasetFactory.createPrivateMemModel();
            loaderDataset.setDefaultModel(m);
        }
        final Model[] currentModel = { m, null, null };
        final String[] modelName = { "" };
        final Map<String, Model> constits = new HashMap<String, Model>();
        loaderModel.register((ModelChangedListener)new StatementListener() {
            @Override
			public void addedStatement(final Statement arg0) {
                System.out.println("Adding statement: " + arg0);
                final String subjStr = "" + arg0.getSubject();
                if (subjStr.equals("self")) {
                    final RDFNode r = arg0.getObject();
                    if (r.isLiteral()) {
                        final String[] val$modelName = modelName;
                        final int n = 0;
                        final String string = r.asLiteral().getString();
                        val$modelName[n] = string;
                        final String baseURI = string;
                        (currentModel[0] = RepoDatasetFactory.createPrivateMemModel()).setNsPrefix("", baseURI);
                    }
                    else if (r.isResource()) {
                        final Resource rs = r.asResource();
                        final String type = rs.getLocalName();
                        final Model newModel = currentModel[0];
                        newModel.setNsPrefixes(loaderModel.getNsPrefixMap());
                        if (type.equals("DirectoryModel")) {
                            currentModel[1] = currentModel[0];
                        }
                        else if (type.equals("RepoSheetModel")) {
                            constits.put(modelName[0], currentModel[0]);
                        }
                        else if (type.equals("DatasetDefaultModel")) {
                            currentModel[2] = currentModel[0];
                        }
                    }
                }
                else {
                    currentModel[0].add(arg0);
                }
            }
        });
        final FileStreamUtils fus = (FileStreamUtils)new ExtendedFileStreamUtils();
        final InputStream fis = fus.openInputStream(srcPath, (List)null);
        final InputStreamReader isr = new InputStreamReader(fis, Charset.defaultCharset().name());
        loaderModel.read((Reader)isr, (String)null, "TTL");
        if (currentModel[2] != null) {
            loaderDataset.setDefaultModel(currentModel[2]);
        }
        for (final Map.Entry<String, Model> entry : constits.entrySet()) {
            loaderDataset.addNamedModel((String)entry.getKey(), (Model)entry.getValue());
        }
        putAllDatasetModels(target, loaderDataset, unionOrReplace);
    }
    
    public static void putNamedModel(final Dataset dest, String urlModel, final Model model, final Resource unionOrReplace) {
        boolean isReplace = isReplace(unionOrReplace);
        urlModel = correctModelName(urlModel);
        final Lock lock = dest.getLock();
        lock.enterCriticalSection(false);
        Lock oldLock = null;
        model.enterCriticalSection(true);
        try {
            final long size = model.size();
            boolean onDest = true;
            if (!dest.containsNamedModel(urlModel)) {
                onDest = false;
            }
            if (!onDest) {
                dest.addNamedModel(urlModel, model);
                RepoOper.theLogger.info("Added new model " + urlModel + " size=" + size);
                return;
            }
            final Model old = dest.getNamedModel(urlModel);
            if (old == model) {
                RepoOper.theLogger.info("Nothing to do.. same model " + urlModel + " size=" + size);
                return;
            }
            oldLock = old.getLock();
            oldLock.enterCriticalSection(false);
            long sizeBefore = old.size();
            if (RepoOper.inPlaceReplacements) {
                old.removeAll();
                RepoOper.theLogger.info("In place (Replacing) old model " + urlModel + " size=" + sizeBefore + "-> " + old.size());
                isReplace = false;
            }
            if (!isReplace) {
                sizeBefore = old.size();
                old.add(model);
                if (!old.samePrefixMappingAs((PrefixMapping)model)) {
                    old.withDefaultMappings((PrefixMapping)model);
                }
                final long sizeNow = old.size();
                RepoOper.theLogger.info("Merging into old model " + urlModel + " size(" + sizeBefore + "+" + model.size() + ")->" + sizeNow);
                RepoDatasetFactory.invalidateModel(model);
                return;
            }
            RepoDatasetFactory.invalidateModel(old);
            RepoOper.theLogger.info("Replacing old model " + urlModel + " size=" + sizeBefore + "->" + model.size());
            dest.replaceNamedModel(urlModel, model);
        }
        finally {
            if (oldLock != null) {
                oldLock.leaveCriticalSection();
            }
            if (model != null) {
                model.leaveCriticalSection();
            }
            if (lock != null) {
                lock.leaveCriticalSection();
            }
        }
    }
    
    public static void clearAll(final Dataset ds) {
        final Model dModel = ds.getDefaultModel();
        removeAll(dModel);
        final Iterator<String> sIterator = (Iterator<String>)ds.listNames();
        while (sIterator.hasNext()) {
            final String mName = sIterator.next();
            final Model model = ds.getNamedModel(mName);
            removeAll(model);
        }
    }
    
    private static void removeAll(final Model model) {
        if (model == null || model.size() == 0L) {
            return;
        }
        model.removeAll();
    }
    
    private static boolean isReplace(final Resource unionOrReplace) {
        boolean isReplace = !RepoOper.isMergeDefault;
        if (unionOrReplace != null) {
            RepoOper.theLogger.warn("Found union/replace = " + unionOrReplace);
            if (unionOrReplace.getLocalName().equals("Union")) {
                isReplace = false;
            }
        }
        return isReplace;
    }
    
    public static void replaceDatasetElements(final Dataset dest, final Dataset src) {
        addOrReplaceDatasetElements(dest, src, null);
    }
    
    public static void addOrReplaceDatasetElements(final Dataset dest, final Dataset src, final Resource unionOrReplace) {
        if (!(dest instanceof Dataset)) {
            RepoOper.theLogger.error("Destination is not a datasource! " + dest.getClass() + " " + dest);
            return;
        }
        final Model defDestModel = dest.getDefaultModel();
        final Model defSrcModel = src.getDefaultModel();
        final boolean isReplace = isReplace(unionOrReplace);
        addModelElements(defDestModel, defSrcModel, isReplace);
        final HashSet<String> dnames = setOF((Iterator<String>)dest.listNames());
        final HashSet<String> snames = setOF((Iterator<String>)src.listNames());
        final HashSet<String> replacedModels = new HashSet<String>();
        for (final String nym : snames) {
            final Model getsrc = src.getNamedModel(nym);
            if (dest.containsNamedModel(nym)) {
                final Model getdest = dest.getNamedModel(nym);
                replacedModels.add(nym);
                addModelElements(getdest, getsrc, isReplace);
                dnames.remove(nym);
            }
        }
        for (final String nym : replacedModels) {
            snames.remove(nym);
        }
        if (dnames.size() == 0) {
            if (snames.size() == 0) {
                return;
            }
            for (final String nym : snames) {
                dest.addNamedModel(nym, src.getNamedModel(nym));
            }
        }
        else {
            if (snames.size() == 0) {
                for (final String nym : dnames) {
                    if (isReplace) {
                        dest.getNamedModel(nym).removeAll();
                        dest.removeNamedModel(nym);
                    }
                }
                return;
            }
            for (final String nym : dnames) {
                if (isReplace) {
                    dest.getNamedModel(nym).removeAll();
                    dest.removeNamedModel(nym);
                }
            }
            for (final String nym : snames) {
                dest.addNamedModel(nym, src.getNamedModel(nym));
            }
        }
    }
    
    public static <E> HashSet<E> setOF(final Enumeration<E> en) {
        final HashSet<E> hs = new HashSet<E>();
        while (en.hasMoreElements()) {
            final E e = en.nextElement();
            hs.add(e);
        }
        return hs;
    }
    
    public static <E> HashSet<E> setOF(final Iterator<E> en) {
        final HashSet<E> hs = new HashSet<E>();
        while (en.hasNext()) {
            final E e = en.next();
            hs.add(e);
        }
        return hs;
    }
    
    public static void registerDatasetFactory(final String datasetTypeName, final UserDatasetFactory factory) {
        RepoDatasetFactory.registerDatasetFactory(datasetTypeName, factory);
    }
    
    public static void writeRepoToDirectory(final Repo repo, final String dir, final boolean solidifyDerivedModels) throws IOException {
        if (!(repo instanceof Repo.WithDirectory)) {
            System.out.println("Not Repo.WithDirectory  " + repo.getClass() + " " + repo);
            return;
        }
        final Dataset ds = repo.getMainQueryDataset();
        final Model dirModel = ((Repo.WithDirectory)repo).getDirectoryModel();
        final String csiURI = dirModel.getNsPrefixURI("csi");
        new File(dir).mkdir();
        final FileWriter fw = null;
        final String rname = new SimpleDateFormat("yyyyMMddHH_mmss_SSS").format(new Date());
        final Node fileRepoName = dirModel.getResource(csiURI + "filerepo_" + rname).asNode();
        final Map<String, String> nsUsed = new HashMap<String, String>();
        saveRepoAsManyTTLs(fileRepoName, dir, nsUsed, dirModel, ds, false, solidifyDerivedModels);
    }
    
    public static void saveRepoAsManyTTLs(final Node fileRepoName, final String dir, final Map<String, String> nsUsed, final Model dirModel, final Dataset ds, final boolean dontChangeDirModel, final boolean solidifyDerivedModels) throws IOException {
        new File(dir).mkdir();
        final PrefixMappingImpl pm = new PrefixMappingImpl();
        pm.setNsPrefixes((Map)nsUsed);
        pm.withDefaultMappings(PrefixMappingImpl.Extended);
        final String ccrtNS = dirModel.getNsPrefixURI("ccrt");
        final Node fileRepo = dirModel.getResource(ccrtNS + "FileRepo").asNode();
        final Node fileModel = dirModel.getResource(ccrtNS + "FileModel").asNode();
        final Set<Node> sheetTypes = new HashSet<Node>();
        sheetTypes.add(fileModel);
        sheetTypes.add(dirModel.getResource(ccrtNS + "GoogSheet").asNode());
        sheetTypes.add(dirModel.getResource(ccrtNS + "XlsxSheet").asNode());
        sheetTypes.add(dirModel.getResource(ccrtNS + "CsvFileSheet").asNode());
        final Set<Node> sheetTypesToLocalize = new HashSet<Node>();
        sheetTypesToLocalize.addAll(sheetTypes);
        sheetTypesToLocalize.add(fileModel);
        final Node repo = dirModel.createProperty(ccrtNS, "repo").asNode();
        final Node rdftype = RDF.type.asNode();
        final Node sourcePath = dirModel.createProperty(ccrtNS, "sourcePath").asNode();
        final DatasetGraph dsg = ds.asDatasetGraph();
        final Model defaultModel = ds.getDefaultModel();
        Node defaultURI = null;
        pm.withDefaultMappings((PrefixMapping)dirModel);
        final Graph dirqGraph = dirModel.getGraph();
        final File file = new File(dir, dontChangeDirModel ? "dir.ttl" : "dir.old");
        file.getParentFile().mkdirs();
        final PrintWriter ow = new PrintWriter(file);
        ow.println("\n");
        writeModel(dirModel, ow, true, false, (PrefixMapping)pm);
        ow.println("\n");
        ow.println("# modelSize=" + dirModel.size() + "\n\n");
        ow.close();
        final Graph newGraph = GraphFactory.createGraphMem();
        newGraph.add(new Triple(fileRepoName, sourcePath, NodeFactory.createLiteral(dir)));
        newGraph.add(new Triple(fileRepoName, rdftype, fileRepo));
        final ArrayList<Node> derived = new ArrayList<Node>();
        final ArrayList<Node> sourceOf = new ArrayList<Node>();
        final ArrayList<Node> allNodes = new ArrayList<Node>();
        Iterator<Node> dni = (Iterator<Node>)dsg.listGraphNodes();
        while (dni.hasNext()) {
            final Node gname = dni.next();
            final String nodeName = gname.toString();
            if (nodeName != null && !nodeName.equals("#all")) {
                if (nodeName.startsWith("#")) {
                    continue;
                }
                allNodes.add(gname);
                final Model m = ds.getNamedModel(gname.toString());
                nsUsed.putAll(m.getNsPrefixMap());
                pm.withDefaultMappings((PrefixMapping)m);
                if (m == defaultModel) {
                    defaultURI = gname;
                }
                if (!isDerivedModel(m, ds)) {
                    continue;
                }
                derived.add(gname);
                final ArrayList<Node> named = new ArrayList<Node>();
                derivedFromModels(m, dsg, null, null, named);
                for (final Node s : named) {
                    sourceOf.add(s);
                }
            }
        }
        dni = (Iterator<Node>)ds.asDatasetGraph().listGraphNodes();
        while (dni.hasNext()) {
            final Node gname2 = dni.next();
            final String nodeName2 = gname2.toString();
            if (nodeName2 != null && !nodeName2.equals("#all")) {
                if (nodeName2.startsWith("#")) {
                    continue;
                }
                final String name = gname2.getLocalName();
                String filename = name + ".ttl";
                boolean addToDirModel = true;
                if (derived.contains(gname2) && !solidifyDerivedModels) {
                    filename = name + ".pipe_dest";
                    addToDirModel = false;
                }
                if (sourceOf.contains(gname2) && solidifyDerivedModels) {
                    filename = name + ".pipe_src";
                    addToDirModel = false;
                }
                final Model i = ds.getNamedModel(gname2.toString());
                for (final Triple was : dirqGraph.find(gname2, rdftype, Node.ANY).toList()) {
                    if (!sheetTypes.contains(was.getObject())) {
                        newGraph.add(was);
                    }
                    if (addToDirModel) {
                        newGraph.add(new Triple(gname2, repo, fileRepoName));
                        newGraph.add(new Triple(gname2, rdftype, fileModel));
                        newGraph.add(new Triple(gname2, sourcePath, NodeFactory.createLiteral(filename)));
                    }
                }
                final PrintWriter ow2 = new PrintWriter(new File(dir, filename));
                ow2.println("# modelName=" + gname2);
                if (i == defaultModel) {
                    defaultURI = gname2;
                    ow2.println("# isDefaultModel\n");
                }
                ow2.println("# modelSize=" + i.size() + "\n\n");
                if (derived.contains(gname2)) {
                    ow2.println("# derivedModel \n");
                    final ArrayList<Node> named2 = new ArrayList<Node>();
                    derivedFromModels(i, dsg, null, null, named2);
                    for (final Node s2 : named2) {
                        ow2.println("#  contains " + s2 + "");
                    }
                }
                ow2.println("\n");
                writeModel(i, ow2, true, true, (PrefixMapping)pm);
                ow2.println("\n");
                ow2.close();
            }
        }
        if (dirModel != null && !dontChangeDirModel) {
            final File file2 = new File(dir, "dir.ttl");
            final PrintWriter ow3 = new PrintWriter(file2);
            ow3.println("# load this with..  Repo repo = new UrlRepoSpec(\"" + file2.toURL() + "\").makeRepo();\n");
            ow3.println("\n");
            final Model j = RepoDatasetFactory.createPrivateMemModel();
            j.setNsPrefixes((PrefixMapping)dirModel);
            j.add(ModelFactory.createModelForGraph(newGraph));
            writeModel(j, ow3, true, false, (PrefixMapping)pm);
            ow3.println("\n");
            ow3.println("# modelSize=" + dirModel.size() + "\n\n");
            ow3.println("# dirModel = " + dirModel.size());
            if (defaultURI != null) {
                ow3.println("# defaultModel = " + defaultURI);
            }
            ow3.close();
        }
    }
    
    private static boolean isDerivedModel(final Model m, final Dataset ds) {
        final Graph g = getUnderlyingGraph(m.getGraph());
        return g instanceof CompositionBase;
    }
    
    private static void derivedFromModels(final Model m0, final DatasetGraph ds, final List<Graph> ums, List<Object> list, final List<Node> named) {
        if (list == null) {
            list = new ArrayList<Object>();
        }
        final Graph i = getUnderlyingGraph(m0.getGraph());
        addConstituentGraphs(i, list);
        list.remove(i);
        if (list.size() == 0) {
            return;
        }
        final Iterator<Node> ims = (Iterator<Node>)ds.listGraphNodes();
        while (ims.hasNext()) {
            final Node name = ims.next();
            if (named != null && named.contains(name)) {
                continue;
            }
            final Graph min = getUnderlyingGraph(ds.getGraph(name));
            if (i == min) {
                continue;
            }
            if (ums != null && ums.contains(min)) {
                continue;
            }
            if (!list.contains(getUnderlyingGraph(min))) {
                continue;
            }
            if (ums != null) {
                ums.add(min);
            }
            if (named == null) {
                continue;
            }
            named.add(name);
        }
    }
    
    public static void addConstituentGraphs(final Graph g, final Collection list) {
        addConstituentGraphs(g, list, false);
    }
    
    public static void addConstituentGraphs(final Graph g, final Collection list, final boolean retainMultis) {
        if (g == null || list.contains(g)) {
            return;
        }
        boolean retainG = false;
        try {
            list.add(g);
            if (g instanceof Dyadic) {
                addConstituentGraphs((Graph)((Dyadic)g).getL(), list);
                addConstituentGraphs((Graph)((Dyadic)g).getR(), list);
                if (retainMultis) {
                    retainG = true;
                }
                return;
            }
            if (g instanceof Polyadic) {
                for (final Graph g2 : ((Polyadic)g).getSubGraphs()) {
                    addConstituentGraphs(g2, list);
                }
                if (retainMultis) {
                    retainG = true;
                }
                return;
            }
            final Graph ug = getUnderlyingGraph(g);
            if (ug != g) {
                addConstituentGraphs(ug, list);
            }
            else {
                retainG = true;
            }
        }
        finally {
            if (!retainG) {
                list.remove(g);
            }
        }
    }
    
    public static void writeModel(final Model m, final Writer ow, final boolean includeNamespaces, final boolean trimNamepaces, final PrefixMapping pm) throws IOException {
        final Graph graph = getUnderlyingGraph(m.getGraph());
        if (graph instanceof CompositionBase) {
            ow.write("# CompositionBase = " + graph.getClass() + "\n");
        }
        final Model m2 = ModelFactory.createDefaultModel();
        final List<Statement> stmts = (List<Statement>)m.listStatements().toList();
        final HashMap<String, RDFNode> usedNS = new HashMap<String, RDFNode>();
        for (final Statement stmt : stmts) {
            addNamespace(usedNS, (RDFNode)stmt.getSubject());
            addNamespace(usedNS, (RDFNode)stmt.getPredicate());
            addNamespace(usedNS, stmt.getObject());
        }
        final int size0 = usedNS.size();
        for (final RDFNode s : m.listSubjects().toSet()) {
            addNamespace(usedNS, s);
        }
        for (final RDFNode s : m.listObjects().toSet()) {
            addNamespace(usedNS, s);
        }
        final int size2 = usedNS.size();
        if (size0 != size2) {
            Debuggable.oldBug(ow, "# nssize0 = " + size0 + "\n", new Object[0]);
            Debuggable.oldBug(ow, "# nssize1 = " + size2 + "\n", new Object[0]);
        }
        for (String ns : usedNS.keySet()) {
            String prefix = m.getNsURIPrefix(ns);
            final String why = "" + usedNS.get(ns);
            if (prefix == null) {
                prefix = pm.getNsURIPrefix(ns);
            }
            if (prefix == null && ns.endsWith(":")) {
                Debuggable.oldBug(ow, "# ODD ns namespace ref " + ns + " caused by " + why + " writing " + ow, new Object[0]);
                prefix = ns.substring(0, ns.length() - 1);
                ns = pm.getNsURIPrefix(prefix);
            }
            if (ns == null || prefix == null) {
                Debuggable.oldBug(ow, "# missing namespace ref for " + prefix + "=" + ns + " caused by " + why, new Object[0]);
            }
            else {
                m2.setNsPrefix(prefix, ns);
            }
        }
        m2.add(m);
        if (!trimNamepaces) {
            m2.withDefaultMappings((PrefixMapping)m);
        }
        final N3JenaWriterPP jenaWriter = (N3JenaWriterPP)new RDFSortedWriter(includeNamespaces);
        jenaWriter.write(m2, ow, "TTL");
    }
    
    private static void addNamespace(final HashMap<String, RDFNode> usedNS, final RDFNode n) {
        if (n == null) {
            return;
        }
        if (n.isURIResource()) {
            final String ns = n.asResource().getNameSpace();
            if (ns != null) {
                usedNS.put(ns, n);
            }
        }
        if (n.isLiteral() && n.asLiteral().getDatatype() != null) {
            usedNS.put("http://www.w3.org/2001/XMLSchema#", n);
        }
    }
    
    public static Graph getUnderlyingGraph(Graph graph) {
        while (graph instanceof CheckedGraph) {
            graph = ((CheckedGraph)graph).getDataGraph();
        }
        return graph;
    }
    
    public static void writeTriG(final Repo boundRepo, final Writer ow) throws IOException {
        final Dataset ds = boundRepo.getMainQueryDataset();
        final Dataset datasetw = DatasetFactory.create(ds);
        final Model defm = ds.getDefaultModel();
        Model dirModel = null;
        if (boundRepo instanceof Repo.WithDirectory) {
            dirModel = ((Repo.WithDirectory)boundRepo).getDirectoryModel();
        }
        if (dirModel != null) {
            datasetw.addNamedModel("#dir", dirModel);
        }
        RDFDataMgr.write(ow, datasetw.asDatasetGraph(), RDFFormat.TRIG);
    }
    
    public static String getBaseURI(final Model defaultModel, final String name) {
        String baseURI = defaultModel.getNsPrefixURI("");
        if (baseURI == null) {
            baseURI = name;
        }
        if (baseURI == null) {
            baseURI = "http://modelToOntoModel/modelToOntoModel_model_" + System.identityHashCode(defaultModel) + "#";
        }
        return baseURI;
    }
    
    public static String getModelSource(final Model boundModel) {
        final StringWriter writer = new StringWriter();
        final Map<String, String> pmap = (Map<String, String>)boundModel.getNsPrefixMap();
        boundModel.write((Writer)writer, "TTL");
        String turtle = writer.toString();
        for (final String prefix : pmap.keySet()) {
            final String uri = pmap.get(prefix);
            if (prefix.length() > 0) {
                final String remove = "\\@prefix " + prefix + "\\:.*\\<" + uri + "\\> .\n";
                turtle = turtle.replaceAll(remove, "");
            }
        }
        return turtle;
    }
    
    public static Model loadTTLReturnDirModel(final Dataset targetDataset, final InputStream fis) {
        RDFDataMgr.read(targetDataset, fis, Lang.TRIG);
        Model dirModel = targetDataset.getNamedModel("#dir");
        if (dirModel == null) {
            dirModel = targetDataset.getDefaultModel();
        }
        return dirModel;
    }
    
    protected static Model findOrCreate(final Dataset targetDataset, final String baseURI, final PrefixMapping nsMap) {
        if (targetDataset.containsNamedModel(baseURI)) {
            return targetDataset.getNamedModel(baseURI);
        }
        final Model newModel = RepoDatasetFactory.createPrivateMemModel();
        targetDataset.addNamedModel(baseURI, newModel);
        newModel.setNsPrefixes(nsMap);
        newModel.setNsPrefix("", baseURI);
        return newModel;
    }
    
    public static Model makeReadOnly(final Model model) {
        return model;
    }
    
    public static Graph[] getAllGraphs(final Dataset ds, final Model... more) {
        final Iterator<String> names = (Iterator<String>)ds.listNames();
        final Collection<Graph> grpGraph = new HashSet<Graph>();
        while (names.hasNext()) {
            final String nodeName = names.next();
            if (nodeName != null && !nodeName.equals("#all")) {
                if (nodeName.startsWith("#")) {
                    continue;
                }
                final Model m = ds.getNamedModel(nodeName);
                addConstituentGraphs(getUnderlyingGraph(m.getGraph()), grpGraph);
            }
        }
        for (final Model dm : more) {
            if (dm != null) {
                addConstituentGraphs(getUnderlyingGraph(dm.getGraph()), grpGraph);
            }
        }
        final Graph[] gs = grpGraph.toArray(new Graph[grpGraph.size()]);
        return gs;
    }
    
    static {
        RepoOper.theLogger = LoggerFactory.getLogger((Class)RepoOper.class);
        RepoOper.inPlaceReplacements = false;
        RepoOper.isMergeDefault = true;
    }
    
    public static class ReloadAllModelsTrigger<RB extends RepoBox<TriggerImpl<RB>>> extends TriggerImpl<RB>
    {
        Repo.WithDirectory m_repo;
        
        public ReloadAllModelsTrigger(final Repo.WithDirectory repo) {
            this.m_repo = repo;
        }
        
        @Override
		public void fire(final RB targetBox) {
            final String resolvedQueryURL = DemoResources.QUERY_PATH;
            ClassLoader optCL = this.getClass().getClassLoader();
            if (targetBox != null) {
                optCL = targetBox.getClass().getClassLoader();
            }
            if (!(this.m_repo instanceof ReloadableDataset)) {
                RepoOper.theLogger.error("Repo not reloadable! " + targetBox);
            }
            else {
                final ReloadableDataset reloadme = (ReloadableDataset)targetBox;
                reloadme.reloadAllModels();
            }
            final String resultXML = targetBox.processQueryAtUrlAndProduceXml(resolvedQueryURL, optCL);
            this.logInfo("ResultXML\n-----------------------------------" + resultXML + "\n---------------------------------");
        }
    }
    
    public static class ReloadSingleModelTrigger<RB extends RepoBox<TriggerImpl<RB>>> extends TriggerImpl<RB>
    {
        final String graphURI;
        final ReloadableDataset m_repo;
        
        public ReloadSingleModelTrigger(final String graphUri, final ReloadableDataset repo) {
            this.graphURI = graphUri;
            this.m_repo = repo;
        }
        
        @Override
		public void fire(final RB targetBox) {
            this.m_repo.reloadSingleModel(this.graphURI);
        }
    }
    
    @UIAnnotations.UISalient
    public interface ReloadableDataset
    {
        @UIAnnotations.UISalient(MenuName = "Reload Repo")
        void reloadAllModels();
        
        @UIAnnotations.UISalient
        void reloadSingleModel(final String p0);
        
        @UIAnnotations.UISalient(ToValueMethod = "toString")
        Dataset getMainQueryDataset();
        
        @UIAnnotations.UISalient(ToValueMethod = "toString")
        void setMyMainQueryDataset(final Dataset p0);
    }
    
    @UIAnnotations.UISalient
    public interface ISeeToString
    {
        @Override
		@UIAnnotations.UISalient(MenuName = "Call ToString")
        String toString();
    }
}

/*

	Total time: 214 ms
	
*/