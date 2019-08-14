/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.thesaurus;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.acons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.tries;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      TM-LEXICAL-INDEX
 *  source file: /cyc/top/cycl/thesaurus/tm-lexical-index.lisp
 *  created:     2019/07/03 17:38:29
 */
public final class tm_lexical_index extends SubLTranslatedFile implements V02 {
    // // Constructor
    private tm_lexical_index() {
    }

    public static final SubLFile me = new tm_lexical_index();

    public static final String myName = "com.cyc.cycjava.cycl.thesaurus.tm_lexical_index";

    // // Definitions
    /**
     * An alist of (lexpred . thesauri-index) pairs.  Each thesauri-index is an alist of triples, each of the form (thesaurus lexical-index rotated-index).
     */
    // defvar
    private static final SubLSymbol $thesaurus_indices$ = makeSymbol("*THESAURUS-INDICES*");

    /**
     * If non-nil, additions to lexical indices are not made.  Instead, signs are pushed onto *deferred-lexical-signs*.
     */
    // defparameter
    public static final SubLSymbol $defer_lexical_updateP$ = makeSymbol("*DEFER-LEXICAL-UPDATE?*");

    /**
     * List of signs which haven't been added to lexical indices yet.
     */
    // defparameter
    private static final SubLSymbol $deferred_lexical_signs$ = makeSymbol("*DEFERRED-LEXICAL-SIGNS*");

    public static final SubLObject lexical_index_p(SubLObject v_object) {
        return tries.trie_p(v_object);
    }

