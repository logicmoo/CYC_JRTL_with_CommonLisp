package com.cyc.xml.query;

import java.io.InputStream;
import java.net.URL;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

//import org.opencyc.xml.Constants;
import com.cyc.baseclient.xml.Constants;

import com.cyc.baseclient.xml.cycml.CycMLDecoder;
import org.xml.sax.SAXParseException;

/**
 *
 * @author baxter
 */
public class CyclQueryUnmarshaller {

    private final javax.xml.bind.Unmarshaller unmarshaller;
    public static final String XSD_URI = Constants.XSD_HOME + "/cyclquery.xsd";
    private boolean shouldValidate = true;

    public CyclQueryUnmarshaller() throws JAXBException {
        final String packages = CycMLDecoder.class.getPackage().getName() + ":"
                + this.getClass().getPackage().getName();
        this.unmarshaller = JAXBContext.newInstance(packages).createUnmarshaller();
        if (shouldValidate) {
            try {
                final SchemaFactory schemaFactory = SchemaFactory.newInstance(
                        XMLConstants.W3C_XML_SCHEMA_NS_URI);
                final URL cyclQueryUrl = new URL(XSD_URI);
                final Schema schema = schemaFactory.newSchema(cyclQueryUrl);
                unmarshaller.setSchema(schema);
            } catch (SAXParseException e) {
                // Means file wasn't found.
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Object unmarshal(final InputStream stream) throws JAXBException {
        return unmarshaller.unmarshal(stream);
    }
}
