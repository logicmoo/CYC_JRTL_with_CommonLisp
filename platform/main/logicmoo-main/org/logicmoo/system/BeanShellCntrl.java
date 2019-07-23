package org.logicmoo.system;

import static org.armedbear.lisp.Lisp.*;
import static org.armedbear.lisp.Main.*;

import java.awt.Component;
import java.awt.Container;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import org.appdapter.core.convert.Converter.ConverterMethod;
//import org.appdapter.gui.api.BoxPanelSwitchableView;
import org.armedbear.j.Editor;
import org.armedbear.j.JLisp;
import org.armedbear.j.Log;
import org.armedbear.j.ReaderThread;
import org.armedbear.lisp.ConditionThrowable;
import org.armedbear.lisp.Cons;
import org.armedbear.lisp.ControlTransfer;
import org.armedbear.lisp.Debug;
//import org.armedbear.lisp.CycEval;
import org.armedbear.lisp.Environment;
import org.armedbear.lisp.Function;
import org.armedbear.lisp.Interpreter;
import org.armedbear.lisp.Interpreter.UnhandledCondition;
import org.armedbear.lisp.Java;
import org.armedbear.lisp.JavaObject;
//import org.appdapter.core.log.Debuggable;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.LispClass;
import org.armedbear.lisp.LispError;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.LispThread;
import org.armedbear.lisp.Main;
import org.armedbear.lisp.Operator;
import org.armedbear.lisp.Package;
import org.armedbear.lisp.Packages;
import org.armedbear.lisp.Pathname;
import org.armedbear.lisp.SimpleString;
import org.armedbear.lisp.SlotDefinition;
import org.armedbear.lisp.SpecialBindingsMark;
import org.armedbear.lisp.SpecialOperator;
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
import org.jpl7.PrologException;
import org.jpl7.Query;
import org.jpl7.Term;
import org.jpl7.Variable;
import org.jpl7.fli.term_t;
import org.logicmoo.bb.BeanBowl;
import org.logicmoo.bb.BeansContextListener;

import com.cyc.cycjava.cycl.constant_completion_high;
import com.cyc.cycjava.cycl.constant_completion_low;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.ke;
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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThreadPool;
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
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

//import com.netbreeze.bbowl.gui.BeanBowlGUI;

import bsh.EvalError;
//import bsh.Interpreter;
import bsh.NameSpace;
import bsh.Primitive;
import bsh.Reflect;
import bsh.ReflectError;
import bsh.This;
import bsh.UtilEvalError;
import bsh.util.JConsole;
import eu.larkc.core.orchestrator.servers.LarKCHttpServer;
import sun.misc.Unsafe;

//import static org.slf4j.spi.LocationAwareLogger.log;
public class BeanShellCntrl {
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
  static public BeanBowl bowl = new BeanBowl();
  static public boolean calledStartAppdatper = false;
  static public boolean calledStartDmiles = false;
  static public boolean called_init_swipl = false;
  static public boolean started_from_prolog = true;
  static public Object dbrowser;
  static Container desktop;
  static Editor editor = null;
  static public boolean inited_subl;
  static public boolean inited_cyc;
  static public boolean inited_kb;
  static public boolean inited_cyc_sees_cl;
  static public boolean inited_cl_sees_cyc;
  static public boolean inited_cyc_server;
  static public boolean inited_cyc_complete;
  static public boolean inited_swipl_server;
  // final static public BeanBowlGUI gui = BeanBowlGUI.getDefaultFrame();
  static public bsh.Interpreter bshInterpreter;
  final static public Map<String, Symbol> prologMethods = new HashMap();
  final static public Method multiMethod;
  final static Map<String, CreationInfo> singletons = new HashMap<String, CreationInfo>();
  static public final LispObject[] EMPTY_LISP_OBJECT = new LispObject[0];
  static {
    // int hc = CycEval.CYC_PROGN.hotCount;
  }

  static public void addConsole(bsh.This thiz, final JConsole console) throws UtilEvalError, EvalError, InterruptedException {
    Object o = thiz.getNameSpace().getVariable("interpreter", false);
    String myName = null;
    o = thiz.getNameSpace().getVariable("name", false);
    if (o instanceof String) {
      myName = (String) o;
      addObject(myName, thiz);
      String myNameL = myName.toLowerCase();
      if (myNameL.contains("lisp")) {
        if (Main.needIOConsole) {
          Main.needIOConsole = false;
          thiz.invokeMethodVA("captureSysIO");
        }
        connectLisp(myName, console);
        return;
      } else if (myNameL.contains("prolog")) {
        /// console.setNameCompletion(new LispNameCompletion());
        connectProlog(myName, console);
        return;
      }
    }
    // Interpreter interpreter = null;
    // if (o instanceof Interpreter) {
    // interpreter = (Interpreter) o;
    // }
    // if (interpreter != null) {
    // return;
    // }
    // // setSingleton(thiz);
    try {
      if (Main.needIOConsole) {
        Main.needIOConsole = false;
        thiz.invokeMethodVA("captureSysIO");
      }
    } catch (EvalError e) {
      MsgBox.error(e);
      throw new RuntimeException(e);
    }
    System.out.println("Hi");
  }

  static public String addObject(String named, Object value) {
    return addObject(named, value, false);
  }

  static public String addObject(String named, Object value, boolean showNow) {
    bowl.addBean(named, value);
    if (showNow)
      showObject(value);
    return bowl.getWrapper(value).getName();
  }

  static public void addSingleton(Object self) {
    if (self == null) {
      Errors.warn("null singleton");
      return;
    }
    Class isc = self.getClass();
    setSingleton(isc, self);
  }

  @LispMethod
  static public boolean attach_jvm(String jarfile) throws IOException {
    /// import com.sun.tools.attach.VirtualMachine;
    //import com.sun.tools.attach.AttachNotSupportedException;
    //  import com.sun.tools.attach.VirtualMachineDescriptor;

    try {
      final Class vmc = Class.forName("com.sun.tools.attach.VirtualMachine");
      java.util.List descs = (List) invoke(vmc, "list");
      if (descs.size() == 0) {
        return false;
      }
      //VirtualMachineDescriptor desc = descs.get(0);
      // attach to target VM
      Object vm = invoke(vmc, "attach", descs.get(0));
      // get system properties in target VM
      Properties props = (Properties) invoke(vm, "getSystemProperties");
      // construct path to management agent
      String home = props.getProperty("java.home");
      String agent = "" + jarfile;
      if (!new File(agent).exists()) {
        agent = home + File.separator + jarfile;
        if (!new File(agent).exists()) {
          if (jarfile == null || jarfile.length() == 0) {
            agent = home + File.separator + "lib" + File.separator + "management-agent.jar";
          }
          if (!new File(agent).exists()) {
            agent = jarfile;
          }
        }
      }
      // load agent into target VM
      // transport=dt_socket,suspend=y,address=10.0.0.95:5005,server=n
      // vm.loadAgent(agent, "com.sun.management.jmxremote.port=5005");
      invoke(vm, "loadAgent", agent, "com.sun.management.jmxremote.port=5005,server=y");
      // detach
      // vm.detach();
      return true;
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return false;
  }

  static public void bp() {
    if (false)
      ;
    // BeanBowlGUI.startBeanBowl();
  }

  static JLisp jLispHeadless;

  @LispMethod
  static public int init_jlisp() {
    if (jLispHeadless == null) {
      jLispHeadless = JLisp.jlispHeadless();
    }
    return jLispHeadless.port;
  }

  @LispMethod
  static public void init_j() {
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
  static public void bsh_desktop() {
    if (noBSHGUI || noGUI)
      return;
    try {
      if (calledStartDmiles)
        return;
      calledStartDmiles = true;
      bsh.Interpreter ensureBSH = ensureBSH();
      ensureBSH.eval("startDmiles()");
      // BeanShellCntrl.setSingleton(interpreter);
      // interpreter.setShowResults(true);
      // BeanShellCntrl.describeStreams();
      // new Thread(interpreter).start();
      // interpreter.get(name)
      SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
          try {
            ensureBSH.eval("sdesktop()");
          } catch (EvalError e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        }
      });
    } catch (Throwable e) {
      // TODO Auto-generated catch block
      calledStartDmiles = false;
      MsgBox.error(e);
    }
  }

