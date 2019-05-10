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

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * Base class for all LarKC servlets.
 * 
 * @author Barry Bishop
 * 
 */
public class LarkcServlet extends HttpServlet {

	@Override
    public void init( ServletConfig config ) throws ServletException {
	    super.init( config );
	    
	    // Plugin path (actually the servlet context path)
	    mPluginPath = getServletContext().getRealPath("/");
	    String fileSep = System.getProperty("file.separator");

	    if( mPluginPath == null )
	    	mPluginPath = ".";
	    
	    if ( ! mPluginPath.endsWith( fileSep ) )
	    	mPluginPath = mPluginPath + fileSep;
	    
	    mPropertyFilename = mPluginPath + PLUGIN_PROPERTIES;
	    mContextName = config.getServletContext().getContextPath().substring( 1 );
	    
	    loadInitParams( config );
    }

	protected String getPluginPath() {
		return mPluginPath;
	}
	
	protected String getContextName() {
		return mContextName;
	}
	
	@Override
    public synchronized void log( String msg ) {
		// doesn't work on tomcat 5.5 +
	    // super.log( msg ); 
		
		// So do some simple stuff for the time being
		System.out.println( mLogFormatter.format( new Date() ) + " " + getClass().getSimpleName() + ": " + msg );
    }
	
	protected Properties loadProperties() {
		try {
			Properties properties = new Properties();
			FileInputStream in = new FileInputStream( mPropertyFilename );
			properties.load( in );
			in.close();
			return properties;
		}
		catch( IOException e ) {
			// File probably doesn't exist
			return null;
		}
	}
	
	protected void saveProperties( Properties properties ) throws IOException {
		FileOutputStream out = new FileOutputStream( mPropertyFilename );
		properties.store( out, "Plugin property file." );
		out.close();
	}
	
	protected Map<String,String> getInitParams() {
		return mInitParams;
	}
	
	@SuppressWarnings("unchecked")
    private void loadInitParams( ServletConfig config ) {
		Enumeration<String> paramNames = config.getInitParameterNames();
		while( paramNames.hasMoreElements() ) {
			String name = paramNames.nextElement();
			String value = config.getInitParameter( name );
			
			mInitParams.put( name, value );
		}
	}

    private static final long serialVersionUID = 1L;
	private static final String PLUGIN_PROPERTIES = "plugin.properties";

	private String mPropertyFilename = PLUGIN_PROPERTIES;
    private String mContextName = "";
    private String mPluginPath = "./";

	private final Map<String,String> mInitParams = new HashMap<String,String>();

	private final SimpleDateFormat mLogFormatter = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss.SSS" );
}
