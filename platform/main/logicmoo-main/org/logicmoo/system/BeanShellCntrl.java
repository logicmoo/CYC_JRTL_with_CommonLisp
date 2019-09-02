
package org.logicmoo.system;

import java.awt.Component;
import java.awt.Container;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Reader;
import java.lang.Thread.UncaughtExceptionHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import org.appdapter.core.convert.Converter.ConverterMethod;
import org.armedbear.j.Log;
import org.armedbear.j.ReaderThread;
import org.armedbear.lisp.Debug;
import org.armedbear.lisp.JavaObject;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.Main;
import org.armedbear.lisp.Package;
import org.armedbear.lisp.Pathname;
import org.armedbear.lisp.Symbol;
import org.armedbear.lisp.Version;
import org.jpl7.JPLException;
import org.jpl7.Term;
import org.jpl7.Variable;
import org.logicmoo.bb.BeansContextListener;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrologSync;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThreadPool;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.util.IsolatedClassLoader;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;

import bsh.BshClassManager;
import bsh.CallStack;
import bsh.EvalError;
import bsh.NameSpace;
import bsh.Primitive;
import bsh.SimpleNode;
import bsh.This;
import bsh.UtilEvalError;
import bsh.util.JConsole;
import bsh.util.NameCompletion;

//import org.appdapter.gui.browse.Utility;
//import static org.slf4j.spi.LocationAwareLogger.log;
public class BeanShellCntrl extends Startup {
	//	final private static ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
	//	final private static ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");

	private static boolean hasAppdapter;

	public static void main(String[] args0) throws Throwable {
		try {
			String[] args1 = extractOptions(BeanShellCntrl.class, args0);
			main0(args1);
		} catch (Throwable e) {
			e.printStackTrace();
			throw e;
			// TODO: handle exception
		}
	}

