package eu.larkc.plugin.reason.pion;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.DataFactory;

import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.qos.QoSParameters;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.decide.PIONDecider.PIONDecider;



public class PIONWorkflowTest {
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		String localDataDirectory="D:/svn-base/LarKCReasoner/example/data/";

	//	String localDataDirectory="E:/svn-space/LarKCReasoner/example/data/";	
	//	String dataFileName = "wine.rdf";
	//	String dataFileName = "mad_cows.owl";

//		String ontologyFileName = "http://www.cs.vu.nl/~huang/larkc/opjk.rdfs.owl.xml";	
//		String ontologyFileName= "http://www.cs.vu.nl/~huang/larkc/ontology/wine.rdf";
 		String ontologyFileName= "http://www.cs.vu.nl/~huang/larkc/ontology/mad_cows.owl";
//		String ontologyFileName = "http://www.mindswap.org/2004/owl/mindswappers#";
//	    String ontologyFileName = "file:////"+ localDataDirectory + dataFileName;


		
		String query1 ="PREFIX rdf:      <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"+ 
		"PREFIX rdfs:     <http://www.w3.org/2000/01/rdf-schema#>"+ 
		"PREFIX kb:       <http://cohse.semanticweb.org/ontologies/people#>" + 
		"PREFIX owl:      <http://www.w3.org/2002/07/owl#>" + 
		"PREFIX sparqldl: <http://pellet.owldl.com/ns/sdle#>"+
		"ASK {"+
		"kb:madcow rdfs:subClassOf kb:vegetarian.}";
		
		String query2 ="PREFIX rdf:      <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"+ 
		"PREFIX rdfs:     <http://www.w3.org/2000/01/rdf-schema#>"+ 
		"PREFIX kb:       <http://cohse.semanticweb.org/ontologies/people#>" + 
		"PREFIX owl:      <http://www.w3.org/2002/07/owl#>" + 
		"PREFIX sparqldl: <http://pellet.owldl.com/ns/sdle#>"+
		"ASK {"+
		"kb:cow rdfs:subClassOf kb:vegetarian.}";
		
		String query3 ="PREFIX rdf:      <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"+ 
		"PREFIX rdfs:     <http://www.w3.org/2000/01/rdf-schema#>"+ 
		"PREFIX kb:       <http://cohse.semanticweb.org/ontologies/people#>" + 
		"PREFIX owl:      <http://www.w3.org/2002/07/owl#>" + 
		"PREFIX sparqldl: <http://pellet.owldl.com/ns/sdle#>"+
		"ASK {"+
		"kb:madcow rdfs:subClassOf _:x.\n" + 
        "_:x owl:interSectionOf _:y1.\n" +
        "_:y1 rdf:first kb:cow.\n"+
        "_:y1 rdf:rest  kb:vegetarian.\n" +
        "kb:madcow rdf:type owl:Class.\n"+
		        "}";//+
		
		
		String query4 ="PREFIX rdf:      <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"+ 
		"PREFIX rdfs:     <http://www.w3.org/2000/01/rdf-schema#>"+ 
		"PREFIX kb:       <http://cohse.semanticweb.org/ontologies/people#>" + 
		"PREFIX owl:      <http://www.w3.org/2002/07/owl#>" + 
		"PREFIX sparqldl: <http://pellet.owldl.com/ns/sdle#>"+
		"SELECT ?X \n"+
		"WHERE {"+
		"?X rdfs:subClassOf kb:vegetarian.}";
		
