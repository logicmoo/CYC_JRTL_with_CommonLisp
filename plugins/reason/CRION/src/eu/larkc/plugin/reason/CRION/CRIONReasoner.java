package eu.larkc.plugin.reason.CRION;

/**
 * <p/>
 * Contrastive Reasoner
 * </p>
 *
 * @author Jun Fang and ZhiSheng Huang
 * Department of computer Science, Vrije Universiteit Amsterdam, The Netherlands
 * leon.essence@gmail.com, huang@cs.vu.nl
 *
 *
 * @version 1.0
 * @Date: 2010-7-1
 *
 */

import java.util.Iterator;
import java.util.List;

import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;
import org.semanticweb.owl.apibinding.OWLManager;
import org.semanticweb.owl.model.OWLAxiom;
import org.semanticweb.owl.model.OWLClass;
import org.semanticweb.owl.model.OWLDataFactory;
import org.semanticweb.owl.model.OWLDescription;
import org.semanticweb.owl.model.OWLOntology;
import org.semanticweb.owl.model.OWLOntologyCreationException;
import org.semanticweb.owl.model.OWLOntologyManager;

import com.hp.hpl.jena.graph.Node;
import com.hp.hpl.jena.graph.Triple;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.sparql.core.BasicPattern;
import com.hp.hpl.jena.sparql.syntax.Element;
import com.hp.hpl.jena.sparql.syntax.ElementGroup;
import com.hp.hpl.jena.sparql.syntax.ElementTriplesBlock;

import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.BooleanInformationSetImpl;
import eu.larkc.core.data.RdfGraph;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.reason.Reasoner;
import eu.larkc.plugin.reason.OWLAPIReasoner.OWLProcess;
import eu.larkc.plugin.reason.OWLAPIReasoner.OWLReasonerFact;
import eu.larkc.plugin.reason.OWLAPIReasoner.Query2OWLQuery;


//import java.net.URI;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


import org.mindswap.pellet.PelletOptions;
//import org.mindswap.pellet.owlapi.Reasoner;
import org.semanticweb.owl.apibinding.OWLManager;
import org.semanticweb.owl.model.OWLAxiom;
import org.semanticweb.owl.model.OWLClass;
import org.semanticweb.owl.model.OWLDataFactory;
import org.semanticweb.owl.model.OWLDescription;
import org.semanticweb.owl.model.OWLOntology;
import org.semanticweb.owl.model.OWLOntologyCreationException;
import org.semanticweb.owl.model.OWLOntologyManager;

public class CRIONReasoner implements Reasoner {
	
	private String reasonerID = "eu.larkc.plugin.reason.CRION.JPIONReasoner";
	
	public EntailmentResultEnum StandardPIONAnswer;
	public Set<ContrastiveAnswer> ContrastiveAnswers;
	
	public ODPEnum SelectedODPStrategy;

	private String defaultKB = "kb";
	
	private String ClassDes="CRIONReasoner";

