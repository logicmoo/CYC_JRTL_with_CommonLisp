package eu.larkc.plugin.reason.DIGReasoner;

/*
 * Copyright (c) 2009 License_Type (if there is a Copyright, please enter it here)
 * 
 * Licensed under the XXX License, Version X.X (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.copyofthelicense.org/licenses/LICENSE-X.X
 * 
 * If there is additional text which is related to licensing issues,
 * please enter it here. You can Copy and Paste the author and licensing issues
 * from the SourceCode file.
 * 
 * Information about authors: 
 * 
 * Zhisheng Huang (huang@few.vu.nl), Vrije Universiteit Amsterdam 
 * 
 */



import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class TreeDumper {
    public void dump(Document doc) {
        dumpLoop((Node)doc,"");
    }
    private void dumpLoop(Node node,String indent) {
    	Logger log = LoggerFactory.getLogger(TreeDumper.class);
        switch(node.getNodeType()) {
        case Node.CDATA_SECTION_NODE:
        	log.info(indent + "CDATA_SECTION_NODE:"+ node.toString());
            break;
        case Node.COMMENT_NODE:
        	log.info(indent + "COMMENT_NODE: "+node.toString());
            break;
        case Node.DOCUMENT_FRAGMENT_NODE:
        	log.info(indent + "DOCUMENT_FRAGMENT_NODE"+node.toString());
            break;
        case Node.DOCUMENT_NODE:
        	log.info(indent + "DOCUMENT_NODE:"+node.toString());
            break;
        case Node.DOCUMENT_TYPE_NODE:
        	log.info(indent + "DOCUMENT_TYPE_NODE"+node.toString());
            break;
        case Node.ELEMENT_NODE:
        	log.info(indent + "ELEMENT_NODE:" +node.toString());
            break;
        case Node.ENTITY_NODE:
        	log.info(indent + "ENTITY_NODE"+ node.toString());
            break;
        case Node.ENTITY_REFERENCE_NODE:
        	log.info(indent + "ENTITY_REFERENCE_NODE"+ node.toString());
            break;
        case Node.NOTATION_NODE:
        	log.info(indent + "NOTATION_NODE"+node.toString());
            break;
        case Node.PROCESSING_INSTRUCTION_NODE:
        	log.info(indent + "PROCESSING_INSTRUCTION_NODE"+node.toString());
            break;
        case Node.TEXT_NODE:
        	log.info(indent + "TEXT_NODE"+node.toString());
            break;
        default:
        	log.info(indent + "Unknown node");
            break;
        }
        NodeList list = node.getChildNodes();
        for(int i=0; i<list.getLength(); i++)
            dumpLoop(list.item(i),indent + "   ");
    }	
}