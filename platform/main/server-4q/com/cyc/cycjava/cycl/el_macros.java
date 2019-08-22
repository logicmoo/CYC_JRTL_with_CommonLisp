package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class el_macros extends SubLTranslatedFile {
    public static final SubLFile me = new el_macros();

    public static final String myName = "com.cyc.cycjava.cycl.el_macros";

    public static final String myFingerPrint = "73bd8e7f8016851e62e076ec451c07e0d9b0e2f5cebd7dc2fd1d33bfb749b99b";

    // Internal Constants
    public static final SubLList $list0 = list(list(makeSymbol("FORMULA")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym1$TEMPFORMULA = makeUninternedSymbol("TEMPFORMULA");





    public static final SubLSymbol SEQUENCE_VAR = makeSymbol("SEQUENCE-VAR");

    public static final SubLSymbol STRIP_SEQUENCE_VAR = makeSymbol("STRIP-SEQUENCE-VAR");

    public static final SubLSymbol $sym6$SEQVAR = makeUninternedSymbol("SEQVAR");

    public static final SubLSymbol $sym7$TEMPFORMULA = makeUninternedSymbol("TEMPFORMULA");





    public static final SubLList $list10 = list(list(makeSymbol("FORMULA"), makeSymbol("RESULT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym11$SEQVAR = makeUninternedSymbol("SEQVAR");

    public static final SubLSymbol $sym12$TEMPFORMULA = makeUninternedSymbol("TEMPFORMULA");

    public static final SubLList $list13 = list(NIL);





    public static final SubLSymbol NADD_SEQUENCE_VAR_TO_END = makeSymbol("NADD-SEQUENCE-VAR-TO-END");

    public static final SubLSymbol $sym17$SEQVAR = makeUninternedSymbol("SEQVAR");

    public static final SubLSymbol $sym18$TEMPFORMULA = makeUninternedSymbol("TEMPFORMULA");

    public static final SubLList $list19 = list(list(makeSymbol("ARG-VAR"), makeSymbol("FORMULA"), makeSymbol("&KEY"), makeSymbol("ARGNUM"), list(makeSymbol("SEQVAR-HANDLING"), makeKeyword("IGNORE")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list20 = list(makeKeyword("ARGNUM"), makeKeyword("SEQVAR-HANDLING"), makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");









    public static final SubLList $list26 = list(ZERO_INTEGER);

    public static final SubLSymbol DO_FORMULA_ARGS = makeSymbol("DO-FORMULA-ARGS");



    public static final SubLSymbol $sym29$ARGS = makeUninternedSymbol("ARGS");





    public static final SubLList $list32 = list(list(makeSymbol("ARG-VAR"), makeSymbol("ARGNUM-VAR"), makeSymbol("FORMULA"), makeSymbol("&KEY"), list(makeSymbol("SEQVAR-HANDLING"), makeKeyword("IGNORE")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list33 = list(makeKeyword("SEQVAR-HANDLING"), makeKeyword("DONE"));

    public static final SubLList $list34 = list(list(makeSymbol("ARG-VAR"), makeSymbol("FORMULA"), makeSymbol("&OPTIONAL"), list(makeSymbol("DONE-VAR"), NIL), list(makeSymbol("SEQVAR-HANDLING"), makeKeyword("IGNORE"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list35 = list(list(makeSymbol("ARG-VAR"), makeSymbol("ARGNUM-VAR"), makeSymbol("FORMULA"), makeSymbol("&OPTIONAL"), list(makeSymbol("DONE-VAR"), NIL), list(makeSymbol("SEQVAR-HANDLING"), makeKeyword("IGNORE"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol DO_FORMULA_ARGS_NUMBERED = makeSymbol("DO-FORMULA-ARGS-NUMBERED");

    public static final SubLList $list37 = list(list(makeSymbol("TERM-VAR"), makeSymbol("FORMULA"), makeSymbol("&KEY"), makeSymbol("ARGNUM"), list(makeSymbol("SEQVAR-HANDLING"), makeKeyword("IGNORE")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym38$TERMS = makeUninternedSymbol("TERMS");

    public static final SubLSymbol FORMULA_TERMS = makeSymbol("FORMULA-TERMS");

    public static final SubLSymbol DO_LIST_INDEX = makeSymbol("DO-LIST-INDEX");

    public static final SubLSymbol $sym41$TERMS = makeUninternedSymbol("TERMS");

    public static final SubLList $list42 = list(list(makeSymbol("TERM-VAR"), makeSymbol("ARGNUM-VAR"), makeSymbol("FORMULA"), makeSymbol("&KEY"), list(makeSymbol("SEQVAR-HANDLING"), makeKeyword("IGNORE")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol DO_FORMULA_TERMS = makeSymbol("DO-FORMULA-TERMS");

    public static final SubLList $list44 = list(list(makeSymbol("TERM-VAR"), makeSymbol("FORMULA"), makeSymbol("&OPTIONAL"), list(makeSymbol("DONE-VAR"), NIL), list(makeSymbol("SEQVAR-HANDLING"), makeKeyword("IGNORE"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list45 = list(list(makeSymbol("TERM-VAR"), makeSymbol("ARGNUM-VAR"), makeSymbol("FORMULA"), makeSymbol("&OPTIONAL"), list(makeSymbol("DONE-VAR"), NIL), list(makeSymbol("SEQVAR-HANDLING"), makeKeyword("IGNORE"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol DO_FORMULA_TERMS_NUMBERED = makeSymbol("DO-FORMULA-TERMS-NUMBERED");

    public static final SubLList $list47 = list(list(makeSymbol("ARG-VAR"), makeSymbol("LITERAL"), makeSymbol("&OPTIONAL"), list(makeSymbol("DONE-VAR"), NIL), list(makeSymbol("SEQVAR-HANDLING"), makeKeyword("IGNORE"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym48$ARGS = makeUninternedSymbol("ARGS");

    public static final SubLSymbol LITERAL_ARGS = makeSymbol("LITERAL-ARGS");

    public static final SubLList $list50 = list(list(makeSymbol("ARG-VAR"), makeSymbol("ARGNUM-VAR"), makeSymbol("LITERAL"), makeSymbol("&OPTIONAL"), list(makeSymbol("DONE-VAR"), NIL), list(makeSymbol("SEQVAR-HANDLING"), makeKeyword("IGNORE"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym51$ARGS = makeUninternedSymbol("ARGS");

    public static final SubLSymbol $sym52$LIST_VAR = makeUninternedSymbol("LIST-VAR");







    public static final SubLSymbol $sym56$_ = makeSymbol("+");





    public static final SubLList $list59 = list(list(makeSymbol("TERM-VAR"), makeSymbol("LITERAL"), makeSymbol("&OPTIONAL"), list(makeSymbol("DONE-VAR"), NIL), list(makeSymbol("SEQVAR-HANDLING"), makeKeyword("IGNORE"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym60$TERMS = makeUninternedSymbol("TERMS");

    public static final SubLSymbol LITERAL_TERMS = makeSymbol("LITERAL-TERMS");

    public static final SubLList $list62 = list(list(makeSymbol("TERM-VAR"), makeSymbol("ARGNUM-VAR"), makeSymbol("LITERAL"), makeSymbol("&OPTIONAL"), list(makeSymbol("DONE-VAR"), NIL), list(makeSymbol("SEQVAR-HANDLING"), makeKeyword("IGNORE"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym63$TERMS = makeUninternedSymbol("TERMS");

    public static final SubLSymbol $sym64$LIST_VAR = makeUninternedSymbol("LIST-VAR");

    public static final SubLList $list65 = list(list(makeSymbol("LITERAL"), makeSymbol("FORMULA")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym66$STACK = makeUninternedSymbol("STACK");

    public static final SubLSymbol $sym67$ENTRY = makeUninternedSymbol("ENTRY");

    public static final SubLList $list68 = list(list(makeSymbol("CREATE-STACK")));





    public static final SubLSymbol STACK_EMPTY_P = makeSymbol("STACK-EMPTY-P");





    public static final SubLSymbol $sym74$LITERAL_ = makeSymbol("LITERAL?");









    public static final SubLList $list79 = list(list(makeSymbol("ARG"), makeSymbol("FORMULA")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym80$STACK = makeUninternedSymbol("STACK");

    public static final SubLSymbol $sym81$ENTRY = makeUninternedSymbol("ENTRY");

    public static final SubLList $list82 = list(list(makeSymbol("ARG"), makeSymbol("ARGPOS"), makeSymbol("FORMULA")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym83$ARG_STACK = makeUninternedSymbol("ARG-STACK");

    private static final SubLSymbol $sym84$POS_STACK = makeUninternedSymbol("POS-STACK");

    private static final SubLSymbol $sym85$ENTRY = makeUninternedSymbol("ENTRY");

    private static final SubLSymbol $sym86$POS_ENTRY = makeUninternedSymbol("POS-ENTRY");

    private static final SubLSymbol $sym87$ARG_NUM = makeUninternedSymbol("ARG-NUM");

    private static final SubLSymbol SNOC = makeSymbol("SNOC");

    public static final SubLList $list89 = list(new SubLObject[]{ list(makeSymbol("*WITHIN-ASSERT*"), NIL), list(makeSymbol("*CHECK-ARG-TYPES?*"), NIL), list(makeSymbol("*AT-CHECK-ARG-TYPES?*"), NIL), list(makeSymbol("*CHECK-WFF-SEMANTICS?*"), NIL), list(makeSymbol("*CHECK-WFF-COHERENCE?*"), NIL), list(makeSymbol("*CHECK-VAR-TYPES?*"), NIL), list(makeSymbol("*SIMPLIFY-LITERAL?*"), NIL), list(makeSymbol("*AT-CHECK-RELATOR-CONSTRAINTS?*"), NIL), list(makeSymbol("*AT-CHECK-ARG-FORMAT?*"), NIL), list(makeSymbol("*VALIDATE-CONSTANTS?*"), NIL), list(makeSymbol("*SUSPEND-SBHL-TYPE-CHECKING?*"), T) });

    public static final SubLList $list90 = list(list(makeSymbol("*CHECK-WFF-SEMANTICS?*"), T));

    private static final SubLSymbol WITHOUT_WFF_SEMANTICS = makeSymbol("WITHOUT-WFF-SEMANTICS");

    public static final SubLList $list92 = list(list(makeSymbol("*CHECK-ARITY?*"), NIL));

    private static final SubLSymbol WITHOUT_WFF_SEMANTICS_OR_ARITY = makeSymbol("WITHOUT-WFF-SEMANTICS-OR-ARITY");

    private static final SubLSymbol WITHOUT_GRAMMAR_USING_KB = makeSymbol("WITHOUT-GRAMMAR-USING-KB");

    public static final SubLList $list95 = list(list(makeSymbol("*EL-SYMBOL-SUFFIX-TABLE*"), list(makeSymbol("FIF"), makeSymbol("*EL-SYMBOL-SUFFIX-TABLE*"), makeSymbol("*EL-SYMBOL-SUFFIX-TABLE*"), list(makeSymbol("MAKE-HASH-TABLE"), makeInteger(32), list(makeSymbol("FUNCTION"), EQL)))), list(makeSymbol("*STANDARDIZE-VARIABLES-MEMORY*"), list(makeSymbol("FIF"), makeSymbol("*STANDARDIZE-VARIABLES-MEMORY*"), makeSymbol("*STANDARDIZE-VARIABLES-MEMORY*"), NIL)));

    private static final SubLList $list96 = list(list(makeSymbol("*EL-SYMBOL-SUFFIX-TABLE*"), list(makeSymbol("MAKE-HASH-TABLE"), FOUR_INTEGER, list(makeSymbol("FUNCTION"), EQL))), list(makeSymbol("*STANDARDIZE-VARIABLES-MEMORY*"), NIL));

    private static final SubLList $list97 = list(list(makeSymbol("*ENCAPSULATE-VAR-FORMULA?*"), NIL), list(makeSymbol("*ENCAPSULATE-INTENSIONAL-FORMULA?*"), NIL));

    private static final SubLList $list98 = list(list(makeSymbol("CLAUSE-VAR"), makeSymbol("CLAUSES"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list99 = list(makeKeyword("DONE"));

    public static final SubLList $list100 = list(list(makeSymbol("LIT-VAR"), makeSymbol("CNF"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLList $list102 = list(list(makeSymbol("LIT-VAR"), makeSymbol("INDEX"), makeSymbol("CNF"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DO_NEG_LITS = makeSymbol("DO-NEG-LITS");



    private static final SubLSymbol DO_POS_LITS = makeSymbol("DO-POS-LITS");

    private static final SubLList $list106 = list(list(makeSymbol("LIT-VAR"), makeSymbol("CLAUSE"), makeSymbol("&KEY"), makeSymbol("SENSE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list107 = list(makeKeyword("SENSE"), makeKeyword("DONE"));







    private static final SubLSymbol DO_ALL_LITS_AS_ASENTS = makeSymbol("DO-ALL-LITS-AS-ASENTS");





    private static final SubLString $str114$Invalid_sense__s = makeString("Invalid sense ~s");

    private static final SubLList $list115 = list(list(makeSymbol("LIT-VAR"), makeSymbol("INDEX-VAR"), makeSymbol("SENSE-VAR"), makeSymbol("CLAUSE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DO_NEG_LITS_NUMBERED = makeSymbol("DO-NEG-LITS-NUMBERED");

    public static final SubLList $list117 = list(makeKeyword("NEG"));

    private static final SubLSymbol DO_POS_LITS_NUMBERED = makeSymbol("DO-POS-LITS-NUMBERED");

    private static final SubLList $list119 = list(makeKeyword("POS"));

    private static final SubLList $list120 = list(list(makeSymbol("ASENT-VAR"), makeSymbol("SENSE-VAR"), makeSymbol("CLAUSE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym121$INDEX_VAR = makeUninternedSymbol("INDEX-VAR");

    private static final SubLSymbol DO_LITERALS_NUMBERED = makeSymbol("DO-LITERALS-NUMBERED");



    public static final SubLList $list124 = list(list(makeSymbol("LIT-VAR"), makeSymbol("CLAUSES"), makeSymbol("&KEY"), makeSymbol("DONE"), makeSymbol("SENSE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list125 = list(makeKeyword("DONE"), makeKeyword("SENSE-VAR"));



    private static final SubLSymbol $sym127$CLAUSE = makeUninternedSymbol("CLAUSE");

    private static final SubLList $list128 = list(list(makeSymbol("LIT-VAR"), makeSymbol("LITERAL-INDEX-VAR"), makeSymbol("SENSE-VAR"), makeSymbol("CLAUSE-INDEX-VAR"), makeSymbol("CLAUSES")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym129$CLAUSE = makeUninternedSymbol("CLAUSE");



    private static final SubLList $list131 = list(list(makeSymbol("VARIABLE-VAR"), makeSymbol("VALUE-VAR")), makeSymbol("BINDING"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static SubLObject ignoring_sequence_vars(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject formula = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        formula = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject tempformula = $sym1$TEMPFORMULA;
            return listS(CLET, list(list(tempformula, list(FIF, list(SEQUENCE_VAR, formula), list(STRIP_SEQUENCE_VAR, formula), formula)), list(formula, tempformula)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    public static SubLObject regularizing_sequence_vars(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject formula = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        formula = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject seqvar = $sym6$SEQVAR;
            final SubLObject tempformula = $sym7$TEMPFORMULA;
            return listS(CLET, list(list(seqvar, list(SEQUENCE_VAR, formula)), list(tempformula, list(FIF, seqvar, list(APPEND, list(STRIP_SEQUENCE_VAR, formula), list(LIST, seqvar)), formula)), list(formula, tempformula)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    public static SubLObject return_after_ignoring_sequence_vars(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list10);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject formula = NIL;
        SubLObject result = NIL;
        destructuring_bind_must_consp(current, datum, $list10);
        formula = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list10);
        result = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject seqvar = $sym11$SEQVAR;
            final SubLObject tempformula = $sym12$TEMPFORMULA;
            return listS(CLET, list(list(seqvar, list(SEQUENCE_VAR, formula)), list(tempformula, formula), list(formula, list(FIF, seqvar, list(STRIP_SEQUENCE_VAR, tempformula), tempformula)), bq_cons(result, $list13)), append(body, list(list(PIF, seqvar, list(RET, list(NADD_SEQUENCE_VAR_TO_END, seqvar, result)), list(RET, result)))));
        }
        cdestructuring_bind_error(datum, $list10);
        return NIL;
    }

    public static SubLObject return_after_regularizing_sequence_vars(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list10);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject formula = NIL;
        SubLObject result = NIL;
        destructuring_bind_must_consp(current, datum, $list10);
        formula = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list10);
        result = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject seqvar = $sym17$SEQVAR;
            final SubLObject tempformula = $sym18$TEMPFORMULA;
            return listS(CLET, list(list(seqvar, list(SEQUENCE_VAR, formula)), list(tempformula, list(FIF, seqvar, list(APPEND, list(STRIP_SEQUENCE_VAR, formula), list(LIST, seqvar)), formula)), list(formula, tempformula), bq_cons(result, $list13)), append(body, list(list(PIF, seqvar, list(RET, list(NADD_SEQUENCE_VAR_TO_END, seqvar, list(STRIP_SEQUENCE_VAR, result))), list(RET, result)))));
        }
        cdestructuring_bind_error(datum, $list10);
        return NIL;
    }

    public static SubLObject do_formula_args(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list19);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject arg_var = NIL;
        SubLObject formula = NIL;
        destructuring_bind_must_consp(current, datum, $list19);
        arg_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list19);
        formula = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list19);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list19);
            if (NIL == member(current_$1, $list20, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list19);
        }
        final SubLObject argnum_tail = property_list_member($ARGNUM, current);
        final SubLObject argnum = (NIL != argnum_tail) ? cadr(argnum_tail) : NIL;
        final SubLObject seqvar_handling_tail = property_list_member($SEQVAR_HANDLING, current);
        final SubLObject seqvar_handling = (NIL != seqvar_handling_tail) ? cadr(seqvar_handling_tail) : $IGNORE;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL != argnum) {
            return list(CLET, list(bq_cons(argnum, $list26)), listS(DO_FORMULA_ARGS, list(arg_var, formula, $SEQVAR_HANDLING, seqvar_handling, $DONE, done), list(CINC, argnum), append(body, NIL)));
        }
        final SubLObject args = $sym29$ARGS;
        return list(CLET, list(list(args, list(FORMULA_ARGS, formula, seqvar_handling))), listS(DO_LIST, list(arg_var, args, $DONE, done), append(body, NIL)));
    }

    public static SubLObject do_formula_args_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list32);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject arg_var = NIL;
        SubLObject argnum_var = NIL;
        SubLObject formula = NIL;
        destructuring_bind_must_consp(current, datum, $list32);
        arg_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list32);
        argnum_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list32);
        formula = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list32);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list32);
            if (NIL == member(current_$2, $list33, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list32);
        }
        final SubLObject seqvar_handling_tail = property_list_member($SEQVAR_HANDLING, current);
        final SubLObject seqvar_handling = (NIL != seqvar_handling_tail) ? cadr(seqvar_handling_tail) : $IGNORE;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_FORMULA_ARGS, list(arg_var, formula, $ARGNUM, argnum_var, $SEQVAR_HANDLING, seqvar_handling, $DONE, done), append(body, NIL));
    }

    public static SubLObject some_el_formula_args(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list34);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject arg_var = NIL;
        SubLObject formula = NIL;
        destructuring_bind_must_consp(current, datum, $list34);
        arg_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list34);
        formula = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list34);
        current = current.rest();
        final SubLObject seqvar_handling = (current.isCons()) ? current.first() : $IGNORE;
        destructuring_bind_must_listp(current, datum, $list34);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_FORMULA_ARGS, list(arg_var, formula, $SEQVAR_HANDLING, seqvar_handling, $DONE, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list34);
        return NIL;
    }

    public static SubLObject some_el_formula_args_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list35);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject arg_var = NIL;
        SubLObject argnum_var = NIL;
        SubLObject formula = NIL;
        destructuring_bind_must_consp(current, datum, $list35);
        arg_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list35);
        argnum_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list35);
        formula = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list35);
        current = current.rest();
        final SubLObject seqvar_handling = (current.isCons()) ? current.first() : $IGNORE;
        destructuring_bind_must_listp(current, datum, $list35);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_FORMULA_ARGS_NUMBERED, list(arg_var, argnum_var, formula, $SEQVAR_HANDLING, seqvar_handling, $DONE, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list35);
        return NIL;
    }

    public static SubLObject do_formula_terms(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject term_var = NIL;
        SubLObject formula = NIL;
        destructuring_bind_must_consp(current, datum, $list37);
        term_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        formula = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list37);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list37);
            if (NIL == member(current_$3, $list20, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list37);
        }
        final SubLObject argnum_tail = property_list_member($ARGNUM, current);
        final SubLObject argnum = (NIL != argnum_tail) ? cadr(argnum_tail) : NIL;
        final SubLObject seqvar_handling_tail = property_list_member($SEQVAR_HANDLING, current);
        final SubLObject seqvar_handling = (NIL != seqvar_handling_tail) ? cadr(seqvar_handling_tail) : $IGNORE;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL != argnum) {
            final SubLObject terms = $sym38$TERMS;
            return list(CLET, list(list(terms, list(FORMULA_TERMS, formula, seqvar_handling))), listS(DO_LIST_INDEX, list(argnum, term_var, terms, $DONE, done), append(body, NIL)));
        }
        final SubLObject terms = $sym41$TERMS;
        return list(CLET, list(list(terms, list(FORMULA_TERMS, formula, seqvar_handling))), listS(DO_LIST, list(term_var, terms, $DONE, done), append(body, NIL)));
    }

    public static SubLObject do_formula_terms_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list42);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject term_var = NIL;
        SubLObject argnum_var = NIL;
        SubLObject formula = NIL;
        destructuring_bind_must_consp(current, datum, $list42);
        term_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list42);
        argnum_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list42);
        formula = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list42);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list42);
            if (NIL == member(current_$4, $list33, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list42);
        }
        final SubLObject seqvar_handling_tail = property_list_member($SEQVAR_HANDLING, current);
        final SubLObject seqvar_handling = (NIL != seqvar_handling_tail) ? cadr(seqvar_handling_tail) : $IGNORE;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_FORMULA_TERMS, list(term_var, formula, $ARGNUM, argnum_var, $SEQVAR_HANDLING, seqvar_handling, $DONE, done), append(body, NIL));
    }

    public static SubLObject some_el_formula_terms(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list44);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject term_var = NIL;
        SubLObject formula = NIL;
        destructuring_bind_must_consp(current, datum, $list44);
        term_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list44);
        formula = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list44);
        current = current.rest();
        final SubLObject seqvar_handling = (current.isCons()) ? current.first() : $IGNORE;
        destructuring_bind_must_listp(current, datum, $list44);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_FORMULA_TERMS, list(term_var, formula, $SEQVAR_HANDLING, seqvar_handling, $DONE, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list44);
        return NIL;
    }

    public static SubLObject some_el_formula_terms_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list45);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject term_var = NIL;
        SubLObject argnum_var = NIL;
        SubLObject formula = NIL;
        destructuring_bind_must_consp(current, datum, $list45);
        term_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list45);
        argnum_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list45);
        formula = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list45);
        current = current.rest();
        final SubLObject seqvar_handling = (current.isCons()) ? current.first() : $IGNORE;
        destructuring_bind_must_listp(current, datum, $list45);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_FORMULA_TERMS_NUMBERED, list(term_var, argnum_var, formula, $SEQVAR_HANDLING, seqvar_handling, $DONE, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list45);
        return NIL;
    }

    public static SubLObject some_el_literal_args(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject arg_var = NIL;
        SubLObject literal = NIL;
        destructuring_bind_must_consp(current, datum, $list47);
        arg_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        literal = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list47);
        current = current.rest();
        final SubLObject seqvar_handling = (current.isCons()) ? current.first() : $IGNORE;
        destructuring_bind_must_listp(current, datum, $list47);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject args = $sym48$ARGS;
            return list(CLET, list(list(args, list(LITERAL_ARGS, literal, seqvar_handling))), listS(DO_LIST, list(arg_var, args, $DONE, done_var), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list47);
        return NIL;
    }

    public static SubLObject some_el_literal_args_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list50);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject arg_var = NIL;
        SubLObject argnum_var = NIL;
        SubLObject literal = NIL;
        destructuring_bind_must_consp(current, datum, $list50);
        arg_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list50);
        argnum_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list50);
        literal = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list50);
        current = current.rest();
        final SubLObject seqvar_handling = (current.isCons()) ? current.first() : $IGNORE;
        destructuring_bind_must_listp(current, datum, $list50);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject args = $sym51$ARGS;
            final SubLObject list_var = $sym52$LIST_VAR;
            return list(CLET, list(list(args, list(LITERAL_ARGS, literal, seqvar_handling))), listS(CDO, list(list(list_var, args, list(CDR, list_var)), list(arg_var, list(CAR, list_var), list(CAR, list_var)), list(argnum_var, ONE_INTEGER, list($sym56$_, ONE_INTEGER, argnum_var))), list(list(COR, done_var, list(NULL, list_var))), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list50);
        return NIL;
    }

    public static SubLObject some_el_literal_terms(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list59);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject term_var = NIL;
        SubLObject literal = NIL;
        destructuring_bind_must_consp(current, datum, $list59);
        term_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list59);
        literal = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list59);
        current = current.rest();
        final SubLObject seqvar_handling = (current.isCons()) ? current.first() : $IGNORE;
        destructuring_bind_must_listp(current, datum, $list59);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject terms = $sym60$TERMS;
            return list(CLET, list(list(terms, list(LITERAL_TERMS, literal, seqvar_handling))), listS(DO_LIST, list(term_var, terms, $DONE, done_var), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list59);
        return NIL;
    }

    public static SubLObject some_el_literal_terms_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list62);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject term_var = NIL;
        SubLObject argnum_var = NIL;
        SubLObject literal = NIL;
        destructuring_bind_must_consp(current, datum, $list62);
        term_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list62);
        argnum_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list62);
        literal = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list62);
        current = current.rest();
        final SubLObject seqvar_handling = (current.isCons()) ? current.first() : $IGNORE;
        destructuring_bind_must_listp(current, datum, $list62);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject terms = $sym63$TERMS;
            final SubLObject list_var = $sym64$LIST_VAR;
            return list(CLET, list(list(terms, list(LITERAL_TERMS, literal, seqvar_handling))), listS(CDO, list(list(list_var, terms, list(CDR, list_var)), list(term_var, list(CAR, list_var), list(CAR, list_var)), list(argnum_var, ZERO_INTEGER, list($sym56$_, ONE_INTEGER, argnum_var))), list(list(COR, done_var, list(NULL, list_var))), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list62);
        return NIL;
    }

    public static SubLObject do_el_formula_literals(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list65);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject literal = NIL;
        SubLObject formula = NIL;
        destructuring_bind_must_consp(current, datum, $list65);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list65);
        formula = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject stack = $sym66$STACK;
            final SubLObject entry = $sym67$ENTRY;
            return list(CLET, list(bq_cons(stack, $list68), literal), list(STACK_PUSH, formula, stack), list(UNTIL, list(STACK_EMPTY_P, stack), list(CLET, list(list(entry, list(STACK_POP, stack))), list(PWHEN, list($sym74$LITERAL_, entry), listS(PROGN, list(CSETQ, literal, entry), append(body, NIL))), list(CDOLIST, list(ARG, list(FORMULA_ARGS, entry)), list(STACK_PUSH, ARG, stack)))));
        }
        cdestructuring_bind_error(datum, $list65);
        return NIL;
    }

    public static SubLObject do_el_formula_args_recursive(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list79);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject arg = NIL;
        SubLObject formula = NIL;
        destructuring_bind_must_consp(current, datum, $list79);
        arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list79);
        formula = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject stack = $sym80$STACK;
            final SubLObject entry = $sym81$ENTRY;
            return list(CLET, list(bq_cons(stack, $list68), arg), list(STACK_PUSH, formula, stack), list(UNTIL, list(STACK_EMPTY_P, stack), list(CLET, list(list(entry, list(STACK_POP, stack))), listS(PROGN, list(CSETQ, arg, entry), append(body, NIL)), list(CDOLIST, list(ARG, list(FORMULA_ARGS, entry)), list(STACK_PUSH, ARG, stack)))));
        }
        cdestructuring_bind_error(datum, $list79);
        return NIL;
    }

    public static SubLObject do_formula_terms_and_positions_recursive(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list82);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject arg = NIL;
        SubLObject argpos = NIL;
        SubLObject formula = NIL;
        destructuring_bind_must_consp(current, datum, $list82);
        arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list82);
        argpos = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list82);
        formula = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject arg_stack = $sym83$ARG_STACK;
            final SubLObject pos_stack = $sym84$POS_STACK;
            final SubLObject entry = $sym85$ENTRY;
            final SubLObject pos_entry = $sym86$POS_ENTRY;
            final SubLObject arg_num = $sym87$ARG_NUM;
            return list(CLET, list(bq_cons(arg_stack, $list68), bq_cons(pos_stack, $list68), arg, argpos), list(STACK_PUSH, formula, arg_stack), list(STACK_PUSH, argpos, pos_stack), list(UNTIL, list(STACK_EMPTY_P, arg_stack), list(CLET, list(list(entry, list(STACK_POP, arg_stack)), list(pos_entry, list(STACK_POP, pos_stack))), listS(PROGN, list(CSETQ, arg, entry), list(CSETQ, argpos, pos_entry), append(body, NIL)), list(DO_FORMULA_TERMS_NUMBERED, list(ARG, arg_num, entry), list(STACK_PUSH, ARG, arg_stack), list(STACK_PUSH, list(SNOC, arg_num, argpos), pos_stack)))));
        }
        cdestructuring_bind_error(datum, $list82);
        return NIL;
    }

    public static SubLObject without_wff_semantics(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list89, append(body, NIL));
    }

    public static SubLObject with_wff_semantics(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list90, append(body, NIL));
    }

    public static SubLObject without_wff_semantics_or_arity(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITHOUT_WFF_SEMANTICS, listS(CLET, $list92, append(body, NIL)));
    }

    public static SubLObject without_wff_semantics_or_arity_or_kb(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITHOUT_WFF_SEMANTICS_OR_ARITY, bq_cons(WITHOUT_GRAMMAR_USING_KB, append(body, NIL)));
    }

    public static SubLObject with_el_var_namespace(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list95, append(body, NIL));
    }

    public static SubLObject with_clean_el_var_namespace(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list96, append(body, NIL));
    }

    public static SubLObject without_encapsulation(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list97, append(body, NIL));
    }

    public static SubLObject do_clauses(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list98);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject clause_var = NIL;
        SubLObject v_clauses = NIL;
        destructuring_bind_must_consp(current, datum, $list98);
        clause_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list98);
        v_clauses = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$5 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list98);
            current_$5 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list98);
            if (NIL == member(current_$5, $list99, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$5 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list98);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_LIST, list(clause_var, v_clauses, $DONE, done), append(body, NIL));
    }

    public static SubLObject do_neg_lits(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list100);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject lit_var = NIL;
        SubLObject cnf = NIL;
        destructuring_bind_must_consp(current, datum, $list100);
        lit_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list100);
        cnf = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list100);
            current_$6 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list100);
            if (NIL == member(current_$6, $list99, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list100);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_LIST, list(lit_var, list(NEG_LITS, cnf), $DONE, done), append(body, NIL));
    }

    public static SubLObject do_neg_lits_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list102);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject lit_var = NIL;
        SubLObject index = NIL;
        SubLObject cnf = NIL;
        destructuring_bind_must_consp(current, datum, $list102);
        lit_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list102);
        index = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list102);
        cnf = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list102);
            current_$7 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list102);
            if (NIL == member(current_$7, $list99, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$7 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list102);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(CLET, list(bq_cons(index, $list26)), listS(DO_NEG_LITS, list(lit_var, cnf, $DONE, done), append(body, list(list(CINC, index)))));
    }

    public static SubLObject do_pos_lits(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list100);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject lit_var = NIL;
        SubLObject cnf = NIL;
        destructuring_bind_must_consp(current, datum, $list100);
        lit_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list100);
        cnf = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$8 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list100);
            current_$8 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list100);
            if (NIL == member(current_$8, $list99, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$8 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list100);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_LIST, list(lit_var, list(POS_LITS, cnf), $DONE, done), append(body, NIL));
    }

    public static SubLObject do_pos_lits_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list102);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject lit_var = NIL;
        SubLObject index = NIL;
        SubLObject cnf = NIL;
        destructuring_bind_must_consp(current, datum, $list102);
        lit_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list102);
        index = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list102);
        cnf = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$9 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list102);
            current_$9 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list102);
            if (NIL == member(current_$9, $list99, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$9 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list102);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(CLET, list(bq_cons(index, $list26)), listS(DO_POS_LITS, list(lit_var, cnf, $DONE, done), append(body, list(list(CINC, index)))));
    }

    public static SubLObject do_all_lits_as_asents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list106);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject lit_var = NIL;
        SubLObject clause = NIL;
        destructuring_bind_must_consp(current, datum, $list106);
        lit_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list106);
        clause = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$10 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list106);
            current_$10 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list106);
            if (NIL == member(current_$10, $list107, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$10 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list106);
        }
        final SubLObject sense_tail = property_list_member($SENSE, current);
        final SubLObject sense = (NIL != sense_tail) ? cadr(sense_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if ($POS == sense) {
            return listS(DO_POS_LITS, list(lit_var, clause, $DONE, done), append(body, NIL));
        }
        if ($NEG == sense) {
            return listS(DO_NEG_LITS, list(lit_var, clause, $DONE, done), append(body, NIL));
        }
        if (NIL == sense) {
            return list(PROGN, listS(DO_ALL_LITS_AS_ASENTS, list(lit_var, clause, $SENSE, $NEG, $DONE, done), append(body, NIL)), listS(DO_ALL_LITS_AS_ASENTS, list(lit_var, clause, $SENSE, $POS, $DONE, done), append(body, NIL)));
        }
        return list(PCOND, list(list(EQ, $POS, sense), listS(DO_ALL_LITS_AS_ASENTS, list(lit_var, clause, $SENSE, $POS, $DONE, done), append(body, NIL))), list(list(EQ, $NEG, sense), listS(DO_ALL_LITS_AS_ASENTS, list(lit_var, clause, $SENSE, $NEG, $DONE, done), append(body, NIL))), list(T, list(ERROR, $str114$Invalid_sense__s, sense)));
    }

    public static SubLObject do_literals_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list115);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject lit_var = NIL;
        SubLObject index_var = NIL;
        SubLObject sense_var = NIL;
        SubLObject clause = NIL;
        destructuring_bind_must_consp(current, datum, $list115);
        lit_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list115);
        index_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list115);
        sense_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list115);
        clause = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$11 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list115);
            current_$11 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list115);
            if (NIL == member(current_$11, $list99, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$11 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list115);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(PROGN, list(DO_NEG_LITS_NUMBERED, list(lit_var, index_var, clause, $DONE, done), listS(CLET, list(bq_cons(sense_var, $list117)), append(body, NIL))), list(DO_POS_LITS_NUMBERED, list(lit_var, index_var, clause, $DONE, done), listS(CLET, list(bq_cons(sense_var, $list119)), append(body, NIL))));
    }

    public static SubLObject do_clause_asents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list120);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject asent_var = NIL;
        SubLObject sense_var = NIL;
        SubLObject clause = NIL;
        destructuring_bind_must_consp(current, datum, $list120);
        asent_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list120);
        sense_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list120);
        clause = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject index_var = $sym121$INDEX_VAR;
            return listS(DO_LITERALS_NUMBERED, list(asent_var, index_var, sense_var, clause), list(IGNORE, index_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list120);
        return NIL;
    }

    public static SubLObject do_clauses_asents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list124);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject lit_var = NIL;
        SubLObject v_clauses = NIL;
        destructuring_bind_must_consp(current, datum, $list124);
        lit_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list124);
        v_clauses = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$12 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list124);
            current_$12 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list124);
            if (NIL == member(current_$12, $list125, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$12 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list124);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject sense_var_tail = property_list_member($SENSE_VAR, current);
        final SubLObject sense_var = (NIL != sense_var_tail) ? cadr(sense_var_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject clause = $sym127$CLAUSE;
        return list(DO_LIST, list(clause, v_clauses, $DONE, done), listS(DO_ALL_LITS_AS_ASENTS, list(lit_var, clause, $SENSE, sense_var, $DONE, done), append(body, NIL)));
    }

    public static SubLObject do_clauses_literals_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list128);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject lit_var = NIL;
        SubLObject literal_index_var = NIL;
        SubLObject sense_var = NIL;
        SubLObject clause_index_var = NIL;
        SubLObject v_clauses = NIL;
        destructuring_bind_must_consp(current, datum, $list128);
        lit_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list128);
        literal_index_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list128);
        sense_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list128);
        clause_index_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list128);
        v_clauses = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject clause = $sym129$CLAUSE;
            return list(CDOLIST_NUMBERED, list(clause, clause_index_var, v_clauses), listS(DO_LITERALS_NUMBERED, list(lit_var, literal_index_var, sense_var, clause), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list128);
        return NIL;
    }

    public static SubLObject destructure_binding(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list131);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject variable_var = NIL;
        SubLObject value_var = NIL;
        destructuring_bind_must_consp(current, datum, $list131);
        variable_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list131);
        value_var = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject binding = NIL;
            destructuring_bind_must_consp(current, datum, $list131);
            binding = current.first();
            final SubLObject body;
            current = body = current.rest();
            return listS(CDESTRUCTURING_BIND, bq_cons(variable_var, value_var), binding, append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list131);
        return NIL;
    }

    public static SubLObject declare_el_macros_file() {
        declareMacro(me, "ignoring_sequence_vars", "IGNORING-SEQUENCE-VARS");
        declareMacro(me, "regularizing_sequence_vars", "REGULARIZING-SEQUENCE-VARS");
        declareMacro(me, "return_after_ignoring_sequence_vars", "RETURN-AFTER-IGNORING-SEQUENCE-VARS");
        declareMacro(me, "return_after_regularizing_sequence_vars", "RETURN-AFTER-REGULARIZING-SEQUENCE-VARS");
        declareMacro(me, "do_formula_args", "DO-FORMULA-ARGS");
        declareMacro(me, "do_formula_args_numbered", "DO-FORMULA-ARGS-NUMBERED");
        declareMacro(me, "some_el_formula_args", "SOME-EL-FORMULA-ARGS");
        declareMacro(me, "some_el_formula_args_numbered", "SOME-EL-FORMULA-ARGS-NUMBERED");
        declareMacro(me, "do_formula_terms", "DO-FORMULA-TERMS");
        declareMacro(me, "do_formula_terms_numbered", "DO-FORMULA-TERMS-NUMBERED");
        declareMacro(me, "some_el_formula_terms", "SOME-EL-FORMULA-TERMS");
        declareMacro(me, "some_el_formula_terms_numbered", "SOME-EL-FORMULA-TERMS-NUMBERED");
        declareMacro(me, "some_el_literal_args", "SOME-EL-LITERAL-ARGS");
        declareMacro(me, "some_el_literal_args_numbered", "SOME-EL-LITERAL-ARGS-NUMBERED");
        declareMacro(me, "some_el_literal_terms", "SOME-EL-LITERAL-TERMS");
        declareMacro(me, "some_el_literal_terms_numbered", "SOME-EL-LITERAL-TERMS-NUMBERED");
        declareMacro(me, "do_el_formula_literals", "DO-EL-FORMULA-LITERALS");
        declareMacro(me, "do_el_formula_args_recursive", "DO-EL-FORMULA-ARGS-RECURSIVE");
        declareMacro(me, "do_formula_terms_and_positions_recursive", "DO-FORMULA-TERMS-AND-POSITIONS-RECURSIVE");
        declareMacro(me, "without_wff_semantics", "WITHOUT-WFF-SEMANTICS");
        declareMacro(me, "with_wff_semantics", "WITH-WFF-SEMANTICS");
        declareMacro(me, "without_wff_semantics_or_arity", "WITHOUT-WFF-SEMANTICS-OR-ARITY");
        declareMacro(me, "without_wff_semantics_or_arity_or_kb", "WITHOUT-WFF-SEMANTICS-OR-ARITY-OR-KB");
        declareMacro(me, "with_el_var_namespace", "WITH-EL-VAR-NAMESPACE");
        declareMacro(me, "with_clean_el_var_namespace", "WITH-CLEAN-EL-VAR-NAMESPACE");
        declareMacro(me, "without_encapsulation", "WITHOUT-ENCAPSULATION");
        declareMacro(me, "do_clauses", "DO-CLAUSES");
        declareMacro(me, "do_neg_lits", "DO-NEG-LITS");
        declareMacro(me, "do_neg_lits_numbered", "DO-NEG-LITS-NUMBERED");
        declareMacro(me, "do_pos_lits", "DO-POS-LITS");
        declareMacro(me, "do_pos_lits_numbered", "DO-POS-LITS-NUMBERED");
        declareMacro(me, "do_all_lits_as_asents", "DO-ALL-LITS-AS-ASENTS");
        declareMacro(me, "do_literals_numbered", "DO-LITERALS-NUMBERED");
        declareMacro(me, "do_clause_asents", "DO-CLAUSE-ASENTS");
        declareMacro(me, "do_clauses_asents", "DO-CLAUSES-ASENTS");
        declareMacro(me, "do_clauses_literals_numbered", "DO-CLAUSES-LITERALS-NUMBERED");
        declareMacro(me, "destructure_binding", "DESTRUCTURE-BINDING");
        return NIL;
    }

    public static SubLObject init_el_macros_file() {
        return NIL;
    }

    public static SubLObject setup_el_macros_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_el_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_el_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_el_macros_file();
    }

    
}

/**
 * Total time: 1988 ms
 */
