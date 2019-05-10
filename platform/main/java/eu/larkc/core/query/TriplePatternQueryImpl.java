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

import java.util.ArrayList;
import java.util.Collection;

public class TriplePatternQueryImpl implements TriplePatternQuery {

	private Collection <TriplePattern> patterns = new ArrayList <TriplePattern> ();
	private static final long serialVersionUID = 1L;

	public TriplePatternQueryImpl() {
	}

	public TriplePatternQueryImpl(Collection <TriplePattern> thePatterns) {
		this.patterns.addAll(thePatterns);
	}
	
	@Override
	public void add(TriplePattern theTriplePattern){
		this.patterns.add(theTriplePattern);
	}
	
	@Override
	public void remove(TriplePattern theTriplePattern){
		this.patterns.remove(theTriplePattern);
	}
	
	@Override
	public void clear(){
		this.patterns.clear();
	}
	
	@Override
	public boolean isEmpty(){
		return this.patterns.isEmpty();
	}
	
	@Override
	public Collection<TriplePattern> getTriplePatterns() {
		return patterns;
	}
	
	@Override
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (TriplePattern tp : patterns){
			sb.append(tp.toString() + "\n");
		}
		sb.append("]\n");
		return sb.toString();
	}
}
