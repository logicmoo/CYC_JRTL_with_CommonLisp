/*
 * Primitives.java
 *
 * Copyright (C) 2002-2007 Peter Graves
 * Copyright (C) 2011 Erik Huelsmann
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
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
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

import static org.armedbear.lisp.Lisp.PACKAGE_CL;
import static org.armedbear.lisp.Lisp.PACKAGE_CL_USER;
import static org.armedbear.lisp.Lisp.PACKAGE_CYC;
import static org.armedbear.lisp.Lisp.PACKAGE_EXT;
import static org.armedbear.lisp.Lisp.PACKAGE_JAVA;
import static org.armedbear.lisp.Lisp.PACKAGE_SUBLISP;

import org.logicmoo.system.BeanShellCntrl.LispMethod;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Resourcer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLListListIterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLReader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.ui.SubLReaderPanel;

public final class CycEval {


	public static void cycSeesCL() {
		PACKAGE_CYC.unusePackage(PACKAGE_SUBLISP);
		PACKAGE_CYC.usePackage(PACKAGE_JAVA, true);
		PACKAGE_CYC.usePackage(PACKAGE_EXT, true);
		PACKAGE_CYC.usePackage(PACKAGE_CL, true);
		PACKAGE_CYC.usePackage(PACKAGE_CL_USER, true);
		PACKAGE_CYC.usePackage(PACKAGE_SUBLISP, true);
	}

	/**
	 *
	 */
	public static void clSeesCyc() {
		//SubLPackage.setCurrentPackage(Lisp.PACKAGE_CL_USER);
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
	//	if(true) return ;
	}

	// ### cyc-eval
	public static final SpecialOperator CYC_EVAL = new cyc_eval();

	private static final class cyc_eval extends SpecialOperator

	{
		cyc_eval() {
			super("cyc-eval", Lisp.PACKAGE_EXT, true, "&rest forms");
			exportInCyc(this);
		}

		@Override
		public LispObject execute(LispObject args, Environment env)

		{
			if (args == Lisp.NIL)
				return args;
			SubLCons cons = args.toCons();
			return apply(cons, SubLEnvironment.currentEnvironment()).toLispObject();
		}

		public SubLObject apply(SubLCons specialForm, SubLEnvironment env) {
			SubLListListIterator iter = null;
			Resourcer resourcer = Resourcer.getInstance();
			try {
				iter = resourcer.acquireSubLListListIterator(specialForm, 1);
				return SubLSpecialOperatorDeclarations.list_progn(iter, env);
			} finally {
				resourcer.releaseSubLListListIterator(iter);
			}

		}

//
//		@Override
//		public SubLOperator toSubLObject() {
//			return new WasLispSpecialOperator(this) {
//				public SubLObject apply(SubLCons specialForm, SubLEnvironment env) {
//					SubLListListIterator iter = null;
//					Resourcer resourcer = Resourcer.getInstance();
//					try {
//						iter = resourcer.acquireSubLListListIterator(specialForm, 1);
//						return SubLSpecialOperatorDeclarations.list_progn(iter, env);
//					} finally {
//						resourcer.releaseSubLListListIterator(iter);
//					}
//
//				}
//
//			};
//		}
	}

	// ### lisp-eval
	public static final SpecialOperator LISP_EVAL = new lisp_eval();

	private static final class lisp_eval extends SpecialOperator {
		lisp_eval() {
			super("lisp-eval", Lisp.PACKAGE_EXT, true, "&rest progns");
			exportInCyc(this);
		}

		@Override
		public LispObject execute(LispObject args, Environment env) {
			LispThread thread = LispThread.currentThread();
			return Lisp.progn(args, env, thread);
		}
	}

	// ### cyc-repl
	public static final Primitive CYC_REPL = new cyc_repl();

	private static final class cyc_repl extends Primitive {
		cyc_repl() {
			super("cyc-repl", Lisp.PACKAGE_EXT, true);
			exportInCyc(this);
		}

		@Override
		public LispObject execute() {
			boolean wasSubLisp = Main.isSubLisp();
			Main.setSubLisp(true);
			SubLMain.shouldRunInBackground = true;
			SubLMain me = SubLMain.me;
			SubLMain.initializeSubL(new String[0]);
			SubLReader SLR = SubLMain.getMainReader();
			if(SLR==null  ) {
				SLR = new SubLReader();
				SubLMain.setMainReader(SLR);
			}
			boolean  b = SubLMain.isFullyInitialized();
			if(!b) {
				ensureSubLReady();
			}

			boolean wasQuitOnExit = SLR.quitOnExit;
			boolean was_shouldReadloopExit = SLR.shouldReadloopExit;
			SLR.quitOnExit = false;
			SLR.shouldReadloopExit = false;
			try {
				if (false && SubLMain.shouldRunReadloopInGUI())
					SubLMain.setMainReader(SubLReaderPanel.startReadloopWindow());
				SLR.setThread(SubLProcess.currentSubLThread());
				while (!SLR.shouldReadloopExit()) {
					SLR.doReadLoop();
				}
			} finally {
				SLR.quitOnExit = wasQuitOnExit;
				SLR.shouldReadloopExit = was_shouldReadloopExit;
				Main.setSubLisp(wasSubLisp);
			}
			return Lisp.T;
		}

	};
	synchronized static public void ensureSubLReady() {
		boolean  b = SubLMain.isInitialized();
		if(b) {
			return;
		}
		SubLMain.shouldRunInBackground = true;
		SubLMain me = SubLMain.me;
		SubLMain.initializeSubL(new String[0]);
		if(!SubLMain.noInitCyc) SubLMain.initializeTranslatedSystems();
		SubLMain.setIsInitialized();
	}

	// ### lisp-repl
	public static final lisp_repl LISP_REPL = new lisp_repl();

	public static final class lisp_repl extends Primitive {
		lisp_repl() {
			super("lisp-repl", Lisp.PACKAGE_EXT, true);
			exportInCyc(this);
		}

		@Override
		public LispObject execute() {
			boolean wasSubLisp = Main.isSubLisp();
			Main.setSubLisp(false);
			if(wasSubLisp) {
				clSeesCyc();
		    	cycSeesCL();
			}
			try {
				return Lisp.PACKAGE_TPL.findAccessibleSymbol("TOP-LEVEL-LOOP").execute();
			} finally {
				Main.setSubLisp(wasSubLisp);
			}
		}

	}

	// ### INIT-KB
	public static final INIT_KB INIT_KB = new INIT_KB();

	public static final class INIT_KB extends Primitive {
		INIT_KB() {
			super("INIT-KB", Lisp.PACKAGE_CYC, true);
			exportInCyc(this);
		}

		@Override
		public LispObject execute() {
			boolean wasSubLisp = Main.isSubLisp();
			Main.setSubLisp(true);
			try {
				SubLPackage prevPackage = SubLPackage.getCurrentPackage();
				try {
					SubLPackage.setCurrentPackage(Lisp.PACKAGE_SUBLISP);
					SubLMain.handleInits();
				} catch (Exception e) {
					e.printStackTrace();
					//me.doSystemCleanupAndExit(-1);
				} finally {

					SubLPackage.setCurrentPackage(prevPackage);
				}
			} finally {
				Main.setSubLisp(wasSubLisp);
			}
			return T;
		}
	}


	// ### INIT-CYC
	public static final INIT_CYC INIT_CYC = new INIT_CYC();

	public static final class INIT_CYC extends Primitive {
		INIT_CYC() {
			super("INIT-CYC", Lisp.PACKAGE_CYC, true);
			exportInCyc(this);
		}

		@Override
		public LispObject execute() {
			boolean wasSubLisp = Main.isSubLisp();
			Main.setSubLisp(true);
			try {
				SubLPackage.reserveSubLispSymbols();
				SubLMain.initializeSubL(new String[0]);
				Lisp.PACKAGE_SYS.ALLOW_INHERIT_CONFLICTS = true;
				Lisp.PACKAGE_EXT.ALLOW_INHERIT_CONFLICTS = true;
				Lisp.PACKAGE_CL.ALLOW_INHERIT_CONFLICTS = true;
				Lisp.PACKAGE_CL_USER.ALLOW_INHERIT_CONFLICTS = true;
				SubLPackage prevPackage = SubLPackage.getCurrentPackage();
				try {
					SubLPackage.setCurrentPackage(Lisp.PACKAGE_SUBLISP);
					SubLMain.initializeTranslatedSystems();
				} catch (Exception e) {
					e.printStackTrace();
					//me.doSystemCleanupAndExit(-1);
				} finally {

					SubLPackage.setCurrentPackage(prevPackage);
				}
			} finally {
				Main.setSubLisp(wasSubLisp);
			}
			return T;
		}
	}

	// ### INIT-SUBL
	public static final INIT_SUBL INIT_SUBL = new INIT_SUBL();

	public static final class INIT_SUBL extends Primitive {
		INIT_SUBL() {
			super("INIT-SUBL", Lisp.PACKAGE_CYC, true);
			exportInCyc(this);
		}

		@Override
		public LispObject execute() {
			boolean wasSubLisp = Main.isSubLisp();
			Main.setSubLisp(true);
			try {
				SubLPackage.reserveSubLispSymbols();
				SubLMain.initializeSubL(new String[0]);
			} finally {
				Main.setSubLisp(wasSubLisp);
			}
			return T;
		}
	}

	static public void exportInCyc(Operator cyc_eval2) {
		Symbol symbol = cyc_eval2.getLambdaName().toSymbol().toLispObject();
		Lisp.PACKAGE_SUBLISP.importSymbol(symbol);
		Lisp.PACKAGE_CYC.importSymbol(symbol);
		Lisp.PACKAGE_EXT.importSymbol(symbol);
}
}