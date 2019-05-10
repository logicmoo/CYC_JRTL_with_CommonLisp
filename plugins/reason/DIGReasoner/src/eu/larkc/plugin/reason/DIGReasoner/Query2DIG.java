
/*
*
* Copyright (c) 2009 License_Type (if there is a Copyright, please enter it here)
* 
* Licensed under the XXX License, Version X.X (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
* 
* http://www.copyofthelicense.org/licenses/LICENSE-X.X
* 
* If there is additional text which is related to licensing issues,
* please enter it here. You can Copy and Paste the author and licensing issues
* from the SourceCode file.
* 
* Information about authors: 
* 
* Zhisheng Huang (huang@few.vu.nl), Vrije Universiteit Amsterdam
* 
*/

//package eu.larkc.plugin.reason.dig;
package eu.larkc.plugin.reason.DIGReasoner;

import java.util.Iterator;
import java.util.List;

import com.hp.hpl.jena.graph.Node;
import com.hp.hpl.jena.graph.Triple;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.sparql.core.BasicPattern;
import com.hp.hpl.jena.sparql.syntax.Element;
import com.hp.hpl.jena.sparql.syntax.ElementGroup;
import com.hp.hpl.jena.sparql.syntax.ElementTriplesBlock;



public class Query2DIG {
	
