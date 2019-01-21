/***
 *   Copyright (c) 1995-2008 Cycorp R.E.R. d.o.o
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package eu.larkc.core.orchestrator;

import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import eu.larkc.core.Larkc;

/**
 * Initialization of the LarKC platform.
 *  - adds the plug-ins information to the platform KB
 *  - loads plug-ins and registers them in the decider KB
 * 
 * @author Luka Bradesko, Blaz Fortuna
 */
public final class LarkcInit extends SubLTranslatedFile {

	public static final SubLFile me = new LarkcInit();
	public static final String myName = LarkcInit.class.getName();

	/**
	 * Registers the decider removal-module and initializes the platform  
	 */
	public static final SubLObject initializeLarkc() {			
		// adds initial Larkc platform ontology into the KB
		Larkc.Initialize();
		// done!
		return NIL;
	}
		
	@Override
	public void runTopLevelForms() {
		
	}

	@Override
	public void declareFunctions() {
		declareFunction(myName, "initializeLarkc", "INITIALIZE-LARKC", 0, 0, false);
	}

	@Override
	public void initializeVariables() {
		
	}

}// class LarkcInit
