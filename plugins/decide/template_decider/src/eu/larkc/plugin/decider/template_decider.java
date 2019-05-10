package eu.larkc.plugin.decider;

import java.util.logging.Logger;

import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;

import eu.larkc.core.Workflow;
import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.metadata.PluginRegistry;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.qos.QoSParameters;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.decide.Decider;
import eu.larkc.plugin.Context;


/**
* This is a decider template, based on CycGateDecider 
* @author Luka Bradesko, Alexey Cheptsov
*
*/
public class template_decider implements Decider {
	private static Logger logger = Logger.getLogger(template_decider.class.getCanonicalName());
	
	@Override
	public BooleanInformationSet sparqlAsk(SPARQLQuery theQuery,
			QoSParameters theQoSParameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SetOfStatements sparqlConstruct(SPARQLQuery theQuery,
			QoSParameters theQoSParameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SetOfStatements sparqlDescribe(SPARQLQuery theQuery,
			QoSParameters theQoSParameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VariableBinding sparqlSelect(SPARQLQuery theQuery,
			QoSParameters theQoSParameters) {
		
		//here a workflow is composed
		System.out.println("Composing workflow ...");
		Workflow workflow = new Workflow();
		workflow.addPlugIn(new URIImpl("urn:eu.larkc.plugin.identify.template_identifier"));
		workflow.addPlugIn(new URIImpl("urn:eu.larkc.plugin.transform.template_transformer"));
		workflow.addPlugIn(new URIImpl("urn:eu.larkc.plugin.select.template_selecter"));
		workflow.addPlugIn(new URIImpl("urn:eu.larkc.plugin.reason.template_reasoner"));
		
		System.out.println("Starting workflow ...");
		try {
			workflow.start(theQuery);
		} catch (Exception e) {
			 logger.severe(e.getMessage());
			 return null;
		}
		return (VariableBinding)workflow.take();
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

	@Override
	public URI getIdentifier() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QoSInformation getQoSInformation() {
		// TODO Auto-generated method stub
		return null;
	}

}
