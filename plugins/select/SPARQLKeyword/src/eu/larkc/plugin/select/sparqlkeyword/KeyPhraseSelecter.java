package eu.larkc.plugin.select.sparqlkeyword;

import java.util.Arrays;

import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.larkc.core.data.DataFactory;
import eu.larkc.core.data.LabelledGroupOfStatements;
import eu.larkc.core.query.SPARQLQueryImpl;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.select.Selecter;
import eu.larkc.plugin.select.sparqlkeyword.annotator.KeyPhraseAnnotator;

public class KeyPhraseSelecter extends BaseLineFTSelecter {
	protected String prepareQuery(String word) {
		return "SELECT DISTINCT ?o WHERE { ?s <" + KeyPhraseAnnotator.HAS_KEY_PHRASES.stringValue() + "> ?o . " +
					"<" + word + ":> <http://www.ontotext.com/matchIgnoreCase> ?o}";
	}

	public URI getIdentifier() {
		return new URIImpl("http://KeyPhraseSelecter.larkc.eu/");
	}

	public static void main(String[] args) {
		Logger log = LoggerFactory.getLogger(KeyPhraseSelecter.class);
		// Instantiate the base-line full text searches selecter
		Selecter s = new KeyPhraseSelecter();
		// Set the SPARQL query to be used for the FT search
		Contract contract = new BaseLineFTSelecter.PluginContract(
			new SPARQLQueryImpl(
				"SELECT ?s ?p ?o WHERE { ?s ?p ?o FILTER(?s = 'test resource') }"
			));
		// Select a tripleset associated with keywords found in the query
		DataFactory df = DataFactory.INSTANCE;
		LabelledGroupOfStatements ts = (LabelledGroupOfStatements) s.select(
				df.createRdfGraph(Arrays.<Statement>asList(), 
				new URIImpl("urn:temp")), contract, null);
		log.info("selected: " + ts.getLabel());
	}
}
