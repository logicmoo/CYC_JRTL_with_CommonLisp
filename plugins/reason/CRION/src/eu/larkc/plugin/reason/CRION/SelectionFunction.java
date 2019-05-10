package eu.larkc.plugin.reason.CRION;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.semanticweb.owl.apibinding.OWLManager;
import org.semanticweb.owl.model.AddAxiom;
import org.semanticweb.owl.model.OWLAxiom;
import org.semanticweb.owl.model.OWLEntity;
import org.semanticweb.owl.model.OWLLogicalAxiom;
import org.semanticweb.owl.model.OWLOntology;
import org.semanticweb.owl.model.OWLOntologyChangeException;
import org.semanticweb.owl.model.OWLOntologyCreationException;
import org.semanticweb.owl.model.OWLOntologyManager;

/**
 * <p/>
 * This selectionFunction select a sub-ontology from an original ontology based on the former ontology by using the syntactic relevance. 
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
public class SelectionFunction {
	private OWLOntology formerOntology;
	private OWLOntology originalOntology;
	private Set<OWLAxiom> axiomSet;
	
	public SelectionFunction() {
		super();
		this.formerOntology = null;
		this.originalOntology = null;
		this.axiomSet = new HashSet<OWLAxiom>();
	}
	

	public SelectionFunction(OWLOntology formerOntology, OWLOntology originalOntology, Set<OWLAxiom> axiomSet) {
		this.formerOntology = formerOntology;
		this.originalOntology = originalOntology;
		this.axiomSet= axiomSet;
		}


	public OWLOntology getFormerOntology() {
		return formerOntology;
	}

	public void setFormerOntology(OWLOntology formerOntology) {
		this.formerOntology = formerOntology;
	}

	public OWLOntology getOriginalOntology() {
		return originalOntology;
	}

	public void setOriginalOntology(OWLOntology originalOntology) {
		this.originalOntology = originalOntology;
	}

	public Set<OWLAxiom> getAxiomSet() {
		return axiomSet;
	}


	public void setAxiomSet(Set<OWLAxiom> axiomSet) {
		this.axiomSet = axiomSet;
	}


	/**
	 * returns the sub-ontology based on a syntactically relevant selection method
	 * 
	 */
	public OWLOntology select() {
		
		OWLOntology selectedOntology = null;
					
		Set<OWLLogicalAxiom> allAxioms = this.originalOntology.getLogicalAxioms();
		Set<OWLLogicalAxiom> addedAxioms = new HashSet<OWLLogicalAxiom>();
			
		if(this.formerOntology.getAxioms().isEmpty()) { // The former ontology is empty, it is the first selection
			Set<OWLEntity> querySignature = this.getAllSignature(axiomSet);
			Iterator<OWLLogicalAxiom> iter1 = allAxioms.iterator();
			while(iter1.hasNext()) {
				OWLLogicalAxiom tempAxiom = iter1.next();
				Set<OWLEntity> tempSignature = tempAxiom.getReferencedEntities();
				if(intersection(querySignature, tempSignature)) {           
					addedAxioms.add(tempAxiom);
				}
			}
		} else { // the former ontology isn't empty
			Set<OWLLogicalAxiom> formerAllAxioms = this.formerOntology.getLogicalAxioms();
				
			Set<OWLLogicalAxiom> restAxioms = new HashSet<OWLLogicalAxiom>();
			restAxioms.addAll(allAxioms);
			restAxioms.removeAll(formerAllAxioms);
				
			Iterator<OWLLogicalAxiom> iter1 = null;
			Iterator<OWLLogicalAxiom> iter2 = formerAllAxioms.iterator();
				
			while(iter2.hasNext()) {
				Set<OWLEntity> signature1 = iter2.next().getReferencedEntities();
				
				iter1 = restAxioms.iterator(); 
				while(iter1.hasNext()) {
					OWLLogicalAxiom tempAxiom = iter1.next();
					Set<OWLEntity> signature2 = tempAxiom.getReferencedEntities();
					if(intersection(signature1,signature2)) {
						addedAxioms.add(tempAxiom);
					}
				}
			}
		}
			
			if(addedAxioms.isEmpty()) { // there does not exist a new relevant sub-ontology
				return null;
			}
			
			// create the selectedOntology
			OWLOntologyManager manager = OWLManager.createOWLOntologyManager();

			try {
				selectedOntology = manager.createOntology(this.originalOntology.getURI());
			} catch (OWLOntologyCreationException e) {
				e.printStackTrace();
			}
			
			List<AddAxiom> addedList = new ArrayList<AddAxiom>();
			
			if(formerOntology != null) {
				Iterator<OWLLogicalAxiom> iter1 = this.formerOntology.getLogicalAxioms().iterator();
				while(iter1.hasNext()) {  // adding axioms in formerOntology into the selectedOntology
					AddAxiom addAxiom = new AddAxiom(selectedOntology, iter1.next());
					addedList.add(addAxiom);
				}
			}
	
			
			Iterator<OWLLogicalAxiom> iter2 = addedAxioms.iterator();
			while(iter2.hasNext()) {   // adding the expanded parts into the selectedOntology
				AddAxiom addAxiom = new AddAxiom(selectedOntology, iter2.next());
				addedList.add(addAxiom);
			}
			
			try {
				manager.applyChanges(addedList);
			} catch (OWLOntologyChangeException e) {
				e.printStackTrace();
			}
			
		
		return selectedOntology;
	}
	

	/**
	 * returns true if the two sets is intersected
	 */
	private Boolean intersection(Set s1, Set s2) { // determine if the two sets is intersected
		Set temp = new HashSet();
		temp.addAll(s1);
		temp.retainAll(s2);
		if(temp.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
	
	/**
	 * returns the signature for a axiom set.
	 */
	private Set<OWLEntity> getAllSignature(Set<OWLAxiom> as) {
		Set<OWLEntity> signature = new HashSet<OWLEntity>();
		Iterator<OWLAxiom> aIter = as.iterator();
		while(aIter.hasNext()) {
			signature.addAll(aIter.next().getReferencedEntities());
		}
		return signature;
	}

}
