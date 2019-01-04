package org.appdapter.core.remote.sparql;

import org.apache.commons.logging.LogFactory;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.sparql.resultset.ResultSetMem;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.graph.TransactionHandler;
import com.hp.hpl.jena.graph.GraphStatisticsHandler;
import com.hp.hpl.jena.graph.impl.SimpleEventManager;
import com.hp.hpl.jena.query.QuerySolution;
import java.util.List;
import com.hp.hpl.jena.query.ResultSet;
import java.util.Collections;
import com.hp.hpl.jena.util.iterator.SingletonIterator;
import java.util.Iterator;
import com.hp.hpl.jena.util.iterator.WrappedIterator;
import java.util.ArrayList;
import com.hp.hpl.jena.util.iterator.ExtendedIterator;
import com.hp.hpl.jena.graph.TripleMatch;
import com.hp.hpl.jena.shared.DeleteDeniedException;
import com.hp.hpl.jena.graph.Node;
import com.hp.hpl.jena.shared.AddDeniedException;
import com.hp.hpl.jena.graph.Triple;
import com.hp.hpl.jena.shared.impl.PrefixMappingImpl;
import com.hp.hpl.jena.graph.Capabilities;
import com.hp.hpl.jena.graph.GraphEventManager;
import com.hp.hpl.jena.shared.PrefixMapping;
import com.hp.hpl.jena.graph.BulkUpdateHandler;
import org.apache.commons.logging.Log;
import com.hp.hpl.jena.graph.Graph;
import com.hp.hpl.jena.graph.impl.GraphWithPerform;

public class SparqlGraph extends JenaWrappedGraph implements GraphWithPerform, Graph
{
    private String endpointURI;
    private String graphURI;
    private static final Log log;
    private BulkUpdateHandler bulkUpdateHandler;
    private PrefixMapping prefixMapping;
    private GraphEventManager eventManager;
    SparqlEndpointClient repository;
    private static final Capabilities capabilities;
    
    public SparqlGraph(final String endpointURI) {
        this(endpointURI, null);
    }
    
    public SparqlGraph(final String endpointURI, final String graphURI) {
        this.prefixMapping = (PrefixMapping)new PrefixMappingImpl();
        this.endpointURI = endpointURI;
        this.graphURI = graphURI;
        this.repository = new SparqlEndpointClient(endpointURI);
    }
    
    public String getEndpointURI() {
        return this.endpointURI;
    }
    
    public String getGraphURI() {
        return this.graphURI;
    }
    
