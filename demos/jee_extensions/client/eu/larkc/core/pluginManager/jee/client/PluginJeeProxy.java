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
package eu.larkc.core.pluginManager.jee.client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.openrdf.model.URI;

import eu.larkc.core.pluginManager.jee.shared.OperationDescriptor;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Plugin;

/**
 * The base class for all plug-in JEE proxy classes.
 */
public abstract class PluginJeeProxy implements Plugin {

	/**
	 * Constructor.
	 * 
	 * @param url
	 *            the URL where the actual plug-in is deployed
	 */
	public PluginJeeProxy( String url ) {
		mUrl = url;
	}
	
	protected Object callPluginInstance( Object parameters, String operation ) {
		try {
			HttpRequest request = new HttpRequest( mInstanceUrl );
			request.setPutMethod();
	
			request.addParameter( OperationDescriptor.OPERATION, operation );
			
			// Always write the parameters object, even if it null.
			// If nothing is written then just creating the ObjectInputStream on the server-side
			// will cause errors.
			request.setContentType( "application/octet-stream" );
			ObjectOutputStream out = new ObjectOutputStream( request.openForWriting() );
			
			out.writeObject( parameters );
			out.flush();
			
			ObjectInputStream in = new ObjectInputStream( request.read() );
			Object readObject = in.readObject();
			
			return readObject;
		}
		catch( Exception e ) {
			throw new RuntimeException( "Call to plug-in instance failed.", e );
		}
	}
	
	@Override
	public QoSInformation getQoSInformation() {
		return (QoSInformation) callPluginInstance( null, OperationDescriptor.OP_GET_QOS_INFO );
	}

	public URI getIdentifier() {
		return (URI) callPluginInstance( null, OperationDescriptor.OP_GET_IDENTIFIER );
	}
	
	public Context createContext() {
		return (Context) callPluginInstance( null, OperationDescriptor.OP_CREATE_CONTEXT );
	}
	
	public void initialise() {
		instantiatePlugin();
	}
	
	public void shutdown() {
		destroyPlugin();
	}
	
	private void instantiatePlugin() {
		try {
	        HttpRequest request = new HttpRequest( mUrl );
	        request.setGetMethod();
	        request.setContentType( "text/plain" );
	        
	        request.open();
	        mInstanceUrl = request.readAsString();
        }
        catch( IOException e ) {
			throw new RuntimeException( "Instantiating plug-in failed.", e );
        }
	}

	private void destroyPlugin() {
		try {
			HttpRequest request = new HttpRequest( mInstanceUrl );
			request.setDeleteMethod();
			request.open();
			request.read();
        }
        catch( IOException e ) {
			throw new RuntimeException( "Instantiating plug-in failed.", e );
        }
	}
	
	protected final String mUrl;
	protected String mInstanceUrl;
}
