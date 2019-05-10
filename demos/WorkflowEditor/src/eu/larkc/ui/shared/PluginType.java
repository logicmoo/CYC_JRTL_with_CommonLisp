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
package eu.larkc.ui.shared;

import java.io.Serializable;

public enum PluginType implements Serializable{

	QUERY_TRANSFORMER( "query_transformer" ),
	IDENTIFIER( "identifier" ),
	DATA_TRANSFORMER( "data_transformer" ),
	SELECTER( "selecter" ),
	REASONER( "reasoner" ),
	DECIDER( "decider" );

	PluginType( String description ) {
		mDescription = description;
	}
	
	public String getName() {
		return mDescription;
	}
	
	public static PluginType stringToPluginType( String text ) {
		if( containsIgnoreCase( text, QUERY_TRANSFORMER ) )
			return QUERY_TRANSFORMER;
		if( containsIgnoreCase( text, IDENTIFIER ) )
			return IDENTIFIER;
		if( containsIgnoreCase( text, DATA_TRANSFORMER ) )
			return DATA_TRANSFORMER;
		if( containsIgnoreCase( text, SELECTER ) )
			return SELECTER;
		if( containsIgnoreCase( text, REASONER ) )
			return REASONER;
		if( containsIgnoreCase( text, DECIDER ) )
			return DECIDER;
		throw new IllegalArgumentException( "Unknown plugin type" );
	}
	
	private static boolean containsIgnoreCase( String text, PluginType type ) {
		return text.toLowerCase().indexOf( type.getName() ) >= 0;
	}
	
	private String mDescription;
	
}
