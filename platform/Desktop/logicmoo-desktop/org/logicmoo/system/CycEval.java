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

package org.logicmoo.system;

import org.armedbear.lisp.*;
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

public final class CycEval
{

	// ### lisp-eval
	public static final SpecialOperator LISP_PROGN = new lisp_progn();

	private static final class lisp_progn extends SpecialOperator
	{
		lisp_progn()
		{
			super("lisp-progn", Lisp.PACKAGE_EXT, true, "&rest progns");
			exportInCyc(this);
		}

		@Override
		public LispObject execute(LispObject args, Environment env)
		{
			return BeanShellCntrl.lisp_eval_progn(args, env);
		}
	}

	// ### cyc-eval
	public static final SpecialOperator CYC_PROGN = new cyc_progn();

	private static final class cyc_progn extends SpecialOperator

	{
		cyc_progn()
		{
			super("cyc-progn", Lisp.PACKAGE_EXT, true, "&rest forms");
			exportInCyc(this);
		}

		@Override
		public LispObject execute(LispObject args, Environment env)

		{
			if (args == Lisp.NIL) return args;
			SubLCons cons = args.toCons();
			return apply(cons, SubLEnvironment.currentEnvironment()).toLispObject();
		}

		@Override
		public SubLObject apply(SubLCons specialForm, SubLEnvironment env)
		{
			return BeanShellCntrl.cyc_eval_progn(specialForm, env);
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

	// ### cyc-repl
	public static final Primitive CYC_REPL = new cyc_repl();

	private static final class cyc_repl extends Primitive
	{
		cyc_repl()
		{
			super("cyc-repl-old", Lisp.PACKAGE_EXT, true);
			exportInCyc(this);
		}

		@Override
		public LispObject execute()
		{
			try
			{
				return BeanShellCntrl.cyc_repl();
			} catch (Throwable e)
			{
				e.printStackTrace();
				return new JavaException(e);
			}
		}

	};

	// ### lisp-repl
	public static final lisp_repl LISP_REPL = new lisp_repl();

	public static final class lisp_repl extends Primitive
	{
		lisp_repl()
		{
			super("lisp-repl-old", Lisp.PACKAGE_EXT, true);
			exportInCyc(this);
		}

		@Override
		public LispObject execute()
		{
			return BeanShellCntrl.lisp_repl();
		}

	}

	// ### INIT-KB
	public static final INIT_KB INIT_KB = new INIT_KB();

	public static final class INIT_KB extends Primitive
	{
		INIT_KB()
		{
			super("INIT-KB-old", Lisp.PACKAGE_CYC, true);
			exportInCyc(this);
		}

		@Override
		public LispObject execute()
		{
			BeanShellCntrl.init_kb();
			return T;
		}
	}

	// ### INIT-CYC
	public static final INIT_CYC INIT_CYC = new INIT_CYC();

	public static final class INIT_CYC extends Primitive
	{
		INIT_CYC()
		{
			super("INIT-CYC-old", Lisp.PACKAGE_CYC, true);
			exportInCyc(this);
		}

		@Override
		public LispObject execute()
		{
			BeanShellCntrl.init_cyc();
			return T;
		}
	}

	// ### INIT-SUBL
	public static final INIT_SUBL INIT_SUBL = new INIT_SUBL();

	public static final class INIT_SUBL extends Primitive
	{
		INIT_SUBL()
		{
			super("INIT-SUBL-old", Lisp.PACKAGE_CYC, true);
			exportInCyc(this);
		}

		@Override
		public LispObject execute()
		{
			BeanShellCntrl.init_subl();
			return T;
		}
	}

	static public void exportInCyc(Operator cyc_progn2)
	{
		Symbol symbol = cyc_progn2.getLambdaName().toSymbol().toLispObject();
		/*		Lisp.PACKAGE_SUBLISP.importSymbol(symbol);
				Lisp.PACKAGE_CYC.importSymbol(symbol);
				Lisp.PACKAGE_EXT.importSymbol(symbol);
			*/
		Lisp.PACKAGE_SUBLISP.importSymbol(symbol);
		Lisp.PACKAGE_CYC.importSymbol(symbol);
		Lisp.PACKAGE_CYC.export(symbol);
		Lisp.PACKAGE_EXT.importSymbol(symbol);
		Lisp.PACKAGE_CL_USER.importSymbol(symbol);
	}
}