	public static void addConsole(bsh.This thiz, final JConsole console) throws UtilEvalError, EvalError, InterruptedException {
		Object o = thiz.getNameSpace().getVariable("interpreter", false);
		String myName = null;
		o = thiz.getNameSpace().getVariable("name", false);
		if (o instanceof String) {
			myName = (String) o;
			addObject(myName, thiz);
			String myNameL = myName.toLowerCase();
			System.err.print("");
			console.setName(myName);
			if (myNameL.startsWith("system io")) {
				final PrintStream out0 = console.getOut();
				SystemCurrent.cantSetOut = true;
				System.setOut(out0);
				System.setIn(console.getInputStream());
				System.setErr(console.getErr());
			} else if (myNameL.contains("prolog")) {
				/// console.setNameCompletion(new LispNameCompletion());
				connectProlog(myName, console);
				return;

			} else if (myNameL.contains("lisp")) {
				//maybeCapture(thiz);
				connectLisp(myName, console);
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
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param thiz
	 */
	public static void maybeCapture(bsh.This thiz) {
		try {
			if (needIOConsole) {
				needIOConsole = false;
				thiz.invokeMethod("captureSysIO", new Object[0]);
			}
		} catch (EvalError e) {
			MsgBox.error(e);
			throw new RuntimeException(e);
		}
		System.out.println("Hi");
	}

	public static JConsole connectProlog(String name, final JConsole console0) {
		final JConsole console;
		if (console0 == null) {
			console = new JConsole();
			console.setName(name);
		} else
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

	@LispMethod
	public static boolean attach_jvm(String jarfile) throws IOException {
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

	@LispMethod
	public static void bsh_desktop() {
		if (noBSHGUI || noGUI)
			return;
		try {
			if (calledStartDmiles)
				return;
			calledStartDmiles = true;
			bsh.Interpreter ensureBSH = ensureBSH();
			//ensureBSH.eval("startDmiles()");
			// BeanShellCntrl.setSingleton(interpreter);
			ensureBSH.setShowResults(true);
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
			calledStartDmiles = false;
			MsgBox.error(e);
		}
	}

	@LispMethod
	public static Object bsh_eval(Object form) throws Exception, EvalError {
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
	public static Object bsh_eval(String statements) throws EvalError {
		return ensureBSH().eval(statements);
	}

	@LispMethod
	public static Object bsh_repl() throws EvalError {
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
		noExit = true;
		try {
			interp.run();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return true;
	}

	public static Object findDesktopPane(Object thiz) {
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

	public static bsh.Interpreter ensureBSH() {
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

	public static bsh.Interpreter new_bsh_interpeter() throws EvalError {
		bshInterpreter = ensureBSH();
		return (bsh.Interpreter) bshInterpreter.eval("new bsh.Interpreter()");
	}

	public static bsh.NameSpace masterNamespace() {
		ensureBSH();
		return bshMasterNamespace;
	}

	@LispMethod
	public static LispObject bsh_exec(LispObject arg) throws EvalError {
		if (arg.isString())
			return JavaObject.getInstance(bsh_eval(arg.getStringValue()), true, null);
		return JavaObject.getInstance(bsh_eval((String) arg.javaInstance()), true, null);
	}

	@LispMethod
	public static Term call_ctrl(Term list, Term result) throws Exception {
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
		boolean wasNoDebug = isNoDebug();
		try {
			if (!wasNoDebug) {
				setNoDebug(true);
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
				setNoDebug(false);
			}
			t.printStackTrace();
			System.err.println("" + t.getMessage());
			if (t instanceof JPLException) {
				throw (JPLException) t;
			}
			throw new JPLException(createStackTraceString(t));
		} finally {
			setNoDebug(wasNoDebug);
		}
	}

	@ConverterMethod
	public static Term object_to_term(Object o) {
		Term term = PrologSync.toProlog(o);
		// o.termRef = term;
		return term;
	}

	public static LispObject call_lisp2(Symbol found, Term[] args) throws Exception {
		LispObject[] largs = terms_to_lisp_objects(args);
		LispObject ret = found.execute(largs);
		return ret;
	}

	private static Container introduced_appdapter(NameSpace ns) throws UtilEvalError {
		if (!hasAppdapter)
			return null;
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

	public static void showObject(Object o) {
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
		if (!hasAppdapter)
			return null;
		return (Class) ensureBSH().eval("org.appdapter.gui.demo.DemoBrowser.class");
	}

	@LispMethod
	public static void ui_inspector() {
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

	public static Object invoke(Object o, String string, Object... objects) {
		try {
			Class bshReflect = Class.forName("bsh.Reflect");
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

				final Method method = bshReflect.getMethod("invokeStaticMethod", BshClassManager.class, Class.class, String.class, Object[].class);
				return method //
						.invoke(null, ensureBSH.getClassManager(), (Class) o, string, objects, null);
			} else {
				Class<SimpleNode> simpleNodeClass = (Class<SimpleNode>) Class.forName("bsh.SimpleNode");
				final Method method = bshReflect.getMethod("invokeObjectMethod", Object.class, String.class, Object[].class, bsh.Interpreter.class, CallStack.class, simpleNodeClass);
				return method //
						.invoke(null, o, string, objects, ensureBSH, null, null);
			}
		} catch (InvocationTargetException e) {
			throw new RuntimeException(e.getCause());
		} catch (ReflectiveOperationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	/**
	 * @param console
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public static JConsole connectLisp(String myName, final JConsole console0) throws InterruptedException {
		final JConsole console;
		if (console0 == null) {
			console = new JConsole();
			console.setName(myName);
		} else
			console = console0;
		if (lispInstances == 0) {
			//passedArgs = new String[] {}; // "--load", "cyc"
			Runnable r = Main.mainUnjoined(passedArgs);
			final String name = Main.class.getName();
			Thread t = new Thread(null, r, name, 1 << 30L);//.asJavaTread();

			final UncaughtExceptionHandler uncaughtExceptionHandlerOrignal = t.getUncaughtExceptionHandler();
			if (uncaughtExceptionHandlerOrignal == null)
				t.setUncaughtExceptionHandler(uncaughtExceptionHandler);
			t.start();
			//Main.runThread(t);
			return console;
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

	private static NameSpace bshMasterNamespace;

	@LispMethod
	public static Object prolog_ui() throws EvalError {
		JConsole console = (JConsole) bsh_eval("makeConsole(\"PrologUI\")");
		return console;
	}

	@LispMethod
	public static Object lisp_ui() throws EvalError {
		JConsole console = (JConsole) bsh_eval("makeConsole(\"LispUI\")");
		return console;
	}

	public static bsh.Interpreter bshInterpreter;
	final public static Method multiMethod;

	static public class LispNameCompletion implements NameCompletion {

		String[] NO_RESULTS = new String[0];

		@Override
		public java.lang.String[] completeName(java.lang.String part) {

			if (part.length() < 3)
				return NO_RESULTS;
			part = part.toUpperCase();
			ArrayList results = null;
			org.armedbear.lisp.Package currentPackage;
			int idx = part.indexOf(":");
			if (idx == 0) {
				currentPackage = Lisp.PACKAGE_KEYWORD;
				part = part.substring(1);
			} else if (idx == -1) {
				currentPackage = Lisp.getCurrentPackage();
				part = part.substring(1);
			} else {
				String pn = part.substring(0, idx);
				part = part.substring(0, idx + 1);
				currentPackage = (Package) Package.findPackageNamed(pn);
				if (currentPackage == null)
					currentPackage = Lisp.getCurrentPackage();
			}

			if (part.length() <= 1)
				return NO_RESULTS;

			for (Symbol sym : currentPackage.getAccessibleSymbols()) {
				String n = sym.getName();
				if (n.startsWith(part)) {
					if (results == null) {
						results = new ArrayList();
					}
					results.add(n);
				}
			}

			if (results != null)
				return (String[]) results.toArray(new String[results.size()]);

			return NO_RESULTS;

		}

	}

	static {
		try {
			// DemoBrowser.testLoggingSetup();
			multiMethod = IsolatedClassLoader.getDeclaredMethod(BeanShellCntrl.class, "bp");
			// BeanBowlGUI.startBeanBowl();
			// Debuggable.setIsTesting(true);
			// Debuggable.setDebugging(false);
		} catch (SecurityException e) {
			throw new RuntimeException(e);
		} catch (NoSuchMethodException e) {
			throw new RuntimeException(e);
		}
	}
}
