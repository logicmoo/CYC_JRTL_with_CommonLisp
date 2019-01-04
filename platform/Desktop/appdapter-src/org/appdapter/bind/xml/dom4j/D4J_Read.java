package org.appdapter.bind.xml.dom4j;

import org.dom4j.DocumentHelper;
import org.dom4j.Document;

public class D4J_Read
{
    public static Document wrapAndParseXmlText(final String xmlText, final String wrapperTagName) throws Throwable {
        final String rooted = "<" + wrapperTagName + ">" + xmlText + "</" + wrapperTagName + ">";
        final Document rootedDoc4J = DocumentHelper.parseText(rooted);
        return rootedDoc4J;
    }
}

/*

	Total time: 7 ms
	
*/