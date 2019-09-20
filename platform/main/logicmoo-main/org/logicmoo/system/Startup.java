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
package org.logicmoo.system;

import static org.armedbear.lisp.Lisp.PACKAGE_CL;
import static org.armedbear.lisp.Lisp.PACKAGE_CL_USER;
import static org.armedbear.lisp.Lisp.PACKAGE_CYC;
import static org.armedbear.lisp.Lisp.PACKAGE_EXT;
import static org.armedbear.lisp.Lisp.PACKAGE_JAVA;
import static org.armedbear.lisp.Lisp.PACKAGE_SUBLISP;
import static org.armedbear.lisp.Lisp.UNPROVIDED;
import static org.logicmoo.system.BeanShellCntrl.bsh_desktop;
import static org.logicmoo.system.BeanShellCntrl.bsh_eval;
import static org.logicmoo.system.BeanShellCntrl.showObject;

import java.awt.Container;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.Thread.UncaughtExceptionHandler;
import java.lang.management.ClassLoadingMXBean;
import java.lang.management.CompilationMXBean;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryManagerMXBean;
import java.lang.management.MemoryPoolMXBean;
import java.lang.management.OperatingSystemMXBean;
import java.lang.management.PlatformManagedObject;
import java.lang.management.RuntimeMXBean;
import java.lang.management.ThreadMXBean;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.JOptionPane;

import org.armedbear.j.Editor;
import org.armedbear.j.JLisp;
import org.armedbear.j.LispClient;
import org.armedbear.lisp.ABCLStatic;
import org.armedbear.lisp.ConditionThrowable;
import org.armedbear.lisp.Cons;
import org.armedbear.lisp.ControlTransfer;
import org.armedbear.lisp.Debug;
import org.armedbear.lisp.Environment;
import org.armedbear.lisp.Function;
import org.armedbear.lisp.IdentitySetWithIndex;
import org.armedbear.lisp.Interpreter;
import org.armedbear.lisp.Interpreter.UnhandledCondition;
import org.armedbear.lisp.JavaObject;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.LispClass;
import org.armedbear.lisp.LispError;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.LispThread;
import org.armedbear.lisp.Main;
import org.armedbear.lisp.Operator;
import org.armedbear.lisp.Package;
import org.armedbear.lisp.Packages;
import org.armedbear.lisp.ProcessingTerminated;
import org.armedbear.lisp.SimpleString;
import org.armedbear.lisp.SlotDefinition;
import org.armedbear.lisp.SpecialBindingsMark;
import org.armedbear.lisp.StandardClass;
import org.armedbear.lisp.StandardObject;
import org.armedbear.lisp.Stream;
import org.armedbear.lisp.StructureClass;
import org.armedbear.lisp.StructureObject;
import org.armedbear.lisp.Symbol;
import org.armedbear.lisp.TwoWayStream;
import org.armedbear.lisp.Version;
import org.jpl7.Atom;
import org.jpl7.Compound;
import org.jpl7.JPL;
import org.jpl7.JPLException;
import org.jpl7.JRef;
import org.jpl7.Query;
import org.jpl7.Term;
import org.jpl7.Variable;
import org.jpl7.fli.Prolog;
import org.jpl7.fli.term_t;
import org.logicmoo.bb.BeanBowl;

import com.cyc.cycjava.cycl.constant_completion_high;
import com.cyc.cycjava.cycl.constant_completion_low;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.dumper;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.JavaLink;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.LispSync;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrologSync;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Resourcer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLListListIterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLReader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperator;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLBoolean;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.ui.SubLReaderPanel;
import com.cyc.tool.subl.util.IsolatedClassLoader;
import com.cyc.tool.subl.util.SafeRunnable;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import bsh.EvalError;
import bsh.NameSpace;
import bsh.util.Sessiond;
import eu.larkc.core.orchestrator.servers.LarKCHttpServer;
import net.wimpi.telnetd.TelnetD;
import sun.misc.Unsafe;

/**
 * TODO Describe this type briefly.
 * If necessary include a longer description and/or an example.
 *
 * @author Administrator
 *
 */
//import org.opencyc.cycobject.CycConstant;
public class Startup extends ABCLStatic {

	public static final String[] StringArrayZero = new String[0];
	static WorkQueue initServerQueue = null;
	private static Thread cycInitThread;

	// Background CYC Inits
	static public void callInCycInitThread(Runnable r) {
		if (initServerQueue == null) {
			initServerQueue = WorkQueue.getWorkerQueue("CycInit");
			callInCycInitThread(() -> {
				final Thread currentThread = Thread.currentThread();
				currentThread.setName("cycInitThread");
				cycInitThread = currentThread;
			});
		} else {
			final Thread currentThread = Thread.currentThread();
			if (currentThread == cycInitThread) {
				try {
					r.run();
				} catch (Throwable e) {
					addUncaught(e);
				}
				return;
			}
		}
		initServerQueue.execute(r);
	}

	static {
		// Capture original System streams and replace with thread aware streams
		SystemCurrent.setupIO();
	}

	// Use Tomcat instead of Jetty
	public static boolean USE_TOMCAT = false;
	// DEBUG to skip slow diagnostics
	public static boolean maybeTooSlow = false;
	// for UPTIME
	public static final long systemStartTimeMillis = System.currentTimeMillis();

	enum FeatureStatus {
		Unset, Requested, Begun, Running, Complete, Terminated, Disabled, Denied, TerminatedError,
	}

	// There should only be one globalInterpreter.
	public static Interpreter globalInterpreter;
	// A java main is starting this.. not a junit test
	// (therefore dont wait for all inits to finish)
	public static boolean MainThreaded = false;
	// Do not fork to a larger thread
	public static boolean useMainThread = false;
	// Do not allow code that calls System.exit(.) to exit
	public static boolean noExit = true;
	// DEBUG Don't exit after running program
	public static boolean waitForTermination;
	// DEBUG struggle passed load errors
	public static boolean keepGoing = false;
	// Need a home for STDIO still
	public static boolean needIOConsole = true;

	// Assume (load "boot.lisp") has happened
	public static boolean began_load_boot_lisp;
	// ABCL is bootstrapped enough to compile/run lisp code
	public static boolean finishedBoot_lisp;
	// FEATURE :J is needed/reqested
	public static boolean jlisp_requested = false;
	// Assume (load "j.lisp") has happened
	public static boolean began_load_J_lisp;
	// Quiet / No Banners / Diagnostic Info
	public static boolean noinform = false;
	// --help will turn on switch descriptions
	public static boolean help = false;
	// Skip compiled classes (Needed to be able to compile the system)
	public static boolean nosystem = false;
	// Skip the .abclrc (Needed to be able to compile the system)
	public static boolean noinit = false;
	// Assume (load "system.lisp") has happened
	public static boolean began_load_system_lisp;
	// Avoid any "early" SubL Support Features  (Needed to be able to compile the system)
	public static boolean leanABCL = false;
	// CYC needs ABCLs Argument Processor to run
	public static boolean abclProcessArgs = true;
	// ABCL has imported limited CYC functions
	public static boolean status_cl_sees_cyc_began;
	// Use CYC Error Handlers/Threading by default (This becomes true as CYC loads)
	public static boolean isSublispDefault = false;
	// Initialize SubL (This becomes true)
	public static boolean needSubLMAIN = false;
	// Assume (init-subl) has happened
	public static boolean began_init_subl;
	// Wait for .initrc to (init-cyc) has happened
	public static boolean noInitCyc = false;
	// Avoid mistaken too early classloading
	public static boolean commonSymbolsOK = false;
	// Assume (init-cyc) has happened
	public static boolean began_load_cyc_classes;
	// Assume CYC has imported the CL
	public static boolean status_cyc_sees_cl_began;
	// System is ready to load KB
	public static boolean finished_load_cyc_classes;
	// World files mentioned on cmdline
	public static boolean hasCycCmdlineInits = false;
	// Assume (init-kb) has happened
	public static boolean began_load_kb;
	// Assume (init-cyc) has happened
	public static boolean began_init_server;
	// Load all Tactics before the KB
	public static boolean cycPart2Early = false;
	// Skip loading possibly broken/experiental tactics
	public static boolean noCycPart2 = false;

	public static boolean OPENCYC = false;
	public static boolean TINY_KB = false;

	// Disallow all symbol redefinitions at runtime
	public static boolean Never_REDEFINE = false;
	// Allow all symbol redefinitions at runtime
	public static boolean Always_REDEFINE = false;
	// Allow workarounds until bugs are fixed
	public static boolean BOOTY_HACKZ = true;

	// ABCL cmdline arguments
	public static String[] passedArgs;
	// CYC cmdline arguments
	public static String[] cycCmdArgs = StringArrayZero;
	public static String[] defaultCycCmdArgs = new String[] { "-f", "(progn (load \"init/jrtl-release-init.lisp\")  (load \"init/port-init.lisp\"))" };

	// Disable Prolog Features
	public static boolean noProlog = true;
	// Disable JNI Prolog Features
	public static boolean noPrologJNI = false;
	// Track low level system operations in the KB or Prolog
	public static boolean trackStructs = true;
	// Disable Prolog tracking
	public static boolean noPrologSync = true;
	// Disable KB edits/tracking of system state
	public static boolean noLispSync = true;
	// Disable X11
	public static boolean noGUI = false;
	// Disable Runtime Scripting of CYC call-by-name
	public static boolean noBSH = false;
	// Use X11 JDesktop Pane
	public static FeatureStatus useBeanDeskGUI = FeatureStatus.Unset;
	// Desktop Init-script name
	public static String desktopStatement = "sdesktop()";
	// User requested X11
	public static boolean guiRequested_Any = false;
	// Enable WebSwing UIs
	public static boolean usewebswing = false;
	// Is _using_ WebSwing UI
	public static boolean isWebSwing = false;
	// Desktop Pain Manager
	public static Class guiClass;
	// --j Deskop/File manager requested
	public static boolean guiJRequested = false;
	// Used to decide how we got classloaded
	public static Class firstMain = null;
	// Which main we meant to use
	public static String mainClass;
	// Simulate WebSwing UI
	public static boolean fakewebswing;
	// General Debug Stream
	public static PrintStream noticeStream = System.err;

	// Recording of random unhandled exceptions
	public static final List<UncaughtException> unexpectedThrowables = new ArrayList<UncaughtException>(10);
	public static final UncaughtExceptionHandler uncaughtExceptionHandler = new ABCLMainUncaughtExceptionHandler();

