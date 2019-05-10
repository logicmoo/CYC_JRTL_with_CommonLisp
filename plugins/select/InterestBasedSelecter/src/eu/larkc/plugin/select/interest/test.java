package eu.larkc.plugin.select.interest;

import java.io.File;
import java.io.PrintStream;

import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.larkc.core.data.*;
import eu.larkc.core.data.VariableBinding.Binding;
import eu.larkc.core.query.RemoteSPARQLEndpoint;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.core.query.SPARQLQueryImpl;
import eu.larkc.plugin.Context;

public class test {

	public static void main(String[] args) {
		Logger log = LoggerFactory.getLogger(test.class);

		DataFactory df = DataFactory.INSTANCE;
		String testRdf = "dblp-lit-1000p.rdf";	
//		String testRdf = "d://dblp//swetodblp_april_2008_part_1.rdf";	
//		String testRdf = "d://dblp-intelligence.rdf";
		String uriName = new File(testRdf).toURI().toString();
		URI graphName = new URIImpl(uriName);
		SetOfStatements theSetOfStatements = df.createRemoteRdfGraph(graphName);
		
		String testQuery="PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> "
			+"PREFIX rdfs:  <http://www.w3.org/2000/01/rdf-schema#> "
			+"SELECT ?title "
			+"WHERE { "
			+"?paper rdfs:label ?title .  "
			+"FILTER regex(?title,'intelligence','i') "
			+"}" ;
//		SPARQLQuery query = new SPARQLQueryImpl(testQuery);
		SPARQLQuery theQuery = df.createSPARQLQuery(testQuery);
	
		
		
		String uiDataUri = "file:///D:/DBLP_test_data/Retained_Interests_sample.rdf";
		String userUri = "http://www.informatik.uni-trier.de/~ley/db/indices/a-tree/h/Harmelen:Frank_van.html";
		String IRP = "<http://www.w3.org/2000/01/rdf-schema#label>";
		
		InterestBasedSelecter ibs = new InterestBasedSelecter(uiDataUri,userUri,IRP);
		Context context = ibs.createContext(); 				
			
		SetOfStatements ss = ibs.select(theSetOfStatements, null, context);
//		try{
//		System.setOut(new PrintStream("testresult.txt"));
//		}catch(Exception e){}
		CloseableIterator<Statement> iter = ss.getStatements();
		int i=0;
		while (iter.hasNext()) {
			Statement s = iter.next();
			log.info(s.toString());
			i++;
		}
		log.info("" + i);
		
		ibs.printUserInterests(context);
			
	}

}
