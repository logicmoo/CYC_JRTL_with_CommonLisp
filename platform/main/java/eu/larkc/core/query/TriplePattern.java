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
package eu.larkc.core.query;

import java.io.Serializable;

import org.openrdf.model.Resource;
import org.openrdf.model.URI;
import org.openrdf.model.Value;

public class TriplePattern implements Serializable {

	private Resource subj;
	private URI pred;
	private Value obj;

	public TriplePattern(Resource subj, URI pred, Value obj) {
		this.subj = subj;
		this.pred = pred;
		this.obj = obj;
	}
	
	public Resource getSubject() {
		return subj;
	}

	public URI getPredicate() {
		return pred;
	}

	public Value getObject() {
		return obj;
	}
	
	@Override
	public String toString() {
		String subjectRepresentation = "*";
		if (subj != null){
			subjectRepresentation = subj.toString();
		}
		
		String predicateRepresentation = "*";
		if (pred != null){
			predicateRepresentation = pred.toString();
		}
		
		String objectRepresentation = "*";
		if (obj != null){
			objectRepresentation = obj.toString();
		}
		
		return String.format("[%s, %s, %s]", subjectRepresentation, predicateRepresentation, objectRepresentation);
	}
}
