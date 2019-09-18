package com.cyc.xml.query;

import java.io.InputStream;
import java.net.URL;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.validation.SchemaFactory;
import com.cyc.baseclient.xml.cycml.CycMLDecoder;

import com.cyc.baseclient.xml.Constants;

/**
 *
 * @author baxter
 */
public class FormulaTemplateUnmarshaller {

  private final javax.xml.bind.Unmarshaller unmarshaller;
  public static final String XSD_URI = Constants.XSD_HOME + "/formulatemplate.xsd";
  private boolean shouldValidate = true;

  public FormulaTemplateUnmarshaller() throws JAXBException {
    final String packages = CycMLDecoder.class.getPackage().getName()
            + ":" + CyclQueryUnmarshaller.class.getPackage().getName() + ":" 
            + this.getClass().getPackage().getName();
    this.unmarshaller = JAXBContext.newInstance(packages).createUnmarshaller();
    if (shouldValidate) {
      try {
        unmarshaller.setSchema(SchemaFactory.newInstance(
                XMLConstants.W3C_XML_SCHEMA_NS_URI).newSchema(
                new URL(XSD_URI)));
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  public Object unmarshal(final InputStream stream) throws JAXBException {
    return unmarshaller.unmarshal(stream);
  }
}
