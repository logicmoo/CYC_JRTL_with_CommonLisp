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

import java.io.PrintStream;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Main
{


	public static boolean noGUI = false;
	public static boolean useMainThread = false;
	/**
	 * @author Administrator
	 *
	 */
	public static final class ABCLMainUncaughtExceptionHandler implements UncaughtExceptionHandler {
		@Override
		public void uncaughtException(Thread arg0, Throwable e) {
			handleUncaught(e);
		}
	}

	static final UncaughtExceptionHandler uncaughtExceptionHandler = new ABCLMainUncaughtExceptionHandler();

	static int exitCode = 0;
	static List<Throwable> unexpectedThrowable = new ArrayList<Throwable>(0);
	public static final long startTimeMillis = System.currentTimeMillis();

	private static void reportUncaughts() {
		PrintStream err = getNoticeStream();
		if (unexpectedThrowable != null) {

			for (Iterator<Throwable> iterator = unexpectedThrowable.iterator(); iterator.hasNext();) {
				Throwable throwable = iterator.next();
				try {
					err.print("unexpectedThrowable: " + throwable);
					throwable.printStackTrace(err);
					err.flush();
				} catch (Throwable e) {
					// TODO: handle exception
				}
			}

		}
	}

	private static PrintStream getNoticeStream() {
		PrintStream err = System.err;
		if (err == null)
			err = System.out;
		return err;
	}

	private static void handleUncaught(Throwable e) {
		unexpectedThrowable.add(e);
	}



	public static void main(final String[] args) throws InterruptedException {
		// Run the interpreter in a secondary thread so we can control the stack
		// size.
		Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					Interpreter interpreter = Interpreter.createDefaultInstance(args);
					if (interpreter != null)
						interpreter.run();
				} catch (ProcessingTerminated e) {
					exitCode = e.getStatus();
					// System.exit(exitCode);
				} catch (Throwable e) {
					exitCode = 2;
					handleUncaught(e);
				}
			}
		};
		Thread t = new Thread(null, r, "interpreter", 4194304L);
		final UncaughtExceptionHandler uncaughtExceptionHandlerOrignal = t.getUncaughtExceptionHandler();
		if (uncaughtExceptionHandlerOrignal == null)
			t.setUncaughtExceptionHandler(uncaughtExceptionHandler);
		if (useMainThread) {
			t.run();
		} else {
			t.start();
			try {
				t.join();
			} catch (InterruptedException e) {
				exitCode = 3;
				handleUncaught(e);
			}
		}
		reportUncaughts();
		System.exit(exitCode);
	}
















	public static String[] extractOptions(String[] argsIn) {
		return argsIn;
	}

}
