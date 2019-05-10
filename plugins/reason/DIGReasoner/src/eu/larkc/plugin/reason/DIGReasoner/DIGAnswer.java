package eu.larkc.plugin.reason.DIGReasoner;


import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.NodeList;

public class DIGAnswer {
	
	public String answerID;
	public String answerType;
	public NodeList answerBody;
	public String currentVar;
	public String currentVar2;
	public String currentLiteral;
	public List<String> currentBinding = new ArrayList<String>();
	
	public DIGAnswer()
	{
		
	}
		

}