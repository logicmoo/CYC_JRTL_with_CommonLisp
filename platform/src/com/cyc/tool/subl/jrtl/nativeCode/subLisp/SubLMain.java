/*
 * SubLMain.java
 *
 * Created on December 13, 2005, 1:41 PM
 */

package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.io.InputStream;
import java.io.PrintStream;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryNotificationInfo;
import java.lang.management.MemoryPoolMXBean;
import java.lang.management.MemoryType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.management.Notification;
import javax.management.NotificationEmitter;
import javax.management.NotificationListener;

import org.jpl7.JPL;
import org.jpl7.Query;

// Internal imports
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Interpreter;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Main;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLSequence;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
// External imports
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.ResumeException;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.ui.SubLReaderPanel;
import com.cyc.tool.subl.util.PatchFileLoader;
import com.cyc.tool.subl.util.SubLFiles;

/**
 * Typical arguments: -i "/cyc/top/init/jrtl-init.lisp" Typical Java params:
 * -server -Xms256m -Xmx776m -Xss1m -XX:MaxPermSize=128m Typical working
 * directory: /home/<user>/cvs/head/cycorp/cyc/top/
 *
 * @author goolsbey, tbrussea
 */
public class SubLMain {
	public interface Cleanup {
		void cleanup();
	}

	private static class MemoryListener implements NotificationListener {
		@Override
		public void handleNotification(Notification notification, Object handback) {
			String notifType = notification.getType();
			if (notifType.equals("java.management.memory.threshold.exceeded")
					|| notifType.equals("java.management.memory.collection.threshold.exceeded"))
				SubLMain.lowMemorySemaphore.release();
		}
	}

	public static InputStream ORIGINAL_IN_STREAM;

	public static PrintStream ORIGINAL_OUT_STREAM;

	public static PrintStream ORIGINAL_ERR_STREAM;

	public static SubLMain me;

	private static List<Cleanup> cleanups;

	private static Set<String> noArgCommandLineArgs;

	private static Set<String> argRequiredCommandLineArgs;

	private static volatile boolean isInitialized;

	private static volatile boolean isFullyInitialized;

	private static ArrayList<SubLFunction> lowMemoryCallbacks;

	private static Semaphore lowMemorySemaphore;

	private static volatile boolean isSubLInitialized;

	public static Runnable NOTHING_TO_DO;

	static {
		SubLMain.ORIGINAL_IN_STREAM = System.in;
		SubLMain.ORIGINAL_OUT_STREAM = System.out;
		SubLMain.ORIGINAL_ERR_STREAM = System.err;
		SubLMain.me = new SubLMain();
		SubLMain.cleanups = Collections.synchronizedList(new ArrayList<Cleanup>(16));
		SubLMain.noArgCommandLineArgs = new HashSet<String>();
		SubLMain.argRequiredCommandLineArgs = new HashSet<String>();
		SubLMain.isInitialized = false;
		SubLMain.isFullyInitialized = false;
		SubLMain.lowMemoryCallbacks = new ArrayList<SubLFunction>();
		SubLMain.lowMemorySemaphore = new Semaphore(0);
		SubLMain.isSubLInitialized = false;
		SubLMain.noArgCommandLineArgs.add("-gui");
		SubLMain.noArgCommandLineArgs.add("-q");
		SubLMain.noArgCommandLineArgs.add("-b");
		SubLMain.noArgCommandLineArgs.add("-a");
		SubLMain.argRequiredCommandLineArgs.add("-i");
		SubLMain.argRequiredCommandLineArgs.add("-f");
		SubLMain.argRequiredCommandLineArgs.add("-w");
		SubLMain.NOTHING_TO_DO = new Runnable() {
			@Override
			public void run() {
			}
		};
	}

	public static void deregisterLowMemoryCallback(SubLFunction func) {
		if (func == null)
			Errors.error("Unable to deregister low memory callback for null function.");
		SubLMain.lowMemoryCallbacks.remove(func);
	}

	public static void embeddedMain(String[] args) {
		SubLMain.embeddedMain(args, SubLMain.NOTHING_TO_DO);
	}

