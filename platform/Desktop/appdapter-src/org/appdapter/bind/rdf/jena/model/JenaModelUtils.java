package org.appdapter.bind.rdf.jena.model;

import org.slf4j.LoggerFactory;
import org.appdapter.core.name.Ident;
import com.hp.hpl.jena.graph.Graph;
import org.appdapter.core.item.JenaResourceItem;
import org.appdapter.core.convert.Converter;
import com.hp.hpl.jena.rdf.model.ResourceFactory;
import com.hp.hpl.jena.graph.Node;
import com.hp.hpl.jena.util.iterator.Filter;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.ontology.OntModelSpec;
import org.appdapter.core.store.dataset.RepoDatasetFactory;
import java.io.InputStream;
import java.net.URL;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.rdf.model.StmtIterator;
import com.hp.hpl.jena.util.iterator.ExtendedIterator;
import com.hp.hpl.jena.util.PrintUtil;
import java.util.Iterator;
import java.util.Map;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.ontology.ObjectProperty;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.ontology.DatatypeProperty;
import com.hp.hpl.jena.ontology.Individual;
import org.slf4j.Logger;
import org.appdapter.core.debug.UIAnnotations;

@UIAnnotations.UISalient
public class JenaModelUtils implements UIAnnotations.UtilClass
{
    private static Logger theLogger;

    public static void logDebug(final String s) {
        JenaModelUtils.theLogger.debug(s);
    }

    public static void logError(final String s) {
        JenaModelUtils.theLogger.error(s);
    }

    public static String getStringPropertyValue(final Individual i, final DatatypeProperty dp) throws Throwable {
        String result = null;
        final RDFNode rdfnode = i.getPropertyValue((Property)dp);
        if (rdfnode != null) {
            final Literal lit = (Literal)rdfnode.as((Class)Literal.class);
            result = lit.getString();
        }
        return result;
    }

    public static Individual getChildIndividual(final Individual p, final ObjectProperty op) throws Throwable {
        Individual result = null;
        final RDFNode childRDFNode = p.getPropertyValue((Property)op);
        if (childRDFNode != null) {
            result = (Individual)childRDFNode.as((Class)Individual.class);
        }
        return result;
    }

    public static void dumpPrefixes(final Model m) throws Throwable {
        final Map pmap = m.getNsPrefixMap();
        for (final Object key : pmap.keySet()) {
            final String val = (String) pmap.get(key);
            logDebug("Prefix " + key + " is mapped to URI " + val);
        }
    }

    public static void printIndividualDebug(final Individual i) {
        logDebug("individual.toString(): " + i.toString());
        logDebug("individual.localName(): " + i.getLocalName());
        final ExtendedIterator it = i.listRDFTypes(false);
        while (it.hasNext()) {
            final Object o = it.next();
            logDebug("PSOP-INFO: Found RDF:type with java-class, toString(): " + o.getClass().getName() + ", " + o);
        }
        final StmtIterator pi = i.listProperties();
        while (pi.hasNext()) {
            final Statement s = pi.nextStatement();
            logDebug("PSOP-INFO: Found op property statement: " + PrintUtil.print(s));
        }
    }

    public static void printOntClassStats(final OntModel om, final String classURI) {
        logDebug("classURI=" + classURI);
        final OntClass ontClass = om.getOntClass(classURI);
        if (ontClass != null) {
            printIterator((Iterator)ontClass.listSuperClasses(), "All super classes of " + ontClass.getLocalName());
            printIterator((Iterator)ontClass.listSuperClasses(true), "Direct superclasses of " + ontClass.getLocalName());
        }
        else {
            logDebug("printOntClassStats-ERROR, can't find ontclass at " + classURI);
        }
    }

    public static void printIterator(final Iterator i, final String header) {
        final StringBuffer buf = new StringBuffer(header);
        for (int c = 0; c < header.length(); ++c) {
            buf.append("=");
        }
        logDebug(buf.toString());
        if (i.hasNext()) {
            while (i.hasNext()) {
                logDebug(i.next().toString());
            }
        }
        else {
            logDebug("<EMPTY>");
        }
        logDebug("");
    }

