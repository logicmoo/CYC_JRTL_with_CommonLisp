package eu.larkc.plugin.reason.interest;

import com.hp.hpl.jena.query.*;

import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.DataFactory;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.VariableBinding;

import eu.larkc.core.data.util.SPARQLQueryExecutor;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.reason.Reasoner;

/**
 * Reasoner plug-in, which refine the reasoning requests with user interests
 * @author Yan Wang, Yi Zeng
 */
public class InterestBasedReasoner implements Reasoner {
	
	private ContextImpl contextimpl = new ContextImpl();
	private UserInterests userInterests = null;
	
	
	public InterestBasedReasoner() {
	}
	
	@Override
	public Context createContext() {
		return null;
	}

	public Context createContext(String uiDataUri, String userUri, String IRP) {
		ContextImpl contextimpl=new ContextImpl();		
		contextimpl.uiDataUri=uiDataUri;
		contextimpl.userUri=userUri;
		contextimpl.IRP=IRP;		
		return contextimpl;
	}
	

	@Override
	public void initialise() {
		userInterests = contextimpl.getUserInterests();
	}
	
	@Override
	public void shutdown() {
	}
	
	@Override
	public BooleanInformationSet sparqlAsk(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {

		return null;
	}

	@Override
	public SetOfStatements sparqlConstruct(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {

		return null;
	}

	@Override
	public SetOfStatements sparqlDescribe(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {

		return null;
	}
	

	@Override
	public VariableBinding sparqlSelect(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {	
	
		ContextImpl contextimpl=(ContextImpl)context;
		
//		if(contextimpl.needRefine){
		if(context!=null){
//			rewrite SPARQL query with user interests
			QueryR qr=new QueryR(theQuery.toString());
			UserInterests ui = contextimpl.getUserInterests();
			Query query_R=qr.refine(ui, contextimpl.IRP);			
			SPARQLQuery query=DataFactory.INSTANCE.createSPARQLQuery(query_R.toString());

			return new SPARQLQueryExecutor().executeSelect(query, theSetOfStatements);
			
		}else{
			return new SPARQLQueryExecutor().executeSelect(theQuery, theSetOfStatements);
		}
	}

	public void printUserInterests(Context context) {
		Logger log = LoggerFactory.getLogger(InterestBasedReasoner.class);
		if(context!=null){
			ContextImpl contextimpl=(ContextImpl)context;		
			log.info("" + contextimpl.uis.interests);
		}else{
			log.info("context is null!");
		}
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
