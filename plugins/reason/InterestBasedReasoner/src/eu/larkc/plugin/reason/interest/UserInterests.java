package eu.larkc.plugin.reason.interest;

import java.util.ArrayList;

//OK 20091116
public class UserInterests {
	
	public ArrayList<String> interests=new ArrayList();
	
	public UserInterests(){
	}

	public UserInterests(ArrayList<String> uis){
		interests=uis;
	}

	//formatedStr: accept format like this: "interest1,interest2,interest3"
	//splitRegex: the delimitor, be care about escape(e.g. then splitRegex of "|" should be "\\|")
	public UserInterests(String formatStr,String splitRegex){
		String[] ui=formatStr.split(splitRegex);
		for(int i=0;i<ui.length;i++)
			interests.add(ui[i]);
	}
	
	//str:a string with delimitor(,; \\|\\t), each word in the string represents an interest 
	public UserInterests(String str){
		String splitRegex=",; \\|\\t";
		String[] ui=str.split(splitRegex);
		for(int i=0;i<ui.length;i++)
			interests.add(ui[i]);
	}
}
