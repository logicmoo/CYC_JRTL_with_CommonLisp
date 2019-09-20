package org.opencyc.xml;

import org.w3c.dom.DOMException;
import org.w3c.dom.Node;
import org.w3c.dom.traversal.NodeFilter;

public class NameNodeFilter implements NodeFilter
{
    private String tagname;
    
    public NameNodeFilter(final String tag) {
        this.tagname = tag;
    }
    
    public void setTagName(final String tag) {
        this.tagname = tag;
    }
    
    public String getTagName() {
        return this.tagname;
    }
    
    @Override
    public short acceptNode(final Node node) throws DOMException {
        final String name = node.getLocalName();
        if (null == name) {
            throw new DOMException((short)8, "DOM Node doesn't have a local name!");
        }
        if (this.tagname.equals(name)) {
            return 1;
        }
        if (node.hasChildNodes()) {
            return 3;
        }
        return 2;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 21 ms
	
	Decompiled with Procyon 0.5.32.
*/