  @LispMethod
  static public Object bsh_eval(Object form) throws Exception, EvalError {
    Object lastResult = Lisp.T;
    startOver: do {
      if (form instanceof Term) {
        final Term atom = (Term) form;
        if (atom.isListNil()) {
          return lastResult;
        } else if (atom.isListPair()) {
          lastResult = bsh_eval(atom.arg(1));
          form = atom.arg(2);
          continue startOver;
        }
        form = term_to_lobject(atom);
      }
      if (form instanceof LispObject) {
        form = ((LispObject) form).javaInstance();
      }
      if (form instanceof Pathname) {
        form = ((Pathname) form).getInputStream();
      }
      if (form instanceof InputStream) {
        form = new InputStreamReader(((InputStream) form));
      }
      if (form == null) {
        return lastResult;
      }
      if (form instanceof Reader) {
        lastResult = ensureBSH().eval((Reader) form);
        return lastResult;
      }
      if (form instanceof CharSequence) {
        lastResult = ensureBSH().eval(form.toString());
        return lastResult;
      }
      if (form instanceof File) {
        try {
          return ensureBSH().source(((File) form).getPath());
        } catch (FileNotFoundException e) {
          throw doThrow(e);
        } catch (IOException e) {
          throw doThrow(e);
        }
      }
      return ensureBSH().eval(String.valueOf(form));
    } while (true);
  }

  @LispMethod
  static public Object bsh_eval(String statements) throws EvalError {
    return ensureBSH().eval(statements);
  }

  @LispMethod
  static public Object bsh_repl() throws EvalError {
    bsh.Interpreter interp = ensureBSH();
    interp = new bsh.Interpreter(new InputStreamReader(SystemCurrent.in) {
      @Override
      public void close() throws IOException {
        // TODO Auto-generated method stub
        // super.close();
      }
    }, SystemCurrent.out, SystemCurrent.err, true, //
        masterNamespace(), interp, "bsh_repl");
    interp.setExitOnEOF(false);
    Main.noExit = true;
    try {
      interp.run();
    } catch (Exception e) {
      e.printStackTrace();
      // TODO: handle exception
    }
    return true;
  }

  @LispMethod
  static public LispObject bsh_exec(LispObject arg) throws EvalError {
    if (arg.isString())
      return JavaObject.getInstance(BeanShellCntrl.bsh_eval(arg.getStringValue()), true, null);
    return JavaObject.getInstance(BeanShellCntrl.bsh_eval((String) arg.javaInstance()), true, null);
  }

  @LispMethod
  static public Term call_ctrl(Term list, Term result) {
    String atom = list.name();
    int arity = list.arity();
    String prologName = "" + atom;// .name();
    if (arity > 0) {
    }
    String key = prologName + "/" + arity;
    Symbol found;
    synchronized (prologMethods) {
      found = prologMethods.get(key);
      if (found == null) {
        found = prologMethods.get(prologName + "/" + (1 + arity));
      }
    }
    if (found == null)
      throw new JPLException("No method " + key);
    LispObject op = found.getSymbolFunction();
    if (op instanceof SpecialMethod) {
      SpecialMethod mf = (SpecialMethod) op;
      final Object invokeFromProlog = mf.invokeFromProlog(list, result);
      try {
        return object_to_term(invokeFromProlog);
      } catch (StackOverflowError e) {
        throw new JPLException("Stack Overflow!");
      }
    }
    boolean wasNoDebug = Main.isNoDebug();
    try {
      if (!wasNoDebug) {
        Main.setNoDebug(true);
      }
      LispObject lo = call_lisp2(found, list.args());
      if (!result.isVariable()) {
        return result;
      }
      Term t = lobject_to_term(lo);
      Variable v = (Variable) result;
      Term.putTerm(t, v.term_);
      Object o = lo.javaInstance();
      if (o instanceof JPLException) {
        throw (JPLException) o;
      }
      return t;
    } catch (Throwable t) {
      if (!wasNoDebug) {
        Main.setNoDebug(false);
      }
      t.printStackTrace();
      System.err.println("" + t.getMessage());
      if (t instanceof JPLException) {
        throw (JPLException) t;
      }
      throw new JPLException(createStackTraceString(t));
    } finally {
      Main.setNoDebug(wasNoDebug);
    }
  }

  @ConverterMethod
  private static Term object_to_term(Object o) {
    Term term = PrologSync.toProlog(o);
    // o.termRef = term;
    return term;
  }

  static public LispObject call_lisp2(Symbol found, Term[] args) throws Exception {
    LispObject[] largs = terms_to_lisp_objects(args);
    LispObject ret = found.execute(largs);
    return ret;
  }

