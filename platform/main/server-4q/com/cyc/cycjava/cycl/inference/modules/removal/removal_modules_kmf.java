/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.os_process_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      REMOVAL-MODULES-KMF
 *  source file: /cyc/top/cycl/inference/modules/removal/removal-modules-kmf.lisp
 *  created:     2019/07/03 17:39:05
 */
public final class removal_modules_kmf extends SubLTranslatedFile implements V02 {
    // // Constructor
    private removal_modules_kmf() {
    }

    public static final SubLFile me = new removal_modules_kmf();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_kmf";

    // // Definitions
    public static final SubLObject removal_kmf_predicate_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return ONE_INTEGER;
    }

    public static final SubLObject removal_kmf_predicate_output_generate(SubLObject predicate, SubLObject arg1, SubLObject arg2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arg1_type = kmf_predicate_arg_n_type(predicate, ONE_INTEGER);
                SubLObject arg2_type = kmf_predicate_arg_n_type(predicate, TWO_INTEGER);
                SubLObject ontology = $current_kmf_ontology$.getDynamicValue(thread);
                SubLObject arg1_field = kmf_ontology_type_id_field(arg1_type, ontology);
                SubLObject arg2_field = kmf_ontology_type_id_field(arg2_type, ontology);
                SubLObject query = kmf_query_for_predicate(predicate, arg1, arg2, ontology, arg1_type, arg1_field, arg2_field);
                SubLObject results = (NIL != query) ? ((SubLObject) (kmf_ask_query(query))) : NIL;
                return NIL != results ? ((SubLObject) (new_kmf_query_result_iterator(results, ontology, arg1_type, arg2_type, arg1_field, arg2_field))) : NIL;
            }
        }
    }

    // defparameter
    public static final SubLSymbol $current_kmf_ontology$ = makeSymbol("*CURRENT-KMF-ONTOLOGY*");

    // defparameter
    public static final SubLSymbol $current_kmf_knowledge_source$ = makeSymbol("*CURRENT-KMF-KNOWLEDGE-SOURCE*");

    public static final SubLObject kmf_ontology_mt(SubLObject ontology) {
        return narts_high.find_nart(list($$ContextOfPCWFn, ontology));
    }

    // deflexical
    private static final SubLSymbol $kmf_ontology_termP_caching_state$ = makeSymbol("*KMF-ONTOLOGY-TERM?-CACHING-STATE*");

    public static final SubLObject clear_kmf_ontology_termP() {
        {
            SubLObject cs = $kmf_ontology_termP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_kmf_ontology_termP(SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args($kmf_ontology_termP_caching_state$.getGlobalValue(), list(v_term), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject kmf_ontology_termP_internal(SubLObject v_term) {
        return isa.quoted_isaP(v_term, $$KMFOntologyTerm, $$BookkeepingMt, UNPROVIDED);
    }

    public static final SubLObject kmf_ontology_termP(SubLObject v_term) {
        {
            SubLObject caching_state = $kmf_ontology_termP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym7$KMF_ONTOLOGY_TERM_, $sym10$_KMF_ONTOLOGY_TERM__CACHING_STATE_, $int$4096, EQUAL, ONE_INTEGER, ZERO_INTEGER);
                memoization_state.register_quoted_isa_dependent_cache_clear_callback($sym12$CLEAR_KMF_ONTOLOGY_TERM_);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, $kw13$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw13$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(kmf_ontology_termP_internal(v_term)));
                    memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static final SubLObject kmf_ontology_collectionP(SubLObject v_term) {
        return makeBoolean(((NIL != forts.fort_p(v_term)) && (NIL != fort_types_interface.collectionP(v_term))) && (NIL != kmf_ontology_termP(v_term)));
    }

    public static final SubLObject kmf_ontology_predicateP(SubLObject v_term) {
        return makeBoolean(((NIL != forts.fort_p(v_term)) && (NIL != fort_types_interface.predicateP(v_term))) && (NIL != kmf_ontology_termP(v_term)));
    }

    public static final SubLObject kmf_predicate_arg_n_type(SubLObject predicate, SubLObject n) {
        return kb_accessors.argn_isa(predicate, n, UNPROVIDED).first();
    }

    public static final SubLObject kmf_ontology_external_concept(SubLObject v_term, SubLObject ontology) {
        {
            SubLObject gaf = kb_mapping_utilities.fpred_u_v_holds_gaf_in_relevant_mts($$synonymousExternalConcept, v_term, ontology, kmf_ontology_mt(ontology), ONE_INTEGER, TWO_INTEGER, $TRUE);
            return NIL != gaf ? ((SubLObject) (assertions_high.gaf_arg3(gaf))) : NIL;
        }
    }

    public static final SubLObject kmf_ontology_type_id_field(SubLObject kmf_collection, SubLObject ontology) {
        {
            SubLObject gaf = kb_mapping_utilities.fpred_u_v_holds_gaf_in_relevant_mts($$kMFOntologyTypeIDFieldName, kmf_collection, ontology, kmf_ontology_mt(ontology), ONE_INTEGER, TWO_INTEGER, $TRUE);
            return NIL != gaf ? ((SubLObject) (assertions_high.gaf_arg3(gaf))) : $$$id;
        }
    }

    public static final SubLObject kmf_query_for_predicate(SubLObject predicate, SubLObject arg1, SubLObject arg2, SubLObject ontology, SubLObject arg1_type, SubLObject arg1_field, SubLObject arg2_field) {
        {
            SubLObject query = NIL;
            if (NIL != arg1_type) {
                {
                    SubLObject kmf_pred = kmf_ontology_external_concept(predicate, ontology);
                    SubLObject kmf_type = kmf_ontology_external_concept(arg1_type, ontology);
                    if ((NIL != kmf_pred) && (NIL != kmf_type)) {
                        {
                            SubLObject namespace = cconcatenate($str_alt18$ld_DataModels_45SW_Logical_, format_nil.format_nil_a_no_copy(kmf_type));
                            SubLObject for_statement = cconcatenate($str_alt19$for__i_in_view_, new SubLObject[]{ format_nil.format_nil_a_no_copy(kmf_type), $str_alt20$_____j_in_view_, format_nil.format_nil_a_no_copy(kmf_pred), $str_alt21$__i_ });
                            SubLObject arg1_string = ((NIL != variables.fully_bound_p(arg1)) && (NIL != el_utilities.el_formula_with_operator_p(arg1, $$KMFOntologyObjectFn))) ? ((SubLObject) (cycl_utilities.el_formula_arg(arg1, TWO_INTEGER, UNPROVIDED))) : NIL;
                            SubLObject arg2_string = ((NIL != variables.fully_bound_p(arg2)) && (NIL != el_utilities.el_formula_with_operator_p(arg2, $$KMFOntologyObjectFn))) ? ((SubLObject) (cycl_utilities.el_formula_arg(arg2, TWO_INTEGER, UNPROVIDED))) : NIL;
                            SubLObject arg1_where = (NIL != arg1_string) ? ((SubLObject) (cconcatenate($str_alt23$_i_, new SubLObject[]{ format_nil.format_nil_a_no_copy(arg1_field), $str_alt24$___xs_string_, format_nil.format_nil_s_no_copy(arg1_string), $str_alt25$_ }))) : NIL;
                            SubLObject arg2_where = (NIL != arg2_string) ? ((SubLObject) (cconcatenate($str_alt26$_j_, new SubLObject[]{ format_nil.format_nil_a_no_copy(arg2_field), $str_alt24$___xs_string_, format_nil.format_nil_s_no_copy(arg2_string), $str_alt25$_ }))) : NIL;
                            SubLObject where_statement = (NIL != arg1_where) ? ((SubLObject) (NIL != arg2_where ? ((SubLObject) (cconcatenate($str_alt27$where_, new SubLObject[]{ format_nil.format_nil_a_no_copy(arg1_where), $str_alt28$_and_, format_nil.format_nil_a_no_copy(arg2_where) }))) : cconcatenate($str_alt27$where_, format_nil.format_nil_a_no_copy(arg1_where)))) : NIL != arg2_where ? ((SubLObject) (cconcatenate($str_alt27$where_, format_nil.format_nil_a_no_copy(arg2_where)))) : NIL;
                            SubLObject return_statement = cconcatenate($str_alt29$return__Relation___arg1___i_, new SubLObject[]{ format_nil.format_nil_a_no_copy(arg1_field), $str_alt30$___arg1___arg2___j_, format_nil.format_nil_a_no_copy(arg2_field), $str_alt31$___arg2____Relation_ });
                            query = (NIL != where_statement) ? ((SubLObject) (cconcatenate($str_alt32$declare_namespace_view_, new SubLObject[]{ format_nil.format_nil_s_no_copy(namespace), $str_alt33$_, format_nil.$format_nil_percent$.getGlobalValue(), $str_alt34$_result_, format_nil.$format_nil_percent$.getGlobalValue(), $str_alt35$_, format_nil.$format_nil_percent$.getGlobalValue(), $str_alt36$___, format_nil.format_nil_a_no_copy(for_statement), format_nil.$format_nil_percent$.getGlobalValue(), $str_alt36$___, format_nil.format_nil_a_no_copy(where_statement), format_nil.$format_nil_percent$.getGlobalValue(), $str_alt36$___, format_nil.format_nil_a_no_copy(return_statement), format_nil.$format_nil_percent$.getGlobalValue(), $str_alt37$_, format_nil.$format_nil_percent$.getGlobalValue(), $str_alt38$__result_ }))) : cconcatenate($str_alt32$declare_namespace_view_, new SubLObject[]{ format_nil.format_nil_s_no_copy(namespace), $str_alt33$_, format_nil.$format_nil_percent$.getGlobalValue(), $str_alt34$_result_, format_nil.$format_nil_percent$.getGlobalValue(), $str_alt35$_, format_nil.$format_nil_percent$.getGlobalValue(), $str_alt36$___, format_nil.format_nil_a_no_copy(for_statement), format_nil.$format_nil_percent$.getGlobalValue(), $str_alt36$___, format_nil.format_nil_a_no_copy(return_statement), format_nil.$format_nil_percent$.getGlobalValue(), $str_alt37$_, format_nil.$format_nil_percent$.getGlobalValue(), $str_alt38$__result_ });
                        }
                    }
                }
            }
            return query;
        }
    }

    /**
     * This is a quick-and-dirty implementation that requires make-os-process and the programs wget and lynx (required by convert-html-to-text).  A more sophisticated implemetation would use the jar available at the XQuery server to implemeent a java gateway that could perhaps handle connections better and support result-set iterators.
     */
    public static final SubLObject kmf_ask_query(SubLObject query) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject host = kb_mapping_utilities.fpred_value_in_any_mt($current_kmf_knowledge_source$.getDynamicValue(thread), $$serverOfSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject port = kb_mapping_utilities.fpred_value_in_any_mt($current_kmf_knowledge_source$.getDynamicValue(thread), $$portNumberForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject user = kb_mapping_utilities.fpred_value_in_any_mt($current_kmf_knowledge_source$.getDynamicValue(thread), $$userNameForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject password = kb_mapping_utilities.fpred_value_in_any_mt($current_kmf_knowledge_source$.getDynamicValue(thread), $$passwordForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (!((((NIL != host) && (NIL != port)) && (NIL != user)) && (NIL != password))) {
                    Errors.warn($str_alt43$Count_not_connect_to__A__missing_);
                    return NIL;
                }
                {
                    SubLObject encoded_query = web_utilities.html_url_encode(query, UNPROVIDED);
                    SubLObject url = cconcatenate($str_alt44$http___, new SubLObject[]{ format_nil.format_nil_a_no_copy(host), $str_alt45$_, format_nil.format_nil_a_no_copy(port), $str_alt46$_WaveWS_WaveWebService_jws_query_, format_nil.format_nil_a_no_copy(encoded_query) });
                    SubLObject tmp_filename = Strings.string_downcase(file_utilities.make_temp_filename(UNPROVIDED), UNPROVIDED, UNPROVIDED);
                    SubLObject xml_result = NIL;
                    SubLObject os_process = os_process_utilities.make_os_process($str_alt47$wget_KMF_query_from_modusoperandi, $$$wget, list(cconcatenate($str_alt49$__http_user_, format_nil.format_nil_a_no_copy(user)), cconcatenate($str_alt50$__http_password_, format_nil.format_nil_a_no_copy(password)), $str_alt51$_q, url, $str_alt52$_O, tmp_filename), StreamsLow.$standard_input$.getDynamicValue(thread), StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED);
                    os_process_utilities.wait_until_os_process_finished(os_process);
                    xml_result = string_utilities.bunge(file_utilities.get_file_lines(tmp_filename), UNPROVIDED);
                    Filesys.delete_file(tmp_filename);
                    xml_result = html_utilities.convert_html_to_text(xml_result);
                    xml_result = string_utilities.string_substitute($str_alt53$_, $str_alt54$_lt_, xml_result, UNPROVIDED);
                    xml_result = string_utilities.string_substitute($str_alt55$_, $str_alt56$_gt_, xml_result, UNPROVIDED);
                    return web_utilities.xml_string_tokenize(xml_result, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
    }

    public static final SubLObject new_kmf_query_result_iterator(SubLObject xml_tokens, SubLObject ontology, SubLObject arg1_type, SubLObject arg2_type, SubLObject arg1_field, SubLObject arg2_field) {
        return iteration.new_iterator(kmf_query_result_iterator_state(xml_tokens, ontology, arg1_type, arg2_type, arg1_field, arg2_field), KMF_QUERY_RESULT_ITERATOR_DONE, KMF_QUERY_RESULT_ITERATOR_NEXT, UNPROVIDED);
    }

    public static final SubLObject kmf_query_result_iterator_state(SubLObject tokens, SubLObject ontology, SubLObject type1, SubLObject type2, SubLObject field1, SubLObject field2) {
        {
            SubLObject token1 = cconcatenate($str_alt53$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(field1), $str_alt55$_ });
            SubLObject token2 = cconcatenate($str_alt53$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(field2), $str_alt55$_ });
            return list(tokens, ontology, type1, type2, token1, token2);
        }
    }

    public static final SubLObject kmf_query_result_iterator_done(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject tokens = NIL;
            SubLObject ontology = NIL;
            SubLObject type1 = NIL;
            SubLObject type2 = NIL;
            SubLObject token1 = NIL;
            SubLObject token2 = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt59);
            tokens = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt59);
            ontology = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt59);
            type1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt59);
            type2 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt59);
            token1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt59);
            token2 = current.first();
            current = current.rest();
            if (NIL == current) {
                return sublisp_null(tokens);
            } else {
                cdestructuring_bind_error(datum, $list_alt59);
            }
        }
        return NIL;
    }

    public static final SubLObject kmf_query_result_iterator_next(SubLObject state) {
        {
            SubLObject result = NIL;
            SubLObject invalidP = NIL;
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject tokens = NIL;
            SubLObject ontology = NIL;
            SubLObject type1 = NIL;
            SubLObject type2 = NIL;
            SubLObject token1 = NIL;
            SubLObject token2 = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt59);
            tokens = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt59);
            ontology = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt59);
            type1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt59);
            type2 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt59);
            token1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt59);
            token2 = current.first();
            current = current.rest();
            if (NIL == current) {
                tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt60$_Relation_, symbol_function(EQUAL));
                if (NIL != tokens) {
                    {
                        SubLObject arg1_value = NIL;
                        SubLObject arg2_value = NIL;
                        tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt61$_arg1_, symbol_function(EQUAL));
                        tokens = web_utilities.advance_xml_tokens(tokens, UNPROVIDED);
                        tokens = web_utilities.advance_xml_tokens_to(tokens, token1, symbol_function(EQUAL));
                        arg1_value = el_utilities.make_ternary_formula($$KMFOntologyObjectFn, ontology, second(tokens), type1);
                        tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt62$_arg2_, symbol_function(EQUAL));
                        tokens = web_utilities.advance_xml_tokens(tokens, UNPROVIDED);
                        tokens = web_utilities.advance_xml_tokens_to(tokens, token2, symbol_function(EQUAL));
                        arg2_value = el_utilities.make_ternary_formula($$KMFOntologyObjectFn, ontology, second(tokens), type2);
                        tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt63$__Relation_, UNPROVIDED);
                        tokens = web_utilities.advance_xml_tokens(tokens, UNPROVIDED);
                        result = list(arg1_value, arg2_value);
                    }
                } else {
                    invalidP = T;
                }
                set_nth(ZERO_INTEGER, state, tokens);
            } else {
                cdestructuring_bind_error(datum, $list_alt59);
            }
            return values(result, state, invalidP);
        }
    }

    public static final SubLObject declare_removal_modules_kmf_file() {
        declareFunction("removal_kmf_predicate_cost", "REMOVAL-KMF-PREDICATE-COST", 1, 1, false);
        declareFunction("removal_kmf_predicate_output_generate", "REMOVAL-KMF-PREDICATE-OUTPUT-GENERATE", 3, 0, false);
        declareFunction("kmf_ontology_mt", "KMF-ONTOLOGY-MT", 1, 0, false);
        declareFunction("clear_kmf_ontology_termP", "CLEAR-KMF-ONTOLOGY-TERM?", 0, 0, false);
        declareFunction("remove_kmf_ontology_termP", "REMOVE-KMF-ONTOLOGY-TERM?", 1, 0, false);
        declareFunction("kmf_ontology_termP_internal", "KMF-ONTOLOGY-TERM?-INTERNAL", 1, 0, false);
        declareFunction("kmf_ontology_termP", "KMF-ONTOLOGY-TERM?", 1, 0, false);
        declareFunction("kmf_ontology_collectionP", "KMF-ONTOLOGY-COLLECTION?", 1, 0, false);
        declareFunction("kmf_ontology_predicateP", "KMF-ONTOLOGY-PREDICATE?", 1, 0, false);
        declareFunction("kmf_predicate_arg_n_type", "KMF-PREDICATE-ARG-N-TYPE", 2, 0, false);
        declareFunction("kmf_ontology_external_concept", "KMF-ONTOLOGY-EXTERNAL-CONCEPT", 2, 0, false);
        declareFunction("kmf_ontology_type_id_field", "KMF-ONTOLOGY-TYPE-ID-FIELD", 2, 0, false);
        declareFunction("kmf_query_for_predicate", "KMF-QUERY-FOR-PREDICATE", 7, 0, false);
        declareFunction("kmf_ask_query", "KMF-ASK-QUERY", 1, 0, false);
        declareFunction("new_kmf_query_result_iterator", "NEW-KMF-QUERY-RESULT-ITERATOR", 6, 0, false);
        declareFunction("kmf_query_result_iterator_state", "KMF-QUERY-RESULT-ITERATOR-STATE", 6, 0, false);
        declareFunction("kmf_query_result_iterator_done", "KMF-QUERY-RESULT-ITERATOR-DONE", 1, 0, false);
        declareFunction("kmf_query_result_iterator_next", "KMF-QUERY-RESULT-ITERATOR-NEXT", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_removal_modules_kmf_file() {
        defparameter("*CURRENT-KMF-ONTOLOGY*", $$KMFDeployedOntology);
        defparameter("*CURRENT-KMF-KNOWLEDGE-SOURCE*", $$WAVESandbox_KS);
        deflexical("*KMF-ONTOLOGY-TERM?-CACHING-STATE*", NIL);
        return NIL;
    }

    public static final SubLObject setup_removal_modules_kmf_file() {
                inference_modules.inference_removal_module($REMOVAL_KMF_PREDICATE, $list_alt1);
        utilities_macros.note_funcall_helper_function(REMOVAL_KMF_PREDICATE_COST);
        utilities_macros.note_funcall_helper_function(REMOVAL_KMF_PREDICATE_OUTPUT_GENERATE);
        memoization_state.note_globally_cached_function($sym7$KMF_ONTOLOGY_TERM_);
        utilities_macros.note_funcall_helper_function(KMF_QUERY_RESULT_ITERATOR_DONE);
        utilities_macros.note_funcall_helper_function(KMF_QUERY_RESULT_ITERATOR_NEXT);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol $REMOVAL_KMF_PREDICATE = makeKeyword("REMOVAL-KMF-PREDICATE");

    static private final SubLList $list_alt1 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(list($TEST, makeSymbol("KMF-ONTOLOGY-PREDICATE?")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), $COST, makeSymbol("REMOVAL-KMF-PREDICATE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(list($BIND, makeSymbol("PREDICATE")), list($BIND, makeSymbol("ARG1")), list($BIND, makeSymbol("ARG2"))), list(list(makeKeyword("VALUE"), makeSymbol("PREDICATE")), list(makeKeyword("VALUE"), makeSymbol("ARG1")), list(makeKeyword("VALUE"), makeSymbol("ARG2")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("PREDICATE"), makeSymbol("ARG1"), makeSymbol("ARG2")), list($CALL, makeSymbol("REMOVAL-KMF-PREDICATE-OUTPUT-GENERATE"), list(makeKeyword("VALUE"), makeSymbol("PREDICATE")), list(makeKeyword("VALUE"), makeSymbol("ARG1")), list(makeKeyword("VALUE"), makeSymbol("ARG2")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("RESULT-ARG1"), makeSymbol("RESULT-ARG2")), list(list(makeKeyword("VALUE"), makeSymbol("PREDICATE")), list(makeKeyword("VALUE"), makeSymbol("RESULT-ARG1")), list(makeKeyword("VALUE"), makeSymbol("RESULT-ARG2")))), makeKeyword("DOCUMENTATION"), makeString("(<KMF predicate> <anything> <anything>)"), makeKeyword("EXAMPLE"), makeString("(kMFActivity-isPartOf-Mission ?X ?Y)") });

    private static final SubLSymbol REMOVAL_KMF_PREDICATE_COST = makeSymbol("REMOVAL-KMF-PREDICATE-COST");

    private static final SubLSymbol REMOVAL_KMF_PREDICATE_OUTPUT_GENERATE = makeSymbol("REMOVAL-KMF-PREDICATE-OUTPUT-GENERATE");

    public static final SubLObject $$KMFDeployedOntology = constant_handles.reader_make_constant_shell(makeString("KMFDeployedOntology"));

    public static final SubLObject $$WAVESandbox_KS = constant_handles.reader_make_constant_shell(makeString("WAVESandbox-KS"));

    public static final SubLObject $$ContextOfPCWFn = constant_handles.reader_make_constant_shell(makeString("ContextOfPCWFn"));

    static private final SubLSymbol $sym7$KMF_ONTOLOGY_TERM_ = makeSymbol("KMF-ONTOLOGY-TERM?");

    public static final SubLObject $$KMFOntologyTerm = constant_handles.reader_make_constant_shell(makeString("KMFOntologyTerm"));

    public static final SubLObject $$BookkeepingMt = constant_handles.reader_make_constant_shell(makeString("BookkeepingMt"));

    static private final SubLSymbol $sym10$_KMF_ONTOLOGY_TERM__CACHING_STATE_ = makeSymbol("*KMF-ONTOLOGY-TERM?-CACHING-STATE*");



    static private final SubLSymbol $sym12$CLEAR_KMF_ONTOLOGY_TERM_ = makeSymbol("CLEAR-KMF-ONTOLOGY-TERM?");

    public static final SubLSymbol $kw13$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    public static final SubLObject $$synonymousExternalConcept = constant_handles.reader_make_constant_shell(makeString("synonymousExternalConcept"));



    public static final SubLObject $$kMFOntologyTypeIDFieldName = constant_handles.reader_make_constant_shell(makeString("kMFOntologyTypeIDFieldName"));

    static private final SubLString $$$id = makeString("id");

    static private final SubLString $str_alt18$ld_DataModels_45SW_Logical_ = makeString("ld:DataModels_45SW_Logical/");

    static private final SubLString $str_alt19$for__i_in_view_ = makeString("for $i in view:");

    static private final SubLString $str_alt20$_____j_in_view_ = makeString("(), $j in view:");

    static private final SubLString $str_alt21$__i_ = makeString("($i)");

    public static final SubLObject $$KMFOntologyObjectFn = constant_handles.reader_make_constant_shell(makeString("KMFOntologyObjectFn"));

    static private final SubLString $str_alt23$_i_ = makeString("$i/");

    static private final SubLString $str_alt24$___xs_string_ = makeString(" = xs:string(");

    static private final SubLString $str_alt25$_ = makeString(")");

    static private final SubLString $str_alt26$_j_ = makeString("$j/");

    static private final SubLString $str_alt27$where_ = makeString("where ");

    static private final SubLString $str_alt28$_and_ = makeString(" and ");

    static private final SubLString $str_alt29$return__Relation___arg1___i_ = makeString("return <Relation> <arg1>{$i/");

    static private final SubLString $str_alt30$___arg1___arg2___j_ = makeString("}</arg1> <arg2>{$j/");

    static private final SubLString $str_alt31$___arg2____Relation_ = makeString("}</arg2> </Relation>");

    static private final SubLString $str_alt32$declare_namespace_view_ = makeString("declare namespace view=");

    static private final SubLString $str_alt33$_ = makeString(";");

    static private final SubLString $str_alt34$_result_ = makeString("<result>");

    static private final SubLString $str_alt35$_ = makeString("{");

    static private final SubLString $str_alt36$___ = makeString("   ");

    static private final SubLString $str_alt37$_ = makeString("}");

    static private final SubLString $str_alt38$__result_ = makeString("</result>");

    public static final SubLObject $$serverOfSKS = constant_handles.reader_make_constant_shell(makeString("serverOfSKS"));

    public static final SubLObject $$portNumberForSKS = constant_handles.reader_make_constant_shell(makeString("portNumberForSKS"));

    public static final SubLObject $$userNameForSKS = constant_handles.reader_make_constant_shell(makeString("userNameForSKS"));

    public static final SubLObject $$passwordForSKS = constant_handles.reader_make_constant_shell(makeString("passwordForSKS"));

    static private final SubLString $str_alt43$Count_not_connect_to__A__missing_ = makeString("Count not connect to ~A: missing knowledge source data (host, port, user, or password.)");

    static private final SubLString $str_alt44$http___ = makeString("http://");

    static private final SubLString $str_alt45$_ = makeString(":");

    static private final SubLString $str_alt46$_WaveWS_WaveWebService_jws_query_ = makeString("/WaveWS/WaveWebService.jws/query?query=");

    static private final SubLString $str_alt47$wget_KMF_query_from_modusoperandi = makeString("wget KMF query from modusoperandi sandbox");

    static private final SubLString $$$wget = makeString("wget");

    static private final SubLString $str_alt49$__http_user_ = makeString("--http-user=");

    static private final SubLString $str_alt50$__http_password_ = makeString("--http-password=");

    static private final SubLString $str_alt51$_q = makeString("-q");

    static private final SubLString $str_alt52$_O = makeString("-O");

    static private final SubLString $str_alt53$_ = makeString("<");

    static private final SubLString $str_alt54$_lt_ = makeString("&lt;");

    static private final SubLString $str_alt55$_ = makeString(">");

    static private final SubLString $str_alt56$_gt_ = makeString("&gt;");

    private static final SubLSymbol KMF_QUERY_RESULT_ITERATOR_DONE = makeSymbol("KMF-QUERY-RESULT-ITERATOR-DONE");

    private static final SubLSymbol KMF_QUERY_RESULT_ITERATOR_NEXT = makeSymbol("KMF-QUERY-RESULT-ITERATOR-NEXT");

    static private final SubLList $list_alt59 = list(makeSymbol("TOKENS"), makeSymbol("ONTOLOGY"), makeSymbol("TYPE1"), makeSymbol("TYPE2"), makeSymbol("TOKEN1"), makeSymbol("TOKEN2"));

    static private final SubLString $str_alt60$_Relation_ = makeString("<Relation>");

    static private final SubLString $str_alt61$_arg1_ = makeString("<arg1>");

    static private final SubLString $str_alt62$_arg2_ = makeString("<arg2>");

    static private final SubLString $str_alt63$__Relation_ = makeString("</Relation>");

    // // Initializers
    public void declareFunctions() {
        declare_removal_modules_kmf_file();
    }

    public void initializeVariables() {
        init_removal_modules_kmf_file();
    }

    public void runTopLevelForms() {
        setup_removal_modules_kmf_file();
    }
}

