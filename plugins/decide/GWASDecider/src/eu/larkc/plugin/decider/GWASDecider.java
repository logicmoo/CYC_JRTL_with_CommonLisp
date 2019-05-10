package eu.larkc.plugin.decider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;

import eu.larkc.core.Larkc;
import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.InformationSet;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.data.VariableBinding.Binding;
import eu.larkc.core.data.VariableBindingImpl;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.qos.QoSParameters;
import eu.larkc.core.query.Query;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.decide.Decider;
import eu.larkc.plugin.identify.Identifier;
import eu.larkc.plugin.transform.QueryTransformer;

public class GWASDecider implements Decider {
		
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
		
		List<Binding> bindings = new ArrayList<Binding>();
		List<String> variables = new ArrayList<String>();
		
		variables.add("snpID");
		variables.add("priorScore");
		
		try {
			QueryTransformer qt = (QueryTransformer)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.transform.GWASQueryTransformer"));
					
			Set<Query> queries = qt.transform(theQuery, null, null);
		
			for (Query q : queries)
			{
				Identifier i = (Identifier)Larkc.pluginRegistry.getNewPluginInstance(new URIImpl("urn:eu.larkc.plugin.identify.GWASIdentifier"));
				
				Collection<InformationSet> results = i.identify(q, null, null);
				
				for (InformationSet is : results)
				{
					Iterator<Statement> it = ((SetOfStatements)is).getStatements();
					while(it.hasNext())
					{
						Statement s = it.next();
						
						bindings.add(new VariableBindingImpl.BindingRow(s.getSubject(),s.getObject()));
					}
				}				
			}					
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return new VariableBindingImpl(bindings,variables);
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
