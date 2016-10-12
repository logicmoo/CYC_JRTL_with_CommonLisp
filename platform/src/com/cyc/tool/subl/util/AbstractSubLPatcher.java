/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
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
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.tool.subl.util;

//// Internal Imports

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;

//// External Imports

public abstract class AbstractSubLPatcher implements SubLPatcher {

	//// Constructors

	/** Creates a new instance of AbstractSubLPatcher. */
	public AbstractSubLPatcher() {
	}

	//// Public Area

	public void doPatch() {
		String[] patchedClasses = this.getPatchedClasses();
		if (patchedClasses == null)
			return;
		for (String className : patchedClasses)
			Eval.patchSubLFile(SubLObjectFactory.makeString(className));
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	//// Main

}
