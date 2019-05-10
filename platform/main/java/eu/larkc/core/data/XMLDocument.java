/*
   This file is part of the LarKC platform 
   http://www.larkc.eu/

   Copyright 2010 LarKC project consortium

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
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
