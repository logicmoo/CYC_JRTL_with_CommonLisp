package eu.larkc.core.query;

import java.util.List;

/**
 * A keyword query that consists of a number of search keywords,
 * e.g. something that one would type in to google.
 */
public interface KeywordQuery extends Query{

	/**
	 * Get the keywords of the query.
	 * @return The list of keywords.
	 */
	public List<String> getKeywords();
}
