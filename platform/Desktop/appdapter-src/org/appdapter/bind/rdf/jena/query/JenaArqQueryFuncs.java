package org.appdapter.bind.rdf.jena.query;

import com.hp.hpl.jena.query.ResultSetRewindable;
import com.hp.hpl.jena.query.ResultSetFormatter;
import com.hp.hpl.jena.query.ResultSetFactory;
import java.util.ArrayList;
import java.util.List;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.query.QueryExecution;
import org.appdapter.bind.rdf.jena.model.JenaFileManagerUtils;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.Syntax;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.shared.PrefixMapping;
import org.appdapter.core.log.BasicDebugger;

public class JenaArqQueryFuncs
{
    public static BasicDebugger theDbg;
    
    public static Query parseQueryText(final String inlineQueryText, final PrefixMapping pmap) {
        final String qBaseURI = null;
        final Query query = new Query();
        query.setPrefixMapping(pmap);
        try {
            QueryFactory.parse(query, inlineQueryText, qBaseURI, Syntax.syntaxSPARQL);
            return query;
        }
        catch (Throwable t) {
            t.printStackTrace();
            return query;
        }
    }
    
    public static Query parseQueryURL(final String resolvedQueryURL, final ClassLoader optResourceCL) {
        Query parsedQuery = null;
        try {
            if (optResourceCL != null) {
                JenaArqQueryFuncs.theDbg.logInfo("Registering classLoader for this package with JenaFM");
                JenaFileManagerUtils.ensureClassLoaderRegisteredWithDefaultJenaFM(optResourceCL);
            }
            parsedQuery = QueryFactory.read(resolvedQueryURL);
        }
        catch (Throwable t) {
            JenaArqQueryFuncs.theDbg.logError("problem in parseQueryURL", t);
        }
        return parsedQuery;
    }
    
    public static <ResType> ResType processQueryExecution(final QueryExecution qe, final JenaArqResultSetProcessor<ResType> resProc) {
        ResType result = null;
        try {
            try {
                final ResultSet rs = qe.execSelect();
                result = (ResType)resProc.processResultSet(rs);
            }
            finally {
                qe.close();
            }
        }
        catch (Throwable t) {
            JenaArqQueryFuncs.theDbg.logError("problem in processQueryExecution", t);
        }
        return result;
    }
    
    public static <ResType> ResType processDatasetQuery(final Dataset ds, final Query parsedQuery, final QuerySolution initBinding, final JenaArqResultSetProcessor<ResType> resProc) {
        final QueryExecution qe = QueryExecutionFactory.create(parsedQuery, ds, initBinding);
        return processQueryExecution(qe, resProc);
    }
    
    public static List<QuerySolution> findAllSolutions(final Dataset ds, final Query parsedQuery, final QuerySolution initBinding) {
        final JenaArqResultSetProcessor<List<QuerySolution>> resProc = (JenaArqResultSetProcessor<List<QuerySolution>>)new JenaArqResultSetProcessor<List<QuerySolution>>() {
            public List<QuerySolution> processResultSet(final ResultSet rset) {
                final List<QuerySolution> solnList = new ArrayList<QuerySolution>();
                while (rset.hasNext()) {
                    final QuerySolution qsoln = rset.next();
                    solnList.add(qsoln);
                }
                return solnList;
            }
        };
        return processDatasetQuery(ds, parsedQuery, initBinding, resProc);
    }
    
    public static String dumpResultSetToXML(final ResultSet rs) {
        final ResultSetRewindable rsr = ResultSetFactory.makeRewindable(rs);
        ResultSetFormatter.out((ResultSet)rsr);
        rsr.reset();
        final String resultXML = ResultSetFormatter.asXMLString((ResultSet)rsr);
        return resultXML;
    }
    
    static {
        JenaArqQueryFuncs.theDbg = new BasicDebugger();
    }
}

/*

	Total time: 22 ms
	
*/