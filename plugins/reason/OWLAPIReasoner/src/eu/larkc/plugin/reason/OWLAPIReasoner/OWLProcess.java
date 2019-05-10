package eu.larkc.plugin.reason.OWLAPIReasoner;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


import org.semanticweb.owl.apibinding.OWLManager;
import org.semanticweb.owl.model.OWLClass;
import org.semanticweb.owl.model.OWLDataFactory;
import org.semanticweb.owl.model.OWLDescription;
import org.semanticweb.owl.model.OWLIndividual;
import org.semanticweb.owl.model.OWLObject;
import org.semanticweb.owl.model.OWLObjectIntersectionOf;
import org.semanticweb.owl.model.OWLObjectUnionOf;
import org.semanticweb.owl.model.OWLOntology;
import org.semanticweb.owl.model.OWLOntologyCreationException;
import org.semanticweb.owl.model.OWLOntologyManager;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.hp.hpl.jena.graph.Triple;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.sparql.core.BasicPattern;

import eu.larkc.core.data.RdfGraph;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.reason.DIGReasoner.DIGAnswer;
import eu.larkc.plugin.reason.DIGReasoner.DIGQueryID;

public class OWLProcess {
	
	private static Set<OWLClass> inconsistentClasses;
	private static Set<OWLClass> allClasses;
	
	public static OWLReasonerFact getOWLReasonerFactfromStatements(SetOfStatements statements)
	{
		
		OWLReasonerFact reasonerFact = new OWLReasonerFact();
		
		RdfGraph graph = (RdfGraph) statements;
		org.openrdf.model.URI uri= graph.getName();	
		
		String String_URI = uri.toString();
		  
	  java.net.URI physicalURI = java.net.URI.create(String_URI);
	//   java.net.URI physicalURI = java.net.URI.create("http://www.co-ode.org/ontologies/pizza/pizza.owlapi");
	  
	  reasonerFact.manager = OWLManager.createOWLOntologyManager();


		try {
			reasonerFact.ontology = reasonerFact.manager.loadOntology(java.net.URI.create(String_URI));
		} catch (OWLOntologyCreationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			reasonerFact.status = false;
		}

		reasonerFact.reasoner = new org.mindswap.pellet.owlapi.Reasoner( reasonerFact.manager );
		
		 
//		System.out.println("[OWLProcess]String_URI= " + String_URI);


//		 System.out.println("[OWLProcess]ontology= " + reasonerFact.ontology.getAxioms().toString());

		reasonerFact.reasoner.loadOntology(reasonerFact.ontology);
	   
//		if (reasoner.isConsistent()) {System.out.println("the ontology is consistent.");} else {System.out.println("the ontology is inconsistent.");};
		 

		
		reasonerFact.factory = OWLManager.createOWLOntologyManager().getOWLDataFactory();

	//     reasonerFact.reasoner.classify();
	     
	     reasonerFact.status = true;

	  return reasonerFact;   

	}

	
	
