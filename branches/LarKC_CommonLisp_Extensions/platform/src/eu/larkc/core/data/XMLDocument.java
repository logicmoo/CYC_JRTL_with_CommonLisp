package eu.larkc.core.data;

import java.net.URL;

/**
 * XMLDocument represents an XML document (not XML/RDF)
 * It allows to retrieve the content of a XML file (located with an URL) and its XSL transformation to
 * realize the conversion in RDF.
 * 
 * @author Daniele Dell'Aglio
 *
 */

public interface XMLDocument extends InformationSet {
	public String getDocument();
	public URL getXslt();
	public URL getURL();
	public String getGraphName();
	public void setGraphName(String gn);
	public void setXslt(URL url);
}
