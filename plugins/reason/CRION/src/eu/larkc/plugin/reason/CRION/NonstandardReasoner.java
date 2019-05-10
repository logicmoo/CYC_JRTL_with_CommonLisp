package eu.larkc.plugin.reason.CRION;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.mindswap.pellet.owlapi.Reasoner;
import org.semanticweb.owl.apibinding.OWLManager;
import org.semanticweb.owl.model.AddAxiom;
import org.semanticweb.owl.model.OWLAxiom;
import org.semanticweb.owl.model.OWLDisjointClassesAxiom;
import org.semanticweb.owl.model.OWLLogicalAxiom;
import org.semanticweb.owl.model.OWLOntology;
import org.semanticweb.owl.model.OWLOntologyChangeException;
import org.semanticweb.owl.model.OWLOntologyCreationException;
import org.semanticweb.owl.model.OWLOntologyManager;
import org.semanticweb.owl.model.RemoveAxiom;

/**
<p/>
 * The class is reasoner which can perform nonstandard entailment in an inconsistent ontology.
 * It will return accepted or under-determined for a reasoning task. 
 * It is achieved by setting the syntactical selection function and over-determined processing (ODP) method. 
 * </p>
 *
 * @author Jun Fang and ZhiSheng Huang
 * Department of computer Science, Vrije Universiteit Amsterdam, The Netherlands
 * leon.essence@gmail.com, huang@cs.vu.nl
 *
 *
 * @version 1.0
 * @Date: 2010-01-08
 *
 */

public class NonstandardReasoner {
	private OWLOntology ontology;
	private OWLOntology selectedSubset;
	
	
	public NonstandardReasoner() {
		super();
	}


	public NonstandardReasoner(OWLOntology ontology) {
		this.ontology = ontology;
		this.selectedSubset = null;
	}
	
	public OWLOntology getOntology() {
		return ontology;
	}


	public void setOntology(OWLOntology ontology) {
		this.ontology = ontology;
	}

	
	
	public OWLOntology getSelectedSubset() {
		return selectedSubset;
	}


	/**
	 * returns the entailment result for an axiom
	 */
	public EntailmentResultEnum entail(OWLAxiom axiom) {
		Set<OWLAxiom> axiomSet = new HashSet<OWLAxiom>();
		axiomSet.add(axiom);
		return entail(axiomSet);
	}
	
	/**
	 * TODO task: returns consistency-negation or coherence-negation of an axiom.
	 */
	private boolean containNegationOf(OWLAxiom axiom) {
		return false;
	}


	
	/**
	 * returns the entailment result for an axiom set in an inconsistent ontology
	 */
	public EntailmentResultEnum entail(Set<OWLAxiom> axiomSet) {
		OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
		Reasoner classicalReasoner = new Reasoner(manager);
		
		if(axiomSet.size()==1) {
			OWLAxiom a = axiomSet.iterator().next();
			if(ontology.getLogicalAxioms().contains(a)&&!containNegationOf(a)) {
				return EntailmentResultEnum.Accepted;
			}
		} else {
			if(ontology.getLogicalAxioms().containsAll(axiomSet)) { // TODO, need to be refined
				return EntailmentResultEnum.Accepted;
			}
		}

			
		OWLOntology formerOntology = null;
		try {
			formerOntology = manager.createOntology(this.ontology.getURI());
			selectedSubset = manager.createOntology(this.ontology.getURI());
		} catch (OWLOntologyCreationException e) {
			e.printStackTrace();
		}			
		selectedSubset= null;
			
			
		SelectionFunction selectionFun = new SelectionFunction(formerOntology, this.ontology, axiomSet);
	
		while(true) {			
			selectionFun.setFormerOntology(formerOntology);
			selectedSubset = selectionFun.select();       // selecting a sub-ontology
			if(selectedSubset == null) { // there does not exist a new relevant sub-ontology
				return EntailmentResultEnum.Undetermined; 
			}
				
			classicalReasoner.loadOntology(selectedSubset);
				
			if (classicalReasoner.getInconsistentClasses().isEmpty()&&classicalReasoner.isConsistent()) { 
				// the selected sub-ontology is consistent, processing using classical reasoner
				if(classicalReasoner.isEntailed(axiomSet)) {
					return EntailmentResultEnum.Accepted;
				} 
				else {
					classicalReasoner.unloadOntology(selectedSubset);
					formerOntology = selectedSubset;
				}
			} else{
				// the selected sub-ontolgy contains unsatisfiable concept, go to ODP
				return this.odp(formerOntology, selectedSubset, axiomSet);
			}
		}		
	}

	/**
	 * returns the entailment result by over-determined processing
	 */
	public EntailmentResultEnum odp(OWLOntology formerOntology, OWLOntology currentOntology, Set<OWLAxiom> query) { // TODO need to be refined

		OWLOntology obtainedOntology = null;
		OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
		Reasoner classicalReasoner = new Reasoner(manager);

		try {
			obtainedOntology = manager.createOntology(currentOntology.getURI());
		} catch (OWLOntologyCreationException e) {
			e.printStackTrace();
		}
		
		List<AddAxiom> addedList = new ArrayList<AddAxiom>();
		
		Iterator<OWLLogicalAxiom> iter = currentOntology.getLogicalAxioms().iterator();
		while(iter.hasNext()) {  // adding axioms in currentOntology into the obtainedOntology
			AddAxiom addAxiom = new AddAxiom(obtainedOntology, iter.next());
			addedList.add(addAxiom);
		}
		try {
			manager.applyChanges(addedList);
		} catch (OWLOntologyChangeException e) {
			e.printStackTrace();
		}
		
		Set<OWLLogicalAxiom> currentAllAxioms = currentOntology.getLogicalAxioms();

		Set<OWLLogicalAxiom> formerAllAxioms =  formerOntology.getLogicalAxioms();	
		Set<OWLLogicalAxiom> differentAxioms = new HashSet<OWLLogicalAxiom>();
		differentAxioms.addAll(currentAllAxioms);
//		differentAxioms.removeAll(formerAllAxioms);        
		                                                   
		Iterator<OWLLogicalAxiom> axiomIter = differentAxioms.iterator();
		while(axiomIter.hasNext()) {
			OWLAxiom a = axiomIter.next();
			
			RemoveAxiom removedAxiom = new RemoveAxiom(obtainedOntology, a);
			try {
				manager.applyChange(removedAxiom);
			} catch (OWLOntologyChangeException e) {
				e.printStackTrace();
			}
			
			classicalReasoner.loadOntology(obtainedOntology); 
			if(classicalReasoner.getInconsistentClasses().isEmpty()&&classicalReasoner.isConsistent()) {
				if(classicalReasoner.isEntailed(query)) {
					return EntailmentResultEnum.Accepted;
				} 
//				else {
//					return EntailmentResultEnum.Undetermined; 
//				}
			} 
			
			classicalReasoner.unloadOntology(obtainedOntology); 
			AddAxiom addAxiom = new AddAxiom(obtainedOntology, a);
				
			try {
				manager.applyChange(addAxiom);
			} catch (OWLOntologyChangeException e) {
				e.printStackTrace();
			}

		}
		
		return EntailmentResultEnum.Undetermined; 
	}
	

}
