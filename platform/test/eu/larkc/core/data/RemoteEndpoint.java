package eu.larkc.core.data;

import org.junit.Test;
import org.openrdf.model.Statement;
import org.openrdf.model.impl.URIImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.larkc.core.data.VariableBinding.Binding;
import eu.larkc.core.query.RemoteSPARQLEndpoint;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.core.query.SPARQLQueryImpl;

public class RemoteEndpoint {
	

	@Test
	public void testSPARQLSelect() {
		Logger log = LoggerFactory.getLogger(RemoteEndpoint.class);
		RemoteSPARQLEndpoint rse = new RemoteSPARQLEndpoint(
				new URIImpl(
						"http://www.linkedlifedata.com/openrdf-sesame/repositories/owlim"));
		SPARQLQuery q = new SPARQLQueryImpl(
				"PREFIX biopax2: <http://www.biopax.org/release/biopax-level2.owl#> PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> SELECT ?interaction ?protein ?protein_name WHERE { ?interaction rdf:type biopax2:interaction . ?interaction biopax2:PARTICIPANTS ?p . ?p biopax2:PHYSICAL-ENTITY ?protein . ?protein biopax2:NAME ?protein_name filter(regex(str(?protein_name), \"IL-2\")) } LIMIT 100");
		VariableBinding vb = rse.executeSelect(q);
		log.info("",vb.getVariables());
		CloseableIterator<Binding> iter = vb.iterator();
		while (iter.hasNext()) {
			Binding b = iter.next();
			log.info("" + b);
		}
	}
	
	@Test
	public void testSPARQLConstruct() {
		Logger log = LoggerFactory.getLogger(RemoteEndpoint.class);
		RemoteSPARQLEndpoint rse = new RemoteSPARQLEndpoint(
				new URIImpl(
						"http://www.linkedlifedata.com/openrdf-sesame/repositories/owlim"));
		SPARQLQuery q = new SPARQLQueryImpl(
				"CONSTRUCT {?s ?p ?o} WHERE {?s ?p ?o} LIMIT 100");
		SetOfStatements result = rse.executeConstruct(q);
		CloseableIterator<Statement> iter = result.getStatements();
		while (iter.hasNext()) {
			Statement s = iter.next();
			log.info("" + s);
		}
	}
	
	@Test
	public void testSPARQLAsk() {
		Logger log = LoggerFactory.getLogger(RemoteEndpoint.class);
		RemoteSPARQLEndpoint rse = new RemoteSPARQLEndpoint(
				new URIImpl(
						"http://www.linkedlifedata.com/openrdf-sesame/repositories/owlim?query="));
		SPARQLQuery q = new SPARQLQueryImpl("ASK WHERE { ?s ?p ?o}");
		log.info("" + rse.executeAsk(q));
	}
}
