package eu.larkc.plugin.reason;

import java.util.ArrayList;
import java.util.List;

import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.data.VariableBindingImpl;
import eu.larkc.core.data.VariableBinding.Binding;
import eu.larkc.core.data.VariableBindingImpl.BindingRow;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;

/**
 * Reasoner plug-in, which transfers Reasoning requests to the ResearchCyc reasoner
 * @author Blaz Fortuna, Luka Bradesko
 */
public class template_reasoner implements Reasoner {

	public template_reasoner() {
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
	public BooleanInformationSet sparqlAsk(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {
		Logger log = LoggerFactory.getLogger(template_reasoner.class);
		log.info("Hello from reasoner");
		return null;
	}

	@Override
	public SetOfStatements sparqlConstruct(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {
		Logger log = LoggerFactory.getLogger(template_reasoner.class);
		// TODO Auto-generated method stub
		log.info("Hello from reasoner");
		return null;
	}

	@Override
	public SetOfStatements sparqlDescribe(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {
		Logger log = LoggerFactory.getLogger(template_reasoner.class);
		// TODO Auto-generated method stub
		log.info("Hello from reasoner");
		return null;
	}
	

	@Override
	public VariableBinding sparqlSelect(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {	
		Logger log = LoggerFactory.getLogger(template_reasoner.class);
		log.info("Hello from reasoner");
	
		// load assertion
	    	String articleId = null;
	    	List<Binding> bindings = new ArrayList<Binding>();
			List<String> variables = new ArrayList<String>();
				
			variables.add("var1");
			
			BindingRow bindingRow = new VariableBindingImpl.BindingRow();
			String val = "val1";
			bindingRow.addValue(new URIImpl("http://www.cycfoundation.org/concepts/" + val));
			bindings.add(bindingRow);
			return new VariableBindingImpl(bindings, variables);
	
	}

	@Override
	public URI getIdentifier() {
		return new URIImpl("urn:" + this.getClass().getName());
	}

	@Override
	public QoSInformation getQoSInformation() {
		// TODO Auto-generated method stub
		return null;
	}
}
