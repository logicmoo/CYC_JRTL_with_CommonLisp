//package eu.larkc.plugin.reason.dig;
package eu.larkc.plugin.reason.DIGReasoner;

/*
 * Copyright (c) 2009 License_Type (if there is a Copyright, please enter it here)
 * 
 * Licensed under the XXX License, Version X.X (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.copyofthelicense.org/licenses/LICENSE-X.X
 * 
 * If there is additional text which is related to licensing issues,
 * please enter it here. You can Copy and Paste the author and licensing issues
 * from the SourceCode file.
 * 
 * Information about authors: 
 * 
 * Zhisheng Huang (huang@few.vu.nl), Vrije Universiteit Amsterdam
 * Gaston Tagni (gtagni@few.vu.nl), Vrije Universiteit Amsterdam 
 * 
 */



import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.model.impl.BNodeImpl;
import org.openrdf.model.impl.LiteralImpl;
import org.openrdf.model.impl.URIImpl;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.hp.hpl.jena.graph.Triple;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.sparql.core.BasicPattern;



import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.BooleanInformationSetImpl;
import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.DataFactory;
import eu.larkc.core.data.RdfGraph;
import eu.larkc.core.data.SetOfStatements;
//import eu.larkc.core.data.TripleSet;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.data.VariableBinding.Binding;
import eu.larkc.core.metadata.MetaData;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.Query;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.reason.Reasoner;


/**
 * This class implements a LarKC reasoner plug-in that uses a DIG reasoner to answer queries.
 * It can handle OWL ontologies.
 * The current version does not provide an implementation for the methods sparqlConstruct() and sparqlDescribe()
 * 
 * @implements eu.larkc.plugin.reason.Reasoner
 * 
 * @author Zhisheng Huang and Gaston Tagni 
 * */
@SuppressWarnings("unused")
public class DIGReasoner implements Reasoner {
	
	public String hostname = "localhost";
	public int port = 8080; // default port for Racer
	public String path = "/";
	private Query aQuery;
	
	private BasicPattern unprocessedPattern = new BasicPattern();
	private boolean unprocessedPatternStatus = true;
	
	private String currentVar = "";
	private List<String> currentBinding = new ArrayList<String>();
	private String currentLiteral = "";
	@SuppressWarnings("unchecked")
	private List resultVars = null;
	private List<String> workingVars = new ArrayList<String>();
	
	
	/* An id to identify this reasoner */
	private String reasonerID = "eu.larkc.plugin.reason.SPARQL2DIGReasoner";
	
	/**
	 * Implements a method that processes SPARQL ASK queries
	 * @param theQuery the SPARQLQuery to be resolved
	 * @param theTripleSet the TripleSet representation of the data upon which the query should be resolved
	 * @param contract the QoS contract
	 * @return a BooleanInformationSet with the result of the SPARQL ASK query
	 * @implements Reasoner.sparqlAsk
	 * 
	 * @author Zhisheng Huang and Gaston Tagni
	 * */
	public BooleanInformationSet sparqlAsk(SPARQLQuery theQuery, SetOfStatements statements, Contract contract, Context cxt) {

		final String newDIGQuery = null;
		
	  // status = true: need not to process rest of query, status = false: need to continue processing rest of query,
		boolean status = false;
		Document document = null;
		String digQuery = "";
		
	  // default value of the query answer;
		boolean result = false;
		
		DIGServer digServer = getDIGServer();    
		String kb= getNewKBfromDIGServer(digServer);
		document = tellData2DIGServer(theQuery, statements, kb, digServer);
		
		if (!document.equals(null)){
			List<DIGAnswer> answers2 = new ArrayList<DIGAnswer>();
			answers2 = DIGProcess.Document2Answers(document);
	        
			if (answers2.get(0).answerType.equals("true")){
				result = true; 
				status = false;
			}
			else if (answers2.get(0).answerType.equals("false")){
				result = false; 
				status = true;
			}
			else if (answers2.get(0).answerType.equals("accepted")){
				result = true; 
				status = false;
			}// to support 3-valued system like PION
			else {
				result = false; 
				status = true;
			}
		}
		while(!unprocessedPattern.isEmpty()&& unprocessedPatternStatus && !status){
			BasicPattern pattern = unprocessedPattern;
			document = getDocumentFromServerBasedonPattern(pattern, digServer, kb);
			if (!document.equals(null)){
				List<DIGAnswer> newanswers = new ArrayList<DIGAnswer>();
				newanswers = DIGProcess.Document2Answers(document);
				if ((newanswers.get(0).answerType).equals("true")){
					result = true;
				} 
				else if ((newanswers.get(0).answerType).equals("accepted")){
					result = true;
				} 
				else{
					result=false; 
					status=true;
				}
			}
		}
		return new BooleanInformationSetImpl( result);
	}

