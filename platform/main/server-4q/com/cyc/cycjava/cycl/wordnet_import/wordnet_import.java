/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.wordnet_import;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.assertions_high.asserted_when;
import static com.cyc.cycjava.cycl.assertions_high.gaf_arg1;
import static com.cyc.cycjava.cycl.bindings.variable_lookup;
import static com.cyc.cycjava.cycl.bookkeeping_store.creator;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.constants_high.find_constant;
import static com.cyc.cycjava.cycl.control_vars.cyc_image_id;
import static com.cyc.cycjava.cycl.cycl_utilities.nat_arg1;
import static com.cyc.cycjava.cycl.cycl_utilities.nat_functor;
import static com.cyc.cycjava.cycl.czer_main.canonicalize_term;
import static com.cyc.cycjava.cycl.date_utilities.indexical_now;
import static com.cyc.cycjava.cycl.disjoint_with.any_disjoint_with_anyP;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.fort_types_interface.collectionP;
import static com.cyc.cycjava.cycl.fort_types_interface.predicateP;
import static com.cyc.cycjava.cycl.forts.fort_p;
import static com.cyc.cycjava.cycl.genl_predicates.genl_predicateP;
import static com.cyc.cycjava.cycl.genls.any_specP;
import static com.cyc.cycjava.cycl.genls.genlP;
import static com.cyc.cycjava.cycl.genls.genl_in_any_mtP;
import static com.cyc.cycjava.cycl.genls.genls;
import static com.cyc.cycjava.cycl.genls.genlsP;
import static com.cyc.cycjava.cycl.genls.max_floor_cols;
import static com.cyc.cycjava.cycl.genls.min_cols;
import static com.cyc.cycjava.cycl.inference.ask_utilities.query_template;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store.destroy_problem_store;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store.new_problem_store;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store.problem_store_max_problem_count;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store.problem_store_p;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store.problem_store_problem_count;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store.valid_problem_store_p;
import static com.cyc.cycjava.cycl.inference.harness.inference_kernel.new_cyc_query;
import static com.cyc.cycjava.cycl.isa.instances;
import static com.cyc.cycjava.cycl.isa.isa;
import static com.cyc.cycjava.cycl.isa.isaP;
import static com.cyc.cycjava.cycl.isa.isa_in_any_mtP;
import static com.cyc.cycjava.cycl.isa.quoted_instances;
import static com.cyc.cycjava.cycl.kb_control_vars.$forward_inference_enabledP$;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.kb_mapping_utilities.pred_u_v_holds_in_mt;
import static com.cyc.cycjava.cycl.kb_mapping_utilities.pred_value_gafs;
import static com.cyc.cycjava.cycl.kb_mapping_utilities.pred_value_gafs_in_mt;
import static com.cyc.cycjava.cycl.ke.ke_assert;
import static com.cyc.cycjava.cycl.ke.ke_assert_now;
import static com.cyc.cycjava.cycl.ke.ke_assert_wff_now;
import static com.cyc.cycjava.cycl.ke.ke_create_now;
import static com.cyc.cycjava.cycl.ke.ke_unassert;
import static com.cyc.cycjava.cycl.ke.ke_unassert_now;
import static com.cyc.cycjava.cycl.lexicon_accessors.best_wu_for_string;
import static com.cyc.cycjava.cycl.lexicon_accessors.denots_of_string;
import static com.cyc.cycjava.cycl.lexicon_accessors.denots_of_stringXpos;
import static com.cyc.cycjava.cycl.lexicon_accessors.pos_of_string;
import static com.cyc.cycjava.cycl.lexicon_utilities.unique_ws;
import static com.cyc.cycjava.cycl.lexification_utilities.initial_capitalizedP;
import static com.cyc.cycjava.cycl.lexification_utilities.keyword_for_pos;
import static com.cyc.cycjava.cycl.lexification_wizard.add_lexical_mapping;
import static com.cyc.cycjava.cycl.list_utilities.add_to_end;
import static com.cyc.cycjava.cycl.list_utilities.alist_lookup;
import static com.cyc.cycjava.cycl.list_utilities.alist_lookup_without_values;
import static com.cyc.cycjava.cycl.list_utilities.find_all_if;
import static com.cyc.cycjava.cycl.list_utilities.last_one;
import static com.cyc.cycjava.cycl.list_utilities.plist_has_keyP;
import static com.cyc.cycjava.cycl.list_utilities.remove_last;
import static com.cyc.cycjava.cycl.list_utilities.sublisp_boolean;
import static com.cyc.cycjava.cycl.memoization_state.$memoized_item_not_found$;
import static com.cyc.cycjava.cycl.memoization_state.caching_results;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_clear;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_enter_multi_key_n;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_lookup;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_put;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_remove_function_results_with_args;
import static com.cyc.cycjava.cycl.memoization_state.create_global_caching_state_for_name;
import static com.cyc.cycjava.cycl.memoization_state.note_globally_cached_function;
import static com.cyc.cycjava.cycl.memoization_state.sxhash_calc_2;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$mt$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$relevant_mt_function$;
import static com.cyc.cycjava.cycl.nart_handles.nart_p;
import static com.cyc.cycjava.cycl.operation_communication.the_cyclist;
import static com.cyc.cycjava.cycl.pph_main.generate_phrase;
import static com.cyc.cycjava.cycl.sdbc.new_sql_connection;
import static com.cyc.cycjava.cycl.sdbc.sql_connection_p;
import static com.cyc.cycjava.cycl.sdbc.sql_open_connection_p;
import static com.cyc.cycjava.cycl.sdbc.sql_open_statement_p;
import static com.cyc.cycjava.cycl.sdbc.sql_result_set_p;
import static com.cyc.cycjava.cycl.sdbc.sqlc_close;
import static com.cyc.cycjava.cycl.sdbc.sqlc_create_statement;
import static com.cyc.cycjava.cycl.sdbc.sqlrs_emptyP;
import static com.cyc.cycjava.cycl.sdbc.sqlrs_get_object;
import static com.cyc.cycjava.cycl.sdbc.sqlrs_next;
import static com.cyc.cycjava.cycl.sdbc.sqls_close;
import static com.cyc.cycjava.cycl.sdbc.sqls_execute_query;
import static com.cyc.cycjava.cycl.sdbc.sqls_execute_update;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_db;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_password;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_port;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_proxy_port;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_proxy_server;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_server;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_subprotocol;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_timeout;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_user;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.external_source_access_path;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sk_source_registeredP;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors.cyc_terms_for_sksi_external_term_naut;
import static com.cyc.cycjava.cycl.string_utilities.contains_charP;
import static com.cyc.cycjava.cycl.string_utilities.digit_stringP;
import static com.cyc.cycjava.cycl.string_utilities.ends_with;
import static com.cyc.cycjava.cycl.string_utilities.first_char;
import static com.cyc.cycjava.cycl.string_utilities.first_of_string;
import static com.cyc.cycjava.cycl.string_utilities.join_strings;
import static com.cyc.cycjava.cycl.string_utilities.remove_substring;
import static com.cyc.cycjava.cycl.string_utilities.split_string;
import static com.cyc.cycjava.cycl.string_utilities.starts_with;
import static com.cyc.cycjava.cycl.string_utilities.string_first_n;
import static com.cyc.cycjava.cycl.string_utilities.string_substitute;
import static com.cyc.cycjava.cycl.string_utilities.string_to_integer;
import static com.cyc.cycjava.cycl.string_utilities.to_string;
import static com.cyc.cycjava.cycl.subl_promotions.memberP;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_A;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_E;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_I;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_O;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_U;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_comma;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_semicolon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.upper_case_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.elt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.booleanp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.consp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.streamp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.bookkeeping_store;
import com.cyc.cycjava.cycl.chemistry_utilities;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.disjoint_with;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.lexicon_utilities;
import com.cyc.cycjava.cycl.lexification_utilities;
import com.cyc.cycjava.cycl.lexification_wizard;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      WORDNET-IMPORT
 * source file: /cyc/top/cycl/wordnet-import/wordnet-import.lisp
 * created:     2019/07/03 17:38:12
 */
public final class wordnet_import extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt293$ = makeString("");

    public static final class $wni_role_info_native extends SubLStructNative {
        @Override
	public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
	public SubLObject getField2() {
            return com.cyc.cycjava.cycl.wordnet_import.wordnet_import.$wni_role_info_native.this.$role;
        }

        @Override
	public SubLObject getField3() {
            return com.cyc.cycjava.cycl.wordnet_import.wordnet_import.$wni_role_info_native.this.$filler;
        }

        @Override
	public SubLObject getField4() {
            return com.cyc.cycjava.cycl.wordnet_import.wordnet_import.$wni_role_info_native.this.$defining_col;
        }

        @Override
	public SubLObject getField5() {
            return com.cyc.cycjava.cycl.wordnet_import.wordnet_import.$wni_role_info_native.this.$defining_pred;
        }

        @Override
	public SubLObject getField6() {
            return com.cyc.cycjava.cycl.wordnet_import.wordnet_import.$wni_role_info_native.this.$subsumption_status;
        }

        @Override
	public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.wordnet_import.wordnet_import.$wni_role_info_native.this.$role = value;
        }

        @Override
	public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.wordnet_import.wordnet_import.$wni_role_info_native.this.$filler = value;
        }

        @Override
	public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.wordnet_import.wordnet_import.$wni_role_info_native.this.$defining_col = value;
        }

        @Override
	public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.wordnet_import.wordnet_import.$wni_role_info_native.this.$defining_pred = value;
        }

        @Override
	public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.wordnet_import.wordnet_import.$wni_role_info_native.this.$subsumption_status = value;
        }

        public SubLObject $role = Lisp.NIL;

        public SubLObject $filler = Lisp.NIL;

        public SubLObject $defining_col = Lisp.NIL;

        public SubLObject $defining_pred = Lisp.NIL;

        public SubLObject $subsumption_status = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.$wni_role_info_native.class, WNI_ROLE_INFO, WNI_ROLE_INFO_P, $list_alt394, $list_alt395, new String[]{ "$role", "$filler", "$defining_col", "$defining_pred", "$subsumption_status" }, $list_alt396, $list_alt397, WNI_PRINT_ROLE_INFO);
    }

    public static final SubLFile me = new wordnet_import();



    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $wordnet_import_core_constants$ = makeSymbol("*WORDNET-IMPORT-CORE-CONSTANTS*");

    // defconstant
    // Definitions
    // Names for speech parts
    /**
     * Names for speech parts
     */
    @LispMethod(comment = "Names for speech parts\ndefconstant")
    public static final SubLSymbol $wni_pos_map$ = makeSymbol("*WNI-POS-MAP*");

    // defconstant
    // WordNet abbreviations for speech parts
    /**
     * WordNet abbreviations for speech parts
     */
    @LispMethod(comment = "WordNet abbreviations for speech parts\ndefconstant")
    public static final SubLSymbol $wni_1_char_pos_map$ = makeSymbol("*WNI-1-CHAR-POS-MAP*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $wni_synsets_for_english_word_stringXpos_caching_state$ = makeSymbol("*WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS-CACHING-STATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $wni_synset_collectionP_caching_state$ = makeSymbol("*WNI-SYNSET-COLLECTION?-CACHING-STATE*");

    // defconstant
    /**
     * An assocation list of each frequent verb frame and its relative generality
     * with respect to naming a new term.
     */
    @LispMethod(comment = "An assocation list of each frequent verb frame and its relative generality\r\nwith respect to naming a new term.\ndefconstant\nAn assocation list of each frequent verb frame and its relative generality\nwith respect to naming a new term.")
    private static final SubLSymbol $wni_verb_frame_generalities$ = makeSymbol("*WNI-VERB-FRAME-GENERALITIES*");

    // defconstant
    // A generality score for all of the less frequent verb frames.
    /**
     * A generality score for all of the less frequent verb frames.
     */
    @LispMethod(comment = "A generality score for all of the less frequent verb frames.\ndefconstant")
    private static final SubLSymbol $wni_least_general_frame_generality_score$ = makeSymbol("*WNI-LEAST-GENERAL-FRAME-GENERALITY-SCORE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $wni_synset_wXo_links_helper_caching_state$ = makeSymbol("*WNI-SYNSET-W/O-LINKS-HELPER-CACHING-STATE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $wni_problem_store$ = makeSymbol("*WNI-PROBLEM-STORE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $wni_term_has_verb_semtrans_helperP_caching_state$ = makeSymbol("*WNI-TERM-HAS-VERB-SEMTRANS-HELPER?-CACHING-STATE*");

    // defconstant
    // the maximum number of terms to gather for matching
    /**
     * the maximum number of terms to gather for matching
     */
    @LispMethod(comment = "the maximum number of terms to gather for matching\ndefconstant")
    private static final SubLSymbol $wni_maximum_nbr_of_terms_to_gather_for_matching$ = makeSymbol("*WNI-MAXIMUM-NBR-OF-TERMS-TO-GATHER-FOR-MATCHING*");

    // defparameter
    // When T, indicates that exact term match diagnostics should be displayed.
    /**
     * When T, indicates that exact term match diagnostics should be displayed.
     */
    @LispMethod(comment = "When T, indicates that exact term match diagnostics should be displayed.\ndefparameter")
    public static final SubLSymbol $wni_very_verbose_exact_synset_term_matches$ = makeSymbol("*WNI-VERY-VERBOSE-EXACT-SYNSET-TERM-MATCHES*");

    // defparameter
    // When T, indicates that exact term matches should be displayed.
    /**
     * When T, indicates that exact term matches should be displayed.
     */
    @LispMethod(comment = "When T, indicates that exact term matches should be displayed.\ndefparameter")
    public static final SubLSymbol $wni_verbose_exact_synset_term_matches$ = makeSymbol("*WNI-VERBOSE-EXACT-SYNSET-TERM-MATCHES*");

    // defconstant
    // the WordNet synset for person, individual
    /**
     * the WordNet synset for person, individual
     */
    @LispMethod(comment = "the WordNet synset for person, individual\ndefconstant")
    public static final SubLSymbol $person_synset$ = makeSymbol("*PERSON-SYNSET*");

    // defconstant
    // the WordNet synset for organism, being
    /**
     * the WordNet synset for organism, being
     */
    @LispMethod(comment = "the WordNet synset for organism, being\ndefconstant")
    public static final SubLSymbol $organism_being_synset$ = makeSymbol("*ORGANISM-BEING-SYNSET*");

    // defconstant
    // the WordNet synset for chemical compound
    /**
     * the WordNet synset for chemical compound
     */
    @LispMethod(comment = "the WordNet synset for chemical compound\ndefconstant")
    public static final SubLSymbol $chemical_compound_synset$ = makeSymbol("*CHEMICAL-COMPOUND-SYNSET*");

    // defconstant
    // the WordNet synset for country, state, land
    /**
     * the WordNet synset for country, state, land
     */
    @LispMethod(comment = "the WordNet synset for country, state, land\ndefconstant")
    public static final SubLSymbol $country_synset$ = makeSymbol("*COUNTRY-SYNSET*");

    // defconstant
    // the WordNet synset for urban area, populated area
    /**
     * the WordNet synset for urban area, populated area
     */
    @LispMethod(comment = "the WordNet synset for urban area, populated area\ndefconstant")
    public static final SubLSymbol $urban_area_synset$ = makeSymbol("*URBAN-AREA-SYNSET*");

    // defconstant
    /**
     * the WordNet synset for geographical area, geographic area, geographical
     * region, geographic region
     */
    @LispMethod(comment = "the WordNet synset for geographical area, geographic area, geographical\r\nregion, geographic region\ndefconstant\nthe WordNet synset for geographical area, geographic area, geographical\nregion, geographic region")
    public static final SubLSymbol $geographical_area_synset$ = makeSymbol("*GEOGRAPHICAL-AREA-SYNSET*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_wni_role_info$ = makeSymbol("*DTP-WNI-ROLE-INFO*");

    // deflexical
    // the wordnet import knowledge source access path
    /**
     * the wordnet import knowledge source access path
     */
    @LispMethod(comment = "the wordnet import knowledge source access path\ndeflexical")
    private static final SubLSymbol $wordnet_import_access_path$ = makeSymbol("*WORDNET-IMPORT-ACCESS-PATH*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(new SubLObject[]{ reader_make_constant_shell("Noun"), reader_make_constant_shell("Verb"), reader_make_constant_shell("Adjective"), reader_make_constant_shell("wnSynsetMemberWord"), reader_make_constant_shell("WordNetEnglishWordFn"), reader_make_constant_shell("WordNetWorkflowCollectorMt"), reader_make_constant_shell("WordNet2_0-KS"), reader_make_constant_shell("WordNetSynsetImportStatus-DeterminedIndividual"), reader_make_constant_shell("Adverb"), reader_make_constant_shell("WordNetSynsetFn"), reader_make_constant_shell("WordNetWorkflowDataStatusMt"), reader_make_constant_shell("Situation"), reader_make_constant_shell("Relation"), reader_make_constant_shell("WordNetSynsetImportStatus-Skip"), reader_make_constant_shell("thereExists"), reader_make_constant_shell("wnSynsetWord"), reader_make_constant_shell("WordNetWordSenseFn"), reader_make_constant_shell("wnSynsetExamplePhraseWithPosition"), reader_make_constant_shell("WNVerbFrame-8"), reader_make_constant_shell("WNVerbFrame-1"), reader_make_constant_shell("WNVerbFrame-9"), reader_make_constant_shell("WNVerbFrame-11"), reader_make_constant_shell("WNVerbFrame-22"), reader_make_constant_shell("WNVerbFrame-4"), reader_make_constant_shell("WNVerbFrame-2"), reader_make_constant_shell("wnSynsetVerbFrame"), reader_make_constant_shell("wnHypernym"), reader_make_constant_shell("wnSynsetGloss"), reader_make_constant_shell("wnSynsetSpeechPart"), reader_make_constant_shell("WordNetSynsetReifiedFn"), reader_make_constant_shell("wnWorkflowSynsetLock") });

    private static final SubLSymbol $sym1$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");

    private static final SubLList $list2 = list(cons(reader_make_constant_shell("Noun"), makeString("Noun")), cons(reader_make_constant_shell("Verb"), makeString("Verb")), cons(reader_make_constant_shell("Adjective"), makeString("Adjective")), cons(reader_make_constant_shell("Adverb"), makeString("Adverb")));

    private static final SubLList $list3 = list(cons(reader_make_constant_shell("Noun"), makeString("N")), cons(reader_make_constant_shell("Verb"), makeString("V")), cons(reader_make_constant_shell("Adjective"), makeString("A")), cons(reader_make_constant_shell("Adverb"), makeString("R")));

    private static final SubLSymbol WNI_UNRANKED_SYNSETS_FOR_ENGLISH_WORD_STRING = makeSymbol("WNI-UNRANKED-SYNSETS-FOR-ENGLISH-WORD-STRING");



    private static final SubLSymbol $sym7$_SYNSET = makeSymbol("?SYNSET");



    private static final SubLList $list9 = list(new SubLObject[]{ makeKeyword("MAX-NUMBER"), NIL, makeKeyword("MAX-TIME"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("BLOCK?"), NIL, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("CACHE-INFERENCE-RESULTS?"), NIL, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), NIL, makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY") });



    private static final SubLSymbol $wni_unranked_synsets_for_english_word_string_caching_state$ = makeSymbol("*WNI-UNRANKED-SYNSETS-FOR-ENGLISH-WORD-STRING-CACHING-STATE*");

    private static final SubLSymbol $sym14$WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_POS = makeSymbol("WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS");

    private static final SubLString $str15$select_synset_id_from_WordSense_w = makeString("select synset_id from WordSense where word = '");

    private static final SubLString $str16$__and_pos____ = makeString("' and pos = '");

    private static final SubLString $str17$__order_by_word_sense = makeString("' order by word_sense");



    private static final SubLSymbol $sym24$_WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_POS_CACHING_STATE_ = makeSymbol("*WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS-CACHING-STATE*");

    private static final SubLSymbol WNI_SYNSETS_FOR_ENGLISH_WORD_STRING = makeSymbol("WNI-SYNSETS-FOR-ENGLISH-WORD-STRING");

    private static final SubLObject $const26$WordNet2_0_KS = reader_make_constant_shell("WordNet2_0-KS");

    private static final SubLString $str27$__order_by_pos__word_sense = makeString("' order by pos, word_sense");

    private static final SubLSymbol $wni_synsets_for_english_word_string_caching_state$ = makeSymbol("*WNI-SYNSETS-FOR-ENGLISH-WORD-STRING-CACHING-STATE*");

    private static final SubLSymbol $sym29$WNI_SYNSET_COLLECTION_ = makeSymbol("WNI-SYNSET-COLLECTION?");

    private static final SubLObject $const30$WordNetSynsetImportStatus_Determi = reader_make_constant_shell("WordNetSynsetImportStatus-DeterminedIndividual");



    private static final SubLSymbol $sym32$_WNI_SYNSET_COLLECTION__CACHING_STATE_ = makeSymbol("*WNI-SYNSET-COLLECTION?-CACHING-STATE*");

    private static final SubLSymbol WNI_SYNSET_INDIVIDUALS = makeSymbol("WNI-SYNSET-INDIVIDUALS");

    private static final SubLSymbol WNI_UNREIFIED_SYNSET = makeSymbol("WNI-UNREIFIED-SYNSET");

    private static final SubLSymbol WNI_EXCLUDE_SITUATIONS = makeSymbol("WNI-EXCLUDE-SITUATIONS");

    private static final SubLString $str36$excluding_specs_of___Situation = makeString("excluding specs of #$Situation");

    private static final SubLString $$$cdolist = makeString("cdolist");



    private static final SubLSymbol WNI_EXCLUDE_RELATIONS = makeSymbol("WNI-EXCLUDE-RELATIONS");

    private static final SubLString $str40$excluding_specs_of___Relation = makeString("excluding specs of #$Relation");



    private static final SubLSymbol WNI_EXCLUDE_SKIPPED = makeSymbol("WNI-EXCLUDE-SKIPPED");

    private static final SubLString $$$excluding_skipped_synsets = makeString("excluding skipped synsets");

    private static final SubLObject $$WordNetSynsetImportStatus_Skip = reader_make_constant_shell("WordNetSynsetImportStatus-Skip");

    private static final SubLSymbol WNI_SYNSET_ID = makeSymbol("WNI-SYNSET-ID");

    private static final SubLSymbol POSSIBLY_NAUT_P = makeSymbol("POSSIBLY-NAUT-P");

    private static final SubLSymbol WNI_SYNSET_WORDS = makeSymbol("WNI-SYNSET-WORDS");

    private static final SubLSymbol WNI_SYNSETS_EQUAL = makeSymbol("WNI-SYNSETS-EQUAL");

    private static final SubLSymbol WNI_SYNSET_WORDS_HELPER = makeSymbol("WNI-SYNSET-WORDS-HELPER");



    private static final SubLSymbol $sym52$_POS = makeSymbol("?POS");

    private static final SubLSymbol $sym53$_SENSE = makeSymbol("?SENSE");



    private static final SubLList $list55 = list(list(reader_make_constant_shell("WordNetWordSenseFn"), list(reader_make_constant_shell("WordNetEnglishWordFn"), makeSymbol("?STRING")), makeSymbol("?POS"), makeSymbol("?SENSE")), makeSymbol("?WORD-INDEX"));

    private static final SubLSymbol $sym56$_ = makeSymbol("<");

    private static final SubLSymbol $wni_synset_words_helper_caching_state$ = makeSymbol("*WNI-SYNSET-WORDS-HELPER-CACHING-STATE*");

    private static final SubLSymbol WNI_SYNSET_EXAMPLE_PHRASES = makeSymbol("WNI-SYNSET-EXAMPLE-PHRASES");

    private static final SubLSymbol WNI_SYNSET_EXAMPLE_PHRASES_HELPER = makeSymbol("WNI-SYNSET-EXAMPLE-PHRASES-HELPER");



    private static final SubLList $list62 = list(makeSymbol("?EXAMPLE-PHRASE"), makeSymbol("?INDEX"));

    private static final SubLSymbol $wni_synset_example_phrases_helper_caching_state$ = makeSymbol("*WNI-SYNSET-EXAMPLE-PHRASES-HELPER-CACHING-STATE*");

    private static final SubLList $list65 = list(cons(reader_make_constant_shell("WNVerbFrame-8"), TWO_INTEGER), cons(reader_make_constant_shell("WNVerbFrame-2"), FIVE_INTEGER), cons(reader_make_constant_shell("WNVerbFrame-1"), FOUR_INTEGER), cons(reader_make_constant_shell("WNVerbFrame-9"), THREE_INTEGER), cons(reader_make_constant_shell("WNVerbFrame-11"), ONE_INTEGER), cons(reader_make_constant_shell("WNVerbFrame-22"), FIVE_INTEGER), cons(reader_make_constant_shell("WNVerbFrame-4"), FOUR_INTEGER));

    private static final SubLSymbol WNI_MOST_GENERAL_SYNSET_VERB_FRAME = makeSymbol("WNI-MOST-GENERAL-SYNSET-VERB-FRAME");

    private static final SubLSymbol WNI_SYNSET_VERB_FRAMES = makeSymbol("WNI-SYNSET-VERB-FRAMES");

    private static final SubLSymbol WNI_SYNSET_VERB_FRAMES_HELPER = makeSymbol("WNI-SYNSET-VERB-FRAMES-HELPER");



    private static final SubLList $list71 = list(makeSymbol("?VERB-FRAME"));

    private static final SubLList $list72 = list(new SubLObject[]{ makeKeyword("MAX-NUMBER"), NIL, makeKeyword("MAX-TIME"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("BLOCK?"), NIL, makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), makeSymbol("?VERB-FRAME")), makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("CACHE-INFERENCE-RESULTS?"), NIL, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), NIL, makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY") });

    private static final SubLSymbol $wni_synset_verb_frames_helper_caching_state$ = makeSymbol("*WNI-SYNSET-VERB-FRAMES-HELPER-CACHING-STATE*");

    private static final SubLSymbol WNI_VERB_FRAMES_FOR_WORD = makeSymbol("WNI-VERB-FRAMES-FOR-WORD");

    private static final SubLSymbol $wni_verb_frames_for_word_caching_state$ = makeSymbol("*WNI-VERB-FRAMES-FOR-WORD-CACHING-STATE*");

    private static final SubLSymbol WNI_HYPERNYMS = makeSymbol("WNI-HYPERNYMS");

    private static final SubLSymbol WNI_HYPERNYMS_HELPER = makeSymbol("WNI-HYPERNYMS-HELPER");



    private static final SubLList $list80 = list(makeSymbol("?HYPERNYM-SYNSET"));

    private static final SubLSymbol $wni_hypernyms_helper_caching_state$ = makeSymbol("*WNI-HYPERNYMS-HELPER-CACHING-STATE*");

    private static final SubLSymbol WNI_ALL_HYPERNYMS = makeSymbol("WNI-ALL-HYPERNYMS");

    private static final SubLSymbol WNI_ALL_HYPERNYMS_HELPER = makeSymbol("WNI-ALL-HYPERNYMS-HELPER");

    private static final SubLSymbol $wni_all_hypernyms_helper_caching_state$ = makeSymbol("*WNI-ALL-HYPERNYMS-HELPER-CACHING-STATE*");

    private static final SubLSymbol $sym85$WNI_ALL_HYPERNYM_ = makeSymbol("WNI-ALL-HYPERNYM?");

    private static final SubLSymbol WNI_HYPONYMS = makeSymbol("WNI-HYPONYMS");

    private static final SubLSymbol WNI_HYPONYMS_HELPER = makeSymbol("WNI-HYPONYMS-HELPER");

    private static final SubLSymbol $sym88$_HYPONYM_SYNSET = makeSymbol("?HYPONYM-SYNSET");

    private static final SubLSymbol $wni_hyponyms_helper_caching_state$ = makeSymbol("*WNI-HYPONYMS-HELPER-CACHING-STATE*");

    private static final SubLSymbol WNI_ALL_HYPONYMS = makeSymbol("WNI-ALL-HYPONYMS");

    private static final SubLSymbol WNI_ALL_HYPONYMS_HELPER = makeSymbol("WNI-ALL-HYPONYMS-HELPER");

    private static final SubLSymbol $wni_all_hyponyms_helper_caching_state$ = makeSymbol("*WNI-ALL-HYPONYMS-HELPER-CACHING-STATE*");

    private static final SubLSymbol WNI_ANY_HYPONYM_AN_INDIVIDUAL = makeSymbol("WNI-ANY-HYPONYM-AN-INDIVIDUAL");

    private static final SubLSymbol $sym94$WNI_VERB_IS_DERIVED_FROM_SITUATION_NOUN_ = makeSymbol("WNI-VERB-IS-DERIVED-FROM-SITUATION-NOUN?");



    private static final SubLSymbol WNI_DERIVED_FORMS = makeSymbol("WNI-DERIVED-FORMS");

    private static final SubLSymbol WNI_DERIVED_FORMS_HELPER = makeSymbol("WNI-DERIVED-FORMS-HELPER");

    private static final SubLString $str98$SELECT_DISTINCT_synsetpointer_syn = makeString("SELECT DISTINCT synsetpointer.synset_id \n               FROM synsetpointer \n               WHERE \n                 synsetpointer.target_synset_id = ");

    private static final SubLString $str99$_AND____________________synsetpoi = makeString(" AND \n                 (synsetpointer.source_pos = \'n\' OR\n                  synsetpointer.source_pos = \'a\' OR\n                  synsetpointer.source_pos = \'r\') AND \n                 synsetpointer.pointer_type = \'+\'");

    private static final SubLSymbol $wni_derived_forms_helper_caching_state$ = makeSymbol("*WNI-DERIVED-FORMS-HELPER-CACHING-STATE*");

    private static final SubLSymbol WNI_SYNSET_GLOSS = makeSymbol("WNI-SYNSET-GLOSS");

    private static final SubLSymbol WNI_SYNSET_GLOSS_HELPER = makeSymbol("WNI-SYNSET-GLOSS-HELPER");



    private static final SubLList $list104 = list(makeSymbol("?GLOSS"));

    private static final SubLList $list105 = list(new SubLObject[]{ makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("MAX-TIME"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("BLOCK?"), NIL, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("CACHE-INFERENCE-RESULTS?"), NIL, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), makeSymbol("?GLOSS")), makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL, makeKeyword("CONTINUABLE?"), NIL, makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY") });

    private static final SubLSymbol $wni_synset_gloss_helper_caching_state$ = makeSymbol("*WNI-SYNSET-GLOSS-HELPER-CACHING-STATE*");

    private static final SubLSymbol WNI_SYNSET_POS = makeSymbol("WNI-SYNSET-POS");

    private static final SubLSymbol WNI_SYNSET_POS_HELPER = makeSymbol("WNI-SYNSET-POS-HELPER");



    private static final SubLList $list110 = list(makeSymbol("?POS"));

    private static final SubLList $list111 = list(new SubLObject[]{ makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("MAX-TIME"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("BLOCK?"), NIL, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("CACHE-INFERENCE-RESULTS?"), NIL, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), NIL, makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL, makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), makeSymbol("?POS")), makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY") });

    private static final SubLSymbol $wni_synset_pos_helper_caching_state$ = makeSymbol("*WNI-SYNSET-POS-HELPER-CACHING-STATE*");

    private static final SubLSymbol WNI_SYNSET_SPEECH_PART_OFFSET = makeSymbol("WNI-SYNSET-SPEECH-PART-OFFSET");

    private static final SubLSymbol WNI_SYNSET_SPEECH_PART_OFFSET_HELPER = makeSymbol("WNI-SYNSET-SPEECH-PART-OFFSET-HELPER");



    private static final SubLList $list117 = list(makeSymbol("?SPEECH-PART-OFFSET"));

    private static final SubLList $list118 = list(new SubLObject[]{ makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("MAX-TIME"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("BLOCK?"), NIL, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), makeSymbol("?SPEECH-PART-OFFSET")), makeKeyword("CACHE-INFERENCE-RESULTS?"), NIL, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), NIL, makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY") });

    private static final SubLSymbol $wni_synset_speech_part_offset_helper_caching_state$ = makeSymbol("*WNI-SYNSET-SPEECH-PART-OFFSET-HELPER-CACHING-STATE*");

    private static final SubLSymbol WNI_HYPERNYM_TERMS = makeSymbol("WNI-HYPERNYM-TERMS");

    private static final SubLSymbol $sym122$WNI_HYPERNYM_MAPPED_ = makeSymbol("WNI-HYPERNYM-MAPPED?");

    private static final SubLSymbol WNI_SYNSET_TERM = makeSymbol("WNI-SYNSET-TERM");

    private static final SubLSymbol WNI_SYNSET_TERM_HELPER = makeSymbol("WNI-SYNSET-TERM-HELPER");



    private static final SubLSymbol $sym127$_TERM = makeSymbol("?TERM");

    private static final SubLObject $const128$WordNet_Version2_0 = reader_make_constant_shell("WordNet-Version2_0");

    private static final SubLList $list129 = list(new SubLObject[]{ makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("MAX-TIME"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(0.95), makeKeyword("BLOCK?"), NIL, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), makeSymbol("?TERM")), makeKeyword("CACHE-INFERENCE-RESULTS?"), NIL, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), NIL, makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(2000000) });

    private static final SubLSymbol $wni_synset_term_helper_caching_state$ = makeSymbol("*WNI-SYNSET-TERM-HELPER-CACHING-STATE*");

    private static final SubLSymbol WNI_UNMAPPED_HYPERNYM_CHAIN = makeSymbol("WNI-UNMAPPED-HYPERNYM-CHAIN");

    private static final SubLSymbol $sym132$WNI_SYNSET_W_O_LINKS = makeSymbol("WNI-SYNSET-W/O-LINKS");

    private static final SubLSymbol $sym133$WNI_SYNSET_W_O_LINKS_HELPER = makeSymbol("WNI-SYNSET-W/O-LINKS-HELPER");

    static private final SubLString $str134$_ = makeString("(");

    private static final SubLString $str135$___ = makeString(" | ");

    private static final SubLString $str136$_ = makeString(")");

    private static final SubLSymbol $sym137$_WNI_SYNSET_W_O_LINKS_HELPER_CACHING_STATE_ = makeSymbol("*WNI-SYNSET-W/O-LINKS-HELPER-CACHING-STATE*");

    private static final SubLSymbol $sym139$WNI_SYNSET_IS_CAUSER_ = makeSymbol("WNI-SYNSET-IS-CAUSER?");

    private static final SubLSymbol WNI_SYNSETS_CAUSED_BY = makeSymbol("WNI-SYNSETS-CAUSED-BY");

    private static final SubLSymbol WNI_SYNSETS_CAUSED_BY_HELPER = makeSymbol("WNI-SYNSETS-CAUSED-BY-HELPER");



    private static final SubLList $list143 = list(makeSymbol("?CAUSED-SYNSET"));

    private static final SubLSymbol $wni_synsets_caused_by_helper_caching_state$ = makeSymbol("*WNI-SYNSETS-CAUSED-BY-HELPER-CACHING-STATE*");

    private static final SubLSymbol $sym145$WNI_SYNSET_IS_CAUSED_BY_ = makeSymbol("WNI-SYNSET-IS-CAUSED-BY?");

    private static final SubLSymbol WNI_SYNSETS_CAUSING = makeSymbol("WNI-SYNSETS-CAUSING");

    private static final SubLSymbol WNI_SYNSETS_CAUSING_HELPER = makeSymbol("WNI-SYNSETS-CAUSING-HELPER");

    private static final SubLSymbol $sym148$_CAUSING_SYNSET = makeSymbol("?CAUSING-SYNSET");

    private static final SubLSymbol $wni_synsets_causing_helper_caching_state$ = makeSymbol("*WNI-SYNSETS-CAUSING-HELPER-CACHING-STATE*");

    private static final SubLString $$$ancient = makeString("ancient");

    private static final SubLString $$$Greek = makeString("Greek");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $$$Atlantic = makeString("Atlantic");

    private static final SubLString $$$Pacific = makeString("Pacific");

    private static final SubLString $$$Crown_Colony = makeString("Crown Colony");

    private static final SubLString $$$Caribbean = makeString("Caribbean");

    private static final SubLString $$$State = makeString("State");

    private static final SubLString $$$Lake_Erie = makeString("Lake Erie");

    private static final SubLString $$$Asia_Minor = makeString("Asia Minor");

    private static final SubLString $$$Elbo_River = makeString("Elbo River");

    private static final SubLString $$$Asian = makeString("Asian");

    private static final SubLString $$$Yourba = makeString("Yourba");

    private static final SubLString $$$Japanese = makeString("Japanese");

    private static final SubLString $$$Nile = makeString("Nile");

    private static final SubLString $$$River_Thames = makeString("River Thames");

    private static final SubLString $$$River_Aire = makeString("River Aire");

    private static final SubLString $str167$_s = makeString("'s");





    private static final SubLSymbol WNI_SYNSETS_HAVING_POS = makeSymbol("WNI-SYNSETS-HAVING-POS");

    private static final SubLSymbol WNI_TERMS_SYNSETS = makeSymbol("WNI-TERMS-SYNSETS");

    private static final SubLList $list172 = list(reader_make_constant_shell("WordNet-Version2_0"), makeSymbol("?SPEECH-PART-OFFSET"));

    private static final SubLList $list173 = list(new SubLObject[]{ makeKeyword("MAX-NUMBER"), NIL, makeKeyword("MAX-TIME"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(0.95), makeKeyword("BLOCK?"), NIL, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("CACHE-INFERENCE-RESULTS?"), NIL, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), NIL, makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(2000000) });

    private static final SubLSymbol $sym174$_SPEECH_PART_OFFSET = makeSymbol("?SPEECH-PART-OFFSET");

    private static final SubLSymbol WNI_BROADER_TERMS = makeSymbol("WNI-BROADER-TERMS");





    private static final SubLSymbol $wni_broader_terms_caching_state$ = makeSymbol("*WNI-BROADER-TERMS-CACHING-STATE*");

    private static final SubLSymbol WNI_MAPPED_TERMS_AND_SYNSETS = makeSymbol("WNI-MAPPED-TERMS-AND-SYNSETS");

    private static final SubLString $str180$finding_synsets_for_speech_part_o = makeString("finding synsets for speech-part-offsets");

    private static final SubLSymbol $sym182$WNI_SYNSET_HYPERNYMS_MAPPED_ = makeSymbol("WNI-SYNSET-HYPERNYMS-MAPPED?");

    private static final SubLSymbol WNI_MAPPED_TERMS = makeSymbol("WNI-MAPPED-TERMS");

    private static final SubLList $list184 = list(reader_make_constant_shell("thereExists"), makeSymbol("?SPEECH-PART-OFFSET"), list(reader_make_constant_shell("synonymousExternalConcept"), makeSymbol("?TERM"), reader_make_constant_shell("WordNet-Version2_0"), makeSymbol("?SPEECH-PART-OFFSET")));



    private static final SubLSymbol WNI_MAPPED_TERMS_AND_POS_OFFSETS = makeSymbol("WNI-MAPPED-TERMS-AND-POS-OFFSETS");

    static private final SubLList $list187 = list(reader_make_constant_shell("synonymousExternalConcept"), makeSymbol("?TERM"), reader_make_constant_shell("WordNet-Version2_0"), makeSymbol("?SPEECH-PART-OFFSET"));

    private static final SubLSymbol WNI_SPEECH_PART_OFFSET_TO_SYNSET = makeSymbol("WNI-SPEECH-PART-OFFSET-TO-SYNSET");

    static private final SubLList $list189 = list(new SubLObject[]{ makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("MAX-TIME"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("BLOCK?"), NIL, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("CACHE-INFERENCE-RESULTS?"), NIL, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), NIL, makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY") });

    private static final SubLSymbol WNI_UPDATE_SYNSET_WITH_TERM = makeSymbol("WNI-UPDATE-SYNSET-WITH-TERM");

    private static final SubLList $list191 = list(makeKeyword("TIMEOUT"), THREE_INTEGER);

    private static final SubLString $str192$update_Synset_set_cyc_term_____A_ = makeString("update Synset set cyc_term = '~A' where synset_id = ~S");

    private static final SubLSymbol WNI_INSERT_CONCEPT_MATCH_HTML = makeSymbol("WNI-INSERT-CONCEPT-MATCH-HTML");

    private static final SubLString $str194$delete_from_ConceptMatchHTML_wher = makeString("delete from ConceptMatchHTML where synset_id = ~A and cyc_image_id ='~A'");

    private static final SubLString $str195$insert_into_ConceptMatchHTML_valu = makeString("insert into ConceptMatchHTML values(~A, '~A', '~A')");

    private static final SubLString $str196$__ = makeString("''");

    private static final SubLString $str197$_ = makeString("'");

    private static final SubLSymbol WNI_SELECT_CONCEPT_MATCH_HTML = makeSymbol("WNI-SELECT-CONCEPT-MATCH-HTML");

    private static final SubLString $str199$select_html_from_ConceptMatchHTML = makeString("select html from ConceptMatchHTML where synset_id = ~A and cyc_image_id ='~A'");

    private static final SubLSymbol WNI_DELETE_CONCEPT_MATCH_HTML = makeSymbol("WNI-DELETE-CONCEPT-MATCH-HTML");

    private static final SubLSymbol WNI_DELETE_ALL_CONCEPT_MATCH_HTML = makeSymbol("WNI-DELETE-ALL-CONCEPT-MATCH-HTML");

    private static final SubLString $str202$delete_from_ConceptMatchHTML_wher = makeString("delete from ConceptMatchHTML where cyc_image_id ='~A'");

    private static final SubLSymbol WNI_UNMAPPED_SYNSETS_HAVING_MAPPED_HYPERNYM = makeSymbol("WNI-UNMAPPED-SYNSETS-HAVING-MAPPED-HYPERNYM");

    private static final SubLString $str204$select_Synset_synset_id__________ = makeString("select Synset.synset_id\n                 from \n                   Synset, \n                   Synset as target_synset, \n                   SynsetPointer\n                 where\n                   Synset.pos = \'");

    private static final SubLString $str205$__and____________________Synset_c = makeString("\' and\n                   Synset.cyc_term is null and\n                   pointer_type = \'@\' and\n                   SynsetPointer.synset_id = Synset.synset_id and\n                   SynsetPointer.target_synset_id = target_synset.synset_id and\n                   target_synset.cyc_term is not null\n                 order by Synset.synset_id");

    private static final SubLString $str210$Destroying_invalid_WordNet_Import = makeString("Destroying invalid WordNet Import problem store...");

    private static final SubLFloat $float$0_9 = makeDouble(0.9);

    private static final SubLString $str212$Destroying_90___full_WordNet_Impo = makeString("Destroying 90%+ full WordNet Import problem store...");

    private static final SubLList $list213 = list(makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), $NONE, makeKeyword("TRANSFORMATION-ALLOWED?"), NIL, makeKeyword("NEW-TERMS-ALLOWED?"), NIL);

    private static final SubLSymbol WNI_REIFIABLE_SYNSET = makeSymbol("WNI-REIFIABLE-SYNSET");



    private static final SubLSymbol WNI_REIFIABLE_SYNSET_FROM_STRING = makeSymbol("WNI-REIFIABLE-SYNSET-FROM-STRING");

    private static final SubLSymbol WNI_SYNSET_FROM_ID_STRING = makeSymbol("WNI-SYNSET-FROM-ID-STRING");

    private static final SubLSymbol $sym219$DIGIT_STRING_ = makeSymbol("DIGIT-STRING?");

    private static final SubLSymbol WNI_ENSURE_NAUT = makeSymbol("WNI-ENSURE-NAUT");

    private static final SubLSymbol WNI_NEXT_SYNSET_WITH_STATUS = makeSymbol("WNI-NEXT-SYNSET-WITH-STATUS");





    private static final SubLSymbol $sym224$_REIFIED_SYNSET = makeSymbol("?REIFIED-SYNSET");

    private static final SubLList $list225 = list(list(reader_make_constant_shell("unknownSentence"), list(reader_make_constant_shell("thereExists"), makeSymbol("?CYCLIST"), list(reader_make_constant_shell("thereExists"), makeSymbol("?DATE"), list(reader_make_constant_shell("wnWorkflowSynsetLock"), makeSymbol("?REIFIED-SYNSET"), makeSymbol("?CYCLIST"), makeSymbol("?DATE"))))));

    private static final SubLSymbol WNI_UNLOCKED_SYNSETS_WITH_STATUS = makeSymbol("WNI-UNLOCKED-SYNSETS-WITH-STATUS");

    private static final SubLSymbol $sym227$WNI_TERM_HAS_VERB_SEMTRANS_ = makeSymbol("WNI-TERM-HAS-VERB-SEMTRANS?");

    private static final SubLSymbol $sym228$WNI_TERM_HAS_VERB_SEMTRANS_HELPER_ = makeSymbol("WNI-TERM-HAS-VERB-SEMTRANS-HELPER?");

    private static final SubLSymbol $sym229$_WORD_UNIT = makeSymbol("?WORD-UNIT");

    private static final SubLSymbol $sym230$_SENSE_NBR = makeSymbol("?SENSE-NBR");







    private static final SubLSymbol $sym234$_FRAME = makeSymbol("?FRAME");

    private static final SubLSymbol $sym235$_TRANS = makeSymbol("?TRANS");

    private static final SubLObject $$verbSemTrans_Canonical = reader_make_constant_shell("verbSemTrans-Canonical");

    static private final SubLList $list237 = list(makeSymbol("?TRANS"));

    private static final SubLList $list238 = list(list(reader_make_constant_shell("unknownSentence"), list(reader_make_constant_shell("thereExists"), makeSymbol("?FRAME"), list(reader_make_constant_shell("thereExists"), makeSymbol("?TRANS"), list(reader_make_constant_shell("verbSemTrans"), makeSymbol("?WORD-UNIT"), makeSymbol("?SENSE-NBR"), makeSymbol("?FRAME"), makeSymbol("?TRANS"))))));

    private static final SubLList $list239 = list(NIL);

    private static final SubLSymbol $sym240$_WNI_TERM_HAS_VERB_SEMTRANS_HELPER__CACHING_STATE_ = makeSymbol("*WNI-TERM-HAS-VERB-SEMTRANS-HELPER?-CACHING-STATE*");

    private static final SubLSymbol WNI_GATHER_TERMS_FOR_MATCHING = makeSymbol("WNI-GATHER-TERMS-FOR-MATCHING");

    private static final SubLSymbol WNI_EXACT_SYNSET_TERM_MATCHES = makeSymbol("WNI-EXACT-SYNSET-TERM-MATCHES");

    private static final SubLString $str243$___A_mapped_hypernyms__A___A__ = makeString("~%~A mapped-hypernyms ~A~%~A~%");

    private static final SubLString $str244$__considering_word____a__ = makeString("  considering word - ~a~%");

    private static final SubLString $str245$____possible_lexical_matches__A__ = makeString("    possible lexical matches ~A~%");

    private static final SubLString $str246$____considering_term____a___const = makeString("    considering term - ~a - constrained by mapped broader terms ~A~%");

    private static final SubLString $str247$___A_____A__structure___ = makeString("~%~A  = ~A (structure)~%");

    private static final SubLString $str248$___A____A__lexicon___ = makeString("~%~A = ~A (lexicon)~%");

    private static final SubLSymbol WNI_STRONG_SYNSET_TERM_MATCHES = makeSymbol("WNI-STRONG-SYNSET-TERM-MATCHES");

    private static final SubLSymbol $ALL_NOUN_FORMS = makeKeyword("ALL-NOUN-FORMS");

    private static final SubLSymbol $sym254$SET_OR_COLLECTION_ = makeSymbol("SET-OR-COLLECTION?");

    private static final SubLSymbol $sym255$INDIVIDUAL_ = makeSymbol("INDIVIDUAL?");

    private static final SubLSymbol WNI_WEAK_SYNSET_TERM_MATCHES = makeSymbol("WNI-WEAK-SYNSET-TERM-MATCHES");

    private static final SubLSymbol WNI_CREATE_NOW = makeSymbol("WNI-CREATE-NOW");

    private static final SubLSymbol WNI_ASSERT_WFF = makeSymbol("WNI-ASSERT-WFF");

    private static final SubLSymbol WNI_UNASSERT_IMPORT_STATUSES = makeSymbol("WNI-UNASSERT-IMPORT-STATUSES");

    private static final SubLSymbol WNI_UNASSERT_IMPORT_STATUS = makeSymbol("WNI-UNASSERT-IMPORT-STATUS");

    private static final SubLSymbol WNI_ASSERT_IMPORT_STATUSES = makeSymbol("WNI-ASSERT-IMPORT-STATUSES");

    private static final SubLSymbol WNI_ASSERT_IMPORT_STATUS = makeSymbol("WNI-ASSERT-IMPORT-STATUS");

    private static final SubLSymbol WNI_ASSERT_SYNSET_MAPPING = makeSymbol("WNI-ASSERT-SYNSET-MAPPING");

    private static final SubLSymbol WNI_ASSERT_LIKELY_SYNSET_MAPPING = makeSymbol("WNI-ASSERT-LIKELY-SYNSET-MAPPING");



    private static final SubLSymbol WNI_ASSERT_QUOTED_ISA_WORKFLOW_CONSTANT = makeSymbol("WNI-ASSERT-QUOTED-ISA-WORKFLOW-CONSTANT");



    private static final SubLList $list274 = list(reader_make_constant_shell("WordNetWorkflowConstant-NotFullyReviewed"));



    private static final SubLSymbol WNI_ASSERT_ISA_COLLECTION = makeSymbol("WNI-ASSERT-ISA-COLLECTION");

    private static final SubLList $list277 = list(reader_make_constant_shell("Collection"));



    private static final SubLSymbol WNI_ASSERT_GENLS = makeSymbol("WNI-ASSERT-GENLS");



    private static final SubLSymbol WNI_UNASSERT_GENLS = makeSymbol("WNI-UNASSERT-GENLS");

    private static final SubLSymbol WNI_ASSERT_ISA = makeSymbol("WNI-ASSERT-ISA");



    private static final SubLSymbol WNI_ASSERT_ISA_INDIVIDUAL = makeSymbol("WNI-ASSERT-ISA-INDIVIDUAL");

    private static final SubLList $list285 = list(reader_make_constant_shell("Individual"));

    private static final SubLSymbol WNI_ASSERT_ISA_AGENT_GENERIC = makeSymbol("WNI-ASSERT-ISA-AGENT-GENERIC");

    private static final SubLObject $$Agent_Generic = reader_make_constant_shell("Agent-Generic");

    private static final SubLList $list288 = list(reader_make_constant_shell("Agent-Generic"));

    private static final SubLSymbol WNI_ASSERT_REIFIED_USING = makeSymbol("WNI-ASSERT-REIFIED-USING");



    private static final SubLList $list291 = list(reader_make_constant_shell("CycWordNetImportTool"));

    private static final SubLSymbol WNI_SYNSET_NOTE = makeSymbol("WNI-SYNSET-NOTE");



    private static final SubLList $list294 = list(makeSymbol("?NOTE"));

    private static final SubLString $str295$ = makeString("");

    private static final SubLSymbol WNI_ASSERT_SYNSET_NOTE = makeSymbol("WNI-ASSERT-SYNSET-NOTE");

    private static final SubLSymbol WNI_UNASSERT_SYNSET_NOTE = makeSymbol("WNI-UNASSERT-SYNSET-NOTE");

    private static final SubLSymbol WNI_ASSERT_COMMENT = makeSymbol("WNI-ASSERT-COMMENT");



    private static final SubLSymbol WNI_ASSERT_TERM_OF_UNIT = makeSymbol("WNI-ASSERT-TERM-OF-UNIT");





    private static final SubLSymbol WNI_LOCK_SYNSET = makeSymbol("WNI-LOCK-SYNSET");



    private static final SubLSymbol WNI_UNLOCK_SYNSET = makeSymbol("WNI-UNLOCK-SYNSET");

    private static final SubLList $list306 = list(makeSymbol("?DATE"));

    private static final SubLSymbol WNI_ASSERT_HEURISTIC_LEXICON = makeSymbol("WNI-ASSERT-HEURISTIC-LEXICON");

    static private final SubLList $list309 = list(reader_make_constant_shell("WordNetSynsetFn"), makeInteger(114834));

    private static final SubLList $list310 = list(reader_make_constant_shell("WordNetSynsetFn"), makeInteger(114709));

    static private final SubLList $list311 = list(reader_make_constant_shell("WordNetSynsetFn"), makeInteger(567092));

    private static final SubLString $str312$_included = makeString("-included");

    static private final SubLList $list313 = list(reader_make_constant_shell("WordNetSynsetFn"), makeInteger(377912));

    private static final SubLList $list314 = list(reader_make_constant_shell("WordNetSynsetFn"), makeInteger(382049));

    private static final SubLList $list315 = list(reader_make_constant_shell("WordNetSynsetFn"), makeInteger(378797));

    private static final SubLString $str316$WordNet_individual_synset__A_must = makeString("WordNet individual synset ~A must be a #$Noun");







    private static final SubLList $list320 = list(CHAR_space, CHAR_semicolon, CHAR_comma);

    static private final SubLList $list321 = list(CHAR_hyphen);







    private static final SubLObject $const325$TemporaryLexicalAssertions_WordNe = reader_make_constant_shell("TemporaryLexicalAssertions-WordNetImportMt");

    private static final SubLString $str326$_count_noun = makeString("-count-noun");

    private static final SubLString $str327$headword_is_first = makeString("headword-is-first");





    private static final SubLString $str330$must_have_an_existing_word_unit_f = makeString("must have an existing word unit for ~A which has speech-part ~A");

    private static final SubLSymbol $sym331$_WORD_SENSE = makeSymbol("?WORD-SENSE");

    private static final SubLString $str332$must_have_an_existing_word_sense_ = makeString("must have an existing word sense for ~A which has speech-part ~A");







    private static final SubLString $str336$_politeness = makeString("-politeness");

    private static final SubLString $$$polite = makeString("polite");



    private static final SubLString $$$rude = makeString("rude");



    private static final SubLString $$$vulgar = makeString("vulgar");



    private static final SubLString $str343$_formality = makeString("-formality");

    private static final SubLString $$$archaic = makeString("archaic");



    private static final SubLString $$$slang = makeString("slang");



    private static final SubLString $$$formal = makeString("formal");



    private static final SubLString $$$informal = makeString("informal");



    private static final SubLString $$$baby_talk = makeString("baby talk");



    private static final SubLString $$$technical_jargon = makeString("technical jargon");



    private static final SubLString $str356$_rhetorical_device = makeString("-rhetorical-device");

    private static final SubLString $$$metaphor = makeString("metaphor");



    private static final SubLString $$$simile = makeString("simile");

    private static final SubLObject $$Simile_FigureOfSpeech = reader_make_constant_shell("Simile-FigureOfSpeech");

    private static final SubLString $$$euphemism = makeString("euphemism");







    private static final SubLString $str365$Mrs_ = makeString("Mrs.");

    private static final SubLString $$$Sir_ = makeString("Sir ");

    private static final SubLString $str367$_Jr_ = makeString(" Jr.");

    private static final SubLString $$$President_ = makeString("President ");







    private static final SubLObject $$placeName_Standard = reader_make_constant_shell("placeName-Standard");

    private static final SubLObject $$placeName_ShortForm = reader_make_constant_shell("placeName-ShortForm");





    private static final SubLString $$$ing = makeString("ing");



    private static final SubLString $$$t = makeString("t");









    private static final SubLSymbol WNI_NUMBER_OF_WORKFLOW_MAPPED_TERMS = makeSymbol("WNI-NUMBER-OF-WORKFLOW-MAPPED-TERMS");

    private static final SubLString $$$Counting_recent_WordNet_mappings = makeString("Counting recent WordNet mappings");

    private static final SubLInteger $int$20050101 = makeInteger(20050101);

    private static final SubLSymbol WNI_NUMBER_OF_NEW_CONCEPTS_IMPORTED_FROM_WORDNET = makeSymbol("WNI-NUMBER-OF-NEW-CONCEPTS-IMPORTED-FROM-WORDNET");

    private static final SubLObject $const387$WordNetWorkflowConstant_NotFullyR = reader_make_constant_shell("WordNetWorkflowConstant-NotFullyReviewed");

    private static final SubLString $str388$Counting_terms_imported_from_Word = makeString("Counting terms imported from WordNet");





    private static final SubLSymbol WNI_NUMBER_OF_NEW_DENOTATIONS_IMPORTED_FROM_WORDET = makeSymbol("WNI-NUMBER-OF-NEW-DENOTATIONS-IMPORTED-FROM-WORDET");

    private static final SubLString $str392$Counting_recent_denotations_impor = makeString("Counting recent denotations imported from WordNet");

    private static final SubLSymbol WNI_ROLE_INFO = makeSymbol("WNI-ROLE-INFO");

    private static final SubLSymbol WNI_ROLE_INFO_P = makeSymbol("WNI-ROLE-INFO-P");

    static private final SubLList $list395 = list(makeSymbol("ROLE"), makeSymbol("FILLER"), makeSymbol("DEFINING-COL"), makeSymbol("DEFINING-PRED"), makeSymbol("SUBSUMPTION-STATUS"));

    static private final SubLList $list396 = list($ROLE, makeKeyword("FILLER"), makeKeyword("DEFINING-COL"), makeKeyword("DEFINING-PRED"), makeKeyword("SUBSUMPTION-STATUS"));

    static private final SubLList $list397 = list(makeSymbol("WNI-ROLE"), makeSymbol("WNI-FILLER"), makeSymbol("WNI-DEFINING-COL"), makeSymbol("WNI-DEFINING-PRED"), makeSymbol("WNI-SUBSUMPTION-STATUS"));

    private static final SubLList $list398 = list(makeSymbol("_CSETF-WNI-ROLE"), makeSymbol("_CSETF-WNI-FILLER"), makeSymbol("_CSETF-WNI-DEFINING-COL"), makeSymbol("_CSETF-WNI-DEFINING-PRED"), makeSymbol("_CSETF-WNI-SUBSUMPTION-STATUS"));

    private static final SubLSymbol WNI_PRINT_ROLE_INFO = makeSymbol("WNI-PRINT-ROLE-INFO");

    private static final SubLSymbol WNI_ROLE_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("WNI-ROLE-INFO-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list401 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("WNI-ROLE-INFO-P"));

    private static final SubLSymbol WNI_ROLE = makeSymbol("WNI-ROLE");

    private static final SubLSymbol _CSETF_WNI_ROLE = makeSymbol("_CSETF-WNI-ROLE");

    private static final SubLSymbol WNI_FILLER = makeSymbol("WNI-FILLER");

    private static final SubLSymbol _CSETF_WNI_FILLER = makeSymbol("_CSETF-WNI-FILLER");

    private static final SubLSymbol WNI_DEFINING_COL = makeSymbol("WNI-DEFINING-COL");

    private static final SubLSymbol _CSETF_WNI_DEFINING_COL = makeSymbol("_CSETF-WNI-DEFINING-COL");

    private static final SubLSymbol WNI_DEFINING_PRED = makeSymbol("WNI-DEFINING-PRED");

    private static final SubLSymbol _CSETF_WNI_DEFINING_PRED = makeSymbol("_CSETF-WNI-DEFINING-PRED");

    private static final SubLSymbol WNI_SUBSUMPTION_STATUS = makeSymbol("WNI-SUBSUMPTION-STATUS");

    private static final SubLSymbol _CSETF_WNI_SUBSUMPTION_STATUS = makeSymbol("_CSETF-WNI-SUBSUMPTION-STATUS");

    private static final SubLString $str417$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_WNI_ROLE_INFO = makeSymbol("MAKE-WNI-ROLE-INFO");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_WNI_ROLE_INFO_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-WNI-ROLE-INFO-METHOD");

    private static final SubLString $str424$_ROLE_INFO___s__s__s__s__s_ = makeString("<ROLE-INFO: ~s ~s ~s ~s ~s>");

    private static final SubLSymbol WNI_GATHER_ROLES_AND_TRAITS = makeSymbol("WNI-GATHER-ROLES-AND-TRAITS");

    private static final SubLSymbol $sym426$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE<");

    private static final SubLSymbol WNI_FIND_COMPATIBLE_ROLES = makeSymbol("WNI-FIND-COMPATIBLE-ROLES");



    private static final SubLList $list429 = list(makeSymbol("?ROLE"), makeSymbol("?FILLER"), makeSymbol("?DEFINING-COLL"), makeSymbol("?DEFINING-PRED"));

    static private final SubLList $list430 = list(makeSymbol("?DEFINING-COLL"));

    private static final SubLList $list431 = list(reader_make_constant_shell("genls"), makeSymbol("?DEFINING-COLL"), reader_make_constant_shell("Situation"));

    static private final SubLList $list432 = list(reader_make_constant_shell("genlPreds"), makeSymbol("?DEFINING-PRED"), reader_make_constant_shell("keRelevantPreds"));

    static private final SubLList $list433 = list(reader_make_constant_shell("assertedSentence"), list(makeSymbol("?DEFINING-PRED"), makeSymbol("?DEFINING-COLL"), makeSymbol("?ROLE")));



    private static final SubLObject $$interArgIsa1_2 = reader_make_constant_shell("interArgIsa1-2");

    private static final SubLSymbol $sym436$_ROLE = makeSymbol("?ROLE");

    private static final SubLList $list437 = list(makeSymbol("?FILLER"));

    private static final SubLSymbol $sym438$_FILLER_2 = makeSymbol("?FILLER-2");

    private static final SubLList $list439 = list(makeSymbol("?FILLER-2"));

    private static final SubLList $list440 = list(list(reader_make_constant_shell("different"), makeSymbol("?FILLER-2"), makeSymbol("?FILLER")), list(reader_make_constant_shell("genls"), makeSymbol("?FILLER-2"), makeSymbol("?FILLER")));

    private static final SubLList $list441 = list(list(reader_make_constant_shell("arg2Isa"), makeSymbol("?ROLE"), makeSymbol("?FILLER")));

    private static final SubLSymbol $sym442$_COLL = makeSymbol("?COLL");

    static private final SubLList $list443 = list(list(reader_make_constant_shell("genls"), makeSymbol("?DEFINING-COLL"), reader_make_constant_shell("Situation")), list(reader_make_constant_shell("assertedSentence"), list(reader_make_constant_shell("relationAllExists"), makeSymbol("?ROLE"), makeSymbol("?DEFINING-COLL"), makeSymbol("?COLL"))), list(reader_make_constant_shell("equals"), makeSymbol("?FILLER"), makeSymbol("?COLL")), list(reader_make_constant_shell("equals"), makeSymbol("?DEFINING-PRED"), reader_make_constant_shell("relationAllExists")), list(reader_make_constant_shell("unknownSentence"), list(reader_make_constant_shell("quotedIsa"), makeSymbol("?ROLE"), reader_make_constant_shell("FormulaTemplateConstant-FactEntryTool"))));

    private static final SubLSymbol $sym444$_THING = makeSymbol("?THING");

    static private final SubLList $list445 = list(list(reader_make_constant_shell("genls"), makeSymbol("?DEFINING-COLL"), reader_make_constant_shell("Situation")), list(reader_make_constant_shell("assertedSentence"), list(reader_make_constant_shell("relationAllInstance"), makeSymbol("?ROLE"), makeSymbol("?DEFINING-COLL"), makeSymbol("?THING"))), list(reader_make_constant_shell("equals"), makeSymbol("?FILLER"), makeSymbol("?THING")), list(reader_make_constant_shell("equals"), makeSymbol("?DEFINING-PRED"), reader_make_constant_shell("relationAllInstance")), list(reader_make_constant_shell("unknownSentence"), list(reader_make_constant_shell("quotedIsa"), makeSymbol("?ROLE"), reader_make_constant_shell("FormulaTemplateConstant-FactEntryTool"))));

    private static final SubLSymbol $sym446$_ROLE2 = makeSymbol("?ROLE2");





    private static final SubLSymbol $sym449$_DEFINING_COLL = makeSymbol("?DEFINING-COLL");

    private static final SubLList $list450 = list(list(reader_make_constant_shell("equals"), makeSymbol("?DEFINING-PRED"), reader_make_constant_shell("genlPredsWRTTypes")));

    private static final SubLList $list451 = list(reader_make_constant_shell("unknownSentence"), list(reader_make_constant_shell("genls"), makeSymbol("?DEFINING-COLL"), reader_make_constant_shell("Situation")));

    private static final SubLList $list452 = list(list(reader_make_constant_shell("unknownSentence"), list(reader_make_constant_shell("genls"), makeSymbol("?DEFINING-COLL"), reader_make_constant_shell("Situation"))), list(reader_make_constant_shell("assertedSentence"), list(reader_make_constant_shell("relationAllExists"), makeSymbol("?ROLE"), makeSymbol("?DEFINING-COLL"), makeSymbol("?COLL"))), list(reader_make_constant_shell("equals"), makeSymbol("?FILLER"), makeSymbol("?COLL")), list(reader_make_constant_shell("equals"), makeSymbol("?DEFINING-PRED"), reader_make_constant_shell("relationAllExists")), list(reader_make_constant_shell("unknownSentence"), list(reader_make_constant_shell("quotedIsa"), makeSymbol("?ROLE"), reader_make_constant_shell("FormulaTemplateConstant-FactEntryTool"))));

    private static final SubLList $list453 = list(list(reader_make_constant_shell("unknownSentence"), list(reader_make_constant_shell("genls"), makeSymbol("?DEFINING-COLL"), reader_make_constant_shell("Situation"))), list(reader_make_constant_shell("assertedSentence"), list(reader_make_constant_shell("relationAllInstance"), makeSymbol("?ROLE"), makeSymbol("?DEFINING-COLL"), makeSymbol("?THING"))), list(reader_make_constant_shell("equals"), makeSymbol("?FILLER"), makeSymbol("?THING")), list(reader_make_constant_shell("equals"), makeSymbol("?DEFINING-PRED"), reader_make_constant_shell("relationAllInstance")), list(reader_make_constant_shell("unknownSentence"), list(reader_make_constant_shell("quotedIsa"), makeSymbol("?ROLE"), reader_make_constant_shell("FormulaTemplateConstant-FactEntryTool"))));

    private static final SubLString $str454$_A = makeString("~A");

    private static final SubLSymbol WNI_SORT_KEY_1 = makeSymbol("WNI-SORT-KEY-1");

    private static final SubLSymbol WNI_CLEAR_FUNCTION_CACHES = makeSymbol("WNI-CLEAR-FUNCTION-CACHES");

    private static final SubLString $str458$in_workflow_ = makeString("in-workflow?");

    private static final SubLString $$$nil = makeString("nil");

    private static final SubLString $str460$unmapped_hypernym_chain = makeString("unmapped-hypernym-chain");

    public static SubLObject initialize_wordnet_import_kb_feature() {
        if (NIL != list_utilities.every_in_list(wordnet_import.$sym1$VALID_CONSTANT_, wordnet_import.$wordnet_import_core_constants$.getGlobalValue(), UNPROVIDED)) {
            kb_control_vars.set_wordnet_import_kb_loaded();
        } else {
            kb_control_vars.unset_wordnet_import_kb_loaded();
        }
        return kb_control_vars.wordnet_import_kb_loaded_p();
    }

    public static final SubLObject clear_wni_unranked_synsets_for_english_word_string_alt() {
        {
            SubLObject cs = $wni_unranked_synsets_for_english_word_string_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_wni_unranked_synsets_for_english_word_string() {
        final SubLObject cs = wordnet_import.$wni_unranked_synsets_for_english_word_string_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_wni_unranked_synsets_for_english_word_string_alt(SubLObject word_string) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_unranked_synsets_for_english_word_string_caching_state$.getGlobalValue(), list(word_string), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_wni_unranked_synsets_for_english_word_string(final SubLObject word_string) {
        return caching_state_remove_function_results_with_args(wordnet_import.$wni_unranked_synsets_for_english_word_string_caching_state$.getGlobalValue(), list(word_string), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns the unranked list of synsets that have word-string as one of their synonym word strings.
     *
     * @param word-string
     * 		: stringp
     * @return listp : a list of naut-p synsets
     */
    @LispMethod(comment = "Returns the unranked list of synsets that have word-string as one of their synonym word strings.\r\n\r\n@param word-string\r\n\t\t: stringp\r\n@return listp : a list of naut-p synsets")
    public static final SubLObject wni_unranked_synsets_for_english_word_string_internal_alt(SubLObject word_string) {
        SubLTrampolineFile.checkType(word_string, STRINGP);
        {
            SubLObject synsets = NIL;
            SubLObject sentence = list($$wnSynsetMemberWord, $sym5$_SYNSET, list($$WordNetEnglishWordFn, word_string));
            SubLObject query_properties = $list_alt7;
            SubLObject results = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
            {
                SubLObject cdolist_list_var = results;
                SubLObject result = NIL;
                for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                    synsets = cons(result.first().rest(), synsets);
                }
            }
            {
                SubLObject list_var = synsets;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, NAUT_P);
                    }
                }
            }
            return synsets;
        }
    }

    /**
     * Returns the unranked list of synsets that have word-string as one of their synonym word strings.
     *
     * @param word-string
     * 		: stringp
     * @return listp : a list of naut-p synsets
     */
    @LispMethod(comment = "Returns the unranked list of synsets that have word-string as one of their synonym word strings.\r\n\r\n@param word-string\r\n\t\t: stringp\r\n@return listp : a list of naut-p synsets")
    public static SubLObject wni_unranked_synsets_for_english_word_string_internal(final SubLObject word_string) {
        assert NIL != stringp(word_string) : "! stringp(word_string) " + ("Types.stringp(word_string) " + "CommonSymbols.NIL != Types.stringp(word_string) ") + word_string;
        SubLObject synsets = NIL;
        final SubLObject sentence = list(wordnet_import.$$wnSynsetMemberWord, wordnet_import.$sym7$_SYNSET, list(wordnet_import.$$WordNetEnglishWordFn, word_string));
        final SubLObject query_properties = wordnet_import.$list9;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wordnet_import.wni_trace_new_cyc_query(sentence, wordnet_import.$$WordNetWorkflowCollectorMt, query_properties);
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            synsets = cons(result.first().rest(), synsets);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        final SubLObject list_var = synsets;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != narts_high.naut_p(elem) : "! narts_high.naut_p(elem) " + ("narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) ") + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return synsets;
    }

    public static final SubLObject wni_unranked_synsets_for_english_word_string_alt(SubLObject word_string) {
        {
            SubLObject caching_state = $wni_unranked_synsets_for_english_word_string_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(WNI_UNRANKED_SYNSETS_FOR_ENGLISH_WORD_STRING, $wni_unranked_synsets_for_english_word_string_caching_state$, TEN_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, word_string, $kw12$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw12$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_unranked_synsets_for_english_word_string_internal(word_string)));
                    memoization_state.caching_state_put(caching_state, word_string, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject wni_unranked_synsets_for_english_word_string(final SubLObject word_string) {
        SubLObject caching_state = wordnet_import.$wni_unranked_synsets_for_english_word_string_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(wordnet_import.WNI_UNRANKED_SYNSETS_FOR_ENGLISH_WORD_STRING, wordnet_import.$wni_unranked_synsets_for_english_word_string_caching_state$, TEN_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = caching_state_lookup(caching_state, word_string, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wordnet_import.wni_unranked_synsets_for_english_word_string_internal(word_string)));
            caching_state_put(caching_state, word_string, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    public static final SubLObject clear_wni_synsets_for_english_word_stringXpos_alt() {
        {
            SubLObject cs = $wni_synsets_for_english_word_stringXpos_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_wni_synsets_for_english_word_stringXpos() {
        final SubLObject cs = wordnet_import.$wni_synsets_for_english_word_stringXpos_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_wni_synsets_for_english_word_stringXpos_alt(SubLObject word_string, SubLObject speech_part) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_synsets_for_english_word_stringXpos_caching_state$.getGlobalValue(), list(word_string, speech_part), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_wni_synsets_for_english_word_stringXpos(final SubLObject word_string, final SubLObject speech_part) {
        return caching_state_remove_function_results_with_args(wordnet_import.$wni_synsets_for_english_word_stringXpos_caching_state$.getGlobalValue(), list(word_string, speech_part), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns the ranked list of synsets that have word-string as one of their POS synonym word strings. Synsets
     * appear in the order of their word sense for the given WORD-STRING, thus more frequently used
     * synsets should appear first.
     *
     * @param word-string
     * 		: stringp
     * @param speech-part
     * 		; fort-p (e.g. #$Noun)
     * @return listp : a list of naut-p synsets
     */
    @LispMethod(comment = "Returns the ranked list of synsets that have word-string as one of their POS synonym word strings. Synsets\r\nappear in the order of their word sense for the given WORD-STRING, thus more frequently used\r\nsynsets should appear first.\r\n\r\n@param word-string\r\n\t\t: stringp\r\n@param speech-part\r\n\t\t; fort-p (e.g. #$Noun)\r\n@return listp : a list of naut-p synsets\nReturns the ranked list of synsets that have word-string as one of their POS synonym word strings. Synsets\nappear in the order of their word sense for the given WORD-STRING, thus more frequently used\nsynsets should appear first.")
    public static final SubLObject wni_synsets_for_english_word_stringXpos_internal_alt(SubLObject word_string, SubLObject speech_part) {
        SubLTrampolineFile.checkType(word_string, STRINGP);
        {
            SubLObject synsets = NIL;
            SubLObject pos = Strings.string_downcase(alist_lookup_without_values($wni_1_char_pos_map$.getGlobalValue(), speech_part, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            SubLObject sql_query = cconcatenate($str_alt14$select_synset_id_from_WordSense_w, new SubLObject[]{ word_string, $str_alt15$__and_pos____, pos, $str_alt16$__order_by_word_sense });
            SubLObject rs = NIL;
            SubLObject statement = NIL;
            SubLObject connection = NIL;
            try {
                connection = sdbc.new_sql_connection(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_db(), com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_user(), com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_password(), list(new SubLObject[]{ $DBMS_SERVER, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_server(), $PORT, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_proxy_port(), $SUBPROTOCOL, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_subprotocol(), $PROXY_SERVER, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_proxy_server(), $TIMEOUT, THREE_INTEGER }));
                if (NIL != sdbc.sql_open_connection_p(connection)) {
                    statement = sdbc.sqlc_create_statement(connection);
                } else {
                    statement = connection;
                }
                if (NIL != sdbc.sql_open_statement_p(statement)) {
                    rs = sdbc.sqls_execute_query(statement, sql_query, UNPROVIDED);
                } else {
                    rs = statement;
                }
                if (NIL != sdbc.sql_result_set_p(rs)) {
                    while (NIL != sdbc.sqlrs_next(rs)) {
                        synsets = cons(list($$WordNetSynsetFn, sdbc.sqlrs_get_object(rs, ONE_INTEGER)), synsets);
                    } 
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (NIL != sdbc.sql_connection_p(connection)) {
                            sdbc.sqlc_close(connection);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            synsets = nreverse(synsets);
            {
                SubLObject list_var = synsets;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, NAUT_P);
                    }
                }
            }
            return synsets;
        }
    }

    /**
     * Returns the ranked list of synsets that have word-string as one of their POS synonym word strings. Synsets
     * appear in the order of their word sense for the given WORD-STRING, thus more frequently used
     * synsets should appear first.
     *
     * @param word-string
     * 		: stringp
     * @param speech-part
     * 		; fort-p (e.g. #$Noun)
     * @return listp : a list of naut-p synsets
     */
    @LispMethod(comment = "Returns the ranked list of synsets that have word-string as one of their POS synonym word strings. Synsets\r\nappear in the order of their word sense for the given WORD-STRING, thus more frequently used\r\nsynsets should appear first.\r\n\r\n@param word-string\r\n\t\t: stringp\r\n@param speech-part\r\n\t\t; fort-p (e.g. #$Noun)\r\n@return listp : a list of naut-p synsets\nReturns the ranked list of synsets that have word-string as one of their POS synonym word strings. Synsets\nappear in the order of their word sense for the given WORD-STRING, thus more frequently used\nsynsets should appear first.")
    public static SubLObject wni_synsets_for_english_word_stringXpos_internal(final SubLObject word_string, final SubLObject speech_part) {
        assert NIL != stringp(word_string) : "! stringp(word_string) " + ("Types.stringp(word_string) " + "CommonSymbols.NIL != Types.stringp(word_string) ") + word_string;
        SubLObject synsets = NIL;
        final SubLObject pos = Strings.string_downcase(list_utilities.alist_lookup_without_values(wordnet_import.$wni_1_char_pos_map$.getGlobalValue(), speech_part, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        final SubLObject sql_query = cconcatenate(wordnet_import.$str15$select_synset_id_from_WordSense_w, new SubLObject[]{ word_string, wordnet_import.$str16$__and_pos____, pos, wordnet_import.$str17$__order_by_word_sense });
        SubLObject rs = NIL;
        SubLObject statement = NIL;
        SubLObject connection = NIL;
        try {
            connection = new_sql_connection(wordnet_import.wni_access_path_db(), wordnet_import.wni_access_path_user(), wordnet_import.wni_access_path_password(), list(new SubLObject[]{ $DBMS_SERVER, wordnet_import.wni_access_path_server(), $PORT, wordnet_import.wni_access_path_proxy_port(), $SUBPROTOCOL, wordnet_import.wni_access_path_subprotocol(), $PROXY_SERVER, wordnet_import.wni_access_path_proxy_server(), $TIMEOUT, THREE_INTEGER }));
            if (NIL != sql_open_connection_p(connection)) {
                statement = sqlc_create_statement(connection);
            } else {
                statement = connection;
            }
            if (NIL != sql_open_statement_p(statement)) {
                rs = sqls_execute_query(statement, sql_query, UNPROVIDED);
            } else {
                rs = statement;
            }
            if (NIL != sql_result_set_p(rs)) {
                while (NIL != sqlrs_next(rs)) {
                    synsets = cons(list(wordnet_import.$$WordNetSynsetFn, sqlrs_get_object(rs, ONE_INTEGER)), synsets);
                } 
            }
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (NIL != sql_connection_p(connection)) {
                    sqlc_close(connection);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        final SubLObject list_var;
        synsets = list_var = nreverse(synsets);
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != narts_high.naut_p(elem) : "! narts_high.naut_p(elem) " + ("narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return synsets;
    }

    public static final SubLObject wni_synsets_for_english_word_stringXpos_alt(SubLObject word_string, SubLObject speech_part) {
        {
            SubLObject caching_state = $wni_synsets_for_english_word_stringXpos_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym13$WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_POS, $sym23$_WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_POS_CACHING_STATE_, TEN_INTEGER, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(word_string, speech_part);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw12$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (word_string.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && speech_part.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synsets_for_english_word_stringXpos_internal(word_string, speech_part)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(word_string, speech_part));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject wni_synsets_for_english_word_stringXpos(final SubLObject word_string, final SubLObject speech_part) {
        SubLObject caching_state = wordnet_import.$wni_synsets_for_english_word_stringXpos_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(wordnet_import.$sym14$WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_POS, wordnet_import.$sym24$_WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_POS_CACHING_STATE_, TEN_INTEGER, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = sxhash_calc_2(word_string, speech_part);
        final SubLObject collisions = caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql($memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (word_string.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && speech_part.equal(cached_args.first())) {
                        return caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(wordnet_import.wni_synsets_for_english_word_stringXpos_internal(word_string, speech_part)));
        caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(word_string, speech_part));
        return caching_results(results3);
    }

    public static final SubLObject clear_wni_synsets_for_english_word_string_alt() {
        {
            SubLObject cs = $wni_synsets_for_english_word_string_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_wni_synsets_for_english_word_string() {
        final SubLObject cs = wordnet_import.$wni_synsets_for_english_word_string_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_wni_synsets_for_english_word_string_alt(SubLObject word_string) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_synsets_for_english_word_string_caching_state$.getGlobalValue(), list(word_string), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_wni_synsets_for_english_word_string(final SubLObject word_string) {
        return caching_state_remove_function_results_with_args(wordnet_import.$wni_synsets_for_english_word_string_caching_state$.getGlobalValue(), list(word_string), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns the ranked list of synsets that have word-string as one of their synonym word strings. Synsets
     * appear in the order of their word sense for the given WORD-STRING, thus more frequently used
     * synsets should appear first.
     *
     * @param word-string
     * 		: stringp
     * @return listp : a list of naut-p synsets
     */
    @LispMethod(comment = "Returns the ranked list of synsets that have word-string as one of their synonym word strings. Synsets\r\nappear in the order of their word sense for the given WORD-STRING, thus more frequently used\r\nsynsets should appear first.\r\n\r\n@param word-string\r\n\t\t: stringp\r\n@return listp : a list of naut-p synsets\nReturns the ranked list of synsets that have word-string as one of their synonym word strings. Synsets\nappear in the order of their word sense for the given WORD-STRING, thus more frequently used\nsynsets should appear first.")
    public static final SubLObject wni_synsets_for_english_word_string_internal_alt(SubLObject word_string) {
        SubLTrampolineFile.checkType(word_string, STRINGP);
        if (NIL == sksi_infrastructure_utilities.sk_source_registeredP($const25$WordNet2_0_KS, UNPROVIDED)) {
            return NIL;
        }
        {
            SubLObject synsets = NIL;
            SubLObject sql_query = cconcatenate($str_alt14$select_synset_id_from_WordSense_w, new SubLObject[]{ word_string, $str_alt26$__order_by_pos__word_sense });
            SubLObject rs = NIL;
            SubLObject statement = NIL;
            SubLObject connection = NIL;
            try {
                connection = sdbc.new_sql_connection(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_db(), com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_user(), com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_password(), list(new SubLObject[]{ $DBMS_SERVER, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_server(), $PORT, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_proxy_port(), $SUBPROTOCOL, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_subprotocol(), $PROXY_SERVER, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_proxy_server(), $TIMEOUT, THREE_INTEGER }));
                if (NIL != sdbc.sql_open_connection_p(connection)) {
                    statement = sdbc.sqlc_create_statement(connection);
                } else {
                    statement = connection;
                }
                if (NIL != sdbc.sql_open_statement_p(statement)) {
                    rs = sdbc.sqls_execute_query(statement, sql_query, UNPROVIDED);
                } else {
                    rs = statement;
                }
                if (NIL != sdbc.sql_result_set_p(rs)) {
                    while (NIL != sdbc.sqlrs_next(rs)) {
                        synsets = cons(list($$WordNetSynsetFn, sdbc.sqlrs_get_object(rs, ONE_INTEGER)), synsets);
                    } 
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (NIL != sdbc.sql_connection_p(connection)) {
                            sdbc.sqlc_close(connection);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            synsets = nreverse(synsets);
            {
                SubLObject list_var = synsets;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, NAUT_P);
                    }
                }
            }
            return synsets;
        }
    }

    /**
     * Returns the ranked list of synsets that have word-string as one of their synonym word strings. Synsets
     * appear in the order of their word sense for the given WORD-STRING, thus more frequently used
     * synsets should appear first.
     *
     * @param word-string
     * 		: stringp
     * @return listp : a list of naut-p synsets
     */
    @LispMethod(comment = "Returns the ranked list of synsets that have word-string as one of their synonym word strings. Synsets\r\nappear in the order of their word sense for the given WORD-STRING, thus more frequently used\r\nsynsets should appear first.\r\n\r\n@param word-string\r\n\t\t: stringp\r\n@return listp : a list of naut-p synsets\nReturns the ranked list of synsets that have word-string as one of their synonym word strings. Synsets\nappear in the order of their word sense for the given WORD-STRING, thus more frequently used\nsynsets should appear first.")
    public static SubLObject wni_synsets_for_english_word_string_internal(final SubLObject word_string) {
        assert NIL != stringp(word_string) : "! stringp(word_string) " + ("Types.stringp(word_string) " + "CommonSymbols.NIL != Types.stringp(word_string) ") + word_string;
        if (NIL == sk_source_registeredP(wordnet_import.$const26$WordNet2_0_KS, UNPROVIDED)) {
            return NIL;
        }
        SubLObject synsets = NIL;
        final SubLObject sql_query = cconcatenate(wordnet_import.$str15$select_synset_id_from_WordSense_w, new SubLObject[]{ word_string, wordnet_import.$str27$__order_by_pos__word_sense });
        SubLObject rs = NIL;
        SubLObject statement = NIL;
        SubLObject connection = NIL;
        try {
            connection = new_sql_connection(wordnet_import.wni_access_path_db(), wordnet_import.wni_access_path_user(), wordnet_import.wni_access_path_password(), list(new SubLObject[]{ $DBMS_SERVER, wordnet_import.wni_access_path_server(), $PORT, wordnet_import.wni_access_path_proxy_port(), $SUBPROTOCOL, wordnet_import.wni_access_path_subprotocol(), $PROXY_SERVER, wordnet_import.wni_access_path_proxy_server(), $TIMEOUT, THREE_INTEGER }));
            if (NIL != sql_open_connection_p(connection)) {
                statement = sqlc_create_statement(connection);
            } else {
                statement = connection;
            }
            if (NIL != sql_open_statement_p(statement)) {
                rs = sqls_execute_query(statement, sql_query, UNPROVIDED);
            } else {
                rs = statement;
            }
            if (NIL != sql_result_set_p(rs)) {
                while (NIL != sqlrs_next(rs)) {
                    synsets = cons(list(wordnet_import.$$WordNetSynsetFn, sqlrs_get_object(rs, ONE_INTEGER)), synsets);
                } 
            }
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (NIL != sql_connection_p(connection)) {
                    sqlc_close(connection);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        final SubLObject list_var;
        synsets = list_var = nreverse(synsets);
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != narts_high.naut_p(elem) : "! narts_high.naut_p(elem) " + ("narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return synsets;
    }

    public static final SubLObject wni_synsets_for_english_word_string_alt(SubLObject word_string) {
        {
            SubLObject caching_state = $wni_synsets_for_english_word_string_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(WNI_SYNSETS_FOR_ENGLISH_WORD_STRING, $wni_synsets_for_english_word_string_caching_state$, TEN_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, word_string, $kw12$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw12$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synsets_for_english_word_string_internal(word_string)));
                    memoization_state.caching_state_put(caching_state, word_string, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject wni_synsets_for_english_word_string(final SubLObject word_string) {
        SubLObject caching_state = wordnet_import.$wni_synsets_for_english_word_string_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(wordnet_import.WNI_SYNSETS_FOR_ENGLISH_WORD_STRING, wordnet_import.$wni_synsets_for_english_word_string_caching_state$, TEN_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = caching_state_lookup(caching_state, word_string, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wordnet_import.wni_synsets_for_english_word_string_internal(word_string)));
            caching_state_put(caching_state, word_string, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    public static final SubLObject clear_wni_synset_collectionP_alt() {
        {
            SubLObject cs = $wni_synset_collectionP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_wni_synset_collectionP() {
        final SubLObject cs = wordnet_import.$wni_synset_collectionP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_wni_synset_collectionP_alt(SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_synset_collectionP_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_wni_synset_collectionP(final SubLObject synset) {
        return caching_state_remove_function_results_with_args(wordnet_import.$wni_synset_collectionP_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns T iff the given synset is a collection.
     *
     * @param synset
     * 		: naut-p
     * @return booleanp
     */
    @LispMethod(comment = "Returns T iff the given synset is a collection.\r\n\r\n@param synset\r\n\t\t: naut-p\r\n@return booleanp")
    public static final SubLObject wni_synset_collectionP_internal_alt(SubLObject synset) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        {
            SubLObject v_term = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_term(synset);
            if (NIL != v_term) {
                return fort_types_interface.collectionP(v_term);
            }
            {
                SubLObject reified_synset = czer_main.canonicalize_term(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_reifiable_synset(synset), UNPROVIDED);
                if (NIL != nart_handles.nart_p(reified_synset)) {
                    return makeBoolean(NIL == isa.isaP(reified_synset, $const29$WordNetSynsetImportStatus_Determi, $$WordNetWorkflowDataStatusMt, UNPROVIDED));
                } else {
                    return T;
                }
            }
        }
    }

    /**
     * Returns T iff the given synset is a collection.
     *
     * @param synset
     * 		: naut-p
     * @return booleanp
     */
    @LispMethod(comment = "Returns T iff the given synset is a collection.\r\n\r\n@param synset\r\n\t\t: naut-p\r\n@return booleanp")
    public static SubLObject wni_synset_collectionP_internal(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        final SubLObject v_term = wordnet_import.wni_synset_term(synset);
        if (NIL != v_term) {
            return collectionP(v_term);
        }
        final SubLObject reified_synset = canonicalize_term(wordnet_import.wni_reifiable_synset(synset), UNPROVIDED);
        if (NIL != nart_p(reified_synset)) {
            return makeBoolean(NIL == isaP(reified_synset, wordnet_import.$const30$WordNetSynsetImportStatus_Determi, wordnet_import.$$WordNetWorkflowDataStatusMt, UNPROVIDED));
        }
        return T;
    }

    public static final SubLObject wni_synset_collectionP_alt(SubLObject synset) {
        {
            SubLObject caching_state = $wni_synset_collectionP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym28$WNI_SYNSET_COLLECTION_, $sym31$_WNI_SYNSET_COLLECTION__CACHING_STATE_, TEN_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, $kw12$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw12$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_collectionP_internal(synset)));
                    memoization_state.caching_state_put(caching_state, synset, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject wni_synset_collectionP(final SubLObject synset) {
        SubLObject caching_state = wordnet_import.$wni_synset_collectionP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(wordnet_import.$sym29$WNI_SYNSET_COLLECTION_, wordnet_import.$sym32$_WNI_SYNSET_COLLECTION__CACHING_STATE_, TEN_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = caching_state_lookup(caching_state, synset, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wordnet_import.wni_synset_collectionP_internal(synset)));
            caching_state_put(caching_state, synset, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    /**
     * Returns a list of the synsets that are determined individuals.
     *
     * @return listp
     */
    @LispMethod(comment = "Returns a list of the synsets that are determined individuals.\r\n\r\n@return listp")
    public static final SubLObject wni_synset_individuals_alt() {
        {
            SubLObject individual_synsets = Mapping.mapcar(WNI_UNREIFIED_SYNSET, isa.instances($const29$WordNetSynsetImportStatus_Determi, $$WordNetWorkflowDataStatusMt, UNPROVIDED));
            SubLObject list_var = individual_synsets;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, NAUT_P);
                }
            }
            return individual_synsets;
        }
    }

    /**
     * Returns a list of the synsets that are determined individuals.
     *
     * @return listp
     */
    @LispMethod(comment = "Returns a list of the synsets that are determined individuals.\r\n\r\n@return listp")
    public static SubLObject wni_synset_individuals() {
        final SubLObject list_var;
        final SubLObject individual_synsets = list_var = Mapping.mapcar(wordnet_import.WNI_UNREIFIED_SYNSET, instances(wordnet_import.$const30$WordNetSynsetImportStatus_Determi, wordnet_import.$$WordNetWorkflowDataStatusMt, UNPROVIDED));
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != narts_high.naut_p(elem) : "! narts_high.naut_p(elem) " + ("narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return individual_synsets;
    }

    /**
     * Returns the given list of synsets after removing those that have a hypernym mapped to a spec term of #$Situation.
     *
     * @param synsets
     * 		; list of naut-p
     * @return listp
     */
    @LispMethod(comment = "Returns the given list of synsets after removing those that have a hypernym mapped to a spec term of #$Situation.\r\n\r\n@param synsets\r\n\t\t; list of naut-p\r\n@return listp")
    public static final SubLObject wni_exclude_situations_alt(SubLObject synsets) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject list_var = synsets;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, NAUT_P);
                    }
                }
            }
            {
                SubLObject non_situation_synsets = NIL;
                SubLObject list_var = synsets;
                $progress_note$.setDynamicValue($str_alt35$excluding_specs_of___Situation, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(length(list_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject csome_list_var = list_var;
                            SubLObject synset = NIL;
                            for (synset = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , synset = csome_list_var.first()) {
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                if (NIL == genls.any_specP($$Situation, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_hypernym_terms(synset), UNPROVIDED, UNPROVIDED)) {
                                    non_situation_synsets = cons(synset, non_situation_synsets);
                                }
                                force_output(UNPROVIDED);
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                non_situation_synsets = nreverse(non_situation_synsets);
                {
                    SubLObject list_var_1 = non_situation_synsets;
                    SubLTrampolineFile.checkType(list_var_1, NON_DOTTED_LIST_P);
                    {
                        SubLObject cdolist_list_var = list_var_1;
                        SubLObject elem = NIL;
                        for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                            SubLTrampolineFile.checkType(elem, NAUT_P);
                        }
                    }
                }
                return non_situation_synsets;
            }
        }
    }

    /**
     * Returns the given list of synsets after removing those that have a hypernym mapped to a spec term of #$Situation.
     *
     * @param synsets
     * 		; list of naut-p
     * @return listp
     */
    @LispMethod(comment = "Returns the given list of synsets after removing those that have a hypernym mapped to a spec term of #$Situation.\r\n\r\n@param synsets\r\n\t\t; list of naut-p\r\n@return listp")
    public static SubLObject wni_exclude_situations(final SubLObject synsets) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != list_utilities.non_dotted_list_p(synsets) : "! list_utilities.non_dotted_list_p(synsets) " + ("list_utilities.non_dotted_list_p(synsets) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(synsets) ") + synsets;
        SubLObject cdolist_list_var = synsets;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != narts_high.naut_p(elem) : "! narts_high.naut_p(elem) " + ("narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject non_situation_synsets = NIL;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(wordnet_import.$str36$excluding_specs_of___Situation, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(synsets), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = synsets;
                SubLObject synset = NIL;
                synset = csome_list_var.first();
                while (NIL != csome_list_var) {
                    if (NIL == any_specP(wordnet_import.$$Situation, wordnet_import.wni_hypernym_terms(synset), UNPROVIDED, UNPROVIDED)) {
                        non_situation_synsets = cons(synset, non_situation_synsets);
                    }
                    force_output(UNPROVIDED);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    synset = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        final SubLObject list_var_$2;
        non_situation_synsets = list_var_$2 = nreverse(non_situation_synsets);
        assert NIL != list_utilities.non_dotted_list_p(list_var_$2) : "! list_utilities.non_dotted_list_p(list_var_$2) " + ("list_utilities.non_dotted_list_p(list_var_$2) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var_$2) ") + list_var_$2;
        SubLObject cdolist_list_var2 = list_var_$2;
        SubLObject elem2 = NIL;
        elem2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != narts_high.naut_p(elem2) : "! narts_high.naut_p(elem2) " + ("narts_high.naut_p(elem2) " + "CommonSymbols.NIL != narts_high.naut_p(elem2) ") + elem2;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem2 = cdolist_list_var2.first();
        } 
        return non_situation_synsets;
    }

    /**
     * Returns the given list of synsets after removing those that have a hypernym mapped to a spec term of #$Relation.
     *
     * @param synsets
     * 		; list of naut-p
     * @return listp
     */
    @LispMethod(comment = "Returns the given list of synsets after removing those that have a hypernym mapped to a spec term of #$Relation.\r\n\r\n@param synsets\r\n\t\t; list of naut-p\r\n@return listp")
    public static final SubLObject wni_exclude_relations_alt(SubLObject synsets) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject list_var = synsets;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, NAUT_P);
                    }
                }
            }
            {
                SubLObject non_relation_synsets = NIL;
                SubLObject list_var = synsets;
                $progress_note$.setDynamicValue($str_alt38$excluding_specs_of___Relation, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(length(list_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject csome_list_var = list_var;
                            SubLObject synset = NIL;
                            for (synset = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , synset = csome_list_var.first()) {
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                if (NIL == genls.any_specP($$Relation, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_hypernym_terms(synset), UNPROVIDED, UNPROVIDED)) {
                                    non_relation_synsets = cons(synset, non_relation_synsets);
                                }
                                force_output(UNPROVIDED);
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                non_relation_synsets = nreverse(non_relation_synsets);
                {
                    SubLObject list_var_2 = non_relation_synsets;
                    SubLTrampolineFile.checkType(list_var_2, NON_DOTTED_LIST_P);
                    {
                        SubLObject cdolist_list_var = list_var_2;
                        SubLObject elem = NIL;
                        for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                            SubLTrampolineFile.checkType(elem, NAUT_P);
                        }
                    }
                }
                return non_relation_synsets;
            }
        }
    }

    /**
     * Returns the given list of synsets after removing those that have a hypernym mapped to a spec term of #$Relation.
     *
     * @param synsets
     * 		; list of naut-p
     * @return listp
     */
    @LispMethod(comment = "Returns the given list of synsets after removing those that have a hypernym mapped to a spec term of #$Relation.\r\n\r\n@param synsets\r\n\t\t; list of naut-p\r\n@return listp")
    public static SubLObject wni_exclude_relations(final SubLObject synsets) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != list_utilities.non_dotted_list_p(synsets) : "! list_utilities.non_dotted_list_p(synsets) " + ("list_utilities.non_dotted_list_p(synsets) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(synsets) ") + synsets;
        SubLObject cdolist_list_var = synsets;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != narts_high.naut_p(elem) : "! narts_high.naut_p(elem) " + ("narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject non_relation_synsets = NIL;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(wordnet_import.$str40$excluding_specs_of___Relation, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(synsets), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = synsets;
                SubLObject synset = NIL;
                synset = csome_list_var.first();
                while (NIL != csome_list_var) {
                    if (NIL == any_specP(wordnet_import.$$Relation, wordnet_import.wni_hypernym_terms(synset), UNPROVIDED, UNPROVIDED)) {
                        non_relation_synsets = cons(synset, non_relation_synsets);
                    }
                    force_output(UNPROVIDED);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    synset = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        final SubLObject list_var_$4;
        non_relation_synsets = list_var_$4 = nreverse(non_relation_synsets);
        assert NIL != list_utilities.non_dotted_list_p(list_var_$4) : "! list_utilities.non_dotted_list_p(list_var_$4) " + ("list_utilities.non_dotted_list_p(list_var_$4) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var_$4) ") + list_var_$4;
        SubLObject cdolist_list_var2 = list_var_$4;
        SubLObject elem2 = NIL;
        elem2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != narts_high.naut_p(elem2) : "! narts_high.naut_p(elem2) " + ("narts_high.naut_p(elem2) " + "CommonSymbols.NIL != narts_high.naut_p(elem2) ") + elem2;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem2 = cdolist_list_var2.first();
        } 
        return non_relation_synsets;
    }

    /**
     * Returns the given list of synsets after removing those that have a skipped workflow status.
     *
     * @param synsets
     * 		; list of naut-p
     * @return listp
     */
    @LispMethod(comment = "Returns the given list of synsets after removing those that have a skipped workflow status.\r\n\r\n@param synsets\r\n\t\t; list of naut-p\r\n@return listp")
    public static final SubLObject wni_exclude_skipped_alt(SubLObject synsets) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject list_var = synsets;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, NAUT_P);
                    }
                }
            }
            {
                SubLObject non_skipped_synsets = NIL;
                SubLObject list_var = synsets;
                $progress_note$.setDynamicValue($$$excluding_skipped_synsets, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(length(list_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject csome_list_var = list_var;
                            SubLObject synset = NIL;
                            for (synset = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , synset = csome_list_var.first()) {
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                if (NIL == isa.isaP(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_reifiable_synset(synset), $$WordNetSynsetImportStatus_Skip, $$WordNetWorkflowCollectorMt, UNPROVIDED)) {
                                    non_skipped_synsets = cons(synset, non_skipped_synsets);
                                }
                                force_output(UNPROVIDED);
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                non_skipped_synsets = nreverse(non_skipped_synsets);
                {
                    SubLObject list_var_3 = non_skipped_synsets;
                    SubLTrampolineFile.checkType(list_var_3, NON_DOTTED_LIST_P);
                    {
                        SubLObject cdolist_list_var = list_var_3;
                        SubLObject elem = NIL;
                        for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                            SubLTrampolineFile.checkType(elem, NAUT_P);
                        }
                    }
                }
                return non_skipped_synsets;
            }
        }
    }

    /**
     * Returns the given list of synsets after removing those that have a skipped workflow status.
     *
     * @param synsets
     * 		; list of naut-p
     * @return listp
     */
    @LispMethod(comment = "Returns the given list of synsets after removing those that have a skipped workflow status.\r\n\r\n@param synsets\r\n\t\t; list of naut-p\r\n@return listp")
    public static SubLObject wni_exclude_skipped(final SubLObject synsets) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != list_utilities.non_dotted_list_p(synsets) : "! list_utilities.non_dotted_list_p(synsets) " + ("list_utilities.non_dotted_list_p(synsets) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(synsets) ") + synsets;
        SubLObject cdolist_list_var = synsets;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != narts_high.naut_p(elem) : "! narts_high.naut_p(elem) " + ("narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject non_skipped_synsets = NIL;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(wordnet_import.$$$excluding_skipped_synsets, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(synsets), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = synsets;
                SubLObject synset = NIL;
                synset = csome_list_var.first();
                while (NIL != csome_list_var) {
                    if (NIL == isaP(wordnet_import.wni_reifiable_synset(synset), wordnet_import.$$WordNetSynsetImportStatus_Skip, wordnet_import.$$WordNetWorkflowCollectorMt, UNPROVIDED)) {
                        non_skipped_synsets = cons(synset, non_skipped_synsets);
                    }
                    force_output(UNPROVIDED);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    synset = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        final SubLObject list_var_$6;
        non_skipped_synsets = list_var_$6 = nreverse(non_skipped_synsets);
        assert NIL != list_utilities.non_dotted_list_p(list_var_$6) : "! list_utilities.non_dotted_list_p(list_var_$6) " + ("list_utilities.non_dotted_list_p(list_var_$6) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var_$6) ") + list_var_$6;
        SubLObject cdolist_list_var2 = list_var_$6;
        SubLObject elem2 = NIL;
        elem2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != narts_high.naut_p(elem2) : "! narts_high.naut_p(elem2) " + ("narts_high.naut_p(elem2) " + "CommonSymbols.NIL != narts_high.naut_p(elem2) ") + elem2;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem2 = cdolist_list_var2.first();
        } 
        return non_skipped_synsets;
    }

    /**
     * Returns the synset id n...n of the given synset having the form (#$WordNetSynsetFn n...n).
     *
     * @param synset
     * 		; naut-p
     * @return integerp
     */
    @LispMethod(comment = "Returns the synset id n...n of the given synset having the form (#$WordNetSynsetFn n...n).\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return integerp")
    public static final SubLObject wni_synset_id_alt(SubLObject synset) {
        SubLTrampolineFile.checkType(synset, POSSIBLY_NAUT_P);
        {
            SubLObject synset_id = second(synset);
            SubLTrampolineFile.checkType(synset_id, INTEGERP);
            return synset_id;
        }
    }

    /**
     * Returns the synset id n...n of the given synset having the form (#$WordNetSynsetFn n...n).
     *
     * @param synset
     * 		; naut-p
     * @return integerp
     */
    @LispMethod(comment = "Returns the synset id n...n of the given synset having the form (#$WordNetSynsetFn n...n).\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return integerp")
    public static SubLObject wni_synset_id(final SubLObject synset) {
        assert NIL != possibly_naut_p(synset) : "! el_utilities.possibly_naut_p(synset) " + ("el_utilities.possibly_naut_p(synset) " + "CommonSymbols.NIL != el_utilities.possibly_naut_p(synset) ") + synset;
        final SubLObject synset_id = second(synset);
        assert NIL != integerp(synset_id) : "! integerp(synset_id) " + ("Types.integerp(synset_id) " + "CommonSymbols.NIL != Types.integerp(synset_id) ") + synset_id;
        return synset_id;
    }

    /**
     * Returns a list of strings which are the ordered words in the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p
     * @return listp ; a list of strings
     */
    @LispMethod(comment = "Returns a list of strings which are the ordered words in the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp ; a list of strings")
    public static final SubLObject wni_synset_words_alt(SubLObject synset) {
        return com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_words_helper(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_ensure_naut(synset));
    }

    /**
     * Returns a list of strings which are the ordered words in the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p
     * @return listp ; a list of strings
     */
    @LispMethod(comment = "Returns a list of strings which are the ordered words in the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp ; a list of strings")
    public static SubLObject wni_synset_words(final SubLObject synset) {
        return wordnet_import.wni_synset_words_helper(wordnet_import.wni_ensure_naut(synset));
    }

    /**
     * Returns T iff the synsets are equal without regard to naut or nart form.
     */
    @LispMethod(comment = "Returns T iff the synsets are equal without regard to naut or nart form.")
    public static final SubLObject wni_synsets_equal_alt(SubLObject synset_1, SubLObject synset_2) {
        return equal(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_ensure_naut(synset_1), com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_ensure_naut(synset_2));
    }

    /**
     * Returns T iff the synsets are equal without regard to naut or nart form.
     */
    @LispMethod(comment = "Returns T iff the synsets are equal without regard to naut or nart form.")
    public static SubLObject wni_synsets_equal(final SubLObject synset_1, final SubLObject synset_2) {
        return equal(wordnet_import.wni_ensure_naut(synset_1), wordnet_import.wni_ensure_naut(synset_2));
    }

    public static final SubLObject clear_wni_synset_words_helper_alt() {
        {
            SubLObject cs = $wni_synset_words_helper_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_wni_synset_words_helper() {
        final SubLObject cs = wordnet_import.$wni_synset_words_helper_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_wni_synset_words_helper_alt(SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_synset_words_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_wni_synset_words_helper(final SubLObject synset) {
        return caching_state_remove_function_results_with_args(wordnet_import.$wni_synset_words_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns a list of strings which are the ordered words in the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p
     * @return listp ; a list of strings
     */
    @LispMethod(comment = "Returns a list of strings which are the ordered words in the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp ; a list of strings")
    public static final SubLObject wni_synset_words_helper_internal_alt(SubLObject synset) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        {
            SubLObject words_and_indices = NIL;
            SubLObject words = NIL;
            SubLObject sentence = list($$thereExists, $sym50$_POS, list($$thereExists, $sym51$_SENSE, listS($$wnSynsetWord, synset, $list_alt53)));
            SubLObject query_properties = $list_alt7;
            SubLObject results = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
            {
                SubLObject cdolist_list_var = results;
                SubLObject result = NIL;
                for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                    words_and_indices = cons(list(result.first().rest(), second(result).rest()), words_and_indices);
                }
            }
            {
                SubLObject cdolist_list_var = Sort.sort(words_and_indices, symbol_function($sym54$_), symbol_function(SECOND));
                SubLObject word_and_index = NIL;
                for (word_and_index = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word_and_index = cdolist_list_var.first()) {
                    words = cons(word_and_index.first(), words);
                }
            }
            words = nreverse(words);
            {
                SubLObject list_var = words;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, STRINGP);
                    }
                }
            }
            return words;
        }
    }

    /**
     * Returns a list of strings which are the ordered words in the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p
     * @return listp ; a list of strings
     */
    @LispMethod(comment = "Returns a list of strings which are the ordered words in the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp ; a list of strings")
    public static SubLObject wni_synset_words_helper_internal(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        SubLObject words_and_indices = NIL;
        SubLObject words = NIL;
        final SubLObject sentence = list(wordnet_import.$$thereExists, wordnet_import.$sym52$_POS, list(wordnet_import.$$thereExists, wordnet_import.$sym53$_SENSE, listS(wordnet_import.$$wnSynsetWord, synset, wordnet_import.$list55)));
        final SubLObject query_properties = wordnet_import.$list9;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wordnet_import.wni_trace_new_cyc_query(sentence, wordnet_import.$$WordNetWorkflowCollectorMt, query_properties);
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            words_and_indices = cons(list(result.first().rest(), second(result).rest()), words_and_indices);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        cdolist_list_var = Sort.sort(words_and_indices, symbol_function(wordnet_import.$sym56$_), symbol_function(SECOND));
        SubLObject word_and_index = NIL;
        word_and_index = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            words = cons(word_and_index.first(), words);
            cdolist_list_var = cdolist_list_var.rest();
            word_and_index = cdolist_list_var.first();
        } 
        final SubLObject list_var;
        words = list_var = nreverse(words);
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != stringp(elem) : "! stringp(elem) " + ("Types.stringp(elem) " + "CommonSymbols.NIL != Types.stringp(elem) ") + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return words;
    }

    public static final SubLObject wni_synset_words_helper_alt(SubLObject synset) {
        {
            SubLObject caching_state = $wni_synset_words_helper_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(WNI_SYNSET_WORDS_HELPER, $wni_synset_words_helper_caching_state$, TEN_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, $kw12$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw12$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_words_helper_internal(synset)));
                    memoization_state.caching_state_put(caching_state, synset, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject wni_synset_words_helper(final SubLObject synset) {
        SubLObject caching_state = wordnet_import.$wni_synset_words_helper_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(wordnet_import.WNI_SYNSET_WORDS_HELPER, wordnet_import.$wni_synset_words_helper_caching_state$, TEN_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = caching_state_lookup(caching_state, synset, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wordnet_import.wni_synset_words_helper_internal(synset)));
            caching_state_put(caching_state, synset, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    /**
     * Returns a list of strings which are the ordered example phrases for the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p
     * @return listp ; a list of strings
     */
    @LispMethod(comment = "Returns a list of strings which are the ordered example phrases for the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp ; a list of strings")
    public static final SubLObject wni_synset_example_phrases_alt(SubLObject synset) {
        return com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_example_phrases_helper(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_ensure_naut(synset));
    }

    /**
     * Returns a list of strings which are the ordered example phrases for the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p
     * @return listp ; a list of strings
     */
    @LispMethod(comment = "Returns a list of strings which are the ordered example phrases for the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp ; a list of strings")
    public static SubLObject wni_synset_example_phrases(final SubLObject synset) {
        return wordnet_import.wni_synset_example_phrases_helper(wordnet_import.wni_ensure_naut(synset));
    }

    public static final SubLObject clear_wni_synset_example_phrases_helper_alt() {
        {
            SubLObject cs = $wni_synset_example_phrases_helper_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_wni_synset_example_phrases_helper() {
        final SubLObject cs = wordnet_import.$wni_synset_example_phrases_helper_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_wni_synset_example_phrases_helper_alt(SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_synset_example_phrases_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_wni_synset_example_phrases_helper(final SubLObject synset) {
        return caching_state_remove_function_results_with_args(wordnet_import.$wni_synset_example_phrases_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns a list of strings which are the ordered example phrases for the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p
     * @return listp ; a list of strings
     */
    @LispMethod(comment = "Returns a list of strings which are the ordered example phrases for the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp ; a list of strings")
    public static final SubLObject wni_synset_example_phrases_helper_internal_alt(SubLObject synset) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        {
            SubLObject example_phrases_and_indices = NIL;
            SubLObject example_phrases = NIL;
            SubLObject sentence = listS($$wnSynsetExamplePhraseWithPosition, synset, $list_alt60);
            SubLObject query_properties = $list_alt7;
            SubLObject results = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
            {
                SubLObject cdolist_list_var = results;
                SubLObject result = NIL;
                for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                    example_phrases_and_indices = cons(list(result.first().rest(), second(result).rest()), example_phrases_and_indices);
                }
            }
            {
                SubLObject cdolist_list_var = Sort.sort(example_phrases_and_indices, symbol_function($sym54$_), symbol_function(FIRST));
                SubLObject example_phrase_and_index = NIL;
                for (example_phrase_and_index = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , example_phrase_and_index = cdolist_list_var.first()) {
                    example_phrases = cons(second(example_phrase_and_index), example_phrases);
                }
            }
            example_phrases = nreverse(example_phrases);
            {
                SubLObject list_var = example_phrases;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, STRINGP);
                    }
                }
            }
            return example_phrases;
        }
    }

    /**
     * Returns a list of strings which are the ordered example phrases for the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p
     * @return listp ; a list of strings
     */
    @LispMethod(comment = "Returns a list of strings which are the ordered example phrases for the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp ; a list of strings")
    public static SubLObject wni_synset_example_phrases_helper_internal(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        SubLObject example_phrases_and_indices = NIL;
        SubLObject example_phrases = NIL;
        final SubLObject sentence = listS(wordnet_import.$$wnSynsetExamplePhraseWithPosition, synset, wordnet_import.$list62);
        final SubLObject query_properties = wordnet_import.$list9;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wordnet_import.wni_trace_new_cyc_query(sentence, wordnet_import.$$WordNetWorkflowCollectorMt, query_properties);
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            example_phrases_and_indices = cons(list(result.first().rest(), second(result).rest()), example_phrases_and_indices);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        cdolist_list_var = Sort.sort(example_phrases_and_indices, symbol_function(wordnet_import.$sym56$_), symbol_function(FIRST));
        SubLObject example_phrase_and_index = NIL;
        example_phrase_and_index = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            example_phrases = cons(second(example_phrase_and_index), example_phrases);
            cdolist_list_var = cdolist_list_var.rest();
            example_phrase_and_index = cdolist_list_var.first();
        } 
        final SubLObject list_var;
        example_phrases = list_var = nreverse(example_phrases);
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != stringp(elem) : "! stringp(elem) " + ("Types.stringp(elem) " + "CommonSymbols.NIL != Types.stringp(elem) ") + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return example_phrases;
    }

    public static final SubLObject wni_synset_example_phrases_helper_alt(SubLObject synset) {
        {
            SubLObject caching_state = $wni_synset_example_phrases_helper_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(WNI_SYNSET_EXAMPLE_PHRASES_HELPER, $wni_synset_example_phrases_helper_caching_state$, TEN_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, $kw12$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw12$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_example_phrases_helper_internal(synset)));
                    memoization_state.caching_state_put(caching_state, synset, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject wni_synset_example_phrases_helper(final SubLObject synset) {
        SubLObject caching_state = wordnet_import.$wni_synset_example_phrases_helper_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(wordnet_import.WNI_SYNSET_EXAMPLE_PHRASES_HELPER, wordnet_import.$wni_synset_example_phrases_helper_caching_state$, TEN_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = caching_state_lookup(caching_state, synset, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wordnet_import.wni_synset_example_phrases_helper_internal(synset)));
            caching_state_put(caching_state, synset, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    /**
     * Returns the most general of the verb frames for the given WordNet synset.
     *
     * @param synset
     * 		: naut-p
     * @return fort-p ; or nil if no verb frame
     */
    @LispMethod(comment = "Returns the most general of the verb frames for the given WordNet synset.\r\n\r\n@param synset\r\n\t\t: naut-p\r\n@return fort-p ; or nil if no verb frame")
    public static final SubLObject wni_most_general_synset_verb_frame_alt(SubLObject synset) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        {
            SubLObject verb_frames = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_verb_frames(synset);
            SubLObject most_general_verb_frame_score = NIL;
            SubLObject most_general_verb_frame = NIL;
            if (NIL == verb_frames) {
                return NIL;
            }
            {
                SubLObject cdolist_list_var = verb_frames;
                SubLObject verb_frame = NIL;
                for (verb_frame = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , verb_frame = cdolist_list_var.first()) {
                    {
                        SubLObject verb_frame_score = alist_lookup_without_values($wni_verb_frame_generalities$.getGlobalValue(), verb_frame, symbol_function(EQL), $wni_least_general_frame_generality_score$.getGlobalValue());
                        if ((NIL == most_general_verb_frame) || verb_frame_score.numL(most_general_verb_frame_score)) {
                            most_general_verb_frame = verb_frame;
                            most_general_verb_frame_score = verb_frame_score;
                        }
                    }
                }
            }
            if (NIL != most_general_verb_frame) {
                SubLTrampolineFile.checkType(most_general_verb_frame, FORT_P);
            }
            return most_general_verb_frame;
        }
    }

    /**
     * Returns the most general of the verb frames for the given WordNet synset.
     *
     * @param synset
     * 		: naut-p
     * @return fort-p ; or nil if no verb frame
     */
    @LispMethod(comment = "Returns the most general of the verb frames for the given WordNet synset.\r\n\r\n@param synset\r\n\t\t: naut-p\r\n@return fort-p ; or nil if no verb frame")
    public static SubLObject wni_most_general_synset_verb_frame(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        final SubLObject verb_frames = wordnet_import.wni_synset_verb_frames(synset);
        SubLObject most_general_verb_frame_score = NIL;
        SubLObject most_general_verb_frame = NIL;
        if (NIL == verb_frames) {
            return NIL;
        }
        SubLObject cdolist_list_var = verb_frames;
        SubLObject verb_frame = NIL;
        verb_frame = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject verb_frame_score = list_utilities.alist_lookup_without_values(wordnet_import.$wni_verb_frame_generalities$.getGlobalValue(), verb_frame, symbol_function(EQL), wordnet_import.$wni_least_general_frame_generality_score$.getGlobalValue());
            if ((NIL == most_general_verb_frame) || verb_frame_score.numL(most_general_verb_frame_score)) {
                most_general_verb_frame = verb_frame;
                most_general_verb_frame_score = verb_frame_score;
            }
            cdolist_list_var = cdolist_list_var.rest();
            verb_frame = cdolist_list_var.first();
        } 
        if (((NIL != most_general_verb_frame) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == forts.fort_p(most_general_verb_frame))) {
            throw new AssertionError(most_general_verb_frame);
        }
        return most_general_verb_frame;
    }

    /**
     * Returns a list of verb frames for the given WordNet synset.
     *
     * @param synset
     * 		: naut-p
     * @return listp
     */
    @LispMethod(comment = "Returns a list of verb frames for the given WordNet synset.\r\n\r\n@param synset\r\n\t\t: naut-p\r\n@return listp")
    public static final SubLObject wni_synset_verb_frames_alt(SubLObject synset) {
        return com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_verb_frames_helper(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_ensure_naut(synset));
    }

    /**
     * Returns a list of verb frames for the given WordNet synset.
     *
     * @param synset
     * 		: naut-p
     * @return listp
     */
    @LispMethod(comment = "Returns a list of verb frames for the given WordNet synset.\r\n\r\n@param synset\r\n\t\t: naut-p\r\n@return listp")
    public static SubLObject wni_synset_verb_frames(final SubLObject synset) {
        return wordnet_import.wni_synset_verb_frames_helper(wordnet_import.wni_ensure_naut(synset));
    }

    public static final SubLObject clear_wni_synset_verb_frames_helper_alt() {
        {
            SubLObject cs = $wni_synset_verb_frames_helper_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_wni_synset_verb_frames_helper() {
        final SubLObject cs = wordnet_import.$wni_synset_verb_frames_helper_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_wni_synset_verb_frames_helper_alt(SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_synset_verb_frames_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_wni_synset_verb_frames_helper(final SubLObject synset) {
        return caching_state_remove_function_results_with_args(wordnet_import.$wni_synset_verb_frames_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns a list of verb frames for the given WordNet synset.
     *
     * @param synset
     * 		: naut-p
     * @return listp
     */
    @LispMethod(comment = "Returns a list of verb frames for the given WordNet synset.\r\n\r\n@param synset\r\n\t\t: naut-p\r\n@return listp")
    public static final SubLObject wni_synset_verb_frames_helper_internal_alt(SubLObject synset) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        {
            SubLObject sentence = listS($$wnSynsetVerbFrame, synset, $list_alt69);
            SubLObject query_properties = $list_alt70;
            SubLObject query_result = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
            SubLObject verb_frames = NIL;
            {
                SubLObject cdolist_list_var = query_result;
                SubLObject binding = NIL;
                for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                    if (NIL != fort_p(binding)) {
                        verb_frames = cons(binding, verb_frames);
                    } else {
                        if (NIL != possibly_naut_p(binding)) {
                            {
                                SubLObject cdolist_list_var_4 = sksi_kb_accessors.cyc_terms_for_sksi_external_term_naut(binding);
                                SubLObject v_term = NIL;
                                for (v_term = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , v_term = cdolist_list_var_4.first()) {
                                    if (NIL != fort_p(v_term)) {
                                        verb_frames = cons(v_term, verb_frames);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject list_var = verb_frames;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, FORT_P);
                    }
                }
            }
            return verb_frames;
        }
    }

    /**
     * Returns a list of verb frames for the given WordNet synset.
     *
     * @param synset
     * 		: naut-p
     * @return listp
     */
    @LispMethod(comment = "Returns a list of verb frames for the given WordNet synset.\r\n\r\n@param synset\r\n\t\t: naut-p\r\n@return listp")
    public static SubLObject wni_synset_verb_frames_helper_internal(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        final SubLObject sentence = listS(wordnet_import.$$wnSynsetVerbFrame, synset, wordnet_import.$list71);
        final SubLObject query_properties = wordnet_import.$list72;
        final SubLObject query_result = wordnet_import.wni_trace_new_cyc_query(sentence, wordnet_import.$$WordNetWorkflowCollectorMt, query_properties);
        SubLObject verb_frames = NIL;
        SubLObject cdolist_list_var = query_result;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != forts.fort_p(binding)) {
                verb_frames = cons(binding, verb_frames);
            } else
                if (NIL != possibly_naut_p(binding)) {
                    SubLObject cdolist_list_var_$7 = cyc_terms_for_sksi_external_term_naut(binding);
                    SubLObject v_term = NIL;
                    v_term = cdolist_list_var_$7.first();
                    while (NIL != cdolist_list_var_$7) {
                        if (NIL != forts.fort_p(v_term)) {
                            verb_frames = cons(v_term, verb_frames);
                        }
                        cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                        v_term = cdolist_list_var_$7.first();
                    } 
                }

            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        final SubLObject list_var = verb_frames;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != forts.fort_p(elem) : "! forts.fort_p(elem) " + ("forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) ") + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return verb_frames;
    }

    public static final SubLObject wni_synset_verb_frames_helper_alt(SubLObject synset) {
        {
            SubLObject caching_state = $wni_synset_verb_frames_helper_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(WNI_SYNSET_VERB_FRAMES_HELPER, $wni_synset_verb_frames_helper_caching_state$, $int$1000, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, $kw12$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw12$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_verb_frames_helper_internal(synset)));
                    memoization_state.caching_state_put(caching_state, synset, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject wni_synset_verb_frames_helper(final SubLObject synset) {
        SubLObject caching_state = wordnet_import.$wni_synset_verb_frames_helper_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(wordnet_import.WNI_SYNSET_VERB_FRAMES_HELPER, wordnet_import.$wni_synset_verb_frames_helper_caching_state$, $int$1000, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = caching_state_lookup(caching_state, synset, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wordnet_import.wni_synset_verb_frames_helper_internal(synset)));
            caching_state_put(caching_state, synset, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    public static final SubLObject clear_wni_verb_frames_for_word_alt() {
        {
            SubLObject cs = $wni_verb_frames_for_word_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_wni_verb_frames_for_word() {
        final SubLObject cs = wordnet_import.$wni_verb_frames_for_word_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_wni_verb_frames_for_word_alt(SubLObject verb) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_verb_frames_for_word_caching_state$.getGlobalValue(), list(verb), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_wni_verb_frames_for_word(final SubLObject verb) {
        return caching_state_remove_function_results_with_args(wordnet_import.$wni_verb_frames_for_word_caching_state$.getGlobalValue(), list(verb), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns a list of verb frames for the given WordNet verb.
     *
     * @param verb
     * 		; stringp
     * @return listp ; a list of fort-p verb-frames
     */
    @LispMethod(comment = "Returns a list of verb frames for the given WordNet verb.\r\n\r\n@param verb\r\n\t\t; stringp\r\n@return listp ; a list of fort-p verb-frames")
    public static final SubLObject wni_verb_frames_for_word_internal_alt(SubLObject verb) {
        SubLTrampolineFile.checkType(verb, STRINGP);
        {
            SubLObject verb_frames = NIL;
            SubLObject sentence = listS($$wnSynsetVerbFrame, list($$WordNetEnglishWordFn, verb), $list_alt69);
            SubLObject query_properties = $list_alt7;
            SubLObject results = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
            {
                SubLObject cdolist_list_var = results;
                SubLObject result = NIL;
                for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                    verb_frames = cons(result.first().rest(), verb_frames);
                }
            }
            {
                SubLObject list_var = verb_frames;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, FORT_P);
                    }
                }
            }
            return verb_frames;
        }
    }

    /**
     * Returns a list of verb frames for the given WordNet verb.
     *
     * @param verb
     * 		; stringp
     * @return listp ; a list of fort-p verb-frames
     */
    @LispMethod(comment = "Returns a list of verb frames for the given WordNet verb.\r\n\r\n@param verb\r\n\t\t; stringp\r\n@return listp ; a list of fort-p verb-frames")
    public static SubLObject wni_verb_frames_for_word_internal(final SubLObject verb) {
        assert NIL != stringp(verb) : "! stringp(verb) " + ("Types.stringp(verb) " + "CommonSymbols.NIL != Types.stringp(verb) ") + verb;
        SubLObject verb_frames = NIL;
        final SubLObject sentence = listS(wordnet_import.$$wnSynsetVerbFrame, list(wordnet_import.$$WordNetEnglishWordFn, verb), wordnet_import.$list71);
        final SubLObject query_properties = wordnet_import.$list9;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wordnet_import.wni_trace_new_cyc_query(sentence, wordnet_import.$$WordNetWorkflowCollectorMt, query_properties);
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            verb_frames = cons(result.first().rest(), verb_frames);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        final SubLObject list_var = verb_frames;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != forts.fort_p(elem) : "! forts.fort_p(elem) " + ("forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) ") + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return verb_frames;
    }

    public static final SubLObject wni_verb_frames_for_word_alt(SubLObject verb) {
        {
            SubLObject caching_state = $wni_verb_frames_for_word_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(WNI_VERB_FRAMES_FOR_WORD, $wni_verb_frames_for_word_caching_state$, $int$1000, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, verb, $kw12$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw12$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_verb_frames_for_word_internal(verb)));
                    memoization_state.caching_state_put(caching_state, verb, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject wni_verb_frames_for_word(final SubLObject verb) {
        SubLObject caching_state = wordnet_import.$wni_verb_frames_for_word_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(wordnet_import.WNI_VERB_FRAMES_FOR_WORD, wordnet_import.$wni_verb_frames_for_word_caching_state$, $int$1000, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = caching_state_lookup(caching_state, verb, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wordnet_import.wni_verb_frames_for_word_internal(verb)));
            caching_state_put(caching_state, verb, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    /**
     * Returns a list of hypernyms of the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p
     * @return listp ; a list of naut-p synsets
     */
    @LispMethod(comment = "Returns a list of hypernyms of the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp ; a list of naut-p synsets")
    public static final SubLObject wni_hypernyms_alt(SubLObject synset) {
        return com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_hypernyms_helper(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_ensure_naut(synset));
    }

    /**
     * Returns a list of hypernyms of the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p
     * @return listp ; a list of naut-p synsets
     */
    @LispMethod(comment = "Returns a list of hypernyms of the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp ; a list of naut-p synsets")
    public static SubLObject wni_hypernyms(final SubLObject synset) {
        return wordnet_import.wni_hypernyms_helper(wordnet_import.wni_ensure_naut(synset));
    }

    public static final SubLObject clear_wni_hypernyms_helper_alt() {
        {
            SubLObject cs = $wni_hypernyms_helper_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_wni_hypernyms_helper() {
        final SubLObject cs = wordnet_import.$wni_hypernyms_helper_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_wni_hypernyms_helper_alt(SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_hypernyms_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_wni_hypernyms_helper(final SubLObject synset) {
        return caching_state_remove_function_results_with_args(wordnet_import.$wni_hypernyms_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns a list of hypernyms of the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p
     * @return listp ; a list of naut-p synsets
     */
    @LispMethod(comment = "Returns a list of hypernyms of the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp ; a list of naut-p synsets")
    public static final SubLObject wni_hypernyms_helper_internal_alt(SubLObject synset) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        {
            SubLObject hypernyms = NIL;
            SubLObject sentence = listS($$wnHypernym, synset, $list_alt78);
            SubLObject query_properties = $list_alt7;
            SubLObject results = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
            {
                SubLObject cdolist_list_var = results;
                SubLObject result = NIL;
                for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                    hypernyms = cons(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_ensure_naut(result.first().rest()), hypernyms);
                }
            }
            {
                SubLObject list_var = hypernyms;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, NAUT_P);
                    }
                }
            }
            return hypernyms;
        }
    }

    /**
     * Returns a list of hypernyms of the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p
     * @return listp ; a list of naut-p synsets
     */
    @LispMethod(comment = "Returns a list of hypernyms of the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp ; a list of naut-p synsets")
    public static SubLObject wni_hypernyms_helper_internal(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        SubLObject hypernyms = NIL;
        final SubLObject sentence = listS(wordnet_import.$$wnHypernym, synset, wordnet_import.$list80);
        final SubLObject query_properties = wordnet_import.$list9;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wordnet_import.wni_trace_new_cyc_query(sentence, wordnet_import.$$WordNetWorkflowCollectorMt, query_properties);
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            hypernyms = cons(wordnet_import.wni_ensure_naut(result.first().rest()), hypernyms);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        final SubLObject list_var = hypernyms;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != narts_high.naut_p(elem) : "! narts_high.naut_p(elem) " + ("narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) ") + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return hypernyms;
    }

    public static final SubLObject wni_hypernyms_helper_alt(SubLObject synset) {
        {
            SubLObject caching_state = $wni_hypernyms_helper_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(WNI_HYPERNYMS_HELPER, $wni_hypernyms_helper_caching_state$, $int$1000, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, $kw12$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw12$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_hypernyms_helper_internal(synset)));
                    memoization_state.caching_state_put(caching_state, synset, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject wni_hypernyms_helper(final SubLObject synset) {
        SubLObject caching_state = wordnet_import.$wni_hypernyms_helper_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(wordnet_import.WNI_HYPERNYMS_HELPER, wordnet_import.$wni_hypernyms_helper_caching_state$, $int$1000, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = caching_state_lookup(caching_state, synset, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wordnet_import.wni_hypernyms_helper_internal(synset)));
            caching_state_put(caching_state, synset, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    /**
     * Returns all the direct and indirect hypernyms of the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p WordNet synset
     * @return listp ; all the hypernyms of the given synset
     */
    @LispMethod(comment = "Returns all the direct and indirect hypernyms of the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p WordNet synset\r\n@return listp ; all the hypernyms of the given synset")
    public static final SubLObject wni_all_hypernyms_alt(SubLObject synset) {
        return com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_all_hypernyms_helper(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_ensure_naut(synset));
    }

    /**
     * Returns all the direct and indirect hypernyms of the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p WordNet synset
     * @return listp ; all the hypernyms of the given synset
     */
    @LispMethod(comment = "Returns all the direct and indirect hypernyms of the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p WordNet synset\r\n@return listp ; all the hypernyms of the given synset")
    public static SubLObject wni_all_hypernyms(final SubLObject synset) {
        return wordnet_import.wni_all_hypernyms_helper(wordnet_import.wni_ensure_naut(synset));
    }

    public static final SubLObject clear_wni_all_hypernyms_helper_alt() {
        {
            SubLObject cs = $wni_all_hypernyms_helper_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_wni_all_hypernyms_helper() {
        final SubLObject cs = wordnet_import.$wni_all_hypernyms_helper_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_wni_all_hypernyms_helper_alt(SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_all_hypernyms_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_wni_all_hypernyms_helper(final SubLObject synset) {
        return caching_state_remove_function_results_with_args(wordnet_import.$wni_all_hypernyms_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all the direct and indirect hypernyms of the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p WordNet synset
     * @return listp ; all the hypernyms of the given synset
     */
    @LispMethod(comment = "Returns all the direct and indirect hypernyms of the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p WordNet synset\r\n@return listp ; all the hypernyms of the given synset")
    public static final SubLObject wni_all_hypernyms_helper_internal_alt(SubLObject synset) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        {
            SubLObject all_hypernyms = NIL;
            SubLObject hypernym = NIL;
            SubLObject synsets_stack = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_hypernyms(synset);
            while (NIL != synsets_stack) {
                hypernym = synsets_stack.first();
                synsets_stack = synsets_stack.rest();
                {
                    SubLObject item_var = hypernym;
                    if (NIL == member(item_var, all_hypernyms, symbol_function(EQL), symbol_function(IDENTITY))) {
                        all_hypernyms = cons(item_var, all_hypernyms);
                    }
                }
                synsets_stack = append(synsets_stack, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_hypernyms(hypernym));
            } 
            {
                SubLObject list_var = all_hypernyms;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, NAUT_P);
                    }
                }
            }
            return all_hypernyms;
        }
    }

    /**
     * Returns all the direct and indirect hypernyms of the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p WordNet synset
     * @return listp ; all the hypernyms of the given synset
     */
    @LispMethod(comment = "Returns all the direct and indirect hypernyms of the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p WordNet synset\r\n@return listp ; all the hypernyms of the given synset")
    public static SubLObject wni_all_hypernyms_helper_internal(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        SubLObject all_hypernyms = NIL;
        for (SubLObject hypernym = NIL, synsets_stack = wordnet_import.wni_hypernyms(synset); NIL != synsets_stack; synsets_stack = append(synsets_stack, wordnet_import.wni_hypernyms(hypernym))) {
            hypernym = synsets_stack.first();
            synsets_stack = synsets_stack.rest();
            final SubLObject item_var = hypernym;
            if (NIL == member(item_var, all_hypernyms, symbol_function(EQL), symbol_function(IDENTITY))) {
                all_hypernyms = cons(item_var, all_hypernyms);
            }
        }
        final SubLObject list_var = all_hypernyms;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != narts_high.naut_p(elem) : "! narts_high.naut_p(elem) " + ("narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return all_hypernyms;
    }

    public static final SubLObject wni_all_hypernyms_helper_alt(SubLObject synset) {
        {
            SubLObject caching_state = $wni_all_hypernyms_helper_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(WNI_ALL_HYPERNYMS_HELPER, $wni_all_hypernyms_helper_caching_state$, $int$1000, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, $kw12$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw12$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_all_hypernyms_helper_internal(synset)));
                    memoization_state.caching_state_put(caching_state, synset, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject wni_all_hypernyms_helper(final SubLObject synset) {
        SubLObject caching_state = wordnet_import.$wni_all_hypernyms_helper_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(wordnet_import.WNI_ALL_HYPERNYMS_HELPER, wordnet_import.$wni_all_hypernyms_helper_caching_state$, $int$1000, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = caching_state_lookup(caching_state, synset, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wordnet_import.wni_all_hypernyms_helper_internal(synset)));
            caching_state_put(caching_state, synset, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    /**
     * Returns T iff SYNSET has HYPERNYM as a direct or indirect hypernym synset.
     *
     * @param synset
     * 		; naut-p WordNet synset
     * @param hypernym
     * 		; naut-p WordNet hypernym synset
     */
    @LispMethod(comment = "Returns T iff SYNSET has HYPERNYM as a direct or indirect hypernym synset.\r\n\r\n@param synset\r\n\t\t; naut-p WordNet synset\r\n@param hypernym\r\n\t\t; naut-p WordNet hypernym synset")
    public static final SubLObject wni_all_hypernymP_alt(SubLObject synset, SubLObject hypernym) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        SubLTrampolineFile.checkType(hypernym, NAUT_P);
        {
            SubLObject temp_hypernym = NIL;
            SubLObject synsets_stack = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_hypernyms(synset);
            while (NIL != synsets_stack) {
                temp_hypernym = synsets_stack.first();
                synsets_stack = synsets_stack.rest();
                if (com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_ensure_naut(temp_hypernym).equal(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_ensure_naut(hypernym))) {
                    return T;
                }
                synsets_stack = append(synsets_stack, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_hypernyms(temp_hypernym));
            } 
        }
        return NIL;
    }

    /**
     * Returns T iff SYNSET has HYPERNYM as a direct or indirect hypernym synset.
     *
     * @param synset
     * 		; naut-p WordNet synset
     * @param hypernym
     * 		; naut-p WordNet hypernym synset
     */
    @LispMethod(comment = "Returns T iff SYNSET has HYPERNYM as a direct or indirect hypernym synset.\r\n\r\n@param synset\r\n\t\t; naut-p WordNet synset\r\n@param hypernym\r\n\t\t; naut-p WordNet hypernym synset")
    public static SubLObject wni_all_hypernymP(final SubLObject synset, final SubLObject hypernym) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != narts_high.naut_p(hypernym) : "! narts_high.naut_p(hypernym) " + ("narts_high.naut_p(hypernym) " + "CommonSymbols.NIL != narts_high.naut_p(hypernym) ") + hypernym;
        for (SubLObject temp_hypernym = NIL, synsets_stack = wordnet_import.wni_hypernyms(synset); NIL != synsets_stack; synsets_stack = append(synsets_stack, wordnet_import.wni_hypernyms(temp_hypernym))) {
            temp_hypernym = synsets_stack.first();
            synsets_stack = synsets_stack.rest();
            if (wordnet_import.wni_ensure_naut(temp_hypernym).equal(wordnet_import.wni_ensure_naut(hypernym))) {
                return T;
            }
        }
        return NIL;
    }

    /**
     * Returns a list of hyponyms of the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p
     * @return listp ; a list of naut-p synsets
     */
    @LispMethod(comment = "Returns a list of hyponyms of the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp ; a list of naut-p synsets")
    public static final SubLObject wni_hyponyms_alt(SubLObject synset) {
        return com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_hyponyms_helper(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_ensure_naut(synset));
    }

    /**
     * Returns a list of hyponyms of the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p
     * @return listp ; a list of naut-p synsets
     */
    @LispMethod(comment = "Returns a list of hyponyms of the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp ; a list of naut-p synsets")
    public static SubLObject wni_hyponyms(final SubLObject synset) {
        return wordnet_import.wni_hyponyms_helper(wordnet_import.wni_ensure_naut(synset));
    }

    public static final SubLObject clear_wni_hyponyms_helper_alt() {
        {
            SubLObject cs = $wni_hyponyms_helper_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_wni_hyponyms_helper() {
        final SubLObject cs = wordnet_import.$wni_hyponyms_helper_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_wni_hyponyms_helper_alt(SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_hyponyms_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_wni_hyponyms_helper(final SubLObject synset) {
        return caching_state_remove_function_results_with_args(wordnet_import.$wni_hyponyms_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns a list of hyponyms of the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p
     * @return listp ; a list of naut-p synsets
     */
    @LispMethod(comment = "Returns a list of hyponyms of the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp ; a list of naut-p synsets")
    public static final SubLObject wni_hyponyms_helper_internal_alt(SubLObject synset) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        {
            SubLObject hyponyms = NIL;
            SubLObject sentence = list($$wnHypernym, $sym86$_HYPONYM_SYNSET, synset);
            SubLObject query_properties = $list_alt7;
            SubLObject results = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
            {
                SubLObject cdolist_list_var = results;
                SubLObject result = NIL;
                for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                    hyponyms = cons(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_ensure_naut(result.first().rest()), hyponyms);
                }
            }
            {
                SubLObject list_var = hyponyms;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, NAUT_P);
                    }
                }
            }
            return hyponyms;
        }
    }

    /**
     * Returns a list of hyponyms of the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p
     * @return listp ; a list of naut-p synsets
     */
    @LispMethod(comment = "Returns a list of hyponyms of the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp ; a list of naut-p synsets")
    public static SubLObject wni_hyponyms_helper_internal(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        SubLObject hyponyms = NIL;
        final SubLObject sentence = list(wordnet_import.$$wnHypernym, wordnet_import.$sym88$_HYPONYM_SYNSET, synset);
        final SubLObject query_properties = wordnet_import.$list9;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wordnet_import.wni_trace_new_cyc_query(sentence, wordnet_import.$$WordNetWorkflowCollectorMt, query_properties);
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            hyponyms = cons(wordnet_import.wni_ensure_naut(result.first().rest()), hyponyms);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        final SubLObject list_var = hyponyms;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != narts_high.naut_p(elem) : "! narts_high.naut_p(elem) " + ("narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) ") + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return hyponyms;
    }

    public static final SubLObject wni_hyponyms_helper_alt(SubLObject synset) {
        {
            SubLObject caching_state = $wni_hyponyms_helper_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(WNI_HYPONYMS_HELPER, $wni_hyponyms_helper_caching_state$, $int$1000, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, $kw12$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw12$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_hyponyms_helper_internal(synset)));
                    memoization_state.caching_state_put(caching_state, synset, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject wni_hyponyms_helper(final SubLObject synset) {
        SubLObject caching_state = wordnet_import.$wni_hyponyms_helper_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(wordnet_import.WNI_HYPONYMS_HELPER, wordnet_import.$wni_hyponyms_helper_caching_state$, $int$1000, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = caching_state_lookup(caching_state, synset, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wordnet_import.wni_hyponyms_helper_internal(synset)));
            caching_state_put(caching_state, synset, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    /**
     * Returns all the direct and indirect hyponyms of the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p WordNet synset
     * @return listp ; all the hyponyms of the given synset
     */
    @LispMethod(comment = "Returns all the direct and indirect hyponyms of the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p WordNet synset\r\n@return listp ; all the hyponyms of the given synset")
    public static final SubLObject wni_all_hyponyms_alt(SubLObject synset) {
        return com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_all_hyponyms_helper(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_ensure_naut(synset));
    }

    /**
     * Returns all the direct and indirect hyponyms of the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p WordNet synset
     * @return listp ; all the hyponyms of the given synset
     */
    @LispMethod(comment = "Returns all the direct and indirect hyponyms of the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p WordNet synset\r\n@return listp ; all the hyponyms of the given synset")
    public static SubLObject wni_all_hyponyms(final SubLObject synset) {
        return wordnet_import.wni_all_hyponyms_helper(wordnet_import.wni_ensure_naut(synset));
    }

    public static final SubLObject clear_wni_all_hyponyms_helper_alt() {
        {
            SubLObject cs = $wni_all_hyponyms_helper_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_wni_all_hyponyms_helper() {
        final SubLObject cs = wordnet_import.$wni_all_hyponyms_helper_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_wni_all_hyponyms_helper_alt(SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_all_hyponyms_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_wni_all_hyponyms_helper(final SubLObject synset) {
        return caching_state_remove_function_results_with_args(wordnet_import.$wni_all_hyponyms_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all the direct and indirect hyponyms of the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p WordNet synset
     * @return listp ; all the hyponyms of the given synset
     */
    @LispMethod(comment = "Returns all the direct and indirect hyponyms of the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p WordNet synset\r\n@return listp ; all the hyponyms of the given synset")
    public static final SubLObject wni_all_hyponyms_helper_internal_alt(SubLObject synset) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        {
            SubLObject all_hyponyms = NIL;
            SubLObject hyponym = NIL;
            SubLObject synsets_stack = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_hyponyms(synset);
            while (NIL != synsets_stack) {
                hyponym = synsets_stack.first();
                synsets_stack = synsets_stack.rest();
                {
                    SubLObject item_var = hyponym;
                    if (NIL == member(item_var, all_hyponyms, symbol_function(EQL), symbol_function(IDENTITY))) {
                        all_hyponyms = cons(item_var, all_hyponyms);
                    }
                }
                synsets_stack = append(synsets_stack, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_hyponyms(hyponym));
            } 
            {
                SubLObject list_var = all_hyponyms;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, NAUT_P);
                    }
                }
            }
            return all_hyponyms;
        }
    }

    /**
     * Returns all the direct and indirect hyponyms of the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p WordNet synset
     * @return listp ; all the hyponyms of the given synset
     */
    @LispMethod(comment = "Returns all the direct and indirect hyponyms of the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p WordNet synset\r\n@return listp ; all the hyponyms of the given synset")
    public static SubLObject wni_all_hyponyms_helper_internal(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        SubLObject all_hyponyms = NIL;
        for (SubLObject hyponym = NIL, synsets_stack = wordnet_import.wni_hyponyms(synset); NIL != synsets_stack; synsets_stack = append(synsets_stack, wordnet_import.wni_hyponyms(hyponym))) {
            hyponym = synsets_stack.first();
            synsets_stack = synsets_stack.rest();
            final SubLObject item_var = hyponym;
            if (NIL == member(item_var, all_hyponyms, symbol_function(EQL), symbol_function(IDENTITY))) {
                all_hyponyms = cons(item_var, all_hyponyms);
            }
        }
        final SubLObject list_var = all_hyponyms;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != narts_high.naut_p(elem) : "! narts_high.naut_p(elem) " + ("narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return all_hyponyms;
    }

    public static final SubLObject wni_all_hyponyms_helper_alt(SubLObject synset) {
        {
            SubLObject caching_state = $wni_all_hyponyms_helper_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(WNI_ALL_HYPONYMS_HELPER, $wni_all_hyponyms_helper_caching_state$, $int$1000, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, $kw12$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw12$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_all_hyponyms_helper_internal(synset)));
                    memoization_state.caching_state_put(caching_state, synset, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject wni_all_hyponyms_helper(final SubLObject synset) {
        SubLObject caching_state = wordnet_import.$wni_all_hyponyms_helper_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(wordnet_import.WNI_ALL_HYPONYMS_HELPER, wordnet_import.$wni_all_hyponyms_helper_caching_state$, $int$1000, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = caching_state_lookup(caching_state, synset, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wordnet_import.wni_all_hyponyms_helper_internal(synset)));
            caching_state_put(caching_state, synset, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    /**
     * Returns T iff any hyponym of the given SYNSET is an individual.
     *
     * @param synset
     * 		; naut-p, the WordNet synset
     * @return booleanp
     */
    @LispMethod(comment = "Returns T iff any hyponym of the given SYNSET is an individual.\r\n\r\n@param synset\r\n\t\t; naut-p, the WordNet synset\r\n@return booleanp")
    public static final SubLObject wni_any_hyponym_an_individual_alt(SubLObject synset) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        {
            SubLObject hyponyms = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_hyponyms(synset);
            SubLObject cdolist_list_var = hyponyms;
            SubLObject hyponym = NIL;
            for (hyponym = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , hyponym = cdolist_list_var.first()) {
                if (NIL == com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_collectionP(hyponym)) {
                    return T;
                }
            }
        }
        return NIL;
    }

    /**
     * Returns T iff any hyponym of the given SYNSET is an individual.
     *
     * @param synset
     * 		; naut-p, the WordNet synset
     * @return booleanp
     */
    @LispMethod(comment = "Returns T iff any hyponym of the given SYNSET is an individual.\r\n\r\n@param synset\r\n\t\t; naut-p, the WordNet synset\r\n@return booleanp")
    public static SubLObject wni_any_hyponym_an_individual(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        SubLObject cdolist_list_var;
        final SubLObject hyponyms = cdolist_list_var = wordnet_import.wni_hyponyms(synset);
        SubLObject hyponym = NIL;
        hyponym = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == wordnet_import.wni_synset_collectionP(hyponym)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            hyponym = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Returns T iff the given SYNSET has a derivationally related noun synset.
     *
     * @param synset
     * 		; naut-p, the WordNet verb synset
     * @return booleanp, T iff the given SYNSET has a derivationally related noun synset
     */
    @LispMethod(comment = "Returns T iff the given SYNSET has a derivationally related noun synset.\r\n\r\n@param synset\r\n\t\t; naut-p, the WordNet verb synset\r\n@return booleanp, T iff the given SYNSET has a derivationally related noun synset")
    public static final SubLObject wni_verb_is_derived_from_situation_nounP_alt(SubLObject synset) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        {
            SubLObject derived_forms = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_derived_forms(synset);
            SubLObject cdolist_list_var = derived_forms;
            SubLObject derived_form = NIL;
            for (derived_form = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , derived_form = cdolist_list_var.first()) {
                if (($$Noun == com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_pos(derived_form)) && (NIL != genls.any_specP($$Situation, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_hypernym_terms(derived_form), UNPROVIDED, UNPROVIDED))) {
                    return T;
                }
            }
            return NIL;
        }
    }

    /**
     * Returns T iff the given SYNSET has a derivationally related noun synset.
     *
     * @param synset
     * 		; naut-p, the WordNet verb synset
     * @return booleanp, T iff the given SYNSET has a derivationally related noun synset
     */
    @LispMethod(comment = "Returns T iff the given SYNSET has a derivationally related noun synset.\r\n\r\n@param synset\r\n\t\t; naut-p, the WordNet verb synset\r\n@return booleanp, T iff the given SYNSET has a derivationally related noun synset")
    public static SubLObject wni_verb_is_derived_from_situation_nounP(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        SubLObject cdolist_list_var;
        final SubLObject derived_forms = cdolist_list_var = wordnet_import.wni_derived_forms(synset);
        SubLObject derived_form = NIL;
        derived_form = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (wordnet_import.$$Noun.eql(wordnet_import.wni_synset_pos(derived_form)) && (NIL != any_specP(wordnet_import.$$Situation, wordnet_import.wni_hypernym_terms(derived_form), UNPROVIDED, UNPROVIDED))) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            derived_form = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Returns a list of derived forms of the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p
     * @return listp ; a list of naut-p synsets
     */
    @LispMethod(comment = "Returns a list of derived forms of the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp ; a list of naut-p synsets")
    public static final SubLObject wni_derived_forms_alt(SubLObject synset) {
        return com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_derived_forms_helper(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_ensure_naut(synset));
    }

    /**
     * Returns a list of derived forms of the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p
     * @return listp ; a list of naut-p synsets
     */
    @LispMethod(comment = "Returns a list of derived forms of the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp ; a list of naut-p synsets")
    public static SubLObject wni_derived_forms(final SubLObject synset) {
        return wordnet_import.wni_derived_forms_helper(wordnet_import.wni_ensure_naut(synset));
    }

    public static final SubLObject clear_wni_derived_forms_helper_alt() {
        {
            SubLObject cs = $wni_derived_forms_helper_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_wni_derived_forms_helper() {
        final SubLObject cs = wordnet_import.$wni_derived_forms_helper_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_wni_derived_forms_helper_alt(SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_derived_forms_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_wni_derived_forms_helper(final SubLObject synset) {
        return caching_state_remove_function_results_with_args(wordnet_import.$wni_derived_forms_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns a list of the derived-forms of the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p
     * @return listp ; a list of naut-p synsets
     */
    @LispMethod(comment = "Returns a list of the derived-forms of the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp ; a list of naut-p synsets")
    public static final SubLObject wni_derived_forms_helper_internal_alt(SubLObject synset) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        {
            SubLObject sql_query = cconcatenate($str_alt96$SELECT_DISTINCT_synsetpointer_syn, new SubLObject[]{ string_utilities.to_string(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_id(synset)), $str_alt97$_AND____________________synsetpoi });
            SubLObject synsets = NIL;
            SubLObject rs = NIL;
            SubLObject statement = NIL;
            SubLObject connection = NIL;
            try {
                connection = sdbc.new_sql_connection(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_db(), com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_user(), com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_password(), list(new SubLObject[]{ $DBMS_SERVER, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_server(), $PORT, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_proxy_port(), $SUBPROTOCOL, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_subprotocol(), $PROXY_SERVER, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_proxy_server(), $TIMEOUT, THREE_INTEGER }));
                if (NIL != sdbc.sql_open_connection_p(connection)) {
                    statement = sdbc.sqlc_create_statement(connection);
                } else {
                    statement = connection;
                }
                if (NIL != sdbc.sql_open_statement_p(statement)) {
                    rs = sdbc.sqls_execute_query(statement, sql_query, UNPROVIDED);
                } else {
                    rs = statement;
                }
                if (NIL != sdbc.sql_result_set_p(rs)) {
                    while (NIL != sdbc.sqlrs_next(rs)) {
                        synsets = cons(list($$WordNetSynsetFn, sdbc.sqlrs_get_object(rs, ONE_INTEGER)), synsets);
                    } 
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (NIL != sdbc.sql_connection_p(connection)) {
                            sdbc.sqlc_close(connection);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            {
                SubLObject list_var = synsets;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, NAUT_P);
                    }
                }
            }
            return synsets;
        }
    }

    /**
     * Returns a list of the derived-forms of the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p
     * @return listp ; a list of naut-p synsets
     */
    @LispMethod(comment = "Returns a list of the derived-forms of the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp ; a list of naut-p synsets")
    public static SubLObject wni_derived_forms_helper_internal(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        final SubLObject sql_query = cconcatenate(wordnet_import.$str98$SELECT_DISTINCT_synsetpointer_syn, new SubLObject[]{ to_string(wordnet_import.wni_synset_id(synset)), wordnet_import.$str99$_AND____________________synsetpoi });
        SubLObject synsets = NIL;
        SubLObject rs = NIL;
        SubLObject statement = NIL;
        SubLObject connection = NIL;
        try {
            connection = new_sql_connection(wordnet_import.wni_access_path_db(), wordnet_import.wni_access_path_user(), wordnet_import.wni_access_path_password(), list(new SubLObject[]{ $DBMS_SERVER, wordnet_import.wni_access_path_server(), $PORT, wordnet_import.wni_access_path_proxy_port(), $SUBPROTOCOL, wordnet_import.wni_access_path_subprotocol(), $PROXY_SERVER, wordnet_import.wni_access_path_proxy_server(), $TIMEOUT, THREE_INTEGER }));
            if (NIL != sql_open_connection_p(connection)) {
                statement = sqlc_create_statement(connection);
            } else {
                statement = connection;
            }
            if (NIL != sql_open_statement_p(statement)) {
                rs = sqls_execute_query(statement, sql_query, UNPROVIDED);
            } else {
                rs = statement;
            }
            if (NIL != sql_result_set_p(rs)) {
                while (NIL != sqlrs_next(rs)) {
                    synsets = cons(list(wordnet_import.$$WordNetSynsetFn, sqlrs_get_object(rs, ONE_INTEGER)), synsets);
                } 
            }
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (NIL != sql_connection_p(connection)) {
                    sqlc_close(connection);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        final SubLObject list_var = synsets;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != narts_high.naut_p(elem) : "! narts_high.naut_p(elem) " + ("narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return synsets;
    }

    public static final SubLObject wni_derived_forms_helper_alt(SubLObject synset) {
        {
            SubLObject caching_state = $wni_derived_forms_helper_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(WNI_DERIVED_FORMS_HELPER, $wni_derived_forms_helper_caching_state$, $int$1000, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, $kw12$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw12$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_derived_forms_helper_internal(synset)));
                    memoization_state.caching_state_put(caching_state, synset, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject wni_derived_forms_helper(final SubLObject synset) {
        SubLObject caching_state = wordnet_import.$wni_derived_forms_helper_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(wordnet_import.WNI_DERIVED_FORMS_HELPER, wordnet_import.$wni_derived_forms_helper_caching_state$, $int$1000, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = caching_state_lookup(caching_state, synset, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wordnet_import.wni_derived_forms_helper_internal(synset)));
            caching_state_put(caching_state, synset, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    /**
     * Returns the string gloss for the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p WordNet synset
     * @return stringp ; the gloss of the given synset
     */
    @LispMethod(comment = "Returns the string gloss for the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p WordNet synset\r\n@return stringp ; the gloss of the given synset")
    public static final SubLObject wni_synset_gloss_alt(SubLObject synset) {
        return com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_gloss_helper(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_ensure_naut(synset));
    }

    /**
     * Returns the string gloss for the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p WordNet synset
     * @return stringp ; the gloss of the given synset
     */
    @LispMethod(comment = "Returns the string gloss for the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p WordNet synset\r\n@return stringp ; the gloss of the given synset")
    public static SubLObject wni_synset_gloss(final SubLObject synset) {
        return wordnet_import.wni_synset_gloss_helper(wordnet_import.wni_ensure_naut(synset));
    }

    public static final SubLObject clear_wni_synset_gloss_helper_alt() {
        {
            SubLObject cs = $wni_synset_gloss_helper_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_wni_synset_gloss_helper() {
        final SubLObject cs = wordnet_import.$wni_synset_gloss_helper_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_wni_synset_gloss_helper_alt(SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_synset_gloss_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_wni_synset_gloss_helper(final SubLObject synset) {
        return caching_state_remove_function_results_with_args(wordnet_import.$wni_synset_gloss_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns the string gloss for the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p WordNet synset
     * @return NIL or stringp ; the gloss of the given synset
     */
    @LispMethod(comment = "Returns the string gloss for the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p WordNet synset\r\n@return NIL or stringp ; the gloss of the given synset")
    public static final SubLObject wni_synset_gloss_helper_internal_alt(SubLObject synset) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        {
            SubLObject gloss = NIL;
            SubLObject sentence = listS($$wnSynsetGloss, synset, $list_alt102);
            SubLObject query_properties = $list_alt103;
            SubLObject results = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
            gloss = results.first();
            if (NIL != gloss) {
                SubLTrampolineFile.checkType(gloss, STRINGP);
            }
            return gloss;
        }
    }

    /**
     * Returns the string gloss for the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p WordNet synset
     * @return NIL or stringp ; the gloss of the given synset
     */
    @LispMethod(comment = "Returns the string gloss for the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p WordNet synset\r\n@return NIL or stringp ; the gloss of the given synset")
    public static SubLObject wni_synset_gloss_helper_internal(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        SubLObject gloss = NIL;
        final SubLObject sentence = listS(wordnet_import.$$wnSynsetGloss, synset, wordnet_import.$list104);
        final SubLObject query_properties = wordnet_import.$list105;
        final SubLObject results = wordnet_import.wni_trace_new_cyc_query(sentence, wordnet_import.$$WordNetWorkflowCollectorMt, query_properties);
        gloss = results.first();
        if (((NIL != gloss) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(gloss))) {
            throw new AssertionError(gloss);
        }
        return gloss;
    }

    public static final SubLObject wni_synset_gloss_helper_alt(SubLObject synset) {
        {
            SubLObject caching_state = $wni_synset_gloss_helper_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(WNI_SYNSET_GLOSS_HELPER, $wni_synset_gloss_helper_caching_state$, TEN_INTEGER, EQUALP, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, $kw12$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw12$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_gloss_helper_internal(synset)));
                    memoization_state.caching_state_put(caching_state, synset, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject wni_synset_gloss_helper(final SubLObject synset) {
        SubLObject caching_state = wordnet_import.$wni_synset_gloss_helper_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(wordnet_import.WNI_SYNSET_GLOSS_HELPER, wordnet_import.$wni_synset_gloss_helper_caching_state$, TEN_INTEGER, EQUALP, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = caching_state_lookup(caching_state, synset, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wordnet_import.wni_synset_gloss_helper_internal(synset)));
            caching_state_put(caching_state, synset, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    /**
     * Returns the speech part for the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p WordNet synset
     * @return fort-p ; the speech part of the given synset
     */
    @LispMethod(comment = "Returns the speech part for the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p WordNet synset\r\n@return fort-p ; the speech part of the given synset")
    public static final SubLObject wni_synset_pos_alt(SubLObject synset) {
        return com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_pos_helper(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_ensure_naut(synset));
    }

    /**
     * Returns the speech part for the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p WordNet synset
     * @return fort-p ; the speech part of the given synset
     */
    @LispMethod(comment = "Returns the speech part for the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p WordNet synset\r\n@return fort-p ; the speech part of the given synset")
    public static SubLObject wni_synset_pos(final SubLObject synset) {
        return wordnet_import.wni_synset_pos_helper(wordnet_import.wni_ensure_naut(synset));
    }

    public static final SubLObject clear_wni_synset_pos_helper_alt() {
        {
            SubLObject cs = $wni_synset_pos_helper_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_wni_synset_pos_helper() {
        final SubLObject cs = wordnet_import.$wni_synset_pos_helper_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_wni_synset_pos_helper_alt(SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_synset_pos_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_wni_synset_pos_helper(final SubLObject synset) {
        return caching_state_remove_function_results_with_args(wordnet_import.$wni_synset_pos_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns the speech part for the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p WordNet synset
     * @return fort-p ; the speech part of the given synset
     */
    @LispMethod(comment = "Returns the speech part for the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p WordNet synset\r\n@return fort-p ; the speech part of the given synset")
    public static final SubLObject wni_synset_pos_helper_internal_alt(SubLObject synset) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        {
            SubLObject pos = NIL;
            SubLObject sentence = listS($$wnSynsetSpeechPart, synset, $list_alt108);
            SubLObject query_properties = $list_alt109;
            SubLObject results = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
            pos = results.first();
            if (NIL != pos) {
                SubLTrampolineFile.checkType(pos, FORT_P);
            }
            return pos;
        }
    }

    /**
     * Returns the speech part for the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p WordNet synset
     * @return fort-p ; the speech part of the given synset
     */
    @LispMethod(comment = "Returns the speech part for the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p WordNet synset\r\n@return fort-p ; the speech part of the given synset")
    public static SubLObject wni_synset_pos_helper_internal(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        SubLObject pos = NIL;
        final SubLObject sentence = listS(wordnet_import.$$wnSynsetSpeechPart, synset, wordnet_import.$list110);
        final SubLObject query_properties = wordnet_import.$list111;
        final SubLObject results = wordnet_import.wni_trace_new_cyc_query(sentence, wordnet_import.$$WordNetWorkflowCollectorMt, query_properties);
        pos = results.first();
        if (((NIL != pos) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == forts.fort_p(pos))) {
            throw new AssertionError(pos);
        }
        return pos;
    }

    public static final SubLObject wni_synset_pos_helper_alt(SubLObject synset) {
        {
            SubLObject caching_state = $wni_synset_pos_helper_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(WNI_SYNSET_POS_HELPER, $wni_synset_pos_helper_caching_state$, TEN_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, $kw12$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw12$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_pos_helper_internal(synset)));
                    memoization_state.caching_state_put(caching_state, synset, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject wni_synset_pos_helper(final SubLObject synset) {
        SubLObject caching_state = wordnet_import.$wni_synset_pos_helper_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(wordnet_import.WNI_SYNSET_POS_HELPER, wordnet_import.$wni_synset_pos_helper_caching_state$, TEN_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = caching_state_lookup(caching_state, synset, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wordnet_import.wni_synset_pos_helper_internal(synset)));
            caching_state_put(caching_state, synset, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    /**
     * Returns the speech-part offset string that identifies the SYNSET within the current
     * WordNet release.
     *
     * @param synset
     * 		; naut-p WordNet synset
     * @return string-p ; the speech part and offset string of the given synset
     */
    @LispMethod(comment = "Returns the speech-part offset string that identifies the SYNSET within the current\r\nWordNet release.\r\n\r\n@param synset\r\n\t\t; naut-p WordNet synset\r\n@return string-p ; the speech part and offset string of the given synset\nReturns the speech-part offset string that identifies the SYNSET within the current\nWordNet release.")
    public static final SubLObject wni_synset_speech_part_offset_alt(SubLObject synset) {
        return com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_speech_part_offset_helper(cycl_utilities.nat_functor(synset), com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_id(synset));
    }

    /**
     * Returns the speech-part offset string that identifies the SYNSET within the current
     * WordNet release.
     *
     * @param synset
     * 		; naut-p WordNet synset
     * @return string-p ; the speech part and offset string of the given synset
     */
    @LispMethod(comment = "Returns the speech-part offset string that identifies the SYNSET within the current\r\nWordNet release.\r\n\r\n@param synset\r\n\t\t; naut-p WordNet synset\r\n@return string-p ; the speech part and offset string of the given synset\nReturns the speech-part offset string that identifies the SYNSET within the current\nWordNet release.")
    public static SubLObject wni_synset_speech_part_offset(final SubLObject synset) {
        return wordnet_import.wni_synset_speech_part_offset_helper(nat_functor(synset), wordnet_import.wni_synset_id(synset));
    }

    public static final SubLObject clear_wni_synset_speech_part_offset_helper_alt() {
        {
            SubLObject cs = $wni_synset_speech_part_offset_helper_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_wni_synset_speech_part_offset_helper() {
        final SubLObject cs = wordnet_import.$wni_synset_speech_part_offset_helper_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_wni_synset_speech_part_offset_helper_alt(SubLObject functor, SubLObject synset_id) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_synset_speech_part_offset_helper_caching_state$.getGlobalValue(), list(functor, synset_id), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_wni_synset_speech_part_offset_helper(final SubLObject functor, final SubLObject synset_id) {
        return caching_state_remove_function_results_with_args(wordnet_import.$wni_synset_speech_part_offset_helper_caching_state$.getGlobalValue(), list(functor, synset_id), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns the speech-part offset string that identifies the SYNSET within the current
     * WordNet release.
     *
     * @param functor
     * 		; either #$WordNetSynsetFn or #$WordNetSynsetReifiedFn.
     * @param synset-id
     * 		; integerp identifying a synset
     * @return stringp ; the speech part and offset string of the given synset
     */
    @LispMethod(comment = "Returns the speech-part offset string that identifies the SYNSET within the current\r\nWordNet release.\r\n\r\n@param functor\r\n\t\t; either #$WordNetSynsetFn or #$WordNetSynsetReifiedFn.\r\n@param synset-id\r\n\t\t; integerp identifying a synset\r\n@return stringp ; the speech part and offset string of the given synset\nReturns the speech-part offset string that identifies the SYNSET within the current\nWordNet release.")
    public static final SubLObject wni_synset_speech_part_offset_helper_internal_alt(SubLObject functor, SubLObject synset_id) {
        SubLTrampolineFile.checkType(functor, FORT_P);
        SubLTrampolineFile.checkType(synset_id, POSITIVE_INTEGER_P);
        {
            SubLObject synset = make_unary_formula(functor, synset_id);
            SubLObject sentence = listS($$wnSynsetSpeechPartOffset, synset, $list_alt115);
            SubLObject query_properties = $list_alt116;
            SubLObject results = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
            SubLObject speech_part_offset = NIL;
            speech_part_offset = results.first();
            if (!((NIL != speech_part_offset) || (NIL != inference_datastructures_problem_store.problem_store_p(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_problem_store())))) {
                sleep(FIVE_INTEGER);
                speech_part_offset = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_speech_part_offset(synset);
            }
            SubLTrampolineFile.checkType(speech_part_offset, STRINGP);
            return speech_part_offset;
        }
    }

    /**
     * Returns the speech-part offset string that identifies the SYNSET within the current
     * WordNet release.
     *
     * @param functor
     * 		; either #$WordNetSynsetFn or #$WordNetSynsetReifiedFn.
     * @param synset-id
     * 		; integerp identifying a synset
     * @return stringp ; the speech part and offset string of the given synset
     */
    @LispMethod(comment = "Returns the speech-part offset string that identifies the SYNSET within the current\r\nWordNet release.\r\n\r\n@param functor\r\n\t\t; either #$WordNetSynsetFn or #$WordNetSynsetReifiedFn.\r\n@param synset-id\r\n\t\t; integerp identifying a synset\r\n@return stringp ; the speech part and offset string of the given synset\nReturns the speech-part offset string that identifies the SYNSET within the current\nWordNet release.")
    public static SubLObject wni_synset_speech_part_offset_helper_internal(final SubLObject functor, final SubLObject synset_id) {
        assert NIL != forts.fort_p(functor) : "! forts.fort_p(functor) " + ("forts.fort_p(functor) " + "CommonSymbols.NIL != forts.fort_p(functor) ") + functor;
        assert NIL != subl_promotions.positive_integer_p(synset_id) : "! subl_promotions.positive_integer_p(synset_id) " + ("subl_promotions.positive_integer_p(synset_id) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(synset_id) ") + synset_id;
        final SubLObject synset = make_unary_formula(functor, synset_id);
        final SubLObject sentence = listS(wordnet_import.$$wnSynsetSpeechPartOffset, synset, wordnet_import.$list117);
        final SubLObject query_properties = wordnet_import.$list118;
        final SubLObject results = wordnet_import.wni_trace_new_cyc_query(sentence, wordnet_import.$$WordNetWorkflowCollectorMt, query_properties);
        SubLObject speech_part_offset = NIL;
        speech_part_offset = results.first();
        if ((NIL == speech_part_offset) && (NIL == problem_store_p(wordnet_import.wni_problem_store()))) {
            sleep(FIVE_INTEGER);
            speech_part_offset = wordnet_import.wni_synset_speech_part_offset(synset);
        }
        assert NIL != stringp(speech_part_offset) : "! stringp(speech_part_offset) " + ("Types.stringp(speech_part_offset) " + "CommonSymbols.NIL != Types.stringp(speech_part_offset) ") + speech_part_offset;
        return speech_part_offset;
    }

    public static final SubLObject wni_synset_speech_part_offset_helper_alt(SubLObject functor, SubLObject synset_id) {
        {
            SubLObject caching_state = $wni_synset_speech_part_offset_helper_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(WNI_SYNSET_SPEECH_PART_OFFSET_HELPER, $wni_synset_speech_part_offset_helper_caching_state$, $int$256, EQL, TWO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(functor, synset_id);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw12$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (functor.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && synset_id.eql(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_speech_part_offset_helper_internal(functor, synset_id)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(functor, synset_id));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject wni_synset_speech_part_offset_helper(final SubLObject functor, final SubLObject synset_id) {
        SubLObject caching_state = wordnet_import.$wni_synset_speech_part_offset_helper_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(wordnet_import.WNI_SYNSET_SPEECH_PART_OFFSET_HELPER, wordnet_import.$wni_synset_speech_part_offset_helper_caching_state$, $int$256, EQL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = sxhash_calc_2(functor, synset_id);
        final SubLObject collisions = caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql($memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (functor.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && synset_id.eql(cached_args.first())) {
                        return caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(wordnet_import.wni_synset_speech_part_offset_helper_internal(functor, synset_id)));
        caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(functor, synset_id));
        return caching_results(results3);
    }

    /**
     * Returns a list of the mapped collection terms corresponding to the hypernyms of the given SYNSET.
     *
     * @param synset
     * 		; naut-p
     * @return listp
     */
    @LispMethod(comment = "Returns a list of the mapped collection terms corresponding to the hypernyms of the given SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp")
    public static final SubLObject wni_hypernym_terms_alt(SubLObject synset) {
        SubLTrampolineFile.checkType(synset, POSSIBLY_NAUT_P);
        {
            SubLObject hypernym_terms = NIL;
            SubLObject hypernym_term = NIL;
            SubLObject hypernyms = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_hypernyms(synset);
            {
                SubLObject cdolist_list_var = hypernyms;
                SubLObject hypernym = NIL;
                for (hypernym = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , hypernym = cdolist_list_var.first()) {
                    hypernym_term = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_term(hypernym);
                    if ((NIL != hypernym_term) && (NIL != fort_types_interface.collectionP(hypernym_term))) {
                        hypernym_terms = cons(hypernym_term, hypernym_terms);
                    }
                }
            }
            {
                SubLObject list_var = hypernym_terms;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, FORT_P);
                    }
                }
            }
            return hypernym_terms;
        }
    }

    /**
     * Returns a list of the mapped collection terms corresponding to the hypernyms of the given SYNSET.
     *
     * @param synset
     * 		; naut-p
     * @return listp
     */
    @LispMethod(comment = "Returns a list of the mapped collection terms corresponding to the hypernyms of the given SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp")
    public static SubLObject wni_hypernym_terms(final SubLObject synset) {
        assert NIL != possibly_naut_p(synset) : "! el_utilities.possibly_naut_p(synset) " + ("el_utilities.possibly_naut_p(synset) " + "CommonSymbols.NIL != el_utilities.possibly_naut_p(synset) ") + synset;
        SubLObject hypernym_terms = NIL;
        SubLObject hypernym_term = NIL;
        SubLObject cdolist_list_var;
        final SubLObject hypernyms = cdolist_list_var = wordnet_import.wni_hypernyms(synset);
        SubLObject hypernym = NIL;
        hypernym = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            hypernym_term = wordnet_import.wni_synset_term(hypernym);
            if ((NIL != hypernym_term) && (NIL != collectionP(hypernym_term))) {
                hypernym_terms = cons(hypernym_term, hypernym_terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            hypernym = cdolist_list_var.first();
        } 
        final SubLObject list_var = hypernym_terms;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != forts.fort_p(elem) : "! forts.fort_p(elem) " + ("forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) ") + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return hypernym_terms;
    }

    /**
     * Returns T iff SYNSET has at least one of its hypernyms mapped to a Cyc term.
     *
     * @param synset
     * 		; naut-p
     * @return booleanp
     */
    @LispMethod(comment = "Returns T iff SYNSET has at least one of its hypernyms mapped to a Cyc term.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return booleanp")
    public static final SubLObject wni_hypernym_mappedP_alt(SubLObject synset) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        return sublisp_boolean(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_hypernym_terms(synset));
    }

    /**
     * Returns T iff SYNSET has at least one of its hypernyms mapped to a Cyc term.
     *
     * @param synset
     * 		; naut-p
     * @return booleanp
     */
    @LispMethod(comment = "Returns T iff SYNSET has at least one of its hypernyms mapped to a Cyc term.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return booleanp")
    public static SubLObject wni_hypernym_mappedP(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        return list_utilities.sublisp_boolean(wordnet_import.wni_hypernym_terms(synset));
    }

    /**
     * Returns the synonymous Cyc term for the given WordNet SYNSET or nil if the
     * no synonym is mapped, or if the synonym is mapped to a NAUT.
     *
     * @param synset
     * 		; naut-p WordNet synset
     * @return fort-p ; the synonymous Cyc term
     */
    @LispMethod(comment = "Returns the synonymous Cyc term for the given WordNet SYNSET or nil if the\r\nno synonym is mapped, or if the synonym is mapped to a NAUT.\r\n\r\n@param synset\r\n\t\t; naut-p WordNet synset\r\n@return fort-p ; the synonymous Cyc term\nReturns the synonymous Cyc term for the given WordNet SYNSET or nil if the\nno synonym is mapped, or if the synonym is mapped to a NAUT.")
    public static final SubLObject wni_synset_term_alt(SubLObject synset) {
        return com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_term_helper(cycl_utilities.nat_functor(synset), com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_id(synset));
    }

    /**
     * Returns the synonymous Cyc term for the given WordNet SYNSET or nil if the
     * no synonym is mapped, or if the synonym is mapped to a NAUT.
     *
     * @param synset
     * 		; naut-p WordNet synset
     * @return fort-p ; the synonymous Cyc term
     */
    @LispMethod(comment = "Returns the synonymous Cyc term for the given WordNet SYNSET or nil if the\r\nno synonym is mapped, or if the synonym is mapped to a NAUT.\r\n\r\n@param synset\r\n\t\t; naut-p WordNet synset\r\n@return fort-p ; the synonymous Cyc term\nReturns the synonymous Cyc term for the given WordNet SYNSET or nil if the\nno synonym is mapped, or if the synonym is mapped to a NAUT.")
    public static SubLObject wni_synset_term(final SubLObject synset) {
        return wordnet_import.wni_synset_term_helper(nat_functor(synset), wordnet_import.wni_synset_id(synset));
    }

    public static final SubLObject clear_wni_synset_term_helper_alt() {
        {
            SubLObject cs = $wni_synset_term_helper_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_wni_synset_term_helper() {
        final SubLObject cs = wordnet_import.$wni_synset_term_helper_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_wni_synset_term_helper_alt(SubLObject functor, SubLObject id) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_synset_term_helper_caching_state$.getGlobalValue(), list(functor, id), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_wni_synset_term_helper(final SubLObject functor, final SubLObject id) {
        return caching_state_remove_function_results_with_args(wordnet_import.$wni_synset_term_helper_caching_state$.getGlobalValue(), list(functor, id), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns the synonymous Cyc term for the specified WordNet SYNSET or nil if the
     * no synonym is mapped, or if the synonym is mapped to a NAUT.
     *
     * @return fort-p ; the synonymous Cyc term
     */
    @LispMethod(comment = "Returns the synonymous Cyc term for the specified WordNet SYNSET or nil if the\r\nno synonym is mapped, or if the synonym is mapped to a NAUT.\r\n\r\n@return fort-p ; the synonymous Cyc term\nReturns the synonymous Cyc term for the specified WordNet SYNSET or nil if the\nno synonym is mapped, or if the synonym is mapped to a NAUT.")
    public static final SubLObject wni_synset_term_helper_internal_alt(SubLObject functor, SubLObject id) {
        SubLTrampolineFile.checkType(functor, INDEXED_TERM_P);
        SubLTrampolineFile.checkType(id, POSITIVE_INTEGER_P);
        {
            SubLObject speech_part_offset = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_speech_part_offset_helper(functor, id);
            SubLObject sentence = list($$synonymousExternalConcept, $sym125$_TERM, $const126$WordNet_Version2_0, speech_part_offset);
            SubLObject query_properties = $list_alt127;
            SubLObject results = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
            SubLObject v_term = results.first();
            if (NIL == fort_p(v_term)) {
                v_term = NIL;
            }
            if (NIL != v_term) {
                SubLTrampolineFile.checkType(v_term, FORT_P);
            }
            return v_term;
        }
    }

    /**
     * Returns the synonymous Cyc term for the specified WordNet SYNSET or nil if the
     * no synonym is mapped, or if the synonym is mapped to a NAUT.
     *
     * @return fort-p ; the synonymous Cyc term
     */
    @LispMethod(comment = "Returns the synonymous Cyc term for the specified WordNet SYNSET or nil if the\r\nno synonym is mapped, or if the synonym is mapped to a NAUT.\r\n\r\n@return fort-p ; the synonymous Cyc term\nReturns the synonymous Cyc term for the specified WordNet SYNSET or nil if the\nno synonym is mapped, or if the synonym is mapped to a NAUT.")
    public static SubLObject wni_synset_term_helper_internal(final SubLObject functor, final SubLObject id) {
        assert NIL != indexed_term_p(functor) : "! kb_indexing_datastructures.indexed_term_p(functor) " + ("kb_indexing_datastructures.indexed_term_p(functor) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(functor) ") + functor;
        assert NIL != subl_promotions.positive_integer_p(id) : "! subl_promotions.positive_integer_p(id) " + ("subl_promotions.positive_integer_p(id) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(id) ") + id;
        final SubLObject speech_part_offset = wordnet_import.wni_synset_speech_part_offset_helper(functor, id);
        final SubLObject sentence = list(wordnet_import.$$synonymousExternalConcept, wordnet_import.$sym127$_TERM, wordnet_import.$const128$WordNet_Version2_0, speech_part_offset);
        final SubLObject query_properties = wordnet_import.$list129;
        final SubLObject results = wordnet_import.wni_trace_new_cyc_query(sentence, wordnet_import.$$WordNetWorkflowCollectorMt, query_properties);
        SubLObject v_term = results.first();
        if (NIL == forts.fort_p(v_term)) {
            v_term = NIL;
        }
        if (((NIL != v_term) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == forts.fort_p(v_term))) {
            throw new AssertionError(v_term);
        }
        return v_term;
    }

    public static final SubLObject wni_synset_term_helper_alt(SubLObject functor, SubLObject id) {
        {
            SubLObject caching_state = $wni_synset_term_helper_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(WNI_SYNSET_TERM_HELPER, $wni_synset_term_helper_caching_state$, $int$1000, EQL, TWO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(functor, id);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw12$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (functor.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && id.eql(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_term_helper_internal(functor, id)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(functor, id));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject wni_synset_term_helper(final SubLObject functor, final SubLObject id) {
        SubLObject caching_state = wordnet_import.$wni_synset_term_helper_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(wordnet_import.WNI_SYNSET_TERM_HELPER, wordnet_import.$wni_synset_term_helper_caching_state$, $int$1000, EQL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = sxhash_calc_2(functor, id);
        final SubLObject collisions = caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql($memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (functor.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && id.eql(cached_args.first())) {
                        return caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(wordnet_import.wni_synset_term_helper_internal(functor, id)));
        caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(functor, id));
        return caching_results(results3);
    }

    /**
     * Returns a chain of unmapped hypernym synsets above and including the given WordNet SYNSET as the last element.
     *
     * @param synset
     * 		; naut-p, the given WordNet SYNSET
     * @return listp ; the chain of unmapped hypernym synsets
     */
    @LispMethod(comment = "Returns a chain of unmapped hypernym synsets above and including the given WordNet SYNSET as the last element.\r\n\r\n@param synset\r\n\t\t; naut-p, the given WordNet SYNSET\r\n@return listp ; the chain of unmapped hypernym synsets")
    public static final SubLObject wni_unmapped_hypernym_chain_alt(SubLObject synset) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        {
            SubLObject unmapped_hypernym_chain = list(synset);
            SubLObject hypernym = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_ensure_naut(synset);
            SubLObject doneP = NIL;
            while (NIL == doneP) {
                hypernym = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_hypernyms(hypernym).first();
                if (NIL != hypernym) {
                    if (NIL != com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_term(hypernym)) {
                        doneP = T;
                    } else {
                        unmapped_hypernym_chain = cons(hypernym, unmapped_hypernym_chain);
                    }
                } else {
                    doneP = T;
                }
            } 
            {
                SubLObject list_var = unmapped_hypernym_chain;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, NAUT_P);
                    }
                }
            }
            return unmapped_hypernym_chain;
        }
    }

    /**
     * Returns a chain of unmapped hypernym synsets above and including the given WordNet SYNSET as the last element.
     *
     * @param synset
     * 		; naut-p, the given WordNet SYNSET
     * @return listp ; the chain of unmapped hypernym synsets
     */
    @LispMethod(comment = "Returns a chain of unmapped hypernym synsets above and including the given WordNet SYNSET as the last element.\r\n\r\n@param synset\r\n\t\t; naut-p, the given WordNet SYNSET\r\n@return listp ; the chain of unmapped hypernym synsets")
    public static SubLObject wni_unmapped_hypernym_chain(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        SubLObject unmapped_hypernym_chain = list(synset);
        SubLObject hypernym = wordnet_import.wni_ensure_naut(synset);
        SubLObject doneP = NIL;
        while (NIL == doneP) {
            hypernym = wordnet_import.wni_hypernyms(hypernym).first();
            if (NIL != hypernym) {
                if (NIL != wordnet_import.wni_synset_term(hypernym)) {
                    doneP = T;
                } else {
                    unmapped_hypernym_chain = cons(hypernym, unmapped_hypernym_chain);
                }
            } else {
                doneP = T;
            }
        } 
        final SubLObject list_var = unmapped_hypernym_chain;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != narts_high.naut_p(elem) : "! narts_high.naut_p(elem) " + ("narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return unmapped_hypernym_chain;
    }

    /**
     * Returns the words for the given SYNSET.
     *
     * @param synset
     * 		; naut-p
     */
    @LispMethod(comment = "Returns the words for the given SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p")
    public static final SubLObject wni_synset_wXo_links_alt(SubLObject synset) {
        return com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_wXo_links_helper(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_ensure_naut(synset));
    }

    /**
     * Returns the words for the given SYNSET.
     *
     * @param synset
     * 		; naut-p
     */
    @LispMethod(comment = "Returns the words for the given SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p")
    public static SubLObject wni_synset_wXo_links(final SubLObject synset) {
        return wordnet_import.wni_synset_wXo_links_helper(wordnet_import.wni_ensure_naut(synset));
    }

    public static final SubLObject clear_wni_synset_wXo_links_helper_alt() {
        {
            SubLObject cs = $wni_synset_wXo_links_helper_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_wni_synset_wXo_links_helper() {
        final SubLObject cs = wordnet_import.$wni_synset_wXo_links_helper_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_wni_synset_wXo_links_helper_alt(SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_synset_wXo_links_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_wni_synset_wXo_links_helper(final SubLObject synset) {
        return caching_state_remove_function_results_with_args(wordnet_import.$wni_synset_wXo_links_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns the words for the given SYNSET.
     *
     * @param synset
     * 		; naut-p
     */
    @LispMethod(comment = "Returns the words for the given SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p")
    public static final SubLObject wni_synset_wXo_links_helper_internal_alt(SubLObject synset) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        {
            SubLObject words = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_words(synset);
            SubLObject first_wordP = T;
            SubLObject string = NIL;
            string = $str_alt132$_;
            {
                SubLObject cdolist_list_var = words;
                SubLObject word = NIL;
                for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                    if (NIL != first_wordP) {
                        first_wordP = NIL;
                    } else {
                        string = cconcatenate(string, $str_alt133$___);
                    }
                    string = cconcatenate(string, word);
                }
            }
            string = cconcatenate(string, $str_alt134$_);
            return string;
        }
    }

    /**
     * Returns the words for the given SYNSET.
     *
     * @param synset
     * 		; naut-p
     */
    @LispMethod(comment = "Returns the words for the given SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p")
    public static SubLObject wni_synset_wXo_links_helper_internal(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        final SubLObject words = wordnet_import.wni_synset_words(synset);
        SubLObject first_wordP = T;
        SubLObject string = NIL;
        string = wordnet_import.$str134$_;
        SubLObject cdolist_list_var = words;
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != first_wordP) {
                first_wordP = NIL;
            } else {
                string = cconcatenate(string, wordnet_import.$str135$___);
            }
            string = cconcatenate(string, word);
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        string = cconcatenate(string, wordnet_import.$str136$_);
        return string;
    }

    public static final SubLObject wni_synset_wXo_links_helper_alt(SubLObject synset) {
        {
            SubLObject caching_state = $wni_synset_wXo_links_helper_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym131$WNI_SYNSET_W_O_LINKS_HELPER, $sym135$_WNI_SYNSET_W_O_LINKS_HELPER_CACHING_STATE_, $int$100, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, $kw12$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw12$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_wXo_links_helper_internal(synset)));
                    memoization_state.caching_state_put(caching_state, synset, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject wni_synset_wXo_links_helper(final SubLObject synset) {
        SubLObject caching_state = wordnet_import.$wni_synset_wXo_links_helper_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(wordnet_import.$sym133$WNI_SYNSET_W_O_LINKS_HELPER, wordnet_import.$sym137$_WNI_SYNSET_W_O_LINKS_HELPER_CACHING_STATE_, $int$100, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = caching_state_lookup(caching_state, synset, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wordnet_import.wni_synset_wXo_links_helper_internal(synset)));
            caching_state_put(caching_state, synset, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    /**
     * Returns T iff the given (verb) synset causes another verb synset.
     *
     * @param synset
     * 		; naut-p
     * @return booleanp
     */
    @LispMethod(comment = "Returns T iff the given (verb) synset causes another verb synset.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return booleanp")
    public static final SubLObject wni_synset_is_causerP_alt(SubLObject synset) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        return sublisp_boolean(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synsets_caused_by(synset));
    }

    /**
     * Returns T iff the given (verb) synset causes another verb synset.
     *
     * @param synset
     * 		; naut-p
     * @return booleanp
     */
    @LispMethod(comment = "Returns T iff the given (verb) synset causes another verb synset.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return booleanp")
    public static SubLObject wni_synset_is_causerP(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        return list_utilities.sublisp_boolean(wordnet_import.wni_synsets_caused_by(synset));
    }

    /**
     * Returns the verb synsets that are caused by the given synset.
     *
     * @param synset
     * 		; naut-p
     * @return listp
     */
    @LispMethod(comment = "Returns the verb synsets that are caused by the given synset.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp")
    public static final SubLObject wni_synsets_caused_by_alt(SubLObject synset) {
        return com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synsets_caused_by_helper(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_ensure_naut(synset));
    }

    /**
     * Returns the verb synsets that are caused by the given synset.
     *
     * @param synset
     * 		; naut-p
     * @return listp
     */
    @LispMethod(comment = "Returns the verb synsets that are caused by the given synset.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp")
    public static SubLObject wni_synsets_caused_by(final SubLObject synset) {
        return wordnet_import.wni_synsets_caused_by_helper(wordnet_import.wni_ensure_naut(synset));
    }

    public static final SubLObject clear_wni_synsets_caused_by_helper_alt() {
        {
            SubLObject cs = $wni_synsets_caused_by_helper_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_wni_synsets_caused_by_helper() {
        final SubLObject cs = wordnet_import.$wni_synsets_caused_by_helper_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_wni_synsets_caused_by_helper_alt(SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_synsets_caused_by_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_wni_synsets_caused_by_helper(final SubLObject synset) {
        return caching_state_remove_function_results_with_args(wordnet_import.$wni_synsets_caused_by_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns the verb synsets that are caused by the given synset.
     *
     * @param synset
     * 		; naut-p
     * @return listp
     */
    @LispMethod(comment = "Returns the verb synsets that are caused by the given synset.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp")
    public static final SubLObject wni_synsets_caused_by_helper_internal_alt(SubLObject synset) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        {
            SubLObject caused_synsets = NIL;
            SubLObject caused_synset = NIL;
            SubLObject sentence = listS($$wnCause, synset, $list_alt141);
            SubLObject query_properties = $list_alt7;
            SubLObject results = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
            {
                SubLObject cdolist_list_var = results;
                SubLObject result = NIL;
                for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                    caused_synset = result.first().rest();
                    if (!caused_synset.equal(synset)) {
                        caused_synsets = cons(caused_synset, caused_synsets);
                    }
                }
            }
            {
                SubLObject list_var = caused_synsets;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, NAUT_P);
                    }
                }
            }
            return caused_synsets;
        }
    }

    /**
     * Returns the verb synsets that are caused by the given synset.
     *
     * @param synset
     * 		; naut-p
     * @return listp
     */
    @LispMethod(comment = "Returns the verb synsets that are caused by the given synset.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp")
    public static SubLObject wni_synsets_caused_by_helper_internal(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        SubLObject caused_synsets = NIL;
        SubLObject caused_synset = NIL;
        final SubLObject sentence = listS(wordnet_import.$$wnCause, synset, wordnet_import.$list143);
        final SubLObject query_properties = wordnet_import.$list9;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wordnet_import.wni_trace_new_cyc_query(sentence, wordnet_import.$$WordNetWorkflowCollectorMt, query_properties);
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            caused_synset = result.first().rest();
            if (!caused_synset.equal(synset)) {
                caused_synsets = cons(caused_synset, caused_synsets);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        final SubLObject list_var = caused_synsets;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != narts_high.naut_p(elem) : "! narts_high.naut_p(elem) " + ("narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) ") + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return caused_synsets;
    }

    public static final SubLObject wni_synsets_caused_by_helper_alt(SubLObject synset) {
        {
            SubLObject caching_state = $wni_synsets_caused_by_helper_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(WNI_SYNSETS_CAUSED_BY_HELPER, $wni_synsets_caused_by_helper_caching_state$, TEN_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, $kw12$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw12$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synsets_caused_by_helper_internal(synset)));
                    memoization_state.caching_state_put(caching_state, synset, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject wni_synsets_caused_by_helper(final SubLObject synset) {
        SubLObject caching_state = wordnet_import.$wni_synsets_caused_by_helper_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(wordnet_import.WNI_SYNSETS_CAUSED_BY_HELPER, wordnet_import.$wni_synsets_caused_by_helper_caching_state$, TEN_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = caching_state_lookup(caching_state, synset, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wordnet_import.wni_synsets_caused_by_helper_internal(synset)));
            caching_state_put(caching_state, synset, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    /**
     * Returns T iff the given (verb) synset is caused by another verb synset.
     *
     * @param synset
     * 		; naut-p
     * @return booleanp
     */
    @LispMethod(comment = "Returns T iff the given (verb) synset is caused by another verb synset.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return booleanp")
    public static final SubLObject wni_synset_is_caused_byP_alt(SubLObject synset) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        return sublisp_boolean(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synsets_caused_by(synset));
    }

    /**
     * Returns T iff the given (verb) synset is caused by another verb synset.
     *
     * @param synset
     * 		; naut-p
     * @return booleanp
     */
    @LispMethod(comment = "Returns T iff the given (verb) synset is caused by another verb synset.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return booleanp")
    public static SubLObject wni_synset_is_caused_byP(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        return list_utilities.sublisp_boolean(wordnet_import.wni_synsets_caused_by(synset));
    }

    /**
     * Returns the verb synsets that cause the given verb synset.
     *
     * @param synset
     * 		; naut-p
     * @return listp
     */
    @LispMethod(comment = "Returns the verb synsets that cause the given verb synset.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp")
    public static final SubLObject wni_synsets_causing_alt(SubLObject synset) {
        return com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synsets_causing_helper(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_ensure_naut(synset));
    }

    /**
     * Returns the verb synsets that cause the given verb synset.
     *
     * @param synset
     * 		; naut-p
     * @return listp
     */
    @LispMethod(comment = "Returns the verb synsets that cause the given verb synset.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp")
    public static SubLObject wni_synsets_causing(final SubLObject synset) {
        return wordnet_import.wni_synsets_causing_helper(wordnet_import.wni_ensure_naut(synset));
    }

    public static final SubLObject clear_wni_synsets_causing_helper_alt() {
        {
            SubLObject cs = $wni_synsets_causing_helper_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_wni_synsets_causing_helper() {
        final SubLObject cs = wordnet_import.$wni_synsets_causing_helper_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_wni_synsets_causing_helper_alt(SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_synsets_causing_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_wni_synsets_causing_helper(final SubLObject synset) {
        return caching_state_remove_function_results_with_args(wordnet_import.$wni_synsets_causing_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns the verb synsets that cause the given verb synset.
     *
     * @param synset
     * 		; naut-p
     * @return listp
     */
    @LispMethod(comment = "Returns the verb synsets that cause the given verb synset.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp")
    public static final SubLObject wni_synsets_causing_helper_internal_alt(SubLObject synset) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        {
            SubLObject causing_synsets = NIL;
            SubLObject causing_synset = NIL;
            SubLObject sentence = list($$wnCause, $sym146$_CAUSING_SYNSET, synset);
            SubLObject query_properties = $list_alt7;
            SubLObject results = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
            {
                SubLObject cdolist_list_var = results;
                SubLObject result = NIL;
                for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                    causing_synset = result.first().rest();
                    if (!causing_synset.equal(synset)) {
                        causing_synsets = cons(causing_synset, causing_synsets);
                    }
                }
            }
            {
                SubLObject list_var = causing_synsets;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, NAUT_P);
                    }
                }
            }
            return causing_synsets;
        }
    }

    /**
     * Returns the verb synsets that cause the given verb synset.
     *
     * @param synset
     * 		; naut-p
     * @return listp
     */
    @LispMethod(comment = "Returns the verb synsets that cause the given verb synset.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp")
    public static SubLObject wni_synsets_causing_helper_internal(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        SubLObject causing_synsets = NIL;
        SubLObject causing_synset = NIL;
        final SubLObject sentence = list(wordnet_import.$$wnCause, wordnet_import.$sym148$_CAUSING_SYNSET, synset);
        final SubLObject query_properties = wordnet_import.$list9;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wordnet_import.wni_trace_new_cyc_query(sentence, wordnet_import.$$WordNetWorkflowCollectorMt, query_properties);
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            causing_synset = result.first().rest();
            if (!causing_synset.equal(synset)) {
                causing_synsets = cons(causing_synset, causing_synsets);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        final SubLObject list_var = causing_synsets;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != narts_high.naut_p(elem) : "! narts_high.naut_p(elem) " + ("narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) ") + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return causing_synsets;
    }

    public static final SubLObject wni_synsets_causing_helper_alt(SubLObject synset) {
        {
            SubLObject caching_state = $wni_synsets_causing_helper_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(WNI_SYNSETS_CAUSING_HELPER, $wni_synsets_causing_helper_caching_state$, TEN_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, $kw12$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw12$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synsets_causing_helper_internal(synset)));
                    memoization_state.caching_state_put(caching_state, synset, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject wni_synsets_causing_helper(final SubLObject synset) {
        SubLObject caching_state = wordnet_import.$wni_synsets_causing_helper_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(wordnet_import.WNI_SYNSETS_CAUSING_HELPER, wordnet_import.$wni_synsets_causing_helper_caching_state$, TEN_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = caching_state_lookup(caching_state, synset, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wordnet_import.wni_synsets_causing_helper_internal(synset)));
            caching_state_put(caching_state, synset, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    /**
     * Parses the gloss and returns the geographical entity that contains the given urban area SYNSET.
     *
     * @param synset;
     * 		naut-p, the WordNet synset
     * @return ; fort-p, the geographical entity that contains the given urban area SYNSET
     */
    @LispMethod(comment = "Parses the gloss and returns the geographical entity that contains the given urban area SYNSET.\r\n\r\n@param synset;\r\n\t\tnaut-p, the WordNet synset\r\n@return ; fort-p, the geographical entity that contains the given urban area SYNSET")
    public static final SubLObject wni_urban_area_geographical_entity_alt(SubLObject synset) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        {
            SubLObject gloss_words = string_utilities.split_string(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_gloss(synset), UNPROVIDED);
            SubLObject gloss_word = NIL;
            SubLObject ancientP = NIL;
            SubLObject doneP = NIL;
            SubLObject place_name_words = NIL;
            SubLObject place_name = NIL;
            SubLObject place_name_denotations = NIL;
            SubLObject place_name_denotation = NIL;
            while (NIL == doneP) {
                if (NIL == gloss_words) {
                    return NIL;
                }
                gloss_word = gloss_words.first();
                gloss_words = gloss_words.rest();
                if (NIL != Strings.stringE(gloss_word, $$$ancient, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    ancientP = T;
                } else {
                    if ((NIL != ancientP) && (NIL != Strings.stringE(gloss_word, $$$Greek, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                        ancientP = NIL;
                    } else {
                        ancientP = NIL;
                        if (NIL != upper_case_p(string_utilities.first_char(gloss_word))) {
                            place_name_words = cons(gloss_word, place_name_words);
                        } else {
                            if (NIL != place_name_words) {
                                place_name = string_utilities.join_strings(reverse(place_name_words), $str_alt150$_);
                                if ((((((((((((((NIL != string_utilities.starts_with(place_name, $$$Atlantic)) || (NIL != string_utilities.starts_with(place_name, $$$Pacific))) || (NIL != string_utilities.starts_with(place_name, $$$Crown_Colony))) || (NIL != string_utilities.starts_with(place_name, $$$Caribbean))) || (NIL != string_utilities.starts_with(place_name, $$$State))) || (NIL != string_utilities.starts_with(place_name, $$$Lake_Erie))) || (NIL != string_utilities.starts_with(place_name, $$$Asia_Minor))) || (NIL != string_utilities.starts_with(place_name, $$$Elbo_River))) || (NIL != string_utilities.starts_with(place_name, $$$Asian))) || (NIL != string_utilities.starts_with(place_name, $$$Yourba))) || (NIL != string_utilities.starts_with(place_name, $$$Japanese))) || (NIL != string_utilities.starts_with(place_name, $$$Nile))) || (NIL != string_utilities.starts_with(place_name, $$$River_Thames))) || (NIL != string_utilities.starts_with(place_name, $$$River_Aire))) {
                                    place_name_words = NIL;
                                } else {
                                    doneP = T;
                                }
                            }
                        }
                    }
                }
            } 
            if (NIL == place_name) {
                return NIL;
            }
            place_name = string_utilities.remove_substring(place_name, $str_alt165$_s);
            place_name_denotations = lexicon_accessors.denots_of_string(place_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            while (true) {
                if (NIL == place_name_denotations) {
                    return NIL;
                }
                place_name_denotation = place_name_denotations.first();
                place_name_denotations = place_name_denotations.rest();
                if ((NIL != isa.isa_in_any_mtP(place_name_denotation, $$GeopoliticalEntity)) && (NIL == isa.isa_in_any_mtP(place_name_denotation, $$City))) {
                    return place_name_denotation;
                }
            } 
        }
    }

    /**
     * Parses the gloss and returns the geographical entity that contains the given urban area SYNSET.
     *
     * @param synset;
     * 		naut-p, the WordNet synset
     * @return ; fort-p, the geographical entity that contains the given urban area SYNSET
     */
    @LispMethod(comment = "Parses the gloss and returns the geographical entity that contains the given urban area SYNSET.\r\n\r\n@param synset;\r\n\t\tnaut-p, the WordNet synset\r\n@return ; fort-p, the geographical entity that contains the given urban area SYNSET")
    public static SubLObject wni_urban_area_geographical_entity(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        SubLObject gloss_words = split_string(wordnet_import.wni_synset_gloss(synset), UNPROVIDED);
        SubLObject gloss_word = NIL;
        SubLObject ancientP = NIL;
        SubLObject doneP = NIL;
        SubLObject place_name_words = NIL;
        SubLObject place_name = NIL;
        SubLObject place_name_denotations = NIL;
        SubLObject place_name_denotation = NIL;
        while (NIL == doneP) {
            if (NIL == gloss_words) {
                return NIL;
            }
            gloss_word = gloss_words.first();
            gloss_words = gloss_words.rest();
            if (NIL != Strings.stringE(gloss_word, wordnet_import.$$$ancient, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                ancientP = T;
            } else
                if ((NIL != ancientP) && (NIL != Strings.stringE(gloss_word, wordnet_import.$$$Greek, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    ancientP = NIL;
                } else {
                    ancientP = NIL;
                    if (NIL != upper_case_p(first_char(gloss_word))) {
                        place_name_words = cons(gloss_word, place_name_words);
                    } else {
                        if (NIL == place_name_words) {
                            continue;
                        }
                        place_name = join_strings(reverse(place_name_words), wordnet_import.$$$_);
                        if ((((((((((((((NIL != starts_with(place_name, wordnet_import.$$$Atlantic)) || (NIL != starts_with(place_name, wordnet_import.$$$Pacific))) || (NIL != starts_with(place_name, wordnet_import.$$$Crown_Colony))) || (NIL != starts_with(place_name, wordnet_import.$$$Caribbean))) || (NIL != starts_with(place_name, wordnet_import.$$$State))) || (NIL != starts_with(place_name, wordnet_import.$$$Lake_Erie))) || (NIL != starts_with(place_name, wordnet_import.$$$Asia_Minor))) || (NIL != starts_with(place_name, wordnet_import.$$$Elbo_River))) || (NIL != starts_with(place_name, wordnet_import.$$$Asian))) || (NIL != starts_with(place_name, wordnet_import.$$$Yourba))) || (NIL != starts_with(place_name, wordnet_import.$$$Japanese))) || (NIL != starts_with(place_name, wordnet_import.$$$Nile))) || (NIL != starts_with(place_name, wordnet_import.$$$River_Thames))) || (NIL != starts_with(place_name, wordnet_import.$$$River_Aire))) {
                            place_name_words = NIL;
                        } else {
                            doneP = T;
                        }
                    }
                }

        } 
        if (NIL == place_name) {
            return NIL;
        }
        place_name = remove_substring(place_name, wordnet_import.$str167$_s);
        place_name_denotations = denots_of_string(place_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        while (NIL != place_name_denotations) {
            place_name_denotation = place_name_denotations.first();
            place_name_denotations = place_name_denotations.rest();
            if ((NIL != isa_in_any_mtP(place_name_denotation, wordnet_import.$$GeopoliticalEntity)) && (NIL == isa_in_any_mtP(place_name_denotation, wordnet_import.$$City))) {
                return place_name_denotation;
            }
        } 
        return NIL;
    }

    /**
     * Returns a list of synsets having the given speech part
     *
     * @param pos
     * 		; fort-p, either #$Noun, #$Verb, #$Adjective or #$Adverb
     * @return ; listp, of naut-p
     */
    @LispMethod(comment = "Returns a list of synsets having the given speech part\r\n\r\n@param pos\r\n\t\t; fort-p, either #$Noun, #$Verb, #$Adjective or #$Adverb\r\n@return ; listp, of naut-p")
    public static final SubLObject wni_synsets_having_pos_alt(SubLObject pos) {
        SubLTrampolineFile.checkType(pos, FORT_P);
        {
            SubLObject synsets = NIL;
            SubLObject sentence = list($$wnSynsetSpeechPart, $sym5$_SYNSET, pos);
            SubLObject query_properties = $list_alt7;
            SubLObject results = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
            if (NIL != results) {
                {
                    SubLObject cdolist_list_var = results;
                    SubLObject result = NIL;
                    for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                        synsets = cons(result.first().rest(), synsets);
                    }
                }
            }
            {
                SubLObject list_var = synsets;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, NAUT_P);
                    }
                }
            }
            return synsets;
        }
    }

    /**
     * Returns a list of synsets having the given speech part
     *
     * @param pos
     * 		; fort-p, either #$Noun, #$Verb, #$Adjective or #$Adverb
     * @return ; listp, of naut-p
     */
    @LispMethod(comment = "Returns a list of synsets having the given speech part\r\n\r\n@param pos\r\n\t\t; fort-p, either #$Noun, #$Verb, #$Adjective or #$Adverb\r\n@return ; listp, of naut-p")
    public static SubLObject wni_synsets_having_pos(final SubLObject pos) {
        assert NIL != forts.fort_p(pos) : "! forts.fort_p(pos) " + ("forts.fort_p(pos) " + "CommonSymbols.NIL != forts.fort_p(pos) ") + pos;
        SubLObject synsets = NIL;
        final SubLObject sentence = list(wordnet_import.$$wnSynsetSpeechPart, wordnet_import.$sym7$_SYNSET, pos);
        final SubLObject query_properties = wordnet_import.$list9;
        final SubLObject results = wordnet_import.wni_trace_new_cyc_query(sentence, wordnet_import.$$WordNetWorkflowCollectorMt, query_properties);
        if (NIL != results) {
            SubLObject cdolist_list_var = results;
            SubLObject result = NIL;
            result = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                synsets = cons(result.first().rest(), synsets);
                cdolist_list_var = cdolist_list_var.rest();
                result = cdolist_list_var.first();
            } 
        }
        final SubLObject list_var = synsets;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != narts_high.naut_p(elem) : "! narts_high.naut_p(elem) " + ("narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) ") + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return synsets;
    }

    /**
     * Returns a list of the WordNet synsets mapped to the given TERM.
     *
     * @param term
     * 		; the given reified term
     * @return list-p ; of naut-p synsets
     */
    @LispMethod(comment = "Returns a list of the WordNet synsets mapped to the given TERM.\r\n\r\n@param term\r\n\t\t; the given reified term\r\n@return list-p ; of naut-p synsets")
    public static final SubLObject wni_terms_synsets_alt(SubLObject v_term) {
        SubLTrampolineFile.checkType(v_term, FORT_P);
        {
            SubLObject speech_part_offsets = NIL;
            SubLObject synset = NIL;
            SubLObject synsets = NIL;
            SubLObject sentence = listS($$synonymousExternalConcept, v_term, $list_alt170);
            SubLObject query_properties = $list_alt171;
            SubLObject results = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
            if (NIL != results) {
                {
                    SubLObject cdolist_list_var = results;
                    SubLObject v_bindings = NIL;
                    for (v_bindings = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_bindings = cdolist_list_var.first()) {
                        speech_part_offsets = cons(bindings.variable_lookup($sym172$_SPEECH_PART_OFFSET, v_bindings), speech_part_offsets);
                    }
                }
            }
            {
                SubLObject cdolist_list_var = speech_part_offsets;
                SubLObject speech_part_offset = NIL;
                for (speech_part_offset = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , speech_part_offset = cdolist_list_var.first()) {
                    synset = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_speech_part_offset_to_synset(speech_part_offset);
                    if (NIL != synset) {
                        synsets = cons(synset, synsets);
                    }
                }
            }
            {
                SubLObject list_var = synsets;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, NAUT_P);
                    }
                }
            }
            return synsets;
        }
    }

    /**
     * Returns a list of the WordNet synsets mapped to the given TERM.
     *
     * @param term
     * 		; the given reified term
     * @return list-p ; of naut-p synsets
     */
    @LispMethod(comment = "Returns a list of the WordNet synsets mapped to the given TERM.\r\n\r\n@param term\r\n\t\t; the given reified term\r\n@return list-p ; of naut-p synsets")
    public static SubLObject wni_terms_synsets(final SubLObject v_term) {
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        SubLObject speech_part_offsets = NIL;
        SubLObject synset = NIL;
        SubLObject synsets = NIL;
        final SubLObject sentence = listS(wordnet_import.$$synonymousExternalConcept, v_term, wordnet_import.$list172);
        final SubLObject query_properties = wordnet_import.$list173;
        final SubLObject results = wordnet_import.wni_trace_new_cyc_query(sentence, wordnet_import.$$WordNetWorkflowCollectorMt, query_properties);
        if (NIL != results) {
            SubLObject cdolist_list_var = results;
            SubLObject v_bindings = NIL;
            v_bindings = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                speech_part_offsets = cons(variable_lookup(wordnet_import.$sym174$_SPEECH_PART_OFFSET, v_bindings), speech_part_offsets);
                cdolist_list_var = cdolist_list_var.rest();
                v_bindings = cdolist_list_var.first();
            } 
        }
        SubLObject cdolist_list_var = speech_part_offsets;
        SubLObject speech_part_offset = NIL;
        speech_part_offset = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            synset = wordnet_import.wni_speech_part_offset_to_synset(speech_part_offset);
            if (NIL != synset) {
                synsets = cons(synset, synsets);
            }
            cdolist_list_var = cdolist_list_var.rest();
            speech_part_offset = cdolist_list_var.first();
        } 
        final SubLObject list_var = synsets;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != narts_high.naut_p(elem) : "! narts_high.naut_p(elem) " + ("narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) ") + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return synsets;
    }

    public static final SubLObject clear_wni_broader_terms_alt() {
        {
            SubLObject cs = $wni_broader_terms_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_wni_broader_terms() {
        final SubLObject cs = wordnet_import.$wni_broader_terms_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_wni_broader_terms_alt(SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_broader_terms_caching_state$.getGlobalValue(), list(v_term), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_wni_broader_terms(final SubLObject v_term) {
        return caching_state_remove_function_results_with_args(wordnet_import.$wni_broader_terms_caching_state$.getGlobalValue(), list(v_term), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns a list of the most specific collections that are superior to the given collection or
     * individual term.
     *
     * @param term;
     * 		the given fort
     * @return listp
     */
    @LispMethod(comment = "Returns a list of the most specific collections that are superior to the given collection or\r\nindividual term.\r\n\r\n@param term;\r\n\t\tthe given fort\r\n@return listp\nReturns a list of the most specific collections that are superior to the given collection or\nindividual term.")
    public static final SubLObject wni_broader_terms_internal_alt(SubLObject v_term) {
        SubLTrampolineFile.checkType(v_term, FORT_P);
        {
            SubLObject broader_terms = NIL;
            {
                SubLObject cdolist_list_var = (NIL != fort_types_interface.collectionP(v_term)) ? ((SubLObject) (genls.genls(v_term, $$EverythingPSC, UNPROVIDED))) : isa.isa(v_term, $$EverythingPSC, UNPROVIDED);
                SubLObject broader_term = NIL;
                for (broader_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , broader_term = cdolist_list_var.first()) {
                    if (!((NIL != isa.isa_in_any_mtP(broader_term, $$CycKBSubsetCollection)) || (NIL == fort_p(broader_term)))) {
                        broader_terms = cons(broader_term, broader_terms);
                    }
                }
            }
            broader_terms = genls.min_cols(broader_terms, UNPROVIDED, UNPROVIDED);
            {
                SubLObject list_var = broader_terms;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, FORT_P);
                    }
                }
            }
            return broader_terms;
        }
    }

    /**
     * Returns a list of the most specific collections that are superior to the given collection or
     * individual term.
     *
     * @param term;
     * 		the given fort
     * @return listp
     */
    @LispMethod(comment = "Returns a list of the most specific collections that are superior to the given collection or\r\nindividual term.\r\n\r\n@param term;\r\n\t\tthe given fort\r\n@return listp\nReturns a list of the most specific collections that are superior to the given collection or\nindividual term.")
    public static SubLObject wni_broader_terms_internal(final SubLObject v_term) {
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        SubLObject broader_terms = NIL;
        SubLObject cdolist_list_var = (NIL != collectionP(v_term)) ? genls(v_term, wordnet_import.$$EverythingPSC, UNPROVIDED) : isa(v_term, wordnet_import.$$EverythingPSC, UNPROVIDED);
        SubLObject broader_term = NIL;
        broader_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == isa_in_any_mtP(broader_term, wordnet_import.$$CycKBSubsetCollection)) && (NIL != forts.fort_p(broader_term))) {
                broader_terms = cons(broader_term, broader_terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            broader_term = cdolist_list_var.first();
        } 
        final SubLObject list_var;
        broader_terms = list_var = min_cols(broader_terms, UNPROVIDED, UNPROVIDED);
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != forts.fort_p(elem) : "! forts.fort_p(elem) " + ("forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) ") + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return broader_terms;
    }

    public static final SubLObject wni_broader_terms_alt(SubLObject v_term) {
        {
            SubLObject caching_state = $wni_broader_terms_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(WNI_BROADER_TERMS, $wni_broader_terms_caching_state$, TEN_INTEGER, EQ, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, $kw12$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw12$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_broader_terms_internal(v_term)));
                    memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject wni_broader_terms(final SubLObject v_term) {
        SubLObject caching_state = wordnet_import.$wni_broader_terms_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(wordnet_import.WNI_BROADER_TERMS, wordnet_import.$wni_broader_terms_caching_state$, TEN_INTEGER, EQ, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = caching_state_lookup(caching_state, v_term, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wordnet_import.wni_broader_terms_internal(v_term)));
            caching_state_put(caching_state, v_term, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    /**
     * Returns a list of pairs; the mapped terms of the given POS (speech part, e.g. #$Noun) and their
     * corresponding synset values.
     *
     * @param pos
     * 		; fort-p
     * @return listp
     */
    @LispMethod(comment = "Returns a list of pairs; the mapped terms of the given POS (speech part, e.g. #$Noun) and their\r\ncorresponding synset values.\r\n\r\n@param pos\r\n\t\t; fort-p\r\n@return listp\nReturns a list of pairs; the mapped terms of the given POS (speech part, e.g. #$Noun) and their\ncorresponding synset values.")
    public static final SubLObject wni_mapped_terms_and_synsets_alt(SubLObject pos) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(pos, FORT_P);
            {
                SubLObject pos_first_char = alist_lookup($wni_1_char_pos_map$.getGlobalValue(), $$Noun, UNPROVIDED, UNPROVIDED);
                SubLObject mapped_terms_and_synsets = NIL;
                SubLObject mapped_terms_and_pos_offsets = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_mapped_terms_and_pos_offsets();
                SubLObject list_var = mapped_terms_and_pos_offsets;
                $progress_note$.setDynamicValue($str_alt178$finding_synsets_for_speech_part_o, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(length(list_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject csome_list_var = list_var;
                            SubLObject mapped_term_and_pos_offset = NIL;
                            for (mapped_term_and_pos_offset = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , mapped_term_and_pos_offset = csome_list_var.first()) {
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                {
                                    SubLObject mapped_term = mapped_term_and_pos_offset.first();
                                    SubLObject pos_offset = second(mapped_term_and_pos_offset);
                                    if (pos_first_char.equal(string_utilities.first_of_string(pos_offset))) {
                                        mapped_terms_and_synsets = cons(list(mapped_term, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_speech_part_offset_to_synset(pos_offset)), mapped_terms_and_synsets);
                                    }
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject list_var_5 = mapped_terms_and_synsets;
                    SubLTrampolineFile.checkType(list_var_5, NON_DOTTED_LIST_P);
                    {
                        SubLObject cdolist_list_var = list_var_5;
                        SubLObject elem = NIL;
                        for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                            SubLTrampolineFile.checkType(elem, LISTP);
                        }
                    }
                }
                return mapped_terms_and_synsets;
            }
        }
    }

    /**
     * Returns a list of pairs; the mapped terms of the given POS (speech part, e.g. #$Noun) and their
     * corresponding synset values.
     *
     * @param pos
     * 		; fort-p
     * @return listp
     */
    @LispMethod(comment = "Returns a list of pairs; the mapped terms of the given POS (speech part, e.g. #$Noun) and their\r\ncorresponding synset values.\r\n\r\n@param pos\r\n\t\t; fort-p\r\n@return listp\nReturns a list of pairs; the mapped terms of the given POS (speech part, e.g. #$Noun) and their\ncorresponding synset values.")
    public static SubLObject wni_mapped_terms_and_synsets(final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(pos) : "! forts.fort_p(pos) " + ("forts.fort_p(pos) " + "CommonSymbols.NIL != forts.fort_p(pos) ") + pos;
        final SubLObject pos_first_char = list_utilities.alist_lookup(wordnet_import.$wni_1_char_pos_map$.getGlobalValue(), wordnet_import.$$Noun, UNPROVIDED, UNPROVIDED);
        SubLObject mapped_terms_and_synsets = NIL;
        final SubLObject list_var;
        final SubLObject mapped_terms_and_pos_offsets = list_var = wordnet_import.wni_mapped_terms_and_pos_offsets();
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(wordnet_import.$str180$finding_synsets_for_speech_part_o, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject mapped_term_and_pos_offset = NIL;
                mapped_term_and_pos_offset = csome_list_var.first();
                while (NIL != csome_list_var) {
                    final SubLObject mapped_term = mapped_term_and_pos_offset.first();
                    final SubLObject pos_offset = second(mapped_term_and_pos_offset);
                    if (pos_first_char.equal(first_of_string(pos_offset))) {
                        mapped_terms_and_synsets = cons(list(mapped_term, wordnet_import.wni_speech_part_offset_to_synset(pos_offset)), mapped_terms_and_synsets);
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    mapped_term_and_pos_offset = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        final SubLObject list_var_$9 = mapped_terms_and_synsets;
        assert NIL != list_utilities.non_dotted_list_p(list_var_$9) : "! list_utilities.non_dotted_list_p(list_var_$9) " + ("list_utilities.non_dotted_list_p(list_var_$9) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var_$9) ") + list_var_$9;
        SubLObject cdolist_list_var = list_var_$9;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != listp(elem) : "! listp(elem) " + ("Types.listp(elem) " + "CommonSymbols.NIL != Types.listp(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return mapped_terms_and_synsets;
    }

    /**
     * Returns T iff all of the given SYNSET's hypernyms are mapped to Cyc terms.
     *
     * @param synset
     * 		; naut-p
     * @return booleanp
     */
    @LispMethod(comment = "Returns T iff all of the given SYNSET\'s hypernyms are mapped to Cyc terms.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return booleanp")
    public static final SubLObject wni_synset_hypernyms_mappedP_alt(SubLObject synset) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        {
            SubLObject hypernyms = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_hypernyms(synset);
            SubLObject v_term = NIL;
            if (NIL != hypernyms) {
                {
                    SubLObject cdolist_list_var = hypernyms;
                    SubLObject hypernym = NIL;
                    for (hypernym = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , hypernym = cdolist_list_var.first()) {
                        v_term = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_term(hypernym);
                        if (!((NIL != v_term) && (NIL == fort_types_interface.predicateP(v_term)))) {
                            return NIL;
                        }
                    }
                }
            } else {
                return NIL;
            }
        }
        return T;
    }

    /**
     * Returns T iff all of the given SYNSET's hypernyms are mapped to Cyc terms.
     *
     * @param synset
     * 		; naut-p
     * @return booleanp
     */
    @LispMethod(comment = "Returns T iff all of the given SYNSET\'s hypernyms are mapped to Cyc terms.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return booleanp")
    public static SubLObject wni_synset_hypernyms_mappedP(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        final SubLObject hypernyms = wordnet_import.wni_hypernyms(synset);
        SubLObject v_term = NIL;
        if (NIL != hypernyms) {
            SubLObject cdolist_list_var = hypernyms;
            SubLObject hypernym = NIL;
            hypernym = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                v_term = wordnet_import.wni_synset_term(hypernym);
                if ((NIL == v_term) || (NIL != predicateP(v_term))) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                hypernym = cdolist_list_var.first();
            } 
            return T;
        }
        return NIL;
    }

    /**
     * Returns a list of the mapped terms.
     *
     * @return listp
     */
    @LispMethod(comment = "Returns a list of the mapped terms.\r\n\r\n@return listp")
    public static final SubLObject wni_mapped_terms_alt() {
        {
            SubLObject mapped_terms = NIL;
            SubLObject mapped_term = NIL;
            SubLObject sentence = $list_alt182;
            SubLObject query_properties = $list_alt171;
            SubLObject results = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_trace_new_cyc_query(sentence, $$WordNetMappingMt, query_properties);
            {
                SubLObject cdolist_list_var = results;
                SubLObject result = NIL;
                for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                    mapped_term = result.first().rest();
                    if (NIL != fort_p(mapped_term)) {
                        mapped_terms = cons(mapped_term, mapped_terms);
                    }
                }
            }
            {
                SubLObject list_var = mapped_terms;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, FORT_P);
                    }
                }
            }
            return mapped_terms;
        }
    }

    /**
     * Returns a list of the mapped terms.
     *
     * @return listp
     */
    @LispMethod(comment = "Returns a list of the mapped terms.\r\n\r\n@return listp")
    public static SubLObject wni_mapped_terms() {
        SubLObject mapped_terms = NIL;
        SubLObject mapped_term = NIL;
        final SubLObject sentence = wordnet_import.$list184;
        final SubLObject query_properties = wordnet_import.$list173;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wordnet_import.wni_trace_new_cyc_query(sentence, wordnet_import.$$WordNetMappingMt, query_properties);
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            mapped_term = result.first().rest();
            if (NIL != forts.fort_p(mapped_term)) {
                mapped_terms = cons(mapped_term, mapped_terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        final SubLObject list_var = mapped_terms;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != forts.fort_p(elem) : "! forts.fort_p(elem) " + ("forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) ") + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return mapped_terms;
    }

    /**
     * Returns a list of pairs; the mapped terms and their corresponding speech-part-offset values.
     *
     * @return listp
     */
    @LispMethod(comment = "Returns a list of pairs; the mapped terms and their corresponding speech-part-offset values.\r\n\r\n@return listp")
    public static final SubLObject wni_mapped_terms_and_pos_offsets_alt() {
        {
            SubLObject value_pairs = NIL;
            SubLObject sentence = $list_alt185;
            SubLObject query_properties = $list_alt171;
            SubLObject results = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_trace_new_cyc_query(sentence, $$WordNetMappingMt, query_properties);
            {
                SubLObject cdolist_list_var = results;
                SubLObject result = NIL;
                for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                    value_pairs = cons(list(result.first().rest(), second(result).rest()), value_pairs);
                }
            }
            {
                SubLObject list_var = value_pairs;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, LISTP);
                    }
                }
            }
            return value_pairs;
        }
    }

    /**
     * Returns a list of pairs; the mapped terms and their corresponding speech-part-offset values.
     *
     * @return listp
     */
    @LispMethod(comment = "Returns a list of pairs; the mapped terms and their corresponding speech-part-offset values.\r\n\r\n@return listp")
    public static SubLObject wni_mapped_terms_and_pos_offsets() {
        SubLObject value_pairs = NIL;
        final SubLObject sentence = wordnet_import.$list187;
        final SubLObject query_properties = wordnet_import.$list173;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wordnet_import.wni_trace_new_cyc_query(sentence, wordnet_import.$$WordNetMappingMt, query_properties);
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            value_pairs = cons(list(result.first().rest(), second(result).rest()), value_pairs);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        final SubLObject list_var = value_pairs;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != listp(elem) : "! listp(elem) " + ("Types.listp(elem) " + "CommonSymbols.NIL != Types.listp(elem) ") + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return value_pairs;
    }

    /**
     * Returns the synset identified by the given POS-OFFSET (e.g. N05969222) within the current
     * WordNet release.
     *
     * @param pos-offset
     * 		; stringp WordNet speech part / offset value
     * @return naut-p ; the synset
     */
    @LispMethod(comment = "Returns the synset identified by the given POS-OFFSET (e.g. N05969222) within the current\r\nWordNet release.\r\n\r\n@param pos-offset\r\n\t\t; stringp WordNet speech part / offset value\r\n@return naut-p ; the synset\nReturns the synset identified by the given POS-OFFSET (e.g. N05969222) within the current\nWordNet release.")
    public static final SubLObject wni_speech_part_offset_to_synset_alt(SubLObject pos_offset) {
        SubLTrampolineFile.checkType(pos_offset, STRINGP);
        {
            SubLObject synset = NIL;
            SubLObject sentence = list($$wnSynsetSpeechPartOffset, $sym5$_SYNSET, pos_offset);
            SubLObject query_properties = $list_alt187;
            SubLObject results = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
            if (NIL != results) {
                synset = results.first().first().rest();
            }
            if (NIL != synset) {
                SubLTrampolineFile.checkType(synset, NAUT_P);
            }
            return synset;
        }
    }

    /**
     * Returns the synset identified by the given POS-OFFSET (e.g. N05969222) within the current
     * WordNet release.
     *
     * @param pos-offset
     * 		; stringp WordNet speech part / offset value
     * @return naut-p ; the synset
     */
    @LispMethod(comment = "Returns the synset identified by the given POS-OFFSET (e.g. N05969222) within the current\r\nWordNet release.\r\n\r\n@param pos-offset\r\n\t\t; stringp WordNet speech part / offset value\r\n@return naut-p ; the synset\nReturns the synset identified by the given POS-OFFSET (e.g. N05969222) within the current\nWordNet release.")
    public static SubLObject wni_speech_part_offset_to_synset(final SubLObject pos_offset) {
        assert NIL != stringp(pos_offset) : "! stringp(pos_offset) " + ("Types.stringp(pos_offset) " + "CommonSymbols.NIL != Types.stringp(pos_offset) ") + pos_offset;
        SubLObject synset = NIL;
        final SubLObject sentence = list(wordnet_import.$$wnSynsetSpeechPartOffset, wordnet_import.$sym7$_SYNSET, pos_offset);
        final SubLObject query_properties = wordnet_import.$list189;
        final SubLObject results = wordnet_import.wni_trace_new_cyc_query(sentence, wordnet_import.$$WordNetWorkflowCollectorMt, query_properties);
        if (NIL != results) {
            synset = results.first().first().rest();
        }
        if (((NIL != synset) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == narts_high.naut_p(synset))) {
            throw new AssertionError(synset);
        }
        return synset;
    }

    /**
     * Updates the SYSNET in the WordNet database with the mapped TERM.
     *
     * @param synset
     * 		; naut-p
     * @param term
     * 		; fort-p
     */
    @LispMethod(comment = "Updates the SYSNET in the WordNet database with the mapped TERM.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@param term\r\n\t\t; fort-p")
    public static final SubLObject wni_update_synset_with_term_alt(SubLObject synset, SubLObject v_term) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        SubLTrampolineFile.checkType(v_term, FORT_P);
        {
            SubLObject sql_connection = sdbc.new_sql_connection(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_db(), com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_user(), com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_password(), listS($DBMS_SERVER, new SubLObject[]{ com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_server(), $PORT, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_proxy_port(), $SUBPROTOCOL, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_subprotocol(), $PROXY_SERVER, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_proxy_server(), $list_alt189 }));
            SubLObject sql_statement = sdbc.sqlc_create_statement(sql_connection);
            SubLObject sql_update = format(NIL, $str_alt190$update_Synset_set_cyc_term_____A_, v_term, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_id(synset));
            sdbc.sqls_execute_update(sql_statement, sql_update);
            sdbc.sqls_close(sql_statement);
            sdbc.sqlc_close(sql_connection);
            return NIL;
        }
    }

    /**
     * Updates the SYSNET in the WordNet database with the mapped TERM.
     *
     * @param synset
     * 		; naut-p
     * @param term
     * 		; fort-p
     */
    @LispMethod(comment = "Updates the SYSNET in the WordNet database with the mapped TERM.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@param term\r\n\t\t; fort-p")
    public static SubLObject wni_update_synset_with_term(final SubLObject synset, final SubLObject v_term) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        final SubLObject sql_connection = new_sql_connection(wordnet_import.wni_access_path_db(), wordnet_import.wni_access_path_user(), wordnet_import.wni_access_path_password(), listS($DBMS_SERVER, new SubLObject[]{ wordnet_import.wni_access_path_server(), $PORT, wordnet_import.wni_access_path_proxy_port(), $SUBPROTOCOL, wordnet_import.wni_access_path_subprotocol(), $PROXY_SERVER, wordnet_import.wni_access_path_proxy_server(), wordnet_import.$list191 }));
        final SubLObject sql_statement = sqlc_create_statement(sql_connection);
        final SubLObject sql_update = format(NIL, wordnet_import.$str192$update_Synset_set_cyc_term_____A_, v_term, wordnet_import.wni_synset_id(synset));
        sqls_execute_update(sql_statement, sql_update);
        sqls_close(sql_statement);
        sqlc_close(sql_connection);
        return NIL;
    }

    /**
     * Inserts a row in WordNet database table ConceptMatchHTML with the synset_id and html.
     *
     * @param synset
     * 		; naut-p
     * @param html-string
     * 		; string-p
     */
    @LispMethod(comment = "Inserts a row in WordNet database table ConceptMatchHTML with the synset_id and html.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@param html-string\r\n\t\t; string-p")
    public static final SubLObject wni_insert_concept_match_html_alt(SubLObject synset, SubLObject html_string) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        SubLTrampolineFile.checkType(html_string, STRINGP);
        {
            SubLObject cyc_image_id = cyc_image_id();
            SubLObject sql_connection = sdbc.new_sql_connection(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_db(), com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_user(), com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_password(), listS($DBMS_SERVER, new SubLObject[]{ com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_server(), $PORT, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_proxy_port(), $SUBPROTOCOL, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_subprotocol(), $PROXY_SERVER, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_proxy_server(), $list_alt189 }));
            SubLObject sql_statement = sdbc.sqlc_create_statement(sql_connection);
            SubLObject sql_delete = format(NIL, $str_alt192$delete_from_ConceptMatchHTML_wher, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_id(synset), cyc_image_id);
            SubLObject sql_insert = format(NIL, $str_alt193$insert_into_ConceptMatchHTML_valu, new SubLObject[]{ com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_id(synset), string_utilities.string_substitute($str_alt194$__, $str_alt195$_, html_string, UNPROVIDED), cyc_image_id });
            sdbc.sqls_execute_update(sql_statement, sql_delete);
            sdbc.sqls_execute_update(sql_statement, sql_insert);
            sdbc.sqls_close(sql_statement);
            sdbc.sqlc_close(sql_connection);
            return NIL;
        }
    }

    /**
     * Inserts a row in WordNet database table ConceptMatchHTML with the synset_id and html.
     *
     * @param synset
     * 		; naut-p
     * @param html-string
     * 		; string-p
     */
    @LispMethod(comment = "Inserts a row in WordNet database table ConceptMatchHTML with the synset_id and html.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@param html-string\r\n\t\t; string-p")
    public static SubLObject wni_insert_concept_match_html(final SubLObject synset, final SubLObject html_string) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != stringp(html_string) : "! stringp(html_string) " + ("Types.stringp(html_string) " + "CommonSymbols.NIL != Types.stringp(html_string) ") + html_string;
        final SubLObject cyc_image_id = cyc_image_id();
        final SubLObject sql_connection = new_sql_connection(wordnet_import.wni_access_path_db(), wordnet_import.wni_access_path_user(), wordnet_import.wni_access_path_password(), listS($DBMS_SERVER, new SubLObject[]{ wordnet_import.wni_access_path_server(), $PORT, wordnet_import.wni_access_path_proxy_port(), $SUBPROTOCOL, wordnet_import.wni_access_path_subprotocol(), $PROXY_SERVER, wordnet_import.wni_access_path_proxy_server(), wordnet_import.$list191 }));
        final SubLObject sql_statement = sqlc_create_statement(sql_connection);
        final SubLObject sql_delete = format(NIL, wordnet_import.$str194$delete_from_ConceptMatchHTML_wher, wordnet_import.wni_synset_id(synset), cyc_image_id);
        final SubLObject sql_insert = format(NIL, wordnet_import.$str195$insert_into_ConceptMatchHTML_valu, new SubLObject[]{ wordnet_import.wni_synset_id(synset), string_substitute(wordnet_import.$str196$__, wordnet_import.$str197$_, html_string, UNPROVIDED), cyc_image_id });
        sqls_execute_update(sql_statement, sql_delete);
        sqls_execute_update(sql_statement, sql_insert);
        sqls_close(sql_statement);
        sqlc_close(sql_connection);
        return NIL;
    }

    /**
     * Returns the html string from the WordNet database table ConceptMatchHTML using the synset_id,
     * or returns nil if the html string is not found.
     *
     * @param synset
     * 		; naut-p
     * @return ; string-p
     */
    @LispMethod(comment = "Returns the html string from the WordNet database table ConceptMatchHTML using the synset_id,\r\nor returns nil if the html string is not found.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return ; string-p\nReturns the html string from the WordNet database table ConceptMatchHTML using the synset_id,\nor returns nil if the html string is not found.")
    public static final SubLObject wni_select_concept_match_html_alt(SubLObject synset) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        {
            SubLObject sql_connection = sdbc.new_sql_connection(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_db(), com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_user(), com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_password(), listS($DBMS_SERVER, new SubLObject[]{ com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_server(), $PORT, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_proxy_port(), $SUBPROTOCOL, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_subprotocol(), $PROXY_SERVER, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_proxy_server(), $list_alt189 }));
            SubLObject sql_statement = sdbc.sqlc_create_statement(sql_connection);
            SubLObject sql_query = format(NIL, $str_alt197$select_html_from_ConceptMatchHTML, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_id(synset), cyc_image_id());
            SubLObject sql_result_set = sdbc.sqls_execute_query(sql_statement, sql_query, UNPROVIDED);
            SubLObject html_string = NIL;
            if (NIL != sdbc.sqlrs_emptyP(sql_result_set)) {
                sdbc.sqls_close(sql_statement);
                sdbc.sqlc_close(sql_connection);
                return NIL;
            }
            sdbc.sqlrs_next(sql_result_set);
            html_string = sdbc.sqlrs_get_object(sql_result_set, ONE_INTEGER);
            sdbc.sqls_close(sql_statement);
            sdbc.sqlc_close(sql_connection);
            SubLTrampolineFile.checkType(html_string, STRINGP);
            return html_string;
        }
    }

    /**
     * Returns the html string from the WordNet database table ConceptMatchHTML using the synset_id,
     * or returns nil if the html string is not found.
     *
     * @param synset
     * 		; naut-p
     * @return ; string-p
     */
    @LispMethod(comment = "Returns the html string from the WordNet database table ConceptMatchHTML using the synset_id,\r\nor returns nil if the html string is not found.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return ; string-p\nReturns the html string from the WordNet database table ConceptMatchHTML using the synset_id,\nor returns nil if the html string is not found.")
    public static SubLObject wni_select_concept_match_html(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        final SubLObject sql_connection = new_sql_connection(wordnet_import.wni_access_path_db(), wordnet_import.wni_access_path_user(), wordnet_import.wni_access_path_password(), listS($DBMS_SERVER, new SubLObject[]{ wordnet_import.wni_access_path_server(), $PORT, wordnet_import.wni_access_path_proxy_port(), $SUBPROTOCOL, wordnet_import.wni_access_path_subprotocol(), $PROXY_SERVER, wordnet_import.wni_access_path_proxy_server(), wordnet_import.$list191 }));
        final SubLObject sql_statement = sqlc_create_statement(sql_connection);
        final SubLObject sql_query = format(NIL, wordnet_import.$str199$select_html_from_ConceptMatchHTML, wordnet_import.wni_synset_id(synset), cyc_image_id());
        final SubLObject sql_result_set = sqls_execute_query(sql_statement, sql_query, UNPROVIDED);
        SubLObject html_string = NIL;
        if (NIL != sqlrs_emptyP(sql_result_set)) {
            sqls_close(sql_statement);
            sqlc_close(sql_connection);
            return NIL;
        }
        sqlrs_next(sql_result_set);
        html_string = sqlrs_get_object(sql_result_set, ONE_INTEGER);
        sqls_close(sql_statement);
        sqlc_close(sql_connection);
        assert NIL != stringp(html_string) : "! stringp(html_string) " + ("Types.stringp(html_string) " + "CommonSymbols.NIL != Types.stringp(html_string) ") + html_string;
        return html_string;
    }

    /**
     * Deletes a row in WordNet database table ConceptMatchHTML with the synset_id.
     *
     * @param synset
     * 		; naut-p
     */
    @LispMethod(comment = "Deletes a row in WordNet database table ConceptMatchHTML with the synset_id.\r\n\r\n@param synset\r\n\t\t; naut-p")
    public static final SubLObject wni_delete_concept_match_html_alt(SubLObject synset) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        {
            SubLObject sql_connection = sdbc.new_sql_connection(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_db(), com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_user(), com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_password(), listS($DBMS_SERVER, new SubLObject[]{ com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_server(), $PORT, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_proxy_port(), $SUBPROTOCOL, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_subprotocol(), $PROXY_SERVER, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_proxy_server(), $list_alt189 }));
            SubLObject sql_statement = sdbc.sqlc_create_statement(sql_connection);
            SubLObject sql_delete = format(NIL, $str_alt192$delete_from_ConceptMatchHTML_wher, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_id(synset), cyc_image_id());
            sdbc.sqls_execute_update(sql_statement, sql_delete);
            sdbc.sqls_close(sql_statement);
            sdbc.sqlc_close(sql_connection);
            return NIL;
        }
    }

    /**
     * Deletes a row in WordNet database table ConceptMatchHTML with the synset_id.
     *
     * @param synset
     * 		; naut-p
     */
    @LispMethod(comment = "Deletes a row in WordNet database table ConceptMatchHTML with the synset_id.\r\n\r\n@param synset\r\n\t\t; naut-p")
    public static SubLObject wni_delete_concept_match_html(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        final SubLObject sql_connection = new_sql_connection(wordnet_import.wni_access_path_db(), wordnet_import.wni_access_path_user(), wordnet_import.wni_access_path_password(), listS($DBMS_SERVER, new SubLObject[]{ wordnet_import.wni_access_path_server(), $PORT, wordnet_import.wni_access_path_proxy_port(), $SUBPROTOCOL, wordnet_import.wni_access_path_subprotocol(), $PROXY_SERVER, wordnet_import.wni_access_path_proxy_server(), wordnet_import.$list191 }));
        final SubLObject sql_statement = sqlc_create_statement(sql_connection);
        final SubLObject sql_delete = format(NIL, wordnet_import.$str194$delete_from_ConceptMatchHTML_wher, wordnet_import.wni_synset_id(synset), cyc_image_id());
        sqls_execute_update(sql_statement, sql_delete);
        sqls_close(sql_statement);
        sqlc_close(sql_connection);
        return NIL;
    }

    /**
     * Deletes all rows in the WordNet database table ConceptMatchHTML belonging to this image.
     */
    @LispMethod(comment = "Deletes all rows in the WordNet database table ConceptMatchHTML belonging to this image.")
    public static final SubLObject wni_delete_all_concept_match_html_alt() {
        {
            SubLObject sql_connection = sdbc.new_sql_connection(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_db(), com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_user(), com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_password(), listS($DBMS_SERVER, new SubLObject[]{ com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_server(), $PORT, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_proxy_port(), $SUBPROTOCOL, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_subprotocol(), $PROXY_SERVER, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_proxy_server(), $list_alt189 }));
            SubLObject sql_statement = sdbc.sqlc_create_statement(sql_connection);
            SubLObject sql_delete = format(NIL, $str_alt200$delete_from_ConceptMatchHTML_wher, cyc_image_id());
            sdbc.sqls_execute_update(sql_statement, sql_delete);
            sdbc.sqls_close(sql_statement);
            sdbc.sqlc_close(sql_connection);
            return NIL;
        }
    }

    /**
     * Deletes all rows in the WordNet database table ConceptMatchHTML belonging to this image.
     */
    @LispMethod(comment = "Deletes all rows in the WordNet database table ConceptMatchHTML belonging to this image.")
    public static SubLObject wni_delete_all_concept_match_html() {
        final SubLObject sql_connection = new_sql_connection(wordnet_import.wni_access_path_db(), wordnet_import.wni_access_path_user(), wordnet_import.wni_access_path_password(), listS($DBMS_SERVER, new SubLObject[]{ wordnet_import.wni_access_path_server(), $PORT, wordnet_import.wni_access_path_proxy_port(), $SUBPROTOCOL, wordnet_import.wni_access_path_subprotocol(), $PROXY_SERVER, wordnet_import.wni_access_path_proxy_server(), wordnet_import.$list191 }));
        final SubLObject sql_statement = sqlc_create_statement(sql_connection);
        final SubLObject sql_delete = format(NIL, wordnet_import.$str202$delete_from_ConceptMatchHTML_wher, cyc_image_id());
        sqls_execute_update(sql_statement, sql_delete);
        sqls_close(sql_statement);
        sqlc_close(sql_connection);
        return NIL;
    }

    /**
     * Returns a list of unmapped synsets having a mapped hypernym and the given SPEECH-PART (e.g. #$Noun).
     *
     * @param speech-part
     * 		; fort-p
     * @return listp
     */
    @LispMethod(comment = "Returns a list of unmapped synsets having a mapped hypernym and the given SPEECH-PART (e.g. #$Noun).\r\n\r\n@param speech-part\r\n\t\t; fort-p\r\n@return listp")
    public static final SubLObject wni_unmapped_synsets_having_mapped_hypernym_alt(SubLObject speech_part) {
        SubLTrampolineFile.checkType(speech_part, FORT_P);
        {
            SubLObject synsets = NIL;
            SubLObject pos = Strings.string_downcase(alist_lookup_without_values($wni_1_char_pos_map$.getGlobalValue(), speech_part, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            SubLObject sql_query = cconcatenate($str_alt202$select_Synset_synset_id__________, new SubLObject[]{ pos, $str_alt203$__and____________________Synset_c });
            SubLObject rs = NIL;
            SubLObject statement = NIL;
            SubLObject connection = NIL;
            try {
                connection = sdbc.new_sql_connection(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_db(), com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_user(), com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_password(), list(new SubLObject[]{ $DBMS_SERVER, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_server(), $PORT, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_proxy_port(), $SUBPROTOCOL, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_subprotocol(), $PROXY_SERVER, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_access_path_proxy_server(), $TIMEOUT, THREE_INTEGER }));
                if (NIL != sdbc.sql_open_connection_p(connection)) {
                    statement = sdbc.sqlc_create_statement(connection);
                } else {
                    statement = connection;
                }
                if (NIL != sdbc.sql_open_statement_p(statement)) {
                    rs = sdbc.sqls_execute_query(statement, sql_query, UNPROVIDED);
                } else {
                    rs = statement;
                }
                if (NIL != sdbc.sql_result_set_p(rs)) {
                    while (NIL != sdbc.sqlrs_next(rs)) {
                        synsets = cons(list($$WordNetSynsetFn, sdbc.sqlrs_get_object(rs, ONE_INTEGER)), synsets);
                    } 
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (NIL != sdbc.sql_connection_p(connection)) {
                            sdbc.sqlc_close(connection);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            {
                SubLObject list_var = synsets;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, NAUT_P);
                    }
                }
            }
            return synsets;
        }
    }

    /**
     * Returns a list of unmapped synsets having a mapped hypernym and the given SPEECH-PART (e.g. #$Noun).
     *
     * @param speech-part
     * 		; fort-p
     * @return listp
     */
    @LispMethod(comment = "Returns a list of unmapped synsets having a mapped hypernym and the given SPEECH-PART (e.g. #$Noun).\r\n\r\n@param speech-part\r\n\t\t; fort-p\r\n@return listp")
    public static SubLObject wni_unmapped_synsets_having_mapped_hypernym(final SubLObject speech_part) {
        assert NIL != forts.fort_p(speech_part) : "! forts.fort_p(speech_part) " + ("forts.fort_p(speech_part) " + "CommonSymbols.NIL != forts.fort_p(speech_part) ") + speech_part;
        SubLObject synsets = NIL;
        final SubLObject pos = Strings.string_downcase(list_utilities.alist_lookup_without_values(wordnet_import.$wni_1_char_pos_map$.getGlobalValue(), speech_part, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        final SubLObject sql_query = cconcatenate(wordnet_import.$str204$select_Synset_synset_id__________, new SubLObject[]{ pos, wordnet_import.$str205$__and____________________Synset_c });
        SubLObject rs = NIL;
        SubLObject statement = NIL;
        SubLObject connection = NIL;
        try {
            connection = new_sql_connection(wordnet_import.wni_access_path_db(), wordnet_import.wni_access_path_user(), wordnet_import.wni_access_path_password(), list(new SubLObject[]{ $DBMS_SERVER, wordnet_import.wni_access_path_server(), $PORT, wordnet_import.wni_access_path_proxy_port(), $SUBPROTOCOL, wordnet_import.wni_access_path_subprotocol(), $PROXY_SERVER, wordnet_import.wni_access_path_proxy_server(), $TIMEOUT, THREE_INTEGER }));
            if (NIL != sql_open_connection_p(connection)) {
                statement = sqlc_create_statement(connection);
            } else {
                statement = connection;
            }
            if (NIL != sql_open_statement_p(statement)) {
                rs = sqls_execute_query(statement, sql_query, UNPROVIDED);
            } else {
                rs = statement;
            }
            if (NIL != sql_result_set_p(rs)) {
                while (NIL != sqlrs_next(rs)) {
                    synsets = cons(list(wordnet_import.$$WordNetSynsetFn, sqlrs_get_object(rs, ONE_INTEGER)), synsets);
                } 
            }
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (NIL != sql_connection_p(connection)) {
                    sqlc_close(connection);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        final SubLObject list_var = synsets;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != narts_high.naut_p(elem) : "! narts_high.naut_p(elem) " + ("narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return synsets;
    }

    /**
     * Provides a convenient tracable wrapper for new-cyc-query.
     *
     * @param sentence
     * 		; listp
     * @param mt
     * 		; fortp
     * @param query-properties
     * 		; plist
     */
    @LispMethod(comment = "Provides a convenient tracable wrapper for new-cyc-query.\r\n\r\n@param sentence\r\n\t\t; listp\r\n@param mt\r\n\t\t; fortp\r\n@param query-properties\r\n\t\t; plist")
    public static final SubLObject wni_trace_new_cyc_query_alt(SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        SubLTrampolineFile.checkType(sentence, LISTP);
        if (NIL != mt) {
            SubLTrampolineFile.checkType(mt, HLMT_P);
        }
        {
            SubLObject plist_var = query_properties;
            SubLTrampolineFile.checkType(plist_var, PROPERTY_LIST_P);
            {
                SubLObject remainder = NIL;
                for (remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
                    {
                        SubLObject property = remainder.first();
                        SubLObject value = cadr(remainder);
                        SubLTrampolineFile.checkType(property, QUERY_PROPERTY_P);
                    }
                }
            }
        }
        if ((NIL != inference_datastructures_problem_store.valid_problem_store_p(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_problem_store())) && (NIL == plist_has_keyP(query_properties, $PROBLEM_STORE))) {
            query_properties = putf(copy_list(query_properties), $PROBLEM_STORE, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_problem_store());
        }
        {
            SubLObject results = NIL;
            results = inference_kernel.new_cyc_query(sentence, mt, query_properties);
            SubLTrampolineFile.checkType(results, LISTP);
            return results;
        }
    }

    /**
     * Provides a convenient tracable wrapper for new-cyc-query.
     *
     * @param sentence
     * 		; listp
     * @param mt
     * 		; fortp
     * @param query-properties
     * 		; plist
     */
    @LispMethod(comment = "Provides a convenient tracable wrapper for new-cyc-query.\r\n\r\n@param sentence\r\n\t\t; listp\r\n@param mt\r\n\t\t; fortp\r\n@param query-properties\r\n\t\t; plist")
    public static SubLObject wni_trace_new_cyc_query(final SubLObject sentence, final SubLObject mt, SubLObject query_properties) {
        assert NIL != listp(sentence) : "! listp(sentence) " + ("Types.listp(sentence) " + "CommonSymbols.NIL != Types.listp(sentence) ") + sentence;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        final SubLObject plist_var = query_properties;
        assert NIL != list_utilities.property_list_p(plist_var) : "! list_utilities.property_list_p(plist_var) " + ("list_utilities.property_list_p(plist_var) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist_var) ") + plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != inference_datastructures_enumerated_types.query_property_p(property) : "! inference_datastructures_enumerated_types.query_property_p(property) " + ("inference_datastructures_enumerated_types.query_property_p(property) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.query_property_p(property) ") + property;
        }
        if ((NIL != valid_problem_store_p(wordnet_import.wni_problem_store())) && (NIL == list_utilities.plist_has_keyP(query_properties, $PROBLEM_STORE))) {
            query_properties = putf(copy_list(query_properties), $PROBLEM_STORE, wordnet_import.wni_problem_store());
        }
        SubLObject results = NIL;
        results = new_cyc_query(sentence, mt, query_properties);
        assert NIL != listp(results) : "! listp(results) " + ("Types.listp(results) " + "CommonSymbols.NIL != Types.listp(results) ") + results;
        return results;
    }

    public static final SubLObject wni_problem_store_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == inference_datastructures_problem_store.problem_store_p($wni_problem_store$.getDynamicValue(thread))) {
            } else {
                if (NIL == inference_datastructures_problem_store.valid_problem_store_p($wni_problem_store$.getDynamicValue(thread))) {
                    Errors.warn($str_alt208$Destroying_invalid_WordNet_Import);
                    inference_datastructures_problem_store.destroy_problem_store($wni_problem_store$.getDynamicValue(thread));
                    $wni_problem_store$.setDynamicValue(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.new_wni_problem_store(), thread);
                } else {
                    if (inference_datastructures_problem_store.problem_store_problem_count($wni_problem_store$.getDynamicValue(thread)).numG(multiply($float$0_9, inference_datastructures_problem_store.problem_store_max_problem_count($wni_problem_store$.getDynamicValue(thread))))) {
                        Errors.warn($str_alt210$Destroying_90___full_WordNet_Impo);
                        inference_datastructures_problem_store.destroy_problem_store($wni_problem_store$.getDynamicValue(thread));
                        $wni_problem_store$.setDynamicValue(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.new_wni_problem_store(), thread);
                    }
                }
            }
            return $wni_problem_store$.getDynamicValue(thread);
        }
    }

    public static SubLObject wni_problem_store() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != problem_store_p(wordnet_import.$wni_problem_store$.getDynamicValue(thread))) {
            if (NIL == valid_problem_store_p(wordnet_import.$wni_problem_store$.getDynamicValue(thread))) {
                Errors.warn(wordnet_import.$str210$Destroying_invalid_WordNet_Import);
                destroy_problem_store(wordnet_import.$wni_problem_store$.getDynamicValue(thread));
                wordnet_import.$wni_problem_store$.setDynamicValue(wordnet_import.new_wni_problem_store(), thread);
            } else
                if (problem_store_problem_count(wordnet_import.$wni_problem_store$.getDynamicValue(thread)).numG(multiply(wordnet_import.$float$0_9, problem_store_max_problem_count(wordnet_import.$wni_problem_store$.getDynamicValue(thread))))) {
                    Errors.warn(wordnet_import.$str212$Destroying_90___full_WordNet_Impo);
                    destroy_problem_store(wordnet_import.$wni_problem_store$.getDynamicValue(thread));
                    wordnet_import.$wni_problem_store$.setDynamicValue(wordnet_import.new_wni_problem_store(), thread);
                }

        }
        return wordnet_import.$wni_problem_store$.getDynamicValue(thread);
    }

    public static final SubLObject new_wni_problem_store_alt() {
        return inference_datastructures_problem_store.new_problem_store(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_problem_store_properties());
    }

    public static SubLObject new_wni_problem_store() {
        return new_problem_store(wordnet_import.wni_problem_store_properties());
    }

    public static final SubLObject wni_problem_store_properties_alt() {
        return $list_alt211;
    }

    public static SubLObject wni_problem_store_properties() {
        return wordnet_import.$list213;
    }

    /**
     * Takes a synset nart of the form (#$WordNetSynsetReifiedFn nnnn) and returns a naut of
     * the form (#$WordNetSynsetFn nnnn), which via SKSI represents a synset in the WorrdNet
     * database.
     *
     * @param reified-synset
     * 		: nart-p
     * @return nart-p
     */
    @LispMethod(comment = "Takes a synset nart of the form (#$WordNetSynsetReifiedFn nnnn) and returns a naut of\r\nthe form (#$WordNetSynsetFn nnnn), which via SKSI represents a synset in the WorrdNet\r\ndatabase.\r\n\r\n@param reified-synset\r\n\t\t: nart-p\r\n@return nart-p\nTakes a synset nart of the form (#$WordNetSynsetReifiedFn nnnn) and returns a naut of\nthe form (#$WordNetSynsetFn nnnn), which via SKSI represents a synset in the WorrdNet\ndatabase.")
    public static final SubLObject wni_unreified_synset_alt(SubLObject reified_synset) {
        SubLTrampolineFile.checkType(reified_synset, NART_P);
        {
            SubLObject synset = list($$WordNetSynsetFn, cycl_utilities.nat_arg1(reified_synset, UNPROVIDED));
            SubLTrampolineFile.checkType(synset, NAUT_P);
            return synset;
        }
    }

    /**
     * Takes a synset nart of the form (#$WordNetSynsetReifiedFn nnnn) and returns a naut of
     * the form (#$WordNetSynsetFn nnnn), which via SKSI represents a synset in the WorrdNet
     * database.
     *
     * @param reified-synset
     * 		: nart-p
     * @return nart-p
     */
    @LispMethod(comment = "Takes a synset nart of the form (#$WordNetSynsetReifiedFn nnnn) and returns a naut of\r\nthe form (#$WordNetSynsetFn nnnn), which via SKSI represents a synset in the WorrdNet\r\ndatabase.\r\n\r\n@param reified-synset\r\n\t\t: nart-p\r\n@return nart-p\nTakes a synset nart of the form (#$WordNetSynsetReifiedFn nnnn) and returns a naut of\nthe form (#$WordNetSynsetFn nnnn), which via SKSI represents a synset in the WorrdNet\ndatabase.")
    public static SubLObject wni_unreified_synset(final SubLObject reified_synset) {
        assert NIL != nart_p(reified_synset) : "! nart_handles.nart_p(reified_synset) " + ("nart_handles.nart_p(reified_synset) " + "CommonSymbols.NIL != nart_handles.nart_p(reified_synset) ") + reified_synset;
        final SubLObject synset = list(wordnet_import.$$WordNetSynsetFn, nat_arg1(reified_synset, UNPROVIDED));
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        return synset;
    }

    /**
     * Takes a synset naut of the form (#$WordNetSynsetFn nnnn) and returns a list of
     * the form (#$WordNetSynsetReifiedFn n...n), which when canonicalized may equal a
     * nart in the KB.
     *
     * @param synset
     * 		: naut-p
     * @return consp
     */
    @LispMethod(comment = "Takes a synset naut of the form (#$WordNetSynsetFn nnnn) and returns a list of\r\nthe form (#$WordNetSynsetReifiedFn n...n), which when canonicalized may equal a\r\nnart in the KB.\r\n\r\n@param synset\r\n\t\t: naut-p\r\n@return consp\nTakes a synset naut of the form (#$WordNetSynsetFn nnnn) and returns a list of\nthe form (#$WordNetSynsetReifiedFn n...n), which when canonicalized may equal a\nnart in the KB.")
    public static final SubLObject wni_reifiable_synset_alt(SubLObject synset) {
        SubLTrampolineFile.checkType(synset, POSSIBLY_NAUT_P);
        {
            SubLObject reifiable_synset = make_unary_formula($$WordNetSynsetReifiedFn, second(synset));
            SubLTrampolineFile.checkType(reifiable_synset, POSSIBLY_NAUT_P);
            return reifiable_synset;
        }
    }

    /**
     * Takes a synset naut of the form (#$WordNetSynsetFn nnnn) and returns a list of
     * the form (#$WordNetSynsetReifiedFn n...n), which when canonicalized may equal a
     * nart in the KB.
     *
     * @param synset
     * 		: naut-p
     * @return consp
     */
    @LispMethod(comment = "Takes a synset naut of the form (#$WordNetSynsetFn nnnn) and returns a list of\r\nthe form (#$WordNetSynsetReifiedFn n...n), which when canonicalized may equal a\r\nnart in the KB.\r\n\r\n@param synset\r\n\t\t: naut-p\r\n@return consp\nTakes a synset naut of the form (#$WordNetSynsetFn nnnn) and returns a list of\nthe form (#$WordNetSynsetReifiedFn n...n), which when canonicalized may equal a\nnart in the KB.")
    public static SubLObject wni_reifiable_synset(final SubLObject synset) {
        assert NIL != possibly_naut_p(synset) : "! el_utilities.possibly_naut_p(synset) " + ("el_utilities.possibly_naut_p(synset) " + "CommonSymbols.NIL != el_utilities.possibly_naut_p(synset) ") + synset;
        final SubLObject reifiable_synset = make_unary_formula(wordnet_import.$$WordNetSynsetReifiedFn, second(synset));
        assert NIL != possibly_naut_p(reifiable_synset) : "! el_utilities.possibly_naut_p(reifiable_synset) " + ("el_utilities.possibly_naut_p(reifiable_synset) " + "CommonSymbols.NIL != el_utilities.possibly_naut_p(reifiable_synset) ") + reifiable_synset;
        return reifiable_synset;
    }

    /**
     * Takes a synset id string  of the form n...n and returns a list of
     * the form (#$WordNetSynsetReifiedFn n...n), which when canonicalized may equal a
     * nart in the KB.
     *
     * @param synset-id-string
     * 		: stringp of the form n...n
     * @return naut-p
     */
    @LispMethod(comment = "Takes a synset id string  of the form n...n and returns a list of\r\nthe form (#$WordNetSynsetReifiedFn n...n), which when canonicalized may equal a\r\nnart in the KB.\r\n\r\n@param synset-id-string\r\n\t\t: stringp of the form n...n\r\n@return naut-p\nTakes a synset id string  of the form n...n and returns a list of\nthe form (#$WordNetSynsetReifiedFn n...n), which when canonicalized may equal a\nnart in the KB.")
    public static final SubLObject wni_reifiable_synset_from_string_alt(SubLObject synset_id_string) {
        SubLTrampolineFile.checkType(synset_id_string, STRINGP);
        {
            SubLObject reifiable_synset = list($$WordNetSynsetReifiedFn, string_utilities.string_to_integer(synset_id_string));
            SubLTrampolineFile.checkType(reifiable_synset, POSSIBLY_NAUT_P);
            return reifiable_synset;
        }
    }

    /**
     * Takes a synset id string  of the form n...n and returns a list of
     * the form (#$WordNetSynsetReifiedFn n...n), which when canonicalized may equal a
     * nart in the KB.
     *
     * @param synset-id-string
     * 		: stringp of the form n...n
     * @return naut-p
     */
    @LispMethod(comment = "Takes a synset id string  of the form n...n and returns a list of\r\nthe form (#$WordNetSynsetReifiedFn n...n), which when canonicalized may equal a\r\nnart in the KB.\r\n\r\n@param synset-id-string\r\n\t\t: stringp of the form n...n\r\n@return naut-p\nTakes a synset id string  of the form n...n and returns a list of\nthe form (#$WordNetSynsetReifiedFn n...n), which when canonicalized may equal a\nnart in the KB.")
    public static SubLObject wni_reifiable_synset_from_string(final SubLObject synset_id_string) {
        assert NIL != stringp(synset_id_string) : "! stringp(synset_id_string) " + ("Types.stringp(synset_id_string) " + "CommonSymbols.NIL != Types.stringp(synset_id_string) ") + synset_id_string;
        final SubLObject reifiable_synset = list(wordnet_import.$$WordNetSynsetReifiedFn, string_to_integer(synset_id_string));
        assert NIL != possibly_naut_p(reifiable_synset) : "! el_utilities.possibly_naut_p(reifiable_synset) " + ("el_utilities.possibly_naut_p(reifiable_synset) " + "CommonSymbols.NIL != el_utilities.possibly_naut_p(reifiable_synset) ") + reifiable_synset;
        return reifiable_synset;
    }

    /**
     * Takes a synset id string  of the form n...n and returns a list of
     * the form (#$WordNetSynsetFn n...n), which when canonicalized may equal a
     * nart in the KB.
     *
     * @param synset-id-string
     * 		: stringp of the form n...n
     * @return naut-p
     */
    @LispMethod(comment = "Takes a synset id string  of the form n...n and returns a list of\r\nthe form (#$WordNetSynsetFn n...n), which when canonicalized may equal a\r\nnart in the KB.\r\n\r\n@param synset-id-string\r\n\t\t: stringp of the form n...n\r\n@return naut-p\nTakes a synset id string  of the form n...n and returns a list of\nthe form (#$WordNetSynsetFn n...n), which when canonicalized may equal a\nnart in the KB.")
    public static final SubLObject wni_synset_from_id_string_alt(SubLObject synset_id_string) {
        SubLTrampolineFile.checkType(synset_id_string, $sym217$DIGIT_STRING_);
        {
            SubLObject id = string_utilities.string_to_integer(synset_id_string);
            SubLObject synset = make_unary_formula($$WordNetSynsetFn, id);
            return synset;
        }
    }

    /**
     * Takes a synset id string  of the form n...n and returns a list of
     * the form (#$WordNetSynsetFn n...n), which when canonicalized may equal a
     * nart in the KB.
     *
     * @param synset-id-string
     * 		: stringp of the form n...n
     * @return naut-p
     */
    @LispMethod(comment = "Takes a synset id string  of the form n...n and returns a list of\r\nthe form (#$WordNetSynsetFn n...n), which when canonicalized may equal a\r\nnart in the KB.\r\n\r\n@param synset-id-string\r\n\t\t: stringp of the form n...n\r\n@return naut-p\nTakes a synset id string  of the form n...n and returns a list of\nthe form (#$WordNetSynsetFn n...n), which when canonicalized may equal a\nnart in the KB.")
    public static SubLObject wni_synset_from_id_string(final SubLObject synset_id_string) {
        assert NIL != digit_stringP(synset_id_string) : "! string_utilities.digit_stringP(synset_id_string) " + ("string_utilities.digit_stringP(synset_id_string) " + "CommonSymbols.NIL != string_utilities.digit_stringP(synset_id_string) ") + synset_id_string;
        final SubLObject id = string_to_integer(synset_id_string);
        final SubLObject synset = make_unary_formula(wordnet_import.$$WordNetSynsetFn, id);
        return synset;
    }

    /**
     * Returns the list form of the SYNSET, converting it from a nart if necessary.
     *
     * @param synset
     * 		; the WordNet sysnet
     * @return naut-p
     */
    @LispMethod(comment = "Returns the list form of the SYNSET, converting it from a nart if necessary.\r\n\r\n@param synset\r\n\t\t; the WordNet sysnet\r\n@return naut-p")
    public static final SubLObject wni_ensure_naut_alt(SubLObject synset) {
        {
            SubLObject synset_consp = synset;
            if ((NIL != nart_handles.nart_p(synset)) || (cycl_utilities.nat_functor(synset) == $$WordNetSynsetReifiedFn)) {
                synset_consp = make_unary_formula($$WordNetSynsetFn, cycl_utilities.nat_arg1(synset, UNPROVIDED));
            }
            SubLTrampolineFile.checkType(synset_consp, POSSIBLY_NAUT_P);
            return synset_consp;
        }
    }

    /**
     * Returns the list form of the SYNSET, converting it from a nart if necessary.
     *
     * @param synset
     * 		; the WordNet sysnet
     * @return naut-p
     */
    @LispMethod(comment = "Returns the list form of the SYNSET, converting it from a nart if necessary.\r\n\r\n@param synset\r\n\t\t; the WordNet sysnet\r\n@return naut-p")
    public static SubLObject wni_ensure_naut(final SubLObject synset) {
        SubLObject synset_consp = synset;
        if ((NIL != nart_p(synset)) || nat_functor(synset).eql(wordnet_import.$$WordNetSynsetReifiedFn)) {
            synset_consp = make_unary_formula(wordnet_import.$$WordNetSynsetFn, nat_arg1(synset, UNPROVIDED));
        }
        assert NIL != possibly_naut_p(synset_consp) : "! el_utilities.possibly_naut_p(synset_consp) " + ("el_utilities.possibly_naut_p(synset_consp) " + "CommonSymbols.NIL != el_utilities.possibly_naut_p(synset_consp) ") + synset_consp;
        return synset_consp;
    }

    /**
     * Returns the first unlocked WordNet synset having the given STATUS.
     *
     * @param status
     * 		; fort-p
     * @return naut-p ; the WordNet synset
     */
    @LispMethod(comment = "Returns the first unlocked WordNet synset having the given STATUS.\r\n\r\n@param status\r\n\t\t; fort-p\r\n@return naut-p ; the WordNet synset")
    public static final SubLObject wni_next_synset_with_status_alt(SubLObject status) {
        SubLTrampolineFile.checkType(status, FORT_P);
        {
            SubLObject synset = NIL;
            SubLObject sentence = listS($$and, list($$isa, $sym222$_REIFIED_SYNSET, status), $list_alt223);
            SubLObject query_properties = $list_alt187;
            SubLObject results = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
            if (NIL != results) {
                synset = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_unreified_synset(results.first().first().rest());
            }
            if (NIL != synset) {
                SubLTrampolineFile.checkType(synset, NAUT_P);
            }
            return synset;
        }
    }

    /**
     * Returns the first unlocked WordNet synset having the given STATUS.
     *
     * @param status
     * 		; fort-p
     * @return naut-p ; the WordNet synset
     */
    @LispMethod(comment = "Returns the first unlocked WordNet synset having the given STATUS.\r\n\r\n@param status\r\n\t\t; fort-p\r\n@return naut-p ; the WordNet synset")
    public static SubLObject wni_next_synset_with_status(final SubLObject status) {
        assert NIL != forts.fort_p(status) : "! forts.fort_p(status) " + ("forts.fort_p(status) " + "CommonSymbols.NIL != forts.fort_p(status) ") + status;
        SubLObject synset = NIL;
        final SubLObject sentence = listS(wordnet_import.$$and, list(wordnet_import.$$isa, wordnet_import.$sym224$_REIFIED_SYNSET, status), wordnet_import.$list225);
        final SubLObject query_properties = wordnet_import.$list189;
        final SubLObject results = wordnet_import.wni_trace_new_cyc_query(sentence, wordnet_import.$$WordNetWorkflowCollectorMt, query_properties);
        if (NIL != results) {
            synset = wordnet_import.wni_unreified_synset(results.first().first().rest());
        }
        if (((NIL != synset) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == narts_high.naut_p(synset))) {
            throw new AssertionError(synset);
        }
        return synset;
    }

    /**
     * Returns the unlocked WordNet synsets having the given STATUS.
     *
     * @param status
     * 		; fort-p
     * @return listp; of naut-p ; the WordNet synsets
     */
    @LispMethod(comment = "Returns the unlocked WordNet synsets having the given STATUS.\r\n\r\n@param status\r\n\t\t; fort-p\r\n@return listp; of naut-p ; the WordNet synsets")
    public static final SubLObject wni_unlocked_synsets_with_status_alt(SubLObject status) {
        SubLTrampolineFile.checkType(status, FORT_P);
        {
            SubLObject synsets = NIL;
            SubLObject sentence = listS($$and, list($$isa, $sym222$_REIFIED_SYNSET, status), $list_alt223);
            SubLObject query_properties = $list_alt7;
            SubLObject results = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
            {
                SubLObject cdolist_list_var = results;
                SubLObject result = NIL;
                for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                    synsets = cons(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_unreified_synset(result.first().rest()), synsets);
                }
            }
            {
                SubLObject list_var = synsets;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, NAUT_P);
                    }
                }
            }
            return synsets;
        }
    }

    /**
     * Returns the unlocked WordNet synsets having the given STATUS.
     *
     * @param status
     * 		; fort-p
     * @return listp; of naut-p ; the WordNet synsets
     */
    @LispMethod(comment = "Returns the unlocked WordNet synsets having the given STATUS.\r\n\r\n@param status\r\n\t\t; fort-p\r\n@return listp; of naut-p ; the WordNet synsets")
    public static SubLObject wni_unlocked_synsets_with_status(final SubLObject status) {
        assert NIL != forts.fort_p(status) : "! forts.fort_p(status) " + ("forts.fort_p(status) " + "CommonSymbols.NIL != forts.fort_p(status) ") + status;
        SubLObject synsets = NIL;
        final SubLObject sentence = listS(wordnet_import.$$and, list(wordnet_import.$$isa, wordnet_import.$sym224$_REIFIED_SYNSET, status), wordnet_import.$list225);
        final SubLObject query_properties = wordnet_import.$list9;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wordnet_import.wni_trace_new_cyc_query(sentence, wordnet_import.$$WordNetWorkflowCollectorMt, query_properties);
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            synsets = cons(wordnet_import.wni_unreified_synset(result.first().rest()), synsets);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        final SubLObject list_var = synsets;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != narts_high.naut_p(elem) : "! narts_high.naut_p(elem) " + ("narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) ") + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return synsets;
    }

    /**
     * Return T iff the TERM has any verb semtrans assertions.
     */
    @LispMethod(comment = "Return T iff the TERM has any verb semtrans assertions.")
    public static final SubLObject wni_term_has_verb_semtransP_alt(SubLObject v_term) {
        SubLTrampolineFile.checkType(v_term, FORT_P);
        return com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_term_has_verb_semtrans_helperP(v_term);
    }

    /**
     * Return T iff the TERM has any verb semtrans assertions.
     */
    @LispMethod(comment = "Return T iff the TERM has any verb semtrans assertions.")
    public static SubLObject wni_term_has_verb_semtransP(final SubLObject v_term) {
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        return wordnet_import.wni_term_has_verb_semtrans_helperP(v_term);
    }

    public static final SubLObject clear_wni_term_has_verb_semtrans_helperP_alt() {
        {
            SubLObject cs = $wni_term_has_verb_semtrans_helperP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_wni_term_has_verb_semtrans_helperP() {
        final SubLObject cs = wordnet_import.$wni_term_has_verb_semtrans_helperP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_wni_term_has_verb_semtrans_helperP_alt(SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_term_has_verb_semtrans_helperP_caching_state$.getGlobalValue(), list(v_term), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_wni_term_has_verb_semtrans_helperP(final SubLObject v_term) {
        return caching_state_remove_function_results_with_args(wordnet_import.$wni_term_has_verb_semtrans_helperP_caching_state$.getGlobalValue(), list(v_term), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return T iff the TERM does not have any verb semtrans assertions.
     */
    @LispMethod(comment = "Return T iff the TERM does not have any verb semtrans assertions.")
    public static final SubLObject wni_term_has_verb_semtrans_helperP_internal_alt(SubLObject v_term) {
        SubLTrampolineFile.checkType(v_term, FORT_P);
        {
            SubLObject sentence = list($$thereExists, $sym227$_WORD_UNIT, list($$thereExists, $sym228$_SENSE_NBR, listS($$and, list($$denotation, $sym227$_WORD_UNIT, $$Verb, $sym228$_SENSE_NBR, v_term), list($$unknownSentence, list($$thereExists, $sym232$_FRAME, list($$thereExists, $sym233$_TRANS, listS($$verbSemTrans_Canonical, $sym227$_WORD_UNIT, $sym228$_SENSE_NBR, $sym232$_FRAME, v_term, $list_alt235)))), $list_alt236)));
            SubLObject query_properties = $list_alt7;
            SubLObject results = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_trace_new_cyc_query(sentence, $$EverythingPSC, query_properties);
            return makeBoolean(!results.equal($list_alt237));
        }
    }

    /**
     * Return T iff the TERM does not have any verb semtrans assertions.
     */
    @LispMethod(comment = "Return T iff the TERM does not have any verb semtrans assertions.")
    public static SubLObject wni_term_has_verb_semtrans_helperP_internal(final SubLObject v_term) {
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        final SubLObject sentence = list(wordnet_import.$$thereExists, wordnet_import.$sym229$_WORD_UNIT, list(wordnet_import.$$thereExists, wordnet_import.$sym230$_SENSE_NBR, listS(wordnet_import.$$and, list(wordnet_import.$$denotation, wordnet_import.$sym229$_WORD_UNIT, wordnet_import.$$Verb, wordnet_import.$sym230$_SENSE_NBR, v_term), list(wordnet_import.$$unknownSentence, list(wordnet_import.$$thereExists, wordnet_import.$sym234$_FRAME, list(wordnet_import.$$thereExists, wordnet_import.$sym235$_TRANS, listS(wordnet_import.$$verbSemTrans_Canonical, wordnet_import.$sym229$_WORD_UNIT, wordnet_import.$sym230$_SENSE_NBR, wordnet_import.$sym234$_FRAME, v_term, wordnet_import.$list237)))), wordnet_import.$list238)));
        final SubLObject query_properties = wordnet_import.$list9;
        final SubLObject results = wordnet_import.wni_trace_new_cyc_query(sentence, wordnet_import.$$EverythingPSC, query_properties);
        return makeBoolean(!results.equal(wordnet_import.$list239));
    }

    public static final SubLObject wni_term_has_verb_semtrans_helperP_alt(SubLObject v_term) {
        {
            SubLObject caching_state = $wni_term_has_verb_semtrans_helperP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym226$WNI_TERM_HAS_VERB_SEMTRANS_HELPER_, $sym238$_WNI_TERM_HAS_VERB_SEMTRANS_HELPER__CACHING_STATE_, $int$1000, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, $kw12$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw12$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_term_has_verb_semtrans_helperP_internal(v_term)));
                    memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject wni_term_has_verb_semtrans_helperP(final SubLObject v_term) {
        SubLObject caching_state = wordnet_import.$wni_term_has_verb_semtrans_helperP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(wordnet_import.$sym228$WNI_TERM_HAS_VERB_SEMTRANS_HELPER_, wordnet_import.$sym240$_WNI_TERM_HAS_VERB_SEMTRANS_HELPER__CACHING_STATE_, $int$1000, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = caching_state_lookup(caching_state, v_term, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wordnet_import.wni_term_has_verb_semtrans_helperP_internal(v_term)));
            caching_state_put(caching_state, v_term, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    /**
     * Returns a list of terms that are candidate matches for the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p
     * @return listp ; list of candidate terms
     */
    @LispMethod(comment = "Returns a list of terms that are candidate matches for the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp ; list of candidate terms")
    public static final SubLObject wni_gather_terms_for_matching_alt(SubLObject synset) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        {
            SubLObject terms = NIL;
            SubLObject collectionP = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_collectionP(synset);
            terms = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_exact_synset_term_matches(synset);
            if (NIL == terms) {
                terms = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_strong_synset_term_matches(synset, collectionP);
            }
            if (NIL == terms) {
                terms = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_weak_synset_term_matches(synset, collectionP, UNPROVIDED);
            }
            if (length(terms).numL($wni_maximum_nbr_of_terms_to_gather_for_matching$.getGlobalValue())) {
                {
                    SubLObject cdolist_list_var = cb_wordnet_utilities.wni_string_synset_term_matches(synset, collectionP);
                    SubLObject v_term = NIL;
                    for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                        if (length(terms).numL($wni_maximum_nbr_of_terms_to_gather_for_matching$.getGlobalValue())) {
                            {
                                SubLObject item_var = v_term;
                                if (NIL == member(item_var, terms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    terms = cons(item_var, terms);
                                }
                            }
                        }
                    }
                }
            }
            terms = nreverse(terms);
            if (com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_pos(synset) == $$Verb) {
                {
                    SubLObject situation_terms = NIL;
                    SubLObject cdolist_list_var = terms;
                    SubLObject v_term = NIL;
                    for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                        if ((NIL != fort_types_interface.collectionP(v_term)) && (NIL != genls.genlsP(v_term, $$Situation, UNPROVIDED, UNPROVIDED))) {
                            situation_terms = cons(v_term, situation_terms);
                        }
                    }
                    terms = nreverse(situation_terms);
                }
            }
            {
                SubLObject list_var = terms;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, FORT_P);
                    }
                }
            }
            return terms;
        }
    }

    /**
     * Returns a list of terms that are candidate matches for the given WordNet SYNSET.
     *
     * @param synset
     * 		; naut-p
     * @return listp ; list of candidate terms
     */
    @LispMethod(comment = "Returns a list of terms that are candidate matches for the given WordNet SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp ; list of candidate terms")
    public static SubLObject wni_gather_terms_for_matching(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        SubLObject terms = NIL;
        final SubLObject collectionP = wordnet_import.wni_synset_collectionP(synset);
        terms = wordnet_import.wni_exact_synset_term_matches(synset);
        if (NIL == terms) {
            terms = wordnet_import.wni_strong_synset_term_matches(synset, collectionP);
        }
        if (NIL == terms) {
            terms = wordnet_import.wni_weak_synset_term_matches(synset, collectionP, UNPROVIDED);
        }
        if (length(terms).numL(wordnet_import.$wni_maximum_nbr_of_terms_to_gather_for_matching$.getGlobalValue())) {
            SubLObject cdolist_list_var = cb_wordnet_utilities.wni_string_synset_term_matches(synset, collectionP);
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (length(terms).numL(wordnet_import.$wni_maximum_nbr_of_terms_to_gather_for_matching$.getGlobalValue())) {
                    final SubLObject item_var = v_term;
                    if (NIL == member(item_var, terms, symbol_function(EQL), symbol_function(IDENTITY))) {
                        terms = cons(item_var, terms);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            } 
        }
        terms = nreverse(terms);
        if (wordnet_import.wni_synset_pos(synset).eql(wordnet_import.$$Verb)) {
            SubLObject situation_terms = NIL;
            SubLObject cdolist_list_var2 = terms;
            SubLObject v_term2 = NIL;
            v_term2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                if ((NIL != collectionP(v_term2)) && (NIL != genlsP(v_term2, wordnet_import.$$Situation, UNPROVIDED, UNPROVIDED))) {
                    situation_terms = cons(v_term2, situation_terms);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                v_term2 = cdolist_list_var2.first();
            } 
            terms = nreverse(situation_terms);
        }
        final SubLObject list_var = terms;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != forts.fort_p(elem) : "! forts.fort_p(elem) " + ("forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) ") + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return terms;
    }

    /**
     * Applies exact match criteria to the given SYNSET and returns any exact match terms.
     *
     * @param synset
     * 		; naut-p
     * @return listp
     */
    @LispMethod(comment = "Applies exact match criteria to the given SYNSET and returns any exact match terms.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp")
    public static final SubLObject wni_exact_synset_term_matches_alt(SubLObject synset) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(synset, NAUT_P);
            {
                SubLObject terms = NIL;
                SubLObject pos = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_pos(synset);
                SubLObject synset_collectionP = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_collectionP(synset);
                SubLObject synset_words = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_words(synset);
                SubLObject hypernym_terms = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_hypernym_terms(synset);
                if (NIL != $wni_very_verbose_exact_synset_term_matches$.getDynamicValue(thread)) {
                    format(T, $str_alt241$___A_mapped_hypernyms__A___A__, new SubLObject[]{ synset, hypernym_terms, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_gloss(synset) });
                    force_output(UNPROVIDED);
                }
                {
                    SubLObject cdolist_list_var = synset_words;
                    SubLObject synset_word = NIL;
                    for (synset_word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , synset_word = cdolist_list_var.first()) {
                        if (NIL != $wni_very_verbose_exact_synset_term_matches$.getDynamicValue(thread)) {
                            format(T, $str_alt242$__considering_word____a__, synset_word);
                            force_output(UNPROVIDED);
                        }
                        {
                            SubLObject possible_matches = lexicon_accessors.denots_of_string(synset_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (pos == $$Verb) {
                                {
                                    SubLObject possible_situation_matches = NIL;
                                    SubLObject cdolist_list_var_6 = possible_matches;
                                    SubLObject possible_match = NIL;
                                    for (possible_match = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , possible_match = cdolist_list_var_6.first()) {
                                        if ((NIL != fort_p(possible_match)) && (NIL != genls.genlsP(possible_match, $$Situation, UNPROVIDED, UNPROVIDED))) {
                                            possible_situation_matches = cons(possible_match, possible_situation_matches);
                                        }
                                    }
                                    possible_matches = possible_situation_matches;
                                }
                            }
                            if (NIL != possible_matches) {
                                if (NIL != $wni_very_verbose_exact_synset_term_matches$.getDynamicValue(thread)) {
                                    format(T, $str_alt243$____possible_lexical_matches__A__, possible_matches);
                                    force_output(UNPROVIDED);
                                }
                                {
                                    SubLObject cdolist_list_var_7 = possible_matches;
                                    SubLObject possible_match = NIL;
                                    for (possible_match = cdolist_list_var_7.first(); NIL != cdolist_list_var_7; cdolist_list_var_7 = cdolist_list_var_7.rest() , possible_match = cdolist_list_var_7.first()) {
                                        {
                                            SubLObject mapped_broader_terms = NIL;
                                            SubLObject generated_phrase = pph_main.generate_phrase(possible_match, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            SubLObject cdolist_list_var_8 = (NIL != synset_collectionP) ? ((SubLObject) (genls.genls(possible_match, $$EverythingPSC, UNPROVIDED))) : isa.isa(possible_match, $$EverythingPSC, UNPROVIDED);
                                            SubLObject mapped_broader_term = NIL;
                                            for (mapped_broader_term = cdolist_list_var_8.first(); NIL != cdolist_list_var_8; cdolist_list_var_8 = cdolist_list_var_8.rest() , mapped_broader_term = cdolist_list_var_8.first()) {
                                                if (NIL == isa.isa_in_any_mtP(mapped_broader_term, $$CycKBSubsetCollection)) {
                                                    mapped_broader_terms = cons(mapped_broader_term, mapped_broader_terms);
                                                }
                                            }
                                            if (NIL != $wni_very_verbose_exact_synset_term_matches$.getDynamicValue(thread)) {
                                                format(T, $str_alt244$____considering_term____a___const, possible_match, mapped_broader_terms);
                                                force_output(UNPROVIDED);
                                            }
                                            if ((NIL != fort_p(possible_match)) && (fort_types_interface.collectionP(possible_match) == synset_collectionP)) {
                                                if (NIL != intersection(hypernym_terms, mapped_broader_terms, UNPROVIDED, UNPROVIDED)) {
                                                    if (NIL != $wni_verbose_exact_synset_term_matches$.getDynamicValue(thread)) {
                                                        format(T, $str_alt245$___A_____A__structure___, synset_word, possible_match);
                                                        force_output(UNPROVIDED);
                                                    }
                                                    {
                                                        SubLObject item_var = possible_match;
                                                        if (NIL == member(item_var, terms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                            terms = cons(item_var, terms);
                                                        }
                                                    }
                                                } else {
                                                    if ((NIL != Strings.stringE(generated_phrase, synset_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == disjoint_with.any_disjoint_with_anyP(hypernym_terms, mapped_broader_terms, UNPROVIDED, UNPROVIDED))) {
                                                        if (NIL != $wni_verbose_exact_synset_term_matches$.getDynamicValue(thread)) {
                                                            format(T, $str_alt246$___A____A__lexicon___, synset_word, possible_match);
                                                            force_output(UNPROVIDED);
                                                        }
                                                        {
                                                            SubLObject item_var = possible_match;
                                                            if (NIL == member(item_var, terms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                terms = cons(item_var, terms);
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
                if (pos == $$Verb) {
                    {
                        SubLObject cdolist_list_var = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_derived_forms(synset);
                        SubLObject derivationally_related_synset = NIL;
                        for (derivationally_related_synset = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , derivationally_related_synset = cdolist_list_var.first()) {
                            if ($$Noun == com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_pos(derivationally_related_synset)) {
                                {
                                    SubLObject v_term = NIL;
                                    v_term = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_term(derivationally_related_synset);
                                    if ((((NIL != v_term) && (NIL != fort_p(v_term))) && (NIL != genls.genlP(v_term, $$Situation, UNPROVIDED, UNPROVIDED))) && (NIL == memberP(v_term, terms, UNPROVIDED, UNPROVIDED))) {
                                        terms = add_to_end(v_term, terms);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject list_var = terms;
                    SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                    {
                        SubLObject cdolist_list_var = list_var;
                        SubLObject elem = NIL;
                        for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                            SubLTrampolineFile.checkType(elem, FORT_P);
                        }
                    }
                }
                return terms;
            }
        }
    }

    /**
     * Applies exact match criteria to the given SYNSET and returns any exact match terms.
     *
     * @param synset
     * 		; naut-p
     * @return listp
     */
    @LispMethod(comment = "Applies exact match criteria to the given SYNSET and returns any exact match terms.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp")
    public static SubLObject wni_exact_synset_term_matches(final SubLObject synset) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        SubLObject terms = NIL;
        final SubLObject pos = wordnet_import.wni_synset_pos(synset);
        final SubLObject synset_collectionP = wordnet_import.wni_synset_collectionP(synset);
        final SubLObject synset_words = wordnet_import.wni_synset_words(synset);
        final SubLObject hypernym_terms = wordnet_import.wni_hypernym_terms(synset);
        if (NIL != wordnet_import.$wni_very_verbose_exact_synset_term_matches$.getDynamicValue(thread)) {
            format(T, wordnet_import.$str243$___A_mapped_hypernyms__A___A__, new SubLObject[]{ synset, hypernym_terms, wordnet_import.wni_synset_gloss(synset) });
            force_output(UNPROVIDED);
        }
        SubLObject cdolist_list_var = synset_words;
        SubLObject synset_word = NIL;
        synset_word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != wordnet_import.$wni_very_verbose_exact_synset_term_matches$.getDynamicValue(thread)) {
                format(T, wordnet_import.$str244$__considering_word____a__, synset_word);
                force_output(UNPROVIDED);
            }
            SubLObject possible_matches = denots_of_string(synset_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (pos.eql(wordnet_import.$$Verb)) {
                SubLObject possible_situation_matches = NIL;
                SubLObject cdolist_list_var_$10 = possible_matches;
                SubLObject possible_match = NIL;
                possible_match = cdolist_list_var_$10.first();
                while (NIL != cdolist_list_var_$10) {
                    if ((NIL != forts.fort_p(possible_match)) && (NIL != genlsP(possible_match, wordnet_import.$$Situation, UNPROVIDED, UNPROVIDED))) {
                        possible_situation_matches = cons(possible_match, possible_situation_matches);
                    }
                    cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                    possible_match = cdolist_list_var_$10.first();
                } 
                possible_matches = possible_situation_matches;
            }
            if (NIL != possible_matches) {
                if (NIL != wordnet_import.$wni_very_verbose_exact_synset_term_matches$.getDynamicValue(thread)) {
                    format(T, wordnet_import.$str245$____possible_lexical_matches__A__, possible_matches);
                    force_output(UNPROVIDED);
                }
                SubLObject cdolist_list_var_$11 = possible_matches;
                SubLObject possible_match2 = NIL;
                possible_match2 = cdolist_list_var_$11.first();
                while (NIL != cdolist_list_var_$11) {
                    SubLObject mapped_broader_terms = NIL;
                    final SubLObject generated_phrase = generate_phrase(possible_match2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject cdolist_list_var_$12 = (NIL != synset_collectionP) ? genls(possible_match2, wordnet_import.$$EverythingPSC, UNPROVIDED) : isa(possible_match2, wordnet_import.$$EverythingPSC, UNPROVIDED);
                    SubLObject mapped_broader_term = NIL;
                    mapped_broader_term = cdolist_list_var_$12.first();
                    while (NIL != cdolist_list_var_$12) {
                        if (NIL == isa_in_any_mtP(mapped_broader_term, wordnet_import.$$CycKBSubsetCollection)) {
                            mapped_broader_terms = cons(mapped_broader_term, mapped_broader_terms);
                        }
                        cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                        mapped_broader_term = cdolist_list_var_$12.first();
                    } 
                    if (NIL != wordnet_import.$wni_very_verbose_exact_synset_term_matches$.getDynamicValue(thread)) {
                        format(T, wordnet_import.$str246$____considering_term____a___const, possible_match2, mapped_broader_terms);
                        force_output(UNPROVIDED);
                    }
                    if ((NIL != forts.fort_p(possible_match2)) && collectionP(possible_match2).eql(synset_collectionP)) {
                        if (NIL != intersection(hypernym_terms, mapped_broader_terms, UNPROVIDED, UNPROVIDED)) {
                            if (NIL != wordnet_import.$wni_verbose_exact_synset_term_matches$.getDynamicValue(thread)) {
                                format(T, wordnet_import.$str247$___A_____A__structure___, synset_word, possible_match2);
                                force_output(UNPROVIDED);
                            }
                            final SubLObject item_var = possible_match2;
                            if (NIL == member(item_var, terms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                terms = cons(item_var, terms);
                            }
                        } else
                            if ((NIL != Strings.stringE(generated_phrase, synset_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == any_disjoint_with_anyP(hypernym_terms, mapped_broader_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                if (NIL != wordnet_import.$wni_verbose_exact_synset_term_matches$.getDynamicValue(thread)) {
                                    format(T, wordnet_import.$str248$___A____A__lexicon___, synset_word, possible_match2);
                                    force_output(UNPROVIDED);
                                }
                                final SubLObject item_var = possible_match2;
                                if (NIL == member(item_var, terms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    terms = cons(item_var, terms);
                                }
                            }

                    }
                    cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                    possible_match2 = cdolist_list_var_$11.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            synset_word = cdolist_list_var.first();
        } 
        if (pos.eql(wordnet_import.$$Verb)) {
            cdolist_list_var = wordnet_import.wni_derived_forms(synset);
            SubLObject derivationally_related_synset = NIL;
            derivationally_related_synset = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (wordnet_import.$$Noun.eql(wordnet_import.wni_synset_pos(derivationally_related_synset))) {
                    SubLObject v_term = NIL;
                    v_term = wordnet_import.wni_synset_term(derivationally_related_synset);
                    if ((((NIL != v_term) && (NIL != forts.fort_p(v_term))) && (NIL != genlP(v_term, wordnet_import.$$Situation, UNPROVIDED, UNPROVIDED))) && (NIL == subl_promotions.memberP(v_term, terms, UNPROVIDED, UNPROVIDED))) {
                        terms = list_utilities.add_to_end(v_term, terms);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                derivationally_related_synset = cdolist_list_var.first();
            } 
        }
        final SubLObject list_var = terms;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != forts.fort_p(elem) : "! forts.fort_p(elem) " + ("forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) ") + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return terms;
    }

    /**
     * Determine the terms that serve as denotations for any of the words in
     * the given SYNSET.  This version uses WordNet SKSI rather than the built-in
     * WordNet 1.6 datastructure.
     *
     * @see strong-synset-term-matches (synset)
     * @unknown This is slower but more precise than @xref wni-weak-synset-term-matches.
     * @param synset
     * 		; WordNet synset for which to suggest corresponding Cyc terms
     * @param collection?
     * 		; T if answers are constrained to be collections, NIL if
     * 		answers are constrained to be individuals.
     * @return list ; list of forts that are strong candidates for matching
     */
    @LispMethod(comment = "Determine the terms that serve as denotations for any of the words in\r\nthe given SYNSET.  This version uses WordNet SKSI rather than the built-in\r\nWordNet 1.6 datastructure.\r\n\r\n@see strong-synset-term-matches (synset)\r\n@unknown This is slower but more precise than @xref wni-weak-synset-term-matches.\r\n@param synset\r\n\t\t; WordNet synset for which to suggest corresponding Cyc terms\r\n@param collection?\r\n\t\t; T if answers are constrained to be collections, NIL if\r\n\t\tanswers are constrained to be individuals.\r\n@return list ; list of forts that are strong candidates for matching\nDetermine the terms that serve as denotations for any of the words in\nthe given SYNSET.  This version uses WordNet SKSI rather than the built-in\nWordNet 1.6 datastructure.")
    public static final SubLObject wni_strong_synset_term_matches_alt(SubLObject synset, SubLObject collectionP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(synset, NAUT_P);
            SubLTrampolineFile.checkType(collectionP, BOOLEANP);
            {
                SubLObject all_hypernyms = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_all_hypernyms(synset);
                SubLObject synset_words = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_words(synset);
                SubLObject pos = lexification_utilities.keyword_for_pos(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_pos(synset), UNPROVIDED);
                SubLObject ans = NIL;
                if (pos == $NOUN) {
                    pos = $ALL_NOUN_FORMS;
                }
                {
                    SubLObject cdolist_list_var = synset_words;
                    SubLObject word = NIL;
                    for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                        {
                            SubLObject possibilities = lexicon_accessors.denots_of_stringXpos(word, pos, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (NIL != possibilities) {
                                {
                                    SubLObject cdolist_list_var_9 = all_hypernyms;
                                    SubLObject hypernym = NIL;
                                    for (hypernym = cdolist_list_var_9.first(); NIL != cdolist_list_var_9; cdolist_list_var_9 = cdolist_list_var_9.rest() , hypernym = cdolist_list_var_9.first()) {
                                        {
                                            SubLObject hypernym_term = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_term(hypernym);
                                            if (NIL != hypernym_term) {
                                                {
                                                    SubLObject cdolist_list_var_10 = possibilities;
                                                    SubLObject possibility = NIL;
                                                    for (possibility = cdolist_list_var_10.first(); NIL != cdolist_list_var_10; cdolist_list_var_10 = cdolist_list_var_10.rest() , possibility = cdolist_list_var_10.first()) {
                                                        if (NIL != fort_p(possibility)) {
                                                            if (NIL == memberP(possibility, ans, UNPROVIDED, UNPROVIDED)) {
                                                                {
                                                                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                                    try {
                                                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                                        if ((NIL != genls.genlP(possibility, hypernym_term, UNPROVIDED, UNPROVIDED)) || (NIL != isa.isaP(possibility, hypernym_term, UNPROVIDED, UNPROVIDED))) {
                                                                            {
                                                                                SubLObject item_var = possibility;
                                                                                if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                    ans = cons(item_var, ans);
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
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
                    }
                }
                ans = (NIL != collectionP) ? ((SubLObject) (find_all_if(symbol_function($sym252$SET_OR_COLLECTION_), ans, UNPROVIDED))) : find_all_if(symbol_function($sym253$INDIVIDUAL_), ans, UNPROVIDED);
                {
                    SubLObject list_var = ans;
                    SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                    {
                        SubLObject cdolist_list_var = list_var;
                        SubLObject elem = NIL;
                        for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                            SubLTrampolineFile.checkType(elem, FORT_P);
                        }
                    }
                }
                return ans;
            }
        }
    }

    /**
     * Determine the terms that serve as denotations for any of the words in
     * the given SYNSET.  This version uses WordNet SKSI rather than the built-in
     * WordNet 1.6 datastructure.
     *
     * @see strong-synset-term-matches (synset)
     * @unknown This is slower but more precise than @xref wni-weak-synset-term-matches.
     * @param synset
     * 		; WordNet synset for which to suggest corresponding Cyc terms
     * @param collection?
     * 		; T if answers are constrained to be collections, NIL if
     * 		answers are constrained to be individuals.
     * @return list ; list of forts that are strong candidates for matching
     */
    @LispMethod(comment = "Determine the terms that serve as denotations for any of the words in\r\nthe given SYNSET.  This version uses WordNet SKSI rather than the built-in\r\nWordNet 1.6 datastructure.\r\n\r\n@see strong-synset-term-matches (synset)\r\n@unknown This is slower but more precise than @xref wni-weak-synset-term-matches.\r\n@param synset\r\n\t\t; WordNet synset for which to suggest corresponding Cyc terms\r\n@param collection?\r\n\t\t; T if answers are constrained to be collections, NIL if\r\n\t\tanswers are constrained to be individuals.\r\n@return list ; list of forts that are strong candidates for matching\nDetermine the terms that serve as denotations for any of the words in\nthe given SYNSET.  This version uses WordNet SKSI rather than the built-in\nWordNet 1.6 datastructure.")
    public static SubLObject wni_strong_synset_term_matches(final SubLObject synset, final SubLObject collectionP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != booleanp(collectionP) : "! booleanp(collectionP) " + ("Types.booleanp(collectionP) " + "CommonSymbols.NIL != Types.booleanp(collectionP) ") + collectionP;
        final SubLObject all_hypernyms = wordnet_import.wni_all_hypernyms(synset);
        final SubLObject synset_words = wordnet_import.wni_synset_words(synset);
        SubLObject pos = keyword_for_pos(wordnet_import.wni_synset_pos(synset), UNPROVIDED);
        SubLObject ans = NIL;
        if (pos == $NOUN) {
            pos = wordnet_import.$ALL_NOUN_FORMS;
        }
        SubLObject cdolist_list_var = synset_words;
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject possibilities = denots_of_stringXpos(word, pos, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != possibilities) {
                SubLObject cdolist_list_var_$13 = all_hypernyms;
                SubLObject hypernym = NIL;
                hypernym = cdolist_list_var_$13.first();
                while (NIL != cdolist_list_var_$13) {
                    final SubLObject hypernym_term = wordnet_import.wni_synset_term(hypernym);
                    if (NIL != hypernym_term) {
                        SubLObject cdolist_list_var_$14 = possibilities;
                        SubLObject possibility = NIL;
                        possibility = cdolist_list_var_$14.first();
                        while (NIL != cdolist_list_var_$14) {
                            if ((NIL != forts.fort_p(possibility)) && (NIL == subl_promotions.memberP(possibility, ans, UNPROVIDED, UNPROVIDED))) {
                                final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
                                try {
                                    $relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                    $mt$.bind(wordnet_import.$$EverythingPSC, thread);
                                    if ((NIL != genlP(possibility, hypernym_term, UNPROVIDED, UNPROVIDED)) || (NIL != isaP(possibility, hypernym_term, UNPROVIDED, UNPROVIDED))) {
                                        final SubLObject item_var = possibility;
                                        if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            ans = cons(item_var, ans);
                                        }
                                    }
                                } finally {
                                    $mt$.rebind(_prev_bind_2, thread);
                                    $relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                            cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                            possibility = cdolist_list_var_$14.first();
                        } 
                    }
                    cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                    hypernym = cdolist_list_var_$13.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        final SubLObject list_var;
        ans = list_var = (NIL != collectionP) ? list_utilities.find_all_if(symbol_function(wordnet_import.$sym254$SET_OR_COLLECTION_), ans, UNPROVIDED) : list_utilities.find_all_if(symbol_function(wordnet_import.$sym255$INDIVIDUAL_), ans, UNPROVIDED);
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != forts.fort_p(elem) : "! forts.fort_p(elem) " + ("forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) ") + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return ans;
    }

    /**
     * Determine the terms that serve as denotations for any of the words in
     * the given SYNSET.  This version uses WordNet SKSI rather than the built-in
     * WordNet 1.6 datastructure.
     *
     * @see weak-synset-term-matches (synset)
     * @unknown This is faster but less precise than @xref
    wni-strong-synset-term-matches.
     * @param synset
     * 		; WordNet synset for which to suggest corresponding Cyc terms
     * @param collection?
     * 		; T if answers are constrained to be collections, NIL if
     * 		answers are constrained to be individuals.
     * @param CHECK-POS?
     * 		booleanp;  if T, it pays attention to the part of speech of
     * 		the synset.
     * @return list ; list of forts that are weak candidates for matching
     */
    @LispMethod(comment = "Determine the terms that serve as denotations for any of the words in\r\nthe given SYNSET.  This version uses WordNet SKSI rather than the built-in\r\nWordNet 1.6 datastructure.\r\n\r\n@see weak-synset-term-matches (synset)\r\n@unknown This is faster but less precise than @xref\r\nwni-strong-synset-term-matches.\r\n@param synset\r\n\t\t; WordNet synset for which to suggest corresponding Cyc terms\r\n@param collection?\r\n\t\t; T if answers are constrained to be collections, NIL if\r\n\t\tanswers are constrained to be individuals.\r\n@param CHECK-POS?\r\n\t\tbooleanp;  if T, it pays attention to the part of speech of\r\n\t\tthe synset.\r\n@return list ; list of forts that are weak candidates for matching\nDetermine the terms that serve as denotations for any of the words in\nthe given SYNSET.  This version uses WordNet SKSI rather than the built-in\nWordNet 1.6 datastructure.")
    public static final SubLObject wni_weak_synset_term_matches_alt(SubLObject synset, SubLObject collectionP, SubLObject check_posP) {
        if (check_posP == UNPROVIDED) {
            check_posP = NIL;
        }
        SubLTrampolineFile.checkType(synset, NAUT_P);
        SubLTrampolineFile.checkType(collectionP, BOOLEANP);
        {
            SubLObject synset_words = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_words(synset);
            SubLObject ans = NIL;
            {
                SubLObject cdolist_list_var = synset_words;
                SubLObject word = NIL;
                for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                    {
                        SubLObject possibilities = NIL;
                        possibilities = (NIL != check_posP) ? ((SubLObject) (lexicon_accessors.denots_of_stringXpos(word, lexification_utilities.keyword_for_pos(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_pos(synset), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : lexicon_accessors.denots_of_string(word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        {
                            SubLObject cdolist_list_var_11 = possibilities;
                            SubLObject possibility = NIL;
                            for (possibility = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest() , possibility = cdolist_list_var_11.first()) {
                                if (NIL != fort_p(possibility)) {
                                    {
                                        SubLObject item_var = possibility;
                                        if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            ans = cons(item_var, ans);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ans = nreverse(ans);
            ans = (NIL != collectionP) ? ((SubLObject) (find_all_if(symbol_function($sym252$SET_OR_COLLECTION_), ans, UNPROVIDED))) : find_all_if(symbol_function($sym253$INDIVIDUAL_), ans, UNPROVIDED);
            {
                SubLObject list_var = ans;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, FORT_P);
                    }
                }
            }
            return ans;
        }
    }

    /**
     * Determine the terms that serve as denotations for any of the words in
     * the given SYNSET.  This version uses WordNet SKSI rather than the built-in
     * WordNet 1.6 datastructure.
     *
     * @see weak-synset-term-matches (synset)
     * @unknown This is faster but less precise than @xref
    wni-strong-synset-term-matches.
     * @param synset
     * 		; WordNet synset for which to suggest corresponding Cyc terms
     * @param collection?
     * 		; T if answers are constrained to be collections, NIL if
     * 		answers are constrained to be individuals.
     * @param CHECK-POS?
     * 		booleanp;  if T, it pays attention to the part of speech of
     * 		the synset.
     * @return list ; list of forts that are weak candidates for matching
     */
    @LispMethod(comment = "Determine the terms that serve as denotations for any of the words in\r\nthe given SYNSET.  This version uses WordNet SKSI rather than the built-in\r\nWordNet 1.6 datastructure.\r\n\r\n@see weak-synset-term-matches (synset)\r\n@unknown This is faster but less precise than @xref\r\nwni-strong-synset-term-matches.\r\n@param synset\r\n\t\t; WordNet synset for which to suggest corresponding Cyc terms\r\n@param collection?\r\n\t\t; T if answers are constrained to be collections, NIL if\r\n\t\tanswers are constrained to be individuals.\r\n@param CHECK-POS?\r\n\t\tbooleanp;  if T, it pays attention to the part of speech of\r\n\t\tthe synset.\r\n@return list ; list of forts that are weak candidates for matching\nDetermine the terms that serve as denotations for any of the words in\nthe given SYNSET.  This version uses WordNet SKSI rather than the built-in\nWordNet 1.6 datastructure.")
    public static SubLObject wni_weak_synset_term_matches(final SubLObject synset, final SubLObject collectionP, SubLObject check_posP) {
        if (check_posP == UNPROVIDED) {
            check_posP = NIL;
        }
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != booleanp(collectionP) : "! booleanp(collectionP) " + ("Types.booleanp(collectionP) " + "CommonSymbols.NIL != Types.booleanp(collectionP) ") + collectionP;
        final SubLObject synset_words = wordnet_import.wni_synset_words(synset);
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = synset_words;
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject possibilities = NIL;
            SubLObject cdolist_list_var_$15;
            possibilities = cdolist_list_var_$15 = (NIL != check_posP) ? denots_of_stringXpos(word, keyword_for_pos(wordnet_import.wni_synset_pos(synset), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : denots_of_string(word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject possibility = NIL;
            possibility = cdolist_list_var_$15.first();
            while (NIL != cdolist_list_var_$15) {
                if (NIL != forts.fort_p(possibility)) {
                    final SubLObject item_var = possibility;
                    if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                        ans = cons(item_var, ans);
                    }
                }
                cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                possibility = cdolist_list_var_$15.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        ans = nreverse(ans);
        final SubLObject list_var;
        ans = list_var = (NIL != collectionP) ? list_utilities.find_all_if(symbol_function(wordnet_import.$sym254$SET_OR_COLLECTION_), ans, UNPROVIDED) : list_utilities.find_all_if(symbol_function(wordnet_import.$sym255$INDIVIDUAL_), ans, UNPROVIDED);
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != forts.fort_p(elem) : "! forts.fort_p(elem) " + ("forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) ") + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return ans;
    }

    /**
     * Creates the constant given its NAME.
     *
     * @param name
     * 		; stringp
     * @return constant-p
     */
    @LispMethod(comment = "Creates the constant given its NAME.\r\n\r\n@param name\r\n\t\t; stringp\r\n@return constant-p")
    public static final SubLObject wni_create_now_alt(SubLObject name) {
        {
            SubLObject constant = constants_high.find_constant(name);
            if (NIL == valid_constantP(constant, UNPROVIDED)) {
                SubLTrampolineFile.checkType(name, STRINGP);
                ke.ke_create_now(name, UNPROVIDED);
                constant = constants_high.find_constant(name);
            }
            SubLTrampolineFile.checkType(constant, CONSTANT_P);
            return constant;
        }
    }

    /**
     * Creates the constant given its NAME.
     *
     * @param name
     * 		; stringp
     * @return constant-p
     */
    @LispMethod(comment = "Creates the constant given its NAME.\r\n\r\n@param name\r\n\t\t; stringp\r\n@return constant-p")
    public static SubLObject wni_create_now(final SubLObject name) {
        SubLObject constant = find_constant(name);
        if (NIL == valid_constantP(constant, UNPROVIDED)) {
            assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
            ke_create_now(name, UNPROVIDED);
            constant = find_constant(name);
        }
        assert NIL != constant_p(constant) : "! constant_handles.constant_p(constant) " + ("constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) ") + constant;
        return constant;
    }

    /**
     * Asserts the given SENTENCE, in MT, with the given assertion STRENGTH and DIRECTION.
     *
     * @param sentence
     * 		; consp, the assertion sentence
     * @param mt
     * 		; hlmt-p, the microtheory
     * @param strength
     * 		; assertion-strength-p
     * @param direction
     * 		; assertion-direction-p
     * @param now?
     * 		; booleanp, assert immediately
     */
    @LispMethod(comment = "Asserts the given SENTENCE, in MT, with the given assertion STRENGTH and DIRECTION.\r\n\r\n@param sentence\r\n\t\t; consp, the assertion sentence\r\n@param mt\r\n\t\t; hlmt-p, the microtheory\r\n@param strength\r\n\t\t; assertion-strength-p\r\n@param direction\r\n\t\t; assertion-direction-p\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static final SubLObject wni_assert_wff_alt(SubLObject sentence, SubLObject mt, SubLObject strength, SubLObject direction, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(sentence, CONSP);
        SubLTrampolineFile.checkType(mt, HLMT_P);
        SubLTrampolineFile.checkType(direction, DIRECTION_P);
        SubLTrampolineFile.checkType(strength, EL_STRENGTH_P);
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        if (NIL != nowP) {
            ke.ke_assert_wff_now(sentence, mt, strength, direction);
        } else {
            ke.ke_assert(sentence, mt, strength, direction);
        }
        return NIL;
    }

    /**
     * Asserts the given SENTENCE, in MT, with the given assertion STRENGTH and DIRECTION.
     *
     * @param sentence
     * 		; consp, the assertion sentence
     * @param mt
     * 		; hlmt-p, the microtheory
     * @param strength
     * 		; assertion-strength-p
     * @param direction
     * 		; assertion-direction-p
     * @param now?
     * 		; booleanp, assert immediately
     */
    @LispMethod(comment = "Asserts the given SENTENCE, in MT, with the given assertion STRENGTH and DIRECTION.\r\n\r\n@param sentence\r\n\t\t; consp, the assertion sentence\r\n@param mt\r\n\t\t; hlmt-p, the microtheory\r\n@param strength\r\n\t\t; assertion-strength-p\r\n@param direction\r\n\t\t; assertion-direction-p\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static SubLObject wni_assert_wff(final SubLObject sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != consp(sentence) : "! consp(sentence) " + ("Types.consp(sentence) " + "CommonSymbols.NIL != Types.consp(sentence) ") + sentence;
        assert NIL != hlmt.hlmt_p(mt) : "! hlmt.hlmt_p(mt) " + ("hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) ") + mt;
        assert NIL != enumeration_types.direction_p(direction) : "! enumeration_types.direction_p(direction) " + ("enumeration_types.direction_p(direction) " + "CommonSymbols.NIL != enumeration_types.direction_p(direction) ") + direction;
        assert NIL != enumeration_types.el_strength_p(strength) : "! enumeration_types.el_strength_p(strength) " + ("enumeration_types.el_strength_p(strength) " + "CommonSymbols.NIL != enumeration_types.el_strength_p(strength) ") + strength;
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        if (NIL != nowP) {
            ke_assert_wff_now(sentence, mt, strength, direction);
        } else {
            ke_assert(sentence, mt, strength, direction);
        }
        return NIL;
    }

    /**
     * Unasserts the previous STATUS of the given list of SYNSETS.
     *
     * @param status;
    fort-p
     * 		
     * @param synsets;
     * 		a list of sysnet nauts
     * @param now?
     * 		; booleanp
     */
    @LispMethod(comment = "Unasserts the previous STATUS of the given list of SYNSETS.\r\n\r\n@param status;\nfort-p\r\n\t\t\r\n@param synsets;\r\n\t\ta list of sysnet nauts\r\n@param now?\r\n\t\t; booleanp")
    public static final SubLObject wni_unassert_import_statuses_alt(SubLObject status, SubLObject synsets, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(status, FORT_P);
        {
            SubLObject list_var = synsets;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, NAUT_P);
                }
            }
        }
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        {
            SubLObject cdolist_list_var = synsets;
            SubLObject synset = NIL;
            for (synset = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , synset = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_unassert_import_status(status, synset, nowP);
            }
        }
        return NIL;
    }

    /**
     * Unasserts the previous STATUS of the given list of SYNSETS.
     *
     * @param status;
    		fort-p
     * 		
     * @param synsets;
     * 		a list of sysnet nauts
     * @param now?
     * 		; booleanp
     */
    @LispMethod(comment = "Unasserts the previous STATUS of the given list of SYNSETS.\r\n\r\n@param status;\n\t\tfort-p\r\n\t\t\r\n@param synsets;\r\n\t\ta list of sysnet nauts\r\n@param now?\r\n\t\t; booleanp")
    public static SubLObject wni_unassert_import_statuses(final SubLObject status, final SubLObject synsets, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != forts.fort_p(status) : "! forts.fort_p(status) " + ("forts.fort_p(status) " + "CommonSymbols.NIL != forts.fort_p(status) ") + status;
        assert NIL != list_utilities.non_dotted_list_p(synsets) : "! list_utilities.non_dotted_list_p(synsets) " + ("list_utilities.non_dotted_list_p(synsets) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(synsets) ") + synsets;
        SubLObject cdolist_list_var = synsets;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != narts_high.naut_p(elem) : "! narts_high.naut_p(elem) " + ("narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        SubLObject cdolist_list_var2 = synsets;
        SubLObject synset = NIL;
        synset = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            wordnet_import.wni_unassert_import_status(status, synset, nowP);
            cdolist_list_var2 = cdolist_list_var2.rest();
            synset = cdolist_list_var2.first();
        } 
        return NIL;
    }

    /**
     * Unassert the previous STATUS of the given SYNSET.
     *
     * @param status;
    fort-p
     * 		
     * @param synset;
     * 		naut-p, a sysnet
     * @param now?
     * 		; booleanp
     */
    @LispMethod(comment = "Unassert the previous STATUS of the given SYNSET.\r\n\r\n@param status;\nfort-p\r\n\t\t\r\n@param synset;\r\n\t\tnaut-p, a sysnet\r\n@param now?\r\n\t\t; booleanp")
    public static final SubLObject wni_unassert_import_status_alt(SubLObject status, SubLObject synset, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(status, FORT_P);
        SubLTrampolineFile.checkType(synset, NAUT_P);
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        if (NIL != nowP) {
            ke.ke_unassert_now(list($$isa, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_reifiable_synset(synset), status), $$WordNetWorkflowDataStatusMt);
        } else {
            ke.ke_unassert(list($$isa, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_reifiable_synset(synset), status), $$WordNetWorkflowDataStatusMt);
        }
        return NIL;
    }

    /**
     * Unassert the previous STATUS of the given SYNSET.
     *
     * @param status;
    		fort-p
     * 		
     * @param synset;
     * 		naut-p, a sysnet
     * @param now?
     * 		; booleanp
     */
    @LispMethod(comment = "Unassert the previous STATUS of the given SYNSET.\r\n\r\n@param status;\n\t\tfort-p\r\n\t\t\r\n@param synset;\r\n\t\tnaut-p, a sysnet\r\n@param now?\r\n\t\t; booleanp")
    public static SubLObject wni_unassert_import_status(final SubLObject status, final SubLObject synset, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != forts.fort_p(status) : "! forts.fort_p(status) " + ("forts.fort_p(status) " + "CommonSymbols.NIL != forts.fort_p(status) ") + status;
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        if (NIL != nowP) {
            ke_unassert_now(list(wordnet_import.$$isa, wordnet_import.wni_reifiable_synset(synset), status), wordnet_import.$$WordNetWorkflowDataStatusMt);
        } else {
            ke_unassert(list(wordnet_import.$$isa, wordnet_import.wni_reifiable_synset(synset), status), wordnet_import.$$WordNetWorkflowDataStatusMt);
        }
        return NIL;
    }

    /**
     * Assert the current STATUS of the given list of SYNSETS.
     *
     * @param status;
    fort-p
     * 		
     * @param synsets;
     * 		a list of synset nauts
     * @param now?
     * 		; booleanp
     */
    @LispMethod(comment = "Assert the current STATUS of the given list of SYNSETS.\r\n\r\n@param status;\nfort-p\r\n\t\t\r\n@param synsets;\r\n\t\ta list of synset nauts\r\n@param now?\r\n\t\t; booleanp")
    public static final SubLObject wni_assert_import_statuses_alt(SubLObject status, SubLObject synsets, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(status, FORT_P);
        {
            SubLObject list_var = synsets;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, NAUT_P);
                }
            }
        }
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        {
            SubLObject cdolist_list_var = synsets;
            SubLObject synset = NIL;
            for (synset = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , synset = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_import_status(status, synset, nowP);
            }
        }
        return NIL;
    }

    /**
     * Assert the current STATUS of the given list of SYNSETS.
     *
     * @param status;
    		fort-p
     * 		
     * @param synsets;
     * 		a list of synset nauts
     * @param now?
     * 		; booleanp
     */
    @LispMethod(comment = "Assert the current STATUS of the given list of SYNSETS.\r\n\r\n@param status;\n\t\tfort-p\r\n\t\t\r\n@param synsets;\r\n\t\ta list of synset nauts\r\n@param now?\r\n\t\t; booleanp")
    public static SubLObject wni_assert_import_statuses(final SubLObject status, final SubLObject synsets, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != forts.fort_p(status) : "! forts.fort_p(status) " + ("forts.fort_p(status) " + "CommonSymbols.NIL != forts.fort_p(status) ") + status;
        assert NIL != list_utilities.non_dotted_list_p(synsets) : "! list_utilities.non_dotted_list_p(synsets) " + ("list_utilities.non_dotted_list_p(synsets) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(synsets) ") + synsets;
        SubLObject cdolist_list_var = synsets;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != narts_high.naut_p(elem) : "! narts_high.naut_p(elem) " + ("narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        SubLObject cdolist_list_var2 = synsets;
        SubLObject synset = NIL;
        synset = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            wordnet_import.wni_assert_import_status(status, synset, nowP);
            cdolist_list_var2 = cdolist_list_var2.rest();
            synset = cdolist_list_var2.first();
        } 
        return NIL;
    }

    /**
     * Assert the current STATUS of the given SYNSET.
     *
     * @param status;
    fort-p
     * 		
     * @param synset;
     * 		naut-p, a synset
     * @param now?
     * 		; booleanp
     */
    @LispMethod(comment = "Assert the current STATUS of the given SYNSET.\r\n\r\n@param status;\nfort-p\r\n\t\t\r\n@param synset;\r\n\t\tnaut-p, a synset\r\n@param now?\r\n\t\t; booleanp")
    public static final SubLObject wni_assert_import_status_alt(SubLObject status, SubLObject synset, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(status, FORT_P);
            SubLTrampolineFile.checkType(synset, NAUT_P);
            SubLTrampolineFile.checkType(nowP, BOOLEANP);
            if (NIL != nowP) {
                {
                    SubLObject _prev_bind_0 = $forward_inference_enabledP$.currentBinding(thread);
                    try {
                        $forward_inference_enabledP$.bind(NIL, thread);
                        ke.ke_assert_wff_now(list($$isa, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_reifiable_synset(synset), status), $$WordNetWorkflowDataStatusMt, $MONOTONIC, $FORWARD);
                    } finally {
                        $forward_inference_enabledP$.rebind(_prev_bind_0, thread);
                    }
                }
            } else {
                ke.ke_assert(list($$isa, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_reifiable_synset(synset), status), $$WordNetWorkflowDataStatusMt, $MONOTONIC, $FORWARD);
            }
            return NIL;
        }
    }

    /**
     * Assert the current STATUS of the given SYNSET.
     *
     * @param status;
    		fort-p
     * 		
     * @param synset;
     * 		naut-p, a synset
     * @param now?
     * 		; booleanp
     */
    @LispMethod(comment = "Assert the current STATUS of the given SYNSET.\r\n\r\n@param status;\n\t\tfort-p\r\n\t\t\r\n@param synset;\r\n\t\tnaut-p, a synset\r\n@param now?\r\n\t\t; booleanp")
    public static SubLObject wni_assert_import_status(final SubLObject status, final SubLObject synset, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(status) : "! forts.fort_p(status) " + ("forts.fort_p(status) " + "CommonSymbols.NIL != forts.fort_p(status) ") + status;
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        if (NIL != nowP) {
            final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
                ke_assert_wff_now(list(wordnet_import.$$isa, wordnet_import.wni_reifiable_synset(synset), status), wordnet_import.$$WordNetWorkflowDataStatusMt, $MONOTONIC, $FORWARD);
            } finally {
                kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
            }
        } else {
            ke_assert(list(wordnet_import.$$isa, wordnet_import.wni_reifiable_synset(synset), status), wordnet_import.$$WordNetWorkflowDataStatusMt, $MONOTONIC, $FORWARD);
        }
        return NIL;
    }

    /**
     * Asserts the mapping of the given TERM
     * to the given WordNet synset.
     *
     * @param term;
    fort-p
     * 		
     * @param synset;
     * 		naut-p, a synset
     * @param now?
     * 		; booleanp
     */
    @LispMethod(comment = "Asserts the mapping of the given TERM\r\nto the given WordNet synset.\r\n\r\n@param term;\nfort-p\r\n\t\t\r\n@param synset;\r\n\t\tnaut-p, a synset\r\n@param now?\r\n\t\t; booleanp\nAsserts the mapping of the given TERM\nto the given WordNet synset.")
    public static final SubLObject wni_assert_synset_mapping_alt(SubLObject v_term, SubLObject synset, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(v_term, FORT_P);
        SubLTrampolineFile.checkType(synset, NAUT_P);
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        com.cyc.cycjava.cycl.wordnet_import.wordnet_import.clear_wni_synset_term_helper();
        if (NIL != nowP) {
            ke.ke_assert_wff_now(list($$synonymousExternalConcept, v_term, $const126$WordNet_Version2_0, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_speech_part_offset(synset)), $$WordNetMappingMt, $MONOTONIC, $FORWARD);
        } else {
            ke.ke_assert(list($$synonymousExternalConcept, v_term, $const126$WordNet_Version2_0, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_speech_part_offset(synset)), $$WordNetMappingMt, $MONOTONIC, $FORWARD);
        }
        return NIL;
    }

    @LispMethod(comment = "Asserts the mapping of the given TERM\r\nto the given WordNet synset.\r\n\r\n@param term;\n\t\tfort-p\r\n\t\t\r\n@param synset;\r\n\t\tnaut-p, a synset\r\n@param now?\r\n\t\t; booleanp\nAsserts the mapping of the given TERM\nto the given WordNet synset.")
    public static SubLObject wni_assert_synset_mapping(final SubLObject v_term, final SubLObject synset, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        wordnet_import.clear_wni_synset_term_helper();
        if (NIL != nowP) {
            ke_assert_wff_now(list(wordnet_import.$$synonymousExternalConcept, v_term, wordnet_import.$const128$WordNet_Version2_0, wordnet_import.wni_synset_speech_part_offset(synset)), wordnet_import.$$WordNetMappingMt, $MONOTONIC, $FORWARD);
        } else {
            ke_assert(list(wordnet_import.$$synonymousExternalConcept, v_term, wordnet_import.$const128$WordNet_Version2_0, wordnet_import.wni_synset_speech_part_offset(synset)), wordnet_import.$$WordNetMappingMt, $MONOTONIC, $FORWARD);
        }
        return NIL;
    }

    /**
     * Assert the likely mapping of the given TERM to the given WordNet synset.
     *
     * @param term;
    fort-p
     * 		
     * @param synset;
     * 		naut-p, a synset
     * @param now?
     * 		; booleanp
     */
    @LispMethod(comment = "Assert the likely mapping of the given TERM to the given WordNet synset.\r\n\r\n@param term;\nfort-p\r\n\t\t\r\n@param synset;\r\n\t\tnaut-p, a synset\r\n@param now?\r\n\t\t; booleanp")
    public static final SubLObject wni_assert_likely_synset_mapping_alt(SubLObject v_term, SubLObject synset, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(v_term, FORT_P);
        SubLTrampolineFile.checkType(synset, NAUT_P);
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        if (NIL != nowP) {
            ke.ke_assert_wff_now(list($$wnLikelySynsetMapping, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_reifiable_synset(synset), v_term), $$WordNetWorkflowDataStatusMt, $MONOTONIC, $FORWARD);
        } else {
            ke.ke_assert(list($$wnLikelySynsetMapping, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_speech_part_offset(synset), v_term), $$WordNetWorkflowDataStatusMt, $MONOTONIC, $FORWARD);
        }
        return NIL;
    }

    @LispMethod(comment = "Assert the likely mapping of the given TERM to the given WordNet synset.\r\n\r\n@param term;\n\t\tfort-p\r\n\t\t\r\n@param synset;\r\n\t\tnaut-p, a synset\r\n@param now?\r\n\t\t; booleanp")
    public static SubLObject wni_assert_likely_synset_mapping(final SubLObject v_term, final SubLObject synset, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        if (NIL != nowP) {
            ke_assert_wff_now(list(wordnet_import.$$wnLikelySynsetMapping, wordnet_import.wni_reifiable_synset(synset), v_term), wordnet_import.$$WordNetWorkflowDataStatusMt, $MONOTONIC, $FORWARD);
        } else {
            ke_assert(list(wordnet_import.$$wnLikelySynsetMapping, wordnet_import.wni_synset_speech_part_offset(synset), v_term), wordnet_import.$$WordNetWorkflowDataStatusMt, $MONOTONIC, $FORWARD);
        }
        return NIL;
    }

    /**
     * Asserts that the given TERM quotedIsa collection.
     *
     * @param term
     * 		; fort-p
     * @param now?
     * 		; booleanp
     */
    @LispMethod(comment = "Asserts that the given TERM quotedIsa collection.\r\n\r\n@param term\r\n\t\t; fort-p\r\n@param now?\r\n\t\t; booleanp")
    public static final SubLObject wni_assert_quoted_isa_workflow_constant_alt(SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(v_term, FORT_P);
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        if (NIL != nowP) {
            ke.ke_assert_wff_now(listS($$quotedIsa, v_term, $list_alt272), $$BookkeepingMt, $MONOTONIC, $FORWARD);
        } else {
            ke.ke_assert(listS($$quotedIsa, v_term, $list_alt272), $$BookkeepingMt, $MONOTONIC, $FORWARD);
        }
        return NIL;
    }

    @LispMethod(comment = "Asserts that the given TERM quotedIsa collection.\r\n\r\n@param term\r\n\t\t; fort-p\r\n@param now?\r\n\t\t; booleanp")
    public static SubLObject wni_assert_quoted_isa_workflow_constant(final SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        if (NIL != nowP) {
            ke_assert_wff_now(listS(wordnet_import.$$quotedIsa, v_term, wordnet_import.$list274), wordnet_import.$$BookkeepingMt, $MONOTONIC, $FORWARD);
        } else {
            ke_assert(listS(wordnet_import.$$quotedIsa, v_term, wordnet_import.$list274), wordnet_import.$$BookkeepingMt, $MONOTONIC, $FORWARD);
        }
        return NIL;
    }

    /**
     * Asserts that the given TERM is a collection.
     *
     * @param term
     * 		; fort-p
     * @param now?
     * 		; booleanp
     */
    @LispMethod(comment = "Asserts that the given TERM is a collection.\r\n\r\n@param term\r\n\t\t; fort-p\r\n@param now?\r\n\t\t; booleanp")
    public static final SubLObject wni_assert_isa_collection_alt(SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(v_term, FORT_P);
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        ke.ke_assert_wff_now(listS($$isa, v_term, $list_alt275), $$UniversalVocabularyMt, $MONOTONIC, $FORWARD);
        return NIL;
    }

    @LispMethod(comment = "Asserts that the given TERM is a collection.\r\n\r\n@param term\r\n\t\t; fort-p\r\n@param now?\r\n\t\t; booleanp")
    public static SubLObject wni_assert_isa_collection(final SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        ke_assert_wff_now(listS(wordnet_import.$$isa, v_term, wordnet_import.$list277), wordnet_import.$$UniversalVocabularyMt, $MONOTONIC, $FORWARD);
        return NIL;
    }

    /**
     * Asserts the genl terms for the given collection TERM.
     *
     * @param term
     * 		; fort-p
     * @param genl-terms
     * 		; listp
     * @param now?
     * 		; booleanp
     */
    @LispMethod(comment = "Asserts the genl terms for the given collection TERM.\r\n\r\n@param term\r\n\t\t; fort-p\r\n@param genl-terms\r\n\t\t; listp\r\n@param now?\r\n\t\t; booleanp")
    public static final SubLObject wni_assert_genls_alt(SubLObject v_term, SubLObject genl_terms, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(v_term, FORT_P);
        {
            SubLObject list_var = genl_terms;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, FORT_P);
                }
            }
        }
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        {
            SubLObject cdolist_list_var = genl_terms;
            SubLObject genl_term = NIL;
            for (genl_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl_term = cdolist_list_var.first()) {
                if (NIL == genls.genl_in_any_mtP(v_term, genl_term)) {
                    if (NIL != nowP) {
                        ke.ke_assert_wff_now(list($$genls, v_term, genl_term), $$UniversalVocabularyMt, $MONOTONIC, $FORWARD);
                    } else {
                        ke.ke_assert(list($$genls, v_term, genl_term), $$UniversalVocabularyMt, $MONOTONIC, $FORWARD);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Asserts the genl terms for the given collection TERM.\r\n\r\n@param term\r\n\t\t; fort-p\r\n@param genl-terms\r\n\t\t; listp\r\n@param now?\r\n\t\t; booleanp")
    public static SubLObject wni_assert_genls(final SubLObject v_term, final SubLObject genl_terms, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != list_utilities.non_dotted_list_p(genl_terms) : "! list_utilities.non_dotted_list_p(genl_terms) " + ("list_utilities.non_dotted_list_p(genl_terms) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(genl_terms) ") + genl_terms;
        SubLObject cdolist_list_var = genl_terms;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != forts.fort_p(elem) : "! forts.fort_p(elem) " + ("forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        SubLObject cdolist_list_var2 = genl_terms;
        SubLObject genl_term = NIL;
        genl_term = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL == genl_in_any_mtP(v_term, genl_term)) {
                if (NIL != nowP) {
                    ke_assert_wff_now(list(wordnet_import.$$genls, v_term, genl_term), wordnet_import.$$UniversalVocabularyMt, $MONOTONIC, $FORWARD);
                } else {
                    ke_assert(list(wordnet_import.$$genls, v_term, genl_term), wordnet_import.$$UniversalVocabularyMt, $MONOTONIC, $FORWARD);
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            genl_term = cdolist_list_var2.first();
        } 
        return NIL;
    }

    /**
     * Unassert that the TERM has GENL-TERM.
     *
     * @param term;
    fort-p
     * 		
     * @param genl;
     * 		fort-p, a collection
     * @param now?
     * 		; booleanp
     */
    @LispMethod(comment = "Unassert that the TERM has GENL-TERM.\r\n\r\n@param term;\nfort-p\r\n\t\t\r\n@param genl;\r\n\t\tfort-p, a collection\r\n@param now?\r\n\t\t; booleanp")
    public static final SubLObject wni_unassert_genls_alt(SubLObject v_term, SubLObject genl_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(v_term, FORT_P);
        SubLTrampolineFile.checkType(genl_term, FORT_P);
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        if (NIL != nowP) {
            ke.ke_unassert_now(list($$genls, v_term, genl_term), $$UniversalVocabularyMt);
        } else {
            ke.ke_unassert(list($$isa, v_term, genl_term), $$UniversalVocabularyMt);
        }
        return NIL;
    }

    @LispMethod(comment = "Unassert that the TERM has GENL-TERM.\r\n\r\n@param term;\n\t\tfort-p\r\n\t\t\r\n@param genl;\r\n\t\tfort-p, a collection\r\n@param now?\r\n\t\t; booleanp")
    public static SubLObject wni_unassert_genls(final SubLObject v_term, final SubLObject genl_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != forts.fort_p(genl_term) : "! forts.fort_p(genl_term) " + ("forts.fort_p(genl_term) " + "CommonSymbols.NIL != forts.fort_p(genl_term) ") + genl_term;
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        if (NIL != nowP) {
            ke_unassert_now(list(wordnet_import.$$genls, v_term, genl_term), wordnet_import.$$UniversalVocabularyMt);
        } else {
            ke_unassert(list(wordnet_import.$$isa, v_term, genl_term), wordnet_import.$$UniversalVocabularyMt);
        }
        return NIL;
    }

    /**
     * Asserts the isa terms for the given individual TERM.
     */
    @LispMethod(comment = "Asserts the isa terms for the given individual TERM.")
    public static final SubLObject wni_assert_isa_alt(SubLObject v_term, SubLObject genl_terms, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(v_term, FORT_P);
        {
            SubLObject list_var = genl_terms;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, FORT_P);
                }
            }
        }
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        {
            SubLObject cdolist_list_var = genl_terms;
            SubLObject genl_term = NIL;
            for (genl_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl_term = cdolist_list_var.first()) {
                if (NIL == isa.isa_in_any_mtP(v_term, genl_term)) {
                    if (NIL != nowP) {
                        ke.ke_assert_wff_now(list($$isa, v_term, genl_term), $$WordNetIndividualMappingMt, $MONOTONIC, $FORWARD);
                    } else {
                        ke.ke_assert(list($$isa, v_term, genl_term), $$WordNetIndividualMappingMt, $MONOTONIC, $FORWARD);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Asserts the isa terms for the given individual TERM.")
    public static SubLObject wni_assert_isa(final SubLObject v_term, final SubLObject genl_terms, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != list_utilities.non_dotted_list_p(genl_terms) : "! list_utilities.non_dotted_list_p(genl_terms) " + ("list_utilities.non_dotted_list_p(genl_terms) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(genl_terms) ") + genl_terms;
        SubLObject cdolist_list_var = genl_terms;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != forts.fort_p(elem) : "! forts.fort_p(elem) " + ("forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        SubLObject cdolist_list_var2 = genl_terms;
        SubLObject genl_term = NIL;
        genl_term = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL == isa_in_any_mtP(v_term, genl_term)) {
                if (NIL != nowP) {
                    ke_assert_wff_now(list(wordnet_import.$$isa, v_term, genl_term), wordnet_import.$$WordNetIndividualMappingMt, $MONOTONIC, $FORWARD);
                } else {
                    ke_assert(list(wordnet_import.$$isa, v_term, genl_term), wordnet_import.$$WordNetIndividualMappingMt, $MONOTONIC, $FORWARD);
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            genl_term = cdolist_list_var2.first();
        } 
        return NIL;
    }

    /**
     * Asserts that the given individual TERM is an #$Individual.
     */
    @LispMethod(comment = "Asserts that the given individual TERM is an #$Individual.")
    public static final SubLObject wni_assert_isa_individual_alt(SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(v_term, FORT_P);
        SubLTrampolineFile.checkType(v_term, FORT_P);
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        if (NIL != nowP) {
            ke.ke_assert_wff_now(listS($$isa, v_term, $list_alt283), $$UniversalVocabularyMt, $MONOTONIC, $FORWARD);
        } else {
            ke.ke_assert(listS($$isa, v_term, $list_alt283), $$UniversalVocabularyMt, $MONOTONIC, $FORWARD);
        }
        return NIL;
    }

    @LispMethod(comment = "Asserts that the given individual TERM is an #$Individual.")
    public static SubLObject wni_assert_isa_individual(final SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        if (NIL != nowP) {
            ke_assert_wff_now(listS(wordnet_import.$$isa, v_term, wordnet_import.$list285), wordnet_import.$$UniversalVocabularyMt, $MONOTONIC, $FORWARD);
        } else {
            ke_assert(listS(wordnet_import.$$isa, v_term, wordnet_import.$list285), wordnet_import.$$UniversalVocabularyMt, $MONOTONIC, $FORWARD);
        }
        return NIL;
    }

    /**
     * Asserts that the given individual TERM is an #$Agent-Generic.
     */
    @LispMethod(comment = "Asserts that the given individual TERM is an #$Agent-Generic.")
    public static final SubLObject wni_assert_isa_agent_generic_alt(SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(v_term, FORT_P);
        SubLTrampolineFile.checkType(v_term, FORT_P);
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        if (NIL == isa.isaP(v_term, $$Agent_Generic, UNPROVIDED, UNPROVIDED)) {
            if (NIL != nowP) {
                ke.ke_assert_wff_now(listS($$isa, v_term, $list_alt286), $$UniversalVocabularyMt, $MONOTONIC, $FORWARD);
            } else {
                ke.ke_assert(listS($$isa, v_term, $list_alt286), $$UniversalVocabularyMt, $MONOTONIC, $FORWARD);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Asserts that the given individual TERM is an #$Agent-Generic.")
    public static SubLObject wni_assert_isa_agent_generic(final SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        if (NIL == isaP(v_term, wordnet_import.$$Agent_Generic, UNPROVIDED, UNPROVIDED)) {
            if (NIL != nowP) {
                ke_assert_wff_now(listS(wordnet_import.$$isa, v_term, wordnet_import.$list288), wordnet_import.$$UniversalVocabularyMt, $MONOTONIC, $FORWARD);
            } else {
                ke_assert(listS(wordnet_import.$$isa, v_term, wordnet_import.$list288), wordnet_import.$$UniversalVocabularyMt, $MONOTONIC, $FORWARD);
            }
        }
        return NIL;
    }

    /**
     * Asserts that the given TERM was reified using the #$CycWordNetImportTool.
     */
    @LispMethod(comment = "Asserts that the given TERM was reified using the #$CycWordNetImportTool.")
    public static final SubLObject wni_assert_reified_using_alt(SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(v_term, FORT_P);
        SubLTrampolineFile.checkType(v_term, FORT_P);
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        if (NIL != nowP) {
            ke.ke_assert_wff_now(listS($$reifiedUsingTool, v_term, $list_alt289), $$WordNetMappingMt, $MONOTONIC, $FORWARD);
        } else {
            ke.ke_assert(listS($$reifiedUsingTool, v_term, $list_alt289), $$WordNetMappingMt, $MONOTONIC, $FORWARD);
        }
        return NIL;
    }

    @LispMethod(comment = "Asserts that the given TERM was reified using the #$CycWordNetImportTool.")
    public static SubLObject wni_assert_reified_using(final SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        if (NIL != nowP) {
            ke_assert_wff_now(listS(wordnet_import.$$reifiedUsingTool, v_term, wordnet_import.$list291), wordnet_import.$$WordNetMappingMt, $MONOTONIC, $FORWARD);
        } else {
            ke_assert(listS(wordnet_import.$$reifiedUsingTool, v_term, wordnet_import.$list291), wordnet_import.$$WordNetMappingMt, $MONOTONIC, $FORWARD);
        }
        return NIL;
    }

    /**
     * Returns the note for the given SYNSET if present, else return an empty string.
     *
     * @param synset;
     * 		naut-p, the WordNet synset
     * @return ; stringp, the note for the given SYNSET
     */
    @LispMethod(comment = "Returns the note for the given SYNSET if present, else return an empty string.\r\n\r\n@param synset;\r\n\t\tnaut-p, the WordNet synset\r\n@return ; stringp, the note for the given SYNSET")
    public static final SubLObject wni_synset_note_alt(SubLObject synset) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        {
            SubLObject note = NIL;
            SubLObject sentence = listS($$wnSynsetNote, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_reifiable_synset(synset), $list_alt292);
            SubLObject query_properties = $list_alt7;
            SubLObject results = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
            if (NIL != results) {
                note = results.first().first().rest();
            }
            if (NIL == note) {
                note = $str_alt293$;
            }
            SubLTrampolineFile.checkType(note, STRINGP);
            return note;
        }
    }

    @LispMethod(comment = "Returns the note for the given SYNSET if present, else return an empty string.\r\n\r\n@param synset;\r\n\t\tnaut-p, the WordNet synset\r\n@return ; stringp, the note for the given SYNSET")
    public static SubLObject wni_synset_note(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        SubLObject note = NIL;
        final SubLObject sentence = listS(wordnet_import.$$wnSynsetNote, wordnet_import.wni_reifiable_synset(synset), wordnet_import.$list294);
        final SubLObject query_properties = wordnet_import.$list9;
        final SubLObject results = wordnet_import.wni_trace_new_cyc_query(sentence, wordnet_import.$$WordNetWorkflowCollectorMt, query_properties);
        if (NIL != results) {
            note = results.first().first().rest();
        }
        if (NIL == note) {
            note = wordnet_import.$str295$;
        }
        assert NIL != stringp(note) : "! stringp(note) " + ("Types.stringp(note) " + "CommonSymbols.NIL != Types.stringp(note) ") + note;
        return note;
    }

    /**
     * Asserts the note for the given SYNSET.
     *
     * @param synset;
     * 		naut-p, the WordNet synset
     * @param note
     * 		; stringp, the note for the given SYNSET
     */
    @LispMethod(comment = "Asserts the note for the given SYNSET.\r\n\r\n@param synset;\r\n\t\tnaut-p, the WordNet synset\r\n@param note\r\n\t\t; stringp, the note for the given SYNSET")
    public static final SubLObject wni_assert_synset_note_alt(SubLObject synset, SubLObject note) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(synset, NAUT_P);
            SubLTrampolineFile.checkType(note, STRINGP);
            {
                SubLObject _prev_bind_0 = $forward_inference_enabledP$.currentBinding(thread);
                try {
                    $forward_inference_enabledP$.bind(NIL, thread);
                    ke.ke_assert_wff_now(list($$wnSynsetNote, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_reifiable_synset(synset), note), $$WordNetWorkflowDataStatusMt, $MONOTONIC, $FORWARD);
                } finally {
                    $forward_inference_enabledP$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Asserts the note for the given SYNSET.\r\n\r\n@param synset;\r\n\t\tnaut-p, the WordNet synset\r\n@param note\r\n\t\t; stringp, the note for the given SYNSET")
    public static SubLObject wni_assert_synset_note(final SubLObject synset, final SubLObject note) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != stringp(note) : "! stringp(note) " + ("Types.stringp(note) " + "CommonSymbols.NIL != Types.stringp(note) ") + note;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
            ke_assert_wff_now(list(wordnet_import.$$wnSynsetNote, wordnet_import.wni_reifiable_synset(synset), note), wordnet_import.$$WordNetWorkflowDataStatusMt, $MONOTONIC, $FORWARD);
        } finally {
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Unasserts the note for the given SYNSET.
     *
     * @param synset;
     * 		naut-p, the WordNet synset
     * @param note
     * 		; stringp, the note for the given SYNSET
     */
    @LispMethod(comment = "Unasserts the note for the given SYNSET.\r\n\r\n@param synset;\r\n\t\tnaut-p, the WordNet synset\r\n@param note\r\n\t\t; stringp, the note for the given SYNSET")
    public static final SubLObject wni_unassert_synset_note_alt(SubLObject synset, SubLObject note) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        SubLTrampolineFile.checkType(note, STRINGP);
        ke.ke_unassert_now(list($$wnSynsetNote, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_reifiable_synset(synset), note), $$WordNetWorkflowDataStatusMt);
        return NIL;
    }

    @LispMethod(comment = "Unasserts the note for the given SYNSET.\r\n\r\n@param synset;\r\n\t\tnaut-p, the WordNet synset\r\n@param note\r\n\t\t; stringp, the note for the given SYNSET")
    public static SubLObject wni_unassert_synset_note(final SubLObject synset, final SubLObject note) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != stringp(note) : "! stringp(note) " + ("Types.stringp(note) " + "CommonSymbols.NIL != Types.stringp(note) ") + note;
        ke_unassert_now(list(wordnet_import.$$wnSynsetNote, wordnet_import.wni_reifiable_synset(synset), note), wordnet_import.$$WordNetWorkflowDataStatusMt);
        return NIL;
    }

    /**
     * Asserts the comment for the given TERM.
     *
     * @param term
     * 		; fort-p
     * @param comment
     * 		; stringp
     * @param now?
     * 		; booleanp
     */
    @LispMethod(comment = "Asserts the comment for the given TERM.\r\n\r\n@param term\r\n\t\t; fort-p\r\n@param comment\r\n\t\t; stringp\r\n@param now?\r\n\t\t; booleanp")
    public static final SubLObject wni_assert_comment_alt(SubLObject v_term, SubLObject comment, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(v_term, FORT_P);
        SubLTrampolineFile.checkType(comment, STRINGP);
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        if (NIL != nowP) {
            ke.ke_assert_wff_now(list($$comment, v_term, comment), $$UniversalVocabularyMt, $MONOTONIC, $FORWARD);
        } else {
            ke.ke_assert(list($$comment, v_term, comment), $$UniversalVocabularyMt, $MONOTONIC, $FORWARD);
        }
        return NIL;
    }

    @LispMethod(comment = "Asserts the comment for the given TERM.\r\n\r\n@param term\r\n\t\t; fort-p\r\n@param comment\r\n\t\t; stringp\r\n@param now?\r\n\t\t; booleanp")
    public static SubLObject wni_assert_comment(final SubLObject v_term, final SubLObject comment, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != stringp(comment) : "! stringp(comment) " + ("Types.stringp(comment) " + "CommonSymbols.NIL != Types.stringp(comment) ") + comment;
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        if (NIL != nowP) {
            ke_assert_wff_now(list(wordnet_import.$$comment, v_term, comment), wordnet_import.$$UniversalVocabularyMt, $MONOTONIC, $FORWARD);
        } else {
            ke_assert(list(wordnet_import.$$comment, v_term, comment), wordnet_import.$$UniversalVocabularyMt, $MONOTONIC, $FORWARD);
        }
        return NIL;
    }

    /**
     * Asserts the term of unit for a new NART.
     *
     * @param nat
     * 		; consp, non atomic term
     */
    @LispMethod(comment = "Asserts the term of unit for a new NART.\r\n\r\n@param nat\r\n\t\t; consp, non atomic term")
    public static final SubLObject wni_assert_term_of_unit_alt(SubLObject nat) {
        SubLTrampolineFile.checkType(nat, CONSP);
        ke.ke_assert_now(list($$termOfUnit, nat, nat), $$BaseKB, $MONOTONIC, $FORWARD);
        return NIL;
    }

    @LispMethod(comment = "Asserts the term of unit for a new NART.\r\n\r\n@param nat\r\n\t\t; consp, non atomic term")
    public static SubLObject wni_assert_term_of_unit(final SubLObject nat) {
        assert NIL != consp(nat) : "! consp(nat) " + ("Types.consp(nat) " + "CommonSymbols.NIL != Types.consp(nat) ") + nat;
        ke_assert_now(list(wordnet_import.$$termOfUnit, nat, nat), wordnet_import.$$BaseKB, $MONOTONIC, $FORWARD);
        return NIL;
    }

    /**
     * Asserts an exclusive usage lock for the given synset.
     *
     * @param synset
     * 		: naut-p
     */
    @LispMethod(comment = "Asserts an exclusive usage lock for the given synset.\r\n\r\n@param synset\r\n\t\t: naut-p")
    public static final SubLObject wni_lock_synset_alt(SubLObject synset) {
        ke.ke_assert_wff_now(list($$wnWorkflowSynsetLock, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_reifiable_synset(synset), operation_communication.the_cyclist(), date_utilities.indexical_now()), $$WordNetWorkflowDataStatusMt, $MONOTONIC, $FORWARD);
        return NIL;
    }

    @LispMethod(comment = "Asserts an exclusive usage lock for the given synset.\r\n\r\n@param synset\r\n\t\t: naut-p")
    public static SubLObject wni_lock_synset(final SubLObject synset) {
        ke_assert_wff_now(list(wordnet_import.$$wnWorkflowSynsetLock, wordnet_import.wni_reifiable_synset(synset), the_cyclist(), indexical_now()), wordnet_import.$$WordNetWorkflowDataStatusMt, $MONOTONIC, $FORWARD);
        return NIL;
    }

    /**
     * Unasserts an exclusive usage lock for the given synset.
     *
     * @param synset
     * 		: naut-p
     * @param now?
     * 		; booleanp
     */
    @LispMethod(comment = "Unasserts an exclusive usage lock for the given synset.\r\n\r\n@param synset\r\n\t\t: naut-p\r\n@param now?\r\n\t\t; booleanp")
    public static final SubLObject wni_unlock_synset_alt(SubLObject synset, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(synset, NAUT_P);
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        {
            SubLObject date = NIL;
            SubLObject reifiable_synset = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_reifiable_synset(synset);
            SubLObject sentence = listS($$wnWorkflowSynsetLock, reifiable_synset, operation_communication.the_cyclist(), $list_alt304);
            SubLObject query_properties = $list_alt187;
            SubLObject results = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
            if (NIL != results) {
                date = results.first().first().rest();
                if (NIL != nowP) {
                    ke.ke_unassert_now(list($$wnWorkflowSynsetLock, reifiable_synset, operation_communication.the_cyclist(), date), $$WordNetWorkflowDataStatusMt);
                } else {
                    ke.ke_unassert(list($$wnWorkflowSynsetLock, reifiable_synset, operation_communication.the_cyclist(), date), $$WordNetWorkflowDataStatusMt);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Unasserts an exclusive usage lock for the given synset.\r\n\r\n@param synset\r\n\t\t: naut-p\r\n@param now?\r\n\t\t; booleanp")
    public static SubLObject wni_unlock_synset(final SubLObject synset, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        SubLObject date = NIL;
        final SubLObject reifiable_synset = wordnet_import.wni_reifiable_synset(synset);
        final SubLObject sentence = listS(wordnet_import.$$wnWorkflowSynsetLock, reifiable_synset, the_cyclist(), wordnet_import.$list306);
        final SubLObject query_properties = wordnet_import.$list189;
        final SubLObject results = wordnet_import.wni_trace_new_cyc_query(sentence, wordnet_import.$$WordNetWorkflowCollectorMt, query_properties);
        if (NIL != results) {
            date = results.first().first().rest();
            if (NIL != nowP) {
                ke_unassert_now(list(wordnet_import.$$wnWorkflowSynsetLock, reifiable_synset, the_cyclist(), date), wordnet_import.$$WordNetWorkflowDataStatusMt);
            } else {
                ke_unassert(list(wordnet_import.$$wnWorkflowSynsetLock, reifiable_synset, the_cyclist(), date), wordnet_import.$$WordNetWorkflowDataStatusMt);
            }
        }
        return NIL;
    }

    /**
     * Asserts appropriate name string sentences and denotations for the words in the given mapped SYNSET.
     *
     * @param synset
     * 		; naut-p
     * @param workflow-alist
     * 		; alist-p, the new word characteristics association list
     * @param term
     * 		; fort-p
     * @param now?
     * 		; booleanp, assert immediately
     */
    @LispMethod(comment = "Asserts appropriate name string sentences and denotations for the words in the given mapped SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@param term\r\n\t\t; fort-p\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static final SubLObject wni_assert_heuristic_lexicon_alt(SubLObject synset, SubLObject workflow_alist, SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(synset, NAUT_P);
        SubLTrampolineFile.checkType(workflow_alist, ALIST_P);
        SubLTrampolineFile.checkType(v_term, FORT_P);
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        if (NIL != com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_collectionP(synset)) {
            com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_heuristic_lexicon_for_collection(synset, workflow_alist, v_term, nowP);
        } else {
            com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_heuristic_lexicon_for_individual(synset, v_term, workflow_alist, nowP);
        }
        return NIL;
    }

    @LispMethod(comment = "Asserts appropriate name string sentences and denotations for the words in the given mapped SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@param term\r\n\t\t; fort-p\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static SubLObject wni_assert_heuristic_lexicon(final SubLObject synset, final SubLObject workflow_alist, final SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != list_utilities.alist_p(workflow_alist) : "! list_utilities.alist_p(workflow_alist) " + ("list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) ") + workflow_alist;
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        if (NIL != wordnet_import.wni_synset_collectionP(synset)) {
            wordnet_import.wni_assert_heuristic_lexicon_for_collection(synset, workflow_alist, v_term, nowP);
        } else {
            wordnet_import.wni_assert_heuristic_lexicon_for_individual(synset, v_term, workflow_alist, nowP);
        }
        return NIL;
    }

    /**
     * Asserts the appropriate name string sentences for the words in the given mapped SYNSET to collection TERM.
     *
     * @param synset
     * 		; naut-p the WordNet synset
     * @param workflow-alist
     * 		; alist-p, the new word characteristics association list
     * @param term
     * 		; the Cyc term equivalent to the WordNet synset
     * @param now?
     * 		; booleanp, assert immediately
     */
    @LispMethod(comment = "Asserts the appropriate name string sentences for the words in the given mapped SYNSET to collection TERM.\r\n\r\n@param synset\r\n\t\t; naut-p the WordNet synset\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@param term\r\n\t\t; the Cyc term equivalent to the WordNet synset\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static final SubLObject wni_assert_heuristic_lexicon_for_collection_alt(SubLObject synset, SubLObject workflow_alist, SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(synset, NAUT_P);
        SubLTrampolineFile.checkType(workflow_alist, CONSP);
        SubLTrampolineFile.checkType(workflow_alist, ALIST_P);
        SubLTrampolineFile.checkType(v_term, FORT_P);
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        if ((NIL != com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_all_hypernymP(synset, $organism_being_synset$.getGlobalValue())) && (NIL == com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_all_hypernymP(synset, $person_synset$.getGlobalValue()))) {
            com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_heuristic_lexicon_for_organism(synset, v_term, workflow_alist, nowP);
            return NIL;
        } else {
            if (NIL != com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_all_hypernymP(synset, $chemical_compound_synset$.getGlobalValue())) {
                com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_heuristic_lexicon_for_chemical(synset, v_term, nowP);
            }
        }
        {
            SubLObject synset_words = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_words(synset);
            com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_heuristic_lexicon_for_collection_common(synset, synset_words, v_term, workflow_alist, nowP);
        }
        return NIL;
    }

    @LispMethod(comment = "Asserts the appropriate name string sentences for the words in the given mapped SYNSET to collection TERM.\r\n\r\n@param synset\r\n\t\t; naut-p the WordNet synset\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@param term\r\n\t\t; the Cyc term equivalent to the WordNet synset\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static SubLObject wni_assert_heuristic_lexicon_for_collection(final SubLObject synset, final SubLObject workflow_alist, final SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != consp(workflow_alist) : "! consp(workflow_alist) " + ("Types.consp(workflow_alist) " + "CommonSymbols.NIL != Types.consp(workflow_alist) ") + workflow_alist;
        assert NIL != list_utilities.alist_p(workflow_alist) : "! list_utilities.alist_p(workflow_alist) " + ("list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) ") + workflow_alist;
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        if ((NIL != wordnet_import.wni_all_hypernymP(synset, wordnet_import.$organism_being_synset$.getGlobalValue())) && (NIL == wordnet_import.wni_all_hypernymP(synset, wordnet_import.$person_synset$.getGlobalValue()))) {
            wordnet_import.wni_assert_heuristic_lexicon_for_organism(synset, v_term, workflow_alist, nowP);
            return NIL;
        }
        if (NIL != wordnet_import.wni_all_hypernymP(synset, wordnet_import.$chemical_compound_synset$.getGlobalValue())) {
            wordnet_import.wni_assert_heuristic_lexicon_for_chemical(synset, v_term, nowP);
        }
        final SubLObject synset_words = wordnet_import.wni_synset_words(synset);
        wordnet_import.wni_assert_heuristic_lexicon_for_collection_common(synset, synset_words, v_term, workflow_alist, nowP);
        return NIL;
    }

    /**
     * Asserts common lexicon for collection TERM, with the given SYNSET-WORDS and POS.
     *
     * @param synset
     * 		; naut-p the WordNet synset
     * @param synset-words
     * 		; listp, of synset words
     * @param term
     * 		; fort-p, the term
     * @param pos
     * 		; fort-p, the part of speech
     * @param workflow-alist
     * 		; alist-p, the new word characteristics association list
     * @param now?
     * 		; booleanp, assert immediately
     */
    @LispMethod(comment = "Asserts common lexicon for collection TERM, with the given SYNSET-WORDS and POS.\r\n\r\n@param synset\r\n\t\t; naut-p the WordNet synset\r\n@param synset-words\r\n\t\t; listp, of synset words\r\n@param term\r\n\t\t; fort-p, the term\r\n@param pos\r\n\t\t; fort-p, the part of speech\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static final SubLObject wni_assert_heuristic_lexicon_for_collection_common_alt(SubLObject synset, SubLObject synset_words, SubLObject v_term, SubLObject workflow_alist, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(synset, NAUT_P);
        {
            SubLObject list_var = synset_words;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, STRINGP);
                }
            }
        }
        SubLTrampolineFile.checkType(v_term, FORT_P);
        SubLTrampolineFile.checkType(workflow_alist, CONSP);
        SubLTrampolineFile.checkType(workflow_alist, ALIST_P);
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        {
            SubLObject cdolist_list_var = synset_words;
            SubLObject synset_word = NIL;
            for (synset_word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , synset_word = cdolist_list_var.first()) {
                if (NIL != alist_lookup(workflow_alist, cconcatenate(synset_word, $str_alt310$_included), EQUAL, UNPROVIDED)) {
                    {
                        SubLObject pos = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_heuristic_pos(synset, synset_word, workflow_alist);
                        if (NIL != string_utilities.contains_charP(synset_word, CHAR_hyphen)) {
                            com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_lexicon_for_hyphen_string(synset_word, v_term, workflow_alist, pos, nowP);
                        } else {
                            if (NIL != string_utilities.contains_charP(synset_word, CHAR_space)) {
                                com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_lexicon_for_phrase(synset_word, v_term, workflow_alist, pos, nowP);
                            } else {
                                com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_lexicon_for_denotation(synset_word, v_term, workflow_alist, pos, nowP);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Asserts common lexicon for collection TERM, with the given SYNSET-WORDS and POS.\r\n\r\n@param synset\r\n\t\t; naut-p the WordNet synset\r\n@param synset-words\r\n\t\t; listp, of synset words\r\n@param term\r\n\t\t; fort-p, the term\r\n@param pos\r\n\t\t; fort-p, the part of speech\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static SubLObject wni_assert_heuristic_lexicon_for_collection_common(final SubLObject synset, final SubLObject synset_words, final SubLObject v_term, final SubLObject workflow_alist, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != list_utilities.non_dotted_list_p(synset_words) : "! list_utilities.non_dotted_list_p(synset_words) " + ("list_utilities.non_dotted_list_p(synset_words) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(synset_words) ") + synset_words;
        SubLObject cdolist_list_var = synset_words;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != stringp(elem) : "! stringp(elem) " + ("Types.stringp(elem) " + "CommonSymbols.NIL != Types.stringp(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != consp(workflow_alist) : "! consp(workflow_alist) " + ("Types.consp(workflow_alist) " + "CommonSymbols.NIL != Types.consp(workflow_alist) ") + workflow_alist;
        assert NIL != list_utilities.alist_p(workflow_alist) : "! list_utilities.alist_p(workflow_alist) " + ("list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) ") + workflow_alist;
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        SubLObject cdolist_list_var2 = synset_words;
        SubLObject synset_word = NIL;
        synset_word = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL != list_utilities.alist_lookup(workflow_alist, cconcatenate(synset_word, wordnet_import.$str312$_included), EQUAL, UNPROVIDED)) {
                final SubLObject pos = wordnet_import.wni_heuristic_pos(synset, synset_word, workflow_alist);
                if (NIL != contains_charP(synset_word, CHAR_hyphen)) {
                    wordnet_import.wni_assert_lexicon_for_hyphen_string(synset_word, v_term, workflow_alist, pos, nowP);
                } else
                    if (NIL != contains_charP(synset_word, CHAR_space)) {
                        wordnet_import.wni_assert_lexicon_for_phrase(synset_word, v_term, workflow_alist, pos, nowP);
                    } else {
                        wordnet_import.wni_assert_lexicon_for_denotation(synset_word, v_term, workflow_alist, pos, nowP);
                    }

            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            synset_word = cdolist_list_var2.first();
        } 
        return NIL;
    }

    /**
     * Asserts the appropriate name string sentences for the words in the given mapped SYNSET to individual TERM.
     *
     * @param synset;
     * 		naut-p, the WordNet synset
     * @param term;
     * 		fort-p, the corresponding Cyc term
     * @param workflow-alist
     * 		; alist-p, the new word characteristics association list
     * @param now?
     * 		; booleanp, assert immediately
     */
    @LispMethod(comment = "Asserts the appropriate name string sentences for the words in the given mapped SYNSET to individual TERM.\r\n\r\n@param synset;\r\n\t\tnaut-p, the WordNet synset\r\n@param term;\r\n\t\tfort-p, the corresponding Cyc term\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static final SubLObject wni_assert_heuristic_lexicon_for_individual_alt(SubLObject synset, SubLObject v_term, SubLObject workflow_alist, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(synset, NAUT_P);
            SubLTrampolineFile.checkType(v_term, FORT_P);
            SubLTrampolineFile.checkType(workflow_alist, ALIST_P);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!$$Noun.equal(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_pos(synset))) {
                    Errors.error($str_alt314$WordNet_individual_synset__A_must, synset);
                }
            }
            SubLTrampolineFile.checkType(nowP, BOOLEANP);
            if (NIL != com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_all_hypernymP(synset, $person_synset$.getGlobalValue())) {
                com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_lexicon_for_person(synset, v_term, nowP);
                return NIL;
            } else {
                if (NIL != com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_all_hypernymP(synset, $country_synset$.getGlobalValue())) {
                    return NIL;
                } else {
                    if (NIL != com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_all_hypernymP(synset, $urban_area_synset$.getGlobalValue())) {
                        com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_lexicon_for_urban_area(synset, v_term, nowP);
                        return NIL;
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_all_hypernymP(synset, $geographical_area_synset$.getGlobalValue())) {
                            com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_lexicon_for_geographical_area(synset, v_term, nowP);
                            return NIL;
                        }
                    }
                }
            }
            {
                SubLObject synset_words = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_words(synset);
                SubLObject cdolist_list_var = synset_words;
                SubLObject synset_word = NIL;
                for (synset_word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , synset_word = cdolist_list_var.first()) {
                    if (!((NIL == alist_lookup(workflow_alist, cconcatenate(synset_word, $str_alt310$_included), EQUAL, UNPROVIDED)) || (NIL != memberP(v_term, lexicon_accessors.denots_of_string(synset_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)))) {
                        if (NIL != Strings.stringE(synset_word, Strings.string_upcase(synset_word, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            if (((((NIL != string_utilities.contains_charP(synset_word, CHAR_A)) || (NIL != string_utilities.contains_charP(synset_word, CHAR_E))) || (NIL != string_utilities.contains_charP(synset_word, CHAR_I))) || (NIL != string_utilities.contains_charP(synset_word, CHAR_O))) || (NIL != string_utilities.contains_charP(synset_word, CHAR_U))) {
                                com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_acronym(synset_word, v_term, nowP);
                            } else {
                                com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_initialism(synset_word, v_term, nowP);
                            }
                        } else {
                            com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_name_string(synset_word, v_term, nowP);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Asserts the appropriate name string sentences for the words in the given mapped SYNSET to individual TERM.\r\n\r\n@param synset;\r\n\t\tnaut-p, the WordNet synset\r\n@param term;\r\n\t\tfort-p, the corresponding Cyc term\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static SubLObject wni_assert_heuristic_lexicon_for_individual(final SubLObject synset, final SubLObject v_term, final SubLObject workflow_alist, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != list_utilities.alist_p(workflow_alist) : "! list_utilities.alist_p(workflow_alist) " + ("list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) ") + workflow_alist;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!wordnet_import.$$Noun.equal(wordnet_import.wni_synset_pos(synset)))) {
            Errors.error(wordnet_import.$str316$WordNet_individual_synset__A_must, synset);
        }
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        if (NIL != wordnet_import.wni_all_hypernymP(synset, wordnet_import.$person_synset$.getGlobalValue())) {
            wordnet_import.wni_assert_lexicon_for_person(synset, v_term, nowP);
            return NIL;
        }
        if (NIL != wordnet_import.wni_all_hypernymP(synset, wordnet_import.$country_synset$.getGlobalValue())) {
            return NIL;
        }
        if (NIL != wordnet_import.wni_all_hypernymP(synset, wordnet_import.$urban_area_synset$.getGlobalValue())) {
            wordnet_import.wni_assert_lexicon_for_urban_area(synset, v_term, nowP);
            return NIL;
        }
        if (NIL != wordnet_import.wni_all_hypernymP(synset, wordnet_import.$geographical_area_synset$.getGlobalValue())) {
            wordnet_import.wni_assert_lexicon_for_geographical_area(synset, v_term, nowP);
            return NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject synset_words = cdolist_list_var = wordnet_import.wni_synset_words(synset);
        SubLObject synset_word = NIL;
        synset_word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != list_utilities.alist_lookup(workflow_alist, cconcatenate(synset_word, wordnet_import.$str312$_included), EQUAL, UNPROVIDED)) && (NIL == subl_promotions.memberP(v_term, denots_of_string(synset_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED))) {
                if (NIL != Strings.stringE(synset_word, Strings.string_upcase(synset_word, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    if (((((NIL != contains_charP(synset_word, CHAR_A)) || (NIL != contains_charP(synset_word, CHAR_E))) || (NIL != contains_charP(synset_word, CHAR_I))) || (NIL != contains_charP(synset_word, CHAR_O))) || (NIL != contains_charP(synset_word, CHAR_U))) {
                        wordnet_import.wni_assert_acronym(synset_word, v_term, nowP);
                    } else {
                        wordnet_import.wni_assert_initialism(synset_word, v_term, nowP);
                    }
                } else {
                    wordnet_import.wni_assert_name_string(synset_word, v_term, nowP);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            synset_word = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Asserts #$scientificName sentences for the given SYNSET and TERM.
     *
     * @param synset
     * 		; naut-p, the WordNet synset
     * @param term
     * 		; fort-p, the corresponding Cyc term
     * @param workflow-alist
     * 		; alist-p, the new word characteristics association list
     * @param now?
     * 		; booleanp, assert immediately
     */
    @LispMethod(comment = "Asserts #$scientificName sentences for the given SYNSET and TERM.\r\n\r\n@param synset\r\n\t\t; naut-p, the WordNet synset\r\n@param term\r\n\t\t; fort-p, the corresponding Cyc term\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static final SubLObject wni_assert_heuristic_lexicon_for_organism_alt(SubLObject synset, SubLObject v_term, SubLObject workflow_alist, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(synset, NAUT_P);
        SubLTrampolineFile.checkType(v_term, FORT_P);
        SubLTrampolineFile.checkType(workflow_alist, CONSP);
        SubLTrampolineFile.checkType(workflow_alist, ALIST_P);
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        {
            SubLObject synset_words = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_words(synset);
            SubLObject last_synset_word = last_one(synset_words);
            if (NIL != upper_case_p(string_utilities.first_char(last_synset_word))) {
                com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_isa(v_term, list($$BiologicalSpecies), nowP);
                com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_wff(list($$scientificName, v_term, last_synset_word), $$NewLatinLexicalMt, $MONOTONIC, $FORWARD, nowP);
                synset_words = remove_last(synset_words);
            }
            com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_heuristic_lexicon_for_collection_common(synset, synset_words, v_term, workflow_alist, nowP);
        }
        return NIL;
    }

    @LispMethod(comment = "Asserts #$scientificName sentences for the given SYNSET and TERM.\r\n\r\n@param synset\r\n\t\t; naut-p, the WordNet synset\r\n@param term\r\n\t\t; fort-p, the corresponding Cyc term\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static SubLObject wni_assert_heuristic_lexicon_for_organism(final SubLObject synset, final SubLObject v_term, final SubLObject workflow_alist, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != consp(workflow_alist) : "! consp(workflow_alist) " + ("Types.consp(workflow_alist) " + "CommonSymbols.NIL != Types.consp(workflow_alist) ") + workflow_alist;
        assert NIL != list_utilities.alist_p(workflow_alist) : "! list_utilities.alist_p(workflow_alist) " + ("list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) ") + workflow_alist;
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        SubLObject synset_words = wordnet_import.wni_synset_words(synset);
        final SubLObject last_synset_word = list_utilities.last_one(synset_words);
        if (NIL != upper_case_p(first_char(last_synset_word))) {
            wordnet_import.wni_assert_isa(v_term, list(wordnet_import.$$BiologicalSpecies), nowP);
            wordnet_import.wni_assert_wff(list(wordnet_import.$$scientificName, v_term, last_synset_word), wordnet_import.$$NewLatinLexicalMt, $MONOTONIC, $FORWARD, nowP);
            synset_words = list_utilities.remove_last(synset_words);
        }
        wordnet_import.wni_assert_heuristic_lexicon_for_collection_common(synset, synset_words, v_term, workflow_alist, nowP);
        return NIL;
    }

    /**
     * Asserts #$chemicalFormulaString sentence for the given SYNSET and TERM.
     *
     * @param synset;
     * 		naut-p, the WordNet synset
     * @param term;
     * 		fort-p, the corresponding Cyc term
     * @param now?
     * 		; booleanp, assert immediately
     */
    @LispMethod(comment = "Asserts #$chemicalFormulaString sentence for the given SYNSET and TERM.\r\n\r\n@param synset;\r\n\t\tnaut-p, the WordNet synset\r\n@param term;\r\n\t\tfort-p, the corresponding Cyc term\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static final SubLObject wni_assert_heuristic_lexicon_for_chemical_alt(SubLObject synset, SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(synset, NAUT_P);
        SubLTrampolineFile.checkType(v_term, FORT_P);
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        {
            SubLObject gloss_words = string_utilities.split_string(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_gloss(synset), $list_alt318);
            SubLObject cdolist_list_var = gloss_words;
            SubLObject gloss_word = NIL;
            for (gloss_word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gloss_word = cdolist_list_var.first()) {
                if ((NIL != string_utilities.starts_with(gloss_word, $str_alt132$_)) && (NIL != string_utilities.ends_with(gloss_word, $str_alt134$_, UNPROVIDED))) {
                    gloss_word = subseq(gloss_word, ONE_INTEGER, subtract(length(gloss_word), ONE_INTEGER));
                }
                if (NIL != chemistry_utilities.chem_parseP(gloss_word)) {
                    com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_wff(list($$chemicalFormulaString, v_term, gloss_word), $const320$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Asserts #$chemicalFormulaString sentence for the given SYNSET and TERM.\r\n\r\n@param synset;\r\n\t\tnaut-p, the WordNet synset\r\n@param term;\r\n\t\tfort-p, the corresponding Cyc term\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static SubLObject wni_assert_heuristic_lexicon_for_chemical(final SubLObject synset, final SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        SubLObject cdolist_list_var;
        final SubLObject gloss_words = cdolist_list_var = split_string(wordnet_import.wni_synset_gloss(synset), wordnet_import.$list320);
        SubLObject gloss_word = NIL;
        gloss_word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != starts_with(gloss_word, wordnet_import.$str134$_)) && (NIL != ends_with(gloss_word, wordnet_import.$str136$_, UNPROVIDED))) {
                gloss_word = subseq(gloss_word, ONE_INTEGER, subtract(length(gloss_word), ONE_INTEGER));
            }
            cdolist_list_var = cdolist_list_var.rest();
            gloss_word = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Asserts #$hyphenString sentence for the given SYNSET-WORD and TERM.
     *
     * @param synset-word;
     * 		stringp, the WordNet synset word
     * @param term;
     * 		fort-p, the corresponding Cyc term
     * @param workflow-alist
     * 		; alist-p, the new word characteristics association list
     * @param pos;
     * 		fort-p, the part of speech
     * @param now?
     * 		; booleanp, assert immediately
     */
    @LispMethod(comment = "Asserts #$hyphenString sentence for the given SYNSET-WORD and TERM.\r\n\r\n@param synset-word;\r\n\t\tstringp, the WordNet synset word\r\n@param term;\r\n\t\tfort-p, the corresponding Cyc term\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@param pos;\r\n\t\tfort-p, the part of speech\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static final SubLObject wni_assert_lexicon_for_hyphen_string_alt(SubLObject synset_word, SubLObject v_term, SubLObject workflow_alist, SubLObject pos, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(synset_word, STRINGP);
        SubLTrampolineFile.checkType(v_term, FORT_P);
        SubLTrampolineFile.checkType(workflow_alist, CONSP);
        SubLTrampolineFile.checkType(workflow_alist, ALIST_P);
        SubLTrampolineFile.checkType(pos, FORT_P);
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        {
            SubLObject hyphenated_words = string_utilities.split_string(synset_word, $list_alt321);
            SubLObject all_but_last_words = append(list($$TheList), remove_last(hyphenated_words));
            SubLObject last_word = last_one(hyphenated_words);
            SubLObject last_word_unit = lexicon_accessors.best_wu_for_string(last_word, pos);
            SubLObject sentence = NIL;
            if (NIL == last_word_unit) {
                lexification_wizard.add_lexical_mapping(last_word, pos, $$GeneralEnglishMt, UNPROVIDED);
                last_word_unit = lexicon_accessors.best_wu_for_string(last_word, pos);
            }
            if (NIL != last_word_unit) {
                sentence = list($$hyphenString, all_but_last_words, last_word_unit, pos, v_term);
                com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_wff(sentence, $const320$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
                com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_lexical_annotations(sentence, synset_word, workflow_alist, nowP);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Asserts #$hyphenString sentence for the given SYNSET-WORD and TERM.\r\n\r\n@param synset-word;\r\n\t\tstringp, the WordNet synset word\r\n@param term;\r\n\t\tfort-p, the corresponding Cyc term\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@param pos;\r\n\t\tfort-p, the part of speech\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static SubLObject wni_assert_lexicon_for_hyphen_string(final SubLObject synset_word, final SubLObject v_term, final SubLObject workflow_alist, final SubLObject pos, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != stringp(synset_word) : "! stringp(synset_word) " + ("Types.stringp(synset_word) " + "CommonSymbols.NIL != Types.stringp(synset_word) ") + synset_word;
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != consp(workflow_alist) : "! consp(workflow_alist) " + ("Types.consp(workflow_alist) " + "CommonSymbols.NIL != Types.consp(workflow_alist) ") + workflow_alist;
        assert NIL != list_utilities.alist_p(workflow_alist) : "! list_utilities.alist_p(workflow_alist) " + ("list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) ") + workflow_alist;
        assert NIL != forts.fort_p(pos) : "! forts.fort_p(pos) " + ("forts.fort_p(pos) " + "CommonSymbols.NIL != forts.fort_p(pos) ") + pos;
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        final SubLObject hyphenated_words = split_string(synset_word, wordnet_import.$list321);
        final SubLObject all_but_last_words = append(list(wordnet_import.$$TheList), list_utilities.remove_last(hyphenated_words));
        final SubLObject last_word = list_utilities.last_one(hyphenated_words);
        SubLObject last_word_unit = best_wu_for_string(last_word, pos);
        SubLObject sentence = NIL;
        if (NIL == last_word_unit) {
            add_lexical_mapping(last_word, pos, wordnet_import.$$GeneralEnglishMt, UNPROVIDED);
            last_word_unit = best_wu_for_string(last_word, pos);
        }
        if (NIL != last_word_unit) {
            sentence = list(wordnet_import.$$hyphenString, all_but_last_words, last_word_unit, pos, v_term);
            wordnet_import.wni_assert_wff(sentence, wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
            wordnet_import.wni_assert_lexical_annotations(sentence, synset_word, workflow_alist, nowP);
        }
        return NIL;
    }

    /**
     * Asserts #$multiWordString or #$compoundString sentence for the given SYNSET-WORD and TERM.
     *
     * @param synset-word;
     * 		stringp, the WordNet synset word
     * @param term;
     * 		fort-p, the corresponding Cyc term
     * @param workflow-alist
     * 		; alist-p, the new word characteristics association list
     * @param pos;
     * 		fort-p, the part of speech
     * @param now?
     * 		; booleanp, assert immediately
     */
    @LispMethod(comment = "Asserts #$multiWordString or #$compoundString sentence for the given SYNSET-WORD and TERM.\r\n\r\n@param synset-word;\r\n\t\tstringp, the WordNet synset word\r\n@param term;\r\n\t\tfort-p, the corresponding Cyc term\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@param pos;\r\n\t\tfort-p, the part of speech\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static final SubLObject wni_assert_lexicon_for_phrase_alt(SubLObject synset_word, SubLObject v_term, SubLObject workflow_alist, SubLObject pos, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(synset_word, STRINGP);
        SubLTrampolineFile.checkType(v_term, FORT_P);
        SubLTrampolineFile.checkType(workflow_alist, CONSP);
        SubLTrampolineFile.checkType(workflow_alist, ALIST_P);
        SubLTrampolineFile.checkType(pos, FORT_P);
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        {
            SubLObject key = cconcatenate(synset_word, $str_alt325$_count_noun);
            SubLObject value = alist_lookup(workflow_alist, key, EQUAL, UNPROVIDED);
            if (NIL != Strings.stringE(value, $str_alt326$headword_is_first, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_lexicon_for_compound_string(synset_word, v_term, workflow_alist, pos, nowP);
            } else {
                com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_lexicon_for_multi_word_string(synset_word, v_term, workflow_alist, pos, nowP);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Asserts #$multiWordString or #$compoundString sentence for the given SYNSET-WORD and TERM.\r\n\r\n@param synset-word;\r\n\t\tstringp, the WordNet synset word\r\n@param term;\r\n\t\tfort-p, the corresponding Cyc term\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@param pos;\r\n\t\tfort-p, the part of speech\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static SubLObject wni_assert_lexicon_for_phrase(final SubLObject synset_word, final SubLObject v_term, final SubLObject workflow_alist, final SubLObject pos, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != stringp(synset_word) : "! stringp(synset_word) " + ("Types.stringp(synset_word) " + "CommonSymbols.NIL != Types.stringp(synset_word) ") + synset_word;
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != consp(workflow_alist) : "! consp(workflow_alist) " + ("Types.consp(workflow_alist) " + "CommonSymbols.NIL != Types.consp(workflow_alist) ") + workflow_alist;
        assert NIL != list_utilities.alist_p(workflow_alist) : "! list_utilities.alist_p(workflow_alist) " + ("list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) ") + workflow_alist;
        assert NIL != forts.fort_p(pos) : "! forts.fort_p(pos) " + ("forts.fort_p(pos) " + "CommonSymbols.NIL != forts.fort_p(pos) ") + pos;
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        final SubLObject key = cconcatenate(synset_word, wordnet_import.$str326$_count_noun);
        final SubLObject value = list_utilities.alist_lookup(workflow_alist, key, EQUAL, UNPROVIDED);
        if (NIL != Strings.stringE(value, wordnet_import.$str327$headword_is_first, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            wordnet_import.wni_assert_lexicon_for_compound_string(synset_word, v_term, workflow_alist, pos, nowP);
        } else {
            wordnet_import.wni_assert_lexicon_for_multi_word_string(synset_word, v_term, workflow_alist, pos, nowP);
        }
        return NIL;
    }

    /**
     * Asserts #$multiWordString sentence for the given SYNSET-WORD and TERM.
     *
     * @param synset-word;
     * 		stringp, the WordNet synset word
     * @param term;
     * 		fort-p, the corresponding Cyc term
     * @param workflow-alist
     * 		; alist-p, the new word characteristics association list
     * @param pos;
     * 		fort-p, the part of speech
     * @param now?
     * 		; booleanp, assert immediately
     */
    @LispMethod(comment = "Asserts #$multiWordString sentence for the given SYNSET-WORD and TERM.\r\n\r\n@param synset-word;\r\n\t\tstringp, the WordNet synset word\r\n@param term;\r\n\t\tfort-p, the corresponding Cyc term\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@param pos;\r\n\t\tfort-p, the part of speech\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static final SubLObject wni_assert_lexicon_for_multi_word_string_alt(SubLObject synset_word, SubLObject v_term, SubLObject workflow_alist, SubLObject pos, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(synset_word, STRINGP);
        SubLTrampolineFile.checkType(v_term, FORT_P);
        SubLTrampolineFile.checkType(workflow_alist, CONSP);
        SubLTrampolineFile.checkType(workflow_alist, ALIST_P);
        SubLTrampolineFile.checkType(pos, FORT_P);
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        {
            SubLObject multi_words = string_utilities.split_string(synset_word, UNPROVIDED);
            SubLObject all_but_last_words = append(list($$TheList), remove_last(multi_words));
            SubLObject last_word = last_one(multi_words);
            SubLObject last_word_unit = lexicon_accessors.best_wu_for_string(last_word, pos);
            SubLObject sentence = NIL;
            if (NIL == last_word_unit) {
                lexification_wizard.add_lexical_mapping(last_word, pos, $$GeneralEnglishMt, UNPROVIDED);
                last_word_unit = lexicon_accessors.best_wu_for_string(last_word, pos);
            }
            if (NIL != last_word_unit) {
                sentence = list($$multiWordString, all_but_last_words, last_word_unit, pos, v_term);
                com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_wff(sentence, $const320$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
                com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_lexical_annotations(sentence, synset_word, workflow_alist, nowP);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Asserts #$multiWordString sentence for the given SYNSET-WORD and TERM.\r\n\r\n@param synset-word;\r\n\t\tstringp, the WordNet synset word\r\n@param term;\r\n\t\tfort-p, the corresponding Cyc term\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@param pos;\r\n\t\tfort-p, the part of speech\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static SubLObject wni_assert_lexicon_for_multi_word_string(final SubLObject synset_word, final SubLObject v_term, final SubLObject workflow_alist, final SubLObject pos, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != stringp(synset_word) : "! stringp(synset_word) " + ("Types.stringp(synset_word) " + "CommonSymbols.NIL != Types.stringp(synset_word) ") + synset_word;
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != consp(workflow_alist) : "! consp(workflow_alist) " + ("Types.consp(workflow_alist) " + "CommonSymbols.NIL != Types.consp(workflow_alist) ") + workflow_alist;
        assert NIL != list_utilities.alist_p(workflow_alist) : "! list_utilities.alist_p(workflow_alist) " + ("list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) ") + workflow_alist;
        assert NIL != forts.fort_p(pos) : "! forts.fort_p(pos) " + ("forts.fort_p(pos) " + "CommonSymbols.NIL != forts.fort_p(pos) ") + pos;
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        final SubLObject multi_words = split_string(synset_word, UNPROVIDED);
        final SubLObject all_but_last_words = append(list(wordnet_import.$$TheList), list_utilities.remove_last(multi_words));
        final SubLObject last_word = list_utilities.last_one(multi_words);
        SubLObject last_word_unit = best_wu_for_string(last_word, pos);
        SubLObject sentence = NIL;
        if (NIL == last_word_unit) {
            add_lexical_mapping(last_word, pos, wordnet_import.$$GeneralEnglishMt, UNPROVIDED);
            last_word_unit = best_wu_for_string(last_word, pos);
        }
        if (NIL != last_word_unit) {
            sentence = list(wordnet_import.$$multiWordString, all_but_last_words, last_word_unit, pos, v_term);
            wordnet_import.wni_assert_wff(sentence, wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
            wordnet_import.wni_assert_lexical_annotations(sentence, synset_word, workflow_alist, nowP);
        }
        return NIL;
    }

    /**
     * Asserts #$compoundString sentence for the given SYNSET-WORD and TERM.
     *
     * @param synset-word;
     * 		stringp, the WordNet synset word
     * @param term;
     * 		fort-p, the corresponding Cyc term
     * @param workflow-alist
     * 		; alist-p, the new word characteristics association list
     * @param pos;
     * 		fort-p, the part of speech
     * @param now?
     * 		; booleanp, assert immediately
     */
    @LispMethod(comment = "Asserts #$compoundString sentence for the given SYNSET-WORD and TERM.\r\n\r\n@param synset-word;\r\n\t\tstringp, the WordNet synset word\r\n@param term;\r\n\t\tfort-p, the corresponding Cyc term\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@param pos;\r\n\t\tfort-p, the part of speech\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static final SubLObject wni_assert_lexicon_for_compound_string_alt(SubLObject synset_word, SubLObject v_term, SubLObject workflow_alist, SubLObject pos, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(synset_word, STRINGP);
        SubLTrampolineFile.checkType(v_term, FORT_P);
        SubLTrampolineFile.checkType(workflow_alist, CONSP);
        SubLTrampolineFile.checkType(workflow_alist, ALIST_P);
        SubLTrampolineFile.checkType(pos, FORT_P);
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        {
            SubLObject multi_words = string_utilities.split_string(synset_word, UNPROVIDED);
            SubLObject all_but_first_words = append(list($$TheList), multi_words.rest());
            SubLObject first_word = multi_words.first();
            SubLObject first_word_unit = lexicon_accessors.best_wu_for_string(first_word, pos);
            SubLObject sentence = NIL;
            if (NIL == first_word_unit) {
                lexification_wizard.add_lexical_mapping(first_word, pos, $$GeneralEnglishMt, UNPROVIDED);
                first_word_unit = lexicon_accessors.best_wu_for_string(first_word, pos);
            }
            if (NIL != first_word_unit) {
                sentence = list($$compoundString, first_word_unit, all_but_first_words, pos, v_term);
                com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_wff(sentence, $const320$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
                com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_lexical_annotations(sentence, synset_word, workflow_alist, nowP);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Asserts #$compoundString sentence for the given SYNSET-WORD and TERM.\r\n\r\n@param synset-word;\r\n\t\tstringp, the WordNet synset word\r\n@param term;\r\n\t\tfort-p, the corresponding Cyc term\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@param pos;\r\n\t\tfort-p, the part of speech\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static SubLObject wni_assert_lexicon_for_compound_string(final SubLObject synset_word, final SubLObject v_term, final SubLObject workflow_alist, final SubLObject pos, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != stringp(synset_word) : "! stringp(synset_word) " + ("Types.stringp(synset_word) " + "CommonSymbols.NIL != Types.stringp(synset_word) ") + synset_word;
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != consp(workflow_alist) : "! consp(workflow_alist) " + ("Types.consp(workflow_alist) " + "CommonSymbols.NIL != Types.consp(workflow_alist) ") + workflow_alist;
        assert NIL != list_utilities.alist_p(workflow_alist) : "! list_utilities.alist_p(workflow_alist) " + ("list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) ") + workflow_alist;
        assert NIL != forts.fort_p(pos) : "! forts.fort_p(pos) " + ("forts.fort_p(pos) " + "CommonSymbols.NIL != forts.fort_p(pos) ") + pos;
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        final SubLObject multi_words = split_string(synset_word, UNPROVIDED);
        final SubLObject all_but_first_words = append(list(wordnet_import.$$TheList), multi_words.rest());
        final SubLObject first_word = multi_words.first();
        SubLObject first_word_unit = best_wu_for_string(first_word, pos);
        SubLObject sentence = NIL;
        if (NIL == first_word_unit) {
            add_lexical_mapping(first_word, pos, wordnet_import.$$GeneralEnglishMt, UNPROVIDED);
            first_word_unit = best_wu_for_string(first_word, pos);
        }
        if (NIL != first_word_unit) {
            sentence = list(wordnet_import.$$compoundString, first_word_unit, all_but_first_words, pos, v_term);
            wordnet_import.wni_assert_wff(sentence, wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
            wordnet_import.wni_assert_lexical_annotations(sentence, synset_word, workflow_alist, nowP);
        }
        return NIL;
    }

    /**
     * Asserts #$denotation sentence for the given SYNSET-WORD and TERM.
     *
     * @param synset-word;
     * 		stringp, the WordNet synset word
     * @param term;
     * 		fort-p, the corresponding Cyc term
     * @param pos;
     * 		fort-p, the part of speech
     * @param workflow-alist
     * 		; alist-p, the new word characteristics association list
     * @param now?
     * 		; booleanp, assert immediately
     */
    @LispMethod(comment = "Asserts #$denotation sentence for the given SYNSET-WORD and TERM.\r\n\r\n@param synset-word;\r\n\t\tstringp, the WordNet synset word\r\n@param term;\r\n\t\tfort-p, the corresponding Cyc term\r\n@param pos;\r\n\t\tfort-p, the part of speech\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static final SubLObject wni_assert_lexicon_for_denotation_alt(SubLObject synset_word, SubLObject v_term, SubLObject workflow_alist, SubLObject pos, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(synset_word, STRINGP);
        SubLTrampolineFile.checkType(v_term, FORT_P);
        SubLTrampolineFile.checkType(pos, FORT_P);
        SubLTrampolineFile.checkType(workflow_alist, CONSP);
        SubLTrampolineFile.checkType(workflow_alist, ALIST_P);
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        {
            SubLObject word_unit = lexicon_accessors.best_wu_for_string(synset_word, pos);
            SubLObject word_sense = NIL;
            SubLObject denotation_sentence = NIL;
            if (NIL == word_unit) {
                lexification_wizard.add_lexical_mapping(synset_word, pos, $$GeneralEnglishMt, UNPROVIDED);
                word_unit = lexicon_accessors.best_wu_for_string(synset_word, pos);
            }
            if (NIL != word_unit) {
                if (NIL != memberP(v_term, lexicon_accessors.denots_of_string(synset_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                    com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_lexicon_for_existing_denotation(synset_word, v_term, workflow_alist, pos, nowP);
                    return NIL;
                }
                word_sense = lexicon_utilities.unique_ws(word_unit, pos, v_term);
                denotation_sentence = list($$denotation, word_unit, pos, word_sense, v_term);
                com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_wff(denotation_sentence, $const320$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
                com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_lexical_annotations(denotation_sentence, synset_word, workflow_alist, nowP);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Asserts #$denotation sentence for the given SYNSET-WORD and TERM.\r\n\r\n@param synset-word;\r\n\t\tstringp, the WordNet synset word\r\n@param term;\r\n\t\tfort-p, the corresponding Cyc term\r\n@param pos;\r\n\t\tfort-p, the part of speech\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static SubLObject wni_assert_lexicon_for_denotation(final SubLObject synset_word, final SubLObject v_term, final SubLObject workflow_alist, final SubLObject pos, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != stringp(synset_word) : "! stringp(synset_word) " + ("Types.stringp(synset_word) " + "CommonSymbols.NIL != Types.stringp(synset_word) ") + synset_word;
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != forts.fort_p(pos) : "! forts.fort_p(pos) " + ("forts.fort_p(pos) " + "CommonSymbols.NIL != forts.fort_p(pos) ") + pos;
        assert NIL != consp(workflow_alist) : "! consp(workflow_alist) " + ("Types.consp(workflow_alist) " + "CommonSymbols.NIL != Types.consp(workflow_alist) ") + workflow_alist;
        assert NIL != list_utilities.alist_p(workflow_alist) : "! list_utilities.alist_p(workflow_alist) " + ("list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) ") + workflow_alist;
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        SubLObject word_unit = best_wu_for_string(synset_word, pos);
        SubLObject word_sense = NIL;
        SubLObject denotation_sentence = NIL;
        if (NIL == word_unit) {
            add_lexical_mapping(synset_word, pos, wordnet_import.$$GeneralEnglishMt, UNPROVIDED);
            word_unit = best_wu_for_string(synset_word, pos);
        }
        if (NIL != word_unit) {
            if (NIL != subl_promotions.memberP(v_term, denots_of_string(synset_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                wordnet_import.wni_assert_lexicon_for_existing_denotation(synset_word, v_term, workflow_alist, pos, nowP);
                return NIL;
            }
            word_sense = unique_ws(word_unit, pos, v_term);
            denotation_sentence = list(wordnet_import.$$denotation, word_unit, pos, word_sense, v_term);
            wordnet_import.wni_assert_wff(denotation_sentence, wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
            wordnet_import.wni_assert_lexical_annotations(denotation_sentence, synset_word, workflow_alist, nowP);
        }
        return NIL;
    }

    /**
     * Asserts #$denotation sentence for the given SYNSET-WORD and TERM.
     *
     * @param synset-word;
     * 		stringp, the WordNet synset word
     * @param term;
     * 		fort-p, the corresponding Cyc term
     * @param pos;
     * 		fort-p, the part of speech
     * @param workflow-alist
     * 		; alist-p, the new word characteristics association list
     * @param now?
     * 		; booleanp, assert immediately
     */
    @LispMethod(comment = "Asserts #$denotation sentence for the given SYNSET-WORD and TERM.\r\n\r\n@param synset-word;\r\n\t\tstringp, the WordNet synset word\r\n@param term;\r\n\t\tfort-p, the corresponding Cyc term\r\n@param pos;\r\n\t\tfort-p, the part of speech\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static final SubLObject wni_assert_lexicon_for_existing_denotation_alt(SubLObject synset_word, SubLObject v_term, SubLObject workflow_alist, SubLObject pos, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(synset_word, STRINGP);
            SubLTrampolineFile.checkType(v_term, FORT_P);
            SubLTrampolineFile.checkType(pos, FORT_P);
            SubLTrampolineFile.checkType(workflow_alist, CONSP);
            SubLTrampolineFile.checkType(workflow_alist, ALIST_P);
            SubLTrampolineFile.checkType(nowP, BOOLEANP);
            {
                SubLObject word_unit = lexicon_accessors.best_wu_for_string(synset_word, pos);
                SubLObject actual_pos = NIL;
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == word_unit) {
                        Errors.error($str_alt329$must_have_an_existing_word_unit_f, synset_word, pos);
                    }
                }
                {
                    SubLObject word_sense = NIL;
                    SubLObject denotation_sentence = NIL;
                    SubLObject query = list($$denotation, word_unit, $sym50$_POS, $sym330$_WORD_SENSE, v_term);
                    SubLObject query_properties = $list_alt7;
                    SubLObject results = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_trace_new_cyc_query(query, $$GeneralEnglishMt, query_properties);
                    if (NIL != results) {
                        actual_pos = bindings.variable_lookup($sym50$_POS, results.first());
                        word_sense = bindings.variable_lookup($sym330$_WORD_SENSE, results.first());
                    }
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == word_sense) {
                            Errors.error($str_alt331$must_have_an_existing_word_sense_, word_unit, pos);
                        }
                    }
                    denotation_sentence = list($$denotation, word_unit, actual_pos, word_sense, v_term);
                    com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_lexical_annotations(denotation_sentence, synset_word, workflow_alist, nowP);
                    return NIL;
                }
            }
        }
    }

    @LispMethod(comment = "Asserts #$denotation sentence for the given SYNSET-WORD and TERM.\r\n\r\n@param synset-word;\r\n\t\tstringp, the WordNet synset word\r\n@param term;\r\n\t\tfort-p, the corresponding Cyc term\r\n@param pos;\r\n\t\tfort-p, the part of speech\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static SubLObject wni_assert_lexicon_for_existing_denotation(final SubLObject synset_word, final SubLObject v_term, final SubLObject workflow_alist, final SubLObject pos, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(synset_word) : "! stringp(synset_word) " + ("Types.stringp(synset_word) " + "CommonSymbols.NIL != Types.stringp(synset_word) ") + synset_word;
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != forts.fort_p(pos) : "! forts.fort_p(pos) " + ("forts.fort_p(pos) " + "CommonSymbols.NIL != forts.fort_p(pos) ") + pos;
        assert NIL != consp(workflow_alist) : "! consp(workflow_alist) " + ("Types.consp(workflow_alist) " + "CommonSymbols.NIL != Types.consp(workflow_alist) ") + workflow_alist;
        assert NIL != list_utilities.alist_p(workflow_alist) : "! list_utilities.alist_p(workflow_alist) " + ("list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) ") + workflow_alist;
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        final SubLObject word_unit = best_wu_for_string(synset_word, pos);
        SubLObject actual_pos = NIL;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == word_unit)) {
            Errors.error(wordnet_import.$str330$must_have_an_existing_word_unit_f, synset_word, pos);
        }
        SubLObject word_sense = NIL;
        SubLObject denotation_sentence = NIL;
        final SubLObject query = list(wordnet_import.$$denotation, word_unit, wordnet_import.$sym52$_POS, wordnet_import.$sym331$_WORD_SENSE, v_term);
        final SubLObject query_properties = wordnet_import.$list9;
        final SubLObject results = wordnet_import.wni_trace_new_cyc_query(query, wordnet_import.$$GeneralEnglishMt, query_properties);
        if (NIL != results) {
            actual_pos = variable_lookup(wordnet_import.$sym52$_POS, results.first());
            word_sense = variable_lookup(wordnet_import.$sym331$_WORD_SENSE, results.first());
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == word_sense)) {
            Errors.error(wordnet_import.$str332$must_have_an_existing_word_sense_, word_unit, pos);
        }
        denotation_sentence = list(wordnet_import.$$denotation, word_unit, actual_pos, word_sense, v_term);
        wordnet_import.wni_assert_lexical_annotations(denotation_sentence, synset_word, workflow_alist, nowP);
        return NIL;
    }

    /**
     * Asserts lexical annotations for the given SENTENCE.
     *
     * @param denotation-sentence
     * 		; consp, a sentence such as (#$denotation #$Simper-TheWord #$Verb 1 #$Smirking)
     * @param synset-word
     * 		; stringp, the given WordNet synset word
     * @param workflow-alist
     * 		; alist-p, the new word characteristics association list
     * @param now?
     * 		; booleanp, assert immediately
     */
    @LispMethod(comment = "Asserts lexical annotations for the given SENTENCE.\r\n\r\n@param denotation-sentence\r\n\t\t; consp, a sentence such as (#$denotation #$Simper-TheWord #$Verb 1 #$Smirking)\r\n@param synset-word\r\n\t\t; stringp, the given WordNet synset word\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static final SubLObject wni_assert_lexical_annotations_alt(SubLObject denotation_sentence, SubLObject synset_word, SubLObject workflow_alist, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(denotation_sentence, CONSP);
        SubLTrampolineFile.checkType(synset_word, STRINGP);
        SubLTrampolineFile.checkType(workflow_alist, CONSP);
        SubLTrampolineFile.checkType(workflow_alist, ALIST_P);
        {
            SubLObject politeness = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_politeness(synset_word, workflow_alist);
            SubLObject formality = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_formality(synset_word, workflow_alist);
            SubLObject rhetorical_device = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_rhetorical_device(synset_word, workflow_alist);
            if (NIL != politeness) {
                com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_wff(list($$politenessOfWS, denotation_sentence, politeness), $const320$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
            }
            if (NIL != formality) {
                com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_wff(list($$formalityOfWS, denotation_sentence, formality), $const320$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
            }
            if (NIL != rhetorical_device) {
                com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_wff(list($$rhetoricalDeviceOfPhrase, denotation_sentence, rhetorical_device), $const320$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Asserts lexical annotations for the given SENTENCE.\r\n\r\n@param denotation-sentence\r\n\t\t; consp, a sentence such as (#$denotation #$Simper-TheWord #$Verb 1 #$Smirking)\r\n@param synset-word\r\n\t\t; stringp, the given WordNet synset word\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static SubLObject wni_assert_lexical_annotations(final SubLObject denotation_sentence, final SubLObject synset_word, final SubLObject workflow_alist, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != consp(denotation_sentence) : "! consp(denotation_sentence) " + ("Types.consp(denotation_sentence) " + "CommonSymbols.NIL != Types.consp(denotation_sentence) ") + denotation_sentence;
        assert NIL != stringp(synset_word) : "! stringp(synset_word) " + ("Types.stringp(synset_word) " + "CommonSymbols.NIL != Types.stringp(synset_word) ") + synset_word;
        assert NIL != consp(workflow_alist) : "! consp(workflow_alist) " + ("Types.consp(workflow_alist) " + "CommonSymbols.NIL != Types.consp(workflow_alist) ") + workflow_alist;
        assert NIL != list_utilities.alist_p(workflow_alist) : "! list_utilities.alist_p(workflow_alist) " + ("list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) ") + workflow_alist;
        final SubLObject politeness = wordnet_import.wni_politeness(synset_word, workflow_alist);
        final SubLObject formality = wordnet_import.wni_formality(synset_word, workflow_alist);
        final SubLObject rhetorical_device = wordnet_import.wni_rhetorical_device(synset_word, workflow_alist);
        if (NIL != politeness) {
            wordnet_import.wni_assert_wff(list(wordnet_import.$$politenessOfWS, denotation_sentence, politeness), wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
        }
        if (NIL != formality) {
            wordnet_import.wni_assert_wff(list(wordnet_import.$$formalityOfWS, denotation_sentence, formality), wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
        }
        if (NIL != rhetorical_device) {
            wordnet_import.wni_assert_wff(list(wordnet_import.$$rhetoricalDeviceOfPhrase, denotation_sentence, rhetorical_device), wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
        }
        return NIL;
    }

    /**
     * Returns the associated politeness for SYNSET-WORD from the given WORKFLOW-ALIST.
     *
     * @param synset-word
     * 		; stringp, the given WordNet synset word
     * @param workflow-alist
     * 		; alist-p, the new word characteristics association list
     * @return fort-p, the politeness
     */
    @LispMethod(comment = "Returns the associated politeness for SYNSET-WORD from the given WORKFLOW-ALIST.\r\n\r\n@param synset-word\r\n\t\t; stringp, the given WordNet synset word\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@return fort-p, the politeness")
    public static final SubLObject wni_politeness_alt(SubLObject synset_word, SubLObject workflow_alist) {
        SubLTrampolineFile.checkType(synset_word, STRINGP);
        SubLTrampolineFile.checkType(workflow_alist, CONSP);
        SubLTrampolineFile.checkType(workflow_alist, ALIST_P);
        {
            SubLObject politeness = NIL;
            SubLObject politeness_value = alist_lookup(workflow_alist, cconcatenate(synset_word, $str_alt335$_politeness), EQUAL, UNPROVIDED);
            if (NIL != Strings.stringE(politeness_value, $$$polite, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                politeness = $$PoliteSpeech;
            } else {
                if (NIL != Strings.stringE(politeness_value, $$$rude, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    politeness = $$RudeSpeech;
                } else {
                    if (NIL != Strings.stringE(politeness_value, $$$vulgar, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        politeness = $$VulgarSpeech;
                    }
                }
            }
            if (NIL != politeness) {
                SubLTrampolineFile.checkType(politeness, FORT_P);
            }
            return politeness;
        }
    }

    @LispMethod(comment = "Returns the associated politeness for SYNSET-WORD from the given WORKFLOW-ALIST.\r\n\r\n@param synset-word\r\n\t\t; stringp, the given WordNet synset word\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@return fort-p, the politeness")
    public static SubLObject wni_politeness(final SubLObject synset_word, final SubLObject workflow_alist) {
        assert NIL != stringp(synset_word) : "! stringp(synset_word) " + ("Types.stringp(synset_word) " + "CommonSymbols.NIL != Types.stringp(synset_word) ") + synset_word;
        assert NIL != consp(workflow_alist) : "! consp(workflow_alist) " + ("Types.consp(workflow_alist) " + "CommonSymbols.NIL != Types.consp(workflow_alist) ") + workflow_alist;
        assert NIL != list_utilities.alist_p(workflow_alist) : "! list_utilities.alist_p(workflow_alist) " + ("list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) ") + workflow_alist;
        SubLObject politeness = NIL;
        final SubLObject politeness_value = list_utilities.alist_lookup(workflow_alist, cconcatenate(synset_word, wordnet_import.$str336$_politeness), EQUAL, UNPROVIDED);
        if (NIL != Strings.stringE(politeness_value, wordnet_import.$$$polite, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            politeness = wordnet_import.$$PoliteSpeech;
        } else
            if (NIL != Strings.stringE(politeness_value, wordnet_import.$$$rude, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                politeness = wordnet_import.$$RudeSpeech;
            } else
                if (NIL != Strings.stringE(politeness_value, wordnet_import.$$$vulgar, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    politeness = wordnet_import.$$VulgarSpeech;
                }


        if (((NIL != politeness) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == forts.fort_p(politeness))) {
            throw new AssertionError(politeness);
        }
        return politeness;
    }

    /**
     * Returns the associated formality for SYNSET-WORD from the given WORKFLOW-ALIST.
     *
     * @param synset-word
     * 		; stringp, the given WordNet synset word
     * @param workflow-alist
     * 		; alist-p, the new word characteristics association list
     * @return fort-p, the formality
     */
    @LispMethod(comment = "Returns the associated formality for SYNSET-WORD from the given WORKFLOW-ALIST.\r\n\r\n@param synset-word\r\n\t\t; stringp, the given WordNet synset word\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@return fort-p, the formality")
    public static final SubLObject wni_formality_alt(SubLObject synset_word, SubLObject workflow_alist) {
        SubLTrampolineFile.checkType(synset_word, STRINGP);
        SubLTrampolineFile.checkType(workflow_alist, CONSP);
        SubLTrampolineFile.checkType(workflow_alist, ALIST_P);
        {
            SubLObject formality = NIL;
            SubLObject formality_value = alist_lookup(workflow_alist, cconcatenate(synset_word, $str_alt342$_formality), EQUAL, UNPROVIDED);
            if (NIL != Strings.stringE(formality_value, $$$archaic, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                formality = $$ArchaicSpeech;
            } else {
                if (NIL != Strings.stringE(formality_value, $$$slang, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    formality = $$SlangSpeech;
                } else {
                    if (NIL != Strings.stringE(formality_value, $$$formal, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        formality = $$FormalSpeech;
                    } else {
                        if (NIL != Strings.stringE(formality_value, $$$informal, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            formality = $$InformalSpeech;
                        } else {
                            if (NIL != Strings.stringE(formality_value, $$$baby_talk, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                formality = $$BabyTalk;
                            } else {
                                if (NIL != Strings.stringE(formality_value, $$$technical_jargon, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                    formality = $$Jargon;
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != formality) {
                SubLTrampolineFile.checkType(formality, FORT_P);
            }
            return formality;
        }
    }

    @LispMethod(comment = "Returns the associated formality for SYNSET-WORD from the given WORKFLOW-ALIST.\r\n\r\n@param synset-word\r\n\t\t; stringp, the given WordNet synset word\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@return fort-p, the formality")
    public static SubLObject wni_formality(final SubLObject synset_word, final SubLObject workflow_alist) {
        assert NIL != stringp(synset_word) : "! stringp(synset_word) " + ("Types.stringp(synset_word) " + "CommonSymbols.NIL != Types.stringp(synset_word) ") + synset_word;
        assert NIL != consp(workflow_alist) : "! consp(workflow_alist) " + ("Types.consp(workflow_alist) " + "CommonSymbols.NIL != Types.consp(workflow_alist) ") + workflow_alist;
        assert NIL != list_utilities.alist_p(workflow_alist) : "! list_utilities.alist_p(workflow_alist) " + ("list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) ") + workflow_alist;
        SubLObject formality = NIL;
        final SubLObject formality_value = list_utilities.alist_lookup(workflow_alist, cconcatenate(synset_word, wordnet_import.$str343$_formality), EQUAL, UNPROVIDED);
        if (NIL != Strings.stringE(formality_value, wordnet_import.$$$archaic, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            formality = wordnet_import.$$ArchaicSpeech;
        } else
            if (NIL != Strings.stringE(formality_value, wordnet_import.$$$slang, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                formality = wordnet_import.$$SlangSpeech;
            } else
                if (NIL != Strings.stringE(formality_value, wordnet_import.$$$formal, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    formality = wordnet_import.$$FormalSpeech;
                } else
                    if (NIL != Strings.stringE(formality_value, wordnet_import.$$$informal, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        formality = wordnet_import.$$InformalSpeech;
                    } else
                        if (NIL != Strings.stringE(formality_value, wordnet_import.$$$baby_talk, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            formality = wordnet_import.$$BabyTalk;
                        } else
                            if (NIL != Strings.stringE(formality_value, wordnet_import.$$$technical_jargon, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                formality = wordnet_import.$$Jargon;
                            }





        if (((NIL != formality) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == forts.fort_p(formality))) {
            throw new AssertionError(formality);
        }
        return formality;
    }

    /**
     * Returns the associated rhetorical-device for SYNSET-WORD from the given WORKFLOW-ALIST.
     *
     * @param synset-word
     * 		; stringp, the given WordNet synset word
     * @param workflow-alist
     * 		; alist-p, the new word characteristics association list
     * @return fort-p, the #$FigureOfSpeech instance if not literal.
     */
    @LispMethod(comment = "Returns the associated rhetorical-device for SYNSET-WORD from the given WORKFLOW-ALIST.\r\n\r\n@param synset-word\r\n\t\t; stringp, the given WordNet synset word\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@return fort-p, the #$FigureOfSpeech instance if not literal.")
    public static final SubLObject wni_rhetorical_device_alt(SubLObject synset_word, SubLObject workflow_alist) {
        SubLTrampolineFile.checkType(synset_word, STRINGP);
        SubLTrampolineFile.checkType(workflow_alist, CONSP);
        SubLTrampolineFile.checkType(workflow_alist, ALIST_P);
        {
            SubLObject rhetorical_device = NIL;
            SubLObject rhetorical_device_value = alist_lookup(workflow_alist, cconcatenate(synset_word, $str_alt355$_rhetorical_device), EQUAL, UNPROVIDED);
            if (NIL != Strings.stringE(rhetorical_device_value, $$$metaphor, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                rhetorical_device = $$MetaphoricalSpeech;
            } else {
                if (NIL != Strings.stringE(rhetorical_device_value, $$$simile, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    rhetorical_device = $$Simile_FigureOfSpeech;
                } else {
                    if (NIL != Strings.stringE(rhetorical_device_value, $$$euphemism, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        rhetorical_device = $$EuphemisticSpeech;
                    }
                }
            }
            if (NIL != rhetorical_device) {
                SubLTrampolineFile.checkType(rhetorical_device, FORT_P);
            }
            return rhetorical_device;
        }
    }

    @LispMethod(comment = "Returns the associated rhetorical-device for SYNSET-WORD from the given WORKFLOW-ALIST.\r\n\r\n@param synset-word\r\n\t\t; stringp, the given WordNet synset word\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@return fort-p, the #$FigureOfSpeech instance if not literal.")
    public static SubLObject wni_rhetorical_device(final SubLObject synset_word, final SubLObject workflow_alist) {
        assert NIL != stringp(synset_word) : "! stringp(synset_word) " + ("Types.stringp(synset_word) " + "CommonSymbols.NIL != Types.stringp(synset_word) ") + synset_word;
        assert NIL != consp(workflow_alist) : "! consp(workflow_alist) " + ("Types.consp(workflow_alist) " + "CommonSymbols.NIL != Types.consp(workflow_alist) ") + workflow_alist;
        assert NIL != list_utilities.alist_p(workflow_alist) : "! list_utilities.alist_p(workflow_alist) " + ("list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) ") + workflow_alist;
        SubLObject rhetorical_device = NIL;
        final SubLObject rhetorical_device_value = list_utilities.alist_lookup(workflow_alist, cconcatenate(synset_word, wordnet_import.$str356$_rhetorical_device), EQUAL, UNPROVIDED);
        if (NIL != Strings.stringE(rhetorical_device_value, wordnet_import.$$$metaphor, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            rhetorical_device = wordnet_import.$$MetaphoricalSpeech;
        } else
            if (NIL != Strings.stringE(rhetorical_device_value, wordnet_import.$$$simile, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                rhetorical_device = wordnet_import.$$Simile_FigureOfSpeech;
            } else
                if (NIL != Strings.stringE(rhetorical_device_value, wordnet_import.$$$euphemism, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    rhetorical_device = wordnet_import.$$EuphemisticSpeech;
                }


        if (((NIL != rhetorical_device) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == forts.fort_p(rhetorical_device))) {
            throw new AssertionError(rhetorical_device);
        }
        return rhetorical_device;
    }

    /**
     * Asserts name string sentences for the given person SYNSET and TERM.
     *
     * @param synset;
     * 		naut-p, the WordNet synset
     * @param term;
     * 		fort-p, the corresponding Cyc term
     * @param now?
     * 		; booleanp, assert immediately
     */
    @LispMethod(comment = "Asserts name string sentences for the given person SYNSET and TERM.\r\n\r\n@param synset;\r\n\t\tnaut-p, the WordNet synset\r\n@param term;\r\n\t\tfort-p, the corresponding Cyc term\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static final SubLObject wni_assert_lexicon_for_person_alt(SubLObject synset, SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(synset, NAUT_P);
        SubLTrampolineFile.checkType(v_term, FORT_P);
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        if (NIL == isa.isaP(v_term, $$Agent_Generic, UNPROVIDED, UNPROVIDED)) {
            com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_isa_agent_generic(v_term, nowP);
        }
        {
            SubLObject synset_words = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_words(synset);
            SubLObject synset_word = NIL;
            SubLObject last_name = NIL;
            synset_word = synset_words.first();
            synset_words = synset_words.rest();
            if (NIL != string_utilities.contains_charP(synset_word, CHAR_period)) {
                com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_wff(list($$nameString, v_term, synset_word), $const320$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
                return NIL;
            }
            last_name = synset_word;
            com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_wff(list($$familyName, v_term, last_name), $const320$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
            if (NIL == synset_words) {
                return NIL;
            }
            synset_word = synset_words.first();
            synset_words = synset_words.rest();
            if ((((NIL != string_utilities.starts_with(synset_word, $str_alt364$Mrs_)) || (NIL != string_utilities.starts_with(synset_word, $str_alt365$Sir_))) || (NIL != string_utilities.ends_with(synset_word, $str_alt366$_Jr_, UNPROVIDED))) || (NIL != string_utilities.contains_charP(synset_word, CHAR_period))) {
                com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_wff(list($$nameString, v_term, synset_word), $const320$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
                if (NIL == synset_words) {
                    return NIL;
                }
                synset_word = synset_words.first();
                synset_words = synset_words.rest();
            }
            if (NIL == string_utilities.starts_with(synset_word, $str_alt364$Mrs_)) {
                if (NIL != string_utilities.starts_with(synset_word, $str_alt367$President_)) {
                    synset_word = string_utilities.remove_substring(synset_word, $str_alt367$President_);
                }
                if (NIL != string_utilities.starts_with(synset_word, $str_alt365$Sir_)) {
                    synset_word = string_utilities.remove_substring(synset_word, $str_alt365$Sir_);
                }
                if (NIL != string_utilities.ends_with(synset_word, $str_alt366$_Jr_, UNPROVIDED)) {
                    synset_word = string_utilities.remove_substring(synset_word, $str_alt366$_Jr_);
                }
                {
                    SubLObject given_names = string_utilities.split_string(synset_word, UNPROVIDED).first();
                    if (NIL == string_utilities.contains_charP(given_names, CHAR_period)) {
                        com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_wff(list($$givenNames, v_term, given_names), $const320$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
                    }
                }
            }
            if (NIL == synset_words) {
                synset_words = cons(synset_word, synset_words);
            }
            {
                SubLObject last_synset_word = last_one(synset_words);
                SubLObject middle_names = string_utilities.split_string(last_synset_word, UNPROVIDED);
                SubLObject middle_names_string = NIL;
                if (NIL != Strings.stringE(last_name, last_one(middle_names), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    middle_names = middle_names.rest();
                    middle_names = remove_last(middle_names);
                    if (NIL != middle_names) {
                        middle_names_string = string_utilities.join_strings(middle_names, $str_alt150$_);
                        com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_wff(list($$middleName, v_term, middle_names_string), $const320$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
                    }
                } else {
                    com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_wff(list($$pseudonym, v_term, last_synset_word), $const320$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Asserts name string sentences for the given person SYNSET and TERM.\r\n\r\n@param synset;\r\n\t\tnaut-p, the WordNet synset\r\n@param term;\r\n\t\tfort-p, the corresponding Cyc term\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static SubLObject wni_assert_lexicon_for_person(final SubLObject synset, final SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        if (NIL == isaP(v_term, wordnet_import.$$Agent_Generic, UNPROVIDED, UNPROVIDED)) {
            wordnet_import.wni_assert_isa_agent_generic(v_term, nowP);
        }
        SubLObject synset_words = wordnet_import.wni_synset_words(synset);
        SubLObject synset_word = NIL;
        SubLObject last_name = NIL;
        synset_word = synset_words.first();
        synset_words = synset_words.rest();
        if (NIL != contains_charP(synset_word, CHAR_period)) {
            wordnet_import.wni_assert_wff(list(wordnet_import.$$nameString, v_term, synset_word), wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
            return NIL;
        }
        last_name = synset_word;
        wordnet_import.wni_assert_wff(list(wordnet_import.$$familyName, v_term, last_name), wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
        if (NIL == synset_words) {
            return NIL;
        }
        synset_word = synset_words.first();
        synset_words = synset_words.rest();
        if ((((NIL != starts_with(synset_word, wordnet_import.$str365$Mrs_)) || (NIL != starts_with(synset_word, wordnet_import.$$$Sir_))) || (NIL != ends_with(synset_word, wordnet_import.$str367$_Jr_, UNPROVIDED))) || (NIL != contains_charP(synset_word, CHAR_period))) {
            wordnet_import.wni_assert_wff(list(wordnet_import.$$nameString, v_term, synset_word), wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
            if (NIL == synset_words) {
                return NIL;
            }
            synset_word = synset_words.first();
            synset_words = synset_words.rest();
        }
        if (NIL == starts_with(synset_word, wordnet_import.$str365$Mrs_)) {
            if (NIL != starts_with(synset_word, wordnet_import.$$$President_)) {
                synset_word = remove_substring(synset_word, wordnet_import.$$$President_);
            }
            if (NIL != starts_with(synset_word, wordnet_import.$$$Sir_)) {
                synset_word = remove_substring(synset_word, wordnet_import.$$$Sir_);
            }
            if (NIL != ends_with(synset_word, wordnet_import.$str367$_Jr_, UNPROVIDED)) {
                synset_word = remove_substring(synset_word, wordnet_import.$str367$_Jr_);
            }
            final SubLObject given_names = split_string(synset_word, UNPROVIDED).first();
            if (NIL == contains_charP(given_names, CHAR_period)) {
                wordnet_import.wni_assert_wff(list(wordnet_import.$$givenNames, v_term, given_names), wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
            }
        }
        if (NIL == synset_words) {
            synset_words = cons(synset_word, synset_words);
        }
        final SubLObject last_synset_word = list_utilities.last_one(synset_words);
        SubLObject middle_names = split_string(last_synset_word, UNPROVIDED);
        SubLObject middle_names_string = NIL;
        if (NIL != Strings.stringE(last_name, list_utilities.last_one(middle_names), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            middle_names = middle_names.rest();
            middle_names = list_utilities.remove_last(middle_names);
            if (NIL != middle_names) {
                middle_names_string = join_strings(middle_names, wordnet_import.$$$_);
                wordnet_import.wni_assert_wff(list(wordnet_import.$$middleName, v_term, middle_names_string), wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
            }
        } else {
            wordnet_import.wni_assert_wff(list(wordnet_import.$$pseudonym, v_term, last_synset_word), wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
        }
        return NIL;
    }

    /**
     * Asserts #$placeName-Standard and #$nameString sentences for the given urban area SYNSET and TERM.
     *
     * @param synset;
     * 		naut-p, the WordNet synset
     * @param term;
     * 		fort-p, the corresponding Cyc term
     * @param now?
     * 		; booleanp, assert immediately
     */
    @LispMethod(comment = "Asserts #$placeName-Standard and #$nameString sentences for the given urban area SYNSET and TERM.\r\n\r\n@param synset;\r\n\t\tnaut-p, the WordNet synset\r\n@param term;\r\n\t\tfort-p, the corresponding Cyc term\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static final SubLObject wni_assert_lexicon_for_urban_area_alt(SubLObject synset, SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(synset, NAUT_P);
        SubLTrampolineFile.checkType(v_term, FORT_P);
        {
            SubLObject synset_words = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_words(synset);
            SubLObject synset_word = NIL;
            synset_word = synset_words.first();
            synset_words = synset_words.rest();
            if (NIL == memberP(v_term, lexicon_accessors.denots_of_string(synset_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_wff(list($$placeName_Standard, v_term, synset_word), $const320$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
            }
            {
                SubLObject cdolist_list_var = synset_words;
                SubLObject synset_word_12 = NIL;
                for (synset_word_12 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , synset_word_12 = cdolist_list_var.first()) {
                    if (NIL == memberP(v_term, lexicon_accessors.denots_of_string(synset_word_12, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                        com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_wff(list($$nameString, v_term, synset_word_12), $const320$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Asserts #$placeName-Standard and #$nameString sentences for the given urban area SYNSET and TERM.\r\n\r\n@param synset;\r\n\t\tnaut-p, the WordNet synset\r\n@param term;\r\n\t\tfort-p, the corresponding Cyc term\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static SubLObject wni_assert_lexicon_for_urban_area(final SubLObject synset, final SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        SubLObject synset_words = wordnet_import.wni_synset_words(synset);
        SubLObject synset_word = NIL;
        synset_word = synset_words.first();
        synset_words = synset_words.rest();
        if (NIL == subl_promotions.memberP(v_term, denots_of_string(synset_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
            wordnet_import.wni_assert_wff(list(wordnet_import.$$placeName_Standard, v_term, synset_word), wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
        }
        SubLObject cdolist_list_var = synset_words;
        SubLObject synset_word_$16 = NIL;
        synset_word_$16 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == subl_promotions.memberP(v_term, denots_of_string(synset_word_$16, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                wordnet_import.wni_assert_wff(list(wordnet_import.$$nameString, v_term, synset_word_$16), wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
            }
            cdolist_list_var = cdolist_list_var.rest();
            synset_word_$16 = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Asserts #$placeName-ShortForm and #$nameString sentences for the given geographical area SYNSET and TERM.
     *
     * @param synset;
     * 		naut-p, the WordNet synset
     * @param term;
     * 		fort-p, the corresponding Cyc term
     * @param now?
     * 		; booleanp, assert immediately
     */
    @LispMethod(comment = "Asserts #$placeName-ShortForm and #$nameString sentences for the given geographical area SYNSET and TERM.\r\n\r\n@param synset;\r\n\t\tnaut-p, the WordNet synset\r\n@param term;\r\n\t\tfort-p, the corresponding Cyc term\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static final SubLObject wni_assert_lexicon_for_geographical_area_alt(SubLObject synset, SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(synset, NAUT_P);
        SubLTrampolineFile.checkType(v_term, FORT_P);
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        {
            SubLObject synset_words = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_words(synset);
            SubLObject synset_word = NIL;
            synset_word = synset_words.first();
            synset_words = synset_words.rest();
            if (NIL == memberP(v_term, lexicon_accessors.denots_of_string(synset_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_wff(list($$placeName_ShortForm, v_term, synset_word), $const320$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
            }
            {
                SubLObject cdolist_list_var = synset_words;
                SubLObject synset_word_13 = NIL;
                for (synset_word_13 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , synset_word_13 = cdolist_list_var.first()) {
                    if (NIL == memberP(v_term, lexicon_accessors.denots_of_string(synset_word_13, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                        com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_wff(list($$nameString, v_term, synset_word_13), $const320$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Asserts #$placeName-ShortForm and #$nameString sentences for the given geographical area SYNSET and TERM.\r\n\r\n@param synset;\r\n\t\tnaut-p, the WordNet synset\r\n@param term;\r\n\t\tfort-p, the corresponding Cyc term\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static SubLObject wni_assert_lexicon_for_geographical_area(final SubLObject synset, final SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        SubLObject synset_words = wordnet_import.wni_synset_words(synset);
        SubLObject synset_word = NIL;
        synset_word = synset_words.first();
        synset_words = synset_words.rest();
        if (NIL == subl_promotions.memberP(v_term, denots_of_string(synset_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
            wordnet_import.wni_assert_wff(list(wordnet_import.$$placeName_ShortForm, v_term, synset_word), wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
        }
        SubLObject cdolist_list_var = synset_words;
        SubLObject synset_word_$17 = NIL;
        synset_word_$17 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == subl_promotions.memberP(v_term, denots_of_string(synset_word_$17, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                wordnet_import.wni_assert_wff(list(wordnet_import.$$nameString, v_term, synset_word_$17), wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
            }
            cdolist_list_var = cdolist_list_var.rest();
            synset_word_$17 = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Asserts #$nameString sentence for the given SYNSET-WORD and TERM.
     *
     * @param synset-word;
     * 		stringp, the WordNet synset word
     * @param term;
     * 		fort-p, the corresponding Cyc term
     * @param now?
     * 		; booleanp, assert immediately
     */
    @LispMethod(comment = "Asserts #$nameString sentence for the given SYNSET-WORD and TERM.\r\n\r\n@param synset-word;\r\n\t\tstringp, the WordNet synset word\r\n@param term;\r\n\t\tfort-p, the corresponding Cyc term\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static final SubLObject wni_assert_name_string_alt(SubLObject synset_word, SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(synset_word, STRINGP);
        SubLTrampolineFile.checkType(v_term, FORT_P);
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_wff(list($$nameString, v_term, synset_word), $const320$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
        return NIL;
    }

    @LispMethod(comment = "Asserts #$nameString sentence for the given SYNSET-WORD and TERM.\r\n\r\n@param synset-word;\r\n\t\tstringp, the WordNet synset word\r\n@param term;\r\n\t\tfort-p, the corresponding Cyc term\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static SubLObject wni_assert_name_string(final SubLObject synset_word, final SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != stringp(synset_word) : "! stringp(synset_word) " + ("Types.stringp(synset_word) " + "CommonSymbols.NIL != Types.stringp(synset_word) ") + synset_word;
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        wordnet_import.wni_assert_wff(list(wordnet_import.$$nameString, v_term, synset_word), wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
        return NIL;
    }

    /**
     * Asserts #$acronymString sentence for the given SYNSET-WORD and TERM.
     *
     * @param synset-word;
     * 		stringp, the WordNet synset word
     * @param term;
     * 		fort-p, the corresponding Cyc term
     * @param now?
     * 		; booleanp, assert immediately
     */
    @LispMethod(comment = "Asserts #$acronymString sentence for the given SYNSET-WORD and TERM.\r\n\r\n@param synset-word;\r\n\t\tstringp, the WordNet synset word\r\n@param term;\r\n\t\tfort-p, the corresponding Cyc term\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static final SubLObject wni_assert_acronym_alt(SubLObject synset_word, SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(synset_word, STRINGP);
        SubLTrampolineFile.checkType(v_term, FORT_P);
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_wff(list($$acronymString, v_term, synset_word), $const320$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
        return NIL;
    }

    @LispMethod(comment = "Asserts #$acronymString sentence for the given SYNSET-WORD and TERM.\r\n\r\n@param synset-word;\r\n\t\tstringp, the WordNet synset word\r\n@param term;\r\n\t\tfort-p, the corresponding Cyc term\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static SubLObject wni_assert_acronym(final SubLObject synset_word, final SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != stringp(synset_word) : "! stringp(synset_word) " + ("Types.stringp(synset_word) " + "CommonSymbols.NIL != Types.stringp(synset_word) ") + synset_word;
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        wordnet_import.wni_assert_wff(list(wordnet_import.$$acronymString, v_term, synset_word), wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
        return NIL;
    }

    /**
     * Asserts #$initialismString sentence for the given SYNSET-WORD and TERM.
     *
     * @param synset-word;
     * 		stringp, the WordNet synset word
     * @param term;
     * 		fort-p, the corresponding Cyc term
     * @param now?
     * 		; booleanp, assert immediately
     */
    @LispMethod(comment = "Asserts #$initialismString sentence for the given SYNSET-WORD and TERM.\r\n\r\n@param synset-word;\r\n\t\tstringp, the WordNet synset word\r\n@param term;\r\n\t\tfort-p, the corresponding Cyc term\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static final SubLObject wni_assert_initialism_alt(SubLObject synset_word, SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        SubLTrampolineFile.checkType(synset_word, STRINGP);
        SubLTrampolineFile.checkType(v_term, FORT_P);
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_assert_wff(list($$initialismString, v_term, synset_word), $const320$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
        return NIL;
    }

    @LispMethod(comment = "Asserts #$initialismString sentence for the given SYNSET-WORD and TERM.\r\n\r\n@param synset-word;\r\n\t\tstringp, the WordNet synset word\r\n@param term;\r\n\t\tfort-p, the corresponding Cyc term\r\n@param now?\r\n\t\t; booleanp, assert immediately")
    public static SubLObject wni_assert_initialism(final SubLObject synset_word, final SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != stringp(synset_word) : "! stringp(synset_word) " + ("Types.stringp(synset_word) " + "CommonSymbols.NIL != Types.stringp(synset_word) ") + synset_word;
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
        wordnet_import.wni_assert_wff(list(wordnet_import.$$initialismString, v_term, synset_word), wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
        return NIL;
    }

    /**
     * Returns the most specific part of speech for the given SYNSET using heuristics.
     *
     * @param synset
     * 		; naut-p the WordNet synset
     * @param synset-word
     * 		; stringp the synset word
     * @param workflow-alist
     * 		; alist-p, the new word characteristics association list
     * @return fort-p ; the most specific part of speech
     */
    @LispMethod(comment = "Returns the most specific part of speech for the given SYNSET using heuristics.\r\n\r\n@param synset\r\n\t\t; naut-p the WordNet synset\r\n@param synset-word\r\n\t\t; stringp the synset word\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@return fort-p ; the most specific part of speech")
    public static final SubLObject wni_heuristic_pos_alt(SubLObject synset, SubLObject synset_word, SubLObject workflow_alist) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        SubLTrampolineFile.checkType(synset_word, STRINGP);
        SubLTrampolineFile.checkType(workflow_alist, CONSP);
        SubLTrampolineFile.checkType(workflow_alist, ALIST_P);
        {
            SubLObject pos = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_pos(synset);
            if (pos != $$Noun) {
                return pos;
            }
            if (length(synset_word).numG(FOUR_INTEGER) && (NIL != string_utilities.ends_with(synset_word, $$$ing, UNPROVIDED))) {
                {
                    SubLObject prefix = string_utilities.string_first_n(subtract(length(synset_word), THREE_INTEGER), synset_word);
                    if (NIL != genls.any_specP($$Noun, lexicon_accessors.pos_of_string(prefix, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                        return $$GerundiveNoun;
                    }
                }
            }
            {
                SubLObject key = cconcatenate(synset_word, $str_alt325$_count_noun);
                SubLObject value = alist_lookup(workflow_alist, key, EQUAL, UNPROVIDED);
                SubLObject count_nounP = makeBoolean((NIL != Strings.stringE(value, $$$t, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != Strings.stringE(value, $str_alt326$headword_is_first, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
                if ((NIL != lexification_utilities.initial_capitalizedP(synset_word)) && (NIL == com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_synset_collectionP(synset))) {
                    if (NIL != count_nounP) {
                        return $$ProperCountNoun;
                    } else {
                        return $$ProperMassNoun;
                    }
                }
                if (NIL != count_nounP) {
                    return $$CountNoun;
                } else {
                    return $$MassNoun;
                }
            }
        }
    }

    @LispMethod(comment = "Returns the most specific part of speech for the given SYNSET using heuristics.\r\n\r\n@param synset\r\n\t\t; naut-p the WordNet synset\r\n@param synset-word\r\n\t\t; stringp the synset word\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@return fort-p ; the most specific part of speech")
    public static SubLObject wni_heuristic_pos(final SubLObject synset, final SubLObject synset_word, final SubLObject workflow_alist) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != stringp(synset_word) : "! stringp(synset_word) " + ("Types.stringp(synset_word) " + "CommonSymbols.NIL != Types.stringp(synset_word) ") + synset_word;
        assert NIL != consp(workflow_alist) : "! consp(workflow_alist) " + ("Types.consp(workflow_alist) " + "CommonSymbols.NIL != Types.consp(workflow_alist) ") + workflow_alist;
        assert NIL != list_utilities.alist_p(workflow_alist) : "! list_utilities.alist_p(workflow_alist) " + ("list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) ") + workflow_alist;
        final SubLObject pos = wordnet_import.wni_synset_pos(synset);
        if (!pos.eql(wordnet_import.$$Noun)) {
            return pos;
        }
        if (length(synset_word).numG(FOUR_INTEGER) && (NIL != ends_with(synset_word, wordnet_import.$$$ing, UNPROVIDED))) {
            final SubLObject prefix = string_first_n(subtract(length(synset_word), THREE_INTEGER), synset_word);
            if (NIL != any_specP(wordnet_import.$$Noun, pos_of_string(prefix, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                return wordnet_import.$$GerundiveNoun;
            }
        }
        final SubLObject key = cconcatenate(synset_word, wordnet_import.$str326$_count_noun);
        final SubLObject value = list_utilities.alist_lookup(workflow_alist, key, EQUAL, UNPROVIDED);
        final SubLObject count_nounP = makeBoolean((NIL != Strings.stringE(value, wordnet_import.$$$t, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != Strings.stringE(value, wordnet_import.$str327$headword_is_first, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        if ((NIL != initial_capitalizedP(synset_word)) && (NIL == wordnet_import.wni_synset_collectionP(synset))) {
            if (NIL != count_nounP) {
                return wordnet_import.$$ProperCountNoun;
            }
            return wordnet_import.$$ProperMassNoun;
        } else {
            if (NIL != count_nounP) {
                return wordnet_import.$$CountNoun;
            }
            return wordnet_import.$$MassNoun;
        }
    }

    /**
     * Returns the number of WordNet synsets mapped by the workflow process.
     */
    @LispMethod(comment = "Returns the number of WordNet synsets mapped by the workflow process.")
    public static final SubLObject wni_number_of_workflow_mapped_terms_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject gafs = kb_mapping_utilities.pred_value_gafs_in_mt($const126$WordNet_Version2_0, $$synonymousExternalConcept, $$WordNetMappingMt, TWO_INTEGER, UNPROVIDED);
                SubLObject when_asserted = NIL;
                SubLObject list_var = gafs;
                $progress_note$.setDynamicValue($$$Counting_recent_WordNet_mappings, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(length(list_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject csome_list_var = list_var;
                            SubLObject gaf = NIL;
                            for (gaf = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , gaf = csome_list_var.first()) {
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                when_asserted = assertions_high.asserted_when(gaf);
                                if (when_asserted.isNumber() && when_asserted.numG($int$20050101)) {
                                    count = add(count, ONE_INTEGER);
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    @LispMethod(comment = "Returns the number of WordNet synsets mapped by the workflow process.")
    public static SubLObject wni_number_of_workflow_mapped_terms() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject gafs = pred_value_gafs_in_mt(wordnet_import.$const128$WordNet_Version2_0, wordnet_import.$$synonymousExternalConcept, wordnet_import.$$WordNetMappingMt, TWO_INTEGER, UNPROVIDED);
        SubLObject when_asserted = NIL;
        final SubLObject list_var = gafs;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(wordnet_import.$$$Counting_recent_WordNet_mappings, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject gaf = NIL;
                gaf = csome_list_var.first();
                while (NIL != csome_list_var) {
                    when_asserted = asserted_when(gaf);
                    if (when_asserted.isNumber() && when_asserted.numG(wordnet_import.$int$20050101)) {
                        count = add(count, ONE_INTEGER);
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    gaf = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    /**
     * Returns the count of new concepts imported from WordNet.
     */
    @LispMethod(comment = "Returns the count of new concepts imported from WordNet.")
    public static final SubLObject wni_number_of_new_concepts_imported_from_wordnet_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject terms = isa.quoted_instances($const386$WordNetWorkflowConstant_NotFullyR, $$BookkeepingMt, UNPROVIDED);
                SubLObject creator = NIL;
                SubLObject list_var = terms;
                $progress_note$.setDynamicValue($str_alt387$Counting_terms_imported_from_Word, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(length(list_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject csome_list_var = list_var;
                            SubLObject v_term = NIL;
                            for (v_term = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , v_term = csome_list_var.first()) {
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                creator = bookkeeping_store.creator(v_term, UNPROVIDED);
                                if ((creator == $$SteveReed) || (NIL != kb_mapping_utilities.pred_u_v_holds_in_mt($$reifiedUsingTool, v_term, $$CycWordNetImportTool, $$WordNetMappingMt, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    count = add(count, ONE_INTEGER);
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    @LispMethod(comment = "Returns the count of new concepts imported from WordNet.")
    public static SubLObject wni_number_of_new_concepts_imported_from_wordnet() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject terms = quoted_instances(wordnet_import.$const387$WordNetWorkflowConstant_NotFullyR, wordnet_import.$$BookkeepingMt, UNPROVIDED);
        SubLObject creator = NIL;
        final SubLObject list_var = terms;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(wordnet_import.$str388$Counting_terms_imported_from_Word, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject v_term = NIL;
                v_term = csome_list_var.first();
                while (NIL != csome_list_var) {
                    creator = creator(v_term, UNPROVIDED);
                    if (creator.eql(wordnet_import.$$SteveReed) || (NIL != pred_u_v_holds_in_mt(wordnet_import.$$reifiedUsingTool, v_term, wordnet_import.$$CycWordNetImportTool, wordnet_import.$$WordNetMappingMt, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                        count = add(count, ONE_INTEGER);
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    v_term = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    /**
     * Returns the count of new denotation assertions imported from WordNet.
     */
    @LispMethod(comment = "Returns the count of new denotation assertions imported from WordNet.")
    public static final SubLObject wni_number_of_new_denotations_imported_from_wordet_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject gafs = kb_mapping_utilities.pred_value_gafs_in_mt($const126$WordNet_Version2_0, $$synonymousExternalConcept, $$WordNetMappingMt, TWO_INTEGER, UNPROVIDED);
                SubLObject when_asserted = NIL;
                SubLObject v_term = NIL;
                SubLObject denotation_gafs = NIL;
                SubLObject list_var = gafs;
                $progress_note$.setDynamicValue($str_alt391$Counting_recent_denotations_impor, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(length(list_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject csome_list_var = list_var;
                            SubLObject gaf = NIL;
                            for (gaf = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , gaf = csome_list_var.first()) {
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                when_asserted = assertions_high.asserted_when(gaf);
                                if (when_asserted.isNumber() && when_asserted.numG($int$20050101)) {
                                    v_term = assertions_high.gaf_arg1(gaf);
                                    {
                                        SubLObject _prev_bind_0_14 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_1_15 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                            denotation_gafs = kb_mapping_utilities.pred_value_gafs(v_term, $$denotation, FOUR_INTEGER, UNPROVIDED);
                                        } finally {
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1_15, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_14, thread);
                                        }
                                    }
                                    {
                                        SubLObject cdolist_list_var = denotation_gafs;
                                        SubLObject denotation_gaf = NIL;
                                        for (denotation_gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , denotation_gaf = cdolist_list_var.first()) {
                                            {
                                                SubLObject when_asserted_16 = assertions_high.asserted_when(denotation_gaf);
                                                if (when_asserted_16.isNumber() && when_asserted_16.numG($int$20050101)) {
                                                    count = add(count, ONE_INTEGER);
                                                }
                                            }
                                        }
                                    }
                                    {
                                        SubLObject _prev_bind_0_17 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_1_18 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                            denotation_gafs = kb_mapping_utilities.pred_value_gafs(v_term, $$compoundString, FOUR_INTEGER, UNPROVIDED);
                                        } finally {
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1_18, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_17, thread);
                                        }
                                    }
                                    {
                                        SubLObject cdolist_list_var = denotation_gafs;
                                        SubLObject denotation_gaf = NIL;
                                        for (denotation_gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , denotation_gaf = cdolist_list_var.first()) {
                                            {
                                                SubLObject when_asserted_19 = assertions_high.asserted_when(denotation_gaf);
                                                if (when_asserted_19.isNumber() && when_asserted_19.numG($int$20050101)) {
                                                    count = add(count, ONE_INTEGER);
                                                }
                                            }
                                        }
                                    }
                                    {
                                        SubLObject _prev_bind_0_20 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_1_21 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                            denotation_gafs = kb_mapping_utilities.pred_value_gafs(v_term, $$multiWordString, FOUR_INTEGER, UNPROVIDED);
                                        } finally {
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1_21, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_20, thread);
                                        }
                                    }
                                    {
                                        SubLObject cdolist_list_var = denotation_gafs;
                                        SubLObject denotation_gaf = NIL;
                                        for (denotation_gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , denotation_gaf = cdolist_list_var.first()) {
                                            {
                                                SubLObject when_asserted_22 = assertions_high.asserted_when(denotation_gaf);
                                                if (when_asserted_22.isNumber() && when_asserted_22.numG($int$20050101)) {
                                                    count = add(count, ONE_INTEGER);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    @LispMethod(comment = "Returns the count of new denotation assertions imported from WordNet.")
    public static SubLObject wni_number_of_new_denotations_imported_from_wordet() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject gafs = pred_value_gafs_in_mt(wordnet_import.$const128$WordNet_Version2_0, wordnet_import.$$synonymousExternalConcept, wordnet_import.$$WordNetMappingMt, TWO_INTEGER, UNPROVIDED);
        SubLObject when_asserted = NIL;
        SubLObject v_term = NIL;
        SubLObject denotation_gafs = NIL;
        final SubLObject list_var = gafs;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(wordnet_import.$str392$Counting_recent_denotations_impor, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject gaf = NIL;
                gaf = csome_list_var.first();
                while (NIL != csome_list_var) {
                    when_asserted = asserted_when(gaf);
                    if (when_asserted.isNumber() && when_asserted.numG(wordnet_import.$int$20050101)) {
                        v_term = gaf_arg1(gaf);
                        final SubLObject _prev_bind_0_$20 = $relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$21 = $mt$.currentBinding(thread);
                        try {
                            $relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            $mt$.bind(wordnet_import.$$EverythingPSC, thread);
                            denotation_gafs = pred_value_gafs(v_term, wordnet_import.$$denotation, FOUR_INTEGER, UNPROVIDED);
                        } finally {
                            $mt$.rebind(_prev_bind_1_$21, thread);
                            $relevant_mt_function$.rebind(_prev_bind_0_$20, thread);
                        }
                        SubLObject cdolist_list_var = denotation_gafs;
                        SubLObject denotation_gaf = NIL;
                        denotation_gaf = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject when_asserted_$22 = asserted_when(denotation_gaf);
                            if (when_asserted_$22.isNumber() && when_asserted_$22.numG(wordnet_import.$int$20050101)) {
                                count = add(count, ONE_INTEGER);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            denotation_gaf = cdolist_list_var.first();
                        } 
                        final SubLObject _prev_bind_0_$21 = $relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$22 = $mt$.currentBinding(thread);
                        try {
                            $relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            $mt$.bind(wordnet_import.$$EverythingPSC, thread);
                            denotation_gafs = pred_value_gafs(v_term, wordnet_import.$$compoundString, FOUR_INTEGER, UNPROVIDED);
                        } finally {
                            $mt$.rebind(_prev_bind_1_$22, thread);
                            $relevant_mt_function$.rebind(_prev_bind_0_$21, thread);
                        }
                        cdolist_list_var = denotation_gafs;
                        denotation_gaf = NIL;
                        denotation_gaf = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject when_asserted_$23 = asserted_when(denotation_gaf);
                            if (when_asserted_$23.isNumber() && when_asserted_$23.numG(wordnet_import.$int$20050101)) {
                                count = add(count, ONE_INTEGER);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            denotation_gaf = cdolist_list_var.first();
                        } 
                        final SubLObject _prev_bind_0_$22 = $relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$23 = $mt$.currentBinding(thread);
                        try {
                            $relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            $mt$.bind(wordnet_import.$$EverythingPSC, thread);
                            denotation_gafs = pred_value_gafs(v_term, wordnet_import.$$multiWordString, FOUR_INTEGER, UNPROVIDED);
                        } finally {
                            $mt$.rebind(_prev_bind_1_$23, thread);
                            $relevant_mt_function$.rebind(_prev_bind_0_$22, thread);
                        }
                        cdolist_list_var = denotation_gafs;
                        denotation_gaf = NIL;
                        denotation_gaf = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject when_asserted_$24 = asserted_when(denotation_gaf);
                            if (when_asserted_$24.isNumber() && when_asserted_$24.numG(wordnet_import.$int$20050101)) {
                                count = add(count, ONE_INTEGER);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            denotation_gaf = cdolist_list_var.first();
                        } 
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    gaf = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static final SubLObject wni_role_info_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_print_role_info(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject wni_role_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        wordnet_import.wni_print_role_info(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject wni_role_info_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.wordnet_import.wordnet_import.$wni_role_info_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject wni_role_info_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.wordnet_import.wordnet_import.$wni_role_info_native.class ? T : NIL;
    }

    public static final SubLObject wni_role_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, WNI_ROLE_INFO_P);
        return v_object.getField2();
    }

    public static SubLObject wni_role(final SubLObject v_object) {
        assert NIL != wordnet_import.wni_role_info_p(v_object) : "! wordnet_import.wni_role_info_p(v_object) " + "wordnet_import.wni_role_info_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject wni_filler_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, WNI_ROLE_INFO_P);
        return v_object.getField3();
    }

    public static SubLObject wni_filler(final SubLObject v_object) {
        assert NIL != wordnet_import.wni_role_info_p(v_object) : "! wordnet_import.wni_role_info_p(v_object) " + "wordnet_import.wni_role_info_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject wni_defining_col_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, WNI_ROLE_INFO_P);
        return v_object.getField4();
    }

    public static SubLObject wni_defining_col(final SubLObject v_object) {
        assert NIL != wordnet_import.wni_role_info_p(v_object) : "! wordnet_import.wni_role_info_p(v_object) " + "wordnet_import.wni_role_info_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject wni_defining_pred_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, WNI_ROLE_INFO_P);
        return v_object.getField5();
    }

    public static SubLObject wni_defining_pred(final SubLObject v_object) {
        assert NIL != wordnet_import.wni_role_info_p(v_object) : "! wordnet_import.wni_role_info_p(v_object) " + "wordnet_import.wni_role_info_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject wni_subsumption_status_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, WNI_ROLE_INFO_P);
        return v_object.getField6();
    }

    public static SubLObject wni_subsumption_status(final SubLObject v_object) {
        assert NIL != wordnet_import.wni_role_info_p(v_object) : "! wordnet_import.wni_role_info_p(v_object) " + "wordnet_import.wni_role_info_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject _csetf_wni_role_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, WNI_ROLE_INFO_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_wni_role(final SubLObject v_object, final SubLObject value) {
        assert NIL != wordnet_import.wni_role_info_p(v_object) : "! wordnet_import.wni_role_info_p(v_object) " + "wordnet_import.wni_role_info_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_wni_filler_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, WNI_ROLE_INFO_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_wni_filler(final SubLObject v_object, final SubLObject value) {
        assert NIL != wordnet_import.wni_role_info_p(v_object) : "! wordnet_import.wni_role_info_p(v_object) " + "wordnet_import.wni_role_info_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_wni_defining_col_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, WNI_ROLE_INFO_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_wni_defining_col(final SubLObject v_object, final SubLObject value) {
        assert NIL != wordnet_import.wni_role_info_p(v_object) : "! wordnet_import.wni_role_info_p(v_object) " + "wordnet_import.wni_role_info_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_wni_defining_pred_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, WNI_ROLE_INFO_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_wni_defining_pred(final SubLObject v_object, final SubLObject value) {
        assert NIL != wordnet_import.wni_role_info_p(v_object) : "! wordnet_import.wni_role_info_p(v_object) " + "wordnet_import.wni_role_info_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_wni_subsumption_status_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, WNI_ROLE_INFO_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_wni_subsumption_status(final SubLObject v_object, final SubLObject value) {
        assert NIL != wordnet_import.wni_role_info_p(v_object) : "! wordnet_import.wni_role_info_p(v_object) " + "wordnet_import.wni_role_info_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject make_wni_role_info_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.wordnet_import.wordnet_import.$wni_role_info_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ROLE)) {
                        com.cyc.cycjava.cycl.wordnet_import.wordnet_import._csetf_wni_role(v_new, current_value);
                    } else {
                        if (pcase_var.eql($FILLER)) {
                            com.cyc.cycjava.cycl.wordnet_import.wordnet_import._csetf_wni_filler(v_new, current_value);
                        } else {
                            if (pcase_var.eql($DEFINING_COL)) {
                                com.cyc.cycjava.cycl.wordnet_import.wordnet_import._csetf_wni_defining_col(v_new, current_value);
                            } else {
                                if (pcase_var.eql($DEFINING_PRED)) {
                                    com.cyc.cycjava.cycl.wordnet_import.wordnet_import._csetf_wni_defining_pred(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($SUBSUMPTION_STATUS)) {
                                        com.cyc.cycjava.cycl.wordnet_import.wordnet_import._csetf_wni_subsumption_status(v_new, current_value);
                                    } else {
                                        Errors.error($str_alt415$Invalid_slot__S_for_construction_, current_arg);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_wni_role_info(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.wordnet_import.wordnet_import.$wni_role_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ROLE)) {
                wordnet_import._csetf_wni_role(v_new, current_value);
            } else
                if (pcase_var.eql($FILLER)) {
                    wordnet_import._csetf_wni_filler(v_new, current_value);
                } else
                    if (pcase_var.eql($DEFINING_COL)) {
                        wordnet_import._csetf_wni_defining_col(v_new, current_value);
                    } else
                        if (pcase_var.eql($DEFINING_PRED)) {
                            wordnet_import._csetf_wni_defining_pred(v_new, current_value);
                        } else
                            if (pcase_var.eql($SUBSUMPTION_STATUS)) {
                                wordnet_import._csetf_wni_subsumption_status(v_new, current_value);
                            } else {
                                Errors.error(wordnet_import.$str417$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_wni_role_info(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, wordnet_import.MAKE_WNI_ROLE_INFO, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ROLE, wordnet_import.wni_role(obj));
        funcall(visitor_fn, obj, $SLOT, $FILLER, wordnet_import.wni_filler(obj));
        funcall(visitor_fn, obj, $SLOT, $DEFINING_COL, wordnet_import.wni_defining_col(obj));
        funcall(visitor_fn, obj, $SLOT, $DEFINING_PRED, wordnet_import.wni_defining_pred(obj));
        funcall(visitor_fn, obj, $SLOT, $SUBSUMPTION_STATUS, wordnet_import.wni_subsumption_status(obj));
        funcall(visitor_fn, obj, $END, wordnet_import.MAKE_WNI_ROLE_INFO, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_wni_role_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return wordnet_import.visit_defstruct_wni_role_info(obj, visitor_fn);
    }

    /**
     * Prints the role information for the given role-info structure
     *
     * @param object				;
    role-info-p
     * 		
     * @param stream				;
    stream-p
     * 		
     */
    @LispMethod(comment = "Prints the role information for the given role-info structure\r\n\r\n@param object\t\t\t\t;\nrole-info-p\r\n\t\t\r\n@param stream\t\t\t\t;\nstream-p")
    public static final SubLObject wni_print_role_info_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        SubLTrampolineFile.checkType(v_object, WNI_ROLE_INFO_P);
        SubLTrampolineFile.checkType(stream, STREAMP);
        format(stream, $str_alt417$_ROLE_INFO___s__s__s__s__s_, new SubLObject[]{ com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_role(v_object), com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_filler(v_object), com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_defining_col(v_object), com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_defining_pred(v_object), com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_subsumption_status(v_object) });
        return NIL;
    }

    @LispMethod(comment = "Prints the role information for the given role-info structure\r\n\r\n@param object\t\t\t\t;\n\t\trole-info-p\r\n\t\t\r\n@param stream\t\t\t\t;\n\t\tstream-p")
    public static SubLObject wni_print_role_info(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        assert NIL != wordnet_import.wni_role_info_p(v_object) : "! wordnet_import.wni_role_info_p(v_object) " + "wordnet_import.wni_role_info_p error :" + v_object;
        assert NIL != streamp(stream) : "! streamp(stream) " + ("Types.streamp(stream) " + "CommonSymbols.NIL != Types.streamp(stream) ") + stream;
        format(stream, wordnet_import.$str424$_ROLE_INFO___s__s__s__s__s_, new SubLObject[]{ wordnet_import.wni_role(v_object), wordnet_import.wni_filler(v_object), wordnet_import.wni_defining_col(v_object), wordnet_import.wni_defining_pred(v_object), wordnet_import.wni_subsumption_status(v_object) });
        return NIL;
    }

    /**
     * Gathers the roles and traits for EVENT-COL, a spec collection of Situation.
     *
     * @return list of wni-role-info structs; The list has two sections, the first
    section lists the roles and the second lists the traits.  Roles are defined
    herein as the actor slots defined on specs of Situation.  Traits are the
    keRelationPreds, relationAllExists and relationAllInstance assertions other
    than those defined on specs of Situation.
    The wni-role-info structs are sorted by increasing generality of the defining collection.
     * @param EVENT-COLL;
     * 		a fort that is a spec of Situation.
     */
    @LispMethod(comment = "Gathers the roles and traits for EVENT-COL, a spec collection of Situation.\r\n\r\n@return list of wni-role-info structs; The list has two sections, the first\r\nsection lists the roles and the second lists the traits.  Roles are defined\r\nherein as the actor slots defined on specs of Situation.  Traits are the\r\nkeRelationPreds, relationAllExists and relationAllInstance assertions other\r\nthan those defined on specs of Situation.\r\nThe wni-role-info structs are sorted by increasing generality of the defining collection.\r\n@param EVENT-COLL;\r\n\t\ta fort that is a spec of Situation.")
    public static final SubLObject wni_gather_roles_and_traits_alt(SubLObject event_col) {
        SubLTrampolineFile.checkType(event_col, FORT_P);
        {
            SubLObject role_infos = Sort.sort(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_gather_roles(event_col), symbol_function($sym419$GENERALITY_ESTIMATE_), symbol_function(WNI_DEFINING_COL));
            SubLObject role_info = NIL;
            SubLObject doneP = NIL;
            SubLObject j = NIL;
            SubLObject genl_predsP = NIL;
            role_infos = append(role_infos, Sort.sort(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_gather_traits(event_col), symbol_function($sym419$GENERALITY_ESTIMATE_), symbol_function(WNI_DEFINING_COL)));
            {
                SubLObject cdotimes_end_var = length(role_infos);
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                    role_info = elt(role_infos, i);
                    j = ZERO_INTEGER;
                    genl_predsP = NIL;
                    doneP = NIL;
                    while (NIL == doneP) {
                        if (j.numGE(i)) {
                            doneP = T;
                        } else {
                            genl_predsP = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_genl_preds_helper(elt(role_infos, j), role_info);
                            if (NIL != genl_predsP) {
                                doneP = T;
                            } else {
                                j = add(j, ONE_INTEGER);
                            }
                        }
                    } 
                    com.cyc.cycjava.cycl.wordnet_import.wordnet_import._csetf_wni_subsumption_status(role_info, genl_predsP);
                }
            }
            {
                SubLObject list_var = role_infos;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, WNI_ROLE_INFO_P);
                    }
                }
            }
            return role_infos;
        }
    }

    @LispMethod(comment = "Gathers the roles and traits for EVENT-COL, a spec collection of Situation.\r\n\r\n@return list of wni-role-info structs; The list has two sections, the first\r\nsection lists the roles and the second lists the traits.  Roles are defined\r\nherein as the actor slots defined on specs of Situation.  Traits are the\r\nkeRelationPreds, relationAllExists and relationAllInstance assertions other\r\nthan those defined on specs of Situation.\r\nThe wni-role-info structs are sorted by increasing generality of the defining collection.\r\n@param EVENT-COLL;\r\n\t\ta fort that is a spec of Situation.")
    public static SubLObject wni_gather_roles_and_traits(final SubLObject event_col) {
        assert NIL != forts.fort_p(event_col) : "! forts.fort_p(event_col) " + ("forts.fort_p(event_col) " + "CommonSymbols.NIL != forts.fort_p(event_col) ") + event_col;
        SubLObject role_infos = Sort.sort(wordnet_import.wni_gather_roles(event_col), symbol_function(wordnet_import.$sym426$GENERALITY_ESTIMATE_), symbol_function(wordnet_import.WNI_DEFINING_COL));
        SubLObject role_info = NIL;
        SubLObject doneP = NIL;
        SubLObject j = NIL;
        SubLObject genl_predsP = NIL;
        role_infos = append(role_infos, Sort.sort(wordnet_import.wni_gather_traits(event_col), symbol_function(wordnet_import.$sym426$GENERALITY_ESTIMATE_), symbol_function(wordnet_import.WNI_DEFINING_COL)));
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = length(role_infos), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            role_info = elt(role_infos, i);
            j = ZERO_INTEGER;
            genl_predsP = NIL;
            doneP = NIL;
            while (NIL == doneP) {
                if (j.numGE(i)) {
                    doneP = T;
                } else {
                    genl_predsP = wordnet_import.wni_genl_preds_helper(elt(role_infos, j), role_info);
                    if (NIL != genl_predsP) {
                        doneP = T;
                    } else {
                        j = add(j, ONE_INTEGER);
                    }
                }
            } 
            wordnet_import._csetf_wni_subsumption_status(role_info, genl_predsP);
        }
        final SubLObject list_var = role_infos;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != wordnet_import.wni_role_info_p(elem) : "! wordnet_import.wni_role_info_p(elem) " + ("wordnet_import.wni_role_info_p(elem) " + "CommonSymbols.NIL != wordnet_import.wni_role_info_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return role_infos;
    }

    /**
     * SELECTED-ROLE-INFO is a role description list contained within the given
     * list of ROLE-INFOS.  This function iterates over the role-infos
     * comparing argument constraints on the role predicate and returns
     * a sublist of ROLE-INFOS containing compatible role predicates.
     */
    @LispMethod(comment = "SELECTED-ROLE-INFO is a role description list contained within the given\r\nlist of ROLE-INFOS.  This function iterates over the role-infos\r\ncomparing argument constraints on the role predicate and returns\r\na sublist of ROLE-INFOS containing compatible role predicates.\nSELECTED-ROLE-INFO is a role description list contained within the given\nlist of ROLE-INFOS.  This function iterates over the role-infos\ncomparing argument constraints on the role predicate and returns\na sublist of ROLE-INFOS containing compatible role predicates.")
    public static final SubLObject wni_find_compatible_roles_alt(SubLObject selected_role_info, SubLObject role_infos) {
        SubLTrampolineFile.checkType(selected_role_info, WNI_ROLE_INFO_P);
        SubLTrampolineFile.checkType(role_infos, LISTP);
        {
            SubLObject compatible_role_infos = NIL;
            {
                SubLObject cdolist_list_var = role_infos;
                SubLObject role_info = NIL;
                for (role_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , role_info = cdolist_list_var.first()) {
                    if (!role_info.equal(selected_role_info)) {
                        if (NIL != genls.max_floor_cols(list(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_filler(selected_role_info), com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_filler(role_info)), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            compatible_role_infos = cons(role_info, compatible_role_infos);
                        }
                    }
                }
            }
            compatible_role_infos = nreverse(compatible_role_infos);
            {
                SubLObject list_var = compatible_role_infos;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, WNI_ROLE_INFO_P);
                    }
                }
            }
            return compatible_role_infos;
        }
    }

    @LispMethod(comment = "SELECTED-ROLE-INFO is a role description list contained within the given\r\nlist of ROLE-INFOS.  This function iterates over the role-infos\r\ncomparing argument constraints on the role predicate and returns\r\na sublist of ROLE-INFOS containing compatible role predicates.\nSELECTED-ROLE-INFO is a role description list contained within the given\nlist of ROLE-INFOS.  This function iterates over the role-infos\ncomparing argument constraints on the role predicate and returns\na sublist of ROLE-INFOS containing compatible role predicates.")
    public static SubLObject wni_find_compatible_roles(final SubLObject selected_role_info, final SubLObject role_infos) {
        assert NIL != wordnet_import.wni_role_info_p(selected_role_info) : "! wordnet_import.wni_role_info_p(selected_role_info) " + ("wordnet_import.wni_role_info_p(selected_role_info) " + "CommonSymbols.NIL != wordnet_import.wni_role_info_p(selected_role_info) ") + selected_role_info;
        assert NIL != listp(role_infos) : "! listp(role_infos) " + ("Types.listp(role_infos) " + "CommonSymbols.NIL != Types.listp(role_infos) ") + role_infos;
        SubLObject compatible_role_infos = NIL;
        SubLObject cdolist_list_var = role_infos;
        SubLObject role_info = NIL;
        role_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((!role_info.equal(selected_role_info)) && (NIL != max_floor_cols(list(wordnet_import.wni_filler(selected_role_info), wordnet_import.wni_filler(role_info)), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                compatible_role_infos = cons(role_info, compatible_role_infos);
            }
            cdolist_list_var = cdolist_list_var.rest();
            role_info = cdolist_list_var.first();
        } 
        final SubLObject list_var;
        compatible_role_infos = list_var = nreverse(compatible_role_infos);
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != wordnet_import.wni_role_info_p(elem) : "! wordnet_import.wni_role_info_p(elem) " + ("wordnet_import.wni_role_info_p(elem) " + "CommonSymbols.NIL != wordnet_import.wni_role_info_p(elem) ") + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return compatible_role_infos;
    }

    /**
     * Accepts two role info structs to compare.  Returns T if the compare-role
     * equals the role, the compare-role if the compare-role is a
     * spec preds of the role, otherwise returns NIL.
     */
    @LispMethod(comment = "Accepts two role info structs to compare.  Returns T if the compare-role\r\nequals the role, the compare-role if the compare-role is a\r\nspec preds of the role, otherwise returns NIL.\nAccepts two role info structs to compare.  Returns T if the compare-role\nequals the role, the compare-role if the compare-role is a\nspec preds of the role, otherwise returns NIL.")
    public static final SubLObject wni_genl_preds_helper_alt(SubLObject compare_role_info, SubLObject role_info) {
        SubLTrampolineFile.checkType(compare_role_info, WNI_ROLE_INFO_P);
        SubLTrampolineFile.checkType(role_info, WNI_ROLE_INFO_P);
        {
            SubLObject compare_role = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_role(compare_role_info);
            SubLObject role = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_role(role_info);
            if (compare_role == role) {
                return T;
            } else {
                if (NIL != genl_predicates.genl_predicateP(compare_role, role, UNPROVIDED, UNPROVIDED)) {
                    return compare_role;
                } else {
                    {
                        SubLObject sentence = list($$genlPredsWRTTypes, compare_role, role, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_defining_col(compare_role_info), com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_filler(role_info));
                        SubLObject query_properties = $list_alt7;
                        SubLObject results = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_trace_new_cyc_query(sentence, $$EverythingPSC, query_properties);
                        if (results.equal($list_alt237)) {
                            return compare_role;
                        } else {
                            return NIL;
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Accepts two role info structs to compare.  Returns T if the compare-role\r\nequals the role, the compare-role if the compare-role is a\r\nspec preds of the role, otherwise returns NIL.\nAccepts two role info structs to compare.  Returns T if the compare-role\nequals the role, the compare-role if the compare-role is a\nspec preds of the role, otherwise returns NIL.")
    public static SubLObject wni_genl_preds_helper(final SubLObject compare_role_info, final SubLObject role_info) {
        assert NIL != wordnet_import.wni_role_info_p(compare_role_info) : "! wordnet_import.wni_role_info_p(compare_role_info) " + ("wordnet_import.wni_role_info_p(compare_role_info) " + "CommonSymbols.NIL != wordnet_import.wni_role_info_p(compare_role_info) ") + compare_role_info;
        assert NIL != wordnet_import.wni_role_info_p(role_info) : "! wordnet_import.wni_role_info_p(role_info) " + ("wordnet_import.wni_role_info_p(role_info) " + "CommonSymbols.NIL != wordnet_import.wni_role_info_p(role_info) ") + role_info;
        final SubLObject compare_role = wordnet_import.wni_role(compare_role_info);
        final SubLObject role = wordnet_import.wni_role(role_info);
        if (compare_role.eql(role)) {
            return T;
        }
        if (NIL != genl_predicateP(compare_role, role, UNPROVIDED, UNPROVIDED)) {
            return compare_role;
        }
        final SubLObject sentence = list(wordnet_import.$$genlPredsWRTTypes, compare_role, role, wordnet_import.wni_defining_col(compare_role_info), wordnet_import.wni_filler(role_info));
        final SubLObject query_properties = wordnet_import.$list9;
        final SubLObject results = wordnet_import.wni_trace_new_cyc_query(sentence, wordnet_import.$$EverythingPSC, query_properties);
        if (results.equal(wordnet_import.$list239)) {
            return compare_role;
        }
        return NIL;
    }

    /**
     * Gathers the role structs for EVENT-COL, a spec collection of Situation.
     *
     * @return a list of role-describing structures; Roles are defined herein as the actor
    slots defined on specs of Situation.
     * @param EVENT-COLL;
     * 		a fort that is a spec of Situation.
     */
    @LispMethod(comment = "Gathers the role structs for EVENT-COL, a spec collection of Situation.\r\n\r\n@return a list of role-describing structures; Roles are defined herein as the actor\r\nslots defined on specs of Situation.\r\n@param EVENT-COLL;\r\n\t\ta fort that is a spec of Situation.")
    public static final SubLObject wni_gather_roles_alt(SubLObject event_col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(event_col, FORT_P);
            {
                SubLObject template = $list_alt422;
                SubLObject sentence = NIL;
                SubLObject query_properties = $list_alt7;
                SubLObject v_bindings = NIL;
                SubLObject fillers = NIL;
                sentence = list($$and, listS($$genls, event_col, $list_alt423), $list_alt424, $list_alt425, $list_alt426, list($$or, list($$and, listS($$interArgIsa1_2, $sym429$_ROLE, event_col, $list_alt430), list($$unknownSentence, list($$thereExists, $sym431$_FILLER_2, listS($$and, listS($$interArgIsa1_2, $sym429$_ROLE, event_col, $list_alt432), $list_alt433)))), listS($$and, list($$unknownSentence, list($$thereExists, $sym431$_FILLER_2, listS($$interArgIsa1_2, $sym429$_ROLE, event_col, $list_alt432))), $list_alt434)));
                thread.resetMultipleValues();
                {
                    SubLObject values = ask_utilities.query_template(template, sentence, $$EverythingPSC, query_properties);
                    SubLObject results = thread.secondMultipleValue();
                    SubLObject halt_reason = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    v_bindings = values;
                }
                sentence = list($$thereExists, $sym435$_COLL, listS($$and, listS($$genls, event_col, $list_alt423), $list_alt436));
                thread.resetMultipleValues();
                {
                    SubLObject values = ask_utilities.query_template(template, sentence, $$EverythingPSC, query_properties);
                    SubLObject results = thread.secondMultipleValue();
                    SubLObject halt_reason = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    nconc(v_bindings, values);
                }
                sentence = list($$thereExists, $sym437$_THING, listS($$and, listS($$genls, event_col, $list_alt423), $list_alt438));
                thread.resetMultipleValues();
                {
                    SubLObject values = ask_utilities.query_template(template, sentence, $$EverythingPSC, query_properties);
                    SubLObject results = thread.secondMultipleValue();
                    SubLObject halt_reason = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    nconc(v_bindings, values);
                }
                sentence = list($$thereExists, $sym439$_ROLE2, listS($$and, list($$assertedSentence, listS($$genlPredsWRTTypes, $sym429$_ROLE, $sym439$_ROLE2, event_col, $list_alt430)), list($$equals, $sym442$_DEFINING_COLL, event_col), $list_alt443));
                thread.resetMultipleValues();
                {
                    SubLObject values = ask_utilities.query_template(template, sentence, $$EverythingPSC, query_properties);
                    SubLObject results = thread.secondMultipleValue();
                    SubLObject halt_reason = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    nconc(v_bindings, values);
                }
                sentence = list($$thereExists, $sym439$_ROLE2, listS($$and, list($$assertedSentence, listS($$genlPredsWRTTypes, $sym439$_ROLE2, $sym429$_ROLE, event_col, $list_alt430)), list($$equals, $sym442$_DEFINING_COLL, event_col), $list_alt443));
                thread.resetMultipleValues();
                {
                    SubLObject values = ask_utilities.query_template(template, sentence, $$EverythingPSC, query_properties);
                    SubLObject results = thread.secondMultipleValue();
                    SubLObject halt_reason = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    nconc(v_bindings, values);
                }
                fillers = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_most_specific_fillers(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_bindings_to_role_infos(v_bindings));
                {
                    SubLObject list_var = fillers;
                    SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                    {
                        SubLObject cdolist_list_var = list_var;
                        SubLObject elem = NIL;
                        for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                            SubLTrampolineFile.checkType(elem, FORT_P);
                        }
                    }
                }
                return fillers;
            }
        }
    }

    @LispMethod(comment = "Gathers the role structs for EVENT-COL, a spec collection of Situation.\r\n\r\n@return a list of role-describing structures; Roles are defined herein as the actor\r\nslots defined on specs of Situation.\r\n@param EVENT-COLL;\r\n\t\ta fort that is a spec of Situation.")
    public static SubLObject wni_gather_roles(final SubLObject event_col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(event_col) : "! forts.fort_p(event_col) " + ("forts.fort_p(event_col) " + "CommonSymbols.NIL != forts.fort_p(event_col) ") + event_col;
        final SubLObject template = wordnet_import.$list429;
        SubLObject sentence = NIL;
        final SubLObject query_properties = wordnet_import.$list9;
        SubLObject v_bindings = NIL;
        SubLObject fillers = NIL;
        sentence = list(wordnet_import.$$and, listS(wordnet_import.$$genls, event_col, wordnet_import.$list430), wordnet_import.$list431, wordnet_import.$list432, wordnet_import.$list433, list(wordnet_import.$$or, list(wordnet_import.$$and, listS(wordnet_import.$$interArgIsa1_2, wordnet_import.$sym436$_ROLE, event_col, wordnet_import.$list437), list(wordnet_import.$$unknownSentence, list(wordnet_import.$$thereExists, wordnet_import.$sym438$_FILLER_2, listS(wordnet_import.$$and, listS(wordnet_import.$$interArgIsa1_2, wordnet_import.$sym436$_ROLE, event_col, wordnet_import.$list439), wordnet_import.$list440)))), listS(wordnet_import.$$and, list(wordnet_import.$$unknownSentence, list(wordnet_import.$$thereExists, wordnet_import.$sym438$_FILLER_2, listS(wordnet_import.$$interArgIsa1_2, wordnet_import.$sym436$_ROLE, event_col, wordnet_import.$list439))), wordnet_import.$list441)));
        thread.resetMultipleValues();
        SubLObject values = query_template(template, sentence, wordnet_import.$$EverythingPSC, query_properties);
        SubLObject results = thread.secondMultipleValue();
        SubLObject halt_reason = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        v_bindings = values;
        sentence = list(wordnet_import.$$thereExists, wordnet_import.$sym442$_COLL, listS(wordnet_import.$$and, listS(wordnet_import.$$genls, event_col, wordnet_import.$list430), wordnet_import.$list443));
        thread.resetMultipleValues();
        values = query_template(template, sentence, wordnet_import.$$EverythingPSC, query_properties);
        results = thread.secondMultipleValue();
        halt_reason = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        nconc(v_bindings, values);
        sentence = list(wordnet_import.$$thereExists, wordnet_import.$sym444$_THING, listS(wordnet_import.$$and, listS(wordnet_import.$$genls, event_col, wordnet_import.$list430), wordnet_import.$list445));
        thread.resetMultipleValues();
        values = query_template(template, sentence, wordnet_import.$$EverythingPSC, query_properties);
        results = thread.secondMultipleValue();
        halt_reason = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        nconc(v_bindings, values);
        sentence = list(wordnet_import.$$thereExists, wordnet_import.$sym446$_ROLE2, listS(wordnet_import.$$and, list(wordnet_import.$$assertedSentence, listS(wordnet_import.$$genlPredsWRTTypes, wordnet_import.$sym436$_ROLE, wordnet_import.$sym446$_ROLE2, event_col, wordnet_import.$list437)), list(wordnet_import.$$equals, wordnet_import.$sym449$_DEFINING_COLL, event_col), wordnet_import.$list450));
        thread.resetMultipleValues();
        values = query_template(template, sentence, wordnet_import.$$EverythingPSC, query_properties);
        results = thread.secondMultipleValue();
        halt_reason = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        nconc(v_bindings, values);
        sentence = list(wordnet_import.$$thereExists, wordnet_import.$sym446$_ROLE2, listS(wordnet_import.$$and, list(wordnet_import.$$assertedSentence, listS(wordnet_import.$$genlPredsWRTTypes, wordnet_import.$sym446$_ROLE2, wordnet_import.$sym436$_ROLE, event_col, wordnet_import.$list437)), list(wordnet_import.$$equals, wordnet_import.$sym449$_DEFINING_COLL, event_col), wordnet_import.$list450));
        thread.resetMultipleValues();
        values = query_template(template, sentence, wordnet_import.$$EverythingPSC, query_properties);
        results = thread.secondMultipleValue();
        halt_reason = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        nconc(v_bindings, values);
        final SubLObject list_var;
        fillers = list_var = wordnet_import.wni_most_specific_fillers(wordnet_import.wni_bindings_to_role_infos(v_bindings));
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != forts.fort_p(elem) : "! forts.fort_p(elem) " + ("forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return fillers;
    }

    /**
     * Gathers the traits for EVENT-COL, a spec collection of Situation.
     *
     * @return a list of trait-describing lists; Traits are defined herein as the keRelevantPreds,
    relationAllExists, and relationAllInstance, other than those defined on specs of Situation.
    The role list is sorted by increasing generality of the defining collection.
     * @param EVENT-COLL;
     * 		a fort that is a spec of Situation.
     */
    @LispMethod(comment = "Gathers the traits for EVENT-COL, a spec collection of Situation.\r\n\r\n@return a list of trait-describing lists; Traits are defined herein as the keRelevantPreds,\r\nrelationAllExists, and relationAllInstance, other than those defined on specs of Situation.\r\nThe role list is sorted by increasing generality of the defining collection.\r\n@param EVENT-COLL;\r\n\t\ta fort that is a spec of Situation.")
    public static final SubLObject wni_gather_traits_alt(SubLObject event_col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(event_col, FORT_P);
            {
                SubLObject template = $list_alt422;
                SubLObject sentence = NIL;
                SubLObject query_properties = $list_alt7;
                SubLObject v_bindings = NIL;
                SubLObject fillers = NIL;
                sentence = list($$and, listS($$genls, event_col, $list_alt423), $list_alt444, $list_alt425, $list_alt426, list($$or, list($$and, listS($$interArgIsa1_2, $sym429$_ROLE, event_col, $list_alt430), list($$unknownSentence, list($$thereExists, $sym431$_FILLER_2, listS($$and, listS($$interArgIsa1_2, $sym429$_ROLE, event_col, $list_alt432), $list_alt433)))), listS($$and, list($$unknownSentence, list($$thereExists, $sym431$_FILLER_2, listS($$interArgIsa1_2, $sym429$_ROLE, event_col, $list_alt432))), $list_alt434)));
                thread.resetMultipleValues();
                {
                    SubLObject values = ask_utilities.query_template(template, sentence, $$EverythingPSC, query_properties);
                    SubLObject results = thread.secondMultipleValue();
                    SubLObject halt_reason = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    v_bindings = values;
                }
                sentence = list($$thereExists, $sym435$_COLL, listS($$and, listS($$genls, event_col, $list_alt423), $list_alt445));
                thread.resetMultipleValues();
                {
                    SubLObject values = ask_utilities.query_template(template, sentence, $$EverythingPSC, query_properties);
                    SubLObject results = thread.secondMultipleValue();
                    SubLObject halt_reason = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    nconc(v_bindings, values);
                }
                sentence = list($$thereExists, $sym437$_THING, listS($$and, listS($$genls, event_col, $list_alt423), $list_alt446));
                thread.resetMultipleValues();
                {
                    SubLObject values = ask_utilities.query_template(template, sentence, $$EverythingPSC, query_properties);
                    SubLObject results = thread.secondMultipleValue();
                    SubLObject halt_reason = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    nconc(v_bindings, values);
                }
                fillers = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_most_specific_fillers(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_bindings_to_role_infos(v_bindings));
                {
                    SubLObject list_var = fillers;
                    SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                    {
                        SubLObject cdolist_list_var = list_var;
                        SubLObject elem = NIL;
                        for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                            SubLTrampolineFile.checkType(elem, FORT_P);
                        }
                    }
                }
                return fillers;
            }
        }
    }

    @LispMethod(comment = "Gathers the traits for EVENT-COL, a spec collection of Situation.\r\n\r\n@return a list of trait-describing lists; Traits are defined herein as the keRelevantPreds,\r\nrelationAllExists, and relationAllInstance, other than those defined on specs of Situation.\r\nThe role list is sorted by increasing generality of the defining collection.\r\n@param EVENT-COLL;\r\n\t\ta fort that is a spec of Situation.")
    public static SubLObject wni_gather_traits(final SubLObject event_col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(event_col) : "! forts.fort_p(event_col) " + ("forts.fort_p(event_col) " + "CommonSymbols.NIL != forts.fort_p(event_col) ") + event_col;
        final SubLObject template = wordnet_import.$list429;
        SubLObject sentence = NIL;
        final SubLObject query_properties = wordnet_import.$list9;
        SubLObject v_bindings = NIL;
        SubLObject fillers = NIL;
        sentence = list(wordnet_import.$$and, listS(wordnet_import.$$genls, event_col, wordnet_import.$list430), wordnet_import.$list451, wordnet_import.$list432, wordnet_import.$list433, list(wordnet_import.$$or, list(wordnet_import.$$and, listS(wordnet_import.$$interArgIsa1_2, wordnet_import.$sym436$_ROLE, event_col, wordnet_import.$list437), list(wordnet_import.$$unknownSentence, list(wordnet_import.$$thereExists, wordnet_import.$sym438$_FILLER_2, listS(wordnet_import.$$and, listS(wordnet_import.$$interArgIsa1_2, wordnet_import.$sym436$_ROLE, event_col, wordnet_import.$list439), wordnet_import.$list440)))), listS(wordnet_import.$$and, list(wordnet_import.$$unknownSentence, list(wordnet_import.$$thereExists, wordnet_import.$sym438$_FILLER_2, listS(wordnet_import.$$interArgIsa1_2, wordnet_import.$sym436$_ROLE, event_col, wordnet_import.$list439))), wordnet_import.$list441)));
        thread.resetMultipleValues();
        SubLObject values = query_template(template, sentence, wordnet_import.$$EverythingPSC, query_properties);
        SubLObject results = thread.secondMultipleValue();
        SubLObject halt_reason = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        v_bindings = values;
        sentence = list(wordnet_import.$$thereExists, wordnet_import.$sym442$_COLL, listS(wordnet_import.$$and, listS(wordnet_import.$$genls, event_col, wordnet_import.$list430), wordnet_import.$list452));
        thread.resetMultipleValues();
        values = query_template(template, sentence, wordnet_import.$$EverythingPSC, query_properties);
        results = thread.secondMultipleValue();
        halt_reason = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        nconc(v_bindings, values);
        sentence = list(wordnet_import.$$thereExists, wordnet_import.$sym444$_THING, listS(wordnet_import.$$and, listS(wordnet_import.$$genls, event_col, wordnet_import.$list430), wordnet_import.$list453));
        thread.resetMultipleValues();
        values = query_template(template, sentence, wordnet_import.$$EverythingPSC, query_properties);
        results = thread.secondMultipleValue();
        halt_reason = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        nconc(v_bindings, values);
        final SubLObject list_var;
        fillers = list_var = wordnet_import.wni_most_specific_fillers(wordnet_import.wni_bindings_to_role_infos(v_bindings));
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != forts.fort_p(elem) : "! forts.fort_p(elem) " + ("forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return fillers;
    }

    /**
     * Given a list of bindings, returns a list of wni-role-info structures.
     *
     * @param bindings
     * 		; listp
     * @return listp
     */
    @LispMethod(comment = "Given a list of bindings, returns a list of wni-role-info structures.\r\n\r\n@param bindings\r\n\t\t; listp\r\n@return listp")
    public static final SubLObject wni_bindings_to_role_infos_alt(SubLObject v_bindings) {
        {
            SubLObject list_var = v_bindings;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, LISTP);
                }
            }
        }
        {
            SubLObject wni_role_info = NIL;
            SubLObject wni_role_infos = NIL;
            {
                SubLObject cdolist_list_var = v_bindings;
                SubLObject binding = NIL;
                for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                    wni_role_info = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.make_wni_role_info(UNPROVIDED);
                    com.cyc.cycjava.cycl.wordnet_import.wordnet_import._csetf_wni_role(wni_role_info, binding.first());
                    com.cyc.cycjava.cycl.wordnet_import.wordnet_import._csetf_wni_filler(wni_role_info, second(binding));
                    com.cyc.cycjava.cycl.wordnet_import.wordnet_import._csetf_wni_defining_col(wni_role_info, third(binding));
                    com.cyc.cycjava.cycl.wordnet_import.wordnet_import._csetf_wni_defining_pred(wni_role_info, fourth(binding));
                    wni_role_infos = cons(wni_role_info, wni_role_infos);
                }
            }
            {
                SubLObject list_var = wni_role_infos;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, WNI_ROLE_INFO_P);
                    }
                }
            }
            return wni_role_infos;
        }
    }

    @LispMethod(comment = "Given a list of bindings, returns a list of wni-role-info structures.\r\n\r\n@param bindings\r\n\t\t; listp\r\n@return listp")
    public static SubLObject wni_bindings_to_role_infos(final SubLObject v_bindings) {
        assert NIL != list_utilities.non_dotted_list_p(v_bindings) : "! list_utilities.non_dotted_list_p(v_bindings) " + ("list_utilities.non_dotted_list_p(v_bindings) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(v_bindings) ") + v_bindings;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != listp(elem) : "! listp(elem) " + ("Types.listp(elem) " + "CommonSymbols.NIL != Types.listp(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject wni_role_info = NIL;
        SubLObject wni_role_infos = NIL;
        SubLObject cdolist_list_var2 = v_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            wni_role_info = wordnet_import.make_wni_role_info(UNPROVIDED);
            wordnet_import._csetf_wni_role(wni_role_info, binding.first());
            wordnet_import._csetf_wni_filler(wni_role_info, second(binding));
            wordnet_import._csetf_wni_defining_col(wni_role_info, third(binding));
            wordnet_import._csetf_wni_defining_pred(wni_role_info, fourth(binding));
            wni_role_infos = cons(wni_role_info, wni_role_infos);
            cdolist_list_var2 = cdolist_list_var2.rest();
            binding = cdolist_list_var2.first();
        } 
        final SubLObject list_var = wni_role_infos;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var3 = list_var;
        SubLObject elem2 = NIL;
        elem2 = cdolist_list_var3.first();
        while (NIL != cdolist_list_var3) {
            assert NIL != wordnet_import.wni_role_info_p(elem2) : "! wordnet_import.wni_role_info_p(elem2) " + ("wordnet_import.wni_role_info_p(elem2) " + "CommonSymbols.NIL != wordnet_import.wni_role_info_p(elem2) ") + elem2;
            cdolist_list_var3 = cdolist_list_var3.rest();
            elem2 = cdolist_list_var3.first();
        } 
        return wni_role_infos;
    }

    /**
     * Returns the defining collection and the role from the WNI-ROLE-INFO in a string form suitable for sorting.
     */
    @LispMethod(comment = "Returns the defining collection and the role from the WNI-ROLE-INFO in a string form suitable for sorting.")
    public static final SubLObject wni_sort_key_1_alt(SubLObject wni_role_info) {
        SubLTrampolineFile.checkType(wni_role_info, WNI_ROLE_INFO_P);
        {
            SubLObject key = cconcatenate(format(NIL, $str_alt447$_A, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_defining_col(wni_role_info)), new SubLObject[]{ $str_alt150$_, format(NIL, $str_alt447$_A, com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_role(wni_role_info)) });
            SubLTrampolineFile.checkType(key, STRINGP);
            return key;
        }
    }

    @LispMethod(comment = "Returns the defining collection and the role from the WNI-ROLE-INFO in a string form suitable for sorting.")
    public static SubLObject wni_sort_key_1(final SubLObject wni_role_info) {
        assert NIL != wordnet_import.wni_role_info_p(wni_role_info) : "! wordnet_import.wni_role_info_p(wni_role_info) " + ("wordnet_import.wni_role_info_p(wni_role_info) " + "CommonSymbols.NIL != wordnet_import.wni_role_info_p(wni_role_info) ") + wni_role_info;
        final SubLObject key = cconcatenate(format(NIL, wordnet_import.$str454$_A, wordnet_import.wni_defining_col(wni_role_info)), new SubLObject[]{ wordnet_import.$$$_, format(NIL, wordnet_import.$str454$_A, wordnet_import.wni_role(wni_role_info)) });
        assert NIL != stringp(key) : "! stringp(key) " + ("Types.stringp(key) " + "CommonSymbols.NIL != Types.stringp(key) ") + key;
        return key;
    }

    /**
     * Returns the given list of role/trait WNI-ROLE-INFOS with the less specific fillers
     * removed when otherwise matched on ?ROLE and ?DEFINING-COLL.
     *
     * @return list
     */
    @LispMethod(comment = "Returns the given list of role/trait WNI-ROLE-INFOS with the less specific fillers\r\nremoved when otherwise matched on ?ROLE and ?DEFINING-COLL.\r\n\r\n@return list\nReturns the given list of role/trait WNI-ROLE-INFOS with the less specific fillers\nremoved when otherwise matched on ?ROLE and ?DEFINING-COLL.")
    public static final SubLObject wni_most_specific_fillers_alt(SubLObject wni_role_infos) {
        {
            SubLObject list_var = wni_role_infos;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, WNI_ROLE_INFO_P);
                }
            }
        }
        {
            SubLObject sorted_role_infos = NIL;
            SubLObject result_role_infos = NIL;
            SubLObject best_role_info = NIL;
            sorted_role_infos = Sort.sort(wni_role_infos, symbol_function(STRING_LESSP), symbol_function(WNI_SORT_KEY_1));
            {
                SubLObject cdolist_list_var = sorted_role_infos;
                SubLObject role_info = NIL;
                for (role_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , role_info = cdolist_list_var.first()) {
                    if (NIL != best_role_info) {
                        if ((com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_role(role_info) != com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_role(best_role_info)) || ((com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_role(role_info) == com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_role(best_role_info)) && (com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_defining_col(role_info) != com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_defining_col(best_role_info)))) {
                            result_role_infos = cons(best_role_info, result_role_infos);
                            best_role_info = role_info;
                        } else {
                            if (NIL != genls.genlsP(com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_filler(role_info), com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_filler(best_role_info), UNPROVIDED, UNPROVIDED)) {
                                best_role_info = role_info;
                            }
                        }
                    } else {
                        best_role_info = role_info;
                    }
                }
            }
            result_role_infos = cons(best_role_info, result_role_infos);
            result_role_infos = nreverse(result_role_infos);
            {
                SubLObject list_var = result_role_infos;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, WNI_ROLE_INFO_P);
                    }
                }
            }
            return result_role_infos;
        }
    }

    @LispMethod(comment = "Returns the given list of role/trait WNI-ROLE-INFOS with the less specific fillers\r\nremoved when otherwise matched on ?ROLE and ?DEFINING-COLL.\r\n\r\n@return list\nReturns the given list of role/trait WNI-ROLE-INFOS with the less specific fillers\nremoved when otherwise matched on ?ROLE and ?DEFINING-COLL.")
    public static SubLObject wni_most_specific_fillers(final SubLObject wni_role_infos) {
        assert NIL != list_utilities.non_dotted_list_p(wni_role_infos) : "! list_utilities.non_dotted_list_p(wni_role_infos) " + ("list_utilities.non_dotted_list_p(wni_role_infos) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(wni_role_infos) ") + wni_role_infos;
        SubLObject cdolist_list_var = wni_role_infos;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != wordnet_import.wni_role_info_p(elem) : "! wordnet_import.wni_role_info_p(elem) " + ("wordnet_import.wni_role_info_p(elem) " + "CommonSymbols.NIL != wordnet_import.wni_role_info_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject sorted_role_infos = NIL;
        SubLObject result_role_infos = NIL;
        SubLObject best_role_info = NIL;
        SubLObject cdolist_list_var2;
        sorted_role_infos = cdolist_list_var2 = Sort.sort(wni_role_infos, symbol_function(STRING_LESSP), symbol_function(wordnet_import.WNI_SORT_KEY_1));
        SubLObject role_info = NIL;
        role_info = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL != best_role_info) {
                if ((!wordnet_import.wni_role(role_info).eql(wordnet_import.wni_role(best_role_info))) || (wordnet_import.wni_role(role_info).eql(wordnet_import.wni_role(best_role_info)) && (!wordnet_import.wni_defining_col(role_info).eql(wordnet_import.wni_defining_col(best_role_info))))) {
                    result_role_infos = cons(best_role_info, result_role_infos);
                    best_role_info = role_info;
                } else
                    if (NIL != genlsP(wordnet_import.wni_filler(role_info), wordnet_import.wni_filler(best_role_info), UNPROVIDED, UNPROVIDED)) {
                        best_role_info = role_info;
                    }

            } else {
                best_role_info = role_info;
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            role_info = cdolist_list_var2.first();
        } 
        result_role_infos = cons(best_role_info, result_role_infos);
        final SubLObject list_var;
        result_role_infos = list_var = nreverse(result_role_infos);
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var3 = list_var;
        SubLObject elem2 = NIL;
        elem2 = cdolist_list_var3.first();
        while (NIL != cdolist_list_var3) {
            assert NIL != wordnet_import.wni_role_info_p(elem2) : "! wordnet_import.wni_role_info_p(elem2) " + ("wordnet_import.wni_role_info_p(elem2) " + "CommonSymbols.NIL != wordnet_import.wni_role_info_p(elem2) ") + elem2;
            cdolist_list_var3 = cdolist_list_var3.rest();
            elem2 = cdolist_list_var3.first();
        } 
        return result_role_infos;
    }

    /**
     * Clears all the function caches in this module.
     */
    @LispMethod(comment = "Clears all the function caches in this module.")
    public static final SubLObject wni_clear_function_caches_alt() {
        com.cyc.cycjava.cycl.wordnet_import.wordnet_import.clear_wni_synsets_for_english_word_string();
        com.cyc.cycjava.cycl.wordnet_import.wordnet_import.clear_wni_synsets_for_english_word_stringXpos();
        com.cyc.cycjava.cycl.wordnet_import.wordnet_import.clear_wni_synset_collectionP();
        com.cyc.cycjava.cycl.wordnet_import.wordnet_import.clear_wni_synset_words_helper();
        com.cyc.cycjava.cycl.wordnet_import.wordnet_import.clear_wni_synset_example_phrases_helper();
        com.cyc.cycjava.cycl.wordnet_import.wordnet_import.clear_wni_synset_verb_frames_helper();
        com.cyc.cycjava.cycl.wordnet_import.wordnet_import.clear_wni_verb_frames_for_word();
        com.cyc.cycjava.cycl.wordnet_import.wordnet_import.clear_wni_hypernyms_helper();
        com.cyc.cycjava.cycl.wordnet_import.wordnet_import.clear_wni_all_hypernyms_helper();
        com.cyc.cycjava.cycl.wordnet_import.wordnet_import.clear_wni_derived_forms_helper();
        com.cyc.cycjava.cycl.wordnet_import.wordnet_import.clear_wni_synset_gloss_helper();
        com.cyc.cycjava.cycl.wordnet_import.wordnet_import.clear_wni_synset_pos_helper();
        com.cyc.cycjava.cycl.wordnet_import.wordnet_import.clear_wni_synset_speech_part_offset_helper();
        com.cyc.cycjava.cycl.wordnet_import.wordnet_import.clear_wni_synset_term_helper();
        com.cyc.cycjava.cycl.wordnet_import.wordnet_import.clear_wni_synset_wXo_links_helper();
        com.cyc.cycjava.cycl.wordnet_import.wordnet_import.clear_wni_synsets_caused_by_helper();
        com.cyc.cycjava.cycl.wordnet_import.wordnet_import.clear_wni_synsets_causing_helper();
        com.cyc.cycjava.cycl.wordnet_import.wordnet_import.clear_wni_broader_terms();
        {
            SubLObject problem_store = com.cyc.cycjava.cycl.wordnet_import.wordnet_import.wni_problem_store();
            if (NIL != inference_datastructures_problem_store.problem_store_p(problem_store)) {
                inference_datastructures_problem_store.destroy_problem_store(problem_store);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Clears all the function caches in this module.")
    public static SubLObject wni_clear_function_caches() {
        wordnet_import.clear_wni_synsets_for_english_word_string();
        wordnet_import.clear_wni_synsets_for_english_word_stringXpos();
        wordnet_import.clear_wni_synset_collectionP();
        wordnet_import.clear_wni_synset_words_helper();
        wordnet_import.clear_wni_synset_example_phrases_helper();
        wordnet_import.clear_wni_synset_verb_frames_helper();
        wordnet_import.clear_wni_verb_frames_for_word();
        wordnet_import.clear_wni_hypernyms_helper();
        wordnet_import.clear_wni_all_hypernyms_helper();
        wordnet_import.clear_wni_derived_forms_helper();
        wordnet_import.clear_wni_synset_gloss_helper();
        wordnet_import.clear_wni_synset_pos_helper();
        wordnet_import.clear_wni_synset_speech_part_offset_helper();
        wordnet_import.clear_wni_synset_term_helper();
        wordnet_import.clear_wni_synset_wXo_links_helper();
        wordnet_import.clear_wni_synsets_caused_by_helper();
        wordnet_import.clear_wni_synsets_causing_helper();
        wordnet_import.clear_wni_broader_terms();
        final SubLObject problem_store = wordnet_import.wni_problem_store();
        if (NIL != problem_store_p(problem_store)) {
            destroy_problem_store(problem_store);
        }
        return NIL;
    }

    /**
     * Returns an association list having a value for unmapped-hypernym-chain.
     *
     * @param unmapped-hypernyn-chain
     * 		; list of synsets in the unmapped hypernym chain
     * @param workflow?
     * 		; booleanp, when T indicates that this session is part of of a workflow
     * 		and that the next workflow item should be selected when this one and its dependents are finished
     * @return alist-p, the workflow association list
     */
    @LispMethod(comment = "Returns an association list having a value for unmapped-hypernym-chain.\r\n\r\n@param unmapped-hypernyn-chain\r\n\t\t; list of synsets in the unmapped hypernym chain\r\n@param workflow?\r\n\t\t; booleanp, when T indicates that this session is part of of a workflow\r\n\t\tand that the next workflow item should be selected when this one and its dependents are finished\r\n@return alist-p, the workflow association list")
    public static final SubLObject wni_create_workflow_alist_with_unmapped_hypernym_chain_alt(SubLObject unmapped_hypernym_chain, SubLObject in_workflowP) {
        SubLTrampolineFile.checkType(unmapped_hypernym_chain, LISTP);
        SubLTrampolineFile.checkType(in_workflowP, BOOLEANP);
        {
            SubLObject workflow_alist = NIL;
            workflow_alist = cons(cons($str_alt451$in_workflow_, NIL != in_workflowP ? ((SubLObject) ($$$t)) : $$$nil), workflow_alist);
            workflow_alist = cons(cons($str_alt453$unmapped_hypernym_chain, unmapped_hypernym_chain), workflow_alist);
            SubLTrampolineFile.checkType(workflow_alist, CONSP);
            SubLTrampolineFile.checkType(workflow_alist, ALIST_P);
            return workflow_alist;
        }
    }

    @LispMethod(comment = "Returns an association list having a value for unmapped-hypernym-chain.\r\n\r\n@param unmapped-hypernyn-chain\r\n\t\t; list of synsets in the unmapped hypernym chain\r\n@param workflow?\r\n\t\t; booleanp, when T indicates that this session is part of of a workflow\r\n\t\tand that the next workflow item should be selected when this one and its dependents are finished\r\n@return alist-p, the workflow association list")
    public static SubLObject wni_create_workflow_alist_with_unmapped_hypernym_chain(final SubLObject unmapped_hypernym_chain, final SubLObject in_workflowP) {
        assert NIL != listp(unmapped_hypernym_chain) : "! listp(unmapped_hypernym_chain) " + ("Types.listp(unmapped_hypernym_chain) " + "CommonSymbols.NIL != Types.listp(unmapped_hypernym_chain) ") + unmapped_hypernym_chain;
        assert NIL != booleanp(in_workflowP) : "! booleanp(in_workflowP) " + ("Types.booleanp(in_workflowP) " + "CommonSymbols.NIL != Types.booleanp(in_workflowP) ") + in_workflowP;
        SubLObject workflow_alist = NIL;
        workflow_alist = cons(cons(wordnet_import.$str458$in_workflow_, NIL != in_workflowP ? wordnet_import.$$$t : wordnet_import.$$$nil), workflow_alist);
        workflow_alist = cons(cons(wordnet_import.$str460$unmapped_hypernym_chain, unmapped_hypernym_chain), workflow_alist);
        assert NIL != consp(workflow_alist) : "! consp(workflow_alist) " + ("Types.consp(workflow_alist) " + "CommonSymbols.NIL != Types.consp(workflow_alist) ") + workflow_alist;
        assert NIL != list_utilities.alist_p(workflow_alist) : "! list_utilities.alist_p(workflow_alist) " + ("list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) ") + workflow_alist;
        return workflow_alist;
    }

    /**
     * Returns the WordNet database server.
     */
    @LispMethod(comment = "Returns the WordNet database server.")
    public static final SubLObject wni_access_path_server_alt() {
        if (NIL == $wordnet_import_access_path$.getGlobalValue()) {
            $wordnet_import_access_path$.setGlobalValue(sksi_access_path.external_source_access_path($const25$WordNet2_0_KS, UNPROVIDED, UNPROVIDED));
        }
        return sksi_access_path.access_path_server($wordnet_import_access_path$.getGlobalValue());
    }

    @LispMethod(comment = "Returns the WordNet database server.")
    public static SubLObject wni_access_path_server() {
        if (NIL == wordnet_import.$wordnet_import_access_path$.getGlobalValue()) {
            wordnet_import.$wordnet_import_access_path$.setGlobalValue(external_source_access_path(wordnet_import.$const26$WordNet2_0_KS, UNPROVIDED, UNPROVIDED));
        }
        return access_path_server(wordnet_import.$wordnet_import_access_path$.getGlobalValue());
    }

    /**
     * Returns the WordNet database port.
     */
    @LispMethod(comment = "Returns the WordNet database port.")
    public static final SubLObject wni_access_path_port_alt() {
        if (NIL == $wordnet_import_access_path$.getGlobalValue()) {
            $wordnet_import_access_path$.setGlobalValue(sksi_access_path.external_source_access_path($const25$WordNet2_0_KS, UNPROVIDED, UNPROVIDED));
        }
        return sksi_access_path.access_path_port($wordnet_import_access_path$.getGlobalValue());
    }

    @LispMethod(comment = "Returns the WordNet database port.")
    public static SubLObject wni_access_path_port() {
        if (NIL == wordnet_import.$wordnet_import_access_path$.getGlobalValue()) {
            wordnet_import.$wordnet_import_access_path$.setGlobalValue(external_source_access_path(wordnet_import.$const26$WordNet2_0_KS, UNPROVIDED, UNPROVIDED));
        }
        return access_path_port(wordnet_import.$wordnet_import_access_path$.getGlobalValue());
    }

    /**
     * Returns the WordNet database proxy server.
     */
    @LispMethod(comment = "Returns the WordNet database proxy server.")
    public static final SubLObject wni_access_path_proxy_server_alt() {
        if (NIL == $wordnet_import_access_path$.getGlobalValue()) {
            $wordnet_import_access_path$.setGlobalValue(sksi_access_path.external_source_access_path($const25$WordNet2_0_KS, UNPROVIDED, UNPROVIDED));
        }
        return sksi_access_path.access_path_proxy_server($wordnet_import_access_path$.getGlobalValue());
    }

    @LispMethod(comment = "Returns the WordNet database proxy server.")
    public static SubLObject wni_access_path_proxy_server() {
        if (NIL == wordnet_import.$wordnet_import_access_path$.getGlobalValue()) {
            wordnet_import.$wordnet_import_access_path$.setGlobalValue(external_source_access_path(wordnet_import.$const26$WordNet2_0_KS, UNPROVIDED, UNPROVIDED));
        }
        return access_path_proxy_server(wordnet_import.$wordnet_import_access_path$.getGlobalValue());
    }

    /**
     * Returns the WordNet database proxy port.
     */
    @LispMethod(comment = "Returns the WordNet database proxy port.")
    public static final SubLObject wni_access_path_proxy_port_alt() {
        if (NIL == $wordnet_import_access_path$.getGlobalValue()) {
            $wordnet_import_access_path$.setGlobalValue(sksi_access_path.external_source_access_path($const25$WordNet2_0_KS, UNPROVIDED, UNPROVIDED));
        }
        return sksi_access_path.access_path_proxy_port($wordnet_import_access_path$.getGlobalValue());
    }

    @LispMethod(comment = "Returns the WordNet database proxy port.")
    public static SubLObject wni_access_path_proxy_port() {
        if (NIL == wordnet_import.$wordnet_import_access_path$.getGlobalValue()) {
            wordnet_import.$wordnet_import_access_path$.setGlobalValue(external_source_access_path(wordnet_import.$const26$WordNet2_0_KS, UNPROVIDED, UNPROVIDED));
        }
        return access_path_proxy_port(wordnet_import.$wordnet_import_access_path$.getGlobalValue());
    }

    /**
     * Returns the WordNet database timeout.
     */
    @LispMethod(comment = "Returns the WordNet database timeout.")
    public static final SubLObject wni_access_path_timeout_alt() {
        if (NIL == $wordnet_import_access_path$.getGlobalValue()) {
            $wordnet_import_access_path$.setGlobalValue(sksi_access_path.external_source_access_path($const25$WordNet2_0_KS, UNPROVIDED, UNPROVIDED));
        }
        return sksi_access_path.access_path_timeout($wordnet_import_access_path$.getGlobalValue());
    }

    @LispMethod(comment = "Returns the WordNet database timeout.")
    public static SubLObject wni_access_path_timeout() {
        if (NIL == wordnet_import.$wordnet_import_access_path$.getGlobalValue()) {
            wordnet_import.$wordnet_import_access_path$.setGlobalValue(external_source_access_path(wordnet_import.$const26$WordNet2_0_KS, UNPROVIDED, UNPROVIDED));
        }
        return access_path_timeout(wordnet_import.$wordnet_import_access_path$.getGlobalValue());
    }

    /**
     * Returns the WordNet database indentification.
     */
    @LispMethod(comment = "Returns the WordNet database indentification.")
    public static final SubLObject wni_access_path_db_alt() {
        if (NIL == $wordnet_import_access_path$.getGlobalValue()) {
            $wordnet_import_access_path$.setGlobalValue(sksi_access_path.external_source_access_path($const25$WordNet2_0_KS, UNPROVIDED, UNPROVIDED));
        }
        return sksi_access_path.access_path_db($wordnet_import_access_path$.getGlobalValue());
    }

    @LispMethod(comment = "Returns the WordNet database indentification.")
    public static SubLObject wni_access_path_db() {
        if (NIL == wordnet_import.$wordnet_import_access_path$.getGlobalValue()) {
            wordnet_import.$wordnet_import_access_path$.setGlobalValue(external_source_access_path(wordnet_import.$const26$WordNet2_0_KS, UNPROVIDED, UNPROVIDED));
        }
        return access_path_db(wordnet_import.$wordnet_import_access_path$.getGlobalValue());
    }

    /**
     * Returns the WordNet database user.
     */
    @LispMethod(comment = "Returns the WordNet database user.")
    public static final SubLObject wni_access_path_user_alt() {
        if (NIL == $wordnet_import_access_path$.getGlobalValue()) {
            $wordnet_import_access_path$.setGlobalValue(sksi_access_path.external_source_access_path($const25$WordNet2_0_KS, UNPROVIDED, UNPROVIDED));
        }
        return sksi_access_path.access_path_user($wordnet_import_access_path$.getGlobalValue());
    }

    @LispMethod(comment = "Returns the WordNet database user.")
    public static SubLObject wni_access_path_user() {
        if (NIL == wordnet_import.$wordnet_import_access_path$.getGlobalValue()) {
            wordnet_import.$wordnet_import_access_path$.setGlobalValue(external_source_access_path(wordnet_import.$const26$WordNet2_0_KS, UNPROVIDED, UNPROVIDED));
        }
        return access_path_user(wordnet_import.$wordnet_import_access_path$.getGlobalValue());
    }

    /**
     * Returns the WordNet database password.
     */
    @LispMethod(comment = "Returns the WordNet database password.")
    public static final SubLObject wni_access_path_password_alt() {
        if (NIL == $wordnet_import_access_path$.getGlobalValue()) {
            $wordnet_import_access_path$.setGlobalValue(sksi_access_path.external_source_access_path($const25$WordNet2_0_KS, UNPROVIDED, UNPROVIDED));
        }
        return sksi_access_path.access_path_password($wordnet_import_access_path$.getGlobalValue());
    }

    @LispMethod(comment = "Returns the WordNet database password.")
    public static SubLObject wni_access_path_password() {
        if (NIL == wordnet_import.$wordnet_import_access_path$.getGlobalValue()) {
            wordnet_import.$wordnet_import_access_path$.setGlobalValue(external_source_access_path(wordnet_import.$const26$WordNet2_0_KS, UNPROVIDED, UNPROVIDED));
        }
        return access_path_password(wordnet_import.$wordnet_import_access_path$.getGlobalValue());
    }

    /**
     * Returns the WordNet database subprotocol.
     */
    @LispMethod(comment = "Returns the WordNet database subprotocol.")
    public static final SubLObject wni_access_path_subprotocol_alt() {
        if (NIL == $wordnet_import_access_path$.getGlobalValue()) {
            $wordnet_import_access_path$.setGlobalValue(sksi_access_path.external_source_access_path($const25$WordNet2_0_KS, UNPROVIDED, UNPROVIDED));
        }
        return sksi_access_path.access_path_subprotocol($wordnet_import_access_path$.getGlobalValue());
    }

    @LispMethod(comment = "Returns the WordNet database subprotocol.")
    public static SubLObject wni_access_path_subprotocol() {
        if (NIL == wordnet_import.$wordnet_import_access_path$.getGlobalValue()) {
            wordnet_import.$wordnet_import_access_path$.setGlobalValue(external_source_access_path(wordnet_import.$const26$WordNet2_0_KS, UNPROVIDED, UNPROVIDED));
        }
        return access_path_subprotocol(wordnet_import.$wordnet_import_access_path$.getGlobalValue());
    }

    public static SubLObject declare_wordnet_import_file() {
        declareFunction("initialize_wordnet_import_kb_feature", "INITIALIZE-WORDNET-IMPORT-KB-FEATURE", 0, 0, false);
        declareFunction("clear_wni_unranked_synsets_for_english_word_string", "CLEAR-WNI-UNRANKED-SYNSETS-FOR-ENGLISH-WORD-STRING", 0, 0, false);
        declareFunction("remove_wni_unranked_synsets_for_english_word_string", "REMOVE-WNI-UNRANKED-SYNSETS-FOR-ENGLISH-WORD-STRING", 1, 0, false);
        declareFunction("wni_unranked_synsets_for_english_word_string_internal", "WNI-UNRANKED-SYNSETS-FOR-ENGLISH-WORD-STRING-INTERNAL", 1, 0, false);
        declareFunction("wni_unranked_synsets_for_english_word_string", "WNI-UNRANKED-SYNSETS-FOR-ENGLISH-WORD-STRING", 1, 0, false);
        declareFunction("clear_wni_synsets_for_english_word_stringXpos", "CLEAR-WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS", 0, 0, false);
        declareFunction("remove_wni_synsets_for_english_word_stringXpos", "REMOVE-WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS", 2, 0, false);
        declareFunction("wni_synsets_for_english_word_stringXpos_internal", "WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS-INTERNAL", 2, 0, false);
        declareFunction("wni_synsets_for_english_word_stringXpos", "WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS", 2, 0, false);
        declareFunction("clear_wni_synsets_for_english_word_string", "CLEAR-WNI-SYNSETS-FOR-ENGLISH-WORD-STRING", 0, 0, false);
        declareFunction("remove_wni_synsets_for_english_word_string", "REMOVE-WNI-SYNSETS-FOR-ENGLISH-WORD-STRING", 1, 0, false);
        declareFunction("wni_synsets_for_english_word_string_internal", "WNI-SYNSETS-FOR-ENGLISH-WORD-STRING-INTERNAL", 1, 0, false);
        declareFunction("wni_synsets_for_english_word_string", "WNI-SYNSETS-FOR-ENGLISH-WORD-STRING", 1, 0, false);
        declareFunction("clear_wni_synset_collectionP", "CLEAR-WNI-SYNSET-COLLECTION?", 0, 0, false);
        declareFunction("remove_wni_synset_collectionP", "REMOVE-WNI-SYNSET-COLLECTION?", 1, 0, false);
        declareFunction("wni_synset_collectionP_internal", "WNI-SYNSET-COLLECTION?-INTERNAL", 1, 0, false);
        declareFunction("wni_synset_collectionP", "WNI-SYNSET-COLLECTION?", 1, 0, false);
        declareFunction("wni_synset_individuals", "WNI-SYNSET-INDIVIDUALS", 0, 0, false);
        declareFunction("wni_exclude_situations", "WNI-EXCLUDE-SITUATIONS", 1, 0, false);
        declareFunction("wni_exclude_relations", "WNI-EXCLUDE-RELATIONS", 1, 0, false);
        declareFunction("wni_exclude_skipped", "WNI-EXCLUDE-SKIPPED", 1, 0, false);
        declareFunction("wni_synset_id", "WNI-SYNSET-ID", 1, 0, false);
        declareFunction("wni_synset_words", "WNI-SYNSET-WORDS", 1, 0, false);
        declareFunction("wni_synsets_equal", "WNI-SYNSETS-EQUAL", 2, 0, false);
        declareFunction("clear_wni_synset_words_helper", "CLEAR-WNI-SYNSET-WORDS-HELPER", 0, 0, false);
        declareFunction("remove_wni_synset_words_helper", "REMOVE-WNI-SYNSET-WORDS-HELPER", 1, 0, false);
        declareFunction("wni_synset_words_helper_internal", "WNI-SYNSET-WORDS-HELPER-INTERNAL", 1, 0, false);
        declareFunction("wni_synset_words_helper", "WNI-SYNSET-WORDS-HELPER", 1, 0, false);
        declareFunction("wni_synset_example_phrases", "WNI-SYNSET-EXAMPLE-PHRASES", 1, 0, false);
        declareFunction("clear_wni_synset_example_phrases_helper", "CLEAR-WNI-SYNSET-EXAMPLE-PHRASES-HELPER", 0, 0, false);
        declareFunction("remove_wni_synset_example_phrases_helper", "REMOVE-WNI-SYNSET-EXAMPLE-PHRASES-HELPER", 1, 0, false);
        declareFunction("wni_synset_example_phrases_helper_internal", "WNI-SYNSET-EXAMPLE-PHRASES-HELPER-INTERNAL", 1, 0, false);
        declareFunction("wni_synset_example_phrases_helper", "WNI-SYNSET-EXAMPLE-PHRASES-HELPER", 1, 0, false);
        declareFunction("wni_most_general_synset_verb_frame", "WNI-MOST-GENERAL-SYNSET-VERB-FRAME", 1, 0, false);
        declareFunction("wni_synset_verb_frames", "WNI-SYNSET-VERB-FRAMES", 1, 0, false);
        declareFunction("clear_wni_synset_verb_frames_helper", "CLEAR-WNI-SYNSET-VERB-FRAMES-HELPER", 0, 0, false);
        declareFunction("remove_wni_synset_verb_frames_helper", "REMOVE-WNI-SYNSET-VERB-FRAMES-HELPER", 1, 0, false);
        declareFunction("wni_synset_verb_frames_helper_internal", "WNI-SYNSET-VERB-FRAMES-HELPER-INTERNAL", 1, 0, false);
        declareFunction("wni_synset_verb_frames_helper", "WNI-SYNSET-VERB-FRAMES-HELPER", 1, 0, false);
        declareFunction("clear_wni_verb_frames_for_word", "CLEAR-WNI-VERB-FRAMES-FOR-WORD", 0, 0, false);
        declareFunction("remove_wni_verb_frames_for_word", "REMOVE-WNI-VERB-FRAMES-FOR-WORD", 1, 0, false);
        declareFunction("wni_verb_frames_for_word_internal", "WNI-VERB-FRAMES-FOR-WORD-INTERNAL", 1, 0, false);
        declareFunction("wni_verb_frames_for_word", "WNI-VERB-FRAMES-FOR-WORD", 1, 0, false);
        declareFunction("wni_hypernyms", "WNI-HYPERNYMS", 1, 0, false);
        declareFunction("clear_wni_hypernyms_helper", "CLEAR-WNI-HYPERNYMS-HELPER", 0, 0, false);
        declareFunction("remove_wni_hypernyms_helper", "REMOVE-WNI-HYPERNYMS-HELPER", 1, 0, false);
        declareFunction("wni_hypernyms_helper_internal", "WNI-HYPERNYMS-HELPER-INTERNAL", 1, 0, false);
        declareFunction("wni_hypernyms_helper", "WNI-HYPERNYMS-HELPER", 1, 0, false);
        declareFunction("wni_all_hypernyms", "WNI-ALL-HYPERNYMS", 1, 0, false);
        declareFunction("clear_wni_all_hypernyms_helper", "CLEAR-WNI-ALL-HYPERNYMS-HELPER", 0, 0, false);
        declareFunction("remove_wni_all_hypernyms_helper", "REMOVE-WNI-ALL-HYPERNYMS-HELPER", 1, 0, false);
        declareFunction("wni_all_hypernyms_helper_internal", "WNI-ALL-HYPERNYMS-HELPER-INTERNAL", 1, 0, false);
        declareFunction("wni_all_hypernyms_helper", "WNI-ALL-HYPERNYMS-HELPER", 1, 0, false);
        declareFunction("wni_all_hypernymP", "WNI-ALL-HYPERNYM?", 2, 0, false);
        declareFunction("wni_hyponyms", "WNI-HYPONYMS", 1, 0, false);
        declareFunction("clear_wni_hyponyms_helper", "CLEAR-WNI-HYPONYMS-HELPER", 0, 0, false);
        declareFunction("remove_wni_hyponyms_helper", "REMOVE-WNI-HYPONYMS-HELPER", 1, 0, false);
        declareFunction("wni_hyponyms_helper_internal", "WNI-HYPONYMS-HELPER-INTERNAL", 1, 0, false);
        declareFunction("wni_hyponyms_helper", "WNI-HYPONYMS-HELPER", 1, 0, false);
        declareFunction("wni_all_hyponyms", "WNI-ALL-HYPONYMS", 1, 0, false);
        declareFunction("clear_wni_all_hyponyms_helper", "CLEAR-WNI-ALL-HYPONYMS-HELPER", 0, 0, false);
        declareFunction("remove_wni_all_hyponyms_helper", "REMOVE-WNI-ALL-HYPONYMS-HELPER", 1, 0, false);
        declareFunction("wni_all_hyponyms_helper_internal", "WNI-ALL-HYPONYMS-HELPER-INTERNAL", 1, 0, false);
        declareFunction("wni_all_hyponyms_helper", "WNI-ALL-HYPONYMS-HELPER", 1, 0, false);
        declareFunction("wni_any_hyponym_an_individual", "WNI-ANY-HYPONYM-AN-INDIVIDUAL", 1, 0, false);
        declareFunction("wni_verb_is_derived_from_situation_nounP", "WNI-VERB-IS-DERIVED-FROM-SITUATION-NOUN?", 1, 0, false);
        declareFunction("wni_derived_forms", "WNI-DERIVED-FORMS", 1, 0, false);
        declareFunction("clear_wni_derived_forms_helper", "CLEAR-WNI-DERIVED-FORMS-HELPER", 0, 0, false);
        declareFunction("remove_wni_derived_forms_helper", "REMOVE-WNI-DERIVED-FORMS-HELPER", 1, 0, false);
        declareFunction("wni_derived_forms_helper_internal", "WNI-DERIVED-FORMS-HELPER-INTERNAL", 1, 0, false);
        declareFunction("wni_derived_forms_helper", "WNI-DERIVED-FORMS-HELPER", 1, 0, false);
        declareFunction("wni_synset_gloss", "WNI-SYNSET-GLOSS", 1, 0, false);
        declareFunction("clear_wni_synset_gloss_helper", "CLEAR-WNI-SYNSET-GLOSS-HELPER", 0, 0, false);
        declareFunction("remove_wni_synset_gloss_helper", "REMOVE-WNI-SYNSET-GLOSS-HELPER", 1, 0, false);
        declareFunction("wni_synset_gloss_helper_internal", "WNI-SYNSET-GLOSS-HELPER-INTERNAL", 1, 0, false);
        declareFunction("wni_synset_gloss_helper", "WNI-SYNSET-GLOSS-HELPER", 1, 0, false);
        declareFunction("wni_synset_pos", "WNI-SYNSET-POS", 1, 0, false);
        declareFunction("clear_wni_synset_pos_helper", "CLEAR-WNI-SYNSET-POS-HELPER", 0, 0, false);
        declareFunction("remove_wni_synset_pos_helper", "REMOVE-WNI-SYNSET-POS-HELPER", 1, 0, false);
        declareFunction("wni_synset_pos_helper_internal", "WNI-SYNSET-POS-HELPER-INTERNAL", 1, 0, false);
        declareFunction("wni_synset_pos_helper", "WNI-SYNSET-POS-HELPER", 1, 0, false);
        declareFunction("wni_synset_speech_part_offset", "WNI-SYNSET-SPEECH-PART-OFFSET", 1, 0, false);
        declareFunction("clear_wni_synset_speech_part_offset_helper", "CLEAR-WNI-SYNSET-SPEECH-PART-OFFSET-HELPER", 0, 0, false);
        declareFunction("remove_wni_synset_speech_part_offset_helper", "REMOVE-WNI-SYNSET-SPEECH-PART-OFFSET-HELPER", 2, 0, false);
        declareFunction("wni_synset_speech_part_offset_helper_internal", "WNI-SYNSET-SPEECH-PART-OFFSET-HELPER-INTERNAL", 2, 0, false);
        declareFunction("wni_synset_speech_part_offset_helper", "WNI-SYNSET-SPEECH-PART-OFFSET-HELPER", 2, 0, false);
        declareFunction("wni_hypernym_terms", "WNI-HYPERNYM-TERMS", 1, 0, false);
        declareFunction("wni_hypernym_mappedP", "WNI-HYPERNYM-MAPPED?", 1, 0, false);
        declareFunction("wni_synset_term", "WNI-SYNSET-TERM", 1, 0, false);
        declareFunction("clear_wni_synset_term_helper", "CLEAR-WNI-SYNSET-TERM-HELPER", 0, 0, false);
        declareFunction("remove_wni_synset_term_helper", "REMOVE-WNI-SYNSET-TERM-HELPER", 2, 0, false);
        declareFunction("wni_synset_term_helper_internal", "WNI-SYNSET-TERM-HELPER-INTERNAL", 2, 0, false);
        declareFunction("wni_synset_term_helper", "WNI-SYNSET-TERM-HELPER", 2, 0, false);
        declareFunction("wni_unmapped_hypernym_chain", "WNI-UNMAPPED-HYPERNYM-CHAIN", 1, 0, false);
        declareFunction("wni_synset_wXo_links", "WNI-SYNSET-W/O-LINKS", 1, 0, false);
        declareFunction("clear_wni_synset_wXo_links_helper", "CLEAR-WNI-SYNSET-W/O-LINKS-HELPER", 0, 0, false);
        declareFunction("remove_wni_synset_wXo_links_helper", "REMOVE-WNI-SYNSET-W/O-LINKS-HELPER", 1, 0, false);
        declareFunction("wni_synset_wXo_links_helper_internal", "WNI-SYNSET-W/O-LINKS-HELPER-INTERNAL", 1, 0, false);
        declareFunction("wni_synset_wXo_links_helper", "WNI-SYNSET-W/O-LINKS-HELPER", 1, 0, false);
        declareFunction("wni_synset_is_causerP", "WNI-SYNSET-IS-CAUSER?", 1, 0, false);
        declareFunction("wni_synsets_caused_by", "WNI-SYNSETS-CAUSED-BY", 1, 0, false);
        declareFunction("clear_wni_synsets_caused_by_helper", "CLEAR-WNI-SYNSETS-CAUSED-BY-HELPER", 0, 0, false);
        declareFunction("remove_wni_synsets_caused_by_helper", "REMOVE-WNI-SYNSETS-CAUSED-BY-HELPER", 1, 0, false);
        declareFunction("wni_synsets_caused_by_helper_internal", "WNI-SYNSETS-CAUSED-BY-HELPER-INTERNAL", 1, 0, false);
        declareFunction("wni_synsets_caused_by_helper", "WNI-SYNSETS-CAUSED-BY-HELPER", 1, 0, false);
        declareFunction("wni_synset_is_caused_byP", "WNI-SYNSET-IS-CAUSED-BY?", 1, 0, false);
        declareFunction("wni_synsets_causing", "WNI-SYNSETS-CAUSING", 1, 0, false);
        declareFunction("clear_wni_synsets_causing_helper", "CLEAR-WNI-SYNSETS-CAUSING-HELPER", 0, 0, false);
        declareFunction("remove_wni_synsets_causing_helper", "REMOVE-WNI-SYNSETS-CAUSING-HELPER", 1, 0, false);
        declareFunction("wni_synsets_causing_helper_internal", "WNI-SYNSETS-CAUSING-HELPER-INTERNAL", 1, 0, false);
        declareFunction("wni_synsets_causing_helper", "WNI-SYNSETS-CAUSING-HELPER", 1, 0, false);
        declareFunction("wni_urban_area_geographical_entity", "WNI-URBAN-AREA-GEOGRAPHICAL-ENTITY", 1, 0, false);
        declareFunction("wni_synsets_having_pos", "WNI-SYNSETS-HAVING-POS", 1, 0, false);
        declareFunction("wni_terms_synsets", "WNI-TERMS-SYNSETS", 1, 0, false);
        declareFunction("clear_wni_broader_terms", "CLEAR-WNI-BROADER-TERMS", 0, 0, false);
        declareFunction("remove_wni_broader_terms", "REMOVE-WNI-BROADER-TERMS", 1, 0, false);
        declareFunction("wni_broader_terms_internal", "WNI-BROADER-TERMS-INTERNAL", 1, 0, false);
        declareFunction("wni_broader_terms", "WNI-BROADER-TERMS", 1, 0, false);
        declareFunction("wni_mapped_terms_and_synsets", "WNI-MAPPED-TERMS-AND-SYNSETS", 1, 0, false);
        declareFunction("wni_synset_hypernyms_mappedP", "WNI-SYNSET-HYPERNYMS-MAPPED?", 1, 0, false);
        declareFunction("wni_mapped_terms", "WNI-MAPPED-TERMS", 0, 0, false);
        declareFunction("wni_mapped_terms_and_pos_offsets", "WNI-MAPPED-TERMS-AND-POS-OFFSETS", 0, 0, false);
        declareFunction("wni_speech_part_offset_to_synset", "WNI-SPEECH-PART-OFFSET-TO-SYNSET", 1, 0, false);
        declareFunction("wni_update_synset_with_term", "WNI-UPDATE-SYNSET-WITH-TERM", 2, 0, false);
        declareFunction("wni_insert_concept_match_html", "WNI-INSERT-CONCEPT-MATCH-HTML", 2, 0, false);
        declareFunction("wni_select_concept_match_html", "WNI-SELECT-CONCEPT-MATCH-HTML", 1, 0, false);
        declareFunction("wni_delete_concept_match_html", "WNI-DELETE-CONCEPT-MATCH-HTML", 1, 0, false);
        declareFunction("wni_delete_all_concept_match_html", "WNI-DELETE-ALL-CONCEPT-MATCH-HTML", 0, 0, false);
        declareFunction("wni_unmapped_synsets_having_mapped_hypernym", "WNI-UNMAPPED-SYNSETS-HAVING-MAPPED-HYPERNYM", 1, 0, false);
        declareFunction("wni_trace_new_cyc_query", "WNI-TRACE-NEW-CYC-QUERY", 3, 0, false);
        declareFunction("wni_problem_store", "WNI-PROBLEM-STORE", 0, 0, false);
        declareFunction("new_wni_problem_store", "NEW-WNI-PROBLEM-STORE", 0, 0, false);
        declareFunction("wni_problem_store_properties", "WNI-PROBLEM-STORE-PROPERTIES", 0, 0, false);
        declareFunction("wni_unreified_synset", "WNI-UNREIFIED-SYNSET", 1, 0, false);
        declareFunction("wni_reifiable_synset", "WNI-REIFIABLE-SYNSET", 1, 0, false);
        declareFunction("wni_reifiable_synset_from_string", "WNI-REIFIABLE-SYNSET-FROM-STRING", 1, 0, false);
        declareFunction("wni_synset_from_id_string", "WNI-SYNSET-FROM-ID-STRING", 1, 0, false);
        declareFunction("wni_ensure_naut", "WNI-ENSURE-NAUT", 1, 0, false);
        declareFunction("wni_next_synset_with_status", "WNI-NEXT-SYNSET-WITH-STATUS", 1, 0, false);
        declareFunction("wni_unlocked_synsets_with_status", "WNI-UNLOCKED-SYNSETS-WITH-STATUS", 1, 0, false);
        declareFunction("wni_term_has_verb_semtransP", "WNI-TERM-HAS-VERB-SEMTRANS?", 1, 0, false);
        declareFunction("clear_wni_term_has_verb_semtrans_helperP", "CLEAR-WNI-TERM-HAS-VERB-SEMTRANS-HELPER?", 0, 0, false);
        declareFunction("remove_wni_term_has_verb_semtrans_helperP", "REMOVE-WNI-TERM-HAS-VERB-SEMTRANS-HELPER?", 1, 0, false);
        declareFunction("wni_term_has_verb_semtrans_helperP_internal", "WNI-TERM-HAS-VERB-SEMTRANS-HELPER?-INTERNAL", 1, 0, false);
        declareFunction("wni_term_has_verb_semtrans_helperP", "WNI-TERM-HAS-VERB-SEMTRANS-HELPER?", 1, 0, false);
        declareFunction("wni_gather_terms_for_matching", "WNI-GATHER-TERMS-FOR-MATCHING", 1, 0, false);
        declareFunction("wni_exact_synset_term_matches", "WNI-EXACT-SYNSET-TERM-MATCHES", 1, 0, false);
        declareFunction("wni_strong_synset_term_matches", "WNI-STRONG-SYNSET-TERM-MATCHES", 2, 0, false);
        declareFunction("wni_weak_synset_term_matches", "WNI-WEAK-SYNSET-TERM-MATCHES", 2, 1, false);
        declareFunction("wni_create_now", "WNI-CREATE-NOW", 1, 0, false);
        declareFunction("wni_assert_wff", "WNI-ASSERT-WFF", 4, 1, false);
        declareFunction("wni_unassert_import_statuses", "WNI-UNASSERT-IMPORT-STATUSES", 2, 1, false);
        declareFunction("wni_unassert_import_status", "WNI-UNASSERT-IMPORT-STATUS", 2, 1, false);
        declareFunction("wni_assert_import_statuses", "WNI-ASSERT-IMPORT-STATUSES", 2, 1, false);
        declareFunction("wni_assert_import_status", "WNI-ASSERT-IMPORT-STATUS", 2, 1, false);
        declareFunction("wni_assert_synset_mapping", "WNI-ASSERT-SYNSET-MAPPING", 2, 1, false);
        declareFunction("wni_assert_likely_synset_mapping", "WNI-ASSERT-LIKELY-SYNSET-MAPPING", 2, 1, false);
        declareFunction("wni_assert_quoted_isa_workflow_constant", "WNI-ASSERT-QUOTED-ISA-WORKFLOW-CONSTANT", 1, 1, false);
        declareFunction("wni_assert_isa_collection", "WNI-ASSERT-ISA-COLLECTION", 1, 1, false);
        declareFunction("wni_assert_genls", "WNI-ASSERT-GENLS", 2, 1, false);
        declareFunction("wni_unassert_genls", "WNI-UNASSERT-GENLS", 2, 1, false);
        declareFunction("wni_assert_isa", "WNI-ASSERT-ISA", 2, 1, false);
        declareFunction("wni_assert_isa_individual", "WNI-ASSERT-ISA-INDIVIDUAL", 1, 1, false);
        declareFunction("wni_assert_isa_agent_generic", "WNI-ASSERT-ISA-AGENT-GENERIC", 1, 1, false);
        declareFunction("wni_assert_reified_using", "WNI-ASSERT-REIFIED-USING", 1, 1, false);
        declareFunction("wni_synset_note", "WNI-SYNSET-NOTE", 1, 0, false);
        declareFunction("wni_assert_synset_note", "WNI-ASSERT-SYNSET-NOTE", 2, 0, false);
        declareFunction("wni_unassert_synset_note", "WNI-UNASSERT-SYNSET-NOTE", 2, 0, false);
        declareFunction("wni_assert_comment", "WNI-ASSERT-COMMENT", 2, 1, false);
        declareFunction("wni_assert_term_of_unit", "WNI-ASSERT-TERM-OF-UNIT", 1, 0, false);
        declareFunction("wni_lock_synset", "WNI-LOCK-SYNSET", 1, 0, false);
        declareFunction("wni_unlock_synset", "WNI-UNLOCK-SYNSET", 1, 1, false);
        declareFunction("wni_assert_heuristic_lexicon", "WNI-ASSERT-HEURISTIC-LEXICON", 3, 1, false);
        declareFunction("wni_assert_heuristic_lexicon_for_collection", "WNI-ASSERT-HEURISTIC-LEXICON-FOR-COLLECTION", 3, 1, false);
        declareFunction("wni_assert_heuristic_lexicon_for_collection_common", "WNI-ASSERT-HEURISTIC-LEXICON-FOR-COLLECTION-COMMON", 4, 1, false);
        declareFunction("wni_assert_heuristic_lexicon_for_individual", "WNI-ASSERT-HEURISTIC-LEXICON-FOR-INDIVIDUAL", 3, 1, false);
        declareFunction("wni_assert_heuristic_lexicon_for_organism", "WNI-ASSERT-HEURISTIC-LEXICON-FOR-ORGANISM", 3, 1, false);
        declareFunction("wni_assert_heuristic_lexicon_for_chemical", "WNI-ASSERT-HEURISTIC-LEXICON-FOR-CHEMICAL", 2, 1, false);
        declareFunction("wni_assert_lexicon_for_hyphen_string", "WNI-ASSERT-LEXICON-FOR-HYPHEN-STRING", 4, 1, false);
        declareFunction("wni_assert_lexicon_for_phrase", "WNI-ASSERT-LEXICON-FOR-PHRASE", 4, 1, false);
        declareFunction("wni_assert_lexicon_for_multi_word_string", "WNI-ASSERT-LEXICON-FOR-MULTI-WORD-STRING", 4, 1, false);
        declareFunction("wni_assert_lexicon_for_compound_string", "WNI-ASSERT-LEXICON-FOR-COMPOUND-STRING", 4, 1, false);
        declareFunction("wni_assert_lexicon_for_denotation", "WNI-ASSERT-LEXICON-FOR-DENOTATION", 4, 1, false);
        declareFunction("wni_assert_lexicon_for_existing_denotation", "WNI-ASSERT-LEXICON-FOR-EXISTING-DENOTATION", 4, 1, false);
        declareFunction("wni_assert_lexical_annotations", "WNI-ASSERT-LEXICAL-ANNOTATIONS", 3, 1, false);
        declareFunction("wni_politeness", "WNI-POLITENESS", 2, 0, false);
        declareFunction("wni_formality", "WNI-FORMALITY", 2, 0, false);
        declareFunction("wni_rhetorical_device", "WNI-RHETORICAL-DEVICE", 2, 0, false);
        declareFunction("wni_assert_lexicon_for_person", "WNI-ASSERT-LEXICON-FOR-PERSON", 2, 1, false);
        declareFunction("wni_assert_lexicon_for_urban_area", "WNI-ASSERT-LEXICON-FOR-URBAN-AREA", 2, 1, false);
        declareFunction("wni_assert_lexicon_for_geographical_area", "WNI-ASSERT-LEXICON-FOR-GEOGRAPHICAL-AREA", 2, 1, false);
        declareFunction("wni_assert_name_string", "WNI-ASSERT-NAME-STRING", 2, 1, false);
        declareFunction("wni_assert_acronym", "WNI-ASSERT-ACRONYM", 2, 1, false);
        declareFunction("wni_assert_initialism", "WNI-ASSERT-INITIALISM", 2, 1, false);
        declareFunction("wni_heuristic_pos", "WNI-HEURISTIC-POS", 3, 0, false);
        declareFunction("wni_number_of_workflow_mapped_terms", "WNI-NUMBER-OF-WORKFLOW-MAPPED-TERMS", 0, 0, false);
        declareFunction("wni_number_of_new_concepts_imported_from_wordnet", "WNI-NUMBER-OF-NEW-CONCEPTS-IMPORTED-FROM-WORDNET", 0, 0, false);
        declareFunction("wni_number_of_new_denotations_imported_from_wordet", "WNI-NUMBER-OF-NEW-DENOTATIONS-IMPORTED-FROM-WORDET", 0, 0, false);
        declareFunction("wni_role_info_print_function_trampoline", "WNI-ROLE-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("wni_role_info_p", "WNI-ROLE-INFO-P", 1, 0, false);
        new wordnet_import.$wni_role_info_p$UnaryFunction();
        declareFunction("wni_role", "WNI-ROLE", 1, 0, false);
        declareFunction("wni_filler", "WNI-FILLER", 1, 0, false);
        declareFunction("wni_defining_col", "WNI-DEFINING-COL", 1, 0, false);
        declareFunction("wni_defining_pred", "WNI-DEFINING-PRED", 1, 0, false);
        declareFunction("wni_subsumption_status", "WNI-SUBSUMPTION-STATUS", 1, 0, false);
        declareFunction("_csetf_wni_role", "_CSETF-WNI-ROLE", 2, 0, false);
        declareFunction("_csetf_wni_filler", "_CSETF-WNI-FILLER", 2, 0, false);
        declareFunction("_csetf_wni_defining_col", "_CSETF-WNI-DEFINING-COL", 2, 0, false);
        declareFunction("_csetf_wni_defining_pred", "_CSETF-WNI-DEFINING-PRED", 2, 0, false);
        declareFunction("_csetf_wni_subsumption_status", "_CSETF-WNI-SUBSUMPTION-STATUS", 2, 0, false);
        declareFunction("make_wni_role_info", "MAKE-WNI-ROLE-INFO", 0, 1, false);
        declareFunction("visit_defstruct_wni_role_info", "VISIT-DEFSTRUCT-WNI-ROLE-INFO", 2, 0, false);
        declareFunction("visit_defstruct_object_wni_role_info_method", "VISIT-DEFSTRUCT-OBJECT-WNI-ROLE-INFO-METHOD", 2, 0, false);
        declareFunction("wni_print_role_info", "WNI-PRINT-ROLE-INFO", 3, 0, false);
        declareFunction("wni_gather_roles_and_traits", "WNI-GATHER-ROLES-AND-TRAITS", 1, 0, false);
        declareFunction("wni_find_compatible_roles", "WNI-FIND-COMPATIBLE-ROLES", 2, 0, false);
        declareFunction("wni_genl_preds_helper", "WNI-GENL-PREDS-HELPER", 2, 0, false);
        declareFunction("wni_gather_roles", "WNI-GATHER-ROLES", 1, 0, false);
        declareFunction("wni_gather_traits", "WNI-GATHER-TRAITS", 1, 0, false);
        declareFunction("wni_bindings_to_role_infos", "WNI-BINDINGS-TO-ROLE-INFOS", 1, 0, false);
        declareFunction("wni_sort_key_1", "WNI-SORT-KEY-1", 1, 0, false);
        declareFunction("wni_most_specific_fillers", "WNI-MOST-SPECIFIC-FILLERS", 1, 0, false);
        declareFunction("wni_clear_function_caches", "WNI-CLEAR-FUNCTION-CACHES", 0, 0, false);
        declareFunction("wni_create_workflow_alist_with_unmapped_hypernym_chain", "WNI-CREATE-WORKFLOW-ALIST-WITH-UNMAPPED-HYPERNYM-CHAIN", 2, 0, false);
        declareFunction("wni_access_path_server", "WNI-ACCESS-PATH-SERVER", 0, 0, false);
        declareFunction("wni_access_path_port", "WNI-ACCESS-PATH-PORT", 0, 0, false);
        declareFunction("wni_access_path_proxy_server", "WNI-ACCESS-PATH-PROXY-SERVER", 0, 0, false);
        declareFunction("wni_access_path_proxy_port", "WNI-ACCESS-PATH-PROXY-PORT", 0, 0, false);
        declareFunction("wni_access_path_timeout", "WNI-ACCESS-PATH-TIMEOUT", 0, 0, false);
        declareFunction("wni_access_path_db", "WNI-ACCESS-PATH-DB", 0, 0, false);
        declareFunction("wni_access_path_user", "WNI-ACCESS-PATH-USER", 0, 0, false);
        declareFunction("wni_access_path_password", "WNI-ACCESS-PATH-PASSWORD", 0, 0, false);
        declareFunction("wni_access_path_subprotocol", "WNI-ACCESS-PATH-SUBPROTOCOL", 0, 0, false);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(cons(reader_make_constant_shell("Noun"), makeString("Noun")), cons(reader_make_constant_shell("Verb"), makeString("Verb")), cons(reader_make_constant_shell("Adjective"), makeString("Adjective")), cons(reader_make_constant_shell("Adverb"), makeString("Adverb")));

    static private final SubLList $list_alt1 = list(cons(reader_make_constant_shell("Noun"), makeString("N")), cons(reader_make_constant_shell("Verb"), makeString("V")), cons(reader_make_constant_shell("Adjective"), makeString("A")), cons(reader_make_constant_shell("Adverb"), makeString("R")));

    static private final SubLSymbol $sym5$_SYNSET = makeSymbol("?SYNSET");

    static private final SubLList $list_alt7 = list(new SubLObject[]{ makeKeyword("MAX-NUMBER"), NIL, makeKeyword("MAX-TIME"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("BLOCK?"), NIL, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("CACHE-INFERENCE-RESULTS?"), NIL, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), NIL, makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY") });

    public static final SubLSymbol $kw12$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLSymbol $sym13$WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_POS = makeSymbol("WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS");

    static private final SubLString $str_alt14$select_synset_id_from_WordSense_w = makeString("select synset_id from WordSense where word = '");

    static private final SubLString $str_alt15$__and_pos____ = makeString("' and pos = '");

    static private final SubLString $str_alt16$__order_by_word_sense = makeString("' order by word_sense");

    static private final SubLSymbol $sym23$_WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_POS_CACHING_STATE_ = makeSymbol("*WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS-CACHING-STATE*");

    public static final SubLObject $const25$WordNet2_0_KS = reader_make_constant_shell("WordNet2_0-KS");

    static private final SubLString $str_alt26$__order_by_pos__word_sense = makeString("' order by pos, word_sense");

    static private final SubLSymbol $sym28$WNI_SYNSET_COLLECTION_ = makeSymbol("WNI-SYNSET-COLLECTION?");

    public static final SubLObject $const29$WordNetSynsetImportStatus_Determi = reader_make_constant_shell("WordNetSynsetImportStatus-DeterminedIndividual");

    static private final SubLSymbol $sym31$_WNI_SYNSET_COLLECTION__CACHING_STATE_ = makeSymbol("*WNI-SYNSET-COLLECTION?-CACHING-STATE*");

    static private final SubLString $str_alt35$excluding_specs_of___Situation = makeString("excluding specs of #$Situation");

    static private final SubLString $str_alt38$excluding_specs_of___Relation = makeString("excluding specs of #$Relation");

    static private final SubLSymbol $sym50$_POS = makeSymbol("?POS");

    static private final SubLSymbol $sym51$_SENSE = makeSymbol("?SENSE");

    static private final SubLList $list_alt53 = list(list(reader_make_constant_shell("WordNetWordSenseFn"), list(reader_make_constant_shell("WordNetEnglishWordFn"), makeSymbol("?STRING")), makeSymbol("?POS"), makeSymbol("?SENSE")), makeSymbol("?WORD-INDEX"));

    static private final SubLSymbol $sym54$_ = makeSymbol("<");

    static private final SubLList $list_alt60 = list(makeSymbol("?EXAMPLE-PHRASE"), makeSymbol("?INDEX"));

    static private final SubLList $list_alt63 = list(cons(reader_make_constant_shell("WNVerbFrame-8"), TWO_INTEGER), cons(reader_make_constant_shell("WNVerbFrame-2"), FIVE_INTEGER), cons(reader_make_constant_shell("WNVerbFrame-1"), FOUR_INTEGER), cons(reader_make_constant_shell("WNVerbFrame-9"), THREE_INTEGER), cons(reader_make_constant_shell("WNVerbFrame-11"), ONE_INTEGER), cons(reader_make_constant_shell("WNVerbFrame-22"), FIVE_INTEGER), cons(reader_make_constant_shell("WNVerbFrame-4"), FOUR_INTEGER));

    static private final SubLList $list_alt69 = list(makeSymbol("?VERB-FRAME"));

    static private final SubLList $list_alt70 = list(new SubLObject[]{ makeKeyword("MAX-NUMBER"), NIL, makeKeyword("MAX-TIME"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("BLOCK?"), NIL, makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), makeSymbol("?VERB-FRAME")), makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("CACHE-INFERENCE-RESULTS?"), NIL, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), NIL, makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY") });

    static private final SubLList $list_alt78 = list(makeSymbol("?HYPERNYM-SYNSET"));

    static private final SubLSymbol $sym83$WNI_ALL_HYPERNYM_ = makeSymbol("WNI-ALL-HYPERNYM?");

    static private final SubLSymbol $sym86$_HYPONYM_SYNSET = makeSymbol("?HYPONYM-SYNSET");

    static private final SubLSymbol $sym92$WNI_VERB_IS_DERIVED_FROM_SITUATION_NOUN_ = makeSymbol("WNI-VERB-IS-DERIVED-FROM-SITUATION-NOUN?");

    static private final SubLString $str_alt96$SELECT_DISTINCT_synsetpointer_syn = makeString("SELECT DISTINCT synsetpointer.synset_id \n               FROM synsetpointer \n               WHERE \n                 synsetpointer.target_synset_id = ");

    static private final SubLString $str_alt97$_AND____________________synsetpoi = makeString(" AND \n                 (synsetpointer.source_pos = \'n\' OR\n                  synsetpointer.source_pos = \'a\' OR\n                  synsetpointer.source_pos = \'r\') AND \n                 synsetpointer.pointer_type = \'+\'");

    static private final SubLList $list_alt102 = list(makeSymbol("?GLOSS"));

    static private final SubLList $list_alt103 = list(new SubLObject[]{ makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("MAX-TIME"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("BLOCK?"), NIL, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("CACHE-INFERENCE-RESULTS?"), NIL, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), makeSymbol("?GLOSS")), makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL, makeKeyword("CONTINUABLE?"), NIL, makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY") });

    static private final SubLList $list_alt108 = list(makeSymbol("?POS"));

    static private final SubLList $list_alt109 = list(new SubLObject[]{ makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("MAX-TIME"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("BLOCK?"), NIL, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("CACHE-INFERENCE-RESULTS?"), NIL, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), NIL, makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL, makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), makeSymbol("?POS")), makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY") });

    public static final SubLObject init_wordnet_import_file_alt() {
        defconstant("*WNI-POS-MAP*", $list_alt0);
        defconstant("*WNI-1-CHAR-POS-MAP*", $list_alt1);
        deflexical("*WNI-UNRANKED-SYNSETS-FOR-ENGLISH-WORD-STRING-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSETS-FOR-ENGLISH-WORD-STRING-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSET-COLLECTION?-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSET-WORDS-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSET-EXAMPLE-PHRASES-HELPER-CACHING-STATE*", NIL);
        defconstant("*WNI-VERB-FRAME-GENERALITIES*", $list_alt63);
        defconstant("*WNI-LEAST-GENERAL-FRAME-GENERALITY-SCORE*", SIX_INTEGER);
        deflexical("*WNI-SYNSET-VERB-FRAMES-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-VERB-FRAMES-FOR-WORD-CACHING-STATE*", NIL);
        deflexical("*WNI-HYPERNYMS-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-ALL-HYPERNYMS-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-HYPONYMS-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-ALL-HYPONYMS-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-DERIVED-FORMS-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSET-GLOSS-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSET-POS-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSET-SPEECH-PART-OFFSET-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSET-TERM-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSET-W/O-LINKS-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSETS-CAUSED-BY-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSETS-CAUSING-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-BROADER-TERMS-CACHING-STATE*", NIL);
        defparameter("*WNI-PROBLEM-STORE*", NIL);
        deflexical("*WNI-TERM-HAS-VERB-SEMTRANS-HELPER?-CACHING-STATE*", NIL);
        defconstant("*WNI-MAXIMUM-NBR-OF-TERMS-TO-GATHER-FOR-MATCHING*", TWENTY_INTEGER);
        defparameter("*WNI-VERY-VERBOSE-EXACT-SYNSET-TERM-MATCHES*", NIL);
        defparameter("*WNI-VERBOSE-EXACT-SYNSET-TERM-MATCHES*", NIL);
        defconstant("*PERSON-SYNSET*", $list_alt307);
        defconstant("*ORGANISM-BEING-SYNSET*", $list_alt308);
        defconstant("*CHEMICAL-COMPOUND-SYNSET*", $list_alt309);
        defconstant("*COUNTRY-SYNSET*", $list_alt311);
        defconstant("*URBAN-AREA-SYNSET*", $list_alt312);
        defconstant("*GEOGRAPHICAL-AREA-SYNSET*", $list_alt313);
        defconstant("*DTP-WNI-ROLE-INFO*", WNI_ROLE_INFO);
        deflexical("*WORDNET-IMPORT-ACCESS-PATH*", NIL);
        return NIL;
    }

    public static SubLObject init_wordnet_import_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*WORDNET-IMPORT-CORE-CONSTANTS*", wordnet_import.$list0);
            defconstant("*WNI-POS-MAP*", wordnet_import.$list2);
            defconstant("*WNI-1-CHAR-POS-MAP*", wordnet_import.$list3);
            deflexical("*WNI-UNRANKED-SYNSETS-FOR-ENGLISH-WORD-STRING-CACHING-STATE*", NIL);
            deflexical("*WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS-CACHING-STATE*", NIL);
            deflexical("*WNI-SYNSETS-FOR-ENGLISH-WORD-STRING-CACHING-STATE*", NIL);
            deflexical("*WNI-SYNSET-COLLECTION?-CACHING-STATE*", NIL);
            deflexical("*WNI-SYNSET-WORDS-HELPER-CACHING-STATE*", NIL);
            deflexical("*WNI-SYNSET-EXAMPLE-PHRASES-HELPER-CACHING-STATE*", NIL);
            defconstant("*WNI-VERB-FRAME-GENERALITIES*", wordnet_import.$list65);
            defconstant("*WNI-LEAST-GENERAL-FRAME-GENERALITY-SCORE*", SIX_INTEGER);
            deflexical("*WNI-SYNSET-VERB-FRAMES-HELPER-CACHING-STATE*", NIL);
            deflexical("*WNI-VERB-FRAMES-FOR-WORD-CACHING-STATE*", NIL);
            deflexical("*WNI-HYPERNYMS-HELPER-CACHING-STATE*", NIL);
            deflexical("*WNI-ALL-HYPERNYMS-HELPER-CACHING-STATE*", NIL);
            deflexical("*WNI-HYPONYMS-HELPER-CACHING-STATE*", NIL);
            deflexical("*WNI-ALL-HYPONYMS-HELPER-CACHING-STATE*", NIL);
            deflexical("*WNI-DERIVED-FORMS-HELPER-CACHING-STATE*", NIL);
            deflexical("*WNI-SYNSET-GLOSS-HELPER-CACHING-STATE*", NIL);
            deflexical("*WNI-SYNSET-POS-HELPER-CACHING-STATE*", NIL);
            deflexical("*WNI-SYNSET-SPEECH-PART-OFFSET-HELPER-CACHING-STATE*", NIL);
            deflexical("*WNI-SYNSET-TERM-HELPER-CACHING-STATE*", NIL);
            deflexical("*WNI-SYNSET-W/O-LINKS-HELPER-CACHING-STATE*", NIL);
            deflexical("*WNI-SYNSETS-CAUSED-BY-HELPER-CACHING-STATE*", NIL);
            deflexical("*WNI-SYNSETS-CAUSING-HELPER-CACHING-STATE*", NIL);
            deflexical("*WNI-BROADER-TERMS-CACHING-STATE*", NIL);
            defparameter("*WNI-PROBLEM-STORE*", NIL);
            deflexical("*WNI-TERM-HAS-VERB-SEMTRANS-HELPER?-CACHING-STATE*", NIL);
            defconstant("*WNI-MAXIMUM-NBR-OF-TERMS-TO-GATHER-FOR-MATCHING*", TWENTY_INTEGER);
            defparameter("*WNI-VERY-VERBOSE-EXACT-SYNSET-TERM-MATCHES*", NIL);
            defparameter("*WNI-VERBOSE-EXACT-SYNSET-TERM-MATCHES*", NIL);
            defconstant("*PERSON-SYNSET*", wordnet_import.$list309);
            defconstant("*ORGANISM-BEING-SYNSET*", wordnet_import.$list310);
            defconstant("*CHEMICAL-COMPOUND-SYNSET*", wordnet_import.$list311);
            defconstant("*COUNTRY-SYNSET*", wordnet_import.$list313);
            defconstant("*URBAN-AREA-SYNSET*", wordnet_import.$list314);
            defconstant("*GEOGRAPHICAL-AREA-SYNSET*", wordnet_import.$list315);
            defconstant("*DTP-WNI-ROLE-INFO*", wordnet_import.WNI_ROLE_INFO);
            deflexical("*WORDNET-IMPORT-ACCESS-PATH*", NIL);
        }
        if (SubLFiles.USE_V2) {
            defconstant("*WNI-POS-MAP*", $list_alt0);
            defconstant("*WNI-1-CHAR-POS-MAP*", $list_alt1);
            defconstant("*WNI-VERB-FRAME-GENERALITIES*", $list_alt63);
            defconstant("*PERSON-SYNSET*", $list_alt307);
            defconstant("*ORGANISM-BEING-SYNSET*", $list_alt308);
            defconstant("*CHEMICAL-COMPOUND-SYNSET*", $list_alt309);
            defconstant("*COUNTRY-SYNSET*", $list_alt311);
            defconstant("*URBAN-AREA-SYNSET*", $list_alt312);
            defconstant("*GEOGRAPHICAL-AREA-SYNSET*", $list_alt313);
        }
        return NIL;
    }

    public static SubLObject init_wordnet_import_file_Previous() {
        deflexical("*WORDNET-IMPORT-CORE-CONSTANTS*", wordnet_import.$list0);
        defconstant("*WNI-POS-MAP*", wordnet_import.$list2);
        defconstant("*WNI-1-CHAR-POS-MAP*", wordnet_import.$list3);
        deflexical("*WNI-UNRANKED-SYNSETS-FOR-ENGLISH-WORD-STRING-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSETS-FOR-ENGLISH-WORD-STRING-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSET-COLLECTION?-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSET-WORDS-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSET-EXAMPLE-PHRASES-HELPER-CACHING-STATE*", NIL);
        defconstant("*WNI-VERB-FRAME-GENERALITIES*", wordnet_import.$list65);
        defconstant("*WNI-LEAST-GENERAL-FRAME-GENERALITY-SCORE*", SIX_INTEGER);
        deflexical("*WNI-SYNSET-VERB-FRAMES-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-VERB-FRAMES-FOR-WORD-CACHING-STATE*", NIL);
        deflexical("*WNI-HYPERNYMS-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-ALL-HYPERNYMS-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-HYPONYMS-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-ALL-HYPONYMS-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-DERIVED-FORMS-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSET-GLOSS-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSET-POS-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSET-SPEECH-PART-OFFSET-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSET-TERM-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSET-W/O-LINKS-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSETS-CAUSED-BY-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSETS-CAUSING-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-BROADER-TERMS-CACHING-STATE*", NIL);
        defparameter("*WNI-PROBLEM-STORE*", NIL);
        deflexical("*WNI-TERM-HAS-VERB-SEMTRANS-HELPER?-CACHING-STATE*", NIL);
        defconstant("*WNI-MAXIMUM-NBR-OF-TERMS-TO-GATHER-FOR-MATCHING*", TWENTY_INTEGER);
        defparameter("*WNI-VERY-VERBOSE-EXACT-SYNSET-TERM-MATCHES*", NIL);
        defparameter("*WNI-VERBOSE-EXACT-SYNSET-TERM-MATCHES*", NIL);
        defconstant("*PERSON-SYNSET*", wordnet_import.$list309);
        defconstant("*ORGANISM-BEING-SYNSET*", wordnet_import.$list310);
        defconstant("*CHEMICAL-COMPOUND-SYNSET*", wordnet_import.$list311);
        defconstant("*COUNTRY-SYNSET*", wordnet_import.$list313);
        defconstant("*URBAN-AREA-SYNSET*", wordnet_import.$list314);
        defconstant("*GEOGRAPHICAL-AREA-SYNSET*", wordnet_import.$list315);
        defconstant("*DTP-WNI-ROLE-INFO*", wordnet_import.WNI_ROLE_INFO);
        deflexical("*WORDNET-IMPORT-ACCESS-PATH*", NIL);
        return NIL;
    }

    static private final SubLList $list_alt115 = list(makeSymbol("?SPEECH-PART-OFFSET"));

    static private final SubLList $list_alt116 = list(new SubLObject[]{ makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("MAX-TIME"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("BLOCK?"), NIL, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), makeSymbol("?SPEECH-PART-OFFSET")), makeKeyword("CACHE-INFERENCE-RESULTS?"), NIL, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), NIL, makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY") });

    static private final SubLSymbol $sym120$WNI_HYPERNYM_MAPPED_ = makeSymbol("WNI-HYPERNYM-MAPPED?");

    static private final SubLSymbol $sym125$_TERM = makeSymbol("?TERM");

    public static final SubLObject $const126$WordNet_Version2_0 = reader_make_constant_shell("WordNet-Version2_0");

    static private final SubLList $list_alt127 = list(new SubLObject[]{ makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("MAX-TIME"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(0.95), makeKeyword("BLOCK?"), NIL, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), makeSymbol("?TERM")), makeKeyword("CACHE-INFERENCE-RESULTS?"), NIL, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), NIL, makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(2000000) });

    public static final SubLObject setup_wordnet_import_file_alt() {
        memoization_state.note_globally_cached_function(WNI_UNRANKED_SYNSETS_FOR_ENGLISH_WORD_STRING);
        memoization_state.note_globally_cached_function($sym13$WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_POS);
        memoization_state.note_globally_cached_function(WNI_SYNSETS_FOR_ENGLISH_WORD_STRING);
        memoization_state.note_globally_cached_function($sym28$WNI_SYNSET_COLLECTION_);
        register_external_symbol(WNI_SYNSET_INDIVIDUALS);
        register_external_symbol(WNI_EXCLUDE_SITUATIONS);
        register_external_symbol(WNI_EXCLUDE_RELATIONS);
        register_external_symbol(WNI_EXCLUDE_SKIPPED);
        register_external_symbol(WNI_SYNSET_ID);
        register_external_symbol(WNI_SYNSET_WORDS);
        register_external_symbol(WNI_SYNSETS_EQUAL);
        memoization_state.note_globally_cached_function(WNI_SYNSET_WORDS_HELPER);
        register_external_symbol(WNI_SYNSET_EXAMPLE_PHRASES);
        memoization_state.note_globally_cached_function(WNI_SYNSET_EXAMPLE_PHRASES_HELPER);
        register_external_symbol(WNI_MOST_GENERAL_SYNSET_VERB_FRAME);
        register_external_symbol(WNI_SYNSET_VERB_FRAMES);
        memoization_state.note_globally_cached_function(WNI_SYNSET_VERB_FRAMES_HELPER);
        memoization_state.note_globally_cached_function(WNI_VERB_FRAMES_FOR_WORD);
        register_external_symbol(WNI_HYPERNYMS);
        memoization_state.note_globally_cached_function(WNI_HYPERNYMS_HELPER);
        register_external_symbol(WNI_ALL_HYPERNYMS);
        memoization_state.note_globally_cached_function(WNI_ALL_HYPERNYMS_HELPER);
        register_external_symbol($sym83$WNI_ALL_HYPERNYM_);
        register_external_symbol(WNI_HYPONYMS);
        memoization_state.note_globally_cached_function(WNI_HYPONYMS_HELPER);
        register_external_symbol(WNI_ALL_HYPONYMS);
        memoization_state.note_globally_cached_function(WNI_ALL_HYPONYMS_HELPER);
        register_external_symbol(WNI_ANY_HYPONYM_AN_INDIVIDUAL);
        register_external_symbol($sym92$WNI_VERB_IS_DERIVED_FROM_SITUATION_NOUN_);
        register_external_symbol(WNI_DERIVED_FORMS);
        memoization_state.note_globally_cached_function(WNI_DERIVED_FORMS_HELPER);
        register_external_symbol(WNI_SYNSET_GLOSS);
        memoization_state.note_globally_cached_function(WNI_SYNSET_GLOSS_HELPER);
        register_external_symbol(WNI_SYNSET_POS);
        memoization_state.note_globally_cached_function(WNI_SYNSET_POS_HELPER);
        register_external_symbol(WNI_SYNSET_SPEECH_PART_OFFSET);
        memoization_state.note_globally_cached_function(WNI_SYNSET_SPEECH_PART_OFFSET_HELPER);
        register_external_symbol(WNI_HYPERNYM_TERMS);
        register_external_symbol($sym120$WNI_HYPERNYM_MAPPED_);
        register_external_symbol(WNI_SYNSET_TERM);
        memoization_state.note_globally_cached_function(WNI_SYNSET_TERM_HELPER);
        register_external_symbol(WNI_UNMAPPED_HYPERNYM_CHAIN);
        register_external_symbol($sym130$WNI_SYNSET_W_O_LINKS);
        memoization_state.note_globally_cached_function($sym131$WNI_SYNSET_W_O_LINKS_HELPER);
        register_external_symbol($sym137$WNI_SYNSET_IS_CAUSER_);
        register_external_symbol(WNI_SYNSETS_CAUSED_BY);
        memoization_state.note_globally_cached_function(WNI_SYNSETS_CAUSED_BY_HELPER);
        register_external_symbol($sym143$WNI_SYNSET_IS_CAUSED_BY_);
        register_external_symbol(WNI_SYNSETS_CAUSING);
        memoization_state.note_globally_cached_function(WNI_SYNSETS_CAUSING_HELPER);
        register_external_symbol(WNI_SYNSETS_HAVING_POS);
        register_external_symbol(WNI_TERMS_SYNSETS);
        memoization_state.note_globally_cached_function(WNI_BROADER_TERMS);
        register_external_symbol(WNI_MAPPED_TERMS_AND_SYNSETS);
        register_external_symbol($sym180$WNI_SYNSET_HYPERNYMS_MAPPED_);
        register_external_symbol(WNI_MAPPED_TERMS);
        register_external_symbol(WNI_MAPPED_TERMS_AND_POS_OFFSETS);
        register_external_symbol(WNI_SPEECH_PART_OFFSET_TO_SYNSET);
        register_external_symbol(WNI_UPDATE_SYNSET_WITH_TERM);
        register_external_symbol(WNI_INSERT_CONCEPT_MATCH_HTML);
        register_external_symbol(WNI_SELECT_CONCEPT_MATCH_HTML);
        register_external_symbol(WNI_DELETE_CONCEPT_MATCH_HTML);
        register_external_symbol(WNI_DELETE_ALL_CONCEPT_MATCH_HTML);
        register_external_symbol(WNI_UNMAPPED_SYNSETS_HAVING_MAPPED_HYPERNYM);
        register_external_symbol(WNI_UNREIFIED_SYNSET);
        register_external_symbol(WNI_REIFIABLE_SYNSET);
        register_external_symbol(WNI_REIFIABLE_SYNSET_FROM_STRING);
        register_external_symbol(WNI_SYNSET_FROM_ID_STRING);
        register_external_symbol(WNI_ENSURE_NAUT);
        register_external_symbol(WNI_NEXT_SYNSET_WITH_STATUS);
        register_external_symbol(WNI_UNLOCKED_SYNSETS_WITH_STATUS);
        register_external_symbol($sym225$WNI_TERM_HAS_VERB_SEMTRANS_);
        memoization_state.note_globally_cached_function($sym226$WNI_TERM_HAS_VERB_SEMTRANS_HELPER_);
        register_external_symbol(WNI_GATHER_TERMS_FOR_MATCHING);
        register_external_symbol(WNI_EXACT_SYNSET_TERM_MATCHES);
        register_external_symbol(WNI_STRONG_SYNSET_TERM_MATCHES);
        register_external_symbol(WNI_WEAK_SYNSET_TERM_MATCHES);
        register_external_symbol(WNI_CREATE_NOW);
        register_external_symbol(WNI_ASSERT_WFF);
        register_external_symbol(WNI_UNASSERT_IMPORT_STATUSES);
        register_external_symbol(WNI_UNASSERT_IMPORT_STATUS);
        register_external_symbol(WNI_ASSERT_IMPORT_STATUSES);
        register_external_symbol(WNI_ASSERT_IMPORT_STATUS);
        register_external_symbol(WNI_ASSERT_SYNSET_MAPPING);
        register_external_symbol(WNI_ASSERT_LIKELY_SYNSET_MAPPING);
        register_external_symbol(WNI_ASSERT_QUOTED_ISA_WORKFLOW_CONSTANT);
        register_external_symbol(WNI_ASSERT_ISA_COLLECTION);
        register_external_symbol(WNI_ASSERT_GENLS);
        register_external_symbol(WNI_UNASSERT_GENLS);
        register_external_symbol(WNI_ASSERT_ISA);
        register_external_symbol(WNI_ASSERT_ISA_INDIVIDUAL);
        register_external_symbol(WNI_ASSERT_ISA_AGENT_GENERIC);
        register_external_symbol(WNI_ASSERT_REIFIED_USING);
        register_external_symbol(WNI_SYNSET_NOTE);
        register_external_symbol(WNI_ASSERT_SYNSET_NOTE);
        register_external_symbol(WNI_UNASSERT_SYNSET_NOTE);
        register_external_symbol(WNI_ASSERT_COMMENT);
        register_external_symbol(WNI_ASSERT_TERM_OF_UNIT);
        register_external_symbol(WNI_LOCK_SYNSET);
        register_external_symbol(WNI_UNLOCK_SYNSET);
        register_external_symbol(WNI_ASSERT_HEURISTIC_LEXICON);
        register_external_symbol(WNI_NUMBER_OF_WORKFLOW_MAPPED_TERMS);
        register_external_symbol(WNI_NUMBER_OF_NEW_CONCEPTS_IMPORTED_FROM_WORDNET);
        register_external_symbol(WNI_NUMBER_OF_NEW_DENOTATIONS_IMPORTED_FROM_WORDET);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_wni_role_info$.getGlobalValue(), symbol_function(WNI_ROLE_INFO_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(WNI_ROLE, _CSETF_WNI_ROLE);
        def_csetf(WNI_FILLER, _CSETF_WNI_FILLER);
        def_csetf(WNI_DEFINING_COL, _CSETF_WNI_DEFINING_COL);
        def_csetf(WNI_DEFINING_PRED, _CSETF_WNI_DEFINING_PRED);
        def_csetf(WNI_SUBSUMPTION_STATUS, _CSETF_WNI_SUBSUMPTION_STATUS);
        identity(WNI_ROLE_INFO);
        register_external_symbol(WNI_GATHER_ROLES_AND_TRAITS);
        register_external_symbol(WNI_FIND_COMPATIBLE_ROLES);
        register_external_symbol(WNI_CLEAR_FUNCTION_CACHES);
        return NIL;
    }

    public static SubLObject setup_wordnet_import_file() {
        if (SubLFiles.USE_V1) {
            note_globally_cached_function(wordnet_import.WNI_UNRANKED_SYNSETS_FOR_ENGLISH_WORD_STRING);
            note_globally_cached_function(wordnet_import.$sym14$WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_POS);
            note_globally_cached_function(wordnet_import.WNI_SYNSETS_FOR_ENGLISH_WORD_STRING);
            note_globally_cached_function(wordnet_import.$sym29$WNI_SYNSET_COLLECTION_);
            register_external_symbol(wordnet_import.WNI_SYNSET_INDIVIDUALS);
            register_external_symbol(wordnet_import.WNI_EXCLUDE_SITUATIONS);
            register_external_symbol(wordnet_import.WNI_EXCLUDE_RELATIONS);
            register_external_symbol(wordnet_import.WNI_EXCLUDE_SKIPPED);
            register_external_symbol(wordnet_import.WNI_SYNSET_ID);
            register_external_symbol(wordnet_import.WNI_SYNSET_WORDS);
            register_external_symbol(wordnet_import.WNI_SYNSETS_EQUAL);
            note_globally_cached_function(wordnet_import.WNI_SYNSET_WORDS_HELPER);
            register_external_symbol(wordnet_import.WNI_SYNSET_EXAMPLE_PHRASES);
            note_globally_cached_function(wordnet_import.WNI_SYNSET_EXAMPLE_PHRASES_HELPER);
            register_external_symbol(wordnet_import.WNI_MOST_GENERAL_SYNSET_VERB_FRAME);
            register_external_symbol(wordnet_import.WNI_SYNSET_VERB_FRAMES);
            note_globally_cached_function(wordnet_import.WNI_SYNSET_VERB_FRAMES_HELPER);
            note_globally_cached_function(wordnet_import.WNI_VERB_FRAMES_FOR_WORD);
            register_external_symbol(wordnet_import.WNI_HYPERNYMS);
            note_globally_cached_function(wordnet_import.WNI_HYPERNYMS_HELPER);
            register_external_symbol(wordnet_import.WNI_ALL_HYPERNYMS);
            note_globally_cached_function(wordnet_import.WNI_ALL_HYPERNYMS_HELPER);
            register_external_symbol(wordnet_import.$sym85$WNI_ALL_HYPERNYM_);
            register_external_symbol(wordnet_import.WNI_HYPONYMS);
            note_globally_cached_function(wordnet_import.WNI_HYPONYMS_HELPER);
            register_external_symbol(wordnet_import.WNI_ALL_HYPONYMS);
            note_globally_cached_function(wordnet_import.WNI_ALL_HYPONYMS_HELPER);
            register_external_symbol(wordnet_import.WNI_ANY_HYPONYM_AN_INDIVIDUAL);
            register_external_symbol(wordnet_import.$sym94$WNI_VERB_IS_DERIVED_FROM_SITUATION_NOUN_);
            register_external_symbol(wordnet_import.WNI_DERIVED_FORMS);
            note_globally_cached_function(wordnet_import.WNI_DERIVED_FORMS_HELPER);
            register_external_symbol(wordnet_import.WNI_SYNSET_GLOSS);
            note_globally_cached_function(wordnet_import.WNI_SYNSET_GLOSS_HELPER);
            register_external_symbol(wordnet_import.WNI_SYNSET_POS);
            note_globally_cached_function(wordnet_import.WNI_SYNSET_POS_HELPER);
            register_external_symbol(wordnet_import.WNI_SYNSET_SPEECH_PART_OFFSET);
            note_globally_cached_function(wordnet_import.WNI_SYNSET_SPEECH_PART_OFFSET_HELPER);
            register_external_symbol(wordnet_import.WNI_HYPERNYM_TERMS);
            register_external_symbol(wordnet_import.$sym122$WNI_HYPERNYM_MAPPED_);
            register_external_symbol(wordnet_import.WNI_SYNSET_TERM);
            note_globally_cached_function(wordnet_import.WNI_SYNSET_TERM_HELPER);
            register_external_symbol(wordnet_import.WNI_UNMAPPED_HYPERNYM_CHAIN);
            register_external_symbol(wordnet_import.$sym132$WNI_SYNSET_W_O_LINKS);
            note_globally_cached_function(wordnet_import.$sym133$WNI_SYNSET_W_O_LINKS_HELPER);
            register_external_symbol(wordnet_import.$sym139$WNI_SYNSET_IS_CAUSER_);
            register_external_symbol(wordnet_import.WNI_SYNSETS_CAUSED_BY);
            note_globally_cached_function(wordnet_import.WNI_SYNSETS_CAUSED_BY_HELPER);
            register_external_symbol(wordnet_import.$sym145$WNI_SYNSET_IS_CAUSED_BY_);
            register_external_symbol(wordnet_import.WNI_SYNSETS_CAUSING);
            note_globally_cached_function(wordnet_import.WNI_SYNSETS_CAUSING_HELPER);
            register_external_symbol(wordnet_import.WNI_SYNSETS_HAVING_POS);
            register_external_symbol(wordnet_import.WNI_TERMS_SYNSETS);
            note_globally_cached_function(wordnet_import.WNI_BROADER_TERMS);
            register_external_symbol(wordnet_import.WNI_MAPPED_TERMS_AND_SYNSETS);
            register_external_symbol(wordnet_import.$sym182$WNI_SYNSET_HYPERNYMS_MAPPED_);
            register_external_symbol(wordnet_import.WNI_MAPPED_TERMS);
            register_external_symbol(wordnet_import.WNI_MAPPED_TERMS_AND_POS_OFFSETS);
            register_external_symbol(wordnet_import.WNI_SPEECH_PART_OFFSET_TO_SYNSET);
            register_external_symbol(wordnet_import.WNI_UPDATE_SYNSET_WITH_TERM);
            register_external_symbol(wordnet_import.WNI_INSERT_CONCEPT_MATCH_HTML);
            register_external_symbol(wordnet_import.WNI_SELECT_CONCEPT_MATCH_HTML);
            register_external_symbol(wordnet_import.WNI_DELETE_CONCEPT_MATCH_HTML);
            register_external_symbol(wordnet_import.WNI_DELETE_ALL_CONCEPT_MATCH_HTML);
            register_external_symbol(wordnet_import.WNI_UNMAPPED_SYNSETS_HAVING_MAPPED_HYPERNYM);
            register_external_symbol(wordnet_import.WNI_UNREIFIED_SYNSET);
            register_external_symbol(wordnet_import.WNI_REIFIABLE_SYNSET);
            register_external_symbol(wordnet_import.WNI_REIFIABLE_SYNSET_FROM_STRING);
            register_external_symbol(wordnet_import.WNI_SYNSET_FROM_ID_STRING);
            register_external_symbol(wordnet_import.WNI_ENSURE_NAUT);
            register_external_symbol(wordnet_import.WNI_NEXT_SYNSET_WITH_STATUS);
            register_external_symbol(wordnet_import.WNI_UNLOCKED_SYNSETS_WITH_STATUS);
            register_external_symbol(wordnet_import.$sym227$WNI_TERM_HAS_VERB_SEMTRANS_);
            note_globally_cached_function(wordnet_import.$sym228$WNI_TERM_HAS_VERB_SEMTRANS_HELPER_);
            register_external_symbol(wordnet_import.WNI_GATHER_TERMS_FOR_MATCHING);
            register_external_symbol(wordnet_import.WNI_EXACT_SYNSET_TERM_MATCHES);
            register_external_symbol(wordnet_import.WNI_STRONG_SYNSET_TERM_MATCHES);
            register_external_symbol(wordnet_import.WNI_WEAK_SYNSET_TERM_MATCHES);
            register_external_symbol(wordnet_import.WNI_CREATE_NOW);
            register_external_symbol(wordnet_import.WNI_ASSERT_WFF);
            register_external_symbol(wordnet_import.WNI_UNASSERT_IMPORT_STATUSES);
            register_external_symbol(wordnet_import.WNI_UNASSERT_IMPORT_STATUS);
            register_external_symbol(wordnet_import.WNI_ASSERT_IMPORT_STATUSES);
            register_external_symbol(wordnet_import.WNI_ASSERT_IMPORT_STATUS);
            register_external_symbol(wordnet_import.WNI_ASSERT_SYNSET_MAPPING);
            register_external_symbol(wordnet_import.WNI_ASSERT_LIKELY_SYNSET_MAPPING);
            register_external_symbol(wordnet_import.WNI_ASSERT_QUOTED_ISA_WORKFLOW_CONSTANT);
            register_external_symbol(wordnet_import.WNI_ASSERT_ISA_COLLECTION);
            register_external_symbol(wordnet_import.WNI_ASSERT_GENLS);
            register_external_symbol(wordnet_import.WNI_UNASSERT_GENLS);
            register_external_symbol(wordnet_import.WNI_ASSERT_ISA);
            register_external_symbol(wordnet_import.WNI_ASSERT_ISA_INDIVIDUAL);
            register_external_symbol(wordnet_import.WNI_ASSERT_ISA_AGENT_GENERIC);
            register_external_symbol(wordnet_import.WNI_ASSERT_REIFIED_USING);
            register_external_symbol(wordnet_import.WNI_SYNSET_NOTE);
            register_external_symbol(wordnet_import.WNI_ASSERT_SYNSET_NOTE);
            register_external_symbol(wordnet_import.WNI_UNASSERT_SYNSET_NOTE);
            register_external_symbol(wordnet_import.WNI_ASSERT_COMMENT);
            register_external_symbol(wordnet_import.WNI_ASSERT_TERM_OF_UNIT);
            register_external_symbol(wordnet_import.WNI_LOCK_SYNSET);
            register_external_symbol(wordnet_import.WNI_UNLOCK_SYNSET);
            register_external_symbol(wordnet_import.WNI_ASSERT_HEURISTIC_LEXICON);
            register_external_symbol(wordnet_import.WNI_NUMBER_OF_WORKFLOW_MAPPED_TERMS);
            register_external_symbol(wordnet_import.WNI_NUMBER_OF_NEW_CONCEPTS_IMPORTED_FROM_WORDNET);
            register_external_symbol(wordnet_import.WNI_NUMBER_OF_NEW_DENOTATIONS_IMPORTED_FROM_WORDET);
            register_method($print_object_method_table$.getGlobalValue(), wordnet_import.$dtp_wni_role_info$.getGlobalValue(), symbol_function(wordnet_import.WNI_ROLE_INFO_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(wordnet_import.$list401);
            def_csetf(wordnet_import.WNI_ROLE, wordnet_import._CSETF_WNI_ROLE);
            def_csetf(wordnet_import.WNI_FILLER, wordnet_import._CSETF_WNI_FILLER);
            def_csetf(wordnet_import.WNI_DEFINING_COL, wordnet_import._CSETF_WNI_DEFINING_COL);
            def_csetf(wordnet_import.WNI_DEFINING_PRED, wordnet_import._CSETF_WNI_DEFINING_PRED);
            def_csetf(wordnet_import.WNI_SUBSUMPTION_STATUS, wordnet_import._CSETF_WNI_SUBSUMPTION_STATUS);
            identity(wordnet_import.WNI_ROLE_INFO);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), wordnet_import.$dtp_wni_role_info$.getGlobalValue(), symbol_function(wordnet_import.VISIT_DEFSTRUCT_OBJECT_WNI_ROLE_INFO_METHOD));
            register_external_symbol(wordnet_import.WNI_GATHER_ROLES_AND_TRAITS);
            register_external_symbol(wordnet_import.WNI_FIND_COMPATIBLE_ROLES);
            register_external_symbol(wordnet_import.WNI_CLEAR_FUNCTION_CACHES);
        }
        if (SubLFiles.USE_V2) {
            memoization_state.note_globally_cached_function($sym13$WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_POS);
            memoization_state.note_globally_cached_function($sym28$WNI_SYNSET_COLLECTION_);
            register_external_symbol($sym83$WNI_ALL_HYPERNYM_);
            register_external_symbol($sym92$WNI_VERB_IS_DERIVED_FROM_SITUATION_NOUN_);
            register_external_symbol($sym120$WNI_HYPERNYM_MAPPED_);
            register_external_symbol($sym130$WNI_SYNSET_W_O_LINKS);
            memoization_state.note_globally_cached_function($sym131$WNI_SYNSET_W_O_LINKS_HELPER);
            register_external_symbol($sym137$WNI_SYNSET_IS_CAUSER_);
            register_external_symbol($sym143$WNI_SYNSET_IS_CAUSED_BY_);
            register_external_symbol($sym180$WNI_SYNSET_HYPERNYMS_MAPPED_);
            register_external_symbol($sym225$WNI_TERM_HAS_VERB_SEMTRANS_);
            memoization_state.note_globally_cached_function($sym226$WNI_TERM_HAS_VERB_SEMTRANS_HELPER_);
        }
        return NIL;
    }

    public static SubLObject setup_wordnet_import_file_Previous() {
        note_globally_cached_function(wordnet_import.WNI_UNRANKED_SYNSETS_FOR_ENGLISH_WORD_STRING);
        note_globally_cached_function(wordnet_import.$sym14$WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_POS);
        note_globally_cached_function(wordnet_import.WNI_SYNSETS_FOR_ENGLISH_WORD_STRING);
        note_globally_cached_function(wordnet_import.$sym29$WNI_SYNSET_COLLECTION_);
        register_external_symbol(wordnet_import.WNI_SYNSET_INDIVIDUALS);
        register_external_symbol(wordnet_import.WNI_EXCLUDE_SITUATIONS);
        register_external_symbol(wordnet_import.WNI_EXCLUDE_RELATIONS);
        register_external_symbol(wordnet_import.WNI_EXCLUDE_SKIPPED);
        register_external_symbol(wordnet_import.WNI_SYNSET_ID);
        register_external_symbol(wordnet_import.WNI_SYNSET_WORDS);
        register_external_symbol(wordnet_import.WNI_SYNSETS_EQUAL);
        note_globally_cached_function(wordnet_import.WNI_SYNSET_WORDS_HELPER);
        register_external_symbol(wordnet_import.WNI_SYNSET_EXAMPLE_PHRASES);
        note_globally_cached_function(wordnet_import.WNI_SYNSET_EXAMPLE_PHRASES_HELPER);
        register_external_symbol(wordnet_import.WNI_MOST_GENERAL_SYNSET_VERB_FRAME);
        register_external_symbol(wordnet_import.WNI_SYNSET_VERB_FRAMES);
        note_globally_cached_function(wordnet_import.WNI_SYNSET_VERB_FRAMES_HELPER);
        note_globally_cached_function(wordnet_import.WNI_VERB_FRAMES_FOR_WORD);
        register_external_symbol(wordnet_import.WNI_HYPERNYMS);
        note_globally_cached_function(wordnet_import.WNI_HYPERNYMS_HELPER);
        register_external_symbol(wordnet_import.WNI_ALL_HYPERNYMS);
        note_globally_cached_function(wordnet_import.WNI_ALL_HYPERNYMS_HELPER);
        register_external_symbol(wordnet_import.$sym85$WNI_ALL_HYPERNYM_);
        register_external_symbol(wordnet_import.WNI_HYPONYMS);
        note_globally_cached_function(wordnet_import.WNI_HYPONYMS_HELPER);
        register_external_symbol(wordnet_import.WNI_ALL_HYPONYMS);
        note_globally_cached_function(wordnet_import.WNI_ALL_HYPONYMS_HELPER);
        register_external_symbol(wordnet_import.WNI_ANY_HYPONYM_AN_INDIVIDUAL);
        register_external_symbol(wordnet_import.$sym94$WNI_VERB_IS_DERIVED_FROM_SITUATION_NOUN_);
        register_external_symbol(wordnet_import.WNI_DERIVED_FORMS);
        note_globally_cached_function(wordnet_import.WNI_DERIVED_FORMS_HELPER);
        register_external_symbol(wordnet_import.WNI_SYNSET_GLOSS);
        note_globally_cached_function(wordnet_import.WNI_SYNSET_GLOSS_HELPER);
        register_external_symbol(wordnet_import.WNI_SYNSET_POS);
        note_globally_cached_function(wordnet_import.WNI_SYNSET_POS_HELPER);
        register_external_symbol(wordnet_import.WNI_SYNSET_SPEECH_PART_OFFSET);
        note_globally_cached_function(wordnet_import.WNI_SYNSET_SPEECH_PART_OFFSET_HELPER);
        register_external_symbol(wordnet_import.WNI_HYPERNYM_TERMS);
        register_external_symbol(wordnet_import.$sym122$WNI_HYPERNYM_MAPPED_);
        register_external_symbol(wordnet_import.WNI_SYNSET_TERM);
        note_globally_cached_function(wordnet_import.WNI_SYNSET_TERM_HELPER);
        register_external_symbol(wordnet_import.WNI_UNMAPPED_HYPERNYM_CHAIN);
        register_external_symbol(wordnet_import.$sym132$WNI_SYNSET_W_O_LINKS);
        note_globally_cached_function(wordnet_import.$sym133$WNI_SYNSET_W_O_LINKS_HELPER);
        register_external_symbol(wordnet_import.$sym139$WNI_SYNSET_IS_CAUSER_);
        register_external_symbol(wordnet_import.WNI_SYNSETS_CAUSED_BY);
        note_globally_cached_function(wordnet_import.WNI_SYNSETS_CAUSED_BY_HELPER);
        register_external_symbol(wordnet_import.$sym145$WNI_SYNSET_IS_CAUSED_BY_);
        register_external_symbol(wordnet_import.WNI_SYNSETS_CAUSING);
        note_globally_cached_function(wordnet_import.WNI_SYNSETS_CAUSING_HELPER);
        register_external_symbol(wordnet_import.WNI_SYNSETS_HAVING_POS);
        register_external_symbol(wordnet_import.WNI_TERMS_SYNSETS);
        note_globally_cached_function(wordnet_import.WNI_BROADER_TERMS);
        register_external_symbol(wordnet_import.WNI_MAPPED_TERMS_AND_SYNSETS);
        register_external_symbol(wordnet_import.$sym182$WNI_SYNSET_HYPERNYMS_MAPPED_);
        register_external_symbol(wordnet_import.WNI_MAPPED_TERMS);
        register_external_symbol(wordnet_import.WNI_MAPPED_TERMS_AND_POS_OFFSETS);
        register_external_symbol(wordnet_import.WNI_SPEECH_PART_OFFSET_TO_SYNSET);
        register_external_symbol(wordnet_import.WNI_UPDATE_SYNSET_WITH_TERM);
        register_external_symbol(wordnet_import.WNI_INSERT_CONCEPT_MATCH_HTML);
        register_external_symbol(wordnet_import.WNI_SELECT_CONCEPT_MATCH_HTML);
        register_external_symbol(wordnet_import.WNI_DELETE_CONCEPT_MATCH_HTML);
        register_external_symbol(wordnet_import.WNI_DELETE_ALL_CONCEPT_MATCH_HTML);
        register_external_symbol(wordnet_import.WNI_UNMAPPED_SYNSETS_HAVING_MAPPED_HYPERNYM);
        register_external_symbol(wordnet_import.WNI_UNREIFIED_SYNSET);
        register_external_symbol(wordnet_import.WNI_REIFIABLE_SYNSET);
        register_external_symbol(wordnet_import.WNI_REIFIABLE_SYNSET_FROM_STRING);
        register_external_symbol(wordnet_import.WNI_SYNSET_FROM_ID_STRING);
        register_external_symbol(wordnet_import.WNI_ENSURE_NAUT);
        register_external_symbol(wordnet_import.WNI_NEXT_SYNSET_WITH_STATUS);
        register_external_symbol(wordnet_import.WNI_UNLOCKED_SYNSETS_WITH_STATUS);
        register_external_symbol(wordnet_import.$sym227$WNI_TERM_HAS_VERB_SEMTRANS_);
        note_globally_cached_function(wordnet_import.$sym228$WNI_TERM_HAS_VERB_SEMTRANS_HELPER_);
        register_external_symbol(wordnet_import.WNI_GATHER_TERMS_FOR_MATCHING);
        register_external_symbol(wordnet_import.WNI_EXACT_SYNSET_TERM_MATCHES);
        register_external_symbol(wordnet_import.WNI_STRONG_SYNSET_TERM_MATCHES);
        register_external_symbol(wordnet_import.WNI_WEAK_SYNSET_TERM_MATCHES);
        register_external_symbol(wordnet_import.WNI_CREATE_NOW);
        register_external_symbol(wordnet_import.WNI_ASSERT_WFF);
        register_external_symbol(wordnet_import.WNI_UNASSERT_IMPORT_STATUSES);
        register_external_symbol(wordnet_import.WNI_UNASSERT_IMPORT_STATUS);
        register_external_symbol(wordnet_import.WNI_ASSERT_IMPORT_STATUSES);
        register_external_symbol(wordnet_import.WNI_ASSERT_IMPORT_STATUS);
        register_external_symbol(wordnet_import.WNI_ASSERT_SYNSET_MAPPING);
        register_external_symbol(wordnet_import.WNI_ASSERT_LIKELY_SYNSET_MAPPING);
        register_external_symbol(wordnet_import.WNI_ASSERT_QUOTED_ISA_WORKFLOW_CONSTANT);
        register_external_symbol(wordnet_import.WNI_ASSERT_ISA_COLLECTION);
        register_external_symbol(wordnet_import.WNI_ASSERT_GENLS);
        register_external_symbol(wordnet_import.WNI_UNASSERT_GENLS);
        register_external_symbol(wordnet_import.WNI_ASSERT_ISA);
        register_external_symbol(wordnet_import.WNI_ASSERT_ISA_INDIVIDUAL);
        register_external_symbol(wordnet_import.WNI_ASSERT_ISA_AGENT_GENERIC);
        register_external_symbol(wordnet_import.WNI_ASSERT_REIFIED_USING);
        register_external_symbol(wordnet_import.WNI_SYNSET_NOTE);
        register_external_symbol(wordnet_import.WNI_ASSERT_SYNSET_NOTE);
        register_external_symbol(wordnet_import.WNI_UNASSERT_SYNSET_NOTE);
        register_external_symbol(wordnet_import.WNI_ASSERT_COMMENT);
        register_external_symbol(wordnet_import.WNI_ASSERT_TERM_OF_UNIT);
        register_external_symbol(wordnet_import.WNI_LOCK_SYNSET);
        register_external_symbol(wordnet_import.WNI_UNLOCK_SYNSET);
        register_external_symbol(wordnet_import.WNI_ASSERT_HEURISTIC_LEXICON);
        register_external_symbol(wordnet_import.WNI_NUMBER_OF_WORKFLOW_MAPPED_TERMS);
        register_external_symbol(wordnet_import.WNI_NUMBER_OF_NEW_CONCEPTS_IMPORTED_FROM_WORDNET);
        register_external_symbol(wordnet_import.WNI_NUMBER_OF_NEW_DENOTATIONS_IMPORTED_FROM_WORDET);
        register_method($print_object_method_table$.getGlobalValue(), wordnet_import.$dtp_wni_role_info$.getGlobalValue(), symbol_function(wordnet_import.WNI_ROLE_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(wordnet_import.$list401);
        def_csetf(wordnet_import.WNI_ROLE, wordnet_import._CSETF_WNI_ROLE);
        def_csetf(wordnet_import.WNI_FILLER, wordnet_import._CSETF_WNI_FILLER);
        def_csetf(wordnet_import.WNI_DEFINING_COL, wordnet_import._CSETF_WNI_DEFINING_COL);
        def_csetf(wordnet_import.WNI_DEFINING_PRED, wordnet_import._CSETF_WNI_DEFINING_PRED);
        def_csetf(wordnet_import.WNI_SUBSUMPTION_STATUS, wordnet_import._CSETF_WNI_SUBSUMPTION_STATUS);
        identity(wordnet_import.WNI_ROLE_INFO);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), wordnet_import.$dtp_wni_role_info$.getGlobalValue(), symbol_function(wordnet_import.VISIT_DEFSTRUCT_OBJECT_WNI_ROLE_INFO_METHOD));
        register_external_symbol(wordnet_import.WNI_GATHER_ROLES_AND_TRAITS);
        register_external_symbol(wordnet_import.WNI_FIND_COMPATIBLE_ROLES);
        register_external_symbol(wordnet_import.WNI_CLEAR_FUNCTION_CACHES);
        return NIL;
    }

    static private final SubLSymbol $sym130$WNI_SYNSET_W_O_LINKS = makeSymbol("WNI-SYNSET-W/O-LINKS");

    static private final SubLSymbol $sym131$WNI_SYNSET_W_O_LINKS_HELPER = makeSymbol("WNI-SYNSET-W/O-LINKS-HELPER");

    static private final SubLString $str_alt132$_ = makeString("(");

    static private final SubLString $str_alt133$___ = makeString(" | ");

    static private final SubLString $str_alt134$_ = makeString(")");

    static private final SubLSymbol $sym135$_WNI_SYNSET_W_O_LINKS_HELPER_CACHING_STATE_ = makeSymbol("*WNI-SYNSET-W/O-LINKS-HELPER-CACHING-STATE*");

    static private final SubLSymbol $sym137$WNI_SYNSET_IS_CAUSER_ = makeSymbol("WNI-SYNSET-IS-CAUSER?");

    static private final SubLList $list_alt141 = list(makeSymbol("?CAUSED-SYNSET"));

    static private final SubLSymbol $sym143$WNI_SYNSET_IS_CAUSED_BY_ = makeSymbol("WNI-SYNSET-IS-CAUSED-BY?");

    static private final SubLSymbol $sym146$_CAUSING_SYNSET = makeSymbol("?CAUSING-SYNSET");

    static private final SubLString $str_alt150$_ = makeString(" ");

    static private final SubLString $str_alt165$_s = makeString("'s");

    static private final SubLList $list_alt170 = list(reader_make_constant_shell("WordNet-Version2_0"), makeSymbol("?SPEECH-PART-OFFSET"));

    static private final SubLList $list_alt171 = list(new SubLObject[]{ makeKeyword("MAX-NUMBER"), NIL, makeKeyword("MAX-TIME"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(0.95), makeKeyword("BLOCK?"), NIL, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("CACHE-INFERENCE-RESULTS?"), NIL, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), NIL, makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(2000000) });

    static private final SubLSymbol $sym172$_SPEECH_PART_OFFSET = makeSymbol("?SPEECH-PART-OFFSET");

    static private final SubLString $str_alt178$finding_synsets_for_speech_part_o = makeString("finding synsets for speech-part-offsets");

    static private final SubLSymbol $sym180$WNI_SYNSET_HYPERNYMS_MAPPED_ = makeSymbol("WNI-SYNSET-HYPERNYMS-MAPPED?");

    static private final SubLList $list_alt182 = list(reader_make_constant_shell("thereExists"), makeSymbol("?SPEECH-PART-OFFSET"), list(reader_make_constant_shell("synonymousExternalConcept"), makeSymbol("?TERM"), reader_make_constant_shell("WordNet-Version2_0"), makeSymbol("?SPEECH-PART-OFFSET")));

    static private final SubLList $list_alt185 = list(reader_make_constant_shell("synonymousExternalConcept"), makeSymbol("?TERM"), reader_make_constant_shell("WordNet-Version2_0"), makeSymbol("?SPEECH-PART-OFFSET"));

    static private final SubLList $list_alt187 = list(new SubLObject[]{ makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("MAX-TIME"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("BLOCK?"), NIL, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("CACHE-INFERENCE-RESULTS?"), NIL, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), NIL, makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY") });

    static private final SubLList $list_alt189 = list(makeKeyword("TIMEOUT"), THREE_INTEGER);

    static private final SubLString $str_alt190$update_Synset_set_cyc_term_____A_ = makeString("update Synset set cyc_term = '~A' where synset_id = ~S");

    @Override
    public void declareFunctions() {
        wordnet_import.declare_wordnet_import_file();
    }

    static private final SubLString $str_alt192$delete_from_ConceptMatchHTML_wher = makeString("delete from ConceptMatchHTML where synset_id = ~A and cyc_image_id ='~A'");

    @Override
    public void initializeVariables() {
        wordnet_import.init_wordnet_import_file();
    }

    @Override
    public void runTopLevelForms() {
        wordnet_import.setup_wordnet_import_file();
    }

    static private final SubLString $str_alt193$insert_into_ConceptMatchHTML_valu = makeString("insert into ConceptMatchHTML values(~A, '~A', '~A')");

    static {
    }

    static private final SubLString $str_alt194$__ = makeString("''");

    static private final SubLString $str_alt195$_ = makeString("'");

    static private final SubLString $str_alt197$select_html_from_ConceptMatchHTML = makeString("select html from ConceptMatchHTML where synset_id = ~A and cyc_image_id ='~A'");

    static private final SubLString $str_alt200$delete_from_ConceptMatchHTML_wher = makeString("delete from ConceptMatchHTML where cyc_image_id ='~A'");

    static private final SubLString $str_alt202$select_Synset_synset_id__________ = makeString("select Synset.synset_id\n                 from \n                   Synset, \n                   Synset as target_synset, \n                   SynsetPointer\n                 where\n                   Synset.pos = \'");

    static private final SubLString $str_alt203$__and____________________Synset_c = makeString("\' and\n                   Synset.cyc_term is null and\n                   pointer_type = \'@\' and\n                   SynsetPointer.synset_id = Synset.synset_id and\n                   SynsetPointer.target_synset_id = target_synset.synset_id and\n                   target_synset.cyc_term is not null\n                 order by Synset.synset_id");

    static private final SubLString $str_alt208$Destroying_invalid_WordNet_Import = makeString("Destroying invalid WordNet Import problem store...");

    static private final SubLString $str_alt210$Destroying_90___full_WordNet_Impo = makeString("Destroying 90%+ full WordNet Import problem store...");

    static private final SubLList $list_alt211 = list(makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), $NONE, makeKeyword("TRANSFORMATION-ALLOWED?"), NIL, makeKeyword("NEW-TERMS-ALLOWED?"), NIL);

    static private final SubLSymbol $sym217$DIGIT_STRING_ = makeSymbol("DIGIT-STRING?");

    public static final class $wni_role_info_p$UnaryFunction extends UnaryFunction {
        public $wni_role_info_p$UnaryFunction() {
            super(extractFunctionNamed("WNI-ROLE-INFO-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return wordnet_import.wni_role_info_p(arg1);
        }
    }

    static private final SubLSymbol $sym222$_REIFIED_SYNSET = makeSymbol("?REIFIED-SYNSET");

    static private final SubLList $list_alt223 = list(list(reader_make_constant_shell("unknownSentence"), list(reader_make_constant_shell("thereExists"), makeSymbol("?CYCLIST"), list(reader_make_constant_shell("thereExists"), makeSymbol("?DATE"), list(reader_make_constant_shell("wnWorkflowSynsetLock"), makeSymbol("?REIFIED-SYNSET"), makeSymbol("?CYCLIST"), makeSymbol("?DATE"))))));

    static private final SubLSymbol $sym225$WNI_TERM_HAS_VERB_SEMTRANS_ = makeSymbol("WNI-TERM-HAS-VERB-SEMTRANS?");

    static private final SubLSymbol $sym226$WNI_TERM_HAS_VERB_SEMTRANS_HELPER_ = makeSymbol("WNI-TERM-HAS-VERB-SEMTRANS-HELPER?");

    static private final SubLSymbol $sym227$_WORD_UNIT = makeSymbol("?WORD-UNIT");

    static private final SubLSymbol $sym228$_SENSE_NBR = makeSymbol("?SENSE-NBR");

    static private final SubLSymbol $sym232$_FRAME = makeSymbol("?FRAME");

    static private final SubLSymbol $sym233$_TRANS = makeSymbol("?TRANS");

    static private final SubLList $list_alt235 = list(makeSymbol("?TRANS"));

    static private final SubLList $list_alt236 = list(list(reader_make_constant_shell("unknownSentence"), list(reader_make_constant_shell("thereExists"), makeSymbol("?FRAME"), list(reader_make_constant_shell("thereExists"), makeSymbol("?TRANS"), list(reader_make_constant_shell("verbSemTrans"), makeSymbol("?WORD-UNIT"), makeSymbol("?SENSE-NBR"), makeSymbol("?FRAME"), makeSymbol("?TRANS"))))));

    static private final SubLList $list_alt237 = list(NIL);

    static private final SubLSymbol $sym238$_WNI_TERM_HAS_VERB_SEMTRANS_HELPER__CACHING_STATE_ = makeSymbol("*WNI-TERM-HAS-VERB-SEMTRANS-HELPER?-CACHING-STATE*");

    static private final SubLString $str_alt241$___A_mapped_hypernyms__A___A__ = makeString("~%~A mapped-hypernyms ~A~%~A~%");

    static private final SubLString $str_alt242$__considering_word____a__ = makeString("  considering word - ~a~%");

    static private final SubLString $str_alt243$____possible_lexical_matches__A__ = makeString("    possible lexical matches ~A~%");

    static private final SubLString $str_alt244$____considering_term____a___const = makeString("    considering term - ~a - constrained by mapped broader terms ~A~%");

    static private final SubLString $str_alt245$___A_____A__structure___ = makeString("~%~A  = ~A (structure)~%");

    static private final SubLString $str_alt246$___A____A__lexicon___ = makeString("~%~A = ~A (lexicon)~%");

    static private final SubLSymbol $sym252$SET_OR_COLLECTION_ = makeSymbol("SET-OR-COLLECTION?");

    static private final SubLSymbol $sym253$INDIVIDUAL_ = makeSymbol("INDIVIDUAL?");

    static private final SubLList $list_alt272 = list(reader_make_constant_shell("WordNetWorkflowConstant-NotFullyReviewed"));

    static private final SubLList $list_alt275 = list(reader_make_constant_shell("Collection"));

    static private final SubLList $list_alt283 = list(reader_make_constant_shell("Individual"));

    static private final SubLList $list_alt286 = list(reader_make_constant_shell("Agent-Generic"));

    static private final SubLList $list_alt289 = list(reader_make_constant_shell("CycWordNetImportTool"));

    static private final SubLList $list_alt292 = list(makeSymbol("?NOTE"));

    static private final SubLList $list_alt304 = list(makeSymbol("?DATE"));

    static private final SubLList $list_alt307 = list(reader_make_constant_shell("WordNetSynsetFn"), makeInteger(114834));

    static private final SubLList $list_alt308 = list(reader_make_constant_shell("WordNetSynsetFn"), makeInteger(114709));

    static private final SubLList $list_alt309 = list(reader_make_constant_shell("WordNetSynsetFn"), makeInteger(567092));

    static private final SubLString $str_alt310$_included = makeString("-included");

    static private final SubLList $list_alt311 = list(reader_make_constant_shell("WordNetSynsetFn"), makeInteger(377912));

    static private final SubLList $list_alt312 = list(reader_make_constant_shell("WordNetSynsetFn"), makeInteger(382049));

    static private final SubLList $list_alt313 = list(reader_make_constant_shell("WordNetSynsetFn"), makeInteger(378797));

    static private final SubLString $str_alt314$WordNet_individual_synset__A_must = makeString("WordNet individual synset ~A must be a #$Noun");

    static private final SubLList $list_alt318 = list(CHAR_space, CHAR_semicolon, CHAR_comma);



    public static final SubLObject $const320$TemporaryLexicalAssertions_WordNe = reader_make_constant_shell("TemporaryLexicalAssertions-WordNetImportMt");

    static private final SubLList $list_alt321 = list(CHAR_hyphen);

    static private final SubLString $str_alt325$_count_noun = makeString("-count-noun");

    static private final SubLString $str_alt326$headword_is_first = makeString("headword-is-first");

    static private final SubLString $str_alt329$must_have_an_existing_word_unit_f = makeString("must have an existing word unit for ~A which has speech-part ~A");

    static private final SubLSymbol $sym330$_WORD_SENSE = makeSymbol("?WORD-SENSE");

    static private final SubLString $str_alt331$must_have_an_existing_word_sense_ = makeString("must have an existing word sense for ~A which has speech-part ~A");

    static private final SubLString $str_alt335$_politeness = makeString("-politeness");

    static private final SubLString $str_alt342$_formality = makeString("-formality");

    static private final SubLString $str_alt355$_rhetorical_device = makeString("-rhetorical-device");

    static private final SubLString $str_alt364$Mrs_ = makeString("Mrs.");

    static private final SubLString $str_alt365$Sir_ = makeString("Sir ");

    static private final SubLString $str_alt366$_Jr_ = makeString(" Jr.");

    static private final SubLString $str_alt367$President_ = makeString("President ");

    public static final SubLObject $const386$WordNetWorkflowConstant_NotFullyR = reader_make_constant_shell("WordNetWorkflowConstant-NotFullyReviewed");

    static private final SubLString $str_alt387$Counting_terms_imported_from_Word = makeString("Counting terms imported from WordNet");

    static private final SubLString $str_alt391$Counting_recent_denotations_impor = makeString("Counting recent denotations imported from WordNet");

    static private final SubLList $list_alt394 = list(makeSymbol("ROLE"), makeSymbol("FILLER"), makeSymbol("DEFINING-COL"), makeSymbol("DEFINING-PRED"), makeSymbol("SUBSUMPTION-STATUS"));

    static private final SubLList $list_alt395 = list($ROLE, makeKeyword("FILLER"), makeKeyword("DEFINING-COL"), makeKeyword("DEFINING-PRED"), makeKeyword("SUBSUMPTION-STATUS"));

    static private final SubLList $list_alt396 = list(makeSymbol("WNI-ROLE"), makeSymbol("WNI-FILLER"), makeSymbol("WNI-DEFINING-COL"), makeSymbol("WNI-DEFINING-PRED"), makeSymbol("WNI-SUBSUMPTION-STATUS"));

    static private final SubLList $list_alt397 = list(makeSymbol("_CSETF-WNI-ROLE"), makeSymbol("_CSETF-WNI-FILLER"), makeSymbol("_CSETF-WNI-DEFINING-COL"), makeSymbol("_CSETF-WNI-DEFINING-PRED"), makeSymbol("_CSETF-WNI-SUBSUMPTION-STATUS"));

    static private final SubLString $str_alt415$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt417$_ROLE_INFO___s__s__s__s__s_ = makeString("<ROLE-INFO: ~s ~s ~s ~s ~s>");

    static private final SubLSymbol $sym419$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE<");

    static private final SubLList $list_alt422 = list(makeSymbol("?ROLE"), makeSymbol("?FILLER"), makeSymbol("?DEFINING-COLL"), makeSymbol("?DEFINING-PRED"));

    static private final SubLList $list_alt423 = list(makeSymbol("?DEFINING-COLL"));

    static private final SubLList $list_alt424 = list(reader_make_constant_shell("genls"), makeSymbol("?DEFINING-COLL"), reader_make_constant_shell("Situation"));

    static private final SubLList $list_alt425 = list(reader_make_constant_shell("genlPreds"), makeSymbol("?DEFINING-PRED"), reader_make_constant_shell("keRelevantPreds"));

    static private final SubLList $list_alt426 = list(reader_make_constant_shell("assertedSentence"), list(makeSymbol("?DEFINING-PRED"), makeSymbol("?DEFINING-COLL"), makeSymbol("?ROLE")));

    static private final SubLSymbol $sym429$_ROLE = makeSymbol("?ROLE");

    static private final SubLList $list_alt430 = list(makeSymbol("?FILLER"));

    static private final SubLSymbol $sym431$_FILLER_2 = makeSymbol("?FILLER-2");

    static private final SubLList $list_alt432 = list(makeSymbol("?FILLER-2"));

    static private final SubLList $list_alt433 = list(list(reader_make_constant_shell("different"), makeSymbol("?FILLER-2"), makeSymbol("?FILLER")), list(reader_make_constant_shell("genls"), makeSymbol("?FILLER-2"), makeSymbol("?FILLER")));

    static private final SubLList $list_alt434 = list(list(reader_make_constant_shell("arg2Isa"), makeSymbol("?ROLE"), makeSymbol("?FILLER")));

    static private final SubLSymbol $sym435$_COLL = makeSymbol("?COLL");

    static private final SubLList $list_alt436 = list(list(reader_make_constant_shell("genls"), makeSymbol("?DEFINING-COLL"), reader_make_constant_shell("Situation")), list(reader_make_constant_shell("assertedSentence"), list(reader_make_constant_shell("relationAllExists"), makeSymbol("?ROLE"), makeSymbol("?DEFINING-COLL"), makeSymbol("?COLL"))), list(reader_make_constant_shell("equals"), makeSymbol("?FILLER"), makeSymbol("?COLL")), list(reader_make_constant_shell("equals"), makeSymbol("?DEFINING-PRED"), reader_make_constant_shell("relationAllExists")), list(reader_make_constant_shell("unknownSentence"), list(reader_make_constant_shell("quotedIsa"), makeSymbol("?ROLE"), reader_make_constant_shell("FormulaTemplateConstant-FactEntryTool"))));

    static private final SubLSymbol $sym437$_THING = makeSymbol("?THING");

    static private final SubLList $list_alt438 = list(list(reader_make_constant_shell("genls"), makeSymbol("?DEFINING-COLL"), reader_make_constant_shell("Situation")), list(reader_make_constant_shell("assertedSentence"), list(reader_make_constant_shell("relationAllInstance"), makeSymbol("?ROLE"), makeSymbol("?DEFINING-COLL"), makeSymbol("?THING"))), list(reader_make_constant_shell("equals"), makeSymbol("?FILLER"), makeSymbol("?THING")), list(reader_make_constant_shell("equals"), makeSymbol("?DEFINING-PRED"), reader_make_constant_shell("relationAllInstance")), list(reader_make_constant_shell("unknownSentence"), list(reader_make_constant_shell("quotedIsa"), makeSymbol("?ROLE"), reader_make_constant_shell("FormulaTemplateConstant-FactEntryTool"))));

    static private final SubLSymbol $sym439$_ROLE2 = makeSymbol("?ROLE2");

    static private final SubLSymbol $sym442$_DEFINING_COLL = makeSymbol("?DEFINING-COLL");

    static private final SubLList $list_alt443 = list(list(reader_make_constant_shell("equals"), makeSymbol("?DEFINING-PRED"), reader_make_constant_shell("genlPredsWRTTypes")));

    static private final SubLList $list_alt444 = list(reader_make_constant_shell("unknownSentence"), list(reader_make_constant_shell("genls"), makeSymbol("?DEFINING-COLL"), reader_make_constant_shell("Situation")));

    static private final SubLList $list_alt445 = list(list(reader_make_constant_shell("unknownSentence"), list(reader_make_constant_shell("genls"), makeSymbol("?DEFINING-COLL"), reader_make_constant_shell("Situation"))), list(reader_make_constant_shell("assertedSentence"), list(reader_make_constant_shell("relationAllExists"), makeSymbol("?ROLE"), makeSymbol("?DEFINING-COLL"), makeSymbol("?COLL"))), list(reader_make_constant_shell("equals"), makeSymbol("?FILLER"), makeSymbol("?COLL")), list(reader_make_constant_shell("equals"), makeSymbol("?DEFINING-PRED"), reader_make_constant_shell("relationAllExists")), list(reader_make_constant_shell("unknownSentence"), list(reader_make_constant_shell("quotedIsa"), makeSymbol("?ROLE"), reader_make_constant_shell("FormulaTemplateConstant-FactEntryTool"))));

    static private final SubLList $list_alt446 = list(list(reader_make_constant_shell("unknownSentence"), list(reader_make_constant_shell("genls"), makeSymbol("?DEFINING-COLL"), reader_make_constant_shell("Situation"))), list(reader_make_constant_shell("assertedSentence"), list(reader_make_constant_shell("relationAllInstance"), makeSymbol("?ROLE"), makeSymbol("?DEFINING-COLL"), makeSymbol("?THING"))), list(reader_make_constant_shell("equals"), makeSymbol("?FILLER"), makeSymbol("?THING")), list(reader_make_constant_shell("equals"), makeSymbol("?DEFINING-PRED"), reader_make_constant_shell("relationAllInstance")), list(reader_make_constant_shell("unknownSentence"), list(reader_make_constant_shell("quotedIsa"), makeSymbol("?ROLE"), reader_make_constant_shell("FormulaTemplateConstant-FactEntryTool"))));

    static private final SubLString $str_alt447$_A = makeString("~A");

    static private final SubLString $str_alt451$in_workflow_ = makeString("in-workflow?");

    static private final SubLString $str_alt453$unmapped_hypernym_chain = makeString("unmapped-hypernym-chain");
}

/**
 * Total time: 2268 ms synthetic
 */
