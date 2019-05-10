package org.appdapter.core.remote.sparql;

import org.apache.http.message.BasicNameValuePair;
import org.apache.http.NameValuePair;
import java.util.ArrayList;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.Query;
import org.slf4j.Logger;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.Syntax;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.Resource;
import java.util.List;
import org.appdapter.core.log.Debuggable;
import org.appdapter.core.log.BasicDebugger;

public class SparqlEndpointClient extends BasicDebugger
{
    WebDataClient myWebDataClient;
    String endpointURI;
    
    public String buildSparqlPrefixHeader(final String repoServiceURL) {
        return (String)Debuggable.notImplemented(new Object[] { "buildSparqlPrefixHeader", repoServiceURL });
    }
    
    public List<Resource> getContextIDs() {
        return (List<Resource>)Debuggable.notImplemented(new Object[] { "getContextIDs", this });
    }
    
    public SparqlEndpointClient(final String endpointString) {
        this.myWebDataClient = new WebDataClient();
        this.endpointURI = endpointString;
    }
    
    public SparqlEndpointClient getConnection() {
        return this;
    }
    
    public void executeUpdate(final String updateString) {
        this.execRemoteSparqlUpdate(this.endpointURI, updateString, true);
    }
    
    public ResultSet execQuery(final String queryText, final boolean debugFlag) {
        return this.execRemoteSparqlSelect(this.endpointURI, queryText);
    }
    
    public ResultSet execRemoteSparqlSelect(final String svcUrl, final String queryText) {
        final Logger log = this.getLogger();
        log.info("QueryUrl=[{}]  QueryText={}", (Object)svcUrl, (Object)queryText);
        final Query parsedQuery = QueryFactory.create(queryText);
        final String queryBaseURI = null;
        final Syntax queryFileSyntax = Syntax.syntaxSPARQL;
        final QueryExecution qExc = QueryExecutionFactory.sparqlService(svcUrl, parsedQuery);
        final ResultSet resSet = qExc.execSelect();
        return resSet;
    }
    
    public void execRemoteSparqlUpdate(final String svcUrl, final String updateText, final boolean debugFlag) {
        final List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        nvps.add((NameValuePair)new BasicNameValuePair("request", updateText));
        try {
            this.myWebDataClient.execPost(svcUrl, (List)nvps, debugFlag);
        }
        catch (Throwable t) {
            this.getLogger().error("Caught Exception: {} \n********************* Bonus Direct Stack Trace to STDERR", t);
            t.printStackTrace();
        }
    }
}

/*

	Total time: 16 ms
	
*/