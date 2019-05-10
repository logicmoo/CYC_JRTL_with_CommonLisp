package eu.larkc.plugin.transform.gate;

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

/**
 * this class is temporarly here before we find the way to use some common code
 * which is useful for all selection plugins
 * 
 * @author danica
 * 
 */
public class SparqlToKeywords {
	/**
	 * this method is 'stolen' from BaseLineFTSelecter before we find nicer way
	 * to do it
	 * 
	 * @param queryString
	 * @return
	 */
	public static Collection<String> extractKeywords(String queryString) {
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
					if (node.hasValue())
						collectValue(node.getValue());
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
					if (str != null)
						tokenizeString(str);
				}

				void tokenizeString(String str) {
					char[] chars = (str + ".").toCharArray();
					int start = -1, index = 0;
					for (char ch : chars) {
						if (Character.isLetter(ch)) {
							if (start < 0)
								start = index;
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
			// ignore exceptions at this level
		}
		return keywords;
	}

}
