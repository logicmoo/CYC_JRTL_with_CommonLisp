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

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Holds URL parameter.
 * 
 * @author Barry Bishop
 *
 */
public class UrlParameters {

	/**
	 * Constructor. Takes a map which holds the raw URL parameters and decodes
	 * them using the <code>java.net.URLDecoder</code> (utf-8 encoding). The
	 * decoded parameters are stored for later retrieval.
	 * 
	 * @param rawParameterMap
	 *            the raw parameter map
	 */
	@SuppressWarnings("unchecked")
    public UrlParameters( Map rawParameterMap ) {
		
		for( Map.Entry<String, String[]> entry : (Set<Map.Entry<String, String[]> >) rawParameterMap.entrySet() ) {
			
			String[] encodedValues = entry.getValue();
			String[] decodedValues = new String[ encodedValues.length ];
			for( int i = 0; i < encodedValues.length; ++i ) {
    			try {
    	            decodedValues[ i ] = URLDecoder.decode( encodedValues[ i ], "utf-8" );
                }
                catch( UnsupportedEncodingException e ) {
                	decodedValues[ i ] = "";
                }
			}
            mParameters.put( entry.getKey(), decodedValues );
		}
	}

	/**
	 * Returns the first value mapped to <code>key</code>.
	 * 
	 * @param key
	 *            key of the value to retrieve.
	 * @return first value mapped to <code>key</code> or <code>null</code>
	 *         if no key/value pair matched the provided key.
	 */
	public String getValue( String key ) {
		String[] values = mParameters.get( key );
		
		if( values.length > 0 )
			return values[ 0 ];
		else
			return null;
	}

	/**
	 * Returns all values mapped to <code>key</code>.
	 * 
	 * @param key
	 *            key of the value to retrieve.
	 * @return all values mapped to <code>key</code> or <code>null</code> if no
	 *         key/value pair matched the provided key.
	 */
	public String[] getValues( String key ) {
		String[] values = mParameters.get( key );
		
		if( values == null )
			return new String[ 0 ];
		else
			return values;
	}
	
	private final Map<String, String[]> mParameters = new HashMap<String, String[]>();
}