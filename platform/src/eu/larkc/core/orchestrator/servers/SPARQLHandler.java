package eu.larkc.core.orchestrator.servers;


import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.openrdf.model.BNode;
import org.openrdf.model.Literal;
import org.openrdf.model.Resource;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.model.impl.BNodeImpl;
import org.openrdf.model.impl.StatementImpl;
import org.openrdf.model.impl.URIImpl;
import org.openrdf.model.impl.ValueFactoryImpl;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import eu.larkc.core.Larkc;
import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.RdfGraph;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.data.iterator.SimpleCloseableIterator;
import eu.larkc.core.qos.QoSParameters;
import eu.larkc.core.query.SPARQLQueryImpl;
import eu.larkc.core.query.TriplePatternQuery;

/**
 * Encapsulates the data of a SPARQL query request, as described
 * in sec. 2.1.2 of the SPARQL Protocol for RDF.
 * 
 * @author Janez Brank
 */
class SparqlQueryRequest
{
	protected String query;
	/**
	 * Note: the default graph for the query is just one, but several defaulkt
	 * graph URIs may be provided.  In this case the default graph is "composed
	 * by the RDF merge of the RDC graphs identified by" the graph URIs.
	 */
	protected ArrayList<String> defaultGraphUris; // 0 or more
	protected ArrayList<String> namedGraphUris; // 0 or more
	
	public SparqlQueryRequest()
	{
		query = null; 
		defaultGraphUris = new ArrayList<String>();
		namedGraphUris = new ArrayList<String>();
	}
	
	public String getQuery() { return query; }
	public void setQuery(String query_) { query = query_; }
	
	public void addNamedGraphUri(String s) { namedGraphUris.add(s); }
	public void addDefaultGraphUri(String s) { defaultGraphUris.add(s); }
	public List<String> getDefaultGraphUris() { return defaultGraphUris; }
	public List<String> getNamedGraphUris() { return namedGraphUris; }
}

class SparqlException extends Exception
{
	private static final long serialVersionUID = 1L;
	public SparqlException(String message)
	{
		super(message);
	}
}

class MalformedSparqlQueryException extends SparqlException
{
	private static final long serialVersionUID = 1L;
	public MalformedSparqlQueryException(String message)
	{
		super(message);
	}
}

class SparqlQueryRefusedException extends SparqlException
{
	private static final long serialVersionUID = 1L;
	public SparqlQueryRefusedException(String message)
	{
		super(message);
	}
}

class SimpleQoSParameters implements QoSParameters
{
	public int getRequiredNumberOfAnswers() { return 1000; }
	public long getMaximumRuntime() { return 60; }
}

class Pair<Left, Right> {
	 
    private final Left left;
    private final Right right;
 
    public Right getRight() { return right; }
    public Left getLeft() { return left; }
 
    public Pair(final Left left_, final Right right_) {
        left = left_; right = right_; }
    
    public static <A, B> Pair<A, B> create(A left, B right) {
        return new Pair<A, B>(left, right); }
 
    public final boolean equals(Object o) {
        if (!(o instanceof Pair)) return false;
        final Pair<?, ?> other = (Pair) o;
        return equal(getLeft(), other.getLeft()) && equal(getRight(), other.getRight());
    }
    
    public static final boolean equal(Object o1, Object o2) {
        if (o1 == null) return o2 == null;
        else return o1.equals(o2); }
 
    public int hashCode() {
        int a = getLeft() == null ? 0 : getLeft().hashCode();
        int b = getRight() == null ? 0 : getRight().hashCode();
 
        long s = ((long) a) + b;
        s = ((s * (s + 1)) >> 1) + a;
        s %= 0x7fffffffL;
        if (s < 0) s = -s; if (s < 0) s = 0;
        return (int) s;
    }
}

/**
 * This class provides functionality to present the results of a SPARQL
 * query in XML format, as described in
 * http://www.w3.org/2001/sw/DataAccess/rf1/
 * andhttp://www.w3.org/TR/2008/REC-rdf-sparql-XMLres-20080115/
 * @author janez
 *
 */
class SparqlResultFormatter
{
	DocumentBuilderFactory factory;
	DocumentBuilder builder;
	Document doc;
	Element root;
	// see http://www.w3.org/2001/sw/DataAccess/rf1/#defn-srd , sec. 2.1
	public final String sparqlNsPref = "vbr"; // same as used in sec. 1 of the SPARQL protocol spec 
	public final String sparqlNsUri = "http://www.w3.org/2005/sparql-results#";
	
	public Document getDocument() { return doc; }
	
	public SparqlResultFormatter() throws ParserConfigurationException
	{
		factory = DocumentBuilderFactory.newInstance();
		builder = factory.newDocumentBuilder();
		doc = builder.newDocument();
	}

	/**
	 * Creates a root element <sparql> and adds it to the document 'doc'.
	 * This root element is needed in the responses to SELECT and ASK queries
	 * (but not CONSTRUCT or DESCRIBE queries, which use <rdf:RDF>).
	 */
	public void buildSparqlRoot()
	{
		root = doc.createElementNS(sparqlNsUri, sparqlNsPref + ":sparql");
		setXmlnsAttribute(root, sparqlNsPref, sparqlNsUri);
		doc.appendChild(root);
	}
	
	public org.w3c.dom.Element buildHeadElement(List<String> variableNames)
	{
		Element head = doc.createElementNS(sparqlNsUri, sparqlNsPref + ":head");
		if (variableNames != null)
			for (String variableName : variableNames)
			{
				Element elt = doc.createElementNS(sparqlNsUri, sparqlNsPref + ":variable");
				elt.setAttributeNS(sparqlNsUri, sparqlNsPref + ":name", variableName);
				head.appendChild(elt);
			}
		return head;
	}

