
package eu.larkc.plugins.reason.esa_ri.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.larkc.plugins.reason.esa_ri.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CorruptIndexException_QNAME = new QName("http://webservice.esa_ri.reason.plugins.larkc.eu/", "CorruptIndexException");
    private final static QName _ParseException_QNAME = new QName("http://webservice.esa_ri.reason.plugins.larkc.eu/", "ParseException");
    private final static QName _CreateRDFResponse_QNAME = new QName("http://webservice.esa_ri.reason.plugins.larkc.eu/", "createRDFResponse");
    private final static QName _GetNearestNeigbhoursForESA_QNAME = new QName("http://webservice.esa_ri.reason.plugins.larkc.eu/", "getNearestNeigbhoursForESA");
    private final static QName _GetNearestNeigbhoursForESAResponse_QNAME = new QName("http://webservice.esa_ri.reason.plugins.larkc.eu/", "getNearestNeigbhoursForESAResponse");
    private final static QName _GetResultsUsingRandomIndexing_QNAME = new QName("http://webservice.esa_ri.reason.plugins.larkc.eu/", "getResultsUsingRandomIndexing");
    private final static QName _GetResultsUsingRandomIndexingResponse_QNAME = new QName("http://webservice.esa_ri.reason.plugins.larkc.eu/", "getResultsUsingRandomIndexingResponse");
    private final static QName _CreateRDF_QNAME = new QName("http://webservice.esa_ri.reason.plugins.larkc.eu/", "createRDF");
    private final static QName _IOException_QNAME = new QName("http://webservice.esa_ri.reason.plugins.larkc.eu/", "IOException");
    private final static QName _GetResultsUsingEsaResponse_QNAME = new QName("http://webservice.esa_ri.reason.plugins.larkc.eu/", "getResultsUsingEsaResponse");
    private final static QName _GetResultsUsingEsa_QNAME = new QName("http://webservice.esa_ri.reason.plugins.larkc.eu/", "getResultsUsingEsa");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.larkc.plugins.reason.esa_ri.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CorruptIndexException }
     * 
     */
    public CorruptIndexException createCorruptIndexException() {
        return new CorruptIndexException();
    }

    /**
     * Create an instance of {@link ParseException }
     * 
     */
    public ParseException createParseException() {
        return new ParseException();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link GetNearestNeigbhoursForESA }
     * 
     */
    public GetNearestNeigbhoursForESA createGetNearestNeigbhoursForESA() {
        return new GetNearestNeigbhoursForESA();
    }

    /**
     * Create an instance of {@link GetNearestNeigbhoursForESAResponse }
     * 
     */
    public GetNearestNeigbhoursForESAResponse createGetNearestNeigbhoursForESAResponse() {
        return new GetNearestNeigbhoursForESAResponse();
    }

    /**
     * Create an instance of {@link GetResultsUsingRandomIndexingResponse }
     * 
     */
    public GetResultsUsingRandomIndexingResponse createGetResultsUsingRandomIndexingResponse() {
        return new GetResultsUsingRandomIndexingResponse();
    }

    /**
     * Create an instance of {@link GetResultsUsingRandomIndexing }
     * 
     */
    public GetResultsUsingRandomIndexing createGetResultsUsingRandomIndexing() {
        return new GetResultsUsingRandomIndexing();
    }

    /**
     * Create an instance of {@link HashMap }
     * 
     */
    public HashMap createHashMap() {
        return new HashMap();
    }

    /**
     * Create an instance of {@link CreateRDF }
     * 
     */
    public CreateRDF createCreateRDF() {
        return new CreateRDF();
    }

    /**
     * Create an instance of {@link GetResultsUsingEsa }
     * 
     */
    public GetResultsUsingEsa createGetResultsUsingEsa() {
        return new GetResultsUsingEsa();
    }

    /**
     * Create an instance of {@link CreateRDFResponse }
     * 
     */
    public CreateRDFResponse createCreateRDFResponse() {
        return new CreateRDFResponse();
    }

    /**
     * Create an instance of {@link GetResultsUsingEsaResponse }
     * 
     */
    public GetResultsUsingEsaResponse createGetResultsUsingEsaResponse() {
        return new GetResultsUsingEsaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorruptIndexException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.esa_ri.reason.plugins.larkc.eu/", name = "CorruptIndexException")
    public JAXBElement<CorruptIndexException> createCorruptIndexException(CorruptIndexException value) {
        return new JAXBElement<CorruptIndexException>(_CorruptIndexException_QNAME, CorruptIndexException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParseException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.esa_ri.reason.plugins.larkc.eu/", name = "ParseException")
    public JAXBElement<ParseException> createParseException(ParseException value) {
        return new JAXBElement<ParseException>(_ParseException_QNAME, ParseException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRDFResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.esa_ri.reason.plugins.larkc.eu/", name = "createRDFResponse")
    public JAXBElement<CreateRDFResponse> createCreateRDFResponse(CreateRDFResponse value) {
        return new JAXBElement<CreateRDFResponse>(_CreateRDFResponse_QNAME, CreateRDFResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNearestNeigbhoursForESA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.esa_ri.reason.plugins.larkc.eu/", name = "getNearestNeigbhoursForESA")
    public JAXBElement<GetNearestNeigbhoursForESA> createGetNearestNeigbhoursForESA(GetNearestNeigbhoursForESA value) {
        return new JAXBElement<GetNearestNeigbhoursForESA>(_GetNearestNeigbhoursForESA_QNAME, GetNearestNeigbhoursForESA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNearestNeigbhoursForESAResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.esa_ri.reason.plugins.larkc.eu/", name = "getNearestNeigbhoursForESAResponse")
    public JAXBElement<GetNearestNeigbhoursForESAResponse> createGetNearestNeigbhoursForESAResponse(GetNearestNeigbhoursForESAResponse value) {
        return new JAXBElement<GetNearestNeigbhoursForESAResponse>(_GetNearestNeigbhoursForESAResponse_QNAME, GetNearestNeigbhoursForESAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResultsUsingRandomIndexing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.esa_ri.reason.plugins.larkc.eu/", name = "getResultsUsingRandomIndexing")
    public JAXBElement<GetResultsUsingRandomIndexing> createGetResultsUsingRandomIndexing(GetResultsUsingRandomIndexing value) {
        return new JAXBElement<GetResultsUsingRandomIndexing>(_GetResultsUsingRandomIndexing_QNAME, GetResultsUsingRandomIndexing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResultsUsingRandomIndexingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.esa_ri.reason.plugins.larkc.eu/", name = "getResultsUsingRandomIndexingResponse")
    public JAXBElement<GetResultsUsingRandomIndexingResponse> createGetResultsUsingRandomIndexingResponse(GetResultsUsingRandomIndexingResponse value) {
        return new JAXBElement<GetResultsUsingRandomIndexingResponse>(_GetResultsUsingRandomIndexingResponse_QNAME, GetResultsUsingRandomIndexingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRDF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.esa_ri.reason.plugins.larkc.eu/", name = "createRDF")
    public JAXBElement<CreateRDF> createCreateRDF(CreateRDF value) {
        return new JAXBElement<CreateRDF>(_CreateRDF_QNAME, CreateRDF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.esa_ri.reason.plugins.larkc.eu/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResultsUsingEsaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.esa_ri.reason.plugins.larkc.eu/", name = "getResultsUsingEsaResponse")
    public JAXBElement<GetResultsUsingEsaResponse> createGetResultsUsingEsaResponse(GetResultsUsingEsaResponse value) {
        return new JAXBElement<GetResultsUsingEsaResponse>(_GetResultsUsingEsaResponse_QNAME, GetResultsUsingEsaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResultsUsingEsa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.esa_ri.reason.plugins.larkc.eu/", name = "getResultsUsingEsa")
    public JAXBElement<GetResultsUsingEsa> createGetResultsUsingEsa(GetResultsUsingEsa value) {
        return new JAXBElement<GetResultsUsingEsa>(_GetResultsUsingEsa_QNAME, GetResultsUsingEsa.class, null, value);
    }

}
