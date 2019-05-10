package eu.larkc.plugin.reason.pion;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


import org.coode.owlapi.owlxml.renderer.OWLXMLWriter;
import org.openrdf.model.Value;
import org.openrdf.model.impl.LiteralImpl;
import org.openrdf.model.impl.URIImpl;
import org.semanticweb.owl.apibinding.OWLManager;
import org.semanticweb.owl.io.RDFXMLOntologyFormat;
import org.semanticweb.owl.model.OWLClass;
import org.semanticweb.owl.model.OWLDataFactory;
import org.semanticweb.owl.model.OWLDescription;
import org.semanticweb.owl.model.OWLObject;
import org.semanticweb.owl.model.OWLObjectComplementOf;
import org.semanticweb.owl.model.OWLObjectIntersectionOf;
import org.semanticweb.owl.model.OWLObjectUnionOf;
import org.semanticweb.owl.model.OWLOntology;
import org.semanticweb.owl.model.OWLOntologyManager;
import org.semanticweb.owl.model.OWLOntologyStorageException;
import org.semanticweb.owl.model.UnknownOWLOntologyException;
import org.semanticweb.owl.util.SimpleURIMapper;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.DataFactory;
import eu.larkc.core.data.RdfGraph;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.data.VariableBinding.Binding;
import eu.larkc.plugin.reason.DIGReasoner.DIGAnswer;
import eu.larkc.plugin.reason.OWLAPIReasoner.OWLAnswer;
import eu.larkc.plugin.reason.OWLAPIReasoner.OWLProcess;
import eu.larkc.plugin.reason.OWLAPIReasoner.OWLQuery;
import eu.larkc.plugin.reason.OWLAPIReasoner.OWLReasonerFact;
import eu.larkc.plugin.reason.OWLAPIReasoner.OWLAPIReasoner.WrappedIterator;

public class PIONProcess {
	
	private static Set<OWLClass> inconsistentClasses;
	private static Set<OWLClass> allClasses;
	
	public static  Boolean OWLQueryDocment2Ask(Document doc, org.mindswap.pellet.owlapi.Reasoner reasoner, OWLOntology ontology, OWLDataFactory factory){
	
       Boolean answer= false;
		
		allClasses = getAllClasses(reasoner, factory);
		
			Node node = (Node) doc;
			NodeList list = node.getChildNodes();
			Node requestNode = list.item(0);
			NodeList queryList = requestNode.getChildNodes();
			
//			List<OWLAnswer> answers = new ArrayList<OWLAnswer>();
					
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
					
				reasoner.loadOntology(ontology);
				
                OWLAnswer owlAnswer= OWLProcess.Query2Answer(owlQuery, reasoner, factory);				

                
                answer = owlAnswer.booleanAnswer;
	 
	           
			}		
           

			return answer;
			
		}

	
	
	
	
public static Boolean IsComplement(Node node) {
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
//		
		}
		if (IsIntersection(node)){
		NodeList nodes = node.getChildNodes();
		Set<OWLClass>  o2=  getOWLClasses(nodes);
//		System.out.println("[PIONProcess]  o2=" + o2);
		OWLObjectIntersectionOf intersection = factory.getOWLObjectIntersectionOf(o2);
		result = intersection;
		}
		if (IsUnion(node)){
			NodeList nodes = node.getChildNodes();
			Set<OWLClass>  o2=  getOWLClasses(nodes);
		    OWLObjectUnionOf union = factory.getOWLObjectUnionOf(o2);
	    result = union;
		}
		if (IsComplement(node)){
			NodeList nodes = node.getChildNodes();
			OWLDescription  des=  (OWLDescription) getOWLClasses(nodes);
		    OWLObjectComplementOf union = factory.getOWLObjectComplementOf(des);
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
	
	public static Boolean	IsConsistent(org.mindswap.pellet.owlapi.Reasoner reasoner, OWLDataFactory factory, OWLOntology ontology)
	{
	
	Boolean status = false;
	
//	reasoner.clearOntologies();
	
	reasoner.loadOntology(ontology);
	
//    reasoner.classify();
	
	Set<OWLClass> incClasses = getInconsistentClasses(reasoner, factory);
	
    if (incClasses.isEmpty()){status = true;};
	
	return status;
	}
	
	public static Set<OWLClass>	getInconsistentClasses(org.mindswap.pellet.owlapi.Reasoner reasoner, OWLDataFactory factory)
	{
	
	OWLClass nothing = factory.getOWLNothing();
	
	Set<OWLClass> incClasses = reasoner.getEquivalentClasses(nothing);
	
	//System.out.println("the inconsistent class set = "+incClasses);
	
	return incClasses;
	}
	
	
	private static void saveOntologyToFile(OWLOntology ontology, URI uri, OWLOntologyManager manager) throws OWLOntologyStorageException{
 //       OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        /* Set up a mapping, which maps the ontology URI to the physical URI */
       SimpleURIMapper mapper = new SimpleURIMapper(ontology.getURI(), uri);
        manager.addURIMapper(mapper);
        try {
     //     manager.saveOntology(ontology, new RDFXMLOntologyFormat(), uri);
        	 manager.setPhysicalURIForOntology(ontology, uri);
        	 manager.saveOntology(ontology);
        
        } catch (UnknownOWLOntologyException e) {

        }
        manager = null;
    } 
	
public static SetOfStatements getSetOfStatements(OWLOntology ontology, OWLOntologyManager manager) throws MalformedURLException
{
	String tmpOntologyFileName = "file:/E:/tmp/tmpOntology.txt";
//	String tmpOntologyFileName = "./tmpOntology";
	
	URI uri=null;
	try {
		uri = new URI(tmpOntologyFileName);
	} catch (URISyntaxException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		saveOntologyToFile(ontology,uri, manager);
	} catch (OWLOntologyStorageException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//OwlOntologyWriter.write(selectedOntology, out);
	//try to find a way to write the ontology into the tmp file
	


    RdfGraph graph = DataFactory.INSTANCE.createRemoteRdfGraph(new URIImpl(uri.toString()));
	
	SetOfStatements answer = graph;
	
	return answer;
	
}

public static SetOfStatements getSetOfStatements(OWLOntology ontology) {
	
	//to be implemented;
	
	
	return null;
}

public static Set<OWLClass>	getAllClasses(org.mindswap.pellet.owlapi.Reasoner reasoner, OWLDataFactory factory)
{
	Logger log = LoggerFactory.getLogger(PIONProcess.class);

	Set<OWLClass> classes = reasoner.getClasses();
	
	log.info("the owl class set = "+classes);

return classes;
}

public static String removePrefix(String s)
{
	String result = null;
	
	int i = s.indexOf("#");
	if (i>0){result = s.substring(i+1);};
	
	return result;

}






}


