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


import java.util.Collection;
import java.util.Set;

import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.model.impl.URIImpl;

import eu.larkc.core.data.InformationSet;
import eu.larkc.core.metadata.MetaData;
import eu.larkc.core.metadata.MetaDataImpl;
import eu.larkc.core.metadata.MethodMetaDataImpl;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.Query;
import eu.larkc.core.query.TriplePattern;
import eu.larkc.core.query.TriplePatternQuery;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.identify.Identifier;

/**
 * Experimental LarKC Identifier plug-in for finding RDF documents on the web.
 */
public class SindiceTriplePatternIdentifier extends AbstractSindiceIdentifier {

	public SindiceTriplePatternIdentifier() {
	}

	@Override
	protected String makeSindiceQueryString(Query query, int pageNumber) {
		TriplePatternQuery tpQuery = (TriplePatternQuery) query;

		Collection <TriplePattern> patterns = tpQuery.getTriplePatterns();

		StringBuilder sindiceQuery = new StringBuilder();

		sindiceQuery.append("q=");
		boolean first = true;
		for (TriplePattern pattern : patterns) {
			if (first){
				first = false;
			}
			else{
				sindiceQuery.append("+AND+");
			}
			sindiceQuery.append(urlEncodeConstraint(pattern));
		}
		sindiceQuery.append("&qt=advanced");
		sindiceQuery.append("&format=atom");
		sindiceQuery.append("&page=").append(pageNumber);

		return "http://api.sindice.com/v2/search" + "?" + sindiceQuery.toString();
	}

	private String urlEncodeConstraint(TriplePattern constraint) {
		return urlEncode(convertTerm(constraint.getSubject()) + " " + convertTerm(constraint.getPredicate()) + " " + convertTerm(constraint.getObject()));
	}

	private String convertTerm(Value theValue) {
		if (theValue == null) {
			return "*";
		} 
		else if (theValue instanceof URI) {
			return "<" + theValue.toString() + ">";
		}
		return theValue.toString();
	}

	public URI getIdentifier() {
		return new URIImpl("urn:"+this.getClass().getCanonicalName());
	}

	/*public MetaData getMetaData() {
		// prepare meta-data about this plug-in
		MetaDataImpl metaData = new MetaDataImpl(Identifier.class.getCanonicalName());
		
		// add what it can get on the input and what it gives on the output
		metaData.addMethod( new MethodMetaDataImpl("identify",
			new String[] { TriplePatternQuery.class.getCanonicalName(),MethodMetaDataImpl.getGemericsName(
			                                                  			                   				Set.class.getCanonicalName(), 
			                                                			                   				TriplePatternQuery.class.getCanonicalName()) },
			MethodMetaDataImpl.getGemericsName(
				Collection.class.getCanonicalName(), 
				InformationSet.class.getCanonicalName())));		
		
		return metaData;
	}*/

	public QoSInformation getQoSInformation() {
		return new QoSInformation() {};
	}

	@Override
	public Context createContext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void initialise() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		
	}
}
