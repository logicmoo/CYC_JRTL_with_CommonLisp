/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.atomic_sentenceP;
import static com.cyc.cycjava.cycl.el_utilities.cycl_subl_symbol_symbol;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_disjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_existential_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.el_negation_p;
import static com.cyc.cycjava.cycl.el_utilities.formula_arityE;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_conjunction;
import static com.cyc.cycjava.cycl.el_utilities.make_disjunction;
import static com.cyc.cycjava.cycl.el_utilities.make_existential;
import static com.cyc.cycjava.cycl.el_utilities.make_negation;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.el_utilities.sentence_free_variables;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.note_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.fboundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.booleanp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.butlast;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      PSP-SEMANTICS
 * source file: /cyc/top/cycl/psp-semantics.lisp
 * created:     2019/07/03 17:38:25
 */
public final class psp_semantics extends SubLTranslatedFile implements V12 {
    public static final SubLObject find_bad_templates_for_pred(SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            psp_chart.clear_psp_keywords_for_frame();
            {
                SubLObject st_arg = lexicon_utilities.semtrans_arg_of_pred_cached(pred);
                SubLObject frame_arg = lexicon_utilities.frame_arg_of_pred_cached(pred, parsing_utilities.psp_lexicon_root_mt(UNPROVIDED));
                SubLObject bad = NIL;
                if ((NIL != st_arg) && (NIL != frame_arg)) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            {
                                SubLObject pred_var = pred;
                                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                        SubLObject done_var = NIL;
                                        SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            {
                                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                if (NIL != valid) {
                                                    {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                            {
                                                                SubLObject done_var_35 = NIL;
                                                                SubLObject token_var_36 = NIL;
                                                                while (NIL == done_var_35) {
                                                                    {
                                                                        SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_36);
                                                                        SubLObject valid_37 = makeBoolean(token_var_36 != as);
                                                                        if (NIL != valid_37) {
                                                                            {
                                                                                SubLObject template = lexicon_accessors.semtrans_template_from_assertion(as, st_arg);
                                                                                SubLObject frame = assertions_high.gaf_arg(as, frame_arg);
                                                                                if (NIL == isa.isaP(frame, $$SubcategorizationFrame, UNPROVIDED, UNPROVIDED)) {
                                                                                    if (NIL != parsing_vars.$psp_verboseP$.getDynamicValue(thread)) {
                                                                                        Errors.warn($str_alt152$_S_is_not_a___SubcategorizationFr, frame);
                                                                                    }
                                                                                    bad = cons(as, bad);
                                                                                } else {
                                                                                    if (NIL != psp_bad_templateP(template, frame)) {
                                                                                        bad = cons(as, bad);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        done_var_35 = makeBoolean(NIL == valid_37);
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_38 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_38, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean(NIL == valid);
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
                }
                return bad;
            }
        }
    }

    static private final SubLString $str_alt207$ = makeString("");

    public static final SubLFile me = new psp_semantics();

 public static final String myName = "com.cyc.cycjava.cycl.psp_semantics";


    // defparameter
    @LispMethod(comment = "List of ancestors of the current phrase\ndefparameter")
    private static final SubLSymbol $psp_context$ = makeSymbol("*PSP-CONTEXT*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_phrase_structure_parser_weighted_cycl$ = makeSymbol("*DTP-PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $psp_reformulator_modules_to_skip$ = makeSymbol("*PSP-REFORMULATOR-MODULES-TO-SKIP*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $psp_genl_posP_caching_state$ = makeSymbol("*PSP-GENL-POS?-CACHING-STATE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL = makeSymbol("PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL");

    private static final SubLSymbol PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL_P = makeSymbol("PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL-P");

    static private final SubLList $list2 = list(makeSymbol("CYCL"), makeSymbol("WEIGHT"));

    static private final SubLList $list3 = list($CYCL, makeKeyword("WEIGHT"));

    static private final SubLList $list4 = list(makeSymbol("PSP-WEIGHTED-CYCL-CYCL"), makeSymbol("PSP-WEIGHTED-CYCL-WEIGHT"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-PSP-WEIGHTED-CYCL-CYCL"), makeSymbol("_CSETF-PSP-WEIGHTED-CYCL-WEIGHT"));

    private static final SubLSymbol PPRINT_PSP_WEIGHTED_CYCL = makeSymbol("PPRINT-PSP-WEIGHTED-CYCL");

    private static final SubLSymbol PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL-P"));

    private static final SubLSymbol PSP_WEIGHTED_CYCL_CYCL = makeSymbol("PSP-WEIGHTED-CYCL-CYCL");

    private static final SubLSymbol _CSETF_PSP_WEIGHTED_CYCL_CYCL = makeSymbol("_CSETF-PSP-WEIGHTED-CYCL-CYCL");

    private static final SubLSymbol PSP_WEIGHTED_CYCL_WEIGHT = makeSymbol("PSP-WEIGHTED-CYCL-WEIGHT");

    private static final SubLSymbol _CSETF_PSP_WEIGHTED_CYCL_WEIGHT = makeSymbol("_CSETF-PSP-WEIGHTED-CYCL-WEIGHT");

    private static final SubLString $str15$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL = makeSymbol("MAKE-PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL");

    private static final SubLSymbol $sym20$VISIT_DEFSTRUCT_OBJECT_PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL_METH = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL-METHOD");

    private static final SubLSymbol PSP_WEIGHTED_CYCL_P = makeSymbol("PSP-WEIGHTED-CYCL-P");

    private static final SubLString $str22$__PSP_WEIGHTED_CYCL__S__S_ = makeString("#<PSP-WEIGHTED-CYCL ~S ~S>");

    private static final SubLString $str23$Weighting_CycL_with_weights_____S = makeString("Weighting CycL with weights:~% ~S");

    private static final SubLFloat $float$0_0 = makeDouble(0.0);

    private static final SubLSymbol $sym25$PSP_CYCL_WEIGHT__ = makeSymbol("PSP-CYCL-WEIGHT-<");

    private static final SubLFloat $float$1_0 = makeDouble(1.0);

    private static final SubLSymbol PSP_CYCL_CYCL = makeSymbol("PSP-CYCL-CYCL");

    private static final SubLSymbol PSP_WEIGHT_P = makeSymbol("PSP-WEIGHT-P");

    private static final SubLSymbol COPY_PSP_CYCL = makeSymbol("COPY-PSP-CYCL");

    private static final SubLList $list36 = list(makeKeyword("DENOT-TEMPLATE"), makeKeyword("DENOT-GROUND"));

    private static final SubLSymbol PSP_CATEGORY_FROM_FRAME = makeSymbol("PSP-CATEGORY-FROM-FRAME");



    private static final SubLList $list43 = list(reader_make_constant_shell("PhraseFn-Bar1"), reader_make_constant_shell("Verb"));













    private static final SubLSymbol $psp_category_from_frame_caching_state$ = makeSymbol("*PSP-CATEGORY-FROM-FRAME-CACHING-STATE*");

    private static final SubLInteger $int$128 = makeInteger(128);



    private static final SubLString $str54$No_templates_for__S___ = makeString("No templates for ~S.~%");

    private static final SubLList $list56 = cons(makeSymbol("DTR-NUM"), makeSymbol("DTR-SEMX"));

    private static final SubLString $str57$__Couldn_t_find_template_semx_for = makeString("~&Couldn't find template semx for ~S with ~S.~%");

    static private final SubLList $list59 = list(makeSymbol("BINDING-SEMX"), makeSymbol("BINDING-KEY"));

    private static final SubLList $list60 = list(makeSymbol("LEVEL"), makeSymbol("BINDING-DTR-NUM"), makeSymbol("BINDING-KEY"));

    private static final SubLSymbol $psp_special_semantic_methods$ = makeSymbol("*PSP-SPECIAL-SEMANTIC-METHODS*");



    static private final SubLList $list64 = list(makeSymbol("RULE"), makeSymbol("METHOD"));

    private static final SubLList $list67 = list(makeSymbol("RULE"), makeSymbol("THIS-METHOD"));



    private static final SubLList $list69 = list(reader_make_constant_shell("SubcollectionOfWithRelationFromFn"), $NBAR, reader_make_constant_shell("possessiveRelation"), makeKeyword("DET"));











    private static final SubLObject $$PossessivePronoun_Pre = reader_make_constant_shell("PossessivePronoun-Pre");

    private static final SubLObject $$PossessiveMarker_Sg = reader_make_constant_shell("PossessiveMarker-Sg");

    private static final SubLString $$$of = makeString("of");

    private static final SubLFloat $float$0_1 = makeDouble(0.1);

    private static final SubLString $str84$Parsed__S_in__S_seconds_ = makeString("Parsed ~S in ~S seconds.");

    private static final SubLFloat $float$0_8 = makeDouble(0.8);

    private static final SubLList $list87 = list(makeSymbol("PARSE"), makeSymbol("COMMENTS"));

    private static final SubLList $list88 = list(makeSymbol("CYCL"), makeSymbol("POS-PRED"));

    private static final SubLObject $$plural_Generic = reader_make_constant_shell("plural-Generic");

    private static final SubLSymbol PSP_PARSE_NOUN_COMPOUND_TOKENS = makeSymbol("PSP-PARSE-NOUN-COMPOUND-TOKENS");

    private static final SubLSymbol PSP_EXTRACT_SUBJECT_SEMX = makeSymbol("PSP-EXTRACT-SUBJECT-SEMX");

    private static final SubLSymbol PSP_QUANTIFY_SUBJECT = makeSymbol("PSP-QUANTIFY-SUBJECT");

    private static final SubLList $list95 = list(makeSymbol("INSTANCE-OR-TYPE?"), makeSymbol("DTR-NUM"), makeSymbol("KEYWORD"));

    private static final SubLSymbol $sym98$PSP_CYCL__ = makeSymbol("PSP-CYCL-=");

    private static final SubLSymbol PSP_COERCE_TEMPLATE_TO_COLLECTION_MEMOIZED = makeSymbol("PSP-COERCE-TEMPLATE-TO-COLLECTION-MEMOIZED");

    private static final SubLSymbol $sym101$_OBJ = makeSymbol("?OBJ");







    private static final SubLList $list107 = list(makeKeyword("ANYTHING"));

    private static final SubLSymbol MAKE_NEGATION = makeSymbol("MAKE-NEGATION");

    private static final SubLSymbol EL_NEGATION_P = makeSymbol("EL-NEGATION-P");

    private static final SubLSymbol PSP_DNF_FOR_SENTENCE = makeSymbol("PSP-DNF-FOR-SENTENCE");

    private static final SubLList $list111 = list(makeSymbol("POS-LITS"), makeSymbol("NEG-LITS"));

    private static final SubLSymbol PSP_HEAD_KEY_FOR_CATEGORY = makeSymbol("PSP-HEAD-KEY-FOR-CATEGORY");

    private static final SubLSymbol $psp_head_key_for_category_caching_state$ = makeSymbol("*PSP-HEAD-KEY-FOR-CATEGORY-CACHING-STATE*");

    private static final SubLSymbol PSP_SUBSTITUTE_BINDINGS = makeSymbol("PSP-SUBSTITUTE-BINDINGS");

    private static final SubLSymbol $sym117$CYC_VAR_ = makeSymbol("CYC-VAR?");

    private static final SubLList $list118 = list(makeSymbol("IN"), makeSymbol("OUT"));

    private static final SubLList $list119 = list(makeKeyword("OBLIQUE-OBJECT"), makeKeyword("OBJECT"), makeKeyword("BY-SUBJECT"));

    private static final SubLList $list120 = list(reader_make_constant_shell("SomeFn"), makeKeyword("REPLACE"));

    private static final SubLString $str122$No_bindings_for__S___ = makeString("No bindings for ~S.~%");

    private static final SubLString $str123$Binding__S_has_no_corresponding_d = makeString("Binding ~S has no corresponding daughter in ~S.~%");

    private static final SubLSymbol $sym125$PSP_COLLECTION_ = makeSymbol("PSP-COLLECTION?");

    private static final SubLSymbol STRIP_NL_TAGS = makeSymbol("STRIP-NL-TAGS");

    private static final SubLObject $$PSRule_VbarVComps = reader_make_constant_shell("PSRule-VbarVComps");

    private static final SubLString $str129$__No_cycls_found_for____S__ = makeString("~&No cycls found for~% ~S~%");

    private static final SubLString $str130$__All_cycls_were_non_wff_for____S = makeString("~&All cycls were non-wff for~% ~S~%");

    private static final SubLList $list131 = list(NIL, NIL);

    private static final SubLList $list132 = list(makeSymbol("EXISTING-CYCLS"), makeSymbol("EXISTING-KEYWORDS"));

    private static final SubLString $str133$__No_filtered_cycls_for__S = makeString("~&No filtered cycls for ~S");

    static private final SubLList $list134 = list(makeKeyword("INF-COMP"));

    private static final SubLList $list135 = list(makeSymbol("FIRST-CYCLS"), makeSymbol("KEYWORDS"));

    private static final SubLString $str136$Bad_binding_pair___S = makeString("Bad binding pair: ~S");

    private static final SubLSymbol $sym138$PSP_COLLECTION_MEMOIZED_ = makeSymbol("PSP-COLLECTION-MEMOIZED?");

    private static final SubLList $list139 = list(reader_make_constant_shell("QuantifierProcessing-3-RLModule"), reader_make_constant_shell("QuantifierUnifier-3-RLModule"), reader_make_constant_shell("WffViolationResolutionRLModule"), reader_make_constant_shell("QueryProcessingRLModule"), reader_make_constant_shell("DatesReformulatorRLModule"));

    private static final SubLSymbol PSP_REFORMULATE_INT = makeSymbol("PSP-REFORMULATE-INT");

    private static final SubLSymbol $kw142$CLEAR_CACHES_ = makeKeyword("CLEAR-CACHES?");

    private static final SubLSymbol $sym144$PSP_WFF_ = makeSymbol("PSP-WFF?");

    private static final SubLString $str146$__Not_WFF___S__ = makeString("~&Not WFF! ~S~%");

    private static final SubLList $list147 = cons(makeSymbol("INDEXICAL-STRING"), makeSymbol("DENOT"));

    private static final SubLSymbol PSP_SEM_TEMPLATES_FROM_LEXICAL_EDGE = makeSymbol("PSP-SEM-TEMPLATES-FROM-LEXICAL-EDGE");









    static private final SubLString $str153$_S_is_not_a_known_keyword_for__S_ = makeString("~S is not a known keyword for ~S.~%");

    private static final SubLSymbol PSP_LOOKUP_TEMPLATES_MEMOIZED = makeSymbol("PSP-LOOKUP-TEMPLATES-MEMOIZED");

    public static final SubLSymbol $exclude_vulgaritiesP$ = makeSymbol("*EXCLUDE-VULGARITIES?*");

    public static final SubLSymbol $exclude_slangP$ = makeSymbol("*EXCLUDE-SLANG?*");

    public static final SubLSymbol $exclude_archaic_speechP$ = makeSymbol("*EXCLUDE-ARCHAIC-SPEECH?*");

    private static final SubLSymbol $exclude_indirect_relationsP$ = makeSymbol("*EXCLUDE-INDIRECT-RELATIONS?*");

    private static final SubLSymbol $sym166$PRAGMATICALLY_ACCEPTABLE_ = makeSymbol("PRAGMATICALLY-ACCEPTABLE?");

    private static final SubLSymbol GET_SEMTRANS_ENTRIES = makeSymbol("GET-SEMTRANS-ENTRIES");



    private static final SubLSymbol PSP_ROLES_FOR_DENOT = makeSymbol("PSP-ROLES-FOR-DENOT");



    private static final SubLList $list171 = list(reader_make_constant_shell("possessiveRelation"), makeKeyword("REPLACE"), $NOUN);



    private static final SubLList $list173 = list(reader_make_constant_shell("isa"), $NOUN, makeKeyword("REPLACE"));



    private static final SubLList $list175 = list(reader_make_constant_shell("is-Underspecified"), $NOUN, makeKeyword("REPLACE"));

    private static final SubLSymbol $sym176$PSP_GENL_POS_ = makeSymbol("PSP-GENL-POS?");

    private static final SubLSymbol $sym177$_PSP_GENL_POS__CACHING_STATE_ = makeSymbol("*PSP-GENL-POS?-CACHING-STATE*");

    private static final SubLSymbol PSP_DEVISE_NOUN_TEMPLATES = makeSymbol("PSP-DEVISE-NOUN-TEMPLATES");

    private static final SubLSymbol PSP_DEVISE_DEVERBAL_NOUN_TEMPLATE = makeSymbol("PSP-DEVISE-DEVERBAL-NOUN-TEMPLATE");

    private static final SubLList $list181 = list(reader_make_constant_shell("PPCompFrameFn"), reader_make_constant_shell("TransitivePPFrameType"), reader_make_constant_shell("Of-TheWord"));

    private static final SubLSymbol $sym184$PSP_SUBJECT_CLAUSE_ = makeSymbol("PSP-SUBJECT-CLAUSE?");



    private static final SubLSymbol PSP_PASSIVIZE_TEMPLATE = makeSymbol("PSP-PASSIVIZE-TEMPLATE");

    private static final SubLSymbol $PASSIVE_WITH_BY = makeKeyword("PASSIVE-WITH-BY");



    private static final SubLSymbol PSP_QUANTIFY_TEMPLATE = makeSymbol("PSP-QUANTIFY-TEMPLATE");

    private static final SubLString $str191$__PSP_MAKE_CONJUNCTION_passed_NIL = makeString("~&PSP-MAKE-CONJUNCTION passed NIL.~%");

    private static final SubLString $str192$__PSP_MAKE_DISJUNCTION_passed_NIL = makeString("~&PSP-MAKE-DISJUNCTION passed NIL.~%");

    private static final SubLSymbol PSP_DAVIDSONIANIZE_VERB_TEMPLATE = makeSymbol("PSP-DAVIDSONIANIZE-VERB-TEMPLATE");

    private static final SubLList $list194 = list(makeSymbol("TYPE"), makeSymbol("TARGET"), makeSymbol("CONSTRAINT-MT"));



    private static final SubLSymbol $sym199$PSP_OK_TEMPLATE__INT = makeSymbol("PSP-OK-TEMPLATE?-INT");

    private static final SubLString $str200$Non_canonical_semtrans_template__ = makeString("Non-canonical semtrans template (missing #$isa for ~S):~% ~S.~%");

    static private final SubLList $list201 = list(reader_make_constant_shell("Verb"));

    private static final SubLList $list202 = list(reader_make_constant_shell("PSRule-NP-Appositive"), reader_make_constant_shell("PSRule-NPfromPronoun"));

    private static final SubLObject $$PSRule_GerundNPFromVbar = reader_make_constant_shell("PSRule-GerundNPFromVbar");

    private static final SubLObject $$NLQuantFn_3 = reader_make_constant_shell("NLQuantFn-3");

    private static final SubLObject $$ProperName_NLAttr = reader_make_constant_shell("ProperName-NLAttr");



    private static final SubLObject $$singular_Generic = reader_make_constant_shell("singular-Generic");

    private static final SubLString $str208$ = makeString("");

    private static final SubLSymbol PSP_EXTRACT_SUBJECT_SEMX_INT = makeSymbol("PSP-EXTRACT-SUBJECT-SEMX-INT");



    private static final SubLSymbol $sym212$_SUBJECT = makeSymbol("?SUBJECT");

    private static final SubLSymbol PSP_REMOVE_DISPREFERRED_CYCLS = makeSymbol("PSP-REMOVE-DISPREFERRED-CYCLS");

    private static final SubLSymbol $sym214$PSP_LESS_PREFERABLE_CYCL_ = makeSymbol("PSP-LESS-PREFERABLE-CYCL?");



    static private final SubLSymbol $sym219$_ = makeSymbol(">");

    private static final SubLSymbol PSP_GENERALITY_ESTIMATE = makeSymbol("PSP-GENERALITY-ESTIMATE");

    private static final SubLSymbol $sym221$_ = makeSymbol("<");

    private static final SubLSymbol $sym222$_ = makeSymbol("+");

    private static final SubLSymbol PSP_GENERALITY_ESTIMATE_RECURSIVE = makeSymbol("PSP-GENERALITY-ESTIMATE-RECURSIVE");

    /**
     *
     *
     * @return PHRASE-STRUCTURE-PARSER-EDGE-P or NIL - the contextually relevant
    mother of the current edge, according to *PSP-CONTEXT*.
     */
    @LispMethod(comment = "@return PHRASE-STRUCTURE-PARSER-EDGE-P or NIL - the contextually relevant\r\nmother of the current edge, according to *PSP-CONTEXT*.")
    public static final SubLObject psp_mother_of_current_edge_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $psp_context$.getDynamicValue(thread).first();
        }
    }

    /**
     *
     *
     * @return PHRASE-STRUCTURE-PARSER-EDGE-P or NIL - the contextually relevant
    mother of the current edge, according to *PSP-CONTEXT*.
     */
    @LispMethod(comment = "@return PHRASE-STRUCTURE-PARSER-EDGE-P or NIL - the contextually relevant\r\nmother of the current edge, according to *PSP-CONTEXT*.")
    public static SubLObject psp_mother_of_current_edge() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $psp_context$.getDynamicValue(thread).first();
    }

    public static final SubLObject phrase_structure_parser_weighted_cycl_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        pprint_psp_weighted_cycl(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject phrase_structure_parser_weighted_cycl_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_psp_weighted_cycl(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject phrase_structure_parser_weighted_cycl_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.psp_semantics.$phrase_structure_parser_weighted_cycl_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject phrase_structure_parser_weighted_cycl_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.psp_semantics.$phrase_structure_parser_weighted_cycl_native.class ? T : NIL;
    }

    public static final SubLObject psp_weighted_cycl_cycl_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL_P);
        return v_object.getField2();
    }

    public static SubLObject psp_weighted_cycl_cycl(final SubLObject v_object) {
        assert NIL != phrase_structure_parser_weighted_cycl_p(v_object) : "! psp_semantics.phrase_structure_parser_weighted_cycl_p(v_object) " + "psp_semantics.phrase_structure_parser_weighted_cycl_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject psp_weighted_cycl_weight_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL_P);
        return v_object.getField3();
    }

    public static SubLObject psp_weighted_cycl_weight(final SubLObject v_object) {
        assert NIL != phrase_structure_parser_weighted_cycl_p(v_object) : "! psp_semantics.phrase_structure_parser_weighted_cycl_p(v_object) " + "psp_semantics.phrase_structure_parser_weighted_cycl_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_psp_weighted_cycl_cycl_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_psp_weighted_cycl_cycl(final SubLObject v_object, final SubLObject value) {
        assert NIL != phrase_structure_parser_weighted_cycl_p(v_object) : "! psp_semantics.phrase_structure_parser_weighted_cycl_p(v_object) " + "psp_semantics.phrase_structure_parser_weighted_cycl_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_psp_weighted_cycl_weight_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_psp_weighted_cycl_weight(final SubLObject v_object, final SubLObject value) {
        assert NIL != phrase_structure_parser_weighted_cycl_p(v_object) : "! psp_semantics.phrase_structure_parser_weighted_cycl_p(v_object) " + "psp_semantics.phrase_structure_parser_weighted_cycl_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_phrase_structure_parser_weighted_cycl_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.psp_semantics.$phrase_structure_parser_weighted_cycl_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($CYCL)) {
                        _csetf_psp_weighted_cycl_cycl(v_new, current_value);
                    } else {
                        if (pcase_var.eql($WEIGHT)) {
                            _csetf_psp_weighted_cycl_weight(v_new, current_value);
                        } else {
                            Errors.error($str_alt14$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_phrase_structure_parser_weighted_cycl(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.psp_semantics.$phrase_structure_parser_weighted_cycl_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CYCL)) {
                _csetf_psp_weighted_cycl_cycl(v_new, current_value);
            } else
                if (pcase_var.eql($WEIGHT)) {
                    _csetf_psp_weighted_cycl_weight(v_new, current_value);
                } else {
                    Errors.error($str15$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_phrase_structure_parser_weighted_cycl(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CYCL, psp_weighted_cycl_cycl(obj));
        funcall(visitor_fn, obj, $SLOT, $WEIGHT, psp_weighted_cycl_weight(obj));
        funcall(visitor_fn, obj, $END, MAKE_PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_phrase_structure_parser_weighted_cycl_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_phrase_structure_parser_weighted_cycl(obj, visitor_fn);
    }

    public static final SubLObject psp_weighted_cycl_p_alt(SubLObject v_object) {
        return phrase_structure_parser_weighted_cycl_p(v_object);
    }

    public static SubLObject psp_weighted_cycl_p(final SubLObject v_object) {
        return phrase_structure_parser_weighted_cycl_p(v_object);
    }

    public static final SubLObject contains_psp_weighted_cycl_p_alt(SubLObject expression) {
        return list_utilities.tree_find_if(PSP_WEIGHTED_CYCL_P, expression, UNPROVIDED);
    }

    public static SubLObject contains_psp_weighted_cycl_p(final SubLObject expression) {
        return list_utilities.tree_find_if(PSP_WEIGHTED_CYCL_P, expression, UNPROVIDED);
    }

    public static final SubLObject pprint_psp_weighted_cycl_alt(SubLObject psp_weighted_cycl, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str_alt16$__PSP_WEIGHTED_CYCL__S__S_, psp_weighted_cycl_weight(psp_weighted_cycl), psp_weighted_cycl_cycl(psp_weighted_cycl));
        return psp_weighted_cycl;
    }

    public static SubLObject pprint_psp_weighted_cycl(final SubLObject psp_weighted_cycl, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str22$__PSP_WEIGHTED_CYCL__S__S_, psp_weighted_cycl_weight(psp_weighted_cycl), psp_weighted_cycl_cycl(psp_weighted_cycl));
        return psp_weighted_cycl;
    }

    public static final SubLObject psp_weight_cycl_alt(SubLObject cycl, SubLObject weight) {
        if (NIL != psp_weighted_cycl_p(cycl)) {
            {
                SubLObject cycl_cycl = psp_cycl_cycl(cycl);
                SubLObject cycl_weight = psp_cycl_weight(cycl);
                SubLObject new_weight = psp_chart.psp_weight_compose_two(weight, cycl_weight);
                return new_psp_weighted_cycl(cycl_cycl, new_weight);
            }
        } else {
            if (NIL != contains_psp_weighted_cycl_p(cycl)) {
                Errors.sublisp_break($str_alt17$Weighting_CycL_with_weights_____S, new SubLObject[]{ cycl });
            } else {
                return new_psp_weighted_cycl(cycl, weight);
            }
        }
        return NIL;
    }

    public static SubLObject psp_weight_cycl(final SubLObject cycl, final SubLObject weight) {
        if (NIL != psp_weighted_cycl_p(cycl)) {
            final SubLObject cycl_cycl = psp_cycl_cycl(cycl);
            final SubLObject cycl_weight = psp_cycl_weight(cycl);
            final SubLObject new_weight = psp_chart.psp_weight_compose_two(weight, cycl_weight);
            return new_psp_weighted_cycl(cycl_cycl, new_weight);
        }
        if (NIL != contains_psp_weighted_cycl_p(cycl)) {
            Errors.sublisp_break($str23$Weighting_CycL_with_weights_____S, new SubLObject[]{ cycl });
            return NIL;
        }
        return new_psp_weighted_cycl(cycl, weight);
    }

    public static final SubLObject psp_cycl_weight_L_alt(SubLObject cycl1, SubLObject cycl2, SubLObject margin_of_error) {
        if (margin_of_error == UNPROVIDED) {
            margin_of_error = $float$0_0;
        }
        return psp_chart.psp_weight_L(psp_cycl_weight(cycl1), psp_cycl_weight(cycl2), margin_of_error);
    }

    public static SubLObject psp_cycl_weight_L(final SubLObject cycl1, final SubLObject cycl2, SubLObject margin_of_error) {
        if (margin_of_error == UNPROVIDED) {
            margin_of_error = $float$0_0;
        }
        return psp_chart.psp_weight_L(psp_cycl_weight(cycl1), psp_cycl_weight(cycl2), margin_of_error);
    }

    public static final SubLObject sort_psp_cycls_by_weight_ascending_alt(SubLObject cycls) {
        return Sort.sort(cycls, $sym19$PSP_CYCL_WEIGHT__, UNPROVIDED);
    }

    public static SubLObject sort_psp_cycls_by_weight_ascending(final SubLObject cycls) {
        return Sort.sort(cycls, $sym25$PSP_CYCL_WEIGHT__, UNPROVIDED);
    }

    public static final SubLObject psp_cycl_weight_alt(SubLObject cycl) {
        if (NIL != psp_weighted_cycl_p(cycl)) {
            return psp_weighted_cycl_weight(cycl);
        } else {
            return parsing_utilities.psp_weight_from_float($float$1_0);
        }
    }

    public static SubLObject psp_cycl_weight(final SubLObject cycl) {
        if (NIL != psp_weighted_cycl_p(cycl)) {
            return psp_weighted_cycl_weight(cycl);
        }
        return parsing_utilities.psp_weight_from_float($float$1_0);
    }

    public static final SubLObject psp_cycl_cycl_alt(SubLObject cycl) {
        if (NIL != psp_weighted_cycl_p(cycl)) {
            return psp_weighted_cycl_cycl(cycl);
        } else {
            return cycl;
        }
    }

    public static SubLObject psp_cycl_cycl(final SubLObject cycl) {
        if (NIL != psp_weighted_cycl_p(cycl)) {
            return psp_weighted_cycl_cycl(cycl);
        }
        return cycl;
    }

    public static final SubLObject psp_cycls_to_cycls_alt(SubLObject psp_cycls) {
        return Mapping.mapcar(PSP_CYCL_CYCL, psp_cycls);
    }

    public static SubLObject psp_cycls_to_cycls(final SubLObject psp_cycls) {
        return Mapping.mapcar(PSP_CYCL_CYCL, psp_cycls);
    }

    public static final SubLObject psp_cycl_E_alt(SubLObject cycl1, SubLObject cycl2) {
        return equal(psp_cycl_cycl(cycl1), psp_cycl_cycl(cycl2));
    }

    public static SubLObject psp_cycl_E(final SubLObject cycl1, final SubLObject cycl2) {
        return equal(psp_cycl_cycl(cycl1), psp_cycl_cycl(cycl2));
    }

    public static final SubLObject new_psp_weighted_cycl_alt(SubLObject cycl, SubLObject weight) {
        SubLTrampolineFile.checkType(weight, PSP_WEIGHT_P);
        {
            SubLObject weighted_cycl = make_phrase_structure_parser_weighted_cycl(list($CYCL, cycl, $WEIGHT, weight));
            return weighted_cycl;
        }
    }

    public static SubLObject new_psp_weighted_cycl(final SubLObject cycl, final SubLObject weight) {
        assert NIL != psp_chart.psp_weight_p(weight) : "! psp_chart.psp_weight_p(weight) " + ("psp_chart.psp_weight_p(weight) " + "CommonSymbols.NIL != psp_chart.psp_weight_p(weight) ") + weight;
        final SubLObject weighted_cycl = make_phrase_structure_parser_weighted_cycl(list($CYCL, cycl, $WEIGHT, weight));
        return weighted_cycl;
    }

    public static final SubLObject copy_psp_cycls_alt(SubLObject psp_cycls) {
        return Mapping.mapcar(COPY_PSP_CYCL, psp_cycls);
    }

    public static SubLObject copy_psp_cycls(final SubLObject psp_cycls) {
        return Mapping.mapcar(COPY_PSP_CYCL, psp_cycls);
    }

    public static final SubLObject copy_psp_cycl_alt(SubLObject psp_cycl) {
        {
            SubLObject cycl = psp_cycl_cycl(psp_cycl);
            SubLObject weight = psp_cycl_weight(psp_cycl);
            return new_psp_weighted_cycl(cycl, weight);
        }
    }

    public static SubLObject copy_psp_cycl(final SubLObject psp_cycl) {
        final SubLObject cycl = psp_cycl_cycl(psp_cycl);
        final SubLObject weight = psp_cycl_weight(psp_cycl);
        return new_psp_weighted_cycl(cycl, weight);
    }

    public static final SubLObject psp_cycl_subst_alt(SubLObject in, SubLObject out, SubLObject cycl) {
        if (NIL != psp_weighted_cycl_p(cycl)) {
            {
                SubLObject cycl_cycl = psp_cycl_cycl(cycl);
                SubLObject subbed_psp_cycl = psp_cycl_subst(in, out, cycl_cycl);
                return psp_weight_cycl(subbed_psp_cycl, psp_cycl_weight(cycl));
            }
        } else {
            if (NIL != psp_weighted_cycl_p(in)) {
                {
                    SubLObject in_cycl = psp_cycl_cycl(in);
                    SubLObject in_weight = psp_cycl_weight(in);
                    SubLObject subbed_cycl = psp_cycl_subst(in_cycl, out, cycl);
                    return NIL != cycl_utilities.expression_find(in_cycl, subbed_cycl, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (psp_weight_cycl(subbed_cycl, in_weight))) : subbed_cycl;
                }
            } else {
                return cycl_utilities.expression_subst(in, out, cycl, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    public static SubLObject psp_cycl_subst(final SubLObject in, final SubLObject out, final SubLObject cycl) {
        if (NIL != psp_weighted_cycl_p(cycl)) {
            final SubLObject cycl_cycl = psp_cycl_cycl(cycl);
            final SubLObject subbed_psp_cycl = psp_cycl_subst(in, out, cycl_cycl);
            return psp_weight_cycl(subbed_psp_cycl, psp_cycl_weight(cycl));
        }
        if (NIL != psp_weighted_cycl_p(in)) {
            final SubLObject in_cycl = psp_cycl_cycl(in);
            final SubLObject in_weight = psp_cycl_weight(in);
            final SubLObject subbed_cycl = psp_cycl_subst(in_cycl, out, cycl);
            return NIL != cycl_utilities.expression_find(in_cycl, subbed_cycl, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED) ? psp_weight_cycl(subbed_cycl, in_weight) : subbed_cycl;
        }
        return cycl_utilities.expression_subst(in, out, cycl, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject psp_weighted_cycl_set_cycl_alt(SubLObject weighted_cycl, SubLObject new_cycl) {
        _csetf_psp_weighted_cycl_cycl(weighted_cycl, new_cycl);
        return weighted_cycl;
    }

    public static SubLObject psp_weighted_cycl_set_cycl(final SubLObject weighted_cycl, final SubLObject new_cycl) {
        _csetf_psp_weighted_cycl_cycl(weighted_cycl, new_cycl);
        return weighted_cycl;
    }

    public static final SubLObject psp_weighted_cycl_set_weight_alt(SubLObject weighted_cycl, SubLObject new_weight) {
        _csetf_psp_weighted_cycl_weight(weighted_cycl, new_weight);
        return weighted_cycl;
    }

    public static SubLObject psp_weighted_cycl_set_weight(final SubLObject weighted_cycl, final SubLObject new_weight) {
        _csetf_psp_weighted_cycl_weight(weighted_cycl, new_weight);
        return weighted_cycl;
    }

    /**
     *
     *
     * @param DENOT?
     * 		Do you want denotational (as opposed to propositional) terms?
     * @param GROUND?
     * 		Do you want ground terms (as opposed to template) terms?
     * @return LISTP; of CycL expressions representing possible semantic interpretations of EDGE.
     * @unknown Also stores the semantics on the CYCLS slot of EDGE for later retrieval.
     */
    @LispMethod(comment = "@param DENOT?\r\n\t\tDo you want denotational (as opposed to propositional) terms?\r\n@param GROUND?\r\n\t\tDo you want ground terms (as opposed to template) terms?\r\n@return LISTP; of CycL expressions representing possible semantic interpretations of EDGE.\r\n@unknown Also stores the semantics on the CYCLS slot of EDGE for later retrieval.")
    public static final SubLObject psp_semantics_for_edge_alt(SubLObject edge, SubLObject denotP, SubLObject groundP) {
        if (denotP == UNPROVIDED) {
            denotP = T;
        }
        if (groundP == UNPROVIDED) {
            groundP = T;
        }
        SubLTrampolineFile.checkType(denotP, BOOLEANP);
        SubLTrampolineFile.checkType(groundP, BOOLEANP);
        {
            SubLObject output_type = psp_semantic_output_type(denotP, groundP);
            return psp_semantics_for_edge_int(edge, output_type);
        }
    }

    /**
     *
     *
     * @param DENOT?
     * 		Do you want denotational (as opposed to propositional) terms?
     * @param GROUND?
     * 		Do you want ground terms (as opposed to template) terms?
     * @return LISTP; of CycL expressions representing possible semantic interpretations of EDGE.
     * @unknown Also stores the semantics on the CYCLS slot of EDGE for later retrieval.
     */
    @LispMethod(comment = "@param DENOT?\r\n\t\tDo you want denotational (as opposed to propositional) terms?\r\n@param GROUND?\r\n\t\tDo you want ground terms (as opposed to template) terms?\r\n@return LISTP; of CycL expressions representing possible semantic interpretations of EDGE.\r\n@unknown Also stores the semantics on the CYCLS slot of EDGE for later retrieval.")
    public static SubLObject psp_semantics_for_edge(final SubLObject edge, SubLObject denotP, SubLObject groundP) {
        if (denotP == UNPROVIDED) {
            denotP = T;
        }
        if (groundP == UNPROVIDED) {
            groundP = T;
        }
        assert NIL != booleanp(denotP) : "! booleanp(denotP) " + ("Types.booleanp(denotP) " + "CommonSymbols.NIL != Types.booleanp(denotP) ") + denotP;
        assert NIL != booleanp(groundP) : "! booleanp(groundP) " + ("Types.booleanp(groundP) " + "CommonSymbols.NIL != Types.booleanp(groundP) ") + groundP;
        final SubLObject output_type = psp_semantic_output_type(denotP, groundP);
        return psp_semantics_for_edge_int(edge, output_type);
    }

    /**
     *
     *
     * @return LISTP of CycL expressions.
     */
    @LispMethod(comment = "@return LISTP of CycL expressions.")
    public static final SubLObject psp_semantics_for_edge_int_alt(SubLObject edge, SubLObject output_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject semx = NIL;
                SubLObject computation_type = psp_semantic_computation_type(edge, output_type);
                if (edge != psp_mother_of_current_edge()) {
                    $psp_context$.setDynamicValue(cons(edge, $psp_context$.getDynamicValue(thread)), thread);
                    try {
                        semx = psp_compute_semantics(edge, computation_type, output_type);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                $psp_context$.setDynamicValue($psp_context$.getDynamicValue(thread).rest(), thread);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    if (((NIL != semx) && (NIL != parsing_vars.$npp_use_nl_tagsP$.getDynamicValue(thread))) && (computation_type != $LOOKUP)) {
                        semx = psp_add_nl_tags(semx, edge);
                    }
                    {
                        SubLObject cdolist_list_var = semx;
                        SubLObject new_cycl = NIL;
                        for (new_cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , new_cycl = cdolist_list_var.first()) {
                            psp_chart.psp_edge_add_cycl(edge, new_cycl, output_type);
                        }
                    }
                }
                return semx;
            }
        }
    }

    /**
     *
     *
     * @return LISTP of CycL expressions.
     */
    @LispMethod(comment = "@return LISTP of CycL expressions.")
    public static SubLObject psp_semantics_for_edge_int(final SubLObject edge, final SubLObject output_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject semx = NIL;
        final SubLObject computation_type = psp_semantic_computation_type(edge, output_type);
        if (!edge.eql(psp_mother_of_current_edge())) {
            $psp_context$.setDynamicValue(cons(edge, $psp_context$.getDynamicValue(thread)), thread);
            try {
                semx = psp_compute_semantics(edge, computation_type, output_type);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    $psp_context$.setDynamicValue($psp_context$.getDynamicValue(thread).rest(), thread);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
            if (((NIL != semx) && (NIL != parsing_vars.$npp_use_nl_tagsP$.getDynamicValue(thread))) && (computation_type != $LOOKUP)) {
                semx = psp_add_nl_tags(semx, edge);
            }
            SubLObject cdolist_list_var = semx;
            SubLObject new_cycl = NIL;
            new_cycl = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                psp_chart.psp_edge_add_cycl(edge, new_cycl, output_type);
                cdolist_list_var = cdolist_list_var.rest();
                new_cycl = cdolist_list_var.first();
            } 
        }
        return semx;
    }

    /**
     *
     *
     * @return LISTP of CycL expressions.
     */
    @LispMethod(comment = "@return LISTP of CycL expressions.")
    public static final SubLObject psp_compute_semantics_alt(SubLObject edge, SubLObject computation_type, SubLObject output_type) {
        {
            SubLObject semx = NIL;
            SubLObject pcase_var = computation_type;
            if (pcase_var.eql($LOOKUP)) {
                semx = psp_filter_cycls_by_generality(psp_chart.psp_edge_lookup_semx(edge, output_type));
            } else {
                if (pcase_var.eql($SPECIAL)) {
                    semx = psp_edge_special_semx(edge, output_type);
                } else {
                    if (pcase_var.eql($LEXICAL)) {
                        semx = psp_filter_cycls_by_generality(psp_edge_lexical_semx(edge, output_type));
                    } else {
                        if (pcase_var.eql($UNARY)) {
                            semx = psp_edge_unary_semx(edge, output_type);
                        } else {
                            if (pcase_var.eql($MULTI_DTR)) {
                                semx = psp_edge_multi_dtr_semx(edge, output_type);
                            }
                        }
                    }
                }
            }
            if ((NIL != semx) && (NIL != member(output_type, $list_alt30, UNPROVIDED, UNPROVIDED))) {
                {
                    SubLObject lexical_head_dtr = psp_chart.psp_edge_lexical_head_dtr(edge);
                    SubLObject cat = psp_chart.get_psp_edge_category(lexical_head_dtr);
                    SubLObject frame = psp_chart.get_psp_edge_frame(lexical_head_dtr);
                    semx = psp_coerce_templates_to_collections(edge, semx, T, psp_head_key_for_category(cat, frame));
                }
            }
            {
                SubLObject cdolist_list_var = semx;
                SubLObject meaning = NIL;
                for (meaning = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , meaning = cdolist_list_var.first()) {
                    psp_parse_tree_generator.psp_edge_note_meaning_on_node_if_known(edge, psp_cycl_cycl(meaning), UNPROVIDED);
                }
            }
            return semx;
        }
    }

    /**
     *
     *
     * @return LISTP of CycL expressions.
     */
    @LispMethod(comment = "@return LISTP of CycL expressions.")
    public static SubLObject psp_compute_semantics(final SubLObject edge, final SubLObject computation_type, final SubLObject output_type) {
        SubLObject semx = NIL;
        if (computation_type.eql($LOOKUP)) {
            semx = psp_filter_cycls_by_generality(psp_chart.psp_edge_lookup_semx(edge, output_type));
        } else
            if (computation_type.eql($SPECIAL)) {
                semx = psp_edge_special_semx(edge, output_type);
            } else
                if (computation_type.eql($LEXICAL)) {
                    semx = psp_filter_cycls_by_generality(psp_edge_lexical_semx(edge, output_type));
                } else
                    if (computation_type.eql($UNARY)) {
                        semx = psp_edge_unary_semx(edge, output_type);
                    } else
                        if (computation_type.eql($MULTI_DTR)) {
                            semx = psp_edge_multi_dtr_semx(edge, output_type);
                        }




        if ((NIL != semx) && (NIL != member(output_type, $list36, UNPROVIDED, UNPROVIDED))) {
            final SubLObject lexical_head_dtr = psp_chart.psp_edge_lexical_head_dtr(edge);
            final SubLObject cat = psp_chart.get_psp_edge_category(lexical_head_dtr);
            final SubLObject frame = psp_chart.get_psp_edge_frame(lexical_head_dtr);
            semx = psp_coerce_templates_to_collections(edge, semx, T, psp_head_key_for_category(cat, frame));
        }
        SubLObject cdolist_list_var = semx;
        SubLObject meaning = NIL;
        meaning = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            psp_parse_tree_generator.psp_edge_note_meaning_on_node_if_known(edge, psp_cycl_cycl(meaning), UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            meaning = cdolist_list_var.first();
        } 
        return semx;
    }

    /**
     *
     *
     * @return KEYWORDP
     */
    @LispMethod(comment = "@return KEYWORDP")
    public static final SubLObject psp_semantic_output_type_alt(SubLObject denotP, SubLObject groundP) {
        if ((NIL != denotP) && (NIL != groundP)) {
            return $DENOT_GROUND;
        } else {
            if (NIL != denotP) {
                return $DENOT_TEMPLATE;
            } else {
                if (NIL != groundP) {
                    return $PROP_GROUND;
                } else {
                    return $PROP_TEMPLATE;
                }
            }
        }
    }

    /**
     *
     *
     * @return KEYWORDP
     */
    @LispMethod(comment = "@return KEYWORDP")
    public static SubLObject psp_semantic_output_type(final SubLObject denotP, final SubLObject groundP) {
        if ((NIL != denotP) && (NIL != groundP)) {
            return $DENOT_GROUND;
        }
        if (NIL != denotP) {
            return $DENOT_TEMPLATE;
        }
        if (NIL != groundP) {
            return $PROP_GROUND;
        }
        return $PROP_TEMPLATE;
    }

    /**
     *
     *
     * @return KEYWORDP; The template form of OUTPUT-TYPE.
     */
    @LispMethod(comment = "@return KEYWORDP; The template form of OUTPUT-TYPE.")
    public static final SubLObject psp_template_form_alt(SubLObject output_type) {
        {
            SubLObject pcase_var = output_type;
            if (pcase_var.eql($DENOT_GROUND) || pcase_var.eql($DENOT_TEMPLATE)) {
                return $DENOT_TEMPLATE;
            } else {
                if (pcase_var.eql($PROP_GROUND) || pcase_var.eql($PROP_TEMPLATE)) {
                    return $PROP_TEMPLATE;
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return KEYWORDP; The template form of OUTPUT-TYPE.
     */
    @LispMethod(comment = "@return KEYWORDP; The template form of OUTPUT-TYPE.")
    public static SubLObject psp_template_form(final SubLObject output_type) {
        if (output_type.eql($DENOT_GROUND) || output_type.eql($DENOT_TEMPLATE)) {
            return $DENOT_TEMPLATE;
        }
        if (output_type.eql($PROP_GROUND) || output_type.eql($PROP_TEMPLATE)) {
            return $PROP_TEMPLATE;
        }
        return NIL;
    }

    /**
     *
     *
     * @return KEYWORDP; The type of semantic computation necessary for determining
    the semantics of EDGE.
     */
    @LispMethod(comment = "@return KEYWORDP; The type of semantic computation necessary for determining\r\nthe semantics of EDGE.")
    public static final SubLObject psp_semantic_computation_type_alt(SubLObject edge, SubLObject output_type) {
        if (NIL != psp_chart.psp_edge_semx_doneP(edge, output_type)) {
            return $LOOKUP;
        } else {
            if (NIL != psp_edge_semx_specialP(edge, output_type)) {
                return $SPECIAL;
            } else {
                if (NIL != psp_chart.psp_lexical_edgeP(edge)) {
                    return $LEXICAL;
                } else {
                    if (psp_chart.psp_edge_dtr_count(edge).isZero()) {
                        return $LEXICAL;
                    } else {
                        if (ONE_INTEGER.numE(psp_chart.psp_edge_dtr_count(edge))) {
                            return $UNARY;
                        } else {
                            return $MULTI_DTR;
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return KEYWORDP; The type of semantic computation necessary for determining
    the semantics of EDGE.
     */
    @LispMethod(comment = "@return KEYWORDP; The type of semantic computation necessary for determining\r\nthe semantics of EDGE.")
    public static SubLObject psp_semantic_computation_type(final SubLObject edge, final SubLObject output_type) {
        if (NIL != psp_chart.psp_edge_semx_doneP(edge, output_type)) {
            return $LOOKUP;
        }
        if (NIL != psp_edge_semx_specialP(edge, output_type)) {
            return $SPECIAL;
        }
        if (NIL != psp_chart.psp_lexical_edgeP(edge)) {
            return $LEXICAL;
        }
        if (psp_chart.psp_edge_dtr_count(edge).isZero()) {
            return $LEXICAL;
        }
        if (ONE_INTEGER.numE(psp_chart.psp_edge_dtr_count(edge))) {
            return $UNARY;
        }
        return $MULTI_DTR;
    }

    public static final SubLObject clear_psp_category_from_frame_alt() {
        {
            SubLObject cs = $psp_category_from_frame_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_psp_category_from_frame() {
        final SubLObject cs = $psp_category_from_frame_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_psp_category_from_frame_alt(SubLObject frame, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt(UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args($psp_category_from_frame_caching_state$.getGlobalValue(), list(frame, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_psp_category_from_frame(final SubLObject frame, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt(UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args($psp_category_from_frame_caching_state$.getGlobalValue(), list(frame, mt), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return phrase-type or NIL, the category of phrase of which the semantic head dtr has FRAME.
     * @unknown might want to put this in the KB.
     */
    @LispMethod(comment = "@return phrase-type or NIL, the category of phrase of which the semantic head dtr has FRAME.\r\n@unknown might want to put this in the KB.")
    public static final SubLObject psp_category_from_frame_internal_alt(SubLObject frame, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if (NIL != isa.isaP(frame, $$GenericVerbPhraseModifyingFrame, UNPROVIDED, UNPROVIDED)) {
                            ans = $list_alt37;
                        } else {
                            if (NIL != isa.isaP(frame, $$NounPhraseModifyingFrame, UNPROVIDED, UNPROVIDED)) {
                                ans = $$NounPhrase;
                            } else {
                                if (NIL != isa.isaP(frame, $$FrameForNouns, UNPROVIDED, UNPROVIDED)) {
                                    ans = $$Noun;
                                } else {
                                    if (NIL != isa.isaP(frame, $$FrameForVerbs, UNPROVIDED, UNPROVIDED)) {
                                        ans = $$Verb;
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
                return ans;
            }
        }
    }

    /**
     *
     *
     * @return phrase-type or NIL, the category of phrase of which the semantic head dtr has FRAME.
     * @unknown might want to put this in the KB.
     */
    @LispMethod(comment = "@return phrase-type or NIL, the category of phrase of which the semantic head dtr has FRAME.\r\n@unknown might want to put this in the KB.")
    public static SubLObject psp_category_from_frame_internal(final SubLObject frame, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != isa.isaP(frame, $$GenericVerbPhraseModifyingFrame, UNPROVIDED, UNPROVIDED)) {
                ans = $list43;
            } else
                if (NIL != isa.isaP(frame, $$NounPhraseModifyingFrame, UNPROVIDED, UNPROVIDED)) {
                    ans = $$NounPhrase;
                } else
                    if (NIL != isa.isaP(frame, $$FrameForNouns, UNPROVIDED, UNPROVIDED)) {
                        ans = $$Noun;
                    } else
                        if (NIL != isa.isaP(frame, $$FrameForVerbs, UNPROVIDED, UNPROVIDED)) {
                            ans = $$Verb;
                        }



        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static final SubLObject psp_category_from_frame_alt(SubLObject frame, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt(UNPROVIDED);
        }
        {
            SubLObject caching_state = $psp_category_from_frame_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(PSP_CATEGORY_FROM_FRAME, $psp_category_from_frame_caching_state$, NIL, EQUAL, TWO_INTEGER, $int$128);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(frame, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw46$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (frame.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(psp_category_from_frame_internal(frame, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(frame, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject psp_category_from_frame(final SubLObject frame, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt(UNPROVIDED);
        }
        SubLObject caching_state = $psp_category_from_frame_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PSP_CATEGORY_FROM_FRAME, $psp_category_from_frame_caching_state$, NIL, EQUAL, TWO_INTEGER, $int$128);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(frame, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (frame.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(psp_category_from_frame_internal(frame, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(frame, mt));
        return memoization_state.caching_results(results3);
    }

    /**
     *
     *
     * @return LISTP of CycL expressions representing the semantic of the lexical edge EDGE.
     */
    @LispMethod(comment = "@return LISTP of CycL expressions representing the semantic of the lexical edge EDGE.")
    public static final SubLObject psp_edge_lexical_semx_alt(SubLObject edge, SubLObject output_type) {
        {
            SubLObject pcase_var = output_type;
            if (pcase_var.eql($PROP_TEMPLATE) || pcase_var.eql($DENOT_TEMPLATE)) {
                return psp_sem_templates_from_lexical_edge(edge);
            } else {
                return NIL;
            }
        }
    }

    /**
     *
     *
     * @return LISTP of CycL expressions representing the semantic of the lexical edge EDGE.
     */
    @LispMethod(comment = "@return LISTP of CycL expressions representing the semantic of the lexical edge EDGE.")
    public static SubLObject psp_edge_lexical_semx(final SubLObject edge, final SubLObject output_type) {
        if (output_type.eql($PROP_TEMPLATE) || output_type.eql($DENOT_TEMPLATE)) {
            return psp_sem_templates_from_lexical_edge(edge);
        }
        return NIL;
    }

    /**
     *
     *
     * @return LISTP of CycL expressions of OUTPUT-TYPE from EDGE,
    taken simply from the single daughter of EDGE.
     */
    @LispMethod(comment = "@return LISTP of CycL expressions of OUTPUT-TYPE from EDGE,\r\ntaken simply from the single daughter of EDGE.")
    public static final SubLObject psp_edge_unary_semx_alt(SubLObject edge, SubLObject output_type) {
        {
            SubLObject head_dtr = psp_chart.get_psp_edge_head_dtr(edge);
            SubLObject semx = copy_psp_cycls(psp_semantics_for_edge_int(head_dtr, output_type));
            SubLObject cdolist_list_var = semx;
            SubLObject meaning = NIL;
            for (meaning = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , meaning = cdolist_list_var.first()) {
                psp_parse_tree_generator.psp_note_semantic_dependency(edge, meaning, head_dtr, meaning);
            }
            return semx;
        }
    }

    /**
     *
     *
     * @return LISTP of CycL expressions of OUTPUT-TYPE from EDGE,
    taken simply from the single daughter of EDGE.
     */
    @LispMethod(comment = "@return LISTP of CycL expressions of OUTPUT-TYPE from EDGE,\r\ntaken simply from the single daughter of EDGE.")
    public static SubLObject psp_edge_unary_semx(final SubLObject edge, final SubLObject output_type) {
        final SubLObject head_dtr = psp_chart.get_psp_edge_head_dtr(edge);
        SubLObject cdolist_list_var;
        final SubLObject semx = cdolist_list_var = copy_psp_cycls(psp_semantics_for_edge_int(head_dtr, output_type));
        SubLObject meaning = NIL;
        meaning = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            psp_parse_tree_generator.psp_note_semantic_dependency(edge, meaning, head_dtr, meaning);
            cdolist_list_var = cdolist_list_var.rest();
            meaning = cdolist_list_var.first();
        } 
        return semx;
    }

    /**
     *
     *
     * @return LISTP of CycL expressions of OUTPUT-TYPE from EDGE,
    getting a template from one daughter and substituting the semantics
    of the other daughters into that template.
     */
    @LispMethod(comment = "@return LISTP of CycL expressions of OUTPUT-TYPE from EDGE,\r\ngetting a template from one daughter and substituting the semantics\r\nof the other daughters into that template.")
    public static final SubLObject psp_edge_multi_dtr_semx_alt(SubLObject edge, SubLObject output_type) {
        {
            SubLObject semx = NIL;
            SubLObject rule_struct = psp_chart.psp_edge_rule_struct(edge);
            SubLObject syn_head_dtr_num = psp_chart.psp_edge_head_dtr_num(edge);
            SubLObject rule_fort = psp_chart.psp_edge_rule_fort(edge);
            SubLObject rule_semx = psp_rules.psp_rule_semx(rule_struct);
            SubLObject semx_type = rule_semx.first();
            SubLObject semx_args = rule_semx.rest();
            SubLObject semx_head_dtr_num = semx_args.first();
            SubLObject semx_head_dtr = (semx_head_dtr_num.isInteger()) ? ((SubLObject) (psp_chart.psp_edge_nth_dtr(semx_head_dtr_num, edge))) : NIL;
            SubLObject semx_head_dtr_cat = (NIL != semx_head_dtr) ? ((SubLObject) (psp_chart.get_psp_edge_category(psp_chart.psp_edge_lexical_head_dtr(semx_head_dtr)))) : NIL;
            SubLObject syn_headP = eql(syn_head_dtr_num, semx_head_dtr_num);
            if (semx_type == $IDENTITY) {
                return copy_psp_cycls(psp_semantics_for_edge_int(semx_head_dtr, $DENOT_GROUND));
            }
            {
                SubLObject raw_bindings = (NIL != list_utilities.lengthG(semx_args, ONE_INTEGER, UNPROVIDED)) ? ((SubLObject) (semx_args.rest())) : NIL != semx_head_dtr ? ((SubLObject) (psp_chart.psp_bindings_from_head(semx_head_dtr))) : NIL;
                SubLObject template_type = (NIL != psp_modifier_dtrP(semx_head_dtr, edge)) ? ((SubLObject) (psp_semantic_output_type(NIL, NIL))) : psp_template_form(output_type);
                SubLObject templates = (NIL != semx_head_dtr) ? ((SubLObject) (psp_semantics_for_edge_int(semx_head_dtr, template_type))) : NIL;
                SubLObject head_key = psp_head_key_from_bindings(raw_bindings, syn_head_dtr_num);
                if (((NIL != templates) && (NIL != head_key)) && (semx_head_dtr_cat != $$Adverb)) {
                    templates = psp_coerce_templates_to_collections(semx_head_dtr, templates, syn_headP, head_key);
                }
                if (NIL == templates) {
                    if (NIL != psp_rules.psp_traced_ruleP(rule_fort)) {
                        format(T, $str_alt49$No_templates_for__S___, edge);
                    }
                } else {
                    {
                        SubLObject ppb_result = psp_process_bindings(raw_bindings, edge, rule_struct, output_type);
                        if (ppb_result != $NON_WFF) {
                            {
                                SubLObject cdolist_list_var = templates;
                                SubLObject template = NIL;
                                for (template = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template = cdolist_list_var.first()) {
                                    if (NIL != ppb_result) {
                                        {
                                            SubLObject cdolist_list_var_1 = ppb_result;
                                            SubLObject v_bindings = NIL;
                                            for (v_bindings = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , v_bindings = cdolist_list_var_1.first()) {
                                                {
                                                    SubLObject result = psp_substitute_bindings(template, v_bindings, head_key);
                                                    if (result != $NON_WFF) {
                                                        semx = cons(result, semx);
                                                        {
                                                            SubLObject dependencies = psp_determine_semantic_dependencies(template, v_bindings, raw_bindings);
                                                            SubLObject cdolist_list_var_2 = dependencies;
                                                            SubLObject cons = NIL;
                                                            for (cons = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , cons = cdolist_list_var_2.first()) {
                                                                {
                                                                    SubLObject datum = cons;
                                                                    SubLObject current = datum;
                                                                    SubLObject dtr_num = NIL;
                                                                    SubLObject dtr_semx = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list_alt51);
                                                                    dtr_num = current.first();
                                                                    current = current.rest();
                                                                    dtr_semx = current;
                                                                    {
                                                                        SubLObject dtr = psp_chart.psp_edge_nth_dtr(dtr_num, edge);
                                                                        psp_parse_tree_generator.psp_note_semantic_dependency(edge, result, dtr, dtr_semx);
                                                                        psp_parse_tree_generator.psp_note_semantic_dependency(edge, result, semx_head_dtr, template);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        semx = cons(template, semx);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (NIL == semx) {
                if (NIL != psp_rules.psp_traced_ruleP(rule_fort)) {
                    format(T, $str_alt52$__Couldn_t_find_template_semx_for, psp_chart.get_psp_edge_string(edge), rule_fort);
                }
            }
            return semx;
        }
    }

    /**
     *
     *
     * @return LISTP of CycL expressions of OUTPUT-TYPE from EDGE,
    getting a template from one daughter and substituting the semantics
    of the other daughters into that template.
     */
    @LispMethod(comment = "@return LISTP of CycL expressions of OUTPUT-TYPE from EDGE,\r\ngetting a template from one daughter and substituting the semantics\r\nof the other daughters into that template.")
    public static SubLObject psp_edge_multi_dtr_semx(final SubLObject edge, final SubLObject output_type) {
        SubLObject semx = NIL;
        final SubLObject rule_struct = psp_chart.psp_edge_rule_struct(edge);
        final SubLObject syn_head_dtr_num = psp_chart.psp_edge_head_dtr_num(edge);
        final SubLObject rule_fort = psp_chart.psp_edge_rule_fort(edge);
        final SubLObject rule_semx = psp_rules.psp_rule_semx(rule_struct);
        final SubLObject semx_type = rule_semx.first();
        final SubLObject semx_args = rule_semx.rest();
        final SubLObject semx_head_dtr_num = semx_args.first();
        final SubLObject semx_head_dtr = (semx_head_dtr_num.isInteger()) ? psp_chart.psp_edge_nth_dtr(semx_head_dtr_num, edge) : NIL;
        final SubLObject semx_head_dtr_cat = (NIL != semx_head_dtr) ? psp_chart.get_psp_edge_category(psp_chart.psp_edge_lexical_head_dtr(semx_head_dtr)) : NIL;
        final SubLObject syn_headP = eql(syn_head_dtr_num, semx_head_dtr_num);
        if (semx_type == $IDENTITY) {
            return copy_psp_cycls(psp_semantics_for_edge_int(semx_head_dtr, $DENOT_GROUND));
        }
        final SubLObject raw_bindings = (NIL != list_utilities.lengthG(semx_args, ONE_INTEGER, UNPROVIDED)) ? semx_args.rest() : NIL != semx_head_dtr ? psp_chart.psp_bindings_from_head(semx_head_dtr) : NIL;
        final SubLObject template_type = (NIL != psp_modifier_dtrP(semx_head_dtr, edge)) ? psp_semantic_output_type(NIL, NIL) : psp_template_form(output_type);
        SubLObject templates = (NIL != semx_head_dtr) ? psp_semantics_for_edge_int(semx_head_dtr, template_type) : NIL;
        final SubLObject head_key = psp_head_key_from_bindings(raw_bindings, syn_head_dtr_num);
        if (((NIL != templates) && (NIL != head_key)) && (!semx_head_dtr_cat.eql($$Adverb))) {
            templates = psp_coerce_templates_to_collections(semx_head_dtr, templates, syn_headP, head_key);
        }
        if (NIL == templates) {
            if (NIL != psp_rules.psp_traced_ruleP(rule_fort)) {
                format(T, $str54$No_templates_for__S___, edge);
            }
        } else {
            final SubLObject ppb_result = psp_process_bindings(raw_bindings, edge, rule_struct, output_type);
            if (ppb_result != $NON_WFF) {
                SubLObject cdolist_list_var = templates;
                SubLObject template = NIL;
                template = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != ppb_result) {
                        SubLObject cdolist_list_var_$1 = ppb_result;
                        SubLObject v_bindings = NIL;
                        v_bindings = cdolist_list_var_$1.first();
                        while (NIL != cdolist_list_var_$1) {
                            final SubLObject result = psp_substitute_bindings(template, v_bindings, head_key);
                            if (result != $NON_WFF) {
                                semx = cons(result, semx);
                                SubLObject cdolist_list_var_$2;
                                final SubLObject dependencies = cdolist_list_var_$2 = psp_determine_semantic_dependencies(template, v_bindings, raw_bindings);
                                SubLObject cons = NIL;
                                cons = cdolist_list_var_$2.first();
                                while (NIL != cdolist_list_var_$2) {
                                    SubLObject current;
                                    final SubLObject datum = current = cons;
                                    SubLObject dtr_num = NIL;
                                    SubLObject dtr_semx = NIL;
                                    destructuring_bind_must_consp(current, datum, $list56);
                                    dtr_num = current.first();
                                    current = dtr_semx = current.rest();
                                    final SubLObject dtr = psp_chart.psp_edge_nth_dtr(dtr_num, edge);
                                    psp_parse_tree_generator.psp_note_semantic_dependency(edge, result, dtr, dtr_semx);
                                    psp_parse_tree_generator.psp_note_semantic_dependency(edge, result, semx_head_dtr, template);
                                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                                    cons = cdolist_list_var_$2.first();
                                } 
                            }
                            cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                            v_bindings = cdolist_list_var_$1.first();
                        } 
                    } else {
                        semx = cons(template, semx);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    template = cdolist_list_var.first();
                } 
            }
        }
        if ((NIL == semx) && (NIL != psp_rules.psp_traced_ruleP(rule_fort))) {
            format(T, $str57$__Couldn_t_find_template_semx_for, psp_chart.get_psp_edge_string(edge), rule_fort);
        }
        return semx;
    }

    /**
     * Gather semantic dependencies for substituting BINDINGS into TEMPLATE.
     *
     * @unknown ALIST-P; Mapping DTR-NUM to DTR-SEMX, such that the DTR-NUMth daughter of
    the phrase whose semantics is being computed must have DTR-SEMX as its semantics.
     */
    @LispMethod(comment = "Gather semantic dependencies for substituting BINDINGS into TEMPLATE.\r\n\r\n@unknown ALIST-P; Mapping DTR-NUM to DTR-SEMX, such that the DTR-NUMth daughter of\r\nthe phrase whose semantics is being computed must have DTR-SEMX as its semantics.")
    public static final SubLObject psp_determine_semantic_dependencies_alt(SubLObject template, SubLObject v_bindings, SubLObject raw_bindings) {
        {
            SubLObject dependencies = NIL;
            SubLObject keys = cycl_utilities.expression_gather(template, symbol_function(KEYWORDP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = keys;
            SubLObject key = NIL;
            for (key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , key = cdolist_list_var.first()) {
                {
                    SubLObject dtr_num = NIL;
                    SubLObject dtr_semx = NIL;
                    if (NIL == dtr_semx) {
                        {
                            SubLObject csome_list_var = v_bindings;
                            SubLObject binding = NIL;
                            for (binding = csome_list_var.first(); !((NIL != dtr_semx) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , binding = csome_list_var.first()) {
                                {
                                    SubLObject datum = binding;
                                    SubLObject current = datum;
                                    SubLObject binding_semx = NIL;
                                    SubLObject binding_key = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt54);
                                    binding_semx = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt54);
                                    binding_key = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        if (binding_key == key) {
                                            dtr_semx = binding_semx;
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt54);
                                    }
                                }
                            }
                        }
                    }
                    if (NIL == dtr_num) {
                        {
                            SubLObject csome_list_var = raw_bindings;
                            SubLObject binding = NIL;
                            for (binding = csome_list_var.first(); !((NIL != dtr_num) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , binding = csome_list_var.first()) {
                                {
                                    SubLObject datum = binding;
                                    SubLObject current = datum;
                                    SubLObject level = NIL;
                                    SubLObject binding_dtr_num = NIL;
                                    SubLObject binding_key = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt55);
                                    level = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt55);
                                    binding_dtr_num = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt55);
                                    binding_key = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        if (binding_key == key) {
                                            dtr_num = binding_dtr_num;
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt55);
                                    }
                                }
                            }
                        }
                    }
                    if ((NIL != dtr_num) && (NIL != dtr_semx)) {
                        dependencies = list_utilities.alist_enter(dependencies, dtr_num, dtr_semx, UNPROVIDED);
                    }
                }
            }
            return dependencies;
        }
    }

    /**
     * Gather semantic dependencies for substituting BINDINGS into TEMPLATE.
     *
     * @unknown ALIST-P; Mapping DTR-NUM to DTR-SEMX, such that the DTR-NUMth daughter of
    the phrase whose semantics is being computed must have DTR-SEMX as its semantics.
     */
    @LispMethod(comment = "Gather semantic dependencies for substituting BINDINGS into TEMPLATE.\r\n\r\n@unknown ALIST-P; Mapping DTR-NUM to DTR-SEMX, such that the DTR-NUMth daughter of\r\nthe phrase whose semantics is being computed must have DTR-SEMX as its semantics.")
    public static SubLObject psp_determine_semantic_dependencies(final SubLObject template, final SubLObject v_bindings, final SubLObject raw_bindings) {
        SubLObject dependencies = NIL;
        SubLObject cdolist_list_var;
        final SubLObject keys = cdolist_list_var = cycl_utilities.expression_gather(template, symbol_function(KEYWORDP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject key = NIL;
        key = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject dtr_num = NIL;
            SubLObject dtr_semx = NIL;
            if (NIL == dtr_semx) {
                SubLObject csome_list_var = v_bindings;
                SubLObject binding = NIL;
                binding = csome_list_var.first();
                while ((NIL == dtr_semx) && (NIL != csome_list_var)) {
                    SubLObject current;
                    final SubLObject datum = current = binding;
                    SubLObject binding_semx = NIL;
                    SubLObject binding_key = NIL;
                    destructuring_bind_must_consp(current, datum, $list59);
                    binding_semx = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list59);
                    binding_key = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (binding_key.eql(key)) {
                            dtr_semx = binding_semx;
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list59);
                    }
                    csome_list_var = csome_list_var.rest();
                    binding = csome_list_var.first();
                } 
            }
            if (NIL == dtr_num) {
                SubLObject csome_list_var = raw_bindings;
                SubLObject binding = NIL;
                binding = csome_list_var.first();
                while ((NIL == dtr_num) && (NIL != csome_list_var)) {
                    SubLObject current;
                    final SubLObject datum = current = binding;
                    SubLObject level = NIL;
                    SubLObject binding_dtr_num = NIL;
                    SubLObject binding_key2 = NIL;
                    destructuring_bind_must_consp(current, datum, $list60);
                    level = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list60);
                    binding_dtr_num = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list60);
                    binding_key2 = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (binding_key2.eql(key)) {
                            dtr_num = binding_dtr_num;
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list60);
                    }
                    csome_list_var = csome_list_var.rest();
                    binding = csome_list_var.first();
                } 
            }
            if ((NIL != dtr_num) && (NIL != dtr_semx)) {
                dependencies = list_utilities.alist_enter(dependencies, dtr_num, dtr_semx, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        } 
        return dependencies;
    }

    public static final SubLObject psp_semx_slurp_handlers_alt(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_vars.$psp_rule_lookup_mt$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            psp_semx_clear_handlers();
            {
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject pred_var = $$psRuleSemanticsHandler;
                            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                        {
                                                            SubLObject done_var_3 = NIL;
                                                            SubLObject token_var_4 = NIL;
                                                            while (NIL == done_var_3) {
                                                                {
                                                                    SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_4);
                                                                    SubLObject valid_5 = makeBoolean(token_var_4 != as);
                                                                    if (NIL != valid_5) {
                                                                        {
                                                                            SubLObject datum = assertions_high.gaf_args(as);
                                                                            SubLObject current = datum;
                                                                            SubLObject rule = NIL;
                                                                            SubLObject method = NIL;
                                                                            destructuring_bind_must_consp(current, datum, $list_alt59);
                                                                            rule = current.first();
                                                                            current = current.rest();
                                                                            destructuring_bind_must_consp(current, datum, $list_alt59);
                                                                            method = current.first();
                                                                            current = current.rest();
                                                                            if (NIL == current) {
                                                                                method = cycl_subl_symbol_symbol(method);
                                                                                if (NIL != fboundp(method)) {
                                                                                    dictionary_utilities.dictionary_push($psp_special_semantic_methods$.getGlobalValue(), $DENOT_GROUND, list(rule, method));
                                                                                }
                                                                            } else {
                                                                                cdestructuring_bind_error(datum, $list_alt59);
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_3 = makeBoolean(NIL == valid_5);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
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
            }
            dictionary.dictionary_enter($psp_special_semantic_methods$.getGlobalValue(), $INIT_STATE, $INITIALIZED);
            return $psp_special_semantic_methods$.getGlobalValue();
        }
    }

    public static SubLObject psp_semx_slurp_handlers(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_vars.$psp_rule_lookup_mt$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        psp_semx_clear_handlers();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject pred_var = $$psRuleSemanticsHandler;
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$3 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$4 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_2_$5 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                try {
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                    $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    $progress_notification_count$.bind(ZERO_INTEGER, thread);
                    $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                    $progress_count$.bind(ZERO_INTEGER, thread);
                    $is_noting_progressP$.bind(T, thread);
                    $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                    noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            note_progress();
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$6 = NIL;
                                final SubLObject token_var_$7 = NIL;
                                while (NIL == done_var_$6) {
                                    final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$7);
                                    final SubLObject valid_$8 = makeBoolean(!token_var_$7.eql(as));
                                    if (NIL != valid_$8) {
                                        SubLObject current;
                                        final SubLObject datum = current = assertions_high.gaf_args(as);
                                        SubLObject rule = NIL;
                                        SubLObject method = NIL;
                                        destructuring_bind_must_consp(current, datum, $list64);
                                        rule = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list64);
                                        method = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            method = cycl_subl_symbol_symbol(method);
                                            if (NIL != fboundp(method)) {
                                                dictionary_utilities.dictionary_push($psp_special_semantic_methods$.getGlobalValue(), $DENOT_GROUND, list(rule, method));
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list64);
                                        }
                                    }
                                    done_var_$6 = makeBoolean(NIL == valid_$8);
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
                        done_var = makeBoolean(NIL == valid);
                    } 
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$5, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$4, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        dictionary.dictionary_enter($psp_special_semantic_methods$.getGlobalValue(), $INIT_STATE, $INITIALIZED);
        return $psp_special_semantic_methods$.getGlobalValue();
    }

    public static final SubLObject psp_semx_clear_handlers_alt() {
        return dictionary.clear_dictionary($psp_special_semantic_methods$.getGlobalValue());
    }

    public static SubLObject psp_semx_clear_handlers() {
        return dictionary.clear_dictionary($psp_special_semantic_methods$.getGlobalValue());
    }

    public static final SubLObject psp_special_methods_for_output_type_alt(SubLObject output_type) {
        if (dictionary.dictionary_lookup($psp_special_semantic_methods$.getGlobalValue(), $INIT_STATE, UNPROVIDED) != $INITIALIZED) {
            psp_semx_slurp_handlers(UNPROVIDED);
        }
        return dictionary.dictionary_lookup($psp_special_semantic_methods$.getGlobalValue(), output_type, UNPROVIDED);
    }

    public static SubLObject psp_special_methods_for_output_type(final SubLObject output_type) {
        if (dictionary.dictionary_lookup($psp_special_semantic_methods$.getGlobalValue(), $INIT_STATE, UNPROVIDED) != $INITIALIZED) {
            psp_semx_slurp_handlers(UNPROVIDED);
        }
        return dictionary.dictionary_lookup($psp_special_semantic_methods$.getGlobalValue(), output_type, UNPROVIDED);
    }

    /**
     *
     *
     * @return BOOLEAN; Is there a special method defined for computing the semantics
    of EDGE of the appropriate type?
     */
    @LispMethod(comment = "@return BOOLEAN; Is there a special method defined for computing the semantics\r\nof EDGE of the appropriate type?")
    public static final SubLObject psp_edge_semx_specialP_alt(SubLObject edge, SubLObject output_type) {
        return list_utilities.sublisp_boolean(psp_edge_special_method(edge, output_type));
    }

    /**
     *
     *
     * @return BOOLEAN; Is there a special method defined for computing the semantics
    of EDGE of the appropriate type?
     */
    @LispMethod(comment = "@return BOOLEAN; Is there a special method defined for computing the semantics\r\nof EDGE of the appropriate type?")
    public static SubLObject psp_edge_semx_specialP(final SubLObject edge, final SubLObject output_type) {
        return list_utilities.sublisp_boolean(psp_edge_special_method(edge, output_type));
    }

    public static final SubLObject psp_edge_special_method_alt(SubLObject edge, SubLObject output_type) {
        {
            SubLObject method = NIL;
            if (NIL == method) {
                {
                    SubLObject csome_list_var = psp_special_methods_for_output_type(output_type);
                    SubLObject pair = NIL;
                    for (pair = csome_list_var.first(); !((NIL != method) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , pair = csome_list_var.first()) {
                        {
                            SubLObject datum = pair;
                            SubLObject current = datum;
                            SubLObject rule = NIL;
                            SubLObject this_method = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt62);
                            rule = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt62);
                            this_method = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (psp_chart.psp_edge_rule_fort(edge) == rule) {
                                    method = this_method;
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt62);
                            }
                        }
                    }
                }
            }
            return method;
        }
    }

    public static SubLObject psp_edge_special_method(final SubLObject edge, final SubLObject output_type) {
        SubLObject method = NIL;
        if (NIL == method) {
            SubLObject csome_list_var = psp_special_methods_for_output_type(output_type);
            SubLObject pair = NIL;
            pair = csome_list_var.first();
            while ((NIL == method) && (NIL != csome_list_var)) {
                SubLObject current;
                final SubLObject datum = current = pair;
                SubLObject rule = NIL;
                SubLObject this_method = NIL;
                destructuring_bind_must_consp(current, datum, $list67);
                rule = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list67);
                this_method = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (psp_chart.psp_edge_rule_fort(edge).eql(rule)) {
                        method = this_method;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list67);
                }
                csome_list_var = csome_list_var.rest();
                pair = csome_list_var.first();
            } 
        }
        return method;
    }

    public static final SubLObject psp_edge_special_semx_alt(SubLObject edge, SubLObject output_type) {
        {
            SubLObject method = psp_edge_special_method(edge, output_type);
            if (NIL != fboundp(method)) {
                return funcall(method, edge);
            }
        }
        return NIL;
    }

    public static SubLObject psp_edge_special_semx(final SubLObject edge, final SubLObject output_type) {
        final SubLObject method = psp_edge_special_method(edge, output_type);
        if (NIL != fboundp(method)) {
            return funcall(method, edge);
        }
        return NIL;
    }

    /**
     *
     *
     * @return LISTP of CycL expressions for the semantics of the nbar-participle EDGE.
     */
    @LispMethod(comment = "@return LISTP of CycL expressions for the semantics of the nbar-participle EDGE.")
    public static final SubLObject psp_semx_for_participle_rel_clause_nbar_alt(SubLObject edge) {
        {
            SubLObject cycls = NIL;
            SubLObject nbar = psp_chart.psp_edge_nth_dtr(ONE_INTEGER, edge);
            SubLObject nbar_cycls = psp_semantics_for_edge_int(nbar, $DENOT_GROUND);
            SubLObject participle = psp_chart.psp_edge_nth_dtr(TWO_INTEGER, edge);
            SubLObject participle_templates = psp_semantics_for_edge_int(participle, $DENOT_TEMPLATE);
            return NIL;
        }
    }

    /**
     *
     *
     * @return LISTP of CycL expressions for the semantics of the nbar-participle EDGE.
     */
    @LispMethod(comment = "@return LISTP of CycL expressions for the semantics of the nbar-participle EDGE.")
    public static SubLObject psp_semx_for_participle_rel_clause_nbar(final SubLObject edge) {
        final SubLObject cycls = NIL;
        final SubLObject nbar = psp_chart.psp_edge_nth_dtr(ONE_INTEGER, edge);
        final SubLObject nbar_cycls = psp_semantics_for_edge_int(nbar, $DENOT_GROUND);
        final SubLObject participle = psp_chart.psp_edge_nth_dtr(TWO_INTEGER, edge);
        final SubLObject participle_templates = psp_semantics_for_edge_int(participle, $DENOT_TEMPLATE);
        return NIL;
    }

    /**
     *
     *
     * @return LISTP of CycL expressions for the semantics of the det-nbar EDGE.
    Necessary because possessive pronouns alter their nbar's semx.
     */
    @LispMethod(comment = "@return LISTP of CycL expressions for the semantics of the det-nbar EDGE.\r\nNecessary because possessive pronouns alter their nbar\'s semx.")
    public static final SubLObject psp_semx_for_det_nbar_alt(SubLObject edge) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cycls = NIL;
                SubLObject detp = psp_chart.psp_edge_nth_dtr(ONE_INTEGER, edge);
                SubLObject det_pos = psp_chart.get_psp_edge_category(psp_chart.psp_edge_lexical_head_dtr(detp));
                SubLObject nbar = psp_chart.psp_edge_nth_dtr(TWO_INTEGER, edge);
                SubLObject nbar_cycls = psp_semantics_for_edge_int(nbar, $DENOT_GROUND);
                if (NIL != psp_possessive_det_posP(det_pos)) {
                    {
                        SubLObject cdolist_list_var = psp_semantics_for_edge_int(detp, $DENOT_GROUND);
                        SubLObject det_denot = NIL;
                        for (det_denot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , det_denot = cdolist_list_var.first()) {
                            {
                                SubLObject weightless_det_denot = psp_cycl_cycl(det_denot);
                                SubLObject cdolist_list_var_7 = copy_psp_cycls(nbar_cycls);
                                SubLObject nbar_denot = NIL;
                                for (nbar_denot = cdolist_list_var_7.first(); NIL != cdolist_list_var_7; cdolist_list_var_7 = cdolist_list_var_7.rest() , nbar_denot = cdolist_list_var_7.first()) {
                                    {
                                        SubLObject weightless_nbar_denot = psp_cycl_cycl(nbar_denot);
                                        SubLObject tagless_weightless_nbar_denot = parsing_utilities.strip_nl_tags(weightless_nbar_denot, T);
                                        if (NIL != psp_collectionP(tagless_weightless_nbar_denot)) {
                                            {
                                                SubLObject number_tag = ((NIL != parsing_utilities.nl_tagged_termP(weightless_nbar_denot)) && (cycl_utilities.nat_function(weightless_nbar_denot) == $$NLNumberFn)) ? ((SubLObject) (cycl_utilities.nat_arg1(weightless_nbar_denot, UNPROVIDED))) : NIL;
                                                SubLObject template = $list_alt64;
                                                SubLObject v_bindings = list(list(tagless_weightless_nbar_denot, $NBAR), list(weightless_det_denot, $DET));
                                                SubLObject result = psp_substitute_bindings(template, v_bindings, $NBAR);
                                                if (result != $NON_WFF) {
                                                    if (NIL != number_tag) {
                                                        result = list($$NLNumberFn, number_tag, result);
                                                    }
                                                    {
                                                        SubLObject item_var = result;
                                                        if (NIL == member(item_var, cycls, EQUAL, symbol_function(IDENTITY))) {
                                                            cycls = cons(item_var, cycls);
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
                } else {
                    if (NIL == parsing_vars.$npp_use_nl_tagsP$.getDynamicValue(thread)) {
                        {
                            SubLObject cdolist_list_var = nbar_cycls;
                            SubLObject nbar_denot = NIL;
                            for (nbar_denot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , nbar_denot = cdolist_list_var.first()) {
                                {
                                    SubLObject weightless_nbar_denot = psp_cycl_cycl(nbar_denot);
                                    SubLObject cdolist_list_var_8 = psp_semantics_for_edge_int(detp, $DENOT_GROUND);
                                    SubLObject det_denot = NIL;
                                    for (det_denot = cdolist_list_var_8.first(); NIL != cdolist_list_var_8; cdolist_list_var_8 = cdolist_list_var_8.rest() , det_denot = cdolist_list_var_8.first()) {
                                        {
                                            SubLObject weightless_det_denot = psp_cycl_cycl(det_denot);
                                            if (NIL != at_defns.quiet_has_typeP(weightless_det_denot, $$NLDefinitenessAttribute, UNPROVIDED)) {
                                                {
                                                    SubLObject item_var = weightless_nbar_denot;
                                                    if (NIL == member(item_var, cycls, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                        cycls = cons(item_var, cycls);
                                                    }
                                                }
                                            } else {
                                                if (NIL != parsing_utilities.nl_tagP(weightless_det_denot, UNPROVIDED)) {
                                                } else {
                                                    if (NIL == lexicon_utilities.det_denot_is_scalar_intervalP(weightless_det_denot)) {
                                                        {
                                                            SubLObject item_var = weightless_nbar_denot;
                                                            if (NIL == member(item_var, cycls, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                cycls = cons(item_var, cycls);
                                                            }
                                                        }
                                                    } else {
                                                        if (NIL != at_defns.quiet_has_typeP(weightless_nbar_denot, $$ScalarInterval, UNPROVIDED)) {
                                                            {
                                                                SubLObject math = list($$TimesFn, weightless_det_denot, weightless_nbar_denot);
                                                                thread.resetMultipleValues();
                                                                {
                                                                    SubLObject evaluated = relation_evaluation.cyc_evaluate(math);
                                                                    SubLObject evaluatedP = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != evaluatedP) {
                                                                        math = evaluated;
                                                                    }
                                                                }
                                                                {
                                                                    SubLObject item_var = math;
                                                                    if (NIL == member(item_var, cycls, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                        cycls = cons(item_var, cycls);
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            if ((NIL != subl_promotions.positive_integer_p(weightless_det_denot)) && (NIL != fort_types_interface.collection_in_any_mtP(weightless_nbar_denot))) {
                                                                cycls = cons(make_binary_formula($$GroupOfCardinalityFn, weightless_nbar_denot, weightless_det_denot), cycls);
                                                            } else {
                                                                if (NIL != isa.isa_in_any_mtP(weightless_nbar_denot, $$UnitOfMeasure)) {
                                                                    cycls = cons(make_unary_formula(weightless_nbar_denot, weightless_det_denot), cycls);
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
                    } else {
                        cycls = copy_psp_cycls(nbar_cycls);
                    }
                }
                return cycls;
            }
        }
    }

    /**
     *
     *
     * @return LISTP of CycL expressions for the semantics of the det-nbar EDGE.
    Necessary because possessive pronouns alter their nbar's semx.
     */
    @LispMethod(comment = "@return LISTP of CycL expressions for the semantics of the det-nbar EDGE.\r\nNecessary because possessive pronouns alter their nbar\'s semx.")
    public static SubLObject psp_semx_for_det_nbar(final SubLObject edge) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cycls = NIL;
        final SubLObject detp = psp_chart.psp_edge_nth_dtr(ONE_INTEGER, edge);
        final SubLObject det_pos = psp_chart.get_psp_edge_category(psp_chart.psp_edge_lexical_head_dtr(detp));
        final SubLObject nbar = psp_chart.psp_edge_nth_dtr(TWO_INTEGER, edge);
        final SubLObject nbar_cycls = psp_semantics_for_edge_int(nbar, $DENOT_GROUND);
        if (NIL != psp_possessive_det_posP(det_pos)) {
            SubLObject cdolist_list_var = psp_semantics_for_edge_int(detp, $DENOT_GROUND);
            SubLObject det_denot = NIL;
            det_denot = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject weightless_det_denot = psp_cycl_cycl(det_denot);
                SubLObject cdolist_list_var_$10 = copy_psp_cycls(nbar_cycls);
                SubLObject nbar_denot = NIL;
                nbar_denot = cdolist_list_var_$10.first();
                while (NIL != cdolist_list_var_$10) {
                    final SubLObject weightless_nbar_denot = psp_cycl_cycl(nbar_denot);
                    final SubLObject tagless_weightless_nbar_denot = parsing_utilities.strip_nl_tags(weightless_nbar_denot, T);
                    if (NIL != psp_collectionP(tagless_weightless_nbar_denot)) {
                        final SubLObject number_tag = ((NIL != parsing_utilities.nl_tagged_termP(weightless_nbar_denot)) && cycl_utilities.nat_function(weightless_nbar_denot).eql($$NLNumberFn)) ? cycl_utilities.nat_arg1(weightless_nbar_denot, UNPROVIDED) : NIL;
                        final SubLObject template = $list69;
                        final SubLObject v_bindings = list(list(tagless_weightless_nbar_denot, $NBAR), list(weightless_det_denot, $DET));
                        SubLObject result = psp_substitute_bindings(template, v_bindings, $NBAR);
                        if (result != $NON_WFF) {
                            if (NIL != number_tag) {
                                result = list($$NLNumberFn, number_tag, result);
                            }
                            final SubLObject item_var = result;
                            if (NIL == member(item_var, cycls, EQUAL, symbol_function(IDENTITY))) {
                                cycls = cons(item_var, cycls);
                            }
                        }
                    }
                    cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                    nbar_denot = cdolist_list_var_$10.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                det_denot = cdolist_list_var.first();
            } 
        } else
            if (NIL == parsing_vars.$npp_use_nl_tagsP$.getDynamicValue(thread)) {
                SubLObject cdolist_list_var = nbar_cycls;
                SubLObject nbar_denot2 = NIL;
                nbar_denot2 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject weightless_nbar_denot2 = psp_cycl_cycl(nbar_denot2);
                    SubLObject cdolist_list_var_$11 = psp_semantics_for_edge_int(detp, $DENOT_GROUND);
                    SubLObject det_denot2 = NIL;
                    det_denot2 = cdolist_list_var_$11.first();
                    while (NIL != cdolist_list_var_$11) {
                        final SubLObject weightless_det_denot2 = psp_cycl_cycl(det_denot2);
                        if (NIL != at_defns.quiet_has_typeP(weightless_det_denot2, $$NLDefinitenessAttribute, UNPROVIDED)) {
                            final SubLObject item_var2 = weightless_nbar_denot2;
                            if (NIL == member(item_var2, cycls, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                cycls = cons(item_var2, cycls);
                            }
                        } else
                            if (NIL == parsing_utilities.nl_tagP(weightless_det_denot2, UNPROVIDED)) {
                                if (NIL == lexicon_utilities.det_denot_is_scalar_intervalP(weightless_det_denot2)) {
                                    final SubLObject item_var2 = weightless_nbar_denot2;
                                    if (NIL == member(item_var2, cycls, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        cycls = cons(item_var2, cycls);
                                    }
                                } else
                                    if (NIL != at_defns.quiet_has_typeP(weightless_nbar_denot2, $$ScalarInterval, UNPROVIDED)) {
                                        SubLObject math = list($$TimesFn, weightless_det_denot2, weightless_nbar_denot2);
                                        thread.resetMultipleValues();
                                        final SubLObject evaluated = relation_evaluation.cyc_evaluate(math);
                                        final SubLObject evaluatedP = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != evaluatedP) {
                                            math = evaluated;
                                        }
                                        final SubLObject item_var3 = math;
                                        if (NIL == member(item_var3, cycls, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                            cycls = cons(item_var3, cycls);
                                        }
                                    } else
                                        if ((NIL != subl_promotions.positive_integer_p(weightless_det_denot2)) && (NIL != fort_types_interface.collection_in_any_mtP(weightless_nbar_denot2))) {
                                            cycls = cons(make_binary_formula($$GroupOfCardinalityFn, weightless_nbar_denot2, weightless_det_denot2), cycls);
                                        } else
                                            if (NIL != isa.isa_in_any_mtP(weightless_nbar_denot2, $$UnitOfMeasure)) {
                                                cycls = cons(make_unary_formula(weightless_nbar_denot2, weightless_det_denot2), cycls);
                                            }



                            }

                        cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                        det_denot2 = cdolist_list_var_$11.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    nbar_denot2 = cdolist_list_var.first();
                } 
            } else {
                cycls = copy_psp_cycls(nbar_cycls);
            }

        return cycls;
    }

    /**
     *
     *
     * @return BOOLEAN; Is CATEGORY such as we would expect a possessive determiner to have?
     */
    @LispMethod(comment = "@return BOOLEAN; Is CATEGORY such as we would expect a possessive determiner to have?")
    public static final SubLObject psp_possessive_det_posP_alt(SubLObject category) {
        return makeBoolean((NIL != psp_genl_posP(category, $$PossessivePronoun_Pre, UNPROVIDED)) || (NIL != psp_genl_posP(category, $$PossessiveMarker_Sg, UNPROVIDED)));
    }

    /**
     *
     *
     * @return BOOLEAN; Is CATEGORY such as we would expect a possessive determiner to have?
     */
    @LispMethod(comment = "@return BOOLEAN; Is CATEGORY such as we would expect a possessive determiner to have?")
    public static SubLObject psp_possessive_det_posP(final SubLObject category) {
        return makeBoolean((NIL != psp_genl_posP(category, $$PossessivePronoun_Pre, UNPROVIDED)) || (NIL != psp_genl_posP(category, $$PossessiveMarker_Sg, UNPROVIDED)));
    }

    /**
     *
     *
     * @return LISTP of CycL expressions for the semantics
    of the NBar EDGE in *PSP-CHART*, assuming EDGE is of the form 'NBar' 'of' 'NP'.
     */
    @LispMethod(comment = "@return LISTP of CycL expressions for the semantics\r\nof the NBar EDGE in *PSP-CHART*, assuming EDGE is of the form \'NBar\' \'of\' \'NP\'.")
    public static final SubLObject psp_semx_for_of_noun_compound_alt(SubLObject edge) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = parsing_vars.$psp_generality_preference$.currentBinding(thread);
                    try {
                        parsing_vars.$psp_generality_preference$.bind($NONE, thread);
                        {
                            SubLObject dtr1 = psp_chart.psp_edge_nth_dtr(ONE_INTEGER, edge);
                            SubLObject dtr2 = psp_chart.psp_edge_nth_dtr(TWO_INTEGER, edge);
                            SubLObject of_phraseP = makeBoolean(((NIL != dtr2) && (NIL != psp_chart.psp_edge_nth_dtr(ONE_INTEGER, dtr2))) && psp_chart.get_psp_edge_string(psp_chart.psp_edge_nth_dtr(ONE_INTEGER, dtr2)).equal($$$of));
                            SubLObject np_dtr = (NIL != of_phraseP) ? ((SubLObject) (psp_chart.psp_edge_nth_dtr(TWO_INTEGER, dtr2))) : NIL;
                            if (!(((NIL != psp_chart.psp_gap_edge_p(dtr1)) || (NIL != psp_chart.psp_gap_edge_p(dtr2))) || (NIL == np_dtr))) {
                                {
                                    SubLObject value_type = (NIL != parsing_vars.$rbp_include_word_unitsP$.getDynamicValue(thread)) ? ((SubLObject) ($QUADS)) : $TRIPLES;
                                    SubLObject tokens1 = rbp_tokens_from_edge(dtr1, value_type);
                                    SubLObject tokens2 = rbp_tokens_from_edge(np_dtr, value_type);
                                    SubLObject timed_outP = parsing_macros.parsing_timeout_time_reachedP();
                                    if (!(((NIL != psp_regular_pluralP(psp_chart.get_psp_edge_string(dtr1), psp_chart.get_psp_edge_pos_pred(dtr1))) || (NIL != psp_closed_class_edge_likely_misconstrued_as_nameP(dtr1))) || (NIL != psp_closed_class_edge_likely_misconstrued_as_nameP(np_dtr)))) {
                                        if (NIL == timed_outP) {
                                            {
                                                SubLObject csome_list_var = tokens1;
                                                SubLObject token1 = NIL;
                                                for (token1 = csome_list_var.first(); !((NIL != timed_outP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , token1 = csome_list_var.first()) {
                                                    if (NIL == timed_outP) {
                                                        {
                                                            SubLObject csome_list_var_9 = tokens2;
                                                            SubLObject token2 = NIL;
                                                            for (token2 = csome_list_var_9.first(); !((NIL != timed_outP) || (NIL == csome_list_var_9)); csome_list_var_9 = csome_list_var_9.rest() , token2 = csome_list_var_9.first()) {
                                                                {
                                                                    SubLObject tokens = list(token2, token1);
                                                                    SubLObject best = NIL;
                                                                    SubLObject rest = NIL;
                                                                    SubLObject time = NIL;
                                                                    SubLObject time_var = get_internal_real_time();
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject best_10 = psp_parse_noun_compound_tokens(tokens);
                                                                        SubLObject rest_11 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        best = best_10;
                                                                        rest = rest_11;
                                                                    }
                                                                    time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                                                    if ((NIL != parsing_vars.$psp_verboseP$.getDynamicValue(thread)) && time.numG($float$0_1)) {
                                                                        Errors.warn($str_alt79$Parsed__S_in__S_seconds_, tokens, time);
                                                                    }
                                                                    if (parsing_vars.$psp_return_mode$.getDynamicValue(thread) != $BEST_ONLY) {
                                                                        {
                                                                            SubLObject dispreferred_weight = parsing_utilities.psp_weight_from_float($float$0_8);
                                                                            SubLObject cdolist_list_var = rest;
                                                                            SubLObject annotated_parse = NIL;
                                                                            for (annotated_parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , annotated_parse = cdolist_list_var.first()) {
                                                                                {
                                                                                    SubLObject datum = annotated_parse;
                                                                                    SubLObject current = datum;
                                                                                    SubLObject parse = NIL;
                                                                                    SubLObject comments = NIL;
                                                                                    destructuring_bind_must_consp(current, datum, $list_alt82);
                                                                                    parse = current.first();
                                                                                    current = current.rest();
                                                                                    destructuring_bind_must_consp(current, datum, $list_alt82);
                                                                                    comments = current.first();
                                                                                    current = current.rest();
                                                                                    if (NIL == current) {
                                                                                        {
                                                                                            SubLObject datum_12 = parse;
                                                                                            SubLObject current_13 = datum_12;
                                                                                            SubLObject cycl = NIL;
                                                                                            SubLObject pos_pred = NIL;
                                                                                            destructuring_bind_must_consp(current_13, datum_12, $list_alt83);
                                                                                            cycl = current_13.first();
                                                                                            current_13 = current_13.rest();
                                                                                            destructuring_bind_must_consp(current_13, datum_12, $list_alt83);
                                                                                            pos_pred = current_13.first();
                                                                                            current_13 = current_13.rest();
                                                                                            if (NIL == current_13) {
                                                                                                {
                                                                                                    SubLObject weighted_cycl = new_psp_weighted_cycl(cycl, dispreferred_weight);
                                                                                                    ans = cons(weighted_cycl, ans);
                                                                                                }
                                                                                            } else {
                                                                                                cdestructuring_bind_error(datum_12, $list_alt83);
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        cdestructuring_bind_error(datum, $list_alt82);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    {
                                                                        SubLObject cdolist_list_var = best;
                                                                        SubLObject parse = NIL;
                                                                        for (parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parse = cdolist_list_var.first()) {
                                                                            {
                                                                                SubLObject datum = parse;
                                                                                SubLObject current = datum;
                                                                                SubLObject cycl = NIL;
                                                                                SubLObject pos_pred = NIL;
                                                                                destructuring_bind_must_consp(current, datum, $list_alt83);
                                                                                cycl = current.first();
                                                                                current = current.rest();
                                                                                destructuring_bind_must_consp(current, datum, $list_alt83);
                                                                                pos_pred = current.first();
                                                                                current = current.rest();
                                                                                if (NIL == current) {
                                                                                    ans = cons(cycl, ans);
                                                                                } else {
                                                                                    cdestructuring_bind_error(datum, $list_alt83);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                timed_outP = parsing_macros.parsing_timeout_time_reachedP();
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
                    } finally {
                        parsing_vars.$psp_generality_preference$.rebind(_prev_bind_0, thread);
                    }
                }
                return psp_filter_cycls_by_generality(ans);
            }
        }
    }

    /**
     *
     *
     * @return LISTP of CycL expressions for the semantics
    of the NBar EDGE in *PSP-CHART*, assuming EDGE is of the form 'NBar' 'of' 'NP'.
     */
    @LispMethod(comment = "@return LISTP of CycL expressions for the semantics\r\nof the NBar EDGE in *PSP-CHART*, assuming EDGE is of the form \'NBar\' \'of\' \'NP\'.")
    public static SubLObject psp_semx_for_of_noun_compound(final SubLObject edge) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = parsing_vars.$psp_generality_preference$.currentBinding(thread);
        try {
            parsing_vars.$psp_generality_preference$.bind($NONE, thread);
            final SubLObject dtr1 = psp_chart.psp_edge_nth_dtr(ONE_INTEGER, edge);
            final SubLObject dtr2 = psp_chart.psp_edge_nth_dtr(TWO_INTEGER, edge);
            final SubLObject of_phraseP = makeBoolean(((NIL != dtr2) && (NIL != psp_chart.psp_edge_nth_dtr(ONE_INTEGER, dtr2))) && psp_chart.get_psp_edge_string(psp_chart.psp_edge_nth_dtr(ONE_INTEGER, dtr2)).equal($$$of));
            final SubLObject np_dtr = (NIL != of_phraseP) ? psp_chart.psp_edge_nth_dtr(TWO_INTEGER, dtr2) : NIL;
            if (((NIL == psp_chart.psp_gap_edge_p(dtr1)) && (NIL == psp_chart.psp_gap_edge_p(dtr2))) && (NIL != np_dtr)) {
                final SubLObject value_type = (NIL != parsing_vars.$rbp_include_word_unitsP$.getDynamicValue(thread)) ? $QUADS : $TRIPLES;
                final SubLObject tokens1 = rbp_tokens_from_edge(dtr1, value_type);
                final SubLObject tokens2 = rbp_tokens_from_edge(np_dtr, value_type);
                SubLObject timed_outP = parsing_macros.parsing_timeout_time_reachedP();
                if ((((NIL == psp_regular_pluralP(psp_chart.get_psp_edge_string(dtr1), psp_chart.get_psp_edge_pos_pred(dtr1))) && (NIL == psp_closed_class_edge_likely_misconstrued_as_nameP(dtr1))) && (NIL == psp_closed_class_edge_likely_misconstrued_as_nameP(np_dtr))) && (NIL == timed_outP)) {
                    SubLObject csome_list_var = tokens1;
                    SubLObject token1 = NIL;
                    token1 = csome_list_var.first();
                    while ((NIL == timed_outP) && (NIL != csome_list_var)) {
                        if (NIL == timed_outP) {
                            SubLObject csome_list_var_$12 = tokens2;
                            SubLObject token2 = NIL;
                            token2 = csome_list_var_$12.first();
                            while ((NIL == timed_outP) && (NIL != csome_list_var_$12)) {
                                final SubLObject tokens3 = list(token2, token1);
                                SubLObject best = NIL;
                                SubLObject rest = NIL;
                                SubLObject time = NIL;
                                final SubLObject time_var = get_internal_real_time();
                                thread.resetMultipleValues();
                                final SubLObject best_$13 = psp_parse_noun_compound_tokens(tokens3);
                                final SubLObject rest_$14 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                best = best_$13;
                                rest = rest_$14;
                                time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                if ((NIL != parsing_vars.$psp_verboseP$.getDynamicValue(thread)) && time.numG($float$0_1)) {
                                    Errors.warn($str84$Parsed__S_in__S_seconds_, tokens3, time);
                                }
                                if (parsing_vars.$psp_return_mode$.getDynamicValue(thread) != $BEST_ONLY) {
                                    final SubLObject dispreferred_weight = parsing_utilities.psp_weight_from_float($float$0_8);
                                    SubLObject cdolist_list_var = rest;
                                    SubLObject annotated_parse = NIL;
                                    annotated_parse = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        SubLObject current;
                                        final SubLObject datum = current = annotated_parse;
                                        SubLObject parse = NIL;
                                        SubLObject comments = NIL;
                                        destructuring_bind_must_consp(current, datum, $list87);
                                        parse = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list87);
                                        comments = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            SubLObject current_$16;
                                            final SubLObject datum_$15 = current_$16 = parse;
                                            SubLObject cycl = NIL;
                                            SubLObject pos_pred = NIL;
                                            destructuring_bind_must_consp(current_$16, datum_$15, $list88);
                                            cycl = current_$16.first();
                                            current_$16 = current_$16.rest();
                                            destructuring_bind_must_consp(current_$16, datum_$15, $list88);
                                            pos_pred = current_$16.first();
                                            current_$16 = current_$16.rest();
                                            if (NIL == current_$16) {
                                                final SubLObject weighted_cycl = new_psp_weighted_cycl(cycl, dispreferred_weight);
                                                ans = cons(weighted_cycl, ans);
                                            } else {
                                                cdestructuring_bind_error(datum_$15, $list88);
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list87);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        annotated_parse = cdolist_list_var.first();
                                    } 
                                }
                                SubLObject cdolist_list_var2 = best;
                                SubLObject parse2 = NIL;
                                parse2 = cdolist_list_var2.first();
                                while (NIL != cdolist_list_var2) {
                                    SubLObject current2;
                                    final SubLObject datum2 = current2 = parse2;
                                    SubLObject cycl2 = NIL;
                                    SubLObject pos_pred2 = NIL;
                                    destructuring_bind_must_consp(current2, datum2, $list88);
                                    cycl2 = current2.first();
                                    current2 = current2.rest();
                                    destructuring_bind_must_consp(current2, datum2, $list88);
                                    pos_pred2 = current2.first();
                                    current2 = current2.rest();
                                    if (NIL == current2) {
                                        ans = cons(cycl2, ans);
                                    } else {
                                        cdestructuring_bind_error(datum2, $list88);
                                    }
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    parse2 = cdolist_list_var2.first();
                                } 
                                timed_outP = parsing_macros.parsing_timeout_time_reachedP();
                                csome_list_var_$12 = csome_list_var_$12.rest();
                                token2 = csome_list_var_$12.first();
                            } 
                        }
                        csome_list_var = csome_list_var.rest();
                        token1 = csome_list_var.first();
                    } 
                }
            }
        } finally {
            parsing_vars.$psp_generality_preference$.rebind(_prev_bind_0, thread);
        }
        return psp_filter_cycls_by_generality(ans);
    }

    /**
     *
     *
     * @return LISTP of CycL expressions for the semantics
    of the noun-compound EDGE in *PSP-CHART*.
     */
    @LispMethod(comment = "@return LISTP of CycL expressions for the semantics\r\nof the noun-compound EDGE in *PSP-CHART*.")
    public static final SubLObject psp_semx_for_noun_compound_alt(SubLObject edge) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = parsing_vars.$psp_generality_preference$.currentBinding(thread);
                    try {
                        parsing_vars.$psp_generality_preference$.bind($NONE, thread);
                        {
                            SubLObject dtr1 = psp_chart.psp_edge_nth_dtr(ONE_INTEGER, edge);
                            SubLObject dtr2 = psp_chart.psp_edge_nth_dtr(TWO_INTEGER, edge);
                            if (!((NIL != psp_chart.psp_gap_edge_p(dtr1)) || (NIL != psp_chart.psp_gap_edge_p(dtr2)))) {
                                {
                                    SubLObject value_type = (NIL != parsing_vars.$rbp_include_word_unitsP$.getDynamicValue(thread)) ? ((SubLObject) ($QUADS)) : $TRIPLES;
                                    SubLObject tokens1 = rbp_tokens_from_edge(dtr1, value_type);
                                    SubLObject tokens2 = rbp_tokens_from_edge(dtr2, value_type);
                                    SubLObject timed_outP = parsing_macros.parsing_timeout_time_reachedP();
                                    if (!(((NIL != psp_regular_pluralP(psp_chart.get_psp_edge_string(dtr1), psp_chart.get_psp_edge_pos_pred(dtr1))) || (NIL != psp_closed_class_edge_likely_misconstrued_as_nameP(dtr1))) || (NIL != psp_closed_class_edge_likely_misconstrued_as_nameP(dtr2)))) {
                                        if (NIL == timed_outP) {
                                            {
                                                SubLObject csome_list_var = tokens1;
                                                SubLObject token1 = NIL;
                                                for (token1 = csome_list_var.first(); !((NIL != timed_outP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , token1 = csome_list_var.first()) {
                                                    if (NIL == timed_outP) {
                                                        {
                                                            SubLObject csome_list_var_14 = tokens2;
                                                            SubLObject token2 = NIL;
                                                            for (token2 = csome_list_var_14.first(); !((NIL != timed_outP) || (NIL == csome_list_var_14)); csome_list_var_14 = csome_list_var_14.rest() , token2 = csome_list_var_14.first()) {
                                                                {
                                                                    SubLObject _prev_bind_0_15 = parsing_vars.$rbp_reformulate_resultsP$.currentBinding(thread);
                                                                    try {
                                                                        parsing_vars.$rbp_reformulate_resultsP$.bind(NIL, thread);
                                                                        {
                                                                            SubLObject tokens = list(token1, token2);
                                                                            SubLObject best = NIL;
                                                                            SubLObject rest = NIL;
                                                                            SubLObject time = NIL;
                                                                            SubLObject time_var = get_internal_real_time();
                                                                            thread.resetMultipleValues();
                                                                            {
                                                                                SubLObject best_16 = psp_parse_noun_compound_tokens(tokens);
                                                                                SubLObject rest_17 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                best = best_16;
                                                                                rest = rest_17;
                                                                            }
                                                                            time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                                                            if ((NIL != parsing_vars.$psp_verboseP$.getDynamicValue(thread)) && time.numG($float$0_1)) {
                                                                                Errors.warn($str_alt79$Parsed__S_in__S_seconds_, tokens, time);
                                                                            }
                                                                            if (parsing_vars.$psp_return_mode$.getDynamicValue(thread) != $BEST_ONLY) {
                                                                                {
                                                                                    SubLObject dispreferred_weight = parsing_utilities.psp_weight_from_float($float$0_8);
                                                                                    SubLObject cdolist_list_var = rest;
                                                                                    SubLObject annotated_parse = NIL;
                                                                                    for (annotated_parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , annotated_parse = cdolist_list_var.first()) {
                                                                                        {
                                                                                            SubLObject datum = annotated_parse;
                                                                                            SubLObject current = datum;
                                                                                            SubLObject parse = NIL;
                                                                                            SubLObject comments = NIL;
                                                                                            destructuring_bind_must_consp(current, datum, $list_alt82);
                                                                                            parse = current.first();
                                                                                            current = current.rest();
                                                                                            destructuring_bind_must_consp(current, datum, $list_alt82);
                                                                                            comments = current.first();
                                                                                            current = current.rest();
                                                                                            if (NIL == current) {
                                                                                                {
                                                                                                    SubLObject datum_18 = parse;
                                                                                                    SubLObject current_19 = datum_18;
                                                                                                    SubLObject cycl = NIL;
                                                                                                    SubLObject pos_pred = NIL;
                                                                                                    destructuring_bind_must_consp(current_19, datum_18, $list_alt83);
                                                                                                    cycl = current_19.first();
                                                                                                    current_19 = current_19.rest();
                                                                                                    destructuring_bind_must_consp(current_19, datum_18, $list_alt83);
                                                                                                    pos_pred = current_19.first();
                                                                                                    current_19 = current_19.rest();
                                                                                                    if (NIL == current_19) {
                                                                                                        {
                                                                                                            SubLObject weighted_cycl = new_psp_weighted_cycl(cycl, dispreferred_weight);
                                                                                                            ans = cons(weighted_cycl, ans);
                                                                                                        }
                                                                                                    } else {
                                                                                                        cdestructuring_bind_error(datum_18, $list_alt83);
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                cdestructuring_bind_error(datum, $list_alt82);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            {
                                                                                SubLObject cdolist_list_var = best;
                                                                                SubLObject parse = NIL;
                                                                                for (parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parse = cdolist_list_var.first()) {
                                                                                    {
                                                                                        SubLObject datum = parse;
                                                                                        SubLObject current = datum;
                                                                                        SubLObject cycl = NIL;
                                                                                        SubLObject pos_pred = NIL;
                                                                                        destructuring_bind_must_consp(current, datum, $list_alt83);
                                                                                        cycl = current.first();
                                                                                        current = current.rest();
                                                                                        destructuring_bind_must_consp(current, datum, $list_alt83);
                                                                                        pos_pred = current.first();
                                                                                        current = current.rest();
                                                                                        if (NIL == current) {
                                                                                            ans = cons(cycl, ans);
                                                                                        } else {
                                                                                            cdestructuring_bind_error(datum, $list_alt83);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        parsing_vars.$rbp_reformulate_resultsP$.rebind(_prev_bind_0_15, thread);
                                                                    }
                                                                }
                                                                timed_outP = parsing_macros.parsing_timeout_time_reachedP();
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
                    } finally {
                        parsing_vars.$psp_generality_preference$.rebind(_prev_bind_0, thread);
                    }
                }
                return psp_filter_cycls_by_generality(ans);
            }
        }
    }

    /**
     *
     *
     * @return LISTP of CycL expressions for the semantics
    of the noun-compound EDGE in *PSP-CHART*.
     */
    @LispMethod(comment = "@return LISTP of CycL expressions for the semantics\r\nof the noun-compound EDGE in *PSP-CHART*.")
    public static SubLObject psp_semx_for_noun_compound(final SubLObject edge) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = parsing_vars.$psp_generality_preference$.currentBinding(thread);
        try {
            parsing_vars.$psp_generality_preference$.bind($NONE, thread);
            final SubLObject dtr1 = psp_chart.psp_edge_nth_dtr(ONE_INTEGER, edge);
            final SubLObject dtr2 = psp_chart.psp_edge_nth_dtr(TWO_INTEGER, edge);
            if ((NIL == psp_chart.psp_gap_edge_p(dtr1)) && (NIL == psp_chart.psp_gap_edge_p(dtr2))) {
                final SubLObject value_type = (NIL != parsing_vars.$rbp_include_word_unitsP$.getDynamicValue(thread)) ? $QUADS : $TRIPLES;
                final SubLObject tokens1 = rbp_tokens_from_edge(dtr1, value_type);
                final SubLObject tokens2 = rbp_tokens_from_edge(dtr2, value_type);
                SubLObject timed_outP = parsing_macros.parsing_timeout_time_reachedP();
                if ((((NIL == psp_regular_pluralP(psp_chart.get_psp_edge_string(dtr1), psp_chart.get_psp_edge_pos_pred(dtr1))) && (NIL == psp_closed_class_edge_likely_misconstrued_as_nameP(dtr1))) && (NIL == psp_closed_class_edge_likely_misconstrued_as_nameP(dtr2))) && (NIL == timed_outP)) {
                    SubLObject csome_list_var = tokens1;
                    SubLObject token1 = NIL;
                    token1 = csome_list_var.first();
                    while ((NIL == timed_outP) && (NIL != csome_list_var)) {
                        if (NIL == timed_outP) {
                            SubLObject csome_list_var_$17 = tokens2;
                            SubLObject token2 = NIL;
                            token2 = csome_list_var_$17.first();
                            while ((NIL == timed_outP) && (NIL != csome_list_var_$17)) {
                                final SubLObject _prev_bind_0_$18 = parsing_vars.$rbp_reformulate_resultsP$.currentBinding(thread);
                                try {
                                    parsing_vars.$rbp_reformulate_resultsP$.bind(NIL, thread);
                                    final SubLObject tokens3 = list(token1, token2);
                                    SubLObject best = NIL;
                                    SubLObject rest = NIL;
                                    SubLObject time = NIL;
                                    final SubLObject time_var = get_internal_real_time();
                                    thread.resetMultipleValues();
                                    final SubLObject best_$19 = psp_parse_noun_compound_tokens(tokens3);
                                    final SubLObject rest_$20 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    best = best_$19;
                                    rest = rest_$20;
                                    time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                    if ((NIL != parsing_vars.$psp_verboseP$.getDynamicValue(thread)) && time.numG($float$0_1)) {
                                        Errors.warn($str84$Parsed__S_in__S_seconds_, tokens3, time);
                                    }
                                    if (parsing_vars.$psp_return_mode$.getDynamicValue(thread) != $BEST_ONLY) {
                                        final SubLObject dispreferred_weight = parsing_utilities.psp_weight_from_float($float$0_8);
                                        SubLObject cdolist_list_var = rest;
                                        SubLObject annotated_parse = NIL;
                                        annotated_parse = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            SubLObject current;
                                            final SubLObject datum = current = annotated_parse;
                                            SubLObject parse = NIL;
                                            SubLObject comments = NIL;
                                            destructuring_bind_must_consp(current, datum, $list87);
                                            parse = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list87);
                                            comments = current.first();
                                            current = current.rest();
                                            if (NIL == current) {
                                                SubLObject current_$22;
                                                final SubLObject datum_$21 = current_$22 = parse;
                                                SubLObject cycl = NIL;
                                                SubLObject pos_pred = NIL;
                                                destructuring_bind_must_consp(current_$22, datum_$21, $list88);
                                                cycl = current_$22.first();
                                                current_$22 = current_$22.rest();
                                                destructuring_bind_must_consp(current_$22, datum_$21, $list88);
                                                pos_pred = current_$22.first();
                                                current_$22 = current_$22.rest();
                                                if (NIL == current_$22) {
                                                    final SubLObject weighted_cycl = new_psp_weighted_cycl(cycl, dispreferred_weight);
                                                    ans = cons(weighted_cycl, ans);
                                                } else {
                                                    cdestructuring_bind_error(datum_$21, $list88);
                                                }
                                            } else {
                                                cdestructuring_bind_error(datum, $list87);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            annotated_parse = cdolist_list_var.first();
                                        } 
                                    }
                                    SubLObject cdolist_list_var2 = best;
                                    SubLObject parse2 = NIL;
                                    parse2 = cdolist_list_var2.first();
                                    while (NIL != cdolist_list_var2) {
                                        SubLObject current2;
                                        final SubLObject datum2 = current2 = parse2;
                                        SubLObject cycl2 = NIL;
                                        SubLObject pos_pred2 = NIL;
                                        destructuring_bind_must_consp(current2, datum2, $list88);
                                        cycl2 = current2.first();
                                        current2 = current2.rest();
                                        destructuring_bind_must_consp(current2, datum2, $list88);
                                        pos_pred2 = current2.first();
                                        current2 = current2.rest();
                                        if (NIL == current2) {
                                            ans = cons(cycl2, ans);
                                        } else {
                                            cdestructuring_bind_error(datum2, $list88);
                                        }
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        parse2 = cdolist_list_var2.first();
                                    } 
                                } finally {
                                    parsing_vars.$rbp_reformulate_resultsP$.rebind(_prev_bind_0_$18, thread);
                                }
                                timed_outP = parsing_macros.parsing_timeout_time_reachedP();
                                csome_list_var_$17 = csome_list_var_$17.rest();
                                token2 = csome_list_var_$17.first();
                            } 
                        }
                        csome_list_var = csome_list_var.rest();
                        token1 = csome_list_var.first();
                    } 
                }
            }
        } finally {
            parsing_vars.$psp_generality_preference$.rebind(_prev_bind_0, thread);
        }
        return psp_filter_cycls_by_generality(ans);
    }

    public static final SubLObject rbp_tokens_from_edge_alt(SubLObject edge, SubLObject value_type) {
        {
            SubLObject string = psp_chart.get_psp_edge_string(edge);
            SubLObject pos = psp_chart.get_psp_edge_category(edge);
            SubLObject wu = psp_chart.get_psp_edge_wu(edge);
            SubLObject pred = psp_chart.get_psp_edge_pos_pred(edge);
            SubLObject cycls = psp_semantics_for_edge_int(edge, $DENOT_GROUND);
            SubLObject tokens = NIL;
            SubLObject cdolist_list_var = cons($NO_DENOT, cycls);
            SubLObject cycl = NIL;
            for (cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycl = cdolist_list_var.first()) {
                {
                    SubLObject my_value_type = np_parser.make_npp_value_type(value_type, psp_cycl_cycl(cycl), pos, pred, wu);
                    SubLObject s_token = standard_tokenization.new_string_token(string, list(my_value_type));
                    tokens = cons(s_token, tokens);
                }
            }
            return tokens;
        }
    }

    public static SubLObject rbp_tokens_from_edge(final SubLObject edge, final SubLObject value_type) {
        final SubLObject string = psp_chart.get_psp_edge_string(edge);
        final SubLObject pos = psp_chart.get_psp_edge_category(edge);
        final SubLObject wu = psp_chart.get_psp_edge_wu(edge);
        final SubLObject pred = psp_chart.get_psp_edge_pos_pred(edge);
        final SubLObject cycls = psp_semantics_for_edge_int(edge, $DENOT_GROUND);
        SubLObject tokens = NIL;
        SubLObject cdolist_list_var = cons($NO_DENOT, cycls);
        SubLObject cycl = NIL;
        cycl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject my_value_type = np_parser.make_npp_value_type(value_type, psp_cycl_cycl(cycl), pos, pred, wu);
            final SubLObject s_token = standard_tokenization.new_string_token(string, list(my_value_type));
            tokens = cons(s_token, tokens);
            cdolist_list_var = cdolist_list_var.rest();
            cycl = cdolist_list_var.first();
        } 
        return tokens;
    }

    public static final SubLObject psp_regular_pluralP_alt(SubLObject string, SubLObject pred) {
        {
            SubLObject regularP = makeBoolean(((NIL != lexicon_accessors.speech_part_predP(pred, UNPROVIDED)) && (NIL != nl_trie_accessors.nl_trie_regular_formP(string, pred, UNPROVIDED))) && (NIL != lexicon_accessors.genl_pos_predP(pred, $$plural_Generic, UNPROVIDED)));
            return regularP;
        }
    }

    public static SubLObject psp_regular_pluralP(final SubLObject string, final SubLObject pred) {
        final SubLObject regularP = makeBoolean(((NIL != lexicon_accessors.speech_part_predP(pred, UNPROVIDED)) && (NIL != nl_trie_accessors.nl_trie_regular_formP(string, pred, UNPROVIDED))) && (NIL != lexicon_accessors.genl_pos_predP(pred, $$plural_Generic, UNPROVIDED)));
        return regularP;
    }

    public static final SubLObject psp_closed_class_edge_likely_misconstrued_as_nameP_alt(SubLObject edge) {
        return psp_closed_class_likely_misconstrued_as_nameP(psp_chart.get_psp_edge_string(edge), psp_chart.get_psp_edge_category(edge), psp_chart.get_psp_edge_pos_pred(edge));
    }

    public static SubLObject psp_closed_class_edge_likely_misconstrued_as_nameP(final SubLObject edge) {
        return psp_closed_class_likely_misconstrued_as_nameP(psp_chart.get_psp_edge_string(edge), psp_chart.get_psp_edge_category(edge), psp_chart.get_psp_edge_pos_pred(edge));
    }

    public static final SubLObject psp_closed_class_likely_misconstrued_as_nameP_alt(SubLObject string, SubLObject pos, SubLObject pred) {
        return makeBoolean((((NIL != lexicon_accessors.closed_lexical_class_stringP(string, UNPROVIDED)) && (NIL == find_if(UPPER_CASE_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != lexicon_accessors.npP(pos))) && (NIL != lexicon_vars.name_string_predP(pred)));
    }

    public static SubLObject psp_closed_class_likely_misconstrued_as_nameP(final SubLObject string, final SubLObject pos, final SubLObject pred) {
        return makeBoolean((((NIL != lexicon_accessors.closed_lexical_class_stringP(string, UNPROVIDED)) && (NIL == find_if(UPPER_CASE_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != lexicon_accessors.npP(pos))) && (NIL != lexicon_vars.name_string_predP(pred)));
    }

    public static final SubLObject psp_parse_noun_compound_tokens_internal_alt(SubLObject tokens) {
        return noun_compound_parser.parse_noun_compound_from_string_tokens(tokens, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject psp_parse_noun_compound_tokens_internal(final SubLObject tokens) {
        return noun_compound_parser.parse_noun_compound_from_string_tokens(tokens, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject psp_parse_noun_compound_tokens_alt(SubLObject tokens) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return psp_parse_noun_compound_tokens_internal(tokens);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PSP_PARSE_NOUN_COMPOUND_TOKENS, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PSP_PARSE_NOUN_COMPOUND_TOKENS, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, PSP_PARSE_NOUN_COMPOUND_TOKENS, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, tokens, $kw46$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw46$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_parse_noun_compound_tokens_internal(tokens)));
                        memoization_state.caching_state_put(caching_state, tokens, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject psp_parse_noun_compound_tokens(final SubLObject tokens) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return psp_parse_noun_compound_tokens_internal(tokens);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PSP_PARSE_NOUN_COMPOUND_TOKENS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PSP_PARSE_NOUN_COMPOUND_TOKENS, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PSP_PARSE_NOUN_COMPOUND_TOKENS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, tokens, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_parse_noun_compound_tokens_internal(tokens)));
            memoization_state.caching_state_put(caching_state, tokens, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject psp_semx_for_gerund_np_alt(SubLObject edge) {
        {
            SubLObject vbar_semx = psp_semantics_for_edge_int(psp_chart.get_psp_edge_head_dtr(edge), $DENOT_TEMPLATE);
            SubLObject simplified_vbar_semx = Mapping.mapcar(PSP_EXTRACT_SUBJECT_SEMX, vbar_semx);
            SubLObject semx = Mapping.mapcar(PSP_QUANTIFY_SUBJECT, simplified_vbar_semx);
            return semx;
        }
    }

    public static SubLObject psp_semx_for_gerund_np(final SubLObject edge) {
        final SubLObject vbar_semx = psp_semantics_for_edge_int(psp_chart.get_psp_edge_head_dtr(edge), $DENOT_TEMPLATE);
        final SubLObject simplified_vbar_semx = Mapping.mapcar(PSP_EXTRACT_SUBJECT_SEMX, vbar_semx);
        final SubLObject semx = Mapping.mapcar(PSP_QUANTIFY_SUBJECT, simplified_vbar_semx);
        return semx;
    }

    public static final SubLObject psp_semx_for_appositive_np_alt(SubLObject edge) {
        {
            SubLObject sem_head_dtr = psp_chart.psp_edge_nth_dtr(THREE_INTEGER, edge);
            SubLObject raw_semx = (NIL != psp_chart.phrase_structure_parser_edge_p(sem_head_dtr)) ? ((SubLObject) (psp_semantics_for_edge_int(sem_head_dtr, $DENOT_GROUND))) : NIL;
            return psp_rules.psp_filter_cycls(raw_semx, THREE_INTEGER, psp_chart.psp_edge_rule_struct(edge), edge);
        }
    }

    public static SubLObject psp_semx_for_appositive_np(final SubLObject edge) {
        final SubLObject sem_head_dtr = psp_chart.psp_edge_nth_dtr(THREE_INTEGER, edge);
        final SubLObject raw_semx = (NIL != psp_chart.phrase_structure_parser_edge_p(sem_head_dtr)) ? psp_semantics_for_edge_int(sem_head_dtr, $DENOT_GROUND) : NIL;
        return psp_rules.psp_filter_cycls(raw_semx, THREE_INTEGER, psp_chart.psp_edge_rule_struct(edge), edge);
    }

    public static final SubLObject psp_modifier_dtrP_alt(SubLObject dtr, SubLObject mother) {
        return makeBoolean((dtr == psp_chart.psp_edge_sem_head_dtr(mother)) && (dtr != psp_chart.get_psp_edge_head_dtr(mother)));
    }

    public static SubLObject psp_modifier_dtrP(final SubLObject dtr, final SubLObject mother) {
        return makeBoolean(dtr.eql(psp_chart.psp_edge_sem_head_dtr(mother)) && (!dtr.eql(psp_chart.get_psp_edge_head_dtr(mother))));
    }

    /**
     *
     *
     * @return KEYWORDP or NIL.
     */
    @LispMethod(comment = "@return KEYWORDP or NIL.")
    public static final SubLObject psp_head_key_from_bindings_alt(SubLObject v_bindings, SubLObject head_dtr_num) {
        {
            SubLObject head_key = NIL;
            if (v_bindings.isList()) {
                if (NIL == head_key) {
                    {
                        SubLObject csome_list_var = v_bindings;
                        SubLObject binding = NIL;
                        for (binding = csome_list_var.first(); !((NIL != head_key) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , binding = csome_list_var.first()) {
                            {
                                SubLObject datum = binding;
                                SubLObject current = datum;
                                SubLObject instance_or_typeP = NIL;
                                SubLObject dtr_num = NIL;
                                SubLObject keyword = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt90);
                                instance_or_typeP = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt90);
                                dtr_num = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt90);
                                keyword = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if ((instance_or_typeP == $INSTANCE) && dtr_num.eql(head_dtr_num)) {
                                        head_key = keyword;
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt90);
                                }
                            }
                        }
                    }
                }
            }
            return head_key;
        }
    }

    /**
     *
     *
     * @return KEYWORDP or NIL.
     */
    @LispMethod(comment = "@return KEYWORDP or NIL.")
    public static SubLObject psp_head_key_from_bindings(final SubLObject v_bindings, final SubLObject head_dtr_num) {
        SubLObject head_key = NIL;
        if (v_bindings.isList() && (NIL == head_key)) {
            SubLObject csome_list_var = v_bindings;
            SubLObject binding = NIL;
            binding = csome_list_var.first();
            while ((NIL == head_key) && (NIL != csome_list_var)) {
                SubLObject current;
                final SubLObject datum = current = binding;
                SubLObject instance_or_typeP = NIL;
                SubLObject dtr_num = NIL;
                SubLObject keyword = NIL;
                destructuring_bind_must_consp(current, datum, $list95);
                instance_or_typeP = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list95);
                dtr_num = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list95);
                keyword = current.first();
                current = current.rest();
                if (NIL == current) {
                    if ((instance_or_typeP == $INSTANCE) && dtr_num.eql(head_dtr_num)) {
                        head_key = keyword;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list95);
                }
                csome_list_var = csome_list_var.rest();
                binding = csome_list_var.first();
            } 
        }
        return head_key;
    }

    public static final SubLObject psp_coerce_templates_to_collections_alt(SubLObject edge, SubLObject templates, SubLObject syn_headP, SubLObject head_key) {
        {
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = templates;
            SubLObject template = NIL;
            for (template = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template = cdolist_list_var.first()) {
                {
                    SubLObject coll_template = psp_coerce_template_to_collection(template, syn_headP, head_key);
                    if (coll_template != $ERROR) {
                        if (NIL == psp_cycl_E(coll_template, template)) {
                            psp_parse_tree_generator.psp_note_semantic_dependency(edge, coll_template, edge, template);
                        }
                        {
                            SubLObject item_var = coll_template;
                            if (NIL == member(item_var, ans, $sym93$PSP_CYCL__, symbol_function(IDENTITY))) {
                                ans = cons(item_var, ans);
                            }
                        }
                    }
                }
            }
            return ans;
        }
    }

    public static SubLObject psp_coerce_templates_to_collections(final SubLObject edge, final SubLObject templates, final SubLObject syn_headP, final SubLObject head_key) {
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = templates;
        SubLObject template = NIL;
        template = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject coll_template = psp_coerce_template_to_collection(template, syn_headP, head_key);
            if (coll_template != $ERROR) {
                if (NIL == psp_cycl_E(coll_template, template)) {
                    psp_parse_tree_generator.psp_note_semantic_dependency(edge, coll_template, edge, template);
                }
                final SubLObject item_var = coll_template;
                if (NIL == member(item_var, ans, $sym98$PSP_CYCL__, symbol_function(IDENTITY))) {
                    ans = cons(item_var, ans);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            template = cdolist_list_var.first();
        } 
        return ans;
    }

    /**
     *
     *
     * @param SYN-HEAD?
     * 		Is the template daughter the syntactic head of the phrase?
     */
    @LispMethod(comment = "@param SYN-HEAD?\r\n\t\tIs the template daughter the syntactic head of the phrase?")
    public static final SubLObject psp_coerce_template_to_collection_alt(SubLObject template, SubLObject syn_headP, SubLObject head_key) {
        {
            SubLObject weightless_template = psp_cycl_cycl(template);
            SubLObject template_weight = psp_cycl_weight(template);
            if (NIL != rbp_wff.npp_collectionP(weightless_template)) {
                return template;
            }
            {
                SubLObject ans = psp_coerce_template_to_collection_memoized(weightless_template, syn_headP, head_key);
                return psp_weight_cycl(ans, template_weight);
            }
        }
    }

    /**
     *
     *
     * @param SYN-HEAD?
     * 		Is the template daughter the syntactic head of the phrase?
     */
    @LispMethod(comment = "@param SYN-HEAD?\r\n\t\tIs the template daughter the syntactic head of the phrase?")
    public static SubLObject psp_coerce_template_to_collection(final SubLObject template, final SubLObject syn_headP, final SubLObject head_key) {
        final SubLObject weightless_template = psp_cycl_cycl(template);
        final SubLObject template_weight = psp_cycl_weight(template);
        if (NIL != rbp_wff.npp_collectionP(weightless_template)) {
            return template;
        }
        final SubLObject ans = psp_coerce_template_to_collection_memoized(weightless_template, syn_headP, head_key);
        return psp_weight_cycl(ans, template_weight);
    }

    public static final SubLObject psp_coerce_template_to_collection_memoized_internal_alt(SubLObject weightless_template, SubLObject syn_headP, SubLObject head_key) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject head_collection = head_key;
                SubLObject phs_status = $OK;
                if (NIL != syn_headP) {
                    thread.resetMultipleValues();
                    {
                        SubLObject head_collection_20 = psp_extract_head_semx(weightless_template, head_key);
                        SubLObject weightless_template_21 = thread.secondMultipleValue();
                        SubLObject phs_status_22 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        head_collection = head_collection_20;
                        weightless_template = weightless_template_21;
                        phs_status = phs_status_22;
                    }
                }
                if (phs_status == $ERROR) {
                    ans = $ERROR;
                } else {
                    if (NIL == weightless_template) {
                        ans = head_collection;
                    } else {
                        {
                            SubLObject head_var = czer_utilities.unique_el_var_wrt_expression(weightless_template, $sym96$_OBJ);
                            SubLObject restrictions_formula = psp_handle_keywords_in_formula(weightless_template, head_var, head_key);
                            SubLObject new_restrictions = (NIL != el_conjunction_p(restrictions_formula)) ? ((SubLObject) (cycl_utilities.formula_args(restrictions_formula, UNPROVIDED))) : list(restrictions_formula);
                            SubLObject isa_clause = psp_find_isa(new_restrictions, head_var);
                            if (NIL != cycl_utilities.expression_find($REPLACE, cycl_utilities.formula_arg2(isa_clause, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                head_collection = cycl_utilities.formula_arg2(isa_clause, UNPROVIDED);
                                new_restrictions = remove(isa_clause, new_restrictions, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            {
                                SubLObject nat = parsing_utilities.make_collection_expression(head_collection, head_var, new_restrictions);
                                ans = nat;
                            }
                        }
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject psp_coerce_template_to_collection_memoized_internal(SubLObject weightless_template, final SubLObject syn_headP, final SubLObject head_key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject head_collection = head_key;
        SubLObject phs_status = $OK;
        if (NIL != syn_headP) {
            thread.resetMultipleValues();
            final SubLObject head_collection_$23 = psp_extract_head_semx(weightless_template, head_key);
            final SubLObject weightless_template_$24 = thread.secondMultipleValue();
            final SubLObject phs_status_$25 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            head_collection = head_collection_$23;
            weightless_template = weightless_template_$24;
            phs_status = phs_status_$25;
        }
        if (phs_status == $ERROR) {
            ans = $ERROR;
        } else
            if (NIL == weightless_template) {
                ans = head_collection;
            } else {
                final SubLObject head_var = czer_utilities.unique_el_var_wrt_expression(weightless_template, $sym101$_OBJ);
                final SubLObject restrictions_formula = psp_handle_keywords_in_formula(weightless_template, head_var, head_key);
                SubLObject new_restrictions = (NIL != el_conjunction_p(restrictions_formula)) ? cycl_utilities.formula_args(restrictions_formula, UNPROVIDED) : list(restrictions_formula);
                final SubLObject isa_clause = psp_find_isa(new_restrictions, head_var);
                if (NIL != cycl_utilities.expression_find($REPLACE, cycl_utilities.formula_arg2(isa_clause, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    head_collection = cycl_utilities.formula_arg2(isa_clause, UNPROVIDED);
                    new_restrictions = remove(isa_clause, new_restrictions, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                final SubLObject nat = ans = parsing_utilities.make_collection_expression(head_collection, head_var, new_restrictions);
            }

        return ans;
    }

    public static final SubLObject psp_coerce_template_to_collection_memoized_alt(SubLObject weightless_template, SubLObject syn_headP, SubLObject head_key) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return psp_coerce_template_to_collection_memoized_internal(weightless_template, syn_headP, head_key);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PSP_COERCE_TEMPLATE_TO_COLLECTION_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PSP_COERCE_TEMPLATE_TO_COLLECTION_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, PSP_COERCE_TEMPLATE_TO_COLLECTION_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(weightless_template, syn_headP, head_key);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw46$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (weightless_template.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (syn_headP.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && head_key.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_coerce_template_to_collection_memoized_internal(weightless_template, syn_headP, head_key)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(weightless_template, syn_headP, head_key));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject psp_coerce_template_to_collection_memoized(final SubLObject weightless_template, final SubLObject syn_headP, final SubLObject head_key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return psp_coerce_template_to_collection_memoized_internal(weightless_template, syn_headP, head_key);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PSP_COERCE_TEMPLATE_TO_COLLECTION_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PSP_COERCE_TEMPLATE_TO_COLLECTION_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PSP_COERCE_TEMPLATE_TO_COLLECTION_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(weightless_template, syn_headP, head_key);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (weightless_template.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (syn_headP.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && head_key.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(psp_coerce_template_to_collection_memoized_internal(weightless_template, syn_headP, head_key)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(weightless_template, syn_headP, head_key));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject psp_handle_keywords_in_formula_alt(SubLObject formula, SubLObject var, SubLObject var_key) {
        if (NIL != var_key) {
            formula = subst(var, var_key, formula, UNPROVIDED, UNPROVIDED);
            if (NIL != cycl_utilities.expression_find($ACTION, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                formula = psp_handle_keyword_in_formula($ACTION, formula);
            }
        }
        return formula;
    }

    public static SubLObject psp_handle_keywords_in_formula(SubLObject formula, final SubLObject var, final SubLObject var_key) {
        if (NIL != var_key) {
            formula = subst(var, var_key, formula, UNPROVIDED, UNPROVIDED);
            if (NIL != cycl_utilities.expression_find($ACTION, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                formula = psp_handle_keyword_in_formula($ACTION, formula);
            }
        }
        return formula;
    }

    public static final SubLObject psp_handle_keyword_in_formula_alt(SubLObject key, SubLObject formula) {
        {
            SubLObject key_var = czer_utilities.unique_el_var_wrt_expression(formula, cycl_variables.make_el_var(symbol_name(key)));
            if (NIL != psp_davidsonian_clause_p(formula, key)) {
                formula = cycl_utilities.formula_arg1(cycl_utilities.formula_arg2(formula, UNPROVIDED), UNPROVIDED);
            }
            if (NIL != cycl_utilities.expression_find(key, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return list($$thereExists, key_var, subst(key_var, key, formula, UNPROVIDED, UNPROVIDED));
            } else {
                return formula;
            }
        }
    }

    public static SubLObject psp_handle_keyword_in_formula(final SubLObject key, SubLObject formula) {
        final SubLObject key_var = czer_utilities.unique_el_var_wrt_expression(formula, cycl_variables.make_el_var(symbol_name(key)));
        if (NIL != psp_davidsonian_clause_p(formula, key)) {
            formula = cycl_utilities.formula_arg1(cycl_utilities.formula_arg2(formula, UNPROVIDED), UNPROVIDED);
        }
        if (NIL != cycl_utilities.expression_find(key, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return list($$thereExists, key_var, subst(key_var, key, formula, UNPROVIDED, UNPROVIDED));
        }
        return formula;
    }

    public static final SubLObject psp_davidsonian_clause_p_alt(SubLObject formula, SubLObject head) {
        if (head == UNPROVIDED) {
            head = NIL;
        }
        return makeBoolean(((NIL != el_formula_with_operator_p(formula, $$isa)) && ((NIL == head) || (cycl_utilities.formula_arg1(formula, UNPROVIDED) == head))) && (NIL != el_formula_with_operator_p(cycl_utilities.formula_arg2(formula, UNPROVIDED), $$StateFn)));
    }

    public static SubLObject psp_davidsonian_clause_p(final SubLObject formula, SubLObject head) {
        if (head == UNPROVIDED) {
            head = NIL;
        }
        return makeBoolean(((NIL != el_formula_with_operator_p(formula, $$isa)) && ((NIL == head) || cycl_utilities.formula_arg1(formula, UNPROVIDED).eql(head))) && (NIL != el_formula_with_operator_p(cycl_utilities.formula_arg2(formula, UNPROVIDED), $$StateFn)));
    }

    public static final SubLObject psp_make_davidsonian_clause_alt(SubLObject head, SubLObject prop) {
        return list($$isa, head, list($$StateFn, prop));
    }

    public static SubLObject psp_make_davidsonian_clause(final SubLObject head, final SubLObject prop) {
        return list($$isa, head, list($$StateFn, prop));
    }

    /**
     *
     *
     * @return LIST-P; A clause of the form (#$isa TERM COL), if found in FORMULA.
     */
    @LispMethod(comment = "@return LIST-P; A clause of the form (#$isa TERM COL), if found in FORMULA.")
    public static final SubLObject psp_find_isa_alt(SubLObject formula, SubLObject v_term) {
        if (formula.isAtom()) {
            return NIL;
        } else {
            if (NIL != formula_pattern_match.formula_matches_pattern(formula, listS($$isa, v_term, $list_alt102))) {
                return formula;
            } else {
                if (NIL != el_conjunction_p(formula)) {
                    {
                        SubLObject ans = NIL;
                        if (NIL == ans) {
                            {
                                SubLObject csome_list_var = formula;
                                SubLObject item = NIL;
                                for (item = csome_list_var.first(); !((NIL != ans) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , item = csome_list_var.first()) {
                                    ans = psp_find_isa(item, v_term);
                                }
                            }
                        }
                        return ans;
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return LIST-P; A clause of the form (#$isa TERM COL), if found in FORMULA.
     */
    @LispMethod(comment = "@return LIST-P; A clause of the form (#$isa TERM COL), if found in FORMULA.")
    public static SubLObject psp_find_isa(final SubLObject formula, final SubLObject v_term) {
        if (formula.isAtom()) {
            return NIL;
        }
        if (NIL != formula_pattern_match.formula_matches_pattern(formula, listS($$isa, v_term, $list107))) {
            return formula;
        }
        if (NIL != el_conjunction_p(formula)) {
            SubLObject ans = NIL;
            if (NIL == ans) {
                SubLObject csome_list_var;
                SubLObject item;
                for (csome_list_var = formula, item = NIL, item = csome_list_var.first(); (NIL == ans) && (NIL != csome_list_var); ans = psp_find_isa(item, v_term) , csome_list_var = csome_list_var.rest() , item = csome_list_var.first()) {
                }
            }
            return ans;
        }
        return NIL;
    }

    public static final SubLObject psp_extract_head_semx_alt(SubLObject template, SubLObject head_key) {
        if (NIL == list_utilities.tree_find_if(symbol_function(KEYWORDP), template, UNPROVIDED)) {
            return template;
        }
        {
            SubLObject head_semx = head_key;
            SubLObject new_template = template;
            SubLObject status = $OK;
            SubLObject doneP = NIL;
            if (NIL != head_key) {
                {
                    SubLObject dnfs = psp_dnf_clausal_form(template);
                    SubLObject pcase_var = length(dnfs);
                    if (pcase_var.eql(ZERO_INTEGER)) {
                        status = $ERROR;
                    } else {
                        if (pcase_var.eql(ONE_INTEGER)) {
                            {
                                SubLObject dnf = dnfs.first();
                                SubLObject pos_lits = clauses.pos_lits(dnf);
                                SubLObject neg_lits = clauses.neg_lits(dnf);
                                if (NIL == doneP) {
                                    {
                                        SubLObject csome_list_var = pos_lits;
                                        SubLObject clause = NIL;
                                        for (clause = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , clause = csome_list_var.first()) {
                                            if (NIL != formula_pattern_match.formula_matches_pattern(clause, listS($$isa, head_key, $list_alt102))) {
                                                {
                                                    SubLObject other_pos_lits = remove(clause, pos_lits, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    SubLObject conjuncts = append(other_pos_lits, Mapping.mapcar(MAKE_NEGATION, neg_lits));
                                                    new_template = (NIL != conjuncts) ? ((SubLObject) (psp_make_conjunction(conjuncts))) : NIL;
                                                    head_semx = cycl_utilities.formula_arg2(clause, UNPROVIDED);
                                                    doneP = T;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            status = $ERROR;
                        }
                    }
                }
            }
            return values(head_semx, new_template, status);
        }
    }

    public static SubLObject psp_extract_head_semx(final SubLObject template, final SubLObject head_key) {
        if (NIL == list_utilities.tree_find_if(symbol_function(KEYWORDP), template, UNPROVIDED)) {
            return template;
        }
        SubLObject head_semx = head_key;
        SubLObject new_template = template;
        SubLObject status = $OK;
        SubLObject doneP = NIL;
        if (NIL != head_key) {
            final SubLObject dnfs = psp_dnf_clausal_form(template);
            final SubLObject pcase_var = length(dnfs);
            if (pcase_var.eql(ZERO_INTEGER)) {
                status = $ERROR;
            } else
                if (pcase_var.eql(ONE_INTEGER)) {
                    final SubLObject dnf = dnfs.first();
                    final SubLObject pos_lits = clauses.pos_lits(dnf);
                    final SubLObject neg_lits = clauses.neg_lits(dnf);
                    if (NIL == doneP) {
                        SubLObject csome_list_var = pos_lits;
                        SubLObject clause = NIL;
                        clause = csome_list_var.first();
                        while ((NIL == doneP) && (NIL != csome_list_var)) {
                            if (NIL != formula_pattern_match.formula_matches_pattern(clause, listS($$isa, head_key, $list107))) {
                                final SubLObject other_pos_lits = remove(clause, pos_lits, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                final SubLObject conjuncts = append(other_pos_lits, Mapping.mapcar(MAKE_NEGATION, neg_lits));
                                new_template = (NIL != conjuncts) ? psp_make_conjunction(conjuncts) : NIL;
                                head_semx = cycl_utilities.formula_arg2(clause, UNPROVIDED);
                                doneP = T;
                            }
                            csome_list_var = csome_list_var.rest();
                            clause = csome_list_var.first();
                        } 
                    }
                } else {
                    status = $ERROR;
                }

        }
        return values(head_semx, new_template, status);
    }

    /**
     * Marshal FORMULA into a list of quasi-DNFs. This does *not* go through the
     * canonicalizer, since that's a way bigger hammer than we need here.
     */
    @LispMethod(comment = "Marshal FORMULA into a list of quasi-DNFs. This does *not* go through the\r\ncanonicalizer, since that\'s a way bigger hammer than we need here.\nMarshal FORMULA into a list of quasi-DNFs. This does *not* go through the\ncanonicalizer, since that\'s a way bigger hammer than we need here.")
    public static final SubLObject psp_dnf_clausal_form_alt(SubLObject formula) {
        if (NIL != el_conjunction_p(formula)) {
            {
                SubLObject dnfs = NIL;
                SubLObject conjuncts = cycl_utilities.formula_args(formula, UNPROVIDED);
                SubLObject pos_lits = remove_if(EL_NEGATION_P, conjuncts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject neg_lits = set_difference(conjuncts, pos_lits, UNPROVIDED, UNPROVIDED);
                dnfs = cons(clauses.make_clause(neg_lits, pos_lits), dnfs);
                return dnfs;
            }
        } else {
            if (NIL != el_disjunction_p(formula)) {
                return Mapping.mapcar(PSP_DNF_FOR_SENTENCE, cycl_utilities.formula_args(formula, UNPROVIDED));
            } else {
                {
                    SubLObject dnfs = NIL;
                    dnfs = cons(psp_dnf_for_sentence(formula), dnfs);
                    return dnfs;
                }
            }
        }
    }

    /**
     * Marshal FORMULA into a list of quasi-DNFs. This does *not* go through the
     * canonicalizer, since that's a way bigger hammer than we need here.
     */
    @LispMethod(comment = "Marshal FORMULA into a list of quasi-DNFs. This does *not* go through the\r\ncanonicalizer, since that\'s a way bigger hammer than we need here.\nMarshal FORMULA into a list of quasi-DNFs. This does *not* go through the\ncanonicalizer, since that\'s a way bigger hammer than we need here.")
    public static SubLObject psp_dnf_clausal_form(final SubLObject formula) {
        if (NIL != el_conjunction_p(formula)) {
            SubLObject dnfs = NIL;
            final SubLObject conjuncts = cycl_utilities.formula_args(formula, UNPROVIDED);
            final SubLObject pos_lits = remove_if(EL_NEGATION_P, conjuncts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject neg_lits = set_difference(conjuncts, pos_lits, UNPROVIDED, UNPROVIDED);
            dnfs = cons(clauses.make_clause(neg_lits, pos_lits), dnfs);
            return dnfs;
        }
        if (NIL != el_disjunction_p(formula)) {
            return Mapping.mapcar(PSP_DNF_FOR_SENTENCE, cycl_utilities.formula_args(formula, UNPROVIDED));
        }
        SubLObject dnfs = NIL;
        dnfs = cons(psp_dnf_for_sentence(formula), dnfs);
        return dnfs;
    }/**
     * Marshal FORMULA into a list of quasi-DNFs. This does *not* go through the
     * canonicalizer, since that's a way bigger hammer than we need here.
     */


    public static final SubLObject psp_dnf_for_sentence_alt(SubLObject sentence) {
        if (NIL != el_negation_p(sentence)) {
            {
                SubLObject backwards = psp_dnf_for_sentence(cycl_utilities.formula_arg1(sentence, UNPROVIDED));
                SubLObject datum = backwards;
                SubLObject current = datum;
                SubLObject pos_lits = NIL;
                SubLObject neg_lits = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt106);
                pos_lits = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt106);
                neg_lits = current.first();
                current = current.rest();
                if (NIL == current) {
                    return clauses.make_clause(neg_lits, pos_lits);
                } else {
                    cdestructuring_bind_error(datum, $list_alt106);
                }
            }
        } else {
            {
                SubLObject pos_lits = list(sentence);
                SubLObject neg_lits = NIL;
                return clauses.make_clause(neg_lits, pos_lits);
            }
        }
        return NIL;
    }

    public static SubLObject psp_dnf_for_sentence(final SubLObject sentence) {
        if (NIL == el_negation_p(sentence)) {
            final SubLObject pos_lits = list(sentence);
            final SubLObject neg_lits = NIL;
            return clauses.make_clause(neg_lits, pos_lits);
        }
        final SubLObject backwards = psp_dnf_for_sentence(cycl_utilities.formula_arg1(sentence, UNPROVIDED));
        SubLObject current;
        final SubLObject datum = current = backwards;
        SubLObject pos_lits2 = NIL;
        SubLObject neg_lits2 = NIL;
        destructuring_bind_must_consp(current, datum, $list111);
        pos_lits2 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list111);
        neg_lits2 = current.first();
        current = current.rest();
        if (NIL == current) {
            return clauses.make_clause(neg_lits2, pos_lits2);
        }
        cdestructuring_bind_error(datum, $list111);
        return NIL;
    }

    public static final SubLObject clear_psp_head_key_for_category_alt() {
        {
            SubLObject cs = $psp_head_key_for_category_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_psp_head_key_for_category() {
        final SubLObject cs = $psp_head_key_for_category_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_psp_head_key_for_category_alt(SubLObject category, SubLObject frame) {
        if (frame == UNPROVIDED) {
            frame = $UNSPECIFIED;
        }
        return memoization_state.caching_state_remove_function_results_with_args($psp_head_key_for_category_caching_state$.getGlobalValue(), list(category, frame), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_psp_head_key_for_category(final SubLObject category, SubLObject frame) {
        if (frame == UNPROVIDED) {
            frame = $UNSPECIFIED;
        }
        return memoization_state.caching_state_remove_function_results_with_args($psp_head_key_for_category_caching_state$.getGlobalValue(), list(category, frame), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject psp_head_key_for_category_internal_alt(SubLObject category, SubLObject frame) {
        if ((NIL != lexicon_accessors.vbarP(category)) || (NIL != psp_rules.psp_valid_constituent_typeP(category, $$Verb))) {
            return $ACTION;
        } else {
            if (NIL != lexicon_accessors.nbarP(category)) {
                return $NOUN;
            } else {
                if (NIL == forts.fort_p(frame)) {
                    return $NOUN;
                } else {
                    if (NIL != isa.isaP(frame, $$GenericVerbPhraseModifyingFrame, UNPROVIDED, UNPROVIDED)) {
                        return $ACTION;
                    } else {
                        return $NOUN;
                    }
                }
            }
        }
    }

    public static SubLObject psp_head_key_for_category_internal(final SubLObject category, final SubLObject frame) {
        if ((NIL != lexicon_accessors.vbarP(category)) || (NIL != psp_rules.psp_valid_constituent_typeP(category, $$Verb))) {
            return $ACTION;
        }
        if (NIL != lexicon_accessors.nbarP(category)) {
            return $NOUN;
        }
        if (NIL == forts.fort_p(frame)) {
            return $NOUN;
        }
        if (NIL != isa.isaP(frame, $$GenericVerbPhraseModifyingFrame, UNPROVIDED, UNPROVIDED)) {
            return $ACTION;
        }
        return $NOUN;
    }

    public static final SubLObject psp_head_key_for_category_alt(SubLObject category, SubLObject frame) {
        if (frame == UNPROVIDED) {
            frame = $UNSPECIFIED;
        }
        {
            SubLObject caching_state = $psp_head_key_for_category_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(PSP_HEAD_KEY_FOR_CATEGORY, $psp_head_key_for_category_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(category, frame);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw46$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (category.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && frame.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(psp_head_key_for_category_internal(category, frame)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(category, frame));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject psp_head_key_for_category(final SubLObject category, SubLObject frame) {
        if (frame == UNPROVIDED) {
            frame = $UNSPECIFIED;
        }
        SubLObject caching_state = $psp_head_key_for_category_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PSP_HEAD_KEY_FOR_CATEGORY, $psp_head_key_for_category_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(category, frame);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (category.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && frame.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(psp_head_key_for_category_internal(category, frame)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(category, frame));
        return memoization_state.caching_results(results3);
    }

    /**
     * Use BINDINGS to replace keywords in TEMPLATE with CycL expressions.
     */
    @LispMethod(comment = "Use BINDINGS to replace keywords in TEMPLATE with CycL expressions.")
    public static final SubLObject psp_substitute_bindings_internal_alt(SubLObject template, SubLObject v_bindings, SubLObject head_key) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = template;
                SubLObject template_cycl = psp_cycl_cycl(template);
                SubLObject template_vars = list_utilities.tree_gather(template_cycl, $sym112$CYC_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject non_wffP = NIL;
                if (NIL == non_wffP) {
                    {
                        SubLObject csome_list_var = v_bindings;
                        SubLObject binding = NIL;
                        for (binding = csome_list_var.first(); !((NIL != non_wffP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , binding = csome_list_var.first()) {
                            {
                                SubLObject datum = binding;
                                SubLObject current = datum;
                                SubLObject in = NIL;
                                SubLObject out = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt113);
                                in = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt113);
                                out = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (((NIL != subl_promotions.memberP(out, $list_alt114, UNPROVIDED, UNPROVIDED)) && (NIL == parsing_vars.$npp_use_nl_tagsP$.getDynamicValue(thread))) && (NIL != psp_collectionP(in))) {
                                        in = psp_add_some_fn(in);
                                    }
                                    in = psp_rename_variables(in, template_vars);
                                    {
                                        SubLObject wff_check_bindings = list(cons(out, psp_cycl_cycl(in)));
                                        if (NIL == psp_wffP(template_cycl, wff_check_bindings)) {
                                            non_wffP = T;
                                        } else {
                                            if (NIL != psp_collectionP(template_cycl)) {
                                                ans = psp_substitute_bindings_coll(ans, in, out, head_key);
                                            } else {
                                                if (head_key == out) {
                                                    {
                                                        SubLObject nl_tag_templates = NIL;
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject in_23 = parsing_macros.psp_strip_and_remember_nl_tags(in);
                                                            SubLObject nl_tag_templates_24 = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            in = in_23;
                                                            nl_tag_templates = nl_tag_templates_24;
                                                        }
                                                        ans = psp_cycl_subst(in, out, ans);
                                                        ans = parsing_macros.psp_add_nl_tag_templates(ans, nl_tag_templates);
                                                    }
                                                } else {
                                                    ans = psp_cycl_subst(in, out, ans);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt113);
                                }
                            }
                        }
                    }
                }
                return NIL != non_wffP ? ((SubLObject) ($NON_WFF)) : ans;
            }
        }
    }

    /**
     * Use BINDINGS to replace keywords in TEMPLATE with CycL expressions.
     */
    @LispMethod(comment = "Use BINDINGS to replace keywords in TEMPLATE with CycL expressions.")
    public static SubLObject psp_substitute_bindings_internal(final SubLObject template, final SubLObject v_bindings, final SubLObject head_key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = template;
        final SubLObject template_cycl = psp_cycl_cycl(template);
        final SubLObject template_vars = list_utilities.tree_gather(template_cycl, $sym117$CYC_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject non_wffP = NIL;
        if (NIL == non_wffP) {
            SubLObject csome_list_var = v_bindings;
            SubLObject binding = NIL;
            binding = csome_list_var.first();
            while ((NIL == non_wffP) && (NIL != csome_list_var)) {
                SubLObject current;
                final SubLObject datum = current = binding;
                SubLObject in = NIL;
                SubLObject out = NIL;
                destructuring_bind_must_consp(current, datum, $list118);
                in = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list118);
                out = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (((NIL != subl_promotions.memberP(out, $list119, UNPROVIDED, UNPROVIDED)) && (NIL == parsing_vars.$npp_use_nl_tagsP$.getDynamicValue(thread))) && (NIL != psp_collectionP(in))) {
                        in = psp_add_some_fn(in);
                    }
                    in = psp_rename_variables(in, template_vars);
                    final SubLObject wff_check_bindings = list(cons(out, psp_cycl_cycl(in)));
                    if (NIL == psp_wffP(template_cycl, wff_check_bindings)) {
                        non_wffP = T;
                    } else
                        if (NIL != psp_collectionP(template_cycl)) {
                            ans = psp_substitute_bindings_coll(ans, in, out, head_key);
                        } else
                            if (head_key.eql(out)) {
                                SubLObject nl_tag_templates = NIL;
                                thread.resetMultipleValues();
                                final SubLObject in_$26 = parsing_macros.psp_strip_and_remember_nl_tags(in);
                                final SubLObject nl_tag_templates_$27 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                in = in_$26;
                                nl_tag_templates = nl_tag_templates_$27;
                                ans = psp_cycl_subst(in, out, ans);
                                ans = parsing_macros.psp_add_nl_tag_templates(ans, nl_tag_templates);
                            } else {
                                ans = psp_cycl_subst(in, out, ans);
                            }


                } else {
                    cdestructuring_bind_error(datum, $list118);
                }
                csome_list_var = csome_list_var.rest();
                binding = csome_list_var.first();
            } 
        }
        return NIL != non_wffP ? $NON_WFF : ans;
    }/**
     * Use BINDINGS to replace keywords in TEMPLATE with CycL expressions.
     */


    public static final SubLObject psp_substitute_bindings_alt(SubLObject template, SubLObject v_bindings, SubLObject head_key) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return psp_substitute_bindings_internal(template, v_bindings, head_key);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PSP_SUBSTITUTE_BINDINGS, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PSP_SUBSTITUTE_BINDINGS, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, PSP_SUBSTITUTE_BINDINGS, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(template, v_bindings, head_key);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw46$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (template.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (v_bindings.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && head_key.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_substitute_bindings_internal(template, v_bindings, head_key)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(template, v_bindings, head_key));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject psp_substitute_bindings(final SubLObject template, final SubLObject v_bindings, final SubLObject head_key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return psp_substitute_bindings_internal(template, v_bindings, head_key);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PSP_SUBSTITUTE_BINDINGS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PSP_SUBSTITUTE_BINDINGS, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PSP_SUBSTITUTE_BINDINGS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(template, v_bindings, head_key);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (template.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (v_bindings.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && head_key.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(psp_substitute_bindings_internal(template, v_bindings, head_key)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(template, v_bindings, head_key));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject psp_add_some_fn_alt(SubLObject psp_cycl) {
        return psp_cycl_subst(psp_cycl, $REPLACE, $list_alt115);
    }

    public static SubLObject psp_add_some_fn(final SubLObject psp_cycl) {
        return psp_cycl_subst(psp_cycl, $REPLACE, $list120);
    }

    /**
     * Rename any variables in CYCL that are in TEMPLATE-VARS.
     */
    @LispMethod(comment = "Rename any variables in CYCL that are in TEMPLATE-VARS.")
    public static final SubLObject psp_rename_variables_alt(SubLObject cycl, SubLObject template_vars) {
        {
            SubLObject cdolist_list_var = intersection(list_utilities.tree_gather(cycl, $sym112$CYC_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED), template_vars, UNPROVIDED, UNPROVIDED);
            SubLObject var = NIL;
            for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                cycl = subst(czer_utilities.unique_el_var_wrt_expression(list(cycl, template_vars), var), var, cycl, UNPROVIDED, UNPROVIDED);
            }
        }
        return cycl;
    }

    /**
     * Rename any variables in CYCL that are in TEMPLATE-VARS.
     */
    @LispMethod(comment = "Rename any variables in CYCL that are in TEMPLATE-VARS.")
    public static SubLObject psp_rename_variables(SubLObject cycl, final SubLObject template_vars) {
        SubLObject cdolist_list_var = intersection(list_utilities.tree_gather(cycl, $sym117$CYC_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED), template_vars, UNPROVIDED, UNPROVIDED);
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            cycl = subst(czer_utilities.unique_el_var_wrt_expression(list(cycl, template_vars), var), var, cycl, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        return cycl;
    }/**
     * Rename any variables in CYCL that are in TEMPLATE-VARS.
     */


    /**
     * Helper for @xref PSP-SUBSTITUTE-BINDINGS for the case when TEMPLATE is a collection-
     * denoting expression.
     *
     * @return TEMPLATE, with IN substituted for OUT.
     */
    @LispMethod(comment = "Helper for @xref PSP-SUBSTITUTE-BINDINGS for the case when TEMPLATE is a collection-\r\ndenoting expression.\r\n\r\n@return TEMPLATE, with IN substituted for OUT.\nHelper for @xref PSP-SUBSTITUTE-BINDINGS for the case when TEMPLATE is a collection-\ndenoting expression.")
    public static final SubLObject psp_substitute_bindings_coll_alt(SubLObject template, SubLObject in, SubLObject out, SubLObject head_key) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (out == head_key) {
                {
                    SubLObject nl_tag_templates = NIL;
                    thread.resetMultipleValues();
                    {
                        SubLObject in_25 = parsing_macros.psp_strip_and_remember_nl_tags(in);
                        SubLObject nl_tag_templates_26 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        in = in_25;
                        nl_tag_templates = nl_tag_templates_26;
                    }
                    return psp_substitute_bindings_coll(template, in, out, NIL);
                }
            }
            {
                SubLObject ans = template;
                thread.resetMultipleValues();
                {
                    SubLObject coll = parsing_utilities.parse_collection_expression(ans);
                    SubLObject var = thread.secondMultipleValue();
                    SubLObject old_restrictions = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (coll == out) {
                        {
                            SubLObject weightless_in = psp_cycl_cycl(in);
                            SubLObject in_weight = psp_cycl_weight(in);
                            thread.resetMultipleValues();
                            {
                                SubLObject in_coll = parsing_utilities.parse_collection_expression(weightless_in);
                                SubLObject in_var = thread.secondMultipleValue();
                                SubLObject new_restrictions = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject all_restrictions = new_restrictions;
                                    if (NIL != new_restrictions) {
                                        {
                                            SubLObject cdolist_list_var = old_restrictions;
                                            SubLObject restr = NIL;
                                            for (restr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , restr = cdolist_list_var.first()) {
                                                all_restrictions = cons(psp_cycl_subst(in_var, var, restr), all_restrictions);
                                            }
                                        }
                                    } else {
                                        all_restrictions = old_restrictions;
                                        in_var = var;
                                    }
                                    ans = psp_weight_cycl(parsing_utilities.make_collection_expression(in_coll, in_var, all_restrictions), in_weight);
                                }
                            }
                        }
                    } else {
                        ans = psp_cycl_subst(in, out, ans);
                    }
                }
                return ans;
            }
        }
    }

    /**
     * Helper for @xref PSP-SUBSTITUTE-BINDINGS for the case when TEMPLATE is a collection-
     * denoting expression.
     *
     * @return TEMPLATE, with IN substituted for OUT.
     */
    @LispMethod(comment = "Helper for @xref PSP-SUBSTITUTE-BINDINGS for the case when TEMPLATE is a collection-\r\ndenoting expression.\r\n\r\n@return TEMPLATE, with IN substituted for OUT.\nHelper for @xref PSP-SUBSTITUTE-BINDINGS for the case when TEMPLATE is a collection-\ndenoting expression.")
    public static SubLObject psp_substitute_bindings_coll(final SubLObject template, SubLObject in, final SubLObject out, final SubLObject head_key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (out.eql(head_key)) {
            SubLObject nl_tag_templates = NIL;
            thread.resetMultipleValues();
            final SubLObject in_$28 = parsing_macros.psp_strip_and_remember_nl_tags(in);
            final SubLObject nl_tag_templates_$29 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            in = in_$28;
            nl_tag_templates = nl_tag_templates_$29;
            return psp_substitute_bindings_coll(template, in, out, NIL);
        }
        thread.resetMultipleValues();
        final SubLObject coll = parsing_utilities.parse_collection_expression(template);
        final SubLObject var = thread.secondMultipleValue();
        final SubLObject old_restrictions = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject ans;
        if (coll.eql(out)) {
            final SubLObject weightless_in = psp_cycl_cycl(in);
            final SubLObject in_weight = psp_cycl_weight(in);
            thread.resetMultipleValues();
            final SubLObject in_coll = parsing_utilities.parse_collection_expression(weightless_in);
            SubLObject in_var = thread.secondMultipleValue();
            final SubLObject new_restrictions = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            SubLObject all_restrictions;
            if (NIL != (all_restrictions = new_restrictions)) {
                SubLObject cdolist_list_var = old_restrictions;
                SubLObject restr = NIL;
                restr = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    all_restrictions = cons(psp_cycl_subst(in_var, var, restr), all_restrictions);
                    cdolist_list_var = cdolist_list_var.rest();
                    restr = cdolist_list_var.first();
                } 
            } else {
                all_restrictions = old_restrictions;
                in_var = var;
            }
            ans = psp_weight_cycl(parsing_utilities.make_collection_expression(in_coll, in_var, all_restrictions), in_weight);
        } else {
            ans = psp_cycl_subst(in, out, template);
        }
        return ans;
    }/**
     * Helper for @xref PSP-SUBSTITUTE-BINDINGS for the case when TEMPLATE is a collection-
     * denoting expression.
     *
     * @return TEMPLATE, with IN substituted for OUT.
     */


    /**
     * Replace numbers in BINDINGS with semantics of the corresponding daughters
     * that meet the semantic constraints from RULE-STRUCT.
     *
     * @return LISTP of sets of binding pairs.
     */
    @LispMethod(comment = "Replace numbers in BINDINGS with semantics of the corresponding daughters\r\nthat meet the semantic constraints from RULE-STRUCT.\r\n\r\n@return LISTP of sets of binding pairs.\nReplace numbers in BINDINGS with semantics of the corresponding daughters\nthat meet the semantic constraints from RULE-STRUCT.")
    public static final SubLObject psp_process_bindings_alt(SubLObject v_bindings, SubLObject edge, SubLObject rule_struct, SubLObject head_output_type) {
        {
            SubLObject dtrs = psp_chart.psp_edge_dtrs(edge);
            SubLObject dtr_cycls_bindings = NIL;
            SubLObject failP = NIL;
            SubLObject rule_fort = psp_chart.psp_edge_rule_fort(edge);
            SubLObject head_dtr_num = psp_rules.psp_rule_head(rule_struct);
            if (v_bindings == $UNKNOWN) {
                failP = T;
                if (NIL != psp_rules.psp_traced_ruleP(rule_fort)) {
                    format(T, $str_alt117$No_bindings_for__S___, edge);
                }
            }
            if (NIL == failP) {
                {
                    SubLObject csome_list_var = v_bindings;
                    SubLObject binding = NIL;
                    for (binding = csome_list_var.first(); !((NIL != failP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , binding = csome_list_var.first()) {
                        {
                            SubLObject datum = binding;
                            SubLObject current = datum;
                            SubLObject instance_or_typeP = NIL;
                            SubLObject dtr_num = NIL;
                            SubLObject keyword = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt90);
                            instance_or_typeP = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt90);
                            dtr_num = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt90);
                            keyword = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (NIL != list_utilities.lengthL(dtrs, dtr_num, UNPROVIDED)) {
                                    if (NIL != psp_rules.psp_traced_ruleP(rule_fort)) {
                                        format(T, $str_alt118$Binding__S_has_no_corresponding_d, binding, dtrs);
                                    }
                                } else {
                                    {
                                        SubLObject dtr = nth(number_utilities.f_1_(dtr_num), dtrs);
                                        SubLObject syntactic_head_dtrP = eql(dtr_num, head_dtr_num);
                                        SubLObject template_keywordP = psp_template_keywordP(keyword);
                                        SubLObject output_type = (NIL != syntactic_head_dtrP) ? ((SubLObject) (head_output_type)) : NIL != template_keywordP ? ((SubLObject) ($DENOT_TEMPLATE)) : $DENOT_GROUND;
                                        SubLObject dtr_cycls = psp_semantics_for_edge_int(dtr, output_type);
                                        SubLObject filtered_cycls = psp_rules.psp_filter_cycls(dtr_cycls, dtr_num, rule_struct, edge);
                                        if (instance_or_typeP == $TYPE) {
                                            filtered_cycls = list_utilities.remove_if_not($sym120$PSP_COLLECTION_, filtered_cycls, STRIP_NL_TAGS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                        if (psp_rules.psp_rule_fort(rule_struct) == $$PSRule_VbarVComps) {
                                            filtered_cycls = psp_cycl_subst($SUBJECT, $NOUN, filtered_cycls);
                                        }
                                        if ((instance_or_typeP == $INSTANCE) && (NIL == dtr_cycls)) {
                                            failP = T;
                                            if (NIL != psp_rules.psp_traced_ruleP(rule_fort)) {
                                                format(T, $str_alt124$__No_cycls_found_for____S__, dtr);
                                            }
                                        } else {
                                            if ((instance_or_typeP == $INSTANCE) && (NIL == filtered_cycls)) {
                                                failP = T;
                                                if (NIL != psp_rules.psp_traced_ruleP(rule_fort)) {
                                                    format(T, $str_alt125$__All_cycls_were_non_wff_for____S, dtr);
                                                }
                                            } else {
                                                if (NIL != filtered_cycls) {
                                                    {
                                                        SubLObject datum_27 = list_utilities.alist_lookup(dtr_cycls_bindings, dtr_num, symbol_function(EQL), $list_alt126);
                                                        SubLObject current_28 = datum_27;
                                                        SubLObject existing_cycls = NIL;
                                                        SubLObject existing_keywords = NIL;
                                                        destructuring_bind_must_consp(current_28, datum_27, $list_alt127);
                                                        existing_cycls = current_28.first();
                                                        current_28 = current_28.rest();
                                                        destructuring_bind_must_consp(current_28, datum_27, $list_alt127);
                                                        existing_keywords = current_28.first();
                                                        current_28 = current_28.rest();
                                                        if (NIL == current_28) {
                                                            {
                                                                SubLObject new_cycls = (NIL != existing_keywords) ? ((SubLObject) (intersection(existing_cycls, filtered_cycls, symbol_function($sym93$PSP_CYCL__), UNPROVIDED))) : filtered_cycls;
                                                                SubLObject new_keywords = cons(keyword, existing_keywords);
                                                                dtr_cycls_bindings = list_utilities.alist_enter(dtr_cycls_bindings, dtr_num, list(new_cycls, new_keywords), UNPROVIDED);
                                                            }
                                                        } else {
                                                            cdestructuring_bind_error(datum_27, $list_alt127);
                                                        }
                                                    }
                                                } else {
                                                    if (NIL != psp_rules.psp_traced_ruleP(rule_fort)) {
                                                        format(T, $str_alt128$__No_filtered_cycls_for__S, dtr);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt90);
                            }
                        }
                    }
                }
            }
            return NIL != failP ? ((SubLObject) ($NON_WFF)) : psp_process_bindings_int(list_utilities.alist_values(dtr_cycls_bindings));
        }
    }

    /**
     * Replace numbers in BINDINGS with semantics of the corresponding daughters
     * that meet the semantic constraints from RULE-STRUCT.
     *
     * @return LISTP of sets of binding pairs.
     */
    @LispMethod(comment = "Replace numbers in BINDINGS with semantics of the corresponding daughters\r\nthat meet the semantic constraints from RULE-STRUCT.\r\n\r\n@return LISTP of sets of binding pairs.\nReplace numbers in BINDINGS with semantics of the corresponding daughters\nthat meet the semantic constraints from RULE-STRUCT.")
    public static SubLObject psp_process_bindings(final SubLObject v_bindings, final SubLObject edge, final SubLObject rule_struct, final SubLObject head_output_type) {
        final SubLObject dtrs = psp_chart.psp_edge_dtrs(edge);
        SubLObject dtr_cycls_bindings = NIL;
        SubLObject failP = NIL;
        final SubLObject rule_fort = psp_chart.psp_edge_rule_fort(edge);
        final SubLObject head_dtr_num = psp_rules.psp_rule_head(rule_struct);
        if (v_bindings == $UNKNOWN) {
            failP = T;
            if (NIL != psp_rules.psp_traced_ruleP(rule_fort)) {
                format(T, $str122$No_bindings_for__S___, edge);
            }
        }
        if (NIL == failP) {
            SubLObject csome_list_var = v_bindings;
            SubLObject binding = NIL;
            binding = csome_list_var.first();
            while ((NIL == failP) && (NIL != csome_list_var)) {
                SubLObject current;
                final SubLObject datum = current = binding;
                SubLObject instance_or_typeP = NIL;
                SubLObject dtr_num = NIL;
                SubLObject keyword = NIL;
                destructuring_bind_must_consp(current, datum, $list95);
                instance_or_typeP = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list95);
                dtr_num = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list95);
                keyword = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != list_utilities.lengthL(dtrs, dtr_num, UNPROVIDED)) {
                        if (NIL != psp_rules.psp_traced_ruleP(rule_fort)) {
                            format(T, $str123$Binding__S_has_no_corresponding_d, binding, dtrs);
                        }
                    } else {
                        final SubLObject dtr = nth(number_utilities.f_1_(dtr_num), dtrs);
                        final SubLObject syntactic_head_dtrP = eql(dtr_num, head_dtr_num);
                        final SubLObject template_keywordP = psp_template_keywordP(keyword);
                        final SubLObject output_type = (NIL != syntactic_head_dtrP) ? head_output_type : NIL != template_keywordP ? $DENOT_TEMPLATE : $DENOT_GROUND;
                        final SubLObject dtr_cycls = psp_semantics_for_edge_int(dtr, output_type);
                        SubLObject filtered_cycls = psp_rules.psp_filter_cycls(dtr_cycls, dtr_num, rule_struct, edge);
                        if (instance_or_typeP == $TYPE) {
                            filtered_cycls = list_utilities.remove_if_not($sym125$PSP_COLLECTION_, filtered_cycls, STRIP_NL_TAGS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        if (psp_rules.psp_rule_fort(rule_struct).eql($$PSRule_VbarVComps)) {
                            filtered_cycls = psp_cycl_subst($SUBJECT, $NOUN, filtered_cycls);
                        }
                        if ((instance_or_typeP == $INSTANCE) && (NIL == dtr_cycls)) {
                            failP = T;
                            if (NIL != psp_rules.psp_traced_ruleP(rule_fort)) {
                                format(T, $str129$__No_cycls_found_for____S__, dtr);
                            }
                        } else
                            if ((instance_or_typeP == $INSTANCE) && (NIL == filtered_cycls)) {
                                failP = T;
                                if (NIL != psp_rules.psp_traced_ruleP(rule_fort)) {
                                    format(T, $str130$__All_cycls_were_non_wff_for____S, dtr);
                                }
                            } else
                                if (NIL != filtered_cycls) {
                                    SubLObject current_$31;
                                    final SubLObject datum_$30 = current_$31 = list_utilities.alist_lookup(dtr_cycls_bindings, dtr_num, symbol_function(EQL), $list131);
                                    SubLObject existing_cycls = NIL;
                                    SubLObject existing_keywords = NIL;
                                    destructuring_bind_must_consp(current_$31, datum_$30, $list132);
                                    existing_cycls = current_$31.first();
                                    current_$31 = current_$31.rest();
                                    destructuring_bind_must_consp(current_$31, datum_$30, $list132);
                                    existing_keywords = current_$31.first();
                                    current_$31 = current_$31.rest();
                                    if (NIL == current_$31) {
                                        final SubLObject new_cycls = (NIL != existing_keywords) ? intersection(existing_cycls, filtered_cycls, symbol_function($sym98$PSP_CYCL__), UNPROVIDED) : filtered_cycls;
                                        final SubLObject new_keywords = cons(keyword, existing_keywords);
                                        dtr_cycls_bindings = list_utilities.alist_enter(dtr_cycls_bindings, dtr_num, list(new_cycls, new_keywords), UNPROVIDED);
                                    } else {
                                        cdestructuring_bind_error(datum_$30, $list132);
                                    }
                                } else
                                    if (NIL != psp_rules.psp_traced_ruleP(rule_fort)) {
                                        format(T, $str133$__No_filtered_cycls_for__S, dtr);
                                    }



                    }
                } else {
                    cdestructuring_bind_error(datum, $list95);
                }
                csome_list_var = csome_list_var.rest();
                binding = csome_list_var.first();
            } 
        }
        return NIL != failP ? $NON_WFF : psp_process_bindings_int(list_utilities.alist_values(dtr_cycls_bindings));
    }/**
     * Replace numbers in BINDINGS with semantics of the corresponding daughters
     * that meet the semantic constraints from RULE-STRUCT.
     *
     * @return LISTP of sets of binding pairs.
     */


    /**
     *
     *
     * @return BOOLEAN; Does KEYWORD demand template semantics?
     */
    @LispMethod(comment = "@return BOOLEAN; Does KEYWORD demand template semantics?")
    public static final SubLObject psp_template_keywordP_alt(SubLObject keyword) {
        return member(keyword, $list_alt129, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return BOOLEAN; Does KEYWORD demand template semantics?
     */
    @LispMethod(comment = "@return BOOLEAN; Does KEYWORD demand template semantics?")
    public static SubLObject psp_template_keywordP(final SubLObject keyword) {
        return member(keyword, $list134, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Recursive function to get all the permutations of bindings.
     *
     * @param CYCLS-BINDINGS
     * 		listp; of (<cycls> <keywords>) pairs.
     * @return LISTP; of lists of (<cycl> <keyword>) pairs.
     */
    @LispMethod(comment = "Recursive function to get all the permutations of bindings.\r\n\r\n@param CYCLS-BINDINGS\r\n\t\tlistp; of (<cycls> <keywords>) pairs.\r\n@return LISTP; of lists of (<cycl> <keyword>) pairs.")
    public static final SubLObject psp_process_bindings_int_alt(SubLObject cycls_bindings) {
        if (NIL == cycls_bindings) {
            return NIL;
        }
        {
            SubLObject ans = NIL;
            SubLObject datum = cycls_bindings.first();
            SubLObject current = datum;
            SubLObject first_cycls = NIL;
            SubLObject keywords = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt130);
            first_cycls = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt130);
            keywords = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != list_utilities.singletonP(cycls_bindings)) {
                    {
                        SubLObject cdolist_list_var = first_cycls;
                        SubLObject cycl = NIL;
                        for (cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycl = cdolist_list_var.first()) {
                            {
                                SubLObject binding_pairs = NIL;
                                SubLObject cdolist_list_var_29 = keywords;
                                SubLObject keyword = NIL;
                                for (keyword = cdolist_list_var_29.first(); NIL != cdolist_list_var_29; cdolist_list_var_29 = cdolist_list_var_29.rest() , keyword = cdolist_list_var_29.first()) {
                                    {
                                        SubLObject binding_pair = list(cycl, keyword);
                                        validate_binding_pair(binding_pair);
                                        binding_pairs = cons(binding_pair, binding_pairs);
                                    }
                                }
                                ans = cons(binding_pairs, ans);
                            }
                        }
                    }
                } else {
                    {
                        SubLObject pair_lists_from_rest = psp_process_bindings_int(cycls_bindings.rest());
                        SubLObject cdolist_list_var = first_cycls;
                        SubLObject cycl = NIL;
                        for (cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycl = cdolist_list_var.first()) {
                            {
                                SubLObject cdolist_list_var_30 = pair_lists_from_rest;
                                SubLObject binding_pairs = NIL;
                                for (binding_pairs = cdolist_list_var_30.first(); NIL != cdolist_list_var_30; cdolist_list_var_30 = cdolist_list_var_30.rest() , binding_pairs = cdolist_list_var_30.first()) {
                                    {
                                        SubLObject cdolist_list_var_31 = keywords;
                                        SubLObject keyword = NIL;
                                        for (keyword = cdolist_list_var_31.first(); NIL != cdolist_list_var_31; cdolist_list_var_31 = cdolist_list_var_31.rest() , keyword = cdolist_list_var_31.first()) {
                                            {
                                                SubLObject binding_pair = list(cycl, keyword);
                                                validate_binding_pair(binding_pair);
                                                binding_pairs = cons(binding_pair, binding_pairs);
                                            }
                                        }
                                    }
                                    ans = cons(binding_pairs, ans);
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt130);
            }
            return ans;
        }
    }

    /**
     * Recursive function to get all the permutations of bindings.
     *
     * @param CYCLS-BINDINGS
     * 		listp; of (<cycls> <keywords>) pairs.
     * @return LISTP; of lists of (<cycl> <keyword>) pairs.
     */
    @LispMethod(comment = "Recursive function to get all the permutations of bindings.\r\n\r\n@param CYCLS-BINDINGS\r\n\t\tlistp; of (<cycls> <keywords>) pairs.\r\n@return LISTP; of lists of (<cycl> <keyword>) pairs.")
    public static SubLObject psp_process_bindings_int(final SubLObject cycls_bindings) {
        if (NIL == cycls_bindings) {
            return NIL;
        }
        SubLObject ans = NIL;
        SubLObject current;
        final SubLObject datum = current = cycls_bindings.first();
        SubLObject first_cycls = NIL;
        SubLObject keywords = NIL;
        destructuring_bind_must_consp(current, datum, $list135);
        first_cycls = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list135);
        keywords = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != list_utilities.singletonP(cycls_bindings)) {
                SubLObject cdolist_list_var = first_cycls;
                SubLObject cycl = NIL;
                cycl = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject binding_pairs = NIL;
                    SubLObject cdolist_list_var_$32 = keywords;
                    SubLObject keyword = NIL;
                    keyword = cdolist_list_var_$32.first();
                    while (NIL != cdolist_list_var_$32) {
                        final SubLObject binding_pair = list(cycl, keyword);
                        validate_binding_pair(binding_pair);
                        binding_pairs = cons(binding_pair, binding_pairs);
                        cdolist_list_var_$32 = cdolist_list_var_$32.rest();
                        keyword = cdolist_list_var_$32.first();
                    } 
                    ans = cons(binding_pairs, ans);
                    cdolist_list_var = cdolist_list_var.rest();
                    cycl = cdolist_list_var.first();
                } 
            } else {
                final SubLObject pair_lists_from_rest = psp_process_bindings_int(cycls_bindings.rest());
                SubLObject cdolist_list_var2 = first_cycls;
                SubLObject cycl2 = NIL;
                cycl2 = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    SubLObject cdolist_list_var_$33 = pair_lists_from_rest;
                    SubLObject binding_pairs2 = NIL;
                    binding_pairs2 = cdolist_list_var_$33.first();
                    while (NIL != cdolist_list_var_$33) {
                        SubLObject cdolist_list_var_$34 = keywords;
                        SubLObject keyword2 = NIL;
                        keyword2 = cdolist_list_var_$34.first();
                        while (NIL != cdolist_list_var_$34) {
                            final SubLObject binding_pair2 = list(cycl2, keyword2);
                            validate_binding_pair(binding_pair2);
                            binding_pairs2 = cons(binding_pair2, binding_pairs2);
                            cdolist_list_var_$34 = cdolist_list_var_$34.rest();
                            keyword2 = cdolist_list_var_$34.first();
                        } 
                        ans = cons(binding_pairs2, ans);
                        cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                        binding_pairs2 = cdolist_list_var_$33.first();
                    } 
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    cycl2 = cdolist_list_var2.first();
                } 
            }
        } else {
            cdestructuring_bind_error(datum, $list135);
        }
        return ans;
    }/**
     * Recursive function to get all the permutations of bindings.
     *
     * @param CYCLS-BINDINGS
     * 		listp; of (<cycls> <keywords>) pairs.
     * @return LISTP; of lists of (<cycl> <keyword>) pairs.
     */


    public static final SubLObject validate_binding_pair_alt(SubLObject binding_pair) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((binding_pair.isList() && (NIL != list_utilities.lengthE(binding_pair, TWO_INTEGER, UNPROVIDED))) && second(binding_pair).isKeyword())) {
                    Errors.error($str_alt131$Bad_binding_pair___S, binding_pair);
                }
            }
            return $VALID;
        }
    }

    public static SubLObject validate_binding_pair(final SubLObject binding_pair) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (((!binding_pair.isList()) || (NIL == list_utilities.lengthE(binding_pair, TWO_INTEGER, UNPROVIDED))) || (!second(binding_pair).isKeyword()))) {
            Errors.error($str136$Bad_binding_pair___S, binding_pair);
        }
        return $VALID;
    }

    public static final SubLObject psp_collectionP_alt(SubLObject psp_cycl) {
        return psp_collection_memoizedP(psp_cycl_cycl(psp_cycl));
    }

    public static SubLObject psp_collectionP(final SubLObject psp_cycl) {
        return psp_collection_memoizedP(psp_cycl_cycl(psp_cycl));
    }

    public static final SubLObject psp_collection_memoizedP_internal_alt(SubLObject cycl) {
        return rbp_wff.npp_collectionP(cycl);
    }

    public static SubLObject psp_collection_memoizedP_internal(final SubLObject cycl) {
        return rbp_wff.npp_collectionP(cycl);
    }

    public static final SubLObject psp_collection_memoizedP_alt(SubLObject cycl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return psp_collection_memoizedP_internal(cycl);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym133$PSP_COLLECTION_MEMOIZED_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym133$PSP_COLLECTION_MEMOIZED_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym133$PSP_COLLECTION_MEMOIZED_, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, cycl, $kw46$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw46$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_collection_memoizedP_internal(cycl)));
                        memoization_state.caching_state_put(caching_state, cycl, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject psp_collection_memoizedP(final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return psp_collection_memoizedP_internal(cycl);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym138$PSP_COLLECTION_MEMOIZED_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym138$PSP_COLLECTION_MEMOIZED_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym138$PSP_COLLECTION_MEMOIZED_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, cycl, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_collection_memoizedP_internal(cycl)));
            memoization_state.caching_state_put(caching_state, cycl, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     * Reformulate a single PSP CycL expression.
     */
    @LispMethod(comment = "Reformulate a single PSP CycL expression.")
    public static final SubLObject psp_reformulate_alt(SubLObject psp_cycl) {
        {
            SubLObject cycl = psp_cycl_cycl(psp_cycl);
            SubLObject new_cycl = psp_reformulate_int(cycl);
            SubLObject new_psp_cycl = NIL;
            if (NIL != psp_weighted_cycl_p(psp_cycl)) {
                psp_weighted_cycl_set_cycl(psp_cycl, new_cycl);
                new_psp_cycl = psp_cycl;
            } else {
                new_psp_cycl = new_cycl;
            }
            return values(new_psp_cycl, parsing_macros.parsing_timeout_time_reachedP());
        }
    }

    @LispMethod(comment = "Reformulate a single PSP CycL expression.")
    public static SubLObject psp_reformulate(final SubLObject psp_cycl) {
        final SubLObject cycl = psp_cycl_cycl(psp_cycl);
        final SubLObject new_cycl = psp_reformulate_int(cycl);
        SubLObject new_psp_cycl = NIL;
        if (NIL != psp_weighted_cycl_p(psp_cycl)) {
            psp_weighted_cycl_set_cycl(psp_cycl, new_cycl);
            new_psp_cycl = psp_cycl;
        } else {
            new_psp_cycl = new_cycl;
        }
        return values(new_psp_cycl, parsing_macros.parsing_timeout_time_reachedP());
    }/**
     * Reformulate a single PSP CycL expression.
     */


    /**
     * Reformulate a single CycL expression.
     */
    @LispMethod(comment = "Reformulate a single CycL expression.")
    public static final SubLObject psp_reformulate_int_internal_alt(SubLObject cycl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_cycl = cycl;
                {
                    SubLObject _prev_bind_0 = nl_reformulator.$nl_reformulator_settings$.currentBinding(thread);
                    try {
                        nl_reformulator.$nl_reformulator_settings$.bind(nl_reformulator.nl_ref_remove_modules($psp_reformulator_modules_to_skip$.getGlobalValue()), thread);
                        new_cycl = nl_reformulator.nl_reformulate(cycl, parsing_macros.parsing_timeout_time_remaining());
                    } finally {
                        nl_reformulator.$nl_reformulator_settings$.rebind(_prev_bind_0, thread);
                    }
                }
                if (!((cycl.equal(new_cycl) || (NIL != parsing_vars.$npp_use_nl_tagsP$.getDynamicValue(thread))) || (NIL != rbp_wff.rbp_wf_natP(new_cycl, parsing_vars.$np_wff_filter_level$.getDynamicValue(thread))))) {
                    new_cycl = NIL;
                }
                return new_cycl;
            }
        }
    }

    @LispMethod(comment = "Reformulate a single CycL expression.")
    public static SubLObject psp_reformulate_int_internal(final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_cycl = cycl;
        SubLObject error_message = NIL;
        final SubLObject _prev_bind_0 = nl_reformulator.$nl_reformulator_settings$.currentBinding(thread);
        try {
            nl_reformulator.$nl_reformulator_settings$.bind(nl_reformulator.nl_ref_remove_modules($psp_reformulator_modules_to_skip$.getGlobalValue()), thread);
            thread.resetMultipleValues();
            final SubLObject new_cycl_$35 = nl_reformulator.nl_reformulate(cycl, parsing_macros.parsing_timeout_time_remaining());
            final SubLObject error_message_$36 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            new_cycl = new_cycl_$35;
            error_message = error_message_$36;
        } finally {
            nl_reformulator.$nl_reformulator_settings$.rebind(_prev_bind_0, thread);
        }
        if ($ERROR == new_cycl) {
            Errors.warn(error_message);
            return cycl;
        }
        if (((!cycl.equal(new_cycl)) && (NIL == parsing_vars.$npp_use_nl_tagsP$.getDynamicValue(thread))) && (NIL == rbp_wff.rbp_wf_natP(new_cycl, parsing_vars.$np_wff_filter_level$.getDynamicValue(thread)))) {
            new_cycl = NIL;
        }
        return new_cycl;
    }/**
     * Reformulate a single CycL expression.
     */


    public static final SubLObject psp_reformulate_int_alt(SubLObject cycl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return psp_reformulate_int_internal(cycl);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PSP_REFORMULATE_INT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PSP_REFORMULATE_INT, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, PSP_REFORMULATE_INT, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, cycl, $kw46$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw46$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_reformulate_int_internal(cycl)));
                        memoization_state.caching_state_put(caching_state, cycl, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject psp_reformulate_int(final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return psp_reformulate_int_internal(cycl);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PSP_REFORMULATE_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PSP_REFORMULATE_INT, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PSP_REFORMULATE_INT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, cycl, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_reformulate_int_internal(cycl)));
            memoization_state.caching_state_put(caching_state, cycl, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     * Reformulate a whole list of CycL expressions.
     */
    @LispMethod(comment = "Reformulate a whole list of CycL expressions.")
    public static final SubLObject psp_reformulate_cycls_alt(SubLObject cycls) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_cycls = NIL;
                SubLObject timed_outP = parsing_macros.parsing_timeout_time_reachedP();
                if (NIL != rkf_discourse_tracking.rkf_discourse_context_p(rkf_discourse_tracking.$rkf_discourse_context$.getDynamicValue(thread))) {
                    {
                        SubLObject accumulator = NIL;
                        SubLObject cdolist_list_var = cycls;
                        SubLObject cycl = NIL;
                        for (cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycl = cdolist_list_var.first()) {
                            accumulator = cconcatenate(accumulator, psp_disc_resolve_sentence_entities(cycl));
                        }
                        cycls = accumulator;
                    }
                }
                {
                    SubLObject v_memoization_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLTrampolineFile.checkType(v_memoization_state, MEMOIZATION_STATE_P);
                    {
                        SubLObject _prev_bind_0 = reformulator_datastructures.$reformulator_memoization_state$.currentBinding(thread);
                        try {
                            reformulator_datastructures.$reformulator_memoization_state$.bind(v_memoization_state, thread);
                            {
                                SubLObject local_state = reformulator_datastructures.$reformulator_memoization_state$.getDynamicValue(thread);
                                {
                                    SubLObject _prev_bind_0_32 = memoization_state.$memoization_state$.currentBinding(thread);
                                    try {
                                        memoization_state.$memoization_state$.bind(local_state, thread);
                                        {
                                            SubLObject original_memoization_process = NIL;
                                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                                {
                                                    SubLObject current_proc = current_process();
                                                    if (NIL == original_memoization_process) {
                                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                    } else {
                                                        if (original_memoization_process != current_proc) {
                                                            Errors.error($str_alt137$Invalid_attempt_to_reuse_memoizat);
                                                        }
                                                    }
                                                }
                                            }
                                            try {
                                                {
                                                    SubLObject _prev_bind_0_33 = nl_reformulator.$nl_reformulator_settings$.currentBinding(thread);
                                                    try {
                                                        nl_reformulator.$nl_reformulator_settings$.bind(nl_reformulator.add_or_change_nl_reformulator_settings($kw138$CLEAR_CACHES_, $FALSE), thread);
                                                        if (NIL == timed_outP) {
                                                            {
                                                                SubLObject csome_list_var = cycls;
                                                                SubLObject cycl = NIL;
                                                                for (cycl = csome_list_var.first(); !((NIL != timed_outP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , cycl = csome_list_var.first()) {
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject new_cycl = psp_reformulate(cycl);
                                                                        SubLObject timeP = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != timeP) {
                                                                            timed_outP = T;
                                                                        } else {
                                                                            new_cycls = cons(new_cycl, new_cycls);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        nl_reformulator.$nl_reformulator_settings$.rebind(_prev_bind_0_33, thread);
                                                    }
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0_34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                        }
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_34, thread);
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        memoization_state.$memoization_state$.rebind(_prev_bind_0_32, thread);
                                    }
                                }
                            }
                        } finally {
                            reformulator_datastructures.$reformulator_memoization_state$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return values(nreverse(new_cycls), timed_outP);
            }
        }
    }

    @LispMethod(comment = "Reformulate a whole list of CycL expressions.")
    public static SubLObject psp_reformulate_cycls(SubLObject cycls) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_cycls = NIL;
        SubLObject timed_outP = parsing_macros.parsing_timeout_time_reachedP();
        if (NIL != rkf_discourse_tracking.rkf_discourse_context_p(rkf_discourse_tracking.$rkf_discourse_context$.getDynamicValue(thread))) {
            SubLObject accumulator = NIL;
            SubLObject cdolist_list_var = cycls;
            SubLObject cycl = NIL;
            cycl = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                accumulator = cconcatenate(accumulator, psp_disc_resolve_sentence_entities(cycl));
                cdolist_list_var = cdolist_list_var.rest();
                cycl = cdolist_list_var.first();
            } 
            cycls = accumulator;
        }
        final SubLObject v_memoization_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        assert NIL != memoization_state.memoization_state_p(v_memoization_state) : "! memoization_state.memoization_state_p(v_memoization_state) " + ("memoization_state.memoization_state_p(v_memoization_state) " + "CommonSymbols.NIL != memoization_state.memoization_state_p(v_memoization_state) ") + v_memoization_state;
        final SubLObject _prev_bind_0 = reformulator_datastructures.$reformulator_memoization_state$.currentBinding(thread);
        try {
            reformulator_datastructures.$reformulator_memoization_state$.bind(v_memoization_state, thread);
            final SubLObject local_state = reformulator_datastructures.$reformulator_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$37 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject _prev_bind_0_$38 = nl_reformulator.$nl_reformulator_settings$.currentBinding(thread);
                    try {
                        nl_reformulator.$nl_reformulator_settings$.bind(nl_reformulator.add_or_change_nl_reformulator_settings($kw142$CLEAR_CACHES_, $FALSE), thread);
                        if (NIL == timed_outP) {
                            SubLObject csome_list_var = cycls;
                            SubLObject cycl2 = NIL;
                            cycl2 = csome_list_var.first();
                            while ((NIL == timed_outP) && (NIL != csome_list_var)) {
                                thread.resetMultipleValues();
                                final SubLObject new_cycl = psp_reformulate(cycl2);
                                final SubLObject timeP = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != timeP) {
                                    timed_outP = T;
                                } else {
                                    new_cycls = cons(new_cycl, new_cycls);
                                }
                                csome_list_var = csome_list_var.rest();
                                cycl2 = csome_list_var.first();
                            } 
                        }
                    } finally {
                        nl_reformulator.$nl_reformulator_settings$.rebind(_prev_bind_0_$38, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$39 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$39, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$37, thread);
            }
        } finally {
            reformulator_datastructures.$reformulator_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return values(nreverse(new_cycls), timed_outP);
    }/**
     * Reformulate a whole list of CycL expressions.
     */


    public static final SubLObject psp_disc_resolve_sentence_entities_alt(SubLObject psp_cycl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cycl = psp_cycl_cycl(psp_cycl);
                SubLObject resolved_cycls = rkf_discourse_tracking.rkf_disc_resolve_sentence_entities(cycl, rkf_discourse_tracking.$rkf_discourse_context$.getDynamicValue(thread));
                if (NIL != psp_weighted_cycl_p(psp_cycl)) {
                    {
                        SubLObject weight = psp_weighted_cycl_weight(psp_cycl);
                        SubLObject resolved_weighted_cycls = NIL;
                        SubLObject cdolist_list_var = resolved_cycls;
                        SubLObject resolved_cycl = NIL;
                        for (resolved_cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , resolved_cycl = cdolist_list_var.first()) {
                            resolved_weighted_cycls = cons(new_psp_weighted_cycl(resolved_cycl, weight), resolved_weighted_cycls);
                        }
                        return resolved_weighted_cycls;
                    }
                } else {
                    return resolved_cycls;
                }
            }
        }
    }

    public static SubLObject psp_disc_resolve_sentence_entities(final SubLObject psp_cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cycl = psp_cycl_cycl(psp_cycl);
        final SubLObject resolved_cycls = rkf_discourse_tracking.rkf_disc_resolve_sentence_entities(cycl, rkf_discourse_tracking.$rkf_discourse_context$.getDynamicValue(thread));
        if (NIL != psp_weighted_cycl_p(psp_cycl)) {
            final SubLObject weight = psp_weighted_cycl_weight(psp_cycl);
            SubLObject resolved_weighted_cycls = NIL;
            SubLObject cdolist_list_var = resolved_cycls;
            SubLObject resolved_cycl = NIL;
            resolved_cycl = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                resolved_weighted_cycls = cons(new_psp_weighted_cycl(resolved_cycl, weight), resolved_weighted_cycls);
                cdolist_list_var = cdolist_list_var.rest();
                resolved_cycl = cdolist_list_var.first();
            } 
            return resolved_weighted_cycls;
        }
        return resolved_cycls;
    }

    /**
     *
     *
     * @return BOOLEAN; Is TEMPLATE well-formed, with the substitutions specified in
    BINDINGS performed?
     */
    @LispMethod(comment = "@return BOOLEAN; Is TEMPLATE well-formed, with the substitutions specified in\r\nBINDINGS performed?")
    public static final SubLObject psp_wffP_internal_alt(SubLObject template, SubLObject v_bindings) {
        return psp_wffP_int(template, v_bindings);
    }

    /**
     *
     *
     * @return BOOLEAN; Is TEMPLATE well-formed, with the substitutions specified in
    BINDINGS performed?
     */
    @LispMethod(comment = "@return BOOLEAN; Is TEMPLATE well-formed, with the substitutions specified in\r\nBINDINGS performed?")
    public static SubLObject psp_wffP_internal(final SubLObject template, final SubLObject v_bindings) {
        return psp_wffP_int(template, v_bindings);
    }

    public static final SubLObject psp_wffP_alt(SubLObject template, SubLObject v_bindings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return psp_wffP_internal(template, v_bindings);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym140$PSP_WFF_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym140$PSP_WFF_, TWO_INTEGER, NIL, EQUALP, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym140$PSP_WFF_, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(template, v_bindings);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw46$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (template.equalp(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && v_bindings.equalp(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_wffP_internal(template, v_bindings)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(template, v_bindings));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject psp_wffP(final SubLObject template, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return psp_wffP_internal(template, v_bindings);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym144$PSP_WFF_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym144$PSP_WFF_, TWO_INTEGER, NIL, EQUALP, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym144$PSP_WFF_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(template, v_bindings);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (template.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && v_bindings.equalp(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(psp_wffP_internal(template, v_bindings)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(template, v_bindings));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject psp_wffP_int_alt(SubLObject template, SubLObject v_bindings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject wfP = NIL;
                if (NIL != list_utilities.tree_find_if(symbol_function(KEYWORDP), Mapping.mapcar(symbol_function(CDR), v_bindings), UNPROVIDED)) {
                    wfP = T;
                } else {
                    if (NIL != list_utilities.tree_find(psp_chart.psp_np_gap_referent(), Mapping.mapcar(symbol_function(CDR), v_bindings), UNPROVIDED, UNPROVIDED)) {
                        wfP = T;
                    } else {
                        if (NIL != psp_indexical_bindings_p(v_bindings)) {
                            wfP = T;
                        } else {
                            if (((!parsing_vars.$np_wff_filter_level$.getDynamicValue(thread).isPositive()) || (NIL != rbp_wff.rbp_wf_template_argsP(template, v_bindings, ONE_INTEGER))) && ((!parsing_vars.$np_wff_filter_level$.getDynamicValue(thread).numG(ONE_INTEGER)) || (NIL != rbp_wff.rbp_wf_template_argsP(template, v_bindings, TWO_INTEGER)))) {
                                wfP = T;
                            }
                        }
                    }
                }
                if (!((NIL != wfP) || (NIL == rbp_wff.$rbp_show_non_wffP$.getDynamicValue(thread)))) {
                    {
                        SubLObject nat = template;
                        SubLObject cdolist_list_var = v_bindings;
                        SubLObject binding = NIL;
                        for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                            {
                                SubLObject out = binding.first();
                                SubLObject in = binding.rest();
                                nat = subst(in, out, nat, UNPROVIDED, UNPROVIDED);
                            }
                        }
                        format(T, $str_alt142$__Not_WFF___S__, nat);
                    }
                }
                return wfP;
            }
        }
    }

    public static SubLObject psp_wffP_int(final SubLObject template, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wfP = NIL;
        if (NIL != list_utilities.tree_find_if(symbol_function(KEYWORDP), Mapping.mapcar(symbol_function(CDR), v_bindings), UNPROVIDED)) {
            wfP = T;
        } else
            if (NIL != list_utilities.tree_find(psp_chart.psp_np_gap_referent(), Mapping.mapcar(symbol_function(CDR), v_bindings), UNPROVIDED, UNPROVIDED)) {
                wfP = T;
            } else
                if (NIL != psp_indexical_bindings_p(v_bindings)) {
                    wfP = T;
                } else
                    if (((!parsing_vars.$np_wff_filter_level$.getDynamicValue(thread).isPositive()) || (NIL != rbp_wff.rbp_wf_template_argsP(template, v_bindings, ONE_INTEGER))) && ((!parsing_vars.$np_wff_filter_level$.getDynamicValue(thread).numG(ONE_INTEGER)) || (NIL != rbp_wff.rbp_wf_template_argsP(template, v_bindings, TWO_INTEGER)))) {
                        wfP = T;
                    }



        if ((NIL == wfP) && (NIL != rbp_wff.$rbp_show_non_wffP$.getDynamicValue(thread))) {
            SubLObject nat = template;
            SubLObject cdolist_list_var = v_bindings;
            SubLObject binding = NIL;
            binding = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject out = binding.first();
                final SubLObject in = binding.rest();
                nat = subst(in, out, nat, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                binding = cdolist_list_var.first();
            } 
            format(T, $str146$__Not_WFF___S__, nat);
        }
        return wfP;
    }

    /**
     *
     *
     * @return BOOLEAN; Does BINDINGS contain something from *PSP-INDEXICAL-MAP*?
     */
    @LispMethod(comment = "@return BOOLEAN; Does BINDINGS contain something from *PSP-INDEXICAL-MAP*?")
    public static final SubLObject psp_indexical_bindings_p_alt(SubLObject v_bindings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject rest = NIL;
                for (rest = parsing_vars.$psp_indexical_map$.getDynamicValue(thread); !((NIL != ans) || (NIL == rest)); rest = rest.rest()) {
                    {
                        SubLObject cons = rest.first();
                        SubLObject datum = cons;
                        SubLObject current = datum;
                        SubLObject indexical_string = NIL;
                        SubLObject denot = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt143);
                        indexical_string = current.first();
                        current = current.rest();
                        denot = current;
                        ans = list_utilities.tree_find(denot, Mapping.mapcar(symbol_function(CDR), v_bindings), symbol_function(EQUAL), UNPROVIDED);
                    }
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Does BINDINGS contain something from *PSP-INDEXICAL-MAP*?
     */
    @LispMethod(comment = "@return BOOLEAN; Does BINDINGS contain something from *PSP-INDEXICAL-MAP*?")
    public static SubLObject psp_indexical_bindings_p(final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans;
        SubLObject rest;
        SubLObject cons;
        SubLObject current;
        SubLObject datum;
        SubLObject indexical_string;
        SubLObject denot;
        for (ans = NIL, rest = NIL, rest = parsing_vars.$psp_indexical_map$.getDynamicValue(thread); (NIL == ans) && (NIL != rest); ans = list_utilities.tree_find(denot, Mapping.mapcar(symbol_function(CDR), v_bindings), symbol_function(EQUAL), UNPROVIDED) , rest = rest.rest()) {
            cons = rest.first();
            datum = current = cons;
            indexical_string = NIL;
            denot = NIL;
            destructuring_bind_must_consp(current, datum, $list147);
            indexical_string = current.first();
            current = denot = current.rest();
        }
        return ans;
    }

    /**
     *
     *
     * @return LISTP of templates.
     */
    @LispMethod(comment = "@return LISTP of templates.")
    public static final SubLObject psp_sem_templates_from_lexical_edge_internal_alt(SubLObject edge) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame = psp_chart.get_psp_edge_frame(edge);
                if ((((NIL != frame) || (NIL != psp_genl_posP(psp_chart.get_psp_edge_category(edge), $$Preposition, UNPROVIDED))) || (NIL != psp_genl_posP(psp_chart.get_psp_edge_category(edge), $$Adjective, UNPROVIDED))) || (NIL != psp_genl_posP(psp_chart.get_psp_edge_category(edge), $$Adverb, UNPROVIDED))) {
                    {
                        SubLObject category = psp_chart.get_psp_edge_category(edge);
                        SubLObject passiveP = psp_chart.psp_passive_frameP(frame);
                        SubLObject active_frame = (NIL != passiveP) ? ((SubLObject) (psp_chart.psp_active_frame(frame))) : frame;
                        SubLObject raw_templates = psp_raw_templates(edge, category, active_frame);
                        SubLObject davidsonian_templates = psp_davidsonianize_verb_templates(raw_templates, category);
                        SubLObject quantified_templates = psp_quantify_templates(davidsonian_templates);
                        SubLObject output_templates = NIL;
                        SubLObject cdolist_list_var = quantified_templates;
                        SubLObject template = NIL;
                        for (template = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template = cdolist_list_var.first()) {
                            if (NIL != psp_ok_templateP(template, category, active_frame)) {
                                output_templates = cons(template, output_templates);
                            }
                        }
                        if (NIL != passiveP) {
                            output_templates = psp_passivize_templates(output_templates, frame);
                        }
                        if (NIL == output_templates) {
                            if (NIL != parsing_vars.$psp_verboseP$.getDynamicValue(thread)) {
                                Errors.warn($str_alt49$No_templates_for__S___, edge);
                            }
                        }
                        return output_templates;
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return LISTP of templates.
     */
    @LispMethod(comment = "@return LISTP of templates.")
    public static SubLObject psp_sem_templates_from_lexical_edge_internal(final SubLObject edge) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame = psp_chart.get_psp_edge_frame(edge);
        if ((((NIL != frame) || (NIL != psp_genl_posP(psp_chart.get_psp_edge_category(edge), $$Preposition, UNPROVIDED))) || (NIL != psp_genl_posP(psp_chart.get_psp_edge_category(edge), $$Adjective, UNPROVIDED))) || (NIL != psp_genl_posP(psp_chart.get_psp_edge_category(edge), $$Adverb, UNPROVIDED))) {
            final SubLObject category = psp_chart.get_psp_edge_category(edge);
            final SubLObject passiveP = psp_chart.psp_passive_frameP(frame);
            final SubLObject active_frame = (NIL != passiveP) ? psp_chart.psp_active_frame(frame) : frame;
            final SubLObject raw_templates = psp_raw_templates(edge, category, active_frame);
            final SubLObject davidsonian_templates = psp_davidsonianize_verb_templates(raw_templates, category);
            final SubLObject quantified_templates = psp_quantify_templates(davidsonian_templates);
            SubLObject output_templates = NIL;
            SubLObject cdolist_list_var = quantified_templates;
            SubLObject template = NIL;
            template = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != psp_ok_templateP(template, category, active_frame)) {
                    output_templates = cons(template, output_templates);
                }
                cdolist_list_var = cdolist_list_var.rest();
                template = cdolist_list_var.first();
            } 
            if (NIL != passiveP) {
                output_templates = psp_passivize_templates(output_templates, frame);
            }
            if ((NIL == output_templates) && (NIL != parsing_vars.$psp_verboseP$.getDynamicValue(thread))) {
                Errors.warn($str54$No_templates_for__S___, edge);
            }
            return output_templates;
        }
        return NIL;
    }

    public static final SubLObject psp_sem_templates_from_lexical_edge_alt(SubLObject edge) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return psp_sem_templates_from_lexical_edge_internal(edge);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PSP_SEM_TEMPLATES_FROM_LEXICAL_EDGE, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PSP_SEM_TEMPLATES_FROM_LEXICAL_EDGE, ONE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, PSP_SEM_TEMPLATES_FROM_LEXICAL_EDGE, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, edge, $kw46$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw46$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_sem_templates_from_lexical_edge_internal(edge)));
                        memoization_state.caching_state_put(caching_state, edge, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject psp_sem_templates_from_lexical_edge(final SubLObject edge) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return psp_sem_templates_from_lexical_edge_internal(edge);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PSP_SEM_TEMPLATES_FROM_LEXICAL_EDGE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PSP_SEM_TEMPLATES_FROM_LEXICAL_EDGE, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PSP_SEM_TEMPLATES_FROM_LEXICAL_EDGE, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, edge, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_sem_templates_from_lexical_edge_internal(edge)));
            memoization_state.caching_state_put(caching_state, edge, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     *
     *
     * @return LISTP of collection-denoting CycL expressions for WU as POS,
    from *nounSemTrans assertions.
     */
    @LispMethod(comment = "@return LISTP of collection-denoting CycL expressions for WU as POS,\r\nfrom *nounSemTrans assertions.")
    public static final SubLObject psp_noun_sem_trans_cycls_alt(SubLObject string, SubLObject wu, SubLObject pos) {
        {
            SubLObject raw_templates = psp_lookup_templates_memoized(string, wu, pos, $$RegularNounFrame, UNPROVIDED, UNPROVIDED);
            SubLObject templates = psp_quantify_templates(raw_templates);
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = templates;
            SubLObject propositional_template = NIL;
            for (propositional_template = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , propositional_template = cdolist_list_var.first()) {
                {
                    SubLObject collection_expr = psp_coerce_template_to_collection(propositional_template, T, $NOUN);
                    if (collection_expr != $ERROR) {
                        collection_expr = psp_cycl_subst($$Thing, $NOUN, collection_expr);
                        if (NIL == cycl_utilities.expression_find_if(KEYWORDP, collection_expr, UNPROVIDED, UNPROVIDED)) {
                            {
                                SubLObject item_var = collection_expr;
                                if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                    ans = cons(item_var, ans);
                                }
                            }
                        }
                    }
                }
            }
            return ans;
        }
    }

    /**
     *
     *
     * @return LISTP of collection-denoting CycL expressions for WU as POS,
    from *nounSemTrans assertions.
     */
    @LispMethod(comment = "@return LISTP of collection-denoting CycL expressions for WU as POS,\r\nfrom *nounSemTrans assertions.")
    public static SubLObject psp_noun_sem_trans_cycls(final SubLObject string, final SubLObject wu, final SubLObject pos) {
        final SubLObject raw_templates = psp_lookup_templates_memoized(string, wu, pos, $$RegularNounFrame, UNPROVIDED, UNPROVIDED);
        final SubLObject templates = psp_quantify_templates(raw_templates);
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = templates;
        SubLObject propositional_template = NIL;
        propositional_template = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject collection_expr = psp_coerce_template_to_collection(propositional_template, T, $NOUN);
            if (collection_expr != $ERROR) {
                collection_expr = psp_cycl_subst($$Thing, $NOUN, collection_expr);
                if (NIL == cycl_utilities.expression_find_if(KEYWORDP, collection_expr, UNPROVIDED, UNPROVIDED)) {
                    final SubLObject item_var = collection_expr;
                    if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        ans = cons(item_var, ans);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            propositional_template = cdolist_list_var.first();
        } 
        return ans;
    }

    /**
     *
     *
     * @return BOOLEAN; Is TEMPLATE not suitable for FRAME?
     */
    @LispMethod(comment = "@return BOOLEAN; Is TEMPLATE not suitable for FRAME?")
    public static final SubLObject psp_bad_templateP_alt(SubLObject template, SubLObject frame) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject badP = NIL;
                if (NIL == badP) {
                    {
                        SubLObject csome_list_var = cycl_utilities.expression_gather(template, symbol_function(CYCL_DENOTATIONAL_TERM_P), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject v_term = NIL;
                        for (v_term = csome_list_var.first(); !((NIL != badP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_term = csome_list_var.first()) {
                            if (v_term.isKeyword()) {
                                if (NIL == subl_promotions.memberP(v_term, psp_chart.psp_keywords_for_frame(frame), UNPROVIDED, UNPROVIDED)) {
                                    if (NIL != parsing_vars.$psp_verboseP$.getDynamicValue(thread)) {
                                        Errors.warn($str_alt153$_S_is_not_a_known_keyword_for__S_, v_term, frame);
                                    }
                                    badP = T;
                                }
                            } else {
                                if (NIL == psp_chart.psp_term_passes_constraintsP(v_term, UNPROVIDED)) {
                                    badP = T;
                                }
                            }
                        }
                    }
                }
                return badP;
            }
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Is TEMPLATE not suitable for FRAME?
     */
    @LispMethod(comment = "@return BOOLEAN; Is TEMPLATE not suitable for FRAME?")
    public static SubLObject psp_bad_templateP(final SubLObject template, final SubLObject frame) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject badP = NIL;
        if (NIL == badP) {
            SubLObject csome_list_var = cycl_utilities.expression_gather(template, symbol_function(CYCL_DENOTATIONAL_TERM_P), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject v_term = NIL;
            v_term = csome_list_var.first();
            while ((NIL == badP) && (NIL != csome_list_var)) {
                if (v_term.isKeyword()) {
                    if (NIL == subl_promotions.memberP(v_term, psp_chart.psp_keywords_for_frame(frame), UNPROVIDED, UNPROVIDED)) {
                        if (NIL != parsing_vars.$psp_verboseP$.getDynamicValue(thread)) {
                            Errors.warn($str153$_S_is_not_a_known_keyword_for__S_, v_term, frame);
                        }
                        badP = T;
                    }
                } else
                    if (NIL == psp_chart.psp_term_passes_constraintsP(v_term, UNPROVIDED)) {
                        badP = T;
                    }

                csome_list_var = csome_list_var.rest();
                v_term = csome_list_var.first();
            } 
        }
        return badP;
    }

    /**
     *
     *
     * @param FRAME;
     * 		Spec or instance of #$SubcategorizationFrame, or NIL.
     */
    @LispMethod(comment = "@param FRAME;\r\n\t\tSpec or instance of #$SubcategorizationFrame, or NIL.")
    public static final SubLObject psp_raw_templates_alt(SubLObject edge, SubLObject category, SubLObject frame) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == frame) {
                frame = psp_frame_type_from_context(edge, category);
            }
            {
                SubLObject string = psp_chart.get_psp_edge_string(edge);
                SubLObject wu = psp_chart.get_psp_edge_wu(edge);
                SubLObject templates = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject templates_from_lookup = psp_lookup_templates_memoized(string, wu, category, frame, UNPROVIDED, UNPROVIDED);
                    SubLObject frames = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != templates_from_lookup) {
                        templates = templates_from_lookup;
                    } else {
                        templates = psp_devise_templates(edge, category, frames);
                    }
                }
                return templates;
            }
        }
    }

    /**
     *
     *
     * @param FRAME;
     * 		Spec or instance of #$SubcategorizationFrame, or NIL.
     */
    @LispMethod(comment = "@param FRAME;\r\n\t\tSpec or instance of #$SubcategorizationFrame, or NIL.")
    public static SubLObject psp_raw_templates(final SubLObject edge, final SubLObject category, SubLObject frame) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == frame) {
            frame = psp_frame_type_from_context(edge, category);
        }
        final SubLObject string = psp_chart.get_psp_edge_string(edge);
        final SubLObject wu = psp_chart.get_psp_edge_wu(edge);
        SubLObject templates = NIL;
        thread.resetMultipleValues();
        final SubLObject templates_from_lookup = psp_lookup_templates_memoized(string, wu, category, frame, UNPROVIDED, UNPROVIDED);
        final SubLObject frames = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != templates_from_lookup) {
            templates = templates_from_lookup;
        } else {
            templates = psp_devise_templates(edge, category, frames);
        }
        return templates;
    }

    public static final SubLObject psp_lookup_templates_memoized_internal_alt(SubLObject string, SubLObject wu, SubLObject category, SubLObject frame, SubLObject prag_filters, SubLObject lexicon) {
        if (prag_filters == UNPROVIDED) {
            prag_filters = lexicon_vars.active_pragmatic_filters();
        }
        if (lexicon == UNPROVIDED) {
            lexicon = (NIL != misc_utilities.initialized_p(parsing_vars.$psp_lexicon$.getDynamicValue())) ? ((SubLObject) (parsing_vars.$psp_lexicon$.getDynamicValue())) : psp_lexicon.get_default_psp_lexicon(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (((NIL != wu) && (NIL != lexicon_accessors.speech_partP(category, parsing_utilities.psp_lexicon_root_mt(UNPROVIDED)))) && (NIL != string_utilities.empty_string_p(string))) {
                string = lexicon_cache.first_string_of_word_unit(wu, lexicon_utilities.preds_of_pos(category, parsing_utilities.psp_lexicon_root_mt(UNPROVIDED)), UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject templates = NIL;
                SubLObject frames = (NIL != psp_collectionP(frame)) ? ((SubLObject) (isa.all_fort_instances(frame, parsing_utilities.psp_lexicon_root_mt(lexicon), UNPROVIDED))) : list(frame);
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$exclude_vulgaritiesP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = lexicon_vars.$exclude_slangP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = lexicon_vars.$exclude_archaic_speechP$.currentBinding(thread);
                    try {
                        lexicon_vars.$exclude_vulgaritiesP$.bind(subl_promotions.memberP($exclude_vulgaritiesP$, prag_filters, UNPROVIDED, UNPROVIDED), thread);
                        lexicon_vars.$exclude_slangP$.bind(subl_promotions.memberP($exclude_slangP$, prag_filters, UNPROVIDED, UNPROVIDED), thread);
                        lexicon_vars.$exclude_archaic_speechP$.bind(subl_promotions.memberP($exclude_archaic_speechP$, prag_filters, UNPROVIDED, UNPROVIDED), thread);
                        {
                            SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(lexicon, GET_SEMTRANS_ENTRIES, string);
                            SubLObject lex_entry = NIL;
                            for (lex_entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lex_entry = cdolist_list_var.first()) {
                                {
                                    SubLObject template = methods.funcall_instance_method_with_1_args(lex_entry, GET, $SEMTRANS);
                                    SubLObject frame_inst = methods.funcall_instance_method_with_1_args(lex_entry, GET, $FRAME);
                                    SubLObject lex_entry_wu = methods.funcall_instance_method_with_1_args(lex_entry, GET, $WORD_UNIT);
                                    SubLObject pragmatics = methods.funcall_instance_method_with_1_args(lex_entry, GET, $PRAGMATICS);
                                    SubLObject pos = methods.funcall_instance_method_with_1_args(lex_entry, GET, $CYC_POS);
                                    if (((((NIL != lexicon_accessors.genl_posP(pos, category, UNPROVIDED)) && (NIL != subl_promotions.memberP(frame_inst, frames, UNPROVIDED, UNPROVIDED))) && lex_entry_wu.eql(wu)) && (!((NIL != lexicon_vars.active_pragmatic_filtersP()) && (NIL != list_utilities.find_if_not($sym165$PRAGMATICALLY_ACCEPTABLE_, pragmatics, UNPROVIDED, UNPROVIDED, UNPROVIDED))))) && (NIL == psp_bad_templateP(template, frame_inst))) {
                                        {
                                            SubLObject item_var = template;
                                            if (NIL == member(item_var, templates, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                templates = cons(item_var, templates);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        lexicon_vars.$exclude_archaic_speechP$.rebind(_prev_bind_2, thread);
                        lexicon_vars.$exclude_slangP$.rebind(_prev_bind_1, thread);
                        lexicon_vars.$exclude_vulgaritiesP$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(templates, frames);
            }
        }
    }

    public static SubLObject psp_lookup_templates_memoized_internal(SubLObject string, final SubLObject wu, final SubLObject category, final SubLObject frame, SubLObject filters, SubLObject lexicon) {
        if (filters == UNPROVIDED) {
            filters = lexicon_vars.active_lexicon_filters();
        }
        if (lexicon == UNPROVIDED) {
            lexicon = (NIL != misc_utilities.initialized_p(parsing_vars.$psp_lexicon$.getDynamicValue())) ? parsing_vars.$psp_lexicon$.getDynamicValue() : psp_lexicon.get_default_psp_lexicon(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != wu) && (NIL != lexicon_accessors.speech_partP(category, parsing_utilities.psp_lexicon_root_mt(UNPROVIDED)))) && (NIL != string_utilities.empty_string_p(string))) {
            string = lexicon_cache.first_string_of_word_unit(wu, lexicon_utilities.preds_of_pos(category, parsing_utilities.psp_lexicon_root_mt(UNPROVIDED)), UNPROVIDED, UNPROVIDED);
        }
        SubLObject templates = NIL;
        final SubLObject frames = (NIL != psp_collectionP(frame)) ? isa.all_fort_instances(frame, parsing_utilities.psp_lexicon_root_mt(lexicon), UNPROVIDED) : list(frame);
        final SubLObject _prev_bind_0 = lexicon_vars.$exclude_vulgaritiesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = lexicon_vars.$exclude_slangP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = lexicon_vars.$exclude_archaic_speechP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = lexicon_vars.$exclude_indirect_relationsP$.currentBinding(thread);
        try {
            lexicon_vars.$exclude_vulgaritiesP$.bind(subl_promotions.memberP($exclude_vulgaritiesP$, filters, UNPROVIDED, UNPROVIDED), thread);
            lexicon_vars.$exclude_slangP$.bind(subl_promotions.memberP($exclude_slangP$, filters, UNPROVIDED, UNPROVIDED), thread);
            lexicon_vars.$exclude_archaic_speechP$.bind(subl_promotions.memberP($exclude_archaic_speechP$, filters, UNPROVIDED, UNPROVIDED), thread);
            lexicon_vars.$exclude_indirect_relationsP$.bind(subl_promotions.memberP($exclude_indirect_relationsP$, filters, UNPROVIDED, UNPROVIDED), thread);
            SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(lexicon, GET_SEMTRANS_ENTRIES, string);
            SubLObject lex_entry = NIL;
            lex_entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject template = methods.funcall_instance_method_with_1_args(lex_entry, GET, $SEMTRANS);
                final SubLObject frame_inst = methods.funcall_instance_method_with_1_args(lex_entry, GET, $FRAME);
                final SubLObject lex_entry_wu = methods.funcall_instance_method_with_1_args(lex_entry, GET, $WORD_UNIT);
                final SubLObject pragmatics = methods.funcall_instance_method_with_1_args(lex_entry, GET, $PRAGMATICS);
                final SubLObject pos = methods.funcall_instance_method_with_1_args(lex_entry, GET, $CYC_POS);
                if (((((NIL != lexicon_accessors.genl_posP(category, pos, UNPROVIDED)) && (NIL != subl_promotions.memberP(frame_inst, frames, UNPROVIDED, UNPROVIDED))) && lex_entry_wu.eql(wu)) && ((NIL == lexicon_vars.active_lexicon_filtersP()) || (NIL == list_utilities.find_if_not($sym166$PRAGMATICALLY_ACCEPTABLE_, pragmatics, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) && (NIL == psp_bad_templateP(template, frame_inst))) {
                    final SubLObject item_var = template;
                    if (NIL == member(item_var, templates, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        templates = cons(item_var, templates);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                lex_entry = cdolist_list_var.first();
            } 
        } finally {
            lexicon_vars.$exclude_indirect_relationsP$.rebind(_prev_bind_4, thread);
            lexicon_vars.$exclude_archaic_speechP$.rebind(_prev_bind_3, thread);
            lexicon_vars.$exclude_slangP$.rebind(_prev_bind_2, thread);
            lexicon_vars.$exclude_vulgaritiesP$.rebind(_prev_bind_0, thread);
        }
        return values(templates, frames);
    }

    public static final SubLObject psp_lookup_templates_memoized_alt(SubLObject string, SubLObject wu, SubLObject category, SubLObject frame, SubLObject prag_filters, SubLObject lexicon) {
        if (prag_filters == UNPROVIDED) {
            prag_filters = lexicon_vars.active_pragmatic_filters();
        }
        if (lexicon == UNPROVIDED) {
            lexicon = (NIL != misc_utilities.initialized_p(parsing_vars.$psp_lexicon$.getDynamicValue())) ? ((SubLObject) (parsing_vars.$psp_lexicon$.getDynamicValue())) : psp_lexicon.get_default_psp_lexicon(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return psp_lookup_templates_memoized_internal(string, wu, category, frame, prag_filters, lexicon);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PSP_LOOKUP_TEMPLATES_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PSP_LOOKUP_TEMPLATES_MEMOIZED, SIX_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, PSP_LOOKUP_TEMPLATES_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_6(string, wu, category, frame, prag_filters, lexicon);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw46$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (string.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (wu.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (category.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (frame.equal(cached_args.first())) {
                                                    cached_args = cached_args.rest();
                                                    if (prag_filters.equal(cached_args.first())) {
                                                        cached_args = cached_args.rest();
                                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && lexicon.equal(cached_args.first())) {
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
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_lookup_templates_memoized_internal(string, wu, category, frame, prag_filters, lexicon)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(string, wu, category, frame, prag_filters, lexicon));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject psp_lookup_templates_memoized(final SubLObject string, final SubLObject wu, final SubLObject category, final SubLObject frame, SubLObject filters, SubLObject lexicon) {
        if (filters == UNPROVIDED) {
            filters = lexicon_vars.active_lexicon_filters();
        }
        if (lexicon == UNPROVIDED) {
            lexicon = (NIL != misc_utilities.initialized_p(parsing_vars.$psp_lexicon$.getDynamicValue())) ? parsing_vars.$psp_lexicon$.getDynamicValue() : psp_lexicon.get_default_psp_lexicon(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return psp_lookup_templates_memoized_internal(string, wu, category, frame, filters, lexicon);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PSP_LOOKUP_TEMPLATES_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PSP_LOOKUP_TEMPLATES_MEMOIZED, SIX_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PSP_LOOKUP_TEMPLATES_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(string, wu, category, frame, filters, lexicon);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (string.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (wu.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (category.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (frame.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (filters.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && lexicon.equal(cached_args.first())) {
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
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(psp_lookup_templates_memoized_internal(string, wu, category, frame, filters, lexicon)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(string, wu, category, frame, filters, lexicon));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject psp_frame_type_from_context_alt(SubLObject edge, SubLObject category) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_type = NIL;
                if ((NIL != psp_genl_posP(category, $$Adjective, UNPROVIDED)) || (NIL != psp_genl_posP(category, $$Preposition, UNPROVIDED))) {
                    {
                        SubLObject current = edge;
                        SubLObject nowP = NIL;
                        if (NIL == frame_type) {
                            {
                                SubLObject csome_list_var = $psp_context$.getDynamicValue(thread);
                                SubLObject phrase = NIL;
                                for (phrase = csome_list_var.first(); !((NIL != frame_type) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , phrase = csome_list_var.first()) {
                                    if (NIL != psp_rules.psp_valid_constituent_typeP(psp_chart.get_psp_edge_category(phrase), list($$PhraseFn, category))) {
                                        nowP = T;
                                    } else {
                                        if (NIL != nowP) {
                                            {
                                                SubLObject rule_struct = psp_chart.psp_edge_rule_struct(phrase);
                                                SubLObject n = number_utilities.f_1X(position(current, psp_chart.psp_edge_dtrs(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                frame_type = psp_rules.psp_find_dtr_frame_type(rule_struct, n);
                                            }
                                        }
                                    }
                                    current = phrase;
                                }
                            }
                        }
                    }
                }
                return frame_type;
            }
        }
    }

    public static SubLObject psp_frame_type_from_context(final SubLObject edge, final SubLObject category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject frame_type = NIL;
        if ((NIL != psp_genl_posP(category, $$Adjective, UNPROVIDED)) || (NIL != psp_genl_posP(category, $$Preposition, UNPROVIDED))) {
            SubLObject current = edge;
            SubLObject nowP = NIL;
            if (NIL == frame_type) {
                SubLObject csome_list_var = $psp_context$.getDynamicValue(thread);
                SubLObject phrase = NIL;
                phrase = csome_list_var.first();
                while ((NIL == frame_type) && (NIL != csome_list_var)) {
                    if (NIL != psp_rules.psp_valid_constituent_typeP(psp_chart.get_psp_edge_category(phrase), list($$PhraseFn, category))) {
                        nowP = T;
                    } else
                        if (NIL != nowP) {
                            final SubLObject rule_struct = psp_chart.psp_edge_rule_struct(phrase);
                            final SubLObject n = number_utilities.f_1X(position(current, psp_chart.psp_edge_dtrs(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                            frame_type = psp_rules.psp_find_dtr_frame_type(rule_struct, n);
                        }

                    current = phrase;
                    csome_list_var = csome_list_var.rest();
                    phrase = csome_list_var.first();
                } 
            }
        }
        return frame_type;
    }

    public static final SubLObject psp_roles_for_denot_internal_alt(SubLObject denot) {
        return parsing_utilities.known_roles_for_denot(denot, UNPROVIDED);
    }

    public static SubLObject psp_roles_for_denot_internal(final SubLObject denot) {
        return parsing_utilities.known_roles_for_denot(denot, UNPROVIDED);
    }

    public static final SubLObject psp_roles_for_denot_alt(SubLObject denot) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return psp_roles_for_denot_internal(denot);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PSP_ROLES_FOR_DENOT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PSP_ROLES_FOR_DENOT, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, PSP_ROLES_FOR_DENOT, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, denot, $kw46$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw46$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_roles_for_denot_internal(denot)));
                        memoization_state.caching_state_put(caching_state, denot, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject psp_roles_for_denot(final SubLObject denot) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return psp_roles_for_denot_internal(denot);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PSP_ROLES_FOR_DENOT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PSP_ROLES_FOR_DENOT, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PSP_ROLES_FOR_DENOT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, denot, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_roles_for_denot_internal(denot)));
            memoization_state.caching_state_put(caching_state, denot, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject psp_devise_templates_alt(SubLObject edge, SubLObject category, SubLObject frames) {
        {
            SubLObject denots = psp_chart.psp_edge_lookup_semx(edge, $DENOT_GROUND);
            SubLObject word = psp_chart.get_psp_edge_wu(edge);
            return psp_devise_word_templates(word, category, denots, frames);
        }
    }

    public static SubLObject psp_devise_templates(final SubLObject edge, final SubLObject category, final SubLObject frames) {
        final SubLObject denots = psp_chart.psp_edge_lookup_semx(edge, $DENOT_GROUND);
        final SubLObject word = psp_chart.get_psp_edge_wu(edge);
        return psp_devise_word_templates(word, category, denots, frames);
    }

    public static final SubLObject psp_devise_word_templates_alt(SubLObject word, SubLObject category, SubLObject psp_cycls, SubLObject frames) {
        {
            SubLObject templates = NIL;
            if (NIL != psp_genl_posP(category, $$Verb, UNPROVIDED)) {
                {
                    SubLObject cdolist_list_var = psp_cycls;
                    SubLObject psp_cycl = NIL;
                    for (psp_cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , psp_cycl = cdolist_list_var.first()) {
                        templates = psp_devise_verb_templates(psp_cycl, frames);
                    }
                }
            } else {
                if (NIL != psp_genl_posP(category, $$Adjective, UNPROVIDED)) {
                    {
                        SubLObject cdolist_list_var = psp_cycls;
                        SubLObject psp_cycl = NIL;
                        for (psp_cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , psp_cycl = cdolist_list_var.first()) {
                            {
                                SubLObject denot = psp_cycl_cycl(psp_cycl);
                                SubLObject template_template = NIL;
                                if (NIL != isa.isa_in_any_mtP(denot, $$GeographicalRegion)) {
                                    template_template = $list_alt170;
                                } else {
                                    if (NIL != isa.isa_in_any_mtP(denot, $$Collection)) {
                                        template_template = $list_alt172;
                                    } else {
                                        if (NIL == isa.isa_in_any_mtP(denot, $$Relation)) {
                                            template_template = $list_alt174;
                                        }
                                    }
                                }
                                if (NIL != template_template) {
                                    templates = cons(psp_cycl_subst(psp_cycl, $REPLACE, template_template), templates);
                                }
                            }
                        }
                    }
                } else {
                    if (NIL != psp_genl_posP(category, $$Noun, UNPROVIDED)) {
                        return psp_devise_noun_templates(word, category, frames);
                    }
                }
            }
            return templates;
        }
    }

    public static SubLObject psp_devise_word_templates(final SubLObject word, final SubLObject category, final SubLObject psp_cycls, final SubLObject frames) {
        SubLObject templates = NIL;
        if (NIL != psp_genl_posP(category, $$Verb, UNPROVIDED)) {
            SubLObject cdolist_list_var = psp_cycls;
            SubLObject psp_cycl = NIL;
            psp_cycl = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                templates = psp_devise_verb_templates(psp_cycl, frames);
                cdolist_list_var = cdolist_list_var.rest();
                psp_cycl = cdolist_list_var.first();
            } 
        } else
            if (NIL != psp_genl_posP(category, $$Adjective, UNPROVIDED)) {
                SubLObject cdolist_list_var = psp_cycls;
                SubLObject psp_cycl = NIL;
                psp_cycl = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject denot = psp_cycl_cycl(psp_cycl);
                    SubLObject template_template = NIL;
                    if (NIL != isa.isa_in_any_mtP(denot, $$GeographicalRegion)) {
                        template_template = $list171;
                    } else
                        if (NIL != isa.isa_in_any_mtP(denot, $$Collection)) {
                            template_template = $list173;
                        } else
                            if (NIL == isa.isa_in_any_mtP(denot, $$Relation)) {
                                template_template = $list175;
                            }


                    if (NIL != template_template) {
                        templates = cons(psp_cycl_subst(psp_cycl, $REPLACE, template_template), templates);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    psp_cycl = cdolist_list_var.first();
                } 
            } else
                if (NIL != psp_genl_posP(category, $$Noun, UNPROVIDED)) {
                    return psp_devise_noun_templates(word, category, frames);
                }


        return templates;
    }

    /**
     *
     *
     * @param DENOT;
     * 		CycL expression.
     * @param FRAMES;
     * 		LISTP of instances of #$SubcategorizationFrame.
     * @unknown LISTP of CycL template expressions.
     */
    @LispMethod(comment = "@param DENOT;\r\n\t\tCycL expression.\r\n@param FRAMES;\r\n\t\tLISTP of instances of #$SubcategorizationFrame.\r\n@unknown LISTP of CycL template expressions.")
    public static final SubLObject psp_devise_verb_templates_alt(SubLObject denot, SubLObject frames) {
        {
            SubLObject templates = NIL;
            SubLObject roles = psp_roles_for_denot(denot);
            if (NIL != roles) {
                {
                    SubLObject cdolist_list_var = frames;
                    SubLObject frame = NIL;
                    for (frame = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , frame = cdolist_list_var.first()) {
                        {
                            SubLObject cdolist_list_var_39 = parsing_utilities.verb_semtrans_from_denot_rolesXframe(denot, roles, frame, UNPROVIDED);
                            SubLObject template = NIL;
                            for (template = cdolist_list_var_39.first(); NIL != cdolist_list_var_39; cdolist_list_var_39 = cdolist_list_var_39.rest() , template = cdolist_list_var_39.first()) {
                                templates = cons(template, templates);
                            }
                        }
                    }
                }
            }
            return templates;
        }
    }

    /**
     *
     *
     * @param DENOT;
     * 		CycL expression.
     * @param FRAMES;
     * 		LISTP of instances of #$SubcategorizationFrame.
     * @unknown LISTP of CycL template expressions.
     */
    @LispMethod(comment = "@param DENOT;\r\n\t\tCycL expression.\r\n@param FRAMES;\r\n\t\tLISTP of instances of #$SubcategorizationFrame.\r\n@unknown LISTP of CycL template expressions.")
    public static SubLObject psp_devise_verb_templates(final SubLObject denot, final SubLObject frames) {
        SubLObject templates = NIL;
        final SubLObject roles = psp_roles_for_denot(denot);
        if (NIL != roles) {
            SubLObject cdolist_list_var = frames;
            SubLObject frame = NIL;
            frame = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$40 = parsing_utilities.verb_semtrans_from_denot_rolesXframe(denot, roles, frame, UNPROVIDED);
                SubLObject template = NIL;
                template = cdolist_list_var_$40.first();
                while (NIL != cdolist_list_var_$40) {
                    templates = cons(template, templates);
                    cdolist_list_var_$40 = cdolist_list_var_$40.rest();
                    template = cdolist_list_var_$40.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                frame = cdolist_list_var.first();
            } 
        }
        return templates;
    }

    public static final SubLObject clear_psp_genl_posP_alt() {
        {
            SubLObject cs = $psp_genl_posP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_psp_genl_posP() {
        final SubLObject cs = $psp_genl_posP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_psp_genl_posP_alt(SubLObject pos1, SubLObject pos2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt(UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args($psp_genl_posP_caching_state$.getGlobalValue(), list(pos1, pos2, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_psp_genl_posP(final SubLObject pos1, final SubLObject pos2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt(UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args($psp_genl_posP_caching_state$.getGlobalValue(), list(pos1, pos2, mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject psp_genl_posP_internal_alt(SubLObject pos1, SubLObject pos2, SubLObject mt) {
        return lexicon_accessors.genl_posP(pos1, pos2, mt);
    }

    public static SubLObject psp_genl_posP_internal(final SubLObject pos1, final SubLObject pos2, final SubLObject mt) {
        return lexicon_accessors.genl_posP(pos1, pos2, mt);
    }

    public static final SubLObject psp_genl_posP_alt(SubLObject pos1, SubLObject pos2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt(UNPROVIDED);
        }
        {
            SubLObject caching_state = $psp_genl_posP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym175$PSP_GENL_POS_, $sym176$_PSP_GENL_POS__CACHING_STATE_, NIL, EQUAL, THREE_INTEGER, $int$32);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_3(pos1, pos2, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw46$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (pos1.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (pos2.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(psp_genl_posP_internal(pos1, pos2, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(pos1, pos2, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject psp_genl_posP(final SubLObject pos1, final SubLObject pos2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt(UNPROVIDED);
        }
        SubLObject caching_state = $psp_genl_posP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym176$PSP_GENL_POS_, $sym177$_PSP_GENL_POS__CACHING_STATE_, NIL, EQUAL, THREE_INTEGER, $int$32);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(pos1, pos2, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pos1.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pos2.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(psp_genl_posP_internal(pos1, pos2, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pos1, pos2, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject psp_devise_noun_templates_internal_alt(SubLObject word_unit, SubLObject category, SubLObject frames) {
        return (NIL != word_unit) && (NIL != psp_chart.deverbal_noun_posP(category)) ? ((SubLObject) (psp_devise_deverbal_noun_templates(word_unit, frames))) : NIL;
    }

    public static SubLObject psp_devise_noun_templates_internal(final SubLObject word_unit, final SubLObject category, final SubLObject frames) {
        return (NIL != word_unit) && (NIL != psp_chart.deverbal_noun_posP(category)) ? psp_devise_deverbal_noun_templates(word_unit, frames) : NIL;
    }

    public static final SubLObject psp_devise_noun_templates_alt(SubLObject word_unit, SubLObject category, SubLObject frames) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return psp_devise_noun_templates_internal(word_unit, category, frames);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PSP_DEVISE_NOUN_TEMPLATES, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PSP_DEVISE_NOUN_TEMPLATES, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, PSP_DEVISE_NOUN_TEMPLATES, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(word_unit, category, frames);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw46$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (word_unit.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (category.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && frames.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_devise_noun_templates_internal(word_unit, category, frames)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(word_unit, category, frames));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject psp_devise_noun_templates(final SubLObject word_unit, final SubLObject category, final SubLObject frames) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return psp_devise_noun_templates_internal(word_unit, category, frames);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PSP_DEVISE_NOUN_TEMPLATES, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PSP_DEVISE_NOUN_TEMPLATES, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PSP_DEVISE_NOUN_TEMPLATES, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(word_unit, category, frames);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (word_unit.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (category.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && frames.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(psp_devise_noun_templates_internal(word_unit, category, frames)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(word_unit, category, frames));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject psp_devise_deverbal_noun_templates_alt(SubLObject word_unit, SubLObject frames) {
        {
            SubLObject templates = NIL;
            SubLObject cdolist_list_var = frames;
            SubLObject frame = NIL;
            for (frame = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , frame = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_40 = psp_devise_deverbal_noun_template(word_unit, frame);
                    SubLObject template = NIL;
                    for (template = cdolist_list_var_40.first(); NIL != cdolist_list_var_40; cdolist_list_var_40 = cdolist_list_var_40.rest() , template = cdolist_list_var_40.first()) {
                        templates = cons(template, templates);
                    }
                }
            }
            return templates;
        }
    }

    public static SubLObject psp_devise_deverbal_noun_templates(final SubLObject word_unit, final SubLObject frames) {
        SubLObject templates = NIL;
        SubLObject cdolist_list_var = frames;
        SubLObject frame = NIL;
        frame = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$41 = psp_devise_deverbal_noun_template(word_unit, frame);
            SubLObject template = NIL;
            template = cdolist_list_var_$41.first();
            while (NIL != cdolist_list_var_$41) {
                templates = cons(template, templates);
                cdolist_list_var_$41 = cdolist_list_var_$41.rest();
                template = cdolist_list_var_$41.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            frame = cdolist_list_var.first();
        } 
        return templates;
    }

    public static final SubLObject psp_devise_deverbal_noun_template_internal_alt(SubLObject word_unit, SubLObject frame) {
        {
            SubLObject templates = NIL;
            if (function_terms.nart_to_naut(frame).equal($list_alt180)) {
                {
                    SubLObject cdolist_list_var = lexicon_accessors.semtrans_of_wuXpos(word_unit, $$Verb, $$TransitiveNPFrame);
                    SubLObject template = NIL;
                    for (template = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template = cdolist_list_var.first()) {
                        if (template.isCons()) {
                            {
                                SubLObject item_var = subst($NOUN, $ACTION, subst($OBLIQUE_OBJECT, $OBJECT, remove_if($sym183$PSP_SUBJECT_CLAUSE_, template, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                if (NIL == member(item_var, templates, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    templates = cons(item_var, templates);
                                }
                            }
                        }
                    }
                }
            }
            return templates;
        }
    }

    public static SubLObject psp_devise_deverbal_noun_template_internal(final SubLObject word_unit, final SubLObject frame) {
        SubLObject templates = NIL;
        if (function_terms.nart_to_naut(frame).equal($list181)) {
            SubLObject cdolist_list_var = lexicon_accessors.semtrans_of_wuXpos(word_unit, $$Verb, $$TransitiveNPFrame);
            SubLObject template = NIL;
            template = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (template.isCons()) {
                    final SubLObject item_var = subst($NOUN, $ACTION, subst($OBLIQUE_OBJECT, $OBJECT, remove_if($sym184$PSP_SUBJECT_CLAUSE_, template, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                    if (NIL == member(item_var, templates, symbol_function(EQL), symbol_function(IDENTITY))) {
                        templates = cons(item_var, templates);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                template = cdolist_list_var.first();
            } 
        }
        return templates;
    }

    public static final SubLObject psp_devise_deverbal_noun_template_alt(SubLObject word_unit, SubLObject frame) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return psp_devise_deverbal_noun_template_internal(word_unit, frame);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PSP_DEVISE_DEVERBAL_NOUN_TEMPLATE, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PSP_DEVISE_DEVERBAL_NOUN_TEMPLATE, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, PSP_DEVISE_DEVERBAL_NOUN_TEMPLATE, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(word_unit, frame);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw46$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (word_unit == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (frame == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_devise_deverbal_noun_template_internal(word_unit, frame)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(word_unit, frame));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject psp_devise_deverbal_noun_template(final SubLObject word_unit, final SubLObject frame) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return psp_devise_deverbal_noun_template_internal(word_unit, frame);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PSP_DEVISE_DEVERBAL_NOUN_TEMPLATE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PSP_DEVISE_DEVERBAL_NOUN_TEMPLATE, TWO_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PSP_DEVISE_DEVERBAL_NOUN_TEMPLATE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(word_unit, frame);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (word_unit.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && frame.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(psp_devise_deverbal_noun_template_internal(word_unit, frame)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(word_unit, frame));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject psp_passivize_templates_alt(SubLObject templates, SubLObject passive_frame) {
        {
            SubLObject output_templates = NIL;
            SubLObject active_frame = psp_chart.psp_active_frame(passive_frame);
            SubLObject type = psp_chart.psp_passive_frame_type(passive_frame);
            SubLObject p_dtr_key = psp_chart.psp_passivized_dtr_keyword(active_frame);
            SubLObject cdolist_list_var = templates;
            SubLObject template = NIL;
            for (template = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template = cdolist_list_var.first()) {
                {
                    SubLObject var = psp_passivize_template(template, type, p_dtr_key);
                    if (NIL != var) {
                        output_templates = cons(var, output_templates);
                    }
                }
            }
            return output_templates;
        }
    }

    public static SubLObject psp_passivize_templates(final SubLObject templates, final SubLObject passive_frame) {
        SubLObject output_templates = NIL;
        final SubLObject active_frame = psp_chart.psp_active_frame(passive_frame);
        final SubLObject type = psp_chart.psp_passive_frame_type(passive_frame);
        final SubLObject p_dtr_key = psp_chart.psp_passivized_dtr_keyword(active_frame);
        SubLObject cdolist_list_var = templates;
        SubLObject template = NIL;
        template = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject var = psp_passivize_template(template, type, p_dtr_key);
            if (NIL != var) {
                output_templates = cons(var, output_templates);
            }
            cdolist_list_var = cdolist_list_var.rest();
            template = cdolist_list_var.first();
        } 
        return output_templates;
    }

    public static final SubLObject psp_passivize_template_internal_alt(SubLObject template, SubLObject type, SubLObject p_dtr_key) {
        {
            SubLObject v_clauses = (NIL != el_conjunction_p(template)) ? ((SubLObject) (cycl_utilities.formula_args(template, UNPROVIDED))) : list(template);
            SubLObject subject_clauses = list_utilities.remove_if_not($sym183$PSP_SUBJECT_CLAUSE_, v_clauses, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (type == $PASSIVE_WITH_BY) {
                v_clauses = subst($BY_SUBJECT, $SUBJECT, v_clauses, UNPROVIDED, UNPROVIDED);
            } else {
                v_clauses = set_difference(v_clauses, subject_clauses, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != v_clauses) {
                template = psp_make_conjunction(v_clauses);
                template = subst($$TheActiveSubject, $SUBJECT, template, UNPROVIDED, UNPROVIDED);
                template = subst($SUBJECT, p_dtr_key, template, UNPROVIDED, UNPROVIDED);
                return template;
            }
        }
        return NIL;
    }

    public static SubLObject psp_passivize_template_internal(SubLObject template, final SubLObject type, final SubLObject p_dtr_key) {
        SubLObject v_clauses = (NIL != el_conjunction_p(template)) ? cycl_utilities.formula_args(template, UNPROVIDED) : list(template);
        final SubLObject subject_clauses = list_utilities.remove_if_not($sym184$PSP_SUBJECT_CLAUSE_, v_clauses, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (type == $PASSIVE_WITH_BY) {
            v_clauses = subst($BY_SUBJECT, $SUBJECT, v_clauses, UNPROVIDED, UNPROVIDED);
        } else {
            v_clauses = set_difference(v_clauses, subject_clauses, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != v_clauses) {
            template = psp_make_conjunction(v_clauses);
            template = subst($$TheActiveSubject, $SUBJECT, template, UNPROVIDED, UNPROVIDED);
            template = subst($SUBJECT, p_dtr_key, template, UNPROVIDED, UNPROVIDED);
            return template;
        }
        return NIL;
    }

    public static final SubLObject psp_passivize_template_alt(SubLObject template, SubLObject type, SubLObject p_dtr_key) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return psp_passivize_template_internal(template, type, p_dtr_key);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PSP_PASSIVIZE_TEMPLATE, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PSP_PASSIVIZE_TEMPLATE, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, PSP_PASSIVIZE_TEMPLATE, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(template, type, p_dtr_key);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw46$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (template.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (type.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && p_dtr_key.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_passivize_template_internal(template, type, p_dtr_key)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(template, type, p_dtr_key));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject psp_passivize_template(final SubLObject template, final SubLObject type, final SubLObject p_dtr_key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return psp_passivize_template_internal(template, type, p_dtr_key);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PSP_PASSIVIZE_TEMPLATE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PSP_PASSIVIZE_TEMPLATE, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PSP_PASSIVIZE_TEMPLATE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(template, type, p_dtr_key);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (template.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (type.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && p_dtr_key.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(psp_passivize_template_internal(template, type, p_dtr_key)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(template, type, p_dtr_key));
        return memoization_state.caching_results(results3);
    }

    /**
     * Add (existential) quantifiers to templates that need them.
     */
    @LispMethod(comment = "Add (existential) quantifiers to templates that need them.")
    public static final SubLObject psp_quantify_templates_alt(SubLObject templates) {
        {
            SubLObject output_templates = NIL;
            SubLObject cdolist_list_var = templates;
            SubLObject template = NIL;
            for (template = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template = cdolist_list_var.first()) {
                output_templates = cons(psp_quantify_template(template), output_templates);
            }
            return output_templates;
        }
    }

    @LispMethod(comment = "Add (existential) quantifiers to templates that need them.")
    public static SubLObject psp_quantify_templates(final SubLObject templates) {
        SubLObject output_templates = NIL;
        SubLObject cdolist_list_var = templates;
        SubLObject template = NIL;
        template = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            output_templates = cons(psp_quantify_template(template), output_templates);
            cdolist_list_var = cdolist_list_var.rest();
            template = cdolist_list_var.first();
        } 
        return output_templates;
    }/**
     * Add (existential) quantifiers to templates that need them.
     */


    public static final SubLObject psp_quantify_template_internal_alt(SubLObject template) {
        if (NIL != psp_quantifiable_template_p(template)) {
            {
                SubLObject cdolist_list_var = sentence_free_variables(template, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject var = NIL;
                for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                    {
                        SubLObject disjuncts = NIL;
                        SubLObject dnfs = psp_dnf_clausal_form(template);
                        SubLObject cdolist_list_var_41 = dnfs;
                        SubLObject dnf = NIL;
                        for (dnf = cdolist_list_var_41.first(); NIL != cdolist_list_var_41; cdolist_list_var_41 = cdolist_list_var_41.rest() , dnf = cdolist_list_var_41.first()) {
                            {
                                SubLObject conjuncts = NIL;
                                SubLObject scoped_conjuncts = NIL;
                                {
                                    SubLObject cdolist_list_var_42 = clauses.neg_lits(dnf);
                                    SubLObject neg_lit = NIL;
                                    for (neg_lit = cdolist_list_var_42.first(); NIL != cdolist_list_var_42; cdolist_list_var_42 = cdolist_list_var_42.rest() , neg_lit = cdolist_list_var_42.first()) {
                                        if (NIL != cycl_utilities.expression_find(var, neg_lit, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                            scoped_conjuncts = cons(make_negation(neg_lit), scoped_conjuncts);
                                        } else {
                                            conjuncts = cons(make_negation(neg_lit), conjuncts);
                                        }
                                    }
                                }
                                {
                                    SubLObject cdolist_list_var_43 = clauses.pos_lits(dnf);
                                    SubLObject pos_lit = NIL;
                                    for (pos_lit = cdolist_list_var_43.first(); NIL != cdolist_list_var_43; cdolist_list_var_43 = cdolist_list_var_43.rest() , pos_lit = cdolist_list_var_43.first()) {
                                        if (NIL != cycl_utilities.expression_find(var, pos_lit, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                            scoped_conjuncts = cons(pos_lit, scoped_conjuncts);
                                        } else {
                                            conjuncts = cons(pos_lit, conjuncts);
                                        }
                                    }
                                }
                                {
                                    SubLObject scoped_conjunction = psp_make_conjunction(scoped_conjuncts);
                                    SubLObject scoped_conjunct = psp_make_existential(var, scoped_conjunction);
                                    disjuncts = cons(psp_make_conjunction(cons(scoped_conjunct, conjuncts)), disjuncts);
                                }
                            }
                        }
                        template = psp_make_disjunction(disjuncts);
                    }
                }
            }
        }
        return template;
    }

    public static SubLObject psp_quantify_template_internal(SubLObject template) {
        if (NIL != psp_quantifiable_template_p(template)) {
            SubLObject cdolist_list_var = sentence_free_variables(template, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject var = NIL;
            var = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject disjuncts = NIL;
                SubLObject cdolist_list_var_$42;
                final SubLObject dnfs = cdolist_list_var_$42 = psp_dnf_clausal_form(template);
                SubLObject dnf = NIL;
                dnf = cdolist_list_var_$42.first();
                while (NIL != cdolist_list_var_$42) {
                    SubLObject conjuncts = NIL;
                    SubLObject scoped_conjuncts = NIL;
                    SubLObject cdolist_list_var_$43 = clauses.neg_lits(dnf);
                    SubLObject neg_lit = NIL;
                    neg_lit = cdolist_list_var_$43.first();
                    while (NIL != cdolist_list_var_$43) {
                        if (NIL != cycl_utilities.expression_find(var, neg_lit, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            scoped_conjuncts = cons(make_negation(neg_lit), scoped_conjuncts);
                        } else {
                            conjuncts = cons(make_negation(neg_lit), conjuncts);
                        }
                        cdolist_list_var_$43 = cdolist_list_var_$43.rest();
                        neg_lit = cdolist_list_var_$43.first();
                    } 
                    SubLObject cdolist_list_var_$44 = clauses.pos_lits(dnf);
                    SubLObject pos_lit = NIL;
                    pos_lit = cdolist_list_var_$44.first();
                    while (NIL != cdolist_list_var_$44) {
                        if (NIL != cycl_utilities.expression_find(var, pos_lit, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            scoped_conjuncts = cons(pos_lit, scoped_conjuncts);
                        } else {
                            conjuncts = cons(pos_lit, conjuncts);
                        }
                        cdolist_list_var_$44 = cdolist_list_var_$44.rest();
                        pos_lit = cdolist_list_var_$44.first();
                    } 
                    final SubLObject scoped_conjunction = psp_make_conjunction(scoped_conjuncts);
                    final SubLObject scoped_conjunct = psp_make_existential(var, scoped_conjunction);
                    disjuncts = cons(psp_make_conjunction(cons(scoped_conjunct, conjuncts)), disjuncts);
                    cdolist_list_var_$42 = cdolist_list_var_$42.rest();
                    dnf = cdolist_list_var_$42.first();
                } 
                template = psp_make_disjunction(disjuncts);
                cdolist_list_var = cdolist_list_var.rest();
                var = cdolist_list_var.first();
            } 
        }
        return template;
    }

    public static final SubLObject psp_quantify_template_alt(SubLObject template) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return psp_quantify_template_internal(template);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PSP_QUANTIFY_TEMPLATE, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PSP_QUANTIFY_TEMPLATE, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, PSP_QUANTIFY_TEMPLATE, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, template, $kw46$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw46$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_quantify_template_internal(template)));
                        memoization_state.caching_state_put(caching_state, template, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject psp_quantify_template(final SubLObject template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return psp_quantify_template_internal(template);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PSP_QUANTIFY_TEMPLATE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PSP_QUANTIFY_TEMPLATE, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PSP_QUANTIFY_TEMPLATE, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, template, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_quantify_template_internal(template)));
            memoization_state.caching_state_put(caching_state, template, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject psp_quantifiable_template_p_alt(SubLObject template) {
        return makeBoolean(((NIL != atomic_sentenceP(template)) || (NIL != el_conjunction_p(template))) || (NIL != el_existential_p(template)));
    }

    public static SubLObject psp_quantifiable_template_p(final SubLObject template) {
        return makeBoolean(((NIL != atomic_sentenceP(template)) || (NIL != el_conjunction_p(template))) || (NIL != el_existential_p(template)));
    }

    public static final SubLObject psp_make_conjunction_alt(SubLObject conjuncts) {
        {
            SubLObject pcase_var = length(conjuncts);
            if (pcase_var.eql(ZERO_INTEGER)) {
                Errors.warn($str_alt190$__PSP_MAKE_CONJUNCTION_passed_NIL);
            } else {
                if (pcase_var.eql(ONE_INTEGER)) {
                    return conjuncts.first();
                } else {
                    return make_conjunction(conjuncts);
                }
            }
        }
        return NIL;
    }

    public static SubLObject psp_make_conjunction(final SubLObject conjuncts) {
        final SubLObject pcase_var = length(conjuncts);
        if (pcase_var.eql(ZERO_INTEGER)) {
            Errors.warn($str191$__PSP_MAKE_CONJUNCTION_passed_NIL);
            return NIL;
        }
        if (pcase_var.eql(ONE_INTEGER)) {
            return conjuncts.first();
        }
        return make_conjunction(conjuncts);
    }

    public static final SubLObject psp_make_disjunction_alt(SubLObject disjuncts) {
        {
            SubLObject pcase_var = length(disjuncts);
            if (pcase_var.eql(ZERO_INTEGER)) {
                Errors.warn($str_alt191$__PSP_MAKE_DISJUNCTION_passed_NIL);
            } else {
                if (pcase_var.eql(ONE_INTEGER)) {
                    return disjuncts.first();
                } else {
                    return make_disjunction(disjuncts);
                }
            }
        }
        return NIL;
    }

    public static SubLObject psp_make_disjunction(final SubLObject disjuncts) {
        final SubLObject pcase_var = length(disjuncts);
        if (pcase_var.eql(ZERO_INTEGER)) {
            Errors.warn($str192$__PSP_MAKE_DISJUNCTION_passed_NIL);
            return NIL;
        }
        if (pcase_var.eql(ONE_INTEGER)) {
            return disjuncts.first();
        }
        return make_disjunction(disjuncts);
    }

    public static final SubLObject psp_make_existential_alt(SubLObject var, SubLObject formula) {
        if (NIL != psp_davidsonian_clause_p(formula, UNPROVIDED)) {
            {
                SubLObject head = cycl_utilities.formula_arg1(formula, UNPROVIDED);
                SubLObject prop = cycl_utilities.formula_arg1(cycl_utilities.formula_arg2(formula, UNPROVIDED), UNPROVIDED);
                return psp_make_davidsonian_clause(head, make_existential(var, prop));
            }
        } else {
            return make_existential(var, formula);
        }
    }

    public static SubLObject psp_make_existential(final SubLObject var, final SubLObject formula) {
        if (NIL != psp_davidsonian_clause_p(formula, UNPROVIDED)) {
            final SubLObject head = cycl_utilities.formula_arg1(formula, UNPROVIDED);
            final SubLObject prop = cycl_utilities.formula_arg1(cycl_utilities.formula_arg2(formula, UNPROVIDED), UNPROVIDED);
            return psp_make_davidsonian_clause(head, make_existential(var, prop));
        }
        return make_existential(var, formula);
    }

    /**
     * Add :ACTION clauses to verb templates that lack them.
     * Aka davidsonianization.
     */
    @LispMethod(comment = "Add :ACTION clauses to verb templates that lack them.\r\nAka davidsonianization.\nAdd :ACTION clauses to verb templates that lack them.\nAka davidsonianization.")
    public static final SubLObject psp_davidsonianize_verb_templates_alt(SubLObject templates, SubLObject category) {
        if (NIL == psp_rules.psp_valid_constituent_typeP(category, $$Verb)) {
            return templates;
        }
        {
            SubLObject output_templates = NIL;
            SubLObject cdolist_list_var = templates;
            SubLObject template = NIL;
            for (template = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template = cdolist_list_var.first()) {
                output_templates = cons(psp_davidsonianize_verb_template(template), output_templates);
            }
            return output_templates;
        }
    }

    @LispMethod(comment = "Add :ACTION clauses to verb templates that lack them.\r\nAka davidsonianization.\nAdd :ACTION clauses to verb templates that lack them.\nAka davidsonianization.")
    public static SubLObject psp_davidsonianize_verb_templates(final SubLObject templates, final SubLObject category) {
        if (NIL == psp_rules.psp_valid_constituent_typeP(category, $$Verb)) {
            return templates;
        }
        SubLObject output_templates = NIL;
        SubLObject cdolist_list_var = templates;
        SubLObject template = NIL;
        template = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            output_templates = cons(psp_davidsonianize_verb_template(template), output_templates);
            cdolist_list_var = cdolist_list_var.rest();
            template = cdolist_list_var.first();
        } 
        return output_templates;
    }/**
     * Add :ACTION clauses to verb templates that lack them.
     * Aka davidsonianization.
     */


    public static final SubLObject psp_davidsonianize_verb_template_internal_alt(SubLObject template) {
        if (NIL != psp_contains_isa_clauseP(template, $ACTION)) {
            return template;
        } else {
            if (NIL != cycl_utilities.expression_find($ACTION, template, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                {
                    SubLObject action_type = psp_action_type(template);
                    return simplifier.conjoin(list(make_binary_formula($$isa, $ACTION, action_type), template), T);
                }
            } else {
                return psp_make_davidsonian_clause($ACTION, template);
            }
        }
    }

    public static SubLObject psp_davidsonianize_verb_template_internal(final SubLObject template) {
        if (NIL != psp_contains_isa_clauseP(template, $ACTION)) {
            return template;
        }
        if (NIL != cycl_utilities.expression_find($ACTION, template, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            final SubLObject action_type = psp_action_type(template);
            return simplifier.conjoin(list(make_binary_formula($$isa, $ACTION, action_type), template), T);
        }
        return psp_make_davidsonian_clause($ACTION, template);
    }

    public static final SubLObject psp_davidsonianize_verb_template_alt(SubLObject template) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return psp_davidsonianize_verb_template_internal(template);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PSP_DAVIDSONIANIZE_VERB_TEMPLATE, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PSP_DAVIDSONIANIZE_VERB_TEMPLATE, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, PSP_DAVIDSONIANIZE_VERB_TEMPLATE, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, template, $kw46$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw46$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_davidsonianize_verb_template_internal(template)));
                        memoization_state.caching_state_put(caching_state, template, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject psp_davidsonianize_verb_template(final SubLObject template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return psp_davidsonianize_verb_template_internal(template);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PSP_DAVIDSONIANIZE_VERB_TEMPLATE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PSP_DAVIDSONIANIZE_VERB_TEMPLATE, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PSP_DAVIDSONIANIZE_VERB_TEMPLATE, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, template, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_davidsonianize_verb_template_internal(template)));
            memoization_state.caching_state_put(caching_state, template, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     *
     *
     * @return COLLECTION-P; type that :ACTION is constrained to be an instance of in TEMPLATE
     */
    @LispMethod(comment = "@return COLLECTION-P; type that :ACTION is constrained to be an instance of in TEMPLATE")
    public static final SubLObject psp_action_type_alt(SubLObject template) {
        {
            SubLObject action_type = $$Thing;
            SubLObject raw_constraint = rbp_wff.rbp_formula_variable_isa_constraints(template, $ACTION).first();
            if (NIL != raw_constraint) {
                {
                    SubLObject datum = raw_constraint;
                    SubLObject current = datum;
                    SubLObject type = NIL;
                    SubLObject target = NIL;
                    SubLObject constraint_mt = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt193);
                    type = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt193);
                    target = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt193);
                    constraint_mt = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject pcase_var = type;
                            if (pcase_var.eql($ISA)) {
                                action_type = target;
                            } else {
                                if (pcase_var.eql($GENL) || pcase_var.eql($NOT_DISJOINT)) {
                                    action_type = make_unary_formula($$SpecsFn, target);
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt193);
                    }
                }
            }
            return action_type;
        }
    }

    /**
     *
     *
     * @return COLLECTION-P; type that :ACTION is constrained to be an instance of in TEMPLATE
     */
    @LispMethod(comment = "@return COLLECTION-P; type that :ACTION is constrained to be an instance of in TEMPLATE")
    public static SubLObject psp_action_type(final SubLObject template) {
        SubLObject action_type = $$Thing;
        final SubLObject raw_constraint = rbp_wff.rbp_formula_variable_isa_constraints(template, $ACTION).first();
        if (NIL != raw_constraint) {
            SubLObject current;
            final SubLObject datum = current = raw_constraint;
            SubLObject type = NIL;
            SubLObject target = NIL;
            SubLObject constraint_mt = NIL;
            destructuring_bind_must_consp(current, datum, $list194);
            type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list194);
            target = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list194);
            constraint_mt = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pcase_var = type;
                if (pcase_var.eql($ISA)) {
                    action_type = target;
                } else
                    if (pcase_var.eql($GENL) || pcase_var.eql($NOT_DISJOINT)) {
                        action_type = make_unary_formula($$SpecsFn, target);
                    }

            } else {
                cdestructuring_bind_error(datum, $list194);
            }
        }
        return action_type;
    }

    public static final SubLObject psp_contains_isa_clauseP_alt(SubLObject formula, SubLObject target) {
        {
            SubLObject ans = NIL;
            SubLObject v_clauses = (NIL != el_conjunction_p(formula)) ? ((SubLObject) (cycl_utilities.formula_args(formula, UNPROVIDED))) : list(formula);
            if (NIL == ans) {
                {
                    SubLObject csome_list_var = v_clauses;
                    SubLObject clause = NIL;
                    for (clause = csome_list_var.first(); !((NIL != ans) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , clause = csome_list_var.first()) {
                        ans = makeBoolean(clause.isCons() && butlast(clause, UNPROVIDED).equal(list($$isa, target)));
                    }
                }
            }
            return ans;
        }
    }

    public static SubLObject psp_contains_isa_clauseP(final SubLObject formula, final SubLObject target) {
        SubLObject ans = NIL;
        final SubLObject v_clauses = (NIL != el_conjunction_p(formula)) ? cycl_utilities.formula_args(formula, UNPROVIDED) : list(formula);
        if (NIL == ans) {
            SubLObject csome_list_var;
            SubLObject clause;
            for (csome_list_var = v_clauses, clause = NIL, clause = csome_list_var.first(); (NIL == ans) && (NIL != csome_list_var); ans = makeBoolean(clause.isCons() && butlast(clause, UNPROVIDED).equal(list($$isa, target))) , csome_list_var = csome_list_var.rest() , clause = csome_list_var.first()) {
            }
        }
        return ans;
    }

    /**
     *
     *
     * @return BOOLEAN; Is TEMPLATE an acceptable one for CATEGORY?
     */
    @LispMethod(comment = "@return BOOLEAN; Is TEMPLATE an acceptable one for CATEGORY?")
    public static final SubLObject psp_ok_templateP_alt(SubLObject template, SubLObject category, SubLObject frame) {
        if (frame == UNPROVIDED) {
            frame = $UNSPECIFIED;
        }
        return makeBoolean((NIL != psp_no_isa_clause_neededP(category)) || (NIL != psp_ok_templateP_int(template, category, frame)));
    }

    /**
     *
     *
     * @return BOOLEAN; Is TEMPLATE an acceptable one for CATEGORY?
     */
    @LispMethod(comment = "@return BOOLEAN; Is TEMPLATE an acceptable one for CATEGORY?")
    public static SubLObject psp_ok_templateP(final SubLObject template, final SubLObject category, SubLObject frame) {
        if (frame == UNPROVIDED) {
            frame = $UNSPECIFIED;
        }
        return makeBoolean((NIL != psp_no_isa_clause_neededP(category)) || (NIL != psp_ok_templateP_int(template, category, frame)));
    }

    public static final SubLObject psp_ok_templateP_int_internal_alt(SubLObject template, SubLObject category, SubLObject frame) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject head_key = psp_head_key_for_category(category, frame);
                SubLObject okP = psp_contains_isa_clauseP(template, head_key);
                if (!((NIL != okP) || (NIL == parsing_vars.$psp_verboseP$.getDynamicValue(thread)))) {
                    Errors.warn($str_alt199$Non_canonical_semtrans_template__, head_key, template);
                }
                return okP;
            }
        }
    }

    public static SubLObject psp_ok_templateP_int_internal(final SubLObject template, final SubLObject category, final SubLObject frame) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject head_key = psp_head_key_for_category(category, frame);
        final SubLObject okP = psp_contains_isa_clauseP(template, head_key);
        if ((NIL == okP) && (NIL != parsing_vars.$psp_verboseP$.getDynamicValue(thread))) {
            Errors.warn($str200$Non_canonical_semtrans_template__, head_key, template);
        }
        return okP;
    }

    public static final SubLObject psp_ok_templateP_int_alt(SubLObject template, SubLObject category, SubLObject frame) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return psp_ok_templateP_int_internal(template, category, frame);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym198$PSP_OK_TEMPLATE__INT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym198$PSP_OK_TEMPLATE__INT, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym198$PSP_OK_TEMPLATE__INT, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(template, category, frame);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw46$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (template.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (category.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && frame.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_ok_templateP_int_internal(template, category, frame)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(template, category, frame));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject psp_ok_templateP_int(final SubLObject template, final SubLObject category, final SubLObject frame) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return psp_ok_templateP_int_internal(template, category, frame);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym199$PSP_OK_TEMPLATE__INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym199$PSP_OK_TEMPLATE__INT, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym199$PSP_OK_TEMPLATE__INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(template, category, frame);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (template.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (category.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && frame.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(psp_ok_templateP_int_internal(template, category, frame)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(template, category, frame));
        return memoization_state.caching_results(results3);
    }

    /**
     *
     *
     * @return BOOLEAN; Is CATEGORY such that a semtrans template for it
    need not have an #$isa clause for the head keyword?
     */
    @LispMethod(comment = "@return BOOLEAN; Is CATEGORY such that a semtrans template for it\r\nneed not have an #$isa clause for the head keyword?")
    public static final SubLObject psp_no_isa_clause_neededP_alt(SubLObject category) {
        return makeBoolean(NIL == subl_promotions.memberP(category, $list_alt200, UNPROVIDED, UNPROVIDED));
    }

    /**
     *
     *
     * @return BOOLEAN; Is CATEGORY such that a semtrans template for it
    need not have an #$isa clause for the head keyword?
     */
    @LispMethod(comment = "@return BOOLEAN; Is CATEGORY such that a semtrans template for it\r\nneed not have an #$isa clause for the head keyword?")
    public static SubLObject psp_no_isa_clause_neededP(final SubLObject category) {
        return makeBoolean(NIL == subl_promotions.memberP(category, $list201, UNPROVIDED, UNPROVIDED));
    }

    /**
     *
     *
     * @return LISTP of CycL expressions with NL tags.
     */
    @LispMethod(comment = "@return LISTP of CycL expressions with NL tags.")
    public static final SubLObject psp_add_nl_tags_alt(SubLObject semx, SubLObject edge) {
        {
            SubLObject category = psp_chart.get_psp_edge_category(edge);
            SubLObject rule_fort = psp_chart.psp_edge_rule_fort(edge);
            if (NIL != member(rule_fort, $list_alt201, UNPROVIDED, UNPROVIDED)) {
                return semx;
            } else {
                if ((NIL != lexicon_accessors.npP(category)) && (NIL != lexicon_vars.name_or_term_strings_predP(psp_chart.get_psp_edge_pos_pred(edge)))) {
                    return psp_add_name_tags(copy_psp_cycls(semx), edge);
                } else {
                    if (rule_fort == $$PSRule_GerundNPFromVbar) {
                        return psp_add_np_tags(psp_add_nbar_tags(copy_psp_cycls(semx), edge), edge);
                    } else {
                        if (NIL != lexicon_accessors.nbarP(category)) {
                            return psp_add_nbar_tags(copy_psp_cycls(semx), edge);
                        } else {
                            if (NIL != lexicon_accessors.npP(category)) {
                                return psp_add_np_tags(copy_psp_cycls(semx), edge);
                            } else {
                                return semx;
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return LISTP of CycL expressions with NL tags.
     */
    @LispMethod(comment = "@return LISTP of CycL expressions with NL tags.")
    public static SubLObject psp_add_nl_tags(final SubLObject semx, final SubLObject edge) {
        final SubLObject category = psp_chart.get_psp_edge_category(edge);
        final SubLObject rule_fort = psp_chart.psp_edge_rule_fort(edge);
        if (NIL != member(rule_fort, $list202, UNPROVIDED, UNPROVIDED)) {
            return semx;
        }
        if ((NIL != lexicon_accessors.npP(category)) && (NIL != lexicon_vars.name_or_term_strings_predP(psp_chart.get_psp_edge_pos_pred(edge)))) {
            return psp_add_name_tags(copy_psp_cycls(semx), edge);
        }
        if (rule_fort.eql($$PSRule_GerundNPFromVbar)) {
            return psp_add_np_tags(psp_add_nbar_tags(copy_psp_cycls(semx), edge), edge);
        }
        if (NIL != lexicon_accessors.nbarP(category)) {
            return psp_add_nbar_tags(copy_psp_cycls(semx), edge);
        }
        if (NIL != lexicon_accessors.npP(category)) {
            return psp_add_np_tags(copy_psp_cycls(semx), edge);
        }
        return semx;
    }

    public static final SubLObject psp_add_name_tags_alt(SubLObject psp_cycls, SubLObject edge) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject start_index = psp_chart.psp_edge_start_index(edge);
                SubLObject cdolist_list_var = psp_cycls;
                SubLObject psp_cycl = NIL;
                for (psp_cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , psp_cycl = cdolist_list_var.first()) {
                    {
                        SubLObject cycl = psp_cycl_cycl(psp_cycl);
                        SubLObject tagged_cycl = (NIL != parsing_vars.$use_ternary_np_tagsP$.getDynamicValue(thread)) ? ((SubLObject) (list($$NLQuantFn_3, $$ProperName_NLAttr, cycl, start_index))) : list($$NLQuantFn, $$ProperName_NLAttr, cycl);
                        if (NIL != psp_weighted_cycl_p(psp_cycl)) {
                            psp_weighted_cycl_set_cycl(psp_cycl, tagged_cycl);
                            tagged_cycl = psp_cycl;
                        }
                        ans = cons(tagged_cycl, ans);
                        psp_parse_tree_generator.psp_note_semantic_dependency(edge, tagged_cycl, edge, cycl);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject psp_add_name_tags(final SubLObject psp_cycls, final SubLObject edge) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject start_index = psp_chart.psp_edge_start_index(edge);
        SubLObject cdolist_list_var = psp_cycls;
        SubLObject psp_cycl = NIL;
        psp_cycl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject cycl = psp_cycl_cycl(psp_cycl);
            SubLObject tagged_cycl = (NIL != parsing_vars.$use_ternary_np_tagsP$.getDynamicValue(thread)) ? list($$NLQuantFn_3, $$ProperName_NLAttr, cycl, start_index) : list($$NLQuantFn, $$ProperName_NLAttr, cycl);
            if (NIL != psp_weighted_cycl_p(psp_cycl)) {
                psp_weighted_cycl_set_cycl(psp_cycl, tagged_cycl);
                tagged_cycl = psp_cycl;
            }
            ans = cons(tagged_cycl, ans);
            psp_parse_tree_generator.psp_note_semantic_dependency(edge, tagged_cycl, edge, cycl);
            cdolist_list_var = cdolist_list_var.rest();
            psp_cycl = cdolist_list_var.first();
        } 
        return ans;
    }

    public static final SubLObject psp_add_nbar_tags_alt(SubLObject psp_cycls, SubLObject edge) {
        {
            SubLObject pred = psp_chart.get_psp_edge_pos_pred(edge);
            SubLObject ans = NIL;
            if (NIL != lexicon_vars.name_string_predP(pred)) {
                pred = psp_guess_agr_pred(psp_chart.get_psp_edge_string(edge));
            }
            {
                SubLObject cdolist_list_var = psp_cycls;
                SubLObject psp_cycl = NIL;
                for (psp_cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , psp_cycl = cdolist_list_var.first()) {
                    {
                        SubLObject cycl = psp_cycl_cycl(psp_cycl);
                        SubLObject tagged_cycl = parsing_utilities.add_nl_number_wrapper(cycl, pred);
                        if (NIL != psp_weighted_cycl_p(psp_cycl)) {
                            psp_weighted_cycl_set_cycl(psp_cycl, tagged_cycl);
                            tagged_cycl = psp_cycl;
                        }
                        ans = cons(tagged_cycl, ans);
                        psp_parse_tree_generator.psp_note_semantic_dependency(edge, tagged_cycl, edge, cycl);
                    }
                }
            }
            return ans;
        }
    }

    public static SubLObject psp_add_nbar_tags(final SubLObject psp_cycls, final SubLObject edge) {
        SubLObject pred = psp_chart.get_psp_edge_pos_pred(edge);
        SubLObject ans = NIL;
        if (NIL != lexicon_vars.name_string_predP(pred)) {
            pred = psp_guess_agr_pred(psp_chart.get_psp_edge_string(edge));
        }
        SubLObject cdolist_list_var = psp_cycls;
        SubLObject psp_cycl = NIL;
        psp_cycl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject cycl = psp_cycl_cycl(psp_cycl);
            SubLObject tagged_cycl = parsing_utilities.add_nl_number_wrapper(cycl, pred);
            if (NIL != psp_weighted_cycl_p(psp_cycl)) {
                psp_weighted_cycl_set_cycl(psp_cycl, tagged_cycl);
                tagged_cycl = psp_cycl;
            }
            ans = cons(tagged_cycl, ans);
            psp_parse_tree_generator.psp_note_semantic_dependency(edge, tagged_cycl, edge, cycl);
            cdolist_list_var = cdolist_list_var.rest();
            psp_cycl = cdolist_list_var.first();
        } 
        return ans;
    }

    public static final SubLObject psp_guess_agr_pred_alt(SubLObject string) {
        if (NIL != morphology.plural_nounP(string)) {
            return $$plural_Generic;
        } else {
            return $$singular_Generic;
        }
    }

    public static SubLObject psp_guess_agr_pred(final SubLObject string) {
        if (NIL != morphology.plural_nounP(string)) {
            return $$plural_Generic;
        }
        return $$singular_Generic;
    }

    public static final SubLObject psp_add_np_tags_alt(SubLObject psp_cycls, SubLObject edge) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != psp_chart.psp_gap_edge_p(edge)) {
                return psp_cycls;
            }
            {
                SubLObject start_index = psp_chart.psp_edge_start_index(edge);
                SubLObject left_dtr = psp_chart.psp_edge_nth_dtr(ONE_INTEGER, edge);
                SubLObject det_cycls = NIL;
                SubLObject det_head_category = NIL;
                SubLObject det_head_string = $str_alt207$;
                SubLObject det_string = $str_alt207$;
                SubLObject ans = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_utilities.psp_lexicon_root_mt(UNPROVIDED));
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if (NIL != psp_chart.psp_edge_starts_with_detpP(edge)) {
                            det_string = psp_chart.get_psp_edge_string(left_dtr);
                            det_cycls = psp_cycls_to_cycls(psp_semantics_for_edge_int(left_dtr, $DENOT_GROUND));
                            det_head_category = psp_chart.get_psp_edge_category(psp_chart.psp_edge_lexical_head_dtr(left_dtr));
                            det_head_string = psp_chart.get_psp_edge_string(psp_chart.psp_edge_lexical_head_dtr(left_dtr));
                        }
                        {
                            SubLObject cdolist_list_var = psp_cycls;
                            SubLObject psp_cycl = NIL;
                            for (psp_cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , psp_cycl = cdolist_list_var.first()) {
                                {
                                    SubLObject cycl = psp_cycl_cycl(psp_cycl);
                                    SubLObject cdolist_list_var_44 = parsing_utilities.add_nl_def_wrapper(cycl, det_string, det_head_category, det_cycls, start_index);
                                    SubLObject def_tagged_cycl = NIL;
                                    for (def_tagged_cycl = cdolist_list_var_44.first(); NIL != cdolist_list_var_44; cdolist_list_var_44 = cdolist_list_var_44.rest() , def_tagged_cycl = cdolist_list_var_44.first()) {
                                        {
                                            SubLObject cdolist_list_var_45 = parsing_utilities.add_nl_quant_wrapper(def_tagged_cycl, det_head_string, det_cycls, start_index);
                                            SubLObject tagged_cycl = NIL;
                                            for (tagged_cycl = cdolist_list_var_45.first(); NIL != cdolist_list_var_45; cdolist_list_var_45 = cdolist_list_var_45.rest() , tagged_cycl = cdolist_list_var_45.first()) {
                                                if ((NIL != el_formula_p(tagged_cycl)) && ((NIL == el_formula_p(cycl)) || (NIL != psp_nl_tag_addedP(tagged_cycl, cycl)))) {
                                                    if (NIL != psp_weighted_cycl_p(psp_cycl)) {
                                                        psp_weighted_cycl_set_cycl(psp_cycl, tagged_cycl);
                                                        tagged_cycl = psp_cycl;
                                                    }
                                                    ans = cons(tagged_cycl, ans);
                                                    psp_parse_tree_generator.psp_note_semantic_dependency(edge, tagged_cycl, edge, cycl);
                                                }
                                                psp_parse_tree_generator.psp_note_semantic_dependency(edge, tagged_cycl, edge, cycl);
                                            }
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
                return ans;
            }
        }
    }

    public static SubLObject psp_add_np_tags(final SubLObject psp_cycls, final SubLObject edge) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != psp_chart.psp_gap_edge_p(edge)) {
            return psp_cycls;
        }
        final SubLObject start_index = psp_chart.psp_edge_start_index(edge);
        final SubLObject left_dtr = psp_chart.psp_edge_nth_dtr(ONE_INTEGER, edge);
        SubLObject det_cycls = NIL;
        SubLObject det_head_category = NIL;
        SubLObject det_head_string = $str208$;
        SubLObject det_string = $str208$;
        SubLObject ans = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_utilities.psp_lexicon_root_mt(UNPROVIDED));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != psp_chart.psp_edge_starts_with_detpP(edge)) {
                det_string = psp_chart.get_psp_edge_string(left_dtr);
                det_cycls = psp_cycls_to_cycls(psp_semantics_for_edge_int(left_dtr, $DENOT_GROUND));
                det_head_category = psp_chart.get_psp_edge_category(psp_chart.psp_edge_lexical_head_dtr(left_dtr));
                det_head_string = psp_chart.get_psp_edge_string(psp_chart.psp_edge_lexical_head_dtr(left_dtr));
            }
            SubLObject cdolist_list_var = psp_cycls;
            SubLObject psp_cycl = NIL;
            psp_cycl = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject cycl = psp_cycl_cycl(psp_cycl);
                SubLObject cdolist_list_var_$45 = parsing_utilities.add_nl_def_wrapper(cycl, det_string, det_head_category, det_cycls, start_index);
                SubLObject def_tagged_cycl = NIL;
                def_tagged_cycl = cdolist_list_var_$45.first();
                while (NIL != cdolist_list_var_$45) {
                    SubLObject cdolist_list_var_$46 = parsing_utilities.add_nl_quant_wrapper(def_tagged_cycl, det_head_string, det_cycls, start_index);
                    SubLObject tagged_cycl = NIL;
                    tagged_cycl = cdolist_list_var_$46.first();
                    while (NIL != cdolist_list_var_$46) {
                        if ((NIL != el_formula_p(tagged_cycl)) && ((NIL == el_formula_p(cycl)) || (NIL != psp_nl_tag_addedP(tagged_cycl, cycl)))) {
                            if (NIL != psp_weighted_cycl_p(psp_cycl)) {
                                psp_weighted_cycl_set_cycl(psp_cycl, tagged_cycl);
                                tagged_cycl = psp_cycl;
                            }
                            ans = cons(tagged_cycl, ans);
                            psp_parse_tree_generator.psp_note_semantic_dependency(edge, tagged_cycl, edge, cycl);
                        }
                        psp_parse_tree_generator.psp_note_semantic_dependency(edge, tagged_cycl, edge, cycl);
                        cdolist_list_var_$46 = cdolist_list_var_$46.rest();
                        tagged_cycl = cdolist_list_var_$46.first();
                    } 
                    cdolist_list_var_$45 = cdolist_list_var_$45.rest();
                    def_tagged_cycl = cdolist_list_var_$45.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                psp_cycl = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    /**
     *
     *
     * @return BOOLEANP; Has an NL tag been added to CYCL to produce TAGGED-CYCL?
     */
    @LispMethod(comment = "@return BOOLEANP; Has an NL tag been added to CYCL to produce TAGGED-CYCL?")
    public static final SubLObject psp_nl_tag_addedP_alt(SubLObject tagged_cycl, SubLObject cycl) {
        {
            SubLObject tag_fn = cycl_utilities.formula_arg0(tagged_cycl);
            return makeBoolean((NIL != parsing_utilities.nl_tag_fnP(tag_fn, UNPROVIDED)) && (!tag_fn.eql(cycl_utilities.formula_arg0(cycl))));
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Has an NL tag been added to CYCL to produce TAGGED-CYCL?
     */
    @LispMethod(comment = "@return BOOLEANP; Has an NL tag been added to CYCL to produce TAGGED-CYCL?")
    public static SubLObject psp_nl_tag_addedP(final SubLObject tagged_cycl, final SubLObject cycl) {
        final SubLObject tag_fn = cycl_utilities.formula_arg0(tagged_cycl);
        return makeBoolean((NIL != parsing_utilities.nl_tag_fnP(tag_fn, UNPROVIDED)) && (!tag_fn.eql(cycl_utilities.formula_arg0(cycl))));
    }

    /**
     * Extract a (<role> <var> :SUBJECT) clause from the collection expression PSP-CYCL.
     *
     * @return 0; CYCL minus the clause, if found.
     * @return 1; <role> from the extracted clause.
     */
    @LispMethod(comment = "Extract a (<role> <var> :SUBJECT) clause from the collection expression PSP-CYCL.\r\n\r\n@return 0; CYCL minus the clause, if found.\r\n@return 1; <role> from the extracted clause.")
    public static final SubLObject psp_extract_subject_semx_alt(SubLObject psp_cycl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject new_cycl = psp_extract_subject_semx_int(psp_cycl_cycl(psp_cycl));
                SubLObject subject_role = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != psp_weighted_cycl_p(psp_cycl)) {
                    {
                        SubLObject weight = psp_cycl_weight(psp_cycl);
                        new_cycl = psp_weight_cycl(new_cycl, weight);
                    }
                }
                return values(new_cycl, subject_role);
            }
        }
    }

    @LispMethod(comment = "Extract a (<role> <var> :SUBJECT) clause from the collection expression PSP-CYCL.\r\n\r\n@return 0; CYCL minus the clause, if found.\r\n@return 1; <role> from the extracted clause.")
    public static SubLObject psp_extract_subject_semx(final SubLObject psp_cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject new_cycl = psp_extract_subject_semx_int(psp_cycl_cycl(psp_cycl));
        final SubLObject subject_role = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != psp_weighted_cycl_p(psp_cycl)) {
            final SubLObject weight = psp_cycl_weight(psp_cycl);
            new_cycl = psp_weight_cycl(new_cycl, weight);
        }
        return values(new_cycl, subject_role);
    }/**
     * Extract a (<role> <var> :SUBJECT) clause from the collection expression PSP-CYCL.
     *
     * @return 0; CYCL minus the clause, if found.
     * @return 1; <role> from the extracted clause.
     */


    /**
     * Extract a (<role> <var> :SUBJECT) clause from the collection expression CYCL.
     *
     * @return 0; CYCL minus the clause, if found.
     * @return 1; <role> from the extracted clause.
     */
    @LispMethod(comment = "Extract a (<role> <var> :SUBJECT) clause from the collection expression CYCL.\r\n\r\n@return 0; CYCL minus the clause, if found.\r\n@return 1; <role> from the extracted clause.")
    public static final SubLObject psp_extract_subject_semx_int_internal_alt(SubLObject cycl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_cycl = cycl;
                SubLObject subject_role = NIL;
                if (NIL != el_conjunction_p(cycl)) {
                    {
                        SubLObject new_conjuncts = NIL;
                        SubLObject args = cycl_utilities.formula_args(cycl, $IGNORE);
                        SubLObject rest = NIL;
                        for (rest = args; !((NIL != subject_role) || (NIL == rest)); rest = rest.rest()) {
                            {
                                SubLObject conjunct = rest.first();
                                if (NIL != psp_subject_clauseP(conjunct)) {
                                    new_conjuncts = remove(conjunct, cycl_utilities.formula_args(cycl, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    new_cycl = simplifier.nconjoin(new_conjuncts, UNPROVIDED);
                                    subject_role = cycl_utilities.formula_arg0(conjunct);
                                }
                            }
                        }
                    }
                } else {
                    thread.resetMultipleValues();
                    {
                        SubLObject coll = parsing_utilities.parse_collection_expression(cycl);
                        SubLObject var = thread.secondMultipleValue();
                        SubLObject restrictions = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject new_clauses = NIL;
                            if (NIL == subject_role) {
                                {
                                    SubLObject csome_list_var = restrictions;
                                    SubLObject clause = NIL;
                                    for (clause = csome_list_var.first(); !((NIL != subject_role) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , clause = csome_list_var.first()) {
                                        if (NIL != psp_subject_clauseP(clause)) {
                                            new_clauses = remove(clause, restrictions, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            new_cycl = parsing_utilities.make_collection_expression(coll, var, new_clauses);
                                            subject_role = cycl_utilities.formula_arg0(clause);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                new_cycl = psp_cyclify_subject(new_cycl);
                return values(new_cycl, subject_role);
            }
        }
    }

    @LispMethod(comment = "Extract a (<role> <var> :SUBJECT) clause from the collection expression CYCL.\r\n\r\n@return 0; CYCL minus the clause, if found.\r\n@return 1; <role> from the extracted clause.")
    public static SubLObject psp_extract_subject_semx_int_internal(final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_cycl = cycl;
        SubLObject subject_role = NIL;
        if (NIL != el_conjunction_p(cycl)) {
            SubLObject new_conjuncts = NIL;
            final SubLObject args = cycl_utilities.formula_args(cycl, $IGNORE);
            SubLObject rest;
            SubLObject conjunct;
            for (rest = NIL, rest = args; (NIL == subject_role) && (NIL != rest); rest = rest.rest()) {
                conjunct = rest.first();
                if (NIL != psp_subject_clauseP(conjunct)) {
                    new_conjuncts = remove(conjunct, cycl_utilities.formula_args(cycl, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    new_cycl = simplifier.nconjoin(new_conjuncts, UNPROVIDED);
                    subject_role = cycl_utilities.formula_arg0(conjunct);
                }
            }
        } else {
            thread.resetMultipleValues();
            final SubLObject coll = parsing_utilities.parse_collection_expression(cycl);
            final SubLObject var = thread.secondMultipleValue();
            final SubLObject restrictions = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            SubLObject new_clauses = NIL;
            if (NIL == subject_role) {
                SubLObject csome_list_var = restrictions;
                SubLObject clause = NIL;
                clause = csome_list_var.first();
                while ((NIL == subject_role) && (NIL != csome_list_var)) {
                    if (NIL != psp_subject_clauseP(clause)) {
                        new_clauses = remove(clause, restrictions, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        new_cycl = parsing_utilities.make_collection_expression(coll, var, new_clauses);
                        subject_role = cycl_utilities.formula_arg0(clause);
                    }
                    csome_list_var = csome_list_var.rest();
                    clause = csome_list_var.first();
                } 
            }
        }
        new_cycl = psp_cyclify_subject(new_cycl);
        return values(new_cycl, subject_role);
    }/**
     * Extract a (<role> <var> :SUBJECT) clause from the collection expression CYCL.
     *
     * @return 0; CYCL minus the clause, if found.
     * @return 1; <role> from the extracted clause.
     */


    public static final SubLObject psp_extract_subject_semx_int_alt(SubLObject cycl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return psp_extract_subject_semx_int_internal(cycl);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PSP_EXTRACT_SUBJECT_SEMX_INT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PSP_EXTRACT_SUBJECT_SEMX_INT, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, PSP_EXTRACT_SUBJECT_SEMX_INT, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, cycl, $kw46$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw46$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_extract_subject_semx_int_internal(cycl)));
                        memoization_state.caching_state_put(caching_state, cycl, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject psp_extract_subject_semx_int(final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return psp_extract_subject_semx_int_internal(cycl);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PSP_EXTRACT_SUBJECT_SEMX_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PSP_EXTRACT_SUBJECT_SEMX_INT, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PSP_EXTRACT_SUBJECT_SEMX_INT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, cycl, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_extract_subject_semx_int_internal(cycl)));
            memoization_state.caching_state_put(caching_state, cycl, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject psp_cyclify_subject_alt(SubLObject cycl) {
        return subst($$TheSentenceSubject, $SUBJECT, cycl, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject psp_cyclify_subject(final SubLObject cycl) {
        return subst($$TheSentenceSubject, $SUBJECT, cycl, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject psp_quantify_subject_alt(SubLObject cycl) {
        if (NIL != cycl_utilities.expression_find($$TheSentenceSubject, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            {
                SubLObject var = czer_utilities.unique_el_var_wrt_expression(cycl, $sym211$_SUBJECT);
                return psp_quantify_template(subst(var, $$TheSentenceSubject, cycl, UNPROVIDED, UNPROVIDED));
            }
        }
        return cycl;
    }

    public static SubLObject psp_quantify_subject(final SubLObject cycl) {
        if (NIL != cycl_utilities.expression_find($$TheSentenceSubject, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            final SubLObject var = czer_utilities.unique_el_var_wrt_expression(cycl, $sym212$_SUBJECT);
            return psp_quantify_template(subst(var, $$TheSentenceSubject, cycl, UNPROVIDED, UNPROVIDED));
        }
        return cycl;
    }

    public static final SubLObject psp_subject_clauseP_alt(SubLObject clause) {
        return makeBoolean(((NIL != el_formula_p(clause)) && (NIL != formula_arityE(clause, TWO_INTEGER, UNPROVIDED))) && (cycl_utilities.formula_arg2(clause, UNPROVIDED) == $SUBJECT));
    }

    public static SubLObject psp_subject_clauseP(final SubLObject clause) {
        return makeBoolean(((NIL != el_formula_p(clause)) && (NIL != formula_arityE(clause, TWO_INTEGER, UNPROVIDED))) && (cycl_utilities.formula_arg2(clause, UNPROVIDED) == $SUBJECT));
    }

    /**
     *
     *
     * @return LISTP of members of CYCLS that are not preferred over others.
     * @unknown output list is sorted with most preferred first.
     */
    @LispMethod(comment = "@return LISTP of members of CYCLS that are not preferred over others.\r\n@unknown output list is sorted with most preferred first.")
    public static final SubLObject psp_filter_cycls_by_generality_alt(SubLObject cycls) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((parsing_vars.$psp_generality_preference$.getDynamicValue(thread) == $NONE) || (NIL != list_utilities.lengthL(cycls, TWO_INTEGER, UNPROVIDED)))) {
                cycls = psp_remove_dispreferred_cycls(cycls);
            }
            return cycls;
        }
    }

    /**
     *
     *
     * @return LISTP of members of CYCLS that are not preferred over others.
     * @unknown output list is sorted with most preferred first.
     */
    @LispMethod(comment = "@return LISTP of members of CYCLS that are not preferred over others.\r\n@unknown output list is sorted with most preferred first.")
    public static SubLObject psp_filter_cycls_by_generality(SubLObject cycls) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((parsing_vars.$psp_generality_preference$.getDynamicValue(thread) != $NONE) && (NIL == list_utilities.lengthL(cycls, TWO_INTEGER, UNPROVIDED))) {
            cycls = psp_remove_dispreferred_cycls(cycls);
        }
        return cycls;
    }

    /**
     *
     *
     * @return LISTP of members of CYCLS that are not preferred over others.
     * @unknown output list is sorted with most preferred first.
     */
    @LispMethod(comment = "@return LISTP of members of CYCLS that are not preferred over others.\r\n@unknown output list is sorted with most preferred first.")
    public static final SubLObject psp_remove_dispreferred_cycls_internal_alt(SubLObject cycls) {
        {
            SubLObject output_cycls = NIL;
            SubLObject cdolist_list_var = psp_sort_cycls_by_generality(cycls);
            SubLObject cycl = NIL;
            for (cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycl = cdolist_list_var.first()) {
                if (NIL == find(cycl, output_cycls, $sym213$PSP_LESS_PREFERABLE_CYCL_, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    output_cycls = cons(cycl, output_cycls);
                }
            }
            return nreverse(output_cycls);
        }
    }

    /**
     *
     *
     * @return LISTP of members of CYCLS that are not preferred over others.
     * @unknown output list is sorted with most preferred first.
     */
    @LispMethod(comment = "@return LISTP of members of CYCLS that are not preferred over others.\r\n@unknown output list is sorted with most preferred first.")
    public static SubLObject psp_remove_dispreferred_cycls_internal(final SubLObject cycls) {
        SubLObject output_cycls = NIL;
        SubLObject cdolist_list_var = psp_sort_cycls_by_generality(cycls);
        SubLObject cycl = NIL;
        cycl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == find(cycl, output_cycls, $sym214$PSP_LESS_PREFERABLE_CYCL_, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                output_cycls = cons(cycl, output_cycls);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cycl = cdolist_list_var.first();
        } 
        return nreverse(output_cycls);
    }

    public static final SubLObject psp_remove_dispreferred_cycls_alt(SubLObject cycls) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return psp_remove_dispreferred_cycls_internal(cycls);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PSP_REMOVE_DISPREFERRED_CYCLS, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PSP_REMOVE_DISPREFERRED_CYCLS, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, PSP_REMOVE_DISPREFERRED_CYCLS, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, cycls, $kw46$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw46$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_remove_dispreferred_cycls_internal(cycls)));
                        memoization_state.caching_state_put(caching_state, cycls, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject psp_remove_dispreferred_cycls(final SubLObject cycls) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return psp_remove_dispreferred_cycls_internal(cycls);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PSP_REMOVE_DISPREFERRED_CYCLS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PSP_REMOVE_DISPREFERRED_CYCLS, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PSP_REMOVE_DISPREFERRED_CYCLS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, cycls, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_remove_dispreferred_cycls_internal(cycls)));
            memoization_state.caching_state_put(caching_state, cycls, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject psp_less_preferable_cyclP_alt(SubLObject cycl1, SubLObject cycl2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (parsing_vars.$psp_generality_preference$.getDynamicValue(thread) == $NONE) {
                return NIL;
            } else {
                return psp_less_preferable_cyclP_recursive(psp_cycl_cycl(cycl1), psp_cycl_cycl(cycl2));
            }
        }
    }

    public static SubLObject psp_less_preferable_cyclP(final SubLObject cycl1, final SubLObject cycl2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (parsing_vars.$psp_generality_preference$.getDynamicValue(thread) == $NONE) {
            return NIL;
        }
        return psp_less_preferable_cyclP_recursive(psp_cycl_cycl(cycl1), psp_cycl_cycl(cycl2));
    }

    public static final SubLObject psp_less_preferable_cyclP_recursive_alt(SubLObject cycl1, SubLObject cycl2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (cycl1.equal(cycl2)) {
                } else {
                    if ((NIL != forts.fort_p(cycl1)) && (NIL != forts.fort_p(cycl2))) {
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                if (NIL == ans) {
                                    {
                                        SubLObject csome_list_var = intersection(fort_types_interface.fort_types(cycl1, UNPROVIDED), fort_types_interface.fort_types(cycl2, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                        SubLObject fort_type = NIL;
                                        for (fort_type = csome_list_var.first(); !((NIL != ans) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , fort_type = csome_list_var.first()) {
                                            {
                                                SubLObject pcase_var = fort_type;
                                                if (pcase_var.eql($$Collection)) {
                                                    {
                                                        SubLObject pcase_var_46 = parsing_vars.$psp_generality_preference$.getDynamicValue(thread);
                                                        if (pcase_var_46.eql($GENERAL)) {
                                                            ans = rbp_wff.npp_genlP(cycl1, cycl2, UNPROVIDED);
                                                        } else {
                                                            if (pcase_var_46.eql($SPECIFIC)) {
                                                                ans = rbp_wff.npp_genlP(cycl2, cycl1, UNPROVIDED);
                                                            }
                                                        }
                                                    }
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
                    } else {
                        if (((NIL != el_formula_p(cycl1)) && (NIL != el_formula_p(cycl2))) && (NIL != list_utilities.same_length_p(cycl1, cycl2))) {
                            if (NIL == ans) {
                                {
                                    SubLObject term1 = NIL;
                                    SubLObject term1_47 = NIL;
                                    SubLObject term2 = NIL;
                                    SubLObject term2_48 = NIL;
                                    for (term1 = cycl1, term1_47 = term1.first(), term2 = cycl2, term2_48 = term2.first(); !((NIL != ans) || ((NIL == term2) && (NIL == term1))); term1 = term1.rest() , term1_47 = term1.first() , term2 = term2.rest() , term2_48 = term2.first()) {
                                        ans = psp_less_preferable_cyclP_recursive(term1_47, term2_48);
                                    }
                                }
                            }
                        }
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject psp_less_preferable_cyclP_recursive(final SubLObject cycl1, final SubLObject cycl2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (!cycl1.equal(cycl2)) {
            if ((NIL != forts.fort_p(cycl1)) && (NIL != forts.fort_p(cycl2))) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    if (NIL == ans) {
                        SubLObject csome_list_var = intersection(fort_types_interface.fort_types(cycl1, UNPROVIDED), fort_types_interface.fort_types(cycl2, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                        SubLObject fort_type = NIL;
                        fort_type = csome_list_var.first();
                        while ((NIL == ans) && (NIL != csome_list_var)) {
                            final SubLObject pcase_var = fort_type;
                            if (pcase_var.eql($$Collection)) {
                                final SubLObject pcase_var_$47 = parsing_vars.$psp_generality_preference$.getDynamicValue(thread);
                                if (pcase_var_$47.eql($GENERAL)) {
                                    ans = rbp_wff.npp_genlP(cycl1, cycl2, UNPROVIDED);
                                } else
                                    if (pcase_var_$47.eql($SPECIFIC)) {
                                        ans = rbp_wff.npp_genlP(cycl2, cycl1, UNPROVIDED);
                                    }

                            }
                            csome_list_var = csome_list_var.rest();
                            fort_type = csome_list_var.first();
                        } 
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            } else
                if ((((NIL != el_formula_p(cycl1)) && (NIL != el_formula_p(cycl2))) && (NIL != list_utilities.same_length_p(cycl1, cycl2))) && (NIL == ans)) {
                    SubLObject term1;
                    SubLObject term1_$48;
                    SubLObject term2;
                    SubLObject term2_$49;
                    for (term1 = NIL, term1_$48 = NIL, term2 = NIL, term2_$49 = NIL, term1 = cycl1, term1_$48 = term1.first(), term2 = cycl2, term2_$49 = term2.first(); (NIL == ans) && ((NIL != term2) || (NIL != term1)); ans = psp_less_preferable_cyclP_recursive(term1_$48, term2_$49) , term1 = term1.rest() , term1_$48 = term1.first() , term2 = term2.rest() , term2_$49 = term2.first()) {
                    }
                }

        }
        return ans;
    }

    /**
     *
     *
     * @unknown destructive
     */
    @LispMethod(comment = "@unknown destructive")
    public static final SubLObject psp_nsort_cycls_by_generality_alt(SubLObject cycls) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = parsing_vars.$psp_generality_preference$.getDynamicValue(thread);
                if (pcase_var.eql($GENERAL)) {
                    return Sort.sort(cycls, symbol_function($sym216$_), PSP_GENERALITY_ESTIMATE);
                } else {
                    if (pcase_var.eql($SPECIFIC)) {
                        return Sort.sort(cycls, symbol_function($sym218$_), PSP_GENERALITY_ESTIMATE);
                    } else {
                        return cycls;
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @unknown destructive
     */
    @LispMethod(comment = "@unknown destructive")
    public static SubLObject psp_nsort_cycls_by_generality(final SubLObject cycls) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = parsing_vars.$psp_generality_preference$.getDynamicValue(thread);
        if (pcase_var.eql($GENERAL)) {
            return Sort.sort(cycls, symbol_function($sym219$_), PSP_GENERALITY_ESTIMATE);
        }
        if (pcase_var.eql($SPECIFIC)) {
            return Sort.sort(cycls, symbol_function($sym221$_), PSP_GENERALITY_ESTIMATE);
        }
        return cycls;
    }

    /**
     *
     *
     * @unknown non-destructive
     */
    @LispMethod(comment = "@unknown non-destructive")
    public static final SubLObject psp_sort_cycls_by_generality_alt(SubLObject cycls) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = parsing_vars.$psp_generality_preference$.getDynamicValue(thread);
                if (pcase_var.eql($GENERAL)) {
                    return Sort.sort(copy_list(cycls), symbol_function($sym216$_), PSP_GENERALITY_ESTIMATE);
                } else {
                    if (pcase_var.eql($SPECIFIC)) {
                        return Sort.sort(copy_list(cycls), symbol_function($sym218$_), PSP_GENERALITY_ESTIMATE);
                    } else {
                        return cycls;
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @unknown non-destructive
     */
    @LispMethod(comment = "@unknown non-destructive")
    public static SubLObject psp_sort_cycls_by_generality(final SubLObject cycls) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = parsing_vars.$psp_generality_preference$.getDynamicValue(thread);
        if (pcase_var.eql($GENERAL)) {
            return Sort.sort(copy_list(cycls), symbol_function($sym219$_), PSP_GENERALITY_ESTIMATE);
        }
        if (pcase_var.eql($SPECIFIC)) {
            return Sort.sort(copy_list(cycls), symbol_function($sym221$_), PSP_GENERALITY_ESTIMATE);
        }
        return cycls;
    }

    public static final SubLObject psp_generality_estimate_alt(SubLObject v_term) {
        return psp_generality_estimate_recursive(v_term);
    }

    public static SubLObject psp_generality_estimate(final SubLObject v_term) {
        return psp_generality_estimate_recursive(v_term);
    }

    public static final SubLObject psp_generality_estimate_recursive_alt(SubLObject v_term) {
        if (NIL != el_formula_p(v_term)) {
            return apply(symbol_function($sym219$_), Mapping.mapcar(PSP_GENERALITY_ESTIMATE_RECURSIVE, v_term));
        } else {
            return cardinality_estimates.generality_estimate(v_term);
        }
    }

    public static SubLObject psp_generality_estimate_recursive(final SubLObject v_term) {
        if (NIL != el_formula_p(v_term)) {
            return apply(symbol_function($sym222$_), Mapping.mapcar(PSP_GENERALITY_ESTIMATE_RECURSIVE, v_term));
        }
        return cardinality_estimates.generality_estimate(v_term);
    }

    public static final SubLObject declare_psp_semantics_file_alt() {
        declareFunction("psp_mother_of_current_edge", "PSP-MOTHER-OF-CURRENT-EDGE", 0, 0, false);
        declareFunction("phrase_structure_parser_weighted_cycl_print_function_trampoline", "PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("phrase_structure_parser_weighted_cycl_p", "PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL-P", 1, 0, false);
        new com.cyc.cycjava.cycl.psp_semantics.$phrase_structure_parser_weighted_cycl_p$UnaryFunction();
        declareFunction("psp_weighted_cycl_cycl", "PSP-WEIGHTED-CYCL-CYCL", 1, 0, false);
        declareFunction("psp_weighted_cycl_weight", "PSP-WEIGHTED-CYCL-WEIGHT", 1, 0, false);
        declareFunction("_csetf_psp_weighted_cycl_cycl", "_CSETF-PSP-WEIGHTED-CYCL-CYCL", 2, 0, false);
        declareFunction("_csetf_psp_weighted_cycl_weight", "_CSETF-PSP-WEIGHTED-CYCL-WEIGHT", 2, 0, false);
        declareFunction("make_phrase_structure_parser_weighted_cycl", "MAKE-PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL", 0, 1, false);
        declareFunction("psp_weighted_cycl_p", "PSP-WEIGHTED-CYCL-P", 1, 0, false);
        declareFunction("contains_psp_weighted_cycl_p", "CONTAINS-PSP-WEIGHTED-CYCL-P", 1, 0, false);
        declareFunction("pprint_psp_weighted_cycl", "PPRINT-PSP-WEIGHTED-CYCL", 1, 2, false);
        declareFunction("psp_weight_cycl", "PSP-WEIGHT-CYCL", 2, 0, false);
        declareFunction("psp_cycl_weight_L", "PSP-CYCL-WEIGHT-<", 2, 1, false);
        declareFunction("sort_psp_cycls_by_weight_ascending", "SORT-PSP-CYCLS-BY-WEIGHT-ASCENDING", 1, 0, false);
        declareFunction("psp_cycl_weight", "PSP-CYCL-WEIGHT", 1, 0, false);
        declareFunction("psp_cycl_cycl", "PSP-CYCL-CYCL", 1, 0, false);
        declareFunction("psp_cycls_to_cycls", "PSP-CYCLS-TO-CYCLS", 1, 0, false);
        declareFunction("psp_cycl_E", "PSP-CYCL-=", 2, 0, false);
        declareFunction("new_psp_weighted_cycl", "NEW-PSP-WEIGHTED-CYCL", 2, 0, false);
        declareFunction("copy_psp_cycls", "COPY-PSP-CYCLS", 1, 0, false);
        declareFunction("copy_psp_cycl", "COPY-PSP-CYCL", 1, 0, false);
        declareFunction("psp_cycl_subst", "PSP-CYCL-SUBST", 3, 0, false);
        declareFunction("psp_weighted_cycl_set_cycl", "PSP-WEIGHTED-CYCL-SET-CYCL", 2, 0, false);
        declareFunction("psp_weighted_cycl_set_weight", "PSP-WEIGHTED-CYCL-SET-WEIGHT", 2, 0, false);
        declareFunction("psp_semantics_for_edge", "PSP-SEMANTICS-FOR-EDGE", 1, 2, false);
        declareFunction("psp_semantics_for_edge_int", "PSP-SEMANTICS-FOR-EDGE-INT", 2, 0, false);
        declareFunction("psp_compute_semantics", "PSP-COMPUTE-SEMANTICS", 3, 0, false);
        declareFunction("psp_semantic_output_type", "PSP-SEMANTIC-OUTPUT-TYPE", 2, 0, false);
        declareFunction("psp_template_form", "PSP-TEMPLATE-FORM", 1, 0, false);
        declareFunction("psp_semantic_computation_type", "PSP-SEMANTIC-COMPUTATION-TYPE", 2, 0, false);
        declareFunction("clear_psp_category_from_frame", "CLEAR-PSP-CATEGORY-FROM-FRAME", 0, 0, false);
        declareFunction("remove_psp_category_from_frame", "REMOVE-PSP-CATEGORY-FROM-FRAME", 1, 1, false);
        declareFunction("psp_category_from_frame_internal", "PSP-CATEGORY-FROM-FRAME-INTERNAL", 2, 0, false);
        declareFunction("psp_category_from_frame", "PSP-CATEGORY-FROM-FRAME", 1, 1, false);
        declareFunction("psp_edge_lexical_semx", "PSP-EDGE-LEXICAL-SEMX", 2, 0, false);
        declareFunction("psp_edge_unary_semx", "PSP-EDGE-UNARY-SEMX", 2, 0, false);
        declareFunction("psp_edge_multi_dtr_semx", "PSP-EDGE-MULTI-DTR-SEMX", 2, 0, false);
        declareFunction("psp_determine_semantic_dependencies", "PSP-DETERMINE-SEMANTIC-DEPENDENCIES", 3, 0, false);
        declareFunction("psp_semx_slurp_handlers", "PSP-SEMX-SLURP-HANDLERS", 0, 1, false);
        declareFunction("psp_semx_clear_handlers", "PSP-SEMX-CLEAR-HANDLERS", 0, 0, false);
        declareFunction("psp_special_methods_for_output_type", "PSP-SPECIAL-METHODS-FOR-OUTPUT-TYPE", 1, 0, false);
        declareFunction("psp_edge_semx_specialP", "PSP-EDGE-SEMX-SPECIAL?", 2, 0, false);
        declareFunction("psp_edge_special_method", "PSP-EDGE-SPECIAL-METHOD", 2, 0, false);
        declareFunction("psp_edge_special_semx", "PSP-EDGE-SPECIAL-SEMX", 2, 0, false);
        declareFunction("psp_semx_for_participle_rel_clause_nbar", "PSP-SEMX-FOR-PARTICIPLE-REL-CLAUSE-NBAR", 1, 0, false);
        declareFunction("psp_semx_for_det_nbar", "PSP-SEMX-FOR-DET-NBAR", 1, 0, false);
        declareFunction("psp_possessive_det_posP", "PSP-POSSESSIVE-DET-POS?", 1, 0, false);
        declareFunction("psp_semx_for_of_noun_compound", "PSP-SEMX-FOR-OF-NOUN-COMPOUND", 1, 0, false);
        declareFunction("psp_semx_for_noun_compound", "PSP-SEMX-FOR-NOUN-COMPOUND", 1, 0, false);
        declareFunction("rbp_tokens_from_edge", "RBP-TOKENS-FROM-EDGE", 2, 0, false);
        declareFunction("psp_regular_pluralP", "PSP-REGULAR-PLURAL?", 2, 0, false);
        declareFunction("psp_closed_class_edge_likely_misconstrued_as_nameP", "PSP-CLOSED-CLASS-EDGE-LIKELY-MISCONSTRUED-AS-NAME?", 1, 0, false);
        declareFunction("psp_closed_class_likely_misconstrued_as_nameP", "PSP-CLOSED-CLASS-LIKELY-MISCONSTRUED-AS-NAME?", 3, 0, false);
        declareFunction("psp_parse_noun_compound_tokens_internal", "PSP-PARSE-NOUN-COMPOUND-TOKENS-INTERNAL", 1, 0, false);
        declareFunction("psp_parse_noun_compound_tokens", "PSP-PARSE-NOUN-COMPOUND-TOKENS", 1, 0, false);
        declareFunction("psp_semx_for_gerund_np", "PSP-SEMX-FOR-GERUND-NP", 1, 0, false);
        declareFunction("psp_semx_for_appositive_np", "PSP-SEMX-FOR-APPOSITIVE-NP", 1, 0, false);
        declareFunction("psp_modifier_dtrP", "PSP-MODIFIER-DTR?", 2, 0, false);
        declareFunction("psp_head_key_from_bindings", "PSP-HEAD-KEY-FROM-BINDINGS", 2, 0, false);
        declareFunction("psp_coerce_templates_to_collections", "PSP-COERCE-TEMPLATES-TO-COLLECTIONS", 4, 0, false);
        declareFunction("psp_coerce_template_to_collection", "PSP-COERCE-TEMPLATE-TO-COLLECTION", 3, 0, false);
        declareFunction("psp_coerce_template_to_collection_memoized_internal", "PSP-COERCE-TEMPLATE-TO-COLLECTION-MEMOIZED-INTERNAL", 3, 0, false);
        declareFunction("psp_coerce_template_to_collection_memoized", "PSP-COERCE-TEMPLATE-TO-COLLECTION-MEMOIZED", 3, 0, false);
        declareFunction("psp_handle_keywords_in_formula", "PSP-HANDLE-KEYWORDS-IN-FORMULA", 3, 0, false);
        declareFunction("psp_handle_keyword_in_formula", "PSP-HANDLE-KEYWORD-IN-FORMULA", 2, 0, false);
        declareFunction("psp_davidsonian_clause_p", "PSP-DAVIDSONIAN-CLAUSE-P", 1, 1, false);
        declareFunction("psp_make_davidsonian_clause", "PSP-MAKE-DAVIDSONIAN-CLAUSE", 2, 0, false);
        declareFunction("psp_find_isa", "PSP-FIND-ISA", 2, 0, false);
        declareFunction("psp_extract_head_semx", "PSP-EXTRACT-HEAD-SEMX", 2, 0, false);
        declareFunction("psp_dnf_clausal_form", "PSP-DNF-CLAUSAL-FORM", 1, 0, false);
        declareFunction("psp_dnf_for_sentence", "PSP-DNF-FOR-SENTENCE", 1, 0, false);
        declareFunction("clear_psp_head_key_for_category", "CLEAR-PSP-HEAD-KEY-FOR-CATEGORY", 0, 0, false);
        declareFunction("remove_psp_head_key_for_category", "REMOVE-PSP-HEAD-KEY-FOR-CATEGORY", 1, 1, false);
        declareFunction("psp_head_key_for_category_internal", "PSP-HEAD-KEY-FOR-CATEGORY-INTERNAL", 2, 0, false);
        declareFunction("psp_head_key_for_category", "PSP-HEAD-KEY-FOR-CATEGORY", 1, 1, false);
        declareFunction("psp_substitute_bindings_internal", "PSP-SUBSTITUTE-BINDINGS-INTERNAL", 3, 0, false);
        declareFunction("psp_substitute_bindings", "PSP-SUBSTITUTE-BINDINGS", 3, 0, false);
        declareFunction("psp_add_some_fn", "PSP-ADD-SOME-FN", 1, 0, false);
        declareFunction("psp_rename_variables", "PSP-RENAME-VARIABLES", 2, 0, false);
        declareFunction("psp_substitute_bindings_coll", "PSP-SUBSTITUTE-BINDINGS-COLL", 4, 0, false);
        declareFunction("psp_process_bindings", "PSP-PROCESS-BINDINGS", 4, 0, false);
        declareFunction("psp_template_keywordP", "PSP-TEMPLATE-KEYWORD?", 1, 0, false);
        declareFunction("psp_process_bindings_int", "PSP-PROCESS-BINDINGS-INT", 1, 0, false);
        declareFunction("validate_binding_pair", "VALIDATE-BINDING-PAIR", 1, 0, false);
        declareFunction("psp_collectionP", "PSP-COLLECTION?", 1, 0, false);
        declareFunction("psp_collection_memoizedP_internal", "PSP-COLLECTION-MEMOIZED?-INTERNAL", 1, 0, false);
        declareFunction("psp_collection_memoizedP", "PSP-COLLECTION-MEMOIZED?", 1, 0, false);
        declareFunction("psp_reformulate", "PSP-REFORMULATE", 1, 0, false);
        declareFunction("psp_reformulate_int_internal", "PSP-REFORMULATE-INT-INTERNAL", 1, 0, false);
        declareFunction("psp_reformulate_int", "PSP-REFORMULATE-INT", 1, 0, false);
        declareFunction("psp_reformulate_cycls", "PSP-REFORMULATE-CYCLS", 1, 0, false);
        declareFunction("psp_disc_resolve_sentence_entities", "PSP-DISC-RESOLVE-SENTENCE-ENTITIES", 1, 0, false);
        declareFunction("psp_wffP_internal", "PSP-WFF?-INTERNAL", 2, 0, false);
        declareFunction("psp_wffP", "PSP-WFF?", 2, 0, false);
        declareFunction("psp_wffP_int", "PSP-WFF?-INT", 2, 0, false);
        declareFunction("psp_indexical_bindings_p", "PSP-INDEXICAL-BINDINGS-P", 1, 0, false);
        declareFunction("psp_sem_templates_from_lexical_edge_internal", "PSP-SEM-TEMPLATES-FROM-LEXICAL-EDGE-INTERNAL", 1, 0, false);
        declareFunction("psp_sem_templates_from_lexical_edge", "PSP-SEM-TEMPLATES-FROM-LEXICAL-EDGE", 1, 0, false);
        declareFunction("psp_noun_sem_trans_cycls", "PSP-NOUN-SEM-TRANS-CYCLS", 3, 0, false);
        declareFunction("find_bad_templates_for_pred", "FIND-BAD-TEMPLATES-FOR-PRED", 1, 0, false);
        declareFunction("psp_bad_templateP", "PSP-BAD-TEMPLATE?", 2, 0, false);
        declareFunction("psp_raw_templates", "PSP-RAW-TEMPLATES", 3, 0, false);
        declareFunction("psp_lookup_templates_memoized_internal", "PSP-LOOKUP-TEMPLATES-MEMOIZED-INTERNAL", 4, 2, false);
        declareFunction("psp_lookup_templates_memoized", "PSP-LOOKUP-TEMPLATES-MEMOIZED", 4, 2, false);
        declareFunction("psp_frame_type_from_context", "PSP-FRAME-TYPE-FROM-CONTEXT", 2, 0, false);
        declareFunction("psp_roles_for_denot_internal", "PSP-ROLES-FOR-DENOT-INTERNAL", 1, 0, false);
        declareFunction("psp_roles_for_denot", "PSP-ROLES-FOR-DENOT", 1, 0, false);
        declareFunction("psp_devise_templates", "PSP-DEVISE-TEMPLATES", 3, 0, false);
        declareFunction("psp_devise_word_templates", "PSP-DEVISE-WORD-TEMPLATES", 4, 0, false);
        declareFunction("psp_devise_verb_templates", "PSP-DEVISE-VERB-TEMPLATES", 2, 0, false);
        declareFunction("clear_psp_genl_posP", "CLEAR-PSP-GENL-POS?", 0, 0, false);
        declareFunction("remove_psp_genl_posP", "REMOVE-PSP-GENL-POS?", 2, 1, false);
        declareFunction("psp_genl_posP_internal", "PSP-GENL-POS?-INTERNAL", 3, 0, false);
        declareFunction("psp_genl_posP", "PSP-GENL-POS?", 2, 1, false);
        declareFunction("psp_devise_noun_templates_internal", "PSP-DEVISE-NOUN-TEMPLATES-INTERNAL", 3, 0, false);
        declareFunction("psp_devise_noun_templates", "PSP-DEVISE-NOUN-TEMPLATES", 3, 0, false);
        declareFunction("psp_devise_deverbal_noun_templates", "PSP-DEVISE-DEVERBAL-NOUN-TEMPLATES", 2, 0, false);
        declareFunction("psp_devise_deverbal_noun_template_internal", "PSP-DEVISE-DEVERBAL-NOUN-TEMPLATE-INTERNAL", 2, 0, false);
        declareFunction("psp_devise_deverbal_noun_template", "PSP-DEVISE-DEVERBAL-NOUN-TEMPLATE", 2, 0, false);
        declareFunction("psp_passivize_templates", "PSP-PASSIVIZE-TEMPLATES", 2, 0, false);
        declareFunction("psp_passivize_template_internal", "PSP-PASSIVIZE-TEMPLATE-INTERNAL", 3, 0, false);
        declareFunction("psp_passivize_template", "PSP-PASSIVIZE-TEMPLATE", 3, 0, false);
        declareFunction("psp_quantify_templates", "PSP-QUANTIFY-TEMPLATES", 1, 0, false);
        declareFunction("psp_quantify_template_internal", "PSP-QUANTIFY-TEMPLATE-INTERNAL", 1, 0, false);
        declareFunction("psp_quantify_template", "PSP-QUANTIFY-TEMPLATE", 1, 0, false);
        declareFunction("psp_quantifiable_template_p", "PSP-QUANTIFIABLE-TEMPLATE-P", 1, 0, false);
        declareFunction("psp_make_conjunction", "PSP-MAKE-CONJUNCTION", 1, 0, false);
        declareFunction("psp_make_disjunction", "PSP-MAKE-DISJUNCTION", 1, 0, false);
        declareFunction("psp_make_existential", "PSP-MAKE-EXISTENTIAL", 2, 0, false);
        declareFunction("psp_davidsonianize_verb_templates", "PSP-DAVIDSONIANIZE-VERB-TEMPLATES", 2, 0, false);
        declareFunction("psp_davidsonianize_verb_template_internal", "PSP-DAVIDSONIANIZE-VERB-TEMPLATE-INTERNAL", 1, 0, false);
        declareFunction("psp_davidsonianize_verb_template", "PSP-DAVIDSONIANIZE-VERB-TEMPLATE", 1, 0, false);
        declareFunction("psp_action_type", "PSP-ACTION-TYPE", 1, 0, false);
        declareFunction("psp_contains_isa_clauseP", "PSP-CONTAINS-ISA-CLAUSE?", 2, 0, false);
        declareFunction("psp_ok_templateP", "PSP-OK-TEMPLATE?", 2, 1, false);
        declareFunction("psp_ok_templateP_int_internal", "PSP-OK-TEMPLATE?-INT-INTERNAL", 3, 0, false);
        declareFunction("psp_ok_templateP_int", "PSP-OK-TEMPLATE?-INT", 3, 0, false);
        declareFunction("psp_no_isa_clause_neededP", "PSP-NO-ISA-CLAUSE-NEEDED?", 1, 0, false);
        declareFunction("psp_add_nl_tags", "PSP-ADD-NL-TAGS", 2, 0, false);
        declareFunction("psp_add_name_tags", "PSP-ADD-NAME-TAGS", 2, 0, false);
        declareFunction("psp_add_nbar_tags", "PSP-ADD-NBAR-TAGS", 2, 0, false);
        declareFunction("psp_guess_agr_pred", "PSP-GUESS-AGR-PRED", 1, 0, false);
        declareFunction("psp_add_np_tags", "PSP-ADD-NP-TAGS", 2, 0, false);
        declareFunction("psp_nl_tag_addedP", "PSP-NL-TAG-ADDED?", 2, 0, false);
        declareFunction("psp_extract_subject_semx", "PSP-EXTRACT-SUBJECT-SEMX", 1, 0, false);
        declareFunction("psp_extract_subject_semx_int_internal", "PSP-EXTRACT-SUBJECT-SEMX-INT-INTERNAL", 1, 0, false);
        declareFunction("psp_extract_subject_semx_int", "PSP-EXTRACT-SUBJECT-SEMX-INT", 1, 0, false);
        declareFunction("psp_cyclify_subject", "PSP-CYCLIFY-SUBJECT", 1, 0, false);
        declareFunction("psp_quantify_subject", "PSP-QUANTIFY-SUBJECT", 1, 0, false);
        declareFunction("psp_subject_clauseP", "PSP-SUBJECT-CLAUSE?", 1, 0, false);
        declareFunction("psp_filter_cycls_by_generality", "PSP-FILTER-CYCLS-BY-GENERALITY", 1, 0, false);
        declareFunction("psp_remove_dispreferred_cycls_internal", "PSP-REMOVE-DISPREFERRED-CYCLS-INTERNAL", 1, 0, false);
        declareFunction("psp_remove_dispreferred_cycls", "PSP-REMOVE-DISPREFERRED-CYCLS", 1, 0, false);
        declareFunction("psp_less_preferable_cyclP", "PSP-LESS-PREFERABLE-CYCL?", 2, 0, false);
        declareFunction("psp_less_preferable_cyclP_recursive", "PSP-LESS-PREFERABLE-CYCL?-RECURSIVE", 2, 0, false);
        declareFunction("psp_nsort_cycls_by_generality", "PSP-NSORT-CYCLS-BY-GENERALITY", 1, 0, false);
        declareFunction("psp_sort_cycls_by_generality", "PSP-SORT-CYCLS-BY-GENERALITY", 1, 0, false);
        declareFunction("psp_generality_estimate", "PSP-GENERALITY-ESTIMATE", 1, 0, false);
        declareFunction("psp_generality_estimate_recursive", "PSP-GENERALITY-ESTIMATE-RECURSIVE", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_psp_semantics_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("psp_mother_of_current_edge", "PSP-MOTHER-OF-CURRENT-EDGE", 0, 0, false);
            declareFunction("phrase_structure_parser_weighted_cycl_print_function_trampoline", "PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("phrase_structure_parser_weighted_cycl_p", "PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL-P", 1, 0, false);
            new psp_semantics.$phrase_structure_parser_weighted_cycl_p$UnaryFunction();
            declareFunction("psp_weighted_cycl_cycl", "PSP-WEIGHTED-CYCL-CYCL", 1, 0, false);
            declareFunction("psp_weighted_cycl_weight", "PSP-WEIGHTED-CYCL-WEIGHT", 1, 0, false);
            declareFunction("_csetf_psp_weighted_cycl_cycl", "_CSETF-PSP-WEIGHTED-CYCL-CYCL", 2, 0, false);
            declareFunction("_csetf_psp_weighted_cycl_weight", "_CSETF-PSP-WEIGHTED-CYCL-WEIGHT", 2, 0, false);
            declareFunction("make_phrase_structure_parser_weighted_cycl", "MAKE-PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL", 0, 1, false);
            declareFunction("visit_defstruct_phrase_structure_parser_weighted_cycl", "VISIT-DEFSTRUCT-PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL", 2, 0, false);
            declareFunction("visit_defstruct_object_phrase_structure_parser_weighted_cycl_method", "VISIT-DEFSTRUCT-OBJECT-PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL-METHOD", 2, 0, false);
            declareFunction("psp_weighted_cycl_p", "PSP-WEIGHTED-CYCL-P", 1, 0, false);
            declareFunction("contains_psp_weighted_cycl_p", "CONTAINS-PSP-WEIGHTED-CYCL-P", 1, 0, false);
            declareFunction("pprint_psp_weighted_cycl", "PPRINT-PSP-WEIGHTED-CYCL", 1, 2, false);
            declareFunction("psp_weight_cycl", "PSP-WEIGHT-CYCL", 2, 0, false);
            declareFunction("psp_cycl_weight_L", "PSP-CYCL-WEIGHT-<", 2, 1, false);
            declareFunction("sort_psp_cycls_by_weight_ascending", "SORT-PSP-CYCLS-BY-WEIGHT-ASCENDING", 1, 0, false);
            declareFunction("psp_cycl_weight", "PSP-CYCL-WEIGHT", 1, 0, false);
            declareFunction("psp_cycl_cycl", "PSP-CYCL-CYCL", 1, 0, false);
            declareFunction("psp_cycls_to_cycls", "PSP-CYCLS-TO-CYCLS", 1, 0, false);
            declareFunction("psp_cycl_E", "PSP-CYCL-=", 2, 0, false);
            declareFunction("new_psp_weighted_cycl", "NEW-PSP-WEIGHTED-CYCL", 2, 0, false);
            declareFunction("copy_psp_cycls", "COPY-PSP-CYCLS", 1, 0, false);
            declareFunction("copy_psp_cycl", "COPY-PSP-CYCL", 1, 0, false);
            declareFunction("psp_cycl_subst", "PSP-CYCL-SUBST", 3, 0, false);
            declareFunction("psp_weighted_cycl_set_cycl", "PSP-WEIGHTED-CYCL-SET-CYCL", 2, 0, false);
            declareFunction("psp_weighted_cycl_set_weight", "PSP-WEIGHTED-CYCL-SET-WEIGHT", 2, 0, false);
            declareFunction("psp_semantics_for_edge", "PSP-SEMANTICS-FOR-EDGE", 1, 2, false);
            declareFunction("psp_semantics_for_edge_int", "PSP-SEMANTICS-FOR-EDGE-INT", 2, 0, false);
            declareFunction("psp_compute_semantics", "PSP-COMPUTE-SEMANTICS", 3, 0, false);
            declareFunction("psp_semantic_output_type", "PSP-SEMANTIC-OUTPUT-TYPE", 2, 0, false);
            declareFunction("psp_template_form", "PSP-TEMPLATE-FORM", 1, 0, false);
            declareFunction("psp_semantic_computation_type", "PSP-SEMANTIC-COMPUTATION-TYPE", 2, 0, false);
            declareFunction("clear_psp_category_from_frame", "CLEAR-PSP-CATEGORY-FROM-FRAME", 0, 0, false);
            declareFunction("remove_psp_category_from_frame", "REMOVE-PSP-CATEGORY-FROM-FRAME", 1, 1, false);
            declareFunction("psp_category_from_frame_internal", "PSP-CATEGORY-FROM-FRAME-INTERNAL", 2, 0, false);
            declareFunction("psp_category_from_frame", "PSP-CATEGORY-FROM-FRAME", 1, 1, false);
            declareFunction("psp_edge_lexical_semx", "PSP-EDGE-LEXICAL-SEMX", 2, 0, false);
            declareFunction("psp_edge_unary_semx", "PSP-EDGE-UNARY-SEMX", 2, 0, false);
            declareFunction("psp_edge_multi_dtr_semx", "PSP-EDGE-MULTI-DTR-SEMX", 2, 0, false);
            declareFunction("psp_determine_semantic_dependencies", "PSP-DETERMINE-SEMANTIC-DEPENDENCIES", 3, 0, false);
            declareFunction("psp_semx_slurp_handlers", "PSP-SEMX-SLURP-HANDLERS", 0, 1, false);
            declareFunction("psp_semx_clear_handlers", "PSP-SEMX-CLEAR-HANDLERS", 0, 0, false);
            declareFunction("psp_special_methods_for_output_type", "PSP-SPECIAL-METHODS-FOR-OUTPUT-TYPE", 1, 0, false);
            declareFunction("psp_edge_semx_specialP", "PSP-EDGE-SEMX-SPECIAL?", 2, 0, false);
            declareFunction("psp_edge_special_method", "PSP-EDGE-SPECIAL-METHOD", 2, 0, false);
            declareFunction("psp_edge_special_semx", "PSP-EDGE-SPECIAL-SEMX", 2, 0, false);
            declareFunction("psp_semx_for_participle_rel_clause_nbar", "PSP-SEMX-FOR-PARTICIPLE-REL-CLAUSE-NBAR", 1, 0, false);
            declareFunction("psp_semx_for_det_nbar", "PSP-SEMX-FOR-DET-NBAR", 1, 0, false);
            declareFunction("psp_possessive_det_posP", "PSP-POSSESSIVE-DET-POS?", 1, 0, false);
            declareFunction("psp_semx_for_of_noun_compound", "PSP-SEMX-FOR-OF-NOUN-COMPOUND", 1, 0, false);
            declareFunction("psp_semx_for_noun_compound", "PSP-SEMX-FOR-NOUN-COMPOUND", 1, 0, false);
            declareFunction("rbp_tokens_from_edge", "RBP-TOKENS-FROM-EDGE", 2, 0, false);
            declareFunction("psp_regular_pluralP", "PSP-REGULAR-PLURAL?", 2, 0, false);
            declareFunction("psp_closed_class_edge_likely_misconstrued_as_nameP", "PSP-CLOSED-CLASS-EDGE-LIKELY-MISCONSTRUED-AS-NAME?", 1, 0, false);
            declareFunction("psp_closed_class_likely_misconstrued_as_nameP", "PSP-CLOSED-CLASS-LIKELY-MISCONSTRUED-AS-NAME?", 3, 0, false);
            declareFunction("psp_parse_noun_compound_tokens_internal", "PSP-PARSE-NOUN-COMPOUND-TOKENS-INTERNAL", 1, 0, false);
            declareFunction("psp_parse_noun_compound_tokens", "PSP-PARSE-NOUN-COMPOUND-TOKENS", 1, 0, false);
            declareFunction("psp_semx_for_gerund_np", "PSP-SEMX-FOR-GERUND-NP", 1, 0, false);
            declareFunction("psp_semx_for_appositive_np", "PSP-SEMX-FOR-APPOSITIVE-NP", 1, 0, false);
            declareFunction("psp_modifier_dtrP", "PSP-MODIFIER-DTR?", 2, 0, false);
            declareFunction("psp_head_key_from_bindings", "PSP-HEAD-KEY-FROM-BINDINGS", 2, 0, false);
            declareFunction("psp_coerce_templates_to_collections", "PSP-COERCE-TEMPLATES-TO-COLLECTIONS", 4, 0, false);
            declareFunction("psp_coerce_template_to_collection", "PSP-COERCE-TEMPLATE-TO-COLLECTION", 3, 0, false);
            declareFunction("psp_coerce_template_to_collection_memoized_internal", "PSP-COERCE-TEMPLATE-TO-COLLECTION-MEMOIZED-INTERNAL", 3, 0, false);
            declareFunction("psp_coerce_template_to_collection_memoized", "PSP-COERCE-TEMPLATE-TO-COLLECTION-MEMOIZED", 3, 0, false);
            declareFunction("psp_handle_keywords_in_formula", "PSP-HANDLE-KEYWORDS-IN-FORMULA", 3, 0, false);
            declareFunction("psp_handle_keyword_in_formula", "PSP-HANDLE-KEYWORD-IN-FORMULA", 2, 0, false);
            declareFunction("psp_davidsonian_clause_p", "PSP-DAVIDSONIAN-CLAUSE-P", 1, 1, false);
            declareFunction("psp_make_davidsonian_clause", "PSP-MAKE-DAVIDSONIAN-CLAUSE", 2, 0, false);
            declareFunction("psp_find_isa", "PSP-FIND-ISA", 2, 0, false);
            declareFunction("psp_extract_head_semx", "PSP-EXTRACT-HEAD-SEMX", 2, 0, false);
            declareFunction("psp_dnf_clausal_form", "PSP-DNF-CLAUSAL-FORM", 1, 0, false);
            declareFunction("psp_dnf_for_sentence", "PSP-DNF-FOR-SENTENCE", 1, 0, false);
            declareFunction("clear_psp_head_key_for_category", "CLEAR-PSP-HEAD-KEY-FOR-CATEGORY", 0, 0, false);
            declareFunction("remove_psp_head_key_for_category", "REMOVE-PSP-HEAD-KEY-FOR-CATEGORY", 1, 1, false);
            declareFunction("psp_head_key_for_category_internal", "PSP-HEAD-KEY-FOR-CATEGORY-INTERNAL", 2, 0, false);
            declareFunction("psp_head_key_for_category", "PSP-HEAD-KEY-FOR-CATEGORY", 1, 1, false);
            declareFunction("psp_substitute_bindings_internal", "PSP-SUBSTITUTE-BINDINGS-INTERNAL", 3, 0, false);
            declareFunction("psp_substitute_bindings", "PSP-SUBSTITUTE-BINDINGS", 3, 0, false);
            declareFunction("psp_add_some_fn", "PSP-ADD-SOME-FN", 1, 0, false);
            declareFunction("psp_rename_variables", "PSP-RENAME-VARIABLES", 2, 0, false);
            declareFunction("psp_substitute_bindings_coll", "PSP-SUBSTITUTE-BINDINGS-COLL", 4, 0, false);
            declareFunction("psp_process_bindings", "PSP-PROCESS-BINDINGS", 4, 0, false);
            declareFunction("psp_template_keywordP", "PSP-TEMPLATE-KEYWORD?", 1, 0, false);
            declareFunction("psp_process_bindings_int", "PSP-PROCESS-BINDINGS-INT", 1, 0, false);
            declareFunction("validate_binding_pair", "VALIDATE-BINDING-PAIR", 1, 0, false);
            declareFunction("psp_collectionP", "PSP-COLLECTION?", 1, 0, false);
            declareFunction("psp_collection_memoizedP_internal", "PSP-COLLECTION-MEMOIZED?-INTERNAL", 1, 0, false);
            declareFunction("psp_collection_memoizedP", "PSP-COLLECTION-MEMOIZED?", 1, 0, false);
            declareFunction("psp_reformulate", "PSP-REFORMULATE", 1, 0, false);
            declareFunction("psp_reformulate_int_internal", "PSP-REFORMULATE-INT-INTERNAL", 1, 0, false);
            declareFunction("psp_reformulate_int", "PSP-REFORMULATE-INT", 1, 0, false);
            declareFunction("psp_reformulate_cycls", "PSP-REFORMULATE-CYCLS", 1, 0, false);
            declareFunction("psp_disc_resolve_sentence_entities", "PSP-DISC-RESOLVE-SENTENCE-ENTITIES", 1, 0, false);
            declareFunction("psp_wffP_internal", "PSP-WFF?-INTERNAL", 2, 0, false);
            declareFunction("psp_wffP", "PSP-WFF?", 2, 0, false);
            declareFunction("psp_wffP_int", "PSP-WFF?-INT", 2, 0, false);
            declareFunction("psp_indexical_bindings_p", "PSP-INDEXICAL-BINDINGS-P", 1, 0, false);
            declareFunction("psp_sem_templates_from_lexical_edge_internal", "PSP-SEM-TEMPLATES-FROM-LEXICAL-EDGE-INTERNAL", 1, 0, false);
            declareFunction("psp_sem_templates_from_lexical_edge", "PSP-SEM-TEMPLATES-FROM-LEXICAL-EDGE", 1, 0, false);
            declareFunction("psp_noun_sem_trans_cycls", "PSP-NOUN-SEM-TRANS-CYCLS", 3, 0, false);
            declareFunction("psp_bad_templateP", "PSP-BAD-TEMPLATE?", 2, 0, false);
            declareFunction("psp_raw_templates", "PSP-RAW-TEMPLATES", 3, 0, false);
            declareFunction("psp_lookup_templates_memoized_internal", "PSP-LOOKUP-TEMPLATES-MEMOIZED-INTERNAL", 4, 2, false);
            declareFunction("psp_lookup_templates_memoized", "PSP-LOOKUP-TEMPLATES-MEMOIZED", 4, 2, false);
            declareFunction("psp_frame_type_from_context", "PSP-FRAME-TYPE-FROM-CONTEXT", 2, 0, false);
            declareFunction("psp_roles_for_denot_internal", "PSP-ROLES-FOR-DENOT-INTERNAL", 1, 0, false);
            declareFunction("psp_roles_for_denot", "PSP-ROLES-FOR-DENOT", 1, 0, false);
            declareFunction("psp_devise_templates", "PSP-DEVISE-TEMPLATES", 3, 0, false);
            declareFunction("psp_devise_word_templates", "PSP-DEVISE-WORD-TEMPLATES", 4, 0, false);
            declareFunction("psp_devise_verb_templates", "PSP-DEVISE-VERB-TEMPLATES", 2, 0, false);
            declareFunction("clear_psp_genl_posP", "CLEAR-PSP-GENL-POS?", 0, 0, false);
            declareFunction("remove_psp_genl_posP", "REMOVE-PSP-GENL-POS?", 2, 1, false);
            declareFunction("psp_genl_posP_internal", "PSP-GENL-POS?-INTERNAL", 3, 0, false);
            declareFunction("psp_genl_posP", "PSP-GENL-POS?", 2, 1, false);
            declareFunction("psp_devise_noun_templates_internal", "PSP-DEVISE-NOUN-TEMPLATES-INTERNAL", 3, 0, false);
            declareFunction("psp_devise_noun_templates", "PSP-DEVISE-NOUN-TEMPLATES", 3, 0, false);
            declareFunction("psp_devise_deverbal_noun_templates", "PSP-DEVISE-DEVERBAL-NOUN-TEMPLATES", 2, 0, false);
            declareFunction("psp_devise_deverbal_noun_template_internal", "PSP-DEVISE-DEVERBAL-NOUN-TEMPLATE-INTERNAL", 2, 0, false);
            declareFunction("psp_devise_deverbal_noun_template", "PSP-DEVISE-DEVERBAL-NOUN-TEMPLATE", 2, 0, false);
            declareFunction("psp_passivize_templates", "PSP-PASSIVIZE-TEMPLATES", 2, 0, false);
            declareFunction("psp_passivize_template_internal", "PSP-PASSIVIZE-TEMPLATE-INTERNAL", 3, 0, false);
            declareFunction("psp_passivize_template", "PSP-PASSIVIZE-TEMPLATE", 3, 0, false);
            declareFunction("psp_quantify_templates", "PSP-QUANTIFY-TEMPLATES", 1, 0, false);
            declareFunction("psp_quantify_template_internal", "PSP-QUANTIFY-TEMPLATE-INTERNAL", 1, 0, false);
            declareFunction("psp_quantify_template", "PSP-QUANTIFY-TEMPLATE", 1, 0, false);
            declareFunction("psp_quantifiable_template_p", "PSP-QUANTIFIABLE-TEMPLATE-P", 1, 0, false);
            declareFunction("psp_make_conjunction", "PSP-MAKE-CONJUNCTION", 1, 0, false);
            declareFunction("psp_make_disjunction", "PSP-MAKE-DISJUNCTION", 1, 0, false);
            declareFunction("psp_make_existential", "PSP-MAKE-EXISTENTIAL", 2, 0, false);
            declareFunction("psp_davidsonianize_verb_templates", "PSP-DAVIDSONIANIZE-VERB-TEMPLATES", 2, 0, false);
            declareFunction("psp_davidsonianize_verb_template_internal", "PSP-DAVIDSONIANIZE-VERB-TEMPLATE-INTERNAL", 1, 0, false);
            declareFunction("psp_davidsonianize_verb_template", "PSP-DAVIDSONIANIZE-VERB-TEMPLATE", 1, 0, false);
            declareFunction("psp_action_type", "PSP-ACTION-TYPE", 1, 0, false);
            declareFunction("psp_contains_isa_clauseP", "PSP-CONTAINS-ISA-CLAUSE?", 2, 0, false);
            declareFunction("psp_ok_templateP", "PSP-OK-TEMPLATE?", 2, 1, false);
            declareFunction("psp_ok_templateP_int_internal", "PSP-OK-TEMPLATE?-INT-INTERNAL", 3, 0, false);
            declareFunction("psp_ok_templateP_int", "PSP-OK-TEMPLATE?-INT", 3, 0, false);
            declareFunction("psp_no_isa_clause_neededP", "PSP-NO-ISA-CLAUSE-NEEDED?", 1, 0, false);
            declareFunction("psp_add_nl_tags", "PSP-ADD-NL-TAGS", 2, 0, false);
            declareFunction("psp_add_name_tags", "PSP-ADD-NAME-TAGS", 2, 0, false);
            declareFunction("psp_add_nbar_tags", "PSP-ADD-NBAR-TAGS", 2, 0, false);
            declareFunction("psp_guess_agr_pred", "PSP-GUESS-AGR-PRED", 1, 0, false);
            declareFunction("psp_add_np_tags", "PSP-ADD-NP-TAGS", 2, 0, false);
            declareFunction("psp_nl_tag_addedP", "PSP-NL-TAG-ADDED?", 2, 0, false);
            declareFunction("psp_extract_subject_semx", "PSP-EXTRACT-SUBJECT-SEMX", 1, 0, false);
            declareFunction("psp_extract_subject_semx_int_internal", "PSP-EXTRACT-SUBJECT-SEMX-INT-INTERNAL", 1, 0, false);
            declareFunction("psp_extract_subject_semx_int", "PSP-EXTRACT-SUBJECT-SEMX-INT", 1, 0, false);
            declareFunction("psp_cyclify_subject", "PSP-CYCLIFY-SUBJECT", 1, 0, false);
            declareFunction("psp_quantify_subject", "PSP-QUANTIFY-SUBJECT", 1, 0, false);
            declareFunction("psp_subject_clauseP", "PSP-SUBJECT-CLAUSE?", 1, 0, false);
            declareFunction("psp_filter_cycls_by_generality", "PSP-FILTER-CYCLS-BY-GENERALITY", 1, 0, false);
            declareFunction("psp_remove_dispreferred_cycls_internal", "PSP-REMOVE-DISPREFERRED-CYCLS-INTERNAL", 1, 0, false);
            declareFunction("psp_remove_dispreferred_cycls", "PSP-REMOVE-DISPREFERRED-CYCLS", 1, 0, false);
            declareFunction("psp_less_preferable_cyclP", "PSP-LESS-PREFERABLE-CYCL?", 2, 0, false);
            declareFunction("psp_less_preferable_cyclP_recursive", "PSP-LESS-PREFERABLE-CYCL?-RECURSIVE", 2, 0, false);
            declareFunction("psp_nsort_cycls_by_generality", "PSP-NSORT-CYCLS-BY-GENERALITY", 1, 0, false);
            declareFunction("psp_sort_cycls_by_generality", "PSP-SORT-CYCLS-BY-GENERALITY", 1, 0, false);
            declareFunction("psp_generality_estimate", "PSP-GENERALITY-ESTIMATE", 1, 0, false);
            declareFunction("psp_generality_estimate_recursive", "PSP-GENERALITY-ESTIMATE-RECURSIVE", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("find_bad_templates_for_pred", "FIND-BAD-TEMPLATES-FOR-PRED", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_psp_semantics_file_Previous() {
        declareFunction("psp_mother_of_current_edge", "PSP-MOTHER-OF-CURRENT-EDGE", 0, 0, false);
        declareFunction("phrase_structure_parser_weighted_cycl_print_function_trampoline", "PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("phrase_structure_parser_weighted_cycl_p", "PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL-P", 1, 0, false);
        new psp_semantics.$phrase_structure_parser_weighted_cycl_p$UnaryFunction();
        declareFunction("psp_weighted_cycl_cycl", "PSP-WEIGHTED-CYCL-CYCL", 1, 0, false);
        declareFunction("psp_weighted_cycl_weight", "PSP-WEIGHTED-CYCL-WEIGHT", 1, 0, false);
        declareFunction("_csetf_psp_weighted_cycl_cycl", "_CSETF-PSP-WEIGHTED-CYCL-CYCL", 2, 0, false);
        declareFunction("_csetf_psp_weighted_cycl_weight", "_CSETF-PSP-WEIGHTED-CYCL-WEIGHT", 2, 0, false);
        declareFunction("make_phrase_structure_parser_weighted_cycl", "MAKE-PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL", 0, 1, false);
        declareFunction("visit_defstruct_phrase_structure_parser_weighted_cycl", "VISIT-DEFSTRUCT-PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL", 2, 0, false);
        declareFunction("visit_defstruct_object_phrase_structure_parser_weighted_cycl_method", "VISIT-DEFSTRUCT-OBJECT-PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL-METHOD", 2, 0, false);
        declareFunction("psp_weighted_cycl_p", "PSP-WEIGHTED-CYCL-P", 1, 0, false);
        declareFunction("contains_psp_weighted_cycl_p", "CONTAINS-PSP-WEIGHTED-CYCL-P", 1, 0, false);
        declareFunction("pprint_psp_weighted_cycl", "PPRINT-PSP-WEIGHTED-CYCL", 1, 2, false);
        declareFunction("psp_weight_cycl", "PSP-WEIGHT-CYCL", 2, 0, false);
        declareFunction("psp_cycl_weight_L", "PSP-CYCL-WEIGHT-<", 2, 1, false);
        declareFunction("sort_psp_cycls_by_weight_ascending", "SORT-PSP-CYCLS-BY-WEIGHT-ASCENDING", 1, 0, false);
        declareFunction("psp_cycl_weight", "PSP-CYCL-WEIGHT", 1, 0, false);
        declareFunction("psp_cycl_cycl", "PSP-CYCL-CYCL", 1, 0, false);
        declareFunction("psp_cycls_to_cycls", "PSP-CYCLS-TO-CYCLS", 1, 0, false);
        declareFunction("psp_cycl_E", "PSP-CYCL-=", 2, 0, false);
        declareFunction("new_psp_weighted_cycl", "NEW-PSP-WEIGHTED-CYCL", 2, 0, false);
        declareFunction("copy_psp_cycls", "COPY-PSP-CYCLS", 1, 0, false);
        declareFunction("copy_psp_cycl", "COPY-PSP-CYCL", 1, 0, false);
        declareFunction("psp_cycl_subst", "PSP-CYCL-SUBST", 3, 0, false);
        declareFunction("psp_weighted_cycl_set_cycl", "PSP-WEIGHTED-CYCL-SET-CYCL", 2, 0, false);
        declareFunction("psp_weighted_cycl_set_weight", "PSP-WEIGHTED-CYCL-SET-WEIGHT", 2, 0, false);
        declareFunction("psp_semantics_for_edge", "PSP-SEMANTICS-FOR-EDGE", 1, 2, false);
        declareFunction("psp_semantics_for_edge_int", "PSP-SEMANTICS-FOR-EDGE-INT", 2, 0, false);
        declareFunction("psp_compute_semantics", "PSP-COMPUTE-SEMANTICS", 3, 0, false);
        declareFunction("psp_semantic_output_type", "PSP-SEMANTIC-OUTPUT-TYPE", 2, 0, false);
        declareFunction("psp_template_form", "PSP-TEMPLATE-FORM", 1, 0, false);
        declareFunction("psp_semantic_computation_type", "PSP-SEMANTIC-COMPUTATION-TYPE", 2, 0, false);
        declareFunction("clear_psp_category_from_frame", "CLEAR-PSP-CATEGORY-FROM-FRAME", 0, 0, false);
        declareFunction("remove_psp_category_from_frame", "REMOVE-PSP-CATEGORY-FROM-FRAME", 1, 1, false);
        declareFunction("psp_category_from_frame_internal", "PSP-CATEGORY-FROM-FRAME-INTERNAL", 2, 0, false);
        declareFunction("psp_category_from_frame", "PSP-CATEGORY-FROM-FRAME", 1, 1, false);
        declareFunction("psp_edge_lexical_semx", "PSP-EDGE-LEXICAL-SEMX", 2, 0, false);
        declareFunction("psp_edge_unary_semx", "PSP-EDGE-UNARY-SEMX", 2, 0, false);
        declareFunction("psp_edge_multi_dtr_semx", "PSP-EDGE-MULTI-DTR-SEMX", 2, 0, false);
        declareFunction("psp_determine_semantic_dependencies", "PSP-DETERMINE-SEMANTIC-DEPENDENCIES", 3, 0, false);
        declareFunction("psp_semx_slurp_handlers", "PSP-SEMX-SLURP-HANDLERS", 0, 1, false);
        declareFunction("psp_semx_clear_handlers", "PSP-SEMX-CLEAR-HANDLERS", 0, 0, false);
        declareFunction("psp_special_methods_for_output_type", "PSP-SPECIAL-METHODS-FOR-OUTPUT-TYPE", 1, 0, false);
        declareFunction("psp_edge_semx_specialP", "PSP-EDGE-SEMX-SPECIAL?", 2, 0, false);
        declareFunction("psp_edge_special_method", "PSP-EDGE-SPECIAL-METHOD", 2, 0, false);
        declareFunction("psp_edge_special_semx", "PSP-EDGE-SPECIAL-SEMX", 2, 0, false);
        declareFunction("psp_semx_for_participle_rel_clause_nbar", "PSP-SEMX-FOR-PARTICIPLE-REL-CLAUSE-NBAR", 1, 0, false);
        declareFunction("psp_semx_for_det_nbar", "PSP-SEMX-FOR-DET-NBAR", 1, 0, false);
        declareFunction("psp_possessive_det_posP", "PSP-POSSESSIVE-DET-POS?", 1, 0, false);
        declareFunction("psp_semx_for_of_noun_compound", "PSP-SEMX-FOR-OF-NOUN-COMPOUND", 1, 0, false);
        declareFunction("psp_semx_for_noun_compound", "PSP-SEMX-FOR-NOUN-COMPOUND", 1, 0, false);
        declareFunction("rbp_tokens_from_edge", "RBP-TOKENS-FROM-EDGE", 2, 0, false);
        declareFunction("psp_regular_pluralP", "PSP-REGULAR-PLURAL?", 2, 0, false);
        declareFunction("psp_closed_class_edge_likely_misconstrued_as_nameP", "PSP-CLOSED-CLASS-EDGE-LIKELY-MISCONSTRUED-AS-NAME?", 1, 0, false);
        declareFunction("psp_closed_class_likely_misconstrued_as_nameP", "PSP-CLOSED-CLASS-LIKELY-MISCONSTRUED-AS-NAME?", 3, 0, false);
        declareFunction("psp_parse_noun_compound_tokens_internal", "PSP-PARSE-NOUN-COMPOUND-TOKENS-INTERNAL", 1, 0, false);
        declareFunction("psp_parse_noun_compound_tokens", "PSP-PARSE-NOUN-COMPOUND-TOKENS", 1, 0, false);
        declareFunction("psp_semx_for_gerund_np", "PSP-SEMX-FOR-GERUND-NP", 1, 0, false);
        declareFunction("psp_semx_for_appositive_np", "PSP-SEMX-FOR-APPOSITIVE-NP", 1, 0, false);
        declareFunction("psp_modifier_dtrP", "PSP-MODIFIER-DTR?", 2, 0, false);
        declareFunction("psp_head_key_from_bindings", "PSP-HEAD-KEY-FROM-BINDINGS", 2, 0, false);
        declareFunction("psp_coerce_templates_to_collections", "PSP-COERCE-TEMPLATES-TO-COLLECTIONS", 4, 0, false);
        declareFunction("psp_coerce_template_to_collection", "PSP-COERCE-TEMPLATE-TO-COLLECTION", 3, 0, false);
        declareFunction("psp_coerce_template_to_collection_memoized_internal", "PSP-COERCE-TEMPLATE-TO-COLLECTION-MEMOIZED-INTERNAL", 3, 0, false);
        declareFunction("psp_coerce_template_to_collection_memoized", "PSP-COERCE-TEMPLATE-TO-COLLECTION-MEMOIZED", 3, 0, false);
        declareFunction("psp_handle_keywords_in_formula", "PSP-HANDLE-KEYWORDS-IN-FORMULA", 3, 0, false);
        declareFunction("psp_handle_keyword_in_formula", "PSP-HANDLE-KEYWORD-IN-FORMULA", 2, 0, false);
        declareFunction("psp_davidsonian_clause_p", "PSP-DAVIDSONIAN-CLAUSE-P", 1, 1, false);
        declareFunction("psp_make_davidsonian_clause", "PSP-MAKE-DAVIDSONIAN-CLAUSE", 2, 0, false);
        declareFunction("psp_find_isa", "PSP-FIND-ISA", 2, 0, false);
        declareFunction("psp_extract_head_semx", "PSP-EXTRACT-HEAD-SEMX", 2, 0, false);
        declareFunction("psp_dnf_clausal_form", "PSP-DNF-CLAUSAL-FORM", 1, 0, false);
        declareFunction("psp_dnf_for_sentence", "PSP-DNF-FOR-SENTENCE", 1, 0, false);
        declareFunction("clear_psp_head_key_for_category", "CLEAR-PSP-HEAD-KEY-FOR-CATEGORY", 0, 0, false);
        declareFunction("remove_psp_head_key_for_category", "REMOVE-PSP-HEAD-KEY-FOR-CATEGORY", 1, 1, false);
        declareFunction("psp_head_key_for_category_internal", "PSP-HEAD-KEY-FOR-CATEGORY-INTERNAL", 2, 0, false);
        declareFunction("psp_head_key_for_category", "PSP-HEAD-KEY-FOR-CATEGORY", 1, 1, false);
        declareFunction("psp_substitute_bindings_internal", "PSP-SUBSTITUTE-BINDINGS-INTERNAL", 3, 0, false);
        declareFunction("psp_substitute_bindings", "PSP-SUBSTITUTE-BINDINGS", 3, 0, false);
        declareFunction("psp_add_some_fn", "PSP-ADD-SOME-FN", 1, 0, false);
        declareFunction("psp_rename_variables", "PSP-RENAME-VARIABLES", 2, 0, false);
        declareFunction("psp_substitute_bindings_coll", "PSP-SUBSTITUTE-BINDINGS-COLL", 4, 0, false);
        declareFunction("psp_process_bindings", "PSP-PROCESS-BINDINGS", 4, 0, false);
        declareFunction("psp_template_keywordP", "PSP-TEMPLATE-KEYWORD?", 1, 0, false);
        declareFunction("psp_process_bindings_int", "PSP-PROCESS-BINDINGS-INT", 1, 0, false);
        declareFunction("validate_binding_pair", "VALIDATE-BINDING-PAIR", 1, 0, false);
        declareFunction("psp_collectionP", "PSP-COLLECTION?", 1, 0, false);
        declareFunction("psp_collection_memoizedP_internal", "PSP-COLLECTION-MEMOIZED?-INTERNAL", 1, 0, false);
        declareFunction("psp_collection_memoizedP", "PSP-COLLECTION-MEMOIZED?", 1, 0, false);
        declareFunction("psp_reformulate", "PSP-REFORMULATE", 1, 0, false);
        declareFunction("psp_reformulate_int_internal", "PSP-REFORMULATE-INT-INTERNAL", 1, 0, false);
        declareFunction("psp_reformulate_int", "PSP-REFORMULATE-INT", 1, 0, false);
        declareFunction("psp_reformulate_cycls", "PSP-REFORMULATE-CYCLS", 1, 0, false);
        declareFunction("psp_disc_resolve_sentence_entities", "PSP-DISC-RESOLVE-SENTENCE-ENTITIES", 1, 0, false);
        declareFunction("psp_wffP_internal", "PSP-WFF?-INTERNAL", 2, 0, false);
        declareFunction("psp_wffP", "PSP-WFF?", 2, 0, false);
        declareFunction("psp_wffP_int", "PSP-WFF?-INT", 2, 0, false);
        declareFunction("psp_indexical_bindings_p", "PSP-INDEXICAL-BINDINGS-P", 1, 0, false);
        declareFunction("psp_sem_templates_from_lexical_edge_internal", "PSP-SEM-TEMPLATES-FROM-LEXICAL-EDGE-INTERNAL", 1, 0, false);
        declareFunction("psp_sem_templates_from_lexical_edge", "PSP-SEM-TEMPLATES-FROM-LEXICAL-EDGE", 1, 0, false);
        declareFunction("psp_noun_sem_trans_cycls", "PSP-NOUN-SEM-TRANS-CYCLS", 3, 0, false);
        declareFunction("psp_bad_templateP", "PSP-BAD-TEMPLATE?", 2, 0, false);
        declareFunction("psp_raw_templates", "PSP-RAW-TEMPLATES", 3, 0, false);
        declareFunction("psp_lookup_templates_memoized_internal", "PSP-LOOKUP-TEMPLATES-MEMOIZED-INTERNAL", 4, 2, false);
        declareFunction("psp_lookup_templates_memoized", "PSP-LOOKUP-TEMPLATES-MEMOIZED", 4, 2, false);
        declareFunction("psp_frame_type_from_context", "PSP-FRAME-TYPE-FROM-CONTEXT", 2, 0, false);
        declareFunction("psp_roles_for_denot_internal", "PSP-ROLES-FOR-DENOT-INTERNAL", 1, 0, false);
        declareFunction("psp_roles_for_denot", "PSP-ROLES-FOR-DENOT", 1, 0, false);
        declareFunction("psp_devise_templates", "PSP-DEVISE-TEMPLATES", 3, 0, false);
        declareFunction("psp_devise_word_templates", "PSP-DEVISE-WORD-TEMPLATES", 4, 0, false);
        declareFunction("psp_devise_verb_templates", "PSP-DEVISE-VERB-TEMPLATES", 2, 0, false);
        declareFunction("clear_psp_genl_posP", "CLEAR-PSP-GENL-POS?", 0, 0, false);
        declareFunction("remove_psp_genl_posP", "REMOVE-PSP-GENL-POS?", 2, 1, false);
        declareFunction("psp_genl_posP_internal", "PSP-GENL-POS?-INTERNAL", 3, 0, false);
        declareFunction("psp_genl_posP", "PSP-GENL-POS?", 2, 1, false);
        declareFunction("psp_devise_noun_templates_internal", "PSP-DEVISE-NOUN-TEMPLATES-INTERNAL", 3, 0, false);
        declareFunction("psp_devise_noun_templates", "PSP-DEVISE-NOUN-TEMPLATES", 3, 0, false);
        declareFunction("psp_devise_deverbal_noun_templates", "PSP-DEVISE-DEVERBAL-NOUN-TEMPLATES", 2, 0, false);
        declareFunction("psp_devise_deverbal_noun_template_internal", "PSP-DEVISE-DEVERBAL-NOUN-TEMPLATE-INTERNAL", 2, 0, false);
        declareFunction("psp_devise_deverbal_noun_template", "PSP-DEVISE-DEVERBAL-NOUN-TEMPLATE", 2, 0, false);
        declareFunction("psp_passivize_templates", "PSP-PASSIVIZE-TEMPLATES", 2, 0, false);
        declareFunction("psp_passivize_template_internal", "PSP-PASSIVIZE-TEMPLATE-INTERNAL", 3, 0, false);
        declareFunction("psp_passivize_template", "PSP-PASSIVIZE-TEMPLATE", 3, 0, false);
        declareFunction("psp_quantify_templates", "PSP-QUANTIFY-TEMPLATES", 1, 0, false);
        declareFunction("psp_quantify_template_internal", "PSP-QUANTIFY-TEMPLATE-INTERNAL", 1, 0, false);
        declareFunction("psp_quantify_template", "PSP-QUANTIFY-TEMPLATE", 1, 0, false);
        declareFunction("psp_quantifiable_template_p", "PSP-QUANTIFIABLE-TEMPLATE-P", 1, 0, false);
        declareFunction("psp_make_conjunction", "PSP-MAKE-CONJUNCTION", 1, 0, false);
        declareFunction("psp_make_disjunction", "PSP-MAKE-DISJUNCTION", 1, 0, false);
        declareFunction("psp_make_existential", "PSP-MAKE-EXISTENTIAL", 2, 0, false);
        declareFunction("psp_davidsonianize_verb_templates", "PSP-DAVIDSONIANIZE-VERB-TEMPLATES", 2, 0, false);
        declareFunction("psp_davidsonianize_verb_template_internal", "PSP-DAVIDSONIANIZE-VERB-TEMPLATE-INTERNAL", 1, 0, false);
        declareFunction("psp_davidsonianize_verb_template", "PSP-DAVIDSONIANIZE-VERB-TEMPLATE", 1, 0, false);
        declareFunction("psp_action_type", "PSP-ACTION-TYPE", 1, 0, false);
        declareFunction("psp_contains_isa_clauseP", "PSP-CONTAINS-ISA-CLAUSE?", 2, 0, false);
        declareFunction("psp_ok_templateP", "PSP-OK-TEMPLATE?", 2, 1, false);
        declareFunction("psp_ok_templateP_int_internal", "PSP-OK-TEMPLATE?-INT-INTERNAL", 3, 0, false);
        declareFunction("psp_ok_templateP_int", "PSP-OK-TEMPLATE?-INT", 3, 0, false);
        declareFunction("psp_no_isa_clause_neededP", "PSP-NO-ISA-CLAUSE-NEEDED?", 1, 0, false);
        declareFunction("psp_add_nl_tags", "PSP-ADD-NL-TAGS", 2, 0, false);
        declareFunction("psp_add_name_tags", "PSP-ADD-NAME-TAGS", 2, 0, false);
        declareFunction("psp_add_nbar_tags", "PSP-ADD-NBAR-TAGS", 2, 0, false);
        declareFunction("psp_guess_agr_pred", "PSP-GUESS-AGR-PRED", 1, 0, false);
        declareFunction("psp_add_np_tags", "PSP-ADD-NP-TAGS", 2, 0, false);
        declareFunction("psp_nl_tag_addedP", "PSP-NL-TAG-ADDED?", 2, 0, false);
        declareFunction("psp_extract_subject_semx", "PSP-EXTRACT-SUBJECT-SEMX", 1, 0, false);
        declareFunction("psp_extract_subject_semx_int_internal", "PSP-EXTRACT-SUBJECT-SEMX-INT-INTERNAL", 1, 0, false);
        declareFunction("psp_extract_subject_semx_int", "PSP-EXTRACT-SUBJECT-SEMX-INT", 1, 0, false);
        declareFunction("psp_cyclify_subject", "PSP-CYCLIFY-SUBJECT", 1, 0, false);
        declareFunction("psp_quantify_subject", "PSP-QUANTIFY-SUBJECT", 1, 0, false);
        declareFunction("psp_subject_clauseP", "PSP-SUBJECT-CLAUSE?", 1, 0, false);
        declareFunction("psp_filter_cycls_by_generality", "PSP-FILTER-CYCLS-BY-GENERALITY", 1, 0, false);
        declareFunction("psp_remove_dispreferred_cycls_internal", "PSP-REMOVE-DISPREFERRED-CYCLS-INTERNAL", 1, 0, false);
        declareFunction("psp_remove_dispreferred_cycls", "PSP-REMOVE-DISPREFERRED-CYCLS", 1, 0, false);
        declareFunction("psp_less_preferable_cyclP", "PSP-LESS-PREFERABLE-CYCL?", 2, 0, false);
        declareFunction("psp_less_preferable_cyclP_recursive", "PSP-LESS-PREFERABLE-CYCL?-RECURSIVE", 2, 0, false);
        declareFunction("psp_nsort_cycls_by_generality", "PSP-NSORT-CYCLS-BY-GENERALITY", 1, 0, false);
        declareFunction("psp_sort_cycls_by_generality", "PSP-SORT-CYCLS-BY-GENERALITY", 1, 0, false);
        declareFunction("psp_generality_estimate", "PSP-GENERALITY-ESTIMATE", 1, 0, false);
        declareFunction("psp_generality_estimate_recursive", "PSP-GENERALITY-ESTIMATE-RECURSIVE", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_psp_semantics_file_alt() {
        defparameter("*PSP-CONTEXT*", NIL);
        defconstant("*DTP-PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL*", PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL);
        deflexical("*PSP-CATEGORY-FROM-FRAME-CACHING-STATE*", NIL);
        deflexical("*PSP-SPECIAL-SEMANTIC-METHODS*", NIL != boundp($psp_special_semantic_methods$) ? ((SubLObject) ($psp_special_semantic_methods$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        deflexical("*PSP-HEAD-KEY-FOR-CATEGORY-CACHING-STATE*", NIL);
        deflexical("*PSP-REFORMULATOR-MODULES-TO-SKIP*", $list_alt134);
        deflexical("*PSP-GENL-POS?-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject init_psp_semantics_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*PSP-CONTEXT*", NIL);
            defconstant("*DTP-PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL*", PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL);
            deflexical("*PSP-CATEGORY-FROM-FRAME-CACHING-STATE*", NIL);
            deflexical("*PSP-SPECIAL-SEMANTIC-METHODS*", SubLTrampolineFile.maybeDefault($psp_special_semantic_methods$, $psp_special_semantic_methods$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
            deflexical("*PSP-HEAD-KEY-FOR-CATEGORY-CACHING-STATE*", NIL);
            deflexical("*PSP-REFORMULATOR-MODULES-TO-SKIP*", $list139);
            deflexical("*PSP-GENL-POS?-CACHING-STATE*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*PSP-SPECIAL-SEMANTIC-METHODS*", NIL != boundp($psp_special_semantic_methods$) ? ((SubLObject) ($psp_special_semantic_methods$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
            deflexical("*PSP-REFORMULATOR-MODULES-TO-SKIP*", $list_alt134);
        }
        return NIL;
    }

    public static SubLObject init_psp_semantics_file_Previous() {
        defparameter("*PSP-CONTEXT*", NIL);
        defconstant("*DTP-PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL*", PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL);
        deflexical("*PSP-CATEGORY-FROM-FRAME-CACHING-STATE*", NIL);
        deflexical("*PSP-SPECIAL-SEMANTIC-METHODS*", SubLTrampolineFile.maybeDefault($psp_special_semantic_methods$, $psp_special_semantic_methods$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
        deflexical("*PSP-HEAD-KEY-FOR-CATEGORY-CACHING-STATE*", NIL);
        deflexical("*PSP-REFORMULATOR-MODULES-TO-SKIP*", $list139);
        deflexical("*PSP-GENL-POS?-CACHING-STATE*", NIL);
        return NIL;
    }

    public static final SubLObject setup_psp_semantics_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_phrase_structure_parser_weighted_cycl$.getGlobalValue(), symbol_function(PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(PSP_WEIGHTED_CYCL_CYCL, _CSETF_PSP_WEIGHTED_CYCL_CYCL);
        def_csetf(PSP_WEIGHTED_CYCL_WEIGHT, _CSETF_PSP_WEIGHTED_CYCL_WEIGHT);
        identity(PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL);
        memoization_state.note_globally_cached_function(PSP_CATEGORY_FROM_FRAME);
        declare_defglobal($psp_special_semantic_methods$);
        memoization_state.note_memoized_function(PSP_PARSE_NOUN_COMPOUND_TOKENS);
        memoization_state.note_memoized_function(PSP_COERCE_TEMPLATE_TO_COLLECTION_MEMOIZED);
        memoization_state.note_globally_cached_function(PSP_HEAD_KEY_FOR_CATEGORY);
        memoization_state.note_memoized_function(PSP_SUBSTITUTE_BINDINGS);
        memoization_state.note_memoized_function($sym133$PSP_COLLECTION_MEMOIZED_);
        memoization_state.note_memoized_function(PSP_REFORMULATE_INT);
        memoization_state.note_memoized_function($sym140$PSP_WFF_);
        memoization_state.note_memoized_function(PSP_SEM_TEMPLATES_FROM_LEXICAL_EDGE);
        memoization_state.note_memoized_function(PSP_LOOKUP_TEMPLATES_MEMOIZED);
        memoization_state.note_memoized_function(PSP_ROLES_FOR_DENOT);
        memoization_state.note_globally_cached_function($sym175$PSP_GENL_POS_);
        memoization_state.note_memoized_function(PSP_DEVISE_NOUN_TEMPLATES);
        memoization_state.note_memoized_function(PSP_DEVISE_DEVERBAL_NOUN_TEMPLATE);
        memoization_state.note_memoized_function(PSP_PASSIVIZE_TEMPLATE);
        memoization_state.note_memoized_function(PSP_QUANTIFY_TEMPLATE);
        memoization_state.note_memoized_function(PSP_DAVIDSONIANIZE_VERB_TEMPLATE);
        memoization_state.note_memoized_function($sym198$PSP_OK_TEMPLATE__INT);
        memoization_state.note_memoized_function(PSP_EXTRACT_SUBJECT_SEMX_INT);
        memoization_state.note_memoized_function(PSP_REMOVE_DISPREFERRED_CYCLS);
        return NIL;
    }

    public static SubLObject setup_psp_semantics_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), $dtp_phrase_structure_parser_weighted_cycl$.getGlobalValue(), symbol_function(PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list8);
            def_csetf(PSP_WEIGHTED_CYCL_CYCL, _CSETF_PSP_WEIGHTED_CYCL_CYCL);
            def_csetf(PSP_WEIGHTED_CYCL_WEIGHT, _CSETF_PSP_WEIGHTED_CYCL_WEIGHT);
            identity(PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_phrase_structure_parser_weighted_cycl$.getGlobalValue(), symbol_function($sym20$VISIT_DEFSTRUCT_OBJECT_PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL_METH));
            memoization_state.note_globally_cached_function(PSP_CATEGORY_FROM_FRAME);
            declare_defglobal($psp_special_semantic_methods$);
            memoization_state.note_memoized_function(PSP_PARSE_NOUN_COMPOUND_TOKENS);
            memoization_state.note_memoized_function(PSP_COERCE_TEMPLATE_TO_COLLECTION_MEMOIZED);
            memoization_state.note_globally_cached_function(PSP_HEAD_KEY_FOR_CATEGORY);
            memoization_state.note_memoized_function(PSP_SUBSTITUTE_BINDINGS);
            memoization_state.note_memoized_function($sym138$PSP_COLLECTION_MEMOIZED_);
            memoization_state.note_memoized_function(PSP_REFORMULATE_INT);
            memoization_state.note_memoized_function($sym144$PSP_WFF_);
            memoization_state.note_memoized_function(PSP_SEM_TEMPLATES_FROM_LEXICAL_EDGE);
            memoization_state.note_memoized_function(PSP_LOOKUP_TEMPLATES_MEMOIZED);
            memoization_state.note_memoized_function(PSP_ROLES_FOR_DENOT);
            memoization_state.note_globally_cached_function($sym176$PSP_GENL_POS_);
            memoization_state.note_memoized_function(PSP_DEVISE_NOUN_TEMPLATES);
            memoization_state.note_memoized_function(PSP_DEVISE_DEVERBAL_NOUN_TEMPLATE);
            memoization_state.note_memoized_function(PSP_PASSIVIZE_TEMPLATE);
            memoization_state.note_memoized_function(PSP_QUANTIFY_TEMPLATE);
            memoization_state.note_memoized_function(PSP_DAVIDSONIANIZE_VERB_TEMPLATE);
            memoization_state.note_memoized_function($sym199$PSP_OK_TEMPLATE__INT);
            memoization_state.note_memoized_function(PSP_EXTRACT_SUBJECT_SEMX_INT);
            memoization_state.note_memoized_function(PSP_REMOVE_DISPREFERRED_CYCLS);
        }
        if (SubLFiles.USE_V2) {
            memoization_state.note_memoized_function($sym133$PSP_COLLECTION_MEMOIZED_);
            memoization_state.note_memoized_function($sym140$PSP_WFF_);
            memoization_state.note_globally_cached_function($sym175$PSP_GENL_POS_);
            memoization_state.note_memoized_function($sym198$PSP_OK_TEMPLATE__INT);
        }
        return NIL;
    }

    public static SubLObject setup_psp_semantics_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_phrase_structure_parser_weighted_cycl$.getGlobalValue(), symbol_function(PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(PSP_WEIGHTED_CYCL_CYCL, _CSETF_PSP_WEIGHTED_CYCL_CYCL);
        def_csetf(PSP_WEIGHTED_CYCL_WEIGHT, _CSETF_PSP_WEIGHTED_CYCL_WEIGHT);
        identity(PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_phrase_structure_parser_weighted_cycl$.getGlobalValue(), symbol_function($sym20$VISIT_DEFSTRUCT_OBJECT_PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL_METH));
        memoization_state.note_globally_cached_function(PSP_CATEGORY_FROM_FRAME);
        declare_defglobal($psp_special_semantic_methods$);
        memoization_state.note_memoized_function(PSP_PARSE_NOUN_COMPOUND_TOKENS);
        memoization_state.note_memoized_function(PSP_COERCE_TEMPLATE_TO_COLLECTION_MEMOIZED);
        memoization_state.note_globally_cached_function(PSP_HEAD_KEY_FOR_CATEGORY);
        memoization_state.note_memoized_function(PSP_SUBSTITUTE_BINDINGS);
        memoization_state.note_memoized_function($sym138$PSP_COLLECTION_MEMOIZED_);
        memoization_state.note_memoized_function(PSP_REFORMULATE_INT);
        memoization_state.note_memoized_function($sym144$PSP_WFF_);
        memoization_state.note_memoized_function(PSP_SEM_TEMPLATES_FROM_LEXICAL_EDGE);
        memoization_state.note_memoized_function(PSP_LOOKUP_TEMPLATES_MEMOIZED);
        memoization_state.note_memoized_function(PSP_ROLES_FOR_DENOT);
        memoization_state.note_globally_cached_function($sym176$PSP_GENL_POS_);
        memoization_state.note_memoized_function(PSP_DEVISE_NOUN_TEMPLATES);
        memoization_state.note_memoized_function(PSP_DEVISE_DEVERBAL_NOUN_TEMPLATE);
        memoization_state.note_memoized_function(PSP_PASSIVIZE_TEMPLATE);
        memoization_state.note_memoized_function(PSP_QUANTIFY_TEMPLATE);
        memoization_state.note_memoized_function(PSP_DAVIDSONIANIZE_VERB_TEMPLATE);
        memoization_state.note_memoized_function($sym199$PSP_OK_TEMPLATE__INT);
        memoization_state.note_memoized_function(PSP_EXTRACT_SUBJECT_SEMX_INT);
        memoization_state.note_memoized_function(PSP_REMOVE_DISPREFERRED_CYCLS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_psp_semantics_file();
    }

    @Override
    public void initializeVariables() {
        init_psp_semantics_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_psp_semantics_file();
    }

    

    public static final class $phrase_structure_parser_weighted_cycl_native extends SubLStructNative {
        public SubLObject $cycl;

        public SubLObject $weight;

        private static final SubLStructDeclNative structDecl;

        public $phrase_structure_parser_weighted_cycl_native() {
            psp_semantics.$phrase_structure_parser_weighted_cycl_native.this.$cycl = Lisp.NIL;
            psp_semantics.$phrase_structure_parser_weighted_cycl_native.this.$weight = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return psp_semantics.$phrase_structure_parser_weighted_cycl_native.this.$cycl;
        }

        @Override
        public SubLObject getField3() {
            return psp_semantics.$phrase_structure_parser_weighted_cycl_native.this.$weight;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return psp_semantics.$phrase_structure_parser_weighted_cycl_native.this.$cycl = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return psp_semantics.$phrase_structure_parser_weighted_cycl_native.this.$weight = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.psp_semantics.$phrase_structure_parser_weighted_cycl_native.class, PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL, PHRASE_STRUCTURE_PARSER_WEIGHTED_CYCL_P, $list2, $list3, new String[]{ "$cycl", "$weight" }, $list4, $list5, PPRINT_PSP_WEIGHTED_CYCL);
        }
    }

    public static final class $phrase_structure_parser_weighted_cycl_p$UnaryFunction extends UnaryFunction {
        public $phrase_structure_parser_weighted_cycl_p$UnaryFunction() {
            super(extractFunctionNamed("PHRASE-STRUCTURE-PARSER-WEIGHTED-CYCL-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return phrase_structure_parser_weighted_cycl_p(arg1);
        }
    }

    static private final SubLList $list_alt2 = list(makeSymbol("CYCL"), makeSymbol("WEIGHT"));

    static private final SubLList $list_alt3 = list($CYCL, makeKeyword("WEIGHT"));

    static private final SubLList $list_alt4 = list(makeSymbol("PSP-WEIGHTED-CYCL-CYCL"), makeSymbol("PSP-WEIGHTED-CYCL-WEIGHT"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-PSP-WEIGHTED-CYCL-CYCL"), makeSymbol("_CSETF-PSP-WEIGHTED-CYCL-WEIGHT"));

    static private final SubLString $str_alt14$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt16$__PSP_WEIGHTED_CYCL__S__S_ = makeString("#<PSP-WEIGHTED-CYCL ~S ~S>");

    static private final SubLString $str_alt17$Weighting_CycL_with_weights_____S = makeString("Weighting CycL with weights:~% ~S");

    static private final SubLSymbol $sym19$PSP_CYCL_WEIGHT__ = makeSymbol("PSP-CYCL-WEIGHT-<");

    static private final SubLList $list_alt30 = list(makeKeyword("DENOT-TEMPLATE"), makeKeyword("DENOT-GROUND"));

    static private final SubLList $list_alt37 = list(reader_make_constant_shell("PhraseFn-Bar1"), reader_make_constant_shell("Verb"));

    public static final SubLSymbol $kw46$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt49$No_templates_for__S___ = makeString("No templates for ~S.~%");

    static private final SubLList $list_alt51 = cons(makeSymbol("DTR-NUM"), makeSymbol("DTR-SEMX"));

    static private final SubLString $str_alt52$__Couldn_t_find_template_semx_for = makeString("~&Couldn't find template semx for ~S with ~S.~%");

    static private final SubLList $list_alt54 = list(makeSymbol("BINDING-SEMX"), makeSymbol("BINDING-KEY"));

    static private final SubLList $list_alt55 = list(makeSymbol("LEVEL"), makeSymbol("BINDING-DTR-NUM"), makeSymbol("BINDING-KEY"));

    static private final SubLList $list_alt59 = list(makeSymbol("RULE"), makeSymbol("METHOD"));

    static private final SubLList $list_alt62 = list(makeSymbol("RULE"), makeSymbol("THIS-METHOD"));

    static private final SubLList $list_alt64 = list(reader_make_constant_shell("SubcollectionOfWithRelationFromFn"), $NBAR, reader_make_constant_shell("possessiveRelation"), makeKeyword("DET"));

    static private final SubLString $str_alt79$Parsed__S_in__S_seconds_ = makeString("Parsed ~S in ~S seconds.");

    static private final SubLList $list_alt82 = list(makeSymbol("PARSE"), makeSymbol("COMMENTS"));

    static private final SubLList $list_alt83 = list(makeSymbol("CYCL"), makeSymbol("POS-PRED"));

    static private final SubLList $list_alt90 = list(makeSymbol("INSTANCE-OR-TYPE?"), makeSymbol("DTR-NUM"), makeSymbol("KEYWORD"));

    static private final SubLSymbol $sym93$PSP_CYCL__ = makeSymbol("PSP-CYCL-=");

    static private final SubLSymbol $sym96$_OBJ = makeSymbol("?OBJ");

    static private final SubLList $list_alt102 = list(makeKeyword("ANYTHING"));

    static private final SubLList $list_alt106 = list(makeSymbol("POS-LITS"), makeSymbol("NEG-LITS"));

    static private final SubLSymbol $sym112$CYC_VAR_ = makeSymbol("CYC-VAR?");

    static private final SubLList $list_alt113 = list(makeSymbol("IN"), makeSymbol("OUT"));

    static private final SubLList $list_alt114 = list(makeKeyword("OBLIQUE-OBJECT"), makeKeyword("OBJECT"), makeKeyword("BY-SUBJECT"));

    static private final SubLList $list_alt115 = list(reader_make_constant_shell("SomeFn"), makeKeyword("REPLACE"));

    static private final SubLString $str_alt117$No_bindings_for__S___ = makeString("No bindings for ~S.~%");

    static private final SubLString $str_alt118$Binding__S_has_no_corresponding_d = makeString("Binding ~S has no corresponding daughter in ~S.~%");

    static private final SubLSymbol $sym120$PSP_COLLECTION_ = makeSymbol("PSP-COLLECTION?");

    static private final SubLString $str_alt124$__No_cycls_found_for____S__ = makeString("~&No cycls found for~% ~S~%");

    static private final SubLString $str_alt125$__All_cycls_were_non_wff_for____S = makeString("~&All cycls were non-wff for~% ~S~%");

    static private final SubLList $list_alt126 = list(NIL, NIL);

    static private final SubLList $list_alt127 = list(makeSymbol("EXISTING-CYCLS"), makeSymbol("EXISTING-KEYWORDS"));

    static private final SubLString $str_alt128$__No_filtered_cycls_for__S = makeString("~&No filtered cycls for ~S");

    static private final SubLList $list_alt129 = list(makeKeyword("INF-COMP"));

    static private final SubLList $list_alt130 = list(makeSymbol("FIRST-CYCLS"), makeSymbol("KEYWORDS"));

    static private final SubLString $str_alt131$Bad_binding_pair___S = makeString("Bad binding pair: ~S");

    static private final SubLSymbol $sym133$PSP_COLLECTION_MEMOIZED_ = makeSymbol("PSP-COLLECTION-MEMOIZED?");

    static private final SubLList $list_alt134 = list(reader_make_constant_shell("QuantifierProcessing-3-RLModule"), reader_make_constant_shell("QuantifierUnifier-3-RLModule"), reader_make_constant_shell("WffViolationResolutionRLModule"), reader_make_constant_shell("QueryProcessingRLModule"), reader_make_constant_shell("DatesReformulatorRLModule"));

    static private final SubLString $str_alt137$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    public static final SubLSymbol $kw138$CLEAR_CACHES_ = makeKeyword("CLEAR-CACHES?");

    static private final SubLSymbol $sym140$PSP_WFF_ = makeSymbol("PSP-WFF?");

    static private final SubLString $str_alt142$__Not_WFF___S__ = makeString("~&Not WFF! ~S~%");

    static private final SubLList $list_alt143 = cons(makeSymbol("INDEXICAL-STRING"), makeSymbol("DENOT"));



    static private final SubLString $str_alt152$_S_is_not_a___SubcategorizationFr = makeString("~S is not a #$SubcategorizationFrame.~%");

    static private final SubLString $str_alt153$_S_is_not_a_known_keyword_for__S_ = makeString("~S is not a known keyword for ~S.~%");

    static private final SubLSymbol $sym165$PRAGMATICALLY_ACCEPTABLE_ = makeSymbol("PRAGMATICALLY-ACCEPTABLE?");

    static private final SubLList $list_alt170 = list(reader_make_constant_shell("possessiveRelation"), makeKeyword("REPLACE"), $NOUN);

    static private final SubLList $list_alt172 = list(reader_make_constant_shell("isa"), $NOUN, makeKeyword("REPLACE"));

    static private final SubLList $list_alt174 = list(reader_make_constant_shell("is-Underspecified"), $NOUN, makeKeyword("REPLACE"));

    static private final SubLSymbol $sym175$PSP_GENL_POS_ = makeSymbol("PSP-GENL-POS?");

    static private final SubLSymbol $sym176$_PSP_GENL_POS__CACHING_STATE_ = makeSymbol("*PSP-GENL-POS?-CACHING-STATE*");

    static private final SubLList $list_alt180 = list(reader_make_constant_shell("PPCompFrameFn"), reader_make_constant_shell("TransitivePPFrameType"), reader_make_constant_shell("Of-TheWord"));

    static private final SubLSymbol $sym183$PSP_SUBJECT_CLAUSE_ = makeSymbol("PSP-SUBJECT-CLAUSE?");

    static private final SubLString $str_alt190$__PSP_MAKE_CONJUNCTION_passed_NIL = makeString("~&PSP-MAKE-CONJUNCTION passed NIL.~%");

    static private final SubLString $str_alt191$__PSP_MAKE_DISJUNCTION_passed_NIL = makeString("~&PSP-MAKE-DISJUNCTION passed NIL.~%");

    static private final SubLList $list_alt193 = list(makeSymbol("TYPE"), makeSymbol("TARGET"), makeSymbol("CONSTRAINT-MT"));

    static private final SubLSymbol $sym198$PSP_OK_TEMPLATE__INT = makeSymbol("PSP-OK-TEMPLATE?-INT");

    static private final SubLString $str_alt199$Non_canonical_semtrans_template__ = makeString("Non-canonical semtrans template (missing #$isa for ~S):~% ~S.~%");

    static private final SubLList $list_alt200 = list(reader_make_constant_shell("Verb"));

    static private final SubLList $list_alt201 = list(reader_make_constant_shell("PSRule-NP-Appositive"), reader_make_constant_shell("PSRule-NPfromPronoun"));

    static private final SubLSymbol $sym211$_SUBJECT = makeSymbol("?SUBJECT");

    static private final SubLSymbol $sym213$PSP_LESS_PREFERABLE_CYCL_ = makeSymbol("PSP-LESS-PREFERABLE-CYCL?");

    static private final SubLSymbol $sym216$_ = makeSymbol(">");

    static private final SubLSymbol $sym218$_ = makeSymbol("<");
}

/**
 * Total time: 1080 ms
 */
