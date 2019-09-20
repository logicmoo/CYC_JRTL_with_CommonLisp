package org.opencyc.justification;

import java.util.List;
import org.w3c.dom.Node;
import org.opencyc.inference.InferenceAnswer;

public interface Justification
{
    Node getRoot();
    
    void populate();
    
    InferenceAnswer getAnswer();
    
    void marshal(final org.w3c.dom.Node p0);
    
    public interface Node
    {
        String getHTML();
        
        String getCycLString();
        
        Object getCycL();
        
        List<? extends Node> getChildren();
        
        boolean isExpandInitially();
        
        void marshal(final org.w3c.dom.Node p0);
        
        int getDepth();
        
        Node getParent();
        
        String getLabel();
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 5 ms
	
	Decompiled with Procyon 0.5.32.
*/