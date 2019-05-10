package eu.larkc.plugin.decide.PIONDecider;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;
import org.semanticweb.owl.apibinding.OWLManager;
import org.semanticweb.owl.model.OWLClass;
import org.semanticweb.owl.model.OWLDataFactory;
import org.semanticweb.owl.model.OWLOntology;
import org.semanticweb.owl.model.OWLOntologyManager;
import org.w3c.dom.Document;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.sparql.core.BasicPattern;

import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.BooleanInformationSetImpl;
import eu.larkc.core.data.DataFactory;
import eu.larkc.core.data.RdfGraph;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.qos.QoSParameters;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.decide.Decider;
import eu.larkc.plugin.reason.OWLAPIReasoner.OWLAPIReasoner;
import eu.larkc.plugin.reason.OWLAPIReasoner.OWLProcess;
import eu.larkc.plugin.reason.OWLAPIReasoner.OWLReasonerFact;
import eu.larkc.plugin.reason.OWLAPIReasoner.Query2OWLQuery;
import eu.larkc.plugin.reason.pion.BasicOWLAPIReasoner;
import eu.larkc.plugin.reason.pion.PIONProcess;
import eu.larkc.plugin.reason.pion.PIONSelectionFunction;
import eu.larkc.plugin.select.PIONSelecter.SelectOntologyBasedOnQuery;
import eu.larkc.plugin.select.PIONSelecter.SelectOntologyFromOntology;

public class PIONDecider implements Decider {

	private String defaultKB = "kb";
	
	private String ClassDes="PIONDecider";	
	
