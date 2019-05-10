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
package eu.larkc.core.pluginManager.jee.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Properties;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet for a property editor.
 * 
 * @author Barry Bishop
 *
 */
public class PropertyEditorServlet extends LarkcServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();

	    Properties properties = loadProperties();
	    
		out.print( createForm( properties, request.getContextPath() + "/properties" ) );
	}

	@Override
    protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		// Get the updated properties and save
		String sringisedProperties = request.getParameter( "properties" );
		if( sringisedProperties != null ) {
			StringReader reader = new StringReader( sringisedProperties );
			
			Properties properties = new Properties();
			properties.load( reader );
			saveProperties( properties );
		}
		
		// Then re-do the get
		doGet( request, response );
    }
	
	private String createForm( Properties properties, String action ) {
		StringBuilder buffer = new StringBuilder();
		
		StringWriter stringisedProperties = new StringWriter();
		try {
			if( properties != null )
				properties.store( stringisedProperties, "" );
		}
		catch( IOException e ) {
		}
		
		buffer.append( "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">" );
		buffer.append( "<HTML>" );
		buffer.append( "<HEAD>" );
		buffer.append( "  <TITLE>" ).append( getContextName() ).append( " plugin properties editor</TITLE>" );
		buffer.append( "</HEAD>" );

		buffer.append( "<BODY BGCOLOR=\"#A8BCEC\">" );
		buffer.append( "<a href=\"http://www.larkc.eu\"><img src=\"images/larkc_logo.jpg\" alt=\"LarKC Project\" /></a>" );
		buffer.append( "<br />" );
		buffer.append( "<H1 ALIGN=\"CENTER\">").append( getContextName() ).append( " plug-in properties editor</H1>" );

		// /servlet/hall.ShowParameters
		buffer.append( "<FORM ACTION=\"" ).append( action ).append( "\" METHOD=\"POST\">" );
		buffer.append( "  Properties:<BR />" );
//		buffer.append( "  <TEXTAREA NAME=\"properties\" ROWS=10 COLS=80>" ).append( stringisedProperties.toString() ).append( "</TEXTAREA><BR />" );
		buffer.append( "  <TEXTAREA style=\"width: 98%\" NAME=\"properties\" ROWS=10>" ).append( stringisedProperties.toString() ).append( "</TEXTAREA><BR />" );
		buffer.append( "  <CENTER>" );
		buffer.append( "    <INPUT TYPE=\"SUBMIT\" VALUE=\"Update\">" );
		buffer.append( "  </CENTER>" );
		buffer.append( "</FORM>" );

		buffer.append( "</BODY>" );
		buffer.append( "</HTML>" );

		return buffer.toString();
	}

    private static final long serialVersionUID = 1L;
}
