/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.thesaurus;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_return;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.alphanumericp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_upcase;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equalp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.load;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.elt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fifth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nthcdr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.rassoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_length;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.api_control_vars;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.at_vars;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.constant_completion_high;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.gt_modules;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.transcript_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      TM-INTERNALS
 *  source file: /cyc/top/cycl/thesaurus/tm-internals.lisp
 *  created:     2019/07/03 17:38:29
 */
public final class tm_internals extends SubLTranslatedFile implements V02 {
    // // Constructor
    private tm_internals() {
    }

    public static final SubLFile me = new tm_internals();


    // // Definitions
    public static final SubLObject thesaurus_gensymP(SubLObject constant) {
        return isa.isa_in_any_mtP(constant, $$ThesaurusGeneratedTerm);
    }

    public static final SubLObject tm_random_gensym() {
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
                        {
                            SubLObject i = ZERO_INTEGER;
                            SubLObject which = random.random(kb_indexing.num_predicate_extent_index($$preferredTerm, UNPROVIDED));
                            SubLObject pred_var = $$preferredTerm;
                            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
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
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                        {
                                                            SubLObject done_var_1 = result;
                                                            SubLObject token_var_2 = NIL;
                                                            while (NIL == done_var_1) {
                                                                {
                                                                    SubLObject sign = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                                                    SubLObject valid_3 = makeBoolean(token_var_2 != sign);
                                                                    if (NIL != valid_3) {
                                                                        i = add(i, ONE_INTEGER);
                                                                        if (i.numE(which)) {
                                                                            result = tm_datastructures.sign_concept(sign);
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

    /**
     * Return a list of all known thesauri.
     */
    public static final SubLObject all_thesauri() {
        return isa.all_fort_instances(tm_datastructures.$tm_thesaurus_collection$.getGlobalValue(), tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED);
    }

    /**
     * Return a list of all known thesauri, sorted by thesaurus name.
     */
    public static final SubLObject all_thesauri_sorted() {
        {
            SubLObject thesauri = all_thesauri();
            return Sort.sort(thesauri, symbol_function(STRING_LESSP), symbol_function(THESAURUS_NAME));
        }
    }

    public static final SubLObject thesaurusP(SubLObject fort) {
        if (NIL != forts.fort_p(fort)) {
            return kb_mapping_utilities.some_pred_value_in_relevant_mts(fort, tm_datastructures.$tm_thesaurus_pred$.getGlobalValue(), tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject released_thesaurusP(SubLObject thesaurus) {
        if (NIL != forts.fort_p(thesaurus)) {
            return kb_mapping_utilities.some_pred_value_in_relevant_mts(thesaurus, tm_datastructures.$tm_released_thesaurus_pred$.getGlobalValue(), tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Returns a list of thesauri known to be released.
     */
    public static final SubLObject released_thesauri() {
        return list_utilities.remove_if_not(symbol_function($sym7$RELEASED_THESAURUS_), all_thesauri(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns a list of thesauri known to be released, sorted by thesaurus name.
     */
    public static final SubLObject released_thesauri_sorted() {
        {
            SubLObject thesauri = released_thesauri();
            return Sort.sort(thesauri, symbol_function($sym8$TERM__), symbol_function(THESAURUS_NAME));
        }
    }

    /**
     * Return a list of thesauri which have no preferred terms, i.e. are empty
     */
    public static final SubLObject empty_thesauri() {
        {
            SubLObject all_thesauri = all_thesauri();
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = all_thesauri;
            SubLObject thesaurus = NIL;
            for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                if (thesaurus_preferred_term_count(thesaurus).numE(ZERO_INTEGER)) {
                    ans = cons(thesaurus, ans);
                }
            }
            return nreverse(ans);
        }
    }

    /**
     * Return a list of empty thesauri, sorted by thesaurus name.
     */
    public static final SubLObject empty_thesauri_sorted() {
        {
            SubLObject thesauri = empty_thesauri();
            return Sort.sort(thesauri, symbol_function($sym8$TERM__), symbol_function(THESAURUS_NAME));
        }
    }

    /**
     * Return the string which is the name for THESAURUS.
     */
    public static final SubLObject thesaurus_name(SubLObject thesaurus) {
        SubLSystemTrampolineFile.checkType(thesaurus, $sym9$THESAURUS_);
        {
            SubLObject name = kb_mapping_utilities.fpred_value_in_mt(thesaurus, tm_datastructures.$tm_name_pred$.getGlobalValue(), tm_datastructures.$tm_mt$.getGlobalValue(), ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
            return name;
        }
    }

    public static final SubLObject all_thesauri_names() {
        {
            SubLObject all_thesauri = all_thesauri_sorted();
            return Mapping.mapcar(symbol_function(THESAURUS_NAME), all_thesauri);
        }
    }

    /**
     * Return the string which is the abbreviation for THESAURUS.
     */
    public static final SubLObject thesaurus_abbreviation(SubLObject thesaurus) {
        SubLSystemTrampolineFile.checkType(thesaurus, $sym9$THESAURUS_);
        return term_abbreviation(thesaurus, UNPROVIDED);
    }

    /**
     * Return T IFF STRING is a valid name for a thesaurus
     */
    public static final SubLObject valid_thesaurus_nameP(SubLObject string) {
        return makeBoolean((((string.isString() && length(string).numGE(TWO_INTEGER)) && (!string.equalp($$$all))) && (NIL != alphanumericp(Strings.sublisp_char(string, ZERO_INTEGER)))) && (NIL == find_if(symbol_function(INVALID_THESAURUS_NAME_CHAR), string, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject invalid_thesaurus_name_char(SubLObject v_char) {
        return makeBoolean(NIL == valid_thesaurus_name_char(v_char));
    }

    public static final SubLObject valid_thesaurus_name_char(SubLObject v_char) {
        return makeBoolean((NIL != alphanumericp(v_char)) || (NIL != find(v_char, $str_alt12$____, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject thesaurus_constant_from_name(SubLObject thesaurus_name) {
        return tm_datastructures.tm_name_string_lookup(thesaurus_name);
    }

    public static final SubLObject thesaurus_constant_from_abbreviation(SubLObject thesaurus_abbreviation) {
        return tm_datastructures.tm_abbreviation_lookup(thesaurus_abbreviation);
    }

    public static final SubLObject thesaurus_constant_from_string(SubLObject string) {
        {
            SubLObject ans = NIL;
            ans = thesaurus_constant_from_abbreviation(string);
            if (NIL == ans) {
                ans = thesaurus_constant_from_name(string);
            }
            return ans;
        }
    }

    public static final SubLObject thesaurus_load_date(SubLObject thesaurus) {
        SubLSystemTrampolineFile.checkType(thesaurus, $sym9$THESAURUS_);
        return kb_mapping_utilities.fpred_value_in_mt(thesaurus, $$thesaurusLoadDate, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject thesaurus_loader(SubLObject thesaurus) {
        SubLSystemTrampolineFile.checkType(thesaurus, $sym9$THESAURUS_);
        return kb_mapping_utilities.fpred_value_in_mt(thesaurus, $$thesaurusLoadedBy, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject valid_abbreviationP(SubLObject string) {
        return makeBoolean(((string.isString() && (!string.equalp($$$all))) && length(string).numGE(TWO_INTEGER)) && (NIL == list_utilities.find_if_not(symbol_function(ALPHANUMERICP), string, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject term_abbreviation(SubLObject constant, SubLObject inverseP) {
        if (inverseP == UNPROVIDED) {
            inverseP = NIL;
        }
        SubLSystemTrampolineFile.checkType(constant, FORT_P);
        {
            SubLObject ans = NIL;
            if ((NIL != inverseP) && (NIL == isa.isaP(constant, $$SymmetricBinaryPredicate, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED))) {
                ans = kb_mapping_utilities.fpred_value_in_any_mt(constant, $$tmInverseSymbol, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                ans = kb_mapping_utilities.fpred_value_in_any_mt(constant, $$tmSymbol, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL == ans) {
                ans = Strings.string_upcase(constants_high.constant_name(constant), UNPROVIDED, UNPROVIDED);
            }
            return ans;
        }
    }

    /**
     * remove leading and trailing whitespace, and collapse internal whitespace sequences to one space.
     */
    public static final SubLObject canonicalize_lexical_term(SubLObject string) {
        return string_utilities.reduce_whitespace(string);
    }

    /**
     * Returns a list of preferred terms for constant, or NIL.
     * Wrap calls to this function in the appropriate mt selection
     * macro to get the desired effect.
     */
    public static final SubLObject preferred_terms(SubLObject constant) {
        {
            SubLObject v_object = function_terms.naut_to_nart(constant);
            SubLObject ans = NIL;
            if (NIL != forts.valid_fortP(v_object)) {
                ans = kb_mapping_utilities.pred_values(v_object, $$preferredTerm, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return ans;
        }
    }

    /**
     * Returns a list of use fors for constant, or NIL.
     * Wrap calls to this function in the appropriate mt selection
     * macro to get the desired effect.
     */
    public static final SubLObject use_fors(SubLObject constant) {
        {
            SubLObject v_object = function_terms.naut_to_nart(constant);
            SubLObject ans = NIL;
            ans = kb_mapping_utilities.pred_values(v_object, $$useFor, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return ans;
        }
    }

    public static final SubLObject gather_use_fors(SubLObject concepts, SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(thesaurus, thread);
                        ans = Mapping.mapcan(symbol_function(USE_FORS), concepts, EMPTY_SUBL_OBJECT_ARRAY);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     * Return a list of use for strings for CYC-TERM in THESAURUS.
     */
    public static final SubLObject use_fors_in_thesaurus(SubLObject cyc_term, SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(thesaurus, $sym9$THESAURUS_);
            {
                SubLObject fort = function_terms.naut_to_nart(cyc_term);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == forts.fort_p(fort)) {
                        Errors.error($str_alt23$Could_not_coerce__A_to_a_FORT_, cyc_term);
                    }
                }
                return kb_mapping_utilities.pred_values_in_mt(fort, $$useFor, thesaurus, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    /**
     * Return the preferred term string for CYC-TERM in THESAURUS.
     */
    public static final SubLObject pt_in_thesaurus(SubLObject cyc_term, SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(thesaurus, $sym9$THESAURUS_);
            {
                SubLObject fort = function_terms.naut_to_nart(cyc_term);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == forts.fort_p(fort)) {
                        Errors.error($str_alt23$Could_not_coerce__A_to_a_FORT_, cyc_term);
                    }
                }
                return kb_mapping_utilities.fpred_value_in_mt(fort, $$preferredTerm, thesaurus, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    /**
     * Just use the string if CONSTANT is a string.  If all else fails,
     * construct an error message and return that, unless NO-ERROR? is set
     * to T, in which case return the empty string.
     */
    public static final SubLObject tm_string_for_constant(SubLObject constant, SubLObject abbrevP, SubLObject mts, SubLObject no_errorP) {
        if (abbrevP == UNPROVIDED) {
            abbrevP = NIL;
        }
        if (mts == UNPROVIDED) {
            mts = NIL;
        }
        if (no_errorP == UNPROVIDED) {
            no_errorP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mts_to_use = (NIL != mts) ? ((SubLObject) (mts)) : NIL != tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SELECTED_THESAURUS) ? ((SubLObject) (list(tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SELECTED_THESAURUS)))) : tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI);
                SubLObject ans = NIL;
                if (constant.isString()) {
                    ans = constant;
                } else {
                    if (NIL != forts.valid_fortP(constant)) {
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
                                mt_relevance_macros.$relevant_mts$.bind(mts_to_use, thread);
                                if (NIL != abbrevP) {
                                    {
                                        SubLObject abbrev = term_abbreviation(constant, UNPROVIDED);
                                        if (NIL != abbrev) {
                                            ans = abbrev;
                                        }
                                    }
                                }
                                if (NIL == ans) {
                                    {
                                        SubLObject preferred = preferred_terms(constant);
                                        if (NIL != preferred) {
                                            preferred = Sort.sort(preferred, symbol_function(STRING_LESSP), UNPROVIDED);
                                            ans = preferred.first();
                                        }
                                    }
                                }
                                if (NIL == ans) {
                                    {
                                        SubLObject name = kb_mapping_utilities.fpred_value_in_any_mt(constant, tm_datastructures.$tm_name_pred$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        if (NIL != name) {
                                            ans = name;
                                        }
                                    }
                                }
                                if (NIL == ans) {
                                    ans = (NIL != no_errorP) ? ((SubLObject) ($str_alt27$)) : format(NIL, $str_alt28$ERROR___a_Not_a_term_in_the_activ, constants_high.constant_internal_id(constant));
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } else {
                        ans = format(NIL, $str_alt29$_a, constant);
                    }
                }
                {
                    SubLObject pcase_var = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DISPLAY_CASE);
                    if (pcase_var.eql($UPPER)) {
                        ans = Strings.string_upcase(ans, UNPROVIDED, UNPROVIDED);
                    } else
                        if (pcase_var.eql($LOWER)) {
                            ans = Strings.string_downcase(ans, UNPROVIDED, UNPROVIDED);
                        }

                }
                return ans;
            }
        }
    }

    /**
     * thesaurus to use for sorting concepts by preferred term
     */
    // defparameter
    public static final SubLSymbol $tm_sorting_thesaurus$ = makeSymbol("*TM-SORTING-THESAURUS*");

    public static final SubLObject tm_string_for_sorting_search_results(SubLObject thesaurus_concept) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject thesauri_to_use = (NIL != $tm_sorting_thesaurus$.getDynamicValue(thread)) ? ((SubLObject) (list($tm_sorting_thesaurus$.getDynamicValue(thread)))) : intersection(thesauri_of_concept(thesaurus_concept), browsable_thesauri(tm_datastructures.$tm_user$.getDynamicValue(thread), UNPROVIDED), UNPROVIDED, UNPROVIDED);
                SubLObject string = tm_string_for_constant(thesaurus_concept, NIL, thesauri_to_use, T);
                if (string.isString() && length(string).numG(ZERO_INTEGER)) {
                    return string;
                }
                return tm_string_for_constant(thesaurus_concept, NIL, all_thesauri(), T);
            }
        }
    }

    /**
     * If OBJ is a string, returns it; if OBJ is a constant, returns its preferred term
     * string in THESAURUS; if OBJ is a sign, returns the preferred term string of the sign-term; if OBJ is a thesaurus, returns its name.
     */
    public static final SubLObject tm_pt_or_string_in_thesaurus(SubLObject obj, SubLObject thesaurus) {
        if (thesaurus == UNPROVIDED) {
            thesaurus = NIL;
        }
        if (obj.isString()) {
            return obj;
        } else
            if ((NIL != forts.fort_p(obj)) && (NIL != thesaurusP(thesaurus))) {
                return tm_datastructures.concept_term(obj, thesaurus);
            } else
                if ((NIL != tm_datastructures.signp(obj)) && (NIL != thesaurusP(obj))) {
                    return tm_datastructures.concept_term(tm_datastructures.sign_term(obj), thesaurus);
                } else
                    if (NIL != thesaurusP(obj)) {
                        return thesaurus_name(obj);
                    } else {
                        Errors.error($str_alt33$Can_t_handle__A, obj);
                    }



        return NIL;
    }

    public static final SubLObject tm_select_relation(SubLObject relation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject constant = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        constant = ((NIL != forts.valid_fortP(relation)) && (NIL != genl_predicates.genl_predP(relation, $$broaderTerm, UNPROVIDED, UNPROVIDED))) ? ((SubLObject) (relation)) : $$broaderTerm;
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return constant;
            }
        }
    }

    public static final SubLObject bt_1(SubLObject constant, SubLObject relation, SubLObject active_relations, SubLObject all_spec_preds, SubLObject relations_to_use, SubLObject relation_term_indices) {
        if (active_relations == UNPROVIDED) {
            active_relations = NIL;
        }
        if (all_spec_preds == UNPROVIDED) {
            all_spec_preds = NIL;
        }
        if (relations_to_use == UNPROVIDED) {
            relations_to_use = NIL;
        }
        if (relation_term_indices == UNPROVIDED) {
            relation_term_indices = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        if (NIL == relations_to_use) {
                            relation_term_indices = NIL;
                            if (NIL == active_relations) {
                                active_relations = tm_active_relations();
                            }
                            if (NIL == all_spec_preds) {
                                all_spec_preds = genl_predicates.all_spec_predicates(relation, UNPROVIDED, UNPROVIDED);
                            }
                            relations_to_use = intersection(active_relations, all_spec_preds, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject cdolist_list_var = relations_to_use;
                    SubLObject r = NIL;
                    for (r = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , r = cdolist_list_var.first()) {
                        {
                            SubLObject index_arg = ONE_INTEGER;
                            SubLObject gather_arg = TWO_INTEGER;
                            if (NIL != relation_term_indices) {
                                if (relation_term_indices.first().eql(TWO_INTEGER)) {
                                    index_arg = TWO_INTEGER;
                                    gather_arg = ONE_INTEGER;
                                }
                                relation_term_indices = relation_term_indices.rest();
                            }
                            ans = union(ans, kb_mapping_utilities.pred_values(constant, r, index_arg, gather_arg, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
                return ans;
            }
        }
    }

    /**
     * Return constant's immediate broader terms, using relation and all of
     * its spec relations.  If active-relations are specified, then only
     * currently active relations are used.
     */
    public static final SubLObject bt(SubLObject constant, SubLObject relation, SubLObject mts, SubLObject active_relations, SubLObject all_spec_preds, SubLObject relations_to_use, SubLObject relation_term_indices) {
        if (relation == UNPROVIDED) {
            relation = $$broaderTerm;
        }
        if (mts == UNPROVIDED) {
            mts = NIL;
        }
        if (active_relations == UNPROVIDED) {
            active_relations = NIL;
        }
        if (all_spec_preds == UNPROVIDED) {
            all_spec_preds = NIL;
        }
        if (relations_to_use == UNPROVIDED) {
            relations_to_use = NIL;
        }
        if (relation_term_indices == UNPROVIDED) {
            relation_term_indices = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (mts.isCons()) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
                            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
                            relation = tm_select_relation(relation);
                            ans = bt_1(constant, relation, active_relations, all_spec_preds, relations_to_use, relation_term_indices);
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else
                    if ((NIL != forts.valid_fortP(mts)) && (NIL != isa.isa_in_any_mtP(mts, $$Microtheory))) {
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                mt_relevance_macros.$mt$.bind(mts, thread);
                                relation = tm_select_relation(relation);
                                ans = bt_1(constant, relation, active_relations, all_spec_preds, relations_to_use, relation_term_indices);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } else {
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                relation = tm_select_relation(relation);
                                ans = bt_1(constant, relation, active_relations, all_spec_preds, relations_to_use, relation_term_indices);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }

                return ans;
            }
        }
    }

    public static final SubLObject nt_1(SubLObject constant, SubLObject relation, SubLObject active_relations, SubLObject all_spec_preds, SubLObject relations_to_use, SubLObject relation_term_indices) {
        if (active_relations == UNPROVIDED) {
            active_relations = NIL;
        }
        if (all_spec_preds == UNPROVIDED) {
            all_spec_preds = NIL;
        }
        if (relations_to_use == UNPROVIDED) {
            relations_to_use = NIL;
        }
        if (relation_term_indices == UNPROVIDED) {
            relation_term_indices = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        if (NIL == relations_to_use) {
                            relation_term_indices = NIL;
                            if (NIL == active_relations) {
                                active_relations = tm_active_relations();
                            }
                            if (NIL == all_spec_preds) {
                                all_spec_preds = genl_predicates.all_spec_predicates(relation, UNPROVIDED, UNPROVIDED);
                            }
                            relations_to_use = intersection(active_relations, all_spec_preds, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject cdolist_list_var = relations_to_use;
                    SubLObject r = NIL;
                    for (r = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , r = cdolist_list_var.first()) {
                        {
                            SubLObject index_arg = TWO_INTEGER;
                            SubLObject gather_arg = ONE_INTEGER;
                            if (NIL != relation_term_indices) {
                                if (relation_term_indices.first().eql(ONE_INTEGER)) {
                                    index_arg = ONE_INTEGER;
                                    gather_arg = TWO_INTEGER;
                                }
                                relation_term_indices = relation_term_indices.rest();
                            }
                            ans = union(ans, kb_mapping_utilities.pred_values(constant, r, index_arg, gather_arg, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
                return ans;
            }
        }
    }

    /**
     * Return constant's immediate narrower terms
     */
    public static final SubLObject nt(SubLObject constant, SubLObject relation, SubLObject mts, SubLObject active_relations, SubLObject all_spec_preds, SubLObject relations_to_use, SubLObject relation_term_indices) {
        if (relation == UNPROVIDED) {
            relation = $$broaderTerm;
        }
        if (mts == UNPROVIDED) {
            mts = NIL;
        }
        if (active_relations == UNPROVIDED) {
            active_relations = NIL;
        }
        if (all_spec_preds == UNPROVIDED) {
            all_spec_preds = NIL;
        }
        if (relations_to_use == UNPROVIDED) {
            relations_to_use = NIL;
        }
        if (relation_term_indices == UNPROVIDED) {
            relation_term_indices = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (mts.isCons()) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
                            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
                            relation = tm_select_relation(relation);
                            ans = nt_1(constant, relation, active_relations, all_spec_preds, relations_to_use, relation_term_indices);
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else
                    if ((NIL != forts.valid_fortP(mts)) && (NIL != isa.isa_in_any_mtP(mts, $$Microtheory))) {
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                mt_relevance_macros.$mt$.bind(mts, thread);
                                relation = tm_select_relation(relation);
                                ans = nt_1(constant, relation, active_relations, all_spec_preds, relations_to_use, relation_term_indices);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } else {
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                relation = tm_select_relation(relation);
                                ans = nt_1(constant, relation, active_relations, all_spec_preds, relations_to_use, relation_term_indices);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }

                return ans;
            }
        }
    }

    /**
     * Returns T IFF NT-CYC-TERM has BT-CYC-TERM as a broader term in THESAURUS.
     */
    public static final SubLObject btP(SubLObject nt_cyc_term, SubLObject bt_cyc_term, SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(thesaurus, $sym9$THESAURUS_);
            {
                SubLObject nt_fort = function_terms.naut_to_nart(nt_cyc_term);
                SubLObject bt_fort = function_terms.naut_to_nart(bt_cyc_term);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == forts.fort_p(nt_fort)) {
                        Errors.error($str_alt23$Could_not_coerce__A_to_a_FORT_, nt_cyc_term);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == forts.fort_p(bt_fort)) {
                        Errors.error($str_alt23$Could_not_coerce__A_to_a_FORT_, bt_cyc_term);
                    }
                }
                return gt_modules.broader_termP(nt_fort, bt_fort, thesaurus);
            }
        }
    }

    /**
     * Return the total number of preferred terms in THESAURUS
     */
    public static final SubLObject thesaurus_preferred_term_count(SubLObject thesaurus) {
        SubLSystemTrampolineFile.checkType(thesaurus, FORT_P);
        return kb_indexing.num_predicate_extent_index($$preferredTerm, thesaurus);
    }

    /**
     * Return the total number of use fors in THESAURUS
     */
    public static final SubLObject thesaurus_use_for_count(SubLObject thesaurus, SubLObject filter) {
        if (filter == UNPROVIDED) {
            filter = NIL;
        }
        SubLSystemTrampolineFile.checkType(thesaurus, FORT_P);
        {
            SubLObject total = ZERO_INTEGER;
            if (NIL == tm_filterP(filter)) {
                total = kb_indexing.num_predicate_extent_index($$useFor, thesaurus);
            } else {
                {
                    SubLObject relations_to_use_after_filtering = NIL;
                    SubLObject poss_relation = NIL;
                    {
                        SubLObject cdolist_list_var = tm_relations_to_output_as_this_according_to_filter($$$UF, filter, UNPROVIDED);
                        SubLObject rel_symbol = NIL;
                        for (rel_symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rel_symbol = cdolist_list_var.first()) {
                            poss_relation = relation_constant_from_abbreviation(rel_symbol);
                            if (NIL != thesaurus_predicateP(poss_relation)) {
                                {
                                    SubLObject item_var = poss_relation;
                                    if (NIL == member(item_var, relations_to_use_after_filtering, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        relations_to_use_after_filtering = cons(item_var, relations_to_use_after_filtering);
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = relations_to_use_after_filtering;
                        SubLObject relation = NIL;
                        for (relation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relation = cdolist_list_var.first()) {
                            total = add(total, kb_indexing.num_predicate_extent_index(relation, thesaurus));
                        }
                    }
                }
            }
            return total;
        }
    }

    /**
     * Return the total number of scope notes in THESAURUS
     */
    public static final SubLObject thesaurus_scope_note_count(SubLObject thesaurus, SubLObject filter) {
        if (filter == UNPROVIDED) {
            filter = NIL;
        }
        SubLSystemTrampolineFile.checkType(thesaurus, FORT_P);
        {
            SubLObject total = ZERO_INTEGER;
            if (NIL == tm_filterP(filter)) {
                total = kb_indexing.num_predicate_extent_index($$scopeNote, thesaurus);
            } else {
                {
                    SubLObject relations_to_use_after_filtering = NIL;
                    SubLObject poss_relation = NIL;
                    {
                        SubLObject cdolist_list_var = tm_relations_to_output_as_this_according_to_filter($$$SN, filter, UNPROVIDED);
                        SubLObject rel_symbol = NIL;
                        for (rel_symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rel_symbol = cdolist_list_var.first()) {
                            poss_relation = relation_constant_from_abbreviation(rel_symbol);
                            if (NIL != thesaurus_predicateP(poss_relation)) {
                                {
                                    SubLObject item_var = poss_relation;
                                    if (NIL == member(item_var, relations_to_use_after_filtering, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        relations_to_use_after_filtering = cons(item_var, relations_to_use_after_filtering);
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = relations_to_use_after_filtering;
                        SubLObject relation = NIL;
                        for (relation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relation = cdolist_list_var.first()) {
                            total = add(total, kb_indexing.num_predicate_extent_index(relation, thesaurus));
                        }
                    }
                }
            }
            return total;
        }
    }

    /**
     * Return the total number of related term links in THESAURUS.
     */
    public static final SubLObject thesaurus_related_term_count(SubLObject thesaurus, SubLObject filter) {
        if (filter == UNPROVIDED) {
            filter = NIL;
        }
        SubLSystemTrampolineFile.checkType(thesaurus, FORT_P);
        {
            SubLObject total = ZERO_INTEGER;
            if (NIL == tm_filterP(filter)) {
                total = kb_indexing.num_predicate_extent_index($$relatedTerm, thesaurus);
            } else {
                {
                    SubLObject relations_to_use_after_filtering = NIL;
                    SubLObject poss_relation = NIL;
                    {
                        SubLObject cdolist_list_var = tm_relations_to_output_as_this_according_to_filter($$$RT, filter, UNPROVIDED);
                        SubLObject rel_symbol = NIL;
                        for (rel_symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rel_symbol = cdolist_list_var.first()) {
                            poss_relation = relation_constant_from_abbreviation(rel_symbol);
                            if (NIL != thesaurus_predicateP(poss_relation)) {
                                {
                                    SubLObject item_var = poss_relation;
                                    if (NIL == member(item_var, relations_to_use_after_filtering, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        relations_to_use_after_filtering = cons(item_var, relations_to_use_after_filtering);
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = relations_to_use_after_filtering;
                        SubLObject relation = NIL;
                        for (relation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relation = cdolist_list_var.first()) {
                            total = add(total, kb_indexing.num_predicate_extent_index(relation, thesaurus));
                        }
                    }
                }
            }
            return total;
        }
    }

    /**
     * Return the count of non-bookkeeping assertions in THESAURUS
     */
    public static final SubLObject tm_thesaurus_assertion_count(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total_count = kb_indexing.num_mt_index(thesaurus);
                SubLObject ignore_preds = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        ignore_preds = isa.all_fort_instances($$ThesaurusBookkeepingPredicate, NIL, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject cdolist_list_var = ignore_preds;
                    SubLObject ignore_pred = NIL;
                    for (ignore_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ignore_pred = cdolist_list_var.first()) {
                        total_count = subtract(total_count, kb_indexing.num_predicate_extent_index(ignore_pred, thesaurus));
                    }
                }
                return total_count;
            }
        }
    }

    /**
     * Returns the count of non-bookkeeping assertions across all thesauri.
     */
    public static final SubLObject tm_all_thesauri_assertion_count() {
        {
            SubLObject total_count = ZERO_INTEGER;
            SubLObject cdolist_list_var = all_thesauri();
            SubLObject thesaurus = NIL;
            for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                total_count = add(total_count, tm_thesaurus_assertion_count(thesaurus));
            }
            return total_count;
        }
    }

    /**
     * Returns the total count in thesaurus of all lexical relation uses except for
     * those using the lexical relations given in the list lexical relations-to-omit.
     */
    public static final SubLObject tm_thesaurus_lexical_assertion_count(SubLObject thesaurus, SubLObject lexical_relations_to_omit, SubLObject filter) {
        if (lexical_relations_to_omit == UNPROVIDED) {
            lexical_relations_to_omit = NIL;
        }
        if (filter == UNPROVIDED) {
            filter = NIL;
        }
        SubLSystemTrampolineFile.checkType(thesaurus, FORT_P);
        {
            SubLObject relations = remove_duplicates(set_difference(tm_lexpreds_from_kb(), lexical_relations_to_omit, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject total = ZERO_INTEGER;
            if (NIL == tm_filterP(filter)) {
                {
                    SubLObject cdolist_list_var = relations;
                    SubLObject relation = NIL;
                    for (relation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relation = cdolist_list_var.first()) {
                        total = add(total, kb_indexing.num_predicate_extent_index(relation, thesaurus));
                    }
                }
            } else {
                {
                    SubLObject relations_to_use_after_filtering = NIL;
                    SubLObject poss_relation = NIL;
                    {
                        SubLObject cdolist_list_var = relations;
                        SubLObject relation = NIL;
                        for (relation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relation = cdolist_list_var.first()) {
                            {
                                SubLObject cdolist_list_var_5 = tm_relations_to_output_as_this_according_to_filter(tm_pred_arg_symbol(relation, ONE_INTEGER), filter, UNPROVIDED);
                                SubLObject rel_symbol = NIL;
                                for (rel_symbol = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , rel_symbol = cdolist_list_var_5.first()) {
                                    poss_relation = relation_constant_from_abbreviation(rel_symbol);
                                    if (NIL != thesaurus_predicateP(poss_relation)) {
                                        {
                                            SubLObject item_var = poss_relation;
                                            if (NIL == member(item_var, relations_to_use_after_filtering, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                relations_to_use_after_filtering = cons(item_var, relations_to_use_after_filtering);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = relations_to_use_after_filtering;
                        SubLObject relation = NIL;
                        for (relation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relation = cdolist_list_var.first()) {
                            total = add(total, kb_indexing.num_predicate_extent_index(relation, thesaurus));
                        }
                    }
                }
            }
            return total;
        }
    }

    /**
     * Returns the total count in thesauri of all lexical relation uses except for
     * those using the lexical relations given in the list lexical relations-to-omit.
     */
    public static final SubLObject tm_thesauri_lexical_assertion_count(SubLObject thesauri, SubLObject lexical_relations_to_omit) {
        if (lexical_relations_to_omit == UNPROVIDED) {
            lexical_relations_to_omit = NIL;
        }
        {
            SubLObject total = ZERO_INTEGER;
            SubLObject cdolist_list_var = thesauri;
            SubLObject thesaurus = NIL;
            for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                total = add(total, tm_thesaurus_lexical_assertion_count(thesaurus, lexical_relations_to_omit, UNPROVIDED));
            }
            return total;
        }
    }

    /**
     * Special variable used by TM-COUNT-CONCEPTS
     */
    // defparameter
    private static final SubLSymbol $tm_count_concepts_table$ = makeSymbol("*TM-COUNT-CONCEPTS-TABLE*");

    /**
     * Return the total number of concepts used across all thesauri
     */
    public static final SubLObject tm_count_concepts() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = NIL;
                {
                    SubLObject _prev_bind_0 = $tm_count_concepts_table$.currentBinding(thread);
                    try {
                        $tm_count_concepts_table$.bind(make_hash_table(kb_indexing.num_predicate_extent_index($$preferredTerm, NIL), UNPROVIDED, UNPROVIDED), thread);
                        {
                            SubLObject _prev_bind_0_6 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                kb_mapping.map_predicate_extent_index(symbol_function(TM_COUNT_CONCEPTS_INTERNAL), $$preferredTerm, $TRUE, UNPROVIDED);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_6, thread);
                            }
                        }
                        v_answer = hash_table_count($tm_count_concepts_table$.getDynamicValue(thread));
                    } finally {
                        $tm_count_concepts_table$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_answer;
            }
        }
    }

    public static final SubLObject tm_count_concepts_internal(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject concept = assertions_high.gaf_arg1(assertion);
                if (NIL == gethash(concept, $tm_count_concepts_table$.getDynamicValue(thread), UNPROVIDED)) {
                    sethash(concept, $tm_count_concepts_table$.getDynamicValue(thread), T);
                }
            }
            return NIL;
        }
    }

    /**
     * Return the count of preferredTerm assertions in THESAURUS added by USER
     */
    public static final SubLObject tm_user_term_count(SubLObject user, SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                        mt_relevance_macros.$mt$.bind(thesaurus, thread);
                        {
                            SubLObject pred_var = $$preferredTerm;
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
                                                            SubLObject done_var_7 = NIL;
                                                            SubLObject token_var_8 = NIL;
                                                            while (NIL == done_var_7) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_8);
                                                                    SubLObject valid_9 = makeBoolean(token_var_8 != assertion);
                                                                    if (NIL != valid_9) {
                                                                        if (NIL != assertions_high.asserted_assertionP(assertion)) {
                                                                            {
                                                                                SubLObject cyclist = assertions_high.asserted_by(assertion);
                                                                                if ((NIL != cyclist) && (cyclist == user)) {
                                                                                    total = add(total, ONE_INTEGER);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_7 = makeBoolean(NIL == valid_9);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_10, thread);
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
                return total;
            }
        }
    }

    /**
     * Return the count of assertions in THESAURUS added by USER
     */
    public static final SubLObject tm_user_assertion_count(SubLObject user, SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding(thread);
                    SubLObject _prev_bind_1 = control_vars.$mapping_target$.currentBinding(thread);
                    try {
                        control_vars.$mapping_answer$.bind(ZERO_INTEGER, thread);
                        control_vars.$mapping_target$.bind(user, thread);
                        {
                            SubLObject _prev_bind_0_11 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1_12 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                                mt_relevance_macros.$mt$.bind(thesaurus, thread);
                                kb_mapping.map_mt_index(symbol_function(TM_USER_ASSERTION_COUNT_INTERNAL), thesaurus, UNPROVIDED, UNPROVIDED);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1_12, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_11, thread);
                            }
                        }
                        ans = control_vars.$mapping_answer$.getDynamicValue(thread);
                    } finally {
                        control_vars.$mapping_target$.rebind(_prev_bind_1, thread);
                        control_vars.$mapping_answer$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static final SubLObject tm_user_assertion_count_internal(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != assertions_high.asserted_assertionP(assertion)) {
                {
                    SubLObject cyclist = assertions_high.asserted_by(assertion);
                    if ((NIL != cyclist) && (cyclist == control_vars.$mapping_target$.getDynamicValue(thread))) {
                        control_vars.$mapping_answer$.setDynamicValue(add(control_vars.$mapping_answer$.getDynamicValue(thread), ONE_INTEGER), thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject relation_constant_from_abbreviation(SubLObject relation_abbreviation) {
        return second(assoc(relation_abbreviation, tm_datastructures.$tm_relation_predicate_map$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED));
    }

    public static final SubLObject relation_term_arg(SubLObject relation) {
        return third(find(relation, tm_datastructures.$tm_relation_predicate_map$.getGlobalValue(), symbol_function(EQUALP), symbol_function(SECOND), UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject relation_term_arg_from_abbreviation(SubLObject relation_abbreviation) {
        return third(assoc(relation_abbreviation, tm_datastructures.$tm_relation_predicate_map$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED));
    }

    public static final SubLObject relation_value_arg(SubLObject relation) {
        if (relation_term_arg(relation).eql(ONE_INTEGER)) {
            return TWO_INTEGER;
        } else {
            return ONE_INTEGER;
        }
    }

    public static final SubLObject relation_value_arg_from_abbreviation(SubLObject relation_abbreviation) {
        if (relation_term_arg_from_abbreviation(relation_abbreviation) == ONE_INTEGER) {
            return TWO_INTEGER;
        } else {
            return ONE_INTEGER;
        }
    }

    /**
     * Return the symbol to use for ARG of PREDICATE
     * ARG is either 1 or 2
     * PREDICATE is a thesaurus predicate.
     * I.e. (tm-pred-arg-symbol #$broaderTerm 2) => NT
     */
    public static final SubLObject tm_pred_arg_symbol(SubLObject predicate, SubLObject arg) {
        {
            SubLObject info_list = NIL;
            SubLObject info = NIL;
            for (info_list = member(predicate, tm_datastructures.$tm_relation_predicate_map$.getGlobalValue(), symbol_function(EQ), symbol_function(SECOND)), info = info_list.first(); NIL != info_list; info_list = member(predicate, info_list.rest(), symbol_function(EQ), symbol_function(SECOND)) , info = info_list.first()) {
                if (arg.eql(third(info))) {
                    return info.first();
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_pred_symbol_L(SubLObject symbol1, SubLObject symbol2) {
        {
            SubLObject pos1 = tm_io.position_in_pred_symbol_sort_order(symbol1);
            SubLObject pos2 = tm_io.position_in_pred_symbol_sort_order(symbol2);
            if (pos1.isInteger()) {
                if (pos2.isInteger()) {
                    return numL(pos1, pos2);
                } else {
                    return T;
                }
            } else {
                if (pos2.isInteger()) {
                    return NIL;
                } else {
                    return Strings.string_lessp(symbol1, symbol2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
    }

    public static final SubLObject tm_transitive_active_relation_constants() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject constants = tm_active_relations();
                            SubLObject cdolist_list_var = constants;
                            SubLObject c = NIL;
                            for (c = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , c = cdolist_list_var.first()) {
                                if (NIL != isa.isaP(c, $$TransitiveBinaryPredicate, UNPROVIDED, UNPROVIDED)) {
                                    ans = cons(c, ans);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static final SubLObject tm_transitive_active_relation_names() {
        {
            SubLObject constants = tm_transitive_active_relation_constants();
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = constants;
            SubLObject c = NIL;
            for (c = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , c = cdolist_list_var.first()) {
                ans = cons(rassoc(bq_cons(c, $list_alt48), tm_datastructures.$tm_relation_predicate_map$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED).first(), ans);
            }
            return Sort.sort(copy_list(ans), symbol_function($sym49$TM_PRED_SYMBOL__), UNPROVIDED);
        }
    }

    public static final SubLObject mark_graphable_spec_preds_int(SubLObject relation_name, SubLObject names, SubLObject table) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == gethash(relation_name, table, UNPROVIDED)) {
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject form = assoc(relation_name, tm_datastructures.$tm_relation_predicate_map$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED);
                            SubLObject constant = second(form);
                            SubLObject arg_index = third(form);
                            SubLObject spec_preds = remove(constant, genl_predicates.all_spec_predicates(constant, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject cdolist_list_var = spec_preds;
                            SubLObject pred = NIL;
                            for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                                {
                                    SubLObject name = rassoc(list(pred, arg_index), tm_datastructures.$tm_relation_predicate_map$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED).first();
                                    if (NIL != find(name, names, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                        sethash(name, table, T);
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
            return NIL;
        }
    }

    public static final SubLObject mark_graphable_spec_preds(SubLObject relation_names) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            tm_datastructures.clear_utility_tables(tm_datastructures.$tm_user$.getDynamicValue(thread));
            {
                SubLObject table = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UTILITY_TABLE_1);
                SubLObject cdolist_list_var = relation_names;
                SubLObject name = NIL;
                for (name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , name = cdolist_list_var.first()) {
                    mark_graphable_spec_preds_int(name, relation_names, table);
                }
                return hash_table_utilities.hash_table_keys(table);
            }
        }
    }

    public static final SubLObject tm_classify_type(SubLObject type) {
        {
            SubLObject pcase_var = type;
            if (pcase_var.eql($$Thing) || pcase_var.eql($$CycLReifiableDenotationalTerm)) {
                return $CONSTANT;
            } else
                if ((pcase_var.eql($$CharacterString) || pcase_var.eql($$SubLString)) || pcase_var.eql($$ProperNameString)) {
                    return $STRING;
                } else
                    if (pcase_var.eql($$SubLList)) {
                        return $LIST;
                    } else
                        if (pcase_var.eql($$List)) {
                            return $LIST;
                        } else {
                            return $UNKNOWN;
                        }



        }
    }

    public static final SubLObject tm_relation_argtype(SubLObject relation, SubLObject arg) {
        return tm_classify_type(kb_accessors.argn_isa(relation, arg, tm_datastructures.$tm_mt$.getGlobalValue()).first());
    }

    public static final SubLObject tm_relation_arg1type(SubLObject relation) {
        return tm_classify_type(kb_accessors.arg1_isa(relation, UNPROVIDED).first());
    }

    public static final SubLObject tm_relation_arg2type(SubLObject relation) {
        return tm_classify_type(kb_accessors.arg2_isa(relation, UNPROVIDED).first());
    }

    /**
     * Returns a list of all predicates, active and inactive, that can be used in the Thesaurus Manager.
     */
    public static final SubLObject thesaurus_predicates() {
        return isa.all_fort_instances($$ThesaurusContentPredicate, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED);
    }

    /**
     * Returns T IFF PREDICATE is a #$ThesaurusContentPredicate.
     */
    public static final SubLObject thesaurus_predicateP(SubLObject predicate) {
        return isa.isaP(predicate, $$ThesaurusContentPredicate, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED);
    }

    /**
     * Return all active thesaurus relations.
     */
    public static final SubLObject tm_active_relations() {
        return kb_mapping_utilities.pred_refs_in_mt(tm_datastructures.$tm_unary_active_pred$.getGlobalValue(), tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return T IFF CONSTANT is an active thesaurus relation.
     */
    public static final SubLObject tm_active_relation_p(SubLObject constant) {
        return kb_mapping_utilities.pred_u_v_holds_in_mt(tm_datastructures.$tm_unary_active_pred$.getGlobalValue(), constant, constant, tm_datastructures.$tm_mt$.getGlobalValue(), ONE_INTEGER, ONE_INTEGER, UNPROVIDED);
    }

    /**
     * Returns T iff CONSTANT is an inactive thesaurus relation.
     */
    public static final SubLObject tm_inactive_relation_p(SubLObject constant) {
        return makeBoolean((NIL != thesaurus_predicateP(constant)) && (NIL == tm_active_relation_p(constant)));
    }

    /**
     * Returns a sorted list of the symbols for the active thesaurus relations.
     */
    public static final SubLObject tm_active_relation_symbols_sorted() {
        {
            SubLObject v_answer = NIL;
            SubLObject cdolist_list_var = tm_datastructures.$tm_relation_predicate_map$.getGlobalValue();
            SubLObject relation_spec = NIL;
            for (relation_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relation_spec = cdolist_list_var.first()) {
                {
                    SubLObject predicate = second(relation_spec);
                    SubLObject symbol = relation_spec.first();
                    if (NIL != tm_active_relation_p(predicate)) {
                        {
                            SubLObject item_var = symbol;
                            if (NIL == member(item_var, v_answer, symbol_function(EQL), symbol_function(IDENTITY))) {
                                v_answer = cons(item_var, v_answer);
                            }
                        }
                    }
                }
            }
            v_answer = remove_duplicates(v_answer, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return Sort.sort(v_answer, symbol_function($sym49$TM_PRED_SYMBOL__), UNPROVIDED);
        }
    }

    /**
     * Returns a sorted list of the symbols for the inactive relations.
     */
    public static final SubLObject tm_inactive_relation_symbols_sorted() {
        {
            SubLObject v_answer = NIL;
            SubLObject cdolist_list_var = tm_datastructures.$tm_relation_predicate_map$.getGlobalValue();
            SubLObject relation_spec = NIL;
            for (relation_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relation_spec = cdolist_list_var.first()) {
                {
                    SubLObject predicate = second(relation_spec);
                    SubLObject symbol = relation_spec.first();
                    if (NIL == tm_active_relation_p(predicate)) {
                        {
                            SubLObject item_var = symbol;
                            if (NIL == member(item_var, v_answer, symbol_function(EQL), symbol_function(IDENTITY))) {
                                v_answer = cons(item_var, v_answer);
                            }
                        }
                    }
                }
            }
            return Sort.sort(v_answer, symbol_function($sym49$TM_PRED_SYMBOL__), UNPROVIDED);
        }
    }

    public static final SubLObject all_relation_symbols_in_order() {
        {
            SubLObject v_answer = NIL;
            SubLObject cdolist_list_var = tm_datastructures.$tm_relation_predicate_map$.getGlobalValue();
            SubLObject relation_spec = NIL;
            for (relation_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relation_spec = cdolist_list_var.first()) {
                {
                    SubLObject item_var = relation_spec.first();
                    if (NIL == member(item_var, v_answer, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                        v_answer = cons(item_var, v_answer);
                    }
                }
            }
            v_answer = Sort.sort(v_answer, symbol_function(STRING_LESSP), UNPROVIDED);
            return Sort.stable_sort(v_answer, symbol_function($sym49$TM_PRED_SYMBOL__), UNPROVIDED);
        }
    }

    /**
     * Produces an ordered list of the active relation symbols minus their inverses.
     */
    public static final SubLObject tm_active_relation_symbols_sorted_no_inverse() {
        {
            SubLObject v_answer = NIL;
            SubLObject cdolist_list_var = tm_datastructures.$tm_relation_predicate_map$.getGlobalValue();
            SubLObject relation_spec = NIL;
            for (relation_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relation_spec = cdolist_list_var.first()) {
                {
                    SubLObject predicate = second(relation_spec);
                    SubLObject symbol = relation_spec.first();
                    SubLObject inverse = inverse_relation(symbol);
                    if ((NIL != tm_active_relation_p(predicate)) && (NIL == subl_promotions.memberP(inverse, v_answer, symbol_function(EQUALP), UNPROVIDED))) {
                        {
                            SubLObject item_var = symbol;
                            if (NIL == member(item_var, v_answer, symbol_function(EQL), symbol_function(IDENTITY))) {
                                v_answer = cons(item_var, v_answer);
                            }
                        }
                    }
                }
            }
            v_answer = remove_duplicates(v_answer, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return Sort.sort(v_answer, symbol_function($sym49$TM_PRED_SYMBOL__), UNPROVIDED);
        }
    }

    /**
     * Produces an ordered list of the inactive relation symbols without their inverses.
     */
    public static final SubLObject tm_inactive_relation_symbols_sorted_no_inverse() {
        {
            SubLObject v_answer = NIL;
            SubLObject cdolist_list_var = tm_datastructures.$tm_relation_predicate_map$.getGlobalValue();
            SubLObject relation_spec = NIL;
            for (relation_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relation_spec = cdolist_list_var.first()) {
                {
                    SubLObject predicate = second(relation_spec);
                    SubLObject symbol = relation_spec.first();
                    SubLObject inverse = inverse_relation(symbol);
                    if (!((NIL != tm_active_relation_p(predicate)) || (NIL != member(inverse, v_answer, symbol_function(EQUALP), UNPROVIDED)))) {
                        {
                            SubLObject item_var = symbol;
                            if (NIL == member(item_var, v_answer, symbol_function(EQL), symbol_function(IDENTITY))) {
                                v_answer = cons(item_var, v_answer);
                            }
                        }
                    }
                }
            }
            v_answer = remove_duplicates(v_answer, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return Sort.sort(v_answer, symbol_function($sym49$TM_PRED_SYMBOL__), UNPROVIDED);
        }
    }

    /**
     * Returns a list of lexical predicates according to the KB.
     */
    public static final SubLObject tm_lexpreds_from_kb() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lexpreds = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(tm_datastructures.$tm_mt$.getGlobalValue(), thread);
                        lexpreds = kb_mapping_utilities.pred_refs(tm_datastructures.$tm_lexical_predicate_pred$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return lexpreds;
            }
        }
    }

    /**
     * Return T iff PREDICATE is meant to link an underlying concept to a lexical string
     */
    public static final SubLObject tm_lexical_predicateP(SubLObject predicate) {
        return kb_mapping_utilities.some_pred_value_in_relevant_mts(predicate, tm_datastructures.$tm_lexical_predicate_pred$.getGlobalValue(), tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject tm_documentation_predicateP(SubLObject predicate) {
        return kb_mapping_utilities.some_pred_value_in_relevant_mts(predicate, tm_datastructures.$tm_doc_pred_pred$.getGlobalValue(), tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject tm_url_predicateP(SubLObject predicate) {
        return kb_mapping_utilities.some_pred_value_in_relevant_mts(predicate, tm_datastructures.$tm_url_pred_pred$.getGlobalValue(), tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return T iff PREDICATE is meant to link two underlying concepts (constants) not strings
     */
    public static final SubLObject tm_concept_predicateP(SubLObject predicate) {
        if (NIL != tm_lexical_predicateP(predicate)) {
            return NIL;
        } else
            if (NIL != tm_documentation_predicateP(predicate)) {
                return NIL;
            } else
                if (NIL != tm_url_predicateP(predicate)) {
                    return NIL;
                } else
                    if (NIL != tm_bookkeeping_predicateP(predicate)) {
                        return NIL;
                    } else
                        if ((tm_relation_argtype(predicate, ONE_INTEGER) == $STRING) || (tm_relation_argtype(predicate, TWO_INTEGER) == $STRING)) {
                            return NIL;
                        } else
                            if ((tm_relation_argtype(predicate, ONE_INTEGER) == $CONSTANT) && (tm_relation_argtype(predicate, TWO_INTEGER) == $CONSTANT)) {
                                return T;
                            } else {
                                return NIL;
                            }





    }

    /**
     * Return T iff PREDICATE is a thesaurus bookkeeping predicate
     */
    public static final SubLObject tm_bookkeeping_predicateP(SubLObject predicate) {
        SubLSystemTrampolineFile.checkType(predicate, FORT_P);
        return cached_tm_bookkeeping_predicateP(predicate);
    }

    // deflexical
    private static final SubLSymbol $cached_tm_bookkeeping_predicateP_caching_state$ = makeSymbol("*CACHED-TM-BOOKKEEPING-PREDICATE?-CACHING-STATE*");

    public static final SubLObject clear_cached_tm_bookkeeping_predicateP() {
        {
            SubLObject cs = $cached_tm_bookkeeping_predicateP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_cached_tm_bookkeeping_predicateP(SubLObject predicate) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_tm_bookkeeping_predicateP_caching_state$.getGlobalValue(), list(predicate), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cached_tm_bookkeeping_predicateP_internal(SubLObject predicate) {
        return isa.isa_in_any_mtP(predicate, $$ThesaurusBookkeepingPredicate);
    }

    public static final SubLObject cached_tm_bookkeeping_predicateP(SubLObject predicate) {
        {
            SubLObject caching_state = $cached_tm_bookkeeping_predicateP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym63$CACHED_TM_BOOKKEEPING_PREDICATE_, $sym64$_CACHED_TM_BOOKKEEPING_PREDICATE__CACHING_STATE_, NIL, EQL, ONE_INTEGER, $int$100);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, $kw66$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw66$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(cached_tm_bookkeeping_predicateP_internal(predicate)));
                    memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static final SubLObject tm_classify_format(SubLObject relation_abbreviation) {
        {
            SubLObject relation = relation_constant_from_abbreviation(relation_abbreviation);
            SubLSystemTrampolineFile.checkType(relation, FORT_P);
            {
                SubLObject term_format = kb_accessors.argn_format(relation, relation_term_arg_from_abbreviation(relation_abbreviation), tm_datastructures.$tm_mt$.getGlobalValue()).first();
                SubLObject value_format = kb_accessors.argn_format(relation, relation_value_arg_from_abbreviation(relation_abbreviation), tm_datastructures.$tm_mt$.getGlobalValue()).first();
                if (term_format == $$singleEntryFormatInArgs) {
                    if (value_format == $$singleEntryFormatInArgs) {
                        return $ONE_TO_ONE;
                    } else {
                        return $ONE_TO_MANY;
                    }
                } else {
                    if (value_format == $$singleEntryFormatInArgs) {
                        return $MANY_TO_ONE;
                    } else {
                        return $MANY_TO_MANY;
                    }
                }
            }
        }
    }

    public static final SubLObject symmetric_relP(SubLObject relation_abbreviation) {
        {
            SubLObject constant = relation_constant_from_abbreviation(relation_abbreviation);
            return kb_accessors.symmetric_predicateP(constant);
        }
    }

    public static final SubLObject asymmetric_relP(SubLObject relation_abbreviation) {
        {
            SubLObject constant = relation_constant_from_abbreviation(relation_abbreviation);
            return kb_accessors.asymmetric_predicateP(constant);
        }
    }

    public static final SubLObject transitive_relP(SubLObject relation_abbreviation) {
        {
            SubLObject constant = relation_constant_from_abbreviation(relation_abbreviation);
            return kb_accessors.transitive_predicateP(constant);
        }
    }

    public static final SubLObject reflexive_relP(SubLObject relation_abbreviation) {
        {
            SubLObject constant = relation_constant_from_abbreviation(relation_abbreviation);
            return kb_accessors.reflexive_predicateP(constant);
        }
    }

    public static final SubLObject irreflexive_relP(SubLObject relation_abbreviation) {
        {
            SubLObject constant = relation_constant_from_abbreviation(relation_abbreviation);
            return kb_accessors.irreflexive_predicateP(constant);
        }
    }

    public static final SubLObject inverse_relation(SubLObject relation_abbreviation) {
        {
            SubLObject constant = relation_constant_from_abbreviation(relation_abbreviation);
            SubLObject term_arg = relation_term_arg_from_abbreviation(relation_abbreviation);
            if (term_arg == ONE_INTEGER) {
                return tm_pred_arg_symbol(constant, TWO_INTEGER);
            } else {
                return tm_pred_arg_symbol(constant, ONE_INTEGER);
            }
        }
    }

    public static final SubLObject narrower_relations(SubLObject relation_abbreviation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(tm_datastructures.$tm_mt$.getGlobalValue(), thread);
                        {
                            SubLObject constant = relation_constant_from_abbreviation(relation_abbreviation);
                            SubLObject term_arg = relation_term_arg_from_abbreviation(relation_abbreviation);
                            SubLObject spec_preds = remove(constant, kb_mapping_utilities.pred_values(constant, $$genlPreds, TWO_INTEGER, ONE_INTEGER, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject spec_inverse_preds = remove(constant, kb_mapping_utilities.pred_values(constant, $$genlInverse, TWO_INTEGER, ONE_INTEGER, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            {
                                SubLObject cdolist_list_var = spec_preds;
                                SubLObject spec_pred = NIL;
                                for (spec_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec_pred = cdolist_list_var.first()) {
                                    if (NIL != symmetric_relP(relation_abbreviation)) {
                                        {
                                            SubLObject spec_abbrev = tm_pred_arg_symbol(spec_pred, ONE_INTEGER);
                                            SubLObject spec_abbrev_inv = tm_pred_arg_symbol(spec_pred, TWO_INTEGER);
                                            if (NIL != spec_abbrev) {
                                                {
                                                    SubLObject item_var = spec_abbrev;
                                                    if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                        result = cons(item_var, result);
                                                    }
                                                }
                                            }
                                            if (NIL != spec_abbrev_inv) {
                                                {
                                                    SubLObject item_var = spec_abbrev_inv;
                                                    if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                        result = cons(item_var, result);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        {
                                            SubLObject item_var = tm_pred_arg_symbol(spec_pred, term_arg);
                                            if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                result = cons(item_var, result);
                                            }
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject cdolist_list_var = spec_inverse_preds;
                                SubLObject spec_inverse_pred = NIL;
                                for (spec_inverse_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec_inverse_pred = cdolist_list_var.first()) {
                                    if (NIL != symmetric_relP(relation_abbreviation)) {
                                        {
                                            SubLObject spec_inv_abbrev = tm_pred_arg_symbol(spec_inverse_pred, ONE_INTEGER);
                                            SubLObject spec_inv_abbrev_inv = tm_pred_arg_symbol(spec_inverse_pred, TWO_INTEGER);
                                            if (NIL != spec_inv_abbrev) {
                                                {
                                                    SubLObject item_var = spec_inv_abbrev;
                                                    if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                        result = cons(item_var, result);
                                                    }
                                                }
                                            }
                                            if (NIL != spec_inv_abbrev_inv) {
                                                {
                                                    SubLObject item_var = spec_inv_abbrev_inv;
                                                    if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                        result = cons(item_var, result);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        {
                                            SubLObject item_var = (term_arg == ONE_INTEGER) ? ((SubLObject) (tm_pred_arg_symbol(spec_inverse_pred, TWO_INTEGER))) : tm_pred_arg_symbol(spec_inverse_pred, ONE_INTEGER);
                                            if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                result = cons(item_var, result);
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
                return result;
            }
        }
    }

    public static final SubLObject broader_relations(SubLObject relation_abbreviation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(tm_datastructures.$tm_mt$.getGlobalValue(), thread);
                        {
                            SubLObject constant = relation_constant_from_abbreviation(relation_abbreviation);
                            SubLObject term_arg = relation_term_arg_from_abbreviation(relation_abbreviation);
                            SubLObject genl_preds = remove(constant, kb_mapping_utilities.pred_values(constant, $$genlPreds, ONE_INTEGER, TWO_INTEGER, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject genl_inverse_preds = remove(constant, kb_mapping_utilities.pred_values(constant, $$genlInverse, ONE_INTEGER, TWO_INTEGER, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            {
                                SubLObject cdolist_list_var = genl_preds;
                                SubLObject genl_pred = NIL;
                                for (genl_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl_pred = cdolist_list_var.first()) {
                                    if (NIL != thesaurus_predicateP(genl_pred)) {
                                        if (NIL != isa.isaP(genl_pred, $$SymmetricBinaryPredicate, UNPROVIDED, UNPROVIDED)) {
                                            {
                                                SubLObject item_var = tm_pred_arg_symbol(genl_pred, ONE_INTEGER);
                                                if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                    result = cons(item_var, result);
                                                }
                                            }
                                        } else {
                                            {
                                                SubLObject item_var = tm_pred_arg_symbol(genl_pred, term_arg);
                                                if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                    result = cons(item_var, result);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject cdolist_list_var = genl_inverse_preds;
                                SubLObject genl_inverse_pred = NIL;
                                for (genl_inverse_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl_inverse_pred = cdolist_list_var.first()) {
                                    if (NIL != thesaurus_predicateP(genl_inverse_pred)) {
                                        {
                                            SubLObject item_var = (term_arg == ONE_INTEGER) ? ((SubLObject) (tm_pred_arg_symbol(genl_inverse_pred, TWO_INTEGER))) : tm_pred_arg_symbol(genl_inverse_pred, ONE_INTEGER);
                                            if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                result = cons(item_var, result);
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
                return result;
            }
        }
    }

    /**
     * Hackish.  Not guaranteed to find the most general one; maybe good enough for interface defaults.
     */
    public static final SubLObject max_broader_relation(SubLObject relation_abbreviation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject max = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(tm_datastructures.$tm_mt$.getGlobalValue(), thread);
                        {
                            SubLObject constant = relation_constant_from_abbreviation(relation_abbreviation);
                            SubLObject genl_preds = genl_predicates.all_genl_preds(constant, UNPROVIDED, UNPROVIDED);
                            SubLObject term_arg = relation_term_arg_from_abbreviation(relation_abbreviation);
                            if (NIL == max) {
                                {
                                    SubLObject csome_list_var = genl_preds;
                                    SubLObject pred = NIL;
                                    for (pred = csome_list_var.first(); !((NIL != max) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , pred = csome_list_var.first()) {
                                        if ((NIL == remove(pred, genl_predicates.all_genl_preds(pred, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != tm_active_relation_p(pred))) {
                                            max = tm_pred_arg_symbol(pred, term_arg);
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
                return max;
            }
        }
    }

    public static final SubLObject relation_documentation(SubLObject constant) {
        {
            SubLObject docs = replace_variable_length_matches($list_alt74, kb_mapping_utilities.fpred_value_in_mt(constant, $$comment, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED), CHAR_return);
            if (NIL != docs) {
                return string_utilities.trim_whitespace(docs);
            } else {
                return docs;
            }
        }
    }

    /**
     * Replaces every sequence of characters from character-bag in string-to-prune with exactly one occurence
     * of replacement-char.
     */
    public static final SubLObject replace_variable_length_matches(SubLObject character_bag, SubLObject string_to_prune, SubLObject replacement_char) {
        if (NIL == string_to_prune) {
            return NIL;
        }
        if (!character_bag.isList()) {
            Errors.error($str_alt76$The_third_argument_to_remove_vari);
        }
        if (!string_to_prune.isString()) {
            Errors.error($str_alt77$The_second_argument_to_remove_var);
        }
        if (!replacement_char.isChar()) {
            Errors.error($str_alt78$The_third_argument_to_remove_vari);
        }
        if (NIL != character_bag) {
            {
                SubLObject arg_string_length = length(string_to_prune);
                SubLObject result_string = Strings.make_string(arg_string_length, UNPROVIDED);
                SubLObject result_index = ZERO_INTEGER;
                SubLObject last_char_in_list_and_added = NIL;
                SubLObject n = NIL;
                for (n = ZERO_INTEGER; n.numL(arg_string_length); n = add(n, ONE_INTEGER)) {
                    if (NIL != subl_promotions.memberP(aref(string_to_prune, n), character_bag, UNPROVIDED, UNPROVIDED)) {
                        if (NIL == last_char_in_list_and_added) {
                            set_aref(result_string, result_index, replacement_char);
                            result_index = add(ONE_INTEGER, result_index);
                            last_char_in_list_and_added = T;
                        }
                    } else {
                        set_aref(result_string, result_index, aref(string_to_prune, n));
                        result_index = add(ONE_INTEGER, result_index);
                        last_char_in_list_and_added = NIL;
                    }
                }
                return subseq(result_string, ZERO_INTEGER, result_index);
            }
        } else {
            return string_utilities.copy_string(string_to_prune);
        }
    }

    /**
     * Returns a subset of ((:many :many) (:many :one) (:one :many) (:one :one))
     * depending on how these relation properties constrain the argformats.
     */
    public static final SubLObject cardinality_possibilities_for_relation(SubLObject relation_name) {
        {
            SubLObject constant = relation_constant_from_abbreviation(relation_name);
            SubLObject relation_type = NIL;
            SubLObject arg1_type = NIL;
            SubLObject arg2_type = NIL;
            SubLObject symmetricP = NIL;
            if (NIL == forts.valid_fortP(constant)) {
                Errors.error($str_alt79$No_thesaurus_relation_found_for_r, relation_name);
            }
            if (NIL != tm_lexical_predicateP(constant)) {
                relation_type = $LEXICAL;
            } else
                if (NIL != tm_url_predicateP(constant)) {
                    relation_type = $URL;
                } else
                    if (NIL != tm_documentation_predicateP(constant)) {
                        relation_type = $DOCUMENTATION;
                    }


            if (tm_relation_argtype(constant, relation_term_arg_from_abbreviation(relation_name)).eql($CONSTANT)) {
                arg1_type = $PT;
            } else {
                arg1_type = $NON_PT;
            }
            if (tm_relation_argtype(constant, relation_value_arg_from_abbreviation(relation_name)).eql($CONSTANT)) {
                arg2_type = $PT;
            } else {
                arg2_type = $NON_PT;
            }
            if (NIL != kb_accessors.symmetric_predicateP(constant)) {
                symmetricP = T;
            }
            return cardinality_possibilities_for_relation_props(relation_type, arg1_type, arg2_type, symmetricP);
        }
    }

    /**
     * Type should be one of :hierarchical, :lexical, :documentation, :url, :custom, nil
     * To determine what values to pass in
     * If lexical-predicate? -> :lexical
     * tm-documentation-predicate? -> :documentation
     * tm-url-predicate? -> :url
     * arg1-type and arg2-type should be one of :pt or :non-pt
     * To determine what values to pass in
     * (pif (eql (tm-relation-argtype (relation-constant-from-abbreviation relation-name)
     * (relation-term-arg-from-abbreviation relation-name))
     * :constant)
     * (arg1-type :pt)
     * (arg1-type :non-pt))
     * (pif (eql (tm-relation-argtype (relation-constant-from-abbreviation relation-name)
     * (relation-term-arg-from-abbreviation relation-name))
     * :constant)
     * (arg2-type :pt)
     * (arg2-type :non-pt))
     * symmetric: should be T or nil.
     * If relation-type is :lexical :documentation or :url
     * then symmetric will always be treated as nil.
     * Value Returned:
     * This function returns a list of the form
     * ((arg1format arg2format) ...)
     * which is a subset of
     * ((:many :many) (:many :one) (:one :many) (:one :one))
     * depending on how these relation properties constrain the argformats.
     */
    public static final SubLObject cardinality_possibilities_for_relation_props(SubLObject relation_type, SubLObject arg1_type, SubLObject arg2_type, SubLObject symmetricP) {
        if (symmetricP == UNPROVIDED) {
            symmetricP = NIL;
        }
        {
            SubLObject many_to_many = $list_alt85;
            SubLObject many_to_one = $list_alt86;
            SubLObject one_to_many = $list_alt87;
            SubLObject one_to_one = $list_alt88;
            SubLObject possibilities = NIL;
            if (!(arg1_type.eql($PT) || arg2_type.eql($PT))) {
                Errors.error($str_alt89$__Illegal_Argument_Combination__N);
            }
            if ($LEXICAL.eql(relation_type)) {
                possibilities = list(many_to_many, many_to_one, one_to_many, one_to_one);
            } else
                if (arg2_type.eql($NON_PT)) {
                    possibilities = list(many_to_one, many_to_many);
                } else
                    if (arg1_type.eql($NON_PT)) {
                        possibilities = list(one_to_many, many_to_many);
                    } else {
                        possibilities = list(many_to_many, many_to_one, one_to_many, one_to_one);
                    }


            if ((((NIL != symmetricP) && (!relation_type.eql($LEXICAL))) && (!relation_type.eql($DOCUMENTATION))) && (!relation_type.eql($URL))) {
                if (arg1_type.eql(arg2_type)) {
                    possibilities = delete(one_to_many, delete(many_to_one, possibilities, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    Errors.error($str_alt90$__Symmetric__was_true_but_arg_typ);
                }
            }
            return possibilities;
        }
    }

    /**
     * Used in the filtering internals for showing a
     * relation should not be output
     */
    // defconstant
    private static final SubLSymbol $tm_filter_do_not_output$ = makeSymbol("*TM-FILTER-DO-NOT-OUTPUT*");

    /**
     * Used in the filtering internals for showing a
     * relation should be output as is.
     */
    // defconstant
    private static final SubLSymbol $tm_filter_output_as_is$ = makeSymbol("*TM-FILTER-OUTPUT-AS-IS*");

    /**
     * Used in the filtering internals for showing a field
     * of a relation mapping should take the default value.
     */
    // defconstant
    private static final SubLSymbol $tm_filter_default$ = makeSymbol("*TM-FILTER-DEFAULT*");

    /**
     * Number used for default size of filter table.
     */
    // defconstant
    private static final SubLSymbol $tm_default_num_filters$ = makeSymbol("*TM-DEFAULT-NUM-FILTERS*");

    /**
     * Minimum number of entries a filter map
     * is created with.
     */
    // defconstant
    private static final SubLSymbol $tm_minimum_num_entries_per_filter$ = makeSymbol("*TM-MINIMUM-NUM-ENTRIES-PER-FILTER*");

    // defvar
    private static final SubLSymbol $tm_filter_maps$ = makeSymbol("*TM-FILTER-MAPS*");

    // defparameter
    private static final SubLSymbol $tm_filter_maps_lock$ = makeSymbol("*TM-FILTER-MAPS-LOCK*");

    /**
     * Returns T iff object is a thesaurus manager filter
     */
    public static final SubLObject tm_filterP(SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && (NIL != isa.isaP(v_object, $$TMOutputFilter, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED)));
    }

    /**
     * Preconditions: either (tm-filter? filter-or-filter-info) => T or (tm-filter-info? filter-or-filter-info) => T
     * or (null filter-or-filter-info) => T
     * either (null user-filter-info)=>T or (tm-filter-info? user-filter-info)=>T
     * (listp thesauri)=>T and for each member ?X of thesauri (thesaurus? ?X)=>T
     * (member mode '(:advanced :basic nil)) => T
     * (member editing-enabled? '(nil T)) => T
     * either (null user-constant) => T or ((stringp user-name) and user-name refers to a user)
     * (member type-of-filtering '(nil :output :display)) => T
     * Postconditions:  Value returned is nil if no filtering should be done else the
     * value returned is the filter or filter-info value that should be used
     * for filtering.
     * Description:  Parameterized accessor for filter to use and whether filtering should be done.
     */
    public static final SubLObject tm_use_filteringP(SubLObject filter_or_filter_info, SubLObject user_filter_info, SubLObject thesauri, SubLObject mode, SubLObject editing_enabledP, SubLObject user_name, SubLObject type_of_filtering) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != filter_or_filter_info) {
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!((NIL != tm_filterP(filter_or_filter_info)) || (NIL != tm_filter_infoP(filter_or_filter_info)))) {
                        Errors.error($str_alt96$_A_is_not_of_type_tm_filter__or_t, filter_or_filter_info);
                    }
                }
            }
            if (NIL != user_filter_info) {
                SubLSystemTrampolineFile.checkType(user_filter_info, $sym97$TM_FILTER_INFO_);
            }
            SubLSystemTrampolineFile.checkType(thesauri, LISTP);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == member(mode, $list_alt99, UNPROVIDED, UNPROVIDED)) {
                    Errors.error($str_alt100$_A_is_not_a_recognized_mode, mode);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == member(editing_enabledP, $list_alt101, UNPROVIDED, UNPROVIDED)) {
                    Errors.error($str_alt102$_A_is_not_a_valid_choice_for_the_, editing_enabledP);
                }
            }
            if (NIL != user_name) {
                SubLSystemTrampolineFile.checkType(user_name, STRINGP);
            } else {
                return NIL;
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == member(type_of_filtering, $list_alt104, UNPROVIDED, UNPROVIDED)) {
                    Errors.error($str_alt105$_A_is_not_a_valid_type_of_filter_, type_of_filtering);
                }
            }
            if ((!type_of_filtering.eql($OUTPUT)) && mode.eql($ADVANCED)) {
                return NIL;
            } else
                if (!length(thesauri).eql(ONE_INTEGER)) {
                    return NIL;
                } else
                    if ((((mode.eql($BASIC) && tm_datastructures.tm_value(user_name, $FILTER_IN_BASIC).eql($ON)) && type_of_filtering.eql($DISPLAY)) && (NIL != thesauri.first())) && (NIL != tm_default_display_filter(thesauri.first()))) {
                        return tm_default_display_filter(thesauri.first());
                    } else
                        if (tm_datastructures.tm_value(user_name, $FILTER_IN_BASIC).eql($OFF) && mode.eql($BASIC)) {
                            return NIL;
                        } else
                            if ((NIL != editing_enabledP) && (!type_of_filtering.eql($OUTPUT))) {
                                return NIL;
                            } else
                                if ((NIL != user_filter_info) && tm_get_filter_info_entry(user_filter_info, $kw113$USE_FILTER_).eql(T)) {
                                    return user_filter_info;
                                } else
                                    if ((NIL != tm_filter_infoP(filter_or_filter_info)) && tm_get_filter_info_entry(filter_or_filter_info, $kw113$USE_FILTER_).eql(T)) {
                                        return filter_or_filter_info;
                                    } else
                                        if ((type_of_filtering.eql($DISPLAY) && (NIL != thesauri.first())) && (NIL != tm_default_display_filter(thesauri.first()))) {
                                            return tm_default_display_filter(thesauri.first());
                                        } else
                                            if ((type_of_filtering.eql($OUTPUT) && (NIL != thesauri.first())) && (NIL != tm_default_output_filter(thesauri.first()))) {
                                                return tm_default_output_filter(thesauri.first());
                                            } else {
                                                return NIL;
                                            }








        }
    }

    /**
     * preconditions: (tm-filter? filter) => T
     * Description: Returns the name of filter.
     */
    public static final SubLObject tm_filter_name(SubLObject filter) {
        SubLSystemTrampolineFile.checkType(filter, $sym114$TM_FILTER_);
        return kb_mapping_utilities.fpred_value_in_mt(filter, tm_datastructures.$tm_name_pred$.getGlobalValue(), tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Preconditions: (stringp filter-name) => T
     * Postconditions: Either the returned value is NIL, or
     * (tm-filter? <RETURNED-VALUE>)
     * Description:  If there is a filter with filter-name then that filter
     * is returned, else nil.
     */
    public static final SubLObject tm_filter_from_name(SubLObject filter_name) {
        SubLSystemTrampolineFile.checkType(filter_name, STRINGP);
        {
            SubLObject filter = tm_datastructures.tm_name_string_lookup(filter_name);
            if (NIL != tm_filterP(filter)) {
                return filter;
            } else {
                return NIL;
            }
        }
    }

    /**
     * Preconditions: (tm-filter? filter) => T
     * Postconditions:  filter has been reinitialized including all sources
     * of knowledge that the filter uses, e.g. KB information.  The filter-map
     * returned by tm-make-filter-current will be updated as the filter is updated.
     * It is not advisable to use the map directly.  Use the tm-get-copy-of-filter-info method
     * for obtaining a stable copy and the relevant accessors for using it or simply use the
     * access methods for filters to always use the up to date version.
     * Description:  Reinitializes or Initializes a Thesaurus Manager filter
     * with all current information.  Returns the filter-map
     * for filter.
     */
    public static final SubLObject tm_make_filter_current(SubLObject filter) {
        SubLSystemTrampolineFile.checkType(filter, $sym114$TM_FILTER_);
        tm_make_filter_current_int(filter);
        return tm_get_filter_map(filter);
    }

    /**
     * Preconditions: either (tm-filter? filter-or-filter-info) => T or (tm-filter-info? filter-or-filter-info) => T
     * (cor (stringp relation-symbol) (null relation-symbol))
     * Postconditions:  All Relations That should be output according to Filter to a string identical to
     * Relation-Symbol by test  are returned in a list.  In addition relation-symbol may
     * be included if filter does not know about it and the current default for relations
     * that aren't known by filter is to return them as they are.
     * Description:  Returns a list of the relations that are filtered to relation-symbol.
     */
    public static final SubLObject tm_relations_to_output_as_this_according_to_filter(SubLObject relation_symbol, SubLObject filter_or_filter_info, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUALP);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != tm_filterP(filter_or_filter_info)) || (NIL != tm_filter_infoP(filter_or_filter_info)))) {
                    Errors.error($str_alt96$_A_is_not_of_type_tm_filter__or_t, filter_or_filter_info);
                }
            }
            {
                SubLObject relations_to_output_as_this = tm_map_over_filter_map_entries(filter_or_filter_info, symbol_function(TM_SAME_RELATION_NAME), list(relation_symbol, test));
                SubLObject rel_symbol = tm_output_as_relation_according_to_filter(relation_symbol, filter_or_filter_info);
                if (rel_symbol.equalp(relation_symbol)) {
                    {
                        SubLObject item_var = rel_symbol;
                        if (NIL == member(item_var, relations_to_output_as_this, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                            relations_to_output_as_this = cons(item_var, relations_to_output_as_this);
                        }
                    }
                }
                return relations_to_output_as_this;
            }
        }
    }

    /**
     * Preconditions:  (stringp relation-symbol) => T
     * map-info is constructed as <map-info> described below
     * test is a function called on two objects.
     * Postcondtions:  If compare-name is the same according to test as the relation-filtered value of map-info,
     * then relation-symbol is returned else nil.
     * Description:  Used for mapping by tm-relations-to-output-as-this-according-to-filter.
     */
    public static final SubLObject tm_same_relation_name(SubLObject relation_symbol, SubLObject map_info, SubLObject compare_name, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUALP);
        }
        {
            SubLObject filtered_name = tm_get_mapping_info_symbol_to_output(map_info);
            if ($tm_filter_default$.getGlobalValue() == filtered_name) {
                filtered_name = tm_relation_name_default(relation_symbol);
            } else
                if ($tm_filter_do_not_output$.getGlobalValue() == filtered_name) {
                    filtered_name = NIL;
                } else
                    if ($tm_filter_output_as_is$.getGlobalValue() == filtered_name) {
                        filtered_name = relation_symbol;
                    }


            if (NIL != funcall(test, filtered_name, compare_name)) {
                return relation_symbol;
            } else {
                return NIL;
            }
        }
    }

    /**
     * Preconditions: either (tm-filter? filter-or-filter-info) => T or (tm-filter-info? filter-or-filter-info) => T
     * (stringp print-name) => T
     * Postconditions:  All Relations That should be output according to Filter to a string identical to
     * Print-Name by test  are returned in a list.
     * Description:  Returns a list of the relations that are printed with print-name.
     */
    public static final SubLObject tm_relations_to_output_with_this_print_name(SubLObject print_name, SubLObject filter_or_filter_info, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUALP);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != tm_filterP(filter_or_filter_info)) || (NIL != tm_filter_infoP(filter_or_filter_info)))) {
                    Errors.error($str_alt96$_A_is_not_of_type_tm_filter__or_t, filter_or_filter_info);
                }
            }
            SubLSystemTrampolineFile.checkType(print_name, STRINGP);
            {
                SubLObject relations_to_output_with_name = tm_map_over_filter_map_entries(filter_or_filter_info, symbol_function(TM_SAME_PRINT_NAME), list(print_name, test));
                SubLObject rel_symbol = (NIL != thesaurus_predicateP(relation_constant_from_abbreviation(print_name))) ? ((SubLObject) (tm_output_with_print_name_according_to_filter(print_name, filter_or_filter_info))) : NIL;
                if (rel_symbol.equalp(print_name)) {
                    {
                        SubLObject item_var = rel_symbol;
                        if (NIL == member(item_var, relations_to_output_with_name, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                            relations_to_output_with_name = cons(item_var, relations_to_output_with_name);
                        }
                    }
                }
                return relations_to_output_with_name;
            }
        }
    }

    /**
     * Preconditions:  (stringp relation-symbol) => T
     * map-info is constructed as <map-info> described below
     * (stringp compare-name)
     * test is a function called on two strings.
     * Postcondtions:  If compare-name is the same according to test as the print-name of map-info,
     * then relation-symbol is returned else nil.
     * Description:  Used for mapping by tm-relations-to-output-with-this-print-name.
     */
    public static final SubLObject tm_same_print_name(SubLObject relation_symbol, SubLObject map_info, SubLObject compare_name, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUALP);
        }
        {
            SubLObject print_name = tm_get_mapping_info_print_name(map_info);
            if ($tm_filter_default$.getGlobalValue() == print_name) {
                print_name = tm_print_name_default(relation_symbol);
            }
            if (NIL != funcall(test, print_name, compare_name)) {
                return relation_symbol;
            } else {
                return NIL;
            }
        }
    }

    /**
     * Preconditions: either (tm-filter? filter-or-filter-info) => T or (tm-filter-info? filter-or-filter-info) => T
     * Postconditions:  All Relations That Have information stored in filter are returned in a list.
     * Description:  Returns a list of the relations that have filter information stored on filter.
     */
    public static final SubLObject tm_relations_with_filter_information(SubLObject filter_or_filter_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != tm_filterP(filter_or_filter_info)) || (NIL != tm_filter_infoP(filter_or_filter_info)))) {
                    Errors.error($str_alt96$_A_is_not_of_type_tm_filter__or_t, filter_or_filter_info);
                }
            }
            return tm_map_over_filter_map_entries(filter_or_filter_info, symbol_function(TM_COLLECT_RELATION_KEYS_FROM_FILTER), UNPROVIDED);
        }
    }

    /**
     * Preconditions:  (stringp relation-symbol) => T
     * Postcondtions:  Returns relation-symbol.
     * Description:  Used for mapping in tm-relations-with-filter-information.  Simply returns relation-symbol.
     */
    public static final SubLObject tm_collect_relation_keys_from_filter(SubLObject relation_symbol, SubLObject mapping_info) {
        return relation_symbol;
    }

    /**
     * Preconditions: either (tm-filter? filter-or-filter-info) => T or (tm-filter-info? filter-or-filter-info) => T
     * (stringp relation-symbol)
     * Postconditions: Returns two values: <SYMBOL-FILTERED-TO> <STATUS>
     * <SYMBOL-FILTERED-TO> is either NIL or
     * is a syntactically valid relation name, though that relation may not exist.
     * When either (cnot (null (relation-constant-from-abbreviation RELATION-SYMBOL))) => NIL;
     * or (thesaurus-predicate? (relation-constant-from-abbreviation RELATION-SYMBOL)) => NIL
     * the two values NIL and :NOT-A-THESAURUS-RELATION are returned.
     * When the second return value is :do-not-output The relation-symbol should not be output
     * according to the filter. The first value returned is nil in this case.
     * When the second return value is :filtered  The relation-symbol should be output as
     * the <SYMBOL-FILTERED-TO> according to filter.
     * When the second return value is :default.  The filter has no information about
     * RELATION-SYMBOL and has returned a default value as the first value.
     * Description:  Returns the SYMBOL to output RELATION-SYMBOL as according to FILTER-OR-FILTER-INFO.
     * NOTE:  This differs in functionality from the function it is replacing, because relation-symbol's
     * not occuring in filter do not return nil, but whatever the default is.
     */
    public static final SubLObject tm_output_as_relation_according_to_filter(SubLObject relation_symbol, SubLObject filter_or_filter_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != tm_filterP(filter_or_filter_info)) || (NIL != tm_filter_infoP(filter_or_filter_info)))) {
                    Errors.error($str_alt96$_A_is_not_of_type_tm_filter__or_t, filter_or_filter_info);
                }
            }
            SubLSystemTrampolineFile.checkType(relation_symbol, STRINGP);
            {
                SubLObject rel_symbol = string_utilities.trim_whitespace(relation_symbol);
                if (!((NIL != relation_constant_from_abbreviation(rel_symbol)) && (NIL != thesaurus_predicateP(relation_constant_from_abbreviation(rel_symbol))))) {
                    return values(NIL, $NOT_A_THESAURUS_RELATION);
                }
                {
                    SubLObject relation_filtered_to = NIL;
                    SubLObject filter_map = NIL;
                    if (NIL != tm_filterP(filter_or_filter_info)) {
                        filter_map = tm_get_filter_map(filter_or_filter_info);
                    } else {
                        filter_map = tm_get_filter_info_entry(filter_or_filter_info, $FILTER_MAP_VALUE);
                        if (NIL == filter_map) {
                            filter_map = tm_get_filter_map(tm_get_filter_info_entry(filter_or_filter_info, $FILTER));
                        }
                    }
                    if (NIL == filter_map) {
                        return values(tm_relation_name_default(rel_symbol), $DEFAULT);
                    }
                    thread.resetMultipleValues();
                    {
                        SubLObject map_info = tm_filter_map_entry(filter_map, rel_symbol);
                        SubLObject found = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL == found) {
                            return values(tm_relation_name_default(rel_symbol), $DEFAULT);
                        }
                        relation_filtered_to = tm_get_mapping_info_symbol_to_output(map_info);
                        if ($tm_filter_default$.getGlobalValue() == relation_filtered_to) {
                            return values(tm_relation_name_default(rel_symbol), $DEFAULT);
                        } else
                            if ($tm_filter_do_not_output$.getGlobalValue() == relation_filtered_to) {
                                return values(NIL, $DO_NOT_OUTPUT);
                            } else
                                if ($tm_filter_output_as_is$.getGlobalValue() == relation_filtered_to) {
                                    return values(relation_symbol, $FILTERED);
                                } else {
                                    return values(relation_filtered_to, $FILTERED);
                                }


                    }
                }
            }
        }
    }

    /**
     * Preconditions: either (tm-filter? filter-or-filter-info) => T or (tm-filter-info? filter-or-filter-info) => T
     * (stringp relation-symbol) => T
     * Postconditions: Returns two values: <PRINT-NAME> <STATUS>
     * <PRINT-NAME> is either NIL or
     * a syntactically valid print name.
     * When (cnot (equalp <PRINT-NAME> RELATION-SYMBOL))
     * (thesaurus-predicate? (relation-constant-from-abbreviation <PRINT-NAME>)) => NIL,
     * that is currently print names cannot be an existing relation name other than their own.
     * When either (cnot (null (relation-constant-from-abbreviation RELATION-SYMBOL))) => NIL;
     * or (thesaurus-predicate? (relation-constant-from-abbreviation RELATION-SYMBOL)) => NIL
     * the a default value  and :DEFAULT are returned.
     * The reason is that a relation may be filtered to a non-existing relation.  Someone
     * may ask for the print name of the relation ...
     * When the second return value is :filtered  The relation-symbol should be output for
     * display with <PRINT-NAME> according to filter .
     * When the second return value is :default.  The filter has no information about
     * RELATION-SYMBOL and has returned a default value as the first value.
     * Description:  Returns the PRINT-NAME to display RELATION-SYMBOL as according to FILTER-OR-FILTER-INFO.
     */
    public static final SubLObject tm_output_with_print_name_according_to_filter(SubLObject relation_symbol, SubLObject filter_or_filter_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != tm_filterP(filter_or_filter_info)) || (NIL != tm_filter_infoP(filter_or_filter_info)))) {
                    Errors.error($str_alt96$_A_is_not_of_type_tm_filter__or_t, filter_or_filter_info);
                }
            }
            SubLSystemTrampolineFile.checkType(relation_symbol, STRINGP);
            relation_symbol = string_utilities.trim_whitespace(relation_symbol);
            if (!((NIL != relation_constant_from_abbreviation(relation_symbol)) && (NIL != thesaurus_predicateP(relation_constant_from_abbreviation(relation_symbol))))) {
                return values(tm_print_name_default(relation_symbol), $DEFAULT);
            }
            {
                SubLObject print_name = NIL;
                SubLObject filter_map = NIL;
                if (NIL != tm_filterP(filter_or_filter_info)) {
                    filter_map = tm_get_filter_map(filter_or_filter_info);
                } else {
                    filter_map = tm_get_filter_info_entry(filter_or_filter_info, $FILTER_MAP_VALUE);
                    if (NIL == filter_map) {
                        filter_map = tm_get_filter_map(tm_get_filter_info_entry(filter_or_filter_info, $FILTER));
                    }
                }
                if (NIL == filter_map) {
                    return values(tm_print_name_default(relation_symbol), $DEFAULT);
                }
                thread.resetMultipleValues();
                {
                    SubLObject map_info = tm_filter_map_entry(filter_map, relation_symbol);
                    SubLObject found = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == found) {
                        return values(tm_print_name_default(relation_symbol), $DEFAULT);
                    }
                    print_name = tm_get_mapping_info_print_name(map_info);
                    if ($tm_filter_default$.getGlobalValue() == print_name) {
                        return values(tm_print_name_default(relation_symbol), $DEFAULT);
                    } else {
                        if (((!print_name.equalp(relation_symbol)) && (NIL != relation_constant_from_abbreviation(print_name))) && (NIL != thesaurus_predicateP(relation_constant_from_abbreviation(print_name)))) {
                            return values(tm_print_name_default(relation_symbol), $DEFAULT);
                        } else {
                            return values(print_name, $FILTERED);
                        }
                    }
                }
            }
        }
    }

    /**
     * Preconditions:  (tm-filter? filter) => T
     * (listp relation-mappings) => T
     * (listp print-name-mappings) => T
     * relation-mappings conforms to description of <relation-mappings> above
     * print-name-mappings conforms to decription of <print-name-mappings> above
     * Postconditions:  Returns a list of ops to run in order to change filter to have exactly the mappings
     * given.  After ops are run tm-make-filter-current should be called to update filter
     */
    public static final SubLObject tm_make_ops_to_edit_filter(SubLObject filter, SubLObject relation_mappings, SubLObject print_name_mappings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(filter, $sym114$TM_FILTER_);
            tm_make_filter_current(filter);
            {
                SubLObject ops = NIL;
                SubLObject filter_map = tm_get_filter_map(filter);
                SubLObject update_info_table = make_hash_table(add(length(relation_mappings), length(print_name_mappings)), symbol_function(EQUALP), UNPROVIDED);
                SubLObject lock = $tm_filter_maps_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    print_name_mappings = set_difference(print_name_mappings, relation_mappings, symbol_function(EQUALP), symbol_function(FIRST));
                    {
                        SubLObject current_relation_maps = kb_mapping_utilities.pred_value_tuples_in_mt(filter, $$tmRelationMapping, ONE_INTEGER, $list_alt124, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED);
                        SubLObject current_print_name_maps = kb_mapping_utilities.pred_value_tuples_in_mt(filter, $$tmRelationPrintNameMapping, ONE_INTEGER, $list_alt124, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED);
                        SubLObject current_output_sames = kb_mapping_utilities.pred_value_tuples_in_mt(filter, $$tmOutputSameRelation, ONE_INTEGER, $list_alt127, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED);
                        SubLObject current_dont_outputs = kb_mapping_utilities.pred_value_tuples_in_mt(filter, $$tmDontOutputRelation, ONE_INTEGER, $list_alt127, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED);
                        SubLObject all_mappings = list(cons($$tmRelationMapping, current_relation_maps), cons($$tmRelationPrintNameMapping, current_print_name_maps), cons($$tmOutputSameRelation, current_output_sames), cons($$tmDontOutputRelation, current_dont_outputs));
                        {
                            SubLObject cdolist_list_var = relation_mappings;
                            SubLObject relation_pair = NIL;
                            for (relation_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relation_pair = cdolist_list_var.first()) {
                                {
                                    SubLObject relation_name = relation_pair.first();
                                    SubLObject new_symbol_to_output_as = relation_pair.rest();
                                    sethash(relation_name, update_info_table, T);
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject mapping_info = tm_filter_map_entry(filter_map, relation_name);
                                        SubLObject found = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (!((NIL != found) && new_symbol_to_output_as.equalp(NIL == mapping_info ? ((SubLObject) (NIL)) : tm_get_mapping_info_symbol_to_output(mapping_info)))) {
                                            {
                                                SubLObject cdolist_list_var_13 = all_mappings;
                                                SubLObject relation_map_pair = NIL;
                                                for (relation_map_pair = cdolist_list_var_13.first(); NIL != cdolist_list_var_13; cdolist_list_var_13 = cdolist_list_var_13.rest() , relation_map_pair = cdolist_list_var_13.first()) {
                                                    {
                                                        SubLObject found_14 = find(relation_name, relation_map_pair.rest(), symbol_function(EQUALP), symbol_function(SECOND), UNPROVIDED, UNPROVIDED);
                                                        if (NIL != found_14) {
                                                            {
                                                                SubLObject op = tm_datastructures.get_tm_op();
                                                                SubLObject op_15 = op;
                                                                tm_datastructures._csetf_tm_op_opcode(op_15, $DELETE);
                                                                tm_datastructures._csetf_tm_op_relation(op_15, relation_map_pair.first());
                                                                tm_datastructures._csetf_tm_op_inverseP(op_15, NIL);
                                                                tm_datastructures._csetf_tm_op_args(op_15, found_14);
                                                                tm_datastructures._csetf_tm_op_thesaurus(op_15, tm_datastructures.$tm_mt$.getGlobalValue());
                                                                tm_datastructures._csetf_tm_op_status(op_15, NIL);
                                                                tm_datastructures._csetf_tm_op_verifyP(op_15, NIL);
                                                                tm_datastructures._csetf_tm_op_hiddenP(op_15, T);
                                                                tm_datastructures._csetf_tm_op_description(op_15, NIL);
                                                                tm_datastructures._csetf_tm_op_description_args(op_15, NIL);
                                                                if (NIL.isString()) {
                                                                    html_tm_editing.set_op_english(op_15, NIL);
                                                                } else {
                                                                    html_tm_editing.set_op_english(op_15, UNPROVIDED);
                                                                }
                                                                ops = cons(op, ops);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            {
                                                SubLObject op = tm_datastructures.get_tm_op();
                                                SubLObject relation = NIL;
                                                SubLObject args = NIL;
                                                if (new_symbol_to_output_as.eql($DO_NOT_OUTPUT)) {
                                                    relation = $$tmDontOutputRelation;
                                                    args = list(filter, relation_name);
                                                } else
                                                    if (new_symbol_to_output_as.eql($OUTPUT_AS_IS)) {
                                                        relation = $$tmOutputSameRelation;
                                                        args = list(filter, relation_name);
                                                    } else
                                                        if (new_symbol_to_output_as.isString()) {
                                                            relation = $$tmRelationMapping;
                                                            args = list(filter, relation_name, new_symbol_to_output_as);
                                                        } else {
                                                            Errors.error($str_alt130$Unrecognized_output_symbol__s_for, new_symbol_to_output_as);
                                                        }


                                                {
                                                    SubLObject op_16 = op;
                                                    tm_datastructures._csetf_tm_op_opcode(op_16, $ADD);
                                                    tm_datastructures._csetf_tm_op_relation(op_16, relation);
                                                    tm_datastructures._csetf_tm_op_inverseP(op_16, NIL);
                                                    tm_datastructures._csetf_tm_op_args(op_16, args);
                                                    tm_datastructures._csetf_tm_op_thesaurus(op_16, tm_datastructures.$tm_mt$.getGlobalValue());
                                                    tm_datastructures._csetf_tm_op_status(op_16, NIL);
                                                    tm_datastructures._csetf_tm_op_verifyP(op_16, NIL);
                                                    tm_datastructures._csetf_tm_op_hiddenP(op_16, T);
                                                    tm_datastructures._csetf_tm_op_description(op_16, NIL);
                                                    tm_datastructures._csetf_tm_op_description_args(op_16, NIL);
                                                    if (NIL.isString()) {
                                                        html_tm_editing.set_op_english(op_16, NIL);
                                                    } else {
                                                        html_tm_editing.set_op_english(op_16, UNPROVIDED);
                                                    }
                                                }
                                                ops = cons(op, ops);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        {
                            SubLObject cdolist_list_var = print_name_mappings;
                            SubLObject relation_pair = NIL;
                            for (relation_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relation_pair = cdolist_list_var.first()) {
                                {
                                    SubLObject relation_name = relation_pair.first();
                                    SubLObject new_print_name = relation_pair.rest();
                                    sethash(relation_name, update_info_table, T);
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject mapping_info = tm_filter_map_entry(filter_map, relation_name);
                                        SubLObject found = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (!((NIL != found) && new_print_name.equal(NIL == mapping_info ? ((SubLObject) (NIL)) : tm_get_mapping_info_print_name(mapping_info)))) {
                                            {
                                                SubLObject cdolist_list_var_17 = all_mappings;
                                                SubLObject relation_map_pair = NIL;
                                                for (relation_map_pair = cdolist_list_var_17.first(); NIL != cdolist_list_var_17; cdolist_list_var_17 = cdolist_list_var_17.rest() , relation_map_pair = cdolist_list_var_17.first()) {
                                                    {
                                                        SubLObject found_18 = find(relation_name, relation_map_pair.rest(), symbol_function(EQUALP), symbol_function(SECOND), UNPROVIDED, UNPROVIDED);
                                                        if (NIL != found_18) {
                                                            {
                                                                SubLObject op = tm_datastructures.get_tm_op();
                                                                SubLObject op_19 = op;
                                                                tm_datastructures._csetf_tm_op_opcode(op_19, $DELETE);
                                                                tm_datastructures._csetf_tm_op_relation(op_19, relation_map_pair.first());
                                                                tm_datastructures._csetf_tm_op_inverseP(op_19, NIL);
                                                                tm_datastructures._csetf_tm_op_args(op_19, found_18);
                                                                tm_datastructures._csetf_tm_op_thesaurus(op_19, tm_datastructures.$tm_mt$.getGlobalValue());
                                                                tm_datastructures._csetf_tm_op_status(op_19, NIL);
                                                                tm_datastructures._csetf_tm_op_verifyP(op_19, NIL);
                                                                tm_datastructures._csetf_tm_op_hiddenP(op_19, T);
                                                                tm_datastructures._csetf_tm_op_description(op_19, NIL);
                                                                tm_datastructures._csetf_tm_op_description_args(op_19, NIL);
                                                                if (NIL.isString()) {
                                                                    html_tm_editing.set_op_english(op_19, NIL);
                                                                } else {
                                                                    html_tm_editing.set_op_english(op_19, UNPROVIDED);
                                                                }
                                                                ops = cons(op, ops);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            {
                                                SubLObject op = tm_datastructures.get_tm_op();
                                                SubLObject relation = NIL;
                                                SubLObject args = NIL;
                                                if (new_print_name.isString()) {
                                                    relation = $$tmRelationPrintNameMapping;
                                                    args = list(filter, relation_name, new_print_name);
                                                } else {
                                                    Errors.error($str_alt130$Unrecognized_output_symbol__s_for, new_print_name);
                                                }
                                                {
                                                    SubLObject op_20 = op;
                                                    tm_datastructures._csetf_tm_op_opcode(op_20, $ADD);
                                                    tm_datastructures._csetf_tm_op_relation(op_20, relation);
                                                    tm_datastructures._csetf_tm_op_inverseP(op_20, NIL);
                                                    tm_datastructures._csetf_tm_op_args(op_20, args);
                                                    tm_datastructures._csetf_tm_op_thesaurus(op_20, tm_datastructures.$tm_mt$.getGlobalValue());
                                                    tm_datastructures._csetf_tm_op_status(op_20, NIL);
                                                    tm_datastructures._csetf_tm_op_verifyP(op_20, NIL);
                                                    tm_datastructures._csetf_tm_op_hiddenP(op_20, T);
                                                    tm_datastructures._csetf_tm_op_description(op_20, NIL);
                                                    tm_datastructures._csetf_tm_op_description_args(op_20, NIL);
                                                    if (NIL.isString()) {
                                                        html_tm_editing.set_op_english(op_20, NIL);
                                                    } else {
                                                        html_tm_editing.set_op_english(op_20, UNPROVIDED);
                                                    }
                                                }
                                                ops = cons(op, ops);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        {
                            SubLObject cdolist_list_var = all_mappings;
                            SubLObject relation_map_pair = NIL;
                            for (relation_map_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relation_map_pair = cdolist_list_var.first()) {
                                {
                                    SubLObject cdolist_list_var_21 = relation_map_pair.rest();
                                    SubLObject relation_map_gaf = NIL;
                                    for (relation_map_gaf = cdolist_list_var_21.first(); NIL != cdolist_list_var_21; cdolist_list_var_21 = cdolist_list_var_21.rest() , relation_map_gaf = cdolist_list_var_21.first()) {
                                        if (NIL == gethash(second(relation_map_gaf), update_info_table, UNPROVIDED)) {
                                            {
                                                SubLObject op = tm_datastructures.get_tm_op();
                                                SubLObject op_22 = op;
                                                tm_datastructures._csetf_tm_op_opcode(op_22, $DELETE);
                                                tm_datastructures._csetf_tm_op_relation(op_22, relation_map_pair.first());
                                                tm_datastructures._csetf_tm_op_inverseP(op_22, NIL);
                                                tm_datastructures._csetf_tm_op_args(op_22, relation_map_gaf);
                                                tm_datastructures._csetf_tm_op_thesaurus(op_22, tm_datastructures.$tm_mt$.getGlobalValue());
                                                tm_datastructures._csetf_tm_op_status(op_22, NIL);
                                                tm_datastructures._csetf_tm_op_verifyP(op_22, NIL);
                                                tm_datastructures._csetf_tm_op_hiddenP(op_22, T);
                                                tm_datastructures._csetf_tm_op_description(op_22, NIL);
                                                tm_datastructures._csetf_tm_op_description_args(op_22, NIL);
                                                if (NIL.isString()) {
                                                    html_tm_editing.set_op_english(op_22, NIL);
                                                } else {
                                                    html_tm_editing.set_op_english(op_22, UNPROVIDED);
                                                }
                                                ops = cons(op, ops);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                ops = nreverse(ops);
                return ops;
            }
        }
    }

    public static final SubLObject tm_update_all_cached_filters() {
        {
            SubLObject cdolist_list_var = tm_all_filters();
            SubLObject filter = NIL;
            for (filter = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , filter = cdolist_list_var.first()) {
                if (NIL != tm_filter_initializedP(filter)) {
                    tm_make_filter_current(filter);
                }
            }
        }
        return NIL;
    }

    /**
     * For Dynamically rebinding during mapping in tm-make-list-of-ops-to-edit-filters-for-relation-edit
     */
    // defvar
    private static final SubLSymbol $tm_relation_name_change_list$ = makeSymbol("*TM-RELATION-NAME-CHANGE-LIST*");

    /**
     * For Dynamically rebinding during mapping in tm-make-list-of-ops-to-edit-filters-for-relation-edit
     */
    // defvar
    private static final SubLSymbol $tm_relation_name_change_opsP$ = makeSymbol("*TM-RELATION-NAME-CHANGE-OPS?*");

    /**
     * Preconditions:  relation-name-change-list matches above description for <relation-name-change-list>
     * Postconditions:  When ops? is Non-Nil Returns a list of ops to run in order to change filter to have
     * the same mappings it has now but replacing any appropriate relation-strings that
     * match the first element of each element of relation-name-change-list with the
     * cdr of each element of relation-name-change-list.  If the cdr is nil, it simply
     * assumes it is a deletion.
     * When list is nil it returns a list of tm-assert/tm-unassert forms to evaluate.
     * (tm-update-all-cached-filters) must be called if ops? is T after running ops
     * to update the internal data structures.
     * Description: Makes a list of ops or tm-asserts/tm-unasserts to update filter relevant assertions.
     */
    public static final SubLObject tm_make_list_of_ops_to_edit_filters_for_relation_edit(SubLObject relation_name_change_list, SubLObject opsP) {
        if (opsP == UNPROVIDED) {
            opsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ops = NIL;
                relation_name_change_list = remove_duplicates(relation_name_change_list, symbol_function(EQUALP), symbol_function(CAR), UNPROVIDED, UNPROVIDED);
                if (NIL == relation_name_change_list) {
                    return NIL;
                }
                {
                    SubLObject _prev_bind_0 = $tm_relation_name_change_list$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $tm_relation_name_change_opsP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = control_vars.$mapping_answer$.currentBinding(thread);
                    try {
                        $tm_relation_name_change_list$.bind(relation_name_change_list, thread);
                        $tm_relation_name_change_opsP$.bind(opsP, thread);
                        control_vars.$mapping_answer$.bind(NIL, thread);
                        kb_mapping.map_predicate_extent_index(symbol_function(TM_MAKE_OPS_TO_EDIT_FILTERS_FOR_RELATION_EDIT), $$tmRelationMapping, NIL, tm_datastructures.$tm_mt$.getGlobalValue());
                        ops = nconc(control_vars.$mapping_answer$.getDynamicValue(thread), ops);
                    } finally {
                        control_vars.$mapping_answer$.rebind(_prev_bind_2, thread);
                        $tm_relation_name_change_opsP$.rebind(_prev_bind_1, thread);
                        $tm_relation_name_change_list$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject _prev_bind_0 = $tm_relation_name_change_list$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $tm_relation_name_change_opsP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = control_vars.$mapping_answer$.currentBinding(thread);
                    try {
                        $tm_relation_name_change_list$.bind(relation_name_change_list, thread);
                        $tm_relation_name_change_opsP$.bind(opsP, thread);
                        control_vars.$mapping_answer$.bind(NIL, thread);
                        kb_mapping.map_predicate_extent_index(symbol_function(TM_MAKE_OPS_TO_EDIT_FILTERS_FOR_RELATION_EDIT), $$tmRelationPrintNameMapping, NIL, tm_datastructures.$tm_mt$.getGlobalValue());
                        ops = nconc(control_vars.$mapping_answer$.getDynamicValue(thread), ops);
                    } finally {
                        control_vars.$mapping_answer$.rebind(_prev_bind_2, thread);
                        $tm_relation_name_change_opsP$.rebind(_prev_bind_1, thread);
                        $tm_relation_name_change_list$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject _prev_bind_0 = $tm_relation_name_change_list$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $tm_relation_name_change_opsP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = control_vars.$mapping_answer$.currentBinding(thread);
                    try {
                        $tm_relation_name_change_list$.bind(relation_name_change_list, thread);
                        $tm_relation_name_change_opsP$.bind(opsP, thread);
                        control_vars.$mapping_answer$.bind(NIL, thread);
                        kb_mapping.map_predicate_extent_index(symbol_function(TM_MAKE_OPS_TO_EDIT_FILTERS_FOR_RELATION_EDIT), $$tmOutputSameRelation, NIL, tm_datastructures.$tm_mt$.getGlobalValue());
                        ops = nconc(control_vars.$mapping_answer$.getDynamicValue(thread), ops);
                    } finally {
                        control_vars.$mapping_answer$.rebind(_prev_bind_2, thread);
                        $tm_relation_name_change_opsP$.rebind(_prev_bind_1, thread);
                        $tm_relation_name_change_list$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject _prev_bind_0 = $tm_relation_name_change_list$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $tm_relation_name_change_opsP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = control_vars.$mapping_answer$.currentBinding(thread);
                    try {
                        $tm_relation_name_change_list$.bind(relation_name_change_list, thread);
                        $tm_relation_name_change_opsP$.bind(opsP, thread);
                        control_vars.$mapping_answer$.bind(NIL, thread);
                        kb_mapping.map_predicate_extent_index(symbol_function(TM_MAKE_OPS_TO_EDIT_FILTERS_FOR_RELATION_EDIT), $$tmDontOutputRelation, NIL, tm_datastructures.$tm_mt$.getGlobalValue());
                        ops = nconc(control_vars.$mapping_answer$.getDynamicValue(thread), ops);
                    } finally {
                        control_vars.$mapping_answer$.rebind(_prev_bind_2, thread);
                        $tm_relation_name_change_opsP$.rebind(_prev_bind_1, thread);
                        $tm_relation_name_change_list$.rebind(_prev_bind_0, thread);
                    }
                }
                ops = nreverse(ops);
                return ops;
            }
        }
    }

    public static final SubLObject tm_make_ops_to_edit_filters_for_relation_edit(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject relation = assertions_high.gaf_arg0(assertion);
                SubLObject arg2_found = NIL;
                SubLObject arg3_found = NIL;
                SubLObject unassert_form = NIL;
                SubLObject assert_form = NIL;
                SubLObject relation_name_change_list = $tm_relation_name_change_list$.getDynamicValue(thread);
                SubLObject opsP = $tm_relation_name_change_opsP$.getDynamicValue(thread);
                if (NIL == relation_name_change_list) {
                    return NIL;
                }
                if (relation.eql($$tmRelationMapping)) {
                    arg2_found = find(assertions_high.gaf_arg2(assertion), relation_name_change_list, symbol_function(EQUALP), symbol_function(CAR), UNPROVIDED, UNPROVIDED);
                    arg3_found = find(assertions_high.gaf_arg3(assertion), relation_name_change_list, symbol_function(EQUALP), symbol_function(CAR), UNPROVIDED, UNPROVIDED);
                    if ((NIL != arg2_found) || (NIL != arg3_found)) {
                        unassert_form = assertions_high.gaf_formula(assertion);
                        assert_form = (((NIL == arg2_found) || (NIL != arg2_found.rest())) && ((NIL == arg3_found) || (NIL != arg3_found.rest()))) ? ((SubLObject) (list(nth(ONE_INTEGER, unassert_form), NIL, NIL))) : NIL;
                    }
                } else
                    if (relation.eql($$tmRelationPrintNameMapping)) {
                        arg2_found = find(assertions_high.gaf_arg2(assertion), relation_name_change_list, symbol_function(EQUALP), symbol_function(CAR), UNPROVIDED, UNPROVIDED);
                        if (NIL != arg2_found) {
                            unassert_form = assertions_high.gaf_formula(assertion);
                            assert_form = (NIL != arg2_found.rest()) ? ((SubLObject) (list(nth(ONE_INTEGER, unassert_form), NIL, NIL))) : NIL;
                        }
                    } else
                        if (relation.eql($$tmOutputSameRelation)) {
                            arg2_found = find(assertions_high.gaf_arg2(assertion), relation_name_change_list, symbol_function(EQUALP), symbol_function(CAR), UNPROVIDED, UNPROVIDED);
                            if (NIL != arg2_found) {
                                unassert_form = assertions_high.gaf_formula(assertion);
                                assert_form = (NIL != arg2_found.rest()) ? ((SubLObject) (list(nth(ONE_INTEGER, unassert_form), NIL))) : NIL;
                            }
                        } else
                            if (relation.eql($$tmDontOutputRelation)) {
                                arg2_found = find(assertions_high.gaf_arg2(assertion), relation_name_change_list, symbol_function(EQUALP), symbol_function(CAR), UNPROVIDED, UNPROVIDED);
                                if (NIL != arg2_found) {
                                    unassert_form = assertions_high.gaf_formula(assertion);
                                    assert_form = (NIL != arg2_found.rest()) ? ((SubLObject) (list(nth(ONE_INTEGER, unassert_form), NIL))) : NIL;
                                }
                            } else {
                                Errors.error($str_alt134$Unrecognized_relation__a, relation);
                            }



                if (NIL != unassert_form) {
                    if (NIL != opsP) {
                        {
                            SubLObject op = tm_datastructures.get_tm_op();
                            SubLObject op_23 = op;
                            tm_datastructures._csetf_tm_op_opcode(op_23, $DELETE);
                            tm_datastructures._csetf_tm_op_relation(op_23, relation);
                            tm_datastructures._csetf_tm_op_inverseP(op_23, NIL);
                            tm_datastructures._csetf_tm_op_args(op_23, unassert_form.rest());
                            tm_datastructures._csetf_tm_op_thesaurus(op_23, tm_datastructures.$tm_mt$.getGlobalValue());
                            tm_datastructures._csetf_tm_op_status(op_23, NIL);
                            tm_datastructures._csetf_tm_op_verifyP(op_23, NIL);
                            tm_datastructures._csetf_tm_op_hiddenP(op_23, T);
                            tm_datastructures._csetf_tm_op_description(op_23, NIL);
                            tm_datastructures._csetf_tm_op_description_args(op_23, NIL);
                            if (NIL.isString()) {
                                html_tm_editing.set_op_english(op_23, NIL);
                            } else {
                                html_tm_editing.set_op_english(op_23, UNPROVIDED);
                            }
                            control_vars.$mapping_answer$.setDynamicValue(cons(op, control_vars.$mapping_answer$.getDynamicValue(thread)), thread);
                        }
                    } else {
                        control_vars.$mapping_answer$.setDynamicValue(cons(listS(TM_UNASSERT, list(QUOTE, unassert_form), $list_alt137), control_vars.$mapping_answer$.getDynamicValue(thread)), thread);
                    }
                }
                if (NIL != assert_form) {
                    set_nth(ONE_INTEGER, assert_form, NIL != arg2_found.rest() ? ((SubLObject) (arg2_found.rest())) : nth(TWO_INTEGER, unassert_form));
                    if (length(assert_form).eql(THREE_INTEGER)) {
                        set_nth(TWO_INTEGER, assert_form, NIL != arg3_found.rest() ? ((SubLObject) (arg3_found.rest())) : nth(THREE_INTEGER, unassert_form));
                    }
                    if (NIL != opsP) {
                        {
                            SubLObject op = tm_datastructures.get_tm_op();
                            SubLObject op_24 = op;
                            tm_datastructures._csetf_tm_op_opcode(op_24, $ADD);
                            tm_datastructures._csetf_tm_op_relation(op_24, relation);
                            tm_datastructures._csetf_tm_op_inverseP(op_24, NIL);
                            tm_datastructures._csetf_tm_op_args(op_24, assert_form);
                            tm_datastructures._csetf_tm_op_thesaurus(op_24, tm_datastructures.$tm_mt$.getGlobalValue());
                            tm_datastructures._csetf_tm_op_status(op_24, NIL);
                            tm_datastructures._csetf_tm_op_verifyP(op_24, NIL);
                            tm_datastructures._csetf_tm_op_hiddenP(op_24, T);
                            tm_datastructures._csetf_tm_op_description(op_24, NIL);
                            tm_datastructures._csetf_tm_op_description_args(op_24, NIL);
                            if (NIL.isString()) {
                                html_tm_editing.set_op_english(op_24, NIL);
                            } else {
                                html_tm_editing.set_op_english(op_24, UNPROVIDED);
                            }
                            control_vars.$mapping_answer$.setDynamicValue(cons(op, control_vars.$mapping_answer$.getDynamicValue(thread)), thread);
                        }
                    } else {
                        control_vars.$mapping_answer$.setDynamicValue(cons(listS(TM_ASSERT, list(QUOTE, bq_cons(relation, assert_form)), $list_alt137), control_vars.$mapping_answer$.getDynamicValue(thread)), thread);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Preconditions: (tm-filter? filter-constant)
     * Postcondtions: filter is deleted.
     */
    public static final SubLObject do_delete_output_filter(SubLObject filter_constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tm_filter_map = NIL;
                SubLObject lock = $tm_filter_maps_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    tm_filter_map = gethash(filter_constant, $tm_filter_maps$.getDynamicValue(thread), UNPROVIDED);
                    if (NIL != tm_filter_map) {
                        clrhash(tm_filter_map);
                        remhash(filter_constant, $tm_filter_maps$.getDynamicValue(thread));
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            tm_kill(filter_constant);
            return NIL;
        }
    }

    /**
     * Preconditions: (thesaurus? thesaurus) => T
     * Description:  If there is a default display filter for thesaurus, returns the filter
     * Else nil
     */
    public static final SubLObject tm_default_display_filter(SubLObject thesaurus) {
        SubLSystemTrampolineFile.checkType(thesaurus, $sym9$THESAURUS_);
        return kb_mapping_utilities.fpred_value_in_mt(thesaurus, $$tmDefaultDisplayFilter, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Preconditions: (thesaurus? thesaurus) => T
     * Description:  If there is a default display output for thesaurus, returns the filter
     * Else nil
     */
    public static final SubLObject tm_default_output_filter(SubLObject thesaurus) {
        SubLSystemTrampolineFile.checkType(thesaurus, $sym9$THESAURUS_);
        return kb_mapping_utilities.fpred_value_in_mt(thesaurus, $$tmDefaultOutputFilter, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Preconditions: (tm-filter? filter) => T
     * Description:  Returns a list of all thesauri for which filter is
     * a default display filter for
     */
    public static final SubLObject tm_thesauri_for_which_default_display_filter(SubLObject filter) {
        SubLSystemTrampolineFile.checkType(filter, $sym114$TM_FILTER_);
        return kb_mapping_utilities.pred_values_in_mt(filter, $$tmDefaultDisplayFilter, tm_datastructures.$tm_mt$.getGlobalValue(), TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
    }

    /**
     * Preconditions: (tm-filter? filter) => T
     * Description:  Returns a list of all thesauri for which filter is
     * a default output filter for
     */
    public static final SubLObject tm_thesauri_for_which_default_output_filter(SubLObject filter) {
        SubLSystemTrampolineFile.checkType(filter, $sym114$TM_FILTER_);
        return kb_mapping_utilities.pred_values_in_mt(filter, $$tmDefaultOutputFilter, tm_datastructures.$tm_mt$.getGlobalValue(), TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
    }

    /**
     * Description: Returns a list of all of the filters.
     */
    public static final SubLObject tm_all_filters() {
        return isa.all_fort_instances($$TMOutputFilter, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED);
    }

    /**
     * Preconditions: None
     * Postconditions: Object may be passed in to functions that
     * require an instance of <filter-info>
     * Description: Returns T if object is a <filter-info> entry.
     * NOTE: This predicate can actually not determine if object
     * is definitely a filter-info entry (specifically filter-map field),
     * but in the future when filter-map type is changed it will be able to.
     */
    public static final SubLObject tm_filter_infoP(SubLObject v_object) {
        if (!v_object.isCons()) {
            return NIL;
        } else
            if (!length(v_object).eql(FIVE_INTEGER)) {
                return NIL;
            } else
                if (NIL == tm_filterP(tm_get_filter_info_entry_int(v_object, $FILTER))) {
                    return NIL;
                } else
                    if (!((NIL == tm_get_filter_info_entry_int(v_object, $FILTER_MAP_VALUE)) || tm_get_filter_info_entry_int(v_object, $FILTER_MAP_VALUE).isHashtable())) {
                        return NIL;
                    } else
                        if (NIL == subl_promotions.memberP(tm_get_filter_info_entry_int(v_object, $kw113$USE_FILTER_), $list_alt141, UNPROVIDED, UNPROVIDED)) {
                            return NIL;
                        } else
                            if (NIL == subl_promotions.memberP(tm_get_filter_info_entry_int(v_object, $kw142$USE_FILTER_MAP_), $list_alt143, UNPROVIDED, UNPROVIDED)) {
                                return NIL;
                            } else
                                if (NIL == subl_promotions.memberP(tm_get_filter_info_entry_int(v_object, $FILTER_TYPE), $list_alt145, UNPROVIDED, UNPROVIDED)) {
                                    return NIL;
                                } else {
                                    return T;
                                }






    }

    /**
     * Preconditions: (tm-filter? filter)
     * Postconditions:  Returns a object of type <filter-info> for filter.
     * When make-copy is non-nil, the :filter-map-value of the _object_
     * returned will not be altered by actions such as the editing of the
     * filter.  When make-copy is nil, editing will update the filter-map
     * as well.
     * The values for the fields are
     * :filter           => filter
     * :filter-map-value => filter-map for filter or a copy (if make-copy)
     * :use-filter?      => :check-dynamically
     * :use-filter-map?  => nil
     * :filter-type     => nil
     * Description:  Returns a filter-info object for filter.
     */
    public static final SubLObject tm_filter_info(SubLObject filter, SubLObject make_copy) {
        if (make_copy == UNPROVIDED) {
            make_copy = NIL;
        }
        SubLSystemTrampolineFile.checkType(filter, $sym114$TM_FILTER_);
        {
            SubLObject filter_info = list(NIL, NIL, NIL, NIL, NIL);
            SubLObject filter_map = tm_get_filter_map(filter);
            SubLObject filter_map_copy = NIL;
            tm_set_filter_info_entry_int(filter_info, $FILTER, filter);
            if ((NIL == make_copy) || (NIL == filter_map)) {
                tm_set_filter_info_entry_int(filter_info, $FILTER_MAP_VALUE, filter_map);
            } else {
                filter_map_copy = make_hash_table(hash_table_count(filter_map), symbol_function(EQUALP), UNPROVIDED);
                {
                    SubLObject new_key = NIL;
                    SubLObject new_val = NIL;
                    SubLObject key = NIL;
                    SubLObject val = NIL;
                    {
                        final Iterator cdohash_iterator = getEntrySetIterator(filter_map);
                        try {
                            while (iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                key = getEntryKey(cdohash_entry);
                                val = getEntryValue(cdohash_entry);
                                new_key = (key.isString()) ? ((SubLObject) (string_utilities.copy_string(key))) : key;
                                new_val = tm_copy_mapping_info_entry(val);
                                sethash(new_key, filter_map_copy, new_val);
                            } 
                        } finally {
                            releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
                tm_set_filter_info_entry_int(filter_info, $FILTER_MAP_VALUE, filter_map_copy);
            }
            tm_set_filter_info_entry_int(filter_info, $kw113$USE_FILTER_, $CHECK_DYNAMICALLY);
            tm_set_filter_info_entry_int(filter_info, $kw142$USE_FILTER_MAP_, NIL);
            tm_set_filter_info_entry_int(filter_info, $FILTER_TYPE, NIL);
            return filter_info;
        }
    }

    /**
     * Preconditions: (tm-filter-info? filter-info) => T
     * (tm-filter-info-field? field) => T
     * New-value is of the right type for field.
     * Postcondtions: filter-info has been destructively altered so field of filter-info
     * has new-value.
     * Description:  Sets the value of field entry of filter-info to new-value
     * and Returns the new value of filter-info.
     */
    public static final SubLObject tm_set_filter_info_entry(SubLObject filter_info, SubLObject field, SubLObject new_value) {
        SubLSystemTrampolineFile.checkType(filter_info, $sym97$TM_FILTER_INFO_);
        SubLSystemTrampolineFile.checkType(field, $sym147$TM_FILTER_INFO_FIELD_);
        tm_set_filter_info_entry_int(filter_info, field, new_value);
        return filter_info;
    }

    /**
     * Preconditions: (tm-filter-info? filter-info) => T
     * (tm-filter-info-field? field) => T
     * Postcondtions: Returns two values: <field-value> <found>
     * <field-value> is the value of the field
     * <found> is T if the field was actually found and nil otherwise.
     * Description:  Returns the value of field's entry in filter-info
     */
    public static final SubLObject tm_get_filter_info_entry(SubLObject filter_info, SubLObject field) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(filter_info, $sym97$TM_FILTER_INFO_);
            SubLSystemTrampolineFile.checkType(field, $sym147$TM_FILTER_INFO_FIELD_);
            thread.resetMultipleValues();
            {
                SubLObject value = tm_get_filter_info_entry_int(filter_info, field);
                SubLObject foundP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return values(value, foundP);
            }
        }
    }

    /**
     * Preconditions: None
     * Postconditions: Returns T if object is a member of (:filter :filter-map-value :use-filter?
     * :use-filter-map? :filter-type)
     * Description: Returns T if object is a field for <filter-info> type.
     */
    public static final SubLObject tm_filter_info_fieldP(SubLObject v_object) {
        if (NIL != subl_promotions.memberP(v_object, $list_alt148, UNPROVIDED, UNPROVIDED)) {
            return T;
        } else {
            return NIL;
        }
    }

    /**
     * Preconditions: (Consp cons) => T
     * (tm-filter-info-field? field) => T
     * Postcondtions: Returns two values <field-value> <found>
     * <field-value> is the value of the field
     * <found> is T if the field was actually found and nil otherwise.
     * Description:  Returns the entry in cons corresponding to field.
     */
    public static final SubLObject tm_get_filter_info_entry_int(SubLObject cons, SubLObject field) {
        SubLSystemTrampolineFile.checkType(cons, CONSP);
        if (field.eql($FILTER) && length(cons).numGE(ONE_INTEGER)) {
            return values(cons.first(), T);
        } else
            if (field.eql($FILTER_MAP_VALUE) && length(cons).numGE(TWO_INTEGER)) {
                return values(second(cons), T);
            } else
                if (field.eql($kw113$USE_FILTER_) && length(cons).numGE(THREE_INTEGER)) {
                    return values(third(cons), T);
                } else
                    if (field.eql($kw142$USE_FILTER_MAP_) && length(cons).numGE(FOUR_INTEGER)) {
                        return values(fourth(cons), T);
                    } else
                        if (field.eql($FILTER_TYPE) && length(cons).numGE(FIVE_INTEGER)) {
                            return values(fifth(cons), T);
                        } else {
                            return values(NIL, NIL);
                        }




    }

    /**
     * Preconditions: (Consp cons) => T
     * (length cons is of the right length for a filter-info-list (currently 5)
     * (tm-filter-info-field? field) => T
     * new-value is of the right type for field.
     * Postcondtions: field of Cons has been destructively altered to new-value.
     * Returns the altered value of cons
     * Description:  Sets field of cons to new value and Returns the altered value of cons
     */
    public static final SubLObject tm_set_filter_info_entry_int(SubLObject cons, SubLObject field, SubLObject new_value) {
        SubLSystemTrampolineFile.checkType(cons, CONSP);
        if (!length(cons).eql(FIVE_INTEGER)) {
            Errors.error($str_alt150$List_is_not_of_right_length_for_a);
        }
        if (field.eql($FILTER)) {
            SubLSystemTrampolineFile.checkType(new_value, $sym114$TM_FILTER_);
            set_nth(ZERO_INTEGER, cons, new_value);
        } else
            if (field.eql($FILTER_MAP_VALUE)) {
                if (NIL != new_value) {
                    SubLSystemTrampolineFile.checkType(new_value, HASH_TABLE_P);
                }
                set_nth(ONE_INTEGER, cons, new_value);
            } else
                if (field.eql($kw113$USE_FILTER_)) {
                    if (NIL == subl_promotions.memberP(new_value, $list_alt141, UNPROVIDED, UNPROVIDED)) {
                        Errors.error($str_alt152$_a_is_not_of_the_right_type_for__, new_value, field);
                    }
                    set_nth(TWO_INTEGER, cons, new_value);
                } else
                    if (field.eql($kw142$USE_FILTER_MAP_)) {
                        if (NIL == subl_promotions.memberP(new_value, $list_alt143, UNPROVIDED, UNPROVIDED)) {
                            Errors.error($str_alt152$_a_is_not_of_the_right_type_for__, new_value, field);
                        }
                        set_nth(THREE_INTEGER, cons, new_value);
                    } else
                        if (field.eql($FILTER_TYPE)) {
                            if (NIL == subl_promotions.memberP(new_value, $list_alt145, UNPROVIDED, UNPROVIDED)) {
                                Errors.error($str_alt152$_a_is_not_of_the_right_type_for__, new_value, field);
                            }
                            set_nth(FOUR_INTEGER, cons, new_value);
                        } else {
                            Errors.error($str_alt153$Unrecognized_Field__a_for_filter_, field);
                        }




        return cons;
    }

    /**
     * Preconditions: (stringp relation-symbol) => T.
     * Postconditions: The default print name is returned as a string.
     * Description:  Returns the default print name for relation-symbol.
     */
    public static final SubLObject tm_print_name_default(SubLObject relation_symbol) {
        SubLSystemTrampolineFile.checkType(relation_symbol, STRINGP);
        return Strings.string_upcase(relation_symbol, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Preconditions: (stringp relation-symbol) => T.
     * Postconditions: The default relation name is returned as a string.
     * Description:  Returns the default relation name for relation-symbol.
     */
    public static final SubLObject tm_relation_name_default(SubLObject relation_symbol) {
        SubLSystemTrampolineFile.checkType(relation_symbol, STRINGP);
        return Strings.string_upcase(relation_symbol, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Preconditions: (tm-filter? filter) => T
     * Can eventually grab the lock *tm-filter-maps-lock*
     * if (tm-filter-initialized? filter) => nil.
     * Postconditions:  Returns a valid filter map for filter
     * or nil if it cannot find one.
     */
    public static final SubLObject tm_get_filter_map(SubLObject filter) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(filter, $sym114$TM_FILTER_);
            if (NIL == tm_filter_initializedP(filter)) {
                tm_initialize_filter(filter);
            }
            return gethash(filter, $tm_filter_maps$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    /**
     * Preconditions: filter-map is a <filter-map>.
     * (cnot (null (relation-constant-from-abbreviation RELATION-SYMBOL))) => T;
     * (thesaurus-predicate? (relation-constant-from-abbreviation RELATION-SYMBOL)) => T.
     * Postconditions:  Returns Two Values The First is the <Mapping-Info> For
     * relation-symbol.  The second value is T if relation-symbol
     * had an entry in the table, else nil.
     * Description:  Returns the filter map-info of relation-symbol according to filter-map.
     */
    public static final SubLObject tm_filter_map_entry(SubLObject filter_map, SubLObject relation_symbol) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(filter_map, HASH_TABLE_P);
            thread.resetMultipleValues();
            {
                SubLObject map_info = gethash(relation_symbol, filter_map, UNPROVIDED);
                SubLObject found = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return values(map_info, found);
            }
        }
    }

    /**
     * Preconditions: either (tm-filter? filter-or-filter-info) => T or (tm-filter-info? filter-or-filter-info) => T
     * (listp other-args) => T
     * Function arg-list is
     * (<TM-Relation-Symbol> <Mapping-Info> ...)
     * The "..." represents that the function must take the type and number
     * of other arguments as ordered in the value passed in as other-args.
     * Function is not destructive.
     * Postconditions: Function has been called on every <TM-Relation-Symbol> <Mapping-Info> pair
     * for the filter-map associated with filter.  The list returned is the
     * result of every non-nil value returned from the function.
     * Description:  Calls Function on every <TM-Relation-Symbol> <Mapping-Info> pair
     * for the filter-map associated with filter with the extra arguments as
     * supplied by the elements of other-args.
     */
    public static final SubLObject tm_map_over_filter_map_entries(SubLObject filter_or_filter_info, SubLObject function, SubLObject other_args) {
        if (other_args == UNPROVIDED) {
            other_args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != tm_filterP(filter_or_filter_info)) || (NIL != tm_filter_infoP(filter_or_filter_info)))) {
                    Errors.error($str_alt96$_A_is_not_of_type_tm_filter__or_t, filter_or_filter_info);
                }
            }
            SubLSystemTrampolineFile.checkType(other_args, LISTP);
            {
                SubLObject filter_map = NIL;
                SubLObject result = NIL;
                if (NIL != tm_filterP(filter_or_filter_info)) {
                    filter_map = tm_get_filter_map(filter_or_filter_info);
                } else {
                    filter_map = tm_get_filter_info_entry(filter_or_filter_info, $FILTER_MAP_VALUE);
                    if (NIL == filter_map) {
                        filter_map = tm_get_filter_map(tm_get_filter_info_entry(filter_or_filter_info, $FILTER));
                    }
                }
                if (NIL == filter_map) {
                    return NIL;
                }
                if (NIL != other_args) {
                    {
                        SubLObject relation_symbol = NIL;
                        SubLObject map_info = NIL;
                        {
                            final Iterator cdohash_iterator = getEntrySetIterator(filter_map);
                            try {
                                while (iteratorHasNext(cdohash_iterator)) {
                                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                    relation_symbol = getEntryKey(cdohash_entry);
                                    map_info = getEntryValue(cdohash_entry);
                                    {
                                        SubLObject fn_result = apply(function, cons(relation_symbol, cons(map_info, other_args)));
                                        if (NIL != fn_result) {
                                            result = cons(fn_result, result);
                                        }
                                    }
                                } 
                            } finally {
                                releaseEntrySetIterator(cdohash_iterator);
                            }
                        }
                    }
                } else {
                    {
                        SubLObject relation_symbol = NIL;
                        SubLObject map_info = NIL;
                        {
                            final Iterator cdohash_iterator = getEntrySetIterator(filter_map);
                            try {
                                while (iteratorHasNext(cdohash_iterator)) {
                                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                    relation_symbol = getEntryKey(cdohash_entry);
                                    map_info = getEntryValue(cdohash_entry);
                                    {
                                        SubLObject fn_result = funcall(function, relation_symbol, map_info);
                                        if (NIL != fn_result) {
                                            result = cons(fn_result, result);
                                        }
                                    }
                                } 
                            } finally {
                                releaseEntrySetIterator(cdohash_iterator);
                            }
                        }
                    }
                }
                return result;
            }
        }
    }

    /**
     * Preconditions: (tm-filter? filter) => T.
     * Postconditions:  Returns T if Filter has been initialized, else nil.
     * Description: Predicate that checks if filter has been initialized.
     */
    public static final SubLObject tm_filter_initializedP(SubLObject filter) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(filter, $sym114$TM_FILTER_);
            if (NIL != gethash(filter, $tm_filter_maps$.getDynamicValue(thread), UNPROVIDED)) {
                return T;
            } else {
                return NIL;
            }
        }
    }

    /**
     * Preconditions: (tm-filter? filter) => T.
     * Can eventually grab the lock *tm-filter-maps-lock*.
     * Postconditions:  Filter has been initialized.
     * (tm-filter-initialized? filter)=>T.
     * The KB assertions currently used in initializing a filter are
     * (1)  #$tmOutputSameRelation
     * (2)  #$tmDontOutputRelation
     * (3)  #$tmRelationPrintNameMapping
     * (4)  #$tmRelationMapping
     * If one type of assertion conflicts with another type of assertion, they
     * are given precedene in the order listed above where 1 is highest.  If an
     * assertion conflicts with the same type of assertion, the precedence is arbitrary.
     * Returns the initialized filter map.
     * Description:  Initializes filter from information in the KB as well as possible other information.
     */
    public static final SubLObject tm_initialize_filter(SubLObject filter) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(filter, $sym114$TM_FILTER_);
            {
                SubLObject lock = $tm_filter_maps_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    if (NIL == tm_filter_initializedP(filter)) {
                        {
                            SubLObject default_min_size = $tm_minimum_num_entries_per_filter$.getGlobalValue();
                            SubLObject filter_map = make_hash_table(min(multiply(cardinality_estimates.instance_cardinality($$ThesaurusPredicate), TWO_INTEGER), default_min_size), symbol_function(EQUALP), UNPROVIDED);
                            tm_store_kb_information_in_filter_map(filter, filter_map);
                            sethash(filter, $tm_filter_maps$.getDynamicValue(thread), filter_map);
                        }
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return tm_get_filter_map(filter);
        }
    }

    /**
     * Preconditions: (tm-filter? filter) => T.
     * Postconditions:  After call, there is no stale information associated with
     * filter, and all information known about filter is stored
     * in the internal representation of the filter.
     * (tm-filter-initialized? filter) => T.
     * <filter-map> is of the kind described above
     * and for any filter-map (hash-table-p filter-map) => T
     * Description: Filter is updated with most current information.
     * Precedence to KB information as described in the
     * specs for tm-store-kb-information-in-filter-map.
     * Returns updated filter-map.
     */
    public static final SubLObject tm_make_filter_current_int(SubLObject filter) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(filter, $sym114$TM_FILTER_);
            {
                SubLObject lock = $tm_filter_maps_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    if (NIL != tm_filter_initializedP(filter)) {
                        {
                            SubLObject filter_map = tm_get_filter_map(filter);
                            clrhash(filter_map);
                            tm_store_kb_information_in_filter_map(filter, filter_map);
                        }
                    } else {
                        tm_initialize_filter(filter);
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return tm_get_filter_map(filter);
        }
    }

    /**
     * Preconditions:  Any locking required should be done externally to this function.
     * (tm-filter? filter) => T
     * filter-map is a <filter-map> as described above.
     * (hash-table-p filter-map) => T - when filter-map is abstracted can
     * generalize this precondition.
     * Postconditions: The KB assertions currently stored in a filter-map are
     * (1)  #$tmOutputSameRelation
     * (2)  #$tmDontOutputRelation
     * (3)  #$tmRelationPrintNameMapping
     * (4)  #$tmRelationMapping
     * If one type of assertion conflicts with another type of assertion, they
     * are given precedence in the order listed above where 1 is highest.  If an
     * assertion conflicts with the same type of assertion, the precedence is arbitrary.
     * Returns the filter map (which has been destructively altered).
     * All Information in filter-map previous to the call remains in the filter-map
     * except those cases where an index in the KB
     * Description:  Stores information from the KB in filter-map.  Returns filter-map.
     */
    public static final SubLObject tm_store_kb_information_in_filter_map(SubLObject filter, SubLObject filter_map) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject suppressed_rels = kb_mapping_utilities.pred_values_in_mt(filter, $$tmDontOutputRelation, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject unchanged_rels = kb_mapping_utilities.pred_values_in_mt(filter, $$tmOutputSameRelation, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(tm_datastructures.$tm_mt$.getGlobalValue(), thread);
                        {
                            SubLObject pred_var = $$tmRelationMapping;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(filter, ONE_INTEGER, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(filter, ONE_INTEGER, pred_var);
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
                                                            SubLObject done_var_25 = NIL;
                                                            SubLObject token_var_26 = NIL;
                                                            while (NIL == done_var_25) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_26);
                                                                    SubLObject valid_27 = makeBoolean(token_var_26 != assertion);
                                                                    if (NIL != valid_27) {
                                                                        {
                                                                            SubLObject relation_name = assertions_high.gaf_arg2(assertion);
                                                                            SubLObject current_value = gethash(relation_name, filter_map, UNPROVIDED);
                                                                            SubLObject output_as_value = assertions_high.gaf_arg3(assertion);
                                                                            if (NIL == current_value) {
                                                                                current_value = tm_new_mapping_info_entry();
                                                                                sethash(relation_name, filter_map, current_value);
                                                                            }
                                                                            tm_set_mapping_info_symbol_to_output(output_as_value, current_value);
                                                                        }
                                                                    }
                                                                    done_var_25 = makeBoolean(NIL == valid_27);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_28, thread);
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
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(tm_datastructures.$tm_mt$.getGlobalValue(), thread);
                        {
                            SubLObject pred_var = $$tmRelationPrintNameMapping;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(filter, ONE_INTEGER, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(filter, ONE_INTEGER, pred_var);
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
                                                                        {
                                                                            SubLObject relation_name = assertions_high.gaf_arg2(assertion);
                                                                            SubLObject current_value = gethash(relation_name, filter_map, UNPROVIDED);
                                                                            SubLObject print_name = assertions_high.gaf_arg3(assertion);
                                                                            if (NIL == current_value) {
                                                                                current_value = tm_new_mapping_info_entry();
                                                                                sethash(relation_name, filter_map, current_value);
                                                                            }
                                                                            tm_set_mapping_info_print_name(print_name, current_value);
                                                                        }
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
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject cdolist_list_var = suppressed_rels;
                    SubLObject rel = NIL;
                    for (rel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rel = cdolist_list_var.first()) {
                        {
                            SubLObject current_value = gethash(rel, filter_map, UNPROVIDED);
                            if (NIL == current_value) {
                                current_value = tm_new_mapping_info_entry();
                                sethash(rel, filter_map, current_value);
                            }
                            tm_set_mapping_info_symbol_to_output($tm_filter_do_not_output$.getGlobalValue(), current_value);
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = unchanged_rels;
                    SubLObject rel = NIL;
                    for (rel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rel = cdolist_list_var.first()) {
                        {
                            SubLObject current_value = gethash(rel, filter_map, UNPROVIDED);
                            if (NIL == current_value) {
                                current_value = tm_new_mapping_info_entry();
                                sethash(rel, filter_map, current_value);
                            }
                            tm_set_mapping_info_symbol_to_output($tm_filter_output_as_is$.getGlobalValue(), current_value);
                        }
                    }
                }
            }
            return filter_map;
        }
    }

    /**
     * Preconditions: None
     * Postconditions:  An entry corresponding to the apove description for <Mapping-info>
     * has been returned.
     * Description:  Returns a new value structure for a relation mapping in some filter.
     */
    public static final SubLObject tm_new_mapping_info_entry() {
        return list($tm_filter_default$.getGlobalValue(), $tm_filter_default$.getGlobalValue());
    }

    /**
     * Preconditions: Mapping-info corresponds to type <mapping-info>
     * Postconditions:  An entry corresponding to the apove description for <Mapping-info>
     * has been returned that is a copy of mapping-info.
     * Description:  Returns a copy of mapping-info that shares no storage space with mapping-info.
     */
    public static final SubLObject tm_copy_mapping_info_entry(SubLObject mapping_info) {
        return list(tm_get_mapping_info_symbol_to_output(mapping_info).isString() ? ((SubLObject) (string_utilities.copy_string(tm_get_mapping_info_symbol_to_output(mapping_info)))) : tm_get_mapping_info_symbol_to_output(mapping_info), tm_get_mapping_info_print_name(mapping_info).isString() ? ((SubLObject) (string_utilities.copy_string(tm_get_mapping_info_print_name(mapping_info)))) : tm_get_mapping_info_print_name(mapping_info));
    }

    /**
     * Preconditions: Mapping-info is a structure that meets the description of <Mapping-info>
     * above and is of the same type as that returned by tm-new-mapping-info-entry.
     * New-value meets the type constraints for <Symbol-To-Output-As>
     * Postconditions:  The <Symbol-To-Output-As> field of mapping-info has been destructively
     * altered to be new-value.  Returns the new value of mapping-info.
     * Description:  Sets the symbol to output as field of mapping-info to be new-value.
     */
    public static final SubLObject tm_set_mapping_info_symbol_to_output(SubLObject new_value, SubLObject mapping_info) {
        set_nth(ZERO_INTEGER, mapping_info, new_value);
        return mapping_info;
    }

    /**
     * Preconditions: Mapping-info is a structure that meets the description of <Mapping-info>
     * above and is of the same type as that returned by tm-new-mapping-info-entry.
     * Postconditions:  The <Symbol-To-Output-As> has been returned.
     * Description:  Returns the symbol to output as field of mapping info.
     */
    public static final SubLObject tm_get_mapping_info_symbol_to_output(SubLObject mapping_info) {
        SubLSystemTrampolineFile.checkType(mapping_info, CONSP);
        return nth(ZERO_INTEGER, mapping_info);
    }

    /**
     * Preconditions: Mapping-info is a structure that meets the description of <Mapping-info>
     * above and is of the same type as that returned by tm-new-mapping-info-entry.
     * New-value meets the type constraints for <Print-Name>
     * Postconditions:  The <Print-Name> field of mapping-info has been destructively
     * altered to be new-value.  Returns the new value of mapping-info.
     * Description:  Sets the symbol to output as field of mapping-info to be new-value.
     */
    public static final SubLObject tm_set_mapping_info_print_name(SubLObject new_value, SubLObject mapping_info) {
        set_nth(ONE_INTEGER, mapping_info, new_value);
        return mapping_info;
    }

    /**
     * Preconditions: Mapping-info is a structure that meets the description of <Mapping-info>
     * above and is of the same type as that returned by tm-new-mapping-info-entry.
     * Postconditions:  The <Print-Name> has been returned.
     * Description:  Returns the print-name field of mapping info.
     */
    public static final SubLObject tm_get_mapping_info_print_name(SubLObject mapping_info) {
        SubLSystemTrampolineFile.checkType(mapping_info, CONSP);
        return nth(ONE_INTEGER, mapping_info);
    }

    // defparameter
    public static final SubLSymbol $tm_use_default_case_for_strings$ = makeSymbol("*TM-USE-DEFAULT-CASE-FOR-STRINGS*");

    // defparameter
    public static final SubLSymbol $tm_subword_delimiters$ = makeSymbol("*TM-SUBWORD-DELIMITERS*");

    public static final SubLObject tm_subword_delimiterP(SubLObject character) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return member(character, $tm_subword_delimiters$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    // defconstant
    public static final SubLSymbol $tm_default_case_as_is$ = makeSymbol("*TM-DEFAULT-CASE-AS-IS*");

    // defconstant
    public static final SubLSymbol $tm_default_case_all_upper$ = makeSymbol("*TM-DEFAULT-CASE-ALL-UPPER*");

    // defconstant
    public static final SubLSymbol $tm_default_case_all_lower$ = makeSymbol("*TM-DEFAULT-CASE-ALL-LOWER*");

    // defconstant
    public static final SubLSymbol $tm_default_case_cap_subwords$ = makeSymbol("*TM-DEFAULT-CASE-CAP-SUBWORDS*");

    // defconstant
    public static final SubLSymbol $tm_default_case_cap_first_subword$ = makeSymbol("*TM-DEFAULT-CASE-CAP-FIRST-SUBWORD*");

    public static final SubLObject tm_case_style_specifierP(SubLObject v_object) {
        if (NIL != subl_promotions.memberP(v_object, list($tm_default_case_as_is$.getGlobalValue(), $tm_default_case_all_upper$.getGlobalValue(), $tm_default_case_all_lower$.getGlobalValue(), $tm_default_case_cap_subwords$.getGlobalValue(), $tm_default_case_cap_first_subword$.getGlobalValue()), UNPROVIDED, UNPROVIDED)) {
            return T;
        } else {
            return NIL;
        }
    }

    public static final SubLObject tm_case_style_from_case_style_specifier(SubLObject case_style_specifier) {
        SubLSystemTrampolineFile.checkType(case_style_specifier, $sym161$TM_CASE_STYLE_SPECIFIER_);
        if (case_style_specifier.eql($tm_default_case_as_is$.getGlobalValue())) {
            return $$TM_String_Style_As_Is;
        } else
            if (case_style_specifier.eql($tm_default_case_all_upper$.getGlobalValue())) {
                return $$TM_String_Style_All_Uppercase;
            } else
                if (case_style_specifier.eql($tm_default_case_all_lower$.getGlobalValue())) {
                    return $$TM_String_Style_All_Lowercase;
                } else
                    if (case_style_specifier.eql($tm_default_case_cap_subwords$.getGlobalValue())) {
                        return $const165$TM_String_Style_Capitalize_Subwor;
                    } else
                        if (case_style_specifier.eql($tm_default_case_cap_first_subword$.getGlobalValue())) {
                            return $const166$TM_String_Style_Capitalize_First_;
                        } else {
                            return NIL;
                        }




    }

    /**
     * Description:  Returns the case style specifier to use for thesaurus or nil if none known.
     */
    public static final SubLObject tm_case_style_to_use_for_thesaurus(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(thesaurus, $sym167$MT_);
            if (NIL == thesaurusP(thesaurus)) {
                return NIL;
            }
            if (NIL == $tm_use_default_case_for_strings$.getDynamicValue(thread)) {
                return $tm_default_case_as_is$.getGlobalValue();
            }
            return tm_default_case_for_thesaurus(thesaurus);
        }
    }

    /**
     * Preconditions: (mt? thesaurus) => T
     * Postcondition: If there is a default case for thesaurus return
     * one of *tm-default-case-as-is*, *tm-default-case-all-upper*,
     * tm-default-case-all-lower*, *tm-default-case-cap-subwords*.
     * tm-default-case-cap-first-subword*
     * Else nil
     * Description: Returns the current default case for thesaurus or nil if none known.
     */
    public static final SubLObject tm_default_case_for_thesaurus(SubLObject thesaurus) {
        SubLSystemTrampolineFile.checkType(thesaurus, $sym167$MT_);
        {
            SubLObject value = kb_mapping_utilities.fpred_value_in_mt(thesaurus, $$tmDefaultCaseOfThesaurus, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject pcase_var = value;
            if (pcase_var.eql($$TM_String_Style_As_Is)) {
                return $tm_default_case_as_is$.getGlobalValue();
            } else
                if (pcase_var.eql($$TM_String_Style_All_Uppercase)) {
                    return $tm_default_case_all_upper$.getGlobalValue();
                } else
                    if (pcase_var.eql($$TM_String_Style_All_Lowercase)) {
                        return $tm_default_case_all_lower$.getGlobalValue();
                    } else
                        if (pcase_var.eql($const165$TM_String_Style_Capitalize_Subwor)) {
                            return $tm_default_case_cap_subwords$.getGlobalValue();
                        } else
                            if (pcase_var.eql($const166$TM_String_Style_Capitalize_First_)) {
                                return $tm_default_case_cap_first_subword$.getGlobalValue();
                            } else {
                                return NIL;
                            }




        }
    }

    /**
     * Preconditions: (mt? thesaurus) => T
     * (cor (null case-style-specifier) (tm-case-style-specifier? case-style-specifier))
     * Postcondition: If nil and
     * Description: Sets the current default case for thesaurus or just deletes current if case-style-specifier is nil.
     */
    public static final SubLObject tm_set_default_case_for_thesaurus(SubLObject thesaurus, SubLObject case_style_specifier) {
        SubLSystemTrampolineFile.checkType(thesaurus, $sym167$MT_);
        if (NIL == thesaurusP(thesaurus)) {
            return NIL;
        }
        if (NIL != case_style_specifier) {
            SubLSystemTrampolineFile.checkType(case_style_specifier, $sym161$TM_CASE_STYLE_SPECIFIER_);
        }
        {
            SubLObject current_case_style_specifier = tm_default_case_for_thesaurus(thesaurus);
            SubLObject case_style = (NIL != case_style_specifier) ? ((SubLObject) (tm_case_style_from_case_style_specifier(case_style_specifier))) : NIL;
            if (NIL != current_case_style_specifier) {
                tm_io.tm_unassert(list($$tmDefaultCaseOfThesaurus, thesaurus, tm_case_style_from_case_style_specifier(current_case_style_specifier)), tm_datastructures.$tm_mt$.getGlobalValue());
            }
            if (NIL != case_style) {
                tm_io.tm_assert(list($$tmDefaultCaseOfThesaurus, thesaurus, case_style), tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED);
            }
        }
        return NIL;
    }

    /**
     * Preconditions:  (stringp string) => T
     * (mt? thesaurus) => T
     */
    public static final SubLObject canonicalize_string_case_for_thesaurus(SubLObject string, SubLObject thesaurus) {
        SubLSystemTrampolineFile.checkType(string, STRINGP);
        SubLSystemTrampolineFile.checkType(thesaurus, $sym167$MT_);
        {
            SubLObject default_case = tm_case_style_to_use_for_thesaurus(thesaurus);
            if ($tm_default_case_all_upper$.getGlobalValue().eql(default_case)) {
                return Strings.string_upcase(string, UNPROVIDED, UNPROVIDED);
            } else
                if ($tm_default_case_all_lower$.getGlobalValue().eql(default_case)) {
                    return Strings.string_downcase(string, UNPROVIDED, UNPROVIDED);
                } else
                    if ($tm_default_case_cap_subwords$.getGlobalValue().eql(default_case)) {
                        return tm_capitalize_subwords(string);
                    } else
                        if ($tm_default_case_cap_first_subword$.getGlobalValue().eql(default_case)) {
                            return tm_capitalize_first_subword(string);
                        } else
                            if ($tm_default_case_as_is$.getGlobalValue().eql(default_case)) {
                                return string;
                            } else {
                                return string;
                            }




        }
    }

    // defvar
    private static final SubLSymbol $tm_relations_not_to_canonicalize_gaf_strings_of$ = makeSymbol("*TM-RELATIONS-NOT-TO-CANONICALIZE-GAF-STRINGS-OF*");

    /**
     * Preconditions:  (mt? thesaurus) => T
     * (predicate? (first gaf) thesaurus)
     * GAF is syntactically well formed.
     * Postconditions:  Returns a gaf with the string args in the default case style.
     */
    public static final SubLObject tm_canonicalize_gaf_strings_for_thesaurus(SubLObject gaf, SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(thesaurus, $sym167$MT_);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == fort_types_interface.predicateP(gaf.first())) {
                    Errors.error($str_alt169$Expected_a_predicate__but_got__a, gaf.first());
                }
            }
            if (NIL == thesaurusP(thesaurus)) {
                return gaf;
            }
            {
                SubLObject predicate = gaf.first();
                SubLObject string_case_style = tm_case_style_to_use_for_thesaurus(thesaurus);
                SubLObject some_string = NIL;
                if (string_case_style.eql($tm_default_case_as_is$.getGlobalValue()) || (NIL == string_case_style)) {
                    return gaf;
                }
                if (!(((NIL != tm_lexical_predicateP(predicate)) && (NIL == tm_documentation_predicateP(predicate))) && (NIL == tm_url_predicateP(predicate)))) {
                    return gaf;
                }
                if (NIL == some_string) {
                    {
                        SubLObject csome_list_var = gaf;
                        SubLObject gaf_arg = NIL;
                        for (gaf_arg = csome_list_var.first(); !((NIL != some_string) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , gaf_arg = csome_list_var.first()) {
                            some_string = stringp(gaf_arg);
                        }
                    }
                }
                if ((NIL != some_string) && (NIL == subl_promotions.memberP(predicate, $tm_relations_not_to_canonicalize_gaf_strings_of$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) {
                    {
                        SubLObject arg_num = ZERO_INTEGER;
                        SubLObject result = NIL;
                        SubLObject cdolist_list_var = gaf;
                        SubLObject arg = NIL;
                        for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                            if (arg.isString() && (NIL != tm_relation_argtype(predicate, arg_num))) {
                                result = cons(canonicalize_string_case_for_thesaurus(arg, thesaurus), result);
                            } else {
                                result = cons(arg, result);
                            }
                            arg_num = add(arg_num, ONE_INTEGER);
                        }
                        return nreverse(result);
                    }
                } else {
                    return gaf;
                }
            }
        }
    }

    /**
     * Preconditions:  (stringp string).
     * Postconditions: Returns a string string-equal to string.  Except that first subword of
     * string is capitalized (if alpha) and no other characters of string
     * are capitalized.
     * Description:  Capitalizes first subword of string.
     */
    public static final SubLObject tm_capitalize_first_subword(SubLObject string) {
        SubLSystemTrampolineFile.checkType(string, STRINGP);
        {
            SubLObject result = Strings.nstring_downcase(string_utilities.copy_string(string), UNPROVIDED, UNPROVIDED);
            SubLObject first_real_character_pos = list_utilities.position_if_not(symbol_function($sym170$TM_SUBWORD_DELIMITER_), result, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != first_real_character_pos) {
                Strings.set_char(result, first_real_character_pos, char_upcase(Strings.sublisp_char(result, first_real_character_pos)));
            }
            return result;
        }
    }

    /**
     * Preconditions:  (stringp string).
     * Postconditions: Returns a string string-equal to string.  Except that each subword of
     * string is capitalized (if alpha) and no other characters of string
     * are capitalized.
     * Descriptions:  Capitalizes each subword of string
     */
    public static final SubLObject tm_capitalize_subwords(SubLObject string) {
        SubLSystemTrampolineFile.checkType(string, STRINGP);
        {
            SubLObject result = Strings.nstring_downcase(string_utilities.copy_string(string), UNPROVIDED, UNPROVIDED);
            SubLObject start_of_substring = list_utilities.position_if_not(symbol_function($sym170$TM_SUBWORD_DELIMITER_), result, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            while (NIL != start_of_substring) {
                Strings.set_char(result, start_of_substring, char_upcase(Strings.sublisp_char(result, start_of_substring)));
                start_of_substring = position_if(symbol_function($sym170$TM_SUBWORD_DELIMITER_), result, symbol_function(IDENTITY), start_of_substring, UNPROVIDED);
                if (NIL != start_of_substring) {
                    start_of_substring = list_utilities.position_if_not(symbol_function($sym170$TM_SUBWORD_DELIMITER_), result, symbol_function(IDENTITY), start_of_substring, UNPROVIDED);
                }
            } 
            return result;
        }
    }

    // defconstant
    public static final SubLSymbol $tm_use_integrity_module$ = makeSymbol("*TM-USE-INTEGRITY-MODULE*");

    // defconstant
    public static final SubLSymbol $tm_do_not_use_integrity_module$ = makeSymbol("*TM-DO-NOT-USE-INTEGRITY-MODULE*");

    public static final SubLObject tm_integrity_module_valid_use_valueP(SubLObject v_object) {
        if (v_object.eql($tm_use_integrity_module$.getGlobalValue()) || v_object.eql($tm_do_not_use_integrity_module$.getGlobalValue())) {
            return T;
        } else {
            return NIL;
        }
    }

    /**
     * Preconditions: (mt? thesaurus) => T
     * (tmi-module? module) => T
     * Postconditions:  if (thesaurus? thesaurus) => NIL returns *tm-do-not-use-integrity-module*.
     * If the module is required, always returns *tm-use-integrity-module*.
     * Else if module should be used for integrity checking relevant to thesaurus
     * returns *tm-use-integrity-module* else returns *tm-do-not-use-integrity-module*.
     */
    public static final SubLObject tm_use_integrity_module_for_thesaurusP(SubLObject thesaurus, SubLObject module) {
        SubLSystemTrampolineFile.checkType(thesaurus, $sym167$MT_);
        SubLSystemTrampolineFile.checkType(module, $sym173$TMI_MODULE_);
        if (NIL == thesaurusP(thesaurus)) {
            return $tm_do_not_use_integrity_module$.getGlobalValue();
        }
        if (NIL != tm_integrity.tm_integrity_module_required(module)) {
            return $tm_use_integrity_module$.getGlobalValue();
        }
        if (NIL != kb_mapping_utilities.pred_u_v_holds_in_mt($$tmUseIntegrityModuleForThesaurus, thesaurus, module, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return $tm_use_integrity_module$.getGlobalValue();
        } else {
            if (NIL != kb_mapping_utilities.pred_u_v_holds_in_mt($$tmUseIntegrityModuleForThesaurus, thesaurus, module, tm_datastructures.$tm_mt$.getGlobalValue(), ONE_INTEGER, TWO_INTEGER, $FALSE)) {
                return $tm_do_not_use_integrity_module$.getGlobalValue();
            } else {
                return $tm_use_integrity_module$.getGlobalValue();
            }
        }
    }

    /**
     * Preconditions: (mt? thesaurus) => T
     * (tmi-module? module) => T
     * Postconditions:  Returns T if tm-use-integrity-module-for-thesaurus? would have returned
     * tm-use-integrity-module*, else nil.
     * Description:  Like tm-use-integrity-module-for-thesaurus?, but returns T or NIL
     */
    public static final SubLObject tm_use_integrity_module_for_thesaurus_p(SubLObject thesaurus, SubLObject module) {
        SubLSystemTrampolineFile.checkType(thesaurus, $sym167$MT_);
        SubLSystemTrampolineFile.checkType(module, $sym173$TMI_MODULE_);
        return eql(tm_use_integrity_module_for_thesaurusP(thesaurus, module), $tm_use_integrity_module$.getGlobalValue());
    }

    /**
     * Preconditions: (thesaurus? thesaurus) => T
     * (tmi-module? module) => T
     * (cor (tm-integrity-module-valid-use-value? value) (null value)) => T
     * Postconditions: If value is nil, any existing assertion is deleted.
     * Else, the KB is updated to store the information as specified by value.  Note that
     * if module is a required module the information in the KB may be ignored.  It is
     * stored however in case the module later becomes optional.
     */
    public static final SubLObject tm_set_use_value_for_integrity_module_for_thesaurus(SubLObject thesaurus, SubLObject module, SubLObject value) {
        SubLSystemTrampolineFile.checkType(thesaurus, $sym9$THESAURUS_);
        SubLSystemTrampolineFile.checkType(module, $sym173$TMI_MODULE_);
        if (NIL != value) {
            SubLSystemTrampolineFile.checkType(value, $sym176$TM_INTEGRITY_MODULE_VALID_USE_VALUE_);
        }
        if (NIL != kb_mapping_utilities.pred_u_v_holds_in_mt($$tmUseIntegrityModuleForThesaurus, thesaurus, module, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            if (!value.eql($tm_use_integrity_module$.getGlobalValue())) {
                tm_io.tm_unassert(list($$tmUseIntegrityModuleForThesaurus, thesaurus, module), tm_datastructures.$tm_mt$.getGlobalValue());
                if (NIL != value) {
                    tm_io.tm_assert(list($$not, list($$tmUseIntegrityModuleForThesaurus, thesaurus, module)), tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED);
                }
            }
        } else
            if (NIL != kb_mapping_utilities.pred_u_v_holds_in_mt($$tmUseIntegrityModuleForThesaurus, thesaurus, module, tm_datastructures.$tm_mt$.getGlobalValue(), ONE_INTEGER, TWO_INTEGER, $FALSE)) {
                if (!value.eql($tm_do_not_use_integrity_module$.getGlobalValue())) {
                    tm_io.tm_unassert(list($$not, list($$tmUseIntegrityModuleForThesaurus, thesaurus, module)), tm_datastructures.$tm_mt$.getGlobalValue());
                    if (NIL != value) {
                        tm_io.tm_assert(list($$tmUseIntegrityModuleForThesaurus, thesaurus, module), tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED);
                    }
                }
            } else
                if (NIL != value) {
                    if (value.eql($tm_use_integrity_module$.getGlobalValue())) {
                        tm_io.tm_assert(list($$tmUseIntegrityModuleForThesaurus, thesaurus, module), tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED);
                    } else {
                        tm_io.tm_assert(list($$not, list($$tmUseIntegrityModuleForThesaurus, thesaurus, module)), tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED);
                    }
                }


        return NIL;
    }

    /**
     * Returns _the_ concept which has STRING for LEXPRED in THESAURUS.  Assumes LEXPRED is singleEntryFormatInArgs in arg2.
     */
    public static final SubLObject concept_from_term_lexpred_in_thesaurus(SubLObject v_term, SubLObject lexpred, SubLObject thesaurus) {
        SubLSystemTrampolineFile.checkType(v_term, STRINGP);
        SubLSystemTrampolineFile.checkType(thesaurus, FORT_P);
        {
            SubLObject sign = tm_datastructures.unique_lexpred_sign_in_thesaurus(v_term, lexpred, thesaurus);
            return NIL != sign ? ((SubLObject) (tm_datastructures.sign_concept(sign))) : NIL;
        }
    }

    /**
     * Returns all concepts which have STRING on LEXPRED in THESAURUS.
     */
    public static final SubLObject concepts_from_term_lexpred_in_thesaurus(SubLObject v_term, SubLObject lexpred, SubLObject thesaurus) {
        SubLSystemTrampolineFile.checkType(v_term, STRINGP);
        SubLSystemTrampolineFile.checkType(lexpred, FORT_P);
        SubLSystemTrampolineFile.checkType(thesaurus, FORT_P);
        {
            SubLObject ans = tm_lexical_index.lexpred_signs_in_thesaurus(v_term, lexpred, thesaurus);
            ans = Mapping.mapcar(symbol_function(SIGN_CONCEPT), ans);
            ans = delete_duplicates(ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return ans;
        }
    }

    /**
     * Returns constants which have TERM on LEXPRED in any thesaurus.
     */
    public static final SubLObject concepts_from_term_lexpred_in_any_thesaurus(SubLObject v_term, SubLObject lexpred) {
        SubLSystemTrampolineFile.checkType(v_term, STRINGP);
        SubLSystemTrampolineFile.checkType(lexpred, FORT_P);
        {
            SubLObject ans = tm_lexical_index.lexpred_signs_all_thesauri(v_term, lexpred);
            ans = Mapping.mapcar(symbol_function(SIGN_CONCEPT), ans);
            ans = delete_duplicates(ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return ans;
        }
    }

    /**
     * Return T iff CONCEPT is an underlying concept in some thesaurus
     */
    public static final SubLObject thesaurus_concept_p(SubLObject concept) {
        return makeBoolean((NIL != forts.fort_p(concept)) && (NIL != kb_mapping_utilities.some_pred_value_in_any_mt(concept, $$preferredTerm, UNPROVIDED, UNPROVIDED)));
    }

    /**
     * Return T iff CONCEPT is an underlying concept in some browsable thesaurus.
     */
    public static final SubLObject browsable_thesaurus_concept_p(SubLObject concept) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (NIL != forts.fort_p(concept)) {
                    if (NIL == ans) {
                        {
                            SubLObject csome_list_var = browsable_thesauri(tm_datastructures.$tm_user$.getDynamicValue(thread), UNPROVIDED);
                            SubLObject thesaurus = NIL;
                            for (thesaurus = csome_list_var.first(); !((NIL != ans) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , thesaurus = csome_list_var.first()) {
                                ans = kb_mapping_utilities.some_pred_value_in_mt(concept, $$preferredTerm, thesaurus, UNPROVIDED, UNPROVIDED);
                            }
                        }
                    }
                }
                return ans;
            }
        }
    }

    /**
     * Search preferredTerms of THESAURI for an initial substring match to term STRING.
     * If THESAURI is nil, then all browsable thesauri are used.
     * If INCLUDE-VARIANTS? is non-null, then other lexical relations are searched as well.
     * If USE-LEXICON? is non-null, then the Cyc lexicon is also used in the search.
     * If SUBWORD-PREFIX? is non-null, then any thesaurus term in which string starts a word is included.
     * If BROWSABLE-ONLY? is non-null, then non-thesaurus terms will be screened out.  BROWSABLE-ONLY? only has an effect if USE-LEXICON? is non-nil.
     * If ANY-SUBSTRING? is non-null, then search for terms where STRING is any continuous substring.
     */
    public static final SubLObject search_thesauri(SubLObject string, SubLObject thesauri, SubLObject include_variantsP, SubLObject use_lexiconP, SubLObject subword_prefixP, SubLObject browsable_onlyP, SubLObject any_substringP) {
        if (thesauri == UNPROVIDED) {
            thesauri = NIL;
        }
        if (include_variantsP == UNPROVIDED) {
            include_variantsP = NIL;
        }
        if (use_lexiconP == UNPROVIDED) {
            use_lexiconP = NIL;
        }
        if (subword_prefixP == UNPROVIDED) {
            subword_prefixP = NIL;
        }
        if (browsable_onlyP == UNPROVIDED) {
            browsable_onlyP = NIL;
        }
        if (any_substringP == UNPROVIDED) {
            any_substringP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject browsable_thesauri = (NIL != thesauri) ? ((SubLObject) (thesauri)) : browsable_thesauri(tm_datastructures.$tm_user$.getDynamicValue(thread), UNPROVIDED);
                SubLObject signs = NIL;
                SubLObject rot_signs = NIL;
                SubLObject substring_signs = NIL;
                SubLObject concepts = NIL;
                if (NIL != include_variantsP) {
                    {
                        SubLObject search_relations = ((tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $INTERFACE) == $BASIC) || (NIL == tm_datastructures.$tm_user$.getDynamicValue(thread))) ? ((SubLObject) ($ALL)) : tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SEARCH_RELATIONS);
                        SubLObject lexpreds = (search_relations == $ALL) ? ((SubLObject) (tm_lexical_index.all_lexpreds())) : search_relations;
                        signs = tm_lexical_index.tm_lexpreds_complete_in_thesauri(string, lexpreds, browsable_thesauri, UNPROVIDED);
                        if (NIL != subword_prefixP) {
                            rot_signs = tm_lexical_index.tm_lexpreds_complete_in_thesauri(string, lexpreds, browsable_thesauri, T);
                        }
                        if (NIL != any_substringP) {
                            substring_signs = tm_lexical_index.tm_lexpreds_search_in_thesauri(string, lexpreds, browsable_thesauri);
                        }
                    }
                } else {
                    signs = tm_lexical_index.tm_lexpreds_complete_in_thesauri(string, $list_alt182, browsable_thesauri, UNPROVIDED);
                    if (NIL != subword_prefixP) {
                        rot_signs = tm_lexical_index.tm_lexpreds_complete_in_thesauri(string, $list_alt182, browsable_thesauri, T);
                    }
                    if (NIL != any_substringP) {
                        substring_signs = tm_lexical_index.tm_lexpreds_search_in_thesauri(string, $list_alt182, browsable_thesauri);
                    }
                }
                signs = nconc(signs, rot_signs);
                if (NIL != substring_signs) {
                    signs = remove_duplicates(nconc(signs, substring_signs), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                concepts = Mapping.mapcar(symbol_function(SIGN_CONCEPT), signs);
                if (NIL != use_lexiconP) {
                    {
                        SubLObject lexicon_answers = lexicon_accessors.denots_of_string(string, $list_alt183, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != browsable_onlyP) {
                            lexicon_answers = list_utilities.delete_if_not(symbol_function(BROWSABLE_THESAURUS_CONCEPT_P), lexicon_answers, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        concepts = nconc(concepts, lexicon_answers);
                    }
                }
                concepts = delete_duplicates(concepts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return values(concepts, signs);
            }
        }
    }

    /**
     * Search preferredTerms of THESAURI for an exact match to STRING.
     * If THESAURI is nil, then all browsable thesauri are used.
     * If INCLUDE-VARIANTS? is non-null, then other lexical relations are searched as well.
     */
    public static final SubLObject exact_search_thesauri(SubLObject string, SubLObject thesauri, SubLObject include_variantsP) {
        if (thesauri == UNPROVIDED) {
            thesauri = NIL;
        }
        if (include_variantsP == UNPROVIDED) {
            include_variantsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject browsable_thesauri = (NIL != thesauri) ? ((SubLObject) (thesauri)) : browsable_thesauri(tm_datastructures.$tm_user$.getDynamicValue(thread), UNPROVIDED);
                SubLObject signs = NIL;
                SubLObject concepts = NIL;
                if (NIL != include_variantsP) {
                    {
                        SubLObject search_relations = ((tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $INTERFACE) == $BASIC) || (NIL == tm_datastructures.$tm_user$.getDynamicValue(thread))) ? ((SubLObject) ($ALL)) : tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SEARCH_RELATIONS);
                        SubLObject lexpreds = (search_relations == $ALL) ? ((SubLObject) (tm_lexical_index.all_lexpreds())) : search_relations;
                        signs = tm_lexical_index.tm_lexpreds_exact_in_thesauri(string, lexpreds, browsable_thesauri);
                    }
                } else {
                    signs = tm_lexical_index.tm_lexpreds_exact_in_thesauri(string, $list_alt182, browsable_thesauri);
                }
                concepts = Mapping.mapcar(symbol_function(SIGN_CONCEPT), signs);
                concepts = delete_duplicates(concepts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return values(concepts, signs);
            }
        }
    }

    public static final SubLObject thesauri_of_concept(SubLObject concept) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject pred_var = $$preferredTerm;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(concept, ONE_INTEGER, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(concept, ONE_INTEGER, pred_var);
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
                                                                    SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_34);
                                                                    SubLObject valid_35 = makeBoolean(token_var_34 != as);
                                                                    if (NIL != valid_35) {
                                                                        {
                                                                            SubLObject thesaurus = assertions_high.assertion_mt(as);
                                                                            if (NIL != thesaurusP(thesaurus)) {
                                                                                ans = cons(thesaurus, ans);
                                                                            }
                                                                        }
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
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return remove_duplicates(ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    public static final SubLObject concept_in_thesaurusP(SubLObject concept, SubLObject thesaurus) {
        return kb_mapping_utilities.some_pred_value_in_mt(concept, $$preferredTerm, thesaurus, ONE_INTEGER, $TRUE);
    }

    /**
     * Return those thesauri in ACTIVE-THESAURI where STRING is a term on LEXPRED for CONCEPT.
     * If active-thesauri is NIL, the current thesauri for the user are used
     */
    public static final SubLObject active_thesauri_where_lexterm(SubLObject concept, SubLObject string, SubLObject lexpred, SubLObject active_thesauri) {
        if (active_thesauri == UNPROVIDED) {
            active_thesauri = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(concept, FORT_P);
            SubLSystemTrampolineFile.checkType(string, STRINGP);
            if (NIL == active_thesauri) {
                active_thesauri = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI);
            }
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
                        mt_relevance_macros.$relevant_mts$.bind(active_thesauri, thread);
                        {
                            SubLObject pred_var = lexpred;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(concept, ONE_INTEGER, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(concept, ONE_INTEGER, pred_var);
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
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                        {
                                                            SubLObject done_var_37 = NIL;
                                                            SubLObject token_var_38 = NIL;
                                                            while (NIL == done_var_37) {
                                                                {
                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_38);
                                                                    SubLObject valid_39 = makeBoolean(token_var_38 != ass);
                                                                    if (NIL != valid_39) {
                                                                        if (string.equalp(assertions_high.gaf_arg2(ass))) {
                                                                            ans = cons(assertions_high.assertion_mt(ass), ans);
                                                                        }
                                                                    }
                                                                    done_var_37 = makeBoolean(NIL == valid_39);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_40 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_40, thread);
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
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(ans);
            }
        }
    }

    /**
     * Constructs a unique constant name for a thesaurus with abbreviation NAME.
     */
    public static final SubLObject tm_make_thesaurus_name(SubLObject name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject constant_name = format(NIL, $str_alt185$_aThesaurusMt, string_utilities.string_subst($str_alt27$, $str_alt186$_, Strings.string_capitalize(name, UNPROVIDED, UNPROVIDED), UNPROVIDED));
                SubLObject name_to_use = NIL;
                SubLObject name_to_try = NIL;
                SubLObject suffix = NIL;
                for (name_to_try = constant_name, suffix = ONE_INTEGER; NIL == name_to_use; name_to_try = format(NIL, $str_alt187$_A__A, constant_name, suffix) , suffix = add(suffix, ONE_INTEGER)) {
                    if (!((NIL != constants_high.find_constant(name_to_try)) || ((NIL != constant_completion_high.$require_case_insensitive_name_uniqueness$.getDynamicValue(thread)) && (NIL != constant_completion_high.constant_name_case_collision(name_to_try))))) {
                        name_to_use = name_to_try;
                    }
                }
                return name_to_use;
            }
        }
    }

    /**
     * Does the KB ops for creating and setting up a new thesaurus constant with name formed from
     * THESAURUS-NAME and abbreviation ABBREV.  NOTE: there must be a :create-thesaurus
     * template in *thesaurus-cycl-templates* for this function to work.  *thesaurus-cycl-templates*
     * should be initialized by loading the proper (customer-specific) init file.
     */
    public static final SubLObject do_create_thesaurus(SubLObject thesaurus_name, SubLObject abbrev) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            abbrev = Strings.string_upcase(abbrev, UNPROVIDED, UNPROVIDED);
            {
                SubLObject thes_constant_name = tm_make_thesaurus_name(thesaurus_name);
                SubLObject result = NIL;
                SubLObject error = NIL;
                if (NIL != constant_completion_high.valid_constant_name_p(thes_constant_name)) {
                    tm_io.tm_create(thes_constant_name);
                    {
                        SubLObject constant = constants_high.find_constant(thes_constant_name);
                        if (NIL != forts.valid_fortP(constant)) {
                            {
                                SubLObject template = second(assoc($CREATE_THESAURUS, tm_datastructures.$thesaurus_cycl_templates$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
                                if (template.isCons()) {
                                    template = subst(constant, $CONSTANT, template, symbol_function(EQUAL), UNPROVIDED);
                                    template = subst(thesaurus_name, $NAME, template, symbol_function(EQUAL), UNPROVIDED);
                                    template = subst(abbrev, $ABBREV, template, symbol_function(EQUAL), UNPROVIDED);
                                    {
                                        SubLObject cdolist_list_var = template;
                                        SubLObject form = NIL;
                                        for (form = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , form = cdolist_list_var.first()) {
                                            {
                                                SubLObject cycl = form.first();
                                                SubLObject mt = second(form);
                                                tm_io.tm_assert(cycl, mt, T);
                                                tm_io.tm_timestamp_assertion();
                                            }
                                        }
                                    }
                                    result = constant;
                                    if (NIL == fi.fi_error_signaledP()) {
                                        {
                                            SubLObject log_string = format(NIL, $str_alt191$Create_Thesaurus__a___a_, thesaurus_name, abbrev);
                                            tm_logging.tm_enqueue_op_for_log(log_string, $OK, NIL, bq_cons(tm_logging.tm_log_id(constant), $list_alt193));
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    error = format(NIL, $str_alt194$Invalid_constant_name__A_derived_, thes_constant_name, thesaurus_name);
                }
                return values(result, error);
            }
        }
    }

    /**
     * Preconditions: (stringp string) => T
     * Description:
     * Returns a string to be used as the constant name for an output filter constant
     * by affixing some string to the end of the input string.  The name returned
     * is guaranteed to be unused by any other cyc constant.
     */
    public static final SubLObject tm_make_filter_name(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(string, STRINGP);
            {
                SubLObject trial_string = cconcatenate(Strings.string_capitalize(string, UNPROVIDED, UNPROVIDED), $$$OutputFilter);
                SubLObject name_to_use = NIL;
                SubLObject trial_suffix = NIL;
                SubLObject suffix_num = NIL;
                for (trial_suffix = $str_alt27$, suffix_num = ZERO_INTEGER; NIL == name_to_use; trial_suffix = format(NIL, $str_alt196$__a, suffix_num) , suffix_num = add(ONE_INTEGER, suffix_num)) {
                    if (!((NIL != constants_high.find_constant(cconcatenate(trial_string, trial_suffix))) || ((NIL != constant_completion_high.$require_case_insensitive_name_uniqueness$.getDynamicValue(thread)) && (NIL != constant_completion_high.constant_name_case_collision(cconcatenate(trial_string, trial_suffix)))))) {
                        name_to_use = cconcatenate(trial_string, trial_suffix);
                    }
                }
                return name_to_use;
            }
        }
    }

    public static final SubLObject do_create_output_filter(SubLObject filter_short_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject filter_name = tm_make_filter_name(filter_short_name);
                SubLObject result = NIL;
                SubLObject error = NIL;
                if (NIL != constant_completion_high.valid_constant_name_p(filter_name)) {
                    tm_io.tm_create(filter_name);
                    {
                        SubLObject filter_constant = constants_high.find_constant(filter_name);
                        if (NIL != forts.valid_fortP(filter_constant)) {
                            {
                                SubLObject template = second(assoc($CREATE_OUTPUT_FILTER, tm_datastructures.$thesaurus_cycl_templates$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
                                if (template.isCons()) {
                                    template = subst(filter_constant, $CONSTANT, template, symbol_function(EQUAL), UNPROVIDED);
                                    template = subst(filter_short_name, $NAME, template, symbol_function(EQUAL), UNPROVIDED);
                                    {
                                        SubLObject cdolist_list_var = template;
                                        SubLObject form = NIL;
                                        for (form = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , form = cdolist_list_var.first()) {
                                            {
                                                SubLObject cycl = form.first();
                                                SubLObject mt = second(form);
                                                tm_io.tm_assert(cycl, mt, T);
                                                tm_io.tm_timestamp_assertion();
                                            }
                                        }
                                    }
                                    result = filter_constant;
                                    if (NIL == fi.fi_error_signaledP()) {
                                        {
                                            SubLObject log_string = format(NIL, $str_alt198$Create_Output_Filter__a, filter_name);
                                            tm_logging.tm_enqueue_op_for_log(log_string, $OK, NIL, bq_cons(tm_logging.tm_log_id(filter_constant), $list_alt193));
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    error = format(NIL, $str_alt199$Invalid_output_filter_name__A_der, filter_short_name, filter_name);
                }
                return values(result, error);
            }
        }
    }

    public static final SubLObject do_delete_thesaurus(SubLObject thesaurus_constant) {
        return tm_kill(thesaurus_constant);
    }

    public static final SubLObject tm_kill(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(fort, FORT_P);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != tm_datastructures.$tm_user$.getDynamicValue(thread)) && (NIL != tm_user_constant_from_user_name(tm_datastructures.$tm_user$.getDynamicValue(thread))))) {
                    Errors.error($str_alt200$Can_t_kill_terms_without_a_known_);
                }
            }
            {
                SubLObject _prev_bind_0 = control_vars.$use_transcriptP$.currentBinding(thread);
                SubLObject _prev_bind_1 = api_control_vars.$the_cyclist$.currentBinding(thread);
                SubLObject _prev_bind_2 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                try {
                    control_vars.$use_transcriptP$.bind(tm_control_vars.$tm_default_save_operations_value$.getDynamicValue(thread), thread);
                    api_control_vars.$the_cyclist$.bind(tm_user_constant_from_user_name(tm_datastructures.$tm_user$.getDynamicValue(thread)), thread);
                    api_control_vars.$use_local_queueP$.bind(NIL, thread);
                    ke.ke_kill(fort);
                } finally {
                    api_control_vars.$use_local_queueP$.rebind(_prev_bind_2, thread);
                    api_control_vars.$the_cyclist$.rebind(_prev_bind_1, thread);
                    control_vars.$use_transcriptP$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    /**
     * If arg1 in a #$broaderTerm assertion is a top term, demote it.
     */
    public static final SubLObject tm_possibly_demote_top(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject thesaurus = assertions_high.assertion_mt(assertion);
                SubLObject arg1 = assertions_high.gaf_arg1(assertion);
                {
                    SubLObject _prev_bind_0 = control_vars.$use_transcriptP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    SubLObject _prev_bind_2 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                    try {
                        control_vars.$use_transcriptP$.bind(tm_control_vars.$tm_default_save_operations_value$.getDynamicValue(thread), thread);
                        api_control_vars.$the_cyclist$.bind(tm_user_constant_from_user_name(tm_datastructures.$tm_user$.getDynamicValue(thread)), thread);
                        api_control_vars.$use_local_queueP$.bind(NIL, thread);
                        if (NIL != top_in_thesaurusP(arg1, thesaurus)) {
                            fi.fi_unassert_int(list($$topInThesaurus, arg1, thesaurus), tm_datastructures.$tm_mt$.getGlobalValue());
                        }
                    } finally {
                        api_control_vars.$use_local_queueP$.rebind(_prev_bind_2, thread);
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_1, thread);
                        control_vars.$use_transcriptP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Deletes the thesaurus having the name string THESAURUS-NAME.
     * This function is intended to be called via the Cyc API port.
     */
    public static final SubLObject tm_api_delete_thesaurus(SubLObject thesaurus_name) {
        SubLSystemTrampolineFile.checkType(thesaurus_name, STRINGP);
        {
            SubLObject thesaurus_constant = thesaurus_constant_from_name(thesaurus_name);
            if (NIL == thesaurusP(thesaurus_constant)) {
                Errors.error($str_alt202$_A_is_not_the_name_of_a_known_the, thesaurus_name);
            }
            {
                SubLObject successP = NIL;
                SubLObject identifier = tm_logging.tm_log_id(thesaurus_constant);
                successP = tm_datastructures.tm_start_write_operation(thesaurus_constant);
                if (NIL != successP) {
                    try {
                        tm_datastructures.clear_thesaurus_from_tm_state(thesaurus_constant);
                        do_delete_thesaurus(thesaurus_constant);
                        tm_logging.tm_enqueue_op_for_log(format(NIL, $str_alt203$Delete_thesaurus__a, thesaurus_name), $OK, NIL, bq_cons(identifier, $list_alt193));
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                tm_datastructures.tm_finish_write_operation(thesaurus_constant);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                } else {
                    {
                        SubLObject message = cconcatenate($str_alt204$Deletion_of_thesaurus_, new SubLObject[]{ thesaurus_name, $str_alt205$_is_not_permitted_at_this_time__b });
                        Errors.error(message);
                    }
                }
            }
        }
        return $$$Success;
    }

    /**
     * For use in an API thread that forks.  Deletes the thesaurus named THESAURUS-NAME and saves a world in WORLD-PATHNAME, redirecting all output to LOG-PATHNAME.
     */
    public static final SubLObject tm_api_delete_thesaurus_with_save_and_log(SubLObject thesaurus_name, SubLObject world_pathname, SubLObject log_pathname) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(thesaurus_name, STRINGP);
            SubLSystemTrampolineFile.checkType(world_pathname, STRINGP);
            SubLSystemTrampolineFile.checkType(log_pathname, STRINGP);
            {
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(log_pathname, $OUTPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt212$Unable_to_open__S, log_pathname);
                    }
                    {
                        SubLObject output = stream;
                        {
                            SubLObject _prev_bind_0 = StreamsLow.$standard_output$.currentBinding(thread);
                            try {
                                StreamsLow.$standard_output$.bind(output, thread);
                                format(output, $str_alt213$__Deleting__A____, thesaurus_name);
                                force_output(UNPROVIDED);
                                tm_api_delete_thesaurus(thesaurus_name);
                                format(output, $str_alt214$__Finished_deleting__A_, thesaurus_name);
                                format(output, $str_alt215$__Saving_a_world_to__A____, world_pathname);
                                force_output(UNPROVIDED);
                                operation_communication.write_cyc_image(world_pathname, T);
                                format(output, $str_alt216$__Finished_saving_a_world_to__A_, world_pathname);
                                force_output(UNPROVIDED);
                            } finally {
                                StreamsLow.$standard_output$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return format(NIL, $str_alt217$World_is_saved_in__S, world_pathname);
        }
    }

    public static final SubLObject do_create_relation() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DEFINE_RELATION_STATE)) {
                return values(NIL, $list_alt223, NIL);
            }
            {
                SubLObject relation_name = html_tm_relation_editing.get_define_relation_value($RELATION_NAME);
                SubLObject relation_constant_name = cconcatenate($$$tm, string_utilities.remove_substring(Strings.string_capitalize(relation_name, UNPROVIDED, UNPROVIDED), $str_alt226$_));
                SubLObject result = NIL;
                SubLObject errors = NIL;
                SubLObject warnings = NIL;
                SubLObject formula_mt_pairs = NIL;
                SubLObject failedP = NIL;
                SubLObject name_to_use = NIL;
                SubLObject name_to_try = NIL;
                SubLObject suffix = NIL;
                for (name_to_try = relation_constant_name, suffix = ONE_INTEGER; NIL == name_to_use; name_to_try = format(NIL, $str_alt187$_A__A, relation_constant_name, suffix) , suffix = add(suffix, ONE_INTEGER)) {
                    if (NIL == constants_high.find_constant(name_to_try)) {
                        name_to_use = name_to_try;
                    }
                }
                {
                    SubLObject _prev_bind_0 = control_vars.$use_transcriptP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    SubLObject _prev_bind_2 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = fi.$fi_error$.currentBinding(thread);
                    SubLObject _prev_bind_4 = fi.$fi_warning$.currentBinding(thread);
                    try {
                        control_vars.$use_transcriptP$.bind(tm_control_vars.$tm_default_save_operations_value$.getDynamicValue(thread), thread);
                        api_control_vars.$the_cyclist$.bind(tm_user_constant_from_user_name(tm_datastructures.$tm_user$.getDynamicValue(thread)), thread);
                        api_control_vars.$use_local_queueP$.bind(NIL, thread);
                        fi.$fi_error$.bind(NIL, thread);
                        fi.$fi_warning$.bind(NIL, thread);
                        ke.ke_create(name_to_use);
                        if (NIL != fi.fi_error_signaledP()) {
                            failedP = T;
                            errors = cons(tm_express_fi_message(fi.fi_get_error_int()), errors);
                        }
                        if (NIL != fi.fi_warning_signaledP()) {
                            warnings = cons(tm_express_fi_message(fi.fi_get_warning_int()), warnings);
                        }
                        {
                            SubLObject relation_constant = constants_high.find_constant(name_to_use);
                            result = relation_constant;
                        }
                    } finally {
                        fi.$fi_warning$.rebind(_prev_bind_4, thread);
                        fi.$fi_error$.rebind(_prev_bind_3, thread);
                        api_control_vars.$use_local_queueP$.rebind(_prev_bind_2, thread);
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_1, thread);
                        control_vars.$use_transcriptP$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == forts.valid_fortP(result)) {
                    errors = cons($NOT_CREATED, errors);
                    return values(result, errors, warnings);
                }
                formula_mt_pairs = tm_create_relation_formulas(result);
                if (!formula_mt_pairs.isCons()) {
                    errors = cons($NO_TEMPLATE, errors);
                    return values(result, errors, warnings);
                }
                {
                    SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    SubLObject _prev_bind_2 = control_vars.$use_transcriptP$.currentBinding(thread);
                    try {
                        api_control_vars.$use_local_queueP$.bind(NIL, thread);
                        api_control_vars.$the_cyclist$.bind(tm_user_constant_from_user_name(tm_datastructures.$tm_user$.getDynamicValue(thread)), thread);
                        control_vars.$use_transcriptP$.bind(tm_control_vars.$tm_default_save_operations_value$.getDynamicValue(thread), thread);
                        if (NIL == failedP) {
                            {
                                SubLObject csome_list_var = formula_mt_pairs;
                                SubLObject command = NIL;
                                for (command = csome_list_var.first(); !((NIL != failedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , command = csome_list_var.first()) {
                                    {
                                        SubLObject cycl = command.first();
                                        SubLObject mt = second(command);
                                        {
                                            SubLObject _prev_bind_0_41 = fi.$fi_error$.currentBinding(thread);
                                            SubLObject _prev_bind_1_42 = fi.$fi_warning$.currentBinding(thread);
                                            try {
                                                fi.$fi_error$.bind(NIL, thread);
                                                fi.$fi_warning$.bind(NIL, thread);
                                                failedP = makeBoolean(NIL == ke.ke_assert(cycl, mt, UNPROVIDED, UNPROVIDED));
                                                if (NIL != fi.fi_warning_signaledP()) {
                                                    warnings = cons(tm_express_fi_message(fi.fi_get_warning_int()), warnings);
                                                }
                                                if (NIL != fi.fi_error_signaledP()) {
                                                    errors = cons(tm_express_fi_message(fi.fi_get_error_int()), errors);
                                                }
                                            } finally {
                                                fi.$fi_warning$.rebind(_prev_bind_1_42, thread);
                                                fi.$fi_error$.rebind(_prev_bind_0_41, thread);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        control_vars.$use_transcriptP$.rebind(_prev_bind_2, thread);
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_1, thread);
                        api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == failedP) {
                    tm_datastructures.init_tm_relation_predicate_map_from_kb();
                    {
                        SubLObject relation_name_43 = html_tm_relation_editing.get_define_relation_value($RELATION_NAME);
                        SubLObject inverse_name = html_tm_relation_editing.get_define_relation_value($INVERSE_NAME);
                        SubLObject relations = NIL;
                        if (NIL != relation_name_43) {
                            relations = cons(relation_name_43, relations);
                        }
                        if (NIL != inverse_name) {
                            {
                                SubLObject item_var = inverse_name;
                                if (NIL == member(item_var, relations, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                                    relations = cons(item_var, relations);
                                }
                            }
                        }
                        tm_io.add_entries_to_pred_symbol_sort_order(relations);
                    }
                }
                return values(result, errors, warnings);
            }
        }
    }

    public static final SubLObject tm_create_relation_formulas(SubLObject relation_constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject relation_name = html_tm_relation_editing.get_define_relation_value($RELATION_NAME);
                SubLObject inverse_name = html_tm_relation_editing.get_define_relation_value($INVERSE_NAME);
                SubLObject type = html_tm_relation_editing.get_define_relation_value($RELATION_TYPE);
                SubLObject comment = html_tm_relation_editing.get_define_relation_value($COMMENT);
                SubLObject arg1_type = html_tm_relation_editing.get_define_relation_value($ARG1_TYPE);
                SubLObject arg2_type = html_tm_relation_editing.get_define_relation_value($ARG2_TYPE);
                SubLObject arg1_format = html_tm_relation_editing.get_define_relation_value($ARG1_FORMAT);
                SubLObject arg2_format = html_tm_relation_editing.get_define_relation_value($ARG2_FORMAT);
                SubLObject transitiveP = html_tm_relation_editing.get_define_relation_value($kw236$TRANSITIVE_);
                SubLObject genlpreds = html_tm_relation_editing.get_define_relation_value($GENLPREDS);
                SubLObject genlinverses = html_tm_relation_editing.get_define_relation_value($GENLINVERSE);
                SubLObject symmetricP = html_tm_relation_editing.get_define_relation_value($SYMMETRIC_);
                SubLObject formula_mt_pairs = second(assoc($CREATE_RELATION, tm_datastructures.$thesaurus_cycl_templates$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
                if (NIL == formula_mt_pairs) {
                    return NIL;
                }
                arg1_format = (arg1_format.equalp($MANY)) ? ((SubLObject) ($$openEntryFormatInArgs)) : $$singleEntryFormatInArgs;
                arg2_format = (arg2_format.equalp($MANY)) ? ((SubLObject) ($$openEntryFormatInArgs)) : $$singleEntryFormatInArgs;
                arg1_type = (arg1_type.equal($PT)) ? ((SubLObject) ($$CycLReifiableDenotationalTerm)) : $$CharacterString;
                arg2_type = (arg2_type.equal($PT)) ? ((SubLObject) ($$CycLReifiableDenotationalTerm)) : $$CharacterString;
                formula_mt_pairs = subst(relation_constant, $RELATION, formula_mt_pairs, UNPROVIDED, UNPROVIDED);
                formula_mt_pairs = subst(arg1_format, $ARG1_FORMAT, formula_mt_pairs, UNPROVIDED, UNPROVIDED);
                formula_mt_pairs = subst(arg2_format, $ARG2_FORMAT, formula_mt_pairs, UNPROVIDED, UNPROVIDED);
                formula_mt_pairs = subst(arg1_type, $ARG1_ISA, formula_mt_pairs, UNPROVIDED, UNPROVIDED);
                formula_mt_pairs = subst(arg2_type, $ARG2_ISA, formula_mt_pairs, UNPROVIDED, UNPROVIDED);
                formula_mt_pairs = subst(comment, $COMMENT, formula_mt_pairs, UNPROVIDED, UNPROVIDED);
                formula_mt_pairs = subst(relation_name, $RELATION_NAME, formula_mt_pairs, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject pcase_var = type;
                    if (pcase_var.eql($LEXICAL)) {
                        formula_mt_pairs = cons(list(list(tm_datastructures.$tm_lexical_predicate_pred$.getGlobalValue(), relation_constant), tm_datastructures.$tm_mt$.getGlobalValue()), formula_mt_pairs);
                    } else
                        if (pcase_var.eql($DOCUMENTATION)) {
                            formula_mt_pairs = cons(list(listS($$isa, relation_constant, $list_alt247), tm_datastructures.$tm_mt$.getGlobalValue()), formula_mt_pairs);
                        } else
                            if (pcase_var.eql($URL)) {
                                formula_mt_pairs = cons(list(listS($$isa, relation_constant, $list_alt248), tm_datastructures.$tm_mt$.getGlobalValue()), formula_mt_pairs);
                            }


                }
                if (NIL != inverse_name) {
                    formula_mt_pairs = cons(list(list($$tmInverseSymbol, relation_constant, inverse_name), tm_datastructures.$tm_mt$.getGlobalValue()), formula_mt_pairs);
                }
                if (symmetricP.equalp($$$symmetric)) {
                    formula_mt_pairs = cons(list(listS($$isa, relation_constant, $list_alt250), tm_datastructures.$tm_mt$.getGlobalValue()), formula_mt_pairs);
                }
                if (symmetricP.equalp($$$asymmetric)) {
                    formula_mt_pairs = cons(list(listS($$isa, relation_constant, $list_alt252), tm_datastructures.$tm_mt$.getGlobalValue()), formula_mt_pairs);
                }
                if (NIL != transitiveP) {
                    formula_mt_pairs = cons(list(listS($$isa, relation_constant, $list_alt253), tm_datastructures.$tm_mt$.getGlobalValue()), formula_mt_pairs);
                }
                {
                    SubLObject cdolist_list_var = genlpreds;
                    SubLObject genlpred = NIL;
                    for (genlpred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genlpred = cdolist_list_var.first()) {
                        formula_mt_pairs = cons(list(list($$genlPreds, relation_constant, relation_constant_from_abbreviation(genlpred)), tm_datastructures.$tm_mt$.getGlobalValue()), formula_mt_pairs);
                    }
                }
                {
                    SubLObject cdolist_list_var = genlinverses;
                    SubLObject genlinverse = NIL;
                    for (genlinverse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genlinverse = cdolist_list_var.first()) {
                        formula_mt_pairs = cons(list(list($$genlInverse, relation_constant, relation_constant_from_abbreviation(genlinverse)), tm_datastructures.$tm_mt$.getGlobalValue()), formula_mt_pairs);
                    }
                }
                return nreverse(formula_mt_pairs);
            }
        }
    }

    /**
     * returns a string expressing the content of an *fi-error* or *fi-warning* message.
     */
    public static final SubLObject tm_express_fi_message(SubLObject message) {
        {
            SubLObject format_string = second(message);
            SubLObject args = nthcdr(TWO_INTEGER, message);
            SubLObject ans = NIL;
            if (NIL != format_string) {
                ans = apply(symbol_function(FORMAT), NIL, new SubLObject[]{ format_string, args });
            } else {
                ans = princ_to_string(message);
            }
            return ans;
        }
    }

    public static final SubLObject do_kill_relation(SubLObject constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == tm_user_constant_from_user_name(tm_datastructures.$tm_user$.getDynamicValue(thread))) {
                    Errors.error($str_alt255$Can_t_kill_relations_without_a_kn);
                }
            }
            {
                SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                SubLObject _prev_bind_1 = control_vars.$use_transcriptP$.currentBinding(thread);
                SubLObject _prev_bind_2 = api_control_vars.$the_cyclist$.currentBinding(thread);
                try {
                    api_control_vars.$use_local_queueP$.bind(NIL, thread);
                    control_vars.$use_transcriptP$.bind(tm_control_vars.$tm_default_save_operations_value$.getDynamicValue(thread), thread);
                    api_control_vars.$the_cyclist$.bind(tm_user_constant_from_user_name(tm_datastructures.$tm_user$.getDynamicValue(thread)), thread);
                    {
                        SubLObject relation = tm_pred_arg_symbol(constant, ONE_INTEGER);
                        SubLObject relation_inv = tm_pred_arg_symbol(constant, TWO_INTEGER);
                        SubLObject relation_symbols = NIL;
                        SubLObject relation_name_change_list = NIL;
                        if (NIL != relation) {
                            relation_symbols = cons(relation, relation_symbols);
                        }
                        if (NIL != relation_inv) {
                            {
                                SubLObject item_var = relation_inv;
                                if (NIL == member(item_var, relation_symbols, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                                    relation_symbols = cons(item_var, relation_symbols);
                                }
                            }
                        }
                        relation_name_change_list = Mapping.mapcar(symbol_function(LIST), relation_symbols);
                        tm_io.remove_entries_from_pred_symbol_sort_order(relation_symbols);
                        tm_kill(constant);
                        {
                            SubLObject cdolist_list_var = tm_make_list_of_ops_to_edit_filters_for_relation_edit(relation_name_change_list, NIL);
                            SubLObject assert_unassert = NIL;
                            for (assert_unassert = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assert_unassert = cdolist_list_var.first()) {
                                eval(assert_unassert);
                            }
                        }
                        tm_update_all_cached_filters();
                        tm_datastructures.init_tm_relation_predicate_map_from_kb();
                    }
                } finally {
                    api_control_vars.$the_cyclist$.rebind(_prev_bind_2, thread);
                    control_vars.$use_transcriptP$.rebind(_prev_bind_1, thread);
                    api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject compute_longest_parent_path(SubLObject paths) {
        {
            SubLObject n = ZERO_INTEGER;
            SubLObject cdolist_list_var = paths;
            SubLObject p = NIL;
            for (p = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , p = cdolist_list_var.first()) {
                {
                    SubLObject len = length(p);
                    if (len.numG(n)) {
                        n = len;
                    }
                }
            }
            return n;
        }
    }

    public static final SubLObject compress_parent_paths(SubLObject paths) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            tm_datastructures.clear_utility_tables(tm_datastructures.$tm_user$.getDynamicValue(thread));
            {
                SubLObject table = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UTILITY_TABLE_1);
                SubLObject len = length(last(paths, UNPROVIDED).first());
                SubLObject ans = NIL;
                SubLObject temp = NIL;
                SubLObject n = NIL;
                for (n = subtract(len, ONE_INTEGER); !n.numL(ZERO_INTEGER); n = subtract(n, ONE_INTEGER)) {
                    {
                        SubLObject cdolist_list_var = paths;
                        SubLObject path = NIL;
                        for (path = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , path = cdolist_list_var.first()) {
                            {
                                SubLObject end = nth(n, path);
                                if (NIL != end) {
                                    if (NIL == gethash(end, table, UNPROVIDED)) {
                                        {
                                            SubLObject item_var = end;
                                            if (NIL == member(item_var, temp, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                temp = cons(item_var, temp);
                                            }
                                        }
                                        sethash(end, table, T);
                                    }
                                }
                            }
                        }
                    }
                    if (NIL != temp) {
                        ans = cons(nreverse(temp), ans);
                    }
                    temp = NIL;
                }
                return ans;
            }
        }
    }

    public static final SubLObject construct_parent_paths_int(SubLObject v_term, SubLObject mts, SubLObject path, SubLObject predicate, SubLObject count, SubLObject max, SubLObject relations_to_use, SubLObject relation_term_indices) {
        if (path == UNPROVIDED) {
            path = NIL;
        }
        if (predicate == UNPROVIDED) {
            predicate = $$broaderTerm;
        }
        if (count == UNPROVIDED) {
            count = ZERO_INTEGER;
        }
        if (max == UNPROVIDED) {
            max = NIL;
        }
        if (relations_to_use == UNPROVIDED) {
            relations_to_use = NIL;
        }
        if (relation_term_indices == UNPROVIDED) {
            relation_term_indices = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
                    mt_relevance_macros.$relevant_mts$.bind(mts, thread);
                    {
                        SubLObject parents = delete(v_term, bt(v_term, predicate, mts, NIL, NIL, relations_to_use, relation_term_indices), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject preferred_parents = list_utilities.delete_if_not(symbol_function(PREFERRED_TERMS), parents, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject new_path = (NIL != path) ? ((SubLObject) (append(path, list(v_term)))) : list(v_term);
                        if (((NIL == preferred_parents) || (NIL != find(v_term, path, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (max.isInteger() && count.numGE(max))) {
                            {
                                SubLObject np = new_path.rest();
                                if (NIL != np) {
                                    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $GRAPH_PATHS, nreverse(np), $CONS);
                                }
                            }
                        } else {
                            {
                                SubLObject cdolist_list_var = preferred_parents;
                                SubLObject p = NIL;
                                for (p = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , p = cdolist_list_var.first()) {
                                    construct_parent_paths_int(p, mts, new_path, predicate, add(count, ONE_INTEGER), max, relations_to_use, relation_term_indices);
                                }
                            }
                        }
                    }
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject construct_parent_paths(SubLObject v_term, SubLObject mts, SubLObject max, SubLObject predicate, SubLObject relations_to_use, SubLObject relation_term_indices) {
        if (max == UNPROVIDED) {
            max = NIL;
        }
        if (predicate == UNPROVIDED) {
            predicate = $$broaderTerm;
        }
        if (relations_to_use == UNPROVIDED) {
            relations_to_use = NIL;
        }
        if (relation_term_indices == UNPROVIDED) {
            relation_term_indices = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            tm_datastructures.clear_utility_tables(tm_datastructures.$tm_user$.getDynamicValue(thread));
            tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $GRAPH_PATHS, NIL, UNPROVIDED);
            {
                SubLObject constant = function_terms.naut_to_nart(v_term);
                SubLObject all_spec_preds = NIL;
                SubLObject active_relations = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        if (NIL == relations_to_use) {
                            all_spec_preds = genl_predicates.all_spec_predicates(predicate, UNPROVIDED, UNPROVIDED);
                            active_relations = tm_active_relations();
                            relations_to_use = intersection(all_spec_preds, active_relations, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                construct_parent_paths_int(constant, mts, NIL, predicate, ZERO_INTEGER, max, relations_to_use, relation_term_indices);
            }
            {
                SubLObject paths = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $GRAPH_PATHS);
                SubLObject len = compute_longest_parent_path(paths);
                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $LONGEST_PATH, len, UNPROVIDED);
                paths = Sort.sort(paths, symbol_function($sym261$_), symbol_function(LENGTH));
                return paths;
            }
        }
    }

    public static final SubLObject declarative_top_in_thesaurusP(SubLObject concept, SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(tm_datastructures.$tm_mt$.getGlobalValue(), thread);
                        ans = kb_mapping_utilities.pred_u_v_holds($$topInThesaurus, concept, thesaurus, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static final SubLObject declarative_top_in_which_thesauri(SubLObject v_term) {
        return kb_mapping_utilities.pred_values_in_any_mt(v_term, $$topInThesaurus, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject top_in_thesaurusP(SubLObject concept, SubLObject thesaurus) {
        return declarative_top_in_thesaurusP(concept, thesaurus);
    }

    /**
     * Return T iff CONCEPT has no broader terms in THESAURUS
     */
    public static final SubLObject possible_top_in_thesaurusP(SubLObject concept, SubLObject thesaurus) {
        SubLSystemTrampolineFile.checkType(concept, FORT_P);
        return numE(ZERO_INTEGER, kb_indexing.num_gaf_arg_index(concept, ONE_INTEGER, $$broaderTerm, thesaurus));
    }

    /**
     * Return a list of the declared tops in THESAURUS
     */
    public static final SubLObject thesaurus_tops(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(tm_datastructures.$tm_mt$.getGlobalValue(), thread);
                        ans = kb_mapping_utilities.pred_values(thesaurus, $$topInThesaurus, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     * Assert that CONCEPT is a top in THESAURUS
     */
    public static final SubLObject assert_thesaurus_top(SubLObject concept, SubLObject thesaurus) {
        SubLSystemTrampolineFile.checkType(concept, FORT_P);
        SubLSystemTrampolineFile.checkType(thesaurus, FORT_P);
        tm_io.tm_load_assert(list($$topInThesaurus, concept, thesaurus), tm_datastructures.$tm_mt$.getGlobalValue(), T);
        return NIL;
    }

    public static final SubLObject update_compute_tops_results(SubLObject results_table, SubLObject v_term, SubLObject mt) {
        {
            SubLObject val = gethash(v_term, results_table, UNPROVIDED);
            if (NIL == find(mt, val, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                sethash(v_term, results_table, cons(mt, val));
            }
        }
        return NIL;
    }

    public static final SubLObject compute_tops_1(SubLObject results_table, SubLObject v_term, SubLObject mt, SubLObject already_seen, SubLObject relation) {
        if (already_seen == UNPROVIDED) {
            already_seen = NIL;
        }
        if (relation == UNPROVIDED) {
            relation = $$broaderTerm;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject broad = delete(v_term, bt(v_term, relation, mt, tm_active_relations(), UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject preferred = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        preferred = list_utilities.delete_if_not(symbol_function(PREFERRED_TERMS), broad, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != preferred) {
                    {
                        SubLObject cdolist_list_var = preferred;
                        SubLObject p = NIL;
                        for (p = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , p = cdolist_list_var.first()) {
                            if (NIL != find(p, already_seen, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                update_compute_tops_results(results_table, p, mt);
                            } else {
                                compute_tops_1(results_table, p, mt, cons(p, already_seen), relation);
                            }
                        }
                    }
                } else {
                    update_compute_tops_results(results_table, v_term, mt);
                }
                return NIL;
            }
        }
    }

    public static final SubLObject first_preferred_term_of_car(SubLObject form) {
        return preferred_terms(form.first()).first();
    }

    public static final SubLObject compute_tops(SubLObject v_term, SubLObject thesauri_list, SubLObject relation) {
        if (relation == UNPROVIDED) {
            relation = $$broaderTerm;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            v_term = function_terms.naut_to_nart(v_term);
            {
                SubLObject table_1 = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UTILITY_TABLE_1);
                SubLObject results_table = (table_1.isHashtable()) ? ((SubLObject) (table_1)) : make_hash_table($int$50, symbol_function(EQUAL), UNPROVIDED);
                SubLObject result = NIL;
                clrhash(results_table);
                {
                    SubLObject cdolist_list_var = thesauri_list;
                    SubLObject thesaurus = NIL;
                    for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                        if ((NIL != find(thesaurus, thesauri_of_concept(v_term), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != tm_datastructures.concept_term(v_term, thesaurus))) {
                            compute_tops_1(results_table, v_term, thesaurus, NIL, relation);
                        }
                    }
                }
                {
                    SubLObject key = NIL;
                    SubLObject val = NIL;
                    {
                        final Iterator cdohash_iterator = getEntrySetIterator(results_table);
                        try {
                            while (iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                key = getEntryKey(cdohash_entry);
                                val = getEntryValue(cdohash_entry);
                                result = cons(list(key, val), result);
                            } 
                        } finally {
                            releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
                clrhash(results_table);
                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UTILITY_TABLE_1, results_table, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
                        mt_relevance_macros.$relevant_mts$.bind(thesauri_list, thread);
                        result = Sort.sort(result, symbol_function(STRING_LESSP), symbol_function(FIRST_PREFERRED_TERM_OF_CAR));
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Number of terms to display before the specified term in the alphabetical index
     */
    // defparameter
    public static final SubLSymbol $tm_alpha_before$ = makeSymbol("*TM-ALPHA-BEFORE*");

    /**
     * Number of terms to display after (& including) the specified term in the alphabetical index
     */
    // defparameter
    public static final SubLSymbol $tm_alpha_after$ = makeSymbol("*TM-ALPHA-AFTER*");

    // defparameter
    public static final SubLSymbol $tm_alpha_total_count$ = makeSymbol("*TM-ALPHA-TOTAL-COUNT*");

    public static final SubLObject tm_alphabetical_placement(SubLObject string, SubLObject before_count, SubLObject after_count) {
        if (before_count == UNPROVIDED) {
            before_count = $tm_alpha_before$.getDynamicValue();
        }
        if (after_count == UNPROVIDED) {
            after_count = $tm_alpha_after$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(string, STRINGP);
            {
                SubLObject found = NIL;
                SubLObject before = NIL;
                SubLObject after = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject before_set = tm_datastructures.tm_alpha_around(string, before_count, after_count, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $ALPHABETICAL_SHOW_USE_FORS), T);
                    SubLObject after_set = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    before = before_set;
                    after = after_set;
                }
                if (string.equalp(after.first().first())) {
                    found = after.first();
                    after = after.rest();
                }
                return values(found, before, after);
            }
        }
    }

    // defconstant
    private static final SubLSymbol $tm_operation_arg_type_string$ = makeSymbol("*TM-OPERATION-ARG-TYPE-STRING*");

    /**
     * Used privately in syntax checking.  Each member of the list could possible.
     */
    // defconstant
    private static final SubLSymbol $tm_maybe_use_case_defaults$ = makeSymbol("*TM-MAYBE-USE-CASE-DEFAULTS*");

    public static final SubLObject tm_maybe_use_case_default_for_operation_typeP(SubLObject opcode) {
        if (NIL == tm_datastructures.tm_opcodeP(opcode)) {
            return Errors.error($str_alt267$Unknown_operation__a, opcode);
        }
        return member(opcode, $tm_maybe_use_case_defaults$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Indexes according to opcode a list which describes what arg of the predicate an
     * arg in the operation list maps to.  The operation list is expected to be in the
     * format it would be after it enters check-argument-syntax, but prior to entry
     * of and individual op checking functions (e.g. check-replace-operation)
     */
    // defparameter
    private static final SubLSymbol $operation_arg_list_to_predicate_arg_list_map$ = makeSymbol("*OPERATION-ARG-LIST-TO-PREDICATE-ARG-LIST-MAP*");

    /**
     * A predicate's arg list is  (predicate-0 arg-1 arg-2 arg-3 ...)
     * An operation's arg list is for op with opcode operation
     * (tm-op-args op) => (arg-0 arg-1 arg-2 arg-3)
     * This function returns a list, arg-map, s.t. arg-n of op is intended to be used in
     * the (nth n arg-map) position of predicate's arg list.  If (nth n arg-map) is nil,
     * then then arg-n of op is not expected to be used in predicate.  Because operation arg lists
     * may vary in size, the list arg-map returned may be smaller than the arg list if none of the
     * remaining operation args are expected to be used in a given predicate.  The predicate to
     * be used for is implicit by the operation type.  A value eql to *tm-operation-arg-type-string*
     * means that the corresponding entry is a string type.
     */
    public static final SubLObject get_operation_arg_list_map(SubLObject opcode) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == tm_datastructures.tm_opcodeP(opcode)) {
                return Errors.error($str_alt267$Unknown_operation__a, opcode);
            }
            return assoc(opcode, $operation_arg_list_to_predicate_arg_list_map$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
        }
    }

    public static final SubLObject check_operation_syntax(SubLObject op) {
        tm_datastructures._csetf_tm_op_status(op, $OK);
        if ((tm_datastructures.tm_op_opcode(op).isString() && (NIL != Strings.stringE(tm_datastructures.tm_op_opcode(op), $str_alt27$, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (NIL == tm_datastructures.tm_op_opcode(op))) {
            return tm_datastructures.set_op_status(op, $NO_OPCODE, $str_alt272$No_operation_was_specified_, NIL);
        }
        if (tm_datastructures.tm_op_opcode(op).isString()) {
            tm_datastructures._csetf_tm_op_opcode(op, read_from_string_ignoring_errors(tm_datastructures.tm_op_opcode(op), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        if (NIL == tm_datastructures.tm_opcodeP(tm_datastructures.tm_op_opcode(op))) {
            return tm_datastructures.set_op_status(op, $INVALID_OPCODE, $str_alt274$The_operation__A_is_unknown_, list(tm_datastructures.tm_op_opcode(op)));
        }
        if (NIL == constant_handles.constant_p(tm_datastructures.tm_op_thesaurus(op))) {
            if (tm_datastructures.tm_op_thesaurus(op).isString()) {
                {
                    SubLObject thesaurus = thesaurus_constant_from_abbreviation(tm_datastructures.tm_op_thesaurus(op));
                    if (NIL != thesaurus) {
                        tm_datastructures._csetf_tm_op_thesaurus(op, thesaurus);
                    } else {
                        thesaurus = thesaurus_constant_from_name(tm_datastructures.tm_op_thesaurus(op));
                        if (NIL != thesaurus) {
                            tm_datastructures._csetf_tm_op_thesaurus(op, thesaurus);
                        } else {
                            return tm_datastructures.set_op_status(op, $INVALID_THESAURUS_ABBREV, $str_alt276$__A__does_not_refer_to_a_known_th, list(tm_datastructures.tm_op_thesaurus(op)));
                        }
                    }
                }
            } else {
                return tm_datastructures.set_op_status(op, $NO_THESAURUS_SPECIFIED, $str_alt278$No_thesauri_were_specified_, NIL);
            }
        }
        if (NIL != thesaurusP(tm_datastructures.tm_op_thesaurus(op))) {
            if (NIL != tm_datastructures.tm_thesaurus_unwritableP(tm_datastructures.tm_op_thesaurus(op))) {
                return tm_datastructures.set_op_status(op, $THESAURUS_UNWRITABLE, $str_alt280$Editing__A_is_currently_blocked_b, list(thesaurus_name(tm_datastructures.tm_op_thesaurus(op))));
            }
        }
        if (NIL != subl_promotions.memberP(tm_datastructures.tm_op_opcode(op), $list_alt281, UNPROVIDED, UNPROVIDED)) {
            if (NIL == forts.fort_p(tm_datastructures.tm_op_relation(op))) {
                if (tm_datastructures.tm_op_relation(op).isString()) {
                    {
                        SubLObject relation = relation_constant_from_abbreviation(tm_datastructures.tm_op_relation(op));
                        if (NIL != relation) {
                            if (NIL != tm_inactive_relation_p(relation)) {
                                return tm_datastructures.set_op_status(op, $INACTIVE_RELATION, $str_alt283$_A_is_not_an_active_relation_, list(tm_datastructures.tm_op_relation_abbrev(op)));
                            } else {
                                {
                                    SubLObject inverseP = numE(third(assoc(tm_datastructures.tm_op_relation(op), tm_datastructures.$tm_relation_predicate_map$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED)), TWO_INTEGER);
                                    if (NIL != inverseP) {
                                        tm_datastructures._csetf_tm_op_inverseP(op, T);
                                        if (tm_datastructures.tm_op_opcode(op) != $REPLACE) {
                                            tm_datastructures._csetf_tm_op_args(op, reverse(tm_datastructures.tm_op_args(op)));
                                        }
                                    }
                                    tm_datastructures._csetf_tm_op_relation(op, relation);
                                }
                            }
                        } else {
                            return tm_datastructures.set_op_status(op, $INVALID_RELATION_ABBREV, $str_alt286$__A__does_not_refer_to_a_known_re, list(tm_datastructures.tm_op_relation_abbrev(op)));
                        }
                    }
                } else {
                    return tm_datastructures.set_op_status(op, $NO_RELATION_SPECIFIED, $str_alt288$No_relation_was_specified_, NIL);
                }
            }
        }
        check_operation_string_args_case(op);
        {
            SubLObject pcase_var = tm_datastructures.tm_op_opcode(op);
            if (pcase_var.eql($SPLICE_OUT) || pcase_var.eql($NUKE)) {
                check_delete_term_operation(op);
            } else
                if (pcase_var.eql($CONVERT_NT_UF)) {
                    check_convert_nt_uf_operation(op);
                } else
                    if (pcase_var.eql($CREATE)) {
                        check_create_operation(op);
                    } else
                        if (pcase_var.eql($REPLACE)) {
                            check_replace_operation(op);
                        } else
                            if (pcase_var.eql($EDIT)) {
                                check_edit_operation(op);
                            } else
                                if (pcase_var.eql($SWAP)) {
                                    check_swap_pt_uf_operation(op);
                                } else {
                                    check_operation_argument_syntax(op);
                                }





            if (tm_datastructures.tm_op_status(op) != $OK) {
                return op;
            }
        }
        return op;
    }

    /**
     * If (tm-op-relation op) is not a predicate? or is not a tm-lexical-predicate? or is a
     * tm-documentation-predicate? or tm-url-predicate? returns op.  Else checks case of any
     * string args.
     */
    public static final SubLObject check_operation_string_args_case(SubLObject op) {
        if (NIL == tm_maybe_use_case_default_for_operation_typeP(tm_datastructures.tm_op_opcode(op))) {
            return op;
        }
        {
            SubLObject old_op_arg_list = tm_datastructures.tm_op_args(op);
            SubLObject thesaurus = tm_datastructures.tm_op_thesaurus(op);
            SubLObject relation = tm_datastructures.tm_op_relation(op);
            SubLObject actual_relationP = fort_types_interface.predicateP(relation);
            SubLObject new_op_arg_list = NIL;
            if (!((((NIL != actual_relationP) && (NIL != tm_lexical_predicateP(relation))) && (NIL == tm_documentation_predicateP(relation))) && (NIL == tm_url_predicateP(relation)))) {
                return op;
            }
            {
                SubLObject current_arg = NIL;
                SubLObject arg_map = NIL;
                SubLObject mapping = NIL;
                for (current_arg = old_op_arg_list.first(), arg_map = get_operation_arg_list_map(tm_datastructures.tm_op_opcode(op)), mapping = arg_map.first(); !(((NIL == mapping) && (NIL == arg_map)) || (NIL == old_op_arg_list)); current_arg = old_op_arg_list.first() , arg_map = arg_map.rest() , mapping = arg_map.first()) {
                    old_op_arg_list = old_op_arg_list.rest();
                    if (NIL != mapping) {
                        if (mapping.eql($tm_operation_arg_type_string$.getGlobalValue()) || ((NIL != actual_relationP) && tm_relation_argtype(relation, mapping).eql($STRING))) {
                            current_arg = canonicalize_string_case_for_thesaurus(current_arg, thesaurus);
                        }
                    }
                    new_op_arg_list = cons(current_arg, new_op_arg_list);
                }
            }
            tm_datastructures._csetf_tm_op_args(op, nconc(nreverse(new_op_arg_list), old_op_arg_list));
            return op;
        }
    }

    public static final SubLObject check_delete_term_operation(SubLObject op) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            tm_datastructures.note_op_verify(op, NIL, NIL);
            thread.resetMultipleValues();
            {
                SubLObject new_arg = check_operation_argument(op, tm_datastructures.tm_op_args(op).first(), ONE_INTEGER, tm_datastructures.tm_op_relation(op), tm_datastructures.tm_op_thesaurus(op));
                SubLObject arg_okP = thread.secondMultipleValue();
                thread.resetMultipleValues();
            }
            return op;
        }
    }

    public static final SubLObject check_edit_operation(SubLObject op) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject relation = tm_datastructures.tm_op_relation(op);
                SubLObject thesaurus = tm_datastructures.tm_op_thesaurus(op);
                SubLObject term_idx = (NIL != tm_datastructures.tm_op_inverseP(op)) ? ((SubLObject) (TWO_INTEGER)) : ONE_INTEGER;
                SubLObject value_idx = (term_idx.numE(TWO_INTEGER)) ? ((SubLObject) (ONE_INTEGER)) : TWO_INTEGER;
                SubLObject v_term = nth(subtract(term_idx, ONE_INTEGER), tm_datastructures.tm_op_args(op));
                if (!arity.arity(relation).numE(TWO_INTEGER)) {
                    return tm_datastructures.set_op_status(op, $NON_BINARY_RELATION, $str_alt295$The__EDIT_operation_can_only_be_p, NIL);
                }
                thread.resetMultipleValues();
                {
                    SubLObject new_term_sign = check_operation_argument(op, v_term, term_idx, relation, thesaurus);
                    SubLObject term_okP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != term_okP) {
                        {
                            SubLObject raw_values = NIL;
                            SubLObject values = NIL;
                            if ((NIL == tm_datastructures.signp(new_term_sign)) && (relation != $$useFor)) {
                                tm_datastructures.set_op_status(op, $UNABLE_TO_EDIT, $str_alt297$Unable_to_EDIT__S__A__since__A_is, list(v_term, tm_datastructures.tm_op_relation_abbrev(op), tm_datastructures.tm_op_relation_abbrev(op)));
                                return op;
                            }
                            if ((NIL == tm_datastructures.signp(new_term_sign)) && (relation == $$useFor)) {
                                raw_values = tm_lexical_index.lexpred_signs_in_thesaurus(v_term, $$useFor, thesaurus);
                                if ((NIL != list_utilities.singletonP(raw_values)) && (NIL != tm_datastructures.signp(raw_values.first()))) {
                                    raw_values = list(tm_datastructures.sign_concept(raw_values.first()));
                                } else
                                    if (NIL == raw_values) {
                                        tm_datastructures.set_op_status(op, $NOT_A_UF, $str_alt299$Unable_to_EDIT__S__A__since__S_is, list(v_term, tm_datastructures.tm_op_relation_abbrev(op), v_term, tm_datastructures.tm_op_thesaurus_name(op)));
                                        return op;
                                    } else {
                                        tm_datastructures.set_op_status(op, $AMBIGUOUS_UF, $str_alt301$Unable_to_EDIT__S__A__since__S_is, list(v_term, tm_datastructures.tm_op_relation_abbrev(op), v_term, tm_datastructures.tm_op_thesaurus_name(op)));
                                        return op;
                                    }

                            } else {
                                raw_values = kb_mapping_utilities.pred_values_in_mt(tm_datastructures.sign_concept(new_term_sign), relation, thesaurus, term_idx, value_idx, UNPROVIDED);
                            }
                            if (NIL != kb_accessors.symmetric_predicateP(relation)) {
                                raw_values = nconc(raw_values, kb_mapping_utilities.pred_values_in_mt(tm_datastructures.sign_concept(new_term_sign), relation, thesaurus, value_idx, term_idx, UNPROVIDED));
                            }
                            if (tm_relation_argtype(relation, value_idx) == $CONSTANT) {
                                {
                                    SubLObject cdolist_list_var = raw_values;
                                    SubLObject value = NIL;
                                    for (value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , value = cdolist_list_var.first()) {
                                        values = cons(tm_datastructures.concept_term(value, thesaurus), values);
                                    }
                                }
                            } else {
                                values = raw_values;
                            }
                            tm_datastructures._csetf_tm_op_args(op, NIL != tm_datastructures.tm_op_inverseP(op) ? ((SubLObject) (list(string_utilities.collapse_lines(values), new_term_sign))) : list(new_term_sign, string_utilities.collapse_lines(values)));
                        }
                    }
                }
            }
            return op;
        }
    }

    public static final SubLObject check_convert_nt_uf_operation(SubLObject op) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            tm_datastructures.note_op_verify(op, NIL, NIL);
            thread.resetMultipleValues();
            {
                SubLObject new_arg = check_operation_argument(op, tm_datastructures.tm_op_args(op).first(), ONE_INTEGER, tm_datastructures.tm_op_relation(op), tm_datastructures.tm_op_thesaurus(op));
                SubLObject arg_okP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != arg_okP) {
                    tm_datastructures._csetf_tm_op_args(op, list(new_arg));
                }
            }
            return op;
        }
    }

    public static final SubLObject check_create_operation(SubLObject op) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject thesaurus = tm_datastructures.tm_op_thesaurus(op);
                SubLObject new_concepts = NIL;
                SubLObject new_concept_signs = NIL;
                SubLObject new_broader_terms = NIL;
                SubLObject datum = tm_datastructures.tm_op_args(op);
                SubLObject current = datum;
                SubLObject v_term = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt302);
                v_term = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt302);
                {
                    SubLObject temp = current.rest();
                    current = current.first();
                    {
                        SubLObject concept = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt302);
                        concept = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject broader_terms = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt302);
                                broader_terms = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (NIL != tm_lexical_index.lexpred_signs_in_thesaurus(v_term, $$preferredTerm, thesaurus)) {
                                        return tm_datastructures.set_op_status(op, $TERM_EXISTS, $str_alt304$_S_is_already_a_preferred_term_, list(v_term));
                                    }
                                    if (NIL != tm_lexical_index.lexpred_signs_in_thesaurus(v_term, $$useFor, thesaurus)) {
                                        return tm_datastructures.set_op_status(op, $TERM_EXISTS, $str_alt305$_S_is_already_a_use_for_, list(v_term));
                                    }
                                    if (NIL != list_utilities.every_in_list(symbol_function($sym306$TM_STOPLIST_WORD_), string_utilities.split_string(v_term, UNPROVIDED), UNPROVIDED)) {
                                        return tm_datastructures.set_op_status(op, $STOPLIST_WORD, $str_alt308$_S_is_made_only_of_stoplist_words, list(v_term));
                                    }
                                    {
                                        SubLObject cdolist_list_var = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI);
                                        SubLObject other_thesaurus = NIL;
                                        for (other_thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , other_thesaurus = cdolist_list_var.first()) {
                                            {
                                                SubLObject signs = tm_lexical_index.signs_of_lexpreds_in_thesaurus(v_term, $list_alt309, other_thesaurus);
                                                if (NIL != signs) {
                                                    new_concept_signs = nconc(signs, new_concept_signs);
                                                }
                                            }
                                        }
                                    }
                                    {
                                        SubLObject cdolist_list_var = new_concept_signs;
                                        SubLObject sign = NIL;
                                        for (sign = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sign = cdolist_list_var.first()) {
                                            {
                                                SubLObject item_var = tm_datastructures.sign_concept(sign);
                                                if (NIL == member(item_var, new_concepts, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                    new_concepts = cons(item_var, new_concepts);
                                                }
                                            }
                                        }
                                    }
                                    new_concepts = nconc(new_concepts, tm_io.tm_create_correlate_concept(v_term, broader_terms, thesaurus, new_concepts));
                                    new_concepts = list_utilities.remove_if_not(symbol_function(FORT_P), new_concepts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    new_concepts = remove_duplicates(new_concepts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    {
                                        SubLObject temp_44 = NIL;
                                        SubLObject cdolist_list_var = new_concepts;
                                        SubLObject concept_45 = NIL;
                                        for (concept_45 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , concept_45 = cdolist_list_var.first()) {
                                            if (NIL == concept_in_thesaurusP(concept_45, thesaurus)) {
                                                temp_44 = cons(concept_45, temp_44);
                                            }
                                        }
                                        new_concepts = nreverse(temp_44);
                                    }
                                    if (NIL != new_concepts) {
                                        tm_datastructures._csetf_tm_op_verifyP(op, T);
                                    }
                                    new_concepts = cons(concept, new_concepts);
                                    {
                                        SubLObject cdolist_list_var = broader_terms;
                                        SubLObject broader_term = NIL;
                                        for (broader_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , broader_term = cdolist_list_var.first()) {
                                            {
                                                SubLObject sign = NIL;
                                                SubLObject lexpred = NIL;
                                                try {
                                                    sign = tm_datastructures.unique_lexpred_sign_in_thesaurus(broader_term, $$preferredTerm, thesaurus);
                                                } catch (Throwable ccatch_env_var) {
                                                    lexpred = Errors.handleThrowable(ccatch_env_var, $MULTIPLE_LEXPRED);
                                                }
                                                if (NIL != lexpred) {
                                                    return tm_datastructures.set_op_status(op, $MULTIPLE_LEXPRED, $str_alt311$_S_has_multiple_preferred_term_st, list(broader_term, thesaurus_name(thesaurus)));
                                                }
                                                if (NIL != sign) {
                                                    new_broader_terms = cons(sign, new_broader_terms);
                                                } else {
                                                    tm_datastructures._csetf_tm_op_verifyP(op, T);
                                                    new_broader_terms = cons(broader_term, new_broader_terms);
                                                }
                                            }
                                        }
                                    }
                                    if (NIL == broader_terms) {
                                        tm_datastructures._csetf_tm_op_verifyP(op, T);
                                    }
                                    tm_datastructures._csetf_tm_op_args(op, list(v_term, new_concepts, nreverse(new_broader_terms)));
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt302);
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt302);
                        }
                    }
                }
            }
            return op;
        }
    }

    public static final SubLObject replace_arg_position(SubLObject inverseP, SubLObject i) {
        if (NIL != inverseP) {
            return elt($list_alt312, i);
        } else {
            return elt($list_alt313, i);
        }
    }

    public static final SubLObject check_replace_operation(SubLObject op) {
        {
            SubLObject relation = tm_datastructures.tm_op_relation(op);
            SubLObject thesaurus = tm_datastructures.tm_op_thesaurus(op);
            SubLObject original_args = tm_datastructures.tm_op_args(op);
            SubLObject v_arity = arity.arity(relation);
            SubLObject inverseP = tm_datastructures.tm_op_inverseP(op);
            SubLObject new_args = NIL;
            if (NIL != forts.fort_p(relation)) {
                if (!v_arity.equal(TWO_INTEGER)) {
                    return tm_datastructures.set_op_status(op, $IMPLEMENTATION_ERROR, $str_alt315$Implementation_error__The_relatio, list(relation));
                }
                if (!length(original_args).eql(THREE_INTEGER)) {
                    return tm_datastructures.set_op_status(op, $BAD_ARGLIST, $str_alt317$Replace_requires_3_arguements__te, list(original_args));
                }
                {
                    SubLObject args = NIL;
                    SubLObject arg = NIL;
                    SubLObject i = NIL;
                    for (args = original_args, arg = args.first(), i = ZERO_INTEGER; NIL != args; args = args.rest() , arg = args.first() , i = add(i, ONE_INTEGER)) {
                        if ((NIL != tm_datastructures.signp(arg)) || (NIL != forts.fort_p(arg))) {
                            new_args = cons(arg, new_args);
                        } else
                            if (arg.isString()) {
                                {
                                    SubLObject pcase_var = tm_relation_argtype(relation, replace_arg_position(inverseP, i));
                                    if (pcase_var.eql($CONSTANT)) {
                                        arg = canonicalize_lexical_term(arg);
                                        {
                                            SubLObject preferred = NIL;
                                            SubLObject lexpred = NIL;
                                            try {
                                                preferred = tm_datastructures.unique_lexpred_sign_in_thesaurus(arg, $$preferredTerm, thesaurus);
                                            } catch (Throwable ccatch_env_var) {
                                                lexpred = Errors.handleThrowable(ccatch_env_var, $MULTIPLE_LEXPRED);
                                            }
                                            if (NIL != lexpred) {
                                                return tm_datastructures.set_op_status(op, $MULTIPLE_LEXPRED, $str_alt318$_S_has_multiple_preferred_term_st, list(arg, thesaurus_name(thesaurus)));
                                            }
                                            if (NIL != preferred) {
                                                new_args = cons(tm_datastructures.sign_concept(preferred), new_args);
                                                tm_datastructures._csetf_tm_op_verifyP(op, NIL);
                                            } else {
                                                {
                                                    SubLObject use_fors = tm_lexical_index.lexpred_signs_in_thesaurus(arg, $$useFor, thesaurus);
                                                    if (NIL != use_fors) {
                                                        if ((NIL != list_utilities.singletonP(use_fors)) && (NIL != tm_datastructures.signp(use_fors.first()))) {
                                                            preferred = tm_datastructures.concept_term(tm_datastructures.sign_concept(use_fors.first()), thesaurus);
                                                            new_args = cons(tm_datastructures.sign_concept(use_fors.first()), new_args);
                                                            tm_datastructures.note_op_verify(op, $str_alt319$__A__UF___A__in__A_, list(preferred, arg, thesaurus_name(thesaurus)));
                                                        } else {
                                                            return tm_datastructures.set_op_status(op, $AMBIGUOUS_UF, $str_alt320$Can_t_disambiguate__S__since_it_s, list(arg, thesaurus_name(thesaurus)));
                                                        }
                                                    } else {
                                                        return tm_datastructures.set_op_status(op, $INVALID_TERM, $str_alt322$_S_is_not_a_term_in_the_thesaurus, list(arg, thesaurus_name(thesaurus)));
                                                    }
                                                }
                                            }
                                        }
                                    } else
                                        if (pcase_var.eql($STRING)) {
                                            arg = string_utilities.trim_whitespace(arg);
                                            if (NIL != tm_lexical_predicateP(relation)) {
                                                arg = canonicalize_lexical_term(arg);
                                            }
                                            new_args = cons(arg, new_args);
                                        } else {
                                            return tm_datastructures.set_op_status(op, $UNKNOWN_ARGUMENT, $str_alt324$Could_not_parse_the_argument__A_, list(arg));
                                        }

                                }
                            } else {
                                return tm_datastructures.set_op_status(op, $UNKNOWN_ARGUMENT, $str_alt324$Could_not_parse_the_argument__A_, list(arg));
                            }

                    }
                }
            }
            tm_datastructures._csetf_tm_op_args(op, nreverse(new_args));
        }
        return op;
    }

    public static final SubLObject check_swap_pt_uf_operation(SubLObject op) {
        {
            SubLObject concept = tm_datastructures.tm_op_args(op).first();
            SubLObject pt = second(tm_datastructures.tm_op_args(op));
            SubLObject uf = third(tm_datastructures.tm_op_args(op));
            SubLObject thesaurus = tm_datastructures.tm_op_thesaurus(op);
            SubLObject pt_sign = NIL;
            SubLObject use_for_signs = tm_lexical_index.lexpred_signs_in_thesaurus(uf, $$useFor, thesaurus);
            SubLObject lexpred = NIL;
            try {
                pt_sign = tm_datastructures.unique_lexpred_sign_in_thesaurus(pt, $$preferredTerm, thesaurus);
            } catch (Throwable ccatch_env_var) {
                lexpred = Errors.handleThrowable(ccatch_env_var, $MULTIPLE_LEXPRED);
            }
            if (NIL != lexpred) {
                return tm_datastructures.set_op_status(op, $MULTIPLE_LEXPRED, $str_alt311$_S_has_multiple_preferred_term_st, list(pt, thesaurus_name(thesaurus)));
            }
            if (NIL == tm_datastructures.signp(pt_sign)) {
                return tm_datastructures.set_op_status(op, $NOT_PT, $str_alt326$_S_is_not_a_preferred_term_in__A, list(pt, tm_datastructures.tm_op_thesaurus_name(op)));
            }
            if (NIL == list_utilities.singletonP(use_for_signs)) {
                return tm_datastructures.set_op_status(op, $AMBIGUOUS_UF, $str_alt327$_S_is_also_a_UF_for_another_term_, list(uf, tm_datastructures.tm_op_thesaurus_name(op)));
            }
            if (tm_datastructures.sign_concept(use_for_signs.first()) != tm_datastructures.sign_concept(pt_sign)) {
                return tm_datastructures.set_op_status(op, $NOT_UF, $str_alt329$_S_is_not_a_UF_for___A__in__A, list(uf, pt, tm_datastructures.tm_op_thesaurus_name(op)));
            }
            tm_datastructures._csetf_tm_op_args(op, list(concept, pt_sign, use_for_signs.first()));
        }
        return op;
    }

    public static final SubLObject check_operation_argument_syntax(SubLObject op) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_args = NIL;
                SubLObject relation = tm_datastructures.tm_op_relation(op);
                SubLObject thesaurus = tm_datastructures.tm_op_thesaurus(op);
                SubLObject original_args = tm_datastructures.tm_op_args(op);
                SubLObject v_arity = arity.arity(relation);
                if (NIL != forts.fort_p(relation)) {
                    if (!v_arity.equal(length(original_args))) {
                        return tm_datastructures.set_op_status(op, $BAD_ARGLIST, $str_alt330$The_relation__A_requires__D_argum, list(relation, arity.arity(relation), length(original_args)));
                    }
                    if (((v_arity.eql(TWO_INTEGER) && (tm_datastructures.tm_op_opcode(op) == $DELETE)) && (NIL != tm_utilities.tm_single_entry_formatP(relation, TWO_INTEGER, tm_datastructures.$tm_mt$.getGlobalValue()))) && (NIL == second(original_args))) {
                        {
                            SubLObject arg1 = original_args.first();
                            SubLObject lexpred = NIL;
                            SubLObject value = NIL;
                            if (arg1.isString()) {
                                try {
                                    arg1 = tm_datastructures.unique_lexpred_sign_in_thesaurus(arg1, $$preferredTerm, thesaurus);
                                } catch (Throwable ccatch_env_var) {
                                    lexpred = Errors.handleThrowable(ccatch_env_var, $MULTIPLE_LEXPRED);
                                }
                                if (NIL != lexpred) {
                                    return tm_datastructures.set_op_status(op, $MULTIPLE_LEXPRED, $str_alt331$_S_has_multple_preferred_term_sta, list(arg1, thesaurus_name(thesaurus)));
                                }
                            }
                            if (NIL != tm_datastructures.signp(arg1)) {
                                arg1 = tm_datastructures.sign_concept(arg1);
                            }
                            if (NIL != forts.fort_p(arg1)) {
                                value = kb_mapping_utilities.fpred_value_in_mt(arg1, relation, thesaurus, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            if (NIL != value) {
                                original_args = list(original_args.first(), value);
                            }
                        }
                    }
                    {
                        SubLObject args = NIL;
                        SubLObject arg = NIL;
                        SubLObject i = NIL;
                        for (args = original_args, arg = args.first(), i = ONE_INTEGER; NIL != args; args = args.rest() , arg = args.first() , i = add(i, ONE_INTEGER)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject new_arg = check_operation_argument(op, arg, i, relation, thesaurus);
                                SubLObject okP = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != okP) {
                                    new_args = cons(new_arg, new_args);
                                } else {
                                    return op;
                                }
                            }
                        }
                    }
                }
                tm_datastructures._csetf_tm_op_args(op, nreverse(new_args));
            }
            return op;
        }
    }

    public static final SubLObject check_operation_argument(SubLObject op, SubLObject arg, SubLObject index, SubLObject relation, SubLObject thesaurus) {
        if ((NIL != tm_datastructures.signp(arg)) || (NIL != forts.fort_p(arg))) {
            return values(arg, T);
        } else
            if (arg.isString()) {
                {
                    SubLObject pcase_var = tm_relation_argtype(relation, index);
                    if (pcase_var.eql($CONSTANT)) {
                        arg = canonicalize_lexical_term(arg);
                        {
                            SubLObject preferred = NIL;
                            SubLObject lexpred = NIL;
                            try {
                                preferred = tm_datastructures.unique_lexpred_sign_in_thesaurus(arg, $$preferredTerm, thesaurus);
                            } catch (Throwable ccatch_env_var) {
                                lexpred = Errors.handleThrowable(ccatch_env_var, $MULTIPLE_LEXPRED);
                            }
                            if (NIL != lexpred) {
                                return tm_datastructures.set_op_status(op, $MULTIPLE_LEXPRED, $str_alt318$_S_has_multiple_preferred_term_st, list(arg, thesaurus_name(thesaurus)));
                            }
                            if (NIL != preferred) {
                                return values(preferred, T);
                            } else {
                                {
                                    SubLObject use_fors = tm_lexical_index.lexpred_signs_in_thesaurus(arg, $$useFor, thesaurus);
                                    if (NIL != use_fors) {
                                        if (NIL != list_utilities.singletonP(use_fors)) {
                                            preferred = tm_datastructures.concept_term(tm_datastructures.sign_concept(use_fors.first()), thesaurus);
                                            tm_datastructures.note_op_verify(op, $str_alt319$__A__UF___A__in__A_, list(preferred, arg, thesaurus_name(thesaurus)));
                                            return values(tm_datastructures.unique_lexpred_sign_in_thesaurus(preferred, $$preferredTerm, thesaurus), T);
                                        } else {
                                            tm_datastructures.set_op_status(op, $AMBIGUOUS_UF, $str_alt332$Can_t_disambiguate__S__because_it, list(arg, thesaurus_name(thesaurus)));
                                            return values(arg, NIL);
                                        }
                                    } else {
                                        tm_datastructures.set_op_status(op, $INVALID_TERM, $str_alt333$_S_is_not_a_term_in_the_thesaurus, list(arg));
                                        return values(arg, NIL);
                                    }
                                }
                            }
                        }
                    } else
                        if (pcase_var.eql($STRING)) {
                            arg = string_utilities.trim_whitespace(arg);
                            if (NIL != tm_lexical_predicateP(relation)) {
                                arg = canonicalize_lexical_term(arg);
                            }
                            return values(arg, T);
                        } else {
                            tm_datastructures.set_op_status(op, $UNKNOWN_ARGUMENT, $str_alt324$Could_not_parse_the_argument__A_, list(arg));
                            return values(arg, NIL);
                        }

                }
            } else
                if (arg.isCons()) {
                    {
                        SubLObject pcase_var = tm_relation_argtype(relation, index);
                        if (pcase_var.eql($LIST)) {
                            return values(arg, NIL);
                        } else {
                            tm_datastructures.set_op_status(op, $UNKNOWN_ARGUMENT, $str_alt324$Could_not_parse_the_argument__A_, list(arg));
                            return values(arg, NIL);
                        }
                    }
                } else {
                    tm_datastructures.set_op_status(op, $UNKNOWN_ARGUMENT, $str_alt324$Could_not_parse_the_argument__A_, list(arg));
                    return values(arg, NIL);
                }


    }

    // defparameter
    private static final SubLSymbol $relation_checker_alist$ = makeSymbol("*RELATION-CHECKER-ALIST*");

    public static final SubLObject check_op_sn(SubLObject op) {
        {
            SubLObject args = tm_datastructures.tm_op_args(op);
            SubLObject thesaurus = tm_datastructures.tm_op_thesaurus(op);
            SubLObject v_term = (NIL != tm_datastructures.signp(args.first())) ? ((SubLObject) (tm_datastructures.sign_concept(args.first()))) : args.first();
            SubLObject new_value = (tm_datastructures.tm_op_opcode(op).equal($REPLACE)) ? ((SubLObject) (third(args))) : second(args);
            if (tm_datastructures.tm_op_opcode(op).eql($ADD) || tm_datastructures.tm_op_opcode(op).eql($REPLACE)) {
                if (new_value.equalp($str_alt27$)) {
                    tm_datastructures.set_op_status(op, $BAD_VALUE, $str_alt336$Can_t_add_the_empty_string_as_a_s, NIL);
                }
            }
            {
                SubLObject pcase_var = tm_datastructures.tm_op_opcode(op);
                if (pcase_var.eql($ADD)) {
                    {
                        SubLObject other = kb_mapping_utilities.fpred_value_in_mt(v_term, $$scopeNote, tm_datastructures.tm_op_thesaurus(op), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != other) {
                            tm_datastructures.set_op_status(op, $ALREADY_HAS_SCOPE_NOTE, $str_alt338$__a__already_has_the_scope_note__, list(tm_datastructures.concept_term(v_term, tm_datastructures.tm_op_thesaurus(op)), other, thesaurus_name(tm_datastructures.tm_op_thesaurus(op))));
                        }
                    }
                } else
                    if (pcase_var.eql($REPLACE)) {
                        {
                            SubLObject old_value = second(args);
                            if (!kb_mapping_utilities.fpred_value_in_mt(v_term, $$scopeNote, thesaurus, UNPROVIDED, UNPROVIDED, UNPROVIDED).equalp(old_value)) {
                                tm_datastructures.set_op_status(op, $RELATION_NOT_THERE, $str_alt340$Can_t_delete___a__SN__S, list(tm_datastructures.concept_term(v_term, tm_datastructures.tm_op_thesaurus(op)), old_value));
                            }
                        }
                    }

            }
        }
        return op;
    }

    public static final SubLObject check_op_uf(SubLObject op) {
        if (tm_datastructures.tm_op_opcode(op) == $ADD) {
            {
                SubLObject thesaurus = tm_datastructures.tm_op_thesaurus(op);
                SubLObject arg2 = second(tm_datastructures.tm_op_args(op));
                SubLObject preferred = tm_lexical_index.lexpred_signs_in_thesaurus(arg2, $$preferredTerm, thesaurus);
                if (NIL != preferred) {
                    tm_datastructures.set_op_status(op, $USE_FOR_AND_PREFERRED, $str_alt342$_S_cannot_be_both_a_use_for_and_a, list(tm_datastructures.arg_string(arg2), tm_datastructures.tm_op_thesaurus_name(op)));
                }
                if (NIL != subl_promotions.memberP(arg2, tm_datastructures.tm_stoplist_words(), symbol_function(EQUALP), UNPROVIDED)) {
                    tm_datastructures.set_op_status(op, $STOPLIST_WORD, $str_alt343$_S_is_already_a_stoplist_word_, list(tm_datastructures.arg_string(arg2)));
                }
                if (arg2.equalp($str_alt27$)) {
                    tm_datastructures.set_op_status(op, $BAD_VALUE, $str_alt344$Can_t_add_the_empty_string_as_a_u, NIL);
                }
                {
                    SubLObject arg1 = tm_datastructures.tm_op_args(op).first();
                    SubLObject use_for_signs = tm_lexical_index.lexpred_signs_in_thesaurus(arg2, $$useFor, thesaurus);
                    if ((NIL != use_for_signs) && (NIL != member(tm_datastructures.sign_concept(arg1), use_for_signs, symbol_function(EQ), symbol_function(SIGN_CONCEPT)))) {
                        return tm_datastructures.set_op_status(op, $ALREADY_THERE, $str_alt346$_S_is_either_already_a_use_for_of, list(tm_datastructures.arg_string(arg2), tm_datastructures.arg_string(arg1)));
                    }
                    if ((NIL != use_for_signs) && (NIL != tm_integrity.tm_enforce_unique_uf_rule_for_thesaurusP(thesaurus))) {
                        tm_datastructures.set_op_status(op, $ALREADY_THERE, $str_alt347$_S_is_already_a_use_for_of___A_, list(tm_datastructures.arg_string(arg2), tm_datastructures.concept_term(tm_datastructures.sign_concept(use_for_signs.first()), thesaurus)));
                    }
                }
            }
        }
        return op;
    }

    public static final SubLObject check_op_bt(SubLObject op) {
        if (tm_datastructures.tm_op_opcode(op) == $ADD) {
            {
                SubLObject thesaurus = tm_datastructures.tm_op_thesaurus(op);
                SubLObject args = tm_datastructures.tm_op_args(op);
                SubLObject arg1_concept = tm_datastructures.sign_concept(args.first());
                SubLObject arg2_concept = tm_datastructures.sign_concept(second(args));
                if (arg1_concept == arg2_concept) {
                    tm_datastructures.set_op_status(op, $NON_REFLEXIVE, $str_alt349$A_term_cannot_be_a_broader_term_o, NIL);
                }
                if (NIL != gt_modules.broader_termP(arg2_concept, arg1_concept, thesaurus)) {
                    tm_datastructures.set_op_status(op, $NT_BT_CYCLE, $str_alt351$BT_NT_cycle_between__S_and__S_in_, list(tm_datastructures.arg_string(tm_datastructures.tm_op_term(op)), tm_datastructures.arg_string(tm_datastructures.tm_op_value(op)), tm_datastructures.tm_op_thesaurus_abbrev(op)));
                }
                if (NIL != top_in_thesaurusP(arg1_concept, thesaurus)) {
                    tm_datastructures.note_op_verify(op, $str_alt352$_S_is_a_top_term_in__A___It_will_, list(tm_datastructures.arg_string(args.first()), thesaurus_name(tm_datastructures.tm_op_thesaurus(op))));
                }
            }
        }
        return op;
    }

    public static final SubLObject check_op_rt(SubLObject op) {
        if (tm_datastructures.tm_op_opcode(op) == $ADD) {
            check_op_irreflexive(op);
        }
        return op;
    }

    public static final SubLObject check_op_names(SubLObject op) {
        if ((tm_datastructures.tm_op_opcode(op) == $ADD) || (tm_datastructures.tm_op_opcode(op) == $REPLACE)) {
            {
                SubLObject constant = tm_datastructures.tm_op_args(op).first();
                SubLObject new_string = (tm_datastructures.tm_op_opcode(op) == $ADD) ? ((SubLObject) (second(tm_datastructures.tm_op_args(op)))) : third(tm_datastructures.tm_op_args(op));
                SubLObject current = tm_datastructures.tm_name_string_lookup(new_string);
                if (NIL == current) {
                    current = tm_datastructures.tm_abbreviation_lookup(new_string);
                }
                if ((NIL != current) && (current != constant)) {
                    return tm_datastructures.set_op_status(op, $NAME_IN_USE, $str_alt354$The_name_or_abbreviation__S_is_al, list(new_string));
                }
                if (tm_datastructures.tm_op_opcode(op) == $REPLACE) {
                    {
                        SubLObject relation = tm_datastructures.tm_op_relation(op);
                        SubLObject old_string = second(tm_datastructures.tm_op_args(op));
                        SubLObject thesaurus = tm_datastructures.tm_op_thesaurus(op);
                        SubLObject assertions = fi.sentence_assertions(list(relation, constant, old_string), thesaurus);
                        if (NIL == assertions) {
                            return tm_datastructures.set_op_status(op, $RELATION_NOT_THERE, $str_alt355$Can_t_replace__s_with__s___s_is_n, list(old_string, new_string, old_string));
                        }
                        if (!((NIL != assertions) && (NIL != list_utilities.remove_if_not(symbol_function($sym356$ASSERTED_ASSERTION_), assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
                            tm_datastructures.set_op_status(op, $RELATION_NOT_LOCAL, $str_alt358$Can_t_replace__s_with__s___s_is_i, list(old_string, new_string, old_string));
                        }
                    }
                }
            }
        }
        return op;
    }

    public static final SubLObject check_op_pt(SubLObject op) {
        if ((tm_datastructures.tm_op_opcode(op) == $ADD) || (tm_datastructures.tm_op_opcode(op) == $REPLACE)) {
            {
                SubLObject constant = tm_datastructures.tm_op_args(op).first();
                SubLObject thesaurus = tm_datastructures.tm_op_thesaurus(op);
                SubLObject new_string = (tm_datastructures.tm_op_opcode(op) == $ADD) ? ((SubLObject) (second(tm_datastructures.tm_op_args(op)))) : third(tm_datastructures.tm_op_args(op));
                SubLObject current_pt = NIL;
                SubLObject current_ufs = tm_lexical_index.lexpred_signs_in_thesaurus(new_string, $$useFor, thesaurus);
                SubLObject lexpred = NIL;
                try {
                    current_pt = tm_datastructures.unique_lexpred_sign_in_thesaurus(new_string, $$preferredTerm, thesaurus);
                } catch (Throwable ccatch_env_var) {
                    lexpred = Errors.handleThrowable(ccatch_env_var, $MULTIPLE_LEXPRED);
                }
                if (NIL != lexpred) {
                    return tm_datastructures.set_op_status(op, $MULTIPLE_LEXPRED, $str_alt318$_S_has_multiple_preferred_term_st, list(new_string, thesaurus_name(thesaurus)));
                }
                if (((NIL != tm_datastructures.signp(current_pt)) && (tm_datastructures.sign_concept(current_pt) == constant)) && tm_datastructures.sign_term(current_pt).equal(new_string)) {
                    return tm_datastructures.set_op_status(op, $TERM_EXISTS, $str_alt304$_S_is_already_a_preferred_term_, list(new_string));
                }
                if (NIL != current_ufs) {
                    return tm_datastructures.set_op_status(op, $TERM_EXISTS, $str_alt305$_S_is_already_a_use_for_, list(new_string));
                }
                if (NIL != subl_promotions.memberP(new_string, tm_datastructures.tm_stoplist_words(), symbol_function(EQUALP), UNPROVIDED)) {
                    return tm_datastructures.set_op_status(op, $ON_STOPLIST, $str_alt360$_S_is_a_stoplist_word_, list(new_string));
                }
                if (new_string.equalp($str_alt27$)) {
                    return tm_datastructures.set_op_status(op, $BAD_VALUE, $str_alt361$Can_t_rename_a_term_to_the_emtpy_, NIL);
                }
                if (tm_datastructures.tm_op_opcode(op) == $REPLACE) {
                    {
                        SubLObject old_string = second(tm_datastructures.tm_op_args(op));
                        SubLObject assertion = NIL;
                        try {
                            assertion = tm_datastructures.unique_lexpred_sign_in_thesaurus(old_string, $$preferredTerm, thesaurus);
                        } catch (Throwable ccatch_env_var) {
                            lexpred = Errors.handleThrowable(ccatch_env_var, $MULTIPLE_LEXPRED);
                        }
                        if (NIL != lexpred) {
                            return tm_datastructures.set_op_status(op, $MULTIPLE_LEXPRED, $str_alt362$Can_t_replace__s_with__s___s_has_, list(old_string, new_string, old_string, thesaurus_name(thesaurus)));
                        }
                        if (NIL == assertion) {
                            return tm_datastructures.set_op_status(op, $RELATION_NOT_THERE, $str_alt355$Can_t_replace__s_with__s___s_is_n, list(old_string, new_string, old_string));
                        }
                        if ((NIL != assertion) && (NIL == assertions_high.asserted_assertionP(assertion))) {
                            return tm_datastructures.set_op_status(op, $RELATION_NOT_LOCAL, $str_alt358$Can_t_replace__s_with__s___s_is_i, list(old_string, new_string, old_string));
                        }
                        if (assertions_high.gaf_arg1(assertion) != constant) {
                            return tm_datastructures.set_op_status(op, $WRONG_CONCEPT, $str_alt364$Implementation_error___s_is_a_PT_, list(old_string));
                        }
                        tm_datastructures._csetf_tm_op_args(op, subst(assertions_high.gaf_arg2(assertion), old_string, tm_datastructures.tm_op_args(op), UNPROVIDED, UNPROVIDED));
                    }
                }
            }
        }
        return op;
    }

    public static final SubLObject check_op_stoplist(SubLObject op) {
        if (tm_datastructures.tm_op_opcode(op) == $ADD) {
            {
                SubLObject word = tm_datastructures.tm_op_args(op).first();
                if (NIL != tm_lexical_index.lexpred_signs_all_thesauri(word, $$preferredTerm)) {
                    return tm_datastructures.set_op_status(op, $ALREADY_THERE, $str_alt365$_S_is_a_preferred_term_in_some_th, list(word));
                }
                if (NIL != tm_lexical_index.lexpred_signs_all_thesauri(word, $$useFor)) {
                    return tm_datastructures.set_op_status(op, $ALREADY_THERE, $str_alt366$_S_is_a_use_for_in_some_thesaurus, list(word));
                }
            }
        }
        return op;
    }

    public static final SubLObject check_op_generic(SubLObject op) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (tm_datastructures.tm_op_opcode(op) == $REPLACE) {
                {
                    SubLObject term_arg = (NIL != tm_datastructures.tm_op_inverseP(op)) ? ((SubLObject) (TWO_INTEGER)) : ONE_INTEGER;
                    SubLObject value_arg = (NIL != tm_datastructures.tm_op_inverseP(op)) ? ((SubLObject) (ONE_INTEGER)) : TWO_INTEGER;
                    SubLObject v_term = tm_datastructures.tm_op_args(op).first();
                    SubLObject old = second(tm_datastructures.tm_op_args(op));
                    SubLObject equality_test = symbol_function(EQ);
                    if (NIL != subl_promotions.memberP(tm_relation_argtype(tm_datastructures.tm_op_relation(op), value_arg), $list_alt367, UNPROVIDED, UNPROVIDED)) {
                        equality_test = symbol_function(EQUAL);
                    }
                    {
                        SubLObject _prev_bind_0 = control_vars.$mapping_equality_test$.currentBinding(thread);
                        try {
                            control_vars.$mapping_equality_test$.bind(equality_test, thread);
                            {
                                SubLObject existing = kb_mapping_utilities.pred_u_v_holds_in_mt(tm_datastructures.tm_op_relation(op), v_term, old, tm_datastructures.tm_op_thesaurus(op), term_arg, value_arg, UNPROVIDED);
                                if (NIL == existing) {
                                    tm_datastructures.set_op_status(op, $RELATION_NOT_THERE, $str_alt368$The_relation__S__A__S_is_not_in__, list(tm_datastructures.arg_string(v_term), tm_datastructures.tm_op_relation_abbrev(op), tm_datastructures.arg_string(old), tm_datastructures.tm_op_thesaurus_name(op)));
                                }
                            }
                        } finally {
                            control_vars.$mapping_equality_test$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            if ((tm_datastructures.tm_op_opcode(op) == $ADD) && (arity.arity(tm_datastructures.tm_op_relation(op)) == TWO_INTEGER)) {
                if (NIL != tm_utilities.tm_single_entry_formatP(tm_datastructures.tm_op_relation(op), ONE_INTEGER, UNPROVIDED)) {
                    check_op_single_entry_arg(ONE_INTEGER, op);
                }
                if (NIL != tm_utilities.tm_single_entry_formatP(tm_datastructures.tm_op_relation(op), TWO_INTEGER, UNPROVIDED)) {
                    check_op_single_entry_arg(TWO_INTEGER, op);
                }
                if (NIL != kb_accessors.irreflexive_predicateP(tm_datastructures.tm_op_relation(op))) {
                    check_op_irreflexive(op);
                }
                if (NIL != kb_accessors.asymmetric_predicateP(tm_datastructures.tm_op_relation(op))) {
                    check_op_asymmetric(op);
                }
            }
            return op;
        }
    }

    /**
     * Checks :add ops where the Nth arg is a single-entry argument to a binary relation.
     */
    public static final SubLObject check_op_single_entry_arg(SubLObject n, SubLObject op) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(tm_datastructures.$tm_mt$.getGlobalValue(), thread);
                    {
                        SubLObject relation = tm_datastructures.tm_op_relation(op);
                        SubLObject relation_abbrev = tm_datastructures.tm_op_relation_abbrev(op);
                        SubLObject term_sign = tm_datastructures.tm_op_term(op);
                        SubLObject value_sign = tm_datastructures.tm_op_value(op);
                        SubLObject other_n = (n == ONE_INTEGER) ? ((SubLObject) (TWO_INTEGER)) : ONE_INTEGER;
                        SubLObject other_arg = nth(subtract(other_n, ONE_INTEGER), tm_datastructures.tm_op_args(op));
                        SubLObject value = value_sign;
                        SubLObject thesaurus = tm_datastructures.tm_op_thesaurus(op);
                        SubLObject other_argtype = tm_relation_argtype(relation, other_n);
                        SubLObject present = NIL;
                        if (NIL != tm_datastructures.signp(value_sign)) {
                            value = tm_datastructures.sign_concept(value_sign);
                        }
                        if (NIL != tm_datastructures.signp(other_arg)) {
                            other_arg = tm_datastructures.sign_concept(other_arg);
                        }
                        {
                            SubLObject pcase_var = other_argtype;
                            if (pcase_var.eql($CONSTANT)) {
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == forts.valid_fortP(other_arg)) {
                                        Errors.error($str_alt369$Expected_a_constant_for__A, other_arg);
                                    }
                                }
                                present = kb_mapping_utilities.fpred_value_in_mt(other_arg, relation, thesaurus, other_n, n, UNPROVIDED);
                            } else
                                if (pcase_var.eql($STRING)) {
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                        if (NIL == tm_lexical_predicateP(relation)) {
                                            Errors.error($str_alt370$_A_is_not_a_lexical_predicate__bu, relation_abbrev);
                                        }
                                    }
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                        if (!other_arg.isString()) {
                                            Errors.error($str_alt371$Expected_a_string_for__A, other_arg);
                                        }
                                    }
                                    present = tm_lexical_index.lexpred_signs_in_thesaurus(other_arg, relation, thesaurus);
                                }

                        }
                        if (NIL != present) {
                            {
                                SubLObject present_sign = present;
                                SubLObject arg1 = NIL;
                                SubLObject arg2 = NIL;
                                if (present.isCons() && (NIL != tm_datastructures.signp(present.first()))) {
                                    present_sign = tm_datastructures.sign_from_concept(tm_datastructures.sign_concept(present.first()), $$preferredTerm, thesaurus);
                                }
                                if (NIL != forts.fort_p(present)) {
                                    present_sign = tm_datastructures.term_sign(tm_datastructures.concept_term(present, thesaurus), thesaurus);
                                }
                                if (value.equal(other_arg)) {
                                    arg1 = tm_datastructures.arg_string(present_sign);
                                    arg2 = tm_datastructures.arg_string(value_sign);
                                } else {
                                    arg1 = tm_datastructures.arg_string(term_sign);
                                    arg2 = tm_datastructures.arg_string(present_sign);
                                }
                                tm_datastructures.set_op_status(op, $ALREADY_THERE, $str_alt372$_A_is__A__and_we_already_know___A, list(relation_abbrev, tm_classify_format(relation_abbrev), arg1, relation_abbrev, arg2));
                            }
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return op;
        }
    }

    public static final SubLObject check_op_irreflexive(SubLObject op) {
        {
            SubLObject v_term = tm_datastructures.tm_op_term(op);
            SubLObject value = tm_datastructures.tm_op_value(op);
            if (NIL != tm_datastructures.signp(v_term)) {
                v_term = tm_datastructures.sign_concept(v_term);
            }
            if (NIL != tm_datastructures.signp(value)) {
                value = tm_datastructures.sign_concept(value);
            }
            if (v_term.equal(value)) {
                return tm_datastructures.set_op_status(op, $IRREFLEXIVE_VIOLATION, $str_alt374$Adding_relation__A_between_a_term, list(tm_datastructures.tm_op_relation_abbrev(op)));
            }
        }
        return op;
    }

    public static final SubLObject check_op_asymmetric(SubLObject op) {
        {
            SubLObject v_term = tm_datastructures.tm_op_term(op);
            SubLObject value = tm_datastructures.tm_op_value(op);
            if (NIL != tm_datastructures.signp(v_term)) {
                v_term = tm_datastructures.sign_concept(v_term);
            }
            if (NIL != tm_datastructures.signp(value)) {
                value = tm_datastructures.sign_concept(value);
            }
            if (NIL != (NIL != tm_datastructures.tm_op_inverseP(op) ? ((SubLObject) (makeBoolean((NIL != kb_indexing_datastructures.indexed_term_p(v_term)) && (NIL != member(value, kb_mapping_utilities.pred_values_in_mt(v_term, tm_datastructures.tm_op_relation(op), tm_datastructures.tm_op_thesaurus(op), UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED))))) : makeBoolean((NIL != kb_indexing_datastructures.indexed_term_p(value)) && (NIL != member(v_term, kb_mapping_utilities.pred_values_in_mt(value, tm_datastructures.tm_op_relation(op), tm_datastructures.tm_op_thesaurus(op), UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED))))) {
                return tm_datastructures.set_op_status(op, $ASYMMETRIC_VIOLATION, $str_alt376$Adding__A__A__A_is_not_allowed__s, list(tm_datastructures.arg_string(tm_datastructures.tm_op_term(op)), tm_datastructures.tm_op_relation_abbrev(op), tm_datastructures.arg_string(tm_datastructures.tm_op_value(op))));
            }
        }
        return op;
    }

    public static final SubLObject check_operation_semantics(SubLObject op) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject args = tm_datastructures.tm_op_args(op);
                if (tm_datastructures.tm_op_opcode(op) == $DELETE) {
                    {
                        SubLObject okP = NIL;
                        if (tm_datastructures.tm_op_relation(op) == $$useFor) {
                            {
                                SubLObject use_fors = tm_lexical_index.lexpred_signs_in_thesaurus(second(args), $$useFor, tm_datastructures.tm_op_thesaurus(op));
                                SubLObject found = NIL;
                                if (NIL == found) {
                                    {
                                        SubLObject csome_list_var = use_fors;
                                        SubLObject use_for = NIL;
                                        for (use_for = csome_list_var.first(); !((NIL != found) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , use_for = csome_list_var.first()) {
                                            if ((NIL != tm_datastructures.signp(use_for)) && (tm_datastructures.sign_concept(use_for) == (NIL != tm_datastructures.signp(args.first()) ? ((SubLObject) (tm_datastructures.sign_concept(args.first()))) : args.first()))) {
                                                found = use_for;
                                            }
                                        }
                                    }
                                }
                                okP = found;
                                if (NIL != tm_datastructures.signp(found)) {
                                    tm_datastructures._csetf_tm_op_args(op, list(args.first(), tm_datastructures.sign_term(found)));
                                }
                            }
                        } else {
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                    mt_relevance_macros.$mt$.bind(tm_datastructures.tm_op_thesaurus(op), thread);
                                    okP = fi.safe_fi($LOOKUP, bq_cons(tm_datastructures.tm_op_relation(op), append(Mapping.mapcar(symbol_function(CONVERT_ARG), args), NIL)), tm_datastructures.tm_op_thesaurus(op), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        if (NIL == okP) {
                            if (tm_datastructures.tm_op_relation(op) == $$tmStoplistWord) {
                                return tm_datastructures.set_op_status(op, $RELATION_NOT_THERE, $str_alt380$_S_is_not_a_stoplist_word_, list(tm_datastructures.tm_op_term(op)));
                            } else {
                                return tm_datastructures.set_op_status(op, $RELATION_NOT_THERE, $str_alt368$The_relation__S__A__S_is_not_in__, list(tm_datastructures.arg_string(tm_datastructures.tm_op_term(op)), tm_datastructures.tm_op_relation_abbrev(op), tm_datastructures.arg_string(tm_datastructures.tm_op_value(op)), tm_datastructures.tm_op_thesaurus_name(op)));
                            }
                        }
                    }
                }
                if (tm_datastructures.tm_op_opcode(op) == $CONVERT_NT_UF) {
                    if (NIL == kb_mapping_utilities.some_pred_value_in_mt(tm_datastructures.sign_concept(tm_datastructures.tm_op_args(op).first()), $$broaderTerm, tm_datastructures.tm_op_thesaurus(op), TWO_INTEGER, UNPROVIDED)) {
                        return tm_datastructures.set_op_status(op, $NOTHING_TO_CONVERT, $str_alt382$The_term___a__has_no_narrower_ter, list(tm_datastructures.arg_string(tm_datastructures.tm_op_args(op).first()), tm_datastructures.tm_op_thesaurus_name(op)));
                    }
                    if (NIL == gt_modules.tm_dependents(tm_datastructures.sign_concept(tm_datastructures.tm_op_args(op).first()), tm_datastructures.tm_op_thesaurus(op))) {
                        return tm_datastructures.set_op_status(op, $NO_DEPENDENT_NTS, $str_alt384$The_term___a__has_no_dependent_na, list(tm_datastructures.arg_string(tm_datastructures.tm_op_args(op).first()), tm_datastructures.tm_op_thesaurus_name(op)));
                    }
                }
                if (NIL != tm_datastructures.tm_op_relation(op)) {
                    if (NIL != kb_mapping_utilities.pred_u_v_holds_in_mt($$tmRelationRestrictedFrom, tm_datastructures.tm_op_relation(op), tm_datastructures.tm_op_thesaurus(op), tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        return tm_datastructures.set_op_status(op, $RELATION_RESTRICTED_IN_THESAURUS, $str_alt387$The_relation__a_is_restricted_fro, list(tm_datastructures.tm_op_relation_abbrev(op), tm_datastructures.tm_op_thesaurus_name(op)));
                    }
                }
                {
                    SubLObject function = assoc(tm_datastructures.tm_op_relation(op), $relation_checker_alist$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
                    if (NIL != function) {
                        return funcall(function, op);
                    } else {
                        return check_op_generic(op);
                    }
                }
            }
        }
    }

    public static final SubLObject check_operations(SubLObject ops) {
        {
            SubLObject bad = NIL;
            SubLObject good = NIL;
            SubLObject better = NIL;
            SubLObject verifyP = NIL;
            {
                SubLObject cdolist_list_var = ops;
                SubLObject op = NIL;
                for (op = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , op = cdolist_list_var.first()) {
                    check_operation_syntax(op);
                    if (tm_datastructures.tm_op_status(op) == $OK) {
                        good = cons(op, good);
                    } else {
                        bad = cons(op, bad);
                    }
                }
            }
            {
                SubLObject cdolist_list_var = good;
                SubLObject op = NIL;
                for (op = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , op = cdolist_list_var.first()) {
                    check_operation_semantics(op);
                    if (tm_datastructures.tm_op_status(op) == $OK) {
                        better = cons(op, better);
                        if (NIL != tm_datastructures.tm_op_verifyP(op)) {
                            verifyP = T;
                        }
                    } else {
                        bad = cons(op, bad);
                    }
                }
            }
            return values(bad, better, verifyP);
        }
    }

    /**
     * Runs a KB op and returns :OK, :ERROR, or :WARNING, along with a diagnostic.
     */
    public static final SubLObject perform_operation(SubLObject op) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = $OK;
                SubLObject failedP = NIL;
                SubLObject diagnostic = NIL;
                {
                    SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    SubLObject _prev_bind_2 = control_vars.$use_transcriptP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                    try {
                        api_control_vars.$use_local_queueP$.bind(NIL, thread);
                        api_control_vars.$the_cyclist$.bind(tm_user_constant_from_user_name(tm_datastructures.$tm_user$.getDynamicValue(thread)), thread);
                        control_vars.$use_transcriptP$.bind(tm_control_vars.$tm_default_save_operations_value$.getDynamicValue(thread), thread);
                        at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                        if (NIL == failedP) {
                            {
                                SubLObject csome_list_var = operation_fi_commands(op);
                                SubLObject command = NIL;
                                for (command = csome_list_var.first(); !((NIL != failedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , command = csome_list_var.first()) {
                                    {
                                        SubLObject _prev_bind_0_46 = fi.$fi_error$.currentBinding(thread);
                                        SubLObject _prev_bind_1_47 = fi.$fi_warning$.currentBinding(thread);
                                        try {
                                            fi.$fi_error$.bind(NIL, thread);
                                            fi.$fi_warning$.bind(NIL, thread);
                                            failedP = makeBoolean(NIL == eval(command));
                                            if (NIL != fi.fi_warning_signaledP()) {
                                                {
                                                    SubLObject format_string = second(fi.fi_get_warning_int());
                                                    SubLObject args = nthcdr(TWO_INTEGER, fi.fi_get_warning_int());
                                                    if (NIL != format_string) {
                                                        diagnostic = apply(symbol_function(FORMAT), NIL, new SubLObject[]{ format_string, args });
                                                    } else {
                                                        diagnostic = princ_to_string(fi.fi_get_warning_int());
                                                    }
                                                    tm_datastructures.set_op_status(op, $OK, diagnostic, NIL);
                                                }
                                                result = $WARNING;
                                            }
                                            if (NIL != fi.fi_error_signaledP()) {
                                                {
                                                    SubLObject format_string = second(fi.fi_get_error_int());
                                                    SubLObject args = nthcdr(TWO_INTEGER, fi.fi_get_error_int());
                                                    if (NIL != format_string) {
                                                        diagnostic = apply(symbol_function(FORMAT), NIL, new SubLObject[]{ format_string, args });
                                                    } else {
                                                        diagnostic = princ_to_string(fi.fi_get_error_int());
                                                    }
                                                    tm_datastructures.set_op_status(op, $EVALUATION_FAILED, diagnostic, NIL);
                                                }
                                                result = $ERROR;
                                            }
                                        } finally {
                                            fi.$fi_warning$.rebind(_prev_bind_1_47, thread);
                                            fi.$fi_error$.rebind(_prev_bind_0_46, thread);
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        at_vars.$at_check_arg_formatP$.rebind(_prev_bind_3, thread);
                        control_vars.$use_transcriptP$.rebind(_prev_bind_2, thread);
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_1, thread);
                        api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
                    }
                }
                tm_logging.tm_enqueue_op_for_log(op, result, UNPROVIDED, UNPROVIDED);
                return values(NIL != failedP ? ((SubLObject) ($ERROR)) : result, diagnostic);
            }
        }
    }

    public static final SubLObject convert_arg(SubLObject arg) {
        if (NIL != tm_datastructures.signp(arg)) {
            return tm_datastructures.sign_concept(arg);
        } else {
            return arg;
        }
    }

    public static final SubLObject operation_fi_commands(SubLObject op) {
        {
            SubLObject relation = tm_datastructures.tm_op_relation(op);
            SubLObject thesaurus = tm_datastructures.tm_op_thesaurus(op);
            SubLObject args = tm_datastructures.tm_op_args(op);
            SubLObject pcase_var = tm_datastructures.tm_op_opcode(op);
            if (pcase_var.eql($ADD)) {
                return list(list(KE_ASSERT, list(QUOTE, bq_cons(relation, append(Mapping.mapcar(symbol_function(CONVERT_ARG), args), NIL))), thesaurus));
            } else
                if (pcase_var.eql($DELETE)) {
                    return list(list(KE_UNASSERT, list(QUOTE, bq_cons(relation, append(Mapping.mapcar(symbol_function(CONVERT_ARG), args), NIL))), thesaurus));
                } else
                    if (pcase_var.eql($CREATE)) {
                        {
                            SubLObject asserts = NIL;
                            SubLObject datum = args;
                            SubLObject current = datum;
                            SubLObject v_term = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt302);
                            v_term = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt302);
                            {
                                SubLObject temp = current.rest();
                                current = current.first();
                                {
                                    SubLObject concept = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt302);
                                    concept = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        current = temp;
                                        {
                                            SubLObject broader_terms = NIL;
                                            destructuring_bind_must_consp(current, datum, $list_alt302);
                                            broader_terms = current.first();
                                            current = current.rest();
                                            if (NIL == current) {
                                                if (NIL != tm_datastructures.signp(concept)) {
                                                    concept = tm_datastructures.sign_concept(concept);
                                                }
                                                if (NIL == isa.isaP(concept, $$Thing, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED)) {
                                                    asserts = cons(list(KE_ASSERT, list(QUOTE, listS($$isa, concept, $list_alt393)), thesaurus), asserts);
                                                }
                                                asserts = cons(list(KE_ASSERT, list(QUOTE, list($$preferredTerm, concept, v_term)), thesaurus), asserts);
                                                {
                                                    SubLObject cdolist_list_var = broader_terms;
                                                    SubLObject broader_term = NIL;
                                                    for (broader_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , broader_term = cdolist_list_var.first()) {
                                                        asserts = cons(list(KE_ASSERT, list(QUOTE, list($$broaderTerm, concept, convert_arg(broader_term))), thesaurus), asserts);
                                                    }
                                                }
                                            } else {
                                                cdestructuring_bind_error(datum, $list_alt302);
                                            }
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt302);
                                    }
                                }
                            }
                            return nreverse(asserts);
                        }
                    } else
                        if (pcase_var.eql($REPLACE)) {
                            {
                                SubLObject old_arg1 = NIL;
                                SubLObject new_arg1 = NIL;
                                SubLObject old_arg2 = NIL;
                                SubLObject new_arg2 = NIL;
                                SubLObject commands = NIL;
                                SubLObject datum = args;
                                SubLObject current = datum;
                                SubLObject v_term = NIL;
                                SubLObject old_value = NIL;
                                SubLObject new_value = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt394);
                                v_term = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt394);
                                old_value = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt394);
                                new_value = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (NIL != tm_datastructures.tm_op_inverseP(op)) {
                                        old_arg1 = old_value;
                                        new_arg1 = new_value;
                                        old_arg2 = v_term;
                                        new_arg2 = v_term;
                                    } else {
                                        old_arg1 = v_term;
                                        new_arg1 = v_term;
                                        old_arg2 = old_value;
                                        new_arg2 = new_value;
                                    }
                                    commands = cons(list(KE_UNASSERT, list(QUOTE, list(relation, old_arg1, old_arg2)), thesaurus), commands);
                                    commands = cons(list(KE_ASSERT, list(QUOTE, list(relation, new_arg1, new_arg2)), thesaurus), commands);
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt394);
                                }
                                return commands;
                            }
                        } else
                            if (pcase_var.eql($SPLICE_OUT)) {
                                {
                                    SubLObject concept = tm_datastructures.term_concept(args.first(), thesaurus);
                                    SubLObject commands = kill_term_fi_commands_top_level(concept, thesaurus, NIL);
                                    SubLObject narrowers = kb_mapping_utilities.pred_values_in_mt(concept, $$broaderTerm, thesaurus, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                                    SubLObject broaders = kb_mapping_utilities.pred_values_in_mt(concept, $$broaderTerm, thesaurus, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    SubLObject cdolist_list_var = narrowers;
                                    SubLObject narrower = NIL;
                                    for (narrower = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , narrower = cdolist_list_var.first()) {
                                        {
                                            SubLObject cdolist_list_var_48 = broaders;
                                            SubLObject broader = NIL;
                                            for (broader = cdolist_list_var_48.first(); NIL != cdolist_list_var_48; cdolist_list_var_48 = cdolist_list_var_48.rest() , broader = cdolist_list_var_48.first()) {
                                                commands = cons(list(KE_ASSERT, list(QUOTE, list($$broaderTerm, narrower, broader)), thesaurus), commands);
                                            }
                                        }
                                    }
                                    return commands;
                                }
                            } else
                                if (pcase_var.eql($NUKE)) {
                                    return kill_term_fi_commands_top_level(tm_datastructures.term_concept(args.first(), thesaurus), thesaurus, T);
                                } else
                                    if (pcase_var.eql($CONVERT_NT_UF)) {
                                        return convert_nt_pt_fi_commands(tm_datastructures.sign_concept(args.first()), thesaurus);
                                    } else
                                        if (pcase_var.eql($SWAP)) {
                                            {
                                                SubLObject concept = args.first();
                                                SubLObject pt = tm_datastructures.sign_term(second(args));
                                                SubLObject uf = tm_datastructures.sign_term(third(args));
                                                SubLObject commands = NIL;
                                                commands = cons(list(KE_UNASSERT, list(QUOTE, list($$preferredTerm, concept, pt)), thesaurus), commands);
                                                commands = cons(list(KE_UNASSERT, list(QUOTE, list($$useFor, concept, uf)), thesaurus), commands);
                                                commands = cons(list(KE_ASSERT, list(QUOTE, list($$useFor, concept, pt)), thesaurus), commands);
                                                commands = cons(list(KE_ASSERT, list(QUOTE, list($$preferredTerm, concept, uf)), thesaurus), commands);
                                                return commands;
                                            }
                                        } else {
                                            Errors.error($str_alt395$Unknown_opcode__S_, tm_datastructures.tm_op_opcode(op));
                                        }







        }
        return NIL;
    }

    // defparameter
    private static final SubLSymbol $concepts_seen$ = makeSymbol("*CONCEPTS-SEEN*");

    // defparameter
    private static final SubLSymbol $tm_fi_commands$ = makeSymbol("*TM-FI-COMMANDS*");

    public static final SubLObject kill_term_fi_commands_top_level(SubLObject concept, SubLObject thesaurus, SubLObject all_dependentsP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $tm_fi_commands$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $concepts_seen$.currentBinding(thread);
                    try {
                        $tm_fi_commands$.bind(NIL, thread);
                        $concepts_seen$.bind(NIL, thread);
                        if (NIL != top_in_thesaurusP(concept, thesaurus)) {
                            kb_mapping.map_gaf_arg_index(symbol_function(KILL_TERM_FI_COMMANDS_FOR_ASSERTION), concept, ONE_INTEGER, $$topInThesaurus, NIL, tm_datastructures.$tm_mt$.getGlobalValue());
                            kb_mapping.map_gaf_arg_index(symbol_function(KILL_TERM_FI_COMMANDS_FOR_ASSERTION), concept, ONE_INTEGER, $$topInThesaurus, NIL, thesaurus);
                            if (!((NIL != all_dependentsP) || tm_use_integrity_module_for_thesaurusP(thesaurus, $TM_NOT_BT_NOT_TOP).eql($TM_DO_NOT_USE_INTEGRITY_MODULE))) {
                                {
                                    SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_mt(concept, $$broaderTerm, thesaurus, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                                    SubLObject narrower = NIL;
                                    for (narrower = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , narrower = cdolist_list_var.first()) {
                                        $tm_fi_commands$.setDynamicValue(cons(listS(FI_ASSERT, list(QUOTE, list($$topInThesaurus, narrower, thesaurus)), $list_alt137), $tm_fi_commands$.getDynamicValue(thread)), thread);
                                    }
                                }
                            }
                        }
                        if (NIL != all_dependentsP) {
                            {
                                SubLObject dependents = gt_modules.tm_dependents(concept, thesaurus);
                                SubLObject cdolist_list_var = dependents;
                                SubLObject dependent = NIL;
                                for (dependent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dependent = cdolist_list_var.first()) {
                                    kill_term_fi_commands(dependent, thesaurus);
                                }
                            }
                        }
                        kill_term_fi_commands(concept, thesaurus);
                        ans = $tm_fi_commands$.getDynamicValue(thread);
                    } finally {
                        $concepts_seen$.rebind(_prev_bind_1, thread);
                        $tm_fi_commands$.rebind(_prev_bind_0, thread);
                    }
                }
                return delete_duplicates(ans, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    public static final SubLObject kill_term_fi_commands_for_assertion(SubLObject as) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $tm_fi_commands$.setDynamicValue(cons(list(KE_UNASSERT, list(QUOTE, assertions_high.assertion_formula(as)), assertions_high.assertion_mt(as)), $tm_fi_commands$.getDynamicValue(thread)), thread);
            return NIL;
        }
    }

    public static final SubLObject kill_term_fi_commands(SubLObject concept, SubLObject thesaurus) {
        kb_mapping.map_gaf_arg_index(symbol_function(KILL_TERM_FI_COMMANDS_FOR_ASSERTION), concept, ONE_INTEGER, $$preferredTerm, NIL, thesaurus);
        kb_mapping.map_gaf_arg_index(symbol_function(KILL_TERM_FI_COMMANDS_FOR_ASSERTION), concept, ONE_INTEGER, $$useFor, NIL, thesaurus);
        {
            SubLObject cdolist_list_var = tm_datastructures.$tm_relation_predicate_map$.getGlobalValue();
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                {
                    SubLObject datum = item;
                    SubLObject current = datum;
                    SubLObject name = NIL;
                    SubLObject pred = NIL;
                    SubLObject index = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt399);
                    name = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt399);
                    pred = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt399);
                    index = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        kb_mapping.map_gaf_arg_index(symbol_function(KILL_TERM_FI_COMMANDS_FOR_ASSERTION), concept, index, pred, NIL, thesaurus);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt399);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject convert_nt_pt_fi_commands(SubLObject concept, SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject dependents = remove(concept, gt_modules.tm_dependents(concept, thesaurus), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $tm_fi_commands$.currentBinding(thread);
                    try {
                        $tm_fi_commands$.bind(NIL, thread);
                        {
                            SubLObject cdolist_list_var = dependents;
                            SubLObject dependent = NIL;
                            for (dependent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dependent = cdolist_list_var.first()) {
                                {
                                    SubLObject _prev_bind_0_49 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                        mt_relevance_macros.$mt$.bind(thesaurus, thread);
                                        {
                                            SubLObject use_fors = use_fors(dependent);
                                            SubLObject cdolist_list_var_50 = use_fors;
                                            SubLObject use_for = NIL;
                                            for (use_for = cdolist_list_var_50.first(); NIL != cdolist_list_var_50; cdolist_list_var_50 = cdolist_list_var_50.rest() , use_for = cdolist_list_var_50.first()) {
                                                $tm_fi_commands$.setDynamicValue(cons(list(KE_UNASSERT, list(QUOTE, list($$useFor, dependent, use_for)), thesaurus), $tm_fi_commands$.getDynamicValue(thread)), thread);
                                                $tm_fi_commands$.setDynamicValue(cons(list(KE_ASSERT, list(QUOTE, list($$useFor, concept, use_for)), thesaurus), $tm_fi_commands$.getDynamicValue(thread)), thread);
                                            }
                                        }
                                    } finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_49, thread);
                                    }
                                }
                                $tm_fi_commands$.setDynamicValue(cons(list(KE_ASSERT, list(QUOTE, list($$useFor, concept, tm_datastructures.concept_term(dependent, thesaurus))), thesaurus), $tm_fi_commands$.getDynamicValue(thread)), thread);
                                kill_term_fi_commands(dependent, thesaurus);
                            }
                            ans = nreverse($tm_fi_commands$.getDynamicValue(thread));
                        }
                    } finally {
                        $tm_fi_commands$.rebind(_prev_bind_0, thread);
                    }
                }
                return delete_duplicates(ans, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    /**
     * Return T IFF ENTITY-CONSTANT has not been inactivated by an administrator.
     */
    public static final SubLObject active_entityP(SubLObject entity_constant) {
        return makeBoolean(NIL == kb_mapping_utilities.some_pred_value_in_mt(entity_constant, $$tmInactiveUser, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject tm_userP(SubLObject v_object) {
        if (NIL != forts.valid_fortP(v_object)) {
            return isa.isaP(v_object, $$ThesaurusCyclist, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject all_users() {
        return isa.all_fort_instances($$ThesaurusCyclist, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED);
    }

    /**
     * Returns all active thesaurus users
     */
    public static final SubLObject all_active_users() {
        return list_utilities.remove_if_not(symbol_function($sym402$ACTIVE_ENTITY_), all_users(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all thesaurus users which have been inactivated by an Administrator
     */
    public static final SubLObject all_inactive_users() {
        return remove_if(symbol_function($sym402$ACTIVE_ENTITY_), all_users(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all users which have ''administrator'' as their user-level
     */
    public static final SubLObject all_administrators() {
        {
            SubLObject users = all_users();
            return list_utilities.remove_if_not(symbol_function($sym403$TM_ADMINISTRATOR_), users, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     * Returns all users which have ''full-editor'' as their user-level
     */
    public static final SubLObject all_full_editors() {
        {
            SubLObject users = all_users();
            return list_utilities.remove_if_not(symbol_function($sym404$TM_FULL_EDITOR_), users, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     * Returns the user-name to use for USER-CONSTANT
     */
    public static final SubLObject user_name(SubLObject user_constant) {
        return kb_mapping_utilities.fpred_value_in_mt(user_constant, $$tmHttpUserID, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns the user constant that corresponds to USERNAME
     */
    public static final SubLObject tm_user_constant_from_user_name(SubLObject username) {
        return tm_datastructures.tm_user_id_lookup(username);
    }

    public static final SubLObject personal_name(SubLObject user_constant) {
        return kb_mapping_utilities.fpred_value_in_mt(user_constant, $$nameString, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Make sure the user USERNAME is a known #$ThesaurusCyclist and is active.
     */
    public static final SubLObject tm_recognized_userP(SubLObject username) {
        {
            SubLObject cyclist = tm_user_constant_from_user_name(username);
            if (((NIL != forts.valid_fortP(cyclist)) && (NIL != isa.isa_in_any_mtP(cyclist, $$ThesaurusCyclist))) && (NIL != active_entityP(cyclist))) {
                return cyclist;
            } else {
                return NIL;
            }
        }
    }

    /**
     * Construct name for the constant for use with USER-NAME.
     */
    public static final SubLObject make_user_constant_name(SubLObject user_name) {
        SubLSystemTrampolineFile.checkType(user_name, STRINGP);
        return format(NIL, $str_alt407$TMUser__A, user_name);
    }

    /**
     * Stub.  For now accept any string of 3 non-space characters or more.
     */
    public static final SubLObject valid_guest_name(SubLObject username) {
        return makeBoolean(username.isString() && length(string_utilities.trim_whitespace(username)).numGE(THREE_INTEGER));
    }

    /**
     * Returns the level (one of the *tm-user-levels*) for USER-CONSTANT.
     */
    public static final SubLObject user_level(SubLObject user_constant) {
        SubLSystemTrampolineFile.checkType(user_constant, FORT_P);
        return kb_mapping_utilities.fpred_value_in_mt(user_constant, $$tmUserType, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject user_level_rank(SubLObject user_level) {
        {
            SubLObject ans = NIL;
            ans = assoc(user_level, tm_datastructures.$tm_user_levels$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED).rest();
            if (NIL == ans) {
                ans = ZERO_INTEGER;
            }
            return ans;
        }
    }

    /**
     * If USERNAME has at least the level of USER-LEVEL, return T.
     */
    public static final SubLObject privelegedP(SubLObject username, SubLObject user_level) {
        if (NIL != tm_datastructures.tm_value(username, $LEVEL)) {
            return numGE(user_level_rank(tm_datastructures.tm_value(username, $LEVEL)), user_level_rank(user_level));
        } else {
            return NIL;
        }
    }

    /**
     * True if USER-CONSTANT has ''administrator'' ias its user-level
     */
    public static final SubLObject tm_administratorP(SubLObject user_constant) {
        return equalp(user_level(user_constant), $$$administrator);
    }

    /**
     * True if USER-CONSTANT has ''full-editor'' ias its user-level
     */
    public static final SubLObject tm_full_editorP(SubLObject user_constant) {
        return equalp(user_level(user_constant), $str_alt411$full_editor);
    }

    /**
     * Lookup password for USER-CONSTANT from kb.
     */
    public static final SubLObject user_password(SubLObject user_constant) {
        SubLSystemTrampolineFile.checkType(user_constant, FORT_P);
        return kb_mapping_utilities.fpred_value_in_mt(user_constant, $$tmPassword, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all users of TYPE which are explicitly recorded as browsers of THESAURUS.
     */
    public static final SubLObject thesaurus_explicit_browsers(SubLObject thesaurus, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $CYCLIST;
        }
        {
            SubLObject browsers = kb_mapping_utilities.pred_values_in_mt(thesaurus, $$tmBrowsableThesauri, tm_datastructures.$tm_mt$.getGlobalValue(), TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
            SubLObject pcase_var = type;
            if (pcase_var.eql($CYCLIST)) {
                return list_utilities.remove_if_not(symbol_function($sym415$TM_USER_), browsers, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($APPLICATION)) {
                    return list_utilities.remove_if_not(symbol_function($sym417$TM_APPLICATION_), browsers, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($ALL)) {
                        return browsers;
                    } else {
                        Errors.error($str_alt418$Unknown_type___S, type);
                    }


        }
        return NIL;
    }

    /**
     * Returns all users of TYPE which are able to browse THESAURUS.
     */
    public static final SubLObject thesaurus_browsers(SubLObject thesaurus, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $CYCLIST;
        }
        {
            SubLObject browsers = thesaurus_explicit_browsers(thesaurus, type);
            SubLObject pcase_var = type;
            if (pcase_var.eql($CYCLIST) || pcase_var.eql($ALL)) {
                return remove_duplicates(nconc(browsers, all_full_editors(), all_administrators()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($APPLICATION)) {
                    return browsers;
                } else {
                    Errors.error($str_alt418$Unknown_type___S, type);
                }

        }
        return NIL;
    }

    /**
     * Returns all users of TYPE which are explicitly recorded as editors of THESAURUS.
     */
    public static final SubLObject thesaurus_explicit_editors(SubLObject thesaurus, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $CYCLIST;
        }
        {
            SubLObject editors = kb_mapping_utilities.pred_values_in_mt(thesaurus, $$tmEditorFor, tm_datastructures.$tm_mt$.getGlobalValue(), TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
            SubLObject pcase_var = type;
            if (pcase_var.eql($CYCLIST)) {
                return list_utilities.remove_if_not(symbol_function($sym415$TM_USER_), editors, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($APPLICATION)) {
                    return list_utilities.remove_if_not(symbol_function($sym417$TM_APPLICATION_), editors, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($ALL)) {
                        return editors;
                    } else {
                        Errors.error($str_alt418$Unknown_type___S, type);
                    }


        }
        return NIL;
    }

    /**
     * Returns all users of TYPE which are able to edit THESAURUS.
     */
    public static final SubLObject thesaurus_editors(SubLObject thesaurus, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $CYCLIST;
        }
        {
            SubLObject editors = thesaurus_explicit_editors(thesaurus, type);
            SubLObject pcase_var = type;
            if (pcase_var.eql($CYCLIST) || pcase_var.eql($ALL)) {
                return remove_duplicates(nconc(editors, all_full_editors(), all_administrators()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($APPLICATION)) {
                    return editors;
                } else {
                    Errors.error($str_alt418$Unknown_type___S, type);
                }

        }
        return NIL;
    }

    /**
     * Returns those thesauri the user or application represented by CONSTANT is explicitly
     * recorded as having edit access to.
     */
    public static final SubLObject declarative_editable_thesauri(SubLObject constant) {
        SubLSystemTrampolineFile.checkType(constant, FORT_P);
        return kb_mapping_utilities.pred_values_in_mt(constant, $$tmEditorFor, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns list of thesauri the user or application represented by CONSTANT
     * has edit access to.  Includes those with implicit access.
     */
    public static final SubLObject editable_thesauri(SubLObject constant, SubLObject level) {
        if (level == UNPROVIDED) {
            level = user_level(constant);
        }
        SubLSystemTrampolineFile.checkType(constant, FORT_P);
        {
            SubLObject result = NIL;
            if (level.equalp($str_alt420$limited_editor) || (NIL == level)) {
                result = Sort.sort(declarative_editable_thesauri(constant), symbol_function($sym8$TERM__), symbol_function(THESAURUS_NAME));
            } else
                if (NIL != member(level, $list_alt421, symbol_function(EQUALP), UNPROVIDED)) {
                    result = $ALL;
                }

            return result;
        }
    }

    /**
     * Returns those thesauri which the user or app represented by CONSTANT is
     * explicitly recorded as having browse or query access to.
     */
    public static final SubLObject declarative_browsable_thesauri(SubLObject constant) {
        SubLSystemTrampolineFile.checkType(constant, FORT_P);
        return kb_mapping_utilities.pred_values_in_mt(constant, $$tmBrowsableThesauri, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns a list of thesauri to which USERNAME has browse-access to.  If RECOMPUTE? is non-nil, don't base the answer on cached information.
     */
    public static final SubLObject browsable_thesauri(SubLObject username, SubLObject recomputeP) {
        if (recomputeP == UNPROVIDED) {
            recomputeP = NIL;
        }
        {
            SubLObject user_constant = tm_user_constant_from_user_name(username);
            SubLObject level = tm_datastructures.tm_value(username, $LEVEL);
            SubLObject released_thesauri = Sort.sort(released_thesauri(), symbol_function($sym8$TERM__), symbol_function(THESAURUS_NAME));
            SubLObject result = NIL;
            if ((NIL != forts.valid_fortP(user_constant)) && ((NIL == level) || (NIL != recomputeP))) {
                level = user_level(user_constant);
            }
            if (level.equalp($str_alt422$end_user)) {
                result = released_thesauri;
            } else
                if (NIL != member(level, $list_alt423, symbol_function(EQUALP), UNPROVIDED)) {
                    if (NIL != forts.valid_fortP(user_constant)) {
                        result = Sort.sort(union(declarative_browsable_thesauri(user_constant), union(declarative_editable_thesauri(user_constant), released_thesauri, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED), symbol_function($sym8$TERM__), symbol_function(THESAURUS_NAME));
                    }
                } else
                    if (NIL != member(level, $list_alt421, symbol_function(EQUALP), UNPROVIDED)) {
                        result = all_thesauri_sorted();
                    }


            return result;
        }
    }

    /**
     * Call while *tm-user* is bound.  Returns T iff THESAURUS is browsable by *TM-USER*,
     * based on cached info about the user level
     */
    public static final SubLObject browsable_thesaurusP(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != released_thesaurusP(thesaurus)) {
                return T;
            } else {
                return member(thesaurus, browsable_thesauri(tm_datastructures.$tm_user$.getDynamicValue(thread), UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        }
    }

    /**
     * Call while *tm-user* is bound.  Returns T iff THESAURUS is editable by *TM-USER*.
     */
    public static final SubLObject editable_thesaurusP(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt411$full_editor)) {
                return T;
            } else
                if (NIL == privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt420$limited_editor)) {
                    return NIL;
                } else
                    if (tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDITABLE_THESAURI) == $ALL) {
                        return T;
                    } else {
                        return member(thesaurus, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDITABLE_THESAURI), UNPROVIDED, UNPROVIDED);
                    }


        }
    }

    public static final SubLObject tm_applicationP(SubLObject v_object) {
        if (NIL != forts.valid_fortP(v_object)) {
            return isa.isaP(v_object, $$ThesaurusApplication, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED);
        }
        return NIL;
    }

    /**
     * returns a list of all #$ThesaurusApplications.
     */
    public static final SubLObject all_apps() {
        return isa.all_fort_instances($$ThesaurusApplication, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED);
    }

    /**
     * Returns a list of all active thesaurus applications
     */
    public static final SubLObject all_active_apps() {
        return list_utilities.remove_if_not(symbol_function($sym402$ACTIVE_ENTITY_), all_apps(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all thesaurus applications which have been inactivated by an Administrator
     */
    public static final SubLObject all_inactive_apps() {
        return remove_if(symbol_function($sym402$ACTIVE_ENTITY_), all_apps(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns the application name to use for APP-CONSTANT
     */
    public static final SubLObject application_name(SubLObject app_constant) {
        return kb_mapping_utilities.fpred_value_in_mt(app_constant, $$tmHttpUserID, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns the application constant that corresponds to APP-NAME
     */
    public static final SubLObject tm_app_constant_from_app_name(SubLObject app_name) {
        return tm_datastructures.tm_user_id_lookup(app_name);
    }

    /**
     * Construct name for the constant denoting the ThesaurusApplication having APP-NAME.
     */
    public static final SubLObject make_app_constant_name(SubLObject app_name) {
        SubLSystemTrampolineFile.checkType(app_name, STRINGP);
        return format(NIL, $str_alt426$TMApp__A, app_name);
    }

    /**
     * Make sure the application APP-NAME is a known #$ThesaurusApplication and is active.
     */
    public static final SubLObject tm_recognized_appP(SubLObject app_name) {
        {
            SubLObject app = tm_app_constant_from_app_name(app_name);
            if (((NIL != forts.valid_fortP(app)) && (NIL != isa.isa_in_any_mtP(app, $$ThesaurusApplication))) && (NIL != active_entityP(app))) {
                return app;
            } else {
                return NIL;
            }
        }
    }

    public static final SubLObject do_add_user(SubLObject user_name, SubLObject level, SubLObject browse_thesaurus_names, SubLObject edit_thesaurus_names, SubLObject personal_name) {
        if (browse_thesaurus_names == UNPROVIDED) {
            browse_thesaurus_names = NIL;
        }
        if (edit_thesaurus_names == UNPROVIDED) {
            edit_thesaurus_names = NIL;
        }
        if (personal_name == UNPROVIDED) {
            personal_name = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(user_name, STRINGP);
            SubLSystemTrampolineFile.checkType(level, STRINGP);
            {
                SubLObject browse_thesauri = NIL;
                SubLObject edit_thesauri = NIL;
                SubLObject result = NIL;
                {
                    SubLObject cdolist_list_var = browse_thesaurus_names;
                    SubLObject thesaurus_name = NIL;
                    for (thesaurus_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus_name = cdolist_list_var.first()) {
                        {
                            SubLObject thesaurus = thesaurus_constant_from_name(thesaurus_name);
                            if (NIL != forts.valid_fortP(thesaurus)) {
                                browse_thesauri = cons(thesaurus, browse_thesauri);
                            } else {
                                return $INVALID_THESAURUS;
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = edit_thesaurus_names;
                    SubLObject thesaurus_name = NIL;
                    for (thesaurus_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus_name = cdolist_list_var.first()) {
                        {
                            SubLObject thesaurus = thesaurus_constant_from_name(thesaurus_name);
                            if (NIL != forts.valid_fortP(thesaurus)) {
                                edit_thesauri = cons(thesaurus, edit_thesauri);
                            } else {
                                return $INVALID_THESAURUS;
                            }
                        }
                    }
                }
                {
                    SubLObject _prev_bind_0 = control_vars.$use_transcriptP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    SubLObject _prev_bind_2 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                    try {
                        control_vars.$use_transcriptP$.bind(tm_control_vars.$tm_default_save_operations_value$.getDynamicValue(thread), thread);
                        api_control_vars.$the_cyclist$.bind(tm_user_constant_from_user_name(tm_datastructures.$tm_user$.getDynamicValue(thread)), thread);
                        api_control_vars.$use_local_queueP$.bind(NIL, thread);
                        if (!((NIL != tm_user_constant_from_user_name(user_name)) || (NIL != constants_high.find_constant(make_user_constant_name(user_name))))) {
                            ke.ke_create(make_user_constant_name(user_name));
                        }
                        {
                            SubLObject constant = constants_high.find_constant(make_user_constant_name(user_name));
                            if (NIL != forts.valid_fortP(constant)) {
                                {
                                    SubLObject template = second(assoc($CREATE_USER, tm_datastructures.$thesaurus_cycl_templates$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
                                    if (template.isCons()) {
                                        template = subst(constant, $CONSTANT, template, symbol_function(EQUAL), UNPROVIDED);
                                        template = subst(level, $LEVEL, template, symbol_function(EQUAL), UNPROVIDED);
                                        {
                                            SubLObject cdolist_list_var = template;
                                            SubLObject form = NIL;
                                            for (form = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , form = cdolist_list_var.first()) {
                                                {
                                                    SubLObject cycl = form.first();
                                                    SubLObject mt = second(form);
                                                    ke.ke_assert(cycl, mt, UNPROVIDED, UNPROVIDED);
                                                }
                                            }
                                        }
                                        {
                                            SubLObject cdolist_list_var = edit_thesauri;
                                            SubLObject thesaurus = NIL;
                                            for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                                {
                                                    SubLObject formula = list($$tmEditorFor, constant, thesaurus);
                                                    SubLObject mt = tm_datastructures.$tm_mt$.getGlobalValue();
                                                    ke.ke_assert(formula, mt, UNPROVIDED, UNPROVIDED);
                                                }
                                            }
                                        }
                                        {
                                            SubLObject cdolist_list_var = browse_thesauri;
                                            SubLObject thesaurus = NIL;
                                            for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                                {
                                                    SubLObject formula = list($$tmBrowsableThesauri, constant, thesaurus);
                                                    SubLObject mt = tm_datastructures.$tm_mt$.getGlobalValue();
                                                    ke.ke_assert(formula, mt, UNPROVIDED, UNPROVIDED);
                                                }
                                            }
                                        }
                                        {
                                            SubLObject formula = list($$tmHttpUserID, constant, user_name);
                                            SubLObject mt = tm_datastructures.$tm_mt$.getGlobalValue();
                                            ke.ke_assert(formula, mt, UNPROVIDED, UNPROVIDED);
                                        }
                                        if (personal_name.isString()) {
                                            {
                                                SubLObject formula = list($$nameString, constant, personal_name);
                                                SubLObject mt = tm_datastructures.$tm_mt$.getGlobalValue();
                                                ke.ke_assert(formula, mt, UNPROVIDED, UNPROVIDED);
                                            }
                                        }
                                        result = constant;
                                        tm_logging.tm_enqueue_op_for_log(format(NIL, $str_alt429$Register_new_user__a, user_name), $OK, NIL, bq_cons(tm_logging.tm_log_id(constant), $list_alt193));
                                    }
                                }
                            }
                        }
                    } finally {
                        api_control_vars.$use_local_queueP$.rebind(_prev_bind_2, thread);
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_1, thread);
                        control_vars.$use_transcriptP$.rebind(_prev_bind_0, thread);
                    }
                }
                tm_datastructures.add_tm_vector(user_name);
                if (NIL != subl_promotions.memberP(level, $list_alt430, symbol_function(EQUALP), UNPROVIDED)) {
                    tm_datastructures.change_tm_value(user_name, $EDITING_ENABLED, T, UNPROVIDED);
                    tm_datastructures.change_tm_value(user_name, $FILTER_IN_BASIC, $OFF, UNPROVIDED);
                } else {
                    tm_datastructures.change_tm_value(user_name, $FILTER_IN_BASIC, $ON, UNPROVIDED);
                }
                tm_save_preferences_from_vector(user_name);
                return result;
            }
        }
    }

    /**
     * If not yet known, creates user with HTTP-ID-STRING as the user ID, PERSONAL-NAME as the personal name, administrator user-level, and standard preferences.  Do this after the transcript has run.
     */
    public static final SubLObject tm_bootstrap_administrator(SubLObject http_id_string, SubLObject personal_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (http_id_string.isString()) {
                if (NIL == tm_control_vars.$use_http_authentication$.getDynamicValue(thread)) {
                    format(T, $str_alt432$Not_attempting_to_create_user__A_, http_id_string);
                    return NIL;
                }
                if (tm_datastructures.tm_user_id_count().eql(ZERO_INTEGER)) {
                    tm_datastructures.tm_init_user_id_hash_from_kb();
                }
                {
                    SubLObject user_constant = tm_user_constant_from_user_name(http_id_string);
                    if (NIL == forts.valid_fortP(user_constant)) {
                        do_add_user(http_id_string, $$$administrator, NIL, NIL, personal_name);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject do_inactivate_user(SubLObject user_constant) {
        return do_inactivate_entity(user_constant);
    }

    public static final SubLObject do_reactivate_user(SubLObject user_constant) {
        return do_reactivate_entity(user_constant);
    }

    public static final SubLObject do_delete_user(SubLObject user_constant) {
        return do_delete_entity(user_constant);
    }

    public static final SubLObject do_add_password(SubLObject user_constant, SubLObject password) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject formula = list($$tmPassword, user_constant, password);
                SubLObject mt = tm_datastructures.$tm_mt$.getGlobalValue();
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = control_vars.$use_transcriptP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    SubLObject _prev_bind_2 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                    try {
                        control_vars.$use_transcriptP$.bind(tm_control_vars.$tm_default_save_operations_value$.getDynamicValue(thread), thread);
                        api_control_vars.$the_cyclist$.bind(tm_user_constant_from_user_name(tm_datastructures.$tm_user$.getDynamicValue(thread)), thread);
                        api_control_vars.$use_local_queueP$.bind(NIL, thread);
                        result = ke.ke_assert(formula, mt, UNPROVIDED, UNPROVIDED);
                    } finally {
                        api_control_vars.$use_local_queueP$.rebind(_prev_bind_2, thread);
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_1, thread);
                        control_vars.$use_transcriptP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject do_add_app(SubLObject app_name, SubLObject browse_thesaurus_names, SubLObject edit_thesaurus_names) {
        if (browse_thesaurus_names == UNPROVIDED) {
            browse_thesaurus_names = NIL;
        }
        if (edit_thesaurus_names == UNPROVIDED) {
            edit_thesaurus_names = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(app_name, STRINGP);
            {
                SubLObject browse_thesauri = NIL;
                SubLObject edit_thesauri = NIL;
                SubLObject result = NIL;
                {
                    SubLObject cdolist_list_var = browse_thesaurus_names;
                    SubLObject thesaurus_name = NIL;
                    for (thesaurus_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus_name = cdolist_list_var.first()) {
                        {
                            SubLObject thesaurus = thesaurus_constant_from_name(thesaurus_name);
                            if (NIL != forts.valid_fortP(thesaurus)) {
                                browse_thesauri = cons(thesaurus, browse_thesauri);
                            } else {
                                return $INVALID_THESAURUS;
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = edit_thesaurus_names;
                    SubLObject thesaurus_name = NIL;
                    for (thesaurus_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus_name = cdolist_list_var.first()) {
                        {
                            SubLObject thesaurus = thesaurus_constant_from_name(thesaurus_name);
                            if (NIL != forts.valid_fortP(thesaurus)) {
                                edit_thesauri = cons(thesaurus, edit_thesauri);
                            } else {
                                return $INVALID_THESAURUS;
                            }
                        }
                    }
                }
                {
                    SubLObject _prev_bind_0 = control_vars.$use_transcriptP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    SubLObject _prev_bind_2 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                    try {
                        control_vars.$use_transcriptP$.bind(tm_control_vars.$tm_default_save_operations_value$.getDynamicValue(thread), thread);
                        api_control_vars.$the_cyclist$.bind(tm_user_constant_from_user_name(tm_datastructures.$tm_user$.getDynamicValue(thread)), thread);
                        api_control_vars.$use_local_queueP$.bind(NIL, thread);
                        if (!((NIL != tm_app_constant_from_app_name(app_name)) || (NIL != constants_high.find_constant(make_app_constant_name(app_name))))) {
                            ke.ke_create(make_app_constant_name(app_name));
                        }
                        {
                            SubLObject constant = constants_high.find_constant(make_app_constant_name(app_name));
                            if (NIL != forts.valid_fortP(constant)) {
                                {
                                    SubLObject template = second(assoc($CREATE_APP, tm_datastructures.$thesaurus_cycl_templates$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
                                    if (template.isCons()) {
                                        template = subst(constant, $CONSTANT, template, symbol_function(EQUAL), UNPROVIDED);
                                        {
                                            SubLObject cdolist_list_var = template;
                                            SubLObject form = NIL;
                                            for (form = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , form = cdolist_list_var.first()) {
                                                {
                                                    SubLObject cycl = form.first();
                                                    SubLObject mt = second(form);
                                                    ke.ke_assert(cycl, mt, UNPROVIDED, UNPROVIDED);
                                                }
                                            }
                                        }
                                        {
                                            SubLObject cdolist_list_var = edit_thesauri;
                                            SubLObject thesaurus = NIL;
                                            for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                                {
                                                    SubLObject formula = list($$tmEditorFor, constant, thesaurus);
                                                    SubLObject mt = tm_datastructures.$tm_mt$.getGlobalValue();
                                                    ke.ke_assert(formula, mt, UNPROVIDED, UNPROVIDED);
                                                }
                                            }
                                        }
                                        {
                                            SubLObject cdolist_list_var = browse_thesauri;
                                            SubLObject thesaurus = NIL;
                                            for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                                {
                                                    SubLObject formula = list($$tmBrowsableThesauri, constant, thesaurus);
                                                    SubLObject mt = tm_datastructures.$tm_mt$.getGlobalValue();
                                                    ke.ke_assert(formula, mt, UNPROVIDED, UNPROVIDED);
                                                }
                                            }
                                        }
                                        {
                                            SubLObject formula = list($$tmHttpUserID, constant, app_name);
                                            SubLObject mt = tm_datastructures.$tm_mt$.getGlobalValue();
                                            ke.ke_assert(formula, mt, UNPROVIDED, UNPROVIDED);
                                        }
                                        result = constant;
                                        tm_logging.tm_enqueue_op_for_log(format(NIL, $str_alt434$Register_new_application__a, app_name), $OK, NIL, bq_cons(tm_logging.tm_log_id(constant), $list_alt193));
                                    }
                                }
                            }
                        }
                    } finally {
                        api_control_vars.$use_local_queueP$.rebind(_prev_bind_2, thread);
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_1, thread);
                        control_vars.$use_transcriptP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject do_inactivate_app(SubLObject app_constant) {
        return do_inactivate_entity(app_constant);
    }

    public static final SubLObject do_reactivate_app(SubLObject app_constant) {
        return do_reactivate_entity(app_constant);
    }

    public static final SubLObject do_delete_app(SubLObject app_constant) {
        return do_delete_entity(app_constant);
    }

    public static final SubLObject do_reactivate_entity(SubLObject entity_constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = control_vars.$use_transcriptP$.currentBinding(thread);
                SubLObject _prev_bind_1 = api_control_vars.$the_cyclist$.currentBinding(thread);
                SubLObject _prev_bind_2 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                try {
                    control_vars.$use_transcriptP$.bind(tm_control_vars.$tm_default_save_operations_value$.getDynamicValue(thread), thread);
                    api_control_vars.$the_cyclist$.bind(tm_user_constant_from_user_name(tm_datastructures.$tm_user$.getDynamicValue(thread)), thread);
                    api_control_vars.$use_local_queueP$.bind(NIL, thread);
                    {
                        SubLObject appP = tm_applicationP(entity_constant);
                        SubLObject id = NIL;
                        SubLObject noun = NIL;
                        if (NIL != appP) {
                            noun = $$$Application;
                            id = application_name(entity_constant);
                        } else {
                            noun = $$$User;
                            id = user_name(entity_constant);
                        }
                        ke.ke_unassert(list($$tmInactiveUser, entity_constant), tm_datastructures.$tm_mt$.getGlobalValue());
                        tm_logging.tm_enqueue_op_for_log(format(NIL, $str_alt437$Reactivate__a__a, noun, id), $OK, NIL, bq_cons(tm_logging.tm_log_id(entity_constant), $list_alt193));
                    }
                } finally {
                    api_control_vars.$use_local_queueP$.rebind(_prev_bind_2, thread);
                    api_control_vars.$the_cyclist$.rebind(_prev_bind_1, thread);
                    control_vars.$use_transcriptP$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject do_delete_entity(SubLObject entity_constant) {
        {
            SubLObject appP = tm_applicationP(entity_constant);
            SubLObject log_id = tm_logging.tm_log_id(entity_constant);
            SubLObject id = NIL;
            SubLObject noun = NIL;
            if (NIL != appP) {
                noun = $$$Application;
                id = application_name(entity_constant);
            } else {
                noun = $$$User;
                id = user_name(entity_constant);
            }
            tm_kill(entity_constant);
            tm_logging.tm_enqueue_op_for_log(format(NIL, $str_alt438$Delete__a__a, noun, id), $OK, NIL, bq_cons(log_id, $list_alt193));
        }
        return NIL;
    }

    public static final SubLObject do_inactivate_entity(SubLObject entity_constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = control_vars.$use_transcriptP$.currentBinding(thread);
                SubLObject _prev_bind_1 = api_control_vars.$the_cyclist$.currentBinding(thread);
                SubLObject _prev_bind_2 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                try {
                    control_vars.$use_transcriptP$.bind(tm_control_vars.$tm_default_save_operations_value$.getDynamicValue(thread), thread);
                    api_control_vars.$the_cyclist$.bind(tm_user_constant_from_user_name(tm_datastructures.$tm_user$.getDynamicValue(thread)), thread);
                    api_control_vars.$use_local_queueP$.bind(NIL, thread);
                    {
                        SubLObject appP = tm_applicationP(entity_constant);
                        SubLObject id = NIL;
                        SubLObject noun = NIL;
                        ke.ke_assert(list($$tmInactiveUser, entity_constant), tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                        if (NIL != appP) {
                            noun = $$$Application;
                            id = application_name(entity_constant);
                        } else {
                            noun = $$$User;
                            id = user_name(entity_constant);
                        }
                        tm_logging.tm_enqueue_op_for_log(format(NIL, $str_alt439$Inactivate__a__a, noun, id), $OK, NIL, bq_cons(tm_logging.tm_log_id(entity_constant), $list_alt193));
                    }
                } finally {
                    api_control_vars.$use_local_queueP$.rebind(_prev_bind_2, thread);
                    api_control_vars.$the_cyclist$.rebind(_prev_bind_1, thread);
                    control_vars.$use_transcriptP$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    /**
     * Keys for the user-vector values which are under user control.
     */
    // defparameter
    private static final SubLSymbol $tm_preference_keys$ = makeSymbol("*TM-PREFERENCE-KEYS*");

    public static final SubLObject tm_preference_key_to_string(SubLObject key) {
        return format(NIL, $str_alt441$_A, symbol_name(key));
    }

    /**
     * Returns the pathname to the file of preferences for USER.
     */
    public static final SubLObject tm_user_preferences_file(SubLObject user) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject directory = (NIL != tm_control_vars.$tm_special_preferences_directory$.getDynamicValue(thread)) ? ((SubLObject) (tm_control_vars.$tm_special_preferences_directory$.getDynamicValue(thread))) : tm_datastructures.$tm_preferences_directory$.getGlobalValue();
                if (!tm_datastructures.$tm_preferences_directory$.getGlobalValue().isString()) {
                    Errors.error($str_alt442$_TM_PREFERENCES_DIRECTORY__is_not);
                }
                return file_utilities.relative_filename(directory, user, $$$prefs);
            }
        }
    }

    /**
     * Saves preference information for USER into that user's preference file.
     */
    public static final SubLObject tm_save_preferences_from_vector(SubLObject user) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(tm_user_preferences_file(user), $OUTPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt212$Unable_to_open__S, tm_user_preferences_file(user));
                    }
                    {
                        SubLObject stream_51 = stream;
                        SubLObject cdolist_list_var = $tm_preference_keys$.getDynamicValue(thread);
                        SubLObject key = NIL;
                        for (key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , key = cdolist_list_var.first()) {
                            {
                                SubLObject value = tm_datastructures.tm_value(user, key);
                                if (NIL != value) {
                                    {
                                        SubLObject pcase_var = key;
                                        if (pcase_var.eql($THESAURI) || pcase_var.eql($EDIT_THESAURI)) {
                                            {
                                                SubLObject cdolist_list_var_52 = value;
                                                SubLObject thesaurus = NIL;
                                                for (thesaurus = cdolist_list_var_52.first(); NIL != cdolist_list_var_52; cdolist_list_var_52 = cdolist_list_var_52.rest() , thesaurus = cdolist_list_var_52.first()) {
                                                    format(stream_51, $str_alt445$____S__S_, tm_preference_key_to_string(key), thesaurus_name(thesaurus));
                                                }
                                            }
                                        } else
                                            if (pcase_var.eql($DISPLAY_CASE)) {
                                                {
                                                    SubLObject pcase_var_53 = value;
                                                    if (pcase_var_53.eql($MIXED)) {
                                                        value = $$$Mixed_Case;
                                                    } else
                                                        if (pcase_var_53.eql($LOWER)) {
                                                            value = $$$Lowercase;
                                                        } else
                                                            if (pcase_var_53.eql($UPPER)) {
                                                                value = $$$Uppercase;
                                                            }


                                                }
                                                format(stream_51, $str_alt445$____S__S_, tm_preference_key_to_string(key), value);
                                            } else
                                                if (pcase_var.eql($SEARCH_RELATIONS)) {
                                                    if (value == $ALL) {
                                                        format(stream_51, $str_alt445$____S__S_, tm_preference_key_to_string(key), $str_alt450$_ALL_);
                                                    } else {
                                                        {
                                                            SubLObject cdolist_list_var_54 = value;
                                                            SubLObject lexpred = NIL;
                                                            for (lexpred = cdolist_list_var_54.first(); NIL != cdolist_list_var_54; cdolist_list_var_54 = cdolist_list_var_54.rest() , lexpred = cdolist_list_var_54.first()) {
                                                                if (lexpred != $$preferredTerm) {
                                                                    format(stream_51, $str_alt445$____S__S_, tm_preference_key_to_string(key), tm_pred_arg_symbol(lexpred, ONE_INTEGER));
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else
                                                    if (pcase_var.eql($PARENT_DEPTH) || pcase_var.eql($CHILD_DEPTH)) {
                                                        if (NIL == value) {
                                                            value = $$$ALL;
                                                        } else
                                                            if (value == ZERO_INTEGER) {
                                                                value = $$$NONE;
                                                            }

                                                        format(stream_51, $str_alt445$____S__S_, tm_preference_key_to_string(key), value);
                                                    } else
                                                        if (pcase_var.eql($GRAPH_RELATION)) {
                                                            format(stream_51, $str_alt445$____S__S_, tm_preference_key_to_string(key), tm_pred_arg_symbol(value, ONE_INTEGER));
                                                        } else {
                                                            format(stream_51, $str_alt445$____S__S_, tm_preference_key_to_string(key), value);
                                                        }




                                    }
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Reads saved preferences from USER's preference file, if present, and
     * updates user-vector values accordingly.
     */
    public static final SubLObject tm_init_preferences_from_file(SubLObject user) {
        {
            SubLObject preference_file = tm_user_preferences_file(user);
            SubLObject list = NIL;
            if (NIL != Filesys.probe_file(preference_file)) {
                {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(preference_file, $INPUT, NIL);
                        if (!stream.isStream()) {
                            Errors.error($str_alt212$Unable_to_open__S, preference_file);
                        }
                        {
                            SubLObject stream_55 = stream;
                            SubLObject form = NIL;
                            for (form = read_ignoring_errors(stream_55, NIL, UNPROVIDED); form != $EOF; form = read_ignoring_errors(stream_55, NIL, UNPROVIDED)) {
                                list = cons(form, list);
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                }
                html_thesaurus.tm_update_preferences_from_list(list);
                return T;
            }
        }
        return NIL;
    }

    /**
     * If the user has no thesaurus preference set, and if *tm-default-thesaurus-name*
     * is the name of a valid thesaurus browsable to the user, set the preference to
     * that thesaurus.
     */
    public static final SubLObject tm_set_thesauri_if_necessary(SubLObject user) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == tm_datastructures.tm_value(user, $THESAURI)) {
                {
                    SubLObject thesaurus = NIL;
                    if (NIL != tm_control_vars.$tm_default_thesaurus_name$.getDynamicValue(thread)) {
                        thesaurus = thesaurus_constant_from_name(tm_control_vars.$tm_default_thesaurus_name$.getDynamicValue(thread));
                        if ((NIL != thesaurusP(thesaurus)) && (NIL != browsable_thesaurusP(thesaurus))) {
                            tm_datastructures.change_tm_value(user, $THESAURI, list(thesaurus), UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * produces a string containing the items in LIST, separated by commas.
     */
    public static final SubLObject comma_separate(SubLObject list) {
        {
            SubLObject result = NIL;
            result = cons(format(NIL, $str_alt441$_A, list.first()), result);
            {
                SubLObject cdolist_list_var = list.rest();
                SubLObject item = NIL;
                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                    result = cons($str_alt458$__, result);
                    result = cons(format(NIL, $str_alt441$_A, item), result);
                }
            }
            return string_utilities.strcat(nreverse(result));
        }
    }

    public static final SubLObject load_thesaurus_init_file(SubLObject full_pathname) {
        if (full_pathname == UNPROVIDED) {
            full_pathname = NIL;
        }
        {
            SubLObject pathname = (NIL != full_pathname) ? ((SubLObject) (full_pathname)) : file_utilities.cyc_home_filename(tm_datastructures.$thesaurus_subdirectories$.getGlobalValue(), tm_datastructures.$thesaurus_filename$.getGlobalValue(), tm_datastructures.$thesaurus_filename_extension$.getGlobalValue());
            if (pathname.isString() && (NIL != Filesys.probe_file(pathname))) {
                return load(pathname);
            } else {
                Errors.warn($str_alt459$Thesaurus_init_file__s_not_found_, pathname);
                return NIL;
            }
        }
    }

    /**
     * Initializes thesaurus datastructures from the KB.
     */
    public static final SubLObject tm_run_thesaurus_initializations(SubLObject force_index_rebuildP) {
        if (force_index_rebuildP == UNPROVIDED) {
            force_index_rebuildP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            tm_datastructures.init_tm_name_string_hash_from_kb();
            tm_datastructures.init_tm_abbreviation_hash_from_kb();
            tm_datastructures.init_tm_relation_predicate_map_from_kb();
            tm_datastructures.tm_init_user_id_hash_from_kb();
            tm_datastructures.tm_rebuild_alphabetical_index(force_index_rebuildP, UNPROVIDED);
            html_thesaurus.tm_init_multi_submit_map();
            if (NIL != tm_datastructures.$tm_basic_interface_availableP$.getDynamicValue(thread)) {
                html_basic_thesaurus.tm_init_basic_display_submit_map();
            }
            tm_io.init_pred_symbol_order_from_kb();
            return NIL;
        }
    }

    /**
     * Utility to be called while initializing the thesaurus manager.
     */
    public static final SubLObject tm_load_master_transcript() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Filesys.probe_file(transcript_utilities.read_transcript())) {
                format(T, $str_alt460$_______No_transcript_file_was_fou, transcript_utilities.read_transcript());
                if (transcript_utilities.read_transcript_position().numE(ZERO_INTEGER)) {
                    format(T, $str_alt461$_______This_is_expected_if_you_ar);
                } else {
                    format(T, $str_alt462$_______However__the_transcript_re);
                    format(T, $str_alt463$_______Resetting_it_to_zero_and_c);
                    transcript_utilities.set_read_transcript_position(ZERO_INTEGER);
                }
                return NIL;
            }
            tm_datastructures.init_tm_name_string_hash_from_kb();
            tm_datastructures.init_tm_abbreviation_hash_from_kb();
            tm_datastructures.init_tm_relation_predicate_map_from_kb();
            tm_datastructures.tm_init_user_id_hash_from_kb();
            {
                SubLObject transcript_length = NIL;
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(transcript_utilities.read_transcript(), $INPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt212$Unable_to_open__S, transcript_utilities.read_transcript());
                    }
                    {
                        SubLObject stream_56 = stream;
                        transcript_length = file_length(stream_56);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if (transcript_utilities.read_transcript_position().numL(transcript_length)) {
                    {
                        SubLObject _prev_bind_0 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                        try {
                            at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                            {
                                SubLObject count = operation_communication.load_transcript_file(transcript_utilities.read_transcript(), NIL, $NONE, transcript_utilities.read_transcript_position(), UNPROVIDED, UNPROVIDED_SYM);
                                operation_communication.set_total_remote_operations_run(add(operation_communication.total_remote_operations_run(), count));
                                transcript_utilities.set_read_transcript_position(transcript_length);
                            }
                        } finally {
                            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return NIL;
                } else
                    if (transcript_utilities.read_transcript_position().numE(transcript_length)) {
                        format(T, $str_alt465$______The_transcript_does_not_nee);
                        return NIL;
                    } else {
                        format(T, $str_alt466$______Problem__The_transcript_is_, subtract(transcript_utilities.read_transcript_position(), transcript_length));
                        format(T, $str_alt467$______Resetting_the_read_pointer_);
                        transcript_utilities.set_read_transcript_position(transcript_length);
                        format(T, $str_alt468$______Master_transcript_read_poin, transcript_utilities.read_transcript_position());
                        return NIL;
                    }

            }
        }
    }

    public static final SubLObject tm_show_read_transcript_read_status() {
        {
            SubLObject transcript_length = tm_read_transcript_length();
            format(T, $str_alt469$__Transcript___A, transcript_utilities.read_transcript());
            format(T, $str_alt470$__Length___A, transcript_length);
            format(T, $str_alt471$__Read_pointer___A, transcript_utilities.read_transcript_position());
            return NIL;
        }
    }

    public static final SubLObject tm_read_transcript_length() {
        {
            SubLObject transcript_length = ZERO_INTEGER;
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(transcript_utilities.read_transcript(), $INPUT, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt212$Unable_to_open__S, transcript_utilities.read_transcript());
                }
                {
                    SubLObject stream_57 = stream;
                    transcript_length = file_length(stream_57);
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return transcript_length;
        }
    }

    public static final SubLObject tm_wait_until_read_transcript_read() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject transcript_length = tm_read_transcript_length();
                SubLObject original_read_position = transcript_utilities.read_transcript_position();
                if (transcript_length.numG(original_read_position)) {
                    {
                        SubLObject need_to_wait = T;
                        {
                            SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
                            try {
                                utilities_macros.$silent_progressP$.bind(NIL, thread);
                                utilities_macros.$progress_note$.setDynamicValue($str_alt472$Waiting_for_master_transcript_to_, thread);
                                utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                utilities_macros.$progress_total$.setDynamicValue(subtract(transcript_length, original_read_position), thread);
                                utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                operation_communication.$transcript_read_attempted$.setGlobalValue(NIL);
                                control_vars.set_caught_up_on_master_transcript(NIL);
                                for (; NIL != need_to_wait;) {
                                    utilities_macros.$progress_sofar$.setDynamicValue(subtract(transcript_utilities.read_transcript_position(), original_read_position), thread);
                                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                    sleep($int$30);
                                    if (transcript_utilities.read_transcript_position().numGE(transcript_length)) {
                                        need_to_wait = NIL;
                                    }
                                }
                            } finally {
                                utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return NIL;
            }
        }
    }

    /**
     * Returns T IFF the interface should allow editing.  This is always nil if the user doesn't have at least limited-editor privileges, and might be nil for others if they have editing turned off or if editing is globally disabled.
     */
    public static final SubLObject editing_allowedP() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL == privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt420$limited_editor)) || (NIL != tm_control_vars.$tm_disable_editing_globally$.getDynamicValue(thread))) {
                return NIL;
            } else {
                return tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDITING_ENABLED);
            }
        }
    }

    /**
     * Returns a string consisting of STRING enclosed in single quotes.
     */
    public static final SubLObject tm_single_quote(SubLObject string) {
        return format(NIL, $str_alt474$__a_, string);
    }

    public static final SubLObject narrower_signs(SubLObject sign) {
        {
            SubLObject thesaurus = tm_datastructures.sign_thesaurus(sign);
            SubLObject concept = tm_datastructures.sign_concept(sign);
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = gt_modules.narrower_terms(concept, thesaurus);
            SubLObject narrower_concept = NIL;
            for (narrower_concept = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , narrower_concept = cdolist_list_var.first()) {
                if (narrower_concept != concept) {
                    ans = cons(tm_datastructures.sign_from_concept(narrower_concept, $$preferredTerm, thesaurus), ans);
                }
            }
            return ans;
        }
    }

    public static final SubLObject all_narrower_signs(SubLObject sign) {
        {
            SubLObject narrower_signs = narrower_signs(sign);
            return append(narrower_signs, list_utilities.mapappend(symbol_function(ALL_NARROWER_SIGNS), narrower_signs));
        }
    }

    /**
     * One of :lexpred :concept :string :thesaurus.  The property of the sign to match for gathering purposes.
     */
    // defparameter
    private static final SubLSymbol $tm_gather_sign_aspect$ = makeSymbol("*TM-GATHER-SIGN-ASPECT*");

    /**
     * The value to be matched for gathering.
     */
    // defparameter
    private static final SubLSymbol $tm_gather_sign_value$ = makeSymbol("*TM-GATHER-SIGN-VALUE*");

    /**
     * List of signs being gathered.
     */
    // defparameter
    private static final SubLSymbol $tm_gather_signs$ = makeSymbol("*TM-GATHER-SIGNS*");

    public static final SubLObject gather_signs_mapper(SubLObject sign) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject aspect = $tm_gather_sign_aspect$.getDynamicValue(thread);
                SubLObject value = $tm_gather_sign_value$.getDynamicValue(thread);
                SubLObject pcase_var = aspect;
                if (pcase_var.eql($LEXPRED)) {
                    if (tm_datastructures.sign_relation(sign) == value) {
                        $tm_gather_signs$.setDynamicValue(cons(sign, $tm_gather_signs$.getDynamicValue(thread)), thread);
                    }
                } else
                    if (pcase_var.eql($CONCEPT)) {
                        if (tm_datastructures.sign_concept(sign) == value) {
                            $tm_gather_signs$.setDynamicValue(cons(sign, $tm_gather_signs$.getDynamicValue(thread)), thread);
                        }
                    } else
                        if (pcase_var.eql($STRING)) {
                            if (tm_datastructures.sign_term(sign).equalp(value)) {
                                $tm_gather_signs$.setDynamicValue(cons(sign, $tm_gather_signs$.getDynamicValue(thread)), thread);
                            }
                        } else
                            if (pcase_var.eql($THESAURUS)) {
                                if (tm_datastructures.sign_thesaurus(sign) == value) {
                                    $tm_gather_signs$.setDynamicValue(cons(sign, $tm_gather_signs$.getDynamicValue(thread)), thread);
                                }
                            }



            }
            return NIL;
        }
    }

    /**
     * returns a list of signs extracted from SIGNS which have ASPECT matching VALUE.  ASPECT is one of :lexpred, :concept, :string, or :thesaurus.
     */
    public static final SubLObject extract_signs_matching(SubLObject signs, SubLObject aspect, SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $tm_gather_sign_aspect$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $tm_gather_sign_value$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $tm_gather_signs$.currentBinding(thread);
                    try {
                        $tm_gather_sign_aspect$.bind(aspect, thread);
                        $tm_gather_sign_value$.bind(value, thread);
                        $tm_gather_signs$.bind(NIL, thread);
                        Mapping.mapcar(symbol_function(GATHER_SIGNS_MAPPER), signs);
                        ans = $tm_gather_signs$.getDynamicValue(thread);
                    } finally {
                        $tm_gather_signs$.rebind(_prev_bind_2, thread);
                        $tm_gather_sign_value$.rebind(_prev_bind_1, thread);
                        $tm_gather_sign_aspect$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     * returns a sorted list of names of the thesauri that the relation rel-constant
     * is available in.
     */
    public static final SubLObject relation_available_in_thesauri(SubLObject rel_constant) {
        SubLSystemTrampolineFile.checkType(rel_constant, $sym480$THESAURUS_PREDICATE_);
        {
            SubLObject ans = NIL;
            SubLObject all_thesauri = all_thesauri_sorted();
            SubLObject cdolist_list_var = all_thesauri;
            SubLObject thesaurus = NIL;
            for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                if (NIL == kb_mapping_utilities.pred_u_v_holds_in_mt($$tmRelationRestrictedFrom, rel_constant, thesaurus, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    ans = cons(thesaurus_name(thesaurus), ans);
                }
            }
            return ans;
        }
    }

    /**
     * returns a list of all symbols for relations that are available in thesaurus
     */
    public static final SubLObject relations_available_in_thesaurus(SubLObject thesaurus) {
        if (NIL == thesaurusP(thesaurus)) {
            return format(NIL, $str_alt481$ERROR___a_is_not_a_valid_thesauru, thesaurus);
        }
        {
            SubLObject ans = NIL;
            SubLObject relations = all_relation_symbols_in_order();
            SubLObject cdolist_list_var = relations;
            SubLObject symbol = NIL;
            for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                if (NIL == kb_mapping_utilities.pred_u_v_holds_in_mt($$tmRelationRestrictedFrom, second(assoc(symbol, tm_datastructures.$tm_relation_predicate_map$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED)), thesaurus, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    ans = cons(symbol, ans);
                }
            }
            return Sort.sort(ans, symbol_function($sym49$TM_PRED_SYMBOL__), UNPROVIDED);
        }
    }

    /**
     * returns a list of all symbols for relations that are restricted
     */
    public static final SubLObject restricted_relations(SubLObject inactiveP) {
        {
            SubLObject ans = NIL;
            SubLObject relations = (NIL != inactiveP) ? ((SubLObject) (tm_inactive_relation_symbols_sorted_no_inverse())) : tm_active_relation_symbols_sorted_no_inverse();
            SubLObject cdolist_list_var = relations;
            SubLObject symbol = NIL;
            for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                if (NIL != kb_mapping_utilities.some_pred_value_in_mt(second(assoc(symbol, tm_datastructures.$tm_relation_predicate_map$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED)), $$tmRelationRestrictedFrom, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                    ans = cons(symbol, ans);
                }
            }
            return Sort.sort(ans, symbol_function($sym49$TM_PRED_SYMBOL__), UNPROVIDED);
        }
    }

    /**
     * returns a list of all symbols for relations that are unrestricted
     */
    public static final SubLObject unrestricted_relations(SubLObject inactiveP) {
        {
            SubLObject ans = NIL;
            SubLObject relations = (NIL != inactiveP) ? ((SubLObject) (tm_inactive_relation_symbols_sorted_no_inverse())) : tm_active_relation_symbols_sorted_no_inverse();
            SubLObject cdolist_list_var = relations;
            SubLObject symbol = NIL;
            for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                if (!((NIL != kb_mapping_utilities.some_pred_value_in_mt(second(assoc(symbol, tm_datastructures.$tm_relation_predicate_map$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED)), $$tmRelationRestrictedFrom, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) || (NIL != member(symbol, tm_datastructures.$tm_core_relations$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED)))) {
                    ans = cons(symbol, ans);
                }
            }
            return Sort.sort(ans, symbol_function($sym49$TM_PRED_SYMBOL__), UNPROVIDED);
        }
    }

    /**
     * returns T if relation is restricted
     */
    public static final SubLObject restrictedP(SubLObject relation) {
        return kb_mapping_utilities.some_pred_value_in_mt(relation, $$tmRelationRestrictedFrom, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    /**
     * returns T if the relation is restricted in the thesaurus; else nil
     */
    public static final SubLObject relation_restricted_in_thesaurusP(SubLObject rel_constant, SubLObject thesaurus_constant) {
        return kb_mapping_utilities.pred_u_v_holds_in_mt($$tmRelationRestrictedFrom, rel_constant, thesaurus_constant, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject declare_tm_internals_file() {
        declareFunction("thesaurus_gensymP", "THESAURUS-GENSYM?", 1, 0, false);
        declareFunction("tm_random_gensym", "TM-RANDOM-GENSYM", 0, 0, false);
        declareFunction("all_thesauri", "ALL-THESAURI", 0, 0, false);
        declareFunction("all_thesauri_sorted", "ALL-THESAURI-SORTED", 0, 0, false);
        declareFunction("thesaurusP", "THESAURUS?", 1, 0, false);
        declareFunction("released_thesaurusP", "RELEASED-THESAURUS?", 1, 0, false);
        declareFunction("released_thesauri", "RELEASED-THESAURI", 0, 0, false);
        declareFunction("released_thesauri_sorted", "RELEASED-THESAURI-SORTED", 0, 0, false);
        declareFunction("empty_thesauri", "EMPTY-THESAURI", 0, 0, false);
        declareFunction("empty_thesauri_sorted", "EMPTY-THESAURI-SORTED", 0, 0, false);
        declareFunction("thesaurus_name", "THESAURUS-NAME", 1, 0, false);
        declareFunction("all_thesauri_names", "ALL-THESAURI-NAMES", 0, 0, false);
        declareFunction("thesaurus_abbreviation", "THESAURUS-ABBREVIATION", 1, 0, false);
        declareFunction("valid_thesaurus_nameP", "VALID-THESAURUS-NAME?", 1, 0, false);
        declareFunction("invalid_thesaurus_name_char", "INVALID-THESAURUS-NAME-CHAR", 1, 0, false);
        declareFunction("valid_thesaurus_name_char", "VALID-THESAURUS-NAME-CHAR", 1, 0, false);
        declareFunction("thesaurus_constant_from_name", "THESAURUS-CONSTANT-FROM-NAME", 1, 0, false);
        declareFunction("thesaurus_constant_from_abbreviation", "THESAURUS-CONSTANT-FROM-ABBREVIATION", 1, 0, false);
        declareFunction("thesaurus_constant_from_string", "THESAURUS-CONSTANT-FROM-STRING", 1, 0, false);
        declareFunction("thesaurus_load_date", "THESAURUS-LOAD-DATE", 1, 0, false);
        declareFunction("thesaurus_loader", "THESAURUS-LOADER", 1, 0, false);
        declareFunction("valid_abbreviationP", "VALID-ABBREVIATION?", 1, 0, false);
        declareFunction("term_abbreviation", "TERM-ABBREVIATION", 1, 1, false);
        declareFunction("canonicalize_lexical_term", "CANONICALIZE-LEXICAL-TERM", 1, 0, false);
        declareFunction("preferred_terms", "PREFERRED-TERMS", 1, 0, false);
        declareFunction("use_fors", "USE-FORS", 1, 0, false);
        declareFunction("gather_use_fors", "GATHER-USE-FORS", 2, 0, false);
        declareFunction("use_fors_in_thesaurus", "USE-FORS-IN-THESAURUS", 2, 0, false);
        declareFunction("pt_in_thesaurus", "PT-IN-THESAURUS", 2, 0, false);
        declareFunction("tm_string_for_constant", "TM-STRING-FOR-CONSTANT", 1, 3, false);
        declareFunction("tm_string_for_sorting_search_results", "TM-STRING-FOR-SORTING-SEARCH-RESULTS", 1, 0, false);
        declareFunction("tm_pt_or_string_in_thesaurus", "TM-PT-OR-STRING-IN-THESAURUS", 1, 1, false);
        declareFunction("tm_select_relation", "TM-SELECT-RELATION", 1, 0, false);
        declareFunction("bt_1", "BT-1", 2, 4, false);
        declareFunction("bt", "BT", 1, 6, false);
        declareFunction("nt_1", "NT-1", 2, 4, false);
        declareFunction("nt", "NT", 1, 6, false);
        declareFunction("btP", "BT?", 3, 0, false);
        declareFunction("thesaurus_preferred_term_count", "THESAURUS-PREFERRED-TERM-COUNT", 1, 0, false);
        declareFunction("thesaurus_use_for_count", "THESAURUS-USE-FOR-COUNT", 1, 1, false);
        declareFunction("thesaurus_scope_note_count", "THESAURUS-SCOPE-NOTE-COUNT", 1, 1, false);
        declareFunction("thesaurus_related_term_count", "THESAURUS-RELATED-TERM-COUNT", 1, 1, false);
        declareFunction("tm_thesaurus_assertion_count", "TM-THESAURUS-ASSERTION-COUNT", 1, 0, false);
        declareFunction("tm_all_thesauri_assertion_count", "TM-ALL-THESAURI-ASSERTION-COUNT", 0, 0, false);
        declareFunction("tm_thesaurus_lexical_assertion_count", "TM-THESAURUS-LEXICAL-ASSERTION-COUNT", 1, 2, false);
        declareFunction("tm_thesauri_lexical_assertion_count", "TM-THESAURI-LEXICAL-ASSERTION-COUNT", 1, 1, false);
        declareFunction("tm_count_concepts", "TM-COUNT-CONCEPTS", 0, 0, false);
        declareFunction("tm_count_concepts_internal", "TM-COUNT-CONCEPTS-INTERNAL", 1, 0, false);
        declareFunction("tm_user_term_count", "TM-USER-TERM-COUNT", 2, 0, false);
        declareFunction("tm_user_assertion_count", "TM-USER-ASSERTION-COUNT", 2, 0, false);
        declareFunction("tm_user_assertion_count_internal", "TM-USER-ASSERTION-COUNT-INTERNAL", 1, 0, false);
        declareFunction("relation_constant_from_abbreviation", "RELATION-CONSTANT-FROM-ABBREVIATION", 1, 0, false);
        declareFunction("relation_term_arg", "RELATION-TERM-ARG", 1, 0, false);
        declareFunction("relation_term_arg_from_abbreviation", "RELATION-TERM-ARG-FROM-ABBREVIATION", 1, 0, false);
        declareFunction("relation_value_arg", "RELATION-VALUE-ARG", 1, 0, false);
        declareFunction("relation_value_arg_from_abbreviation", "RELATION-VALUE-ARG-FROM-ABBREVIATION", 1, 0, false);
        declareFunction("tm_pred_arg_symbol", "TM-PRED-ARG-SYMBOL", 2, 0, false);
        declareFunction("tm_pred_symbol_L", "TM-PRED-SYMBOL-<", 2, 0, false);
        declareFunction("tm_transitive_active_relation_constants", "TM-TRANSITIVE-ACTIVE-RELATION-CONSTANTS", 0, 0, false);
        declareFunction("tm_transitive_active_relation_names", "TM-TRANSITIVE-ACTIVE-RELATION-NAMES", 0, 0, false);
        declareFunction("mark_graphable_spec_preds_int", "MARK-GRAPHABLE-SPEC-PREDS-INT", 3, 0, false);
        declareFunction("mark_graphable_spec_preds", "MARK-GRAPHABLE-SPEC-PREDS", 1, 0, false);
        declareFunction("tm_classify_type", "TM-CLASSIFY-TYPE", 1, 0, false);
        declareFunction("tm_relation_argtype", "TM-RELATION-ARGTYPE", 2, 0, false);
        declareFunction("tm_relation_arg1type", "TM-RELATION-ARG1TYPE", 1, 0, false);
        declareFunction("tm_relation_arg2type", "TM-RELATION-ARG2TYPE", 1, 0, false);
        declareFunction("thesaurus_predicates", "THESAURUS-PREDICATES", 0, 0, false);
        declareFunction("thesaurus_predicateP", "THESAURUS-PREDICATE?", 1, 0, false);
        declareFunction("tm_active_relations", "TM-ACTIVE-RELATIONS", 0, 0, false);
        declareFunction("tm_active_relation_p", "TM-ACTIVE-RELATION-P", 1, 0, false);
        declareFunction("tm_inactive_relation_p", "TM-INACTIVE-RELATION-P", 1, 0, false);
        declareFunction("tm_active_relation_symbols_sorted", "TM-ACTIVE-RELATION-SYMBOLS-SORTED", 0, 0, false);
        declareFunction("tm_inactive_relation_symbols_sorted", "TM-INACTIVE-RELATION-SYMBOLS-SORTED", 0, 0, false);
        declareFunction("all_relation_symbols_in_order", "ALL-RELATION-SYMBOLS-IN-ORDER", 0, 0, false);
        declareFunction("tm_active_relation_symbols_sorted_no_inverse", "TM-ACTIVE-RELATION-SYMBOLS-SORTED-NO-INVERSE", 0, 0, false);
        declareFunction("tm_inactive_relation_symbols_sorted_no_inverse", "TM-INACTIVE-RELATION-SYMBOLS-SORTED-NO-INVERSE", 0, 0, false);
        declareFunction("tm_lexpreds_from_kb", "TM-LEXPREDS-FROM-KB", 0, 0, false);
        declareFunction("tm_lexical_predicateP", "TM-LEXICAL-PREDICATE?", 1, 0, false);
        declareFunction("tm_documentation_predicateP", "TM-DOCUMENTATION-PREDICATE?", 1, 0, false);
        declareFunction("tm_url_predicateP", "TM-URL-PREDICATE?", 1, 0, false);
        declareFunction("tm_concept_predicateP", "TM-CONCEPT-PREDICATE?", 1, 0, false);
        declareFunction("tm_bookkeeping_predicateP", "TM-BOOKKEEPING-PREDICATE?", 1, 0, false);
        declareFunction("clear_cached_tm_bookkeeping_predicateP", "CLEAR-CACHED-TM-BOOKKEEPING-PREDICATE?", 0, 0, false);
        declareFunction("remove_cached_tm_bookkeeping_predicateP", "REMOVE-CACHED-TM-BOOKKEEPING-PREDICATE?", 1, 0, false);
        declareFunction("cached_tm_bookkeeping_predicateP_internal", "CACHED-TM-BOOKKEEPING-PREDICATE?-INTERNAL", 1, 0, false);
        declareFunction("cached_tm_bookkeeping_predicateP", "CACHED-TM-BOOKKEEPING-PREDICATE?", 1, 0, false);
        declareFunction("tm_classify_format", "TM-CLASSIFY-FORMAT", 1, 0, false);
        declareFunction("symmetric_relP", "SYMMETRIC-REL?", 1, 0, false);
        declareFunction("asymmetric_relP", "ASYMMETRIC-REL?", 1, 0, false);
        declareFunction("transitive_relP", "TRANSITIVE-REL?", 1, 0, false);
        declareFunction("reflexive_relP", "REFLEXIVE-REL?", 1, 0, false);
        declareFunction("irreflexive_relP", "IRREFLEXIVE-REL?", 1, 0, false);
        declareFunction("inverse_relation", "INVERSE-RELATION", 1, 0, false);
        declareFunction("narrower_relations", "NARROWER-RELATIONS", 1, 0, false);
        declareFunction("broader_relations", "BROADER-RELATIONS", 1, 0, false);
        declareFunction("max_broader_relation", "MAX-BROADER-RELATION", 1, 0, false);
        declareFunction("relation_documentation", "RELATION-DOCUMENTATION", 1, 0, false);
        declareFunction("replace_variable_length_matches", "REPLACE-VARIABLE-LENGTH-MATCHES", 3, 0, false);
        declareFunction("cardinality_possibilities_for_relation", "CARDINALITY-POSSIBILITIES-FOR-RELATION", 1, 0, false);
        declareFunction("cardinality_possibilities_for_relation_props", "CARDINALITY-POSSIBILITIES-FOR-RELATION-PROPS", 3, 1, false);
        declareFunction("tm_filterP", "TM-FILTER?", 1, 0, false);
        declareFunction("tm_use_filteringP", "TM-USE-FILTERING?", 7, 0, false);
        declareFunction("tm_filter_name", "TM-FILTER-NAME", 1, 0, false);
        declareFunction("tm_filter_from_name", "TM-FILTER-FROM-NAME", 1, 0, false);
        declareFunction("tm_make_filter_current", "TM-MAKE-FILTER-CURRENT", 1, 0, false);
        declareFunction("tm_relations_to_output_as_this_according_to_filter", "TM-RELATIONS-TO-OUTPUT-AS-THIS-ACCORDING-TO-FILTER", 2, 1, false);
        declareFunction("tm_same_relation_name", "TM-SAME-RELATION-NAME", 3, 1, false);
        declareFunction("tm_relations_to_output_with_this_print_name", "TM-RELATIONS-TO-OUTPUT-WITH-THIS-PRINT-NAME", 2, 1, false);
        declareFunction("tm_same_print_name", "TM-SAME-PRINT-NAME", 3, 1, false);
        declareFunction("tm_relations_with_filter_information", "TM-RELATIONS-WITH-FILTER-INFORMATION", 1, 0, false);
        declareFunction("tm_collect_relation_keys_from_filter", "TM-COLLECT-RELATION-KEYS-FROM-FILTER", 2, 0, false);
        declareFunction("tm_output_as_relation_according_to_filter", "TM-OUTPUT-AS-RELATION-ACCORDING-TO-FILTER", 2, 0, false);
        declareFunction("tm_output_with_print_name_according_to_filter", "TM-OUTPUT-WITH-PRINT-NAME-ACCORDING-TO-FILTER", 2, 0, false);
        declareFunction("tm_make_ops_to_edit_filter", "TM-MAKE-OPS-TO-EDIT-FILTER", 3, 0, false);
        declareFunction("tm_update_all_cached_filters", "TM-UPDATE-ALL-CACHED-FILTERS", 0, 0, false);
        declareFunction("tm_make_list_of_ops_to_edit_filters_for_relation_edit", "TM-MAKE-LIST-OF-OPS-TO-EDIT-FILTERS-FOR-RELATION-EDIT", 1, 1, false);
        declareFunction("tm_make_ops_to_edit_filters_for_relation_edit", "TM-MAKE-OPS-TO-EDIT-FILTERS-FOR-RELATION-EDIT", 1, 0, false);
        declareFunction("do_delete_output_filter", "DO-DELETE-OUTPUT-FILTER", 1, 0, false);
        declareFunction("tm_default_display_filter", "TM-DEFAULT-DISPLAY-FILTER", 1, 0, false);
        declareFunction("tm_default_output_filter", "TM-DEFAULT-OUTPUT-FILTER", 1, 0, false);
        declareFunction("tm_thesauri_for_which_default_display_filter", "TM-THESAURI-FOR-WHICH-DEFAULT-DISPLAY-FILTER", 1, 0, false);
        declareFunction("tm_thesauri_for_which_default_output_filter", "TM-THESAURI-FOR-WHICH-DEFAULT-OUTPUT-FILTER", 1, 0, false);
        declareFunction("tm_all_filters", "TM-ALL-FILTERS", 0, 0, false);
        declareFunction("tm_filter_infoP", "TM-FILTER-INFO?", 1, 0, false);
        declareFunction("tm_filter_info", "TM-FILTER-INFO", 1, 1, false);
        declareFunction("tm_set_filter_info_entry", "TM-SET-FILTER-INFO-ENTRY", 3, 0, false);
        declareFunction("tm_get_filter_info_entry", "TM-GET-FILTER-INFO-ENTRY", 2, 0, false);
        declareFunction("tm_filter_info_fieldP", "TM-FILTER-INFO-FIELD?", 1, 0, false);
        declareFunction("tm_get_filter_info_entry_int", "TM-GET-FILTER-INFO-ENTRY-INT", 2, 0, false);
        declareFunction("tm_set_filter_info_entry_int", "TM-SET-FILTER-INFO-ENTRY-INT", 3, 0, false);
        declareFunction("tm_print_name_default", "TM-PRINT-NAME-DEFAULT", 1, 0, false);
        declareFunction("tm_relation_name_default", "TM-RELATION-NAME-DEFAULT", 1, 0, false);
        declareFunction("tm_get_filter_map", "TM-GET-FILTER-MAP", 1, 0, false);
        declareFunction("tm_filter_map_entry", "TM-FILTER-MAP-ENTRY", 2, 0, false);
        declareFunction("tm_map_over_filter_map_entries", "TM-MAP-OVER-FILTER-MAP-ENTRIES", 2, 1, false);
        declareFunction("tm_filter_initializedP", "TM-FILTER-INITIALIZED?", 1, 0, false);
        declareFunction("tm_initialize_filter", "TM-INITIALIZE-FILTER", 1, 0, false);
        declareFunction("tm_make_filter_current_int", "TM-MAKE-FILTER-CURRENT-INT", 1, 0, false);
        declareFunction("tm_store_kb_information_in_filter_map", "TM-STORE-KB-INFORMATION-IN-FILTER-MAP", 2, 0, false);
        declareFunction("tm_new_mapping_info_entry", "TM-NEW-MAPPING-INFO-ENTRY", 0, 0, false);
        declareFunction("tm_copy_mapping_info_entry", "TM-COPY-MAPPING-INFO-ENTRY", 1, 0, false);
        declareFunction("tm_set_mapping_info_symbol_to_output", "TM-SET-MAPPING-INFO-SYMBOL-TO-OUTPUT", 2, 0, false);
        declareFunction("tm_get_mapping_info_symbol_to_output", "TM-GET-MAPPING-INFO-SYMBOL-TO-OUTPUT", 1, 0, false);
        declareFunction("tm_set_mapping_info_print_name", "TM-SET-MAPPING-INFO-PRINT-NAME", 2, 0, false);
        declareFunction("tm_get_mapping_info_print_name", "TM-GET-MAPPING-INFO-PRINT-NAME", 1, 0, false);
        declareFunction("tm_subword_delimiterP", "TM-SUBWORD-DELIMITER?", 1, 0, false);
        declareFunction("tm_case_style_specifierP", "TM-CASE-STYLE-SPECIFIER?", 1, 0, false);
        declareFunction("tm_case_style_from_case_style_specifier", "TM-CASE-STYLE-FROM-CASE-STYLE-SPECIFIER", 1, 0, false);
        declareFunction("tm_case_style_to_use_for_thesaurus", "TM-CASE-STYLE-TO-USE-FOR-THESAURUS", 1, 0, false);
        declareFunction("tm_default_case_for_thesaurus", "TM-DEFAULT-CASE-FOR-THESAURUS", 1, 0, false);
        declareFunction("tm_set_default_case_for_thesaurus", "TM-SET-DEFAULT-CASE-FOR-THESAURUS", 2, 0, false);
        declareFunction("canonicalize_string_case_for_thesaurus", "CANONICALIZE-STRING-CASE-FOR-THESAURUS", 2, 0, false);
        declareFunction("tm_canonicalize_gaf_strings_for_thesaurus", "TM-CANONICALIZE-GAF-STRINGS-FOR-THESAURUS", 2, 0, false);
        declareFunction("tm_capitalize_first_subword", "TM-CAPITALIZE-FIRST-SUBWORD", 1, 0, false);
        declareFunction("tm_capitalize_subwords", "TM-CAPITALIZE-SUBWORDS", 1, 0, false);
        declareFunction("tm_integrity_module_valid_use_valueP", "TM-INTEGRITY-MODULE-VALID-USE-VALUE?", 1, 0, false);
        declareFunction("tm_use_integrity_module_for_thesaurusP", "TM-USE-INTEGRITY-MODULE-FOR-THESAURUS?", 2, 0, false);
        declareFunction("tm_use_integrity_module_for_thesaurus_p", "TM-USE-INTEGRITY-MODULE-FOR-THESAURUS-P", 2, 0, false);
        declareFunction("tm_set_use_value_for_integrity_module_for_thesaurus", "TM-SET-USE-VALUE-FOR-INTEGRITY-MODULE-FOR-THESAURUS", 3, 0, false);
        declareFunction("concept_from_term_lexpred_in_thesaurus", "CONCEPT-FROM-TERM-LEXPRED-IN-THESAURUS", 3, 0, false);
        declareFunction("concepts_from_term_lexpred_in_thesaurus", "CONCEPTS-FROM-TERM-LEXPRED-IN-THESAURUS", 3, 0, false);
        declareFunction("concepts_from_term_lexpred_in_any_thesaurus", "CONCEPTS-FROM-TERM-LEXPRED-IN-ANY-THESAURUS", 2, 0, false);
        declareFunction("thesaurus_concept_p", "THESAURUS-CONCEPT-P", 1, 0, false);
        declareFunction("browsable_thesaurus_concept_p", "BROWSABLE-THESAURUS-CONCEPT-P", 1, 0, false);
        declareFunction("search_thesauri", "SEARCH-THESAURI", 1, 6, false);
        declareFunction("exact_search_thesauri", "EXACT-SEARCH-THESAURI", 1, 2, false);
        declareFunction("thesauri_of_concept", "THESAURI-OF-CONCEPT", 1, 0, false);
        declareFunction("concept_in_thesaurusP", "CONCEPT-IN-THESAURUS?", 2, 0, false);
        declareFunction("active_thesauri_where_lexterm", "ACTIVE-THESAURI-WHERE-LEXTERM", 3, 1, false);
        declareFunction("tm_make_thesaurus_name", "TM-MAKE-THESAURUS-NAME", 1, 0, false);
        declareFunction("do_create_thesaurus", "DO-CREATE-THESAURUS", 2, 0, false);
        declareFunction("tm_make_filter_name", "TM-MAKE-FILTER-NAME", 1, 0, false);
        declareFunction("do_create_output_filter", "DO-CREATE-OUTPUT-FILTER", 1, 0, false);
        declareFunction("do_delete_thesaurus", "DO-DELETE-THESAURUS", 1, 0, false);
        declareFunction("tm_kill", "TM-KILL", 1, 0, false);
        declareFunction("tm_possibly_demote_top", "TM-POSSIBLY-DEMOTE-TOP", 1, 0, false);
        declareFunction("tm_api_delete_thesaurus", "TM-API-DELETE-THESAURUS", 1, 0, false);
        declareFunction("tm_api_delete_thesaurus_with_save_and_log", "TM-API-DELETE-THESAURUS-WITH-SAVE-AND-LOG", 3, 0, false);
        declareFunction("do_create_relation", "DO-CREATE-RELATION", 0, 0, false);
        declareFunction("tm_create_relation_formulas", "TM-CREATE-RELATION-FORMULAS", 1, 0, false);
        declareFunction("tm_express_fi_message", "TM-EXPRESS-FI-MESSAGE", 1, 0, false);
        declareFunction("do_kill_relation", "DO-KILL-RELATION", 1, 0, false);
        declareFunction("compute_longest_parent_path", "COMPUTE-LONGEST-PARENT-PATH", 1, 0, false);
        declareFunction("compress_parent_paths", "COMPRESS-PARENT-PATHS", 1, 0, false);
        declareFunction("construct_parent_paths_int", "CONSTRUCT-PARENT-PATHS-INT", 2, 6, false);
        declareFunction("construct_parent_paths", "CONSTRUCT-PARENT-PATHS", 2, 4, false);
        declareFunction("declarative_top_in_thesaurusP", "DECLARATIVE-TOP-IN-THESAURUS?", 2, 0, false);
        declareFunction("declarative_top_in_which_thesauri", "DECLARATIVE-TOP-IN-WHICH-THESAURI", 1, 0, false);
        declareFunction("top_in_thesaurusP", "TOP-IN-THESAURUS?", 2, 0, false);
        declareFunction("possible_top_in_thesaurusP", "POSSIBLE-TOP-IN-THESAURUS?", 2, 0, false);
        declareFunction("thesaurus_tops", "THESAURUS-TOPS", 1, 0, false);
        declareFunction("assert_thesaurus_top", "ASSERT-THESAURUS-TOP", 2, 0, false);
        declareFunction("update_compute_tops_results", "UPDATE-COMPUTE-TOPS-RESULTS", 3, 0, false);
        declareFunction("compute_tops_1", "COMPUTE-TOPS-1", 3, 2, false);
        declareFunction("first_preferred_term_of_car", "FIRST-PREFERRED-TERM-OF-CAR", 1, 0, false);
        declareFunction("compute_tops", "COMPUTE-TOPS", 2, 1, false);
        declareFunction("tm_alphabetical_placement", "TM-ALPHABETICAL-PLACEMENT", 1, 2, false);
        declareFunction("tm_maybe_use_case_default_for_operation_typeP", "TM-MAYBE-USE-CASE-DEFAULT-FOR-OPERATION-TYPE?", 1, 0, false);
        declareFunction("get_operation_arg_list_map", "GET-OPERATION-ARG-LIST-MAP", 1, 0, false);
        declareFunction("check_operation_syntax", "CHECK-OPERATION-SYNTAX", 1, 0, false);
        declareFunction("check_operation_string_args_case", "CHECK-OPERATION-STRING-ARGS-CASE", 1, 0, false);
        declareFunction("check_delete_term_operation", "CHECK-DELETE-TERM-OPERATION", 1, 0, false);
        declareFunction("check_edit_operation", "CHECK-EDIT-OPERATION", 1, 0, false);
        declareFunction("check_convert_nt_uf_operation", "CHECK-CONVERT-NT-UF-OPERATION", 1, 0, false);
        declareFunction("check_create_operation", "CHECK-CREATE-OPERATION", 1, 0, false);
        declareFunction("replace_arg_position", "REPLACE-ARG-POSITION", 2, 0, false);
        declareFunction("check_replace_operation", "CHECK-REPLACE-OPERATION", 1, 0, false);
        declareFunction("check_swap_pt_uf_operation", "CHECK-SWAP-PT-UF-OPERATION", 1, 0, false);
        declareFunction("check_operation_argument_syntax", "CHECK-OPERATION-ARGUMENT-SYNTAX", 1, 0, false);
        declareFunction("check_operation_argument", "CHECK-OPERATION-ARGUMENT", 5, 0, false);
        declareFunction("check_op_sn", "CHECK-OP-SN", 1, 0, false);
        declareFunction("check_op_uf", "CHECK-OP-UF", 1, 0, false);
        declareFunction("check_op_bt", "CHECK-OP-BT", 1, 0, false);
        declareFunction("check_op_rt", "CHECK-OP-RT", 1, 0, false);
        declareFunction("check_op_names", "CHECK-OP-NAMES", 1, 0, false);
        declareFunction("check_op_pt", "CHECK-OP-PT", 1, 0, false);
        declareFunction("check_op_stoplist", "CHECK-OP-STOPLIST", 1, 0, false);
        declareFunction("check_op_generic", "CHECK-OP-GENERIC", 1, 0, false);
        declareFunction("check_op_single_entry_arg", "CHECK-OP-SINGLE-ENTRY-ARG", 2, 0, false);
        declareFunction("check_op_irreflexive", "CHECK-OP-IRREFLEXIVE", 1, 0, false);
        declareFunction("check_op_asymmetric", "CHECK-OP-ASYMMETRIC", 1, 0, false);
        declareFunction("check_operation_semantics", "CHECK-OPERATION-SEMANTICS", 1, 0, false);
        declareFunction("check_operations", "CHECK-OPERATIONS", 1, 0, false);
        declareFunction("perform_operation", "PERFORM-OPERATION", 1, 0, false);
        declareFunction("convert_arg", "CONVERT-ARG", 1, 0, false);
        declareFunction("operation_fi_commands", "OPERATION-FI-COMMANDS", 1, 0, false);
        declareFunction("kill_term_fi_commands_top_level", "KILL-TERM-FI-COMMANDS-TOP-LEVEL", 3, 0, false);
        declareFunction("kill_term_fi_commands_for_assertion", "KILL-TERM-FI-COMMANDS-FOR-ASSERTION", 1, 0, false);
        declareFunction("kill_term_fi_commands", "KILL-TERM-FI-COMMANDS", 2, 0, false);
        declareFunction("convert_nt_pt_fi_commands", "CONVERT-NT-PT-FI-COMMANDS", 2, 0, false);
        declareFunction("active_entityP", "ACTIVE-ENTITY?", 1, 0, false);
        declareFunction("tm_userP", "TM-USER?", 1, 0, false);
        declareFunction("all_users", "ALL-USERS", 0, 0, false);
        declareFunction("all_active_users", "ALL-ACTIVE-USERS", 0, 0, false);
        declareFunction("all_inactive_users", "ALL-INACTIVE-USERS", 0, 0, false);
        declareFunction("all_administrators", "ALL-ADMINISTRATORS", 0, 0, false);
        declareFunction("all_full_editors", "ALL-FULL-EDITORS", 0, 0, false);
        declareFunction("user_name", "USER-NAME", 1, 0, false);
        declareFunction("tm_user_constant_from_user_name", "TM-USER-CONSTANT-FROM-USER-NAME", 1, 0, false);
        declareFunction("personal_name", "PERSONAL-NAME", 1, 0, false);
        declareFunction("tm_recognized_userP", "TM-RECOGNIZED-USER?", 1, 0, false);
        declareFunction("make_user_constant_name", "MAKE-USER-CONSTANT-NAME", 1, 0, false);
        declareFunction("valid_guest_name", "VALID-GUEST-NAME", 1, 0, false);
        declareFunction("user_level", "USER-LEVEL", 1, 0, false);
        declareFunction("user_level_rank", "USER-LEVEL-RANK", 1, 0, false);
        declareFunction("privelegedP", "PRIVELEGED?", 2, 0, false);
        declareFunction("tm_administratorP", "TM-ADMINISTRATOR?", 1, 0, false);
        declareFunction("tm_full_editorP", "TM-FULL-EDITOR?", 1, 0, false);
        declareFunction("user_password", "USER-PASSWORD", 1, 0, false);
        declareFunction("thesaurus_explicit_browsers", "THESAURUS-EXPLICIT-BROWSERS", 1, 1, false);
        declareFunction("thesaurus_browsers", "THESAURUS-BROWSERS", 1, 1, false);
        declareFunction("thesaurus_explicit_editors", "THESAURUS-EXPLICIT-EDITORS", 1, 1, false);
        declareFunction("thesaurus_editors", "THESAURUS-EDITORS", 1, 1, false);
        declareFunction("declarative_editable_thesauri", "DECLARATIVE-EDITABLE-THESAURI", 1, 0, false);
        declareFunction("editable_thesauri", "EDITABLE-THESAURI", 1, 1, false);
        declareFunction("declarative_browsable_thesauri", "DECLARATIVE-BROWSABLE-THESAURI", 1, 0, false);
        declareFunction("browsable_thesauri", "BROWSABLE-THESAURI", 1, 1, false);
        declareFunction("browsable_thesaurusP", "BROWSABLE-THESAURUS?", 1, 0, false);
        declareFunction("editable_thesaurusP", "EDITABLE-THESAURUS?", 1, 0, false);
        declareFunction("tm_applicationP", "TM-APPLICATION?", 1, 0, false);
        declareFunction("all_apps", "ALL-APPS", 0, 0, false);
        declareFunction("all_active_apps", "ALL-ACTIVE-APPS", 0, 0, false);
        declareFunction("all_inactive_apps", "ALL-INACTIVE-APPS", 0, 0, false);
        declareFunction("application_name", "APPLICATION-NAME", 1, 0, false);
        declareFunction("tm_app_constant_from_app_name", "TM-APP-CONSTANT-FROM-APP-NAME", 1, 0, false);
        declareFunction("make_app_constant_name", "MAKE-APP-CONSTANT-NAME", 1, 0, false);
        declareFunction("tm_recognized_appP", "TM-RECOGNIZED-APP?", 1, 0, false);
        declareFunction("do_add_user", "DO-ADD-USER", 2, 3, false);
        declareFunction("tm_bootstrap_administrator", "TM-BOOTSTRAP-ADMINISTRATOR", 2, 0, false);
        declareFunction("do_inactivate_user", "DO-INACTIVATE-USER", 1, 0, false);
        declareFunction("do_reactivate_user", "DO-REACTIVATE-USER", 1, 0, false);
        declareFunction("do_delete_user", "DO-DELETE-USER", 1, 0, false);
        declareFunction("do_add_password", "DO-ADD-PASSWORD", 2, 0, false);
        declareFunction("do_add_app", "DO-ADD-APP", 1, 2, false);
        declareFunction("do_inactivate_app", "DO-INACTIVATE-APP", 1, 0, false);
        declareFunction("do_reactivate_app", "DO-REACTIVATE-APP", 1, 0, false);
        declareFunction("do_delete_app", "DO-DELETE-APP", 1, 0, false);
        declareFunction("do_reactivate_entity", "DO-REACTIVATE-ENTITY", 1, 0, false);
        declareFunction("do_delete_entity", "DO-DELETE-ENTITY", 1, 0, false);
        declareFunction("do_inactivate_entity", "DO-INACTIVATE-ENTITY", 1, 0, false);
        declareFunction("tm_preference_key_to_string", "TM-PREFERENCE-KEY-TO-STRING", 1, 0, false);
        declareFunction("tm_user_preferences_file", "TM-USER-PREFERENCES-FILE", 1, 0, false);
        declareFunction("tm_save_preferences_from_vector", "TM-SAVE-PREFERENCES-FROM-VECTOR", 1, 0, false);
        declareFunction("tm_init_preferences_from_file", "TM-INIT-PREFERENCES-FROM-FILE", 1, 0, false);
        declareFunction("tm_set_thesauri_if_necessary", "TM-SET-THESAURI-IF-NECESSARY", 1, 0, false);
        declareFunction("comma_separate", "COMMA-SEPARATE", 1, 0, false);
        declareFunction("load_thesaurus_init_file", "LOAD-THESAURUS-INIT-FILE", 0, 1, false);
        declareFunction("tm_run_thesaurus_initializations", "TM-RUN-THESAURUS-INITIALIZATIONS", 0, 1, false);
        declareFunction("tm_load_master_transcript", "TM-LOAD-MASTER-TRANSCRIPT", 0, 0, false);
        declareFunction("tm_show_read_transcript_read_status", "TM-SHOW-READ-TRANSCRIPT-READ-STATUS", 0, 0, false);
        declareFunction("tm_read_transcript_length", "TM-READ-TRANSCRIPT-LENGTH", 0, 0, false);
        declareFunction("tm_wait_until_read_transcript_read", "TM-WAIT-UNTIL-READ-TRANSCRIPT-READ", 0, 0, false);
        declareFunction("editing_allowedP", "EDITING-ALLOWED?", 0, 0, false);
        declareFunction("tm_single_quote", "TM-SINGLE-QUOTE", 1, 0, false);
        declareFunction("narrower_signs", "NARROWER-SIGNS", 1, 0, false);
        declareFunction("all_narrower_signs", "ALL-NARROWER-SIGNS", 1, 0, false);
        declareFunction("gather_signs_mapper", "GATHER-SIGNS-MAPPER", 1, 0, false);
        declareFunction("extract_signs_matching", "EXTRACT-SIGNS-MATCHING", 3, 0, false);
        declareFunction("relation_available_in_thesauri", "RELATION-AVAILABLE-IN-THESAURI", 1, 0, false);
        declareFunction("relations_available_in_thesaurus", "RELATIONS-AVAILABLE-IN-THESAURUS", 1, 0, false);
        declareFunction("restricted_relations", "RESTRICTED-RELATIONS", 1, 0, false);
        declareFunction("unrestricted_relations", "UNRESTRICTED-RELATIONS", 1, 0, false);
        declareFunction("restrictedP", "RESTRICTED?", 1, 0, false);
        declareFunction("relation_restricted_in_thesaurusP", "RELATION-RESTRICTED-IN-THESAURUS?", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_tm_internals_file() {
        defparameter("*TM-SORTING-THESAURUS*", NIL);
        defparameter("*TM-COUNT-CONCEPTS-TABLE*", NIL);
        deflexical("*CACHED-TM-BOOKKEEPING-PREDICATE?-CACHING-STATE*", NIL);
        defconstant("*TM-FILTER-DO-NOT-OUTPUT*", $DO_NOT_OUTPUT);
        defconstant("*TM-FILTER-OUTPUT-AS-IS*", $OUTPUT_AS_IS);
        defconstant("*TM-FILTER-DEFAULT*", $DEFAULT);
        defconstant("*TM-DEFAULT-NUM-FILTERS*", TWENTY_INTEGER);
        defconstant("*TM-MINIMUM-NUM-ENTRIES-PER-FILTER*", $int$100);
        defvar("*TM-FILTER-MAPS*", make_hash_table($tm_default_num_filters$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
        defparameter("*TM-FILTER-MAPS-LOCK*", make_lock($$$Lock_for_Filter_Maps));
        defvar("*TM-RELATION-NAME-CHANGE-LIST*", NIL);
        defvar("*TM-RELATION-NAME-CHANGE-OPS?*", NIL);
        defparameter("*TM-USE-DEFAULT-CASE-FOR-STRINGS*", T);
        defparameter("*TM-SUBWORD-DELIMITERS*", $list_alt155);
        defconstant("*TM-DEFAULT-CASE-AS-IS*", $AS_IS);
        defconstant("*TM-DEFAULT-CASE-ALL-UPPER*", $ALL_CAPS);
        defconstant("*TM-DEFAULT-CASE-ALL-LOWER*", $ALL_LOWER);
        defconstant("*TM-DEFAULT-CASE-CAP-SUBWORDS*", $CAP_SUBWORDS);
        defconstant("*TM-DEFAULT-CASE-CAP-FIRST-SUBWORD*", $CAP_FIRST_SUBWORD);
        defvar("*TM-RELATIONS-NOT-TO-CANONICALIZE-GAF-STRINGS-OF*", NIL);
        defconstant("*TM-USE-INTEGRITY-MODULE*", $TM_USE_INTEGRITY_MODULE);
        defconstant("*TM-DO-NOT-USE-INTEGRITY-MODULE*", $TM_DO_NOT_USE_INTEGRITY_MODULE);
        defparameter("*TM-ALPHA-BEFORE*", FIVE_INTEGER);
        defparameter("*TM-ALPHA-AFTER*", FIFTEEN_INTEGER);
        defparameter("*TM-ALPHA-TOTAL-COUNT*", add($tm_alpha_before$.getDynamicValue(), $tm_alpha_after$.getDynamicValue()));
        defconstant("*TM-OPERATION-ARG-TYPE-STRING*", $STRING);
        defconstant("*TM-MAYBE-USE-CASE-DEFAULTS*", $list_alt266);
        defparameter("*OPERATION-ARG-LIST-TO-PREDICATE-ARG-LIST-MAP*", listS($list_alt268, list($CREATE, $tm_operation_arg_type_string$.getGlobalValue()), $list_alt270));
        defparameter("*RELATION-CHECKER-ALIST*", $list_alt334);
        defparameter("*CONCEPTS-SEEN*", NIL);
        defparameter("*TM-FI-COMMANDS*", NIL);
        defparameter("*TM-PREFERENCE-KEYS*", $list_alt440);
        defparameter("*TM-GATHER-SIGN-ASPECT*", NIL);
        defparameter("*TM-GATHER-SIGN-VALUE*", NIL);
        defparameter("*TM-GATHER-SIGNS*", NIL);
        return NIL;
    }

    public static final SubLObject setup_tm_internals_file() {
                memoization_state.note_globally_cached_function($sym63$CACHED_TM_BOOKKEEPING_PREDICATE_);
        utilities_macros.register_cyc_api_function(TM_API_DELETE_THESAURUS, $list_alt208, $str_alt209$Deletes_the_thesaurus_having_the_, $list_alt210, $list_alt211);
        utilities_macros.register_cyc_api_function(TM_API_DELETE_THESAURUS_WITH_SAVE_AND_LOG, $list_alt219, $str_alt220$For_use_in_an_API_thread_that_for, $list_alt221, $list_alt211);
        return NIL;
    }

    // // Internal Constants
    public static final SubLObject $$ThesaurusGeneratedTerm = constant_handles.reader_make_constant_shell(makeString("ThesaurusGeneratedTerm"));



    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    public static final SubLObject $$preferredTerm = constant_handles.reader_make_constant_shell(makeString("preferredTerm"));







    static private final SubLSymbol $sym7$RELEASED_THESAURUS_ = makeSymbol("RELEASED-THESAURUS?");

    static private final SubLSymbol $sym8$TERM__ = makeSymbol("TERM-<");

    static private final SubLSymbol $sym9$THESAURUS_ = makeSymbol("THESAURUS?");

    static private final SubLString $$$all = makeString("all");

    private static final SubLSymbol INVALID_THESAURUS_NAME_CHAR = makeSymbol("INVALID-THESAURUS-NAME-CHAR");

    static private final SubLString $str_alt12$____ = makeString("-_? ");

    public static final SubLObject $$thesaurusLoadDate = constant_handles.reader_make_constant_shell(makeString("thesaurusLoadDate"));

    public static final SubLObject $$thesaurusLoadedBy = constant_handles.reader_make_constant_shell(makeString("thesaurusLoadedBy"));





    public static final SubLObject $$SymmetricBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("SymmetricBinaryPredicate"));

    public static final SubLObject $$tmInverseSymbol = constant_handles.reader_make_constant_shell(makeString("tmInverseSymbol"));

    public static final SubLObject $$tmSymbol = constant_handles.reader_make_constant_shell(makeString("tmSymbol"));

    public static final SubLObject $$useFor = constant_handles.reader_make_constant_shell(makeString("useFor"));



    private static final SubLSymbol USE_FORS = makeSymbol("USE-FORS");

    static private final SubLString $str_alt23$Could_not_coerce__A_to_a_FORT_ = makeString("Could not coerce ~A to a FORT.");

    private static final SubLSymbol $SELECTED_THESAURUS = makeKeyword("SELECTED-THESAURUS");

    private static final SubLSymbol $THESAURI = makeKeyword("THESAURI");



    static private final SubLString $str_alt27$ = makeString("");

    static private final SubLString $str_alt28$ERROR___a_Not_a_term_in_the_activ = makeString("ERROR: ~a Not a term in the active thesauri");

    static private final SubLString $str_alt29$_a = makeString("~a");





    private static final SubLSymbol $DISPLAY_CASE = makeKeyword("DISPLAY-CASE");

    static private final SubLString $str_alt33$Can_t_handle__A = makeString("Can't handle ~A");

    public static final SubLObject $$broaderTerm = constant_handles.reader_make_constant_shell(makeString("broaderTerm"));

    public static final SubLObject $$Microtheory = constant_handles.reader_make_constant_shell(makeString("Microtheory"));

    static private final SubLString $$$UF = makeString("UF");

    public static final SubLObject $$scopeNote = constant_handles.reader_make_constant_shell(makeString("scopeNote"));

    static private final SubLString $$$SN = makeString("SN");

    public static final SubLObject $$relatedTerm = constant_handles.reader_make_constant_shell(makeString("relatedTerm"));

    static private final SubLString $$$RT = makeString("RT");

    public static final SubLObject $$ThesaurusBookkeepingPredicate = constant_handles.reader_make_constant_shell(makeString("ThesaurusBookkeepingPredicate"));

    private static final SubLSymbol TM_COUNT_CONCEPTS_INTERNAL = makeSymbol("TM-COUNT-CONCEPTS-INTERNAL");





    private static final SubLSymbol TM_USER_ASSERTION_COUNT_INTERNAL = makeSymbol("TM-USER-ASSERTION-COUNT-INTERNAL");



    public static final SubLObject $$TransitiveBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("TransitiveBinaryPredicate"));

    static private final SubLList $list_alt48 = list(ONE_INTEGER);

    static private final SubLSymbol $sym49$TM_PRED_SYMBOL__ = makeSymbol("TM-PRED-SYMBOL-<");

    private static final SubLSymbol $UTILITY_TABLE_1 = makeKeyword("UTILITY-TABLE-1");

    public static final SubLObject $$Thing = constant_handles.reader_make_constant_shell(makeString("Thing"));

    public static final SubLObject $$CycLReifiableDenotationalTerm = constant_handles.reader_make_constant_shell(makeString("CycLReifiableDenotationalTerm"));



    public static final SubLObject $$CharacterString = constant_handles.reader_make_constant_shell(makeString("CharacterString"));

    public static final SubLObject $$SubLString = constant_handles.reader_make_constant_shell(makeString("SubLString"));

    public static final SubLObject $$ProperNameString = constant_handles.reader_make_constant_shell(makeString("ProperNameString"));



    public static final SubLObject $$SubLList = constant_handles.reader_make_constant_shell(makeString("SubLList"));



    public static final SubLObject $$List = constant_handles.reader_make_constant_shell(makeString("List"));



    public static final SubLObject $$ThesaurusContentPredicate = constant_handles.reader_make_constant_shell(makeString("ThesaurusContentPredicate"));

    static private final SubLSymbol $sym63$CACHED_TM_BOOKKEEPING_PREDICATE_ = makeSymbol("CACHED-TM-BOOKKEEPING-PREDICATE?");

    static private final SubLSymbol $sym64$_CACHED_TM_BOOKKEEPING_PREDICATE__CACHING_STATE_ = makeSymbol("*CACHED-TM-BOOKKEEPING-PREDICATE?-CACHING-STATE*");



    public static final SubLSymbol $kw66$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    public static final SubLObject $$singleEntryFormatInArgs = constant_handles.reader_make_constant_shell(makeString("singleEntryFormatInArgs"));

    private static final SubLSymbol $ONE_TO_ONE = makeKeyword("ONE-TO-ONE");

    private static final SubLSymbol $ONE_TO_MANY = makeKeyword("ONE-TO-MANY");

    private static final SubLSymbol $MANY_TO_ONE = makeKeyword("MANY-TO-ONE");

    private static final SubLSymbol $MANY_TO_MANY = makeKeyword("MANY-TO-MANY");

    public static final SubLObject $$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));

    public static final SubLObject $$genlInverse = constant_handles.reader_make_constant_shell(makeString("genlInverse"));

    static private final SubLList $list_alt74 = list(CHAR_newline, CHAR_return);

    public static final SubLObject $$comment = constant_handles.reader_make_constant_shell(makeString("comment"));

    static private final SubLString $str_alt76$The_third_argument_to_remove_vari = makeString("The third argument to remove-variable-length-matches must be a list.");

    static private final SubLString $str_alt77$The_second_argument_to_remove_var = makeString("The second argument to remove-variable-length-matches must be a string.");

    static private final SubLString $str_alt78$The_third_argument_to_remove_vari = makeString("The third argument to remove-variable-length-matches must be a character.");

    static private final SubLString $str_alt79$No_thesaurus_relation_found_for_r = makeString("No thesaurus relation found for relation ~A.");







    private static final SubLSymbol $PT = makeKeyword("PT");

    private static final SubLSymbol $NON_PT = makeKeyword("NON-PT");

    static private final SubLList $list_alt85 = list($MANY, $MANY);

    static private final SubLList $list_alt86 = list($MANY, makeKeyword("ONE"));

    static private final SubLList $list_alt87 = list(makeKeyword("ONE"), $MANY);

    static private final SubLList $list_alt88 = list(makeKeyword("ONE"), makeKeyword("ONE"));

    static private final SubLString $str_alt89$__Illegal_Argument_Combination__N = makeString("~%Illegal Argument Combination. Neither arg1-type and arg2-type had value :pt~%");

    static private final SubLString $str_alt90$__Symmetric__was_true_but_arg_typ = makeString("~%Symmetric? was true but arg types were not the same.~%");

    private static final SubLSymbol $DO_NOT_OUTPUT = makeKeyword("DO-NOT-OUTPUT");

    private static final SubLSymbol $OUTPUT_AS_IS = makeKeyword("OUTPUT-AS-IS");



    static private final SubLString $$$Lock_for_Filter_Maps = makeString("Lock for Filter Maps");

    public static final SubLObject $$TMOutputFilter = constant_handles.reader_make_constant_shell(makeString("TMOutputFilter"));

    static private final SubLString $str_alt96$_A_is_not_of_type_tm_filter__or_t = makeString("~A is not of type tm-filter? or tm-filter-info?");

    static private final SubLSymbol $sym97$TM_FILTER_INFO_ = makeSymbol("TM-FILTER-INFO?");



    static private final SubLList $list_alt99 = list(makeKeyword("ADVANCED"), makeKeyword("BASIC"), NIL);

    static private final SubLString $str_alt100$_A_is_not_a_recognized_mode = makeString("~A is not a recognized mode");

    static private final SubLList $list_alt101 = list(NIL, T);

    static private final SubLString $str_alt102$_A_is_not_a_valid_choice_for_the_ = makeString("~A is not a valid choice for the editing switch.");



    static private final SubLList $list_alt104 = list(NIL, makeKeyword("OUTPUT"), makeKeyword("DISPLAY"));

    static private final SubLString $str_alt105$_A_is_not_a_valid_type_of_filter_ = makeString("~A is not a valid type of filter.");



    private static final SubLSymbol $ADVANCED = makeKeyword("ADVANCED");

    private static final SubLSymbol $BASIC = makeKeyword("BASIC");

    private static final SubLSymbol $FILTER_IN_BASIC = makeKeyword("FILTER-IN-BASIC");







    public static final SubLSymbol $kw113$USE_FILTER_ = makeKeyword("USE-FILTER?");

    static private final SubLSymbol $sym114$TM_FILTER_ = makeSymbol("TM-FILTER?");

    private static final SubLSymbol TM_SAME_RELATION_NAME = makeSymbol("TM-SAME-RELATION-NAME");

    private static final SubLSymbol TM_SAME_PRINT_NAME = makeSymbol("TM-SAME-PRINT-NAME");

    private static final SubLSymbol TM_COLLECT_RELATION_KEYS_FROM_FILTER = makeSymbol("TM-COLLECT-RELATION-KEYS-FROM-FILTER");

    private static final SubLSymbol $NOT_A_THESAURUS_RELATION = makeKeyword("NOT-A-THESAURUS-RELATION");

    private static final SubLSymbol $FILTER_MAP_VALUE = makeKeyword("FILTER-MAP-VALUE");



    private static final SubLSymbol $FILTERED = makeKeyword("FILTERED");



    public static final SubLObject $$tmRelationMapping = constant_handles.reader_make_constant_shell(makeString("tmRelationMapping"));

    static private final SubLList $list_alt124 = list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER);

    public static final SubLObject $$tmRelationPrintNameMapping = constant_handles.reader_make_constant_shell(makeString("tmRelationPrintNameMapping"));

    public static final SubLObject $$tmOutputSameRelation = constant_handles.reader_make_constant_shell(makeString("tmOutputSameRelation"));

    static private final SubLList $list_alt127 = list(ONE_INTEGER, TWO_INTEGER);

    public static final SubLObject $$tmDontOutputRelation = constant_handles.reader_make_constant_shell(makeString("tmDontOutputRelation"));



    static private final SubLString $str_alt130$Unrecognized_output_symbol__s_for = makeString("Unrecognized output symbol ~s for filtering.");





    private static final SubLSymbol TM_MAKE_OPS_TO_EDIT_FILTERS_FOR_RELATION_EDIT = makeSymbol("TM-MAKE-OPS-TO-EDIT-FILTERS-FOR-RELATION-EDIT");

    static private final SubLString $str_alt134$Unrecognized_relation__a = makeString("Unrecognized relation ~a");

    private static final SubLSymbol TM_UNASSERT = makeSymbol("TM-UNASSERT");



    static private final SubLList $list_alt137 = list(makeSymbol("*TM-MT*"));

    private static final SubLSymbol TM_ASSERT = makeSymbol("TM-ASSERT");

    public static final SubLObject $$tmDefaultDisplayFilter = constant_handles.reader_make_constant_shell(makeString("tmDefaultDisplayFilter"));

    public static final SubLObject $$tmDefaultOutputFilter = constant_handles.reader_make_constant_shell(makeString("tmDefaultOutputFilter"));

    static private final SubLList $list_alt141 = list(T, NIL, makeKeyword("CHECK-DYNAMICALLY"));

    public static final SubLSymbol $kw142$USE_FILTER_MAP_ = makeKeyword("USE-FILTER-MAP?");

    static private final SubLList $list_alt143 = list(T, NIL);

    private static final SubLSymbol $FILTER_TYPE = makeKeyword("FILTER-TYPE");

    static private final SubLList $list_alt145 = list(makeKeyword("DISPLAY"), makeKeyword("OUTPUT"), NIL);

    private static final SubLSymbol $CHECK_DYNAMICALLY = makeKeyword("CHECK-DYNAMICALLY");

    static private final SubLSymbol $sym147$TM_FILTER_INFO_FIELD_ = makeSymbol("TM-FILTER-INFO-FIELD?");

    static private final SubLList $list_alt148 = list(makeKeyword("FILTER"), makeKeyword("FILTER-MAP-VALUE"), makeKeyword("USE-FILTER?"), makeKeyword("USE-FILTER-MAP?"), makeKeyword("FILTER-TYPE"));



    static private final SubLString $str_alt150$List_is_not_of_right_length_for_a = makeString("List is not of right length for a filter-info-list.");



    static private final SubLString $str_alt152$_a_is_not_of_the_right_type_for__ = makeString("~a is not of the right type for ~a field of filter-info-list.");

    static private final SubLString $str_alt153$Unrecognized_Field__a_for_filter_ = makeString("Unrecognized Field ~a for filter-info-list.");

    public static final SubLObject $$ThesaurusPredicate = constant_handles.reader_make_constant_shell(makeString("ThesaurusPredicate"));

    static private final SubLList $list_alt155 = list(CHAR_space);

    private static final SubLSymbol $AS_IS = makeKeyword("AS-IS");

    private static final SubLSymbol $ALL_CAPS = makeKeyword("ALL-CAPS");

    private static final SubLSymbol $ALL_LOWER = makeKeyword("ALL-LOWER");

    private static final SubLSymbol $CAP_SUBWORDS = makeKeyword("CAP-SUBWORDS");

    private static final SubLSymbol $CAP_FIRST_SUBWORD = makeKeyword("CAP-FIRST-SUBWORD");

    static private final SubLSymbol $sym161$TM_CASE_STYLE_SPECIFIER_ = makeSymbol("TM-CASE-STYLE-SPECIFIER?");

    public static final SubLObject $$TM_String_Style_As_Is = constant_handles.reader_make_constant_shell(makeString("TM-String-Style-As-Is"));

    public static final SubLObject $$TM_String_Style_All_Uppercase = constant_handles.reader_make_constant_shell(makeString("TM-String-Style-All-Uppercase"));

    public static final SubLObject $$TM_String_Style_All_Lowercase = constant_handles.reader_make_constant_shell(makeString("TM-String-Style-All-Lowercase"));

    public static final SubLObject $const165$TM_String_Style_Capitalize_Subwor = constant_handles.reader_make_constant_shell(makeString("TM-String-Style-Capitalize-Subwords"));

    public static final SubLObject $const166$TM_String_Style_Capitalize_First_ = constant_handles.reader_make_constant_shell(makeString("TM-String-Style-Capitalize-First-Subword"));

    static private final SubLSymbol $sym167$MT_ = makeSymbol("MT?");

    public static final SubLObject $$tmDefaultCaseOfThesaurus = constant_handles.reader_make_constant_shell(makeString("tmDefaultCaseOfThesaurus"));

    static private final SubLString $str_alt169$Expected_a_predicate__but_got__a = makeString("Expected a predicate, but got ~a");

    static private final SubLSymbol $sym170$TM_SUBWORD_DELIMITER_ = makeSymbol("TM-SUBWORD-DELIMITER?");

    private static final SubLSymbol $TM_USE_INTEGRITY_MODULE = makeKeyword("TM-USE-INTEGRITY-MODULE");

    private static final SubLSymbol $TM_DO_NOT_USE_INTEGRITY_MODULE = makeKeyword("TM-DO-NOT-USE-INTEGRITY-MODULE");

    static private final SubLSymbol $sym173$TMI_MODULE_ = makeSymbol("TMI-MODULE?");

    public static final SubLObject $$tmUseIntegrityModuleForThesaurus = constant_handles.reader_make_constant_shell(makeString("tmUseIntegrityModuleForThesaurus"));



    static private final SubLSymbol $sym176$TM_INTEGRITY_MODULE_VALID_USE_VALUE_ = makeSymbol("TM-INTEGRITY-MODULE-VALID-USE-VALUE?");

    public static final SubLObject $$not = constant_handles.reader_make_constant_shell(makeString("not"));

    private static final SubLSymbol SIGN_CONCEPT = makeSymbol("SIGN-CONCEPT");

    private static final SubLSymbol $INTERFACE = makeKeyword("INTERFACE");



    private static final SubLSymbol $SEARCH_RELATIONS = makeKeyword("SEARCH-RELATIONS");

    static private final SubLList $list_alt182 = list(constant_handles.reader_make_constant_shell(makeString("preferredTerm")));

    static private final SubLList $list_alt183 = list(makeKeyword("ACRONYMS"));

    private static final SubLSymbol BROWSABLE_THESAURUS_CONCEPT_P = makeSymbol("BROWSABLE-THESAURUS-CONCEPT-P");

    static private final SubLString $str_alt185$_aThesaurusMt = makeString("~aThesaurusMt");

    static private final SubLString $str_alt186$_ = makeString(" ");

    static private final SubLString $str_alt187$_A__A = makeString("~A-~A");

    private static final SubLSymbol $CREATE_THESAURUS = makeKeyword("CREATE-THESAURUS");



    private static final SubLSymbol $ABBREV = makeKeyword("ABBREV");

    static private final SubLString $str_alt191$Create_Thesaurus__a___a_ = makeString("Create Thesaurus ~a (~a)");



    static private final SubLList $list_alt193 = list(makeKeyword("ADMIN"));

    static private final SubLString $str_alt194$Invalid_constant_name__A_derived_ = makeString("Invalid constant name ~A derived from ~A");

    static private final SubLString $$$OutputFilter = makeString("OutputFilter");

    static private final SubLString $str_alt196$__a = makeString("-~a");

    private static final SubLSymbol $CREATE_OUTPUT_FILTER = makeKeyword("CREATE-OUTPUT-FILTER");

    static private final SubLString $str_alt198$Create_Output_Filter__a = makeString("Create Output Filter ~a");

    static private final SubLString $str_alt199$Invalid_output_filter_name__A_der = makeString("Invalid output filter name ~A derived from ~A");

    static private final SubLString $str_alt200$Can_t_kill_terms_without_a_known_ = makeString("Can't kill terms without a known thesaurus cyclist.");

    public static final SubLObject $$topInThesaurus = constant_handles.reader_make_constant_shell(makeString("topInThesaurus"));

    static private final SubLString $str_alt202$_A_is_not_the_name_of_a_known_the = makeString("~A is not the name of a known thesaurus.");

    static private final SubLString $str_alt203$Delete_thesaurus__a = makeString("Delete thesaurus ~a");

    static private final SubLString $str_alt204$Deletion_of_thesaurus_ = makeString("Deletion of thesaurus ");

    static private final SubLString $str_alt205$_is_not_permitted_at_this_time__b = makeString(" is not permitted at this time, because it is currently involved in another operation.  Please try again later.");

    static private final SubLString $$$Success = makeString("Success");

    private static final SubLSymbol TM_API_DELETE_THESAURUS = makeSymbol("TM-API-DELETE-THESAURUS");

    static private final SubLList $list_alt208 = list(makeSymbol("THESAURUS-NAME"));

    static private final SubLString $str_alt209$Deletes_the_thesaurus_having_the_ = makeString("Deletes the thesaurus having the name string THESAURUS-NAME. \n   This function is intended to be called via the Cyc API port.");

    static private final SubLList $list_alt210 = list(list(makeSymbol("THESAURUS-NAME"), makeSymbol("STRINGP")));

    static private final SubLList $list_alt211 = list(makeSymbol("STRINGP"));

    static private final SubLString $str_alt212$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt213$__Deleting__A____ = makeString("~%Deleting ~A ...");

    static private final SubLString $str_alt214$__Finished_deleting__A_ = makeString("~%Finished deleting ~A.");

    static private final SubLString $str_alt215$__Saving_a_world_to__A____ = makeString("~%Saving a world to ~A ...");

    static private final SubLString $str_alt216$__Finished_saving_a_world_to__A_ = makeString("~%Finished saving a world to ~A.");

    static private final SubLString $str_alt217$World_is_saved_in__S = makeString("World is saved in ~S");

    private static final SubLSymbol TM_API_DELETE_THESAURUS_WITH_SAVE_AND_LOG = makeSymbol("TM-API-DELETE-THESAURUS-WITH-SAVE-AND-LOG");

    static private final SubLList $list_alt219 = list(makeSymbol("THESAURUS-NAME"), makeSymbol("WORLD-PATHNAME"), makeSymbol("LOG-PATHNAME"));

    static private final SubLString $str_alt220$For_use_in_an_API_thread_that_for = makeString("For use in an API thread that forks.  Deletes the thesaurus named THESAURUS-NAME and saves a world in WORLD-PATHNAME, redirecting all output to LOG-PATHNAME.");

    static private final SubLList $list_alt221 = list(list(makeSymbol("THESAURUS-NAME"), makeSymbol("STRINGP")), list(makeSymbol("WORLD-PATHNAME"), makeSymbol("STRINGP")), list(makeSymbol("LOG-PATHNAME"), makeSymbol("STRINGP")));

    private static final SubLSymbol $DEFINE_RELATION_STATE = makeKeyword("DEFINE-RELATION-STATE");

    static private final SubLList $list_alt223 = list(makeString("The page was stale."));

    private static final SubLSymbol $RELATION_NAME = makeKeyword("RELATION-NAME");

    static private final SubLString $$$tm = makeString("tm");

    static private final SubLString $str_alt226$_ = makeString("-");

    private static final SubLSymbol $NOT_CREATED = makeKeyword("NOT-CREATED");

    private static final SubLSymbol $NO_TEMPLATE = makeKeyword("NO-TEMPLATE");

    private static final SubLSymbol $INVERSE_NAME = makeKeyword("INVERSE-NAME");

    private static final SubLSymbol $RELATION_TYPE = makeKeyword("RELATION-TYPE");



    private static final SubLSymbol $ARG1_TYPE = makeKeyword("ARG1-TYPE");

    private static final SubLSymbol $ARG2_TYPE = makeKeyword("ARG2-TYPE");

    private static final SubLSymbol $ARG1_FORMAT = makeKeyword("ARG1-FORMAT");

    private static final SubLSymbol $ARG2_FORMAT = makeKeyword("ARG2-FORMAT");

    public static final SubLSymbol $kw236$TRANSITIVE_ = makeKeyword("TRANSITIVE?");







    private static final SubLSymbol $CREATE_RELATION = makeKeyword("CREATE-RELATION");



    public static final SubLObject $$openEntryFormatInArgs = constant_handles.reader_make_constant_shell(makeString("openEntryFormatInArgs"));



    private static final SubLSymbol $ARG1_ISA = makeKeyword("ARG1-ISA");

    private static final SubLSymbol $ARG2_ISA = makeKeyword("ARG2-ISA");

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    static private final SubLList $list_alt247 = list(constant_handles.reader_make_constant_shell(makeString("ThesaurusDocumentationPredicate")));

    static private final SubLList $list_alt248 = list(constant_handles.reader_make_constant_shell(makeString("ThesaurusURLPredicate")));

    static private final SubLString $$$symmetric = makeString("symmetric");

    static private final SubLList $list_alt250 = list(constant_handles.reader_make_constant_shell(makeString("SymmetricBinaryPredicate")));

    static private final SubLString $$$asymmetric = makeString("asymmetric");

    static private final SubLList $list_alt252 = list(constant_handles.reader_make_constant_shell(makeString("AsymmetricBinaryPredicate")));

    static private final SubLList $list_alt253 = list(constant_handles.reader_make_constant_shell(makeString("TransitiveBinaryPredicate")));



    static private final SubLString $str_alt255$Can_t_kill_relations_without_a_kn = makeString("Can't kill relations without a known thesaurus cyclist.");



    private static final SubLSymbol PREFERRED_TERMS = makeSymbol("PREFERRED-TERMS");

    private static final SubLSymbol $GRAPH_PATHS = makeKeyword("GRAPH-PATHS");



    private static final SubLSymbol $LONGEST_PATH = makeKeyword("LONGEST-PATH");

    static private final SubLSymbol $sym261$_ = makeSymbol("<");



    public static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLSymbol FIRST_PREFERRED_TERM_OF_CAR = makeSymbol("FIRST-PREFERRED-TERM-OF-CAR");

    private static final SubLSymbol $ALPHABETICAL_SHOW_USE_FORS = makeKeyword("ALPHABETICAL-SHOW-USE-FORS");

    static private final SubLList $list_alt266 = list(makeKeyword("ADD"), makeKeyword("CREATE"), makeKeyword("DELETE"), makeKeyword("REPLACE"));

    static private final SubLString $str_alt267$Unknown_operation__a = makeString("Unknown operation ~a");

    static private final SubLList $list_alt268 = list(makeKeyword("ADD"), ONE_INTEGER, TWO_INTEGER);



    static private final SubLList $list_alt270 = list(list(makeKeyword("DELETE")), list(makeKeyword("REPLACE"), NIL, NIL, TWO_INTEGER));

    private static final SubLSymbol $NO_OPCODE = makeKeyword("NO-OPCODE");

    static private final SubLString $str_alt272$No_operation_was_specified_ = makeString("No operation was specified.");

    private static final SubLSymbol $INVALID_OPCODE = makeKeyword("INVALID-OPCODE");

    static private final SubLString $str_alt274$The_operation__A_is_unknown_ = makeString("The operation ~A is unknown.");

    private static final SubLSymbol $INVALID_THESAURUS_ABBREV = makeKeyword("INVALID-THESAURUS-ABBREV");

    static private final SubLString $str_alt276$__A__does_not_refer_to_a_known_th = makeString("\"~A\" does not refer to a known thesaurus.");

    private static final SubLSymbol $NO_THESAURUS_SPECIFIED = makeKeyword("NO-THESAURUS-SPECIFIED");

    static private final SubLString $str_alt278$No_thesauri_were_specified_ = makeString("No thesauri were specified.");

    private static final SubLSymbol $THESAURUS_UNWRITABLE = makeKeyword("THESAURUS-UNWRITABLE");

    static private final SubLString $str_alt280$Editing__A_is_currently_blocked_b = makeString("Editing ~A is currently blocked by another operation.  Try again later.");

    static private final SubLList $list_alt281 = list(makeKeyword("ADD"), makeKeyword("DELETE"), $EDIT, makeKeyword("REPLACE"));

    private static final SubLSymbol $INACTIVE_RELATION = makeKeyword("INACTIVE-RELATION");

    static private final SubLString $str_alt283$_A_is_not_an_active_relation_ = makeString("~A is not an active relation.");



    private static final SubLSymbol $INVALID_RELATION_ABBREV = makeKeyword("INVALID-RELATION-ABBREV");

    static private final SubLString $str_alt286$__A__does_not_refer_to_a_known_re = makeString("\"~A\" does not refer to a known relation.");

    private static final SubLSymbol $NO_RELATION_SPECIFIED = makeKeyword("NO-RELATION-SPECIFIED");

    static private final SubLString $str_alt288$No_relation_was_specified_ = makeString("No relation was specified.");

    private static final SubLSymbol $SPLICE_OUT = makeKeyword("SPLICE-OUT");

    private static final SubLSymbol $CONVERT_NT_UF = makeKeyword("CONVERT-NT-UF");


    private static final SubLSymbol $NON_BINARY_RELATION = makeKeyword("NON-BINARY-RELATION");

    static private final SubLString $str_alt295$The__EDIT_operation_can_only_be_p = makeString("The :EDIT operation can only be performed on binary relation.");

    private static final SubLSymbol $UNABLE_TO_EDIT = makeKeyword("UNABLE-TO-EDIT");

    static private final SubLString $str_alt297$Unable_to_EDIT__S__A__since__A_is = makeString("Unable to EDIT ~S ~A, since ~A is a relation from a non-preferred term.");

    private static final SubLSymbol $NOT_A_UF = makeKeyword("NOT-A-UF");

    static private final SubLString $str_alt299$Unable_to_EDIT__S__A__since__S_is = makeString("Unable to EDIT ~S ~A, since ~S is not a UF in ~A.");

    private static final SubLSymbol $AMBIGUOUS_UF = makeKeyword("AMBIGUOUS-UF");

    static private final SubLString $str_alt301$Unable_to_EDIT__S__A__since__S_is = makeString("Unable to EDIT ~S ~A, since ~S is a UF more than once in ~A");

    static private final SubLList $list_alt302 = list(makeSymbol("TERM"), list(makeSymbol("CONCEPT")), makeSymbol("BROADER-TERMS"));

    private static final SubLSymbol $TERM_EXISTS = makeKeyword("TERM-EXISTS");

    static private final SubLString $str_alt304$_S_is_already_a_preferred_term_ = makeString("~S is already a preferred term.");

    static private final SubLString $str_alt305$_S_is_already_a_use_for_ = makeString("~S is already a use-for.");

    static private final SubLSymbol $sym306$TM_STOPLIST_WORD_ = makeSymbol("TM-STOPLIST-WORD?");

    private static final SubLSymbol $STOPLIST_WORD = makeKeyword("STOPLIST-WORD");

    static private final SubLString $str_alt308$_S_is_made_only_of_stoplist_words = makeString("~S is made only of stoplist words.");

    static private final SubLList $list_alt309 = list(constant_handles.reader_make_constant_shell(makeString("preferredTerm")), constant_handles.reader_make_constant_shell(makeString("useFor")));

    private static final SubLSymbol $MULTIPLE_LEXPRED = makeKeyword("MULTIPLE-LEXPRED");

    static private final SubLString $str_alt311$_S_has_multiple_preferred_term_st = makeString("~S has multiple preferred term statements in ~A. Integrity check this term to fix.");

    static private final SubLList $list_alt312 = list(TWO_INTEGER, ONE_INTEGER, ONE_INTEGER);

    static private final SubLList $list_alt313 = list(ONE_INTEGER, TWO_INTEGER, TWO_INTEGER);

    private static final SubLSymbol $IMPLEMENTATION_ERROR = makeKeyword("IMPLEMENTATION-ERROR");

    static private final SubLString $str_alt315$Implementation_error__The_relatio = makeString("Implementation error: The relation ~a is not binary.");

    private static final SubLSymbol $BAD_ARGLIST = makeKeyword("BAD-ARGLIST");

    static private final SubLString $str_alt317$Replace_requires_3_arguements__te = makeString("Replace requires 3 arguements (term, old, new), but a different number were given: ~a");

    static private final SubLString $str_alt318$_S_has_multiple_preferred_term_st = makeString("~S has multiple preferred term statements in ~A.  Integrity check this term to fix.");

    static private final SubLString $str_alt319$__A__UF___A__in__A_ = makeString("'~A' UF '~A' in ~A.");

    static private final SubLString $str_alt320$Can_t_disambiguate__S__since_it_s = makeString("Can't disambiguate ~S, since it's a UF for more than one preferred term in ~A");

    private static final SubLSymbol $INVALID_TERM = makeKeyword("INVALID-TERM");

    static private final SubLString $str_alt322$_S_is_not_a_term_in_the_thesaurus = makeString("~S is not a term in the thesaurus ~a.");

    private static final SubLSymbol $UNKNOWN_ARGUMENT = makeKeyword("UNKNOWN-ARGUMENT");

    static private final SubLString $str_alt324$Could_not_parse_the_argument__A_ = makeString("Could not parse the argument ~A.");

    private static final SubLSymbol $NOT_PT = makeKeyword("NOT-PT");

    static private final SubLString $str_alt326$_S_is_not_a_preferred_term_in__A = makeString("~S is not a preferred term in ~A");

    static private final SubLString $str_alt327$_S_is_also_a_UF_for_another_term_ = makeString("~S is also a UF for another term, so it can't become a PT in ~A");

    private static final SubLSymbol $NOT_UF = makeKeyword("NOT-UF");

    static private final SubLString $str_alt329$_S_is_not_a_UF_for___A__in__A = makeString("~S is not a UF for `~A' in ~A");

    static private final SubLString $str_alt330$The_relation__A_requires__D_argum = makeString("The relation ~A requires ~D arguments, but only ~D were given.");

    static private final SubLString $str_alt331$_S_has_multple_preferred_term_sta = makeString("~S has multple preferred term statements in ~A.  Integrity check this term to fix.");

    static private final SubLString $str_alt332$Can_t_disambiguate__S__because_it = makeString("Can't disambiguate ~S, because it's a UF for more than one preferred term in ~A.");

    static private final SubLString $str_alt333$_S_is_not_a_term_in_the_thesaurus = makeString("~S is not a term in the thesaurus.");

    static private final SubLList $list_alt334 = list(new SubLObject[]{ cons(constant_handles.reader_make_constant_shell(makeString("scopeNote")), makeSymbol("CHECK-OP-SN")), cons(constant_handles.reader_make_constant_shell(makeString("useFor")), makeSymbol("CHECK-OP-UF")), cons(constant_handles.reader_make_constant_shell(makeString("broaderTerm")), makeSymbol("CHECK-OP-BT")), cons(constant_handles.reader_make_constant_shell(makeString("relatedTerm")), makeSymbol("CHECK-OP-RT")), cons(constant_handles.reader_make_constant_shell(makeString("nameString")), makeSymbol("CHECK-OP-NAMES")), cons(constant_handles.reader_make_constant_shell(makeString("tmSymbol")), makeSymbol("CHECK-OP-NAMES")), cons(constant_handles.reader_make_constant_shell(makeString("tmInverseSymbol")), makeSymbol("CHECK-OP-NAMES")), cons(constant_handles.reader_make_constant_shell(makeString("preferredTerm")), makeSymbol("CHECK-OP-PT")), cons(constant_handles.reader_make_constant_shell(makeString("tmStoplistWord")), makeSymbol("CHECK-OP-STOPLIST")) });

    private static final SubLSymbol $BAD_VALUE = makeKeyword("BAD-VALUE");

    static private final SubLString $str_alt336$Can_t_add_the_empty_string_as_a_s = makeString("Can't add the empty string as a scope note.");

    private static final SubLSymbol $ALREADY_HAS_SCOPE_NOTE = makeKeyword("ALREADY-HAS-SCOPE-NOTE");

    static private final SubLString $str_alt338$__a__already_has_the_scope_note__ = makeString("`~a' already has the scope note ~S in ~A.");

    private static final SubLSymbol $RELATION_NOT_THERE = makeKeyword("RELATION-NOT-THERE");

    static private final SubLString $str_alt340$Can_t_delete___a__SN__S = makeString("Can't delete `~a' SN ~S");

    private static final SubLSymbol $USE_FOR_AND_PREFERRED = makeKeyword("USE-FOR-AND-PREFERRED");

    static private final SubLString $str_alt342$_S_cannot_be_both_a_use_for_and_a = makeString("~S cannot be both a use-for and a preferred term in ~A.");

    static private final SubLString $str_alt343$_S_is_already_a_stoplist_word_ = makeString("~S is already a stoplist word.");

    static private final SubLString $str_alt344$Can_t_add_the_empty_string_as_a_u = makeString("Can't add the empty string as a use-for.");



    static private final SubLString $str_alt346$_S_is_either_already_a_use_for_of = makeString("~S is either already a use-for of '~A', or differs only in case from an existing one.");

    static private final SubLString $str_alt347$_S_is_already_a_use_for_of___A_ = makeString("~S is already a use-for of '~A'");

    private static final SubLSymbol $NON_REFLEXIVE = makeKeyword("NON-REFLEXIVE");

    static private final SubLString $str_alt349$A_term_cannot_be_a_broader_term_o = makeString("A term cannot be a broader term of itself.");

    private static final SubLSymbol $NT_BT_CYCLE = makeKeyword("NT-BT-CYCLE");

    static private final SubLString $str_alt351$BT_NT_cycle_between__S_and__S_in_ = makeString("BT/NT cycle between ~S and ~S in ~A.");

    static private final SubLString $str_alt352$_S_is_a_top_term_in__A___It_will_ = makeString("~S is a top term in ~A.  It will be demoted.");

    private static final SubLSymbol $NAME_IN_USE = makeKeyword("NAME-IN-USE");

    static private final SubLString $str_alt354$The_name_or_abbreviation__S_is_al = makeString("The name or abbreviation ~S is already in use.");

    static private final SubLString $str_alt355$Can_t_replace__s_with__s___s_is_n = makeString("Can't replace ~s with ~s: ~s is not there.");

    static private final SubLSymbol $sym356$ASSERTED_ASSERTION_ = makeSymbol("ASSERTED-ASSERTION?");

    private static final SubLSymbol $RELATION_NOT_LOCAL = makeKeyword("RELATION-NOT-LOCAL");

    static private final SubLString $str_alt358$Can_t_replace__s_with__s___s_is_i = makeString("Can't replace ~s with ~s: ~s is inferred.");

    private static final SubLSymbol $ON_STOPLIST = makeKeyword("ON-STOPLIST");

    static private final SubLString $str_alt360$_S_is_a_stoplist_word_ = makeString("~S is a stoplist word.");

    static private final SubLString $str_alt361$Can_t_rename_a_term_to_the_emtpy_ = makeString("Can't rename a term to the emtpy string.");

    static private final SubLString $str_alt362$Can_t_replace__s_with__s___s_has_ = makeString("Can't replace ~s with ~s: ~s has multiple preferred term statements in ~a.  Integrity check this term to fix.");

    private static final SubLSymbol $WRONG_CONCEPT = makeKeyword("WRONG-CONCEPT");

    static private final SubLString $str_alt364$Implementation_error___s_is_a_PT_ = makeString("Implementation error: ~s is a PT of some other concept.");

    static private final SubLString $str_alt365$_S_is_a_preferred_term_in_some_th = makeString("~S is a preferred term in some thesaurus.");

    static private final SubLString $str_alt366$_S_is_a_use_for_in_some_thesaurus = makeString("~S is a use-for in some thesaurus.");

    static private final SubLList $list_alt367 = list(makeKeyword("STRING"), $LIST);

    static private final SubLString $str_alt368$The_relation__S__A__S_is_not_in__ = makeString("The relation ~S ~A ~S is not in ~A.");

    static private final SubLString $str_alt369$Expected_a_constant_for__A = makeString("Expected a constant for ~A");

    static private final SubLString $str_alt370$_A_is_not_a_lexical_predicate__bu = makeString("~A is not a lexical predicate, but has a singleEntryFormatInArgs non-string argument.");

    static private final SubLString $str_alt371$Expected_a_string_for__A = makeString("Expected a string for ~A");

    static private final SubLString $str_alt372$_A_is__A__and_we_already_know___A = makeString("~A is ~A, and we already know `~A' ~A `~A'.");

    private static final SubLSymbol $IRREFLEXIVE_VIOLATION = makeKeyword("IRREFLEXIVE-VIOLATION");

    static private final SubLString $str_alt374$Adding_relation__A_between_a_term = makeString("Adding relation ~A between a term and itself is not allowed.");

    private static final SubLSymbol $ASYMMETRIC_VIOLATION = makeKeyword("ASYMMETRIC-VIOLATION");

    static private final SubLString $str_alt376$Adding__A__A__A_is_not_allowed__s = makeString("Adding ~A ~A ~A is not allowed, since the reverse already holds.");



    private static final SubLSymbol CONVERT_ARG = makeSymbol("CONVERT-ARG");

    public static final SubLObject $$tmStoplistWord = constant_handles.reader_make_constant_shell(makeString("tmStoplistWord"));

    static private final SubLString $str_alt380$_S_is_not_a_stoplist_word_ = makeString("~S is not a stoplist word.");

    private static final SubLSymbol $NOTHING_TO_CONVERT = makeKeyword("NOTHING-TO-CONVERT");

    static private final SubLString $str_alt382$The_term___a__has_no_narrower_ter = makeString("The term `~a' has no narrower terms to convert in ~a.");

    private static final SubLSymbol $NO_DEPENDENT_NTS = makeKeyword("NO-DEPENDENT-NTS");

    static private final SubLString $str_alt384$The_term___a__has_no_dependent_na = makeString("The term `~a' has no dependent narrower terms to convert in ~a.");

    public static final SubLObject $$tmRelationRestrictedFrom = constant_handles.reader_make_constant_shell(makeString("tmRelationRestrictedFrom"));

    private static final SubLSymbol $RELATION_RESTRICTED_IN_THESAURUS = makeKeyword("RELATION-RESTRICTED-IN-THESAURUS");

    static private final SubLString $str_alt387$The_relation__a_is_restricted_fro = makeString("The relation ~a is restricted from usage in thesaurus ~a.");

    private static final SubLSymbol $WARNING = makeKeyword("WARNING");

    private static final SubLSymbol $EVALUATION_FAILED = makeKeyword("EVALUATION-FAILED");



    private static final SubLSymbol KE_ASSERT = makeSymbol("KE-ASSERT");

    private static final SubLSymbol KE_UNASSERT = makeSymbol("KE-UNASSERT");

    static private final SubLList $list_alt393 = list(constant_handles.reader_make_constant_shell(makeString("ThesaurusGeneratedTerm")));

    static private final SubLList $list_alt394 = list(makeSymbol("TERM"), makeSymbol("OLD-VALUE"), makeSymbol("NEW-VALUE"));

    static private final SubLString $str_alt395$Unknown_opcode__S_ = makeString("Unknown opcode ~S.");

    private static final SubLSymbol KILL_TERM_FI_COMMANDS_FOR_ASSERTION = makeSymbol("KILL-TERM-FI-COMMANDS-FOR-ASSERTION");

    private static final SubLSymbol $TM_NOT_BT_NOT_TOP = makeKeyword("TM-NOT-BT-NOT-TOP");



    static private final SubLList $list_alt399 = list(makeSymbol("NAME"), makeSymbol("PRED"), makeSymbol("INDEX"));

    public static final SubLObject $$tmInactiveUser = constant_handles.reader_make_constant_shell(makeString("tmInactiveUser"));

    public static final SubLObject $$ThesaurusCyclist = constant_handles.reader_make_constant_shell(makeString("ThesaurusCyclist"));

    static private final SubLSymbol $sym402$ACTIVE_ENTITY_ = makeSymbol("ACTIVE-ENTITY?");

    static private final SubLSymbol $sym403$TM_ADMINISTRATOR_ = makeSymbol("TM-ADMINISTRATOR?");

    static private final SubLSymbol $sym404$TM_FULL_EDITOR_ = makeSymbol("TM-FULL-EDITOR?");

    public static final SubLObject $$tmHttpUserID = constant_handles.reader_make_constant_shell(makeString("tmHttpUserID"));

    public static final SubLObject $$nameString = constant_handles.reader_make_constant_shell(makeString("nameString"));

    static private final SubLString $str_alt407$TMUser__A = makeString("TMUser-~A");

    public static final SubLObject $$tmUserType = constant_handles.reader_make_constant_shell(makeString("tmUserType"));

    private static final SubLSymbol $LEVEL = makeKeyword("LEVEL");

    static private final SubLString $$$administrator = makeString("administrator");

    static private final SubLString $str_alt411$full_editor = makeString("full-editor");

    public static final SubLObject $$tmPassword = constant_handles.reader_make_constant_shell(makeString("tmPassword"));



    public static final SubLObject $$tmBrowsableThesauri = constant_handles.reader_make_constant_shell(makeString("tmBrowsableThesauri"));

    static private final SubLSymbol $sym415$TM_USER_ = makeSymbol("TM-USER?");



    static private final SubLSymbol $sym417$TM_APPLICATION_ = makeSymbol("TM-APPLICATION?");

    static private final SubLString $str_alt418$Unknown_type___S = makeString("Unknown type: ~S");

    public static final SubLObject $$tmEditorFor = constant_handles.reader_make_constant_shell(makeString("tmEditorFor"));

    static private final SubLString $str_alt420$limited_editor = makeString("limited-editor");

    static private final SubLList $list_alt421 = list(makeString("full-editor"), makeString("administrator"));

    static private final SubLString $str_alt422$end_user = makeString("end-user");

    static private final SubLList $list_alt423 = list(makeString("advanced-user"), makeString("limited-editor"));

    private static final SubLSymbol $EDITABLE_THESAURI = makeKeyword("EDITABLE-THESAURI");

    public static final SubLObject $$ThesaurusApplication = constant_handles.reader_make_constant_shell(makeString("ThesaurusApplication"));

    static private final SubLString $str_alt426$TMApp__A = makeString("TMApp-~A");

    private static final SubLSymbol $INVALID_THESAURUS = makeKeyword("INVALID-THESAURUS");

    private static final SubLSymbol $CREATE_USER = makeKeyword("CREATE-USER");

    static private final SubLString $str_alt429$Register_new_user__a = makeString("Register new user ~a");

    static private final SubLList $list_alt430 = list(makeString("limited-editor"), makeString("full-editor"), makeString("administrator"));

    private static final SubLSymbol $EDITING_ENABLED = makeKeyword("EDITING-ENABLED");

    static private final SubLString $str_alt432$Not_attempting_to_create_user__A_ = makeString("Not attempting to create user ~A since *use-http-authentication* is nil.");

    private static final SubLSymbol $CREATE_APP = makeKeyword("CREATE-APP");

    static private final SubLString $str_alt434$Register_new_application__a = makeString("Register new application ~a");

    static private final SubLString $$$Application = makeString("Application");

    static private final SubLString $$$User = makeString("User");

    static private final SubLString $str_alt437$Reactivate__a__a = makeString("Reactivate ~a ~a");

    static private final SubLString $str_alt438$Delete__a__a = makeString("Delete ~a ~a");

    static private final SubLString $str_alt439$Inactivate__a__a = makeString("Inactivate ~a ~a");

    static private final SubLList $list_alt440 = list(new SubLObject[]{ makeKeyword("EDITING-ENABLED"), makeKeyword("VIEW-MULTIPLE"), makeKeyword("THESAURI"), makeKeyword("EDIT-THESAURI"), makeKeyword("DISPLAY-CASE"), makeKeyword("SEARCH-RELATIONS"), makeKeyword("SHOW-TERM-THESAURI"), makeKeyword("SHOW-DESCENDANT-PARMS"), makeKeyword("DEPTH-SPACING"), makeKeyword("PARENT-DEPTH"), makeKeyword("CHILD-DEPTH"), makeKeyword("MAX-CHILDREN"), makeKeyword("FD-SEPARATE?"), makeKeyword("SHOW-REASONS?"), makeKeyword("ALPHABETICAL-SHOW-USE-FORS"), makeKeyword("EXPAND-PARENT-PATHS"), makeKeyword("DETAILED-HIERARCHY-TERM"), makeKeyword("SEPARATE-HELP-PAGE"), makeKeyword("GRAPH-RELATION"), makeKeyword("SHOW-HD-RELATION-LINKS"), makeKeyword("BG-COLOR-DEFAULT"), makeKeyword("BG-COLOR-HIERARCHICAL"), makeKeyword("BG-COLOR-ALPHABETICAL"), makeKeyword("BG-COLOR-FULL-RECORD"), makeKeyword("INTERFACE"), makeKeyword("FILTER-IN-BASIC") });

    static private final SubLString $str_alt441$_A = makeString("~A");

    static private final SubLString $str_alt442$_TM_PREFERENCES_DIRECTORY__is_not = makeString("*TM-PREFERENCES-DIRECTORY* is not set.");

    static private final SubLString $$$prefs = makeString("prefs");

    private static final SubLSymbol $EDIT_THESAURI = makeKeyword("EDIT-THESAURI");

    static private final SubLString $str_alt445$____S__S_ = makeString("~%(~S ~S)");



    static private final SubLString $$$Mixed_Case = makeString("Mixed Case");

    static private final SubLString $$$Lowercase = makeString("Lowercase");

    static private final SubLString $$$Uppercase = makeString("Uppercase");

    static private final SubLString $str_alt450$_ALL_ = makeString("[ALL]");

    private static final SubLSymbol $PARENT_DEPTH = makeKeyword("PARENT-DEPTH");

    private static final SubLSymbol $CHILD_DEPTH = makeKeyword("CHILD-DEPTH");

    static private final SubLString $$$ALL = makeString("ALL");

    static private final SubLString $$$NONE = makeString("NONE");

    private static final SubLSymbol $GRAPH_RELATION = makeKeyword("GRAPH-RELATION");





    static private final SubLString $str_alt458$__ = makeString(", ");

    static private final SubLString $str_alt459$Thesaurus_init_file__s_not_found_ = makeString("Thesaurus init file ~s not found.");

    static private final SubLString $str_alt460$_______No_transcript_file_was_fou = makeString("~%     No transcript file was found at ~S.");

    static private final SubLString $str_alt461$_______This_is_expected_if_you_ar = makeString("~%     This is expected if you are starting a newly built world for the first time.");

    static private final SubLString $str_alt462$_______However__the_transcript_re = makeString("~%     However, the transcript read pointer is non-zero.");

    static private final SubLString $str_alt463$_______Resetting_it_to_zero_and_c = makeString("~%     Resetting it to zero and continuing.");



    static private final SubLString $str_alt465$______The_transcript_does_not_nee = makeString("~%    The transcript does not need to be run.");

    static private final SubLString $str_alt466$______Problem__The_transcript_is_ = makeString("~%    Problem: The transcript is shorter than expected, by ~A characters. ");

    static private final SubLString $str_alt467$______Resetting_the_read_pointer_ = makeString("~%    Resetting the read pointer and attempting to continue.");

    static private final SubLString $str_alt468$______Master_transcript_read_poin = makeString("~%    Master transcript read pointer is now ~A.");

    static private final SubLString $str_alt469$__Transcript___A = makeString("~%Transcript: ~A");

    static private final SubLString $str_alt470$__Length___A = makeString("~%Length: ~A");

    static private final SubLString $str_alt471$__Read_pointer___A = makeString("~%Read pointer: ~A");

    static private final SubLString $str_alt472$Waiting_for_master_transcript_to_ = makeString("Waiting for master transcript to be read");

    public static final SubLInteger $int$30 = makeInteger(30);

    static private final SubLString $str_alt474$__a_ = makeString("`~a'");

    private static final SubLSymbol ALL_NARROWER_SIGNS = makeSymbol("ALL-NARROWER-SIGNS");

    private static final SubLSymbol $LEXPRED = makeKeyword("LEXPRED");



    private static final SubLSymbol $THESAURUS = makeKeyword("THESAURUS");

    private static final SubLSymbol GATHER_SIGNS_MAPPER = makeSymbol("GATHER-SIGNS-MAPPER");

    static private final SubLSymbol $sym480$THESAURUS_PREDICATE_ = makeSymbol("THESAURUS-PREDICATE?");

    static private final SubLString $str_alt481$ERROR___a_is_not_a_valid_thesauru = makeString("ERROR: ~a is not a valid thesaurus constant");

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_tm_internals_file();
    }

    @Override
    public void initializeVariables() {
        init_tm_internals_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_tm_internals_file();
    }
}

