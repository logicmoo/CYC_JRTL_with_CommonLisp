package eu.larkc.core.orchestrator.servers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringBufferInputStream;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.sun.net.httpserver.Headers;


public class SPARQLServlet extends HttpServlet
{

	static final String sparqlNsUri = "http://www.w3.org/2005/09/sparql-protocol-types/#";
	static final String sparqlNsPref = "vbr"; // we just use this in the XML we generate as output; no idea what it means, but it's used in sec. 1 of the SPARQL protocol spec.
	
	static final String soapEnvNsUri = "http://www.w3.org/2003/05/soap-envelope/";
	static final String soapEnvNsPref = "soapenv";

	/**
	 * Parses a SPARQL query request represented by an XML document tree, as described
	 * in sec. 2.3.1 of the SPARQL Protocol for RDF. 
	 * @param queryRequest The <sparql-query> element.
	 * @return An instance of SparqlQueryRequest containing data extracted from the XML tree.
	 * @exception MalformedSparqlQueryException Thrown if the XML structure is malformed or does not contains exactly one 'query' parameter.
	 */
	static SparqlQueryRequest parseSoapQueryRequest(Element queryRequest) throws SparqlException
	{
		// Note: despite some warnings in the documentation of Node.getNamespaceURI(),
		// it turns out that this method returns the correct namespace URI even if 
		// the prefix for this namespace was declared somewhere higher up in the DOM tree.
		if (! queryRequest.getLocalName().equals("query-request")) throw new MalformedSparqlQueryException("The element inside the envelope body should be <query-request>, not \"" + queryRequest.getLocalName());
		if (! queryRequest.getNamespaceURI().equals(sparqlNsUri)) throw new MalformedSparqlQueryException("The <query-request> element should be from the namespace \"" + sparqlNsUri + "\", not \"" + queryRequest.getLocalName());
		
		NodeList children = queryRequest.getChildNodes();
		SparqlQueryRequest qr = new SparqlQueryRequest();
		boolean hasQuery = false;
		for (int i = 0; i < children.getLength(); i++)
		{
			Node childNode = children.item(i);
			if (childNode.getNodeType() != Node.ELEMENT_NODE) continue;
			Element child = (Element) childNode;
			// If this child element is not from the SPARQL namespace, we'll skip it.
			// Perhaps we should be more strict and report it as a malformed query?
			if (! child.getNamespaceURI().equals(sparqlNsUri)) continue;
			//
			String name = child.getLocalName();
			String value = child.getTextContent();
			if (name.equals("query"))
			{
				if (hasQuery) throw new MalformedSparqlQueryException("More than one value of the \"" + name + "\" parameter is being provided (first \"" + qr.getQuery() + "\", then \"" + value + "\").");
				hasQuery = true; 
				qr.setQuery(value);
			}
			else if (name.equals("default-graph-uri"))
				qr.addDefaultGraphUri(value);
			else if (name.equals("named-graph-uri"))
				qr.addNamedGraphUri(value);
			else 
				throw new MalformedSparqlQueryException("Unknown parameter name: \"" + name + "\"; should be \"query\", \"default-graph-uri\" or \"named-graph-uri\"."); 
		}
		if (! hasQuery) throw new MalformedSparqlQueryException("The required parameter \"query\" is missing.");
		return qr;
	}

	/**
	 * Wraps the root element of the document in a new <query-result> 
	 * element from the sparqlNsUri namespace; this new element becomes the
	 * new root of the document.  
	 * @param doc
	 */
	static void addQueryResultWrapper(Document doc)
	{
		Element oldRoot = doc.getDocumentElement();
		doc.removeChild(oldRoot);
		Element newRoot = doc.createElementNS(sparqlNsUri, sparqlNsPref + ":query-result");
		SparqlResultFormatter.setXmlnsAttribute(newRoot, sparqlNsPref, sparqlNsUri);  
		newRoot.appendChild(oldRoot);
		doc.appendChild(newRoot);
	}
	
