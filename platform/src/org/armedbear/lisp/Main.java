/*
 * Main.java
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

import java.lang.Thread.UncaughtExceptionHandler;

import org.armedbear.j.Editor;
import org.logicmoo.system.JVMImpl;
import org.logicmoo.system.Startup;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess.TerminationRequest;

public final class Main extends Startup {

	public static void main(String[] args) throws InterruptedException {
		if (args == null || args.length == 0) {
			args = new String[] { "--abcl" };
		}
		String[] argsNew = extractOptions(Main.class, args);
		if (jlisp && guiRequested) {
			Editor.main(prependArgs("--no-session", prependArgs("--force-new-instance", argsNew)));
			return;
		}
		try {
			if (needIOConsole) {
				needIOConsole = false;
				noExit = false;
				Runnable t = mainUnjoined(argsNew);
				runThread(Main.class.getName(), t);
			} else {
				Thread.yield();
			}
		} finally {
			exit(exitCode);
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param t
	 */
	public static void runThread(String name, Runnable r) {
		// TODO Auto-generated method stub
		Thread t = new Thread(null, r, name, 1 << 30L);//.asJavaTread();
		final UncaughtExceptionHandler uncaughtExceptionHandlerOrignal = t.getUncaughtExceptionHandler();
		if (uncaughtExceptionHandlerOrignal == null)
			t.setUncaughtExceptionHandler(uncaughtExceptionHandler);
		runThread(t);
	}

	public static Runnable mainUnjoined(final String[] args) throws InterruptedException {
		// Run the interpreter in a secondary thread so we can control the stack
		// size.
		// Lisp.checkOutput(Symbol.STANDARD_OUTPUT,Lisp.stdout);
		Runnable r = mainRunnable(args, new Runnable() {
			@Override
			public void run() {
				Interpreter interpreter = Interpreter.getInstance();
				interpreter.run();
			}
		});

		return r;
	}

	public static void runThread(Thread t) {
		try {
			if (useMainThread) {
				t.run();
			} else {
				final Thread currentThread = Thread.currentThread();
				currentThread.setName("Old-" + currentThread.getName());
				t.setName("main");
				t.start();
				t.join();
			}
		} catch (InterruptedException e) {
			exitCode = 3;
			addUncaught(e);
		} catch (TerminationRequest e) {
			exitCode = 0;
		} catch (Throwable e) {
			exitCode = 1;
			addUncaught(e);
		} finally {
			Startup.reportUncaughts();
		}
	}

	public static Runnable mainRunnable(final String[] args, Runnable after) {
		globalContext.set(true);

		return new Runnable()// SubLProcess("main")
		{
			@Override
			public void run() {
				boolean wasSubLisp = isSubLisp();
				try {
					try {

						// File initialDir = new File("./");
						Interpreter.createDefaultInstance(args);

						/*
						 * Interpreter interpreter = Interpreter.createNewLispInstance(SystemCurrent.in,
						 * SystemCurrent.out, initialDir.getCanonicalPath(),
						 * Version.getLongVersionString());
						 */
						if (after != null)
							after.run();
					} catch (ProcessingTerminated e) {
						Lisp.exit(e.getStatus());
					} catch (Throwable e) {
						throw JVMImpl.doThrow(e);
					}
				} finally {
					setSubLisp(wasSubLisp);
				}
			}
		};
	}

}
