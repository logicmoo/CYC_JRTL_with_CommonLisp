package eu.larkc.plugin.reason.pion;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.model.impl.LiteralImpl;
import org.openrdf.model.impl.URIImpl;
import org.semanticweb.owl.apibinding.OWLManager;
import org.semanticweb.owl.model.OWLDataFactory;
import org.semanticweb.owl.model.OWLOntology;
import org.semanticweb.owl.model.OWLOntologyManager;
import org.w3c.dom.Document;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hp.hpl.jena.graph.Triple;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.sparql.core.BasicPattern;

import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.BooleanInformationSetImpl;
import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.data.VariableBinding.Binding;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.reason.Reasoner;
import eu.larkc.plugin.reason.OWLAPIReasoner.OWLAPIReasoner;
import eu.larkc.plugin.reason.OWLAPIReasoner.OWLAnswer;
import eu.larkc.plugin.reason.OWLAPIReasoner.OWLProcess;
import eu.larkc.plugin.reason.OWLAPIReasoner.OWLReasonerFact;
import eu.larkc.plugin.reason.OWLAPIReasoner.Query2OWLQuery;
import eu.larkc.plugin.reason.OWLAPIReasoner.OWLAPIReasoner.WrappedIterator;

public class BasicOWLAPIReasoner implements Reasoner {
	
	public static OWLOntology ontology;
	
	public static List resultVars = null;
	private List<String> workingVars = new ArrayList<String>();
	
	private static  BasicPattern unprocessedPattern = new BasicPattern();
	private static  boolean unprocessedPatternStatus = true;
	
	private String currentVar = "";
	private List<String> currentBinding = new ArrayList<String>();
	private String currentLiteral = "";
	
	private String ClassDes="BasicOWLAPIReasoner";
	