	/**
	 * Wraps the root element of the document in a new pair of
	 * <soapenv:Envelope><soapenv:Body> elements; the new Envelope element
	 * becomes the new root of the document.
	 * @param doc
	 */
	static void addSoapEnvelope(Document doc)
	{
		Element oldRoot = doc.getDocumentElement();
		doc.removeChild(oldRoot);
		Element newRoot = doc.createElementNS(soapEnvNsUri, soapEnvNsPref + ":Envelope");
		SparqlResultFormatter.setXmlnsAttribute(newRoot, soapEnvNsPref, soapEnvNsUri); 
		Element body = doc.createElementNS(soapEnvNsUri, soapEnvNsPref + ":Body");
		newRoot.appendChild(body);
		body.appendChild(oldRoot);
		doc.appendChild(newRoot);
	}

	/**
	 * Tries to create, in 'doc', a fault message in the spirit of sec. 2.1.4
	 * of http://www.w3.org/TR/rdf-sparql-protocol/#SparqlQuery .  The existing
	 * contents of 'doc', if any, are discarded in the process.  Note that
	 * the SOAP specification itself defines the structure of a fault message
	 * pretty thoroughly, in sec. 2.3: http://www.w3.org/TR/2007/REC-soap12-part0-20070427/#L11549
	 * It isn't quite obvious to me where the fault structure defined by the SPARQL
	 * protocol fits into the fault structure as defined by SOAP.  Currently
	 * we insert it inside the <soapEnv:Detail> element (which is optional
	 * according to SOAP).   
	 * @param doc  The XML document within which the fault message is to be created.
	 * @param isMalformed  Specifies if this is a MalformedQuery fault message as opposed to a QueryRequestRefused fault message (in the sense of sec. 2.1.4 of the SPARQL protocol spec).  We also set <soapenv:Value> accordingly (Sender for MalformedQuery, Receiver otherwise).   
	 * @param errorText
	 */
	static void createFaultMessage(Document doc, boolean isMalformed, String errorText)
	{
		{Element e = doc.getDocumentElement();
		if (e != null) doc.removeChild(e);}
		Element fault = doc.createElementNS(soapEnvNsUri, soapEnvNsPref + ":Fault");
		Element code = doc.createElementNS(soapEnvNsUri, soapEnvNsPref + ":Code");
		Element value = doc.createElementNS(soapEnvNsUri, soapEnvNsPref + ":Value");
		value.appendChild(doc.createTextNode(soapEnvNsPref + ":" + (isMalformed ? "Sender" : "Receiver")));
		code.appendChild(value);
		fault.appendChild(code);
		Element reason = doc.createElementNS(soapEnvNsUri, soapEnvNsPref + ":Reason");
		Element ext = doc.createElementNS(soapEnvNsUri, soapEnvNsPref + ":Text");
		ext.setAttribute("xml:lang", "en");
		ext.appendChild(doc.createTextNode(errorText));
		reason.appendChild(ext);
		fault.appendChild(reason);
		Element detail = doc.createElementNS(soapEnvNsUri, soapEnvNsPref + ":Detail");
		Element sparqlOuter = doc.createElementNS(sparqlNsUri, sparqlNsPref + ":" + (isMalformed ? "malformed-query" : "query-request-refused"));
		SparqlResultFormatter.setXmlnsAttribute(sparqlOuter, sparqlNsPref, sparqlNsUri); 
		Element details = doc.createElementNS(sparqlNsUri, sparqlNsPref + ":fault-details");
		details.appendChild(doc.createTextNode(errorText));
		sparqlOuter.appendChild(details);
		detail.appendChild(sparqlOuter);
		fault.appendChild(detail);
		doc.appendChild(fault);
		addSoapEnvelope(doc);
	}
	
