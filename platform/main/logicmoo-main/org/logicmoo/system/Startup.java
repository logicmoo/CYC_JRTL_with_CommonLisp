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
import static org.logicmoo.system.BeanShellCntrl.multiMethod;
import static org.logicmoo.system.BeanShellCntrl.showObject;

import java.awt.Container;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.Thread.UncaughtExceptionHandler;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.JOptionPane;

import org.appdapter.core.convert.Converter.ConverterMethod;
import org.armedbear.j.Editor;
import org.armedbear.j.JLisp;
import org.armedbear.lisp.ConditionThrowable;
import org.armedbear.lisp.Cons;
import org.armedbear.lisp.ControlTransfer;
import org.armedbear.lisp.Debug;
import org.armedbear.lisp.Environment;
import org.armedbear.lisp.Function;
import org.armedbear.lisp.Interpreter;
import org.armedbear.lisp.Interpreter.UnhandledCondition;
import org.armedbear.lisp.Java;
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
import org.jpl7.PrologException;
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
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import bsh.EvalError;
import eu.larkc.core.orchestrator.servers.LarKCHttpServer;
import sun.misc.Unsafe;

/**
 * TODO Describe this type briefly. 
 * If necessary include a longer description and/or an example.
 * 
 * @author Administrator
 *
 */
public class Startup {

	public static final class ABCLMainUncaughtExceptionHandler implements UncaughtExceptionHandler {
		@Override
		public void uncaughtException(Thread arg0, Throwable e) {
			addUncaught(e);
		}
	}

	public static final UncaughtExceptionHandler uncaughtExceptionHandler = new ABCLMainUncaughtExceptionHandler();

	public static List<Throwable> unexpectedThrowable = new ArrayList<Throwable>(0);

	public static void addUncaught(Throwable e) {
		unexpectedThrowable.add(e);
	}

	public static int exitCode = 0;

	// There should only be one globalInterpreter.
	public static Interpreter globalInterpreter;

	public static boolean jlisp;
	public static boolean noinit = true;
	public static boolean nosystem = true;
	public static boolean noinform = false;
	public static boolean postProcess = true;
	public static boolean help = false;

	public static Class firstMain = null;

	// A java main is starting this.. not a junittest
	public static boolean MainThreaded = false;
	public static boolean OPENCYC = false;
	public static boolean TINY_KB = false;
	public static boolean Never_REDEFINE = false;
	public static boolean Always_REDEFINE = false;
	public static boolean BOOTY_HACKZ = true;
	protected static boolean delayEvalParams = true;

	public static boolean commonSymbolsOK = false;
	protected static boolean noInitLisp = false;
	public static boolean noInitCyc = false;

	public static boolean noExit = true;
	public static String[] passedArgs;
	public static String[] cycCmdArgs = new String[] { "-f", "(progn (load \"init/jrtl-release-init.lisp\")  (load \"init/port-init.lisp\"))" };
	static boolean cycPart2Early = false;
	public static boolean isSublispDefault = true;
	protected static boolean useMainThread = true;
	public static boolean noProlog = true;
	public static boolean noPrologJNI = false;

	public static boolean trackStructs = true;
	public static boolean disablePrologSync = true;
	public static boolean disableLispSync = true;

	public static boolean noGUI = false;
	public static boolean noBSH = false;
	public static boolean noBSHGUI = true;

	public static boolean needIOConsole = true;

	public static boolean needABCL = true;
	public static boolean needSubLMAIN = false;
	public static boolean abclProcessArgs = false;

	public static boolean isSubLispBindingMode = false;

	public static boolean guiRequested = false;

	public static boolean isAjaxSwing = false;

	public static boolean keepGoing = false;

	public static boolean useBeanDeskGUI = false;

	public static Class guiClass;

	public static String mainClass;

	public static boolean fakeajaxswing;

