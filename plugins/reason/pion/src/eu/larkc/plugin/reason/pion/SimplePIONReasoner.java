package eu.larkc.plugin.reason.pion;

import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;



import com.hp.hpl.jena.graph.Triple;
import com.hp.hpl.jena.query.QueryFactory;

import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.model.impl.LiteralImpl;
import org.openrdf.model.impl.URIImpl;
import org.semanticweb.owl.apibinding.OWLManager;
import org.semanticweb.owl.model.OWLClass;
import org.semanticweb.owl.model.OWLDataFactory;
import org.semanticweb.owl.model.OWLOntology;
import org.semanticweb.owl.model.OWLOntologyCreationException;
import org.semanticweb.owl.model.OWLOntologyManager;
import org.w3c.dom.Document;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hp.hpl.jena.sparql.core.BasicPattern;


import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.BooleanInformationSetImpl;
import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.RdfGraph;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.data.VariableBinding.Binding;
import eu.larkc.core.metadata.MetaData;
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



public class SimplePIONReasoner implements Reasoner{
	
	private static  BasicPattern unprocessedPattern = new BasicPattern();
	private static  boolean unprocessedPatternStatus = true;
	
	private String currentVar = "";
	private List<String> currentBinding = new ArrayList<String>();
	private String currentLiteral = "";
	@SuppressWarnings("unchecked")
	private List resultVars = null;
	private List<String> workingVars = new ArrayList<String>();
	
	private String defaultKB = "kb";
	
	private String ClassDes="SimplePIONReasoner";
	
	/* An id to identify this reasoner */
	private String reasonerID = "eu.larkc.plugin.reason.pion.SimplePIONReasoner";
	
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

