/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eu.larkc.plugin.identify;

/**
 * Simple help class to extract string tokens from a Sparql Query. It gets a
 * Sparql query as input, removes sparl annotations from it, extracts the
 * keywords from the query and return it to the calling class.
 *
 * @author R.B. Vidal / Max-Planck Institute Berlin
 */


import java.util.Collection;
import java.util.LinkedList;

import org.openrdf.model.Literal;
import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.query.MalformedQueryException;
import org.openrdf.query.algebra.QueryModelNode;
import org.openrdf.query.algebra.ValueConstant;
import org.openrdf.query.algebra.Var;
import org.openrdf.query.algebra.helpers.QueryModelVisitorBase;
import org.openrdf.query.parser.ParsedQuery;
import org.openrdf.query.parser.sparql.SPARQLParser;


public class QueryProcessor {




	public QueryProcessor() {
		// TODO Auto-generated constructor stub
	}

	/**
	 *
	 * Another method for extracting keywords from an Sparql query. This is here
	 * just for experimental purposes. For production use the
	 * "extractKeywords(String queryString)" method.
	 *
	 * @param original
	 *            The Sparql query to be processed
	 * @return A String object containg containing the extracted keywords from
	 *         the sparql query
	 */
	public  static String removeRdfAndOwlTags(String original) {
		original = original.substring(original.indexOf("SELECT") + 6);// remove

		String rdfAndOwlTags = original.replace("rdf:", "").replace("owl:", "");

		return rdfAndOwlTags;
	}

	/**
	 * Utility method for preparing a String with keywords for the Webservice
	 * query. It calls the {@link #extractKeywords(String queryString)
	 * extractKeywords} method, and appends the keywords to a single String;
	 *
	 * @param queryString
	 *            The Sparql query to be processed
	 * @return A String object containing the extracted keywords from
	 *         the sparql query
	 */
	public static String getKeywordsFromQuery(String queryString) {
		StringBuffer sb = new StringBuffer();
		Collection<String> keywords =  extractKeywords(queryString);
		for (Object oneKeyword : keywords) {
			sb.append(((String) oneKeyword) + " ");
		}
		return sb.toString();
	}

	/**
	 * Method from the class BaseLineFTSelecter.java, provided by Ivan Petrov.
	 * It strips a sparql query, getting the tokens needed to be processed
	 * further in the Esa plugin; Those tokens are sent as a String to the
	 * Webservice, and there they are used as a query (to the RI or Esa api)
	 *
	 * @param queryString
	 *            : The Sparql query to be processed
	 * @return an Object of type Collection<String> , containing the extracted
	 *         keywords from the sparql query
	 */
	public  static Collection<String> extractKeywords(String queryString) {
		final Collection<String> keywords = new LinkedList<String>();

		SPARQLParser queryParser = new SPARQLParser();
		ParsedQuery query;
		try {
			query = queryParser.parseQuery(queryString, null);
		} catch (MalformedQueryException e) {
			return keywords;
		}
		try {
			query.getTupleExpr().visit(new QueryModelVisitorBase<Exception>() {

				public void meet(ValueConstant node) {
					collectValue(node.getValue());
				}

				public void meet(Var node) {
					if (node.hasValue()) {
						collectValue(node.getValue());
					}
				}

				public void meetNode(QueryModelNode node) {
					try {
						node.visitChildren(this);
					} catch (Exception ex) {
					}
				}

				void collectValue(Value v) {
					String str = null;
					if (v instanceof URI) {
						str = ((URI) v).getLocalName();
					} else if (v instanceof Literal) {
						str = ((Literal) v).getLabel();
					} else {
						// some value (e.g. b-node) we're not interested in
					}
					// see if we have something to collect
					if (str != null) {
						tokenizeString(str);
					}
				}

				void tokenizeString(String str) {
					char[] chars = (str + ".").toCharArray();
					int start = -1, index = 0;
					for (char ch : chars) {
						if (Character.isLetter(ch)) {
							if (start < 0) {
								start = index;
							}
						} else {
							if (start >= 0) {
								tokenizeWord(new String(chars, start, index
										- start));
								start = -1;
							}
						}
						index++;
					}
				}

				void tokenizeWord(String word) {
					// additional tokenization pending...
					keywords.add(word.toLowerCase());
				}
			});
		} catch (Exception ex) {
			ex.printStackTrace();
			// ignore exceptions at this level
		}

		return keywords;
	}

}
