/*
 * Interpreter.java
 *
 * Copyright (C) 2002-2006 Peter Graves
 * $Id$
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package org.armedbear.lisp;

import static org.armedbear.lisp.Lisp.EOF;
import static org.armedbear.lisp.Lisp.LISP_NOT_JAVA;
import static org.armedbear.lisp.Lisp.NIL;
import static org.armedbear.lisp.Lisp.PACKAGE_SYS;
import static org.armedbear.lisp.Lisp.PACKAGE_TPL;
import static org.armedbear.lisp.Lisp.T;
import static org.armedbear.lisp.Lisp._BATCH_MODE_;
import static org.armedbear.lisp.Lisp._COMMAND_LINE_ARGUMENT_LIST_;
import static org.armedbear.lisp.Lisp._NOINFORM_;
import static org.armedbear.lisp.Lisp.addFeature;
import static org.armedbear.lisp.Lisp.checkCallers;
import static org.armedbear.lisp.Lisp.checkPathname;
import static org.armedbear.lisp.Lisp.debug;
import static org.armedbear.lisp.Lisp.error;
import static org.armedbear.lisp.Lisp.flushOutputStreams;
import static org.armedbear.lisp.Lisp.getStandardInput;
import static org.armedbear.lisp.Lisp.getStandardOutput;
import static org.armedbear.lisp.Lisp.*;
import static org.armedbear.lisp.Lisp.intern;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import org.logicmoo.system.IOSecurityManager;
import org.logicmoo.system.Startup;
import org.logicmoo.system.SystemCurrent;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;

@SuppressWarnings("unused")
public final class Interpreter extends Startup implements Runnable {

	public int doubledash = -1;
	//	public boolean noinit = false;
	public boolean postProcess = false;
	//public boolean noinit = false;

	final int instanceID;
	private boolean _isRunning;

	public static String RC_FILE = ".abclrc";

	public final static Object globalLock = new Object() {
		@Override
		public String toString() {
			return "Interpreter.globalLock";
		}
	};

	private InputStream inputStream;
	private OutputStream outputStream;
	private String[] initArgs;
	private boolean began_init_instance = false;
	private boolean began_post_inits = false;
	final long startTimeMillis = System.currentTimeMillis();

	public static Interpreter getInstance() {
		synchronized (globalLock) {
			return globalInterpreter;
		}
	}

	// Interface.
	public static Interpreter createInstance() {
		synchronized (globalLock) {
			if (globalInterpreter != null) {
				return globalInterpreter;
			}
			return createDefaultInstance(passedArgs);
		}
	}

	// Interface.
	public static Interpreter createBasicInstance() {
		try {
			synchronized (globalLock) {
				if (globalInterpreter != null)
					return globalInterpreter;
				globalInterpreter = createDefaultInstance(passedArgs);
				//_NOINFORM_.setSymbolValue(T);
				globalInterpreter.ensureInitialized();
				return globalInterpreter;
			}
		} finally {
			// postProcessCommandLine(Main.initArgs);
		}
	}

	// Interface.
	public static Interpreter createDefaultInstance(String[] args) {

		synchronized (globalLock) {
			if (globalInterpreter != null) {
				// Silly but lots of old external code likes this behavour
				return null;
			}
			passedArgs = args;
			InputStream inputStream = System.in;
			OutputStream outputStream = System.out;
			globalInterpreter = createNewLispInstanceNoInit(inputStream, outputStream, "./", null, noinform, args, true);
			globalInterpreter.init();
			return globalInterpreter;
		}
	}

	public static Interpreter createJLispInstance(InputStream in, OutputStream out, String initialDirectory, String version) {
		jlisp_requested = true;
		return createNewLispInstance(in, out, initialDirectory, version, noinform, passedArgs, Main.lispInstances.get() == 0);
	}

	public static Interpreter createNewLispInstance(InputStream in, OutputStream out, String initialDirectory, String version, boolean procArgs) {
		return createNewLispInstance(in, out, initialDirectory, version, noinform, passedArgs, procArgs);
	}

	public static Interpreter createNewLispInstance(InputStream in, OutputStream out, String initialDirectory, String version, //
			boolean noinform, String[] todo, boolean reprocEvals) {

		synchronized (globalLock) {
			if (todo == null) {
				todo = Main.passedArgs;
				//Main.initArgs = null;
			}
			Interpreter interp = createNewLispInstanceNoInit(in, out, initialDirectory, null, noinform, todo, reprocEvals);
			interp.ensureInitialized();
			return interp;
		}

	}

	public static Interpreter createNewLispInstanceNoInit(InputStream in, OutputStream out, //
			String initialDirectory, String version, //
			boolean noinform, String[] todo, boolean reprocEvals) {
		synchronized (globalLock) {
			//			if (version == null) {
			//				version = Version.getVersion();
			//			}
			Interpreter interp = new Interpreter(in, out, initialDirectory, noinform, todo, reprocEvals);
			if (globalInterpreter == null) {
				globalInterpreter = interp;
			}
			return interp;
		}
	}

	public Interpreter initInstance(String[] args, boolean noinform) {
		synchronized (globalLock) {
			return subl_preserve_pkg(false, false, () -> initInstance0(args, noinform));
		}
	}

	private Interpreter initInstance0(String[] args, boolean noinform) {
		//Interpreter.globalInterpreter = interp;
		if (began_init_instance)
			return this;

		this.began_init_instance = true;

		if (args != null)
			preprocessCommandLineArguments(args);

		initArgs = args;

		if (!noinform) {
			final Stream out = getStandardOutput();
			out._writeString(banner());
			out._finishOutput();
		}

		if (help) {
			final Stream out = getStandardOutput();
			out._writeString(help());
			out._finishOutput();
			exit(0); // FIXME
		}

		if (noinform)
			_NOINFORM_.setSymbolValue(T);
		else {
			double uptime = (System.currentTimeMillis() - startTimeMillis) / 1000.0;
			final Stream out = getStandardOutput();
			out._writeString("Low-level initialization used " + uptime + " seconds.\n");
		}

		load_boot_lisp();
		if (jlisp_requested)
			load_boot_jlisp();

		initializeTopLevel();

		if (!Startup.nosystem)

		{
			Startup.nosystem = true;
			initializeSystem();
		}

		doPreInits();

		Startup.registerForiegnMethods();
		//
		//		if (!Main.noSubLisp) {
		//			/*
		//			 * System.setIn(in); System.setOut(new PrintStream(out));
		//			 * System.setErr(new PrintStream(out));
		//			 */
		//			Main.needABCL = false;
		//			SubLMain.embeddedMain(new String[0], SubLMain.NOTHING_TO_DO);
		//		}
		if (!noinform) {
			double uptime = (System.currentTimeMillis() - startTimeMillis) / 1000.0;
			final Stream out = getStandardOutput();
			out._writeString("Low-level initialization completed in " + uptime + " seconds.\n");
		}

		if (!noinit) {
			processInitializationFile();
		}

		if (!Main.isSublispDefault)
			Lisp.setCurrentPackage("CL-USER");

		//Startup.i

		//globalInterpreter.eval("(cl:funcall #'top-level::top-level-loop)");
		///StreamsLow.$terminal_io$.getValue().toOutputStream().flush();
		return this;
	}

	public static boolean initialized() {
		synchronized (globalLock) {
			return Interpreter.isInitialized();
		}
	}

	//	private Interpreter() {
	//		instanceID = Main.lispInstances.getAndAdd(1);
	//		//jlisp = false;
	//		final InputStream in = SystemCurrent.mustIn();
	//		inputStream = in;
	//		final PrintStream out = SystemCurrent.mustOut();
	//
	//		outputStream = out;
	//		sharedConstruct(null, noinform);
	//		//if(!Main.noBSH)BeanShellCntrl.setSingleton(this);
	//
	//	}
	//
	//	private Interpreter(InputStream inputStream, OutputStream outputStream, String initialDirectory) {
	//		instanceID = Main.lispInstances.getAndAdd(1);
	//		//if(!Main.noBSH)BeanShellCntrl.setSingleton(this);
	//		//jlisp = true;
	//		this.inputStream = inputStream;
	//		this.outputStream = outputStream;
	//		Lisp.setIO(inputStream, outputStream);
	//		if (!initialDirectory.endsWith(File.separator))
	//			initialDirectory = initialDirectory.concat(File.separator);
	//		Symbol.DEFAULT_PATHNAME_DEFAULTS.setSymbolValue(new Pathname(initialDirectory));
	//	}

	private Interpreter(InputStream inputStream, OutputStream outputStream, String initialDirectory, //
			boolean noinform, String[] args, boolean redoPostProcess) {
		instanceID = Main.lispInstances.getAndAdd(1);
		//if(!Main.noBSH)BeanShellCntrl.setSingleton(this);
		//jlisp = true;
		this.postProcess = redoPostProcess;
		this.inputStream = inputStream;
		this.outputStream = outputStream;

		if (!initialDirectory.endsWith(File.separator))
			initialDirectory = initialDirectory.concat(File.separator);
		final String finitialDirectory = initialDirectory;
		sharedConstruct(finitialDirectory, noinform);
	}

	void sharedConstruct(String finitialDirectory, boolean noinform) {
		if (instanceID == 0)
			Lisp.setIO(inputStream, outputStream);
		if (finitialDirectory != null)
			Symbol.DEFAULT_PATHNAME_DEFAULTS.setSymbolValue(new Pathname(finitialDirectory));
		addPreInit(-1, () -> {
			synchronized (globalLock) {
				if (finitialDirectory != null)
					Symbol.DEFAULT_PATHNAME_DEFAULTS.setSymbolValue(new Pathname(finitialDirectory));
				initInstance(initArgs, noinform);
			}
		});
		addPostInit(-1, () -> {
			synchronized (globalLock) {
				if (postProcess)
					postProcessCommandLine();
			}
		});

	}

	static ArrayList<Runnable> runnablePreInits = new ArrayList<>();

	public void addPreInit(int pos, Runnable obj) {
		if (pos < 0) {
			runnablePreInits.add(obj);
		} else {
			runnablePreInits.add(pos, obj);
		}
	}

	static public void doPreInits() {
		while (runnablePreInits.size() > 0) {
			Runnable r = runnablePreInits.remove(0);
			try {
				r.run();
			} catch (Throwable e) {
				Startup.uncaughtException(e);
			}
		}
	}

	ArrayList<Runnable> runnablePostInits = new ArrayList<>();
	public Symbol TOP_LEVEL_LOOP;
	public LispObject tplFun;

	public void addPostInit(int pos, Runnable obj) {
		if (pos < 0) {
			runnablePostInits.add(obj);
		} else {
			runnablePostInits.add(pos, obj);
		}
	}

	public void doPostInits() {
		while (runnablePostInits.size() > 0) {
			Runnable r = runnablePostInits.remove(0);
			try {
				r.run();
			} catch (Throwable e) {
				Startup.uncaughtException(e);
			}
		}
	}

	// Interface.
	public LispObject eval(String s) {
		return Lisp.eval(new StringInputStream(s).read(true, NIL, false, LispThread.currentThread(), Stream.currentReadtable));
	}

	/**
	 * TODO Describe the purpose of this method.
	 */
	public void ensureInitialized() {
		synchronized (globalLock) {

			if (!began_init_instance)
				initInstance(initArgs, jlisp_requested);
			doPreInits();
		}
	}

	public static void initializeJLisp() {
		createInstance().load_boot_jlisp();
	}

	public static void initializeLisp() {
		createInstance().load_boot_lisp();
	}

	public void load_boot_lisp() {
		synchronized (globalLock) {
			if (!began_load_boot_lisp) {
				began_load_boot_lisp = true;
				Load.loadSystemFile("boot.lisp", false, false, false);
				finishedBoot_lisp = true;
			}
		}
	}

	public void load_boot_jlisp() {
		synchronized (globalLock) {
			load_boot_lisp();
			if (!began_load_J_lisp) {
				began_load_J_lisp = true;
				addFeature("J");

				try {
					try {

						Class.forName("org.armedbear.j.LispAPI");
					} catch (ClassNotFoundException e) {
						Startup.uncaughtException(e);
					} // FIXME: what to do?

					try {

						Load.loadSystemFile("j.lisp", false); // not being autoloaded
					} catch (Throwable e) {
						Startup.uncaughtException(e);
					} // FIXME: what to do?

					try {
						if (jlisp_requested && false)
							Load.loadSystemFile("emacs.lisp", true); // not being autoloaded

					} catch (Throwable e) {
						Startup.uncaughtException(e);
					}

					began_load_J_lisp = true;

				} catch (Throwable e) {
					began_load_J_lisp = false;
					Startup.uncaughtException(e);
				} // FIXME: what to do?
			}
		}
	}

	public static boolean topLevelInitialized;

	private void initializeTopLevel() {
		synchronized (globalLock) {
			// Resolve top-level-loop autoload.
			if (tplFun == null) {
				if (TOP_LEVEL_LOOP == null) {
					TOP_LEVEL_LOOP = intern("TOP-LEVEL-LOOP", PACKAGE_TPL);
				}
				tplFun = TOP_LEVEL_LOOP.getSymbolFunction();
				if (tplFun instanceof Autoload) {
					Autoload autoload = (Autoload) tplFun;
					autoload.load();
				}
				tplFun = TOP_LEVEL_LOOP.getSymbolFunction();
			}
			topLevelInitialized = true;
		}
	}

	public void processInitializationFile() {
		synchronized (globalLock) {
			boolean wasNoInit = noinit;
			try {
				noinit = true;
				// checks local directory firsts
				File file = new File(RC_FILE);
				if (!file.isFile() && file.canRead()) {
					String userHome = Pathname.guessHomeDir();
					file = new File(userHome, RC_FILE);
				}
				if (file.isFile()) {
					final double startLoad = System.currentTimeMillis();
					final String canonicalPath = file.getCanonicalPath();
					Load.load(canonicalPath);
					if (!noinform) {
						final double loadtime = (System.currentTimeMillis() - startLoad) / 1000.0;
						getStandardOutput()._writeString("Loading " + canonicalPath + " completed in " + loadtime + " seconds.\n");
					}
					return;
				}
			} catch (IOException e) {
				Startup.uncaughtException(e);
				noinit = wasNoInit;
			}
		}
	}

	public static void initializeSystem() {
		synchronized (globalLock) {
			if (!began_load_system_lisp) {
				began_load_system_lisp = true;
				Load.loadSystemFile("system", false); // not being autoloaded
			}
		}
	}

	// Check for --noinit; verify that arguments are supplied for --load and
	// --eval options.  Copy all unrecognized arguments into
	// ext:*command-line-argument-list*
	public void preprocessCommandLineArguments(String[] args) {
		synchronized (globalLock) {
			LispObject arglist = NIL;

			if (args != null) {
				for (int i = 0; i < args.length; ++i) {
					String arg = unquote(args[i]);
					if (i > doubledash) {
						arglist = new Cons(arg, arglist);
					} else if (arg.equals("--")) {
						doubledash = i;
					} else if (arg.equals("--noinit")) {
						noinit = true;
					} else if (arg.equals("--init")) {
						noinit = false;
					} else if (arg.equals("--j")) {
						jlisp_requested = true;
					} else if (arg.equals("--noj")) {
						jlisp_requested = false;
					} else if (arg.equals("--nosystem")) {
						nosystem = true;
					} else if (arg.equals("--system")) {
						nosystem = false;
					} else if (arg.equals("--noinform")) {
						noinform = true;
					} else if (arg.equals("--help")) {
						help = true;
					} else if (arg.equals("--batch")) {
						_BATCH_MODE_.setSymbolValue(T);
					} else if (arg.equals("--compile-system")) {
						isSublispDefault = false;
						needSubLMAIN = false;
						abclProcessArgs = true;
						noProlog = true;
						noPrologJNI = true;
						noInitCyc = true;
						noBSH = true;
						leanABCL = true;
						Main.setSubLisp(false);
						nosystem = true;
						noinform = true;
						noinit = true;
					} else if (arg.equals("--eval")) {
						if (i + 1 < args.length) {
							++i;
						} else {
							System.err.println("No argument supplied to --eval");
							exit(1); // FIXME
						}
					} else if (arg.equals("--load") || arg.equals("--load-system-file")) {
						if (i + 1 < args.length) {
							++i;
						} else {
							System.err.println("No argument supplied to --load");
							exit(1); // FIXME
						}
					} else {
						arglist = new Cons(args[i], arglist);
					}
				}
			}
			arglist.nreverse();

			_COMMAND_LINE_ARGUMENT_LIST_.setSymbolValue(arglist);
		}
	}

	/**
	 * @param jLisp
	 */
	public void postProcessCommandLine() {

		init();

		if (this.began_post_inits)
			return;

		synchronized (globalLock) {
			this.began_post_inits = true;
			if (null == initArgs)
				initArgs = passedArgs;
		}

		if (initArgs != null) {
			if (postProcess) {
				postProcess = false;
				//if (Main.subLisp) SubLPackage.setCurrentPackage("CL-USER");
				doubledash = -1;
				postprocessCommandLineArguments(initArgs);
			}
		} else {
			//SubLPackage.setCurrentPackage("CL-USER");
			//globalInterpreter.eval("(cl:load \"d.lisp\")");
		}
		if (_BATCH_MODE_.getSymbolValue() == T) {
			exit(0); // FIXME
		}

	}

	// Do the --load and --eval actions.
	private void postprocessCommandLineArguments(String[] args) {
		if (args != null) {
			for (int i = 0; i < args.length; ++i) {
				String arg = args[i];
				if (arg.equals("--"))
					return;
				if (i > doubledash && doubledash >= 0)
					return;
				i = doOneArg(i, args);
			}
		}
	}

	public int doOneArg(int i, String... args) throws ConditionThrowable {
		String arg = unquote(args[i]);

		if (arg.equals("--")) {
			return args.length;
		}

		else if (arg.equals("--nodebug"))
			debug = false;
		else if (arg.equals("--debug"))
			debug = true;
		else if (arg.equals("--nocheck"))
			checkCallers = false;
		else if (arg.equals("--check"))
			checkCallers = true;
		else if (arg.equals("--notrace"))
			evaluate("(trace-lisp nil)");
		else if (arg.equals("--trace"))
			evaluate("(trace-lisp t)");
		else if (arg.equals("--junicode"))
			LISP_NOT_JAVA = false;
		else if (arg.equals("--nojunicode"))
			LISP_NOT_JAVA = true;

		else if (arg.equals("--eval")) {
			if (i + 1 < args.length) {
				argEval(unquote(args[i + 1]));
				++i;
			} else {
				// Shouldn't happen.
				System.err.println("No argument supplied to --eval");
				exit(1); // FIXME
			}
		} else if (arg.equals("--compile-system")) {
			postProcess = false;
			compile_the_system();
		}

		else if (arg.equals("--load") || arg.equals("--load-system-file")) {
			if (i + 1 < args.length) {
				if (arg.equals("--load"))
					Load.load(Pathname.mergePathnames(new Pathname(args[i + 1]), checkPathname(Symbol.DEFAULT_PATHNAME_DEFAULTS.getSymbolValue())), false, false, true);

				else
					Load.loadSystemFile(args[i + 1], false); // not being autoloaded
				++i;
			} else {
				// Shouldn't happen.
				System.err.println("No argument supplied to --load");
				exit(1); // FIXME
			}
		}
		return i;
	}

	/**
	 * @param args
	 * @param i
	 * @throws ConditionThrowable
	 */
	public void argEval(String argi1) throws ConditionThrowable {
		try {
			evaluate(argi1);
		} catch (UnhandledCondition c) {
			uncaughtException(c);
			final String separator = System.getProperty("line.separator");
			StringBuilder sb = new StringBuilder();
			sb.append(separator);
			sb.append("Caught ");
			final LispObject condition = c.getCondition();
			sb.append(condition.typeOf().princToString());
			sb.append(" while processing --eval option \"" + argi1 + "\":");
			sb.append(separator);
			sb.append("  ");
			final LispThread thread = LispThread.currentThread();
			thread.bindSpecial(Symbol.PRINT_ESCAPE, NIL);
			sb.append(condition.princToString());
			sb.append(separator);
			System.err.print(sb.toString());
			exit(2); // FIXME
		}
	}

	/**
	 * @throws ConditionThrowable
	 * @throws IOException
	 */
	public static void compile_the_system() throws ConditionThrowable {
		try {
			evaluate("(setf *load-verbose* t)");
			// evaluate("(setf trace-lisp 10)");
			//String eval = "(handler-case (compile-system :zip nil :quit t :output-path \"${abcl.lisp.output}/\") (t (x) (progn (format t \"~A: ~A~%\" (type-of x) x) (exit :status -1))))";
			String abcl_lisp_output = new File("./target/classes/org/armedbear/lisp/").getCanonicalPath();
			abcl_lisp_output = IOSecurityManager.canonicalPath(abcl_lisp_output);
			evaluate("(handler-case (compile-system :zip nil :quit t :output-path \"" + abcl_lisp_output + "\") " //
					+ "(t (x) (progn (format t \"~A: ~A~%\" (type-of x) x) (exit :status -1))))");
		} catch (Throwable c) {
			uncaughtException(c);
			final String separator = System.getProperty("line.separator");
			StringBuilder sb = new StringBuilder();
			sb.append(separator);
			sb.append("Caught ");
			final LispThread thread = LispThread.currentThread();
			thread.bindSpecial(Symbol.PRINT_ESCAPE, NIL);
			if (c instanceof ConditionThrowable) {
				final LispObject condition = ((ConditionThrowable) c).getCondition();
				sb.append(condition.typeOf().printObject());
				sb.append(separator);
				sb.append(condition);
			} else {
				sb.append(c);
			}
			sb.append(" while processing --compile-system");
			sb.append(separator);
			System.err.print(sb.toString());
			exit(2); // FIXME
		}
	}

	@Override
	//@SuppressWarnings("CallToThreadDumpStack")
	public void run() {
		if (_isRunning) {
			return;
		}
		init();
		_isRunning = true;
		if (tplFun instanceof Function) {
			try {
				if (tplFun instanceof Function) {
					final LispThread thread = LispThread.currentThread();
					thread.execute(tplFun);
					return;
				}
			} catch (ProcessingTerminated e) {
				if (noExit && e.getStatus() != 0) {
					run2(true);
				}
				throw e;
			} catch (IntegrityError e) {
				uncaughtException(e);
				if (!noExit)
					return;
			} catch (Throwable t) {
				uncaughtException(t);
				printStackTrace(t);
				if (!noExit)
					return;
			} finally {
				_isRunning = false;
			}
		}
		// We only arrive here if something went wrong and we weren't able
		// to load top-level.lisp and run the normal top-level loop.
		run2(false);
	}

	/**
	 *
	 */
	public void init() {
		ensureInitialized();
		initializeTopLevel();
		Main.leanABCL = false;
		doPostInits();
	}

	@SuppressWarnings("CallToThreadDumpStack")
	public void run2(boolean secondChance) {
		final LispThread thread = LispThread.currentThread();
		// We only arrive here if something went wrong and we weren't able
		// to load top-level.lisp and run the normal top-level loop.
		Stream standardOut = getStandardOutput();
		Stream standardInput = getStandardInput();
		while (true) {
			try {
				thread.NO_STACK_FRAMES = true;
				thread.resetStack();
				thread.clearSpecialBindings();
				standardOut._writeString("* ");
				standardOut._finishOutput();

				LispObject object = standardInput.read(false, EOF, false, thread, Stream.currentReadtable);
				if (object == EOF) {
					if (!secondChance)
						break;
				}
				standardOut.setCharPos(0);
				Symbol.MINUS.setSymbolValue(object);
				LispObject result = Lisp.eval(object, Environment.newEnvironment(), thread);
				Debug.assertTrue(result != null);
				Symbol.STAR_STAR_STAR.setSymbolValue(Symbol.STAR_STAR.symbolValue());
				Symbol.STAR_STAR.setSymbolValue(Symbol.STAR.symbolValue());
				Symbol.STAR.setSymbolValue(result);
				Symbol.PLUS_PLUS_PLUS.setSymbolValue(Symbol.PLUS_PLUS.symbolValue());
				Symbol.PLUS_PLUS.setSymbolValue(Symbol.PLUS.symbolValue());
				Symbol.PLUS.setSymbolValue(Symbol.MINUS.symbolValue());
				standardOut = getStandardOutput();
				LispObject[] values = thread.getValues();
				Symbol.SLASH_SLASH_SLASH.setSymbolValue(Symbol.SLASH_SLASH.symbolValue());
				Symbol.SLASH_SLASH.setSymbolValue(Symbol.SLASH.symbolValue());
				if (values != null) {
					LispObject slash = NIL;
					for (int i = values.length; i-- > 0;)
						slash = new Cons(values[i], slash);
					Symbol.SLASH.setSymbolValue(slash);
					for (int i = 0; i < values.length; i++)
						standardOut._writeLine(values[i].printObject());
				} else {
					Symbol.SLASH.setSymbolValue(new Cons(result));
					standardOut._writeLine(result.printObject());
				}
				standardOut._finishOutput();
			} catch (StackOverflowError e) {
				uncaughtException(e);
				standardInput.clearInput();
				standardOut._writeLine("Stack overflow");
			} catch (ControlTransfer c) {
				// We're on the toplevel, if this occurs,
				// we're toast...
				uncaughtException(c);
				reportError(c, thread);
			} catch (ProcessingTerminated e) {
				throw e;
			} catch (IntegrityError e) {
				uncaughtException(e);
				return;
			} catch (Throwable t) {
				uncaughtException(t);
				standardInput.clearInput();
				standardOut.printStackTrace(t);
				thread.printBacktrace();
			}
		}
	}

	private static void reportError(ControlTransfer c, LispThread thread) {
		getStandardInput().clearInput();
		Stream out = getStandardOutput();
		out.FRESH_LINE();
		LispObject condition = c.getCondition();
		out._writeLine("Error: unhandled condition: " + condition.princToString());
		if (thread != null)
			thread.printBacktrace();
	}

	private static void reportError(UnhandledCondition c, LispThread thread) {
		getStandardInput().clearInput();
		Stream out = getStandardOutput();
		out.FRESH_LINE();
		LispObject condition = c.getCondition();
		out._writeLine("Error: unhandled condition: " + condition.princToString());
		if (thread != null)
			thread.printBacktrace();
	}

	public void kill(int status) {
		flushOutputStreams();
		if (jlisp_requested && false) {
			try {
				if (inputStream != null)
					inputStream.close();
			} catch (Throwable e) {
				Debug.printStackTrace(e);
			}
			try {
				if (outputStream != null)
					outputStream.close();
			} catch (Throwable e) {
				Debug.printStackTrace(e);
			}
		} else {
			Startup.exit(status);
		}
	}

	public synchronized void dispose() {
		Debug.trace("Interpreter.dispose");
		Debug.assertTrue(globalInterpreter == this);
		globalInterpreter = null;
	}

	@Override
	protected void finalize() throws Throwable {
		System.err.println("Interpreter.finalize");
	}

	public static final class UnhandledCondition extends ConditionThrowable {
		//LispObject condition;

		UnhandledCondition(LispObject condition) {
			this.condition = condition;
		}

		//        public LispObject getCondition() {
		//            return condition;
		//        }

		@Override
		public String getMessage() {
			String conditionText;
			LispThread thread = LispThread.currentThread();
			SpecialBindingsMark mark = thread.markSpecialBindings();
			thread.bindSpecial(Symbol.PRINT_ESCAPE, NIL);
			try {
				final LispObject condition = getCondition();
				conditionText = condition.princToString();
			} catch (Throwable t) {
				conditionText = "<error printing Lisp condition>";
			} finally {
				thread.resetSpecialBindings(mark);
			}

			return "Unhandled lisp condition: " + conditionText;
		}

	};

	private static final Primitive _DEBUGGER_HOOK_FUNCTION = new Primitive("%debugger-hook-function", PACKAGE_SYS, false) {
		@Override
		public LispObject execute(LispObject first, LispObject second) {
			final LispObject condition = first;
			if (globalInterpreter == null) {
				final LispThread thread = LispThread.currentThread();
				final SpecialBindingsMark mark = thread.markSpecialBindings();
				thread.bindSpecial(Symbol.PRINT_ESCAPE, NIL);
				try {
					final LispObject truename = Symbol.LOAD_TRUENAME.symbolValue(thread);
					if (truename != NIL) {
						final LispObject stream = _LOAD_STREAM_.symbolValue(thread);
						if (stream instanceof Stream) {
							final int lineNumber = ((Stream) stream).getLineNumber() + 1;
							final int offset = ((Stream) stream).getOffset();
							Debug.trace("Error loading " + truename.princToString() + " at line " + lineNumber + " (offset " + offset + ")");
						}
					}
					Debug.trace("Encountered unhandled condition of type " + condition.typeOf().princToString() + ':');
					Debug.trace("  " + condition.princToString());
				} catch (Throwable t) {
				} // catch any exception to throw below
				finally {
					thread.resetSpecialBindings(mark);
				}
			}
			UnhandledCondition uc = new UnhandledCondition(condition);
			if (condition.typep(Symbol.JAVA_EXCEPTION) != NIL)
				uc.initCause((Throwable) JavaException.JAVA_EXCEPTION_CAUSE.execute(condition).javaInstance());
			throw uc;
		}
	};

	public static final LispObject readFromString(String s) {
		return new StringInputStream(s).read(true, NIL, false, LispThread.currentThread(), Stream.currentReadtable);
	}

	// For j.
	/** Runs its input string through the lisp reader and evaluates the result.
	 *
	 * @param s A string with a valid Common Lisp expression
	 * @return The result of the evaluation
	 * @exception UnhandledCondition in case the an error occurs which
	 *      should be passed to the Lisp debugger
	 */
	public static LispObject evaluate(String s) {
		synchronized (globalLock) {
			if (!initialized()) {
				Interpreter.createInstance();
			}
		}
		StringInputStream stream = new StringInputStream(s);
		final LispThread thread = LispThread.currentThread();
		LispObject obj = null;

		final SpecialBindingsMark mark0 = thread.markSpecialBindings();
		thread.bindSpecial(Symbol.DEBUGGER_HOOK, _DEBUGGER_HOOK_FUNCTION);
		try { // catch possible errors from use of SHARPSIGN_DOT macros in --eval stanzas
			obj = stream.read(false, EOF, false, thread, Stream.currentReadtable);
		} finally {
			thread.resetSpecialBindings(mark0);
		}
		if (obj == EOF)
			return error(new EndOfFile(stream));

		final SpecialBindingsMark mark = thread.markSpecialBindings();
		thread.bindSpecial(Symbol.DEBUGGER_HOOK, _DEBUGGER_HOOK_FUNCTION);
		try {
			return Lisp.eval(obj, Environment.newEnvironment(), thread);
		} finally {
			thread.resetSpecialBindings(mark);
		}
	}

	private static String banner() {
		final String sep = System.getProperty("line.separator");
		StringBuilder sb = new StringBuilder("Armed Bear Common Lisp ");
		sb.append(Version.getVersion());
		String build = calcBuilt();
		if (build != null) {
			sb.append(" (built ");
			sb.append(build);
			sb.append(')');
		}
		sb.append(sep);
		sb.append("Java ");
		sb.append(System.getProperty("java.version"));
		sb.append(' ');
		sb.append(System.getProperty("java.vendor"));
		sb.append(sep);
		String vm = System.getProperty("java.vm.name");
		if (vm != null) {
			sb.append(vm);
			sb.append(sep);
		}
		return sb.toString();
	}

	private static String calcBuilt() {
		try (InputStream in = Interpreter.class.getResourceAsStream("build")) {
			BufferedReader reader = null;
			if (in != null) {
				try {
					try {
						final InputStreamReader in2 = new InputStreamReader(in);
						reader = new BufferedReader(in2);
					} catch (Exception e) {
						return null;
					}

					return reader.readLine();
				} catch (Exception e) {
				} finally {
					try {
						reader.close();
					} catch (Exception e) {
					}
				}
			}
		} catch (IOException e1) {
		}
		return null;
	}

	private static String help() {
		final String sep = System.getProperty("line.separator");
		StringBuilder sb = new StringBuilder("Parameters:");
		sb.append(sep);
		sb.append("--help").append(sep).append("    Displays this message.");
		sb.append(sep);
		sb.append("--noinform").append(sep).append("    Suppresses the printing of startup information and banner.");
		sb.append(sep);
		sb.append("--noinit").append(sep).append("    Suppresses the loading of the '~/.abclrc' startup file.");
		sb.append(sep);
		sb.append("--nosystem").append(sep).append("    Suppresses loading the 'system.lisp' customization file. ");
		sb.append(sep);
		sb.append("--eval <FORM>").append(sep).append("    Evaluates the <FORM> before initializing REPL.");
		sb.append(sep);
		sb.append("--load <FILE>").append(sep).append("    Loads the file <FILE> before initializing REPL.");
		sb.append(sep);
		sb.append("--load-system-file <FILE>").append(sep).append("    Loads the system file <FILE> before initializing REPL.");
		sb.append(sep);
		sb.append("--batch").append(sep).append("    The process evaluates forms specified by arguments and possibly by those").append(sep).append("    by those in the intialization file '~/.abcl', and then exits.");
		sb.append(sep);
		sb.append(sep);
		sb.append("The occurance of '--' copies the remaining arguments, unprocessed, into").append(sep).append("the variable EXTENSIONS:*COMMAND-LINE-ARGUMENT-LIST*.");
		sb.append(sep);

		return sb.toString();
	}

	public void kill() {
		// TODO Auto-generated method stub
		if (true)
			Errors.warn("Auto-generated method stub:  Interpreter.kill");

	}

	static public void exit(int i) {
		System.exit(i);
	}

	public void setIO(InputStream in, OutputStream out) {
		Lisp.setIO(in, out);
	}

	public static boolean isInitialized() {
		return Startup.finishedBoot_lisp;
	}

}