    /**
     * Returns T iff there is a lexical index for lexpred in thesaurus.  If rotated? is non-nil,
     * then returns T iff there is a rotated-index.
     */
    public static final SubLObject lexical_index_for_lexpred_thesaurusP(SubLObject lexpred, SubLObject thesaurus, SubLObject rotatedP) {
        if (rotatedP == UNPROVIDED) {
            rotatedP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject index = lexical_index_for_lexpred_thesaurus(lexpred, thesaurus);
                SubLObject rotated_index = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != rotatedP) {
                    if (NIL != rotated_index) {
                        return T;
                    } else {
                        return NIL;
                    }
                } else {
                    if (NIL != index) {
                        return T;
                    } else {
                        return NIL;
                    }
                }
            }
        }
    }

    /**
     * Enter lexical predicates (but no actual indices) into *thesaurus-indices*.
     */
    public static final SubLObject initialize_lexical_index() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject cdolist_list_var = tm_internals.tm_lexpreds_from_kb();
                SubLObject lexpred = NIL;
                for (lexpred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexpred = cdolist_list_var.first()) {
                    ans = cons(list(lexpred), ans);
                }
                $thesaurus_indices$.setDynamicValue(ans, thread);
            }
            return $thesaurus_indices$.getDynamicValue(thread);
        }
    }

    /**
     * Adds lexical indices for THESAURUS to each of the lexpred index-groups, unless lexical updating is deferred.
     */
    public static final SubLObject add_thesaurus_to_lexical_indices(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $defer_lexical_updateP$.getDynamicValue(thread)) {
                SubLTrampolineFile.checkType(thesaurus, $sym0$THESAURUS_);
                {
                    SubLObject cdolist_list_var = $thesaurus_indices$.getDynamicValue(thread);
                    SubLObject lexpred_multi_index = NIL;
                    for (lexpred_multi_index = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexpred_multi_index = cdolist_list_var.first()) {
                        if (NIL == assoc(thesaurus, lexpred_multi_index.rest(), UNPROVIDED, UNPROVIDED)) {
                            rplacd(lexpred_multi_index, acons(thesaurus, list(create_lexical_index(UNPROVIDED, UNPROVIDED), create_lexical_index(NIL, symbol_function(EQUALP))), lexpred_multi_index.rest()));
                        }
                    }
                }
                return $thesaurus_indices$.getDynamicValue(thread);
            }
            return NIL;
        }
    }

    /**
     * Adds a new index-group for LEXPRED, indexing all thesauri, to *THESAURUS-INDICES*, unless lexical updating is deferred.
     */
    public static final SubLObject add_predicate_to_lexical_indices(SubLObject lexpred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $defer_lexical_updateP$.getDynamicValue(thread)) {
                SubLTrampolineFile.checkType(lexpred, $sym1$TM_LEXICAL_PREDICATE_);
                {
                    SubLObject lexpred_multi_index = assoc(lexpred, $thesaurus_indices$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    if (NIL == lexpred_multi_index) {
                        {
                            SubLObject cdolist_list_var = tm_internals.all_thesauri();
                            SubLObject thesaurus = NIL;
                            for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                lexpred_multi_index = acons(thesaurus, list(create_lexical_index(UNPROVIDED, UNPROVIDED), create_lexical_index(NIL, symbol_function(EQUALP))), lexpred_multi_index);
                            }
                        }
                        lexpred_multi_index = cons(lexpred, lexpred_multi_index);
                        $thesaurus_indices$.setDynamicValue(cons(lexpred_multi_index, $thesaurus_indices$.getDynamicValue(thread)), thread);
                    }
                }
                return $thesaurus_indices$.getDynamicValue(thread);
            }
            return NIL;
        }
    }

    /**
     * Deletes and frees the indices for THESAURUS, for all lexical predicates.
     */
    public static final SubLObject remove_thesaurus_from_lexical_indices(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = $thesaurus_indices$.getDynamicValue(thread);
                SubLObject lexpred_multi_index = NIL;
                for (lexpred_multi_index = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexpred_multi_index = cdolist_list_var.first()) {
                    {
                        SubLObject item = member(thesaurus, lexpred_multi_index.rest(), symbol_function(EQL), symbol_function(CAR));
                        if (NIL != item) {
                            Mapping.mapcar(symbol_function(FREE_LEXICAL_INDEX), item.first().rest());
                            rplacd(lexpred_multi_index, remove(thesaurus, lexpred_multi_index.rest(), symbol_function(EQL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        }
                    }
                }
            }
            return $thesaurus_indices$.getDynamicValue(thread);
        }
    }

    /**
     * Deletes and frees the indices for LEXPRED, for all thesauri.
     */
    public static final SubLObject remove_predicate_from_lexical_indices(SubLObject lexpred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lexpred_multi_index = assoc(lexpred, $thesaurus_indices$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                if (NIL != lexpred_multi_index) {
                    $thesaurus_indices$.setDynamicValue(remove(lexpred_multi_index, $thesaurus_indices$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                    {
                        SubLObject cdolist_list_var = lexpred_multi_index.rest();
                        SubLObject thesaurus_index = NIL;
                        for (thesaurus_index = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus_index = cdolist_list_var.first()) {
                            Mapping.mapcar(symbol_function(FREE_LEXICAL_INDEX), thesaurus_index.rest());
                        }
                    }
                }
            }
            return $thesaurus_indices$.getDynamicValue(thread);
        }
    }

    /**
     * Returns a new lexical-index datastructure.
     */
    public static final SubLObject create_lexical_index(SubLObject case_sensitiveP, SubLObject test) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (test == UNPROVIDED) {
            test = EQL;
        }
        return tries.create_trie(NIL, NIL, case_sensitiveP, test);
    }

    public static final SubLObject free_lexical_index(SubLObject index) {
        return tries.free_trie(index);
    }

    public static final SubLObject lexical_index_for_lexpred_thesaurus(SubLObject lexpred, SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lexpred_multi_index = assoc(lexpred, $thesaurus_indices$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                SubLObject thesaurus_index = assoc(thesaurus, lexpred_multi_index.rest(), UNPROVIDED, UNPROVIDED);
                SubLObject index = second(thesaurus_index);
                SubLObject rotated_index = third(thesaurus_index);
                return values(index, rotated_index);
            }
        }
    }

    public static final SubLObject lexpred_multi_index(SubLObject lexpred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return assoc(lexpred, $thesaurus_indices$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     * Returns T iff there are no lexical entries for LEXPRED in the standard index.  If ROTATED? is non-nil, checks the rotated index instead.
     */
    public static final SubLObject lexpred_index_emptyP(SubLObject lexpred, SubLObject rotatedP) {
        if (rotatedP == UNPROVIDED) {
            rotatedP = NIL;
        }
        {
            SubLObject lexpred_multi_index = lexpred_multi_index(lexpred);
            SubLObject found = NIL;
            if (NIL == lexpred_multi_index) {
                return T;
            } else
                if (NIL == lexpred_multi_index.rest()) {
                    return T;
                } else {
                    if (NIL == found) {
                        {
                            SubLObject csome_list_var = lexpred_multi_index.rest();
                            SubLObject thesaurus_index = NIL;
                            for (thesaurus_index = csome_list_var.first(); !((NIL != found) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , thesaurus_index = csome_list_var.first()) {
                                {
                                    SubLObject datum = thesaurus_index;
                                    SubLObject current = datum;
                                    SubLObject thesaurus = NIL;
                                    SubLObject index = NIL;
                                    SubLObject rotated_index = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt4);
                                    thesaurus = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt4);
                                    index = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt4);
                                    rotated_index = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        if (NIL != rotatedP) {
                                            if (NIL == tries.trie_emptyP(rotated_index)) {
                                                found = T;
                                            }
                                        } else {
                                            if (NIL == tries.trie_emptyP(index)) {
                                                found = T;
                                            }
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt4);
                                    }
                                }
                            }
                        }
                    }
                    if (NIL != found) {
                        return NIL;
                    } else {
                        return T;
                    }
                }

        }
    }

    /**
     * Returns all predicate for which there is a lexical index.
     */
    public static final SubLObject all_lexpreds() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject cdolist_list_var = $thesaurus_indices$.getDynamicValue(thread);
                SubLObject lexpred_multi_index = NIL;
                for (lexpred_multi_index = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexpred_multi_index = cdolist_list_var.first()) {
                    ans = cons(lexpred_multi_index.first(), ans);
                }
                return nreverse(ans);
            }
        }
    }

    /**
     * Looks for an exact match of STRING in the index for LEXPRED and THESAURUS, and returns a list of the indexed objects: a list of signs (if ROTATED is nil) or (rotated-string . sign) pairs (if ROTATION is non-nil).  If CASE-SENSITIVE is non-nil, and the index supports it, STRING is compared case-sensitively.  Examines the rotated index if ROTATION? is non-nil; the standard one otherwise.
     */
    public static final SubLObject lexical_lookup(SubLObject string, SubLObject lexpred, SubLObject thesaurus, SubLObject case_sensitiveP, SubLObject rotationP) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (rotationP == UNPROVIDED) {
            rotationP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(tm_datastructures.$tm_mt$.getGlobalValue(), thread);
                    SubLTrampolineFile.checkType(lexpred, $sym6$PREDICATE_);
                    SubLTrampolineFile.checkType(thesaurus, $sym7$MT_);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            thread.resetMultipleValues();
            {
                SubLObject lexical_index = lexical_index_for_lexpred_thesaurus(lexpred, thesaurus);
                SubLObject rotated_index = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != rotationP) {
                    return tries.trie_prefix(rotated_index, string, case_sensitiveP, T, UNPROVIDED, UNPROVIDED);
                } else {
                    return tries.trie_prefix(lexical_index, string, case_sensitiveP, T, UNPROVIDED, UNPROVIDED);
                }
            }
        }
    }

    /**
     * Looks for strings that have STRING as a prefix in the index for LEXPRED and THESAURUS, and returns a list of the indexed objects: a list of signs (if ROTATED is nil), or (rotated-string . sign) pairs (if ROTATION is non-nil).  If CASE-SENSITIVE is non-nil, and the index supports it, STRING is compared case-sensitively. Examines the rotated index if ROTATION? is non-nil; the standard one otherwise.
     */
    public static final SubLObject lexical_prefix(SubLObject string, SubLObject lexpred, SubLObject thesaurus, SubLObject case_sensitiveP, SubLObject rotationP) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (rotationP == UNPROVIDED) {
            rotationP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(tm_datastructures.$tm_mt$.getGlobalValue(), thread);
                    SubLTrampolineFile.checkType(lexpred, $sym6$PREDICATE_);
                    SubLTrampolineFile.checkType(thesaurus, $sym7$MT_);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            thread.resetMultipleValues();
            {
                SubLObject lexical_index = lexical_index_for_lexpred_thesaurus(lexpred, thesaurus);
                SubLObject rotated_index = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != rotationP) {
                    return tries.trie_prefix(rotated_index, string, case_sensitiveP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    return tries.trie_prefix(lexical_index, string, case_sensitiveP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
    }

    /**
     * Looks for strings that have STRING anywhere as a substring in the index for LEXPRED and THESAURUS, and returns a list of the indexed objects: a list of signs (if ROTATED is nil), or (rotated-string . sign) pairs (if ROTATION is non-nil).  If CASE-SENSITIVE is non-nil, and the index supports it, STRING is compared case-sensitively. Examines the rotated index if ROTATION? is non-nil; the standard one otherwise.
     */
    public static final SubLObject lexical_search(SubLObject string, SubLObject lexpred, SubLObject thesaurus, SubLObject case_sensitiveP, SubLObject rotationP) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (rotationP == UNPROVIDED) {
            rotationP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(tm_datastructures.$tm_mt$.getGlobalValue(), thread);
                    SubLTrampolineFile.checkType(lexpred, $sym6$PREDICATE_);
                    SubLTrampolineFile.checkType(thesaurus, $sym7$MT_);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            thread.resetMultipleValues();
            {
                SubLObject lexical_index = lexical_index_for_lexpred_thesaurus(lexpred, thesaurus);
                SubLObject rotated_index = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != rotationP) {
                    return tries.trie_search(rotated_index, string, case_sensitiveP, UNPROVIDED, UNPROVIDED);
                } else {
                    return tries.trie_search(lexical_index, string, case_sensitiveP, UNPROVIDED, UNPROVIDED);
                }
            }
        }
    }

    /**
     * Looks for an exact match of STRING in the indices for LEXPRED and each of THESAURI.  Returns a list of the indexed objects: a list of signs (if ROTATED is nil), or (rotated-string . sign) pairs (if ROTATION is non-nil).  If CASE-SENSITIVE is non-nil, and the index supports it, STRING is compared case-sensitively. Examines the rotated index if ROTATION? is non-nil; the standard one otherwise.
     */
    public static final SubLObject lexpred_lookup(SubLObject string, SubLObject lexpred, SubLObject thesauri, SubLObject case_sensitiveP, SubLObject rotationP) {
        if (thesauri == UNPROVIDED) {
            thesauri = $ALL;
        }
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (rotationP == UNPROVIDED) {
            rotationP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(tm_datastructures.$tm_mt$.getGlobalValue(), thread);
                    SubLTrampolineFile.checkType(lexpred, $sym6$PREDICATE_);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            {
                SubLObject lexpred_multi_index = lexpred_multi_index(lexpred);
                SubLObject ans = NIL;
                SubLObject cdolist_list_var = lexpred_multi_index.rest();
                SubLObject thesaurus_index = NIL;
                for (thesaurus_index = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus_index = cdolist_list_var.first()) {
                    {
                        SubLObject thesaurus = thesaurus_index.first();
                        if ((thesauri == $ALL) || (NIL != member(thesaurus, thesauri, UNPROVIDED, UNPROVIDED))) {
                            {
                                SubLObject sub_ans = lexical_lookup(string, lexpred, thesaurus, case_sensitiveP, rotationP);
                                if (NIL != sub_ans) {
                                    ans = append(sub_ans, ans);
                                }
                            }
                        }
                    }
                }
                return nreverse(ans);
            }
        }
    }

    /**
     * Looks for strings that have STRING as a prefix in the indices for LEXPRED and each of THESAURI.  Returns a list of the indexed objects: a list of signs (if ROTATED is nil), or (rotated-string . sign) pairs (if ROTATION is non-nil).  If CASE-SENSITIVE is non-nil, and the index supports it, STRING is compared case-sensitively. Examines the rotated index if ROTATION? is non-nil; the standard one otherwise.
     */
    public static final SubLObject lexpred_prefix(SubLObject string, SubLObject lexpred, SubLObject thesauri, SubLObject case_sensitiveP, SubLObject rotationP) {
        if (thesauri == UNPROVIDED) {
            thesauri = $ALL;
        }
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (rotationP == UNPROVIDED) {
            rotationP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(tm_datastructures.$tm_mt$.getGlobalValue(), thread);
                    SubLTrampolineFile.checkType(lexpred, $sym6$PREDICATE_);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            {
                SubLObject lexpred_multi_index = lexpred_multi_index(lexpred);
                SubLObject ans = NIL;
                SubLObject cdolist_list_var = lexpred_multi_index.rest();
                SubLObject thesaurus_index = NIL;
                for (thesaurus_index = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus_index = cdolist_list_var.first()) {
                    {
                        SubLObject thesaurus = thesaurus_index.first();
                        if ((thesauri == $ALL) || (NIL != member(thesaurus, thesauri, UNPROVIDED, UNPROVIDED))) {
                            {
                                SubLObject sub_ans = lexical_prefix(string, lexpred, thesaurus, case_sensitiveP, rotationP);
                                ans = append(sub_ans, ans);
                            }
                        }
                    }
                }
                return nreverse(ans);
            }
        }
    }

    /**
     * Looks for strings which have STRING as any substring, in the indices for LEXPRED and each of THESAURI.  Returns a list of the indexed objects: a list of signs (if ROTATED is nil), or (rotated-string . sign) pairs (if ROTATION is non-nil).  If CASE-SENSITIVE is non-nil, and the index supports it, STRING is compared case-sensitively. Examines the rotated index if ROTATION? is non-nil; the standard one otherwise.
     */
    public static final SubLObject lexpred_search(SubLObject string, SubLObject lexpred, SubLObject thesauri, SubLObject case_sensitiveP, SubLObject rotationP) {
        if (thesauri == UNPROVIDED) {
            thesauri = $ALL;
        }
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (rotationP == UNPROVIDED) {
            rotationP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(tm_datastructures.$tm_mt$.getGlobalValue(), thread);
                    SubLTrampolineFile.checkType(lexpred, $sym6$PREDICATE_);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            {
                SubLObject lexpred_multi_index = lexpred_multi_index(lexpred);
                SubLObject ans = NIL;
                SubLObject cdolist_list_var = lexpred_multi_index.rest();
                SubLObject thesaurus_index = NIL;
                for (thesaurus_index = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus_index = cdolist_list_var.first()) {
                    {
                        SubLObject thesaurus = thesaurus_index.first();
                        if ((thesauri == $ALL) || (NIL != member(thesaurus, thesauri, UNPROVIDED, UNPROVIDED))) {
                            {
                                SubLObject sub_ans = lexical_search(string, lexpred, thesaurus, case_sensitiveP, rotationP);
                                ans = append(sub_ans, ans);
                            }
                        }
                    }
                }
                return ans;
            }
        }
    }

    /**
     * Starting with the object indexed under STRING, or its position if not present, map through the index for LEXPRED and THESAURUS, forward if FORWARD = t (backward otherwise), applying FUNCTION to the objects indexed. If ROTATION? is non-nil, maps the rotated-index; otherwise, maps the standard one.
     */
    public static final SubLObject map_lexical_direction(SubLObject function, SubLObject string, SubLObject lexpred, SubLObject thesaurus, SubLObject v_forward, SubLObject rotationP) {
        if (v_forward == UNPROVIDED) {
            v_forward = T;
        }
        if (rotationP == UNPROVIDED) {
            rotationP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject lexical_index = lexical_index_for_lexpred_thesaurus(lexpred, thesaurus);
                SubLObject rotated_index = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != rotationP) {
                    tries.map_trie_data_direction(function, rotated_index, string, ZERO_INTEGER, NIL, v_forward);
                } else {
                    tries.map_trie_data_direction(function, lexical_index, string, ZERO_INTEGER, NIL, v_forward);
                }
            }
            return NIL;
        }
    }

    /**
     * Adds SIGN to the relevant lexical index (both standard and rotated indices), unless updating is deferred.  Returns T iff SIGN was indexed.
     */
    public static final SubLObject add_lexical_entry(SubLObject sign) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(sign, SIGNP);
            if (NIL != $defer_lexical_updateP$.getDynamicValue(thread)) {
                return NIL;
            } else {
                {
                    SubLObject lexpred = tm_datastructures.sign_relation(sign);
                    SubLObject thesaurus = tm_datastructures.sign_thesaurus(sign);
                    SubLObject string = tm_datastructures.sign_term(sign);
                    thread.resetMultipleValues();
                    {
                        SubLObject index = lexical_index_for_lexpred_thesaurus(lexpred, thesaurus);
                        SubLObject rotated_index = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != index) {
                            tries.trie_insert(index, string, sign, UNPROVIDED, UNPROVIDED);
                            {
                                SubLObject rotations = tm_datastructures.tm_rotations(string);
                                SubLObject cdolist_list_var = rotations;
                                SubLObject rotation = NIL;
                                for (rotation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rotation = cdolist_list_var.first()) {
                                    tries.trie_insert(rotated_index, rotation, cons(rotation, sign), UNPROVIDED, UNPROVIDED);
                                }
                            }
                            return T;
                        } else {
                            Errors.warn($str_alt10$No_lexical_index_for__A_in__A, lexpred, thesaurus);
                            return NIL;
                        }
                    }
                }
            }
        }
    }

    /**
     * check before and after lexical-index removals and additions.
     */
    // defparameter
    private static final SubLSymbol $validate_lexical_index_changes$ = makeSymbol("*VALIDATE-LEXICAL-INDEX-CHANGES*");

    /**
     * Removes SIGN from the relevant lexical index (both standard and rotated indices).
     */
    public static final SubLObject remove_lexical_entry(SubLObject sign, SubLObject standardP, SubLObject rotationP) {
        if (standardP == UNPROVIDED) {
            standardP = T;
        }
        if (rotationP == UNPROVIDED) {
            rotationP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(sign, SIGNP);
            {
                SubLObject lexpred = tm_datastructures.sign_relation(sign);
                SubLObject thesaurus = tm_datastructures.sign_thesaurus(sign);
                SubLObject string = tm_datastructures.sign_term(sign);
                thread.resetMultipleValues();
                {
                    SubLObject index = lexical_index_for_lexpred_thesaurus(lexpred, thesaurus);
                    SubLObject rotated_index = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if ((NIL != standardP) && (NIL != index)) {
                        if (NIL != $validate_lexical_index_changes$.getDynamicValue(thread)) {
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == tries.trie_prefix(index, string, NIL, T, UNPROVIDED, UNPROVIDED)) {
                                    Errors.error($str_alt11$_S_is_missing_from__S_under__S, sign, index, string);
                                }
                            }
                        }
                        tries.trie_remove(index, string, sign, UNPROVIDED, UNPROVIDED);
                        if (NIL != $validate_lexical_index_changes$.getDynamicValue(thread)) {
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL != tries.trie_prefix(index, string, NIL, T, UNPROVIDED, UNPROVIDED)) {
                                    Errors.error($str_alt12$_S_is_still_present_in__S_under__, sign, index, string);
                                }
                            }
                        }
                    }
                    if ((NIL != rotationP) && (NIL != rotated_index)) {
                        {
                            SubLObject rotations = tm_datastructures.tm_rotations(string);
                            SubLObject cdolist_list_var = rotations;
                            SubLObject rotation = NIL;
                            for (rotation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rotation = cdolist_list_var.first()) {
                                {
                                    SubLObject index_data_item = cons(rotation, sign);
                                    if (NIL != $validate_lexical_index_changes$.getDynamicValue(thread)) {
                                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                            if (NIL == tries.trie_prefix(rotated_index, rotation, NIL, T, UNPROVIDED, UNPROVIDED)) {
                                                Errors.error($str_alt11$_S_is_missing_from__S_under__S, sign, rotated_index, rotation);
                                            }
                                        }
                                    }
                                    tries.trie_remove(rotated_index, rotation, index_data_item, UNPROVIDED, UNPROVIDED);
                                    if (NIL != $validate_lexical_index_changes$.getDynamicValue(thread)) {
                                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                            if (NIL != tries.trie_prefix(rotated_index, rotation, NIL, T, UNPROVIDED, UNPROVIDED)) {
                                                Errors.error($str_alt12$_S_is_still_present_in__S_under__, sign, rotated_index, rotation);
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

    /**
     * Removes all lexical entries which are indexed under a string that has STRING as a prefix, from the index for LEXPRED and THESAURUS.  If ROTATION? is non-nil, the rotated-index is affected; otherwise, entries are removed from the standard one.
     */
    public static final SubLObject lexical_remove_all(SubLObject string, SubLObject lexpred, SubLObject thesaurus, SubLObject rotationP) {
        if (rotationP == UNPROVIDED) {
            rotationP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total = ZERO_INTEGER;
                thread.resetMultipleValues();
                {
                    SubLObject index = lexical_index_for_lexpred_thesaurus(lexpred, thesaurus);
                    SubLObject rotated_index = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != rotationP) {
                        total = add(total, tries.trie_remove_all(rotated_index, string, UNPROVIDED, UNPROVIDED));
                    } else {
                        total = add(total, tries.trie_remove_all(index, string, UNPROVIDED, UNPROVIDED));
                    }
                }
                return total;
            }
        }
    }

    /**
     * Removes all lexical entries which are indexed under a string that has STRING as a prefix, from the indices for LEXPRED and each of THESAURI.  If ROTATION? is non-nil, the rotated-index is affected; otherwise, entries are removed from the standard one.
     */
    public static final SubLObject lexpred_remove_all(SubLObject string, SubLObject lexpred, SubLObject thesauri, SubLObject rotationP) {
        if (thesauri == UNPROVIDED) {
            thesauri = $ALL;
        }
        if (rotationP == UNPROVIDED) {
            rotationP = NIL;
        }
        {
            SubLObject lexpred_multi_index = lexpred_multi_index(lexpred);
            SubLObject total = ZERO_INTEGER;
            SubLObject cdolist_list_var = lexpred_multi_index.rest();
            SubLObject thesaurus_index = NIL;
            for (thesaurus_index = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus_index = cdolist_list_var.first()) {
                {
                    SubLObject thesaurus = thesaurus_index.first();
                    if ((thesauri == $ALL) || (NIL != member(thesaurus, thesauri, UNPROVIDED, UNPROVIDED))) {
                        total = add(total, lexical_remove_all(string, lexpred, thesaurus, rotationP));
                    }
                }
            }
            return total;
        }
    }

    /**
     * For all lexpreds and thesauri, make sure there are indices present.
     */
    public static final SubLObject tm_possibly_update_index_buckets() {
        {
            SubLObject cdolist_list_var = tm_internals.all_thesauri();
            SubLObject thesaurus = NIL;
            for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                add_thesaurus_to_lexical_indices(thesaurus);
            }
        }
        {
            SubLObject cdolist_list_var = tm_internals.tm_lexpreds_from_kb();
            SubLObject lexpred = NIL;
            for (lexpred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexpred = cdolist_list_var.first()) {
                add_predicate_to_lexical_indices(lexpred);
            }
        }
        return NIL;
    }

    public static final SubLObject tm_add_deferred_lexical_entries() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $defer_lexical_updateP$.getDynamicValue(thread)) {
                tm_possibly_update_index_buckets();
                tm_datastructures.tm_rebuild_alphabetical_index(T, UNPROVIDED);
                return NIL;
            }
            return NIL;
        }
    }

    /**
     * Evaluate BODY with lexical updating deferred, then perform all updating.
     */
    public static final SubLObject with_deferred_lexical_update(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(PROGN, listS(CLET, $list_alt15, append(body, NIL)), $list_alt16);
        }
    }

    /**
     * Returns all signs for STRING using LEXPRED, in all thesauri.
     */
    public static final SubLObject lexpred_signs_all_thesauri(SubLObject string, SubLObject lexpred) {
        return lexpred_lookup(string, lexpred, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all signs for STRING using LEXPRED, in THESAURI.
     */
    public static final SubLObject lexpred_signs_in_thesauri(SubLObject string, SubLObject lexpred, SubLObject thesauri) {
        return lexpred_lookup(string, lexpred, thesauri, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all signs for STRING using LEXPRED, in THESAURUS.
     */
    public static final SubLObject lexpred_signs_in_thesaurus(SubLObject string, SubLObject lexpred, SubLObject thesaurus) {
        return lexical_lookup(string, lexpred, thesaurus, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns signs for STRING using any of LEXPREDS, from all thesauri.
     */
    public static final SubLObject signs_of_lexpreds_all_thesauri(SubLObject string, SubLObject lexpreds) {
        {
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = lexpreds;
            SubLObject lexpred = NIL;
            for (lexpred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexpred = cdolist_list_var.first()) {
                ans = nconc(lexpred_lookup(string, lexpred, UNPROVIDED, UNPROVIDED, UNPROVIDED), ans);
            }
            return ans;
        }
    }

    /**
     * Returns signs for STRING using any of LEXPREDS, from THESAURI.
     */
    public static final SubLObject signs_of_lexpreds_in_thesauri(SubLObject string, SubLObject lexpreds, SubLObject thesauri) {
        {
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = lexpreds;
            SubLObject lexpred = NIL;
            for (lexpred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexpred = cdolist_list_var.first()) {
                ans = nconc(lexpred_lookup(string, lexpred, thesauri, UNPROVIDED, UNPROVIDED), ans);
            }
            return ans;
        }
    }

    /**
     * Returns signs for STRING using any of LEXPREDS, from THESAURUS.
     */
    public static final SubLObject signs_of_lexpreds_in_thesaurus(SubLObject string, SubLObject lexpreds, SubLObject thesaurus) {
        {
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = lexpreds;
            SubLObject lexpred = NIL;
            for (lexpred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexpred = cdolist_list_var.first()) {
                ans = nconc(lexical_lookup(string, lexpred, thesaurus, UNPROVIDED, UNPROVIDED), ans);
            }
            return ans;
        }
    }

    /**
     * Returns all signs for STRING, using any lexical predicate, from all thesauri.
     */
    public static final SubLObject signs_all_lexpreds_all_thesauri(SubLObject string) {
        {
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = all_lexpreds();
            SubLObject lexpred = NIL;
            for (lexpred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexpred = cdolist_list_var.first()) {
                ans = nconc(lexpred_lookup(string, lexpred, UNPROVIDED, UNPROVIDED, UNPROVIDED), ans);
            }
            return ans;
        }
    }

    /**
     * Returns all signs for STRING, using any lexical predicate, from THESAURI.
     */
    public static final SubLObject signs_all_lexpreds_in_thesauri(SubLObject string, SubLObject thesauri) {
        {
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = all_lexpreds();
            SubLObject lexpred = NIL;
            for (lexpred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexpred = cdolist_list_var.first()) {
                ans = nconc(new SubLObject[]{ lexpred_lookup(string, lexpred, thesauri, UNPROVIDED, UNPROVIDED) });
            }
            return ans;
        }
    }

    /**
     * Returns all signs for STRING, using any lexical predicate, from THESAURUS.
     */
    public static final SubLObject signs_all_lexpreds_in_thesaurus(SubLObject string, SubLObject thesaurus) {
        {
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = all_lexpreds();
            SubLObject lexpred = NIL;
            for (lexpred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexpred = cdolist_list_var.first()) {
                ans = nconc(lexical_lookup(string, lexpred, thesaurus, UNPROVIDED, UNPROVIDED), ans);
            }
            return ans;
        }
    }

    /**
     * Returns signs indexed under strings which have STRING as a prefix, using any of LEXPREDS, in any thesaurus.  If ROTATION? is non-nill, searches the rotated indices instead.
     */
    public static final SubLObject tm_lexpreds_complete_in_any_thesaurus(SubLObject string, SubLObject lexpreds, SubLObject rotationP) {
        if (rotationP == UNPROVIDED) {
            rotationP = NIL;
        }
        return tm_lexpreds_complete(string, lexpreds, $ALL, rotationP);
    }

    /**
     * Returns signs indexed under strings which have STRING as a prefix, using any of LEXPREDS, in any of THESAURI.  If ROTATION? is non-nill, searches the rotated indices instead.
     */
    public static final SubLObject tm_lexpreds_complete_in_thesauri(SubLObject string, SubLObject lexpreds, SubLObject thesauri, SubLObject rotationP) {
        if (rotationP == UNPROVIDED) {
            rotationP = NIL;
        }
        return tm_lexpreds_complete(string, lexpreds, thesauri, rotationP);
    }

    public static final SubLObject tm_lexpreds_complete(SubLObject string, SubLObject lexpreds, SubLObject thesauri, SubLObject rotationP) {
        {
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = lexpreds;
            SubLObject lexpred = NIL;
            for (lexpred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexpred = cdolist_list_var.first()) {
                ans = nconc(lexpred_prefix(string, lexpred, thesauri, NIL, rotationP), ans);
            }
            if (NIL != rotationP) {
                ans = Mapping.mapcar(symbol_function(CDR), ans);
            }
            return ans;
        }
    }

    /**
     * Return signs indexed under strings which have STRING as some continuous
     * substring, using any of LEXPREDS, in any of THESAURI.
     */
    public static final SubLObject tm_lexpreds_search_in_thesauri(SubLObject string, SubLObject lexpreds, SubLObject thesauri) {
        {
            SubLObject v_answer = NIL;
            SubLObject cdolist_list_var = lexpreds;
            SubLObject lexpred = NIL;
            for (lexpred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexpred = cdolist_list_var.first()) {
                v_answer = nconc(lexpred_search(string, lexpred, thesauri, UNPROVIDED, UNPROVIDED), v_answer);
            }
            return v_answer;
        }
    }

    /**
     * Return signs indexed under STRING using any of LEXPREDS, in any of THESAURI.
     */
    public static final SubLObject tm_lexpreds_exact_in_thesauri(SubLObject string, SubLObject lexpreds, SubLObject thesauri) {
        {
            SubLObject v_answer = NIL;
            SubLObject cdolist_list_var = lexpreds;
            SubLObject lexpred = NIL;
            for (lexpred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexpred = cdolist_list_var.first()) {
                v_answer = nconc(lexpred_lookup(string, lexpred, thesauri, UNPROVIDED, UNPROVIDED), v_answer);
            }
            return v_answer;
        }
    }

    public static final SubLObject declare_tm_lexical_index_file() {
        declareFunction("lexical_index_p", "LEXICAL-INDEX-P", 1, 0, false);
        declareFunction("lexical_index_for_lexpred_thesaurusP", "LEXICAL-INDEX-FOR-LEXPRED-THESAURUS?", 2, 1, false);
        declareFunction("initialize_lexical_index", "INITIALIZE-LEXICAL-INDEX", 0, 0, false);
        declareFunction("add_thesaurus_to_lexical_indices", "ADD-THESAURUS-TO-LEXICAL-INDICES", 1, 0, false);
        declareFunction("add_predicate_to_lexical_indices", "ADD-PREDICATE-TO-LEXICAL-INDICES", 1, 0, false);
        declareFunction("remove_thesaurus_from_lexical_indices", "REMOVE-THESAURUS-FROM-LEXICAL-INDICES", 1, 0, false);
        declareFunction("remove_predicate_from_lexical_indices", "REMOVE-PREDICATE-FROM-LEXICAL-INDICES", 1, 0, false);
        declareFunction("create_lexical_index", "CREATE-LEXICAL-INDEX", 0, 2, false);
        declareFunction("free_lexical_index", "FREE-LEXICAL-INDEX", 1, 0, false);
        declareFunction("lexical_index_for_lexpred_thesaurus", "LEXICAL-INDEX-FOR-LEXPRED-THESAURUS", 2, 0, false);
        declareFunction("lexpred_multi_index", "LEXPRED-MULTI-INDEX", 1, 0, false);
        declareFunction("lexpred_index_emptyP", "LEXPRED-INDEX-EMPTY?", 1, 1, false);
        declareFunction("all_lexpreds", "ALL-LEXPREDS", 0, 0, false);
        declareFunction("lexical_lookup", "LEXICAL-LOOKUP", 3, 2, false);
        declareFunction("lexical_prefix", "LEXICAL-PREFIX", 3, 2, false);
        declareFunction("lexical_search", "LEXICAL-SEARCH", 3, 2, false);
        declareFunction("lexpred_lookup", "LEXPRED-LOOKUP", 2, 3, false);
        declareFunction("lexpred_prefix", "LEXPRED-PREFIX", 2, 3, false);
        declareFunction("lexpred_search", "LEXPRED-SEARCH", 2, 3, false);
        declareFunction("map_lexical_direction", "MAP-LEXICAL-DIRECTION", 4, 2, false);
        declareFunction("add_lexical_entry", "ADD-LEXICAL-ENTRY", 1, 0, false);
        declareFunction("remove_lexical_entry", "REMOVE-LEXICAL-ENTRY", 1, 2, false);
        declareFunction("lexical_remove_all", "LEXICAL-REMOVE-ALL", 3, 1, false);
        declareFunction("lexpred_remove_all", "LEXPRED-REMOVE-ALL", 2, 2, false);
        declareFunction("tm_possibly_update_index_buckets", "TM-POSSIBLY-UPDATE-INDEX-BUCKETS", 0, 0, false);
        declareFunction("tm_add_deferred_lexical_entries", "TM-ADD-DEFERRED-LEXICAL-ENTRIES", 0, 0, false);
        declareMacro("with_deferred_lexical_update", "WITH-DEFERRED-LEXICAL-UPDATE");
        declareFunction("lexpred_signs_all_thesauri", "LEXPRED-SIGNS-ALL-THESAURI", 2, 0, false);
        declareFunction("lexpred_signs_in_thesauri", "LEXPRED-SIGNS-IN-THESAURI", 3, 0, false);
        declareFunction("lexpred_signs_in_thesaurus", "LEXPRED-SIGNS-IN-THESAURUS", 3, 0, false);
        declareFunction("signs_of_lexpreds_all_thesauri", "SIGNS-OF-LEXPREDS-ALL-THESAURI", 2, 0, false);
        declareFunction("signs_of_lexpreds_in_thesauri", "SIGNS-OF-LEXPREDS-IN-THESAURI", 3, 0, false);
        declareFunction("signs_of_lexpreds_in_thesaurus", "SIGNS-OF-LEXPREDS-IN-THESAURUS", 3, 0, false);
        declareFunction("signs_all_lexpreds_all_thesauri", "SIGNS-ALL-LEXPREDS-ALL-THESAURI", 1, 0, false);
        declareFunction("signs_all_lexpreds_in_thesauri", "SIGNS-ALL-LEXPREDS-IN-THESAURI", 2, 0, false);
        declareFunction("signs_all_lexpreds_in_thesaurus", "SIGNS-ALL-LEXPREDS-IN-THESAURUS", 2, 0, false);
        declareFunction("tm_lexpreds_complete_in_any_thesaurus", "TM-LEXPREDS-COMPLETE-IN-ANY-THESAURUS", 2, 1, false);
        declareFunction("tm_lexpreds_complete_in_thesauri", "TM-LEXPREDS-COMPLETE-IN-THESAURI", 3, 1, false);
        declareFunction("tm_lexpreds_complete", "TM-LEXPREDS-COMPLETE", 4, 0, false);
        declareFunction("tm_lexpreds_search_in_thesauri", "TM-LEXPREDS-SEARCH-IN-THESAURI", 3, 0, false);
        declareFunction("tm_lexpreds_exact_in_thesauri", "TM-LEXPREDS-EXACT-IN-THESAURI", 3, 0, false);
        return NIL;
    }

    public static final SubLObject init_tm_lexical_index_file() {
        defvar("*THESAURUS-INDICES*", NIL);
        defparameter("*DEFER-LEXICAL-UPDATE?*", NIL);
        defparameter("*DEFERRED-LEXICAL-SIGNS*", NIL);
        defparameter("*VALIDATE-LEXICAL-INDEX-CHANGES*", NIL);
        return NIL;
    }

    public static final SubLObject setup_tm_lexical_index_file() {
                return NIL;
    }

    // // Internal Constants
    static private final SubLSymbol $sym0$THESAURUS_ = makeSymbol("THESAURUS?");

    static private final SubLSymbol $sym1$TM_LEXICAL_PREDICATE_ = makeSymbol("TM-LEXICAL-PREDICATE?");



    private static final SubLSymbol FREE_LEXICAL_INDEX = makeSymbol("FREE-LEXICAL-INDEX");

    static private final SubLList $list_alt4 = list(makeSymbol("THESAURUS"), makeSymbol("INDEX"), makeSymbol("ROTATED-INDEX"));



    static private final SubLSymbol $sym6$PREDICATE_ = makeSymbol("PREDICATE?");

    static private final SubLSymbol $sym7$MT_ = makeSymbol("MT?");



    private static final SubLSymbol SIGNP = makeSymbol("SIGNP");

    static private final SubLString $str_alt10$No_lexical_index_for__A_in__A = makeString("No lexical index for ~A in ~A");

    static private final SubLString $str_alt11$_S_is_missing_from__S_under__S = makeString("~S is missing from ~S under ~S");

    static private final SubLString $str_alt12$_S_is_still_present_in__S_under__ = makeString("~S is still present in ~S under ~S");





    static private final SubLList $list_alt15 = list(list(makeSymbol("*DEFER-LEXICAL-UPDATE?*"), T));

    static private final SubLList $list_alt16 = list(list(makeSymbol("TM-ADD-DEFERRED-LEXICAL-ENTRIES")));



    // // Initializers
    public void declareFunctions() {
        declare_tm_lexical_index_file();
    }

    public void initializeVariables() {
        init_tm_lexical_index_file();
    }

    public void runTopLevelForms() {
        setup_tm_lexical_index_file();
    }
}

