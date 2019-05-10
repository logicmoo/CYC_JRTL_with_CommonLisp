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

public class PluginDescriptor {
	public PluginDescriptor() {
	}
	
	public PluginDescriptor( String url ) {
		mUrl = url;
	}
	
	@Override
    public int hashCode() {
	    return mUrl == null ? 1 : mUrl.hashCode();
    }

	@Override
    public boolean equals( Object obj ) {
	    if( this == obj )
		    return true;
	    if( obj == null )
		    return false;
	    if( getClass() != obj.getClass() )
		    return false;
	    PluginDescriptor other = (PluginDescriptor) obj;
	    if( mUrl == null ) {
		    if( other.mUrl != null )
			    return false;
	    }
	    else if( !mUrl.equals( other.mUrl ) )
		    return false;
	    return true;
    }

	private String mUrl;
}
