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

import java.util.List;

import org.openrdf.model.Value;

/**
 * VariableBinding is SPARQL SELECT query result iterator.
 * 
 * @author vassil
 * 
 */
public interface VariableBinding extends InformationSet {

	/**
	 * Gets the list of variables in the projection.
	 * 
	 * @return
	 */
	List<String> getVariables();

	/**
	 * Gets an iterator of the solutions.
	 * 
	 * @return
	 */
	CloseableIterator<Binding> iterator();

	/**
	 * Binding is SPARQL SELECT solution.
	 * 
	 * @author vassil
	 * 
	 */
	public static interface Binding {
		/**
		 * Gets a list of the RDF values that are part of the query solution.
		 * 
		 * @return
		 */
		List<Value> getValues();
	}
}