	public static String[] extractOptions(Class c, String[] args) {
		if (firstMain == null || Editor.class == c) {
			MainThreaded = true;
			if (c != null)
				firstMain = c;
		}
		return extractOptions(args);
	}

	public static String[] extractOptions(String[] args) {
		PrintStream to = System.err;
		if (to == null)
			to = System.out;
		if (to == null)
			to = SystemCurrent.originalSystemErr;

		for (int i = 0; i < args.length; i++) {
			String thisArg = args[i];
			thisArg = thisArg.toLowerCase();
			if (thisArg.startsWith("--no-")) {
				args[i] = "--no" + thisArg.substring(5);
			} else {
				int equals = thisArg.indexOf("=");
				if (thisArg.endsWith("=false") || thisArg.endsWith("=0")) {
					args[i] = "--no" + thisArg.substring(0, equals - 1);
				}
			}
		}
		SubLMain me = SubLMain.me;
		ArrayList<String> argsList = new ArrayList<String>();
		ArrayList<String> cycArgsList = new ArrayList<String>();
		for (int i = 0, size = args.length; i < size; ++i) {
			String arg = args[i];
			if (SubLMain.noArgCommandLineArgs.contains(arg)) {
				cycArgsList.add(arg);
				me.argNameToArgValueMap.put(arg, Boolean.TRUE);
			} else if (SubLMain.argRequiredCommandLineArgs.contains(args[i])) {
				if (i == size)
					Errors.error("Not enough command line arguments given for: " + arg);
				cycArgsList.add(args[i]);
				final String value = args[++i];
				cycArgsList.add(value);
				me.argNameToArgValueMap.put(arg, value);
			} else {
				argsList.add(args[i]);
				//Errors.error("Got invalid command line argument: " + args[i]);
			}
		}
		if (cycArgsList.size() == 0) {
			me.processCommandLineArgs(cycCmdArgs);
		} else {
			final String[] array = cycArgsList.toArray(new String[cycArgsList.size()]);
			cycCmdArgs = array;
		}

		if (argsList.contains("--fakeajaxswing")) {
			argsList.add(0, "--ajaxswing");
		}

		if (argsList.remove("--ajaxswing")) {
			if (to != null) {
				to.println("PWD:" + (new File(".").getAbsolutePath()));
			}
			isAjaxSwing = true;
			noExit = true;
			argsList.add(0, "--gui");
			argsList.add(0, "--noj");
			argsList.add(0, "--rcyc");
			enableAjaxSwing();
		}

		if (argsList.remove("--gui")) {
			keepGoing = true;
			guiRequested = true;
			useBeanDeskGUI = true;
			argsList.add(0, "--j");
			enableAllCWD();
			if (to != null) {
				to.println("PWD1:" + (new File(".").getAbsolutePath()));
			}

		}
		if (argsList.remove("--j")) {
			Interpreter.jlisp = true;
		}
		if (argsList.remove("--noj")) {
			Interpreter.jlisp = false;
		}

		if (argsList.remove("--abcl")) {
			argsList.add(0, "--lisp");
		}
		if (argsList.remove("--lisp") || argsList.contains("--ansi")) {
			isSublispDefault = false;
			abclProcessArgs = true;
			noProlog = true;
			noinit = false;
			nosystem = false;
			//noPrologJNI = false;
			noBSH = true;
			Main.setSubLisp(false);
			argsList.add(0, "--nocyc");
			argsList.add(0, "--noprolog");
		}

		if (argsList.remove("--fakeajaxswing")) {
			fakeajaxswing = true;
		}

		if (argsList.remove("--main-thread")) {
			Main.useMainThread = true;
		}
		if (argsList.remove("--norc")) {
			Interpreter.noinit = true;
		}
		if (argsList.remove("--noinit")) {
			Interpreter.noinit = true;
			argsList.add(0, "--noprolog");
		}
		if (argsList.remove("--noinform")) {
			Interpreter.noinform = true;
		}
		if (argsList.remove("--nosystem")) {
			Interpreter.nosystem = true;
		}
		if (argsList.remove("--noprolog") || argsList.remove("--noswi")) {
			noPrologJNI = true;
		}
		if (argsList.remove("--opencyc")) {
			SubLMain.OPENCYC = true;
			isSublispDefault = true;
			try {
				UpdateZip.updateUnits("5022");
			} catch (Throwable e) {
				e.printStackTrace();
				if (!Startup.keepGoing)
					throw new RuntimeException(" UpdateZip.updateUnits throw " + e, e);
			}
		}
		if (argsList.remove("--rcyc2")) {
			argsList.add("--rcyc");
			argsList.add("--cyc2");
		}
		
		if (argsList.remove("--rcyc")) {
			SubLMain.OPENCYC = false;
			needSubLMAIN = true;
			isSublispDefault = true;
			argsList.add("--cyc");
			try {
				UpdateZip.updateUnits("7166");
			} catch (Throwable e) {
				e.printStackTrace();
				if (!keepGoing)
					throw new RuntimeException(" UpdateZip.updateUnits throw " + e, e);
			}
		}
		if (argsList.remove("--cyc2")) {
			cycPart2Early = true;
		}
		if (argsList.remove("--cyc")) {
			Main.noBSHGUI = false;
			needSubLMAIN = true;
			Main.needABCL = false;
			isSublispDefault = true;
			SubLMain.noInitCyc = false;
		}
		if (argsList.remove("--nocyc")) {
			needSubLMAIN = false;
			noInitCyc = true;
			isSublispDefault = false;

		}
		if (argsList.remove("--fromprolog")) {
			//disablePrologSync = false;
			started_from_prolog = true;
			noPrologJNI = false;
			noProlog = false;
		}
		if (argsList.remove("--prologsync")) {
			disablePrologSync = false;
			trackStructs = true;
			noPrologJNI = false;
			//			JPL.init();
			//			Query.oneSolution("ensure_loaded(library(jpl))");
			//			Query.oneSolution("interactor");
			/// Query.oneSolution("jcall('com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain',mainFromProlog,[])");

		}
		if (argsList.remove("--noprologsync")) {
			disablePrologSync = true;
		}

		if (argsList.remove("--lispsync")) {
			disableLispSync = false;
			trackStructs = true;
		}
		if (argsList.remove("--nolispsync")) {
			disableLispSync = true;
		}

		if (argsList.remove("--headless") || argsList.remove("--nogui")) {
			noGUI = true;
			noBSHGUI = true;
		}
		if (argsList.remove("--prolog")) {
			noProlog = false;
			noPrologJNI = false;
		}
		if (argsList.remove("--beandesk")) {
			noBSHGUI = false;
			useBeanDeskGUI = true;
		}

		if (!argsList.contains("-cp")) {
			IsolatedClassLoader.addDefaultJarsToClassPath(System.getProperty("user.dir", "."));
		}
		String[] argsNew = jiggleEvalArgs(argsList.toArray(new String[argsList.size()]));

		for (int i = 0; i < argsNew.length; i++) {
			if (argsNew[i].equals("-L")) {
				argsNew[i] = "--load";
				noPrologJNI = true;
			} else if (argsNew[i].equals("-E"))
				argsNew[i] = "--eval";
		}
		if (argsNew.length > 0) {
			final java.io.File file = new java.io.File(argsNew[0]);
			if (file.exists() && file.isFile() && file.canRead()) {
				argsList = new ArrayList<String>(Arrays.asList(argsNew));
				argsList.add(0, "--load");
				argsNew = argsList.toArray(new String[argsList.size()]);
			}
		}

		argsList = new ArrayList<String>();
		boolean gotSomeDs = false;
		for (int i = 0; i < argsNew.length; i++) {
			String thisArg = args[i];
			if (thisArg != null) {
				int equals = thisArg.indexOf("=");
				if (thisArg.startsWith("-D") && equals > 0) {
					gotSomeDs = true;
					equals = -2;
					thisArg = thisArg.substring(2);
					String name = unquote(thisArg.substring(0, equals - 1));
					String value = unquote(thisArg.substring(equals + 1));
					System.setProperty(name, value);
				} else if (thisArg.startsWith("--main")) {
					gotSomeDs = true;
					if (equals > 0) {
						mainClass = unquote(thisArg.substring(equals + 1));
					} else {
						mainClass = unquote(args[++i]);
					}
				} else if (thisArg.startsWith("-cp")) {
					gotSomeDs = true;
					if (equals > 0) {
						IsolatedClassLoader.addToClassPath(unquote(thisArg.substring(equals + 1)));
					} else {
						IsolatedClassLoader.addToClassPath(unquote(args[++i]));
					}
				} else if (thisArg.startsWith("--bsh")) {
					gotSomeDs = true;
					try {
						if (equals > 0) {
							bsh_eval(unquote(thisArg.substring(equals + 1)));
						} else {
							bsh_eval(unquote(args[++i]));
						}
					} catch (EvalError e) {
						e.printStackTrace();
						addUncaught(e);
					}
				} else {
					argsList.add(thisArg);
				}
			}
		}
		if (gotSomeDs) {
			argsNew = argsList.toArray(new String[argsList.size()]);
		}

		passedArgs = argsNew;

		if (useBeanDeskGUI) {
			bsh_desktop();
			needIOConsole = false;
		} else if (needIOConsole) {
			SystemCurrent.setupIO();
			SystemCurrent.attachConsole();
			SystemCurrent.takeOwnerShip();
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
				e.printStackTrace();
				addUncaught(e);
			}
		}
		if (mainClass != null)
			exit(Main.exitCode);
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

