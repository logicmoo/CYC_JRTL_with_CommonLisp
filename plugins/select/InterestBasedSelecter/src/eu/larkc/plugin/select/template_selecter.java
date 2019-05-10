package eu.larkc.plugin.select;

import java.util.HashSet;

import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.impl.URIImpl;
import org.openrdf.model.impl.ValueFactoryImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.larkc.core.data.DataFactory;
import eu.larkc.core.data.RdfStoreConnection;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.select.Selecter;


/**
 * This is a selecter template, based on CycSelecter 
 * @author Luka Bradesko, Alexey Cheptsov
 *
 */
public class template_selecter implements Selecter {

	public template_selecter() {
	}

	@Override
	public Context createContext() {
		return null;
	}

	@Override
	public void initialise() {
	}
	
	@Override
	public void shutdown() {
	}

	@Override
	public SetOfStatements select(SetOfStatements theSetOfStatements,
			Contract contract, Context context) {
		Logger log = LoggerFactory.getLogger(template_selecter.class);
		log.info("Hello from selecter");
	
			// prepare a new dataset for cyc reasoner with updated ids
			URI temp = new URIImpl("urn:temp");
			HashSet<Statement> statements = new HashSet<Statement>();
			DataFactory df = DataFactory.INSTANCE;
			ValueFactory vf = new ValueFactoryImpl();
			RdfStoreConnection con = df.createRdfStoreConnection();
			
			URI articleIdUri = vf.createURI("http://www.cycfoundation.org/concepts/exampkleID");
			URI companyIdCycUri = vf.createURI("http://www.cycfoundation.org/concepts/somethingAsAnExample");
			statements.add(con.addStatement(companyIdCycUri, vf.createURI("urn:mentionedIn"), articleIdUri, temp));
			return df.createRdfGraph(statements, temp);		
	}

	@Override
	public URI getIdentifier() {
		return new URIImpl("urn:" + this.getClass().getName());
	}

	@Override
	public QoSInformation getQoSInformation() {
		// TODO Auto-generated method stub
		return null;
	}

}
