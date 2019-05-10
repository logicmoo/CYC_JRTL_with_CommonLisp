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
package eu.larkc.core.data;

import java.util.Set;

/**
 * SetOfStatements passed by references using a SPARQL dataset. Please note that
 * the current type represents all the statements retrieved from union of all
 * default and named graphs.
 * 
 * @author vassil
 * 
 */
public interface DataSet extends SetOfStatements {
	
	/**
	 * Gets the default graph URIs of this dataset. An empty set indicates that
	 * the default graph is an empty graph.
	 */
	public Set<RdfGraph> getDefaultGraphs();

	/**
	 * Gets the named graph URIs of this dataset. An empty set indicates that
	 * there are no named graphs in this dataset.
	 */
	public Set<RdfGraph> getNamedGraphs();

	/**
	 * Merges the current dataset with another one
	 * 
	 * @param theDataSet
	 *            to be merged with
	 */
	public void addAll(DataSet theDataSet);

	/**
	 * Get the SPARQL endpoint responsible for this dataset.
	 * 
	 * @return a SPARQL ednpoint to contains it
	 */
	public SPARQLEndpoint getSPARQLEndpoint();

	/*
	 * The method are too powerful and expressive. They might lead to intend
	 * usage.
	 * 
	 * public void addDefaultGraph(RdfGraph theRdfGraph);
	 * 
	 * public void removeDefaultGraph(RdfGraph theRdfGraph);
	 * 
	 * public void addNamedGraph(RdfGraph theRdfGraph);
	 * 
	 * public void removeNamedGraph(RdfGraph theRdfGraph);
	 */
}