	public static BasicPattern unprocessedPattern = new BasicPattern();
	public static boolean unprocessedPatternStatus = true;
		
	
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
	

	
	public static String BasicPattern2DIG(BasicPattern pattern)
	{
//		System.out.println("[Query2DIG] processing basic pattern: "+ pattern);
		
		 String answer="";

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
//		  Triple tt = getTripleFromQueryID(ID);
		  
//		  System.out.println("the triple from ID = " +tt );
		  
			 if ((subject.isConcrete()) &&(predicate.hasURI("http://www.w3.org/1999/02/22-rdf-syntax-ns#type"))&&(object.hasURI("http://www.w3.org/2002/07/owl#Class")))	 
		  { answer1 =""; // anything on rdf:type owl:Class checking, it is assumed to be true.
				 iter.remove();} 
			 
			 else if ((subject.isVariable()) &&(predicate.hasURI("http://www.w3.org/1999/02/22-rdf-syntax-ns#type"))&&(object.hasURI("http://www.w3.org/2002/07/owl#Class")))	 
			  { answer1 =""; // anything on rdf:type owl:Class checking, to be checked further if it involves a variable binding, i.e., allConcepts
					 iter.remove();} 
			 
			 else if (subject.isConcrete()&& predicate.hasURI("http://www.w3.org/2002/07/owl#disJointWith")&&object.isConcrete())
			 { answer1 ="<disjoint id ="+ ID + ">"+ DIG("catom", subject.toString())+ DIG("catom", object.toString())+ "</disjoint>";	 
			 iter.remove();}
			 
			 else if (subject.isConcrete()&& predicate.hasURI("http://www.w3.org/2002/07/owl#disJointWith")&&object.isVariable())
			 {
				 //answer1 ="<disjoint id ="+ ID"> ...</disjoint>";	 
				 iter.remove();
				 answer1=RecursiveConceptProcessing(t, pattern, 6);
			 }
			 
			 else if (subject.isVariable()&& predicate.hasURI("http://www.w3.org/2002/07/owl#disJointWith")&&object.isConcrete())
			 {
				 //answer1 ="<disjoint id ="+ ID"> ...</disjoint>";	 
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
			 { answer1 ="<instance id ="+ ID + ">"+ DIG("individual", subject.toString())+ DIG("catom", object.toString())+ "</instance>";	 
			 iter.remove();}

			 
			 else if ((subject.isVariable())&& predicate.hasURI("http://www.w3.org/1999/02/22-rdf-syntax-ns#type")&&(object.isConcrete()) )
			 { answer1 ="<instances id ="+ ID + ">"+ DIG("catom", object.toString())+ "</instances>";	 
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
			 answer1 ="<subsumes id ="+ ID + ">"+ DIG("catom", object.toString())+ DIG("catom", subject.toString())+ "</subsumes>";			   
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
			 answer1 = "<equivalence id="+ ID + ">"+ DIG("catom", subject.toString())+"</></equivalence>";			   
			 }
			 else if ((object.isConcrete())&& predicate.hasURI("owl:equivalentClass") )
			 {  iter.remove();
			 answer1 = "<equivalence id="+ ID + ">"+ DIG("catom", object.toString())+"</></equivalence>";			   
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
			 				
//			  System.out.println("[Query2DIG] this query is: "+ answer);
//			  System.out.println("[Query2DIG] unprocessed basic pattern: "+ pattern);
							
			
	     return answer;
     
			}   
	      

	


	      
	public static String DIG(String tag, String name)
	
	{
	
	return "<" + tag + " name=\"" + removeQuote(name)+	"\"/>";
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
	Triple t= null;
	int l = ID.length();
	String s = ID.substring(1,l-1);
	//System.out.println("s="+s);
	t.create(s);
	
	
	return t; 
  }
	

  
  public static String Complement2DIG(BasicPattern pattern, Triple t)
  { String answer=null;
  
	  Iterator<Triple>  iter = pattern.iterator();
	  
	  Node variable = t.getObject();
	  
	  answer = Variable2DIGConcept(variable, pattern);
	   
	return answer;   
  }
  
  public static String Node2DIGConcept(Node node, BasicPattern pattern)
  { String answer ="";
  
  if (node.isConcrete()){answer = DIG("catom",node.toString());
  } else answer=Variable2DIGConcept(node, pattern);
  
  return answer;
	   
  }
  
  public static String Property2DIGProperty(Node node, BasicPattern pattern)
  { String answer ="";
  
  if (node.isConcrete()){answer = DIG("ratom",node.toString());
  } else answer=Variable2DIGProperty(node, pattern);
  
  return answer;
	   
  }
  
  public static String Value2DIGValue(Node node, BasicPattern pattern)
  { String answer ="";
  
  if (node.isConcrete()){answer = DIG("defined",node.toString());
  } else answer=Variable2DIGValue(node, pattern);// check whether or not it is correct!!
  
  return answer;
	   
  }
  
  public static String Variable2DIGProperty(Node variable, BasicPattern pattern)
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
	 	 answer="<inverse>"+Variable2DIGProperty(object, pattern)+"</inverse>";
	    status = false;
	  };
	  
	  if ((subject==variable)&&(predicate.hasURI("http://www.w3.org/2002/07/owl#inverseOf"))&&(object.isConcrete()))	
	  {

	 	 iter.remove();	 
	 	 answer="<inverse>"+DIG("ratom", object.toString())+"</inverse>";
	    status = false;
	  };
	  
	  
	 	}
	   
	   
	   
	   
	   return answer;
	   
  }
  
  public static String Variable2DIGValue(Node node, BasicPattern pattern)
  {
	   String answer="";
	   
	   return answer;
	   
  }
  
  
  public static String Variable2DIGConcept(Node variable, BasicPattern pattern)
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
	 answer=SeqProcessing(pattern, t, "and");
 

  status = false;
}
else if ((subject==variable)&&(predicate.hasURI("http://www.w3.org/2002/07/owl#unionOf"))&&(object.isVariable()))	
{
//	 System.out.println("removing " + t);
	 iter.remove();	 
	 answer=SeqProcessing(pattern, t, "or");
 
// System.out.println("**intersection answer " + answer);
  status = false;
}
else if ((subject==variable)&& (predicate.hasURI("http://www.w3.org/2002/07/owl#complementOf"))&&(object.isVariable()))	
{
//	 System.out.println("removing " + t);
	 iter.remove();
answer=Complement2DIG(pattern, t);
status = false;
}
else if ((subject==variable)&& (predicate.hasURI("http://www.w3.org/2002/07/owl#complementOf"))&&(object.isConcrete()))	
{  
//	  System.out.println("removing " + t);
	 iter.remove();
answer="<not>" + DIG("catom", object.toString()) + "</not>";
status = false;
} 

else if ((subject==variable)&& (predicate.hasURI("http://www.w3.org/2002/07/owl#Restriction"))&&(object.isVariable()))	
{  
//	  System.out.println("removing " + t);
	 iter.remove();
answer=Restriction2DIG(pattern,t);
status = false;
} ;

	}
	
	if (status) {answer = null;//the case of pure variable or unsupported case
	};


 
