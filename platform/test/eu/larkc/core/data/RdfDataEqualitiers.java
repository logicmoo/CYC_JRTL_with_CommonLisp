package eu.larkc.core.data;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;

public class RdfDataEqualitiers {

	@Test
	public void testParamConfig() {
		DataFactoryImpl.getInstance();
		assertEquals(DataFactoryImpl.REFERENCE_TYPES_CACHE_TIME, 1000 * 60);

		System.setProperty(DataFactoryImpl.REFERENCE_TYPES_CACHE_TIME_PROP,
				"10");
		DataFactoryImpl.getInstance();
		assertEquals(DataFactoryImpl.REFERENCE_TYPES_CACHE_TIME, 10);

		System.setProperty(DataFactoryImpl.REFERENCE_TYPES_CACHE_TIME_PROP,
				"invalid");
		DataFactoryImpl.getInstance();
		assertEquals(DataFactoryImpl.REFERENCE_TYPES_CACHE_TIME, 10);
	}

	@Test
	public void testDataSet() throws InterruptedException {
		RdfStoreConnection con = DataFactoryImpl.getInstance()
				.createRdfStoreConnection();
		DataSet ds = new DataSetImpl(con, null, null);
		DataSet ds2 = new DataSetImpl(con, null, null);

		assertEquals(ds, ds2);
		Thread.sleep(100);
		ds2 = new DataSetImpl(con, null, null);

		// cache has expired
		assertEquals(ds.equals(ds2), false);

		ArrayList<URI> graphs = new ArrayList<URI>();
		graphs.add(new URIImpl("urn:test"));
		ds2 = new DataSetImpl(con, graphs, null);

		assertEquals(ds.equals(ds2), false);
	}

	@Test
	public void testHTTPRemoteGraph() throws InterruptedException {
		HTTPRemoteGraph rdf1 = new HTTPRemoteGraph(new URIImpl(
				"http:////linkedlifedata.com//resource//umls/id//C0024117"));
		HTTPRemoteGraph rdf2 = new HTTPRemoteGraph(new URIImpl(
				"http:////linkedlifedata.com//resource//umls/id//C0024117"));

		assertEquals(rdf1, rdf2);
		Thread.sleep(100);
		assertEquals(rdf1, rdf2);
	}

	@Test
	public void testLabelledGroupOfStatementsImpl() throws InterruptedException {
		/*
		RdfStoreConnection con = DataFactoryImpl.getInstance()
				.createRdfStoreConnection();
		LabelledGroupOfStatements l1 = con
				.createLabelledGroupOfStatements(new URIImpl("urn:test"));
		LabelledGroupOfStatements l2 = con
				.createLabelledGroupOfStatements(new URIImpl("urn:test2"));

		assertEquals(l1, l2);
		assertEquals(l1.equals(l2), false);
		*/
	}
}
