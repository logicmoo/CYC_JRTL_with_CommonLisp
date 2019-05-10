package eu.larkc.plugin.reason.CRION;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//import nl.vu.cs.kr.PION.EntailmentResultEnum;
//import nl.vu.cs.kr.PION.NonstandardReasoner;
//import nl.vu.cs.kr.PION.SelectionFunction;

import org.mindswap.pellet.PelletOptions;
import org.mindswap.pellet.owlapi.Reasoner;
import org.semanticweb.owl.apibinding.OWLManager;
import org.semanticweb.owl.model.AddAxiom;
import org.semanticweb.owl.model.OWLAxiom;
import org.semanticweb.owl.model.OWLDisjointClassesAxiom;
import org.semanticweb.owl.model.OWLOntology;
import org.semanticweb.owl.model.OWLOntologyChangeException;
import org.semanticweb.owl.model.OWLOntologyCreationException;
import org.semanticweb.owl.model.OWLOntologyManager;
import org.semanticweb.owl.model.RemoveAxiom;
import org.semanticweb.owl.model.OWLClass;

/**
* <p/>
* Represents the contrastive reasoner. 
* </p>
*
* @author Jun Fang and ZhiSheng Huang
* Department of computer Science, Vrije Universiteit Amsterdam, The Netherlands
* leon.essence@gmail.com, huang@cs.vu.nl
*
*
* @version 1.0
* @Date: 2010-6-15
*
*/
public class ContrastiveReasoner {
	private OWLOntology ontology;


	public ContrastiveReasoner(OWLOntology ontology) {
		this.ontology = ontology;
	}

	public OWLOntology getOntology() {
		return ontology;
	}

	public void setOntology(OWLOntology ontology) {
		this.ontology = ontology;
	}

	
	/**
	 * returns contrastive answers by conjunction (CAC) for an query axiom
	 */
	public Set<ContrastiveAnswer> cac(OWLAxiom axiom, OWLOntology selectedSubset) {
		Set<OWLAxiom> axiomSet = new HashSet<OWLAxiom>();
		axiomSet.add(axiom);
		return cac(axiomSet,selectedSubset);
	}
	
	
	/**
	 * returns contrastive answers by conjunction (CAC) for an query axioms set. 
	 * It extends the selection function of PION.
	 */
	public Set<ContrastiveAnswer> cac(Set<OWLAxiom> original, OWLOntology selectedSubset) {
		NonstandardReasoner nReasoner = new NonstandardReasoner(this.ontology);
		Set<ContrastiveAnswer> cas = new HashSet<ContrastiveAnswer>();
		OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
		Reasoner classicalReasoner = new Reasoner(manager);
		
		if(selectedSubset==null) {
			try {
				selectedSubset = manager.createOntology(this.ontology.getURI());
			} catch (OWLOntologyCreationException e) {
				e.printStackTrace();
			}
		}
		
		// step1: extent the selected set until it becomes inconsistent
		List<AddAxiom> addedList = new ArrayList<AddAxiom>();
		Iterator<OWLAxiom> iter = original.iterator();
		while(iter.hasNext()) {
			AddAxiom addedAxiom = new AddAxiom(selectedSubset, iter.next());
			addedList.add(addedAxiom);
		}
		
		try {
			manager.applyChanges(addedList);
		} catch (OWLOntologyChangeException e) {
			e.printStackTrace();
		}
		classicalReasoner.loadOntology(selectedSubset); 
		SelectionFunction selectionFun = new SelectionFunction(selectedSubset, this.ontology, original);
		
		while(classicalReasoner.getInconsistentClasses().isEmpty()&&classicalReasoner.isConsistent()) {
			classicalReasoner.unloadOntology(selectedSubset);		
			selectionFun.setFormerOntology(selectedSubset);
			selectedSubset = selectionFun.select();       // selecting a sub-ontology
			if(selectedSubset == null) { // there does not exist a new relevant sub-ontology
				return cas; 
			} 
			classicalReasoner.loadOntology(selectedSubset); 
		}
		
		
		// step2: find a minimal inconsistent set which includes the query set
//		selectedSubset= selectionFun.select();
		OWLOntology mis = optimizedMIS(selectedSubset, original);
		if(mis==null) {
			return cas;
		}
		
		
		// step3: construct the clarification axiom set and the contrastive axiom set
		Set<OWLAxiom> allAxioms = new HashSet<OWLAxiom>();
		allAxioms.addAll(mis.getAxioms());
//		allAxioms.removeAll(original);
		iter = allAxioms.iterator();
		while(iter.hasNext()) {
			Set<OWLAxiom> clarification = new HashSet<OWLAxiom>();
			
			clarification.add(iter.next());    // construct the clarification axiom set
			if(nReasoner.entail(clarification)==EntailmentResultEnum.Accepted) { // the ontology nonstandardly imply the clarification
				// construct the contrastive axiom set
				Set<OWLAxiom> contrastive = new HashSet<OWLAxiom>();
				contrastive.addAll(mis.getAxioms());
				contrastive.removeAll(original);
				contrastive.removeAll(clarification);
				if(!contrastive.isEmpty()) {
					if(nReasoner.entail(contrastive)==EntailmentResultEnum.Accepted) { // the ontology nonstandardly imply the contrastive
						ContrastiveAnswer ca = new ContrastiveAnswer(original,clarification,contrastive);
						cas.add(ca);
					}
				}

			}
		}
		
		return cas;
	}

