package eu.larkc.plugin.select.PIONSelecter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


import org.openrdf.model.URI;
import org.semanticweb.owl.apibinding.OWLManager;
import org.semanticweb.owl.model.OWLAxiom;
import org.semanticweb.owl.model.OWLDataFactory;
import org.semanticweb.owl.model.OWLOntology;
import org.semanticweb.owl.model.OWLOntologyChangeException;
import org.semanticweb.owl.model.OWLOntologyCreationException;
import org.semanticweb.owl.model.OWLOntologyManager;

import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.reason.OWLAPIReasoner.OWLReasonerFact;
import eu.larkc.plugin.reason.pion.PIONProcess;
import eu.larkc.plugin.select.Selecter;

public class SelectOntologyFromOntology implements Selecter 
{
	
	//select a subontology of the ontology which is contained by OWLReasonerFact,
	//which is relevant to the workingOntology
	
	public static OWLOntology workingOntology;
	public static OWLOntology selectedOntology;
	public static OWLOntology ontology;

	
	@Override
	public SetOfStatements select(SetOfStatements theSetOfStatements,
			Contract contract, Context context) {
		// TODO Auto-generated method stub

		
		Set<OWLAxiom> ontologyAxioms = ontology.getAxioms();
		List<OWLAxiom> result0 = new ArrayList<OWLAxiom>();
		Set newAxioms = new HashSet(result0);
		
		Iterator<OWLAxiom> iter = ontologyAxioms.iterator();
		
		while (iter.hasNext())
		{
		OWLAxiom  axiom = iter.next();
		
		if (SyntacticRelevance.relevant(axiom,workingOntology)){ 
			
			newAxioms.add(axiom);
			
	//		ontologyAxioms.remove(axiom);
			//to avoid reselect the same axiom next time
		
//		System.out.println("[SelectOntologyFromOntology]the new axiom is selected: "+axiom);

		
		};
		};
		
		try {
			
			OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
			selectedOntology = manager.createOntology(newAxioms);
		} catch (OWLOntologyCreationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (OWLOntologyChangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		SetOfStatements answer = PIONProcess.getSetOfStatements(selectedOntology);
		
		return answer;
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
