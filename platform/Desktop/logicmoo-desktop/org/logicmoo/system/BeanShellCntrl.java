
package org.logicmoo.system;

import static org.armedbear.lisp.Main.*;
import static org.armedbear.lisp.Lisp.PACKAGE_CL;
import static org.armedbear.lisp.Lisp.PACKAGE_CL_USER;
import static org.armedbear.lisp.Lisp.PACKAGE_CYC;
import static org.armedbear.lisp.Lisp.PACKAGE_EXT;
import static org.armedbear.lisp.Lisp.PACKAGE_JAVA;
import static org.armedbear.lisp.Lisp.PACKAGE_SUBLISP;

import java.awt.Container;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.logging.Level;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

import org.appdapter.core.convert.Converter.ConverterMethod;
import org.appdapter.gui.api.BoxPanelSwitchableView;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.demo.DemoBrowser;
import org.armedbear.j.Editor;
import org.armedbear.j.JLisp;
import org.armedbear.j.Log;
import org.armedbear.j.ReaderThread;
import org.armedbear.lisp.Cons;
import org.armedbear.lisp.ControlTransfer;
//import org.armedbear.lisp.CycEval;
import org.armedbear.lisp.Environment;
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
import org.armedbear.lisp.Nil;
import org.armedbear.lisp.Operator;
import org.armedbear.lisp.Package;
import org.armedbear.lisp.Packages;
import org.armedbear.lisp.SimpleString;
import org.armedbear.lisp.SpecialOperator;
import org.armedbear.lisp.Symbol;
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
import org.logicmoo.bb.BeansContextListener;

import com.cyc.cycjava.cycl.constant_completion_high;
import com.cyc.cycjava.cycl.constant_completion_low;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.constant_reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrologSync;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Resourcer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLListListIterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLReader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThreadPool;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructInterpreted.SubLStructInterpretedImpl;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperator;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.ui.SubLReaderPanel;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import com.netbreeze.bbowl.gui.BeanBowlGUI;
import com.sun.tools.attach.VirtualMachine;
//import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachineDescriptor;

//import com.netbreeze.bbowl.gui.BeanBowlGUI;

import bsh.EvalError;
import bsh.Interpreter;
import bsh.NameSpace;
import bsh.Primitive;
import bsh.Reflect;
import bsh.This;
import bsh.UtilEvalError;
import bsh.util.JConsole;
import eu.larkc.core.orchestrator.LarkcInit;
import eu.larkc.core.orchestrator.servers.LarKCHttpServer;
import sun.misc.Unsafe;

//import static org.slf4j.spi.LocationAwareLogger.log;
public class BeanShellCntrl
{
	static
	{
		SystemCurrent.setupIO();
	}

	public static final Object StartupLock = new Object()
	{
		@Override
		public String toString()
		{
			return "StartupLock";
		}
	};
	public static final Object StartupInitLock = new Object()
	{
		@Override
		public String toString()
		{
			return "StartupInitLock";
		}
	};

	static public BeanBowl bowl = new BeanBowl();

	static public boolean calledStartAppdatper = false;
	static public boolean calledStartDmiles = false;

	static public boolean started_from_prolog = true;
	static boolean init_swipled_server = false;

	static public Object dbrowser;
	static Container desktop;
	static Editor editor = null;

	static public boolean inited_subl;
	static public boolean inited_cyc;
	static public boolean inited_kb;
	static public boolean inited_cyc_server;
	static public boolean inited_cyc_complete;

	// final static public BeanBowlGUI gui = BeanBowlGUI.getDefaultFrame();

	static public Interpreter bshInterpreter;

	final static public Map<String, Symbol> prologMethods = new HashMap();
	final static public Method multiMethod;
	final static Map<String, CreationInfo> singletons = new HashMap<String, CreationInfo>();
	static public final LispObject[] EMPTY_LISP_OBJECT = new LispObject[0];

	static
	{
		int hc = CycEval.CYC_PROGN.hotCount;
	}

