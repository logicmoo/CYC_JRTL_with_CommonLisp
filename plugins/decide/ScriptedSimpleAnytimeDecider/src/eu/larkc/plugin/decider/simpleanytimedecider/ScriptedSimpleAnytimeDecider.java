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
package eu.larkc.plugin.decider.simpleanytimedecider;

import java.util.logging.Logger;

import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;

import eu.larkc.core.Workflow;
import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.metadata.PluginRegistry;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.qos.QoSParameters;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.decide.Decider;
import eu.larkc.plugin.Context;

public class ScriptedSimpleAnytimeDecider implements Decider {

	private static Logger logger = Logger.getLogger(ScriptedSimpleAnytimeDecider.class.getCanonicalName());
	
	@Override
	public BooleanInformationSet sparqlAsk(SPARQLQuery theQuery,
			QoSParameters theQoSParameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SetOfStatements sparqlConstruct(SPARQLQuery theQuery,
			QoSParameters theQoSParameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SetOfStatements sparqlDescribe(SPARQLQuery theQuery,
			QoSParameters theQoSParameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VariableBinding sparqlSelect(SPARQLQuery theQuery,
			QoSParameters theQoSParameters) {
		
		System.out.println("Composing workflow ...");
		Workflow workflow = new Workflow();
		workflow.addPlugIn(new URIImpl("urn:eu.larkc.plugin.transform.sparqltotriplepatternquerytransformer.SPARQLToTriplePatternQueryTransformer"));
		workflow.addPlugIn(new URIImpl("urn:eu.larkc.plugin.identify.sindice.SindiceTriplePatternIdentifier"));
		workflow.addPlugIn(new URIImpl("urn:eu.larkc.plugin.select.simple.GrowingDataSetSelecter"));
		workflow.addPlugIn(new URIImpl("urn:eu.larkc.plugin.reason.simple.SparqlQueryEvaluationReasoner"));
		
		System.out.println("Starting workflow ...");
		try {
			workflow.start(theQuery);
		} catch (Exception e) {
			logger.severe("Error: " + e.getMessage());
			return null;
		}
		return (VariableBinding)workflow.take();
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

	@Override
	public URI getIdentifier() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QoSInformation getQoSInformation() {
		// TODO Auto-generated method stub
		return null;
	}

}