	@Override
	public BooleanInformationSet sparqlAsk(SPARQLQuery theQuery,
			SetOfStatements statements, Contract contract,
			Context context) {
		// TODO Auto-generated method stub
		   BooleanInformationSet answer;
			
			  // status = true: need no processing rest part of the query, status = false: need to continue processing,
				boolean status = false;
			
			  // default value of the query answer;
				boolean bresult = false;
				
				String kb = defaultKB;
			
				
				RdfGraph graph = (RdfGraph) statements;
				org.openrdf.model.URI uri= graph.getName();	
				
				String String_URI = uri.toString();
				  
			    java.net.URI physicalURI = java.net.URI.create(String_URI);
			  
				OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
				
				OWLOntology  ontology = null;
				
				try {
					ontology = manager.loadOntology(java.net.URI.create(String_URI));
				} catch (OWLOntologyCreationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	//			org.mindswap.pellet.owlapi.Reasoner reasoner = new org.mindswap.pellet.owlapi.Reasoner(manager);

				OWLDataFactory factory = manager.getOWLDataFactory();
				
				OWLAxiom axiom=SPARQLQuery2OWLAxiom(theQuery, factory);
				
				PelletOptions.USE_TRACING = true;
				org.mindswap.pellet.owlapi.Reasoner reasoner = new org.mindswap.pellet.owlapi.Reasoner( manager );
				reasoner.loadOntology( ontology );
				
				Set<OWLClass> unsatisfiableConcepts = reasoner.getInconsistentClasses();
				Iterator<OWLClass> cIter = unsatisfiableConcepts.iterator();
				System.out.println("Original unsatisfiable concepts:");
				while(cIter.hasNext()) {
					System.out.println(cIter.next());
				}

				Set<OWLAxiom> queries = new HashSet<OWLAxiom>();
				Set<Set<OWLAxiom>> allJus = new HashSet<Set<OWLAxiom>>();
				

				cIter = unsatisfiableConcepts.iterator();
				while(cIter.hasNext()) {
					OWLClass c = cIter.next();
					reasoner.getKB().setDoExplanation( true );
					reasoner.isSatisfiable(c);
					Set<OWLAxiom> exp = reasoner.getExplanation();
					allJus.add(exp);
					queries.addAll(exp);
				}
				
				ContrastiveReasoner cReasoner = new ContrastiveReasoner(ontology);
				
				NonstandardReasoner nReasoner = new NonstandardReasoner(ontology);
				Iterator<OWLAxiom> iter = queries.iterator();
				OWLAxiom a = null;
				while(iter.hasNext()) {
					a = iter.next();
					if(nReasoner.entail(a)==EntailmentResultEnum.Accepted) {
						bresult =true;
						StandardPIONAnswer = EntailmentResultEnum.Accepted;
						System.out.println(ClassDes+ " nonstandardly implies "+a);
						Set<ContrastiveAnswer> cas = cReasoner.cac(a, nReasoner.getSelectedSubset());
						
						ContrastiveAnswers = cas;
						
						if(!cas.isEmpty()) {
							System.out.println("contrastive answers for "+ a+" is: ");
							Iterator<ContrastiveAnswer> caIter = cas.iterator();
							while(caIter.hasNext()) {
								System.out.println(caIter.next());
							}
						}
					}
					System.out.println();
				}
				
				queries.remove(a);
				if(nReasoner.entail(queries)==EntailmentResultEnum.Accepted) {
					bresult =true;
					StandardPIONAnswer = EntailmentResultEnum.Accepted;
					System.out.println(ClassDes+ " nonstandardly implies the following set.");
					Set<ContrastiveAnswer> cas = cReasoner.cac(queries, nReasoner.getSelectedSubset());
					if(!cas.isEmpty()) {
						System.out.println("contrastive answers are : ");
						Iterator<ContrastiveAnswer> caIter = cas.iterator();
						while(caIter.hasNext()) {
							System.out.println(caIter.next());
						}
					} else {
						bresult =false;
						StandardPIONAnswer = EntailmentResultEnum.Undetermined;
						System.out.println("These doesn't exist contrastive answers.");
					}
				}

							
				answer= new BooleanInformationSetImpl( bresult );
		
		return answer;
	}

	@Override
	public SetOfStatements sparqlConstruct(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SetOfStatements sparqlDescribe(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VariableBinding sparqlSelect(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public URI getIdentifier() {
		// TODO Auto-generated method stub
		return new URIImpl(reasonerID);
	}

	@Override
	public QoSInformation getQoSInformation() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public OWLAxiom SPARQLQuery2OWLAxiom(SPARQLQuery theQuery, OWLDataFactory factory)
	{
		
		boolean status = false; // status = true, quit the query processing
		OWLAxiom axiom = null;
		
		com.hp.hpl.jena.query.Query query = QueryFactory.create(theQuery.toString());
		 
		Element pattern = query.getQueryPattern();
	       
	       
	       ElementGroup elementGroup = (ElementGroup) pattern;
	       
	       List<?> elements = elementGroup.getElements();
	       
	      Element first = (Element) elements.get(0);
	      BasicPattern triples = ((ElementTriplesBlock) first).getTriples();
	     
	      System.out.println("Basic pattern of the query  is "+triples);
	      
	      Iterator<Triple>  iter = triples.iterator();
	      
	      while (iter.hasNext()&&!status)
			{
	      
	      Triple t = null;
 		  
	       t = iter.next();
	       
	 	  Node subject = t.getSubject();
		  Node object =t.getObject();
		  Node predicate =  t.getPredicate();
		  
		  if ((subject.isConcrete()) &&(predicate.hasURI("http://www.w3.org/1999/02/22-rdf-syntax-ns#type"))&&(object.hasURI("http://www.w3.org/2002/07/owl#Class")))	 
		  {     
			  // anything on rdf:type owl:Class checking, it is assumed to be true.
				 iter.remove();} 
			 
			 else if ((subject.isVariable()) &&(predicate.hasURI("http://www.w3.org/1999/02/22-rdf-syntax-ns#type"))&&(object.hasURI("http://www.w3.org/2002/07/owl#Class")))	 
			  { 
				 // anything on rdf:type owl:Class checking, to be checked further if it involves a variable binding, i.e., allConcepts
				iter.remove();} 
		 
  	 else if (subject.isConcrete()&& predicate.hasURI("http://www.w3.org/2000/01/rdf-schema#subClassOf")&&object.isConcrete())
			 { 
			
					OWLClass sub = factory.getOWLClass(java.net.URI.create(subject.toString()));
					OWLClass sup = factory.getOWLClass(java.net.URI.create(object.toString()));
			//		OWLDescription des = factory.getOWLObjectComplementOf(sup);
					axiom = factory.getOWLSubClassAxiom(sub, sup);
					
			 iter.remove();
			 status = true;
			 }
		  
			 else {
				 iter.remove();//remove unsupported query
			 }
			}
	      
	      
//	      System.out.println("The axiom of the query  is "+ axiom );
		return axiom;
	}
	

}
