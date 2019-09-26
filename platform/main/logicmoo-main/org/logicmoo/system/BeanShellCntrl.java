
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
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

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
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.util.SafeRunnable;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;

import bsh.BshClassManager;
import bsh.CallStack;
import bsh.ConsoleInterface;
import bsh.EvalError;
import bsh.Interpreter.Console;
import bsh.NameSpace;
import bsh.Primitive;
import bsh.SimpleNode;
import bsh.This;
import bsh.UtilEvalError;
import bsh.util.JConsole;
import bsh.util.NameCompletion;
import net.wimpi.telnetd.net.Connection;

//import org.appdapter.gui.browse.Utility;
//import static org.slf4j.spi.LocationAwareLogger.log;
public class BeanShellCntrl extends Startup {
	//	final private static ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
	//	final private static ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");

	private static boolean hasAppdapter;

	public static void main(String[] args0) throws Throwable {
		try {

			String[] args1 = extractOptions(BeanShellCntrl.class, args0);
			//main0(args1);
			Thread.currentThread().wait();
		} catch (Throwable e) {
			uncaughtException(e);
			throw e;
			// TODO: handle exception
		}
		return;
	}

	static {
		SystemCurrent.setupIO();
	}

	public static void addConsole(bsh.This thiz, final JConsole console) throws UtilEvalError, EvalError, InterruptedException, IOException {
		final NameSpace nameSpace = thiz.getNameSpace();
		String myName = null;
		Object o = nameSpace.getVariable("name", false);
		if (o instanceof String) {
			myName = (String) o;
			addObject(myName, thiz);
			String myNameL = myName.toLowerCase();
			console.setName(myName);
			if (myNameL.startsWith("system io")) {
				// SystemCurrent.takeOwnerShip();
				//				final PrintStream out0 = console.getOut();
				//				//	SystemCurrent.originalSystemOut = out0;
				//				SystemCurrent.cantSetOut = true;
				//				//	SystemCurrent.originalSystemIn = console.getInputStream();
				//				SystemCurrent.addErrorTee(console.getErr());
				SystemCurrent.registerAsInteractive(myName, console.getInputStream(), console.getOut(), console.getErr());
				maybeCapture(thiz);
			} else if (myNameL.startsWith("bsh workspace")) {
				standardConsoleImports(nameSpace);
				o = nameSpace.getVariable("interpreter", false);
				if (o instanceof bsh.Interpreter) {
					final NameSpace nameSpace2 = ((bsh.Interpreter) o).getNameSpace();
					if (nameSpace2 != nameSpace) {
						standardConsoleImports(nameSpace2);
					}
				}

				//				SystemCurrent.attachConsole(false);
				//				SystemCurrent.takeOwnerShip();
				//				final PrintStream out0 = console.getOut();
				//				SystemCurrent.originalSystemOut = out0;
				//				SystemCurrent.cantSetOut = true;
				//				SystemCurrent.originalSystemIn = console.getInputStream();
				//				SystemCurrent.originalSystemErr = console.getErr();
				//				maybeCapture(thiz);
				SystemCurrent.registerAsInteractive(myName, console.getInputStream(), console.getOut(), console.getErr());
				maybeCapture(thiz);
			} else if (myNameL.contains("prolog")) {
				/// console.setNameCompletion(new LispNameCompletion());
				connectProlog(myName, console);
				return;

			} else if (myNameL.contains("lisp")) {
				//maybeCapture(thiz);
				connectLisp(myName, console);
				return;
			} else {

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
				// needIOConsole = false;
				//	thiz.invokeMethod("captureSysIO", new Object[0]);
			}
		} catch (Throwable e) {
			MsgBox.error(e);
			throw new RuntimeException(e);
		}
		System.out.println("Hi System.out");
		System.err.println("Hi System.err");
		SystemCurrent.printErr("Hi printErr");
		SystemCurrent.printErr("\n");
		SystemCurrent.err.println("Hi SystemCurrent.err");
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
					console.println(s);
				}
			};
			ReaderThread stdinThread = new ReaderThread(console.getInputStream()) {
				@Override
				public void update(String s) {
					try {
						stdin.write(s);
						stdin.flush();
					} catch (IOException e) {
						uncaughtException(e);
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
			uncaughtException(e);
		}
		return false;
	}

	@LispMethod
	public static synchronized void bsh_desktop() {
		if (began_bsh_desktop)
			return;
		began_bsh_desktop = true;
		PrintStream out = getNoticeStream();
		bsh.Interpreter ensureBSH = ensureBSH();
		try {
			if (ensureBSH == null) {
				out.println("bsh_desktop: null" + desktopStatement);
				began_bsh_desktop = false;
				return;
			}
			//ensureBSH.eval("startDmiles()");
			// BeanShellCntrl.setSingleton(interpreter);
			ensureBSH.setShowResults(true);
			if (noGUI) {
				out.println("bsh_desktop: noGUI " + desktopStatement);
				began_bsh_desktop = false;
				return;
			}
			out.println("Queued:" + desktopStatement);

			Thread t = new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						out.println("Begin:" + desktopStatement);
						SwingUtilities.invokeLater(new Runnable() {
							public void run() {
								try {
									ensureBSH.eval(desktopStatement);
									out.println("Started: " + desktopStatement);
								} catch (Throwable e) {
									began_bsh_desktop = false;
									uncaughtException(e);
									out.println("Error:" + desktopStatement + e);
								}
							}
						});
					} catch (Throwable e) {
						began_bsh_desktop = false;
						uncaughtException(e);
					}
				}
			});
			t.start();
			//t.join();
		} catch (Throwable e) {
			began_bsh_desktop = false;
			uncaughtException(e);
		}
		return;
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
		} catch (Throwable e) {
			uncaughtException(e);
		}
		return true;
	}

	public static Object findDesktopPane(Object thiz) {
		synchronized (StartupLock) {
			if (desktop_pain_object_instance != null)
				return desktop_pain_object_instance;
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
				pane = desktop_pain_object_instance = new JDesktopPane();
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

					bshInterpreter = new bsh.Interpreter(new Console(threadLocalConsole), false, null, null, "bshInterpreter");
					bshMasterNamespace = bshInterpreter.getNameSpace();
					standardConsoleImports(bshMasterNamespace);
					bshInterpreter.set("conns", shells);
					SystemCurrent.recheckStdIO();
				} catch (Throwable e) {
					Debug.printStackTrace(e);
				}
			}
			return bshInterpreter;
		}
	}

	private static void standardConsoleImports(NameSpace nameSpace) {

		nameSpace.loadDefaultImports();
		nameSpace.importStatic(Symbol.class);
		nameSpace.importPackage(BeanShellCntrl.class.getPackage().getName());
		nameSpace.importStatic(SubLObjectFactory.class);
		nameSpace.importStatic(BeanShellCntrl.class);
		nameSpace.importStatic(Startup.class);
	}

	public static bsh.Interpreter new_bsh_interpeter() throws EvalError {
		bshInterpreter = ensureBSH();
		final bsh.Interpreter interp = (bsh.Interpreter) bshInterpreter.eval("new bsh.Interpreter()");
		standardConsoleImports(interp.getNameSpace());
		return (bsh.Interpreter) interp;
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
		if (op instanceof JMultiMethod) {
			JMultiMethod mf = (JMultiMethod) op;
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
			printStackTrace(t);
			System.err.println("" + t.getMessage());
			if (t instanceof JPLException) {
				throw (JPLException) t;
			}
			throw new JPLException(createStackTraceString(t));
		} finally {
			setNoDebug(wasNoDebug);
		}
	}

	//@org.appdapter.core.convert.Converter.ConverterMethod
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
			uncaughtException(e);;
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
			if (began_ui_inspector) {
				invokeDemoBrowser("show()");
				return;
			}
			began_ui_inspector = true;
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
			ui_inspector_object_instance = invokeDemoBrowser("mainControl");
			// TODO
			bowl.addListener((BeansContextListener) ui_inspector_object_instance);
		} catch (Throwable e) {
			uncaughtException(e);
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
		try {
			return ensureBSH().eval(string);
		} catch (EvalError e) {
			uncaughtException(e);
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
					printStackTrace(e);
					throw new RuntimeException(e);
				}
			}
			if (o instanceof Class) {

				final Method method = bshReflect.getMethod("invokeStaticMethod", BshClassManager.class, Class.class, String.class, Object[].class);
				return method //
						.invoke(null, ensureBSH.getClassManager(), (Class) o, string, objects, (Object) null);
			} else {
				Class<SimpleNode> simpleNodeClass = (Class<SimpleNode>) Class.forName("bsh.SimpleNode");
				final Method method = bshReflect.getMethod("invokeObjectMethod", Object.class, String.class, Object[].class, bsh.Interpreter.class, CallStack.class, simpleNodeClass);
				return method //
						.invoke(null, o, (Object) string, (Object) objects, (Object) ensureBSH, (Object) null, (Object) null);
			}
		} catch (InvocationTargetException e) {
			throw new RuntimeException(e.getCause());
		} catch (ReflectiveOperationException e) {
			// TODO Auto-generated catch block
			printStackTrace(e);
			throw new RuntimeException(e);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			printStackTrace(e);
			throw new RuntimeException(e);
		}
	}

	/**
	 * @param console
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public static JConsole connectLisp(String myName, final JConsole console0) throws InterruptedException, IOException {
		final JConsole console;
		if (console0 == null) {
			console = new JConsole();
			console.setName(myName);
		} else
			console = console0;
		console.setNameCompletion(new LispNameCompletion());
		String canonicalPath = "/.";
		try {
			canonicalPath = new File(canonicalPath).getCanonicalPath();
		} catch (IOException e) {
			canonicalPath = new File(canonicalPath).getAbsolutePath();
		}
		final boolean firstInstance = (lispInstances.get() == 0);
		final String fcanonicalPath = canonicalPath;
		//passedArgs = new String[] {}; // "--load", "cyc"
		//final String[] args = passedArgs;
		SafeRunnable r = new SafeRunnable() {

			@Override
			public void safeRun() {
				final InputStream inputStream = console.getInputStream();
				org.armedbear.lisp.Interpreter interp = org.armedbear.lisp.Interpreter. //
				createNewLispInstance(inputStream, console.getOut(), //
						fcanonicalPath, Version.getVersion(), jlisp_requested, passedArgs, firstInstance);

				if (firstInstance || noticeStream == null) {
					noticeStream = console.getErr();
					//					interp.addPreInit(0, () -> {
					//						noticeStream = console.getErr();
					//					});
				}
				interp.run();
			}
		};

		if (firstInstance) {
			final String name = "main for " + myName;

			// Run the interpreter in a secondary thread so we can control the stack size.
			Thread t = new Thread(null, () -> {
				try {
					r.run();
				} catch (Throwable e) {
					MsgBox.error(e);
					throw doThrow(e);
				}
			}, name, 1 << 30L);//.asJavaTread();
			t.start();

			//Main.runThread(t);
		} else {
			SubLThreadPool.getDefaultPool().execute(new SubLProcess(myName) {
				@Override
				public void safeRun() {
					try {
						r.run();
					} catch (Throwable e) {
						MsgBox.error(e);
						throw doThrow(e);
					}
				}
			});
		}
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
	public static ThreadLocalConsole threadLocalConsole = new ThreadLocalConsole();
	public static HashMap<String, Object> shells = new HashMap<String, Object>();

	private static final class ThreadLocalConsole implements ConsoleInterface {
		@Override
		public void println(Object o) {
			getOut().println(o);
		}

		@Override
		public void print(Object o) {
			getOut().print(o);
		}

		@Override
		public PrintStream getOut() {
			return SystemCurrent.out;
		}

		@Override
		public Reader getIn() {
			return new InputStreamReader(SystemCurrent.in);
		}

		@Override
		public PrintStream getErr() {
			return SystemCurrent.err;
		}

		@Override
		public void error(Object o) {
			getErr().println(o);
		}
	}
}
