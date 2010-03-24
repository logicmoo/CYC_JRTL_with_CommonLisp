/*
 * SubLMain.java
 *
 * Created on December 13, 2005, 1:41 PM
 */

package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

// Internal imports
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Interpreter;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Site;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLSequence;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.util.*;

// External imports
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.ResumeException;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.ui.SubLReaderPanel;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryNotificationInfo;
import java.lang.management.MemoryPoolMXBean;
import java.lang.management.MemoryType;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Semaphore;
import javax.management.Notification;
import javax.management.NotificationEmitter;


/**
 * Typical arguments: -i "/cyc/top/init/jrtl-init.lisp"
 * Typical Java params: -server -Xms256m -Xmx776m -Xss1m -XX:MaxPermSize=128m
 * Typical working directory: /home/<user>/cvs/head/cycorp/cyc/top/
 * @author goolsbey, tbrussea
 */
public final class SubLMain {
  
  //// Constructors
  
  /** There should only ever be one instance of this */
  private SubLMain() {
    
  }
  
  //// Public Area
  
  public static final InputStream ORIGINAL_IN_STREAM = System.in;
  public static final PrintStream ORIGINAL_OUT_STREAM = System.out;
  public static final PrintStream ORIGINAL_ERR_STREAM = System.err;
  
  public static final SubLMain me = new SubLMain();
  
  public void doSystemCleanupAndExit(int code) {
    System.exit(code);
  }
  
  
  //// Initializers
  
  /** This is unfortunately public so it can be called by unit tests */
  public static void initializeSubL(String[] args) {
    try {
    	//if (Site.isSubLisp) Interpreter.initializeLisp();
      PatchFileLoader.PATCH_FILE_LOADER.loadClass("com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage", true);
    } catch (Exception e) {
      e.printStackTrace(); // @hack
    }
    SubLPackage.initPackages();
    try {
      PatchFileLoader.PATCH_FILE_LOADER.loadClass("com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols", true);
      SubLSymbol sym = CommonSymbols.EQ; // @hack to make sure this get initialized first
    } catch (Exception e) {
      e.printStackTrace(); // @hack
    }
    SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages");
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
    //SubLFiles.initialize("Keyhashes");
    SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks");
    SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks");
    SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapper");
    SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping");
    SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow");
    SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Processes");
    SubLFiles.initialize("com.cyc.tool.subl.jrtl.nativeCode.subLisp.Regex");
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
    SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader");
    SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.random");
    SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind");
    SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation");
    SubLFiles.initialize("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms");
  	if (Site.isSubLisp) Interpreter.initializeLisp();
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
    if (!shouldRunInBackground()) {
      setMainReader(new SubLReader());
      getMainReader().setThread(SubLProcess.currentSubLThread());
    }
  }
  
  public static void initializeTranslatedSystems() {
    // @todo make this more flexible once we translate multiple systems
    // or want to ship it without the dependency on cyc
    SubLPackage.setCurrentPackage(SubLPackage.CYC_PACKAGE);
    try {
      Eval.initialize_subl_interface_file(SubLObjectFactory.
          makeString("com.cyc.cycjava.cycl.cycl"));
    } catch (Exception e) {
      // ignore
    } finally {
      try {
        initializeLowMemoryDetection();
      } catch (Exception e) {
        e.printStackTrace();
      }
      SubLPackage.setCurrentPackage(SubLPackage.CYC_PACKAGE);
    }
    PrintLow.registerJRTLPrintMethods();
  }

  public static void handlePatches() {
    // placeholder
  }
  
  public static String getCommandLineArg(String argName) {
    return (String)me.argNameToArgValueMap.get(argName);
  }
  
  public static SubLString getWorldFileName() {
    String fileName = (String)me.argNameToArgValueMap.get("-w");
    return (fileName == null) ? null : SubLObjectFactory.makeString(fileName);
  }
  
  public static SubLString getInitializationFileName() {
    String fileName = (String)me.argNameToArgValueMap.get("-i");
    return (fileName == null) ? null : SubLObjectFactory.makeString(fileName);
  }
  
  public static String getInitializationForm() {
    return (String)me.argNameToArgValueMap.get("-f");
  }
  
  public static boolean shouldQuitAfterExecutingInitializationForm() {
    Boolean value = (Boolean)me.argNameToArgValueMap.get("-q");
    return (value == Boolean.TRUE);
  }
  
  public static boolean shouldRunInBackground() {
    Boolean value = (Boolean)me.argNameToArgValueMap.get("-b");
    return (value == Boolean.TRUE);
  }
  
  public static boolean shouldRunReadloopInGUI() {
    Boolean value = (Boolean)me.argNameToArgValueMap.get("-gui");
    return (value == Boolean.TRUE);
  }
  
  public static SubLObject get_red_object() {
    return Errors.unimplementedMethod("SubLMain.get_red_object()");
  }
  
  public static final boolean isInitialized() {
    return isInitialized;
  }
  