	public SetOfStatements setOfStatements;
	public URI uri;
	
	
	private List resultVars = null;
//	private List<String> workingVars = new ArrayList<String>();
	

	
	/* An id to identify this reasoner */
	private String reasonerID = "eu.larkc.plugin.decider.PIONDecider";
	
	
	public PIONDecider(String ontologyFileName) {
		// TODO Auto-generated constructor stub
		
		URL url=null;
		try {
			url = new URL(ontologyFileName);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	
	RdfGraph graph = DataFactory.INSTANCE.createRemoteRdfGraph(new URIImpl(
			url.toString()));
	
	uri= graph.getName();
	
	setOfStatements = graph;
	
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

	public BooleanInformationSet sparqlAsk(SPARQLQuery theQuery,
			QoSParameters theQoSParameters) {
		  // status = true: need no processing rest part of the query, status = false: need to continue processing,
		Logger log = LoggerFactory.getLogger(PIONDecider.class);
		boolean status = false;
        
		BooleanInformationSet result = null;
		
		Contract contract=null; 
		Context context=null;
		
		SetOfStatements statements = setOfStatements;
		
		OWLOntology ontology =OWLProcess.getOWLOntology(statements);
		
		boolean consistency = IsConsistent(statements);
		
		if (consistency){
			 log.info("[PIONDecider]the ontology is consistent\nStarting the standard reasoning processing\n");	
			
			 OWLAPIReasoner owlapiReasoner = new OWLAPIReasoner();
			 
			 result = owlapiReasoner.sparqlAsk(theQuery, statements, contract, context);
			 
		} else {
			
	    log.info("[PIONDecider]the ontology is not consistent\nStarting the PION reasoning processing\n");	
			
			
		SelectOntologyBasedOnQuery selecter0 = new SelectOntologyBasedOnQuery();
		
		selecter0.theQuery = theQuery;
		
		selecter0.select(statements, contract, context);
		
		OWLOntology selectedOntology = selecter0.selectedOntology;
	 
	 do {
    	  
//		System.out.println("[PIONDecider]the axioms of the new selectedOntology is\n"+selectedOntology.getAxioms());

		
		consistency = IsConsistent(selectedOntology);
		
        
	if (!consistency){
		
		status = true;
		
		result = new BooleanInformationSetImpl( false );
		
	} else {
		
			
	    BasicOWLAPIReasoner reasoner2 = new BasicOWLAPIReasoner();
		
		reasoner2.ontology= selectedOntology;
		
		result = reasoner2.sparqlAsk(theQuery, statements, contract, context);};
		
		
		boolean thisResult = result.getValue();
		
		if (!thisResult){SelectOntologyFromOntology selecter2= new SelectOntologyFromOntology();
		
		selecter2.workingOntology= selectedOntology;
	
		selecter2.ontology = ontology;
		
		selecter2.select(statements, contract, context);
		
		OWLOntology newSelectedOntology = selecter2.selectedOntology;
		
		int i = selectedOntology.getAxiomCount();
		int j = newSelectedOntology.getAxiomCount();
		
		if (i==j){status = true;};
		//that means that there are no newly selected axioms
		
		selectedOntology = newSelectedOntology;
		
		} else {status = true;};

    } 
	 
    while(!status);
	 
		};
    
	return result;
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
		// TODO Auto-generated method stub
		
		  // status = true: need no processing rest part of the query, status = false: need to continue processing,
		boolean status = false;
		Logger log = LoggerFactory.getLogger(PIONDecider.class);
		
		VariableBinding result = null;
		
		Contract contract=null; 
		Context context=null;
		
		SetOfStatements statements = setOfStatements;
		
       com.hp.hpl.jena.query.Query query = QueryFactory.create(theQuery.toString());
		
		resultVars = query.getResultVars();
		
		OWLOntology ontology =OWLProcess.getOWLOntology(statements);
		
		boolean consistency = IsConsistent(statements);
		
		if (consistency){
			 log.info("[PIONDecider]the ontology is consistent\nStarting the standard reasoning processing\n");	
			
			 OWLAPIReasoner owlapiReasoner = new OWLAPIReasoner();
			 
			 result = owlapiReasoner.sparqlSelect(theQuery, statements, contract, context);
			 
		} else {
			
	    log.info("[PIONDecider]the ontology is not consistent\nStarting the PION reasoning processing\n");	
			
			
		SelectOntologyBasedOnQuery selecter0 = new SelectOntologyBasedOnQuery();
		
		selecter0.theQuery = theQuery;
		
		selecter0.select(statements, contract, context);
		
		OWLOntology previousSelectedOntology = null;
		
		OWLOntology selectedOntology = selecter0.selectedOntology;
	 
	 do {
    	  
//		System.out.println("[PIONDecider]the axioms of the new selectedOntology is\n"+selectedOntology.getAxioms());

		 
			

				
		    consistency = IsConsistent(selectedOntology);
			
        
	if (!consistency){
		
		status = true;
		
	    BasicOWLAPIReasoner reasoner2 = new BasicOWLAPIReasoner();
		
		reasoner2.ontology= previousSelectedOntology;
		
		 result = reasoner2.sparqlSelect(theQuery, statements, contract, context);
		
		
	}
	 else {
		
		
		SelectOntologyFromOntology selecter2= new SelectOntologyFromOntology();
		
		selecter2.workingOntology= selectedOntology;
	
		selecter2.ontology = ontology;
		
		selecter2.select(statements, contract, context);
		
		previousSelectedOntology = selectedOntology;
		
		selectedOntology = selecter2.selectedOntology;
		
		int i = selectedOntology.getAxiomCount();
		int j = previousSelectedOntology.getAxiomCount();
		
		if (i==j){
			status = true;
		//that means that there are no newly selected axioms
			BasicOWLAPIReasoner reasoner2 = new BasicOWLAPIReasoner();
				
			reasoner2.ontology= previousSelectedOntology;
			reasoner2.resultVars= resultVars;
			
			result = reasoner2.sparqlSelect(theQuery, statements, contract, context);
		};
		
	 }

    } 
	 
    while(!status);
	 
		};
    
	return result;

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
	
	
	private boolean IsConsistent(OWLOntology ontology)
	{
		OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
		 
		 org.mindswap.pellet.owlapi.Reasoner reasoner = new org.mindswap.pellet.owlapi.Reasoner(manager);
		 
		 OWLDataFactory factory =manager.getOWLDataFactory();
		
		 Set<OWLClass> incClasses = PIONProcess.getInconsistentClasses(reasoner, factory);
		    
	     boolean result = incClasses.isEmpty();
		
		return result;
	}
	
	private boolean IsConsistent(SetOfStatements statements)
	{
		OWLReasonerFact reasonerFact = OWLProcess.getOWLReasonerFactfromStatements(statements);

		org.mindswap.pellet.owlapi.Reasoner reasoner = reasonerFact.reasoner;
		OWLDataFactory factory = reasonerFact.factory;
//		OWLOntology ontology = reasonerFact.ontology;
//		OWLOntologyManager manager = reasonerFact.manager;
		
		Set<OWLClass> incClasses = PIONProcess.getInconsistentClasses(reasoner, factory);
		    
	     boolean result = incClasses.isEmpty();
		
		return result;
	}
	
	}


