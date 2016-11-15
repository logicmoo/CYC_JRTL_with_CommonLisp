/*
 * Interpreter.java
 *
 * Copyright (C) 2002-2006 Peter Graves
 * $Id: Interpreter.java 12546 2010-03-15 16:09:42Z mevenson $
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

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class Interpreter {
	public static class UnhandledCondition extends Error {
		SubLObject condition;

		UnhandledCondition(SubLObject condition) {
			this.condition = condition;
		}

		public SubLObject getCondition() {
			return this.condition;
		}
	}

	// There can only be one interpreter.
	public static Interpreter interpreter;
	private static boolean noinit = false;
	private static boolean noinform = false;

	private static boolean topLevelInitialized;
	private static Primitive _DEBUGGER_HOOK_FUNCTION = new JavaPrimitive("%debugger-hook-function", Lisp.PACKAGE_SYS,
			false) {

		public SubLObject execute(SubLObject first, SubLObject second) throws UnhandledCondition {
			Condition condition = (Condition) first;
			if (Interpreter.interpreter == null) {
				LispThread thread = LispThread.currentThread();
				SpecialBindingsMark mark = thread.markSpecialBindings();
				thread.bindSpecial(LispSymbols.PRINT_ESCAPE, Lisp.NIL);
				try {
					SubLObject truename = LispSymbols.LOAD_TRUENAME.symbolValue(thread);
					if (truename != Lisp.NIL) {
						SubLObject stream = Lisp._LOAD_STREAM_.symbolValue(thread);
						if (stream instanceof LispStream) {
							int lineNumber = ((LispStream) stream).getLineNumber() + 1;
							int offset = ((LispStream) stream).getOffset();
							Debug.trace("Error loading " + truename.writeToString() + " at line " + lineNumber
									+ " (offset " + offset + ")");
						}
					}
					Debug.trace("Encountered unhandled condition of type " + condition.typeOf().writeToString() + ':');
					Debug.trace("  " + condition.writeToString());
				} catch (Throwable t) {
				} // catch any exception to throw below
				finally {
					thread.resetSpecialBindings(mark);
				}
			}
			throw new UnhandledCondition(condition);
		}
	};

	private static String build;

	static {
		String s = null;
		InputStream in = Interpreter.class.getResourceAsStream("build");
		if (in != null)
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(in));
				s = reader.readLine();
				reader.close();
			} catch (IOException e) {
			}
		Interpreter.build = s;
	}

	private static String banner() {
		String sep = System.getProperty("line.separator");
		StringBuilder sb = new StringBuilder("Armed Bear Common Lisp ");
		sb.append(Version.getVersion());
		if (Interpreter.build != null) {
			sb.append(" (built ");
			sb.append(Interpreter.build);
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

	public static synchronized Interpreter createDefaultInstance(String[] args) {
		if (Interpreter.interpreter == null)
			// return null;
			Interpreter.interpreter = new Interpreter();

		if (args != null)
			Interpreter.preprocessCommandLineArguments(args);
		if (!Interpreter.noinform) {
			LispStream out = Lisp.getStandardOutput();
			out._writeString(Interpreter.banner());
			out._finishOutput();
		}
		if (Interpreter.noinform)
			Lisp._NOINFORM_.setSymbolValue(Lisp.T);
		else {
			double uptime = (System.currentTimeMillis() - Main.startTimeMillis) / 1000.0;
			Lisp.getStandardOutput()._writeString("Low-level initialization completed in " + uptime + " seconds.\n");
		}
		Interpreter.initializeLisp();
		Interpreter.initializeTopLevel();
		if (!Interpreter.noinit)
			Interpreter.processInitializationFile();
		if (args != null)
			Interpreter.postprocessCommandLineArguments(args);

		return Interpreter.interpreter;
	}

	// Interface.
	public static synchronized Interpreter createInstance() {
		if (Interpreter.interpreter != null)
			return null;
		Interpreter.interpreter = new Interpreter();
		Lisp._NOINFORM_.setSymbolValue(Lisp.T);
		Interpreter.initializeLisp();
		return Interpreter.interpreter;
	}

	public static synchronized Interpreter createJLispInstance(InputStream in, OutputStream out,
			String initialDirectory, String version) {
		if (Interpreter.interpreter != null)
			return null;
		Interpreter.interpreter = new Interpreter(in, out, initialDirectory);

		LispStream stdout = Lisp.getStandardOutput();
		stdout._writeLine(version);
		stdout._writeString(Interpreter.banner());
		stdout._finishOutput();

		Interpreter.initializeJLisp();
		Interpreter.initializeTopLevel();
		Interpreter.processInitializationFile();
		return Interpreter.interpreter;
	}

	// For j.
	/**
	 * Runs its input string through the lisp reader and evaluates the result.
	 *
	 * @param s
	 *            A string with a valid Common Lisp expression
	 * @return The result of the evaluation
	 * @exception UnhandledCondition
	 *                in case the an error occurs which should be passed to the
	 *                Lisp debugger
	 */
	public static SubLObject evaluate(String s) {
		if (!Lisp.initialized)
			Interpreter.initializeJLisp();
		StringInputStream stream = new StringInputStream(s);
		LispThread thread = LispThread.currentThread();
		SubLObject obj = stream.read(false, Lisp.EOF, false, thread);
		if (obj == Lisp.EOF)
			return Lisp.error(new EndOfFile(stream));
		SpecialBindingsMark mark = thread.markSpecialBindings();
		thread.bindSpecial(LispSymbols.DEBUGGER_HOOK, Interpreter._DEBUGGER_HOOK_FUNCTION);
		try {
			return Lisp.eval(obj, new Environment(), thread);
		} finally {
			thread.resetSpecialBindings(mark);
		}
	}

	public static synchronized Interpreter getInstance() {
		return Interpreter.interpreter;
	}

	public static boolean initialized() {
		return Interpreter.interpreter != null;
	}

	public static synchronized void initializeJLisp() {
		if (!Lisp.initialized) {
			LispSymbols.FEATURES
					.setSymbolValue(LispObjectFactory.makeCons(Keyword.J, LispSymbols.FEATURES.getSymbolValue()));
			Load.loadSystemFile("boot.lisp", false, false, false);

			try {
				Class.forName("org.armedbear.j.LispAPI");
			} catch (ClassNotFoundException e) {
			} // FIXME: what to do?

			Load.loadSystemFile("j.lisp");

			Lisp.initialized = true;
		}
	}

	public static synchronized void initializeLisp() {
		if (!Lisp.initialized) {
			boolean b = Main.isSubLisp;
			try {
				Main.isSubLisp = false;
				Load.loadSystemFile("boot.lisp", false, false, false);
			} finally {
				Main.isSubLisp = b;
			}
			Lisp.initialized = true;
		}
	}

	private static synchronized void initializeTopLevel() {
		if (!Interpreter.topLevelInitialized) {
			// Resolve top-level-loop autoload.
			SubLSymbol TOP_LEVEL_LOOP = Lisp.intern("TOP-LEVEL-LOOP", Lisp.PACKAGE_TPL);
			SubLObject tplFun = TOP_LEVEL_LOOP.getSymbolFunction();
			if (tplFun instanceof Autoload) {
				Autoload autoload = (Autoload) tplFun;
				autoload.load();
			}

			Interpreter.topLevelInitialized = true;
		}
	}

	// Do the --load and --eval actions.
	private static void postprocessCommandLineArguments(String[] args)

	{
		if (args != null)
			for (int i = 0; i < args.length; ++i) {
				String arg = args[i];
				if (arg.equals("--eval")) {
					if (i + 1 < args.length) {
						try {
							Interpreter.evaluate(args[i + 1]);
						} catch (UnhandledCondition c) {
							String separator = System.getProperty("line.separator");
							StringBuilder sb = new StringBuilder();
							sb.append(separator);
							sb.append("Caught ");
							sb.append(c.getCondition().typeOf().writeToString());
							sb.append(" while processing --eval option \"" + args[i + 1] + "\":");
							sb.append(separator);
							sb.append("  ");
							LispThread thread = LispThread.currentThread();
							thread.bindSpecial(LispSymbols.PRINT_ESCAPE, Lisp.NIL);
							sb.append(c.getCondition().writeToString());
							sb.append(separator);
							System.err.print(sb.toString());
							System.exit(2);
						}
						++i;
					} else {
						// Shouldn't happen.
						System.err.println("No argument supplied to --eval");
						System.exit(1);
					}
				} else if (arg.equals("--load") || arg.equals("--load-system-file"))
					if (i + 1 < args.length) {
						if (arg.equals("--load"))
							Load.load(new Pathname(args[i + 1]), false, false, true);

						else
							Load.loadSystemFile(args[i + 1]);
						++i;
					} else {
						// Shouldn't happen.
						System.err.println("No argument supplied to --load");
						System.exit(1);
					}
			}
	}

	// Check for --noinit; verify that arguments are supplied for --load and
	// --eval options. Copy all unrecognized arguments into
	// ext:*command-line-argument-list*
	private static void preprocessCommandLineArguments(String[] args)

	{
		SubLObject arglist = Lisp.NIL;

		if (args != null)
			for (int i = 0; i < args.length; ++i) {
				String arg = args[i];
				if (arg.equals("--noinit"))
					Interpreter.noinit = true;
				else if (arg.equals("--noinform"))
					Interpreter.noinform = true;
				else if (arg.equals("--batch"))
					Lisp._BATCH_MODE_.setSymbolValue(Lisp.T);
				else if (arg.equals("--eval")) {
					if (i + 1 < args.length)
						++i;
					else {
						System.err.println("No argument supplied to --eval");
						System.exit(1);
					}
				} else if (arg.equals("--load") || arg.equals("--load-system-file")) {
					if (i + 1 < args.length)
						++i;
					else {
						System.err.println("No argument supplied to --load");
						System.exit(1);
					}
				} else
					arglist = LispObjectFactory.makeCons(args[i], arglist);
			}
		arglist.nreverse();

		Lisp._COMMAND_LINE_ARGUMENT_LIST_.setSymbolValue(arglist);
	}

	private static synchronized void processInitializationFile() {
		try {
			String userHome = System.getProperty("user.home");
			File file = new File(userHome, ".abclrc");
			if (file.isFile()) {
				Load.load(file.getCanonicalPath());
				return;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static SubLObject readFromString(String s) {
		return new StringInputStream(s).read(true, Lisp.NIL, false, LispThread.currentThread());
	}

	private static void reportError(ControlTransfer c, LispThread thread) {
		Lisp.getStandardInput().clearInput();
		LispStream out = Lisp.getStandardOutput();
		out.freshLine();
		Condition condition = (Condition) c.getCondition();
		out._writeLine("Error: unhandled condition: " + condition.writeToString());
		if (thread != null)
			thread.printBacktrace();
	}

	private static void reportError(UnhandledCondition c, LispThread thread) {
		Lisp.getStandardInput().clearInput();
		LispStream out = Lisp.getStandardOutput();
		out.freshLine();
		Condition condition = (Condition) c.getCondition();
		out._writeLine("Error: unhandled condition: " + condition.writeToString());
		if (thread != null)
			thread.printBacktrace();
	}

	private boolean jlisp;

	private InputStream inputStream;

	private OutputStream outputStream;

	private Interpreter() {
		this.jlisp = false;
		this.inputStream = null;
		this.outputStream = null;
	}

	private Interpreter(InputStream inputStream, OutputStream outputStream, String initialDirectory) {
		this.jlisp = true;
		this.inputStream = inputStream;
		this.outputStream = outputStream;
		Lisp.resetIO(LispObjectFactory.makeStream(LispSymbols.SYSTEM_STREAM, inputStream, LispSymbols.CHARACTER),
				LispObjectFactory.makeStream(LispSymbols.SYSTEM_STREAM, outputStream, LispSymbols.CHARACTER));
		if (!initialDirectory.endsWith(File.separator))
			initialDirectory = initialDirectory.concat(File.separator);
		LispSymbols.DEFAULT_PATHNAME_DEFAULTS.setSymbolValue(new Pathname(initialDirectory));
	};

	public synchronized void dispose() {
		Debug.trace("Interpreter.dispose");
		Debug.assertTrue(Interpreter.interpreter == this);
		Interpreter.interpreter = null;
	}

	// Interface.
	public SubLObject eval(String s) {
		return Lisp.eval(new StringInputStream(s).read(true, Lisp.NIL, false, LispThread.currentThread()));
	}

	protected void finalize() throws Throwable {
		System.err.println("Interpreter.finalize");
	}

	public void kill() {
		this.kill(0);
	}

	public void kill(int status) {
		if (this.jlisp) {
			try {
				this.inputStream.close();
			} catch (IOException e) {
				Debug.trace(e);
			}
			try {
				this.outputStream.close();
			} catch (IOException e) {
				Debug.trace(e);
			}
		} else
			System.exit(status);
	}

	public void run() {
		LispThread thread = LispThread.currentThread();
		try {
			SubLSymbol TOP_LEVEL_LOOP = Lisp.intern("TOP-LEVEL-LOOP", Lisp.PACKAGE_TPL);
			SubLObject tplFun = TOP_LEVEL_LOOP.getSymbolFunction();
			if (tplFun instanceof Function) {
				thread.execute(tplFun);
				return;
			}
			// We only arrive here if something went wrong and we weren't able
			// to load top-level.lisp and run the normal top-level loop.
			LispStream out = Lisp.getStandardOutput();
			while (true)
				try {
					thread.resetStack();
					thread.clearSpecialBindings();
					out._writeString("* ");
					out._finishOutput();
					SubLObject object = Lisp.getStandardInput().read(false, Lisp.EOF, false, thread);
					if (object == Lisp.EOF)
						break;
					out.setCharPos(0);
					LispSymbols.MINUS.setSymbolValue(object);
					SubLObject result = Lisp.eval(object, new Environment(), thread);
					Debug.assertTrue(result != null);
					LispSymbols.STAR_STAR_STAR.setSymbolValue(LispSymbols.STAR_STAR.getSymbolValue());
					LispSymbols.STAR_STAR.setSymbolValue(LispSymbols.STAR.getSymbolValue());
					LispSymbols.STAR.setSymbolValue(result);
					LispSymbols.PLUS_PLUS_PLUS.setSymbolValue(LispSymbols.PLUS_PLUS.getSymbolValue());
					LispSymbols.PLUS_PLUS.setSymbolValue(LispSymbols.PLUS.getSymbolValue());
					LispSymbols.PLUS.setSymbolValue(LispSymbols.MINUS.getSymbolValue());
					out = Lisp.getStandardOutput();
					out.freshLine();
					SubLObject[] values = thread.getValues();
					LispSymbols.SLASH_SLASH_SLASH.setSymbolValue(LispSymbols.SLASH_SLASH.getSymbolValue());
					LispSymbols.SLASH_SLASH.setSymbolValue(LispSymbols.SLASH.getSymbolValue());
					if (values != null) {
						SubLObject slash = Lisp.NIL;
						for (int i = values.length; i-- > 0;)
							slash = LispObjectFactory.makeCons(values[i], slash);
						LispSymbols.SLASH.setSymbolValue(slash);
						for (int i = 0; i < values.length; i++)
							out._writeLine(values[i].writeToString());
					} else {
						LispSymbols.SLASH.setSymbolValue(LispObjectFactory.makeCons(result));
						out._writeLine(result.writeToString());
					}
					out._finishOutput();
				} catch (StackOverflowError e) {
					e.printStackTrace();
					Lisp.getStandardInput().clearInput();
					out._writeLine("Stack overflow");
				} catch (ControlTransfer c) {
					// We're on the toplevel, if this occurs,
					// we're toast...
					Interpreter.reportError(c, thread);
				} catch (Throwable t) {
					Lisp.getStandardInput().clearInput();
					out.printStackTrace(t);
					thread.printBacktrace();
				}
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
}
