package org.appdapter.core.remote.sparql;

import org.apache.commons.logging.LogFactory;
import com.hp.hpl.jena.graph.GraphUtil;
import com.hp.hpl.jena.util.iterator.ExtendedIterator;
import com.hp.hpl.jena.graph.GraphEvents;
import java.io.Writer;
import java.io.StringWriter;
import com.hp.hpl.jena.graph.Node;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.rdf.model.StmtIterator;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Model;
import java.util.Iterator;
import java.util.List;
import com.hp.hpl.jena.graph.Graph;
import com.hp.hpl.jena.sparql.graph.GraphFactory;
import com.hp.hpl.jena.graph.Triple;
import com.hp.hpl.jena.graph.impl.GraphWithPerform;
import org.apache.commons.logging.Log;
import com.hp.hpl.jena.graph.impl.SimpleBulkUpdateHandler;

public class SparqlGraphBulkUpdater extends SimpleBulkUpdateHandler
{
    private static final Log log;
    private SparqlGraph graph;
    
    public SparqlGraphBulkUpdater(final SparqlGraph graph) {
        super((GraphWithPerform)graph);
        this.graph = graph;
    }
    
    public void add(final Triple[] arg0) {
        final Graph g = GraphFactory.createPlainGraph();
        for (int i = 0; i < arg0.length; ++i) {
            g.add(arg0[i]);
        }
        this.add(g);
    }
    
    public void add(final List<Triple> arg0) {
        final Graph g = GraphFactory.createPlainGraph();
        for (final Triple t : arg0) {
            g.add(t);
        }
        this.add(g);
    }
    
    public void add(final Iterator<Triple> arg0) {
        final Graph g = GraphFactory.createPlainGraph();
        while (arg0.hasNext()) {
            final Triple t = arg0.next();
            g.add(t);
        }
        this.add(g);
    }
    
    public void add(final Graph arg0) {
        this.add(arg0, false);
    }
    
    public void add(final Graph g, final boolean arg1) {
        SparqlGraphBulkUpdater.log.info((Object)"adding graph");
        final Model[] model = this.separateStatementsWithBlankNodes(g);
        this.addModel(model[1]);
        this.addModel(model[0]);
    }
    
    private Model[] separateStatementsWithBlankNodes(final Graph g) {
        final Model gm = ModelFactory.createModelForGraph(g);
        final Model blankNodeModel = ModelFactory.createDefaultModel();
        final Model nonBlankNodeModel = ModelFactory.createDefaultModel();
        final StmtIterator sit = gm.listStatements();
        while (sit.hasNext()) {
            final Statement stmt = sit.nextStatement();
            if (!stmt.getSubject().isAnon() && !stmt.getObject().isAnon()) {
                nonBlankNodeModel.add(stmt);
            }
            else {
                blankNodeModel.add(stmt);
            }
        }
        final Model[] result = { blankNodeModel, nonBlankNodeModel };
        return result;
    }
    
    public void delete(final Graph g, final boolean withReifications) {
        this.delete(g);
    }
    
    public void delete(final Graph g) {
        final Model[] model = this.separateStatementsWithBlankNodes(g);
        this.deleteModel(model[1]);
        final StringBuffer patternBuff = new StringBuffer();
        final Iterator<Triple> tripIt = (Iterator<Triple>)g.find((Node)null, (Node)null, (Node)null);
        while (tripIt.hasNext()) {
            final Triple t = tripIt.next();
            patternBuff.append(SparqlGraph.sparqlNodeDelete(t.getSubject(), (String)null));
            patternBuff.append(" ");
            patternBuff.append(SparqlGraph.sparqlNodeDelete(t.getPredicate(), (String)null));
            patternBuff.append(" ");
            patternBuff.append(SparqlGraph.sparqlNodeDelete(t.getObject(), (String)null));
            patternBuff.append(" .\n");
        }
        final StringBuffer queryBuff = new StringBuffer();
        final String graphURI = this.graph.getGraphURI();
        queryBuff.append("DELETE { " + ((graphURI != null) ? ("GRAPH <" + graphURI + "> { ") : "") + " \n");
        queryBuff.append(patternBuff);
        if (graphURI != null) {
            queryBuff.append("    } \n");
        }
        queryBuff.append("} WHERE { \n");
        if (graphURI != null) {
            queryBuff.append("    GRAPH <" + graphURI + "> { \n");
        }
        queryBuff.append(patternBuff);
        if (graphURI != null) {
            queryBuff.append("    } \n");
        }
        queryBuff.append("} \n");
        SparqlGraphBulkUpdater.log.debug((Object)queryBuff.toString());
        this.graph.executeUpdate(queryBuff.toString());
    }
    
    public void addModel(final Model model) {
        this.verbModel(model, "INSERT");
    }
    
    public void deleteModel(final Model model) {
        this.verbModel(model, "DELETE");
    }
    
    private void verbModel(final Model model, final String verb) {
        final Model m = ModelFactory.createDefaultModel();
        final int testLimit = 1000;
        final StmtIterator stmtIt = model.listStatements();
        int count = 0;
        try {
            while (stmtIt.hasNext()) {
                ++count;
                m.add(stmtIt.nextStatement());
                if (count % testLimit == 0 || !stmtIt.hasNext()) {
                    final StringWriter sw = new StringWriter();
                    m.write((Writer)sw, "N-TRIPLE");
                    final StringBuffer updateStringBuff = new StringBuffer();
                    final String graphURI = this.graph.getGraphURI();
                    updateStringBuff.append(verb + " DATA { " + ((graphURI != null) ? ("GRAPH <" + graphURI + "> { ") : ""));
                    updateStringBuff.append(sw);
                    updateStringBuff.append(((graphURI != null) ? " } " : "") + " }");
                    final String updateString = updateStringBuff.toString();
                    this.graph.executeUpdate(updateString);
                    m.removeAll();
                }
            }
        }
        finally {
            stmtIt.close();
        }
    }
    
    public void removeAll() {
        removeAll((Graph)this.graph);
        this.notifyRemoveAll();
    }
    
    protected void notifyRemoveAll() {
        this.manager.notifyEvent((Graph)this.graph, (Object)GraphEvents.removeAll);
    }
    
    public void remove(final Node s, final Node p, final Node o) {
        removeAll((Graph)this.graph, s, p, o);
        this.manager.notifyEvent((Graph)this.graph, (Object)GraphEvents.remove(s, p, o));
    }
    
    public static void removeAll(final Graph g, final Node s, final Node p, final Node o) {
        final ExtendedIterator<Triple> it = (ExtendedIterator<Triple>)g.find(s, p, o);
        try {
            while (it.hasNext()) {
                final Triple t = (Triple)it.next();
                g.delete(t);
                it.remove();
            }
        }
        finally {
            it.close();
        }
    }
    
    public static void removeAll(final Graph g) {
        final ExtendedIterator<Triple> it = (ExtendedIterator<Triple>)GraphUtil.findAll(g);
        try {
            while (it.hasNext()) {
                final Triple t = (Triple)it.next();
                g.delete(t);
                it.remove();
            }
        }
        finally {
            it.close();
        }
        if (g instanceof SparqlGraph) {
            ((SparqlGraph)g).removeAll();
        }
    }
    
    static {
        log = LogFactory.getLog((Class)SparqlGraphBulkUpdater.class);
    }
}

/*

	Total time: 60 ms
	
*/