/*
 * Copyright (C) 2008, 2009 Semantic Technology Institute (STI) Innsbruck, 
 * University of Innsbruck, Technikerstrasse 21a, 6020 Innsbruck, Austria.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package eu.larkc.plugin.identify.sindice;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;

import java.util.logging.Level;
import java.util.logging.Logger;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.DataFactory;
import eu.larkc.core.data.InformationSet;
import eu.larkc.core.data.RdfGraph;
import eu.larkc.core.data.RdfStoreConnection;
import eu.larkc.core.metadata.PluginRegistry;
import eu.larkc.core.query.Query;
import eu.larkc.core.util.HttpUtils;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.identify.Identifier;

/**
 * Experimental LarKC Identifier plug-in for finding RDF documents on the web.
 */
public abstract class AbstractSindiceIdentifier implements Identifier {
	
	private static Logger log = Logger.getLogger(AbstractSindiceIdentifier.class.getCanonicalName());
	
	public static final int NUM_PAGES_PER_REQUEST = 1;
	protected int mCurrentPage = 1;

	public Collection<InformationSet> identify(Query query, Contract contract, Context context ) {
		List<InformationSet> results = new ArrayList<InformationSet>();

		try {
			for (int page = 0; page < NUM_PAGES_PER_REQUEST; ++page, ++mCurrentPage) {
				String url = makeSindiceQueryString(query, mCurrentPage);
				String response = HttpUtils.sendGetRequest(url);
				Collection<InformationSet> pageResults = parseResults(response);
				
				if( pageResults.size() == 0 ){
					break;
				}
				else{
					results.addAll(pageResults);
				}
			}
		} 
		catch (Exception e) {

			log.severe("failed to identify sources: " + e.getMessage());
		}

		if (results.isEmpty()){
			return null;
		}
		return results;
	}

	protected abstract String makeSindiceQueryString(Query query, int pageNumber);

	DownloadSession session = new DownloadSession();
	
	protected Collection<InformationSet> parseResults(String htmlResponsePage) throws Exception {
		List<String> urlStrings = getSubString(htmlResponsePage, "<id>", "</id>");
		urlStrings.remove(0);
		
		for (String urlString : urlStrings) {
			session.fetch( urlString );
		}
		return session.getFetchedGraphs();
	}

	protected List<String> getSubString(String theInput, String startString, String endString) {
		List <String> result = new ArrayList <String> ();
		int index = theInput.indexOf(startString);
		while (index != -1){
			index += startString.length();
			int endIndex = theInput.indexOf(endString, index);
			result.add(theInput.substring(index, endIndex));
			index = theInput.indexOf(startString, endIndex + endString.length());
		}
		return result;
	}
	
	class DownloadSession {
		
		synchronized void notifyWaiter() {
			notifyAll();
		}
	
		class Fetcher extends Thread {
			Fetcher(URI uri) {
				super( "Sindice RDF downloader" );
				if (uri == null) {
					throw new IllegalArgumentException();
				}
				this.uri = uri;
			}
	
			public void run() {
				RdfGraph remoteGraph = DataFactory.INSTANCE.createRemoteRdfGraph(uri);
				try {
					RdfStoreConnection con = DataFactory.INSTANCE.createRdfStoreConnection();
		            CloseableIterator<Statement> iter = remoteGraph.getStatements();  
		            Set<Statement> statements = new HashSet<Statement>();
		            while (iter.hasNext()) {
		                    Statement s = iter.next();
		                    statements.add(con.addStatement(s.getSubject(), s.getPredicate(), s.getObject(), (URI)s.getContext()));
		            }
		            iter.close();
		
		            log.log(Level.INFO, "found " + statements.size() + " statements at " + uri);
		            
		            RdfGraph graph = DataFactory.INSTANCE.createRdfGraph(statements, remoteGraph.getName());
		            mFetchedGraphs.add( graph );
	            }
	            catch( RuntimeException e ) {
	            	log.log(Level.INFO , "cannot download remote RDF: " + e.getMessage());
	            }
				mFetcherCount.decrementAndGet();
				fetchers.remove(this);
				notifyWaiter();
			}
	
			private final URI uri;
		}
		
		synchronized List<InformationSet> getFetchedGraphs() {
			
			List<InformationSet> results = new ArrayList<InformationSet>();
			
			int maxWaitTime = 2000;

			int numberOFExtendedWaitsAllowed = 10;
			
			int extended = 0;
			
			while( maxWaitTime > 0 && mFetcherCount.intValue() > 0 ) {
				long start = System.currentTimeMillis();
				try {
	                wait( maxWaitTime );
                }
                catch( InterruptedException e ) {
                }
				long stop = System.currentTimeMillis();
				int waited = (int)(stop - start);
				maxWaitTime -= waited;
				
				if( maxWaitTime <= 0 && mFetcherCount.intValue() > 0 && mFetchedGraphs.size() == 0 && extended != numberOFExtendedWaitsAllowed){
					maxWaitTime = 2000;
					extended++;
				}
			}
			
			while( mFetchedGraphs.size() > 0 )
				results.add( mFetchedGraphs.remove( 0 ) );
			
			for (Fetcher f : fetchers){
				// TODO: BARRY - thread.stop() doesnt do anythign useful, i can;t work out how to kill the download threads that are still alive when we return. 
			}

			return results;
		}
		
		private final AtomicInteger mFetcherCount = new AtomicInteger( 0 );
		private final List<InformationSet> mFetchedGraphs = Collections.synchronizedList( new ArrayList<InformationSet>() ); 
		private final List<Fetcher> fetchers = new ArrayList <Fetcher>();
	
		void fetch( String url ) {
	        Fetcher f = new Fetcher(new URIImpl(url));
	        fetchers.add(f);
	        mFetcherCount.incrementAndGet();
	        f.start();
		}
	}

	protected String urlEncode(String plainText) {
		try {
			return URLEncoder.encode(plainText, "UTF-8");
		} 
		catch (UnsupportedEncodingException e) {
			return "";
		}
	}

	public void setInputQuery(Query theQuery) {
		throw new NotImplementedException();
	}
}