    public SparqlEndpointClient getConnection() {
        try {
            return this.repository.getConnection();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public void add(final Triple arg0) throws AddDeniedException {
        this.performAdd(arg0);
    }
    
    public void executeUpdate(final String updateString) {
        final SparqlEndpointClient conn = this.getConnection();
        try {
            conn.executeUpdate(updateString);
        }
        catch (Exception e) {
            SparqlGraph.log.error((Object)e, (Throwable)e);
            SparqlGraph.log.error((Object)("Update command: \n" + updateString));
            throw new RuntimeException(e);
        }
    }
    
    public void performAdd(final Triple t) {
        final String updateString = "INSERT DATA { " + ((this.graphURI != null) ? ("GRAPH <" + this.graphURI + "> { ") : "") + sparqlNodeUpdate(t.getSubject(), "") + " " + sparqlNodeUpdate(t.getPredicate(), "") + " " + sparqlNodeUpdate(t.getObject(), "") + " } " + ((this.graphURI != null) ? " } " : "");
        if (this.graphURI != null) {
            SparqlGraph.log.info((Object)("=====> update to graph " + this.graphURI));
        }
        SparqlGraph.log.info((Object)updateString);
        this.executeUpdate(updateString);
    }
    
    public void performDelete(final Triple t) {
        final String updateString = "DELETE DATA { " + ((this.graphURI != null) ? ("GRAPH <" + this.graphURI + "> { ") : "") + sparqlNodeUpdate(t.getSubject(), "") + " " + sparqlNodeUpdate(t.getPredicate(), "") + " " + sparqlNodeUpdate(t.getObject(), "") + " } " + ((this.graphURI != null) ? " } " : "");
        this.executeUpdate(updateString);
    }
    
    public void removeAll() {
        final String updateString = "DELETE { ?s ?p ?o } WHERE { \n" + ((this.getGraphURI() != null) ? ("GRAPH <" + this.getGraphURI() + "> { \n") : "") + "    ?s ?p ?o \n" + ((this.getGraphURI() != null) ? "} \n" : "") + "}";
        this.executeUpdate(updateString);
    }
    
    public void close() {
    }
    
    public boolean contains(final Triple arg0) {
        return this.contains(arg0.getSubject(), arg0.getPredicate(), arg0.getObject());
    }
    
    public boolean contains(final Node subject, final Node predicate, final Node object) {
        if (subject.isBlank() || predicate.isBlank() || object.isBlank()) {
            return false;
        }
        final StringBuffer containsQuery = new StringBuffer("ASK { \n");
        if (this.graphURI != null) {
            containsQuery.append("  GRAPH <" + this.graphURI + "> { ");
        }
        containsQuery.append(sparqlNode(subject, "?s")).append(" ").append(sparqlNode(predicate, "?p")).append(" ").append(sparqlNode(object, "?o"));
        if (this.graphURI != null) {
            containsQuery.append(" } \n");
        }
        containsQuery.append("\n}");
        final boolean result = this.execAsk(containsQuery.toString());
        return result;
    }
    
    public void delete(final Triple arg0) throws DeleteDeniedException {
        this.performDelete(arg0);
    }
    
    public boolean dependsOn(final Graph arg0) {
        return false;
    }
    
    public ExtendedIterator<Triple> find(final TripleMatch arg0) {
        final Triple t = arg0.asTriple();
        return this.find(t.getSubject(), t.getPredicate(), t.getObject());
    }
    
    public static String sparqlNode(final Node node, final String varName) {
        if (node == null || node.isVariable()) {
            return varName;
        }
        if (node.isBlank()) {
            return "<fake:blank>";
        }
        if (node.isURI()) {
            final StringBuffer uriBuff = new StringBuffer();
            return uriBuff.append("<").append(node.getURI()).append(">").toString();
        }
        if (node.isLiteral()) {
            final StringBuffer literalBuff = new StringBuffer();
            literalBuff.append("\"");
            pyString(literalBuff, node.getLiteralLexicalForm());
            literalBuff.append("\"");
            if (node.getLiteralDatatypeURI() != null) {
                literalBuff.append("^^<").append(node.getLiteralDatatypeURI()).append(">");
            }
            else if (node.getLiteralLanguage() != null && node.getLiteralLanguage() != "") {
                literalBuff.append("@").append(node.getLiteralLanguage());
            }
            return literalBuff.toString();
        }
        return varName;
    }
    
    public static String sparqlNodeUpdate(final Node node, final String varName) {
        if (node.isBlank()) {
            return "_:" + node.getBlankNodeLabel().replaceAll("\\W", "");
        }
        return sparqlNode(node, varName);
    }
    
    public static String sparqlNodeDelete(final Node node, final String varName) {
        if (node.isBlank()) {
            return "?" + node.getBlankNodeLabel().replaceAll("\\W", "");
        }
        return sparqlNode(node, varName);
    }
    
    public ExtendedIterator<Triple> find(final Node subject, final Node predicate, final Node object) {
        if (this.isVar(subject) || this.isVar(predicate) || this.isVar(object)) {
            final StringBuffer findQuery = new StringBuffer("SELECT * WHERE { \n");
            if (this.graphURI != null) {
                findQuery.append("  GRAPH <" + this.graphURI + "> { ");
            }
            findQuery.append(sparqlNode(subject, "?s")).append(" ").append(sparqlNode(predicate, "?p")).append(" ").append(sparqlNode(object, "?o"));
            if (this.graphURI != null) {
                findQuery.append("  } ");
            }
            findQuery.append("\n}");
            final String queryString = findQuery.toString();
            final ResultSet rs = this.execSelect(queryString);
            final List<Triple> triplist = new ArrayList<Triple>();
            while (rs.hasNext()) {
                final QuerySolution soln = rs.nextSolution();
                final Triple t = new Triple(this.isVar(subject) ? soln.get("?s").asNode() : subject, this.isVar(predicate) ? soln.get("?p").asNode() : predicate, this.isVar(object) ? soln.get("?o").asNode() : object);
                triplist.add(t);
            }
            return (ExtendedIterator<Triple>)WrappedIterator.create((Iterator)triplist.iterator());
        }
        if (this.contains(subject, predicate, object)) {
            return (ExtendedIterator<Triple>)new SingletonIterator((Object)new Triple(subject, predicate, object));
        }
        return (ExtendedIterator<Triple>)WrappedIterator.create((Iterator)Collections.EMPTY_LIST.iterator());
    }
    
    private boolean isVar(final Node node) {
        return node == null || node.isVariable() || node == Node.ANY;
    }
    
    public BulkUpdateHandler getBulkUpdateHandler() {
        if (this.bulkUpdateHandler == null) {
            this.bulkUpdateHandler = (BulkUpdateHandler)new SparqlGraphBulkUpdater(this);
        }
        return this.bulkUpdateHandler;
    }
    
    public Capabilities getCapabilities() {
        return SparqlGraph.capabilities;
    }
    
    public GraphEventManager getEventManager() {
        if (this.eventManager == null) {
            this.eventManager = (GraphEventManager)new SimpleEventManager((Graph)this);
        }
        return this.eventManager;
    }
    
    public PrefixMapping getPrefixMapping() {
        return this.prefixMapping;
    }
    
    public GraphStatisticsHandler getStatisticsHandler() {
        return null;
    }
    
    public TransactionHandler getTransactionHandler() {
        return null;
    }
    
    public boolean isClosed() {
        return false;
    }
    
    public boolean isEmpty() {
        return this.size() == 0;
    }
    
    public boolean isIsomorphicWith(final Graph arg0) {
        SparqlGraph.log.info((Object)"Hey dummy!");
        throw new UnsupportedOperationException("isIsomorphicWith() not supported by SPARQL graphs");
    }
    
    public int size() {
        final int size = this.find(null, null, null).toList().size();
        return size;
    }
    
    private boolean execAsk(final String queryStr) {
        final Query askQuery = QueryFactory.create(queryStr);
        final QueryExecution qe = QueryExecutionFactory.sparqlService(this.endpointURI, askQuery);
        try {
            return qe.execAsk();
        }
        finally {
            qe.close();
        }
    }
    
    private ResultSet execSelect(final String queryStr) {
        final long startTime = System.currentTimeMillis();
        final Query askQuery = QueryFactory.create(queryStr);
        final QueryExecution qe = QueryExecutionFactory.sparqlService(this.endpointURI, askQuery);
        try {
            return (ResultSet)new ResultSetMem(qe.execSelect());
        }
        finally {
            qe.close();
        }
    }
    
    protected static void pyString(final StringBuffer sbuff, final String s) {
        for (int i = 0; i < s.length(); ++i) {
            final char c = s.charAt(i);
            if (c == '\\' || c == '\"') {
                sbuff.append('\\');
                sbuff.append(c);
            }
            else if (c == '\n') {
                sbuff.append("\\n");
            }
            else if (c == '\t') {
                sbuff.append("\\t");
            }
            else if (c == '\r') {
                sbuff.append("\\r");
            }
            else if (c == '\f') {
                sbuff.append("\\f");
            }
            else if (c == '\b') {
                sbuff.append("\\b");
            }
            else if (c == '') {
                sbuff.append("\\a");
            }
            else {
                sbuff.append(c);
            }
        }
    }
    
    public Model toModel() {
        return ModelFactory.createModelForGraph((Graph)this);
    }
    
    static {
        log = LogFactory.getLog((Class)SparqlGraph.class);
        capabilities = (Capabilities)new Capabilities() {
            public boolean addAllowed() {
                return false;
            }
            
            public boolean addAllowed(final boolean everyTriple) {
                return false;
            }
            
            public boolean canBeEmpty() {
                return true;
            }
            
            public boolean deleteAllowed() {
                return false;
            }
            
            public boolean deleteAllowed(final boolean everyTriple) {
                return false;
            }
            
            public boolean findContractSafe() {
                return true;
            }
            
            public boolean handlesLiteralTyping() {
                return true;
            }
            
            public boolean iteratorRemoveAllowed() {
                return false;
            }
            
            public boolean sizeAccurate() {
                return true;
            }
        };
    }
}

/*

	Total time: 126 ms
	
*/