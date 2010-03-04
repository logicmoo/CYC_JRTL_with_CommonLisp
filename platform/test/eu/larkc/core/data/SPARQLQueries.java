package eu.larkc.core.data;

import junit.framework.Assert;

import org.junit.Test;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;

import eu.larkc.core.data.VariableBinding.Binding;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.core.query.SPARQLQueryImpl;

public class SPARQLQueries extends ORDITestCase {

	@Test
	public void testSPARQLSelect() {
		DataFactory.INSTANCE
		.createRdfStoreConnection().addStatement(new URIImpl("urn:test"), 
				new URIImpl("urn:test"), new URIImpl("urn:test"), new URIImpl("urn:test"));
		SPARQLQuery query = new SPARQLQueryImpl("SELECT * WHERE {?s ?p ?o}");
		SPARQLEndpoint endpoint = DataFactory.INSTANCE
				.createRdfStoreConnection();

		VariableBinding result = endpoint.executeSelect(query);
		result.getVariables();
		CloseableIterator<Binding> iter = result.iterator();
		while (iter.hasNext()) {
			iter.next();
		}
	}

	@Test
	public void testSPARQLConstruct() {
		SPARQLQuery query = new SPARQLQueryImpl(
				"CONSTRUCT {?s ?p ?o} WHERE {?s ?p ?o}");
		SPARQLEndpoint endpoint = DataFactory.INSTANCE
				.createRdfStoreConnection();

		SetOfStatements result = endpoint.executeConstruct(query);
		CloseableIterator<Statement> iter = result.getStatements();
		Assert.assertTrue(iter.hasNext());
		while (iter.hasNext()) {
			iter.next();
		}
	}
	
	@Test
	public void testSPARQLAsk() {
		SPARQLQuery query = new SPARQLQueryImpl(
				"ASK WHERE {?s ?p ?o}");
		SPARQLEndpoint endpoint = DataFactory.INSTANCE
				.createRdfStoreConnection();
		Assert.assertTrue(endpoint.executeAsk(query));
		
		query = new SPARQLQueryImpl("ASK WHERE {?s ?p \"NOT%EXISTING%STRING%\"}");
		endpoint = DataFactory.INSTANCE.createRdfStoreConnection();
		Assert.assertFalse(endpoint.executeAsk(query));
	}
	
	@Test
	public void testSPARQLLabelledGroup() {
		DataFactory df = DataFactory.INSTANCE;
		RdfStoreConnection con = df.createRdfStoreConnection();
		LabelledGroupOfStatements label = con.createLabelledGroupOfStatements();
		URI test = new URIImpl("http://test-uri.net");
		con.addStatement(test, test, test, test, label.getLabel());
		
		SPARQLQuery query = df.createSPARQLQuery("SELECT * WHERE {?s ?p ?o}");
		query.setLabelledGroup(label.getLabel());
		
		VariableBinding result = con.executeSelect(query);
		CloseableIterator<Binding> iter = result.iterator();
		Assert.assertTrue(iter.hasNext());
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
