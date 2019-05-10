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
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * Builds various HTTP requests (GET, PUT, POST, DELETE) to interact with remote
 * plug-ins.
 * 
 * @author Barry Bishop
 */
public class HttpRequest {
	
	/** Constant to indicate that utf-8 encoding is used. */
	public final String UTF8 = "UTF-8";

	/**
	 * Constructor.
	 * 
	 * @param url target URL of the HTTP request.
	 */
	public HttpRequest( String url ) {
		mUrl = url;
	}

	/**
	 * Adds a parameter to the parameter map.
	 * 
	 * @param parameter name of the parameter, used as a key for the parameter map
	 * @param value parameter value
	 */
	public void addParameter( String parameter, String value ) {
		try {
            String encodedValue = URLEncoder.encode( value, UTF8 );
            
            mParameters.put( parameter, encodedValue );
        }
        catch( UnsupportedEncodingException e ) {
        }
		//URLEncoder.encode( value );
	}
	
	/**
	 * Sets the method.
	 * 
	 * @param method the new method
	 */
	public void setMethod( String method ) {
		mMethod = method;
	}
	
	/**
	 * Sets the get method.
	 */
	public void setGetMethod() {
		setMethod( "GET" );
	}
	
	/**
	 * Sets the put method.
	 */
	public void setPutMethod() {
		setMethod( "PUT" );
	}
	
	/**
	 * Sets the post method.
	 */
	public void setPostMethod() {
		setMethod( "POST" );
	}
	
	/**
	 * Sets the delete method.
	 */
	public void setDeleteMethod() {
		setMethod( "DELETE" );
	}
	
	/**
	 * Sets the content type.
	 * 
	 * @param contentType the new content type
	 */
	public void setContentType( String contentType ) {
		mContentType = contentType;
	}
	
	/**
	 * Sets the body.
	 * 
	 * @param body the new body
	 */
	public void setBody( String body ) {
		mBody = body;
	}

	/**
	 * Open for writing.
	 * 
	 * @return the output stream
	 * 
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public OutputStream openForWriting()  throws IOException {
		open();
		mConnection.setDoOutput( true );

		return mConnection.getOutputStream();
	}

	/**
	 * Open.
	 * 
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public void open() throws IOException {
		String fullUrl;
		if( mParameters.size() > 0 ) {
			StringBuffer urlWithParams = new StringBuffer();
			urlWithParams.append( mUrl );
			
			boolean first = true;
			for( Map.Entry<String,String> entry : mParameters.entrySet() ) {
				if( first ) {
					first = false;
					urlWithParams.append( '?' );
				}
				else {
					urlWithParams.append( '&' );
				}
				urlWithParams.append( entry.getKey() );
				urlWithParams.append( '=' );
				urlWithParams.append( entry.getValue() );
			}
			fullUrl = urlWithParams.toString();
		}
		else
			fullUrl = mUrl;
		
		URL url = new URL( fullUrl );
		
		mConnection = (HttpURLConnection) url.openConnection();

		if( mMethod != null )
			mConnection.setRequestMethod( mMethod );
		
		if( mContentType != null )
			mConnection.setRequestProperty( "Content-type", mContentType + "; charset=" + UTF8 );
	}

	/**
	 * Read.
	 * 
	 * @return the input stream
	 * 
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public InputStream read() throws IOException {
		return mConnection.getInputStream();
	}

	/**
	 * Read as string.
	 * 
	 * @return the string
	 * 
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public String readAsString() throws IOException {
		InputStreamReader reader = new InputStreamReader( read() );
		StringBuffer responseBuffer = new StringBuffer();
		
		char[] buffer = new char[ 1024 ];
		
		for(;;) {
			int charsRead = reader.read( buffer );
			if( charsRead <= 0 )
				break;
			responseBuffer.append( buffer, 0, charsRead );
		}
		
		String response = responseBuffer.toString();
		
		return response;
	}
	
	private Map<String, String> mParameters = new HashMap<String, String>();
	private HttpURLConnection mConnection;
	private String mBody;
	private String mContentType;
	private String mMethod = "GET";
	private String mUrl;
}