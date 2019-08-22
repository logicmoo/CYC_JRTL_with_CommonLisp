/**
 *
 */
/**
 * For LarKC
 */
/**
 *
 */
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public class thread_macros extends SubLTranslatedFile {
    public static SubLObject declare_thread_macros_file() {
        declareMacro("with_lock_held", "WITH-LOCK-HELD");
        declareFunction("with_lock_held_internal", "WITH-LOCK-HELD-INTERNAL", 3, 0, false);
        return SubLNil.NIL;
    }

    public static SubLObject init_thread_macros_file() {
        return SubLNil.NIL;
    }

    public static SubLObject setup_thread_macros_file() {
        return SubLNil.NIL;
    }

    public static SubLObject with_lock_held(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject lock = SubLNil.NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        lock = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = SubLNil.NIL;
        SubLObject rest = current;
        SubLObject bad = SubLNil.NIL;
        SubLObject current_$1 = SubLNil.NIL;
        while (SubLNil.NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list0);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list0);
            if (SubLNil.NIL == member(current_$1, $list1, UNPROVIDED, UNPROVIDED))
                bad = T;

            if (current_$1 == $ALLOW_OTHER_KEYS)
                allow_other_keys_p = rest.first();

            rest = rest.rest();
        } 
        if ((SubLNil.NIL != bad) && (SubLNil.NIL == allow_other_keys_p))
            cdestructuring_bind_error(datum, $list0);

        SubLObject whostate_tail = property_list_member($WHOSTATE, current);
        SubLObject whostate = (SubLNil.NIL != whostate_tail) ? cadr(whostate_tail) : $$$Seize_lock;
        SubLObject body;
        current = body = temp;
        return with_lock_held_internal(lock, whostate, body);
    }

    public static SubLObject with_lock_held_internal(SubLObject lock, SubLObject whostate, SubLObject body) {
        if (!whostate.isAtom()) {
            SubLObject whostate_var = make_symbol($$$WHOSTATE);
            return list(CLET, list(list(whostate_var, whostate)), with_lock_held_internal(lock, whostate_var, body));
        }
        if (!lock.isAtom()) {
            SubLObject lock_var = make_symbol($$$LOCK);
            return list(CLET, list(list(lock_var, lock)), with_lock_held_internal(lock_var, whostate, body));
        }
        SubLObject release_var = make_symbol($$$RELEASE);
        return listS(CLET, list(bq_cons(release_var, $list9)), append(SubLNil.NIL != whostate ? list(list(IGNORE, whostate)) : SubLNil.NIL, list(list(CUNWIND_PROTECT, listS(PROGN, list(CSETQ, release_var, list(SEIZE_LOCK, lock)), append(body, SubLNil.NIL)), list(PWHEN, release_var, list(RELEASE_LOCK, lock))))));
    }

    public static final SubLFile me = new thread_macros();

    public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.thread_macros";

    // Internal Constants
    public static final SubLList $list0 = list(list(makeSymbol("LOCK"), makeSymbol("&KEY"), list(makeSymbol("WHOSTATE"), makeString("Seize lock"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list1 = list(makeKeyword("WHOSTATE"));

    public static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    public static final SubLString $$$Seize_lock = makeString("Seize lock");

    private static final SubLString $$$WHOSTATE = makeString("WHOSTATE");



    private static final SubLString $$$LOCK = makeString("LOCK");

    private static final SubLString $$$RELEASE = makeString("RELEASE");

    private static final SubLList $list9 = list(SubLNil.NIL);









    private static final SubLSymbol SEIZE_LOCK = makeSymbol("SEIZE-LOCK");



    private static final SubLSymbol RELEASE_LOCK = makeSymbol("RELEASE-LOCK");

    

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

