/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      TPTP-DATASTRUCTURES
 *  source file: /cyc/top/cycl/inference/tptp-datastructures.lisp
 *  created:     2019/07/03 17:38:28
 */
public final class tptp_datastructures extends SubLTranslatedFile implements V02 {
    // // Constructor
    private tptp_datastructures() {
    }

    public static final SubLFile me = new tptp_datastructures();

    public static final String myName = "com.cyc.cycjava.cycl.inference.tptp_datastructures";

    // // Definitions
    /**
     * Properties that affect how the query for a TPTP problem set is generated
     */
    // deflexical
    private static final SubLSymbol $tptp_problem_skeletal_properties$ = makeSymbol("*TPTP-PROBLEM-SKELETAL-PROPERTIES*");

    /**
     * TPTP problem properties that are not skeletal.  Listed in order of accumulation.
     */
    // deflexical
    private static final SubLSymbol $tptp_problem_other_properties$ = makeSymbol("*TPTP-PROBLEM-OTHER-PROPERTIES*");

    public static final SubLObject tptp_problem_skeletal_property_p(SubLObject v_object) {
        return makeBoolean(v_object.isKeyword() && (NIL != list_utilities.member_eqP(v_object, $tptp_problem_skeletal_properties$.getGlobalValue())));
    }

    public static final SubLObject tptp_problem_other_property_p(SubLObject v_object) {
        return makeBoolean(v_object.isKeyword() && (NIL != list_utilities.member_eqP(v_object, $tptp_problem_other_properties$.getGlobalValue())));
    }

    public static final SubLObject tptp_problem_property_p(SubLObject v_object) {
        return makeBoolean((NIL != tptp_problem_skeletal_property_p(v_object)) || (NIL != tptp_problem_other_property_p(v_object)));
    }

