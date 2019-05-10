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

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import eu.larkc.ui.client.WorkflowEditorService;
import eu.larkc.ui.shared.FieldVerifier;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class WorkflowEditorServiceImpl extends RemoteServiceServlet implements WorkflowEditorService {

	public List<String> getPlugins() throws IOException {
		
		try {
	        List<String> result = LineFile.load( PLUGIN_DESCRIPTORS_FILENAME );
	        Collections.sort( result );
	        return result;
        }
        catch( FileNotFoundException e ) {
	        return new ArrayList<String>();
        }
	}

	private void savePluginDescriptions( List<String> plugins ) throws IOException {
		LineFile.save( PLUGIN_DESCRIPTORS_FILENAME, plugins );
	}

	public boolean removePlugin( String plugin ) throws IOException {
		List<String> plugins = getPlugins();
		plugins.remove( plugin );
		savePluginDescriptions( plugins );
		return true;
	}
	
	public boolean addPlugin( String plugin ) throws IOException {
		List<String> plugins = getPlugins();
		plugins.add( plugin );
		savePluginDescriptions( plugins );
		return true;
	}

	private static final String PLUGIN_DESCRIPTORS_FILENAME = "plugin_descriptrs.txt";

}
