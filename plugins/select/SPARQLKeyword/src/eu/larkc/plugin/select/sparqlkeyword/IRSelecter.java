package eu.larkc.plugin.select.sparqlkeyword;

import java.util.Arrays;
import java.util.Collection;

import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.larkc.core.data.DataFactory;
import eu.larkc.core.data.DataSetImpl;
import eu.larkc.core.data.LabelledGroupOfStatements;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.core.query.SPARQLQueryImpl;
import eu.larkc.plugin.select.Selecter;

public class IRSelecter extends BaseLineFTSelecter {
	@Override
	protected Collection<SPARQLQuery> prepareQueries(Collection<String> terms, SetOfStatements sos) {
		StringBuilder sb = new StringBuilder();
		for (String term : terms) {
			sb.append(term).append(" ");
		}
		SPARQLQuery query = new SPARQLQueryImpl("SELECT ?uri WHERE { " +
				"?uri <http://www.ontotext.com/luceneQuery> \"" + sb + "\"}");
		
		return Arrays.asList(query);
	}

	public URI getIdentifier() {
		return new URIImpl("http://IRSelecter.larkc.eu/");
	}
	
	private static void benchmark(Selecter s, SetOfStatements rdf, String query, int maxMolecules) {
		// Create plug-in contract
		Logger log = LoggerFactory.getLogger(IRSelecter.class);
		IRSelecter.PluginContract contract = new IRSelecter.PluginContract(
			new SPARQLQueryImpl(query), maxMolecules
		);
		long t1 = System.currentTimeMillis();
		SetOfStatements sos = s.select(rdf, contract, null);
		long t2 = System.currentTimeMillis();
		log.info("*** " + ((LabelledGroupOfStatements)sos).getLabel());
		log.info("Executed in " + (t2-t1) + "ms. Found " + 
				contract.getSelectedStatements() + " statements, " + 
				contract.getSelectedMolecules() + " molecules.");
	}
	
	public static void main(String[] args) {
		// Instantiate the base-line full text searches selecter
		IRSelecter s = new IRSelecter();
		// Select a tripleset associated with keywords found in the query
		SetOfStatements rdf = new DataSetImpl(
				DataFactory.INSTANCE.createRdfStoreConnection(),
				Arrays.<URI>asList(), 
				Arrays.<URI>asList());

		// Benchmark selection
		String query1 = "SELECT ?s ?p ?o WHERE { ?s ?p ?o FILTER(?s = 'london madrid and berlin are the largest european capitals') }";	
		benchmark(s, rdf, query1, 10);
		benchmark(s, rdf, query1, 1000);
		String query2 = "SELECT ?s ?p ?o WHERE { ?s ?p ?o FILTER(?s = 'london' )}";
		benchmark(s, rdf, query2, 10);
		benchmark(s, rdf, query2, 1000);
	}

}
