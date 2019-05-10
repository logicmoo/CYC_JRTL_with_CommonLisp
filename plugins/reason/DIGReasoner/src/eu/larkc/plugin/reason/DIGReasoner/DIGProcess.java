package eu.larkc.plugin.reason.DIGReasoner;

/*
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
 * Gaston Tagni (gtagni@few.vu.nl), Vrije Universiteit Amsterdam 
 * 
 */

//package eu.larkc.plugin.reason.dig;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.hp.hpl.jena.graph.Triple;
import com.hp.hpl.jena.sparql.core.BasicPattern;


public class DIGProcess {
	

	public DIGProcess(){
		
		DIGProcessInit();
		
	};
	
	public void DIGProcessInit(){
	
		
	}
	
	
	
	
	public static  List<DIGAnswer> Document2Answers(Document doc){
		
		Node node = (Node) doc;
		NodeList list = node.getChildNodes();
		Node responseNode = list.item(0);
		NodeList answerList = responseNode.getChildNodes();
		
		List<DIGAnswer> answers = new ArrayList<DIGAnswer>();
				
		int i =0;
		int l = answerList.getLength(); 
		if (l > 0){
			

			while (answerList.item(i).getNodeName().equals("#text")&& i <l){ 
				i++;
			};
			
			DIGAnswer digAnswer = new DIGAnswer();
			
			Node answerNode = answerList.item(i);
			digAnswer.answerType = answerNode.getNodeName();
			
			NamedNodeMap Attributes = answerNode.getAttributes();
			
			String queryID = Attributes.item(0).toString();
			digAnswer.answerID = queryID;
			
			DIGQueryID digQueryID = new DIGQueryID(queryID);
			
			digQueryID.getTripleFromQueryID();
			
			digAnswer.currentVar = digQueryID.currentVar;
			digAnswer.currentLiteral = digQueryID.currentLiteral;
			
			NodeList data = answerNode.getChildNodes();
			digAnswer.answerBody= data;
			
			digAnswer.currentBinding = getValuesFromAnswerBody(data, digAnswer.answerType);
			
			answers.add(digAnswer);
			
		} else {
			DIGAnswer digAnswer = new DIGAnswer();
		
			digAnswer.answerType = "error";
			digAnswer.answerID ="unrecognized query";
		    digAnswer.answerBody = null; 
		    
			
			answers.add(digAnswer);
		}

		return answers;
		
	}
	

	
	/**
	 * This method creates a DOM representation of the String representation of an XML document
	 * */
	public static Document XMLString2Document(String xmlstring){    
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    factory.setValidating(false);
    factory.setNamespaceAware(true);
    factory.setIgnoringElementContentWhitespace(true);

		InputSource inStream = new InputSource();	 
		inStream.setCharacterStream(new StringReader(xmlstring));	    
		Document doc = null;
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			doc = builder.parse(inStream);
		}
		catch (SAXException e) {System.exit(1);}
		catch (ParserConfigurationException e) {
			System.err.println(e);
			System.exit(1);
		}
		catch (IOException e) {
			System.err.println(e);
			System.exit(1);
		}
		return doc;
	} 
	
	
	/**
	 * This method creates a DOM representation of the String representation of an XML file
	 * */	
	public Document XMLFile2Document(String xmlfile) {    
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    factory.setValidating(false);
    factory.setNamespaceAware(true);
    factory.setIgnoringElementContentWhitespace(true);
     
	  Document doc = null;
	  try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			doc = builder.parse(xmlfile);
		}
	  catch (SAXException e) {System.exit(1);} 
		catch (ParserConfigurationException e) {
		  System.err.println(e);
			System.exit(1);
		}
	  catch (IOException e) {
			System.err.println(e);
			System.exit(1);
		}
	  return doc;
	} 


	public static Document Response2Document(String response){		
	 	int i = response.indexOf("<?xml");
    response = response.substring(i);        
    Document document = XMLString2Document(response);
    return document;
	}
	
	public Document AddKB(Document doc, String kb){
		Node node = (Node) doc;
		NodeList list = node.getChildNodes();
		Node rootNode = list.item(0);		
		kb= Query2DIG.removeQuote(kb);		
		((Element) rootNode).setAttribute("uri",kb);
		Document doc2 = (Document) node;
		return doc2;
	}
	
	public String getStringFromDocument(Document doc){
	  try{
			DOMSource domSource = new DOMSource(doc);
			StringWriter writer = new StringWriter();
			StreamResult result = new StreamResult(writer);
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer transformer = tf.newTransformer();
			transformer.transform(domSource, result);
			return writer.toString();
		}
		catch(TransformerException ex){
			ex.printStackTrace();
			return null;
		}
	} 
	
	
	
	public static List<String> getValuesFromAnswerBody(NodeList data, String answerType)
	
	{ 	
		List<String> rs = new ArrayList<String>();

       int l = data.getLength();
		
		if (answerType.equals("conceptSet")){  for(int i=0; i<data.getLength(); i++){			
		String nodevalue = data.item(i).getNodeValue();
		String nodename = data.item(i).getNodeName();
	//	String nodetext = data.item(i).getTextContent();

		NodeList data0 = data.item(i).getChildNodes();

		for (int j=0; j<data0.getLength(); j++){
			String nodevalue0 = data0.item(j).getNodeValue();
			String nodename0 = data0.item(j).getNodeName();
	//		String nodetext0 = data0.item(j).getTextContent();

			if (!nodename0.equals("#text")){
      NamedNodeMap Atts = data0.item(j).getAttributes();
      int k = Atts.getLength();
      if (k>0){
      	String att = Atts.item(0).getNodeValue();
     	rs.add(att);

      }
      }       
		}

	};
} else if (answerType.equals("individualSet")){
	for(int i=0; i<data.getLength(); i++){			
		String nodevalue = data.item(i).getNodeValue();
		String nodename = data.item(i).getNodeName();
	//	String nodetext = data.item(i).getTextContent();
	
			if (!nodename.equals("#text")){
      NamedNodeMap Atts = data.item(i).getAttributes();
      int k = Atts.getLength();
      if (k>0){
      	String att = Atts.item(0).getNodeValue();
     	rs.add(att);
      }}
      
      }       
		
}
		
		
		
		return rs;}
	
	
	public static BasicPattern applyBinding2Pattern(String var, String value, BasicPattern pattern)
	{
		   
	   BasicPattern newpattern=new BasicPattern();
		
		 Iterator<Triple>  iter = pattern.iterator();
        
	 	  while (iter.hasNext())
			{
	 		  
	       Triple t = iter.next();
	   
//		System.out.println("processing "+ t);

			
		com.hp.hpl.jena.graph.Node subject = t.getSubject();
		com.hp.hpl.jena.graph.Node object =t.getObject();
		com.hp.hpl.jena.graph.Node predicate =  t.getPredicate();

		  
//		  System.out.println("subject="+subject+" var="+var);
		  
//		  System.out.println("object="+object+" var="+var);
		  
		  if (subject.toString().equals(var)){subject = com.hp.hpl.jena.graph.Node.createLiteral(value);};
		  if (object.toString().equals(var)){object = com.hp.hpl.jena.graph.Node.createLiteral(value);};
		  
		  Triple newtriple =Triple.create(subject, predicate, object);
		  
          newpattern.add(newtriple);
		  
			};
			
	BasicPattern newpattern2 = newpattern; 
			    
//	System.out.println("new basic pattern="+newpattern2);
	
	return newpattern2;
	}
	
	public static List<List<String>>  addValues2BindingSet(List<List<String>> rs, List<String> values, String currentLiteral,int i)
	{
//		System.out.println("Going to add values: "+ values +"with the literal " + currentLiteral + " on the following result set:");
//		PrintResultSet(rs);
		
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

		 		    		    
//		 		    		    if (member(currentLiteral, solution, i)){
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
		 	   
		 	   
//	     System.out.println("new result set: ");
//	     PrintResultSet(newrs);
	     
		return newrs;} 
		 	    		

	
	private static boolean member(String s, List<String> list, int i)
	{ 
	  boolean answer = false;
	  int counter = 0;
	  
	   Iterator<String>  iter0 = list.iterator();	
	   
	   while(iter0.hasNext()&& counter < i && !answer)
	   {
		   if (iter0.next().equals(s)) {answer= true;};
		   
		   counter++;
	   };
	
	return answer;
		
	}
	
	public  static void PrintResultSet(List<List<String>> rs)
	{
		int size = rs.size();
		
//		System.out.println("============= Begin of ResultSet with the size= " + size + " =========");
		
		Iterator<List<String>>  iter = rs.iterator();
		
		while (iter.hasNext())
		{
			System.out.println(iter.next());
		};
		
//		System.out.println("============== End of the ResultSet =============== ");
	}
	
}
	


