/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;

import java.io.File;

import org.logicmoo.system.Startup;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;

import junit.framework.TestCase;

public class UnitTest_CycLTiny extends TestCase {

	static public String TEST_DIR = ".";
	static public String[] TEST_DIR_ALTs = { "w:/cyc/top/tests/", "tests/", "top/tests/", "/cyc/top/tests/", };

	public static void main(final String[] args) {
		System.out.println("Starting");
		Startup.MainThreaded = true;
		SubLMain.memStatus("Start main");
		SubLMain.me.processCommandLineArgs(args);
		final int length = args.length;
		File f = null;
		if (length > 0) {
			f = new File(args[length - 1]);
			if (f.isDirectory()) {
				TEST_DIR = f.getAbsolutePath() + File.separatorChar;
			} else {
				f = new File(args[0]);
				if (f.isDirectory()) {
					TEST_DIR = f.getAbsolutePath() + File.separatorChar;
				}
			}
		} else {
			for (String s : TEST_DIR_ALTs) {
				f = new File(s, "testdcl.lisp");
				if (f.exists()) {
					TEST_DIR = f.getParentFile().getAbsolutePath() + File.separatorChar;
					break;
				}
			}
		}
		System.err.println("Using test dir " + TEST_DIR);
		SubLMain me0 = SubLMain.me;

		try {
			SubLProcess subLProcess = new SubLProcess("Initial Lisp Listener") {

				@Override
				public void safeRun() {
					final boolean shouldRunInBackground = SubLMain.shouldRunInBackground();
					//initCyc(args);
					SubLMain.setSubLisp(true);
					Startup.init_kb();
					SubLMain.memStatus("Init Complete");
					SubLPackage.setCurrentPackage("CYC");
					if (!shouldRunInBackground || true) {
						System.out.println("Running all CycL unit tests.");
						if (File.separatorChar == '\\') {
							TEST_DIR = TEST_DIR.replace("\\", "\\\\");
						}
						SubLObject form2 = reader.read_from_string(SubLObjectFactory.makeString(
								//
								"(run-all-cyc-tests \"" + TEST_DIR + "\")"),
								//
								UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);

						form2.eval(SubLEnvironment.currentEnvironment());
					}
					SubLMain.memStatus("Completed Tests");
					if (!shouldRunInBackground) {
						SubLMain.doMainReadLoop();
					}
				}

			};
			SubLThreadPool.getDefaultPool().execute(subLProcess);
		} catch (Exception e) {
			Errors.handleError(e);
		}
	}

	/**
	 * @param args
	 * @param rt
	 */
	static void initCyc(final String[] args) {
		SubLMain.memStatus("Start Init");
		long startTime = System.currentTimeMillis();
		SubLMain me = SubLMain.me;
		SubLMain.initializeSubL(args);
		SubLMain.setTrueMainReaderThread();
		SubLMain.initializeTranslatedSystems();
		long endTime = System.currentTimeMillis();
		double theTime = (endTime - startTime) / 1000.0;
		System.out.println("Internal Initialization time = " + theTime + " secs.");
		CommonSymbols.APPEND_STACK_TRACES_TO_ERROR_MESSAGES.setValue(CommonSymbols.T);
		startTime = System.currentTimeMillis();
		SubLMain.memStatus("Mid Init");
		SubLPackage.setCurrentPackage("CYC");

		SubLString worldFile = SubLMain.getWorldFileName();

		SubLString initFile = SubLObjectFactory.makeString("init/jrtl-init.lisp");

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
	}
}