	/**
	 * Fills a <binding> element with content, depending on the RDF term given by 'value'.
	 * This implements sec. 2.3.1 of http://www.w3.org/2001/sw/DataAccess/rf1/#defn-srd .
	 * @param bindingElt  The XML element to be augmented.
	 * @param value  The RDF term that we want to represent in XML.
	 * @throws SparqlException  If 'value' is neither a blank node, nor an IRI, nor a literal. 
	 */
	void fillBindingElement(Element bindingElt, Value value) throws SparqlException
	{ 
		if (value instanceof BNode)
		{
			Element bnode = doc.createElementNS(sparqlNsUri, sparqlNsPref + ":bnode");
			BNode i = (BNode) value;
			bnode.appendChild(doc.createTextNode(i.getID()));
			bindingElt.appendChild(bnode);
		}
		else if (value instanceof URI)
		{
			Element uri = doc.createElementNS(sparqlNsUri, sparqlNsPref + ":uri");
			URI i = (URI) value;
			uri.appendChild(doc.createTextNode(i.stringValue()));
			bindingElt.appendChild(uri);
		}
		else if (value instanceof Literal)
		{
			Element lit = doc.createElementNS(sparqlNsUri, sparqlNsPref + ":literal");
			
			Literal i = (Literal)value; 

			if (i.getDatatype() != null) 
				lit.setAttributeNS(sparqlNsUri, sparqlNsPref + ":datatype", i.getDatatype().stringValue());
			else {
				String lang = i.getLanguage();
				if (lang != null && lang.length() > 0)
					lit.setAttribute("xml:lang", lang);
			}
			lit.appendChild(doc.createTextNode(i.getLabel()));
			bindingElt.appendChild(lit);
		}
		else
			throw new SparqlQueryRefusedException("Invalid RDF term appears in the result set: claims to be neither an IRI, nor a literal, nor a blank node.");
	}

	/**
	 * Creates a <result> element containing a <binding name="...">...</binding>
	 * child for each value.
	 * @param variableNames  A list of variable names, for use in the "name" attributes.
	 * @param values  A list of corresponding values.  'values' and 'variableNames' should have the same number of elements and in the same order.
	 * @return The new <result> element.
	 * @throws SparqlException  If thrown by fillBindingElement when a RDF term doesn't say what kind of term it is. 
	 */
	org.w3c.dom.Element buildResultElement(ArrayList<String> variableNames, List<Value> values) throws SparqlException
	{
		// A binding is a pair (variable, RDF term).    http://www.w3.org/TR/rdf-sparql-query/ sec 1.2.3
		// An RDF term can be [ibid. sec. 12.1.1]:
		// - an IRI
		// - a blank node of an RDF graph
		// - an RDF literal, which can be:  [http://www.w3.org/TR/2004/REC-rdf-concepts-20040210/#dfn-literal]
		//   - a plain literal (= lexical form + optionally a language tag)
		//   - a typed literal (= lexical form + a datatype URI)
		// A lexical form, language tag, and datatype URI are unicode strings.
		Element result = doc.createElementNS(sparqlNsUri, sparqlNsPref + ":result");
		if (values != null)
		{
			int i = 0;
			for (Value value : values)
			{
				// "If, for a particular solution, a variable is unbound, no binding element for that variable is included in the result element."
				// http://www.w3.org/2001/sw/DataAccess/rf1/#defn-srd sec. 2.3.1
				if (value != null)
				{
					Element binding = doc.createElementNS(sparqlNsUri, sparqlNsPref + ":binding");
					binding.setAttributeNS(sparqlNsUri, sparqlNsPref + ":name", variableNames.get(i));
					fillBindingElement(binding, value);
					result.appendChild(binding);
				}
				i++;
			}
		}
		return result;
	}
	
	/** 
	 * Creates an XML <results> element for the results of a SELECT query.
	 * The new element is appended as a child of 'this.root'.
	 * @param results The list of results to be converted to XML.  If there are several VariableBinding instances, they should all be using the same set of variables, because we can produce only one <head> with the list of variable names in our output.  
	 * @throws SparqlException may be thrown by fillBindingElement if some RDF term doesn't say what kind of term it is 
	 */
	public void buildSelectResults(VariableBinding binding) throws SparqlException
	{
		if (/*results*/binding == null) return;
		boolean first = true;
		Element resultsElt = doc.createElementNS(sparqlNsUri, sparqlNsPref + ":results");
		//for (VariableBinding binding : results)
		//{
			ArrayList<String> variableNames = new ArrayList<String>();
			for (String variableName : binding.getVariables()) variableNames.add(variableName);
			//
			if (first) 
			{
				Element head = buildHeadElement(binding.getVariables());
				root.appendChild(head);
				first = false;
			}
			Iterator<VariableBinding.Binding> it = binding.iterator();
			while (it.hasNext())
			{
				VariableBinding.Binding bind = it.next();
				Element result = buildResultElement(variableNames, bind.getValues());
				resultsElt.appendChild(result);
			}
		//}
		root.appendChild(resultsElt);
	}
	
	/**
	 * Creates an XML <boolean> element containing the value of 'results',
	 * and appends this new element as a child of 'this.root'.
	 * @param results The value to be stored inside the <boolean> element.
	 */
	public void buildAskResults(boolean results)
	{
		Element resultsElt = doc.createElementNS(sparqlNsUri, sparqlNsPref + ":boolean");
		resultsElt.appendChild(doc.createTextNode(results ? "true" : "false"));
		root.appendChild(resultsElt);
	}
	
