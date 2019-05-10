package eu.larkc.plugin.reason.OWLAPIReasoner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import com.hp.hpl.jena.graph.Node;
import com.hp.hpl.jena.graph.Triple;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.sparql.core.BasicPattern;
import com.hp.hpl.jena.sparql.syntax.Element;
import com.hp.hpl.jena.sparql.syntax.ElementGroup;
import com.hp.hpl.jena.sparql.syntax.ElementTriplesBlock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Query2OWLQuery {
	
	public static BasicPattern unprocessedPattern = new BasicPattern();
	public static boolean unprocessedPatternStatus = true;
		
	public static String thisKB;

	
	public static BasicPattern getBasicPattern(Query query)
	{
	          
	       Element pattern = query.getQueryPattern();
	       
	       
	       ElementGroup elementGroup = (ElementGroup) pattern;
	       
	       List<?> elements = elementGroup.getElements();
	       
	       Element first = (Element) elements.get(0);
	      BasicPattern triples = ((ElementTriplesBlock) first).getTriples();
	      
	      
//	      System.out.println("Basic pattern ="+triples);
		
	return triples;
	}
	

	
	public static String BasicPattern2OWLQueryString(BasicPattern pattern)
	{
//		System.out.println("[Query2OWLQuery] processing basic pattern: "+ pattern);
		
		 String answer="";
					 
		 String kb = getKBID(thisKB);

  	   Iterator<Triple>  iter = pattern.iterator();
		           
	 	  while (iter.hasNext()&&unprocessedPatternStatus)
			{
		 	  
	   	      String answer1="";
	   	      
	   	      
	 		  Triple t = null;
	 		  
	       t = iter.next();
	   
//		System.out.println("processing "+ t);

			
		  Node subject = t.getSubject();
		  Node object =t.getObject();
		  Node predicate =  t.getPredicate();
		  
		   String ID = getTripleQueryID(t);
		  
			 if ((subject.isConcrete()) &&(predicate.hasURI("http://www.w3.org/1999/02/22-rdf-syntax-ns#type"))&&(object.hasURI("http://www.w3.org/2002/07/owl#Class")))	 
		  { answer1 =""; // anything on rdf:type owl:Class checking, it is assumed to be true.
				 iter.remove();} 
			 
			 else if ((subject.isVariable()) &&(predicate.hasURI("http://www.w3.org/1999/02/22-rdf-syntax-ns#type"))&&(object.hasURI("http://www.w3.org/2002/07/owl#Class")))	 
			  { answer1 =""; // anything on rdf:type owl:Class checking, to be checked further if it involves a variable binding, i.e., allConcepts
					 iter.remove();} 
			 
			 else if (subject.isConcrete()&& predicate.hasURI("http://www.w3.org/2002/07/owl#disJointWith")&&object.isConcrete())
			 { 
				 answer1 ="<AreClasesDisjoint id ="+ ID + ">"+ OWL("owl:Class", subject.toString())+ OWL("owl:Class", object.toString())+ "</AreClassesDisjoint>";	 	 
				 iter.remove();}
			 
			 else if (subject.isConcrete()&& predicate.hasURI("http://www.w3.org/2002/07/owl#disJointWith")&&object.isVariable())
			 {
				  
				 iter.remove();
				 answer1=RecursiveConceptProcessing(t, pattern, 6);
			 }
			 
			 else if (subject.isVariable()&& predicate.hasURI("http://www.w3.org/2002/07/owl#disJointWith")&&object.isConcrete())
			 {
			 
				 iter.remove();
				 answer1=RecursiveConceptProcessing(t, pattern,  7);
			 }
			 else if (subject.isVariable()&& predicate.hasURI("http://www.w3.org/2002/07/owl#disJointWith")&&object.isVariable())
			 {
				 //answer1 ="<disjoint id ="+ ID"> ...</disjoint>";	 
				 iter.remove();
				 answer1=RecursiveConceptProcessing(t, pattern, 8);
			 }
			 
			 else if (subject.isConcrete()&& predicate.hasURI("http://www.w3.org/1999/02/22-rdf-syntax-ns#type")&&object.isConcrete())
			 { answer1 ="<IsInstanceOf id ="+ ID + ">"+ OWL("ox:Individual", subject.toString())+ OWL("owl:Class", object.toString())+ "</IsInstanceOf>";	 
			 iter.remove();}

			 
			 else if ((subject.isVariable())&& predicate.hasURI("http://www.w3.org/1999/02/22-rdf-syntax-ns#type")&&(object.isConcrete()) )
			 { answer1 ="<GetInstances id ="+ ID + ">"+ OWL("owl:Class", object.toString())+ "</GetInstances>";	 
			 iter.remove();}
			 
			 else  if ((subject.isConcrete())&& predicate.hasURI("http://www.w3.org/1999/02/22-rdf-syntax-ns#type")&&(object.isVariable()) )
			 { 
		     //answer1 ="<types id ="+ ID + ">"+ DIG("individual", subject.toString())+ "</types>";	 
				 iter.remove();
				 answer1=RecursiveConceptProcessing(t, pattern, 1);		
			 }
			 else  if ((subject.isConcrete())&& predicate.hasURI("http://www.w3.org/2000/01/rdf-schema#subClassOf")&&(object.isVariable()) )
			 { 
		     //answer1 ="<ancestors id ="+ ID + ">"+ DIG("catom", subject.toString())+ "</ancestors>";	 
				 iter.remove();
				 answer1=RecursiveConceptProcessing(t, pattern, 5);		
			 }
			 
			 else if ((subject.isConcrete())&& predicate.hasURI("http://www.w3.org/2000/01/rdf-schema#subClassOf")&&(object.isConcrete()) )
			 {  iter.remove();	 
			 answer1 ="<IsClassSubsumedBy id ="+ ID + ">"+ OWL("owl:Class", subject.toString())+ OWL("owl:Class", object.toString())+ "</IsClassSubsumedBy>";			   
			 }
			 
			 else if ((subject.isVariable())&& predicate.hasURI("http://www.w3.org/2000/01/rdf-schema#subClassOf")&&(object.isConcrete()) )
			 {  iter.remove();	 
			 answer1=RecursiveConceptProcessing(t, pattern, 2);			   
			 }
//			 else if ((subject.isVariable())&& predicate.hasURI("http://www.w3.org/2000/01/rdf-schema#subClassOf")&&(object.isVariable()) )
//			 {  iter.remove();	 
//			 answer1=RecursiveConceptProcessing(t, pattern, 3);			   
//			 }
			 else if ((subject.isConcrete())&& predicate.hasURI("owl:equivalentClass") )
			 {  iter.remove();
			 answer1 = "<GetEquivalentClasses id="+ ID + ">"+ OWL("owl:Class", subject.toString())+"</GetEquivalentClassses>";			   
			 }
			 else if ((object.isConcrete())&& predicate.hasURI("owl:equivalentClass") )
			 {  iter.remove();
			 answer1 = "<GetEquivalentClasses id="+ ID + ">"+ OWL("catom", object.toString())+"</GetEquivalentClasses>";			   
			 }
			 else if ((subject.isVariable())&& predicate.hasURI("owl:equivalenceClass"))
			 {  iter.remove();	 
			 answer1=RecursiveConceptProcessing(t, pattern, 4);			   
			 };

				 
			     
	//	           System.out.println("answer1="+answer1);
		           
		    	   if (!answer1.equals("")) {Iterator<Triple>  iter2 = pattern.iterator();
		    	   
		    	   iter = iter2;
		           
		    	   };
		    	   
					answer = answer + answer1;	
					
					if (answer.equals("")){unprocessedPatternStatus=false; 		
//					System.out.println("Set unprocessedPatternStatus as false.");
					};
			
					
					

			};
			
			
			  unprocessedPattern = pattern;
			 				
//			  System.out.println("[Query2OWLQuery] this query is: "+ answer);
//		  System.out.println("[Query2OWLQuery] unprocessed basic pattern: "+ pattern);
							
			
	     return answer;
     
			}   
	      
	      
	public static String OWL(String tag, String name)
	
	{
	
	return "<" + tag + " IRI=\"" + removeQuote(name)+	"\"/>";
	}
	
	@SuppressWarnings("null")
	public static org.w3c.dom.Node OWLNode(String tag, String name)
	
	{  
		org.w3c.dom.Node node = null;
		node.setTextContent(OWL(tag, name));
	return node;
	}
	
	
	
  public static String getKBID(String kb)
  {
	  
	  
	  return "\"" + kb + "\"";   
	  
  }
  public static String getTripleQueryID(Triple t)
  
  {
	   String answer ="";
	   Node subject = t.getSubject();
	  Node object =t.getObject();
	  Node predicate =  t.getPredicate();
	  
	  String s =subject.toString() ;
	  String o= object.toString();
	  
	  if (subject.isConcrete()){s  = removeQuote(s);};
	  if (object.isConcrete()){o  = removeQuote(o);};
	  
	  answer =  "\"" + s + " " + predicate.toString() + " "+ o +"\"";

	  return answer; 
  }
  
public static Triple getTripleFromQueryID(String ID)
  
  {
	Logger log = LoggerFactory.getLogger(Query2OWLQuery.class);
	Triple t= null;
	int l = ID.length();
	String s = ID.substring(1,l-1);
	log.info("s="+s);
	t.create(s);
	
	
	return t; 
  }
	

  
  public static String Complement2OWL(BasicPattern pattern, Triple t)
  { String answer=null;
  
	  Iterator<Triple>  iter = pattern.iterator();
	  
	  Node variable = t.getObject();
	  
	  answer = Variable2OWLConcept(variable, pattern);
	   
	return answer;   
  }
  
  public static String Node2OWLConcept(Node node, BasicPattern pattern)
  { String answer ="";
  
  if (node.isConcrete()){answer = OWL("owl:Class",node.toString());
  } else answer=Variable2OWLConcept(node, pattern);
  
  return answer;
	   
  }
  
  public static String Property2OWLProperty(Node node, BasicPattern pattern)
  { String answer ="";
  
  if (node.isConcrete()){answer = OWL("owl:Property",node.toString());
  } else answer=Variable2OWLProperty(node, pattern);
  
  return answer;
	   
  }
  
  public static String Value2OWLValue(Node node, BasicPattern pattern)
  { String answer ="";
  
  if (node.isConcrete()){answer = OWL("owl:Value",node.toString());
  } else answer=Variable2OWLValue(node, pattern);// check whether or not it is correct!!
  
  return answer;
	   
  }
  
  public static String Variable2OWLProperty(Node variable, BasicPattern pattern)
  {
	   String answer="";
	   
	   Boolean status=true;
	     
	   Iterator<Triple>  iter = pattern.iterator();
	   
	   while (iter.hasNext()&& status)
	 	{
	 Triple t = iter.next();

	  Node subject = t.getSubject();
	  Node object =t.getObject();
	  Node predicate =  t.getPredicate();

	  if ((subject==variable)&&(predicate.hasURI("http://www.w3.org/2002/07/owl#inverseOf"))&&(object.isVariable()))	
	  {

	 	 iter.remove();	 
	 	 answer="<owl:Inverse>"+Variable2OWLProperty(object, pattern)+"</owl:Inverse>";
	    status = false;
	  };
	  
	  if ((subject==variable)&&(predicate.hasURI("http://www.w3.org/2002/07/owl#inverseOf"))&&(object.isConcrete()))	
	  {

	 	 iter.remove();	 
	 	 answer="<owl:Inverse>"+OWL("owl:Property", object.toString())+"</owl:Inverse>";
	    status = false;
	  };
	  
	  
	 	}
	   
	   
	   
	   
	   return answer;
	   
  }
  
  public static String Variable2OWLValue(Node node, BasicPattern pattern)
  {
	   String answer="";
	   
	   return answer;
	   
  }
  
  
  public static String Variable2OWLConcept(Node variable, BasicPattern pattern)
  { String answer ="";
    Boolean status=true;
    
 Iterator<Triple>  iter = pattern.iterator();
 
 while (iter.hasNext()&& status)
	{
Triple t = iter.next();

Node subject = t.getSubject();
Node object =t.getObject();
Node predicate =  t.getPredicate();

if ((subject==variable)&&(predicate.hasURI("http://www.w3.org/2002/07/owl#interSectionOf"))&&(object.isVariable()))	
{

	 iter.remove();	 
	 answer=SeqProcessing(pattern, t, "ObjectIntersectionOf");
 

  status = false;
}
else if ((subject==variable)&&(predicate.hasURI("http://www.w3.org/2002/07/owl#unionOf"))&&(object.isVariable()))	
{
//	 System.out.println("removing " + t);
	 iter.remove();	 
	 answer=SeqProcessing(pattern, t, "ObjectUnionOf");
 
// System.out.println("**intersection answer " + answer);
  status = false;
}
else if ((subject==variable)&& (predicate.hasURI("http://www.w3.org/2002/07/owl#complementOf"))&&(object.isVariable()))	
{
//	 System.out.println("removing " + t);
	 iter.remove();
answer=Complement2OWL(pattern, t);
status = false;
}
else if ((subject==variable)&& (predicate.hasURI("http://www.w3.org/2002/07/owl#complementOf"))&&(object.isConcrete()))	
{  
//	  System.out.println("removing " + t);
	 iter.remove();
answer="<ObjectComplementOf>" + OWL("owl:Class", object.toString()) + "</ObjectComplementOf>";
status = false;
} 

else if ((subject==variable)&& (predicate.hasURI("http://www.w3.org/2002/07/owl#Restriction"))&&(object.isVariable()))	
{  
//	  System.out.println("removing " + t);
	 iter.remove();
answer=Restriction2OWL(pattern,t);
status = false;
} ;

	}
	
	if (status) {answer = null;//the case of pure variable or unsupported case
	};


 
// System.out.println("**** answer " + answer);
 
  return answer;
	   
  }
  
  public static String Restriction2OWL(BasicPattern pattern, Triple t)
  {String answer="";
   String propertyanswer ="";
   String valueanswer="";
   String tag="";
   
  Boolean status1=true;
  Boolean status2=true;
  
  Triple t2= null;
  
  
 Iterator<Triple>  iter = pattern.iterator();

	  while (iter.hasNext())
		{
		  
     t2 = iter.next();
 
//	 System.out.println("processing " + t2);

if ((t2.getSubject()==t.getObject())&& t2.getPredicate().hasURI("owl:onProperty")) 	
	{ 
    
//	System.out.println("*pattern " + pattern);
	iter.remove();
	propertyanswer =Property2OWLProperty(t2.getObject(),pattern);
	status1 = false;
	 // 	     System.out.println("*property answer " + propertyanswer);
	};
	
	if ((t2.getSubject()==t.getObject())&& t2.getPredicate().hasURI("owl:allValuesFrom")) 	
	{ 
    
//	System.out.println("*pattern " + pattern);
	iter.remove();
	valueanswer =Value2OWLValue(t2.getObject(),pattern);
	status2 = false;
	tag="all";
	
	};
	
	if ((t2.getSubject()==t.getObject())&& t2.getPredicate().hasURI("owl:someValuesFrom")) 	
	{ 
    
//	System.out.println("*pattern " + pattern);
	iter.remove();
	valueanswer =Value2OWLValue(t2.getObject(),pattern);
	status2 = false;
	tag="some";
	};
	
	if ((t2.getSubject()==t.getObject())&& t2.getPredicate().hasURI("owl:hasValue")) 	
	{ 
    
//	System.out.println("*pattern " + pattern);
	iter.remove();
	valueanswer =Value2OWLValue(t2.getObject(),pattern);
	status2 = false;
	tag="has"; //unsupported in DIG
	};
	
	
	
		};
  
 if (status1&&status2) {answer = "<" + tag + ">" + propertyanswer + valueanswer +"</" + tag + ">";}
 else {answer = "<error id= \"unsupport syntax\"/>";};
		
  return answer;	   
	   
  }
  
  
  
  public static  String SeqProcessing (BasicPattern pattern, Triple t, String tag)
  { 
	 String answer="";
    String firstanswer ="";
    String restanswer ="";
    boolean status1 =true;
    boolean status2 =true;
    
    Triple t2= null;
  
  
	  Iterator<Triple>  iter = pattern.iterator();
   
	  while (iter.hasNext()&& (status1||status2))
		{
		  
    t2 = iter.next();
    
//	 System.out.println("processing " + t2);
   
   if ((t2.getSubject()==t.getObject())&& t2.getPredicate().hasURI("http://www.w3.org/1999/02/22-rdf-syntax-ns#first")) 	
   	{ 
       
//  	System.out.println("*pattern " + pattern);
   	iter.remove();
   	firstanswer =Node2OWLConcept(t2.getObject(),pattern);
   	status1 = false;
   	 // 	     System.out.println("*first answer " + firstanswer);
   	};

   	    
	    	
	    if ((t2.getSubject()==t.getObject())&& t2.getPredicate().hasURI("http://www.w3.org/1999/02/22-rdf-syntax-ns#rest"))
	    {
//	  	     System.out.println("**pattern " + pattern);
	    	iter.remove();
	    	restanswer =Node2OWLConcept(t2.getObject(),pattern);
	    	 //	     System.out.println("*rest answer " + restanswer);
	    	status2 = false;
	    	};

	    
			};
			
		
if (!status1&& !status2){ answer = "<" + tag +">"+ firstanswer + " "+ restanswer + "</" + tag + ">";}
else { answer = "<error id= \"unsupport syntax\"/>";}

		    
		 
  return answer;
  
  
  }
  
  public static String RecursiveConceptProcessing(Triple t, BasicPattern pattern,  int type)
  {
	   //type=1: instance, type=2: subsumes, type=6: disjoint(c,v), type=7: disjoint(v,c), type=8: disjoint(v,v)
		 String answer ="";
		 
		 String kb = getKBID(thisKB);
		 
		 Node subject = t.getSubject();
		 Node object =t.getObject();
		 Node predicate =  t.getPredicate();
		 
		 String ID = getTripleQueryID(t);
		 
		 String answer2=null;
		 String answer1=null;
		 
//		 System.out.println("Answer2="+answer2);
		 
		  Iterator<Triple>  iter = pattern.iterator();//renew iterator pointer on the pattern
		
		  switch(type)
		  {case 1: answer2=Variable2OWLConcept(object, pattern);
			  if (answer2==null){
		     answer ="<GetTypes id ="+ ID + ">"+ OWL("Individual", subject.toString())+ "</GetTypes>";	 }
		     else {answer ="<IsInstanceOf is ="+ ID + ">"+ OWL("Individual", subject.toString())+answer2 + "</IsInstanceOf>";	};
		     break;
		  case 2: answer2=Variable2OWLConcept(subject, pattern);
			  if (answer2==null)
		  { answer = "<getDescendants id ="+ ID + ">"+ OWL("owl:Class", object.toString())+ "</getDescendants>";	 
			  } else {answer = "<getAncestors id ="+ ID + ">"+ answer2+ "</getAncestors>";};
		     break;
		     
		  case 5:answer2=Variable2OWLConcept(object, pattern);
			     if (answer2==null){
			     answer ="<getAncestors id ="+ ID + ">"+ OWL("owl:Class", subject.toString())+ "</getAncestors>";	 }
			     else {answer ="<IsSuperClassOf id ="+ ID + ">"+ answer2 + OWL("owl:Class", subject.toString()) + "</IsSuperClassOf>";	};
			     break; 
			     
		  case 6: answer2=Variable2OWLConcept(object, pattern);
			     if (answer2==null){
			     answer ="<error id ="+ ID + " unsupported disjoint query"+ "</error>";	 }
			     else {answer ="<IsDisjointClass id ="+ ID + ">"+ answer2 + OWL("owl:Class", subject.toString()) + "</IsDisjointClass>";	};
			     break; 
			     
		  case 7: answer1=Variable2OWLConcept(subject, pattern);
			     if (answer1==null){
			     answer ="<error id ="+ ID + " unsupported disjoint query"+ "</error>";	 }
			     else {answer ="<IsDisjointClass id ="+ ID + ">"+ answer1 + OWL("owl:Class", object.toString()) + "</IsDisjointClass>";	};
			     break; 
			     
		  case 8: answer1=Variable2OWLConcept(subject, pattern);
		          answer2=Variable2OWLConcept(object, pattern);
		     if (answer1==null||answer2==null){
		     answer ="<error id ="+ ID + "unsupported disjoint query"+ "</error>";	 }
		     else {answer ="<IsDisjointClass id ="+ ID + ">"+ answer1 + answer2 + "</IsDisjointClass>";	};
		     break; 
			     
		default: answer=null;		
		  } // end switch
		  
//			 System.out.println("[Query2DIG.RecursiveProcessing] Answer="+answer);
		  
		  
		  
return answer;
	 }


  public static String removeQuote(String s)
  {
	   String answer = s;
	   int l = s.length();
	   if (s.substring(0,1).equals("\"")||s.substring(0,1).equals("'")) {answer = s.substring(1,l-1);};
	   return answer;
  }
  
  
  
} 
 
	
	