	// Assumed Exit code
	public static int exitCode = 0;
	public static final Thread shutdownhook;
	static {
		shutdownhook = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					final PrintStream noticeStream = getNoticeStream();
					if (shutdownRequested != null) {
						noticeStream.println("Shutdown Hook Began from " + shutdownRequested);
						showST(shutdownRequested.getStackTrace(), noticeStream);
					} else {
						shutdownRequested = shutdownhook;
						noticeStream.println("Unknown caller");
					}
					reportUncaughts();
					noticeStream.println("Shutdown Hook Completed");
				} catch (Throwable e) {
					noticeStream.println("Shutdown Hook Error");
					showST(e, noticeStream);
				}
				waitForTermination = false;
			}

			@Override
			public String toString() {
				return "shutdownhook";
			}
		});
		Runtime.getRuntime().addShutdownHook(shutdownhook);

	}

	private static UncaughtExceptionHandler initialUncaughtExceptionHandler;
	static {
		initialUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
		if (initialUncaughtExceptionHandler == null) {
			Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
		}

	}

	public static String[] extractOptions(Class c, String[] args) {
		if (firstMain == null || Editor.class == c) {
			MainThreaded = true;
			if (c != null)
				firstMain = c;
		}
		return extractOptions(args);
	}

	public static String[] extractMissedDsAndAllegro(String... args) {
		ArrayList<String> av = new ArrayList<String>();
		for (int i = 0; i < args.length; i++) {
			String thisArg = args[i];
			if (thisArg == null)
				continue;

			int equals = thisArg.indexOf("=");
			if (thisArg.startsWith("-D") && equals > 0) {
				equals -= 2;
				thisArg = thisArg.substring(2);
				String name = unquote(thisArg.substring(0, equals));
				String value = unquote(thisArg.substring(equals + 1));
				System.setProperty(name, value);
				continue;
			} else if (thisArg.startsWith("--main")) {
				if (equals > 0) {
					mainClass = unquote(thisArg.substring(equals + 1));
				} else {
					mainClass = unquote(args[++i]);
				}
				continue;
			} else if (thisArg.startsWith("-cp")) {
				if (equals > 0) {
					IsolatedClassLoader.addCommonClassPath(unquote(thisArg.substring(equals + 1)));
				} else {
					IsolatedClassLoader.addCommonClassPath(unquote(args[++i]));
				}
				continue;
			}

			// AllegroCL args
			if (thisArg.equals("-L")) {
				thisArg = "--load";
			} else if (thisArg.equals("-E")) {
				thisArg = "--eval";
			}

			if (thisArg.startsWith("--no-")) {
				thisArg = "--no" + thisArg.substring(5);
			} else if (thisArg.startsWith("--disable-")) {
				thisArg = "--no" + thisArg.substring(9);
			} else if (thisArg.startsWith("--enable-")) {
				thisArg = "--" + thisArg.substring(8);
			}
			if (thisArg.endsWith("=false") || thisArg.endsWith("=0")) {
				thisArg = "--no" + thisArg.substring(0, equals - 1);
			}

			equals = thisArg.indexOf("=");
			if (equals > 0) {
				String name = unquote(thisArg.substring(0, equals));
				av.add(name);
				String value = unquote(thisArg.substring(equals + 1));
				av.add(value);
				continue;
			}

			thisArg = unquote(thisArg);

			av.add(thisArg);
		}

		return av.toArray(StringArrayZero);
	}

	private static String[] extractCycArgs(String[] args) {
		SubLMain me = SubLMain.me;
		ArrayList<String> av = new ArrayList<String>();
		ArrayList<String> cycArgsList = new ArrayList<String>();
		for (int i = 0, size = args.length; i < size; ++i) {
			String arg = args[i];
			if (SubLMain.noArgCommandLineArgs.contains(arg)) {
				me.argNameToArgValueMap.put(arg, Boolean.TRUE);
			} else if (SubLMain.argRequiredCommandLineArgs.contains(args[i])) {
				if (i == size)
					Errors.error("Not enough command line arguments given for: " + arg);
				cycArgsList.add(args[i]);
				final String value = args[++i];
				hasCycCmdlineInits = true;
				cycArgsList.add(value);
				me.argNameToArgValueMap.put(arg, value);
			} else {
				av.add(args[i]);
				//Errors.error("Got invalid command line argument: " + args[i]);
			}
		}

		if (cycArgsList.size() == 0) {
			me.processCommandLineArgs(StringArrayZero);
		} else {
			cycCmdArgs = cycArgsList.toArray(StringArrayZero);
		}
		return av.toArray(StringArrayZero);
	}

	public static String[] extractOptions(String... args) {
		final PrintStream to = getNoticeStream();

		final List<String> orginalArgs = Arrays.asList(args);

		args = extractCycArgs(args);

		args = extractMissedDsAndAllegro(args);

		if (!orginalArgs.contains("-cp")) {
			IsolatedClassLoader.addDefaultJarsToClassPath(getPlatformDir());
		}

		List<String> av = new ArrayList(Arrays.asList(args));

		Label_argList: do {

			if (av.remove("--headless") || av.remove("--nogui")) {
				noGUI = true;
			}

			if (av.remove("--guij")) {
				guiJRequested = true;
			}

			if (av.remove("--all")) {
				pushNew(av, "--rcyc");
				pushNew(av, "--cyc");
				pushNew(av, "--j");
				pushNew(av, "--lispsync");
				pushNew(av, "--prologsync");
				pushNew(av, "--beandesk");
				pushNew(av, "--prolog");
				pushNew(av, "--telnetd");
				pushNew(av, "--web");
				keepGoing = true;
				leanABCL = false;
				//noinit = false;
			}

			if (av.remove("--telnetd")) {
				TelnetD.main(StringArrayZero);
			}

			if (av.contains("--fakewebswing")) {
				pushNew(av, "--webswing");
				fakewebswing = true;
			}

			if (av.remove("--web")) {
				USE_TOMCAT = true;
			}

			if (av.remove("--noweb")) {
				USE_TOMCAT = false;
			}

			if (av.remove("--webswing")) {
				if (to != null) {
					to.println("PWD:" + (new File(".").getAbsolutePath()));
				}
				isWebSwing = true;
				noExit = true;
				pushNew(av, "--gui");
				pushNew(av, "--noj");
				pushNew(av, "--rcyc");
				noExit = true;
				enablewebswing();
			}

			if (av.remove("--gui")) {
				keepGoing = true;
				guiRequested_Any = true;
				useBeanDeskGUI = FeatureStatus.Requested;
				//pushNew(av, "--j");
				enableAllCWD();
				if (to != null) {
					to.println("PWD1:" + (new File(".").getAbsolutePath()));
				}

			}

			if (av.remove("--noj")) {
				Interpreter.jlisp_requested = false;
			}

			if (av.contains("--compile-system")) {
				pushNew(av, "--lisp");
			}

			if (av.remove("--abcl")) {
				pushNew(av, "--lisp");
			}

			if (av.remove("--lisp")) {
				isSublispDefault = false;
				abclProcessArgs = true;
				noProlog = true;
				leanABCL = true;
				//noinit = false;
				//nosystem = false;
				//noPrologJNI = false;
				// noBSH = true;
				Main.setSubLisp(false);
				//pushNew(av, "--nocyc");
				//pushNew(av, "--nocyc2");
				//pushNew(av, "--noprolog");
				//continue Label_argList;
			}

			if (av.remove("--fakewebswing")) {
				fakewebswing = true;
			}

			if (av.remove("--main-thread")) {
				Main.useMainThread = true;
			}
			if (av.remove("--nomain-thread")) {
				Main.useMainThread = false;
			}

			if (av.contains("--nosystem")) {
				pushNew(av, "--noprolog");
				nosystem = true;
				leanABCL = true;
			}

			// CYC STUFFF
			if (av.remove("--nocyc2")) {
				noCycPart2 = true;
			}

			if (av.remove("--opencyc")) {
				SubLMain.OPENCYC = true;
				isSublispDefault = true;
				try {
					UpdateZip.updateUnits("5022");
				} catch (Throwable e) {
					printStackTrace(e);
					if (!keepGoing)
						throw new RuntimeException(" UpdateZip.updateUnits throw " + e, e);
				}
			}

			if (av.remove("--rcyc2")) {
				pushNew(av, "--rcyc");
				pushNew(av, "--cyc2");
				continue Label_argList;
			}

			if (av.remove("--rcyc")) {
				SubLMain.OPENCYC = false;
				try {
					UpdateZip.updateUnits("7166");
				} catch (Throwable e) {
					printStackTrace(e);
					if (!keepGoing)
						throw new RuntimeException(" UpdateZip.updateUnits throw " + e, e);
				}
				av.add("--load");
				av.add("cyc.lisp");
			}

			if (av.remove("--cyc2")) {
				cycPart2Early = true;
				pushNew(av, "--cyc");
			}

			if (av.remove("--cyc")) {
				needSubLMAIN = true;
				isSublispDefault = true;
				SubLMain.noInitCyc = false;
			}
			if (av.remove("--nocyc")) {
				needSubLMAIN = false;
				noInitCyc = true;
				isSublispDefault = false;
			}

			// PROLOG STUFFF

			if (av.remove("--noprolog") || av.remove("--noswi")) {
				noPrologJNI = true;
			}

			if (av.remove("--fromprolog")) {
				//disablePrologSync = false;
				app_started_from_prolog = true;
				noPrologJNI = false;
				noProlog = false;
			}

			if (av.remove("--prologsync")) {
				noPrologSync = false;
				trackStructs = true;
				noPrologJNI = false;
				//			JPL.init();
				//			Query.oneSolution("ensure_loaded(library(jpl))");
				//			Query.oneSolution("interactor");
				/// Query.oneSolution("jcall('com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain',mainFromProlog,[])");

			}

			if (av.remove("--noprologsync")) {
				noPrologSync = true;
			}

			if (av.remove("--lispsync")) {
				noLispSync = false;
				trackStructs = true;
			}

			if (av.remove("--nolispsync")) {
				noLispSync = true;
			}

			if (av.remove("--prolog")) {
				noProlog = false;
				noPrologJNI = false;
			}

			if (!leanABCL) {
				if (!av.contains("-cp")) {
					final String baseFrom = System.getProperty("user.dir", ".");
					to.println("addDefaultJarsToClassPath from " + baseFrom);
					IsolatedClassLoader.getCommonClassLoader().addDefaultJarsToClassPath(baseFrom);
				}
			}
			if (av.remove("--beanshell")) {
				extractOptions("--lisp");
				waitForTermination = true;
				desktopStatement = "desktop();";
				useBeanDeskGUI = FeatureStatus.Requested;
				break;
			}
			if (av.remove("--beandesk")) {
				waitForTermination = true;
				desktopStatement = "sdesktop();";
				useBeanDeskGUI = FeatureStatus.Requested;
				break;
			}

			if (leanABCL || ((av.contains("--nosystem") || av.contains("--noinit") || noinform) && !needSubLMAIN)) {
				leanABCL = true;
				noExit = false;
			}

			if (!leanABCL) {
				try {
					IsolatedClassLoader.configChecks();
				} catch (Throwable e) {
					printStackTrace(e);
				}
			}

			break;
		} while (true);

		String[] argsNew = jiggleEvalArgs(av.toArray(StringArrayZero));

		if (argsNew.length > 0) {
			final java.io.File file = new java.io.File(argsNew[0]);
			if (file.exists() && file.isFile() && file.canRead()) {
				av = new ArrayList<String>(Arrays.asList(argsNew));
				pushNew(av, "--load");
				argsNew = av.toArray(StringArrayZero);
			}
		}

		passedArgs = argsNew;

		try {
			if (!leanABCL) {
				startServers(0);
			}
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			printStackTrace(e);
		}

		if (useBeanDeskGUI == FeatureStatus.Requested) {
			bsh_desktop();
			useBeanDeskGUI = FeatureStatus.Begun;
			needIOConsole = false;

		} else if (needIOConsole) {

			if (!leanABCL) {
				//SystemCurrent.setupIO();
				SystemCurrent.attachConsole(true);
				//SystemCurrent.takeOwnerShip();
			}
		}

		if (mainClass != null) {
			try {
				Class c = Class.forName(mainClass);
				Class[] parameterTypes = new Class[1];
				parameterTypes[0] = String[].class;
				Method method = c.getMethod("main", parameterTypes);
				Object[] parameters = new Object[] { argsNew };
				method.invoke(null, parameters);

			} catch (Throwable e) {
				printStackTrace(e);
				addUncaught(e);
			}
		}

		if (leanABCL && !waitForTermination) {

			Runtime.getRuntime().removeShutdownHook(shutdownhook);
		}

		while (waitForTermination) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				printStackTrace(e);
				break;
			}
		}

		if (mainClass != null) {
			// assume already ran
			exit(exitCode);
		}

		return argsNew;
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param substring
	 * @return
	 */
	public static String unquote(String substring) {
		int len = substring.length();
		char first = substring.charAt(0);
		char last = substring.charAt(len - 1);
		if ((first == '"' && last == '"') || (first == '\'' && last == '\'') || (first == '`' && last == '\'')) {
			substring = substring.substring(1, len - 1);
			if (last != '"') {
				substring = substring.replaceAll("\\\"", "\"");
			} else {
				substring = substring.replaceAll("\\\'", "\'");
			}
			substring = substring.replaceAll("\\\\'", "\\");
		}
		return substring;
	}

	public static boolean isSubLisp() {
		return isSubLisp.get();
	}

	public static void setSubLisp(boolean isSubLisp) {
		Main.isSubLisp.set(isSubLisp);
	}

	public static boolean isNoDebug() {
		return isNoDebug.get();
	}

	public static void setNoDebug(boolean isNoDebug) {
		Main.isNoDebug.set(isNoDebug);
	}

	public static AtomicInteger lispInstances = new AtomicInteger(0);

	public static InheritableThreadLocal<Boolean> isSubLisp = new InheritableThreadLocal<Boolean>() {
		@Override
		protected Boolean initialValue() {
			return isSublispDefault;
		}
	};
	public static InheritableThreadLocal<Boolean> isNoDebug = new InheritableThreadLocal<Boolean>() {
		@Override
		protected Boolean initialValue() {
			return Boolean.FALSE;
		}
	};

	public static String[] copyParams(String[] args) {
		List<String> av = new ArrayList<String>(Arrays.asList(args));
		String[] argsNew = av.toArray(StringArrayZero);
		return argsNew;
	}

	public static void enablewebswing() {
		getPlatformDir();
		usewebswing = true;
		ClassLoader.getSystemClassLoader();
		final ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
		if (contextClassLoader != null) {
			if ((contextClassLoader.getClass().getName().contains("Swing"))) {
				isWebSwing = true;
			}
		}
		enableAllCWD();
	}

	public static String getPlatformDir() {

		if (platformDir == null) {
			String pwd = System.getProperty("larkc.home", ".");
			File f = new File(pwd);
			try {
				f = new File(f.getCanonicalPath());
				if (f.getName().equals("bin")) {
					f = f.getParentFile();
				}
			} catch (Throwable e) {
				f = new File(f.getAbsolutePath());
				if (f.getName().equals("bin")) {
					f = f.getParentFile();
				}
			}
			pwd = f.getAbsolutePath();
			System.setProperty("larkc.home", pwd);
			platformDir = pwd;

		}
		return platformDir;
	}

	private static String platformDir;

	public static void enableAllCWD() {
		String pwd = platformDir = getPlatformDir();

		configwebswing();
		String wshome = System.getProperty("webswing.home", null);
		String hcatalina = System.getProperty("webswing.home", null);
		new File(pwd).listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				if (!pathname.isDirectory())
					return false;
				if (wshome == null) {
					if (pathname.getName().toLowerCase().startsWith("webswing")) {
						String setstr = pathname.getAbsolutePath();
						System.setProperty("webswing.home", setstr);
						return true;
					}
				}
				if (hcatalina == null) {
					if (pathname.getName().toLowerCase().startsWith("tomcat")) {
						String setstr = pathname.getAbsolutePath();
						System.setProperty("catalina.home", setstr);
						return true;
					}
				}
				return false;
			}
		});

		System.setProperty("catalina.home", System.getProperty("catalina.home", pwd));
		System.setProperty("webswing.home", System.getProperty("webswing.home", pwd));

		if (!leanABCL)
			System.setProperty("user.dir", pwd);

		System.setProperty("user.home", pwd);
		System.setProperty("larkc.home", pwd);

		String s = System.getProperty("java.library.path");
		s = s.replaceAll("\\" + File.pathSeparator + "\\" + File.pathSeparator, File.pathSeparator);
		System.setProperty("java.library.path", new File("bin").getAbsolutePath() + //
				File.pathSeparator + s);
		//s = System.getProperty("java.library.path");
		//info("catalina.home=" + System.getProperty("catalina.home"));
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @return
	 */
	public static boolean isUnderAjax() {
		// TODO Auto-generated method stub
		return isWebSwing;
	}

	public static void instrumentClassPath() {

	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param term
	 */
	public static void showClassLoaderInfo(Object term) {
		Class termClass = term.getClass();
		ClassLoader cl = termClass.getClassLoader();
		bp();
	}

	/**
	 * @param array
	 * @return
	 */
	private static String[] jiggleEvalArgs(String[] args0) {
		String[] args = copyParams(args0);
		String lastArg = null;
		for (int i = 0; i < args.length; i++) {
			String thisArg = args[i];
			if (lastArg != null && !lastArg.startsWith("--")) {
				if (thisArg.startsWith("\"") || thisArg.startsWith(" ")) {
					args[i - 1] += " " + thisArg;
					args[i] = null;
				}
			}
			lastArg = args[i];
		}
		List<String> av = new ArrayList<String>();
		for (int i = 0; i < args.length; i++) {
			String thisArg = args[i];
			if (thisArg != null) {
				av.add(thisArg);
			}
		}
		String[] argsNew = av.toArray(StringArrayZero);
		return argsNew;
	}

	public static String[] prependArgs(String first, String[] args) {
		List<String> av = new ArrayList<String>();
		pushNew(av, first);
		for (int i = 0; i < args.length; i++) {
			String thisArg = args[i];
			if (thisArg != null) {
				av.add(thisArg);
			}
		}
		String[] argsNew = av.toArray(StringArrayZero);
		return argsNew;
	}

	public static final Object StartupLock = new Object() {
		@Override
		public String toString() {
			return "StartupLock";
		}
	};
	public static final Object StartupInitLock = new Object() {
		@Override
		public String toString() {
			return "StartupInitLock";
		}
	};

	public static BeanBowl bowl = new BeanBowl();

	public static boolean began_ui_inspector = false;
	public static Object ui_inspector_object_instance = null;

	public static boolean began_bsh_desktop = false;
	public static Container desktop_pain_object_instance = null;

	public static Editor j_desktop_object_instance = null;

	public static boolean began_init_swipl = false;
	public static boolean began_init_swipl_server = false;
	public static Boolean app_started_from_prolog = null;

	// final public static BeanBowlGUI gui = BeanBowlGUI.getDefaultFrame();
	private static Thread Owner;
	final public static Map<String, Symbol> prologMethods = new HashMap();
	final static Map<String, CreationInfo> singletons = new HashMap<String, CreationInfo>();
	public static final LispObject[] EMPTY_LISP_OBJECT = new LispObject[0];
	static {
		// int hc = CycEval.CYC_PROGN.hotCount;
	}

	final static private AtomicInteger nth_need_cyc_class_loaded = new AtomicInteger(0);
	final static private CountDownLatch abcl_lisp_loaded_cdl = new CountDownLatch(1);
	final static private CountDownLatch cyc_classes_loaded_cdl = new CountDownLatch(1);
	final static private CountDownLatch cyc_kb_loaded_cdl = new CountDownLatch(1);
	final static private CountDownLatch cyc_server_running_cdl = new CountDownLatch(1);

	public static void needRunningSystem(Class class1) {
		if (MainThreaded)
			return;
		int myId = nth_need_cyc_class_loaded.addAndGet(1);

		if (myId == 1) {
			if (class1 != Prolog.class) {
				/// disable SWI-Prolog Unit Tests
				noPrologJNI = true;
			}
			Owner = new Thread(() -> {
				synchronized (StartupLock) {
					Term.Enabled = true;
					SubLMain.commonSymbolsOK = true;
					load_cyc();
				}
				cyc_classes_loaded_cdl.countDown();
			});
			Owner.start();

		} else if (Owner == Thread.currentThread()) {
			return;
		}
		try {
			cyc_classes_loaded_cdl.await();
		} catch (InterruptedException e) {
			printStackTrace(e);
		}
	}

	@LispMethod
	public static void cl_imports_cyc() {
		if (true)
			return;
		if (SubLMain.Never_REDEFINE)
			return;
		synchronized (StartupLock) {
			if (status_cl_sees_cyc_began)
				return;
			status_cl_sees_cyc_began = true;
			// if(true) return ;
			// SubLPackage.setCurrentPackage(Lisp.PACKAGE_CL_USER);
			Lisp.PACKAGE_SYS.ALLOW_INHERIT_CONFLICTS = true;
			PACKAGE_EXT.ALLOW_INHERIT_CONFLICTS = true;
			PACKAGE_CL.ALLOW_INHERIT_CONFLICTS = true;
			PACKAGE_CL_USER.ALLOW_INHERIT_CONFLICTS = true;
			// PACKAGE_CL_USER.unusePackage(PACKAGE_CL);
			// PACKAGE_CL_USER.unusePackage(PACKAGE_EXT);
			// PACKAGE_CL_USER.unusePackage(PACKAGE_JAVA);
			PACKAGE_CL_USER.usePackageIgnoringErrorsPreferPrevious(PACKAGE_EXT, false);
			PACKAGE_CL_USER.usePackageIgnoringErrorsPreferPrevious(PACKAGE_JAVA, false);
			PACKAGE_CL_USER.usePackageIgnoringErrorsPreferPrevious(PACKAGE_CL, false);
			PACKAGE_CL_USER.usePackageIgnoringErrorsPreferPrevious(PACKAGE_SUBLISP, true);
			PACKAGE_CL_USER.usePackageIgnoringErrorsPreferPrevious(PACKAGE_CYC, true);
			PACKAGE_CL_USER.addNickname("USER");
			PACKAGE_CL_USER.addNickname("U");
			// PACKAGE_SUBLISP.usePackage(PACKAGE_CL, true);
		}
	}

	@LispMethod
	public static void cyc_imports_cl() {
		Symbol._PACKAGE_.setProcessScope(true);
		if (!isSubLisp()) {
			return;
		} else {

		}
		if (SubLMain.Never_REDEFINE)
			return;
		synchronized (StartupLock) {
			if (status_cyc_sees_cl_began)
				return;
			status_cyc_sees_cl_began = true;
			// PACKAGE_CYC.unusePackage(PACKAGE_SUBLISP);
			// PACKAGE_CYC.usePackageIgnoringErrorsPreferPrevious(PACKAGE_SUBLISP, false);
			PACKAGE_CYC.usePackageIgnoringErrorsPreferPrevious(PACKAGE_JAVA, true);
			PACKAGE_CYC.usePackageIgnoringErrorsPreferPrevious(PACKAGE_EXT, true);
			PACKAGE_CYC.usePackageIgnoringErrorsPreferPrevious(PACKAGE_CL, true);
			PACKAGE_CYC.usePackageIgnoringErrorsPreferPrevious(PACKAGE_CL_USER, true);
		}
	}

	static JLisp headless_j_object_instance;

	@LispMethod
	public static int init_jlisp() {
		if (headless_j_object_instance == null) {
			headless_j_object_instance = JLisp.jlispHeadless();
		}
		return headless_j_object_instance.port;
	}

	@LispMethod
	public static void init_j() {
		if (noGUI)
			return;
		try {
			final Class c = Class.forName("org.armedbear.j.Editor");
			final Method method = c.getMethod("startJ", String[].class, boolean.class, boolean.class);
			method.invoke(null, new String[] { "--no-session", "--debug", "--force-new-instance" }, false, false);
			j_desktop();
		} catch (Throwable e) {
			MsgBox.error(e);
		}
	}

	@LispMethod
	public static Interpreter new_lisp_instance() {
		final InputStream inputStream = SystemCurrent.mustIn();
		final OutputStream outputStream = SystemCurrent.mustOut();

		final boolean firstInstance = (lispInstances.get() == 0);
		final Interpreter lispInstance;
		if (firstInstance) {
			lispInstance = init_lisp();
		} else {
			lispInstance = Interpreter. //
					createNewLispInstance(inputStream, outputStream, //
							new File(".").getAbsolutePath() + "/", Version.getVersion(), //
							false, null, false);
		}
		lispInstance.init();
		return lispInstance;
	}

	@LispMethod
	public static Interpreter init_lisp() {
		synchronized (Interpreter.globalLock) {
			synchronized (StartupLock) {
				boolean wasleanABCL = leanABCL;
				boolean wasNeedSubLMAIN = needSubLMAIN;
				if (Interpreter.globalInterpreter == null) {
					try {
						needSubLMAIN = false;
						MainThreaded = true;
						noExit = true;
						leanABCL = true;
						final Class c = Class.forName("org.armedbear.lisp.Main");
						//c.getMethod("main", String[].class).invoke(null, new Object[] { new String[] { "--noinit", "--lisp" } });
						String canonicalPath = "./";
						try {
							canonicalPath = new File(canonicalPath).getCanonicalPath();
						} catch (IOException e) {
							canonicalPath = new File(canonicalPath).getAbsolutePath();
						}
						final boolean firstInstance = (lispInstances.get() == 0);
						final String fcanonicalPath = canonicalPath;
						//passedArgs = new String[] {}; // "--load", "cyc"
						//final String[] args = passedArgs;

						final InputStream inputStream = SystemCurrent.mustIn();
						final OutputStream outputStream = SystemCurrent.mustOut();

						Interpreter interp = Interpreter. //
								createNewLispInstance(inputStream, outputStream, //
										fcanonicalPath, Version.getVersion(), jlisp_requested, //
										passedArgs, firstInstance);

						globalInterpreter = interp;

						//t.run();// Main.runThread(t);
					} catch (Exception e) {
						printStackTrace(e);
					} finally {
						leanABCL = wasleanABCL;
						needSubLMAIN = wasNeedSubLMAIN;
					}
				}
				return Interpreter.globalInterpreter;
			}
		}
	}

	@LispMethod
	public static LispObject lisp_repl() {
		boolean wasSubLisp = Main.isSubLisp();
		Main.setSubLisp(false);
		boolean was_noExit = Main.noExit;
		try {
			try {
				Main.noExit = true;
				final Interpreter lispInstance = new_lisp_instance();
				if (wasSubLisp) {
					cl_imports_cyc();
					cyc_imports_cl();
				}
				lispInstance.run();
			} catch (org.armedbear.lisp.ProcessingTerminated e) {
				// printStackTrace(e);
				// TODO: handle exception
			} catch (ConditionThrowable e) {
				bp();
				throw e;
			} catch (Throwable e) {
				printStackTrace(e);
				// TODO: handle exception
			}
			return Symbol.STAR.symbolValue();
			// return
			// Lisp.PACKAGE_TPL.findAccessibleSymbol("TOP-LEVEL-LOOP").execute();
		} finally {
			Main.setSubLisp(wasSubLisp);
			System.out.println("Exiting inner CommonLisp REPL");
			Main.noExit = was_noExit;
		}
	}

	////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////

	private static void startServers(int portOffset) throws IOException {
		final bsh.Interpreter ensureBSH = BeanShellCntrl.ensureBSH();
		final NameSpace nameSpace = ensureBSH.getNameSpace();
		final Sessiond sessiond = new Sessiond(nameSpace, portOffset + 4123);
		sessiond.start();
		SystemCurrent.recheckStdIO();
		LispClient.startServer(portOffset + 3223);
		if (USE_TOMCAT) {
			start_servlet(portOffset + 3603);
		}
		SystemCurrent.recheckStdIO();
	}

	// Breakpoint to set in IDE
	public static void bp() {
		if (false) {
		}
		// BeanBowlGUI.startBeanBowl();
	}

	/**
	 * TODO Describe the purpose of this method.
	 */
	private static void nop() {
		// TODO Auto-generated method stub

	}

	public static String addObject(String named, Object value) {
		return addObject(named, value, false);
	}

	public static String addObject(String named, Object value, boolean showNow) {
		bowl.addBean(named, value);
		if (showNow)
			showObject(value);
		return bowl.getWrapper(value).getName();
	}

	public static void addSingleton(Object self) {
		if (self == null) {
			Errors.warn("null singleton");
			return;
		}
		Class isc = self.getClass();
		setSingleton(isc, self);
	}

	public static void printStackTrace(Throwable t) {
		final PrintStream stStream = getNoticeStream();
		String info = getStackTraceString(t);
		bp();
		printStackTrace(t, stStream);

	}

	/**
	 * @param t
	 * @param stStream
	 */
	public static void printStackTrace(Throwable t, final PrintStream ps) {
		Set<Throwable> dejaVu = Collections.newSetFromMap(new IdentityHashMap<Throwable, Boolean>());

		while (t != null) {
			{
				if (!dejaVu.contains(t)) {
					dejaVu.add(t);
					showST(t, ps);
				}
			}
			for (Throwable s : t.getSuppressed()) {
				if (!dejaVu.contains(s)) {
					dejaVu.add(s);
					showST(s, ps);

				}
			}
			Throwable t2 = t.getCause();
			if (t2 == t) {
				t2 = null;
			}
			t = t2;
		}
	}

	/*s*
	 * @param t
	 * @param ps
	 */
	public static void showST(Throwable t, final PrintStream ps) {
		SystemCurrent.mustShow = true;
		ps.println("showST: " + t);
		showST(t.getStackTrace(), ps);
	}

	public static void showST(StackTraceElement[] trace, final PrintStream ps) {
		for (StackTraceElement traceElement : trace)
			ps.println("\tat " + traceElement);
	}

	/**
	 * @param self
	 */
	public static String createStackTraceString(Throwable t) {
		final StringBuilder string = new StringBuilder();
		OutputStream outputStream = new OutputStream() {
			// Netbeans IDE automatically overrides this toString()
			@Override
			public String toString() {
				return string.toString();
			}

			@Override
			public void write(int b) throws IOException {
				string.append((char) b);
			}

			/*
			 * (non-Javadoc)
			 *
			 * @see java.lang.Object#finalize()
			 */
			@Override
			protected void finalize() throws Throwable {
				super.finalize();
			}
		};
		string.append("Begin: " + t.getClass() + ": " + t);
		PrintStream ps = new PrintStream(outputStream);
		printStackTrace(t, ps);
		ps.flush();
		ps.close();
		string.append("End: " + t.getClass() + ": " + t.getMessage() + " " + t);
		return string.toString();
	}

	@LispMethod
	public static SubLObject cyc_eval_string(String str) {
		boolean wasSubLisp = Main.isSubLisp();
		Main.setSubLisp(true);
		try {
			return Eval.eval(str);
		} finally {
			Main.setSubLisp(wasSubLisp);
		}
	}

	@LispMethod
	public static SubLObject cyc_eval(final String str) throws Exception {

		return while_not_changing_package(new Callable<SubLObject>() {
			@Override
			public SubLObject call() {
				return cyc_eval_string(str);
			}
		}).call();
	}

	@LispMethod
	public static SubLObject cyc_eval(final LispObject str) throws Exception {
		return while_not_changing_package(new Callable<SubLObject>() {
			@Override
			public SubLObject call() {
				return cyc_progn(new Cons(str), SubLEnvironment.currentEnvironment());
			}
		}).call();
	}

	@LispMethod
	public static <T> Callable<T> while_not_changing_package(final Callable<T> str) {
		return new Callable<T>() {
			@Override
			public T call() {
				SubLPackage prevPackage = Lisp.getCurrentPackage();
				try {
					return str.call();
				} catch (Throwable e) {
					throw doThrow(e);
				} finally {
					SubLPackage.setCurrentPackage(prevPackage);
				}
			}
		};
	}

	@LispMethod
	public static <T> Callable<T> with_sublisp(final boolean tf, final Callable<T> str) {
		return new Callable<T>() {
			@Override
			public T call() throws Exception {
				boolean wasSubLisp = Main.isSubLisp();
				if (wasSubLisp == tf) {
					return str.call();
				}
				Main.setSubLisp(tf);
				try {
					return str.call();
				} catch (Throwable e) {
					throw doThrow(e);
				} finally {
					Main.setSubLisp(wasSubLisp);
				}
			}
		};
	}

	@LispMethod
	public static <T> Callable<T> with_nodebug(final boolean tf, final Callable<T> str) {
		return new Callable<T>() {
			@Override
			public T call() {
				boolean wasNoDebug = Main.isNoDebug();
				Main.setNoDebug(tf);
				try {
					return str.call();
				} catch (Throwable e) {
					throw doThrow(e);
				} finally {
					Main.setNoDebug(wasNoDebug);
				}
			}
		};
	}

	@LispMethod
	public static <T> Callable<T> with_jpl_catcher(final Callable<T> str) {
		return new Callable<T>() {
			@Override
			public T call() {
				final ECatcher oldCatcher = getCatcher();
				setCatcher(jplCatcher);
				try {
					return str.call();
				} catch (Throwable e) {
					throw doThrow(e);
				} finally {
					setCatcher(oldCatcher);
				}
			}
		};
	}

	@LispMethod
	public static SubLObject cyc_progn(SubLCons specialForm, SubLEnvironment env) {
		boolean wasSubLisp = Main.isSubLisp();
		init_subl();
		if (!SubLMain.commonSymbolsOK)
			throw new RuntimeException("SubLMain not yet started");
		Main.setSubLisp(true);
		try {
			SubLListListIterator iter = null;
			Resourcer resourcer = Resourcer.getInstance();
			try {
				iter = resourcer.acquireSubLListListIterator(specialForm);
				return SubLSpecialOperatorDeclarations.list_progn(iter, env);
			} finally {
				resourcer.releaseSubLListListIterator(iter);
			}
		} finally {
			Main.setSubLisp(wasSubLisp);
		}
	}

	static boolean repl_in_bg = false;

	@LispMethod
	public static LispObject bg_repl() throws InterruptedException {
		oneSolution("on_bg_repl");
		if (!repl_in_bg) {
			repl_in_bg = true;
			while (repl_in_bg) {
				Thread.sleep(200);
			}
		}
		return Lisp.EOF;
	}

	@LispMethod(prologName = "fg_repl")
	public static LispObject fg_repl() {
		repl_in_bg = false;
		return Lisp.EOF;
	}

	@LispMethod(prologName = "cyc_repl")
	public static LispObject cyc_repl() throws InterruptedException, Exception {
		return with_sublisp(true, new Callable<LispObject>() {
			@Override
			public LispObject call() {
				SystemCurrent.setupIO();
				// init_cyc();
				// ensureMainReader();
				try {
					// SystemCurrent.takeOwnerShip();
					return cyc_repl_no_suspend();
				} finally {
					// SystemCurrent.releaseOwnerShip();
				}
			}
		}).call();
	}

	@LispMethod
	public static void ensure_cyc() throws IOException {
		init_cyc();
		wait_for_cyc();
	}

	protected static void wait_for_cyc() {
		try {
			cyc_server_running_cdl.await();
		} catch (InterruptedException e) {
			throwException(e);
		}
	}

	@LispMethod
	public static LispObject cyc_repl_no_suspend() {
		boolean wasSubLisp = Main.isSubLisp();
		LispObject io = Symbol.TERMINAL_IO.symbolValue();
		LispObject out = Symbol.STANDARD_OUTPUT.symbolValue();
		LispObject in = Symbol.STANDARD_INPUT.symbolValue();
		load_cyc();

		Main.noExit = true;
		SubLReader SLR = ensureMainReader();
		boolean wasQuitOnExit = SLR.quitOnExit;
		boolean was_shouldReadloopExit = SLR.shouldReadloopExit;
		boolean was_noExit = Main.noExit;
		SubLPackage prevPackage = Lisp.getCurrentPackage();
		try {
			wait_for_cyc();
			try {
				SLR.quitOnExit = false;
				SLR.shouldReadloopExit = false;
				if (false && SubLMain.shouldRunReadloopInGUI()) {
					SubLMain.setMainReader(SubLReaderPanel.startReadloopWindow());
				}
				SLR.setThread(SubLProcess.currentSubLThread());
				while (!SLR.shouldReadloopExit()) {
					Main.setSubLisp(true);
					SLR.doReadLoop();
				}
			} finally {
				SLR.quitOnExit = wasQuitOnExit;
				SLR.shouldReadloopExit = was_shouldReadloopExit;
				Main.noExit = was_noExit;
				Main.setSubLisp(wasSubLisp);
			}
		} finally {
			SubLPackage.setCurrentPackage(prevPackage);
		}
		return (LispObject) SubLSpecialOperatorDeclarations.doubleStar.getValue();
	}

	public static void describeObject(String name, Object in, PrintWriter pw) {
		if (in == null) {
			pw.println("" + name + " is NULL!");
			return;
		}
		pw.print("" + name + " is: ");
		pw.println(pw.getClass() + " sihc=" + System.identityHashCode(in));
	}

	public static void describeStreams() {
		if (true)
			return;
		final StringBuilder string = new StringBuilder();
		OutputStream outputStream = new OutputStream() {
			// Netbeans IDE automatically overrides this toString()
			@Override
			public String toString() {
				return string.toString();
			}

			@Override
			public void write(int b) throws IOException {
				string.append((char) b);
			}
		};
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(outputStream));
		describeObject("System.in", System.in, pw);
		describeObject("System.out", System.out, pw);
		describeObject("System.err", System.err, pw);
		String v = string.toString();
		MsgBox.info(v);
	}

	// /**
	// *
	// */
	public static SubLReader ensureMainReader() {
		SubLReader SLR = SubLMain.getMainReader();
		if (SLR == null) {
			SLR = new SubLReader();
			SubLMain.setMainReader(SLR);
		}
		return SLR;
	}

	public static void importEverywhere(Operator oper) {
		final Symbol lispObject = oper.getLambdaName().toSymbol().toLispObject();
		importEverywhere(lispObject);
	}

	public static void importEverywhere(Symbol symbol) {
		Lisp.PACKAGE_CYC.importSymbol(symbol);
		Lisp.PACKAGE_SUBLISP.importSymbol(symbol);
		Lisp.PACKAGE_EXT.importSymbol(symbol);
		Lisp.PACKAGE_EXT.export(symbol);
		Lisp.PACKAGE_CL_USER.importSymbol(symbol);
	}

	/**
	 * @param js
	 * @return
	 */
	public static Symbol findOrCreateSymbol(String js, LispMethod lm) {
		Package pkg = null;
		String suggest = null;
		String suggestPackage = null;
		boolean exportFromPackage = lm.exported();
		boolean importEverywhere = !lm.exported();
		if (lm != null) {
			suggestPackage = lm.packageName();
			if (suggestPackage != null && suggestPackage.length() == 0)
				suggestPackage = null;
			suggest = lm.symbolName();
			if (suggest != null && suggest.length() == 0)
				suggest = null;
		}
		if (suggest != null) {
			js = suggest;
		} else {
			if (js.startsWith("pkg_")) {
				js = js.substring(3);
				if (js.startsWith("ext_")) {
					js = js.substring(3);
					pkg = Lisp.PACKAGE_EXT;
				}
				if (js.startsWith("cl_")) {
					js = js.substring(2);
					pkg = Lisp.PACKAGE_CL;
				}
				if (js.startsWith("sl_")) {
					js = js.substring(2);
					pkg = Lisp.PACKAGE_SUBLISP;
				}
				if (js.startsWith("user_")) {
					js = js.substring(4);
					pkg = Lisp.PACKAGE_CL_USER;
				} else {
					int i = js.indexOf('_');
					suggestPackage = js.substring(0, i);
					js = js.substring(i);
				}
			}
			js = js.replace("_", "-");
			js = js.replace("$", "*");
			js = js.replace("**", "$");
			if (js.startsWith("-") && js.endsWith("-")) {
				js = "+" + js.substring(1, js.length() - 2) + "+";
			}
		}

		js = js.toUpperCase();
		if (suggestPackage != null) {
			pkg = Packages.findPackage(suggestPackage).toPackage().toLispObject();
		}
		if (pkg == null) {
			pkg = Lisp.getCurrentPackage();
		}
		Symbol sym = null;
		if (!exportFromPackage) {
			sym = pkg.intern(js);
		} else {
			sym = pkg.internAndExport(js);
		}
		if (importEverywhere) {
			importEverywhere(sym);
		}
		return sym;
	}

	@LispMethod
	public static BeanBowl getBowl() {
		return bowl;
	}

	public static <T> T getSingleton(Class<T> isc) {
		synchronized (singletons) {
			String named = Lisp.getDotName(isc);
			CreationInfo was = singletons.get(named);
			if (was == null)
				return null;
			return (T) was.value;
		}
	}

	@LispMethod
	static void load_cyc() {
		synchronized (StartupLock) {
			if (began_load_cyc_classes)
				return;
			began_load_cyc_classes = true;
		}
		if (leanABCL)
			return;
		synchronized (StartupInitLock) {
			enableAllCWD();
			boolean wasSubLisp = Main.isSubLisp();
			try {
				Main.setSubLisp(true);
				SubLPackage prevPackage = Lisp.getCurrentPackage();
				try {
					init_subl();
					SubLPackage.setCurrentPackage("CYC");
					SubLMain.initializeTranslatedSystems();
					try {
						IsolatedClassLoader.suspendAdding = true;
						start_servlet(3603);
					} catch (Throwable ex) {
						printStackTrace(ex);
					}
					if (hasCycCmdlineInits)
						SubLMain.handleInits();
					SubLMain.handlePatches();
					began_load_cyc_classes = true;
					finished_load_cyc_classes = true;
				} catch (Throwable e) {
					began_load_cyc_classes = false;
					throw doThrow(e);
				} finally {
					SubLPackage.setCurrentPackage(prevPackage);
				}
			} finally {
				Main.setSubLisp(wasSubLisp);
			}
		}
	}

	@LispMethod
	public static void start_servlet(int port) {
		if (leanABCL)
			return;
		try {
			synchronized (StartupInitLock) {
				load_cyc();
				SubLFiles.initialize("com.cyc.tool.subl.webserver.ServletContainer");
				//new Thread(() -> web_utilities.start_servlet_container(SubLObjectFactory.makeInteger(3603))).start();
				web_utilities.start_servlet_container(SubLObjectFactory.makeInteger(port));
			}
		} catch (Throwable ex) {
			printStackTrace(ex);
		}
	}

	@LispMethod
	public static void init_cyc() throws IOException {
		synchronized (StartupInitLock) {
			init_kb();
			init_server();
		}
	}

	@LispMethod
	public static void ensure_kb() throws InterruptedException {
		init_kb();
		cyc_kb_loaded_cdl.await();
	}

	@LispMethod
	public static void init_kb() {
		synchronized (StartupLock) {
			if (began_load_kb)
				return;
		}
		synchronized (StartupInitLock) {
			began_load_kb = true;
			UpdateZip.updateUnits("7166");
			subl_preserve_pkg(true, true, () -> {
				load_cyc();
				if (!hasCycCmdlineInits) {
					SubLPackage.setCurrentPackage("CYC");
					Eval.evalInCurrentThread("(sl:load \"init/jrtl-release-init.lisp\")");
				}
				return null;
			});
		}
	}

	@LispMethod
	public static void init_cyc_classes_part2() {
		if (leanABCL)
			return;
		synchronized (StartupInitLock) {
			if (noCycPart2)
				return;
			subl_preserve_pkg(true, true, () -> {
				SubLMain.initialize1TranslatedSystem("com.cyc.cycjava.cycl.cycl");
				return null;
			});
		}
	}

	@LispMethod
	public static void init_server() {
		callInCycInitThread(Startup::init_server0);
	}

	public static void init_server0() {
		synchronized (StartupLock) {
			if (began_init_server)
				return;
			began_init_server = true;
		}
		synchronized (StartupInitLock) {
			subl_preserve_pkg(true, true, () -> {
				Throwable te = null;
				try {
					ensure_kb();
					SubLFiles.initialize("eu.larkc.core.orchestrator.LarkcInit");
					SubLFiles.initialize("eu.larkc.core.orchestrator.servers.LarKCHttpServer");
					if (!hasCycCmdlineInits) {
						Eval.eval("(sl:load \"init/services-init.lisp\")");
					}
					//SubLMain.BOOTY_HACKZ = true;
					//SubLFiles.initialize("com.cyc.cycjava_3.cycl.cycl");
					//(cyc-eval (INITIALIZE-SUBL-INTERFACE-FILE "com.cyc.cycjava_2.cycl.cycl") :CYC)
					// if( !SubLMain.OPENCYC )
					if (!hasCycCmdlineInits) {
						//eu.larkc.core.orchestrator.LarkcInit.initializeLarkc();
					}
					LarKCHttpServer.start_sparql_server();
				} catch (Throwable e) {
					printStackTrace(e);
					te = e;
				}
				if (!cycPart2Early)
					init_cyc_classes_part2();
				try {
					cyc_server_running_cdl.countDown();
					PrologSync.setPrologReady(true);
					LispSync.setLispReady(true);
				} catch (Throwable e) {
					te = e;
				}
				if (te != null) {
					doThrow(te);
				}
				return null;
			});

		}

	}

	@LispMethod
	public static void init_subl() {
		synchronized (StartupLock) {
			if (began_init_subl)
				return;
			began_init_subl = true;
			MainThreaded = true;
		}
		synchronized (StartupInitLock) {
			SubLMain.commonSymbolsOK = true;
			IsolatedClassLoader.addDefaultJarsToClassPath(getPlatformDir());
			boolean b = SubLMain.isInitialized();
			if (b) {
				return;
			}
			boolean wasSubLisp = Main.isSubLisp();
			boolean wasshouldRunInBackground = SubLMain.shouldRunInBackground;
			SubLPackage prevPackage = Lisp.getCurrentPackage();
			Main.setSubLisp(true);
			try {
				SubLMain.shouldRunInBackground = true;
				SubLMain.initializeSubL(StringArrayZero);
				// ensureMainReader();
			} finally {
				SubLPackage.setCurrentPackage(prevPackage);
				Main.setSubLisp(wasSubLisp);
				SubLMain.shouldRunInBackground = wasshouldRunInBackground;
			}
		}
		return;
	}

	public static Object invokeM(Method m, Object object, Object... methodArgs) {
		Class[] methodArgClasses = m.getParameterTypes();
		Object[] methodUseArgs = recastArgs(methodArgClasses, methodArgs);
		try {
			return m.invoke(object, methodUseArgs);
		} catch (ControlTransfer t) {
			throw t;
		} catch (SecurityException e) {
			return Lisp.error(new LispError("inaccessible method " + m));
		} catch (IllegalAccessException e) {
			return Lisp.error(new LispError("illegal access" + m));
		} catch (IllegalArgumentException e) {
			return Lisp.error(new LispError("illegal argument " + m));
		} catch (Throwable t) { // no code -> no ControlTransfer
			if (t instanceof InvocationTargetException) {
				Throwable tt = ((InvocationTargetException) t).getTargetException();
				if (tt != null)
					t = tt;
			}
			if (t instanceof UnhandledCondition) {
				LispObject tt = ((UnhandledCondition) t).getCondition();
				if (tt != null)
					return Lisp.error(tt);
			}
			printStackTrace(t);
			String msg = t.getMessage();
			if (msg == null || msg.length() == 0) {
				msg = createStackTraceString(t);
			}
			return Lisp.error(new LispError(msg));
		}
	}

	private static Object[] recastArgs(Class[] methodArgClasses, Object[] methodArgs) {
		return JavaLink.tryRecast(methodArgClasses, methodArgs);
	}

	static boolean isIKVM() {
		return (System.getProperty("java.vm.name").toUpperCase().contains("IKVM"));
	}

	@LispMethod
	public static LispObject j_desktop() {
		synchronized (StartupInitLock) {
			if (j_desktop_object_instance == null)
				j_desktop_object_instance = Editor.currentEditor();
			if (noGUI)
				return org.armedbear.lisp.JavaObject.getInstance(j_desktop_object_instance);
			// if (true && false) return
			// org.armedbear.lisp.JavaObject.getInstance(editor);
			if (j_desktop_object_instance == null)
				Editor.startJ(new String[] { "--no-session", "--debug", "--force-new-instance" }, false, false);
			if (j_desktop_object_instance == null)
				j_desktop_object_instance = Editor.currentEditor();
			if (j_desktop_object_instance == null)
				Errors.unimplementedMethod("j_desktop");
			addSingleton(j_desktop_object_instance);
			return org.armedbear.lisp.JavaObject.getInstance(j_desktop_object_instance);
		}
	}

	@LispMethod(evalArgs = false)
	public static LispObject lisp_eval(LispObject args) {
		Environment env = Environment.currentLispEnvironment();
		return lisp_progn(args, env);
	}

	@LispMethod
	public static LispObject lo2lo(LispObject arg) {
		return arg;
	}

	@LispMethod
	public static Object lo2o(LispObject arg) {
		return arg;
	}

	@LispMethod
	public static Object o2o(Object arg) {
		return arg;
	}

	@LispMethod
	public static LispObject lisp_progn(LispObject args, Environment env) {
		boolean wasSubLisp = Main.isSubLisp();
		Main.setSubLisp(false);
		try {
			LispThread thread = LispThread.currentThread();
			if (args instanceof Cons) {
				LispObject arg = args.car();
				if ((arg instanceof Cons)) {
					return Lisp.progn(args, env, thread);
				}
			}
			return Lisp.eval(args, env, thread);
		} finally {
			Main.setSubLisp(wasSubLisp);
		}
	}

	@LispMethod
	public static LispObject lisp_eval_string(String statements) {
		return org.armedbear.lisp.Interpreter.evaluate(statements);
	}

	final static PrintWriter swipl_writer = new PrintWriter(new Writer() {
		@Override
		public void write(char[] chars, int start, int length) throws IOException {
			Term s = new Atom(new String(chars, start, length));
			Query.oneSolution(new Compound("write", s));
		}

		@Override
		public void flush() throws IOException {
			oneSolution("flush_output");
		}

		@Override
		public void close() throws IOException {
			oneSolution("flush_output");
		}
	});

	@LispMethod
	public static LispObject lisp_eval(Term term) {
		try {
			LispObject args = term_to_lobject(term);
			Reader reader = new StringReader(":bt\n");
			return with_lisp_io(new Callable<LispObject>() {
				@Override
				public LispObject call() {
					Environment env = Environment.currentLispEnvironment();
					return lisp_progn(args, env);
				}
			}, reader, swipl_writer);
		} catch (Throwable e) {
			throw doThrow(e);
		}
	}

	public static LispObject with_lisp_io(Callable<LispObject> fun, Reader reader, Writer writer) throws Exception {
		boolean wasNoDebug = Main.isNoDebug();
		if (!wasNoDebug) {
			Main.setNoDebug(true);
		}
		final LispObject debuggerHook = new Function() {
			@Override
			public LispObject execute(LispObject condition, LispObject debuggerHook) {
				if (false) {
					return PACKAGE_SYS.findSymbol("%DEBUGGER-HOOK-FUNCTION").execute(condition, debuggerHook);
				} else {
					return NIL;
				}
			}
		};
		try {
			LispThread thread = LispThread.currentThread();
			final SpecialBindingsMark mark = thread.markSpecialBindings();
			try {
				final Stream in = Stream.createStream(Symbol.SYSTEM_STREAM, new BufferedReader(reader));
				final Stream out = Stream.createStream(Symbol.SYSTEM_STREAM, writer);
				final TwoWayStream ioStream = TwoWayStream.createTwoWayStream(in, out, true);
				thread.bindSpecial(Symbol.DEBUGGER_HOOK, debuggerHook);
				thread.bindSpecial(Symbol.STANDARD_INPUT, in);
				thread.bindSpecial(Symbol.STANDARD_OUTPUT, out);
				thread.bindSpecial(Symbol.ERROR_OUTPUT, out);
				thread.bindSpecial(Symbol.TERMINAL_IO, ioStream);
				thread.bindSpecial(Symbol.DEBUG_IO, ioStream);
				thread.bindSpecial(Symbol.QUERY_IO, ioStream);
				return fun.call();
			} finally {
				thread.resetSpecialBindings(mark);
			}
		} finally {
			if (!wasNoDebug) {
				Main.setNoDebug(false);
			}
		}
	}

	//	/**
	//	 * TODO Describe this type briefly. If necessary include a longer description
	//	 * and/or an example.
	//	 *
	//	 * @author Administrator
	//	 *
	//	 */
	//	public static final class JPLExceptionFromJava extends PrologException {
	//		/**
	//		 * TODO Describe this constructor.
	//		 *
	//		 * @param term
	//		 */
	//		public JPLExceptionFromJava(Term term, Throwable cause) {
	//			super(term);
	//			initCause(cause);
	//		}
	//
	//		/*
	//		 * (non-Javadoc)
	//		 *
	//		 * @see java.lang.Throwable#toString()
	//		 */
	//		@Override
	//		public String toString() {
	//			return super.toString();
	//		}
	//	}

	static {
		// SystemCurrent.setupIO();
	}

	public static void setCatcher(ECatcher isNoDebug) {
		ThrowFunc.set(isNoDebug);
	}

	public static ECatcher getCatcher() {
		return ThrowFunc.get();
	}

	public static interface ECatcher {
		RuntimeException doThrow(Throwable t);
	}

	public static InheritableThreadLocal<ECatcher> ThrowFunc = new InheritableThreadLocal<ECatcher>() {
		@Override
		protected ECatcher initialValue() {
			return defaultCatcher;
		}
	};
	public static ECatcher jplCatcher = new Catcher();
	public static ECatcher defaultCatcher = new Catcher();

	public static final class Catcher implements ECatcher {
		@Override
		public RuntimeException doThrow(Throwable box) {
			return doThrow(box);
		}
	}

	//@org.appdapter.core.convert.Converter.ConverterMethod
	public static Term lobject_to_term(LispObject o) {
		Term term = PrologSync.toProlog(o, new ArrayList());
		// o.termRef = term;
		return term;
	}

	@LispMethod
	public static Object prolog_call_all(Term arg) {
		return (new org.jpl7.Query("call", arg)).allSolutions();
	}

	@LispMethod
	public static Map<String, Term>[] prolog_call_n(Term arg, long n) {
		return (new org.jpl7.Query("call", arg)).nSolutions(n);
	}

	@LispMethod
	public static Map<String, Term> prolog_call_1(Term arg, long n) {
		return (new org.jpl7.Query("call", arg)).oneSolution();
	}

	@LispMethod(evalArgs = false)
	public static LispObject prolog_unify(LispObject arg) throws Exception, InterruptedException {
		final LispObject prolog_eval_lobject = prolog_eval_lobject(arg);
		return Lisp.list(prolog_eval_lobject);
	}

	@LispMethod
	public static LispObject prolog_eval_lobject(LispObject arg) throws Exception {
		Term term = lobject_to_term(arg);
		return prolog_eval_term(new Compound("called_from_cyc", term));
	}

	@LispMethod(evalArgs = false)
	public static LispObject prolog_eval_term(Term term) throws Exception {
		Query q = new Query(term);
		LispObject answers = Lisp.NIL;
		LispObject tailPointer = null;
		while (q.hasNext()) {
			q.next();
			Term next = q.goal();
			LispObject o = term_to_lobject(next);
			if (tailPointer == null) {
				tailPointer = answers = new Cons(o, Lisp.NIL);
			} else {
				Cons newP = new Cons(o, Lisp.NIL);
				tailPointer.setCdr(newP);
				tailPointer = newP;
			}
		}
		return answers;
	}

	@LispMethod
	public static Object prolog_query_all(String arg) {
		return Query.allSolutions(arg);
	}

	@LispMethod
	public static Object prolog_query(String arg) {
		if (noPrologJNI)
			throw new StartupError("noPrologJNI: " + arg);
		init_swipl();
		final Term term = org.jpl7.Util.textToTerm(arg);
		return Query.oneSolution(term);
	}

	@LispMethod
	public static boolean oneSolution(String arg) {
		if (noPrologJNI)
			throw new StartupError("noPrologJNI: " + arg);
		init_swipl();
		final Term term = org.jpl7.Util.textToTerm(arg);
		final Map<String, Term> oneSolution = Query.oneSolution(term);
		return oneSolution != null && oneSolution.size() > 0;
	}

	public static void registerMethod(Method m) {
		boolean evalArgsFirst = true;
		String js = m.getName();
		if (js.startsWith("sf_")) {
			evalArgsFirst = false;
			js = js.substring(3);
		} else if (js.startsWith("pf_")) {
			evalArgsFirst = true;
			js = js.substring(3);
		}
		LispMethod lm = m.getAnnotation(LispMethod.class);
		if (!lm.evalArgs()) {
			evalArgsFirst = false;
		}
		Symbol sym = findOrCreateSymbol(js, lm);
		String prologName = symbolToPrologName(sym, lm);
		registerPrologMethod(prologName, sym, m);
		JMultiMethod cf = setSpecialMethod(sym, evalArgsFirst);
		// if (cf == null) return;
		cf.addMethod(m);
	}

	public static void registerPrologMethod(String prologName, Symbol sym, Method method) {
		// if (disablePrologSync) return;
		int arity = method.getParameterTypes().length;
		int harity = arity;
		Class rt = method.getReturnType();
		if (rt == void.class || rt == Void.class) {
			rt = null;
		} else {
			harity++;
		}
		String key = prologName + "/" + harity;
		synchronized (prologMethods) {
			if (prologMethods.containsKey(key))
				return;
			prologMethods.put(key, sym);
		}
		String args = "";
		for (int i = 0; i < arity; i++) {
			if (i > 0) {
				args += ",";
			}
			args += "ARG" + i;
		}
		if (rt == null) {
			String params = "";
			if (arity > 0) {
				params = "(" + args + ")";
			}
			String Head = prologName + params;
			prologAssertString("system:" + Head + ":- call_ctrl(" + Head + ")");
		} else {
			String Head;
			String Body;
			if (arity == 0) {
				Head = prologName + "(RT)";
				Body = prologName;
			} else {
				Head = prologName + "(" + args + ",RT)";
				Body = prologName + "(" + args + ")";
			}
			prologAssertString("system:" + Head + ":- call_ctrl(" + Body + ", RT)");
		}
	}

	private static void prologAssertString(String string) {
		if (noProlog)
			return;
		if (noPrologJNI)
			return;
		oneSolution("assert((" + string + "))");
	}

	// TODO decide if we should care about CloassLoader context
	static HashSet scannedforExport = new HashSet();

	public static void scanForExports(Class clz) {
		if (clz == Object.class || clz == null)
			return;
		synchronized (scannedforExport) {
			if (scannedforExport.contains(clz)) {
				return;
			}
			scannedforExport.add(clz);
		}

		for (java.lang.reflect.Method m : clz.getDeclaredMethods()) {
			if (Modifier.isStatic(m.getModifiers())) {
				if (m.isAnnotationPresent(LispMethod.class)) {
					registerMethod(m);
					continue;
				}
			}
		}

		for (java.lang.reflect.Field m : clz.getDeclaredFields()) {
			if (Modifier.isStatic(m.getModifiers())) {
				if (m.isAnnotationPresent(LispMethod.class)) {
					//registerMethod(m);
					//continue;
					bp();
				}

			}
		}

		scanForExports(clz.getSuperclass());
	}

	static JMultiMethod setSpecialMethod(Symbol sym, boolean evalArgsFirst) {
		LispObject sf = sym.getSymbolFunctionOrNull();
		if (sf == null) {
			if (evalArgsFirst) {
				sf = new JMultiPrimitive(sym);
			} else {
				sf = new JMultiSpecialOperator(sym);
			}
			sym.setFunction((SubLOperator) sf);
			sym.setBuiltInFunction(true);
			return (JMultiMethod) sf;
		} else if (sf instanceof JMultiMethod) {
			return (JMultiMethod) sf;
		} else {
			Lisp.program_error("Trying to overwrite a non special method");
			String complaint = "Trying to overwrite a non method function "; // + sf;
			System.err.println(complaint);
			Lisp.program_error(complaint);
			return null;
		}
	}

	public static void setSingleton(Class isc, Object self) {
		synchronized (singletons) {
			if (isc == null)
				isc = self.getClass();
			String named = Lisp.getDotName(isc);
			setNamed(isc, self, named);
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 *
	 * @param isc
	 * @param self
	 * @param named
	 * @throws StartupError
	 */
	private static void setNamed(Class isc, Object self, String named) throws StartupError {
		CreationInfo was = singletons.get(named);
		CreationInfo wasnt = new CreationInfo(self);
		if (was != null) {
			if (was.value != self) {
				if (!named.equals(nameId(isc))) {
					setNamed(isc, self, nameId(isc));
					return;
				}
				if (!SubLMain.TINY_KB) {
					String message = "Difference from " + was + " and " + wasnt + " isntance " + self;
					MsgBox.error(message);
					if (true)
						throw new StartupError(message);
				}
				named = null;
			}
			// throw new StartupError("REregistering from " + isc + "
			// isntance " + self);
		}
		singletons.put(named, wasnt);
		addObject(named, self);
	}

	@LispMethod
	public static void start_from_prolog() throws InterruptedException {
		synchronized (StartupLock) {
			if (app_started_from_prolog)
				return;
			app_started_from_prolog = true;
		}
		Main.needIOConsole = true;
		start_lisp_from_prolog();
	}

	@LispMethod
	public static void start_from_prolog_ikvm() throws InterruptedException {
		synchronized (StartupLock) {
			if (app_started_from_prolog)
				return;
			app_started_from_prolog = true;
		}
		Main.needIOConsole = true;
		start_lisp_from_prolog();
	}

	@LispMethod
	public static void start_lisp_from_prolog() {
		if (!noProlog) {
			noPrologJNI = noPrologSync = false;
		}
		// Main.trackStructs = !disablePrologSync;
		bsh_desktop();
		scanForExports(BeanShellCntrl.class); // again
		PrologSync.setPrologReady(!noPrologSync);
	}

	public static void startEmbedded() {
		// org.armedbear.lisp.Interpreter.createInstance();
	}

	@LispMethod
	static void init_swipl() {
		synchronized (StartupLock) {
			if (noPrologJNI)
				return;
			if (noProlog)
				return;
			if (began_init_swipl)
				return;
			began_init_swipl = true;
			synchronized (StartupInitLock) {
				try {

					config_jpl();

					if (isIKVM()) {
						oneSolution("assert(swicli:is_ikvm)");
					}
					PrologSync.setPrologReady(true);
				} catch (UnsatisfiedLinkError e) {
					noPrologJNI = true;
					noProlog = true;
					noPrologSync = true;
					System.err.println("" + e);
				}
			}
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 */
	private static void config_jpl() {
		String swiHomeDir = System.getenv("SWI_HOME_DIR");
		String jplLibDir;
		if (swiHomeDir == null) {
			if (File.pathSeparatorChar == ';') {
				jplLibDir = "c:/program files/swipl/bin";
			} else {
				jplLibDir = "/usr/lib/swi-prolog/lib";
				File f = new File(jplLibDir);
				if (f.isDirectory()) {
					for (File fl : f.listFiles()) {
						if (fl.isDirectory()) {
							jplLibDir = fl.getAbsolutePath();
						}
					}
				}
			}
		} else {
			if (File.pathSeparatorChar == ';') {
				jplLibDir = swiHomeDir + "/bin";
			} else {
				jplLibDir = swiHomeDir + "/lib";
				File f = new File(jplLibDir);
				if (f.isDirectory()) {
					for (File fl : f.listFiles()) {
						if (fl.isDirectory()) {
							jplLibDir = fl.getAbsolutePath();
						}
					}
				}
			}
		}
		String pathvar = System.getenv("PATH");
		if (!pathvar.contains("swi")) {
			pathvar = jplLibDir + File.pathSeparator + pathvar;
		}

		String JLP = System.getProperty("java.library.path", null);
		if (JLP == null) {
			System.setProperty("java.library.path", pathvar);
		} else if (!JLP.contains("swi")) {
			pathvar = JLP + File.pathSeparator + pathvar;
			System.setProperty("java.library.path", pathvar);
		}
		System.err.println("java.library.path=" + pathvar);
		Term.Enabled = true;

		JPL.setNativeLibraryDir(jplLibDir);
		JPL.loadNativeLibrary();
		Object[] r = Prolog.get_actual_init_args();
		if (r == null) {
			if (app_started_from_prolog == null) {
				app_started_from_prolog = !JPL.init();

			} else if (!app_started_from_prolog) {
				JPL.init();
			}
			r = Prolog.get_actual_init_args();
		}
		System.err.println("JPL.getDefaultInitArgs=" + Arrays.toString(r));
	}

	@LispMethod
	public static void init_swipl_server() {
		synchronized (StartupLock) {
			if (noPrologJNI)
				return;
			if (began_init_swipl_server)
				return;

			synchronized (StartupInitLock) {
				try {
					String LARKC_HOME = getSetProp("LARKC_HOME", "larkc.home");
					init_swipl();
					began_init_swipl_server = oneSolution("ensure_loaded('" + LARKC_HOME.replace("\\", "/") + "/from_swipl')");
					began_init_swipl_server = oneSolution("(current_thread(prolog_server,X),X=running)");
					if (began_init_swipl_server)
						return;
					oneSolution("use_module(library('prolog_server'))");
					began_init_swipl_server = true;
				} catch (Throwable t) {
					began_init_swipl_server = false;
					MsgBox.error(t);
				}
			}
			synchronized (StartupInitLock) {
				try {
					oneSolution("prolog_server(4023, [allow(_)])");
				} catch (Throwable t) {
					System.err.println("" + t);
				}
			}
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 *
	 * @param jvmprop
	 * @param envprop
	 * @return
	 */
	static String getSetProp(String envprop, String jvmprop) {
		String prop = System.getenv(envprop);
		if (prop == null || prop.equals("")) {
			prop = System.getProperty(jvmprop, ".");
		}
		System.setProperty(jvmprop, prop);
		return prop;
	}

	private static String symbolToPrologName(Symbol sym, LispMethod lm) {
		if (lm != null) {
			String suggest = lm.prologName();
			if (suggest != null && suggest.length() > 0) {
				return suggest;
			}
		}
		Package p = (Package) sym.getPackage();
		String prologName = (p == null ? ":"
				: (p == Lisp.PACKAGE_CL_USER ? "cl_" : (p.showShortName() + "_")) //
						+ sym.getName());
		prologName = prologName.replaceAll("-", "_").toLowerCase();
		for (String rp : new String[] { "cl_lisp_", }) {
			if (prologName.startsWith(rp)) {
				prologName = "cl_" + prologName.substring(rp.length());
				break;
			}
		}
		return prologName;
	}

	//@org.appdapter.core.convert.Converter.ConverterMethod
	@LispMethod
	public static LispObject term_to_lobject(Term term) throws Exception {
		if (term instanceof Atom) {
			return atom_to_lobject((Atom) term);
		}
		Object o = term_to_object(term);
		if (o instanceof LispObject) {
			return (LispObject) o;
		}
		return JavaObject.getInstance(o, true);
	}

	//@org.appdapter.core.convert.Converter.ConverterMethod
	@LispMethod
	public static Object term_to_object(Term term) throws Exception {
		if (term == null)
			return null;
		try {
			if (term.hasFunctor("called_from_cyc", 1)) {
				term = term.arg(1);
			}
			Object tag = term.getTag();
			if (tag != null || term instanceof JRef) {
				if (tag instanceof LispObject) {
					LispObject lo;
					lo = (LispObject) tag;
					lo.setTermRef(term);
					return lo;
				}
				return tag;
			}
		} catch (Error e) {
			showClassLoaderInfo(term);
			printStackTrace(e);
		}
		if (term instanceof Atom) {
			return atom_to_object((Atom) term);
		}
		if (term instanceof Variable) {
			return toJavaObject((Variable) term);
		}
		if (term instanceof org.jpl7.Float) {
			org.jpl7.Float f = (org.jpl7.Float) term;
			if (f.isBig())
				return f.bigFloatValue();
			return f.doubleValue();
		}
		if (term instanceof org.jpl7.Integer) {
			org.jpl7.Integer f = (org.jpl7.Integer) term;
			if (f.isBig())
				return f.bigValue();
			return f.longValue();
		}
		if (term instanceof org.jpl7.Variable) {
			org.jpl7.Integer f = (org.jpl7.Integer) term;
			if (f.isBig())
				return f.bigValue();
			return f.longValue();
		}
		return compound_to_object((Compound) term, term.name(), term.args());
	}

	private static long n = 0;

	@LispMethod
	public static LispObject read_lisp(String s) {
		return Lisp.readObjectFromString(s);
	}

	public static LispObject atom_to_lisp_object(String s) throws Exception {
		SubLObject found;
		// String s = a.name();
		if (s.startsWith("#$")) {
			if (!finished_load_cyc_classes) {
				Debug.assertTrue(finished_load_cyc_classes);
			}
			found = read_sublisp(s);
			if (found != null) {
				return found.toLispObject();
			}
			SimpleString cs = new SimpleString(s);
			s = s.substring(2);
			found = find_constant_by_name(cs);
			if (found instanceof SubLStruct)
				return found.toLispObject();
			found = null;
		}
		boolean readAsSubLisp = s.startsWith("?") || s.contains("#$") || (isSubLisp() && s.contains(":"));
		if (readAsSubLisp) {
			if (!finished_load_cyc_classes) {
				Debug.assertTrue(finished_load_cyc_classes);
			}
			found = read_sublisp(s);
			if (found instanceof LispObject)
				return (LispObject) found;
			if (found != null) {
				return found.toLispObject();
			}
			found = null;
			// return found.toLispObject();
		}
		if (finished_load_cyc_classes) {
			SimpleString ss = new SimpleString(s);
			found = find_constant_by_name(ss);
			if (found instanceof SubLStruct)
				return found.toLispObject();
		}
		// boolean caseMattersU = (!s.toUpperCase().equals(s));
		final String sF = s;
		return with_jpl_catcher((Callable<LispObject>) new Callable<LispObject>() {
			@Override
			public LispObject call() {
				boolean caseMatters = (!sF.toLowerCase().equals(sF));
				if (sF.contains(":")) {
					caseMatters = false;
				}
				LispObject o;
				if (caseMatters) {
					o = read_lisp(sF);
				} else {
					o = org.armedbear.lisp.Interpreter.readFromString(sF);
				}
				return o;
			}
		}).call();
	}

	//@org.appdapter.core.convert.Converter.ConverterMethod
	public static Object atom_to_object(Atom thiz) {
		String value = thiz.name();
		String type = thiz.atomType();
		if (type.equals("string"))
			return value;
		Object val = thiz.getTag();
		if (val != null)
			return val;
		if (value.equals("[]"))
			return Lisp.NIL;
		if (value.equals("T"))
			return Lisp.T;
		return atom_to_lobject(thiz);
	}

	//@org.appdapter.core.convert.Converter.ConverterMethod
	private static LispObject atom_to_lobject(Atom term) {
		if (term.isListNil())
			return Lisp.NIL;
		String atomType = term.atomType();
		LispObject lo;
		final String name = term.name();
		if ("string".equals(atomType)) {
			lo = string_string(name);
		} else {
			boolean wasNoDebug = Main.isNoDebug();
			try {
				Main.setNoDebug(true);
				lo = atom_to_lisp_object(name);
			} catch (Throwable e) {
				throw doThrow(e);
			} finally {
				Main.setNoDebug(wasNoDebug);
			}
		}
		return lo;
	}

	public static RuntimeException doThrow(Throwable throwable) {
		if (throwable instanceof ControlTransfer) {
			throw (ControlTransfer) throwable;
		}
		ECatcher catcher = getCatcher();
		if (catcher != null && catcher == jplCatcher) {
			if (throwable instanceof JPLException) {
				throw (JPLException) throwable;
			}
			final String createStackTraceString = createStackTraceString(throwable);
			swipl_writer.println(createStackTraceString);
			final Atom stackTrace = new Atom(createStackTraceString);
			Query.oneSolution(new Compound("write", stackTrace));
			JPLException jplException = new JPLException(createStackTraceString);
			jplException.initCause(throwable);
			throw jplException;
		}
		if (catcher != null && catcher != defaultCatcher) {
			return catcher.doThrow(throwable);
		}
		if (throwable instanceof Error) {
			throw (Error) throwable;
		}
		if (throwable instanceof JPLException) {
			throw (JPLException) throwable;
		}
		if (throwable instanceof SubLException) {
			throw (SubLException) throwable;
		}
		if (throwable instanceof RuntimeException) {
			final RuntimeException runtimeException = (RuntimeException) throwable;
			return JVMImpl.doThrow(runtimeException);
		}
		return JVMImpl.doThrow(throwable);
	}

	@SuppressWarnings("unchecked")
	static <T extends Exception, R> R sneakyThrow(Throwable t) throws T {
		throw (T) t;
	}

	static LispObject string_string(String text) {
		return JavaObject.getInstance(text, true);
	}

	public static SubLObject read_sublisp(String name) {
		SubLObject form = com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader. //
				read_from_string(SubLObjectFactory.makeString(name), //
						UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		return form;
	}

	static Method installedCR;

	@SubLTranslatedFile.SubL(source = "cycl/constant-reader.lisp", position = 3066L)
	public static SubLObject find_constant_by_name(final SubLObject name) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLNil localNil = SubLNil.NIL;
		SubLObject constant = localNil;
		if (!finished_load_cyc_classes)
			return constant;
		if (SubLMain.OPENCYC) {
			if (installedCR == null) {
				try {
					installedCR = Class.forName("com.cyc.cycjava.cycl.constants_high_oc").getDeclaredMethod("f10737", SubLObject.class);
				} catch (NoSuchMethodException | SecurityException | ClassNotFoundException e) {
					// TODO Auto-generated catch block
					printStackTrace(e);
				}
			}
			try {
				return (SubLObject) installedCR.invoke(constant);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				printStackTrace(e);
			}
		}
		if (constant_completion_low.$require_valid_constants$ == null)
			return constant;
		final SubLObject _prev_bind_0 = constant_completion_low.$require_valid_constants$.currentBinding(thread);
		try {
			constant_completion_low.$require_valid_constants$.bind(localNil, thread);
			constant = constant_completion_high.constant_complete_exact(name, UNPROVIDED, UNPROVIDED);
		} finally {
			constant_completion_low.$require_valid_constants$.rebind(_prev_bind_0, thread);
		}
		if (localNil == constant) {
			constant = constant_handles.find_invalid_constant(name);
		}
		return constant;
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param cycQuery
	 * @param reader_make_constant_shell
	 * @param parameters
	 * @return
	 */
	public static SubLObject new_cyc_query(SubLObject cycQuery, SubLObject mt, SubLObject parameters) {
		return inference_kernel.new_cyc_query(cycQuery, mt, parameters);
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param makeString
	 * @param unprovided
	 * @return
	 */
	public static SubLObject ke_create_now(SubLString makeString, SubLSymbol unprovided) {
		return ke.ke_create_now(makeString, unprovided);

	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param assertion
	 * @param mt
	 * @param unprovided
	 * @param unprovided2
	 * @return
	 */
	public static SubLObject ke_assert_now(SubLObject assertion, SubLObject mt, SubLSymbol unprovided, SubLSymbol unprovided2) {
		// TODO Auto-generated method stub
		return ke.ke_assert_now(assertion, mt, unprovided, unprovided2);
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param o
	 * @return
	 */
	public static SubLBoolean installed_constant_p(SubLObject o) {
		// TODO Auto-generated method stub
		return (SubLBoolean) constants_high.installed_constant_p(o);
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param o
	 * @return
	 */
	public static LispObject constant_name(SubLObject o) {
		// TODO Auto-generated method stub
		return (LispObject) constants_high.constant_name(o);
	}

	public static SubLObject create_constant(SubLObject cs, SubLObject s) {
		return constants_high.create_constant(cs, s);
	}

	public static Object toJavaObject(Variable thiz) {
		Object object = thiz.getTag();
		if (object == null) {
			String name = thiz.name;
			if (name.equals("_")) {
				name = "??" + (n++);
			} else if (name.startsWith("_")) {
				name = "?" + name.substring(1);
			}
			object = read_sublisp("?" + name);
		}
		return object;
	}

	public static Object compound_to_object(Compound term, String value, Term[] args) throws Exception {
		final Object o = term.getTag();
		if (o != null)
			return o;
		Term arg1 = null;
		if (args.length != 0) {
			arg1 = args[0];
		}
		if (term.isListPair()) {
			Cons cons = new Cons(Lisp.NIL, Lisp.NIL);
			try {
				cons.setTermRef(term);
			} catch (Error e) {
				// TODO Auto-generated catch block
				printStackTrace(e);
			}
			cons.setCar(term_to_lobject(arg1));
			cons.setCdr(term_to_lobject(term.arg(2)));
			return cons;
		}
		// lo.termRef = term;
		if (term.hasFunctor("@", 1)) {
			if (arg1 instanceof Atom) {
				Atom a = (Atom) arg1;
				if (a.isAtomOfNameType("null", "text"))
					return null;
				if (a.isAtomOfNameType("true", "text"))
					return true;
				if (a.isAtomOfNameType("false", "text"))
					return false;
			}
		}
		if (value.equals("[]")) {
			return terms_to_lisp_objects(args);
		}
		if (value.equals("s")) {
			if (args.length == 1) {
				return term_to_object(arg1);
			}
		}
		LispObject lo;
		if (o instanceof LispObject) {
			return lo = (LispObject) o;
		} else {
			LispObject cl = atom_to_lisp_object(value);
			Symbol cn = Lisp.checkSymbol(cl);
			LispClass c = LispClass.findClass(cn);
			if (c instanceof StructureClass) {
				LispObject[] slots = terms_to_lisp_objects(args);
				return lo = new StructureObject(cn.toSymbol().toLispObject(), slots);
			}
			if (c instanceof StandardClass) {
				LispObject[] slots = terms_to_lisp_objects(args);
				lo = StandardObject._STD_ALLOCATE_INSTANCE.execute(c);
				for (int i = 0; i < slots.length; i++) {
					LispObject lispObject = slots[i];
					lo.setSlotValue(i, lispObject);
				}
				return lo;
			}
			SubLStructDecl dec = SubLStructDecl.getStructDecl(cn);
			if (dec != null) {
				LispObject[] slots = terms_to_lisp_objects(args);
				lo = (LispObject) dec.newInstance();
				for (int i = 0; i < slots.length; i++) {
					LispObject lispObject = slots[i];
					lo.setSlotValue(i, lispObject);
				}
				return lo;
			}
			return lo = JavaObject.getInstance(o, true);
		}
	}

	public static LispObject[] terms_to_lisp_objects(Term[] args) throws Exception {
		if (args.length == 0)
			return EMPTY_LISP_OBJECT;
		LispObject[] largs = new LispObject[args.length];
		for (int i = 0; i < args.length; i++) {
			largs[i] = term_to_lobject(args[i]);
		}
		return largs;
	}

	@LispMethod
	public static Object test_int_conversion(int obj) {
		return obj;
	}

	@LispMethod(packageName = "CYC")
	public static Object test_object_conversion(Object obj) {
		return obj;
	}

	@LispMethod
	public static Object test_string_conversion(String obj) {
		return obj;
	}

	@LispMethod
	public static Object test_term_conversion(Term obj) {
		return obj;
	}

	@LispMethod
	public static Object test_term_t_conversion(term_t obj) {
		return obj;
	}

	public static Error throwException(Throwable exception) {
		if (true)
			getUnsafe().throwException(exception);
		return Startup.<RuntimeException>throwException1(exception, null);
	}

	public static Unsafe getUnsafe() {
		if (theUnsafe == null) {
			try {
				Field field = Unsafe.class.getDeclaredField("theUnsafe");
				field.setAccessible(true);
				theUnsafe = (Unsafe) field.get(null);
			} catch (Throwable e) {
				throw doThrow(e);
			}
		}
		return theUnsafe;
	}

	private static Unsafe theUnsafe;

	protected static Thread shutdownRequested = null;

	public static boolean optimizeForSpeed = true;

	@SuppressWarnings("unchecked")
	public static <T extends Throwable> Error throwException1(final Throwable exception, Object dummy) throws T {
		throw (T) exception;
	}

	public static LispObject[] toArray(LispObject args) {
		if (args == SubLNil.NIL)
			return EMPTY_LISP_OBJECT;
		if (!(args instanceof Cons))
			return new LispObject[] { args };
		return args.copyToArray();
	}

	@LispMethod
	public static LispObject ui_inspect(LispObject arg) {
		addObject(null, arg);
		return arg;
	}

	public static void start_prolog_from_lisp() {
		init_swipl_server();
		registerForiegnMethods();
	}

	//	public static void main0(String[] args0) {
	//		String[] argsNew = Main.extractOptions(args0);
	//		start_lisp_from_prolog();
	//		Runnable runnable;
	//		if (needSubLMAIN) {
	//		} else {
	//			//Main.main2(argsNew);
	//		}
	//	}

	static class CreationInfo {
		String made;
		Object value;

		public CreationInfo(Object self) {
			value = self;
			made = createStackTraceString(new Throwable("Made " + self.getClass()));
		}

		public Object resolve() {
			return value;
		}

		@Override
		public String toString() {
			return made.toString();
		}
	}

	public static class MsgBox {
		public static final String NEW_LINE = System.getProperty("line.separator");

		static void error(String message) {
			error(message, theNameOfTheMethodThatCalledMe());
		}

		public static void error(String message, String caller) {
			try {
				show(message, caller, JOptionPane.ERROR_MESSAGE);
			} catch (Throwable unk) {
				// unk.printStackTrace();
			}
			// nb: we don't respond to the "your content was splattered"
			// event, so it's OK to pass a null owner.
		}

		public static void error(Throwable e) {
			printStackTrace(e);
			error(createStackTraceString(e));
		}

		public static void info(String message) {
			info(message, theNameOfTheMethodThatCalledMe());
		}

		public static void info(String message, String caller) {
			show(message, caller, JOptionPane.INFORMATION_MESSAGE);
		}

		public static void setClipboard(String message) {
			try {
				final Toolkit AWT_TOOLKIT = Toolkit.getDefaultToolkit();
				final Clipboard CLIPBOARD = AWT_TOOLKIT.getSystemClipboard();
				CLIPBOARD.setContents(new StringSelection(message), null);
			} catch (Throwable unk) {
				// unk.printStackTrace();
			}
			// nb: we don't respond to the "your content was splattered"
			// event, so it's OK to pass a null owner.
		}

		public static void show(String message, String title, int iconId) {
			setClipboard(title + ":" + NEW_LINE + message);
			JOptionPane.showMessageDialog(null, message, title, iconId);
		}

		public static String theNameOfTheMethodThatCalledMe() {
			StackTraceElement[] ste = Thread.currentThread().getStackTrace();
			return ste[3].getMethodName();
		}
	}
	//
	//	public static class PrimitiveEverywhere extends org.armedbear.lisp.Primitive {
	//		public PrimitiveEverywhere(String string) {
	//			super(string, Lisp.PACKAGE_CYC, true);
	//			importEverywhere(this);
	//		}
	//	}

	public static class StartupError extends ConditionThrowable {
		public StartupError(String string) {
			super(string);
		}
	}

	public static void exit(int status) {
		exitCode = status;
		// Debug.assertTrue(false);
		if (noExit) {
			// Lisp.exit(status);
			return;
		}
		shutdownRequested = Thread.currentThread();
		System.exit(status);
		// TODO Auto-generated method stub
	}

	public static org.armedbear.lisp.Interpreter currentLisp() {
		return Interpreter.getInstance();
	}

	/**
	 *
	 */
	public static void registerForiegnMethods() {
		scanForExports(BeanShellCntrl.class);

	}

	public static void startCycInit() {

		registerForiegnMethods();
		if (needSubLMAIN) {
			callInCycInitThread(Startup::startCycInit0);
		}
	}

	public static void startCycInit0() {

		if (!noProlog)
			start_prolog_from_lisp();

		if (needSubLMAIN) {
			load_cyc();
			cl_imports_cyc();
		}
	}

	public static void completeCycInit() {
		callInCycInitThread(Startup::completeCycInit0);
	}

	public static void completeCycInit0() {
		if (!needSubLMAIN)
			return;

		if (leanABCL)
			return;

		startCycInit0();

		try {
			if (cycPart2Early)
				init_cyc_classes_part2();
		} catch (Throwable e) {
			addUncaught(e);
		}

		try {
			init_cyc();
		} catch (Throwable e) {
			addUncaught(e);
		}

		try {
			cyc_imports_cl();
		} catch (Throwable e) {
			addUncaught(e);
		}
		//
		//		if (!noinform) {
		//			double uptime = (System.currentTimeMillis() - startTimeMillis) / 1000.0;
		//			final PrintStream out = getNoticeStream();
		//			out.println("CYC initialization complete at " + uptime + " total seconds.\n");
		//		}

	}

	/**
	 * TODO Describe the purpose of this method.
	 *
	 * @return
	 */
	public static String getStackTraceString(Throwable t) {
		StringWriter sw = new StringWriter();
		t.printStackTrace(new PrintWriter(sw));
		return sw.toString();
	}

	/**
	 * TODO Describe the purpose of this method.
	 *
	 * @param structureObject
	 * @param slotNum
	 * @param pingAt
	 * @param was
	 * @param value
	 */
	public static void wasSetField(AbstractSubLStruct structureObject, int slotNum, int pingAt, Object was, Object value) {
		if (true)
			return;
		LispSync.wasSetField(structureObject, slotNum, pingAt, was, value);
		PrologSync.wasSetField(structureObject, slotNum, pingAt, was, value);
	}

	/**
	 * TODO Describe the purpose of this method.
	 *
	 * @param file
	 */
	public static void addSubLFile(SubLFile file) {
		LispSync.addSingleton(file);
		PrologSync.addSubLFile(file);
		// TODO SLOW
		addSingleton(file);

	}

	/**
	 * TODO Describe the purpose of this method.
	 *
	 * @param struct
	 */
	public static void addThis(AbstractSubLStruct struct) {
		if (true)
			return;
		if (struct instanceof SlotDefinition)
			return;
		LispSync.addThis(struct);
		PrologSync.addThis(struct);
	}

	/**
	 * TODO Describe the purpose of this method.
	 *
	 * @param assertion
	 */
	public static void removeThis(AbstractSubLStruct struct) {
		LispSync.removeThis(struct);
		PrologSync.removeThis(struct);
	}

	/**
	 *
	 */
	public static void configwebswing() {
		//		org.webswing.Constants Constants;
		//		String warFile = System.getProperty(Constants.WAR_FILE_LOCATION);
		//		if (warFile == null) {
		//			ProtectionDomain domain = main.Main.class.getProtectionDomain();
		//			URL location = domain.getCodeSource().getLocation();
		//			String locationString = location.toExternalForm();
		//			if (locationString.endsWith("/WEB-INF/classes/")) {
		//				locationString = locationString.substring(0, locationString.length() - "/WEB-INF/classes/".length());
		//			}
		//			System.setProperty(Constants.WAR_FILE_LOCATION, locationString);
		//			warFile = CommonUtil.getWarFileLocation();
		//		}
		//		String configFile = System.getProperty(Constants.CONFIG_FILE_PATH);
		//		if (configFile == null) {
		//			String war = CommonUtil.getWarFileLocation();
		//			if (war != null) {
		//				final File fileWar = new File(war);
		//				if (fileWar.isDirectory()) {
		//					File f = new File(war, Constants.DEFAULT_CONFIG_FILE_NAME);
		//					if (f.exists()) {
		//						configFile = f.getAbsolutePath();
		//					}
		//				} else if (fileWar.isFile()) {
		//					configFile = war.substring(0, war.lastIndexOf("/") + 1) + Constants.DEFAULT_CONFIG_FILE_NAME;
		//				}
		//			}
		//			if (configFile == null) {
		//				configFile = Constants.DEFAULT_CONFIG_FILE_NAME;
		//			}
		//			if (configFile != null) {
		//				File f = new File(configFile);
		//				if (f.exists()) {
		//					configFile = f.getAbsolutePath();
		//				}
		//				getNoticeStream().println(Constants.CONFIG_FILE_PATH + "=" + configFile);
		//				System.setProperty(Constants.CONFIG_FILE_PATH, configFile);
		//			}
		//		}
		//		getNoticeStream().println(Constants.WAR_FILE_LOCATION + "=" + warFile);

	}

	/**
	 * @author Administrator
	 *
	 */

	public static interface TCallable {
		void call() throws Throwable;
	}

	public static interface SCallable<R> {
		R call();
	}

	public static void ignoreExceptions(TCallable c) {
		try {
			c.call();
		} catch (Throwable e) {
			printStackTrace(e);
			doThrow(e);
		}
	}

	public static boolean pushNew(List c, Object o) {
		if (c.contains(o))
			return false;
		c.add(0, o);
		return true;
	}

	synchronized public static PrintStream getNoticeStream() {
		PrintStream err = noticeStream;
		if (err == null) {
			if (err == null) {
				err = System.out;
				if (err == null) {
					err = SystemCurrent.originalSystemErr;
					if (err == null) {
						err = SystemCurrent.originalSystemOut;
						if (err == null)
							err = System.err;
					}
				}
			}
		}
		noticeStream = err;
		return err;
	}

	public static void reportUncaughts() {
		if (unexpectedThrowables != null) {
			List<UncaughtException> list;
			synchronized (unexpectedThrowables) {
				list = new ArrayList(unexpectedThrowables);
			}
			PrintStream err = getNoticeStream();
			for (UncaughtException throwable : list) {
				try {
					err.print("unexpectedThrowable: " + throwable);
					showST(throwable.e, err);
					err.flush();
				} catch (Throwable e) {
					// TODO: handle exception
				}
			}

		}
	}

	public static final class ABCLMainUncaughtExceptionHandler implements UncaughtExceptionHandler {
		@Override
		public void uncaughtException(Thread arg0, Throwable e) {
			addUncaught(arg0, e);
		}
	}

	public static void addUncaught(Throwable e) {
		addUncaught(Thread.currentThread(), e);
	}

	public static void addUncaught(Thread t, Throwable e) {
		if (e == null)
			return;
		if (t == null)
			t = Thread.currentThread();
		if (e instanceof ProcessingTerminated) {
			final int status = ((ProcessingTerminated) e).getStatus();
			exit(status);
			return;
		}
		final PrintStream noticeStream = getNoticeStream();

		showST(e, noticeStream);
		Debug.forkInterpreter();
		UncaughtException te = new UncaughtException(t, e);
		if (unexpectedThrowables != null)
			unexpectedThrowables.add(te);
	}

	public static boolean needNewThread() {
		RuntimeMXBean rbean = ManagementFactory.getRuntimeMXBean();
		for (String o : rbean.getInputArguments()) {
			if (o.startsWith("-Xss=") || o.startsWith("-XX:ThreadStackSize="))
				return false;
		}
		if (true)
			return true;

		final PrintStream err = getNoticeStream();

		for (Class<? extends PlatformManagedObject> pmo : ManagementFactory.getPlatformManagementInterfaces()) {
			List<? extends PlatformManagedObject> list = ManagementFactory.getPlatformMXBeans(pmo);
			if (list.size() == 0) {
				err.println("NOPMO : " + pmo);
			}
			for (PlatformManagedObject o : list) {
				err.println("--------------------------------------------------");
				err.println(pmo + " : " + o);
				err.println("--------------------------------------------------");
				Method ms[] = o.getClass().getMethods();
				for (Method m : ms) {
					if (m.getParameterCount() == 0) {
						if (Modifier.isStatic(m.getModifiers()))
							continue;
						String name = m.getName();
						if (name.startsWith("get")) {
							name = name.substring(3);
						} else if (name.startsWith("is")) {
							name = name.substring(2);
						} else {
							continue;
						}
						try {
							m.setAccessible(true);
							final Object invoke = anyTsoString(m.invoke(o));
							err.println(name + " -> " + anyTsoString(invoke));
						} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
							Throwable why = e.getCause();
							if (why instanceof UnsupportedOperationException)
								continue;
							e.printStackTrace();
						}
					}
				}
				err.println("--------------------------------------------------");
			}

		}
		err.println("--------------------------------------------------");
		//		for (ManagementInterfaces mi : ManagementInterfaces.values()) {
		//			if (!interfaces.contains(mi.getManagementInterface())) {
		//				throw new RuntimeException(mi.getManagementInterface() + " not in ManagementInterfaces set");
		//			}
		//		}
		return false;
	}

	private static String anyTsoString(Object invoke) {
		return anyTsoString(invoke, null);
	}

	private static String anyTsoString(Object obj, IdentitySetWithIndex dejavu) {
		if (obj == null)
			return "<null>";

		Class c = obj.getClass();
		if (c.isArray()) {
			Class ct = c.getComponentType();
			if (ct.isPrimitive()) {
				if (c == byte[].class)
					return (Arrays.toString((byte[]) obj));
				else if (c == short[].class)
					return (Arrays.toString((short[]) obj));
				else if (c == int[].class)
					return (Arrays.toString((int[]) obj));
				else if (c == long[].class)
					return Arrays.toString((long[]) obj);
				else if (c == char[].class)
					return (Arrays.toString((char[]) obj));
				else if (c == float[].class)
					return (Arrays.toString((float[]) obj));
				else if (c == double[].class)
					return (Arrays.toString((double[]) obj));
				else if (c == boolean[].class)
					return (Arrays.toString((boolean[]) obj));
			} else {
				return Arrays.deepToString((Object[]) obj);
			}
		}
		if (obj instanceof Collection) {
			return nameId(obj) + "(" + Arrays.deepToString((((Collection) obj).toArray())) + ")";
		}
		try {
			if (c.getDeclaredMethod("toString") != null) {
				return "" + obj;
			}
		} catch (NoSuchMethodException | SecurityException e1) {
		}
		if (!(obj instanceof Comparable)) {
			if (dejavu == null) {
				dejavu = new IdentitySetWithIndex();
			} else {
				int index = dejavu.indexOf(obj, true);
				if (index >= 0) {
					return "#" + index + "#";
				}
			}
			dejavu.add(obj);
			Field[] fs = c.getFields();
			int printed = 0;
			StringBuffer sb = new StringBuffer();
			boolean needComma = false;
			for (Field f : fs) {
				if (Modifier.isStatic(f.getModifiers()))
					continue;
				if (needComma)
					sb.append(", ");
				try {
					f.setAccessible(true);
					sb.append(f.getName() + " = " + anyTsoString(f.get(obj), dejavu));
					needComma = true;
					printed++;
				} catch (IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					needComma = false;
				}
			}
			if (printed == 0) {
				Method[] ms = c.getMethods();
				for (Method m : ms) {
					if (m.getParameterCount() == 0) {
						if (Modifier.isStatic(m.getModifiers()))
							continue;
						String name = m.getName();
						if (name.startsWith("get")) {
							name = name.substring(3);
						} else if (name.startsWith("is")) {
							name = name.substring(2);
						} else {
							continue;
						}
						try {
							m.setAccessible(true);
							final Object invoke2 = m.invoke(obj);
							if (needComma)
								sb.append(",");
							sb.append(name + " = " + anyTsoString(invoke2, dejavu));
							needComma = true;
							printed++;

						} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
							Throwable why = e.getCause();
							if (why instanceof UnsupportedOperationException)
								continue;
						}
					}

				}
			}
			if (printed > 0) {
				int index = dejavu.indexOf(obj, false);
				if (index >= 0) {
					return "#" + index + "=" + nameId(obj) + "(" + sb.toString() + ")";
				}
				return nameId(obj) + "(" + sb.toString() + ")";
			}
		}
		return "" + obj;
	}

	/**
	 * @param c
	 * @return
	 */
	public static String nameId(Object o) {
		return o.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(o));
	}

	private static enum ManagementInterfaces {
		CLASS_LOADING_MXBEAN(ClassLoadingMXBean.class), COMPILATION_MXBEAN(CompilationMXBean.class), //
		MEMORY_MXBEAN(MemoryMXBean.class), OPERATING_SYSTEM_MXBEAN(OperatingSystemMXBean.class), //
		RUNTIME_MXBEAN(RuntimeMXBean.class), THREAD_MXBEAN(ThreadMXBean.class), //
		GARBAGE_COLLECTOR_MXBEAN(GarbageCollectorMXBean.class), MEMORY_MANAGER_MXBEAN(MemoryManagerMXBean.class), //
		MEMORY_POOL_MXBEAN(MemoryPoolMXBean.class);

		private final Class<? extends PlatformManagedObject> managementInterface;

		private ManagementInterfaces(Class<? extends PlatformManagedObject> minterface) {
			managementInterface = minterface;
		}

		public Class<? extends PlatformManagedObject> getManagementInterface() {
			return managementInterface;
		}
	}

	static public class UncaughtException {
		Thread t;
		Throwable e;

		public UncaughtException(Thread t, Throwable e) {
			super();
			this.t = t;
			this.e = e;
		}

	}

	public static void setKBLoaded() {
		cyc_kb_loaded_cdl.countDown();
	}

}