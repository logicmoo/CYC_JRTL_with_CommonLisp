package org.opencyc.xml;

import org.w3c.dom.NodeList;
import java.util.StringTokenizer;
import org.w3c.dom.DOMException;
import org.w3c.dom.Node;

public class XpathComputer
{
    public static String localXpath(final Node node) throws DOMException {
        final String localname = node.getLocalName();
        if (null == localname) {
            throw new DOMException((short)8, "DOM Node doesn't have a local name!");
        }
        int position = 1;
        Node current;
        for (Node previous = node.getPreviousSibling(); null != previous; previous = current.getPreviousSibling()) {
            if (localname.equals(previous.getLocalName())) {
                ++position;
            }
            current = previous;
        }
        return localname + "[" + position + "]";
    }
    
    public static Node followLocalXpath(final Node start, final String localXpath) throws DOMException {
        final String startXpath = localXpath(start);
        if (startXpath.equals(localXpath)) {
            return start;
        }
        final StringTokenizer tokenizer = new StringTokenizer(localXpath, "[]");
        if (tokenizer.countTokens() != 2) {
            final String invalidXpath = localXpath + " is an invalid local Xpath!";
            throw new DOMException((short)12, invalidXpath);
        }
        final String tagname = tokenizer.nextToken();
        try {
            final Integer position = new Integer(tokenizer.nextToken());
            int counter = 1;
            final NodeList children = start.getChildNodes();
            for (int i = 0; i < children.getLength(); ++i) {
                final Node child = children.item(i);
                if (tagname.equals(child.getLocalName())) {
                    if (counter == position) {
                        return child;
                    }
                    ++counter;
                }
            }
        }
        catch (NumberFormatException excpt) {
            final String invalidXpath2 = localXpath + " is an invalid local Xpath!";
            throw new DOMException((short)12, invalidXpath2);
        }
        final String failed = "No node at location " + localXpath;
        throw new DOMException((short)8, failed);
    }
    
    public static String computeXpath(final Node node) {
        String Xpath = localXpath(node);
        if ("" == Xpath) {
            return Xpath;
        }
        for (Node parent = node.getParentNode(); null != parent.getLocalName(); parent = parent.getParentNode()) {
            final String moreXpath = localXpath(parent);
            Xpath = moreXpath + "/" + Xpath;
        }
        return "/" + Xpath;
    }
    
    public static Node followXpath(final Node start, final String Xpath) throws DOMException {
        final StringTokenizer tokenizer = new StringTokenizer(Xpath, "/");
        if (tokenizer.countTokens() == 0) {
            final String invalidXpath = Xpath + " is an invalid Xpath!";
            throw new DOMException((short)12, invalidXpath);
        }
        Node current = start;
        while (tokenizer.hasMoreTokens()) {
            final String localXpath = tokenizer.nextToken();
            current = followLocalXpath(current, localXpath);
        }
        return current;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 45 ms
	
	Decompiled with Procyon 0.5.32.
*/