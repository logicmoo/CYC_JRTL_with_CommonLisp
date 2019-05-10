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

import java.util.Map;

import com.ontotext.ordi.exception.ORDIException;
import com.ontotext.ordi.exception.ORDIWarning;
import com.ontotext.ordi.tripleset.TConnection;
import com.ontotext.ordi.tripleset.TFactory;
import com.ontotext.ordi.tripleset.TSource;

/**
 * Proxy class for a <code>com.ontotext.ordi.tripleset.TSource</code>. 
 * 
 * @author Barry Bishop
 *
 */
public class ProxyOrdiTSource implements TSource {

	private TSource mRealTSource;
	public static String strorageFolder = ""; 

	public ProxyOrdiTSource(Map<Object, Object> props) {
		
		props.put("storage-folder", strorageFolder );
		mRealTSource = new com.ontotext.ordi.trree.TRREEAdapter( props );
	}
	   
	@Override
	public TConnection getConnection() {
		return mRealTSource.getConnection();
	}

	@Override
	public TConnection getConnection(String arg0, String arg1) {
		return mRealTSource.getConnection( arg0,  arg1);
	}

	@Override
	public TFactory getTriplesetFactory() {
		return mRealTSource.getTriplesetFactory();
	}

	@Override
	public Map<Object, Object> getMetaData() {
		return mRealTSource.getMetaData();
	}

	@Override
	public boolean isShutdown() {
		return mRealTSource.isShutdown();
	}

	@Override
	public void shutdown() {
		mRealTSource.shutdown();
	}

	@Override
	public boolean isWrapperFor(Class<?> arg0) throws ORDIException {
		return mRealTSource.isWrapperFor(arg0);
	}

	@Override
	public <T> T unwrap(Class<T> arg0) throws ORDIException {
		return mRealTSource.unwrap(arg0);
	}

	@Override
	public void clearWarnings() {
		mRealTSource.clearWarnings();
	}

	@Override
	public ORDIWarning getWarning() {
		return mRealTSource.getWarning();
	}

}