	final String rdfNamespaceUri = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
	final String rdfNamespacePref = "rdf";
	final String xmlns = javax.xml.XMLConstants.XMLNS_ATTRIBUTE;

	//	[4] NameStartChar ::= ":" | [A-Z] | "_" | [a-z] | [#xC0-#xD6] | [#xD8-#xF6] | [#xF8-#x2FF] 
	//                      | [#x370-#x37D] | [#x37F-#x1FFF] | [#x200C-#x200D] | [#x2070-#x218F]  
	//                      | [#x2C00-#x2FEF] | [#x3001-#xD7FF] | [#xF900-#xFDCF] | [#xFDF0-#xFFFD]
	//                      | [#x10000-#xEFFFF]
	public static boolean isNameStartChar(char c)
	{
		if (c == ':' || ('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z') || c == '_') return true;
		int i = (int) c;
		if (0xc0 <= i && i <= 0x2ff) return (c != 0xd7) && (c != 0xf7);
		if (0x370 <= i && i <= 0x1fff) return (c != 0x37e);
		if (0x200c <= i && i <= 0x200d) return true;
		if (0x2070 <= i && i <= 0x218f) return true;
		if (0x2c00 <= i && i <= 0x2fef) return true;
		if (0x3001 <= i && i <= 0xd7ff) return true;
		if (0xf900 <= i && i <= 0xfdcf) return true;
		if (0xfdf0 <= i && i <= 0xfffd) return true;
		if (0x10000 <= i && i <= 0xeffff) return true;
		return false;
	}

	// [4a] NameChar ::= NameStartChar | "-" | "." | [0-9] | #xB7 | [#x0300-#x036F] | [#x203F-#x2040]
	public static boolean isNameChar(char c)
	{
		if (c == '_' || c == '.' || ('0' <= c && c <= '9')) return true;
		if (isNameStartChar(c)) return true;
		int i = (int) c;
		if (i == 0xb7 || (0x300 <= i && i <= 0x36f) || (0x203f <= i && i <= 0x2040)) return true;
		return false;
	}

	/**
	 * The 'predicate' part of an RDF triple is identified by an IRI or URI;
	 * on the other hand, representing RDF in XML requires us to use the predicate
	 * as the name of an XML element or attribute.  Nor every IRI is a valid XML
	 * element/attribute name.  This class provides a method that, given
	 * a predicate IRI, looks for the longest suffix that could be an XML name;
	 * the previous part is then treated as a namespace URI, a suitable
	 * namespace prefix is assigned to it, and an 'xmlns:...' attribute is
	 * added to the root element of the XML document.
	 * 
	 * @author janez
	 */
	static class NamespaceManager
	{
		HashMap<String, String> uriToPrefix;
		Element rootElt; // the element to which we add 'xmlns:...' attributes for the namespaces that we came up with
		int counter; // our namespace prefixes are named 'ns1', 'ns2', etc.
		
		public NamespaceManager(Element rootElt_) {
			uriToPrefix = new HashMap<String, String>();
			rootElt = rootElt_;
			counter = 0;
		}
		
		static class QName
		{
			public String nsUri;
			public String nsPref;
			public String localName;
			public QName(String nsUri_, String nsPref_, String localName_) {
				nsUri = nsUri_; nsPref = nsPref_; localName = localName_; }
			public boolean hasPref() { return nsPref != null && nsPref.length() > 0; }
			public String getQName() { return nsPref + ":" + localName; }
		}
		
		public QName processName(String name)
		{
			// For the local name, we'll take the longest suffix of 'name'
			// that can be used as the name of an XML attribute or element.
			// The part of the name before that is the namespace URI.
			int n = name.length();
			int i, localFrom = n;
			for (i = n - 1; i >= 0; i--)
			{
				char c = name.charAt(i);
				if (c == ':') break;
				if (isNameStartChar(c)) { localFrom = i; continue; }
				if (! isNameChar(c)) break;
			}
			String localName = name.substring(localFrom);
			String nsUri = name.substring(0, localFrom);
			// If we don't have a prefix for this URI yet, we'll create one now. 
			String nsPref = uriToPrefix.get(nsUri);
			if (nsPref == null) {
				++counter; nsPref = "ns" + Integer.toString(counter);
				uriToPrefix.put(nsUri, nsPref);
				// Add an xmlns:... attribute to the root element.  This ensures
				// that when we latter use this namespace deeper inside the tree
				// (using setAttributeNS / createElementNS), there won't be any duplicate
				// xmlns:... attributes scattered around the tree.
				setXmlnsAttribute(rootElt, nsPref, nsUri);
			}
			return new QName(nsUri, nsPref, localName);
		}
	}
	
	public static void setXmlnsAttribute(Element element, String nsPref, String nsUri)
	{
		element.setAttributeNS(
				javax.xml.XMLConstants.XMLNS_ATTRIBUTE_NS_URI,
				javax.xml.XMLConstants.XMLNS_ATTRIBUTE + ":" + nsPref, 
				nsUri);
	}
	
