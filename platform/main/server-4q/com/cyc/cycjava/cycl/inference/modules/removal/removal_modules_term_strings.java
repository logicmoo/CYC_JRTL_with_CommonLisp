package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$hl_module_check_cost$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.pph_methods_lexicon;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_term_strings extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_term_strings();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_term_strings";

    public static final String myFingerPrint = "efd131bd0a0ae7a325638a5a4585b292477ff7ba1762dc53f7ed032ef4d1421b";



    // deflexical
    private static final SubLSymbol $term_strings_check_default_cost$ = makeSymbol("*TERM-STRINGS-CHECK-DEFAULT-COST*");

    // deflexical
    private static final SubLSymbol $term_strings_unify_default_cost$ = makeSymbol("*TERM-STRINGS-UNIFY-DEFAULT-COST*");

    // deflexical
    private static final SubLSymbol $expected_number_of_terms_per_string$ = makeSymbol("*EXPECTED-NUMBER-OF-TERMS-PER-STRING*");

    private static final SubLObject $$termStrings = reader_make_constant_shell(makeString("termStrings"));

    private static final SubLSymbol $TERMSTRINGS_X_Y_POS = makeKeyword("TERMSTRINGS-X-Y-POS");

    public static final SubLList $list2 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("termStrings")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("termStrings")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_TERM_STRINGS_CHECK_POS = makeKeyword("REMOVAL-TERM-STRINGS-CHECK-POS");

    public static final SubLList $list4 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("termStrings")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("termStrings")), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*TERM-STRINGS-CHECK-DEFAULT-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("termStrings")), list(makeKeyword("BIND"), makeSymbol("TERM")), list(makeKeyword("BIND"), makeSymbol("STRING"))), list(list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("STRING")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TERM"), makeSymbol("STRING")), list(makeKeyword("CALL"), makeSymbol("REMOVAL-TERM-STRINGS-CHECK-POS-OUTPUT-CHECK"), list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("STRING")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TERM-PHRASES"), makeKeyword("DOCUMENTATION"), makeString("(#$termStrings <fully-bound-p> <stringp>)"), makeKeyword("EXAMPLE"), makeString("(#$termStrings #$Dog \"Dog\")") });

    private static final SubLSymbol $REMOVAL_TERM_STRINGS_CHECK_NEG = makeKeyword("REMOVAL-TERM-STRINGS-CHECK-NEG");

    public static final SubLList $list6 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("termStrings")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("termStrings")), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*TERM-STRINGS-CHECK-DEFAULT-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("termStrings")), list(makeKeyword("BIND"), makeSymbol("TERM")), list(makeKeyword("BIND"), makeSymbol("STRING"))), list(list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("STRING")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TERM"), makeSymbol("STRING")), list(makeKeyword("CALL"), makeSymbol("REMOVAL-TERM-STRINGS-CHECK-NEG-OUTPUT-CHECK"), list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("STRING")))), makeKeyword("SUPPORT"), makeKeyword("TERM-PHRASES"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$termStrings <fully-bound-p> <stringp>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$termStrings #$Dog \"Cat\"))") });



    public static final SubLSymbol $term_strings_defining_mt$ = makeSymbol("*TERM-STRINGS-DEFINING-MT*");

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));





    private static final SubLSymbol $REMOVAL_TERM_STRINGS_UNIFY = makeKeyword("REMOVAL-TERM-STRINGS-UNIFY");

    public static final SubLList $list13 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("termStrings")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("termStrings")), makeKeyword("FULLY-BOUND"), makeKeyword("VARIABLE")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("COST-EXPRESSION"), makeSymbol("*TERM-STRINGS-UNIFY-DEFAULT-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("termStrings")), list(makeKeyword("BIND"), makeSymbol("TERM")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TERM"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-TERM-STRINGS-UNIFY-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("termStrings")), list(makeKeyword("VALUE"), makeSymbol("TERM")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TERM-PHRASES"), makeKeyword("DOCUMENTATION"), makeString("(#$termStrings <fully-bound-p> <variable-p>)"), makeKeyword("EXAMPLE"), makeString("(#$termStrings #$Dog ?STRING)") });

    private static final SubLSymbol $REMOVAL_TERM_STRINGS_LOOKUP = makeKeyword("REMOVAL-TERM-STRINGS-LOOKUP");

    public static final SubLList $list15 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("termStrings")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("termStrings")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPECTED-NUMBER-OF-TERMS-PER-STRING*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("termStrings")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("STRING"))), list(makeKeyword("VALUE"), makeSymbol("STRING"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-TERM-STRINGS-LOOKUP-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("termStrings")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("STRING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TERM-PHRASES"), makeKeyword("DOCUMENTATION"), makeString("(#$termStrings <not-fully-bound-p> <stringp>)"), makeKeyword("EXAMPLE"), makeString("(#$termStrings ?TERM \"Dog\")") });

    public static SubLObject removal_term_strings_check_pos_output_check(final SubLObject v_term, final SubLObject string) {
        return makeBoolean((NIL != list_utilities.member_equalP(string, inference_strings_for_term(v_term, UNPROVIDED, UNPROVIDED))) || (NIL != list_utilities.member_equalP(v_term, inference_terms_for_string(string))));
    }

    public static SubLObject removal_term_strings_check_neg_output_check(final SubLObject v_term, final SubLObject string) {
        return makeBoolean(NIL == removal_term_strings_check_pos_output_check(v_term, string));
    }

    public static SubLObject inference_strings_for_term(final SubLObject v_term, SubLObject nl_preds, SubLObject lexical_onlyP) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ALL;
        }
        if (lexical_onlyP == UNPROVIDED) {
            lexical_onlyP = NIL;
        }
        return pph_methods_lexicon.inference_strings_for_term_int(v_term, nl_preds, lexical_onlyP, UNPROVIDED);
    }

    public static SubLObject inference_terms_for_string(final SubLObject string) {
        return lexicon_accessors.all_parsing_denots_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject make_term_strings_hl_support(final SubLObject formula) {
        return arguments.make_hl_support($OPAQUE, formula, $term_strings_defining_mt$.getGlobalValue(), $TRUE_MON);
    }

    public static SubLObject removal_term_strings_unify_output_generate(final SubLObject v_term) {
        return iteration.new_list_iterator(inference_strings_for_term(v_term, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject removal_term_strings_lookup_output_generate(final SubLObject string) {
        return iteration.new_list_iterator(inference_terms_for_string(string));
    }

    public static SubLObject declare_removal_modules_term_strings_file() {
        declareFunction(me, "removal_term_strings_check_pos_output_check", "REMOVAL-TERM-STRINGS-CHECK-POS-OUTPUT-CHECK", 2, 0, false);
        declareFunction(me, "removal_term_strings_check_neg_output_check", "REMOVAL-TERM-STRINGS-CHECK-NEG-OUTPUT-CHECK", 2, 0, false);
        declareFunction(me, "inference_strings_for_term", "INFERENCE-STRINGS-FOR-TERM", 1, 2, false);
        declareFunction(me, "inference_terms_for_string", "INFERENCE-TERMS-FOR-STRING", 1, 0, false);
        declareFunction(me, "make_term_strings_hl_support", "MAKE-TERM-STRINGS-HL-SUPPORT", 1, 0, false);
        declareFunction(me, "removal_term_strings_unify_output_generate", "REMOVAL-TERM-STRINGS-UNIFY-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_term_strings_lookup_output_generate", "REMOVAL-TERM-STRINGS-LOOKUP-OUTPUT-GENERATE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_term_strings_file() {
        deflexical("*TERM-STRINGS-DEFINING-MT*", SubLTrampolineFile.maybeDefault($term_strings_defining_mt$, $term_strings_defining_mt$, $$BaseKB));
        deflexical("*TERM-STRINGS-CHECK-DEFAULT-COST*", $hl_module_check_cost$.getDynamicValue());
        deflexical("*TERM-STRINGS-UNIFY-DEFAULT-COST*", ONE_INTEGER);
        deflexical("*EXPECTED-NUMBER-OF-TERMS-PER-STRING*", ONE_INTEGER);
        return NIL;
    }

    public static SubLObject setup_removal_modules_term_strings_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$termStrings);
        preference_modules.inference_preference_module($TERMSTRINGS_X_Y_POS, $list2);
        inference_modules.inference_removal_module($REMOVAL_TERM_STRINGS_CHECK_POS, $list4);
        inference_modules.inference_removal_module($REMOVAL_TERM_STRINGS_CHECK_NEG, $list6);
        declare_defglobal($term_strings_defining_mt$);
        mt_vars.note_mt_var($term_strings_defining_mt$, $$termStrings);
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

    
}

/**
 * Total time: 40 ms
 */
