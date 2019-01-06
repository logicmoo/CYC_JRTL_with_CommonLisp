package eu.larkc.core.data;

/**
 * BooleanInformationSet is a result that contains true or false. It is commonly
 * associated with SPARQL ASK queries.
 * 
 * @author vassil
 * 
 */
public interface BooleanInformationSet extends InformationSet {
	boolean getValue();
}
