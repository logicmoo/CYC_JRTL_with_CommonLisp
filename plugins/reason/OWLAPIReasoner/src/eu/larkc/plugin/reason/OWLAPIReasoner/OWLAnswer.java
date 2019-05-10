package eu.larkc.plugin.reason.OWLAPIReasoner;


import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.NodeList;

public class OWLAnswer {
	
	public String answerID;
	public String answerType;
	public NodeList answerBody;
	public String currentVar;
	public String currentVar2;
	public String currentLiteral;
	public List<String> currentBinding = new ArrayList<String>();
	public boolean booleanAnswer = false;//default value
	
	public OWLAnswer()
	{
		
	}
		

}