  @LispMethod
  static public void cl_imports_cyc() {
    if (true)
      return;
    if (SubLMain.Never_REDEFINE)
      return;
    synchronized (StartupLock) {
      if (inited_cl_sees_cyc)
        return;
      inited_cl_sees_cyc = true;
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
  static public void cyc_imports_cl() {
    Symbol._PACKAGE_.setProcessScope(true);
    Symbol._PACKAGE_.traceSymbol(true);
    if (SubLMain.Never_REDEFINE)
      return;
    synchronized (StartupLock) {
      if (inited_cyc_sees_cl)
        return;
      inited_cyc_sees_cl = true;
      // PACKAGE_CYC.unusePackage(PACKAGE_SUBLISP);
      // PACKAGE_CYC.usePackageIgnoringErrorsPreferPrevious(PACKAGE_SUBLISP, false);
      PACKAGE_CYC.usePackageIgnoringErrorsPreferPrevious(PACKAGE_JAVA, true);
      PACKAGE_CYC.usePackageIgnoringErrorsPreferPrevious(PACKAGE_EXT, true);
      PACKAGE_CYC.usePackageIgnoringErrorsPreferPrevious(PACKAGE_CL, true);
      PACKAGE_CYC.usePackageIgnoringErrorsPreferPrevious(PACKAGE_CL_USER, true);
    }
  }

  /**
   * @param console
   * @throws InterruptedException
   * @throws IOException
   */
  static public JConsole connectLisp(String myName, final JConsole console0) throws InterruptedException {
    final JConsole console;
    if (console0 == null)
      console = new JConsole(myName);
    else
      console = console0;
    if (Main.lispInstances == 0) {
      Main.passedArgs = new String[] { "--load", "cyc" };
      // Thread t = Main.mainUnjoined(new String[] { "--load", "cyc" });
      // t.start();
      // return console;
    }
    SubLThreadPool.getDefaultPool().execute(new SubLProcess(myName) {
      @Override
      public void safeRun() {
        try {
          org.armedbear.lisp.Interpreter interp = org.armedbear.lisp.Interpreter.createNewLispInstance(console.getInputStream(), console.getOut(), new File("./").getCanonicalPath(), Version.getVersion(), false);
          console.setNameCompletion(new LispNameCompletion());
          interp.run();
        } catch (IOException e) {
          MsgBox.error(e);
          throw doThrow(e);
        }
      }
    });
    return console;
  }

  static public JConsole connectProlog(String name, final JConsole console0) {
    final JConsole console;
    if (console0 == null)
      console = new JConsole(name);
    else
      console = console0;
    try {
      init_swipl_server();
      Socket p = null;
      try {
        p = new Socket("localhost", 4023);
        if (!p.isConnected())
          p.connect(p.getRemoteSocketAddress(), 2000);// endpoint,
        // 1000);
      } catch (IOException sto) {
        console.setName("" + sto);
        return console;
      }
      final OutputStreamWriter stdin = new OutputStreamWriter(p.getOutputStream());
      ReaderThread stdoutThread = new ReaderThread(p.getInputStream()) {
        @Override
        public void update(String s) {
          console.print(s);
        }
      };
      ReaderThread stdinThread = new ReaderThread(console.getInputStream()) {
        @Override
        public void update(String s) {
          try {
            stdin.write(s);
            stdin.flush();
          } catch (IOException e) {
            e.printStackTrace();
            throw doThrow(e);
          }
        }
      };
      stdoutThread.start();
      stdinThread.start();
    } catch (Throwable t) {
      Log.error(t);
      throw throwException(t);
    }
    return console;
  }

  /**
   * @param self
   */
  static public String createStackTraceString(Throwable t) {
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
    string.append("" + t.getClass() + ": " + t);
    PrintStream ps = new PrintStream(outputStream);
    t.printStackTrace(ps);
    ps.flush();
    ps.close();
    string.append("" + t.getClass() + ": " + t.getMessage() + " " + t);
    return string.toString();
  }

  @LispMethod
  static public SubLObject cyc_eval_string(String str) {
    boolean wasSubLisp = Main.isSubLisp();
    Main.setSubLisp(true);
    try {
      return Eval.eval(str);
    } finally {
      Main.setSubLisp(wasSubLisp);
    }
  }

  @LispMethod
  static public SubLObject cyc_eval(final String str) throws InterruptedException {
    return while_not_changing_package(new SCallable<SubLObject>() {
      @Override
      public SubLObject call() {
        return cyc_eval_string(str);
      }
    }).call();
  }

  @LispMethod
  static public SubLObject cyc_eval(final LispObject str) throws InterruptedException {
    return while_not_changing_package(new SCallable<SubLObject>() {
      @Override
      public SubLObject call() {
        return cyc_progn(new Cons(str), SubLEnvironment.currentEnvironment());
      }
    }).call();
  }

  @LispMethod
  static public <T> SCallable<T> while_not_changing_package(final Callable<T> str) {
    return new SCallable<T>() {
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
  static public <T> SCallable<T> with_sublisp(final boolean tf, final Callable<T> str) {
    return new SCallable<T>() {
      @Override
      public T call() {
        boolean wasSubLisp = Main.isSubLisp();
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
  static public <T> SCallable<T> with_nodebug(final boolean tf, final Callable<T> str) {
    return new SCallable<T>() {
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
  static public <T> SCallable<T> with_jpl_catcher(final Callable<T> str) {
    return new SCallable<T>() {
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
  static public SubLObject cyc_progn(SubLCons specialForm, SubLEnvironment env) {
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
  private static NameSpace bshMasterNamespace;
  private static Unsafe theUnsafe;

  @LispMethod
  static public LispObject bg_repl() throws InterruptedException {
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
  static public LispObject fg_repl() {
    repl_in_bg = false;
    return Lisp.EOF;
  }

  @LispMethod(prologName = "cyc_repl")
  static public LispObject cyc_repl() throws InterruptedException {
    return BeanShellCntrl.with_sublisp(true, new BeanShellCntrl.SCallable<LispObject>() {
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
  static public LispObject cyc_repl_no_suspend() {
    boolean wasSubLisp = Main.isSubLisp();
    LispObject io = Symbol.TERMINAL_IO.symbolValue();
    LispObject out = Symbol.STANDARD_OUTPUT.symbolValue();
    LispObject in = Symbol.STANDARD_INPUT.symbolValue();
    init_cyc();
    SubLReader SLR = ensureMainReader();
    boolean wasQuitOnExit = SLR.quitOnExit;
    boolean was_shouldReadloopExit = SLR.shouldReadloopExit;
    boolean was_noExit = Main.noExit;
    SLR.quitOnExit = false;
    SLR.shouldReadloopExit = false;
    Main.noExit = true;
    SubLPackage prevPackage = Lisp.getCurrentPackage();
    try {
      try {
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

  static public void describeObject(String name, Object in, PrintWriter pw) {
    if (in == null) {
      pw.println("" + name + " is NULL!");
      return;
    }
    pw.print("" + name + " is: ");
    pw.println(pw.getClass() + " sihc=" + System.identityHashCode(in));
  }

  static public void describeStreams() {
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

  static public bsh.Interpreter ensureBSH() {
    synchronized (StartupLock) {
      if (bshInterpreter == null) {
        try {
          bshInterpreter = new bsh.Interpreter();
          bshMasterNamespace = bshInterpreter.getNameSpace();

        } catch (Throwable e) {
          Debug.trace(e);
        }
      }
      return bshInterpreter;
    }
  }

  static public bsh.Interpreter new_bsh_interpeter() throws EvalError {
    bshInterpreter = ensureBSH();
    return (bsh.Interpreter) bshInterpreter.eval("new bsh.Interpreter()");
  }

  static public bsh.NameSpace masterNamespace() {
    ensureBSH();
    return bshMasterNamespace;
  }

  // /**
  // *
  // */
  static public SubLReader ensureMainReader() {
    SubLReader SLR = SubLMain.getMainReader();
    if (SLR == null) {
      SLR = new SubLReader();
      SubLMain.setMainReader(SLR);
    }
    return SLR;
  }

  static public void importEverywhere(Operator oper, boolean reexport) {
    final Symbol lispObject = oper.getLambdaName().toSymbol().toLispObject();
    importEverywhere(lispObject, reexport);
  }

  static public void importEverywhere(Symbol symbol, boolean reexport) {
    Lisp.PACKAGE_CYC.importSymbol(symbol);
    if (reexport)
      Lisp.PACKAGE_CYC.export(symbol);
    Lisp.PACKAGE_SUBLISP.importSymbol(symbol);
    Lisp.PACKAGE_EXT.importSymbol(symbol);
    if (reexport)
      Lisp.PACKAGE_EXT.export(symbol);
    Lisp.PACKAGE_CL_USER.importSymbol(symbol);
  }

  static public Object findDesktopPane(Object thiz) {
    synchronized (StartupLock) {
      if (desktop != null)
        return desktop;
    }
    NameSpace ns = ((This) thiz).getNameSpace();
    Object pane;
    try {
      pane = ns.getVariable("pane");
      if (pane == null || pane == Primitive.VOID) {
        Container container = introduced_appdapter(ns);
        if (container != null) {
          return container;
        }
        pane = desktop = new JDesktopPane();
        ns.setVariable("pane", pane, false);
      }
      return pane;
    } catch (Exception e) {
      MsgBox.error(e);
    }
    return null;
  }

  static public Method findMethod(Method[] staticMethods, Object[] javaArgs) {
    int argCount = javaArgs.length;
    Method result = null;
    Method macro = null;
    for (int i = staticMethods.length; i-- > 0;) {
      Method method = staticMethods[i];
      if (method == null || method == multiMethod) {
        continue;
      }
      final Class<?>[] parameterTypes = method.getParameterTypes();
      final int parameterTypeslength = parameterTypes.length;
      if (parameterTypeslength != argCount) {
        continue;
      }
      Class<?>[] methodTypes = parameterTypes;
      if (!Java.isApplicableMethod(methodTypes, javaArgs)) {
        continue;
      }
      if (result == null || Java.isMoreSpecialized(methodTypes, result.getParameterTypes())) {
        result = method;
      }
    }
    if (result == null)
      return macro;
    return result;
  }

  /**
   * @param js
   * @return
   */
  static public Symbol findOrCreateSymbol(String js, LispMethod lm) {
    Package pkg = null;
    String suggest = null;
    String suggestPackage = null;
    boolean exported = true;
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
    if (suggestPackage != null)
      pkg = Packages.findPackage(suggestPackage).toPackage().toLispObject();
    if (pkg == null)
      pkg = Lisp.getCurrentPackage();
    Symbol sym = null;
    if (!exported) {
      sym = pkg.intern(js);
    } else {
      sym = pkg.internAndExport(js);
    }
    importEverywhere(sym, exported);
    return sym;
  }

  static public BeanBowl getBowl() {
    return bowl;
  }

  static public <T> T getSingleton(Class<T> isc) {
    synchronized (singletons) {
      String named = Lisp.getDotName(isc);
      CreationInfo was = singletons.get(named);
      if (was == null)
        return null;
      return (T) was.value;
    }
  }

  static public Unsafe getUnsafe() {
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

  @LispMethod
  static public void init_cyc() {
    synchronized (StartupLock) {
      if (inited_cyc)
        return;
      inited_cyc = true;
    }
    synchronized (StartupInitLock) {
      init_subl();
      boolean wasSubLisp = Main.isSubLisp();
      Main.setSubLisp(true);
      try {
        SubLPackage prevPackage = Lisp.getCurrentPackage();
        try {
          init_subl();
          SubLMain.handleInits();
          SubLPackage.setCurrentPackage("CYC");
          SubLMain.initializeTranslatedSystems();
          inited_cyc = true;
          inited_cyc_complete = true;
        } catch (Throwable e) {
          inited_cyc_complete = false;
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
  static public void init_cyc_server() {
    synchronized (StartupInitLock) {
      init_kb();
      init_server();
    }
  }

  @LispMethod
  static public void init_kb() {
    synchronized (StartupLock) {
      if (inited_kb)
        return;
      inited_kb = true;
    }
    synchronized (StartupInitLock) {
      boolean wasSubLisp = Main.isSubLisp();
      Main.setSubLisp(true);
      try {
        SubLPackage prevPackage = Lisp.getCurrentPackage();
        try {
          init_cyc();
          SubLPackage.setCurrentPackage("CYC");
          Eval.evalInCurrentThread("(sl:load \"init/jrtl-release-init.lisp\")");
        } catch (Throwable e) {
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
  static public void init_server() {
    synchronized (StartupLock) {
      if (inited_cyc_server)
        return;
    }
    synchronized (StartupInitLock) {
      boolean wasSubLisp = Main.isSubLisp();
      Main.setSubLisp(true);
      try {
        SubLPackage prevPackage = Lisp.getCurrentPackage();
        try {
          init_cyc();
          SubLPackage.setCurrentPackage("CYC");
          Eval.eval("(sl:load \"init/services-init.lisp\")");
          SubLFiles.initialize("eu.larkc.core.orchestrator.LarkcInit");
          SubLFiles.initialize("eu.larkc.core.orchestrator.servers.LarKCHttpServer");
          // if( !SubLMain.OPENCYC )
          // LarkcInit.initializeLarkc();
          LarKCHttpServer.start_sparql_server();
          inited_cyc_server = true;
          PrologSync.setPrologReady(true);
          LispSync.setLispReady(true);
        } catch (Throwable e) {
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
  static public void init_subl() {
    synchronized (StartupLock) {
      if (inited_subl)
        return;
      inited_subl = true;
    }
    synchronized (StartupInitLock) {
      init_swipl();
      SubLMain.commonSymbolsOK = true;
      boolean b = SubLMain.isInitialized();
      if (b) {
        return;
      }
      boolean wasSubLisp = Main.isSubLisp();
      boolean wasshouldRunInBackground = SubLMain.shouldRunInBackground;
      SubLMain me = SubLMain.me;
      SubLPackage prevPackage = Lisp.getCurrentPackage();
      SubLPackage.initPackages();
      Main.setSubLisp(true);
      try {
        SubLMain.shouldRunInBackground = true;
        SubLMain.initializeSubL(new String[0]);
        // ensureMainReader();
      } finally {
        SubLPackage.setCurrentPackage(prevPackage);
        Main.setSubLisp(wasSubLisp);
        SubLMain.shouldRunInBackground = wasshouldRunInBackground;
      }
    }
    return;
  }

  static public Object invokeM(Method m, Object object, Object... methodArgs) {
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
      t.printStackTrace();
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
  static public LispObject j_desktop() {
    synchronized (StartupInitLock) {
      if (editor == null)
        editor = Editor.currentEditor();
      if (noGUI)
        return org.armedbear.lisp.JavaObject.getInstance(editor);
      // if (true && false) return
      // org.armedbear.lisp.JavaObject.getInstance(editor);
      if (editor == null)
        Editor.startJ(new String[] { "--no-session", "--debug", "--force-new-instance" }, false, false);
      if (editor == null)
        editor = Editor.currentEditor();
      if (editor == null)
        Errors.unimplementedMethod("BeanShellCntrl.j_desktop");
      addSingleton(editor);
      return org.armedbear.lisp.JavaObject.getInstance(editor);
    }
  }

  @LispMethod
  static public LispObject lisp_eval(LispObject args) {
    Environment env = Environment.currentLispEnvironment();
    return lisp_progn(args, env);
  }

  @LispMethod
  static public LispObject lo2lo(LispObject arg) {
    return arg;
  }

  @LispMethod
  static public Object lo2o(LispObject arg) {
    return arg;
  }

  @LispMethod
  static public Object o2o(Object arg) {
    return arg;
  }

  @LispMethod
  static public LispObject lisp_progn(LispObject args, Environment env) {
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
  static public LispObject lisp_eval_string(String statements) {
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
  static public LispObject lisp_eval(Term term) {
    try {
      LispObject args = term_to_lobject(term);
      Reader reader = new StringReader(":bt\n");
      return with_lisp_io(new SCallable<LispObject>() {
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

  static public LispObject with_lisp_io(SCallable<LispObject> fun, Reader reader, Writer writer) {
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
        final Stream in = new Stream(Symbol.SYSTEM_STREAM, new BufferedReader(reader));
        final Stream out = new Stream(Symbol.SYSTEM_STREAM, writer);
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

  /**
   * TODO Describe this type briefly. If necessary include a longer description
   * and/or an example.
   * 
   * @author Administrator
   *
   */
  public static final class JPLExceptionFromJava extends PrologException {
    /**
     * TODO Describe this constructor.
     * 
     * @param term
     */
    public JPLExceptionFromJava(Term term, Throwable cause) {
      super(term);
      initCause(cause);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Throwable#toString()
     */
    @Override
    public String toString() {
      return super.toString();
    }
  }

  public static interface SCallable<T> extends Callable<T> {
    @Override
    T call();
  }

  static {
    SystemCurrent.setupIO();
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
      return BeanShellCntrl.doThrow(box);
    }
  }

  @LispMethod
  static public LispObject lisp_repl() {
    boolean wasSubLisp = Main.isSubLisp();
    Main.setSubLisp(false);
    if (wasSubLisp) {
      cl_imports_cyc();
      cyc_imports_cl();
    }
    boolean was_noExit = Main.noExit;
    try {
      try {
        Main.noExit = true;
        final Interpreter lispInstance = org.armedbear.lisp.Interpreter.createNewLispInstance(System.in, System.out, //
            new File(".").getAbsolutePath(), Version.getVersion(), false);
        lispInstance.run();
      } catch (org.armedbear.lisp.ProcessingTerminated e) {
        // e.printStackTrace();
        // TODO: handle exception
      } catch (ConditionThrowable e) {
        throw e;
      } catch (Throwable e) {
        e.printStackTrace();
        // TODO: handle exception
      }
      return Symbol.STAR.symbolValue();
      // return
      // Lisp.PACKAGE_TPL.findAccessibleSymbol("TOP-LEVEL-LOOP").execute();
    } finally {
      Main.setSubLisp(wasSubLisp);
      Main.noExit = was_noExit;
    }
  }

  @LispMethod
  static public Object lisp_ui() throws EvalError {
    JConsole console = (JConsole) bsh_eval("makeConsole(\"LispUI\")");
    return console;
  }

  @ConverterMethod
  static public Term lobject_to_term(LispObject o) {
    Term term = PrologSync.toProlog(o, new ArrayList());
    // o.termRef = term;
    return term;
  }

  @LispMethod
  static public Object prolog_call_all(Term arg) {
    return (new org.jpl7.Query("call", arg)).allSolutions();
  }

  @LispMethod
  static public Map<String, Term>[] prolog_call_n(Term arg, long n) {
    return (new org.jpl7.Query("call", arg)).nSolutions(n);
  }

  @LispMethod
  static public Map<String, Term> prolog_call_1(Term arg, long n) {
    return (new org.jpl7.Query("call", arg)).oneSolution();
  }

  @LispMethod
  static public LispObject prolog_unify(LispObject arg) throws Exception, InterruptedException {
    final LispObject prolog_eval_lobject = prolog_eval_lobject(arg);
    return Lisp.list(prolog_eval_lobject);
  }

  @LispMethod
  static public LispObject prolog_eval_lobject(LispObject arg) throws Exception {
    Term term = lobject_to_term(arg);
    return prolog_eval_term(new Compound("called_from_cyc", term));
  }

  @LispMethod
  static public LispObject prolog_eval_term(Term term) throws Exception {
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
  static public Object prolog_query_all(String arg) {
    return Query.allSolutions(arg);
  }

  @LispMethod
  static public Object prolog_query(String arg) {
    if (noPrologJNI)
      throw new StartupError("noPrologJNI: " + arg);
    final Term term = org.jpl7.Util.textToTerm(arg);
    return Query.oneSolution(term);
  }

  @LispMethod
  static public boolean oneSolution(String arg) {
    if (noPrologJNI)
      throw new StartupError("noPrologJNI: " + arg);
    final Term term = org.jpl7.Util.textToTerm(arg);
    final Map<String, Term> oneSolution = Query.oneSolution(term);
    return oneSolution != null && oneSolution.size() > 0;
  }

  @LispMethod
  static public Object prolog_ui() throws EvalError {
    JConsole console = (JConsole) bsh_eval("makeConsole(\"PrologUI\")");
    return console;
  }

  static public void registerMethod(Method m) {
    boolean evalArgsFirst = true;
    String js = m.getName();
    if (js.startsWith("sf_")) {
      evalArgsFirst = false;
      js = js.substring(3);
    }
    LispMethod lm = m.getAnnotation(LispMethod.class);
    Symbol sym = findOrCreateSymbol(js, lm);
    String prologName = symbolToPrologName(sym, lm);
    registerPrologMethod(prologName, sym, m);
    SpecialMethod cf = setSpecialMethod(sym);
    // if (cf == null) return;
    cf.setEvalArgsFirst(evalArgsFirst);
    cf.addMethod(m);
  }

  static public void registerPrologMethod(String prologName, Symbol sym, Method method) {
    if (noPrologJNI)
      return;
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
    oneSolution("assert((" + string + "))");
  }

  static public void scanForExports(Class clz) {
    for (java.lang.reflect.Method m : clz.getDeclaredMethods()) {
      if (Reflect.isStatic(m)) {
        if (m.isAnnotationPresent(LispMethod.class)) {
          registerMethod(m);
          continue;
        }
      }
    }
    // for (java.lang.reflect.Field m : clz.getDeclaredFields()) {
    // if (Reflect.isStatic(m)) {
    // if (m.isAnnotationPresent(LispMethod.class)) {
    // //registerMethod(m);
    // //continue;
    // }
    //
    // }
    // }
  }

  static SpecialMethod setSpecialMethod(Symbol sym) {
    LispObject sf = sym.getSymbolFunctionOrNull();
    if (sf == null) {
      sf = new SpecialMethod(sym);
      sym.setFunction((SubLOperator) sf);
      sym.setBuiltInFunction(true);
      return (SpecialMethod) sf;
    } else if (sf instanceof SpecialMethod) {
      return (SpecialMethod) sf;
    } else {
      Lisp.program_error("Trying to overwrite a non special method");
      String complaint = "Trying to overwrite a non method function "; // + sf;
      System.err.println(complaint);
      Lisp.program_error(complaint);
      return null;
    }
  }

  static public void setSingleton(Class isc, Object self) {
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
        if (!named.equals(isc.getName())) {
          setNamed(isc, self, isc.getName());
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
  static public void start_from_prolog() throws InterruptedException {
    synchronized (StartupLock) {
      if (started_from_prolog)
        return;
      started_from_prolog = true;
    }
    Main.needIOConsole = true;
    start_lisp_from_prolog();
  }

  @LispMethod
  static public void start_from_prolog_ikvm() throws InterruptedException {
    synchronized (StartupLock) {
      if (started_from_prolog)
        return;
      started_from_prolog = true;
    }
    Main.needIOConsole = true;
    start_lisp_from_prolog();
  }

  @LispMethod
  static public void start_lisp_from_prolog() {
    if (!noProlog) {
      noPrologJNI = disablePrologSync = false;
    }
    // Main.trackStructs = !disablePrologSync;
    bsh_desktop();
    scanForExports(BeanShellCntrl.class); // again
    PrologSync.setPrologReady(!disablePrologSync);
  }

  static public void startEmbedded() {
    // org.armedbear.lisp.Interpreter.createInstance();
  }

  @LispMethod
  static void init_swipl() {
    synchronized (StartupLock) {
      if (noProlog)
        return;
      if (called_init_swipl)
        return;
      called_init_swipl = true;
      synchronized (StartupInitLock) {
        try {
          String pathvar = System.getenv("PATH");
          String JLP = System.getProperty("java.library.path", null);
          if (JLP == null)
            System.setProperty("java.library.path", pathvar);
          started_from_prolog = !JPL.init();
          // Thread.sleep(10000);
          Object r = JPL.getDefaultInitArgs();
          if (isIKVM()) {
            oneSolution("assert(swicli:is_ikvm)");
          }
          PrologSync.setPrologReady(true);
        } catch (UnsatisfiedLinkError e) {
          noPrologJNI = true;
          noProlog = true;
          disablePrologSync = true;
          System.err.println("" + e);
        }
      }
    }
  }

  @LispMethod
  static public void init_swipl_server() {
    synchronized (StartupLock) {
      if (noPrologJNI)
        return;
      if (inited_swipl_server)
        return;
      synchronized (StartupInitLock) {
        try {
          String LARKC_HOME = getSetProp("LARKC_HOME", "larkc.home");
          init_swipl();
          inited_swipl_server = oneSolution("ensure_loaded('" + LARKC_HOME.replace("\\", "/") + "/from_swipl')");
          inited_swipl_server = oneSolution("(current_thread(prolog_server,X),X=running)");
          if (inited_swipl_server)
            return;
          oneSolution("use_module(library('prolog_server'))");
          inited_swipl_server = true;
        } catch (Throwable t) {
          inited_swipl_server = false;
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
  private static String getSetProp(String envprop, String jvmprop) {
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

  @ConverterMethod
  @LispMethod
  static public LispObject term_to_lobject(Term term) throws Exception {
    if (term instanceof Atom) {
      return atom_to_lobject((Atom) term);
    }
    Object o = term_to_object(term);
    if (o instanceof LispObject) {
      return (LispObject) o;
    }
    return JavaObject.getInstance(o, true);
  }

  @ConverterMethod
  @LispMethod
  static public Object term_to_object(Term term) throws Exception {
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
      Class termClass = term.getClass();
      ClassLoader cl = termClass.getClassLoader();
      e.printStackTrace();
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
  static public LispObject read_lisp(String s) {
    return Lisp.readObjectFromString(s);
  }

  public static LispObject atom_to_lisp_object(String s) throws Exception {
    SubLObject found;
    // String s = a.name();
    if (s.startsWith("#$")) {
      if (!inited_cyc_complete) {
        Debug.assertTrue(inited_cyc_complete);
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
    boolean readAsSubLisp = s.startsWith("?") || s.contains("#$") || (Main.isSubLisp() && s.contains(":"));
    if (readAsSubLisp) {
      if (!inited_cyc_complete) {
        Debug.assertTrue(inited_cyc_complete);
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
    if (inited_cyc_complete) {
      SimpleString ss = new SimpleString(s);
      found = find_constant_by_name(ss);
      if (found instanceof SubLStruct)
        return found.toLispObject();
    }
    // boolean caseMattersU = (!s.toUpperCase().equals(s));
    final String sF = s;
    return with_jpl_catcher((SCallable<LispObject>) new SCallable<LispObject>() {
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

  @ConverterMethod
  static public Object atom_to_object(Atom thiz) {
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

  @ConverterMethod
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
      throw new JPLExceptionFromJava(stackTrace, throwable);
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
    throw (T) t; // ( ͡° ͜ʖ ͡°)
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
    if (!inited_cyc_complete)
      return constant;
    if (SubLMain.OPENCYC) {
      if (installedCR == null) {
        try {
          installedCR = Class.forName("com.cyc.cycjava.cycl.constants_high_oc").getDeclaredMethod("f10737", SubLObject.class);
        } catch (NoSuchMethodException | SecurityException | ClassNotFoundException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
      try {
        return (SubLObject) installedCR.invoke(constant);
      } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
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

  static public Object toJavaObject(Variable thiz) {
    Object object = thiz.getTag();
    if (object == null) {
      String name = thiz.name;
      if (name.equals("_")) {
        name = "??" + (n++);
      } else if (name.startsWith("_")) {
        name = "?" + name.substring(1);
      }
      object = BeanShellCntrl.read_sublisp("?" + name);
    }
    return object;
  }

  static public Object compound_to_object(Compound term, String value, Term[] args) throws Exception {
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
        e.printStackTrace();
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
      return BeanShellCntrl.terms_to_lisp_objects(args);
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

  static public LispObject[] terms_to_lisp_objects(Term[] args) throws Exception {
    if (args.length == 0)
      return EMPTY_LISP_OBJECT;
    LispObject[] largs = new LispObject[args.length];
    for (int i = 0; i < args.length; i++) {
      largs[i] = term_to_lobject(args[i]);
    }
    return largs;
  }

  @LispMethod
  static public Object test_int(int obj) {
    return obj;
  }

  @LispMethod
  static public Object test_object(Object obj) {
    return obj;
  }

  @LispMethod
  static public Object test_string(String obj) {
    return obj;
  }

  @LispMethod
  static public Object test_term(Term obj) {
    return obj;
  }

  @LispMethod
  static public Object test_term_t(term_t obj) {
    return obj;
  }

  static public Error throwException(Throwable exception) {
    if (true)
      getUnsafe().throwException(exception);
    return BeanShellCntrl.<RuntimeException>throwException1(exception, null);
  }

  @SuppressWarnings("unchecked")
  static public <T extends Throwable> Error throwException1(final Throwable exception, Object dummy) throws T {
    throw (T) exception;
  }

  static public LispObject[] toArray(LispObject args) {
    if (args == SubLNil.NIL)
      return EMPTY_LISP_OBJECT;
    if (!(args instanceof Cons))
      return new LispObject[] { args };
    return args.copyToArray();
  }

  @LispMethod
  static public LispObject ui_inspect(LispObject arg) {
    BeanShellCntrl.addObject(null, arg);
    return arg;
  }

  private static Container introduced_appdapter(NameSpace ns) throws UtilEvalError {
    Object controlApp = bshInvoke("org.appdapter.gui.browse.Utility.controlApp");
    if (false && controlApp != null) {
      Component bpo = null;
      // org.appdapter.gui.api.BoxPanelSwitchableView bpo;
      bpo = (Container) bshInvoke("org.appdapter.gui.browse.Utility.controlApp.getBoxPanelTabPane()");
      if (bpo != null) {
        Container container = (Container) invoke(bpo, "getContainer()");
        ns.setVariable("pane", container, false);
        Container parent = container.getParent();
        while (parent.getParent() != null) {
          parent = parent.getParent();
        }
        ns.setVariable("frame", parent, false);
        return container;
      }
    }
    return null;
  }

  static public void showObject(Object o) {
    try {
      invoke(demoBrowserClass(), "showObject", o);
    } catch (EvalError e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }

  /**
   * TODO Describe the purpose of this method.
   * 
   * @return
   * @throws EvalError
   */
  private static Class demoBrowserClass() throws EvalError {
    return (Class) ensureBSH().eval("org.appdapter.gui.demo.DemoBrowser.class");
  }

  @LispMethod
  static public void ui_inspector() {
    try {
      if (calledStartAppdatper) {
        invokeDemoBrowser("show()");
        return;
      }
      calledStartAppdatper = true;
      if (true) {
        invoke("com.netbreeze.bbowl.gui.BeanBowlGUI", "startBeanBowl", bowl);
      }
      // TODO
      /*
       * 
       * import org.appdapter.gui.api.BoxPanelSwitchableView; import
       * org.appdapter.gui.browse.Utility; import org.appdapter.gui.demo.DemoBrowser;
       * 
       */
      try {
        invokeDemoBrowser("testLoggingSetup();");
        invokeDemoBrowser("setLoggerTo(java.util.logging.Level.ALL);");
      } catch (Throwable e1) {
        // e1.printStackTrace();
        // TODO Auto-generated catch block
        // MsgBox.error(e1);
      }
      invokeDemoBrowser("defaultExampleCode = true;");
      invokeDemoBrowser("ensureRunning(true, new String[0]);");
      invokeDemoBrowser("show();");
      JFrame appFrame = (JFrame) bshInvoke("org.appdapter.gui.browse.Utility.Utility.getAppFrame();");
      appFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
      // some more test code
      invokeDemoBrowser("addMoreExamples();");
      dbrowser = invokeDemoBrowser("mainControl");
      // TODO
      bowl.addListener((BeansContextListener) dbrowser);
    } catch (Throwable e) {
      e.printStackTrace();
      // TODO Auto-generated catch block
      // MsgBox.error(e);
    }
  }

  /**
   * TODO Describe the purpose of this method.
   * 
   * @param string
   * @return
   */
  private static Object invokeDemoBrowser(String string) {
    return bshInvoke("org.appdapter.gui.demo.DemoBrowser." + string);
  }

  /**
   * TODO Describe the purpose of this method.
   * 
   * @param string
   * @param string2
   */
  private static Object bshInvoke(String string) {
    // TODO Auto-generated method stub
    try {
      return ensureBSH().eval(string);
    } catch (EvalError e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }

  private static Object invoke(Object o, String string, Object... objects) {
    try {
      final bsh.Interpreter ensureBSH = ensureBSH();
      if (o instanceof String) {
        try {
          o = Class.forName((String) o);
        } catch (ClassNotFoundException e) {
          e.printStackTrace();
          throw new RuntimeException(e);
        }
      }
      if (o instanceof Class) {
        return bsh.Reflect.invokeStaticMethod(ensureBSH.getClassManager(), (Class) o, string, objects, null);
      }
      return bsh.Reflect.invokeObjectMethod(o, string, objects, ensureBSH, null, null);
    } catch (InvocationTargetException e) {
      throw new RuntimeException(e);
    } catch (EvalError e) {
      throw new RuntimeException(e);
    } catch (ReflectError e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      throw new RuntimeException(e);
    } catch (UtilEvalError e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }

  static {
    try {
      // DemoBrowser.testLoggingSetup();
      multiMethod = BeanShellCntrl.class.getDeclaredMethod("bp");
      // BeanBowlGUI.startBeanBowl();
      // Debuggable.setIsTesting(true);
      // Debuggable.setDebugging(false);
    } catch (SecurityException e) {
      throw new RuntimeException(e);
    } catch (NoSuchMethodException e) {
      throw new RuntimeException(e);
    }
  }

  static public void start_prolog_from_lisp() {
    init_swipl_server();
    scanForExports(BeanShellCntrl.class);
  }

  public static void main(String[] args0) throws Throwable {
    try {
      main0(args0);
    } catch (Throwable e) {
      e.printStackTrace();
      throw e;
      // TODO: handle exception
    }
  }

  public static void main0(String[] args0) {
    String[] argsNew = Main.extractOptions(args0);
    start_lisp_from_prolog();
    Runnable runnable;
    if (Main.needSubLMAIN) {
      runnable = null;
    } else {
      runnable = Main.mainRunnable(argsNew, null);
    }
    scanForExports(BeanShellCntrl.class);
    if (runnable != null) {
      runnable.run();
      scanForExports(BeanShellCntrl.class);
    }
    if (Main.needSubLMAIN) {
      SubLMain.main(argsNew);
    }
  }

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

  /**
   * @author Administrator
   *
   */
  @Retention(RetentionPolicy.RUNTIME)
  static public @interface LispMethod {
    // Guess based on method name
    String prologName()

    default "";

    String symbolName()

    default "";

    String packageName()

    default "";

    boolean exported()

    default true;

    // use false is symbol macro
    boolean evalArgs()

    default true;

    // Arg has method name
    boolean popFront() default false;
  }

  @Retention(RetentionPolicy.RUNTIME)
  static public @interface LispSlot {
  }

  static public class MsgBox {
    static public final String NEW_LINE = System.getProperty("line.separator");

    static void error(String message) {
      error(message, theNameOfTheMethodThatCalledMe());
    }

    static public void error(String message, String caller) {
      try {
        show(message, caller, JOptionPane.ERROR_MESSAGE);
      } catch (Throwable unk) {
        // unk.printStackTrace();
      }
      // nb: we don't respond to the "your content was splattered"
      // event, so it's OK to pass a null owner.
    }

    static public void error(Throwable e) {
      e.printStackTrace();
      error(createStackTraceString(e));
    }

    static public void info(String message) {
      info(message, theNameOfTheMethodThatCalledMe());
    }

    static public void info(String message, String caller) {
      show(message, caller, JOptionPane.INFORMATION_MESSAGE);
    }

    static public void setClipboard(String message) {
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

    static public void show(String message, String title, int iconId) {
      setClipboard(title + ":" + NEW_LINE + message);
      JOptionPane.showMessageDialog(null, message, title, iconId);
    }

    static public String theNameOfTheMethodThatCalledMe() {
      StackTraceElement[] ste = Thread.currentThread().getStackTrace();
      return ste[3].getMethodName();
    }
  }

  static public class PrimitiveEverywhere extends org.armedbear.lisp.Primitive {
    public PrimitiveEverywhere(String string) {
      super(string, Lisp.PACKAGE_CYC, true);
      importEverywhere(this, true);
    }
  }

  static public class StartupError extends ConditionThrowable {
    public StartupError(String string) {
      super(string);
    }
  }

  public static void exit(int status) {
    // Debug.assertTrue(false);
    if (Main.noExit) {
      // Lisp.exit(status);
      return;
    }
    System.exit(status);
    // TODO Auto-generated method stub
  }

  static public class SpecialMethod extends SpecialOperator {
    boolean evalArgs = true;
    // LispMethod lispMethod;
    Method[] methodByArity;
    Method macro;
    int methodCount;
    java.util.Set<Method> staticMethods;

    public SpecialMethod(Symbol sym) {
      super((Symbol) sym, "&rest any");
    }

    synchronized public void addMethod(Method m) {
      if (m != null) {
        Class[] pt = m.getParameterTypes();
        addMethod0(m);
        if (pt.length == 0) {
          if (methodCount != 1) {
            bp();
          }
          isSpecial();
        }

      }
    }

    void addMethod0(Method m) {
      LispMethod lm = m.getAnnotation(LispMethod.class);
      if (lm != null) {
        if (!lm.evalArgs()) {
          evalArgs = false;
        } else {
          evalArgs = true;
        }
      }
      Class[] pt = m.getParameterTypes();
      int paramLen = pt.length;
      if (paramLen == 0) {
        evalArgs = true;
      }
      if (paramLen == 2 && (pt[1] == Environment.class || pt[1] == SubLEnvironment.class)) {
        evalArgs = false;
        macro = m;
        return;
      }
      if (methodByArity == null) {
        methodByArity = new Method[10];
        methodByArity[paramLen] = m;
        methodCount++;
        return;
      }
      Method was = methodByArity[paramLen];
      if (was == m)
        return;
      if (was == null) {
        methodByArity[paramLen] = m;
        methodCount++;
        return;
      }
      if (staticMethods == null)
        staticMethods = new HashSet<Method>();
      if (was == BeanShellCntrl.multiMethod) {
        staticMethods.add(m);
        methodCount++;
        return;
      }
      methodByArity[paramLen] = BeanShellCntrl.multiMethod;
      methodCount++;
      staticMethods.add(m);
      staticMethods.add(was);
    }

    @Override
    public LispObject arrayify(LispObject... args) {
      return executeEVA(null, args);
    }

    @Override
    public LispObject execute(LispObject args, Environment env) {
      if (methodByArity != null) {
        Method m = methodByArity[2];
        if (m != null) {
          Class[] parameterTypes = m.getParameterTypes();
          Class class1 = parameterTypes[1];
          if (class1 == Environment.class || class1 == SubLEnvironment.class) {
            final Object result = BeanShellCntrl.invokeM(m, null, args, env);
            return JavaObject.getInstance(result, true, m.getReturnType());
          }
        }
      }
      if (args == NIL) {
        return executeEVA(env, BeanShellCntrl.EMPTY_LISP_OBJECT);
      }
      return executeEVA(env, args.copyToArray());
    }

    // Special operator
    public LispObject executeOP(LispObject form, Environment env) {
      if (isSubLispBased()) {
        SubLObject toEval = super.apply((SubLCons) form, env);
        return (LispObject) toEval;// (LispObject) toEval.eval(env);
      }
      return Lisp.eval(form, env);
    }

    @Override
    public LispObject execute(LispObject[] args) {
      return executeEVA(Environment.currentLispEnvironment(), args);
    }

    public Object invokeFromProlog(final Term list, final Term result) {
      return with_jpl_catcher(new Callable<Object>() {
        @Override
        public Object call() throws Exception {
          return invokeFromProlog0(list, result);
        }
      }).call();
    }

    public Object invokeFromProlog0(Term list, Term result) {
      boolean wasNoDebug = Main.isNoDebug();
      try {
        final Term[] args = list.args();
        Method m = null;
        Object[] javaArgs = args;
        do {
          if (methodByArity != null) {
            if ((m = BeanShellCntrl.findMethod(methodByArity, javaArgs)) != null)
              break;
          }
          Method[] methodsArray = null;
          final boolean hasStaticMethods = staticMethods != null && staticMethods.size() > 0;
          if (hasStaticMethods) {
            methodsArray = staticMethods.toArray(new Method[staticMethods.size()]);
            if ((m = BeanShellCntrl.findMethod(methodsArray, javaArgs)) != null)
              break;
          }
          javaArgs = BeanShellCntrl.terms_to_lisp_objects(args);
          if ((m = BeanShellCntrl.findMethod(methodByArity, javaArgs)) != null)
            break;
          if (hasStaticMethods) {
            if ((m = BeanShellCntrl.findMethod(methodsArray, javaArgs)) != null)
              break;
          }
          if ((m = macro) == null)
            error(new LispError("no such method"));
          break;
        } while (true);
        if (!wasNoDebug) {
          Main.setNoDebug(true);
        }
        Object o = BeanShellCntrl.invokeM(m, null, javaArgs);
        if (!result.isVariable()) {
          return result;
        }
        Class rt = m.getReturnType();
        if (Term.class.isAssignableFrom(rt)) { //
          return o;
        } else if (LispObject.class.isAssignableFrom(rt) || SubLObject.class.isAssignableFrom(rt)) {
          Term t = object_to_term(o);
          return t;
        } else {
          Term t = object_to_term(o);
          return t;
        }
      } catch (Throwable e) {
        if (!wasNoDebug) {
          Main.setNoDebug(false);
        }
        e.printStackTrace();
        System.err.println("" + e.getMessage());
        if (e instanceof JPLException) {
          throw (JPLException) e;
        }
        throw new JPLException(BeanShellCntrl.createStackTraceString(e));
      } finally {
        Main.setNoDebug(wasNoDebug);
      }
    }

    private LispObject executeEML(Environment env, int paramLen, boolean tryPTLArityFirst, LispObject[] args) {
      Method[] methodsArray = methodByArity;
      Method m = BeanShellCntrl.findMethod(methodsArray, args);
      if (m == null) {
        if (staticMethods != null && staticMethods.size() > 0) {
          methodsArray = staticMethods.toArray(new Method[staticMethods.size()]);
          m = BeanShellCntrl.findMethod(methodsArray, args);
          if (m == null) {
            m = BeanShellCntrl.findMethod(methodsArray, args);
          }
        }
      }
      if (m == null)
        error(new LispError("no such method"));
      return invokeArgs(m, env, args);
    }

    public LispObject executeEVA(Environment env, LispObject[] args) {
      int paramLen = args.length;
      if (methodByArity == null)
        executeEML(env, paramLen, true, args);
      Method m = methodByArity[paramLen];
      if (m == BeanShellCntrl.multiMethod) {
        return executeEML(env, paramLen, true, args);
      }
      if (m == null) {
        return executeEML(env, paramLen, false, args);
      }
      return invokeArgs(m, env, args);
    }

    private LispObject invokeArgs(Method m, Environment env, LispObject[] args) {
      Class[] argTypes = m.getParameterTypes();
      int argTypesLen = argTypes.length;
      int usedLen = args.length;
      if (argTypesLen == 2 && SubLEnvironment.class.isAssignableFrom(argTypes[1])) {
        LispObject invokeWith;
        assert env != null;
        if (usedLen == 1) {
          invokeWith = new Cons(args[0]);
        } else {
          invokeWith = Lisp.list(args);
        }
        return (LispObject) BeanShellCntrl.invokeM(m, null, invokeWith, env);
      }
      Object[] methodArgs = new Object[argTypesLen];
      for (int i = 0; i < usedLen; i++) {
        LispObject arg = args[i];
        if (evalArgs) {
          LispObject sarg = Lisp.eval(arg, env);
          arg = sarg;
        }
        if (false && Lisp.NULL(arg)) {
          methodArgs[i] = false;
        } else if (false && T == arg) {
          methodArgs[i] = true;
        } else {
          Class type = argTypes[i];
          if (type == LispObject.class) {
            methodArgs[i] = arg;
          } else if (type == Term.class) {
            methodArgs[i] = BeanShellCntrl.object_to_term(arg);
          } else {
            methodArgs[i] = arg.javaInstance(type);
          }
        }
      }
      m.setAccessible(true);
      Object result = BeanShellCntrl.invokeM(m, null, methodArgs);
      if (LispObject.class.isAssignableFrom(m.getReturnType()))
        return (LispObject) result;
      if (result instanceof Boolean)
        return (LispObject) SubLObjectFactory.makeBoolean((Boolean) result);
      return JavaObject.getInstance(result, true, m.getReturnType());
    }

    @Override
    public SubLObject apply(SubLCons p0, SubLEnvironment p1) {
      return getBinaryFunction().processItem(p0, p1);
      // return Lisp.eval(cons, env);
      // Errors.unimplementedMethod("Auto-generated method stub:
      // SubLFunction.apply");
      // return null;
    }

    @Override
    public LispObject funcallCL(LispObject... args) {
      return this.execute(args);
    }

    @Override
    public SubLObject evalViaApply(SubLCons form, SubLEnvironment env) {
      if (isSubLispBased()) {
        return super.evalViaApply(form, env);
      }
      return Lisp.eval((Cons) form, (Environment) env);
    }

    @Override
    public boolean isInterpreted() {
      return true;
    }

    @Override
    public boolean isFunction() {
      return evalArgs;
    }

    @Override
    public boolean isSpecial() {
      if (evalArgs) {
        BeanShellCntrl.bp();
      }
      return !evalArgs;
    }

    @Override
    public boolean isSpecialRestOnly() {
      return super.isSpecialRestOnly();
    }

    public void setEvalArgsFirst(boolean evalArgsFirst) {
      evalArgs = evalArgsFirst;
    }
  }

  public static org.armedbear.lisp.Interpreter currentLisp() {
    return Interpreter.getInstance();
  }

  /**
   *
   */
  public static void registerSelf() {
    BeanShellCntrl.scanForExports(BeanShellCntrl.class);
    BeanShellCntrl.cl_imports_cyc();
    BeanShellCntrl.cyc_imports_cl();
    start_prolog_from_lisp();
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

}
