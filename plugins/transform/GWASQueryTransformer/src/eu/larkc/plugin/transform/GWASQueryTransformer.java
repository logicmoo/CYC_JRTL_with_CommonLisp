/*
 * Copyright (C) 2008-2010, The University of Sheffield, UK 
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

package eu.larkc.plugin.transform;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;

import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.Query;
import eu.larkc.core.query.SPARQLQueryImpl;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;

public class GWASQueryTransformer implements QueryTransformer {

	public boolean canTransform(Query theQuery) {
		return theQuery instanceof SPARQLQueryImpl;
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

	public Set<Query> transform(Query theQuery, Contract theContract,
			Context theContext) {

		Set<Query> result = new HashSet<Query>();

		if (!canTransform(theQuery))
			return result;

		SPARQLQueryImpl query = (SPARQLQueryImpl) theQuery;

		String original = query.toString();

		GWASQuery gwasQuery = new GWASQuery();

		Pattern p = Pattern
				.compile("([0-9])\\s+gwas:hasKeyword\\s+\"([^\"]+)\"");
		Matcher m = p.matcher(original);

		while (m.find()) {
			gwasQuery.keywords.add(m.group(2) + ";" + m.group(1));
		}

		p = Pattern.compile("gwas:searchInRif\\s+\"([^\"]+)\"");
		m = p.matcher(original);

		if (m.find())
			gwasQuery.searchInRIF = Boolean.parseBoolean(m.group(1));

		p = Pattern.compile("useUMLS\\s+\"([^\"]+)\"");
		m = p.matcher(original);

		if (m.find())
			gwasQuery.useUMLS = Boolean.parseBoolean(m.group(1));

		p = Pattern.compile("searchMode\\s+\"([^\"]+)\"");
		m = p.matcher(original);

		if (m.find())
			gwasQuery.searchMode = Integer.parseInt(m.group(1));

		p = Pattern.compile("dateConstraint\\s+\"([^\"]+)\"");
		m = p.matcher(original);

		if (m.find())
			gwasQuery.dateConstraint = Integer.parseInt(m.group(1));

		p = Pattern.compile("gwas:hasSnpId\\s+\"([^\"]+)\"");
		m = p.matcher(original);

		while (m.find()) {
			gwasQuery.snpIDs.add(m.group(1));
		}

		// TODO remove all lines containing "gwas:" if snpIDs is empty and there
		// is content between the {} then run the SPARQL against LLD to get the
		// SNP IDs

		/*
		 * System.setProperty("bk.endpoint", "http://linkedlifedata.com/");
		 * System.setProperty("bk.endpoint.username", "wp7b");
		 * System.setProperty("bk.endpoint.password", "wp7b");
		 * System.setProperty("repository.id", "owlim");
		 * 
		 * 
		 * Repository myRepository = new HTTPRepository(
		 * "http://linkedlifedata.com/", "owlim"); // Constants.SESAME_SERVER,
		 * Constants.REPOSITORY_ID); String username =
		 * System.getProperty("bk.endpoint.username"); String password =
		 * System.getProperty("bk.endpoint.password"); if (username != null &&
		 * password != null) { ((HTTPRepository)
		 * myRepository).setUsernameAndPassword( username, password); }
		 * RepositoryConnection connection = myRepository.getConnection();
		 * connection.setAutoCommit(false);
		 * 
		 * final TupleQueryResult tqResult = connection.prepareTupleQuery(
		 * QueryLanguage.SPARQL, sQuery.toString()).evaluate();
		 * 
		 * tqResult.close(); connection.close();
		 */

		result.add(gwasQuery);

		return result;
	}

	public URI getIdentifier() {
		return new URIImpl("urn:" + this.getClass().getCanonicalName());
	}

	public QoSInformation getQoSInformation() {
		return new QoSInformation() {
		};
	}

	public void setInputQuery(Query theQuery) {
		// what is this method for?
	}

	public static void main(String args[]) {
		QueryTransformer qt = new GWASQueryTransformer();

		Set<Query> q = qt.transform(new SPARQLQueryImpl(
				"PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\n"
						+ "PREFIX gwas: <http://www.gate.ac.uk/gwas#>\n"
						+ "SELECT * WHERE {\n"
						+ "gwas:x gwas:hasName \"test\".\n"
						+ "gwas:x gwas:hasKeywordGroup gwas:g1.\n"
						+ "gwas:g1 gwas:hasKeyword \"lung cancer\".\n"
						+ "gwas:x gwas:hasKeywordGroup gwas:g2.\n"
						+ "gwas:g2 gwas:hasKeyword \"lung\".\n"
						+ "gwas:g2 gwas:hasKeyword \"cancer\".\n"
						+ "gwas:x gwas:searchInRif \"false\".\n"
						+ "gwas:x gwas:useUMLS \"false\".\n"
						+ "gwas:x gwas:searchMode \"2\".\n"
						+ "gwas:x gwas:dateConstraint \"20071231\".\n"
						+ "gwas:x gwas:hasSnpId \"rs1051730\".\n"
						+ "gwas:x gwas:hasSnpId \"rs8034191\".\n"
						+ "gwas:x gwas:hasSnpId \"rs4324798\".\n"
						+ "gwas:x gwas:hasSnpId \"rs3117582\".\n"
						+ "gwas:x gwas:hasSnpId \"rs401681\".\n"
						+ "gwas:x gwas:hasSnpId \"rs2736100\".\n" + "} "),
				null, null);

		for (Query sq : q) {
			System.out.println(sq);
		}
	}
}
