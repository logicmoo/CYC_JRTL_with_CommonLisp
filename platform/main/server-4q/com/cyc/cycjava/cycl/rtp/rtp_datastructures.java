/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.rtp;


import static com.cyc.cycjava.cycl.arity.arity;
import static com.cyc.cycjava.cycl.assertion_handles.assertion_id;
import static com.cyc.cycjava.cycl.assertions_high.assertion_formula;
import static com.cyc.cycjava.cycl.assertions_high.assertion_mt;
import static com.cyc.cycjava.cycl.assertions_high.gaf_arg0;
import static com.cyc.cycjava.cycl.assertions_high.gaf_arg1;
import static com.cyc.cycjava.cycl.assertions_high.gaf_arg2;
import static com.cyc.cycjava.cycl.assertions_high.gaf_arg3;
import static com.cyc.cycjava.cycl.assertions_high.gaf_arg4;
import static com.cyc.cycjava.cycl.assertions_high.gaf_arg5;
import static com.cyc.cycjava.cycl.cfasl.$cfasl_output_object_method_table$;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.cfasl.cfasl_raw_write_byte;
import static com.cyc.cycjava.cycl.cfasl.register_cfasl_input_function;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constant;
import static com.cyc.cycjava.cycl.constants_high.find_constant;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_arg;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_arg0;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_arg1;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_arg2;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_args;
import static com.cyc.cycjava.cycl.dictionary.clear_dictionary;
import static com.cyc.cycjava.cycl.dictionary.dictionary_contents;
import static com.cyc.cycjava.cycl.dictionary.dictionary_enter;
import static com.cyc.cycjava.cycl.dictionary.dictionary_length;
import static com.cyc.cycjava.cycl.dictionary.dictionary_lookup;
import static com.cyc.cycjava.cycl.dictionary.dictionary_p;
import static com.cyc.cycjava.cycl.dictionary.dictionary_remove;
import static com.cyc.cycjava.cycl.dictionary.new_dictionary;
import static com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_doneP;
import static com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_finalize;
import static com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_key_value;
import static com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_next;
import static com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_state;
import static com.cyc.cycjava.cycl.dictionary_utilities.dictionary_push;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.format_nil.format_nil_s_no_copy;
import static com.cyc.cycjava.cycl.fort_types_interface.predicate_p;
import static com.cyc.cycjava.cycl.forts.fort_p;
import static com.cyc.cycjava.cycl.genl_mts.all_genl_mts;
import static com.cyc.cycjava.cycl.genl_mts.all_genl_mts_among;
import static com.cyc.cycjava.cycl.genl_mts.all_spec_mts;
import static com.cyc.cycjava.cycl.genl_predicates.genl_predP;
import static com.cyc.cycjava.cycl.genl_predicates.spec_predicates;
import static com.cyc.cycjava.cycl.hash_table_utilities.hash_table_empty_p;
import static com.cyc.cycjava.cycl.hash_table_utilities.hash_table_keys;
import static com.cyc.cycjava.cycl.integer_sequence_generator.integer_sequence_generator_next;
import static com.cyc.cycjava.cycl.integer_sequence_generator.new_integer_sequence_generator;
import static com.cyc.cycjava.cycl.isa.all_fort_instances;
import static com.cyc.cycjava.cycl.isa.all_fort_instances_in_all_mts;
import static com.cyc.cycjava.cycl.isa.isaP;
import static com.cyc.cycjava.cycl.isa.isa_in_any_mtP;
import static com.cyc.cycjava.cycl.iteration.iteration_next_without_values_macro_helper;
import static com.cyc.cycjava.cycl.kb_accessors.min_argn_isa;
import static com.cyc.cycjava.cycl.kb_indexing.num_gaf_arg_index;
import static com.cyc.cycjava.cycl.kb_indexing.num_predicate_extent_index;
import static com.cyc.cycjava.cycl.kb_mapping_macros.destroy_final_index_iterator;
import static com.cyc.cycjava.cycl.kb_mapping_macros.do_gaf_arg_index_key_validator;
import static com.cyc.cycjava.cycl.kb_mapping_macros.do_predicate_extent_index_key_validator;
import static com.cyc.cycjava.cycl.kb_mapping_macros.new_final_index_iterator;
import static com.cyc.cycjava.cycl.kb_mapping_macros.new_gaf_arg_final_index_spec_iterator;
import static com.cyc.cycjava.cycl.kb_mapping_macros.new_predicate_extent_final_index_spec_iterator;
import static com.cyc.cycjava.cycl.lexicon_accessors.all_preds_of_pos;
import static com.cyc.cycjava.cycl.lexicon_accessors.clear_get_strings_of_type_cached;
import static com.cyc.cycjava.cycl.lexicon_accessors.get_strings_of_type_cached;
import static com.cyc.cycjava.cycl.lexicon_accessors.speech_partP;
import static com.cyc.cycjava.cycl.lexicon_cache.strings_of_wordXpred;
import static com.cyc.cycjava.cycl.lexicon_utilities.clear_lexical_info_caches;
import static com.cyc.cycjava.cycl.list_utilities.alist_lookup;
import static com.cyc.cycjava.cycl.list_utilities.lengthE;
import static com.cyc.cycjava.cycl.list_utilities.sublisp_boolean;
import static com.cyc.cycjava.cycl.memoization_state.$memoization_state$;
import static com.cyc.cycjava.cycl.memoization_state.$memoized_item_not_found$;
import static com.cyc.cycjava.cycl.memoization_state.caching_results;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_clear;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_enter_multi_key_n;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_lookup;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_put;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_remove_function_results_with_args;
import static com.cyc.cycjava.cycl.memoization_state.clear_all_memoization;
import static com.cyc.cycjava.cycl.memoization_state.create_global_caching_state_for_name;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_original_process;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_p;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_possibly_clear_original_process;
import static com.cyc.cycjava.cycl.memoization_state.note_globally_cached_function;
import static com.cyc.cycjava.cycl.memoization_state.register_mt_dependent_cache_clear_callback;
import static com.cyc.cycjava.cycl.memoization_state.sxhash_calc_2;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$mt$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$relevant_mt_function$;
import static com.cyc.cycjava.cycl.pph_macros.$free_pph_problem_store_pointers$;
import static com.cyc.cycjava.cycl.pph_macros.$pph_external_memoization_state$;
import static com.cyc.cycjava.cycl.pph_macros.$pph_memoization_state$;
import static com.cyc.cycjava.cycl.pph_macros.$pph_problem_store_pointer$;
import static com.cyc.cycjava.cycl.pph_macros.find_or_create_pph_external_memoization_state;
import static com.cyc.cycjava.cycl.pph_macros.find_or_create_pph_memoization_state;
import static com.cyc.cycjava.cycl.pph_macros.find_or_create_pph_problem_store_pointer;
import static com.cyc.cycjava.cycl.pph_macros.free_pph_problem_store_pointer;
import static com.cyc.cycjava.cycl.pph_methods_lexicon.all_phrases_for_term;
import static com.cyc.cycjava.cycl.pph_vars.$pph_domain_mt$;
import static com.cyc.cycjava.cycl.pph_vars.$pph_language_mt$;
import static com.cyc.cycjava.cycl.rkf_concept_harvester.rkf_ch_string_tokenize;
import static com.cyc.cycjava.cycl.string_utilities.bunge;
import static com.cyc.cycjava.cycl.string_utilities.substringP;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.subl_promotions.memberP;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.note_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_positive_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nintersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nsubst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.lexicon_cache;
import com.cyc.cycjava.cycl.lexicon_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.pph_macros;
import com.cyc.cycjava.cycl.pph_methods_lexicon;
import com.cyc.cycjava.cycl.pph_vars;
import com.cyc.cycjava.cycl.rkf_concept_harvester;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RTP-DATASTRUCTURES
 * source file: /cyc/top/cycl/rtp/rtp-datastructures.lisp
 * created:     2019/07/03 17:38:39
 */
public final class rtp_datastructures extends SubLTranslatedFile implements V12 {
    // Definitions
    public static final SubLObject assertion_arg(SubLObject n, SubLObject assertion) {
        return nth(n, uncanonicalizer.assertion_el_formula(assertion));
    }

    public static final class $subconstit_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.rtp.rtp_datastructures.$subconstit_native.this.$cat;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.rtp.rtp_datastructures.$subconstit_native.this.$string;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.rtp.rtp_datastructures.$subconstit_native.this.$binding_var;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.rtp.rtp_datastructures.$subconstit_native.this.$start;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.rtp.rtp_datastructures.$subconstit_native.this.$end;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.rtp.rtp_datastructures.$subconstit_native.this.$sem_test;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.rtp_datastructures.$subconstit_native.this.$cat = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.rtp_datastructures.$subconstit_native.this.$string = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.rtp_datastructures.$subconstit_native.this.$binding_var = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.rtp_datastructures.$subconstit_native.this.$start = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.rtp_datastructures.$subconstit_native.this.$end = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.rtp_datastructures.$subconstit_native.this.$sem_test = value;
        }

        public SubLObject $cat = Lisp.NIL;

        public SubLObject $string = Lisp.NIL;

        public SubLObject $binding_var = Lisp.NIL;

        public SubLObject $start = Lisp.NIL;

        public SubLObject $end = Lisp.NIL;

        public SubLObject $sem_test = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rtp.rtp_datastructures.$subconstit_native.class, SUBCONSTIT, SUBCONSTIT_P, $list_alt213, $list_alt214, new String[]{ "$cat", "$string", "$binding_var", "$start", "$end", "$sem_test" }, $list_alt215, $list_alt216, PRINT_SUBCONSTIT);
    }

    public static final class $rtp_chart_entry_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.rtp.rtp_datastructures.$rtp_chart_entry_native.this.$start;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.rtp.rtp_datastructures.$rtp_chart_entry_native.this.$end;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.rtp.rtp_datastructures.$rtp_chart_entry_native.this.$rule;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.rtp.rtp_datastructures.$rtp_chart_entry_native.this.$template_index;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.rtp.rtp_datastructures.$rtp_chart_entry_native.this.$words;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.rtp.rtp_datastructures.$rtp_chart_entry_native.this.$bindings;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.rtp.rtp_datastructures.$rtp_chart_entry_native.this.$subconstits;
        }

        public SubLObject getField9() {
            return com.cyc.cycjava.cycl.rtp.rtp_datastructures.$rtp_chart_entry_native.this.$sem;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.rtp_datastructures.$rtp_chart_entry_native.this.$start = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.rtp_datastructures.$rtp_chart_entry_native.this.$end = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.rtp_datastructures.$rtp_chart_entry_native.this.$rule = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.rtp_datastructures.$rtp_chart_entry_native.this.$template_index = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.rtp_datastructures.$rtp_chart_entry_native.this.$words = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.rtp_datastructures.$rtp_chart_entry_native.this.$bindings = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.rtp_datastructures.$rtp_chart_entry_native.this.$subconstits = value;
        }

        public SubLObject setField9(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.rtp_datastructures.$rtp_chart_entry_native.this.$sem = value;
        }

        public SubLObject $start = Lisp.NIL;

        public SubLObject $end = Lisp.NIL;

        public SubLObject $rule = Lisp.NIL;

        public SubLObject $template_index = Lisp.NIL;

        public SubLObject $words = Lisp.NIL;

        public SubLObject $bindings = Lisp.NIL;

        public SubLObject $subconstits = Lisp.NIL;

        public SubLObject $sem = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rtp.rtp_datastructures.$rtp_chart_entry_native.class, RTP_CHART_ENTRY, RTP_CHART_ENTRY_P, $list_alt181, $list_alt182, new String[]{ "$start", "$end", "$rule", "$template_index", "$words", "$bindings", "$subconstits", "$sem" }, $list_alt183, $list_alt184, RTP_ENTRY_PRINT);
    }

    public static final SubLFile me = new rtp_datastructures();



    // deflexical
    // should TEMPLATE-RULEs be printed in an abbreviated fashion
    /**
     * should TEMPLATE-RULEs be printed in an abbreviated fashion
     */
    @LispMethod(comment = "should TEMPLATE-RULEs be printed in an abbreviated fashion\ndeflexical")
    public static final SubLSymbol $print_rule_abbreviated$ = makeSymbol("*PRINT-RULE-ABBREVIATED*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $template_meta_marker_predicate$ = makeSymbol("*TEMPLATE-META-MARKER-PREDICATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $template_category_fill_word_predicate$ = makeSymbol("*TEMPLATE-CATEGORY-FILL-WORD-PREDICATE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_template_rule$ = makeSymbol("*DTP-TEMPLATE-RULE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $template_rule_sxhashing_prime_a$ = makeSymbol("*TEMPLATE-RULE-SXHASHING-PRIME-A*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $template_rule_sxhashing_prime_b$ = makeSymbol("*TEMPLATE-RULE-SXHASHING-PRIME-B*");



    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $template_rule_default_assertion$ = makeSymbol("*TEMPLATE-RULE-DEFAULT-ASSERTION*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $template_rule_default_meaning$ = makeSymbol("*TEMPLATE-RULE-DEFAULT-MEANING*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $cfasl_opcode_template_rule$ = makeSymbol("*CFASL-OPCODE-TEMPLATE-RULE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_template_span_item$ = makeSymbol("*DTP-TEMPLATE-SPAN-ITEM*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $template_terminal_style$ = makeSymbol("*TEMPLATE-TERMINAL-STYLE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $block_left_recursive_templates$ = makeSymbol("*BLOCK-LEFT-RECURSIVE-TEMPLATES*");

    // defparameter
    /**
     * an alist with verbs as keys, and possible contractions for those words as the
     * values
     */
    @LispMethod(comment = "an alist with verbs as keys, and possible contractions for those words as the\r\nvalues\ndefparameter\nan alist with verbs as keys, and possible contractions for those words as the\nvalues")
    public static final SubLSymbol $rtp_contractions_table$ = makeSymbol("*RTP-CONTRACTIONS-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $rtp_rules_initial_size$ = makeSymbol("*RTP-RULES-INITIAL-SIZE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_categorized_template_rule_set$ = makeSymbol("*DTP-CATEGORIZED-TEMPLATE-RULE-SET*");

    // defparameter
    /**
     * This can be bound to T when you are certain that the memory has just been
     * cleared, thereby speeding things up substantially
     */
    @LispMethod(comment = "This can be bound to T when you are certain that the memory has just been\r\ncleared, thereby speeding things up substantially\ndefparameter\nThis can be bound to T when you are certain that the memory has just been\ncleared, thereby speeding things up substantially")
    public static final SubLSymbol $assume_empty_associative_memoryP$ = makeSymbol("*ASSUME-EMPTY-ASSOCIATIVE-MEMORY?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $rtp_asserts_initialized_so_far$ = makeSymbol("*RTP-ASSERTS-INITIALIZED-SO-FAR*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_rtp_chart_entry$ = makeSymbol("*DTP-RTP-CHART-ENTRY*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_subconstit$ = makeSymbol("*DTP-SUBCONSTIT*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $template_meta_marker_mappings$ = makeSymbol("*TEMPLATE-META-MARKER-MAPPINGS*");



    public static final SubLSymbol $template_category_fill_words$ = makeSymbol("*TEMPLATE-CATEGORY-FILL-WORDS*");



    private static final SubLSymbol MAKE_OPTIONAL_WORD_LIST = makeSymbol("MAKE-OPTIONAL-WORD-LIST");



    public static final SubLSymbol $make_optional_word_list_caching_state$ = makeSymbol("*MAKE-OPTIONAL-WORD-LIST-CACHING-STATE*");

    private static final SubLSymbol TEMPLATE_RULE = makeSymbol("TEMPLATE-RULE");

    private static final SubLSymbol TEMPLATE_RULE_P = makeSymbol("TEMPLATE-RULE-P");

    static private final SubLList $list14 = list(new SubLObject[]{ makeSymbol("CATEGORY"), makeSymbol("TEMPLATE"), makeSymbol("TRANSFORMATION"), makeSymbol("SEM-TEST"), makeSymbol("ASSERTION"), makeSymbol("TERMINALS"), makeSymbol("MEANING"), makeSymbol("CONSTRAINTS"), makeSymbol("ID") });

    static private final SubLList $list15 = list(new SubLObject[]{ makeKeyword("CATEGORY"), makeKeyword("TEMPLATE"), makeKeyword("TRANSFORMATION"), makeKeyword("SEM-TEST"), makeKeyword("ASSERTION"), makeKeyword("TERMINALS"), makeKeyword("MEANING"), makeKeyword("CONSTRAINTS"), makeKeyword("ID") });

    static private final SubLList $list16 = list(new SubLObject[]{ makeSymbol("TEMPLATE-RULE-CATEGORY"), makeSymbol("TEMPLATE-RULE-TEMPLATE"), makeSymbol("TEMPLATE-RULE-TRANSFORMATION"), makeSymbol("TEMPLATE-RULE-SEM-TEST"), makeSymbol("TEMPLATE-RULE-ASSERTION"), makeSymbol("TEMPLATE-RULE-TERMINALS"), makeSymbol("TEMPLATE-RULE-MEANING"), makeSymbol("TEMPLATE-RULE-CONSTRAINTS"), makeSymbol("TEMPLATE-RULE-ID") });

    static private final SubLList $list17 = list(new SubLObject[]{ makeSymbol("_CSETF-TEMPLATE-RULE-CATEGORY"), makeSymbol("_CSETF-TEMPLATE-RULE-TEMPLATE"), makeSymbol("_CSETF-TEMPLATE-RULE-TRANSFORMATION"), makeSymbol("_CSETF-TEMPLATE-RULE-SEM-TEST"), makeSymbol("_CSETF-TEMPLATE-RULE-ASSERTION"), makeSymbol("_CSETF-TEMPLATE-RULE-TERMINALS"), makeSymbol("_CSETF-TEMPLATE-RULE-MEANING"), makeSymbol("_CSETF-TEMPLATE-RULE-CONSTRAINTS"), makeSymbol("_CSETF-TEMPLATE-RULE-ID") });

    private static final SubLSymbol PRINT_TEMPLATE_RULE = makeSymbol("PRINT-TEMPLATE-RULE");

    private static final SubLSymbol TEMPLATE_RULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TEMPLATE-RULE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list20 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TEMPLATE-RULE-P"));

    private static final SubLSymbol TEMPLATE_RULE_CATEGORY = makeSymbol("TEMPLATE-RULE-CATEGORY");

    private static final SubLSymbol _CSETF_TEMPLATE_RULE_CATEGORY = makeSymbol("_CSETF-TEMPLATE-RULE-CATEGORY");

    private static final SubLSymbol TEMPLATE_RULE_TEMPLATE = makeSymbol("TEMPLATE-RULE-TEMPLATE");

    private static final SubLSymbol _CSETF_TEMPLATE_RULE_TEMPLATE = makeSymbol("_CSETF-TEMPLATE-RULE-TEMPLATE");

    private static final SubLSymbol TEMPLATE_RULE_TRANSFORMATION = makeSymbol("TEMPLATE-RULE-TRANSFORMATION");

    private static final SubLSymbol _CSETF_TEMPLATE_RULE_TRANSFORMATION = makeSymbol("_CSETF-TEMPLATE-RULE-TRANSFORMATION");

    private static final SubLSymbol TEMPLATE_RULE_SEM_TEST = makeSymbol("TEMPLATE-RULE-SEM-TEST");

    private static final SubLSymbol _CSETF_TEMPLATE_RULE_SEM_TEST = makeSymbol("_CSETF-TEMPLATE-RULE-SEM-TEST");

    private static final SubLSymbol TEMPLATE_RULE_ASSERTION = makeSymbol("TEMPLATE-RULE-ASSERTION");

    private static final SubLSymbol _CSETF_TEMPLATE_RULE_ASSERTION = makeSymbol("_CSETF-TEMPLATE-RULE-ASSERTION");

    private static final SubLSymbol TEMPLATE_RULE_TERMINALS = makeSymbol("TEMPLATE-RULE-TERMINALS");

    private static final SubLSymbol _CSETF_TEMPLATE_RULE_TERMINALS = makeSymbol("_CSETF-TEMPLATE-RULE-TERMINALS");

    private static final SubLSymbol TEMPLATE_RULE_MEANING = makeSymbol("TEMPLATE-RULE-MEANING");

    private static final SubLSymbol _CSETF_TEMPLATE_RULE_MEANING = makeSymbol("_CSETF-TEMPLATE-RULE-MEANING");

    private static final SubLSymbol TEMPLATE_RULE_CONSTRAINTS = makeSymbol("TEMPLATE-RULE-CONSTRAINTS");

    private static final SubLSymbol _CSETF_TEMPLATE_RULE_CONSTRAINTS = makeSymbol("_CSETF-TEMPLATE-RULE-CONSTRAINTS");

    private static final SubLSymbol TEMPLATE_RULE_ID = makeSymbol("TEMPLATE-RULE-ID");

    private static final SubLSymbol _CSETF_TEMPLATE_RULE_ID = makeSymbol("_CSETF-TEMPLATE-RULE-ID");

    private static final SubLString $str48$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_TEMPLATE_RULE = makeSymbol("MAKE-TEMPLATE-RULE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TEMPLATE_RULE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TEMPLATE-RULE-METHOD");

    public static final SubLSymbol $use_better_template_rule_sxhashP$ = makeSymbol("*USE-BETTER-TEMPLATE-RULE-SXHASH?*");

    private static final SubLSymbol SXHASH_TEMPLATE_RULE_METHOD = makeSymbol("SXHASH-TEMPLATE-RULE-METHOD");

    private static final SubLString $str56$__A_for__S____from_Assertion__S__ = makeString("[~A for ~S~%  from Assertion ~S: ~% => ~S");

    private static final SubLString $str57$___Subject_to_test__S = makeString("~% Subject to test ~S");

    private static final SubLString $str58$___Augmented_Template___S = makeString("~% Augmented Template: ~S");

    private static final SubLString $str59$___Term___S____Const___S = makeString("~% Term: ~S ~% Const: ~S");

    private static final SubLString $str60$___ = makeString("]~%");

    private static final SubLString $$$assertTemplate = makeString("assertTemplate");

    private static final SubLSymbol $template_rule_isg$ = makeSymbol("*TEMPLATE-RULE-ISG*");

    private static final SubLInteger $int$97 = makeInteger(97);

    private static final SubLSymbol CFASL_INPUT_TEMPLATE_RULE = makeSymbol("CFASL-INPUT-TEMPLATE-RULE");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_TEMPLATE_RULE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-TEMPLATE-RULE-METHOD");

    private static final SubLSymbol TEMPLATE_SPAN_ITEM = makeSymbol("TEMPLATE-SPAN-ITEM");

    private static final SubLSymbol TEMPLATE_SPAN_ITEM_P = makeSymbol("TEMPLATE-SPAN-ITEM-P");

    private static final SubLList $list68 = list(makeSymbol("TEMPLATE-ITEM"), makeSymbol("START"), makeSymbol("END"));

    private static final SubLList $list69 = list(makeKeyword("TEMPLATE-ITEM"), makeKeyword("START"), makeKeyword("END"));

    private static final SubLList $list70 = list(makeSymbol("TEMPLATE-SPAN-ITEM-TEMPLATE-ITEM"), makeSymbol("TEMPLATE-SPAN-ITEM-START"), makeSymbol("TEMPLATE-SPAN-ITEM-END"));

    private static final SubLList $list71 = list(makeSymbol("_CSETF-TEMPLATE-SPAN-ITEM-TEMPLATE-ITEM"), makeSymbol("_CSETF-TEMPLATE-SPAN-ITEM-START"), makeSymbol("_CSETF-TEMPLATE-SPAN-ITEM-END"));

    private static final SubLSymbol PRINT_TEMPLATE_SPAN_ITEM = makeSymbol("PRINT-TEMPLATE-SPAN-ITEM");

    private static final SubLSymbol TEMPLATE_SPAN_ITEM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TEMPLATE-SPAN-ITEM-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list74 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TEMPLATE-SPAN-ITEM-P"));

    private static final SubLSymbol TEMPLATE_SPAN_ITEM_TEMPLATE_ITEM = makeSymbol("TEMPLATE-SPAN-ITEM-TEMPLATE-ITEM");

    private static final SubLSymbol _CSETF_TEMPLATE_SPAN_ITEM_TEMPLATE_ITEM = makeSymbol("_CSETF-TEMPLATE-SPAN-ITEM-TEMPLATE-ITEM");

    private static final SubLSymbol TEMPLATE_SPAN_ITEM_START = makeSymbol("TEMPLATE-SPAN-ITEM-START");

    private static final SubLSymbol _CSETF_TEMPLATE_SPAN_ITEM_START = makeSymbol("_CSETF-TEMPLATE-SPAN-ITEM-START");

    private static final SubLSymbol TEMPLATE_SPAN_ITEM_END = makeSymbol("TEMPLATE-SPAN-ITEM-END");

    private static final SubLSymbol _CSETF_TEMPLATE_SPAN_ITEM_END = makeSymbol("_CSETF-TEMPLATE-SPAN-ITEM-END");

    private static final SubLSymbol MAKE_TEMPLATE_SPAN_ITEM = makeSymbol("MAKE-TEMPLATE-SPAN-ITEM");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TEMPLATE_SPAN_ITEM_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TEMPLATE-SPAN-ITEM-METHOD");

    private static final SubLString $str85$__S__S__S_ = makeString("<~S ~S ~S>");



    private static final SubLSymbol EXPAND_WORD_ITEMS_IN_LIST = makeSymbol("EXPAND-WORD-ITEMS-IN-LIST");

    private static final SubLString $$$_ = makeString(" ");



    private static final SubLString $str92$Left_recursive_template___S__ = makeString("Left-recursive template~%~S~%");

    private static final SubLSymbol DENOTATIONS_OF_CONSTANT = makeSymbol("DENOTATIONS-OF-CONSTANT");

    static private final SubLList $list94 = list(makeKeyword("ABBREVS"), makeKeyword("ACRONYMS"));

    private static final SubLSymbol $denotations_of_constant_caching_state$ = makeSymbol("*DENOTATIONS-OF-CONSTANT-CACHING-STATE*");

    private static final SubLInteger $int$1024 = makeInteger(1024);

    private static final SubLSymbol ALL_PHRASES_FILTER_FROM_TERM_PHRASES_CONSTRAINT = makeSymbol("ALL-PHRASES-FILTER-FROM-TERM-PHRASES-CONSTRAINT");

    private static final SubLObject $const100$CollectionLexificationPredicate_R = reader_make_constant_shell("CollectionLexificationPredicate-Required");

    private static final SubLSymbol $all_phrases_filter_from_term_phrases_constraint_caching_state$ = makeSymbol("*ALL-PHRASES-FILTER-FROM-TERM-PHRASES-CONSTRAINT-CACHING-STATE*");

    private static final SubLInteger $int$200 = makeInteger(200);

    static private final SubLList $list103 = list(reader_make_constant_shell("RequireOne"));

    private static final SubLList $list104 = list(reader_make_constant_shell("WordSequence"));



    private static final SubLSymbol $sym106$_FULL_WORD = makeSymbol("?FULL-WORD");

    private static final SubLSymbol $sym107$_FORM = makeSymbol("?FORM");



    private static final SubLList $list109 = list(makeSymbol("?FORM"));

    private static final SubLSymbol $sym110$_WORD = makeSymbol("?WORD");



    private static final SubLList $list112 = list(reader_make_constant_shell("Modal-Contracted"), reader_make_constant_shell("Verb-Contracted"));

    public static final SubLSymbol $rtp_rules$ = makeSymbol("*RTP-RULES*");

    private static final SubLInteger $int$500 = makeInteger(500);

    private static final SubLSymbol $template_rules_master_index$ = makeSymbol("*TEMPLATE-RULES-MASTER-INDEX*");

    private static final SubLSymbol CATEGORIZED_TEMPLATE_RULE_SET = makeSymbol("CATEGORIZED-TEMPLATE-RULE-SET");

    private static final SubLSymbol CATEGORIZED_TEMPLATE_RULE_SET_P = makeSymbol("CATEGORIZED-TEMPLATE-RULE-SET-P");

    private static final SubLList $list124 = list(makeSymbol("MENTIONS"), makeSymbol("GENERIC"), makeSymbol("KEY-TERMINAL"));

    private static final SubLList $list125 = list(makeKeyword("MENTIONS"), makeKeyword("GENERIC"), makeKeyword("KEY-TERMINAL"));

    private static final SubLList $list126 = list(makeSymbol("CATEGORIZED-TEMPLATE-RULE-SET-MENTIONS"), makeSymbol("CATEGORIZED-TEMPLATE-RULE-SET-GENERIC"), makeSymbol("CATEGORIZED-TEMPLATE-RULE-SET-KEY-TERMINAL"));

    private static final SubLList $list127 = list(makeSymbol("_CSETF-CATEGORIZED-TEMPLATE-RULE-SET-MENTIONS"), makeSymbol("_CSETF-CATEGORIZED-TEMPLATE-RULE-SET-GENERIC"), makeSymbol("_CSETF-CATEGORIZED-TEMPLATE-RULE-SET-KEY-TERMINAL"));

    private static final SubLSymbol CATEGORIZED_TEMPLATE_RULE_SET_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CATEGORIZED-TEMPLATE-RULE-SET-PRINT-FUNCTION-TRAMPOLINE");

    static private final SubLList $list130 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CATEGORIZED-TEMPLATE-RULE-SET-P"));

    private static final SubLSymbol CATEGORIZED_TEMPLATE_RULE_SET_MENTIONS = makeSymbol("CATEGORIZED-TEMPLATE-RULE-SET-MENTIONS");

    private static final SubLSymbol _CSETF_CATEGORIZED_TEMPLATE_RULE_SET_MENTIONS = makeSymbol("_CSETF-CATEGORIZED-TEMPLATE-RULE-SET-MENTIONS");

    private static final SubLSymbol CATEGORIZED_TEMPLATE_RULE_SET_GENERIC = makeSymbol("CATEGORIZED-TEMPLATE-RULE-SET-GENERIC");

    private static final SubLSymbol _CSETF_CATEGORIZED_TEMPLATE_RULE_SET_GENERIC = makeSymbol("_CSETF-CATEGORIZED-TEMPLATE-RULE-SET-GENERIC");

    private static final SubLSymbol CATEGORIZED_TEMPLATE_RULE_SET_KEY_TERMINAL = makeSymbol("CATEGORIZED-TEMPLATE-RULE-SET-KEY-TERMINAL");

    private static final SubLSymbol _CSETF_CATEGORIZED_TEMPLATE_RULE_SET_KEY_TERMINAL = makeSymbol("_CSETF-CATEGORIZED-TEMPLATE-RULE-SET-KEY-TERMINAL");

    private static final SubLSymbol MAKE_CATEGORIZED_TEMPLATE_RULE_SET = makeSymbol("MAKE-CATEGORIZED-TEMPLATE-RULE-SET");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CATEGORIZED_TEMPLATE_RULE_SET_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CATEGORIZED-TEMPLATE-RULE-SET-METHOD");

    private static final SubLList $list142 = list(list(makeSymbol("TP-RULE-VAR"), makeSymbol("MT"), makeSymbol("CATEGORY"), makeSymbol("TERMINAL")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym143$CURRENT_MT = makeUninternedSymbol("CURRENT-MT");

    private static final SubLSymbol $sym144$CURRENT_RULE = makeUninternedSymbol("CURRENT-RULE");

    private static final SubLSymbol $sym145$MENTIONS = makeUninternedSymbol("MENTIONS");

    private static final SubLSymbol $sym146$TEMPLATES = makeUninternedSymbol("TEMPLATES");

    private static final SubLSymbol RELEVANT_TEMPLATE_MTS = makeSymbol("RELEVANT-TEMPLATE-MTS");

    private static final SubLSymbol GET_CATEGORIZED_TEMPLATE_RULE_SET = makeSymbol("GET-CATEGORIZED-TEMPLATE-RULE-SET");

    private static final SubLSymbol DO_DICTIONARY_KEYS = makeSymbol("DO-DICTIONARY-KEYS");

    private static final SubLList $list156 = list(list(makeSymbol("*ASSUME-EMPTY-ASSOCIATIVE-MEMORY?*"), T));

    private static final SubLSymbol $relevant_template_mts_caching_state$ = makeSymbol("*RELEVANT-TEMPLATE-MTS-CACHING-STATE*");

    private static final SubLInteger $int$128 = makeInteger(128);

    private static final SubLSymbol CLEAR_RELEVANT_TEMPLATE_MTS = makeSymbol("CLEAR-RELEVANT-TEMPLATE-MTS");

    private static final SubLSymbol $template_mts$ = makeSymbol("*TEMPLATE-MTS*");



    private static final SubLSymbol $sym162$STRING_ = makeSymbol("STRING<");





    private static final SubLList $list165 = cons(makeSymbol("TEMPLATE-PRED"), makeSymbol("TEMPLATE-CATEGORIES"));

    private static final SubLString $str166$Gathering_Template_Parsing_Assert = makeString("Gathering Template Parsing Assertions from ");

    private static final SubLString $str167$_mts__ = makeString(" mts (");

    private static final SubLString $str168$_total_ = makeString(" total)");









    private static final SubLString $str174$Assertion__D_specifies_a_left_rec = makeString("Assertion ~D specifies a left-recursive template~% ~S~%");



    private static final SubLObject $$NLPattern_Word = reader_make_constant_shell("NLPattern-Word");

    private static final SubLObject $$NLPattern_Template = reader_make_constant_shell("NLPattern-Template");



    private static final SubLObject $$NLPattern_Term_Optional = reader_make_constant_shell("NLPattern-Term-Optional");



    private static final SubLObject $$NLPattern_Exact = reader_make_constant_shell("NLPattern-Exact");

    static private final SubLList $list183 = list(reader_make_constant_shell("NLPattern-Agr"), reader_make_constant_shell("NLPattern-POS"));

    private static final SubLObject $const184$TemplateParsingSyntacticConstrain = reader_make_constant_shell("TemplateParsingSyntacticConstraint");

    private static final SubLString $str185$Strange_template_assertion__S_wit = makeString("Strange template assertion ~S with argument ~S ignored.~%");

    private static final SubLSymbol ADD_TEMPLATE_ASSERTION = makeSymbol("ADD-TEMPLATE-ASSERTION");

    private static final SubLSymbol REMOVE_TEMPLATE_ASSERTION = makeSymbol("REMOVE-TEMPLATE-ASSERTION");

    private static final SubLSymbol $ASSERTED_TRUE_DEF = makeKeyword("ASSERTED-TRUE-DEF");

    private static final SubLSymbol $ASSERTED_TRUE_MON = makeKeyword("ASSERTED-TRUE-MON");

    private static final SubLSymbol RTP_CHART_ENTRY = makeSymbol("RTP-CHART-ENTRY");

    private static final SubLSymbol RTP_CHART_ENTRY_P = makeSymbol("RTP-CHART-ENTRY-P");

    private static final SubLList $list192 = list(makeSymbol("START"), makeSymbol("END"), makeSymbol("RULE"), makeSymbol("TEMPLATE-INDEX"), makeSymbol("WORDS"), makeSymbol("BINDINGS"), makeSymbol("SUBCONSTITS"), makeSymbol("SEM"));

    private static final SubLList $list193 = list(makeKeyword("START"), makeKeyword("END"), $RULE, makeKeyword("TEMPLATE-INDEX"), makeKeyword("WORDS"), makeKeyword("BINDINGS"), makeKeyword("SUBCONSTITS"), makeKeyword("SEM"));

    private static final SubLList $list194 = list(makeSymbol("RTP-CHART-ENTRY-START"), makeSymbol("RTP-CHART-ENTRY-END"), makeSymbol("RTP-CHART-ENTRY-RULE"), makeSymbol("RTP-CHART-ENTRY-TEMPLATE-INDEX"), makeSymbol("RTP-CHART-ENTRY-WORDS"), makeSymbol("RTP-CHART-ENTRY-BINDINGS"), makeSymbol("RTP-CHART-ENTRY-SUBCONSTITS"), makeSymbol("RTP-CHART-ENTRY-SEM"));

    private static final SubLList $list195 = list(makeSymbol("_CSETF-RTP-CHART-ENTRY-START"), makeSymbol("_CSETF-RTP-CHART-ENTRY-END"), makeSymbol("_CSETF-RTP-CHART-ENTRY-RULE"), makeSymbol("_CSETF-RTP-CHART-ENTRY-TEMPLATE-INDEX"), makeSymbol("_CSETF-RTP-CHART-ENTRY-WORDS"), makeSymbol("_CSETF-RTP-CHART-ENTRY-BINDINGS"), makeSymbol("_CSETF-RTP-CHART-ENTRY-SUBCONSTITS"), makeSymbol("_CSETF-RTP-CHART-ENTRY-SEM"));

    private static final SubLSymbol RTP_ENTRY_PRINT = makeSymbol("RTP-ENTRY-PRINT");

    private static final SubLSymbol RTP_CHART_ENTRY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RTP-CHART-ENTRY-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list198 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RTP-CHART-ENTRY-P"));

    private static final SubLSymbol RTP_CHART_ENTRY_START = makeSymbol("RTP-CHART-ENTRY-START");

    private static final SubLSymbol _CSETF_RTP_CHART_ENTRY_START = makeSymbol("_CSETF-RTP-CHART-ENTRY-START");

    private static final SubLSymbol RTP_CHART_ENTRY_END = makeSymbol("RTP-CHART-ENTRY-END");

    private static final SubLSymbol _CSETF_RTP_CHART_ENTRY_END = makeSymbol("_CSETF-RTP-CHART-ENTRY-END");

    private static final SubLSymbol RTP_CHART_ENTRY_RULE = makeSymbol("RTP-CHART-ENTRY-RULE");

    private static final SubLSymbol _CSETF_RTP_CHART_ENTRY_RULE = makeSymbol("_CSETF-RTP-CHART-ENTRY-RULE");

    private static final SubLSymbol RTP_CHART_ENTRY_TEMPLATE_INDEX = makeSymbol("RTP-CHART-ENTRY-TEMPLATE-INDEX");

    private static final SubLSymbol _CSETF_RTP_CHART_ENTRY_TEMPLATE_INDEX = makeSymbol("_CSETF-RTP-CHART-ENTRY-TEMPLATE-INDEX");

    private static final SubLSymbol RTP_CHART_ENTRY_WORDS = makeSymbol("RTP-CHART-ENTRY-WORDS");

    private static final SubLSymbol _CSETF_RTP_CHART_ENTRY_WORDS = makeSymbol("_CSETF-RTP-CHART-ENTRY-WORDS");

    private static final SubLSymbol RTP_CHART_ENTRY_BINDINGS = makeSymbol("RTP-CHART-ENTRY-BINDINGS");

    private static final SubLSymbol _CSETF_RTP_CHART_ENTRY_BINDINGS = makeSymbol("_CSETF-RTP-CHART-ENTRY-BINDINGS");

    private static final SubLSymbol RTP_CHART_ENTRY_SUBCONSTITS = makeSymbol("RTP-CHART-ENTRY-SUBCONSTITS");

    private static final SubLSymbol _CSETF_RTP_CHART_ENTRY_SUBCONSTITS = makeSymbol("_CSETF-RTP-CHART-ENTRY-SUBCONSTITS");

    private static final SubLSymbol RTP_CHART_ENTRY_SEM = makeSymbol("RTP-CHART-ENTRY-SEM");

    private static final SubLSymbol _CSETF_RTP_CHART_ENTRY_SEM = makeSymbol("_CSETF-RTP-CHART-ENTRY-SEM");

    private static final SubLSymbol MAKE_RTP_CHART_ENTRY = makeSymbol("MAKE-RTP-CHART-ENTRY");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RTP_CHART_ENTRY_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RTP-CHART-ENTRY-METHOD");

    private static final SubLString $str223$__RTP_entry______Words__S_____Sem = makeString("#<RTP-entry: ~%  Words=~S ~%  Sem=~S~%   Bindings=~S~%   Subconstits=~S~%  Template=~S~%  Template-index=~S~%  Start=~A~% :RTP-Entry>");



    private static final SubLSymbol SUBCONSTIT = makeSymbol("SUBCONSTIT");

    private static final SubLSymbol SUBCONSTIT_P = makeSymbol("SUBCONSTIT-P");

    private static final SubLList $list227 = list(makeSymbol("CAT"), makeSymbol("STRING"), makeSymbol("BINDING-VAR"), makeSymbol("START"), makeSymbol("END"), makeSymbol("SEM-TEST"));

    private static final SubLList $list228 = list(makeKeyword("CAT"), makeKeyword("STRING"), makeKeyword("BINDING-VAR"), makeKeyword("START"), makeKeyword("END"), makeKeyword("SEM-TEST"));

    private static final SubLList $list229 = list(makeSymbol("SUBCONSTIT-CAT"), makeSymbol("SUBCONSTIT-STRING"), makeSymbol("SUBCONSTIT-BINDING-VAR"), makeSymbol("SUBCONSTIT-START"), makeSymbol("SUBCONSTIT-END"), makeSymbol("SUBCONSTIT-SEM-TEST"));

    private static final SubLList $list230 = list(makeSymbol("_CSETF-SUBCONSTIT-CAT"), makeSymbol("_CSETF-SUBCONSTIT-STRING"), makeSymbol("_CSETF-SUBCONSTIT-BINDING-VAR"), makeSymbol("_CSETF-SUBCONSTIT-START"), makeSymbol("_CSETF-SUBCONSTIT-END"), makeSymbol("_CSETF-SUBCONSTIT-SEM-TEST"));

    private static final SubLSymbol PRINT_SUBCONSTIT = makeSymbol("PRINT-SUBCONSTIT");

    private static final SubLSymbol SUBCONSTIT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SUBCONSTIT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list233 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SUBCONSTIT-P"));

    private static final SubLSymbol SUBCONSTIT_CAT = makeSymbol("SUBCONSTIT-CAT");

    private static final SubLSymbol _CSETF_SUBCONSTIT_CAT = makeSymbol("_CSETF-SUBCONSTIT-CAT");

    private static final SubLSymbol SUBCONSTIT_STRING = makeSymbol("SUBCONSTIT-STRING");

    private static final SubLSymbol _CSETF_SUBCONSTIT_STRING = makeSymbol("_CSETF-SUBCONSTIT-STRING");

    private static final SubLSymbol SUBCONSTIT_BINDING_VAR = makeSymbol("SUBCONSTIT-BINDING-VAR");

    private static final SubLSymbol _CSETF_SUBCONSTIT_BINDING_VAR = makeSymbol("_CSETF-SUBCONSTIT-BINDING-VAR");

    private static final SubLSymbol SUBCONSTIT_START = makeSymbol("SUBCONSTIT-START");

    private static final SubLSymbol _CSETF_SUBCONSTIT_START = makeSymbol("_CSETF-SUBCONSTIT-START");

    private static final SubLSymbol SUBCONSTIT_END = makeSymbol("SUBCONSTIT-END");

    private static final SubLSymbol _CSETF_SUBCONSTIT_END = makeSymbol("_CSETF-SUBCONSTIT-END");

    private static final SubLSymbol SUBCONSTIT_SEM_TEST = makeSymbol("SUBCONSTIT-SEM-TEST");

    private static final SubLSymbol _CSETF_SUBCONSTIT_SEM_TEST = makeSymbol("_CSETF-SUBCONSTIT-SEM-TEST");

    private static final SubLSymbol MAKE_SUBCONSTIT = makeSymbol("MAKE-SUBCONSTIT");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SUBCONSTIT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SUBCONSTIT-METHOD");

    private static final SubLString $str251$__Subconst__S_of_cat__S_ = makeString("<#Subconst ~S of cat ~S>");

    private static final SubLList $list252 = list(reader_make_constant_shell("TheSetOf"), makeSymbol("?X"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Thing")));







    public static final SubLObject add_template_meta_marker_alt(SubLObject marker, SubLObject definition) {
        SubLTrampolineFile.checkType(marker, FORT_P);
        SubLTrampolineFile.checkType(definition, STRINGP);
        dictionary.dictionary_enter($template_meta_marker_mappings$.getGlobalValue(), marker, definition);
        return marker;
    }

    public static SubLObject add_template_meta_marker(final SubLObject marker, final SubLObject definition) {
        assert NIL != forts.fort_p(marker) : "! forts.fort_p(marker) " + ("forts.fort_p(marker) " + "CommonSymbols.NIL != forts.fort_p(marker) ") + marker;
        assert NIL != stringp(definition) : "! stringp(definition) " + ("Types.stringp(definition) " + "CommonSymbols.NIL != Types.stringp(definition) ") + definition;
        dictionary_enter(rtp_datastructures.$template_meta_marker_mappings$.getGlobalValue(), marker, definition);
        return marker;
    }

    public static final SubLObject map_template_meta_marker_alt(SubLObject marker) {
        return dictionary.dictionary_lookup($template_meta_marker_mappings$.getGlobalValue(), marker, UNPROVIDED);
    }

    public static SubLObject map_template_meta_marker(final SubLObject marker) {
        return dictionary_lookup(rtp_datastructures.$template_meta_marker_mappings$.getGlobalValue(), marker, UNPROVIDED);
    }

    public static final SubLObject interpret_template_meta_marker_assertion_alt(SubLObject assertion) {
        {
            SubLObject predicate = com.cyc.cycjava.cycl.rtp.rtp_datastructures.assertion_arg(ZERO_INTEGER, assertion);
            SubLObject mt = assertions_high.assertion_mt(assertion);
            if (NIL != genl_predicates.genl_predP(predicate, $template_meta_marker_predicate$.getGlobalValue(), mt, UNPROVIDED)) {
                {
                    SubLObject marker = com.cyc.cycjava.cycl.rtp.rtp_datastructures.assertion_arg(ONE_INTEGER, assertion);
                    SubLObject definition = com.cyc.cycjava.cycl.rtp.rtp_datastructures.assertion_arg(TWO_INTEGER, assertion);
                    com.cyc.cycjava.cycl.rtp.rtp_datastructures.add_template_meta_marker(marker, definition);
                }
            }
            return assertion;
        }
    }

    public static SubLObject interpret_template_meta_marker_assertion(final SubLObject assertion) {
        final SubLObject predicate = gaf_arg0(assertion);
        final SubLObject mt = assertion_mt(assertion);
        if (NIL != genl_predP(predicate, rtp_datastructures.$template_meta_marker_predicate$.getGlobalValue(), mt, UNPROVIDED)) {
            final SubLObject marker = gaf_arg1(assertion);
            final SubLObject definition = gaf_arg2(assertion);
            rtp_datastructures.add_template_meta_marker(marker, definition);
        }
        return assertion;
    }

    public static final SubLObject populate_meta_markers_from_mt_alt(SubLObject mt, SubLObject extend) {
        if (extend == UNPROVIDED) {
            extend = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == extend) {
                dictionary.clear_dictionary($template_meta_marker_mappings$.getGlobalValue());
            }
            {
                SubLObject predicate = $template_meta_marker_predicate$.getGlobalValue();
                SubLObject stop = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        {
                            SubLObject pred_var = predicate;
                            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                    SubLObject done_var = stop;
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
                                                            SubLObject done_var_1 = stop;
                                                            SubLObject token_var_2 = NIL;
                                                            while (NIL == done_var_1) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                                                    SubLObject valid_3 = makeBoolean(token_var_2 != assertion);
                                                                    if (NIL != valid_3) {
                                                                        com.cyc.cycjava.cycl.rtp.rtp_datastructures.interpret_template_meta_marker_assertion(assertion);
                                                                    }
                                                                    done_var_1 = makeBoolean((NIL == valid_3) || (NIL != stop));
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
                                            done_var = makeBoolean((NIL == valid) || (NIL != stop));
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
            return mt;
        }
    }

    public static SubLObject populate_meta_markers_from_mt(final SubLObject mt, SubLObject extend) {
        if (extend == UNPROVIDED) {
            extend = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == extend) {
            clear_dictionary(rtp_datastructures.$template_meta_marker_mappings$.getGlobalValue());
        }
        final SubLObject predicate = rtp_datastructures.$template_meta_marker_predicate$.getGlobalValue();
        final SubLObject stop = NIL;
        final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
        try {
            $relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
            $mt$.bind(mt, thread);
            final SubLObject pred_var = predicate;
            if (NIL != do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$1 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$2 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
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
                    final SubLObject iterator_var = new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = stop;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            note_progress();
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$3 = stop;
                                final SubLObject token_var_$4 = NIL;
                                while (NIL == done_var_$3) {
                                    final SubLObject assertion = iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                    final SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(assertion));
                                    if (NIL != valid_$5) {
                                        rtp_datastructures.interpret_template_meta_marker_assertion(assertion);
                                    }
                                    done_var_$3 = makeBoolean((NIL == valid_$5) || (NIL != stop));
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                                }
                            }
                        }
                        done_var = makeBoolean((NIL == valid) || (NIL != stop));
                    } 
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$2, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$1, thread);
                }
            }
        } finally {
            $mt$.rebind(_prev_bind_2, thread);
            $relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return mt;
    }

    /**
     * Replace the sentential meta markers in the template with the
     * appropriate forms.
     */
    @LispMethod(comment = "Replace the sentential meta markers in the template with the\r\nappropriate forms.\nReplace the sentential meta markers in the template with the\nappropriate forms.")
    public static final SubLObject transform_meta_markers_in_template_expression_alt(SubLObject template) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($template_meta_marker_mappings$.getGlobalValue()));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject marker = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject definition = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        template = nsubst(definition, marker, template, UNPROVIDED, UNPROVIDED);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return template;
        }
    }

    /**
     * Replace the sentential meta markers in the template with the
     * appropriate forms.
     */
    @LispMethod(comment = "Replace the sentential meta markers in the template with the\r\nappropriate forms.\nReplace the sentential meta markers in the template with the\nappropriate forms.")
    public static SubLObject transform_meta_markers_in_template_expression(SubLObject template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = do_dictionary_contents_state(dictionary_contents(rtp_datastructures.$template_meta_marker_mappings$.getGlobalValue())); NIL == do_dictionary_contents_doneP(iteration_state); iteration_state = do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject marker = do_dictionary_contents_key_value(iteration_state);
            final SubLObject definition = thread.secondMultipleValue();
            thread.resetMultipleValues();
            template = nsubst(definition, marker, template, UNPROVIDED, UNPROVIDED);
        }
        do_dictionary_contents_finalize(iteration_state);
        return template;
    }

    public static final SubLObject map_template_category_fill_words_alt(SubLObject category) {
        return dictionary.dictionary_lookup($template_category_fill_words$.getGlobalValue(), category, UNPROVIDED);
    }

    public static SubLObject map_template_category_fill_words(final SubLObject category) {
        return dictionary_lookup(rtp_datastructures.$template_category_fill_words$.getGlobalValue(), category, UNPROVIDED);
    }

    public static final SubLObject add_template_category_fill_word_alt(SubLObject category, SubLObject word) {
        {
            SubLObject words = com.cyc.cycjava.cycl.rtp.rtp_datastructures.map_template_category_fill_words(category);
            SubLObject item_var = word;
            if (NIL == member(item_var, words, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                words = cons(item_var, words);
            }
            dictionary.dictionary_enter($template_category_fill_words$.getGlobalValue(), category, words);
        }
        return category;
    }

    public static SubLObject add_template_category_fill_word(final SubLObject category, final SubLObject word) {
        SubLObject words = rtp_datastructures.map_template_category_fill_words(category);
        if (NIL == member(word, words, symbol_function(EQUALP), symbol_function(IDENTITY))) {
            words = cons(word, words);
        }
        dictionary_enter(rtp_datastructures.$template_category_fill_words$.getGlobalValue(), category, words);
        return category;
    }

    public static final SubLObject interpret_template_category_fill_word_assertion_alt(SubLObject assertion) {
        {
            SubLObject predicate = com.cyc.cycjava.cycl.rtp.rtp_datastructures.assertion_arg(ZERO_INTEGER, assertion);
            SubLObject mt = assertions_high.assertion_mt(assertion);
            if (NIL != genl_predicates.genl_predP(predicate, $template_category_fill_word_predicate$.getGlobalValue(), mt, UNPROVIDED)) {
                {
                    SubLObject category = com.cyc.cycjava.cycl.rtp.rtp_datastructures.assertion_arg(ONE_INTEGER, assertion);
                    SubLObject word = com.cyc.cycjava.cycl.rtp.rtp_datastructures.assertion_arg(TWO_INTEGER, assertion);
                    com.cyc.cycjava.cycl.rtp.rtp_datastructures.add_template_category_fill_word(category, word);
                }
            }
        }
        return assertion;
    }

    public static SubLObject interpret_template_category_fill_word_assertion(final SubLObject assertion) {
        final SubLObject predicate = gaf_arg0(assertion);
        final SubLObject mt = assertion_mt(assertion);
        if (NIL != genl_predP(predicate, rtp_datastructures.$template_category_fill_word_predicate$.getGlobalValue(), mt, UNPROVIDED)) {
            final SubLObject category = gaf_arg1(assertion);
            final SubLObject word = gaf_arg2(assertion);
            rtp_datastructures.add_template_category_fill_word(category, word);
        }
        return assertion;
    }

    public static final SubLObject populate_template_category_fill_words_from_mt_alt(SubLObject mt, SubLObject extend) {
        if (extend == UNPROVIDED) {
            extend = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == extend) {
                dictionary.clear_dictionary($template_category_fill_words$.getGlobalValue());
            }
            {
                SubLObject predicate = $template_category_fill_word_predicate$.getGlobalValue();
                SubLObject stop = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        {
                            SubLObject pred_var = predicate;
                            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                    SubLObject done_var = stop;
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
                                                            SubLObject done_var_5 = stop;
                                                            SubLObject token_var_6 = NIL;
                                                            while (NIL == done_var_5) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_6);
                                                                    SubLObject valid_7 = makeBoolean(token_var_6 != assertion);
                                                                    if (NIL != valid_7) {
                                                                        com.cyc.cycjava.cycl.rtp.rtp_datastructures.interpret_template_category_fill_word_assertion(assertion);
                                                                    }
                                                                    done_var_5 = makeBoolean((NIL == valid_7) || (NIL != stop));
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_8, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean((NIL == valid) || (NIL != stop));
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
            return mt;
        }
    }

    public static SubLObject populate_template_category_fill_words_from_mt(final SubLObject mt, SubLObject extend) {
        if (extend == UNPROVIDED) {
            extend = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == extend) {
            clear_dictionary(rtp_datastructures.$template_category_fill_words$.getGlobalValue());
        }
        final SubLObject predicate = rtp_datastructures.$template_category_fill_word_predicate$.getGlobalValue();
        final SubLObject stop = NIL;
        final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
        try {
            $relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
            $mt$.bind(mt, thread);
            final SubLObject pred_var = predicate;
            if (NIL != do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$7 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$8 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
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
                    final SubLObject iterator_var = new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = stop;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            note_progress();
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$9 = stop;
                                final SubLObject token_var_$10 = NIL;
                                while (NIL == done_var_$9) {
                                    final SubLObject assertion = iteration_next_without_values_macro_helper(final_index_iterator, token_var_$10);
                                    final SubLObject valid_$11 = makeBoolean(!token_var_$10.eql(assertion));
                                    if (NIL != valid_$11) {
                                        rtp_datastructures.interpret_template_category_fill_word_assertion(assertion);
                                    }
                                    done_var_$9 = makeBoolean((NIL == valid_$11) || (NIL != stop));
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                                }
                            }
                        }
                        done_var = makeBoolean((NIL == valid) || (NIL != stop));
                    } 
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$8, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$7, thread);
                }
            }
        } finally {
            $mt$.rebind(_prev_bind_2, thread);
            $relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return mt;
    }

    public static final SubLObject clear_make_optional_word_list_alt() {
        {
            SubLObject cs = $make_optional_word_list_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_make_optional_word_list() {
        final SubLObject cs = rtp_datastructures.$make_optional_word_list_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_make_optional_word_list_alt(SubLObject words) {
        return memoization_state.caching_state_remove_function_results_with_args($make_optional_word_list_caching_state$.getGlobalValue(), list(words), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_make_optional_word_list(final SubLObject words) {
        return caching_state_remove_function_results_with_args(rtp_datastructures.$make_optional_word_list_caching_state$.getGlobalValue(), list(words), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject make_optional_word_list_internal_alt(SubLObject words) {
        return cons($$OptionalSome, words);
    }

    public static SubLObject make_optional_word_list_internal(final SubLObject words) {
        return cons(rtp_datastructures.$$OptionalSome, words);
    }

    public static final SubLObject make_optional_word_list_alt(SubLObject words) {
        {
            SubLObject caching_state = $make_optional_word_list_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(MAKE_OPTIONAL_WORD_LIST, $make_optional_word_list_caching_state$, NIL, EQUALP, ONE_INTEGER, TEN_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, words, $kw11$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw11$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rtp.rtp_datastructures.make_optional_word_list_internal(words)));
                    memoization_state.caching_state_put(caching_state, words, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject make_optional_word_list(final SubLObject words) {
        SubLObject caching_state = rtp_datastructures.$make_optional_word_list_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(rtp_datastructures.MAKE_OPTIONAL_WORD_LIST, rtp_datastructures.$make_optional_word_list_caching_state$, $int$64, EQUALP, ONE_INTEGER, TEN_INTEGER);
        }
        SubLObject results = caching_state_lookup(caching_state, words, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(rtp_datastructures.make_optional_word_list_internal(words)));
            caching_state_put(caching_state, words, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    /**
     * Given a template and its category, find all the fill words supported
     * by this category and add them between the terminals of the template.
     * Ensure that nothing becomes optional that is actually required in the
     * template.
     */
    @LispMethod(comment = "Given a template and its category, find all the fill words supported\r\nby this category and add them between the terminals of the template.\r\nEnsure that nothing becomes optional that is actually required in the\r\ntemplate.\nGiven a template and its category, find all the fill words supported\nby this category and add them between the terminals of the template.\nEnsure that nothing becomes optional that is actually required in the\ntemplate.")
    public static final SubLObject add_category_fill_words_to_template_alt(SubLObject template, SubLObject category) {
        {
            SubLObject words = com.cyc.cycjava.cycl.rtp.rtp_datastructures.map_template_category_fill_words(category);
            SubLObject expanded = template;
            SubLObject components = NIL;
            if (NIL != words) {
                {
                    SubLObject v_default = com.cyc.cycjava.cycl.rtp.rtp_datastructures.make_optional_word_list(words);
                    SubLObject adjusted_list = NIL;
                    SubLObject cdolist_list_var = expanded;
                    SubLObject item = NIL;
                    for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                        if ((NIL != rtp_type_checkers.rtp_rule_terminalP(item)) && (NIL != subl_promotions.memberP(item, words, symbol_function(EQUALP), UNPROVIDED))) {
                            {
                                SubLObject adjusted = delete(item, words, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                adjusted_list = com.cyc.cycjava.cycl.rtp.rtp_datastructures.make_optional_word_list(adjusted);
                            }
                        } else {
                            if ((NIL != rtp_type_checkers.rtp_require_one_itemP(item)) || (NIL != rtp_type_checkers.rtp_require_some_itemP(item))) {
                                {
                                    SubLObject required = com.cyc.cycjava.cycl.rtp.rtp_datastructures.extract_terminals_from_template(item);
                                    adjusted_list = NIL;
                                    {
                                        SubLObject cdolist_list_var_9 = words;
                                        SubLObject optional = NIL;
                                        for (optional = cdolist_list_var_9.first(); NIL != cdolist_list_var_9; cdolist_list_var_9 = cdolist_list_var_9.rest() , optional = cdolist_list_var_9.first()) {
                                            if (NIL == subl_promotions.memberP(optional, required, symbol_function(EQUALP), UNPROVIDED)) {
                                                adjusted_list = cons(optional, adjusted_list);
                                            }
                                        }
                                    }
                                }
                                adjusted_list = com.cyc.cycjava.cycl.rtp.rtp_datastructures.make_optional_word_list(adjusted_list);
                            } else {
                                adjusted_list = v_default;
                            }
                        }
                        components = cons(adjusted_list, components);
                        components = cons(item, components);
                    }
                    components = cons(adjusted_list, components);
                }
                expanded = nreverse(components);
            }
            return expanded;
        }
    }

    /**
     * Given a template and its category, find all the fill words supported
     * by this category and add them between the terminals of the template.
     * Ensure that nothing becomes optional that is actually required in the
     * template.
     */
    @LispMethod(comment = "Given a template and its category, find all the fill words supported\r\nby this category and add them between the terminals of the template.\r\nEnsure that nothing becomes optional that is actually required in the\r\ntemplate.\nGiven a template and its category, find all the fill words supported\nby this category and add them between the terminals of the template.\nEnsure that nothing becomes optional that is actually required in the\ntemplate.")
    public static SubLObject add_category_fill_words_to_template(final SubLObject template, final SubLObject category) {
        final SubLObject words = rtp_datastructures.map_template_category_fill_words(category);
        SubLObject expanded = template;
        SubLObject components = NIL;
        if (NIL != words) {
            final SubLObject v_default = rtp_datastructures.make_optional_word_list(words);
            SubLObject adjusted_list = NIL;
            SubLObject cdolist_list_var = expanded;
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL != rtp_type_checkers.rtp_rule_terminalP(item)) && (NIL != memberP(item, words, symbol_function(EQUALP), UNPROVIDED))) {
                    final SubLObject adjusted = delete(item, words, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    adjusted_list = rtp_datastructures.make_optional_word_list(adjusted);
                } else
                    if ((NIL != rtp_type_checkers.rtp_require_one_itemP(item)) || (NIL != rtp_type_checkers.rtp_require_some_itemP(item))) {
                        final SubLObject required = rtp_datastructures.extract_terminals_from_template(item);
                        adjusted_list = NIL;
                        SubLObject cdolist_list_var_$13 = words;
                        SubLObject optional = NIL;
                        optional = cdolist_list_var_$13.first();
                        while (NIL != cdolist_list_var_$13) {
                            if (NIL == memberP(optional, required, symbol_function(EQUALP), UNPROVIDED)) {
                                adjusted_list = cons(optional, adjusted_list);
                            }
                            cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                            optional = cdolist_list_var_$13.first();
                        } 
                        adjusted_list = rtp_datastructures.make_optional_word_list(adjusted_list);
                    } else {
                        adjusted_list = v_default;
                    }

                components = cons(adjusted_list, components);
                components = cons(item, components);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
            components = cons(adjusted_list, components);
            expanded = nreverse(components);
        }
        return expanded;
    }

    public static final SubLObject template_rule_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.rtp.rtp_datastructures.print_template_rule(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject template_rule_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        rtp_datastructures.print_template_rule(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject template_rule_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rtp.rtp_datastructures.$template_rule_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject template_rule_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rtp.rtp_datastructures.$template_rule_native.class ? T : NIL;
    }

    public static final SubLObject template_rule_category_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TEMPLATE_RULE_P);
        return v_object.getField2();
    }

    public static SubLObject template_rule_category(final SubLObject v_object) {
        assert NIL != rtp_datastructures.template_rule_p(v_object) : "! rtp_datastructures.template_rule_p(v_object) " + "rtp_datastructures.template_rule_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject template_rule_template_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TEMPLATE_RULE_P);
        return v_object.getField3();
    }

    public static SubLObject template_rule_template(final SubLObject v_object) {
        assert NIL != rtp_datastructures.template_rule_p(v_object) : "! rtp_datastructures.template_rule_p(v_object) " + "rtp_datastructures.template_rule_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject template_rule_transformation_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TEMPLATE_RULE_P);
        return v_object.getField4();
    }

    public static SubLObject template_rule_transformation(final SubLObject v_object) {
        assert NIL != rtp_datastructures.template_rule_p(v_object) : "! rtp_datastructures.template_rule_p(v_object) " + "rtp_datastructures.template_rule_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject template_rule_sem_test_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TEMPLATE_RULE_P);
        return v_object.getField5();
    }

    public static SubLObject template_rule_sem_test(final SubLObject v_object) {
        assert NIL != rtp_datastructures.template_rule_p(v_object) : "! rtp_datastructures.template_rule_p(v_object) " + "rtp_datastructures.template_rule_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject template_rule_assertion_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TEMPLATE_RULE_P);
        return v_object.getField6();
    }

    public static SubLObject template_rule_assertion(final SubLObject v_object) {
        assert NIL != rtp_datastructures.template_rule_p(v_object) : "! rtp_datastructures.template_rule_p(v_object) " + "rtp_datastructures.template_rule_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject template_rule_terminals_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TEMPLATE_RULE_P);
        return v_object.getField7();
    }

    public static SubLObject template_rule_terminals(final SubLObject v_object) {
        assert NIL != rtp_datastructures.template_rule_p(v_object) : "! rtp_datastructures.template_rule_p(v_object) " + "rtp_datastructures.template_rule_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject template_rule_meaning_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TEMPLATE_RULE_P);
        return v_object.getField8();
    }

    public static SubLObject template_rule_meaning(final SubLObject v_object) {
        assert NIL != rtp_datastructures.template_rule_p(v_object) : "! rtp_datastructures.template_rule_p(v_object) " + "rtp_datastructures.template_rule_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject template_rule_constraints_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TEMPLATE_RULE_P);
        return v_object.getField9();
    }

    public static SubLObject template_rule_constraints(final SubLObject v_object) {
        assert NIL != rtp_datastructures.template_rule_p(v_object) : "! rtp_datastructures.template_rule_p(v_object) " + "rtp_datastructures.template_rule_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject template_rule_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TEMPLATE_RULE_P);
        return v_object.getField10();
    }

    public static SubLObject template_rule_id(final SubLObject v_object) {
        assert NIL != rtp_datastructures.template_rule_p(v_object) : "! rtp_datastructures.template_rule_p(v_object) " + "rtp_datastructures.template_rule_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject _csetf_template_rule_category_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TEMPLATE_RULE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_template_rule_category(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_datastructures.template_rule_p(v_object) : "! rtp_datastructures.template_rule_p(v_object) " + "rtp_datastructures.template_rule_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_template_rule_template_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TEMPLATE_RULE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_template_rule_template(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_datastructures.template_rule_p(v_object) : "! rtp_datastructures.template_rule_p(v_object) " + "rtp_datastructures.template_rule_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_template_rule_transformation_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TEMPLATE_RULE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_template_rule_transformation(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_datastructures.template_rule_p(v_object) : "! rtp_datastructures.template_rule_p(v_object) " + "rtp_datastructures.template_rule_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_template_rule_sem_test_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TEMPLATE_RULE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_template_rule_sem_test(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_datastructures.template_rule_p(v_object) : "! rtp_datastructures.template_rule_p(v_object) " + "rtp_datastructures.template_rule_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_template_rule_assertion_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TEMPLATE_RULE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_template_rule_assertion(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_datastructures.template_rule_p(v_object) : "! rtp_datastructures.template_rule_p(v_object) " + "rtp_datastructures.template_rule_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_template_rule_terminals_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TEMPLATE_RULE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_template_rule_terminals(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_datastructures.template_rule_p(v_object) : "! rtp_datastructures.template_rule_p(v_object) " + "rtp_datastructures.template_rule_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_template_rule_meaning_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TEMPLATE_RULE_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_template_rule_meaning(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_datastructures.template_rule_p(v_object) : "! rtp_datastructures.template_rule_p(v_object) " + "rtp_datastructures.template_rule_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_template_rule_constraints_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TEMPLATE_RULE_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_template_rule_constraints(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_datastructures.template_rule_p(v_object) : "! rtp_datastructures.template_rule_p(v_object) " + "rtp_datastructures.template_rule_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_template_rule_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TEMPLATE_RULE_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_template_rule_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_datastructures.template_rule_p(v_object) : "! rtp_datastructures.template_rule_p(v_object) " + "rtp_datastructures.template_rule_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject make_template_rule_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rtp.rtp_datastructures.$template_rule_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($CATEGORY)) {
                        com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_rule_category(v_new, current_value);
                    } else {
                        if (pcase_var.eql($TEMPLATE)) {
                            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_rule_template(v_new, current_value);
                        } else {
                            if (pcase_var.eql($TRANSFORMATION)) {
                                com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_rule_transformation(v_new, current_value);
                            } else {
                                if (pcase_var.eql($SEM_TEST)) {
                                    com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_rule_sem_test(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($ASSERTION)) {
                                        com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_rule_assertion(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($TERMINALS)) {
                                            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_rule_terminals(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($MEANING)) {
                                                com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_rule_meaning(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($CONSTRAINTS)) {
                                                    com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_rule_constraints(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($ID)) {
                                                        com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_rule_id(v_new, current_value);
                                                    } else {
                                                        Errors.error($str_alt47$Invalid_slot__S_for_construction_, current_arg);
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
            return v_new;
        }
    }

    public static SubLObject make_template_rule(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rtp.rtp_datastructures.$template_rule_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CATEGORY)) {
                rtp_datastructures._csetf_template_rule_category(v_new, current_value);
            } else
                if (pcase_var.eql($TEMPLATE)) {
                    rtp_datastructures._csetf_template_rule_template(v_new, current_value);
                } else
                    if (pcase_var.eql($TRANSFORMATION)) {
                        rtp_datastructures._csetf_template_rule_transformation(v_new, current_value);
                    } else
                        if (pcase_var.eql($SEM_TEST)) {
                            rtp_datastructures._csetf_template_rule_sem_test(v_new, current_value);
                        } else
                            if (pcase_var.eql($ASSERTION)) {
                                rtp_datastructures._csetf_template_rule_assertion(v_new, current_value);
                            } else
                                if (pcase_var.eql($TERMINALS)) {
                                    rtp_datastructures._csetf_template_rule_terminals(v_new, current_value);
                                } else
                                    if (pcase_var.eql($MEANING)) {
                                        rtp_datastructures._csetf_template_rule_meaning(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($CONSTRAINTS)) {
                                            rtp_datastructures._csetf_template_rule_constraints(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($ID)) {
                                                rtp_datastructures._csetf_template_rule_id(v_new, current_value);
                                            } else {
                                                Errors.error(rtp_datastructures.$str48$Invalid_slot__S_for_construction_, current_arg);
                                            }








        }
        return v_new;
    }

    public static SubLObject visit_defstruct_template_rule(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, rtp_datastructures.MAKE_TEMPLATE_RULE, NINE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CATEGORY, rtp_datastructures.template_rule_category(obj));
        funcall(visitor_fn, obj, $SLOT, $TEMPLATE, rtp_datastructures.template_rule_template(obj));
        funcall(visitor_fn, obj, $SLOT, $TRANSFORMATION, rtp_datastructures.template_rule_transformation(obj));
        funcall(visitor_fn, obj, $SLOT, $SEM_TEST, rtp_datastructures.template_rule_sem_test(obj));
        funcall(visitor_fn, obj, $SLOT, $ASSERTION, rtp_datastructures.template_rule_assertion(obj));
        funcall(visitor_fn, obj, $SLOT, $TERMINALS, rtp_datastructures.template_rule_terminals(obj));
        funcall(visitor_fn, obj, $SLOT, $MEANING, rtp_datastructures.template_rule_meaning(obj));
        funcall(visitor_fn, obj, $SLOT, $CONSTRAINTS, rtp_datastructures.template_rule_constraints(obj));
        funcall(visitor_fn, obj, $SLOT, $ID, rtp_datastructures.template_rule_id(obj));
        funcall(visitor_fn, obj, $END, rtp_datastructures.MAKE_TEMPLATE_RULE, NINE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_template_rule_method(final SubLObject obj, final SubLObject visitor_fn) {
        return rtp_datastructures.visit_defstruct_template_rule(obj, visitor_fn);
    }

    /**
     * get the semantic test for a given chart entry
     *
     * @param ENTRY
    rtp-chart-entry
     * 		
     * @return cycl-sentence; the semantic test for the chart-entry
     */
    @LispMethod(comment = "get the semantic test for a given chart entry\r\n\r\n@param ENTRY\nrtp-chart-entry\r\n\t\t\r\n@return cycl-sentence; the semantic test for the chart-entry")
    public static final SubLObject rtp_chart_entry_sem_test_alt(SubLObject entry) {
        return com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_sem_test(com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_chart_entry_rule(entry));
    }

    /**
     * get the semantic test for a given chart entry
     *
     * @param ENTRY
    		rtp-chart-entry
     * 		
     * @return cycl-sentence; the semantic test for the chart-entry
     */
    @LispMethod(comment = "get the semantic test for a given chart entry\r\n\r\n@param ENTRY\n\t\trtp-chart-entry\r\n\t\t\r\n@return cycl-sentence; the semantic test for the chart-entry")
    public static SubLObject rtp_chart_entry_sem_test(final SubLObject entry) {
        return rtp_datastructures.template_rule_sem_test(rtp_datastructures.rtp_chart_entry_rule(entry));
    }

    /**
     * does this chart entry have a semantic test?
     */
    @LispMethod(comment = "does this chart entry have a semantic test?")
    public static final SubLObject rtp_chart_entry_sem_testP_alt(SubLObject entry) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_sem_test(com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_chart_entry_rule(entry)));
    }

    /**
     * does this chart entry have a semantic test?
     */
    @LispMethod(comment = "does this chart entry have a semantic test?")
    public static SubLObject rtp_chart_entry_sem_testP(final SubLObject entry) {
        return sublisp_boolean(rtp_datastructures.template_rule_sem_test(rtp_datastructures.rtp_chart_entry_rule(entry)));
    }

    public static final SubLObject sxhash_template_rule_method_alt(SubLObject v_object) {
        if (NIL != $use_better_template_rule_sxhashP$.getGlobalValue()) {
            return com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_id(v_object);
        } else {
            return Sxhash.sxhash(add(Sxhash.sxhash(com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_category(v_object)), multiply(Sxhash.sxhash(com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_template(v_object)), $template_rule_sxhashing_prime_a$.getGlobalValue()), multiply(Sxhash.sxhash(com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_assertion(v_object)), $template_rule_sxhashing_prime_b$.getGlobalValue())));
        }
    }

    public static SubLObject sxhash_template_rule_method(final SubLObject v_object) {
        if (NIL != rtp_datastructures.$use_better_template_rule_sxhashP$.getGlobalValue()) {
            return rtp_datastructures.template_rule_id(v_object);
        }
        return Sxhash.sxhash(add(Sxhash.sxhash(rtp_datastructures.template_rule_category(v_object)), multiply(Sxhash.sxhash(rtp_datastructures.template_rule_template(v_object)), rtp_datastructures.$template_rule_sxhashing_prime_a$.getGlobalValue()), multiply(Sxhash.sxhash(rtp_datastructures.template_rule_assertion(v_object)), rtp_datastructures.$template_rule_sxhashing_prime_b$.getGlobalValue())));
    }

    public static final SubLObject print_template_rule_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt50$__A_for__S____from_Assertion__S__, new SubLObject[]{ com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_category(v_object), com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_meaning(v_object), com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_assertion(v_object), com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_transformation(v_object) });
        if (NIL != com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_sem_test(v_object)) {
            format(stream, $str_alt51$___Subject_to_test__S, com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_sem_test(v_object));
        }
        if (NIL == $print_rule_abbreviated$.getGlobalValue()) {
            format(stream, $str_alt52$___Augmented_Template___S, com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_template(v_object));
            format(stream, $str_alt53$___Term___S____Const___S, com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_terminals(v_object), com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_constraints(v_object));
        }
        format(stream, $str_alt54$___);
        return v_object;
    }

    public static SubLObject print_template_rule(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, rtp_datastructures.$str56$__A_for__S____from_Assertion__S__, new SubLObject[]{ rtp_datastructures.template_rule_category(v_object), rtp_datastructures.template_rule_meaning(v_object), rtp_datastructures.template_rule_assertion(v_object), rtp_datastructures.template_rule_transformation(v_object) });
        if (NIL != rtp_datastructures.template_rule_sem_test(v_object)) {
            format(stream, rtp_datastructures.$str57$___Subject_to_test__S, rtp_datastructures.template_rule_sem_test(v_object));
        }
        if (NIL == rtp_datastructures.$print_rule_abbreviated$.getGlobalValue()) {
            format(stream, rtp_datastructures.$str58$___Augmented_Template___S, rtp_datastructures.template_rule_template(v_object));
            format(stream, rtp_datastructures.$str59$___Term___S____Const___S, rtp_datastructures.template_rule_terminals(v_object), rtp_datastructures.template_rule_constraints(v_object));
        }
        format(stream, rtp_datastructures.$str60$___);
        return v_object;
    }

    public static final SubLObject new_template_rule_alt(SubLObject category, SubLObject template, SubLObject xform, SubLObject sem_test, SubLObject assertion, SubLObject meaning) {
        if (sem_test == UNPROVIDED) {
            sem_test = NIL;
        }
        if (assertion == UNPROVIDED) {
            assertion = $template_rule_default_assertion$.getDynamicValue();
        }
        if (meaning == UNPROVIDED) {
            meaning = $template_rule_default_meaning$.getDynamicValue();
        }
        {
            SubLObject tp_rule = com.cyc.cycjava.cycl.rtp.rtp_datastructures.make_template_rule(UNPROVIDED);
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_rule_category(tp_rule, category);
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_rule_transformation(tp_rule, xform);
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_rule_sem_test(tp_rule, sem_test);
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_rule_meaning(tp_rule, meaning);
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_rule_assertion(tp_rule, assertion);
            {
                SubLObject compiled_template = com.cyc.cycjava.cycl.rtp.rtp_datastructures.compile_template_expression(template, category);
                com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_rule_template(tp_rule, compiled_template);
                com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_rule_terminals(tp_rule, com.cyc.cycjava.cycl.rtp.rtp_datastructures.extract_terminals_from_template(compiled_template));
                com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_rule_constraints(tp_rule, com.cyc.cycjava.cycl.rtp.rtp_datastructures.extract_constraints_from_template(compiled_template));
                com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_rule_id(tp_rule, integer_sequence_generator.integer_sequence_generator_next($template_rule_isg$.getGlobalValue()));
            }
            return tp_rule;
        }
    }

    public static SubLObject new_template_rule(final SubLObject category, final SubLObject template, final SubLObject xform, SubLObject sem_test, SubLObject assertion, SubLObject meaning) {
        if (sem_test == UNPROVIDED) {
            sem_test = NIL;
        }
        if (assertion == UNPROVIDED) {
            assertion = rtp_datastructures.$template_rule_default_assertion$.getDynamicValue();
        }
        if (meaning == UNPROVIDED) {
            meaning = rtp_datastructures.$template_rule_default_meaning$.getDynamicValue();
        }
        final SubLObject tp_rule = rtp_datastructures.make_template_rule(UNPROVIDED);
        rtp_datastructures._csetf_template_rule_category(tp_rule, category);
        rtp_datastructures._csetf_template_rule_transformation(tp_rule, xform);
        rtp_datastructures._csetf_template_rule_sem_test(tp_rule, sem_test);
        rtp_datastructures._csetf_template_rule_meaning(tp_rule, meaning);
        rtp_datastructures._csetf_template_rule_assertion(tp_rule, assertion);
        final SubLObject compiled_template = rtp_datastructures.compile_template_expression(template, category);
        rtp_datastructures._csetf_template_rule_template(tp_rule, compiled_template);
        rtp_datastructures._csetf_template_rule_terminals(tp_rule, rtp_datastructures.extract_terminals_from_template(compiled_template));
        rtp_datastructures._csetf_template_rule_constraints(tp_rule, rtp_datastructures.extract_constraints_from_template(compiled_template));
        rtp_datastructures._csetf_template_rule_id(tp_rule, integer_sequence_generator_next(rtp_datastructures.$template_rule_isg$.getGlobalValue()));
        return tp_rule;
    }

    public static final SubLObject cfasl_output_object_template_rule_method_alt(SubLObject v_object, SubLObject stream) {
        return com.cyc.cycjava.cycl.rtp.rtp_datastructures.cfasl_output_template_rule(v_object, stream);
    }

    public static SubLObject cfasl_output_object_template_rule_method(final SubLObject v_object, final SubLObject stream) {
        return rtp_datastructures.cfasl_output_template_rule(v_object, stream);
    }

    public static final SubLObject cfasl_output_template_rule_alt(SubLObject template_rule, SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_template_rule$.getGlobalValue(), stream);
        cfasl_output(com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_category(template_rule), stream);
        cfasl_output(com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_template(template_rule), stream);
        cfasl_output(com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_transformation(template_rule), stream);
        cfasl_output(com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_sem_test(template_rule), stream);
        cfasl_output(com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_assertion(template_rule), stream);
        cfasl_output(com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_terminals(template_rule), stream);
        cfasl_output(com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_meaning(template_rule), stream);
        cfasl_output(com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_constraints(template_rule), stream);
        cfasl_output(com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_id(template_rule), stream);
        return template_rule;
    }

    public static SubLObject cfasl_output_template_rule(final SubLObject template_rule, final SubLObject stream) {
        cfasl_raw_write_byte(rtp_datastructures.$cfasl_opcode_template_rule$.getGlobalValue(), stream);
        cfasl_output(rtp_datastructures.template_rule_category(template_rule), stream);
        cfasl_output(rtp_datastructures.template_rule_template(template_rule), stream);
        cfasl_output(rtp_datastructures.template_rule_transformation(template_rule), stream);
        cfasl_output(rtp_datastructures.template_rule_sem_test(template_rule), stream);
        cfasl_output(rtp_datastructures.template_rule_assertion(template_rule), stream);
        cfasl_output(rtp_datastructures.template_rule_terminals(template_rule), stream);
        cfasl_output(rtp_datastructures.template_rule_meaning(template_rule), stream);
        cfasl_output(rtp_datastructures.template_rule_constraints(template_rule), stream);
        cfasl_output(rtp_datastructures.template_rule_id(template_rule), stream);
        return template_rule;
    }

    public static final SubLObject cfasl_input_template_rule_alt(SubLObject stream) {
        {
            SubLObject template_rule = com.cyc.cycjava.cycl.rtp.rtp_datastructures.make_template_rule(UNPROVIDED);
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_rule_category(template_rule, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_rule_template(template_rule, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_rule_transformation(template_rule, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_rule_sem_test(template_rule, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_rule_assertion(template_rule, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_rule_terminals(template_rule, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_rule_meaning(template_rule, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_rule_constraints(template_rule, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_rule_id(template_rule, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
            return template_rule;
        }
    }

    public static SubLObject cfasl_input_template_rule(final SubLObject stream) {
        final SubLObject template_rule = rtp_datastructures.make_template_rule(UNPROVIDED);
        rtp_datastructures._csetf_template_rule_category(template_rule, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        rtp_datastructures._csetf_template_rule_template(template_rule, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        rtp_datastructures._csetf_template_rule_transformation(template_rule, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        rtp_datastructures._csetf_template_rule_sem_test(template_rule, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        rtp_datastructures._csetf_template_rule_assertion(template_rule, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        rtp_datastructures._csetf_template_rule_terminals(template_rule, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        rtp_datastructures._csetf_template_rule_meaning(template_rule, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        rtp_datastructures._csetf_template_rule_constraints(template_rule, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        rtp_datastructures._csetf_template_rule_id(template_rule, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        return template_rule;
    }

    public static final SubLObject template_span_item_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.rtp.rtp_datastructures.print_template_span_item(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject template_span_item_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        rtp_datastructures.print_template_span_item(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject template_span_item_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rtp.rtp_datastructures.$template_span_item_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject template_span_item_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rtp.rtp_datastructures.$template_span_item_native.class ? T : NIL;
    }

    public static final SubLObject template_span_item_template_item_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TEMPLATE_SPAN_ITEM_P);
        return v_object.getField2();
    }

    public static SubLObject template_span_item_template_item(final SubLObject v_object) {
        assert NIL != rtp_datastructures.template_span_item_p(v_object) : "! rtp_datastructures.template_span_item_p(v_object) " + "rtp_datastructures.template_span_item_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject template_span_item_start_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TEMPLATE_SPAN_ITEM_P);
        return v_object.getField3();
    }

    public static SubLObject template_span_item_start(final SubLObject v_object) {
        assert NIL != rtp_datastructures.template_span_item_p(v_object) : "! rtp_datastructures.template_span_item_p(v_object) " + "rtp_datastructures.template_span_item_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject template_span_item_end_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TEMPLATE_SPAN_ITEM_P);
        return v_object.getField4();
    }

    public static SubLObject template_span_item_end(final SubLObject v_object) {
        assert NIL != rtp_datastructures.template_span_item_p(v_object) : "! rtp_datastructures.template_span_item_p(v_object) " + "rtp_datastructures.template_span_item_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_template_span_item_template_item_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TEMPLATE_SPAN_ITEM_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_template_span_item_template_item(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_datastructures.template_span_item_p(v_object) : "! rtp_datastructures.template_span_item_p(v_object) " + "rtp_datastructures.template_span_item_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_template_span_item_start_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TEMPLATE_SPAN_ITEM_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_template_span_item_start(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_datastructures.template_span_item_p(v_object) : "! rtp_datastructures.template_span_item_p(v_object) " + "rtp_datastructures.template_span_item_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_template_span_item_end_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TEMPLATE_SPAN_ITEM_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_template_span_item_end(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_datastructures.template_span_item_p(v_object) : "! rtp_datastructures.template_span_item_p(v_object) " + "rtp_datastructures.template_span_item_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_template_span_item_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rtp.rtp_datastructures.$template_span_item_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($TEMPLATE_ITEM)) {
                        com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_span_item_template_item(v_new, current_value);
                    } else {
                        if (pcase_var.eql($START)) {
                            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_span_item_start(v_new, current_value);
                        } else {
                            if (pcase_var.eql($END)) {
                                com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_span_item_end(v_new, current_value);
                            } else {
                                Errors.error($str_alt47$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_template_span_item(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rtp.rtp_datastructures.$template_span_item_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TEMPLATE_ITEM)) {
                rtp_datastructures._csetf_template_span_item_template_item(v_new, current_value);
            } else
                if (pcase_var.eql($START)) {
                    rtp_datastructures._csetf_template_span_item_start(v_new, current_value);
                } else
                    if (pcase_var.eql($END)) {
                        rtp_datastructures._csetf_template_span_item_end(v_new, current_value);
                    } else {
                        Errors.error(rtp_datastructures.$str48$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_template_span_item(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, rtp_datastructures.MAKE_TEMPLATE_SPAN_ITEM, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TEMPLATE_ITEM, rtp_datastructures.template_span_item_template_item(obj));
        funcall(visitor_fn, obj, $SLOT, $START, rtp_datastructures.template_span_item_start(obj));
        funcall(visitor_fn, obj, $SLOT, $END, rtp_datastructures.template_span_item_end(obj));
        funcall(visitor_fn, obj, $END, rtp_datastructures.MAKE_TEMPLATE_SPAN_ITEM, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_template_span_item_method(final SubLObject obj, final SubLObject visitor_fn) {
        return rtp_datastructures.visit_defstruct_template_span_item(obj, visitor_fn);
    }

    public static final SubLObject new_template_span_item_alt(SubLObject template_item, SubLObject start, SubLObject end) {
        {
            SubLObject item = com.cyc.cycjava.cycl.rtp.rtp_datastructures.make_template_span_item(UNPROVIDED);
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_span_item_template_item(item, template_item);
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_span_item_start(item, start);
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_template_span_item_end(item, end);
            return item;
        }
    }

    public static SubLObject new_template_span_item(final SubLObject template_item, final SubLObject start, final SubLObject end) {
        final SubLObject item = rtp_datastructures.make_template_span_item(UNPROVIDED);
        rtp_datastructures._csetf_template_span_item_template_item(item, template_item);
        rtp_datastructures._csetf_template_span_item_start(item, start);
        rtp_datastructures._csetf_template_span_item_end(item, end);
        return item;
    }

    public static final SubLObject print_template_span_item_alt(SubLObject item, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt77$__S__S__S_, new SubLObject[]{ com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_span_item_template_item(item), com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_span_item_start(item), com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_span_item_end(item) });
        return item;
    }

    public static SubLObject print_template_span_item(final SubLObject item, final SubLObject stream, final SubLObject depth) {
        format(stream, rtp_datastructures.$str85$__S__S__S_, new SubLObject[]{ rtp_datastructures.template_span_item_template_item(item), rtp_datastructures.template_span_item_start(item), rtp_datastructures.template_span_item_end(item) });
        return item;
    }

    public static final SubLObject extract_constraints_from_template_alt(SubLObject template) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = NIL;
                {
                    SubLObject _prev_bind_0 = $template_terminal_style$.currentBinding(thread);
                    try {
                        $template_terminal_style$.bind($CONSTRAINTS, thread);
                        v_answer = com.cyc.cycjava.cycl.rtp.rtp_datastructures.extract_terminals_from_template(template);
                    } finally {
                        $template_terminal_style$.rebind(_prev_bind_0, thread);
                    }
                }
                return com.cyc.cycjava.cycl.rtp.rtp_datastructures.optimize_template_constraints(v_answer);
            }
        }
    }

    public static SubLObject extract_constraints_from_template(final SubLObject template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = rtp_datastructures.$template_terminal_style$.currentBinding(thread);
        try {
            rtp_datastructures.$template_terminal_style$.bind($CONSTRAINTS, thread);
            v_answer = rtp_datastructures.extract_terminals_from_template(template);
        } finally {
            rtp_datastructures.$template_terminal_style$.rebind(_prev_bind_0, thread);
        }
        return rtp_datastructures.optimize_template_constraints(v_answer);
    }

    /**
     * Iterate over the constraints and optimize them, such as folding
     * nested #$RequireSome's into a single list.
     */
    @LispMethod(comment = "Iterate over the constraints and optimize them, such as folding\r\nnested #$RequireSome\'s into a single list.\nIterate over the constraints and optimize them, such as folding\nnested #$RequireSome\'s into a single list.")
    public static final SubLObject optimize_template_constraints_alt(SubLObject constraints) {
        {
            SubLObject optimized = NIL;
            SubLObject cdolist_list_var = constraints;
            SubLObject constraint = NIL;
            for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                if (constraint.isCons() && (constraint.first() == $$RequireOne)) {
                    {
                        SubLObject flattened = com.cyc.cycjava.cycl.rtp.rtp_datastructures.ensure_flattened_constraint(constraint.rest());
                        if (NIL != flattened) {
                            optimized = cons(cons($$RequireOne, flattened), optimized);
                        }
                    }
                } else {
                    optimized = cons(constraint, optimized);
                }
            }
            return optimized;
        }
    }

    /**
     * Iterate over the constraints and optimize them, such as folding
     * nested #$RequireSome's into a single list.
     */
    @LispMethod(comment = "Iterate over the constraints and optimize them, such as folding\r\nnested #$RequireSome\'s into a single list.\nIterate over the constraints and optimize them, such as folding\nnested #$RequireSome\'s into a single list.")
    public static SubLObject optimize_template_constraints(final SubLObject constraints) {
        SubLObject optimized = NIL;
        SubLObject cdolist_list_var = constraints;
        SubLObject constraint = NIL;
        constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (constraint.isCons() && constraint.first().eql(rtp_datastructures.$$RequireOne)) {
                final SubLObject flattened = rtp_datastructures.ensure_flattened_constraint(constraint.rest());
                if (NIL != flattened) {
                    optimized = cons(cons(rtp_datastructures.$$RequireOne, flattened), optimized);
                }
            } else {
                optimized = cons(constraint, optimized);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        } 
        return optimized;
    }

    public static final SubLObject ensure_flattened_constraint_alt(SubLObject constraint) {
        {
            SubLObject flatten = NIL;
            SubLObject cdolist_list_var = constraint;
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                if (item.isCons() && (item.first() == $$RequireOne)) {
                    flatten = cconcatenate(com.cyc.cycjava.cycl.rtp.rtp_datastructures.ensure_flattened_constraint(item.rest()), flatten);
                } else {
                    flatten = cons(item, flatten);
                }
            }
            return flatten;
        }
    }

    public static SubLObject ensure_flattened_constraint(final SubLObject constraint) {
        SubLObject flatten = NIL;
        SubLObject cdolist_list_var = constraint;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (item.isCons() && item.first().eql(rtp_datastructures.$$RequireOne)) {
                flatten = cconcatenate(rtp_datastructures.ensure_flattened_constraint(item.rest()), flatten);
            } else {
                flatten = cons(item, flatten);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return flatten;
    }

    /**
     * Take the template and compile it into a more representative
     * format. Expand Meta Markers and distribute the special
     * tokens into the template, as needed.
     */
    @LispMethod(comment = "Take the template and compile it into a more representative\r\nformat. Expand Meta Markers and distribute the special\r\ntokens into the template, as needed.\nTake the template and compile it into a more representative\nformat. Expand Meta Markers and distribute the special\ntokens into the template, as needed.")
    public static final SubLObject compile_template_expression_alt(SubLObject template, SubLObject category) {
        {
            SubLObject compiled = copy_list(template);
            com.cyc.cycjava.cycl.rtp.rtp_datastructures.ensure_non_recursive_template(compiled, category);
            compiled = com.cyc.cycjava.cycl.rtp.rtp_datastructures.replace_constants_with_denotations(compiled);
            compiled = com.cyc.cycjava.cycl.rtp.rtp_datastructures.expand_word_sequences(compiled);
            compiled = com.cyc.cycjava.cycl.rtp.rtp_datastructures.expand_word_items(compiled);
            compiled = com.cyc.cycjava.cycl.rtp.rtp_datastructures.transform_meta_markers_in_template_expression(compiled);
            compiled = com.cyc.cycjava.cycl.rtp.rtp_datastructures.add_category_fill_words_to_template(compiled, category);
            return com.cyc.cycjava.cycl.rtp.rtp_datastructures.optimize_template_expression(compiled);
        }
    }

    /**
     * Take the template and compile it into a more representative
     * format. Expand Meta Markers and distribute the special
     * tokens into the template, as needed.
     */
    @LispMethod(comment = "Take the template and compile it into a more representative\r\nformat. Expand Meta Markers and distribute the special\r\ntokens into the template, as needed.\nTake the template and compile it into a more representative\nformat. Expand Meta Markers and distribute the special\ntokens into the template, as needed.")
    public static SubLObject compile_template_expression(final SubLObject template, final SubLObject category) {
        SubLObject compiled = copy_list(template);
        rtp_datastructures.ensure_non_recursive_template(compiled, category);
        compiled = rtp_datastructures.replace_constants_with_denotations(compiled);
        compiled = rtp_datastructures.expand_word_sequences(compiled);
        compiled = rtp_datastructures.expand_word_items(compiled);
        compiled = rtp_datastructures.transform_meta_markers_in_template_expression(compiled);
        compiled = rtp_datastructures.add_category_fill_words_to_template(compiled, category);
        return rtp_datastructures.optimize_template_expression(compiled);
    }

    public static final SubLObject expand_word_items_alt(SubLObject template) {
        return Mapping.mapcar(EXPAND_WORD_ITEMS_IN_LIST, template);
    }

    public static SubLObject expand_word_items(final SubLObject template) {
        return Mapping.mapcar(rtp_datastructures.EXPAND_WORD_ITEMS_IN_LIST, template);
    }

    /**
     *
     *
     * @param TEMPLATE
     * 		list; the syntactic portion of an RTP template, or a sub-portion thereof
     * @return list
    If there are any strings in the template that should be expanded into a #$WordSequence item,
    do so.
     */
    @LispMethod(comment = "@param TEMPLATE\r\n\t\tlist; the syntactic portion of an RTP template, or a sub-portion thereof\r\n@return list\r\nIf there are any strings in the template that should be expanded into a #$WordSequence item,\r\ndo so.")
    public static final SubLObject expand_word_sequences_alt(SubLObject template) {
        if (NIL != rtp_type_checkers.rtp_word_sequence_itemP(template)) {
            return com.cyc.cycjava.cycl.rtp.rtp_datastructures.possibly_expand_word_sequence_item(template);
        } else {
            if ((NIL != rtp_type_checkers.rtp_optional_some_itemP(template)) || (NIL != rtp_type_checkers.rtp_require_some_itemP(template))) {
                return template;
            } else {
                if (template.isString()) {
                    return com.cyc.cycjava.cycl.rtp.rtp_datastructures.possibly_expand_string_item(template);
                } else {
                    if (template.isAtom()) {
                        return template;
                    } else {
                        return cons(com.cyc.cycjava.cycl.rtp.rtp_datastructures.expand_word_sequences(template.first()), com.cyc.cycjava.cycl.rtp.rtp_datastructures.expand_word_sequences(template.rest()));
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @param TEMPLATE
     * 		list; the syntactic portion of an RTP template, or a sub-portion thereof
     * @return list
    If there are any strings in the template that should be expanded into a #$WordSequence item,
    do so.
     */
    @LispMethod(comment = "@param TEMPLATE\r\n\t\tlist; the syntactic portion of an RTP template, or a sub-portion thereof\r\n@return list\r\nIf there are any strings in the template that should be expanded into a #$WordSequence item,\r\ndo so.")
    public static SubLObject expand_word_sequences(final SubLObject template) {
        if (NIL != rtp_type_checkers.rtp_word_sequence_itemP(template)) {
            return rtp_datastructures.possibly_expand_word_sequence_item(template);
        }
        if ((NIL != rtp_type_checkers.rtp_optional_some_itemP(template)) || (NIL != rtp_type_checkers.rtp_require_some_itemP(template))) {
            return template;
        }
        if (template.isString()) {
            return rtp_datastructures.possibly_expand_string_item(template);
        }
        if (template.isAtom()) {
            return template;
        }
        return cons(rtp_datastructures.expand_word_sequences(template.first()), rtp_datastructures.expand_word_sequences(template.rest()));
    }

    /**
     *
     *
     * @param TEMPLATE-ITEM
    string;
     * 		
     * @return template-item
    If the string contains a space, tokenize it and make it a #$WordSequence
     */
    @LispMethod(comment = "@param TEMPLATE-ITEM\nstring;\r\n\t\t\r\n@return template-item\r\nIf the string contains a space, tokenize it and make it a #$WordSequence")
    public static final SubLObject possibly_expand_string_item_alt(SubLObject template_item) {
        if (NIL == string_utilities.substringP($str_alt81$_, template_item, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return template_item;
        }
        return cons($$WordSequence, rkf_concept_harvester.rkf_ch_string_tokenize(template_item));
    }

    /**
     *
     *
     * @param TEMPLATE-ITEM
    string;
     * 		
     * @return template-item
    If the string contains a space, tokenize it and make it a #$WordSequence
     */
    @LispMethod(comment = "@param TEMPLATE-ITEM\nstring;\r\n\t\t\r\n@return template-item\r\nIf the string contains a space, tokenize it and make it a #$WordSequence")
    public static SubLObject possibly_expand_string_item(final SubLObject template_item) {
        if (NIL == substringP(rtp_datastructures.$$$_, template_item, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return template_item;
        }
        return cons(rtp_datastructures.$$WordSequence, rkf_ch_string_tokenize(template_item));
    }

    /**
     *
     *
     * @param TEMPLATE-ITEM
     * 		template-item; starts with #$WordSequence
     * @return template-item; the template item with all necessary tokenizing/expansion
    carried out
     */
    @LispMethod(comment = "@param TEMPLATE-ITEM\r\n\t\ttemplate-item; starts with #$WordSequence\r\n@return template-item; the template item with all necessary tokenizing/expansion\r\ncarried out")
    public static final SubLObject possibly_expand_word_sequence_item_alt(SubLObject template) {
        {
            SubLObject new_template = NIL;
            SubLObject cdolist_list_var = template;
            SubLObject x = NIL;
            for (x = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , x = cdolist_list_var.first()) {
                if (x.isString() && (NIL != string_utilities.substringP($str_alt81$_, x, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    {
                        SubLObject cdolist_list_var_10 = rkf_concept_harvester.rkf_ch_string_tokenize(x);
                        SubLObject token = NIL;
                        for (token = cdolist_list_var_10.first(); NIL != cdolist_list_var_10; cdolist_list_var_10 = cdolist_list_var_10.rest() , token = cdolist_list_var_10.first()) {
                            new_template = cons(token, new_template);
                        }
                    }
                } else {
                    new_template = cons(x, new_template);
                }
            }
            return nreverse(new_template);
        }
    }

    /**
     *
     *
     * @param TEMPLATE-ITEM
     * 		template-item; starts with #$WordSequence
     * @return template-item; the template item with all necessary tokenizing/expansion
    carried out
     */
    @LispMethod(comment = "@param TEMPLATE-ITEM\r\n\t\ttemplate-item; starts with #$WordSequence\r\n@return template-item; the template item with all necessary tokenizing/expansion\r\ncarried out")
    public static SubLObject possibly_expand_word_sequence_item(final SubLObject template) {
        SubLObject new_template = NIL;
        SubLObject cdolist_list_var = template;
        SubLObject x = NIL;
        x = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (x.isString() && (NIL != substringP(rtp_datastructures.$$$_, x, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                SubLObject cdolist_list_var_$14 = rkf_ch_string_tokenize(x);
                SubLObject token = NIL;
                token = cdolist_list_var_$14.first();
                while (NIL != cdolist_list_var_$14) {
                    new_template = cons(token, new_template);
                    cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                    token = cdolist_list_var_$14.first();
                } 
            } else {
                new_template = cons(x, new_template);
            }
            cdolist_list_var = cdolist_list_var.rest();
            x = cdolist_list_var.first();
        } 
        return nreverse(new_template);
    }

    public static final SubLObject ensure_non_recursive_template_alt(SubLObject template, SubLObject category) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject counter = ZERO_INTEGER;
                SubLObject required = NIL;
                SubLObject recursion = NIL;
                SubLObject cdolist_list_var = template;
                SubLObject item = NIL;
                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                    counter = add(counter, ONE_INTEGER);
                    if ((((NIL != rtp_type_checkers.rtp_require_some_itemP(item)) || (NIL != rtp_type_checkers.rtp_require_one_itemP(item))) || (NIL != rtp_type_checkers.rtp_rule_terminalP(item))) || (NIL != fort_p(item))) {
                        if (NIL == required) {
                            required = counter;
                        }
                    } else {
                        if ((((NIL == rtp_type_checkers.rtp_optional_some_itemP(item)) && (NIL == rtp_type_checkers.rtp_optional_one_itemP(item))) && item.isList()) && (item.first() != category)) {
                            if (NIL == required) {
                                required = counter;
                            }
                        } else {
                            if (item.isList() && (item.first() == category)) {
                                if (NIL == recursion) {
                                    recursion = counter;
                                }
                            }
                        }
                    }
                }
                if (recursion.isNumber()) {
                    if (!required.isNumber()) {
                        if (NIL != $block_left_recursive_templates$.getDynamicValue(thread)) {
                            sublisp_throw($RECURSIVE_TEMPLATE, cons(template, category));
                        } else {
                            Errors.warn($str_alt84$Left_recursive_template___S__, template);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject ensure_non_recursive_template(final SubLObject template, final SubLObject category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject counter = ZERO_INTEGER;
        SubLObject required = NIL;
        SubLObject recursion = NIL;
        SubLObject cdolist_list_var = template;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            counter = add(counter, ONE_INTEGER);
            if ((((NIL != rtp_type_checkers.rtp_require_some_itemP(item)) || (NIL != rtp_type_checkers.rtp_require_one_itemP(item))) || (NIL != rtp_type_checkers.rtp_rule_terminalP(item))) || (NIL != forts.fort_p(item))) {
                if (NIL == required) {
                    required = counter;
                }
            } else
                if ((((NIL == rtp_type_checkers.rtp_optional_some_itemP(item)) && (NIL == rtp_type_checkers.rtp_optional_one_itemP(item))) && item.isList()) && (!item.first().eql(category))) {
                    if (NIL == required) {
                        required = counter;
                    }
                } else
                    if ((item.isList() && item.first().eql(category)) && (NIL == recursion)) {
                        recursion = counter;
                    }


            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        if (recursion.isNumber() && (!required.isNumber())) {
            if (NIL != rtp_datastructures.$block_left_recursive_templates$.getDynamicValue(thread)) {
                sublisp_throw($RECURSIVE_TEMPLATE, cons(template, category));
            } else {
                Errors.warn(rtp_datastructures.$str92$Left_recursive_template___S__, template);
            }
        }
        return NIL;
    }

    public static final SubLObject clear_denotations_of_constant_alt() {
        {
            SubLObject cs = $denotations_of_constant_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_denotations_of_constant() {
        final SubLObject cs = rtp_datastructures.$denotations_of_constant_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_denotations_of_constant_alt(SubLObject constant, SubLObject term_phrases_constraint) {
        if (term_phrases_constraint == UNPROVIDED) {
            term_phrases_constraint = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($denotations_of_constant_caching_state$.getGlobalValue(), list(constant, term_phrases_constraint), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_denotations_of_constant(final SubLObject constant, SubLObject term_phrases_constraint) {
        if (term_phrases_constraint == UNPROVIDED) {
            term_phrases_constraint = NIL;
        }
        return caching_state_remove_function_results_with_args(rtp_datastructures.$denotations_of_constant_caching_state$.getGlobalValue(), list(constant, term_phrases_constraint), UNPROVIDED, UNPROVIDED);
    }

    /**
     * takes two cyc constants, the second one isa #$SpeechPart and returns a list of denotations strings
     */
    @LispMethod(comment = "takes two cyc constants, the second one isa #$SpeechPart and returns a list of denotations strings")
    public static final SubLObject denotations_of_constant_internal_alt(SubLObject constant, SubLObject term_phrases_constraint) {
        {
            SubLObject preds = com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_preds_from_term_phrases_constraint(term_phrases_constraint);
            SubLObject the_filter = com.cyc.cycjava.cycl.rtp.rtp_datastructures.all_phrases_filter_from_term_phrases_constraint(term_phrases_constraint);
            return pph_methods_lexicon.all_phrases_for_term(constant, preds, $list_alt86, $TEXT, the_filter, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     * takes two cyc constants, the second one isa #$SpeechPart and returns a list of denotations strings
     */
    @LispMethod(comment = "takes two cyc constants, the second one isa #$SpeechPart and returns a list of denotations strings")
    public static SubLObject denotations_of_constant_internal(final SubLObject constant, final SubLObject term_phrases_constraint) {
        final SubLObject preds = rtp_datastructures.rtp_preds_from_term_phrases_constraint(term_phrases_constraint);
        final SubLObject the_filter = rtp_datastructures.all_phrases_filter_from_term_phrases_constraint(term_phrases_constraint);
        return all_phrases_for_term(constant, preds, rtp_datastructures.$list94, $TEXT, the_filter, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject denotations_of_constant_alt(SubLObject constant, SubLObject term_phrases_constraint) {
        if (term_phrases_constraint == UNPROVIDED) {
            term_phrases_constraint = NIL;
        }
        {
            SubLObject caching_state = $denotations_of_constant_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(DENOTATIONS_OF_CONSTANT, $denotations_of_constant_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(constant, term_phrases_constraint);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw11$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (constant.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && term_phrases_constraint.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rtp.rtp_datastructures.denotations_of_constant_internal(constant, term_phrases_constraint)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(constant, term_phrases_constraint));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject denotations_of_constant(final SubLObject constant, SubLObject term_phrases_constraint) {
        if (term_phrases_constraint == UNPROVIDED) {
            term_phrases_constraint = NIL;
        }
        SubLObject caching_state = rtp_datastructures.$denotations_of_constant_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(rtp_datastructures.DENOTATIONS_OF_CONSTANT, rtp_datastructures.$denotations_of_constant_caching_state$, rtp_datastructures.$int$1024, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = sxhash_calc_2(constant, term_phrases_constraint);
        final SubLObject collisions = caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql($memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (constant.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && term_phrases_constraint.equal(cached_args.first())) {
                        return caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(rtp_datastructures.denotations_of_constant_internal(constant, term_phrases_constraint)));
        caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(constant, term_phrases_constraint));
        return caching_results(results3);
    }

    public static final SubLObject rtp_preds_from_term_phrases_constraint_alt(SubLObject term_phrases_constraint) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != lexicon_accessors.speech_partP(term_phrases_constraint, UNPROVIDED)) {
                return lexicon_accessors.all_preds_of_pos(term_phrases_constraint);
            } else {
                if (NIL != fort_types_interface.predicate_p(term_phrases_constraint)) {
                    return cons(term_phrases_constraint, genl_predicates.spec_predicates(term_phrases_constraint, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), UNPROVIDED));
                } else {
                    return $ALL;
                }
            }
        }
    }

    public static SubLObject rtp_preds_from_term_phrases_constraint(final SubLObject term_phrases_constraint) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != speech_partP(term_phrases_constraint, UNPROVIDED)) {
            return all_preds_of_pos(term_phrases_constraint);
        }
        if (NIL != predicate_p(term_phrases_constraint)) {
            return cons(term_phrases_constraint, spec_predicates(term_phrases_constraint, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), UNPROVIDED));
        }
        return $ALL;
    }

    public static final SubLObject clear_all_phrases_filter_from_term_phrases_constraint_alt() {
        {
            SubLObject cs = $all_phrases_filter_from_term_phrases_constraint_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_all_phrases_filter_from_term_phrases_constraint() {
        final SubLObject cs = rtp_datastructures.$all_phrases_filter_from_term_phrases_constraint_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_all_phrases_filter_from_term_phrases_constraint_alt(SubLObject term_phrases_constraint) {
        return memoization_state.caching_state_remove_function_results_with_args($all_phrases_filter_from_term_phrases_constraint_caching_state$.getGlobalValue(), list(term_phrases_constraint), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_all_phrases_filter_from_term_phrases_constraint(final SubLObject term_phrases_constraint) {
        return caching_state_remove_function_results_with_args(rtp_datastructures.$all_phrases_filter_from_term_phrases_constraint_caching_state$.getGlobalValue(), list(term_phrases_constraint), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject all_phrases_filter_from_term_phrases_constraint_internal_alt(SubLObject term_phrases_constraint) {
        return (NIL != lexicon_accessors.speech_partP(term_phrases_constraint, UNPROVIDED)) || (NIL != isa.isa_in_any_mtP(term_phrases_constraint, $const91$CollectionLexificationPredicate_R)) ? ((SubLObject) (term_phrases_constraint)) : NIL;
    }

    public static SubLObject all_phrases_filter_from_term_phrases_constraint_internal(final SubLObject term_phrases_constraint) {
        return (NIL != speech_partP(term_phrases_constraint, UNPROVIDED)) || (NIL != isa_in_any_mtP(term_phrases_constraint, rtp_datastructures.$const100$CollectionLexificationPredicate_R)) ? term_phrases_constraint : NIL;
    }

    public static final SubLObject all_phrases_filter_from_term_phrases_constraint_alt(SubLObject term_phrases_constraint) {
        {
            SubLObject caching_state = $all_phrases_filter_from_term_phrases_constraint_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(ALL_PHRASES_FILTER_FROM_TERM_PHRASES_CONSTRAINT, $all_phrases_filter_from_term_phrases_constraint_caching_state$, $int$200, EQL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, term_phrases_constraint, $kw11$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw11$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rtp.rtp_datastructures.all_phrases_filter_from_term_phrases_constraint_internal(term_phrases_constraint)));
                    memoization_state.caching_state_put(caching_state, term_phrases_constraint, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject all_phrases_filter_from_term_phrases_constraint(final SubLObject term_phrases_constraint) {
        SubLObject caching_state = rtp_datastructures.$all_phrases_filter_from_term_phrases_constraint_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(rtp_datastructures.ALL_PHRASES_FILTER_FROM_TERM_PHRASES_CONSTRAINT, rtp_datastructures.$all_phrases_filter_from_term_phrases_constraint_caching_state$, rtp_datastructures.$int$200, EQL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = caching_state_lookup(caching_state, term_phrases_constraint, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(rtp_datastructures.all_phrases_filter_from_term_phrases_constraint_internal(term_phrases_constraint)));
            caching_state_put(caching_state, term_phrases_constraint, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    /**
     * takes a template and replaces items of the form (#$Sleeping #$Verb) with lists of #$RequireOne
     */
    @LispMethod(comment = "takes a template and replaces items of the form (#$Sleeping #$Verb) with lists of #$RequireOne")
    public static final SubLObject replace_constants_with_denotations_alt(SubLObject template) {
        if (template.isAtom()) {
            return template;
        } else {
            if (NIL != rtp_type_checkers.rtp_cyc_term_item(template.first())) {
                return cons(com.cyc.cycjava.cycl.rtp.rtp_datastructures.transform_cyc_term_item(template.first()), com.cyc.cycjava.cycl.rtp.rtp_datastructures.replace_constants_with_denotations(template.rest()));
            } else {
                return cons(com.cyc.cycjava.cycl.rtp.rtp_datastructures.replace_constants_with_denotations(template.first()), com.cyc.cycjava.cycl.rtp.rtp_datastructures.replace_constants_with_denotations(template.rest()));
            }
        }
    }

    /**
     * takes a template and replaces items of the form (#$Sleeping #$Verb) with lists of #$RequireOne
     */
    @LispMethod(comment = "takes a template and replaces items of the form (#$Sleeping #$Verb) with lists of #$RequireOne")
    public static SubLObject replace_constants_with_denotations(final SubLObject template) {
        if (template.isAtom()) {
            return template;
        }
        if (NIL != rtp_type_checkers.rtp_cyc_term_item(template.first())) {
            return cons(rtp_datastructures.transform_cyc_term_item(template.first()), rtp_datastructures.replace_constants_with_denotations(template.rest()));
        }
        return cons(rtp_datastructures.replace_constants_with_denotations(template.first()), rtp_datastructures.replace_constants_with_denotations(template.rest()));
    }

    /**
     * takes an item of the form (#$Sleeping #$Verb) and returns (#$RequireOne ...) where ... are all of the denotations
     */
    @LispMethod(comment = "takes an item of the form (#$Sleeping #$Verb) and returns (#$RequireOne ...) where ... are all of the denotations")
    public static final SubLObject transform_cyc_term_item_alt(SubLObject item) {
        return cons($$RequireOne, com.cyc.cycjava.cycl.rtp.rtp_datastructures.denotations_of_constant(second(item), third(item)));
    }

    /**
     * takes an item of the form (#$Sleeping #$Verb) and returns (#$RequireOne ...) where ... are all of the denotations
     */
    @LispMethod(comment = "takes an item of the form (#$Sleeping #$Verb) and returns (#$RequireOne ...) where ... are all of the denotations")
    public static SubLObject transform_cyc_term_item(final SubLObject item) {
        return cons(rtp_datastructures.$$RequireOne, rtp_datastructures.denotations_of_constant(second(item), third(item)));
    }

    /**
     * Perform meaning-preserving transformations that make the template
     * simpler to match. Collapse multiple Kleene stars into single Kleene expressions.
     */
    @LispMethod(comment = "Perform meaning-preserving transformations that make the template\r\nsimpler to match. Collapse multiple Kleene stars into single Kleene expressions.\nPerform meaning-preserving transformations that make the template\nsimpler to match. Collapse multiple Kleene stars into single Kleene expressions.")
    public static final SubLObject optimize_template_expression_alt(SubLObject template) {
        {
            SubLObject optimized = NIL;
            SubLObject prev = NIL;
            SubLObject cdolist_list_var = template;
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                if (NIL != rtp_type_checkers.rtp_optional_some_itemP(item)) {
                    if (NIL == prev) {
                        prev = item;
                    } else {
                        prev = cconcatenate(prev, item.rest());
                        prev = remove_duplicates(prev, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                } else {
                    if (NIL != prev) {
                        optimized = cons(prev, optimized);
                        prev = NIL;
                    }
                    optimized = cons(item, optimized);
                }
            }
            if (NIL != prev) {
                optimized = cons(prev, optimized);
            }
            return nreverse(optimized);
        }
    }

    /**
     * Perform meaning-preserving transformations that make the template
     * simpler to match. Collapse multiple Kleene stars into single Kleene expressions.
     */
    @LispMethod(comment = "Perform meaning-preserving transformations that make the template\r\nsimpler to match. Collapse multiple Kleene stars into single Kleene expressions.\nPerform meaning-preserving transformations that make the template\nsimpler to match. Collapse multiple Kleene stars into single Kleene expressions.")
    public static SubLObject optimize_template_expression(final SubLObject template) {
        SubLObject optimized = NIL;
        SubLObject prev = NIL;
        SubLObject cdolist_list_var = template;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != rtp_type_checkers.rtp_optional_some_itemP(item)) {
                if (NIL == prev) {
                    prev = item;
                } else {
                    prev = cconcatenate(prev, item.rest());
                    prev = remove_duplicates(prev, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            } else {
                if (NIL != prev) {
                    optimized = cons(prev, optimized);
                    prev = NIL;
                }
                optimized = cons(item, optimized);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        if (NIL != prev) {
            optimized = cons(prev, optimized);
        }
        return nreverse(optimized);
    }

    public static final SubLObject extract_terminals_from_template_alt(SubLObject template) {
        {
            SubLObject v_answer = NIL;
            SubLObject cdolist_list_var = template;
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                if (item.isCons()) {
                    v_answer = nreverse(com.cyc.cycjava.cycl.rtp.rtp_datastructures.check_for_terminals_in_subtemplate(item, v_answer));
                } else {
                    if (NIL != rtp_type_checkers.rtp_rule_terminalP(item)) {
                        v_answer = cons(item, v_answer);
                    }
                }
            }
            return v_answer;
        }
    }

    public static SubLObject extract_terminals_from_template(final SubLObject template) {
        SubLObject v_answer = NIL;
        SubLObject cdolist_list_var = template;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (item.isCons()) {
                v_answer = nreverse(rtp_datastructures.check_for_terminals_in_subtemplate(item, v_answer));
            } else
                if (NIL != rtp_type_checkers.rtp_rule_terminalP(item)) {
                    v_answer = cons(item, v_answer);
                }

            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return v_answer;
    }

    public static final SubLObject check_for_terminals_in_subtemplate_alt(SubLObject subtemplate, SubLObject accumulator) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != rtp_type_checkers.rtp_require_one_itemP(subtemplate)) || (NIL != rtp_type_checkers.rtp_require_some_itemP(subtemplate))) {
                {
                    SubLObject others = com.cyc.cycjava.cycl.rtp.rtp_datastructures.extract_terminals_from_template(subtemplate.rest());
                    SubLObject pcase_var = $template_terminal_style$.getDynamicValue(thread);
                    if (pcase_var.eql($STANDARD)) {
                        {
                            SubLObject cdolist_list_var = others;
                            SubLObject item = NIL;
                            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                accumulator = cons(item, accumulator);
                            }
                        }
                    } else {
                        if (pcase_var.eql($CONSTRAINTS)) {
                            {
                                SubLObject items = cconcatenate($list_alt94, others);
                                accumulator = cons(items, accumulator);
                            }
                        }
                    }
                }
            } else {
                if (NIL != rtp_type_checkers.rtp_word_itemP(subtemplate)) {
                    {
                        SubLObject words = NIL;
                        words = com.cyc.cycjava.cycl.rtp.rtp_datastructures.compute_strings_of_type(subtemplate);
                        {
                            SubLObject pcase_var = $template_terminal_style$.getDynamicValue(thread);
                            if (pcase_var.eql($STANDARD)) {
                                {
                                    SubLObject cdolist_list_var = words;
                                    SubLObject word = NIL;
                                    for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                                        if (word.isString()) {
                                            {
                                                SubLObject cdolist_list_var_11 = rkf_concept_harvester.rkf_ch_string_tokenize(word);
                                                SubLObject subword = NIL;
                                                for (subword = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest() , subword = cdolist_list_var_11.first()) {
                                                    accumulator = cons(subword, accumulator);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (pcase_var.eql($CONSTRAINTS)) {
                                    {
                                        SubLObject items = cconcatenate($list_alt94, words);
                                        accumulator = cons(items, accumulator);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (NIL != rtp_type_checkers.rtp_grouped_itemP(subtemplate)) {
                        {
                            SubLObject others = com.cyc.cycjava.cycl.rtp.rtp_datastructures.extract_terminals_from_template(subtemplate.rest());
                            SubLObject pcase_var = $template_terminal_style$.getDynamicValue(thread);
                            if (pcase_var.eql($STANDARD)) {
                                {
                                    SubLObject cdolist_list_var = others;
                                    SubLObject item = NIL;
                                    for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                        accumulator = cons(item, accumulator);
                                    }
                                }
                            } else {
                                if (pcase_var.eql($CONSTRAINTS)) {
                                    {
                                        SubLObject items = cconcatenate($list_alt95, nreverse(others));
                                        accumulator = cons(items, accumulator);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return nreverse(accumulator);
        }
    }

    public static SubLObject check_for_terminals_in_subtemplate(final SubLObject subtemplate, SubLObject accumulator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != rtp_type_checkers.rtp_require_one_itemP(subtemplate)) || (NIL != rtp_type_checkers.rtp_require_some_itemP(subtemplate))) {
            final SubLObject others = rtp_datastructures.extract_terminals_from_template(subtemplate.rest());
            final SubLObject pcase_var = rtp_datastructures.$template_terminal_style$.getDynamicValue(thread);
            if (pcase_var.eql($STANDARD)) {
                SubLObject cdolist_list_var = others;
                SubLObject item = NIL;
                item = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    accumulator = cons(item, accumulator);
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                } 
            } else
                if (pcase_var.eql($CONSTRAINTS)) {
                    final SubLObject items = cconcatenate(rtp_datastructures.$list103, others);
                    accumulator = cons(items, accumulator);
                }

        } else
            if (NIL != rtp_type_checkers.rtp_word_itemP(subtemplate)) {
                SubLObject words = NIL;
                words = rtp_datastructures.compute_strings_of_type(subtemplate);
                final SubLObject pcase_var = rtp_datastructures.$template_terminal_style$.getDynamicValue(thread);
                if (pcase_var.eql($STANDARD)) {
                    SubLObject cdolist_list_var = words;
                    SubLObject word = NIL;
                    word = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (word.isString()) {
                            SubLObject cdolist_list_var_$15 = rkf_ch_string_tokenize(word);
                            SubLObject subword = NIL;
                            subword = cdolist_list_var_$15.first();
                            while (NIL != cdolist_list_var_$15) {
                                accumulator = cons(subword, accumulator);
                                cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                                subword = cdolist_list_var_$15.first();
                            } 
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        word = cdolist_list_var.first();
                    } 
                } else
                    if (pcase_var.eql($CONSTRAINTS)) {
                        final SubLObject items = cconcatenate(rtp_datastructures.$list103, words);
                        accumulator = cons(items, accumulator);
                    }

            } else
                if (NIL != rtp_type_checkers.rtp_grouped_itemP(subtemplate)) {
                    final SubLObject others = rtp_datastructures.extract_terminals_from_template(subtemplate.rest());
                    final SubLObject pcase_var = rtp_datastructures.$template_terminal_style$.getDynamicValue(thread);
                    if (pcase_var.eql($STANDARD)) {
                        SubLObject cdolist_list_var = others;
                        SubLObject item = NIL;
                        item = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            accumulator = cons(item, accumulator);
                            cdolist_list_var = cdolist_list_var.rest();
                            item = cdolist_list_var.first();
                        } 
                    } else
                        if (pcase_var.eql($CONSTRAINTS)) {
                            final SubLObject items = cconcatenate(rtp_datastructures.$list104, nreverse(others));
                            accumulator = cons(items, accumulator);
                        }

                }


        return nreverse(accumulator);
    }

    public static final SubLObject compute_strings_of_type_alt(SubLObject subtemplate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject stem = rtp_type_checkers.rtp_word_item_word(subtemplate);
                SubLObject modification = rtp_type_checkers.rtp_word_item_syntactic_constraint(subtemplate);
                SubLObject result = com.cyc.cycjava.cycl.rtp.rtp_datastructures.possible_contractions_for_subtemplate(subtemplate);
                if (NIL != rtp_type_checkers.rtp_word_pos_itemP(subtemplate)) {
                    result = cconcatenate(lexicon_accessors.get_strings_of_type_cached(stem, modification, $ALL, NIL, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread)), result);
                }
                if (NIL != rtp_type_checkers.rtp_word_pos_pred_itemP(subtemplate)) {
                    result = cconcatenate(lexicon_cache.strings_of_wordXpred(stem, modification, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread)), result);
                }
                return result;
            }
        }
    }

    public static SubLObject compute_strings_of_type(final SubLObject subtemplate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stem = rtp_type_checkers.rtp_word_item_word(subtemplate);
        final SubLObject modification = rtp_type_checkers.rtp_word_item_syntactic_constraint(subtemplate);
        SubLObject result = rtp_datastructures.possible_contractions_for_subtemplate(subtemplate);
        if (NIL != rtp_type_checkers.rtp_word_pos_itemP(subtemplate)) {
            result = cconcatenate(get_strings_of_type_cached(stem, modification, $ALL, NIL, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread)), result);
        }
        if (NIL != rtp_type_checkers.rtp_word_pos_pred_itemP(subtemplate)) {
            result = cconcatenate(strings_of_wordXpred(stem, modification, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread)), result);
        }
        return result;
    }

    public static final SubLObject possible_contractions_for_subtemplate_alt(SubLObject subtemplate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.rtp.rtp_datastructures.maybe_initialize_rtp_contractions_table(UNPROVIDED);
            {
                SubLObject word = rtp_type_checkers.rtp_word_item_word(subtemplate);
                return list_utilities.alist_lookup($rtp_contractions_table$.getDynamicValue(thread), word, UNPROVIDED, UNPROVIDED).first();
            }
        }
    }

    public static SubLObject possible_contractions_for_subtemplate(final SubLObject subtemplate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        rtp_datastructures.maybe_initialize_rtp_contractions_table(UNPROVIDED);
        final SubLObject word = rtp_type_checkers.rtp_word_item_word(subtemplate);
        return alist_lookup(rtp_datastructures.$rtp_contractions_table$.getDynamicValue(thread), word, UNPROVIDED, UNPROVIDED).first();
    }

    public static final SubLObject maybe_initialize_rtp_contractions_table_alt(SubLObject force_reinitalize) {
        if (force_reinitalize == UNPROVIDED) {
            force_reinitalize = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (((NIL != force_reinitalize) || (NIL == $rtp_contractions_table$.getDynamicValue(thread))) && (NIL != valid_constant($$contractedFormOfWord, UNPROVIDED))) {
                {
                    SubLObject cdolist_list_var = $list_alt103;
                    SubLObject word_type = NIL;
                    for (word_type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word_type = cdolist_list_var.first()) {
                        {
                            SubLObject cdolist_list_var_12 = ask_utilities.query_variable($sym101$_WORD, list($$posForms, $sym101$_WORD, word_type), rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), UNPROVIDED);
                            SubLObject word = NIL;
                            for (word = cdolist_list_var_12.first(); NIL != cdolist_list_var_12; cdolist_list_var_12 = cdolist_list_var_12.rest() , word = cdolist_list_var_12.first()) {
                                {
                                    SubLObject uncontracted_word = ask_utilities.query_variable($sym97$_FULL_WORD, list($$contractedFormOfWord, $sym97$_FULL_WORD, word), rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), UNPROVIDED).first();
                                    SubLObject word_forms = NIL;
                                    SubLObject cdolist_list_var_13 = ask_utilities.query_variable($sym98$_FORM, listS($$partOfSpeech, word, word_type, $list_alt100), rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), UNPROVIDED);
                                    SubLObject form = NIL;
                                    for (form = cdolist_list_var_13.first(); NIL != cdolist_list_var_13; cdolist_list_var_13 = cdolist_list_var_13.rest() , form = cdolist_list_var_13.first()) {
                                        word_forms = cons(cons($$WordSequence, rkf_concept_harvester.rkf_ch_string_tokenize(form)), word_forms);
                                    }
                                    $rtp_contractions_table$.setDynamicValue(cons(list(uncontracted_word, word_forms), $rtp_contractions_table$.getDynamicValue(thread)), thread);
                                }
                            }
                        }
                    }
                }
            }
            return $rtp_contractions_table$.getDynamicValue(thread);
        }
    }

    public static SubLObject maybe_initialize_rtp_contractions_table(SubLObject force_reinitalize) {
        if (force_reinitalize == UNPROVIDED) {
            force_reinitalize = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != force_reinitalize) || (NIL == rtp_datastructures.$rtp_contractions_table$.getDynamicValue(thread))) && (NIL != valid_constant(rtp_datastructures.$$contractedFormOfWord, UNPROVIDED))) {
            SubLObject cdolist_list_var = rtp_datastructures.$list112;
            SubLObject word_type = NIL;
            word_type = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$16 = ask_utilities.query_variable(rtp_datastructures.$sym110$_WORD, list(rtp_datastructures.$$posForms, rtp_datastructures.$sym110$_WORD, word_type), rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), UNPROVIDED);
                SubLObject word = NIL;
                word = cdolist_list_var_$16.first();
                while (NIL != cdolist_list_var_$16) {
                    final SubLObject uncontracted_word = ask_utilities.query_variable(rtp_datastructures.$sym106$_FULL_WORD, list(rtp_datastructures.$$contractedFormOfWord, rtp_datastructures.$sym106$_FULL_WORD, word), rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), UNPROVIDED).first();
                    SubLObject word_forms = NIL;
                    SubLObject cdolist_list_var_$17 = ask_utilities.query_variable(rtp_datastructures.$sym107$_FORM, listS(rtp_datastructures.$$partOfSpeech, word, word_type, rtp_datastructures.$list109), rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), UNPROVIDED);
                    SubLObject form = NIL;
                    form = cdolist_list_var_$17.first();
                    while (NIL != cdolist_list_var_$17) {
                        word_forms = cons(cons(rtp_datastructures.$$WordSequence, rkf_ch_string_tokenize(form)), word_forms);
                        cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                        form = cdolist_list_var_$17.first();
                    } 
                    rtp_datastructures.$rtp_contractions_table$.setDynamicValue(cons(list(uncontracted_word, word_forms), rtp_datastructures.$rtp_contractions_table$.getDynamicValue(thread)), thread);
                    cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                    word = cdolist_list_var_$16.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                word_type = cdolist_list_var.first();
            } 
        }
        return rtp_datastructures.$rtp_contractions_table$.getDynamicValue(thread);
    }

    /**
     * Check whether the bag of words in words conflicts with the
     * constraints of the template rule.
     */
    @LispMethod(comment = "Check whether the bag of words in words conflicts with the\r\nconstraints of the template rule.\nCheck whether the bag of words in words conflicts with the\nconstraints of the template rule.")
    public static final SubLObject template_rule_constraints_matchP_alt(SubLObject tp_rule, SubLObject words) {
        return com.cyc.cycjava.cycl.rtp.rtp_datastructures.verify_words_meet_constraints(com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_constraints(tp_rule), words);
    }

    /**
     * Check whether the bag of words in words conflicts with the
     * constraints of the template rule.
     */
    @LispMethod(comment = "Check whether the bag of words in words conflicts with the\r\nconstraints of the template rule.\nCheck whether the bag of words in words conflicts with the\nconstraints of the template rule.")
    public static SubLObject template_rule_constraints_matchP(final SubLObject tp_rule, final SubLObject words) {
        return rtp_datastructures.verify_words_meet_constraints(rtp_datastructures.template_rule_constraints(tp_rule), words);
    }

    public static final SubLObject verify_words_meet_constraints_alt(SubLObject constraints, SubLObject words) {
        {
            SubLObject cdolist_list_var = constraints;
            SubLObject constraint = NIL;
            for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                if (NIL != rtp_type_checkers.rtp_rule_terminalP(constraint)) {
                    if (NIL == subl_promotions.memberP(constraint, words, symbol_function(STRING_EQUAL), UNPROVIDED)) {
                        return NIL;
                    }
                } else {
                    if ((NIL != rtp_type_checkers.rtp_require_some_itemP(constraint)) || (NIL != rtp_type_checkers.rtp_require_one_itemP(constraint))) {
                        {
                            SubLObject one_of = constraint.rest();
                            SubLObject found = NIL;
                            SubLObject cdolist_list_var_14 = one_of;
                            SubLObject item = NIL;
                            for (item = cdolist_list_var_14.first(); NIL != cdolist_list_var_14; cdolist_list_var_14 = cdolist_list_var_14.rest() , item = cdolist_list_var_14.first()) {
                                if (NIL == found) {
                                    found = com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_member(item, words, symbol_function(STRING_EQUAL));
                                }
                            }
                            if (NIL == found) {
                                return NIL;
                            }
                        }
                    }
                }
            }
        }
        return T;
    }

    public static SubLObject verify_words_meet_constraints(final SubLObject constraints, final SubLObject words) {
        SubLObject cdolist_list_var = constraints;
        SubLObject constraint = NIL;
        constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != rtp_type_checkers.rtp_rule_terminalP(constraint)) {
                if (NIL == memberP(constraint, words, symbol_function(STRING_EQUAL), UNPROVIDED)) {
                    return NIL;
                }
            } else
                if ((NIL != rtp_type_checkers.rtp_require_some_itemP(constraint)) || (NIL != rtp_type_checkers.rtp_require_one_itemP(constraint))) {
                    final SubLObject one_of = constraint.rest();
                    SubLObject found = NIL;
                    SubLObject cdolist_list_var_$18 = one_of;
                    SubLObject item = NIL;
                    item = cdolist_list_var_$18.first();
                    while (NIL != cdolist_list_var_$18) {
                        if (NIL == found) {
                            found = rtp_datastructures.rtp_member(item, words, symbol_function(STRING_EQUAL));
                        }
                        cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                        item = cdolist_list_var_$18.first();
                    } 
                    if (NIL == found) {
                        return NIL;
                    }
                }

            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        } 
        return T;
    }

    /**
     *
     *
     * @param ITEM
     * 		list/string; a template-item (also called a sub-template)
     * @param WORD-LIST
     * 		list of strings
     * @param TEST
     * 		function; the test to be used.
     * @return list; a list that begins with the last element of ITEM that was
    matched from WORD-LIST
     */
    @LispMethod(comment = "@param ITEM\r\n\t\tlist/string; a template-item (also called a sub-template)\r\n@param WORD-LIST\r\n\t\tlist of strings\r\n@param TEST\r\n\t\tfunction; the test to be used.\r\n@return list; a list that begins with the last element of ITEM that was\r\nmatched from WORD-LIST")
    public static final SubLObject rtp_member_alt(SubLObject item, SubLObject word_list, SubLObject test) {
        if (test == UNPROVIDED) {
            test = rtp_vars.$tp_equal$.getGlobalValue();
        }
        if (NIL != rtp_type_checkers.rtp_rule_terminalP(item)) {
            return member(item, word_list, test, UNPROVIDED);
        } else {
            if ((NIL != rtp_type_checkers.rtp_required_itemP(item)) && (NIL != com.cyc.cycjava.cycl.rtp.rtp_datastructures.match_some_of(item, word_list, test))) {
                return com.cyc.cycjava.cycl.rtp.rtp_datastructures.match_some_of(item, word_list, test);
            } else {
                if ((NIL != rtp_type_checkers.rtp_word_sequence_itemP(item)) && (NIL != com.cyc.cycjava.cycl.rtp.rtp_datastructures.match_sequence(item, word_list, test))) {
                    return com.cyc.cycjava.cycl.rtp.rtp_datastructures.match_sequence(item, word_list, test);
                } else {
                    return NIL;
                }
            }
        }
    }

    /**
     *
     *
     * @param ITEM
     * 		list/string; a template-item (also called a sub-template)
     * @param WORD-LIST
     * 		list of strings
     * @param TEST
     * 		function; the test to be used.
     * @return list; a list that begins with the last element of ITEM that was
    matched from WORD-LIST
     */
    @LispMethod(comment = "@param ITEM\r\n\t\tlist/string; a template-item (also called a sub-template)\r\n@param WORD-LIST\r\n\t\tlist of strings\r\n@param TEST\r\n\t\tfunction; the test to be used.\r\n@return list; a list that begins with the last element of ITEM that was\r\nmatched from WORD-LIST")
    public static SubLObject rtp_member(final SubLObject item, final SubLObject word_list, SubLObject test) {
        if (test == UNPROVIDED) {
            test = rtp_vars.$tp_equal$.getGlobalValue();
        }
        if (NIL != rtp_type_checkers.rtp_rule_terminalP(item)) {
            return member(item, word_list, test, UNPROVIDED);
        }
        if ((NIL != rtp_type_checkers.rtp_required_itemP(item)) && (NIL != rtp_datastructures.match_some_of(item, word_list, test))) {
            return rtp_datastructures.match_some_of(item, word_list, test);
        }
        if ((NIL != rtp_type_checkers.rtp_word_sequence_itemP(item)) && (NIL != rtp_datastructures.match_sequence(item, word_list, test))) {
            return rtp_datastructures.match_sequence(item, word_list, test);
        }
        return NIL;
    }

    /**
     *
     *
     * @param CONSTRAINT-SET
     * 		list; a set of constraints, of the sort accepted by RTP-MEMBER
     * @param WORD-LIST
     * 		list; a list of strings
     * @param TEST
    function
     * 		
     * @return list; a list that begins with the last element of ITEM that was
    matched from WORD-LIST by some element of CONSTRAINT-SET
     */
    @LispMethod(comment = "@param CONSTRAINT-SET\r\n\t\tlist; a set of constraints, of the sort accepted by RTP-MEMBER\r\n@param WORD-LIST\r\n\t\tlist; a list of strings\r\n@param TEST\nfunction\r\n\t\t\r\n@return list; a list that begins with the last element of ITEM that was\r\nmatched from WORD-LIST by some element of CONSTRAINT-SET")
    public static final SubLObject match_some_of_alt(SubLObject constraint_set, SubLObject word_list, SubLObject test) {
        {
            SubLObject cdolist_list_var = constraint_set.rest();
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_member(item, word_list, test)) {
                    return com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_member(item, word_list, test);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param CONSTRAINT-SET
     * 		list; a set of constraints, of the sort accepted by RTP-MEMBER
     * @param WORD-LIST
     * 		list; a list of strings
     * @param TEST
    function
     * 		
     * @return list; a list that begins with the last element of ITEM that was
    matched from WORD-LIST by some element of CONSTRAINT-SET
     */
    @LispMethod(comment = "@param CONSTRAINT-SET\r\n\t\tlist; a set of constraints, of the sort accepted by RTP-MEMBER\r\n@param WORD-LIST\r\n\t\tlist; a list of strings\r\n@param TEST\nfunction\r\n\t\t\r\n@return list; a list that begins with the last element of ITEM that was\r\nmatched from WORD-LIST by some element of CONSTRAINT-SET")
    public static SubLObject match_some_of(final SubLObject constraint_set, final SubLObject word_list, final SubLObject test) {
        SubLObject cdolist_list_var = constraint_set.rest();
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != rtp_datastructures.rtp_member(item, word_list, test)) {
                return rtp_datastructures.rtp_member(item, word_list, test);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     *
     *
     * @param SEQ
     * 		list; a list of items that must be in the sequence, either strings or #$RequireSome
     * @param WORD-LIST
     * 		list; a list of strings
     * @param TEST
    function
     * 		
     * @return list; a list that begins with the last element of SEQ that was
    matched from WORD-LIST
     */
    @LispMethod(comment = "@param SEQ\r\n\t\tlist; a list of items that must be in the sequence, either strings or #$RequireSome\r\n@param WORD-LIST\r\n\t\tlist; a list of strings\r\n@param TEST\nfunction\r\n\t\t\r\n@return list; a list that begins with the last element of SEQ that was\r\nmatched from WORD-LIST")
    public static final SubLObject match_sequence_alt(SubLObject seq, SubLObject word_list, SubLObject test) {
        if (test == UNPROVIDED) {
            test = rtp_vars.$tp_equal$.getGlobalValue();
        }
        if (NIL != rtp_type_checkers.rtp_word_sequence_itemP(seq)) {
            seq = seq.rest();
        }
        {
            SubLObject result = com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_member(seq.first(), word_list, test);
            SubLObject int_result = NIL;
            while (NIL != result) {
                if (NIL == result) {
                    return NIL;
                }
                int_result = com.cyc.cycjava.cycl.rtp.rtp_datastructures.remove_an_internal_group(seq, result);
                if (NIL != int_result) {
                    return int_result;
                }
                result = com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_member(seq.first(), result, test).rest();
            } 
            return result;
        }
    }

    /**
     *
     *
     * @param SEQ
     * 		list; a list of items that must be in the sequence, either strings or #$RequireSome
     * @param WORD-LIST
     * 		list; a list of strings
     * @param TEST
    function
     * 		
     * @return list; a list that begins with the last element of SEQ that was
    matched from WORD-LIST
     */
    @LispMethod(comment = "@param SEQ\r\n\t\tlist; a list of items that must be in the sequence, either strings or #$RequireSome\r\n@param WORD-LIST\r\n\t\tlist; a list of strings\r\n@param TEST\nfunction\r\n\t\t\r\n@return list; a list that begins with the last element of SEQ that was\r\nmatched from WORD-LIST")
    public static SubLObject match_sequence(SubLObject seq, final SubLObject word_list, SubLObject test) {
        if (test == UNPROVIDED) {
            test = rtp_vars.$tp_equal$.getGlobalValue();
        }
        if (NIL != rtp_type_checkers.rtp_word_sequence_itemP(seq)) {
            seq = seq.rest();
        }
        SubLObject result = rtp_datastructures.rtp_member(seq.first(), word_list, test);
        SubLObject int_result = NIL;
        while (NIL != result) {
            if (NIL == result) {
                return NIL;
            }
            int_result = rtp_datastructures.remove_an_internal_group(seq, result);
            if (NIL != int_result) {
                return int_result;
            }
            result = rtp_datastructures.rtp_member(seq.first(), result, test).rest();
        } 
        return result;
    }

    /**
     *
     *
     * @param SEQUENCE
     * 		list; a list of items that must be in the sequence, either strings or #$RequireSomes
     * @param WORD-LIST;
     * 		a list of strings
     * @return list; a list that begins with the last element of SEQUENCE that was
    matched from WORD-LIST.  Returns nil if the sequence didn't match completely.
     */
    @LispMethod(comment = "@param SEQUENCE\r\n\t\tlist; a list of items that must be in the sequence, either strings or #$RequireSomes\r\n@param WORD-LIST;\r\n\t\ta list of strings\r\n@return list; a list that begins with the last element of SEQUENCE that was\r\nmatched from WORD-LIST.  Returns nil if the sequence didn\'t match completely.")
    public static final SubLObject remove_an_internal_group_alt(SubLObject sequence, SubLObject word_list) {
        {
            SubLObject cdolist_list_var = sequence;
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                if (NIL != rtp_type_checkers.rtp_rule_terminalP(item)) {
                    if ((NIL != word_list) && (NIL != funcall(rtp_vars.$tp_equal$.getGlobalValue(), item, word_list.first()))) {
                        word_list = word_list.rest();
                    } else {
                        return NIL;
                    }
                } else {
                    if (NIL != rtp_type_checkers.rtp_require_one_itemP(item)) {
                        word_list = recognition.remove_require_one(item, list(word_list, ZERO_INTEGER, ZERO_INTEGER), UNPROVIDED).first().first();
                        if (NIL == word_list) {
                            return NIL;
                        }
                    } else {
                        if (NIL != rtp_type_checkers.rtp_require_some_itemP(item)) {
                            word_list = recognition.remove_X_words(item, list(word_list, ZERO_INTEGER, ZERO_INTEGER), UNPROVIDED).first().first();
                            if (NIL == word_list) {
                                return NIL;
                            }
                        } else {
                            return NIL;
                        }
                    }
                }
            }
        }
        if (NIL == word_list) {
            return $COMPLETE;
        }
        return word_list;
    }

    /**
     *
     *
     * @param SEQUENCE
     * 		list; a list of items that must be in the sequence, either strings or #$RequireSomes
     * @param WORD-LIST;
     * 		a list of strings
     * @return list; a list that begins with the last element of SEQUENCE that was
    matched from WORD-LIST.  Returns nil if the sequence didn't match completely.
     */
    @LispMethod(comment = "@param SEQUENCE\r\n\t\tlist; a list of items that must be in the sequence, either strings or #$RequireSomes\r\n@param WORD-LIST;\r\n\t\ta list of strings\r\n@return list; a list that begins with the last element of SEQUENCE that was\r\nmatched from WORD-LIST.  Returns nil if the sequence didn\'t match completely.")
    public static SubLObject remove_an_internal_group(final SubLObject sequence, SubLObject word_list) {
        SubLObject cdolist_list_var = sequence;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != rtp_type_checkers.rtp_rule_terminalP(item)) {
                if ((NIL == word_list) || (NIL == funcall(rtp_vars.$tp_equal$.getGlobalValue(), item, word_list.first()))) {
                    return NIL;
                }
                word_list = word_list.rest();
            } else
                if (NIL != rtp_type_checkers.rtp_require_one_itemP(item)) {
                    word_list = recognition.remove_require_one(item, list(word_list, ZERO_INTEGER, ZERO_INTEGER), UNPROVIDED).first().first();
                    if (NIL == word_list) {
                        return NIL;
                    }
                } else {
                    if (NIL == rtp_type_checkers.rtp_require_some_itemP(item)) {
                        return NIL;
                    }
                    word_list = recognition.remove_X_words(item, list(word_list, ZERO_INTEGER, ZERO_INTEGER), UNPROVIDED).first().first();
                    if (NIL == word_list) {
                        return NIL;
                    }
                }

            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        if (NIL == word_list) {
            return $COMPLETE;
        }
        return word_list;
    }

    public static final SubLObject rtp_clear_rules_alt() {
        if ($rtp_rules$.getGlobalValue().isHashtable()) {
            clrhash($rtp_rules$.getGlobalValue());
        }
        return $CLEARED;
    }

    public static SubLObject rtp_clear_rules() {
        if (rtp_datastructures.$rtp_rules$.getGlobalValue().isHashtable()) {
            clrhash(rtp_datastructures.$rtp_rules$.getGlobalValue());
        }
        return $CLEARED;
    }

    public static final SubLObject allocate_rtp_rules_alt() {
        if (!$rtp_rules$.getGlobalValue().isHashtable()) {
            $rtp_rules$.setGlobalValue(make_hash_table($rtp_rules_initial_size$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED));
        }
        return com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_clear_rules();
    }

    public static SubLObject allocate_rtp_rules() {
        if (!rtp_datastructures.$rtp_rules$.getGlobalValue().isHashtable()) {
            rtp_datastructures.$rtp_rules$.setGlobalValue(make_hash_table(rtp_datastructures.$rtp_rules_initial_size$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED));
        }
        return rtp_datastructures.rtp_clear_rules();
    }

    public static final SubLObject ensure_rtp_rules_alt() {
        if (!$rtp_rules$.getGlobalValue().isHashtable()) {
            $rtp_rules$.setGlobalValue(make_hash_table($rtp_rules_initial_size$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED));
        }
        return $rtp_rules$.getGlobalValue();
    }

    public static SubLObject ensure_rtp_rules() {
        if (!rtp_datastructures.$rtp_rules$.getGlobalValue().isHashtable()) {
            rtp_datastructures.$rtp_rules$.setGlobalValue(make_hash_table(rtp_datastructures.$rtp_rules_initial_size$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED));
        }
        return rtp_datastructures.$rtp_rules$.getGlobalValue();
    }

    public static final SubLObject add_rtp_rule_alt(SubLObject tp_rule) {
        {
            SubLObject mt = assertions_high.assertion_mt(com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_assertion(tp_rule));
            if ($rtp_rules$.getGlobalValue().isHashtable()) {
                {
                    SubLObject tps_for_mt = gethash(mt, $rtp_rules$.getGlobalValue(), UNPROVIDED);
                    if (NIL == tps_for_mt) {
                        tps_for_mt = make_hash_table($int$500, symbol_function(EQUALP), UNPROVIDED);
                        sethash(mt, $rtp_rules$.getGlobalValue(), tps_for_mt);
                    }
                    sethash(tp_rule, tps_for_mt, tp_rule);
                }
                return tp_rule;
            }
        }
        return NIL;
    }

    public static SubLObject add_rtp_rule(final SubLObject tp_rule) {
        final SubLObject mt = assertion_mt(rtp_datastructures.template_rule_assertion(tp_rule));
        if (rtp_datastructures.$rtp_rules$.getGlobalValue().isHashtable()) {
            SubLObject tps_for_mt = gethash(mt, rtp_datastructures.$rtp_rules$.getGlobalValue(), UNPROVIDED);
            if (NIL == tps_for_mt) {
                tps_for_mt = make_hash_table(rtp_datastructures.$int$500, symbol_function(EQUALP), UNPROVIDED);
                sethash(mt, rtp_datastructures.$rtp_rules$.getGlobalValue(), tps_for_mt);
            }
            sethash(tp_rule, tps_for_mt, tp_rule);
            return tp_rule;
        }
        return NIL;
    }

    public static final SubLObject rtp_rule_existsP_alt(SubLObject tp_rule) {
        {
            SubLObject mt = assertions_high.assertion_mt(com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_assertion(tp_rule));
            if ($rtp_rules$.getGlobalValue().isHashtable()) {
                {
                    SubLObject tps_for_mt = gethash(mt, $rtp_rules$.getGlobalValue(), UNPROVIDED);
                    if (tps_for_mt.isHashtable()) {
                        return gethash(tp_rule, tps_for_mt, UNPROVIDED);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject rtp_rule_existsP(final SubLObject tp_rule) {
        final SubLObject mt = assertion_mt(rtp_datastructures.template_rule_assertion(tp_rule));
        if (rtp_datastructures.$rtp_rules$.getGlobalValue().isHashtable()) {
            final SubLObject tps_for_mt = gethash(mt, rtp_datastructures.$rtp_rules$.getGlobalValue(), UNPROVIDED);
            if (tps_for_mt.isHashtable()) {
                return gethash(tp_rule, tps_for_mt, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_rtp_rule_alt(SubLObject tp_rule) {
        {
            SubLObject mt = assertions_high.assertion_mt(com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_assertion(tp_rule));
            if ($rtp_rules$.getGlobalValue().isHashtable()) {
                remhash(tp_rule, gethash(mt, $rtp_rules$.getGlobalValue(), UNPROVIDED));
            }
            return tp_rule;
        }
    }

    public static SubLObject remove_rtp_rule(final SubLObject tp_rule) {
        final SubLObject mt = assertion_mt(rtp_datastructures.template_rule_assertion(tp_rule));
        if (rtp_datastructures.$rtp_rules$.getGlobalValue().isHashtable()) {
            remhash(tp_rule, gethash(mt, rtp_datastructures.$rtp_rules$.getGlobalValue(), UNPROVIDED));
        }
        return tp_rule;
    }

    public static final SubLObject find_rtp_rules_by_assertion_alt(SubLObject assertion) {
        if ($rtp_rules$.getGlobalValue().isHashtable()) {
            {
                SubLObject tp_rules = NIL;
                SubLObject mt = NIL;
                SubLObject tps_for_mt = NIL;
                {
                    final Iterator cdohash_iterator = getEntrySetIterator($rtp_rules$.getGlobalValue());
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            mt = getEntryKey(cdohash_entry);
                            tps_for_mt = getEntryValue(cdohash_entry);
                            {
                                SubLObject key = NIL;
                                SubLObject value = NIL;
                                {
                                    final Iterator cdohash_iterator_15 = getEntrySetIterator(tps_for_mt);
                                    try {
                                        while (iteratorHasNext(cdohash_iterator_15)) {
                                            final Map.Entry cdohash_entry_16 = iteratorNextEntry(cdohash_iterator_15);
                                            key = getEntryKey(cdohash_entry_16);
                                            value = getEntryValue(cdohash_entry_16);
                                            if (assertion == com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_assertion(key)) {
                                                tp_rules = cons(key, tp_rules);
                                            }
                                        } 
                                    } finally {
                                        releaseEntrySetIterator(cdohash_iterator_15);
                                    }
                                }
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                return tp_rules;
            }
        }
        return NIL;
    }

    public static SubLObject find_rtp_rules_by_assertion(final SubLObject assertion) {
        if (rtp_datastructures.$rtp_rules$.getGlobalValue().isHashtable()) {
            SubLObject tp_rules = NIL;
            SubLObject mt = NIL;
            SubLObject tps_for_mt = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(rtp_datastructures.$rtp_rules$.getGlobalValue());
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    mt = getEntryKey(cdohash_entry);
                    tps_for_mt = getEntryValue(cdohash_entry);
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    final Iterator cdohash_iterator_$19 = getEntrySetIterator(tps_for_mt);
                    try {
                        while (iteratorHasNext(cdohash_iterator_$19)) {
                            final Map.Entry cdohash_entry_$20 = iteratorNextEntry(cdohash_iterator_$19);
                            key = getEntryKey(cdohash_entry_$20);
                            value = getEntryValue(cdohash_entry_$20);
                            if (assertion.eql(rtp_datastructures.template_rule_assertion(key))) {
                                tp_rules = cons(key, tp_rules);
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator_$19);
                    }
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
            return tp_rules;
        }
        return NIL;
    }

    public static final SubLObject rtp_rules_cache_unbuiltP_alt() {
        return makeBoolean(!($rtp_rules$.getGlobalValue().isHashtable() && (NIL == hash_table_utilities.hash_table_empty_p($rtp_rules$.getGlobalValue()))));
    }

    public static SubLObject rtp_rules_cache_unbuiltP() {
        return makeBoolean((!rtp_datastructures.$rtp_rules$.getGlobalValue().isHashtable()) || (NIL != hash_table_empty_p(rtp_datastructures.$rtp_rules$.getGlobalValue())));
    }

    public static final SubLObject dump_rtp_rules_cache_to_stream_alt(SubLObject stream) {
        cfasl_output($rtp_rules$.getGlobalValue(), stream);
        cfasl_output(NIL, stream);
        cfasl_output(NIL, stream);
        cfasl_output(NIL, stream);
        return NIL;
    }

    public static SubLObject dump_rtp_rules_cache_to_stream(final SubLObject stream) {
        cfasl_output(rtp_datastructures.$rtp_rules$.getGlobalValue(), stream);
        cfasl_output(NIL, stream);
        cfasl_output(NIL, stream);
        cfasl_output(NIL, stream);
        return NIL;
    }

    public static final SubLObject load_rtp_rules_cache_from_stream_alt(SubLObject stream) {
        {
            SubLObject dummy = NIL;
            $rtp_rules$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
            dummy = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            dummy = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            dummy = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject load_rtp_rules_cache_from_stream(final SubLObject stream) {
        SubLObject dummy = NIL;
        rtp_datastructures.$rtp_rules$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        dummy = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        dummy = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        dummy = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    /**
     * add a new template to the list of templates.
     *
     * @param TEMPLATE
     * 		list; contains all of the individual elements of the template
     * @param SEM
     * 		list; a cyc pseudo-formula (with keyword vars) representing the semantic output of the template
     * @return :added
     * @unknown adds the new rule to *RTP-RULES*
     */
    @LispMethod(comment = "add a new template to the list of templates.\r\n\r\n@param TEMPLATE\r\n\t\tlist; contains all of the individual elements of the template\r\n@param SEM\r\n\t\tlist; a cyc pseudo-formula (with keyword vars) representing the semantic output of the template\r\n@return :added\r\n@unknown adds the new rule to *RTP-RULES*")
    public static final SubLObject rtp_rule_alt(SubLObject cat, SubLObject template, SubLObject sem) {
        if (!$rtp_rules$.getGlobalValue().isHashtable()) {
            com.cyc.cycjava.cycl.rtp.rtp_datastructures.allocate_rtp_rules();
        }
        {
            SubLObject tp_rule = com.cyc.cycjava.cycl.rtp.rtp_datastructures.new_template_rule(cat, template, sem, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            com.cyc.cycjava.cycl.rtp.rtp_datastructures.add_rtp_rule(tp_rule);
        }
        return $ADDED;
    }

    /**
     * add a new template to the list of templates.
     *
     * @param TEMPLATE
     * 		list; contains all of the individual elements of the template
     * @param SEM
     * 		list; a cyc pseudo-formula (with keyword vars) representing the semantic output of the template
     * @return :added
     * @unknown adds the new rule to *RTP-RULES*
     */
    @LispMethod(comment = "add a new template to the list of templates.\r\n\r\n@param TEMPLATE\r\n\t\tlist; contains all of the individual elements of the template\r\n@param SEM\r\n\t\tlist; a cyc pseudo-formula (with keyword vars) representing the semantic output of the template\r\n@return :added\r\n@unknown adds the new rule to *RTP-RULES*")
    public static SubLObject rtp_rule(final SubLObject cat, final SubLObject template, final SubLObject sem) {
        if (!rtp_datastructures.$rtp_rules$.getGlobalValue().isHashtable()) {
            rtp_datastructures.allocate_rtp_rules();
        }
        final SubLObject tp_rule = rtp_datastructures.new_template_rule(cat, template, sem, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        rtp_datastructures.add_rtp_rule(tp_rule);
        return $ADDED;
    }

    /**
     *
     *
     * @param TEMPLATE
     * 		list; contains all of the individual elements of the template
     * @param SEM
     * 		list; a cyc pseudo-formula (with keyword vars) representing the semantic
     * 		output of the template
     * @return vector; the rule
     */
    @LispMethod(comment = "@param TEMPLATE\r\n\t\tlist; contains all of the individual elements of the template\r\n@param SEM\r\n\t\tlist; a cyc pseudo-formula (with keyword vars) representing the semantic\r\n\t\toutput of the template\r\n@return vector; the rule")
    public static final SubLObject make_rtp_rule_alt(SubLObject cat, SubLObject template, SubLObject sem) {
        {
            SubLObject tp_rule = com.cyc.cycjava.cycl.rtp.rtp_datastructures.new_template_rule(cat, template, sem, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return tp_rule;
        }
    }

    /**
     *
     *
     * @param TEMPLATE
     * 		list; contains all of the individual elements of the template
     * @param SEM
     * 		list; a cyc pseudo-formula (with keyword vars) representing the semantic
     * 		output of the template
     * @return vector; the rule
     */
    @LispMethod(comment = "@param TEMPLATE\r\n\t\tlist; contains all of the individual elements of the template\r\n@param SEM\r\n\t\tlist; a cyc pseudo-formula (with keyword vars) representing the semantic\r\n\t\toutput of the template\r\n@return vector; the rule")
    public static SubLObject make_rtp_rule(final SubLObject cat, final SubLObject template, final SubLObject sem) {
        final SubLObject tp_rule = rtp_datastructures.new_template_rule(cat, template, sem, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return tp_rule;
    }

    /**
     *
     *
     * @param RULE;
     * 		an rtp template
     * @return atom; the category of the template/rule
     */
    @LispMethod(comment = "@param RULE;\r\n\t\tan rtp template\r\n@return atom; the category of the template/rule")
    public static final SubLObject rule_cat_alt(SubLObject rule) {
        return com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_category(rule);
    }

    /**
     *
     *
     * @param RULE;
     * 		an rtp template
     * @return atom; the category of the template/rule
     */
    @LispMethod(comment = "@param RULE;\r\n\t\tan rtp template\r\n@return atom; the category of the template/rule")
    public static SubLObject rule_cat(final SubLObject rule) {
        return rtp_datastructures.template_rule_category(rule);
    }

    /**
     *
     *
     * @param RULE;
     * 		an rtp template
     * @return atom; the parsing template of the template/rule
     */
    @LispMethod(comment = "@param RULE;\r\n\t\tan rtp template\r\n@return atom; the parsing template of the template/rule")
    public static final SubLObject rule_template_alt(SubLObject rule) {
        return com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_template(rule);
    }

    /**
     *
     *
     * @param RULE;
     * 		an rtp template
     * @return atom; the parsing template of the template/rule
     */
    @LispMethod(comment = "@param RULE;\r\n\t\tan rtp template\r\n@return atom; the parsing template of the template/rule")
    public static SubLObject rule_template(final SubLObject rule) {
        return rtp_datastructures.template_rule_template(rule);
    }

    /**
     *
     *
     * @param RULE;
     * 		an rtp template
     * @return atom; the semantics of the template/rule
     */
    @LispMethod(comment = "@param RULE;\r\n\t\tan rtp template\r\n@return atom; the semantics of the template/rule")
    public static final SubLObject rule_sem_alt(SubLObject rule) {
        return com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_transformation(rule);
    }

    /**
     *
     *
     * @param RULE;
     * 		an rtp template
     * @return atom; the semantics of the template/rule
     */
    @LispMethod(comment = "@param RULE;\r\n\t\tan rtp template\r\n@return atom; the semantics of the template/rule")
    public static SubLObject rule_sem(final SubLObject rule) {
        return rtp_datastructures.template_rule_transformation(rule);
    }

    public static final SubLObject clear_template_rules_master_index_alt() {
        if (NIL != dictionary.dictionary_p($template_rules_master_index$.getGlobalValue())) {
            dictionary.clear_dictionary($template_rules_master_index$.getGlobalValue());
        }
        return $template_rules_master_index$.getGlobalValue();
    }

    public static SubLObject clear_template_rules_master_index() {
        if (NIL != dictionary_p(rtp_datastructures.$template_rules_master_index$.getGlobalValue())) {
            clear_dictionary(rtp_datastructures.$template_rules_master_index$.getGlobalValue());
        }
        return rtp_datastructures.$template_rules_master_index$.getGlobalValue();
    }

    public static final SubLObject allocate_template_rules_master_index_alt() {
        if (NIL == dictionary.dictionary_p($template_rules_master_index$.getGlobalValue())) {
            $template_rules_master_index$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        }
        return com.cyc.cycjava.cycl.rtp.rtp_datastructures.clear_template_rules_master_index();
    }

    public static SubLObject allocate_template_rules_master_index() {
        if (NIL == dictionary_p(rtp_datastructures.$template_rules_master_index$.getGlobalValue())) {
            rtp_datastructures.$template_rules_master_index$.setGlobalValue(new_dictionary(UNPROVIDED, UNPROVIDED));
        }
        return rtp_datastructures.clear_template_rules_master_index();
    }

    public static final SubLObject ensure_template_rules_master_index_alt() {
        if (NIL == dictionary.dictionary_p($template_rules_master_index$.getGlobalValue())) {
            com.cyc.cycjava.cycl.rtp.rtp_datastructures.allocate_template_rules_master_index();
        }
        return $ENSURED;
    }

    public static SubLObject ensure_template_rules_master_index() {
        if (NIL == dictionary_p(rtp_datastructures.$template_rules_master_index$.getGlobalValue())) {
            rtp_datastructures.allocate_template_rules_master_index();
        }
        return $ENSURED;
    }

    public static final SubLObject enumerate_all_template_categories_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject categories = NIL;
                if (NIL != dictionary.dictionary_p($template_rules_master_index$.getGlobalValue())) {
                    {
                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($template_rules_master_index$.getGlobalValue()));
                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject category = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject rule_set = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                categories = cons(category, categories);
                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                            }
                        } 
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    }
                }
                return categories;
            }
        }
    }

    public static SubLObject enumerate_all_template_categories() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject categories = NIL;
        if (NIL != dictionary_p(rtp_datastructures.$template_rules_master_index$.getGlobalValue())) {
            SubLObject iteration_state;
            for (iteration_state = do_dictionary_contents_state(dictionary_contents(rtp_datastructures.$template_rules_master_index$.getGlobalValue())); NIL == do_dictionary_contents_doneP(iteration_state); iteration_state = do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject category = do_dictionary_contents_key_value(iteration_state);
                final SubLObject rule_set = thread.secondMultipleValue();
                thread.resetMultipleValues();
                categories = cons(category, categories);
            }
            do_dictionary_contents_finalize(iteration_state);
        }
        return categories;
    }

    public static final SubLObject categorized_template_rule_set_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject categorized_template_rule_set_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject categorized_template_rule_set_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rtp.rtp_datastructures.$categorized_template_rule_set_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject categorized_template_rule_set_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rtp.rtp_datastructures.$categorized_template_rule_set_native.class ? T : NIL;
    }

    public static final SubLObject categorized_template_rule_set_mentions_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CATEGORIZED_TEMPLATE_RULE_SET_P);
        return v_object.getField2();
    }

    public static SubLObject categorized_template_rule_set_mentions(final SubLObject v_object) {
        assert NIL != rtp_datastructures.categorized_template_rule_set_p(v_object) : "! rtp_datastructures.categorized_template_rule_set_p(v_object) " + "rtp_datastructures.categorized_template_rule_set_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject categorized_template_rule_set_generic_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CATEGORIZED_TEMPLATE_RULE_SET_P);
        return v_object.getField3();
    }

    public static SubLObject categorized_template_rule_set_generic(final SubLObject v_object) {
        assert NIL != rtp_datastructures.categorized_template_rule_set_p(v_object) : "! rtp_datastructures.categorized_template_rule_set_p(v_object) " + "rtp_datastructures.categorized_template_rule_set_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject categorized_template_rule_set_key_terminal_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CATEGORIZED_TEMPLATE_RULE_SET_P);
        return v_object.getField4();
    }

    public static SubLObject categorized_template_rule_set_key_terminal(final SubLObject v_object) {
        assert NIL != rtp_datastructures.categorized_template_rule_set_p(v_object) : "! rtp_datastructures.categorized_template_rule_set_p(v_object) " + "rtp_datastructures.categorized_template_rule_set_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_categorized_template_rule_set_mentions_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CATEGORIZED_TEMPLATE_RULE_SET_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_categorized_template_rule_set_mentions(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_datastructures.categorized_template_rule_set_p(v_object) : "! rtp_datastructures.categorized_template_rule_set_p(v_object) " + "rtp_datastructures.categorized_template_rule_set_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_categorized_template_rule_set_generic_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CATEGORIZED_TEMPLATE_RULE_SET_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_categorized_template_rule_set_generic(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_datastructures.categorized_template_rule_set_p(v_object) : "! rtp_datastructures.categorized_template_rule_set_p(v_object) " + "rtp_datastructures.categorized_template_rule_set_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_categorized_template_rule_set_key_terminal_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CATEGORIZED_TEMPLATE_RULE_SET_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_categorized_template_rule_set_key_terminal(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_datastructures.categorized_template_rule_set_p(v_object) : "! rtp_datastructures.categorized_template_rule_set_p(v_object) " + "rtp_datastructures.categorized_template_rule_set_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_categorized_template_rule_set_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rtp.rtp_datastructures.$categorized_template_rule_set_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($MENTIONS)) {
                        com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_categorized_template_rule_set_mentions(v_new, current_value);
                    } else {
                        if (pcase_var.eql($GENERIC)) {
                            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_categorized_template_rule_set_generic(v_new, current_value);
                        } else {
                            if (pcase_var.eql($KEY_TERMINAL)) {
                                com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_categorized_template_rule_set_key_terminal(v_new, current_value);
                            } else {
                                Errors.error($str_alt47$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_categorized_template_rule_set(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rtp.rtp_datastructures.$categorized_template_rule_set_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($MENTIONS)) {
                rtp_datastructures._csetf_categorized_template_rule_set_mentions(v_new, current_value);
            } else
                if (pcase_var.eql($GENERIC)) {
                    rtp_datastructures._csetf_categorized_template_rule_set_generic(v_new, current_value);
                } else
                    if (pcase_var.eql($KEY_TERMINAL)) {
                        rtp_datastructures._csetf_categorized_template_rule_set_key_terminal(v_new, current_value);
                    } else {
                        Errors.error(rtp_datastructures.$str48$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_categorized_template_rule_set(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, rtp_datastructures.MAKE_CATEGORIZED_TEMPLATE_RULE_SET, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $MENTIONS, rtp_datastructures.categorized_template_rule_set_mentions(obj));
        funcall(visitor_fn, obj, $SLOT, $GENERIC, rtp_datastructures.categorized_template_rule_set_generic(obj));
        funcall(visitor_fn, obj, $SLOT, $KEY_TERMINAL, rtp_datastructures.categorized_template_rule_set_key_terminal(obj));
        funcall(visitor_fn, obj, $END, rtp_datastructures.MAKE_CATEGORIZED_TEMPLATE_RULE_SET, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_categorized_template_rule_set_method(final SubLObject obj, final SubLObject visitor_fn) {
        return rtp_datastructures.visit_defstruct_categorized_template_rule_set(obj, visitor_fn);
    }

    /**
     * Construct a new template rule set and return it. Base the size assumptions
     * on the size for that template category.
     */
    @LispMethod(comment = "Construct a new template rule set and return it. Base the size assumptions\r\non the size for that template category.\nConstruct a new template rule set and return it. Base the size assumptions\non the size for that template category.")
    public static final SubLObject new_categorized_template_rule_set_alt(SubLObject initial_size) {
        if (initial_size == UNPROVIDED) {
            initial_size = TWENTY_INTEGER;
        }
        {
            SubLObject rule_set = com.cyc.cycjava.cycl.rtp.rtp_datastructures.make_categorized_template_rule_set(UNPROVIDED);
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_categorized_template_rule_set_mentions(rule_set, make_hash_table(initial_size, symbol_function(EQUALP), UNPROVIDED));
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_categorized_template_rule_set_key_terminal(rule_set, make_hash_table(initial_size, symbol_function(EQUALP), UNPROVIDED));
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_categorized_template_rule_set_generic(rule_set, make_hash_table(initial_size, UNPROVIDED, UNPROVIDED));
            return rule_set;
        }
    }

    /**
     * Construct a new template rule set and return it. Base the size assumptions
     * on the size for that template category.
     */
    @LispMethod(comment = "Construct a new template rule set and return it. Base the size assumptions\r\non the size for that template category.\nConstruct a new template rule set and return it. Base the size assumptions\non the size for that template category.")
    public static SubLObject new_categorized_template_rule_set(SubLObject initial_size) {
        if (initial_size == UNPROVIDED) {
            initial_size = TWENTY_INTEGER;
        }
        final SubLObject rule_set = rtp_datastructures.make_categorized_template_rule_set(UNPROVIDED);
        rtp_datastructures._csetf_categorized_template_rule_set_mentions(rule_set, make_hash_table(initial_size, symbol_function(EQUALP), UNPROVIDED));
        rtp_datastructures._csetf_categorized_template_rule_set_key_terminal(rule_set, make_hash_table(initial_size, symbol_function(EQUALP), UNPROVIDED));
        rtp_datastructures._csetf_categorized_template_rule_set_generic(rule_set, make_hash_table(initial_size, UNPROVIDED, UNPROVIDED));
        return rule_set;
    }

    public static final SubLObject update_rule_set_mentions_alt(SubLObject rule_set, SubLObject terminal, SubLObject tp_rule) {
        {
            SubLObject mentions = com.cyc.cycjava.cycl.rtp.rtp_datastructures.categorized_template_rule_set_mentions(rule_set);
            SubLObject templates = gethash(terminal, mentions, UNPROVIDED);
            if (NIL == templates) {
                templates = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                sethash(terminal, mentions, templates);
            }
            dictionary_utilities.dictionary_push(templates, tp_rule, tp_rule);
        }
        return NIL;
    }

    public static SubLObject update_rule_set_mentions(final SubLObject rule_set, final SubLObject terminal, final SubLObject tp_rule) {
        final SubLObject mentions = rtp_datastructures.categorized_template_rule_set_mentions(rule_set);
        SubLObject templates = gethash(terminal, mentions, UNPROVIDED);
        if (NIL == templates) {
            templates = new_dictionary(UNPROVIDED, UNPROVIDED);
            sethash(terminal, mentions, templates);
        }
        dictionary_push(templates, tp_rule, tp_rule);
        return NIL;
    }

    public static final SubLObject eliminate_rule_set_mentions_alt(SubLObject rule_set, SubLObject terminal, SubLObject tp_rule) {
        {
            SubLObject mentions = com.cyc.cycjava.cycl.rtp.rtp_datastructures.categorized_template_rule_set_mentions(rule_set);
            SubLObject templates = gethash(terminal, mentions, UNPROVIDED);
            if (NIL != templates) {
                dictionary.dictionary_remove(templates, tp_rule);
            }
        }
        return NIL;
    }

    public static SubLObject eliminate_rule_set_mentions(final SubLObject rule_set, final SubLObject terminal, final SubLObject tp_rule) {
        final SubLObject mentions = rtp_datastructures.categorized_template_rule_set_mentions(rule_set);
        final SubLObject templates = gethash(terminal, mentions, UNPROVIDED);
        if (NIL != templates) {
            dictionary_remove(templates, tp_rule);
        }
        return NIL;
    }

    public static final SubLObject compute_rule_set_mentions_specificity_alt(SubLObject rule_set, SubLObject terminal) {
        {
            SubLObject mentions = com.cyc.cycjava.cycl.rtp.rtp_datastructures.categorized_template_rule_set_mentions(rule_set);
            SubLObject templates = gethash(terminal, mentions, UNPROVIDED);
            return NIL == templates ? ((SubLObject) (ZERO_INTEGER)) : dictionary.dictionary_length(templates);
        }
    }

    public static SubLObject compute_rule_set_mentions_specificity(final SubLObject rule_set, final SubLObject terminal) {
        final SubLObject mentions = rtp_datastructures.categorized_template_rule_set_mentions(rule_set);
        final SubLObject templates = gethash(terminal, mentions, UNPROVIDED);
        return NIL == templates ? ZERO_INTEGER : dictionary_length(templates);
    }

    /**
     * This function merely updates the terminal to tp-rule mapping; which
     * one is the optimal rule set is determined by a different function.
     */
    @LispMethod(comment = "This function merely updates the terminal to tp-rule mapping; which\r\none is the optimal rule set is determined by a different function.\nThis function merely updates the terminal to tp-rule mapping; which\none is the optimal rule set is determined by a different function.")
    public static final SubLObject update_rule_set_key_terminal_alt(SubLObject rule_set, SubLObject terminal, SubLObject tp_rule) {
        {
            SubLObject key_terminal = com.cyc.cycjava.cycl.rtp.rtp_datastructures.categorized_template_rule_set_key_terminal(rule_set);
            SubLObject templates = gethash(terminal, key_terminal, UNPROVIDED);
            if (NIL == templates) {
                templates = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                sethash(terminal, key_terminal, templates);
            }
            dictionary_utilities.dictionary_push(templates, tp_rule, tp_rule);
        }
        return NIL;
    }

    /**
     * This function merely updates the terminal to tp-rule mapping; which
     * one is the optimal rule set is determined by a different function.
     */
    @LispMethod(comment = "This function merely updates the terminal to tp-rule mapping; which\r\none is the optimal rule set is determined by a different function.\nThis function merely updates the terminal to tp-rule mapping; which\none is the optimal rule set is determined by a different function.")
    public static SubLObject update_rule_set_key_terminal(final SubLObject rule_set, final SubLObject terminal, final SubLObject tp_rule) {
        final SubLObject key_terminal = rtp_datastructures.categorized_template_rule_set_key_terminal(rule_set);
        SubLObject templates = gethash(terminal, key_terminal, UNPROVIDED);
        if (NIL == templates) {
            templates = new_dictionary(UNPROVIDED, UNPROVIDED);
            sethash(terminal, key_terminal, templates);
        }
        dictionary_push(templates, tp_rule, tp_rule);
        return NIL;
    }

    public static final SubLObject eliminate_rule_set_key_terminal_alt(SubLObject rule_set, SubLObject terminal, SubLObject tp_rule) {
        {
            SubLObject key_terminal = com.cyc.cycjava.cycl.rtp.rtp_datastructures.categorized_template_rule_set_key_terminal(rule_set);
            SubLObject templates = gethash(terminal, key_terminal, UNPROVIDED);
            if (NIL != templates) {
                dictionary.dictionary_remove(templates, tp_rule);
            }
        }
        return NIL;
    }

    public static SubLObject eliminate_rule_set_key_terminal(final SubLObject rule_set, final SubLObject terminal, final SubLObject tp_rule) {
        final SubLObject key_terminal = rtp_datastructures.categorized_template_rule_set_key_terminal(rule_set);
        final SubLObject templates = gethash(terminal, key_terminal, UNPROVIDED);
        if (NIL != templates) {
            dictionary_remove(templates, tp_rule);
        }
        return NIL;
    }

    public static final SubLObject update_rule_set_generic_alt(SubLObject rule_set, SubLObject tp_rule) {
        {
            SubLObject generic = com.cyc.cycjava.cycl.rtp.rtp_datastructures.categorized_template_rule_set_generic(rule_set);
            sethash(tp_rule, generic, tp_rule);
        }
        return NIL;
    }

    public static SubLObject update_rule_set_generic(final SubLObject rule_set, final SubLObject tp_rule) {
        final SubLObject generic = rtp_datastructures.categorized_template_rule_set_generic(rule_set);
        sethash(tp_rule, generic, tp_rule);
        return NIL;
    }

    public static final SubLObject eliminate_rule_set_generic_alt(SubLObject rule_set, SubLObject tp_rule) {
        {
            SubLObject generic = com.cyc.cycjava.cycl.rtp.rtp_datastructures.categorized_template_rule_set_generic(rule_set);
            remhash(tp_rule, generic);
        }
        return NIL;
    }

    public static SubLObject eliminate_rule_set_generic(final SubLObject rule_set, final SubLObject tp_rule) {
        final SubLObject generic = rtp_datastructures.categorized_template_rule_set_generic(rule_set);
        remhash(tp_rule, generic);
        return NIL;
    }

    /**
     * Retrieve a template rule set by category.
     */
    @LispMethod(comment = "Retrieve a template rule set by category.")
    public static final SubLObject get_categorized_template_rule_set_alt(SubLObject mt, SubLObject category) {
        if (NIL != dictionary.dictionary_p($template_rules_master_index$.getGlobalValue())) {
            {
                SubLObject inner_dict = dictionary.dictionary_lookup($template_rules_master_index$.getGlobalValue(), mt, UNPROVIDED);
                if (NIL != inner_dict) {
                    return dictionary.dictionary_lookup(inner_dict, category, UNPROVIDED);
                } else {
                    return values(NIL, NIL);
                }
            }
        }
        return NIL;
    }

    /**
     * Retrieve a template rule set by category.
     */
    @LispMethod(comment = "Retrieve a template rule set by category.")
    public static SubLObject get_categorized_template_rule_set(final SubLObject mt, final SubLObject category) {
        if (NIL == dictionary_p(rtp_datastructures.$template_rules_master_index$.getGlobalValue())) {
            return NIL;
        }
        final SubLObject inner_dict = dictionary_lookup(rtp_datastructures.$template_rules_master_index$.getGlobalValue(), mt, UNPROVIDED);
        if (NIL != inner_dict) {
            return dictionary_lookup(inner_dict, category, UNPROVIDED);
        }
        return values(NIL, NIL);
    }

    /**
     * Allocate a template rule set by category.
     */
    @LispMethod(comment = "Allocate a template rule set by category.")
    public static final SubLObject add_categorized_template_rule_set_alt(SubLObject mt, SubLObject category) {
        com.cyc.cycjava.cycl.rtp.rtp_datastructures.ensure_template_rules_master_index();
        {
            SubLObject rule_set = com.cyc.cycjava.cycl.rtp.rtp_datastructures.new_categorized_template_rule_set(UNPROVIDED);
            SubLObject inner_dictionary = dictionary.dictionary_lookup($template_rules_master_index$.getGlobalValue(), mt, UNPROVIDED);
            if (NIL == inner_dictionary) {
                dictionary.dictionary_enter($template_rules_master_index$.getGlobalValue(), mt, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
                inner_dictionary = dictionary.dictionary_lookup($template_rules_master_index$.getGlobalValue(), mt, UNPROVIDED);
            }
            dictionary.dictionary_enter(inner_dictionary, category, rule_set);
            return rule_set;
        }
    }

    @LispMethod(comment = "Allocate a template rule set by category.")
    public static SubLObject add_categorized_template_rule_set(final SubLObject mt, final SubLObject category) {
        rtp_datastructures.ensure_template_rules_master_index();
        final SubLObject rule_set = rtp_datastructures.new_categorized_template_rule_set(UNPROVIDED);
        SubLObject inner_dictionary = dictionary_lookup(rtp_datastructures.$template_rules_master_index$.getGlobalValue(), mt, UNPROVIDED);
        if (NIL == inner_dictionary) {
            dictionary_enter(rtp_datastructures.$template_rules_master_index$.getGlobalValue(), mt, new_dictionary(UNPROVIDED, UNPROVIDED));
            inner_dictionary = dictionary_lookup(rtp_datastructures.$template_rules_master_index$.getGlobalValue(), mt, UNPROVIDED);
        }
        dictionary_enter(inner_dictionary, category, rule_set);
        return rule_set;
    }

    public static final SubLObject find_or_add_categorized_template_rule_set_alt(SubLObject mt, SubLObject category) {
        {
            SubLObject rule_set = com.cyc.cycjava.cycl.rtp.rtp_datastructures.get_categorized_template_rule_set(mt, category);
            if (NIL == com.cyc.cycjava.cycl.rtp.rtp_datastructures.categorized_template_rule_set_p(rule_set)) {
                rule_set = com.cyc.cycjava.cycl.rtp.rtp_datastructures.add_categorized_template_rule_set(mt, category);
            }
            return rule_set;
        }
    }

    public static SubLObject find_or_add_categorized_template_rule_set(final SubLObject mt, final SubLObject category) {
        SubLObject rule_set = rtp_datastructures.get_categorized_template_rule_set(mt, category);
        if (NIL == rtp_datastructures.categorized_template_rule_set_p(rule_set)) {
            rule_set = rtp_datastructures.add_categorized_template_rule_set(mt, category);
        }
        return rule_set;
    }

    public static final SubLObject extend_categorized_template_rule_set_alt(SubLObject mt, SubLObject tp_rule) {
        {
            SubLObject category = com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_category(tp_rule);
            SubLObject rule_set = com.cyc.cycjava.cycl.rtp.rtp_datastructures.find_or_add_categorized_template_rule_set(mt, category);
            SubLObject terminals = com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_terminals(tp_rule);
            if (NIL != com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_in_associative_memoryP(mt, category, terminals, tp_rule)) {
                return tp_rule;
            }
            if (NIL == terminals) {
                com.cyc.cycjava.cycl.rtp.rtp_datastructures.update_rule_set_generic(rule_set, tp_rule);
                return tp_rule;
            }
            {
                SubLObject cdolist_list_var = terminals;
                SubLObject terminal = NIL;
                for (terminal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , terminal = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.rtp.rtp_datastructures.update_rule_set_mentions(rule_set, terminal, tp_rule);
                }
            }
            {
                SubLObject key_terminals = com.cyc.cycjava.cycl.rtp.rtp_datastructures.find_most_specific_terminals_in_rule_set(rule_set, terminals);
                SubLObject cdolist_list_var = key_terminals;
                SubLObject key_terminal = NIL;
                for (key_terminal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , key_terminal = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.rtp.rtp_datastructures.update_rule_set_key_terminal(rule_set, key_terminal, tp_rule);
                }
            }
            {
                SubLObject cdolist_list_var = terminals;
                SubLObject terminal = NIL;
                for (terminal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , terminal = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.rtp.rtp_datastructures.reconsider_rule_set_key_terminal(rule_set, terminal, tp_rule);
                }
            }
        }
        return tp_rule;
    }

    public static SubLObject extend_categorized_template_rule_set(final SubLObject mt, final SubLObject tp_rule) {
        final SubLObject category = rtp_datastructures.template_rule_category(tp_rule);
        final SubLObject rule_set = rtp_datastructures.find_or_add_categorized_template_rule_set(mt, category);
        final SubLObject terminals = rtp_datastructures.template_rule_terminals(tp_rule);
        if (NIL != rtp_datastructures.template_in_associative_memoryP(mt, category, terminals, tp_rule)) {
            return tp_rule;
        }
        if (NIL == terminals) {
            rtp_datastructures.update_rule_set_generic(rule_set, tp_rule);
            return tp_rule;
        }
        SubLObject cdolist_list_var = terminals;
        SubLObject terminal = NIL;
        terminal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rtp_datastructures.update_rule_set_mentions(rule_set, terminal, tp_rule);
            cdolist_list_var = cdolist_list_var.rest();
            terminal = cdolist_list_var.first();
        } 
        SubLObject cdolist_list_var2;
        final SubLObject key_terminals = cdolist_list_var2 = rtp_datastructures.find_most_specific_terminals_in_rule_set(rule_set, terminals);
        SubLObject key_terminal = NIL;
        key_terminal = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            rtp_datastructures.update_rule_set_key_terminal(rule_set, key_terminal, tp_rule);
            cdolist_list_var2 = cdolist_list_var2.rest();
            key_terminal = cdolist_list_var2.first();
        } 
        cdolist_list_var = terminals;
        terminal = NIL;
        terminal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rtp_datastructures.reconsider_rule_set_key_terminal(rule_set, terminal, tp_rule);
            cdolist_list_var = cdolist_list_var.rest();
            terminal = cdolist_list_var.first();
        } 
        return tp_rule;
    }

    public static final SubLObject reduce_categorized_template_rule_set_alt(SubLObject mt, SubLObject tp_rule) {
        {
            SubLObject category = com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_category(tp_rule);
            SubLObject rule_set = com.cyc.cycjava.cycl.rtp.rtp_datastructures.get_categorized_template_rule_set(mt, category);
            SubLObject terminals = com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_terminals(tp_rule);
            if (NIL == terminals) {
                com.cyc.cycjava.cycl.rtp.rtp_datastructures.eliminate_rule_set_generic(rule_set, tp_rule);
                return NIL;
            }
            {
                SubLObject key_terminals = com.cyc.cycjava.cycl.rtp.rtp_datastructures.find_most_specific_terminals_in_rule_set(rule_set, terminals);
                SubLObject cdolist_list_var = key_terminals;
                SubLObject key_terminal = NIL;
                for (key_terminal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , key_terminal = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.rtp.rtp_datastructures.eliminate_rule_set_key_terminal(rule_set, key_terminal, tp_rule);
                }
            }
            {
                SubLObject cdolist_list_var = terminals;
                SubLObject terminal = NIL;
                for (terminal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , terminal = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.rtp.rtp_datastructures.eliminate_rule_set_mentions(rule_set, terminal, tp_rule);
                }
            }
            {
                SubLObject cdolist_list_var = terminals;
                SubLObject terminal = NIL;
                for (terminal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , terminal = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.rtp.rtp_datastructures.recompute_rule_set_key_terminal(rule_set, terminal);
                }
            }
        }
        return NIL;
    }

    public static SubLObject reduce_categorized_template_rule_set(final SubLObject mt, final SubLObject tp_rule) {
        final SubLObject category = rtp_datastructures.template_rule_category(tp_rule);
        final SubLObject rule_set = rtp_datastructures.get_categorized_template_rule_set(mt, category);
        final SubLObject terminals = rtp_datastructures.template_rule_terminals(tp_rule);
        if (NIL == terminals) {
            rtp_datastructures.eliminate_rule_set_generic(rule_set, tp_rule);
            return NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject key_terminals = cdolist_list_var = rtp_datastructures.find_most_specific_terminals_in_rule_set(rule_set, terminals);
        SubLObject key_terminal = NIL;
        key_terminal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rtp_datastructures.eliminate_rule_set_key_terminal(rule_set, key_terminal, tp_rule);
            cdolist_list_var = cdolist_list_var.rest();
            key_terminal = cdolist_list_var.first();
        } 
        SubLObject cdolist_list_var2 = terminals;
        SubLObject terminal = NIL;
        terminal = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            rtp_datastructures.eliminate_rule_set_mentions(rule_set, terminal, tp_rule);
            cdolist_list_var2 = cdolist_list_var2.rest();
            terminal = cdolist_list_var2.first();
        } 
        cdolist_list_var2 = terminals;
        terminal = NIL;
        terminal = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            rtp_datastructures.recompute_rule_set_key_terminal(rule_set, terminal);
            cdolist_list_var2 = cdolist_list_var2.rest();
            terminal = cdolist_list_var2.first();
        } 
        return NIL;
    }

    /**
     * Check whether each of the templates for this terminal still is being
     * indexed under the most specific key in the key-terminal index of the
     * rule set. Motion those out that are not.
     */
    @LispMethod(comment = "Check whether each of the templates for this terminal still is being\r\nindexed under the most specific key in the key-terminal index of the\r\nrule set. Motion those out that are not.\nCheck whether each of the templates for this terminal still is being\nindexed under the most specific key in the key-terminal index of the\nrule set. Motion those out that are not.")
    public static final SubLObject reconsider_rule_set_key_terminal_alt(SubLObject rule_set, SubLObject terminal, SubLObject tp_rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject key_terminal = com.cyc.cycjava.cycl.rtp.rtp_datastructures.categorized_template_rule_set_key_terminal(rule_set);
                SubLObject templates = gethash(terminal, key_terminal, UNPROVIDED);
                SubLObject updates = NIL;
                if (NIL == templates) {
                    com.cyc.cycjava.cycl.rtp.rtp_datastructures.update_rule_set_key_terminal(rule_set, terminal, tp_rule);
                    return NIL;
                }
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(templates));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject template = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject value = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (template != tp_rule) {
                                {
                                    SubLObject terminals = com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_terminals(template);
                                    SubLObject keys = com.cyc.cycjava.cycl.rtp.rtp_datastructures.find_most_specific_terminals_in_rule_set(rule_set, terminals);
                                    if (NIL == subl_promotions.memberP(terminal, keys, UNPROVIDED, UNPROVIDED)) {
                                        updates = cons(cons(keys, template), updates);
                                    }
                                }
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                {
                    SubLObject cdolist_list_var = updates;
                    SubLObject update = NIL;
                    for (update = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , update = cdolist_list_var.first()) {
                        {
                            SubLObject keys = update.first();
                            SubLObject rule = update.rest();
                            dictionary.dictionary_remove(templates, rule);
                            {
                                SubLObject cdolist_list_var_17 = keys;
                                SubLObject key = NIL;
                                for (key = cdolist_list_var_17.first(); NIL != cdolist_list_var_17; cdolist_list_var_17 = cdolist_list_var_17.rest() , key = cdolist_list_var_17.first()) {
                                    com.cyc.cycjava.cycl.rtp.rtp_datastructures.update_rule_set_key_terminal(rule_set, key, rule);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Check whether each of the templates for this terminal still is being\r\nindexed under the most specific key in the key-terminal index of the\r\nrule set. Motion those out that are not.\nCheck whether each of the templates for this terminal still is being\nindexed under the most specific key in the key-terminal index of the\nrule set. Motion those out that are not.")
    public static SubLObject reconsider_rule_set_key_terminal(final SubLObject rule_set, final SubLObject terminal, final SubLObject tp_rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject key_terminal = rtp_datastructures.categorized_template_rule_set_key_terminal(rule_set);
        final SubLObject templates = gethash(terminal, key_terminal, UNPROVIDED);
        SubLObject updates = NIL;
        if (NIL == templates) {
            rtp_datastructures.update_rule_set_key_terminal(rule_set, terminal, tp_rule);
            return NIL;
        }
        SubLObject iteration_state;
        for (iteration_state = do_dictionary_contents_state(dictionary_contents(templates)); NIL == do_dictionary_contents_doneP(iteration_state); iteration_state = do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject template = do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (!template.eql(tp_rule)) {
                final SubLObject terminals = rtp_datastructures.template_rule_terminals(template);
                final SubLObject keys = rtp_datastructures.find_most_specific_terminals_in_rule_set(rule_set, terminals);
                if (NIL == memberP(terminal, keys, UNPROVIDED, UNPROVIDED)) {
                    updates = cons(cons(keys, template), updates);
                }
            }
        }
        do_dictionary_contents_finalize(iteration_state);
        SubLObject cdolist_list_var = updates;
        SubLObject update = NIL;
        update = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject keys2 = update.first();
            final SubLObject rule = update.rest();
            dictionary_remove(templates, rule);
            SubLObject cdolist_list_var_$21 = keys2;
            SubLObject key = NIL;
            key = cdolist_list_var_$21.first();
            while (NIL != cdolist_list_var_$21) {
                rtp_datastructures.update_rule_set_key_terminal(rule_set, key, rule);
                cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                key = cdolist_list_var_$21.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            update = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Check all the templates for this terminal to determine which is now
     * the optimal one to index by.
     */
    @LispMethod(comment = "Check all the templates for this terminal to determine which is now\r\nthe optimal one to index by.\nCheck all the templates for this terminal to determine which is now\nthe optimal one to index by.")
    public static final SubLObject recompute_rule_set_key_terminal_alt(SubLObject rule_set, SubLObject terminal) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mentions = com.cyc.cycjava.cycl.rtp.rtp_datastructures.categorized_template_rule_set_mentions(rule_set);
                SubLObject key_terminals = com.cyc.cycjava.cycl.rtp.rtp_datastructures.categorized_template_rule_set_key_terminal(rule_set);
                SubLObject templates = gethash(terminal, mentions, UNPROVIDED);
                SubLObject key_templates = gethash(terminal, key_terminals, UNPROVIDED);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(templates));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject template = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject value = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL == dictionary.dictionary_lookup(key_templates, template, UNPROVIDED)) {
                            {
                                SubLObject terminals = com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_terminals(template);
                                SubLObject keys = com.cyc.cycjava.cycl.rtp.rtp_datastructures.find_most_specific_terminals_in_rule_set(rule_set, terminals);
                                if (NIL != subl_promotions.memberP(terminal, keys, UNPROVIDED, UNPROVIDED)) {
                                    com.cyc.cycjava.cycl.rtp.rtp_datastructures.update_rule_set_key_terminal(rule_set, terminal, template);
                                }
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Check all the templates for this terminal to determine which is now\r\nthe optimal one to index by.\nCheck all the templates for this terminal to determine which is now\nthe optimal one to index by.")
    public static SubLObject recompute_rule_set_key_terminal(final SubLObject rule_set, final SubLObject terminal) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mentions = rtp_datastructures.categorized_template_rule_set_mentions(rule_set);
        final SubLObject key_terminals = rtp_datastructures.categorized_template_rule_set_key_terminal(rule_set);
        final SubLObject templates = gethash(terminal, mentions, UNPROVIDED);
        final SubLObject key_templates = gethash(terminal, key_terminals, UNPROVIDED);
        SubLObject iteration_state;
        for (iteration_state = do_dictionary_contents_state(dictionary_contents(templates)); NIL == do_dictionary_contents_doneP(iteration_state); iteration_state = do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject template = do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == dictionary_lookup(key_templates, template, UNPROVIDED)) {
                final SubLObject terminals = rtp_datastructures.template_rule_terminals(template);
                final SubLObject keys = rtp_datastructures.find_most_specific_terminals_in_rule_set(rule_set, terminals);
                if (NIL != memberP(terminal, keys, UNPROVIDED, UNPROVIDED)) {
                    rtp_datastructures.update_rule_set_key_terminal(rule_set, terminal, template);
                }
            }
        }
        do_dictionary_contents_finalize(iteration_state);
        return NIL;
    }

    /**
     * Work your way through the list of rule sets, checking the specificity of
     * each of the terminals, returning the best one.
     */
    @LispMethod(comment = "Work your way through the list of rule sets, checking the specificity of\r\neach of the terminals, returning the best one.\nWork your way through the list of rule sets, checking the specificity of\neach of the terminals, returning the best one.")
    public static final SubLObject find_most_specific_terminal_in_rule_set_alt(SubLObject rule_set, SubLObject terminals) {
        {
            SubLObject best_terminal = NIL;
            SubLObject best_terminal_specificity = $most_positive_fixnum$.getGlobalValue();
            SubLObject specificity = NIL;
            SubLObject cdolist_list_var = terminals;
            SubLObject terminal = NIL;
            for (terminal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , terminal = cdolist_list_var.first()) {
                specificity = com.cyc.cycjava.cycl.rtp.rtp_datastructures.compute_rule_set_mentions_specificity(rule_set, terminal);
                if (specificity.numL(best_terminal_specificity)) {
                }
                best_terminal_specificity = specificity;
                best_terminal = terminal;
            }
            return best_terminal;
        }
    }

    @LispMethod(comment = "Work your way through the list of rule sets, checking the specificity of\r\neach of the terminals, returning the best one.\nWork your way through the list of rule sets, checking the specificity of\neach of the terminals, returning the best one.")
    public static SubLObject find_most_specific_terminal_in_rule_set(final SubLObject rule_set, final SubLObject terminals) {
        SubLObject best_terminal = NIL;
        SubLObject best_terminal_specificity = $most_positive_fixnum$.getGlobalValue();
        SubLObject specificity = NIL;
        SubLObject cdolist_list_var = terminals;
        SubLObject terminal = NIL;
        terminal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            specificity = rtp_datastructures.compute_rule_set_mentions_specificity(rule_set, terminal);
            if (specificity.numL(best_terminal_specificity)) {
            }
            best_terminal_specificity = specificity;
            best_terminal = terminal;
            cdolist_list_var = cdolist_list_var.rest();
            terminal = cdolist_list_var.first();
        } 
        return best_terminal;
    }

    /**
     * Work your way through the list of rule sets, checking the specificity of
     * each of the terminals, returning the best one.
     */
    @LispMethod(comment = "Work your way through the list of rule sets, checking the specificity of\r\neach of the terminals, returning the best one.\nWork your way through the list of rule sets, checking the specificity of\neach of the terminals, returning the best one.")
    public static final SubLObject find_most_specific_terminals_in_rule_set_alt(SubLObject rule_set, SubLObject terminals) {
        {
            SubLObject best_terminals = NIL;
            SubLObject best_terminals_specificity = $most_positive_fixnum$.getGlobalValue();
            SubLObject specificity = NIL;
            SubLObject cdolist_list_var = terminals;
            SubLObject terminal = NIL;
            for (terminal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , terminal = cdolist_list_var.first()) {
                specificity = com.cyc.cycjava.cycl.rtp.rtp_datastructures.compute_rule_set_mentions_specificity(rule_set, terminal);
                if (specificity.numL(best_terminals_specificity)) {
                    best_terminals_specificity = specificity;
                    best_terminals = list(terminal);
                } else {
                    if (specificity.numE(best_terminals_specificity)) {
                        best_terminals = cons(terminal, best_terminals);
                    }
                }
            }
            return best_terminals;
        }
    }

    @LispMethod(comment = "Work your way through the list of rule sets, checking the specificity of\r\neach of the terminals, returning the best one.\nWork your way through the list of rule sets, checking the specificity of\neach of the terminals, returning the best one.")
    public static SubLObject find_most_specific_terminals_in_rule_set(final SubLObject rule_set, final SubLObject terminals) {
        SubLObject best_terminals = NIL;
        SubLObject best_terminals_specificity = $most_positive_fixnum$.getGlobalValue();
        SubLObject specificity = NIL;
        SubLObject cdolist_list_var = terminals;
        SubLObject terminal = NIL;
        terminal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            specificity = rtp_datastructures.compute_rule_set_mentions_specificity(rule_set, terminal);
            if (specificity.numL(best_terminals_specificity)) {
                best_terminals_specificity = specificity;
                best_terminals = list(terminal);
            } else
                if (specificity.numE(best_terminals_specificity)) {
                    best_terminals = cons(terminal, best_terminals);
                }

            cdolist_list_var = cdolist_list_var.rest();
            terminal = cdolist_list_var.first();
        } 
        return best_terminals;
    }

    public static final SubLObject do_templates_for_terminal_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt130);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject tp_rule_var = NIL;
                    SubLObject mt = NIL;
                    SubLObject category = NIL;
                    SubLObject terminal = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt130);
                    tp_rule_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt130);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt130);
                    category = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt130);
                    terminal = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject current_mt = $sym131$CURRENT_MT;
                            SubLObject current_rule = $sym132$CURRENT_RULE;
                            SubLObject mentions = $sym133$MENTIONS;
                            SubLObject templates = $sym134$TEMPLATES;
                            return list(CDOLIST, list(current_mt, list(RELEVANT_TEMPLATE_MTS, mt)), list(CLET, list(list(current_rule, list(GET_CATEGORIZED_TEMPLATE_RULE_SET, current_mt, category))), list(PWHEN, current_rule, list(CLET, list(list(mentions, list(CATEGORIZED_TEMPLATE_RULE_SET_MENTIONS, current_rule))), list(PWHEN, list(HASH_TABLE_P, mentions), list(CLET, list(list(templates, list(GETHASH_WITHOUT_VALUES, terminal, mentions))), list(PWHEN, list(DICTIONARY_P, templates), listS(DO_DICTIONARY_KEYS, list(tp_rule_var, templates), append(body, NIL)))))))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt130);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_templates_for_terminal(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, rtp_datastructures.$list142);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject tp_rule_var = NIL;
        SubLObject mt = NIL;
        SubLObject category = NIL;
        SubLObject terminal = NIL;
        destructuring_bind_must_consp(current, datum, rtp_datastructures.$list142);
        tp_rule_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, rtp_datastructures.$list142);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, rtp_datastructures.$list142);
        category = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, rtp_datastructures.$list142);
        terminal = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject current_mt = rtp_datastructures.$sym143$CURRENT_MT;
            final SubLObject current_rule = rtp_datastructures.$sym144$CURRENT_RULE;
            final SubLObject mentions = rtp_datastructures.$sym145$MENTIONS;
            final SubLObject templates = rtp_datastructures.$sym146$TEMPLATES;
            return list(CDOLIST, list(current_mt, list(rtp_datastructures.RELEVANT_TEMPLATE_MTS, mt)), list(CLET, list(list(current_rule, list(rtp_datastructures.GET_CATEGORIZED_TEMPLATE_RULE_SET, current_mt, category))), list(PWHEN, current_rule, list(CLET, list(list(mentions, list(rtp_datastructures.CATEGORIZED_TEMPLATE_RULE_SET_MENTIONS, current_rule))), list(PWHEN, list(HASH_TABLE_P, mentions), list(CLET, list(list(templates, list(GETHASH_WITHOUT_VALUES, terminal, mentions))), list(PWHEN, list(DICTIONARY_P, templates), listS(rtp_datastructures.DO_DICTIONARY_KEYS, list(tp_rule_var, templates), append(body, NIL)))))))));
        }
        cdestructuring_bind_error(datum, rtp_datastructures.$list142);
        return NIL;
    }

    public static final SubLObject with_clean_rtp_associative_memory_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt144, append(body, NIL));
        }
    }

    public static SubLObject with_clean_rtp_associative_memory(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, rtp_datastructures.$list156, append(body, NIL));
    }

    public static final SubLObject template_in_associative_memoryP_alt(SubLObject mt, SubLObject category, SubLObject terminal_list, SubLObject tp_rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = terminal_list;
                SubLObject current_terminal = NIL;
                for (current_terminal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , current_terminal = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_18 = com.cyc.cycjava.cycl.rtp.rtp_datastructures.relevant_template_mts(mt);
                        SubLObject current_mt = NIL;
                        for (current_mt = cdolist_list_var_18.first(); NIL != cdolist_list_var_18; cdolist_list_var_18 = cdolist_list_var_18.rest() , current_mt = cdolist_list_var_18.first()) {
                            {
                                SubLObject current_rule = com.cyc.cycjava.cycl.rtp.rtp_datastructures.get_categorized_template_rule_set(current_mt, category);
                                if (NIL != current_rule) {
                                    {
                                        SubLObject mentions = com.cyc.cycjava.cycl.rtp.rtp_datastructures.categorized_template_rule_set_mentions(current_rule);
                                        if (mentions.isHashtable()) {
                                            {
                                                SubLObject templates = gethash_without_values(current_terminal, mentions, UNPROVIDED);
                                                if (NIL != dictionary.dictionary_p(templates)) {
                                                    {
                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(templates));
                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject rule = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                SubLObject value = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (rule.equalp(tp_rule)) {
                                                                    return T;
                                                                }
                                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                            }
                                                        } 
                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
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
            return NIL;
        }
    }

    public static SubLObject template_in_associative_memoryP(final SubLObject mt, final SubLObject category, final SubLObject terminal_list, final SubLObject tp_rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = terminal_list;
        SubLObject current_terminal = NIL;
        current_terminal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$22 = rtp_datastructures.relevant_template_mts(mt);
            SubLObject current_mt = NIL;
            current_mt = cdolist_list_var_$22.first();
            while (NIL != cdolist_list_var_$22) {
                final SubLObject current_rule = rtp_datastructures.get_categorized_template_rule_set(current_mt, category);
                if (NIL != current_rule) {
                    final SubLObject mentions = rtp_datastructures.categorized_template_rule_set_mentions(current_rule);
                    if (mentions.isHashtable()) {
                        final SubLObject templates = gethash_without_values(current_terminal, mentions, UNPROVIDED);
                        if (NIL != dictionary_p(templates)) {
                            SubLObject iteration_state;
                            for (iteration_state = do_dictionary_contents_state(dictionary_contents(templates)); NIL == do_dictionary_contents_doneP(iteration_state); iteration_state = do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                final SubLObject rule = do_dictionary_contents_key_value(iteration_state);
                                final SubLObject value = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (rule.equalp(tp_rule)) {
                                    return T;
                                }
                            }
                            do_dictionary_contents_finalize(iteration_state);
                        }
                    }
                }
                cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                current_mt = cdolist_list_var_$22.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            current_terminal = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject clear_relevant_template_mts_alt() {
        {
            SubLObject cs = $relevant_template_mts_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_relevant_template_mts() {
        final SubLObject cs = rtp_datastructures.$relevant_template_mts_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_relevant_template_mts_alt(SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($relevant_template_mts_caching_state$.getGlobalValue(), list(mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_relevant_template_mts(final SubLObject mt) {
        return caching_state_remove_function_results_with_args(rtp_datastructures.$relevant_template_mts_caching_state$.getGlobalValue(), list(mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject relevant_template_mts_internal_alt(SubLObject mt) {
        return genl_mts.all_spec_mts($$TemplateParsingMt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject relevant_template_mts_internal(final SubLObject mt) {
        return all_genl_mts_among(mt, rtp_datastructures.template_mts(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject relevant_template_mts_alt(SubLObject mt) {
        {
            SubLObject caching_state = $relevant_template_mts_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(RELEVANT_TEMPLATE_MTS, $relevant_template_mts_caching_state$, $int$128, EQL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, $kw11$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw11$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rtp.rtp_datastructures.relevant_template_mts_internal(mt)));
                    memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject relevant_template_mts(final SubLObject mt) {
        SubLObject caching_state = rtp_datastructures.$relevant_template_mts_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(rtp_datastructures.RELEVANT_TEMPLATE_MTS, rtp_datastructures.$relevant_template_mts_caching_state$, rtp_datastructures.$int$128, EQL, ONE_INTEGER, ZERO_INTEGER);
            register_mt_dependent_cache_clear_callback(rtp_datastructures.CLEAR_RELEVANT_TEMPLATE_MTS);
        }
        SubLObject results = caching_state_lookup(caching_state, mt, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(rtp_datastructures.relevant_template_mts_internal(mt)));
            caching_state_put(caching_state, mt, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    public static final SubLObject clear_template_mts_alt() {
        $template_mts$.setGlobalValue(NIL);
        return $template_mts$.getGlobalValue();
    }

    public static SubLObject clear_template_mts() {
        rtp_datastructures.$template_mts$.setGlobalValue(NIL);
        return rtp_datastructures.$template_mts$.getGlobalValue();
    }

    public static final SubLObject template_mts_alt() {
        if (NIL == $template_mts$.getGlobalValue()) {
            $template_mts$.setGlobalValue(genl_mts.all_spec_mts($$TemplateParsingMt, UNPROVIDED, UNPROVIDED));
        }
        return $template_mts$.getGlobalValue();
    }

    public static SubLObject template_mts() {
        if (NIL == rtp_datastructures.$template_mts$.getGlobalValue()) {
            rtp_datastructures.$template_mts$.setGlobalValue(all_spec_mts(rtp_datastructures.$$TemplateParsingMt, UNPROVIDED, UNPROVIDED));
        }
        return rtp_datastructures.$template_mts$.getGlobalValue();
    }

    /**
     * Guaranteed to be constructive
     */
    @LispMethod(comment = "Guaranteed to be constructive")
    public static final SubLObject get_templates_for_terminal_alt(SubLObject mt, SubLObject category, SubLObject terminal) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.rtp.rtp_datastructures.relevant_template_mts(mt);
                SubLObject current_mt = NIL;
                for (current_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , current_mt = cdolist_list_var.first()) {
                    {
                        SubLObject current_rule = com.cyc.cycjava.cycl.rtp.rtp_datastructures.get_categorized_template_rule_set(current_mt, category);
                        if (NIL != current_rule) {
                            {
                                SubLObject mentions = com.cyc.cycjava.cycl.rtp.rtp_datastructures.categorized_template_rule_set_mentions(current_rule);
                                if (mentions.isHashtable()) {
                                    {
                                        SubLObject templates = gethash_without_values(terminal, mentions, UNPROVIDED);
                                        if (NIL != dictionary.dictionary_p(templates)) {
                                            {
                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(templates));
                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject tp_rule = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                        SubLObject value = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        result = cons(tp_rule, result);
                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                    }
                                                } 
                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return nreverse(result);
            }
        }
    }

    @LispMethod(comment = "Guaranteed to be constructive")
    public static SubLObject get_templates_for_terminal(final SubLObject mt, final SubLObject category, final SubLObject terminal) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject cdolist_list_var = rtp_datastructures.relevant_template_mts(mt);
        SubLObject current_mt = NIL;
        current_mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject current_rule = rtp_datastructures.get_categorized_template_rule_set(current_mt, category);
            if (NIL != current_rule) {
                final SubLObject mentions = rtp_datastructures.categorized_template_rule_set_mentions(current_rule);
                if (mentions.isHashtable()) {
                    final SubLObject templates = gethash_without_values(terminal, mentions, UNPROVIDED);
                    if (NIL != dictionary_p(templates)) {
                        SubLObject iteration_state;
                        for (iteration_state = do_dictionary_contents_state(dictionary_contents(templates)); NIL == do_dictionary_contents_doneP(iteration_state); iteration_state = do_dictionary_contents_next(iteration_state)) {
                            thread.resetMultipleValues();
                            final SubLObject tp_rule = do_dictionary_contents_key_value(iteration_state);
                            final SubLObject value = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            result = cons(tp_rule, result);
                        }
                        do_dictionary_contents_finalize(iteration_state);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            current_mt = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject get_best_templates_for_terminal_alt(SubLObject mt, SubLObject category, SubLObject terminal) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject rule_set = NIL;
                SubLObject v_answer = NIL;
                {
                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.rtp.rtp_datastructures.relevant_template_mts(mt);
                    SubLObject current_mt = NIL;
                    for (current_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , current_mt = cdolist_list_var.first()) {
                        {
                            SubLObject new_rule_set = com.cyc.cycjava.cycl.rtp.rtp_datastructures.get_categorized_template_rule_set(current_mt, category);
                            if (NIL != new_rule_set) {
                                rule_set = cons(new_rule_set, rule_set);
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = rule_set;
                    SubLObject current_rule_set = NIL;
                    for (current_rule_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , current_rule_set = cdolist_list_var.first()) {
                        {
                            SubLObject key_terminal = com.cyc.cycjava.cycl.rtp.rtp_datastructures.categorized_template_rule_set_key_terminal(current_rule_set);
                            if (key_terminal.isHashtable()) {
                                {
                                    SubLObject templates = gethash(terminal, key_terminal, UNPROVIDED);
                                    if (NIL != dictionary.dictionary_p(templates)) {
                                        {
                                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(templates));
                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject tp_rule = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                    SubLObject value = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    v_answer = cons(tp_rule, v_answer);
                                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                }
                                            } 
                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return v_answer;
            }
        }
    }

    public static SubLObject get_best_templates_for_terminal(final SubLObject mt, final SubLObject category, final SubLObject terminal) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rule_set = NIL;
        SubLObject v_answer = NIL;
        SubLObject cdolist_list_var = rtp_datastructures.relevant_template_mts(mt);
        SubLObject current_mt = NIL;
        current_mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject new_rule_set = rtp_datastructures.get_categorized_template_rule_set(current_mt, category);
            if (NIL != new_rule_set) {
                rule_set = cons(new_rule_set, rule_set);
            }
            cdolist_list_var = cdolist_list_var.rest();
            current_mt = cdolist_list_var.first();
        } 
        cdolist_list_var = rule_set;
        SubLObject current_rule_set = NIL;
        current_rule_set = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject key_terminal = rtp_datastructures.categorized_template_rule_set_key_terminal(current_rule_set);
            if (key_terminal.isHashtable()) {
                final SubLObject templates = gethash(terminal, key_terminal, UNPROVIDED);
                if (NIL != dictionary_p(templates)) {
                    SubLObject iteration_state;
                    for (iteration_state = do_dictionary_contents_state(dictionary_contents(templates)); NIL == do_dictionary_contents_doneP(iteration_state); iteration_state = do_dictionary_contents_next(iteration_state)) {
                        thread.resetMultipleValues();
                        final SubLObject tp_rule = do_dictionary_contents_key_value(iteration_state);
                        final SubLObject value = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        v_answer = cons(tp_rule, v_answer);
                    }
                    do_dictionary_contents_finalize(iteration_state);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            current_rule_set = cdolist_list_var.first();
        } 
        return v_answer;
    }

    public static final SubLObject get_generic_templates_for_category_alt(SubLObject mt, SubLObject category) {
        {
            SubLObject rule_set = NIL;
            SubLObject v_answer = NIL;
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.rtp.rtp_datastructures.relevant_template_mts(mt);
                SubLObject current_mt = NIL;
                for (current_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , current_mt = cdolist_list_var.first()) {
                    {
                        SubLObject current_rules = com.cyc.cycjava.cycl.rtp.rtp_datastructures.get_categorized_template_rule_set(current_mt, category);
                        if (NIL != current_rules) {
                            rule_set = cons(current_rules, rule_set);
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = rule_set;
                SubLObject current_rule_set = NIL;
                for (current_rule_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , current_rule_set = cdolist_list_var.first()) {
                    {
                        SubLObject generics = com.cyc.cycjava.cycl.rtp.rtp_datastructures.categorized_template_rule_set_generic(current_rule_set);
                        if (generics.isHashtable()) {
                            {
                                SubLObject template = NIL;
                                SubLObject value = NIL;
                                {
                                    final Iterator cdohash_iterator = getEntrySetIterator(generics);
                                    try {
                                        while (iteratorHasNext(cdohash_iterator)) {
                                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                            template = getEntryKey(cdohash_entry);
                                            value = getEntryValue(cdohash_entry);
                                            v_answer = cons(template, v_answer);
                                        } 
                                    } finally {
                                        releaseEntrySetIterator(cdohash_iterator);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_answer;
        }
    }

    public static SubLObject get_generic_templates_for_category(final SubLObject mt, final SubLObject category) {
        SubLObject rule_set = NIL;
        SubLObject v_answer = NIL;
        SubLObject cdolist_list_var = rtp_datastructures.relevant_template_mts(mt);
        SubLObject current_mt = NIL;
        current_mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject current_rules = rtp_datastructures.get_categorized_template_rule_set(current_mt, category);
            if (NIL != current_rules) {
                rule_set = cons(current_rules, rule_set);
            }
            cdolist_list_var = cdolist_list_var.rest();
            current_mt = cdolist_list_var.first();
        } 
        cdolist_list_var = rule_set;
        SubLObject current_rule_set = NIL;
        current_rule_set = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject generics = rtp_datastructures.categorized_template_rule_set_generic(current_rule_set);
            if (generics.isHashtable()) {
                SubLObject template = NIL;
                SubLObject value = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(generics);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        template = getEntryKey(cdohash_entry);
                        value = getEntryValue(cdohash_entry);
                        v_answer = cons(template, v_answer);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            current_rule_set = cdolist_list_var.first();
        } 
        return v_answer;
    }

    public static final SubLObject enumerate_all_terminals_alt(SubLObject category) {
        {
            SubLObject mt_list = hash_table_utilities.hash_table_keys($rtp_rules$.getGlobalValue());
            SubLObject rule_set = NIL;
            SubLObject items = NIL;
            {
                SubLObject cdolist_list_var = mt_list;
                SubLObject current_mt = NIL;
                for (current_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , current_mt = cdolist_list_var.first()) {
                    {
                        SubLObject current_rule = com.cyc.cycjava.cycl.rtp.rtp_datastructures.get_categorized_template_rule_set(current_mt, category);
                        if (NIL != current_rule) {
                            rule_set = cons(current_rule, rule_set);
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = rule_set;
                SubLObject current_rule_set = NIL;
                for (current_rule_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , current_rule_set = cdolist_list_var.first()) {
                    {
                        SubLObject mentions = com.cyc.cycjava.cycl.rtp.rtp_datastructures.categorized_template_rule_set_mentions(current_rule_set);
                        SubLObject terminal = NIL;
                        SubLObject templates = NIL;
                        {
                            final Iterator cdohash_iterator = getEntrySetIterator(mentions);
                            try {
                                while (iteratorHasNext(cdohash_iterator)) {
                                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                    terminal = getEntryKey(cdohash_entry);
                                    templates = getEntryValue(cdohash_entry);
                                    if (NIL != rtp_type_checkers.rtp_rule_terminalP(terminal)) {
                                        {
                                            SubLObject item_var = terminal;
                                            if (NIL == member(item_var, items, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                items = cons(item_var, items);
                                            }
                                        }
                                    }
                                } 
                            } finally {
                                releaseEntrySetIterator(cdohash_iterator);
                            }
                        }
                    }
                }
            }
            return Sort.sort(items, symbol_function($sym149$STRING_), UNPROVIDED);
        }
    }

    public static SubLObject enumerate_all_terminals(final SubLObject category) {
        final SubLObject mt_list = hash_table_keys(rtp_datastructures.$rtp_rules$.getGlobalValue());
        SubLObject rule_set = NIL;
        SubLObject items = NIL;
        SubLObject cdolist_list_var = mt_list;
        SubLObject current_mt = NIL;
        current_mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject current_rule = rtp_datastructures.get_categorized_template_rule_set(current_mt, category);
            if (NIL != current_rule) {
                rule_set = cons(current_rule, rule_set);
            }
            cdolist_list_var = cdolist_list_var.rest();
            current_mt = cdolist_list_var.first();
        } 
        cdolist_list_var = rule_set;
        SubLObject current_rule_set = NIL;
        current_rule_set = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject mentions = rtp_datastructures.categorized_template_rule_set_mentions(current_rule_set);
            SubLObject terminal = NIL;
            SubLObject templates = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(mentions);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    terminal = getEntryKey(cdohash_entry);
                    templates = getEntryValue(cdohash_entry);
                    if (NIL != rtp_type_checkers.rtp_rule_terminalP(terminal)) {
                        items = cons(terminal, items);
                    }
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
            cdolist_list_var = cdolist_list_var.rest();
            current_rule_set = cdolist_list_var.first();
        } 
        return Sort.sort(items, symbol_function(rtp_datastructures.$sym162$STRING_), UNPROVIDED);
    }

    public static final SubLObject enumerate_all_best_terminals_alt(SubLObject category) {
        {
            SubLObject mt_list = hash_table_utilities.hash_table_keys($rtp_rules$.getGlobalValue());
            SubLObject rule_sets = NIL;
            SubLObject items = NIL;
            {
                SubLObject cdolist_list_var = mt_list;
                SubLObject current_mt = NIL;
                for (current_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , current_mt = cdolist_list_var.first()) {
                    {
                        SubLObject new_set = com.cyc.cycjava.cycl.rtp.rtp_datastructures.get_categorized_template_rule_set(current_mt, category);
                        if (NIL != new_set) {
                            rule_sets = cons(new_set, rule_sets);
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = rule_sets;
                SubLObject current_rules = NIL;
                for (current_rules = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , current_rules = cdolist_list_var.first()) {
                    {
                        SubLObject key_terminal = com.cyc.cycjava.cycl.rtp.rtp_datastructures.categorized_template_rule_set_key_terminal(current_rules);
                        SubLObject terminal = NIL;
                        SubLObject templates = NIL;
                        {
                            final Iterator cdohash_iterator = getEntrySetIterator(key_terminal);
                            try {
                                while (iteratorHasNext(cdohash_iterator)) {
                                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                    terminal = getEntryKey(cdohash_entry);
                                    templates = getEntryValue(cdohash_entry);
                                    if (NIL != rtp_type_checkers.rtp_rule_terminalP(terminal)) {
                                        {
                                            SubLObject item_var = terminal;
                                            if (NIL == member(item_var, items, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                items = cons(item_var, items);
                                            }
                                        }
                                    }
                                } 
                            } finally {
                                releaseEntrySetIterator(cdohash_iterator);
                            }
                        }
                    }
                }
            }
            return Sort.sort(items, symbol_function($sym149$STRING_), UNPROVIDED);
        }
    }

    public static SubLObject enumerate_all_best_terminals(final SubLObject category) {
        final SubLObject mt_list = hash_table_keys(rtp_datastructures.$rtp_rules$.getGlobalValue());
        SubLObject rule_sets = NIL;
        SubLObject items = NIL;
        SubLObject cdolist_list_var = mt_list;
        SubLObject current_mt = NIL;
        current_mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject new_set = rtp_datastructures.get_categorized_template_rule_set(current_mt, category);
            if (NIL != new_set) {
                rule_sets = cons(new_set, rule_sets);
            }
            cdolist_list_var = cdolist_list_var.rest();
            current_mt = cdolist_list_var.first();
        } 
        cdolist_list_var = rule_sets;
        SubLObject current_rules = NIL;
        current_rules = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject key_terminal = rtp_datastructures.categorized_template_rule_set_key_terminal(current_rules);
            SubLObject terminal = NIL;
            SubLObject templates = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(key_terminal);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    terminal = getEntryKey(cdohash_entry);
                    templates = getEntryValue(cdohash_entry);
                    if (NIL != rtp_type_checkers.rtp_rule_terminalP(terminal)) {
                        items = cons(terminal, items);
                    }
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
            cdolist_list_var = cdolist_list_var.rest();
            current_rules = cdolist_list_var.first();
        } 
        return Sort.sort(items, symbol_function(rtp_datastructures.$sym162$STRING_), UNPROVIDED);
    }

    public static final SubLObject populate_rtp_from_mt_alt(SubLObject mt, SubLObject template_types) {
        if (template_types == UNPROVIDED) {
            template_types = isa.all_fort_instances($$ParseTemplatePredicate, mt, UNPROVIDED);
        }
        com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_clear_rules();
        com.cyc.cycjava.cycl.rtp.rtp_datastructures.allocate_rtp_rules();
        com.cyc.cycjava.cycl.rtp.rtp_datastructures.clear_template_rules_master_index();
        lexicon_accessors.clear_get_strings_of_type_cached();
        com.cyc.cycjava.cycl.rtp.rtp_datastructures.extend_rtp_from_mt(mt, template_types);
        return mt;
    }

    public static SubLObject populate_rtp_from_mt(final SubLObject mt, SubLObject template_types) {
        if (template_types == UNPROVIDED) {
            template_types = all_fort_instances(rtp_datastructures.$$ParseTemplatePredicate, mt, UNPROVIDED);
        }
        rtp_datastructures.rtp_clear_rules();
        rtp_datastructures.allocate_rtp_rules();
        rtp_datastructures.clear_template_rules_master_index();
        clear_get_strings_of_type_cached();
        rtp_datastructures.extend_rtp_from_mt(mt, template_types);
        return mt;
    }

    public static final SubLObject repopulate_rtp_from_mt_alt(SubLObject mt, SubLObject template_types) {
        if (template_types == UNPROVIDED) {
            template_types = isa.all_fort_instances($$ParseTemplatePredicate, mt, UNPROVIDED);
        }
        com.cyc.cycjava.cycl.rtp.rtp_datastructures.ensure_rtp_rules();
        com.cyc.cycjava.cycl.rtp.rtp_datastructures.clear_template_rules_master_index();
        lexicon_accessors.clear_get_strings_of_type_cached();
        com.cyc.cycjava.cycl.rtp.rtp_datastructures.extend_rtp_from_mt(mt, template_types);
        return mt;
    }

    public static SubLObject repopulate_rtp_from_mt(final SubLObject mt, SubLObject template_types) {
        if (template_types == UNPROVIDED) {
            template_types = all_fort_instances(rtp_datastructures.$$ParseTemplatePredicate, mt, UNPROVIDED);
        }
        rtp_datastructures.ensure_rtp_rules();
        rtp_datastructures.clear_template_rules_master_index();
        clear_get_strings_of_type_cached();
        rtp_datastructures.extend_rtp_from_mt(mt, template_types);
        return mt;
    }

    public static final SubLObject extend_rtp_from_mt_alt(SubLObject mt, SubLObject template_types) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt_list = NIL;
                SubLObject num_assertions = ZERO_INTEGER;
                if (NIL != mt) {
                    mt_list = nintersection(genl_mts.all_genl_mts(mt, UNPROVIDED, UNPROVIDED), genl_mts.all_spec_mts($$TemplateParsingMt, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                } else {
                    mt_list = isa.all_fort_instances_in_all_mts($$TemplateParsingMicrotheory);
                }
                {
                    SubLObject cdolist_list_var = mt_list;
                    SubLObject mt_19 = NIL;
                    for (mt_19 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_19 = cdolist_list_var.first()) {
                        {
                            SubLObject cdolist_list_var_20 = template_types;
                            SubLObject tp_type = NIL;
                            for (tp_type = cdolist_list_var_20.first(); NIL != cdolist_list_var_20; cdolist_list_var_20 = cdolist_list_var_20.rest() , tp_type = cdolist_list_var_20.first()) {
                                {
                                    SubLObject datum = tp_type;
                                    SubLObject current = datum;
                                    SubLObject template_pred = NIL;
                                    SubLObject template_categories = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt152);
                                    template_pred = current.first();
                                    current = current.rest();
                                    template_categories = current;
                                    num_assertions = add(num_assertions, com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_count_for_pred_and_categories(mt_19, template_pred, template_categories));
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject note = cconcatenate($str_alt153$Gathering_Template_Parsing_Assert, new SubLObject[]{ format_nil.format_nil_s_no_copy(length(mt_list)), $str_alt154$_mts__, format_nil.format_nil_s_no_copy(num_assertions), $str_alt155$_total_ });
                    {
                        SubLObject _prev_bind_0 = $rtp_asserts_initialized_so_far$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $last_percent_progress_index$.currentBinding(thread);
                        SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
                        SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
                        SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $rtp_asserts_initialized_so_far$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_prediction$.bind(NIL, thread);
                            $within_noting_percent_progress$.bind(T, thread);
                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                            noting_percent_progress_preamble(note);
                            thread.resetMultipleValues();
                            {
                                SubLObject _prev_bind_0_21 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                try {
                                    pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                    {
                                        SubLObject reuseP = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        try {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject _prev_bind_0_22 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                                try {
                                                    pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                    {
                                                        SubLObject new_or_reused = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject _prev_bind_0_23 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                            try {
                                                                pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                                {
                                                                    SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                                    {
                                                                        SubLObject _prev_bind_0_24 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                                                                                Errors.error($str_alt156$Invalid_attempt_to_reuse_memoizat);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    {
                                                                                        SubLObject cdolist_list_var = mt_list;
                                                                                        SubLObject mt_25 = NIL;
                                                                                        for (mt_25 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_25 = cdolist_list_var.first()) {
                                                                                            {
                                                                                                SubLObject cdolist_list_var_26 = template_types;
                                                                                                SubLObject tp_type = NIL;
                                                                                                for (tp_type = cdolist_list_var_26.first(); NIL != cdolist_list_var_26; cdolist_list_var_26 = cdolist_list_var_26.rest() , tp_type = cdolist_list_var_26.first()) {
                                                                                                    com.cyc.cycjava.cycl.rtp.rtp_datastructures.extend_rtp_from_just_mt_for_tp_type(mt_25, tp_type, num_assertions);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                        try {
                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                            if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                                memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                                            }
                                                                                        } finally {
                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_27, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            memoization_state.$memoization_state$.rebind(_prev_bind_0_24, thread);
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_23, thread);
                                                            }
                                                        }
                                                        if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                        }
                                                    }
                                                } finally {
                                                    pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_22, thread);
                                                }
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if (NIL == reuseP) {
                                                        pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_28, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_21, thread);
                                }
                            }
                            noting_percent_progress_postamble();
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_1, thread);
                            $rtp_asserts_initialized_so_far$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return mt;
            }
        }
    }

    public static SubLObject extend_rtp_from_mt(final SubLObject mt, final SubLObject template_types) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt_list = NIL;
        SubLObject num_assertions = ZERO_INTEGER;
        if (NIL != mt) {
            mt_list = nintersection(all_genl_mts(mt, UNPROVIDED, UNPROVIDED), all_spec_mts(rtp_datastructures.$$TemplateParsingMt, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else {
            mt_list = all_fort_instances_in_all_mts(rtp_datastructures.$$TemplateParsingMicrotheory);
        }
        SubLObject cdolist_list_var = mt_list;
        SubLObject mt_$23 = NIL;
        mt_$23 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$24 = template_types;
            SubLObject tp_type = NIL;
            tp_type = cdolist_list_var_$24.first();
            while (NIL != cdolist_list_var_$24) {
                SubLObject current;
                final SubLObject datum = current = tp_type;
                SubLObject template_pred = NIL;
                SubLObject template_categories = NIL;
                destructuring_bind_must_consp(current, datum, rtp_datastructures.$list165);
                template_pred = current.first();
                current = template_categories = current.rest();
                num_assertions = add(num_assertions, rtp_datastructures.template_count_for_pred_and_categories(mt_$23, template_pred, template_categories));
                cdolist_list_var_$24 = cdolist_list_var_$24.rest();
                tp_type = cdolist_list_var_$24.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            mt_$23 = cdolist_list_var.first();
        } 
        final SubLObject note = cconcatenate(rtp_datastructures.$str166$Gathering_Template_Parsing_Assert, new SubLObject[]{ format_nil_s_no_copy(length(mt_list)), rtp_datastructures.$str167$_mts__, format_nil_s_no_copy(num_assertions), rtp_datastructures.$str168$_total_ });
        final SubLObject _prev_bind_0 = rtp_datastructures.$rtp_asserts_initialized_so_far$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $percent_progress_start_time$.currentBinding(thread);
        try {
            rtp_datastructures.$rtp_asserts_initialized_so_far$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(note);
                final SubLObject _prev_bind_0_$25 = $free_pph_problem_store_pointers$.currentBinding(thread);
                try {
                    $free_pph_problem_store_pointers$.bind(NIL, thread);
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$26 = $pph_problem_store_pointer$.currentBinding(thread);
                    try {
                        $pph_problem_store_pointer$.bind(find_or_create_pph_problem_store_pointer(), thread);
                        final SubLObject reuseP = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        try {
                            thread.resetMultipleValues();
                            final SubLObject _prev_bind_0_$27 = $pph_memoization_state$.currentBinding(thread);
                            try {
                                $pph_memoization_state$.bind(find_or_create_pph_memoization_state(), thread);
                                final SubLObject new_or_reused = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                final SubLObject _prev_bind_0_$28 = $pph_external_memoization_state$.currentBinding(thread);
                                try {
                                    $pph_external_memoization_state$.bind(find_or_create_pph_external_memoization_state(), thread);
                                    final SubLObject local_state = $pph_memoization_state$.getDynamicValue(thread);
                                    final SubLObject _prev_bind_0_$29 = $memoization_state$.currentBinding(thread);
                                    try {
                                        $memoization_state$.bind(local_state, thread);
                                        final SubLObject original_memoization_process = memoization_state_original_process(local_state);
                                        try {
                                            SubLObject cdolist_list_var2 = mt_list;
                                            SubLObject mt_$24 = NIL;
                                            mt_$24 = cdolist_list_var2.first();
                                            while (NIL != cdolist_list_var2) {
                                                SubLObject cdolist_list_var_$25 = template_types;
                                                SubLObject tp_type2 = NIL;
                                                tp_type2 = cdolist_list_var_$25.first();
                                                while (NIL != cdolist_list_var_$25) {
                                                    rtp_datastructures.extend_rtp_from_just_mt_for_tp_type(mt_$24, tp_type2, num_assertions);
                                                    cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                                                    tp_type2 = cdolist_list_var_$25.first();
                                                } 
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                mt_$24 = cdolist_list_var2.first();
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_0_$30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                                            }
                                        }
                                    } finally {
                                        $memoization_state$.rebind(_prev_bind_0_$29, thread);
                                    }
                                } finally {
                                    $pph_external_memoization_state$.rebind(_prev_bind_0_$28, thread);
                                }
                                if ((new_or_reused == $NEW) && (NIL != memoization_state_p($pph_memoization_state$.getDynamicValue(thread)))) {
                                    clear_all_memoization($pph_memoization_state$.getDynamicValue(thread));
                                }
                            } finally {
                                $pph_memoization_state$.rebind(_prev_bind_0_$27, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                if (NIL == reuseP) {
                                    free_pph_problem_store_pointer($pph_problem_store_pointer$.getDynamicValue(thread));
                                }
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                            }
                        }
                    } finally {
                        $pph_problem_store_pointer$.rebind(_prev_bind_0_$26, thread);
                    }
                } finally {
                    $free_pph_problem_store_pointers$.rebind(_prev_bind_0_$25, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_5, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
            $last_percent_progress_index$.rebind(_prev_bind_2, thread);
            rtp_datastructures.$rtp_asserts_initialized_so_far$.rebind(_prev_bind_0, thread);
        }
        return mt;
    }

    public static final SubLObject extend_rtp_from_just_mt_for_tp_type_alt(SubLObject mt, SubLObject tp_type, SubLObject total_assertions) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = tp_type;
                SubLObject current = datum;
                SubLObject template_pred = NIL;
                SubLObject template_categories = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt152);
                template_pred = current.first();
                current = current.rest();
                template_categories = current;
                {
                    SubLObject num_assertions = com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_count_for_pred_and_categories(mt, template_pred, template_categories);
                    if (ZERO_INTEGER.numL(num_assertions)) {
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                                mt_relevance_macros.$mt$.bind(mt, thread);
                                if (NIL != template_categories) {
                                    {
                                        SubLObject cdolist_list_var = template_categories;
                                        SubLObject template_category = NIL;
                                        for (template_category = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_category = cdolist_list_var.first()) {
                                            {
                                                SubLObject pred_var = template_pred;
                                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(template_category, ONE_INTEGER, pred_var)) {
                                                    {
                                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(template_category, ONE_INTEGER, pred_var);
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
                                                                                SubLObject done_var_29 = NIL;
                                                                                SubLObject token_var_30 = NIL;
                                                                                while (NIL == done_var_29) {
                                                                                    {
                                                                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_30);
                                                                                        SubLObject valid_31 = makeBoolean(token_var_30 != assertion);
                                                                                        if (NIL != valid_31) {
                                                                                            note_percent_progress($rtp_asserts_initialized_so_far$.getDynamicValue(thread), total_assertions);
                                                                                            com.cyc.cycjava.cycl.rtp.rtp_datastructures.extend_rtp_with_template_assertion(assertion);
                                                                                            $rtp_asserts_initialized_so_far$.setDynamicValue(add($rtp_asserts_initialized_so_far$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                                                        }
                                                                                        done_var_29 = makeBoolean(NIL == valid_31);
                                                                                    }
                                                                                } 
                                                                            }
                                                                        } finally {
                                                                            {
                                                                                SubLObject _prev_bind_0_32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                    if (NIL != final_index_iterator) {
                                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                    }
                                                                                } finally {
                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_32, thread);
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
                                        }
                                    }
                                } else {
                                    {
                                        SubLObject pred_var = template_pred;
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
                                                                        SubLObject done_var_33 = NIL;
                                                                        SubLObject token_var_34 = NIL;
                                                                        while (NIL == done_var_33) {
                                                                            {
                                                                                SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_34);
                                                                                SubLObject valid_35 = makeBoolean(token_var_34 != assertion);
                                                                                if (NIL != valid_35) {
                                                                                    note_percent_progress($rtp_asserts_initialized_so_far$.getDynamicValue(thread), total_assertions);
                                                                                    com.cyc.cycjava.cycl.rtp.rtp_datastructures.extend_rtp_with_template_assertion(assertion);
                                                                                    $rtp_asserts_initialized_so_far$.setDynamicValue(add($rtp_asserts_initialized_so_far$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                                                }
                                                                                done_var_33 = makeBoolean(NIL == valid_35);
                                                                            }
                                                                        } 
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_36 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if (NIL != final_index_iterator) {
                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_36, thread);
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
                                }
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject extend_rtp_from_just_mt_for_tp_type(final SubLObject mt, final SubLObject tp_type, final SubLObject total_assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject template_pred = NIL;
        SubLObject template_categories = NIL;
        destructuring_bind_must_consp(tp_type, tp_type, rtp_datastructures.$list165);
        template_pred = tp_type.first();
        final SubLObject current = template_categories = tp_type.rest();
        final SubLObject num_assertions = rtp_datastructures.template_count_for_pred_and_categories(mt, template_pred, template_categories);
        if (ZERO_INTEGER.numL(num_assertions)) {
            final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
            try {
                $relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                $mt$.bind(mt, thread);
                if (NIL != template_categories) {
                    SubLObject cdolist_list_var = template_categories;
                    SubLObject template_category = NIL;
                    template_category = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject pred_var = template_pred;
                        if (NIL != do_gaf_arg_index_key_validator(template_category, ONE_INTEGER, pred_var)) {
                            final SubLObject iterator_var = new_gaf_arg_final_index_spec_iterator(template_category, ONE_INTEGER, pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$35 = NIL;
                                        final SubLObject token_var_$36 = NIL;
                                        while (NIL == done_var_$35) {
                                            final SubLObject assertion = iteration_next_without_values_macro_helper(final_index_iterator, token_var_$36);
                                            final SubLObject valid_$37 = makeBoolean(!token_var_$36.eql(assertion));
                                            if (NIL != valid_$37) {
                                                note_percent_progress(rtp_datastructures.$rtp_asserts_initialized_so_far$.getDynamicValue(thread), total_assertions);
                                                rtp_datastructures.extend_rtp_with_template_assertion(assertion);
                                                rtp_datastructures.$rtp_asserts_initialized_so_far$.setDynamicValue(add(rtp_datastructures.$rtp_asserts_initialized_so_far$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            }
                                            done_var_$35 = makeBoolean(NIL == valid_$37);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$38 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        template_category = cdolist_list_var.first();
                    } 
                } else {
                    final SubLObject pred_var2 = template_pred;
                    if (NIL != do_predicate_extent_index_key_validator(pred_var2)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_0_$39 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$40 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
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
                            final SubLObject iterator_var2 = new_predicate_extent_final_index_spec_iterator(pred_var2);
                            SubLObject done_var2 = NIL;
                            final SubLObject token_var2 = NIL;
                            while (NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                if (NIL != valid2) {
                                    note_progress();
                                    SubLObject final_index_iterator2 = NIL;
                                    try {
                                        final_index_iterator2 = new_final_index_iterator(final_index_spec2, $GAF, NIL, NIL);
                                        SubLObject done_var_$36 = NIL;
                                        final SubLObject token_var_$37 = NIL;
                                        while (NIL == done_var_$36) {
                                            final SubLObject assertion2 = iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$37);
                                            final SubLObject valid_$38 = makeBoolean(!token_var_$37.eql(assertion2));
                                            if (NIL != valid_$38) {
                                                note_percent_progress(rtp_datastructures.$rtp_asserts_initialized_so_far$.getDynamicValue(thread), total_assertions);
                                                rtp_datastructures.extend_rtp_with_template_assertion(assertion2);
                                                rtp_datastructures.$rtp_asserts_initialized_so_far$.setDynamicValue(add(rtp_datastructures.$rtp_asserts_initialized_so_far$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            }
                                            done_var_$36 = makeBoolean(NIL == valid_$38);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$40 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            if (NIL != final_index_iterator2) {
                                                destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
                                        }
                                    }
                                }
                                done_var2 = makeBoolean(NIL == valid2);
                            } 
                            noting_progress_postamble();
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_8, thread);
                            $is_noting_progressP$.rebind(_prev_bind_7, thread);
                            $progress_count$.rebind(_prev_bind_6, thread);
                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            $progress_notification_count$.rebind(_prev_bind_4, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_1_$40, thread);
                            $progress_start_time$.rebind(_prev_bind_0_$39, thread);
                        }
                    }
                }
            } finally {
                $mt$.rebind(_prev_bind_2, thread);
                $relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param MT
    hlmt-p;
     * 		
     * @param PRED
     * 		instance of #$ParseTemplatePredicate
     * @param CATEGORIES
     * 		nil or list of ParsingTemplateCategory.  If nil, all instances of ParsingTemplateCategory will be used.
     */
    @LispMethod(comment = "@param MT\nhlmt-p;\r\n\t\t\r\n@param PRED\r\n\t\tinstance of #$ParseTemplatePredicate\r\n@param CATEGORIES\r\n\t\tnil or list of ParsingTemplateCategory.  If nil, all instances of ParsingTemplateCategory will be used.")
    public static final SubLObject template_count_for_pred_and_categories_alt(SubLObject mt, SubLObject pred, SubLObject categories) {
        if (categories == UNPROVIDED) {
            categories = NIL;
        }
        {
            SubLObject count = ZERO_INTEGER;
            if (NIL != categories) {
                {
                    SubLObject cdolist_list_var = categories;
                    SubLObject cat = NIL;
                    for (cat = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cat = cdolist_list_var.first()) {
                        count = add(count, kb_indexing.num_gaf_arg_index(cat, ONE_INTEGER, pred, mt));
                    }
                }
            } else {
                count = add(count, kb_indexing.num_predicate_extent_index(pred, mt));
            }
            return count;
        }
    }

    /**
     *
     *
     * @param MT
    hlmt-p;
     * 		
     * @param PRED
     * 		instance of #$ParseTemplatePredicate
     * @param CATEGORIES
     * 		nil or list of ParsingTemplateCategory.  If nil, all instances of ParsingTemplateCategory will be used.
     */
    @LispMethod(comment = "@param MT\nhlmt-p;\r\n\t\t\r\n@param PRED\r\n\t\tinstance of #$ParseTemplatePredicate\r\n@param CATEGORIES\r\n\t\tnil or list of ParsingTemplateCategory.  If nil, all instances of ParsingTemplateCategory will be used.")
    public static SubLObject template_count_for_pred_and_categories(final SubLObject mt, final SubLObject pred, SubLObject categories) {
        if (categories == UNPROVIDED) {
            categories = NIL;
        }
        SubLObject count = ZERO_INTEGER;
        if (NIL != categories) {
            SubLObject cdolist_list_var = categories;
            SubLObject cat = NIL;
            cat = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                count = add(count, num_gaf_arg_index(cat, ONE_INTEGER, pred, mt));
                cdolist_list_var = cdolist_list_var.rest();
                cat = cdolist_list_var.first();
            } 
        } else {
            count = add(count, num_predicate_extent_index(pred, mt));
        }
        return count;
    }

    public static final SubLObject extend_rtp_with_template_assertion_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
                SubLObject _prev_bind_1 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                try {
                    pph_vars.$pph_language_mt$.bind(NIL != pph_vars.$pph_language_mt$.getDynamicValue(thread) ? ((SubLObject) (pph_vars.$pph_language_mt$.getDynamicValue(thread))) : $$CyclishParaphraseMt, thread);
                    pph_vars.$pph_domain_mt$.bind(NIL != pph_vars.$pph_domain_mt$.getDynamicValue(thread) ? ((SubLObject) (pph_vars.$pph_domain_mt$.getDynamicValue(thread))) : $$DataForNLMt, thread);
                    com.cyc.cycjava.cycl.rtp.rtp_datastructures.ensure_rtp_rules();
                    {
                        SubLObject mt = assertions_high.assertion_mt(assertion);
                        SubLObject meaning = com.cyc.cycjava.cycl.rtp.rtp_datastructures.assertion_arg(ZERO_INTEGER, assertion);
                        SubLObject category = com.cyc.cycjava.cycl.rtp.rtp_datastructures.assertion_arg(ONE_INTEGER, assertion);
                        SubLObject template = NIL;
                        SubLObject expansion = NIL;
                        SubLObject sem_test = NIL;
                        SubLObject violator = NIL;
                        {
                            SubLObject pcase_var = arity.arity(meaning);
                            if (pcase_var.eql(THREE_INTEGER)) {
                                template = com.cyc.cycjava.cycl.rtp.rtp_datastructures.assertion_arg(TWO_INTEGER, assertion);
                                expansion = com.cyc.cycjava.cycl.rtp.rtp_datastructures.assertion_arg(THREE_INTEGER, assertion);
                            } else {
                                if (pcase_var.eql(FOUR_INTEGER)) {
                                    template = com.cyc.cycjava.cycl.rtp.rtp_datastructures.assertion_arg(THREE_INTEGER, assertion);
                                    expansion = com.cyc.cycjava.cycl.rtp.rtp_datastructures.assertion_arg(FOUR_INTEGER, assertion);
                                } else {
                                    if (pcase_var.eql(FIVE_INTEGER)) {
                                        template = com.cyc.cycjava.cycl.rtp.rtp_datastructures.assertion_arg(THREE_INTEGER, assertion);
                                        expansion = com.cyc.cycjava.cycl.rtp.rtp_datastructures.assertion_arg(FOUR_INTEGER, assertion);
                                        sem_test = com.cyc.cycjava.cycl.rtp.rtp_datastructures.assertion_arg(FIVE_INTEGER, assertion);
                                    }
                                }
                            }
                        }
                        if (expansion.isCons()) {
                            {
                                SubLObject pcase_var = expansion.first();
                                if (pcase_var.eql($$ExpandSubLFn)) {
                                    expansion = third(expansion);
                                } else {
                                    if (pcase_var.eql($$SubLQuoteFn)) {
                                        expansion = second(expansion);
                                    }
                                }
                            }
                        }
                        template = com.cyc.cycjava.cycl.rtp.rtp_datastructures.strip_wrapper_functions_from(template);
                        try {
                            {
                                SubLObject existing_tp_rules = com.cyc.cycjava.cycl.rtp.rtp_datastructures.find_rtp_rules_by_assertion(assertion);
                                if (NIL == existing_tp_rules) {
                                    {
                                        SubLObject tp_rule = com.cyc.cycjava.cycl.rtp.rtp_datastructures.new_template_rule(category, template, expansion, sem_test, assertion, meaning);
                                        print(list(NEW_TEMPLATE_RULE, category, template, expansion, sem_test, mt, meaning), UNPROVIDED);
                                        com.cyc.cycjava.cycl.rtp.rtp_datastructures.add_rtp_rule(tp_rule);
                                        existing_tp_rules = list(tp_rule);
                                    }
                                }
                                {
                                    SubLObject cdolist_list_var = existing_tp_rules;
                                    SubLObject tp_rule = NIL;
                                    for (tp_rule = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tp_rule = cdolist_list_var.first()) {
                                        com.cyc.cycjava.cycl.rtp.rtp_datastructures.extend_categorized_template_rule_set(mt, tp_rule);
                                    }
                                }
                            }
                        } catch (Throwable ccatch_env_var) {
                            violator = Errors.handleThrowable(ccatch_env_var, $RECURSIVE_TEMPLATE);
                        }
                        if (NIL != violator) {
                            Errors.warn($str_alt163$Assertion__D_specifies_a_left_rec, assertion_handles.assertion_id(assertion), assertion);
                        }
                    }
                } finally {
                    pph_vars.$pph_domain_mt$.rebind(_prev_bind_1, thread);
                    pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
                }
            }
            return assertion;
        }
    }

    public static SubLObject extend_rtp_with_template_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $pph_language_mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $pph_domain_mt$.currentBinding(thread);
        try {
            $pph_language_mt$.bind(NIL != $pph_language_mt$.getDynamicValue(thread) ? $pph_language_mt$.getDynamicValue(thread) : rtp_datastructures.$$CyclishParaphraseMt, thread);
            $pph_domain_mt$.bind(NIL != $pph_domain_mt$.getDynamicValue(thread) ? $pph_domain_mt$.getDynamicValue(thread) : rtp_datastructures.$$DataForNLMt, thread);
            rtp_datastructures.ensure_rtp_rules();
            final SubLObject mt = assertion_mt(assertion);
            final SubLObject meaning = gaf_arg0(assertion);
            final SubLObject category = gaf_arg1(assertion);
            SubLObject template = NIL;
            SubLObject expansion = NIL;
            SubLObject sem_test = NIL;
            SubLObject violator = NIL;
            SubLObject pcase_var = arity(meaning);
            if (pcase_var.eql(THREE_INTEGER)) {
                template = gaf_arg2(assertion);
                expansion = gaf_arg3(assertion);
            } else
                if (pcase_var.eql(FOUR_INTEGER)) {
                    template = gaf_arg3(assertion);
                    expansion = gaf_arg4(assertion);
                } else
                    if (pcase_var.eql(FIVE_INTEGER)) {
                        template = gaf_arg3(assertion);
                        expansion = gaf_arg4(assertion);
                        sem_test = gaf_arg5(assertion);
                    }


            if (expansion.isCons()) {
                pcase_var = expansion.first();
                if (pcase_var.eql(rtp_datastructures.$$ExpandSubLFn)) {
                    expansion = third(expansion);
                } else
                    if (pcase_var.eql(rtp_datastructures.$$SubLQuoteFn)) {
                        expansion = second(expansion);
                    }

            }
            template = rtp_datastructures.strip_wrapper_functions_from(template);
            try {
                thread.throwStack.push($RECURSIVE_TEMPLATE);
                SubLObject existing_tp_rules = rtp_datastructures.find_rtp_rules_by_assertion(assertion);
                if (NIL == existing_tp_rules) {
                    final SubLObject tp_rule = rtp_datastructures.new_template_rule(category, template, expansion, sem_test, assertion, meaning);
                    rtp_datastructures.add_rtp_rule(tp_rule);
                    existing_tp_rules = list(tp_rule);
                }
                SubLObject cdolist_list_var = existing_tp_rules;
                SubLObject tp_rule2 = NIL;
                tp_rule2 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    rtp_datastructures.extend_categorized_template_rule_set(mt, tp_rule2);
                    cdolist_list_var = cdolist_list_var.rest();
                    tp_rule2 = cdolist_list_var.first();
                } 
            } catch (final Throwable ccatch_env_var) {
                violator = Errors.handleThrowable(ccatch_env_var, $RECURSIVE_TEMPLATE);
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != violator) {
                Errors.warn(rtp_datastructures.$str174$Assertion__D_specifies_a_left_rec, assertion_id(assertion), assertion);
            }
        } finally {
            $pph_domain_mt$.rebind(_prev_bind_2, thread);
            $pph_language_mt$.rebind(_prev_bind_0, thread);
        }
        return assertion;
    }

    /**
     * Returns a version of template with all wrapper functions (e.g., #$NLSubjectSlot)
     * stripped out, and their contents put in its place.
     */
    @LispMethod(comment = "Returns a version of template with all wrapper functions (e.g., #$NLSubjectSlot)\r\nstripped out, and their contents put in its place.\nReturns a version of template with all wrapper functions (e.g., #$NLSubjectSlot)\nstripped out, and their contents put in its place.")
    public static final SubLObject strip_wrapper_functions_from_alt(SubLObject template) {
        {
            SubLObject clean_version = NIL;
            SubLObject top_levelP = NIL;
            SubLObject cdolist_list_var = template;
            SubLObject this_constraint = NIL;
            for (this_constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_constraint = cdolist_list_var.first()) {
                if (this_constraint == $$NLPatternList) {
                    top_levelP = T;
                } else {
                    if (NIL == el_formula_p(this_constraint)) {
                        clean_version = cons(this_constraint, clean_version);
                    } else {
                        if (cycl_utilities.formula_arg0(this_constraint).eql($$NLPattern_Word) || cycl_utilities.formula_arg0(this_constraint).eql($$NLPattern_Template)) {
                            clean_version = cons(cycl_utilities.formula_args(this_constraint, UNPROVIDED), clean_version);
                        } else {
                            if (NIL != isa.isaP(cycl_utilities.formula_arg0(this_constraint), $$NLParsingSlot, UNPROVIDED, UNPROVIDED)) {
                                {
                                    SubLObject cdolist_list_var_37 = com.cyc.cycjava.cycl.rtp.rtp_datastructures.strip_wrapper_functions_from(cycl_utilities.formula_args(this_constraint, UNPROVIDED));
                                    SubLObject this_result = NIL;
                                    for (this_result = cdolist_list_var_37.first(); NIL != cdolist_list_var_37; cdolist_list_var_37 = cdolist_list_var_37.rest() , this_result = cdolist_list_var_37.first()) {
                                        clean_version = cons(this_result, clean_version);
                                    }
                                }
                            } else {
                                if (cycl_utilities.formula_arg0(this_constraint).eql($$NLPattern_Term_Optional)) {
                                    clean_version = cons(cons($$OptionalOne, com.cyc.cycjava.cycl.rtp.rtp_datastructures.transform_cyc_term_item(this_constraint).rest()), clean_version);
                                } else {
                                    if (cycl_utilities.formula_arg0(this_constraint).eql($$NLPattern_Exact)) {
                                        if (NIL != top_levelP) {
                                            {
                                                SubLObject cdolist_list_var_38 = cycl_utilities.formula_args(this_constraint, UNPROVIDED);
                                                SubLObject this_match = NIL;
                                                for (this_match = cdolist_list_var_38.first(); NIL != cdolist_list_var_38; cdolist_list_var_38 = cdolist_list_var_38.rest() , this_match = cdolist_list_var_38.first()) {
                                                    clean_version = cons(this_match, clean_version);
                                                }
                                            }
                                        } else {
                                            clean_version = cons(list($$RequireOne, cons($$WordSequence, cycl_utilities.formula_args(this_constraint, UNPROVIDED))), clean_version);
                                        }
                                    } else {
                                        if (NIL != rtp_type_checkers.optional_template_item(this_constraint)) {
                                            {
                                                SubLObject strip_down = list(cycl_utilities.formula_arg0(this_constraint));
                                                SubLObject args = cycl_utilities.formula_args(this_constraint, $IGNORE);
                                                SubLObject cdolist_list_var_39 = args;
                                                SubLObject this_item = NIL;
                                                for (this_item = cdolist_list_var_39.first(); NIL != cdolist_list_var_39; cdolist_list_var_39 = cdolist_list_var_39.rest() , this_item = cdolist_list_var_39.first()) {
                                                    {
                                                        SubLObject the_result = com.cyc.cycjava.cycl.rtp.rtp_datastructures.strip_wrapper_functions_from(list(this_item)).first();
                                                        if (NIL != rtp_type_checkers.rtp_require_one_itemP(the_result)) {
                                                            strip_down = cons(cadr(the_result), strip_down);
                                                        } else {
                                                            strip_down = cons(the_result, strip_down);
                                                        }
                                                    }
                                                }
                                                clean_version = cons(reverse(strip_down), clean_version);
                                            }
                                        } else {
                                            if (NIL != subl_promotions.memberP(cycl_utilities.formula_arg0(this_constraint), $list_alt172, UNPROVIDED, UNPROVIDED)) {
                                                clean_version = cons(reverse(cycl_utilities.formula_args(this_constraint, UNPROVIDED)), clean_version);
                                            } else {
                                                clean_version = cons(this_constraint, clean_version);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return reverse(clean_version);
        }
    }

    @LispMethod(comment = "Returns a version of template with all wrapper functions (e.g., #$NLSubjectSlot)\r\nstripped out, and their contents put in its place.\nReturns a version of template with all wrapper functions (e.g., #$NLSubjectSlot)\nstripped out, and their contents put in its place.")
    public static SubLObject strip_wrapper_functions_from(final SubLObject template) {
        SubLObject clean_version = NIL;
        SubLObject top_levelP = NIL;
        SubLObject cdolist_list_var = template;
        SubLObject this_constraint = NIL;
        this_constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (this_constraint.eql(rtp_datastructures.$$NLPatternList)) {
                top_levelP = T;
            } else
                if (NIL == el_formula_p(this_constraint)) {
                    clean_version = cons(this_constraint, clean_version);
                } else
                    if (formula_arg0(this_constraint).eql(rtp_datastructures.$$NLPattern_Word) || formula_arg0(this_constraint).eql(rtp_datastructures.$$NLPattern_Template)) {
                        clean_version = cons(formula_args(this_constraint, UNPROVIDED), clean_version);
                    } else
                        if (NIL != isaP(formula_arg0(this_constraint), rtp_datastructures.$$NLParsingSlot, UNPROVIDED, UNPROVIDED)) {
                            SubLObject cdolist_list_var_$45 = rtp_datastructures.strip_wrapper_functions_from(formula_args(this_constraint, UNPROVIDED));
                            SubLObject this_result = NIL;
                            this_result = cdolist_list_var_$45.first();
                            while (NIL != cdolist_list_var_$45) {
                                clean_version = cons(this_result, clean_version);
                                cdolist_list_var_$45 = cdolist_list_var_$45.rest();
                                this_result = cdolist_list_var_$45.first();
                            } 
                        } else
                            if (formula_arg0(this_constraint).eql(rtp_datastructures.$$NLPattern_Term_Optional)) {
                                clean_version = cons(cons(rtp_datastructures.$$OptionalOne, rtp_datastructures.transform_cyc_term_item(this_constraint).rest()), clean_version);
                            } else
                                if (formula_arg0(this_constraint).eql(rtp_datastructures.$$NLPattern_Exact)) {
                                    if (NIL != top_levelP) {
                                        SubLObject cdolist_list_var_$46 = formula_args(this_constraint, UNPROVIDED);
                                        SubLObject this_match = NIL;
                                        this_match = cdolist_list_var_$46.first();
                                        while (NIL != cdolist_list_var_$46) {
                                            clean_version = cons(this_match, clean_version);
                                            cdolist_list_var_$46 = cdolist_list_var_$46.rest();
                                            this_match = cdolist_list_var_$46.first();
                                        } 
                                    } else {
                                        clean_version = cons(list(rtp_datastructures.$$RequireOne, cons(rtp_datastructures.$$WordSequence, formula_args(this_constraint, UNPROVIDED))), clean_version);
                                    }
                                } else
                                    if (NIL != rtp_type_checkers.optional_template_item(this_constraint)) {
                                        SubLObject strip_down = list(formula_arg0(this_constraint));
                                        SubLObject cdolist_list_var_$47;
                                        final SubLObject args = cdolist_list_var_$47 = formula_args(this_constraint, $IGNORE);
                                        SubLObject this_item = NIL;
                                        this_item = cdolist_list_var_$47.first();
                                        while (NIL != cdolist_list_var_$47) {
                                            final SubLObject the_result = rtp_datastructures.strip_wrapper_functions_from(list(this_item)).first();
                                            if (NIL != rtp_type_checkers.rtp_require_one_itemP(the_result)) {
                                                strip_down = cons(cadr(the_result), strip_down);
                                            } else {
                                                strip_down = cons(the_result, strip_down);
                                            }
                                            cdolist_list_var_$47 = cdolist_list_var_$47.rest();
                                            this_item = cdolist_list_var_$47.first();
                                        } 
                                        clean_version = cons(reverse(strip_down), clean_version);
                                    } else
                                        if (NIL != memberP(formula_arg0(this_constraint), rtp_datastructures.$list183, UNPROVIDED, UNPROVIDED)) {
                                            clean_version = cons(reverse(formula_args(this_constraint, UNPROVIDED)), clean_version);
                                        } else {
                                            clean_version = cons(this_constraint, clean_version);
                                        }







            cdolist_list_var = cdolist_list_var.rest();
            this_constraint = cdolist_list_var.first();
        } 
        return reverse(clean_version);
    }/**
     * Returns a version of template with all wrapper functions (e.g., #$NLSubjectSlot)
     * stripped out, and their contents put in its place.
     */


    public static final SubLObject reduce_rtp_by_template_assertion_alt(SubLObject assertion) {
        {
            SubLObject mt = assertions_high.assertion_mt(assertion);
            SubLObject tp_rules = com.cyc.cycjava.cycl.rtp.rtp_datastructures.find_rtp_rules_by_assertion(assertion);
            SubLObject cdolist_list_var = tp_rules;
            SubLObject tp_rule = NIL;
            for (tp_rule = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tp_rule = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.rtp.rtp_datastructures.remove_rtp_rule(tp_rule);
                com.cyc.cycjava.cycl.rtp.rtp_datastructures.reduce_categorized_template_rule_set(mt, tp_rule);
            }
        }
        return assertion;
    }

    public static SubLObject reduce_rtp_by_template_assertion(final SubLObject assertion) {
        final SubLObject mt = assertion_mt(assertion);
        SubLObject cdolist_list_var;
        final SubLObject tp_rules = cdolist_list_var = rtp_datastructures.find_rtp_rules_by_assertion(assertion);
        SubLObject tp_rule = NIL;
        tp_rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rtp_datastructures.remove_rtp_rule(tp_rule);
            rtp_datastructures.reduce_categorized_template_rule_set(mt, tp_rule);
            cdolist_list_var = cdolist_list_var.rest();
            tp_rule = cdolist_list_var.first();
        } 
        return assertion;
    }

    /**
     * This is the after-adding support hook for keeping the template
     * parser up to date with reality.
     */
    @LispMethod(comment = "This is the after-adding support hook for keeping the template\r\nparser up to date with reality.\nThis is the after-adding support hook for keeping the template\nparser up to date with reality.")
    public static final SubLObject add_template_assertion_alt(SubLObject argument, SubLObject assertion) {
        {
            SubLObject asserted_at_allP = NIL;
            SubLObject formula = assertions_high.assertion_formula(assertion);
            SubLObject constraint_at = (NIL != subl_promotions.memberP($const173$TemplateParsingSyntacticConstrain, kb_accessors.min_argn_isa(cycl_utilities.formula_arg0(formula), TWO_INTEGER, UNPROVIDED), UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (TWO_INTEGER)) : THREE_INTEGER;
            if (NIL != rtp_type_checkers.valid_rtp_syntactic_constraintP(cycl_utilities.formula_arg(formula, constraint_at, UNPROVIDED))) {
                asserted_at_allP = list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.rtp.rtp_datastructures.extend_rtp_with_template_assertion(assertion));
            } else {
                Errors.warn($str_alt174$Strange_template_assertion__S_wit, assertion, argument);
            }
            lexicon_utilities.clear_lexical_info_caches(UNPROVIDED);
            return asserted_at_allP;
        }
    }

    @LispMethod(comment = "This is the after-adding support hook for keeping the template\r\nparser up to date with reality.\nThis is the after-adding support hook for keeping the template\nparser up to date with reality.")
    public static SubLObject add_template_assertion(final SubLObject argument, final SubLObject assertion) {
        SubLObject asserted_at_allP = NIL;
        final SubLObject formula = assertion_formula(assertion);
        final SubLObject constraint_at = (NIL != memberP(rtp_datastructures.$const184$TemplateParsingSyntacticConstrain, min_argn_isa(formula_arg0(formula), TWO_INTEGER, UNPROVIDED), UNPROVIDED, UNPROVIDED)) ? TWO_INTEGER : THREE_INTEGER;
        if (NIL != rtp_type_checkers.valid_rtp_syntactic_constraintP(formula_arg(formula, constraint_at, UNPROVIDED))) {
            asserted_at_allP = sublisp_boolean(rtp_datastructures.extend_rtp_with_template_assertion(assertion));
        } else {
            Errors.warn(rtp_datastructures.$str185$Strange_template_assertion__S_wit, assertion, argument);
        }
        clear_lexical_info_caches(UNPROVIDED);
        return asserted_at_allP;
    }/**
     * This is the after-adding support hook for keeping the template
     * parser up to date with reality.
     */


    public static final SubLObject remove_template_assertion_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != com.cyc.cycjava.cycl.rtp.rtp_datastructures.cached_template_assertion_p(argument, assertion)) {
            com.cyc.cycjava.cycl.rtp.rtp_datastructures.reduce_rtp_by_template_assertion(assertion);
        }
        lexicon_utilities.clear_lexical_info_caches(UNPROVIDED);
        return NIL;
    }

    public static SubLObject remove_template_assertion(final SubLObject argument, final SubLObject assertion) {
        if (NIL != rtp_datastructures.cached_template_assertion_p(argument, assertion)) {
            rtp_datastructures.reduce_rtp_by_template_assertion(assertion);
        }
        clear_lexical_info_caches(UNPROVIDED);
        return NIL;
    }

    /**
     * Check if this is an assertion that we would accept or cache.
     */
    @LispMethod(comment = "Check if this is an assertion that we would accept or cache.")
    public static final SubLObject cached_template_assertion_p_alt(SubLObject argument, SubLObject assertion) {
        return makeBoolean((argument == $ASSERTED_TRUE_DEF) || (argument == $ASSERTED_TRUE_MON));
    }

    @LispMethod(comment = "Check if this is an assertion that we would accept or cache.")
    public static SubLObject cached_template_assertion_p(final SubLObject argument, final SubLObject assertion) {
        return makeBoolean((argument == rtp_datastructures.$ASSERTED_TRUE_DEF) || (argument == rtp_datastructures.$ASSERTED_TRUE_MON));
    }/**
     * Check if this is an assertion that we would accept or cache.
     */


    public static final SubLObject rtp_chart_entry_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_entry_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject rtp_chart_entry_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        rtp_datastructures.rtp_entry_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject rtp_chart_entry_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rtp.rtp_datastructures.$rtp_chart_entry_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject rtp_chart_entry_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rtp.rtp_datastructures.$rtp_chart_entry_native.class ? T : NIL;
    }

    public static final SubLObject rtp_chart_entry_start_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RTP_CHART_ENTRY_P);
        return v_object.getField2();
    }

    public static SubLObject rtp_chart_entry_start(final SubLObject v_object) {
        assert NIL != rtp_datastructures.rtp_chart_entry_p(v_object) : "! rtp_datastructures.rtp_chart_entry_p(v_object) " + "rtp_datastructures.rtp_chart_entry_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject rtp_chart_entry_end_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RTP_CHART_ENTRY_P);
        return v_object.getField3();
    }

    public static SubLObject rtp_chart_entry_end(final SubLObject v_object) {
        assert NIL != rtp_datastructures.rtp_chart_entry_p(v_object) : "! rtp_datastructures.rtp_chart_entry_p(v_object) " + "rtp_datastructures.rtp_chart_entry_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject rtp_chart_entry_rule_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RTP_CHART_ENTRY_P);
        return v_object.getField4();
    }

    public static SubLObject rtp_chart_entry_rule(final SubLObject v_object) {
        assert NIL != rtp_datastructures.rtp_chart_entry_p(v_object) : "! rtp_datastructures.rtp_chart_entry_p(v_object) " + "rtp_datastructures.rtp_chart_entry_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject rtp_chart_entry_template_index_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RTP_CHART_ENTRY_P);
        return v_object.getField5();
    }

    public static SubLObject rtp_chart_entry_template_index(final SubLObject v_object) {
        assert NIL != rtp_datastructures.rtp_chart_entry_p(v_object) : "! rtp_datastructures.rtp_chart_entry_p(v_object) " + "rtp_datastructures.rtp_chart_entry_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject rtp_chart_entry_words_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RTP_CHART_ENTRY_P);
        return v_object.getField6();
    }

    public static SubLObject rtp_chart_entry_words(final SubLObject v_object) {
        assert NIL != rtp_datastructures.rtp_chart_entry_p(v_object) : "! rtp_datastructures.rtp_chart_entry_p(v_object) " + "rtp_datastructures.rtp_chart_entry_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject rtp_chart_entry_bindings_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RTP_CHART_ENTRY_P);
        return v_object.getField7();
    }

    public static SubLObject rtp_chart_entry_bindings(final SubLObject v_object) {
        assert NIL != rtp_datastructures.rtp_chart_entry_p(v_object) : "! rtp_datastructures.rtp_chart_entry_p(v_object) " + "rtp_datastructures.rtp_chart_entry_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject rtp_chart_entry_subconstits_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RTP_CHART_ENTRY_P);
        return v_object.getField8();
    }

    public static SubLObject rtp_chart_entry_subconstits(final SubLObject v_object) {
        assert NIL != rtp_datastructures.rtp_chart_entry_p(v_object) : "! rtp_datastructures.rtp_chart_entry_p(v_object) " + "rtp_datastructures.rtp_chart_entry_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject rtp_chart_entry_sem_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RTP_CHART_ENTRY_P);
        return v_object.getField9();
    }

    public static SubLObject rtp_chart_entry_sem(final SubLObject v_object) {
        assert NIL != rtp_datastructures.rtp_chart_entry_p(v_object) : "! rtp_datastructures.rtp_chart_entry_p(v_object) " + "rtp_datastructures.rtp_chart_entry_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject _csetf_rtp_chart_entry_start_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RTP_CHART_ENTRY_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rtp_chart_entry_start(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_datastructures.rtp_chart_entry_p(v_object) : "! rtp_datastructures.rtp_chart_entry_p(v_object) " + "rtp_datastructures.rtp_chart_entry_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_rtp_chart_entry_end_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RTP_CHART_ENTRY_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rtp_chart_entry_end(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_datastructures.rtp_chart_entry_p(v_object) : "! rtp_datastructures.rtp_chart_entry_p(v_object) " + "rtp_datastructures.rtp_chart_entry_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_rtp_chart_entry_rule_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RTP_CHART_ENTRY_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rtp_chart_entry_rule(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_datastructures.rtp_chart_entry_p(v_object) : "! rtp_datastructures.rtp_chart_entry_p(v_object) " + "rtp_datastructures.rtp_chart_entry_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_rtp_chart_entry_template_index_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RTP_CHART_ENTRY_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_rtp_chart_entry_template_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_datastructures.rtp_chart_entry_p(v_object) : "! rtp_datastructures.rtp_chart_entry_p(v_object) " + "rtp_datastructures.rtp_chart_entry_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_rtp_chart_entry_words_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RTP_CHART_ENTRY_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_rtp_chart_entry_words(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_datastructures.rtp_chart_entry_p(v_object) : "! rtp_datastructures.rtp_chart_entry_p(v_object) " + "rtp_datastructures.rtp_chart_entry_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_rtp_chart_entry_bindings_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RTP_CHART_ENTRY_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_rtp_chart_entry_bindings(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_datastructures.rtp_chart_entry_p(v_object) : "! rtp_datastructures.rtp_chart_entry_p(v_object) " + "rtp_datastructures.rtp_chart_entry_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_rtp_chart_entry_subconstits_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RTP_CHART_ENTRY_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_rtp_chart_entry_subconstits(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_datastructures.rtp_chart_entry_p(v_object) : "! rtp_datastructures.rtp_chart_entry_p(v_object) " + "rtp_datastructures.rtp_chart_entry_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_rtp_chart_entry_sem_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RTP_CHART_ENTRY_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_rtp_chart_entry_sem(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_datastructures.rtp_chart_entry_p(v_object) : "! rtp_datastructures.rtp_chart_entry_p(v_object) " + "rtp_datastructures.rtp_chart_entry_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject make_rtp_chart_entry_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rtp.rtp_datastructures.$rtp_chart_entry_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($START)) {
                        com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_rtp_chart_entry_start(v_new, current_value);
                    } else {
                        if (pcase_var.eql($END)) {
                            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_rtp_chart_entry_end(v_new, current_value);
                        } else {
                            if (pcase_var.eql($RULE)) {
                                com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_rtp_chart_entry_rule(v_new, current_value);
                            } else {
                                if (pcase_var.eql($TEMPLATE_INDEX)) {
                                    com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_rtp_chart_entry_template_index(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($WORDS)) {
                                        com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_rtp_chart_entry_words(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($BINDINGS)) {
                                            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_rtp_chart_entry_bindings(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($SUBCONSTITS)) {
                                                com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_rtp_chart_entry_subconstits(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($SEM)) {
                                                    com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_rtp_chart_entry_sem(v_new, current_value);
                                                } else {
                                                    Errors.error($str_alt47$Invalid_slot__S_for_construction_, current_arg);
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
            return v_new;
        }
    }

    public static SubLObject make_rtp_chart_entry(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rtp.rtp_datastructures.$rtp_chart_entry_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($START)) {
                rtp_datastructures._csetf_rtp_chart_entry_start(v_new, current_value);
            } else
                if (pcase_var.eql($END)) {
                    rtp_datastructures._csetf_rtp_chart_entry_end(v_new, current_value);
                } else
                    if (pcase_var.eql($RULE)) {
                        rtp_datastructures._csetf_rtp_chart_entry_rule(v_new, current_value);
                    } else
                        if (pcase_var.eql($TEMPLATE_INDEX)) {
                            rtp_datastructures._csetf_rtp_chart_entry_template_index(v_new, current_value);
                        } else
                            if (pcase_var.eql($WORDS)) {
                                rtp_datastructures._csetf_rtp_chart_entry_words(v_new, current_value);
                            } else
                                if (pcase_var.eql($BINDINGS)) {
                                    rtp_datastructures._csetf_rtp_chart_entry_bindings(v_new, current_value);
                                } else
                                    if (pcase_var.eql($SUBCONSTITS)) {
                                        rtp_datastructures._csetf_rtp_chart_entry_subconstits(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($SEM)) {
                                            rtp_datastructures._csetf_rtp_chart_entry_sem(v_new, current_value);
                                        } else {
                                            Errors.error(rtp_datastructures.$str48$Invalid_slot__S_for_construction_, current_arg);
                                        }







        }
        return v_new;
    }

    public static SubLObject visit_defstruct_rtp_chart_entry(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, rtp_datastructures.MAKE_RTP_CHART_ENTRY, EIGHT_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $START, rtp_datastructures.rtp_chart_entry_start(obj));
        funcall(visitor_fn, obj, $SLOT, $END, rtp_datastructures.rtp_chart_entry_end(obj));
        funcall(visitor_fn, obj, $SLOT, $RULE, rtp_datastructures.rtp_chart_entry_rule(obj));
        funcall(visitor_fn, obj, $SLOT, $TEMPLATE_INDEX, rtp_datastructures.rtp_chart_entry_template_index(obj));
        funcall(visitor_fn, obj, $SLOT, $WORDS, rtp_datastructures.rtp_chart_entry_words(obj));
        funcall(visitor_fn, obj, $SLOT, $BINDINGS, rtp_datastructures.rtp_chart_entry_bindings(obj));
        funcall(visitor_fn, obj, $SLOT, $SUBCONSTITS, rtp_datastructures.rtp_chart_entry_subconstits(obj));
        funcall(visitor_fn, obj, $SLOT, $SEM, rtp_datastructures.rtp_chart_entry_sem(obj));
        funcall(visitor_fn, obj, $END, rtp_datastructures.MAKE_RTP_CHART_ENTRY, EIGHT_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_rtp_chart_entry_method(final SubLObject obj, final SubLObject visitor_fn) {
        return rtp_datastructures.visit_defstruct_rtp_chart_entry(obj, visitor_fn);
    }

    /**
     *
     *
     * @param ENTRY
    rtp-chart-entry
     * 		
     * @param STREAM
     * 		stream; where to send the output
     * @return ENTRY
     */
    @LispMethod(comment = "@param ENTRY\nrtp-chart-entry\r\n\t\t\r\n@param STREAM\r\n\t\tstream; where to send the output\r\n@return ENTRY")
    public static final SubLObject rtp_entry_print_alt(SubLObject entry, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt209$__RTP_entry______Words__S_____Sem, new SubLObject[]{ com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_chart_entry_words(entry), com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_chart_entry_sem(entry), com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_chart_entry_bindings(entry), com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_chart_entry_subconstits(entry), com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_chart_entry_rule(entry), com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_chart_entry_template_index(entry), com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_chart_entry_start(entry) });
        return entry;
    }

    /**
     *
     *
     * @param ENTRY
    rtp-chart-entry
     * 		
     * @param STREAM
     * 		stream; where to send the output
     * @return ENTRY
     */
    @LispMethod(comment = "@param ENTRY\nrtp-chart-entry\r\n\t\t\r\n@param STREAM\r\n\t\tstream; where to send the output\r\n@return ENTRY")
    public static SubLObject rtp_entry_print(final SubLObject entry, final SubLObject stream, final SubLObject depth) {
        format(stream, rtp_datastructures.$str223$__RTP_entry______Words__S_____Sem, new SubLObject[]{ rtp_datastructures.rtp_chart_entry_words(entry), rtp_datastructures.rtp_chart_entry_sem(entry), rtp_datastructures.rtp_chart_entry_bindings(entry), rtp_datastructures.rtp_chart_entry_subconstits(entry), rtp_datastructures.rtp_chart_entry_rule(entry), rtp_datastructures.rtp_chart_entry_template_index(entry), rtp_datastructures.rtp_chart_entry_start(entry) });
        return entry;
    }

    /**
     *
     *
     * @param ENTRY
    rtp-chart-entry
     * 		
     * @return rpt-chart-entry; a copy of ENTRY.
     */
    @LispMethod(comment = "@param ENTRY\nrtp-chart-entry\r\n\t\t\r\n@return rpt-chart-entry; a copy of ENTRY.")
    public static final SubLObject copy_rtp_entry_alt(SubLObject entry) {
        {
            SubLObject new_entry = com.cyc.cycjava.cycl.rtp.rtp_datastructures.make_rtp_chart_entry(UNPROVIDED);
            SubLObject sem = copy_tree(com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_chart_entry_sem(entry));
            SubLObject words = copy_list(com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_chart_entry_words(entry));
            SubLObject subconstits = copy_tree(com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_chart_entry_subconstits(entry));
            SubLObject v_bindings = copy_tree(com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_chart_entry_bindings(entry));
            SubLObject template = com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_chart_entry_rule(entry);
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_rtp_chart_entry_sem(new_entry, sem);
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_rtp_chart_entry_bindings(new_entry, v_bindings);
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_rtp_chart_entry_words(new_entry, words);
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_rtp_chart_entry_subconstits(new_entry, subconstits);
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_rtp_chart_entry_rule(new_entry, template);
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_rtp_chart_entry_template_index(new_entry, com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_chart_entry_template_index(entry));
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_rtp_chart_entry_start(new_entry, com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_chart_entry_start(entry));
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_rtp_chart_entry_end(new_entry, com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_chart_entry_end(entry));
            return new_entry;
        }
    }

    /**
     *
     *
     * @param ENTRY
    rtp-chart-entry
     * 		
     * @return rpt-chart-entry; a copy of ENTRY.
     */
    @LispMethod(comment = "@param ENTRY\nrtp-chart-entry\r\n\t\t\r\n@return rpt-chart-entry; a copy of ENTRY.")
    public static SubLObject copy_rtp_entry(final SubLObject entry) {
        final SubLObject new_entry = rtp_datastructures.make_rtp_chart_entry(UNPROVIDED);
        final SubLObject sem = copy_tree(rtp_datastructures.rtp_chart_entry_sem(entry));
        final SubLObject words = copy_list(rtp_datastructures.rtp_chart_entry_words(entry));
        final SubLObject subconstits = copy_tree(rtp_datastructures.rtp_chart_entry_subconstits(entry));
        final SubLObject v_bindings = copy_tree(rtp_datastructures.rtp_chart_entry_bindings(entry));
        final SubLObject template = rtp_datastructures.rtp_chart_entry_rule(entry);
        rtp_datastructures._csetf_rtp_chart_entry_sem(new_entry, sem);
        rtp_datastructures._csetf_rtp_chart_entry_bindings(new_entry, v_bindings);
        rtp_datastructures._csetf_rtp_chart_entry_words(new_entry, words);
        rtp_datastructures._csetf_rtp_chart_entry_subconstits(new_entry, subconstits);
        rtp_datastructures._csetf_rtp_chart_entry_rule(new_entry, template);
        rtp_datastructures._csetf_rtp_chart_entry_template_index(new_entry, rtp_datastructures.rtp_chart_entry_template_index(entry));
        rtp_datastructures._csetf_rtp_chart_entry_start(new_entry, rtp_datastructures.rtp_chart_entry_start(entry));
        rtp_datastructures._csetf_rtp_chart_entry_end(new_entry, rtp_datastructures.rtp_chart_entry_end(entry));
        return new_entry;
    }

    /**
     *
     *
     * @param WORD-LIST
     * 		list; a list of strings representing the words that still need to be parsed for this edge
     * @param SEM
     * 		list; a pseduo-cycl formula, which may contain keyword variables
     * @return rtp-chart-entry; a rtp-chart-entry containing the words in WORD-LIST and the semantics on SEM
     */
    @LispMethod(comment = "@param WORD-LIST\r\n\t\tlist; a list of strings representing the words that still need to be parsed for this edge\r\n@param SEM\r\n\t\tlist; a pseduo-cycl formula, which may contain keyword variables\r\n@return rtp-chart-entry; a rtp-chart-entry containing the words in WORD-LIST and the semantics on SEM")
    public static final SubLObject make_new_rtp_entry_alt(SubLObject word_list, SubLObject start, SubLObject end, SubLObject sem, SubLObject rule) {
        if (sem == UNPROVIDED) {
            sem = NIL;
        }
        if (rule == UNPROVIDED) {
            rule = NIL;
        }
        {
            SubLObject entry = com.cyc.cycjava.cycl.rtp.rtp_datastructures.make_rtp_chart_entry(UNPROVIDED);
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_rtp_chart_entry_words(entry, copy_list(word_list));
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_rtp_chart_entry_start(entry, start);
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_rtp_chart_entry_end(entry, end);
            if (NIL != sem) {
                com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_rtp_chart_entry_sem(entry, sem.isList() ? ((SubLObject) (copy_tree(sem))) : sem);
            }
            if (NIL != rule) {
                com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_rtp_chart_entry_rule(entry, rule);
                com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_rtp_chart_entry_template_index(entry, ZERO_INTEGER);
            }
            return entry;
        }
    }

    /**
     *
     *
     * @param WORD-LIST
     * 		list; a list of strings representing the words that still need to be parsed for this edge
     * @param SEM
     * 		list; a pseduo-cycl formula, which may contain keyword variables
     * @return rtp-chart-entry; a rtp-chart-entry containing the words in WORD-LIST and the semantics on SEM
     */
    @LispMethod(comment = "@param WORD-LIST\r\n\t\tlist; a list of strings representing the words that still need to be parsed for this edge\r\n@param SEM\r\n\t\tlist; a pseduo-cycl formula, which may contain keyword variables\r\n@return rtp-chart-entry; a rtp-chart-entry containing the words in WORD-LIST and the semantics on SEM")
    public static SubLObject make_new_rtp_entry(final SubLObject word_list, final SubLObject start, final SubLObject end, SubLObject sem, SubLObject rule) {
        if (sem == UNPROVIDED) {
            sem = NIL;
        }
        if (rule == UNPROVIDED) {
            rule = NIL;
        }
        final SubLObject entry = rtp_datastructures.make_rtp_chart_entry(UNPROVIDED);
        rtp_datastructures._csetf_rtp_chart_entry_words(entry, copy_list(word_list));
        rtp_datastructures._csetf_rtp_chart_entry_start(entry, start);
        rtp_datastructures._csetf_rtp_chart_entry_end(entry, end);
        if (NIL != sem) {
            rtp_datastructures._csetf_rtp_chart_entry_sem(entry, sem.isList() ? copy_tree(sem) : sem);
        }
        if (NIL != rule) {
            rtp_datastructures._csetf_rtp_chart_entry_rule(entry, rule);
            rtp_datastructures._csetf_rtp_chart_entry_template_index(entry, ZERO_INTEGER);
        }
        return entry;
    }

    public static final SubLObject set_rtp_entry_remaining_template_alt(SubLObject entry, SubLObject remaining_template) {
        com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_rtp_chart_entry_template_index(entry, subtract(length(com.cyc.cycjava.cycl.rtp.rtp_datastructures.rule_template(com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_chart_entry_rule(entry))), length(remaining_template)));
        return entry;
    }

    public static SubLObject set_rtp_entry_remaining_template(final SubLObject entry, final SubLObject remaining_template) {
        rtp_datastructures._csetf_rtp_chart_entry_template_index(entry, subtract(length(rtp_datastructures.rule_template(rtp_datastructures.rtp_chart_entry_rule(entry))), length(remaining_template)));
        return entry;
    }

    /**
     * Take a chart entry and produce a more usable format that gives the span
     * of the parse and additional information, to make it usable by the
     * concept parser, for example.
     */
    @LispMethod(comment = "Take a chart entry and produce a more usable format that gives the span\r\nof the parse and additional information, to make it usable by the\r\nconcept parser, for example.\nTake a chart entry and produce a more usable format that gives the span\nof the parse and additional information, to make it usable by the\nconcept parser, for example.")
    public static final SubLObject convert_rtp_entry_to_parse_result_alt(SubLObject entry) {
        {
            SubLObject result = com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_chart_entry_sem(entry);
            SubLObject template = com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_chart_entry_rule(entry);
            SubLObject rule = com.cyc.cycjava.cycl.rtp.rtp_datastructures.template_rule_assertion(template);
            SubLObject subconstits = NIL;
            SubLObject bounded = NIL;
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_chart_entry_subconstits(entry);
                SubLObject subconstit = NIL;
                for (subconstit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subconstit = cdolist_list_var.first()) {
                    subconstits = cons(com.cyc.cycjava.cycl.rtp.rtp_datastructures.convert_subconstit_to_parse_result(subconstit), subconstits);
                }
            }
            {
                SubLObject cdolist_list_var = subconstits;
                SubLObject subconstit = NIL;
                for (subconstit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subconstit = cdolist_list_var.first()) {
                    result = nsubst(second(subconstit), subconstit.first(), result, UNPROVIDED, UNPROVIDED);
                }
            }
            bounded = result;
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_chart_entry_bindings(entry);
                SubLObject v_bindings = NIL;
                for (v_bindings = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_bindings = cdolist_list_var.first()) {
                    {
                        SubLObject variable = com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_binding_var(v_bindings);
                        SubLObject bind_set = com.cyc.cycjava.cycl.rtp.rtp_datastructures.rtp_binding_vals(v_bindings);
                        if (bind_set.isCons()) {
                            bind_set = bind_set.first();
                        }
                        bounded = nsubst(bind_set, variable, bounded, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            return values(bounded, rule);
        }
    }

    @LispMethod(comment = "Take a chart entry and produce a more usable format that gives the span\r\nof the parse and additional information, to make it usable by the\r\nconcept parser, for example.\nTake a chart entry and produce a more usable format that gives the span\nof the parse and additional information, to make it usable by the\nconcept parser, for example.")
    public static SubLObject convert_rtp_entry_to_parse_result(final SubLObject entry) {
        SubLObject result = rtp_datastructures.rtp_chart_entry_sem(entry);
        final SubLObject template = rtp_datastructures.rtp_chart_entry_rule(entry);
        final SubLObject rule = rtp_datastructures.template_rule_assertion(template);
        SubLObject subconstits = NIL;
        SubLObject bounded = NIL;
        SubLObject cdolist_list_var = rtp_datastructures.rtp_chart_entry_subconstits(entry);
        SubLObject subconstit = NIL;
        subconstit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            subconstits = cons(rtp_datastructures.convert_subconstit_to_parse_result(subconstit), subconstits);
            cdolist_list_var = cdolist_list_var.rest();
            subconstit = cdolist_list_var.first();
        } 
        cdolist_list_var = subconstits;
        subconstit = NIL;
        subconstit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = nsubst(second(subconstit), subconstit.first(), result, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            subconstit = cdolist_list_var.first();
        } 
        bounded = result;
        cdolist_list_var = rtp_datastructures.rtp_chart_entry_bindings(entry);
        SubLObject v_bindings = NIL;
        v_bindings = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject variable = rtp_datastructures.rtp_binding_var(v_bindings);
            SubLObject bind_set = rtp_datastructures.rtp_binding_vals(v_bindings);
            if (bind_set.isCons()) {
                bind_set = bind_set.first();
            }
            bounded = nsubst(bind_set, variable, bounded, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            v_bindings = cdolist_list_var.first();
        } 
        return values(bounded, rule);
    }/**
     * Take a chart entry and produce a more usable format that gives the span
     * of the parse and additional information, to make it usable by the
     * concept parser, for example.
     */


    public static final SubLObject rtp_sem_testP_alt(SubLObject formula) {
        return makeBoolean(formula.isCons() && (cycl_utilities.formula_arg0(formula) == $$semanticTest));
    }

    public static SubLObject rtp_sem_testP(final SubLObject formula) {
        return makeBoolean(formula.isCons() && formula_arg0(formula).eql(rtp_datastructures.$$semanticTest));
    }

    public static final SubLObject rtp_sem_test_var_alt(SubLObject formula) {
        return cycl_utilities.formula_arg1(formula, UNPROVIDED);
    }

    public static SubLObject rtp_sem_test_var(final SubLObject formula) {
        return formula_arg1(formula, UNPROVIDED);
    }

    public static final SubLObject rtp_sem_test_constraint_alt(SubLObject formula) {
        return cycl_utilities.formula_arg2(formula, UNPROVIDED);
    }

    public static SubLObject rtp_sem_test_constraint(final SubLObject formula) {
        return formula_arg2(formula, UNPROVIDED);
    }

    public static final SubLObject subconstit_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.rtp.rtp_datastructures.print_subconstit(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subconstit_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        rtp_datastructures.print_subconstit(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subconstit_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rtp.rtp_datastructures.$subconstit_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject subconstit_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rtp.rtp_datastructures.$subconstit_native.class ? T : NIL;
    }

    public static final SubLObject subconstit_cat_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SUBCONSTIT_P);
        return v_object.getField2();
    }

    public static SubLObject subconstit_cat(final SubLObject v_object) {
        assert NIL != rtp_datastructures.subconstit_p(v_object) : "! rtp_datastructures.subconstit_p(v_object) " + "rtp_datastructures.subconstit_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject subconstit_string_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SUBCONSTIT_P);
        return v_object.getField3();
    }

    public static SubLObject subconstit_string(final SubLObject v_object) {
        assert NIL != rtp_datastructures.subconstit_p(v_object) : "! rtp_datastructures.subconstit_p(v_object) " + "rtp_datastructures.subconstit_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject subconstit_binding_var_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SUBCONSTIT_P);
        return v_object.getField4();
    }

    public static SubLObject subconstit_binding_var(final SubLObject v_object) {
        assert NIL != rtp_datastructures.subconstit_p(v_object) : "! rtp_datastructures.subconstit_p(v_object) " + "rtp_datastructures.subconstit_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject subconstit_start_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SUBCONSTIT_P);
        return v_object.getField5();
    }

    public static SubLObject subconstit_start(final SubLObject v_object) {
        assert NIL != rtp_datastructures.subconstit_p(v_object) : "! rtp_datastructures.subconstit_p(v_object) " + "rtp_datastructures.subconstit_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject subconstit_end_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SUBCONSTIT_P);
        return v_object.getField6();
    }

    public static SubLObject subconstit_end(final SubLObject v_object) {
        assert NIL != rtp_datastructures.subconstit_p(v_object) : "! rtp_datastructures.subconstit_p(v_object) " + "rtp_datastructures.subconstit_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject subconstit_sem_test_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SUBCONSTIT_P);
        return v_object.getField7();
    }

    public static SubLObject subconstit_sem_test(final SubLObject v_object) {
        assert NIL != rtp_datastructures.subconstit_p(v_object) : "! rtp_datastructures.subconstit_p(v_object) " + "rtp_datastructures.subconstit_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject _csetf_subconstit_cat_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SUBCONSTIT_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_subconstit_cat(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_datastructures.subconstit_p(v_object) : "! rtp_datastructures.subconstit_p(v_object) " + "rtp_datastructures.subconstit_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_subconstit_string_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SUBCONSTIT_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_subconstit_string(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_datastructures.subconstit_p(v_object) : "! rtp_datastructures.subconstit_p(v_object) " + "rtp_datastructures.subconstit_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_subconstit_binding_var_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SUBCONSTIT_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_subconstit_binding_var(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_datastructures.subconstit_p(v_object) : "! rtp_datastructures.subconstit_p(v_object) " + "rtp_datastructures.subconstit_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_subconstit_start_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SUBCONSTIT_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_subconstit_start(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_datastructures.subconstit_p(v_object) : "! rtp_datastructures.subconstit_p(v_object) " + "rtp_datastructures.subconstit_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_subconstit_end_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SUBCONSTIT_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_subconstit_end(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_datastructures.subconstit_p(v_object) : "! rtp_datastructures.subconstit_p(v_object) " + "rtp_datastructures.subconstit_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_subconstit_sem_test_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SUBCONSTIT_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_subconstit_sem_test(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_datastructures.subconstit_p(v_object) : "! rtp_datastructures.subconstit_p(v_object) " + "rtp_datastructures.subconstit_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject make_subconstit_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rtp.rtp_datastructures.$subconstit_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($CAT)) {
                        com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_subconstit_cat(v_new, current_value);
                    } else {
                        if (pcase_var.eql($STRING)) {
                            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_subconstit_string(v_new, current_value);
                        } else {
                            if (pcase_var.eql($BINDING_VAR)) {
                                com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_subconstit_binding_var(v_new, current_value);
                            } else {
                                if (pcase_var.eql($START)) {
                                    com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_subconstit_start(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($END)) {
                                        com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_subconstit_end(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($SEM_TEST)) {
                                            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_subconstit_sem_test(v_new, current_value);
                                        } else {
                                            Errors.error($str_alt47$Invalid_slot__S_for_construction_, current_arg);
                                        }
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

    public static SubLObject make_subconstit(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rtp.rtp_datastructures.$subconstit_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CAT)) {
                rtp_datastructures._csetf_subconstit_cat(v_new, current_value);
            } else
                if (pcase_var.eql($STRING)) {
                    rtp_datastructures._csetf_subconstit_string(v_new, current_value);
                } else
                    if (pcase_var.eql($BINDING_VAR)) {
                        rtp_datastructures._csetf_subconstit_binding_var(v_new, current_value);
                    } else
                        if (pcase_var.eql($START)) {
                            rtp_datastructures._csetf_subconstit_start(v_new, current_value);
                        } else
                            if (pcase_var.eql($END)) {
                                rtp_datastructures._csetf_subconstit_end(v_new, current_value);
                            } else
                                if (pcase_var.eql($SEM_TEST)) {
                                    rtp_datastructures._csetf_subconstit_sem_test(v_new, current_value);
                                } else {
                                    Errors.error(rtp_datastructures.$str48$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_subconstit(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, rtp_datastructures.MAKE_SUBCONSTIT, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CAT, rtp_datastructures.subconstit_cat(obj));
        funcall(visitor_fn, obj, $SLOT, $STRING, rtp_datastructures.subconstit_string(obj));
        funcall(visitor_fn, obj, $SLOT, $BINDING_VAR, rtp_datastructures.subconstit_binding_var(obj));
        funcall(visitor_fn, obj, $SLOT, $START, rtp_datastructures.subconstit_start(obj));
        funcall(visitor_fn, obj, $SLOT, $END, rtp_datastructures.subconstit_end(obj));
        funcall(visitor_fn, obj, $SLOT, $SEM_TEST, rtp_datastructures.subconstit_sem_test(obj));
        funcall(visitor_fn, obj, $END, rtp_datastructures.MAKE_SUBCONSTIT, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_subconstit_method(final SubLObject obj, final SubLObject visitor_fn) {
        return rtp_datastructures.visit_defstruct_subconstit(obj, visitor_fn);
    }

    public static final SubLObject print_subconstit_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt234$__Subconst__S_of_cat__S_, com.cyc.cycjava.cycl.rtp.rtp_datastructures.subconstit_string(v_object), com.cyc.cycjava.cycl.rtp.rtp_datastructures.subconstit_cat(v_object));
        return v_object;
    }

    public static SubLObject print_subconstit(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, rtp_datastructures.$str251$__Subconst__S_of_cat__S_, rtp_datastructures.subconstit_string(v_object), rtp_datastructures.subconstit_cat(v_object));
        return v_object;
    }

    public static final SubLObject make_new_subconstit_alt(SubLObject cat, SubLObject words, SubLObject var, SubLObject start, SubLObject end, SubLObject sem_test) {
        if (sem_test == UNPROVIDED) {
            sem_test = NIL;
        }
        {
            SubLObject subconstit = com.cyc.cycjava.cycl.rtp.rtp_datastructures.make_subconstit(UNPROVIDED);
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_subconstit_cat(subconstit, cat);
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_subconstit_string(subconstit, words);
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_subconstit_binding_var(subconstit, var);
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_subconstit_start(subconstit, start);
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_subconstit_end(subconstit, end);
            com.cyc.cycjava.cycl.rtp.rtp_datastructures._csetf_subconstit_sem_test(subconstit, sem_test);
            return subconstit;
        }
    }

    public static SubLObject make_new_subconstit(final SubLObject cat, final SubLObject words, final SubLObject var, final SubLObject start, final SubLObject end, SubLObject sem_test) {
        if (sem_test == UNPROVIDED) {
            sem_test = NIL;
        }
        final SubLObject subconstit = rtp_datastructures.make_subconstit(UNPROVIDED);
        rtp_datastructures._csetf_subconstit_cat(subconstit, cat);
        rtp_datastructures._csetf_subconstit_string(subconstit, words);
        rtp_datastructures._csetf_subconstit_binding_var(subconstit, var);
        rtp_datastructures._csetf_subconstit_start(subconstit, start);
        rtp_datastructures._csetf_subconstit_end(subconstit, end);
        rtp_datastructures._csetf_subconstit_sem_test(subconstit, sem_test);
        return subconstit;
    }

    /**
     * Take a sub-constituent and convert it into a format usable by the
     * concept harvester.
     */
    @LispMethod(comment = "Take a sub-constituent and convert it into a format usable by the\r\nconcept harvester.\nTake a sub-constituent and convert it into a format usable by the\nconcept harvester.")
    public static final SubLObject convert_subconstit_to_parse_result_alt(SubLObject subconstit) {
        {
            SubLObject start = com.cyc.cycjava.cycl.rtp.rtp_datastructures.subconstit_start(subconstit);
            SubLObject end = com.cyc.cycjava.cycl.rtp.rtp_datastructures.subconstit_end(subconstit);
            SubLObject variable = com.cyc.cycjava.cycl.rtp.rtp_datastructures.subconstit_binding_var(subconstit);
            SubLObject category = com.cyc.cycjava.cycl.rtp.rtp_datastructures.subconstit_cat(subconstit);
            SubLObject word_used = string_utilities.bunge(com.cyc.cycjava.cycl.rtp.rtp_datastructures.subconstit_string(subconstit), UNPROVIDED);
            SubLObject sem_test = (NIL != com.cyc.cycjava.cycl.rtp.rtp_datastructures.subconstit_sem_test(subconstit)) ? ((SubLObject) (com.cyc.cycjava.cycl.rtp.rtp_datastructures.subconstit_sem_test(subconstit))) : $list_alt235;
            SubLObject span = NIL;
            if (category == $$StringTemplate) {
                return list(variable, word_used);
            }
            if (subtract(end, ONE_INTEGER).numLE(start)) {
                span = cons(start, NIL);
            } else {
                {
                    SubLObject count = subtract(end, start);
                    SubLObject result = NIL;
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(count); i = add(i, ONE_INTEGER)) {
                        result = cons(add(start, i), result);
                    }
                    span = nreverse(result);
                }
            }
            span = cons($$TheList, span);
            return list(variable, list($$TheResultOfParsing, word_used, span, category, sem_test));
        }
    }

    @LispMethod(comment = "Take a sub-constituent and convert it into a format usable by the\r\nconcept harvester.\nTake a sub-constituent and convert it into a format usable by the\nconcept harvester.")
    public static SubLObject convert_subconstit_to_parse_result(final SubLObject subconstit) {
        final SubLObject start = rtp_datastructures.subconstit_start(subconstit);
        final SubLObject end = rtp_datastructures.subconstit_end(subconstit);
        final SubLObject variable = rtp_datastructures.subconstit_binding_var(subconstit);
        final SubLObject category = rtp_datastructures.subconstit_cat(subconstit);
        final SubLObject word_used = bunge(rtp_datastructures.subconstit_string(subconstit), UNPROVIDED);
        final SubLObject sem_test = (NIL != rtp_datastructures.subconstit_sem_test(subconstit)) ? rtp_datastructures.subconstit_sem_test(subconstit) : rtp_datastructures.$list252;
        SubLObject span = NIL;
        if (category.eql(rtp_datastructures.$$StringTemplate)) {
            return list(variable, word_used);
        }
        if (subtract(end, ONE_INTEGER).numLE(start)) {
            span = cons(start, NIL);
        } else {
            final SubLObject count = subtract(end, start);
            SubLObject result = NIL;
            SubLObject i;
            for (i = NIL, i = ZERO_INTEGER; i.numL(count); i = add(i, ONE_INTEGER)) {
                result = cons(add(start, i), result);
            }
            span = nreverse(result);
        }
        span = cons(rtp_datastructures.$$TheList, span);
        return list(variable, list(rtp_datastructures.$$TheResultOfParsing, word_used, span, category, sem_test));
    }/**
     * Take a sub-constituent and convert it into a format usable by the
     * concept harvester.
     */


    /**
     *
     *
     * @param VAR
     * 		atom; the name of a variable
     * @param VALUE
     * 		cyc term
     * @return list; a variable-value list
     */
    @LispMethod(comment = "@param VAR\r\n\t\tatom; the name of a variable\r\n@param VALUE\r\n\t\tcyc term\r\n@return list; a variable-value list")
    public static final SubLObject rtp_make_binding_alt(SubLObject var, SubLObject value) {
        return list(var, value);
    }

    /**
     *
     *
     * @param VAR
     * 		atom; the name of a variable
     * @param VALUE
     * 		cyc term
     * @return list; a variable-value list
     */
    @LispMethod(comment = "@param VAR\r\n\t\tatom; the name of a variable\r\n@param VALUE\r\n\t\tcyc term\r\n@return list; a variable-value list")
    public static SubLObject rtp_make_binding(final SubLObject var, final SubLObject value) {
        return list(var, value);
    }

    /**
     *
     *
     * @param BINDING
    list
     * 		
     * @return keyword; the variable specified in BINDING
     */
    @LispMethod(comment = "@param BINDING\nlist\r\n\t\t\r\n@return keyword; the variable specified in BINDING")
    public static final SubLObject rtp_binding_var_alt(SubLObject binding) {
        return binding.first();
    }

    /**
     *
     *
     * @param BINDING
    list
     * 		
     * @return keyword; the variable specified in BINDING
     */
    @LispMethod(comment = "@param BINDING\nlist\r\n\t\t\r\n@return keyword; the variable specified in BINDING")
    public static SubLObject rtp_binding_var(final SubLObject binding) {
        return binding.first();
    }

    /**
     *
     *
     * @param BINDING
    list
     * 		
     * @return list; the bindings specified in BINDING
     */
    @LispMethod(comment = "@param BINDING\nlist\r\n\t\t\r\n@return list; the bindings specified in BINDING")
    public static final SubLObject rtp_binding_vals_alt(SubLObject binding) {
        return second(binding);
    }

    /**
     *
     *
     * @param BINDING
    list
     * 		
     * @return list; the bindings specified in BINDING
     */
    @LispMethod(comment = "@param BINDING\nlist\r\n\t\t\r\n@return list; the bindings specified in BINDING")
    public static SubLObject rtp_binding_vals(final SubLObject binding) {
        return second(binding);
    }

    public static final SubLObject rtp_binding_p_alt(SubLObject binding) {
        return makeBoolean((binding.isList() && binding.first().isKeyword()) && (NIL != list_utilities.lengthE(binding, TWO_INTEGER, UNPROVIDED)));
    }

    public static SubLObject rtp_binding_p(final SubLObject binding) {
        return makeBoolean((binding.isList() && binding.first().isKeyword()) && (NIL != lengthE(binding, TWO_INTEGER, UNPROVIDED)));
    }

    /**
     *
     *
     * @unknown presently assumes that it is given a template-item that passes RTP-WORD-ITEM?
     * @param TEMPLATE-ITEM
    template-item
     * 		
     * @return NIL or instance of #$LexicalWord
     */
    @LispMethod(comment = "@unknown presently assumes that it is given a template-item that passes RTP-WORD-ITEM?\r\n@param TEMPLATE-ITEM\ntemplate-item\r\n\t\t\r\n@return NIL or instance of #$LexicalWord")
    public static final SubLObject template_item_wu_alt(SubLObject template_item) {
        return rtp_type_checkers.rtp_word_item_word(template_item);
    }

    /**
     *
     *
     * @unknown presently assumes that it is given a template-item that passes RTP-WORD-ITEM?
     * @param TEMPLATE-ITEM
    template-item
     * 		
     * @return NIL or instance of #$LexicalWord
     */
    @LispMethod(comment = "@unknown presently assumes that it is given a template-item that passes RTP-WORD-ITEM?\r\n@param TEMPLATE-ITEM\ntemplate-item\r\n\t\t\r\n@return NIL or instance of #$LexicalWord")
    public static SubLObject template_item_wu(final SubLObject template_item) {
        return rtp_type_checkers.rtp_word_item_word(template_item);
    }

    /**
     *
     *
     * @unknown presently assumes that it is given a template-item that passes RTP-WORD-ITEM?
     * @param TEMPLATE-ITEM
    template-item
     * 		
     * @return NIL or a #$SpeechPart
     */
    @LispMethod(comment = "@unknown presently assumes that it is given a template-item that passes RTP-WORD-ITEM?\r\n@param TEMPLATE-ITEM\ntemplate-item\r\n\t\t\r\n@return NIL or a #$SpeechPart")
    public static final SubLObject template_item_pos_alt(SubLObject template_item) {
        return rtp_type_checkers.rtp_word_item_syntactic_constraint(template_item);
    }

    /**
     *
     *
     * @unknown presently assumes that it is given a template-item that passes RTP-WORD-ITEM?
     * @param TEMPLATE-ITEM
    template-item
     * 		
     * @return NIL or a #$SpeechPart
     */
    @LispMethod(comment = "@unknown presently assumes that it is given a template-item that passes RTP-WORD-ITEM?\r\n@param TEMPLATE-ITEM\ntemplate-item\r\n\t\t\r\n@return NIL or a #$SpeechPart")
    public static SubLObject template_item_pos(final SubLObject template_item) {
        return rtp_type_checkers.rtp_word_item_syntactic_constraint(template_item);
    }

    public static final SubLObject reset_all_rtp_datastructure_caches_alt() {
        rtp_type_checkers.clear_rtp_template_categoryP();
        com.cyc.cycjava.cycl.rtp.rtp_datastructures.clear_make_optional_word_list();
        lexicon_accessors.clear_get_strings_of_type_cached();
        com.cyc.cycjava.cycl.rtp.rtp_datastructures.clear_all_phrases_filter_from_term_phrases_constraint();
        recognition.clear_expand_word_items_in_list_int();
        com.cyc.cycjava.cycl.rtp.rtp_datastructures.clear_template_mts();
        com.cyc.cycjava.cycl.rtp.rtp_datastructures.clear_relevant_template_mts();
        return $RESET;
    }

    public static SubLObject reset_all_rtp_datastructure_caches() {
        rtp_type_checkers.clear_rtp_template_categoryP();
        rtp_datastructures.clear_make_optional_word_list();
        clear_get_strings_of_type_cached();
        rtp_datastructures.clear_all_phrases_filter_from_term_phrases_constraint();
        recognition.clear_expand_word_items_in_list_int();
        rtp_datastructures.clear_template_mts();
        rtp_datastructures.clear_relevant_template_mts();
        return $RESET;
    }

    public static final SubLObject declare_rtp_datastructures_file_alt() {
        declareFunction("assertion_arg", "ASSERTION-ARG", 2, 0, false);
        declareFunction("add_template_meta_marker", "ADD-TEMPLATE-META-MARKER", 2, 0, false);
        declareFunction("map_template_meta_marker", "MAP-TEMPLATE-META-MARKER", 1, 0, false);
        declareFunction("interpret_template_meta_marker_assertion", "INTERPRET-TEMPLATE-META-MARKER-ASSERTION", 1, 0, false);
        declareFunction("populate_meta_markers_from_mt", "POPULATE-META-MARKERS-FROM-MT", 1, 1, false);
        declareFunction("transform_meta_markers_in_template_expression", "TRANSFORM-META-MARKERS-IN-TEMPLATE-EXPRESSION", 1, 0, false);
        declareFunction("map_template_category_fill_words", "MAP-TEMPLATE-CATEGORY-FILL-WORDS", 1, 0, false);
        declareFunction("add_template_category_fill_word", "ADD-TEMPLATE-CATEGORY-FILL-WORD", 2, 0, false);
        declareFunction("interpret_template_category_fill_word_assertion", "INTERPRET-TEMPLATE-CATEGORY-FILL-WORD-ASSERTION", 1, 0, false);
        declareFunction("populate_template_category_fill_words_from_mt", "POPULATE-TEMPLATE-CATEGORY-FILL-WORDS-FROM-MT", 1, 1, false);
        declareFunction("clear_make_optional_word_list", "CLEAR-MAKE-OPTIONAL-WORD-LIST", 0, 0, false);
        declareFunction("remove_make_optional_word_list", "REMOVE-MAKE-OPTIONAL-WORD-LIST", 1, 0, false);
        declareFunction("make_optional_word_list_internal", "MAKE-OPTIONAL-WORD-LIST-INTERNAL", 1, 0, false);
        declareFunction("make_optional_word_list", "MAKE-OPTIONAL-WORD-LIST", 1, 0, false);
        declareFunction("add_category_fill_words_to_template", "ADD-CATEGORY-FILL-WORDS-TO-TEMPLATE", 2, 0, false);
        declareFunction("template_rule_print_function_trampoline", "TEMPLATE-RULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("template_rule_p", "TEMPLATE-RULE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.rtp.rtp_datastructures.$template_rule_p$UnaryFunction();
        declareFunction("template_rule_category", "TEMPLATE-RULE-CATEGORY", 1, 0, false);
        declareFunction("template_rule_template", "TEMPLATE-RULE-TEMPLATE", 1, 0, false);
        declareFunction("template_rule_transformation", "TEMPLATE-RULE-TRANSFORMATION", 1, 0, false);
        declareFunction("template_rule_sem_test", "TEMPLATE-RULE-SEM-TEST", 1, 0, false);
        declareFunction("template_rule_assertion", "TEMPLATE-RULE-ASSERTION", 1, 0, false);
        declareFunction("template_rule_terminals", "TEMPLATE-RULE-TERMINALS", 1, 0, false);
        declareFunction("template_rule_meaning", "TEMPLATE-RULE-MEANING", 1, 0, false);
        declareFunction("template_rule_constraints", "TEMPLATE-RULE-CONSTRAINTS", 1, 0, false);
        declareFunction("template_rule_id", "TEMPLATE-RULE-ID", 1, 0, false);
        declareFunction("_csetf_template_rule_category", "_CSETF-TEMPLATE-RULE-CATEGORY", 2, 0, false);
        declareFunction("_csetf_template_rule_template", "_CSETF-TEMPLATE-RULE-TEMPLATE", 2, 0, false);
        declareFunction("_csetf_template_rule_transformation", "_CSETF-TEMPLATE-RULE-TRANSFORMATION", 2, 0, false);
        declareFunction("_csetf_template_rule_sem_test", "_CSETF-TEMPLATE-RULE-SEM-TEST", 2, 0, false);
        declareFunction("_csetf_template_rule_assertion", "_CSETF-TEMPLATE-RULE-ASSERTION", 2, 0, false);
        declareFunction("_csetf_template_rule_terminals", "_CSETF-TEMPLATE-RULE-TERMINALS", 2, 0, false);
        declareFunction("_csetf_template_rule_meaning", "_CSETF-TEMPLATE-RULE-MEANING", 2, 0, false);
        declareFunction("_csetf_template_rule_constraints", "_CSETF-TEMPLATE-RULE-CONSTRAINTS", 2, 0, false);
        declareFunction("_csetf_template_rule_id", "_CSETF-TEMPLATE-RULE-ID", 2, 0, false);
        declareFunction("make_template_rule", "MAKE-TEMPLATE-RULE", 0, 1, false);
        declareFunction("rtp_chart_entry_sem_test", "RTP-CHART-ENTRY-SEM-TEST", 1, 0, false);
        declareFunction("rtp_chart_entry_sem_testP", "RTP-CHART-ENTRY-SEM-TEST?", 1, 0, false);
        declareFunction("sxhash_template_rule_method", "SXHASH-TEMPLATE-RULE-METHOD", 1, 0, false);
        new com.cyc.cycjava.cycl.rtp.rtp_datastructures.$sxhash_template_rule_method$UnaryFunction();
        declareFunction("print_template_rule", "PRINT-TEMPLATE-RULE", 3, 0, false);
        declareFunction("new_template_rule", "NEW-TEMPLATE-RULE", 3, 3, false);
        declareFunction("cfasl_output_object_template_rule_method", "CFASL-OUTPUT-OBJECT-TEMPLATE-RULE-METHOD", 2, 0, false);
        declareFunction("cfasl_output_template_rule", "CFASL-OUTPUT-TEMPLATE-RULE", 2, 0, false);
        declareFunction("cfasl_input_template_rule", "CFASL-INPUT-TEMPLATE-RULE", 1, 0, false);
        new com.cyc.cycjava.cycl.rtp.rtp_datastructures.$cfasl_input_template_rule$UnaryFunction();
        declareFunction("template_span_item_print_function_trampoline", "TEMPLATE-SPAN-ITEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("template_span_item_p", "TEMPLATE-SPAN-ITEM-P", 1, 0, false);
        new com.cyc.cycjava.cycl.rtp.rtp_datastructures.$template_span_item_p$UnaryFunction();
        declareFunction("template_span_item_template_item", "TEMPLATE-SPAN-ITEM-TEMPLATE-ITEM", 1, 0, false);
        declareFunction("template_span_item_start", "TEMPLATE-SPAN-ITEM-START", 1, 0, false);
        declareFunction("template_span_item_end", "TEMPLATE-SPAN-ITEM-END", 1, 0, false);
        declareFunction("_csetf_template_span_item_template_item", "_CSETF-TEMPLATE-SPAN-ITEM-TEMPLATE-ITEM", 2, 0, false);
        declareFunction("_csetf_template_span_item_start", "_CSETF-TEMPLATE-SPAN-ITEM-START", 2, 0, false);
        declareFunction("_csetf_template_span_item_end", "_CSETF-TEMPLATE-SPAN-ITEM-END", 2, 0, false);
        declareFunction("make_template_span_item", "MAKE-TEMPLATE-SPAN-ITEM", 0, 1, false);
        declareFunction("new_template_span_item", "NEW-TEMPLATE-SPAN-ITEM", 3, 0, false);
        declareFunction("print_template_span_item", "PRINT-TEMPLATE-SPAN-ITEM", 3, 0, false);
        declareFunction("extract_constraints_from_template", "EXTRACT-CONSTRAINTS-FROM-TEMPLATE", 1, 0, false);
        declareFunction("optimize_template_constraints", "OPTIMIZE-TEMPLATE-CONSTRAINTS", 1, 0, false);
        declareFunction("ensure_flattened_constraint", "ENSURE-FLATTENED-CONSTRAINT", 1, 0, false);
        declareFunction("compile_template_expression", "COMPILE-TEMPLATE-EXPRESSION", 2, 0, false);
        declareFunction("expand_word_items", "EXPAND-WORD-ITEMS", 1, 0, false);
        declareFunction("expand_word_sequences", "EXPAND-WORD-SEQUENCES", 1, 0, false);
        declareFunction("possibly_expand_string_item", "POSSIBLY-EXPAND-STRING-ITEM", 1, 0, false);
        declareFunction("possibly_expand_word_sequence_item", "POSSIBLY-EXPAND-WORD-SEQUENCE-ITEM", 1, 0, false);
        declareFunction("ensure_non_recursive_template", "ENSURE-NON-RECURSIVE-TEMPLATE", 2, 0, false);
        declareFunction("clear_denotations_of_constant", "CLEAR-DENOTATIONS-OF-CONSTANT", 0, 0, false);
        declareFunction("remove_denotations_of_constant", "REMOVE-DENOTATIONS-OF-CONSTANT", 1, 1, false);
        declareFunction("denotations_of_constant_internal", "DENOTATIONS-OF-CONSTANT-INTERNAL", 2, 0, false);
        declareFunction("denotations_of_constant", "DENOTATIONS-OF-CONSTANT", 1, 1, false);
        declareFunction("rtp_preds_from_term_phrases_constraint", "RTP-PREDS-FROM-TERM-PHRASES-CONSTRAINT", 1, 0, false);
        declareFunction("clear_all_phrases_filter_from_term_phrases_constraint", "CLEAR-ALL-PHRASES-FILTER-FROM-TERM-PHRASES-CONSTRAINT", 0, 0, false);
        declareFunction("remove_all_phrases_filter_from_term_phrases_constraint", "REMOVE-ALL-PHRASES-FILTER-FROM-TERM-PHRASES-CONSTRAINT", 1, 0, false);
        declareFunction("all_phrases_filter_from_term_phrases_constraint_internal", "ALL-PHRASES-FILTER-FROM-TERM-PHRASES-CONSTRAINT-INTERNAL", 1, 0, false);
        declareFunction("all_phrases_filter_from_term_phrases_constraint", "ALL-PHRASES-FILTER-FROM-TERM-PHRASES-CONSTRAINT", 1, 0, false);
        declareFunction("replace_constants_with_denotations", "REPLACE-CONSTANTS-WITH-DENOTATIONS", 1, 0, false);
        declareFunction("transform_cyc_term_item", "TRANSFORM-CYC-TERM-ITEM", 1, 0, false);
        declareFunction("optimize_template_expression", "OPTIMIZE-TEMPLATE-EXPRESSION", 1, 0, false);
        declareFunction("extract_terminals_from_template", "EXTRACT-TERMINALS-FROM-TEMPLATE", 1, 0, false);
        declareFunction("check_for_terminals_in_subtemplate", "CHECK-FOR-TERMINALS-IN-SUBTEMPLATE", 2, 0, false);
        declareFunction("compute_strings_of_type", "COMPUTE-STRINGS-OF-TYPE", 1, 0, false);
        declareFunction("possible_contractions_for_subtemplate", "POSSIBLE-CONTRACTIONS-FOR-SUBTEMPLATE", 1, 0, false);
        declareFunction("maybe_initialize_rtp_contractions_table", "MAYBE-INITIALIZE-RTP-CONTRACTIONS-TABLE", 0, 1, false);
        declareFunction("template_rule_constraints_matchP", "TEMPLATE-RULE-CONSTRAINTS-MATCH?", 2, 0, false);
        declareFunction("verify_words_meet_constraints", "VERIFY-WORDS-MEET-CONSTRAINTS", 2, 0, false);
        declareFunction("rtp_member", "RTP-MEMBER", 2, 1, false);
        declareFunction("match_some_of", "MATCH-SOME-OF", 3, 0, false);
        declareFunction("match_sequence", "MATCH-SEQUENCE", 2, 1, false);
        declareFunction("remove_an_internal_group", "REMOVE-AN-INTERNAL-GROUP", 2, 0, false);
        declareFunction("rtp_clear_rules", "RTP-CLEAR-RULES", 0, 0, false);
        declareFunction("allocate_rtp_rules", "ALLOCATE-RTP-RULES", 0, 0, false);
        declareFunction("ensure_rtp_rules", "ENSURE-RTP-RULES", 0, 0, false);
        declareFunction("add_rtp_rule", "ADD-RTP-RULE", 1, 0, false);
        declareFunction("rtp_rule_existsP", "RTP-RULE-EXISTS?", 1, 0, false);
        declareFunction("remove_rtp_rule", "REMOVE-RTP-RULE", 1, 0, false);
        declareFunction("find_rtp_rules_by_assertion", "FIND-RTP-RULES-BY-ASSERTION", 1, 0, false);
        declareFunction("rtp_rules_cache_unbuiltP", "RTP-RULES-CACHE-UNBUILT?", 0, 0, false);
        declareFunction("dump_rtp_rules_cache_to_stream", "DUMP-RTP-RULES-CACHE-TO-STREAM", 1, 0, false);
        declareFunction("load_rtp_rules_cache_from_stream", "LOAD-RTP-RULES-CACHE-FROM-STREAM", 1, 0, false);
        declareFunction("rtp_rule", "RTP-RULE", 3, 0, false);
        declareFunction("make_rtp_rule", "MAKE-RTP-RULE", 3, 0, false);
        declareFunction("rule_cat", "RULE-CAT", 1, 0, false);
        declareFunction("rule_template", "RULE-TEMPLATE", 1, 0, false);
        declareFunction("rule_sem", "RULE-SEM", 1, 0, false);
        declareFunction("clear_template_rules_master_index", "CLEAR-TEMPLATE-RULES-MASTER-INDEX", 0, 0, false);
        declareFunction("allocate_template_rules_master_index", "ALLOCATE-TEMPLATE-RULES-MASTER-INDEX", 0, 0, false);
        declareFunction("ensure_template_rules_master_index", "ENSURE-TEMPLATE-RULES-MASTER-INDEX", 0, 0, false);
        declareFunction("enumerate_all_template_categories", "ENUMERATE-ALL-TEMPLATE-CATEGORIES", 0, 0, false);
        declareFunction("categorized_template_rule_set_print_function_trampoline", "CATEGORIZED-TEMPLATE-RULE-SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("categorized_template_rule_set_p", "CATEGORIZED-TEMPLATE-RULE-SET-P", 1, 0, false);
        new com.cyc.cycjava.cycl.rtp.rtp_datastructures.$categorized_template_rule_set_p$UnaryFunction();
        declareFunction("categorized_template_rule_set_mentions", "CATEGORIZED-TEMPLATE-RULE-SET-MENTIONS", 1, 0, false);
        declareFunction("categorized_template_rule_set_generic", "CATEGORIZED-TEMPLATE-RULE-SET-GENERIC", 1, 0, false);
        declareFunction("categorized_template_rule_set_key_terminal", "CATEGORIZED-TEMPLATE-RULE-SET-KEY-TERMINAL", 1, 0, false);
        declareFunction("_csetf_categorized_template_rule_set_mentions", "_CSETF-CATEGORIZED-TEMPLATE-RULE-SET-MENTIONS", 2, 0, false);
        declareFunction("_csetf_categorized_template_rule_set_generic", "_CSETF-CATEGORIZED-TEMPLATE-RULE-SET-GENERIC", 2, 0, false);
        declareFunction("_csetf_categorized_template_rule_set_key_terminal", "_CSETF-CATEGORIZED-TEMPLATE-RULE-SET-KEY-TERMINAL", 2, 0, false);
        declareFunction("make_categorized_template_rule_set", "MAKE-CATEGORIZED-TEMPLATE-RULE-SET", 0, 1, false);
        declareFunction("new_categorized_template_rule_set", "NEW-CATEGORIZED-TEMPLATE-RULE-SET", 0, 1, false);
        declareFunction("update_rule_set_mentions", "UPDATE-RULE-SET-MENTIONS", 3, 0, false);
        declareFunction("eliminate_rule_set_mentions", "ELIMINATE-RULE-SET-MENTIONS", 3, 0, false);
        declareFunction("compute_rule_set_mentions_specificity", "COMPUTE-RULE-SET-MENTIONS-SPECIFICITY", 2, 0, false);
        declareFunction("update_rule_set_key_terminal", "UPDATE-RULE-SET-KEY-TERMINAL", 3, 0, false);
        declareFunction("eliminate_rule_set_key_terminal", "ELIMINATE-RULE-SET-KEY-TERMINAL", 3, 0, false);
        declareFunction("update_rule_set_generic", "UPDATE-RULE-SET-GENERIC", 2, 0, false);
        declareFunction("eliminate_rule_set_generic", "ELIMINATE-RULE-SET-GENERIC", 2, 0, false);
        declareFunction("get_categorized_template_rule_set", "GET-CATEGORIZED-TEMPLATE-RULE-SET", 2, 0, false);
        declareFunction("add_categorized_template_rule_set", "ADD-CATEGORIZED-TEMPLATE-RULE-SET", 2, 0, false);
        declareFunction("find_or_add_categorized_template_rule_set", "FIND-OR-ADD-CATEGORIZED-TEMPLATE-RULE-SET", 2, 0, false);
        declareFunction("extend_categorized_template_rule_set", "EXTEND-CATEGORIZED-TEMPLATE-RULE-SET", 2, 0, false);
        declareFunction("reduce_categorized_template_rule_set", "REDUCE-CATEGORIZED-TEMPLATE-RULE-SET", 2, 0, false);
        declareFunction("reconsider_rule_set_key_terminal", "RECONSIDER-RULE-SET-KEY-TERMINAL", 3, 0, false);
        declareFunction("recompute_rule_set_key_terminal", "RECOMPUTE-RULE-SET-KEY-TERMINAL", 2, 0, false);
        declareFunction("find_most_specific_terminal_in_rule_set", "FIND-MOST-SPECIFIC-TERMINAL-IN-RULE-SET", 2, 0, false);
        declareFunction("find_most_specific_terminals_in_rule_set", "FIND-MOST-SPECIFIC-TERMINALS-IN-RULE-SET", 2, 0, false);
        declareMacro("do_templates_for_terminal", "DO-TEMPLATES-FOR-TERMINAL");
        declareMacro("with_clean_rtp_associative_memory", "WITH-CLEAN-RTP-ASSOCIATIVE-MEMORY");
        declareFunction("template_in_associative_memoryP", "TEMPLATE-IN-ASSOCIATIVE-MEMORY?", 4, 0, false);
        declareFunction("clear_relevant_template_mts", "CLEAR-RELEVANT-TEMPLATE-MTS", 0, 0, false);
        declareFunction("remove_relevant_template_mts", "REMOVE-RELEVANT-TEMPLATE-MTS", 1, 0, false);
        declareFunction("relevant_template_mts_internal", "RELEVANT-TEMPLATE-MTS-INTERNAL", 1, 0, false);
        declareFunction("relevant_template_mts", "RELEVANT-TEMPLATE-MTS", 1, 0, false);
        declareFunction("clear_template_mts", "CLEAR-TEMPLATE-MTS", 0, 0, false);
        declareFunction("template_mts", "TEMPLATE-MTS", 0, 0, false);
        declareFunction("get_templates_for_terminal", "GET-TEMPLATES-FOR-TERMINAL", 3, 0, false);
        declareFunction("get_best_templates_for_terminal", "GET-BEST-TEMPLATES-FOR-TERMINAL", 3, 0, false);
        declareFunction("get_generic_templates_for_category", "GET-GENERIC-TEMPLATES-FOR-CATEGORY", 2, 0, false);
        declareFunction("enumerate_all_terminals", "ENUMERATE-ALL-TERMINALS", 1, 0, false);
        declareFunction("enumerate_all_best_terminals", "ENUMERATE-ALL-BEST-TERMINALS", 1, 0, false);
        declareFunction("populate_rtp_from_mt", "POPULATE-RTP-FROM-MT", 1, 1, false);
        declareFunction("repopulate_rtp_from_mt", "REPOPULATE-RTP-FROM-MT", 1, 1, false);
        declareFunction("extend_rtp_from_mt", "EXTEND-RTP-FROM-MT", 2, 0, false);
        declareFunction("extend_rtp_from_just_mt_for_tp_type", "EXTEND-RTP-FROM-JUST-MT-FOR-TP-TYPE", 3, 0, false);
        declareFunction("template_count_for_pred_and_categories", "TEMPLATE-COUNT-FOR-PRED-AND-CATEGORIES", 2, 1, false);
        declareFunction("extend_rtp_with_template_assertion", "EXTEND-RTP-WITH-TEMPLATE-ASSERTION", 1, 0, false);
        declareFunction("strip_wrapper_functions_from", "STRIP-WRAPPER-FUNCTIONS-FROM", 1, 0, false);
        declareFunction("reduce_rtp_by_template_assertion", "REDUCE-RTP-BY-TEMPLATE-ASSERTION", 1, 0, false);
        declareFunction("add_template_assertion", "ADD-TEMPLATE-ASSERTION", 2, 0, false);
        declareFunction("remove_template_assertion", "REMOVE-TEMPLATE-ASSERTION", 2, 0, false);
        declareFunction("cached_template_assertion_p", "CACHED-TEMPLATE-ASSERTION-P", 2, 0, false);
        declareFunction("rtp_chart_entry_print_function_trampoline", "RTP-CHART-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("rtp_chart_entry_p", "RTP-CHART-ENTRY-P", 1, 0, false);
        new com.cyc.cycjava.cycl.rtp.rtp_datastructures.$rtp_chart_entry_p$UnaryFunction();
        declareFunction("rtp_chart_entry_start", "RTP-CHART-ENTRY-START", 1, 0, false);
        declareFunction("rtp_chart_entry_end", "RTP-CHART-ENTRY-END", 1, 0, false);
        declareFunction("rtp_chart_entry_rule", "RTP-CHART-ENTRY-RULE", 1, 0, false);
        declareFunction("rtp_chart_entry_template_index", "RTP-CHART-ENTRY-TEMPLATE-INDEX", 1, 0, false);
        declareFunction("rtp_chart_entry_words", "RTP-CHART-ENTRY-WORDS", 1, 0, false);
        declareFunction("rtp_chart_entry_bindings", "RTP-CHART-ENTRY-BINDINGS", 1, 0, false);
        declareFunction("rtp_chart_entry_subconstits", "RTP-CHART-ENTRY-SUBCONSTITS", 1, 0, false);
        declareFunction("rtp_chart_entry_sem", "RTP-CHART-ENTRY-SEM", 1, 0, false);
        declareFunction("_csetf_rtp_chart_entry_start", "_CSETF-RTP-CHART-ENTRY-START", 2, 0, false);
        declareFunction("_csetf_rtp_chart_entry_end", "_CSETF-RTP-CHART-ENTRY-END", 2, 0, false);
        declareFunction("_csetf_rtp_chart_entry_rule", "_CSETF-RTP-CHART-ENTRY-RULE", 2, 0, false);
        declareFunction("_csetf_rtp_chart_entry_template_index", "_CSETF-RTP-CHART-ENTRY-TEMPLATE-INDEX", 2, 0, false);
        declareFunction("_csetf_rtp_chart_entry_words", "_CSETF-RTP-CHART-ENTRY-WORDS", 2, 0, false);
        declareFunction("_csetf_rtp_chart_entry_bindings", "_CSETF-RTP-CHART-ENTRY-BINDINGS", 2, 0, false);
        declareFunction("_csetf_rtp_chart_entry_subconstits", "_CSETF-RTP-CHART-ENTRY-SUBCONSTITS", 2, 0, false);
        declareFunction("_csetf_rtp_chart_entry_sem", "_CSETF-RTP-CHART-ENTRY-SEM", 2, 0, false);
        declareFunction("make_rtp_chart_entry", "MAKE-RTP-CHART-ENTRY", 0, 1, false);
        declareFunction("rtp_entry_print", "RTP-ENTRY-PRINT", 3, 0, false);
        declareFunction("copy_rtp_entry", "COPY-RTP-ENTRY", 1, 0, false);
        declareFunction("make_new_rtp_entry", "MAKE-NEW-RTP-ENTRY", 3, 2, false);
        declareFunction("set_rtp_entry_remaining_template", "SET-RTP-ENTRY-REMAINING-TEMPLATE", 2, 0, false);
        declareFunction("convert_rtp_entry_to_parse_result", "CONVERT-RTP-ENTRY-TO-PARSE-RESULT", 1, 0, false);
        declareFunction("rtp_sem_testP", "RTP-SEM-TEST?", 1, 0, false);
        declareFunction("rtp_sem_test_var", "RTP-SEM-TEST-VAR", 1, 0, false);
        declareFunction("rtp_sem_test_constraint", "RTP-SEM-TEST-CONSTRAINT", 1, 0, false);
        declareFunction("subconstit_print_function_trampoline", "SUBCONSTIT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("subconstit_p", "SUBCONSTIT-P", 1, 0, false);
        new com.cyc.cycjava.cycl.rtp.rtp_datastructures.$subconstit_p$UnaryFunction();
        declareFunction("subconstit_cat", "SUBCONSTIT-CAT", 1, 0, false);
        declareFunction("subconstit_string", "SUBCONSTIT-STRING", 1, 0, false);
        declareFunction("subconstit_binding_var", "SUBCONSTIT-BINDING-VAR", 1, 0, false);
        declareFunction("subconstit_start", "SUBCONSTIT-START", 1, 0, false);
        declareFunction("subconstit_end", "SUBCONSTIT-END", 1, 0, false);
        declareFunction("subconstit_sem_test", "SUBCONSTIT-SEM-TEST", 1, 0, false);
        declareFunction("_csetf_subconstit_cat", "_CSETF-SUBCONSTIT-CAT", 2, 0, false);
        declareFunction("_csetf_subconstit_string", "_CSETF-SUBCONSTIT-STRING", 2, 0, false);
        declareFunction("_csetf_subconstit_binding_var", "_CSETF-SUBCONSTIT-BINDING-VAR", 2, 0, false);
        declareFunction("_csetf_subconstit_start", "_CSETF-SUBCONSTIT-START", 2, 0, false);
        declareFunction("_csetf_subconstit_end", "_CSETF-SUBCONSTIT-END", 2, 0, false);
        declareFunction("_csetf_subconstit_sem_test", "_CSETF-SUBCONSTIT-SEM-TEST", 2, 0, false);
        declareFunction("make_subconstit", "MAKE-SUBCONSTIT", 0, 1, false);
        declareFunction("print_subconstit", "PRINT-SUBCONSTIT", 3, 0, false);
        declareFunction("make_new_subconstit", "MAKE-NEW-SUBCONSTIT", 5, 1, false);
        declareFunction("convert_subconstit_to_parse_result", "CONVERT-SUBCONSTIT-TO-PARSE-RESULT", 1, 0, false);
        declareFunction("rtp_make_binding", "RTP-MAKE-BINDING", 2, 0, false);
        declareFunction("rtp_binding_var", "RTP-BINDING-VAR", 1, 0, false);
        declareFunction("rtp_binding_vals", "RTP-BINDING-VALS", 1, 0, false);
        declareFunction("rtp_binding_p", "RTP-BINDING-P", 1, 0, false);
        declareFunction("template_item_wu", "TEMPLATE-ITEM-WU", 1, 0, false);
        declareFunction("template_item_pos", "TEMPLATE-ITEM-POS", 1, 0, false);
        declareFunction("reset_all_rtp_datastructure_caches", "RESET-ALL-RTP-DATASTRUCTURE-CACHES", 0, 0, false);
        return NIL;
    }

    public static SubLObject declare_rtp_datastructures_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("add_template_meta_marker", "ADD-TEMPLATE-META-MARKER", 2, 0, false);
            declareFunction("map_template_meta_marker", "MAP-TEMPLATE-META-MARKER", 1, 0, false);
            declareFunction("interpret_template_meta_marker_assertion", "INTERPRET-TEMPLATE-META-MARKER-ASSERTION", 1, 0, false);
            declareFunction("populate_meta_markers_from_mt", "POPULATE-META-MARKERS-FROM-MT", 1, 1, false);
            declareFunction("transform_meta_markers_in_template_expression", "TRANSFORM-META-MARKERS-IN-TEMPLATE-EXPRESSION", 1, 0, false);
            declareFunction("map_template_category_fill_words", "MAP-TEMPLATE-CATEGORY-FILL-WORDS", 1, 0, false);
            declareFunction("add_template_category_fill_word", "ADD-TEMPLATE-CATEGORY-FILL-WORD", 2, 0, false);
            declareFunction("interpret_template_category_fill_word_assertion", "INTERPRET-TEMPLATE-CATEGORY-FILL-WORD-ASSERTION", 1, 0, false);
            declareFunction("populate_template_category_fill_words_from_mt", "POPULATE-TEMPLATE-CATEGORY-FILL-WORDS-FROM-MT", 1, 1, false);
            declareFunction("clear_make_optional_word_list", "CLEAR-MAKE-OPTIONAL-WORD-LIST", 0, 0, false);
            declareFunction("remove_make_optional_word_list", "REMOVE-MAKE-OPTIONAL-WORD-LIST", 1, 0, false);
            declareFunction("make_optional_word_list_internal", "MAKE-OPTIONAL-WORD-LIST-INTERNAL", 1, 0, false);
            declareFunction("make_optional_word_list", "MAKE-OPTIONAL-WORD-LIST", 1, 0, false);
            declareFunction("add_category_fill_words_to_template", "ADD-CATEGORY-FILL-WORDS-TO-TEMPLATE", 2, 0, false);
            declareFunction("template_rule_print_function_trampoline", "TEMPLATE-RULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("template_rule_p", "TEMPLATE-RULE-P", 1, 0, false);
            new rtp_datastructures.$template_rule_p$UnaryFunction();
            declareFunction("template_rule_category", "TEMPLATE-RULE-CATEGORY", 1, 0, false);
            declareFunction("template_rule_template", "TEMPLATE-RULE-TEMPLATE", 1, 0, false);
            declareFunction("template_rule_transformation", "TEMPLATE-RULE-TRANSFORMATION", 1, 0, false);
            declareFunction("template_rule_sem_test", "TEMPLATE-RULE-SEM-TEST", 1, 0, false);
            declareFunction("template_rule_assertion", "TEMPLATE-RULE-ASSERTION", 1, 0, false);
            declareFunction("template_rule_terminals", "TEMPLATE-RULE-TERMINALS", 1, 0, false);
            declareFunction("template_rule_meaning", "TEMPLATE-RULE-MEANING", 1, 0, false);
            declareFunction("template_rule_constraints", "TEMPLATE-RULE-CONSTRAINTS", 1, 0, false);
            declareFunction("template_rule_id", "TEMPLATE-RULE-ID", 1, 0, false);
            declareFunction("_csetf_template_rule_category", "_CSETF-TEMPLATE-RULE-CATEGORY", 2, 0, false);
            declareFunction("_csetf_template_rule_template", "_CSETF-TEMPLATE-RULE-TEMPLATE", 2, 0, false);
            declareFunction("_csetf_template_rule_transformation", "_CSETF-TEMPLATE-RULE-TRANSFORMATION", 2, 0, false);
            declareFunction("_csetf_template_rule_sem_test", "_CSETF-TEMPLATE-RULE-SEM-TEST", 2, 0, false);
            declareFunction("_csetf_template_rule_assertion", "_CSETF-TEMPLATE-RULE-ASSERTION", 2, 0, false);
            declareFunction("_csetf_template_rule_terminals", "_CSETF-TEMPLATE-RULE-TERMINALS", 2, 0, false);
            declareFunction("_csetf_template_rule_meaning", "_CSETF-TEMPLATE-RULE-MEANING", 2, 0, false);
            declareFunction("_csetf_template_rule_constraints", "_CSETF-TEMPLATE-RULE-CONSTRAINTS", 2, 0, false);
            declareFunction("_csetf_template_rule_id", "_CSETF-TEMPLATE-RULE-ID", 2, 0, false);
            declareFunction("make_template_rule", "MAKE-TEMPLATE-RULE", 0, 1, false);
            declareFunction("visit_defstruct_template_rule", "VISIT-DEFSTRUCT-TEMPLATE-RULE", 2, 0, false);
            declareFunction("visit_defstruct_object_template_rule_method", "VISIT-DEFSTRUCT-OBJECT-TEMPLATE-RULE-METHOD", 2, 0, false);
            declareFunction("rtp_chart_entry_sem_test", "RTP-CHART-ENTRY-SEM-TEST", 1, 0, false);
            declareFunction("rtp_chart_entry_sem_testP", "RTP-CHART-ENTRY-SEM-TEST?", 1, 0, false);
            declareFunction("sxhash_template_rule_method", "SXHASH-TEMPLATE-RULE-METHOD", 1, 0, false);
            new rtp_datastructures.$sxhash_template_rule_method$UnaryFunction();
            declareFunction("print_template_rule", "PRINT-TEMPLATE-RULE", 3, 0, false);
            declareFunction("new_template_rule", "NEW-TEMPLATE-RULE", 3, 3, false);
            declareFunction("cfasl_output_object_template_rule_method", "CFASL-OUTPUT-OBJECT-TEMPLATE-RULE-METHOD", 2, 0, false);
            declareFunction("cfasl_output_template_rule", "CFASL-OUTPUT-TEMPLATE-RULE", 2, 0, false);
            declareFunction("cfasl_input_template_rule", "CFASL-INPUT-TEMPLATE-RULE", 1, 0, false);
            new rtp_datastructures.$cfasl_input_template_rule$UnaryFunction();
            declareFunction("template_span_item_print_function_trampoline", "TEMPLATE-SPAN-ITEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("template_span_item_p", "TEMPLATE-SPAN-ITEM-P", 1, 0, false);
            new rtp_datastructures.$template_span_item_p$UnaryFunction();
            declareFunction("template_span_item_template_item", "TEMPLATE-SPAN-ITEM-TEMPLATE-ITEM", 1, 0, false);
            declareFunction("template_span_item_start", "TEMPLATE-SPAN-ITEM-START", 1, 0, false);
            declareFunction("template_span_item_end", "TEMPLATE-SPAN-ITEM-END", 1, 0, false);
            declareFunction("_csetf_template_span_item_template_item", "_CSETF-TEMPLATE-SPAN-ITEM-TEMPLATE-ITEM", 2, 0, false);
            declareFunction("_csetf_template_span_item_start", "_CSETF-TEMPLATE-SPAN-ITEM-START", 2, 0, false);
            declareFunction("_csetf_template_span_item_end", "_CSETF-TEMPLATE-SPAN-ITEM-END", 2, 0, false);
            declareFunction("make_template_span_item", "MAKE-TEMPLATE-SPAN-ITEM", 0, 1, false);
            declareFunction("visit_defstruct_template_span_item", "VISIT-DEFSTRUCT-TEMPLATE-SPAN-ITEM", 2, 0, false);
            declareFunction("visit_defstruct_object_template_span_item_method", "VISIT-DEFSTRUCT-OBJECT-TEMPLATE-SPAN-ITEM-METHOD", 2, 0, false);
            declareFunction("new_template_span_item", "NEW-TEMPLATE-SPAN-ITEM", 3, 0, false);
            declareFunction("print_template_span_item", "PRINT-TEMPLATE-SPAN-ITEM", 3, 0, false);
            declareFunction("extract_constraints_from_template", "EXTRACT-CONSTRAINTS-FROM-TEMPLATE", 1, 0, false);
            declareFunction("optimize_template_constraints", "OPTIMIZE-TEMPLATE-CONSTRAINTS", 1, 0, false);
            declareFunction("ensure_flattened_constraint", "ENSURE-FLATTENED-CONSTRAINT", 1, 0, false);
            declareFunction("compile_template_expression", "COMPILE-TEMPLATE-EXPRESSION", 2, 0, false);
            declareFunction("expand_word_items", "EXPAND-WORD-ITEMS", 1, 0, false);
            declareFunction("expand_word_sequences", "EXPAND-WORD-SEQUENCES", 1, 0, false);
            declareFunction("possibly_expand_string_item", "POSSIBLY-EXPAND-STRING-ITEM", 1, 0, false);
            declareFunction("possibly_expand_word_sequence_item", "POSSIBLY-EXPAND-WORD-SEQUENCE-ITEM", 1, 0, false);
            declareFunction("ensure_non_recursive_template", "ENSURE-NON-RECURSIVE-TEMPLATE", 2, 0, false);
            declareFunction("clear_denotations_of_constant", "CLEAR-DENOTATIONS-OF-CONSTANT", 0, 0, false);
            declareFunction("remove_denotations_of_constant", "REMOVE-DENOTATIONS-OF-CONSTANT", 1, 1, false);
            declareFunction("denotations_of_constant_internal", "DENOTATIONS-OF-CONSTANT-INTERNAL", 2, 0, false);
            declareFunction("denotations_of_constant", "DENOTATIONS-OF-CONSTANT", 1, 1, false);
            declareFunction("rtp_preds_from_term_phrases_constraint", "RTP-PREDS-FROM-TERM-PHRASES-CONSTRAINT", 1, 0, false);
            declareFunction("clear_all_phrases_filter_from_term_phrases_constraint", "CLEAR-ALL-PHRASES-FILTER-FROM-TERM-PHRASES-CONSTRAINT", 0, 0, false);
            declareFunction("remove_all_phrases_filter_from_term_phrases_constraint", "REMOVE-ALL-PHRASES-FILTER-FROM-TERM-PHRASES-CONSTRAINT", 1, 0, false);
            declareFunction("all_phrases_filter_from_term_phrases_constraint_internal", "ALL-PHRASES-FILTER-FROM-TERM-PHRASES-CONSTRAINT-INTERNAL", 1, 0, false);
            declareFunction("all_phrases_filter_from_term_phrases_constraint", "ALL-PHRASES-FILTER-FROM-TERM-PHRASES-CONSTRAINT", 1, 0, false);
            declareFunction("replace_constants_with_denotations", "REPLACE-CONSTANTS-WITH-DENOTATIONS", 1, 0, false);
            declareFunction("transform_cyc_term_item", "TRANSFORM-CYC-TERM-ITEM", 1, 0, false);
            declareFunction("optimize_template_expression", "OPTIMIZE-TEMPLATE-EXPRESSION", 1, 0, false);
            declareFunction("extract_terminals_from_template", "EXTRACT-TERMINALS-FROM-TEMPLATE", 1, 0, false);
            declareFunction("check_for_terminals_in_subtemplate", "CHECK-FOR-TERMINALS-IN-SUBTEMPLATE", 2, 0, false);
            declareFunction("compute_strings_of_type", "COMPUTE-STRINGS-OF-TYPE", 1, 0, false);
            declareFunction("possible_contractions_for_subtemplate", "POSSIBLE-CONTRACTIONS-FOR-SUBTEMPLATE", 1, 0, false);
            declareFunction("maybe_initialize_rtp_contractions_table", "MAYBE-INITIALIZE-RTP-CONTRACTIONS-TABLE", 0, 1, false);
            declareFunction("template_rule_constraints_matchP", "TEMPLATE-RULE-CONSTRAINTS-MATCH?", 2, 0, false);
            declareFunction("verify_words_meet_constraints", "VERIFY-WORDS-MEET-CONSTRAINTS", 2, 0, false);
            declareFunction("rtp_member", "RTP-MEMBER", 2, 1, false);
            declareFunction("match_some_of", "MATCH-SOME-OF", 3, 0, false);
            declareFunction("match_sequence", "MATCH-SEQUENCE", 2, 1, false);
            declareFunction("remove_an_internal_group", "REMOVE-AN-INTERNAL-GROUP", 2, 0, false);
            declareFunction("rtp_clear_rules", "RTP-CLEAR-RULES", 0, 0, false);
            declareFunction("allocate_rtp_rules", "ALLOCATE-RTP-RULES", 0, 0, false);
            declareFunction("ensure_rtp_rules", "ENSURE-RTP-RULES", 0, 0, false);
            declareFunction("add_rtp_rule", "ADD-RTP-RULE", 1, 0, false);
            declareFunction("rtp_rule_existsP", "RTP-RULE-EXISTS?", 1, 0, false);
            declareFunction("remove_rtp_rule", "REMOVE-RTP-RULE", 1, 0, false);
            declareFunction("find_rtp_rules_by_assertion", "FIND-RTP-RULES-BY-ASSERTION", 1, 0, false);
            declareFunction("rtp_rules_cache_unbuiltP", "RTP-RULES-CACHE-UNBUILT?", 0, 0, false);
            declareFunction("dump_rtp_rules_cache_to_stream", "DUMP-RTP-RULES-CACHE-TO-STREAM", 1, 0, false);
            declareFunction("load_rtp_rules_cache_from_stream", "LOAD-RTP-RULES-CACHE-FROM-STREAM", 1, 0, false);
            declareFunction("rtp_rule", "RTP-RULE", 3, 0, false);
            declareFunction("make_rtp_rule", "MAKE-RTP-RULE", 3, 0, false);
            declareFunction("rule_cat", "RULE-CAT", 1, 0, false);
            declareFunction("rule_template", "RULE-TEMPLATE", 1, 0, false);
            declareFunction("rule_sem", "RULE-SEM", 1, 0, false);
            declareFunction("clear_template_rules_master_index", "CLEAR-TEMPLATE-RULES-MASTER-INDEX", 0, 0, false);
            declareFunction("allocate_template_rules_master_index", "ALLOCATE-TEMPLATE-RULES-MASTER-INDEX", 0, 0, false);
            declareFunction("ensure_template_rules_master_index", "ENSURE-TEMPLATE-RULES-MASTER-INDEX", 0, 0, false);
            declareFunction("enumerate_all_template_categories", "ENUMERATE-ALL-TEMPLATE-CATEGORIES", 0, 0, false);
            declareFunction("categorized_template_rule_set_print_function_trampoline", "CATEGORIZED-TEMPLATE-RULE-SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("categorized_template_rule_set_p", "CATEGORIZED-TEMPLATE-RULE-SET-P", 1, 0, false);
            new rtp_datastructures.$categorized_template_rule_set_p$UnaryFunction();
            declareFunction("categorized_template_rule_set_mentions", "CATEGORIZED-TEMPLATE-RULE-SET-MENTIONS", 1, 0, false);
            declareFunction("categorized_template_rule_set_generic", "CATEGORIZED-TEMPLATE-RULE-SET-GENERIC", 1, 0, false);
            declareFunction("categorized_template_rule_set_key_terminal", "CATEGORIZED-TEMPLATE-RULE-SET-KEY-TERMINAL", 1, 0, false);
            declareFunction("_csetf_categorized_template_rule_set_mentions", "_CSETF-CATEGORIZED-TEMPLATE-RULE-SET-MENTIONS", 2, 0, false);
            declareFunction("_csetf_categorized_template_rule_set_generic", "_CSETF-CATEGORIZED-TEMPLATE-RULE-SET-GENERIC", 2, 0, false);
            declareFunction("_csetf_categorized_template_rule_set_key_terminal", "_CSETF-CATEGORIZED-TEMPLATE-RULE-SET-KEY-TERMINAL", 2, 0, false);
            declareFunction("make_categorized_template_rule_set", "MAKE-CATEGORIZED-TEMPLATE-RULE-SET", 0, 1, false);
            declareFunction("visit_defstruct_categorized_template_rule_set", "VISIT-DEFSTRUCT-CATEGORIZED-TEMPLATE-RULE-SET", 2, 0, false);
            declareFunction("visit_defstruct_object_categorized_template_rule_set_method", "VISIT-DEFSTRUCT-OBJECT-CATEGORIZED-TEMPLATE-RULE-SET-METHOD", 2, 0, false);
            declareFunction("new_categorized_template_rule_set", "NEW-CATEGORIZED-TEMPLATE-RULE-SET", 0, 1, false);
            declareFunction("update_rule_set_mentions", "UPDATE-RULE-SET-MENTIONS", 3, 0, false);
            declareFunction("eliminate_rule_set_mentions", "ELIMINATE-RULE-SET-MENTIONS", 3, 0, false);
            declareFunction("compute_rule_set_mentions_specificity", "COMPUTE-RULE-SET-MENTIONS-SPECIFICITY", 2, 0, false);
            declareFunction("update_rule_set_key_terminal", "UPDATE-RULE-SET-KEY-TERMINAL", 3, 0, false);
            declareFunction("eliminate_rule_set_key_terminal", "ELIMINATE-RULE-SET-KEY-TERMINAL", 3, 0, false);
            declareFunction("update_rule_set_generic", "UPDATE-RULE-SET-GENERIC", 2, 0, false);
            declareFunction("eliminate_rule_set_generic", "ELIMINATE-RULE-SET-GENERIC", 2, 0, false);
            declareFunction("get_categorized_template_rule_set", "GET-CATEGORIZED-TEMPLATE-RULE-SET", 2, 0, false);
            declareFunction("add_categorized_template_rule_set", "ADD-CATEGORIZED-TEMPLATE-RULE-SET", 2, 0, false);
            declareFunction("find_or_add_categorized_template_rule_set", "FIND-OR-ADD-CATEGORIZED-TEMPLATE-RULE-SET", 2, 0, false);
            declareFunction("extend_categorized_template_rule_set", "EXTEND-CATEGORIZED-TEMPLATE-RULE-SET", 2, 0, false);
            declareFunction("reduce_categorized_template_rule_set", "REDUCE-CATEGORIZED-TEMPLATE-RULE-SET", 2, 0, false);
            declareFunction("reconsider_rule_set_key_terminal", "RECONSIDER-RULE-SET-KEY-TERMINAL", 3, 0, false);
            declareFunction("recompute_rule_set_key_terminal", "RECOMPUTE-RULE-SET-KEY-TERMINAL", 2, 0, false);
            declareFunction("find_most_specific_terminal_in_rule_set", "FIND-MOST-SPECIFIC-TERMINAL-IN-RULE-SET", 2, 0, false);
            declareFunction("find_most_specific_terminals_in_rule_set", "FIND-MOST-SPECIFIC-TERMINALS-IN-RULE-SET", 2, 0, false);
            declareMacro("do_templates_for_terminal", "DO-TEMPLATES-FOR-TERMINAL");
            declareMacro("with_clean_rtp_associative_memory", "WITH-CLEAN-RTP-ASSOCIATIVE-MEMORY");
            declareFunction("template_in_associative_memoryP", "TEMPLATE-IN-ASSOCIATIVE-MEMORY?", 4, 0, false);
            declareFunction("clear_relevant_template_mts", "CLEAR-RELEVANT-TEMPLATE-MTS", 0, 0, false);
            declareFunction("remove_relevant_template_mts", "REMOVE-RELEVANT-TEMPLATE-MTS", 1, 0, false);
            declareFunction("relevant_template_mts_internal", "RELEVANT-TEMPLATE-MTS-INTERNAL", 1, 0, false);
            declareFunction("relevant_template_mts", "RELEVANT-TEMPLATE-MTS", 1, 0, false);
            declareFunction("clear_template_mts", "CLEAR-TEMPLATE-MTS", 0, 0, false);
            declareFunction("template_mts", "TEMPLATE-MTS", 0, 0, false);
            declareFunction("get_templates_for_terminal", "GET-TEMPLATES-FOR-TERMINAL", 3, 0, false);
            declareFunction("get_best_templates_for_terminal", "GET-BEST-TEMPLATES-FOR-TERMINAL", 3, 0, false);
            declareFunction("get_generic_templates_for_category", "GET-GENERIC-TEMPLATES-FOR-CATEGORY", 2, 0, false);
            declareFunction("enumerate_all_terminals", "ENUMERATE-ALL-TERMINALS", 1, 0, false);
            declareFunction("enumerate_all_best_terminals", "ENUMERATE-ALL-BEST-TERMINALS", 1, 0, false);
            declareFunction("populate_rtp_from_mt", "POPULATE-RTP-FROM-MT", 1, 1, false);
            declareFunction("repopulate_rtp_from_mt", "REPOPULATE-RTP-FROM-MT", 1, 1, false);
            declareFunction("extend_rtp_from_mt", "EXTEND-RTP-FROM-MT", 2, 0, false);
            declareFunction("extend_rtp_from_just_mt_for_tp_type", "EXTEND-RTP-FROM-JUST-MT-FOR-TP-TYPE", 3, 0, false);
            declareFunction("template_count_for_pred_and_categories", "TEMPLATE-COUNT-FOR-PRED-AND-CATEGORIES", 2, 1, false);
            declareFunction("extend_rtp_with_template_assertion", "EXTEND-RTP-WITH-TEMPLATE-ASSERTION", 1, 0, false);
            declareFunction("strip_wrapper_functions_from", "STRIP-WRAPPER-FUNCTIONS-FROM", 1, 0, false);
            declareFunction("reduce_rtp_by_template_assertion", "REDUCE-RTP-BY-TEMPLATE-ASSERTION", 1, 0, false);
            declareFunction("add_template_assertion", "ADD-TEMPLATE-ASSERTION", 2, 0, false);
            declareFunction("remove_template_assertion", "REMOVE-TEMPLATE-ASSERTION", 2, 0, false);
            declareFunction("cached_template_assertion_p", "CACHED-TEMPLATE-ASSERTION-P", 2, 0, false);
            declareFunction("rtp_chart_entry_print_function_trampoline", "RTP-CHART-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("rtp_chart_entry_p", "RTP-CHART-ENTRY-P", 1, 0, false);
            new rtp_datastructures.$rtp_chart_entry_p$UnaryFunction();
            declareFunction("rtp_chart_entry_start", "RTP-CHART-ENTRY-START", 1, 0, false);
            declareFunction("rtp_chart_entry_end", "RTP-CHART-ENTRY-END", 1, 0, false);
            declareFunction("rtp_chart_entry_rule", "RTP-CHART-ENTRY-RULE", 1, 0, false);
            declareFunction("rtp_chart_entry_template_index", "RTP-CHART-ENTRY-TEMPLATE-INDEX", 1, 0, false);
            declareFunction("rtp_chart_entry_words", "RTP-CHART-ENTRY-WORDS", 1, 0, false);
            declareFunction("rtp_chart_entry_bindings", "RTP-CHART-ENTRY-BINDINGS", 1, 0, false);
            declareFunction("rtp_chart_entry_subconstits", "RTP-CHART-ENTRY-SUBCONSTITS", 1, 0, false);
            declareFunction("rtp_chart_entry_sem", "RTP-CHART-ENTRY-SEM", 1, 0, false);
            declareFunction("_csetf_rtp_chart_entry_start", "_CSETF-RTP-CHART-ENTRY-START", 2, 0, false);
            declareFunction("_csetf_rtp_chart_entry_end", "_CSETF-RTP-CHART-ENTRY-END", 2, 0, false);
            declareFunction("_csetf_rtp_chart_entry_rule", "_CSETF-RTP-CHART-ENTRY-RULE", 2, 0, false);
            declareFunction("_csetf_rtp_chart_entry_template_index", "_CSETF-RTP-CHART-ENTRY-TEMPLATE-INDEX", 2, 0, false);
            declareFunction("_csetf_rtp_chart_entry_words", "_CSETF-RTP-CHART-ENTRY-WORDS", 2, 0, false);
            declareFunction("_csetf_rtp_chart_entry_bindings", "_CSETF-RTP-CHART-ENTRY-BINDINGS", 2, 0, false);
            declareFunction("_csetf_rtp_chart_entry_subconstits", "_CSETF-RTP-CHART-ENTRY-SUBCONSTITS", 2, 0, false);
            declareFunction("_csetf_rtp_chart_entry_sem", "_CSETF-RTP-CHART-ENTRY-SEM", 2, 0, false);
            declareFunction("make_rtp_chart_entry", "MAKE-RTP-CHART-ENTRY", 0, 1, false);
            declareFunction("visit_defstruct_rtp_chart_entry", "VISIT-DEFSTRUCT-RTP-CHART-ENTRY", 2, 0, false);
            declareFunction("visit_defstruct_object_rtp_chart_entry_method", "VISIT-DEFSTRUCT-OBJECT-RTP-CHART-ENTRY-METHOD", 2, 0, false);
            declareFunction("rtp_entry_print", "RTP-ENTRY-PRINT", 3, 0, false);
            declareFunction("copy_rtp_entry", "COPY-RTP-ENTRY", 1, 0, false);
            declareFunction("make_new_rtp_entry", "MAKE-NEW-RTP-ENTRY", 3, 2, false);
            declareFunction("set_rtp_entry_remaining_template", "SET-RTP-ENTRY-REMAINING-TEMPLATE", 2, 0, false);
            declareFunction("convert_rtp_entry_to_parse_result", "CONVERT-RTP-ENTRY-TO-PARSE-RESULT", 1, 0, false);
            declareFunction("rtp_sem_testP", "RTP-SEM-TEST?", 1, 0, false);
            declareFunction("rtp_sem_test_var", "RTP-SEM-TEST-VAR", 1, 0, false);
            declareFunction("rtp_sem_test_constraint", "RTP-SEM-TEST-CONSTRAINT", 1, 0, false);
            declareFunction("subconstit_print_function_trampoline", "SUBCONSTIT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("subconstit_p", "SUBCONSTIT-P", 1, 0, false);
            new rtp_datastructures.$subconstit_p$UnaryFunction();
            declareFunction("subconstit_cat", "SUBCONSTIT-CAT", 1, 0, false);
            declareFunction("subconstit_string", "SUBCONSTIT-STRING", 1, 0, false);
            declareFunction("subconstit_binding_var", "SUBCONSTIT-BINDING-VAR", 1, 0, false);
            declareFunction("subconstit_start", "SUBCONSTIT-START", 1, 0, false);
            declareFunction("subconstit_end", "SUBCONSTIT-END", 1, 0, false);
            declareFunction("subconstit_sem_test", "SUBCONSTIT-SEM-TEST", 1, 0, false);
            declareFunction("_csetf_subconstit_cat", "_CSETF-SUBCONSTIT-CAT", 2, 0, false);
            declareFunction("_csetf_subconstit_string", "_CSETF-SUBCONSTIT-STRING", 2, 0, false);
            declareFunction("_csetf_subconstit_binding_var", "_CSETF-SUBCONSTIT-BINDING-VAR", 2, 0, false);
            declareFunction("_csetf_subconstit_start", "_CSETF-SUBCONSTIT-START", 2, 0, false);
            declareFunction("_csetf_subconstit_end", "_CSETF-SUBCONSTIT-END", 2, 0, false);
            declareFunction("_csetf_subconstit_sem_test", "_CSETF-SUBCONSTIT-SEM-TEST", 2, 0, false);
            declareFunction("make_subconstit", "MAKE-SUBCONSTIT", 0, 1, false);
            declareFunction("visit_defstruct_subconstit", "VISIT-DEFSTRUCT-SUBCONSTIT", 2, 0, false);
            declareFunction("visit_defstruct_object_subconstit_method", "VISIT-DEFSTRUCT-OBJECT-SUBCONSTIT-METHOD", 2, 0, false);
            declareFunction("print_subconstit", "PRINT-SUBCONSTIT", 3, 0, false);
            declareFunction("make_new_subconstit", "MAKE-NEW-SUBCONSTIT", 5, 1, false);
            declareFunction("convert_subconstit_to_parse_result", "CONVERT-SUBCONSTIT-TO-PARSE-RESULT", 1, 0, false);
            declareFunction("rtp_make_binding", "RTP-MAKE-BINDING", 2, 0, false);
            declareFunction("rtp_binding_var", "RTP-BINDING-VAR", 1, 0, false);
            declareFunction("rtp_binding_vals", "RTP-BINDING-VALS", 1, 0, false);
            declareFunction("rtp_binding_p", "RTP-BINDING-P", 1, 0, false);
            declareFunction("template_item_wu", "TEMPLATE-ITEM-WU", 1, 0, false);
            declareFunction("template_item_pos", "TEMPLATE-ITEM-POS", 1, 0, false);
            declareFunction("reset_all_rtp_datastructure_caches", "RESET-ALL-RTP-DATASTRUCTURE-CACHES", 0, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("assertion_arg", "ASSERTION-ARG", 2, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_rtp_datastructures_file_Previous() {
        declareFunction("add_template_meta_marker", "ADD-TEMPLATE-META-MARKER", 2, 0, false);
        declareFunction("map_template_meta_marker", "MAP-TEMPLATE-META-MARKER", 1, 0, false);
        declareFunction("interpret_template_meta_marker_assertion", "INTERPRET-TEMPLATE-META-MARKER-ASSERTION", 1, 0, false);
        declareFunction("populate_meta_markers_from_mt", "POPULATE-META-MARKERS-FROM-MT", 1, 1, false);
        declareFunction("transform_meta_markers_in_template_expression", "TRANSFORM-META-MARKERS-IN-TEMPLATE-EXPRESSION", 1, 0, false);
        declareFunction("map_template_category_fill_words", "MAP-TEMPLATE-CATEGORY-FILL-WORDS", 1, 0, false);
        declareFunction("add_template_category_fill_word", "ADD-TEMPLATE-CATEGORY-FILL-WORD", 2, 0, false);
        declareFunction("interpret_template_category_fill_word_assertion", "INTERPRET-TEMPLATE-CATEGORY-FILL-WORD-ASSERTION", 1, 0, false);
        declareFunction("populate_template_category_fill_words_from_mt", "POPULATE-TEMPLATE-CATEGORY-FILL-WORDS-FROM-MT", 1, 1, false);
        declareFunction("clear_make_optional_word_list", "CLEAR-MAKE-OPTIONAL-WORD-LIST", 0, 0, false);
        declareFunction("remove_make_optional_word_list", "REMOVE-MAKE-OPTIONAL-WORD-LIST", 1, 0, false);
        declareFunction("make_optional_word_list_internal", "MAKE-OPTIONAL-WORD-LIST-INTERNAL", 1, 0, false);
        declareFunction("make_optional_word_list", "MAKE-OPTIONAL-WORD-LIST", 1, 0, false);
        declareFunction("add_category_fill_words_to_template", "ADD-CATEGORY-FILL-WORDS-TO-TEMPLATE", 2, 0, false);
        declareFunction("template_rule_print_function_trampoline", "TEMPLATE-RULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("template_rule_p", "TEMPLATE-RULE-P", 1, 0, false);
        new rtp_datastructures.$template_rule_p$UnaryFunction();
        declareFunction("template_rule_category", "TEMPLATE-RULE-CATEGORY", 1, 0, false);
        declareFunction("template_rule_template", "TEMPLATE-RULE-TEMPLATE", 1, 0, false);
        declareFunction("template_rule_transformation", "TEMPLATE-RULE-TRANSFORMATION", 1, 0, false);
        declareFunction("template_rule_sem_test", "TEMPLATE-RULE-SEM-TEST", 1, 0, false);
        declareFunction("template_rule_assertion", "TEMPLATE-RULE-ASSERTION", 1, 0, false);
        declareFunction("template_rule_terminals", "TEMPLATE-RULE-TERMINALS", 1, 0, false);
        declareFunction("template_rule_meaning", "TEMPLATE-RULE-MEANING", 1, 0, false);
        declareFunction("template_rule_constraints", "TEMPLATE-RULE-CONSTRAINTS", 1, 0, false);
        declareFunction("template_rule_id", "TEMPLATE-RULE-ID", 1, 0, false);
        declareFunction("_csetf_template_rule_category", "_CSETF-TEMPLATE-RULE-CATEGORY", 2, 0, false);
        declareFunction("_csetf_template_rule_template", "_CSETF-TEMPLATE-RULE-TEMPLATE", 2, 0, false);
        declareFunction("_csetf_template_rule_transformation", "_CSETF-TEMPLATE-RULE-TRANSFORMATION", 2, 0, false);
        declareFunction("_csetf_template_rule_sem_test", "_CSETF-TEMPLATE-RULE-SEM-TEST", 2, 0, false);
        declareFunction("_csetf_template_rule_assertion", "_CSETF-TEMPLATE-RULE-ASSERTION", 2, 0, false);
        declareFunction("_csetf_template_rule_terminals", "_CSETF-TEMPLATE-RULE-TERMINALS", 2, 0, false);
        declareFunction("_csetf_template_rule_meaning", "_CSETF-TEMPLATE-RULE-MEANING", 2, 0, false);
        declareFunction("_csetf_template_rule_constraints", "_CSETF-TEMPLATE-RULE-CONSTRAINTS", 2, 0, false);
        declareFunction("_csetf_template_rule_id", "_CSETF-TEMPLATE-RULE-ID", 2, 0, false);
        declareFunction("make_template_rule", "MAKE-TEMPLATE-RULE", 0, 1, false);
        declareFunction("visit_defstruct_template_rule", "VISIT-DEFSTRUCT-TEMPLATE-RULE", 2, 0, false);
        declareFunction("visit_defstruct_object_template_rule_method", "VISIT-DEFSTRUCT-OBJECT-TEMPLATE-RULE-METHOD", 2, 0, false);
        declareFunction("rtp_chart_entry_sem_test", "RTP-CHART-ENTRY-SEM-TEST", 1, 0, false);
        declareFunction("rtp_chart_entry_sem_testP", "RTP-CHART-ENTRY-SEM-TEST?", 1, 0, false);
        declareFunction("sxhash_template_rule_method", "SXHASH-TEMPLATE-RULE-METHOD", 1, 0, false);
        new rtp_datastructures.$sxhash_template_rule_method$UnaryFunction();
        declareFunction("print_template_rule", "PRINT-TEMPLATE-RULE", 3, 0, false);
        declareFunction("new_template_rule", "NEW-TEMPLATE-RULE", 3, 3, false);
        declareFunction("cfasl_output_object_template_rule_method", "CFASL-OUTPUT-OBJECT-TEMPLATE-RULE-METHOD", 2, 0, false);
        declareFunction("cfasl_output_template_rule", "CFASL-OUTPUT-TEMPLATE-RULE", 2, 0, false);
        declareFunction("cfasl_input_template_rule", "CFASL-INPUT-TEMPLATE-RULE", 1, 0, false);
        new rtp_datastructures.$cfasl_input_template_rule$UnaryFunction();
        declareFunction("template_span_item_print_function_trampoline", "TEMPLATE-SPAN-ITEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("template_span_item_p", "TEMPLATE-SPAN-ITEM-P", 1, 0, false);
        new rtp_datastructures.$template_span_item_p$UnaryFunction();
        declareFunction("template_span_item_template_item", "TEMPLATE-SPAN-ITEM-TEMPLATE-ITEM", 1, 0, false);
        declareFunction("template_span_item_start", "TEMPLATE-SPAN-ITEM-START", 1, 0, false);
        declareFunction("template_span_item_end", "TEMPLATE-SPAN-ITEM-END", 1, 0, false);
        declareFunction("_csetf_template_span_item_template_item", "_CSETF-TEMPLATE-SPAN-ITEM-TEMPLATE-ITEM", 2, 0, false);
        declareFunction("_csetf_template_span_item_start", "_CSETF-TEMPLATE-SPAN-ITEM-START", 2, 0, false);
        declareFunction("_csetf_template_span_item_end", "_CSETF-TEMPLATE-SPAN-ITEM-END", 2, 0, false);
        declareFunction("make_template_span_item", "MAKE-TEMPLATE-SPAN-ITEM", 0, 1, false);
        declareFunction("visit_defstruct_template_span_item", "VISIT-DEFSTRUCT-TEMPLATE-SPAN-ITEM", 2, 0, false);
        declareFunction("visit_defstruct_object_template_span_item_method", "VISIT-DEFSTRUCT-OBJECT-TEMPLATE-SPAN-ITEM-METHOD", 2, 0, false);
        declareFunction("new_template_span_item", "NEW-TEMPLATE-SPAN-ITEM", 3, 0, false);
        declareFunction("print_template_span_item", "PRINT-TEMPLATE-SPAN-ITEM", 3, 0, false);
        declareFunction("extract_constraints_from_template", "EXTRACT-CONSTRAINTS-FROM-TEMPLATE", 1, 0, false);
        declareFunction("optimize_template_constraints", "OPTIMIZE-TEMPLATE-CONSTRAINTS", 1, 0, false);
        declareFunction("ensure_flattened_constraint", "ENSURE-FLATTENED-CONSTRAINT", 1, 0, false);
        declareFunction("compile_template_expression", "COMPILE-TEMPLATE-EXPRESSION", 2, 0, false);
        declareFunction("expand_word_items", "EXPAND-WORD-ITEMS", 1, 0, false);
        declareFunction("expand_word_sequences", "EXPAND-WORD-SEQUENCES", 1, 0, false);
        declareFunction("possibly_expand_string_item", "POSSIBLY-EXPAND-STRING-ITEM", 1, 0, false);
        declareFunction("possibly_expand_word_sequence_item", "POSSIBLY-EXPAND-WORD-SEQUENCE-ITEM", 1, 0, false);
        declareFunction("ensure_non_recursive_template", "ENSURE-NON-RECURSIVE-TEMPLATE", 2, 0, false);
        declareFunction("clear_denotations_of_constant", "CLEAR-DENOTATIONS-OF-CONSTANT", 0, 0, false);
        declareFunction("remove_denotations_of_constant", "REMOVE-DENOTATIONS-OF-CONSTANT", 1, 1, false);
        declareFunction("denotations_of_constant_internal", "DENOTATIONS-OF-CONSTANT-INTERNAL", 2, 0, false);
        declareFunction("denotations_of_constant", "DENOTATIONS-OF-CONSTANT", 1, 1, false);
        declareFunction("rtp_preds_from_term_phrases_constraint", "RTP-PREDS-FROM-TERM-PHRASES-CONSTRAINT", 1, 0, false);
        declareFunction("clear_all_phrases_filter_from_term_phrases_constraint", "CLEAR-ALL-PHRASES-FILTER-FROM-TERM-PHRASES-CONSTRAINT", 0, 0, false);
        declareFunction("remove_all_phrases_filter_from_term_phrases_constraint", "REMOVE-ALL-PHRASES-FILTER-FROM-TERM-PHRASES-CONSTRAINT", 1, 0, false);
        declareFunction("all_phrases_filter_from_term_phrases_constraint_internal", "ALL-PHRASES-FILTER-FROM-TERM-PHRASES-CONSTRAINT-INTERNAL", 1, 0, false);
        declareFunction("all_phrases_filter_from_term_phrases_constraint", "ALL-PHRASES-FILTER-FROM-TERM-PHRASES-CONSTRAINT", 1, 0, false);
        declareFunction("replace_constants_with_denotations", "REPLACE-CONSTANTS-WITH-DENOTATIONS", 1, 0, false);
        declareFunction("transform_cyc_term_item", "TRANSFORM-CYC-TERM-ITEM", 1, 0, false);
        declareFunction("optimize_template_expression", "OPTIMIZE-TEMPLATE-EXPRESSION", 1, 0, false);
        declareFunction("extract_terminals_from_template", "EXTRACT-TERMINALS-FROM-TEMPLATE", 1, 0, false);
        declareFunction("check_for_terminals_in_subtemplate", "CHECK-FOR-TERMINALS-IN-SUBTEMPLATE", 2, 0, false);
        declareFunction("compute_strings_of_type", "COMPUTE-STRINGS-OF-TYPE", 1, 0, false);
        declareFunction("possible_contractions_for_subtemplate", "POSSIBLE-CONTRACTIONS-FOR-SUBTEMPLATE", 1, 0, false);
        declareFunction("maybe_initialize_rtp_contractions_table", "MAYBE-INITIALIZE-RTP-CONTRACTIONS-TABLE", 0, 1, false);
        declareFunction("template_rule_constraints_matchP", "TEMPLATE-RULE-CONSTRAINTS-MATCH?", 2, 0, false);
        declareFunction("verify_words_meet_constraints", "VERIFY-WORDS-MEET-CONSTRAINTS", 2, 0, false);
        declareFunction("rtp_member", "RTP-MEMBER", 2, 1, false);
        declareFunction("match_some_of", "MATCH-SOME-OF", 3, 0, false);
        declareFunction("match_sequence", "MATCH-SEQUENCE", 2, 1, false);
        declareFunction("remove_an_internal_group", "REMOVE-AN-INTERNAL-GROUP", 2, 0, false);
        declareFunction("rtp_clear_rules", "RTP-CLEAR-RULES", 0, 0, false);
        declareFunction("allocate_rtp_rules", "ALLOCATE-RTP-RULES", 0, 0, false);
        declareFunction("ensure_rtp_rules", "ENSURE-RTP-RULES", 0, 0, false);
        declareFunction("add_rtp_rule", "ADD-RTP-RULE", 1, 0, false);
        declareFunction("rtp_rule_existsP", "RTP-RULE-EXISTS?", 1, 0, false);
        declareFunction("remove_rtp_rule", "REMOVE-RTP-RULE", 1, 0, false);
        declareFunction("find_rtp_rules_by_assertion", "FIND-RTP-RULES-BY-ASSERTION", 1, 0, false);
        declareFunction("rtp_rules_cache_unbuiltP", "RTP-RULES-CACHE-UNBUILT?", 0, 0, false);
        declareFunction("dump_rtp_rules_cache_to_stream", "DUMP-RTP-RULES-CACHE-TO-STREAM", 1, 0, false);
        declareFunction("load_rtp_rules_cache_from_stream", "LOAD-RTP-RULES-CACHE-FROM-STREAM", 1, 0, false);
        declareFunction("rtp_rule", "RTP-RULE", 3, 0, false);
        declareFunction("make_rtp_rule", "MAKE-RTP-RULE", 3, 0, false);
        declareFunction("rule_cat", "RULE-CAT", 1, 0, false);
        declareFunction("rule_template", "RULE-TEMPLATE", 1, 0, false);
        declareFunction("rule_sem", "RULE-SEM", 1, 0, false);
        declareFunction("clear_template_rules_master_index", "CLEAR-TEMPLATE-RULES-MASTER-INDEX", 0, 0, false);
        declareFunction("allocate_template_rules_master_index", "ALLOCATE-TEMPLATE-RULES-MASTER-INDEX", 0, 0, false);
        declareFunction("ensure_template_rules_master_index", "ENSURE-TEMPLATE-RULES-MASTER-INDEX", 0, 0, false);
        declareFunction("enumerate_all_template_categories", "ENUMERATE-ALL-TEMPLATE-CATEGORIES", 0, 0, false);
        declareFunction("categorized_template_rule_set_print_function_trampoline", "CATEGORIZED-TEMPLATE-RULE-SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("categorized_template_rule_set_p", "CATEGORIZED-TEMPLATE-RULE-SET-P", 1, 0, false);
        new rtp_datastructures.$categorized_template_rule_set_p$UnaryFunction();
        declareFunction("categorized_template_rule_set_mentions", "CATEGORIZED-TEMPLATE-RULE-SET-MENTIONS", 1, 0, false);
        declareFunction("categorized_template_rule_set_generic", "CATEGORIZED-TEMPLATE-RULE-SET-GENERIC", 1, 0, false);
        declareFunction("categorized_template_rule_set_key_terminal", "CATEGORIZED-TEMPLATE-RULE-SET-KEY-TERMINAL", 1, 0, false);
        declareFunction("_csetf_categorized_template_rule_set_mentions", "_CSETF-CATEGORIZED-TEMPLATE-RULE-SET-MENTIONS", 2, 0, false);
        declareFunction("_csetf_categorized_template_rule_set_generic", "_CSETF-CATEGORIZED-TEMPLATE-RULE-SET-GENERIC", 2, 0, false);
        declareFunction("_csetf_categorized_template_rule_set_key_terminal", "_CSETF-CATEGORIZED-TEMPLATE-RULE-SET-KEY-TERMINAL", 2, 0, false);
        declareFunction("make_categorized_template_rule_set", "MAKE-CATEGORIZED-TEMPLATE-RULE-SET", 0, 1, false);
        declareFunction("visit_defstruct_categorized_template_rule_set", "VISIT-DEFSTRUCT-CATEGORIZED-TEMPLATE-RULE-SET", 2, 0, false);
        declareFunction("visit_defstruct_object_categorized_template_rule_set_method", "VISIT-DEFSTRUCT-OBJECT-CATEGORIZED-TEMPLATE-RULE-SET-METHOD", 2, 0, false);
        declareFunction("new_categorized_template_rule_set", "NEW-CATEGORIZED-TEMPLATE-RULE-SET", 0, 1, false);
        declareFunction("update_rule_set_mentions", "UPDATE-RULE-SET-MENTIONS", 3, 0, false);
        declareFunction("eliminate_rule_set_mentions", "ELIMINATE-RULE-SET-MENTIONS", 3, 0, false);
        declareFunction("compute_rule_set_mentions_specificity", "COMPUTE-RULE-SET-MENTIONS-SPECIFICITY", 2, 0, false);
        declareFunction("update_rule_set_key_terminal", "UPDATE-RULE-SET-KEY-TERMINAL", 3, 0, false);
        declareFunction("eliminate_rule_set_key_terminal", "ELIMINATE-RULE-SET-KEY-TERMINAL", 3, 0, false);
        declareFunction("update_rule_set_generic", "UPDATE-RULE-SET-GENERIC", 2, 0, false);
        declareFunction("eliminate_rule_set_generic", "ELIMINATE-RULE-SET-GENERIC", 2, 0, false);
        declareFunction("get_categorized_template_rule_set", "GET-CATEGORIZED-TEMPLATE-RULE-SET", 2, 0, false);
        declareFunction("add_categorized_template_rule_set", "ADD-CATEGORIZED-TEMPLATE-RULE-SET", 2, 0, false);
        declareFunction("find_or_add_categorized_template_rule_set", "FIND-OR-ADD-CATEGORIZED-TEMPLATE-RULE-SET", 2, 0, false);
        declareFunction("extend_categorized_template_rule_set", "EXTEND-CATEGORIZED-TEMPLATE-RULE-SET", 2, 0, false);
        declareFunction("reduce_categorized_template_rule_set", "REDUCE-CATEGORIZED-TEMPLATE-RULE-SET", 2, 0, false);
        declareFunction("reconsider_rule_set_key_terminal", "RECONSIDER-RULE-SET-KEY-TERMINAL", 3, 0, false);
        declareFunction("recompute_rule_set_key_terminal", "RECOMPUTE-RULE-SET-KEY-TERMINAL", 2, 0, false);
        declareFunction("find_most_specific_terminal_in_rule_set", "FIND-MOST-SPECIFIC-TERMINAL-IN-RULE-SET", 2, 0, false);
        declareFunction("find_most_specific_terminals_in_rule_set", "FIND-MOST-SPECIFIC-TERMINALS-IN-RULE-SET", 2, 0, false);
        declareMacro("do_templates_for_terminal", "DO-TEMPLATES-FOR-TERMINAL");
        declareMacro("with_clean_rtp_associative_memory", "WITH-CLEAN-RTP-ASSOCIATIVE-MEMORY");
        declareFunction("template_in_associative_memoryP", "TEMPLATE-IN-ASSOCIATIVE-MEMORY?", 4, 0, false);
        declareFunction("clear_relevant_template_mts", "CLEAR-RELEVANT-TEMPLATE-MTS", 0, 0, false);
        declareFunction("remove_relevant_template_mts", "REMOVE-RELEVANT-TEMPLATE-MTS", 1, 0, false);
        declareFunction("relevant_template_mts_internal", "RELEVANT-TEMPLATE-MTS-INTERNAL", 1, 0, false);
        declareFunction("relevant_template_mts", "RELEVANT-TEMPLATE-MTS", 1, 0, false);
        declareFunction("clear_template_mts", "CLEAR-TEMPLATE-MTS", 0, 0, false);
        declareFunction("template_mts", "TEMPLATE-MTS", 0, 0, false);
        declareFunction("get_templates_for_terminal", "GET-TEMPLATES-FOR-TERMINAL", 3, 0, false);
        declareFunction("get_best_templates_for_terminal", "GET-BEST-TEMPLATES-FOR-TERMINAL", 3, 0, false);
        declareFunction("get_generic_templates_for_category", "GET-GENERIC-TEMPLATES-FOR-CATEGORY", 2, 0, false);
        declareFunction("enumerate_all_terminals", "ENUMERATE-ALL-TERMINALS", 1, 0, false);
        declareFunction("enumerate_all_best_terminals", "ENUMERATE-ALL-BEST-TERMINALS", 1, 0, false);
        declareFunction("populate_rtp_from_mt", "POPULATE-RTP-FROM-MT", 1, 1, false);
        declareFunction("repopulate_rtp_from_mt", "REPOPULATE-RTP-FROM-MT", 1, 1, false);
        declareFunction("extend_rtp_from_mt", "EXTEND-RTP-FROM-MT", 2, 0, false);
        declareFunction("extend_rtp_from_just_mt_for_tp_type", "EXTEND-RTP-FROM-JUST-MT-FOR-TP-TYPE", 3, 0, false);
        declareFunction("template_count_for_pred_and_categories", "TEMPLATE-COUNT-FOR-PRED-AND-CATEGORIES", 2, 1, false);
        declareFunction("extend_rtp_with_template_assertion", "EXTEND-RTP-WITH-TEMPLATE-ASSERTION", 1, 0, false);
        declareFunction("strip_wrapper_functions_from", "STRIP-WRAPPER-FUNCTIONS-FROM", 1, 0, false);
        declareFunction("reduce_rtp_by_template_assertion", "REDUCE-RTP-BY-TEMPLATE-ASSERTION", 1, 0, false);
        declareFunction("add_template_assertion", "ADD-TEMPLATE-ASSERTION", 2, 0, false);
        declareFunction("remove_template_assertion", "REMOVE-TEMPLATE-ASSERTION", 2, 0, false);
        declareFunction("cached_template_assertion_p", "CACHED-TEMPLATE-ASSERTION-P", 2, 0, false);
        declareFunction("rtp_chart_entry_print_function_trampoline", "RTP-CHART-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("rtp_chart_entry_p", "RTP-CHART-ENTRY-P", 1, 0, false);
        new rtp_datastructures.$rtp_chart_entry_p$UnaryFunction();
        declareFunction("rtp_chart_entry_start", "RTP-CHART-ENTRY-START", 1, 0, false);
        declareFunction("rtp_chart_entry_end", "RTP-CHART-ENTRY-END", 1, 0, false);
        declareFunction("rtp_chart_entry_rule", "RTP-CHART-ENTRY-RULE", 1, 0, false);
        declareFunction("rtp_chart_entry_template_index", "RTP-CHART-ENTRY-TEMPLATE-INDEX", 1, 0, false);
        declareFunction("rtp_chart_entry_words", "RTP-CHART-ENTRY-WORDS", 1, 0, false);
        declareFunction("rtp_chart_entry_bindings", "RTP-CHART-ENTRY-BINDINGS", 1, 0, false);
        declareFunction("rtp_chart_entry_subconstits", "RTP-CHART-ENTRY-SUBCONSTITS", 1, 0, false);
        declareFunction("rtp_chart_entry_sem", "RTP-CHART-ENTRY-SEM", 1, 0, false);
        declareFunction("_csetf_rtp_chart_entry_start", "_CSETF-RTP-CHART-ENTRY-START", 2, 0, false);
        declareFunction("_csetf_rtp_chart_entry_end", "_CSETF-RTP-CHART-ENTRY-END", 2, 0, false);
        declareFunction("_csetf_rtp_chart_entry_rule", "_CSETF-RTP-CHART-ENTRY-RULE", 2, 0, false);
        declareFunction("_csetf_rtp_chart_entry_template_index", "_CSETF-RTP-CHART-ENTRY-TEMPLATE-INDEX", 2, 0, false);
        declareFunction("_csetf_rtp_chart_entry_words", "_CSETF-RTP-CHART-ENTRY-WORDS", 2, 0, false);
        declareFunction("_csetf_rtp_chart_entry_bindings", "_CSETF-RTP-CHART-ENTRY-BINDINGS", 2, 0, false);
        declareFunction("_csetf_rtp_chart_entry_subconstits", "_CSETF-RTP-CHART-ENTRY-SUBCONSTITS", 2, 0, false);
        declareFunction("_csetf_rtp_chart_entry_sem", "_CSETF-RTP-CHART-ENTRY-SEM", 2, 0, false);
        declareFunction("make_rtp_chart_entry", "MAKE-RTP-CHART-ENTRY", 0, 1, false);
        declareFunction("visit_defstruct_rtp_chart_entry", "VISIT-DEFSTRUCT-RTP-CHART-ENTRY", 2, 0, false);
        declareFunction("visit_defstruct_object_rtp_chart_entry_method", "VISIT-DEFSTRUCT-OBJECT-RTP-CHART-ENTRY-METHOD", 2, 0, false);
        declareFunction("rtp_entry_print", "RTP-ENTRY-PRINT", 3, 0, false);
        declareFunction("copy_rtp_entry", "COPY-RTP-ENTRY", 1, 0, false);
        declareFunction("make_new_rtp_entry", "MAKE-NEW-RTP-ENTRY", 3, 2, false);
        declareFunction("set_rtp_entry_remaining_template", "SET-RTP-ENTRY-REMAINING-TEMPLATE", 2, 0, false);
        declareFunction("convert_rtp_entry_to_parse_result", "CONVERT-RTP-ENTRY-TO-PARSE-RESULT", 1, 0, false);
        declareFunction("rtp_sem_testP", "RTP-SEM-TEST?", 1, 0, false);
        declareFunction("rtp_sem_test_var", "RTP-SEM-TEST-VAR", 1, 0, false);
        declareFunction("rtp_sem_test_constraint", "RTP-SEM-TEST-CONSTRAINT", 1, 0, false);
        declareFunction("subconstit_print_function_trampoline", "SUBCONSTIT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("subconstit_p", "SUBCONSTIT-P", 1, 0, false);
        new rtp_datastructures.$subconstit_p$UnaryFunction();
        declareFunction("subconstit_cat", "SUBCONSTIT-CAT", 1, 0, false);
        declareFunction("subconstit_string", "SUBCONSTIT-STRING", 1, 0, false);
        declareFunction("subconstit_binding_var", "SUBCONSTIT-BINDING-VAR", 1, 0, false);
        declareFunction("subconstit_start", "SUBCONSTIT-START", 1, 0, false);
        declareFunction("subconstit_end", "SUBCONSTIT-END", 1, 0, false);
        declareFunction("subconstit_sem_test", "SUBCONSTIT-SEM-TEST", 1, 0, false);
        declareFunction("_csetf_subconstit_cat", "_CSETF-SUBCONSTIT-CAT", 2, 0, false);
        declareFunction("_csetf_subconstit_string", "_CSETF-SUBCONSTIT-STRING", 2, 0, false);
        declareFunction("_csetf_subconstit_binding_var", "_CSETF-SUBCONSTIT-BINDING-VAR", 2, 0, false);
        declareFunction("_csetf_subconstit_start", "_CSETF-SUBCONSTIT-START", 2, 0, false);
        declareFunction("_csetf_subconstit_end", "_CSETF-SUBCONSTIT-END", 2, 0, false);
        declareFunction("_csetf_subconstit_sem_test", "_CSETF-SUBCONSTIT-SEM-TEST", 2, 0, false);
        declareFunction("make_subconstit", "MAKE-SUBCONSTIT", 0, 1, false);
        declareFunction("visit_defstruct_subconstit", "VISIT-DEFSTRUCT-SUBCONSTIT", 2, 0, false);
        declareFunction("visit_defstruct_object_subconstit_method", "VISIT-DEFSTRUCT-OBJECT-SUBCONSTIT-METHOD", 2, 0, false);
        declareFunction("print_subconstit", "PRINT-SUBCONSTIT", 3, 0, false);
        declareFunction("make_new_subconstit", "MAKE-NEW-SUBCONSTIT", 5, 1, false);
        declareFunction("convert_subconstit_to_parse_result", "CONVERT-SUBCONSTIT-TO-PARSE-RESULT", 1, 0, false);
        declareFunction("rtp_make_binding", "RTP-MAKE-BINDING", 2, 0, false);
        declareFunction("rtp_binding_var", "RTP-BINDING-VAR", 1, 0, false);
        declareFunction("rtp_binding_vals", "RTP-BINDING-VALS", 1, 0, false);
        declareFunction("rtp_binding_p", "RTP-BINDING-P", 1, 0, false);
        declareFunction("template_item_wu", "TEMPLATE-ITEM-WU", 1, 0, false);
        declareFunction("template_item_pos", "TEMPLATE-ITEM-POS", 1, 0, false);
        declareFunction("reset_all_rtp_datastructure_caches", "RESET-ALL-RTP-DATASTRUCTURE-CACHES", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_rtp_datastructures_file_alt() {
        deflexical("*PRINT-RULE-ABBREVIATED*", T);
        deflexical("*TEMPLATE-META-MARKER-MAPPINGS*", NIL != boundp($template_meta_marker_mappings$) ? ((SubLObject) ($template_meta_marker_mappings$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        deflexical("*TEMPLATE-META-MARKER-PREDICATE*", $$templateMarkerRepresentation);
        deflexical("*TEMPLATE-CATEGORY-FILL-WORDS*", NIL != boundp($template_category_fill_words$) ? ((SubLObject) ($template_category_fill_words$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        deflexical("*TEMPLATE-CATEGORY-FILL-WORD-PREDICATE*", $$templateCategoryFillWord);
        deflexical("*MAKE-OPTIONAL-WORD-LIST-CACHING-STATE*", NIL);
        defconstant("*DTP-TEMPLATE-RULE*", TEMPLATE_RULE);
        deflexical("*TEMPLATE-RULE-SXHASHING-PRIME-A*", FIVE_INTEGER);
        deflexical("*TEMPLATE-RULE-SXHASHING-PRIME-B*", SEVEN_INTEGER);
        deflexical("*USE-BETTER-TEMPLATE-RULE-SXHASH?*", NIL != boundp($use_better_template_rule_sxhashP$) ? ((SubLObject) ($use_better_template_rule_sxhashP$.getGlobalValue())) : NIL);
        defparameter("*TEMPLATE-RULE-DEFAULT-ASSERTION*", NIL);
        defparameter("*TEMPLATE-RULE-DEFAULT-MEANING*", constants_high.find_constant($$$assertTemplate));
        deflexical("*TEMPLATE-RULE-ISG*", NIL != boundp($template_rule_isg$) ? ((SubLObject) ($template_rule_isg$.getGlobalValue())) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        defconstant("*CFASL-OPCODE-TEMPLATE-RULE*", $int$97);
        defconstant("*DTP-TEMPLATE-SPAN-ITEM*", TEMPLATE_SPAN_ITEM);
        defparameter("*TEMPLATE-TERMINAL-STYLE*", $STANDARD);
        defparameter("*BLOCK-LEFT-RECURSIVE-TEMPLATES*", NIL);
        deflexical("*DENOTATIONS-OF-CONSTANT-CACHING-STATE*", NIL);
        deflexical("*ALL-PHRASES-FILTER-FROM-TERM-PHRASES-CONSTRAINT-CACHING-STATE*", NIL);
        defparameter("*RTP-CONTRACTIONS-TABLE*", NIL);
        deflexical("*RTP-RULES*", NIL != boundp($rtp_rules$) ? ((SubLObject) ($rtp_rules$.getGlobalValue())) : NIL);
        deflexical("*RTP-RULES-INITIAL-SIZE*", $int$256);
        deflexical("*TEMPLATE-RULES-MASTER-INDEX*", NIL != boundp($template_rules_master_index$) ? ((SubLObject) ($template_rules_master_index$.getGlobalValue())) : NIL);
        defconstant("*DTP-CATEGORIZED-TEMPLATE-RULE-SET*", CATEGORIZED_TEMPLATE_RULE_SET);
        defparameter("*ASSUME-EMPTY-ASSOCIATIVE-MEMORY?*", NIL);
        deflexical("*RELEVANT-TEMPLATE-MTS-CACHING-STATE*", NIL);
        deflexical("*TEMPLATE-MTS*", NIL != boundp($template_mts$) ? ((SubLObject) ($template_mts$.getGlobalValue())) : NIL);
        defparameter("*RTP-ASSERTS-INITIALIZED-SO-FAR*", ZERO_INTEGER);
        defconstant("*DTP-RTP-CHART-ENTRY*", RTP_CHART_ENTRY);
        defconstant("*DTP-SUBCONSTIT*", SUBCONSTIT);
        return NIL;
    }

    public static SubLObject init_rtp_datastructures_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*PRINT-RULE-ABBREVIATED*", T);
            deflexical("*TEMPLATE-META-MARKER-MAPPINGS*", SubLTrampolineFile.maybeDefault(rtp_datastructures.$template_meta_marker_mappings$, rtp_datastructures.$template_meta_marker_mappings$, () -> new_dictionary(UNPROVIDED, UNPROVIDED)));
            deflexical("*TEMPLATE-META-MARKER-PREDICATE*", rtp_datastructures.$$templateMarkerRepresentation);
            deflexical("*TEMPLATE-CATEGORY-FILL-WORDS*", SubLTrampolineFile.maybeDefault(rtp_datastructures.$template_category_fill_words$, rtp_datastructures.$template_category_fill_words$, () -> new_dictionary(UNPROVIDED, UNPROVIDED)));
            deflexical("*TEMPLATE-CATEGORY-FILL-WORD-PREDICATE*", rtp_datastructures.$$templateCategoryFillWord);
            deflexical("*MAKE-OPTIONAL-WORD-LIST-CACHING-STATE*", NIL);
            defconstant("*DTP-TEMPLATE-RULE*", rtp_datastructures.TEMPLATE_RULE);
            deflexical("*TEMPLATE-RULE-SXHASHING-PRIME-A*", FIVE_INTEGER);
            deflexical("*TEMPLATE-RULE-SXHASHING-PRIME-B*", SEVEN_INTEGER);
            deflexical("*USE-BETTER-TEMPLATE-RULE-SXHASH?*", SubLTrampolineFile.maybeDefault(rtp_datastructures.$use_better_template_rule_sxhashP$, rtp_datastructures.$use_better_template_rule_sxhashP$, NIL));
            defparameter("*TEMPLATE-RULE-DEFAULT-ASSERTION*", NIL);
            defparameter("*TEMPLATE-RULE-DEFAULT-MEANING*", find_constant(rtp_datastructures.$$$assertTemplate));
            deflexical("*TEMPLATE-RULE-ISG*", SubLTrampolineFile.maybeDefault(rtp_datastructures.$template_rule_isg$, rtp_datastructures.$template_rule_isg$, () -> new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            defconstant("*CFASL-OPCODE-TEMPLATE-RULE*", rtp_datastructures.$int$97);
            defconstant("*DTP-TEMPLATE-SPAN-ITEM*", rtp_datastructures.TEMPLATE_SPAN_ITEM);
            defparameter("*TEMPLATE-TERMINAL-STYLE*", $STANDARD);
            defparameter("*BLOCK-LEFT-RECURSIVE-TEMPLATES*", NIL);
            deflexical("*DENOTATIONS-OF-CONSTANT-CACHING-STATE*", NIL);
            deflexical("*ALL-PHRASES-FILTER-FROM-TERM-PHRASES-CONSTRAINT-CACHING-STATE*", NIL);
            defparameter("*RTP-CONTRACTIONS-TABLE*", NIL);
            deflexical("*RTP-RULES*", SubLTrampolineFile.maybeDefault(rtp_datastructures.$rtp_rules$, rtp_datastructures.$rtp_rules$, NIL));
            deflexical("*RTP-RULES-INITIAL-SIZE*", $int$256);
            deflexical("*TEMPLATE-RULES-MASTER-INDEX*", SubLTrampolineFile.maybeDefault(rtp_datastructures.$template_rules_master_index$, rtp_datastructures.$template_rules_master_index$, NIL));
            defconstant("*DTP-CATEGORIZED-TEMPLATE-RULE-SET*", rtp_datastructures.CATEGORIZED_TEMPLATE_RULE_SET);
            defparameter("*ASSUME-EMPTY-ASSOCIATIVE-MEMORY?*", NIL);
            deflexical("*RELEVANT-TEMPLATE-MTS-CACHING-STATE*", NIL);
            deflexical("*TEMPLATE-MTS*", SubLTrampolineFile.maybeDefault(rtp_datastructures.$template_mts$, rtp_datastructures.$template_mts$, NIL));
            defparameter("*RTP-ASSERTS-INITIALIZED-SO-FAR*", ZERO_INTEGER);
            defconstant("*DTP-RTP-CHART-ENTRY*", rtp_datastructures.RTP_CHART_ENTRY);
            defconstant("*DTP-SUBCONSTIT*", rtp_datastructures.SUBCONSTIT);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*TEMPLATE-META-MARKER-MAPPINGS*", NIL != boundp($template_meta_marker_mappings$) ? ((SubLObject) ($template_meta_marker_mappings$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
            deflexical("*TEMPLATE-CATEGORY-FILL-WORDS*", NIL != boundp($template_category_fill_words$) ? ((SubLObject) ($template_category_fill_words$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
            deflexical("*USE-BETTER-TEMPLATE-RULE-SXHASH?*", NIL != boundp($use_better_template_rule_sxhashP$) ? ((SubLObject) ($use_better_template_rule_sxhashP$.getGlobalValue())) : NIL);
            deflexical("*TEMPLATE-RULE-ISG*", NIL != boundp($template_rule_isg$) ? ((SubLObject) ($template_rule_isg$.getGlobalValue())) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
            deflexical("*RTP-RULES*", NIL != boundp($rtp_rules$) ? ((SubLObject) ($rtp_rules$.getGlobalValue())) : NIL);
            deflexical("*TEMPLATE-RULES-MASTER-INDEX*", NIL != boundp($template_rules_master_index$) ? ((SubLObject) ($template_rules_master_index$.getGlobalValue())) : NIL);
            deflexical("*TEMPLATE-MTS*", NIL != boundp($template_mts$) ? ((SubLObject) ($template_mts$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_rtp_datastructures_file_Previous() {
        deflexical("*PRINT-RULE-ABBREVIATED*", T);
        deflexical("*TEMPLATE-META-MARKER-MAPPINGS*", SubLTrampolineFile.maybeDefault(rtp_datastructures.$template_meta_marker_mappings$, rtp_datastructures.$template_meta_marker_mappings$, () -> new_dictionary(UNPROVIDED, UNPROVIDED)));
        deflexical("*TEMPLATE-META-MARKER-PREDICATE*", rtp_datastructures.$$templateMarkerRepresentation);
        deflexical("*TEMPLATE-CATEGORY-FILL-WORDS*", SubLTrampolineFile.maybeDefault(rtp_datastructures.$template_category_fill_words$, rtp_datastructures.$template_category_fill_words$, () -> new_dictionary(UNPROVIDED, UNPROVIDED)));
        deflexical("*TEMPLATE-CATEGORY-FILL-WORD-PREDICATE*", rtp_datastructures.$$templateCategoryFillWord);
        deflexical("*MAKE-OPTIONAL-WORD-LIST-CACHING-STATE*", NIL);
        defconstant("*DTP-TEMPLATE-RULE*", rtp_datastructures.TEMPLATE_RULE);
        deflexical("*TEMPLATE-RULE-SXHASHING-PRIME-A*", FIVE_INTEGER);
        deflexical("*TEMPLATE-RULE-SXHASHING-PRIME-B*", SEVEN_INTEGER);
        deflexical("*USE-BETTER-TEMPLATE-RULE-SXHASH?*", SubLTrampolineFile.maybeDefault(rtp_datastructures.$use_better_template_rule_sxhashP$, rtp_datastructures.$use_better_template_rule_sxhashP$, NIL));
        defparameter("*TEMPLATE-RULE-DEFAULT-ASSERTION*", NIL);
        defparameter("*TEMPLATE-RULE-DEFAULT-MEANING*", find_constant(rtp_datastructures.$$$assertTemplate));
        deflexical("*TEMPLATE-RULE-ISG*", SubLTrampolineFile.maybeDefault(rtp_datastructures.$template_rule_isg$, rtp_datastructures.$template_rule_isg$, () -> new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        defconstant("*CFASL-OPCODE-TEMPLATE-RULE*", rtp_datastructures.$int$97);
        defconstant("*DTP-TEMPLATE-SPAN-ITEM*", rtp_datastructures.TEMPLATE_SPAN_ITEM);
        defparameter("*TEMPLATE-TERMINAL-STYLE*", $STANDARD);
        defparameter("*BLOCK-LEFT-RECURSIVE-TEMPLATES*", NIL);
        deflexical("*DENOTATIONS-OF-CONSTANT-CACHING-STATE*", NIL);
        deflexical("*ALL-PHRASES-FILTER-FROM-TERM-PHRASES-CONSTRAINT-CACHING-STATE*", NIL);
        defparameter("*RTP-CONTRACTIONS-TABLE*", NIL);
        deflexical("*RTP-RULES*", SubLTrampolineFile.maybeDefault(rtp_datastructures.$rtp_rules$, rtp_datastructures.$rtp_rules$, NIL));
        deflexical("*RTP-RULES-INITIAL-SIZE*", $int$256);
        deflexical("*TEMPLATE-RULES-MASTER-INDEX*", SubLTrampolineFile.maybeDefault(rtp_datastructures.$template_rules_master_index$, rtp_datastructures.$template_rules_master_index$, NIL));
        defconstant("*DTP-CATEGORIZED-TEMPLATE-RULE-SET*", rtp_datastructures.CATEGORIZED_TEMPLATE_RULE_SET);
        defparameter("*ASSUME-EMPTY-ASSOCIATIVE-MEMORY?*", NIL);
        deflexical("*RELEVANT-TEMPLATE-MTS-CACHING-STATE*", NIL);
        deflexical("*TEMPLATE-MTS*", SubLTrampolineFile.maybeDefault(rtp_datastructures.$template_mts$, rtp_datastructures.$template_mts$, NIL));
        defparameter("*RTP-ASSERTS-INITIALIZED-SO-FAR*", ZERO_INTEGER);
        defconstant("*DTP-RTP-CHART-ENTRY*", rtp_datastructures.RTP_CHART_ENTRY);
        defconstant("*DTP-SUBCONSTIT*", rtp_datastructures.SUBCONSTIT);
        return NIL;
    }

    public static final SubLObject setup_rtp_datastructures_file_alt() {
        declare_defglobal($template_meta_marker_mappings$);
        declare_defglobal($template_category_fill_words$);
        memoization_state.note_globally_cached_function(MAKE_OPTIONAL_WORD_LIST);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_template_rule$.getGlobalValue(), symbol_function(TEMPLATE_RULE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(TEMPLATE_RULE_CATEGORY, _CSETF_TEMPLATE_RULE_CATEGORY);
        def_csetf(TEMPLATE_RULE_TEMPLATE, _CSETF_TEMPLATE_RULE_TEMPLATE);
        def_csetf(TEMPLATE_RULE_TRANSFORMATION, _CSETF_TEMPLATE_RULE_TRANSFORMATION);
        def_csetf(TEMPLATE_RULE_SEM_TEST, _CSETF_TEMPLATE_RULE_SEM_TEST);
        def_csetf(TEMPLATE_RULE_ASSERTION, _CSETF_TEMPLATE_RULE_ASSERTION);
        def_csetf(TEMPLATE_RULE_TERMINALS, _CSETF_TEMPLATE_RULE_TERMINALS);
        def_csetf(TEMPLATE_RULE_MEANING, _CSETF_TEMPLATE_RULE_MEANING);
        def_csetf(TEMPLATE_RULE_CONSTRAINTS, _CSETF_TEMPLATE_RULE_CONSTRAINTS);
        def_csetf(TEMPLATE_RULE_ID, _CSETF_TEMPLATE_RULE_ID);
        identity(TEMPLATE_RULE);
        declare_defglobal($use_better_template_rule_sxhashP$);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_template_rule$.getGlobalValue(), symbol_function(SXHASH_TEMPLATE_RULE_METHOD));
        declare_defglobal($template_rule_isg$);
        register_cfasl_input_function($cfasl_opcode_template_rule$.getGlobalValue(), CFASL_INPUT_TEMPLATE_RULE);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_template_rule$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_TEMPLATE_RULE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_template_span_item$.getGlobalValue(), symbol_function(TEMPLATE_SPAN_ITEM_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(TEMPLATE_SPAN_ITEM_TEMPLATE_ITEM, _CSETF_TEMPLATE_SPAN_ITEM_TEMPLATE_ITEM);
        def_csetf(TEMPLATE_SPAN_ITEM_START, _CSETF_TEMPLATE_SPAN_ITEM_START);
        def_csetf(TEMPLATE_SPAN_ITEM_END, _CSETF_TEMPLATE_SPAN_ITEM_END);
        identity(TEMPLATE_SPAN_ITEM);
        memoization_state.note_globally_cached_function(DENOTATIONS_OF_CONSTANT);
        memoization_state.note_globally_cached_function(ALL_PHRASES_FILTER_FROM_TERM_PHRASES_CONSTRAINT);
        declare_defglobal($rtp_rules$);
        declare_defglobal($template_rules_master_index$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_categorized_template_rule_set$.getGlobalValue(), symbol_function(CATEGORIZED_TEMPLATE_RULE_SET_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(CATEGORIZED_TEMPLATE_RULE_SET_MENTIONS, _CSETF_CATEGORIZED_TEMPLATE_RULE_SET_MENTIONS);
        def_csetf(CATEGORIZED_TEMPLATE_RULE_SET_GENERIC, _CSETF_CATEGORIZED_TEMPLATE_RULE_SET_GENERIC);
        def_csetf(CATEGORIZED_TEMPLATE_RULE_SET_KEY_TERMINAL, _CSETF_CATEGORIZED_TEMPLATE_RULE_SET_KEY_TERMINAL);
        identity(CATEGORIZED_TEMPLATE_RULE_SET);
        memoization_state.note_globally_cached_function(RELEVANT_TEMPLATE_MTS);
        declare_defglobal($template_mts$);
        register_kb_function(ADD_TEMPLATE_ASSERTION);
        register_kb_function(REMOVE_TEMPLATE_ASSERTION);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_rtp_chart_entry$.getGlobalValue(), symbol_function(RTP_CHART_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(RTP_CHART_ENTRY_START, _CSETF_RTP_CHART_ENTRY_START);
        def_csetf(RTP_CHART_ENTRY_END, _CSETF_RTP_CHART_ENTRY_END);
        def_csetf(RTP_CHART_ENTRY_RULE, _CSETF_RTP_CHART_ENTRY_RULE);
        def_csetf(RTP_CHART_ENTRY_TEMPLATE_INDEX, _CSETF_RTP_CHART_ENTRY_TEMPLATE_INDEX);
        def_csetf(RTP_CHART_ENTRY_WORDS, _CSETF_RTP_CHART_ENTRY_WORDS);
        def_csetf(RTP_CHART_ENTRY_BINDINGS, _CSETF_RTP_CHART_ENTRY_BINDINGS);
        def_csetf(RTP_CHART_ENTRY_SUBCONSTITS, _CSETF_RTP_CHART_ENTRY_SUBCONSTITS);
        def_csetf(RTP_CHART_ENTRY_SEM, _CSETF_RTP_CHART_ENTRY_SEM);
        identity(RTP_CHART_ENTRY);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_subconstit$.getGlobalValue(), symbol_function(SUBCONSTIT_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(SUBCONSTIT_CAT, _CSETF_SUBCONSTIT_CAT);
        def_csetf(SUBCONSTIT_STRING, _CSETF_SUBCONSTIT_STRING);
        def_csetf(SUBCONSTIT_BINDING_VAR, _CSETF_SUBCONSTIT_BINDING_VAR);
        def_csetf(SUBCONSTIT_START, _CSETF_SUBCONSTIT_START);
        def_csetf(SUBCONSTIT_END, _CSETF_SUBCONSTIT_END);
        def_csetf(SUBCONSTIT_SEM_TEST, _CSETF_SUBCONSTIT_SEM_TEST);
        identity(SUBCONSTIT);
        return NIL;
    }

    public static SubLObject setup_rtp_datastructures_file() {
        if (SubLFiles.USE_V1) {
            declare_defglobal(rtp_datastructures.$template_meta_marker_mappings$);
            declare_defglobal(rtp_datastructures.$template_category_fill_words$);
            note_globally_cached_function(rtp_datastructures.MAKE_OPTIONAL_WORD_LIST);
            register_method($print_object_method_table$.getGlobalValue(), rtp_datastructures.$dtp_template_rule$.getGlobalValue(), symbol_function(rtp_datastructures.TEMPLATE_RULE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(rtp_datastructures.$list20);
            def_csetf(rtp_datastructures.TEMPLATE_RULE_CATEGORY, rtp_datastructures._CSETF_TEMPLATE_RULE_CATEGORY);
            def_csetf(rtp_datastructures.TEMPLATE_RULE_TEMPLATE, rtp_datastructures._CSETF_TEMPLATE_RULE_TEMPLATE);
            def_csetf(rtp_datastructures.TEMPLATE_RULE_TRANSFORMATION, rtp_datastructures._CSETF_TEMPLATE_RULE_TRANSFORMATION);
            def_csetf(rtp_datastructures.TEMPLATE_RULE_SEM_TEST, rtp_datastructures._CSETF_TEMPLATE_RULE_SEM_TEST);
            def_csetf(rtp_datastructures.TEMPLATE_RULE_ASSERTION, rtp_datastructures._CSETF_TEMPLATE_RULE_ASSERTION);
            def_csetf(rtp_datastructures.TEMPLATE_RULE_TERMINALS, rtp_datastructures._CSETF_TEMPLATE_RULE_TERMINALS);
            def_csetf(rtp_datastructures.TEMPLATE_RULE_MEANING, rtp_datastructures._CSETF_TEMPLATE_RULE_MEANING);
            def_csetf(rtp_datastructures.TEMPLATE_RULE_CONSTRAINTS, rtp_datastructures._CSETF_TEMPLATE_RULE_CONSTRAINTS);
            def_csetf(rtp_datastructures.TEMPLATE_RULE_ID, rtp_datastructures._CSETF_TEMPLATE_RULE_ID);
            identity(rtp_datastructures.TEMPLATE_RULE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rtp_datastructures.$dtp_template_rule$.getGlobalValue(), symbol_function(rtp_datastructures.VISIT_DEFSTRUCT_OBJECT_TEMPLATE_RULE_METHOD));
            declare_defglobal(rtp_datastructures.$use_better_template_rule_sxhashP$);
            register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), rtp_datastructures.$dtp_template_rule$.getGlobalValue(), symbol_function(rtp_datastructures.SXHASH_TEMPLATE_RULE_METHOD));
            declare_defglobal(rtp_datastructures.$template_rule_isg$);
            register_cfasl_input_function(rtp_datastructures.$cfasl_opcode_template_rule$.getGlobalValue(), rtp_datastructures.CFASL_INPUT_TEMPLATE_RULE);
            register_method($cfasl_output_object_method_table$.getGlobalValue(), rtp_datastructures.$dtp_template_rule$.getGlobalValue(), symbol_function(rtp_datastructures.CFASL_OUTPUT_OBJECT_TEMPLATE_RULE_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), rtp_datastructures.$dtp_template_span_item$.getGlobalValue(), symbol_function(rtp_datastructures.TEMPLATE_SPAN_ITEM_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(rtp_datastructures.$list74);
            def_csetf(rtp_datastructures.TEMPLATE_SPAN_ITEM_TEMPLATE_ITEM, rtp_datastructures._CSETF_TEMPLATE_SPAN_ITEM_TEMPLATE_ITEM);
            def_csetf(rtp_datastructures.TEMPLATE_SPAN_ITEM_START, rtp_datastructures._CSETF_TEMPLATE_SPAN_ITEM_START);
            def_csetf(rtp_datastructures.TEMPLATE_SPAN_ITEM_END, rtp_datastructures._CSETF_TEMPLATE_SPAN_ITEM_END);
            identity(rtp_datastructures.TEMPLATE_SPAN_ITEM);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rtp_datastructures.$dtp_template_span_item$.getGlobalValue(), symbol_function(rtp_datastructures.VISIT_DEFSTRUCT_OBJECT_TEMPLATE_SPAN_ITEM_METHOD));
            note_globally_cached_function(rtp_datastructures.DENOTATIONS_OF_CONSTANT);
            note_globally_cached_function(rtp_datastructures.ALL_PHRASES_FILTER_FROM_TERM_PHRASES_CONSTRAINT);
            declare_defglobal(rtp_datastructures.$rtp_rules$);
            declare_defglobal(rtp_datastructures.$template_rules_master_index$);
            register_method($print_object_method_table$.getGlobalValue(), rtp_datastructures.$dtp_categorized_template_rule_set$.getGlobalValue(), symbol_function(rtp_datastructures.CATEGORIZED_TEMPLATE_RULE_SET_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(rtp_datastructures.$list130);
            def_csetf(rtp_datastructures.CATEGORIZED_TEMPLATE_RULE_SET_MENTIONS, rtp_datastructures._CSETF_CATEGORIZED_TEMPLATE_RULE_SET_MENTIONS);
            def_csetf(rtp_datastructures.CATEGORIZED_TEMPLATE_RULE_SET_GENERIC, rtp_datastructures._CSETF_CATEGORIZED_TEMPLATE_RULE_SET_GENERIC);
            def_csetf(rtp_datastructures.CATEGORIZED_TEMPLATE_RULE_SET_KEY_TERMINAL, rtp_datastructures._CSETF_CATEGORIZED_TEMPLATE_RULE_SET_KEY_TERMINAL);
            identity(rtp_datastructures.CATEGORIZED_TEMPLATE_RULE_SET);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rtp_datastructures.$dtp_categorized_template_rule_set$.getGlobalValue(), symbol_function(rtp_datastructures.VISIT_DEFSTRUCT_OBJECT_CATEGORIZED_TEMPLATE_RULE_SET_METHOD));
            note_globally_cached_function(rtp_datastructures.RELEVANT_TEMPLATE_MTS);
            declare_defglobal(rtp_datastructures.$template_mts$);
            register_kb_function(rtp_datastructures.ADD_TEMPLATE_ASSERTION);
            register_kb_function(rtp_datastructures.REMOVE_TEMPLATE_ASSERTION);
            register_method($print_object_method_table$.getGlobalValue(), rtp_datastructures.$dtp_rtp_chart_entry$.getGlobalValue(), symbol_function(rtp_datastructures.RTP_CHART_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(rtp_datastructures.$list198);
            def_csetf(rtp_datastructures.RTP_CHART_ENTRY_START, rtp_datastructures._CSETF_RTP_CHART_ENTRY_START);
            def_csetf(rtp_datastructures.RTP_CHART_ENTRY_END, rtp_datastructures._CSETF_RTP_CHART_ENTRY_END);
            def_csetf(rtp_datastructures.RTP_CHART_ENTRY_RULE, rtp_datastructures._CSETF_RTP_CHART_ENTRY_RULE);
            def_csetf(rtp_datastructures.RTP_CHART_ENTRY_TEMPLATE_INDEX, rtp_datastructures._CSETF_RTP_CHART_ENTRY_TEMPLATE_INDEX);
            def_csetf(rtp_datastructures.RTP_CHART_ENTRY_WORDS, rtp_datastructures._CSETF_RTP_CHART_ENTRY_WORDS);
            def_csetf(rtp_datastructures.RTP_CHART_ENTRY_BINDINGS, rtp_datastructures._CSETF_RTP_CHART_ENTRY_BINDINGS);
            def_csetf(rtp_datastructures.RTP_CHART_ENTRY_SUBCONSTITS, rtp_datastructures._CSETF_RTP_CHART_ENTRY_SUBCONSTITS);
            def_csetf(rtp_datastructures.RTP_CHART_ENTRY_SEM, rtp_datastructures._CSETF_RTP_CHART_ENTRY_SEM);
            identity(rtp_datastructures.RTP_CHART_ENTRY);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rtp_datastructures.$dtp_rtp_chart_entry$.getGlobalValue(), symbol_function(rtp_datastructures.VISIT_DEFSTRUCT_OBJECT_RTP_CHART_ENTRY_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), rtp_datastructures.$dtp_subconstit$.getGlobalValue(), symbol_function(rtp_datastructures.SUBCONSTIT_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(rtp_datastructures.$list233);
            def_csetf(rtp_datastructures.SUBCONSTIT_CAT, rtp_datastructures._CSETF_SUBCONSTIT_CAT);
            def_csetf(rtp_datastructures.SUBCONSTIT_STRING, rtp_datastructures._CSETF_SUBCONSTIT_STRING);
            def_csetf(rtp_datastructures.SUBCONSTIT_BINDING_VAR, rtp_datastructures._CSETF_SUBCONSTIT_BINDING_VAR);
            def_csetf(rtp_datastructures.SUBCONSTIT_START, rtp_datastructures._CSETF_SUBCONSTIT_START);
            def_csetf(rtp_datastructures.SUBCONSTIT_END, rtp_datastructures._CSETF_SUBCONSTIT_END);
            def_csetf(rtp_datastructures.SUBCONSTIT_SEM_TEST, rtp_datastructures._CSETF_SUBCONSTIT_SEM_TEST);
            identity(rtp_datastructures.SUBCONSTIT);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rtp_datastructures.$dtp_subconstit$.getGlobalValue(), symbol_function(rtp_datastructures.VISIT_DEFSTRUCT_OBJECT_SUBCONSTIT_METHOD));
        }
        if (SubLFiles.USE_V2) {
            declare_defglobal($use_better_template_rule_sxhashP$);
        }
        return NIL;
    }

    public static SubLObject setup_rtp_datastructures_file_Previous() {
        declare_defglobal(rtp_datastructures.$template_meta_marker_mappings$);
        declare_defglobal(rtp_datastructures.$template_category_fill_words$);
        note_globally_cached_function(rtp_datastructures.MAKE_OPTIONAL_WORD_LIST);
        register_method($print_object_method_table$.getGlobalValue(), rtp_datastructures.$dtp_template_rule$.getGlobalValue(), symbol_function(rtp_datastructures.TEMPLATE_RULE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(rtp_datastructures.$list20);
        def_csetf(rtp_datastructures.TEMPLATE_RULE_CATEGORY, rtp_datastructures._CSETF_TEMPLATE_RULE_CATEGORY);
        def_csetf(rtp_datastructures.TEMPLATE_RULE_TEMPLATE, rtp_datastructures._CSETF_TEMPLATE_RULE_TEMPLATE);
        def_csetf(rtp_datastructures.TEMPLATE_RULE_TRANSFORMATION, rtp_datastructures._CSETF_TEMPLATE_RULE_TRANSFORMATION);
        def_csetf(rtp_datastructures.TEMPLATE_RULE_SEM_TEST, rtp_datastructures._CSETF_TEMPLATE_RULE_SEM_TEST);
        def_csetf(rtp_datastructures.TEMPLATE_RULE_ASSERTION, rtp_datastructures._CSETF_TEMPLATE_RULE_ASSERTION);
        def_csetf(rtp_datastructures.TEMPLATE_RULE_TERMINALS, rtp_datastructures._CSETF_TEMPLATE_RULE_TERMINALS);
        def_csetf(rtp_datastructures.TEMPLATE_RULE_MEANING, rtp_datastructures._CSETF_TEMPLATE_RULE_MEANING);
        def_csetf(rtp_datastructures.TEMPLATE_RULE_CONSTRAINTS, rtp_datastructures._CSETF_TEMPLATE_RULE_CONSTRAINTS);
        def_csetf(rtp_datastructures.TEMPLATE_RULE_ID, rtp_datastructures._CSETF_TEMPLATE_RULE_ID);
        identity(rtp_datastructures.TEMPLATE_RULE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rtp_datastructures.$dtp_template_rule$.getGlobalValue(), symbol_function(rtp_datastructures.VISIT_DEFSTRUCT_OBJECT_TEMPLATE_RULE_METHOD));
        declare_defglobal(rtp_datastructures.$use_better_template_rule_sxhashP$);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), rtp_datastructures.$dtp_template_rule$.getGlobalValue(), symbol_function(rtp_datastructures.SXHASH_TEMPLATE_RULE_METHOD));
        declare_defglobal(rtp_datastructures.$template_rule_isg$);
        register_cfasl_input_function(rtp_datastructures.$cfasl_opcode_template_rule$.getGlobalValue(), rtp_datastructures.CFASL_INPUT_TEMPLATE_RULE);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), rtp_datastructures.$dtp_template_rule$.getGlobalValue(), symbol_function(rtp_datastructures.CFASL_OUTPUT_OBJECT_TEMPLATE_RULE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), rtp_datastructures.$dtp_template_span_item$.getGlobalValue(), symbol_function(rtp_datastructures.TEMPLATE_SPAN_ITEM_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(rtp_datastructures.$list74);
        def_csetf(rtp_datastructures.TEMPLATE_SPAN_ITEM_TEMPLATE_ITEM, rtp_datastructures._CSETF_TEMPLATE_SPAN_ITEM_TEMPLATE_ITEM);
        def_csetf(rtp_datastructures.TEMPLATE_SPAN_ITEM_START, rtp_datastructures._CSETF_TEMPLATE_SPAN_ITEM_START);
        def_csetf(rtp_datastructures.TEMPLATE_SPAN_ITEM_END, rtp_datastructures._CSETF_TEMPLATE_SPAN_ITEM_END);
        identity(rtp_datastructures.TEMPLATE_SPAN_ITEM);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rtp_datastructures.$dtp_template_span_item$.getGlobalValue(), symbol_function(rtp_datastructures.VISIT_DEFSTRUCT_OBJECT_TEMPLATE_SPAN_ITEM_METHOD));
        note_globally_cached_function(rtp_datastructures.DENOTATIONS_OF_CONSTANT);
        note_globally_cached_function(rtp_datastructures.ALL_PHRASES_FILTER_FROM_TERM_PHRASES_CONSTRAINT);
        declare_defglobal(rtp_datastructures.$rtp_rules$);
        declare_defglobal(rtp_datastructures.$template_rules_master_index$);
        register_method($print_object_method_table$.getGlobalValue(), rtp_datastructures.$dtp_categorized_template_rule_set$.getGlobalValue(), symbol_function(rtp_datastructures.CATEGORIZED_TEMPLATE_RULE_SET_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(rtp_datastructures.$list130);
        def_csetf(rtp_datastructures.CATEGORIZED_TEMPLATE_RULE_SET_MENTIONS, rtp_datastructures._CSETF_CATEGORIZED_TEMPLATE_RULE_SET_MENTIONS);
        def_csetf(rtp_datastructures.CATEGORIZED_TEMPLATE_RULE_SET_GENERIC, rtp_datastructures._CSETF_CATEGORIZED_TEMPLATE_RULE_SET_GENERIC);
        def_csetf(rtp_datastructures.CATEGORIZED_TEMPLATE_RULE_SET_KEY_TERMINAL, rtp_datastructures._CSETF_CATEGORIZED_TEMPLATE_RULE_SET_KEY_TERMINAL);
        identity(rtp_datastructures.CATEGORIZED_TEMPLATE_RULE_SET);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rtp_datastructures.$dtp_categorized_template_rule_set$.getGlobalValue(), symbol_function(rtp_datastructures.VISIT_DEFSTRUCT_OBJECT_CATEGORIZED_TEMPLATE_RULE_SET_METHOD));
        note_globally_cached_function(rtp_datastructures.RELEVANT_TEMPLATE_MTS);
        declare_defglobal(rtp_datastructures.$template_mts$);
        register_kb_function(rtp_datastructures.ADD_TEMPLATE_ASSERTION);
        register_kb_function(rtp_datastructures.REMOVE_TEMPLATE_ASSERTION);
        register_method($print_object_method_table$.getGlobalValue(), rtp_datastructures.$dtp_rtp_chart_entry$.getGlobalValue(), symbol_function(rtp_datastructures.RTP_CHART_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(rtp_datastructures.$list198);
        def_csetf(rtp_datastructures.RTP_CHART_ENTRY_START, rtp_datastructures._CSETF_RTP_CHART_ENTRY_START);
        def_csetf(rtp_datastructures.RTP_CHART_ENTRY_END, rtp_datastructures._CSETF_RTP_CHART_ENTRY_END);
        def_csetf(rtp_datastructures.RTP_CHART_ENTRY_RULE, rtp_datastructures._CSETF_RTP_CHART_ENTRY_RULE);
        def_csetf(rtp_datastructures.RTP_CHART_ENTRY_TEMPLATE_INDEX, rtp_datastructures._CSETF_RTP_CHART_ENTRY_TEMPLATE_INDEX);
        def_csetf(rtp_datastructures.RTP_CHART_ENTRY_WORDS, rtp_datastructures._CSETF_RTP_CHART_ENTRY_WORDS);
        def_csetf(rtp_datastructures.RTP_CHART_ENTRY_BINDINGS, rtp_datastructures._CSETF_RTP_CHART_ENTRY_BINDINGS);
        def_csetf(rtp_datastructures.RTP_CHART_ENTRY_SUBCONSTITS, rtp_datastructures._CSETF_RTP_CHART_ENTRY_SUBCONSTITS);
        def_csetf(rtp_datastructures.RTP_CHART_ENTRY_SEM, rtp_datastructures._CSETF_RTP_CHART_ENTRY_SEM);
        identity(rtp_datastructures.RTP_CHART_ENTRY);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rtp_datastructures.$dtp_rtp_chart_entry$.getGlobalValue(), symbol_function(rtp_datastructures.VISIT_DEFSTRUCT_OBJECT_RTP_CHART_ENTRY_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), rtp_datastructures.$dtp_subconstit$.getGlobalValue(), symbol_function(rtp_datastructures.SUBCONSTIT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(rtp_datastructures.$list233);
        def_csetf(rtp_datastructures.SUBCONSTIT_CAT, rtp_datastructures._CSETF_SUBCONSTIT_CAT);
        def_csetf(rtp_datastructures.SUBCONSTIT_STRING, rtp_datastructures._CSETF_SUBCONSTIT_STRING);
        def_csetf(rtp_datastructures.SUBCONSTIT_BINDING_VAR, rtp_datastructures._CSETF_SUBCONSTIT_BINDING_VAR);
        def_csetf(rtp_datastructures.SUBCONSTIT_START, rtp_datastructures._CSETF_SUBCONSTIT_START);
        def_csetf(rtp_datastructures.SUBCONSTIT_END, rtp_datastructures._CSETF_SUBCONSTIT_END);
        def_csetf(rtp_datastructures.SUBCONSTIT_SEM_TEST, rtp_datastructures._CSETF_SUBCONSTIT_SEM_TEST);
        identity(rtp_datastructures.SUBCONSTIT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rtp_datastructures.$dtp_subconstit$.getGlobalValue(), symbol_function(rtp_datastructures.VISIT_DEFSTRUCT_OBJECT_SUBCONSTIT_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        rtp_datastructures.declare_rtp_datastructures_file();
    }

    @Override
    public void initializeVariables() {
        rtp_datastructures.init_rtp_datastructures_file();
    }

    @Override
    public void runTopLevelForms() {
        rtp_datastructures.setup_rtp_datastructures_file();
    }

    static {
    }

    public static final class $template_rule_native extends SubLStructNative {
        public SubLObject $category;

        public SubLObject $template;

        public SubLObject $transformation;

        public SubLObject $sem_test;

        public SubLObject $assertion;

        public SubLObject $terminals;

        public SubLObject $meaning;

        public SubLObject $constraints;

        public SubLObject $id;

        private static final SubLStructDeclNative structDecl;

        public $template_rule_native() {
            rtp_datastructures.$template_rule_native.this.$category = Lisp.NIL;
            rtp_datastructures.$template_rule_native.this.$template = Lisp.NIL;
            rtp_datastructures.$template_rule_native.this.$transformation = Lisp.NIL;
            rtp_datastructures.$template_rule_native.this.$sem_test = Lisp.NIL;
            rtp_datastructures.$template_rule_native.this.$assertion = Lisp.NIL;
            rtp_datastructures.$template_rule_native.this.$terminals = Lisp.NIL;
            rtp_datastructures.$template_rule_native.this.$meaning = Lisp.NIL;
            rtp_datastructures.$template_rule_native.this.$constraints = Lisp.NIL;
            rtp_datastructures.$template_rule_native.this.$id = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return rtp_datastructures.$template_rule_native.this.$category;
        }

        @Override
        public SubLObject getField3() {
            return rtp_datastructures.$template_rule_native.this.$template;
        }

        @Override
        public SubLObject getField4() {
            return rtp_datastructures.$template_rule_native.this.$transformation;
        }

        @Override
        public SubLObject getField5() {
            return rtp_datastructures.$template_rule_native.this.$sem_test;
        }

        @Override
        public SubLObject getField6() {
            return rtp_datastructures.$template_rule_native.this.$assertion;
        }

        @Override
        public SubLObject getField7() {
            return rtp_datastructures.$template_rule_native.this.$terminals;
        }

        @Override
        public SubLObject getField8() {
            return rtp_datastructures.$template_rule_native.this.$meaning;
        }

        @Override
        public SubLObject getField9() {
            return rtp_datastructures.$template_rule_native.this.$constraints;
        }

        @Override
        public SubLObject getField10() {
            return rtp_datastructures.$template_rule_native.this.$id;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return rtp_datastructures.$template_rule_native.this.$category = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return rtp_datastructures.$template_rule_native.this.$template = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return rtp_datastructures.$template_rule_native.this.$transformation = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return rtp_datastructures.$template_rule_native.this.$sem_test = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return rtp_datastructures.$template_rule_native.this.$assertion = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return rtp_datastructures.$template_rule_native.this.$terminals = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return rtp_datastructures.$template_rule_native.this.$meaning = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return rtp_datastructures.$template_rule_native.this.$constraints = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return rtp_datastructures.$template_rule_native.this.$id = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rtp.rtp_datastructures.$template_rule_native.class, rtp_datastructures.TEMPLATE_RULE, rtp_datastructures.TEMPLATE_RULE_P, rtp_datastructures.$list14, rtp_datastructures.$list15, new String[]{ "$category", "$template", "$transformation", "$sem_test", "$assertion", "$terminals", "$meaning", "$constraints", "$id" }, rtp_datastructures.$list16, rtp_datastructures.$list17, rtp_datastructures.PRINT_TEMPLATE_RULE);
        }
    }

    public static final class $template_rule_p$UnaryFunction extends UnaryFunction {
        public $template_rule_p$UnaryFunction() {
            super(extractFunctionNamed("TEMPLATE-RULE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rtp_datastructures.template_rule_p(arg1);
        }
    }

    public static final class $sxhash_template_rule_method$UnaryFunction extends UnaryFunction {
        public $sxhash_template_rule_method$UnaryFunction() {
            super(extractFunctionNamed("SXHASH-TEMPLATE-RULE-METHOD"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rtp_datastructures.sxhash_template_rule_method(arg1);
        }
    }

    public static final class $cfasl_input_template_rule$UnaryFunction extends UnaryFunction {
        public $cfasl_input_template_rule$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-TEMPLATE-RULE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rtp_datastructures.cfasl_input_template_rule(arg1);
        }
    }

    public static final class $template_span_item_native extends SubLStructNative {
        public SubLObject $template_item;

        public SubLObject $start;

        public SubLObject $end;

        private static final SubLStructDeclNative structDecl;

        public $template_span_item_native() {
            rtp_datastructures.$template_span_item_native.this.$template_item = Lisp.NIL;
            rtp_datastructures.$template_span_item_native.this.$start = Lisp.NIL;
            rtp_datastructures.$template_span_item_native.this.$end = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return rtp_datastructures.$template_span_item_native.this.$template_item;
        }

        @Override
        public SubLObject getField3() {
            return rtp_datastructures.$template_span_item_native.this.$start;
        }

        @Override
        public SubLObject getField4() {
            return rtp_datastructures.$template_span_item_native.this.$end;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return rtp_datastructures.$template_span_item_native.this.$template_item = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return rtp_datastructures.$template_span_item_native.this.$start = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return rtp_datastructures.$template_span_item_native.this.$end = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rtp.rtp_datastructures.$template_span_item_native.class, rtp_datastructures.TEMPLATE_SPAN_ITEM, rtp_datastructures.TEMPLATE_SPAN_ITEM_P, rtp_datastructures.$list68, rtp_datastructures.$list69, new String[]{ "$template_item", "$start", "$end" }, rtp_datastructures.$list70, rtp_datastructures.$list71, rtp_datastructures.PRINT_TEMPLATE_SPAN_ITEM);
        }
    }

    public static final class $template_span_item_p$UnaryFunction extends UnaryFunction {
        public $template_span_item_p$UnaryFunction() {
            super(extractFunctionNamed("TEMPLATE-SPAN-ITEM-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rtp_datastructures.template_span_item_p(arg1);
        }
    }

    public static final class $categorized_template_rule_set_native extends SubLStructNative {
        public SubLObject $mentions;

        public SubLObject $generic;

        public SubLObject $key_terminal;

        private static final SubLStructDeclNative structDecl;

        public $categorized_template_rule_set_native() {
            rtp_datastructures.$categorized_template_rule_set_native.this.$mentions = Lisp.NIL;
            rtp_datastructures.$categorized_template_rule_set_native.this.$generic = Lisp.NIL;
            rtp_datastructures.$categorized_template_rule_set_native.this.$key_terminal = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return rtp_datastructures.$categorized_template_rule_set_native.this.$mentions;
        }

        @Override
        public SubLObject getField3() {
            return rtp_datastructures.$categorized_template_rule_set_native.this.$generic;
        }

        @Override
        public SubLObject getField4() {
            return rtp_datastructures.$categorized_template_rule_set_native.this.$key_terminal;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return rtp_datastructures.$categorized_template_rule_set_native.this.$mentions = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return rtp_datastructures.$categorized_template_rule_set_native.this.$generic = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return rtp_datastructures.$categorized_template_rule_set_native.this.$key_terminal = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rtp.rtp_datastructures.$categorized_template_rule_set_native.class, rtp_datastructures.CATEGORIZED_TEMPLATE_RULE_SET, rtp_datastructures.CATEGORIZED_TEMPLATE_RULE_SET_P, rtp_datastructures.$list124, rtp_datastructures.$list125, new String[]{ "$mentions", "$generic", "$key_terminal" }, rtp_datastructures.$list126, rtp_datastructures.$list127, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $categorized_template_rule_set_p$UnaryFunction extends UnaryFunction {
        public $categorized_template_rule_set_p$UnaryFunction() {
            super(extractFunctionNamed("CATEGORIZED-TEMPLATE-RULE-SET-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rtp_datastructures.categorized_template_rule_set_p(arg1);
        }
    }

    public static final SubLSymbol $kw11$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt14 = list(new SubLObject[]{ makeSymbol("CATEGORY"), makeSymbol("TEMPLATE"), makeSymbol("TRANSFORMATION"), makeSymbol("SEM-TEST"), makeSymbol("ASSERTION"), makeSymbol("TERMINALS"), makeSymbol("MEANING"), makeSymbol("CONSTRAINTS"), makeSymbol("ID") });

    static private final SubLList $list_alt15 = list(new SubLObject[]{ makeKeyword("CATEGORY"), makeKeyword("TEMPLATE"), makeKeyword("TRANSFORMATION"), makeKeyword("SEM-TEST"), makeKeyword("ASSERTION"), makeKeyword("TERMINALS"), makeKeyword("MEANING"), makeKeyword("CONSTRAINTS"), makeKeyword("ID") });

    static private final SubLList $list_alt16 = list(new SubLObject[]{ makeSymbol("TEMPLATE-RULE-CATEGORY"), makeSymbol("TEMPLATE-RULE-TEMPLATE"), makeSymbol("TEMPLATE-RULE-TRANSFORMATION"), makeSymbol("TEMPLATE-RULE-SEM-TEST"), makeSymbol("TEMPLATE-RULE-ASSERTION"), makeSymbol("TEMPLATE-RULE-TERMINALS"), makeSymbol("TEMPLATE-RULE-MEANING"), makeSymbol("TEMPLATE-RULE-CONSTRAINTS"), makeSymbol("TEMPLATE-RULE-ID") });

    static private final SubLList $list_alt17 = list(new SubLObject[]{ makeSymbol("_CSETF-TEMPLATE-RULE-CATEGORY"), makeSymbol("_CSETF-TEMPLATE-RULE-TEMPLATE"), makeSymbol("_CSETF-TEMPLATE-RULE-TRANSFORMATION"), makeSymbol("_CSETF-TEMPLATE-RULE-SEM-TEST"), makeSymbol("_CSETF-TEMPLATE-RULE-ASSERTION"), makeSymbol("_CSETF-TEMPLATE-RULE-TERMINALS"), makeSymbol("_CSETF-TEMPLATE-RULE-MEANING"), makeSymbol("_CSETF-TEMPLATE-RULE-CONSTRAINTS"), makeSymbol("_CSETF-TEMPLATE-RULE-ID") });

    public static final class $rtp_chart_entry_p$UnaryFunction extends UnaryFunction {
        public $rtp_chart_entry_p$UnaryFunction() {
            super(extractFunctionNamed("RTP-CHART-ENTRY-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rtp_datastructures.rtp_chart_entry_p(arg1);
        }
    }

    static private final SubLString $str_alt47$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt50$__A_for__S____from_Assertion__S__ = makeString("[~A for ~S~%  from Assertion ~S: ~% => ~S");

    static private final SubLString $str_alt51$___Subject_to_test__S = makeString("~% Subject to test ~S");

    static private final SubLString $str_alt52$___Augmented_Template___S = makeString("~% Augmented Template: ~S");

    static private final SubLString $str_alt53$___Term___S____Const___S = makeString("~% Term: ~S ~% Const: ~S");

    static private final SubLString $str_alt54$___ = makeString("]~%");

    public static final class $subconstit_p$UnaryFunction extends UnaryFunction {
        public $subconstit_p$UnaryFunction() {
            super(extractFunctionNamed("SUBCONSTIT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rtp_datastructures.subconstit_p(arg1);
        }
    }

    static private final SubLList $list_alt62 = list(makeSymbol("TEMPLATE-ITEM"), makeSymbol("START"), makeSymbol("END"));

    static private final SubLList $list_alt63 = list(makeKeyword("TEMPLATE-ITEM"), makeKeyword("START"), makeKeyword("END"));

    static private final SubLList $list_alt64 = list(makeSymbol("TEMPLATE-SPAN-ITEM-TEMPLATE-ITEM"), makeSymbol("TEMPLATE-SPAN-ITEM-START"), makeSymbol("TEMPLATE-SPAN-ITEM-END"));

    static private final SubLList $list_alt65 = list(makeSymbol("_CSETF-TEMPLATE-SPAN-ITEM-TEMPLATE-ITEM"), makeSymbol("_CSETF-TEMPLATE-SPAN-ITEM-START"), makeSymbol("_CSETF-TEMPLATE-SPAN-ITEM-END"));

    static private final SubLString $str_alt77$__S__S__S_ = makeString("<~S ~S ~S>");

    static private final SubLString $str_alt81$_ = makeString(" ");

    static private final SubLString $str_alt84$Left_recursive_template___S__ = makeString("Left-recursive template~%~S~%");

    static private final SubLList $list_alt86 = list(makeKeyword("ABBREVS"), makeKeyword("ACRONYMS"));

    public static final SubLObject $const91$CollectionLexificationPredicate_R = reader_make_constant_shell("CollectionLexificationPredicate-Required");

    static private final SubLList $list_alt94 = list(reader_make_constant_shell("RequireOne"));

    static private final SubLList $list_alt95 = list(reader_make_constant_shell("WordSequence"));

    static private final SubLSymbol $sym97$_FULL_WORD = makeSymbol("?FULL-WORD");

    static private final SubLSymbol $sym98$_FORM = makeSymbol("?FORM");

    static private final SubLList $list_alt100 = list(makeSymbol("?FORM"));

    static private final SubLSymbol $sym101$_WORD = makeSymbol("?WORD");

    static private final SubLList $list_alt103 = list(reader_make_constant_shell("Modal-Contracted"), reader_make_constant_shell("Verb-Contracted"));

    static private final SubLList $list_alt115 = list(makeSymbol("MENTIONS"), makeSymbol("GENERIC"), makeSymbol("KEY-TERMINAL"));

    static private final SubLList $list_alt116 = list(makeKeyword("MENTIONS"), makeKeyword("GENERIC"), makeKeyword("KEY-TERMINAL"));

    static private final SubLList $list_alt117 = list(makeSymbol("CATEGORIZED-TEMPLATE-RULE-SET-MENTIONS"), makeSymbol("CATEGORIZED-TEMPLATE-RULE-SET-GENERIC"), makeSymbol("CATEGORIZED-TEMPLATE-RULE-SET-KEY-TERMINAL"));

    static private final SubLList $list_alt118 = list(makeSymbol("_CSETF-CATEGORIZED-TEMPLATE-RULE-SET-MENTIONS"), makeSymbol("_CSETF-CATEGORIZED-TEMPLATE-RULE-SET-GENERIC"), makeSymbol("_CSETF-CATEGORIZED-TEMPLATE-RULE-SET-KEY-TERMINAL"));

    static private final SubLList $list_alt130 = list(list(makeSymbol("TP-RULE-VAR"), makeSymbol("MT"), makeSymbol("CATEGORY"), makeSymbol("TERMINAL")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym131$CURRENT_MT = makeUninternedSymbol("CURRENT-MT");

    static private final SubLSymbol $sym132$CURRENT_RULE = makeUninternedSymbol("CURRENT-RULE");

    static private final SubLSymbol $sym133$MENTIONS = makeUninternedSymbol("MENTIONS");

    static private final SubLSymbol $sym134$TEMPLATES = makeUninternedSymbol("TEMPLATES");

    static private final SubLList $list_alt144 = list(list(makeSymbol("*ASSUME-EMPTY-ASSOCIATIVE-MEMORY?*"), T));

    static private final SubLSymbol $sym149$STRING_ = makeSymbol("STRING<");

    static private final SubLList $list_alt152 = cons(makeSymbol("TEMPLATE-PRED"), makeSymbol("TEMPLATE-CATEGORIES"));

    static private final SubLString $str_alt153$Gathering_Template_Parsing_Assert = makeString("Gathering Template Parsing Assertions from ");

    static private final SubLString $str_alt154$_mts__ = makeString(" mts (");

    static private final SubLString $str_alt155$_total_ = makeString(" total)");

    static private final SubLString $str_alt156$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    private static final SubLSymbol NEW_TEMPLATE_RULE = makeSymbol("NEW-TEMPLATE-RULE");

    static private final SubLString $str_alt163$Assertion__D_specifies_a_left_rec = makeString("Assertion ~D specifies a left-recursive template~% ~S~%");

    static private final SubLList $list_alt172 = list(reader_make_constant_shell("NLPattern-Agr"), reader_make_constant_shell("NLPattern-POS"));

    public static final SubLObject $const173$TemplateParsingSyntacticConstrain = reader_make_constant_shell("TemplateParsingSyntacticConstraint");

    static private final SubLString $str_alt174$Strange_template_assertion__S_wit = makeString("Strange template assertion ~S with argument ~S ignored.~%");

    static private final SubLList $list_alt181 = list(makeSymbol("START"), makeSymbol("END"), makeSymbol("RULE"), makeSymbol("TEMPLATE-INDEX"), makeSymbol("WORDS"), makeSymbol("BINDINGS"), makeSymbol("SUBCONSTITS"), makeSymbol("SEM"));

    static private final SubLList $list_alt182 = list(makeKeyword("START"), makeKeyword("END"), $RULE, makeKeyword("TEMPLATE-INDEX"), makeKeyword("WORDS"), makeKeyword("BINDINGS"), makeKeyword("SUBCONSTITS"), makeKeyword("SEM"));

    static private final SubLList $list_alt183 = list(makeSymbol("RTP-CHART-ENTRY-START"), makeSymbol("RTP-CHART-ENTRY-END"), makeSymbol("RTP-CHART-ENTRY-RULE"), makeSymbol("RTP-CHART-ENTRY-TEMPLATE-INDEX"), makeSymbol("RTP-CHART-ENTRY-WORDS"), makeSymbol("RTP-CHART-ENTRY-BINDINGS"), makeSymbol("RTP-CHART-ENTRY-SUBCONSTITS"), makeSymbol("RTP-CHART-ENTRY-SEM"));

    static private final SubLList $list_alt184 = list(makeSymbol("_CSETF-RTP-CHART-ENTRY-START"), makeSymbol("_CSETF-RTP-CHART-ENTRY-END"), makeSymbol("_CSETF-RTP-CHART-ENTRY-RULE"), makeSymbol("_CSETF-RTP-CHART-ENTRY-TEMPLATE-INDEX"), makeSymbol("_CSETF-RTP-CHART-ENTRY-WORDS"), makeSymbol("_CSETF-RTP-CHART-ENTRY-BINDINGS"), makeSymbol("_CSETF-RTP-CHART-ENTRY-SUBCONSTITS"), makeSymbol("_CSETF-RTP-CHART-ENTRY-SEM"));

    static private final SubLString $str_alt209$__RTP_entry______Words__S_____Sem = makeString("#<RTP-entry: ~%  Words=~S ~%  Sem=~S~%   Bindings=~S~%   Subconstits=~S~%  Template=~S~%  Template-index=~S~%  Start=~A~% :RTP-Entry>");

    static private final SubLList $list_alt213 = list(makeSymbol("CAT"), makeSymbol("STRING"), makeSymbol("BINDING-VAR"), makeSymbol("START"), makeSymbol("END"), makeSymbol("SEM-TEST"));

    static private final SubLList $list_alt214 = list(makeKeyword("CAT"), makeKeyword("STRING"), makeKeyword("BINDING-VAR"), makeKeyword("START"), makeKeyword("END"), makeKeyword("SEM-TEST"));

    static private final SubLList $list_alt215 = list(makeSymbol("SUBCONSTIT-CAT"), makeSymbol("SUBCONSTIT-STRING"), makeSymbol("SUBCONSTIT-BINDING-VAR"), makeSymbol("SUBCONSTIT-START"), makeSymbol("SUBCONSTIT-END"), makeSymbol("SUBCONSTIT-SEM-TEST"));

    static private final SubLList $list_alt216 = list(makeSymbol("_CSETF-SUBCONSTIT-CAT"), makeSymbol("_CSETF-SUBCONSTIT-STRING"), makeSymbol("_CSETF-SUBCONSTIT-BINDING-VAR"), makeSymbol("_CSETF-SUBCONSTIT-START"), makeSymbol("_CSETF-SUBCONSTIT-END"), makeSymbol("_CSETF-SUBCONSTIT-SEM-TEST"));

    static private final SubLString $str_alt234$__Subconst__S_of_cat__S_ = makeString("<#Subconst ~S of cat ~S>");

    static private final SubLList $list_alt235 = list(reader_make_constant_shell("TheSetOf"), makeSymbol("?X"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Thing")));
}

/**
 * Total time: 1187 ms
 */
