package eu.larkc.plugin.select.PIONSelecter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


import org.openrdf.model.URI;
import org.semanticweb.owl.model.OWLAxiom;
import org.semanticweb.owl.model.OWLDataFactory;
import org.semanticweb.owl.model.OWLOntology;
import org.semanticweb.owl.model.OWLOntologyChangeException;
import org.semanticweb.owl.model.OWLOntologyCreationException;
import org.semanticweb.owl.model.OWLOntologyManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hp.hpl.jena.graph.Node;
import com.hp.hpl.jena.graph.Triple;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.sparql.core.BasicPattern;

import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.reason.OWLAPIReasoner.OWLProcess;
import eu.larkc.plugin.reason.OWLAPIReasoner.OWLReasonerFact;
import eu.larkc.plugin.reason.OWLAPIReasoner.Query2OWLQuery;
import eu.larkc.plugin.reason.pion.PIONProcess;
import eu.larkc.plugin.select.Selecter;

public class SelectOntologyBasedOnQuery implements Selecter {

	
	public static SPARQLQuery theQuery;
	public static OWLOntology selectedOntology;
	public static OWLReasonerFact OWLReasonerFact;
	
	
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

	public SetOfStatements select(SetOfStatements statements,
		Contract contract, Context context) {
		Logger log = LoggerFactory.getLogger(SelectOntologyBasedOnQuery.class);
		
		OWLReasonerFact reasonerFact= OWLProcess.getOWLReasonerFactfromStatements(statements);
		OWLReasonerFact = reasonerFact;
		
		org.mindswap.pellet.owlapi.Reasoner reasoner = reasonerFact.reasoner;
		OWLDataFactory factory = reasonerFact.factory;
		OWLOntology ontology = reasonerFact.ontology;
		OWLOntologyManager manager = reasonerFact.manager;
		
      com.hp.hpl.jena.query.Query query = QueryFactory.create(theQuery.toString());
	
		BasicPattern triples = Query2OWLQuery.getBasicPattern(query); 
	
          List<String> literals = new ArrayList<String>();
		
		Iterator<Triple>  iter = triples.iterator();
        
	 	  while (iter.hasNext())
			{
	 		  Triple t = null;
	 		  
	       t = iter.next();
	   
//		System.out.println("processing "+ t);

			
		  Node subject = t.getSubject();
		  Node object =t.getObject();
//		  Node predicate =  t.getPredicate();
		  
		 if (subject.isConcrete()&& !literals.contains(removePrefix(subject.toString())))
		 {literals.add(removePrefix(subject.toString()));}
		  if (object.isConcrete()&& !literals.contains(removePrefix(subject.toString()))) 
		  {literals.add(removePrefix(object.toString()));}
		  
			}
	 	  
			log.info("[SelectOntologyBasedOnQuery] the literals of the query are "+ literals);

	 	  
	 	 Set<OWLAxiom> axioms = ontology.getAxioms();
			List<OWLAxiom> result0 = new ArrayList<OWLAxiom>();
			Set newAxioms = new HashSet(result0);

			
			Iterator<OWLAxiom> iter2 = axioms.iterator();
			
			while (iter2.hasNext())
			{
			OWLAxiom  axiom = iter2.next();
			
			if (SyntacticRelevance.relevant(axiom,literals)){ newAxioms.add(axiom);}
			}
			
		    selectedOntology=null;
		    
			try {
				selectedOntology = manager.createOntology(newAxioms);
			} catch (OWLOntologyCreationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (OWLOntologyChangeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 	  
//			System.out.println("[SelectOntologyBasedOnQuery] the selectedOntology is empty: = "+ selectedOntology.isEmpty());
		SetOfStatements answer =	PIONProcess.getSetOfStatements(selectedOntology);
		return answer;
	}
	
	public static String removePrefix(String s)
	{
		String result = null;
		
		int i = s.indexOf("#");
		if (i>0){result = s.substring(i+1);};
		
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
	
	
	
}



