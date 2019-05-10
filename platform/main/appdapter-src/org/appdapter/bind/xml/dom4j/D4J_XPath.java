package org.appdapter.bind.xml.dom4j;

import org.slf4j.LoggerFactory;
import org.dom4j.Node;
import org.dom4j.Element;
import org.slf4j.Logger;

public class D4J_XPath
{
    static Logger theLogger;
    
    public static Integer xpathIntValue(final Element dom4jElement, final String xpathExpr) {
        Integer result = null;
        try {
            final String stringVal = dom4jElement.valueOf(xpathExpr);
            D4J_XPath.theLogger.info("xpathIntValue[" + xpathExpr + "] found value: " + stringVal);
            if (stringVal != null && stringVal.length() > 0) {
                result = Integer.parseInt(stringVal);
            }
        }
        catch (Throwable t) {}
        return result;
    }
    
    public static String xpathStringValue(final Element dom4jElement, final String xpathExpr) {
        String result = null;
        try {
            final String stringVal = dom4jElement.valueOf(xpathExpr);
            if (stringVal != null && stringVal.length() > 0) {
                result = stringVal;
            }
        }
        catch (Throwable t) {}
        return result;
    }
    
    public static Integer getOptionalIntegerValueAtXPath(final Node dom4JDoc, final String xpath) throws Throwable {
        Integer result = null;
        final String val = dom4JDoc.valueOf(xpath);
        if (val != null && val.length() > 0) {
            result = Integer.parseInt(val);
        }
        return result;
    }
    
    static {
        D4J_XPath.theLogger = LoggerFactory.getLogger((Class)D4J_XPath.class);
    }
}

/*

	Total time: 22 ms
	
*/