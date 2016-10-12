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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.ui.SubLReaderPanel;

/**
 * <P>
 * This JUnit test file will test the functionality of the read-eval
 * functionality used by SubLMain. Search for occurrences of @diff to see all
 * C/Allegro/CMUCL/Java differences.
 *
 * <P>
 * Copyright (c) 2004 - 2006 Cycorp, Inc. All rights reserved. <BR>
 * This software is the proprietary information of Cycorp, Inc.
 * <P>
 * Use is subject to license terms.
 *
 * @author pace
 * @date December 15, 2005, 3:22 PM
 * @version $Id: UnitTest_CycLTiny.java 126640 2008-12-04 13:39:36Z builder $
 */

public class UnitTest_CycLTiny implements CommonSymbols {

	//// Constructors

	//// Public Area

	//// Protected Area

	//// Private Area

	//// Main

	/**
	 * @param args
	 *            the command line arguments
	 */
	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(final String[] args) {
		System.out.println("Starting");
		final Runtime rt = Runtime.getRuntime();
		SubLMain.me.processCommandLineArgs(args);
		try {
			SubLProcess subLProcess = new SubLProcess("Initial Lisp Listener") {

				public void safeRun() {
					long startTime = System.currentTimeMillis();
					SubLMain.initializeSubL(args);
					SubLMain.initializeTranslatedSystems();
					long endTime = System.currentTimeMillis();
					double theTime = (endTime - startTime) / 1000.0;
					System.out.println("Internal Initialization time = " + theTime + " secs.");
					// @hack hack hack
					CommonSymbols.SHOW_STACK_TRACES.setValue(CommonSymbols.T);
					CommonSymbols.APPEND_STACK_TRACES_TO_ERROR_MESSAGES.setValue(CommonSymbols.T);
                    // @end-hack hack hack

					startTime = System.currentTimeMillis();
					SubLString worldFile = SubLMain.getWorldFileName();
					// @todo do something with worldFile if not null here -APB
					SubLString initFile = SubLObjectFactory.makeString("/cyc/top/init/jrtl-init.lisp");
					if (initFile != null)
						try {
							Eval.load(initFile);
						} catch (Exception e) {
							Errors.handleError("Failed to load initialization file: " + initFile, e);
						}
					String initForm = SubLMain.getInitializationForm();
					if (initForm != null)
						try {
							SubLString initFormString = SubLObjectFactory.makeString(initForm);
							SubLObject form = reader.read_from_string(initFormString, CommonSymbols.T,
									CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
									CommonSymbols.UNPROVIDED);
							form.eval(SubLEnvironment.currentEnvironment());
						} catch (Exception e) {
							Errors.handleError("Failed evaluation initialization form: " + initForm, e);
						}
					if (SubLMain.shouldQuitAfterExecutingInitializationForm())
						SubLMain.me.doSystemCleanupAndExit(0);

					if (!SubLMain.shouldRunInBackground()) {
						Storage.gc_ephemeral();
						SubLMain.setIsInitialized();
						endTime = System.currentTimeMillis();
						theTime = (endTime - startTime) / 1000.0;
						System.out.println("Initialization time = " + theTime + " secs.");
						System.out.println("Total memory allocated to VM: "
								+ (int) (rt.totalMemory() / (1024.0 * 1024.0)) + "MB.");
						System.out.println(
								"Memory currently available: " + (int) (rt.freeMemory() / (1024.0 * 1024.0)) + "MB.");
						System.out.println("Memory currently used: "
								+ (int) ((rt.totalMemory() - rt.freeMemory()) / (1024 * 1024.0)) + "MB.");

						System.out.println("Running all CycL unit tests.");

						SubLObject form = reader.read_from_string(
								SubLObjectFactory.makeString("(run-all-cyc-tests \"/cyc/top/tests/\")"),
								CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
								CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
						form.eval(SubLEnvironment.currentEnvironment());

						if (SubLMain.shouldRunReadloopInGUI())
							SubLMain.setMainReader(SubLReaderPanel.startReadloopWindow());
						SubLMain.getMainReader().doReadLoop();
					}
				}
			};
			SubLThreadPool.getDefaultPool().execute(subLProcess);
		} catch (Exception e) {
			Errors.handleError(e);
		}
	}

}
