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
package eu.larkc.plugin.select.simple;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.openrdf.model.URI;
import org.openrdf.model.impl.StatementImpl;
import org.openrdf.model.impl.URIImpl;
import org.openrdf.model.Statement;

import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.DataFactoryImpl;
import eu.larkc.core.data.DataSet;
import eu.larkc.core.data.LabelledGroupOfStatements;
import eu.larkc.core.data.RdfGraph;
import eu.larkc.core.data.RdfStoreConnection;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.SetOfStatementsImpl;
import eu.larkc.core.metadata.MetaData;
import eu.larkc.core.metadata.MetaDataImpl;
import eu.larkc.core.metadata.MethodMetaDataImpl;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.Query;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.select.Selecter;

public class GrowingDataSetSelecter implements Selecter {
	
	private DataSet previousDataSet = null; // TODO This plugin is currently stateful, this variable should be added to a Context object to make it non stateful
	
	private Query inputQuery;

	private List<Statement> allStatements = new ArrayList<Statement>();

	public GrowingDataSetSelecter() {
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

	public SetOfStatements select(SetOfStatements input, Contract contract, Context context) {

		// =============================================================
		// Works, but new instances always remember the old triples
		try {
			
			CloseableIterator<Statement> itInput = input.getStatements();
			
			while( itInput.hasNext() ) {
				Statement statement = itInput.next();
				allStatements.add( new StatementImpl( statement.getSubject(), statement.getPredicate(), statement.getObject() ) );
			}
			SetOfStatementsImpl output = new SetOfStatementsImpl( allStatements );
					
			return output;
		}
		catch( RuntimeException e ) {
			System.err.println( "Something bad has happened!");

			Throwable e2 = e;
			int level = 1;
			while( e2 != null ) {
				System.err.println( "Level " + level++ );
				System.err.println( "===========================");
				e2.printStackTrace( System.err );
				e2 = e2.getCause();
			}
			throw e;
		}
	}
			
//	public SetOfStatements select(SetOfStatements theSetOfStatements, Contract contract, Context context) {
//		List <URI> defaultGraphURIs = new ArrayList <URI> ();
//		List <URI> namesGraphURIs = new ArrayList <URI> ();
//		if (previousDataSet != null){
//			for (RdfGraph graph : previousDataSet.getDefaultGraphs()){
//				defaultGraphURIs.add(graph.getName());
//			}
//			itInput.close();
//	
//			SetOfStatementsImpl output = new SetOfStatementsImpl( allStatements );
//	//		output.setData( allStatements );
//			
//			return output;
//		}
//		catch( RuntimeException e ) {
//			System.err.println( "Something bad has happened!");
//
//			Throwable e2 = e;
//			int level = 1;
//			while( e2 != null ) {
//				System.err.println( "Level " + level++ );
//				System.err.println( "===========================");
//				e2.printStackTrace( System.err );
//				e2 = e2.getCause();
//			}
//			throw e;
//		}

		// ======================================================================
		// Should work, but getIdentifier() is not unique, so never forgets triples!
//		try {
//			RdfStoreConnection rdfStore = DataFactoryImpl.getInstance().createRdfStoreConnection();
//			CloseableIterator<Statement> itInput = input.getStatements();
//			
//			while( itInput.hasNext() ) {
//				Statement statement = itInput.next();
//				rdfStore.addStatement(statement.getSubject(), statement.getPredicate(), statement.getObject(), getIdentifier());
//			}
//			itInput.close();
//	
//			CloseableIterator<Statement> itOutput = rdfStore.search( null, null, null, getIdentifier(), null );
//			List<Statement> allStatements = new ArrayList<Statement>();
//	
//			while( itOutput.hasNext() ) {
//				Statement statement = itOutput.next();
//				Statement cloned = new StatementImpl( statement.getSubject(), statement.getPredicate(), statement.getObject() );
//				allStatements.add( cloned );
//			}
//			itOutput.close();
//			rdfStore.close();
//	
//			SetOfStatementsImpl output = new SetOfStatementsImpl( allStatements );
////			output.setData( allStatements );
//			
//			return output;
//		}
//		catch( RuntimeException e ) {
//			System.err.println( "Something bad has happened!");
//
//			Throwable e2 = e;
//			int level = 1;
//			while( e2 != null ) {
//				System.err.println( "Level " + level++ );
//				System.err.println( "===========================");
//				e2.printStackTrace( System.err );
//				e2 = e2.getCause();
//			}
//			throw e;
//		}

		// ========================================================================================
		// Original implementation - doesn't work because underlying sesame DataSet
		// implementation class is not serialisable.
//		List <URI> defaultGraphURIs = new ArrayList <URI> ();
//		List <URI> namesGraphURIs = new ArrayList <URI> ();
//		if (previousDataSet != null){
//			for (RdfGraph graph : previousDataSet.getDefaultGraphs()){
//				defaultGraphURIs.add(graph.getName());
//			}
//			for (RdfGraph graph : previousDataSet.getNamedGraphs()){
//				namesGraphURIs.add(graph.getName());
//			}
//		}
//		
//		if (theSetOfStatements instanceof RdfGraph){
//			namesGraphURIs.add(((RdfGraph) theSetOfStatements).getName());
//		}
//		else if (theSetOfStatements instanceof LabelledGroupOfStatements){
//			namesGraphURIs.add(((LabelledGroupOfStatements) theSetOfStatements).getLabel());
//		}
//		else if (theSetOfStatements instanceof DataSet){
//			for (RdfGraph graph : ((DataSet) theSetOfStatements).getDefaultGraphs()){
//				defaultGraphURIs.add(graph.getName());
//			}
//			for (RdfGraph graph : ((DataSet) theSetOfStatements).getNamedGraphs()){
//				namesGraphURIs.add(graph.getName());
//			}
//		}
//		
//		DataSet result = DataFactoryImpl.getInstance().createRdfStoreConnection().createDataSet(defaultGraphURIs, namesGraphURIs);
//		previousDataSet = result;
//		System.out.println(result.toString());
//		return result;
//	}

	public URI getIdentifier() {
		return new URIImpl("urn:"+this.getClass().getName());
	}

	public MetaData getMetaData() {
		// prepare meta-data about this plug-in
		MetaDataImpl metaData = new MetaDataImpl(Selecter.class.getCanonicalName());
		
		// add what it can get on the input and what it gives on the output
		metaData.addMethod( new MethodMetaDataImpl("select",
			new String[] {
				MethodMetaDataImpl.getGemericsName(
					Collection.class.getCanonicalName(),
					DataSet.class.getCanonicalName()), DataSet.class.getCanonicalName() },
			LabelledGroupOfStatements.class.getCanonicalName()));		
		
		return metaData;
	}

	public QoSInformation getQoSInformation() {
		return new QoSInformation() {};
	}

	public void setInputQuery(Query theQuery) {
		this.inputQuery = theQuery;
	}
}
