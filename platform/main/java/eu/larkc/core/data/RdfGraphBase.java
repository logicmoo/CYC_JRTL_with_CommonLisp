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

import org.openrdf.model.URI;

import eu.larkc.core.data.RdfGraph;

/**
 * This class is an abstract representation of RDF graph.
 * @author  vassil
 */
public abstract class RdfGraphBase implements RdfGraph {

	private static final long serialVersionUID = 7057670790905909162L;
	private URI name;

	public RdfGraphBase(URI name) {
		if (name == null) {
			throw new IllegalArgumentException("null!");
		}
		this.name = name;
	}

	@Override
	public URI getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name.stringValue();
	}
}
