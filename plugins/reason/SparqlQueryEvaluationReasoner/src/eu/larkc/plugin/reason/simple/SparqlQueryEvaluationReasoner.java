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
package eu.larkc.plugin.reason.simple;


import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;

import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.BooleanInformationSetImpl;
import eu.larkc.core.data.DataSet;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.data.util.SPARQLQueryExecutor;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.Query;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.reason.Reasoner;

public class SparqlQueryEvaluationReasoner implements Reasoner {
	private Query inputQuery;

	public SparqlQueryEvaluationReasoner() {
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

	public BooleanInformationSet sparqlAsk(SPARQLQuery theQuery, SetOfStatements theSetOfStatements, Contract contract, Context context) {
		return new BooleanInformationSetImpl(new SPARQLQueryExecutor().executeAsk(theQuery, theSetOfStatements));
	}

	public SetOfStatements sparqlConstruct(SPARQLQuery theQuery, SetOfStatements theSetOfStatements, Contract contract, Context context) {
		return new SPARQLQueryExecutor().executeConstruct(theQuery, theSetOfStatements);
	}

	public SetOfStatements sparqlDescribe(SPARQLQuery theQuery, SetOfStatements theSetOfStatements, Contract contract, Context context) {
		return sparqlConstruct(theQuery, theSetOfStatements, contract, context);
	}

	public VariableBinding sparqlSelect(SPARQLQuery theQuery, SetOfStatements theSetOfStatements, Contract contract, Context context) {
		return new SPARQLQueryExecutor().executeSelect(theQuery, theSetOfStatements);
	}

	public URI getIdentifier() {
		return new URIImpl("urn:"+this.getClass().getName());
	}

	/*public MetaData getMetaData() {
		// prepare meta-data about this plug-in
		MetaDataImpl metaData = new MetaDataImpl(Reasoner.class.getCanonicalName());
		
		// add what it can get on the input and what it gives on the output
		metaData.addMethod( new MethodMetaDataImpl("sparqlSelect",
			new String[] { SPARQLQuery.class.getCanonicalName(),
				SPARQLQuery.class.getCanonicalName() },
			new String[] { LabelledGroupOfStatements.class.getCanonicalName() },		
			VariableBinding.class.getCanonicalName()));		
		
		return metaData;
	}*/

	public QoSInformation getQoSInformation() {
		return new QoSInformation() {
		};
	}

	public void setInputQuery(Query theQuery) {
		this.inputQuery = theQuery;
	}
}