	@Override
	public RdfGraph sparqlConstruct(SPARQLQuery theQuery,
		SetOfStatements theTripleSet, Contract contract, Context cxt) {
		throw new UnsupportedOperationException();
	}

	@Override
	public RdfGraph sparqlDescribe(SPARQLQuery theQuery,
		SetOfStatements theTripleSet, Contract contract, Context cxt) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Implements a method that processes SPARQL SELECT queries
	 * @param theQuery the SPARQLQuery to be resolved
	 * @param theTripleSet the TripleSet representation of the data upon which the query should be resolved
	 * @param contract the QoS contract
	 * @return a VariableBinding with the result of the SPARQL SELECT query as a set of variable bindings
	 * @implements Reasoner.sparqlAsk
	 * 
	 * @author Zhisheng Huang and Gaston Tagni
	 * */	
	@Override
	public VariableBinding sparqlSelect(SPARQLQuery theQuery, SetOfStatements statements, Contract contract, Context cxt) {
		Logger log = LoggerFactory.getLogger(DIGReasoner.class);
        workingVars.clear();
        
		String newDIGQuery = null;
		Document document = null;
		String digQuery="";
		boolean result = false;
		List<List<String>> resultSet = new ArrayList<List<String>>();
		
        VariableBinding vb = null;
        
        DIGServer digServer = getDIGServer();

		String kb= getNewKBfromDIGServer(digServer);
		

		document = tellData2DIGServer(theQuery, statements, kb, digServer);
		

		
		if (!document.equals(null))
			{
			
			List<DIGAnswer> answers3 = DIGProcess.Document2Answers(document);
			DIGAnswer digAnswer =getCommonAnswer(answers3);
			
			log.info("[DIGReasoner]  the binding of common answers = " + digAnswer.currentBinding);
			log.info("[DIGReasoner]  the current var of common answers = " + digAnswer.currentVar);
			log.info("[DIGReasoner]  the current literal = " + digAnswer.currentLiteral);
		
			
			
	//		DIGAnswer digAnswer =answers3.get(0);
			currentBinding = digAnswer.currentBinding;
			currentVar = digAnswer.currentVar;
			

			};
			
			
			resultSet = DIGProcess.addValues2BindingSet(resultSet, currentBinding, currentLiteral, 1);
			
			workingVars.add(currentVar);
			
			
	//		int counter =1;
			int counter =-1;
			
//			List<List<String>> newResultSet = new ArrayList<List<String>>();
		
		if (!unprocessedPattern.isEmpty()&& unprocessedPatternStatus){
			
			BasicPattern pattern = unprocessedPattern;
            
            counter++;
		    
		    String digQueryBody="";
		    
	//	    Iterator<String>  iter = currentBinding.iterator();
		    

			
			resultSet = getResultSetFromAnswerandPattern(resultSet, currentVar, currentBinding, currentLiteral, pattern, digServer, kb, counter);
			
		    
		};
		
		

//		DIGProcess.PrintResultSet(resultSet);
		
	    Iterator<List<String>> iter4 = resultSet.iterator();
	       
		vb= convertQueryResult(iter4);
		
		
		return vb;
	}
	
