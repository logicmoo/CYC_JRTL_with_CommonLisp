/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class thread_macros extends SubLTranslatedFile {

	//// Constructor

	public static SubLFile me = new thread_macros();

	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.thread_macros";
	public static SubLList $list0 = ConsesLow.list(
			ConsesLow.list(SubLObjectFactory.makeSymbol("LOCK"), SubLObjectFactory.makeSymbol("&KEY"),
					ConsesLow.list(SubLObjectFactory.makeSymbol("WHOSTATE"),
							SubLObjectFactory.makeString("Seize lock"))),
			SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));

	//// Definitions

	public static SubLList $list1 = ConsesLow.list(SubLObjectFactory.makeKeyword("WHOSTATE"));

	public static SubLSymbol $kw2$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");

	public static SubLSymbol $kw3$WHOSTATE = SubLObjectFactory.makeKeyword("WHOSTATE");

	public static SubLString $str4$Seize_lock = SubLObjectFactory.makeString("Seize lock");

	public static SubLString $str5$LOCK = SubLObjectFactory.makeString("LOCK");

	//// Internal Constants

	public static SubLString $str6$RELEASE = SubLObjectFactory.makeString("RELEASE");
	public static SubLSymbol $sym7$CLET = SubLObjectFactory.makeSymbol("CLET");
	public static SubLList $list8 = ConsesLow.list(CommonSymbols.NIL);
	public static SubLSymbol $sym9$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
	public static SubLSymbol $sym10$PROGN = SubLObjectFactory.makeSymbol("PROGN");
	public static SubLSymbol $sym11$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
	public static SubLSymbol $sym12$SEIZE_LOCK = SubLObjectFactory.makeSymbol("SEIZE-LOCK");
	public static SubLSymbol $sym13$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
	public static SubLSymbol $sym14$RELEASE_LOCK = SubLObjectFactory.makeSymbol("RELEASE-LOCK");

	public static SubLObject declare_thread_macros_file() {
		SubLFiles.declareMacro(thread_macros.myName, "with_lock_held", "WITH-LOCK-HELD");
		SubLFiles.declareFunction(thread_macros.myName, "with_lock_held_internal", "WITH-LOCK-HELD-INTERNAL", 3, 0,
				false);
		return CommonSymbols.NIL;
	}

	public static SubLObject init_thread_macros_file() {
		return CommonSymbols.NIL;
	}

	public static SubLObject setup_thread_macros_file() {
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/thread-macros.lisp", position = 709)
	public static SubLObject with_lock_held(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, thread_macros.$list0);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject lock = CommonSymbols.NIL;
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, thread_macros.$list0);
					lock = current.first();
					current = current.rest();
					{
						SubLObject allow_other_keys_p = CommonSymbols.NIL;
						SubLObject rest = current;
						SubLObject bad = CommonSymbols.NIL;
						SubLObject current_1 = CommonSymbols.NIL;
						for (; CommonSymbols.NIL != rest;) {
							cdestructuring_bind.destructuring_bind_must_consp(rest, datum, thread_macros.$list0);
							current_1 = rest.first();
							rest = rest.rest();
							cdestructuring_bind.destructuring_bind_must_consp(rest, datum, thread_macros.$list0);
							if (CommonSymbols.NIL == conses_high.member(current_1, thread_macros.$list1,
									CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED))
								bad = CommonSymbols.T;
							if (current_1 == thread_macros.$kw2$ALLOW_OTHER_KEYS)
								allow_other_keys_p = rest.first();
							rest = rest.rest();
						}
						if (CommonSymbols.NIL != bad && CommonSymbols.NIL == allow_other_keys_p)
							cdestructuring_bind.cdestructuring_bind_error(datum, thread_macros.$list0);
						{
							SubLObject whostate_tail = cdestructuring_bind
									.property_list_member(thread_macros.$kw3$WHOSTATE, current);
							SubLObject whostate = CommonSymbols.NIL != whostate_tail
									? (SubLObject) conses_high.cadr(whostate_tail) : thread_macros.$str4$Seize_lock;
							current = temp;
							{
								SubLObject body = current;
								return thread_macros.with_lock_held_internal(lock, whostate, body);
							}
						}
					}
				}
			}
		}
	}

	@SubL(source = "sublisp/thread-macros.lisp", position = 1088)
	public static SubLObject with_lock_held_internal(SubLObject lock, SubLObject whostate, SubLObject body) {
		{
			SubLObject lock_var = Symbols.make_symbol(thread_macros.$str5$LOCK);
			SubLObject release_var = Symbols.make_symbol(thread_macros.$str6$RELEASE);
			return ConsesLow.list(thread_macros.$sym7$CLET,
					ConsesLow.list(ConsesLow.list(lock_var, lock), reader.bq_cons(release_var, thread_macros.$list8)),
					ConsesLow.list(thread_macros.$sym9$CUNWIND_PROTECT,
							ConsesLow.listS(thread_macros.$sym10$PROGN,
									ConsesLow.list(thread_macros.$sym11$CSETQ, release_var,
											ConsesLow.list(thread_macros.$sym12$SEIZE_LOCK, lock_var)),
									ConsesLow.append(body, CommonSymbols.NIL)),
							ConsesLow.list(thread_macros.$sym13$PWHEN, release_var,
									ConsesLow.list(thread_macros.$sym14$RELEASE_LOCK, lock_var))));
		}
	}

	private thread_macros() {
	}

	//// Initializers

	public void declareFunctions() {
		thread_macros.declare_thread_macros_file();
	}

	public void initializeVariables() {
		thread_macros.init_thread_macros_file();
	}

	public void runTopLevelForms() {
		thread_macros.setup_thread_macros_file();
	}

}
