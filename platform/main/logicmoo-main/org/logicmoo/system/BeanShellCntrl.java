
package org.logicmoo.system;

import static org.armedbear.lisp.Main.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.List;
import java.util.Properties;

import javax.swing.SwingUtilities;

import org.appdapter.core.convert.Converter.ConverterMethod;
import org.armedbear.j.JLisp;
import org.armedbear.j.Log;
import org.armedbear.j.ReaderThread;
import org.armedbear.lisp.JavaObject;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.Main;
import org.armedbear.lisp.Pathname;
import org.armedbear.lisp.Symbol;
import org.jpl7.JPLException;
import org.jpl7.Term;
import org.jpl7.Variable;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrologSync;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;

import bsh.EvalError;
import bsh.UtilEvalError;
import bsh.util.JConsole;

//import static org.slf4j.spi.LocationAwareLogger.log;
public class BeanShellCntrl extends Startup {

	public static void addConsole(bsh.This thiz, final JConsole console) throws UtilEvalError, EvalError, InterruptedException {
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

	public static JConsole connectProlog(String name, final JConsole console0) {
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

	@LispMethod
	public static boolean attach_jvm(String jarfile) throws IOException {
		/// import com.sun.tools.attach.VirtualMachine;
		//import com.sun.tools.attach.AttachNotSupportedException;
		//  import com.sun.tools.attach.VirtualMachineDescriptor;

		try {
			final Class vmc = Class.forName("com.sun.tools.attach.VirtualMachine");
			java.util.List descs = (List) BeanShellCntrl.invoke(vmc, "list");
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

	public static void bp() {
		if (false)
			;
		// BeanBowlGUI.startBeanBowl();
	}

	static JLisp jLispHeadless;

	@LispMethod
	public static int init_jlisp() {
		if (jLispHeadless == null) {
			jLispHeadless = JLisp.jlispHeadless();
		}
		return jLispHeadless.port;
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
	public static void bsh_desktop() {
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
	public static LispObject bsh_exec(LispObject arg) throws EvalError {
		if (arg.isString())
			return JavaObject.getInstance(BeanShellCntrl.bsh_eval(arg.getStringValue()), true, null);
		return JavaObject.getInstance(BeanShellCntrl.bsh_eval((String) arg.javaInstance()), true, null);
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

}