  public static final void setIsInitialized() {
    isInitialized = true;
  }
  
  public static void setMainReader(SubLReader reader) {
    me.mainReader = reader;
  }
  
  public void processCommandLineArgs(String[] args) {
    for (int i = 0, size = args.length; i < size; i++) {
      String arg = args[i];
      if (noArgCommandLineArgs.contains(arg)) {
        argNameToArgValueMap.put(arg, Boolean.TRUE);
      } else if (argRequiredCommandLineArgs.contains(args[i])) {
        if (i == size) {
          Errors.error("Not enough command line arguments given for: " + arg);
        }
        argNameToArgValueMap.put(arg, args[++i]);
      } else {
        Errors.error("Got invalid command line argument: " + args[i]);
      }
    }
  }
  
  public static final void registerLowMemoryCallback(SubLFunction func) {
    if (func == null) {
      Errors.error("Unable to register low memory callback for null function.");
    }
    lowMemoryCallbacks.add(func);
  }
  
  public static final void lowMemorySituation() {
    System.out.println("Low memory situation...trying to reclaim memory.");
    for (SubLFunction func : lowMemoryCallbacks) {
      try {
        Functions.funcall(func);
      } catch (Exception e) {
        Errors.warn("Warning: calling low memory callback function: " + func);
      }
    }
    System.out.println("Low memory situation...finished trying to reclaim memory.");
    Storage.room(CommonSymbols.UNPROVIDED);
  }
  
  public static SubLReader getMainReader() {
    return me.mainReader;
  }
  
  
  //// Private Area
  
  private static class MemoryListener implements javax.management.NotificationListener {
    @Override
    public void handleNotification(final Notification notification, final Object handback) {  
        String notifType = notification.getType();
        if (notifType.equals(MemoryNotificationInfo.MEMORY_THRESHOLD_EXCEEDED) ||
            notifType.equals(MemoryNotificationInfo.MEMORY_COLLECTION_THRESHOLD_EXCEEDED)) {
          lowMemorySemaphore.release();
        }
    }
  }
  
  private static void initializeLowMemoryDetection() {
    MemoryMXBean mbean = ManagementFactory.getMemoryMXBean();
    NotificationEmitter emitter = (NotificationEmitter) mbean;
    MemoryListener listener = new MemoryListener();
    emitter.addNotificationListener(listener, null, null);
    List<MemoryPoolMXBean> pools = ManagementFactory.getMemoryPoolMXBeans();
    for (MemoryPoolMXBean pool : pools) {
       //@todo other garbage collector may use diffeerent names
      MemoryType curPoolType = pool.getType();
      if (pool.getName().contains("Perm") || pool.getName().contains("Tenured") || pool.getName().contains("Old")) {
        long max = pool.getCollectionUsage().getMax();
        long percent90 = (long)(max * .9) + 1;
        if (pool.isCollectionUsageThresholdSupported()) {
          pool.setCollectionUsageThreshold(percent90);
          if (pool.isUsageThresholdSupported()) {
            pool.setUsageThreshold(percent90);
          }
        } else {
          if (pool.isUsageThresholdSupported()) {
            pool.setUsageThreshold(percent90);
          } else {
            Errors.warn("Unable to detect low memory situations.");
          }
        }
      }
    }

    SubLObjectFactory.makeProcess(SubLObjectFactory.makeString("Low Memory Scavenger"), new Runnable() {
      public void run() {
        while (true) {
          lowMemorySemaphore.acquireUninterruptibly();
          Runtime rt = Runtime.getRuntime();
          long totalMemory = rt.totalMemory();
          long freeMemory = rt.freeMemory();
          long usedMemory = totalMemory - freeMemory;
          long eightyPercentMemory = (long)(totalMemory * .8);
          if (usedMemory >= eightyPercentMemory) {
            lowMemorySituation();
          }
          lowMemorySemaphore.drainPermits();
        }
      }
    });
  }

  private static void writeSystemInfo() {
    System.out.println("Start time: " + new Date());
    System.out.println("Lisp implementation: " + Environment.lisp_implementation_type().getString());
    System.out.println("JVM: " + System.getProperty("java.vm.vendor") + " "
        + System.getProperty("java.vm.name") + " " + System.getProperty("java.version")
        + " (" + System.getProperty("java.vm.version") + ")");
    try {
      //use reader to avoid direct code dependency on cycl
      System.out.println("Current KB: "
        + Eval.eval(reader.read_from_string(SubLObjectFactory.makeString("(clet ((result \"<none>\")) "
        + "(ignore-errors (csetq result (format nil \"~A\" (kb-version-string)))) result)"),
        CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
        CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED)).getString());
    } catch (Exception e) {
      System.out.println("KB: <none>"); //assume error implies KB not loaded
    }
    try {
      //use reader to avoid direct code dependency on cycl
      System.out.println("Patch Level: "
        + Eval.eval(reader.read_from_string(SubLObjectFactory.makeString("(clet ((result \"<unknown>\")) "
        + "(ignore-errors (csetq result (format nil \"~A\" (cyc-revision-string)))) result)"),
        CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
        CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED)).getString());
    } catch (Exception e) {
      System.out.println("Patch level: <unknown>");
    }
    System.out.println("Running on: " + Environment.machine_instance().getString());
    System.out.println("OS: " + System.getProperty("os.name") + " " + System.getProperty("os.version")
    + " (" + System.getProperty("os.arch") + ")");
    System.out.println("Working directory: " + System.getProperty("user.dir"));
  }