	/**
	 * returns a minimal inconsistetn set which includes the reserved axioms by going through all axioms in the inconsistent ontology.
	 */
	public OWLOntology minimalInconsistentSet(OWLOntology inconsistentOnt, Set<OWLAxiom> reservedAxioms) {
		OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
		Reasoner classicalReasoner = new Reasoner(manager);
		
		Set<OWLAxiom> allAxioms = inconsistentOnt.getAxioms();
		Set<OWLAxiom> removedAxioms = new HashSet<OWLAxiom>();
		removedAxioms.addAll(allAxioms);
		removedAxioms.removeAll(reservedAxioms);
		
		OWLOntology mis = null;
		try {
			mis = manager.createOntology(this.ontology.getURI());
		} catch (OWLOntologyCreationException e) {
			e.printStackTrace();
		}
		List<AddAxiom> addedList = new ArrayList<AddAxiom>();
		
		Iterator<OWLAxiom> iter = allAxioms.iterator();
		while(iter.hasNext()) {  // adding axioms in inconsistent ontology into the mis
			AddAxiom addAxiom = new AddAxiom(mis, iter.next());
			addedList.add(addAxiom);
		}
		try {
			manager.applyChanges(addedList);
		} catch (OWLOntologyChangeException e) {
			e.printStackTrace();
		}
		
		iter = removedAxioms.iterator();
		while(iter.hasNext()) {
			OWLAxiom a = iter.next();
			RemoveAxiom removedAxiom = new RemoveAxiom(mis, a);
			try {
				manager.applyChange(removedAxiom);
			} catch (OWLOntologyChangeException e) {
				e.printStackTrace();
			}
			classicalReasoner.loadOntology(mis);
			if(classicalReasoner.getInconsistentClasses().isEmpty()&&classicalReasoner.isConsistent()) {
				AddAxiom addedAxiom = new AddAxiom(mis,a);
				try {
					manager.applyChange(addedAxiom);
				} catch (OWLOntologyChangeException e) {
					e.printStackTrace();
				}
			}
			classicalReasoner.unloadOntology(mis);
		}
		
		iter = reservedAxioms.iterator();	
		List<RemoveAxiom> removedList = new ArrayList<RemoveAxiom>();
		while(iter.hasNext()) {
			RemoveAxiom removedAxiom = new RemoveAxiom(mis, iter.next());
			removedList.add(removedAxiom);
		}
		try {
			manager.applyChanges(removedList);
		} catch (OWLOntologyChangeException e) {
			e.printStackTrace();
		}
		
		classicalReasoner.loadOntology(mis);
		if(classicalReasoner.getInconsistentClasses().isEmpty()&&classicalReasoner.isConsistent()) {
			iter = reservedAxioms.iterator();
			List<AddAxiom> addedList1 = new ArrayList<AddAxiom>();
			while(iter.hasNext()) {
				AddAxiom addedAxiom = new AddAxiom(mis, iter.next());
				addedList1.add(addedAxiom);
			}
			try {
				manager.applyChanges(addedList1);
			} catch (OWLOntologyChangeException e) {
				e.printStackTrace();
			}
			
			return mis;
		} else {
			return null;
		}
	}
	
	
	/**
	 * returns a minimal inconsistent which includes the reserved axioms from the inconsistent ontology.
	 * It is an improved method for computing MIS.
	 */
	public OWLOntology improvedMinimalInconsistentSet(OWLOntology inconsistentOnt, Set<OWLAxiom> reservedAxioms) {
		OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
		Reasoner classicalReasoner = new Reasoner(manager);
		
		Set<OWLAxiom> allAxioms = inconsistentOnt.getAxioms();
		Set<OWLAxiom> removedAxioms = new HashSet<OWLAxiom>();
		removedAxioms.addAll(allAxioms);
		removedAxioms.removeAll(reservedAxioms);
		
		OWLOntology mis = null;
		try {
			mis = manager.createOntology(this.ontology.getURI());
		} catch (OWLOntologyCreationException e) {
			e.printStackTrace();
		}
		List<AddAxiom> addedList = new ArrayList<AddAxiom>();
		
		Iterator<OWLAxiom> iter = allAxioms.iterator();
		while(iter.hasNext()) {  // adding axioms in inconsistent ontology into the mis
			AddAxiom addAxiom = new AddAxiom(mis, iter.next());
			addedList.add(addAxiom);
		}
		try {
			manager.applyChanges(addedList);
		} catch (OWLOntologyChangeException e) {
			e.printStackTrace();
		}
		
//		// optimizing techniques 1
//		Set<OWLEntity> signature = new HashSet<OWLEntity>();
//		Iterator<OWLAxiom> aIter= reservedAxioms.iterator();
//		while(aIter.hasNext()) {
//			OWLAxiom a = aIter.next();
//			signature.addAll(a.getReferencedEntities());
//		}
//		
//		Set<OWLAxiom> firstTestedAxioms = new HashSet<OWLAxiom>();
//		aIter = mis.getAxioms().iterator();
//		while(aIter.hasNext()) {
//			OWLAxiom a = aIter.next();
//			if(a instanceof OWLDisjointClassesAxiom) {
//				if(!intersection(signature,a.getReferencedEntities())) {
//					firstTestedAxioms.add(a);
//				}
//			}
//		}
//		
//		if(!firstTestedAxioms.isEmpty()) {
//			aIter = firstTestedAxioms.iterator();
//			while(aIter.hasNext()) {
//				OWLAxiom a = aIter.next();
//				RemoveAxiom removedAxiom = new RemoveAxiom(mis, a);
//				try {
//					manager.applyChange(removedAxiom);
//				} catch (OWLOntologyChangeException e) {
//					e.printStackTrace();
//				}
//				classicalReasoner.loadOntology(mis);
//				if(classicalReasoner.getInconsistentClasses().isEmpty()&&classicalReasoner.isConsistent()) {
//					AddAxiom addedAxiom = new AddAxiom(mis,a);
//					try {
//						manager.applyChange(addedAxiom);
//					} catch (OWLOntologyChangeException e) {
//						e.printStackTrace();
//					}
//				}
//				classicalReasoner.unloadOntology(mis);
//				removedAxioms.remove(a);
//			}
//			
//		}
//		// end of optimization 1
		
		// optimization 2
		boolean clearingAll = false;
		Set<OWLAxiom> disjoints = new HashSet<OWLAxiom>();
		Iterator<OWLAxiom> aIter = mis.getAxioms().iterator();
		while(aIter.hasNext()) {
			OWLAxiom a = aIter.next();
			if(a instanceof OWLDisjointClassesAxiom) {
				if(reservedAxioms.contains(a)) {
					clearingAll = true;
				} else {
					disjoints.add(a);
				}

			}
		}
		
		if(clearingAll) {	// the reserved axiom set contain a disjoint classes axiom.
			if(!disjoints.isEmpty()) {
				Iterator<OWLAxiom> tempIter = disjoints.iterator();
				List<RemoveAxiom> removes = new ArrayList<RemoveAxiom>();
				
				while(tempIter.hasNext()) {
					RemoveAxiom remove = new RemoveAxiom(mis,tempIter.next());
					removes.add(remove);
				}
				try {
					manager.applyChanges(removes);
				} catch (OWLOntologyChangeException e) {
					e.printStackTrace();
				}
				return this.minimalInconsistentSet(mis, reservedAxioms);
			}
		} else if(disjoints.size()>1) {
			aIter = disjoints.iterator();
			Set<OWLAxiom> testAxioms = new HashSet<OWLAxiom>();

			while(aIter.hasNext()) {
				OWLAxiom a = aIter.next();
				testAxioms.clear();
				testAxioms.addAll(disjoints);
				testAxioms.remove(a);
				
				Iterator<OWLAxiom> tempIter = testAxioms.iterator();
				List<RemoveAxiom> removes = new ArrayList<RemoveAxiom>();
				while(tempIter.hasNext()) {
					RemoveAxiom remove = new RemoveAxiom(mis,tempIter.next());
					removes.add(remove);
				}
				try {
					manager.applyChanges(removes);
				} catch (OWLOntologyChangeException e) {
					e.printStackTrace();
				}
				
				classicalReasoner.loadOntology(mis);
				if(!classicalReasoner.getInconsistentClasses().isEmpty()||!classicalReasoner.isConsistent()) {
					
					iter = reservedAxioms.iterator();	
					List<RemoveAxiom> removedList = new ArrayList<RemoveAxiom>();
					while(iter.hasNext()) {
						RemoveAxiom removedAxiom = new RemoveAxiom(mis, iter.next());
						removedList.add(removedAxiom);
					}
					try {
						manager.applyChanges(removedList);
					} catch (OWLOntologyChangeException e) {
						e.printStackTrace();
					}
					
					classicalReasoner.loadOntology(mis);
					
//					Iterator<org.semanticweb.owl.model.OWLClass> inconIter = classicalReasoner.getInconsistentClasses().iterator();
//					while(inconIter.hasNext()) {
//						System.out.println(inconIter.next());
//					}
					if(classicalReasoner.getInconsistentClasses().isEmpty()&&classicalReasoner.isConsistent()) {

//						removedAxioms.removeAll(testAxioms);
						classicalReasoner.unloadOntology(mis);
						iter = reservedAxioms.iterator();	
						List<AddAxiom> addList = new ArrayList<AddAxiom>();
						while(iter.hasNext()) {
							AddAxiom addAxiom = new AddAxiom(mis, iter.next());
							addList.add(addAxiom);
						}
						try {
							manager.applyChanges(addList);
						} catch (OWLOntologyChangeException e) {
							e.printStackTrace();
						}
						return this.minimalInconsistentSet(mis, reservedAxioms);
						
					} else {
						iter = reservedAxioms.iterator();	
						List<AddAxiom> addList = new ArrayList<AddAxiom>();
						while(iter.hasNext()) {
							AddAxiom addAxiom = new AddAxiom(mis, iter.next());
							addList.add(addAxiom);
						}
						try {
							manager.applyChanges(addList);
						} catch (OWLOntologyChangeException e) {
							e.printStackTrace();
						}
					}
					OWLOntology result = this.minimalInconsistentSet(mis, reservedAxioms);
					if(result!=null) {
						return result;
					}
				}
				tempIter = testAxioms.iterator();
				List<AddAxiom> adds1 = new ArrayList<AddAxiom>();
				
				while(tempIter.hasNext()) {
					AddAxiom add = new AddAxiom(mis,tempIter.next());
					adds1.add(add);
				}
				try {
					manager.applyChanges(adds1);
				} catch (OWLOntologyChangeException e) {
					e.printStackTrace();
				}
				classicalReasoner.unloadOntology(mis);
			}
		}
		// end of optimization 2
		
		return this.minimalInconsistentSet(inconsistentOnt, reservedAxioms);

	}
	
	
	/**
	 * returns a minimal inconsistent which includes the reserved axioms from the inconsistent ontology.
	 * It is a optimized method for calculation MIS, 
	 * which uses finding all justifications in the incoherent ontology currently.
	 */
	public OWLOntology optimizedMIS(OWLOntology inconsistentOnt, Set<OWLAxiom> reservedAxioms) {
		OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
		Reasoner classicalReasoner = new Reasoner(manager);
		
		Set<OWLAxiom> allAxioms = inconsistentOnt.getAxioms();
		Set<OWLAxiom> removedAxioms = new HashSet<OWLAxiom>();
		removedAxioms.addAll(allAxioms);
		removedAxioms.removeAll(reservedAxioms);
		
		OWLOntology mis = null;
		try {
			mis = manager.createOntology(this.ontology.getURI());
		} catch (OWLOntologyCreationException e) {
			e.printStackTrace();
		}
		List<AddAxiom> addedList = new ArrayList<AddAxiom>();
		
		Iterator<OWLAxiom> iter = allAxioms.iterator();
		while(iter.hasNext()) {  // adding axioms in inconsistent ontology into the mis
			AddAxiom addAxiom = new AddAxiom(mis, iter.next());
			addedList.add(addAxiom);
		}
		try {
			manager.applyChanges(addedList);
		} catch (OWLOntologyChangeException e) {
			e.printStackTrace();
		}
		
		iter = removedAxioms.iterator();
		while(iter.hasNext()) {
			OWLAxiom a = iter.next();
			RemoveAxiom removedAxiom = new RemoveAxiom(mis, a);
			try {
				manager.applyChange(removedAxiom);
			} catch (OWLOntologyChangeException e) {
				e.printStackTrace();
			}
			classicalReasoner.loadOntology(mis);
			if(classicalReasoner.getInconsistentClasses().isEmpty()&&classicalReasoner.isConsistent()) {
				AddAxiom addedAxiom = new AddAxiom(mis,a);
				try {
					manager.applyChange(addedAxiom);
				} catch (OWLOntologyChangeException e) {
					e.printStackTrace();
				}
			}
			classicalReasoner.unloadOntology(mis);
		}
		
		iter = reservedAxioms.iterator();	
		List<RemoveAxiom> removedList = new ArrayList<RemoveAxiom>();
		while(iter.hasNext()) {
			RemoveAxiom removedAxiom = new RemoveAxiom(mis, iter.next());
			removedList.add(removedAxiom);
		}
		try {
			manager.applyChanges(removedList);
		} catch (OWLOntologyChangeException e) {
			e.printStackTrace();
		}
		
		classicalReasoner.loadOntology(mis);
		if(classicalReasoner.getInconsistentClasses().isEmpty()&&classicalReasoner.isConsistent()) {
			iter = reservedAxioms.iterator();
			List<AddAxiom> addedList1 = new ArrayList<AddAxiom>();
			while(iter.hasNext()) {
				AddAxiom addedAxiom = new AddAxiom(mis, iter.next());
				addedList1.add(addedAxiom);
			}
			try {
				manager.applyChanges(addedList1);
			} catch (OWLOntologyChangeException e) {
				e.printStackTrace();
			}
			
			return mis;
		} else { // optimization incoherent situation with justification
			classicalReasoner.unloadOntology(mis);
			classicalReasoner.loadOntology(inconsistentOnt);
			if(classicalReasoner.isConsistent()) {
			
				PelletOptions.USE_TRACING = true;
				Reasoner reasoner = new Reasoner( manager );
				reasoner.loadOntology( inconsistentOnt );			
				Set<OWLClass> unsatisfiableConcepts = reasoner.getInconsistentClasses();
				Iterator<OWLClass> cIter = unsatisfiableConcepts.iterator();
				

				cIter = unsatisfiableConcepts.iterator();
				while(cIter.hasNext()) {
					OWLClass c = cIter.next();
					reasoner.getKB().setDoExplanation( true );
					reasoner.isSatisfiable(c);
					Set<OWLAxiom> exp = reasoner.getExplanation();
					Set<OWLAxiom> refinedExp = exp;
//					Set<OWLAxiom> refinedExp = mis(exp);
					if(intersection(refinedExp,reservedAxioms)) {
						Set<OWLAxiom> returedAxioms = new HashSet<OWLAxiom>();
						returedAxioms.addAll(refinedExp);
						returedAxioms.addAll(reservedAxioms);
						addedList = new ArrayList<AddAxiom>();
						
						OWLOntology result = null;
						OWLOntologyManager manager1 = OWLManager.createOWLOntologyManager();
						try {
							result = manager1.createOntology(this.ontology.getURI());
						} catch (OWLOntologyCreationException e) {
							e.printStackTrace();
						}
						iter = returedAxioms.iterator();
						while(iter.hasNext()) {  // adding axioms in inconsistent ontology into the result
							AddAxiom addAxiom = new AddAxiom(result, iter.next());
							addedList.add(addAxiom);
						}
						try {
							manager1.applyChanges(addedList);
						} catch (OWLOntologyChangeException e) {
							e.printStackTrace();
						}
						return result;
					} 
				}
			} else { // optimization inconsistent situation
				return null;
			}
			classicalReasoner.unloadOntology(inconsistentOnt);
		}
		return null;
	}
	
