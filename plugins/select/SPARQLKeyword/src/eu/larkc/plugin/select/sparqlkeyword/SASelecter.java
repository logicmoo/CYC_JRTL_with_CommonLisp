package eu.larkc.plugin.select.sparqlkeyword;

import java.util.regex.Pattern;

import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;

import eu.larkc.core.data.DataSet;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.core.query.SPARQLQueryImpl;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.select.Selecter;

public class SASelecter implements Selecter {
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
	public SetOfStatements select(SetOfStatements set, Contract contract, Context context) {
		
		if (! (set instanceof DataSet))
			throw new IllegalArgumentException("Expected DataSet instance");
		if (! (contract instanceof SAContract))
			throw new IllegalArgumentException("Expected SpreadingActivationContract instance");
		
		
		DataSet dataSet = (DataSet)set;
		String query = extractQuery((SAContract) contract);
		
		// enable the spreading activation
		initSA(dataSet);
		
		// configure parameters
		setParam(dataSet, "SAInitialActivation"	, "0.66");
		setParam(dataSet, "SADecayFactor"		, "0.85");
		setParam(dataSet, "SAFiringThreshold"	, "0.15");
		setParam(dataSet, "SAFilterThreshold"	, "0.80");

		// initialize the process by executing the input query
		askQuery(dataSet, query);
		
		// spread activation
		spreadActivation(dataSet);
		
		// select whatever is currently active (the primed part of graph)
		SetOfStatements resultSet = 
			dataSet.getSPARQLEndpoint().executeConstruct(
					new SPARQLQueryImpl("CONSTRUCT * WHERE {}"));
		
		// disable the spreading activation
		exitSA(dataSet);
		
		return resultSet;
	}
	
	@Override
	public URI getIdentifier() {
		return new URIImpl("http://SpreadingActivationSelecter.larkc.eu/");
	}

	@Override
	public QoSInformation getQoSInformation() {
		return new QoSInformation() {};
	}

	
	private void setParam(DataSet set, String param, String value) {
		askQuery(set, "ASK {<http://www.ontotext.com#" + param + 
				">  <http://www.ontotext.com#setParam> \"" + value + "\" }");
	}
	
	private void toggleFeature(DataSet set, String name, boolean state) {
		askQuery(set, "ASK { _:b1 <http://www.ontotext.com#" + name + 
				"> \"" + state + "\" }");
	}
	
	private void initSA(DataSet set) {
		toggleFeature(set, "enableSpreading", true);
	}
	
	private void exitSA(DataSet set) {
		toggleFeature(set, "enableSpreading", false);
	}
	
	private void spreadActivation(DataSet set) {
		toggleFeature(set, "spreadActivation", true);
	}
	
	private boolean askQuery(DataSet set, String query) {
		return ((DataSet)set).getSPARQLEndpoint()
				.executeAsk(new SPARQLQueryImpl(query));
	}
	
	private String extractQuery(SAContract contract) {
		String query = contract.getInputQuery().toString();
		
		// transform the query verb from SELECT to ASK
		Pattern p = Pattern.compile(
				"^\\s*select\\s+.*where\\s*(\\{.*\\})[^}]*$", 
				Pattern.CASE_INSENSITIVE);
		String askQuery = p.matcher(query).replaceFirst("ASK $1");
		
		return askQuery; 
	}
	
	protected class SAContract implements Contract {
		private static final long serialVersionUID = 5827848488305012413L;
		private SPARQLQuery query = null;
		
		public void setInputQuery(SPARQLQuery theQuery) {
			query = theQuery;
		}
		public SPARQLQuery getInputQuery() {
			return query;
		}
	}
}