  private static void handleInitFileRunning() {
    SubLString initFile = getInitializationFileName();
    if (initFile != null) {
      try {
        Eval.load(initFile);
      } catch (Exception e) {
        Errors.handleError("Failed to load initialization file: " + initFile, e);
      }
    }
  }

  private static void handleInitFormRunning() {
    String initForm = getInitializationForm();
    if (initForm != null) {
      try {
        SubLString initFormString = SubLObjectFactory.makeString(initForm);
        SubLObject form = reader.read_from_string(initFormString,
            CommonSymbols.T, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
            CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
        form.eval(SubLEnvironment.currentEnvironment());
      } catch (ResumeException re) {
        System.out.println("[ Resuming via jump to top level read loop... ]");
      } catch (SubLProcess.TerminationRequest tr) {
        ; //ignore
      } catch (Throwable t) {
        try {
          Errors.handleThrowable(t, SubLNil.NIL);
        } catch (ResumeException re) {
          System.out.println("[ Resuming via jump to top level read loop... ]");
        } catch (SubLProcess.TerminationRequest tr) {
          ; //ignore
        } catch (Throwable th) {
          Errors.handleThrowable(t, SubLNil.NIL);
        }
      }
    }
  }

  private static synchronized void handleInits() {
    SubLString worldFile = getWorldFileName();
    // @todo do something with worldFile if not null here -APB
    setIsInitialized();
    handleInitFileRunning();
    handleInitFormRunning();
    if (shouldQuitAfterExecutingInitializationForm()) {
      SubLMain.me.doSystemCleanupAndExit(0);
    }
  }
  
  //// Internal Rep
  
  private SubLReader mainReader = null;
  private static Set<String> noArgCommandLineArgs = new HashSet<String>();
  private static Set<String> argRequiredCommandLineArgs = new HashSet<String>();
  private Map<String, Object> argNameToArgValueMap = new HashMap<String, Object>();
  private static boolean isInitialized = false;
  private static final Set<SubLFunction> lowMemoryCallbacks = new HashSet<SubLFunction>();
  private static final Semaphore lowMemorySemaphore = new Semaphore(0);
  
  static {
    noArgCommandLineArgs.add("-gui");
    noArgCommandLineArgs.add("-q");
    noArgCommandLineArgs.add("-b");
    argRequiredCommandLineArgs.add("-i");
    argRequiredCommandLineArgs.add("-f");
    argRequiredCommandLineArgs.add("-w");
  }
  
  //// Main
  
  /**
   * @param args the command line arguments
   */
  public static void main(final String[] args) {
    final Runtime rt = Runtime.getRuntime();
    SubLMain.me.handlePatches();
    SubLMain.me.processCommandLineArgs(args);
    try {
      SubLProcess subLProcess = new SubLProcess("Initial Lisp Listener") {
        public void safeRun() {
          try {
           // if (!shouldRunInBackground()) {
              System.out.println("Starting LarKC.");
           // }
            long startTime = System.currentTimeMillis();
            try {
              initializeSubL(args);
              initializeTranslatedSystems();
            } catch (Exception e) {
              e.printStackTrace();
              me.doSystemCleanupAndExit(-1);
            }
            long endTime = System.currentTimeMillis();
            double theTime = ((endTime - startTime) / 1000.0);
            if (!shouldRunInBackground()) {
              System.out.println("Internal initialization time = " + theTime + " secs.");
            }
            startTime = System.currentTimeMillis();
            if (!shouldRunInBackground()) {
              handleInits();
              endTime = System.currentTimeMillis();
              theTime = ((endTime - startTime) / 1000.0);
              System.out.println("Initialization time = " + theTime + " secs.");
              System.out.println();
              writeSystemInfo();
              Storage.room(SubLNil.NIL);
              StreamsLow.$terminal_io$.getValue().toOutputStream().flush();
              if (shouldRunReadloopInGUI()) {
                SubLMain.setMainReader(SubLReaderPanel.startReadloopWindow());
              }
              SubLMain.getMainReader().doReadLoop();
            } else {
              handleInits();
            }
          } catch (RuntimeException e) { 
            System.out.println("Initial Lisp Listener Exiting Now");
            throw e;
          } finally {
            //System.out.println("Initial Lisp Listener Exiting Now");
          }
        }
      };
      SubLThreadPool.getDefaultPool().execute(subLProcess);
    } catch (Exception e) {
      Errors.handleError(e);
    }
  }
  
}


