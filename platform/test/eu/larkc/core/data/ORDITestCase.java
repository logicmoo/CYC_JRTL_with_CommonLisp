package eu.larkc.core.data;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public abstract class ORDITestCase {

	protected final static DataFactory df = DataFactory.INSTANCE;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		File f = new File("ordi-trree");
		if (f.exists() && f.isDirectory()) {
			for (File f2 : f.listFiles()) {
				f2.delete();
			}
		}
	}

	@AfterClass
	public static void cleanUp() throws Exception {
		setUpBeforeClass();
		RdfStoreConnection con = df.createRdfStoreConnection();
		con.removeStatement(null, null, null, null);
	}
}