	public static void embeddedMain(final String[] args, final Runnable runnable) {
		SubLMain.me.processCommandLineArgs(args);
		try {
			SubLProcess subLProcess = new SubLProcess("Initial Lisp Listener") {
				@Override
				public void safeRun() {
					try {
						if (!SubLMain.shouldRunInBackground())
							System.out.println("Starting Cyc.");
						long startTime = System.currentTimeMillis();
						try {
							SubLMain.initializeSubL(args);
							SubLMain.initializeTranslatedSystems();
						} catch (Exception e) {
							e.printStackTrace();
							SubLMain.me.doSystemCleanupAndExit(-1);
						}
						long endTime = System.currentTimeMillis();
						double theTime = (endTime - startTime) / 1000.0;
						if (!SubLMain.shouldRunInBackground())
							System.out.println("Internal initialization time = " + theTime + " secs.");
						startTime = System.currentTimeMillis();
						SubLMain.handleInits();
						if (!SubLMain.shouldRunInBackground()) {
							endTime = System.currentTimeMillis();
							theTime = (endTime - startTime) / 1000.0;
							System.out.println("Initialization time = " + theTime + " secs.");
							System.out.println();
							SubLMain.writeSystemInfo();
							Storage.room(SubLNil.NIL);
						}
						StreamsLow.$terminal_io$.getValue().toOutputStream().flush();
						runnable.run();
					} catch (RuntimeException e2) {
						System.out.println("Initial Lisp Listener Exiting Now");
						throw e2;
					} finally {
						System.out.println("Initial Lisp Listener Exiting Now");
					}
				}
			};
			SubLThreadPool.getDefaultPool().execute(subLProcess);
		} catch (Exception e) {
			Errors.handleError(e);
		}
	}

	public static SubLObject get_red_object() {
		return Errors.unimplementedMethod("SubLMain.get_red_object()");
	}

	public static String getCommandLineArg(String argName) {
		return (String) SubLMain.me.argNameToArgValueMap.get(argName);
	}

	public static SubLString getInitializationFileName() {
		String fileName = (String) SubLMain.me.argNameToArgValueMap.get("-i");
		return fileName == null ? null : SubLObjectFactory.makeString(fileName);
	}

	public static String getInitializationForm() {
		return (String) SubLMain.me.argNameToArgValueMap.get("-f");
	}

	public static SubLReader getMainReader() {
		return SubLMain.me.mainReader;
	}

	public static SubLString getWorldFileName() {
		String fileName = (String) SubLMain.me.argNameToArgValueMap.get("-w");
		return fileName == null ? null : SubLObjectFactory.makeString(fileName);
	}

	private static void handleAllegroCompatiblityMode() {
		if (SubLMain.isInAllegroCompatibilityMode())
			SubLProcess.setAllegoSingleThreadedThread(SubLProcess.currentSubLThread());
	}

	private static void handleInitFileRunning() {
		SubLString initFile = SubLMain.getInitializationFileName();
		if (initFile != null)
			try {
				Eval.load(initFile);
			} catch (Exception e) {
				Errors.handleError("Failed to load initialization file: " + initFile, e);
			}
	}