	private List<List<String>>  getResultSetFromAnswerandPattern(List<List<String>> currentResultSet, String var, List<String> binding, String literal, BasicPattern pattern, DIGServer digServer, String kb, int counter)
	{
		
		List<List<String>> newResultSet = new ArrayList<List<String>>();
		
		if (pattern.isEmpty())
		{newResultSet = currentResultSet; }
		else {
			
		
		
		Iterator<String>  iter = binding.iterator();
	    
		
	    while(iter.hasNext()){
	    	
			List<List<String>> localResultSet = new ArrayList<List<String>>();
	    	
	    	String value=iter.next();
	    	
//			System.out.println("[DIGReasoner] currentVar = " + currentVar);
	    	
		BasicPattern newpattern = new BasicPattern();
		
		newpattern = DIGProcess.applyBinding2Pattern(var, value, pattern);	
		
//		System.out.println("[DIGReasoner]* newpattern = " + newpattern);
	    
		Document document = getDocumentFromServerBasedonPattern(newpattern, digServer, kb);
		
		
//		System.out.println("[DIGReasoner]* unprocessed pattern = " + newpattern);
		
		if (!document.equals(null))
		{
			

			List<DIGAnswer> answers4 = DIGProcess.Document2Answers(document);
			
			int l = answers4.size();
			
			int i = 0;
			
			for (i = 0; i < answers4.size(); i++) { 

		   List<List<String>> tmpResultSet = new ArrayList<List<String>>();
				
			
			DIGAnswer digAnswer4 =answers4.get(i);
		   
			
            tmpResultSet = DIGProcess.addValues2BindingSet(currentResultSet, digAnswer4.currentBinding, digAnswer4.currentLiteral, counter);
            
            BasicPattern newunprocessedPattern = new BasicPattern(newpattern);
            
			List<List<String>> newLocalResultSet = new ArrayList<List<String>>();
            
            if (!newunprocessedPattern.isEmpty()){      	
			
    		int newcounter = counter +1;
    			
    		newLocalResultSet=	getResultSetFromAnswerandPattern(tmpResultSet, digAnswer4.currentVar, digAnswer4.currentBinding, digAnswer4.currentLiteral, newunprocessedPattern, digServer, kb, newcounter);
    			   		
    			
            } else {newLocalResultSet=tmpResultSet;};
            
            
            
            localResultSet.addAll(newLocalResultSet);
            
			};
			
		};
		
//	 	   System.out.println("[DIGReasoner] newpattern = " + newpattern);
			
        
		
	    newResultSet.addAll(localResultSet);
		
	    };
	    
	    
	    workingVars.add(var);
	    
 //	   System.out.println("[DIGReasoner] existing pattern = " + pattern);
 	   
 	   Iterator<Triple>  iter3 = pattern.iterator();
 	   while (iter3.hasNext()){
 		   Triple t = iter3.next(); 
// 	 	   System.out.println("[DIGReasoner] element = " + t + " has removed from the pattern ");
 		   iter3.remove();
 	 	   };
 	   
	    
		}// end of else;
		
		
//		DIGProcess.PrintResultSet(newResultSet);
		
		return newResultSet;
	}
	
	private Value convert(String value) {
			return new LiteralImpl(value);
		} 
	
	private VariableBinding convertQueryResult(final Iterator<List<String>> iter) {
		return new VariableBinding() {

	//		private static final long serialVersionUID = 1;

			@SuppressWarnings("unchecked")
			public List<String> getVariables() {
				List list = resultVars;
				return list;
			}

			public CloseableIterator<Binding> iterator() {
				Binding currentBindings = null;
				
				List<Binding> newResult = new ArrayList<Binding>();
								
//				Iterator<List<String>> iter = rs.iterator();
				
				while (iter.hasNext()) {
					final List<String> solution = iter.next();
					final List<Value> result = new ArrayList<Value>();
					
					Iterator<String> names = solution.iterator();
					
					while (names.hasNext()) {
						String current = (String) names.next();
						result.add(convert(current));
//						System.out.println("adding "+ current);
					};
					
					currentBindings = new Binding() {
						public List<Value> getValues() {
//							System.out.println("return the result "+ result);
							return result;
						}
					};
					
					newResult.add(currentBindings);
					
				};
				
//				Iterator<Binding> newIter =  newResult.iterator();
				
				return new WrappedIterator(newResult);
			}
		};
	}

	public class WrappedIterator implements CloseableIterator<Binding> {
		
		List<Binding> res = new ArrayList<Binding>();
		Iterator<Binding> iter;

		public WrappedIterator(List<Binding> currentBindings) {
			res = currentBindings;
			iter = res.iterator();
		}

		public void close() {
		}

		public boolean hasNext() {
			return iter.hasNext();
		}

		public boolean isClosed() {
			return false;
		}

		public Binding next() {
			try {
				return iter.next();
			} finally {
				res = null;
			}
		}
		public void remove() {
		}
	}

	@Override
	public URI getIdentifier() {
		return new URIImpl("http://eu.larkc.plugin.reason.dig.DIGReasoner");
	}