	/**
	 * returns the real justification
	 */
	private Set<OWLAxiom> mis(Set<OWLAxiom> exp) {
		OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
		Reasoner classicalReasoner = new Reasoner(manager);
		
		
		OWLOntology result = null;
		try {
			result = manager.createOntology(this.ontology.getURI());
		} catch (OWLOntologyCreationException e) {
			e.printStackTrace();
		}
		List<AddAxiom> addedList = new ArrayList<AddAxiom>();
		
		Iterator<OWLAxiom> iter = exp.iterator();
		while(iter.hasNext()) {  // adding axioms in inconsistent ontology into the mis
			AddAxiom addAxiom = new AddAxiom(result, iter.next());
			addedList.add(addAxiom);
		}
		try {
			manager.applyChanges(addedList);
		} catch (OWLOntologyChangeException e) {
			e.printStackTrace();
		}
		
		iter = exp.iterator();
		while(iter.hasNext()) {
			OWLAxiom a = iter.next();
			RemoveAxiom removedAxiom = new RemoveAxiom(result, a);
			try {
				manager.applyChange(removedAxiom);
			} catch (OWLOntologyChangeException e) {
				e.printStackTrace();
			}
			classicalReasoner.loadOntology(result);
			if(classicalReasoner.getInconsistentClasses().isEmpty()&&classicalReasoner.isConsistent()) {
				AddAxiom addedAxiom = new AddAxiom(result,a);
				try {
					manager.applyChange(addedAxiom);
				} catch (OWLOntologyChangeException e) {
					e.printStackTrace();
				}
			}
			classicalReasoner.unloadOntology(result);
		}
		return result.getAxioms();
	}

	/**
	 * returns true if the two sets is intersected
	 */
	private Boolean intersection(Set s1, Set s2) { 
		Set temp = new HashSet();
		temp.addAll(s1);
		temp.retainAll(s2);
		if(temp.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
	

	

}

