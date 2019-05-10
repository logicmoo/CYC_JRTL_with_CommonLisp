/*
 * Copyright (C) 2009 CEFRIEL 
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
package eu.larkc.plugin.identify.urbancomputing.ubl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

import org.openrdf.model.Resource;
import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.model.impl.URIImpl;

import eu.larkc.core.data.InformationSet;
import eu.larkc.core.query.Query;
import eu.larkc.core.query.TriplePattern;
import eu.larkc.core.query.TriplePatternQuery;
import eu.larkc.core.query.TriplePatternQueryImpl;
import eu.larkc.core.util.HttpUtils;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.identify.sindice.SindiceTriplePatternIdentifier;

/**
 * @author Irene Celino, Daniele Dell'Aglio, Emanuele Della Valle 
 * based on AbstractSindiceIdentifier and SindiceTriplePatternIdentifier 
 * 
 */
public class UrbanSindiceIdentifier extends SindiceTriplePatternIdentifier{

	private static Logger log = Logger.getLogger(
			UrbanSindiceIdentifier.class.getCanonicalName());
	
	//only first time when called, return results (anytime b.)
	private boolean once = false;

	public UrbanSindiceIdentifier() {		
	}

	/*
	 * It queries Sindice for several triple patterns to identify interesting places in Milano
	 * visitor attractions, churches, gardens, museums, piazzas
	 */
	public Collection<InformationSet> identify(Query query, Contract contract,
			Context context) {
		
		if (once) { return null; }
		once = true;

		List<Query> allTriplePatterns = new ArrayList<Query>();

		// risorse da mettere nei triple patterns
		Resource monumentVariable = null; 
		URI skosSubject = new URIImpl(
				"http://www.w3.org/2004/02/skos/core#subject");
		Value dbpediaAttraction = new URIImpl(
				"http://dbpedia.org/resource/Category:Visitor_attractions_in_Milan");
		Value dbpediaChurch = new URIImpl(
				"http://dbpedia.org/resource/Category:Churches_in_Milan");
		/*Value dbpediaGarden = new URIImpl(
				"http://dbpedia.org/resource/Category:Gardens_in_Milan");
		Value dbpediaMuseum = new URIImpl(
				"http://dbpedia.org/resource/Category:Museums_in_Milan");
		Value dbpediaPiazza = new URIImpl(
				"http://dbpedia.org/resource/Category:Piazzas_in_Milan");*/
		URI georssPoint = new URIImpl("http://www.georss.org/georss/point");
		Value geoPointVariable = null; 

		// prima interrogazione a sindice: attrazioni
		TriplePatternQuery singleResult = new TriplePatternQueryImpl();
		singleResult.add(new TriplePattern(
				monumentVariable, skosSubject, dbpediaAttraction));
		singleResult.add(new TriplePattern(
				monumentVariable, georssPoint, geoPointVariable));
		allTriplePatterns.add(singleResult);

		// seconda interrogazione a sindice: chiese
		singleResult = new TriplePatternQueryImpl();
		singleResult.add(new TriplePattern(
				monumentVariable, skosSubject, dbpediaChurch));
		singleResult.add(new TriplePattern(
				monumentVariable, georssPoint, geoPointVariable));
		allTriplePatterns.add(singleResult);

		// terza interrogazione a sindice: giardini
		/*singleResult = new TriplePatternQueryImpl();
		singleResult.add(new TriplePattern(
				monumentVariable, skosSubject, dbpediaGarden));
		singleResult.add(new TriplePattern(
				monumentVariable, georssPoint, geoPointVariable));
		allTriplePatterns.add(singleResult);*/

		// quarta interrogazione a sindice: musei
		/*singleResult = new TriplePatternQueryImpl();
		singleResult.add(new TriplePattern(
				monumentVariable, skosSubject, dbpediaMuseum));
		singleResult.add(new TriplePattern(
				monumentVariable, georssPoint, geoPointVariable));
		allTriplePatterns.add(singleResult);*/

		// quinta interrogazione a sindice: piazze
		/*singleResult = new TriplePatternQueryImpl();
		singleResult.add(new TriplePattern(
				monumentVariable, skosSubject, dbpediaPiazza));
		singleResult.add(new TriplePattern(
				monumentVariable, georssPoint, geoPointVariable));
		allTriplePatterns.add(singleResult);*/
		
		//FIXME currently there are some triples missing to answer the full query
		//the missing triples are: <place-type> skos:broader <visitor-attraction>

		List<InformationSet> results = new ArrayList<InformationSet>();

		// per ogni interrogazione
		for (Query singleQuery : allTriplePatterns) {
			System.out.println("+++ processing query "+singleQuery.toString());
			try {
				for (int page = 0; page < NUM_PAGES_PER_REQUEST; ++page, ++mCurrentPage) {
					// crea l'invocazione REST di Sindice
					String url = makeSindiceQueryString(
							singleQuery, mCurrentPage);
					System.out.println("+++ Sindice query: "+url);
					// invoca il servizio
					String response = HttpUtils.sendGetRequest(url);
					// prende i risultati della prima pagina
					Collection<InformationSet> pageResults = parseResults(response);
					System.out.println("+++ Found results: "+pageResults.size());
					// li aggiunge ai risultati da selezionare poi con il selecter
					if (pageResults.size() == 0) {
						break;
					} else {
						results.addAll(pageResults);
					}
				}
				mCurrentPage = 1;
			} catch (Exception e) {
				log.severe("failed to identify sources: " + e.getMessage());
			}
		}

		if (results.isEmpty()) {
			return null;
		}
		return results;
	}

}
