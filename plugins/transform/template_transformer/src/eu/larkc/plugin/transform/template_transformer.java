package eu.larkc.plugin.transform;

import java.util.HashSet;

import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.impl.URIImpl;
import org.openrdf.model.impl.ValueFactoryImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cyc.tool.subl.util.UUID;

import eu.larkc.core.data.DataFactory;
import eu.larkc.core.data.InformationSet;
import eu.larkc.core.data.NaturalLanguageDocumentUrl;
import eu.larkc.core.data.RdfStoreConnection;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.transform.InformationSetTransformer;


/**
 * This is a transformer template, based on GateTransformer 
 * @author Luka Bradesko, Alexey Cheptsov
 *
*/
public class template_transformer implements InformationSetTransformer {

	
	
	public template_transformer() {
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

	public InformationSet transform(InformationSet theInformationSet,
			Contract theContract, Context theContext) {
		Logger log = LoggerFactory.getLogger(template_transformer.class);
		log.info("Hello from transformer");
		
		URI temp = new URIImpl("urn:query-graph-" + UUID.randomUUID().toString());//unique graph name
		HashSet<Statement> statements = new HashSet<Statement>();
		// remember the link it to the article
		
		DataFactory df = DataFactory.INSTANCE;
		ValueFactory vf = new ValueFactoryImpl();
        URI articleUri = vf.createURI("urn:article-" + UUID.randomUUID().toString());
		URI hasUrlUri = vf.createURI("urn:hasUrl");
		String articleUrlStr = ((NaturalLanguageDocumentUrl)theInformationSet).getUrl();
		Value articleUrl = vf.createLiteral(articleUrlStr);
		RdfStoreConnection con = df.createRdfStoreConnection();
		statements.add(con.addStatement(articleUri, hasUrlUri, articleUrl, temp));
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