	/**
	 * Creates an <rdf:RDF> element and suitable subelements to 
	 * store statements of the given RDF graph.  The new <rdf:RDF> element
	 * becomes the root of 'this.doc'.
	 * 
	 * If the terms in the RDF graph report us full URI references,
	 * e.g. "http://purl.org/dc/elements/1.1/#title", this means that we
	 * cannot directly use them as names of XML elements in the output XML document;
	 * in this case we use the NamespaceManager class to generate namespace
	 * prefixes and convert a URI reference like this into a qname such as "ns1:title", 
	 * and add 'xmlns:ns1="http://purl.org/dc/elements/1.1/"' to the root <rdf:RDF> element.
	 * 
	 * ToDo: if, on the other hand, it turns out that the terms in the RDF graph return, as URI
	 * references, strings of the form "dc:title", then we need a mechanism
	 * to find out what base URI each prefix refers to, so that we can add
	 * corresponding 'xmlns:...' attributes to the root <rdf:RDF> element.
	 * 
	 * @param graph
	 */
	public void buildRdf(SetOfStatements stats) throws SparqlException
	{
		Element rdfElt = doc.createElementNS(rdfNamespaceUri, rdfNamespacePref + ":RDF");
		setXmlnsAttribute(rdfElt, rdfNamespacePref, rdfNamespaceUri);
		root = rdfElt; doc.appendChild(rdfElt);
		//rdfElt.setAttribute(xmlns + ":" + rdfNamespacePref, rdfNamespaceUri);
		NamespaceManager nsMgr = new NamespaceManager(rdfElt);
		
		HashMap<String, Element> iriSubjElts = new HashMap<String, Element>();
		HashMap<String, Element> blankSubjElts = new HashMap<String, Element>();
		HashMap<Pair<String, String>, Attr> iriPropAttrs = new HashMap<Pair<String,String>, Attr>();
		HashMap<Pair<String, String>, Attr> blankPropAttrs = new HashMap<Pair<String,String>, Attr>();
		
		CloseableIterator<Statement> iter = stats.getStatements();
		while (iter.hasNext())
		{
			Statement stat = iter.next();
			Resource subject =  stat.getSubject();
			// Create a <rdf:about> element for this subject. 
			// If such an element already exists, reuse it.
			Element subjElt; String subjStr;
			HashMap<Pair<String, String>, Attr> propAttrs;
			if (subject instanceof URI)
			{
				subjStr = subject.stringValue();
				subjElt = iriSubjElts.get(subjStr);
				propAttrs = iriPropAttrs;
				if (subjElt == null)
				{
					subjElt = doc.createElementNS(rdfNamespaceUri, rdfNamespacePref + ":Description");
					subjElt.setAttributeNS(rdfNamespaceUri, rdfNamespacePref + ":about", subjStr);
					rdfElt.appendChild(subjElt);
					iriSubjElts.put(subjStr, subjElt); 
				}
			}
			else if (subject instanceof BNode)
			{
				subjStr = ((BNode) subject).getID();
				subjElt = blankSubjElts.get(subjStr);
				propAttrs = blankPropAttrs;
				if (subjElt == null)
				{
					subjElt = doc.createElementNS(rdfNamespaceUri, rdfNamespacePref + ":Description");
					subjElt.setAttributeNS(rdfNamespaceUri, rdfNamespacePref + ":nodeID", subjStr);
					rdfElt.appendChild(subjElt);
					blankSubjElts.put(subjStr, subjElt); 
				}
			}
			else
				throw new SparqlQueryRefusedException("The query resulted in an invalid RDF graph.  A subject claims to be neither an IRI node nor a blank node.");
			// Determine the name of the predicate.
			// - ToDo: if this predicate appears just once for this subject,
			//   and if the corresponding object is a plain literal with the same
			//   language as the parent element, then it could be represented by
			//   an attribute rather than a subelement.
			URI predicate = stat.getPredicate();
			String predStr;
			predStr = predicate.stringValue();
			//if (predicate.isIRI())
			//	predStr = ((RdfIriNode) predicate).getIRI();
			//else
			//	throw new SparqlQueryRefusedException("The query resulted in an invalid RDF graph.  A predicate claims to be something else than an IRI.");
			NamespaceManager.QName predQName = nsMgr.processName(predStr);
			// Do we need a subelement for this predicate?  If the object is
			// a plain literal without a language tag, we can make in an attribute instead of
			// a subelement.  However, only one attribute with this name can exist
			// for a given subject element.
			Value object = stat.getObject();
			Literal objLiteral = (object instanceof Literal) ? ((Literal)object) : null;
			Pair<String, String> key = new Pair<String, String>(subjStr, predStr);
			boolean canBeAttr = false; 
			if ((! propAttrs.containsKey(key)) && objLiteral != null && ! (objLiteral.getDatatype() != null)) {
				String langTag = objLiteral.getLanguage();
				if (langTag == null || langTag.length() <= 0) canBeAttr = true; 
			}
			// If the new statement can be represented by an attribute, add it now.
			if (canBeAttr) {
				Attr attrNode;
				if (predQName.hasPref()) attrNode = doc.createAttributeNS(predQName.nsUri, predQName.getQName());
				else attrNode = doc.createAttribute(predQName.localName);
				attrNode.setValue(((Literal) object).getLanguage());
				//subjElt.appendChild(attrNode);
				if (predQName.hasPref()) subjElt.setAttributeNodeNS(attrNode);
				else subjElt.setAttributeNode(attrNode);
				propAttrs.put(key, attrNode);
			}
			// Otherwise, we'll create a new subelement.
			else {
				Element predElt;
				if (predQName.hasPref()) predElt = doc.createElementNS(predQName.nsUri, predQName.getQName()); 
				else predElt = doc.createElement(predQName.localName);
				subjElt.appendChild(predElt);
				// Now store the object information in the new subelement.
				if (object instanceof URI)
				{
					String objIri = ((URI) object).stringValue();
					predElt.setAttributeNS(rdfNamespaceUri, rdfNamespacePref + ":resource", objIri);
				}
				else if (object instanceof BNode)
				{
					String objId = ((BNode) object).getID();
					predElt.setAttributeNS(rdfNamespaceUri, rdfNamespacePref + ":nodeID", objId);
				}
				else if (object instanceof Literal)
				{
					Literal objLit = (Literal) object;
					if (objLit.getDatatype() != null)
						predElt.setAttributeNS(rdfNamespaceUri, rdfNamespacePref + ":datatype", objLit.getDatatype().stringValue());
					else
					{
						String langTag = objLit.getLanguage();
						boolean hasLang = (langTag != null && langTag.length() > 0);
						boolean knownBefore = propAttrs.containsKey(key);
						if (! (hasLang || knownBefore))
							
							predElt.setAttribute("xml:lang", langTag);
					}
					predElt.appendChild(doc.createTextNode(objLit.getLabel()));
				}
				else
					throw new SparqlQueryRefusedException("The query resulted in an invalid RDF graph.  An object claims to be something else than an IRI node, blank node, or literal.");
			}
		}
		iter.close();
	}
}

