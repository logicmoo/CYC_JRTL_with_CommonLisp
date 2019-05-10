

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

//package eu.larkc.plugin.reason.dig;
package eu.larkc.plugin.reason.DIGReasoner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ReadDIG {
	
	public static String readDIGDataFromURL(String data)
	{
		
		String answer ="";
		URLConnection yc = null;
		URL url = null;
		try {
			url = new URL(data);
		} catch (MalformedURLException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}

		try {
			yc = url.openConnection();
		} catch (IOException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		
        BufferedReader in = null;
		try {
			in = new BufferedReader(
			                        new InputStreamReader(
			                        yc.getInputStream()));
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
        String inputLine;

        try {
			while ((inputLine = in.readLine()) != null) 
			    answer = answer + inputLine;
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return answer;}
	}