	public BooleanInformationSet sparqlAsk(SPARQLQuery theQuery,
			SetOfStatements statements, Contract contract, Context context) {
		// TODO Auto-generated method stub
		Logger log = LoggerFactory.getLogger(SimplePIONReasoner.class);
	   BooleanInformationSet answer;
	
	  // status = true: need no processing rest part of the query, status = false: need to continue processing,
		boolean status = false;

		
	  // default value of the query answer;
		boolean result = false;
		
		String kb = defaultKB;
		
		Query2OWLQuery.thisKB = kb;
		
		
		OWLReasonerFact reasonerFact = OWLProcess.getOWLReasonerFactfromStatements(statements);

		org.mindswap.pellet.owlapi.Reasoner reasoner = reasonerFact.reasoner;
		OWLDataFactory factory = reasonerFact.factory;
		OWLOntology ontology = reasonerFact.ontology;
		OWLOntologyManager manager = reasonerFact.manager;
		
		
		boolean consistency = IsConsistent(statements);
		
		if (consistency){
			 log.info("[SimplePION]the ontology is consistent\nStarting the standard reasoning processing\n");	
			
			 OWLAPIReasoner owlapiReasoner = new OWLAPIReasoner();
			 
			 answer = owlapiReasoner.sparqlAsk(theQuery, statements, contract, context);
			 
		} else {
			
			log.info("[SimplePION]the ontology is not consistent\nStarting the PION reasoning processing\n");	
			
		
		com.hp.hpl.jena.query.Query query = QueryFactory.create(theQuery.toString());
		

		
		BasicPattern triples = Query2OWLQuery.getBasicPattern(query); 
	

	String owlQuery = Query2OWLQuery.BasicPattern2OWLQueryString(triples);

	Document doc= QueryBodyString2Document(owlQuery);
	
   
    
	log.info("[SimplePIONReasoner]the query is "+theQuery);
    List<String> literals = PIONSelectionFunction.getLiteralsfromQuery(theQuery.toString());
//    System.out.println("[PIONReasoner]the constants of the query are "+constants);
 
 //   System.out.println("[SimplePIONReasoner]the ontology is "+ontology);
	OWLOntology selectedOntology = PIONSelectionFunction.selectionwithLiterals(ontology, literals);
//	 System.out.println("[PIONReasoner]the selectedOntology is "+selectedOntology);
//	 System.out.println("[PIONReasoner]the axioms of the selectedOntology is "+selectedOntology.getAxioms());

    
	 
	 
	 do {
    	  
		 log.info("[SimplePIONReasoner]the axioms of the new selectedOntology is\n"+selectedOntology.getAxioms());

        org.mindswap.pellet.owlapi.Reasoner reasoner2 = new org.mindswap.pellet.owlapi.Reasoner(manager);
    		
        consistency = PIONProcess.IsConsistent(reasoner2, factory, selectedOntology);
        
        log.info("[SimplePIONReasoner]the consistency status is "+ consistency);
	       
	if (consistency){
		

	   // System.out.println("*** starting OWLQueryDocuemnt2Ask ");
		result = PIONProcess.OWLQueryDocment2Ask(doc, reasoner2, selectedOntology, factory);};
		

	   // System.out.println("the  result is " + result);
	
	if (!result) {OWLOntology newSelectedOntology = PIONSelectionFunction.Selection(selectedOntology, ontology);
 	
	selectedOntology = newSelectedOntology;
	
	}
 	
    } 
    while(!result&& consistency);
	 
	answer= new BooleanInformationSetImpl( result );
	 
		} 
	
    //System.out.println("the  result0 is " + result);
 
    
	return answer;
	}



@Override
public SetOfStatements sparqlConstruct(SPARQLQuery arg0, SetOfStatements arg1,
		Contract arg2, Context arg3) {
	// TODO Auto-generated method stub
	throw new UnsupportedOperationException();
}



@Override
public SetOfStatements sparqlDescribe(SPARQLQuery arg0, SetOfStatements arg1,
		Contract arg2, Context arg3) {
	// TODO Auto-generated method stub
	throw new UnsupportedOperationException();
}



@Override
public VariableBinding sparqlSelect(SPARQLQuery theQuery, SetOfStatements statements,
		Contract contract, Context context) {
	// TODO Auto-generated method stub

		Logger log = LoggerFactory.getLogger(SimplePIONReasoner.class);
	
	    workingVars.clear();

		List<List<String>> resultSet = new ArrayList<List<String>>();
		
         VariableBinding vb = null;
     
           
		String kb = defaultKB;
		
		
		com.hp.hpl.jena.query.Query query = QueryFactory.create(theQuery.toString());
		
		resultVars = query.getResultVars();
		
		BasicPattern triples = Query2OWLQuery.getBasicPattern(query); 
		
	    //get a reasoner with relevant data 
		OWLReasonerFact reasonerFact = OWLProcess.getOWLReasonerFactfromStatements(statements);
		org.mindswap.pellet.owlapi.Reasoner reasoner = reasonerFact.reasoner;
		OWLDataFactory factory = reasonerFact.factory;
		OWLOntology ontology = reasonerFact.ontology;
		OWLOntologyManager manager = reasonerFact.manager;
		

		
		OWLAPIReasoner owlapiReasoner = new OWLAPIReasoner();
		
				
		String owlQuery = Query2OWLQuery.BasicPattern2OWLQueryString(triples);
//		System.out.println("["+ ClassDes+ "]owlQuery="+ owlQuery);
		
		unprocessedPattern = Query2OWLQuery.unprocessedPattern;
		unprocessedPatternStatus = Query2OWLQuery.unprocessedPatternStatus;
		
//		System.out.println("["+ ClassDes+ "]unprocessedPattern = " + unprocessedPattern + " unprocessedPatternStatus=" + unprocessedPatternStatus);
		
		Document doc= QueryBodyString2Document(owlQuery);
		
		boolean consistency = IsConsistent(statements);
	    
	    if (consistency){
	    	
	    log.info("["+ ClassDes+ "]the ontology is consistent");
		vb = owlapiReasoner.sparqlSelect(theQuery, statements, contract, context);  
	    }
	    else {
	    	
	    log.info("["+ ClassDes+ "]the query is "+theQuery);
	    List<String> constants = PIONSelectionFunction.getLiteralsfromQuery(theQuery.toString());
	   
	 
	    log.info("["+ ClassDes+ "]the ontology is "+ontology);

	    OWLOntology selectedOntology = PIONSelectionFunction.selectionwithLiterals(ontology, constants);
//		 System.out.println("["+ ClassDes+ "]the selectedOntology is "+selectedOntology);
//		 System.out.println("["+ ClassDes+ "]the axioms of the selectedOntology is "+selectedOntology.getAxioms());

	    OWLOntology thisSelectedOntology = null;
	    
	    boolean Status = true;//false = to stop; true = continue the processing
	    
		 do {
	    	  
			 	log.info("["+ ClassDes+ "]the axioms of the new selectedOntology is\n"+selectedOntology.getAxioms());

		        org.mindswap.pellet.owlapi.Reasoner reasoner2 = new org.mindswap.pellet.owlapi.Reasoner(manager);
		    		
		        consistency = PIONProcess.IsConsistent(reasoner2, factory, selectedOntology);
		        
		        log.info("["+ ClassDes+ "]the consistency status is "+ consistency);
			       
		        if (consistency){
		        	thisSelectedOntology = PIONSelectionFunction.Selection(selectedOntology, ontology);
		    	 	selectedOntology = thisSelectedOntology;
		        }
		        else {
		        		      	    		
 /*	
 	    		SetOfStatements smt2 = null;
	
		    		try {
						smt2 = PIONProcess.getSetOfStatements(thisSelectedOntology, manager);
					} catch (MalformedURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

		    		OWLAPIReasoner owlapiReasoner2 = new OWLAPIReasoner();
					
					vb = owlapiReasoner2.sparqlSelect(theQuery, smt2, contract, context);

 */	

  // /*
 		        	reasoner2.loadOntology(thisSelectedOntology);
		        	
		        	List<OWLAnswer> owlAnswers  =OWLProcess.OWLQueryDocument2Answers(doc, reasoner2, factory);
		        	
		        	log.info("["+ ClassDes+ "]the owlAnswers= " + owlAnswers);
						
		        	if (!owlAnswers.equals(null))
		            {
		       			
		       			OWLAnswer owlAnswer =OWLProcess.getCommonAnswer(owlAnswers);
		       			currentBinding = owlAnswer.currentBinding;
		       			currentVar = owlAnswer.currentVar;
//		       			 System.out.println("[SimplePIONReasoner:sparqlSelect]*** currentVar is " + currentVar);
//		       			System.out.println("[SimplePIONReasoner:sparqlSelect]*** currentBinding is " + currentBinding);

		       			};
			
		            resultSet = OWLProcess.addValues2BindingSet(resultSet, currentBinding, currentLiteral, 1);

//		            System.out.println("[SimplePIONReasoner:sparqlSelect]***Resultset is " + resultSet);
					 
					workingVars.add(currentVar);
					
					int counter =-1;
					
//		            System.out.println("[SimplePIONReasoner:sparqlSelect]the  unprocessedPattern is " + unprocessedPattern);
//		            System.out.println("[SimplePIONReasoner:sparqlSelect]the  unprocessedPatternStatus is " + unprocessedPatternStatus);
					
					
					if (!unprocessedPattern.isEmpty()&& unprocessedPatternStatus){
						
						BasicPattern pattern = unprocessedPattern;
       
			            counter++;
	
						resultSet = getResultSetFromAnswerandPattern(resultSet, currentVar, currentBinding, currentLiteral, pattern, reasonerFact, kb, counter);
						
						log.info("["+ ClassDes+ "]the  new result set is " + resultSet);
						 
					};
					
		   	    Iterator<List<String>> iter4 = resultSet.iterator();
		   	       
		   		 vb= convertQueryResult(iter4);	           
	
 //  */	
		           Status = false;
		        };
		     		
			 } while(consistency&&Status);
		 	 

	    }
	    

		 
	    //System.out.println("the  result0 is " + result);
   
		
	return vb;
}



@Override
public URI getIdentifier() {
	// TODO Auto-generated method stub
	return new URIImpl(
	"http://eu.larkc.plugin.reason.pion.SimplePIONReasoner");
}



@Override
public QoSInformation getQoSInformation() {
	// TODO Auto-generated method stub
	return null;
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



private Value convert(String value) {
	return new LiteralImpl(value);
} 

private VariableBinding convertQueryResult(final Iterator<List<String>> iter) {
return new VariableBinding() {

//		private static final long serialVersionUID = 1;

	@SuppressWarnings("unchecked")
	public List<String> getVariables() {
		List list = resultVars;
	//	List list = workingVars;
		return list;
	}

	public CloseableIterator<Binding> iterator() {
		Binding currentBindings = null;
		
		List<Binding> newResult = new ArrayList<Binding>();
						
//		Iterator<List<String>> iter = rs.iterator();
		
		while (iter.hasNext()) {
			final List<String> solution = iter.next();
			final List<Value> result = new ArrayList<Value>();
			
			Iterator<String> names = solution.iterator();
			
			while (names.hasNext()) {
				String current = (String) names.next();
				result.add(convert(current));
//				System.out.println("adding "+ current);
			};
			
			currentBindings = new Binding() {
				public List<Value> getValues() {
//					System.out.println("return the result "+ result);
					return result;
				}
			};
			
			newResult.add(currentBindings);
			
		};
		
//		Iterator<Binding> newIter =  newResult.iterator();
		
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
public static Document loadXMLFromString(String xml) throws Exception
{
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

    factory.setNamespaceAware(true);
    DocumentBuilder builder = factory.newDocumentBuilder();

    return builder.parse(new ByteArrayInputStream(xml.getBytes()));
}

private static List<OWLAnswer> getAnswersFromReasonerFactonPattern(BasicPattern triples, OWLReasonerFact reasonerFact, String kb)
{
	List<OWLAnswer> answers = new ArrayList<OWLAnswer>();
	
	String owlQuery = "";
	

	Query2OWLQuery qd = new Query2OWLQuery();
	String owlQueryBody =qd.BasicPattern2OWLQueryString(triples);
	
	unprocessedPattern = qd.unprocessedPattern;
	unprocessedPatternStatus = qd.unprocessedPatternStatus;
	
//	OWLQuery query = new OWLQuery();
	
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
    	
//		System.out.println("[OWLProcess] currentVar = " + currentVar);
    	
	BasicPattern newpattern = new BasicPattern();
	
	newpattern = OWLProcess.applyBinding2Pattern(var, value, pattern);	
	
//	System.out.println("[OWLProcess]* newpattern = " + newpattern);
    
	List<OWLAnswer> answers= getAnswersFromReasonerFactonPattern(newpattern, reasonerFact, kb);
	
	
//	System.out.println("[DIGReasoner]* unprocessed pattern = " + newpattern);
	
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
	
// 	   System.out.println("[OWLProcess] newpattern = " + newpattern);
		
    
	
    newResultSet.addAll(localResultSet);
	
    };
    
    
    workingVars.add(var);
    
//	   System.out.println("[DIGReasoner] existing pattern = " + pattern);
	   
	   Iterator<Triple>  iter3 = pattern.iterator();
	   while (iter3.hasNext()){
		   Triple t = iter3.next(); 
//	 	   System.out.println("[DIGReasoner] element = " + t + " has removed from the pattern ");
		   iter3.remove();
	 	   };
	   
    
	}// end of else;
	
	
//	DIGProcess.PrintResultSet(newResultSet);
	
	return newResultSet;
}

private boolean IsConsistent(SetOfStatements statements)
{
	OWLReasonerFact reasonerFact = OWLProcess.getOWLReasonerFactfromStatements(statements);

	org.mindswap.pellet.owlapi.Reasoner reasoner = reasonerFact.reasoner;
	OWLDataFactory factory = reasonerFact.factory;

	
	Set<OWLClass> incClasses = PIONProcess.getInconsistentClasses(reasoner, factory);
	    
     boolean result = incClasses.isEmpty();
	
	return result;
}

}
