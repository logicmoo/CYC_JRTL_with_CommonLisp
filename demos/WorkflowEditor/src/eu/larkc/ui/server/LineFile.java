/*
   This file is part of the LarKC platform 
   http://www.larkc.eu/

   Copyright 2010 LarKC project consortium

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package eu.larkc.ui.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class LineFile {

	public static List<String> load( String filename ) throws IOException {
		
		List<String> result = new ArrayList<String>();

		FileReader fr = new FileReader( filename );
        BufferedReader reader = new BufferedReader( fr );
        
        String line;
        while( ( line = reader.readLine() ) != null ) {
        	line = line.trim();
        	if( line.length() > 0 )
        		result.add( line );
        }
        fr.close();

        return result;
	}
	
	public static void save( String filename, List<String> lines ) throws IOException {
		
        FileWriter fw = new FileWriter( filename );
        PrintWriter writer = new PrintWriter( new BufferedWriter( fw ) );
        
        for( String line : lines ) {
        	writer.println( line );
        }
        
        writer.flush();
        writer.close();
        fw.close();
	}
}
