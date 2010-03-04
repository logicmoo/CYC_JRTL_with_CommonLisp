package eu.larkc.core.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.Test;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;

import eu.larkc.core.data.VariableBinding.Binding;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.core.query.SPARQLQueryImpl;

public class SerializationTests extends ORDITestCase {

	@Test
	public void testORDIVariableBinding() throws Exception {
		String file = "testORDIVariableBinding.test";
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream os = new ObjectOutputStream(fos);

		SPARQLQuery query = new SPARQLQueryImpl("SELECT * WHERE {?s ?p ?o}");
		RdfStoreConnection con = DataFactory.INSTANCE
				.createRdfStoreConnection();
		URI u1 = new URIImpl("urn:serialization:test:1");
		con.addStatement(u1, u1, u1, u1);

		VariableBinding vb = con.executeSelect(query);
		os.writeObject(vb);
		os.close();

		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream is = new ObjectInputStream(fis);
		vb = (VariableBinding) is.readObject();
		CloseableIterator<Binding> iter = vb.iterator();
		int count = 0;

		while (iter.hasNext()) {
			iter.next();
			count++;
		}
		Assert.assertEquals(1, count);
		fis.close();
	}

	@Test
	public void testORDIGraphResult() throws Exception {
		String file = "testORDIGraphResult.test";
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream os = new ObjectOutputStream(fos);

		SPARQLQuery query = new SPARQLQueryImpl(
				"CONSTRUCT {?s ?p ?o} WHERE {?s ?p ?o}");
		SPARQLEndpoint endpoint = DataFactory.INSTANCE
				.createRdfStoreConnection();
		SetOfStatements result = endpoint.executeConstruct(query);
		os.writeObject(result);
		os.close();

		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream is = new ObjectInputStream(fis);
		result = (SetOfStatements) is.readObject();
		CloseableIterator<Statement> iter = result.getStatements();
		int count = 0;

		while (iter.hasNext()) {
			iter.next();
			count++;
		}
		Assert.assertEquals(1, count);
		fis.close();
	}

	@Test
	public void testSPARQLQuery() throws Exception {
		String file = "testSPARQLQuery.test";
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream os = new ObjectOutputStream(fos);

		SPARQLQuery query = new SPARQLQueryImpl(
				"CONSTRUCT {?s ?p ?o} WHERE {?s ?p ?o}");
		os.writeObject(query);
		os.close();

		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream is = new ObjectInputStream(fis);
		query = (SPARQLQuery) is.readObject();
		fis.close();
	}

	@AfterClass
	public static void cleanUp() throws Exception {
		setUpBeforeClass();
		String[] args = { "testSPARQLQuery.test", "testORDIGraphResult.test",
				"testORDIVariableBinding.test" };
		for (int i = 0; i < args.length; i++) {
			File f = new File(args[i]);
			if (f.exists() && f.isFile()) {
				f.delete();
			}
		}
	}
}
