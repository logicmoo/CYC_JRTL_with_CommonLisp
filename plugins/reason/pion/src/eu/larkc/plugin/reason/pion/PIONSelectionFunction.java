package eu.larkc.plugin.reason.pion;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.semanticweb.owl.apibinding.OWLManager;
import org.semanticweb.owl.model.OWLAxiom;
import org.semanticweb.owl.model.OWLClass;
import org.semanticweb.owl.model.OWLOntology;
import org.semanticweb.owl.model.OWLOntologyChangeException;
import org.semanticweb.owl.model.OWLOntologyCreationException;
import org.semanticweb.owl.model.OWLOntologyManager;

import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryFactory;
//import com.hp.hpl.jena.query.core.Element;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.rdf.model.StmtIterator;
import com.hp.hpl.jena.sparql.core.BasicPattern;
import com.hp.hpl.jena.sparql.syntax.Element;


public class PIONSelectionFunction {
		
	public static Model Selection(Model workingSet, Model dataSet) {
		
		Model selectedModel=ModelFactory.createDefaultModel();
		
		StmtIterator iter = dataSet.listStatements();
		
		while (iter.hasNext())
		{
		Statement stmt = iter.nextStatement();
		
		if (relevant(stmt,workingSet)){ selectedModel.add(stmt);};
		
		}
		
		return selectedModel;
}
	
