

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

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openrdf.model.URI;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;


public class TellDIG {
	
	private DIGServer digServer;
	//private String DIGFile = "src/main/dig/data/DIGOntologyTranslation.dig";
	
	public TellDIG(DIGServer server){
		this.digServer = server;	
	}
	
	public String TellDIGServer(String hostname, int port, String path, String  url, String kb){
		String answer = null;
		
		if (IsDIGFile(url)){
//			System.out.println("[TellDIG]****Yes, this is a dig file.");
//			URI url = tripleSet.getTripleSet();		
			DIGProcess process = new DIGProcess();		
			Document  doc = process.XMLFile2Document(url.toString());		
			doc = process.AddKB(doc, kb);
			String server = this.digServer.getServerString();			    
			String data = process.getStringFromDocument(doc);	    
			
	    answer = this.digServer.post(data);			
		}		
		else{
			if (IsOWLFile(url) || IsRDFFile(url)){
//				System.out.println("[TellDIG]****Yes, this is an OWL/RDF file.");
				// Translate the OWL document into a DIG document
				// Instead of calling OWL2DIG we assume the tanslation was already made offline and the result is in a DIG file on disk
				//Document doc = readDIGFile(this.DIGFile);
				Document doc = OWL2DIGTranslator.translateOWL(url.toString(),kb);
				if (doc != null){
					DIGProcess process = new DIGProcess();
					doc = process.AddKB(doc, kb);			
					String server = this.digServer.getServerString();				
					String data = process.getStringFromDocument(doc);
					//System.out.println("TELLING "+data);
					answer = this.digServer.post(data);					
				}else{answer = "translation from OWL to DIG failed";}				
			}
			else{
        answer = "unsupported data";
      }
		}
    return answer;
	}
	
	private Document readDIGFile(String fileName){
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			Document doc;
		  DocumentBuilder builder = factory.newDocumentBuilder();
		  doc = builder.parse( new File(fileName) );
		  return doc;
		} 
		catch (SAXParseException spe) {spe.printStackTrace();}
		catch (ParserConfigurationException pce) {pce.printStackTrace();}
		catch (SAXException sxe){sxe.printStackTrace();}
		catch (IOException ioe){ioe.printStackTrace();}
    return null;
	}
	
	public boolean IsDIGFile(String url){
		boolean answer = false;
    if (url.endsWith("dig.xml")||url.endsWith("dig")){answer = true;};
    return answer;	
	}

	
	public boolean IsOWLFile(String url){
		boolean answer = false;		
    if ((url.endsWith("owl.xml")) || (url.toString().endsWith(".owl")) ){answer = true;};    
    return answer;		
	}	

	public boolean IsRDFFile(String url){
		boolean answer = false;		
    if ((url.endsWith("rdf.xml")) || (url.toString().endsWith(".rdf")) ){answer = true;};    
    return answer;		
	}	
	
	}


