package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$mapping_answer$;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class wff_suggest extends SubLTranslatedFile {
    public static final SubLFile me = new wff_suggest();

    public static final String myName = "com.cyc.cycjava.cycl.wff_suggest";

    public static final String myFingerPrint = "3fa0065d757a10722c716f1f07565eb0af751f209f5563b90c68c6d1560e0a29";

    // defparameter
    // max number of candidates for a solicited variable that will be considered
    private static final SubLSymbol $sake_candidate_threshold$ = makeSymbol("*SAKE-CANDIDATE-THRESHOLD*");

    // defparameter
    // should sake fixes that are non-wff or inconsistent be suppressed?
    private static final SubLSymbol $sake_suppress_unviableP$ = makeSymbol("*SAKE-SUPPRESS-UNVIABLE?*");

    // defparameter
    /**
     * the wf violation modules for which considering fixes is currently available
     */
    public static final SubLSymbol $accessible_wf_fix_modules$ = makeSymbol("*ACCESSIBLE-WF-FIX-MODULES*");

    // defparameter
    // the currently accessible strategies for fixing wf violations
    public static final SubLSymbol $accessible_wf_fix_strategies$ = makeSymbol("*ACCESSIBLE-WF-FIX-STRATEGIES*");

    // defparameter
    // the currently accessible tactics for fixing wf violations
    public static final SubLSymbol $accessible_wf_fix_tactics$ = makeSymbol("*ACCESSIBLE-WF-FIX-TACTICS*");

    // defparameter
    // global variable useful for mapping
    public static final SubLSymbol $target_relation$ = makeSymbol("*TARGET-RELATION*");

    private static final SubLSymbol $MAL_ARG_WRT_ARG_ISA = makeKeyword("MAL-ARG-WRT-ARG-ISA");

    public static final SubLList $list1 = listS(makeSymbol("WFF-MODULE"), new SubLObject[]{ makeSymbol("ARG"), makeSymbol("RELN"), makeSymbol("POS"), makeSymbol("COL"), makeSymbol("MT"), makeSymbol("DATA") });

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLSymbol $MAL_ARG_WRT_ARG_QUOTED_ISA = makeKeyword("MAL-ARG-WRT-ARG-QUOTED-ISA");

    private static final SubLObject $$quotedIsa = reader_make_constant_shell(makeString("quotedIsa"));

    private static final SubLSymbol $MAL_ARG_WRT_ARG_GENLS = makeKeyword("MAL-ARG-WRT-ARG-GENLS");

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLSymbol $MAL_ARG_WRT_ARG_NOT_ISA_DISJOINT = makeKeyword("MAL-ARG-WRT-ARG-NOT-ISA-DISJOINT");

    private static final SubLSymbol $MAL_ARG_WRT_ARG_NOT_QUOTED_ISA_DISJOINT = makeKeyword("MAL-ARG-WRT-ARG-NOT-QUOTED-ISA-DISJOINT");

    private static final SubLSymbol $MAL_ARG_WRT_ARG_NOT_GENLS_DISJOINT = makeKeyword("MAL-ARG-WRT-ARG-NOT-GENLS-DISJOINT");

    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_ISA = makeKeyword("MAL-ARG-WRT-INTER-ARG-ISA");

    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_NOT_ISA = makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-ISA");

    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_GENL = makeKeyword("MAL-ARG-WRT-INTER-ARG-GENL");

    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_NOT_ISA_DISJOINT = makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-ISA-DISJOINT");

    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_NOT_GENL_DISJOINT = makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-GENL-DISJOINT");

    private static final SubLSymbol $MAL_ARG_WRT_ARG_FORMAT = makeKeyword("MAL-ARG-WRT-ARG-FORMAT");

    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_FORMAT = makeKeyword("MAL-ARG-WRT-INTER-ARG-FORMAT");

    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_DIFFERENT = makeKeyword("MAL-ARG-WRT-INTER-ARG-DIFFERENT");

    public static final SubLList $list18 = list(new SubLObject[]{ makeSymbol("WFF-MODULE"), makeSymbol("RELN"), makeSymbol("ARG1"), makeSymbol("PSN1"), makeSymbol("ARG2"), makeSymbol("PSN2"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("VIA") });

    private static final SubLObject $$different = reader_make_constant_shell(makeString("different"));

    private static final SubLSymbol $MAL_RELN_WRT_ARG_ISA_REQUIRED = makeKeyword("MAL-RELN-WRT-ARG-ISA-REQUIRED");

    private static final SubLSymbol $CONFLICT_ASSERTING_TRUE_SBHL = makeKeyword("CONFLICT-ASSERTING-TRUE-SBHL");

    private static final SubLSymbol $CONFLICT_ASSERTING_FALSE_SBHL = makeKeyword("CONFLICT-ASSERTING-FALSE-SBHL");

    private static final SubLSymbol $DISJOINT_ARG_ISA = makeKeyword("DISJOINT-ARG-ISA");

    private static final SubLSymbol $DISJOINT_ARG_QUOTED_ISA = makeKeyword("DISJOINT-ARG-QUOTED-ISA");

    private static final SubLSymbol $DISJOINT_ARG_GENL = makeKeyword("DISJOINT-ARG-GENL");

    private static final SubLSymbol $RESTRICTED_SKOLEM_ASSERTION = makeKeyword("RESTRICTED-SKOLEM-ASSERTION");

    private static final SubLSymbol $RESTRICTED_PREDICATE_ASSERTION = makeKeyword("RESTRICTED-PREDICATE-ASSERTION");

    private static final SubLSymbol $RESTRICTED_COLLECTION_ASSERTION = makeKeyword("RESTRICTED-COLLECTION-ASSERTION");

    private static final SubLSymbol $RESTRICTED_MT_ASSERTION = makeKeyword("RESTRICTED-MT-ASSERTION");

    private static final SubLSymbol $EVALUATABLE_LITERAL_FALSE = makeKeyword("EVALUATABLE-LITERAL-FALSE");





    private static final SubLSymbol $RECURSION_LIMIT_EXCEEDED = makeKeyword("RECURSION-LIMIT-EXCEEDED");

    private static final SubLSymbol $EL_UNEVALUATABLE_EXPRESSION = makeKeyword("EL-UNEVALUATABLE-EXPRESSION");

    private static final SubLSymbol $QUANTIFIED_SEQUENCE_VARIABLE = makeKeyword("QUANTIFIED-SEQUENCE-VARIABLE");

    private static final SubLSymbol $TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE = makeKeyword("TOO-MANY-SEQUENCE-VARS-IN-SKOLEM-SCOPE");

    private static final SubLSymbol $AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE = makeKeyword("AMBIGUOUS-VAR-TYPE-IN-SKOLEM-SCOPE");

    private static final SubLSymbol $INHIBITED_SEQUENCE_VARIABLE = makeKeyword("INHIBITED-SEQUENCE-VARIABLE");

    private static final SubLSymbol $TOO_MANY_COMMUTATIVE_IN_ARGS_AND_REST = makeKeyword("TOO-MANY-COMMUTATIVE-IN-ARGS-AND-REST");

    public static final SubLSymbol $sym40$GENL_ = makeSymbol("GENL?");





    public static final SubLList $list43 = listS(makeSymbol("MODULE"), new SubLObject[]{ makeSymbol("ARG"), makeSymbol("RELATION"), makeSymbol("ARGNUM"), makeSymbol("COL"), makeSymbol("MT"), makeSymbol("DATA") });

    private static final SubLSymbol $VIA_GENL_PRED = makeKeyword("VIA-GENL-PRED");





    public static final SubLString $str47$dont_know_how_to_describe_fixes_f = makeString("dont know how to describe fixes for ~a in NL.");

    private static final SubLSymbol $AT_CONSTRAINT_GAF = makeKeyword("AT-CONSTRAINT-GAF");

    private static final SubLSymbol $MAKE_IT_SO = makeKeyword("MAKE-IT-SO");

    public static final SubLList $list50 = list(makeKeyword("SAKE-STRATEGY"), makeKeyword("SATISFY-CONSTRAINT"));





    public static final SubLList $list53 = list(makeKeyword("SAKE-STRATEGY"), makeKeyword("MAKE-EXCPETION"));



    public static final SubLList $list55 = list(makeKeyword("SAKE-STRATEGY"), makeKeyword("CORRECT-FORMULA"));



    public static final SubLList $list57 = list(makeKeyword("SAKE-STRATEGY"), makeKeyword("DENY-APPLICABLILITY"));



    public static final SubLList $list59 = list(makeKeyword("SAKE-STRATEGY"), makeKeyword("CORRECT-CONSTRAINT"));



    public static final SubLList $list61 = list(makeKeyword("SAKE-TACTICS"), list(makeKeyword("ASSERT-GAF"), makeSymbol("PREDICATE")));

    public static final SubLList $list62 = list(makeKeyword("USER-SKILLS"), makeKeyword("KE-1"));







    public static final SubLList $list66 = list(makeKeyword("SAKE-TACTICS"), makeKeyword("EDIT-DEFN"));

    public static final SubLList $list67 = list(makeKeyword("USER-SKILLS"), makeKeyword("SE-3"));

    private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));

    private static final SubLObject $$defnAdmits = reader_make_constant_shell(makeString("defnAdmits"));









    public static final SubLList $list74 = list(makeKeyword("SAKE-TACTICS"), makeKeyword("SOLICIT-SUFFICIENT-DEFN"));

    private static final SubLObject $$defnSufficient = reader_make_constant_shell(makeString("defnSufficient"));

    public static final SubLList $list76 = list(list(reader_make_constant_shell(makeString("SubLQuoteFn")), makeSymbol("?DEFN")));

    public static final SubLSymbol $sym77$_DEFN = makeSymbol("?DEFN");

    private static final SubLSymbol $SOLICIT_VARIABLE_BINDING = makeKeyword("SOLICIT-VARIABLE-BINDING");

    private static final SubLSymbol $ASSERT_EXCEPT_FOR = makeKeyword("ASSERT-EXCEPT-FOR");

    public static final SubLList $list80 = list(makeKeyword("SAKE-TACTICS"), list(makeKeyword("ASSERT-GAF"), reader_make_constant_shell(makeString("exceptFor"))));

    public static final SubLList $list81 = list(makeKeyword("USER-SKILLS"), makeKeyword("KE-3"));

    private static final SubLObject $$exceptFor = reader_make_constant_shell(makeString("exceptFor"));

    private static final SubLSymbol $ASSERT_EXCEPT_WHEN = makeKeyword("ASSERT-EXCEPT-WHEN");

    public static final SubLList $list84 = list(makeKeyword("SAKE-TACTICS"), list(makeKeyword("ASSERT-GAF"), reader_make_constant_shell(makeString("exceptWhen"))));

    private static final SubLObject $$implies = reader_make_constant_shell(makeString("implies"));

    private static final SubLObject $$evaluate = reader_make_constant_shell(makeString("evaluate"));

    public static final SubLSymbol $sym87$_FORMULA_WRT_ARG = makeSymbol("?FORMULA-WRT-ARG");

    private static final SubLObject $$SubstituteFormulaFn = reader_make_constant_shell(makeString("SubstituteFormulaFn"));

    public static final SubLList $list89 = list(list(makeSymbol("QUOTE"), makeSymbol("?ARG")), makeSymbol("?FORMULA"));

    public static final SubLList $list90 = list(list(reader_make_constant_shell(makeString("knownSentence")), makeSymbol("?FORMULA-WRT-ARG")));

    public static final SubLSymbol $sym91$_FORMULA = makeSymbol("?FORMULA");

    private static final SubLObject $$exceptWhen = reader_make_constant_shell(makeString("exceptWhen"));



    public static final SubLList $list94 = list(makeKeyword("SAKE-TACTICS"), makeKeyword("CHANGE-REFERENCE-LEVEL"), makeKeyword("TERM-TO-ALL"));

    public static final SubLList $list95 = list(makeKeyword("USER-SKILLS"), makeKeyword("KE-2"));

    private static final SubLObject $$relationAllInstance = reader_make_constant_shell(makeString("relationAllInstance"));

    private static final SubLObject $$relationInstanceAll = reader_make_constant_shell(makeString("relationInstanceAll"));







    public static final SubLList $list101 = list(makeKeyword("SAKE-TACTICS"), makeKeyword("CHANGE-TERM"));

    public static final SubLSymbol $sym102$_NEW_TERM = makeSymbol("?NEW-TERM");

    private static final SubLObject $$knownSentence = reader_make_constant_shell(makeString("knownSentence"));

    private static final SubLObject $$conceptuallyRelated = reader_make_constant_shell(makeString("conceptuallyRelated"));





    public static final SubLList $list107 = list(makeKeyword("SAKE-TACTICS"), makeKeyword("CHANGE-RELATION"));

    public static final SubLSymbol $sym108$_NEW_RELATION = makeSymbol("?NEW-RELATION");







    private static final SubLObject $$admittedArgument = reader_make_constant_shell(makeString("admittedArgument"));



    public static final SubLList $list114 = list(makeKeyword("SAKE-TACTICS"), makeKeyword("WEAKEN-PREDICATE"));

    public static final SubLSymbol $sym115$_NEW_PREDICATE = makeSymbol("?NEW-PREDICATE");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));

    public static final SubLList $list118 = list(makeSymbol("?NEW-PREDICATE"));

    public static final SubLList $list119 = list(makeKeyword("EDIT-TYPE"), makeKeyword("WEAKEN"));



    public static final SubLList $list121 = list(makeKeyword("SAKE-TACTICS"), makeKeyword("CHANGE-MT"));



    private static final SubLSymbol $CHANGE_FORMULA_MT = makeKeyword("CHANGE-FORMULA-MT");



    public static final SubLList $list125 = list(makeKeyword("TO-MT"), makeSymbol("?NEW-MT"));



    public static final SubLList $list127 = list(makeKeyword("SAKE-TACTICS"), makeKeyword("RETRACT-FORMULA"));



    public static final SubLList $list129 = list(makeKeyword("SAKE-TACTICS"), makeKeyword("WEAKEN-CONSTRAINT"));

    public static final SubLSymbol $sym130$_NEW_COL = makeSymbol("?NEW-COL");

    public static final SubLList $list131 = list(makeSymbol("?NEW-COL"));





    public static final SubLList $list134 = list(makeKeyword("SAKE-TACTICS"), makeKeyword("CHANGE-CONSTRAINT"));





    public static final SubLSymbol $sym137$_NEW_MT = makeSymbol("?NEW-MT");

    private static final SubLObject $$unknownSentence = reader_make_constant_shell(makeString("unknownSentence"));

    private static final SubLObject $$genlMt = reader_make_constant_shell(makeString("genlMt"));

    public static final SubLList $list140 = list(makeSymbol("?NEW-MT"));

    private static final SubLSymbol $CHANGE_ASSERTION_MT = makeKeyword("CHANGE-ASSERTION-MT");

    private static final SubLSymbol $DENY_HL_SUPPORT = makeKeyword("DENY-HL-SUPPORT");

    public static final SubLList $list143 = list(makeKeyword("SAKE-TACTICS"), makeKeyword("DENY-SUPPRT"));



    public static final SubLList $list145 = list(makeKeyword("SAKE-TACTICS"), makeKeyword("DENY-SUPPORT"));





    public static final SubLList $list148 = list(makeKeyword("WFF"), T);

    private static final SubLSymbol $WHY_NOT_WFF = makeKeyword("WHY-NOT-WFF");

    private static final SubLSymbol $WHY_NOT_CONSISTENT = makeKeyword("WHY-NOT-CONSISTENT");

    public static final SubLList $list151 = list(makeKeyword("SAKE-STATUS"), makeKeyword("UNVIABLE"));

    public static final SubLSymbol $sym152$CYC_VAR_ = makeSymbol("CYC-VAR?");

    public static final SubLList $list153 = list(list(makeKeyword("CONSISTENT"), T));

    public static final SubLList $list154 = list(list(makeKeyword("CONSISTENT"), makeKeyword("ASSUMED")));

    public static final SubLSymbol GATHER_CONTRACTIONS_INT = makeSymbol("GATHER-CONTRACTIONS-INT");



    private static final SubLObject $$expansion = reader_make_constant_shell(makeString("expansion"));

    public static final SubLSymbol $sym158$TARGET_RELATION_EXPRESSION_ = makeSymbol("TARGET-RELATION-EXPRESSION?");



    public static SubLObject non_wffness_repairs(final SubLObject sentence, final SubLObject mt) {
        final SubLObject wff_violations = wff.why_not_wff(sentence, mt, UNPROVIDED);
        return wff_violations_repairs(wff_violations);
    }

    public static SubLObject wff_violations_repairs(final SubLObject wff_violations) {
        SubLObject isa_repairs = NIL;
        SubLObject quoted_isa_repairs = NIL;
        SubLObject genl_repairs = NIL;
        SubLObject other_repairs = NIL;
        SubLObject irreparableP = NIL;
        if (NIL == irreparableP) {
            SubLObject csome_list_var = wff_violations;
            SubLObject violation = NIL;
            violation = csome_list_var.first();
            while ((NIL == irreparableP) && (NIL != csome_list_var)) {
                final SubLObject pcase_var = at_utilities.violation_type(violation);
                if (pcase_var.eql($MAL_ARG_WRT_ARG_ISA)) {
                    SubLObject current;
                    final SubLObject datum = current = violation;
                    SubLObject wff_module = NIL;
                    SubLObject arg = NIL;
                    SubLObject reln = NIL;
                    SubLObject pos = NIL;
                    SubLObject col = NIL;
                    SubLObject mt = NIL;
                    SubLObject data = NIL;
                    destructuring_bind_must_consp(current, datum, $list1);
                    wff_module = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list1);
                    arg = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list1);
                    reln = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list1);
                    pos = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list1);
                    col = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list1);
                    mt = current.first();
                    current = data = current.rest();
                    if (NIL != at_defns.quiet_not_has_typeP(arg, col, mt)) {
                        irreparableP = T;
                    } else {
                        final SubLObject item_var = make_binary_formula($$isa, arg, col);
                        if (NIL == member(item_var, isa_repairs, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            isa_repairs = cons(item_var, isa_repairs);
                        }
                    }
                } else
                    if (pcase_var.eql($MAL_ARG_WRT_ARG_QUOTED_ISA)) {
                        SubLObject current;
                        final SubLObject datum = current = violation;
                        SubLObject wff_module = NIL;
                        SubLObject arg = NIL;
                        SubLObject reln = NIL;
                        SubLObject pos = NIL;
                        SubLObject col = NIL;
                        SubLObject mt = NIL;
                        SubLObject data = NIL;
                        destructuring_bind_must_consp(current, datum, $list1);
                        wff_module = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list1);
                        arg = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list1);
                        reln = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list1);
                        pos = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list1);
                        col = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list1);
                        mt = current.first();
                        current = data = current.rest();
                        if (NIL != at_defns.quiet_not_quoted_has_typeP(arg, col, mt)) {
                            irreparableP = T;
                        } else {
                            final SubLObject item_var = make_binary_formula($$quotedIsa, arg, col);
                            if (NIL == member(item_var, isa_repairs, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                isa_repairs = cons(item_var, isa_repairs);
                            }
                        }
                    } else
                        if (pcase_var.eql($MAL_ARG_WRT_ARG_GENLS)) {
                            SubLObject current;
                            final SubLObject datum = current = violation;
                            SubLObject wff_module = NIL;
                            SubLObject arg = NIL;
                            SubLObject reln = NIL;
                            SubLObject pos = NIL;
                            SubLObject col = NIL;
                            SubLObject mt = NIL;
                            SubLObject data = NIL;
                            destructuring_bind_must_consp(current, datum, $list1);
                            wff_module = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list1);
                            arg = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list1);
                            reln = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list1);
                            pos = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list1);
                            col = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list1);
                            mt = current.first();
                            current = data = current.rest();
                            if (NIL != genls.not_genlP(arg, col, mt, UNPROVIDED)) {
                                irreparableP = T;
                            } else {
                                final SubLObject item_var = make_binary_formula($$genls, arg, col);
                                if (NIL == member(item_var, genl_repairs, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                    genl_repairs = cons(item_var, genl_repairs);
                                }
                            }
                        } else
                            if ((pcase_var.eql($MAL_ARG_WRT_ARG_NOT_ISA_DISJOINT) || pcase_var.eql($MAL_ARG_WRT_ARG_NOT_QUOTED_ISA_DISJOINT)) || pcase_var.eql($MAL_ARG_WRT_ARG_NOT_GENLS_DISJOINT)) {
                                irreparableP = T;
                            } else
                                if (!pcase_var.eql($MAL_ARG_WRT_INTER_ARG_ISA)) {
                                    if (!pcase_var.eql($MAL_ARG_WRT_INTER_ARG_NOT_ISA)) {
                                        if (!pcase_var.eql($MAL_ARG_WRT_INTER_ARG_GENL)) {
                                            if (pcase_var.eql($MAL_ARG_WRT_INTER_ARG_NOT_ISA_DISJOINT) || pcase_var.eql($MAL_ARG_WRT_INTER_ARG_NOT_GENL_DISJOINT)) {
                                                irreparableP = T;
                                            } else
                                                if (pcase_var.eql($MAL_ARG_WRT_ARG_FORMAT) || pcase_var.eql($MAL_ARG_WRT_INTER_ARG_FORMAT)) {
                                                    irreparableP = T;
                                                } else
                                                    if (pcase_var.eql($MAL_ARG_WRT_INTER_ARG_DIFFERENT)) {
                                                        SubLObject current;
                                                        final SubLObject datum = current = violation;
                                                        SubLObject wff_module = NIL;
                                                        SubLObject reln2 = NIL;
                                                        SubLObject arg2 = NIL;
                                                        SubLObject psn1 = NIL;
                                                        SubLObject arg3 = NIL;
                                                        SubLObject psn2 = NIL;
                                                        SubLObject mt2 = NIL;
                                                        destructuring_bind_must_consp(current, datum, $list18);
                                                        wff_module = current.first();
                                                        current = current.rest();
                                                        destructuring_bind_must_consp(current, datum, $list18);
                                                        reln2 = current.first();
                                                        current = current.rest();
                                                        destructuring_bind_must_consp(current, datum, $list18);
                                                        arg2 = current.first();
                                                        current = current.rest();
                                                        destructuring_bind_must_consp(current, datum, $list18);
                                                        psn1 = current.first();
                                                        current = current.rest();
                                                        destructuring_bind_must_consp(current, datum, $list18);
                                                        arg3 = current.first();
                                                        current = current.rest();
                                                        destructuring_bind_must_consp(current, datum, $list18);
                                                        psn2 = current.first();
                                                        current = current.rest();
                                                        destructuring_bind_must_consp(current, datum, $list18);
                                                        mt2 = current.first();
                                                        current = current.rest();
                                                        final SubLObject via = (current.isCons()) ? current.first() : NIL;
                                                        destructuring_bind_must_listp(current, datum, $list18);
                                                        current = current.rest();
                                                        if (NIL == current) {
                                                            if (NIL != equals.equalsP(arg2, arg3, mt2, UNPROVIDED)) {
                                                                irreparableP = T;
                                                            } else {
                                                                final SubLObject item_var2 = make_binary_formula($$different, arg2, arg3);
                                                                if (NIL == member(item_var2, other_repairs, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                    other_repairs = cons(item_var2, other_repairs);
                                                                }
                                                            }
                                                        } else {
                                                            cdestructuring_bind_error(datum, $list18);
                                                        }
                                                    } else
                                                        if (pcase_var.eql($MAL_RELN_WRT_ARG_ISA_REQUIRED)) {
                                                            irreparableP = T;
                                                        } else
                                                            if (pcase_var.eql($CONFLICT_ASSERTING_TRUE_SBHL) || pcase_var.eql($CONFLICT_ASSERTING_FALSE_SBHL)) {
                                                                irreparableP = T;
                                                            } else
                                                                if ((pcase_var.eql($DISJOINT_ARG_ISA) || pcase_var.eql($DISJOINT_ARG_QUOTED_ISA)) || pcase_var.eql($DISJOINT_ARG_GENL)) {
                                                                    irreparableP = T;
                                                                } else
                                                                    if (((pcase_var.eql($RESTRICTED_SKOLEM_ASSERTION) || pcase_var.eql($RESTRICTED_PREDICATE_ASSERTION)) || pcase_var.eql($RESTRICTED_COLLECTION_ASSERTION)) || pcase_var.eql($RESTRICTED_MT_ASSERTION)) {
                                                                        irreparableP = T;
                                                                    } else
                                                                        if ((((pcase_var.eql($EVALUATABLE_LITERAL_FALSE) || pcase_var.eql($MAL_PRECANONICALIZATIONS)) || pcase_var.eql($INVALID_EXPANSION)) || pcase_var.eql($RECURSION_LIMIT_EXCEEDED)) || pcase_var.eql($EL_UNEVALUATABLE_EXPRESSION)) {
                                                                            irreparableP = T;
                                                                        } else
                                                                            if (((pcase_var.eql($QUANTIFIED_SEQUENCE_VARIABLE) || pcase_var.eql($TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE)) || pcase_var.eql($AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE)) || pcase_var.eql($INHIBITED_SEQUENCE_VARIABLE)) {
                                                                                irreparableP = T;
                                                                            } else
                                                                                if (pcase_var.eql($TOO_MANY_COMMUTATIVE_IN_ARGS_AND_REST)) {
                                                                                    irreparableP = T;
                                                                                }









                                        }
                                    }
                                }




                csome_list_var = csome_list_var.rest();
                violation = csome_list_var.first();
            } 
        }
        isa_repairs = list_utilities.delete_subsumed_items(isa_repairs, $sym40$GENL_, FORMULA_ARG2);
        quoted_isa_repairs = list_utilities.delete_subsumed_items(quoted_isa_repairs, $sym40$GENL_, FORMULA_ARG2);
        genl_repairs = list_utilities.delete_subsumed_items(genl_repairs, $sym40$GENL_, FORMULA_ARG2);
        return NIL != irreparableP ? NIL : append(isa_repairs, quoted_isa_repairs, genl_repairs, other_repairs);
    }

    public static SubLObject suggestions_for_mal_arg_wrt_arg_isa(final SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $EL;
        }
        SubLObject module = NIL;
        SubLObject arg = NIL;
        SubLObject relation = NIL;
        SubLObject argnum = NIL;
        SubLObject col = NIL;
        SubLObject mt = NIL;
        SubLObject data = NIL;
        destructuring_bind_must_consp(why_not, why_not, $list43);
        module = why_not.first();
        SubLObject current = why_not.rest();
        destructuring_bind_must_consp(current, why_not, $list43);
        arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, why_not, $list43);
        relation = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, why_not, $list43);
        argnum = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, why_not, $list43);
        col = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, why_not, $list43);
        mt = current.first();
        current = data = current.rest();
        final SubLObject via_genl_pred = cadr(assoc($VIA_GENL_PRED, data, UNPROVIDED, UNPROVIDED));
        final SubLObject rejected_formula = cadr(assoc($WFF_FORMULA, data, UNPROVIDED, UNPROVIDED));
        final SubLObject pcase_var = io_mode;
        if (pcase_var.eql($NL)) {
            return format(NIL, $str47$dont_know_how_to_describe_fixes_f, module);
        }
        if (pcase_var.eql($EL)) {
            final SubLObject constraint_assertion = cadr(assoc($AT_CONSTRAINT_GAF, data, UNPROVIDED, UNPROVIDED));
            final SubLObject constraint_formula = assertions_high.gaf_formula(constraint_assertion);
            final SubLObject constraint_mt = assertions_high.assertion_mt(constraint_assertion);
            return append(new SubLObject[]{ sake_fix_arg_isa_via_make_it_so(module, arg, col, mt), sake_fix_arg_type_via_make_exception(module, arg, constraint_formula, mt), sake_fix_arg_type_via_correct_formula(module, $$isa, relation, argnum, arg, col, rejected_formula, mt), sake_fix_via_deny_constraint_applicability(module, relation, mt, via_genl_pred, constraint_formula, constraint_mt), sake_fix_arg_type_via_correct_constraint(module, $$isa, arg, col, mt, constraint_formula, constraint_mt) });
        }
        return NIL;
    }

    public static SubLObject suggestions_for_mal_arg_wrt_arg_not_isa_disjoint(final SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $EL;
        }
        SubLObject module = NIL;
        SubLObject arg = NIL;
        SubLObject relation = NIL;
        SubLObject argnum = NIL;
        SubLObject col = NIL;
        SubLObject mt = NIL;
        SubLObject data = NIL;
        destructuring_bind_must_consp(why_not, why_not, $list43);
        module = why_not.first();
        SubLObject current = why_not.rest();
        destructuring_bind_must_consp(current, why_not, $list43);
        arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, why_not, $list43);
        relation = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, why_not, $list43);
        argnum = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, why_not, $list43);
        col = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, why_not, $list43);
        mt = current.first();
        current = data = current.rest();
        final SubLObject via_genl_pred = cadr(assoc($VIA_GENL_PRED, data, UNPROVIDED, UNPROVIDED));
        final SubLObject rejected_formula = cadr(assoc($WFF_FORMULA, data, UNPROVIDED, UNPROVIDED));
        final SubLObject pcase_var = io_mode;
        if (pcase_var.eql($NL)) {
            return format(NIL, $str47$dont_know_how_to_describe_fixes_f, module);
        }
        if (pcase_var.eql($EL)) {
            final SubLObject constraint_assertion = cadr(assoc($AT_CONSTRAINT_GAF, data, UNPROVIDED, UNPROVIDED));
            final SubLObject constraint_formula = (NIL != constraint_assertion) ? assertions_high.gaf_formula(constraint_assertion) : NIL;
            final SubLObject constraint_mt = (NIL != constraint_assertion) ? assertions_high.assertion_mt(constraint_assertion) : NIL;
            return append(new SubLObject[]{ sake_fix_arg_isa_disjoint_via_make_it_unknown(module, arg, col, mt), sake_fix_arg_type_via_make_exception(module, arg, constraint_formula, mt), sake_fix_arg_type_via_correct_formula(module, $$isa, relation, argnum, arg, col, rejected_formula, mt), sake_fix_via_deny_constraint_applicability(module, relation, mt, via_genl_pred, constraint_formula, constraint_mt), sake_fix_arg_type_via_correct_constraint(module, $$isa, arg, col, mt, constraint_formula, constraint_mt) });
        }
        return NIL;
    }

    public static SubLObject suggestions_for_mal_arg_wrt_arg_genl(final SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $EL;
        }
        SubLObject module = NIL;
        SubLObject arg = NIL;
        SubLObject relation = NIL;
        SubLObject argnum = NIL;
        SubLObject col = NIL;
        SubLObject mt = NIL;
        SubLObject data = NIL;
        destructuring_bind_must_consp(why_not, why_not, $list43);
        module = why_not.first();
        SubLObject current = why_not.rest();
        destructuring_bind_must_consp(current, why_not, $list43);
        arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, why_not, $list43);
        relation = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, why_not, $list43);
        argnum = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, why_not, $list43);
        col = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, why_not, $list43);
        mt = current.first();
        current = data = current.rest();
        final SubLObject via_genl_pred = cadr(assoc($VIA_GENL_PRED, data, UNPROVIDED, UNPROVIDED));
        final SubLObject rejected_formula = cadr(assoc($WFF_FORMULA, data, UNPROVIDED, UNPROVIDED));
        final SubLObject pcase_var = io_mode;
        if (pcase_var.eql($NL)) {
            return format(NIL, $str47$dont_know_how_to_describe_fixes_f, module);
        }
        if (pcase_var.eql($EL)) {
            final SubLObject constraint_assertion = cadr(assoc($AT_CONSTRAINT_GAF, data, UNPROVIDED, UNPROVIDED));
            final SubLObject constraint_formula = assertions_high.gaf_formula(constraint_assertion);
            final SubLObject constraint_mt = assertions_high.assertion_mt(constraint_assertion);
            return append(new SubLObject[]{ sake_fix_arg_genl_via_make_it_so(module, arg, col, mt), sake_fix_arg_type_via_make_exception(module, arg, constraint_formula, mt), sake_fix_arg_type_via_correct_formula(module, $$genls, relation, argnum, arg, col, rejected_formula, mt), sake_fix_via_deny_constraint_applicability(module, relation, mt, via_genl_pred, constraint_formula, constraint_mt), sake_fix_arg_type_via_correct_constraint(module, $$genls, arg, col, mt, constraint_formula, constraint_mt) });
        }
        return NIL;
    }

    public static SubLObject sake_fix_arg_isa_via_make_it_so(final SubLObject wff_module, final SubLObject arg, final SubLObject col, final SubLObject mt) {
        if (NIL != accessible_wf_fixP(wff_module, $MAKE_IT_SO, UNPROVIDED)) {
            final SubLObject strategy = $list50;
            return append(sake_fix_assert_gaf2(wff_module, $$isa, arg, col, mt, strategy), sake_fix_edit_sufficient_defn(wff_module, arg, col, mt, strategy), sake_fix_solicit_sufficient_defn(wff_module, arg, col, mt, strategy));
        }
        return NIL;
    }

    public static SubLObject sake_fix_arg_isa_disjoint_via_make_it_unknown(final SubLObject wff_module, final SubLObject arg, final SubLObject col, final SubLObject mt) {
        if (NIL != accessible_wf_fixP(wff_module, $MAKE_IT_SO, UNPROVIDED)) {
            final SubLObject strategy = $list50;
            final SubLObject literal = cycl_utilities.negate(make_binary_formula($$isa, arg, col));
            return append(sake_fix_deny_hl_literal(wff_module, $ISA, literal, mt, strategy), sake_fix_arg_isa_via_make_it_so(wff_module, arg, col, mt));
        }
        return NIL;
    }

    public static SubLObject sake_fix_arg_genl_via_make_it_so(final SubLObject wff_module, final SubLObject arg, final SubLObject col, final SubLObject mt) {
        if (NIL != accessible_wf_fixP(wff_module, $MAKE_IT_SO, UNPROVIDED)) {
            final SubLObject strategy = $list50;
            return sake_fix_assert_gaf2(wff_module, $$genls, arg, col, mt, strategy);
        }
        return NIL;
    }

    public static SubLObject sake_fix_arg_type_via_make_exception(final SubLObject wff_module, final SubLObject arg, final SubLObject formula, final SubLObject mt) {
        if (NIL != accessible_wf_fixP(wff_module, $MAKE_EXCEPTION, UNPROVIDED)) {
            final SubLObject strategy = $list53;
            return append(sake_fix_assert_arg_except_for(wff_module, arg, formula, mt, strategy), sake_fix_assert_arg_except_when(wff_module, arg, formula, mt, strategy));
        }
        return NIL;
    }

    public static SubLObject sake_fix_arg_type_via_correct_formula(final SubLObject wff_module, final SubLObject predicate, final SubLObject relation, final SubLObject argnum, final SubLObject arg, final SubLObject col, final SubLObject formula, final SubLObject mt) {
        if (NIL != accessible_wf_fixP(wff_module, $CORRECT_FORMULA, UNPROVIDED)) {
            final SubLObject strategy = $list55;
            return append(new SubLObject[]{ sake_fix_change_formula_level(wff_module, predicate, relation, argnum, arg, col, formula, mt, strategy), sake_fix_change_formula_term(wff_module, predicate, arg, col, formula, mt, strategy), sake_fix_change_formula_relation(wff_module, relation, argnum, arg, formula, mt, strategy), sake_fix_weaken_formula_relation(wff_module, relation, argnum, arg, formula, mt, strategy), sake_fix_change_formula_mt(wff_module, predicate, arg, col, mt, formula, strategy), sake_fix_retract_formula(wff_module, formula, mt, strategy) });
        }
        return NIL;
    }

    public static SubLObject sake_fix_via_deny_constraint_applicability(final SubLObject wff_module, final SubLObject relation, final SubLObject mt, final SubLObject via_genl_pred, final SubLObject constraint_formula, final SubLObject constraint_mt) {
        if (NIL != accessible_wf_fixP(wff_module, $DENY_APPLICABLILITY, UNPROVIDED)) {
            final SubLObject strategy = $list57;
            return append(sake_fix_change_constraint_mt(wff_module, mt, constraint_formula, constraint_mt, strategy), sake_fix_deny_constraint_applies_to_spec_pred(wff_module, relation, mt, via_genl_pred, strategy));
        }
        return NIL;
    }

    public static SubLObject sake_fix_arg_type_via_correct_constraint(final SubLObject wff_module, final SubLObject predicate, final SubLObject arg, final SubLObject col, final SubLObject mt, final SubLObject constraint_formula, final SubLObject constraint_mt) {
        if (NIL != accessible_wf_fixP(wff_module, $CORRECT_CONSTRAINT, UNPROVIDED)) {
            final SubLObject strategy = $list59;
            return append(sake_fix_weaken_arg_type_constraint(wff_module, predicate, arg, col, mt, constraint_formula, constraint_mt, strategy), sake_fix_change_arg_type_constraint(wff_module, predicate, arg, col, mt, constraint_formula, constraint_mt, strategy), sake_fix_unassert_constraint(wff_module, constraint_formula, constraint_mt, strategy));
        }
        return NIL;
    }

    public static SubLObject sake_fix_assert_gaf2(final SubLObject wff_module, final SubLObject predicate, final SubLObject arg1, final SubLObject arg2, final SubLObject mt, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != accessible_wf_fixP(wff_module, strategy, $ASSERT_GAF)) {
            final SubLObject gaf_formula = make_binary_formula(predicate, arg1, arg2);
            final SubLObject tactics = $list61;
            final SubLObject skills = $list62;
            final SubLObject formula_status = sake_formula_status(gaf_formula, mt);
            if ((NIL == $sake_suppress_unviableP$.getDynamicValue(thread)) || (NIL != sake_viableP(formula_status))) {
                return list(listS($ASSERT, gaf_formula, list($MT, mt), append(formula_status, list(strategy, tactics, skills))));
            }
        }
        return NIL;
    }

    public static SubLObject sake_fix_edit_sufficient_defn(final SubLObject wff_module, final SubLObject arg, final SubLObject col, final SubLObject mt, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != accessible_wf_fixP(wff_module, strategy, $EDIT_DEFN)) {
            final SubLObject tactics = $list66;
            final SubLObject skills = $list67;
            SubLObject result = NIL;
            SubLObject cdolist_list_var = kb_accessors.sufficient_defns(col, mt);
            SubLObject defn = NIL;
            defn = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject constraint_formula = list($$ist, mt, list($$defnAdmits, defn, arg));
                final SubLObject constraint_status = sake_formula_status(constraint_formula, mt);
                if ((NIL == $sake_suppress_unviableP$.getDynamicValue(thread)) || (NIL != sake_viableP(constraint_status))) {
                    result = cons(list($EDIT_SUBL, defn, listS($CONSTRAINTS, constraint_formula, append(constraint_status, NIL)), strategy, tactics, skills), result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                defn = cdolist_list_var.first();
            } 
            return result;
        }
        return NIL;
    }

    public static SubLObject sake_fix_solicit_sufficient_defn(final SubLObject wff_module, final SubLObject arg, final SubLObject col, final SubLObject mt, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != accessible_wf_fixP(wff_module, strategy, $SOLICIT_DEFN)) && (NIL != accessible_wf_fixP(wff_module, strategy, $ASSERT_DEFN))) {
            final SubLObject tactics = $list74;
            final SubLObject skills = $list67;
            final SubLObject defn_formula = listS($$defnSufficient, col, $list76);
            final SubLObject formula_status = sake_formula_status(defn_formula, mt);
            final SubLObject constraint_formula = list($$ist, mt, list($$defnAdmits, $sym77$_DEFN, arg));
            final SubLObject constraint_status = sake_formula_status(constraint_formula, mt);
            final SubLObject solicit_data = list(list($SOLICIT_VARIABLE_BINDING, $sym77$_DEFN, listS($CONSTRAINTS, constraint_formula, append(constraint_status, NIL))));
            if ((NIL == $sake_suppress_unviableP$.getDynamicValue(thread)) || ((NIL != sake_viableP(formula_status)) && (NIL != sake_viableP(constraint_status)))) {
                return list(listS($ASSERT, defn_formula, list($MT, mt), append(formula_status, solicit_data, list(strategy, tactics, skills))));
            }
        }
        return NIL;
    }

    public static SubLObject sake_fix_assert_arg_except_for(final SubLObject wff_module, final SubLObject arg, final SubLObject formula, final SubLObject mt, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != accessible_wf_fixP(wff_module, strategy, $ASSERT_EXCEPT_FOR)) {
            final SubLObject tactics = $list80;
            final SubLObject skills = $list81;
            final SubLObject except_formula = list($$exceptFor, arg, formula);
            final SubLObject formula_status = sake_formula_status(except_formula, mt);
            if ((NIL == $sake_suppress_unviableP$.getDynamicValue(thread)) || (NIL != sake_viableP(formula_status))) {
                return list(listS($ASSERT, except_formula, list($MT, mt), append(formula_status, list(strategy, tactics, skills))));
            }
        }
        return NIL;
    }

    public static SubLObject sake_fix_assert_arg_except_when(final SubLObject wff_module, final SubLObject arg, final SubLObject formula, final SubLObject mt, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != accessible_wf_fixP(wff_module, strategy, $ASSERT_EXCEPT_WHEN)) {
            final SubLObject tactics = $list84;
            final SubLObject skills = $list81;
            final SubLObject constraint_formula = list($$ist, mt, listS($$implies, list($$evaluate, $sym87$_FORMULA_WRT_ARG, listS($$SubstituteFormulaFn, arg, $list89)), $list90));
            final SubLObject constraint_status = sake_formula_status(constraint_formula, mt);
            final SubLObject solicit_data = list(list($SOLICIT_VARIABLE_BINDING, $sym91$_FORMULA, listS($CONSTRAINTS, constraint_formula, append(constraint_status, NIL))));
            if ((NIL == $sake_suppress_unviableP$.getDynamicValue(thread)) || (NIL != sake_viableP(constraint_status))) {
                return list(listS($ASSERT, list($$exceptWhen, $sym91$_FORMULA, formula), list($MT, mt), append(solicit_data, list(strategy, tactics, skills))));
            }
        }
        return NIL;
    }

    public static SubLObject sake_fix_change_formula_level(final SubLObject wff_module, final SubLObject predicate, final SubLObject relation, final SubLObject argnum, final SubLObject arg, final SubLObject col, final SubLObject formula, final SubLObject mt, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((((NIL != accessible_wf_fixP(wff_module, strategy, $CHANGE_LEVEL)) && predicate.eql($$isa)) && (NIL != genls.genlsP(arg, col, mt, UNPROVIDED))) && (NIL != el_binary_formula_p(formula))) && (NIL != fort_types_interface.predicateP(relation))) {
            final SubLObject tactics = $list94;
            final SubLObject skills = $list95;
            final SubLObject new_predicate = (ONE_INTEGER.numE(argnum)) ? $$relationAllInstance : $$relationInstanceAll;
            final SubLObject sentence_pred = cycl_utilities.sentence_arg0(formula);
            final SubLObject sentence_arg1 = cycl_utilities.sentence_arg1(formula, UNPROVIDED);
            final SubLObject sentence_arg2 = cycl_utilities.sentence_arg2(formula, UNPROVIDED);
            final SubLObject new_formula = make_ternary_formula(new_predicate, sentence_pred, sentence_arg1, sentence_arg2);
            final SubLObject formula_status = (NIL != $sake_suppress_unviableP$.getDynamicValue(thread)) ? sake_formula_status(new_formula, mt) : NIL;
            if ((NIL == $sake_suppress_unviableP$.getDynamicValue(thread)) || (NIL != sake_viableP(formula_status))) {
                return list(list($EDIT_FORMULA, formula, list($MT, mt), listS($NEW_FORMULA, new_formula, list($MT, mt), append(formula_status, NIL)), strategy, tactics, skills));
            }
        }
        return NIL;
    }

    public static SubLObject sake_fix_change_formula_term(final SubLObject wff_module, final SubLObject predicate, final SubLObject arg, final SubLObject col, final SubLObject formula, final SubLObject mt, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != accessible_wf_fixP(wff_module, strategy, $CHANGE_TERM)) {
            final SubLObject tactics = $list101;
            final SubLObject skills = $list95;
            final SubLObject new_formula = subst($sym102$_NEW_TERM, arg, formula, UNPROVIDED, UNPROVIDED);
            final SubLObject constraint_formula = list($$ist, mt, list($$knownSentence, list(predicate, $sym102$_NEW_TERM, col)));
            final SubLObject use_preference = list($$conceptuallyRelated, $sym102$_NEW_TERM, arg);
            final SubLObject constraint_status = sake_formula_status(constraint_formula, mt);
            final SubLObject solicit_data = list(listS($SOLICIT_VARIABLE_BINDING, $sym102$_NEW_TERM, list($CONSTRAINTS, constraint_formula), list($PREFERENCES, use_preference), append(constraint_status, NIL)));
            if ((NIL == $sake_suppress_unviableP$.getDynamicValue(thread)) || (NIL != sake_viableP(constraint_status))) {
                return list(list($EDIT_FORMULA, formula, list($MT, mt), listS($NEW_FORMULA, new_formula, list($MT, mt), append(solicit_data, NIL)), strategy, tactics, skills));
            }
        }
        return NIL;
    }

    public static SubLObject sake_fix_change_formula_relation(final SubLObject wff_module, final SubLObject relation, final SubLObject argnum, final SubLObject arg, final SubLObject formula, final SubLObject mt, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != accessible_wf_fixP(wff_module, strategy, $CHANGE_RELATION)) {
            final SubLObject tactics = $list107;
            final SubLObject skills = $list95;
            final SubLObject new_formula = subst($sym108$_NEW_RELATION, relation, formula, UNPROVIDED, UNPROVIDED);
            final SubLObject args = cycl_utilities.formula_args(formula, UNPROVIDED);
            final SubLObject other_args = list_utilities.remove_nth(argnum, args);
            final SubLObject candidates = (NIL != list_utilities.singletonP(other_args)) ? ke_tools.legal_preds_of_forts_isa(arg, other_args.first(), UNPROVIDED) : NIL;
            final SubLObject min_candidates = (NIL != candidates) ? genl_predicates.min_predicates(candidates, mt, UNPROVIDED) : NIL;
            final SubLObject candidate_count = ((NIL != candidates) && length(min_candidates).numG($sake_candidate_threshold$.getDynamicValue(thread))) ? length(candidates) : NIL;
            final SubLObject promissing = promissing_relation_analogs(relation, mt);
            SubLObject solicit_data = NIL;
            if (NIL != promissing) {
                solicit_data = cons(cons($PROMISSING_BINDINGS, promissing), solicit_data);
            }
            if (NIL != candidate_count) {
                solicit_data = cons(list($CANDIDATE_COUNT, candidate_count), solicit_data);
            } else
                if (NIL != min_candidates) {
                    solicit_data = cons(bq_cons($MIN_CANDIDATES, append(min_candidates, NIL)), solicit_data);
                }

            solicit_data = cons(list($CONSTRAINTS, list($$ist, mt, list($$admittedArgument, $sym108$_NEW_RELATION, arg, argnum))), solicit_data);
            solicit_data = list(listS($SOLICIT_VARIABLE_BINDING, $sym108$_NEW_RELATION, append(solicit_data, NIL)));
            return list(list($EDIT_FORMULA, formula, list($MT, mt), listS($NEW_FORMULA, new_formula, list($MT, mt), append(solicit_data, NIL)), strategy, tactics, skills));
        }
        return NIL;
    }

    public static SubLObject sake_fix_weaken_formula_relation(final SubLObject wff_module, final SubLObject relation, final SubLObject argnum, final SubLObject arg, final SubLObject formula, final SubLObject mt, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != accessible_wf_fixP(wff_module, strategy, $WEAKEN_RELATION)) && (NIL != fort_types_interface.predicateP(relation))) {
            final SubLObject tactics = $list114;
            final SubLObject skills = $list95;
            final SubLObject new_formula = make_el_formula($sym115$_NEW_PREDICATE, cycl_utilities.formula_args(formula, UNPROVIDED), UNPROVIDED);
            final SubLObject min_candidates = (NIL != forts.fort_p(arg)) ? at_utilities.min_genl_preds_admitting_fort_as_arg(arg, argnum, relation, mt) : NIL;
            final SubLObject candidate_count = (length(min_candidates).numG($sake_candidate_threshold$.getDynamicValue(thread))) ? length(min_candidates) : NIL;
            SubLObject solicit_data = NIL;
            if (NIL != min_candidates) {
                solicit_data = cons(bq_cons($MIN_CANDIDATES, append(min_candidates, NIL)), solicit_data);
            } else
                if (NIL != candidate_count) {
                    solicit_data = cons(list($CANDIDATE_COUNT, candidate_count), solicit_data);
                }

            solicit_data = cons(list($CONSTRAINTS, list($$ist, mt, list($$and, listS($$genlPreds, relation, $list118), list($$admittedArgument, $sym115$_NEW_PREDICATE, arg, argnum)))), solicit_data);
            solicit_data = list(listS($SOLICIT_VARIABLE_BINDING, $sym115$_NEW_PREDICATE, append(solicit_data, NIL)));
            return list(list($EDIT_FORMULA, formula, list($MT, mt), listS($NEW_FORMULA, new_formula, list($MT, mt), $list119, append(solicit_data, NIL)), strategy, tactics, skills));
        }
        return NIL;
    }

    public static SubLObject sake_fix_change_formula_mt(final SubLObject wff_module, final SubLObject predicate, final SubLObject arg, final SubLObject col, final SubLObject formula, final SubLObject mt, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != accessible_wf_fixP(wff_module, strategy, $CHANGE_MT)) {
            final SubLObject tactics = $list121;
            final SubLObject skills = $list95;
            SubLObject solicit_data = NIL;
            SubLObject candidate_mts = NIL;
            SubLObject candidate_count = NIL;
            if (predicate.eql($$isa)) {
                candidate_mts = isa.max_floor_mts_of_isa_paths(arg, col, UNPROVIDED);
            } else
                if (predicate.eql($$genls)) {
                    candidate_mts = genls.max_floor_mts_of_genls_paths(arg, col, UNPROVIDED);
                }

            if (NIL != candidate_mts) {
                if (length(candidate_mts).numG($sake_candidate_threshold$.getDynamicValue(thread))) {
                    candidate_count = length(candidate_mts);
                }
                if (NIL != candidate_count) {
                    solicit_data = cons(list($CANDIDATE_COUNT, candidate_count), solicit_data);
                } else
                    if (NIL != candidate_mts) {
                        solicit_data = cons(bq_cons($MAX_CANDIDATES, append(candidate_mts, NIL)), solicit_data);
                    }

                solicit_data = list(listS($SOLICIT_VARIABLE_BINDING, $sym115$_NEW_PREDICATE, append(solicit_data, NIL)));
                return list(listS($CHANGE_FORMULA_MT, formula, list($FROM_MT, mt), $list125, append(solicit_data, list(strategy, tactics, skills))));
            }
        }
        return NIL;
    }

    public static SubLObject sake_fix_retract_formula(final SubLObject wff_module, final SubLObject formula, final SubLObject mt, final SubLObject strategy) {
        if (NIL != accessible_wf_fixP(wff_module, strategy, $RETRACT_FORMULA)) {
            final SubLObject tactics = $list127;
            final SubLObject skills = $list95;
            return list(list($RETRACT_FORMULA, formula, list($MT, mt), strategy, tactics, skills));
        }
        return NIL;
    }

    public static SubLObject sake_fix_weaken_arg_type_constraint(final SubLObject wff_module, final SubLObject predicate, final SubLObject arg, final SubLObject col, final SubLObject mt, final SubLObject formula, final SubLObject constraint_mt, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != accessible_wf_fixP(wff_module, strategy, $WEAKEN_CONSTRAINT)) {
            final SubLObject tactics = $list129;
            final SubLObject skills = $list81;
            final SubLObject new_formula = subst($sym130$_NEW_COL, col, formula, UNPROVIDED, UNPROVIDED);
            final SubLObject constraint_formula = list($$ist, mt, list($$knownSentence, list($$and, listS($$genls, col, $list131), listS(predicate, arg, $list131))));
            final SubLObject constraint_status = sake_formula_status(constraint_formula, mt);
            SubLObject min_candidates = NIL;
            if ((NIL == $sake_suppress_unviableP$.getDynamicValue(thread)) || (NIL != sake_viableP(constraint_status))) {
                if (predicate.eql($$isa)) {
                    min_candidates = min_isa_covering(arg, col, mt);
                } else
                    if (predicate.eql($$genls)) {
                        min_candidates = genls.min_ceiling_cols(list(arg, col), NIL, mt, UNPROVIDED);
                    }

                if (NIL != min_candidates) {
                    final SubLObject candidate_count = (length(min_candidates).numG($sake_candidate_threshold$.getDynamicValue(thread))) ? length(min_candidates) : NIL;
                    SubLObject solicit_data = NIL;
                    if (NIL != candidate_count) {
                        solicit_data = cons(list($CANDIDATE_COUNT, candidate_count), solicit_data);
                    } else
                        if (NIL != min_candidates) {
                            solicit_data = cons(bq_cons($MIN_CANDIDATES, append(min_candidates, NIL)), solicit_data);
                        }

                    solicit_data = cons(listS($CONSTRAINTS, constraint_formula, append(constraint_status, NIL)), solicit_data);
                    solicit_data = list(listS($SOLICIT_VARIABLE_BINDING, $sym130$_NEW_COL, append(solicit_data, NIL)));
                    return list(list($EDIT_ASSERTION, formula, list($MT, constraint_mt), listS($NEW_FORMULA, new_formula, list($MT, constraint_mt), $list119, append(solicit_data, NIL)), strategy, tactics, skills));
                }
            }
        }
        return NIL;
    }

    public static SubLObject sake_fix_change_arg_type_constraint(final SubLObject wff_module, final SubLObject predicate, final SubLObject arg, final SubLObject col, final SubLObject mt, final SubLObject formula, final SubLObject constraint_mt, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != accessible_wf_fixP(wff_module, strategy, $CHANGE_CONSTRAINT)) {
            final SubLObject tactics = $list134;
            final SubLObject skills = $list81;
            final SubLObject new_formula = subst($sym130$_NEW_COL, col, formula, UNPROVIDED, UNPROVIDED);
            final SubLObject constraint_formula = list($$ist, mt, list($$knownSentence, listS(predicate, arg, $list131)));
            final SubLObject constraint_status = sake_formula_status(constraint_formula, mt);
            if ((NIL == $sake_suppress_unviableP$.getDynamicValue(thread)) || (NIL != sake_viableP(constraint_status))) {
                final SubLObject min_candidates = (NIL != forts.fort_p(arg)) ? isa.min_isa(arg, mt, UNPROVIDED) : NIL;
                final SubLObject candidate_count = (length(min_candidates).numG($sake_candidate_threshold$.getDynamicValue(thread))) ? length(min_candidates) : NIL;
                SubLObject solicit_data = NIL;
                if (NIL != candidate_count) {
                    solicit_data = cons(list($CANDIDATE_COUNT, candidate_count), solicit_data);
                } else
                    if (NIL != min_candidates) {
                        solicit_data = cons(bq_cons($MIN_CANDIDATES, append(min_candidates, NIL)), solicit_data);
                    }

                solicit_data = cons(listS($CONSTRAINTS, constraint_formula, append(constraint_status, NIL)), solicit_data);
                solicit_data = list(listS($SOLICIT_VARIABLE_BINDING, $sym130$_NEW_COL, append(solicit_data, NIL)));
                return list(list($EDIT_ASSERTION, formula, list($MT, constraint_mt), listS($NEW_FORMULA, new_formula, list($MT, constraint_mt), append(solicit_data, NIL)), strategy, tactics, skills));
            }
        }
        return NIL;
    }

    public static SubLObject sake_fix_unassert_constraint(final SubLObject wff_module, final SubLObject formula, final SubLObject mt, final SubLObject strategy) {
        if (NIL != accessible_wf_fixP(wff_module, strategy, $UNASSERT_CONSTRAINT)) {
            final SubLObject tactics = $list121;
            final SubLObject skills = $list81;
            return list(list($UNASSERT, formula, list($MT, mt), strategy, tactics, skills));
        }
        return NIL;
    }

    public static SubLObject sake_fix_change_constraint_mt(final SubLObject wff_module, final SubLObject mt, final SubLObject formula, final SubLObject constraint_mt, final SubLObject strategy) {
        if (NIL != accessible_wf_fixP(wff_module, strategy, $CHANGE_MT)) {
            final SubLObject tactics = $list121;
            final SubLObject skills = $list81;
            final SubLObject solicit_data = list(list($SOLICIT_VARIABLE_BINDING, $sym137$_NEW_MT, list($CONSTRAINTS, list($$unknownSentence, listS($$genlMt, mt, $list140)))));
            return list(listS($CHANGE_ASSERTION_MT, formula, list($FROM_MT, constraint_mt), $list125, append(solicit_data, list(strategy, tactics, skills))));
        }
        return NIL;
    }

    public static SubLObject sake_fix_deny_constraint_applies_to_spec_pred(final SubLObject wff_module, final SubLObject relation, final SubLObject mt, final SubLObject via_genl_pred, final SubLObject strategy) {
        if (((NIL != via_genl_pred) && (NIL != accessible_wf_fixP(wff_module, strategy, $DENY_HL_SUPPORT))) && (NIL != fort_types_interface.predicateP(relation))) {
            final SubLObject tactics = $list143;
            final SubLObject skills = $list81;
            final SubLObject genl_preds_literal = list($$genlPreds, relation, via_genl_pred);
            final SubLObject genl_pred_support = arguments.make_hl_support($GENLPREDS, genl_preds_literal, mt, UNPROVIDED);
            return list(list($DENY_HL_SUPPORT, genl_pred_support, strategy, tactics, skills));
        }
        return NIL;
    }

    public static SubLObject sake_fix_deny_hl_literal(final SubLObject wff_module, final SubLObject module, final SubLObject literal, final SubLObject mt, final SubLObject strategy) {
        if (NIL != accessible_wf_fixP(wff_module, strategy, $DENY_HL_SUPPORT)) {
            final SubLObject tactics = $list145;
            final SubLObject skills = $list81;
            final SubLObject hl_support = arguments.make_hl_support(module, literal, mt, UNPROVIDED);
            return list(list($DENY_HL_SUPPORT, hl_support, strategy, tactics, skills));
        }
        return NIL;
    }

    public static SubLObject accessible_wf_fixP(SubLObject module, SubLObject strategy, SubLObject tactic) {
        if (module == UNPROVIDED) {
            module = NIL;
        }
        if (strategy == UNPROVIDED) {
            strategy = NIL;
        }
        if (tactic == UNPROVIDED) {
            tactic = NIL;
        }
        return makeBoolean((((NIL == module) || (NIL != accessible_wf_fix_moduleP(module))) && ((NIL == strategy) || (NIL != accessible_wf_fix_strategyP(strategy)))) && ((NIL == tactic) || (NIL != accessible_wf_fix_tacticP(tactic))));
    }

    public static SubLObject accessible_wf_fix_moduleP(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean($ALL.eql($accessible_wf_fix_modules$.getDynamicValue(thread)) || (NIL != subl_promotions.memberP(module, $accessible_wf_fix_modules$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject accessible_wf_fix_strategyP(final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean($ALL.eql($accessible_wf_fix_strategies$.getDynamicValue(thread)) || (NIL != subl_promotions.memberP(strategy, $accessible_wf_fix_strategies$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject accessible_wf_fix_tacticP(final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean($ALL.eql($accessible_wf_fix_tactics$.getDynamicValue(thread)) || (NIL != subl_promotions.memberP(tactic, $accessible_wf_fix_tactics$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject sake_viableP(final SubLObject sake_data) {
        return makeBoolean(NIL == list_utilities.tree_find($UNVIABLE, sake_data, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject sake_formula_status(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject formula_status = copy_list(sake_formula_consistency_status(formula, mt));
        final SubLObject _prev_bind_0 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
        try {
            wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
            if (NIL != wff.el_wffP(formula, mt, UNPROVIDED)) {
                formula_status = cons($list148, formula_status);
            } else {
                formula_status = cons(list($WHY_NOT_WFF, wff.why_not_wff(formula, mt, UNPROVIDED)), formula_status);
            }
        } finally {
            wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_0, thread);
        }
        if ((NIL != list_utilities.tree_find($WHY_NOT_WFF, formula_status, UNPROVIDED, UNPROVIDED)) || (NIL != list_utilities.tree_find($WHY_NOT_CONSISTENT, formula_status, UNPROVIDED, UNPROVIDED))) {
            formula_status = cons($list151, formula_status);
        }
        return nreverse(formula_status);
    }

    public static SubLObject sake_formula_consistency_status(final SubLObject formula, final SubLObject mt) {
        final SubLObject pcase_var;
        final SubLObject relation = pcase_var = cycl_utilities.formula_arg0(formula);
        if (pcase_var.eql($$ist)) {
            return sake_formula_consistency_status(cycl_utilities.formula_arg2(formula, UNPROVIDED), cycl_utilities.formula_arg1(formula, UNPROVIDED));
        }
        if (pcase_var.eql($$knownSentence) || pcase_var.eql($$unknownSentence)) {
            return sake_formula_consistency_status(cycl_utilities.formula_arg1(formula, UNPROVIDED), mt);
        }
        if (pcase_var.eql($$and)) {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = cycl_utilities.formula_args(formula, UNPROVIDED);
            SubLObject conjunct = NIL;
            conjunct = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject item_var = sake_formula_consistency_status(conjunct, mt);
                if (NIL == member(item_var, result, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    result = cons(item_var, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                conjunct = cdolist_list_var.first();
            } 
            return result;
        }
        if (NIL == closedP(formula, $sym152$CYC_VAR_)) {
            return $list154;
        }
        final SubLObject pcase_var_$1 = relation;
        if (pcase_var_$1.eql($$isa)) {
            final SubLObject v_term = cycl_utilities.formula_arg1(formula, UNPROVIDED);
            final SubLObject col = cycl_utilities.formula_arg2(formula, UNPROVIDED);
            if (NIL != isa.not_isaP(v_term, col, mt, UNPROVIDED)) {
                return list(list($WHY_NOT_CONSISTENT, isa.why_not_isaP(v_term, col, mt, UNPROVIDED, UNPROVIDED)));
            }
            return $list153;
        } else
            if (pcase_var_$1.eql($$genls)) {
                final SubLObject v_term = cycl_utilities.formula_arg1(formula, UNPROVIDED);
                final SubLObject col = cycl_utilities.formula_arg2(formula, UNPROVIDED);
                if (NIL != genls.not_genlP(v_term, col, mt, UNPROVIDED)) {
                    return list(list($WHY_NOT_CONSISTENT, genls.why_not_genlP(v_term, col, mt, UNPROVIDED, UNPROVIDED)));
                }
                return $list153;
            } else {
                if (NIL != fi.fi_ask_int(cycl_utilities.negate(formula), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    return list(list($WHY_NOT_CONSISTENT, fi.fi_justify_int(cycl_utilities.negate(formula), mt, UNPROVIDED)));
                }
                return $list153;
            }

    }

    public static SubLObject promissing_relation_analogs(final SubLObject rel, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject promissing_via_expansion_inverses = promissing_relation_analogs_via_contractions(rel, mt);
        return promissing_via_expansion_inverses;
    }

    public static SubLObject promissing_relation_analogs_via_contractions(final SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $mapping_answer$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $target_relation$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            $mapping_answer$.bind(NIL, thread);
            $target_relation$.bind(relation, thread);
            kb_mapping.map_other_index(GATHER_CONTRACTIONS_INT, relation, $TRUE, T);
            result = $mapping_answer$.getDynamicValue(thread);
        } finally {
            $target_relation$.rebind(_prev_bind_4, thread);
            $mapping_answer$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject gather_contractions_int(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = assertions_high.gaf_arg0(assertion);
        if (predicate.eql($$expansion) && (NIL != list_utilities.tree_find_if(symbol_function($sym158$TARGET_RELATION_EXPRESSION_), assertions_high.gaf_arg2(assertion), UNPROVIDED))) {
            $mapping_answer$.setDynamicValue(cons(list(assertions_high.gaf_arg1(assertion), list($SOURCE, assertion)), $mapping_answer$.getDynamicValue(thread)), thread);
        }
        return NIL;
    }

    public static SubLObject target_relation_expressionP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != el_formula_p(formula)) {
            return eql(cycl_utilities.formula_arg0(formula), $target_relation$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static SubLObject min_isa_covering(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = isa.min_isa(v_term, mt, UNPROVIDED);
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = nunion(result, genls.min_ceiling_cols(list(v_isa, collection), NIL, mt, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        } 
        return genls.min_cols(result, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject declare_wff_suggest_file() {
        declareFunction(me, "non_wffness_repairs", "NON-WFFNESS-REPAIRS", 2, 0, false);
        declareFunction(me, "wff_violations_repairs", "WFF-VIOLATIONS-REPAIRS", 1, 0, false);
        declareFunction(me, "suggestions_for_mal_arg_wrt_arg_isa", "SUGGESTIONS-FOR-MAL-ARG-WRT-ARG-ISA", 1, 1, false);
        declareFunction(me, "suggestions_for_mal_arg_wrt_arg_not_isa_disjoint", "SUGGESTIONS-FOR-MAL-ARG-WRT-ARG-NOT-ISA-DISJOINT", 1, 1, false);
        declareFunction(me, "suggestions_for_mal_arg_wrt_arg_genl", "SUGGESTIONS-FOR-MAL-ARG-WRT-ARG-GENL", 1, 1, false);
        declareFunction(me, "sake_fix_arg_isa_via_make_it_so", "SAKE-FIX-ARG-ISA-VIA-MAKE-IT-SO", 4, 0, false);
        declareFunction(me, "sake_fix_arg_isa_disjoint_via_make_it_unknown", "SAKE-FIX-ARG-ISA-DISJOINT-VIA-MAKE-IT-UNKNOWN", 4, 0, false);
        declareFunction(me, "sake_fix_arg_genl_via_make_it_so", "SAKE-FIX-ARG-GENL-VIA-MAKE-IT-SO", 4, 0, false);
        declareFunction(me, "sake_fix_arg_type_via_make_exception", "SAKE-FIX-ARG-TYPE-VIA-MAKE-EXCEPTION", 4, 0, false);
        declareFunction(me, "sake_fix_arg_type_via_correct_formula", "SAKE-FIX-ARG-TYPE-VIA-CORRECT-FORMULA", 8, 0, false);
        declareFunction(me, "sake_fix_via_deny_constraint_applicability", "SAKE-FIX-VIA-DENY-CONSTRAINT-APPLICABILITY", 6, 0, false);
        declareFunction(me, "sake_fix_arg_type_via_correct_constraint", "SAKE-FIX-ARG-TYPE-VIA-CORRECT-CONSTRAINT", 7, 0, false);
        declareFunction(me, "sake_fix_assert_gaf2", "SAKE-FIX-ASSERT-GAF2", 6, 0, false);
        declareFunction(me, "sake_fix_edit_sufficient_defn", "SAKE-FIX-EDIT-SUFFICIENT-DEFN", 5, 0, false);
        declareFunction(me, "sake_fix_solicit_sufficient_defn", "SAKE-FIX-SOLICIT-SUFFICIENT-DEFN", 5, 0, false);
        declareFunction(me, "sake_fix_assert_arg_except_for", "SAKE-FIX-ASSERT-ARG-EXCEPT-FOR", 5, 0, false);
        declareFunction(me, "sake_fix_assert_arg_except_when", "SAKE-FIX-ASSERT-ARG-EXCEPT-WHEN", 5, 0, false);
        declareFunction(me, "sake_fix_change_formula_level", "SAKE-FIX-CHANGE-FORMULA-LEVEL", 9, 0, false);
        declareFunction(me, "sake_fix_change_formula_term", "SAKE-FIX-CHANGE-FORMULA-TERM", 7, 0, false);
        declareFunction(me, "sake_fix_change_formula_relation", "SAKE-FIX-CHANGE-FORMULA-RELATION", 7, 0, false);
        declareFunction(me, "sake_fix_weaken_formula_relation", "SAKE-FIX-WEAKEN-FORMULA-RELATION", 7, 0, false);
        declareFunction(me, "sake_fix_change_formula_mt", "SAKE-FIX-CHANGE-FORMULA-MT", 7, 0, false);
        declareFunction(me, "sake_fix_retract_formula", "SAKE-FIX-RETRACT-FORMULA", 4, 0, false);
        declareFunction(me, "sake_fix_weaken_arg_type_constraint", "SAKE-FIX-WEAKEN-ARG-TYPE-CONSTRAINT", 8, 0, false);
        declareFunction(me, "sake_fix_change_arg_type_constraint", "SAKE-FIX-CHANGE-ARG-TYPE-CONSTRAINT", 8, 0, false);
        declareFunction(me, "sake_fix_unassert_constraint", "SAKE-FIX-UNASSERT-CONSTRAINT", 4, 0, false);
        declareFunction(me, "sake_fix_change_constraint_mt", "SAKE-FIX-CHANGE-CONSTRAINT-MT", 5, 0, false);
        declareFunction(me, "sake_fix_deny_constraint_applies_to_spec_pred", "SAKE-FIX-DENY-CONSTRAINT-APPLIES-TO-SPEC-PRED", 5, 0, false);
        declareFunction(me, "sake_fix_deny_hl_literal", "SAKE-FIX-DENY-HL-LITERAL", 5, 0, false);
        declareFunction(me, "accessible_wf_fixP", "ACCESSIBLE-WF-FIX?", 0, 3, false);
        declareFunction(me, "accessible_wf_fix_moduleP", "ACCESSIBLE-WF-FIX-MODULE?", 1, 0, false);
        declareFunction(me, "accessible_wf_fix_strategyP", "ACCESSIBLE-WF-FIX-STRATEGY?", 1, 0, false);
        declareFunction(me, "accessible_wf_fix_tacticP", "ACCESSIBLE-WF-FIX-TACTIC?", 1, 0, false);
        declareFunction(me, "sake_viableP", "SAKE-VIABLE?", 1, 0, false);
        declareFunction(me, "sake_formula_status", "SAKE-FORMULA-STATUS", 2, 0, false);
        declareFunction(me, "sake_formula_consistency_status", "SAKE-FORMULA-CONSISTENCY-STATUS", 2, 0, false);
        declareFunction(me, "promissing_relation_analogs", "PROMISSING-RELATION-ANALOGS", 1, 1, false);
        declareFunction(me, "promissing_relation_analogs_via_contractions", "PROMISSING-RELATION-ANALOGS-VIA-CONTRACTIONS", 1, 1, false);
        declareFunction(me, "gather_contractions_int", "GATHER-CONTRACTIONS-INT", 1, 0, false);
        declareFunction(me, "target_relation_expressionP", "TARGET-RELATION-EXPRESSION?", 1, 0, false);
        declareFunction(me, "min_isa_covering", "MIN-ISA-COVERING", 2, 1, false);
        return NIL;
    }

    public static SubLObject init_wff_suggest_file() {
        defparameter("*SAKE-CANDIDATE-THRESHOLD*", TEN_INTEGER);
        defparameter("*SAKE-SUPPRESS-UNVIABLE?*", T);
        defparameter("*ACCESSIBLE-WF-FIX-MODULES*", $ALL);
        defparameter("*ACCESSIBLE-WF-FIX-STRATEGIES*", $ALL);
        defparameter("*ACCESSIBLE-WF-FIX-TACTICS*", $ALL);
        defparameter("*TARGET-RELATION*", NIL);
        return NIL;
    }

    public static SubLObject setup_wff_suggest_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_wff_suggest_file();
    }

    @Override
    public void initializeVariables() {
        init_wff_suggest_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_wff_suggest_file();
    }

    
}

/**
 * Total time: 635 ms
 */