	private String defaultKB = "kb";
	
	
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
	public BooleanInformationSet sparqlAsk(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {
		// TODO Auto-generated method stub
		
		com.hp.hpl.jena.query.Query query = QueryFactory.create(theQuery.toString());
	
		BasicPattern triples = Query2OWLQuery.getBasicPattern(query); 
		
		Query2OWLQuery qd = new Query2OWLQuery();
		String owlQueryBody =qd.BasicPattern2OWLQueryString(triples);
		
		Document doc = OWLAPIReasoner.QueryBodyString2Document(owlQueryBody);
		
		OWLOntologyManager manager = OWLManager.createOWLOntologyManager();

		org.mindswap.pellet.owlapi.Reasoner reasoner = new org.mindswap.pellet.owlapi.Reasoner( manager );
			
		reasoner.clearOntologies();
		reasoner.loadOntology(ontology);

		OWLDataFactory factory = manager.getOWLDataFactory();
		
		boolean answer = OWLProcess.OWLQueryDocment2Ask(doc, reasoner, factory);

		
		return new BooleanInformationSetImpl( answer );
	}

	@Override
	public SetOfStatements sparqlConstruct(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {
		throw new UnsupportedOperationException();
		// TODO Auto-generated method stub
	
	}

	@Override
	public SetOfStatements sparqlDescribe(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public VariableBinding sparqlSelect(SPARQLQuery theQuery,
			SetOfStatements statements, Contract contract,
			Context context) {
		// TODO Auto-generated method stub

		Logger log = LoggerFactory.getLogger(BasicOWLAPIReasoner.class);
		
	    workingVars.clear();

		List<List<String>> resultSet = new ArrayList<List<String>>();
		
		VariableBinding vb;
		
		com.hp.hpl.jena.query.Query query = QueryFactory.create(theQuery.toString());
		
		BasicPattern triples = Query2OWLQuery.getBasicPattern(query); 
		
		Query2OWLQuery qd = new Query2OWLQuery();
		String owlQueryBody =qd.BasicPattern2OWLQueryString(triples);
		
		unprocessedPattern = qd.unprocessedPattern;
		unprocessedPatternStatus = qd.unprocessedPatternStatus;
		
		Document doc = OWLAPIReasoner.QueryBodyString2Document(owlQueryBody);
		
		OWLReasonerFact reasonerFact = OWLProcess.getOWLReasonerFactfromStatements(statements);
		org.mindswap.pellet.owlapi.Reasoner reasoner = reasonerFact.reasoner;
		OWLDataFactory factory = reasonerFact.factory;
		OWLOntology ontology = reasonerFact.ontology;
		OWLOntologyManager manager = reasonerFact.manager;
		
			
		reasoner.clearOntologies();
		reasoner.loadOntology(ontology);

		
		List<OWLAnswer> owlAnswers  =OWLProcess.OWLQueryDocument2Answers(doc, reasoner, factory);
    	
   	 log.info("["+ ClassDes+ "]the owlAnswers= " + owlAnswers);
			
   	if (!owlAnswers.equals(null))
       {
  			
  			OWLAnswer owlAnswer =OWLProcess.getCommonAnswer(owlAnswers);
  			currentBinding = owlAnswer.currentBinding;
  			currentVar = owlAnswer.currentVar;
//  			 System.out.println("[SimplePIONReasoner:sparqlSelect]*** currentVar is " + currentVar);
//  			System.out.println("[SimplePIONReasoner:sparqlSelect]*** currentBinding is " + currentBinding);

  			};

       resultSet = OWLProcess.addValues2BindingSet(resultSet, currentBinding, currentLiteral, 1);

//       System.out.println("[SimplePIONReasoner:sparqlSelect]***Resultset is " + resultSet);
		 
		workingVars.add(currentVar);
		
		int counter =-1;
		
//       System.out.println("[SimplePIONReasoner:sparqlSelect]the  unprocessedPattern is " + unprocessedPattern);
//       System.out.println("[SimplePIONReasoner:sparqlSelect]the  unprocessedPatternStatus is " + unprocessedPatternStatus);
		
		
		if (!unprocessedPattern.isEmpty()&& unprocessedPatternStatus){
			
			BasicPattern pattern = unprocessedPattern;

           counter++;
           
          

			String kb=defaultKB;
			
			resultSet = getResultSetFromAnswerandPattern(resultSet, currentVar, currentBinding, currentLiteral, pattern, reasonerFact, kb, counter);
			
           log.info("["+ ClassDes+ "]the  new result set is " + resultSet);
			 
		};
		
	

	    Iterator<List<String>> iter4 = resultSet.iterator();
	       
		vb= convertQueryResult(iter4);
		
		
		return vb;
	}

	@Override
	public URI getIdentifier() {
		// TODO Auto-generated method stub
		return new URIImpl(
		"http://eu.larkc.plugin.reason.owlapi.BasicOWLAPIReasoner");
	}

	@Override
	public QoSInformation getQoSInformation() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Value convert(String value) {
		return new LiteralImpl(value);
	} 


	private VariableBinding convertQueryResult(final Iterator<List<String>> iter) {
		return new VariableBinding() {

//			private static final long serialVersionUID = 1;

			@SuppressWarnings("unchecked")
			public List<String> getVariables() {
				List list = resultVars;
//				List list = workingVars;
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
	
	private static List<OWLAnswer> getAnswersFromReasonerFactonPattern(BasicPattern triples, OWLReasonerFact reasonerFact, String kb)
	{
		List<OWLAnswer> answers = new ArrayList<OWLAnswer>();
		
		String owlQuery = "";
		

		Query2OWLQuery qd = new Query2OWLQuery();
		String owlQueryBody =qd.BasicPattern2OWLQueryString(triples);
		
		unprocessedPattern = qd.unprocessedPattern;
		unprocessedPatternStatus = qd.unprocessedPatternStatus;
		
//		OWLQuery query = new OWLQuery();
		
		Document doc = QueryBodyString2Document(owlQueryBody);
		
		answers = OWLProcess.OWLQueryDocument2Answers(doc, reasonerFact.reasoner, reasonerFact.factory);


		return answers;
	}

	private List<List<String>>  getResultSetFromAnswerandPattern(List<List<String>> currentResultSet, String var, List<String> binding, String literal, BasicPattern pattern, OWLReasonerFact reasonerFact, String kb, int counter)
	{
		
		List<List<String>> newResultSet = new ArrayList<List<String>>();
		
		if (pattern.isEmpty())
		{newResultSet = currentResultSet; }
		else {
			
		
		
		Iterator<String>  iter = binding.iterator();
	    
		
	    while(iter.hasNext()){
	    	
			List<List<String>> localResultSet = new ArrayList<List<String>>();
	    	
	    	String value=iter.next();
	    	
//			System.out.println("[OWLProcess] currentVar = " + currentVar);
	    	
		BasicPattern newpattern = new BasicPattern();
		
		newpattern = OWLProcess.applyBinding2Pattern(var, value, pattern);	
		
//		System.out.println("[OWLProcess]* newpattern = " + newpattern);
	    
		List<OWLAnswer> answers= getAnswersFromReasonerFactonPattern(newpattern, reasonerFact, kb);
		
		
//		System.out.println("[DIGReasoner]* unprocessed pattern = " + newpattern);
		
		if (!answers.equals(null))
		{
			
			
			int l = answers.size();
			
			int i = 0;
			
			for (i = 0; i < answers.size(); i++) { 

		   List<List<String>> tmpResultSet = new ArrayList<List<String>>();
				
			
			OWLAnswer answer4 =answers.get(i);
		   
			
	        tmpResultSet = OWLProcess.addValues2BindingSet(currentResultSet, answer4.currentBinding, answer4.currentLiteral, counter);
	        
	        BasicPattern newunprocessedPattern = new BasicPattern(newpattern);
	        
			List<List<String>> newLocalResultSet = new ArrayList<List<String>>();
	        
	        if (!newunprocessedPattern.isEmpty()){      	
			
			int newcounter = counter +1;
				
			newLocalResultSet=	getResultSetFromAnswerandPattern(tmpResultSet, answer4.currentVar, answer4.currentBinding, answer4.currentLiteral, newunprocessedPattern, reasonerFact, kb, newcounter);
				   		
				
	        } else {newLocalResultSet=tmpResultSet;};
	        
	        
	        
	        localResultSet.addAll(newLocalResultSet);
	        
			};
			
		};
		
//	 	   System.out.println("[OWLProcess] newpattern = " + newpattern);
			
	    
		
	    newResultSet.addAll(localResultSet);
		
	    };
	    
	    
	    workingVars.add(var);
	    
//		   System.out.println("[DIGReasoner] existing pattern = " + pattern);
		   
		   Iterator<Triple>  iter3 = pattern.iterator();
		   while (iter3.hasNext()){
			   Triple t = iter3.next(); 
//		 	   System.out.println("[DIGReasoner] element = " + t + " has removed from the pattern ");
			   iter3.remove();
		 	   };
		   
	    
		}// end of else;
		
		
//		DIGProcess.PrintResultSet(newResultSet);
		
		return newResultSet;
	}

	public static Document QueryBodyString2Document(String owlQuery)
	{
		Document doc = null;
		
		String data =
			"<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
		 + "<RequestMessage xmlns=\"http://www.owllink.org/owllink-xml#\"\n"
		  +  "xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
		 +   "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n"
		  +  "xsi:schemaLocation=\"http://www.owllink.org/owllink-xml#\n"
		   +   "http://www.owllink.org/owllink-xml-20091023.xsd\">\n"
	       + owlQuery
	       + "\n</RequestMessage>"; 

		
		try {
			doc = loadXMLFromString(data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return doc;
		
	}
	
	public static Document loadXMLFromString(String xml) throws Exception
	{
	    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

	    factory.setNamespaceAware(true);
	    DocumentBuilder builder = factory.newDocumentBuilder();

	    return builder.parse(new ByteArrayInputStream(xml.getBytes()));
	}

}