	public static OWLAnswer Query2Answer(OWLQuery owlQuery, org.mindswap.pellet.owlapi.Reasoner reasoner, OWLDataFactory factory){
	    OWLAnswer answer= new OWLAnswer();
	    
	    
	    Node queryNode= owlQuery.queryNode;
	    
	    String queryType = queryNode.getNodeName();
		
		Node queryBody = queryNode.getFirstChild();
		
		String queryID = owlQuery.queryID;
		
//		System.out.println("[OWLProcess]  queryID="+queryID);
		
		OWLQueryID owlQueryID = new OWLQueryID(queryID);
		
		owlQueryID.getTripleFromQueryID();
		
		answer.currentVar = owlQueryID.currentVar;
		answer.currentLiteral = owlQueryID.currentLiteral;

	   
	    
	    OWLDescription des = (OWLDescription) getOWLObject(queryBody);
		
	 //          System.out.println("[OWLProcess]  des="+des);
				
	           Node queryBody2 = queryNode.getLastChild();
	//           System.out.println("[OWLProcess]  queryBody2="+queryBody2);
	           
	           OWLDescription des2 = (OWLDescription) getOWLObject(queryBody2);
				
	 //         System.out.println("[OWLProcess]  des2="+des2);
	           
		         Set<Set<OWLClass>> thisAnswer = null;
		         Set<OWLIndividual> thisAnswer2;
		         Set<OWLClass> thisAnswer3;
           
	         if (queryType.equals("IsSuperClassOf")){answer.booleanAnswer = reasoner.isSubClassOf(des2, des);
	            
	       //    System.out.println("[OWLProcess]  isSuperClassOf("+des +"," + des2 + ")="+ thisAnswer);
	         }  if (queryType.equals("IsSubClassOf")){answer.booleanAnswer = reasoner.isSubClassOf(des, des2);
	            
	       //    System.out.println("[OWLProcess]  isSuClassOf("+des2 +"," + des + ")="+ thisAnswer);
	         } if (queryType.equals("IsDisjointWith")){answer.booleanAnswer = reasoner.isDisjointWith(des, des2);            
	      //     System.out.println("[OWLProcess]  isDisjointWith("+des2 +"," + des + ")="+ thisAnswer);
	         } if (queryType.equals("IsComplementOf")){answer.booleanAnswer = reasoner.isComplementOf(des,des2);            
	      //     System.out.println("[OWLProcess]  isComplementOf("+des2 +"," + des + ")="+ thisAnswer);
	         } 
	 		if (queryType.equals("getSuperClassOf")){ thisAnswer =  reasoner.getSuperClasses(des);
                                                  answer.currentBinding = convert0(thisAnswer);
		    //       System.out.println("[OWLProcess]  SuperClassOf("+des + ")="+ thisAnswer);
		         }  if (queryType.equals("getSubClassOf")){thisAnswer = reasoner.getSubClasses(des);
		                                        answer.currentBinding = convert0(thisAnswer);
		 //          System.out.println("[OWLProcess]  SuClassOf("+des +")="+ thisAnswer);
		         } if (queryType.equals("getDisjointWith")){thisAnswer = reasoner.getDisjointClasses(des);
		                                       answer.currentBinding = convert0(thisAnswer);
//		           System.out.println("[OWLProcess]  DisjointWith("+des +")="+ thisAnswer);
		         } if (queryType.equals("getAncestors")){
                     thisAnswer = reasoner.getAncestorClasses(des); 
                       answer.currentBinding = convert0(thisAnswer);
 //                    System.out.println("[OWLProcess]  Ancesters("+des +")="+ thisAnswer);
		         } if (queryType.equals("getDescendants")){
		                                  thisAnswer = reasoner.getDescendantClasses(des); 
		                                  answer.currentBinding = convert0(thisAnswer);
//		           System.out.println("[OWLProcess]  Descendants("+des +")="+ thisAnswer);
		         } if (queryType.equals("GetEquivalentClasses")){thisAnswer3 = reasoner.getEquivalentClasses(des);  
		         thisAnswer.add(thisAnswer3);
		         answer.currentBinding = convert0(thisAnswer);
//		           System.out.println("[OWLProcess]  EquivalentClasses("+des +")="+ thisAnswer3);
		         } if (queryType.equals("getComplementOf")){thisAnswer3 = reasoner.getComplementClasses(des); 
		           thisAnswer.add(thisAnswer3);
		//           System.out.println("[OWLProcess]  ComplementOf("+des +")="+ thisAnswer);
		           answer.currentBinding = convert0(thisAnswer);
		         } if (queryType.equals("GetInstances")){thisAnswer2 = reasoner.getIndividuals(des, true); 
		         answer.currentBinding = convert1(thisAnswer2);
		//          System.out.println("[OWLProcess]  InstanceOf("+des +")="+ thisAnswer2); 
		         
		         }
		         
//		         System.out.println("[OWLProcess]  answer.currentBinding="+ answer.currentBinding); 
	         
		         
		     answer.answerType= queryType;
	        
      
	    return answer;            
	         
	           
			}
			 

	
	public static  Boolean OWLQueryDocment2Ask(Document doc, org.mindswap.pellet.owlapi.Reasoner reasoner, OWLDataFactory factory){
	
		Boolean answer= false;
		
		allClasses = getAllClasses(reasoner, factory);
		
			Node node = (Node) doc;
			NodeList list = node.getChildNodes();
			Node requestNode = list.item(0);
			NodeList queryList = requestNode.getChildNodes();
			
			List<OWLAnswer> answers = new ArrayList<OWLAnswer>();
					
			int i =0;
			int l = queryList.getLength(); 
			if (l > 0){
				
  
				while (queryList.item(i).getNodeName().equals("#text")&& i <l){ 
					i++;
				};
				
				
				
				Node queryNode = queryList.item(i);
				
				OWLQuery owlQuery = new OWLQuery();
				
				owlQuery.queryNode = queryNode;
				
				
		           NamedNodeMap Attributes = queryNode.getAttributes();
					
					String queryID = Attributes.getNamedItem("id").toString();
					owlQuery.queryID = queryID;
				
                OWLAnswer owlAnswer= OWLProcess.Query2Answer(owlQuery, reasoner, factory);				

                
                answer = owlAnswer.booleanAnswer;
	 
	           
			}		
           

			return answer;
			
		}
	
