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
package eu.larkc.plugin.transform.sparqltotriplepatternquerytransformer;

import java.util.HashSet;
import java.util.Set;

import org.openrdf.model.Resource;
import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.model.impl.URIImpl;
import org.openrdf.query.algebra.StatementPattern;
import org.openrdf.query.algebra.helpers.StatementPatternCollector;

import eu.larkc.core.metadata.MetaData;
import eu.larkc.core.metadata.MetaDataImpl;
import eu.larkc.core.metadata.MethodMetaDataImpl;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.Query;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.core.query.SPARQLQueryImpl;
import eu.larkc.core.query.TriplePattern;
import eu.larkc.core.query.TriplePatternQuery;
import eu.larkc.core.query.TriplePatternQueryImpl;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.transform.QueryTransformer;

public class SPARQLToTriplePatternQueryTransformer implements QueryTransformer{

	private Query inputQuery = null;
	private boolean expandQuery = false;

	public boolean canTransform(Query theQuery) {
		return theQuery instanceof SPARQLQuery;
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

	public Set<Query> transform(Query theQuery, Contract theContract, Context theContext) {
		
		SPARQLQuery query = (SPARQLQuery) theQuery;
		Set <Query> result = new HashSet <Query>();
		
		TriplePatternQuery tpq = new TriplePatternQueryImpl();
		if( query instanceof SPARQLQueryImpl)
		{
			StatementPatternCollector spc = new StatementPatternCollector();
			((SPARQLQueryImpl) query).getParsedQuery().getTupleExpr().visit(spc);
	
			for (StatementPattern sp : spc.getStatementPatterns()){
				Resource s = (Resource) sp.getSubjectVar().getValue();
				URI p = (URI) sp.getPredicateVar().getValue();
				Value o = (Value) sp.getObjectVar().getValue();
				
				if (!(s == null && p == null && o == null)){
					tpq.add(new TriplePattern(s, p, o));
				}
			}
			
			if (!tpq.isEmpty()){
				result.add(tpq);
			}
		}
		
		return result;
	}

	public URI getIdentifier() {
		return new URIImpl("urn:"+this.getClass().getCanonicalName());
	}

	

	public QoSInformation getQoSInformation() {
		return new QoSInformation() {};
	}

	public void setInputQuery(Query theQuery) {
		this.inputQuery = theQuery;
	}	
}
