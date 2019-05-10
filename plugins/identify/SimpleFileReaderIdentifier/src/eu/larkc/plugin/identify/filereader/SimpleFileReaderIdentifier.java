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
package eu.larkc.plugin.identify.filereader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;

import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.DataFactory;
import eu.larkc.core.data.InformationSet;
import eu.larkc.core.data.RdfGraph;
import eu.larkc.core.data.RdfStoreConnection;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.Query;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.identify.Identifier;

/**
* Experimental LarKC Identifier plug-in for finding RDF documents locally.
*/
public class SimpleFileReaderIdentifier implements Identifier{

	private String[] m_Filenames;
	
	
	private int counter;
	
	
	public SimpleFileReaderIdentifier(String ... filenames) {
		counter = 0;
		m_Filenames = filenames;
	}
	
	public SimpleFileReaderIdentifier() {
		counter = 0;
		m_Filenames = null;
	}
	
	public void setM_Filenames(String[] mFilenames) {
		m_Filenames = mFilenames;
	}

	@Override
	public Context createContext() {
		return null;
	}

	@Override
	public void initialise() {
	}
	
	@Override
	public void shutdown() {
	}

	/* (non-Javadoc)
	 * @see eu.larkc.plugin.identify.Identifier#identify(eu.larkc.core.query.Query, eu.larkc.plugin.Contract, eu.larkc.plugin.Context)
	 */
	public Collection<InformationSet> identify(Query theQuery,
			Contract contract, Context context) {
		
		List<InformationSet> results = new ArrayList<InformationSet>();
		
		if(m_Filenames.length == 0 || counter >= m_Filenames.length){
			return results;
		}
			
		// get the next rdf file
		String file = m_Filenames[counter];
		counter++;
		
		if(file == null || file.equals("")){
			return results;
		}
		
		// if file is not found - return empty Collection 
		try {
			new FileReader(file);
		} catch (FileNotFoundException e) {
			return results;
		} 

		// build data 
		DataFactory df = DataFactory.INSTANCE;
		
		String uriName = new File(file).toURI().toString();
	   
		// Access RDF graph exposed according linked data principles
        RdfGraph g = df.createRemoteRdfGraph(new URIImpl(uriName));
        RdfStoreConnection con = df.createRdfStoreConnection();

		// Transfer all remote data
        CloseableIterator<Statement> iter = g.getStatements();
        Set<Statement> statements = new HashSet<Statement>();
        while (iter.hasNext()) {
                Statement s = iter.next();
                statements.add(con.addStatement(s.getSubject(), s.getPredicate(), s.getObject(), (URI)s.getContext()));
        }
        iter.close();

        // Create a RdfGraph passed by value
        URI graphName = new URIImpl(uriName);
        RdfGraph graph = df.createRdfGraph(statements, graphName);
	
		results.add(graph);
		return results;
	}

	
	public URI getIdentifier() {
		return new URIImpl("urn:" + this.getClass().getName());
	}

	public QoSInformation getQoSInformation() {
		return new QoSInformation() {};
	}

}
