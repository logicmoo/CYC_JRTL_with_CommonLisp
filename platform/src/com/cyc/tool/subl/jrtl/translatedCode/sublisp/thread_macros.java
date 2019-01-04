//
// For LarKC
//
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class thread_macros extends SubLTranslatedFile {
	public static SubLObject declare_thread_macros_file() {
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.thread_macros", "with_lock_held",
				"WITH-LOCK-HELD");
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.thread_macros",
				"with_lock_held_internal", "WITH-LOCK-HELD-INTERNAL", 3, 0, false);
		return SubLNil.NIL;
	}

	public static SubLObject init_thread_macros_file() {
		return SubLNil.NIL;
	}

	public static SubLObject setup_thread_macros_file() {
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/thread-macros.lisp", position = 709L)
	public static SubLObject with_lock_held(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, thread_macros.$list0);
		SubLObject temp = current.rest();
		current = current.first();
		SubLObject lock = SubLNil.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, thread_macros.$list0);
		lock = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = SubLNil.NIL;
		SubLObject rest = current;
		SubLObject bad = SubLNil.NIL;
		SubLObject current_$1 = SubLNil.NIL;
		while (SubLNil.NIL != rest) {
			cdestructuring_bind.destructuring_bind_must_consp(rest, datum, thread_macros.$list0);
			current_$1 = rest.first();
			rest = rest.rest();
			cdestructuring_bind.destructuring_bind_must_consp(rest, datum, thread_macros.$list0);
			if (SubLNil.NIL == conses_high.member(current_$1, thread_macros.$list1, CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED))
				bad = CommonSymbols.T;
			if (current_$1 == thread_macros.$kw2$ALLOW_OTHER_KEYS)
				allow_other_keys_p = rest.first();
			rest = rest.rest();
		}
		if (SubLNil.NIL != bad && SubLNil.NIL == allow_other_keys_p)
			cdestructuring_bind.cdestructuring_bind_error(datum, thread_macros.$list0);
		SubLObject whostate_tail = cdestructuring_bind.property_list_member(thread_macros.$kw3$WHOSTATE, current);
		SubLObject whostate = SubLNil.NIL != whostate_tail ? conses_high.cadr(whostate_tail)
				: thread_macros.$str4$Seize_lock;
		SubLObject body;
		current = body = temp;
		return with_lock_held_internal(lock, whostate, body);
	}

	@SubL(source = "sublisp/thread-macros.lisp", position = 1088L)
	public static SubLObject with_lock_held_internal(SubLObject lock, SubLObject whostate, SubLObject body) {
		if (!whostate.isAtom()) {
			SubLObject whostate_var = Symbols.make_symbol(thread_macros.$str5$WHOSTATE);
			return ConsesLow.list(thread_macros.$sym6$CLET, ConsesLow.list(ConsesLow.list(whostate_var, whostate)),
					with_lock_held_internal(lock, whostate_var, body));
		}
		if (!lock.isAtom()) {
			SubLObject lock_var = Symbols.make_symbol(thread_macros.$str7$LOCK);
			return ConsesLow.list(thread_macros.$sym6$CLET, ConsesLow.list(ConsesLow.list(lock_var, lock)),
					with_lock_held_internal(lock_var, whostate, body));
		}
		SubLObject release_var = Symbols.make_symbol(thread_macros.$str8$RELEASE);
		return ConsesLow.listS(thread_macros.$sym6$CLET,
				ConsesLow.list(reader.bq_cons(release_var, thread_macros.$list9)),
				ConsesLow.append(SubLNil.NIL != whostate
						? ConsesLow.list(
								ConsesLow.list(thread_macros.$sym10$IGNORE, whostate))
						: SubLNil.NIL,
						ConsesLow.list(ConsesLow.list(thread_macros.$sym11$CUNWIND_PROTECT,
								ConsesLow.listS(thread_macros.$sym12$PROGN,
										ConsesLow.list(thread_macros.$sym13$CSETQ, release_var,
												ConsesLow.list(thread_macros.$sym14$SEIZE_LOCK, lock)),
										ConsesLow.append(body, SubLNil.NIL)),
								ConsesLow.list(thread_macros.$sym15$PWHEN, release_var,
										ConsesLow.list(thread_macros.$sym16$RELEASE_LOCK, lock))))));
	}

	public static SubLFile me;
	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.thread_macros";
	private static SubLList $list0;
	private static SubLList $list1;
	private static SubLSymbol $kw2$ALLOW_OTHER_KEYS;
	private static SubLSymbol $kw3$WHOSTATE;
	private static SubLString $str4$Seize_lock;
	private static SubLString $str5$WHOSTATE;
	private static SubLSymbol $sym6$CLET;
	private static SubLString $str7$LOCK;
	private static SubLString $str8$RELEASE;
	private static SubLList $list9;
	private static SubLSymbol $sym10$IGNORE;
	private static SubLSymbol $sym11$CUNWIND_PROTECT;
	private static SubLSymbol $sym12$PROGN;
	private static SubLSymbol $sym13$CSETQ;
	private static SubLSymbol $sym14$SEIZE_LOCK;
	private static SubLSymbol $sym15$PWHEN;
	private static SubLSymbol $sym16$RELEASE_LOCK;
	static {
		me = new thread_macros();
		$list0 = ConsesLow.list(
				ConsesLow.list(SubLObjectFactory.makeSymbol("LOCK"), SubLObjectFactory.makeSymbol("&KEY"),
						ConsesLow.list(SubLObjectFactory.makeSymbol("WHOSTATE"),
								SubLObjectFactory.makeString("Seize lock"))),
				SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
		$list1 = ConsesLow.list(SubLObjectFactory.makeKeyword("WHOSTATE"));
		$kw2$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
		$kw3$WHOSTATE = SubLObjectFactory.makeKeyword("WHOSTATE");
		$str4$Seize_lock = SubLObjectFactory.makeString("Seize lock");
		$str5$WHOSTATE = SubLObjectFactory.makeString("WHOSTATE");
		$sym6$CLET = SubLObjectFactory.makeSymbol("CLET");
		$str7$LOCK = SubLObjectFactory.makeString("LOCK");
		$str8$RELEASE = SubLObjectFactory.makeString("RELEASE");
		$list9 = ConsesLow.list(SubLNil.NIL);
		$sym10$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
		$sym11$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
		$sym12$PROGN = SubLObjectFactory.makeSymbol("PROGN");
		$sym13$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
		$sym14$SEIZE_LOCK = SubLObjectFactory.makeSymbol("SEIZE-LOCK");
		$sym15$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
		$sym16$RELEASE_LOCK = SubLObjectFactory.makeSymbol("RELEASE-LOCK");
	}

	@Override
	public void declareFunctions() {
		declare_thread_macros_file();
	}

	@Override
	public void initializeVariables() {
		init_thread_macros_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_thread_macros_file();
	}
}