	/**
	 * Sets the content type of 'res' to application/soap+xml and sends
	 * the given 'text' as the body of the response, encoded in UTF-8.
	 * @param res The HTTP response object.
	 * @param text The body of the response (should be a string representation of a SOAP XML document).
	 * @throws IOException If thrown while working with res.getOutputStream().
	 */
	static void sendResponse(HttpServletResponse res, String text) throws IOException
	{
		// Send the result back to the client.
		res.setContentType("application/soap+xml; charset=UTF-8");
		// Supposedly we could also call res.setCharacterEncoding("UTF-8").
		byte[] bytes; 
		try { bytes = text.getBytes("UTF-8"); }
		catch (UnsupportedEncodingException e) { bytes = text.getBytes(); }
		res.setContentLength(bytes.length);
		OutputStream os = res.getOutputStream();
		os.write(bytes);
		os.close();
	}

	/**
	 * Creates an XML Document, calls the other createFaultMessage to populate it,
	 * and converts it into a string, which it then results.
	 * @param query  The SPARQL query which resulted in the fault.
	 * @param isMalformed  Whether this is a MalformedQuery fault (as opposed to a QueryRequestRefused fault).
	 * @param errorText  The details of the fault.
	 * @return  A string representation of the XML document containing the fault.
	 * @throws ParserConfigurationException  If thrown by DocumentBuilderFactory.
	 * @throws SparqlException  If thrown by xmlToString.
	 */
	static String createFaultMessage(String query, boolean isMalformed, String errorText) throws ParserConfigurationException, SparqlException
	{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.newDocument();
		createFaultMessage(doc, isMalformed, errorText);
		String s = SparqlQueryHandler.xmlToString(query, doc);
		return s;
	}
	
