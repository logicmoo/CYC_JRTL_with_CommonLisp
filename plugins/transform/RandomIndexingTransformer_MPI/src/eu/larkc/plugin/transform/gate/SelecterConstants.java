package eu.larkc.plugin.transform.gate;

/**
 * holding constants
 * @todo this should be removed to some properties file
 * 
 * @author danica
 * 
 */
public class SelecterConstants {

	public static String literalRefineBlock = "{?s ?p ?o . ?s ?p 'similar-literal-string' }";
	public static String UNION = " UNION ";
	public static String uriRefineBlock = "{?s ?p ?o . ?s ?p <similar-uri-string> }";

}
