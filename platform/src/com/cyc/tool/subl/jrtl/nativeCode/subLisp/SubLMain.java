/*
 * java
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

// import org.armedbear.lisp.CycEval;
import org.armedbear.lisp.Interpreter;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.Main;
import org.jpl7.JPL;
import org.jpl7.Query;
import org.logicmoo.system.BeanShellCntrl;
import org.logicmoo.system.SystemCurrent;

// Internal imports
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

	public static final class InitialEmbeddedMain extends SubLProcess {
		private final Runnable runnable;
		private final String[] args;

		public InitialEmbeddedMain(String name, Runnable runnable, String[] args) {
			super(name);
			this.runnable = runnable;
			this.args = args;
		}

		@Override
		public void safeRun() {
			try {
				Main.setSubLisp(true);
				if (!shouldRunInBackground())
					SystemCurrent.out.println("Starting Cyc.");
				startTime = System.currentTimeMillis();

				try {
					preInitLisp();
					initializeSubL(args);
				} catch (Exception e) {
					e.printStackTrace();
					me.doSystemCleanupAndExit(-1);
				}
				SubLPackage prevPackage = SubLPackage.getCurrentPackage();
				try {
					SubLPackage.setCurrentPackage(Lisp.PACKAGE_SYS);
					long startABCL = System.currentTimeMillis();
					Interpreter.createDefaultInstance(new String[] {});
					startTime += (System.currentTimeMillis() - startABCL);
				} catch (Exception e) {
					e.printStackTrace();
					//me.doSystemCleanupAndExit(-1);
				} finally {

					SubLPackage.setCurrentPackage(prevPackage);
				}
				if (!noInitCyc)
					initializeTranslatedSystems();

				long endTime = System.currentTimeMillis();
				double theTime = (endTime - startTime) / 1000.0;
				if (!shouldRunInBackground())
					SystemCurrent.out.println("Internal initialization time = " + theTime + " secs.");

				startTime = System.currentTimeMillis();

				if (!delayEvalParams)
					handleInits();

				if (!shouldRunInBackground()) {
					endTime = System.currentTimeMillis();
					theTime = (endTime - startTime) / 1000.0;
					SystemCurrent.out.println("Initialization time = " + theTime + " secs.");
					SystemCurrent.out.println();
					writeSystemInfo();
					Storage.room(SubLNil.NIL);
				}
				StreamsLow.$terminal_io$.getValue().toOutputStream().flush();
				runnable.run();
			} catch (RuntimeException e2) {
				SystemCurrent.out.println("Initial Lisp Listener Exiting Now");
				throw e2;
			} finally {
				SystemCurrent.out.println("Initial Lisp Listener Exiting Now");
			}
		}
	}

	public static final class RunnableMain implements Runnable {

		@Override
		public void run() {

			boolean wasSubLisp = Main.isSubLisp();
			try {

				boolean startInSubLisp = true;
				Object val = me.argNameToArgValueMap.get("-lisp");
				if (val != null && (val instanceof Boolean))
					startInSubLisp = !((Boolean) val).booleanValue();

				if (startInSubLisp) {
					SubLPackage.setCurrentPackage(SubLPackage.CYC_PACKAGE);
					//CycEval.CYC_REPL.execute();
                    BeanShellCntrl.cyc_repl();
				} else {
					//SubLPackage.setCurrentPackage(Lisp.PACKAGE_CL_USER);
					SubLPackage.setCurrentPackage(SubLPackage.CYC_PACKAGE);
					//CycEval.LISP_REPL.execute();
                    BeanShellCntrl.lisp_repl();
				}

			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException(e);
			} finally

			{
				Main.setSubLisp(wasSubLisp);
			}

		}
	}

	public interface Cleanup {
		void cleanup();
	}

	private static class MemoryListener  implements NotificationListener {
		//@Override
		public void handleNotification(Notification notification, Object handback) {
			String notifType = notification.getType();
			if (notifType.equals("java.management.memory.threshold.exceeded")
					|| notifType.equals("java.management.memory.collection.threshold.exceeded"))
				lowMemorySemaphore.release();
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

	public static volatile boolean isSubLInitialized_part0;

	public static Runnable NOTHING_TO_DO;

	protected static boolean noInitLisp = false;
	public static boolean noInitCyc = true;
	protected static boolean delayEvalParams = true;
	protected static boolean noInit;
	public static boolean commonSymbolsOK;

	public static long fistStartTime;

	protected static long startTime;

	public static boolean shouldRunInBackground;

	private static boolean isInitializedTranslatedSystems;

	static {
		captureStreams();
		me = new SubLMain();
		cleanups = Collections.synchronizedList(new ArrayList<Cleanup>(16));
		noArgCommandLineArgs = new HashSet<String>();
		argRequiredCommandLineArgs = new HashSet<String>();
		isInitialized = false;
		isFullyInitialized = false;
		lowMemoryCallbacks = new ArrayList<SubLFunction>();
		lowMemorySemaphore = new Semaphore(0);
		isSubLInitialized = false;
		noArgCommandLineArgs.add("-lisp");
		noArgCommandLineArgs.add("-cyc");
		noArgCommandLineArgs.add("-gui");
		noArgCommandLineArgs.add("-q");
		noArgCommandLineArgs.add("-b");
		noArgCommandLineArgs.add("-a");
		argRequiredCommandLineArgs.add("-i");
		argRequiredCommandLineArgs.add("-f");
		argRequiredCommandLineArgs.add("-w");
		NOTHING_TO_DO = new Runnable() {
			@Override
			public void run() {
			}
		};
	}

	public static void deregisterLowMemoryCallback(SubLFunction func) {
		if (func == null)
			Errors.error("Unable to deregister low memory callback for null function.");
		lowMemoryCallbacks.remove(func);
	}

	// sometimes called when this was started from a interface like telnet
	public static void captureStreams() {
		ORIGINAL_IN_STREAM = System.in;
		ORIGINAL_OUT_STREAM = SystemCurrent.out;
		ORIGINAL_ERR_STREAM = System.err;
	}

	public static void embeddedMain(String[] args) {
		embeddedMain(args, NOTHING_TO_DO);
	}

	public static void embeddedMain(final String[] args, final Runnable runnable) {
		me.processCommandLineArgs(args);
		try {
			SubLProcess subLProcess = new InitialEmbeddedMain("Initial Lisp Listener", runnable, args);
			SubLThreadPool.getDefaultPool().execute(subLProcess);
		} catch (Exception e) {
			Errors.handleError(e);
		}
	}

	public static SubLObject get_red_object() {
		return Errors.unimplementedMethod("get_red_object()");
	}

	public static String getCommandLineArg(String argName) {
		return (String) me.argNameToArgValueMap.get(argName);
	}

	public static SubLString getInitializationFileName() {
		String fileName = (String) me.argNameToArgValueMap.get("-i");
		return fileName == null ? null : SubLObjectFactory.makeString(fileName);
	}

	public static String getInitializationForm() {
		return (String) me.argNameToArgValueMap.get("-f");
	}

	static ThreadLocal<SubLReader> mainReader = new ThreadLocal<SubLReader>();

	public static SubLReader getMainReader() {
		return mainReader.get();
	}

	public static SubLString getWorldFileName() {
		String fileName = (String) me.argNameToArgValueMap.get("-w");
		return fileName == null ? null : SubLObjectFactory.makeString(fileName);
	}

	private static void handleAllegroCompatiblityMode() {
		if (isInAllegroCompatibilityMode())
			SubLProcess.setAllegoSingleThreadedThread(SubLProcess.currentSubLThread());
	}

	private static void handleInitFileRunning() {
		SubLString initFile = getInitializationFileName();
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
			String initForm = getInitializationForm();
			if (initForm != null)
				try {
					SubLString initFormString = SubLObjectFactory.makeString(initForm);
					SubLObject form = reader.read_from_string(initFormString, CommonSymbols.T, CommonSymbols.UNPROVIDED,
							CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
					form.eval(SubLEnvironment.currentEnvironment());
				} catch (ResumeException re) {
					SystemCurrent.out.println("[ Resuming via jump to top level read loop... ]");
				} catch (SubLProcess.TerminationRequest tr) {
					; // ignore
				} catch (Throwable t) {
					try {
						Errors.handleThrowable(t, SubLNil.NIL);
					} catch (ResumeException re2) {
						SystemCurrent.out.println("[ Resuming via jump to top level read loop... ]");
					} catch (SubLProcess.TerminationRequest tr2) {
					} catch (Throwable th) {
						Logger.getAnonymousLogger().log(Level.SEVERE,
								"Error processing initialization form: '" + initForm + "'", th);
						exit_with_error = true;
					}
				}
		} finally {
			if (shouldQuitAfterExecutingInitializationForm())
				if (me != null)
					me.doSystemCleanupAndExit(exit_with_error ? 1 : 0);
				else
					System.exit(exit_with_error ? 1 : 0);
		}
	}

	public static synchronized void handleInits() {
		SubLString worldFile = getWorldFileName();
		// @todo do something with worldFile if not null here -APB
		setIsInitialized();
		try {
			handleInitFileRunning();
			handleInitFormRunning();
			handleAllegroCompatiblityMode();
			if (shouldQuitAfterExecutingInitializationForm())
				me.doSystemCleanupAndExit(0);
		} finally {
			setIsFullyInitialized();
		}
	}

	public static void handlePatches() {
		// placeholder
	}

	static boolean initializedLMD = false;
	private static void initializeLowMemoryDetection() {
		if(initializedLMD) return;
		initializedLMD = true;
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
					SystemCurrent.out.println("Low memory situations will be triggered when post-gc usage exceeds "
							+ (int) (threshold / 1048576.0) + "MB(" + (int) (100L * threshold / max) + "% of "
							+ (int) (max / 1048576.0) + "MB) for " + curPoolType + " pool " + pool.getName());
					pool.setCollectionUsageThreshold(threshold);
				} else if (pool.isUsageThresholdSupported()) {
					SystemCurrent.out.println("Low memory situations will be triggered when usage exceeds "
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
					lowMemorySemaphore.acquireUninterruptibly();
					Runtime rt = Runtime.getRuntime();
					long totalMemory = rt.totalMemory();
					long freeMemory = rt.freeMemory();
					long usedMemory = totalMemory - freeMemory;
					long eightyPercentMemory = (long) (totalMemory * 0.8);
					if (usedMemory >= eightyPercentMemory)
						lowMemorySituation();
					lowMemorySemaphore.drainPermits();
				}
			}
		});
	}

	public static synchronized void initializeSubL(String[] argsIgnored) {
		if(isSubLInitialized || isSubLInitialized_part0 ) return;
		isSubLInitialized_part0 = true;
		preInitLisp();

		Object o = Lisp._AUTOLOAD_VERBOSE_;
		try {
			PatchFileLoader.PATCH_FILE_LOADER.loadClass("com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage");
		} catch (Exception e) {
			e.printStackTrace(); // @hack
		}
		SubLPackage.initPackages();

		commonSymbolsOK = true;

		try {
			Class c = PatchFileLoader.PATCH_FILE_LOADER
					.loadClass("com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols");
			// , true);
			SubLSymbol sym = CommonSymbols.EQ; // @hack to make sure this get
												// initialized first
		} catch (Exception e) {
			e.printStackTrace(); // @hack
		}

		SubLPackage.setCurrentPackage("SUBLISP");
		org.armedbear.lisp.Package p = SubLPackage.getCurrentPackage();

		SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages");
        SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.DiskDumper");
        SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrologSync");

		SubLPackage.setCurrentPackage(SubLPackage.SUBLISP_PACKAGE.toPackage());
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
		try {
			SubLPackage.setCurrentPackage(SubLPackage.CYC_PACKAGE);
			SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Regex");
		} finally {
			SubLPackage.setCurrentPackage(SubLPackage.SUBLISP_PACKAGE.toPackage());
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
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.character_names");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.math_utilities");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.condition_macros");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.thread_macros");
		SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.subl_benchmarks");

		 Errors.isReady = true;

		ZeroArityFunction.initialize(); // this must come after ConsesLow -APB
		UnaryFunction.initialize(); // this must come after ConsesLow -APB

		AbstractSubLSequence.init();
		if (!shouldRunInBackground()) {
			setMainReader(new SubLReader());
			getMainReader().setThread(SubLProcess.currentSubLThread());
		}
		isSubLInitialized_part0 = true;
	}

	public synchronized static void initializeTranslatedSystems() {
		if(isInitializedTranslatedSystems) return;
		initialize1TranslatedSystem("com.cyc.cycjava.cycl.cycl");
		initialize1TranslatedSystem("org.logicmoo.system.export");
		
	}

		// @todo make this more flexible once we translate multiple systems
		// or want to ship it without the dependency on cyc
	public synchronized static void initialize1TranslatedSystem(String str) {
		SubLPackage currentPackage = SubLPackage.getCurrentPackage();
		try {
			SubLPackage.setCurrentPackage(SubLPackage.CYC_PACKAGE);
			try {
				Eval.initialize_subl_interface_file(SubLObjectFactory.makeString(str));
				isInitializedTranslatedSystems = true;
			} catch (Exception e) {
				e.printStackTrace();
				// Logger.getAnonymousLogger().log(Level.SEVERE, e.getMessage(),
				// e);
				// ignore
			} finally {
				try {
					initializeLowMemoryDetection();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			PrintLow.registerJRTLPrintMethods();
		} finally {
			SubLPackage.setCurrentPackage(currentPackage);
		}
		isSubLInitialized = true;
	}

	public static boolean isFullyInitialized() {
		return isFullyInitialized;
	}

	public static boolean isInAllegroCompatibilityMode() {
		Boolean value = (Boolean) me.argNameToArgValueMap.get("-a");
		return value == Boolean.TRUE;
	}

	public static boolean isInitialized() {
		return isInitialized;
	}

	public static boolean isInternalInitializationDone() {
		return isSubLInitialized;
	}

	public static SubLObject lowMemoryCallbacks() {
		return SubLObjectFactory.makeList(lowMemoryCallbacks);
	}

	public static void lowMemorySituation() {
		SystemCurrent.out.println("Low memory situation detected; calling registered callbacks:");
		for (SubLFunction func : lowMemoryCallbacks)
			try {
				SystemCurrent.out.println("  Calling: " + func);
				Functions.funcall(func);
			} catch (Exception e) {
				Errors.warn("Warning: low memory callback function error for " + func);
			}
		SystemCurrent.out.println("Done calling low memory situation callbacks.");
		Storage.room(CommonSymbols.UNPROVIDED);
	}

	public static void main(String[] args) {
		SubLMain me = SubLMain.me;
		Main.setSubLisp(true);
		Main.isSubLispBindingMode = true;
		Interpreter.nosystem = true;
		noInitCyc = false;
		delayEvalParams = false;
		commonSymbolsOK = true;

		preInitLisp();
		if(args==null||args.length==0) {
			args = new String[]{"--moo"};
		}

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
			embeddedMain(new String[]{"-f","(progn (load \"init/jrtl-release-init.lisp\")  (load \"init/port-init.lisp\"))"});
			return;
		}
		handlePatches();
		// Interpreter.createInstance();
		SubLMain.commonSymbolsOK = true;
		embeddedMain(args, new RunnableMain());
	}

	public static void preInitLisp() {
		boolean wasSubLisp = Main.isSubLisp();
		Main.setSubLisp(false);
		// Interpreter.nosystem = true;
		Object o = Lisp._AUTOLOAD_VERBOSE_;
		Main.setSubLisp(wasSubLisp);
	}

	public static void registerCleanup(Cleanup cleanup) {
		cleanups.add(cleanup);
	}

	public static void registerLowMemoryCallback(SubLFunction func) {
		if (func == null)
			Errors.error("Unable to register low memory callback for null function.");
		lowMemoryCallbacks.add(func);
	}

	public static void setIsFullyInitialized() {
		isFullyInitialized = true;
	}

	public static void setIsInitialized() {
		isInitialized = true;
	}

	public static void setMainReader(SubLReader reader) {
		mainReader.set(reader);
	}

	public static boolean shouldQuitAfterExecutingInitializationForm() {
		Boolean value = (Boolean) me.argNameToArgValueMap.get("-q");
		return value == Boolean.TRUE;
	}

	public static boolean shouldRunInBackground() {
		if (shouldRunInBackground) return true;
		Boolean value = (Boolean) me.argNameToArgValueMap.get("-b");
		return value == Boolean.TRUE;
	}

	public static boolean shouldRunReadloopInGUI() {
		Boolean value = (Boolean) me.argNameToArgValueMap.get("-gui");
		return value == Boolean.TRUE;
	}

	private static void writeSystemInfo() {
		SystemCurrent.out.println("Start time: " + new Date());
		SystemCurrent.out.println("Lisp implementation: " + Environment.lisp_implementation_type().getStringValue());
		SystemCurrent.out.println("JVM: " + System.getProperty("java.vm.vendor") + " " + System.getProperty("java.vm.name")
				+ " " + System.getProperty("java.version") + " (" + System.getProperty("java.vm.version") + ")");
		try {
			// use reader to avoid direct code dependency on cycl
			SystemCurrent.out.println("Current KB: " + Eval.eval(reader.read_from_string(
					SubLObjectFactory.makeString(
							"(clet ((result \"<none>\")) (ignore-errors (pwhen (fboundp 'KB-VERSION-STRING) (csetq result (format nil \"~A\" (kb-version-string))))) result)"),
					CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED)).getStringValue());
		} catch (Exception e) {
			SystemCurrent.out.println("KB: <none>");
		}
		try {
			// use reader to avoid direct code dependency on cycl
			SystemCurrent.out.println("Patch Level: " + Eval.eval(reader.read_from_string(
					SubLObjectFactory.makeString(
							"(clet ((result \"<unknown>\")) (ignore-errors (pwhen (fboundp 'CYC-REVISION-STRING) (csetq result (format nil \"~A\" (cyc-revision-string))))) result)"),
					CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED)).getStringValue());
		} catch (Exception e) {
			SystemCurrent.out.println("Patch level: <unknown>");
		}
		try {
			SystemCurrent.out.println("Working Directory: " + Eval.eval(reader.read_from_string(
					SubLObjectFactory.makeString("(clet ((result \"" + System.getProperty("user.dir") + "\")) "
							+ "(ignore-errors (pwhen (fboundp 'CANONICAL-CYC-WORKING-DIRECTORY) (csetq result (canonical-cyc-working-directory))) result))"),
					CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED)).getStringValue());
		} catch (Exception e) {
			SystemCurrent.out.println("Working directory (Java): " + System.getProperty("user.dir"));
		}
		SystemCurrent.out.println("Running on: " + Environment.machine_instance().getStringValue());
		SystemCurrent.out.println("OS: " + System.getProperty("os.name") + " " + System.getProperty("os.version") + " ("
				+ System.getProperty("os.arch") + ")");
	}

//	private SubLReader mainReader;
	private Map<String, Object> argNameToArgValueMap;

	private SubLMain() {
		//this.mainReader = null;
		this.argNameToArgValueMap = new HashMap<String, Object>();
	}

	public synchronized void doSystemCleanupAndExit(int code) {
		for (int i = 0, size = cleanups.size(); i < size; ++i)
			try {
				cleanups.get(i).cleanup();
			} catch (Exception ex) {
			}
		StreamsLow.$terminal_io$.getValue().toOutputStream().flush();
		System.exit(code);
	}

	public void processCommandLineArgs(String[] args) {
		for (int i = 0, size = args.length; i < size; ++i) {
			String arg = args[i];
			if (noArgCommandLineArgs.contains(arg))
				this.argNameToArgValueMap.put(arg, Boolean.TRUE);
			else if (argRequiredCommandLineArgs.contains(args[i])) {
				if (i == size)
					Errors.error("Not enough command line arguments given for: " + arg);
				this.argNameToArgValueMap.put(arg, args[++i]);
			} else
				Errors.error("Got invalid command line argument: " + args[i]);
		}
	}
}