	static public void addConsole(bsh.This thiz, final JConsole console) throws UtilEvalError, EvalError, InterruptedException
	{
		Object o = thiz.getNameSpace().getVariable("interpreter", false);
		String myName = null;
		o = thiz.getNameSpace().getVariable("name", false);
		if (o instanceof String)
		{
			myName = (String) o;
			addObject(myName, thiz);
			String myNameL = myName.toLowerCase();
			if (myNameL.contains("lisp"))
			{

				if (Main.needIOConsole)
				{
					Main.needIOConsole = false;
					thiz.invokeMethodVA("captureSysIO");
				}
				connectLisp(myName, console);
				return;
			}
			else if (myNameL.contains("prolog"))
			{
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
		try
		{
			if (Main.needIOConsole)
			{
				Main.needIOConsole = false;
				thiz.invokeMethodVA("captureSysIO");
			}
		} catch (EvalError e)
		{
			MsgBox.error(e);
			throw new RuntimeException(e);
		}
		System.out.println("Hi");
	}

	static public String addObject(String named, Object value)
	{
		return addObject(named, value, false);
	}

	static public String addObject(String named, Object value, boolean showNow)
	{
		bowl.addBean(named, value);
		if (showNow) DemoBrowser.showObject(value);
		return bowl.getWrapper(value).getName();
	}

	static public void addSingleton(Object self)
	{
		if (self == null)
		{
			Errors.warn("null singleton");
			return;
		}
		Class isc = self.getClass();
		setSingleton(isc, self);
	}

	private static LispObject atom_to_lisp_object(String s)
	{
		//String s = a.name();
		SimpleString ss = new SimpleString(s);
		// TODO Auto-generated method stub
		if (inited_cyc_complete)
		{
			SubLObject found = find_constant_by_name(ss);
			if (found instanceof SubLStruct) return found.toLispObject();
		}
		boolean caseMatters = (!s.toLowerCase().equals(s));
		// boolean caseMattersU = (!s.toUpperCase().equals(s));

		LispObject o;
		if (caseMatters)
		{
			o = Lisp.readObjectFromString(s);
		}
		else
		{
			o = org.armedbear.lisp.Interpreter.readFromString(s);
		}
		return o;
	}

	@SubLTranslatedFile.SubL(source = "cycl/constant-reader.lisp", position = 3066L)
	public static SubLObject find_constant_by_name(final SubLObject name)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLNil localNil = SubLNil.NIL;
		SubLObject constant = localNil;
		final SubLObject _prev_bind_0 = constant_completion_low.$require_valid_constants$.currentBinding(thread);
		try
		{
			constant_completion_low.$require_valid_constants$.bind(localNil, thread);
			constant = constant_completion_high.constant_complete_exact(name, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		} finally
		{
			constant_completion_low.$require_valid_constants$.rebind(_prev_bind_0, thread);
		}
		if (localNil == constant)
		{
			constant = constant_handles.find_invalid_constant(name);
		}
		return constant;
	}

	@LispMethod
	static public boolean attach_jvm(String jarfile) throws IOException
	{

		try
		{
			java.util.List<VirtualMachineDescriptor> descs = VirtualMachine.list();
			if (descs.size() == 0) { return false; }
			VirtualMachineDescriptor desc = descs.get(0);
			// attach to target VM
			VirtualMachine vm = VirtualMachine.attach(desc);
			// get system properties in target VM
			Properties props = vm.getSystemProperties();

			// construct path to management agent
			String home = props.getProperty("java.home");
			String agent = "" + jarfile;
			if (!new File(agent).exists())
			{
				agent = home + File.separator + jarfile;
				if (!new File(agent).exists())
				{
					if (jarfile == null || jarfile.length() == 0)
					{
						agent = home + File.separator + "lib" + File.separator + "management-agent.jar";
					}
					if (!new File(agent).exists())
					{
						agent = jarfile;
					}
				}
			}
			// load agent into target VM
			// transport=dt_socket,suspend=y,address=10.0.0.95:5005,server=n
			// vm.loadAgent(agent, "com.sun.management.jmxremote.port=5005");
			vm.loadAgent(agent, "com.sun.management.jmxremote.port=5005,server=y");

			// detach
			// vm.detach();
			return true;

		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	static public void bp()
	{
		if (false) ;
		// BeanBowlGUI.startBeanBowl();
	}

	static JLisp jLispHeadless;

	@LispMethod
	static public int init_jlisp()
	{
		if (jLispHeadless == null)
		{
			jLispHeadless = JLisp.jlispHeadless();
		}
		return jLispHeadless.port;
	}

	@LispMethod
	static public void init_j()
	{
		try
		{
			Class c = Class.forName("org.armedbear.j.Editor");
			Method method = c.getMethod("startJ", String[].class, boolean.class, boolean.class);
			method.invoke(null, new String[] { "--no-session", "--debug", "--force-new-instance" }, false, false);
			j_desktop();
		} catch (Throwable e)
		{
			MsgBox.error(e);
		}
	}

	@LispMethod
	static public void bsh_desktop()
	{
		if (noBSHGUI) return;
		try
		{
			if (calledStartDmiles) return;
			calledStartDmiles = true;

			ensureBSH().eval("startDmiles()");

			// BeanShellCntrl.setSingleton(interpreter);
			// interpreter.setShowResults(true);
			// BeanShellCntrl.describeStreams();
			// new Thread(interpreter).start();
			// interpreter.get(name)
			Utility.invokeLater(new Runnable()
			{
				@Override
				public void run()
				{
					try
					{
						ensureBSH().eval("sdesktop()");
					} catch (EvalError e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
		} catch (Throwable e)
		{
			// TODO Auto-generated catch block
			calledStartDmiles = false;
			MsgBox.error(e);
		}
	}

	@LispMethod
	static public Object bsh_eval(Object form) throws EvalError
	{
		if (form instanceof String) return ensureBSH().eval((String) form);
		if (form instanceof File)
		{
			try
			{
				return ensureBSH().source(((File) form).getPath());
			} catch (FileNotFoundException e)
			{
				throw JVMImpl.doThrow(e);
			} catch (IOException e)
			{
				throw JVMImpl.doThrow(e);
			}
		}
		return ensureBSH().eval(String.valueOf(form));
	}

	@LispMethod
	static public Object bsh_eval(String statements) throws EvalError
	{
		return ensureBSH().eval(statements);
	}

	@LispMethod
	static public LispObject bsh_exec(LispObject arg) throws EvalError
	{
		if (arg.isString()) return JavaObject.getInstance(BeanShellCntrl.bsh_eval(arg.getStringValue()), true, null);
		return JavaObject.getInstance(BeanShellCntrl.bsh_eval((String) arg.javaInstance()), true, null);
	}

	@LispMethod
	static public Object call_ctrl(Term list, Term result)
	{
		String atom = list.name();
		int arity = list.arity();
		String prologName = "" + atom;// .name();
		if (arity > 0)
		{
		}
		String key = prologName + "/" + arity;
		Symbol found;
		synchronized (prologMethods)
		{
			found = prologMethods.get(key);
			if (found == null)
			{
				found = prologMethods.get(prologName + "/" + (1 + arity));
			}
		}
		if (found == null) throw new JPLException("No method " + key);
		boolean wasNoDebug = Main.isNoDebug();
		try
		{
			if (!wasNoDebug)
			{
				Main.setNoDebug(true);
			}
			LispObject lo = call_lisp2(found, list.args());
			if (!result.isVariable()) { return result; }
			Term t = lobject_to_term(lo);
			Variable v = (Variable) result;
			Term.putTerm(t, v.term_);
			Object o = lo.javaInstance();
			return t;
		} catch (Throwable t)
		{
			if (!wasNoDebug)
			{
				Main.setNoDebug(false);
			}
			t.printStackTrace();
			System.err.println("" + t.getMessage());
			if (t instanceof JPLException) { throw (JPLException) t; }
			throw new JPLException(createStackTraceString(t));
		} finally
		{
			Main.setNoDebug(wasNoDebug);
		}
	}

	static public LispObject call_lisp2(Symbol found, Term[] args)
	{
		LispObject[] largs = terms_to_lisp_objects(args);
		LispObject ret = found.execute(largs);
		return ret;
	}

	@LispMethod
	static public void cl_imports_cyc()
	{
		// if(true) return ;
		//SubLPackage.setCurrentPackage(Lisp.PACKAGE_CL_USER);
		Lisp.PACKAGE_SYS.ALLOW_INHERIT_CONFLICTS = true;
		PACKAGE_EXT.ALLOW_INHERIT_CONFLICTS = true;
		PACKAGE_CL.ALLOW_INHERIT_CONFLICTS = true;
		PACKAGE_CL_USER.ALLOW_INHERIT_CONFLICTS = true;
		PACKAGE_CL_USER.usePackage(PACKAGE_CYC, true);
		PACKAGE_CL_USER.unusePackage(PACKAGE_CL);
		PACKAGE_CL_USER.unusePackage(PACKAGE_EXT);
		PACKAGE_CL_USER.unusePackage(PACKAGE_JAVA);
		PACKAGE_CL_USER.usePackage(PACKAGE_SUBLISP, true);
		PACKAGE_CL_USER.usePackage(PACKAGE_EXT, true);
		PACKAGE_CL_USER.usePackage(PACKAGE_JAVA, true);
		PACKAGE_CL_USER.usePackage(PACKAGE_CL, true);
		PACKAGE_CL_USER.addNickname("USER");
		//  PACKAGE_SUBLISP.usePackage(PACKAGE_CL, true);
	}

	@LispMethod
	static public void cyc_imports_cl()
	{
		PACKAGE_CYC.unusePackage(PACKAGE_SUBLISP);
		PACKAGE_CYC.usePackage(PACKAGE_JAVA, true);
		PACKAGE_CYC.usePackage(PACKAGE_EXT, true);
		PACKAGE_CYC.usePackage(PACKAGE_CL, true);
		PACKAGE_CYC.usePackage(PACKAGE_CL_USER, true);
		PACKAGE_CYC.usePackage(PACKAGE_SUBLISP, true);
	}

	/**
	 * @param console
	 * @throws InterruptedException
	 * @throws IOException
	 */
	static public JConsole connectLisp(String myName, final JConsole console0) throws InterruptedException
	{
		final JConsole console;
		if (console0 == null)
			console = new JConsole(myName);
		else
			console = console0;

		if (Main.lispInstances == 0)
		{
			Main.passedArgs = new String[] { "--load", "cyc" };
			// Thread t = Main.mainUnjoined(new String[] { "--load", "cyc" });
			// t.start();
			// return console;
		}

		SubLThreadPool.getDefaultPool().execute(new SubLProcess(myName)
		{
			@Override
			public void safeRun()
			{
				try
				{
					org.armedbear.lisp.Interpreter interp = org.armedbear.lisp.Interpreter.createNewLispInstance(console.getInputStream(), console.getOut(), new File("./").getCanonicalPath(), Version.getVersion(), false);
					console.setNameCompletion(new LispNameCompletion());
					interp.run();
				} catch (IOException e)
				{
					MsgBox.error(e);
					throw JVMImpl.doThrow(e);
				}
			}

		});
		return console;
	}

	static public JConsole connectProlog(String name, final JConsole console0)
	{
		final JConsole console;
		if (console0 == null)
			console = new JConsole(name);
		else
			console = console0;
		try
		{
			init_swipl_server();
			Socket p = null;
			try
			{
				p = new Socket("localhost", 4023);
				if (!p.isConnected()) p.connect(p.getRemoteSocketAddress(), 2000);// endpoint,
				// 1000);
			} catch (IOException sto)
			{
				console.setName("" + sto);
				return console;
			}
			final OutputStreamWriter stdin = new OutputStreamWriter(p.getOutputStream());
			ReaderThread stdoutThread = new ReaderThread(p.getInputStream())
			{
				@Override
				public void update(String s)
				{
					console.print(s);
				}
			};
			ReaderThread stdinThread = new ReaderThread(console.getInputStream())
			{
				@Override
				public void update(String s)
				{
					try
					{
						stdin.write(s);
						stdin.flush();
					} catch (IOException e)
					{
						e.printStackTrace();
						throw JVMImpl.doThrow(e);
					}
				}
			};
			stdoutThread.start();
			stdinThread.start();

		} catch (Throwable t)
		{
			Log.error(t);
			throw throwException(t);
		}
		return console;

	}

	/**
	 * @param self
	 */
	static public String createStackTraceString(Throwable t)
	{
		final StringBuilder string = new StringBuilder();
		OutputStream outputStream = new OutputStream()
		{

			// Netbeans IDE automatically overrides this toString()
			@Override
			public String toString()
			{
				return string.toString();
			}

			@Override
			public void write(int b) throws IOException
			{
				string.append((char) b);
			}
		};
		string.append("" + t.getClass() + ": " + t);
		t.printStackTrace(new PrintStream(outputStream));
		string.append("" + t.getClass() + ": " + t);
		return string.toString();
	}

	@LispMethod
	static public SubLObject cyc_eval_string(String str)
	{
		boolean wasSubLisp = Main.isSubLisp();
		Main.setSubLisp(true);
		try
		{
			return Eval.eval(str);
		} finally
		{
			Main.setSubLisp(wasSubLisp);
		}
	}

	@LispMethod
	static public SubLObject cyc_eval(final String str)
	{
		return while_not_changing_package(new Callable<SubLObject>()
		{
			@Override
			public SubLObject call() throws Exception
			{
				return cyc_eval_string(str);
			}
		});
	}

	@LispMethod
	static public SubLObject cyc_eval(final LispObject str)
	{
		return while_not_changing_package(new Callable<SubLObject>()
		{
			@Override
			public SubLObject call() throws Exception
			{
				return cyc_eval_progn(new Cons(str), SubLEnvironment.currentEnvironment());
			}
		});
	}

	@LispMethod
	static public <T> T while_not_changing_package(Callable<T> str)
	{
		SubLPackage prevPackage = Lisp.getCurrentPackage();
		try
		{
			return str.call();
		} catch (Exception e)
		{
			throw JVMImpl.doThrow(e);
		} finally
		{
			SubLPackage.setCurrentPackage(prevPackage);
		}
	}

	@LispMethod
	static public SubLObject cyc_eval_progn(SubLCons specialForm, SubLEnvironment env)
	{
		init_subl();
		if (!SubLMain.commonSymbolsOK) throw new RuntimeException("SubLMain not yet started");
		boolean wasSubLisp = Main.isSubLisp();
		Main.setSubLisp(true);
		try
		{

			SubLListListIterator iter = null;
			Resourcer resourcer = Resourcer.getInstance();
			try
			{
				iter = resourcer.acquireSubLListListIterator(specialForm);
				return SubLSpecialOperatorDeclarations.list_progn(iter, env);
			} finally
			{
				resourcer.releaseSubLListListIterator(iter);
			}
		} finally
		{
			Main.setSubLisp(wasSubLisp);
		}
	}

	static boolean repl_in_bg = false;
	private static NameSpace bshMasterNamespace;

	@LispMethod
	static public LispObject bg_repl() throws InterruptedException
	{
		oneSolution("on_bg_repl");
		if (!repl_in_bg)
		{
			repl_in_bg = true;
			while (repl_in_bg)
			{
				Thread.sleep(200);
			}
		}
		return Lisp.EOF;
	}

	@LispMethod
	static public LispObject fg_repl()
	{
		repl_in_bg = false;
		return Lisp.EOF;
	}

	@LispMethod
	static public LispObject cyc_repl() throws InterruptedException
	{
		boolean wasSubLisp = Main.isSubLisp();
		init_subl();
		SubLReader SLR = SubLMain.getMainReader();
		if (SLR == null)
		{
			//boolean quitOnExit, InputStream is, OutputStream os
			SLR = new SubLReader();
			SubLMain.setMainReader(SLR);
		}
		boolean wasQuitOnExit = SLR.quitOnExit;
		boolean was_shouldReadloopExit = SLR.shouldReadloopExit;
		SLR.quitOnExit = false;
		SLR.shouldReadloopExit = false;
		SubLPackage prevPackage = Lisp.getCurrentPackage();
		try
		{
			try
			{
				if (false && SubLMain.shouldRunReadloopInGUI())
				{
					SubLMain.setMainReader(SubLReaderPanel.startReadloopWindow());
				}

				SLR.setThread(SubLProcess.currentSubLThread());

				while (!SLR.shouldReadloopExit())
				{
					Main.setSubLisp(true);
					SLR.doReadLoop();
				}
			} finally
			{
				SLR.quitOnExit = wasQuitOnExit;
				SLR.shouldReadloopExit = was_shouldReadloopExit;
				Main.setSubLisp(wasSubLisp);
			}
		} finally
		{

			SubLPackage.setCurrentPackage(prevPackage);
		}
		return (LispObject) SubLSpecialOperatorDeclarations.doubleStar.getValue();
	}

	static public void describeObject(String name, Object in, PrintWriter pw)
	{

		if (in == null)
		{
			pw.println("" + name + " is NULL!");
			return;
		}
		pw.print("" + name + " is: ");
		pw.println(pw.getClass() + " sihc=" + System.identityHashCode(in));
	}

	static public void describeStreams()
	{
		if (true) return;
		final StringBuilder string = new StringBuilder();
		OutputStream outputStream = new OutputStream()
		{

			// Netbeans IDE automatically overrides this toString()
			@Override
			public String toString()
			{
				return string.toString();
			}

			@Override
			public void write(int b) throws IOException
			{
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

	static public bsh.Interpreter ensureBSH()
	{
		if (bshInterpreter == null)
		{
			bshInterpreter = new bsh.Interpreter();
			bshMasterNamespace = bshInterpreter.getNameSpace();
		}
		return bshInterpreter;
	}

	static public bsh.Interpreter new_bsh_interpeter() throws EvalError
	{
		bshInterpreter = ensureBSH();
		return (Interpreter) bshInterpreter.eval("new bsh.Interpreter()");
	}

	static public bsh.NameSpace masterNamespace()
	{
		ensureBSH();
		return bshMasterNamespace;

	}

	/**
	 *
	 */
	static public SubLReader ensureMainReader()
	{
		SubLReader SLR = SubLMain.getMainReader();
		if (SLR == null)
		{
			SLR = new SubLReader();
			SubLMain.setMainReader(SLR);
		}
		return SLR;
	}

	static public void exportInCyc(Operator cyc_eval2)
	{
		exportInCyc(cyc_eval2.getLambdaName().toSymbol().toLispObject());
	}

	static public void exportInCyc(Symbol symbol)
	{
		Lisp.PACKAGE_SUBLISP.importSymbol(symbol);
		Lisp.PACKAGE_CYC.importSymbol(symbol);
		Lisp.PACKAGE_CYC.export(symbol);
		Lisp.PACKAGE_EXT.importSymbol(symbol);
		Lisp.PACKAGE_CL_USER.importSymbol(symbol);
	}

	static public Object findDesktopPane(Object thiz)
	{
		synchronized (StartupLock)
		{
			if (desktop != null) return desktop;
		}
		NameSpace ns = ((This) thiz).getNameSpace();
		Object pane;
		try
		{
			pane = ns.getVariable("pane");
			if (pane == null || pane == Primitive.VOID)
			{

				Container container = introduced_appdapter(ns);
				if (container != null) { return container; }
				pane = desktop = new JDesktopPane();
				ns.setVariable("pane", pane, false);
			}
			return pane;
		} catch (Exception e)
		{
			MsgBox.error(e);
		}

		return null;
	}

	private static Container introduced_appdapter(NameSpace ns) throws UtilEvalError
	{
		if (false && org.appdapter.gui.browse.Utility.controlApp != null)
		{

			BoxPanelSwitchableView bpo = org.appdapter.gui.browse.Utility.controlApp.getBoxPanelTabPane();
			if (bpo != null)
			{
				Container container = bpo.getContainer();
				ns.setVariable("pane", container, false);
				Container parent = container.getParent();
				while (parent.getParent() != null)
				{
					parent = parent.getParent();
				}
				ns.setVariable("frame", parent, false);
				return container;
			}
		}
		return null;
	}

	static public Method findMethod(Method[] staticMethods, Object[] javaArgs)
	{
		int argCount = javaArgs.length;
		Method result = null;
		Method macro = null;
		for (int i = staticMethods.length; i-- > 0;)
		{
			Method method = staticMethods[i];
			final Class<?>[] parameterTypes = method.getParameterTypes();
			final int parameterTypeslength = parameterTypes.length;
			if (parameterTypeslength != argCount)
			{
				if (parameterTypeslength == 2)
				{
					Class sc = parameterTypes[1];
					if (SubLEnvironment.class.isAssignableFrom(sc))
					{
						macro = method;
					}
				}
				continue;
			}
			Class<?>[] methodTypes = parameterTypes;
			if (!Java.isApplicableMethod(methodTypes, javaArgs))
			{
				continue;
			}
			if (result == null || Java.isMoreSpecialized(methodTypes, result.getParameterTypes()))
			{
				result = method;
			}
		}
		if (result == null) return macro;
		return result;
	}

	/**
	 * @param js
	 * @return
	 */
	static public Symbol findOrCreateSymbol(String js)
	{

		Package pkg = null;
		if (js.startsWith("pkg_"))
		{
			js = js.substring(3);

			int i = js.indexOf('_');
			String srch4 = js.substring(0, i);
			pkg = Packages.findPackage(srch4).toPackage().toLispObject();
			js = js.substring(i);
			/*
			 * if (js.startsWith("ext_")) { pkg = Lisp.PACKAGE_EXT; js =
			 * js.substring(4); } else if (js.startsWith("usr_")) { pkg =
			 * Lisp.PACKAGE_CL_USER; js = js.substring(4); }
			 */
		}

		js = js.replace("_", "-");
		js = js.replace("$", "*");
		js = js.replace("**", "$");

		if (js.startsWith("-") && js.endsWith("-"))
		{
			js = "+" + js.substring(1, js.length() - 2) + "+";
		}
		js = js.toUpperCase();
		if (pkg == null) pkg = Lisp.getCurrentPackage();
		Symbol sym = pkg.internAndExport(js);

		exportInCyc(sym);
		return sym;
	}

	static public BeanBowl getBowl()
	{
		return bowl;
	}

	static public <T> T getSingleton(Class<T> isc)
	{
		synchronized (singletons)
		{
			String named = Lisp.getDotName(isc);
			CreationInfo was = singletons.get(named);
			if (was == null) return null;
			return (T) was.value;
		}
	}

	static public Unsafe getUnsafe()
	{
		try
		{
			Field field = Unsafe.class.getDeclaredField("theUnsafe");
			field.setAccessible(true);
			return (Unsafe) field.get(null);
		} catch (Exception e)
		{
			throw new RuntimeException(e);
		}
	}

	@LispMethod
	static public void init_cyc()
	{
		synchronized (StartupLock)
		{
			if (inited_cyc) return;
			inited_cyc = true;
		}

		boolean wasSubLisp = Main.isSubLisp();
		Main.setSubLisp(true);
		try
		{
			SubLPackage prevPackage = Lisp.getCurrentPackage();
			try
			{
				init_subl();
				SubLMain.handleInits();
				SubLMain.initializeTranslatedSystems();
				inited_cyc = true;
				inited_cyc_complete = true;
			} catch (Throwable e)
			{
				inited_cyc_complete = false;
				throw JVMImpl.doThrow(e);
			} finally
			{

				SubLPackage.setCurrentPackage(prevPackage);
			}
		} finally
		{
			Main.setSubLisp(wasSubLisp);
		}

	}

	@LispMethod
	static public void init_cyc_server()
	{
		init_kb();
		init_server();
	}

	@LispMethod
	static public void init_kb()
	{
		synchronized (StartupLock)
		{
			if (inited_kb) return;
			inited_kb = true;
		}

		boolean wasSubLisp = Main.isSubLisp();
		Main.setSubLisp(true);
		try
		{
			SubLPackage prevPackage = Lisp.getCurrentPackage();
			try
			{
				init_cyc();
				SubLPackage.setCurrentPackage("CYC");
				Eval.evalInCurrentThread("(sl:load \"init/jrtl-release-init.lisp\")");
			} catch (Throwable e)
			{
				throw JVMImpl.doThrow(e);
			} finally
			{
				SubLPackage.setCurrentPackage(prevPackage);
			}
		} finally
		{
			Main.setSubLisp(wasSubLisp);
		}
	}

	@LispMethod
	static public void init_server()
	{
		synchronized (StartupLock)
		{
			if (inited_cyc_server) return;
		}
		boolean wasSubLisp = Main.isSubLisp();
		Main.setSubLisp(true);
		try
		{
			SubLPackage prevPackage = Lisp.getCurrentPackage();
			try
			{
				init_cyc();
				SubLPackage.setCurrentPackage("CYC");
				Eval.eval("(sl:load \"init/services-init.lisp\")");
				SubLFiles.initialize("eu.larkc.core.orchestrator.LarkcInit");
				SubLFiles.initialize("eu.larkc.core.orchestrator.servers.LarKCHttpServer");
				LarkcInit.initializeLarkc();
				LarKCHttpServer.start_sparql_server();
				inited_cyc_server = true;
			} catch (Throwable e)
			{
				throw JVMImpl.doThrow(e);
			} finally
			{
				SubLPackage.setCurrentPackage(prevPackage);
			}
		} finally
		{
			Main.setSubLisp(wasSubLisp);
		}
	}

	@LispMethod
	static public void init_subl()
	{
		synchronized (StartupLock)
		{
			if (inited_subl) return;
			inited_subl = true;
		}
		init_swipl();
		SubLMain.commonSymbolsOK = true;
		boolean b = SubLMain.isInitialized();
		if (b) { return; }
		boolean wasSubLisp = Main.isSubLisp();
		boolean wasshouldRunInBackground = SubLMain.shouldRunInBackground;
		SubLMain me = SubLMain.me;
		SubLPackage prevPackage = Lisp.getCurrentPackage();
		SubLPackage.initPackages();
		Main.setSubLisp(true);
		try
		{
			SubLMain.shouldRunInBackground = true;
			SubLMain.initializeSubL(new String[0]);
			ensureMainReader();
		} finally
		{
			SubLPackage.setCurrentPackage(prevPackage);
			Main.setSubLisp(wasSubLisp);
			SubLMain.shouldRunInBackground = wasshouldRunInBackground;
		}
		return;
	}

	static public Object invokeM(Method m, Object object, Object... methodArgs)
	{
		try
		{
			return m.invoke(object, methodArgs);
		} catch (ControlTransfer t)
		{
			throw t;

		} catch (SecurityException e)
		{
			return Lisp.error(new LispError("inaccessible method " + m));
		} catch (IllegalAccessException e)
		{
			return Lisp.error(new LispError("illegal access" + m));
		} catch (IllegalArgumentException e)
		{
			return Lisp.error(new LispError("illegal argument " + m));
		} catch (Throwable t)
		{ // no code -> no ControlTransfer
			if (t instanceof InvocationTargetException)
			{
				Throwable tt = ((InvocationTargetException) t).getTargetException();
				if (tt != null) t = tt;
			}
			if (t instanceof UnhandledCondition)
			{
				LispObject tt = ((UnhandledCondition) t).getCondition();
				if (tt != null) return Lisp.error(tt);
			}
			t.printStackTrace();
			String msg = t.getMessage();
			if (msg == null || msg.length() == 0)
			{
				msg = createStackTraceString(t);
			}
			return Lisp.error(new LispError(msg));
		}
	}

	static boolean isIKVM()
	{
		return (System.getProperty("java.vm.name").toUpperCase().contains("IKVM"));
	}

	@LispMethod
	static public LispObject j_desktop()
	{

		if (editor == null) editor = Editor.currentEditor();

		if (true && false) return org.armedbear.lisp.JavaObject.getInstance(editor);

		if (editor == null) Editor.startJ(new String[] { "--no-session", "--debug", "--force-new-instance" }, false, false);
		if (editor == null) editor = Editor.currentEditor();
		if (editor == null) Errors.unimplementedMethod("BeanShellCntrl.j_desktop");
		addSingleton(editor);
		return org.armedbear.lisp.JavaObject.getInstance(editor);
	}

	@LispMethod
	static public LispObject lisp_eval(LispObject args)
	{
		Environment env = Environment.currentLispEnvironment();
		return lisp_eval_progn(args, env);
	}

	@LispMethod
	static public LispObject lisp_eval_progn(LispObject args, Environment env)
	{
		boolean wasSubLisp = Main.isSubLisp();
		Main.setSubLisp(false);
		try
		{
			LispThread thread = LispThread.currentThread();
			if (args instanceof Cons)
			{
				LispObject arg = args.car();
				if ((arg instanceof Cons)) { return Lisp.progn(args, env, thread); }
			}
			return Lisp.eval(args, env, thread);
		} finally
		{
			Main.setSubLisp(wasSubLisp);
		}
	}

	@LispMethod
	static public LispObject lisp_eval_string(String statements)
	{
		return org.armedbear.lisp.Interpreter.evaluate(statements);
	}

	@LispMethod
	static public LispObject lisp_eval(Term term)
	{
		LispObject args = term_to_lobject(term);
		Environment env = Environment.currentLispEnvironment();
		return lisp_eval_progn(args, env);
	}

	@LispMethod
	static public LispObject lisp_repl()
	{
		boolean wasSubLisp = Main.isSubLisp();
		Main.setSubLisp(false);
		if (wasSubLisp)
		{
			cl_imports_cyc();
			cyc_imports_cl();
		}
		try
		{
			return Lisp.PACKAGE_TPL.findAccessibleSymbol("TOP-LEVEL-LOOP").execute();
		} finally
		{
			Main.setSubLisp(wasSubLisp);
		}
	}

	@LispMethod
	static public Object lisp_ui() throws EvalError
	{
		JConsole console = (JConsole) bsh_eval("makeConsole(\"LispUI\")");
		return console;
	}

	@ConverterMethod
	static public Term lobject_to_term(LispObject o)
	{
		Term term = PrologSync.toProlog(o, new ArrayList());
		o.termRef = term;
		return term;
	}

	@LispMethod
	static public Object prolog_call_all(Term arg)
	{
		return (new org.jpl7.Query("call", arg)).allSolutions();

	}

	@LispMethod
	static public Object prolog_call_n(Term arg, long n)
	{
		return (new org.jpl7.Query("call", arg)).nSolutions(n);

	}

	@LispMethod
	static public Object prolog_call_1(Term arg, long n)
	{
		return (new org.jpl7.Query("call", arg)).oneSolution();

	}

	@LispMethod
	static public LispObject prolog_eval_lobject(LispObject arg)
	{
		Term term = lobject_to_term(arg);
		return prolog_eval_term(term);
	}

	@LispMethod
	static public LispObject prolog_eval_term(Term term)
	{
		Query q = new Query(term);
		LispObject answers = Lisp.NIL;
		LispObject tailPointer = null;
		while (!q.hasNext())
		{
			q.next();
			Term next = q.goal();
			LispObject o = term_to_lobject(next);
			if (tailPointer == null)
			{
				tailPointer = answers = new Cons(o, Lisp.NIL);
			}
			else
			{
				Cons newP = new Cons(o, Lisp.NIL);
				tailPointer.setCdr(newP);
				tailPointer = newP;
			}
		}
		return answers;
	}

	@LispMethod
	static public Object prolog_query_all(String arg)
	{
		return Query.allSolutions(arg);
	}

	@LispMethod
	static public Object prolog_query(String arg)
	{
		if (noPrologJNI) throw new StartupError("noPrologJNI: " + arg);
		final Term term = org.jpl7.Util.textToTerm(arg);
		return Query.oneSolution(term);
	}

	@LispMethod
	static public boolean oneSolution(String arg)
	{
		if (noPrologJNI) throw new StartupError("noPrologJNI: " + arg);
		final Term term = org.jpl7.Util.textToTerm(arg);
		final Map<String, Term> oneSolution = Query.oneSolution(term);
		return oneSolution != null && oneSolution.size() > 0;
	}

	@LispMethod
	static public Object prolog_ui() throws EvalError
	{
		JConsole console = (JConsole) bsh_eval("makeConsole(\"PrologUI\")");
		return console;
	}

	@LispMethod
	static public LispObject read_lisp(String s)
	{
		return Lisp.readObjectFromString(s);
	}

	static public void registerMethod(Method m)
	{

		boolean evalArgsFirst = true;
		String js = m.getName();
		if (js.startsWith("sf_"))
		{
			evalArgsFirst = false;
			js = js.substring(3);
		}
		Symbol sym = findOrCreateSymbol(js);

		String prologName = symbolToPrologName(sym);

		registerPrologMethod(prologName, sym, m);

		if (evalArgsFirst)
		{
			MethodFunction cf = setMethodFunction(sym);
			//if (cf == null) return;
			cf.setEvalArgsFirst(evalArgsFirst);
			cf.addMethod(m);
			return;
		}
		SpecialMethod cf = setSpecialMethod(sym);
		//if (cf == null) return;
		cf.setEvalArgsFirst(evalArgsFirst);
		cf.addMethod(m);
	}

	static public void registerPrologMethod(String prologName, Symbol sym, Method method)
	{
		if (noPrologJNI) return;
		//if (disablePrologSync) return;
		int arity = method.getParameterTypes().length;
		int harity = arity;
		Class rt = method.getReturnType();
		if (rt == void.class || rt == Void.class)
		{
			rt = null;
		}
		else
		{
			harity++;
		}

		String key = prologName + "/" + harity;
		synchronized (prologMethods)
		{
			if (prologMethods.containsKey(key)) return;
			prologMethods.put(key, sym);

		}
		String args = "";

		for (int i = 0; i < arity; i++)
		{
			if (i > 0)
			{
				args += ",";
			}
			args += "ARG" + i;
		}
		if (rt == null)
		{
			String params = "";
			if (arity > 0)
			{
				params = "(" + args + ")";
			}
			String Head = prologName + params;
			prologAssertString(Head + ":- call_ctrl(" + Head + ")");
		}
		else
		{
			String Head;
			String Body;
			if (arity == 0)
			{
				Head = prologName + "(RT)";
				Body = prologName;
			}
			else
			{
				Head = prologName + "(" + args + ",RT)";
				Body = prologName + "(" + args + ")";
			}
			prologAssertString(Head + ":- call_ctrl(" + Body + ", RT)");
		}
	}

	private static void prologAssertString(String string)
	{
		oneSolution("assert((" + string + "))");

	}

	static public void scanForExports(Class clz)
	{
		for (java.lang.reflect.Method m : clz.getDeclaredMethods())
		{
			if (Reflect.isStatic(m))
			{
				if (m.isAnnotationPresent(LispMethod.class))
				{
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

	static MethodFunction setMethodFunction(Symbol sym)
	{
		LispObject sf = sym.getSymbolFunctionOrNull();
		if (sf == null)
		{
			sf = new MethodFunction(sym);
			sym.setFunction((SubLOperator) sf);
			sym.setBuiltInFunction(true);
			return (MethodFunction) sf;
		}
		else if (sf instanceof MethodFunction)
		{
			return (MethodFunction) sf;
		}
		else
		{
			String complaint = "Trying to overwrite a non method function "; // + sf;
			System.err.println(complaint);
			Lisp.program_error(complaint);
			return null;
		}

	}

	static public void setSingleton(Class isc, Object self)
	{
		synchronized (singletons)
		{
			if (isc == null) isc = self.getClass();
			String named = Lisp.getDotName(isc);
			CreationInfo was = singletons.get(named);
			CreationInfo wasnt = new CreationInfo(self);
			if (was != null)
			{
				if (was.value != self)
				{
					String message = "Difference from " + was + " and " + wasnt + " isntance " + self;
					MsgBox.error(message);
					if (true) throw new StartupError(message);
					named = null;
				}
				// throw new StartupError("REregistering from " + isc + "
				// isntance " + self);
			}
			singletons.put(named, wasnt);

			addObject(named, self);

		}
	}

	static SpecialMethod setSpecialMethod(Symbol sym)
	{
		LispObject sf = sym.getSymbolFunctionOrNull();
		if (sf == null)
		{
			sf = new SpecialMethod(sym);
			sym.setFunction((SubLOperator) sf);
			sym.setBuiltInFunction(true);
		}
		else if (sf instanceof SpecialMethod)
		{
			return (SpecialMethod) sf;
		}
		else
		{
			Lisp.program_error("Trying to overwrite a non special method");
		}

		return (SpecialMethod) sf;
	}

	static public void showObject(Object o)
	{
		DemoBrowser.showObject(o);

	}

	@LispMethod
	static public void start_from_prolog() throws InterruptedException
	{
		synchronized (StartupLock)
		{
			if (started_from_prolog) return;
			started_from_prolog = true;
		}
		Main.needIOConsole = true;
		start_lisp_from_prolog();
	}

	@LispMethod
	static public void start_from_prolog_ikvm() throws InterruptedException
	{
		synchronized (StartupLock)
		{
			if (started_from_prolog) return;
			started_from_prolog = true;
		}
		Main.needIOConsole = true;
		start_lisp_from_prolog();
	}

	@LispMethod
	static public void start_lisp_from_prolog()
	{
		if (!noProlog)
		{
			noPrologJNI = disablePrologSync = false;
		}
		//Main.trackStructs = !disablePrologSync;
		bsh_desktop();
		scanForExports(BeanShellCntrl.class); // again
		PrologSync.setPrologReady(!disablePrologSync);
	}

	static public void startEmbedded()
	{
		// org.armedbear.lisp.Interpreter.createInstance();

	}

	static boolean calledSwiplInt = false;

	@LispMethod
	static void init_swipl()
	{
		synchronized (StartupLock)
		{
			if (noPrologJNI) return;
			if (calledSwiplInt) return;
			calledSwiplInt = true;
		}
		synchronized (StartupInitLock)
		{
			try
			{
				started_from_prolog = !JPL.init();
				//Thread.sleep(10000);
				Object r = JPL.getDefaultInitArgs();
				if (isIKVM())
				{
					oneSolution("assert(swicli:is_ikvm)");
				}
			} catch (UnsatisfiedLinkError e)
			{
				noPrologJNI = true;
				noProlog = true;
				disablePrologSync = true;
				System.err.println("" + e);
			}

		}
	}

	@LispMethod
	static public void init_swipl_server()
	{
		synchronized (StartupLock)
		{
			if (noPrologJNI) return;
			if (init_swipled_server) return;
		}
		synchronized (StartupInitLock)
		{
			try
			{
				init_swipl();
				init_swipled_server = oneSolution("(current_thread(prolog_server,X),X=running)");
				if (init_swipled_server) return;
				oneSolution("use_module(library('prolog_server'))");
				init_swipled_server = true;
			} catch (Throwable t)
			{
				init_swipled_server = false;
				MsgBox.error(t);
			}
		}
		synchronized (StartupInitLock)
		{
			try
			{
				oneSolution("prolog_server(4023, [allow(_)])");
			} catch (Throwable t)
			{
				System.err.println("" + t);
			}
		}
	}

	private static String symbolToPrologName(Symbol sym)
	{
		Package p = (Package) sym.getPackage();
		String prologName = (p == null ? ":"
				: (p == Lisp.PACKAGE_CL_USER ? "cl_" : (p.showShortName() + "_")) // 
						+ sym.getName());
		prologName = prologName.replaceAll("-", "_").toLowerCase();

		for (String rp : new String[] { "cl_lisp_", })
		{
			if (prologName.startsWith(rp))
			{
				prologName = "cl_" + prologName.substring(rp.length());
				break;
			}
		}
		return prologName;
	}

	@LispMethod
	static public LispObject term_to_lobject(Term term)
	{
		if (term == null) return null;
		LispObject lo;
		try
		{

			Object tag = term.getTag();
			if (tag instanceof LispObject)
			{
				lo = (LispObject) tag;
				lo.termRef = term;
				return lo;
			}
		} catch (Error e)
		{
			Class termClass = term.getClass();
			ClassLoader cl = termClass.getClassLoader();
			e.printStackTrace();
		}
		if (term.isListNil()) return Lisp.NIL;
		if (term.isListPair())
		{
			Cons cons = new Cons(Lisp.NIL, Lisp.NIL);
			try
			{
				cons.termRef = term;
			} catch (Error e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cons.setCar(term_to_lobject(term.arg(1)));
			cons.setCdr(term_to_lobject(term.arg(2)));
			return cons;
		}
		Object o = term.toJavaObject();
		if (term instanceof Atom)
		{
			Atom aterm = (Atom) term;
			String atomType = aterm.atomType();
			if ("string".equals(atomType))
			{
				lo = JavaObject.getInstance(o, true);
			}
			else
			{
				lo = atom_to_lisp_object(term.name());
			}
		}
		else
		{

			if (o == null)
			{
				if (term instanceof Compound)
				{
					Compound c = (Compound) term;
					lo = atom_to_lisp_object(c.name());

					lo = LispClass.findClass(Lisp.checkSymbol(lo));
				
		
				}

			}

			if (o instanceof LispObject)
			{
				lo = (LispObject) o;
			}
			else
			{
				lo = JavaObject.getInstance(o, true);
			}
		}

		lo.termRef = term;
		return lo;
	}

	static public LispObject[] terms_to_lisp_objects(Term[] args)
	{
		if (args.length == 0) return EMPTY_LISP_OBJECT;
		LispObject[] largs = new LispObject[args.length];
		for (int i = 0; i < args.length; i++)
		{
			largs[i] = term_to_lobject(args[i]);
		}
		return largs;
	}

	@LispMethod
	static public Object test_int(int obj)
	{
		return obj;
	}

	@LispMethod
	static public Object test_object(Object obj)
	{
		return obj;
	}

	@LispMethod
	static public Object test_string(String obj)
	{
		return obj;
	}

	@LispMethod
	static public Object test_term(Term obj)
	{
		return obj;
	}

	@LispMethod
	static public Object test_term_t(term_t obj)
	{
		return obj;
	}

	static public Error throwException(Throwable exception)
	{
		if (true) getUnsafe().throwException(exception);
		return BeanShellCntrl.<RuntimeException>throwException1(exception, null);
	}

	@SuppressWarnings("unchecked")
	static public <T extends Throwable> Error throwException1(final Throwable exception, Object dummy) throws T
	{
		throw (T) exception;
	}

	static public Object to_lisp_object(Compound thiz, String value, Term[] args)
	{

		if (value.equals("[]")) { return BeanShellCntrl.terms_to_lisp_objects(args); }
		return thiz;
	}

	static public LispObject[] toArray(LispObject args)
	{
		if (args == SubLNil.NIL) return EMPTY_LISP_OBJECT;
		if (!(args instanceof Cons)) return new LispObject[] { args };
		return args.copyToArray();
	}

	@LispMethod
	static public LispObject ui_inspect(LispObject arg)
	{
		BeanShellCntrl.addObject(null, arg);
		return arg;
	}

	@LispMethod
	static public void ui_inspector()
	{
		try
		{
			if (calledStartAppdatper)
			{
				DemoBrowser.show();
				return;
			}
			calledStartAppdatper = true;
			if (true)
			{
				BeanBowlGUI.startBeanBowl(bowl);
			}

			// TODO

			try
			{
				DemoBrowser.testLoggingSetup();
				DemoBrowser.setLoggerTo(Level.ALL);
			} catch (Throwable e1)
			{
				// e1.printStackTrace();
				// TODO Auto-generated catch block
				// MsgBox.error(e1);

			}

			DemoBrowser.defaultExampleCode = true;
			DemoBrowser.ensureRunning(true, new String[0]);
			DemoBrowser.show();
			JFrame appFrame = Utility.getAppFrame();
			appFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			// some more test code
			DemoBrowser.addMoreExamples();

			dbrowser = DemoBrowser.mainControl;
			// TODO
			bowl.addListener((BeansContextListener) dbrowser);

		} catch (Throwable e)
		{
			e.printStackTrace();
			// TODO Auto-generated catch block
			// MsgBox.error(e);

		}

	}

	static
	{
		try
		{
			// DemoBrowser.testLoggingSetup();
			multiMethod = BeanShellCntrl.class.getDeclaredMethod("bp");
			// BeanBowlGUI.startBeanBowl();
			// Debuggable.setIsTesting(true);
			// Debuggable.setDebugging(false);
		} catch (SecurityException e)
		{
			throw new RuntimeException(e);
		} catch (NoSuchMethodException e)
		{
			throw new RuntimeException(e);
		}
	}

	static public void staticInit()
	{
		init_swipl();
		scanForExports(BeanShellCntrl.class);
		if (!started_from_prolog || true)
		{
			init_swipl_server();

		}

	}

	static
	{
		synchronized (StartupInitLock)
		{
			staticInit();
		}
	}

	public static void main(String[] args) throws InterruptedException
	{

		String[] argsNew = Main.extractOptions(args);
		init_swipl();
		init_swipl_server();
		start_lisp_from_prolog();
		Runnable runnable = Main.mainRunnable(argsNew, null);
		runnable.run();
	}

	static class CreationInfo
	{

		String made;

		Object value;

		public CreationInfo(Object self)
		{
			value = self;
			made = createStackTraceString(new Throwable("Made " + self.getClass()));
		}

		public Object resolve()
		{
			return value;
		}

		@Override
		public String toString()
		{
			return made.toString();
		}
	}

	/**
	 * @author Administrator
	 *
	 */
	@Retention(RetentionPolicy.RUNTIME)
	static public @interface LispMethod
	{

	}

	@Retention(RetentionPolicy.RUNTIME)
	static public @interface LispSlot
	{

	}

	static public class MethodFunction extends SpecialOperator
	{

		boolean evalArgs;

		Method[] methodByArity;

		int methodCount;

		Set<Method> staticMethods;

		MethodFunction(SubLSymbol sym)
		{
			super((Symbol) sym, "&rest any");

		}

		synchronized public void addMethod(Method m)
		{
			methodCount++;
			Class[] pt = m.getParameterTypes();
			int paramLen = pt.length;
			if (paramLen == 2 && pt[1] == Environment.class)
			{
				evalArgs = false;
			}
			if (methodByArity == null)
			{
				methodByArity = new Method[10];
				methodByArity[paramLen] = m;
				methodCount++;
				return;
			}
			Method was = methodByArity[paramLen];
			if (was == m) return;
			if (was == null)
			{
				methodByArity[paramLen] = m;
				methodCount++;
				return;
			}
			if (staticMethods == null) staticMethods = new HashSet<Method>();
			if (was == multiMethod)
			{
				staticMethods.add(m);
				methodCount++;
				return;
			}
			methodByArity[paramLen] = multiMethod;
			methodCount++;

			staticMethods.add(m);
			staticMethods.add(was);

		}

		@Override
		public LispObject arrayify(LispObject... args)
		{
			return executeEVA(null, args);
		}

		@Override
		public LispObject execute(LispObject args, Environment env)
		{
			if (methodByArity != null)
			{
				Method m = methodByArity[2];
				if (m != null)
				{
					Class[] parameterTypes = m.getParameterTypes();
					Class class1 = parameterTypes[1];
					if (class1 == Environment.class || class1 == SubLEnvironment.class)
					{
						final Object result = invokeM(m, null, args, env);
						return JavaObject.getInstance(result, true, m.getReturnType());
					}
				}
			}
			if (args == NIL) { return executeEVA(env, EMPTY_LISP_OBJECT); }
			return executeEVA(env, args.copyToArray());
		}

		// Special operator
		public LispObject executeOP(LispObject form, Environment env)
		{
			if (isSubLispFunction())
			{
				SubLObject toEval = super.apply((SubLCons) form, env);
				return (LispObject) toEval;//(LispObject) toEval.eval(env);
			}
			return Lisp.eval(form, env);
		}

		@Override
		public LispObject execute(LispObject[] args)
		{
			return executeEVA(Environment.currentLispEnvironment(), args);
		}

		private LispObject executeEML(Environment env, int paramLen, boolean tryPTLArityFirst, LispObject[] args)
		{
			if (staticMethods == null) return error(new LispError("no methods")); // return error(new
			// WrongNumberOfArgumentsException(this,
			// args.length));
			Method m = null;
			Method[] methodsArray;
			if (staticMethods.size() > 0)
			{
				methodsArray = staticMethods.toArray(new Method[staticMethods.size()]);
				m = findMethod(methodsArray, args);
				if (m == null)
				{
					m = findMethod(methodsArray, args);
				}
			}
			if (m == null) error(new LispError("no such method"));

			return invokeArgs(m, env, args);
		}

		public LispObject executeEVA(Environment env, LispObject[] args)
		{
			int paramLen = args.length;

			if (methodByArity == null) executeEML(env, paramLen, true, args);
			Method m = methodByArity[paramLen];
			if (m == multiMethod) { return executeEML(env, paramLen, true, args); }
			if (m == null) { return executeEML(env, paramLen, false, args); }
			return invokeArgs(m, env, args);
		}

		private LispObject invokeArgs(Method m, Environment env, LispObject[] args)
		{
			Class[] argTypes = m.getParameterTypes();
			int argTypesLen = argTypes.length;
			int usedLen = args.length;
			if (argTypesLen == 2 && SubLEnvironment.class.isAssignableFrom(argTypes[1]))
			{
				LispObject invokeWith;
				assert env != null;
				if (usedLen == 1)
				{
					invokeWith = new Cons(args[0]);
				}
				else
				{
					invokeWith = Lisp.list(args);
				}
				return (LispObject) invokeM(m, null, invokeWith, env);
			}
			Object[] methodArgs = new Object[argTypesLen];
			for (int i = 0; i < usedLen; i++)
			{
				LispObject arg = args[i];

				if (evalArgs)
				{
					LispObject sarg = Lisp.eval(arg, env);
					arg = sarg;
				}

				if (false && arg.equals(NIL))
				{
					methodArgs[i] = false;
				}
				else if (false && arg.equals(T))
				{
					methodArgs[i] = true;
				}
				else
				{
					Class type = argTypes[i];
					if (type == LispObject.class)
					{
						methodArgs[i] = arg;
					}
					else
					{
						methodArgs[i] = arg.javaInstance(type);
					}
				}
			}
			m.setAccessible(true);
			Object result = invokeM(m, null, methodArgs);
			if (LispObject.class.isAssignableFrom(m.getReturnType())) return (LispObject) result;
			if (result instanceof Boolean) return (LispObject) SubLObjectFactory.makeBoolean((Boolean) result);
			return JavaObject.getInstance(result, true, m.getReturnType());
		}

		@Override
		public SubLObject apply(SubLCons p0, SubLEnvironment p1)
		{
			return getBinaryFunction().processItem(p0, p1);
			//return Lisp.eval(cons, env);
			//Errors.unimplementedMethod("Auto-generated method stub:  SubLFunction.apply");
			//return null;
		}

		@Override
		public LispObject funcallCL(LispObject... args)
		{
			return this.execute(args);
		}

		@Override
		public boolean isFunction()
		{
			return true;
		}

		@Override
		public SubLObject evalViaApply(SubLCons form, SubLEnvironment env)
		{
			if (isSubLispFunction()) { return super.evalViaApply(form, env); }
			return Lisp.eval((Cons) form, (Environment) env);
		}

		@Override
		public boolean isInterpreted()
		{
			return true;
		}

		@Override
		public boolean isSpecial()
		{
			if (evalArgs)
			{
				bp();
			}
			return !evalArgs;
		}

		public void setEvalArgsFirst(boolean evalArgsFirst)
		{
			evalArgs = evalArgsFirst;
		}

	}

	static public class MsgBox
	{

		static public final String NEW_LINE = System.getProperty("line.separator");

		static void error(String message)
		{
			error(message, theNameOfTheMethodThatCalledMe());
		}

		static public void error(String message, String caller)
		{
			try
			{
				show(message, caller, JOptionPane.ERROR_MESSAGE);
			} catch (Throwable unk)
			{
				// unk.printStackTrace();
			}
			// nb: we don't respond to the "your content was splattered"
			// event, so it's OK to pass a null owner.
		}

		static public void error(Throwable e)
		{
			e.printStackTrace();

			error(createStackTraceString(e));
		}

		static public void info(String message)
		{
			info(message, theNameOfTheMethodThatCalledMe());
		}

		static public void info(String message, String caller)
		{
			show(message, caller, JOptionPane.INFORMATION_MESSAGE);
		}

		static public void setClipboard(String message)
		{
			try
			{
				final Toolkit AWT_TOOLKIT = Toolkit.getDefaultToolkit();
				final Clipboard CLIPBOARD = AWT_TOOLKIT.getSystemClipboard();
				CLIPBOARD.setContents(new StringSelection(message), null);

			} catch (Throwable unk)
			{
				// unk.printStackTrace();
			}
			// nb: we don't respond to the "your content was splattered"
			// event, so it's OK to pass a null owner.
		}

		static public void show(String message, String title, int iconId)
		{
			setClipboard(title + ":" + NEW_LINE + message);
			JOptionPane.showMessageDialog(null, message, title, iconId);
		}

		static public String theNameOfTheMethodThatCalledMe()
		{
			StackTraceElement[] ste = Thread.currentThread().getStackTrace();
			return ste[3].getMethodName();
		}

	}

	static public class PrimitiveEverywhere extends org.armedbear.lisp.Primitive
	{

		public PrimitiveEverywhere(String string)
		{
			super(string, Lisp.PACKAGE_CYC, true);
			exportInCyc(this);
		}

	}

	static public class SpecialMethod extends SpecialOperator
	{

		boolean evalArgs;

		Method[] methodByArity;

		int methodCount;

		Set<Method> staticMethods;

		SpecialMethod(SubLSymbol sym)
		{
			super((Symbol) sym, "&rest any");

		}

		synchronized public void addMethod(Method m)
		{
			methodCount++;
			Class[] pt = m.getParameterTypes();
			int paramLen = pt.length;
			if (paramLen == 2 && pt[1] == Environment.class)
			{
				evalArgs = false;
			}
			if (methodByArity == null)
			{
				methodByArity = new Method[10];
				methodByArity[paramLen] = m;
				methodCount++;
				return;
			}
			Method was = methodByArity[paramLen];
			if (was == m) return;
			if (was == null)
			{
				methodByArity[paramLen] = m;
				methodCount++;
				return;
			}
			if (staticMethods == null) staticMethods = new HashSet<Method>();
			if (was == multiMethod)
			{
				staticMethods.add(m);
				methodCount++;
				return;
			}
			methodByArity[paramLen] = multiMethod;
			methodCount++;

			staticMethods.add(m);
			staticMethods.add(was);

		}

		@Override
		public LispObject arrayify(LispObject... args)
		{
			return executeEVA(null, args);
		}

		@Override
		public LispObject execute(LispObject args, Environment env)
		{
			if (methodByArity != null)
			{
				Method m = methodByArity[2];
				if (m != null)
				{
					Class[] parameterTypes = m.getParameterTypes();
					Class class1 = parameterTypes[1];
					if (class1 == Environment.class || class1 == SubLEnvironment.class)
					{
						final Object result = invokeM(m, null, args, env);
						return JavaObject.getInstance(result, true, m.getReturnType());
					}
				}
			}
			if (args == NIL) { return executeEVA(env, EMPTY_LISP_OBJECT); }
			return executeEVA(env, args.copyToArray());
		}

		@Override
		public LispObject execute(LispObject[] args)
		{
			return executeEVA(null, args);
		}

		private LispObject executeEML(Environment env, int paramLen, boolean tryPTLArityFirst, LispObject[] args)
		{
			if (staticMethods == null) return error(new LispError("no methods")); // return error(new
			// WrongNumberOfArgumentsException(this,
			// args.length));
			Method m = null;
			if (staticMethods.size() > 0)
			{
				Method[] methodsArray = staticMethods.toArray(new Method[staticMethods.size()]);
				m = findMethod(methodsArray, args);
			}
			if (m == null) error(new LispError("no such method"));

			return invokeArgs(m, env, args);
		}

		public LispObject executeEVA(Environment env, LispObject[] args)
		{
			int paramLen = args.length;

			if (methodByArity == null) executeEML(env, paramLen, true, args);
			Method m = methodByArity[paramLen];
			if (m == multiMethod) { return executeEML(env, paramLen, true, args); }
			if (m == null) { return executeEML(env, paramLen, false, args); }
			return invokeArgs(m, env, args);
		}

		private LispObject invokeArgs(Method m, Environment env, LispObject[] args)
		{
			Class[] argTypes = m.getParameterTypes();
			int argTypesLen = argTypes.length;
			int usedLen = args.length;
			if (argTypesLen == 2 && argTypes[1] == Environment.class && usedLen == 1)
			{
				assert env != null;
				return (LispObject) invokeM(m, null, args[0], env);
			}
			if (argTypesLen == 2 && argTypes[1] == SubLEnvironment.class && usedLen == 1)
			{
				assert env != null;
				return (LispObject) invokeM(m, null, args[0], env);
			}
			Object[] methodArgs = new Object[argTypesLen];
			for (int i = 0; i < usedLen; i++)
			{
				LispObject arg = args[i];

				if (evalArgs)
				{
					LispObject sarg = Lisp.eval(arg, env);
					arg = sarg;
				}

				if (false && arg.equals(NIL))
				{
					methodArgs[i] = false;
				}
				else if (false && arg.equals(T))
				{
					methodArgs[i] = true;
				}
				else
				{
					methodArgs[i] = arg.javaInstance(argTypes[i]);
				}
			}
			m.setAccessible(true);
			Object result = invokeM(m, null, methodArgs);
			if (LispObject.class.isAssignableFrom(m.getReturnType())) return (LispObject) result;
			if (result instanceof Boolean) return (LispObject) SubLObjectFactory.makeBoolean((Boolean) result);
			return JavaObject.getInstance(result, true, m.getReturnType());
		}

		@Override
		public boolean isFunction()
		{
			return super.isFunction();// evalArgs;
		}

		@Override
		public boolean isSpecial()
		{
			if (evalArgs)
			{
				bp();
			}
			return super.isSpecial();// !evalArgs;
		}

		@Override
		public boolean isSpecialRestOnly()
		{
			return super.isSpecialRestOnly();
		}

		public void setEvalArgsFirst(boolean evalArgsFirst)
		{
			evalArgs = evalArgsFirst;
		}

	}

	static public class StartupError extends Error
	{

		public StartupError(String string)
		{
			super(string);

		}

	}

}
