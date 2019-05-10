package eu.larkc.plugin.transform.gate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.core.query.SPARQLQueryImpl;
import gate.creole.ontology.InvalidURIException;
import gate.creole.ontology.URI;

/**
 * this class generates sparql query dynamically by replacing
 * 
 * @author Danica Damljanovic
 * 
 */
public class SparqlGenerator {
	/**
	 * this method inserts refinement bits to the base query if there are any
	 * similar words passed as parameter
	 * 
	 * @param baseQuery
	 * @param similarWords
	 * @return
	 */
	Logger log = LoggerFactory.getLogger(SparqlGenerator.class);
	List<SPARQLQuery> generateSparqlQueries(String baseQuery,
			Set<String> similarWords) {
		log.info("\n SPARQL before refinement:" + baseQuery);
		log.info("\n Similar words which will be used for refinement:"
				+ similarWords.toString());
		StringBuffer refinedQuery = new StringBuffer(baseQuery);
		List<SPARQLQuery> queries = new ArrayList<SPARQLQuery>();
		boolean uriToRefine = false;
		boolean literalToRefine = false;
		Set<String> refinementBlocks = new HashSet<String>();
		for (String word : similarWords) {
			String literalString = null;
			URI uri = null;
			try {
				uri = new URI(word, false);
				uriToRefine = true;
			} catch (InvalidURIException e) {
				literalToRefine = true;
				literalString = word;
			}
			String uriBlock = null;
			if (uriToRefine) {
				uriBlock = SelecterConstants.uriRefineBlock;

				// System.out.print("\n Refinement using this uri:"
				// + uri.toString());
				uriBlock = uriBlock.replace("similar-uri-string", uri
						.toString());
				uriToRefine = false;
			}
			String literalBlock = null;
			if (literalToRefine) {
				literalBlock = SelecterConstants.literalRefineBlock;

				// System.out.print("\nRefinement using this literal string:"
				// + literalString);
				literalBlock = literalBlock.replace("similar-literal-string",
						literalString);
				literalToRefine = false;
			}
			if (literalBlock != null)
				refinementBlocks.add(literalBlock);
			if (uriBlock != null)
				refinementBlocks.add(uriBlock);
		}
		int counter = 1;
		int size = refinementBlocks.size();
		refinedQuery = refinedQuery.replace((refinedQuery.lastIndexOf("}")),
				refinedQuery.lastIndexOf("}") + 1, "");
		// System.out.print("now the query shouldnt have the last bracket:"+refinedQuery.toString());
		refinedQuery.append(SelecterConstants.UNION);
		for (String block : refinementBlocks) {
			refinedQuery.append(block);
			if (counter < size)
				refinedQuery.append(SelecterConstants.UNION);
			counter = counter + 1;
		}
		refinedQuery.append(" }");
		log.info("\n SPARQL query after refinement:" + refinedQuery);
		SPARQLQuery query = new SPARQLQueryImpl(refinedQuery.toString());
		queries.add(query);
		return queries;
	}
}