// System.out.println("**** answer " + answer);
 
  return answer;
	   
  }
  
  public static String Restriction2DIG(BasicPattern pattern, Triple t)
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
	propertyanswer =Property2DIGProperty(t2.getObject(),pattern);
	status1 = false;
	 // 	     System.out.println("*property answer " + propertyanswer);
	};
	
	if ((t2.getSubject()==t.getObject())&& t2.getPredicate().hasURI("owl:allValuesFrom")) 	
	{ 
    
//	System.out.println("*pattern " + pattern);
	iter.remove();
	valueanswer =Value2DIGValue(t2.getObject(),pattern);
	status2 = false;
	tag="all";
	
	};
	
	if ((t2.getSubject()==t.getObject())&& t2.getPredicate().hasURI("owl:someValuesFrom")) 	
	{ 
    
//	System.out.println("*pattern " + pattern);
	iter.remove();
	valueanswer =Value2DIGValue(t2.getObject(),pattern);
	status2 = false;
	tag="some";
	};
	
	if ((t2.getSubject()==t.getObject())&& t2.getPredicate().hasURI("owl:hasValue")) 	
	{ 
    
//	System.out.println("*pattern " + pattern);
	iter.remove();
	valueanswer =Value2DIGValue(t2.getObject(),pattern);
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
   	firstanswer =Node2DIGConcept(t2.getObject(),pattern);
   	status1 = false;
   	 // 	     System.out.println("*first answer " + firstanswer);
   	};

   	    
	    	
	    if ((t2.getSubject()==t.getObject())&& t2.getPredicate().hasURI("http://www.w3.org/1999/02/22-rdf-syntax-ns#rest"))
	    {
//	  	     System.out.println("**pattern " + pattern);
	    	iter.remove();
	    	restanswer =Node2DIGConcept(t2.getObject(),pattern);
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
		 
		 Node subject = t.getSubject();
		 Node object =t.getObject();
		 Node predicate =  t.getPredicate();
		 
		  String ID = getTripleQueryID(t);
		 
		 String answer2=null;
		 String answer1=null;
		 
//		 System.out.println("Answer2="+answer2);
		 
		  Iterator<Triple>  iter = pattern.iterator();//renew iterator pointer on the pattern
		
		  switch(type)
		  {case 1: answer2=Variable2DIGConcept(object, pattern);
			  if (answer2==null){
		     answer ="<types id ="+ ID + ">"+ DIG("individual", subject.toString())+ "</types>";	 }
		     else {answer ="<instance id ="+ ID + ">"+ DIG("individual", subject.toString())+answer2 + "</instance>";	};
		     break;
		  case 2: answer2=Variable2DIGConcept(subject, pattern);
			  if (answer2==null)
		  { answer = "<descendants id ="+ ID + ">"+ DIG("catom", object.toString())+ "</descendants>";	 
			  } else {answer = "<ancestors id ="+ ID + ">"+ answer2+ "</ancestors>";};
		     break;
		     
		  case 5:answer2=Variable2DIGConcept(object, pattern);
			     if (answer2==null){
			     answer ="<ancestors id ="+ ID + ">"+ DIG("catom", subject.toString())+ "</ancestors>";	 }
			     else {answer ="<subsumes id ="+ ID + ">"+ answer2 + DIG("catom", subject.toString()) + "</subsumes>";	};
			     break; 
			     
		  case 6: answer2=Variable2DIGConcept(object, pattern);
			     if (answer2==null){
			     answer ="<error id ="+ ID + "unsupported disjoint query"+ "</error>";	 }
			     else {answer ="<disjoint id ="+ ID + ">"+ answer2 + DIG("catom", subject.toString()) + "</disjoint>";	};
			     break; 
			     
		  case 7: answer1=Variable2DIGConcept(subject, pattern);
			     if (answer1==null){
			     answer ="<error id ="+ ID + "unsupported disjoint query"+ "</error>";	 }
			     else {answer ="<disjoint id ="+ ID + ">"+ answer1 + DIG("catom", object.toString()) + "</disjoint>";	};
			     break; 
			     
		  case 8: answer1=Variable2DIGConcept(subject, pattern);
		          answer2=Variable2DIGConcept(object, pattern);
		     if (answer1==null||answer2==null){
		     answer ="<error id ="+ ID + "unsupported disjoint query"+ "</error>";	 }
		     else {answer ="<disjoint id ="+ ID + ">"+ answer1 + answer2 + "</disjoint>";	};
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
 
	



