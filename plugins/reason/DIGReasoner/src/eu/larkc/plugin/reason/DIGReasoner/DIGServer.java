

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
package eu.larkc.plugin.reason.DIGReasoner;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

//import org.apache.xml.serialize.OutputFormat;
//import org.apache.xml.serialize.XMLSerializer;


/**
 * This class implements a DIG Server that communicates with a DIG reasoner
 * 
 * */
public class DIGServer{
	
	public String hostname = "localhost";
	public int port = 8080; // default port for Racer
	public String path ="/";
	public String kb ="";
	
	//private XMLSerializer xmlSerializer;
	private DocumentBuilderFactory docBuilderFactory;
	//private OutputFormat serializationFormat;
	
	public DIGServer() {
		this.docBuilderFactory = DocumentBuilderFactory.newInstance();
		this.docBuilderFactory.setIgnoringElementContentWhitespace(true);
		//this.serializationFormat = new OutputFormat();
		//this.xmlSerializer = new XMLSerializer(this.serializationFormat);    
	}
		
	public void setHostname(String hostname){	
		this.hostname = hostname;	
	}
	
	public void setPort(int port){	
		this.port = port;	
	}
	
	public void setPath(String path){	
		this.path = path;	
	}
	
	public void setDIGServerURI(String hostname, int port, String path ){
		setHostname(hostname);
		setPort(port);
		setPath(path);		
	}
	
	public String post(String xmldata){
		String postResult = "";
		try{			
	    /* Build a Document representation of the XML document represented by the String xmldata */
			DocumentBuilder db = this.docBuilderFactory.newDocumentBuilder();
			StringReader sr = new StringReader(xmldata);
			InputSource is = new InputSource(sr);
			/* dataDocument contains the data we want to send to the DIG reasoner */
			Document dataDocument = db.parse(is);		
			//System.out.println("[DIGServer.post()] "+xmldata);
			//System.out.println("[DIGServer] DocumentElement = "+dataDocument.getDocumentElement().getNodeName());
			Document doc = performRequest(this.hostname, this.port, this.path, dataDocument);
			//System.out.println("[DIGServer] (after performRequest) DocumentElement = "+doc.getDocumentElement().getNodeName());
			/* Serialize the DOM document to a String */
			/*
			StringWriter sw = new StringWriter();
			this.serializationFormat.setIndent(3);
			this.serializationFormat.setIndenting(true);
			this.serializationFormat.setPreserveSpace(false);
			this.xmlSerializer.setOutputCharStream(sw);
			this.xmlSerializer.serialize(doc);
			*/
			
			/* Using Sun's default implementation of JAXP API */
			StringWriter sw = new StringWriter();			
			TransformerFactory xformFactory = TransformerFactory.newInstance();
			Transformer domTransformer = xformFactory.newTransformer();
			domTransformer.setOutputProperty(OutputKeys.INDENT,"yes");
			Source input = new DOMSource(doc);
			//System.out.println("[DIGServer.post()] DocumentElement = "+doc.getDocumentElement().getNodeName());
      Result output = new StreamResult(sw);
      domTransformer.transform(input, output);
			
			postResult = sw.toString();
		}catch (IOException ioe){ioe.printStackTrace();}
		 catch (ParserConfigurationException pce){pce.printStackTrace();}
		 catch (SAXException saxEx){saxEx.printStackTrace();}
		 catch (TransformerConfigurationException e){e.printStackTrace();}
		 catch (TransformerException e){e.printStackTrace();}
		return postResult;
	}
	

	
	public Document performRequest(String hostname, int port, String path, Document request){		
	  URL reasonerURL = null;
		try {			
			reasonerURL = new URL("http", this.hostname, this.port, this.path);			
			
			/*
			StringWriter writer = new StringWriter();
			this.serializationFormat.setIndent(3);
			this.serializationFormat.setIndenting(true);
			this.serializationFormat.setPreserveSpace(false);      
			this.xmlSerializer.setOutputCharStream(writer);
			this.xmlSerializer.serialize(request);
	    */
			
			/* Using Sun's default implementation of JAXP API */
			StringWriter sw = new StringWriter();
			TransformerFactory xformFactory = TransformerFactory.newInstance();
			Transformer domTransformer = xformFactory.newTransformer();
			domTransformer.setOutputProperty(OutputKeys.INDENT,"yes");
			Source input = new DOMSource(request);
      Result output = new StreamResult(sw);
      domTransformer.transform(input, output);			
	    
	    HttpURLConnection conn = (HttpURLConnection) reasonerURL.openConnection();
	    conn.setRequestProperty("Content-Type", "text/xml");
	    conn.setRequestMethod("POST");
	    conn.setDoInput(true);
	    conn.setDoOutput(true);
			StringBuffer buffer = sw.getBuffer();
			conn.setRequestProperty("Content-Length", "" + buffer.length());
			conn.connect();    	
	    	
	    OutputStream os = conn.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			osw.write(buffer.toString());
			osw.flush();
			osw.close();
	      
			/* Get the response and transform it into a DOM document */
			DocumentBuilder db = this.docBuilderFactory.newDocumentBuilder();
			Reader reader = new InputStreamReader(conn.getInputStream());
			InputSource inputSource = new InputSource(reader);
			Document doc = db.parse(inputSource);
			reader.close();
			conn.disconnect();      
			return doc;
	    	
		}catch (MalformedURLException e){e.printStackTrace();}
		 catch (IOException ioe){ioe.printStackTrace();}
		 catch (SAXException saxEx){saxEx.printStackTrace();}
		 catch (ParserConfigurationException pce){pce.printStackTrace();}
		 catch (TransformerConfigurationException e){e.printStackTrace();}
		 catch (TransformerException e){e.printStackTrace();}			 		
		return null;
	}


	public String allConcept(){ 
		String data = DIGConstants.ALLCONCEPTS;
		String answer = post(data);
	  return answer;
	}
	
	public String newKB(){ 
		String data = DIGConstants.NEWKB;
		String answer = post(data);
		return answer;
	}
	
	public String getServerString(){
		return "http://" + this.hostname +":"+  this.port + this.path;
	}	
	
	
  

}
	
	
		


