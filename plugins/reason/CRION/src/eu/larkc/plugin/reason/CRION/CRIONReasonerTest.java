package eu.larkc.plugin.reason.CRION;

/**
 * <p/>
 * Test for Contrastive Reasoner
 * </p>
 *
 * @author Jun Fang and ZhiSheng Huang
 * Department of computer Science, Vrije Universiteit Amsterdam, The Netherlands
 * leon.essence@gmail.com, huang@cs.vu.nl
 *
 *
 * @version 1.0
 * @Date: 2010-7-1
 *
 */

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;


import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.DataFactory;
import eu.larkc.core.data.RdfGraph;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;


public class CRIONReasonerTest {
	

	
	public static void main(String[] args) {		

		String localDataDirectory="F:/svn-space/LarKCReasoner/example/data/";

		String dataFileName = "mad_cows.owl";



		String ontologyFileName= "http://www.cs.vu.nl/~huang/larkc/ontology/mad_cows.owl";
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
		"kb:madcow rdfs:subClassOf kb:animal.}";
	
		ReasonerTest(ontologyFileName, query1);
		
       ReasonerTest(ontologyFileName, query2);
		
       ReasonerTest(ontologyFileName, query3);
		
		
		
	}
	

	
	private static void ReasonerTest(String ontologyFileName, String query)
	{
		URL url=null;
		try {
			url = new URL(ontologyFileName);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	
	
	
	CRIONReasoner reasoner = new CRIONReasoner();

//	reasoner.SelectedODPStrategy = ODPEnum.GeneralSemODP;
	
	
	RdfGraph graph = DataFactory.INSTANCE.createRemoteRdfGraph(new URIImpl(
			url.toString()));
	
	
//	System.out.println("Graph="+ graph.toString());

	URI uri= graph.getName();	
	
	Contract contract = null;
	Context  ctx = null;
	
	System.out.println("******************************");
	System.out.println("Starting the test ...\n");
	
	System.out.println("The query is: " + query);	
	
	SPARQLQuery sparqlQuery = DataFactory.INSTANCE.createSPARQLQuery(query); 
	
	if (sparqlQuery.isAsk()){BooleanInformationSet answer = reasoner.sparqlAsk(sparqlQuery, graph, contract, ctx);	
	
			System.out.println("the boolean answer is " + answer.getValue());
			System.out.println("the standard PION answer is " + reasoner.StandardPIONAnswer.toString());
	} else if (sparqlQuery.isSelect()){
		VariableBinding vb = reasoner.sparqlSelect(sparqlQuery, graph, contract, ctx);
		
		printVariableBindings(vb);

	
};
	
	}
	
	public static void printVariableBindings(VariableBinding bindings) {
		int k = 0;
		System.out.println("\nVariable Bindings");
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

		System.out.print("|");
		for (int col = 0; col < numCols; ++col) {
			System.out.print(toString(bindings.getVariables().get(col),
					colWidth[col])
					+ "|");
		}
		System.out.println();

		System.out.print("|");
		for (int col = 0; col < numCols; ++col) {
			System.out.print(line(colWidth[col]) + "|");
		}
		System.out.println();

		Iterator<String[]> it = formatted.iterator();
		while (it.hasNext()) {
			k++;
			String[] row = it.next();
			System.out.print("|");
			for (int col = 0; col < numCols; ++col) {
				System.out.print(toString(row[col], colWidth[col]) + "|");
			}
			System.out.println();
		}
		System.out.println("\n # Bindings: " + k);
		System.out.println();
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