		String query5 ="PREFIX rdf:      <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"+ 
		"PREFIX rdfs:     <http://www.w3.org/2000/01/rdf-schema#>"+ 
		"PREFIX kb:       <http://cohse.semanticweb.org/ontologies/people#>" + 
		"PREFIX owl:      <http://www.w3.org/2002/07/owl#>" + 
		"PREFIX sparqldl: <http://pellet.owldl.com/ns/sdle#>"+
		"SELECT ?X ?Y\n"+
		"WHERE {"+
	       "kb:madcow rdfs:subClassOf ?X.\n"+
	       "?X rdfs:subClassOf kb:animal.\n"+
	       "?X rdfs:subClassOf ?Y.\n"+
	       "?Y rdf:type owl:Class.\n"+
	       "kb:madcow rdf:type owl:Class.\n"+
		        "}";//+
		
		
		// to list all superclass pairs of Bordeaux
		String query36 ="PREFIX rdf:      <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"+ 
		"PREFIX rdfs:     <http://www.w3.org/2000/01/rdf-schema#>\n"+ 
		"PREFIX wine:       <http://www.w3.org/TR/2003/PR-owl-guide-20031209/wine#>\n" +
		"PREFIX food:       <http://www.w3.org/TR/2003/PR-owl-guide-20031209/food#>\n" +
		"PREFIX owl:      <http://www.w3.org/2002/07/owl#>\n" +  
		"PREFIX sparqldl: <http://pellet.owldl.com/ns/sdle#>\n"+
		"SELECT ?X ?Y \n"+
		"WHERE {"+
	       "wine:Bordeaux rdfs:subClassOf ?X.\n"+
	       "?X rdfs:subClassOf wine:Wine.\n"+
	       "?X rdfs:subClassOf ?Y.\n"+
	       "?Y rdf:type owl:Class.\n"+
	       "wine:Bordeaux rdf:type owl:Class.\n"+
		        "}";//+
		

		PIONWorkflowProcess(ontologyFileName,query5);
		


	}
	
	
	private static void PIONWorkflowProcess(String ontologyFileName, String query)
	{
	Logger log = LoggerFactory.getLogger(PIONWorkflowTest.class);

	log.info("\n\n#####Starting the PION Workflow Processing  ...\n");
	
	log.info("The query is: " + query);	
	
	SPARQLQuery theQuery = DataFactory.INSTANCE.createSPARQLQuery(query); 
	
	
	PIONDecider decider = new PIONDecider(ontologyFileName);
	
	QoSParameters theQoSParameters =null;
	
	if (theQuery.isAsk()){
	BooleanInformationSet answer = decider.sparqlAsk(theQuery, theQoSParameters);	
	
    
	log.info("the answer is " + answer.getValue());
	} else if (theQuery.isSelect()){
		VariableBinding vb = decider.sparqlSelect(theQuery,  theQoSParameters);
		
		printVariableBindings(vb);

	
} else {throw new UnsupportedOperationException();};
	
	}
	
	public static void printVariableBindings(VariableBinding bindings) {
		int k = 0;
		Logger log = LoggerFactory.getLogger(PIONWorkflowTest.class);
		log.info("\nVariable Bindings");
		System.out
				.println("==============================================================");

		int numCols = bindings.getVariables().size();
		int[] colWidth = new int[numCols];
		for (int col = 0; col < numCols; ++col) {
			colWidth[col] = bindings.getVariables().get(col).length();
		}

		List<String[]> formatted = new ArrayList<String[]>();
		Iterator<VariableBinding.Binding> bindingIterator = bindings.iterator();
		while (bindingIterator.hasNext()) {
			VariableBinding.Binding binding = bindingIterator.next();

			String[] row = new String[numCols];
			for (int col = 0; col < numCols; ++col) {
				String value = binding.getValues().get(col).toString();
				int len = value.length();
				if (len > colWidth[col]) {
					colWidth[col] = len;
				}
				row[col] = value;
			}
			formatted.add(row);
		}

		log.info("|");
		for (int col = 0; col < numCols; ++col) {
			log.info(toString(bindings.getVariables().get(col),
					colWidth[col])
					+ "|");
		}
		log.info("");

		log.info("|");
		for (int col = 0; col < numCols; ++col) {
			log.info(line(colWidth[col]) + "|");
		}
		log.info("");

		Iterator<String[]> it = formatted.iterator();
		while (it.hasNext()) {
			k++;
			String[] row = it.next();
			log.info("|");
			for (int col = 0; col < numCols; ++col) {
				log.info(toString(row[col], colWidth[col]) + "|");
			}
			log.info("");
		}
		log.info("\n # Bindings: " + k);
		log.info("");
	}
	public static String toString(Object object, int length) {
		StringBuilder buffer = new StringBuilder();
		buffer.append(object.toString());
		while (buffer.length() < length) {
			buffer.append(' ');
		}
		return buffer.toString();
	}

	public static String line(int length) {
		StringBuilder buffer = new StringBuilder();
		while (buffer.length() < length) {
			buffer.append('-');
		}
		return buffer.toString();
	}

	


}