	private static void handleInitFormRunning() {
		boolean exit_with_error = false;
		try {
			String initForm = SubLMain.getInitializationForm();
			if (initForm != null)
				try {
					SubLString initFormString = SubLObjectFactory.makeString(initForm);
					SubLObject form = reader.read_from_string(initFormString, CommonSymbols.T, CommonSymbols.UNPROVIDED,
							CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
					form.eval(SubLEnvironment.currentEnvironment());
				} catch (ResumeException re) {
					System.out.println("[ Resuming via jump to top level read loop... ]");
				} catch (SubLProcess.TerminationRequest tr) {
					; // ignore
				} catch (Throwable t) {
					try {
						Errors.handleThrowable(t, SubLNil.NIL);
					} catch (ResumeException re2) {
						System.out.println("[ Resuming via jump to top level read loop... ]");
					} catch (SubLProcess.TerminationRequest tr2) {
					} catch (Throwable th) {
						Logger.getAnonymousLogger().log(Level.SEVERE,
								"Error processing initialization form: '" + initForm + "'", th);
						exit_with_error = true;
					}
				}
		} finally {
			if (SubLMain.shouldQuitAfterExecutingInitializationForm())
				if (SubLMain.me != null)
					SubLMain.me.doSystemCleanupAndExit(exit_with_error ? 1 : 0);
				else
					System.exit(exit_with_error ? 1 : 0);
		}
	}

	private static synchronized void handleInits() {
		SubLString worldFile = SubLMain.getWorldFileName();
		// @todo do something with worldFile if not null here -APB
		SubLMain.setIsInitialized();
		try {
			SubLMain.handleInitFileRunning();
			SubLMain.handleInitFormRunning();
			SubLMain.handleAllegroCompatiblityMode();
			if (SubLMain.shouldQuitAfterExecutingInitializationForm())
				SubLMain.me.doSystemCleanupAndExit(0);
		} finally {
			SubLMain.setIsFullyInitialized();
		}
	}

	public static void handlePatches() {
		// placeholder
	}

	private static void initializeLowMemoryDetection() {
		MemoryMXBean mbean = ManagementFactory.getMemoryMXBean();
		NotificationEmitter emitter = (NotificationEmitter) mbean;
		MemoryListener listener = new MemoryListener();
		emitter.addNotificationListener(listener, null, null);
		List<MemoryPoolMXBean> pools = ManagementFactory.getMemoryPoolMXBeans();
		for (MemoryPoolMXBean pool : pools) {
			// @todo other garbage collector may use diffeerent names
			MemoryType curPoolType = pool.getType();
			if (pool.getName().contains("Tenured") || pool.getName().contains("Old")) {
				long max = pool.getUsage().getMax();
				long percent90 = (long) (max * 0.90001);
				Runtime rt = Runtime.getRuntime();
				long threshold = (long) (max - 1.073741824E9);
				if (threshold < percent90)
					threshold = percent90;
				if (pool.isCollectionUsageThresholdSupported()) {
					System.out.println("Low memory situations will be triggered when post-gc usage exceeds "
							+ (int) (threshold / 1048576.0) + "MB(" + (int) (100L * threshold / max) + "% of "
							+ (int) (max / 1048576.0) + "MB) for " + curPoolType + " pool " + pool.getName());
					pool.setCollectionUsageThreshold(threshold);
				} else if (pool.isUsageThresholdSupported()) {
					System.out.println("Low memory situations will be triggered when usage exceeds "
							+ (int) (threshold / 1048576.0) + "MB(" + (int) (100L * threshold / max) + "% of "
							+ (int) (max / 1048576.0) + "MB) for " + curPoolType + " pool " + pool.getName());
					pool.setUsageThreshold(threshold);
				} else
					Errors.warn("Unable to detect low memory situations.");
			}
		}

		SubLObjectFactory.makeProcess(SubLObjectFactory.makeString("Low Memory Scavenger"), new Runnable() {
			@Override
			public void run() {
				while (true) {
					SubLMain.lowMemorySemaphore.acquireUninterruptibly();
					Runtime rt = Runtime.getRuntime();
					long totalMemory = rt.totalMemory();
					long freeMemory = rt.freeMemory();
					long usedMemory = totalMemory - freeMemory;
					long eightyPercentMemory = (long) (totalMemory * 0.8);
					if (usedMemory >= eightyPercentMemory)
						SubLMain.lowMemorySituation();
					SubLMain.lowMemorySemaphore.drainPermits();
				}
			}
		});
	}

	public static void initializeSubL(String[] args) {
		try {
			PatchFileLoader.PATCH_FILE_LOADER.loadClass("com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage");
		} catch (Exception e) {
			e.printStackTrace(); // @hack
		}
		SubLPackage.initPackages();
		try {
			PatchFileLoader.PATCH_FILE_LOADER.loadClass("com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols",
					true);
			SubLSymbol sym = CommonSymbols.EQ; // @hack to make sure this get
												// initialized first
		} catch (Exception e) {
			e.printStackTrace(); // @hack
		}

		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages");
		//SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.DiskDumper");
		SubLPackage.setCurrentPackage(SubLPackage.SUBLISP_PACKAGE);
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Alien");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters");
		BinaryFunction.initialize(); // this must come after Equality -APB

		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.JavaLink");
		// SubLFiles.initialize("Keyhashes");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapper");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Processes");
		SubLPackage currentPackage = SubLPackage.getCurrentPackage();
		try {
			SubLPackage.setCurrentPackage(SubLPackage.CYC_PACKAGE);
			SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Regex");
		} finally {
			SubLPackage.setCurrentPackage(currentPackage);
		}
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.SystemInfo");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Tcp");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.UserIO");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors");

		// SubLFiles.initialize("SubL");
		// translated RTL extensions
		// these are in the order they are initialized in the C RTL
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_functions");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.hashtables_high");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.environment");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.random");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms");
		currentPackage = SubLPackage.getCurrentPackage();
		try {
			SubLPackage.setCurrentPackage(SubLPackage.CYC_PACKAGE);
		if (Main.isSubLisp)
			Interpreter.initializeLisp();
		} finally {
			SubLPackage.setCurrentPackage(currentPackage);
		}
		//SubLPackage.setCurrentPackage(SubLPackage.CYC_PACKAGE);
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.character_names");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.math_utilities");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.condition_macros");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.thread_macros");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.subl_benchmarks");

		ZeroArityFunction.initialize(); // this must come after ConsesLow -APB
		UnaryFunction.initialize(); // this must come after ConsesLow -APB

		AbstractSubLSequence.init();
		if (!SubLMain.shouldRunInBackground()) {
			SubLMain.setMainReader(new SubLReader());
			SubLMain.getMainReader().setThread(SubLProcess.currentSubLThread());
		}
	}

	public static void initializeTranslatedSystems() {
		// @todo make this more flexible once we translate multiple systems
		// or want to ship it without the dependency on cyc
		try {
			// DiskDumper.initializeTypes();
			SubLPackage.setCurrentPackage(SubLPackage.CYC_PACKAGE);
			try {
				Eval.initialize_subl_interface_file(SubLObjectFactory.makeString("com.cyc.cycjava.cycl.cycl"));
			} catch (Exception e) {
				// Logger.getAnonymousLogger().log(Level.SEVERE, e.getMessage(),
				// e);
				// ignore
			} finally {
				try {
					SubLMain.initializeLowMemoryDetection();
				} catch (Exception e2) {
					e2.printStackTrace();
					
				}
				SubLPackage.setCurrentPackage(SubLPackage.CYC_PACKAGE);
			}
			PrintLow.registerJRTLPrintMethods();
		} finally {
			SubLMain.isSubLInitialized = true;
		}
	}

	public static boolean isFullyInitialized() {
		return SubLMain.isFullyInitialized;
	}

	public static boolean isInAllegroCompatibilityMode() {
		Boolean value = (Boolean) SubLMain.me.argNameToArgValueMap.get("-a");
		return value == Boolean.TRUE;
	}

	public static boolean isInitialized() {
		return SubLMain.isInitialized;
	}

	public static boolean isInternalInitializationDone() {
		return SubLMain.isSubLInitialized;
	}

	public static SubLObject lowMemoryCallbacks() {
		return SubLObjectFactory.makeList(SubLMain.lowMemoryCallbacks);
	}

	public static void lowMemorySituation() {
		System.out.println("Low memory situation detected; calling registered callbacks:");
		for (SubLFunction func : SubLMain.lowMemoryCallbacks)
			try {
				System.out.println("  Calling: " + func);
				Functions.funcall(func);
			} catch (Exception e) {
				Errors.warn("Warning: low memory callback function error for " + func);
			}
		System.out.println("Done calling low memory situation callbacks.");
		Storage.room(CommonSymbols.UNPROVIDED);
	}

	public static void main(String[] args) {
		args = new String[]{"--moo"};
		
		if (args.length == 0) {
		} else if (args[0].equalsIgnoreCase("--prolog")) {
			JPL.init();
			Query.oneSolution("ensure_loaded(library(jpl))");
			Query.oneSolution("interactor");
			return;
		} else if (args[0].equalsIgnoreCase("--moo")) {
			JPL.init();
			Query.oneSolution("ensure_loaded(library(jpl))");
			///Query.oneSolution("jcall('com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain',mainFromProlog,[])");
			Query.oneSolution("interactor");
			subLMain(new String[]{"-f","(progn (load \"init/jrtl-release-init.lisp\")  (load \"init/port-init.lisp\"))"});
			return;
		}
		subLMain(args);
	}
	public static void mainFromProlog() {
		subLMain(new String[]{"-f","(progn (load \"init/jrtl-release-init.lisp\")  (load \"init/port-init.lisp\"))"});
	}
	public static void subLMain(String[] args) {
		SubLMain me = SubLMain.me;
		SubLMain.handlePatches();
		SubLMain.embeddedMain(args, new Runnable() {
			@Override
			public void run() {
				if (!SubLMain.shouldRunInBackground()) {
					if (SubLMain.shouldRunReadloopInGUI())
						SubLMain.setMainReader(SubLReaderPanel.startReadloopWindow());
					SubLMain.getMainReader().doReadLoop();
				}
			}
		});
	}

	public static void registerCleanup(Cleanup cleanup) {
		SubLMain.cleanups.add(cleanup);
	}

	public static void registerLowMemoryCallback(SubLFunction func) {
		if (func == null)
			Errors.error("Unable to register low memory callback for null function.");
		SubLMain.lowMemoryCallbacks.add(func);
	}

	public static void setIsFullyInitialized() {
		SubLMain.isFullyInitialized = true;
	}

	public static void setIsInitialized() {
		SubLMain.isInitialized = true;
	}

	public static void setMainReader(SubLReader reader) {
		SubLMain.me.mainReader = reader;
	}

	public static boolean shouldQuitAfterExecutingInitializationForm() {
		Boolean value = (Boolean) SubLMain.me.argNameToArgValueMap.get("-q");
		return value == Boolean.TRUE;
	}

	public static boolean shouldRunInBackground() {
		Boolean value = (Boolean) SubLMain.me.argNameToArgValueMap.get("-b");
		return value == Boolean.TRUE;
	}

	public static boolean shouldRunReadloopInGUI() {
		Boolean value = (Boolean) SubLMain.me.argNameToArgValueMap.get("-gui");
		return value == Boolean.TRUE;
	}

	private static void writeSystemInfo() {
		System.out.println("Start time: " + new Date());
		System.out.println("Lisp implementation: " + Environment.lisp_implementation_type().getString());
		System.out.println("JVM: " + System.getProperty("java.vm.vendor") + " " + System.getProperty("java.vm.name")
				+ " " + System.getProperty("java.version") + " (" + System.getProperty("java.vm.version") + ")");
		try {
			// use reader to avoid direct code dependency on cycl
			System.out.println("Current KB: " + Eval.eval(reader.read_from_string(
					SubLObjectFactory.makeString(
							"(clet ((result \"<none>\")) (ignore-errors (pwhen (fboundp 'KB-VERSION-STRING) (csetq result (format nil \"~A\" (kb-version-string))))) result)"),
					CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED)).getString());
		} catch (Exception e) {
			System.out.println("KB: <none>");
		}
		try {
			// use reader to avoid direct code dependency on cycl
			System.out.println("Patch Level: " + Eval.eval(reader.read_from_string(
					SubLObjectFactory.makeString(
							"(clet ((result \"<unknown>\")) (ignore-errors (pwhen (fboundp 'CYC-REVISION-STRING) (csetq result (format nil \"~A\" (cyc-revision-string))))) result)"),
					CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED)).getString());
		} catch (Exception e) {
			System.out.println("Patch level: <unknown>");
		}
		try {
			System.out.println("Working Directory: " + Eval.eval(reader.read_from_string(
					SubLObjectFactory.makeString("(clet ((result \"" + System.getProperty("user.dir") + "\")) "
							+ "(ignore-errors (pwhen (fboundp 'CANONICAL-CYC-WORKING-DIRECTORY) (csetq result (canonical-cyc-working-directory))) result))"),
					CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED)).getString());
		} catch (Exception e) {
			System.out.println("Working directory (Java): " + System.getProperty("user.dir"));
		}
		System.out.println("Running on: " + Environment.machine_instance().getString());
		System.out.println("OS: " + System.getProperty("os.name") + " " + System.getProperty("os.version") + " ("
				+ System.getProperty("os.arch") + ")");
	}

	private SubLReader mainReader;
	private Map<String, Object> argNameToArgValueMap;

	private SubLMain() {
		this.mainReader = null;
		this.argNameToArgValueMap = new HashMap<String, Object>();
	}

	public synchronized void doSystemCleanupAndExit(int code) {
		for (int i = 0, size = SubLMain.cleanups.size(); i < size; ++i)
			try {
				SubLMain.cleanups.get(i).cleanup();
			} catch (Exception ex) {
			}
		StreamsLow.$terminal_io$.getValue().toOutputStream().flush();
		System.exit(code);
	}

	public void processCommandLineArgs(String[] args) {
		for (int i = 0, size = args.length; i < size; ++i) {
			String arg = args[i];
			if (SubLMain.noArgCommandLineArgs.contains(arg))
				this.argNameToArgValueMap.put(arg, Boolean.TRUE);
			else if (SubLMain.argRequiredCommandLineArgs.contains(args[i])) {
				if (i == size)
					Errors.error("Not enough command line arguments given for: " + arg);
				this.argNameToArgValueMap.put(arg, args[++i]);
			} else
				Errors.error("Got invalid command line argument: " + args[i]);
		}
	}
}
