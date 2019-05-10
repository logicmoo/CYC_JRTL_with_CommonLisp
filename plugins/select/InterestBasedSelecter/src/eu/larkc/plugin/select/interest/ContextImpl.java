package eu.larkc.plugin.select.interest;

import java.io.File;
import java.util.*;

import org.openrdf.model.impl.URIImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.larkc.plugin.Context;

import eu.larkc.core.data.*;
import eu.larkc.core.data.VariableBinding.Binding;
import eu.larkc.core.data.util.SPARQLQueryExecutor;
import eu.larkc.core.query.SPARQLQuery;


public class ContextImpl implements Context {
//	refine or not
	public boolean needRefine = true;
//	user interests
	public UserInterests userInterests;
//	the Interests Related Property(Predicate),be full uri, not short format with prefix
	public String IRP;
//	the user's name
	public String userName;
//	the user's uri
	public String userUri;
//	the uri of user interest dataset
	public String uiDataUri;
//	the data source include user interests
	public SetOfStatements userInterestInfo;
//	the SPARQL query to get user interests, according to user name
	public String queryOfUserInterest
		="PREFIX foaf:	<http://xmlns.com/foaf/0.1/> "+
		 " SELECT ?interest "+
		 " WHERE "+
		 "  { "+
		 " 	?person foaf:name ?name . "+
		 "  ?person foaf:topic_interest ?interests . "+
		 "  ?interests ?rdfi ?interest "+
		 "  FILTER regex(?name, 'user-name-replacement', 'i') "+
		 "  FILTER isLiteral(?interest) "+
		 "} ";

//	the SPARQL query to get user interests, according to user uri
	public String queryOfUserInterest2
		="PREFIX foaf:	<http://xmlns.com/foaf/0.1/> "+
		 " SELECT ?interest "+
		 " WHERE "+
		 "  { "+
		 "  <user-URI-replacement> foaf:topic_interest ?interests . "+
		 "  ?interests ?rdfi ?interest . "+
		 "  FILTER isLiteral(?interest) "+
		 "} ";
	
//	the SPARQL query to select subset, according to user interests
	public String querySubsetTemplate=		 
		 " DESCRIBE  ?resource "+
		 " WHERE "+
		 "  { "+
		 "  ?resource [-IRP-] ?literal .  "+
		 "  FILTER regex(?literal, 'search-term-replacement', 'i')  "+
		 "} ";

	public ContextImpl() {
		super();
	}


	public ContextImpl(String uiDataUri, String userUri, String iRP) {
		super();
		this.uiDataUri = uiDataUri;
		this.userUri = userUri;
		IRP = iRP;
		querySubsetTemplate = querySubsetTemplate.replace("[-IRP-]", IRP);
	}


	public ContextImpl(UserInterests userInterests, String iRP) {
		super();
		this.userInterests = userInterests;
		IRP = iRP;
		querySubsetTemplate = querySubsetTemplate.replace("[-IRP-]", IRP);
	}
	
	public String getIRP(){
		return IRP;
	}
	
	public UserInterests getUserInterests(){
		if(userInterests==null){	
			userInterests = getUserInterestsFromUserInterestDataset();
		}
		return userInterests;
	}
	
	public UserInterests getUserInterestsFromUserInterestDataset(){
		ArrayList<String> uInterests=new ArrayList<String>();

		DataFactory df = DataFactory.INSTANCE;
		
		SPARQLQuery query =null;			
		if(userUri!=null)
			query=df.createSPARQLQuery(queryOfUserInterest2.replace("user-URI-replacement", userUri));
		else
			query=df.createSPARQLQuery(queryOfUserInterest.replace("user-name-replacement", userName));
		
		if(userInterestInfo==null){
			String uriName = new File(uiDataUri).toURI().toString();			
			userInterestInfo=DataFactory.INSTANCE.createRemoteRdfGraph(new URIImpl(uriName));			
		}
		
		VariableBinding results = new SPARQLQueryExecutor().executeSelect(query, userInterestInfo);
	
		CloseableIterator iter= results.iterator();		
		int i=0;
		while(iter.hasNext()){	
			Binding solution=(Binding)iter.next();		
			String ui=solution.getValues().get(0).toString();
			uInterests.add(ui.substring(1, ui.length()-1));			
			i++;
			if(i>=9) break;
		}		
		
		return new UserInterests(uInterests);
	}
	
//	create queries to select subsets£¬according to user interest
	public List<SPARQLQuery> creatQueriesToGetSubset(String queryTemplate,List<String> userInterests){	
		Logger log = LoggerFactory.getLogger(ContextImpl.class);
		List<SPARQLQuery> queries=new ArrayList();
		
		for(int i=0;i<userInterests.size();i++){

			String searchTerm=userInterests.get(i);
			String querySubset=querySubsetTemplate.replace("search-term-replacement", searchTerm);
			SPARQLQuery query=null;
			try{
				query=DataFactory.INSTANCE.createSPARQLQuery(querySubset);
			}catch(Exception e){
//				e.printStackTrace();
				log.info(querySubset);
			}
			queries.add(query);			
		}	
		return queries;
	}
	
//	create queries to select subsets£¬according to user interest
	public List<SPARQLQuery> creatQueriesToGetSubset(){
		return creatQueriesToGetSubset(querySubsetTemplate,getUserInterests().interests);
	}
	
//	create single query to select subsets£¬according to user interests
	public SPARQLQuery creatSingleQueryToGetSubset(String queryTemplate,List<String> userInterests){	
		Logger log = LoggerFactory.getLogger(ContextImpl.class);

		String searchTerm = userInterests.get(0);
		for(int i=1;i<userInterests.size();i++){
			searchTerm += "|"+userInterests.get(i);
		}
		String querySubset = querySubsetTemplate.replace(
				"search-term-replacement", searchTerm);
		SPARQLQuery query = null;
		try {
			query = DataFactory.INSTANCE.createSPARQLQuery(querySubset);
		} catch (Exception e) {
			// e.printStackTrace();
			log.info(querySubset);
		}

		return query;
	}
	
//	create queries to select subsets£¬according to user interest
	public SPARQLQuery creatSingleQueryToGetSubset(){
		return creatSingleQueryToGetSubset(querySubsetTemplate,getUserInterests().interests);
	}
}
