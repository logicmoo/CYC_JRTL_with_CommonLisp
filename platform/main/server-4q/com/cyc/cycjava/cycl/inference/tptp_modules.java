/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.butlast;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.vector_utilities;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      TPTP-MODULES
 *  source file: /cyc/top/cycl/inference/tptp-modules.lisp
 *  created:     2019/07/03 17:38:28
 */
public final class tptp_modules extends SubLTranslatedFile implements V02 {
    // // Constructor
    private tptp_modules() {
    }

    public static final SubLFile me = new tptp_modules();

    public static final String myName = "com.cyc.cycjava.cycl.inference.tptp_modules";

    // // Definitions
    // deflexical
    private static final SubLSymbol $tptp_default_query_properties$ = makeSymbol("*TPTP-DEFAULT-QUERY-PROPERTIES*");



    // deflexical
    private static final SubLSymbol $tptp_linchpin_module_properties$ = makeSymbol("*TPTP-LINCHPIN-MODULE-PROPERTIES*");

    public static final SubLObject tptp_linchpin_module_property_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $tptp_linchpin_module_properties$.getGlobalValue());
    }

    public static final SubLObject tptp_linchpin_module(SubLObject name, SubLObject plist) {
        {
            SubLObject plist_var = plist;
            SubLTrampolineFile.checkType(plist_var, PROPERTY_LIST_P);
            {
                SubLObject remainder = NIL;
                for (remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
                    {
                        SubLObject property = remainder.first();
                        SubLObject value = cadr(remainder);
                        SubLTrampolineFile.checkType(property, TPTP_LINCHPIN_MODULE_PROPERTY_P);
                    }
                }
            }
        }
        dictionary.dictionary_enter($tptp_linchpin_modules$.getGlobalValue(), name, plist);
        return name;
    }

    public static final SubLObject tptp_linchpin_module_name_p(SubLObject v_object) {
        return makeBoolean(v_object.isKeyword() && (NIL != dictionary_utilities.dictionary_has_keyP($tptp_linchpin_modules$.getGlobalValue(), v_object)));
    }

    public static final SubLObject tptp_linchpin_module_property_lookup(SubLObject name, SubLObject property) {
        SubLTrampolineFile.checkType(name, TPTP_LINCHPIN_MODULE_NAME_P);
        {
            SubLObject plist = dictionary.dictionary_lookup_without_values($tptp_linchpin_modules$.getGlobalValue(), name, UNPROVIDED);
            return getf(plist, property, UNPROVIDED);
        }
    }

    public static final SubLObject tptp_linchpin_module_func(SubLObject name) {
        return tptp_linchpin_module_property_lookup(name, $FUNC);
    }

    /**
     * The query generation module to call to generate more linchpins
     */
    public static final SubLObject tptp_linchpin_module_query_generation_module(SubLObject name) {
        return tptp_linchpin_module_property_lookup(name, $QUERY_GENERATION_MODULE);
    }

    public static final SubLObject tptp_linchpin_module_open_okP(SubLObject name) {
        return tptp_query_generation_module_open_okP(tptp_linchpin_module_query_generation_module(name));
    }

    /**
     * Called by tptp-determine-linchpins-for-one-module.
     */
    public static final SubLObject generate_dynamic_tptp_problem(SubLObject linchpin_module_name, SubLObject kb_content, SubLObject problem_num) {
        {
            SubLObject open_okP = tptp_linchpin_module_open_okP(linchpin_module_name);
            SubLObject answerability = $ANSWERABLE;
            SubLObject query_generation_module = tptp_linchpin_module_query_generation_module(linchpin_module_name);
            return generate_tptp_problem(query_generation_module, kb_content, open_okP, answerability, problem_num);
        }
    }

    /**
     * Called by tptp-determine-linchpins-for-one-module.
     */
    public static final SubLObject tptp_linchpin_candidate(SubLObject linchpin_module, SubLObject new_tptp_problem, SubLObject justification_index, SubLObject kb_content) {
        {
            SubLObject result = NIL;
            SubLObject count = ZERO_INTEGER;
            while (NIL == result) {
                {
                    SubLObject func = tptp_linchpin_module_func(linchpin_module);
                    SubLObject linchpin_candidate = funcall(func, new_tptp_problem, justification_index, kb_content);
                    if (NIL != cycl_utilities.expression_find_if($sym9$SYNTHETIC_TERM_, linchpin_candidate, T, UNPROVIDED)) {
                        result = linchpin_candidate;
                    } else {
                        if (NIL != linchpin_candidate) {
                            Errors.warn($str_alt10$rejecting_non_synthetic_linchpin_, linchpin_candidate);
                        }
                    }
                }
                count = add(count, ONE_INTEGER);
                if (count.numG($int$100)) {
                    Errors.warn($str_alt12$Could_not_generate_a_linchpin_can, linchpin_module, tptp_datastructures.printable_tptp_problem(new_tptp_problem));
                    return NIL;
                }
            } 
            return result;
        }
    }

    public static final SubLObject generate_tptp_problem(SubLObject query_generation_module, SubLObject kb_content, SubLObject open_okP, SubLObject answerability, SubLObject problem_num) {
        {
            SubLObject openness = (NIL != open_okP) ? ((SubLObject) (NIL != number_utilities.coin_flip() ? ((SubLObject) ($OPEN)) : $CLOSED)) : $CLOSED;
            SubLObject skeletal_tptp_problem = list($ANSWERABILITY, answerability, $OPENNESS, openness);
            SubLObject tptp_problem = generate_tptp_problem_from_module(query_generation_module, skeletal_tptp_problem, kb_content, problem_num);
            return tptp_problem;
        }
    }

    /**
     * Assumes that NEW-TPTP-PROBLEM is not yet indexed in JUSTIFICATION-INDEX.
     */
    public static final SubLObject tptp_lookup_linchpin_candidate(SubLObject new_tptp_problem, SubLObject justification_index, SubLObject kb_content) {
        {
            SubLObject justification = tptp_datastructures.tptp_problem_non_core_justification(new_tptp_problem);
            if (NIL != list_utilities.singletonP(justification)) {
                {
                    SubLObject support = list_utilities.only_one(justification);
                    if (NIL == tptp_problem_generator.tptp_justification_index_lookup(support, justification_index)) {
                        return support;
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Assumes that NEW-TPTP-PROBLEM is not yet indexed in JUSTIFICATION-INDEX.
     */
    public static final SubLObject tptp_genls_linchpin_candidate(SubLObject new_tptp_problem, SubLObject justification_index, SubLObject kb_content) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject candidates = NIL;
                SubLObject cycl_query = tptp_datastructures.tptp_problem_query(new_tptp_problem);
                SubLObject pattern = $list_alt21;
                thread.resetMultipleValues();
                {
                    SubLObject success = formula_pattern_match.formula_matches_pattern(cycl_query, pattern);
                    SubLObject v_bindings = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != success) {
                        {
                            SubLObject synthetic_genl = list_utilities.alist_lookup_without_values(v_bindings, SYNTHETIC_GENL, UNPROVIDED, UNPROVIDED);
                            SubLObject justification = tptp_datastructures.tptp_problem_non_core_justification(new_tptp_problem);
                            SubLObject cdolist_list_var = justification;
                            SubLObject support = NIL;
                            for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                                if (((NIL != assertion_utilities.genls_gaf_p(support)) && (NIL != tptp_kb_content_generator.synthetic_termP(assertions_high.gaf_arg1(support)))) && (synthetic_genl == assertions_high.gaf_arg2(support))) {
                                    {
                                        SubLObject dependent_problem_nums = tptp_problem_generator.tptp_justification_index_lookup(support, justification_index);
                                        if (NIL == dependent_problem_nums) {
                                            candidates = cons(support, candidates);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return list_utilities.random_element(candidates);
            }
        }
    }

    public static final SubLObject tptp_any_instances_linchpin_candidate(SubLObject new_tptp_problem, SubLObject justification_index, SubLObject kb_content) {
        {
            SubLObject ist_query = tptp_datastructures.tptp_problem_query(new_tptp_problem);
            SubLObject query = el_utilities.designated_sentence(ist_query);
            SubLObject query_col = cycl_utilities.atomic_sentence_arg2(query, UNPROVIDED);
            SubLObject justification = tptp_datastructures.tptp_problem_non_core_justification(new_tptp_problem);
            SubLObject cdolist_list_var = justification;
            SubLObject support = NIL;
            for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                if (NIL != assertion_utilities.isa_gaf_p(support)) {
                    {
                        SubLObject support_ins = assertions_high.gaf_arg1(support);
                        SubLObject support_col = assertions_high.gaf_arg2(support);
                        if (query_col == support_col) {
                            {
                                SubLObject dependent_problem_nums = tptp_problem_generator.tptp_justification_index_lookup(support_ins, justification_index);
                                if (NIL == dependent_problem_nums) {
                                    return support_ins;
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Assumes that NEW-TPTP-PROBLEM is not yet indexed in JUSTIFICATION-INDEX.
     */
    public static final SubLObject tptp_disjoint_with_linchpin_candidate(SubLObject new_tptp_problem, SubLObject justification_index, SubLObject kb_content) {
        {
            SubLObject candidates = NIL;
            SubLObject justification = tptp_datastructures.tptp_problem_non_core_justification(new_tptp_problem);
            SubLObject cdolist_list_var = justification;
            SubLObject support = NIL;
            for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                if (NIL == tptp_problem_generator.tptp_justification_index_lookup(support, justification_index)) {
                    if (NIL != assertion_utilities.gaf_assertion_with_any_of_preds_p(support, $list_alt27)) {
                        candidates = cons(support, candidates);
                    }
                }
            }
            return list_utilities.random_element(candidates);
        }
    }

    /**
     * Assumes that NEW-TPTP-PROBLEM is not yet indexed in JUSTIFICATION-INDEX.
     */
    public static final SubLObject tptp_genl_preds_linchpin_candidate(SubLObject new_tptp_problem, SubLObject justification_index, SubLObject kb_content) {
        {
            SubLObject candidates = NIL;
            SubLObject justification = tptp_datastructures.tptp_problem_non_core_justification(new_tptp_problem);
            SubLObject cdolist_list_var = justification;
            SubLObject support = NIL;
            for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                if (NIL == tptp_problem_generator.tptp_justification_index_lookup(support, justification_index)) {
                    if (NIL != assertion_utilities.gaf_assertion_with_any_of_preds_p(support, $list_alt33)) {
                        if (assertions_high.gaf_arg2(support) == tptp_kb_content_generator.tptp_kb_content_part_types_pred(kb_content)) {
                            Errors.warn($str_alt34$Ignoring_too_high_support___a, support);
                        } else {
                            candidates = cons(support, candidates);
                        }
                    }
                }
            }
            return list_utilities.random_element(candidates);
        }
    }

    public static final SubLObject tptp_genl_preds_lookup_linchpin_candidate(SubLObject new_tptp_problem, SubLObject justification_index, SubLObject kb_content) {
        return tptp_genl_preds_linchpin_candidate(new_tptp_problem, justification_index, kb_content);
    }

    public static final SubLObject tptp_genl_inverse_lookup_linchpin_candidate(SubLObject new_tptp_problem, SubLObject justification_index, SubLObject kb_content) {
        return tptp_genl_preds_linchpin_candidate(new_tptp_problem, justification_index, kb_content);
    }

    public static final SubLObject tptp_relation_all_instance_lookup_linchpin_candidate(SubLObject new_tptp_problem, SubLObject justification_index, SubLObject kb_content) {
        {
            SubLObject candidates = NIL;
            SubLObject justification = tptp_datastructures.tptp_problem_non_core_justification(new_tptp_problem);
            SubLObject cdolist_list_var = justification;
            SubLObject support = NIL;
            for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                if (NIL == tptp_problem_generator.tptp_justification_index_lookup(support, justification_index)) {
                    if (NIL != assertion_utilities.gaf_assertion_with_pred_p(support, $$relationAllInstance)) {
                        candidates = cons(support, candidates);
                    }
                }
            }
            return list_utilities.random_element(candidates);
        }
    }

    public static final SubLObject tptp_relation_all_exists_lookup_linchpin_candidate(SubLObject new_tptp_problem, SubLObject justification_index, SubLObject kb_content) {
        {
            SubLObject candidates = NIL;
            SubLObject justification = tptp_datastructures.tptp_problem_non_core_justification(new_tptp_problem);
            SubLObject cdolist_list_var = justification;
            SubLObject support = NIL;
            for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                if (NIL == tptp_problem_generator.tptp_justification_index_lookup(support, justification_index)) {
                    if (NIL != assertion_utilities.gaf_assertion_with_pred_p(support, $$relationAllExists)) {
                        candidates = cons(support, candidates);
                    }
                }
            }
            return list_utilities.random_element(candidates);
        }
    }

    public static final SubLObject tptp_geographical_sub_regions_linchpin_candidate(SubLObject new_tptp_problem, SubLObject justification_index, SubLObject kb_content) {
        {
            SubLObject candidates = NIL;
            SubLObject justification = tptp_datastructures.tptp_problem_non_core_justification(new_tptp_problem);
            SubLObject cdolist_list_var = justification;
            SubLObject support = NIL;
            for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                if (NIL == tptp_problem_generator.tptp_justification_index_lookup(support, justification_index)) {
                    if (NIL != assertion_utilities.gaf_assertion_with_pred_p(support, $$geographicalSubRegions)) {
                        candidates = cons(support, candidates);
                    }
                }
            }
            return list_utilities.random_element(candidates);
        }
    }

    public static final SubLObject tptp_tva_through_geographical_sub_regions_linchpin_candidate(SubLObject new_tptp_problem, SubLObject justification_index, SubLObject kb_content) {
        {
            SubLObject candidates = NIL;
            SubLObject justification = tptp_datastructures.tptp_problem_non_core_justification(new_tptp_problem);
            SubLObject cdolist_list_var = justification;
            SubLObject support = NIL;
            for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                if (NIL == tptp_problem_generator.tptp_justification_index_lookup(support, justification_index)) {
                    if (NIL != assertion_utilities.gaf_assertion_with_pred_p(support, $$geographicalSubRegions)) {
                        candidates = cons(support, candidates);
                    }
                }
            }
            return list_utilities.random_element(candidates);
        }
    }

    public static final SubLObject tptp_genl_mt_link_linchpin_candidate(SubLObject new_tptp_problem, SubLObject justification_index, SubLObject kb_content) {
        {
            SubLObject candidates = NIL;
            SubLObject useful_mt_set = set.new_set(symbol_function(EQ), UNPROVIDED);
            {
                SubLObject justification = tptp_datastructures.tptp_problem_non_core_justification(new_tptp_problem);
                SubLObject member_mts = tptp_kb_content_generator.tptp_kb_content_geo_spindle_member_mts(kb_content);
                SubLObject collector_mt = tptp_kb_content_generator.tptp_kb_content_geo_spindle_collector_mt(kb_content);
                SubLObject cdolist_list_var = justification;
                SubLObject support = NIL;
                for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                    set.set_add(arguments.support_mt(support), useful_mt_set);
                    if (NIL == tptp_problem_generator.tptp_justification_index_lookup(support, justification_index)) {
                        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(support, $$genlMt)) {
                            {
                                SubLObject spec_mt = assertions_high.gaf_arg1(support);
                                SubLObject genl_mt = assertions_high.gaf_arg2(support);
                                if ((spec_mt == collector_mt) && (NIL != list_utilities.member_eqP(genl_mt, member_mts))) {
                                    candidates = cons(support, candidates);
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject useful_candidates = NIL;
                SubLObject cdolist_list_var = candidates;
                SubLObject candidate = NIL;
                for (candidate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate = cdolist_list_var.first()) {
                    if (NIL != set.set_memberP(assertions_high.gaf_arg2(candidate), useful_mt_set)) {
                        useful_candidates = cons(candidate, useful_candidates);
                    }
                }
            }
            return list_utilities.random_element(candidates);
        }
    }

    public static final SubLObject tptp_mt_linchpin_candidate(SubLObject new_tptp_problem, SubLObject justification_index, SubLObject kb_content) {
        {
            SubLObject genl_mt_link_linchpin = tptp_genl_mt_link_linchpin_candidate(new_tptp_problem, justification_index, kb_content);
            if (NIL != genl_mt_link_linchpin) {
                {
                    SubLObject mt = assertions_high.gaf_arg2(genl_mt_link_linchpin);
                    if (NIL == tptp_problem_generator.tptp_justification_index_lookup(mt, justification_index)) {
                        return mt;
                    }
                }
            }
        }
        return NIL;
    }



    // deflexical
    private static final SubLSymbol $tptp_query_generation_module_properties$ = makeSymbol("*TPTP-QUERY-GENERATION-MODULE-PROPERTIES*");

    public static final SubLObject tptp_query_generation_module_property_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $tptp_query_generation_module_properties$.getGlobalValue());
    }

    public static final SubLObject tptp_query_generation_module(SubLObject name, SubLObject plist) {
        {
            SubLObject plist_var = plist;
            SubLTrampolineFile.checkType(plist_var, PROPERTY_LIST_P);
            {
                SubLObject remainder = NIL;
                for (remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
                    {
                        SubLObject property = remainder.first();
                        SubLObject value = cadr(remainder);
                        SubLTrampolineFile.checkType(property, TPTP_QUERY_GENERATION_MODULE_PROPERTY_P);
                    }
                }
            }
        }
        dictionary.dictionary_enter($tptp_query_generation_modules$.getGlobalValue(), name, plist);
        return name;
    }

    public static final SubLObject tptp_query_generation_module_name_p(SubLObject v_object) {
        return makeBoolean(v_object.isKeyword() && (NIL != dictionary_utilities.dictionary_has_keyP($tptp_query_generation_modules$.getGlobalValue(), v_object)));
    }

    public static final SubLObject tptp_query_generation_module_func(SubLObject name) {
        {
            SubLObject plist = dictionary.dictionary_lookup_without_values($tptp_query_generation_modules$.getGlobalValue(), name, UNPROVIDED);
            return getf(plist, $FUNC, UNPROVIDED);
        }
    }

    public static final SubLObject tptp_query_generation_module_open_okP(SubLObject name) {
        {
            SubLObject plist = dictionary.dictionary_lookup_without_values($tptp_query_generation_modules$.getGlobalValue(), name, UNPROVIDED);
            return getf(plist, $kw67$OPEN_OK_, UNPROVIDED);
        }
    }

    public static final SubLObject tptp_query_generation_module_comment(SubLObject name) {
        {
            SubLObject plist = dictionary.dictionary_lookup_without_values($tptp_query_generation_modules$.getGlobalValue(), name, UNPROVIDED);
            return getf(plist, $COMMENT, UNPROVIDED);
        }
    }

    public static final SubLObject invoke_tptp_query_generation_module(SubLObject module_name, SubLObject skeletal_tptp_problem, SubLObject kb_content) {
        {
            SubLObject func = tptp_query_generation_module_func(module_name);
            return funcall(func, skeletal_tptp_problem, kb_content);
        }
    }

    public static final SubLObject generate_static_tptp_problem(SubLObject query_generation_module, SubLObject answerability, SubLObject kb_content, SubLObject problem_num) {
        {
            SubLObject open_okP = tptp_query_generation_module_open_okP(query_generation_module);
            return generate_tptp_problem(query_generation_module, kb_content, open_okP, answerability, problem_num);
        }
    }

    /**
     * The common internals of generate-static-tptp-problem and generate-dynamic-tptp-problem
     */
    public static final SubLObject generate_tptp_problem_from_module(SubLObject module_name, SubLObject skeletal_tptp_problem, SubLObject kb_content, SubLObject problem_num) {
        {
            SubLObject count = ZERO_INTEGER;
            SubLObject tptp_problem = NIL;
            while (NIL == tptp_problem) {
                tptp_problem = generate_tptp_problem_from_module_int(module_name, skeletal_tptp_problem, kb_content, problem_num);
                count = add(count, ONE_INTEGER);
                if (count.numG($int$30)) {
                    Errors.warn($str_alt70$Could_not_generate_TPTP_problem_w, module_name, skeletal_tptp_problem);
                    return NIL;
                }
            } 
            return tptp_problem;
        }
    }

    public static final SubLObject generate_tptp_problem_from_module_int(SubLObject module_name, SubLObject skeletal_tptp_problem, SubLObject kb_content, SubLObject problem_num) {
        {
            SubLObject cycl_query = invoke_tptp_query_generation_module(module_name, skeletal_tptp_problem, kb_content);
            if (NIL != cycl_query) {
                if (NIL != tptp_problem_generator.cycl_query_folifiableP(cycl_query)) {
                    return generate_tptp_problem_from_query(cycl_query, skeletal_tptp_problem, problem_num, module_name);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject test_query_generation_module(SubLObject module_name, SubLObject n, SubLObject kb_content) {
        SubLTrampolineFile.checkType(module_name, TPTP_QUERY_GENERATION_MODULE_NAME_P);
        {
            SubLObject cdolist_list_var = $list_alt72;
            SubLObject openness = NIL;
            for (openness = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , openness = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_1 = tptp_datastructures.both_answerabilities_in_random_order();
                    SubLObject answerability = NIL;
                    for (answerability = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , answerability = cdolist_list_var_1.first()) {
                        {
                            SubLObject skeletal_tptp_problem = tptp_datastructures.new_skeletal_tptp_problem(openness, answerability);
                            if (($OPEN != tptp_datastructures.tptp_problem_openness(skeletal_tptp_problem)) || (NIL != tptp_query_generation_module_open_okP(module_name))) {
                                terpri(UNPROVIDED);
                                print(skeletal_tptp_problem, UNPROVIDED);
                                {
                                    SubLObject i = NIL;
                                    for (i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
                                        test_query_generation_module_once(module_name, skeletal_tptp_problem, kb_content);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject test_query_generation_module_once(SubLObject module_name, SubLObject skeletal_tptp_problem, SubLObject kb_content) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tptp_problem = generate_tptp_problem_from_module(module_name, skeletal_tptp_problem, kb_content, $int$212);
                SubLObject cycl_ist_query = tptp_datastructures.tptp_problem_query(tptp_problem);
                print(cycl_ist_query, UNPROVIDED);
                force_output(UNPROVIDED);
                if (NIL != cycl_ist_query) {
                    thread.resetMultipleValues();
                    {
                        SubLObject cycl_query = czer_utilities.unwrap_if_ist_permissive(cycl_ist_query, UNPROVIDED);
                        SubLObject mt = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == query_has_opennessP(cycl_ist_query, tptp_datastructures.tptp_problem_openness(skeletal_tptp_problem))) {
                                Errors.error($$$Openness_violation);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == query_has_answerabilityP(cycl_query, mt, tptp_datastructures.tptp_problem_answerability(skeletal_tptp_problem), UNPROVIDED)) {
                                Errors.error($$$Answerability_violation);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Some of these properties will change later, like the number and output filename
     */
    public static final SubLObject generate_tptp_problem_from_query(SubLObject query, SubLObject skeletal_tptp_problem, SubLObject i, SubLObject module_name) {
        {
            SubLObject answerableP = eq($ANSWERABLE, tptp_datastructures.tptp_problem_answerability(skeletal_tptp_problem));
            SubLObject justification = (NIL != answerableP) ? ((SubLObject) (tptp_query_expanded_justification(query, NIL, UNPROVIDED, UNPROVIDED))) : NIL;
            if (((NIL == answerableP) || (NIL != justification)) && (NIL != tptp_problem_generator.justification_folifiableP(justification))) {
                {
                    SubLObject more_problem_properties = list(new SubLObject[]{ $NUM, i, $PAIR_NUM, i, $MODULE, module_name, $CYCL_QUERY, query, $JUSTIFICATION, justification });
                    SubLObject tptp_problem = list_utilities.merge_plist(skeletal_tptp_problem, more_problem_properties);
                    tptp_datastructures.validate_tptp_problem(tptp_problem);
                    return tptp_problem;
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tptp_generate_pos_kb_lookup_query(SubLObject skeletal_tptp_problem, SubLObject kb_content) {
        {
            SubLObject openness = tptp_datastructures.tptp_problem_openness(skeletal_tptp_problem);
            SubLObject answerability = tptp_datastructures.tptp_problem_answerability(skeletal_tptp_problem);
            SubLObject query = NIL;
            while (NIL == query) {
                {
                    SubLObject gaf = kb_utilities.random_non_hl_gaf();
                    query = tptp_generate_pos_lookup_query_int(gaf, openness, answerability, NIL);
                }
            } 
            return query;
        }
    }

    public static final SubLObject tptp_generate_pos_synthetic_lookup_query(SubLObject skeletal_tptp_problem, SubLObject kb_content) {
        {
            SubLObject openness = tptp_datastructures.tptp_problem_openness(skeletal_tptp_problem);
            SubLObject answerability = tptp_datastructures.tptp_problem_answerability(skeletal_tptp_problem);
            SubLObject query = NIL;
            while (NIL == query) {
                {
                    SubLObject gaf = tptp_kb_content_generator.random_non_sbhl_synthetic_gaf(kb_content);
                    SubLObject candidate_query = tptp_generate_pos_lookup_query_int(gaf, openness, answerability, T);
                    if (NIL != cycl_utilities.expression_find_if($sym9$SYNTHETIC_TERM_, candidate_query, UNPROVIDED, UNPROVIDED)) {
                        query = candidate_query;
                    }
                }
            } 
            return query;
        }
    }

    /**
     *
     *
     * @param STICK-TO-SYNTHETIC?;
     * 		whether tweaks will attempt to stick to the synthetic subset of the KB
     */
    public static final SubLObject tptp_generate_pos_lookup_query_int(SubLObject gaf, SubLObject openness, SubLObject answerability, SubLObject stick_to_syntheticP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject asent = assertions_high.gaf_formula(gaf);
                SubLObject mt = assertions_high.assertion_mt(gaf);
                if (NIL == obsolete.formula_variables(asent, UNPROVIDED, UNPROVIDED)) {
                    if (!(((openness == $OPEN) && (answerability == $UNANSWERABLE)) && (NIL != fort_types_interface.reflexive_binary_predicate_p(cycl_utilities.atomic_sentence_predicate(asent))))) {
                        if (openness == $OPEN) {
                            if (NIL != stick_to_syntheticP) {
                                asent = turn_a_random_arg_into_a_variable_but_keep_something_synthetic(asent);
                            } else {
                                asent = kb_utilities.turn_a_random_arg_into_a_variable(asent, UNPROVIDED);
                            }
                        }
                        if (answerability == $UNANSWERABLE) {
                            thread.resetMultipleValues();
                            {
                                SubLObject asent_2 = tptp_make_atomic_sentence_unanswerable(asent, mt, $tptp_default_query_properties$.getGlobalValue());
                                SubLObject mt_3 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                asent = asent_2;
                                mt = mt_3;
                            }
                        }
                        if ((NIL != asent) && (NIL != mt)) {
                            return el_utilities.make_ist_sentence(mt, asent);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Repeatedly tweaks ASENT or MT until it finds a tweak that causes it to be unanswerable.
     */
    public static final SubLObject tptp_make_atomic_sentence_unanswerable(SubLObject asent, SubLObject mt, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        if (NIL != number_utilities.coin_flip()) {
            if (NIL == inference_kernel.new_cyc_query(asent, $$UniversalVocabularyMt, v_properties)) {
                {
                    SubLObject new_mt = tptp_make_atomic_sentence_unanswerable_by_raising_the_mt(asent, mt, v_properties);
                    if (NIL != new_mt) {
                        return values(asent, new_mt);
                    }
                }
            }
        }
        {
            SubLObject new_asent = tptp_make_atomic_sentence_unanswerable_by_tweaking_the_sentence(asent, mt, v_properties);
            if (NIL != new_asent) {
                return values(new_asent, mt);
            } else {
                return values(NIL, NIL);
            }
        }
    }

    public static final SubLObject tptp_make_atomic_sentence_unanswerable_by_raising_the_mt(SubLObject asent, SubLObject mt, SubLObject v_properties) {
        mt = list_utilities.random_element(remove_if(CORE_MICROTHEORY_P, genl_mts.genl_mts(mt, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        while (NIL != mt) {
            if (NIL == inference_kernel.new_cyc_query(asent, mt, v_properties)) {
                return mt;
            }
            mt = list_utilities.random_element(remove_if(CORE_MICROTHEORY_P, genl_mts.genl_mts(mt, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } 
        return NIL;
    }

    public static final SubLObject tptp_make_atomic_sentence_unanswerable_by_tweaking_the_sentence(SubLObject asent, SubLObject mt, SubLObject v_properties) {
        {
            SubLObject unanswerable_asent = NIL;
            SubLObject count = ZERO_INTEGER;
            while (NIL == unanswerable_asent) {
                count = add(count, ONE_INTEGER);
                if (count.numG(TEN_INTEGER)) {
                    Errors.warn($str_alt90$Couldn_t_make__s_unanswerable___s, asent, mt, v_properties);
                    return NIL;
                }
                {
                    SubLObject argnum = kb_utilities.safe_random_closed_argnum(asent, UNPROVIDED);
                    if (NIL != argnum) {
                        {
                            SubLObject col = kb_accessors.argn_isa(cycl_utilities.atomic_sentence_predicate(asent), argnum, mt).first();
                            if (NIL == col) {
                                return NIL;
                            }
                            {
                                SubLObject ins = isa.random_instance_of(col, mt);
                                if (NIL == ins) {
                                    return NIL;
                                }
                                {
                                    SubLObject candidate_asent = el_utilities.replace_formula_arg(argnum, ins, asent);
                                    if (NIL == inference_kernel.new_cyc_query(candidate_asent, mt, v_properties)) {
                                        unanswerable_asent = candidate_asent;
                                    }
                                }
                            }
                        }
                    }
                }
            } 
            return unanswerable_asent;
        }
    }

    public static final SubLObject turn_a_random_arg_into_a_variable_but_keep_something_synthetic(SubLObject asent) {
        {
            SubLObject candidate_asent = NIL;
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(TEN_INTEGER); i = add(i, ONE_INTEGER)) {
                candidate_asent = kb_utilities.turn_a_random_arg_into_a_variable(asent, UNPROVIDED);
                if (NIL != cycl_utilities.expression_find_if($sym9$SYNTHETIC_TERM_, cycl_utilities.formula_args(asent, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                    return candidate_asent;
                }
            }
            Errors.warn($str_alt91$Could_not_find_a_synthetic_arg_to, asent);
            return candidate_asent;
        }
    }

    public static final SubLObject tptp_generate_kb_genls_query(SubLObject skeletal_tptp_problem, SubLObject kb_content) {
        return tptp_generate_genls_query(skeletal_tptp_problem, kb_content, NIL);
    }

    public static final SubLObject tptp_generate_synthetic_genls_query(SubLObject skeletal_tptp_problem, SubLObject kb_content) {
        return tptp_generate_genls_query(skeletal_tptp_problem, kb_content, T);
    }

    public static final SubLObject tptp_generate_genls_query(SubLObject skeletal_tptp_problem, SubLObject kb_content, SubLObject syntheticP) {
        {
            SubLObject openness = tptp_datastructures.tptp_problem_openness(skeletal_tptp_problem);
            SubLObject answerability = tptp_datastructures.tptp_problem_answerability(skeletal_tptp_problem);
            SubLObject root_col = tptp_kb_content_generator.tptp_kb_content_col(kb_content);
            SubLObject query = NIL;
            while (NIL == query) {
                {
                    SubLObject col = random_possibly_synthetic_collection(syntheticP, root_col);
                    SubLObject mt = fort_types_interface.random_mt();
                    SubLObject candidate_query = tptp_generate_genls_query_int(col, mt, answerability, syntheticP, root_col);
                    if (NIL != candidate_query) {
                        query = el_utilities.make_ist_sentence(mt, candidate_query);
                    }
                }
            } 
            return query;
        }
    }

    public static final SubLObject tptp_generate_genls_query_int(SubLObject col, SubLObject mt, SubLObject answerability, SubLObject syntheticP, SubLObject root_col) {
        if (answerability == $ANSWERABLE) {
            if (NIL != number_utilities.coin_flip()) {
                {
                    SubLObject genl = random_possibly_synthetic_proper_genl_of(col, mt, syntheticP);
                    return NIL != genl ? ((SubLObject) (list($$genls, col, genl))) : NIL;
                }
            } else {
                {
                    SubLObject spec = random_possibly_synthetic_proper_spec_of(col, mt, syntheticP);
                    return NIL != spec ? ((SubLObject) (list($$genls, spec, col))) : NIL;
                }
            }
        } else {
            {
                SubLObject sentence = list($$genls, col, random_possibly_synthetic_collection(syntheticP, root_col));
                SubLObject count = ZERO_INTEGER;
                while (NIL == query_has_answerabilityP(sentence, mt, $UNANSWERABLE, UNPROVIDED)) {
                    count = add(count, ONE_INTEGER);
                    if (count.numG($int$30)) {
                        return NIL;
                    }
                    sentence = list($$genls, col, random_possibly_synthetic_collection(syntheticP, root_col));
                } 
                return sentence;
            }
        }
    }

    public static final SubLObject random_possibly_synthetic_collection(SubLObject syntheticP, SubLObject root_col) {
        if (NIL != syntheticP) {
            return genls.random_spec_of(root_col, UNPROVIDED);
        } else {
            return fort_types_interface.random_collection();
        }
    }

    public static final SubLObject random_possibly_synthetic_proper_genl_of(SubLObject col, SubLObject mt, SubLObject syntheticP) {
        {
            SubLObject v_genls = genls.all_proper_genls(col, mt, UNPROVIDED);
            if (NIL != syntheticP) {
                v_genls = list_utilities.remove_if_not(symbol_function($sym9$SYNTHETIC_TERM_), v_genls, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return list_utilities.random_element(v_genls);
        }
    }

    public static final SubLObject random_possibly_synthetic_proper_spec_of(SubLObject col, SubLObject mt, SubLObject syntheticP) {
        {
            SubLObject specs = genls.all_proper_specs(col, mt, UNPROVIDED);
            if (NIL != syntheticP) {
                specs = list_utilities.remove_if_not(symbol_function($sym9$SYNTHETIC_TERM_), specs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return list_utilities.random_element(specs);
        }
    }

    public static final SubLObject tptp_generate_kb_isa_query(SubLObject skeletal_tptp_problem, SubLObject kb_content) {
        {
            SubLObject openness = tptp_datastructures.tptp_problem_openness(skeletal_tptp_problem);
            SubLObject answerability = tptp_datastructures.tptp_problem_answerability(skeletal_tptp_problem);
            SubLObject query = NIL;
            if (!((openness == $OPEN) && (answerability == $UNANSWERABLE))) {
                while (NIL == query) {
                    {
                        SubLObject ins = forts.random_fort();
                        SubLObject mt = fort_types_interface.random_mt();
                        SubLObject arg2 = (openness == $OPEN) ? ((SubLObject) ($sym101$_COL)) : answerability == $ANSWERABLE ? ((SubLObject) (list_utilities.random_element(isa.all_isa(ins, mt, UNPROVIDED)))) : fort_types_interface.random_collection();
                        if (NIL != arg2) {
                            {
                                SubLObject candidate_sentence = list($$isa, ins, arg2);
                                if (NIL != query_has_answerabilityP(candidate_sentence, mt, answerability, UNPROVIDED)) {
                                    query = el_utilities.make_ist_sentence(mt, candidate_sentence);
                                }
                            }
                        }
                    }
                } 
            }
            return query;
        }
    }

    public static final SubLObject tptp_generate_kb_not_isa_query(SubLObject skeletal_tptp_problem, SubLObject kb_content) {
        {
            SubLObject answerability = tptp_datastructures.tptp_problem_answerability(skeletal_tptp_problem);
            SubLObject query = NIL;
            while (NIL == query) {
                {
                    SubLObject ins = forts.random_fort();
                    SubLObject mt = fort_types_interface.random_mt();
                    SubLObject arg2 = fort_types_interface.random_collection();
                    SubLObject candidate_sentence = list($$not, list($$isa, ins, arg2));
                    if (NIL != query_has_answerabilityP(candidate_sentence, mt, answerability, UNPROVIDED)) {
                        query = el_utilities.make_ist_sentence(mt, candidate_sentence);
                    }
                }
            } 
            return query;
        }
    }



    public static final SubLObject tptp_generate_kb_unknown_isa_query(SubLObject skeletal_tptp_problem, SubLObject kb_content) {
        {
            SubLObject openness = tptp_datastructures.tptp_problem_openness(skeletal_tptp_problem);
            SubLObject answerability = tptp_datastructures.tptp_problem_answerability(skeletal_tptp_problem);
            SubLObject query = NIL;
            if (($UNANSWERABLE == answerability) && ($CLOSED == openness)) {
                if (NIL != $todo_isa_query$.getGlobalValue()) {
                    query = $todo_isa_query$.getGlobalValue();
                    $todo_isa_query$.setGlobalValue(NIL);
                } else {
                    while (NIL == query) {
                        {
                            SubLObject mt = fort_types_interface.random_mt();
                            SubLObject ins = forts.random_fort();
                            SubLObject col = fort_types_interface.random_collection();
                            if ((NIL == isa.isaP(ins, col, mt, UNPROVIDED)) && (NIL == isa.not_isaP(ins, col, mt, UNPROVIDED))) {
                                {
                                    SubLObject positive_sentence = list($$isa, ins, col);
                                    SubLObject negative_sentence = list($$not, list($$isa, ins, col));
                                    if ((NIL != query_has_answerabilityP(positive_sentence, mt, answerability, UNPROVIDED)) && (NIL != query_has_answerabilityP(negative_sentence, mt, answerability, UNPROVIDED))) {
                                        {
                                            SubLObject positive_query = el_utilities.make_ist_sentence(mt, positive_sentence);
                                            SubLObject negative_query = el_utilities.make_ist_sentence(mt, negative_sentence);
                                            if (NIL != number_utilities.coin_flip()) {
                                                query = positive_query;
                                                $todo_isa_query$.setGlobalValue(negative_query);
                                            } else {
                                                query = negative_query;
                                                $todo_isa_query$.setGlobalValue(positive_query);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } 
                }
            }
            return query;
        }
    }

    public static final SubLObject tptp_generate_synthetic_singleton_query(SubLObject skeletal_tptp_problem, SubLObject kb_content) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject openness = tptp_datastructures.tptp_problem_openness(skeletal_tptp_problem);
                SubLObject answerability = tptp_datastructures.tptp_problem_answerability(skeletal_tptp_problem);
                SubLObject query = NIL;
                if (($OPEN == openness) && ($ANSWERABLE == answerability)) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            while (NIL == query) {
                                {
                                    SubLObject ins = list_utilities.random_element(tptp_kb_content_generator.tptp_kb_content_instances(kb_content));
                                    SubLObject pred_var = $$isa;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(ins, ONE_INTEGER, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(ins, ONE_INTEGER, pred_var);
                                            SubLObject done_var = query;
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
                                                                    SubLObject done_var_4 = query;
                                                                    SubLObject token_var_5 = NIL;
                                                                    while (NIL == done_var_4) {
                                                                        {
                                                                            SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_5);
                                                                            SubLObject valid_6 = makeBoolean(token_var_5 != gaf);
                                                                            if (NIL != valid_6) {
                                                                                {
                                                                                    SubLObject col = assertions_high.gaf_arg2(gaf);
                                                                                    SubLObject mt = assertions_high.assertion_mt(gaf);
                                                                                    if (cardinality_estimates.instance_cardinality(col).numLE(ONE_INTEGER)) {
                                                                                        if (ONE_INTEGER.numE(isa.count_all_instances(col, UNPROVIDED, UNPROVIDED))) {
                                                                                            {
                                                                                                SubLObject candidate_query = list($$isa, $sym117$_X, col);
                                                                                                SubLObject candidate_mt = genl_mts.random_spec_mt(mt, UNPROVIDED, UNPROVIDED);
                                                                                                if (NIL != query_has_answerabilityP(candidate_query, candidate_mt, answerability, UNPROVIDED)) {
                                                                                                    query = el_utilities.make_ist_sentence(candidate_mt, candidate_query);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_4 = makeBoolean((NIL == valid_6) || (NIL != query));
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_7, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean((NIL == valid) || (NIL != query));
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
                }
                return query;
            }
        }
    }

    public static final SubLObject tptp_generate_kb_arg_type_violation_query(SubLObject skeletal_tptp_problem, SubLObject kb_content) {
        {
            SubLObject openness = tptp_datastructures.tptp_problem_openness(skeletal_tptp_problem);
            SubLObject answerability = tptp_datastructures.tptp_problem_answerability(skeletal_tptp_problem);
            SubLObject query = NIL;
            while (NIL == query) {
                {
                    SubLObject gaf = assertions_high.random_gaf();
                    SubLObject mt = assertions_high.assertion_mt(gaf);
                    SubLObject gaf_asent = assertions_high.gaf_formula(gaf);
                    SubLObject query_asent = ($UNANSWERABLE == answerability) ? ((SubLObject) (cycl_utilities.negate(gaf_asent))) : tptp_generate_answerable_kb_arg_type_violation_query(gaf_asent, mt);
                    if (NIL != query_asent) {
                        if (NIL != query_has_answerabilityP(query_asent, mt, answerability, UNPROVIDED)) {
                            query = el_utilities.make_ist_sentence(mt, query_asent);
                        }
                    }
                }
            } 
            return query;
        }
    }

    public static final SubLObject tptp_generate_answerable_kb_arg_type_violation_query(SubLObject gaf_asent, SubLObject mt) {
        {
            SubLObject pred = cycl_utilities.atomic_sentence_predicate(gaf_asent);
            SubLObject v_arity = el_utilities.formula_arity(gaf_asent, UNPROVIDED);
            SubLObject arg_count = number_utilities.f_1_(v_arity);
            SubLObject argnum_1 = random.random(arg_count);
            SubLObject argnum = number_utilities.f_1X(argnum_1);
            SubLObject argn_isas = kb_accessors.argn_isa(pred, argnum, mt);
            if (NIL != list_utilities.singletonP(argn_isas)) {
                {
                    SubLObject argn_isa = list_utilities.only_one(argn_isas);
                    if ($$Thing != argn_isa) {
                        {
                            SubLObject ill_formed_instance = random_unknown_instance_of(argn_isa, mt);
                            return cycl_utilities.negate(el_utilities.replace_formula_arg(argnum, ill_formed_instance, gaf_asent));
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * A random fort that is not known to be an instance of COL in MT.
     */
    public static final SubLObject random_unknown_instance_of(SubLObject col, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if ($$Thing == col) {
                    Errors.error($str_alt123$Everything_is_an_instance_of___Th);
                }
            }
            {
                SubLObject result = NIL;
                while (NIL == result) {
                    {
                        SubLObject candidate = forts.random_fort();
                        if (NIL == isa.isaP(candidate, col, mt, UNPROVIDED)) {
                            result = candidate;
                        }
                    }
                } 
                return result;
            }
        }
    }

    public static final SubLObject tptp_generate_kb_disjoint_with_query(SubLObject skeletal_tptp_problem, SubLObject kb_content) {
        {
            SubLObject openness = tptp_datastructures.tptp_problem_openness(skeletal_tptp_problem);
            SubLObject answerability = tptp_datastructures.tptp_problem_answerability(skeletal_tptp_problem);
            return tptp_generate_disjoint_with_query(answerability, kb_content, NIL);
        }
    }

    public static final SubLObject tptp_generate_synthetic_disjoint_with_query(SubLObject skeletal_tptp_problem, SubLObject kb_content) {
        {
            SubLObject openness = tptp_datastructures.tptp_problem_openness(skeletal_tptp_problem);
            SubLObject answerability = tptp_datastructures.tptp_problem_answerability(skeletal_tptp_problem);
            return tptp_generate_disjoint_with_query(answerability, kb_content, T);
        }
    }

    public static final SubLObject tptp_generate_disjoint_with_query(SubLObject answerability, SubLObject kb_content, SubLObject syntheticP) {
        {
            SubLObject root_col = tptp_kb_content_generator.tptp_kb_content_col(kb_content);
            SubLObject query = NIL;
            while (NIL == query) {
                {
                    SubLObject col = random_possibly_synthetic_collection(syntheticP, root_col);
                    SubLObject mt = fort_types_interface.random_mt();
                    SubLObject candidate_query = tptp_generate_disjoint_with_query_int(col, mt, answerability, syntheticP, root_col);
                    if (NIL != candidate_query) {
                        query = el_utilities.make_ist_sentence(mt, candidate_query);
                    }
                }
            } 
            return query;
        }
    }

    public static final SubLObject tptp_generate_disjoint_with_query_int(SubLObject col, SubLObject mt, SubLObject answerability, SubLObject syntheticP, SubLObject root_col) {
        {
            SubLObject sentence = list($$disjointWith, col, random_possibly_synthetic_collection(syntheticP, root_col));
            SubLObject count = ZERO_INTEGER;
            while (NIL == query_has_answerabilityP(sentence, mt, answerability, UNPROVIDED)) {
                count = add(count, ONE_INTEGER);
                if (count.numG($int$100)) {
                    return NIL;
                }
                sentence = list($$disjointWith, col, random_possibly_synthetic_collection(syntheticP, root_col));
            } 
            return sentence;
        }
    }

    public static final SubLObject tptp_generate_kb_genl_preds_query(SubLObject skeletal_tptp_problem, SubLObject kb_content) {
        return tptp_generate_genl_preds_query(skeletal_tptp_problem, kb_content, NIL, $$genlPreds);
    }

    public static final SubLObject tptp_generate_synthetic_genl_preds_query(SubLObject skeletal_tptp_problem, SubLObject kb_content) {
        return tptp_generate_genl_preds_query(skeletal_tptp_problem, kb_content, T, $$genlPreds);
    }

    public static final SubLObject tptp_generate_kb_genl_inverse_query(SubLObject skeletal_tptp_problem, SubLObject kb_content) {
        return tptp_generate_genl_preds_query(skeletal_tptp_problem, kb_content, NIL, $$genlInverse);
    }

    public static final SubLObject tptp_generate_synthetic_genl_inverse_query(SubLObject skeletal_tptp_problem, SubLObject kb_content) {
        return tptp_generate_genl_preds_query(skeletal_tptp_problem, kb_content, T, $$genlInverse);
    }

    public static final SubLObject tptp_generate_genl_preds_query(SubLObject skeletal_tptp_problem, SubLObject kb_content, SubLObject syntheticP, SubLObject arg0) {
        {
            SubLObject openness = tptp_datastructures.tptp_problem_openness(skeletal_tptp_problem);
            SubLObject answerability = tptp_datastructures.tptp_problem_answerability(skeletal_tptp_problem);
            SubLObject part_types_pred = tptp_kb_content_generator.tptp_kb_content_part_types_pred(kb_content);
            SubLObject parts_pred = tptp_kb_content_generator.tptp_kb_content_parts_pred(kb_content);
            SubLObject query = NIL;
            if (!(((arg0 == $$genlPreds) && (openness == $OPEN)) && (answerability == $UNANSWERABLE))) {
                while (NIL == query) {
                    {
                        SubLObject open_arg = ($OPEN == openness) ? ((SubLObject) (NIL != number_utilities.coin_flip() ? ((SubLObject) (ONE_INTEGER)) : TWO_INTEGER)) : NIL;
                        SubLObject arg1 = (ONE_INTEGER == open_arg) ? ((SubLObject) ($sym145$_SPEC_PRED)) : random_possibly_synthetic_predicate(syntheticP, part_types_pred, parts_pred, eq(arg0, $$genlInverse));
                        SubLObject mt = fort_types_interface.random_mt();
                        SubLObject arg2 = (TWO_INTEGER == open_arg) ? ((SubLObject) ($sym146$_GENL_PRED)) : choose_arg2_for_genl_preds_query(arg0, arg1, mt, answerability, syntheticP, part_types_pred, parts_pred);
                        SubLObject candidate_query = el_utilities.make_binary_formula(arg0, arg1, arg2);
                        if (NIL != query_has_answerabilityP(candidate_query, mt, answerability, UNPROVIDED)) {
                            query = el_utilities.make_ist_sentence(mt, candidate_query);
                        }
                    }
                } 
            }
            return query;
        }
    }

    public static final SubLObject choose_arg2_for_genl_preds_query(SubLObject arg0, SubLObject arg1, SubLObject mt, SubLObject answerability, SubLObject syntheticP, SubLObject part_types_pred, SubLObject parts_pred) {
        {
            SubLObject result = NIL;
            SubLObject count = ZERO_INTEGER;
            SubLObject binaryP = eq(arg0, $$genlInverse);
            while (NIL == result) {
                count = add(count, ONE_INTEGER);
                if (count.numG($int$30)) {
                    return NIL;
                }
                if (NIL == forts.fort_p(arg1)) {
                    {
                        SubLObject arg2 = random_possibly_synthetic_predicate(syntheticP, part_types_pred, parts_pred, binaryP);
                        if (NIL != query_has_answerabilityP(el_utilities.make_binary_formula(arg0, arg1, arg2), mt, answerability, UNPROVIDED)) {
                            result = arg2;
                        }
                    }
                } else
                    if ($ANSWERABLE == answerability) {
                        result = random_possibly_synthetic_proper_genl_pred_or_inverse(arg0, arg1, mt, syntheticP);
                    } else {
                        {
                            SubLObject arg2 = random_possibly_synthetic_predicate(syntheticP, part_types_pred, parts_pred, binaryP);
                            if (NIL != query_has_answerabilityP(el_utilities.make_binary_formula(arg0, arg1, arg2), mt, answerability, UNPROVIDED)) {
                                result = arg2;
                            }
                        }
                    }

            } 
            return result;
        }
    }

    public static final SubLObject random_possibly_synthetic_predicate(SubLObject syntheticP, SubLObject part_types_pred, SubLObject parts_pred, SubLObject binaryP) {
        SubLTrampolineFile.checkType(syntheticP, BOOLEANP);
        SubLTrampolineFile.checkType(binaryP, BOOLEANP);
        if (NIL != syntheticP) {
            if (NIL != number_utilities.coin_flip()) {
                return genl_predicates.random_proper_spec_predicate_or_inverse_of(part_types_pred, UNPROVIDED, UNPROVIDED);
            } else {
                return genl_predicates.random_proper_spec_predicate_or_inverse_of(parts_pred, UNPROVIDED, UNPROVIDED);
            }
        } else {
            if (NIL != binaryP) {
                return kb_utilities.random_binary_predicate();
            } else {
                return kb_utilities.random_predicate();
            }
        }
    }

    public static final SubLObject random_possibly_synthetic_proper_genl_pred_or_inverse(SubLObject arg0, SubLObject pred, SubLObject mt, SubLObject syntheticP) {
        SubLTrampolineFile.checkType(syntheticP, BOOLEANP);
        {
            SubLObject genl_preds = (arg0 == $$genlPreds) ? ((SubLObject) (genl_predicates.all_proper_genl_predicates(pred, mt, UNPROVIDED))) : genl_predicates.all_proper_genl_inverses(pred, mt, UNPROVIDED);
            if (NIL != syntheticP) {
                genl_preds = list_utilities.remove_if_not($sym9$SYNTHETIC_TERM_, genl_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return list_utilities.random_element(genl_preds);
        }
    }

    public static final SubLObject tptp_generate_synthetic_part_types_genl_pred_query(SubLObject skeletal_tptp_problem, SubLObject kb_content) {
        return tptp_generate_part_types_genl_pred_query(skeletal_tptp_problem, kb_content, $$genlPreds);
    }

    public static final SubLObject tptp_generate_synthetic_part_types_genl_inverse_query(SubLObject skeletal_tptp_problem, SubLObject kb_content) {
        return tptp_generate_part_types_genl_pred_query(skeletal_tptp_problem, kb_content, $$genlInverse);
    }

    public static final SubLObject tptp_generate_part_types_genl_pred_query(SubLObject skeletal_tptp_problem, SubLObject kb_content, SubLObject arg0) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject openness = tptp_datastructures.tptp_problem_openness(skeletal_tptp_problem);
                SubLObject answerability = tptp_datastructures.tptp_problem_answerability(skeletal_tptp_problem);
                SubLObject query = NIL;
                while (NIL == query) {
                    thread.resetMultipleValues();
                    {
                        SubLObject target_asent = random_synthetic_part_types_asent_mt_with_a_synthetic_proper_genl_pred(kb_content);
                        SubLObject target_mt = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        thread.resetMultipleValues();
                        {
                            SubLObject target_pred = el_utilities.unmake_binary_formula(target_asent);
                            SubLObject target_arg1 = thread.secondMultipleValue();
                            SubLObject target_arg2 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject query_mt = genl_mts.random_spec_mt(target_mt, UNPROVIDED, UNPROVIDED);
                                SubLObject query_pred = (arg0 == $$genlPreds) ? ((SubLObject) ($OPEN == openness ? ((SubLObject) (random_synthetic_proper_genl_predicate_of_with_no_predicate_extent(target_pred, query_mt))) : random_synthetic_proper_genl_predicate_of(target_pred, query_mt))) : $OPEN == openness ? ((SubLObject) (random_synthetic_proper_genl_inverse_of_with_no_predicate_extent(target_pred, query_mt))) : random_synthetic_proper_genl_inverse_of(target_pred, query_mt);
                                if (NIL != query_pred) {
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                        if (NIL == tptp_kb_content_generator.synthetic_termP(query_pred)) {
                                            Errors.error($str_alt154$Got_a_non_synthetic_query_pred__a, query_pred);
                                        }
                                    }
                                    {
                                        SubLObject open_arg = ($OPEN == openness) ? ((SubLObject) (NIL != number_utilities.coin_flip() ? ((SubLObject) (ONE_INTEGER)) : TWO_INTEGER)) : NIL;
                                        SubLObject query_arg1 = (ONE_INTEGER == open_arg) ? ((SubLObject) ($sym155$_ARG1)) : target_arg1;
                                        SubLObject query_arg2 = (TWO_INTEGER == open_arg) ? ((SubLObject) ($sym156$_ARG2)) : target_arg2;
                                        if (answerability == $UNANSWERABLE) {
                                            if (NIL != number_utilities.coin_flip()) {
                                                if (ONE_INTEGER == open_arg) {
                                                    query_arg2 = fort_types_interface.random_collection();
                                                } else
                                                    if (TWO_INTEGER == open_arg) {
                                                        query_arg1 = fort_types_interface.random_collection();
                                                    } else {
                                                        if (NIL != number_utilities.coin_flip()) {
                                                            query_arg1 = fort_types_interface.random_collection();
                                                        } else {
                                                            query_arg2 = fort_types_interface.random_collection();
                                                        }
                                                    }

                                            } else {
                                                query_mt = genl_mts.random_proper_genl_mt(target_mt, UNPROVIDED, UNPROVIDED);
                                            }
                                        }
                                        {
                                            SubLObject query_asent = (arg0 == $$genlPreds) ? ((SubLObject) (el_utilities.make_binary_formula(query_pred, query_arg1, query_arg2))) : el_utilities.make_binary_formula(query_pred, query_arg2, query_arg1);
                                            if (NIL != query_has_answerabilityP(query_asent, query_mt, answerability, UNPROVIDED)) {
                                                query = el_utilities.make_ist_sentence(query_mt, query_asent);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } 
                return query;
            }
        }
    }

    public static final SubLObject random_synthetic_proper_genl_predicate_of_with_no_predicate_extent(SubLObject pred, SubLObject mt) {
        {
            SubLObject predicate_extent_emptyP = NIL;
            SubLObject all_genl_preds = list_utilities.remove_if_not($sym9$SYNTHETIC_TERM_, genl_predicates.all_proper_genl_predicates(pred, mt, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject count = ZERO_INTEGER;
            SubLObject genl_pred = NIL;
            if (NIL != all_genl_preds) {
                while (NIL == predicate_extent_emptyP) {
                    genl_pred = list_utilities.random_element(all_genl_preds);
                    if (ZERO_INTEGER.numE(kb_indexing.num_predicate_extent_index(genl_pred, UNPROVIDED))) {
                        predicate_extent_emptyP = T;
                    }
                    count = add(count, ONE_INTEGER);
                    if (count.numG($int$30)) {
                        return NIL;
                    }
                } 
            }
            return genl_pred;
        }
    }

    public static final SubLObject random_synthetic_proper_genl_inverse_of_with_no_predicate_extent(SubLObject pred, SubLObject mt) {
        {
            SubLObject predicate_extent_emptyP = NIL;
            SubLObject all_genl_inverses = list_utilities.remove_if_not($sym9$SYNTHETIC_TERM_, genl_predicates.all_proper_genl_inverses(pred, mt, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject count = ZERO_INTEGER;
            SubLObject genl_inverse = NIL;
            if (NIL != all_genl_inverses) {
                while (NIL == predicate_extent_emptyP) {
                    genl_inverse = list_utilities.random_element(all_genl_inverses);
                    if (ZERO_INTEGER.numE(kb_indexing.num_predicate_extent_index(genl_inverse, UNPROVIDED))) {
                        predicate_extent_emptyP = T;
                    }
                    count = add(count, ONE_INTEGER);
                    if (count.numG($int$30)) {
                        return NIL;
                    }
                } 
            }
            return genl_inverse;
        }
    }

    public static final SubLObject random_synthetic_part_types_asent_mt_with_a_synthetic_proper_genl_pred(SubLObject kb_content) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject asent = NIL;
                SubLObject mt = NIL;
                while (!((NIL != asent) && (NIL != mt))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject candidate_asent = random_synthetic_part_types_asent_mt(kb_content);
                        SubLObject candidate_mt = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject candidate_pred = cycl_utilities.atomic_sentence_predicate(candidate_asent);
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                    if (NIL != list_utilities.remove_if_not($sym9$SYNTHETIC_TERM_, genl_predicates.all_proper_genl_predicates_and_inverses(candidate_pred, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                        asent = candidate_asent;
                                        mt = candidate_mt;
                                    }
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                } 
                return values(asent, mt);
            }
        }
    }

    public static final SubLObject random_synthetic_proper_genl_predicate_of(SubLObject pred, SubLObject mt) {
        return list_utilities.random_element(list_utilities.remove_if_not($sym9$SYNTHETIC_TERM_, genl_predicates.all_proper_genl_predicates(pred, mt, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject random_synthetic_proper_genl_inverse_of(SubLObject pred, SubLObject mt) {
        return list_utilities.random_element(list_utilities.remove_if_not($sym9$SYNTHETIC_TERM_, genl_predicates.all_proper_genl_inverses(pred, mt, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject tptp_generate_synthetic_tptp_of_object_query(SubLObject skeletal_tptp_problem, SubLObject kb_content) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject openness = tptp_datastructures.tptp_problem_openness(skeletal_tptp_problem);
                SubLObject answerability = tptp_datastructures.tptp_problem_answerability(skeletal_tptp_problem);
                SubLObject query = NIL;
                while (NIL == query) {
                    thread.resetMultipleValues();
                    {
                        SubLObject asent = random_synthetic_relation_all_instance_asent_mt(kb_content);
                        SubLObject mt = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        thread.resetMultipleValues();
                        {
                            SubLObject relation_all_instance = el_utilities.unmake_ternary_formula(asent);
                            SubLObject object_pred = thread.secondMultipleValue();
                            SubLObject col = thread.thirdMultipleValue();
                            SubLObject quantity = thread.fourthMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject unanswerability_method = ($UNANSWERABLE == answerability) ? ((SubLObject) ((NIL != mt_vars.core_microtheory_p(mt)) || (NIL != number_utilities.coin_flip()) ? ((SubLObject) ($MAKE_UNANSWERABLE_BY_TWEAKING_THE_ARG1)) : $MAKE_UNANSWERABLE_BY_RAISING_THE_MT)) : NIL;
                                SubLObject open_arg = ($OPEN == openness) ? ((SubLObject) ((unanswerability_method == $MAKE_UNANSWERABLE_BY_TWEAKING_THE_ARG1) || (NIL != number_utilities.coin_flip()) ? ((SubLObject) (TWO_INTEGER)) : ONE_INTEGER)) : NIL;
                                SubLObject query_mt = (unanswerability_method == $MAKE_UNANSWERABLE_BY_RAISING_THE_MT) ? ((SubLObject) (genl_mts.random_proper_genl_mt(mt, UNPROVIDED, UNPROVIDED))) : genl_mts.random_spec_mt(mt, UNPROVIDED, UNPROVIDED);
                                SubLObject query_pred = object_pred;
                                SubLObject query_arg1 = (ONE_INTEGER == open_arg) ? ((SubLObject) ($sym101$_COL)) : unanswerability_method == $MAKE_UNANSWERABLE_BY_TWEAKING_THE_ARG1 ? ((SubLObject) (fort_types_interface.random_collection())) : isa.random_instance_of(col, query_mt);
                                SubLObject query_arg2 = (TWO_INTEGER == open_arg) ? ((SubLObject) ($sym161$_QUANTITY)) : quantity;
                                SubLObject query_asent = el_utilities.make_binary_formula(query_pred, query_arg1, query_arg2);
                                if (NIL != query_arg1) {
                                    if (NIL != query_has_answerabilityP(query_asent, query_mt, answerability, UNPROVIDED)) {
                                        query = el_utilities.make_ist_sentence(query_mt, query_asent);
                                    }
                                }
                            }
                        }
                    }
                } 
                return query;
            }
        }
    }

    public static final SubLObject random_synthetic_relation_all_instance_asent_mt(SubLObject kb_content) {
        {
            SubLObject gaf = list_utilities.random_element(all_synthetic_relation_all_instance_gafs(kb_content));
            SubLObject asent = assertions_high.gaf_formula(gaf);
            SubLObject mt = assertions_high.assertion_mt(gaf);
            return values(asent, mt);
        }
    }

    public static final SubLObject all_synthetic_relation_all_instance_gafs(SubLObject kb_content) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject object_pred = tptp_kb_content_generator.tptp_kb_content_object_pred(kb_content);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        result = kb_mapping.gather_gaf_arg_index(object_pred, ONE_INTEGER, $$relationAllInstance, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject tptp_generate_synthetic_parts_query(SubLObject skeletal_tptp_problem, SubLObject kb_content) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject openness = tptp_datastructures.tptp_problem_openness(skeletal_tptp_problem);
                SubLObject answerability = tptp_datastructures.tptp_problem_answerability(skeletal_tptp_problem);
                SubLObject query = NIL;
                if ($OPEN == openness) {
                    while (NIL == query) {
                        thread.resetMultipleValues();
                        {
                            SubLObject asent = random_synthetic_part_types_asent_mt(kb_content);
                            SubLObject mt = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            thread.resetMultipleValues();
                            {
                                SubLObject type_pred = el_utilities.unmake_binary_formula(asent);
                                SubLObject arg1 = thread.secondMultipleValue();
                                SubLObject arg2 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject arg1_syntheticP = tptp_kb_content_generator.synthetic_termP(arg1);
                                    SubLObject unanswerability_method = ($UNANSWERABLE == answerability) ? ((SubLObject) (list_utilities.random_element($list_alt165))) : NIL;
                                    SubLObject query_mt = (unanswerability_method == $MAKE_UNANSWERABLE_BY_TWEAKING_THE_MT) ? ((SubLObject) (fort_types_interface.random_mt())) : genl_mts.random_spec_mt(mt, UNPROVIDED, UNPROVIDED);
                                    SubLObject pred = tptp_corresponding_instance_level_pred(type_pred);
                                    SubLObject query_pred = (unanswerability_method == $MAKE_UNANSWERABLE_BY_LOWERING_THE_PREDICATE) ? ((SubLObject) (genl_predicates.random_proper_spec_predicate_of(pred, query_mt, UNPROVIDED))) : pred;
                                    if (NIL != query_pred) {
                                        {
                                            SubLObject query_arg1 = (NIL != arg1_syntheticP) ? ((SubLObject) ($sym117$_X)) : unanswerability_method == $MAKE_UNANSWERABLE_BY_TWEAKING_THE_NON_SYNTHETIC_ARG ? ((SubLObject) (fort_types_interface.random_collection())) : isa.random_instance_of(arg1, UNPROVIDED);
                                            SubLObject query_arg2 = (NIL != arg1_syntheticP) ? ((SubLObject) (unanswerability_method == $MAKE_UNANSWERABLE_BY_TWEAKING_THE_NON_SYNTHETIC_ARG ? ((SubLObject) (fort_types_interface.random_collection())) : isa.random_instance_of(arg2, UNPROVIDED))) : $sym117$_X;
                                            if ((NIL != query_arg1) && (NIL != query_arg2)) {
                                                {
                                                    SubLObject query_col = (NIL != arg1_syntheticP) ? ((SubLObject) (arg1)) : arg2;
                                                    SubLObject query_asent = el_utilities.make_binary_formula(query_pred, query_arg1, query_arg2);
                                                    SubLObject isa_asent = list($$isa, $sym117$_X, query_col);
                                                    SubLObject query_sentence = simplifier.conjoin(list(query_asent, isa_asent), UNPROVIDED);
                                                    if (NIL != query_has_answerabilityP(query_sentence, query_mt, answerability, UNPROVIDED)) {
                                                        query = el_utilities.make_ist_sentence(query_mt, query_sentence);
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
                return query;
            }
        }
    }

    public static final SubLObject random_synthetic_part_types_asent_mt(SubLObject kb_content) {
        {
            SubLObject gaf = list_utilities.random_element(all_synthetic_part_types_gafs(kb_content));
            SubLObject asent = assertions_high.gaf_formula(gaf);
            SubLObject mt = assertions_high.assertion_mt(gaf);
            return values(asent, mt);
        }
    }

    public static final SubLObject all_synthetic_part_types_gafs(SubLObject kb_content) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject part_types_pred = tptp_kb_content_generator.tptp_kb_content_part_types_pred(kb_content);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject node_var = part_types_pred;
                            SubLObject deck_type = (false) ? ((SubLObject) ($STACK)) : $QUEUE;
                            SubLObject recur_deck = deck.create_deck(deck_type);
                            SubLObject node_and_predicate_mode = NIL;
                            {
                                SubLObject _prev_bind_0_8 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject tv_var = NIL;
                                        {
                                            SubLObject _prev_bind_0_9 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1_10 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt175$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt175$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt175$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt180$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt175$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }


                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_11 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_12 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(part_types_pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                            {
                                                                SubLObject _prev_bind_0_13 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_14 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                    node_and_predicate_mode = list(part_types_pred, sbhl_search_vars.genl_inverse_mode_p());
                                                                    while (NIL != node_and_predicate_mode) {
                                                                        {
                                                                            SubLObject node_var_16 = node_and_predicate_mode.first();
                                                                            SubLObject predicate_mode = second(node_and_predicate_mode);
                                                                            SubLObject spec_pred = node_var_16;
                                                                            {
                                                                                SubLObject _prev_bind_0_17 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                                    {
                                                                                        SubLObject inverseP = predicate_mode;
                                                                                        SubLObject pred_var = spec_pred;
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
                                                                                                                        SubLObject done_var_18 = NIL;
                                                                                                                        SubLObject token_var_19 = NIL;
                                                                                                                        while (NIL == done_var_18) {
                                                                                                                            {
                                                                                                                                SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_19);
                                                                                                                                SubLObject valid_20 = makeBoolean(token_var_19 != gaf);
                                                                                                                                if (NIL != valid_20) {
                                                                                                                                    result = cons(gaf, result);
                                                                                                                                }
                                                                                                                                done_var_18 = makeBoolean(NIL == valid_20);
                                                                                                                            }
                                                                                                                        } 
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0_21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                            if (NIL != final_index_iterator) {
                                                                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                                                            }
                                                                                                                        } finally {
                                                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_21, thread);
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
                                                                                        {
                                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                                                            SubLObject cdolist_list_var = accessible_modules;
                                                                                            SubLObject module_var = NIL;
                                                                                            for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_22 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                    SubLObject _prev_bind_1_23 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                        {
                                                                                                            SubLObject node = function_terms.naut_to_nart(node_var_16);
                                                                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                                {
                                                                                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    if (NIL != d_link) {
                                                                                                                        {
                                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                            if (NIL != mt_links) {
                                                                                                                                {
                                                                                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        {
                                                                                                                                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                                {
                                                                                                                                                    SubLObject _prev_bind_0_24 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                    try {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                        {
                                                                                                                                                            SubLObject iteration_state_25 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_25)) {
                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                {
                                                                                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_25);
                                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject _prev_bind_0_26 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                            try {
                                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                                {
                                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                    SubLObject cdolist_list_var_27 = new_list;
                                                                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                                                                    for (node_vars_link_node = cdolist_list_var_27.first(); NIL != cdolist_list_var_27; cdolist_list_var_27 = cdolist_list_var_27.rest() , node_vars_link_node = cdolist_list_var_27.first()) {
                                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                            deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            } finally {
                                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_26, thread);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    iteration_state_25 = dictionary_contents.do_dictionary_contents_next(iteration_state_25);
                                                                                                                                                                }
                                                                                                                                                            } 
                                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_25);
                                                                                                                                                        }
                                                                                                                                                    } finally {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_24, thread);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                        }
                                                                                                                                    } 
                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt181$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                    }
                                                                                                                }
                                                                                                            } else
                                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                    {
                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        SubLObject cdolist_list_var_28 = new_list;
                                                                                                                        SubLObject generating_fn = NIL;
                                                                                                                        for (generating_fn = cdolist_list_var_28.first(); NIL != cdolist_list_var_28; cdolist_list_var_28 = cdolist_list_var_28.rest() , generating_fn = cdolist_list_var_28.first()) {
                                                                                                                            {
                                                                                                                                SubLObject _prev_bind_0_29 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                try {
                                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                    {
                                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                        SubLObject new_list_30 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                        SubLObject cdolist_list_var_31 = new_list_30;
                                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                                        for (node_vars_link_node = cdolist_list_var_31.first(); NIL != cdolist_list_var_31; cdolist_list_var_31 = cdolist_list_var_31.rest() , node_vars_link_node = cdolist_list_var_31.first()) {
                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } finally {
                                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_29, thread);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }

                                                                                                        }
                                                                                                    } finally {
                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_23, thread);
                                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_22, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_17, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        node_and_predicate_mode = deck.deck_pop(recur_deck);
                                                                    } 
                                                                } finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_15, thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_14, thread);
                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_13, thread);
                                                                }
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt182$Node__a_does_not_pass_sbhl_type_t, part_types_pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_12, thread);
                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_11, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_10, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_9, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_8, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(result);
            }
        }
    }

    public static final SubLObject tptp_corresponding_instance_level_pred(SubLObject type_pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(type_pred, $NEG, NIL)) {
                            {
                                SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(type_pred, $NEG, NIL);
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
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                                    {
                                                        SubLObject done_var_32 = NIL;
                                                        SubLObject token_var_33 = NIL;
                                                        while (NIL == done_var_32) {
                                                            {
                                                                SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_33);
                                                                SubLObject valid_34 = makeBoolean(token_var_33 != rule);
                                                                if (NIL != valid_34) {
                                                                    {
                                                                        SubLObject pos_lit = list_utilities.only_one(clauses.pos_lits(assertions_high.assertion_cnf(rule)));
                                                                        result = cycl_utilities.atomic_sentence_arg1(pos_lit, UNPROVIDED);
                                                                    }
                                                                }
                                                                done_var_32 = makeBoolean(NIL == valid_34);
                                                            }
                                                        } 
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_35 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if (NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_35, thread);
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
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                SubLTrampolineFile.checkType(result, FORT_P);
                return result;
            }
        }
    }

    public static final SubLObject tptp_generate_kb_reflexive_query(SubLObject skeletal_tptp_problem, SubLObject kb_content) {
        {
            SubLObject openness = tptp_datastructures.tptp_problem_openness(skeletal_tptp_problem);
            SubLObject answerability = tptp_datastructures.tptp_problem_answerability(skeletal_tptp_problem);
            SubLObject query = NIL;
            while (NIL == query) {
                {
                    SubLObject query_pred = ($ANSWERABLE == answerability) ? ((SubLObject) (isa.random_instance_of($$ReflexiveBinaryPredicate, mt_vars.$anect_mt$.getGlobalValue()))) : isa.random_instance_of($$BinaryPredicate, mt_vars.$anect_mt$.getGlobalValue());
                    SubLObject query_mt = fort_types_interface.random_mt();
                    SubLObject arg1_isas = kb_accessors.arg1_isa(query_pred, query_mt);
                    if (NIL != list_utilities.singletonP(arg1_isas)) {
                        if (($ANSWERABLE != answerability) || arg1_isas.equal(kb_accessors.arg2_isa(query_pred, query_mt))) {
                            {
                                SubLObject query_arg1 = isa.random_instance_of(list_utilities.only_one(arg1_isas), UNPROVIDED);
                                if (NIL != query_arg1) {
                                    {
                                        SubLObject query_arg2 = ($OPEN == openness) ? ((SubLObject) ($sym190$_WHAT)) : query_arg1;
                                        SubLObject query_asent = (NIL != number_utilities.coin_flip()) ? ((SubLObject) (el_utilities.make_binary_formula(query_pred, query_arg1, query_arg2))) : el_utilities.make_binary_formula(query_pred, query_arg2, query_arg1);
                                        if (NIL != query_has_answerabilityP(query_asent, query_mt, answerability, UNPROVIDED)) {
                                            query = el_utilities.make_ist_sentence(query_mt, query_asent);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } 
            return query;
        }
    }

    public static final SubLObject tptp_generate_kb_symmetric_query(SubLObject skeletal_tptp_problem, SubLObject kb_content) {
        {
            SubLObject openness = tptp_datastructures.tptp_problem_openness(skeletal_tptp_problem);
            SubLObject answerability = tptp_datastructures.tptp_problem_answerability(skeletal_tptp_problem);
            SubLObject query = NIL;
            while (NIL == query) {
                {
                    SubLObject unanswerability_method = ($UNANSWERABLE == answerability) ? ((SubLObject) (NIL != number_utilities.coin_flip() ? ((SubLObject) ($MAKE_UNANSWERABLE_BY_USING_A_NON_SYMMETRIC_PREDICATE)) : $MAKE_UNANSWERABLE_BY_USING_A_RANDOM_MT)) : NIL;
                    SubLObject query_pred = ($MAKE_UNANSWERABLE_BY_USING_A_NON_SYMMETRIC_PREDICATE == unanswerability_method) ? ((SubLObject) (random_non_hl_predicate_instance_of($$BinaryPredicate))) : random_non_hl_predicate_instance_of($$SymmetricBinaryPredicate);
                    SubLObject proof_gaf = assertion_utilities.random_gaf_with_predicate(query_pred);
                    if (NIL != proof_gaf) {
                        {
                            SubLObject proof_arg1 = assertions_high.gaf_arg1(proof_gaf);
                            SubLObject proof_arg2 = assertions_high.gaf_arg2(proof_gaf);
                            SubLObject proof_mt = assertions_high.assertion_mt(proof_gaf);
                            SubLObject open_arg = ($OPEN == openness) ? ((SubLObject) (NIL != number_utilities.coin_flip() ? ((SubLObject) (ONE_INTEGER)) : TWO_INTEGER)) : NIL;
                            SubLObject query_arg1 = (ONE_INTEGER == open_arg) ? ((SubLObject) ($sym155$_ARG1)) : proof_arg2;
                            SubLObject query_arg2 = (TWO_INTEGER == open_arg) ? ((SubLObject) ($sym156$_ARG2)) : proof_arg1;
                            SubLObject query_mt = ($MAKE_UNANSWERABLE_BY_USING_A_RANDOM_MT == unanswerability_method) ? ((SubLObject) (fort_types_interface.random_mt())) : genl_mts.random_spec_mt(proof_mt, UNPROVIDED, UNPROVIDED);
                            SubLObject query_asent = el_utilities.make_binary_formula(query_pred, query_arg1, query_arg2);
                            if (NIL != query_has_answerabilityP(query_asent, query_mt, answerability, UNPROVIDED)) {
                                query = el_utilities.make_ist_sentence(query_mt, query_asent);
                            }
                        }
                    }
                }
            } 
            return query;
        }
    }

    public static final SubLObject random_non_hl_predicate_instance_of(SubLObject col) {
        {
            SubLObject ins = NIL;
            while (NIL == ins) {
                {
                    SubLObject candidate = isa.random_instance_of(col, mt_vars.$anect_mt$.getGlobalValue());
                    if (NIL == hl_supports.hl_predicate_p(candidate)) {
                        ins = candidate;
                    }
                }
            } 
            return ins;
        }
    }

    public static final SubLObject tptp_generate_synthetic_transitive_query(SubLObject skeletal_tptp_problem, SubLObject kb_content) {
        {
            SubLObject openness = tptp_datastructures.tptp_problem_openness(skeletal_tptp_problem);
            SubLObject answerability = tptp_datastructures.tptp_problem_answerability(skeletal_tptp_problem);
            SubLObject query = NIL;
            while (NIL == query) {
                {
                    SubLObject unanswerability_method = ($UNANSWERABLE == answerability) ? ((SubLObject) (NIL != number_utilities.coin_flip() ? ((SubLObject) ($MAKE_UNANSWERABLE_BY_USING_A_RANDOM_REGION)) : $MAKE_UNANSWERABLE_BY_USING_A_RANDOM_MT)) : NIL;
                    SubLObject query_pred = $$geographicalSubRegions;
                    SubLObject query_arg2 = random_geo_region(kb_content);
                    SubLObject proof_gaf = assertion_utilities.random_gaf_with_predicate_and_arg(query_pred, query_arg2, TWO_INTEGER);
                    SubLObject proof_mt = assertions_high.assertion_mt(proof_gaf);
                    SubLObject query_mt = ($MAKE_UNANSWERABLE_BY_USING_A_RANDOM_MT == unanswerability_method) ? ((SubLObject) (list_utilities.random_element(tptp_kb_content_generator.tptp_kb_content_geo_spindle_member_mts(kb_content)))) : proof_mt;
                    SubLObject query_arg1 = ($MAKE_UNANSWERABLE_BY_USING_A_RANDOM_REGION == unanswerability_method) ? ((SubLObject) (random_non_bottom_geo_region(kb_content, proof_mt))) : random_synthetic_proper_super_region(query_arg2, kb_content, proof_mt);
                    if (NIL != query_arg1) {
                        {
                            SubLObject query_asent = el_utilities.make_binary_formula(query_pred, query_arg1, query_arg2);
                            if (NIL != query_has_answerabilityP(query_asent, query_mt, answerability, UNPROVIDED)) {
                                query = el_utilities.make_ist_sentence(query_mt, query_asent);
                            }
                        }
                    }
                }
            } 
            return query;
        }
    }

    /**
     * Returns a geo region that is not one of the bottommost (most specific) regions.
     */
    public static final SubLObject random_non_bottom_geo_region(SubLObject kb_content, SubLObject mt) {
        {
            SubLObject non_bottom_geo_collections = butlast(vector_utilities.vector_elements(tptp_kb_content_generator.tptp_kb_content_geo_collections(kb_content), UNPROVIDED), UNPROVIDED);
            SubLObject col = list_utilities.random_element(non_bottom_geo_collections);
            return isa.random_instance_of(col, mt);
        }
    }

    public static final SubLObject tptp_generate_synthetic_in_region_query(SubLObject skeletal_tptp_problem, SubLObject kb_content) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject openness = tptp_datastructures.tptp_problem_openness(skeletal_tptp_problem);
                SubLObject answerability = tptp_datastructures.tptp_problem_answerability(skeletal_tptp_problem);
                SubLObject query = NIL;
                if ($OPEN != openness) {
                    while (NIL == query) {
                        {
                            SubLObject unanswerability_method = ($UNANSWERABLE == answerability) ? ((SubLObject) (list_utilities.random_element($list_alt204))) : NIL;
                            thread.resetMultipleValues();
                            {
                                SubLObject asent = random_synthetic_in_region_asent_mt(kb_content);
                                SubLObject mt = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject query_mt = (unanswerability_method == $MAKE_UNANSWERABLE_BY_RAISING_THE_MT) ? ((SubLObject) (genl_mts.random_proper_genl_mt(mt, UNPROVIDED, UNPROVIDED))) : genl_mts.random_spec_mt(mt, UNPROVIDED, UNPROVIDED);
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject query_pred = el_utilities.unmake_binary_formula(asent);
                                        SubLObject query_arg1 = thread.secondMultipleValue();
                                        SubLObject region = thread.thirdMultipleValue();
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject query_arg2 = (unanswerability_method == $MAKE_UNANSWERABLE_BY_RANDOMIZING_THE_ARG2) ? ((SubLObject) (random_geo_region(kb_content))) : random_synthetic_proper_super_region(region, kb_content, query_mt);
                                            if (NIL != query_arg2) {
                                                {
                                                    SubLObject query_col = (unanswerability_method == $MAKE_UNANSWERABLE_BY_RANDOMIZING_THE_ISA_COL) ? ((SubLObject) (random_geo_collection(kb_content))) : random_synthetic_isa(query_arg2, query_mt);
                                                    if (NIL != query_col) {
                                                        {
                                                            SubLObject query_sentence = list($$and, list(query_pred, query_arg1, query_arg2), list($$isa, query_arg2, query_col));
                                                            if (NIL != query_has_answerabilityP(query_sentence, query_mt, answerability, UNPROVIDED)) {
                                                                query = el_utilities.make_ist_sentence(query_mt, query_sentence);
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
                }
                return query;
            }
        }
    }

    public static final SubLObject random_geo_region(SubLObject kb_content) {
        return list_utilities.random_element(tptp_kb_content_generator.tptp_kb_content_geo_regions_list(kb_content));
    }

    public static final SubLObject random_geo_collection(SubLObject kb_content) {
        return list_utilities.random_element(vector_utilities.vector_elements(tptp_kb_content_generator.tptp_kb_content_geo_collections(kb_content), UNPROVIDED));
    }

    public static final SubLObject random_synthetic_in_region_asent_mt(SubLObject kb_content) {
        {
            SubLObject gaf = random_synthetic_in_region_gaf(kb_content);
            SubLObject asent = assertions_high.gaf_formula(gaf);
            SubLObject mt = assertions_high.assertion_mt(gaf);
            return values(asent, mt);
        }
    }

    public static final SubLObject random_geo_location(SubLObject kb_content) {
        {
            SubLObject v_2d_vector = tptp_kb_content_generator.tptp_kb_content_geo_locations(kb_content);
            SubLObject v_1d_vector = list_utilities.random_aref(v_2d_vector);
            SubLObject location = list_utilities.random_aref(v_1d_vector);
            return location;
        }
    }

    public static final SubLObject random_synthetic_in_region_gaf(SubLObject kb_content) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject location = random_geo_location(kb_content);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        result = assertion_utilities.random_gaf_with_predicate_and_arg($$inRegion, location, ONE_INTEGER);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == result) {
                        Errors.error($str_alt210$Couldn_t_find_a_region_for__a, location);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @unknown will not return the top region
     */
    public static final SubLObject random_synthetic_proper_super_region(SubLObject region, SubLObject kb_content, SubLObject mt) {
        {
            SubLObject super_regions = ask_utilities.query_variable($X, list($$geographicalSubRegions, $X, region), mt, UNPROVIDED);
            SubLObject synthetic_super_regions = list_utilities.remove_if_not($sym9$SYNTHETIC_TERM_, super_regions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject synthetic_proper_super_regions = remove(region, synthetic_super_regions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject synthetic_non_top_proper_super_regions = remove(tptp_top_geo_region(kb_content), synthetic_proper_super_regions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return list_utilities.random_element(synthetic_non_top_proper_super_regions);
        }
    }

    public static final SubLObject tptp_top_geo_region(SubLObject kb_content) {
        return list_utilities.only_one(isa.all_fort_instances_in_all_mts(vector_utilities.first_aref(tptp_kb_content_generator.tptp_kb_content_geo_collections(kb_content))));
    }

    public static final SubLObject random_synthetic_isa(SubLObject ins, SubLObject mt) {
        return list_utilities.random_element(list_utilities.remove_if_not($sym9$SYNTHETIC_TERM_, isa.all_isa(ins, mt, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject query_has_opennessP(SubLObject expression, SubLObject openness) {
        {
            SubLObject groundP = el_utilities.groundP(expression, UNPROVIDED);
            return eq(makeBoolean(NIL == groundP), makeBoolean(openness != $CLOSED));
        }
    }

    public static final SubLObject query_has_answerabilityP(SubLObject sentence, SubLObject mt, SubLObject answerability, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = $tptp_default_query_properties$.getGlobalValue();
        }
        {
            SubLObject result = inference_kernel.new_cyc_query(sentence, mt, v_properties);
            return eq(makeBoolean(NIL == result), makeBoolean(answerability != $ANSWERABLE));
        }
    }

    /**
     * Usually returns a proper genl, but will return COL if it doesn't find any proper genls.
     */
    public static final SubLObject random_proper_genl_of(SubLObject col, SubLObject mt) {
        {
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(TEN_INTEGER); i = add(i, ONE_INTEGER)) {
                {
                    SubLObject genl = genls.random_genl_of(col, mt);
                    if (col != genl) {
                        return genl;
                    }
                }
            }
        }
        return col;
    }

    /**
     * Usually returns a proper spec, but will return COL if it doesn't find any proper specs.
     */
    public static final SubLObject random_proper_spec_of(SubLObject col, SubLObject mt) {
        {
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(TEN_INTEGER); i = add(i, ONE_INTEGER)) {
                {
                    SubLObject spec = genls.random_spec_of(col, mt);
                    if (col != spec) {
                        return spec;
                    }
                }
            }
        }
        return col;
    }

    public static final SubLObject tptp_query_expanded_justification_lacks_predsP(SubLObject sentence, SubLObject mt, SubLObject blacklist_preds, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = $tptp_default_query_properties$.getGlobalValue();
        }
        {
            SubLObject expanded_justification = tptp_query_expanded_justification(sentence, mt, v_properties, UNPROVIDED);
            SubLObject cdolist_list_var = expanded_justification;
            SubLObject assertion = NIL;
            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                if (NIL != assertion_utilities.gaf_assertion_with_any_of_preds_p(assertion, blacklist_preds)) {
                    return NIL;
                }
            }
        }
        return T;
    }

    public static final SubLObject tptp_query_expanded_justification(SubLObject sentence, SubLObject mt, SubLObject v_properties, SubLObject warnP) {
        if (v_properties == UNPROVIDED) {
            v_properties = $tptp_default_query_properties$.getGlobalValue();
        }
        if (warnP == UNPROVIDED) {
            warnP = T;
        }
        {
            SubLObject explicit_properties = inference_strategist.explicify_inference_mode_defaults(v_properties);
            SubLObject static_properties = inference_datastructures_enumerated_types.extract_query_static_properties(explicit_properties);
            SubLObject dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(explicit_properties);
            SubLObject inference = inference_kernel.new_continuable_inference(sentence, mt, static_properties);
            if (NIL == inference_kernel.continue_inference(inference, dynamic_properties)) {
                if (NIL != warnP) {
                    Errors.warn($str_alt212$Expected____ist__s__s__to_be_answ, mt, sentence, v_properties);
                }
                return NIL;
            }
            {
                SubLObject justification = tptp_postprocess_expanded_justification(tptp_inference_expanded_justification(inference));
                inference_datastructures_inference.destroy_inference_and_problem_store(inference);
                return justification;
            }
        }
    }

    public static final SubLObject tptp_inference_expanded_justification(SubLObject inference) {
        {
            SubLObject justification = inference_utilities.inference_expanded_justification(inference);
            SubLObject query_mt = inference_datastructures_inference.inference_mt(inference);
            SubLObject support_mts = delete_duplicates(Mapping.mapcar(symbol_function(SUPPORT_MT), justification), symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject genl_mt_supports = NIL;
            SubLObject cdolist_list_var = support_mts;
            SubLObject support_mt = NIL;
            for (support_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support_mt = cdolist_list_var.first()) {
                if (NIL == hlmt.hlmt_equal(support_mt, query_mt)) {
                    {
                        SubLObject support_sentence = el_utilities.make_binary_formula($$genlMt, query_mt, support_mt);
                        SubLObject support = arguments.make_hl_support($GENLMT, support_sentence, query_mt, UNPROVIDED);
                        genl_mt_supports = cons(support, genl_mt_supports);
                    }
                }
            }
            {
                SubLObject genl_mt_justification = hl_supports.hl_justification_expand(genl_mt_supports);
                SubLObject complete_justification = union(justification, genl_mt_justification, symbol_function(EQUAL), UNPROVIDED);
                return arguments.sort_supports(complete_justification);
            }
        }
    }

    // deflexical
    private static final SubLSymbol $tptp_core_rule_sentences$ = makeSymbol("*TPTP-CORE-RULE-SENTENCES*");

    // deflexical
    private static final SubLSymbol $tptp_core_rules$ = makeSymbol("*TPTP-CORE-RULES*");

    public static final SubLObject tptp_core_rules() {
        if (NIL != misc_utilities.uninitialized_p($tptp_core_rules$.getGlobalValue())) {
            {
                SubLObject rules = Mapping.mapcar(FIND_ASSERTION_CYCL, $tptp_core_rule_sentences$.getGlobalValue());
                SubLObject list_var = rules;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, ASSERTION_P);
                    }
                }
                $tptp_core_rules$.setGlobalValue(rules);
            }
        }
        return copy_list($tptp_core_rules$.getGlobalValue());
    }

    public static final SubLObject tptp_core_ruleP(SubLObject rule) {
        return list_utilities.member_eqP(rule, tptp_core_rules());
    }

    /**
     * Rules in this list are not needed in the justifications because they will
     * be axiom schematized by the expansions of the rule macro predicates.
     */
    // deflexical
    private static final SubLSymbol $code_rule_sentences_handled_by_expansion$ = makeSymbol("*CODE-RULE-SENTENCES-HANDLED-BY-EXPANSION*");

    public static final SubLObject tptp_postprocess_expanded_justification(SubLObject justification) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_justification = NIL;
                SubLObject cdolist_list_var = justification;
                SubLObject support = NIL;
                for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                    if (NIL != assertion_handles.assertion_p(support)) {
                        new_justification = cons(support, new_justification);
                    } else {
                        {
                            SubLObject module = arguments.hl_support_module(support);
                            SubLObject pcase_var = module;
                            if (pcase_var.eql($CODE)) {
                                {
                                    SubLObject sentence = arguments.hl_support_sentence(support);
                                    SubLObject mt = arguments.hl_support_mt(support);
                                    SubLObject assertion = czer_meta.find_assertion_cycl(sentence, mt);
                                    if (NIL == assertion) {
                                        Errors.warn($str_alt221$Could_not_find_assertion_correspo, support);
                                        return NIL;
                                    }
                                    if (NIL != list_utilities.member_equalP(sentence, $code_rule_sentences_handled_by_expansion$.getGlobalValue())) {
                                    } else {
                                        new_justification = cons(assertion, new_justification);
                                    }
                                }
                            } else
                                if (pcase_var.eql($ADMIT)) {
                                    {
                                        SubLObject handledP = NIL;
                                        SubLObject hl_support_sentence = arguments.hl_support_sentence(support);
                                        SubLObject mt = arguments.hl_support_mt(support);
                                        if ((NIL != el_utilities.el_negation_p(hl_support_sentence)) && (NIL != cycl_utilities.atomic_sentence_with_pred_p(cycl_utilities.sentence_arg1(hl_support_sentence, UNPROVIDED), $$admittedSentence))) {
                                            {
                                                SubLObject subsentence = cycl_utilities.sentence_arg1(cycl_utilities.sentence_arg1(hl_support_sentence, UNPROVIDED), UNPROVIDED);
                                                SubLObject justifying_assertions = tptp_hl_justify_not_admitted_sentence(subsentence, mt);
                                                if (NIL != justifying_assertions) {
                                                    {
                                                        SubLObject items_var = justifying_assertions;
                                                        if (items_var.isVector()) {
                                                            {
                                                                SubLObject vector_var = justifying_assertions;
                                                                SubLObject backwardP_var = NIL;
                                                                SubLObject length = length(vector_var);
                                                                SubLObject v_iteration = NIL;
                                                                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                                    {
                                                                        SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                                                        SubLObject item = aref(vector_var, element_num);
                                                                        new_justification = cons(item, new_justification);
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            {
                                                                SubLObject cdolist_list_var_36 = justifying_assertions;
                                                                SubLObject item = NIL;
                                                                for (item = cdolist_list_var_36.first(); NIL != cdolist_list_var_36; cdolist_list_var_36 = cdolist_list_var_36.rest() , item = cdolist_list_var_36.first()) {
                                                                    new_justification = cons(item, new_justification);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    handledP = T;
                                                }
                                            }
                                        } else
                                            if (NIL != cycl_utilities.atomic_sentence_with_pred_p(hl_support_sentence, $$admittedArgument)) {
                                                {
                                                    SubLObject justifying_assertions_set = set.new_set(symbol_function(EQ), UNPROVIDED);
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject admitted_argument = el_utilities.unmake_ternary_formula(hl_support_sentence);
                                                        SubLObject arg = thread.secondMultipleValue();
                                                        SubLObject argnum = thread.thirdMultipleValue();
                                                        SubLObject pred = thread.fourthMultipleValue();
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject cdolist_list_var_37 = kb_accessors.argn_isa(pred, argnum, mt);
                                                            SubLObject col = NIL;
                                                            for (col = cdolist_list_var_37.first(); NIL != cdolist_list_var_37; cdolist_list_var_37 = cdolist_list_var_37.rest() , col = cdolist_list_var_37.first()) {
                                                                {
                                                                    SubLObject justifying_assertions = tptp_query_expanded_justification(list($$isa, arg, col), mt, $tptp_default_query_properties$.getGlobalValue(), NIL);
                                                                    set_utilities.set_add_all(justifying_assertions, justifying_assertions_set);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (NIL == set.set_emptyP(justifying_assertions_set)) {
                                                        {
                                                            SubLObject items_var = set.set_element_list(justifying_assertions_set);
                                                            if (items_var.isVector()) {
                                                                {
                                                                    SubLObject vector_var = set.set_element_list(justifying_assertions_set);
                                                                    SubLObject backwardP_var = NIL;
                                                                    SubLObject length = length(vector_var);
                                                                    SubLObject v_iteration = NIL;
                                                                    for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                                        {
                                                                            SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                                                            SubLObject item = aref(vector_var, element_num);
                                                                            new_justification = cons(item, new_justification);
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                {
                                                                    SubLObject cdolist_list_var_38 = set.set_element_list(justifying_assertions_set);
                                                                    SubLObject item = NIL;
                                                                    for (item = cdolist_list_var_38.first(); NIL != cdolist_list_var_38; cdolist_list_var_38 = cdolist_list_var_38.rest() , item = cdolist_list_var_38.first()) {
                                                                        new_justification = cons(item, new_justification);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        handledP = T;
                                                    }
                                                }
                                            }

                                        if (NIL == handledP) {
                                            Errors.warn($str_alt225$Unhandled__ADMIT_support__a__skip, support);
                                            return NIL;
                                        }
                                    }
                                } else {
                                    Errors.warn($str_alt226$Unhandled_HL_support__a__skipping, support);
                                    return NIL;
                                }

                        }
                    }
                }
                new_justification = nreverse(new_justification);
                return append(new_justification, tptp_core_rules());
            }
        }
    }

    /**
     * Return assertions justifying why SENTENCE is ill-formed in MT
     */
    public static final SubLObject tptp_hl_justify_not_admitted_sentence(SubLObject sentence, SubLObject mt) {
        {
            SubLObject justifying_assertions = NIL;
            SubLObject cycl_explanation = wff.hl_explanation_of_why_not_wff(sentence, mt);
            if (NIL != el_utilities.el_conjunction_p(cycl_explanation)) {
                {
                    SubLObject cdolist_list_var = cycl_utilities.sentence_args(cycl_explanation, UNPROVIDED);
                    SubLObject conjunct = NIL;
                    for (conjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunct = cdolist_list_var.first()) {
                        if (NIL != assertion_handles.assertion_p(conjunct)) {
                            justifying_assertions = cons(conjunct, justifying_assertions);
                        } else
                            if (NIL != el_utilities.ist_sentence_p(conjunct)) {
                                {
                                    SubLObject sub_mt = cycl_utilities.atomic_sentence_arg1(conjunct, UNPROVIDED);
                                    SubLObject subsentence = cycl_utilities.atomic_sentence_arg2(conjunct, UNPROVIDED);
                                    SubLObject sub_justification = tptp_query_expanded_justification(subsentence, sub_mt, UNPROVIDED, UNPROVIDED);
                                    if (NIL == sub_justification) {
                                        return NIL;
                                    }
                                    {
                                        SubLObject items_var = sub_justification;
                                        if (items_var.isVector()) {
                                            {
                                                SubLObject vector_var = sub_justification;
                                                SubLObject backwardP_var = NIL;
                                                SubLObject length = length(vector_var);
                                                SubLObject v_iteration = NIL;
                                                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                    {
                                                        SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                                        SubLObject item = aref(vector_var, element_num);
                                                        justifying_assertions = cons(item, justifying_assertions);
                                                    }
                                                }
                                            }
                                        } else {
                                            {
                                                SubLObject cdolist_list_var_39 = sub_justification;
                                                SubLObject item = NIL;
                                                for (item = cdolist_list_var_39.first(); NIL != cdolist_list_var_39; cdolist_list_var_39 = cdolist_list_var_39.rest() , item = cdolist_list_var_39.first()) {
                                                    justifying_assertions = cons(item, justifying_assertions);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                Errors.warn($str_alt227$Couldn_t_handle___not___admittedS, conjunct);
                            }

                    }
                }
            }
            return nreverse(justifying_assertions);
        }
    }

    public static final SubLObject declare_tptp_modules_file() {
        declareFunction("tptp_linchpin_module_property_p", "TPTP-LINCHPIN-MODULE-PROPERTY-P", 1, 0, false);
        declareFunction("tptp_linchpin_module", "TPTP-LINCHPIN-MODULE", 2, 0, false);
        declareFunction("tptp_linchpin_module_name_p", "TPTP-LINCHPIN-MODULE-NAME-P", 1, 0, false);
        declareFunction("tptp_linchpin_module_property_lookup", "TPTP-LINCHPIN-MODULE-PROPERTY-LOOKUP", 2, 0, false);
        declareFunction("tptp_linchpin_module_func", "TPTP-LINCHPIN-MODULE-FUNC", 1, 0, false);
        declareFunction("tptp_linchpin_module_query_generation_module", "TPTP-LINCHPIN-MODULE-QUERY-GENERATION-MODULE", 1, 0, false);
        declareFunction("tptp_linchpin_module_open_okP", "TPTP-LINCHPIN-MODULE-OPEN-OK?", 1, 0, false);
        declareFunction("generate_dynamic_tptp_problem", "GENERATE-DYNAMIC-TPTP-PROBLEM", 3, 0, false);
        declareFunction("tptp_linchpin_candidate", "TPTP-LINCHPIN-CANDIDATE", 4, 0, false);
        declareFunction("generate_tptp_problem", "GENERATE-TPTP-PROBLEM", 5, 0, false);
        declareFunction("tptp_lookup_linchpin_candidate", "TPTP-LOOKUP-LINCHPIN-CANDIDATE", 3, 0, false);
        declareFunction("tptp_genls_linchpin_candidate", "TPTP-GENLS-LINCHPIN-CANDIDATE", 3, 0, false);
        declareFunction("tptp_any_instances_linchpin_candidate", "TPTP-ANY-INSTANCES-LINCHPIN-CANDIDATE", 3, 0, false);
        declareFunction("tptp_disjoint_with_linchpin_candidate", "TPTP-DISJOINT-WITH-LINCHPIN-CANDIDATE", 3, 0, false);
        declareFunction("tptp_genl_preds_linchpin_candidate", "TPTP-GENL-PREDS-LINCHPIN-CANDIDATE", 3, 0, false);
        declareFunction("tptp_genl_preds_lookup_linchpin_candidate", "TPTP-GENL-PREDS-LOOKUP-LINCHPIN-CANDIDATE", 3, 0, false);
        declareFunction("tptp_genl_inverse_lookup_linchpin_candidate", "TPTP-GENL-INVERSE-LOOKUP-LINCHPIN-CANDIDATE", 3, 0, false);
        declareFunction("tptp_relation_all_instance_lookup_linchpin_candidate", "TPTP-RELATION-ALL-INSTANCE-LOOKUP-LINCHPIN-CANDIDATE", 3, 0, false);
        declareFunction("tptp_relation_all_exists_lookup_linchpin_candidate", "TPTP-RELATION-ALL-EXISTS-LOOKUP-LINCHPIN-CANDIDATE", 3, 0, false);
        declareFunction("tptp_geographical_sub_regions_linchpin_candidate", "TPTP-GEOGRAPHICAL-SUB-REGIONS-LINCHPIN-CANDIDATE", 3, 0, false);
        declareFunction("tptp_tva_through_geographical_sub_regions_linchpin_candidate", "TPTP-TVA-THROUGH-GEOGRAPHICAL-SUB-REGIONS-LINCHPIN-CANDIDATE", 3, 0, false);
        declareFunction("tptp_genl_mt_link_linchpin_candidate", "TPTP-GENL-MT-LINK-LINCHPIN-CANDIDATE", 3, 0, false);
        declareFunction("tptp_mt_linchpin_candidate", "TPTP-MT-LINCHPIN-CANDIDATE", 3, 0, false);
        declareFunction("tptp_query_generation_module_property_p", "TPTP-QUERY-GENERATION-MODULE-PROPERTY-P", 1, 0, false);
        declareFunction("tptp_query_generation_module", "TPTP-QUERY-GENERATION-MODULE", 2, 0, false);
        declareFunction("tptp_query_generation_module_name_p", "TPTP-QUERY-GENERATION-MODULE-NAME-P", 1, 0, false);
        declareFunction("tptp_query_generation_module_func", "TPTP-QUERY-GENERATION-MODULE-FUNC", 1, 0, false);
        declareFunction("tptp_query_generation_module_open_okP", "TPTP-QUERY-GENERATION-MODULE-OPEN-OK?", 1, 0, false);
        declareFunction("tptp_query_generation_module_comment", "TPTP-QUERY-GENERATION-MODULE-COMMENT", 1, 0, false);
        declareFunction("invoke_tptp_query_generation_module", "INVOKE-TPTP-QUERY-GENERATION-MODULE", 3, 0, false);
        declareFunction("generate_static_tptp_problem", "GENERATE-STATIC-TPTP-PROBLEM", 4, 0, false);
        declareFunction("generate_tptp_problem_from_module", "GENERATE-TPTP-PROBLEM-FROM-MODULE", 4, 0, false);
        declareFunction("generate_tptp_problem_from_module_int", "GENERATE-TPTP-PROBLEM-FROM-MODULE-INT", 4, 0, false);
        declareFunction("test_query_generation_module", "TEST-QUERY-GENERATION-MODULE", 3, 0, false);
        declareFunction("test_query_generation_module_once", "TEST-QUERY-GENERATION-MODULE-ONCE", 3, 0, false);
        declareFunction("generate_tptp_problem_from_query", "GENERATE-TPTP-PROBLEM-FROM-QUERY", 4, 0, false);
        declareFunction("tptp_generate_pos_kb_lookup_query", "TPTP-GENERATE-POS-KB-LOOKUP-QUERY", 2, 0, false);
        declareFunction("tptp_generate_pos_synthetic_lookup_query", "TPTP-GENERATE-POS-SYNTHETIC-LOOKUP-QUERY", 2, 0, false);
        declareFunction("tptp_generate_pos_lookup_query_int", "TPTP-GENERATE-POS-LOOKUP-QUERY-INT", 4, 0, false);
        declareFunction("tptp_make_atomic_sentence_unanswerable", "TPTP-MAKE-ATOMIC-SENTENCE-UNANSWERABLE", 2, 1, false);
        declareFunction("tptp_make_atomic_sentence_unanswerable_by_raising_the_mt", "TPTP-MAKE-ATOMIC-SENTENCE-UNANSWERABLE-BY-RAISING-THE-MT", 3, 0, false);
        declareFunction("tptp_make_atomic_sentence_unanswerable_by_tweaking_the_sentence", "TPTP-MAKE-ATOMIC-SENTENCE-UNANSWERABLE-BY-TWEAKING-THE-SENTENCE", 3, 0, false);
        declareFunction("turn_a_random_arg_into_a_variable_but_keep_something_synthetic", "TURN-A-RANDOM-ARG-INTO-A-VARIABLE-BUT-KEEP-SOMETHING-SYNTHETIC", 1, 0, false);
        declareFunction("tptp_generate_kb_genls_query", "TPTP-GENERATE-KB-GENLS-QUERY", 2, 0, false);
        declareFunction("tptp_generate_synthetic_genls_query", "TPTP-GENERATE-SYNTHETIC-GENLS-QUERY", 2, 0, false);
        declareFunction("tptp_generate_genls_query", "TPTP-GENERATE-GENLS-QUERY", 3, 0, false);
        declareFunction("tptp_generate_genls_query_int", "TPTP-GENERATE-GENLS-QUERY-INT", 5, 0, false);
        declareFunction("random_possibly_synthetic_collection", "RANDOM-POSSIBLY-SYNTHETIC-COLLECTION", 2, 0, false);
        declareFunction("random_possibly_synthetic_proper_genl_of", "RANDOM-POSSIBLY-SYNTHETIC-PROPER-GENL-OF", 3, 0, false);
        declareFunction("random_possibly_synthetic_proper_spec_of", "RANDOM-POSSIBLY-SYNTHETIC-PROPER-SPEC-OF", 3, 0, false);
        declareFunction("tptp_generate_kb_isa_query", "TPTP-GENERATE-KB-ISA-QUERY", 2, 0, false);
        declareFunction("tptp_generate_kb_not_isa_query", "TPTP-GENERATE-KB-NOT-ISA-QUERY", 2, 0, false);
        declareFunction("tptp_generate_kb_unknown_isa_query", "TPTP-GENERATE-KB-UNKNOWN-ISA-QUERY", 2, 0, false);
        declareFunction("tptp_generate_synthetic_singleton_query", "TPTP-GENERATE-SYNTHETIC-SINGLETON-QUERY", 2, 0, false);
        declareFunction("tptp_generate_kb_arg_type_violation_query", "TPTP-GENERATE-KB-ARG-TYPE-VIOLATION-QUERY", 2, 0, false);
        declareFunction("tptp_generate_answerable_kb_arg_type_violation_query", "TPTP-GENERATE-ANSWERABLE-KB-ARG-TYPE-VIOLATION-QUERY", 2, 0, false);
        declareFunction("random_unknown_instance_of", "RANDOM-UNKNOWN-INSTANCE-OF", 2, 0, false);
        declareFunction("tptp_generate_kb_disjoint_with_query", "TPTP-GENERATE-KB-DISJOINT-WITH-QUERY", 2, 0, false);
        declareFunction("tptp_generate_synthetic_disjoint_with_query", "TPTP-GENERATE-SYNTHETIC-DISJOINT-WITH-QUERY", 2, 0, false);
        declareFunction("tptp_generate_disjoint_with_query", "TPTP-GENERATE-DISJOINT-WITH-QUERY", 3, 0, false);
        declareFunction("tptp_generate_disjoint_with_query_int", "TPTP-GENERATE-DISJOINT-WITH-QUERY-INT", 5, 0, false);
        declareFunction("tptp_generate_kb_genl_preds_query", "TPTP-GENERATE-KB-GENL-PREDS-QUERY", 2, 0, false);
        declareFunction("tptp_generate_synthetic_genl_preds_query", "TPTP-GENERATE-SYNTHETIC-GENL-PREDS-QUERY", 2, 0, false);
        declareFunction("tptp_generate_kb_genl_inverse_query", "TPTP-GENERATE-KB-GENL-INVERSE-QUERY", 2, 0, false);
        declareFunction("tptp_generate_synthetic_genl_inverse_query", "TPTP-GENERATE-SYNTHETIC-GENL-INVERSE-QUERY", 2, 0, false);
        declareFunction("tptp_generate_genl_preds_query", "TPTP-GENERATE-GENL-PREDS-QUERY", 4, 0, false);
        declareFunction("choose_arg2_for_genl_preds_query", "CHOOSE-ARG2-FOR-GENL-PREDS-QUERY", 7, 0, false);
        declareFunction("random_possibly_synthetic_predicate", "RANDOM-POSSIBLY-SYNTHETIC-PREDICATE", 4, 0, false);
        declareFunction("random_possibly_synthetic_proper_genl_pred_or_inverse", "RANDOM-POSSIBLY-SYNTHETIC-PROPER-GENL-PRED-OR-INVERSE", 4, 0, false);
        declareFunction("tptp_generate_synthetic_part_types_genl_pred_query", "TPTP-GENERATE-SYNTHETIC-PART-TYPES-GENL-PRED-QUERY", 2, 0, false);
        declareFunction("tptp_generate_synthetic_part_types_genl_inverse_query", "TPTP-GENERATE-SYNTHETIC-PART-TYPES-GENL-INVERSE-QUERY", 2, 0, false);
        declareFunction("tptp_generate_part_types_genl_pred_query", "TPTP-GENERATE-PART-TYPES-GENL-PRED-QUERY", 3, 0, false);
        declareFunction("random_synthetic_proper_genl_predicate_of_with_no_predicate_extent", "RANDOM-SYNTHETIC-PROPER-GENL-PREDICATE-OF-WITH-NO-PREDICATE-EXTENT", 2, 0, false);
        declareFunction("random_synthetic_proper_genl_inverse_of_with_no_predicate_extent", "RANDOM-SYNTHETIC-PROPER-GENL-INVERSE-OF-WITH-NO-PREDICATE-EXTENT", 2, 0, false);
        declareFunction("random_synthetic_part_types_asent_mt_with_a_synthetic_proper_genl_pred", "RANDOM-SYNTHETIC-PART-TYPES-ASENT-MT-WITH-A-SYNTHETIC-PROPER-GENL-PRED", 1, 0, false);
        declareFunction("random_synthetic_proper_genl_predicate_of", "RANDOM-SYNTHETIC-PROPER-GENL-PREDICATE-OF", 2, 0, false);
        declareFunction("random_synthetic_proper_genl_inverse_of", "RANDOM-SYNTHETIC-PROPER-GENL-INVERSE-OF", 2, 0, false);
        declareFunction("tptp_generate_synthetic_tptp_of_object_query", "TPTP-GENERATE-SYNTHETIC-TPTP-OF-OBJECT-QUERY", 2, 0, false);
        declareFunction("random_synthetic_relation_all_instance_asent_mt", "RANDOM-SYNTHETIC-RELATION-ALL-INSTANCE-ASENT-MT", 1, 0, false);
        declareFunction("all_synthetic_relation_all_instance_gafs", "ALL-SYNTHETIC-RELATION-ALL-INSTANCE-GAFS", 1, 0, false);
        declareFunction("tptp_generate_synthetic_parts_query", "TPTP-GENERATE-SYNTHETIC-PARTS-QUERY", 2, 0, false);
        declareFunction("random_synthetic_part_types_asent_mt", "RANDOM-SYNTHETIC-PART-TYPES-ASENT-MT", 1, 0, false);
        declareFunction("all_synthetic_part_types_gafs", "ALL-SYNTHETIC-PART-TYPES-GAFS", 1, 0, false);
        declareFunction("tptp_corresponding_instance_level_pred", "TPTP-CORRESPONDING-INSTANCE-LEVEL-PRED", 1, 0, false);
        declareFunction("tptp_generate_kb_reflexive_query", "TPTP-GENERATE-KB-REFLEXIVE-QUERY", 2, 0, false);
        declareFunction("tptp_generate_kb_symmetric_query", "TPTP-GENERATE-KB-SYMMETRIC-QUERY", 2, 0, false);
        declareFunction("random_non_hl_predicate_instance_of", "RANDOM-NON-HL-PREDICATE-INSTANCE-OF", 1, 0, false);
        declareFunction("tptp_generate_synthetic_transitive_query", "TPTP-GENERATE-SYNTHETIC-TRANSITIVE-QUERY", 2, 0, false);
        declareFunction("random_non_bottom_geo_region", "RANDOM-NON-BOTTOM-GEO-REGION", 2, 0, false);
        declareFunction("tptp_generate_synthetic_in_region_query", "TPTP-GENERATE-SYNTHETIC-IN-REGION-QUERY", 2, 0, false);
        declareFunction("random_geo_region", "RANDOM-GEO-REGION", 1, 0, false);
        declareFunction("random_geo_collection", "RANDOM-GEO-COLLECTION", 1, 0, false);
        declareFunction("random_synthetic_in_region_asent_mt", "RANDOM-SYNTHETIC-IN-REGION-ASENT-MT", 1, 0, false);
        declareFunction("random_geo_location", "RANDOM-GEO-LOCATION", 1, 0, false);
        declareFunction("random_synthetic_in_region_gaf", "RANDOM-SYNTHETIC-IN-REGION-GAF", 1, 0, false);
        declareFunction("random_synthetic_proper_super_region", "RANDOM-SYNTHETIC-PROPER-SUPER-REGION", 3, 0, false);
        declareFunction("tptp_top_geo_region", "TPTP-TOP-GEO-REGION", 1, 0, false);
        declareFunction("random_synthetic_isa", "RANDOM-SYNTHETIC-ISA", 2, 0, false);
        declareFunction("query_has_opennessP", "QUERY-HAS-OPENNESS?", 2, 0, false);
        declareFunction("query_has_answerabilityP", "QUERY-HAS-ANSWERABILITY?", 3, 1, false);
        declareFunction("random_proper_genl_of", "RANDOM-PROPER-GENL-OF", 2, 0, false);
        declareFunction("random_proper_spec_of", "RANDOM-PROPER-SPEC-OF", 2, 0, false);
        declareFunction("tptp_query_expanded_justification_lacks_predsP", "TPTP-QUERY-EXPANDED-JUSTIFICATION-LACKS-PREDS?", 3, 1, false);
        declareFunction("tptp_query_expanded_justification", "TPTP-QUERY-EXPANDED-JUSTIFICATION", 2, 2, false);
        declareFunction("tptp_inference_expanded_justification", "TPTP-INFERENCE-EXPANDED-JUSTIFICATION", 1, 0, false);
        declareFunction("tptp_core_rules", "TPTP-CORE-RULES", 0, 0, false);
        declareFunction("tptp_core_ruleP", "TPTP-CORE-RULE?", 1, 0, false);
        declareFunction("tptp_postprocess_expanded_justification", "TPTP-POSTPROCESS-EXPANDED-JUSTIFICATION", 1, 0, false);
        declareFunction("tptp_hl_justify_not_admitted_sentence", "TPTP-HL-JUSTIFY-NOT-ADMITTED-SENTENCE", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_tptp_modules_file() {
        deflexical("*TPTP-DEFAULT-QUERY-PROPERTIES*", $list_alt0);
        deflexical("*TPTP-LINCHPIN-MODULES*", NIL != boundp($tptp_linchpin_modules$) ? ((SubLObject) ($tptp_linchpin_modules$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        deflexical("*TPTP-LINCHPIN-MODULE-PROPERTIES*", $list_alt2);
        deflexical("*TPTP-QUERY-GENERATION-MODULES*", NIL != boundp($tptp_query_generation_modules$) ? ((SubLObject) ($tptp_query_generation_modules$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        deflexical("*TPTP-QUERY-GENERATION-MODULE-PROPERTIES*", $list_alt65);
        deflexical("*TODO-ISA-QUERY*", NIL != boundp($todo_isa_query$) ? ((SubLObject) ($todo_isa_query$.getGlobalValue())) : NIL);
        deflexical("*TPTP-CORE-RULE-SENTENCES*", $list_alt215);
        deflexical("*TPTP-CORE-RULES*", misc_utilities.uninitialized());
        deflexical("*CODE-RULE-SENTENCES-HANDLED-BY-EXPANSION*", $list_alt219);
        return NIL;
    }

    public static final SubLObject setup_tptp_modules_file() {
                subl_macro_promotions.declare_defglobal($tptp_linchpin_modules$);
        tptp_linchpin_module($LOOKUP, $list_alt18);
        tptp_linchpin_module($GENLS_GAF, $list_alt20);
        tptp_linchpin_module($ANY_INSTANCES, $list_alt24);
        tptp_linchpin_module($DISJOINT_WITH, $list_alt26);
        utilities_macros.note_funcall_helper_function(TPTP_DISJOINT_WITH_LINCHPIN_CANDIDATE);
        tptp_linchpin_module($GENL_PREDS, $list_alt30);
        tptp_linchpin_module($GENL_INVERSE, $list_alt32);
        utilities_macros.note_funcall_helper_function(TPTP_GENL_PREDS_LINCHPIN_CANDIDATE);
        tptp_linchpin_module($GENL_PREDS_LOOKUP, $list_alt37);
        utilities_macros.note_funcall_helper_function(TPTP_GENL_PREDS_LOOKUP_LINCHPIN_CANDIDATE);
        tptp_linchpin_module($GENL_INVERSE_LOOKUP, $list_alt40);
        utilities_macros.note_funcall_helper_function(TPTP_GENL_INVERSE_LOOKUP_LINCHPIN_CANDIDATE);
        tptp_linchpin_module($RELATION_ALL_INSTANCE_LOOKUP, $list_alt43);
        utilities_macros.note_funcall_helper_function(TPTP_RELATION_ALL_INSTANCE_LOOKUP_LINCHPIN_CANDIDATE);
        tptp_linchpin_module($RELATION_ALL_EXISTS_LOOKUP, $list_alt47);
        utilities_macros.note_funcall_helper_function(TPTP_RELATION_ALL_EXISTS_LOOKUP_LINCHPIN_CANDIDATE);
        tptp_linchpin_module($TRANSITIVE_GEOGRAPHICAL_SUB_REGIONS, $list_alt51);
        utilities_macros.note_funcall_helper_function(TPTP_GEOGRAPHICAL_SUB_REGIONS_LINCHPIN_CANDIDATE);
        tptp_linchpin_module($TVA_THROUGH_GEOGRAPHICAL_SUB_REGIONS, $list_alt55);
        utilities_macros.note_funcall_helper_function(TPTP_TVA_THROUGH_GEOGRAPHICAL_SUB_REGIONS_LINCHPIN_CANDIDATE);
        tptp_linchpin_module($GENL_MT_LINK, $list_alt58);
        utilities_macros.note_funcall_helper_function(TPTP_GENL_MT_LINK_LINCHPIN_CANDIDATE);
        tptp_linchpin_module($MT, $list_alt62);
        utilities_macros.note_funcall_helper_function(TPTP_MT_LINCHPIN_CANDIDATE);
        subl_macro_promotions.declare_defglobal($tptp_query_generation_modules$);
        tptp_query_generation_module($LOOKUP_POS_KB, $list_alt82);
        utilities_macros.note_funcall_helper_function(TPTP_GENERATE_POS_KB_LOOKUP_QUERY);
        tptp_query_generation_module($LOOKUP_POS_SYNTHETIC, $list_alt85);
        utilities_macros.note_funcall_helper_function(TPTP_GENERATE_POS_SYNTHETIC_LOOKUP_QUERY);
        tptp_query_generation_module($GENLS_KB, $list_alt93);
        utilities_macros.note_funcall_helper_function(TPTP_GENERATE_KB_GENLS_QUERY);
        tptp_query_generation_module($GENLS_SYNTHETIC, $list_alt96);
        utilities_macros.note_funcall_helper_function(TPTP_GENERATE_SYNTHETIC_GENLS_QUERY);
        tptp_query_generation_module($ISA_KB, $list_alt100);
        utilities_macros.note_funcall_helper_function(TPTP_GENERATE_KB_ISA_QUERY);
        tptp_query_generation_module($NOT_ISA_KB, $list_alt105);
        utilities_macros.note_funcall_helper_function(TPTP_GENERATE_KB_NOT_ISA_QUERY);
        tptp_query_generation_module($UNKNOWN_ISA_KB, $list_alt109);
        subl_macro_promotions.declare_defglobal($todo_isa_query$);
        utilities_macros.note_funcall_helper_function(TPTP_GENERATE_KB_UNKNOWN_ISA_QUERY);
        tptp_query_generation_module($ISA_SYNTHETIC_SINGLETON, $list_alt113);
        utilities_macros.note_funcall_helper_function(TPTP_GENERATE_SYNTHETIC_SINGLETON_QUERY);
        tptp_query_generation_module($NEGATION_VIA_ARG_TYPE_VIOLATION, $list_alt120);
        utilities_macros.note_funcall_helper_function(TPTP_GENERATE_KB_ARG_TYPE_VIOLATION_QUERY);
        tptp_query_generation_module($DISJOINT_WITH_KB, $list_alt125);
        utilities_macros.note_funcall_helper_function(TPTP_GENERATE_KB_DISJOINT_WITH_QUERY);
        tptp_query_generation_module($DISJOINT_WITH_SYNTHETIC, $list_alt128);
        utilities_macros.note_funcall_helper_function(TPTP_GENERATE_SYNTHETIC_DISJOINT_WITH_QUERY);
        tptp_query_generation_module($GENL_PREDS_KB, $list_alt132);
        utilities_macros.note_funcall_helper_function(TPTP_GENERATE_KB_GENL_PREDS_QUERY);
        tptp_query_generation_module($GENL_PREDS_SYNTHETIC, $list_alt136);
        utilities_macros.note_funcall_helper_function(TPTP_GENERATE_SYNTHETIC_GENL_PREDS_QUERY);
        tptp_query_generation_module($GENL_INVERSE_KB, $list_alt139);
        utilities_macros.note_funcall_helper_function(TPTP_GENERATE_KB_GENL_INVERSE_QUERY);
        tptp_query_generation_module($GENL_INVERSE_SYNTHETIC, $list_alt143);
        utilities_macros.note_funcall_helper_function(TPTP_GENERATE_SYNTHETIC_GENL_INVERSE_QUERY);
        tptp_query_generation_module($PART_TYPES_GENL_PREDS_LOOKUP, $list_alt149);
        utilities_macros.note_funcall_helper_function(TPTP_GENERATE_SYNTHETIC_PART_TYPES_GENL_PRED_QUERY);
        tptp_query_generation_module($PART_TYPES_GENL_INVERSE_LOOKUP, $list_alt152);
        utilities_macros.note_funcall_helper_function(TPTP_GENERATE_SYNTHETIC_PART_TYPES_GENL_INVERSE_QUERY);
        tptp_query_generation_module($TPTP_OF_OBJECT_RELATION_ALL_INSTANCE_LOOKUP, $list_alt158);
        utilities_macros.note_funcall_helper_function(TPTP_GENERATE_SYNTHETIC_TPTP_OF_OBJECT_QUERY);
        tptp_query_generation_module($PARTS_VIA_RELATION_ALL_EXISTS, $list_alt164);
        utilities_macros.note_funcall_helper_function(TPTP_GENERATE_SYNTHETIC_PARTS_QUERY);
        tptp_query_generation_module($REFLEXIVE_KB, $list_alt187);
        utilities_macros.note_funcall_helper_function(TPTP_GENERATE_KB_REFLEXIVE_QUERY);
        tptp_query_generation_module($SYMMETRIC_KB, $list_alt193);
        utilities_macros.note_funcall_helper_function(TPTP_GENERATE_KB_SYMMETRIC_QUERY);
        tptp_query_generation_module($TRANSITIVE_SYNTHETIC, $list_alt199);
        utilities_macros.note_funcall_helper_function(TPTP_GENERATE_SYNTHETIC_TRANSITIVE_QUERY);
        tptp_query_generation_module($IN_REGION_SYNTHETIC, $list_alt203);
        utilities_macros.note_funcall_helper_function(TPTP_GENERATE_SYNTHETIC_IN_REGION_QUERY);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("MAX-TIME"), makeInteger(30));

    public static final SubLSymbol $tptp_linchpin_modules$ = makeSymbol("*TPTP-LINCHPIN-MODULES*");

    static private final SubLList $list_alt2 = list($FUNC, makeKeyword("QUERY-GENERATION-MODULE"), makeKeyword("COMMENT"));



    private static final SubLSymbol TPTP_LINCHPIN_MODULE_PROPERTY_P = makeSymbol("TPTP-LINCHPIN-MODULE-PROPERTY-P");

    private static final SubLSymbol TPTP_LINCHPIN_MODULE_NAME_P = makeSymbol("TPTP-LINCHPIN-MODULE-NAME-P");



    private static final SubLSymbol $QUERY_GENERATION_MODULE = makeKeyword("QUERY-GENERATION-MODULE");



    static private final SubLSymbol $sym9$SYNTHETIC_TERM_ = makeSymbol("SYNTHETIC-TERM?");

    static private final SubLString $str_alt10$rejecting_non_synthetic_linchpin_ = makeString("rejecting non-synthetic linchpin ~a");



    static private final SubLString $str_alt12$Could_not_generate_a_linchpin_can = makeString("Could not generate a linchpin candidate for ~s ~s");





    private static final SubLSymbol $ANSWERABILITY = makeKeyword("ANSWERABILITY");

    private static final SubLSymbol $OPENNESS = makeKeyword("OPENNESS");



    static private final SubLList $list_alt18 = list($FUNC, makeSymbol("TPTP-LOOKUP-LINCHPIN-CANDIDATE"), makeKeyword("QUERY-GENERATION-MODULE"), makeKeyword("LOOKUP-POS-SYNTHETIC"), makeKeyword("COMMENT"), makeString("Generate positive gaf linchpins sampled from the synthetic KB content."));

    private static final SubLSymbol $GENLS_GAF = makeKeyword("GENLS-GAF");

    static private final SubLList $list_alt20 = list($FUNC, makeSymbol("TPTP-GENLS-LINCHPIN-CANDIDATE"), makeKeyword("QUERY-GENERATION-MODULE"), makeKeyword("GENLS-SYNTHETIC"), makeKeyword("COMMENT"), makeString("Generate genls gaf linchpins from the synthetic genls hierarchy."));

    static private final SubLList $list_alt21 = list(constant_handles.reader_make_constant_shell(makeString("ist")), makeKeyword("ANYTHING"), list(constant_handles.reader_make_constant_shell(makeString("genls")), makeKeyword("ANYTHING"), list($BIND, makeSymbol("SYNTHETIC-GENL"))));

    private static final SubLSymbol SYNTHETIC_GENL = makeSymbol("SYNTHETIC-GENL");

    private static final SubLSymbol $ANY_INSTANCES = makeKeyword("ANY-INSTANCES");

    static private final SubLList $list_alt24 = list($FUNC, makeSymbol("TPTP-ANY-INSTANCES-LINCHPIN-CANDIDATE"), makeKeyword("QUERY-GENERATION-MODULE"), makeKeyword("ISA-SYNTHETIC-SINGLETON"), makeKeyword("COMMENT"), makeString("Generate singleton synthetic instance linchpins from the synthetic instances."));

    private static final SubLSymbol $DISJOINT_WITH = makeKeyword("DISJOINT-WITH");

    static private final SubLList $list_alt26 = list($FUNC, makeSymbol("TPTP-DISJOINT-WITH-LINCHPIN-CANDIDATE"), makeKeyword("QUERY-GENERATION-MODULE"), makeKeyword("DISJOINT-WITH-SYNTHETIC"), makeKeyword("COMMENT"), makeString("Generate positive disjointWith or genls gaf linchpins from the synthetic KB content, which support a disjointWith query."));

    static private final SubLList $list_alt27 = list(constant_handles.reader_make_constant_shell(makeString("disjointWith")), constant_handles.reader_make_constant_shell(makeString("genls")));

    private static final SubLSymbol TPTP_DISJOINT_WITH_LINCHPIN_CANDIDATE = makeSymbol("TPTP-DISJOINT-WITH-LINCHPIN-CANDIDATE");



    static private final SubLList $list_alt30 = list($FUNC, makeSymbol("TPTP-GENL-PREDS-LINCHPIN-CANDIDATE"), makeKeyword("QUERY-GENERATION-MODULE"), makeKeyword("GENL-PREDS-SYNTHETIC"), makeKeyword("COMMENT"), makeString("Generate positive #$genlPreds or #$genlInverse gaf linchpins from the synthetic KB content"));



    static private final SubLList $list_alt32 = list($FUNC, makeSymbol("TPTP-GENL-PREDS-LINCHPIN-CANDIDATE"), makeKeyword("QUERY-GENERATION-MODULE"), makeKeyword("GENL-INVERSE-SYNTHETIC"), makeKeyword("COMMENT"), makeString("Generate positive #$genlPreds or #$genlInverse gaf linchpins from the synthetic KB content"));

    static private final SubLList $list_alt33 = list(constant_handles.reader_make_constant_shell(makeString("genlPreds")), constant_handles.reader_make_constant_shell(makeString("genlInverse")));

    static private final SubLString $str_alt34$Ignoring_too_high_support___a = makeString("Ignoring too-high support: ~a");

    private static final SubLSymbol TPTP_GENL_PREDS_LINCHPIN_CANDIDATE = makeSymbol("TPTP-GENL-PREDS-LINCHPIN-CANDIDATE");

    private static final SubLSymbol $GENL_PREDS_LOOKUP = makeKeyword("GENL-PREDS-LOOKUP");

    static private final SubLList $list_alt37 = list($FUNC, makeSymbol("TPTP-GENL-PREDS-LOOKUP-LINCHPIN-CANDIDATE"), makeKeyword("QUERY-GENERATION-MODULE"), makeKeyword("PART-TYPES-GENL-PREDS-LOOKUP"), makeKeyword("COMMENT"), makeString("Generate positive #$genlPreds or #$genlInverse gaf linchpins from the synthetic KB content.\nThese linchpins support a lookup query that requires #$genlPreds or #$genlInverse steps."));

    private static final SubLSymbol TPTP_GENL_PREDS_LOOKUP_LINCHPIN_CANDIDATE = makeSymbol("TPTP-GENL-PREDS-LOOKUP-LINCHPIN-CANDIDATE");

    private static final SubLSymbol $GENL_INVERSE_LOOKUP = makeKeyword("GENL-INVERSE-LOOKUP");

    static private final SubLList $list_alt40 = list($FUNC, makeSymbol("TPTP-GENL-INVERSE-LOOKUP-LINCHPIN-CANDIDATE"), makeKeyword("QUERY-GENERATION-MODULE"), makeKeyword("PART-TYPES-GENL-INVERSE-LOOKUP"), makeKeyword("COMMENT"), makeString("Generate positive #$genlPreds or #$genlInverse gaf linchpins from the synthetic KB content.\nThese linchpins support a lookup query that requires #$genlPreds or #$genlInverse steps."));

    private static final SubLSymbol TPTP_GENL_INVERSE_LOOKUP_LINCHPIN_CANDIDATE = makeSymbol("TPTP-GENL-INVERSE-LOOKUP-LINCHPIN-CANDIDATE");

    private static final SubLSymbol $RELATION_ALL_INSTANCE_LOOKUP = makeKeyword("RELATION-ALL-INSTANCE-LOOKUP");

    static private final SubLList $list_alt43 = list($FUNC, makeSymbol("TPTP-RELATION-ALL-INSTANCE-LOOKUP-LINCHPIN-CANDIDATE"), makeKeyword("QUERY-GENERATION-MODULE"), makeKeyword("TPTP-OF-OBJECT-RELATION-ALL-INSTANCE-LOOKUP"), makeKeyword("COMMENT"), makeString("Generate #$relationAllInstance linchpins from #$tptpOfObject lookup queries"));

    public static final SubLObject $$relationAllInstance = constant_handles.reader_make_constant_shell(makeString("relationAllInstance"));

    private static final SubLSymbol TPTP_RELATION_ALL_INSTANCE_LOOKUP_LINCHPIN_CANDIDATE = makeSymbol("TPTP-RELATION-ALL-INSTANCE-LOOKUP-LINCHPIN-CANDIDATE");

    private static final SubLSymbol $RELATION_ALL_EXISTS_LOOKUP = makeKeyword("RELATION-ALL-EXISTS-LOOKUP");

    static private final SubLList $list_alt47 = list($FUNC, makeSymbol("TPTP-RELATION-ALL-EXISTS-LOOKUP-LINCHPIN-CANDIDATE"), makeKeyword("QUERY-GENERATION-MODULE"), makeKeyword("PARTS-VIA-RELATION-ALL-EXISTS"), makeKeyword("COMMENT"), makeString("Generate #$relationAllExists #$tptpTypes linchpins from #$tptp lookup queries"));

    public static final SubLObject $$relationAllExists = constant_handles.reader_make_constant_shell(makeString("relationAllExists"));

    private static final SubLSymbol TPTP_RELATION_ALL_EXISTS_LOOKUP_LINCHPIN_CANDIDATE = makeSymbol("TPTP-RELATION-ALL-EXISTS-LOOKUP-LINCHPIN-CANDIDATE");

    private static final SubLSymbol $TRANSITIVE_GEOGRAPHICAL_SUB_REGIONS = makeKeyword("TRANSITIVE-GEOGRAPHICAL-SUB-REGIONS");

    static private final SubLList $list_alt51 = list($FUNC, makeSymbol("TPTP-GEOGRAPHICAL-SUB-REGIONS-LINCHPIN-CANDIDATE"), makeKeyword("QUERY-GENERATION-MODULE"), makeKeyword("TRANSITIVE-SYNTHETIC"), makeKeyword("COMMENT"), makeString("Generate #$geographicalSubRegions linchpins from transitive #$geographicalSubRegions queries"));

    public static final SubLObject $$geographicalSubRegions = constant_handles.reader_make_constant_shell(makeString("geographicalSubRegions"));

    private static final SubLSymbol TPTP_GEOGRAPHICAL_SUB_REGIONS_LINCHPIN_CANDIDATE = makeSymbol("TPTP-GEOGRAPHICAL-SUB-REGIONS-LINCHPIN-CANDIDATE");

    private static final SubLSymbol $TVA_THROUGH_GEOGRAPHICAL_SUB_REGIONS = makeKeyword("TVA-THROUGH-GEOGRAPHICAL-SUB-REGIONS");

    static private final SubLList $list_alt55 = list($FUNC, makeSymbol("TPTP-TVA-THROUGH-GEOGRAPHICAL-SUB-REGIONS-LINCHPIN-CANDIDATE"), makeKeyword("QUERY-GENERATION-MODULE"), makeKeyword("IN-REGION-SYNTHETIC"), makeKeyword("COMMENT"), makeString("Generate #$geographicalSubRegions linchpins from #$inRegion queries"));

    private static final SubLSymbol TPTP_TVA_THROUGH_GEOGRAPHICAL_SUB_REGIONS_LINCHPIN_CANDIDATE = makeSymbol("TPTP-TVA-THROUGH-GEOGRAPHICAL-SUB-REGIONS-LINCHPIN-CANDIDATE");

    private static final SubLSymbol $GENL_MT_LINK = makeKeyword("GENL-MT-LINK");

    static private final SubLList $list_alt58 = list($FUNC, makeSymbol("TPTP-GENL-MT-LINK-LINCHPIN-CANDIDATE"), makeKeyword("QUERY-GENERATION-MODULE"), makeKeyword("IN-REGION-SYNTHETIC"), makeKeyword("COMMENT"), makeString("Generate synthetic #$genlMt link linchpins from #$inRegion queries.\n    The #$genlMt link will be of the form (#$genlMt SPINDLE-COLLECTOR SPINDLE-MEMBER)."));

    public static final SubLObject $$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));

    private static final SubLSymbol TPTP_GENL_MT_LINK_LINCHPIN_CANDIDATE = makeSymbol("TPTP-GENL-MT-LINK-LINCHPIN-CANDIDATE");



    static private final SubLList $list_alt62 = list($FUNC, makeSymbol("TPTP-MT-LINCHPIN-CANDIDATE"), makeKeyword("QUERY-GENERATION-MODULE"), makeKeyword("IN-REGION-SYNTHETIC"), makeKeyword("COMMENT"), makeString("Generate microtheory fort linchpins from #$inRegion queries.\n    The linchpin mt will be a spindle member."));

    private static final SubLSymbol TPTP_MT_LINCHPIN_CANDIDATE = makeSymbol("TPTP-MT-LINCHPIN-CANDIDATE");

    public static final SubLSymbol $tptp_query_generation_modules$ = makeSymbol("*TPTP-QUERY-GENERATION-MODULES*");

    static private final SubLList $list_alt65 = list($FUNC, makeKeyword("OPEN-OK?"), makeKeyword("COMMENT"));

    private static final SubLSymbol TPTP_QUERY_GENERATION_MODULE_PROPERTY_P = makeSymbol("TPTP-QUERY-GENERATION-MODULE-PROPERTY-P");

    public static final SubLSymbol $kw67$OPEN_OK_ = makeKeyword("OPEN-OK?");



    public static final SubLInteger $int$30 = makeInteger(30);

    static private final SubLString $str_alt70$Could_not_generate_TPTP_problem_w = makeString("Could not generate TPTP problem with module ~s and skeletal problem ~s");

    private static final SubLSymbol TPTP_QUERY_GENERATION_MODULE_NAME_P = makeSymbol("TPTP-QUERY-GENERATION-MODULE-NAME-P");

    static private final SubLList $list_alt72 = list(makeKeyword("CLOSED"), $OPEN);

    public static final SubLInteger $int$212 = makeInteger(212);

    static private final SubLString $$$Openness_violation = makeString("Openness violation");

    static private final SubLString $$$Answerability_violation = makeString("Answerability violation");



    private static final SubLSymbol $PAIR_NUM = makeKeyword("PAIR-NUM");



    private static final SubLSymbol $CYCL_QUERY = makeKeyword("CYCL-QUERY");



    private static final SubLSymbol $LOOKUP_POS_KB = makeKeyword("LOOKUP-POS-KB");

    static private final SubLList $list_alt82 = list($FUNC, makeSymbol("TPTP-GENERATE-POS-KB-LOOKUP-QUERY"), makeKeyword("OPEN-OK?"), T, makeKeyword("COMMENT"), makeString("Generates positive literals randomly sampled from the gafs in the KB."));

    private static final SubLSymbol TPTP_GENERATE_POS_KB_LOOKUP_QUERY = makeSymbol("TPTP-GENERATE-POS-KB-LOOKUP-QUERY");

    private static final SubLSymbol $LOOKUP_POS_SYNTHETIC = makeKeyword("LOOKUP-POS-SYNTHETIC");

    static private final SubLList $list_alt85 = list($FUNC, makeSymbol("TPTP-GENERATE-POS-SYNTHETIC-LOOKUP-QUERY"), makeKeyword("OPEN-OK?"), T, makeKeyword("COMMENT"), makeString("Generates positive literals randomly sampled from the synthetic subset of the KB."));

    private static final SubLSymbol TPTP_GENERATE_POS_SYNTHETIC_LOOKUP_QUERY = makeSymbol("TPTP-GENERATE-POS-SYNTHETIC-LOOKUP-QUERY");



    public static final SubLObject $$UniversalVocabularyMt = constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    private static final SubLSymbol CORE_MICROTHEORY_P = makeSymbol("CORE-MICROTHEORY-P");

    static private final SubLString $str_alt90$Couldn_t_make__s_unanswerable___s = makeString("Couldn't make ~s unanswerable (~s ~s)");

    static private final SubLString $str_alt91$Could_not_find_a_synthetic_arg_to = makeString("Could not find a synthetic arg to keep in ~s");

    private static final SubLSymbol $GENLS_KB = makeKeyword("GENLS-KB");

    static private final SubLList $list_alt93 = list($FUNC, makeSymbol("TPTP-GENERATE-KB-GENLS-QUERY"), makeKeyword("OPEN-OK?"), NIL, makeKeyword("COMMENT"), makeString("Generates positive #$genls queries randomly sampled from the KB collection hierarchy, asked in random mts."));

    private static final SubLSymbol TPTP_GENERATE_KB_GENLS_QUERY = makeSymbol("TPTP-GENERATE-KB-GENLS-QUERY");

    private static final SubLSymbol $GENLS_SYNTHETIC = makeKeyword("GENLS-SYNTHETIC");

    static private final SubLList $list_alt96 = list($FUNC, makeSymbol("TPTP-GENERATE-SYNTHETIC-GENLS-QUERY"), makeKeyword("OPEN-OK?"), NIL, makeKeyword("COMMENT"), makeString("Generates positive #$genls queries randomly sampled from the synthetic collection hierarchy, asked in random mts."));

    private static final SubLSymbol TPTP_GENERATE_SYNTHETIC_GENLS_QUERY = makeSymbol("TPTP-GENERATE-SYNTHETIC-GENLS-QUERY");

    public static final SubLObject $$genls = constant_handles.reader_make_constant_shell(makeString("genls"));

    private static final SubLSymbol $ISA_KB = makeKeyword("ISA-KB");

    static private final SubLList $list_alt100 = list($FUNC, makeSymbol("TPTP-GENERATE-KB-ISA-QUERY"), makeKeyword("OPEN-OK?"), T, makeKeyword("COMMENT"), makeString("Generates positive #$isa queries randomly sampled from the KB, asked in random mts."));

    static private final SubLSymbol $sym101$_COL = makeSymbol("?COL");

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    private static final SubLSymbol TPTP_GENERATE_KB_ISA_QUERY = makeSymbol("TPTP-GENERATE-KB-ISA-QUERY");

    private static final SubLSymbol $NOT_ISA_KB = makeKeyword("NOT-ISA-KB");

    static private final SubLList $list_alt105 = list($FUNC, makeSymbol("TPTP-GENERATE-KB-NOT-ISA-QUERY"), makeKeyword("OPEN-OK?"), NIL, makeKeyword("COMMENT"), makeString("Generates negative #$isa queries randomly sampled from the KB, asked in random mts."));

    public static final SubLObject $$not = constant_handles.reader_make_constant_shell(makeString("not"));

    private static final SubLSymbol TPTP_GENERATE_KB_NOT_ISA_QUERY = makeSymbol("TPTP-GENERATE-KB-NOT-ISA-QUERY");

    private static final SubLSymbol $UNKNOWN_ISA_KB = makeKeyword("UNKNOWN-ISA-KB");

    static private final SubLList $list_alt109 = list($FUNC, makeSymbol("TPTP-GENERATE-KB-UNKNOWN-ISA-QUERY"), makeKeyword("OPEN-OK?"), NIL, makeKeyword("COMMENT"), makeString("Generates unprovable disjunctive queries that show that neither #$isa nor #$not #$isa is provable."));

    public static final SubLSymbol $todo_isa_query$ = makeSymbol("*TODO-ISA-QUERY*");

    private static final SubLSymbol TPTP_GENERATE_KB_UNKNOWN_ISA_QUERY = makeSymbol("TPTP-GENERATE-KB-UNKNOWN-ISA-QUERY");

    private static final SubLSymbol $ISA_SYNTHETIC_SINGLETON = makeKeyword("ISA-SYNTHETIC-SINGLETON");

    static private final SubLList $list_alt113 = list($FUNC, makeSymbol("TPTP-GENERATE-SYNTHETIC-SINGLETON-QUERY"), makeKeyword("OPEN-OK?"), T, makeKeyword("COMMENT"), makeString("Generates positive all-instances #$isa queries to get the instances of a collection that\nhas exactly one instance and it is synthetic.  This is specially designed to feed the :any-instances linchpin module."));



    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));



    static private final SubLSymbol $sym117$_X = makeSymbol("?X");

    private static final SubLSymbol TPTP_GENERATE_SYNTHETIC_SINGLETON_QUERY = makeSymbol("TPTP-GENERATE-SYNTHETIC-SINGLETON-QUERY");

    private static final SubLSymbol $NEGATION_VIA_ARG_TYPE_VIOLATION = makeKeyword("NEGATION-VIA-ARG-TYPE-VIOLATION");

    static private final SubLList $list_alt120 = list($FUNC, makeSymbol("TPTP-GENERATE-KB-ARG-TYPE-VIOLATION-QUERY"), makeKeyword("OPEN-OK?"), NIL, makeKeyword("COMMENT"), makeString("Generates negative queries provable from arg constraint violations."));

    private static final SubLSymbol TPTP_GENERATE_KB_ARG_TYPE_VIOLATION_QUERY = makeSymbol("TPTP-GENERATE-KB-ARG-TYPE-VIOLATION-QUERY");

    public static final SubLObject $$Thing = constant_handles.reader_make_constant_shell(makeString("Thing"));

    static private final SubLString $str_alt123$Everything_is_an_instance_of___Th = makeString("Everything is an instance of #$Thing");

    private static final SubLSymbol $DISJOINT_WITH_KB = makeKeyword("DISJOINT-WITH-KB");

    static private final SubLList $list_alt125 = list($FUNC, makeSymbol("TPTP-GENERATE-KB-DISJOINT-WITH-QUERY"), makeKeyword("OPEN-OK?"), NIL, makeKeyword("COMMENT"), makeString("Generates positive #$disjointWith queries randomly sampled from the KB, asked in random mts."));

    private static final SubLSymbol TPTP_GENERATE_KB_DISJOINT_WITH_QUERY = makeSymbol("TPTP-GENERATE-KB-DISJOINT-WITH-QUERY");

    private static final SubLSymbol $DISJOINT_WITH_SYNTHETIC = makeKeyword("DISJOINT-WITH-SYNTHETIC");

    static private final SubLList $list_alt128 = list($FUNC, makeSymbol("TPTP-GENERATE-SYNTHETIC-DISJOINT-WITH-QUERY"), makeKeyword("OPEN-OK?"), NIL, makeKeyword("COMMENT"), makeString("Generates positive #$disjointWith queries randomly sampled from the KB, asked in random mts."));

    private static final SubLSymbol TPTP_GENERATE_SYNTHETIC_DISJOINT_WITH_QUERY = makeSymbol("TPTP-GENERATE-SYNTHETIC-DISJOINT-WITH-QUERY");

    public static final SubLObject $$disjointWith = constant_handles.reader_make_constant_shell(makeString("disjointWith"));

    private static final SubLSymbol $GENL_PREDS_KB = makeKeyword("GENL-PREDS-KB");

    static private final SubLList $list_alt132 = list($FUNC, makeSymbol("TPTP-GENERATE-KB-GENL-PREDS-QUERY"), makeKeyword("OPEN-OK?"), NIL, makeKeyword("COMMENT"), makeString("Generates positive #$genlPreds queries randomly sampled from the KB, asked in random mts."));

    public static final SubLObject $$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));

    private static final SubLSymbol TPTP_GENERATE_KB_GENL_PREDS_QUERY = makeSymbol("TPTP-GENERATE-KB-GENL-PREDS-QUERY");

    private static final SubLSymbol $GENL_PREDS_SYNTHETIC = makeKeyword("GENL-PREDS-SYNTHETIC");

    static private final SubLList $list_alt136 = list($FUNC, makeSymbol("TPTP-GENERATE-SYNTHETIC-GENL-PREDS-QUERY"), makeKeyword("OPEN-OK?"), NIL, makeKeyword("COMMENT"), makeString("Generates positive #$genlPreds queries randomly sampled from the synthetic KB content, asked in random mts."));

    private static final SubLSymbol TPTP_GENERATE_SYNTHETIC_GENL_PREDS_QUERY = makeSymbol("TPTP-GENERATE-SYNTHETIC-GENL-PREDS-QUERY");

    private static final SubLSymbol $GENL_INVERSE_KB = makeKeyword("GENL-INVERSE-KB");

    static private final SubLList $list_alt139 = list($FUNC, makeSymbol("TPTP-GENERATE-KB-GENL-INVERSE-QUERY"), makeKeyword("OPEN-OK?"), T, makeKeyword("COMMENT"), makeString("Generates positive #$genlInverse queries randomly sampled from the KB, asked in random mts."));

    public static final SubLObject $$genlInverse = constant_handles.reader_make_constant_shell(makeString("genlInverse"));

    private static final SubLSymbol TPTP_GENERATE_KB_GENL_INVERSE_QUERY = makeSymbol("TPTP-GENERATE-KB-GENL-INVERSE-QUERY");

    private static final SubLSymbol $GENL_INVERSE_SYNTHETIC = makeKeyword("GENL-INVERSE-SYNTHETIC");

    static private final SubLList $list_alt143 = list($FUNC, makeSymbol("TPTP-GENERATE-SYNTHETIC-GENL-INVERSE-QUERY"), makeKeyword("OPEN-OK?"), T, makeKeyword("COMMENT"), makeString("Generates positive #$genlInverse queries randomly sampled from the synthetic KB content, asked in random mts."));

    private static final SubLSymbol TPTP_GENERATE_SYNTHETIC_GENL_INVERSE_QUERY = makeSymbol("TPTP-GENERATE-SYNTHETIC-GENL-INVERSE-QUERY");

    static private final SubLSymbol $sym145$_SPEC_PRED = makeSymbol("?SPEC-PRED");

    static private final SubLSymbol $sym146$_GENL_PRED = makeSymbol("?GENL-PRED");



    private static final SubLSymbol $PART_TYPES_GENL_PREDS_LOOKUP = makeKeyword("PART-TYPES-GENL-PREDS-LOOKUP");

    static private final SubLList $list_alt149 = list($FUNC, makeSymbol("TPTP-GENERATE-SYNTHETIC-PART-TYPES-GENL-PRED-QUERY"), makeKeyword("OPEN-OK?"), T, makeKeyword("COMMENT"), makeString("Generates positive lookup queries asking a specPred of the partTypes proxy to be answered using genlPreds/Inverse + lookup"));

    private static final SubLSymbol TPTP_GENERATE_SYNTHETIC_PART_TYPES_GENL_PRED_QUERY = makeSymbol("TPTP-GENERATE-SYNTHETIC-PART-TYPES-GENL-PRED-QUERY");

    private static final SubLSymbol $PART_TYPES_GENL_INVERSE_LOOKUP = makeKeyword("PART-TYPES-GENL-INVERSE-LOOKUP");

    static private final SubLList $list_alt152 = list($FUNC, makeSymbol("TPTP-GENERATE-SYNTHETIC-PART-TYPES-GENL-INVERSE-QUERY"), makeKeyword("OPEN-OK?"), T, makeKeyword("COMMENT"), makeString("Generates positive lookup queries asking a specPred of the partTypes proxy to be answered using genlPreds/Inverse + lookup"));

    private static final SubLSymbol TPTP_GENERATE_SYNTHETIC_PART_TYPES_GENL_INVERSE_QUERY = makeSymbol("TPTP-GENERATE-SYNTHETIC-PART-TYPES-GENL-INVERSE-QUERY");

    static private final SubLString $str_alt154$Got_a_non_synthetic_query_pred__a = makeString("Got a non-synthetic query pred ~a");

    static private final SubLSymbol $sym155$_ARG1 = makeSymbol("?ARG1");

    static private final SubLSymbol $sym156$_ARG2 = makeSymbol("?ARG2");

    private static final SubLSymbol $TPTP_OF_OBJECT_RELATION_ALL_INSTANCE_LOOKUP = makeKeyword("TPTP-OF-OBJECT-RELATION-ALL-INSTANCE-LOOKUP");

    static private final SubLList $list_alt158 = list($FUNC, makeSymbol("TPTP-GENERATE-SYNTHETIC-TPTP-OF-OBJECT-QUERY"), makeKeyword("OPEN-OK?"), T, makeKeyword("COMMENT"), makeString("Generates positive tptpOfObject queries to be solved by relationAllInstance tptpOfObject assertions"));

    private static final SubLSymbol $MAKE_UNANSWERABLE_BY_TWEAKING_THE_ARG1 = makeKeyword("MAKE-UNANSWERABLE-BY-TWEAKING-THE-ARG1");

    private static final SubLSymbol $MAKE_UNANSWERABLE_BY_RAISING_THE_MT = makeKeyword("MAKE-UNANSWERABLE-BY-RAISING-THE-MT");

    static private final SubLSymbol $sym161$_QUANTITY = makeSymbol("?QUANTITY");

    private static final SubLSymbol TPTP_GENERATE_SYNTHETIC_TPTP_OF_OBJECT_QUERY = makeSymbol("TPTP-GENERATE-SYNTHETIC-TPTP-OF-OBJECT-QUERY");

    private static final SubLSymbol $PARTS_VIA_RELATION_ALL_EXISTS = makeKeyword("PARTS-VIA-RELATION-ALL-EXISTS");

    static private final SubLList $list_alt164 = list($FUNC, makeSymbol("TPTP-GENERATE-SYNTHETIC-PARTS-QUERY"), makeKeyword("OPEN-OK?"), T, makeKeyword("COMMENT"), makeString("Generates positive existentially bound #$tptp queries to be solved by relationAllExists #$tptpTypes assertions"));

    static private final SubLList $list_alt165 = list(makeKeyword("MAKE-UNANSWERABLE-BY-TWEAKING-THE-NON-SYNTHETIC-ARG"), makeKeyword("MAKE-UNANSWERABLE-BY-LOWERING-THE-PREDICATE"), makeKeyword("MAKE-UNANSWERABLE-BY-TWEAKING-THE-MT"));

    private static final SubLSymbol $MAKE_UNANSWERABLE_BY_TWEAKING_THE_MT = makeKeyword("MAKE-UNANSWERABLE-BY-TWEAKING-THE-MT");

    private static final SubLSymbol $MAKE_UNANSWERABLE_BY_LOWERING_THE_PREDICATE = makeKeyword("MAKE-UNANSWERABLE-BY-LOWERING-THE-PREDICATE");

    private static final SubLSymbol $MAKE_UNANSWERABLE_BY_TWEAKING_THE_NON_SYNTHETIC_ARG = makeKeyword("MAKE-UNANSWERABLE-BY-TWEAKING-THE-NON-SYNTHETIC-ARG");

    private static final SubLSymbol TPTP_GENERATE_SYNTHETIC_PARTS_QUERY = makeSymbol("TPTP-GENERATE-SYNTHETIC-PARTS-QUERY");











    static private final SubLString $str_alt175$_A_is_not_a__A = makeString("~A is not a ~A");





    static private final SubLString $$$continue_anyway = makeString("continue anyway");



    static private final SubLString $str_alt180$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt181$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str_alt182$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");







    private static final SubLSymbol $REFLEXIVE_KB = makeKeyword("REFLEXIVE-KB");

    static private final SubLList $list_alt187 = list($FUNC, makeSymbol("TPTP-GENERATE-KB-REFLEXIVE-QUERY"), makeKeyword("OPEN-OK?"), T, makeKeyword("COMMENT"), makeString("Generates positive queries to be solved by reflexivity"));

    public static final SubLObject $$ReflexiveBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("ReflexiveBinaryPredicate"));

    public static final SubLObject $$BinaryPredicate = constant_handles.reader_make_constant_shell(makeString("BinaryPredicate"));

    static private final SubLSymbol $sym190$_WHAT = makeSymbol("?WHAT");

    private static final SubLSymbol TPTP_GENERATE_KB_REFLEXIVE_QUERY = makeSymbol("TPTP-GENERATE-KB-REFLEXIVE-QUERY");

    private static final SubLSymbol $SYMMETRIC_KB = makeKeyword("SYMMETRIC-KB");

    static private final SubLList $list_alt193 = list($FUNC, makeSymbol("TPTP-GENERATE-KB-SYMMETRIC-QUERY"), makeKeyword("OPEN-OK?"), T, makeKeyword("COMMENT"), makeString("Generates positive queries to be solved by symmetry"));

    private static final SubLSymbol $MAKE_UNANSWERABLE_BY_USING_A_NON_SYMMETRIC_PREDICATE = makeKeyword("MAKE-UNANSWERABLE-BY-USING-A-NON-SYMMETRIC-PREDICATE");

    private static final SubLSymbol $MAKE_UNANSWERABLE_BY_USING_A_RANDOM_MT = makeKeyword("MAKE-UNANSWERABLE-BY-USING-A-RANDOM-MT");

    public static final SubLObject $$SymmetricBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("SymmetricBinaryPredicate"));

    private static final SubLSymbol TPTP_GENERATE_KB_SYMMETRIC_QUERY = makeSymbol("TPTP-GENERATE-KB-SYMMETRIC-QUERY");

    private static final SubLSymbol $TRANSITIVE_SYNTHETIC = makeKeyword("TRANSITIVE-SYNTHETIC");

    static private final SubLList $list_alt199 = list($FUNC, makeSymbol("TPTP-GENERATE-SYNTHETIC-TRANSITIVE-QUERY"), makeKeyword("OPEN-OK?"), NIL, makeKeyword("COMMENT"), makeString("Generate positive geographicalSubRegions queries to be solved by transitivity"));

    private static final SubLSymbol $MAKE_UNANSWERABLE_BY_USING_A_RANDOM_REGION = makeKeyword("MAKE-UNANSWERABLE-BY-USING-A-RANDOM-REGION");

    private static final SubLSymbol TPTP_GENERATE_SYNTHETIC_TRANSITIVE_QUERY = makeSymbol("TPTP-GENERATE-SYNTHETIC-TRANSITIVE-QUERY");

    private static final SubLSymbol $IN_REGION_SYNTHETIC = makeKeyword("IN-REGION-SYNTHETIC");

    static private final SubLList $list_alt203 = list($FUNC, makeSymbol("TPTP-GENERATE-SYNTHETIC-IN-REGION-QUERY"), makeKeyword("OPEN-OK?"), NIL, makeKeyword("COMMENT"), makeString("Generates positive #$inRegion queries answerable via #$transitiveViaArg through #$geographicalSubRegions"));

    static private final SubLList $list_alt204 = list(makeKeyword("MAKE-UNANSWERABLE-BY-RANDOMIZING-THE-ISA-COL"), makeKeyword("MAKE-UNANSWERABLE-BY-RANDOMIZING-THE-ARG2"), makeKeyword("MAKE-UNANSWERABLE-BY-RAISING-THE-MT"));

    private static final SubLSymbol $MAKE_UNANSWERABLE_BY_RANDOMIZING_THE_ARG2 = makeKeyword("MAKE-UNANSWERABLE-BY-RANDOMIZING-THE-ARG2");

    private static final SubLSymbol $MAKE_UNANSWERABLE_BY_RANDOMIZING_THE_ISA_COL = makeKeyword("MAKE-UNANSWERABLE-BY-RANDOMIZING-THE-ISA-COL");

    public static final SubLObject $$and = constant_handles.reader_make_constant_shell(makeString("and"));

    private static final SubLSymbol TPTP_GENERATE_SYNTHETIC_IN_REGION_QUERY = makeSymbol("TPTP-GENERATE-SYNTHETIC-IN-REGION-QUERY");

    public static final SubLObject $$inRegion = constant_handles.reader_make_constant_shell(makeString("inRegion"));

    static private final SubLString $str_alt210$Couldn_t_find_a_region_for__a = makeString("Couldn't find a region for ~a");



    static private final SubLString $str_alt212$Expected____ist__s__s__to_be_answ = makeString("Expected (#$ist ~s ~s) to be answerable with properties ~s, but it wasn't");





    static private final SubLList $list_alt215 = list(list(constant_handles.reader_make_constant_shell(makeString("not")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?OBJ"), makeSymbol("?COL1")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?OBJ"), makeSymbol("?COL2")), list(constant_handles.reader_make_constant_shell(makeString("disjointWith")), makeSymbol("?COL1"), makeSymbol("?COL2")))), list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("genlInverse")), makeSymbol("?LOW"), makeSymbol("?MEDIUM")), list(constant_handles.reader_make_constant_shell(makeString("genlInverse")), makeSymbol("?MEDIUM"), makeSymbol("?HIGH"))), list(constant_handles.reader_make_constant_shell(makeString("genlPreds")), makeSymbol("?LOW"), makeSymbol("?HIGH"))));

    private static final SubLSymbol FIND_ASSERTION_CYCL = makeSymbol("FIND-ASSERTION-CYCL");





    static private final SubLList $list_alt219 = list(list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("relationAllInstance")), makeSymbol("?PRED"), makeSymbol("?COL"), makeSymbol("?VALUE")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?OBJ"), makeSymbol("?COL"))), list(makeSymbol("?PRED"), makeSymbol("?OBJ"), makeSymbol("?VALUE"))), list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("relationAllExists")), makeSymbol("?PRED"), makeSymbol("?INDEP-COL"), makeSymbol("?DEP-COL")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?TERM"), makeSymbol("?INDEP-COL"))), list(makeSymbol("?PRED"), makeSymbol("?TERM"), list(constant_handles.reader_make_constant_shell(makeString("RelationAllExistsFn")), makeSymbol("?TERM"), makeSymbol("?PRED"), makeSymbol("?INDEP-COL"), makeSymbol("?DEP-COL")))), list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("relationExistsAll")), makeSymbol("?PRED"), makeSymbol("?DEP-COL"), makeSymbol("?INDEP-COL")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?TERM"), makeSymbol("?INDEP-COL"))), list(makeSymbol("?PRED"), list(constant_handles.reader_make_constant_shell(makeString("RelationExistsAllFn")), makeSymbol("?TERM"), makeSymbol("?PRED"), makeSymbol("?DEP-COL"), makeSymbol("?INDEP-COL")), makeSymbol("?TERM"))));



    static private final SubLString $str_alt221$Could_not_find_assertion_correspo = makeString("Could not find assertion corresponding to HL support ~a, skipping query");



    public static final SubLObject $$admittedSentence = constant_handles.reader_make_constant_shell(makeString("admittedSentence"));

    public static final SubLObject $$admittedArgument = constant_handles.reader_make_constant_shell(makeString("admittedArgument"));

    static private final SubLString $str_alt225$Unhandled__ADMIT_support__a__skip = makeString("Unhandled :ADMIT support ~a, skipping query");

    static private final SubLString $str_alt226$Unhandled_HL_support__a__skipping = makeString("Unhandled HL support ~a, skipping query");

    static private final SubLString $str_alt227$Couldn_t_handle___not___admittedS = makeString("Couldn't handle #$not #$admittedSentence subsentence ~a");

    // // Initializers
    public void declareFunctions() {
        declare_tptp_modules_file();
    }

    public void initializeVariables() {
        init_tptp_modules_file();
    }

    public void runTopLevelForms() {
        setup_tptp_modules_file();
    }
}

