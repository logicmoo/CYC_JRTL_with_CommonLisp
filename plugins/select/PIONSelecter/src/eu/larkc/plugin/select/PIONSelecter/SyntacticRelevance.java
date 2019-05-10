package eu.larkc.plugin.select.PIONSelecter;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.semanticweb.owl.model.OWLAxiom;
import org.semanticweb.owl.model.OWLClass;
import org.semanticweb.owl.model.OWLOntology;

public class SyntacticRelevance {
	
	public static boolean relevant(OWLAxiom axiom, List<String> constants)
	
	{
		boolean status = false;
				
		Iterator<String> iter = constants.iterator();
		
		while (iter.hasNext()&&!status)
		{
		String constant = iter.next();
		
		if (relevant(axiom,constant)){status=true;}
		}
		return status;
		
	}

public static boolean relevant(OWLAxiom axiom, OWLAxiom axiom1)

{
boolean status = false;
Set <OWLClass> classes = axiom.getClassesInSignature();
Set <OWLClass> classes1 = axiom1.getClassesInSignature();

Iterator<OWLClass> iter = classes.iterator();

while (iter.hasNext()&&!status)
{
OWLClass c = iter.next();	
if (classes1.contains(c)){status = true;};
}

//System.out.println( "[PIONSelectionFunction] " + status + ":" + classes + " intersects " + classes1);

return status;

}

public static boolean relevant(OWLAxiom axiom, String constant)

{
boolean status = false;
Set <OWLClass> classes = axiom.getClassesInSignature();

Iterator<OWLClass> iter = classes.iterator();

while (iter.hasNext()&&!status)
{
OWLClass c = iter.next();	
if (c.toString().equals(constant)){status = true;};
}

//System.out.println( "[PIONSelectionFunction] " + status + ":" + classes + " contains " + constant);

return status;

}

public static boolean relevant(OWLAxiom axiom, OWLOntology dataSet)

{
	boolean status = false;
	
	Set<OWLAxiom> axioms = dataSet.getAxioms();
	
	Iterator<OWLAxiom> iter = axioms.iterator();
	
	while (iter.hasNext()&&!status)
	{
		OWLAxiom axiom1 = iter.next();
	if (relevant(axiom,axiom1)){status = true;};
	
	}
			
	
	return status;
	
}

}
