package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_regular_expressions extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new removal_modules_regular_expressions();

    public static final String myName = "com.cyc.cycjava_2.cycl.inference.modules.removal.removal_modules_regular_expressions";




    // defparameter
    private static final SubLSymbol $default_regex_string_match_cost$ = makeSymbol("*DEFAULT-REGEX-STRING-MATCH-COST*");



    // defparameter
    private static final SubLSymbol $default_regex_string_match_case_insensitive_cost$ = makeSymbol("*DEFAULT-REGEX-STRING-MATCH-CASE-INSENSITIVE-COST*");

    private static final SubLObject $$regexStringMatch = reader_make_constant_shell(makeString("regexStringMatch"));



    public static final SubLSymbol $regex_string_match_mt$ = makeSymbol("*REGEX-STRING-MATCH-MT*");

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLSymbol $REMOVAL_REGEX_STRING_MATCH_POS = makeKeyword("REMOVAL-REGEX-STRING-MATCH-POS");

    private static final SubLList $list5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("regexStringMatch")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("regexStringMatch")), makeKeyword("STRING"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-REGEX-STRING-MATCH-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REGEX-STRING-MATCH-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("regexStringMatch")), list($BIND, makeSymbol("REGULAR-EXPRESSION")), list($BIND, makeSymbol("DATA"))), list(list(makeKeyword("VALUE"), makeSymbol("REGULAR-EXPRESSION")), list(makeKeyword("VALUE"), makeSymbol("DATA")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list($CALL, makeSymbol("REGEX-STRING-MATCH"), list(makeKeyword("VALUE"), makeSymbol("REGULAR-EXPRESSION")), list(makeKeyword("VALUE"), makeSymbol("DATA"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*REGEX-STRING-MATCH-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$regexStringMatch <regular-expression string> <data string>)\n    when <data string> matches the regular expression in <regular-expression string>"), makeKeyword("EXAMPLE"), makeString("(#$regexStringMatch \"[FD]og\" \"Dog\")") });

    private static final SubLSymbol $REMOVAL_REGEX_STRING_MATCH_NEG = makeKeyword("REMOVAL-REGEX-STRING-MATCH-NEG");

    private static final SubLList $list7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("regexStringMatch")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("regexStringMatch")), makeKeyword("STRING"), makeKeyword("STRING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REGEX-STRING-MATCH-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("regexStringMatch")), list($BIND, makeSymbol("REGULAR-EXPRESSION")), list($BIND, makeSymbol("DATA"))), list(list(makeKeyword("VALUE"), makeSymbol("REGULAR-EXPRESSION")), list(makeKeyword("VALUE"), makeSymbol("DATA")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list($CALL, makeSymbol("INVERT-BOOLEAN-ANSWER"), list($CALL, makeSymbol("REGEX-STRING-MATCH"), list(makeKeyword("VALUE"), makeSymbol("REGULAR-EXPRESSION")), list(makeKeyword("VALUE"), makeSymbol("DATA")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*REGEX-STRING-MATCH-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$regexStringMatch <regular-expression string> <data string>))\n    when <data string> doesn\'t match the regular expression in <regular-expression string>"), makeKeyword("EXAMPLE"), makeString("(#$not (#$regexStringMatch \"[FD]og\" \"Log\"))") });



    private static final SubLSymbol $REMOVAL_REGEX_STRING_MATCH_WITH_BINDINGS_POS = makeKeyword("REMOVAL-REGEX-STRING-MATCH-WITH-BINDINGS-POS");

    private static final SubLList $list10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("regexStringMatch")), makeKeyword("REQUIRED-PATTERN"), listS(reader_make_constant_shell(makeString("regexStringMatch")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REGEX-STRING-MATCH-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REGEX-STRING-MATCH-WITH-BINDINGS"), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), reader_make_constant_shell(makeString("BaseKB")), makeKeyword("DOCUMENTATION"), makeString("(#$regexStringMatch <regular-expression string> <data string> <vars>))\n    holds when <vars> is the captured matches when <regular-expression string> is applied to <data string>"), makeKeyword("EXAMPLE"), makeString("(#$regexStringMatch \"dog(.*)mice\" \"dogs hate mice\" \"s hate \")") });

    private static final SubLSymbol REGEX_STRING_MATCH_WITH_BINDINGS = makeSymbol("REGEX-STRING-MATCH-WITH-BINDINGS");





    private static final SubLObject $$regexStringMatch_CaseInsensitive = reader_make_constant_shell(makeString("regexStringMatch-CaseInsensitive"));

    public static final SubLSymbol $regex_string_match_case_insensitive_mt$ = makeSymbol("*REGEX-STRING-MATCH-CASE-INSENSITIVE-MT*");

    private static final SubLSymbol $REMOVAL_REGEX_STRING_MATCH_CASE_INSENSITIVE_POS = makeKeyword("REMOVAL-REGEX-STRING-MATCH-CASE-INSENSITIVE-POS");

    private static final SubLList $list17 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("regexStringMatch-CaseInsensitive")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("regexStringMatch-CaseInsensitive")), makeKeyword("STRING"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-REGEX-STRING-MATCH-CASE-INSENSITIVE-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REGEX-STRING-MATCH-CASE-INSENSITIVE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("regexStringMatch-CaseInsensitive")), list($BIND, makeSymbol("REGULAR-EXPRESSION")), list($BIND, makeSymbol("DATA"))), list(list(makeKeyword("VALUE"), makeSymbol("REGULAR-EXPRESSION")), list(makeKeyword("VALUE"), makeSymbol("DATA")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list($CALL, makeSymbol("REGEX-STRING-MATCH-CASE-INSENSITIVE"), list(makeKeyword("VALUE"), makeSymbol("REGULAR-EXPRESSION")), list(makeKeyword("VALUE"), makeSymbol("DATA"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*REGEX-STRING-MATCH-CASE-INSENSITIVE-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$regexStringMatch-CaseInsensitive <regular-expression string> <data string>)\n    when <data string> matches the regular expression in <regular-expression string>"), makeKeyword("EXAMPLE"), makeString("(#$regexStringMatch-CaseInsensitive \"[fd]OG\" \"Dog\")") });

    private static final SubLSymbol $REMOVAL_REGEX_STRING_MATCH_CASE_INSENSITIVE_NEG = makeKeyword("REMOVAL-REGEX-STRING-MATCH-CASE-INSENSITIVE-NEG");

    private static final SubLList $list19 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("regexStringMatch-CaseInsensitive")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("regexStringMatch-CaseInsensitive")), makeKeyword("STRING"), makeKeyword("STRING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REGEX-STRING-MATCH-CASE-INSENSITIVE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("regexStringMatch-CaseInsensitive")), list($BIND, makeSymbol("REGULAR-EXPRESSION")), list($BIND, makeSymbol("DATA"))), list(list(makeKeyword("VALUE"), makeSymbol("REGULAR-EXPRESSION")), list(makeKeyword("VALUE"), makeSymbol("DATA")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list($CALL, makeSymbol("INVERT-BOOLEAN-ANSWER"), list($CALL, makeSymbol("REGEX-STRING-MATCH-CASE-INSENSITIVE"), list(makeKeyword("VALUE"), makeSymbol("REGULAR-EXPRESSION")), list(makeKeyword("VALUE"), makeSymbol("DATA")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*REGEX-STRING-MATCH-CASE-INSENSITIVE-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$regexStringMatch-CaseInsensitive <regular-expression string> <data string>))\n    when <data string> doesn\'t match the regular expression in <regular-expression string>"), makeKeyword("EXAMPLE"), makeString("(#$not (#$regexStringMatch-CaseInsensitive \"[fd]OG\" \"Log\"))") });

    private static final SubLList $list20 = list(makeKeyword("CASELESS"));

    private static final SubLSymbol $REMOVAL_REGEX_STRING_MATCH_WITH_BINDINGS_CASE_INSENSITIVE_POS = makeKeyword("REMOVAL-REGEX-STRING-MATCH-WITH-BINDINGS-CASE-INSENSITIVE-POS");

    private static final SubLList $list22 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("regexStringMatch-CaseInsensitive")), makeKeyword("REQUIRED-PATTERN"), listS(reader_make_constant_shell(makeString("regexStringMatch-CaseInsensitive")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REGEX-STRING-MATCH-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REGEX-STRING-MATCH-WITH-BINDINGS-CASE-INSENSITIVE"), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), reader_make_constant_shell(makeString("BaseKB")), makeKeyword("DOCUMENTATION"), makeString("(#$regexStringMatch-CaseInsensitive <regular-expression string> <data string> <vars>))\n    holds when <vars> is the captured matches when <regular-expression string> is applied case-insensitively \n    to <data string>"), makeKeyword("EXAMPLE"), makeString("(#$regexStringMatch-CaseInsensitive \"Dog(.*)mice\" \"dogs hate mice\" \"s hate \")") });

    private static final SubLSymbol REGEX_STRING_MATCH_WITH_BINDINGS_CASE_INSENSITIVE = makeSymbol("REGEX-STRING-MATCH-WITH-BINDINGS-CASE-INSENSITIVE");

    private static final SubLObject $$regexSubstringMatch = reader_make_constant_shell(makeString("regexSubstringMatch"));

    private static final SubLSymbol $META_REMOVAL_COMPLETELY_DECIDABLE_POS = makeKeyword("META-REMOVAL-COMPLETELY-DECIDABLE-POS");

    private static final SubLSymbol $REMOVAL_COMPLETELY_DECIDABLE_NEG = makeKeyword("REMOVAL-COMPLETELY-DECIDABLE-NEG");

    private static final SubLSymbol $REMOVAL_REGEX_SUBSTRING_MATCH_POS = makeKeyword("REMOVAL-REGEX-SUBSTRING-MATCH-POS");

    private static final SubLList $list28 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("regexSubstringMatch")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("regexSubstringMatch")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-REGEX-STRING-MATCH-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REGEX-STRING-MATCH-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("regexSubstringMatch")), list($BIND, makeSymbol("REGULAR-EXPRESSION")), list($BIND, makeSymbol("DATA")), list($BIND, makeSymbol("INDEX")), list($BIND, makeSymbol("SPAN"))), list(list(makeKeyword("VALUE"), makeSymbol("REGULAR-EXPRESSION")), list(makeKeyword("VALUE"), makeSymbol("DATA")), list(makeKeyword("VALUE"), makeSymbol("INDEX")), list(makeKeyword("VALUE"), makeSymbol("SPAN")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-REGEX-SUBSTRING-MATCH-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("BINDINGS"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list($CALL, makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(reader_make_constant_shell(makeString("regexSubstringMatch")), list(makeKeyword("VALUE"), makeSymbol("REGULAR-EXPRESSION")), list(makeKeyword("VALUE"), makeSymbol("DATA")), list(makeKeyword("VALUE"), makeSymbol("INDEX")), list(makeKeyword("VALUE"), makeSymbol("SPAN")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*REGEX-STRING-MATCH-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$regexSubstringMatch <regular-expression string> <data string> <data index> <data span>)\n    when <data string> matches the regular expression in <regular-expression string> starting\n    at index and continuing for span characters"), makeKeyword("EXAMPLE"), makeString("(#$regexSubstringMatch \"[FD]og\" \"Dog\" 0 3)") });

    private static final SubLSymbol REMOVAL_REGEX_SUBSTRING_MATCH_ITERATOR = makeSymbol("REMOVAL-REGEX-SUBSTRING-MATCH-ITERATOR");

    private static final SubLList $list30 = list(makeSymbol("PATTERN"), makeSymbol("DATA"), makeSymbol("&OPTIONAL"), makeSymbol("INDEX"), makeSymbol("SPAN"));

    private static final SubLList $list31 = cons(makeSymbol("THE-START-INDEX"), makeSymbol("THE-END-INDEX"));

    public static SubLObject removal_regex_string_match_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return regular_expressions.is_regular_expressions_support_availableP();
    }

    public static SubLObject regex_string_match(final SubLObject regex_string, final SubLObject data_string) {
        assert NIL != stringp(regex_string) : "Types.stringp(regex_string) " + "CommonSymbols.NIL != Types.stringp(regex_string) " + regex_string;
        assert NIL != stringp(data_string) : "Types.stringp(data_string) " + "CommonSymbols.NIL != Types.stringp(data_string) " + data_string;
        return list_utilities.sublisp_boolean(regular_expression_utilities.offsets_of_regex_matches(regex_string, data_string, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject regex_string_match_with_bindings(final SubLObject asent, final SubLObject sense) {
        return regex_string_match_with_bindings_int(asent, sense, NIL);
    }

    public static SubLObject regex_string_match_with_bindings_int(final SubLObject asent, final SubLObject sense, final SubLObject regex_options) {
        final SubLObject pattern = cycl_utilities.formula_arg1(asent, UNPROVIDED);
        final SubLObject string = cycl_utilities.formula_arg2(asent, UNPROVIDED);
        final SubLObject match_var_count = subtract(formula_arity(asent, UNPROVIDED), TWO_INTEGER);
        final SubLObject matches = regular_expression_utilities.find_all_captured_matches_within_string_from_string(pattern, string, regex_options);
        final SubLObject result_sentence = make_formula(cycl_utilities.formula_arg0(asent), list(pattern, string), UNPROVIDED);
        final SubLObject too_few_matchesP = NIL;
        SubLObject cdotimes_end_var;
        SubLObject n;
        SubLObject current_match;
        SubLObject current_result_sentence;
        for (cdotimes_end_var = length(matches), n = NIL, n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
            current_match = nth(n, matches);
            current_result_sentence = cconcatenate(result_sentence, current_match);
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, current_result_sentence, $$BaseKB, $TRUE_MON), unification_utilities.asent_unify(asent, current_result_sentence, T, UNPROVIDED), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_regex_string_match_case_insensitive_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return regular_expressions.is_regular_expressions_support_availableP();
    }

    public static SubLObject regex_string_match_case_insensitive(final SubLObject regex_string, final SubLObject data_string) {
        assert NIL != stringp(regex_string) : "Types.stringp(regex_string) " + "CommonSymbols.NIL != Types.stringp(regex_string) " + regex_string;
        assert NIL != stringp(data_string) : "Types.stringp(data_string) " + "CommonSymbols.NIL != Types.stringp(data_string) " + data_string;
        return list_utilities.sublisp_boolean(regular_expression_utilities.offsets_of_regex_matches(regex_string, data_string, $list20, UNPROVIDED));
    }

    public static SubLObject regex_string_match_with_bindings_case_insensitive(final SubLObject asent, final SubLObject sense) {
        return regex_string_match_with_bindings_int(asent, sense, $list20);
    }

    public static SubLObject removal_regex_substring_match_iterator(final SubLObject values) {
        return removal_regex_substring_match_iterator_int(values, UNPROVIDED);
    }

    public static SubLObject removal_regex_substring_match_iterator_int(final SubLObject values, SubLObject regex_options) {
        if (regex_options == UNPROVIDED) {
            regex_options = NIL;
        }
        SubLObject pattern = NIL;
        SubLObject data = NIL;
        destructuring_bind_must_consp(values, values, $list30);
        pattern = values.first();
        SubLObject current = values.rest();
        destructuring_bind_must_consp(current, values, $list30);
        data = current.first();
        current = current.rest();
        final SubLObject index = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, values, $list30);
        current = current.rest();
        final SubLObject span = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, values, $list30);
        current = current.rest();
        if (NIL == current) {
            final SubLObject matches = regular_expression_utilities.offsets_of_regex_matches(pattern, data, regex_options, UNPROVIDED);
            SubLObject results = NIL;
            SubLObject cdolist_list_var = matches;
            SubLObject match = NIL;
            match = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current_$2;
                final SubLObject datum_$1 = current_$2 = match;
                SubLObject the_start_index = NIL;
                SubLObject the_end_index = NIL;
                destructuring_bind_must_consp(current_$2, datum_$1, $list31);
                the_start_index = current_$2.first();
                current_$2 = the_end_index = current_$2.rest();
                final SubLObject the_span = subtract(the_end_index, the_start_index);
                final SubLObject input_asent = make_formula($$regexSubstringMatch, values, UNPROVIDED);
                final SubLObject answer_asent = make_formula($$regexSubstringMatch, list(pattern, data, the_start_index, the_span), UNPROVIDED);
                final SubLObject v_bindings = unification_utilities.gaf_asent_unify(input_asent, answer_asent, UNPROVIDED, UNPROVIDED);
                if (NIL != v_bindings) {
                    results = cons(v_bindings, results);
                }
                cdolist_list_var = cdolist_list_var.rest();
                match = cdolist_list_var.first();
            } 
            return iteration.new_list_iterator(results);
        }
        cdestructuring_bind_error(values, $list30);
        return NIL;
    }

    public static SubLObject declare_removal_modules_regular_expressions_file() {
        declareFunction("removal_regex_string_match_required", "REMOVAL-REGEX-STRING-MATCH-REQUIRED", 1, 1, false);
        declareFunction("regex_string_match", "REGEX-STRING-MATCH", 2, 0, false);
        declareFunction("regex_string_match_with_bindings", "REGEX-STRING-MATCH-WITH-BINDINGS", 2, 0, false);
        declareFunction("regex_string_match_with_bindings_int", "REGEX-STRING-MATCH-WITH-BINDINGS-INT", 3, 0, false);
        declareFunction("removal_regex_string_match_case_insensitive_required", "REMOVAL-REGEX-STRING-MATCH-CASE-INSENSITIVE-REQUIRED", 1, 1, false);
        declareFunction("regex_string_match_case_insensitive", "REGEX-STRING-MATCH-CASE-INSENSITIVE", 2, 0, false);
        declareFunction("regex_string_match_with_bindings_case_insensitive", "REGEX-STRING-MATCH-WITH-BINDINGS-CASE-INSENSITIVE", 2, 0, false);
        declareFunction("removal_regex_substring_match_iterator", "REMOVAL-REGEX-SUBSTRING-MATCH-ITERATOR", 1, 0, false);
        declareFunction("removal_regex_substring_match_iterator_int", "REMOVAL-REGEX-SUBSTRING-MATCH-ITERATOR-INT", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_regular_expressions_file() {
        deflexical("*REGEX-STRING-MATCH-MT*", SubLTrampolineFile.maybeDefault($regex_string_match_mt$, $regex_string_match_mt$, $$BaseKB));
        defparameter("*DEFAULT-REGEX-STRING-MATCH-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        deflexical("*REGEX-STRING-MATCH-CASE-INSENSITIVE-MT*", SubLTrampolineFile.maybeDefault($regex_string_match_case_insensitive_mt$, $regex_string_match_case_insensitive_mt$, $$BaseKB));
        defparameter("*DEFAULT-REGEX-STRING-MATCH-CASE-INSENSITIVE-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        return NIL;
    }

    public static SubLObject setup_removal_modules_regular_expressions_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$regexStringMatch);
        preference_modules.doomed_unless_arg_bindable($POS, $$regexStringMatch, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$regexStringMatch, TWO_INTEGER);
        declare_defglobal($regex_string_match_mt$);
        mt_vars.note_mt_var($regex_string_match_mt$, $$regexStringMatch);
        inference_modules.inference_removal_module($REMOVAL_REGEX_STRING_MATCH_POS, $list5);
        inference_modules.inference_removal_module($REMOVAL_REGEX_STRING_MATCH_NEG, $list7);
        inference_modules.inference_removal_module($REMOVAL_REGEX_STRING_MATCH_WITH_BINDINGS_POS, $list10);
        note_funcall_helper_function(REGEX_STRING_MATCH_WITH_BINDINGS);
        inference_modules.register_solely_specific_removal_module_predicate($$regexStringMatch_CaseInsensitive);
        preference_modules.doomed_unless_arg_bindable($POS, $$regexStringMatch_CaseInsensitive, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$regexStringMatch_CaseInsensitive, TWO_INTEGER);
        declare_defglobal($regex_string_match_case_insensitive_mt$);
        mt_vars.note_mt_var($regex_string_match_case_insensitive_mt$, $$regexStringMatch_CaseInsensitive);
        inference_modules.inference_removal_module($REMOVAL_REGEX_STRING_MATCH_CASE_INSENSITIVE_POS, $list17);
        inference_modules.inference_removal_module($REMOVAL_REGEX_STRING_MATCH_CASE_INSENSITIVE_NEG, $list19);
        inference_modules.inference_removal_module($REMOVAL_REGEX_STRING_MATCH_WITH_BINDINGS_CASE_INSENSITIVE_POS, $list22);
        note_funcall_helper_function(REGEX_STRING_MATCH_WITH_BINDINGS_CASE_INSENSITIVE);
        inference_modules.register_solely_specific_removal_module_predicate($$regexSubstringMatch);
        inference_modules.inference_removal_module_use_meta_removal($$regexSubstringMatch, $META_REMOVAL_COMPLETELY_DECIDABLE_POS);
        inference_modules.inference_removal_module_use_generic($$regexSubstringMatch, $REMOVAL_COMPLETELY_DECIDABLE_NEG);
        preference_modules.doomed_unless_arg_bindable($POS, $$regexSubstringMatch, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$regexSubstringMatch, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_REGEX_SUBSTRING_MATCH_POS, $list28);
        note_funcall_helper_function(REMOVAL_REGEX_SUBSTRING_MATCH_ITERATOR);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_regular_expressions_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_regular_expressions_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_regular_expressions_file();
    }

    static {





































    }
}

/**
 * Total time: 163 ms
 */