	@SuppressWarnings("unchecked")
	public static  List<List<String>> OWLQueryDocment2Select(Document doc, org.mindswap.pellet.owlapi.Reasoner reasoner, OWLDataFactory factory){
		
		List<List<String>> answer = new ArrayList<List<String>>();
		
		allClasses = getAllClasses(reasoner, factory);
		
			Node node = (Node) doc;
			NodeList list = node.getChildNodes();
			Node requestNode = list.item(0);
			NodeList queryList = requestNode.getChildNodes();
			
			List<OWLAnswer> answers = new ArrayList<OWLAnswer>();
					
			int i =0;
			int l = queryList.getLength(); 
			if (l > 0){
				
  
				while (queryList.item(i).getNodeName().equals("#text")&& i <l){ 
					i++;
				};
				
				
				
				Node queryNode = queryList.item(i);
				
			OWLQuery owlQuery = new OWLQuery();
				
				owlQuery.queryNode = queryNode;
				
	
                OWLAnswer owlAnswer= OWLProcess.Query2Answer(owlQuery, reasoner, factory);				
				
				
	
                
          answer.add(owlAnswer.currentBinding);
	         
	           
			}
			
           

			return answer;
			
		}
	
public static List<List<String>> convert(Set<Set<OWLClass>> answer0)
{
	List<List<String>> answer = new ArrayList<List<String>>();
	
	 Iterator<Set<OWLClass>>  iter = answer0.iterator();
	 
	 while(iter.hasNext())
	   {
		 List<String> a = new ArrayList<String>();
		 
		 Iterator<OWLClass> iter0  = iter.next().iterator();
		 while(iter0.hasNext())
		   {
			 OWLClass c = iter0.next();
			 String s = c.toString();
			 a.add(s);
		   }
		 
		 answer.add(a);
		 
		   }
		 

	
	return answer;
	
}

public static List<String> convert0(Set<Set<OWLClass>> answer0)
{
	List<String> answer = new ArrayList<String>();
	
	 Iterator<Set<OWLClass>>  iter = answer0.iterator();
	 
	 while(iter.hasNext())
	   {
		 
		 Iterator<OWLClass> iter0  = iter.next().iterator();
		 while(iter0.hasNext())
		   {
			 OWLClass c = iter0.next();
//			 String s = c.toString();
			 String s = c.getURI().toString();
			 answer.add(s);
		   }
	   }
	 
	return answer;
	
}

public static List<String> convert1(Set<OWLIndividual> answer0)
{
	List<String> answer = new ArrayList<String>();
	
	 Iterator<OWLIndividual>  iter = answer0.iterator();
	 
	 while(iter.hasNext())
	   {
		 
			 OWLIndividual c = iter.next();
//			 String s = c.toString();
			 String s = c.getURI().toString();
			 answer.add(s);
		   }
	
	return answer;
	
}

public static  List<OWLAnswer> OWLQueries2Answers(List<OWLQuery> queryList, org.mindswap.pellet.owlapi.Reasoner reasoner, OWLDataFactory factory){
	
		
		List<OWLAnswer> answers = new ArrayList<OWLAnswer>();
	
				
			Iterator<OWLQuery> iter = queryList.iterator();
					 
			OWLAnswer owlAnswer = new OWLAnswer();
			
			while(iter.hasNext())
			
			{ 
			OWLQuery owlQuery= iter.next();

            owlAnswer = Query2Answer(owlQuery, reasoner, factory);  
     
			answers.add(owlAnswer);
		}
		return answers;
		
	}



	
public static  List<OWLAnswer> OWLQueryDocument2Answers(Document doc, org.mindswap.pellet.owlapi.Reasoner reasoner, OWLDataFactory factory){
		
	//allClasses = getAllClasses(reasoner, factory);
	
		Node node = (Node) doc;
		NodeList list = node.getChildNodes();
		Node requestNode = list.item(0);
		NodeList queryList = requestNode.getChildNodes();
		
		List<OWLAnswer> answers = new ArrayList<OWLAnswer>();
				
		int i =0;
		int l = queryList.getLength(); 
		
//		System.out.println("[OWLProcess]  l="+ l);
		if(l > 0){
			
         while (i<l)
         {
			
//        		System.out.println("[OWLProcess]  *i="+ i);
        		
        	 while (i<l && queryList.item(i).getNodeName().equals("#text")){ 
//				System.out.println("[OWLProcess] *** remove #text ***");
				i++;
			};
			
		

			
			if (i<l)
			{
			OWLAnswer owlAnswer = new OWLAnswer();
	
			
			Node queryNode = queryList.item(i);
				
			String queryType = queryNode.getNodeName();
			
			Node queryBody = queryNode.getFirstChild();
			
			OWLQuery owlQuery = new OWLQuery();		
			
			owlQuery.queryNode = queryNode;
			owlQuery.queryType = queryType;
			
            NamedNodeMap Attributes = queryNode.getAttributes();
			
//			String queryID = Attributes.item(0).toString();
			String queryID = Attributes.getNamedItem("id").toString();
			owlQuery.queryID = queryID;

			
			
	//		System.out.println("[OWLProcess]  queryNode=" + queryNode + " queryType=" + queryType + " queryBody" + queryBody + "queryID="+ queryID);
			

            owlAnswer = Query2Answer(owlQuery, reasoner, factory);  
     
			answers.add(owlAnswer);
			
			i++;	

		
		}

        }
         
		}

		return answers;
		
	}


	
public Boolean IsComplement(Node node) {
    Boolean result =false;
		
		String queryType = node.getNodeName();
		
		if (queryType.equalsIgnoreCase("ObjectComplementOf")) {result = true;};
		
		return result;
	}


