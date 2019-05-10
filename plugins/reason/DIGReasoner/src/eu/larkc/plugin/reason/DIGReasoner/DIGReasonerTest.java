//package eu.larkc.plugin.reason.dig;
package eu.larkc.plugin.reason.DIGReasoner;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.DataFactory;
import eu.larkc.core.data.RdfGraph;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.data.VariableBinding.Binding;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;




public class DIGReasonerTest {
	

	
	public static void main(String[] args) {
		
		String hostname= "localhost";
		int port = 8080;
		String path = "/";
	
//		String localDataDirectory="D:/svn-base/LarKCReasoner/example/data/";

//		String localDataDirectory="F:/svn-space/LarKCReasoner/example/data/";
//		String localDataDirectory="E:/eclipse/workspace/plugins/src/eu/larkc/plugin/reason/dig/data/";
//		String dataFileName = "opjk.rdfs.owl.xml";
//		String dataFileName = "wine.rdf";


//		String ontologyFileName = "http://www.cs.vu.nl/~huang/larkc/opjk.rdfs.owl.xml";	
//		String ontologyFileName= "http://www.cs.vu.nl/~huang/larkc/ontology/wine.rdf";
		String ontologyFileName = "http://www.cs.vu.nl/~huang/larkc/ontology/wine.rdf";	
//	    String ontologyFileName = "file:////"+ localDataDirectory + dataFileName;

			
		
		
	// to ask whether or not wine is a portable liquid	
		String query32 ="PREFIX rdf:      <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"+ 
		"PREFIX rdfs:     <http://www.w3.org/2000/01/rdf-schema#>\n"+ 
		"PREFIX wine:       <http://www.w3.org/TR/2003/PR-owl-guide-20031209/wine#>\n" +
		"PREFIX food:       <http://www.w3.org/TR/2003/PR-owl-guide-20031209/food#>\n" +
		"PREFIX owl:      <http://www.w3.org/2002/07/owl#>\n" +  
		"PREFIX sparqldl: <http://pellet.owldl.com/ns/sdle#>\n"+
		"ASK\n"+
		"WHERE {"+
            "wine:Wine rdfs:subClassOf food:PotableLiquid."+
		        "}";//+
	
		// to ask whether or not Bordeaux is a sweet wine and a table wine
		String query33 ="PREFIX rdf:      <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"+ 
		"PREFIX rdfs:     <http://www.w3.org/2000/01/rdf-schema#>\n"+ 
		"PREFIX wine:       <http://www.w3.org/TR/2003/PR-owl-guide-20031209/wine#>\n" +
		"PREFIX food:       <http://www.w3.org/TR/2003/PR-owl-guide-20031209/food#>\n" +
		"PREFIX owl:      <http://www.w3.org/2002/07/owl#>\n" +  
		"PREFIX sparqldl: <http://pellet.owldl.com/ns/sdle#>\n"+
		"ASK\n"+
		"WHERE {\n"+
	    "wine:Bordeaux rdfs:subClassOf _:x.\n" + 
        "_:x owl:interSectionOf _:y1.\n" +
        "_:y1 rdf:first wine:SweetWine.\n"+
        "_:y1 rdf:rest  wine:TableWine.\n" +
        "wine:Bordeaux rdf:type owl:Class.\n"+
		        "}";//+
		
		//to list all subclass of wine
		String query34 ="PREFIX rdf:      <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"+ 
		"PREFIX rdfs:     <http://www.w3.org/2000/01/rdf-schema#>\n"+ 
		"PREFIX wine:       <http://www.w3.org/TR/2003/PR-owl-guide-20031209/wine#>\n" +
		"PREFIX food:       <http://www.w3.org/TR/2003/PR-owl-guide-20031209/food#>\n" +
		"PREFIX owl:      <http://www.w3.org/2002/07/owl#>\n" +  
		"PREFIX sparqldl: <http://pellet.owldl.com/ns/sdle#>\n"+
		"SELECT ?X \n"+
		"WHERE {"+
	       "?X rdfs:subClassOf wine:Wine.\n"+
		        "}";//+
		
		// to list all superclass of Bordeaux
		String query34b ="PREFIX rdf:      <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"+ 
		"PREFIX rdfs:     <http://www.w3.org/2000/01/rdf-schema#>\n"+ 
		"PREFIX wine:       <http://www.w3.org/TR/2003/PR-owl-guide-20031209/wine#>\n" +
		"PREFIX food:       <http://www.w3.org/TR/2003/PR-owl-guide-20031209/food#>\n" +
		"PREFIX owl:      <http://www.w3.org/2002/07/owl#>\n" +  
		"PREFIX sparqldl: <http://pellet.owldl.com/ns/sdle#>\n"+
		"SELECT ?X \n"+
		"WHERE {"+
	       "wine:Bordeaux rdfs:subClassOf ?X.\n"+
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
		        "}";//+
		
		// to list all superclass pairs of Bordeaux
		String query36b ="PREFIX rdf:      <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"+ 
		"PREFIX rdfs:     <http://www.w3.org/2000/01/rdf-schema#>\n"+ 
		"PREFIX wine:       <http://www.w3.org/TR/2003/PR-owl-guide-20031209/wine#>\n" +
		"PREFIX food:       <http://www.w3.org/TR/2003/PR-owl-guide-20031209/food#>\n" +
		"PREFIX owl:      <http://www.w3.org/2002/07/owl#>\n" +  
		"PREFIX sparqldl: <http://pellet.owldl.com/ns/sdle#>\n"+
		"SELECT ?X ?Y \n"+
		"WHERE {"+
	       "wine:Bordeaux rdfs:subClassOf ?X.\n"+
	       "?X rdfs:subClassOf wine:Wine.\n"+
	       "?Y rdfs:subClassOf ?X.\n"+
	       "?Y rdf:type owl:Class.\n"+
		        "}";//+
		
		//to list all subclass of wine
		String query36c ="PREFIX rdf:      <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"+ 
		"PREFIX rdfs:     <http://www.w3.org/2000/01/rdf-schema#>\n"+ 
		"PREFIX wine:       <http://www.w3.org/TR/2003/PR-owl-guide-20031209/wine#>\n" +
		"PREFIX food:       <http://www.w3.org/TR/2003/PR-owl-guide-20031209/food#>\n" +
		"PREFIX owl:      <http://www.w3.org/2002/07/owl#>\n" +  
		"PREFIX sparqldl: <http://pellet.owldl.com/ns/sdle#>\n"+
		"SELECT ?X  ?Y\n"+
		"WHERE {"+
	       "?X rdfs:subClassOf wine:Wine.\n"+
	       "?Y rdfs:subClassOf wine:TableWine.\n"+
		        "}";//+

		
		String query37 ="PREFIX rdf:      <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"+ 
		"PREFIX rdfs:     <http://www.w3.org/2000/01/rdf-schema#>\n"+ 
		"PREFIX wine:       <http://www.w3.org/TR/2003/PR-owl-guide-20031209/wine#>\n" +
		"PREFIX food:       <http://www.w3.org/TR/2003/PR-owl-guide-20031209/food#>\n" +
		"PREFIX owl:      <http://www.w3.org/2002/07/owl#>\n" +  
		"PREFIX sparqldl: <http://pellet.owldl.com/ns/sdle#>\n"+
		"SELECT ?X ?Y ?Z\n"+
		"WHERE {"+
	       "wine:Bordeaux rdfs:subClassOf ?X.\n"+
	       "?X rdfs:subClassOf ?Y.\n"+
	       "?Y rdfs:subClassOf wine:Wine.\n"+
	       "?Z rdfs:subClassOf ?Y.\n"+
		        "}";//+
		
		
	
		
	    
		ReasonerTest(ontologyFileName, query33, hostname, port, path);
      	
		ReasonerTest(ontologyFileName, query34, hostname, port, path);
		
		
		ReasonerTest(ontologyFileName, query36, hostname, port, path);
		
//		ReasonerTest(ontologyFileName, query36b, hostname, port, path);
		
//		ReasonerTest(ontologyFileName, query36c, hostname, port, path);
		
    	ReasonerTest(ontologyFileName, query37, hostname, port, path);
		
//     String ontologyFileName5 ="http://wasp.cs.vu.nl/larkc/ontology/university0-0.owl";
		
		
		String query35 = "PREFIX rdf:      <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"
			+ "PREFIX rdfs:     <http://www.w3.org/2000/01/rdf-schema#>\n"
			+ "PREFIX ub:       <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>\n"
			+ "PREFIX owl:      <http://www.w3.org/2002/07/owl#>\n"
			+ "PREFIX sparqldl: <http://pellet.owldl.com/ns/sdle#>\n"
			+ "SELECT ?X " + "WHERE {" + "?X rdf:type ub:FullProfessor .}";// +
		
		
	}
	
