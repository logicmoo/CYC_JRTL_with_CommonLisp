package org.appdapter.bind.rdf.jena.query;

import org.slf4j.LoggerFactory;
import java.util.Iterator;
import com.hp.hpl.jena.query.Syntax;
import java.io.InputStream;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import java.io.FileInputStream;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.ResultSetRewindable;
import com.hp.hpl.jena.query.ResultSetFactory;
import com.hp.hpl.jena.vocabulary.RDF;
import com.hp.hpl.jena.query.ResultSetFormatter;
import com.hp.hpl.jena.sparql.graph.GraphFactory;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.util.FileManager;
import com.hp.hpl.jena.sparql.util.DatasetUtils;
import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.query.Query;
import java.util.List;
import org.slf4j.Logger;

public class SPARQL_Utils
{
    private static Logger theLogger;

    public static boolean isNonemptyList(final List L) {
        return L != null && L.size() > 0;
    }

    public static boolean doesQueryHaveDataset(final Query query) {
        return isNonemptyList(query.getGraphURIs()) || isNonemptyList(query.getNamedGraphURIs());
    }

    public static Dataset createDataset(final List defaultGraphURIs, final List namedGraphURIs) {
        return DatasetUtils.createDataset(defaultGraphURIs, namedGraphURIs, (FileManager)null, (String)null);
    }

    public static Model resultSetToModel(final ResultSet rs) {
        final Model m = GraphFactory.makeDefaultModel();
        ResultSetFormatter.asRDF(m, rs);
        if (m.getNsPrefixURI("rdf") == null) {
            m.setNsPrefix("rdf", RDF.getURI());
        }
        if (m.getNsPrefixURI("xsd") == null) {
            m.setNsPrefix("xsd", "http://www.w3.org/2001/XMLSchema#");
        }
        return m;
    }

    public static boolean resultSetEquivalent(final ResultSet rs1, final ResultSet rs2) {
        final Model model2 = resultSetToModel(rs2);
        return resultSetMatchesModel(rs1, model2);
    }

    public static boolean resultSetMatchesModel(final ResultSet rs1, final Model model2) {
        final Model model3 = resultSetToModel(rs1);
        return model3.isIsomorphicWith(model2);
    }

    public static String execQueryToProduceXML(final Model m, final String qryString) {
        final ResultSet rs = execQueryToProduceResultSet(m, qryString);
        final ResultSetRewindable lastResultSet = ResultSetFactory.makeRewindable(rs);
        final String resultXml = ResultSetFormatter.asXMLString((ResultSet)lastResultSet);
        return resultXml;
    }

    public static ResultSet execQueryToProduceResultSet(final Model m, final String qryString) {
        final Query qry = QueryFactory.create(qryString);
        QueryExecution qe = null;
        qe = QueryExecutionFactory.create(qry, m, (QuerySolution)null);
        final ResultSet rs = qe.execSelect();
        return rs;
    }

    public static String executeQueryFromFiles(final String queryFileURL, final String modelURL, final String modelFormat, final String modelBaseURI) throws Throwable {
        final FileInputStream modelInputStream = new FileInputStream(modelURL);
        final Model baseModel = ModelFactory.createDefaultModel();
        baseModel.read((InputStream)modelInputStream, modelBaseURI, modelFormat);
        return executeQueryFromFile(queryFileURL, baseModel);
    }

    public static String executeQueryFromFile(final String queryFileURL, final Model inputModel) throws Throwable {
        final Query parsedQuery = QueryFactory.read(queryFileURL, (String)null, Syntax.syntaxSPARQL);
        final QueryExecution qe = QueryExecutionFactory.create(parsedQuery, inputModel, (QuerySolution)null);
        final ResultSet rs = qe.execSelect();
        final ResultSetRewindable lastResultSet = ResultSetFactory.makeRewindable(rs);
        final String resultXML = ResultSetFormatter.asXMLString((ResultSet)lastResultSet);
        return resultXML;
    }

    public static void dumpDatasetNames(final Dataset dataset) throws Throwable {
        final Iterator dsNameIterator = dataset.listNames();
        while (dsNameIterator.hasNext()) {
            final String name = (String) dsNameIterator.next();
            SPARQL_Utils.theLogger.debug("dataset contains model named: " + name);
        }
    }

    public static String runQueryOverDataset(final String queryFileURL, final Dataset inputDataset) throws Throwable {
        final Query parsedQuery = QueryFactory.read(queryFileURL, (String)null, Syntax.syntaxSPARQL);
        final QueryExecution qe = QueryExecutionFactory.create(parsedQuery, inputDataset, (QuerySolution)null);
        final ResultSet rs = qe.execSelect();
        final ResultSetRewindable lastResultSet = ResultSetFactory.makeRewindable(rs);
        final String resultXML = ResultSetFormatter.asXMLString((ResultSet)lastResultSet);
        return resultXML;
    }

    static {
        SPARQL_Utils.theLogger = LoggerFactory.getLogger((Class)SPARQL_Utils.class);
    }
}

/*

	Total time: 33 ms

*/