	public static Boolean IsIntersection(Node node) {
		// TODO Auto-generated method stub
		Boolean result =false;
		
		String queryType = node.getNodeName();
		
		if (queryType.equalsIgnoreCase("ObjectIntersectionOf")) {result = true;};
		
		return result;
	}


	
	public static Boolean IsUnion(Node node) {
	     Boolean result =false;
			
			String queryType = node.getNodeName();
			
			if (queryType.equalsIgnoreCase("ObjectUnionOf")) {result = true;};
			
			return result;
		}

	public static Boolean IsPrimitiveClass(Node node) {
		
		Boolean result = false;
		
	  String queryType = node.getNodeName();
		
		if (queryType.equalsIgnoreCase("owl:Class")) {result = true;};
		
		return result;
	}
	
	public static OWLObject getOWLObject(Node node) {
		// TODO Auto-generated method stub
		

		OWLDataFactory factory = OWLManager.createOWLOntologyManager().getOWLDataFactory();
		
        OWLObject result =null;
		
		if (IsPrimitiveClass(node)){ NamedNodeMap attributes = node.getAttributes();
		String att = attributes.getNamedItem("IRI").toString();
		int l = att.length();
		result = factory.getOWLClass(URI.create(att.substring(5,l-1)));
//		System.out.println("[OWLProcess]  IRIclass=" + att.substring(5,l-1));
		}
		if (IsIntersection(node)){
		NodeList nodes = node.getChildNodes();
		Set<OWLClass>  o2=  getOWLClasses(nodes);
//		System.out.println("[OWLProcess]  o2=" + o2);
		OWLObjectIntersectionOf intersection = factory.getOWLObjectIntersectionOf(o2);
		result = intersection;
		}
		if (IsUnion(node)){
			NodeList nodes = node.getChildNodes();
			Set<OWLClass>  o2=  getOWLClasses(nodes);
		    OWLObjectUnionOf union = factory.getOWLObjectUnionOf(o2);
	    result = union;
		};
		
	
		
		return result;
	}
	