	private static void ReasonerTest(String ontologyFileName, String query, String hostname, int port, String path)
	{
		Logger log = LoggerFactory.getLogger(DIGReasonerTest.class);
		URL url=null;
		try {
			url = new URL(ontologyFileName);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	
	
	
	DIGReasoner reasoner = new DIGReasoner();
	reasoner.hostname = hostname;
	reasoner.port = port;
	reasoner.path = path;
	
	RdfGraph graph = DataFactory.INSTANCE.createRemoteRdfGraph(new URIImpl(
			url.toString()));
	
	
//	System.out.println("Graph="+ graph.toString());

	URI uri= graph.getName();	
	
	Contract contract = null;
	Context  ctx = null;
	
	log.info("Starting the test ...\n");
//	System.out.println("Make sure that the external DIG reasoner is running at the host: "+ hostname + " and the port: " +port);
	
	log.info("The query is: " + query);	
	
	SPARQLQuery sparqlQuery = DataFactory.INSTANCE.createSPARQLQuery(query); 
	
	if (sparqlQuery.isAsk()){BooleanInformationSet answer = reasoner.sparqlAsk(sparqlQuery, graph, contract, ctx);	
	
			log.info("the answer is " + answer.getValue());
	} else if (sparqlQuery.isSelect()){
		VariableBinding vb = reasoner.sparqlSelect(sparqlQuery, graph, contract, ctx);
		
//		System.out.println("**the answer is ");
	
 //		Iterator<VariableBinding.Binding> vit = vb.iterator();
//		while (vit.hasNext()){
//			Binding bin = vit.next();
//			System.out.println(bin.getValues().toString());	
//		}
		
		printVariableBindings(vb);

	
};
	
	}
	
	public static void printVariableBindings(VariableBinding bindings) {
		Logger log = LoggerFactory.getLogger(DIGReasonerTest.class);
		int k = 0;
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