    public static final SubLObject validate_tptp_problem(SubLObject tptp_problem) {
        SubLTrampolineFile.checkType(tptp_problem, PROPERTY_LIST_P);
        {
            SubLObject remainder = NIL;
            for (remainder = tptp_problem; NIL != remainder; remainder = cddr(remainder)) {
                {
                    SubLObject property = remainder.first();
                    SubLObject value = cadr(remainder);
                    SubLObject pcase_var = property;
                    if (pcase_var.eql($OPENNESS)) {
                        SubLTrampolineFile.checkType(value, OPENNESS_P);
                    } else
                        if (pcase_var.eql($ANSWERABILITY)) {
                            SubLTrampolineFile.checkType(value, ANSWERABILITY_P);
                        } else
                            if (pcase_var.eql($NUM)) {
                                SubLTrampolineFile.checkType(value, NON_NEGATIVE_INTEGER_P);
                            } else
                                if (pcase_var.eql($PAIR_NUM)) {
                                    SubLTrampolineFile.checkType(value, NON_NEGATIVE_INTEGER_P);
                                } else
                                    if (pcase_var.eql($MODULE)) {
                                        SubLTrampolineFile.checkType(value, TPTP_QUERY_GENERATION_MODULE_NAME_P);
                                    } else
                                        if (pcase_var.eql($CYCL_QUERY)) {
                                            SubLTrampolineFile.checkType(value, CYCL_SENTENCE_P);
                                        } else
                                            if (pcase_var.eql($JUSTIFICATION)) {
                                                {
                                                    SubLObject cdolist_list_var = value;
                                                    SubLObject support = NIL;
                                                    for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                                                        if (NIL == assertion_handles.assertion_p(support)) {
                                                            Errors.warn($str_alt15$Expected_an_assertion__got_an_HL_, support);
                                                            SubLTrampolineFile.checkType(support, HL_SUPPORT_P);
                                                        }
                                                    }
                                                }
                                            } else
                                                if (pcase_var.eql($LINCHPIN)) {
                                                    SubLTrampolineFile.checkType(value, INDEXED_TERM_P);
                                                } else
                                                    if (pcase_var.eql($INCLUDE_LIST_IDS)) {
                                                        {
                                                            SubLObject list_var = value;
                                                            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                                                            {
                                                                SubLObject cdolist_list_var = list_var;
                                                                SubLObject elem = NIL;
                                                                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                                                                    SubLTrampolineFile.checkType(elem, NON_NEGATIVE_INTEGER_P);
                                                                }
                                                            }
                                                        }
                                                    } else
                                                        if (pcase_var.eql($COUNTERPART_NUM)) {
                                                            SubLTrampolineFile.checkType(value, NON_NEGATIVE_INTEGER_P);
                                                        } else
                                                            if (pcase_var.eql($HEADER)) {
                                                                SubLTrampolineFile.checkType(value, STRINGP);
                                                            } else
                                                                if (pcase_var.eql($OUTPUT_FILENAME)) {
                                                                    SubLTrampolineFile.checkType(value, FILE_VALID_FOR_WRITING_P);
                                                                } else {
                                                                    Errors.error($str_alt26$_s_was_not_a_valid_TPTP_PROBLEM_P, property);
                                                                }











                }
            }
        }
        return T;
    }

    public static final SubLObject new_skeletal_tptp_problem(SubLObject openness, SubLObject answerability) {
        return list($OPENNESS, openness, $ANSWERABILITY, answerability);
    }

    public static final SubLObject tptp_problem_openness(SubLObject tptp_problem) {
        return getf(tptp_problem, $OPENNESS, UNPROVIDED);
    }

    public static final SubLObject tptp_problem_answerability(SubLObject tptp_problem) {
        return getf(tptp_problem, $ANSWERABILITY, UNPROVIDED);
    }

    public static final SubLObject tptp_problem_num(SubLObject tptp_problem) {
        return getf(tptp_problem, $NUM, UNPROVIDED);
    }

    public static final SubLObject tptp_problem_pair_num(SubLObject tptp_problem) {
        return getf(tptp_problem, $PAIR_NUM, UNPROVIDED);
    }

    public static final SubLObject tptp_problem_module(SubLObject tptp_problem) {
        return getf(tptp_problem, $MODULE, UNPROVIDED);
    }

    public static final SubLObject tptp_problem_query(SubLObject tptp_problem) {
        return getf(tptp_problem, $CYCL_QUERY, UNPROVIDED);
    }

    public static final SubLObject tptp_problem_justification(SubLObject tptp_problem) {
        return getf(tptp_problem, $JUSTIFICATION, UNPROVIDED);
    }

    public static final SubLObject tptp_problem_non_core_justification(SubLObject tptp_problem) {
        return remove_if($sym27$TPTP_CORE_RULE_, tptp_problem_justification(tptp_problem), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * An indexed term, or :static if the tptp-problem is static and hence has no linchpin.
     */
    public static final SubLObject tptp_problem_linchpin(SubLObject tptp_problem) {
        return getf(tptp_problem, $LINCHPIN, UNPROVIDED);
    }

    public static final SubLObject tptp_problem_staticP(SubLObject tptp_problem) {
        return eq($STATIC, tptp_problem_linchpin(tptp_problem));
    }

    public static final SubLObject tptp_problem_dynamicP(SubLObject tptp_problem) {
        return makeBoolean(NIL == tptp_problem_staticP(tptp_problem));
    }

    public static final SubLObject tptp_problem_include_list_ids(SubLObject tptp_problem) {
        return getf(tptp_problem, $INCLUDE_LIST_IDS, UNPROVIDED);
    }

    public static final SubLObject tptp_problem_counterpart_num(SubLObject tptp_problem) {
        return getf(tptp_problem, $COUNTERPART_NUM, UNPROVIDED);
    }

    public static final SubLObject tptp_problem_header(SubLObject tptp_problem) {
        return getf(tptp_problem, $HEADER, UNPROVIDED);
    }

    public static final SubLObject tptp_problem_output_filename(SubLObject tptp_problem) {
        return getf(tptp_problem, $OUTPUT_FILENAME, UNPROVIDED);
    }

    public static final SubLObject find_tptp_problem_by_num(SubLObject tptp_problems, SubLObject num) {
        {
            SubLObject cdolist_list_var = tptp_problems;
            SubLObject tptp_problem = NIL;
            for (tptp_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tptp_problem = cdolist_list_var.first()) {
                if (num == tptp_problem_num(tptp_problem)) {
                    return tptp_problem;
                }
            }
        }
        return Errors.error($str_alt29$Could_not_find_problem___a, num);
    }

    public static final SubLObject tptp_problem_nset_property(SubLObject tptp_problem, SubLObject property, SubLObject value) {
        SubLTrampolineFile.checkType(property, TPTP_PROBLEM_PROPERTY_P);
        return putf(tptp_problem, property, value);
    }

    public static final SubLObject tptp_problem_delete_property(SubLObject tptp_problem, SubLObject property) {
        SubLTrampolineFile.checkType(property, TPTP_PROBLEM_PROPERTY_P);
        return remf(tptp_problem, property);
    }

    public static final SubLObject tptp_problem_remove_property(SubLObject tptp_problem, SubLObject property) {
        SubLTrampolineFile.checkType(property, TPTP_PROBLEM_PROPERTY_P);
        return remf(copy_list(tptp_problem), property);
    }

    /**
     * Returns a nicely printable version of TPTP-PROBLEM
     */
    public static final SubLObject printable_tptp_problem(SubLObject tptp_problem) {
        return tptp_problem_remove_property(tptp_problem, $JUSTIFICATION);
    }

    public static final SubLObject do_all_skeletal_tptp_problem_permutations(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt31);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject skeletal_tptp_problem = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt31);
                    skeletal_tptp_problem = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject openness = $sym32$OPENNESS;
                            SubLObject answerability = $sym33$ANSWERABILITY;
                            return list(CDOLIST, bq_cons(openness, $list_alt35), list(CDOLIST, bq_cons(answerability, $list_alt36), listS(CLET, list(list(skeletal_tptp_problem, list(NEW_SKELETAL_TPTP_PROBLEM, openness, answerability))), append(body, NIL))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt31);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject both_answerabilities_in_random_order() {
        return NIL != number_utilities.coin_flip() ? ((SubLObject) ($list_alt39)) : $list_alt40;
    }

    public static final SubLObject new_tptp_problem_set(SubLObject kb_spec, SubLObject typed_include_lists, SubLObject tptp_problems, SubLObject proof_checker_modeP) {
        SubLTrampolineFile.checkType(kb_spec, TPTP_KB_SPEC_P);
        return list(kb_spec, typed_include_lists, tptp_problems, proof_checker_modeP);
    }

    public static final SubLObject tptp_problem_set_kb_spec(SubLObject problem_set) {
        return problem_set.first();
    }

    public static final SubLObject tptp_problem_set_typed_include_lists(SubLObject problem_set) {
        return second(problem_set);
    }

    public static final SubLObject tptp_problem_set_tptp_problems(SubLObject problem_set) {
        return third(problem_set);
    }

    public static final SubLObject tptp_problem_set_proof_checker_modeP(SubLObject problem_set) {
        return fourth(problem_set);
    }

    public static final SubLObject set_tptp_problem_set_kb_spec(SubLObject problem_set, SubLObject kb_spec) {
        set_nth(ZERO_INTEGER, problem_set, kb_spec);
        return problem_set;
    }

    public static final SubLObject set_tptp_problem_set_tptp_problems(SubLObject problem_set, SubLObject tptp_problems) {
        set_nth(TWO_INTEGER, problem_set, tptp_problems);
        return problem_set;
    }

    public static final SubLObject set_tptp_problem_set_proof_checker_mode(SubLObject problem_set, SubLObject proof_checker_modeP) {
        set_nth(THREE_INTEGER, problem_set, proof_checker_modeP);
        return problem_set;
    }

    // deflexical
    private static final SubLSymbol $tptp_kb_spec_properties$ = makeSymbol("*TPTP-KB-SPEC-PROPERTIES*");

    public static final SubLObject tptp_kb_spec_property_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $tptp_kb_spec_properties$.getGlobalValue());
    }

    public static final SubLObject tptp_kb_spec_p(SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, TPTP_KB_SPEC_PROPERTY_P);
    }

    public static final SubLObject new_tptp_kb_spec(SubLObject kb_content, SubLObject static_assertions) {
        {
            SubLObject list_var = static_assertions;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, ASSERTION_P);
                }
            }
        }
        return list($KB_CONTENT, kb_content, $STATIC_ASSERTIONS, static_assertions);
    }

    public static final SubLObject tptp_kb_spec_kb_content(SubLObject kb_spec) {
        return getf(kb_spec, $KB_CONTENT, UNPROVIDED);
    }

    public static final SubLObject tptp_kb_spec_static_assertions(SubLObject kb_spec) {
        return getf(kb_spec, $STATIC_ASSERTIONS, UNPROVIDED);
    }

    /**
     * Since this doesn't retroactively affect the dynamic include lists, it
     * only makes sense for problem sets with no linchpins, in which only the static KB changes.
     */
    public static final SubLObject set_tptp_kb_spec_static_assertions(SubLObject kb_spec, SubLObject static_assertions) {
        {
            SubLObject list_var = static_assertions;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, ASSERTION_P);
                }
            }
        }
        return putf(kb_spec, $STATIC_ASSERTIONS, static_assertions);
    }

    public static final SubLObject declare_tptp_datastructures_file() {
        declareFunction("tptp_problem_skeletal_property_p", "TPTP-PROBLEM-SKELETAL-PROPERTY-P", 1, 0, false);
        declareFunction("tptp_problem_other_property_p", "TPTP-PROBLEM-OTHER-PROPERTY-P", 1, 0, false);
        declareFunction("tptp_problem_property_p", "TPTP-PROBLEM-PROPERTY-P", 1, 0, false);
        declareFunction("validate_tptp_problem", "VALIDATE-TPTP-PROBLEM", 1, 0, false);
        declareFunction("new_skeletal_tptp_problem", "NEW-SKELETAL-TPTP-PROBLEM", 2, 0, false);
        declareFunction("tptp_problem_openness", "TPTP-PROBLEM-OPENNESS", 1, 0, false);
        declareFunction("tptp_problem_answerability", "TPTP-PROBLEM-ANSWERABILITY", 1, 0, false);
        declareFunction("tptp_problem_num", "TPTP-PROBLEM-NUM", 1, 0, false);
        declareFunction("tptp_problem_pair_num", "TPTP-PROBLEM-PAIR-NUM", 1, 0, false);
        declareFunction("tptp_problem_module", "TPTP-PROBLEM-MODULE", 1, 0, false);
        declareFunction("tptp_problem_query", "TPTP-PROBLEM-QUERY", 1, 0, false);
        declareFunction("tptp_problem_justification", "TPTP-PROBLEM-JUSTIFICATION", 1, 0, false);
        declareFunction("tptp_problem_non_core_justification", "TPTP-PROBLEM-NON-CORE-JUSTIFICATION", 1, 0, false);
        declareFunction("tptp_problem_linchpin", "TPTP-PROBLEM-LINCHPIN", 1, 0, false);
        declareFunction("tptp_problem_staticP", "TPTP-PROBLEM-STATIC?", 1, 0, false);
        declareFunction("tptp_problem_dynamicP", "TPTP-PROBLEM-DYNAMIC?", 1, 0, false);
        declareFunction("tptp_problem_include_list_ids", "TPTP-PROBLEM-INCLUDE-LIST-IDS", 1, 0, false);
        declareFunction("tptp_problem_counterpart_num", "TPTP-PROBLEM-COUNTERPART-NUM", 1, 0, false);
        declareFunction("tptp_problem_header", "TPTP-PROBLEM-HEADER", 1, 0, false);
        declareFunction("tptp_problem_output_filename", "TPTP-PROBLEM-OUTPUT-FILENAME", 1, 0, false);
        declareFunction("find_tptp_problem_by_num", "FIND-TPTP-PROBLEM-BY-NUM", 2, 0, false);
        declareFunction("tptp_problem_nset_property", "TPTP-PROBLEM-NSET-PROPERTY", 3, 0, false);
        declareFunction("tptp_problem_delete_property", "TPTP-PROBLEM-DELETE-PROPERTY", 2, 0, false);
        declareFunction("tptp_problem_remove_property", "TPTP-PROBLEM-REMOVE-PROPERTY", 2, 0, false);
        declareFunction("printable_tptp_problem", "PRINTABLE-TPTP-PROBLEM", 1, 0, false);
        declareMacro("do_all_skeletal_tptp_problem_permutations", "DO-ALL-SKELETAL-TPTP-PROBLEM-PERMUTATIONS");
        declareFunction("both_answerabilities_in_random_order", "BOTH-ANSWERABILITIES-IN-RANDOM-ORDER", 0, 0, false);
        declareFunction("new_tptp_problem_set", "NEW-TPTP-PROBLEM-SET", 4, 0, false);
        declareFunction("tptp_problem_set_kb_spec", "TPTP-PROBLEM-SET-KB-SPEC", 1, 0, false);
        declareFunction("tptp_problem_set_typed_include_lists", "TPTP-PROBLEM-SET-TYPED-INCLUDE-LISTS", 1, 0, false);
        declareFunction("tptp_problem_set_tptp_problems", "TPTP-PROBLEM-SET-TPTP-PROBLEMS", 1, 0, false);
        declareFunction("tptp_problem_set_proof_checker_modeP", "TPTP-PROBLEM-SET-PROOF-CHECKER-MODE?", 1, 0, false);
        declareFunction("set_tptp_problem_set_kb_spec", "SET-TPTP-PROBLEM-SET-KB-SPEC", 2, 0, false);
        declareFunction("set_tptp_problem_set_tptp_problems", "SET-TPTP-PROBLEM-SET-TPTP-PROBLEMS", 2, 0, false);
        declareFunction("set_tptp_problem_set_proof_checker_mode", "SET-TPTP-PROBLEM-SET-PROOF-CHECKER-MODE", 2, 0, false);
        declareFunction("tptp_kb_spec_property_p", "TPTP-KB-SPEC-PROPERTY-P", 1, 0, false);
        declareFunction("tptp_kb_spec_p", "TPTP-KB-SPEC-P", 1, 0, false);
        declareFunction("new_tptp_kb_spec", "NEW-TPTP-KB-SPEC", 2, 0, false);
        declareFunction("tptp_kb_spec_kb_content", "TPTP-KB-SPEC-KB-CONTENT", 1, 0, false);
        declareFunction("tptp_kb_spec_static_assertions", "TPTP-KB-SPEC-STATIC-ASSERTIONS", 1, 0, false);
        declareFunction("set_tptp_kb_spec_static_assertions", "SET-TPTP-KB-SPEC-STATIC-ASSERTIONS", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_tptp_datastructures_file() {
        deflexical("*TPTP-PROBLEM-SKELETAL-PROPERTIES*", $list_alt0);
        deflexical("*TPTP-PROBLEM-OTHER-PROPERTIES*", $list_alt1);
        deflexical("*TPTP-KB-SPEC-PROPERTIES*", $list_alt42);
        return NIL;
    }

    public static final SubLObject setup_tptp_datastructures_file() {
                return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(makeKeyword("OPENNESS"), makeKeyword("ANSWERABILITY"));

    static private final SubLList $list_alt1 = list(new SubLObject[]{ makeKeyword("NUM"), makeKeyword("PAIR-NUM"), makeKeyword("MODULE"), makeKeyword("CYCL-QUERY"), makeKeyword("JUSTIFICATION"), makeKeyword("LINCHPIN"), makeKeyword("INCLUDE-LIST-IDS"), makeKeyword("COUNTERPART-NUM"), makeKeyword("HEADER"), makeKeyword("OUTPUT-FILENAME") });



    private static final SubLSymbol $OPENNESS = makeKeyword("OPENNESS");

    private static final SubLSymbol OPENNESS_P = makeSymbol("OPENNESS-P");

    private static final SubLSymbol $ANSWERABILITY = makeKeyword("ANSWERABILITY");

    private static final SubLSymbol ANSWERABILITY_P = makeSymbol("ANSWERABILITY-P");





    private static final SubLSymbol $PAIR_NUM = makeKeyword("PAIR-NUM");



    private static final SubLSymbol TPTP_QUERY_GENERATION_MODULE_NAME_P = makeSymbol("TPTP-QUERY-GENERATION-MODULE-NAME-P");

    private static final SubLSymbol $CYCL_QUERY = makeKeyword("CYCL-QUERY");





    static private final SubLString $str_alt15$Expected_an_assertion__got_an_HL_ = makeString("Expected an assertion, got an HL support ~s");



    private static final SubLSymbol $LINCHPIN = makeKeyword("LINCHPIN");



    private static final SubLSymbol $INCLUDE_LIST_IDS = makeKeyword("INCLUDE-LIST-IDS");



    private static final SubLSymbol $COUNTERPART_NUM = makeKeyword("COUNTERPART-NUM");







    private static final SubLSymbol FILE_VALID_FOR_WRITING_P = makeSymbol("FILE-VALID-FOR-WRITING-P");

    static private final SubLString $str_alt26$_s_was_not_a_valid_TPTP_PROBLEM_P = makeString("~s was not a valid TPTP-PROBLEM-PROPERTY-P");

    static private final SubLSymbol $sym27$TPTP_CORE_RULE_ = makeSymbol("TPTP-CORE-RULE?");

    private static final SubLSymbol $STATIC = makeKeyword("STATIC");

    static private final SubLString $str_alt29$Could_not_find_problem___a = makeString("Could not find problem #~a");

    private static final SubLSymbol TPTP_PROBLEM_PROPERTY_P = makeSymbol("TPTP-PROBLEM-PROPERTY-P");

    static private final SubLList $list_alt31 = list(list(makeSymbol("SKELETAL-TPTP-PROBLEM")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym32$OPENNESS = makeUninternedSymbol("OPENNESS");

    static private final SubLSymbol $sym33$ANSWERABILITY = makeUninternedSymbol("ANSWERABILITY");



    static private final SubLList $list_alt35 = list(list(QUOTE, list(makeKeyword("CLOSED"), $OPEN)));

    static private final SubLList $list_alt36 = list(list(makeSymbol("BOTH-ANSWERABILITIES-IN-RANDOM-ORDER")));



    private static final SubLSymbol NEW_SKELETAL_TPTP_PROBLEM = makeSymbol("NEW-SKELETAL-TPTP-PROBLEM");

    static private final SubLList $list_alt39 = list(makeKeyword("ANSWERABLE"), makeKeyword("UNANSWERABLE"));

    static private final SubLList $list_alt40 = list(makeKeyword("UNANSWERABLE"), makeKeyword("ANSWERABLE"));

    private static final SubLSymbol TPTP_KB_SPEC_P = makeSymbol("TPTP-KB-SPEC-P");

    static private final SubLList $list_alt42 = list(makeKeyword("KB-CONTENT"), makeKeyword("STATIC-ASSERTIONS"));

    private static final SubLSymbol TPTP_KB_SPEC_PROPERTY_P = makeSymbol("TPTP-KB-SPEC-PROPERTY-P");



    private static final SubLSymbol $KB_CONTENT = makeKeyword("KB-CONTENT");

    private static final SubLSymbol $STATIC_ASSERTIONS = makeKeyword("STATIC-ASSERTIONS");

    // // Initializers
    public void declareFunctions() {
        declare_tptp_datastructures_file();
    }

    public void initializeVariables() {
        init_tptp_datastructures_file();
    }

    public void runTopLevelForms() {
        setup_tptp_datastructures_file();
    }
}

