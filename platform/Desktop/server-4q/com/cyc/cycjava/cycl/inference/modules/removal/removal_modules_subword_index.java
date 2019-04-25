package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.cycl_string;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.lexicon_subword_index;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_subword_index extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subword_index";
    public static final String myFingerPrint = "ed3659f9cf0d48d0c3c8b5d0528a4339e1758f82f4b56e830c7314d90cf6fb61";
    private static final SubLSymbol $kw0$REMOVAL_CONJUNCTIVE_SUBWORD_INDEX;
    private static final SubLList $list1;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLObject $const4$equalStrings_CaseInsensitive;
    private static final SubLSymbol $sym5$REMOVAL_CONJUNCTIVE_SUBWORD_INDEX_APPLICABILITY;
    private static final SubLSymbol $sym6$REMOVAL_CONJUNCTIVE_SUBWORD_INDEX_COST;
    private static final SubLObject $const7$substring;
    private static final SubLSymbol $kw8$ON;
    private static final SubLSymbol $kw9$OFF;
    private static final SubLSymbol $sym10$INDEXED_TERM_P;
    private static final SubLSymbol $kw11$EVAL;
    private static final SubLSymbol $sym12$REMOVAL_CONJUNCTIVE_SUBWORD_INDEX_EXPAND;
    private static final SubLObject $const13$prefixSubstring_CaseInsensitive;
    private static final SubLSymbol $sym14$CYCL_STRING_STARTS_WITH_BY_TEST;
    private static final SubLObject $const15$suffixSubstring;
    private static final SubLSymbol $sym16$CYCL_STRING_ENDS_WITH_BY_TEST;
    private static final SubLSymbol $sym17$CYCL_SUPERSTRING_;
    private static final SubLList $list18;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subword-index.lisp", position = 1368L)
    public static SubLObject removal_conjunctive_subword_index_applicability(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject indexed_pred_dict = dictionary.new_dictionary((SubLObject)removal_modules_subword_index.UNPROVIDED, (SubLObject)removal_modules_subword_index.UNPROVIDED);
        final SubLObject substring_dict = dictionary.new_dictionary((SubLObject)removal_modules_subword_index.UNPROVIDED, (SubLObject)removal_modules_subword_index.UNPROVIDED);
        SubLObject index = (SubLObject)removal_modules_subword_index.ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent = (SubLObject)removal_modules_subword_index.NIL;
        contextualized_asent = cdolist_list_var.first();
        while (removal_modules_subword_index.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject mt = (SubLObject)removal_modules_subword_index.NIL;
            SubLObject asent = (SubLObject)removal_modules_subword_index.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_subword_index.$list2);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_subword_index.$list2);
            asent = current.first();
            current = current.rest();
            if (removal_modules_subword_index.NIL == current) {
                if (removal_modules_subword_index.NIL != el_utilities.el_binary_formula_p(asent)) {
                    thread.resetMultipleValues();
                    final SubLObject pred = el_utilities.unmake_binary_formula(asent);
                    final SubLObject arg1 = thread.secondMultipleValue();
                    final SubLObject arg2 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (removal_modules_subword_index.NIL != conses_high.member(pred, lexicon_subword_index.non_trie_subword_preds(), (SubLObject)removal_modules_subword_index.UNPROVIDED, (SubLObject)removal_modules_subword_index.UNPROVIDED)) {
                        if (removal_modules_subword_index.NIL != conses_high.member((SubLObject)removal_modules_subword_index.TWO_INTEGER, lexicon_subword_index.non_trie_subword_pred_args(pred), (SubLObject)removal_modules_subword_index.UNPROVIDED, (SubLObject)removal_modules_subword_index.UNPROVIDED)) {
                            dictionary_utilities.dictionary_push(indexed_pred_dict, arg2, index);
                        }
                    }
                    else if (removal_modules_subword_index.NIL != subl_promotions.memberP(pred, (SubLObject)removal_modules_subword_index.$list3, (SubLObject)removal_modules_subword_index.UNPROVIDED, (SubLObject)removal_modules_subword_index.UNPROVIDED)) {
                        if (removal_modules_subword_index.NIL != cycl_string.cycl_string_p(arg1)) {
                            dictionary_utilities.dictionary_push(substring_dict, arg2, index);
                        }
                    }
                    else if (pred.eql(removal_modules_subword_index.$const4$equalStrings_CaseInsensitive) && removal_modules_subword_index.NIL != cycl_string.cycl_string_p(arg2)) {
                        dictionary_utilities.dictionary_push(substring_dict, arg1, index);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_subword_index.$list2);
            }
            index = Numbers.add(index, (SubLObject)removal_modules_subword_index.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        SubLObject subclause_specs = (SubLObject)removal_modules_subword_index.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(substring_dict)); removal_modules_subword_index.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject substring_indices = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject indexed_pred_indices = dictionary.dictionary_lookup(indexed_pred_dict, var, (SubLObject)removal_modules_subword_index.UNPROVIDED);
            if (removal_modules_subword_index.NIL != indexed_pred_indices) {
                SubLObject cdolist_list_var2;
                final SubLObject index_sets = cdolist_list_var2 = list_utilities.cartesian_product((SubLObject)ConsesLow.list(indexed_pred_indices, substring_indices), (SubLObject)removal_modules_subword_index.UNPROVIDED, (SubLObject)removal_modules_subword_index.UNPROVIDED, (SubLObject)removal_modules_subword_index.UNPROVIDED);
                SubLObject indices = (SubLObject)removal_modules_subword_index.NIL;
                indices = cdolist_list_var2.first();
                while (removal_modules_subword_index.NIL != cdolist_list_var2) {
                    subclause_specs = (SubLObject)ConsesLow.cons(clause_utilities.new_subclause_spec((SubLObject)removal_modules_subword_index.NIL, indices), subclause_specs);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    indices = cdolist_list_var2.first();
                }
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return Sequences.nreverse(subclause_specs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subword-index.lisp", position = 2825L)
    public static SubLObject removal_conjunctive_subword_index_cost(final SubLObject contextualized_dnf_clause) {
        return (SubLObject)removal_modules_subword_index.ONE_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subword-index.lisp", position = 2965L)
    public static SubLObject removal_conjunctive_subword_index_expand(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject pred = removal_conjunctive_subword_index_destructure(contextualized_dnf_clause);
        final SubLObject substring = thread.secondMultipleValue();
        final SubLObject superstring_var = thread.thirdMultipleValue();
        final SubLObject term_var = thread.fourthMultipleValue();
        final SubLObject substring_pred = thread.fifthMultipleValue();
        final SubLObject mt = thread.sixthMultipleValue();
        final SubLObject ordering = thread.seventhMultipleValue();
        thread.resetMultipleValues();
        final SubLObject case_sensitivity = (SubLObject)((removal_modules_subword_index.NIL != genl_predicates.genl_predicateP(substring_pred, removal_modules_subword_index.$const7$substring, (SubLObject)removal_modules_subword_index.UNPROVIDED, (SubLObject)removal_modules_subword_index.UNPROVIDED)) ? removal_modules_subword_index.$kw8$ON : removal_modules_subword_index.$kw9$OFF);
        final SubLObject superstrings = lexicon_subword_index.nl_trie_subword_index_search_set(substring, case_sensitivity);
        if (removal_modules_subword_index.NIL != set.set_p(superstrings)) {
            final SubLObject set_contents_var = set.do_set_internal(superstrings);
            SubLObject basis_object;
            SubLObject state;
            SubLObject superstring;
            SubLObject orig_bindings;
            SubLObject unify_justification;
            SubLObject mt_var;
            SubLObject _prev_bind_0;
            SubLObject _prev_bind_2;
            SubLObject _prev_bind_3;
            SubLObject indexed_terms;
            SubLObject cdolist_list_var;
            SubLObject indexed_pred_support;
            SubLObject v_term;
            SubLObject term_bindings;
            SubLObject term_unify_justification;
            SubLObject v_bindings;
            SubLObject substring_support_sentence;
            SubLObject indexed_pred_supports;
            SubLObject substring_supports;
            SubLObject justifications;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)removal_modules_subword_index.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); removal_modules_subword_index.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                superstring = set_contents.do_set_contents_next(basis_object, state);
                if (removal_modules_subword_index.NIL != set_contents.do_set_contents_element_validP(state, superstring) && removal_modules_subword_index.NIL != removal_substring_matchesP(substring_pred, substring, superstring)) {
                    thread.resetMultipleValues();
                    orig_bindings = unification_utilities.term_unify(superstring_var, superstring, (SubLObject)removal_modules_subword_index.UNPROVIDED, (SubLObject)removal_modules_subword_index.UNPROVIDED);
                    unify_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (removal_modules_subword_index.NIL != orig_bindings) {
                        mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                        _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            indexed_terms = cycl_utilities.expression_gather(superstring, (SubLObject)removal_modules_subword_index.$sym10$INDEXED_TERM_P, (SubLObject)removal_modules_subword_index.NIL, Symbols.symbol_function((SubLObject)removal_modules_subword_index.EQUAL), (SubLObject)removal_modules_subword_index.UNPROVIDED, (SubLObject)removal_modules_subword_index.UNPROVIDED);
                            if (removal_modules_subword_index.NIL != kb_indexing_datastructures.indexed_term_p(pred)) {
                                indexed_terms = (SubLObject)ConsesLow.cons(pred, indexed_terms);
                            }
                            cdolist_list_var = virtual_indexing.gather_overlap_index(indexed_terms, (SubLObject)removal_modules_subword_index.UNPROVIDED);
                            indexed_pred_support = (SubLObject)removal_modules_subword_index.NIL;
                            indexed_pred_support = cdolist_list_var.first();
                            while (removal_modules_subword_index.NIL != cdolist_list_var) {
                                if ((removal_modules_subword_index.NIL == pred || pred.equal(cycl_utilities.formula_operator(assertions_high.assertion_formula(indexed_pred_support)))) && removal_modules_subword_index.NIL != Equality.equal(superstring, cycl_utilities.formula_arg(assertions_high.assertion_formula(indexed_pred_support), (SubLObject)removal_modules_subword_index.TWO_INTEGER, (SubLObject)removal_modules_subword_index.UNPROVIDED))) {
                                    v_term = assertions_high.gaf_arg1(indexed_pred_support);
                                    thread.resetMultipleValues();
                                    term_bindings = unification_utilities.term_unify(term_var, v_term, (SubLObject)removal_modules_subword_index.UNPROVIDED, (SubLObject)removal_modules_subword_index.UNPROVIDED);
                                    term_unify_justification = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (removal_modules_subword_index.NIL != term_bindings) {
                                        v_bindings = ((removal_modules_subword_index.NIL != variables.variable_p(term_var)) ? ConsesLow.append(conses_high.copy_list(orig_bindings), term_bindings) : conses_high.copy_list(orig_bindings));
                                        substring_support_sentence = el_utilities.make_binary_formula(substring_pred, superstring, substring);
                                        indexed_pred_supports = (SubLObject)ConsesLow.list(indexed_pred_support);
                                        substring_supports = (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)removal_modules_subword_index.$kw11$EVAL, substring_support_sentence, mt_vars.$core_mt_floor$.getGlobalValue(), (SubLObject)removal_modules_subword_index.UNPROVIDED));
                                        justifications = list_utilities.permute((SubLObject)ConsesLow.list(indexed_pred_supports, substring_supports), ordering);
                                        inference_worker_removal.conjunctive_removal_callback(v_bindings, justifications);
                                    }
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                indexed_pred_support = cdolist_list_var.first();
                            }
                        }
                        finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
        }
        return (SubLObject)removal_modules_subword_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subword-index.lisp", position = 4641L)
    public static SubLObject removal_substring_matchesP(final SubLObject substring_pred, final SubLObject substring, final SubLObject superstring) {
        if (substring_pred.eql(removal_modules_subword_index.$const4$equalStrings_CaseInsensitive)) {
            return Equality.equalp(substring, superstring);
        }
        final SubLObject test = (removal_modules_subword_index.NIL != genl_predicates.genl_predicateP(substring_pred, removal_modules_subword_index.$const7$substring, (SubLObject)removal_modules_subword_index.UNPROVIDED, (SubLObject)removal_modules_subword_index.UNPROVIDED)) ? Symbols.symbol_function((SubLObject)removal_modules_subword_index.EQUAL) : Symbols.symbol_function((SubLObject)removal_modules_subword_index.EQUALP);
        final SubLObject fn = (removal_modules_subword_index.NIL != genl_predicates.genl_predicateP(substring_pred, removal_modules_subword_index.$const13$prefixSubstring_CaseInsensitive, (SubLObject)removal_modules_subword_index.UNPROVIDED, (SubLObject)removal_modules_subword_index.UNPROVIDED)) ? Symbols.symbol_function((SubLObject)removal_modules_subword_index.$sym14$CYCL_STRING_STARTS_WITH_BY_TEST) : ((removal_modules_subword_index.NIL != genl_predicates.genl_predicateP(substring_pred, removal_modules_subword_index.$const15$suffixSubstring, (SubLObject)removal_modules_subword_index.UNPROVIDED, (SubLObject)removal_modules_subword_index.UNPROVIDED)) ? Symbols.symbol_function((SubLObject)removal_modules_subword_index.$sym16$CYCL_STRING_ENDS_WITH_BY_TEST) : Symbols.symbol_function((SubLObject)removal_modules_subword_index.$sym17$CYCL_SUPERSTRING_));
        return Functions.funcall(fn, superstring, substring, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subword-index.lisp", position = 5206L)
    public static SubLObject removal_conjunctive_subword_index_destructure(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pred = (SubLObject)removal_modules_subword_index.NIL;
        SubLObject substring = (SubLObject)removal_modules_subword_index.NIL;
        SubLObject superstring_var = (SubLObject)removal_modules_subword_index.NIL;
        SubLObject term_var = (SubLObject)removal_modules_subword_index.NIL;
        SubLObject substring_pred = (SubLObject)removal_modules_subword_index.NIL;
        SubLObject mt = (SubLObject)removal_modules_subword_index.NIL;
        SubLObject permutation = (SubLObject)removal_modules_subword_index.NIL;
        SubLObject index = (SubLObject)removal_modules_subword_index.ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent = (SubLObject)removal_modules_subword_index.NIL;
        contextualized_asent = cdolist_list_var.first();
        while (removal_modules_subword_index.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject this_mt = (SubLObject)removal_modules_subword_index.NIL;
            SubLObject asent = (SubLObject)removal_modules_subword_index.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_subword_index.$list18);
            this_mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_subword_index.$list18);
            asent = current.first();
            current = current.rest();
            if (removal_modules_subword_index.NIL == current) {
                if (removal_modules_subword_index.NIL != el_utilities.el_binary_formula_p(asent)) {
                    thread.resetMultipleValues();
                    final SubLObject this_pred = el_utilities.unmake_binary_formula(asent);
                    final SubLObject arg1 = thread.secondMultipleValue();
                    final SubLObject arg2 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (this_pred.eql(removal_modules_subword_index.$const4$equalStrings_CaseInsensitive)) {
                        if (removal_modules_subword_index.NIL == superstring_var || superstring_var.eql(arg1)) {
                            substring = arg2;
                            superstring_var = arg1;
                            substring_pred = this_pred;
                            permutation = (SubLObject)ConsesLow.cons((SubLObject)removal_modules_subword_index.ONE_INTEGER, permutation);
                        }
                    }
                    else if (removal_modules_subword_index.NIL != subl_promotions.memberP(this_pred, (SubLObject)removal_modules_subword_index.$list3, (SubLObject)removal_modules_subword_index.UNPROVIDED, (SubLObject)removal_modules_subword_index.UNPROVIDED)) {
                        if (removal_modules_subword_index.NIL == superstring_var || superstring_var.eql(arg2)) {
                            substring = arg1;
                            superstring_var = arg2;
                            substring_pred = this_pred;
                            permutation = (SubLObject)ConsesLow.cons((SubLObject)removal_modules_subword_index.ONE_INTEGER, permutation);
                        }
                    }
                    else if (removal_modules_subword_index.NIL != conses_high.member(this_pred, lexicon_subword_index.non_trie_subword_preds(), (SubLObject)removal_modules_subword_index.UNPROVIDED, (SubLObject)removal_modules_subword_index.UNPROVIDED) && (removal_modules_subword_index.NIL == superstring_var || superstring_var.eql(arg2))) {
                        pred = this_pred;
                        term_var = arg1;
                        superstring_var = arg2;
                        mt = this_mt;
                        permutation = (SubLObject)ConsesLow.cons((SubLObject)removal_modules_subword_index.ZERO_INTEGER, permutation);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_subword_index.$list18);
            }
            index = Numbers.add(index, (SubLObject)removal_modules_subword_index.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        permutation = Sequences.nreverse(permutation);
        return Values.values(pred, substring, superstring_var, term_var, substring_pred, mt, permutation);
    }
    
    public static SubLObject declare_removal_modules_subword_index_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subword_index", "removal_conjunctive_subword_index_applicability", "REMOVAL-CONJUNCTIVE-SUBWORD-INDEX-APPLICABILITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subword_index", "removal_conjunctive_subword_index_cost", "REMOVAL-CONJUNCTIVE-SUBWORD-INDEX-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subword_index", "removal_conjunctive_subword_index_expand", "REMOVAL-CONJUNCTIVE-SUBWORD-INDEX-EXPAND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subword_index", "removal_substring_matchesP", "REMOVAL-SUBSTRING-MATCHES?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subword_index", "removal_conjunctive_subword_index_destructure", "REMOVAL-CONJUNCTIVE-SUBWORD-INDEX-DESTRUCTURE", 1, 0, false);
        return (SubLObject)removal_modules_subword_index.NIL;
    }
    
    public static SubLObject init_removal_modules_subword_index_file() {
        return (SubLObject)removal_modules_subword_index.NIL;
    }
    
    public static SubLObject setup_removal_modules_subword_index_file() {
        inference_modules.inference_conjunctive_removal_module((SubLObject)removal_modules_subword_index.$kw0$REMOVAL_CONJUNCTIVE_SUBWORD_INDEX, (SubLObject)removal_modules_subword_index.$list1);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_subword_index.$sym5$REMOVAL_CONJUNCTIVE_SUBWORD_INDEX_APPLICABILITY);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_subword_index.$sym6$REMOVAL_CONJUNCTIVE_SUBWORD_INDEX_COST);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_subword_index.$sym12$REMOVAL_CONJUNCTIVE_SUBWORD_INDEX_EXPAND);
        return (SubLObject)removal_modules_subword_index.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_subword_index_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_subword_index_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_subword_index_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_subword_index();
        $kw0$REMOVAL_CONJUNCTIVE_SUBWORD_INDEX = SubLObjectFactory.makeKeyword("REMOVAL-CONJUNCTIVE-SUBWORD-INDEX");
        $list1 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("REMOVAL-CONJUNCTIVE-SUBWORD-INDEX-APPLICABILITY"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-CONJUNCTIVE-SUBWORD-INDEX-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-CONJUNCTIVE-SUBWORD-INDEX-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$and (PRED ?X ?Y) (SUBSTRING-PRED SUBSTRING ?Y)) using the subword index. Cf. #$indexSubWordsForArg."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$and (#$comment ?TERM ?COMMENT) (#$substring ?COMMENT \"more obtuse\"))") });
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"));
        $list3 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("suffixSubstring")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("substring")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("prefixSubstring")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("prefixSubstring-CaseInsensitive")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("substring-CaseInsensitive")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("suffixSubstring-CaseInsensitive")));
        $const4$equalStrings_CaseInsensitive = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equalStrings-CaseInsensitive"));
        $sym5$REMOVAL_CONJUNCTIVE_SUBWORD_INDEX_APPLICABILITY = SubLObjectFactory.makeSymbol("REMOVAL-CONJUNCTIVE-SUBWORD-INDEX-APPLICABILITY");
        $sym6$REMOVAL_CONJUNCTIVE_SUBWORD_INDEX_COST = SubLObjectFactory.makeSymbol("REMOVAL-CONJUNCTIVE-SUBWORD-INDEX-COST");
        $const7$substring = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("substring"));
        $kw8$ON = SubLObjectFactory.makeKeyword("ON");
        $kw9$OFF = SubLObjectFactory.makeKeyword("OFF");
        $sym10$INDEXED_TERM_P = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $kw11$EVAL = SubLObjectFactory.makeKeyword("EVAL");
        $sym12$REMOVAL_CONJUNCTIVE_SUBWORD_INDEX_EXPAND = SubLObjectFactory.makeSymbol("REMOVAL-CONJUNCTIVE-SUBWORD-INDEX-EXPAND");
        $const13$prefixSubstring_CaseInsensitive = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("prefixSubstring-CaseInsensitive"));
        $sym14$CYCL_STRING_STARTS_WITH_BY_TEST = SubLObjectFactory.makeSymbol("CYCL-STRING-STARTS-WITH-BY-TEST");
        $const15$suffixSubstring = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("suffixSubstring"));
        $sym16$CYCL_STRING_ENDS_WITH_BY_TEST = SubLObjectFactory.makeSymbol("CYCL-STRING-ENDS-WITH-BY-TEST");
        $sym17$CYCL_SUPERSTRING_ = SubLObjectFactory.makeSymbol("CYCL-SUPERSTRING?");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THIS-MT"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"));
    }
}

/*

	Total time: 126 ms
	
*/