/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$hl_module_check_cost$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V12;
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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-TERM-STRINGS
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-term-strings.lisp
 * created:     2019/07/03 17:37:46
 */
public final class removal_modules_term_strings extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_term_strings();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_term_strings";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $term_strings_check_default_cost$ = makeSymbol("*TERM-STRINGS-CHECK-DEFAULT-COST*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $term_strings_unify_default_cost$ = makeSymbol("*TERM-STRINGS-UNIFY-DEFAULT-COST*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $expected_number_of_terms_per_string$ = makeSymbol("*EXPECTED-NUMBER-OF-TERMS-PER-STRING*");



    private static final SubLSymbol $TERMSTRINGS_X_Y_POS = makeKeyword("TERMSTRINGS-X-Y-POS");

    static private final SubLList $list2 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termStrings"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termStrings"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_TERM_STRINGS_CHECK_POS = makeKeyword("REMOVAL-TERM-STRINGS-CHECK-POS");

    static private final SubLList $list4 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termStrings"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termStrings"), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*TERM-STRINGS-CHECK-DEFAULT-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("termStrings"), list($BIND, makeSymbol("TERM")), list($BIND, makeSymbol("STRING"))), list(list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("STRING")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TERM"), makeSymbol("STRING")), list($CALL, makeSymbol("REMOVAL-TERM-STRINGS-CHECK-POS-OUTPUT-CHECK"), list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("STRING")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TERM-PHRASES"), makeKeyword("DOCUMENTATION"), makeString("(#$termStrings <fully-bound-p> <stringp>)"), makeKeyword("EXAMPLE"), makeString("(#$termStrings #$Dog \"Dog\")") });

    private static final SubLSymbol $REMOVAL_TERM_STRINGS_CHECK_NEG = makeKeyword("REMOVAL-TERM-STRINGS-CHECK-NEG");

    static private final SubLList $list6 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("termStrings"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termStrings"), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*TERM-STRINGS-CHECK-DEFAULT-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("termStrings"), list($BIND, makeSymbol("TERM")), list($BIND, makeSymbol("STRING"))), list(list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("STRING")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TERM"), makeSymbol("STRING")), list($CALL, makeSymbol("REMOVAL-TERM-STRINGS-CHECK-NEG-OUTPUT-CHECK"), list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("STRING")))), makeKeyword("SUPPORT"), makeKeyword("TERM-PHRASES"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$termStrings <fully-bound-p> <stringp>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$termStrings #$Dog \"Cat\"))") });

    public static final SubLSymbol $term_strings_defining_mt$ = makeSymbol("*TERM-STRINGS-DEFINING-MT*");



    private static final SubLSymbol $REMOVAL_TERM_STRINGS_UNIFY = makeKeyword("REMOVAL-TERM-STRINGS-UNIFY");

    static private final SubLList $list13 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termStrings"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termStrings"), makeKeyword("FULLY-BOUND"), makeKeyword("VARIABLE")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("COST-EXPRESSION"), makeSymbol("*TERM-STRINGS-UNIFY-DEFAULT-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("termStrings"), list($BIND, makeSymbol("TERM")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TERM"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-TERM-STRINGS-UNIFY-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("termStrings"), list(makeKeyword("VALUE"), makeSymbol("TERM")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TERM-PHRASES"), makeKeyword("DOCUMENTATION"), makeString("(#$termStrings <fully-bound-p> <variable-p>)"), makeKeyword("EXAMPLE"), makeString("(#$termStrings #$Dog ?STRING)") });

    static private final SubLList $list_alt2 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termStrings"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termStrings"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_TERM_STRINGS_LOOKUP = makeKeyword("REMOVAL-TERM-STRINGS-LOOKUP");

    static private final SubLList $list15 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termStrings"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termStrings"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPECTED-NUMBER-OF-TERMS-PER-STRING*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("termStrings"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("STRING"))), list(makeKeyword("VALUE"), makeSymbol("STRING"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-TERM-STRINGS-LOOKUP-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("termStrings"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("STRING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TERM-PHRASES"), makeKeyword("DOCUMENTATION"), makeString("(#$termStrings <not-fully-bound-p> <stringp>)"), makeKeyword("EXAMPLE"), makeString("(#$termStrings ?TERM \"Dog\")") });

    static private final SubLList $list_alt4 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termStrings"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termStrings"), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*TERM-STRINGS-CHECK-DEFAULT-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("termStrings"), list($BIND, makeSymbol("TERM")), list($BIND, makeSymbol("STRING"))), list(list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("STRING")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TERM"), makeSymbol("STRING")), list($CALL, makeSymbol("REMOVAL-TERM-STRINGS-CHECK-POS-OUTPUT-CHECK"), list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("STRING")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TERM-PHRASES"), makeKeyword("DOCUMENTATION"), makeString("(#$termStrings <fully-bound-p> <stringp>)"), makeKeyword("EXAMPLE"), makeString("(#$termStrings #$Dog \"Dog\")") });

    // Definitions
    public static final SubLObject removal_term_strings_check_pos_output_check_alt(SubLObject v_term, SubLObject string) {
        return makeBoolean((NIL != list_utilities.member_equalP(string, com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_term_strings.inference_strings_for_term(v_term, UNPROVIDED, UNPROVIDED))) || (NIL != list_utilities.member_equalP(v_term, com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_term_strings.inference_terms_for_string(string))));
    }

    // Definitions
    public static SubLObject removal_term_strings_check_pos_output_check(final SubLObject v_term, final SubLObject string) {
        return makeBoolean((NIL != list_utilities.member_equalP(string, inference_strings_for_term(v_term, UNPROVIDED, UNPROVIDED))) || (NIL != list_utilities.member_equalP(v_term, inference_terms_for_string(string))));
    }

    public static final SubLObject removal_term_strings_check_neg_output_check_alt(SubLObject v_term, SubLObject string) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_term_strings.removal_term_strings_check_pos_output_check(v_term, string));
    }

    public static SubLObject removal_term_strings_check_neg_output_check(final SubLObject v_term, final SubLObject string) {
        return makeBoolean(NIL == removal_term_strings_check_pos_output_check(v_term, string));
    }

    /**
     *
     *
     * @return list; a list of strings for TERM
     */
    @LispMethod(comment = "@return list; a list of strings for TERM")
    public static final SubLObject inference_strings_for_term_alt(SubLObject v_term, SubLObject nl_preds, SubLObject lexical_onlyP) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ALL;
        }
        if (lexical_onlyP == UNPROVIDED) {
            lexical_onlyP = NIL;
        }
        return pph_methods_lexicon.inference_strings_for_term_int(v_term, nl_preds, lexical_onlyP, UNPROVIDED);
    }

    /**
     *
     *
     * @return list; a list of strings for TERM
     */
    @LispMethod(comment = "@return list; a list of strings for TERM")
    public static SubLObject inference_strings_for_term(final SubLObject v_term, SubLObject nl_preds, SubLObject lexical_onlyP) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ALL;
        }
        if (lexical_onlyP == UNPROVIDED) {
            lexical_onlyP = NIL;
        }
        return pph_methods_lexicon.inference_strings_for_term_int(v_term, nl_preds, lexical_onlyP, UNPROVIDED);
    }

    static private final SubLList $list_alt6 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("termStrings"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termStrings"), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*TERM-STRINGS-CHECK-DEFAULT-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("termStrings"), list($BIND, makeSymbol("TERM")), list($BIND, makeSymbol("STRING"))), list(list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("STRING")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TERM"), makeSymbol("STRING")), list($CALL, makeSymbol("REMOVAL-TERM-STRINGS-CHECK-NEG-OUTPUT-CHECK"), list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("STRING")))), makeKeyword("SUPPORT"), makeKeyword("TERM-PHRASES"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$termStrings <fully-bound-p> <stringp>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$termStrings #$Dog \"Cat\"))") });

    /**
     *
     *
     * @return list; a list of terms for STRING
     */
    @LispMethod(comment = "@return list; a list of terms for STRING")
    public static final SubLObject inference_terms_for_string_alt(SubLObject string) {
        return lexicon_accessors.all_parsing_denots_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return list; a list of terms for STRING
     */
    @LispMethod(comment = "@return list; a list of terms for STRING")
    public static SubLObject inference_terms_for_string(final SubLObject string) {
        return lexicon_accessors.all_parsing_denots_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject make_term_strings_hl_support_alt(SubLObject formula) {
        return arguments.make_hl_support($OPAQUE, formula, $term_strings_defining_mt$.getGlobalValue(), $TRUE_MON);
    }

    public static SubLObject make_term_strings_hl_support(final SubLObject formula) {
        return arguments.make_hl_support($OPAQUE, formula, $term_strings_defining_mt$.getGlobalValue(), $TRUE_MON);
    }

    public static final SubLObject removal_term_strings_unify_output_generate_alt(SubLObject v_term) {
        return iteration.new_list_iterator(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_term_strings.inference_strings_for_term(v_term, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject removal_term_strings_unify_output_generate(final SubLObject v_term) {
        return iteration.new_list_iterator(inference_strings_for_term(v_term, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject removal_term_strings_lookup_output_generate_alt(SubLObject string) {
        return iteration.new_list_iterator(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_term_strings.inference_terms_for_string(string));
    }

    public static SubLObject removal_term_strings_lookup_output_generate(final SubLObject string) {
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

    static private final SubLList $list_alt13 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termStrings"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termStrings"), makeKeyword("FULLY-BOUND"), makeKeyword("VARIABLE")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("COST-EXPRESSION"), makeSymbol("*TERM-STRINGS-UNIFY-DEFAULT-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("termStrings"), list($BIND, makeSymbol("TERM")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TERM"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-TERM-STRINGS-UNIFY-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("termStrings"), list(makeKeyword("VALUE"), makeSymbol("TERM")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TERM-PHRASES"), makeKeyword("DOCUMENTATION"), makeString("(#$termStrings <fully-bound-p> <variable-p>)"), makeKeyword("EXAMPLE"), makeString("(#$termStrings #$Dog ?STRING)") });

    public static final SubLObject init_removal_modules_term_strings_file_alt() {
        deflexical("*TERM-STRINGS-DEFINING-MT*", NIL != boundp($term_strings_defining_mt$) ? ((SubLObject) ($term_strings_defining_mt$.getGlobalValue())) : $$BaseKB);
        deflexical("*TERM-STRINGS-CHECK-DEFAULT-COST*", $hl_module_check_cost$.getDynamicValue());
        deflexical("*TERM-STRINGS-UNIFY-DEFAULT-COST*", ONE_INTEGER);
        deflexical("*EXPECTED-NUMBER-OF-TERMS-PER-STRING*", ONE_INTEGER);
        return NIL;
    }

    public static SubLObject init_removal_modules_term_strings_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*TERM-STRINGS-DEFINING-MT*", SubLTrampolineFile.maybeDefault($term_strings_defining_mt$, $term_strings_defining_mt$, $$BaseKB));
            deflexical("*TERM-STRINGS-CHECK-DEFAULT-COST*", $hl_module_check_cost$.getDynamicValue());
            deflexical("*TERM-STRINGS-UNIFY-DEFAULT-COST*", ONE_INTEGER);
            deflexical("*EXPECTED-NUMBER-OF-TERMS-PER-STRING*", ONE_INTEGER);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*TERM-STRINGS-DEFINING-MT*", NIL != boundp($term_strings_defining_mt$) ? ((SubLObject) ($term_strings_defining_mt$.getGlobalValue())) : $$BaseKB);
        }
        return NIL;
    }

    public static SubLObject init_removal_modules_term_strings_file_Previous() {
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

    static private final SubLList $list_alt15 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termStrings"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termStrings"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPECTED-NUMBER-OF-TERMS-PER-STRING*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("termStrings"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("STRING"))), list(makeKeyword("VALUE"), makeSymbol("STRING"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-TERM-STRINGS-LOOKUP-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("termStrings"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("STRING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TERM-PHRASES"), makeKeyword("DOCUMENTATION"), makeString("(#$termStrings <not-fully-bound-p> <stringp>)"), makeKeyword("EXAMPLE"), makeString("(#$termStrings ?TERM \"Dog\")") });

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
