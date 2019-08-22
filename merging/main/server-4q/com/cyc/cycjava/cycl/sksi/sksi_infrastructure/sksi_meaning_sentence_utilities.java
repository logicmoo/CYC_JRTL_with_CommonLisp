/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_extensional_set_elements;
import static com.cyc.cycjava.cycl.el_utilities.el_set_p;
import static com.cyc.cycjava.cycl.el_utilities.ist_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.make_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sublis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.keyhash_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.pred_relevance_macros;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SKSI-MEANING-SENTENCE-UTILITIES
 * source file: /cyc/top/cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp
 * created:     2019/07/03 17:37:53
 */
public final class sksi_meaning_sentence_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sksi_meaning_sentence_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities";




    private static final SubLObject $const1$conditionalMeaningSentenceOfSchem = reader_make_constant_shell("conditionalMeaningSentenceOfSchema");

    static private final SubLList $list2 = list(list(makeSymbol("LOGICAL-SCHEMA"), makeSymbol("MEANING-SENTENCE")), makeSymbol("MEANING-SENTENCE-GAF"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol GAF_ARGS = makeSymbol("GAF-ARGS");

    static private final SubLList $list5 = list(list(makeSymbol("ANTECEDENT-LOGICAL-SCHEMATA"), makeSymbol("ANTECEDENT-MEANING-SENTENCE"), makeSymbol("CONSEQUENT-LOGICAL-SCHEMATA"), makeSymbol("CONSEQUENT-MEANING-SENTENCE")), makeSymbol("CONDITIONAL-MEANING-SENTENCE-GAF"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym7$GET_ANTECEDENT_LOGICAL_SCHEMATA_FROM_CONDITIONAL_MEANING_SENTENCE = makeSymbol("GET-ANTECEDENT-LOGICAL-SCHEMATA-FROM-CONDITIONAL-MEANING-SENTENCE-GAF");

    private static final SubLSymbol GET_ANTECEDENT_MEANING_SENTENCE_FROM_GAF = makeSymbol("GET-ANTECEDENT-MEANING-SENTENCE-FROM-GAF");

    static private final SubLSymbol $sym9$GET_CONSEQUENT_LOGICAL_SCHEMATA_FROM_CONDITIONAL_MEANING_SENTENCE = makeSymbol("GET-CONSEQUENT-LOGICAL-SCHEMATA-FROM-CONDITIONAL-MEANING-SENTENCE-GAF");

    private static final SubLSymbol GET_CONSEQUENT_MEANING_SENTENCE_FROM_GAF = makeSymbol("GET-CONSEQUENT-MEANING-SENTENCE-FROM-GAF");

    static private final SubLList $list11 = list(list(makeSymbol("ANTECEDENT-LOGICAL-SCHEMATA"), makeSymbol("ANTECEDENT-MEANING-SENTENCE"), makeSymbol("CONSEQUENT-LOGICAL-SCHEMATA"), makeSymbol("CONSEQUENT-MEANING-SENTENCE")), makeSymbol("CONDITIONAL-MEANING-SENTENCE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol GET_ANTECEDENT_LOGICAL_SCHEMATA_FROM_CONDITIONAL_MEANING_SENTENCE = makeSymbol("GET-ANTECEDENT-LOGICAL-SCHEMATA-FROM-CONDITIONAL-MEANING-SENTENCE");

    private static final SubLSymbol GET_ANTECEDENT_MEANING_SENTENCE_FROM_CONDITIONAL_MEANING_SENTENCE = makeSymbol("GET-ANTECEDENT-MEANING-SENTENCE-FROM-CONDITIONAL-MEANING-SENTENCE");

    private static final SubLSymbol GET_CONSEQUENT_LOGICAL_SCHEMATA_FROM_CONDITIONAL_MEANING_SENTENCE = makeSymbol("GET-CONSEQUENT-LOGICAL-SCHEMATA-FROM-CONDITIONAL-MEANING-SENTENCE");

    private static final SubLSymbol GET_CONSEQUENT_MEANING_SENTENCE_FROM_CONDITIONAL_MEANING_SENTENCE = makeSymbol("GET-CONSEQUENT-MEANING-SENTENCE-FROM-CONDITIONAL-MEANING-SENTENCE");

    private static final SubLSymbol GET_RELEVANT_MEANING_SENTENCE_FROM_GAF = makeSymbol("GET-RELEVANT-MEANING-SENTENCE-FROM-GAF");

    private static final SubLSymbol SUPPORTED_CONDITIONAL_MEANING_SENTENCE_GAF_INT = makeSymbol("SUPPORTED-CONDITIONAL-MEANING-SENTENCE-GAF-INT");

    private static final SubLSymbol LOGICAL_SCHEMA_SOURCES = makeSymbol("LOGICAL-SCHEMA-SOURCES");

    private static final SubLSymbol $sym20$SINGLETON_ = makeSymbol("SINGLETON?");

    private static final SubLList $list21 = list(makeSymbol("MEANING-SENTENCES"), makeSymbol("CON-MS"), makeSymbol("ANT-LS-SET"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol CON_LFS = makeSymbol("CON-LFS");

    private static final SubLSymbol EXPRESSION_LOGICAL_FIELDS_FOR_INDEXICALS = makeSymbol("EXPRESSION-LOGICAL-FIELDS-FOR-INDEXICALS");

    private static final SubLSymbol $appropriate_antecedent_literal_tmp_args$ = makeSymbol("*APPROPRIATE-ANTECEDENT-LITERAL-TMP-ARGS*");

    private static final SubLSymbol $sym26$LOGICAL_FIELD_INDEXICAL_FOR_SCHEMA_ = makeSymbol("LOGICAL-FIELD-INDEXICAL-FOR-SCHEMA?");

    private static final SubLSymbol $sym27$APPROPRIATE_ANTECEDENT_LITERAL_ = makeSymbol("APPROPRIATE-ANTECEDENT-LITERAL?");

    private static final SubLList $list28 = list(makeSymbol("MEANING-SENTENCES"), makeSymbol("CON-LFS"), makeSymbol("ANT-LS-SET"));

    private static final SubLSymbol $sym29$LOGICAL_FIELDS_JOINABLE_ = makeSymbol("LOGICAL-FIELDS-JOINABLE?");

    private static final SubLSymbol LOGICAL_SCHEMA_MEANING_SENTENCE_GAFS_MEMOIZED = makeSymbol("LOGICAL-SCHEMA-MEANING-SENTENCE-GAFS-MEMOIZED");

    private static final SubLSymbol $sym34$LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_GAFS_MEMOI = makeSymbol("LOGICAL-SCHEMA-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAFS-MEMOIZED");

    private static final SubLSymbol SUPPORTED_CONDITIONAL_MEANING_SENTENCE_GAF_P = makeSymbol("SUPPORTED-CONDITIONAL-MEANING-SENTENCE-GAF-P");

    private static final SubLSymbol $sym36$MEANING_SENTENCE_PRED_RELEVANT_ = makeSymbol("MEANING-SENTENCE-PRED-RELEVANT?");

    private static final SubLSymbol RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE = makeSymbol("RELEVANT-PRED-IS-SPEC-PRED-OR-INVERSE");

    private static final SubLSymbol RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCE_GAFS_MEMOIZED = makeSymbol("RELEVANT-LOGICAL-SCHEMA-MEANING-SENTENCE-GAFS-MEMOIZED");

    private static final SubLSymbol $sym42$RELEVANT_LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_G = makeSymbol("RELEVANT-LOGICAL-SCHEMA-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAFS-MEMOIZED");

    private static final SubLSymbol LOGICAL_SCHEMA_CONDITIONAL_MEANING_SENTENCE_GAFS = makeSymbol("LOGICAL-SCHEMA-CONDITIONAL-MEANING-SENTENCE-GAFS");

    private static final SubLSymbol RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCES = makeSymbol("RELEVANT-LOGICAL-SCHEMA-MEANING-SENTENCES");

    private static final SubLSymbol RELEVANT_LOGICAL_SCHEMA_CONDITIONAL_MEANING_SENTENCES = makeSymbol("RELEVANT-LOGICAL-SCHEMA-CONDITIONAL-MEANING-SENTENCES");

    private static final SubLSymbol GET_CONSEQUENT_MEANING_SENTENCE_FROM_GAF_UNWRAPPING_ISTS = makeSymbol("GET-CONSEQUENT-MEANING-SENTENCE-FROM-GAF-UNWRAPPING-ISTS");

    private static final SubLSymbol LOGICAL_SCHEMA_ALL_RELEVANT_PREDS_MEMOIZED = makeSymbol("LOGICAL-SCHEMA-ALL-RELEVANT-PREDS-MEMOIZED");

    private static final SubLSymbol LOGICAL_FIELD_INDEXICAL_P = makeSymbol("LOGICAL-FIELD-INDEXICAL-P");

    private static final SubLSymbol SKSI_CODE_MAPPING_PREDICATES_FOR_LOGICAL_FIELD_INDEXICAL = makeSymbol("SKSI-CODE-MAPPING-PREDICATES-FOR-LOGICAL-FIELD-INDEXICAL");

    private static final SubLSymbol MEANING_SENTENCE_TYPE_CHECK_MEMOIZED = makeSymbol("MEANING-SENTENCE-TYPE-CHECK-MEMOIZED");

    private static final SubLString $str52$__SKSI__A_ = makeString("~&SKSI-~A ");

    private static final SubLString $str53$meaning_sentence_type_check_int_f = makeString("meaning-sentence-type-check-int failed: ~S wrt ~S~%");

    private static final SubLSymbol MEANING_SENTENCE_ARG_TYPE_CHECK_MEMOIZED = makeSymbol("MEANING-SENTENCE-ARG-TYPE-CHECK-MEMOIZED");

    private static final SubLSymbol GENERATE_PATTERN_FOR_MEANING_SENTENCE_MEMOIZED = makeSymbol("GENERATE-PATTERN-FOR-MEANING-SENTENCE-MEMOIZED");

    private static final SubLSymbol $NOT_FULLY_BOUND = makeKeyword("NOT-FULLY-BOUND");

    private static final SubLString $str64$Unknown_strength__a_ = makeString("Unknown strength ~a.");



    private static final SubLList $list66 = list(TWO_INTEGER);

    private static final SubLSymbol $sym67$_ = makeSymbol("=");

    private static final SubLSymbol GENERATE_PATTERN_FOR_MEANING_SENTENCE_ARG_MEMOIZED = makeSymbol("GENERATE-PATTERN-FOR-MEANING-SENTENCE-ARG-MEMOIZED");

    private static final SubLSymbol CYCL_NAT_P = makeSymbol("CYCL-NAT-P");

    private static final SubLSymbol $NOT_ISA_DISJOINT_MEMOIZED = makeKeyword("NOT-ISA-DISJOINT-MEMOIZED");

    private static final SubLSymbol $NOT_ISA_DISJOINT = makeKeyword("NOT-ISA-DISJOINT");

    private static final SubLSymbol LOGICAL_FIELD_INDEXICAL_EL_FORMULA_P = makeSymbol("LOGICAL-FIELD-INDEXICAL-EL-FORMULA-P");

    private static final SubLSymbol $sym83$POSSIBLY_NART_EL_FORMULA_W_O_LOGICAL_FIELD_INDEXICALS_P = makeSymbol("POSSIBLY-NART-EL-FORMULA-W/O-LOGICAL-FIELD-INDEXICALS-P");

    private static final SubLSymbol SKSI_VALID_MEANING_SENTENCE_PRED_P = makeSymbol("SKSI-VALID-MEANING-SENTENCE-PRED-P");

    private static final SubLSymbol SKSI_VALID_MEANING_SENTENCE_PRED_FOR_STORAGE_P = makeSymbol("SKSI-VALID-MEANING-SENTENCE-PRED-FOR-STORAGE-P");

    private static final SubLSymbol LOGICAL_FIELD_FOR_INDEXICAL = makeSymbol("LOGICAL-FIELD-FOR-INDEXICAL");

    private static final SubLSymbol MEANING_SENTENCE_LOGICAL_FIELD_INDEXICAL_P = makeSymbol("MEANING-SENTENCE-LOGICAL-FIELD-INDEXICAL-P");



    // Definitions
    public static final SubLObject meaning_sentence_gaf_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.ordinary_meaning_sentence_gaf_p(v_object)) || (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.conditional_meaning_sentence_gaf_p(v_object)));
    }

    // Definitions
    public static SubLObject meaning_sentence_gaf_p(final SubLObject v_object) {
        return makeBoolean((NIL != ordinary_meaning_sentence_gaf_p(v_object)) || (NIL != conditional_meaning_sentence_gaf_p(v_object)));
    }

    public static final SubLObject ordinary_meaning_sentence_gaf_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != assertions_high.gaf_assertionP(v_object)) && (assertions_high.gaf_predicate(v_object) == $$meaningSentenceOfSchema));
    }

    public static SubLObject ordinary_meaning_sentence_gaf_p(final SubLObject v_object) {
        return makeBoolean((NIL != assertions_high.gaf_assertionP(v_object)) && assertions_high.gaf_predicate(v_object).eql($$meaningSentenceOfSchema));
    }

    public static final SubLObject conditional_meaning_sentence_gaf_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != assertions_high.gaf_assertionP(v_object)) && (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.gaf_assertion_is_conditional_meaning_sentence_gafP(v_object)));
    }

    public static SubLObject conditional_meaning_sentence_gaf_p(final SubLObject v_object) {
        return makeBoolean((NIL != assertions_high.gaf_assertionP(v_object)) && (NIL != gaf_assertion_is_conditional_meaning_sentence_gafP(v_object)));
    }

    public static final SubLObject gaf_assertion_is_conditional_meaning_sentence_gafP_alt(SubLObject gaf) {
        return eq(assertions_high.gaf_predicate(gaf), $const1$conditionalMeaningSentenceOfSchem);
    }

    public static SubLObject gaf_assertion_is_conditional_meaning_sentence_gafP(final SubLObject gaf) {
        return eq(assertions_high.gaf_predicate(gaf), $const1$conditionalMeaningSentenceOfSchem);
    }

    public static final SubLObject get_logical_schema_from_meaning_sentence_gaf_alt(SubLObject meaning_sentence_gaf) {
        return assertions_high.gaf_arg1(meaning_sentence_gaf);
    }

    public static SubLObject get_logical_schema_from_meaning_sentence_gaf(final SubLObject meaning_sentence_gaf) {
        return assertions_high.gaf_arg1(meaning_sentence_gaf);
    }

    public static final SubLObject get_logical_schemata_from_meaning_sentence_gaf_alt(SubLObject meaning_sentence_gaf) {
        return list(assertions_high.gaf_arg1(meaning_sentence_gaf));
    }

    public static SubLObject get_logical_schemata_from_meaning_sentence_gaf(final SubLObject meaning_sentence_gaf) {
        return list(assertions_high.gaf_arg1(meaning_sentence_gaf));
    }

    public static final SubLObject get_meaning_sentence_from_gaf_alt(SubLObject meaning_sentence_gaf, SubLObject unwrap_istsP) {
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject meaning_sentence = assertions_high.gaf_arg2(meaning_sentence_gaf);
                if (NIL != unwrap_istsP) {
                    thread.resetMultipleValues();
                    {
                        SubLObject formula = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.unwrap_meaning_sentence_if_ist(meaning_sentence);
                        SubLObject mt = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        meaning_sentence = formula;
                    }
                }
                return meaning_sentence;
            }
        }
    }

    public static SubLObject get_meaning_sentence_from_gaf(final SubLObject meaning_sentence_gaf, SubLObject unwrap_istsP) {
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject meaning_sentence = assertions_high.gaf_arg2(meaning_sentence_gaf);
        if (NIL != unwrap_istsP) {
            thread.resetMultipleValues();
            final SubLObject formula = unwrap_meaning_sentence_if_ist(meaning_sentence);
            final SubLObject mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            meaning_sentence = formula;
        }
        return meaning_sentence;
    }

    public static final SubLObject get_meaning_sentence_pred_from_gaf_alt(SubLObject meaning_sentence_gaf, SubLObject unwrap_istsP) {
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = T;
        }
        {
            SubLObject meaning_sentence = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.get_meaning_sentence_from_gaf(meaning_sentence_gaf, unwrap_istsP);
            return cycl_utilities.formula_operator(meaning_sentence);
        }
    }

    public static SubLObject get_meaning_sentence_pred_from_gaf(final SubLObject meaning_sentence_gaf, SubLObject unwrap_istsP) {
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = T;
        }
        final SubLObject meaning_sentence = get_meaning_sentence_from_gaf(meaning_sentence_gaf, unwrap_istsP);
        return cycl_utilities.formula_operator(meaning_sentence);
    }

    public static final SubLObject destructure_meaning_sentence_gaf_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject logical_schema = NIL;
                    SubLObject meaning_sentence = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt2);
                    logical_schema = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt2);
                    meaning_sentence = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject meaning_sentence_gaf = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt2);
                            meaning_sentence_gaf = current.first();
                            current = current.rest();
                            {
                                SubLObject body = current;
                                return listS(CDESTRUCTURING_BIND, list(logical_schema, meaning_sentence), list(GAF_ARGS, meaning_sentence_gaf), append(body, NIL));
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt2);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject destructure_meaning_sentence_gaf(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject logical_schema = NIL;
        SubLObject meaning_sentence = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        logical_schema = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        meaning_sentence = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject meaning_sentence_gaf = NIL;
            destructuring_bind_must_consp(current, datum, $list2);
            meaning_sentence_gaf = current.first();
            final SubLObject body;
            current = body = current.rest();
            return listS(CDESTRUCTURING_BIND, list(logical_schema, meaning_sentence), list(GAF_ARGS, meaning_sentence_gaf), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list2);
        return NIL;
    }

    public static final SubLObject get_antecedent_logical_schemata_from_conditional_meaning_sentence_gaf_alt(SubLObject conditional_meaning_sentence_gaf) {
        return el_extensional_set_elements(assertions_high.gaf_arg1(conditional_meaning_sentence_gaf));
    }

    public static SubLObject get_antecedent_logical_schemata_from_conditional_meaning_sentence_gaf(final SubLObject conditional_meaning_sentence_gaf) {
        return el_extensional_set_elements(assertions_high.gaf_arg1(conditional_meaning_sentence_gaf));
    }

    public static final SubLObject get_antecedent_meaning_sentence_from_gaf_alt(SubLObject conditional_meaning_sentence_gaf) {
        return assertions_high.gaf_arg2(conditional_meaning_sentence_gaf);
    }

    public static SubLObject get_antecedent_meaning_sentence_from_gaf(final SubLObject conditional_meaning_sentence_gaf) {
        return assertions_high.gaf_arg2(conditional_meaning_sentence_gaf);
    }

    public static final SubLObject get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf_alt(SubLObject conditional_meaning_sentence_gaf) {
        {
            SubLObject schemata = assertions_high.gaf_arg3(conditional_meaning_sentence_gaf);
            return NIL != el_set_p(schemata) ? ((SubLObject) (el_extensional_set_elements(schemata))) : list(schemata);
        }
    }

    public static SubLObject get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf(final SubLObject conditional_meaning_sentence_gaf) {
        final SubLObject schemata = assertions_high.gaf_arg3(conditional_meaning_sentence_gaf);
        return NIL != el_set_p(schemata) ? el_extensional_set_elements(schemata) : list(schemata);
    }

    public static final SubLObject get_consequent_meaning_sentence_from_gaf_alt(SubLObject conditional_meaning_sentence_gaf, SubLObject unwrap_istsP) {
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject meaning_sentence = assertions_high.gaf_arg4(conditional_meaning_sentence_gaf);
                if (NIL != unwrap_istsP) {
                    thread.resetMultipleValues();
                    {
                        SubLObject formula = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.unwrap_meaning_sentence_if_ist(meaning_sentence);
                        SubLObject mt = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        meaning_sentence = formula;
                    }
                }
                return meaning_sentence;
            }
        }
    }

    public static SubLObject get_consequent_meaning_sentence_from_gaf(final SubLObject conditional_meaning_sentence_gaf, SubLObject unwrap_istsP) {
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject meaning_sentence = assertions_high.gaf_arg4(conditional_meaning_sentence_gaf);
        if (NIL != unwrap_istsP) {
            thread.resetMultipleValues();
            final SubLObject formula = unwrap_meaning_sentence_if_ist(meaning_sentence);
            final SubLObject mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            meaning_sentence = formula;
        }
        return meaning_sentence;
    }

    public static final SubLObject get_consequent_meaning_sentence_from_gaf_unwrapping_ists_alt(SubLObject conditional_meaning_sentence_gaf) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf(conditional_meaning_sentence_gaf, T);
    }

    public static SubLObject get_consequent_meaning_sentence_from_gaf_unwrapping_ists(final SubLObject conditional_meaning_sentence_gaf) {
        return get_consequent_meaning_sentence_from_gaf(conditional_meaning_sentence_gaf, T);
    }

    public static final SubLObject destructure_conditional_meaning_sentence_gaf_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject antecedent_logical_schemata = NIL;
                    SubLObject antecedent_meaning_sentence = NIL;
                    SubLObject consequent_logical_schemata = NIL;
                    SubLObject consequent_meaning_sentence = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt5);
                    antecedent_logical_schemata = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt5);
                    antecedent_meaning_sentence = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt5);
                    consequent_logical_schemata = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt5);
                    consequent_meaning_sentence = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject conditional_meaning_sentence_gaf = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt5);
                            conditional_meaning_sentence_gaf = current.first();
                            current = current.rest();
                            {
                                SubLObject body = current;
                                return listS(CLET, list(list(antecedent_logical_schemata, list($sym7$GET_ANTECEDENT_LOGICAL_SCHEMATA_FROM_CONDITIONAL_MEANING_SENTENCE, conditional_meaning_sentence_gaf)), list(antecedent_meaning_sentence, list(GET_ANTECEDENT_MEANING_SENTENCE_FROM_GAF, conditional_meaning_sentence_gaf)), list(consequent_logical_schemata, list($sym9$GET_CONSEQUENT_LOGICAL_SCHEMATA_FROM_CONDITIONAL_MEANING_SENTENCE, conditional_meaning_sentence_gaf)), list(consequent_meaning_sentence, list(GET_CONSEQUENT_MEANING_SENTENCE_FROM_GAF, conditional_meaning_sentence_gaf))), append(body, NIL));
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt5);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject destructure_conditional_meaning_sentence_gaf(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject antecedent_logical_schemata = NIL;
        SubLObject antecedent_meaning_sentence = NIL;
        SubLObject consequent_logical_schemata = NIL;
        SubLObject consequent_meaning_sentence = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        antecedent_logical_schemata = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        antecedent_meaning_sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        consequent_logical_schemata = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        consequent_meaning_sentence = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject conditional_meaning_sentence_gaf = NIL;
            destructuring_bind_must_consp(current, datum, $list5);
            conditional_meaning_sentence_gaf = current.first();
            final SubLObject body;
            current = body = current.rest();
            return listS(CLET, list(list(antecedent_logical_schemata, list($sym7$GET_ANTECEDENT_LOGICAL_SCHEMATA_FROM_CONDITIONAL_MEANING_SENTENCE, conditional_meaning_sentence_gaf)), list(antecedent_meaning_sentence, list(GET_ANTECEDENT_MEANING_SENTENCE_FROM_GAF, conditional_meaning_sentence_gaf)), list(consequent_logical_schemata, list($sym9$GET_CONSEQUENT_LOGICAL_SCHEMATA_FROM_CONDITIONAL_MEANING_SENTENCE, conditional_meaning_sentence_gaf)), list(consequent_meaning_sentence, list(GET_CONSEQUENT_MEANING_SENTENCE_FROM_GAF, conditional_meaning_sentence_gaf))), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    public static final SubLObject destructure_conditional_meaning_sentence_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt11);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject antecedent_logical_schemata = NIL;
                    SubLObject antecedent_meaning_sentence = NIL;
                    SubLObject consequent_logical_schemata = NIL;
                    SubLObject consequent_meaning_sentence = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt11);
                    antecedent_logical_schemata = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt11);
                    antecedent_meaning_sentence = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt11);
                    consequent_logical_schemata = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt11);
                    consequent_meaning_sentence = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject conditional_meaning_sentence = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt11);
                            conditional_meaning_sentence = current.first();
                            current = current.rest();
                            {
                                SubLObject body = current;
                                return listS(CLET, list(list(antecedent_logical_schemata, list(GET_ANTECEDENT_LOGICAL_SCHEMATA_FROM_CONDITIONAL_MEANING_SENTENCE, conditional_meaning_sentence)), list(antecedent_meaning_sentence, list(GET_ANTECEDENT_MEANING_SENTENCE_FROM_CONDITIONAL_MEANING_SENTENCE, conditional_meaning_sentence)), list(consequent_logical_schemata, list(GET_CONSEQUENT_LOGICAL_SCHEMATA_FROM_CONDITIONAL_MEANING_SENTENCE, conditional_meaning_sentence)), list(consequent_meaning_sentence, list(GET_CONSEQUENT_MEANING_SENTENCE_FROM_CONDITIONAL_MEANING_SENTENCE, conditional_meaning_sentence))), append(body, NIL));
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt11);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject destructure_conditional_meaning_sentence(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list11);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject antecedent_logical_schemata = NIL;
        SubLObject antecedent_meaning_sentence = NIL;
        SubLObject consequent_logical_schemata = NIL;
        SubLObject consequent_meaning_sentence = NIL;
        destructuring_bind_must_consp(current, datum, $list11);
        antecedent_logical_schemata = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list11);
        antecedent_meaning_sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list11);
        consequent_logical_schemata = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list11);
        consequent_meaning_sentence = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject conditional_meaning_sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list11);
            conditional_meaning_sentence = current.first();
            final SubLObject body;
            current = body = current.rest();
            return listS(CLET, list(list(antecedent_logical_schemata, list(GET_ANTECEDENT_LOGICAL_SCHEMATA_FROM_CONDITIONAL_MEANING_SENTENCE, conditional_meaning_sentence)), list(antecedent_meaning_sentence, list(GET_ANTECEDENT_MEANING_SENTENCE_FROM_CONDITIONAL_MEANING_SENTENCE, conditional_meaning_sentence)), list(consequent_logical_schemata, list(GET_CONSEQUENT_LOGICAL_SCHEMATA_FROM_CONDITIONAL_MEANING_SENTENCE, conditional_meaning_sentence)), list(consequent_meaning_sentence, list(GET_CONSEQUENT_MEANING_SENTENCE_FROM_CONDITIONAL_MEANING_SENTENCE, conditional_meaning_sentence))), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list11);
        return NIL;
    }

    public static final SubLObject get_antecedent_logical_schemata_from_conditional_meaning_sentence_alt(SubLObject cms) {
        return el_extensional_set_elements(cycl_utilities.formula_arg1(cms, UNPROVIDED));
    }

    public static SubLObject get_antecedent_logical_schemata_from_conditional_meaning_sentence(final SubLObject cms) {
        return el_extensional_set_elements(cycl_utilities.formula_arg1(cms, UNPROVIDED));
    }

    public static final SubLObject get_antecedent_meaning_sentence_from_conditional_meaning_sentence_alt(SubLObject cms) {
        return cycl_utilities.formula_arg2(cms, UNPROVIDED);
    }

    public static SubLObject get_antecedent_meaning_sentence_from_conditional_meaning_sentence(final SubLObject cms) {
        return cycl_utilities.formula_arg2(cms, UNPROVIDED);
    }

    public static final SubLObject get_consequent_logical_schemata_from_conditional_meaning_sentence_alt(SubLObject cms) {
        {
            SubLObject schemata = cycl_utilities.formula_arg3(cms, UNPROVIDED);
            return NIL != el_set_p(schemata) ? ((SubLObject) (el_extensional_set_elements(schemata))) : list(schemata);
        }
    }

    public static SubLObject get_consequent_logical_schemata_from_conditional_meaning_sentence(final SubLObject cms) {
        final SubLObject schemata = cycl_utilities.formula_arg3(cms, UNPROVIDED);
        return NIL != el_set_p(schemata) ? el_extensional_set_elements(schemata) : list(schemata);
    }

    public static final SubLObject get_consequent_meaning_sentence_from_conditional_meaning_sentence_alt(SubLObject cms) {
        return cycl_utilities.formula_arg4(cms, UNPROVIDED);
    }

    public static SubLObject get_consequent_meaning_sentence_from_conditional_meaning_sentence(final SubLObject cms) {
        return cycl_utilities.formula_arg4(cms, UNPROVIDED);
    }

    /**
     * If MEANING-SENTENCE-GAF is an ordinary meaning sentence GAF, then this returns
     * the meaning sentence.  If MEANING-SENTENCE-GAF is a conditional meaning sentence,
     * then this returns the consequent meaning sentence.
     */
    @LispMethod(comment = "If MEANING-SENTENCE-GAF is an ordinary meaning sentence GAF, then this returns\r\nthe meaning sentence.  If MEANING-SENTENCE-GAF is a conditional meaning sentence,\r\nthen this returns the consequent meaning sentence.\nIf MEANING-SENTENCE-GAF is an ordinary meaning sentence GAF, then this returns\nthe meaning sentence.  If MEANING-SENTENCE-GAF is a conditional meaning sentence,\nthen this returns the consequent meaning sentence.")
    public static final SubLObject get_relevant_meaning_sentence_from_gaf_internal_alt(SubLObject meaning_sentence_gaf, SubLObject unwrap_istsP) {
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = NIL;
        }
        return NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.gaf_assertion_is_conditional_meaning_sentence_gafP(meaning_sentence_gaf) ? ((SubLObject) (com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf(meaning_sentence_gaf, unwrap_istsP))) : com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.get_meaning_sentence_from_gaf(meaning_sentence_gaf, unwrap_istsP);
    }

    /**
     * If MEANING-SENTENCE-GAF is an ordinary meaning sentence GAF, then this returns
     * the meaning sentence.  If MEANING-SENTENCE-GAF is a conditional meaning sentence,
     * then this returns the consequent meaning sentence.
     */
    @LispMethod(comment = "If MEANING-SENTENCE-GAF is an ordinary meaning sentence GAF, then this returns\r\nthe meaning sentence.  If MEANING-SENTENCE-GAF is a conditional meaning sentence,\r\nthen this returns the consequent meaning sentence.\nIf MEANING-SENTENCE-GAF is an ordinary meaning sentence GAF, then this returns\nthe meaning sentence.  If MEANING-SENTENCE-GAF is a conditional meaning sentence,\nthen this returns the consequent meaning sentence.")
    public static SubLObject get_relevant_meaning_sentence_from_gaf_internal(final SubLObject meaning_sentence_gaf, SubLObject unwrap_istsP) {
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = NIL;
        }
        return NIL != gaf_assertion_is_conditional_meaning_sentence_gafP(meaning_sentence_gaf) ? get_consequent_meaning_sentence_from_gaf(meaning_sentence_gaf, unwrap_istsP) : get_meaning_sentence_from_gaf(meaning_sentence_gaf, unwrap_istsP);
    }

    public static final SubLObject get_relevant_meaning_sentence_from_gaf_alt(SubLObject meaning_sentence_gaf, SubLObject unwrap_istsP) {
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.get_relevant_meaning_sentence_from_gaf_internal(meaning_sentence_gaf, unwrap_istsP);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, GET_RELEVANT_MEANING_SENTENCE_FROM_GAF, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), GET_RELEVANT_MEANING_SENTENCE_FROM_GAF, TWO_INTEGER, $int$1000, EQL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, GET_RELEVANT_MEANING_SENTENCE_FROM_GAF, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(meaning_sentence_gaf, unwrap_istsP);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw18$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (meaning_sentence_gaf.eql(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && unwrap_istsP.eql(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.get_relevant_meaning_sentence_from_gaf_internal(meaning_sentence_gaf, unwrap_istsP)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(meaning_sentence_gaf, unwrap_istsP));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject get_relevant_meaning_sentence_from_gaf(final SubLObject meaning_sentence_gaf, SubLObject unwrap_istsP) {
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return get_relevant_meaning_sentence_from_gaf_internal(meaning_sentence_gaf, unwrap_istsP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, GET_RELEVANT_MEANING_SENTENCE_FROM_GAF, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), GET_RELEVANT_MEANING_SENTENCE_FROM_GAF, TWO_INTEGER, $int$1000, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, GET_RELEVANT_MEANING_SENTENCE_FROM_GAF, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(meaning_sentence_gaf, unwrap_istsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (meaning_sentence_gaf.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && unwrap_istsP.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(get_relevant_meaning_sentence_from_gaf_internal(meaning_sentence_gaf, unwrap_istsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(meaning_sentence_gaf, unwrap_istsP));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject get_relevant_logical_schemata_and_meaning_sentence_from_gaf_alt(SubLObject meaning_sentence_gaf, SubLObject unwrap_istsP) {
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = NIL;
        }
        return NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.gaf_assertion_is_conditional_meaning_sentence_gafP(meaning_sentence_gaf) ? ((SubLObject) (values(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf(meaning_sentence_gaf), com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf(meaning_sentence_gaf, unwrap_istsP)))) : values(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.get_logical_schemata_from_meaning_sentence_gaf(meaning_sentence_gaf), com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.get_meaning_sentence_from_gaf(meaning_sentence_gaf, unwrap_istsP));
    }

    public static SubLObject get_relevant_logical_schemata_and_meaning_sentence_from_gaf(final SubLObject meaning_sentence_gaf, SubLObject unwrap_istsP) {
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = NIL;
        }
        return NIL != gaf_assertion_is_conditional_meaning_sentence_gafP(meaning_sentence_gaf) ? values(get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf(meaning_sentence_gaf), get_consequent_meaning_sentence_from_gaf(meaning_sentence_gaf, unwrap_istsP)) : values(get_logical_schemata_from_meaning_sentence_gaf(meaning_sentence_gaf), get_meaning_sentence_from_gaf(meaning_sentence_gaf, unwrap_istsP));
    }

    public static final SubLObject supported_conditional_meaning_sentence_gaf_p_alt(SubLObject v_object, SubLObject sks) {
        if (sks == UNPROVIDED) {
            sks = NIL;
        }
        return makeBoolean((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.conditional_meaning_sentence_gaf_p(v_object)) && (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.supported_conditional_meaning_sentence_gaf_int(v_object, sks, mt_relevance_macros.mt_info(UNPROVIDED))));
    }

    public static SubLObject supported_conditional_meaning_sentence_gaf_p(final SubLObject v_object, SubLObject sks) {
        if (sks == UNPROVIDED) {
            sks = NIL;
        }
        return makeBoolean((NIL != conditional_meaning_sentence_gaf_p(v_object)) && (NIL != supported_conditional_meaning_sentence_gaf_int(v_object, sks, mt_relevance_macros.mt_info(UNPROVIDED))));
    }

    public static final SubLObject supported_conditional_meaning_sentence_gaf_int_internal_alt(SubLObject cms_gaf, SubLObject sks, SubLObject mt_info) {
        {
            SubLObject ant_ls_set = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.get_antecedent_logical_schemata_from_conditional_meaning_sentence_gaf(cms_gaf);
            SubLObject ant_ms = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.get_antecedent_meaning_sentence_from_gaf(cms_gaf);
            SubLObject con_ls_set = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf(cms_gaf);
            SubLObject con_ms = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf(cms_gaf, UNPROVIDED);
            return makeBoolean(((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.appropriate_logical_schemata_setsP(ant_ls_set, con_ls_set, sks)) && (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.appropriate_consequent_meaning_sentenceP(ant_ms, con_ms, ant_ls_set, con_ls_set, cms_gaf))) && (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.appropriate_antecedent_meaning_sentenceP(ant_ms, con_ms, ant_ls_set, con_ls_set, cms_gaf)));
        }
    }

    public static SubLObject supported_conditional_meaning_sentence_gaf_int_internal(final SubLObject cms_gaf, final SubLObject sks, final SubLObject mt_info) {
        final SubLObject ant_ls_set = get_antecedent_logical_schemata_from_conditional_meaning_sentence_gaf(cms_gaf);
        final SubLObject ant_ms = get_antecedent_meaning_sentence_from_gaf(cms_gaf);
        final SubLObject con_ls_set = get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf(cms_gaf);
        final SubLObject con_ms = get_consequent_meaning_sentence_from_gaf(cms_gaf, UNPROVIDED);
        return makeBoolean(((NIL != appropriate_logical_schemata_setsP(ant_ls_set, con_ls_set, sks)) && (NIL != appropriate_consequent_meaning_sentenceP(ant_ms, con_ms, ant_ls_set, con_ls_set, cms_gaf))) && (NIL != appropriate_antecedent_meaning_sentenceP(ant_ms, con_ms, ant_ls_set, con_ls_set, cms_gaf)));
    }

    public static final SubLObject supported_conditional_meaning_sentence_gaf_int_alt(SubLObject cms_gaf, SubLObject sks, SubLObject mt_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.supported_conditional_meaning_sentence_gaf_int_internal(cms_gaf, sks, mt_info);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SUPPORTED_CONDITIONAL_MEANING_SENTENCE_GAF_INT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SUPPORTED_CONDITIONAL_MEANING_SENTENCE_GAF_INT, THREE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, SUPPORTED_CONDITIONAL_MEANING_SENTENCE_GAF_INT, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(cms_gaf, sks, mt_info);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw18$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (cms_gaf == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (sks == cached_args.first()) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt_info == cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.supported_conditional_meaning_sentence_gaf_int_internal(cms_gaf, sks, mt_info)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(cms_gaf, sks, mt_info));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject supported_conditional_meaning_sentence_gaf_int(final SubLObject cms_gaf, final SubLObject sks, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return supported_conditional_meaning_sentence_gaf_int_internal(cms_gaf, sks, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SUPPORTED_CONDITIONAL_MEANING_SENTENCE_GAF_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SUPPORTED_CONDITIONAL_MEANING_SENTENCE_GAF_INT, THREE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SUPPORTED_CONDITIONAL_MEANING_SENTENCE_GAF_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(cms_gaf, sks, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (cms_gaf.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sks.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(supported_conditional_meaning_sentence_gaf_int_internal(cms_gaf, sks, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(cms_gaf, sks, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject appropriate_logical_schemata_setsP_alt(SubLObject ant_ls_set, SubLObject con_ls_set, SubLObject sks) {
        if ((NIL != list_utilities.singletonP(ant_ls_set)) && (NIL != list_utilities.member_eqP(ant_ls_set.first(), con_ls_set))) {
            return T;
        }
        {
            SubLObject con_ks_set = Mapping.mapcar(LOGICAL_SCHEMA_SOURCES, con_ls_set);
            SubLObject ant_ks_set = Mapping.mapcar(LOGICAL_SCHEMA_SOURCES, ant_ls_set);
            if (!((NIL != list_utilities.every_in_list($sym21$SINGLETON_, con_ks_set, UNPROVIDED)) && (NIL != list_utilities.every_in_list($sym21$SINGLETON_, ant_ks_set, UNPROVIDED)))) {
                return NIL;
            }
            if (NIL == sksi_kb_accessors.sk_source_p(sks)) {
                sks = sksi_kb_accessors.nearest_common_super_ks_for_ls_list(union(con_ls_set, ant_ls_set, UNPROVIDED, UNPROVIDED));
            }
            {
                SubLObject inappropriateP = NIL;
                if (NIL == inappropriateP) {
                    {
                        SubLObject csome_list_var = con_ks_set;
                        SubLObject con_ks_list = NIL;
                        for (con_ks_list = csome_list_var.first(); !((NIL != inappropriateP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , con_ks_list = csome_list_var.first()) {
                            inappropriateP = makeBoolean(NIL == sksi_kb_accessors.sk_source_sub_ksP(sks, con_ks_list.first()));
                        }
                    }
                }
                if (NIL == inappropriateP) {
                    {
                        SubLObject csome_list_var = ant_ks_set;
                        SubLObject ant_ks_list = NIL;
                        for (ant_ks_list = csome_list_var.first(); !((NIL != inappropriateP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , ant_ks_list = csome_list_var.first()) {
                            inappropriateP = makeBoolean(NIL == sksi_kb_accessors.sk_source_sub_ksP(sks, ant_ks_list.first()));
                        }
                    }
                }
                return makeBoolean(NIL == inappropriateP);
            }
        }
    }

    public static SubLObject appropriate_logical_schemata_setsP(final SubLObject ant_ls_set, final SubLObject con_ls_set, SubLObject sks) {
        if ((NIL != list_utilities.singletonP(ant_ls_set)) && (NIL != list_utilities.member_eqP(ant_ls_set.first(), con_ls_set))) {
            return T;
        }
        final SubLObject con_ks_set = Mapping.mapcar(LOGICAL_SCHEMA_SOURCES, con_ls_set);
        final SubLObject ant_ks_set = Mapping.mapcar(LOGICAL_SCHEMA_SOURCES, ant_ls_set);
        if ((NIL == list_utilities.every_in_list($sym20$SINGLETON_, con_ks_set, UNPROVIDED)) || (NIL == list_utilities.every_in_list($sym20$SINGLETON_, ant_ks_set, UNPROVIDED))) {
            return NIL;
        }
        if (NIL == sksi_kb_accessors.sk_source_p(sks)) {
            sks = sksi_kb_accessors.nearest_common_super_ks_for_ls_list(union(con_ls_set, ant_ls_set, UNPROVIDED, UNPROVIDED));
        }
        SubLObject inappropriateP = NIL;
        if (NIL == inappropriateP) {
            SubLObject csome_list_var;
            SubLObject con_ks_list;
            for (csome_list_var = con_ks_set, con_ks_list = NIL, con_ks_list = csome_list_var.first(); (NIL == inappropriateP) && (NIL != csome_list_var); inappropriateP = makeBoolean(NIL == sksi_kb_accessors.sk_source_sub_ksP(sks, con_ks_list.first())) , csome_list_var = csome_list_var.rest() , con_ks_list = csome_list_var.first()) {
            }
        }
        if (NIL == inappropriateP) {
            SubLObject csome_list_var;
            SubLObject ant_ks_list;
            for (csome_list_var = ant_ks_set, ant_ks_list = NIL, ant_ks_list = csome_list_var.first(); (NIL == inappropriateP) && (NIL != csome_list_var); inappropriateP = makeBoolean(NIL == sksi_kb_accessors.sk_source_sub_ksP(sks, ant_ks_list.first())) , csome_list_var = csome_list_var.rest() , ant_ks_list = csome_list_var.first()) {
            }
        }
        return makeBoolean(NIL == inappropriateP);
    }

    public static final SubLObject with_appropriate_meaning_sentence_tmp_args_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject meaning_sentences = NIL;
            SubLObject con_ms = NIL;
            SubLObject ant_ls_set = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt22);
            meaning_sentences = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt22);
            con_ms = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt22);
            ant_ls_set = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list(CON_LFS, list(EXPRESSION_LOGICAL_FIELDS_FOR_INDEXICALS, con_ms)), list($appropriate_antecedent_literal_tmp_args$, list(LIST, meaning_sentences, CON_LFS, ant_ls_set))), append(body, NIL));
            }
        }
    }

    public static SubLObject with_appropriate_meaning_sentence_tmp_args(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject meaning_sentences = NIL;
        SubLObject con_ms = NIL;
        SubLObject ant_ls_set = NIL;
        destructuring_bind_must_consp(current, datum, $list21);
        meaning_sentences = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        con_ms = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        ant_ls_set = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list(CON_LFS, list(EXPRESSION_LOGICAL_FIELDS_FOR_INDEXICALS, con_ms)), list($appropriate_antecedent_literal_tmp_args$, list(LIST, meaning_sentences, CON_LFS, ant_ls_set))), append(body, NIL));
    }

    public static final SubLObject logical_schemata_relevant_meaning_sentences_alt(SubLObject ls_set, SubLObject cms_gaf) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = ls_set;
            SubLObject ls = NIL;
            for (ls = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ls = cdolist_list_var.first()) {
                result = nconc(result, com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_meaning_sentences_relevant_to_appropriateness_check(ls, cms_gaf, UNPROVIDED));
            }
            return result;
        }
    }

    public static SubLObject logical_schemata_relevant_meaning_sentences(final SubLObject ls_set, final SubLObject cms_gaf) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = ls_set;
        SubLObject ls = NIL;
        ls = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = nconc(result, logical_schema_meaning_sentences_relevant_to_appropriateness_check(ls, cms_gaf, UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            ls = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject logical_schema_meaning_sentences_relevant_to_appropriateness_check_alt(SubLObject ls, SubLObject cms_gaf, SubLObject include_consequent_cmsesP) {
        if (include_consequent_cmsesP == UNPROVIDED) {
            include_consequent_cmsesP = T;
        }
        if (NIL != include_consequent_cmsesP) {
            return list_utilities.fast_delete_duplicates(append(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.asserted_logical_schema_meaning_sentences(ls, T), com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_consequent_meaning_sentences(ls, T, T, cms_gaf, NIL, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            return list_utilities.fast_delete_duplicates(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.asserted_logical_schema_meaning_sentences(ls, T), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject logical_schema_meaning_sentences_relevant_to_appropriateness_check(final SubLObject ls, final SubLObject cms_gaf, SubLObject include_consequent_cmsesP) {
        if (include_consequent_cmsesP == UNPROVIDED) {
            include_consequent_cmsesP = T;
        }
        if (NIL != include_consequent_cmsesP) {
            return list_utilities.fast_delete_duplicates(append(asserted_logical_schema_meaning_sentences(ls, T), logical_schema_consequent_meaning_sentences(ls, T, T, cms_gaf, NIL, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return list_utilities.fast_delete_duplicates(asserted_logical_schema_meaning_sentences(ls, T), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject logical_schema_conditional_meaning_sentence_gafs_relevant_to_appropriateness_check_alt(SubLObject ls, SubLObject cms_gaf, SubLObject check_supportednessP) {
        if (check_supportednessP == UNPROVIDED) {
            check_supportednessP = T;
        }
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_consequent_conditional_meaning_sentence_gafs(ls, T, cms_gaf, check_supportednessP);
    }

    public static SubLObject logical_schema_conditional_meaning_sentence_gafs_relevant_to_appropriateness_check(final SubLObject ls, final SubLObject cms_gaf, SubLObject check_supportednessP) {
        if (check_supportednessP == UNPROVIDED) {
            check_supportednessP = T;
        }
        return logical_schema_consequent_conditional_meaning_sentence_gafs(ls, T, cms_gaf, check_supportednessP);
    }

    public static final SubLObject appropriate_consequent_meaning_sentenceP_alt(SubLObject ant_ms, SubLObject con_ms, SubLObject ant_ls_set, SubLObject con_ls_set, SubLObject cms_gaf) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.appropriate_consequent_literalP(con_ms, con_ls_set);
    }

    public static SubLObject appropriate_consequent_meaning_sentenceP(final SubLObject ant_ms, final SubLObject con_ms, final SubLObject ant_ls_set, final SubLObject con_ls_set, final SubLObject cms_gaf) {
        return appropriate_consequent_literalP(con_ms, con_ls_set);
    }

    public static final SubLObject appropriate_consequent_literalP_alt(SubLObject lit, SubLObject con_ls_set) {
        {
            SubLObject lit_lfis = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.meaning_sentence_logical_field_indexicals(lit);
            SubLObject inappropriateP = NIL;
            if (NIL == inappropriateP) {
                {
                    SubLObject csome_list_var = lit_lfis;
                    SubLObject lfi = NIL;
                    for (lfi = csome_list_var.first(); !((NIL != inappropriateP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , lfi = csome_list_var.first()) {
                        inappropriateP = makeBoolean(NIL == subl_promotions.memberP(lfi, con_ls_set, $sym27$LOGICAL_FIELD_INDEXICAL_FOR_SCHEMA_, UNPROVIDED));
                    }
                }
            }
            return makeBoolean(NIL == inappropriateP);
        }
    }

    public static SubLObject appropriate_consequent_literalP(final SubLObject lit, final SubLObject con_ls_set) {
        final SubLObject lit_lfis = meaning_sentence_logical_field_indexicals(lit);
        SubLObject inappropriateP = NIL;
        if (NIL == inappropriateP) {
            SubLObject csome_list_var;
            SubLObject lfi;
            for (csome_list_var = lit_lfis, lfi = NIL, lfi = csome_list_var.first(); (NIL == inappropriateP) && (NIL != csome_list_var); inappropriateP = makeBoolean(NIL == subl_promotions.memberP(lfi, con_ls_set, $sym26$LOGICAL_FIELD_INDEXICAL_FOR_SCHEMA_, UNPROVIDED)) , csome_list_var = csome_list_var.rest() , lfi = csome_list_var.first()) {
            }
        }
        return makeBoolean(NIL == inappropriateP);
    }

    public static final SubLObject appropriate_antecedent_meaning_sentenceP_alt(SubLObject ant_ms, SubLObject con_ms, SubLObject ant_ls_set, SubLObject con_ls_set, SubLObject cms_gaf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ant_ls_ms_list = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schemata_relevant_meaning_sentences(ant_ls_set, cms_gaf);
                SubLObject con_ls_ms_list = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schemata_relevant_meaning_sentences(con_ls_set, cms_gaf);
                SubLObject ms_list = list_utilities.fast_delete_duplicates(nconc(ant_ls_ms_list, con_ls_ms_list), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject appropriateP = NIL;
                SubLObject con_lfs = sksi_infrastructure_utilities.expression_logical_fields_for_indexicals(con_ms);
                {
                    SubLObject _prev_bind_0 = $appropriate_antecedent_literal_tmp_args$.currentBinding(thread);
                    try {
                        $appropriate_antecedent_literal_tmp_args$.bind(list(ms_list, con_lfs, ant_ls_set), thread);
                        appropriateP = cycl_grammar.cycl_boolean_combination_of_type($sym28$APPROPRIATE_ANTECEDENT_LITERAL_, ant_ms);
                    } finally {
                        $appropriate_antecedent_literal_tmp_args$.rebind(_prev_bind_0, thread);
                    }
                }
                return appropriateP;
            }
        }
    }

    public static SubLObject appropriate_antecedent_meaning_sentenceP(final SubLObject ant_ms, final SubLObject con_ms, final SubLObject ant_ls_set, final SubLObject con_ls_set, final SubLObject cms_gaf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ant_ls_ms_list = logical_schemata_relevant_meaning_sentences(ant_ls_set, cms_gaf);
        final SubLObject con_ls_ms_list = logical_schemata_relevant_meaning_sentences(con_ls_set, cms_gaf);
        final SubLObject ms_list = list_utilities.fast_delete_duplicates(nconc(ant_ls_ms_list, con_ls_ms_list), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject appropriateP = NIL;
        final SubLObject con_lfs = sksi_infrastructure_utilities.expression_logical_fields_for_indexicals(con_ms);
        final SubLObject _prev_bind_0 = $appropriate_antecedent_literal_tmp_args$.currentBinding(thread);
        try {
            $appropriate_antecedent_literal_tmp_args$.bind(list(ms_list, con_lfs, ant_ls_set), thread);
            appropriateP = cycl_grammar.cycl_boolean_combination_of_type($sym27$APPROPRIATE_ANTECEDENT_LITERAL_, ant_ms);
        } finally {
            $appropriate_antecedent_literal_tmp_args$.rebind(_prev_bind_0, thread);
        }
        return appropriateP;
    }

    public static final SubLObject appropriate_antecedent_literalP_alt(SubLObject lit) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = $appropriate_antecedent_literal_tmp_args$.getDynamicValue(thread);
                SubLObject current = datum;
                SubLObject meaning_sentences = NIL;
                SubLObject con_lfs = NIL;
                SubLObject ant_ls_set = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt29);
                meaning_sentences = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt29);
                con_lfs = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt29);
                ant_ls_set = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject lit_lfis = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.meaning_sentence_logical_field_indexicals(lit);
                        SubLObject inappropriateP = NIL;
                        if (NIL == inappropriateP) {
                            {
                                SubLObject csome_list_var = lit_lfis;
                                SubLObject lfi = NIL;
                                for (lfi = csome_list_var.first(); !((NIL != inappropriateP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , lfi = csome_list_var.first()) {
                                    inappropriateP = makeBoolean(NIL == subl_promotions.memberP(lfi, ant_ls_set, $sym27$LOGICAL_FIELD_INDEXICAL_FOR_SCHEMA_, UNPROVIDED));
                                }
                            }
                        }
                        if (NIL != inappropriateP) {
                            return NIL;
                        }
                        {
                            SubLObject lit_lfs = sksi_kb_accessors.logical_fields_for_indexicals(lit_lfis);
                            return (NIL != sksi_query_utilities.comparison_literal_p(lit)) || (NIL != sksi_query_utilities.evaluate_literal_p(lit)) ? ((SubLObject) (com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.appropriate_antecedent_comparison_literalP(lit, lit_lfs, meaning_sentences, con_lfs))) : com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.appropriate_antecedent_other_literalP(lit, lit_lfs, meaning_sentences, con_lfs, ant_ls_set);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt29);
                }
            }
            return NIL;
        }
    }

    public static SubLObject appropriate_antecedent_literalP(final SubLObject lit) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = $appropriate_antecedent_literal_tmp_args$.getDynamicValue(thread);
        SubLObject meaning_sentences = NIL;
        SubLObject con_lfs = NIL;
        SubLObject ant_ls_set = NIL;
        destructuring_bind_must_consp(current, datum, $list28);
        meaning_sentences = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list28);
        con_lfs = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list28);
        ant_ls_set = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list28);
            return NIL;
        }
        final SubLObject lit_lfis = meaning_sentence_logical_field_indexicals(lit);
        SubLObject inappropriateP = NIL;
        if (NIL == inappropriateP) {
            SubLObject csome_list_var;
            SubLObject lfi;
            for (csome_list_var = lit_lfis, lfi = NIL, lfi = csome_list_var.first(); (NIL == inappropriateP) && (NIL != csome_list_var); inappropriateP = makeBoolean(NIL == subl_promotions.memberP(lfi, ant_ls_set, $sym26$LOGICAL_FIELD_INDEXICAL_FOR_SCHEMA_, UNPROVIDED)) , csome_list_var = csome_list_var.rest() , lfi = csome_list_var.first()) {
            }
        }
        if (NIL != inappropriateP) {
            return NIL;
        }
        final SubLObject lit_lfs = sksi_kb_accessors.logical_fields_for_indexicals(lit_lfis);
        return (NIL != sksi_query_utilities.comparison_literal_p(lit)) || (NIL != sksi_query_utilities.evaluate_literal_p(lit)) ? appropriate_antecedent_comparison_literalP(lit, lit_lfs, meaning_sentences, con_lfs) : appropriate_antecedent_other_literalP(lit, lit_lfs, meaning_sentences, con_lfs, ant_ls_set);
    }

    /**
     * We check if every logical field corresponding to a logical field indexical
     * in LIT is joinable with some logical field in CON-LFS or corresponds to some
     * logical field which appears in some MEANING-SENTENCES which has a logical field
     * indexical corresponding to a logical field which is joinable with some logical
     * field in CON-LFS.
     */
    @LispMethod(comment = "We check if every logical field corresponding to a logical field indexical\r\nin LIT is joinable with some logical field in CON-LFS or corresponds to some\r\nlogical field which appears in some MEANING-SENTENCES which has a logical field\r\nindexical corresponding to a logical field which is joinable with some logical\r\nfield in CON-LFS.\nWe check if every logical field corresponding to a logical field indexical\nin LIT is joinable with some logical field in CON-LFS or corresponds to some\nlogical field which appears in some MEANING-SENTENCES which has a logical field\nindexical corresponding to a logical field which is joinable with some logical\nfield in CON-LFS.")
    public static final SubLObject appropriate_antecedent_comparison_literalP_alt(SubLObject lit, SubLObject lit_lfs, SubLObject meaning_sentences, SubLObject con_lfs) {
        {
            SubLObject inappropriateP = NIL;
            if (NIL == inappropriateP) {
                {
                    SubLObject csome_list_var = lit_lfs;
                    SubLObject lit_lf = NIL;
                    for (lit_lf = csome_list_var.first(); !((NIL != inappropriateP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , lit_lf = csome_list_var.first()) {
                        inappropriateP = makeBoolean(NIL == com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.antecedent_logical_field_joinable_with_consequent_logical_fieldsP(lit_lf, meaning_sentences, con_lfs));
                    }
                }
            }
            return makeBoolean(NIL == inappropriateP);
        }
    }

    /**
     * We check if every logical field corresponding to a logical field indexical
     * in LIT is joinable with some logical field in CON-LFS or corresponds to some
     * logical field which appears in some MEANING-SENTENCES which has a logical field
     * indexical corresponding to a logical field which is joinable with some logical
     * field in CON-LFS.
     */
    @LispMethod(comment = "We check if every logical field corresponding to a logical field indexical\r\nin LIT is joinable with some logical field in CON-LFS or corresponds to some\r\nlogical field which appears in some MEANING-SENTENCES which has a logical field\r\nindexical corresponding to a logical field which is joinable with some logical\r\nfield in CON-LFS.\nWe check if every logical field corresponding to a logical field indexical\nin LIT is joinable with some logical field in CON-LFS or corresponds to some\nlogical field which appears in some MEANING-SENTENCES which has a logical field\nindexical corresponding to a logical field which is joinable with some logical\nfield in CON-LFS.")
    public static SubLObject appropriate_antecedent_comparison_literalP(final SubLObject lit, final SubLObject lit_lfs, final SubLObject meaning_sentences, final SubLObject con_lfs) {
        SubLObject inappropriateP = NIL;
        if (NIL == inappropriateP) {
            SubLObject csome_list_var;
            SubLObject lit_lf;
            for (csome_list_var = lit_lfs, lit_lf = NIL, lit_lf = csome_list_var.first(); (NIL == inappropriateP) && (NIL != csome_list_var); inappropriateP = makeBoolean(NIL == antecedent_logical_field_joinable_with_consequent_logical_fieldsP(lit_lf, meaning_sentences, con_lfs)) , csome_list_var = csome_list_var.rest() , lit_lf = csome_list_var.first()) {
            }
        }
        return makeBoolean(NIL == inappropriateP);
    }

    public static final SubLObject antecedent_logical_field_joinable_with_consequent_logical_fieldsP_alt(SubLObject lit_lf, SubLObject meaning_sentences, SubLObject con_lfs) {
        if (NIL != subl_promotions.memberP(lit_lf, con_lfs, $sym30$LOGICAL_FIELDS_JOINABLE_, UNPROVIDED)) {
            return T;
        }
        {
            SubLObject matchP = NIL;
            if (NIL == matchP) {
                {
                    SubLObject csome_list_var = meaning_sentences;
                    SubLObject ms = NIL;
                    for (ms = csome_list_var.first(); !((NIL != matchP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , ms = csome_list_var.first()) {
                        {
                            SubLObject ms_lfs = sksi_infrastructure_utilities.expression_logical_fields_for_indexicals(ms);
                            matchP = makeBoolean((NIL != subl_promotions.memberP(lit_lf, ms_lfs, $sym30$LOGICAL_FIELDS_JOINABLE_, UNPROVIDED)) && (NIL != keyhash_utilities.fast_intersectP(con_lfs, ms_lfs, $sym30$LOGICAL_FIELDS_JOINABLE_, UNPROVIDED, UNPROVIDED)));
                        }
                    }
                }
            }
            return matchP;
        }
    }

    public static SubLObject antecedent_logical_field_joinable_with_consequent_logical_fieldsP(final SubLObject lit_lf, final SubLObject meaning_sentences, final SubLObject con_lfs) {
        if (NIL != subl_promotions.memberP(lit_lf, con_lfs, $sym29$LOGICAL_FIELDS_JOINABLE_, UNPROVIDED)) {
            return T;
        }
        SubLObject matchP = NIL;
        if (NIL == matchP) {
            SubLObject csome_list_var = meaning_sentences;
            SubLObject ms = NIL;
            ms = csome_list_var.first();
            while ((NIL == matchP) && (NIL != csome_list_var)) {
                final SubLObject ms_lfs = sksi_infrastructure_utilities.expression_logical_fields_for_indexicals(ms);
                matchP = makeBoolean((NIL != subl_promotions.memberP(lit_lf, ms_lfs, $sym29$LOGICAL_FIELDS_JOINABLE_, UNPROVIDED)) && (NIL != keyhash_utilities.fast_intersectP(con_lfs, ms_lfs, $sym29$LOGICAL_FIELDS_JOINABLE_, UNPROVIDED, UNPROVIDED)));
                csome_list_var = csome_list_var.rest();
                ms = csome_list_var.first();
            } 
        }
        return matchP;
    }

    public static final SubLObject appropriate_antecedent_other_literalP_alt(SubLObject lit, SubLObject lit_lfs, SubLObject meaning_sentences, SubLObject con_lfs, SubLObject ant_ls_set) {
        {
            SubLObject appropriateP = NIL;
            if (NIL != cycl_grammar.cycl_literal_p(lit)) {
                {
                    SubLObject foundP = NIL;
                    if (NIL == foundP) {
                        {
                            SubLObject csome_list_var = ant_ls_set;
                            SubLObject ls = NIL;
                            for (ls = csome_list_var.first(); !((NIL != foundP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , ls = csome_list_var.first()) {
                                {
                                    SubLObject ls_lfs = sksi_kb_accessors.logical_schema_fields(ls);
                                    foundP = list_utilities.fast_subsetP(lit_lfs, ls_lfs, UNPROVIDED);
                                }
                            }
                        }
                    }
                    if (NIL == foundP) {
                        return NIL;
                    }
                }
                {
                    SubLObject lit_meaning_sentences = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.meaning_sentences_type_check(lit, meaning_sentences, T, NIL, NIL, $RAW);
                    if (NIL != lit_meaning_sentences) {
                        appropriateP = T;
                    }
                }
            }
            return appropriateP;
        }
    }

    public static SubLObject appropriate_antecedent_other_literalP(final SubLObject lit, final SubLObject lit_lfs, final SubLObject meaning_sentences, final SubLObject con_lfs, final SubLObject ant_ls_set) {
        SubLObject appropriateP = NIL;
        if (NIL != cycl_grammar.cycl_literal_p(lit)) {
            SubLObject foundP = NIL;
            if (NIL == foundP) {
                SubLObject csome_list_var = ant_ls_set;
                SubLObject ls = NIL;
                ls = csome_list_var.first();
                while ((NIL == foundP) && (NIL != csome_list_var)) {
                    final SubLObject ls_lfs = sksi_kb_accessors.logical_schema_fields(ls);
                    foundP = list_utilities.fast_subsetP(lit_lfs, ls_lfs, UNPROVIDED);
                    csome_list_var = csome_list_var.rest();
                    ls = csome_list_var.first();
                } 
            }
            if (NIL == foundP) {
                return NIL;
            }
            final SubLObject lit_meaning_sentences = meaning_sentences_type_check(lit, meaning_sentences, T, NIL, NIL, $RAW);
            if (NIL != lit_meaning_sentences) {
                appropriateP = T;
            }
        }
        return appropriateP;
    }

    /**
     * Returns the meaning sentence GAFs for LOGICAL-SCHEMA.
     */
    @LispMethod(comment = "Returns the meaning sentence GAFs for LOGICAL-SCHEMA.")
    public static final SubLObject logical_schema_meaning_sentence_gafs_alt(SubLObject logical_schema, SubLObject memoizeP) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        return NIL != memoizeP ? ((SubLObject) (com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_meaning_sentence_gafs_memoized(logical_schema, mt_relevance_macros.mt_info(UNPROVIDED)))) : com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_meaning_sentence_gafs_int(logical_schema);
    }

    /**
     * Returns the meaning sentence GAFs for LOGICAL-SCHEMA.
     */
    @LispMethod(comment = "Returns the meaning sentence GAFs for LOGICAL-SCHEMA.")
    public static SubLObject logical_schema_meaning_sentence_gafs(final SubLObject logical_schema, SubLObject memoizeP) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        return NIL != memoizeP ? logical_schema_meaning_sentence_gafs_memoized(logical_schema, mt_relevance_macros.mt_info(UNPROVIDED)) : logical_schema_meaning_sentence_gafs_int(logical_schema);
    }

    public static final SubLObject logical_schema_meaning_sentence_gafs_memoized_internal_alt(SubLObject logical_schema, SubLObject mt_info) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_meaning_sentence_gafs_int(logical_schema);
    }

    public static SubLObject logical_schema_meaning_sentence_gafs_memoized_internal(final SubLObject logical_schema, final SubLObject mt_info) {
        return logical_schema_meaning_sentence_gafs_int(logical_schema);
    }

    public static final SubLObject logical_schema_meaning_sentence_gafs_memoized_alt(SubLObject logical_schema, SubLObject mt_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_meaning_sentence_gafs_memoized_internal(logical_schema, mt_info);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, LOGICAL_SCHEMA_MEANING_SENTENCE_GAFS_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), LOGICAL_SCHEMA_MEANING_SENTENCE_GAFS_MEMOIZED, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, LOGICAL_SCHEMA_MEANING_SENTENCE_GAFS_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(logical_schema, mt_info);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw18$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (logical_schema == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt_info == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_meaning_sentence_gafs_memoized_internal(logical_schema, mt_info)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(logical_schema, mt_info));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject logical_schema_meaning_sentence_gafs_memoized(final SubLObject logical_schema, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return logical_schema_meaning_sentence_gafs_memoized_internal(logical_schema, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, LOGICAL_SCHEMA_MEANING_SENTENCE_GAFS_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), LOGICAL_SCHEMA_MEANING_SENTENCE_GAFS_MEMOIZED, TWO_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, LOGICAL_SCHEMA_MEANING_SENTENCE_GAFS_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(logical_schema, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (logical_schema.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(logical_schema_meaning_sentence_gafs_memoized_internal(logical_schema, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(logical_schema, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject logical_schema_meaning_sentence_gafs_int_alt(SubLObject logical_schema) {
        return list_utilities.fast_delete_duplicates(kb_mapping_utilities.pred_value_gafs(logical_schema, $$meaningSentenceOfSchema, ONE_INTEGER, $TRUE), symbol_function(EQUAL), GAF_FORMULA, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject logical_schema_meaning_sentence_gafs_int(final SubLObject logical_schema) {
        return list_utilities.fast_delete_duplicates(kb_mapping_utilities.pred_value_gafs(logical_schema, $$meaningSentenceOfSchema, ONE_INTEGER, $TRUE), symbol_function(EQUAL), GAF_FORMULA, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns the conditional meaning sentence GAFs for which LOGICAL-SCHEMA is the consequent logical schema.
     */
    @LispMethod(comment = "Returns the conditional meaning sentence GAFs for which LOGICAL-SCHEMA is the consequent logical schema.")
    public static final SubLObject logical_schema_consequent_conditional_meaning_sentence_gafs_alt(SubLObject logical_schema, SubLObject memoizeP, SubLObject ignore_cms_gaf, SubLObject check_supportednessP) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (ignore_cms_gaf == UNPROVIDED) {
            ignore_cms_gaf = NIL;
        }
        if (check_supportednessP == UNPROVIDED) {
            check_supportednessP = T;
        }
        return NIL != memoizeP ? ((SubLObject) (com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_consequent_conditional_meaning_sentence_gafs_memoized(logical_schema, mt_relevance_macros.mt_info(UNPROVIDED), ignore_cms_gaf, check_supportednessP))) : com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_consequent_conditional_meaning_sentence_gafs_int(logical_schema, ignore_cms_gaf, check_supportednessP);
    }

    /**
     * Returns the conditional meaning sentence GAFs for which LOGICAL-SCHEMA is the consequent logical schema.
     */
    @LispMethod(comment = "Returns the conditional meaning sentence GAFs for which LOGICAL-SCHEMA is the consequent logical schema.")
    public static SubLObject logical_schema_consequent_conditional_meaning_sentence_gafs(final SubLObject logical_schema, SubLObject memoizeP, SubLObject ignore_cms_gaf, SubLObject check_supportednessP) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (ignore_cms_gaf == UNPROVIDED) {
            ignore_cms_gaf = NIL;
        }
        if (check_supportednessP == UNPROVIDED) {
            check_supportednessP = T;
        }
        return NIL != memoizeP ? logical_schema_consequent_conditional_meaning_sentence_gafs_memoized(logical_schema, mt_relevance_macros.mt_info(UNPROVIDED), ignore_cms_gaf, check_supportednessP) : logical_schema_consequent_conditional_meaning_sentence_gafs_int(logical_schema, ignore_cms_gaf, check_supportednessP);
    }

    public static final SubLObject logical_schema_consequent_conditional_meaning_sentence_gafs_memoized_internal_alt(SubLObject logical_schema, SubLObject mt_info, SubLObject ignore_cms_gaf, SubLObject check_supportednessP) {
        if (ignore_cms_gaf == UNPROVIDED) {
            ignore_cms_gaf = NIL;
        }
        if (check_supportednessP == UNPROVIDED) {
            check_supportednessP = T;
        }
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_consequent_conditional_meaning_sentence_gafs_int(logical_schema, ignore_cms_gaf, check_supportednessP);
    }

    public static SubLObject logical_schema_consequent_conditional_meaning_sentence_gafs_memoized_internal(final SubLObject logical_schema, final SubLObject mt_info, SubLObject ignore_cms_gaf, SubLObject check_supportednessP) {
        if (ignore_cms_gaf == UNPROVIDED) {
            ignore_cms_gaf = NIL;
        }
        if (check_supportednessP == UNPROVIDED) {
            check_supportednessP = T;
        }
        return logical_schema_consequent_conditional_meaning_sentence_gafs_int(logical_schema, ignore_cms_gaf, check_supportednessP);
    }

    public static final SubLObject logical_schema_consequent_conditional_meaning_sentence_gafs_memoized_alt(SubLObject logical_schema, SubLObject mt_info, SubLObject ignore_cms_gaf, SubLObject check_supportednessP) {
        if (ignore_cms_gaf == UNPROVIDED) {
            ignore_cms_gaf = NIL;
        }
        if (check_supportednessP == UNPROVIDED) {
            check_supportednessP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_consequent_conditional_meaning_sentence_gafs_memoized_internal(logical_schema, mt_info, ignore_cms_gaf, check_supportednessP);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym35$LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_GAFS_MEMOI, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym35$LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_GAFS_MEMOI, FOUR_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym35$LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_GAFS_MEMOI, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_4(logical_schema, mt_info, ignore_cms_gaf, check_supportednessP);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw18$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (logical_schema == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (mt_info == cached_args.first()) {
                                            cached_args = cached_args.rest();
                                            if (ignore_cms_gaf == cached_args.first()) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && (check_supportednessP == cached_args.first())) {
                                                    return memoization_state.caching_results(results2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_consequent_conditional_meaning_sentence_gafs_memoized_internal(logical_schema, mt_info, ignore_cms_gaf, check_supportednessP)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(logical_schema, mt_info, ignore_cms_gaf, check_supportednessP));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject logical_schema_consequent_conditional_meaning_sentence_gafs_memoized(final SubLObject logical_schema, final SubLObject mt_info, SubLObject ignore_cms_gaf, SubLObject check_supportednessP) {
        if (ignore_cms_gaf == UNPROVIDED) {
            ignore_cms_gaf = NIL;
        }
        if (check_supportednessP == UNPROVIDED) {
            check_supportednessP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return logical_schema_consequent_conditional_meaning_sentence_gafs_memoized_internal(logical_schema, mt_info, ignore_cms_gaf, check_supportednessP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym34$LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_GAFS_MEMOI, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym34$LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_GAFS_MEMOI, FOUR_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym34$LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_GAFS_MEMOI, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(logical_schema, mt_info, ignore_cms_gaf, check_supportednessP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (logical_schema.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt_info.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (ignore_cms_gaf.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && check_supportednessP.eql(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(logical_schema_consequent_conditional_meaning_sentence_gafs_memoized_internal(logical_schema, mt_info, ignore_cms_gaf, check_supportednessP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(logical_schema, mt_info, ignore_cms_gaf, check_supportednessP));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject logical_schema_consequent_conditional_meaning_sentence_gafs_int_alt(SubLObject logical_schema, SubLObject ignore_cms_gaf, SubLObject check_supportednessP) {
        if (ignore_cms_gaf == UNPROVIDED) {
            ignore_cms_gaf = NIL;
        }
        if (check_supportednessP == UNPROVIDED) {
            check_supportednessP = T;
        }
        {
            SubLObject indexed_cms_gafs = kb_mapping_utilities.pred_value_gafs(logical_schema, $const1$conditionalMeaningSentenceOfSchem, THREE_INTEGER, $TRUE);
            SubLObject unindexed_cms_gafs = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_unindexed_consequent_conditional_meaning_sentence_gafs(logical_schema);
            SubLObject cms_gafs = append(unindexed_cms_gafs, indexed_cms_gafs);
            if (NIL != ignore_cms_gaf) {
                cms_gafs = remove(ignore_cms_gaf, cms_gafs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != check_supportednessP) {
                return list_utilities.find_all_if(SUPPORTED_CONDITIONAL_MEANING_SENTENCE_GAF_P, cms_gafs, UNPROVIDED);
            } else {
                return cms_gafs;
            }
        }
    }

    public static SubLObject logical_schema_consequent_conditional_meaning_sentence_gafs_int(final SubLObject logical_schema, SubLObject ignore_cms_gaf, SubLObject check_supportednessP) {
        if (ignore_cms_gaf == UNPROVIDED) {
            ignore_cms_gaf = NIL;
        }
        if (check_supportednessP == UNPROVIDED) {
            check_supportednessP = T;
        }
        final SubLObject indexed_cms_gafs = kb_mapping_utilities.pred_value_gafs(logical_schema, $const1$conditionalMeaningSentenceOfSchem, THREE_INTEGER, $TRUE);
        final SubLObject unindexed_cms_gafs = logical_schema_unindexed_consequent_conditional_meaning_sentence_gafs(logical_schema);
        SubLObject cms_gafs = append(unindexed_cms_gafs, indexed_cms_gafs);
        if (NIL != ignore_cms_gaf) {
            cms_gafs = remove(ignore_cms_gaf, cms_gafs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != check_supportednessP) {
            return list_utilities.find_all_if(SUPPORTED_CONDITIONAL_MEANING_SENTENCE_GAF_P, cms_gafs, UNPROVIDED);
        }
        return cms_gafs;
    }

    public static final SubLObject logical_schema_unindexed_consequent_conditional_meaning_sentence_gafs_alt(SubLObject logical_schema) {
        {
            SubLObject all_other_assertions = kb_mapping.gather_other_index(logical_schema);
            SubLObject cms_gafs = NIL;
            SubLObject cdolist_list_var = all_other_assertions;
            SubLObject assertion = NIL;
            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.conditional_meaning_sentence_gaf_p(assertion)) {
                    {
                        SubLObject con_ls_list = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf(assertion);
                        if ((NIL != list_utilities.lengthG(con_ls_list, ONE_INTEGER, UNPROVIDED)) && (NIL != list_utilities.member_eqP(logical_schema, con_ls_list))) {
                            cms_gafs = cons(assertion, cms_gafs);
                        }
                    }
                }
            }
            return nreverse(cms_gafs);
        }
    }

    public static SubLObject logical_schema_unindexed_consequent_conditional_meaning_sentence_gafs(final SubLObject logical_schema) {
        final SubLObject all_other_assertions = kb_mapping.gather_other_index(logical_schema);
        SubLObject cms_gafs = NIL;
        SubLObject cdolist_list_var = all_other_assertions;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != conditional_meaning_sentence_gaf_p(assertion)) {
                final SubLObject con_ls_list = get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf(assertion);
                if ((NIL != list_utilities.lengthG(con_ls_list, ONE_INTEGER, UNPROVIDED)) && (NIL != list_utilities.member_eqP(logical_schema, con_ls_list))) {
                    cms_gafs = cons(assertion, cms_gafs);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return nreverse(cms_gafs);
    }

    public static final SubLObject meaning_sentence_pred_relevantP_internal_alt(SubLObject meaning_sentence_pred, SubLObject pred, SubLObject pred_relevance_function, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != variables.not_fully_bound_p(pred)) {
                return sksi_kb_accessors.logical_field_indexical_p(meaning_sentence_pred);
            }
            {
                SubLObject relevantP = NIL;
                SubLObject pcase_var = pred_relevance_function;
                if (pcase_var.eql(RELEVANT_PRED_IS_EQ)) {
                    {
                        SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = pred_relevance_macros.$pred$.currentBinding(thread);
                        try {
                            pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_EQ, thread);
                            pred_relevance_macros.$pred$.bind(pred, thread);
                            relevantP = pred_relevance_macros.relevant_predP(meaning_sentence_pred);
                        } finally {
                            pred_relevance_macros.$pred$.rebind(_prev_bind_1, thread);
                            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    if (pcase_var.eql(RELEVANT_PRED_IS_SPEC_PRED)) {
                        {
                            SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = pred_relevance_macros.$pred$.currentBinding(thread);
                            try {
                                pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_PRED, thread);
                                pred_relevance_macros.$pred$.bind(pred, thread);
                                relevantP = pred_relevance_macros.relevant_predP(meaning_sentence_pred);
                            } finally {
                                pred_relevance_macros.$pred$.rebind(_prev_bind_1, thread);
                                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } else {
                        if (pcase_var.eql(RELEVANT_PRED_IS_SPEC_INVERSE)) {
                            {
                                SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = pred_relevance_macros.$pred$.currentBinding(thread);
                                try {
                                    pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                                    pred_relevance_macros.$pred$.bind(pred, thread);
                                    relevantP = pred_relevance_macros.relevant_predP(meaning_sentence_pred);
                                } finally {
                                    pred_relevance_macros.$pred$.rebind(_prev_bind_1, thread);
                                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } else {
                            if (pcase_var.eql(RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE)) {
                                {
                                    SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = pred_relevance_macros.$pred$.currentBinding(thread);
                                    try {
                                        pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE, thread);
                                        pred_relevance_macros.$pred$.bind(pred, thread);
                                        relevantP = pred_relevance_macros.relevant_predP(meaning_sentence_pred);
                                    } finally {
                                        pred_relevance_macros.$pred$.rebind(_prev_bind_1, thread);
                                        pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                }
                return relevantP;
            }
        }
    }

    public static SubLObject meaning_sentence_pred_relevantP_internal(final SubLObject meaning_sentence_pred, final SubLObject pred, final SubLObject pred_relevance_function, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != variables.not_fully_bound_p(pred)) {
            return sksi_kb_accessors.logical_field_indexical_p(meaning_sentence_pred);
        }
        SubLObject relevantP = NIL;
        if (pred_relevance_function.eql(RELEVANT_PRED_IS_EQ)) {
            final SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
            try {
                pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_EQ, thread);
                pred_relevance_macros.$pred$.bind(pred, thread);
                relevantP = pred_relevance_macros.relevant_predP(meaning_sentence_pred);
            } finally {
                pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
            }
        } else
            if (pred_relevance_function.eql(RELEVANT_PRED_IS_SPEC_PRED)) {
                final SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
                try {
                    pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_PRED, thread);
                    pred_relevance_macros.$pred$.bind(pred, thread);
                    relevantP = pred_relevance_macros.relevant_predP(meaning_sentence_pred);
                } finally {
                    pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
                }
            } else
                if (pred_relevance_function.eql(RELEVANT_PRED_IS_SPEC_INVERSE)) {
                    final SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
                    try {
                        pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                        pred_relevance_macros.$pred$.bind(pred, thread);
                        relevantP = pred_relevance_macros.relevant_predP(meaning_sentence_pred);
                    } finally {
                        pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                        pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
                    }
                } else
                    if (pred_relevance_function.eql(RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE)) {
                        final SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
                        try {
                            pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE, thread);
                            pred_relevance_macros.$pred$.bind(pred, thread);
                            relevantP = pred_relevance_macros.relevant_predP(meaning_sentence_pred);
                        } finally {
                            pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
                        }
                    }



        return relevantP;
    }

    public static final SubLObject meaning_sentence_pred_relevantP_alt(SubLObject meaning_sentence_pred, SubLObject pred, SubLObject pred_relevance_function, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.meaning_sentence_pred_relevantP_internal(meaning_sentence_pred, pred, pred_relevance_function, mt_info);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym37$MEANING_SENTENCE_PRED_RELEVANT_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym37$MEANING_SENTENCE_PRED_RELEVANT_, FOUR_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym37$MEANING_SENTENCE_PRED_RELEVANT_, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_4(meaning_sentence_pred, pred, pred_relevance_function, mt_info);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw18$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (meaning_sentence_pred == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (pred == cached_args.first()) {
                                            cached_args = cached_args.rest();
                                            if (pred_relevance_function == cached_args.first()) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt_info == cached_args.first())) {
                                                    return memoization_state.caching_results(results2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.meaning_sentence_pred_relevantP_internal(meaning_sentence_pred, pred, pred_relevance_function, mt_info)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(meaning_sentence_pred, pred, pred_relevance_function, mt_info));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject meaning_sentence_pred_relevantP(final SubLObject meaning_sentence_pred, final SubLObject pred, final SubLObject pred_relevance_function, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return meaning_sentence_pred_relevantP_internal(meaning_sentence_pred, pred, pred_relevance_function, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym36$MEANING_SENTENCE_PRED_RELEVANT_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym36$MEANING_SENTENCE_PRED_RELEVANT_, FOUR_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym36$MEANING_SENTENCE_PRED_RELEVANT_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(meaning_sentence_pred, pred, pred_relevance_function, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (meaning_sentence_pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pred.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (pred_relevance_function.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.eql(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(meaning_sentence_pred_relevantP_internal(meaning_sentence_pred, pred, pred_relevance_function, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(meaning_sentence_pred, pred, pred_relevance_function, mt_info));
        return memoization_state.caching_results(results3);
    }

    /**
     * Returns the relevant meaning sentence GAFs for LOGICAL-SCHEMA.
     * A meaning sentence GAF is relevant if its meaning-sentence-pred is
     * relevant to PRED wrt PRED-RELEVANCE-FUNCTION (if the meaning-sentence-pred
     * in question is a logical field indexical then it is considered (potentially) relevant).
     */
    @LispMethod(comment = "Returns the relevant meaning sentence GAFs for LOGICAL-SCHEMA.\r\nA meaning sentence GAF is relevant if its meaning-sentence-pred is\r\nrelevant to PRED wrt PRED-RELEVANCE-FUNCTION (if the meaning-sentence-pred\r\nin question is a logical field indexical then it is considered (potentially) relevant).\nReturns the relevant meaning sentence GAFs for LOGICAL-SCHEMA.\nA meaning sentence GAF is relevant if its meaning-sentence-pred is\nrelevant to PRED wrt PRED-RELEVANCE-FUNCTION (if the meaning-sentence-pred\nin question is a logical field indexical then it is considered (potentially) relevant).")
    public static final SubLObject relevant_logical_schema_meaning_sentence_gafs_alt(SubLObject logical_schema, SubLObject pred, SubLObject pred_relevance_function, SubLObject memoizeP, SubLObject ignore_istsP) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (ignore_istsP == UNPROVIDED) {
            ignore_istsP = T;
        }
        return NIL != memoizeP ? ((SubLObject) (com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.relevant_logical_schema_meaning_sentence_gafs_memoized(logical_schema, pred, pred_relevance_function, mt_relevance_macros.mt_info(UNPROVIDED), ignore_istsP))) : com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.relevant_logical_schema_meaning_sentence_gafs_int(logical_schema, pred, pred_relevance_function, ignore_istsP);
    }

    /**
     * Returns the relevant meaning sentence GAFs for LOGICAL-SCHEMA.
     * A meaning sentence GAF is relevant if its meaning-sentence-pred is
     * relevant to PRED wrt PRED-RELEVANCE-FUNCTION (if the meaning-sentence-pred
     * in question is a logical field indexical then it is considered (potentially) relevant).
     */
    @LispMethod(comment = "Returns the relevant meaning sentence GAFs for LOGICAL-SCHEMA.\r\nA meaning sentence GAF is relevant if its meaning-sentence-pred is\r\nrelevant to PRED wrt PRED-RELEVANCE-FUNCTION (if the meaning-sentence-pred\r\nin question is a logical field indexical then it is considered (potentially) relevant).\nReturns the relevant meaning sentence GAFs for LOGICAL-SCHEMA.\nA meaning sentence GAF is relevant if its meaning-sentence-pred is\nrelevant to PRED wrt PRED-RELEVANCE-FUNCTION (if the meaning-sentence-pred\nin question is a logical field indexical then it is considered (potentially) relevant).")
    public static SubLObject relevant_logical_schema_meaning_sentence_gafs(final SubLObject logical_schema, final SubLObject pred, final SubLObject pred_relevance_function, SubLObject memoizeP, SubLObject ignore_istsP) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (ignore_istsP == UNPROVIDED) {
            ignore_istsP = T;
        }
        return NIL != memoizeP ? relevant_logical_schema_meaning_sentence_gafs_memoized(logical_schema, pred, pred_relevance_function, mt_relevance_macros.mt_info(UNPROVIDED), ignore_istsP) : relevant_logical_schema_meaning_sentence_gafs_int(logical_schema, pred, pred_relevance_function, ignore_istsP);
    }

    public static final SubLObject relevant_logical_schema_meaning_sentence_gafs_memoized_internal_alt(SubLObject logical_schema, SubLObject pred, SubLObject pred_relevance_function, SubLObject mt_info, SubLObject ignore_istsP) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.relevant_logical_schema_meaning_sentence_gafs_int(logical_schema, pred, pred_relevance_function, ignore_istsP);
    }

    public static SubLObject relevant_logical_schema_meaning_sentence_gafs_memoized_internal(final SubLObject logical_schema, final SubLObject pred, final SubLObject pred_relevance_function, final SubLObject mt_info, final SubLObject ignore_istsP) {
        return relevant_logical_schema_meaning_sentence_gafs_int(logical_schema, pred, pred_relevance_function, ignore_istsP);
    }

    public static final SubLObject relevant_logical_schema_meaning_sentence_gafs_memoized_alt(SubLObject logical_schema, SubLObject pred, SubLObject pred_relevance_function, SubLObject mt_info, SubLObject ignore_istsP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.relevant_logical_schema_meaning_sentence_gafs_memoized_internal(logical_schema, pred, pred_relevance_function, mt_info, ignore_istsP);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCE_GAFS_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCE_GAFS_MEMOIZED, FIVE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCE_GAFS_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_5(logical_schema, pred, pred_relevance_function, mt_info, ignore_istsP);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw18$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (logical_schema == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (pred == cached_args.first()) {
                                            cached_args = cached_args.rest();
                                            if (pred_relevance_function == cached_args.first()) {
                                                cached_args = cached_args.rest();
                                                if (mt_info == cached_args.first()) {
                                                    cached_args = cached_args.rest();
                                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && (ignore_istsP == cached_args.first())) {
                                                        return memoization_state.caching_results(results2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.relevant_logical_schema_meaning_sentence_gafs_memoized_internal(logical_schema, pred, pred_relevance_function, mt_info, ignore_istsP)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(logical_schema, pred, pred_relevance_function, mt_info, ignore_istsP));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject relevant_logical_schema_meaning_sentence_gafs_memoized(final SubLObject logical_schema, final SubLObject pred, final SubLObject pred_relevance_function, final SubLObject mt_info, final SubLObject ignore_istsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return relevant_logical_schema_meaning_sentence_gafs_memoized_internal(logical_schema, pred, pred_relevance_function, mt_info, ignore_istsP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCE_GAFS_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCE_GAFS_MEMOIZED, FIVE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCE_GAFS_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(logical_schema, pred, pred_relevance_function, mt_info, ignore_istsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (logical_schema.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pred.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (pred_relevance_function.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (mt_info.eql(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && ignore_istsP.eql(cached_args.first())) {
                                    return memoization_state.caching_results(results2);
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(relevant_logical_schema_meaning_sentence_gafs_memoized_internal(logical_schema, pred, pred_relevance_function, mt_info, ignore_istsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(logical_schema, pred, pred_relevance_function, mt_info, ignore_istsP));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject relevant_logical_schema_meaning_sentence_gafs_int_alt(SubLObject logical_schema, SubLObject pred, SubLObject pred_relevance_function, SubLObject ignore_istsP) {
        {
            SubLObject all_ms_gafs = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_meaning_sentence_gafs_memoized(logical_schema, mt_relevance_macros.mt_info(UNPROVIDED));
            SubLObject relevant_ms_gafs = NIL;
            SubLObject cdolist_list_var = all_ms_gafs;
            SubLObject ms_gaf = NIL;
            for (ms_gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ms_gaf = cdolist_list_var.first()) {
                {
                    SubLObject meaning_sentence = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.get_meaning_sentence_from_gaf(ms_gaf, ignore_istsP);
                    SubLObject meaning_sentence_pred = cycl_utilities.formula_operator(meaning_sentence);
                    SubLObject pred_relevantP = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.meaning_sentence_pred_relevantP(meaning_sentence_pred, pred, pred_relevance_function, UNPROVIDED);
                    if ((NIL != pred_relevantP) || (NIL != sksi_kb_accessors.logical_field_indexical_p(meaning_sentence_pred))) {
                        relevant_ms_gafs = cons(ms_gaf, relevant_ms_gafs);
                    }
                }
            }
            return relevant_ms_gafs;
        }
    }

    public static SubLObject relevant_logical_schema_meaning_sentence_gafs_int(final SubLObject logical_schema, final SubLObject pred, final SubLObject pred_relevance_function, final SubLObject ignore_istsP) {
        final SubLObject all_ms_gafs = logical_schema_meaning_sentence_gafs_memoized(logical_schema, mt_relevance_macros.mt_info(UNPROVIDED));
        SubLObject relevant_ms_gafs = NIL;
        SubLObject cdolist_list_var = all_ms_gafs;
        SubLObject ms_gaf = NIL;
        ms_gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject meaning_sentence = get_meaning_sentence_from_gaf(ms_gaf, ignore_istsP);
            final SubLObject meaning_sentence_pred = cycl_utilities.formula_operator(meaning_sentence);
            final SubLObject pred_relevantP = meaning_sentence_pred_relevantP(meaning_sentence_pred, pred, pred_relevance_function, UNPROVIDED);
            if ((NIL != pred_relevantP) || (NIL != sksi_kb_accessors.logical_field_indexical_p(meaning_sentence_pred))) {
                relevant_ms_gafs = cons(ms_gaf, relevant_ms_gafs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ms_gaf = cdolist_list_var.first();
        } 
        return relevant_ms_gafs;
    }

    /**
     * Returns the conditional meaning sentence GAFs whose consequent-meaning-sentence predicate
     * is relevant to PRED wrt PRED-RELEVANCE-FUNCTION (if the consequent-meaning-sentence
     * predicate is a logical field indexical then it is considered (potentially) relevant)
     * and for which LOGICAL-SCHEMA is the consequent logical schema.
     */
    @LispMethod(comment = "Returns the conditional meaning sentence GAFs whose consequent-meaning-sentence predicate\r\nis relevant to PRED wrt PRED-RELEVANCE-FUNCTION (if the consequent-meaning-sentence\r\npredicate is a logical field indexical then it is considered (potentially) relevant)\r\nand for which LOGICAL-SCHEMA is the consequent logical schema.\nReturns the conditional meaning sentence GAFs whose consequent-meaning-sentence predicate\nis relevant to PRED wrt PRED-RELEVANCE-FUNCTION (if the consequent-meaning-sentence\npredicate is a logical field indexical then it is considered (potentially) relevant)\nand for which LOGICAL-SCHEMA is the consequent logical schema.")
    public static final SubLObject relevant_logical_schema_consequent_conditional_meaning_sentence_gafs_alt(SubLObject logical_schema, SubLObject pred, SubLObject pred_relevance_function, SubLObject memoizeP, SubLObject ignore_cms_gaf, SubLObject check_supportednessP, SubLObject ignore_istsP) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (ignore_cms_gaf == UNPROVIDED) {
            ignore_cms_gaf = NIL;
        }
        if (check_supportednessP == UNPROVIDED) {
            check_supportednessP = T;
        }
        if (ignore_istsP == UNPROVIDED) {
            ignore_istsP = T;
        }
        return NIL != memoizeP ? ((SubLObject) (com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.relevant_logical_schema_consequent_conditional_meaning_sentence_gafs_memoized(logical_schema, pred, pred_relevance_function, mt_relevance_macros.mt_info(UNPROVIDED), ignore_cms_gaf, check_supportednessP, ignore_istsP))) : com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.relevant_logical_schema_consequent_conditional_meaning_sentence_gafs_int(logical_schema, pred, pred_relevance_function, ignore_cms_gaf, check_supportednessP, ignore_istsP);
    }

    @LispMethod(comment = "Returns the conditional meaning sentence GAFs whose consequent-meaning-sentence predicate\r\nis relevant to PRED wrt PRED-RELEVANCE-FUNCTION (if the consequent-meaning-sentence\r\npredicate is a logical field indexical then it is considered (potentially) relevant)\r\nand for which LOGICAL-SCHEMA is the consequent logical schema.\nReturns the conditional meaning sentence GAFs whose consequent-meaning-sentence predicate\nis relevant to PRED wrt PRED-RELEVANCE-FUNCTION (if the consequent-meaning-sentence\npredicate is a logical field indexical then it is considered (potentially) relevant)\nand for which LOGICAL-SCHEMA is the consequent logical schema.")
    public static SubLObject relevant_logical_schema_consequent_conditional_meaning_sentence_gafs(final SubLObject logical_schema, final SubLObject pred, final SubLObject pred_relevance_function, SubLObject memoizeP, SubLObject ignore_cms_gaf, SubLObject check_supportednessP, SubLObject ignore_istsP) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (ignore_cms_gaf == UNPROVIDED) {
            ignore_cms_gaf = NIL;
        }
        if (check_supportednessP == UNPROVIDED) {
            check_supportednessP = T;
        }
        if (ignore_istsP == UNPROVIDED) {
            ignore_istsP = T;
        }
        return NIL != memoizeP ? relevant_logical_schema_consequent_conditional_meaning_sentence_gafs_memoized(logical_schema, pred, pred_relevance_function, mt_relevance_macros.mt_info(UNPROVIDED), ignore_cms_gaf, check_supportednessP, ignore_istsP) : relevant_logical_schema_consequent_conditional_meaning_sentence_gafs_int(logical_schema, pred, pred_relevance_function, ignore_cms_gaf, check_supportednessP, ignore_istsP);
    }/**
     * Returns the conditional meaning sentence GAFs whose consequent-meaning-sentence predicate
     * is relevant to PRED wrt PRED-RELEVANCE-FUNCTION (if the consequent-meaning-sentence
     * predicate is a logical field indexical then it is considered (potentially) relevant)
     * and for which LOGICAL-SCHEMA is the consequent logical schema.
     */


    public static final SubLObject relevant_logical_schema_consequent_conditional_meaning_sentence_gafs_memoized_internal_alt(SubLObject logical_schema, SubLObject pred, SubLObject pred_relevance_function, SubLObject mt_info, SubLObject ignore_cms_gaf, SubLObject check_supportednessP, SubLObject ignore_istsP) {
        if (ignore_cms_gaf == UNPROVIDED) {
            ignore_cms_gaf = NIL;
        }
        if (check_supportednessP == UNPROVIDED) {
            check_supportednessP = T;
        }
        if (ignore_istsP == UNPROVIDED) {
            ignore_istsP = T;
        }
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.relevant_logical_schema_consequent_conditional_meaning_sentence_gafs_int(logical_schema, pred, pred_relevance_function, ignore_cms_gaf, check_supportednessP, ignore_istsP);
    }

    public static SubLObject relevant_logical_schema_consequent_conditional_meaning_sentence_gafs_memoized_internal(final SubLObject logical_schema, final SubLObject pred, final SubLObject pred_relevance_function, final SubLObject mt_info, SubLObject ignore_cms_gaf, SubLObject check_supportednessP, SubLObject ignore_istsP) {
        if (ignore_cms_gaf == UNPROVIDED) {
            ignore_cms_gaf = NIL;
        }
        if (check_supportednessP == UNPROVIDED) {
            check_supportednessP = T;
        }
        if (ignore_istsP == UNPROVIDED) {
            ignore_istsP = T;
        }
        return relevant_logical_schema_consequent_conditional_meaning_sentence_gafs_int(logical_schema, pred, pred_relevance_function, ignore_cms_gaf, check_supportednessP, ignore_istsP);
    }

    public static final SubLObject relevant_logical_schema_consequent_conditional_meaning_sentence_gafs_memoized_alt(SubLObject logical_schema, SubLObject pred, SubLObject pred_relevance_function, SubLObject mt_info, SubLObject ignore_cms_gaf, SubLObject check_supportednessP, SubLObject ignore_istsP) {
        if (ignore_cms_gaf == UNPROVIDED) {
            ignore_cms_gaf = NIL;
        }
        if (check_supportednessP == UNPROVIDED) {
            check_supportednessP = T;
        }
        if (ignore_istsP == UNPROVIDED) {
            ignore_istsP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.relevant_logical_schema_consequent_conditional_meaning_sentence_gafs_memoized_internal(logical_schema, pred, pred_relevance_function, mt_info, ignore_cms_gaf, check_supportednessP, ignore_istsP);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym43$RELEVANT_LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_G, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym43$RELEVANT_LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_G, SEVEN_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym43$RELEVANT_LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_G, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_7(logical_schema, pred, pred_relevance_function, mt_info, ignore_cms_gaf, check_supportednessP, ignore_istsP);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw18$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (logical_schema == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (pred == cached_args.first()) {
                                            cached_args = cached_args.rest();
                                            if (pred_relevance_function == cached_args.first()) {
                                                cached_args = cached_args.rest();
                                                if (mt_info == cached_args.first()) {
                                                    cached_args = cached_args.rest();
                                                    if (ignore_cms_gaf == cached_args.first()) {
                                                        cached_args = cached_args.rest();
                                                        if (check_supportednessP == cached_args.first()) {
                                                            cached_args = cached_args.rest();
                                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && (ignore_istsP == cached_args.first())) {
                                                                return memoization_state.caching_results(results2);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.relevant_logical_schema_consequent_conditional_meaning_sentence_gafs_memoized_internal(logical_schema, pred, pred_relevance_function, mt_info, ignore_cms_gaf, check_supportednessP, ignore_istsP)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(logical_schema, pred, pred_relevance_function, mt_info, ignore_cms_gaf, check_supportednessP, ignore_istsP));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject relevant_logical_schema_consequent_conditional_meaning_sentence_gafs_memoized(final SubLObject logical_schema, final SubLObject pred, final SubLObject pred_relevance_function, final SubLObject mt_info, SubLObject ignore_cms_gaf, SubLObject check_supportednessP, SubLObject ignore_istsP) {
        if (ignore_cms_gaf == UNPROVIDED) {
            ignore_cms_gaf = NIL;
        }
        if (check_supportednessP == UNPROVIDED) {
            check_supportednessP = T;
        }
        if (ignore_istsP == UNPROVIDED) {
            ignore_istsP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return relevant_logical_schema_consequent_conditional_meaning_sentence_gafs_memoized_internal(logical_schema, pred, pred_relevance_function, mt_info, ignore_cms_gaf, check_supportednessP, ignore_istsP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym42$RELEVANT_LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_G, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym42$RELEVANT_LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_G, SEVEN_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym42$RELEVANT_LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_G, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_7(logical_schema, pred, pred_relevance_function, mt_info, ignore_cms_gaf, check_supportednessP, ignore_istsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (logical_schema.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pred.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (pred_relevance_function.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (mt_info.eql(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (ignore_cms_gaf.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (check_supportednessP.eql(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && ignore_istsP.eql(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(relevant_logical_schema_consequent_conditional_meaning_sentence_gafs_memoized_internal(logical_schema, pred, pred_relevance_function, mt_info, ignore_cms_gaf, check_supportednessP, ignore_istsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(logical_schema, pred, pred_relevance_function, mt_info, ignore_cms_gaf, check_supportednessP, ignore_istsP));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject logical_schema_conditional_meaning_sentence_gafs_internal_alt(SubLObject logical_schema, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return kb_mapping_utilities.pred_value_gafs(logical_schema, $const1$conditionalMeaningSentenceOfSchem, THREE_INTEGER, $TRUE);
    }

    public static SubLObject logical_schema_conditional_meaning_sentence_gafs_internal(final SubLObject logical_schema, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return kb_mapping_utilities.pred_value_gafs(logical_schema, $const1$conditionalMeaningSentenceOfSchem, THREE_INTEGER, $TRUE);
    }

    public static final SubLObject logical_schema_conditional_meaning_sentence_gafs_alt(SubLObject logical_schema, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_conditional_meaning_sentence_gafs_internal(logical_schema, mt_info);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, LOGICAL_SCHEMA_CONDITIONAL_MEANING_SENTENCE_GAFS, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), LOGICAL_SCHEMA_CONDITIONAL_MEANING_SENTENCE_GAFS, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, LOGICAL_SCHEMA_CONDITIONAL_MEANING_SENTENCE_GAFS, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(logical_schema, mt_info);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw18$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (logical_schema == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt_info == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_conditional_meaning_sentence_gafs_internal(logical_schema, mt_info)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(logical_schema, mt_info));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject logical_schema_conditional_meaning_sentence_gafs(final SubLObject logical_schema, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return logical_schema_conditional_meaning_sentence_gafs_internal(logical_schema, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, LOGICAL_SCHEMA_CONDITIONAL_MEANING_SENTENCE_GAFS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), LOGICAL_SCHEMA_CONDITIONAL_MEANING_SENTENCE_GAFS, TWO_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, LOGICAL_SCHEMA_CONDITIONAL_MEANING_SENTENCE_GAFS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(logical_schema, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (logical_schema.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(logical_schema_conditional_meaning_sentence_gafs_internal(logical_schema, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(logical_schema, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject relevant_logical_schema_consequent_conditional_meaning_sentence_gafs_int_alt(SubLObject logical_schema, SubLObject pred, SubLObject pred_relevance_function, SubLObject ignore_cms_gaf, SubLObject check_supportednessP, SubLObject ignore_istsP) {
        if (ignore_cms_gaf == UNPROVIDED) {
            ignore_cms_gaf = NIL;
        }
        if (check_supportednessP == UNPROVIDED) {
            check_supportednessP = T;
        }
        if (ignore_istsP == UNPROVIDED) {
            ignore_istsP = T;
        }
        {
            SubLObject all_cms_gafs = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_conditional_meaning_sentence_gafs(logical_schema, UNPROVIDED);
            if (NIL != ignore_cms_gaf) {
                all_cms_gafs = remove(ignore_cms_gaf, all_cms_gafs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject relevant_cms_gafs = NIL;
                SubLObject cdolist_list_var = all_cms_gafs;
                SubLObject cms_gaf = NIL;
                for (cms_gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cms_gaf = cdolist_list_var.first()) {
                    {
                        SubLObject consequent_meaning_sentence = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf(cms_gaf, ignore_istsP);
                        SubLObject meaning_sentence_pred = cycl_utilities.formula_operator(consequent_meaning_sentence);
                        SubLObject pred_relevantP = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.meaning_sentence_pred_relevantP(meaning_sentence_pred, pred, pred_relevance_function, UNPROVIDED);
                        if ((NIL != pred_relevantP) || (NIL != sksi_kb_accessors.logical_field_indexical_p(meaning_sentence_pred))) {
                            if ((NIL == check_supportednessP) || (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.supported_conditional_meaning_sentence_gaf_p(cms_gaf, UNPROVIDED))) {
                                relevant_cms_gafs = cons(cms_gaf, relevant_cms_gafs);
                            }
                        }
                    }
                }
                return relevant_cms_gafs;
            }
        }
    }

    public static SubLObject relevant_logical_schema_consequent_conditional_meaning_sentence_gafs_int(final SubLObject logical_schema, final SubLObject pred, final SubLObject pred_relevance_function, SubLObject ignore_cms_gaf, SubLObject check_supportednessP, SubLObject ignore_istsP) {
        if (ignore_cms_gaf == UNPROVIDED) {
            ignore_cms_gaf = NIL;
        }
        if (check_supportednessP == UNPROVIDED) {
            check_supportednessP = T;
        }
        if (ignore_istsP == UNPROVIDED) {
            ignore_istsP = T;
        }
        SubLObject all_cms_gafs = logical_schema_conditional_meaning_sentence_gafs(logical_schema, UNPROVIDED);
        if (NIL != ignore_cms_gaf) {
            all_cms_gafs = remove(ignore_cms_gaf, all_cms_gafs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject relevant_cms_gafs = NIL;
        SubLObject cdolist_list_var = all_cms_gafs;
        SubLObject cms_gaf = NIL;
        cms_gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject consequent_meaning_sentence = get_consequent_meaning_sentence_from_gaf(cms_gaf, ignore_istsP);
            final SubLObject meaning_sentence_pred = cycl_utilities.formula_operator(consequent_meaning_sentence);
            final SubLObject pred_relevantP = meaning_sentence_pred_relevantP(meaning_sentence_pred, pred, pred_relevance_function, UNPROVIDED);
            if (((NIL != pred_relevantP) || (NIL != sksi_kb_accessors.logical_field_indexical_p(meaning_sentence_pred))) && ((NIL == check_supportednessP) || (NIL != supported_conditional_meaning_sentence_gaf_p(cms_gaf, UNPROVIDED)))) {
                relevant_cms_gafs = cons(cms_gaf, relevant_cms_gafs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cms_gaf = cdolist_list_var.first();
        } 
        return relevant_cms_gafs;
    }

    /**
     * Wrapper around @xref logical-schema-meaning-sentences where ASSERTED-MEANING-SENTENCES-ONLY? is set to T.
     */
    @LispMethod(comment = "Wrapper around @xref logical-schema-meaning-sentences where ASSERTED-MEANING-SENTENCES-ONLY? is set to T.")
    public static final SubLObject asserted_logical_schema_meaning_sentences_alt(SubLObject logical_schema, SubLObject memoizeP) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_meaning_sentences(logical_schema, T, memoizeP, UNPROVIDED);
    }

    @LispMethod(comment = "Wrapper around @xref logical-schema-meaning-sentences where ASSERTED-MEANING-SENTENCES-ONLY? is set to T.")
    public static SubLObject asserted_logical_schema_meaning_sentences(final SubLObject logical_schema, SubLObject memoizeP) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        return logical_schema_meaning_sentences(logical_schema, T, memoizeP, UNPROVIDED);
    }/**
     * Wrapper around @xref logical-schema-meaning-sentences where ASSERTED-MEANING-SENTENCES-ONLY? is set to T.
     */


    /**
     * Returns the meaning sentences for LOGICAL-SCHEMA.
     */
    @LispMethod(comment = "Returns the meaning sentences for LOGICAL-SCHEMA.")
    public static final SubLObject logical_schema_meaning_sentences_alt(SubLObject logical_schema, SubLObject asserted_meaning_sentences_onlyP, SubLObject memoizeP, SubLObject unwrap_istsP) {
        if (asserted_meaning_sentences_onlyP == UNPROVIDED) {
            asserted_meaning_sentences_onlyP = NIL;
        }
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = NIL;
        }
        {
            SubLObject gafs = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_meaning_sentence_gafs(logical_schema, memoizeP);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = gafs;
            SubLObject gaf = NIL;
            for (gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gaf = cdolist_list_var.first()) {
                if ((NIL == asserted_meaning_sentences_onlyP) || (NIL != assertions_high.asserted_assertionP(gaf))) {
                    sksi_hl_support_utilities.note_sksi_support(gaf);
                    result = cons(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.get_meaning_sentence_from_gaf(gaf, unwrap_istsP), result);
                }
            }
            return nreverse(list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
    }

    @LispMethod(comment = "Returns the meaning sentences for LOGICAL-SCHEMA.")
    public static SubLObject logical_schema_meaning_sentences(final SubLObject logical_schema, SubLObject asserted_meaning_sentences_onlyP, SubLObject memoizeP, SubLObject unwrap_istsP) {
        if (asserted_meaning_sentences_onlyP == UNPROVIDED) {
            asserted_meaning_sentences_onlyP = NIL;
        }
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = NIL;
        }
        final SubLObject gafs = logical_schema_meaning_sentence_gafs(logical_schema, memoizeP);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = gafs;
        SubLObject gaf = NIL;
        gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == asserted_meaning_sentences_onlyP) || (NIL != assertions_high.asserted_assertionP(gaf))) {
                sksi_hl_support_utilities.note_sksi_support(gaf);
                result = cons(get_meaning_sentence_from_gaf(gaf, unwrap_istsP), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        } 
        return nreverse(list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }/**
     * Returns the meaning sentences for LOGICAL-SCHEMA.
     */


    /**
     * Returns the consequent meaning sentences for which LOGICAL-SCHEMA is the logical schema.
     */
    @LispMethod(comment = "Returns the consequent meaning sentences for which LOGICAL-SCHEMA is the logical schema.")
    public static final SubLObject logical_schema_consequent_meaning_sentences_alt(SubLObject logical_schema, SubLObject asserted_meaning_sentences_onlyP, SubLObject memoizeP, SubLObject ignore_cms_gaf, SubLObject check_supportednessP, SubLObject unwrap_istsP) {
        if (asserted_meaning_sentences_onlyP == UNPROVIDED) {
            asserted_meaning_sentences_onlyP = NIL;
        }
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (ignore_cms_gaf == UNPROVIDED) {
            ignore_cms_gaf = NIL;
        }
        if (check_supportednessP == UNPROVIDED) {
            check_supportednessP = T;
        }
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = NIL;
        }
        {
            SubLObject conditional_meaning_sentence_gafs = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_consequent_conditional_meaning_sentence_gafs(logical_schema, memoizeP, ignore_cms_gaf, check_supportednessP);
            SubLObject consequent_meaning_sentences = NIL;
            SubLObject cdolist_list_var = conditional_meaning_sentence_gafs;
            SubLObject gaf = NIL;
            for (gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gaf = cdolist_list_var.first()) {
                if ((NIL == asserted_meaning_sentences_onlyP) || (NIL != assertions_high.asserted_assertionP(gaf))) {
                    sksi_hl_support_utilities.note_sksi_support(gaf);
                    consequent_meaning_sentences = cons(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf(gaf, unwrap_istsP), consequent_meaning_sentences);
                }
            }
            return list_utilities.fast_delete_duplicates(consequent_meaning_sentences, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    @LispMethod(comment = "Returns the consequent meaning sentences for which LOGICAL-SCHEMA is the logical schema.")
    public static SubLObject logical_schema_consequent_meaning_sentences(final SubLObject logical_schema, SubLObject asserted_meaning_sentences_onlyP, SubLObject memoizeP, SubLObject ignore_cms_gaf, SubLObject check_supportednessP, SubLObject unwrap_istsP) {
        if (asserted_meaning_sentences_onlyP == UNPROVIDED) {
            asserted_meaning_sentences_onlyP = NIL;
        }
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (ignore_cms_gaf == UNPROVIDED) {
            ignore_cms_gaf = NIL;
        }
        if (check_supportednessP == UNPROVIDED) {
            check_supportednessP = T;
        }
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = NIL;
        }
        final SubLObject conditional_meaning_sentence_gafs = logical_schema_consequent_conditional_meaning_sentence_gafs(logical_schema, memoizeP, ignore_cms_gaf, check_supportednessP);
        SubLObject consequent_meaning_sentences = NIL;
        SubLObject cdolist_list_var = conditional_meaning_sentence_gafs;
        SubLObject gaf = NIL;
        gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == asserted_meaning_sentences_onlyP) || (NIL != assertions_high.asserted_assertionP(gaf))) {
                sksi_hl_support_utilities.note_sksi_support(gaf);
                consequent_meaning_sentences = cons(get_consequent_meaning_sentence_from_gaf(gaf, unwrap_istsP), consequent_meaning_sentences);
            }
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(consequent_meaning_sentences, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns the consequent meaning sentences for which LOGICAL-SCHEMA is the logical schema.
     */


    /**
     * Returns the meaning sentence GAFs for all the logical schemata of LOGICAL-SCHEMATA.
     */
    @LispMethod(comment = "Returns the meaning sentence GAFs for all the logical schemata of LOGICAL-SCHEMATA.")
    public static final SubLObject logical_schemata_meaning_sentence_gafs_alt(SubLObject logical_schemata, SubLObject memoizeP) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        {
            SubLObject meaning_sentence_gafs = NIL;
            SubLObject cdolist_list_var = logical_schemata;
            SubLObject logical_schema = NIL;
            for (logical_schema = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , logical_schema = cdolist_list_var.first()) {
                meaning_sentence_gafs = append(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_meaning_sentence_gafs(logical_schema, memoizeP), meaning_sentence_gafs);
            }
            return meaning_sentence_gafs;
        }
    }

    @LispMethod(comment = "Returns the meaning sentence GAFs for all the logical schemata of LOGICAL-SCHEMATA.")
    public static SubLObject logical_schemata_meaning_sentence_gafs(final SubLObject logical_schemata, SubLObject memoizeP) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        SubLObject meaning_sentence_gafs = NIL;
        SubLObject cdolist_list_var = logical_schemata;
        SubLObject logical_schema = NIL;
        logical_schema = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            meaning_sentence_gafs = append(logical_schema_meaning_sentence_gafs(logical_schema, memoizeP), meaning_sentence_gafs);
            cdolist_list_var = cdolist_list_var.rest();
            logical_schema = cdolist_list_var.first();
        } 
        return meaning_sentence_gafs;
    }/**
     * Returns the meaning sentence GAFs for all the logical schemata of LOGICAL-SCHEMATA.
     */


    /**
     * Returns the conditional meaning sentence GAFs for which some logical schema of
     * LOGICAL-SCHEMATA is the consequent logical schema.
     */
    @LispMethod(comment = "Returns the conditional meaning sentence GAFs for which some logical schema of\r\nLOGICAL-SCHEMATA is the consequent logical schema.\nReturns the conditional meaning sentence GAFs for which some logical schema of\nLOGICAL-SCHEMATA is the consequent logical schema.")
    public static final SubLObject logical_schemata_consequent_conditional_meaning_sentence_gafs_alt(SubLObject logical_schemata, SubLObject memoizeP, SubLObject check_supportednessP) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (check_supportednessP == UNPROVIDED) {
            check_supportednessP = NIL;
        }
        {
            SubLObject meaning_sentence_gafs = NIL;
            SubLObject cdolist_list_var = logical_schemata;
            SubLObject logical_schema = NIL;
            for (logical_schema = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , logical_schema = cdolist_list_var.first()) {
                meaning_sentence_gafs = append(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_consequent_conditional_meaning_sentence_gafs(logical_schema, memoizeP, NIL, check_supportednessP), meaning_sentence_gafs);
            }
            return list_utilities.fast_delete_duplicates(meaning_sentence_gafs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    @LispMethod(comment = "Returns the conditional meaning sentence GAFs for which some logical schema of\r\nLOGICAL-SCHEMATA is the consequent logical schema.\nReturns the conditional meaning sentence GAFs for which some logical schema of\nLOGICAL-SCHEMATA is the consequent logical schema.")
    public static SubLObject logical_schemata_consequent_conditional_meaning_sentence_gafs(final SubLObject logical_schemata, SubLObject memoizeP, SubLObject check_supportednessP) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (check_supportednessP == UNPROVIDED) {
            check_supportednessP = NIL;
        }
        SubLObject meaning_sentence_gafs = NIL;
        SubLObject cdolist_list_var = logical_schemata;
        SubLObject logical_schema = NIL;
        logical_schema = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            meaning_sentence_gafs = append(logical_schema_consequent_conditional_meaning_sentence_gafs(logical_schema, memoizeP, NIL, check_supportednessP), meaning_sentence_gafs);
            cdolist_list_var = cdolist_list_var.rest();
            logical_schema = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(meaning_sentence_gafs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns the conditional meaning sentence GAFs for which some logical schema of
     * LOGICAL-SCHEMATA is the consequent logical schema.
     */


    /**
     * Returns the relevant meaning sentence GAFs for all the logical schemata of LOGICAL-SCHEMATA.
     * A meaning sentence GAF is relevant if its meaning-sentence-pred is
     * relevant to PRED wrt PRED-RELEVANCE-FUNCTION (if the meaning-sentence-pred
     * in question is a logical field indexical then it is considered (potentially) relevant).
     */
    @LispMethod(comment = "Returns the relevant meaning sentence GAFs for all the logical schemata of LOGICAL-SCHEMATA.\r\nA meaning sentence GAF is relevant if its meaning-sentence-pred is\r\nrelevant to PRED wrt PRED-RELEVANCE-FUNCTION (if the meaning-sentence-pred\r\nin question is a logical field indexical then it is considered (potentially) relevant).\nReturns the relevant meaning sentence GAFs for all the logical schemata of LOGICAL-SCHEMATA.\nA meaning sentence GAF is relevant if its meaning-sentence-pred is\nrelevant to PRED wrt PRED-RELEVANCE-FUNCTION (if the meaning-sentence-pred\nin question is a logical field indexical then it is considered (potentially) relevant).")
    public static final SubLObject relevant_logical_schemata_meaning_sentence_gafs_alt(SubLObject logical_schemata, SubLObject pred, SubLObject pred_relevance_function, SubLObject memoizeP, SubLObject ignore_istsP) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (ignore_istsP == UNPROVIDED) {
            ignore_istsP = T;
        }
        {
            SubLObject meaning_sentence_gafs = NIL;
            SubLObject cdolist_list_var = logical_schemata;
            SubLObject logical_schema = NIL;
            for (logical_schema = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , logical_schema = cdolist_list_var.first()) {
                meaning_sentence_gafs = append(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.relevant_logical_schema_meaning_sentence_gafs(logical_schema, pred, pred_relevance_function, memoizeP, ignore_istsP), meaning_sentence_gafs);
            }
            return meaning_sentence_gafs;
        }
    }

    @LispMethod(comment = "Returns the relevant meaning sentence GAFs for all the logical schemata of LOGICAL-SCHEMATA.\r\nA meaning sentence GAF is relevant if its meaning-sentence-pred is\r\nrelevant to PRED wrt PRED-RELEVANCE-FUNCTION (if the meaning-sentence-pred\r\nin question is a logical field indexical then it is considered (potentially) relevant).\nReturns the relevant meaning sentence GAFs for all the logical schemata of LOGICAL-SCHEMATA.\nA meaning sentence GAF is relevant if its meaning-sentence-pred is\nrelevant to PRED wrt PRED-RELEVANCE-FUNCTION (if the meaning-sentence-pred\nin question is a logical field indexical then it is considered (potentially) relevant).")
    public static SubLObject relevant_logical_schemata_meaning_sentence_gafs(final SubLObject logical_schemata, final SubLObject pred, final SubLObject pred_relevance_function, SubLObject memoizeP, SubLObject ignore_istsP) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (ignore_istsP == UNPROVIDED) {
            ignore_istsP = T;
        }
        SubLObject meaning_sentence_gafs = NIL;
        SubLObject cdolist_list_var = logical_schemata;
        SubLObject logical_schema = NIL;
        logical_schema = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            meaning_sentence_gafs = append(relevant_logical_schema_meaning_sentence_gafs(logical_schema, pred, pred_relevance_function, memoizeP, ignore_istsP), meaning_sentence_gafs);
            cdolist_list_var = cdolist_list_var.rest();
            logical_schema = cdolist_list_var.first();
        } 
        return meaning_sentence_gafs;
    }/**
     * Returns the relevant meaning sentence GAFs for all the logical schemata of LOGICAL-SCHEMATA.
     * A meaning sentence GAF is relevant if its meaning-sentence-pred is
     * relevant to PRED wrt PRED-RELEVANCE-FUNCTION (if the meaning-sentence-pred
     * in question is a logical field indexical then it is considered (potentially) relevant).
     */


    /**
     * Returns the conditional meaning sentence GAFs whose consequent-meaning-sentence predicate
     * is relevant to PRED wrt PRED-RELEVANCE-FUNCTION (if the consequent-meaning-sentence
     * predicate is a logical field indexical then it is considered (potentially) relevant)
     * and for which some logical schema of LOGICAL-SCHEMATA is the consequent logical schema.
     */
    @LispMethod(comment = "Returns the conditional meaning sentence GAFs whose consequent-meaning-sentence predicate\r\nis relevant to PRED wrt PRED-RELEVANCE-FUNCTION (if the consequent-meaning-sentence\r\npredicate is a logical field indexical then it is considered (potentially) relevant)\r\nand for which some logical schema of LOGICAL-SCHEMATA is the consequent logical schema.\nReturns the conditional meaning sentence GAFs whose consequent-meaning-sentence predicate\nis relevant to PRED wrt PRED-RELEVANCE-FUNCTION (if the consequent-meaning-sentence\npredicate is a logical field indexical then it is considered (potentially) relevant)\nand for which some logical schema of LOGICAL-SCHEMATA is the consequent logical schema.")
    public static final SubLObject relevant_logical_schemata_consequent_conditional_meaning_sentence_gafs_alt(SubLObject logical_schemata, SubLObject pred, SubLObject pred_relevance_function, SubLObject memoizeP, SubLObject ignore_istsP) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (ignore_istsP == UNPROVIDED) {
            ignore_istsP = T;
        }
        {
            SubLObject meaning_sentence_gafs = NIL;
            SubLObject cdolist_list_var = logical_schemata;
            SubLObject logical_schema = NIL;
            for (logical_schema = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , logical_schema = cdolist_list_var.first()) {
                meaning_sentence_gafs = append(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.relevant_logical_schema_consequent_conditional_meaning_sentence_gafs(logical_schema, pred, pred_relevance_function, memoizeP, NIL, T, ignore_istsP), meaning_sentence_gafs);
            }
            return meaning_sentence_gafs;
        }
    }

    @LispMethod(comment = "Returns the conditional meaning sentence GAFs whose consequent-meaning-sentence predicate\r\nis relevant to PRED wrt PRED-RELEVANCE-FUNCTION (if the consequent-meaning-sentence\r\npredicate is a logical field indexical then it is considered (potentially) relevant)\r\nand for which some logical schema of LOGICAL-SCHEMATA is the consequent logical schema.\nReturns the conditional meaning sentence GAFs whose consequent-meaning-sentence predicate\nis relevant to PRED wrt PRED-RELEVANCE-FUNCTION (if the consequent-meaning-sentence\npredicate is a logical field indexical then it is considered (potentially) relevant)\nand for which some logical schema of LOGICAL-SCHEMATA is the consequent logical schema.")
    public static SubLObject relevant_logical_schemata_consequent_conditional_meaning_sentence_gafs(final SubLObject logical_schemata, final SubLObject pred, final SubLObject pred_relevance_function, SubLObject memoizeP, SubLObject ignore_istsP) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (ignore_istsP == UNPROVIDED) {
            ignore_istsP = T;
        }
        SubLObject meaning_sentence_gafs = NIL;
        SubLObject cdolist_list_var = logical_schemata;
        SubLObject logical_schema = NIL;
        logical_schema = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            meaning_sentence_gafs = append(relevant_logical_schema_consequent_conditional_meaning_sentence_gafs(logical_schema, pred, pred_relevance_function, memoizeP, NIL, T, ignore_istsP), meaning_sentence_gafs);
            cdolist_list_var = cdolist_list_var.rest();
            logical_schema = cdolist_list_var.first();
        } 
        return meaning_sentence_gafs;
    }/**
     * Returns the conditional meaning sentence GAFs whose consequent-meaning-sentence predicate
     * is relevant to PRED wrt PRED-RELEVANCE-FUNCTION (if the consequent-meaning-sentence
     * predicate is a logical field indexical then it is considered (potentially) relevant)
     * and for which some logical schema of LOGICAL-SCHEMATA is the consequent logical schema.
     */


    public static final SubLObject relevant_logical_schema_meaning_sentences_internal_alt(SubLObject logical_schema, SubLObject relevant_logical_field_indexicals, SubLObject asserted_meaning_sentences_onlyP, SubLObject unwrap_istsP) {
        if (asserted_meaning_sentences_onlyP == UNPROVIDED) {
            asserted_meaning_sentences_onlyP = NIL;
        }
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = NIL;
        }
        {
            SubLObject all_meaning_sentences = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_meaning_sentences(logical_schema, asserted_meaning_sentences_onlyP, unwrap_istsP, UNPROVIDED);
            SubLObject all_logical_field_indexicals = sksi_kb_accessors.logical_schema_field_indexicals(logical_schema);
            SubLObject irrelevant_logical_field_indexicals = set_difference(all_logical_field_indexicals, relevant_logical_field_indexicals, UNPROVIDED, UNPROVIDED);
            SubLObject relevant_sentences = NIL;
            SubLObject cdolist_list_var = all_meaning_sentences;
            SubLObject sentence = NIL;
            for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                {
                    SubLObject irrelevant = NIL;
                    if (NIL == irrelevant) {
                        {
                            SubLObject csome_list_var = irrelevant_logical_field_indexicals;
                            SubLObject irrelevant_field_indexical = NIL;
                            for (irrelevant_field_indexical = csome_list_var.first(); !((NIL != irrelevant) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , irrelevant_field_indexical = csome_list_var.first()) {
                                irrelevant = cycl_utilities.expression_find(irrelevant_field_indexical, sentence, T, UNPROVIDED, UNPROVIDED);
                            }
                        }
                    }
                    if (NIL == irrelevant) {
                        relevant_sentences = cons(sentence, relevant_sentences);
                    }
                }
            }
            return nreverse(relevant_sentences);
        }
    }

    public static SubLObject relevant_logical_schema_meaning_sentences_internal(final SubLObject logical_schema, final SubLObject relevant_logical_field_indexicals, SubLObject asserted_meaning_sentences_onlyP, SubLObject unwrap_istsP) {
        if (asserted_meaning_sentences_onlyP == UNPROVIDED) {
            asserted_meaning_sentences_onlyP = NIL;
        }
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = NIL;
        }
        final SubLObject all_meaning_sentences = logical_schema_meaning_sentences(logical_schema, asserted_meaning_sentences_onlyP, unwrap_istsP, UNPROVIDED);
        final SubLObject all_logical_field_indexicals = sksi_kb_accessors.logical_schema_field_indexicals(logical_schema);
        final SubLObject irrelevant_logical_field_indexicals = set_difference(all_logical_field_indexicals, relevant_logical_field_indexicals, UNPROVIDED, UNPROVIDED);
        SubLObject relevant_sentences = NIL;
        SubLObject cdolist_list_var = all_meaning_sentences;
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject irrelevant = NIL;
            if (NIL == irrelevant) {
                SubLObject csome_list_var;
                SubLObject irrelevant_field_indexical;
                for (csome_list_var = irrelevant_logical_field_indexicals, irrelevant_field_indexical = NIL, irrelevant_field_indexical = csome_list_var.first(); (NIL == irrelevant) && (NIL != csome_list_var); irrelevant = cycl_utilities.expression_find(irrelevant_field_indexical, sentence, T, UNPROVIDED, UNPROVIDED) , csome_list_var = csome_list_var.rest() , irrelevant_field_indexical = csome_list_var.first()) {
                }
            }
            if (NIL == irrelevant) {
                relevant_sentences = cons(sentence, relevant_sentences);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        return nreverse(relevant_sentences);
    }

    public static final SubLObject relevant_logical_schema_meaning_sentences_alt(SubLObject logical_schema, SubLObject relevant_logical_field_indexicals, SubLObject asserted_meaning_sentences_onlyP, SubLObject unwrap_istsP) {
        if (asserted_meaning_sentences_onlyP == UNPROVIDED) {
            asserted_meaning_sentences_onlyP = NIL;
        }
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.relevant_logical_schema_meaning_sentences_internal(logical_schema, relevant_logical_field_indexicals, asserted_meaning_sentences_onlyP, unwrap_istsP);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCES, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCES, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCES, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_4(logical_schema, relevant_logical_field_indexicals, asserted_meaning_sentences_onlyP, unwrap_istsP);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw18$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (logical_schema.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (relevant_logical_field_indexicals.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (asserted_meaning_sentences_onlyP.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && unwrap_istsP.equal(cached_args.first())) {
                                                    return memoization_state.caching_results(results2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.relevant_logical_schema_meaning_sentences_internal(logical_schema, relevant_logical_field_indexicals, asserted_meaning_sentences_onlyP, unwrap_istsP)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(logical_schema, relevant_logical_field_indexicals, asserted_meaning_sentences_onlyP, unwrap_istsP));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject relevant_logical_schema_meaning_sentences(final SubLObject logical_schema, final SubLObject relevant_logical_field_indexicals, SubLObject asserted_meaning_sentences_onlyP, SubLObject unwrap_istsP) {
        if (asserted_meaning_sentences_onlyP == UNPROVIDED) {
            asserted_meaning_sentences_onlyP = NIL;
        }
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return relevant_logical_schema_meaning_sentences_internal(logical_schema, relevant_logical_field_indexicals, asserted_meaning_sentences_onlyP, unwrap_istsP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCES, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCES, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCES, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(logical_schema, relevant_logical_field_indexicals, asserted_meaning_sentences_onlyP, unwrap_istsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (logical_schema.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (relevant_logical_field_indexicals.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (asserted_meaning_sentences_onlyP.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && unwrap_istsP.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(relevant_logical_schema_meaning_sentences_internal(logical_schema, relevant_logical_field_indexicals, asserted_meaning_sentences_onlyP, unwrap_istsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(logical_schema, relevant_logical_field_indexicals, asserted_meaning_sentences_onlyP, unwrap_istsP));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject relevant_logical_schema_conditional_meaning_sentences_internal_alt(SubLObject logical_schema, SubLObject relevant_logical_field_indexicals, SubLObject asserted_meaning_sentences_onlyP, SubLObject unwrap_istsP) {
        if (asserted_meaning_sentences_onlyP == UNPROVIDED) {
            asserted_meaning_sentences_onlyP = NIL;
        }
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = NIL;
        }
        {
            SubLObject all_cond_meaning_sentence_gafs = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_consequent_conditional_meaning_sentence_gafs(logical_schema, T, UNPROVIDED, UNPROVIDED);
            SubLObject all_logical_field_indexicals = sksi_kb_accessors.logical_schema_field_indexicals(logical_schema);
            SubLObject irrelevant_logical_field_indexicals = set_difference(all_logical_field_indexicals, relevant_logical_field_indexicals, UNPROVIDED, UNPROVIDED);
            SubLObject relevant_sentences = NIL;
            SubLObject cdolist_list_var = all_cond_meaning_sentence_gafs;
            SubLObject sentence_gaf = NIL;
            for (sentence_gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence_gaf = cdolist_list_var.first()) {
                if ((NIL == asserted_meaning_sentences_onlyP) || (NIL != assertions_high.asserted_assertionP(sentence_gaf))) {
                    {
                        SubLObject ant_sentence = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.get_antecedent_meaning_sentence_from_gaf(sentence_gaf);
                        SubLObject con_sentence = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf(sentence_gaf, unwrap_istsP);
                        SubLObject irrelevantP = NIL;
                        if (NIL == irrelevantP) {
                            {
                                SubLObject csome_list_var = irrelevant_logical_field_indexicals;
                                SubLObject irrelevant_field_indexical = NIL;
                                for (irrelevant_field_indexical = csome_list_var.first(); !((NIL != irrelevantP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , irrelevant_field_indexical = csome_list_var.first()) {
                                    irrelevantP = makeBoolean((NIL != cycl_utilities.expression_find(irrelevant_field_indexical, ant_sentence, T, UNPROVIDED, UNPROVIDED)) || (NIL != cycl_utilities.expression_find(irrelevant_field_indexical, con_sentence, T, UNPROVIDED, UNPROVIDED)));
                                }
                            }
                        }
                        if (NIL == irrelevantP) {
                            relevant_sentences = cons(assertions_high.gaf_formula(sentence_gaf), relevant_sentences);
                        }
                    }
                }
            }
            return nreverse(relevant_sentences);
        }
    }

    public static SubLObject relevant_logical_schema_conditional_meaning_sentences_internal(final SubLObject logical_schema, final SubLObject relevant_logical_field_indexicals, SubLObject asserted_meaning_sentences_onlyP, SubLObject unwrap_istsP) {
        if (asserted_meaning_sentences_onlyP == UNPROVIDED) {
            asserted_meaning_sentences_onlyP = NIL;
        }
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = NIL;
        }
        final SubLObject all_cond_meaning_sentence_gafs = logical_schema_consequent_conditional_meaning_sentence_gafs(logical_schema, T, UNPROVIDED, UNPROVIDED);
        final SubLObject all_logical_field_indexicals = sksi_kb_accessors.logical_schema_field_indexicals(logical_schema);
        final SubLObject irrelevant_logical_field_indexicals = set_difference(all_logical_field_indexicals, relevant_logical_field_indexicals, UNPROVIDED, UNPROVIDED);
        SubLObject relevant_sentences = NIL;
        SubLObject cdolist_list_var = all_cond_meaning_sentence_gafs;
        SubLObject sentence_gaf = NIL;
        sentence_gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == asserted_meaning_sentences_onlyP) || (NIL != assertions_high.asserted_assertionP(sentence_gaf))) {
                final SubLObject ant_sentence = get_antecedent_meaning_sentence_from_gaf(sentence_gaf);
                final SubLObject con_sentence = get_consequent_meaning_sentence_from_gaf(sentence_gaf, unwrap_istsP);
                SubLObject irrelevantP = NIL;
                if (NIL == irrelevantP) {
                    SubLObject csome_list_var;
                    SubLObject irrelevant_field_indexical;
                    for (csome_list_var = irrelevant_logical_field_indexicals, irrelevant_field_indexical = NIL, irrelevant_field_indexical = csome_list_var.first(); (NIL == irrelevantP) && (NIL != csome_list_var); irrelevantP = makeBoolean((NIL != cycl_utilities.expression_find(irrelevant_field_indexical, ant_sentence, T, UNPROVIDED, UNPROVIDED)) || (NIL != cycl_utilities.expression_find(irrelevant_field_indexical, con_sentence, T, UNPROVIDED, UNPROVIDED))) , csome_list_var = csome_list_var.rest() , irrelevant_field_indexical = csome_list_var.first()) {
                    }
                }
                if (NIL == irrelevantP) {
                    relevant_sentences = cons(assertions_high.gaf_formula(sentence_gaf), relevant_sentences);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence_gaf = cdolist_list_var.first();
        } 
        return nreverse(relevant_sentences);
    }

    public static final SubLObject relevant_logical_schema_conditional_meaning_sentences_alt(SubLObject logical_schema, SubLObject relevant_logical_field_indexicals, SubLObject asserted_meaning_sentences_onlyP, SubLObject unwrap_istsP) {
        if (asserted_meaning_sentences_onlyP == UNPROVIDED) {
            asserted_meaning_sentences_onlyP = NIL;
        }
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.relevant_logical_schema_conditional_meaning_sentences_internal(logical_schema, relevant_logical_field_indexicals, asserted_meaning_sentences_onlyP, unwrap_istsP);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RELEVANT_LOGICAL_SCHEMA_CONDITIONAL_MEANING_SENTENCES, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RELEVANT_LOGICAL_SCHEMA_CONDITIONAL_MEANING_SENTENCES, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, RELEVANT_LOGICAL_SCHEMA_CONDITIONAL_MEANING_SENTENCES, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_4(logical_schema, relevant_logical_field_indexicals, asserted_meaning_sentences_onlyP, unwrap_istsP);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw18$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (logical_schema.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (relevant_logical_field_indexicals.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (asserted_meaning_sentences_onlyP.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && unwrap_istsP.equal(cached_args.first())) {
                                                    return memoization_state.caching_results(results2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.relevant_logical_schema_conditional_meaning_sentences_internal(logical_schema, relevant_logical_field_indexicals, asserted_meaning_sentences_onlyP, unwrap_istsP)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(logical_schema, relevant_logical_field_indexicals, asserted_meaning_sentences_onlyP, unwrap_istsP));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject relevant_logical_schema_conditional_meaning_sentences(final SubLObject logical_schema, final SubLObject relevant_logical_field_indexicals, SubLObject asserted_meaning_sentences_onlyP, SubLObject unwrap_istsP) {
        if (asserted_meaning_sentences_onlyP == UNPROVIDED) {
            asserted_meaning_sentences_onlyP = NIL;
        }
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return relevant_logical_schema_conditional_meaning_sentences_internal(logical_schema, relevant_logical_field_indexicals, asserted_meaning_sentences_onlyP, unwrap_istsP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RELEVANT_LOGICAL_SCHEMA_CONDITIONAL_MEANING_SENTENCES, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RELEVANT_LOGICAL_SCHEMA_CONDITIONAL_MEANING_SENTENCES, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, RELEVANT_LOGICAL_SCHEMA_CONDITIONAL_MEANING_SENTENCES, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(logical_schema, relevant_logical_field_indexicals, asserted_meaning_sentences_onlyP, unwrap_istsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (logical_schema.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (relevant_logical_field_indexicals.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (asserted_meaning_sentences_onlyP.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && unwrap_istsP.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(relevant_logical_schema_conditional_meaning_sentences_internal(logical_schema, relevant_logical_field_indexicals, asserted_meaning_sentences_onlyP, unwrap_istsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(logical_schema, relevant_logical_field_indexicals, asserted_meaning_sentences_onlyP, unwrap_istsP));
        return memoization_state.caching_results(results3);
    }

    /**
     * Returns the meaning sentence GAFs for LOGICAL-SCHEMA for which PRED is the
     * meaning sentence predicate.
     */
    @LispMethod(comment = "Returns the meaning sentence GAFs for LOGICAL-SCHEMA for which PRED is the\r\nmeaning sentence predicate.\nReturns the meaning sentence GAFs for LOGICAL-SCHEMA for which PRED is the\nmeaning sentence predicate.")
    public static final SubLObject logical_schema_meaning_sentence_gafs_for_pred_alt(SubLObject logical_schema, SubLObject pred, SubLObject ignore_istsP) {
        if (ignore_istsP == UNPROVIDED) {
            ignore_istsP = T;
        }
        {
            SubLObject ls_meaning_sentence_gafs = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_meaning_sentence_gafs(logical_schema, UNPROVIDED);
            SubLObject pred_meaning_sentence_gafs = NIL;
            SubLObject cdolist_list_var = ls_meaning_sentence_gafs;
            SubLObject meaning_sentence_gaf = NIL;
            for (meaning_sentence_gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , meaning_sentence_gaf = cdolist_list_var.first()) {
                {
                    SubLObject meaning_sentence_pred = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.get_meaning_sentence_pred_from_gaf(meaning_sentence_gaf, ignore_istsP);
                    if (pred == meaning_sentence_pred) {
                        pred_meaning_sentence_gafs = cons(meaning_sentence_gaf, pred_meaning_sentence_gafs);
                    }
                }
            }
            return pred_meaning_sentence_gafs;
        }
    }

    @LispMethod(comment = "Returns the meaning sentence GAFs for LOGICAL-SCHEMA for which PRED is the\r\nmeaning sentence predicate.\nReturns the meaning sentence GAFs for LOGICAL-SCHEMA for which PRED is the\nmeaning sentence predicate.")
    public static SubLObject logical_schema_meaning_sentence_gafs_for_pred(final SubLObject logical_schema, final SubLObject pred, SubLObject ignore_istsP) {
        if (ignore_istsP == UNPROVIDED) {
            ignore_istsP = T;
        }
        final SubLObject ls_meaning_sentence_gafs = logical_schema_meaning_sentence_gafs(logical_schema, UNPROVIDED);
        SubLObject pred_meaning_sentence_gafs = NIL;
        SubLObject cdolist_list_var = ls_meaning_sentence_gafs;
        SubLObject meaning_sentence_gaf = NIL;
        meaning_sentence_gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject meaning_sentence_pred = get_meaning_sentence_pred_from_gaf(meaning_sentence_gaf, ignore_istsP);
            if (pred.eql(meaning_sentence_pred)) {
                pred_meaning_sentence_gafs = cons(meaning_sentence_gaf, pred_meaning_sentence_gafs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meaning_sentence_gaf = cdolist_list_var.first();
        } 
        return pred_meaning_sentence_gafs;
    }/**
     * Returns the meaning sentence GAFs for LOGICAL-SCHEMA for which PRED is the
     * meaning sentence predicate.
     */


    /**
     * Returns the conditional meaning sentence GAFs for which LOGICAL-SCHEMA is the consequent logical schema
     * and PRED is the consequent meaning sentence predicate.
     */
    @LispMethod(comment = "Returns the conditional meaning sentence GAFs for which LOGICAL-SCHEMA is the consequent logical schema\r\nand PRED is the consequent meaning sentence predicate.\nReturns the conditional meaning sentence GAFs for which LOGICAL-SCHEMA is the consequent logical schema\nand PRED is the consequent meaning sentence predicate.")
    public static final SubLObject logical_schema_consequent_conditional_meaning_sentence_gafs_for_pred_alt(SubLObject logical_schema, SubLObject pred, SubLObject ignore_istsP) {
        if (ignore_istsP == UNPROVIDED) {
            ignore_istsP = T;
        }
        {
            SubLObject ls_conditional_meaning_sentence_gafs = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_consequent_conditional_meaning_sentence_gafs(logical_schema, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject pred_consequent_conditional_meaning_sentence_gafs = NIL;
            SubLObject cdolist_list_var = ls_conditional_meaning_sentence_gafs;
            SubLObject gaf = NIL;
            for (gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gaf = cdolist_list_var.first()) {
                {
                    SubLObject consequent_meaning_sentence = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf(gaf, ignore_istsP);
                    SubLObject meaning_sentence_pred = cycl_utilities.formula_operator(consequent_meaning_sentence);
                    if (pred == meaning_sentence_pred) {
                        pred_consequent_conditional_meaning_sentence_gafs = cons(gaf, pred_consequent_conditional_meaning_sentence_gafs);
                    }
                }
            }
            return pred_consequent_conditional_meaning_sentence_gafs;
        }
    }

    @LispMethod(comment = "Returns the conditional meaning sentence GAFs for which LOGICAL-SCHEMA is the consequent logical schema\r\nand PRED is the consequent meaning sentence predicate.\nReturns the conditional meaning sentence GAFs for which LOGICAL-SCHEMA is the consequent logical schema\nand PRED is the consequent meaning sentence predicate.")
    public static SubLObject logical_schema_consequent_conditional_meaning_sentence_gafs_for_pred(final SubLObject logical_schema, final SubLObject pred, SubLObject ignore_istsP) {
        if (ignore_istsP == UNPROVIDED) {
            ignore_istsP = T;
        }
        final SubLObject ls_conditional_meaning_sentence_gafs = logical_schema_consequent_conditional_meaning_sentence_gafs(logical_schema, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject pred_consequent_conditional_meaning_sentence_gafs = NIL;
        SubLObject cdolist_list_var = ls_conditional_meaning_sentence_gafs;
        SubLObject gaf = NIL;
        gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject consequent_meaning_sentence = get_consequent_meaning_sentence_from_gaf(gaf, ignore_istsP);
            final SubLObject meaning_sentence_pred = cycl_utilities.formula_operator(consequent_meaning_sentence);
            if (pred.eql(meaning_sentence_pred)) {
                pred_consequent_conditional_meaning_sentence_gafs = cons(gaf, pred_consequent_conditional_meaning_sentence_gafs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        } 
        return pred_consequent_conditional_meaning_sentence_gafs;
    }/**
     * Returns the conditional meaning sentence GAFs for which LOGICAL-SCHEMA is the consequent logical schema
     * and PRED is the consequent meaning sentence predicate.
     */


    /**
     * Returns the meaning sentences for LOGICAL-SCHEMA for which PRED is the predicate.
     */
    @LispMethod(comment = "Returns the meaning sentences for LOGICAL-SCHEMA for which PRED is the predicate.")
    public static final SubLObject logical_schema_meaning_sentences_for_pred_alt(SubLObject logical_schema, SubLObject pred, SubLObject ignore_istsP, SubLObject unwrap_istsP) {
        if (ignore_istsP == UNPROVIDED) {
            ignore_istsP = T;
        }
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ls_meaning_sentences = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_meaning_sentences(logical_schema, unwrap_istsP, UNPROVIDED, UNPROVIDED);
                SubLObject pred_meaning_sentences = NIL;
                SubLObject cdolist_list_var = ls_meaning_sentences;
                SubLObject meaning_sentence = NIL;
                for (meaning_sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , meaning_sentence = cdolist_list_var.first()) {
                    {
                        SubLObject ms_pred = NIL;
                        if ((NIL != ignore_istsP) && (NIL == unwrap_istsP)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject sentence = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.unwrap_meaning_sentence_if_ist(meaning_sentence);
                                SubLObject mt = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                ms_pred = cycl_utilities.formula_operator(sentence);
                            }
                        } else {
                            ms_pred = cycl_utilities.formula_operator(meaning_sentence);
                        }
                        if (pred == ms_pred) {
                            pred_meaning_sentences = cons(meaning_sentence, pred_meaning_sentences);
                        }
                    }
                }
                return list_utilities.fast_delete_duplicates(pred_meaning_sentences, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    @LispMethod(comment = "Returns the meaning sentences for LOGICAL-SCHEMA for which PRED is the predicate.")
    public static SubLObject logical_schema_meaning_sentences_for_pred(final SubLObject logical_schema, final SubLObject pred, SubLObject ignore_istsP, SubLObject unwrap_istsP) {
        if (ignore_istsP == UNPROVIDED) {
            ignore_istsP = T;
        }
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ls_meaning_sentences = logical_schema_meaning_sentences(logical_schema, unwrap_istsP, UNPROVIDED, UNPROVIDED);
        SubLObject pred_meaning_sentences = NIL;
        SubLObject cdolist_list_var = ls_meaning_sentences;
        SubLObject meaning_sentence = NIL;
        meaning_sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject ms_pred = NIL;
            if ((NIL != ignore_istsP) && (NIL == unwrap_istsP)) {
                thread.resetMultipleValues();
                final SubLObject sentence = unwrap_meaning_sentence_if_ist(meaning_sentence);
                final SubLObject mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                ms_pred = cycl_utilities.formula_operator(sentence);
            } else {
                ms_pred = cycl_utilities.formula_operator(meaning_sentence);
            }
            if (pred.eql(ms_pred)) {
                pred_meaning_sentences = cons(meaning_sentence, pred_meaning_sentences);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meaning_sentence = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(pred_meaning_sentences, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns the meaning sentences for LOGICAL-SCHEMA for which PRED is the predicate.
     */


    /**
     * Returns the consequent meaning sentences for LOGICAL-SCHEMA for which PRED is the predicate.
     */
    @LispMethod(comment = "Returns the consequent meaning sentences for LOGICAL-SCHEMA for which PRED is the predicate.")
    public static final SubLObject logical_schema_consequent_meaning_sentences_for_pred_alt(SubLObject logical_schema, SubLObject pred, SubLObject ignore_istsP, SubLObject unwrap_istsP) {
        if (ignore_istsP == UNPROVIDED) {
            ignore_istsP = T;
        }
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = NIL;
        }
        return list_utilities.fast_delete_duplicates(NIL != unwrap_istsP ? ((SubLObject) (Mapping.mapcar(GET_CONSEQUENT_MEANING_SENTENCE_FROM_GAF_UNWRAPPING_ISTS, com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_consequent_conditional_meaning_sentence_gafs_for_pred(logical_schema, pred, ignore_istsP)))) : Mapping.mapcar(GET_CONSEQUENT_MEANING_SENTENCE_FROM_GAF, com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_consequent_conditional_meaning_sentence_gafs_for_pred(logical_schema, pred, ignore_istsP)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Returns the consequent meaning sentences for LOGICAL-SCHEMA for which PRED is the predicate.")
    public static SubLObject logical_schema_consequent_meaning_sentences_for_pred(final SubLObject logical_schema, final SubLObject pred, SubLObject ignore_istsP, SubLObject unwrap_istsP) {
        if (ignore_istsP == UNPROVIDED) {
            ignore_istsP = T;
        }
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = NIL;
        }
        return list_utilities.fast_delete_duplicates(NIL != unwrap_istsP ? Mapping.mapcar(GET_CONSEQUENT_MEANING_SENTENCE_FROM_GAF_UNWRAPPING_ISTS, logical_schema_consequent_conditional_meaning_sentence_gafs_for_pred(logical_schema, pred, ignore_istsP)) : Mapping.mapcar(GET_CONSEQUENT_MEANING_SENTENCE_FROM_GAF, logical_schema_consequent_conditional_meaning_sentence_gafs_for_pred(logical_schema, pred, ignore_istsP)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns the consequent meaning sentences for LOGICAL-SCHEMA for which PRED is the predicate.
     */


    /**
     * Returns the meaning sentence GAFs for LOGICAL-SCHEMATA for which PRED is the predicate.
     */
    @LispMethod(comment = "Returns the meaning sentence GAFs for LOGICAL-SCHEMATA for which PRED is the predicate.")
    public static final SubLObject logical_schemata_meaning_sentence_gafs_for_pred_alt(SubLObject logical_schemata, SubLObject pred, SubLObject ignore_istsP) {
        if (ignore_istsP == UNPROVIDED) {
            ignore_istsP = T;
        }
        {
            SubLObject meaning_sentence_gafs = NIL;
            SubLObject cdolist_list_var = logical_schemata;
            SubLObject logical_schema = NIL;
            for (logical_schema = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , logical_schema = cdolist_list_var.first()) {
                meaning_sentence_gafs = append(meaning_sentence_gafs, com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_meaning_sentence_gafs_for_pred(logical_schema, pred, ignore_istsP));
            }
            return list_utilities.fast_delete_duplicates(meaning_sentence_gafs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    @LispMethod(comment = "Returns the meaning sentence GAFs for LOGICAL-SCHEMATA for which PRED is the predicate.")
    public static SubLObject logical_schemata_meaning_sentence_gafs_for_pred(final SubLObject logical_schemata, final SubLObject pred, SubLObject ignore_istsP) {
        if (ignore_istsP == UNPROVIDED) {
            ignore_istsP = T;
        }
        SubLObject meaning_sentence_gafs = NIL;
        SubLObject cdolist_list_var = logical_schemata;
        SubLObject logical_schema = NIL;
        logical_schema = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            meaning_sentence_gafs = append(meaning_sentence_gafs, logical_schema_meaning_sentence_gafs_for_pred(logical_schema, pred, ignore_istsP));
            cdolist_list_var = cdolist_list_var.rest();
            logical_schema = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(meaning_sentence_gafs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns the meaning sentence GAFs for LOGICAL-SCHEMATA for which PRED is the predicate.
     */


    /**
     * Returns the conditional meaning sentence GAFs for which some logical schema from LOGICAL-SCHEMATA is the
     * consequent logical schema and PRED is the consequent meaning sentence predicate.
     */
    @LispMethod(comment = "Returns the conditional meaning sentence GAFs for which some logical schema from LOGICAL-SCHEMATA is the\r\nconsequent logical schema and PRED is the consequent meaning sentence predicate.\nReturns the conditional meaning sentence GAFs for which some logical schema from LOGICAL-SCHEMATA is the\nconsequent logical schema and PRED is the consequent meaning sentence predicate.")
    public static final SubLObject logical_schemata_consequent_conditional_meaning_sentence_gafs_for_pred_alt(SubLObject logical_schemata, SubLObject pred, SubLObject ignore_istsP) {
        if (ignore_istsP == UNPROVIDED) {
            ignore_istsP = T;
        }
        {
            SubLObject conditional_meaning_sentence_gafs = NIL;
            SubLObject cdolist_list_var = logical_schemata;
            SubLObject logical_schema = NIL;
            for (logical_schema = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , logical_schema = cdolist_list_var.first()) {
                {
                    SubLObject ls_conditional_ms_gafs = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_consequent_conditional_meaning_sentence_gafs_for_pred(logical_schema, pred, ignore_istsP);
                    conditional_meaning_sentence_gafs = append(ls_conditional_ms_gafs, conditional_meaning_sentence_gafs);
                }
            }
            return list_utilities.fast_delete_duplicates(conditional_meaning_sentence_gafs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    @LispMethod(comment = "Returns the conditional meaning sentence GAFs for which some logical schema from LOGICAL-SCHEMATA is the\r\nconsequent logical schema and PRED is the consequent meaning sentence predicate.\nReturns the conditional meaning sentence GAFs for which some logical schema from LOGICAL-SCHEMATA is the\nconsequent logical schema and PRED is the consequent meaning sentence predicate.")
    public static SubLObject logical_schemata_consequent_conditional_meaning_sentence_gafs_for_pred(final SubLObject logical_schemata, final SubLObject pred, SubLObject ignore_istsP) {
        if (ignore_istsP == UNPROVIDED) {
            ignore_istsP = T;
        }
        SubLObject conditional_meaning_sentence_gafs = NIL;
        SubLObject cdolist_list_var = logical_schemata;
        SubLObject logical_schema = NIL;
        logical_schema = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject ls_conditional_ms_gafs = logical_schema_consequent_conditional_meaning_sentence_gafs_for_pred(logical_schema, pred, ignore_istsP);
            conditional_meaning_sentence_gafs = append(ls_conditional_ms_gafs, conditional_meaning_sentence_gafs);
            cdolist_list_var = cdolist_list_var.rest();
            logical_schema = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(conditional_meaning_sentence_gafs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns the conditional meaning sentence GAFs for which some logical schema from LOGICAL-SCHEMATA is the
     * consequent logical schema and PRED is the consequent meaning sentence predicate.
     */


    /**
     * Returns the preds which appear in meaning sentences for LOGICAL-SCHEMA.
     */
    @LispMethod(comment = "Returns the preds which appear in meaning sentences for LOGICAL-SCHEMA.")
    public static final SubLObject logical_schema_meaning_sentence_preds_alt(SubLObject logical_schema, SubLObject include_logical_field_indexicalsP, SubLObject unwrap_istsP) {
        if (include_logical_field_indexicalsP == UNPROVIDED) {
            include_logical_field_indexicalsP = NIL;
        }
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = T;
        }
        {
            SubLObject ls_meaning_sentences = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_meaning_sentences(logical_schema, NIL, NIL, unwrap_istsP);
            SubLObject preds = NIL;
            SubLObject cdolist_list_var = ls_meaning_sentences;
            SubLObject meaning_sentence = NIL;
            for (meaning_sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , meaning_sentence = cdolist_list_var.first()) {
                {
                    SubLObject pred = cycl_utilities.formula_operator(meaning_sentence);
                    if ((NIL != include_logical_field_indexicalsP) || (NIL == sksi_kb_accessors.logical_field_indexical_p(pred))) {
                        preds = cons(pred, preds);
                    }
                }
            }
            return list_utilities.fast_delete_duplicates(preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    @LispMethod(comment = "Returns the preds which appear in meaning sentences for LOGICAL-SCHEMA.")
    public static SubLObject logical_schema_meaning_sentence_preds(final SubLObject logical_schema, SubLObject include_logical_field_indexicalsP, SubLObject unwrap_istsP) {
        if (include_logical_field_indexicalsP == UNPROVIDED) {
            include_logical_field_indexicalsP = NIL;
        }
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = T;
        }
        final SubLObject ls_meaning_sentences = logical_schema_meaning_sentences(logical_schema, NIL, NIL, unwrap_istsP);
        SubLObject preds = NIL;
        SubLObject cdolist_list_var = ls_meaning_sentences;
        SubLObject meaning_sentence = NIL;
        meaning_sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pred = cycl_utilities.formula_operator(meaning_sentence);
            if ((NIL != include_logical_field_indexicalsP) || (NIL == sksi_kb_accessors.logical_field_indexical_p(pred))) {
                preds = cons(pred, preds);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meaning_sentence = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns the preds which appear in meaning sentences for LOGICAL-SCHEMA.
     */


    public static final SubLObject logical_schema_meaning_sentence_predP_alt(SubLObject logical_schema, SubLObject pred, SubLObject test, SubLObject unwrap_istsP) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQ);
        }
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = T;
        }
        {
            SubLObject ls_meaning_sentences = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_meaning_sentences(logical_schema, NIL, NIL, unwrap_istsP);
            SubLObject predP = NIL;
            if (NIL == predP) {
                {
                    SubLObject csome_list_var = ls_meaning_sentences;
                    SubLObject meaning_sentence = NIL;
                    for (meaning_sentence = csome_list_var.first(); !((NIL != predP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , meaning_sentence = csome_list_var.first()) {
                        predP = funcall(test, pred, cycl_utilities.formula_operator(meaning_sentence));
                    }
                }
            }
            return predP;
        }
    }

    public static SubLObject logical_schema_meaning_sentence_predP(final SubLObject logical_schema, final SubLObject pred, SubLObject test, SubLObject unwrap_istsP) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQ);
        }
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = T;
        }
        final SubLObject ls_meaning_sentences = logical_schema_meaning_sentences(logical_schema, NIL, NIL, unwrap_istsP);
        SubLObject predP = NIL;
        if (NIL == predP) {
            SubLObject csome_list_var;
            SubLObject meaning_sentence;
            for (csome_list_var = ls_meaning_sentences, meaning_sentence = NIL, meaning_sentence = csome_list_var.first(); (NIL == predP) && (NIL != csome_list_var); predP = funcall(test, pred, cycl_utilities.formula_operator(meaning_sentence)) , csome_list_var = csome_list_var.rest() , meaning_sentence = csome_list_var.first()) {
            }
        }
        return predP;
    }

    /**
     * Returns the preds which appear in consequent meaning sentences for LOGICAL-SCHEMA.
     */
    @LispMethod(comment = "Returns the preds which appear in consequent meaning sentences for LOGICAL-SCHEMA.")
    public static final SubLObject logical_schema_consequent_meaning_sentence_preds_alt(SubLObject logical_schema, SubLObject include_logical_field_indexicalsP, SubLObject unwrap_istsP) {
        if (include_logical_field_indexicalsP == UNPROVIDED) {
            include_logical_field_indexicalsP = NIL;
        }
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = T;
        }
        {
            SubLObject ls_consequent_meaning_sentences = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_consequent_meaning_sentences(logical_schema, NIL, NIL, NIL, NIL, unwrap_istsP);
            SubLObject preds = NIL;
            SubLObject cdolist_list_var = ls_consequent_meaning_sentences;
            SubLObject meaning_sentence = NIL;
            for (meaning_sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , meaning_sentence = cdolist_list_var.first()) {
                {
                    SubLObject pred = cycl_utilities.formula_operator(meaning_sentence);
                    if ((NIL != include_logical_field_indexicalsP) || (NIL == sksi_kb_accessors.logical_field_indexical_p(pred))) {
                        preds = cons(pred, preds);
                    }
                }
            }
            return list_utilities.fast_delete_duplicates(preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    @LispMethod(comment = "Returns the preds which appear in consequent meaning sentences for LOGICAL-SCHEMA.")
    public static SubLObject logical_schema_consequent_meaning_sentence_preds(final SubLObject logical_schema, SubLObject include_logical_field_indexicalsP, SubLObject unwrap_istsP) {
        if (include_logical_field_indexicalsP == UNPROVIDED) {
            include_logical_field_indexicalsP = NIL;
        }
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = T;
        }
        final SubLObject ls_consequent_meaning_sentences = logical_schema_consequent_meaning_sentences(logical_schema, NIL, NIL, NIL, NIL, unwrap_istsP);
        SubLObject preds = NIL;
        SubLObject cdolist_list_var = ls_consequent_meaning_sentences;
        SubLObject meaning_sentence = NIL;
        meaning_sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pred = cycl_utilities.formula_operator(meaning_sentence);
            if ((NIL != include_logical_field_indexicalsP) || (NIL == sksi_kb_accessors.logical_field_indexical_p(pred))) {
                preds = cons(pred, preds);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meaning_sentence = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns the preds which appear in consequent meaning sentences for LOGICAL-SCHEMA.
     */


    public static final SubLObject logical_schema_consequent_meaning_sentence_predP_alt(SubLObject logical_schema, SubLObject pred, SubLObject test, SubLObject unwrap_istsP) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQ);
        }
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = T;
        }
        {
            SubLObject ls_consequent_meaning_sentences = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_consequent_meaning_sentences(logical_schema, NIL, NIL, NIL, NIL, unwrap_istsP);
            SubLObject predP = NIL;
            if (NIL == predP) {
                {
                    SubLObject csome_list_var = ls_consequent_meaning_sentences;
                    SubLObject meaning_sentence = NIL;
                    for (meaning_sentence = csome_list_var.first(); !((NIL != predP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , meaning_sentence = csome_list_var.first()) {
                        predP = funcall(test, pred, cycl_utilities.formula_operator(meaning_sentence));
                    }
                }
            }
            return predP;
        }
    }

    public static SubLObject logical_schema_consequent_meaning_sentence_predP(final SubLObject logical_schema, final SubLObject pred, SubLObject test, SubLObject unwrap_istsP) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQ);
        }
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = T;
        }
        final SubLObject ls_consequent_meaning_sentences = logical_schema_consequent_meaning_sentences(logical_schema, NIL, NIL, NIL, NIL, unwrap_istsP);
        SubLObject predP = NIL;
        if (NIL == predP) {
            SubLObject csome_list_var;
            SubLObject meaning_sentence;
            for (csome_list_var = ls_consequent_meaning_sentences, meaning_sentence = NIL, meaning_sentence = csome_list_var.first(); (NIL == predP) && (NIL != csome_list_var); predP = funcall(test, pred, cycl_utilities.formula_operator(meaning_sentence)) , csome_list_var = csome_list_var.rest() , meaning_sentence = csome_list_var.first()) {
            }
        }
        return predP;
    }

    public static final SubLObject logical_schema_all_relevant_preds_alt(SubLObject logical_schema, SubLObject unwrap_istsP) {
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = T;
        }
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_all_relevant_preds_memoized(logical_schema, unwrap_istsP, mt_relevance_macros.mt_info(UNPROVIDED));
    }

    public static SubLObject logical_schema_all_relevant_preds(final SubLObject logical_schema, SubLObject unwrap_istsP) {
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = T;
        }
        return logical_schema_all_relevant_preds_memoized(logical_schema, unwrap_istsP, mt_relevance_macros.mt_info(UNPROVIDED));
    }

    public static final SubLObject logical_schema_all_relevant_preds_memoized_internal_alt(SubLObject logical_schema, SubLObject unwrap_istsP, SubLObject mt_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject ms_lfis = list_utilities.partition_list(append(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_meaning_sentence_preds(logical_schema, T, unwrap_istsP), com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_consequent_meaning_sentence_preds(logical_schema, T, unwrap_istsP)), LOGICAL_FIELD_INDEXICAL_P);
                SubLObject ms_preds = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                {
                    SubLObject cms_lfis = list_utilities.partition_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_consequent_meaning_sentence_preds(logical_schema, T, unwrap_istsP), LOGICAL_FIELD_INDEXICAL_P);
                    SubLObject cms_preds = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject preds = append(ms_preds, cms_preds);
                        SubLObject cdolist_list_var = union(ms_lfis, cms_lfis, symbol_function(EQ), UNPROVIDED);
                        SubLObject lfi = NIL;
                        for (lfi = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lfi = cdolist_list_var.first()) {
                            preds = append(preds, com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.sksi_code_mapping_predicates_for_logical_field_indexical(lfi, mt_info));
                        }
                        return list_utilities.fast_delete_duplicates(preds, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
        }
    }

    public static SubLObject logical_schema_all_relevant_preds_memoized_internal(final SubLObject logical_schema, final SubLObject unwrap_istsP, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject ms_lfis = list_utilities.partition_list(append(logical_schema_meaning_sentence_preds(logical_schema, T, unwrap_istsP), logical_schema_consequent_meaning_sentence_preds(logical_schema, T, unwrap_istsP)), LOGICAL_FIELD_INDEXICAL_P);
        final SubLObject ms_preds = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject cms_lfis = list_utilities.partition_list(logical_schema_consequent_meaning_sentence_preds(logical_schema, T, unwrap_istsP), LOGICAL_FIELD_INDEXICAL_P);
        final SubLObject cms_preds = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject preds = append(ms_preds, cms_preds);
        SubLObject cdolist_list_var = union(ms_lfis, cms_lfis, symbol_function(EQ), UNPROVIDED);
        SubLObject lfi = NIL;
        lfi = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            preds = append(preds, sksi_code_mapping_predicates_for_logical_field_indexical(lfi, mt_info));
            cdolist_list_var = cdolist_list_var.rest();
            lfi = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(preds, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject logical_schema_all_relevant_preds_memoized_alt(SubLObject logical_schema, SubLObject unwrap_istsP, SubLObject mt_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_all_relevant_preds_memoized_internal(logical_schema, unwrap_istsP, mt_info);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, LOGICAL_SCHEMA_ALL_RELEVANT_PREDS_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), LOGICAL_SCHEMA_ALL_RELEVANT_PREDS_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, LOGICAL_SCHEMA_ALL_RELEVANT_PREDS_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(logical_schema, unwrap_istsP, mt_info);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw18$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (logical_schema.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (unwrap_istsP.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.logical_schema_all_relevant_preds_memoized_internal(logical_schema, unwrap_istsP, mt_info)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(logical_schema, unwrap_istsP, mt_info));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject logical_schema_all_relevant_preds_memoized(final SubLObject logical_schema, final SubLObject unwrap_istsP, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return logical_schema_all_relevant_preds_memoized_internal(logical_schema, unwrap_istsP, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, LOGICAL_SCHEMA_ALL_RELEVANT_PREDS_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), LOGICAL_SCHEMA_ALL_RELEVANT_PREDS_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, LOGICAL_SCHEMA_ALL_RELEVANT_PREDS_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(logical_schema, unwrap_istsP, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (logical_schema.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (unwrap_istsP.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(logical_schema_all_relevant_preds_memoized_internal(logical_schema, unwrap_istsP, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(logical_schema, unwrap_istsP, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject sksi_code_mapping_predicates_for_logical_field_indexical_internal_alt(SubLObject logical_field_indexical, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        {
            SubLObject decodings = sksi_field_translation_utilities.generate_decoding_compositions_for_logical_field_indexical(logical_field_indexical, UNPROVIDED, UNPROVIDED);
            SubLObject preds = NIL;
            SubLObject cdolist_list_var = decodings;
            SubLObject decoding = NIL;
            for (decoding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , decoding = cdolist_list_var.first()) {
                if ((NIL != sksi_kb_accessors.schema_object_fn_expression_p(decoding)) || (NIL != sksi_kb_accessors.source_schema_object_fn_expression_p(decoding))) {
                    {
                        SubLObject code_mapping_schema = (NIL != sksi_kb_accessors.schema_object_fn_expression_p(decoding)) ? ((SubLObject) (cycl_utilities.formula_arg1(decoding, UNPROVIDED))) : cycl_utilities.formula_arg2(decoding, UNPROVIDED);
                        if (NIL != forts.fort_p(code_mapping_schema)) {
                            preds = append(preds, sksi_kb_accessors.cycl_terms_mapped_to_by_code_mapping_schema(code_mapping_schema));
                        }
                    }
                }
            }
            return preds;
        }
    }

    public static SubLObject sksi_code_mapping_predicates_for_logical_field_indexical_internal(final SubLObject logical_field_indexical, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        final SubLObject decodings = sksi_field_translation_utilities.generate_decoding_compositions_for_logical_field_indexical(logical_field_indexical, UNPROVIDED, UNPROVIDED);
        SubLObject preds = NIL;
        SubLObject cdolist_list_var = decodings;
        SubLObject decoding = NIL;
        decoding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != sksi_kb_accessors.schema_object_fn_expression_p(decoding)) || (NIL != sksi_kb_accessors.source_schema_object_fn_expression_p(decoding))) {
                final SubLObject code_mapping_schema = (NIL != sksi_kb_accessors.schema_object_fn_expression_p(decoding)) ? cycl_utilities.formula_arg1(decoding, UNPROVIDED) : cycl_utilities.formula_arg2(decoding, UNPROVIDED);
                if (NIL != forts.fort_p(code_mapping_schema)) {
                    preds = append(preds, sksi_kb_accessors.cycl_terms_mapped_to_by_code_mapping_schema(code_mapping_schema));
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            decoding = cdolist_list_var.first();
        } 
        return preds;
    }

    public static final SubLObject sksi_code_mapping_predicates_for_logical_field_indexical_alt(SubLObject logical_field_indexical, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.sksi_code_mapping_predicates_for_logical_field_indexical_internal(logical_field_indexical, mt_info);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_CODE_MAPPING_PREDICATES_FOR_LOGICAL_FIELD_INDEXICAL, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_CODE_MAPPING_PREDICATES_FOR_LOGICAL_FIELD_INDEXICAL, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, SKSI_CODE_MAPPING_PREDICATES_FOR_LOGICAL_FIELD_INDEXICAL, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(logical_field_indexical, mt_info);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw18$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (logical_field_indexical.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.sksi_code_mapping_predicates_for_logical_field_indexical_internal(logical_field_indexical, mt_info)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(logical_field_indexical, mt_info));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject sksi_code_mapping_predicates_for_logical_field_indexical(final SubLObject logical_field_indexical, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_code_mapping_predicates_for_logical_field_indexical_internal(logical_field_indexical, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_CODE_MAPPING_PREDICATES_FOR_LOGICAL_FIELD_INDEXICAL, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_CODE_MAPPING_PREDICATES_FOR_LOGICAL_FIELD_INDEXICAL, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SKSI_CODE_MAPPING_PREDICATES_FOR_LOGICAL_FIELD_INDEXICAL, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(logical_field_indexical, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (logical_field_indexical.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_code_mapping_predicates_for_logical_field_indexical_internal(logical_field_indexical, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(logical_field_indexical, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject meaning_sentences_type_check_alt(SubLObject lit, SubLObject meaning_sentences, SubLObject memoizeP, SubLObject mt, SubLObject meta_mt, SubLObject strength) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (meta_mt == UNPROVIDED) {
            meta_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (strength == UNPROVIDED) {
            strength = $ROBUST;
        }
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = meaning_sentences;
            SubLObject ms = NIL;
            for (ms = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ms = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.meaning_sentence_type_check(lit, ms, memoizeP, mt, meta_mt, strength, UNPROVIDED, UNPROVIDED)) {
                    result = cons(ms, result);
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject meaning_sentences_type_check(final SubLObject lit, final SubLObject meaning_sentences, SubLObject memoizeP, SubLObject mt, SubLObject meta_mt, SubLObject strength) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (meta_mt == UNPROVIDED) {
            meta_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (strength == UNPROVIDED) {
            strength = $ROBUST;
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = meaning_sentences;
        SubLObject ms = NIL;
        ms = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != meaning_sentence_type_check(lit, ms, memoizeP, mt, meta_mt, strength, UNPROVIDED, UNPROVIDED)) {
                result = cons(ms, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ms = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    /**
     * Does the literal LIT meet the type constraints of the meaning sentence MEANING-SENTENCE?
     * MT is the mt in which the type checking should be done (e.g., a content mt); META-MT is
     * the mt in which the patterns should be generated (e.g., a mapping mt).
     */
    @LispMethod(comment = "Does the literal LIT meet the type constraints of the meaning sentence MEANING-SENTENCE?\r\nMT is the mt in which the type checking should be done (e.g., a content mt); META-MT is\r\nthe mt in which the patterns should be generated (e.g., a mapping mt).\nDoes the literal LIT meet the type constraints of the meaning sentence MEANING-SENTENCE?\nMT is the mt in which the type checking should be done (e.g., a content mt); META-MT is\nthe mt in which the patterns should be generated (e.g., a mapping mt).")
    public static final SubLObject meaning_sentence_type_check_alt(SubLObject lit, SubLObject meaning_sentence, SubLObject memoizeP, SubLObject mt, SubLObject meta_mt, SubLObject strength, SubLObject memoize_meaning_sentence_patternP, SubLObject use_memoized_isaP) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (meta_mt == UNPROVIDED) {
            meta_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (strength == UNPROVIDED) {
            strength = $ROBUST;
        }
        if (memoize_meaning_sentence_patternP == UNPROVIDED) {
            memoize_meaning_sentence_patternP = NIL;
        }
        if (use_memoized_isaP == UNPROVIDED) {
            use_memoized_isaP = NIL;
        }
        return NIL != memoizeP ? ((SubLObject) (com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.meaning_sentence_type_check_memoized(lit, meaning_sentence, mt, meta_mt, strength, use_memoized_isaP))) : com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.meaning_sentence_type_check_int(lit, meaning_sentence, mt, meta_mt, strength, NIL, memoize_meaning_sentence_patternP, use_memoized_isaP);
    }

    @LispMethod(comment = "Does the literal LIT meet the type constraints of the meaning sentence MEANING-SENTENCE?\r\nMT is the mt in which the type checking should be done (e.g., a content mt); META-MT is\r\nthe mt in which the patterns should be generated (e.g., a mapping mt).\nDoes the literal LIT meet the type constraints of the meaning sentence MEANING-SENTENCE?\nMT is the mt in which the type checking should be done (e.g., a content mt); META-MT is\nthe mt in which the patterns should be generated (e.g., a mapping mt).")
    public static SubLObject meaning_sentence_type_check(final SubLObject lit, final SubLObject meaning_sentence, SubLObject memoizeP, SubLObject mt, SubLObject meta_mt, SubLObject strength, SubLObject memoize_meaning_sentence_patternP, SubLObject use_memoized_isaP) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (meta_mt == UNPROVIDED) {
            meta_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (strength == UNPROVIDED) {
            strength = $ROBUST;
        }
        if (memoize_meaning_sentence_patternP == UNPROVIDED) {
            memoize_meaning_sentence_patternP = NIL;
        }
        if (use_memoized_isaP == UNPROVIDED) {
            use_memoized_isaP = NIL;
        }
        return NIL != memoizeP ? meaning_sentence_type_check_memoized(lit, meaning_sentence, mt, meta_mt, strength, use_memoized_isaP) : meaning_sentence_type_check_int(lit, meaning_sentence, mt, meta_mt, strength, NIL, memoize_meaning_sentence_patternP, use_memoized_isaP);
    }/**
     * Does the literal LIT meet the type constraints of the meaning sentence MEANING-SENTENCE?
     * MT is the mt in which the type checking should be done (e.g., a content mt); META-MT is
     * the mt in which the patterns should be generated (e.g., a mapping mt).
     */


    public static final SubLObject meaning_sentence_type_check_memoized_internal_alt(SubLObject lit, SubLObject meaning_sentence, SubLObject mt, SubLObject meta_mt, SubLObject strength, SubLObject use_memoized_isaP) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.meaning_sentence_type_check_int(lit, meaning_sentence, mt, meta_mt, strength, T, NIL, use_memoized_isaP);
    }

    public static SubLObject meaning_sentence_type_check_memoized_internal(final SubLObject lit, final SubLObject meaning_sentence, final SubLObject mt, final SubLObject meta_mt, final SubLObject strength, final SubLObject use_memoized_isaP) {
        return meaning_sentence_type_check_int(lit, meaning_sentence, mt, meta_mt, strength, T, NIL, use_memoized_isaP);
    }

    public static final SubLObject meaning_sentence_type_check_memoized_alt(SubLObject lit, SubLObject meaning_sentence, SubLObject mt, SubLObject meta_mt, SubLObject strength, SubLObject use_memoized_isaP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.meaning_sentence_type_check_memoized_internal(lit, meaning_sentence, mt, meta_mt, strength, use_memoized_isaP);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MEANING_SENTENCE_TYPE_CHECK_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MEANING_SENTENCE_TYPE_CHECK_MEMOIZED, SIX_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, MEANING_SENTENCE_TYPE_CHECK_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_6(lit, meaning_sentence, mt, meta_mt, strength, use_memoized_isaP);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw18$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (lit.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (meaning_sentence.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (mt.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (meta_mt.equal(cached_args.first())) {
                                                    cached_args = cached_args.rest();
                                                    if (strength.equal(cached_args.first())) {
                                                        cached_args = cached_args.rest();
                                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && use_memoized_isaP.equal(cached_args.first())) {
                                                            return memoization_state.caching_results(results2);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.meaning_sentence_type_check_memoized_internal(lit, meaning_sentence, mt, meta_mt, strength, use_memoized_isaP)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(lit, meaning_sentence, mt, meta_mt, strength, use_memoized_isaP));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject meaning_sentence_type_check_memoized(final SubLObject lit, final SubLObject meaning_sentence, final SubLObject mt, final SubLObject meta_mt, final SubLObject strength, final SubLObject use_memoized_isaP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return meaning_sentence_type_check_memoized_internal(lit, meaning_sentence, mt, meta_mt, strength, use_memoized_isaP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MEANING_SENTENCE_TYPE_CHECK_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MEANING_SENTENCE_TYPE_CHECK_MEMOIZED, SIX_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, MEANING_SENTENCE_TYPE_CHECK_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(lit, meaning_sentence, mt, meta_mt, strength, use_memoized_isaP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (lit.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (meaning_sentence.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (meta_mt.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (strength.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && use_memoized_isaP.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(meaning_sentence_type_check_memoized_internal(lit, meaning_sentence, mt, meta_mt, strength, use_memoized_isaP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(lit, meaning_sentence, mt, meta_mt, strength, use_memoized_isaP));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject meaning_sentence_type_check_int_alt(SubLObject lit, SubLObject meaning_sentence, SubLObject mt, SubLObject meta_mt, SubLObject strength, SubLObject memoize_patternsP, SubLObject memoize_meaning_sentence_patternP, SubLObject use_memoized_isaP) {
        if (memoize_patternsP == UNPROVIDED) {
            memoize_patternsP = NIL;
        }
        if (memoize_meaning_sentence_patternP == UNPROVIDED) {
            memoize_meaning_sentence_patternP = NIL;
        }
        if (use_memoized_isaP == UNPROVIDED) {
            use_memoized_isaP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pattern_matchedP = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject ms_formula = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.unwrap_meaning_sentence_if_ist(meaning_sentence);
                    SubLObject ms_mt = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject mt_var = mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                if ((NIL == ms_mt) || (NIL != mt_relevance_macros.relevant_mtP(ms_mt))) {
                                    {
                                        SubLObject pattern = (NIL != memoize_meaning_sentence_patternP) ? ((SubLObject) (com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.generate_pattern_for_meaning_sentence_memoized(ms_formula, memoize_patternsP, meta_mt, strength, use_memoized_isaP, UNPROVIDED))) : com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.generate_pattern_for_meaning_sentence(ms_formula, memoize_patternsP, meta_mt, strength, use_memoized_isaP);
                                        pattern_matchedP = formula_pattern_match.pattern_matches_formula_without_bindings(pattern, lit);
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return pattern_matchedP;
            }
        }
    }

    public static SubLObject meaning_sentence_type_check_int(final SubLObject lit, final SubLObject meaning_sentence, final SubLObject mt, final SubLObject meta_mt, final SubLObject strength, SubLObject memoize_patternsP, SubLObject memoize_meaning_sentence_patternP, SubLObject use_memoized_isaP) {
        if (memoize_patternsP == UNPROVIDED) {
            memoize_patternsP = NIL;
        }
        if (memoize_meaning_sentence_patternP == UNPROVIDED) {
            memoize_meaning_sentence_patternP = NIL;
        }
        if (use_memoized_isaP == UNPROVIDED) {
            use_memoized_isaP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pattern_matchedP = NIL;
        thread.resetMultipleValues();
        final SubLObject ms_formula = unwrap_meaning_sentence_if_ist(meaning_sentence);
        final SubLObject ms_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            if ((NIL == ms_mt) || (NIL != mt_relevance_macros.relevant_mtP(ms_mt))) {
                final SubLObject pattern = (NIL != memoize_meaning_sentence_patternP) ? generate_pattern_for_meaning_sentence_memoized(ms_formula, memoize_patternsP, meta_mt, strength, use_memoized_isaP, UNPROVIDED) : generate_pattern_for_meaning_sentence(ms_formula, memoize_patternsP, meta_mt, strength, use_memoized_isaP);
                pattern_matchedP = formula_pattern_match.pattern_matches_formula_without_bindings(pattern, lit);
                if ((NIL == pattern_matchedP) && (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(NINE_INTEGER))) {
                    format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str52$__SKSI__A_, $str53$meaning_sentence_type_check_int_f), new SubLObject[]{ NINE_INTEGER, lit, meaning_sentence });
                    force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return pattern_matchedP;
    }

    public static final SubLObject meaning_sentence_arg_type_check_alt(SubLObject args, SubLObject meaning_sentence, SubLObject memoizeP, SubLObject mt, SubLObject meta_mt, SubLObject strength) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (meta_mt == UNPROVIDED) {
            meta_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (strength == UNPROVIDED) {
            strength = $ROBUST;
        }
        return NIL != memoizeP ? ((SubLObject) (com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.meaning_sentence_arg_type_check_memoized(args, meaning_sentence, mt, meta_mt, strength))) : com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.meaning_sentence_arg_type_check_int(args, meaning_sentence, mt, meta_mt, strength, UNPROVIDED);
    }

    public static SubLObject meaning_sentence_arg_type_check(final SubLObject args, final SubLObject meaning_sentence, SubLObject memoizeP, SubLObject mt, SubLObject meta_mt, SubLObject strength) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (meta_mt == UNPROVIDED) {
            meta_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (strength == UNPROVIDED) {
            strength = $ROBUST;
        }
        return NIL != memoizeP ? meaning_sentence_arg_type_check_memoized(args, meaning_sentence, mt, meta_mt, strength) : meaning_sentence_arg_type_check_int(args, meaning_sentence, mt, meta_mt, strength, UNPROVIDED);
    }

    public static final SubLObject meaning_sentence_arg_type_check_memoized_internal_alt(SubLObject args, SubLObject meaning_sentence, SubLObject mt, SubLObject meta_mt, SubLObject strength) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.meaning_sentence_arg_type_check_int(args, meaning_sentence, mt, meta_mt, strength, T);
    }

    public static SubLObject meaning_sentence_arg_type_check_memoized_internal(final SubLObject args, final SubLObject meaning_sentence, final SubLObject mt, final SubLObject meta_mt, final SubLObject strength) {
        return meaning_sentence_arg_type_check_int(args, meaning_sentence, mt, meta_mt, strength, T);
    }

    public static final SubLObject meaning_sentence_arg_type_check_memoized_alt(SubLObject args, SubLObject meaning_sentence, SubLObject mt, SubLObject meta_mt, SubLObject strength) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.meaning_sentence_arg_type_check_memoized_internal(args, meaning_sentence, mt, meta_mt, strength);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MEANING_SENTENCE_ARG_TYPE_CHECK_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MEANING_SENTENCE_ARG_TYPE_CHECK_MEMOIZED, FIVE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, MEANING_SENTENCE_ARG_TYPE_CHECK_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_5(args, meaning_sentence, mt, meta_mt, strength);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw18$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (args.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (meaning_sentence.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (mt.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (meta_mt.equal(cached_args.first())) {
                                                    cached_args = cached_args.rest();
                                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && strength.equal(cached_args.first())) {
                                                        return memoization_state.caching_results(results2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.meaning_sentence_arg_type_check_memoized_internal(args, meaning_sentence, mt, meta_mt, strength)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(args, meaning_sentence, mt, meta_mt, strength));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject meaning_sentence_arg_type_check_memoized(final SubLObject args, final SubLObject meaning_sentence, final SubLObject mt, final SubLObject meta_mt, final SubLObject strength) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return meaning_sentence_arg_type_check_memoized_internal(args, meaning_sentence, mt, meta_mt, strength);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MEANING_SENTENCE_ARG_TYPE_CHECK_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MEANING_SENTENCE_ARG_TYPE_CHECK_MEMOIZED, FIVE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, MEANING_SENTENCE_ARG_TYPE_CHECK_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(args, meaning_sentence, mt, meta_mt, strength);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (args.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (meaning_sentence.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (meta_mt.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && strength.equal(cached_args.first())) {
                                    return memoization_state.caching_results(results2);
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(meaning_sentence_arg_type_check_memoized_internal(args, meaning_sentence, mt, meta_mt, strength)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(args, meaning_sentence, mt, meta_mt, strength));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject meaning_sentence_arg_type_check_int_alt(SubLObject args, SubLObject meaning_sentence, SubLObject mt, SubLObject meta_mt, SubLObject strength, SubLObject memoize_patternsP) {
        if (memoize_patternsP == UNPROVIDED) {
            memoize_patternsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ms_args = cycl_utilities.formula_args(meaning_sentence, UNPROVIDED);
                SubLObject pattern = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.generate_pattern_for_meaning_sentence_args(ms_args, memoize_patternsP, meta_mt, strength, UNPROVIDED, UNPROVIDED);
                SubLObject pattern_matchedP = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        pattern_matchedP = formula_pattern_match.pattern_matches_formula_without_bindings(pattern, args);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return pattern_matchedP;
            }
        }
    }

    public static SubLObject meaning_sentence_arg_type_check_int(final SubLObject args, final SubLObject meaning_sentence, final SubLObject mt, final SubLObject meta_mt, final SubLObject strength, SubLObject memoize_patternsP) {
        if (memoize_patternsP == UNPROVIDED) {
            memoize_patternsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ms_args = cycl_utilities.formula_args(meaning_sentence, UNPROVIDED);
        final SubLObject pattern = generate_pattern_for_meaning_sentence_args(ms_args, memoize_patternsP, meta_mt, strength, UNPROVIDED, UNPROVIDED);
        SubLObject pattern_matchedP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            pattern_matchedP = formula_pattern_match.pattern_matches_formula_without_bindings(pattern, args);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return pattern_matchedP;
    }

    public static final SubLObject meaning_sentence_gaf_type_check_alt(SubLObject lit, SubLObject meaning_sentence_gaf, SubLObject memoizeP, SubLObject mt, SubLObject meta_mt, SubLObject strength) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (meta_mt == UNPROVIDED) {
            meta_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (strength == UNPROVIDED) {
            strength = $ROBUST;
        }
        {
            SubLObject meaning_sentence = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.get_relevant_meaning_sentence_from_gaf(meaning_sentence_gaf, UNPROVIDED);
            return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.meaning_sentence_type_check(lit, meaning_sentence, memoizeP, mt, meta_mt, strength, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject meaning_sentence_gaf_type_check(final SubLObject lit, final SubLObject meaning_sentence_gaf, SubLObject memoizeP, SubLObject mt, SubLObject meta_mt, SubLObject strength) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (meta_mt == UNPROVIDED) {
            meta_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (strength == UNPROVIDED) {
            strength = $ROBUST;
        }
        final SubLObject meaning_sentence = get_relevant_meaning_sentence_from_gaf(meaning_sentence_gaf, UNPROVIDED);
        return meaning_sentence_type_check(lit, meaning_sentence, memoizeP, mt, meta_mt, strength, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject meaning_sentence_gafs_type_check_alt(SubLObject lit, SubLObject meaning_sentence_gafs, SubLObject memoizeP, SubLObject mt, SubLObject meta_mt, SubLObject strength) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (meta_mt == UNPROVIDED) {
            meta_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (strength == UNPROVIDED) {
            strength = $ROBUST;
        }
        {
            SubLObject new_gafs = NIL;
            SubLObject cdolist_list_var = meaning_sentence_gafs;
            SubLObject gaf = NIL;
            for (gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gaf = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.meaning_sentence_gaf_type_check(lit, gaf, memoizeP, mt, meta_mt, strength)) {
                    new_gafs = cons(gaf, new_gafs);
                }
            }
            return nreverse(new_gafs);
        }
    }

    public static SubLObject meaning_sentence_gafs_type_check(final SubLObject lit, final SubLObject meaning_sentence_gafs, SubLObject memoizeP, SubLObject mt, SubLObject meta_mt, SubLObject strength) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (meta_mt == UNPROVIDED) {
            meta_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (strength == UNPROVIDED) {
            strength = $ROBUST;
        }
        SubLObject new_gafs = NIL;
        SubLObject cdolist_list_var = meaning_sentence_gafs;
        SubLObject gaf = NIL;
        gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != meaning_sentence_gaf_type_check(lit, gaf, memoizeP, mt, meta_mt, strength)) {
                new_gafs = cons(gaf, new_gafs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        } 
        return nreverse(new_gafs);
    }

    public static final SubLObject generate_robust_pattern_for_meaning_sentence_alt(SubLObject meaning_sentence, SubLObject memoizeP, SubLObject mt) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.generate_pattern_for_meaning_sentence(meaning_sentence, memoizeP, mt, $ROBUST, UNPROVIDED);
    }

    public static SubLObject generate_robust_pattern_for_meaning_sentence(final SubLObject meaning_sentence, SubLObject memoizeP, SubLObject mt) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return generate_pattern_for_meaning_sentence(meaning_sentence, memoizeP, mt, $ROBUST, UNPROVIDED);
    }

    public static final SubLObject generate_robust_pattern_for_meaning_sentence_args_alt(SubLObject meaning_sentence_args, SubLObject memoizeP, SubLObject mt) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.generate_pattern_for_meaning_sentence_args(meaning_sentence_args, memoizeP, mt, $ROBUST, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject generate_robust_pattern_for_meaning_sentence_args(final SubLObject meaning_sentence_args, SubLObject memoizeP, SubLObject mt) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return generate_pattern_for_meaning_sentence_args(meaning_sentence_args, memoizeP, mt, $ROBUST, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject generate_weak_pattern_for_meaning_sentence_alt(SubLObject meaning_sentence, SubLObject memoizeP, SubLObject mt) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.generate_pattern_for_meaning_sentence(meaning_sentence, memoizeP, mt, $WEAK, UNPROVIDED);
    }

    public static SubLObject generate_weak_pattern_for_meaning_sentence(final SubLObject meaning_sentence, SubLObject memoizeP, SubLObject mt) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return generate_pattern_for_meaning_sentence(meaning_sentence, memoizeP, mt, $WEAK, UNPROVIDED);
    }

    public static final SubLObject generate_strict_pattern_for_meaning_sentence_alt(SubLObject meaning_sentence, SubLObject memoizeP, SubLObject mt) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.generate_pattern_for_meaning_sentence(meaning_sentence, memoizeP, mt, $STRICT, UNPROVIDED);
    }

    public static SubLObject generate_strict_pattern_for_meaning_sentence(final SubLObject meaning_sentence, SubLObject memoizeP, SubLObject mt) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return generate_pattern_for_meaning_sentence(meaning_sentence, memoizeP, mt, $STRICT, UNPROVIDED);
    }

    public static final SubLObject generate_strict_pattern_for_meaning_sentence_args_alt(SubLObject meaning_sentence_args, SubLObject memoizeP, SubLObject mt) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.generate_pattern_for_meaning_sentence_args(meaning_sentence_args, memoizeP, mt, $STRICT, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject generate_strict_pattern_for_meaning_sentence_args(final SubLObject meaning_sentence_args, SubLObject memoizeP, SubLObject mt) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return generate_pattern_for_meaning_sentence_args(meaning_sentence_args, memoizeP, mt, $STRICT, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject generate_strict_pattern_for_meaning_sentence_arg_alt(SubLObject meaning_sentence_arg, SubLObject memoizeP, SubLObject mt) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.generate_pattern_for_meaning_sentence_arg(meaning_sentence_arg, memoizeP, mt, $STRICT, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject generate_strict_pattern_for_meaning_sentence_arg(final SubLObject meaning_sentence_arg, SubLObject memoizeP, SubLObject mt) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return generate_pattern_for_meaning_sentence_arg(meaning_sentence_arg, memoizeP, mt, $STRICT, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject generate_pedantic_pattern_for_meaning_sentence_alt(SubLObject meaning_sentence, SubLObject memoizeP, SubLObject mt) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.generate_pattern_for_meaning_sentence(meaning_sentence, memoizeP, mt, $PEDANTIC, UNPROVIDED);
    }

    public static SubLObject generate_pedantic_pattern_for_meaning_sentence(final SubLObject meaning_sentence, SubLObject memoizeP, SubLObject mt) {
        if (memoizeP == UNPROVIDED) {
            memoizeP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return generate_pattern_for_meaning_sentence(meaning_sentence, memoizeP, mt, $PEDANTIC, UNPROVIDED);
    }

    public static final SubLObject generate_pattern_for_meaning_sentence_memoized_internal_alt(SubLObject meaning_sentence, SubLObject memoizeP, SubLObject mt, SubLObject strength, SubLObject use_memoized_isaP, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.generate_pattern_for_meaning_sentence(meaning_sentence, memoizeP, mt, strength, use_memoized_isaP);
    }

    public static SubLObject generate_pattern_for_meaning_sentence_memoized_internal(final SubLObject meaning_sentence, final SubLObject memoizeP, final SubLObject mt, final SubLObject strength, final SubLObject use_memoized_isaP, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return generate_pattern_for_meaning_sentence(meaning_sentence, memoizeP, mt, strength, use_memoized_isaP);
    }

    public static final SubLObject generate_pattern_for_meaning_sentence_memoized_alt(SubLObject meaning_sentence, SubLObject memoizeP, SubLObject mt, SubLObject strength, SubLObject use_memoized_isaP, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.generate_pattern_for_meaning_sentence_memoized_internal(meaning_sentence, memoizeP, mt, strength, use_memoized_isaP, mt_info);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, GENERATE_PATTERN_FOR_MEANING_SENTENCE_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), GENERATE_PATTERN_FOR_MEANING_SENTENCE_MEMOIZED, SIX_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, GENERATE_PATTERN_FOR_MEANING_SENTENCE_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_6(meaning_sentence, memoizeP, mt, strength, use_memoized_isaP, mt_info);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw18$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (meaning_sentence.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (memoizeP.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (mt.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (strength.equal(cached_args.first())) {
                                                    cached_args = cached_args.rest();
                                                    if (use_memoized_isaP.equal(cached_args.first())) {
                                                        cached_args = cached_args.rest();
                                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                                            return memoization_state.caching_results(results2);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.generate_pattern_for_meaning_sentence_memoized_internal(meaning_sentence, memoizeP, mt, strength, use_memoized_isaP, mt_info)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(meaning_sentence, memoizeP, mt, strength, use_memoized_isaP, mt_info));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject generate_pattern_for_meaning_sentence_memoized(final SubLObject meaning_sentence, final SubLObject memoizeP, final SubLObject mt, final SubLObject strength, final SubLObject use_memoized_isaP, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return generate_pattern_for_meaning_sentence_memoized_internal(meaning_sentence, memoizeP, mt, strength, use_memoized_isaP, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, GENERATE_PATTERN_FOR_MEANING_SENTENCE_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), GENERATE_PATTERN_FOR_MEANING_SENTENCE_MEMOIZED, SIX_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, GENERATE_PATTERN_FOR_MEANING_SENTENCE_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(meaning_sentence, memoizeP, mt, strength, use_memoized_isaP, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (meaning_sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (memoizeP.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (strength.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (use_memoized_isaP.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(generate_pattern_for_meaning_sentence_memoized_internal(meaning_sentence, memoizeP, mt, strength, use_memoized_isaP, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(meaning_sentence, memoizeP, mt, strength, use_memoized_isaP, mt_info));
        return memoization_state.caching_results(results3);
    }

    /**
     * STRENGTH should be one of:
     * :robust   - comprehensive (and very expensive)
     * :weak     - permissive (and really cheap)
     * :strict   - pretty strict (and really quite cheap)
     * :pedantic - very strict (and fairly cheap)
     * :raw      - like :pedantic, but accepts logical field indexicals
     */
    @LispMethod(comment = "STRENGTH should be one of:\r\n:robust   - comprehensive (and very expensive)\r\n:weak     - permissive (and really cheap)\r\n:strict   - pretty strict (and really quite cheap)\r\n:pedantic - very strict (and fairly cheap)\r\n:raw      - like :pedantic, but accepts logical field indexicals\nSTRENGTH should be one of:\n:robust   - comprehensive (and very expensive)\n:weak     - permissive (and really cheap)\n:strict   - pretty strict (and really quite cheap)\n:pedantic - very strict (and fairly cheap)\n:raw      - like :pedantic, but accepts logical field indexicals")
    public static final SubLObject generate_pattern_for_meaning_sentence_alt(SubLObject meaning_sentence, SubLObject memoizeP, SubLObject mt, SubLObject strength, SubLObject use_memoized_isaP) {
        if (use_memoized_isaP == UNPROVIDED) {
            use_memoized_isaP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pred = cycl_utilities.formula_arg0(meaning_sentence);
                SubLObject args = cycl_utilities.formula_args(meaning_sentence, UNPROVIDED);
                SubLObject transitive_args = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.transitive_args_for_meaning_sentence_predicate(pred);
                SubLObject arg_pattern = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.generate_pattern_for_meaning_sentence_args(args, memoizeP, mt, strength, transitive_args, use_memoized_isaP);
                SubLObject pattern = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject pcase_var = strength;
                            if (pcase_var.eql($ROBUST) || pcase_var.eql($WEAK)) {
                                if (NIL != sksi_kb_accessors.logical_field_indexical_p(pred)) {
                                    {
                                        SubLObject pred_pattern = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.generate_pattern_for_logical_field_indexical(pred, strength, use_memoized_isaP);
                                        pattern = cons(pred_pattern, arg_pattern);
                                    }
                                } else {
                                    if (NIL != sksi_query_utilities.binary_predicate_memoized(pred)) {
                                        {
                                            SubLObject spec_pattern = cons(list($OR, list($UNIFY, pred), list($SPEC_PRED, pred)), arg_pattern);
                                            SubLObject inv_pattern = cons(list($OR, $NOT_FULLY_BOUND, list($SPEC_INVERSE, pred)), reverse(arg_pattern));
                                            pattern = list($OR, spec_pattern, inv_pattern);
                                        }
                                    } else {
                                        pattern = cons(list($OR, list($UNIFY, pred), list($SPEC_PRED, pred)), arg_pattern);
                                    }
                                }
                            } else {
                                if ((pcase_var.eql($STRICT) || pcase_var.eql($PEDANTIC)) || pcase_var.eql($RAW)) {
                                    {
                                        SubLObject pred_pattern = (NIL != sksi_kb_accessors.logical_field_indexical_p(pred)) ? ((SubLObject) (com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.generate_pattern_for_logical_field_indexical(pred, strength, use_memoized_isaP))) : pred;
                                        pattern = cons(pred_pattern, arg_pattern);
                                    }
                                } else {
                                    Errors.error($str_alt63$Unknown_strength__a_, strength);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return pattern;
            }
        }
    }

    @LispMethod(comment = "STRENGTH should be one of:\r\n:robust   - comprehensive (and very expensive)\r\n:weak     - permissive (and really cheap)\r\n:strict   - pretty strict (and really quite cheap)\r\n:pedantic - very strict (and fairly cheap)\r\n:raw      - like :pedantic, but accepts logical field indexicals\nSTRENGTH should be one of:\n:robust   - comprehensive (and very expensive)\n:weak     - permissive (and really cheap)\n:strict   - pretty strict (and really quite cheap)\n:pedantic - very strict (and fairly cheap)\n:raw      - like :pedantic, but accepts logical field indexicals")
    public static SubLObject generate_pattern_for_meaning_sentence(final SubLObject meaning_sentence, final SubLObject memoizeP, final SubLObject mt, final SubLObject strength, SubLObject use_memoized_isaP) {
        if (use_memoized_isaP == UNPROVIDED) {
            use_memoized_isaP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.formula_arg0(meaning_sentence);
        final SubLObject args = cycl_utilities.formula_args(meaning_sentence, UNPROVIDED);
        final SubLObject transitive_args = transitive_args_for_meaning_sentence_predicate(pred);
        final SubLObject arg_pattern = generate_pattern_for_meaning_sentence_args(args, memoizeP, mt, strength, transitive_args, use_memoized_isaP);
        SubLObject pattern = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            if (strength.eql($ROBUST) || strength.eql($WEAK)) {
                if (NIL != sksi_kb_accessors.logical_field_indexical_p(pred)) {
                    final SubLObject pred_pattern = generate_pattern_for_logical_field_indexical(pred, strength, use_memoized_isaP);
                    pattern = cons(pred_pattern, arg_pattern);
                } else
                    if (NIL != sksi_query_utilities.binary_predicate_memoized(pred)) {
                        final SubLObject spec_pattern = cons(list($OR, list($UNIFY, pred), list($SPEC_PRED, pred)), arg_pattern);
                        final SubLObject inv_pattern = cons(list($OR, $NOT_FULLY_BOUND, list($SPEC_INVERSE, pred)), reverse(arg_pattern));
                        pattern = list($OR, spec_pattern, inv_pattern);
                    } else {
                        pattern = cons(list($OR, list($UNIFY, pred), list($SPEC_PRED, pred)), arg_pattern);
                    }

            } else
                if ((strength.eql($STRICT) || strength.eql($PEDANTIC)) || strength.eql($RAW)) {
                    final SubLObject pred_pattern = (NIL != sksi_kb_accessors.logical_field_indexical_p(pred)) ? generate_pattern_for_logical_field_indexical(pred, strength, use_memoized_isaP) : pred;
                    pattern = cons(pred_pattern, arg_pattern);
                } else {
                    Errors.error($str64$Unknown_strength__a_, strength);
                }

        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return pattern;
    }/**
     * STRENGTH should be one of:
     * :robust   - comprehensive (and very expensive)
     * :weak     - permissive (and really cheap)
     * :strict   - pretty strict (and really quite cheap)
     * :pedantic - very strict (and fairly cheap)
     * :raw      - like :pedantic, but accepts logical field indexicals
     */


    public static final SubLObject transitive_args_for_meaning_sentence_predicate_alt(SubLObject pred) {
        return pred == $$isa ? ((SubLObject) ($list_alt65)) : NIL;
    }

    public static SubLObject transitive_args_for_meaning_sentence_predicate(final SubLObject pred) {
        return pred.eql($$isa) ? $list66 : NIL;
    }

    public static final SubLObject generate_pattern_for_meaning_sentence_args_alt(SubLObject meaning_sentence_args, SubLObject memoizeP, SubLObject mt, SubLObject strength, SubLObject transitive_args, SubLObject use_memoized_isaP) {
        if (transitive_args == UNPROVIDED) {
            transitive_args = NIL;
        }
        if (use_memoized_isaP == UNPROVIDED) {
            use_memoized_isaP = NIL;
        }
        {
            SubLObject pattern = NIL;
            SubLObject list_var = NIL;
            SubLObject meaning_sentence_arg = NIL;
            SubLObject num = NIL;
            for (list_var = meaning_sentence_args, meaning_sentence_arg = list_var.first(), num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , meaning_sentence_arg = list_var.first() , num = add(ONE_INTEGER, num)) {
                {
                    SubLObject sub_pattern = (NIL != subl_promotions.memberP(number_utilities.f_1X(num), transitive_args, symbol_function($sym66$_), UNPROVIDED)) ? ((SubLObject) (com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.generate_pattern_for_meaning_sentence_arg(meaning_sentence_arg, memoizeP, mt, strength, T, use_memoized_isaP))) : com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.generate_pattern_for_meaning_sentence_arg(meaning_sentence_arg, memoizeP, mt, strength, NIL, use_memoized_isaP);
                    pattern = cons(sub_pattern, pattern);
                }
            }
            return nreverse(pattern);
        }
    }

    public static SubLObject generate_pattern_for_meaning_sentence_args(final SubLObject meaning_sentence_args, final SubLObject memoizeP, final SubLObject mt, final SubLObject strength, SubLObject transitive_args, SubLObject use_memoized_isaP) {
        if (transitive_args == UNPROVIDED) {
            transitive_args = NIL;
        }
        if (use_memoized_isaP == UNPROVIDED) {
            use_memoized_isaP = NIL;
        }
        SubLObject pattern = NIL;
        SubLObject list_var = NIL;
        SubLObject meaning_sentence_arg = NIL;
        SubLObject num = NIL;
        list_var = meaning_sentence_args;
        meaning_sentence_arg = list_var.first();
        for (num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , meaning_sentence_arg = list_var.first() , num = add(ONE_INTEGER, num)) {
            final SubLObject sub_pattern = (NIL != subl_promotions.memberP(number_utilities.f_1X(num), transitive_args, symbol_function($sym67$_), UNPROVIDED)) ? generate_pattern_for_meaning_sentence_arg(meaning_sentence_arg, memoizeP, mt, strength, T, use_memoized_isaP) : generate_pattern_for_meaning_sentence_arg(meaning_sentence_arg, memoizeP, mt, strength, NIL, use_memoized_isaP);
            pattern = cons(sub_pattern, pattern);
        }
        return nreverse(pattern);
    }

    public static final SubLObject generate_pattern_for_meaning_sentence_arg_alt(SubLObject meaning_sentence_arg, SubLObject memoizeP, SubLObject mt, SubLObject strength, SubLObject transitiveP, SubLObject use_memoized_isaP) {
        if (transitiveP == UNPROVIDED) {
            transitiveP = NIL;
        }
        if (use_memoized_isaP == UNPROVIDED) {
            use_memoized_isaP = NIL;
        }
        return NIL != memoizeP ? ((SubLObject) (com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.generate_pattern_for_meaning_sentence_arg_memoized(meaning_sentence_arg, mt, strength, transitiveP, use_memoized_isaP))) : com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.generate_pattern_for_meaning_sentence_arg_int(meaning_sentence_arg, mt, strength, transitiveP, use_memoized_isaP);
    }

    public static SubLObject generate_pattern_for_meaning_sentence_arg(final SubLObject meaning_sentence_arg, final SubLObject memoizeP, final SubLObject mt, final SubLObject strength, SubLObject transitiveP, SubLObject use_memoized_isaP) {
        if (transitiveP == UNPROVIDED) {
            transitiveP = NIL;
        }
        if (use_memoized_isaP == UNPROVIDED) {
            use_memoized_isaP = NIL;
        }
        return NIL != memoizeP ? generate_pattern_for_meaning_sentence_arg_memoized(meaning_sentence_arg, mt, strength, transitiveP, use_memoized_isaP) : generate_pattern_for_meaning_sentence_arg_int(meaning_sentence_arg, mt, strength, transitiveP, use_memoized_isaP);
    }

    public static final SubLObject generate_pattern_for_meaning_sentence_arg_memoized_internal_alt(SubLObject meaning_sentence_arg, SubLObject mt, SubLObject strength, SubLObject transitiveP, SubLObject use_memoized_isaP) {
        if (use_memoized_isaP == UNPROVIDED) {
            use_memoized_isaP = NIL;
        }
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.generate_pattern_for_meaning_sentence_arg_int(meaning_sentence_arg, mt, strength, transitiveP, use_memoized_isaP);
    }

    public static SubLObject generate_pattern_for_meaning_sentence_arg_memoized_internal(final SubLObject meaning_sentence_arg, final SubLObject mt, final SubLObject strength, final SubLObject transitiveP, SubLObject use_memoized_isaP) {
        if (use_memoized_isaP == UNPROVIDED) {
            use_memoized_isaP = NIL;
        }
        return generate_pattern_for_meaning_sentence_arg_int(meaning_sentence_arg, mt, strength, transitiveP, use_memoized_isaP);
    }

    public static final SubLObject generate_pattern_for_meaning_sentence_arg_memoized_alt(SubLObject meaning_sentence_arg, SubLObject mt, SubLObject strength, SubLObject transitiveP, SubLObject use_memoized_isaP) {
        if (use_memoized_isaP == UNPROVIDED) {
            use_memoized_isaP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.generate_pattern_for_meaning_sentence_arg_memoized_internal(meaning_sentence_arg, mt, strength, transitiveP, use_memoized_isaP);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, GENERATE_PATTERN_FOR_MEANING_SENTENCE_ARG_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), GENERATE_PATTERN_FOR_MEANING_SENTENCE_ARG_MEMOIZED, FIVE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, GENERATE_PATTERN_FOR_MEANING_SENTENCE_ARG_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_5(meaning_sentence_arg, mt, strength, transitiveP, use_memoized_isaP);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw18$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (meaning_sentence_arg.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (mt.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (strength.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (transitiveP.equal(cached_args.first())) {
                                                    cached_args = cached_args.rest();
                                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && use_memoized_isaP.equal(cached_args.first())) {
                                                        return memoization_state.caching_results(results2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.generate_pattern_for_meaning_sentence_arg_memoized_internal(meaning_sentence_arg, mt, strength, transitiveP, use_memoized_isaP)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(meaning_sentence_arg, mt, strength, transitiveP, use_memoized_isaP));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject generate_pattern_for_meaning_sentence_arg_memoized(final SubLObject meaning_sentence_arg, final SubLObject mt, final SubLObject strength, final SubLObject transitiveP, SubLObject use_memoized_isaP) {
        if (use_memoized_isaP == UNPROVIDED) {
            use_memoized_isaP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return generate_pattern_for_meaning_sentence_arg_memoized_internal(meaning_sentence_arg, mt, strength, transitiveP, use_memoized_isaP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, GENERATE_PATTERN_FOR_MEANING_SENTENCE_ARG_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), GENERATE_PATTERN_FOR_MEANING_SENTENCE_ARG_MEMOIZED, FIVE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, GENERATE_PATTERN_FOR_MEANING_SENTENCE_ARG_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(meaning_sentence_arg, mt, strength, transitiveP, use_memoized_isaP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (meaning_sentence_arg.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (strength.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (transitiveP.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && use_memoized_isaP.equal(cached_args.first())) {
                                    return memoization_state.caching_results(results2);
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(generate_pattern_for_meaning_sentence_arg_memoized_internal(meaning_sentence_arg, mt, strength, transitiveP, use_memoized_isaP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(meaning_sentence_arg, mt, strength, transitiveP, use_memoized_isaP));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject generate_pattern_for_meaning_sentence_arg_int_alt(SubLObject meaning_sentence_arg, SubLObject mt, SubLObject strength, SubLObject transitiveP, SubLObject use_memoized_isaP) {
        if (transitiveP == UNPROVIDED) {
            transitiveP = NIL;
        }
        if (use_memoized_isaP == UNPROVIDED) {
            use_memoized_isaP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject alist = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject lfis = cycl_utilities.expression_gather(meaning_sentence_arg, LOGICAL_FIELD_INDEXICAL_P, NIL, symbol_function(EQ), symbol_function(IDENTITY), NIL);
                            SubLObject el_vars = cycl_utilities.expression_gather(meaning_sentence_arg, EL_VARIABLE_P, NIL, symbol_function(EQ), symbol_function(IDENTITY), NIL);
                            SubLObject cols = cycl_utilities.expression_gather(meaning_sentence_arg, COLLECTION_P, NIL, symbol_function(EQ), symbol_function(IDENTITY), NIL);
                            SubLObject preds = cycl_utilities.expression_gather(meaning_sentence_arg, PREDICATE_P, NIL, symbol_function(EQ), symbol_function(IDENTITY), NIL);
                            SubLObject nats = cycl_utilities.expression_gather(meaning_sentence_arg, CYCL_NAT_P, NIL, symbol_function(EQUAL), symbol_function(IDENTITY), NIL);
                            {
                                SubLObject cdolist_list_var = lfis;
                                SubLObject lfi = NIL;
                                for (lfi = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lfi = cdolist_list_var.first()) {
                                    {
                                        SubLObject lfi_pattern = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.generate_pattern_for_logical_field_indexical(lfi, strength, use_memoized_isaP);
                                        alist = cons(bq_cons(lfi, lfi_pattern), alist);
                                    }
                                }
                            }
                            {
                                SubLObject cdolist_list_var = el_vars;
                                SubLObject el_var = NIL;
                                for (el_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , el_var = cdolist_list_var.first()) {
                                    {
                                        SubLObject el_var_pattern = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.generate_pattern_for_el_variable(el_var, strength);
                                        alist = cons(bq_cons(el_var, el_var_pattern), alist);
                                    }
                                }
                            }
                            {
                                SubLObject cdolist_list_var = cols;
                                SubLObject col = NIL;
                                for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                                    if (NIL == sksi_kb_accessors.logical_field_indexical_p(col)) {
                                        {
                                            SubLObject col_pattern = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.generate_pattern_for_collection(col, strength, transitiveP);
                                            alist = cons(bq_cons(col, col_pattern), alist);
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject cdolist_list_var = preds;
                                SubLObject pred = NIL;
                                for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                                    if (NIL == sksi_kb_accessors.logical_field_indexical_p(pred)) {
                                        {
                                            SubLObject pred_pattern = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.generate_pattern_for_predicate(pred, strength);
                                            alist = cons(bq_cons(pred, pred_pattern), alist);
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject cdolist_list_var = nats;
                                SubLObject nat = NIL;
                                for (nat = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , nat = cdolist_list_var.first()) {
                                    if (!(((NIL != sksi_kb_accessors.logical_field_indexical_p(nat)) || (NIL != fort_types_interface.collection_p(nat))) || (NIL != fort_types_interface.predicate_p(nat)))) {
                                        {
                                            SubLObject nat_pattern = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.generate_pattern_for_nat(nat, strength);
                                            alist = cons(bq_cons(nat, nat_pattern), alist);
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return sublis(alist, meaning_sentence_arg, symbol_function(EQUAL), UNPROVIDED);
            }
        }
    }

    public static SubLObject generate_pattern_for_meaning_sentence_arg_int(final SubLObject meaning_sentence_arg, final SubLObject mt, final SubLObject strength, SubLObject transitiveP, SubLObject use_memoized_isaP) {
        if (transitiveP == UNPROVIDED) {
            transitiveP = NIL;
        }
        if (use_memoized_isaP == UNPROVIDED) {
            use_memoized_isaP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject alist = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            final SubLObject lfis = cycl_utilities.expression_gather(meaning_sentence_arg, LOGICAL_FIELD_INDEXICAL_P, NIL, symbol_function(EQ), symbol_function(IDENTITY), NIL);
            final SubLObject el_vars = cycl_utilities.expression_gather(meaning_sentence_arg, EL_VARIABLE_P, NIL, symbol_function(EQ), symbol_function(IDENTITY), NIL);
            final SubLObject cols = cycl_utilities.expression_gather(meaning_sentence_arg, COLLECTION_P, NIL, symbol_function(EQ), symbol_function(IDENTITY), NIL);
            final SubLObject preds = cycl_utilities.expression_gather(meaning_sentence_arg, PREDICATE_P, NIL, symbol_function(EQ), symbol_function(IDENTITY), NIL);
            final SubLObject nats = cycl_utilities.expression_gather(meaning_sentence_arg, CYCL_NAT_P, NIL, symbol_function(EQUAL), symbol_function(IDENTITY), NIL);
            SubLObject cdolist_list_var = lfis;
            SubLObject lfi = NIL;
            lfi = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject lfi_pattern = generate_pattern_for_logical_field_indexical(lfi, strength, use_memoized_isaP);
                alist = cons(bq_cons(lfi, lfi_pattern), alist);
                cdolist_list_var = cdolist_list_var.rest();
                lfi = cdolist_list_var.first();
            } 
            cdolist_list_var = el_vars;
            SubLObject el_var = NIL;
            el_var = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject el_var_pattern = generate_pattern_for_el_variable(el_var, strength);
                alist = cons(bq_cons(el_var, el_var_pattern), alist);
                cdolist_list_var = cdolist_list_var.rest();
                el_var = cdolist_list_var.first();
            } 
            cdolist_list_var = cols;
            SubLObject col = NIL;
            col = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == sksi_kb_accessors.logical_field_indexical_p(col)) {
                    final SubLObject col_pattern = generate_pattern_for_collection(col, strength, transitiveP);
                    alist = cons(bq_cons(col, col_pattern), alist);
                }
                cdolist_list_var = cdolist_list_var.rest();
                col = cdolist_list_var.first();
            } 
            cdolist_list_var = preds;
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == sksi_kb_accessors.logical_field_indexical_p(pred)) {
                    final SubLObject pred_pattern = generate_pattern_for_predicate(pred, strength);
                    alist = cons(bq_cons(pred, pred_pattern), alist);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
            cdolist_list_var = nats;
            SubLObject nat = NIL;
            nat = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (((NIL == sksi_kb_accessors.logical_field_indexical_p(nat)) && (NIL == fort_types_interface.collection_p(nat))) && (NIL == fort_types_interface.predicate_p(nat))) {
                    final SubLObject nat_pattern = generate_pattern_for_nat(nat, strength);
                    alist = cons(bq_cons(nat, nat_pattern), alist);
                }
                cdolist_list_var = cdolist_list_var.rest();
                nat = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return sublis(alist, meaning_sentence_arg, symbol_function(EQUAL), UNPROVIDED);
    }

    public static final SubLObject generate_pattern_for_logical_field_indexical_alt(SubLObject logical_field_indexical, SubLObject strength, SubLObject use_memoized_isaP) {
        if (use_memoized_isaP == UNPROVIDED) {
            use_memoized_isaP = NIL;
        }
        {
            SubLObject pattern = NIL;
            if (NIL != sksi_kb_accessors.lfi_alias_fn_naut_p(logical_field_indexical)) {
                logical_field_indexical = sksi_kb_accessors.lfi_alias_fn_naut_lfi(logical_field_indexical);
            }
            {
                SubLObject pcase_var = strength;
                if (pcase_var.eql($ROBUST)) {
                    {
                        SubLObject logical_field = sksi_kb_accessors.logical_field_for_indexical(logical_field_indexical);
                        SubLObject constraints = sksi_kb_accessors.logical_field_isa(logical_field);
                        SubLObject cdolist_list_var = constraints;
                        SubLObject constraint = NIL;
                        for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                            if (NIL != use_memoized_isaP) {
                                pattern = cons(list($OR, list($ISA_MEMOIZED, constraint), list($NOT_ISA_DISJOINT_MEMOIZED, constraint)), pattern);
                            } else {
                                pattern = cons(list($OR, list($ISA, constraint), list($NOT_ISA_DISJOINT, constraint)), pattern);
                            }
                        }
                        if (NIL != list_utilities.lengthG(pattern, ONE_INTEGER, UNPROVIDED)) {
                            pattern = cons($AND, pattern);
                        } else {
                            pattern = pattern.first();
                        }
                    }
                    pattern = list($OR, $NOT_FULLY_BOUND, pattern);
                } else {
                    if (pcase_var.eql($WEAK) || pcase_var.eql($STRICT)) {
                        pattern = $ANYTHING;
                    } else {
                        if (pcase_var.eql($PEDANTIC)) {
                            {
                                SubLObject logical_field = sksi_kb_accessors.logical_field_for_indexical(logical_field_indexical);
                                SubLObject constraints = sksi_kb_accessors.logical_field_isa(logical_field);
                                SubLObject cdolist_list_var = constraints;
                                SubLObject constraint = NIL;
                                for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                                    if (NIL != use_memoized_isaP) {
                                        pattern = cons(list($ISA_MEMOIZED, constraint), pattern);
                                    } else {
                                        pattern = cons(list($ISA, constraint), pattern);
                                    }
                                }
                                if (NIL != list_utilities.lengthG(pattern, ONE_INTEGER, UNPROVIDED)) {
                                    pattern = cons($AND, pattern);
                                } else {
                                    pattern = pattern.first();
                                }
                            }
                        } else {
                            if (pcase_var.eql($RAW)) {
                                {
                                    SubLObject logical_field = sksi_kb_accessors.logical_field_for_indexical(logical_field_indexical);
                                    SubLObject constraints = sksi_kb_accessors.logical_field_isa(logical_field);
                                    SubLObject cdolist_list_var = constraints;
                                    SubLObject constraint = NIL;
                                    for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                                        if (NIL != use_memoized_isaP) {
                                            pattern = cons(list($ISA_MEMOIZED, constraint), pattern);
                                        } else {
                                            pattern = cons(list($ISA, constraint), pattern);
                                        }
                                    }
                                    if (NIL != list_utilities.lengthG(pattern, ONE_INTEGER, UNPROVIDED)) {
                                        pattern = cons($AND, pattern);
                                    } else {
                                        pattern = pattern.first();
                                    }
                                    pattern = list($OR, logical_field_indexical, pattern);
                                }
                            }
                        }
                    }
                }
            }
            return pattern;
        }
    }

    public static SubLObject generate_pattern_for_logical_field_indexical(SubLObject logical_field_indexical, final SubLObject strength, SubLObject use_memoized_isaP) {
        if (use_memoized_isaP == UNPROVIDED) {
            use_memoized_isaP = NIL;
        }
        SubLObject pattern = NIL;
        if (NIL != sksi_kb_accessors.lfi_alias_fn_naut_p(logical_field_indexical)) {
            logical_field_indexical = sksi_kb_accessors.lfi_alias_fn_naut_lfi(logical_field_indexical);
        }
        if (strength.eql($ROBUST)) {
            final SubLObject logical_field = sksi_kb_accessors.logical_field_for_indexical(logical_field_indexical);
            SubLObject cdolist_list_var;
            final SubLObject constraints = cdolist_list_var = sksi_kb_accessors.logical_field_isa(logical_field);
            SubLObject constraint = NIL;
            constraint = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != use_memoized_isaP) {
                    pattern = cons(list($OR, list($ISA_MEMOIZED, constraint), list($NOT_ISA_DISJOINT_MEMOIZED, constraint)), pattern);
                } else {
                    pattern = cons(list($OR, list($ISA, constraint), list($NOT_ISA_DISJOINT, constraint)), pattern);
                }
                cdolist_list_var = cdolist_list_var.rest();
                constraint = cdolist_list_var.first();
            } 
            if (NIL != list_utilities.lengthG(pattern, ONE_INTEGER, UNPROVIDED)) {
                pattern = cons($AND, pattern);
            } else {
                pattern = pattern.first();
            }
            pattern = list($OR, $NOT_FULLY_BOUND, pattern);
        } else
            if (strength.eql($WEAK) || strength.eql($STRICT)) {
                pattern = $ANYTHING;
            } else
                if (strength.eql($PEDANTIC)) {
                    final SubLObject logical_field = sksi_kb_accessors.logical_field_for_indexical(logical_field_indexical);
                    SubLObject cdolist_list_var;
                    final SubLObject constraints = cdolist_list_var = sksi_kb_accessors.logical_field_isa(logical_field);
                    SubLObject constraint = NIL;
                    constraint = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != use_memoized_isaP) {
                            pattern = cons(list($ISA_MEMOIZED, constraint), pattern);
                        } else {
                            pattern = cons(list($ISA, constraint), pattern);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        constraint = cdolist_list_var.first();
                    } 
                    if (NIL != list_utilities.lengthG(pattern, ONE_INTEGER, UNPROVIDED)) {
                        pattern = cons($AND, pattern);
                    } else {
                        pattern = pattern.first();
                    }
                } else
                    if (strength.eql($RAW)) {
                        final SubLObject logical_field = sksi_kb_accessors.logical_field_for_indexical(logical_field_indexical);
                        SubLObject cdolist_list_var;
                        final SubLObject constraints = cdolist_list_var = sksi_kb_accessors.logical_field_isa(logical_field);
                        SubLObject constraint = NIL;
                        constraint = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL != use_memoized_isaP) {
                                pattern = cons(list($ISA_MEMOIZED, constraint), pattern);
                            } else {
                                pattern = cons(list($ISA, constraint), pattern);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            constraint = cdolist_list_var.first();
                        } 
                        if (NIL != list_utilities.lengthG(pattern, ONE_INTEGER, UNPROVIDED)) {
                            pattern = cons($AND, pattern);
                        } else {
                            pattern = pattern.first();
                        }
                        pattern = list($OR, logical_field_indexical, pattern);
                    }



        return pattern;
    }

    public static final SubLObject generate_pattern_for_el_variable_alt(SubLObject el_variable, SubLObject strength) {
        return $EL_VARIABLE;
    }

    public static SubLObject generate_pattern_for_el_variable(final SubLObject el_variable, final SubLObject strength) {
        return $EL_VARIABLE;
    }

    public static final SubLObject generate_pattern_for_collection_alt(SubLObject collection, SubLObject strength, SubLObject transitiveP) {
        if (transitiveP == UNPROVIDED) {
            transitiveP = NIL;
        }
        {
            SubLObject pattern = NIL;
            SubLObject pcase_var = strength;
            if (pcase_var.eql($ROBUST) || pcase_var.eql($WEAK)) {
                pattern = (NIL != transitiveP) ? ((SubLObject) (list($OR, list($UNIFY, collection), list($SPEC, collection)))) : list($UNIFY, collection);
            } else {
                if (pcase_var.eql($STRICT)) {
                    pattern = list($UNIFY, collection);
                } else {
                    if (pcase_var.eql($PEDANTIC) || pcase_var.eql($RAW)) {
                        pattern = collection;
                    }
                }
            }
            return pattern;
        }
    }

    public static SubLObject generate_pattern_for_collection(final SubLObject collection, final SubLObject strength, SubLObject transitiveP) {
        if (transitiveP == UNPROVIDED) {
            transitiveP = NIL;
        }
        SubLObject pattern = NIL;
        if (strength.eql($ROBUST) || strength.eql($WEAK)) {
            pattern = (NIL != transitiveP) ? list($OR, list($UNIFY, collection), list($SPEC, collection)) : list($UNIFY, collection);
        } else
            if (strength.eql($STRICT)) {
                pattern = list($UNIFY, collection);
            } else
                if (strength.eql($PEDANTIC) || strength.eql($RAW)) {
                    pattern = collection;
                }


        return pattern;
    }

    public static final SubLObject generate_pattern_for_predicate_alt(SubLObject predicate, SubLObject strength) {
        {
            SubLObject pattern = NIL;
            SubLObject pcase_var = strength;
            if (pcase_var.eql($ROBUST) || pcase_var.eql($WEAK)) {
                pattern = list($OR, list($UNIFY, predicate), list($SPEC_PRED, predicate));
            } else {
                if (pcase_var.eql($STRICT)) {
                    pattern = list($UNIFY, predicate);
                } else {
                    if (pcase_var.eql($PEDANTIC) || pcase_var.eql($RAW)) {
                        pattern = predicate;
                    }
                }
            }
            return pattern;
        }
    }

    public static SubLObject generate_pattern_for_predicate(final SubLObject predicate, final SubLObject strength) {
        SubLObject pattern = NIL;
        if (strength.eql($ROBUST) || strength.eql($WEAK)) {
            pattern = list($OR, list($UNIFY, predicate), list($SPEC_PRED, predicate));
        } else
            if (strength.eql($STRICT)) {
                pattern = list($UNIFY, predicate);
            } else
                if (strength.eql($PEDANTIC) || strength.eql($RAW)) {
                    pattern = predicate;
                }


        return pattern;
    }

    public static final SubLObject generate_pattern_for_nat_alt(SubLObject nat, SubLObject strength) {
        {
            SubLObject nat_patterns = NIL;
            SubLObject cdolist_list_var = cycl_utilities.nat_args(nat, UNPROVIDED);
            SubLObject arg = NIL;
            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                nat_patterns = cons(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.generate_pattern_for_meaning_sentence_arg_int(arg, NIL, strength, NIL, UNPROVIDED), nat_patterns);
            }
            return list($NAT, bq_cons(cycl_utilities.nat_functor(nat), nreverse(nat_patterns)));
        }
    }

    public static SubLObject generate_pattern_for_nat(final SubLObject nat, final SubLObject strength) {
        SubLObject nat_patterns = NIL;
        SubLObject cdolist_list_var = cycl_utilities.nat_args(nat, UNPROVIDED);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            nat_patterns = cons(generate_pattern_for_meaning_sentence_arg_int(arg, NIL, strength, NIL, UNPROVIDED), nat_patterns);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return list($NAT, bq_cons(cycl_utilities.nat_functor(nat), nreverse(nat_patterns)));
    }

    public static final SubLObject ist_meaning_sentence_gaf_p_alt(SubLObject gaf) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.meaning_sentence_gaf_p(gaf)) && (NIL != ist_sentence_p(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.get_meaning_sentence_from_gaf(gaf, UNPROVIDED))));
    }

    public static SubLObject ist_meaning_sentence_gaf_p(final SubLObject gaf) {
        return makeBoolean((NIL != meaning_sentence_gaf_p(gaf)) && (NIL != ist_sentence_p(get_meaning_sentence_from_gaf(gaf, UNPROVIDED), UNPROVIDED)));
    }

    public static final SubLObject unwrap_meaning_sentence_if_ist_alt(SubLObject meaning_sentence) {
        return czer_utilities.unwrap_if_ist_permissive(meaning_sentence, UNPROVIDED);
    }

    public static SubLObject unwrap_meaning_sentence_if_ist(final SubLObject meaning_sentence) {
        return czer_utilities.unwrap_if_ist_permissive(meaning_sentence, UNPROVIDED);
    }

    /**
     * This breaks down any NARTS in SENTENCE except for the logical field indexicals.
     */
    @LispMethod(comment = "This breaks down any NARTS in SENTENCE except for the logical field indexicals.")
    public static final SubLObject sksi_reconstruct_meaning_sentence_alt(SubLObject sentence) {
        {
            SubLObject new_sentence = sksi_infrastructure_utilities.sksi_reconstruct_expression(sentence, LOGICAL_FIELD_INDEXICAL_EL_FORMULA_P, UNPROVIDED);
            new_sentence = cycl_utilities.expression_transform(sentence, $sym82$POSSIBLY_NART_EL_FORMULA_W_O_LOGICAL_FIELD_INDEXICALS_P, FIND_NART, UNPROVIDED, UNPROVIDED);
            return new_sentence;
        }
    }

    @LispMethod(comment = "This breaks down any NARTS in SENTENCE except for the logical field indexicals.")
    public static SubLObject sksi_reconstruct_meaning_sentence(final SubLObject sentence) {
        SubLObject new_sentence = sksi_infrastructure_utilities.sksi_reconstruct_expression(sentence, LOGICAL_FIELD_INDEXICAL_EL_FORMULA_P, UNPROVIDED);
        new_sentence = cycl_utilities.expression_transform(sentence, $sym83$POSSIBLY_NART_EL_FORMULA_W_O_LOGICAL_FIELD_INDEXICALS_P, FIND_NART, UNPROVIDED, UNPROVIDED);
        return new_sentence;
    }/**
     * This breaks down any NARTS in SENTENCE except for the logical field indexicals.
     */


    public static final SubLObject possibly_nart_el_formula_wXo_logical_field_indexicals_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != sksi_infrastructure_utilities.sksi_possibly_nart_el_formula_p(v_object)) && (NIL == cycl_utilities.expression_find_if(LOGICAL_FIELD_INDEXICAL_P, v_object, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject possibly_nart_el_formula_wXo_logical_field_indexicals_p(final SubLObject v_object) {
        return makeBoolean((NIL != sksi_infrastructure_utilities.sksi_possibly_nart_el_formula_p(v_object)) && (NIL == cycl_utilities.expression_find_if(LOGICAL_FIELD_INDEXICAL_P, v_object, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject sksi_valid_meaning_sentence_pred_p_internal_alt(SubLObject pred, SubLObject content_mt) {
        return makeBoolean(NIL == kb_accessors.backchain_requiredP(pred, content_mt));
    }

    public static SubLObject sksi_valid_meaning_sentence_pred_p_internal(final SubLObject pred, final SubLObject content_mt) {
        return makeBoolean(NIL == kb_accessors.backchain_requiredP(pred, content_mt));
    }

    public static final SubLObject sksi_valid_meaning_sentence_pred_p_alt(SubLObject pred, SubLObject content_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.sksi_valid_meaning_sentence_pred_p_internal(pred, content_mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_VALID_MEANING_SENTENCE_PRED_P, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_VALID_MEANING_SENTENCE_PRED_P, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, SKSI_VALID_MEANING_SENTENCE_PRED_P, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(pred, content_mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw18$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (pred.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && content_mt.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.sksi_valid_meaning_sentence_pred_p_internal(pred, content_mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(pred, content_mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject sksi_valid_meaning_sentence_pred_p(final SubLObject pred, final SubLObject content_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_valid_meaning_sentence_pred_p_internal(pred, content_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_VALID_MEANING_SENTENCE_PRED_P, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_VALID_MEANING_SENTENCE_PRED_P, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SKSI_VALID_MEANING_SENTENCE_PRED_P, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, content_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && content_mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_valid_meaning_sentence_pred_p_internal(pred, content_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, content_mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject sksi_valid_meaning_sentence_pred_for_storage_p_internal_alt(SubLObject pred, SubLObject content_mt) {
        return makeBoolean(NIL == kb_accessors.not_assertible_predicateP(pred, content_mt));
    }

    public static SubLObject sksi_valid_meaning_sentence_pred_for_storage_p_internal(final SubLObject pred, final SubLObject content_mt) {
        return makeBoolean(NIL == kb_accessors.not_assertible_predicateP(pred, content_mt));
    }

    public static final SubLObject sksi_valid_meaning_sentence_pred_for_storage_p_alt(SubLObject pred, SubLObject content_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.sksi_valid_meaning_sentence_pred_for_storage_p_internal(pred, content_mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_VALID_MEANING_SENTENCE_PRED_FOR_STORAGE_P, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_VALID_MEANING_SENTENCE_PRED_FOR_STORAGE_P, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, SKSI_VALID_MEANING_SENTENCE_PRED_FOR_STORAGE_P, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(pred, content_mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw18$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (pred.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && content_mt.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.sksi_valid_meaning_sentence_pred_for_storage_p_internal(pred, content_mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(pred, content_mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject sksi_valid_meaning_sentence_pred_for_storage_p(final SubLObject pred, final SubLObject content_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_valid_meaning_sentence_pred_for_storage_p_internal(pred, content_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_VALID_MEANING_SENTENCE_PRED_FOR_STORAGE_P, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_VALID_MEANING_SENTENCE_PRED_FOR_STORAGE_P, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SKSI_VALID_MEANING_SENTENCE_PRED_FOR_STORAGE_P, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, content_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && content_mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_valid_meaning_sentence_pred_for_storage_p_internal(pred, content_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, content_mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject meaning_sentence_logical_field_indexicals_alt(SubLObject sentence) {
        return sksi_infrastructure_utilities.expression_logical_field_indexicals(sentence, NIL, UNPROVIDED);
    }

    public static SubLObject meaning_sentence_logical_field_indexicals(final SubLObject sentence) {
        return sksi_infrastructure_utilities.expression_logical_field_indexicals(sentence, NIL, UNPROVIDED);
    }

    public static SubLObject logical_schema_logical_field_indexicals_used_in_meaning_sentences(final SubLObject logical_schema) {
        final SubLObject result = set.new_set(symbol_function(EQ), UNPROVIDED);
        SubLObject cdolist_list_var = logical_schema_meaning_sentences(logical_schema, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject meaning_sentence = NIL;
        meaning_sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = meaning_sentence_logical_field_indexicals(meaning_sentence);
            SubLObject lfi = NIL;
            lfi = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                set.set_add(lfi, result);
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                lfi = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            meaning_sentence = cdolist_list_var.first();
        } 
        return set.set_element_list(result);
    }

    public static final SubLObject meaning_sentence_logical_fields_alt(SubLObject sentence) {
        return Mapping.mapcar(LOGICAL_FIELD_FOR_INDEXICAL, com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.meaning_sentence_logical_field_indexicals(sentence));
    }

    public static SubLObject meaning_sentence_logical_fields(final SubLObject sentence) {
        return Mapping.mapcar(LOGICAL_FIELD_FOR_INDEXICAL, meaning_sentence_logical_field_indexicals(sentence));
    }

    public static final SubLObject meaning_sentence_logical_field_indexical_p_internal_alt(SubLObject lfi, SubLObject meaning_sentence) {
        return cycl_utilities.expression_find(lfi, meaning_sentence, T, symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject meaning_sentence_logical_field_indexical_p_internal(final SubLObject lfi, final SubLObject meaning_sentence) {
        return cycl_utilities.expression_find(lfi, meaning_sentence, T, symbol_function(EQUAL), UNPROVIDED);
    }

    public static final SubLObject meaning_sentence_logical_field_indexical_p_alt(SubLObject lfi, SubLObject meaning_sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.meaning_sentence_logical_field_indexical_p_internal(lfi, meaning_sentence);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MEANING_SENTENCE_LOGICAL_FIELD_INDEXICAL_P, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MEANING_SENTENCE_LOGICAL_FIELD_INDEXICAL_P, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, MEANING_SENTENCE_LOGICAL_FIELD_INDEXICAL_P, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(lfi, meaning_sentence);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw18$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (lfi.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && meaning_sentence.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.meaning_sentence_logical_field_indexical_p_internal(lfi, meaning_sentence)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(lfi, meaning_sentence));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject meaning_sentence_logical_field_indexical_p(final SubLObject lfi, final SubLObject meaning_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return meaning_sentence_logical_field_indexical_p_internal(lfi, meaning_sentence);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MEANING_SENTENCE_LOGICAL_FIELD_INDEXICAL_P, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MEANING_SENTENCE_LOGICAL_FIELD_INDEXICAL_P, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, MEANING_SENTENCE_LOGICAL_FIELD_INDEXICAL_P, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(lfi, meaning_sentence);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (lfi.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && meaning_sentence.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(meaning_sentence_logical_field_indexical_p_internal(lfi, meaning_sentence)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(lfi, meaning_sentence));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject meaning_sentence_with_logical_field_indexical_predicateP_alt(SubLObject meaning_sentence) {
        return sksi_kb_accessors.logical_field_indexical_p(cycl_utilities.formula_operator(meaning_sentence));
    }

    public static SubLObject meaning_sentence_with_logical_field_indexical_predicateP(final SubLObject meaning_sentence) {
        return sksi_kb_accessors.logical_field_indexical_p(cycl_utilities.formula_operator(meaning_sentence));
    }

    public static final SubLObject possibly_constrain_consequent_meaning_sentence_alt(SubLObject antecedent_meaning_sentence, SubLObject consequent_meaning_sentence) {
        {
            SubLObject new_pred = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.antecedent_meaning_sentence_constraining_lfi_as_non_lfi(antecedent_meaning_sentence, cycl_utilities.formula_operator(consequent_meaning_sentence));
            SubLObject new_consequent_sentence = (NIL != new_pred) ? ((SubLObject) (make_formula(new_pred, cycl_utilities.formula_args(consequent_meaning_sentence, UNPROVIDED), UNPROVIDED))) : consequent_meaning_sentence;
            return values(new_consequent_sentence, new_pred);
        }
    }

    public static SubLObject possibly_constrain_consequent_meaning_sentence(final SubLObject antecedent_meaning_sentence, final SubLObject consequent_meaning_sentence) {
        final SubLObject new_pred = antecedent_meaning_sentence_constraining_lfi_as_non_lfi(antecedent_meaning_sentence, cycl_utilities.formula_operator(consequent_meaning_sentence));
        final SubLObject new_consequent_sentence = (NIL != new_pred) ? make_formula(new_pred, cycl_utilities.formula_args(consequent_meaning_sentence, UNPROVIDED), UNPROVIDED) : consequent_meaning_sentence;
        return values(new_consequent_sentence, new_pred);
    }

    public static final SubLObject antecedent_meaning_sentence_constraining_lfi_as_non_lfi_alt(SubLObject sentence, SubLObject lfi) {
        {
            SubLObject constrained_lfi = NIL;
            if (NIL != cycl_utilities.atomic_sentence_with_pred_p(sentence, $$equals)) {
                constrained_lfi = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.atomic_sentence_constraining_lfi_as_non_lfi(sentence, lfi);
            } else {
                if (NIL != el_conjunction_p(sentence)) {
                    {
                        SubLObject args = cycl_utilities.formula_args(sentence, $IGNORE);
                        SubLObject rest = NIL;
                        for (rest = args; !((NIL != constrained_lfi) || (NIL == rest)); rest = rest.rest()) {
                            {
                                SubLObject subsentence = rest.first();
                                constrained_lfi = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities.antecedent_meaning_sentence_constraining_lfi_as_non_lfi(subsentence, lfi);
                            }
                        }
                    }
                }
            }
            return constrained_lfi;
        }
    }

    public static SubLObject antecedent_meaning_sentence_constraining_lfi_as_non_lfi(final SubLObject sentence, final SubLObject lfi) {
        SubLObject constrained_lfi = NIL;
        if (NIL != cycl_utilities.atomic_sentence_with_pred_p(sentence, $$equals)) {
            constrained_lfi = atomic_sentence_constraining_lfi_as_non_lfi(sentence, lfi);
        } else
            if (NIL != el_conjunction_p(sentence)) {
                final SubLObject args = cycl_utilities.formula_args(sentence, $IGNORE);
                SubLObject rest;
                SubLObject subsentence;
                for (rest = NIL, rest = args; (NIL == constrained_lfi) && (NIL != rest); constrained_lfi = antecedent_meaning_sentence_constraining_lfi_as_non_lfi(subsentence, lfi) , rest = rest.rest()) {
                    subsentence = rest.first();
                }
            }

        return constrained_lfi;
    }

    public static final SubLObject atomic_sentence_constraining_lfi_as_non_lfi_alt(SubLObject sentence, SubLObject lfi) {
        if ((cycl_utilities.atomic_sentence_arg1(sentence, UNPROVIDED) == lfi) && (NIL == sksi_kb_accessors.logical_field_indexical_p(cycl_utilities.atomic_sentence_arg2(sentence, UNPROVIDED)))) {
            return cycl_utilities.atomic_sentence_arg2(sentence, UNPROVIDED);
        } else {
            if ((cycl_utilities.atomic_sentence_arg2(sentence, UNPROVIDED) == lfi) && (NIL == sksi_kb_accessors.logical_field_indexical_p(cycl_utilities.atomic_sentence_arg1(sentence, UNPROVIDED)))) {
                return cycl_utilities.atomic_sentence_arg1(sentence, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject atomic_sentence_constraining_lfi_as_non_lfi(final SubLObject sentence, final SubLObject lfi) {
        if (cycl_utilities.atomic_sentence_arg1(sentence, UNPROVIDED).eql(lfi) && (NIL == sksi_kb_accessors.logical_field_indexical_p(cycl_utilities.atomic_sentence_arg2(sentence, UNPROVIDED)))) {
            return cycl_utilities.atomic_sentence_arg2(sentence, UNPROVIDED);
        }
        if (cycl_utilities.atomic_sentence_arg2(sentence, UNPROVIDED).eql(lfi) && (NIL == sksi_kb_accessors.logical_field_indexical_p(cycl_utilities.atomic_sentence_arg1(sentence, UNPROVIDED)))) {
            return cycl_utilities.atomic_sentence_arg1(sentence, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject declare_sksi_meaning_sentence_utilities_file() {
        declareFunction("meaning_sentence_gaf_p", "MEANING-SENTENCE-GAF-P", 1, 0, false);
        declareFunction("ordinary_meaning_sentence_gaf_p", "ORDINARY-MEANING-SENTENCE-GAF-P", 1, 0, false);
        declareFunction("conditional_meaning_sentence_gaf_p", "CONDITIONAL-MEANING-SENTENCE-GAF-P", 1, 0, false);
        declareFunction("gaf_assertion_is_conditional_meaning_sentence_gafP", "GAF-ASSERTION-IS-CONDITIONAL-MEANING-SENTENCE-GAF?", 1, 0, false);
        declareFunction("get_logical_schema_from_meaning_sentence_gaf", "GET-LOGICAL-SCHEMA-FROM-MEANING-SENTENCE-GAF", 1, 0, false);
        declareFunction("get_logical_schemata_from_meaning_sentence_gaf", "GET-LOGICAL-SCHEMATA-FROM-MEANING-SENTENCE-GAF", 1, 0, false);
        declareFunction("get_meaning_sentence_from_gaf", "GET-MEANING-SENTENCE-FROM-GAF", 1, 1, false);
        declareFunction("get_meaning_sentence_pred_from_gaf", "GET-MEANING-SENTENCE-PRED-FROM-GAF", 1, 1, false);
        declareMacro("destructure_meaning_sentence_gaf", "DESTRUCTURE-MEANING-SENTENCE-GAF");
        declareFunction("get_antecedent_logical_schemata_from_conditional_meaning_sentence_gaf", "GET-ANTECEDENT-LOGICAL-SCHEMATA-FROM-CONDITIONAL-MEANING-SENTENCE-GAF", 1, 0, false);
        declareFunction("get_antecedent_meaning_sentence_from_gaf", "GET-ANTECEDENT-MEANING-SENTENCE-FROM-GAF", 1, 0, false);
        declareFunction("get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf", "GET-CONSEQUENT-LOGICAL-SCHEMATA-FROM-CONDITIONAL-MEANING-SENTENCE-GAF", 1, 0, false);
        declareFunction("get_consequent_meaning_sentence_from_gaf", "GET-CONSEQUENT-MEANING-SENTENCE-FROM-GAF", 1, 1, false);
        declareFunction("get_consequent_meaning_sentence_from_gaf_unwrapping_ists", "GET-CONSEQUENT-MEANING-SENTENCE-FROM-GAF-UNWRAPPING-ISTS", 1, 0, false);
        declareMacro("destructure_conditional_meaning_sentence_gaf", "DESTRUCTURE-CONDITIONAL-MEANING-SENTENCE-GAF");
        declareMacro("destructure_conditional_meaning_sentence", "DESTRUCTURE-CONDITIONAL-MEANING-SENTENCE");
        declareFunction("get_antecedent_logical_schemata_from_conditional_meaning_sentence", "GET-ANTECEDENT-LOGICAL-SCHEMATA-FROM-CONDITIONAL-MEANING-SENTENCE", 1, 0, false);
        declareFunction("get_antecedent_meaning_sentence_from_conditional_meaning_sentence", "GET-ANTECEDENT-MEANING-SENTENCE-FROM-CONDITIONAL-MEANING-SENTENCE", 1, 0, false);
        declareFunction("get_consequent_logical_schemata_from_conditional_meaning_sentence", "GET-CONSEQUENT-LOGICAL-SCHEMATA-FROM-CONDITIONAL-MEANING-SENTENCE", 1, 0, false);
        declareFunction("get_consequent_meaning_sentence_from_conditional_meaning_sentence", "GET-CONSEQUENT-MEANING-SENTENCE-FROM-CONDITIONAL-MEANING-SENTENCE", 1, 0, false);
        declareFunction("get_relevant_meaning_sentence_from_gaf_internal", "GET-RELEVANT-MEANING-SENTENCE-FROM-GAF-INTERNAL", 1, 1, false);
        declareFunction("get_relevant_meaning_sentence_from_gaf", "GET-RELEVANT-MEANING-SENTENCE-FROM-GAF", 1, 1, false);
        declareFunction("get_relevant_logical_schemata_and_meaning_sentence_from_gaf", "GET-RELEVANT-LOGICAL-SCHEMATA-AND-MEANING-SENTENCE-FROM-GAF", 1, 1, false);
        declareFunction("supported_conditional_meaning_sentence_gaf_p", "SUPPORTED-CONDITIONAL-MEANING-SENTENCE-GAF-P", 1, 1, false);
        declareFunction("supported_conditional_meaning_sentence_gaf_int_internal", "SUPPORTED-CONDITIONAL-MEANING-SENTENCE-GAF-INT-INTERNAL", 3, 0, false);
        declareFunction("supported_conditional_meaning_sentence_gaf_int", "SUPPORTED-CONDITIONAL-MEANING-SENTENCE-GAF-INT", 3, 0, false);
        declareFunction("appropriate_logical_schemata_setsP", "APPROPRIATE-LOGICAL-SCHEMATA-SETS?", 3, 0, false);
        declareMacro("with_appropriate_meaning_sentence_tmp_args", "WITH-APPROPRIATE-MEANING-SENTENCE-TMP-ARGS");
        declareFunction("logical_schemata_relevant_meaning_sentences", "LOGICAL-SCHEMATA-RELEVANT-MEANING-SENTENCES", 2, 0, false);
        declareFunction("logical_schema_meaning_sentences_relevant_to_appropriateness_check", "LOGICAL-SCHEMA-MEANING-SENTENCES-RELEVANT-TO-APPROPRIATENESS-CHECK", 2, 1, false);
        declareFunction("logical_schema_conditional_meaning_sentence_gafs_relevant_to_appropriateness_check", "LOGICAL-SCHEMA-CONDITIONAL-MEANING-SENTENCE-GAFS-RELEVANT-TO-APPROPRIATENESS-CHECK", 2, 1, false);
        declareFunction("appropriate_consequent_meaning_sentenceP", "APPROPRIATE-CONSEQUENT-MEANING-SENTENCE?", 5, 0, false);
        declareFunction("appropriate_consequent_literalP", "APPROPRIATE-CONSEQUENT-LITERAL?", 2, 0, false);
        declareFunction("appropriate_antecedent_meaning_sentenceP", "APPROPRIATE-ANTECEDENT-MEANING-SENTENCE?", 5, 0, false);
        declareFunction("appropriate_antecedent_literalP", "APPROPRIATE-ANTECEDENT-LITERAL?", 1, 0, false);
        declareFunction("appropriate_antecedent_comparison_literalP", "APPROPRIATE-ANTECEDENT-COMPARISON-LITERAL?", 4, 0, false);
        declareFunction("antecedent_logical_field_joinable_with_consequent_logical_fieldsP", "ANTECEDENT-LOGICAL-FIELD-JOINABLE-WITH-CONSEQUENT-LOGICAL-FIELDS?", 3, 0, false);
        declareFunction("appropriate_antecedent_other_literalP", "APPROPRIATE-ANTECEDENT-OTHER-LITERAL?", 5, 0, false);
        declareFunction("logical_schema_meaning_sentence_gafs", "LOGICAL-SCHEMA-MEANING-SENTENCE-GAFS", 1, 1, false);
        declareFunction("logical_schema_meaning_sentence_gafs_memoized_internal", "LOGICAL-SCHEMA-MEANING-SENTENCE-GAFS-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction("logical_schema_meaning_sentence_gafs_memoized", "LOGICAL-SCHEMA-MEANING-SENTENCE-GAFS-MEMOIZED", 2, 0, false);
        declareFunction("logical_schema_meaning_sentence_gafs_int", "LOGICAL-SCHEMA-MEANING-SENTENCE-GAFS-INT", 1, 0, false);
        declareFunction("logical_schema_consequent_conditional_meaning_sentence_gafs", "LOGICAL-SCHEMA-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAFS", 1, 3, false);
        declareFunction("logical_schema_consequent_conditional_meaning_sentence_gafs_memoized_internal", "LOGICAL-SCHEMA-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAFS-MEMOIZED-INTERNAL", 2, 2, false);
        declareFunction("logical_schema_consequent_conditional_meaning_sentence_gafs_memoized", "LOGICAL-SCHEMA-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAFS-MEMOIZED", 2, 2, false);
        declareFunction("logical_schema_consequent_conditional_meaning_sentence_gafs_int", "LOGICAL-SCHEMA-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAFS-INT", 1, 2, false);
        declareFunction("logical_schema_unindexed_consequent_conditional_meaning_sentence_gafs", "LOGICAL-SCHEMA-UNINDEXED-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAFS", 1, 0, false);
        declareFunction("meaning_sentence_pred_relevantP_internal", "MEANING-SENTENCE-PRED-RELEVANT?-INTERNAL", 3, 1, false);
        declareFunction("meaning_sentence_pred_relevantP", "MEANING-SENTENCE-PRED-RELEVANT?", 3, 1, false);
        declareFunction("relevant_logical_schema_meaning_sentence_gafs", "RELEVANT-LOGICAL-SCHEMA-MEANING-SENTENCE-GAFS", 3, 2, false);
        declareFunction("relevant_logical_schema_meaning_sentence_gafs_memoized_internal", "RELEVANT-LOGICAL-SCHEMA-MEANING-SENTENCE-GAFS-MEMOIZED-INTERNAL", 5, 0, false);
        declareFunction("relevant_logical_schema_meaning_sentence_gafs_memoized", "RELEVANT-LOGICAL-SCHEMA-MEANING-SENTENCE-GAFS-MEMOIZED", 5, 0, false);
        declareFunction("relevant_logical_schema_meaning_sentence_gafs_int", "RELEVANT-LOGICAL-SCHEMA-MEANING-SENTENCE-GAFS-INT", 4, 0, false);
        declareFunction("relevant_logical_schema_consequent_conditional_meaning_sentence_gafs", "RELEVANT-LOGICAL-SCHEMA-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAFS", 3, 4, false);
        declareFunction("relevant_logical_schema_consequent_conditional_meaning_sentence_gafs_memoized_internal", "RELEVANT-LOGICAL-SCHEMA-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAFS-MEMOIZED-INTERNAL", 4, 3, false);
        declareFunction("relevant_logical_schema_consequent_conditional_meaning_sentence_gafs_memoized", "RELEVANT-LOGICAL-SCHEMA-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAFS-MEMOIZED", 4, 3, false);
        declareFunction("logical_schema_conditional_meaning_sentence_gafs_internal", "LOGICAL-SCHEMA-CONDITIONAL-MEANING-SENTENCE-GAFS-INTERNAL", 1, 1, false);
        declareFunction("logical_schema_conditional_meaning_sentence_gafs", "LOGICAL-SCHEMA-CONDITIONAL-MEANING-SENTENCE-GAFS", 1, 1, false);
        declareFunction("relevant_logical_schema_consequent_conditional_meaning_sentence_gafs_int", "RELEVANT-LOGICAL-SCHEMA-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAFS-INT", 3, 3, false);
        declareFunction("asserted_logical_schema_meaning_sentences", "ASSERTED-LOGICAL-SCHEMA-MEANING-SENTENCES", 1, 1, false);
        declareFunction("logical_schema_meaning_sentences", "LOGICAL-SCHEMA-MEANING-SENTENCES", 1, 3, false);
        declareFunction("logical_schema_consequent_meaning_sentences", "LOGICAL-SCHEMA-CONSEQUENT-MEANING-SENTENCES", 1, 5, false);
        declareFunction("logical_schemata_meaning_sentence_gafs", "LOGICAL-SCHEMATA-MEANING-SENTENCE-GAFS", 1, 1, false);
        declareFunction("logical_schemata_consequent_conditional_meaning_sentence_gafs", "LOGICAL-SCHEMATA-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAFS", 1, 2, false);
        declareFunction("relevant_logical_schemata_meaning_sentence_gafs", "RELEVANT-LOGICAL-SCHEMATA-MEANING-SENTENCE-GAFS", 3, 2, false);
        declareFunction("relevant_logical_schemata_consequent_conditional_meaning_sentence_gafs", "RELEVANT-LOGICAL-SCHEMATA-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAFS", 3, 2, false);
        declareFunction("relevant_logical_schema_meaning_sentences_internal", "RELEVANT-LOGICAL-SCHEMA-MEANING-SENTENCES-INTERNAL", 2, 2, false);
        declareFunction("relevant_logical_schema_meaning_sentences", "RELEVANT-LOGICAL-SCHEMA-MEANING-SENTENCES", 2, 2, false);
        declareFunction("relevant_logical_schema_conditional_meaning_sentences_internal", "RELEVANT-LOGICAL-SCHEMA-CONDITIONAL-MEANING-SENTENCES-INTERNAL", 2, 2, false);
        declareFunction("relevant_logical_schema_conditional_meaning_sentences", "RELEVANT-LOGICAL-SCHEMA-CONDITIONAL-MEANING-SENTENCES", 2, 2, false);
        declareFunction("logical_schema_meaning_sentence_gafs_for_pred", "LOGICAL-SCHEMA-MEANING-SENTENCE-GAFS-FOR-PRED", 2, 1, false);
        declareFunction("logical_schema_consequent_conditional_meaning_sentence_gafs_for_pred", "LOGICAL-SCHEMA-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAFS-FOR-PRED", 2, 1, false);
        declareFunction("logical_schema_meaning_sentences_for_pred", "LOGICAL-SCHEMA-MEANING-SENTENCES-FOR-PRED", 2, 2, false);
        declareFunction("logical_schema_consequent_meaning_sentences_for_pred", "LOGICAL-SCHEMA-CONSEQUENT-MEANING-SENTENCES-FOR-PRED", 2, 2, false);
        declareFunction("logical_schemata_meaning_sentence_gafs_for_pred", "LOGICAL-SCHEMATA-MEANING-SENTENCE-GAFS-FOR-PRED", 2, 1, false);
        declareFunction("logical_schemata_consequent_conditional_meaning_sentence_gafs_for_pred", "LOGICAL-SCHEMATA-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAFS-FOR-PRED", 2, 1, false);
        declareFunction("logical_schema_meaning_sentence_preds", "LOGICAL-SCHEMA-MEANING-SENTENCE-PREDS", 1, 2, false);
        declareFunction("logical_schema_meaning_sentence_predP", "LOGICAL-SCHEMA-MEANING-SENTENCE-PRED?", 2, 2, false);
        declareFunction("logical_schema_consequent_meaning_sentence_preds", "LOGICAL-SCHEMA-CONSEQUENT-MEANING-SENTENCE-PREDS", 1, 2, false);
        declareFunction("logical_schema_consequent_meaning_sentence_predP", "LOGICAL-SCHEMA-CONSEQUENT-MEANING-SENTENCE-PRED?", 2, 2, false);
        declareFunction("logical_schema_all_relevant_preds", "LOGICAL-SCHEMA-ALL-RELEVANT-PREDS", 1, 1, false);
        declareFunction("logical_schema_all_relevant_preds_memoized_internal", "LOGICAL-SCHEMA-ALL-RELEVANT-PREDS-MEMOIZED-INTERNAL", 3, 0, false);
        declareFunction("logical_schema_all_relevant_preds_memoized", "LOGICAL-SCHEMA-ALL-RELEVANT-PREDS-MEMOIZED", 3, 0, false);
        declareFunction("sksi_code_mapping_predicates_for_logical_field_indexical_internal", "SKSI-CODE-MAPPING-PREDICATES-FOR-LOGICAL-FIELD-INDEXICAL-INTERNAL", 1, 1, false);
        declareFunction("sksi_code_mapping_predicates_for_logical_field_indexical", "SKSI-CODE-MAPPING-PREDICATES-FOR-LOGICAL-FIELD-INDEXICAL", 1, 1, false);
        declareFunction("meaning_sentences_type_check", "MEANING-SENTENCES-TYPE-CHECK", 2, 4, false);
        declareFunction("meaning_sentence_type_check", "MEANING-SENTENCE-TYPE-CHECK", 2, 6, false);
        declareFunction("meaning_sentence_type_check_memoized_internal", "MEANING-SENTENCE-TYPE-CHECK-MEMOIZED-INTERNAL", 6, 0, false);
        declareFunction("meaning_sentence_type_check_memoized", "MEANING-SENTENCE-TYPE-CHECK-MEMOIZED", 6, 0, false);
        declareFunction("meaning_sentence_type_check_int", "MEANING-SENTENCE-TYPE-CHECK-INT", 5, 3, false);
        declareFunction("meaning_sentence_arg_type_check", "MEANING-SENTENCE-ARG-TYPE-CHECK", 2, 4, false);
        declareFunction("meaning_sentence_arg_type_check_memoized_internal", "MEANING-SENTENCE-ARG-TYPE-CHECK-MEMOIZED-INTERNAL", 5, 0, false);
        declareFunction("meaning_sentence_arg_type_check_memoized", "MEANING-SENTENCE-ARG-TYPE-CHECK-MEMOIZED", 5, 0, false);
        declareFunction("meaning_sentence_arg_type_check_int", "MEANING-SENTENCE-ARG-TYPE-CHECK-INT", 5, 1, false);
        declareFunction("meaning_sentence_gaf_type_check", "MEANING-SENTENCE-GAF-TYPE-CHECK", 2, 4, false);
        declareFunction("meaning_sentence_gafs_type_check", "MEANING-SENTENCE-GAFS-TYPE-CHECK", 2, 4, false);
        declareFunction("generate_robust_pattern_for_meaning_sentence", "GENERATE-ROBUST-PATTERN-FOR-MEANING-SENTENCE", 1, 2, false);
        declareFunction("generate_robust_pattern_for_meaning_sentence_args", "GENERATE-ROBUST-PATTERN-FOR-MEANING-SENTENCE-ARGS", 1, 2, false);
        declareFunction("generate_weak_pattern_for_meaning_sentence", "GENERATE-WEAK-PATTERN-FOR-MEANING-SENTENCE", 1, 2, false);
        declareFunction("generate_strict_pattern_for_meaning_sentence", "GENERATE-STRICT-PATTERN-FOR-MEANING-SENTENCE", 1, 2, false);
        declareFunction("generate_strict_pattern_for_meaning_sentence_args", "GENERATE-STRICT-PATTERN-FOR-MEANING-SENTENCE-ARGS", 1, 2, false);
        declareFunction("generate_strict_pattern_for_meaning_sentence_arg", "GENERATE-STRICT-PATTERN-FOR-MEANING-SENTENCE-ARG", 1, 2, false);
        declareFunction("generate_pedantic_pattern_for_meaning_sentence", "GENERATE-PEDANTIC-PATTERN-FOR-MEANING-SENTENCE", 1, 2, false);
        declareFunction("generate_pattern_for_meaning_sentence_memoized_internal", "GENERATE-PATTERN-FOR-MEANING-SENTENCE-MEMOIZED-INTERNAL", 5, 1, false);
        declareFunction("generate_pattern_for_meaning_sentence_memoized", "GENERATE-PATTERN-FOR-MEANING-SENTENCE-MEMOIZED", 5, 1, false);
        declareFunction("generate_pattern_for_meaning_sentence", "GENERATE-PATTERN-FOR-MEANING-SENTENCE", 4, 1, false);
        declareFunction("transitive_args_for_meaning_sentence_predicate", "TRANSITIVE-ARGS-FOR-MEANING-SENTENCE-PREDICATE", 1, 0, false);
        declareFunction("generate_pattern_for_meaning_sentence_args", "GENERATE-PATTERN-FOR-MEANING-SENTENCE-ARGS", 4, 2, false);
        declareFunction("generate_pattern_for_meaning_sentence_arg", "GENERATE-PATTERN-FOR-MEANING-SENTENCE-ARG", 4, 2, false);
        declareFunction("generate_pattern_for_meaning_sentence_arg_memoized_internal", "GENERATE-PATTERN-FOR-MEANING-SENTENCE-ARG-MEMOIZED-INTERNAL", 4, 1, false);
        declareFunction("generate_pattern_for_meaning_sentence_arg_memoized", "GENERATE-PATTERN-FOR-MEANING-SENTENCE-ARG-MEMOIZED", 4, 1, false);
        declareFunction("generate_pattern_for_meaning_sentence_arg_int", "GENERATE-PATTERN-FOR-MEANING-SENTENCE-ARG-INT", 3, 2, false);
        declareFunction("generate_pattern_for_logical_field_indexical", "GENERATE-PATTERN-FOR-LOGICAL-FIELD-INDEXICAL", 2, 1, false);
        declareFunction("generate_pattern_for_el_variable", "GENERATE-PATTERN-FOR-EL-VARIABLE", 2, 0, false);
        declareFunction("generate_pattern_for_collection", "GENERATE-PATTERN-FOR-COLLECTION", 2, 1, false);
        declareFunction("generate_pattern_for_predicate", "GENERATE-PATTERN-FOR-PREDICATE", 2, 0, false);
        declareFunction("generate_pattern_for_nat", "GENERATE-PATTERN-FOR-NAT", 2, 0, false);
        declareFunction("ist_meaning_sentence_gaf_p", "IST-MEANING-SENTENCE-GAF-P", 1, 0, false);
        declareFunction("unwrap_meaning_sentence_if_ist", "UNWRAP-MEANING-SENTENCE-IF-IST", 1, 0, false);
        declareFunction("sksi_reconstruct_meaning_sentence", "SKSI-RECONSTRUCT-MEANING-SENTENCE", 1, 0, false);
        declareFunction("possibly_nart_el_formula_wXo_logical_field_indexicals_p", "POSSIBLY-NART-EL-FORMULA-W/O-LOGICAL-FIELD-INDEXICALS-P", 1, 0, false);
        declareFunction("sksi_valid_meaning_sentence_pred_p_internal", "SKSI-VALID-MEANING-SENTENCE-PRED-P-INTERNAL", 2, 0, false);
        declareFunction("sksi_valid_meaning_sentence_pred_p", "SKSI-VALID-MEANING-SENTENCE-PRED-P", 2, 0, false);
        declareFunction("sksi_valid_meaning_sentence_pred_for_storage_p_internal", "SKSI-VALID-MEANING-SENTENCE-PRED-FOR-STORAGE-P-INTERNAL", 2, 0, false);
        declareFunction("sksi_valid_meaning_sentence_pred_for_storage_p", "SKSI-VALID-MEANING-SENTENCE-PRED-FOR-STORAGE-P", 2, 0, false);
        declareFunction("meaning_sentence_logical_field_indexicals", "MEANING-SENTENCE-LOGICAL-FIELD-INDEXICALS", 1, 0, false);
        declareFunction("logical_schema_logical_field_indexicals_used_in_meaning_sentences", "LOGICAL-SCHEMA-LOGICAL-FIELD-INDEXICALS-USED-IN-MEANING-SENTENCES", 1, 0, false);
        declareFunction("meaning_sentence_logical_fields", "MEANING-SENTENCE-LOGICAL-FIELDS", 1, 0, false);
        declareFunction("meaning_sentence_logical_field_indexical_p_internal", "MEANING-SENTENCE-LOGICAL-FIELD-INDEXICAL-P-INTERNAL", 2, 0, false);
        declareFunction("meaning_sentence_logical_field_indexical_p", "MEANING-SENTENCE-LOGICAL-FIELD-INDEXICAL-P", 2, 0, false);
        declareFunction("meaning_sentence_with_logical_field_indexical_predicateP", "MEANING-SENTENCE-WITH-LOGICAL-FIELD-INDEXICAL-PREDICATE?", 1, 0, false);
        declareFunction("possibly_constrain_consequent_meaning_sentence", "POSSIBLY-CONSTRAIN-CONSEQUENT-MEANING-SENTENCE", 2, 0, false);
        declareFunction("antecedent_meaning_sentence_constraining_lfi_as_non_lfi", "ANTECEDENT-MEANING-SENTENCE-CONSTRAINING-LFI-AS-NON-LFI", 2, 0, false);
        declareFunction("atomic_sentence_constraining_lfi_as_non_lfi", "ATOMIC-SENTENCE-CONSTRAINING-LFI-AS-NON-LFI", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_sksi_meaning_sentence_utilities_file() {
        defparameter("*APPROPRIATE-ANTECEDENT-LITERAL-TMP-ARGS*", NIL);
        return NIL;
    }

    public static final SubLObject setup_sksi_meaning_sentence_utilities_file_alt() {
        memoization_state.note_memoized_function(GET_RELEVANT_MEANING_SENTENCE_FROM_GAF);
        memoization_state.note_memoized_function(SUPPORTED_CONDITIONAL_MEANING_SENTENCE_GAF_INT);
        memoization_state.note_memoized_function(LOGICAL_SCHEMA_MEANING_SENTENCE_GAFS_MEMOIZED);
        memoization_state.note_memoized_function($sym35$LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_GAFS_MEMOI);
        memoization_state.note_memoized_function($sym37$MEANING_SENTENCE_PRED_RELEVANT_);
        memoization_state.note_memoized_function(RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCE_GAFS_MEMOIZED);
        memoization_state.note_memoized_function($sym43$RELEVANT_LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_G);
        memoization_state.note_memoized_function(LOGICAL_SCHEMA_CONDITIONAL_MEANING_SENTENCE_GAFS);
        memoization_state.note_memoized_function(RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCES);
        memoization_state.note_memoized_function(RELEVANT_LOGICAL_SCHEMA_CONDITIONAL_MEANING_SENTENCES);
        memoization_state.note_memoized_function(LOGICAL_SCHEMA_ALL_RELEVANT_PREDS_MEMOIZED);
        memoization_state.note_memoized_function(SKSI_CODE_MAPPING_PREDICATES_FOR_LOGICAL_FIELD_INDEXICAL);
        memoization_state.note_memoized_function(MEANING_SENTENCE_TYPE_CHECK_MEMOIZED);
        memoization_state.note_memoized_function(MEANING_SENTENCE_ARG_TYPE_CHECK_MEMOIZED);
        memoization_state.note_memoized_function(GENERATE_PATTERN_FOR_MEANING_SENTENCE_MEMOIZED);
        memoization_state.note_memoized_function(GENERATE_PATTERN_FOR_MEANING_SENTENCE_ARG_MEMOIZED);
        memoization_state.note_memoized_function(SKSI_VALID_MEANING_SENTENCE_PRED_P);
        memoization_state.note_memoized_function(SKSI_VALID_MEANING_SENTENCE_PRED_FOR_STORAGE_P);
        memoization_state.note_memoized_function(MEANING_SENTENCE_LOGICAL_FIELD_INDEXICAL_P);
        return NIL;
    }

    public static SubLObject setup_sksi_meaning_sentence_utilities_file() {
        if (SubLFiles.USE_V1) {
            memoization_state.note_memoized_function(GET_RELEVANT_MEANING_SENTENCE_FROM_GAF);
            memoization_state.note_memoized_function(SUPPORTED_CONDITIONAL_MEANING_SENTENCE_GAF_INT);
            memoization_state.note_memoized_function(LOGICAL_SCHEMA_MEANING_SENTENCE_GAFS_MEMOIZED);
            memoization_state.note_memoized_function($sym34$LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_GAFS_MEMOI);
            memoization_state.note_memoized_function($sym36$MEANING_SENTENCE_PRED_RELEVANT_);
            memoization_state.note_memoized_function(RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCE_GAFS_MEMOIZED);
            memoization_state.note_memoized_function($sym42$RELEVANT_LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_G);
            memoization_state.note_memoized_function(LOGICAL_SCHEMA_CONDITIONAL_MEANING_SENTENCE_GAFS);
            memoization_state.note_memoized_function(RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCES);
            memoization_state.note_memoized_function(RELEVANT_LOGICAL_SCHEMA_CONDITIONAL_MEANING_SENTENCES);
            memoization_state.note_memoized_function(LOGICAL_SCHEMA_ALL_RELEVANT_PREDS_MEMOIZED);
            memoization_state.note_memoized_function(SKSI_CODE_MAPPING_PREDICATES_FOR_LOGICAL_FIELD_INDEXICAL);
            memoization_state.note_memoized_function(MEANING_SENTENCE_TYPE_CHECK_MEMOIZED);
            memoization_state.note_memoized_function(MEANING_SENTENCE_ARG_TYPE_CHECK_MEMOIZED);
            memoization_state.note_memoized_function(GENERATE_PATTERN_FOR_MEANING_SENTENCE_MEMOIZED);
            memoization_state.note_memoized_function(GENERATE_PATTERN_FOR_MEANING_SENTENCE_ARG_MEMOIZED);
            memoization_state.note_memoized_function(SKSI_VALID_MEANING_SENTENCE_PRED_P);
            memoization_state.note_memoized_function(SKSI_VALID_MEANING_SENTENCE_PRED_FOR_STORAGE_P);
            memoization_state.note_memoized_function(MEANING_SENTENCE_LOGICAL_FIELD_INDEXICAL_P);
        }
        if (SubLFiles.USE_V2) {
            memoization_state.note_memoized_function($sym35$LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_GAFS_MEMOI);
            memoization_state.note_memoized_function($sym37$MEANING_SENTENCE_PRED_RELEVANT_);
            memoization_state.note_memoized_function($sym43$RELEVANT_LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_G);
        }
        return NIL;
    }

    public static SubLObject setup_sksi_meaning_sentence_utilities_file_Previous() {
        memoization_state.note_memoized_function(GET_RELEVANT_MEANING_SENTENCE_FROM_GAF);
        memoization_state.note_memoized_function(SUPPORTED_CONDITIONAL_MEANING_SENTENCE_GAF_INT);
        memoization_state.note_memoized_function(LOGICAL_SCHEMA_MEANING_SENTENCE_GAFS_MEMOIZED);
        memoization_state.note_memoized_function($sym34$LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_GAFS_MEMOI);
        memoization_state.note_memoized_function($sym36$MEANING_SENTENCE_PRED_RELEVANT_);
        memoization_state.note_memoized_function(RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCE_GAFS_MEMOIZED);
        memoization_state.note_memoized_function($sym42$RELEVANT_LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_G);
        memoization_state.note_memoized_function(LOGICAL_SCHEMA_CONDITIONAL_MEANING_SENTENCE_GAFS);
        memoization_state.note_memoized_function(RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCES);
        memoization_state.note_memoized_function(RELEVANT_LOGICAL_SCHEMA_CONDITIONAL_MEANING_SENTENCES);
        memoization_state.note_memoized_function(LOGICAL_SCHEMA_ALL_RELEVANT_PREDS_MEMOIZED);
        memoization_state.note_memoized_function(SKSI_CODE_MAPPING_PREDICATES_FOR_LOGICAL_FIELD_INDEXICAL);
        memoization_state.note_memoized_function(MEANING_SENTENCE_TYPE_CHECK_MEMOIZED);
        memoization_state.note_memoized_function(MEANING_SENTENCE_ARG_TYPE_CHECK_MEMOIZED);
        memoization_state.note_memoized_function(GENERATE_PATTERN_FOR_MEANING_SENTENCE_MEMOIZED);
        memoization_state.note_memoized_function(GENERATE_PATTERN_FOR_MEANING_SENTENCE_ARG_MEMOIZED);
        memoization_state.note_memoized_function(SKSI_VALID_MEANING_SENTENCE_PRED_P);
        memoization_state.note_memoized_function(SKSI_VALID_MEANING_SENTENCE_PRED_FOR_STORAGE_P);
        memoization_state.note_memoized_function(MEANING_SENTENCE_LOGICAL_FIELD_INDEXICAL_P);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_meaning_sentence_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_meaning_sentence_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_meaning_sentence_utilities_file();
    }

    

    static private final SubLList $list_alt2 = list(list(makeSymbol("LOGICAL-SCHEMA"), makeSymbol("MEANING-SENTENCE")), makeSymbol("MEANING-SENTENCE-GAF"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt5 = list(list(makeSymbol("ANTECEDENT-LOGICAL-SCHEMATA"), makeSymbol("ANTECEDENT-MEANING-SENTENCE"), makeSymbol("CONSEQUENT-LOGICAL-SCHEMATA"), makeSymbol("CONSEQUENT-MEANING-SENTENCE")), makeSymbol("CONDITIONAL-MEANING-SENTENCE-GAF"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt11 = list(list(makeSymbol("ANTECEDENT-LOGICAL-SCHEMATA"), makeSymbol("ANTECEDENT-MEANING-SENTENCE"), makeSymbol("CONSEQUENT-LOGICAL-SCHEMATA"), makeSymbol("CONSEQUENT-MEANING-SENTENCE")), makeSymbol("CONDITIONAL-MEANING-SENTENCE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $kw18$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLSymbol $sym21$SINGLETON_ = makeSymbol("SINGLETON?");

    static private final SubLList $list_alt22 = list(makeSymbol("MEANING-SENTENCES"), makeSymbol("CON-MS"), makeSymbol("ANT-LS-SET"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym27$LOGICAL_FIELD_INDEXICAL_FOR_SCHEMA_ = makeSymbol("LOGICAL-FIELD-INDEXICAL-FOR-SCHEMA?");

    static private final SubLSymbol $sym28$APPROPRIATE_ANTECEDENT_LITERAL_ = makeSymbol("APPROPRIATE-ANTECEDENT-LITERAL?");

    static private final SubLList $list_alt29 = list(makeSymbol("MEANING-SENTENCES"), makeSymbol("CON-LFS"), makeSymbol("ANT-LS-SET"));

    static private final SubLSymbol $sym30$LOGICAL_FIELDS_JOINABLE_ = makeSymbol("LOGICAL-FIELDS-JOINABLE?");

    static private final SubLSymbol $sym35$LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_GAFS_MEMOI = makeSymbol("LOGICAL-SCHEMA-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAFS-MEMOIZED");

    static private final SubLSymbol $sym37$MEANING_SENTENCE_PRED_RELEVANT_ = makeSymbol("MEANING-SENTENCE-PRED-RELEVANT?");

    static private final SubLSymbol $sym43$RELEVANT_LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_G = makeSymbol("RELEVANT-LOGICAL-SCHEMA-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAFS-MEMOIZED");

    static private final SubLString $str_alt63$Unknown_strength__a_ = makeString("Unknown strength ~a.");

    static private final SubLList $list_alt65 = list(TWO_INTEGER);

    static private final SubLSymbol $sym66$_ = makeSymbol("=");

    static private final SubLSymbol $sym82$POSSIBLY_NART_EL_FORMULA_W_O_LOGICAL_FIELD_INDEXICALS_P = makeSymbol("POSSIBLY-NART-EL-FORMULA-W/O-LOGICAL-FIELD-INDEXICALS-P");
}

/**
 * Total time: 614 ms
 */
