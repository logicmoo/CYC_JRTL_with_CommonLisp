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
package eu.larkc.plugin.decide;

import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.qos.QoSParameters;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.Plugin;

public interface Decider extends Plugin{
	public VariableBinding sparqlSelect(SPARQLQuery theQuery, QoSParameters theQoSParameters);
	public SetOfStatements sparqlConstruct(SPARQLQuery theQuery, QoSParameters theQoSParameters);
	public SetOfStatements sparqlDescribe(SPARQLQuery theQuery, QoSParameters theQoSParameters);
	public BooleanInformationSet sparqlAsk(SPARQLQuery theQuery, QoSParameters theQoSParameters);
}
