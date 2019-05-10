package eu.larkc.plugin.identify.article;

import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;

import org.openrdf.model.Literal;
import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.model.impl.URIImpl;
import org.openrdf.query.algebra.StatementPattern;
import org.openrdf.query.algebra.helpers.StatementPatternCollector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.larkc.core.data.InformationSet;
import eu.larkc.core.data.NaturalLanguageDocumentUrl;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.Query;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.core.query.SPARQLQueryImpl;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.identify.Identifier;

public class ArticleIdentifier implements Identifier {
	//only first time when called, return results (anytime b.)
	private boolean once = false;
	/**
	 * Extracts list of URLs pointing to articles from the query
	 * and returns them as a collection of NaturalLanguageDocumentUrl
	 * 
	 * @param theQuery Input SPARQL query
	 * @return collection of NaturalLanugageDocumentUrl
	 * 
	 * @author Blaz Fortuna
	 */
	public Collection<InformationSet> identify(Query theQuery,
			Contract contract, Context context) {
		Logger log = LoggerFactory.getLogger(ArticleIdentifier.class);
		
		if (once) { return null; }
		once = true;
			
		// we assume query is a sparql query
		if (theQuery instanceof SPARQLQueryImpl) {
			log.info("Identifying article links in the query ...");
			SPARQLQuery sparqlQuery = (SPARQLQuery)theQuery;		
			Collection<InformationSet> articleSet = new HashSet<InformationSet>();
			StatementPatternCollector spc = new StatementPatternCollector();
			((SPARQLQueryImpl)sparqlQuery).getParsedQuery().getTupleExpr().visit(spc);
			// we iterate over all the triple patterns and extract ones with links			
			for (StatementPattern sp : spc.getStatementPatterns()){
				Value predicateVal = sp.getPredicateVar().getValue();
				if (predicateVal instanceof URI && predicateVal.stringValue().equals(
						"http://www.cycfoundation.org/concepts/mentionedInArticle")) {
					//TODO check predicate is correct					
					// load article URL
					Value objectVal = sp.getObjectVar().getValue();
					if (objectVal instanceof Literal) {
						String articleUrl = objectVal.stringValue();
						articleSet.add(new NaturalLanguageDocumentUrl(articleUrl));
						log.info(" - " + articleUrl);
					}
				}
			}
			return articleSet;
		}

		return null;
	}

	@Override
	public Context createContext() {
		return null;
	}

	@Override
	public void initialise() {
	}
	
	@Override
	public void shutdown() {
	}

	public URI getIdentifier() {
		return new URIImpl("urn:" + this.getClass().getName());
	}

	public QoSInformation getQoSInformation() {
		// TODO Auto-generated method stub
		return null;
	}

}