class SparqlTest  
{

	/*static class MyRdfIri implements RdfIriNode
	{
		String iri;
		public MyRdfIri(String iri_) { iri = iri_; }

		  public String getIRI() { return iri; }
		  public boolean isBlankNode() { return false; }
		  public boolean isIri() { return true; }
		  public boolean isLiteral() { return false; }
	}*/
	
	/*static class MyRdfBnode implements RdfBlankNode
	{
		String id;
		public MyRdfBnode(String id_) { id = id_; }

		  public String getId() { return id; }
		  public boolean isBlankNode() { return true; }
		  public boolean isIri() { return false; }
		  public boolean isLiteral() { return false; }
	}
	
	static class MyRdfLiteral implements RdfLiteral
	{
		String value, langTag, dataType; boolean typed;
		public MyRdfLiteral(String value_, String langTag_, String dataType_, boolean typed_) { 
			value = value_; langTag = langTag_; dataType = dataType_; typed = typed_; }
		public static MyRdfLiteral createTyped(String value, String dataType) {
			return new MyRdfLiteral(value, null, dataType, true); }
		public static MyRdfLiteral createPlain(String value) { return new MyRdfLiteral(value, null, null, false); }
		public static MyRdfLiteral createPlain(String value, String langTag) { return new MyRdfLiteral(value, langTag, null, false); }

		  public boolean isBlankNode() { return false; }
		  public boolean isIri() { return false; }
		  public boolean isLiteral() { return true; }
		  public String getDatatype() { return dataType; }
		  public String getLanguageTag() { return langTag; }
		  public String getLexicalForm() { return value; }
		  public boolean isTyped() { return typed; }
	}*/
	
	/*static class MyRdfStatement implements Statement
	{
		Resource context,subject;
		Value object;
		URI predicate;
		
		MyRdfStatement(Resource subject_, URI predicate_, Value object_) {
			subject = subject_; predicate = predicate_; object = object_; context = null; }

		  public Resource getContext() { return context; }
		  public Value getObject() { return object; }
		  public URI getPredicate() { return predicate; }
		  public Resource getSubject() { return subject; }
	}*/

	static class MyRdfGraph implements RdfGraph
	{
		private static final long serialVersionUID = 1L;
		String name;
		List<Statement> statements;
	
		public String getStringName() { return name; }
		public Iterator<Statement> iterator() { return statements.iterator(); }
		
		MyRdfGraph(String name_, Statement... statements_) { 
			name = name_; statements = new ArrayList<Statement>();
			for (Statement stat : statements_) statements.add(stat);
		}

		// Returns the graph from http://www.w3.org/TR/rdf-syntax-grammar/ sec. 2.2.
		public static MyRdfGraph createGraph1()
		{
			final String dc = "http://purl.org/dc/elements/1.1/#";
			final String ex = "http://example.org/stuff/1.0/";
			final String blank1 = "blankTralala01";                    //Resource subject_, URI predicate_, Value object_
		
			return new MyRdfGraph("graph1",
				new StatementImpl( 
		            new URIImpl("http://www.w3.org/TR/rdf-syntax-grammar"),
					new URIImpl(dc + "title"),
					ValueFactoryImpl.getInstance().createLiteral("RDF/XML Syntax Specification (Revised)")),  //MyRdfLiteral.createPlain("RDF/XML Syntax Specification (Revised)")),
				new StatementImpl( 
				   	new URIImpl("http://www.w3.org/TR/rdf-syntax-grammar"),
				   	new URIImpl(ex + "editor"),
					new BNodeImpl(blank1)),	
				new StatementImpl( 
					new BNodeImpl(blank1),
					new URIImpl(ex + "homePage"),
					ValueFactoryImpl.getInstance().createLiteral("Dave Beckett")),		
				new StatementImpl( 
					new BNodeImpl(blank1),
					new URIImpl(ex + "homePage"),
					new URIImpl("http://purl.org/net/dajobe/"))
			);
		}
		 
		public URI getName() {
			throw new UnsupportedOperationException();
		}
		 
		public CloseableIterator<Statement> getStatements() {
			throw new UnsupportedOperationException();
		}
		
		public CloseableIterator<Statement> search(TriplePatternQuery quer) {
			throw new UnsupportedOperationException();
		}
	}

	static class MyTestVariableBinding implements VariableBinding
	{
		private static final long serialVersionUID = 1L;
		ArrayList<String> variables;
		ArrayList<Binding> bindings;
		
		public MyTestVariableBinding()
		{
			final String xsd = "http://www.w3.org/2001/XMLSchema#";
			variables = new ArrayList<String>();
			variables.add("book");
			variables.add("who");
			bindings = new ArrayList<Binding>();
			bindings.add(new MyTestBinding(
					new URIImpl("http://www.eample/book/book5"),
					ValueFactoryImpl.getInstance().createLiteral("123", new URIImpl(xsd + "integer"))
					));
			bindings.add(new MyTestBinding(
					ValueFactoryImpl.getInstance().createLiteral("One two three four"),
					ValueFactoryImpl.getInstance().createLiteral("Ena dve tri \u0161tiri", "si")
					));
			bindings.add(new MyTestBinding(
					new BNodeImpl("9876"),
					new BNodeImpl("9877")
					));
		}
		
