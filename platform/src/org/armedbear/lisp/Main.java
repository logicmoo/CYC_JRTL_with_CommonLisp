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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess.TerminationRequest;

public final class Main extends Startup {

	public static void main(String[] args) throws InterruptedException {
		try {
			if (args == null || args.length == 0) {
				args = new String[] { "--abcl" };
				leanABCL = true;
			}

			String[] argsNew = extractOptions(Main.class, args);

			if (Startup.guiJRequested) {
				//  --guij
				Editor.main(prependArgs("--no-session", prependArgs("--force-new-instance", argsNew)));

			} else if (needIOConsole) {
				Runnable t = Interpreter.createDefaultInstance(argsNew);
				runThread(t);
			}

		} finally {
			Thread.yield();
			noExit = false;
			exit(exitCode);
		}
	}

	public static void runThread(Runnable r) {
		Thread currentThread = Thread.currentThread();
		String name = currentThread.getName();
		try {
			if (useMainThread || !Startup.needNewThread()) {

				r.run();

			} else {

				currentThread.setName("Old-" + currentThread.getName());

				Thread newThread;
				if (r instanceof Thread) {

					newThread = (Thread) r;
					newThread.setName(name);

				} else {
					newThread = new Thread(null, r, name, 1 << 30L);
				}

				newThread.start();
				newThread.join();

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

}