	public MetaData getMetaData() {
		throw new UnsupportedOperationException();
	}

	@Override
	public QoSInformation getQoSInformation() {
		throw new UnsupportedOperationException();
	}
	
	
	private Document getDocumentFromServerBasedonPattern(BasicPattern triples, DIGServer digServer, String kb){
		Logger log = LoggerFactory.getLogger(DIGReasoner.class);
		Document document = null;	
		String digQuery = "";
		String answer ="";
	
		Query2DIG qd = new Query2DIG();
		String digQueryBody =qd.BasicPattern2DIG(triples);
		
		this.unprocessedPattern = qd.unprocessedPattern;
		this.unprocessedPatternStatus = qd.unprocessedPatternStatus;
		
		//		System.out.println("*digQueryBody="+digQueryBody);
		//		System.out.println("*unprocessedPattern="+unprocessedPattern);
			
		if (!digQueryBody.equals("")){
		digQuery = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n" + "<asks xmlns=\"http://dl.kr.org/dig/2003/02/lang\" "+
							 "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" " + 
							 "xsi:schemaLocation=\"http://dl-web.man.ac.uk/dig/2003/02/dig.xsd\" uri=" + kb + ">\n"+ digQueryBody + "</asks>\n";
			
		log.info("[DIGReasoner] Sending query to DIG Server");
		log.info(digQuery);
		log.info("");

		answer = digServer.post(digQuery);  
		log.info("[DIGReasoner] The answer from the DIG server is: ");
		log.info(answer);
		log.info("");
				
		document = DIGProcess.Response2Document(answer);
		
		} 
		else {
			log.info("unsupported query basic pattern:"+triples);
		}   

		return document;
	}
	
	private Document tellData2DIGServer(SPARQLQuery theQuery, SetOfStatements statements, String kb, DIGServer digServer){
		Document document;
    String answer;
 
		TellDIG digHandler = new TellDIG(digServer);
		RdfGraph graph = (RdfGraph) statements;
		URI uri= graph.getName();	
	  answer = digHandler.TellDIGServer(this.hostname, this.port, this.path, uri.toString(), kb);
	  //System.out.println("[DIGReasoner] The data has been told. The answer from the dig server is: " + answer);  
		com.hp.hpl.jena.query.Query query = QueryFactory.create(theQuery.toString());
		resultVars = query.getResultVars();
		BasicPattern triples = Query2DIG.getBasicPattern(query); 
		document = getDocumentFromServerBasedonPattern(triples, digServer, kb);
		return document;
	}
	
	private String getNewKBfromDIGServer(DIGServer digServer){
		/* Ask the DIG Server to create a new KB in the DIG Reasoner */
		Logger log = LoggerFactory.getLogger(DIGReasoner.class);
		String answer = digServer.newKB();

		log.info("[DIGReasoner] Response from the DIG Server after creating KB");
		log.info(answer);
		log.info("");
		Document document0 = DIGProcess.Response2Document(answer); 

		List<DIGAnswer> answers0 = new ArrayList<DIGAnswer>();

		answers0 = DIGProcess.Document2Answers(document0);
      
		// DIGResponse response = new DIGResponse( DIGConstants.ALLCONCEPTS );

		int i = answers0.get(0).answerID.indexOf("uri=");
		String kb = answers0.get(0).answerID.substring(i+4); 
		return kb;
	}

	private DIGServer getDIGServer(){
		DIGServer digServer = new DIGServer();
		digServer.setDIGServerURI(this.hostname, this.port, this.path);
		return digServer;
	}

	private DIGAnswer getCommonAnswer(List<DIGAnswer> answers){ 
		DIGAnswer answer = answers.get(0);
		List<String> binding = answer.currentBinding;
		String var = answer.currentVar;

		Iterator<String> iter = binding.iterator();
		while (iter.hasNext()){
			String value = iter.next();
			for (int i=1;i< answers.size();i++){
				DIGAnswer answeri= answers.get(i);
				List<String> bindingi = answeri.currentBinding;
				String vari = answeri.currentVar;
				if (!bindingi.contains(value) && vari.equals(var)) {
					iter.remove();
					//	  System.out.println("[DIGReasoner] removing " + value);		
				}
			}
		}
		answer.currentBinding = binding;
		return answer;
	}

}