		 public List<String> getVariables() { return variables; }
		 public CloseableIterator<Binding> iterator() { return new SimpleCloseableIterator<Binding>( bindings.iterator()); }
		
		static class MyTestBinding implements VariableBinding.Binding 
		{
			ArrayList<Value> values;
			
			MyTestBinding(Value... values_) 
			{ 
				values = new ArrayList<Value>();
				for (Value value : values_) values.add(value); 
			}
			
			public List<Value> getValues() {
				return values;
			}
		}
	}
}

class SparqlQueryResult
{
	String contentType;
	Document document;
	public String getContentType() { return contentType; }
	public void setContentType(String contentType_) { contentType = contentType_; }
	public Document getDocument() { return document; }
	public void setDocument(Document document_) { document = document_; }
}

class SparqlQueryHandler
{
	public static String getExceptionString(Exception e)
	{
		if (e == null) return null;
		StringBuilder buf = new StringBuilder();
		buf.append(e.toString());
		StackTraceElement[] ste = e.getStackTrace();
		if (ste != null) for (StackTraceElement st : ste) buf.append("\r\n - " + st.toString());
		return buf.toString();
	}

	public SparqlQueryResult handleQuery(SparqlQueryRequest queryRequest) throws SparqlException
	{
		// Parse the query.
		/*
		com.hp.hpl.jena.query.Query query;
		try {query = com.hp.hpl.jena.query.QueryFactory.create(queryRequest.getQuery()); } 
		catch (com.hp.hpl.jena.query.QueryException e) {
			throw new MalformedSparqlQueryException("Error parsing the query \"" + queryRequest.getQuery() + "\".  " + e.toString()); }
		*/
		String queryString = queryRequest.getQuery(); 
		SPARQLQueryImpl query = null;
		try { query = new SPARQLQueryImpl(queryString); }
		catch (Exception e) {
			throw new MalformedSparqlQueryException("Error parsing the query \"" + queryString + "\"." + e.getCause().getMessage()+ "\n"+ getExceptionString(e) ); }
		
		//CycDecider decider = new CycDecider();
		QoSParameters qosParams = null;//new SimpleQoSParameters();

		SparqlResultFormatter formatter;
		SparqlQueryResult queryResult = new SparqlQueryResult();
		try { formatter = new SparqlResultFormatter(); }
		catch (Exception e) { throw new SparqlQueryRefusedException("An error occurred while creating the XML formatter for the results of the query (\"" + queryString + "\"): " + e.toString()); }

		final boolean test = false;
		
		if (query.isSelect())
		{
			VariableBinding results;
			
			if (test)
			{
				//results = new Vector<VariableBinding>();
				results = new SparqlTest.MyTestVariableBinding();
			}
			else
			{
				try { results =   Larkc.sparqlSelect(query, qosParams); }
				catch (Exception e) { throw new SparqlQueryRefusedException("decider.sparqlSelect(\"" + queryString + "\") failed: " + getExceptionString(e)); }
				if (results == null) throw new SparqlQueryRefusedException("decider.sparqlSelect(\"" + queryString + "\") returns null.");
			}
			
			try { formatter.buildSparqlRoot(); formatter.buildSelectResults(results); }
			catch (SparqlException e) { throw e; }
			catch (Exception e) { throw new SparqlQueryRefusedException("An error occurred while formatting the results of the query (\"" + queryString + "\"): " + getExceptionString(e)); }
			queryResult.setContentType("application/sparql-results+xml");
			
		}
		else if (query.isAsk())
		{
			boolean results;
			
			if (test)
				results = false;
			else
			{
				BooleanInformationSet bis;
				try { bis = Larkc.sparqlAsk(query, qosParams); }
				catch (Exception e) { throw new SparqlQueryRefusedException("decider.sparqlAsk(\"" + queryString + "\") failed: " + getExceptionString(e)); }
				if (bis == null) throw new SparqlQueryRefusedException("decider.sparqlAsk(\"" + queryString + "\") returns null.");
				results = bis.getValue();
			}
			
			try { formatter.buildSparqlRoot(); formatter.buildAskResults(results); }
			catch (Exception e) { throw new SparqlQueryRefusedException("An error occurred while formatting the results of the query (\"" + queryString + "\"): " + getExceptionString(e)); }
			queryResult.setContentType("application/sparql-results+xml");
		}
		else if (query.isConstruct() || query.isDescribe())
		{
			SetOfStatements results;
			if (test)
				results = SparqlTest.MyRdfGraph.createGraph1();
			else if (query.isConstruct())
			{
				try { results = Larkc.sparqlConstruct(query, qosParams); }
				catch (Exception e) { throw new SparqlQueryRefusedException("decider.sparqlConstruct(\"" + queryString + "\") failed: " + getExceptionString(e)); }
			}
			else
			{
				try { results = Larkc.sparqlDescribe(query, qosParams); }
				catch (Exception e) { throw new SparqlQueryRefusedException("decider.sparqlDescribe(\"" + queryString + "\") failed: " + getExceptionString(e)); }
			}

			try { formatter.buildRdf(results); }
			catch (SparqlException e) { throw e; }
			catch (Exception e) { throw new SparqlQueryRefusedException("An error occurred while formatting the results of the query (\"" + queryString + "\"): " + getExceptionString(e)); }
			queryResult.setContentType("application/rdf+xml");
		}
		
		else
		{
			throw new SparqlQueryRefusedException("This query type is not supported (\"" + queryString + "\").");
		}
		
		queryResult.setDocument(formatter.getDocument());
		return queryResult;
		
	}
	
