package eu.larkc.plugin.decide;

import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.qos.QoSParameters;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.Plugin;

public interface Decider extends Plugin{
	public VariableBinding sparqlSelect(SPARQLQuery theQuery, QoSParameters theQoSParameters);
	public SetOfStatements sparqlConstruct(SPARQLQuery theQuery, QoSParameters theQoSParameters);
	public SetOfStatements sparqlDescribe(SPARQLQuery theQuery, QoSParameters theQoSParameters);
	public BooleanInformationSet sparqlAsk(SPARQLQuery theQuery, QoSParameters theQoSParameters);
}