    public static URL getResourceURL(final String resourcePath, final Class resourceOwner) throws Throwable {
        final ClassLoader loader = resourceOwner.getClassLoader();
        logDebug("[JenaModelUtils.getResourceURL] seeking " + resourcePath);
        final URL resourceURL = loader.getResource(resourcePath);
        if (resourceURL == null) {
            logError("[JenaModelUtils.getResourceURL] FAILED TO FIND : " + resourcePath);
        }
        else {
            logDebug("[JenaModelUtils.getResourceURL] got resource url: " + resourceURL);
        }
        return resourceURL;
    }

    public static Model loadJenaModelFromXmlSerialStream(final InputStream xmlInputStream, final String modelBaseURI) throws Throwable {
        final Model model = RepoDatasetFactory.createDefaultModel();
        model.read(xmlInputStream, modelBaseURI);
        return model;
    }

    public static OntModel loadRDFS_ModelFromStream(final InputStream modelInputStream, final String modelBaseURI) throws Throwable {
        final Model baseModel = RepoDatasetFactory.createDefaultModel();
        baseModel.read(modelInputStream, modelBaseURI);
        final OntModel ontModel = ModelFactory.createOntologyModel(OntModelSpec.RDFS_MEM_RDFS_INF, baseModel);
        return ontModel;
    }

    public static Model makeNaiveCopy(final Model in) {
        final Model out = RepoDatasetFactory.createDefaultModel();
        out.add(in);
        return out;
    }

    @UIAnnotations.UISalient(UseOptionalArgs = 1)
    public static List<Statement> findExentOfNodeInModels(final Resource r, final Collection<Model> searchThese) {
        final ArrayList<Statement> found = new ArrayList<Statement>();
        final Collection<Model> foundIn = findModelsWithNode(r, searchThese);
        final Node n0 = r.asNode();
        for (final Model m : foundIn) {
            for (final Object s : m.listStatements().filterKeep((Filter)new Filter<Statement>() {

                public boolean accept(final Statement arg0) {
                    return n0.equals((Object)arg0.getSubject().asNode()) ||
                    		n0.equals((Object)arg0.getPredicate().asNode()) ||
                    		n0.equals((Object)arg0.getObject().asNode());
                }
            }).toList()) {
                found.add((Statement) s);
            }
        }
        return found;
    }

    @UIAnnotations.UISalient
    public static List<Model> findModelsWithNode(final Resource r, final Collection<Model> searchThese) {
        final ArrayList<Model> foundIn = new ArrayList<Model>();
        for (final Model m : searchThese) {
            if (m.containsResource((RDFNode)r)) {
                foundIn.add(m);
            }
        }
        return foundIn;
    }

    @Converter.ConverterMethod
    public static Resource makeUnattachedResource(final String uri) {
        return ResourceFactory.createResource(uri);
    }

    @Converter.ConverterMethod
    public static Model toModel(final JenaResourceItem item) {
        return item.getModel();
    }

    @Converter.ConverterMethod
    public static Resource toResource(final JenaResourceItem item) {
        return item.getJenaResource();
    }

    @Converter.ConverterMethod
    public static Model toModel(final Resource item) {
        return item.getModel();
    }

    @Converter.ConverterMethod
    public static Graph toGraph(final Model item) {
        return item.getGraph();
    }

    @Converter.ConverterMethod
    public static Collection<Statement> toStatements(final Model item) {
        return (Collection<Statement>)item.listStatements().toList();
    }

    @Converter.ConverterMethod
    public static Ident toIdent(final Resource item) {
        return (Ident)new JenaResourceItem(item);
    }

    static {
        JenaModelUtils.theLogger = LoggerFactory.getLogger((Class)JenaModelUtils.class);
    }
}

/*

	Total time: 59 ms

*/