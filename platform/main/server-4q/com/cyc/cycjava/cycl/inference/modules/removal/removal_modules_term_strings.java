package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.pph_methods_lexicon;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_term_strings extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "efd131bd0a0ae7a325638a5a4585b292477ff7ba1762dc53f7ed032ef4d1421b";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 4000L)
    public static SubLSymbol $term_strings_defining_mt$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 4200L)
    private static SubLSymbol $term_strings_check_default_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 4300L)
    private static SubLSymbol $term_strings_unify_default_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 5300L)
    private static SubLSymbol $expected_number_of_terms_per_string$;
    private static SubLObject $$termStrings;
    private static SubLSymbol $TERMSTRINGS_X_Y_POS;
    private static SubLList $list2;
    private static SubLSymbol $REMOVAL_TERM_STRINGS_CHECK_POS;
    private static SubLList $list4;
    private static SubLSymbol $REMOVAL_TERM_STRINGS_CHECK_NEG;
    private static SubLList $list6;
    private static SubLSymbol $ALL;
    private static SubLSymbol $sym8$_TERM_STRINGS_DEFINING_MT_;
    private static SubLObject $$BaseKB;
    private static SubLSymbol $OPAQUE;
    private static SubLSymbol $TRUE_MON;
    private static SubLSymbol $REMOVAL_TERM_STRINGS_UNIFY;
    private static SubLList $list13;
    private static SubLSymbol $REMOVAL_TERM_STRINGS_LOOKUP;
    private static SubLList $list15;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 1200L)
    public static SubLObject removal_term_strings_check_pos_output_check(SubLObject v_term, SubLObject string) {
        return makeBoolean(NIL != list_utilities.member_equalP(string, inference_strings_for_term(v_term, UNPROVIDED, UNPROVIDED)) || NIL != list_utilities.member_equalP(v_term, inference_terms_for_string(string)));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 2000L)
    public static SubLObject removal_term_strings_check_neg_output_check(SubLObject v_term, SubLObject string) {
        return makeBoolean(NIL == removal_term_strings_check_pos_output_check(v_term, string));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 3500L)
    public static SubLObject inference_strings_for_term(SubLObject v_term, SubLObject nl_preds, SubLObject lexical_onlyP) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ALL;
        }
        if (lexical_onlyP == UNPROVIDED) {
            lexical_onlyP = NIL;
        }
        return pph_methods_lexicon.inference_strings_for_term_int(v_term, nl_preds, lexical_onlyP, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 3800L)
    public static SubLObject inference_terms_for_string(SubLObject string) {
        return lexicon_accessors.all_parsing_denots_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 4100L)
    public static SubLObject make_term_strings_hl_support(SubLObject formula) {
        return arguments.make_hl_support($OPAQUE, formula, $term_strings_defining_mt$.getGlobalValue(), $TRUE_MON);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 4400L)
    public static SubLObject removal_term_strings_unify_output_generate(SubLObject v_term) {
        return iteration.new_list_iterator(inference_strings_for_term(v_term, UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 5400L)
    public static SubLObject removal_term_strings_lookup_output_generate(SubLObject string) {
        return iteration.new_list_iterator(inference_terms_for_string(string));
    }

    public static SubLObject declare_removal_modules_term_strings_file() {
        declareFunction("removal_term_strings_check_pos_output_check", "REMOVAL-TERM-STRINGS-CHECK-POS-OUTPUT-CHECK", 2, 0, false);
        declareFunction("removal_term_strings_check_neg_output_check", "REMOVAL-TERM-STRINGS-CHECK-NEG-OUTPUT-CHECK", 2, 0, false);
        declareFunction("inference_strings_for_term", "INFERENCE-STRINGS-FOR-TERM", 1, 2, false);
        declareFunction("inference_terms_for_string", "INFERENCE-TERMS-FOR-STRING", 1, 0, false);
        declareFunction("make_term_strings_hl_support", "MAKE-TERM-STRINGS-HL-SUPPORT", 1, 0, false);
        declareFunction("removal_term_strings_unify_output_generate", "REMOVAL-TERM-STRINGS-UNIFY-OUTPUT-GENERATE", 1, 0, false);
        declareFunction("removal_term_strings_lookup_output_generate", "REMOVAL-TERM-STRINGS-LOOKUP-OUTPUT-GENERATE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_term_strings_file() {
        $term_strings_defining_mt$ = deflexical("*TERM-STRINGS-DEFINING-MT*", maybeDefault($sym8$_TERM_STRINGS_DEFINING_MT_, $term_strings_defining_mt$, $$BaseKB));
        $term_strings_check_default_cost$ = deflexical("*TERM-STRINGS-CHECK-DEFAULT-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        $term_strings_unify_default_cost$ = deflexical("*TERM-STRINGS-UNIFY-DEFAULT-COST*", ONE_INTEGER);
        $expected_number_of_terms_per_string$ = deflexical("*EXPECTED-NUMBER-OF-TERMS-PER-STRING*", ONE_INTEGER);
        return NIL;
    }

    public static SubLObject setup_removal_modules_term_strings_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$termStrings);
        preference_modules.inference_preference_module($TERMSTRINGS_X_Y_POS, $list2);
        inference_modules.inference_removal_module($REMOVAL_TERM_STRINGS_CHECK_POS, $list4);
        inference_modules.inference_removal_module($REMOVAL_TERM_STRINGS_CHECK_NEG, $list6);
        subl_macro_promotions.declare_defglobal($sym8$_TERM_STRINGS_DEFINING_MT_);
        mt_vars.note_mt_var($sym8$_TERM_STRINGS_DEFINING_MT_, $$termStrings);
        inference_modules.inference_removal_module($REMOVAL_TERM_STRINGS_UNIFY, $list13);
        inference_modules.inference_removal_module($REMOVAL_TERM_STRINGS_LOOKUP, $list15);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_term_strings_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_term_strings_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_term_strings_file();
    }

    static {
        me = new removal_modules_term_strings();
        $term_strings_defining_mt$ = null;
        $term_strings_check_default_cost$ = null;
        $term_strings_unify_default_cost$ = null;
        $expected_number_of_terms_per_string$ = null;
        $$termStrings = makeConstSym(("termStrings"));
        $TERMSTRINGS_X_Y_POS = makeKeyword("TERMSTRINGS-X-Y-POS");
        $list2 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("termStrings")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("termStrings")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_TERM_STRINGS_CHECK_POS = makeKeyword("REMOVAL-TERM-STRINGS-CHECK-POS");
        $list4 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("termStrings")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("termStrings")), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*TERM-STRINGS-CHECK-DEFAULT-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("termStrings")), list(makeKeyword("BIND"), makeSymbol("TERM")), list(makeKeyword("BIND"), makeSymbol("STRING"))), list(list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("STRING")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("TERM"), makeSymbol("STRING")), list(makeKeyword("CALL"), makeSymbol("REMOVAL-TERM-STRINGS-CHECK-POS-OUTPUT-CHECK"), list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("STRING")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TERM-PHRASES"), makeKeyword("DOCUMENTATION"), makeString("(#$termStrings <fully-bound-p> <stringp>)"), makeKeyword("EXAMPLE"), makeString("(#$termStrings #$Dog \"Dog\")") });
        $REMOVAL_TERM_STRINGS_CHECK_NEG = makeKeyword("REMOVAL-TERM-STRINGS-CHECK-NEG");
        $list6 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("termStrings")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("termStrings")), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*TERM-STRINGS-CHECK-DEFAULT-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("termStrings")), list(makeKeyword("BIND"), makeSymbol("TERM")), list(makeKeyword("BIND"), makeSymbol("STRING"))), list(list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("STRING")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("TERM"), makeSymbol("STRING")), list(makeKeyword("CALL"), makeSymbol("REMOVAL-TERM-STRINGS-CHECK-NEG-OUTPUT-CHECK"), list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("STRING")))), makeKeyword("SUPPORT"),
                makeKeyword("TERM-PHRASES"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$termStrings <fully-bound-p> <stringp>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$termStrings #$Dog \"Cat\"))") });
        $ALL = makeKeyword("ALL");
        $sym8$_TERM_STRINGS_DEFINING_MT_ = makeSymbol("*TERM-STRINGS-DEFINING-MT*");
        $$BaseKB = makeConstSym(("BaseKB"));
        $OPAQUE = makeKeyword("OPAQUE");
        $TRUE_MON = makeKeyword("TRUE-MON");
        $REMOVAL_TERM_STRINGS_UNIFY = makeKeyword("REMOVAL-TERM-STRINGS-UNIFY");
        $list13 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("termStrings")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("termStrings")), makeKeyword("FULLY-BOUND"), makeKeyword("VARIABLE")), makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("COST-EXPRESSION"), makeSymbol("*TERM-STRINGS-UNIFY-DEFAULT-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("termStrings")), list(makeKeyword("BIND"), makeSymbol("TERM")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TERM"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-TERM-STRINGS-UNIFY-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("termStrings")), list(makeKeyword("VALUE"), makeSymbol("TERM")), makeKeyword("INPUT")),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TERM-PHRASES"), makeKeyword("DOCUMENTATION"), makeString("(#$termStrings <fully-bound-p> <variable-p>)"), makeKeyword("EXAMPLE"), makeString("(#$termStrings #$Dog ?STRING)") });
        $REMOVAL_TERM_STRINGS_LOOKUP = makeKeyword("REMOVAL-TERM-STRINGS-LOOKUP");
        $list15 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("termStrings")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("termStrings")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*EXPECTED-NUMBER-OF-TERMS-PER-STRING*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("termStrings")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("STRING"))), list(makeKeyword("VALUE"), makeSymbol("STRING"))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-TERM-STRINGS-LOOKUP-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("termStrings")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("STRING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TERM-PHRASES"), makeKeyword("DOCUMENTATION"), makeString("(#$termStrings <not-fully-bound-p> <stringp>)"), makeKeyword("EXAMPLE"),
                makeString("(#$termStrings ?TERM \"Dog\")") });
    }
}
/*
 *
 * Total time: 40 ms
 *
 */