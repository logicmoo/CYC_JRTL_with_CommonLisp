/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.query_sks;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.list_to_elf;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg1;
import static com.cyc.cycjava.cycl.el_utilities.literal_args;
import static com.cyc.cycjava.cycl.el_utilities.literal_predicate;
import static com.cyc.cycjava.cycl.el_utilities.make_negation;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.acons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sublis;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sksi_hl_support_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sksi_hl_support_utilities();



    // defparameter
    // Definitions
    // The dynamically bound list of supports we're gathering
    /**
     * The dynamically bound list of supports we're gathering
     */
    @LispMethod(comment = "The dynamically bound list of supports we\'re gathering\ndefparameter")
    public static final SubLSymbol $sksi_supports$ = makeSymbol("*SKSI-SUPPORTS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $sksi_support_predicate_ordering$ = makeSymbol("*SKSI-SUPPORT-PREDICATE-ORDERING*");

    // defparameter
    // The dynamically bound list of supports we're gathering
    /**
     * The dynamically bound list of supports we're gathering
     */
    @LispMethod(comment = "The dynamically bound list of supports we\'re gathering\ndefparameter")
    private static final SubLSymbol $csql_supports$ = makeSymbol("*CSQL-SUPPORTS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $csql_support_predicate_ordering$ = makeSymbol("*CSQL-SUPPORT-PREDICATE-ORDERING*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $source_schema_object_fn_equals_rule_el$ = makeSymbol("*SOURCE-SCHEMA-OBJECT-FN-EQUALS-RULE-EL*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $source_schema_object_fn_equals_rule$ = makeSymbol("*SOURCE-SCHEMA-OBJECT-FN-EQUALS-RULE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $source_schema_object_fn_undefined_unknown_el$ = makeSymbol("*SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-UNKNOWN-EL*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $source_schema_object_fn_undefined_rule_el$ = makeSymbol("*SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-RULE-EL*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $source_schema_object_fn_undefined_rule$ = makeSymbol("*SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-RULE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $source_schema_object_fn_not_undefined_rule_el$ = makeSymbol("*SOURCE-SCHEMA-OBJECT-FN-NOT-UNDEFINED-RULE-EL*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $source_schema_object_fn_not_undefined_rule$ = makeSymbol("*SOURCE-SCHEMA-OBJECT-FN-NOT-UNDEFINED-RULE*");

    private static final SubLList $list2 = list(new SubLObject[]{ reader_make_constant_shell("meaningSentenceOfSchema"), reader_make_constant_shell("conditionalMeaningSentenceOfSchema"), reader_make_constant_shell("logicalPhysicalSchemaMap"), reader_make_constant_shell("physicalSchemaSourceMap"), reader_make_constant_shell("contentMt"), reader_make_constant_shell("logicalFieldEncoding"), reader_make_constant_shell("fieldEncoding"), reader_make_constant_shell("physicalFieldEncoding"), reader_make_constant_shell("physicalFieldDecoding"), reader_make_constant_shell("fieldDecoding"), reader_make_constant_shell("logicalFieldDecoding"), reader_make_constant_shell("rewriteOf"), reader_make_constant_shell("rowInSourceClaims"), reader_make_constant_shell("sourceClaims"), reader_make_constant_shell("salientURL") });

    private static final SubLSymbol SUPPORT_SENTENCE_OPERATOR = makeSymbol("SUPPORT-SENTENCE-OPERATOR");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLList $list6 = list(makeKeyword("CACHE-INFERENCE-RESULTS?"), NIL, makeKeyword("BROWSABLE?"), T, makeKeyword("REWRITE-ALLOWED?"), T, makeKeyword("ALLOWED-MODULES"), list(makeKeyword("MODULE-SUBTYPE"), $SKSI));



    private static final SubLList $list8 = list(reader_make_constant_shell("SchemaObjectIDFn"), reader_make_constant_shell("SourceSchemaObjectIDFn"));

    private static final SubLSymbol $schema_object_fn_identity_rule$ = makeSymbol("*SCHEMA-OBJECT-FN-IDENTITY-RULE*");

    private static final SubLList $list10 = list(reader_make_constant_shell("rewriteOf"), makeSymbol("?ID"), list(reader_make_constant_shell("SchemaObjectIDFn"), makeSymbol("?LOGICAL-SCHEMA"), list(reader_make_constant_shell("SchemaObjectFn"), makeSymbol("?LOGICAL-SCHEMA"), makeSymbol("?ID"))));

    private static final SubLSymbol $source_schema_object_fn_identity_rule$ = makeSymbol("*SOURCE-SCHEMA-OBJECT-FN-IDENTITY-RULE*");

    private static final SubLList $list12 = list(reader_make_constant_shell("rewriteOf"), makeSymbol("?ID"), list(reader_make_constant_shell("SourceSchemaObjectIDFn"), makeSymbol("?LOGICAL-SCHEMA"), list(reader_make_constant_shell("SourceSchemaObjectFn"), makeSymbol("?SKS"), makeSymbol("?LOGICAL-SCHEMA"), makeSymbol("?ID"))));

    private static final SubLSymbol $schema_object_id_fn_sks_code_mapping_rule$ = makeSymbol("*SCHEMA-OBJECT-ID-FN-SKS-CODE-MAPPING-RULE*");

    private static final SubLList $list14 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("codeMapping"), makeSymbol("?LOGICAL-SCHEMA"), makeSymbol("?RAW"), makeSymbol("?CYCL")), list(reader_make_constant_shell("rewriteOf"), makeSymbol("?RAW"), list(reader_make_constant_shell("SchemaObjectIDFn"), makeSymbol("?LOGICAL-SCHEMA"), makeSymbol("?CYCL"))));

    private static final SubLSymbol $source_schema_object_id_fn_sks_code_mapping_rule$ = makeSymbol("*SOURCE-SCHEMA-OBJECT-ID-FN-SKS-CODE-MAPPING-RULE*");

    static private final SubLList $list16 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("codeMapping"), makeSymbol("?LOGICAL-SCHEMA"), makeSymbol("?RAW"), makeSymbol("?CYCL")), list(reader_make_constant_shell("rewriteOf"), makeSymbol("?RAW"), list(reader_make_constant_shell("SourceSchemaObjectIDFn"), makeSymbol("?SKS"), makeSymbol("?LOGICAL-SCHEMA"), makeSymbol("?CYCL"))));

    private static final SubLList $list17 = list(makeSymbol("REWRITE-OF"), makeSymbol("OUTPUT"), makeSymbol("NAUT"));

    static private final SubLString $str18$SKSI_reformulate_justify_got_an_u = makeString("SKSI reformulate justify got an unexpected literal ~a");

    private static final SubLString $str19$SKSI_reformulate_justify_got_an_u = makeString("SKSI reformulate justify got an unexpected naut ~a");









    private static final SubLString $str25$SKSI_reformulate_justify_got_an_u = makeString("SKSI reformulate justify got an unexpected naut");











    static private final SubLList $list36 = list(new SubLObject[]{ reader_make_constant_shell("subKS-Direct"), reader_make_constant_shell("structuredKnowledgeSourceName"), reader_make_constant_shell("sksIsa"), reader_make_constant_shell("serverOfSKS"), reader_make_constant_shell("portNumberForSKS"), reader_make_constant_shell("userNameForSKS"), reader_make_constant_shell("passwordForSKS"), reader_make_constant_shell("sqlProgramForSKS"), reader_make_constant_shell("subProtocolForSKS"), reader_make_constant_shell("filenameForSKS"), reader_make_constant_shell("keyTestFunctionForSKS"), reader_make_constant_shell("valueTestFunctionForSKS"), reader_make_constant_shell("serializationTypeForSKS") });

    static private final SubLList $list37 = list(reader_make_constant_shell("implies"), list(new SubLObject[]{ reader_make_constant_shell("and"), list(reader_make_constant_shell("logicalFields"), makeSymbol("?LS1"), makeSymbol("?LF1")), list(reader_make_constant_shell("logicalSchemaSourceMap"), makeSymbol("?LS1"), makeSymbol("?SUB-KS1")), list(reader_make_constant_shell("subKS"), makeSymbol("?KS1"), makeSymbol("?SUB-KS1")), list(reader_make_constant_shell("subKS"), makeSymbol("?TOP"), makeSymbol("?KS1")), list(reader_make_constant_shell("subKS"), makeSymbol("?TOP"), makeSymbol("?KS2")), list(reader_make_constant_shell("subKS"), makeSymbol("?KS2"), makeSymbol("?SUB-KS2")), list(reader_make_constant_shell("logicalSchemaSourceMap"), makeSymbol("?LS2"), makeSymbol("?SUB-KS2")), list(reader_make_constant_shell("logicalFields"), makeSymbol("?LS2"), makeSymbol("?LF2")), list(reader_make_constant_shell("joinable"), makeSymbol("?LF2"), makeSymbol("?OF")), list(reader_make_constant_shell("joinable"), makeSymbol("?LF1"), makeSymbol("?OF")), list(reader_make_constant_shell("objectField"), makeSymbol("?ODS"), makeSymbol("?OF")) }), list(reader_make_constant_shell("equals"), list(reader_make_constant_shell("SourceSchemaObjectFn"), makeSymbol("?KS1"), makeSymbol("?ODS"), makeSymbol("?ID")), list(reader_make_constant_shell("SourceSchemaObjectFn"), makeSymbol("?KS2"), makeSymbol("?ODS"), makeSymbol("?ID"))));

    static private final SubLList $list38 = list(reader_make_constant_shell("unknownSentence"), list(reader_make_constant_shell("thereExists"), makeSymbol("?SUB-KS"), list(reader_make_constant_shell("thereExists"), makeSymbol("?LS"), list(reader_make_constant_shell("thereExists"), makeSymbol("?LF"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("logicalFields"), makeSymbol("?LS"), makeSymbol("?LF")), list(reader_make_constant_shell("joinable"), makeSymbol("?LF"), makeSymbol("?OF")), list(reader_make_constant_shell("logicalSchemaSourceMap"), makeSymbol("?LS"), makeSymbol("?SUB-KS")), list(reader_make_constant_shell("subKS"), makeSymbol("?KS"), makeSymbol("?SUB-KS")))))));

    static private final SubLList $list39 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("objectField"), makeSymbol("?ODS"), makeSymbol("?OF")), list(reader_make_constant_shell("unknownSentence"), list(reader_make_constant_shell("thereExists"), makeSymbol("?SUB-KS"), list(reader_make_constant_shell("thereExists"), makeSymbol("?LS"), list(reader_make_constant_shell("thereExists"), makeSymbol("?LF"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("logicalFields"), makeSymbol("?LS"), makeSymbol("?LF")), list(reader_make_constant_shell("joinable"), makeSymbol("?LF"), makeSymbol("?OF")), list(reader_make_constant_shell("logicalSchemaSourceMap"), makeSymbol("?LS"), makeSymbol("?SUB-KS")), list(reader_make_constant_shell("subKS"), makeSymbol("?KS"), makeSymbol("?SUB-KS")))))))), list(reader_make_constant_shell("undefined"), list(reader_make_constant_shell("SourceSchemaObjectFn"), makeSymbol("?KS"), makeSymbol("?ODS"), makeSymbol("??ID"))));

    private static final SubLList $list40 = list(reader_make_constant_shell("not"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("logicalFields"), makeSymbol("?LS"), makeSymbol("?LF")), list(reader_make_constant_shell("logicalSchemaSourceMap"), makeSymbol("?LS"), makeSymbol("?SUB-KS")), list(reader_make_constant_shell("subKS"), makeSymbol("?KS"), makeSymbol("?SUB-KS")), list(reader_make_constant_shell("joinable"), makeSymbol("?LF"), makeSymbol("?OF")), list(reader_make_constant_shell("objectField"), makeSymbol("?ODS"), makeSymbol("?OF")), list(reader_make_constant_shell("undefined"), list(reader_make_constant_shell("SourceSchemaObjectFn"), makeSymbol("?KS"), makeSymbol("?ODS"), makeSymbol("??ID")))));







    static private final SubLList $list44 = list(makeSymbol("EXP1"), makeSymbol("EXP2"));

    static private final SubLList $list45 = list(makeSymbol("EXP"));

    static private final SubLList $list46 = list(makeSymbol("EXPRESSION"));

    private static final SubLList $list47 = list(makeSymbol("FN"), makeSymbol("SKS"), makeSymbol("ODS"), makeSymbol("ID"));

    private static final SubLSymbol $sym48$_KS = makeSymbol("?KS");

    private static final SubLSymbol $sym49$_OF = makeSymbol("?OF");

    public static final SubLObject note_sksi_support_alt(SubLObject support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $sksi_supports$.setDynamicValue(cons(support, $sksi_supports$.getDynamicValue(thread)), thread);
            return NIL;
        }
    }

    public static SubLObject note_sksi_support(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($sksi_supports$.getDynamicValue(thread).isList()) {
            $sksi_supports$.setDynamicValue(cons(support, $sksi_supports$.getDynamicValue(thread)), thread);
            return NIL;
        }
        return NIL;
    }

    public static final SubLObject sksi_supports_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list_utilities.remove_if_not(SUPPORT_P, $sksi_supports$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject sksi_supports() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($sksi_supports$.getDynamicValue(thread).isList()) {
            return list_utilities.remove_if_not(SUPPORT_P, $sksi_supports$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    /**
     *
     *
     * @return list of support-p
     */
    @LispMethod(comment = "@return list of support-p")
    public static final SubLObject sksi_justify_int_alt(SubLObject literal, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sksi_query_utilities.comparison_literal_p(literal)) {
                return com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities.sksi_comparison_literal_supports(literal, mt);
            } else {
                if (NIL != sksi_query_utilities.evaluate_literal_p(literal)) {
                    return com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities.sksi_evaluate_literal_supports(literal, mt);
                } else {
                    if (NIL != sksi_query_utilities.sksi_unknown_sentence_literal_p(literal)) {
                        return com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities.sksi_unknown_sentence_literal_supports(literal, mt);
                    }
                }
            }
            {
                SubLObject data_level_supports = NIL;
                SubLObject modules_used = NIL;
                {
                    SubLObject _prev_bind_0 = $sksi_supports$.currentBinding(thread);
                    try {
                        $sksi_supports$.bind(NIL, thread);
                        modules_used = com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities.sksi_modules_used_to_answer(literal, mt);
                        data_level_supports = copy_list(com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities.sksi_supports());
                    } finally {
                        $sksi_supports$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == modules_used) {
                    return NIL;
                }
                {
                    SubLObject module = modules_used.first();
                    SubLObject module_level_supports = copy_list(sksi_removal_module_generation.sksi_module_supports(module));
                    SubLObject supports = nconc(data_level_supports, module_level_supports);
                    return com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities.sksi_sort_supports(supports);
                }
            }
        }
    }

    /**
     *
     *
     * @return list of support-p
     */
    @LispMethod(comment = "@return list of support-p")
    public static SubLObject sksi_justify_int(final SubLObject literal, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sksi_query_utilities.comparison_literal_p(literal)) {
            return sksi_comparison_literal_supports(literal, mt);
        }
        if (NIL != sksi_query_utilities.evaluate_literal_p(literal)) {
            return sksi_evaluate_literal_supports(literal, mt);
        }
        if (NIL != sksi_query_utilities.sksi_unknown_sentence_literal_p(literal)) {
            return sksi_unknown_sentence_literal_supports(literal, mt);
        }
        SubLObject data_level_supports = NIL;
        SubLObject modules_used = NIL;
        final SubLObject _prev_bind_0 = $sksi_supports$.currentBinding(thread);
        try {
            $sksi_supports$.bind(NIL, thread);
            modules_used = sksi_modules_used_to_answer(literal, mt);
            data_level_supports = copy_list(sksi_supports());
        } finally {
            $sksi_supports$.rebind(_prev_bind_0, thread);
        }
        if (NIL == modules_used) {
            return NIL;
        }
        final SubLObject module = modules_used.first();
        final SubLObject module_level_supports = copy_list(sksi_removal_module_generation.sksi_module_supports(module));
        final SubLObject supports = nconc(data_level_supports, module_level_supports);
        return sksi_sort_supports(supports);
    }

    public static final SubLObject sksi_sort_supports_alt(SubLObject supports) {
        return list_utilities.sort_via_position(supports, $sksi_support_predicate_ordering$.getGlobalValue(), symbol_function(EQL), symbol_function(SUPPORT_SENTENCE_OPERATOR));
    }

    public static SubLObject sksi_sort_supports(final SubLObject supports) {
        return list_utilities.sort_via_position(supports, $sksi_support_predicate_ordering$.getGlobalValue(), symbol_function(EQL), symbol_function(SUPPORT_SENTENCE_OPERATOR));
    }

    /**
     *
     *
     * @return listp; a set of the SKSI modules used to answer SENTENCE in MT
     */
    @LispMethod(comment = "@return listp; a set of the SKSI modules used to answer SENTENCE in MT")
    public static final SubLObject sksi_modules_used_to_answer_alt(SubLObject sentence, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject modules_used = NIL;
                SubLObject ignore_errors_tag = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                            try {
                                thread.resetMultipleValues();
                                {
                                    SubLObject result = inference_kernel.new_cyc_query(sentence, mt, $list_alt5);
                                    SubLObject halt_reason = thread.secondMultipleValue();
                                    SubLObject inference = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    modules_used = inference_utilities.inference_removal_modules_used_in_proofs(inference);
                                    inference_datastructures_inference.destroy_inference_and_problem_store(inference);
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                }
                return modules_used;
            }
        }
    }

    /**
     *
     *
     * @return listp; a set of the SKSI modules used to answer SENTENCE in MT
     */
    @LispMethod(comment = "@return listp; a set of the SKSI modules used to answer SENTENCE in MT")
    public static SubLObject sksi_modules_used_to_answer(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject modules_used = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    thread.resetMultipleValues();
                    final SubLObject result = inference_kernel.new_cyc_query(sentence, mt, $list6);
                    final SubLObject halt_reason = thread.secondMultipleValue();
                    final SubLObject inference = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    modules_used = inference_utilities.inference_removal_modules_used_in_proofs(inference);
                    inference_datastructures_inference.destroy_inference_and_problem_store(inference);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return modules_used;
    }

    public static final SubLObject sksi_reformulate_justify_applicableP_alt(SubLObject literal, SubLObject mt) {
        if (($$rewriteOf == cycl_utilities.formula_operator(literal)) && (NIL != possibly_naut_p(cycl_utilities.formula_arg2(literal, UNPROVIDED)))) {
            {
                SubLObject func = cycl_utilities.nat_functor(cycl_utilities.formula_arg2(literal, UNPROVIDED));
                return list_utilities.member_eqP(func, $list_alt7);
            }
        }
        return NIL;
    }

    public static SubLObject sksi_reformulate_justify_applicableP(final SubLObject literal, final SubLObject mt) {
        if ((NIL != kb_utilities.kbeq($$rewriteOf, cycl_utilities.formula_operator(literal))) && (NIL != possibly_naut_p(cycl_utilities.formula_arg2(literal, UNPROVIDED)))) {
            final SubLObject func = cycl_utilities.nat_functor(cycl_utilities.formula_arg2(literal, UNPROVIDED));
            return list_utilities.member_eqP(func, $list8);
        }
        return NIL;
    }

    /**
     *
     *
     * @return list of support-p
     */
    @LispMethod(comment = "@return list of support-p")
    public static final SubLObject sksi_reformulate_justify_int_alt(SubLObject literal, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = literal;
                SubLObject current = datum;
                SubLObject rewrite_of = NIL;
                SubLObject output = NIL;
                SubLObject naut = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt16);
                rewrite_of = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt16);
                output = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt16);
                naut = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if ($$rewriteOf != rewrite_of) {
                            Errors.error($str_alt17$SKSI_reformulate_justify_got_an_u, literal);
                        }
                    }
                    {
                        SubLObject func = cycl_utilities.nat_functor(naut);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == list_utilities.member_eqP(func, $list_alt7)) {
                                Errors.error($str_alt18$SKSI_reformulate_justify_got_an_u, naut);
                            }
                        }
                        {
                            SubLObject logical_schema = NIL;
                            SubLObject expression = NIL;
                            if (func == $$SchemaObjectIDFn) {
                                logical_schema = cycl_utilities.nat_arg1(naut, UNPROVIDED);
                                expression = cycl_utilities.nat_arg2(naut, UNPROVIDED);
                            } else {
                                logical_schema = cycl_utilities.nat_arg2(naut, UNPROVIDED);
                                expression = cycl_utilities.nat_arg3(naut, UNPROVIDED);
                            }
                            if (NIL != possibly_naut_p(expression)) {
                                if ((func == $$SchemaObjectIDFn) && ($$SchemaObjectFn == cycl_utilities.nat_functor(expression))) {
                                    return list(arguments.make_hl_support($CODE, $schema_object_fn_identity_rule$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
                                } else {
                                    if ((func == $$SourceSchemaObjectIDFn) && ($$SourceSchemaObjectFn == cycl_utilities.nat_functor(expression))) {
                                        return list(arguments.make_hl_support($CODE, $source_schema_object_fn_identity_rule$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
                                    } else {
                                        Errors.warn($str_alt24$SKSI_reformulate_justify_got_an_u, naut);
                                    }
                                }
                            } else {
                                {
                                    SubLObject mapping_mt = sksi_kb_accessors.content_mt_to_mapping_mt(mt);
                                    SubLObject result = NIL;
                                    SubLObject mt_var = mapping_mt;
                                    {
                                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                            {
                                                SubLObject pred_var = $$codeMapping;
                                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(logical_schema, ONE_INTEGER, pred_var)) {
                                                    {
                                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(logical_schema, ONE_INTEGER, pred_var);
                                                        SubLObject done_var = result;
                                                        SubLObject token_var = NIL;
                                                        while (NIL == done_var) {
                                                            {
                                                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                                if (NIL != valid) {
                                                                    {
                                                                        SubLObject final_index_iterator = NIL;
                                                                        try {
                                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                            {
                                                                                SubLObject done_var_1 = result;
                                                                                SubLObject token_var_2 = NIL;
                                                                                while (NIL == done_var_1) {
                                                                                    {
                                                                                        SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                                                                        SubLObject valid_3 = makeBoolean(token_var_2 != ass);
                                                                                        if (NIL != valid_3) {
                                                                                            {
                                                                                                SubLObject raw = assertions_high.gaf_arg2(ass);
                                                                                                SubLObject cycl = assertions_high.gaf_arg3(ass);
                                                                                                if (cycl.equal(expression) && raw.equal(output)) {
                                                                                                    if (func == $$SchemaObjectIDFn) {
                                                                                                        result = list(ass, arguments.make_hl_support($CODE, $schema_object_id_fn_sks_code_mapping_rule$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
                                                                                                    } else {
                                                                                                        result = list(ass, arguments.make_hl_support($CODE, $source_schema_object_id_fn_sks_code_mapping_rule$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        done_var_1 = makeBoolean((NIL == valid_3) || (NIL != result));
                                                                                    }
                                                                                } 
                                                                            }
                                                                        } finally {
                                                                            {
                                                                                SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                    if (NIL != final_index_iterator) {
                                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                    }
                                                                                } finally {
                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                done_var = makeBoolean((NIL == valid) || (NIL != result));
                                                            }
                                                        } 
                                                    }
                                                }
                                            }
                                        } finally {
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                    return result;
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt16);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return list of support-p
     */
    @LispMethod(comment = "@return list of support-p")
    public static SubLObject sksi_reformulate_justify_int(final SubLObject literal, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rewrite_of = NIL;
        SubLObject output = NIL;
        SubLObject naut = NIL;
        destructuring_bind_must_consp(literal, literal, $list17);
        rewrite_of = literal.first();
        SubLObject current = literal.rest();
        destructuring_bind_must_consp(current, literal, $list17);
        output = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, literal, $list17);
        naut = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == kb_utilities.kbeq($$rewriteOf, rewrite_of))) {
                Errors.error($str18$SKSI_reformulate_justify_got_an_u, literal);
            }
            final SubLObject func = cycl_utilities.nat_functor(naut);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.member_eqP(func, $list8))) {
                Errors.error($str19$SKSI_reformulate_justify_got_an_u, naut);
            }
            SubLObject logical_schema = NIL;
            SubLObject expression = NIL;
            if (NIL != kb_utilities.kbeq(func, $$SchemaObjectIDFn)) {
                logical_schema = cycl_utilities.nat_arg1(naut, UNPROVIDED);
                expression = cycl_utilities.nat_arg2(naut, UNPROVIDED);
            } else {
                logical_schema = cycl_utilities.nat_arg2(naut, UNPROVIDED);
                expression = cycl_utilities.nat_arg3(naut, UNPROVIDED);
            }
            if (NIL == possibly_naut_p(expression)) {
                final SubLObject mapping_mt = sksi_kb_accessors.content_mt_to_mapping_mt(mt);
                SubLObject result = NIL;
                final SubLObject mt_var = mapping_mt;
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    final SubLObject pred_var = $$codeMapping;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(logical_schema, ONE_INTEGER, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(logical_schema, ONE_INTEGER, pred_var);
                        SubLObject done_var = result;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$1 = result;
                                    final SubLObject token_var_$2 = NIL;
                                    while (NIL == done_var_$1) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                        final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(ass));
                                        if (NIL != valid_$3) {
                                            final SubLObject raw = assertions_high.gaf_arg2(ass);
                                            final SubLObject cycl = assertions_high.gaf_arg3(ass);
                                            if (cycl.equal(expression) && raw.equal(output)) {
                                                if (NIL != kb_utilities.kbeq(func, $$SchemaObjectIDFn)) {
                                                    result = list(ass, arguments.make_hl_support($CODE, $schema_object_id_fn_sks_code_mapping_rule$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
                                                } else {
                                                    result = list(ass, arguments.make_hl_support($CODE, $source_schema_object_id_fn_sks_code_mapping_rule$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
                                                }
                                            }
                                        }
                                        done_var_$1 = makeBoolean((NIL == valid_$3) || (NIL != result));
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean((NIL == valid) || (NIL != result));
                        } 
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
                return result;
            }
            if ((NIL != kb_utilities.kbeq(func, $$SchemaObjectIDFn)) && (NIL != kb_utilities.kbeq($$SchemaObjectFn, cycl_utilities.nat_functor(expression)))) {
                return list(arguments.make_hl_support($CODE, $schema_object_fn_identity_rule$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
            }
            if ((NIL != kb_utilities.kbeq(func, $$SourceSchemaObjectIDFn)) && (NIL != kb_utilities.kbeq($$SourceSchemaObjectFn, cycl_utilities.nat_functor(expression)))) {
                return list(arguments.make_hl_support($CODE, $source_schema_object_fn_identity_rule$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
            }
            Errors.warn($str25$SKSI_reformulate_justify_got_an_u, naut);
        } else {
            cdestructuring_bind_error(literal, $list17);
        }
        return NIL;
    }

    public static final SubLObject sksi_comparison_literal_supports_alt(SubLObject literal, SubLObject mt) {
        {
            SubLObject sks = sksi_kb_accessors.content_mt_sk_source_in_any_mt(mt);
            SubLObject new_sentence = list_to_elf(list($$sourceClaims, sks, literal));
            return list(arguments.make_hl_support($CSQL, new_sentence, mt, UNPROVIDED));
        }
    }

    public static SubLObject sksi_comparison_literal_supports(final SubLObject literal, final SubLObject mt) {
        final SubLObject sks = sksi_kb_accessors.content_mt_sk_source_in_any_mt(mt);
        final SubLObject new_sentence = list_to_elf(list($$sourceClaims, sks, literal));
        return list(arguments.make_hl_support($CSQL, new_sentence, mt, UNPROVIDED));
    }

    public static final SubLObject sksi_evaluate_literal_supports_alt(SubLObject literal, SubLObject mt) {
        {
            SubLObject sks = sksi_kb_accessors.content_mt_sk_source_in_any_mt(mt);
            SubLObject new_sentence = list_to_elf(list($$sourceClaims, sks, literal));
            return list(arguments.make_hl_support($CSQL, new_sentence, mt, UNPROVIDED));
        }
    }

    public static SubLObject sksi_evaluate_literal_supports(final SubLObject literal, final SubLObject mt) {
        final SubLObject sks = sksi_kb_accessors.content_mt_sk_source_in_any_mt(mt);
        final SubLObject new_sentence = list_to_elf(list($$sourceClaims, sks, literal));
        return list(arguments.make_hl_support($CSQL, new_sentence, mt, UNPROVIDED));
    }

    public static final SubLObject sksi_unknown_sentence_literal_supports_alt(SubLObject literal, SubLObject mt) {
        {
            SubLObject sks = sksi_kb_accessors.content_mt_sk_source_in_any_mt(mt);
            SubLObject unknown_sentence = literal_arg1(literal, UNPROVIDED);
            SubLObject negated_sentence = make_negation(unknown_sentence);
            SubLObject new_sentence = list_to_elf(list($$sourceClaims, sks, negated_sentence));
            return list(arguments.make_hl_support($CSQL, new_sentence, mt, UNPROVIDED));
        }
    }

    public static SubLObject sksi_unknown_sentence_literal_supports(final SubLObject literal, final SubLObject mt) {
        final SubLObject sks = sksi_kb_accessors.content_mt_sk_source_in_any_mt(mt);
        final SubLObject unknown_sentence = literal_arg1(literal, UNPROVIDED);
        final SubLObject negated_sentence = make_negation(unknown_sentence);
        final SubLObject new_sentence = list_to_elf(list($$sourceClaims, sks, negated_sentence));
        return list(arguments.make_hl_support($CSQL, new_sentence, mt, UNPROVIDED));
    }

    public static final SubLObject note_csql_support_alt(SubLObject support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $csql_supports$.setDynamicValue(cons(support, $csql_supports$.getDynamicValue(thread)), thread);
            return NIL;
        }
    }

    public static SubLObject note_csql_support(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $csql_supports$.setDynamicValue(cons(support, $csql_supports$.getDynamicValue(thread)), thread);
        return NIL;
    }

    public static final SubLObject csql_supports_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list_utilities.fast_delete_duplicates($csql_supports$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject csql_supports() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.fast_delete_duplicates($csql_supports$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return list of support-p
     */
    @LispMethod(comment = "@return list of support-p")
    public static final SubLObject csql_justify_int_alt(SubLObject sentence, SubLObject mt) {
        {
            SubLObject pred = cycl_utilities.formula_operator(sentence);
            SubLObject pcase_var = pred;
            if ((pcase_var.eql(LIST) || pcase_var.eql($$rowInSourceClaims)) || pcase_var.eql($$sourceClaims)) {
                return com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities.csql_justify_int_row_in_source_claims(sentence, mt);
            } else {
                if (pcase_var.eql($$salientURL)) {
                    return com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities.csql_justify_int_salient_url(sentence, mt);
                } else {
                    return NIL;
                }
            }
        }
    }

    /**
     *
     *
     * @return list of support-p
     */
    @LispMethod(comment = "@return list of support-p")
    public static SubLObject csql_justify_int(final SubLObject sentence, final SubLObject mt) {
        final SubLObject pcase_var;
        final SubLObject pred = pcase_var = cycl_utilities.formula_operator(sentence);
        if ((pcase_var.eql(LIST) || pcase_var.eql($$rowInSourceClaims)) || pcase_var.eql($$sourceClaims)) {
            return csql_justify_int_row_in_source_claims(sentence, mt);
        }
        if (pcase_var.eql($$salientURL)) {
            return csql_justify_int_salient_url(sentence, mt);
        }
        return NIL;
    }

    public static final SubLObject csql_justify_int_row_in_source_claims_alt(SubLObject sentence, SubLObject mt) {
        {
            SubLObject sks = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
            return com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities.csql_justify_int_guts(sks);
        }
    }

    public static SubLObject csql_justify_int_row_in_source_claims(final SubLObject sentence, final SubLObject mt) {
        final SubLObject sks = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
        return csql_justify_int_guts(sks);
    }

    public static final SubLObject csql_justify_int_salient_url_alt(SubLObject sentence, SubLObject mt) {
        {
            SubLObject sks = sksi_kb_accessors.content_mt_sk_source_in_any_mt(mt);
            return com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities.csql_justify_int_guts(sks);
        }
    }

    public static SubLObject csql_justify_int_salient_url(final SubLObject sentence, final SubLObject mt) {
        final SubLObject sks = sksi_kb_accessors.content_mt_sk_source_in_any_mt(mt);
        return csql_justify_int_guts(sks);
    }

    public static final SubLObject csql_justify_int_guts_alt(SubLObject sks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
                SubLObject sentence = list($$physicalSchemaSourceMap, $PHYSICAL_SCHEMA, sks);
                SubLObject physical_schemas = ask_utilities.ask_variable($PHYSICAL_SCHEMA, sentence, mapping_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject physical_schema = physical_schemas.first();
                SubLObject supports = NIL;
                {
                    SubLObject _prev_bind_0 = $csql_supports$.currentBinding(thread);
                    try {
                        $csql_supports$.bind(NIL, thread);
                        {
                            SubLObject mt_var = mapping_mt;
                            {
                                SubLObject _prev_bind_0_5 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                    sksi_access_path.sksi_determine_access_path(sks, physical_schema, UNPROVIDED);
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_5, thread);
                                }
                            }
                            supports = com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities.csql_sort_supports(com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities.csql_supports());
                        }
                    } finally {
                        $csql_supports$.rebind(_prev_bind_0, thread);
                    }
                }
                return supports;
            }
        }
    }

    public static SubLObject csql_justify_int_guts(final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
        final SubLObject sentence = list($$physicalSchemaSourceMap, $PHYSICAL_SCHEMA, sks);
        final SubLObject physical_schemas = ask_utilities.ask_variable($PHYSICAL_SCHEMA, sentence, mapping_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject physical_schema = physical_schemas.first();
        SubLObject supports = NIL;
        final SubLObject _prev_bind_0 = $csql_supports$.currentBinding(thread);
        try {
            $csql_supports$.bind(NIL, thread);
            final SubLObject mt_var = mapping_mt;
            final SubLObject _prev_bind_0_$5 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                sksi_access_path.sksi_determine_access_path(sks, physical_schema, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$5, thread);
            }
            supports = csql_sort_supports(csql_supports());
        } finally {
            $csql_supports$.rebind(_prev_bind_0, thread);
        }
        return supports;
    }

    public static final SubLObject csql_sort_supports_alt(SubLObject supports) {
        return list_utilities.sort_via_position(supports, $csql_support_predicate_ordering$.getGlobalValue(), symbol_function(EQL), symbol_function(SUPPORT_SENTENCE_OPERATOR));
    }

    public static SubLObject csql_sort_supports(final SubLObject supports) {
        return list_utilities.sort_via_position(supports, $csql_support_predicate_ordering$.getGlobalValue(), symbol_function(EQL), symbol_function(SUPPORT_SENTENCE_OPERATOR));
    }

    public static final SubLObject source_schema_object_fn_equals_rule_alt() {
        if (NIL == $source_schema_object_fn_equals_rule$.getGlobalValue()) {
            $source_schema_object_fn_equals_rule$.setGlobalValue(czer_meta.find_assertion_cycl($source_schema_object_fn_equals_rule_el$.getGlobalValue(), $$SKSIMt));
        }
        return $source_schema_object_fn_equals_rule$.getGlobalValue();
    }

    public static SubLObject source_schema_object_fn_equals_rule() {
        if (NIL == $source_schema_object_fn_equals_rule$.getGlobalValue()) {
            $source_schema_object_fn_equals_rule$.setGlobalValue(czer_meta.find_assertion_cycl($source_schema_object_fn_equals_rule_el$.getGlobalValue(), $$SKSIMt));
        }
        return $source_schema_object_fn_equals_rule$.getGlobalValue();
    }

    public static final SubLObject source_schema_object_fn_undefined_rule_alt() {
        if (NIL == $source_schema_object_fn_undefined_rule$.getGlobalValue()) {
            $source_schema_object_fn_undefined_rule$.setGlobalValue(czer_meta.find_assertion_cycl($source_schema_object_fn_undefined_rule_el$.getGlobalValue(), $$SKSIMt));
        }
        return $source_schema_object_fn_undefined_rule$.getGlobalValue();
    }

    public static SubLObject source_schema_object_fn_undefined_rule() {
        if (NIL == $source_schema_object_fn_undefined_rule$.getGlobalValue()) {
            $source_schema_object_fn_undefined_rule$.setGlobalValue(czer_meta.find_assertion_cycl($source_schema_object_fn_undefined_rule_el$.getGlobalValue(), $$SKSIMt));
        }
        return $source_schema_object_fn_undefined_rule$.getGlobalValue();
    }

    public static final SubLObject source_schema_object_fn_not_undefined_rule_alt() {
        if (NIL == $source_schema_object_fn_not_undefined_rule$.getGlobalValue()) {
            $source_schema_object_fn_not_undefined_rule$.setGlobalValue(czer_meta.find_assertion_cycl($source_schema_object_fn_not_undefined_rule_el$.getGlobalValue(), $$SKSIMt));
        }
        return $source_schema_object_fn_not_undefined_rule$.getGlobalValue();
    }

    public static SubLObject source_schema_object_fn_not_undefined_rule() {
        if (NIL == $source_schema_object_fn_not_undefined_rule$.getGlobalValue()) {
            $source_schema_object_fn_not_undefined_rule$.setGlobalValue(czer_meta.find_assertion_cycl($source_schema_object_fn_not_undefined_rule_el$.getGlobalValue(), $$SKSIMt));
        }
        return $source_schema_object_fn_not_undefined_rule$.getGlobalValue();
    }

    public static final SubLObject source_schema_object_fn_hl_support_verify_alt(SubLObject literal, SubLObject mt) {
        {
            SubLObject pcase_var = literal_predicate(literal, UNPROVIDED);
            if (pcase_var.eql($$equals)) {
                return com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities.source_schema_object_fn_hl_support_verify_equals(literal, mt);
            } else {
                if (pcase_var.eql($$undefined)) {
                    return com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities.source_schema_object_fn_hl_support_verify_undefined(literal, mt);
                } else {
                    return NIL;
                }
            }
        }
    }

    public static SubLObject source_schema_object_fn_hl_support_verify(final SubLObject literal, final SubLObject mt) {
        final SubLObject pcase_var = literal_predicate(literal, UNPROVIDED);
        if (pcase_var.eql($$equals)) {
            return source_schema_object_fn_hl_support_verify_equals(literal, mt);
        }
        if (pcase_var.eql($$undefined)) {
            return source_schema_object_fn_hl_support_verify_undefined(literal, mt);
        }
        return NIL;
    }

    public static final SubLObject source_schema_object_fn_hl_support_verify_equals_alt(SubLObject literal, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject verifiedP = NIL;
                SubLObject datum = literal_args(literal, UNPROVIDED);
                SubLObject current = datum;
                SubLObject exp1 = NIL;
                SubLObject exp2 = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt43);
                exp1 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt43);
                exp2 = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject mt_var = mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                verifiedP = sksi_infrastructure_utilities.source_schema_object_fn_expressions_equalP(exp1, exp2);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt43);
                }
                return verifiedP;
            }
        }
    }

    public static SubLObject source_schema_object_fn_hl_support_verify_equals(final SubLObject literal, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject verifiedP = NIL;
        SubLObject current;
        final SubLObject datum = current = literal_args(literal, UNPROVIDED);
        SubLObject exp1 = NIL;
        SubLObject exp2 = NIL;
        destructuring_bind_must_consp(current, datum, $list44);
        exp1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list44);
        exp2 = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
                verifiedP = sksi_infrastructure_utilities.source_schema_object_fn_expressions_equalP(exp1, exp2);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else {
            cdestructuring_bind_error(datum, $list44);
        }
        return verifiedP;
    }

    public static final SubLObject source_schema_object_fn_hl_support_verify_undefined_alt(SubLObject literal, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject verifiedP = NIL;
                SubLObject datum = literal_args(literal, UNPROVIDED);
                SubLObject current = datum;
                SubLObject exp = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt44);
                exp = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject mt_var = mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                verifiedP = (NIL != cycl_utilities.negatedP(literal)) ? ((SubLObject) (sksi_infrastructure_utilities.source_schema_object_fn_expression_possibly_definedP(exp))) : sksi_infrastructure_utilities.source_schema_object_fn_expression_undefinedP(exp);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt44);
                }
                return verifiedP;
            }
        }
    }

    public static SubLObject source_schema_object_fn_hl_support_verify_undefined(final SubLObject literal, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject verifiedP = NIL;
        SubLObject current;
        final SubLObject datum = current = literal_args(literal, UNPROVIDED);
        SubLObject exp = NIL;
        destructuring_bind_must_consp(current, datum, $list45);
        exp = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
                verifiedP = (NIL != cycl_utilities.negatedP(literal)) ? sksi_infrastructure_utilities.source_schema_object_fn_expression_possibly_definedP(exp) : sksi_infrastructure_utilities.source_schema_object_fn_expression_undefinedP(exp);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else {
            cdestructuring_bind_error(datum, $list45);
        }
        return verifiedP;
    }

    public static final SubLObject source_schema_object_fn_hl_support_justify_alt(SubLObject literal, SubLObject mt) {
        {
            SubLObject pcase_var = literal_predicate(literal, UNPROVIDED);
            if (pcase_var.eql($$equals)) {
                return com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities.source_schema_object_fn_hl_support_justify_equals(literal, mt);
            } else {
                if (pcase_var.eql($$undefined)) {
                    return com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities.source_schema_object_fn_hl_support_justify_undefined(literal, mt);
                } else {
                    return NIL;
                }
            }
        }
    }

    public static SubLObject source_schema_object_fn_hl_support_justify(final SubLObject literal, final SubLObject mt) {
        final SubLObject pcase_var = literal_predicate(literal, UNPROVIDED);
        if (pcase_var.eql($$equals)) {
            return source_schema_object_fn_hl_support_justify_equals(literal, mt);
        }
        if (pcase_var.eql($$undefined)) {
            return source_schema_object_fn_hl_support_justify_undefined(literal, mt);
        }
        return NIL;
    }

    public static final SubLObject source_schema_object_fn_hl_support_justify_equals_alt(SubLObject literal, SubLObject mt) {
        {
            SubLObject justification = NIL;
            SubLObject datum = literal_args(literal, UNPROVIDED);
            SubLObject current = datum;
            SubLObject exp1 = NIL;
            SubLObject exp2 = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt43);
            exp1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt43);
            exp2 = current.first();
            current = current.rest();
            if (NIL == current) {
                justification = sksi_infrastructure_utilities.source_schema_object_fn_expressions_equal(exp1, exp2, T);
            } else {
                cdestructuring_bind_error(datum, $list_alt43);
            }
            if (NIL != justification) {
                justification = cons(com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities.source_schema_object_fn_equals_rule(), justification);
            }
            return justification;
        }
    }

    public static SubLObject source_schema_object_fn_hl_support_justify_equals(final SubLObject literal, final SubLObject mt) {
        SubLObject justification = NIL;
        SubLObject current;
        final SubLObject datum = current = literal_args(literal, UNPROVIDED);
        SubLObject exp1 = NIL;
        SubLObject exp2 = NIL;
        destructuring_bind_must_consp(current, datum, $list44);
        exp1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list44);
        exp2 = current.first();
        current = current.rest();
        if (NIL == current) {
            justification = sksi_infrastructure_utilities.source_schema_object_fn_expressions_equal(exp1, exp2, T);
        } else {
            cdestructuring_bind_error(datum, $list44);
        }
        if (NIL != justification) {
            justification = cons(source_schema_object_fn_equals_rule(), justification);
        }
        return justification;
    }

    public static final SubLObject source_schema_object_fn_hl_support_justify_undefined_alt(SubLObject literal, SubLObject mt) {
        {
            SubLObject datum = literal_args(literal, UNPROVIDED);
            SubLObject current = datum;
            SubLObject expression = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt45);
            expression = current.first();
            current = current.rest();
            if (NIL == current) {
                return NIL != cycl_utilities.negatedP(literal) ? ((SubLObject) (com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities.source_schema_object_fn_hl_support_justify_undefined_neg(expression))) : com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities.source_schema_object_fn_hl_support_justify_undefined_pos(expression);
            } else {
                cdestructuring_bind_error(datum, $list_alt45);
            }
        }
        return NIL;
    }

    public static SubLObject source_schema_object_fn_hl_support_justify_undefined(final SubLObject literal, final SubLObject mt) {
        SubLObject current;
        final SubLObject datum = current = literal_args(literal, UNPROVIDED);
        SubLObject expression = NIL;
        destructuring_bind_must_consp(current, datum, $list46);
        expression = current.first();
        current = current.rest();
        if (NIL == current) {
            return NIL != cycl_utilities.negatedP(literal) ? source_schema_object_fn_hl_support_justify_undefined_neg(expression) : source_schema_object_fn_hl_support_justify_undefined_pos(expression);
        }
        cdestructuring_bind_error(datum, $list46);
        return NIL;
    }

    public static final SubLObject source_schema_object_fn_hl_support_justify_undefined_pos_alt(SubLObject expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject justification = sksi_infrastructure_utilities.source_schema_object_fn_expression_undefined_int(expression);
                SubLObject object_field = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != justification) {
                    {
                        SubLObject datum = expression;
                        SubLObject current = datum;
                        SubLObject fn = NIL;
                        SubLObject sks = NIL;
                        SubLObject ods = NIL;
                        SubLObject id = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt46);
                        fn = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt46);
                        sks = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt46);
                        ods = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt46);
                        id = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
                                SubLObject alist = acons($sym47$_KS, sks, acons($sym48$_OF, object_field, NIL));
                                SubLObject unknown_literal = sublis(alist, $source_schema_object_fn_undefined_unknown_el$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                                SubLObject unknown_support = arguments.make_hl_support($CODE, unknown_literal, mapping_mt, UNPROVIDED);
                                justification = cons(unknown_support, justification);
                                justification = cons(com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities.source_schema_object_fn_undefined_rule(), justification);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt46);
                        }
                    }
                }
                return justification;
            }
        }
    }

    public static SubLObject source_schema_object_fn_hl_support_justify_undefined_pos(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject justification = sksi_infrastructure_utilities.source_schema_object_fn_expression_undefined_int(expression);
        final SubLObject object_field = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != justification) {
            SubLObject fn = NIL;
            SubLObject sks = NIL;
            SubLObject ods = NIL;
            SubLObject id = NIL;
            destructuring_bind_must_consp(expression, expression, $list47);
            fn = expression.first();
            SubLObject current = expression.rest();
            destructuring_bind_must_consp(current, expression, $list47);
            sks = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, expression, $list47);
            ods = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, expression, $list47);
            id = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
                final SubLObject alist = acons($sym48$_KS, sks, acons($sym49$_OF, object_field, NIL));
                final SubLObject unknown_literal = sublis(alist, $source_schema_object_fn_undefined_unknown_el$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                final SubLObject unknown_support = arguments.make_hl_support($CODE, unknown_literal, mapping_mt, UNPROVIDED);
                justification = cons(unknown_support, justification);
                justification = cons(source_schema_object_fn_undefined_rule(), justification);
            } else {
                cdestructuring_bind_error(expression, $list47);
            }
        }
        return justification;
    }

    public static final SubLObject source_schema_object_fn_hl_support_justify_undefined_neg_alt(SubLObject expression) {
        {
            SubLObject supports = sksi_infrastructure_utilities.source_schema_object_fn_expression_possibly_defined(expression);
            if (NIL != supports) {
                supports = cons(com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities.source_schema_object_fn_not_undefined_rule(), supports);
            }
            return supports;
        }
    }

    public static SubLObject source_schema_object_fn_hl_support_justify_undefined_neg(final SubLObject expression) {
        SubLObject supports = sksi_infrastructure_utilities.source_schema_object_fn_expression_possibly_defined(expression);
        if (NIL != supports) {
            supports = cons(source_schema_object_fn_not_undefined_rule(), supports);
        }
        return supports;
    }

    public static SubLObject declare_sksi_hl_support_utilities_file() {
        declareFunction("note_sksi_support", "NOTE-SKSI-SUPPORT", 1, 0, false);
        declareFunction("sksi_supports", "SKSI-SUPPORTS", 0, 0, false);
        declareFunction("sksi_justify_int", "SKSI-JUSTIFY-INT", 2, 0, false);
        declareFunction("sksi_sort_supports", "SKSI-SORT-SUPPORTS", 1, 0, false);
        declareFunction("sksi_modules_used_to_answer", "SKSI-MODULES-USED-TO-ANSWER", 2, 0, false);
        declareFunction("sksi_reformulate_justify_applicableP", "SKSI-REFORMULATE-JUSTIFY-APPLICABLE?", 2, 0, false);
        declareFunction("sksi_reformulate_justify_int", "SKSI-REFORMULATE-JUSTIFY-INT", 2, 0, false);
        declareFunction("sksi_comparison_literal_supports", "SKSI-COMPARISON-LITERAL-SUPPORTS", 2, 0, false);
        declareFunction("sksi_evaluate_literal_supports", "SKSI-EVALUATE-LITERAL-SUPPORTS", 2, 0, false);
        declareFunction("sksi_unknown_sentence_literal_supports", "SKSI-UNKNOWN-SENTENCE-LITERAL-SUPPORTS", 2, 0, false);
        declareFunction("note_csql_support", "NOTE-CSQL-SUPPORT", 1, 0, false);
        declareFunction("csql_supports", "CSQL-SUPPORTS", 0, 0, false);
        declareFunction("csql_justify_int", "CSQL-JUSTIFY-INT", 2, 0, false);
        declareFunction("csql_justify_int_row_in_source_claims", "CSQL-JUSTIFY-INT-ROW-IN-SOURCE-CLAIMS", 2, 0, false);
        declareFunction("csql_justify_int_salient_url", "CSQL-JUSTIFY-INT-SALIENT-URL", 2, 0, false);
        declareFunction("csql_justify_int_guts", "CSQL-JUSTIFY-INT-GUTS", 1, 0, false);
        declareFunction("csql_sort_supports", "CSQL-SORT-SUPPORTS", 1, 0, false);
        declareFunction("source_schema_object_fn_equals_rule", "SOURCE-SCHEMA-OBJECT-FN-EQUALS-RULE", 0, 0, false);
        declareFunction("source_schema_object_fn_undefined_rule", "SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-RULE", 0, 0, false);
        declareFunction("source_schema_object_fn_not_undefined_rule", "SOURCE-SCHEMA-OBJECT-FN-NOT-UNDEFINED-RULE", 0, 0, false);
        declareFunction("source_schema_object_fn_hl_support_verify", "SOURCE-SCHEMA-OBJECT-FN-HL-SUPPORT-VERIFY", 2, 0, false);
        declareFunction("source_schema_object_fn_hl_support_verify_equals", "SOURCE-SCHEMA-OBJECT-FN-HL-SUPPORT-VERIFY-EQUALS", 2, 0, false);
        declareFunction("source_schema_object_fn_hl_support_verify_undefined", "SOURCE-SCHEMA-OBJECT-FN-HL-SUPPORT-VERIFY-UNDEFINED", 2, 0, false);
        declareFunction("source_schema_object_fn_hl_support_justify", "SOURCE-SCHEMA-OBJECT-FN-HL-SUPPORT-JUSTIFY", 2, 0, false);
        declareFunction("source_schema_object_fn_hl_support_justify_equals", "SOURCE-SCHEMA-OBJECT-FN-HL-SUPPORT-JUSTIFY-EQUALS", 2, 0, false);
        declareFunction("source_schema_object_fn_hl_support_justify_undefined", "SOURCE-SCHEMA-OBJECT-FN-HL-SUPPORT-JUSTIFY-UNDEFINED", 2, 0, false);
        declareFunction("source_schema_object_fn_hl_support_justify_undefined_pos", "SOURCE-SCHEMA-OBJECT-FN-HL-SUPPORT-JUSTIFY-UNDEFINED-POS", 1, 0, false);
        declareFunction("source_schema_object_fn_hl_support_justify_undefined_neg", "SOURCE-SCHEMA-OBJECT-FN-HL-SUPPORT-JUSTIFY-UNDEFINED-NEG", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt1 = list(new SubLObject[]{ reader_make_constant_shell("meaningSentenceOfSchema"), reader_make_constant_shell("conditionalMeaningSentenceOfSchema"), reader_make_constant_shell("logicalPhysicalSchemaMap"), reader_make_constant_shell("physicalSchemaSourceMap"), reader_make_constant_shell("contentMt"), reader_make_constant_shell("logicalFieldEncoding"), reader_make_constant_shell("fieldEncoding"), reader_make_constant_shell("physicalFieldEncoding"), reader_make_constant_shell("physicalFieldDecoding"), reader_make_constant_shell("fieldDecoding"), reader_make_constant_shell("logicalFieldDecoding"), reader_make_constant_shell("rewriteOf"), reader_make_constant_shell("rowInSourceClaims"), reader_make_constant_shell("sourceClaims"), reader_make_constant_shell("salientURL") });

    public static final SubLObject init_sksi_hl_support_utilities_file_alt() {
        defparameter("*SKSI-SUPPORTS*", NIL);
        deflexical("*SKSI-SUPPORT-PREDICATE-ORDERING*", $list_alt1);
        deflexical("*SCHEMA-OBJECT-FN-IDENTITY-RULE*", NIL != boundp($schema_object_fn_identity_rule$) ? ((SubLObject) ($schema_object_fn_identity_rule$.getGlobalValue())) : $list_alt9);
        deflexical("*SOURCE-SCHEMA-OBJECT-FN-IDENTITY-RULE*", NIL != boundp($source_schema_object_fn_identity_rule$) ? ((SubLObject) ($source_schema_object_fn_identity_rule$.getGlobalValue())) : $list_alt11);
        deflexical("*SCHEMA-OBJECT-ID-FN-SKS-CODE-MAPPING-RULE*", NIL != boundp($schema_object_id_fn_sks_code_mapping_rule$) ? ((SubLObject) ($schema_object_id_fn_sks_code_mapping_rule$.getGlobalValue())) : $list_alt13);
        deflexical("*SOURCE-SCHEMA-OBJECT-ID-FN-SKS-CODE-MAPPING-RULE*", NIL != boundp($source_schema_object_id_fn_sks_code_mapping_rule$) ? ((SubLObject) ($source_schema_object_id_fn_sks_code_mapping_rule$.getGlobalValue())) : $list_alt15);
        defparameter("*CSQL-SUPPORTS*", NIL);
        deflexical("*CSQL-SUPPORT-PREDICATE-ORDERING*", $list_alt35);
        deflexical("*SOURCE-SCHEMA-OBJECT-FN-EQUALS-RULE-EL*", $list_alt36);
        deflexical("*SOURCE-SCHEMA-OBJECT-FN-EQUALS-RULE*", NIL);
        deflexical("*SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-UNKNOWN-EL*", $list_alt37);
        deflexical("*SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-RULE-EL*", $list_alt38);
        deflexical("*SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-RULE*", NIL);
        deflexical("*SOURCE-SCHEMA-OBJECT-FN-NOT-UNDEFINED-RULE-EL*", $list_alt39);
        deflexical("*SOURCE-SCHEMA-OBJECT-FN-NOT-UNDEFINED-RULE*", NIL);
        return NIL;
    }

    public static SubLObject init_sksi_hl_support_utilities_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*SKSI-SUPPORTS*", $UNINITIALIZED);
            deflexical("*SKSI-SUPPORT-PREDICATE-ORDERING*", $list2);
            deflexical("*SCHEMA-OBJECT-FN-IDENTITY-RULE*", SubLTrampolineFile.maybeDefault($schema_object_fn_identity_rule$, $schema_object_fn_identity_rule$, $list10));
            deflexical("*SOURCE-SCHEMA-OBJECT-FN-IDENTITY-RULE*", SubLTrampolineFile.maybeDefault($source_schema_object_fn_identity_rule$, $source_schema_object_fn_identity_rule$, $list12));
            deflexical("*SCHEMA-OBJECT-ID-FN-SKS-CODE-MAPPING-RULE*", SubLTrampolineFile.maybeDefault($schema_object_id_fn_sks_code_mapping_rule$, $schema_object_id_fn_sks_code_mapping_rule$, $list14));
            deflexical("*SOURCE-SCHEMA-OBJECT-ID-FN-SKS-CODE-MAPPING-RULE*", SubLTrampolineFile.maybeDefault($source_schema_object_id_fn_sks_code_mapping_rule$, $source_schema_object_id_fn_sks_code_mapping_rule$, $list16));
            defparameter("*CSQL-SUPPORTS*", NIL);
            deflexical("*CSQL-SUPPORT-PREDICATE-ORDERING*", $list36);
            deflexical("*SOURCE-SCHEMA-OBJECT-FN-EQUALS-RULE-EL*", $list37);
            deflexical("*SOURCE-SCHEMA-OBJECT-FN-EQUALS-RULE*", NIL);
            deflexical("*SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-UNKNOWN-EL*", $list38);
            deflexical("*SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-RULE-EL*", $list39);
            deflexical("*SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-RULE*", NIL);
            deflexical("*SOURCE-SCHEMA-OBJECT-FN-NOT-UNDEFINED-RULE-EL*", $list40);
            deflexical("*SOURCE-SCHEMA-OBJECT-FN-NOT-UNDEFINED-RULE*", NIL);
        }
        if (SubLFiles.USE_V2) {
            defparameter("*SKSI-SUPPORTS*", NIL);
            deflexical("*SKSI-SUPPORT-PREDICATE-ORDERING*", $list_alt1);
            deflexical("*SCHEMA-OBJECT-FN-IDENTITY-RULE*", NIL != boundp($schema_object_fn_identity_rule$) ? ((SubLObject) ($schema_object_fn_identity_rule$.getGlobalValue())) : $list_alt9);
            deflexical("*SOURCE-SCHEMA-OBJECT-FN-IDENTITY-RULE*", NIL != boundp($source_schema_object_fn_identity_rule$) ? ((SubLObject) ($source_schema_object_fn_identity_rule$.getGlobalValue())) : $list_alt11);
            deflexical("*SCHEMA-OBJECT-ID-FN-SKS-CODE-MAPPING-RULE*", NIL != boundp($schema_object_id_fn_sks_code_mapping_rule$) ? ((SubLObject) ($schema_object_id_fn_sks_code_mapping_rule$.getGlobalValue())) : $list_alt13);
            deflexical("*SOURCE-SCHEMA-OBJECT-ID-FN-SKS-CODE-MAPPING-RULE*", NIL != boundp($source_schema_object_id_fn_sks_code_mapping_rule$) ? ((SubLObject) ($source_schema_object_id_fn_sks_code_mapping_rule$.getGlobalValue())) : $list_alt15);
            deflexical("*CSQL-SUPPORT-PREDICATE-ORDERING*", $list_alt35);
            deflexical("*SOURCE-SCHEMA-OBJECT-FN-EQUALS-RULE-EL*", $list_alt36);
            deflexical("*SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-UNKNOWN-EL*", $list_alt37);
            deflexical("*SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-RULE-EL*", $list_alt38);
            deflexical("*SOURCE-SCHEMA-OBJECT-FN-NOT-UNDEFINED-RULE-EL*", $list_alt39);
        }
        return NIL;
    }

    public static SubLObject init_sksi_hl_support_utilities_file_Previous() {
        defparameter("*SKSI-SUPPORTS*", $UNINITIALIZED);
        deflexical("*SKSI-SUPPORT-PREDICATE-ORDERING*", $list2);
        deflexical("*SCHEMA-OBJECT-FN-IDENTITY-RULE*", SubLTrampolineFile.maybeDefault($schema_object_fn_identity_rule$, $schema_object_fn_identity_rule$, $list10));
        deflexical("*SOURCE-SCHEMA-OBJECT-FN-IDENTITY-RULE*", SubLTrampolineFile.maybeDefault($source_schema_object_fn_identity_rule$, $source_schema_object_fn_identity_rule$, $list12));
        deflexical("*SCHEMA-OBJECT-ID-FN-SKS-CODE-MAPPING-RULE*", SubLTrampolineFile.maybeDefault($schema_object_id_fn_sks_code_mapping_rule$, $schema_object_id_fn_sks_code_mapping_rule$, $list14));
        deflexical("*SOURCE-SCHEMA-OBJECT-ID-FN-SKS-CODE-MAPPING-RULE*", SubLTrampolineFile.maybeDefault($source_schema_object_id_fn_sks_code_mapping_rule$, $source_schema_object_id_fn_sks_code_mapping_rule$, $list16));
        defparameter("*CSQL-SUPPORTS*", NIL);
        deflexical("*CSQL-SUPPORT-PREDICATE-ORDERING*", $list36);
        deflexical("*SOURCE-SCHEMA-OBJECT-FN-EQUALS-RULE-EL*", $list37);
        deflexical("*SOURCE-SCHEMA-OBJECT-FN-EQUALS-RULE*", NIL);
        deflexical("*SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-UNKNOWN-EL*", $list38);
        deflexical("*SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-RULE-EL*", $list39);
        deflexical("*SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-RULE*", NIL);
        deflexical("*SOURCE-SCHEMA-OBJECT-FN-NOT-UNDEFINED-RULE-EL*", $list40);
        deflexical("*SOURCE-SCHEMA-OBJECT-FN-NOT-UNDEFINED-RULE*", NIL);
        return NIL;
    }

    static private final SubLList $list_alt5 = list(makeKeyword("CACHE-INFERENCE-RESULTS?"), NIL, makeKeyword("BROWSABLE?"), T, makeKeyword("REWRITE-ALLOWED?"), T, makeKeyword("ALLOWED-MODULES"), list(makeKeyword("MODULE-SUBTYPE"), $SKSI));

    static private final SubLList $list_alt7 = list(reader_make_constant_shell("SchemaObjectIDFn"), reader_make_constant_shell("SourceSchemaObjectIDFn"));

    static private final SubLList $list_alt9 = list(reader_make_constant_shell("rewriteOf"), makeSymbol("?ID"), list(reader_make_constant_shell("SchemaObjectIDFn"), makeSymbol("?LOGICAL-SCHEMA"), list(reader_make_constant_shell("SchemaObjectFn"), makeSymbol("?LOGICAL-SCHEMA"), makeSymbol("?ID"))));

    public static SubLObject setup_sksi_hl_support_utilities_file() {
        declare_defglobal($schema_object_fn_identity_rule$);
        declare_defglobal($source_schema_object_fn_identity_rule$);
        declare_defglobal($schema_object_id_fn_sks_code_mapping_rule$);
        declare_defglobal($source_schema_object_id_fn_sks_code_mapping_rule$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_hl_support_utilities_file();
    }

    static private final SubLList $list_alt11 = list(reader_make_constant_shell("rewriteOf"), makeSymbol("?ID"), list(reader_make_constant_shell("SourceSchemaObjectIDFn"), makeSymbol("?LOGICAL-SCHEMA"), list(reader_make_constant_shell("SourceSchemaObjectFn"), makeSymbol("?SKS"), makeSymbol("?LOGICAL-SCHEMA"), makeSymbol("?ID"))));

    @Override
    public void initializeVariables() {
        init_sksi_hl_support_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_hl_support_utilities_file();
    }

    static {
    }

    static private final SubLList $list_alt13 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("codeMapping"), makeSymbol("?LOGICAL-SCHEMA"), makeSymbol("?RAW"), makeSymbol("?CYCL")), list(reader_make_constant_shell("rewriteOf"), makeSymbol("?RAW"), list(reader_make_constant_shell("SchemaObjectIDFn"), makeSymbol("?LOGICAL-SCHEMA"), makeSymbol("?CYCL"))));

    static private final SubLList $list_alt15 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("codeMapping"), makeSymbol("?LOGICAL-SCHEMA"), makeSymbol("?RAW"), makeSymbol("?CYCL")), list(reader_make_constant_shell("rewriteOf"), makeSymbol("?RAW"), list(reader_make_constant_shell("SourceSchemaObjectIDFn"), makeSymbol("?SKS"), makeSymbol("?LOGICAL-SCHEMA"), makeSymbol("?CYCL"))));

    static private final SubLList $list_alt16 = list(makeSymbol("REWRITE-OF"), makeSymbol("OUTPUT"), makeSymbol("NAUT"));

    static private final SubLString $str_alt17$SKSI_reformulate_justify_got_an_u = makeString("SKSI reformulate justify got an unexpected literal ~a");

    static private final SubLString $str_alt18$SKSI_reformulate_justify_got_an_u = makeString("SKSI reformulate justify got an unexpected naut ~a");

    static private final SubLString $str_alt24$SKSI_reformulate_justify_got_an_u = makeString("SKSI reformulate justify got an unexpected naut");

    static private final SubLList $list_alt35 = list(new SubLObject[]{ reader_make_constant_shell("subKS-Direct"), reader_make_constant_shell("structuredKnowledgeSourceName"), reader_make_constant_shell("sksIsa"), reader_make_constant_shell("serverOfSKS"), reader_make_constant_shell("portNumberForSKS"), reader_make_constant_shell("userNameForSKS"), reader_make_constant_shell("passwordForSKS"), reader_make_constant_shell("sqlProgramForSKS"), reader_make_constant_shell("subProtocolForSKS"), reader_make_constant_shell("filenameForSKS"), reader_make_constant_shell("keyTestFunctionForSKS"), reader_make_constant_shell("valueTestFunctionForSKS"), reader_make_constant_shell("serializationTypeForSKS") });

    static private final SubLList $list_alt36 = list(reader_make_constant_shell("implies"), list(new SubLObject[]{ reader_make_constant_shell("and"), list(reader_make_constant_shell("logicalFields"), makeSymbol("?LS1"), makeSymbol("?LF1")), list(reader_make_constant_shell("logicalSchemaSourceMap"), makeSymbol("?LS1"), makeSymbol("?SUB-KS1")), list(reader_make_constant_shell("subKS"), makeSymbol("?KS1"), makeSymbol("?SUB-KS1")), list(reader_make_constant_shell("subKS"), makeSymbol("?TOP"), makeSymbol("?KS1")), list(reader_make_constant_shell("subKS"), makeSymbol("?TOP"), makeSymbol("?KS2")), list(reader_make_constant_shell("subKS"), makeSymbol("?KS2"), makeSymbol("?SUB-KS2")), list(reader_make_constant_shell("logicalSchemaSourceMap"), makeSymbol("?LS2"), makeSymbol("?SUB-KS2")), list(reader_make_constant_shell("logicalFields"), makeSymbol("?LS2"), makeSymbol("?LF2")), list(reader_make_constant_shell("joinable"), makeSymbol("?LF2"), makeSymbol("?OF")), list(reader_make_constant_shell("joinable"), makeSymbol("?LF1"), makeSymbol("?OF")), list(reader_make_constant_shell("objectField"), makeSymbol("?ODS"), makeSymbol("?OF")) }), list(reader_make_constant_shell("equals"), list(reader_make_constant_shell("SourceSchemaObjectFn"), makeSymbol("?KS1"), makeSymbol("?ODS"), makeSymbol("?ID")), list(reader_make_constant_shell("SourceSchemaObjectFn"), makeSymbol("?KS2"), makeSymbol("?ODS"), makeSymbol("?ID"))));

    static private final SubLList $list_alt37 = list(reader_make_constant_shell("unknownSentence"), list(reader_make_constant_shell("thereExists"), makeSymbol("?SUB-KS"), list(reader_make_constant_shell("thereExists"), makeSymbol("?LS"), list(reader_make_constant_shell("thereExists"), makeSymbol("?LF"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("logicalFields"), makeSymbol("?LS"), makeSymbol("?LF")), list(reader_make_constant_shell("joinable"), makeSymbol("?LF"), makeSymbol("?OF")), list(reader_make_constant_shell("logicalSchemaSourceMap"), makeSymbol("?LS"), makeSymbol("?SUB-KS")), list(reader_make_constant_shell("subKS"), makeSymbol("?KS"), makeSymbol("?SUB-KS")))))));

    static private final SubLList $list_alt38 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("objectField"), makeSymbol("?ODS"), makeSymbol("?OF")), list(reader_make_constant_shell("unknownSentence"), list(reader_make_constant_shell("thereExists"), makeSymbol("?SUB-KS"), list(reader_make_constant_shell("thereExists"), makeSymbol("?LS"), list(reader_make_constant_shell("thereExists"), makeSymbol("?LF"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("logicalFields"), makeSymbol("?LS"), makeSymbol("?LF")), list(reader_make_constant_shell("joinable"), makeSymbol("?LF"), makeSymbol("?OF")), list(reader_make_constant_shell("logicalSchemaSourceMap"), makeSymbol("?LS"), makeSymbol("?SUB-KS")), list(reader_make_constant_shell("subKS"), makeSymbol("?KS"), makeSymbol("?SUB-KS")))))))), list(reader_make_constant_shell("undefined"), list(reader_make_constant_shell("SourceSchemaObjectFn"), makeSymbol("?KS"), makeSymbol("?ODS"), makeSymbol("??ID"))));

    static private final SubLList $list_alt39 = list(reader_make_constant_shell("not"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("logicalFields"), makeSymbol("?LS"), makeSymbol("?LF")), list(reader_make_constant_shell("logicalSchemaSourceMap"), makeSymbol("?LS"), makeSymbol("?SUB-KS")), list(reader_make_constant_shell("subKS"), makeSymbol("?KS"), makeSymbol("?SUB-KS")), list(reader_make_constant_shell("joinable"), makeSymbol("?LF"), makeSymbol("?OF")), list(reader_make_constant_shell("objectField"), makeSymbol("?ODS"), makeSymbol("?OF")), list(reader_make_constant_shell("undefined"), list(reader_make_constant_shell("SourceSchemaObjectFn"), makeSymbol("?KS"), makeSymbol("?ODS"), makeSymbol("??ID")))));

    static private final SubLList $list_alt43 = list(makeSymbol("EXP1"), makeSymbol("EXP2"));

    static private final SubLList $list_alt44 = list(makeSymbol("EXP"));

    static private final SubLList $list_alt45 = list(makeSymbol("EXPRESSION"));

    static private final SubLList $list_alt46 = list(makeSymbol("FN"), makeSymbol("SKS"), makeSymbol("ODS"), makeSymbol("ID"));

    static private final SubLSymbol $sym47$_KS = makeSymbol("?KS");

    static private final SubLSymbol $sym48$_OF = makeSymbol("?OF");
}

/**
 * Total time: 251 ms
 */
