package eu.larkc.plugin.transform.gate;

import org.openrdf.model.Statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

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
import eu.larkc.core.data.NaturalLanguageDocument;
import eu.larkc.core.data.NaturalLanguageDocumentUrl;
import eu.larkc.core.data.RdfStoreConnection;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.transform.InformationSetTransformer;

public class GateTransformer implements InformationSetTransformer {

	// link to GATE server
	private static String gateServerUrl = "http://shodan.ijs.si:8080/GateServer/Gate?a=";
	
    public GateTransformer() {
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

    /**
	 * Takes an information set and extracts named-entities 
	 * and stores them as a set of RDF statements
	 */
	public InformationSet transform(InformationSet theInformationSet,
			Contract theContract, Context theContext) {
		Logger log = LoggerFactory.getLogger(GateTransformer.class);
		
		if (theInformationSet == null) { return null; }
		
		if (theInformationSet instanceof NaturalLanguageDocument) {	
			log.info("Extracting named-entities from text ...");
			
			HashSet<Statement> statements = new HashSet<Statement>();
			DataFactory df = DataFactory.INSTANCE;
			ValueFactory vf = new ValueFactoryImpl();
			RdfStoreConnection con = df.createRdfStoreConnection();
			
			// get the text from the document
			String documentStr = ((NaturalLanguageDocument)theInformationSet).getText();
		
			// call gate to extract named-entities from document
			String fullUrlStr = null;
			try {
				fullUrlStr = gateServerUrl + URLEncoder.encode(documentStr, "UTF-8");
			} catch (Exception e) { 
				return null;
			}
			String gateReply = fetchUrl(fullUrlStr);
			String[] orgsList = gateReply.split("\n");
			
			// remember the link it to the article
			URI temp = new URIImpl("urn:query-graph-" + UUID.randomUUID().toString());
	        URI articleUri = vf.createURI("urn:article-" + UUID.randomUUID().toString());
			URI hasUrlUri = vf.createURI("urn:hasUrl");
			String articleUrlStr = ((NaturalLanguageDocumentUrl)theInformationSet).getUrl();
			Value articleUrl = vf.createLiteral(articleUrlStr);
			statements.add(con.addStatement(articleUri, hasUrlUri, articleUrl, temp));
			
			// add organization to output list
			for (String org : orgsList) {		
				log.info(" - " + org);
				// first we add the company		
		        URI companyUri = vf.createURI("urn:company-" + UUID.randomUUID().toString());
				URI nameStringUri = vf.createURI("urn:nameString");
				Value subj = vf.createLiteral(org);
				statements.add(con.addStatement(companyUri, nameStringUri, subj, temp));
		        // then we link it to the article
				URI appearsInArticleUri = vf.createURI("http://www.cycfoundation.org/concepts/mentionedInArticle");
				statements.add(con.addStatement(companyUri, appearsInArticleUri, articleUri, temp));
			}
						
			// return constructed set of statements
			return df.createRdfGraph(statements, temp);
		}
		
		return null;
	}
	
	private String convertStreamToString(InputStream is) {
		/*
		 * To convert the InputStream to String we use the
		 * BufferedReader.readLine() method. We iterate until the BufferedReader
		 * return null which means there's no more data to read. Each line will
		 * appended to a StringBuilder and returned as String.
		 */
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		StringBuilder sb = new StringBuilder();

		String line = null;
		try {
			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
		} catch (IOException e) {
			// handle errors ...
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return sb.toString();
	}
	
	private String fetchUrl(String urlStr) {
		String pageStr = null;
		try {
			URL url = new URL(urlStr);
			if (url.getProtocol().equals("http")) {
				// connect to the web server
				HttpURLConnection connection = (HttpURLConnection) url
						.openConnection();
				connection.setRequestMethod("GET");
				connection.connect();
				// retrieve the content
				InputStream stream = connection.getInputStream();
				pageStr = convertStreamToString(stream);
			}
		} catch (Exception e) {
			// handle any errors ...
		}
		return pageStr;
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
