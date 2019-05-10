package eu.larkc.plugin.reason.OWLAPIReasoner;


	import org.semanticweb.owl.apibinding.OWLManager;
	import org.semanticweb.owl.model.OWLDataFactory;
	import org.semanticweb.owl.model.OWLOntology;
	import org.semanticweb.owl.model.OWLOntologyManager;

	public class OWLReasonerFact{
		

		    public OWLOntologyManager manager;
			public OWLOntology ontology;
			public org.mindswap.pellet.owlapi.Reasoner reasoner;
			public OWLDataFactory factory;
			public static boolean status;

			
			public OWLReasonerFact()
			{
				
			}
			
			public void OWLReasonerFactInit()
			{
				manager = OWLManager.createOWLOntologyManager();

				reasoner = new org.mindswap.pellet.owlapi.Reasoner( manager );
				
				factory =manager.getOWLDataFactory();
				
			}
				

		}





