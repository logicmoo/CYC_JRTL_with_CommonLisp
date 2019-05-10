package eu.larkc.plugin.transform.passitontransformer;

import java.util.HashSet;
import java.util.Set;

import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;

import eu.larkc.core.metadata.MetaData;
import eu.larkc.core.metadata.MetaDataImpl;
import eu.larkc.core.metadata.MethodMetaDataImpl;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.Query;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.transform.QueryTransformer;
import eu.larkc.plugin.Contract;

public class PassItOnTransformer implements QueryTransformer{

	private Query inputQuery = null; 
	
	public boolean canTransform(Query theQuery) {
		return theQuery instanceof SPARQLQuery;
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

	public Set<Query> transform(Query theQuery, Contract theContract, Context theContext) {
		inputQuery = theQuery;
		Set <Query> result = new HashSet <Query>();
		result.add(theQuery);
		return result;
	}

	public URI getIdentifier() {
		return new URIImpl("urn:" + this.getClass().getName());
	}

	public MetaData getMetaData() {
		// prepare meta-data about this plug-in
		MetaDataImpl metaData = new MetaDataImpl(QueryTransformer.class.getCanonicalName());
		
		// add what it can get on the input and what it gives on the output
		metaData.addMethod( new MethodMetaDataImpl("transform",
			new String[] { SPARQLQuery.class.getCanonicalName() },
			Query.class.getCanonicalName()));		
		
		return metaData;
	}

	public QoSInformation getQoSInformation() {
		return new QoSInformation() {};
	}

	public void setInputQuery(Query theQuery) {
		this.inputQuery = theQuery;
	}
	
	protected Query getInputQuery() {
		return this.inputQuery;
	}

}
