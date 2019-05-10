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
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import eu.larkc.core.pluginManager.jee.shared.OperationDescriptor;
import eu.larkc.plugin.Plugin;

/**
 * Base class for servlets for all plugin types.
 * 
 * @author Barry Bishop
 * 
 */
public abstract class PluginServlet extends LarkcServlet {

	/**
	 * Error code for "plug-in not initialised" error
	 */
	public static final int ERROR_PLUGIN_NOT_INITIALISED	= 700001;
	
	/**
	 * Error code for "invalid arguments" error
	 */
	public static final int ERROR_INVALID_ARGUMENTS			= 700002;
	
	/**
	 * Plugin class name
	 */
	public static final String PLUGIN_CLASSNAME = "PluginClassname";
	
	protected abstract void invokePlugin( Plugin plugin, UrlParameters parameters, ObjectInputStream input, ObjectOutputStream output ) throws IOException;
	
	@Override
    public void init( ServletConfig config ) throws ServletException {
	    super.init( config );
	    
//	    Map<Object,Object> runtimeSettings = new HashMap<Object, Object>();
//	    runtimeSettings.put( "storage-folder", getPluginPath() + "storage" );
//	    DataFactoryImpl.getInstance( runtimeSettings );

//	    log( "Started ORDI with these properties: " + runtimeSettings );
	    //Attempt to set a system property here that ORDI understands => storage-folder
	    ProxyOrdiTSource.strorageFolder = getPluginPath() + "storage";
    }
	
	@Override
    public void destroy() {
		
//		DataFactoryImpl.getInstance().shutdown();  I wish!
	    super.destroy();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestUrl = request.getRequestURL().toString();
		
//		UrlParameters parameters = new UrlParameters( request.getParameterMap() );
		
//		System.err.println( "query string=(" + request.getQueryString() + ")" );
//		System.err.println( "content type=\"" + request.getContentType() + "\"" );
//		System.err.println( "p1=" + request.getParameter( "p1" ) );
//		System.err.println( "p2=" + request.getParameter( "p2" ) );
//		System.err.println( "h1=" + request.getHeader( "h1" ) );
//		System.err.println( "path info=" + request.getPathInfo() );
		
		log( "GET: " + requestUrl );

		String newPluginInstanceId = createUniqueInstanceId( requestUrl );
		try {
			Plugin plugin = instantiatePlugin();
			insertNewPlugin( newPluginInstanceId, plugin );
		}
		catch( Exception e ) {
			String message = "Unable to instantiate plug-in due to: " + e.getMessage();
			log( message );
			throw new IOException( message, e );
		}
		
		log( "GET: Created new plug-in instance: " + newPluginInstanceId );

		response.setContentType( "text/plain" );
		ServletOutputStream out = response.getOutputStream();
		out.print( newPluginInstanceId );
		log( "GET: Finished." );
	}
	
	@Override
    protected void doPut( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		String requestUrl = request.getRequestURL().toString();
		log( "PUT: " + requestUrl );

		ObjectInputStream input = new ObjectInputStream( request.getInputStream() );
		ObjectOutputStream output = new ObjectOutputStream( response.getOutputStream() );

		Plugin plugin = lookupPlugin( requestUrl );
		
		if( plugin == null ) {
			response.sendError( ERROR_PLUGIN_NOT_INITIALISED, "ERROR: No plug-in with id '" + requestUrl + "' found." );
		}
		else {
			response.setContentType( "application/octet-stream" );

			UrlParameters parameters = new UrlParameters( request.getParameterMap() );
			String operation = parameters.getValue( OperationDescriptor.OPERATION );
			
			if( operation == null ) {
				response.sendError( ERROR_INVALID_ARGUMENTS, "ERROR: No operation specified for invoking '" + requestUrl + "'." );
			}
			else if( operation.equals( OperationDescriptor.OP_CREATE_CONTEXT ) ) {
				output.writeObject( plugin.createContext() );
	            log( "Plugin.createContext" );
			}
			else if( operation.equals( OperationDescriptor.OP_GET_IDENTIFIER ) ) {
				output.writeObject( plugin.getIdentifier() );
	            log( "Plugin.getIdentifier" );
			}
			else if( operation.equals( OperationDescriptor.OP_GET_QOS_INFO ) ) {
				output.writeObject( plugin.getQoSInformation() );
	            log( "Plugin.getQoSInformation" );
			}
			else if( operation.equals( OperationDescriptor.OP_INVOKE ) ) {
				try {
		            invokePlugin( plugin, parameters, input, output );
	            }
	            catch( RuntimeException e ) {
		            String message = "Plugin invocation failed: " + e.getMessage();
		            log( message );
		            throw e;
	            }
			}
		}
		log( "PUT: Finished." );
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestUrl = request.getRequestURL().toString();
		log( "DELETE: " + requestUrl );
		
		removePluginInstance( requestUrl );
		log( "DELETE: Finished" );
	}

	protected Plugin instantiatePlugin() throws IOException {
		
		String classname = getInitParams().get( PLUGIN_CLASSNAME );
		if( classname == null )
			throw new IOException( "Config error: No '" + PLUGIN_CLASSNAME + "' initialisation parameter in web.xml" );
		
		log( "Attempting to instantiate plug-in: " + classname );

		Class<?> pluginClassObject;
		try {
	        pluginClassObject = Class.forName( classname );
        }
        catch( Exception e ) {
        	String message = "Config error: Unable to locate plug-in class '" + classname + "'";
        	log( message );
			throw new IOException( message, e );
        }
		
        Properties pluginProperties = loadProperties();
        if( pluginProperties != null ) {
    		// Try to get the constructor that takes a 'Properties' parameter
            try {
            	Constructor<?> constructor = pluginClassObject.getConstructor( Properties.class );
    			log( "Instantiating plug-in with constructor: (Properties)" );
    			return (Plugin) constructor.newInstance( pluginProperties );
            }
            catch( Exception e ) {
            	String message = "Instantiation with constructor( Properties ) failed with " + e;
            	log( message );
            }
        }
        
        // No properties or no constructor that takes properties, so use the default constructor
		try {
			Constructor<?> constructor = pluginClassObject.getConstructor();
			log( "Instantiating plug-in with default constructor" );
	        return (Plugin) constructor.newInstance();
        }
        catch( Exception e ) {
        	String message = "Instantiation with default constructor failed with " + e;
        	log( message );
        }

		throw new IOException( "Unable to instantiate the plug-in '" + classname + "'. No suitable constructor found or accessible." );
	}

	protected String createUniqueInstanceId( String requestUrl ) {
		return requestUrl + "/instance_" + UUID.randomUUID();
	}
	
	protected void insertNewPlugin( String pluginInstanceId, Plugin plugin ) {
		mPluginInstances.put( pluginInstanceId, plugin );
	}
	
	protected Plugin lookupPlugin( String pluginInstanceId ) {
		return mPluginInstances.get( pluginInstanceId );
	}
	
	protected void removePluginInstance( String pluginInstanceId ) {
		mPluginInstances.remove( pluginInstanceId );
	}
	
	private Map<String, Plugin> mPluginInstances = Collections.synchronizedMap( new HashMap<String, Plugin>() );
	
	private static final long serialVersionUID = 1L;
}
