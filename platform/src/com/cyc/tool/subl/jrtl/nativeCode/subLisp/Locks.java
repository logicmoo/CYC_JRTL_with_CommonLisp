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

package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;

//// Internal Imports

//// External Imports

public class Locks implements SubLFile {

	//// Constructors

	public static SubLFile me = new Locks();

	public static SubLObject lock_idle_p(SubLObject lock) {
		if (lock.toLock().isIdle())
			return CommonSymbols.T;
		return CommonSymbols.NIL;
	}

	//// Public Area

	public static SubLObject lock_locker(SubLObject lock) {
		SubLObject locker = lock.toLock().getLocker();
		if (locker == null)
			return CommonSymbols.NIL;
		return locker;
	}

	public static SubLObject lock_name(SubLObject lock) {
		return lock.toLock().getName();
	}

	public static SubLObject make_lock(SubLObject name) {
		return SubLObjectFactory.makeLock(name.toStr());
	}

	public static SubLObject release_lock(SubLObject lock) {
		lock.toLock().releaseLock();
		return lock;
	}

	public static SubLObject seize_lock(SubLObject lock) {
		lock.toLock().seizeLock();
		return lock;
	}

	/** Creates a new instance of Locks. */
	public Locks() {
	}

	//// Initializers

	public void declareFunctions() {
		SubLFiles.declareFunction(Locks.me, "make_lock", "MAKE-LOCK", 1, 0, false);
		SubLFiles.declareFunction(Locks.me, "lock_name", "LOCK-NAME", 1, 0, false);
		SubLFiles.declareFunction(Locks.me, "lock_locker", "LOCK-LOCKER", 1, 0, false);
		SubLFiles.declareFunction(Locks.me, "lock_idle_p", "LOCK-IDLE-P", 1, 0, false);
		SubLFiles.declareFunction(Locks.me, "seize_lock", "SEIZE-LOCK", 1, 0, false);
		SubLFiles.declareFunction(Locks.me, "release_lock", "RELEASE-LOCK", 1, 0, false);

	}

	public void initializeVariables() {
	}

	public void runTopLevelForms() {
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	//// Main

}