	public static OWLOntology Selection0(OWLOntology workingSet, OWLOntology dataSet) {
		
		  OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
		 
			
			
			Set<OWLAxiom> axioms = dataSet.getAxioms();
	
			Iterator<OWLAxiom> iter = axioms.iterator();
			
			while (iter.hasNext())
			{
			OWLAxiom  axiom = iter.next();
			
			if (!relevant(axiom,workingSet)){axioms.remove(axioms); };		
			}
			
			OWLOntology selectedOntology = null;
			try {
				selectedOntology = manager.createOntology(axioms);
			} catch (OWLOntologyCreationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (OWLOntologyChangeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return selectedOntology;
	}
	
public static OWLOntology Selection(OWLOntology workingSet, OWLOntology dataSet) {
	
	  OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
		
		Set<OWLAxiom> axioms = dataSet.getAxioms();
		List<OWLAxiom> result0 = new ArrayList<OWLAxiom>();
		Set newAxioms = new HashSet(result0);
		
		Iterator<OWLAxiom> iter = axioms.iterator();
		
		while (iter.hasNext())
		{
		OWLAxiom  axiom = iter.next();
		
		if (relevant(axiom,workingSet)){ newAxioms.add(axiom);};
		};
		
	    OWLOntology selectedOntology=null;
		try {
			selectedOntology = manager.createOntology(newAxioms);
		} catch (OWLOntologyCreationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (OWLOntologyChangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return selectedOntology;
}
	
public static Model k_Selection(Model workingSet, Model dataSet, int k) {
		
		Model selectedModel=workingSet;
		
		int i =0;
		
		
		while (i < k){
	selectedModel = Selection(selectedModel, dataSet);
	i = i+1;
	}
		
		return selectedModel;
}

		public static Model Selection_with_stoprule(Model workingSet, Model dataSet) {
			
			Model selectedModel=workingSet;
			
//			long forage_value= 0;
			long last_increment = 0;
			long increment = 0;
			long last_size = 0;
		
			

		do {
		last_increment = increment;	
	
		selectedModel = Selection(selectedModel, dataSet);
		long s = selectedModel.size();
		increment = s - last_size;
		System.out.println( "increment = " + increment);
		
		last_size = s; 

		} while ((increment > last_increment)&&(increment > 0));
		
				
		
		return selectedModel;
}
		
public static OWLOntology Selection_with_stoprule2(OWLOntology workingSet, OWLOntology dataSet) {
			
			OWLOntology selectedOntology=workingSet;
			
			long last_increment = 0;
			long increment = 0;
			long last_size = 0;
		
	

		do {
		last_increment = increment;	
	
		selectedOntology = Selection(selectedOntology, dataSet);
		long s = selectedOntology.getAxiomCount();
		increment = s - last_size;
		System.out.println( "increment = " + increment);
		
		last_size = s; 

		} while ((increment > last_increment)&&(increment > 0));
		
				
		
		return selectedOntology;
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
	
//	System.out.println( "[PIONSelectionFunction] " + status + ":" + classes + " contains " + constant);
	
	return status;
	
}
	
	public static boolean relevant(Statement stmt, Model workingSet) {
		
		boolean status = false;
		
     StmtIterator iter = workingSet.listStatements();
     Resource subject = stmt.getSubject();
     Property predicate = stmt.getPredicate();
     RDFNode object = stmt.getObject();
     

		
		while ((iter.hasNext())&& (status== false))
		{
		Statement stmt2 = iter.nextStatement();
		Resource subject2 = stmt2.getSubject();
		Property predicate2 = stmt2.getPredicate();
		RDFNode object2 = stmt2.getObject();
		
	//	if (subject==subject2||predicate==predicate2||object==object2)
		if (subject.equals(subject2)||subject.equals(object2)||object.equals(subject2)||object.equals(object2)){status = true;}
		
//		System.out.print("subject ="+ subject+",\n");
//		System.out.print("subject2="+ subject2+",   status="+ status + "\n");
		}
		
		
		return status;
		
	}
	
	public static boolean relevant(Statement stmt, String[] constants) {
	
		 Boolean result = false;
		 Resource subject = stmt.getSubject();
	     Property predicate = stmt.getPredicate();
	     RDFNode object = stmt.getObject();
	     String sub =subject.toString();
	     String p =predicate.toString();
	     String o =object.toString();
	     
	     int i =0;
	
	     String s = constants[i];
	     
	 while (!constants[i].equals("last"))    {
	
	     
	    if (sub.equals(s)||o.equals(s)||p.equals(s)){return true;};
	  
	    
	    i =i+1;
		// System.out.println("the i is "+ i);
		// System.out.println("***************");
		// System.out.println("s is " + s + ".");
		// System.out.println("sub is "+ sub+".");
		// System.out.println("p is "+ p + ".");
		// System.out.println("o is "+ o+ ".");
		 s = constants[i];
	 }
	 
	return result;
	}
	public static List<String> getLiteralsfromQuery(String query) {
	
		//System.out.println("the query is " + query);
		com.hp.hpl.jena.query.Query theQuery = QueryFactory.create(query);
		//System.out.println("theQuery is " + theQuery);
		//System.out.println("theQuery.type  " + theQuery.getClass());
		
		BasicPattern pattern = Query2OWLQuery.getBasicPattern(theQuery);
		List<String>  result  = Query2OWLQuery.getLiteralsFromBasicPattern(pattern);
		
	

		
  //System.out.println("the list is " + s);
    
  
	return result;	
	
	}
	
	
	
	public static OWLOntology selectionwithLiterals(OWLOntology dataSet, List<String> constants)
	{
	
		 OWLOntologyManager manager = OWLManager.createOWLOntologyManager();

			Set<OWLAxiom> axioms = dataSet.getAxioms();
			List<OWLAxiom> result0 = new ArrayList<OWLAxiom>();
			Set newAxioms = new HashSet(result0);

			
			Iterator<OWLAxiom> iter = axioms.iterator();
			
			while (iter.hasNext())
			{
			OWLAxiom  axiom = iter.next();
			
			if (relevant(axiom,constants)){ newAxioms.add(axiom);}
			}
			
			OWLOntology selectedOntology=null;
			try {
				selectedOntology = manager.createOntology(newAxioms);
			} catch (OWLOntologyCreationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (OWLOntologyChangeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return selectedOntology;
		
	

	}
	
	public static Model selectionwithConstants(Model model, String[] constants)
	{
		Model  result = ModelFactory.createDefaultModel();
		
		 StmtIterator iter = model.listStatements();
		 while (iter.hasNext())
			{
			Statement stmt = iter.nextStatement();
			
			 if (relevant(stmt,  constants)){
				 result.add(stmt);
			 };
			 
			}
		
		
		return result;
	}

	
	
	public  static Boolean isNonStandardClassName(String s)
	{
		Boolean result = true;
		String type = "http://www.w3.org/1999/02/22-rdf-syntax-ns#type";

		if (s.equals(type)){result = false;};
		if (s.equals(null)){result = false;};
		return result;
	}

	
}
