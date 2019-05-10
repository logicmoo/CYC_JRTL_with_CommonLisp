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
package eu.larkc.core.orchestrator;

import java.util.Hashtable;

public class OwlToCycMapping {
	
	private Hashtable<String, String> mapping;
	private String SW_OPENCYC_URL = "http://sw.opencyc.org/2009/04/07/concept/en/";
	
	public OwlToCycMapping() {
		// prepare mappings
		mapping = new Hashtable<String, String>();
		mapping.put("http://www.w3.org/2000/01/rdf-schema#Class", "Collection");
		mapping.put("http://www.w3.org/1999/02/22-rdf-syntax-ns#type", "isa");
		mapping.put("http://www.w3.org/2000/01/rdf-schema#subClassOf", "genls");
		mapping.put("http://www.w3.org/2000/01/rdf-schema#domain",	 "arg1Isa");
		mapping.put("http://www.w3.org/2000/01/rdf-schema#range", "arg2Isa");
		mapping.put("http://www.w3.org/1999/02/22-rdf-syntax-ns#Property", "BinaryPredicate");
		mapping.put("http://www.w3.org/2002/07/owl#TransitiveProperty", "TransitiveBinaryPredicate");
		
		mapping.put("http://www.w3.org/2001/XMLSchema#string", "CharacterString");
		mapping.put("http://www.w3.org/2001/XMLSchema#boolean", "TruthValue");
		mapping.put("http://www.w3.org/2001/XMLSchema#float", "SubLRealNumber");
		mapping.put("http://www.w3.org/2001/XMLSchema#int", "SubLInteger");
		
		mapping.put("http://www.w3.org/2000/01/rdf-schema#isDefinedBy", "containsInformationAbout");
		mapping.put("http://www.w3.org/2000/01/rdf-schema#label", "prettyString");
		mapping.put("http://www.w3.org/2000/01/rdf-schema#comment", "comment");
		mapping.put("http://www.w3.org/2000/01/rdf-schema#Resource", "Thing");
		
		//the mapping to those two is missing in the rdf
		//mapping.put("http://larkc.eu/plugin#genlrange", "arg2Genl");
		//mapping.put("http://larkc.eu/plugin#genldomain", "arg1Genl");
	}
	
	public boolean isCycEquivalent(String rdfTerm) {
		if (mapping.containsKey(rdfTerm))
			return true;
		
		return rdfTerm.startsWith(SW_OPENCYC_URL);
	}
	
	public String getCycEquivalent(String rdfTerm) {
		if (mapping.containsKey(rdfTerm)) {
			return mapping.get(rdfTerm);
		}
		else if (rdfTerm.startsWith(SW_OPENCYC_URL)){
			return rdfTerm.substring(SW_OPENCYC_URL.length());
		}
	
		return null;
	}
	
	public String toCycConst(String rdfTerm) {
		// first we make the string pretty for known name-spaces
		rdfTerm = rdfTerm.replaceFirst("http://larkc.eu/plugin#", "larkc-");
		rdfTerm = rdfTerm.replaceFirst("http://www.wsmo.org/ns/wsmo-lite#", "wsl-");
		// make it pretty if still necessary
		final int len = rdfTerm.length();
		StringBuffer cycConst = new StringBuffer();
		for (int chN = 0; chN < len; chN++) {
			char ch = rdfTerm.charAt(chN);
			if (Character.isLetter(ch)) { cycConst.append(ch); }
			else if (Character.isDigit(ch)) { cycConst.append(ch); }
			else if (ch == ':' || ch == '-' || ch == '_') { cycConst.append(ch); }
			else { cycConst.append('-'); }
		}
		return cycConst.toString();		
	}
	
}