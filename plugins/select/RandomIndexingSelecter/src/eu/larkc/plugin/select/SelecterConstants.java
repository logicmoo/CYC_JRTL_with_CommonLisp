package eu.larkc.plugin.select;

/**
 * holding constants
 * @todo this should be removed to some properties file
 * 
 * @author danica
 * 
 */
public class SelecterConstants {

	public static String literalRefineBlock = "{?s ?p ?o . filter (regex(str(?o),'similar-literal-string*', 'i')) . }";

	public static String UNION = " UNION ";

	public static String uriRefineBlock = "{?s ?p ?o . filter (?s=<similar-uri-string>) .}";

}