	public static int lispInstances = 0;
	// public static boolean commonSymbolsOK;
	public static ThreadLocal<Boolean> globalContext = new ThreadLocal<Boolean>() {
		@Override
		protected Boolean initialValue() {
			return false;
		};
	};

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

	public static String[] copyParams(String[] args) {
		List<String> argsList = new ArrayList<String>(Arrays.asList(args));
		String[] argsNew = argsList.toArray(new String[argsList.size()]);
		return argsNew;
	}

	public static void enableAjaxSwing() {
		enableAllCWD();
	}

	public static void enableAllCWD() {

		String pwd = System.getProperty("ajaxswing.home", System.getProperty("catalina.home", "."));
		try {
			pwd = new File(pwd).getCanonicalPath();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			pwd = new File(pwd).getAbsolutePath();
		}
		System.setProperty("ajaxswing.home", System.getProperty("ajaxswing.home", pwd));
		//info("ajaxswing.home=" + System.getProperty("ajaxswing.home"));
		System.setProperty("catalina.home", System.getProperty("catalina.home", pwd));

		System.setProperty("user.dir", pwd);
		System.setProperty("user.home", pwd);
		System.setProperty("larkc.home", pwd);

		//info("catalina.home=" + System.getProperty("catalina.home"));
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @return
	 */
	public static boolean isUnderAjax() {
		// TODO Auto-generated method stub
		return isAjaxSwing;
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
		List<String> argsList = new ArrayList<String>();
		for (int i = 0; i < args.length; i++) {
			String thisArg = args[i];
			if (thisArg != null) {
				argsList.add(thisArg);
			}
		}
		String[] argsNew = argsList.toArray(new String[argsList.size()]);
		return argsNew;
	}

	public static String[] prependArgs(String first, String[] args) {
		List<String> argsList = new ArrayList<String>();
		argsList.add(first);
		for (int i = 0; i < args.length; i++) {
			String thisArg = args[i];
			if (thisArg != null) {
				argsList.add(thisArg);
			}
		}
		String[] argsNew = argsList.toArray(new String[argsList.size()]);
		return argsNew;
	}

	public static void bp() {
		if (false)
			;
		// BeanBowlGUI.startBeanBowl();
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

	public static boolean calledStartAppdatper = false;
	public static boolean calledStartDmiles = false;
	public static boolean called_init_swipl = false;
	public static Boolean started_from_prolog = null;
	public static Object dbrowser;
	static Container desktop;
	static Editor editor = null;
	public static boolean began_init_subl;
	public static boolean inited_cyc;
	public static boolean inited_kb;
	public static boolean inited_cyc_sees_cl;
	public static boolean inited_cl_sees_cyc;
	public static boolean inited_cyc_server;
	public static boolean inited_cyc_complete;
	public static boolean inited_swipl_server;
	// final public static BeanBowlGUI gui = BeanBowlGUI.getDefaultFrame();
	private static Thread Owner;
	final public static Map<String, Symbol> prologMethods = new HashMap();
	final static Map<String, CreationInfo> singletons = new HashMap<String, CreationInfo>();
	public static final LispObject[] EMPTY_LISP_OBJECT = new LispObject[0];
	static {
		// int hc = CycEval.CYC_PROGN.hotCount;
	}

	final static private AtomicInteger nthCall = new AtomicInteger(0);
	final static private CountDownLatch cdl = new CountDownLatch(1);

	public static void needRunningSystem(Class class1) {
		if (MainThreaded)
			return;
		int myId = nthCall.addAndGet(1);

		if (myId == 1) {
			if (class1 != Prolog.class) {
				/// disable SWI-Prolog Unit Tests
				noPrologJNI = true;
			}
			Owner = new Thread(() -> {
				synchronized (StartupLock) {
					Term.Enabled = true;
					SubLMain.commonSymbolsOK = true;
					init_cyc_classes();
				}
				cdl.countDown();
			});
			Owner.start();

		} else if (Owner == Thread.currentThread()) {
			return;
		}
		try {
			cdl.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 */
	private static void nop() {
		// TODO Auto-generated method stub

	}

	@LispMethod
	public static void cl_imports_cyc() {
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
	public static void cyc_imports_cl() {
		Symbol._PACKAGE_.setProcessScope(true);
		if (!Main.isSubLisp()) {
			return;
		} else {

		}
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
		string.append("" + t.getClass() + ": " + t);
		PrintStream ps = new PrintStream(outputStream);
		t.printStackTrace(ps);
		ps.flush();
		ps.close();
		string.append("" + t.getClass() + ": " + t.getMessage() + " " + t);
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
	public static LispObject cyc_repl_no_suspend() {
		boolean wasSubLisp = Main.isSubLisp();
		LispObject io = Symbol.TERMINAL_IO.symbolValue();
		LispObject out = Symbol.STANDARD_OUTPUT.symbolValue();
		LispObject in = Symbol.STANDARD_INPUT.symbolValue();
		init_cyc_classes();
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

	public static void importEverywhere(Operator oper, boolean reexport) {
		final Symbol lispObject = oper.getLambdaName().toSymbol().toLispObject();
		importEverywhere(lispObject, reexport);
	}

	public static void importEverywhere(Symbol symbol, boolean reexport) {
		Lisp.PACKAGE_CYC.importSymbol(symbol);
		if (reexport)
			Lisp.PACKAGE_CYC.export(symbol);
		Lisp.PACKAGE_SUBLISP.importSymbol(symbol);
		Lisp.PACKAGE_EXT.importSymbol(symbol);
		if (reexport)
			Lisp.PACKAGE_EXT.export(symbol);
		Lisp.PACKAGE_CL_USER.importSymbol(symbol);
	}

	public static Method findMethod(Method[] staticMethods, Object[] javaArgs) {
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
	public static Symbol findOrCreateSymbol(String js, LispMethod lm) {
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
	public static void init_cyc_classes() {
		synchronized (StartupLock) {
			if (inited_cyc)
				return;
			inited_cyc = true;
		}
		synchronized (StartupInitLock) {
			boolean wasSubLisp = Main.isSubLisp();
			try {
				Main.setSubLisp(true);
				init_subl();
				SubLPackage prevPackage = Lisp.getCurrentPackage();
				try {
					init_subl();
					SubLPackage.setCurrentPackage("CYC");
					SubLMain.initializeTranslatedSystems();
					SubLMain.handleInits();
					SubLMain.handlePatches();
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
	public static void init_cyc_server() throws IOException {
		synchronized (StartupInitLock) {
			init_cyc_kb();
			init_server();
		}
	}

	public static void init_kb() {
		UpdateZip.updateUnits("7166");
		init_cyc();
	}

	public static void init_cyc_kb() {
		UpdateZip.updateUnits("7166");
		init_cyc();
	}

	@LispMethod
	public static void init_cyc() {
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
					init_cyc_classes();
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
	public static void init_cyc_classes_part2() {
		synchronized (StartupInitLock) {
			final boolean wasSubLisp = Main.isSubLisp();
			SubLPackage prevPackage = Lisp.getCurrentPackage();
			try {
				try {
					SubLMain.initialize1TranslatedSystem("com.cyc.cycjava.cycl.cycl");
				} catch (Throwable e) {
					e.printStackTrace();
					doThrow(e);
				}
			} finally {
				SubLPackage.setCurrentPackage(prevPackage);
				Main.setSubLisp(wasSubLisp);
			}

		}
	}

	@LispMethod
	public static void init_server() {
		synchronized (StartupLock) {
			if (inited_cyc_server)
				return;
		}
		Throwable te = null;
		synchronized (StartupInitLock) {
			final boolean wasSubLisp = Main.isSubLisp();
			SubLPackage prevPackage = Lisp.getCurrentPackage();
			try {
				Main.setSubLisp(true);
				try {
					init_cyc_classes();
					SubLPackage.setCurrentPackage("CYC");
					Eval.eval("(sl:load \"init/services-init.lisp\")");
					SubLFiles.initialize("eu.larkc.core.orchestrator.LarkcInit");
					SubLFiles.initialize("eu.larkc.core.orchestrator.servers.LarKCHttpServer");
					//SubLMain.BOOTY_HACKZ = true;
					//SubLFiles.initialize("com.cyc.cycjava_3.cycl.cycl");
					//(cyc-eval (INITIALIZE-SUBL-INTERFACE-FILE "com.cyc.cycjava_2.cycl.cycl") :CYC)
					// if( !SubLMain.OPENCYC )
					if (false) {
						eu.larkc.core.orchestrator.LarkcInit.initializeLarkc();
					}
					LarKCHttpServer.start_sparql_server();
					inited_cyc_server = true;
				} catch (Throwable e) {
					e.printStackTrace();
					te = e;
				}
				if (true)
					init_cyc_classes_part2();
				try {
					PrologSync.setPrologReady(true);
					LispSync.setLispReady(true);
				} catch (Throwable e) {
					te = e;
				}
				if (te != null) {
					doThrow(te);
				}
			} finally {
				SubLPackage.setCurrentPackage(prevPackage);
				Main.setSubLisp(wasSubLisp);
			}

		}
	}

	@LispMethod
	public static void init_subl() {
		synchronized (StartupLock) {
			if (began_init_subl)
				return;
			began_init_subl = true;
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

			SubLPackage prevPackage = Lisp.getCurrentPackage();
			Main.setSubLisp(true);
			SubLPackage.initPackages();
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
	public static LispObject j_desktop() {
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
				Errors.unimplementedMethod("j_desktop");
			addSingleton(editor);
			return org.armedbear.lisp.JavaObject.getInstance(editor);
		}
	}

	@LispMethod
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

	@LispMethod
	public static LispObject lisp_repl() {
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

	@ConverterMethod
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

	@LispMethod
	public static LispObject prolog_unify(LispObject arg) throws Exception, InterruptedException {
		final LispObject prolog_eval_lobject = prolog_eval_lobject(arg);
		return Lisp.list(prolog_eval_lobject);
	}

	@LispMethod
	public static LispObject prolog_eval_lobject(LispObject arg) throws Exception {
		Term term = lobject_to_term(arg);
		return prolog_eval_term(new Compound("called_from_cyc", term));
	}

	@LispMethod
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

	public static void scanForExports(Class clz) {
		if (clz == Object.class || clz == null)
			return;
		for (java.lang.reflect.Method m : clz.getDeclaredMethods()) {
			if (Modifier.isStatic(m.getModifiers())) {
				if (m.isAnnotationPresent(LispMethod.class)) {
					registerMethod(m);
					continue;
				}
			}
		}
		scanForExports(clz.getSuperclass());
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
	public static void start_from_prolog() throws InterruptedException {
		synchronized (StartupLock) {
			if (started_from_prolog)
				return;
			started_from_prolog = true;
		}
		Main.needIOConsole = true;
		start_lisp_from_prolog();
	}

	@LispMethod
	public static void start_from_prolog_ikvm() throws InterruptedException {
		synchronized (StartupLock) {
			if (started_from_prolog)
				return;
			started_from_prolog = true;
		}
		Main.needIOConsole = true;
		start_lisp_from_prolog();
	}

	@LispMethod
	public static void start_lisp_from_prolog() {
		if (!noProlog) {
			noPrologJNI = disablePrologSync = false;
		}
		// Main.trackStructs = !disablePrologSync;
		bsh_desktop();
		scanForExports(BeanShellCntrl.class); // again
		PrologSync.setPrologReady(!disablePrologSync);
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
			if (called_init_swipl)
				return;
			called_init_swipl = true;
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
					disablePrologSync = true;
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
			if (started_from_prolog == null) {
				started_from_prolog = !JPL.init();

			} else if (!started_from_prolog) {
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

	@ConverterMethod
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

	@ConverterMethod
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
	public static LispObject read_lisp(String s) {
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

	@ConverterMethod
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
	public static Object test_int(int obj) {
		return obj;
	}

	@LispMethod
	public static Object test_object(Object obj) {
		return obj;
	}

	@LispMethod
	public static Object test_string(String obj) {
		return obj;
	}

	@LispMethod
	public static Object test_term(Term obj) {
		return obj;
	}

	@LispMethod
	public static Object test_term_t(term_t obj) {
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
		scanForExports(BeanShellCntrl.class);
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

		scanForExports(Startup.class);
		if (runnable != null) {
			runnable.run();

			scanForExports(BeanShellCntrl.class);
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
			e.printStackTrace();
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

	public static class PrimitiveEverywhere extends org.armedbear.lisp.Primitive {
		public PrimitiveEverywhere(String string) {
			super(string, Lisp.PACKAGE_CYC, true);
			importEverywhere(this, true);
		}
	}

	public static class StartupError extends ConditionThrowable {
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

	public static org.armedbear.lisp.Interpreter currentLisp() {
		return Interpreter.getInstance();
	}

	/**
	 *
	 */

	public static void startCycInit() {
		if (!noProlog)
			Startup.start_prolog_from_lisp();
		scanForExports(BeanShellCntrl.class);
		if (Main.needSubLMAIN) {
			init_cyc_classes();
			SubLMain.doInitialEmbeddedMain(cycCmdArgs);
			cl_imports_cyc();
			cyc_imports_cl();
		}
	}

	public static void completeCycInit() {
		startCycInit();
		try {
			if (cycPart2Early)
				init_cyc_classes_part2();
			init_cyc_server();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
