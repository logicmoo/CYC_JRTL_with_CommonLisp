package eu.larkc.plugin.select.cycselecter;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.opencyc.api.CycAccess;
import org.opencyc.api.CycApiException;
import org.opencyc.cycobject.CycConstant;
import org.opencyc.cycobject.CycList;
import org.openrdf.model.Resource;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.impl.URIImpl;
import org.openrdf.model.impl.ValueFactoryImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cyc.cycjava.cycl.cycl;

import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.DataFactory;
import eu.larkc.core.data.DataSet;
import eu.larkc.core.data.RdfGraph;
import eu.larkc.core.data.RdfStoreConnection;
import eu.larkc.core.data.SPARQLEndpoint;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.select.Selecter;

/**
 * Selects the companies with correspondence in ResearchCyc KB
 * @author Luka Bradesko, Blaz Fortuna
 *
 */
public class CycSelecter implements Selecter {

	// link to research cyc
	private static String researchCycServerIP = "shodan.ijs.si";
	private static int researchCycServerPort = 3600;
	
	private CycAccess ca;
	private HashMap inferenceParams;
	private CycConstant mtAll;
	private CycConstant onlineNewsArticle;
	private CycConstant universalMt;
    
	private void init(String cycServer, int serverPort) {
		// prepare connection stuff
		Logger log = LoggerFactory.getLogger(CycSelecter.class);
		try {
			log.info("Connecting to cyc ...");
			ca = new CycAccess(cycServer, serverPort);
			mtAll = ca.makeCycConstant("InferencePSC");
			inferenceParams = new HashMap();
			onlineNewsArticle = ca.makeCycConstant("OnlineNewsArticle");
			universalMt = ca.makeCycConstant("BaseKB");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CycApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public CycSelecter() {
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
		Logger log = LoggerFactory.getLogger(CycSelecter.class);

		if (theSetOfStatements == null) { return null; }

		// connecting to cyc
		init(researchCycServerIP, researchCycServerPort);
		
		try {
			System.out.println("Selecting companies with correspondance in ResearchCyc KB");
			// first we remember mapping between company ids to cyc constants
			HashMap<String, String> companyIdToCyc = new HashMap<String, String>();
			CloseableIterator<Statement> iter = theSetOfStatements.getStatements();
			while (iter.hasNext()) {
				Statement stat = iter.next();
				if (stat.getPredicate().stringValue().equals("urn:nameString")) {
					String companyId = stat.getSubject().stringValue();
					String companyName = stat.getObject().stringValue();
					// prepare query to get cyc constat
					CycList query = ca.makeCycList("(#$and (#$nameString ?COMPANY \""
							+ companyName + "\") (#$isa ?COMPANY #$Business))");
					CycList answer = ca.askNewCycQuery(query, mtAll, inferenceParams);
					// check if there is a corresponding Cyc query
					if (!answer.isEmpty()) {
						log.info(" - " + companyName); 
						String companyCycConst = ((CycList)((CycList)answer.get(0)).get(0)).getDottedElement().toString();
						companyIdToCyc.put(companyId, companyCycConst);
					}
				} else if (stat.getPredicate().stringValue().endsWith("urn:hasUrl")) {
					String articleId = stat.getSubject().stringValue();
					String articleUrl = stat.getObject().stringValue();
					// add to cyc
			    	CycConstant articleCycConst = ca.makeCycConstant(articleId);
			    	ca.assertIsa(articleCycConst, onlineNewsArticle);
			    	ca.assertGaf(ca.makeCycList(
			    		"(#$urlOfCW #$" + articleId  +	" (#$URLFn \"" + articleUrl + "\"))"),
			    		universalMt);
				}
			}

			// prepare a new dataset for cyc reasoner with updated ids
			URI temp = new URIImpl("urn:temp");
			HashSet<Statement> statements = new HashSet<Statement>();
			DataFactory df = DataFactory.INSTANCE;
			ValueFactory vf = new ValueFactoryImpl();
			RdfStoreConnection con = df.createRdfStoreConnection();
			iter = theSetOfStatements.getStatements();
			while (iter.hasNext()) {
				Statement stat = iter.next();
				if (stat.getPredicate().stringValue().equals("http://www.cycfoundation.org/concepts/mentionedInArticle")) {
					// get company concept
					String companyId = stat.getSubject().stringValue();
					if (companyIdToCyc.containsKey(companyId)) {
						String companyIdCyc = companyIdToCyc.get(companyId);
						URI companyIdCycUri = vf.createURI("http://www.cycfoundation.org/concepts/" + companyIdCyc);
						// get article concept
						String articleId = stat.getObject().stringValue();
						URI articleIdUri = vf.createURI("http://www.cycfoundation.org/concepts/" + articleId);
						// remember statement
						statements.add(con.addStatement(companyIdCycUri, 
								stat.getPredicate(), articleIdUri, temp));
					}
				}			
			}
			
			return df.createRdfGraph(statements, temp);			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CycApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
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