	public static String xmlToString(String query, Document doc) throws SparqlException
	{
		try
		{
			TransformerFactory transFac = TransformerFactory.newInstance();
			transFac.setAttribute("indent-number", new Integer(2)); // http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=6296446
			Transformer trans = transFac.newTransformer();
			trans.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
			trans.setOutputProperty(OutputKeys.STANDALONE, "yes");
			trans.setOutputProperty(OutputKeys.INDENT, "yes");
			DOMSource domSource = new DOMSource(doc);
			StringWriter stringWriter = new StringWriter();
			StreamResult streamResult = new StreamResult(stringWriter);
			trans.transform(domSource, streamResult);
			String xmlResult = stringWriter.toString();
			return xmlResult;
		} 
		catch (TransformerException e)
			{ throw new SparqlQueryRefusedException("An error occurred while formatting the results of the query (\"" + query + "\"): " + SparqlQueryHandler.getExceptionString(e)); }
		catch (Exception e)
		{ throw new SparqlQueryRefusedException("An error occurred while formatting the results of the query (\"" + query + "\"): " + SparqlQueryHandler.getExceptionString(e)); }
	
		
	}
}

/**
 * Simple HTTP Server Handler which is routed to SPARQLProtocol servlet
 */
public class SPARQLHandler implements HttpHandler {

