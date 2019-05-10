package eu.larkc.plugin.reason.CRION;

import java.util.Iterator;
import java.util.Set;

import org.semanticweb.owl.model.OWLAxiom;

/**
 * <p/>
 * represents the contrastive answer: {original} but {contrastive} although {clarification}
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
public class ContrastiveAnswer {
	private Set<OWLAxiom> originalAxiomSet;
	private Set<OWLAxiom> clarificationAxiomSet;
	private Set<OWLAxiom> contrastiveAxiomSet;
	

	public ContrastiveAnswer(Set<OWLAxiom> originalAxiomSet, Set<OWLAxiom> clarificationAxiomSet,
			Set<OWLAxiom> contrastiveAxiomSet) {
		super();
		this.originalAxiomSet = originalAxiomSet;
		this.clarificationAxiomSet = clarificationAxiomSet;
		this.contrastiveAxiomSet = contrastiveAxiomSet;
	}
	
	public Set<OWLAxiom> getOriginalAxiomSet() {
		return originalAxiomSet;
	}

	public void setOriginalAxiomSet(Set<OWLAxiom> originalAxiomSet) {
		this.originalAxiomSet = originalAxiomSet;
	}

	public Set<OWLAxiom> getClarificationAxiomSet() {
		return clarificationAxiomSet;
	}

	public void setClarificationAxiomSet(Set<OWLAxiom> clarificationAxiomSet) {
		this.clarificationAxiomSet = clarificationAxiomSet;
	}

	public Set<OWLAxiom> getContrastiveAxiomSet() {
		return contrastiveAxiomSet;
	}

	public void setContrastiveAxiomSet(Set<OWLAxiom> contrastiveAxiomSet) {
		this.contrastiveAxiomSet = contrastiveAxiomSet;
	}

	
	public String toString() {
		String original = null;
		String clarification = null;
		String contrastive = null;
		
		Iterator<OWLAxiom> iter = this.originalAxiomSet.iterator();
		while(iter.hasNext()) {
			if(original==null) {
				original = iter.next().toString()+",";
			} else {
				original = original+iter.next().toString()+",";
			}
		}
		original = "{"+original+"}";
		iter = this.clarificationAxiomSet.iterator();
		while(iter.hasNext()) {
			if(clarification==null) {
				clarification = iter.next().toString()+",";
			} else {
				clarification = clarification+iter.next().toString()+",";
			}

		}
		clarification = "{"+clarification+"}";
		iter = this.contrastiveAxiomSet.iterator();
		while(iter.hasNext()) {
			if(contrastive==null) {
				contrastive = iter.next().toString()+",";				
			} else {
				contrastive = contrastive+iter.next().toString()+",";				
			}

		}
		contrastive = "{"+contrastive+"}";

		
		return "("+original+ " but "+contrastive+" although "+clarification+")";
	}

	
	
	
}