	/**
	 * Calls createFaultMessage and sends the resulting string as a
	 * response through 'res'.  If createFaultMessage throws an exception,
	 * sendFaultMessage will call res.sendError and report an internal 
	 * server error (HTTP 500).
	 * @param res  The HTTP response object.
	 * @param query  The SPARQL query which resulted in the fault.
	 * @param isMalformed  Whether this is a MalformedQuery fault (as opposed to a QueryRequestRefused fault).
	 * @param errorText  The details of the fault.
	 * @throws IOException  If thrown by 'res' during I/O.
	 */
	static void sendFaultMessage(HttpServletResponse res, String query, boolean isMalformed, String errorText) throws IOException
	{
		try {
			String s = createFaultMessage(query, isMalformed, errorText);
			sendResponse(res, s);
		} catch (ParserConfigurationException e) {
			res.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, (isMalformed ? "MalformedQuery" : "QueryRequestRefused") + ": " + errorText + " --- as well as " + SparqlQueryHandler.getExceptionString(e));
		} catch (SparqlException e) {
			res.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, (isMalformed ? "MalformedQuery" : "QueryRequestRefused") + ": " + errorText + " --- as well as " + SparqlQueryHandler.getExceptionString(e));
		}
	}
	
	public void doPost(
			HttpServletRequest req,
            HttpServletResponse res)
	 		throws ServletException, IOException
	{
		String method = req.getMethod();
		if (! method.equals("POST")) {
			res.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "Unsupported request method: \"" + method + "\".");
			return;
		}
		String queryString = "???";
		try
		{
			// The request body should be in application/soap+xml format.
			String contentType = req.getContentType();
			if (contentType == null) contentType = "";
			if (! contentType.startsWith("application/soap+xml")) {
				res.sendError(HttpServletResponse.SC_BAD_REQUEST, "Unsupported request Content-Type: \"" + contentType + "\"."); return; }
			/*
			// Read the request body.
			// Unlike the stream returned by req.getInputStream(), this reader
			// is supposed to also take the character encoding into account.
			BufferedReader reader = req.getReader();
			StringBuilder reqBody = new StringBuilder();
			final int capacity = 8192; char[] buf = new char[capacity]; int count;
			while ((count = reader.read(buf, 0, capacity)) > 0)
				reqBody.append(buf, 0, count);
			reader.close();
			// - But if we'll use messageFactory.createMessage to read the request body,
			// that method requires an InputStream, and it will get the character set info
			// from the headers anyway. 
			*/

			// Convert the headers from 'req' into a MimeHeaders instance.
			MimeHeaders headers = new MimeHeaders();
			for (Enumeration e = req.getHeaderNames(); e.hasMoreElements(); ) {
				String headerName = (String) e.nextElement();
				// Inexplicably, Eclipse says that the getHeaders method is missing...
				//for (Enumeration ee = req.getHeaders(headerName); ee.hasMoreElements(); ) headers.addHeader(headerName, (String) ee.nextElement());
				String headerValue = req.getHeader(headerName);
				headers.addHeader(headerName, headerValue); 
			}
			// Use the MessageFactory class to read the message.
			Document reqDoc = null;
			try {
				MessageFactory messageFactory = MessageFactory.newInstance(SOAPConstants.DYNAMIC_SOAP_PROTOCOL); // SOAP_1_2_PROTOCOL
				SOAPMessage soapMessage = messageFactory.createMessage(headers, req.getInputStream());
				SOAPBody soapBody = soapMessage.getSOAPBody();
				reqDoc = soapBody.extractContentAsDocument();
			} catch (SOAPException e) { 
				sendFaultMessage(res, "<no query yet>", false, "An error occurred while parsing the SOAP request message: " + SparqlQueryHandler.getExceptionString(e));
			}

			// Extract the query request from the SOAP envelope.
			Element reqRoot = reqDoc.getDocumentElement();
			SparqlQueryRequest queryRequest = parseSoapQueryRequest(reqRoot);
			queryString = queryRequest.getQuery();
			// Handle the request.
			SparqlQueryHandler queryHandler = new SparqlQueryHandler();
			SparqlQueryResult queryResult = queryHandler.handleQuery(queryRequest);
			
			// Wrap the results in a <query-result> element an an envelope again.
			Document resultDoc = queryResult.getDocument();
			addQueryResultWrapper(resultDoc);
			addSoapEnvelope(resultDoc);
			// Convert XML to string and send it back.
			String xmlResult = SparqlQueryHandler.xmlToString(queryRequest.getQuery(), resultDoc);
			sendResponse(res, xmlResult);
		}
		catch (MalformedSparqlQueryException e) {
			sendFaultMessage(res, queryString, true, e.getMessage());
		} catch (SparqlQueryRefusedException e) {
			sendFaultMessage(res, queryString, false, e.getMessage());
		} catch (Exception e) {
			sendFaultMessage(res, queryString, false, SparqlQueryHandler.getExceptionString(e));
		}

		/*
		PrintWriter out = res.getWriter();
		out.println("Hello, world!");
		out.close();
		*/
	}

	public static void testFaultMessage(String query, boolean isMalformed, String errorText)
	{
		
		try { String s = createFaultMessage(query, isMalformed, errorText); System.err.println(s); } 
		catch (Exception e) { System.err.println(errorText); System.err.println(SparqlQueryHandler.getExceptionString(e)); }
	}
	
	public static void test() throws SparqlException 
	{
		String reqBody_Select = 
			"<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
			"<soapenv:Envelope xmlns:soapenv=\"http://www.w3.org/2003/05/soap-envelope\"" +
			"                  xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">" +
			"  <soapenv:Body>" +
			"    <query-request xmlns=\"http://www.w3.org/2005/09/sparql-protocol-types/#\">" +
			"      <query>SELECT ?z {?x ?y ?z . FILTER regex(?z, 'Harry')}</query>" +
			"    </query-request>" +
			"  </soapenv:Body>" +
			"</soapenv:Envelope>";
		String reqBody_Construct = 
			"<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
			"<soapenv:Envelope xmlns:soapenv=\"http://www.w3.org/2003/05/soap-envelope\"" +
			"                  xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">" +
			"  <soapenv:Body>" +
			"    <query-request xmlns=\"http://www.w3.org/2005/09/sparql-protocol-types/#\">" +
			"      <query>ClalalaONSTRUCT {?x ?y ?z .} WHERE { ?x ?y ?z }</query>" +
			"      <default-graph-uri>http://www.example.com/tralala</default-graph-uri>" +
			"      <default-graph-uri>http://www.example.com/tralala1</default-graph-uri>" +
			"      <named-graph-uri>http://www.example.com/hopsasa</named-graph-uri>" +
			"      <named-graph-uri>http://www.example.com/hopsasa1</named-graph-uri>" +
			"      <named-graph-uri>http://www.example.com/hopsasa2</named-graph-uri>" +
			"    </query-request>" +
			"  </soapenv:Body>" +
			"</soapenv:Envelope>";
		String reqBody = reqBody_Construct;

		/*
		// Parse the XML of the request body.
		DocumentBuilderFactory dbFac = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = dbFac.newDocumentBuilder();
		Document doc = docBuilder.parse(reqBody.toString());
		*/
		
		// SOAP11_NAMESPACE: http://schemas.xmlsoap.org/wsdl/soap/
		// SOAP12_NAMESPACE: http://schemas.xmlsoap.org/wsdl/soap12/

		String queryString = "???";
		try
		{
			//System.err.println(com.sun.xml.internal.messaging.saaj.soap.name.NameImpl.SOAP11_NAMESPACE); 
			//System.err.println(com.sun.xml.internal.messaging.saaj.soap.name.NameImpl.SOAP12_NAMESPACE); 
			MimeHeaders headers = new MimeHeaders();
			headers.addHeader("Content-Type", "application/soap+xml");
			InputStream is = new StringBufferInputStream(reqBody);
			
			MessageFactory messageFactory = MessageFactory.newInstance(SOAPConstants.DYNAMIC_SOAP_PROTOCOL); // SOAP_1_2_PROTOCOL
			SOAPMessage message = messageFactory.createMessage(headers, is);
			SOAPBody body = message.getSOAPBody();
			Document doc = body.extractContentAsDocument();
			
			Element root = doc.getDocumentElement();
			/*System.err.println("Root\'s namespace URI: " + root.getNamespaceURI());
			System.err.println("Root\'s name: " + root.getLocalName());*/
			/*String prefix = root.getPrefix(); //String ns = (prefix == null) ? root.getNamespaceURI() : root.getNamespaceURI(prefix);
			System.err.println("Root\'s prefix: " + root.getPrefix());*/
	
			SparqlQueryRequest queryRequest = parseSoapQueryRequest(root);
			queryString = queryRequest.getQuery();
			SparqlQueryHandler queryHandler = new SparqlQueryHandler();
			SparqlQueryResult queryResult = queryHandler.handleQuery(queryRequest);
			
			addQueryResultWrapper(queryResult.getDocument());
			addSoapEnvelope(queryResult.getDocument());
			
			String xmlResult = SparqlQueryHandler.xmlToString(queryRequest.getQuery(), queryResult.getDocument()); 
				
			StringBuilder response = new StringBuilder();
			response.append(String.format("Query: \"%s\"\r\n", queryRequest.getQuery()));
			List<String> L = queryRequest.getDefaultGraphUris();
			response.append(String.format("DefaultGraphURIs: %d\r\n", L.size()));
			for (String s : L) response.append(String.format(" - \"%s\"\r\n", s));
			L = queryRequest.getNamedGraphUris();
			response.append(String.format("NamedGraphURIs: %d\r\n", L.size()));
			for (String s : L) response.append(String.format(" - \"%s\"\r\n", s));
			//response.append(String.format("Parsed by Jena: \"%s\"\r\n", query.toString()));
			response.append(String.format("Results as XML:\r\n"));
			response.append(xmlResult);
			response.append("End2.\r\n");
			
			System.err.println(response.toString());
			
			// ToDo...
		}
		catch (MalformedSparqlQueryException e) {
			testFaultMessage(queryString, true, e.getMessage());
		} catch (SparqlQueryRefusedException e) {
			testFaultMessage(queryString, false, e.getMessage());
		} catch (Exception e) {
			testFaultMessage(queryString, false, SparqlQueryHandler.getExceptionString(e));
		}
		/*
		catch (IOException e) { e.printStackTrace(System.err); }
		catch (SOAPException e) { e.printStackTrace(System.err); }
		*/
	}
	
}