	/**
	 * Parses an URL-encoded SPARQL query request, as described
	 * in sec. 2.2 of the SPARQL Protocol for RDF. 
	 * @param url The URL to be used in error messages.
	 * @param query The query part a URL, which is to be parsed.
	 * @return An instance of SparqlQueryRequest containing data extracted from the URL.
	 * @exception MalformedSparqlQueryException Thrown if the URL is malformed or does not contains exactly one 'query' parameter.
	 */
	SparqlQueryRequest parseGetUrl(java.net.URI url, String query) throws SparqlException
	{
		String[] parts = query.split("&");
		if (parts == null) throw new MalformedSparqlQueryException("The query part of the URL of the GET request is empty.");
		SparqlQueryRequest qr = new SparqlQueryRequest();
		boolean hasQuery = false;
		for (String part : parts)
		{
			int eq = part.indexOf('=');
			if (eq < 0) { System.err.println("Warning: no \'=\' sign in \"" + part + "\" in the URL \"" + url.toString() + "\"."); continue; }
			String rawName = part.substring(0, eq), rawValue = part.substring(eq + 1);
			String name, value;
			try {
				name = URLDecoder.decode(rawName, "UTF-8");
				value = URLDecoder.decode(rawValue, "UTF-8");
			} catch (UnsupportedEncodingException e) { throw new MalformedSparqlQueryException(e.toString()); }
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
	 * Sends a response with the given HTTP code and the given contents (encoded using UTF-8).
	 */
	void sendResponse(HttpExchange httpExchange, int httpCode, String contentType, String text) throws IOException
	{
		byte[] bytes;
		try { bytes = text.getBytes("UTF-8"); }
		catch (UnsupportedEncodingException e) { bytes = text.getBytes(); }
		Headers headers = httpExchange.getResponseHeaders();
		headers.add("Content-Type", contentType);
		httpExchange.sendResponseHeaders(httpCode, bytes.length);
		OutputStream os = httpExchange.getResponseBody();
		os.write(bytes);
		os.close();
	}

	/**
	 * Sends a text/plain response with the given HTTP code and
	 * the given contents (encoded using UTF-8).
	 */
	void sendErrorResponse(HttpExchange httpExchange, int httpCode, String text) throws IOException
	{
		sendResponse(httpExchange, httpCode, "text/plain; charset=UTF-8", text);
	}

	/**
	 * Implementation of only required method expected of an implementation of the HttpHandler 
	 * interface.
	 * 
	 * @param httpExchange Single-exchange HTTP request/response.
	 */
	public void handle(HttpExchange httpExchange) throws IOException {

		SparqlQueryRequest queryRequest = null;
		
		try
		{
			//SPARQLServlet.test();
			
			String method = httpExchange.getRequestMethod(); 
			java.net.URI uri = httpExchange.getRequestURI();
			System.out.println(method + " " + uri.toString() + " " + httpExchange.getProtocol());
			
			if (method.equals("GET"))
			{		
				
				/*
				Headers headers = httpExchange.getRequestHeaders();
				for (String key : headers.keySet()) {
					List <String> values = headers.get(key);
					System.out.println(key + ": " + values.toString()); }
					*/

				// Read, and discard, the request body; normally, it should be empty anyway.
				InputStream is = httpExchange.getRequestBody();
				int count = 0; byte[] buf = new byte[8192];
				while ((count = is.read(buf)) > 0)
				{
					System.err.println("SPARQLHandler.handle: Unexpected " + count + " bytes read from the body of a GET request.");
				}
				is.close();
				
				queryRequest = parseGetUrl(uri, uri.getRawQuery());
			}
			else if (method.equals("POST"))
			{
				Headers headers = httpExchange.getRequestHeaders();
				if (! headers.containsKey("Content-Type")) 
					throw new MalformedSparqlQueryException("The Content-Type header is missing.");
				String contentType = headers.getFirst("Content-Type");
				// ToDo: in principle, contentType might also equal "application/x-www-form-urlencoded; encoding=UTF-8" and it would still be valid.
				if (! contentType.equalsIgnoreCase("application/x-www-form-urlencoded"))
					throw new MalformedSparqlQueryException("Unsupported Content-Type in the HTTP request: \"" + contentType + "\".  Only application/x-www-form-urlencoded is supported.");
				
				// Read the body of the request.
				InputStream is = httpExchange.getRequestBody();
				/* Note: after a length debugging session, the following code seems to work correctly.
				 * However, it turns out that a class named InputStreamReader also exists and
				 * will do what we need.
				 * 
				// Initialize a UTF-8 decoder.
				Charset charset = Charset.forName("UTF-8");
				CharsetDecoder decoder = charset.newDecoder();
				final int capacity = 8192; // 9 // for testing
				byte[] buf = new byte[capacity];
				ByteBuffer byteBuf = ByteBuffer.allocate(capacity);
				CharBuffer charBuf = CharBuffer.allocate(capacity);
				StringBuilder reqBody = new StringBuilder();
				while (true)
				{
					// Note: byteBuf might not be empty at this point; it may contain
					// the first few bytes of an incomplete (and thus not yet decoded) multi-byte
					// representation of some character.
					int count = is.read(buf, 0, byteBuf.remaining());
					System.err.print(String.format("IN (%d): ", count)); for (int i = 0; i < count; i++) System.err.print(String.format(" %d ", (int) buf[i])); System.err.println();
					if (count < 0) count = 0;
					if (count == 0)
						System.err.print("!");
					byteBuf.put(buf, 0, count);
					byteBuf.flip();
					charBuf.clear();
					CoderResult result = decoder.decode(byteBuf, charBuf, (count == 0));
					System.err.print("OUT: "); System.err.print(String.format("(result = %s) ", result.toString()));
					charBuf.flip();
					for (int i = 0; i < charBuf.length(); i++) System.err.print(String.format(" %d ", (int) charBuf.charAt(i))); System.err.println(); 
					reqBody.append(charBuf.subSequence(0, charBuf.length()));
					byteBuf.compact();
					if (count == 0) break;
				}
				is.close();
				try {
					charBuf.clear();
					decoder.flush(charBuf);
					charBuf.flip();
					System.err.print("OUT after flush: "); 
					for (int i = 0; i < charBuf.length(); i++) System.err.print(String.format(" %d ", (int) charBuf.charAt(i))); System.err.println(); 
					reqBody.append(charBuf.subSequence(0, charBuf.length()));
				}
				catch (Exception e)
				{
					System.err.println(e.toString() + ": " + e.getMessage());
					e.printStackTrace(System.err);
				}
				*/
				StringBuilder reqBody = new StringBuilder();
				InputStreamReader isr = new InputStreamReader(is, "UTF-8");
				final int capacity = 8192; char[] buf = new char[capacity]; int count;
				while ((count = isr.read(buf, 0, capacity)) > 0)
					reqBody.append(buf, 0, count);
				isr.close();
				
				queryRequest = parseGetUrl(uri, reqBody.toString());
			}
			else
			{
				sendErrorResponse(httpExchange, HttpURLConnection.HTTP_BAD_METHOD, "Unsupported request method: \"" + method + "\".");
				return;
			}
			
			SparqlQueryHandler handler = new SparqlQueryHandler();
			SparqlQueryResult queryResult = handler.handleQuery(queryRequest); 
			
			String xmlResult = SparqlQueryHandler.xmlToString(queryRequest.getQuery(), queryResult.getDocument());
			
			// Send back the results.
			if (false)
			{
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
				sendErrorResponse(httpExchange, HttpURLConnection.HTTP_OK, response.toString());
			}
			else
				sendResponse(httpExchange, HttpURLConnection.HTTP_OK, queryResult.getContentType(), xmlResult);
			
		}
		catch (MalformedSparqlQueryException e)
		{
			// See the example in sec. 2.2.1.9 of the SPARQL Procotol for RDF.
			sendErrorResponse(httpExchange, HttpURLConnection.HTTP_BAD_REQUEST, "MalformedQuery: " + e.getMessage());
		}
		catch (SparqlQueryRefusedException e)
		{
			// See the example in sec. 2.2.1.10 of the SPARQL Procotol for RDF.
			sendErrorResponse(httpExchange, HttpURLConnection.HTTP_INTERNAL_ERROR, "QueryRequestRefused: " + e.getMessage());
		}
		catch (Exception e)
		{
			sendErrorResponse(httpExchange, HttpURLConnection.HTTP_INTERNAL_ERROR, SparqlQueryHandler.getExceptionString(e));
		}
		
		//System.out.println("REQUESTHEADER:" + httpExchange.getRequestHeaders().toString());
		
//		String requestMethod = httpExchange.getRequestMethod();
//	    if (requestMethod.equalsIgnoreCase("GET")) {
//	      Headers responseHeaders = httpExchange.getResponseHeaders();
//	      responseHeaders.set("Content-Type", "text/plain");
//	      httpExchange.sendResponseHeaders(200, 0);
//
//	      OutputStream responseBody = httpExchange.getResponseBody();
//	      Headers requestHeaders = httpExchange.getRequestHeaders();
//	      Set<String> keySet = requestHeaders.keySet();
//	      Iterator<String> iter = keySet.iterator();
//	      while (iter.hasNext()) {
//	        String key = iter.next();
//	        List values = requestHeaders.get(key);
//	        String s = key + " = " + values.toString() + "\n";
//	        responseBody.write(s.getBytes());
//	      }
//	      responseBody.close();
//	    }

		/*
		final String response = buildResponse();
		httpExchange.sendResponseHeaders(HttpURLConnection.HTTP_OK, response.length());
		final OutputStream os = httpExchange.getResponseBody();
		os.write(response.getBytes());
		os.close();
		*/
	}
}