	@SuppressWarnings("null")
	public static Set<OWLClass> getOWLClasses(NodeList nodes) {
		
		List<OWLClass> result0 = new ArrayList<OWLClass>();
		Set result = new HashSet(result0);
		
		
	int l = nodes.getLength();
	
	int i =0;
	if (l > 0){
		
		while (i <l){ 
			Node node = nodes.item(i);
//			System.out.println("[OWLProcess]  cNode=" + node);
			
			if (!node.getNodeName().equals("#text")){OWLClass  c = (OWLClass) getOWLObject(node);
 // 		    System.out.println("[OWLProcess]  c=" + c);
			result.add(c);
			}
			
			i++;
		}
		};
	
	
		
	return result;
	
	}
	
public static Set<OWLClass>	getInconsistentClasses(org.mindswap.pellet.owlapi.Reasoner reasoner, OWLDataFactory factory)
	{
	
	OWLClass nothing = factory.getOWLNothing();
	
	Set<OWLClass> incClasses = reasoner.getEquivalentClasses(nothing);
	
//	System.out.println("the inconsistent class set = "+incClasses);
	
	return incClasses;
	}

public static OWLOntology getOWLOntology(SetOfStatements statements)
{
	RdfGraph graph = (RdfGraph) statements;
	org.openrdf.model.URI uri= graph.getName();	
	
	String String_URI = uri.toString();
	  
 //   java.net.URI physicalURI = java.net.URI.create(String_URI);

    
    OWLOntologyManager manager = OWLManager.createOWLOntologyManager();

	OWLOntology ontology = null;
	try {
		ontology = manager.loadOntology(java.net.URI.create(String_URI));
	} catch (OWLOntologyCreationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return ontology;
	
}

public static Set<OWLClass>	getAllClasses(org.mindswap.pellet.owlapi.Reasoner reasoner, OWLDataFactory factory)
{

	Set<OWLClass> classes = reasoner.getClasses();
	
//	System.out.println("the owl class set = "+classes);

return classes;
}

public static boolean getConjunctiveBooleanAnswer(List<OWLAnswer> answers)
{
	boolean answer=true;
	
	Iterator<OWLAnswer> iter = answers.iterator();
	
	while(iter.hasNext())
	{
		OWLAnswer owlAnswer = iter.next();
	if (!owlAnswer.booleanAnswer){answer=false;}
	
	}
	
	return answer;
}

public static OWLAnswer getCommonAnswer(List<OWLAnswer> answers)
{
	OWLAnswer answer = answers.get(0);
	List<String> binding = answer.currentBinding;
	String var = answer.currentVar;
	
//	System.out.println("[OWLProcess:GetCommonAnswer]0th answer="+binding);
//	System.out.println("[OWLProcess:GetCommonAnswer]answers.size="+ answers.size());
	Iterator<String> iter = binding.iterator();
	while (iter.hasNext()){
		String value = iter.next();
		for (int i=1;i< answers.size();i++){
			OWLAnswer answeri= answers.get(i);

			List<String> bindingi = answeri.currentBinding;
			
			String vari = answeri.currentVar;
			
//			System.out.println("[OWLProcess:GetCommonAnswer]"+ i+"th checking the value=" + value + ", the bindingi ="+bindingi);

			if (!bindingi.contains(value) && vari.equals(var)) {
				iter.remove();
				//	  System.out.println("[DIGReasoner] removing " + value);		
			}
		}
	}
	answer.currentBinding = binding;
	return answer;	
}

public static List<List<String>>  addValues2BindingSet(List<List<String>> rs, List<String> values, String currentLiteral,int i)
{
//	System.out.println("Going to add values: "+ values +"with the literal " + currentLiteral + " on the following result set:");
//	PrintResultSet(rs);
	
	List<List<String>> newrs = new ArrayList<List<String>>();
	 newrs.clear();
	

	 	   Iterator<String>  iter = values.iterator();	
	 	   
	 	   while(iter.hasNext())
	 			   {
	 		       
	 		       String value = iter.next();	
	 		       
	 		       
	 		       if (rs.isEmpty())
	 		    	   {List<String> newlist = new ArrayList<String>();
	 		    	   newlist.add(value);
	 		    	   newrs.add(newlist);

	 			   }
	 		       else {
	 		    	   
	 		    	
	 		  		List<List<String>> newrs2 = new ArrayList<List<String>>();

 		    	    Iterator<List<String>>  iter2 = rs.iterator();	
	 		    	  
	 		    	  while(iter2.hasNext())
	 		    	  {
			    			 
	 		    			List<String>  solution = new ArrayList<String>();
	 		    			
	 		    			solution.clear();
	 		    			
	 		    		    solution = iter2.next();

	 		    		    
//	 		    		    if (member(currentLiteral, solution, i)){
	 		    		    if	(solution.get(i).equals(currentLiteral)){
	 		    		    	
	 		    		    List<String>  newsolution = new ArrayList<String>(solution);
		 		    	    
		 		    	    newsolution.add(value);
		 		    	    
	 		    			newrs2.add(newsolution);

	 		    			
	 		    		 };
	 		    		 
	 		    	  };
	 		    	  

//		 			     System.out.println("***newsrs2***: ");
	 		    	  
//	 		    	  PrintResultSet(newrs2);
	 		    	  
	 		    	  
	 		    	  
	 		    	  newrs.addAll(newrs2);
	 		    	   
	 		       };
	 			   
	 			   
	 			   }
	 	   
	 	   
//     System.out.println("new result set: ");
//     PrintResultSet(newrs);
     
	return newrs;} 
	 	    		


public static BasicPattern applyBinding2Pattern(String var, String value, BasicPattern pattern)
{
	   
   BasicPattern newpattern=new BasicPattern();
	
	 Iterator<Triple>  iter = pattern.iterator();
    
 	  while (iter.hasNext())
		{
 		  
       Triple t = iter.next();
   
//	System.out.println("processing "+ t);

		
	com.hp.hpl.jena.graph.Node subject = t.getSubject();
	com.hp.hpl.jena.graph.Node object =t.getObject();
	com.hp.hpl.jena.graph.Node predicate =  t.getPredicate();

	  
//	  System.out.println("subject="+subject+" var="+var);
	  
//	  System.out.println("object="+object+" var="+var);
	  
	  if (subject.toString().equals(var)){subject = com.hp.hpl.jena.graph.Node.createLiteral(value);};
	  if (object.toString().equals(var)){object = com.hp.hpl.jena.graph.Node.createLiteral(value);};
	  
	  Triple newtriple =Triple.create(subject, predicate, object);
	  
      newpattern.add(newtriple);
	  
		};
		
BasicPattern newpattern2 = newpattern; 
		    
//System.out.println("new basic pattern="+newpattern2);

return newpattern2;
}






}
