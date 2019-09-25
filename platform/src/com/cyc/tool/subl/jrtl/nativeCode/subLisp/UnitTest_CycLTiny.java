/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.io.File;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;

import junit.framework.TestCase;

public class UnitTest_CycLTiny extends TestCase {

	static public String TEST_DIR = "/cyc/top/tests/";

	public static void main(final String[] args) {
		System.out.println("Starting");
		final Runtime rt = Runtime.getRuntime();
		SubLMain.me.processCommandLineArgs(args);
		final int length = args.length;
		if (length > 0) {
			File f = new File(args[length - 1]);
			if (f.isDirectory()) {
				TEST_DIR = f.getAbsolutePath() + File.separatorChar;
			} else {
				f = new File(args[0]);
				if (f.isDirectory()) {
					TEST_DIR = f.getAbsolutePath() + File.separatorChar;
				}
			}
		}
		try {
			SubLProcess subLProcess = new SubLProcess("Initial Lisp Listener") {

				@Override
				public void safeRun() {

					long startTime = System.currentTimeMillis();
					SubLMain me = SubLMain.me;
					SubLMain.initializeSubL(args);
					SubLMain me2 = SubLMain.me;
					SubLMain.initializeTranslatedSystems();
					long endTime = System.currentTimeMillis();
					double theTime = (endTime - startTime) / 1000.0;
					System.out.println("Internal Initialization time = " + theTime + " secs.");
					CommonSymbols.APPEND_STACK_TRACES_TO_ERROR_MESSAGES.setValue(T);
					startTime = System.currentTimeMillis();

					SubLString worldFile = SubLMain.getWorldFileName();

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
							SubLObject form = reader.read_from_string(initFormString, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
							form.eval(SubLEnvironment.currentEnvironment());
						} catch (Exception e2) {
							Errors.handleError("Failed evaluation initialization form: " + initForm, e2);
						}

					if (SubLMain.shouldQuitAfterExecutingInitializationForm())
						SubLMain.me.doSystemCleanupAndExit(0);

					Storage.gc_ephemeral();
					SubLMain.setIsInitialized();
					endTime = System.currentTimeMillis();
					theTime = (endTime - startTime) / 1000.0;
					System.out.println("Initialization time = " + theTime + " secs.");
					System.out.println("Total memory allocated to VM: " + (int) (rt.totalMemory() / 1048576.0) + "MB.");
					System.out.println("Memory currently available: " + (int) (rt.freeMemory() / 1048576.0) + "MB.");
					System.out.println("Memory currently used: " + (int) ((rt.totalMemory() - rt.freeMemory()) / 1048576.0) + "MB.");
					if (!SubLMain.shouldRunInBackground() || true) {
						System.out.println("Running all CycL unit tests.");

						SubLObject form2 = reader.read_from_string(SubLObjectFactory.makeString(
								//
								"(run-all-cyc-tests \"" + TEST_DIR + "\")"),
								//
								UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);

						form2.eval(SubLEnvironment.currentEnvironment());
					}
					if (!SubLMain.shouldRunInBackground()) {
						SubLMain.doMainReadLoop();
					}
				}

			};
			SubLThreadPool.getDefaultPool().execute(subLProcess);
		} catch (Exception e) {
			Errors.handleError(e);
		}
	}
}
