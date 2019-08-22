/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

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


public final class nl_trie_staleness_test extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new nl_trie_staleness_test();

 public static final String myName = "com.cyc.cycjava.cycl.nl_trie_staleness_test";






    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $nl_trie_revisions$ = makeSymbol("*NL-TRIE-REVISIONS*");

    public static final SubLSymbol $nl_trie_staleness_acceptableP$ = makeSymbol("*NL-TRIE-STALENESS-ACCEPTABLE?*");

    public static final SubLSymbol $nl_trie_known_staleP$ = makeSymbol("*NL-TRIE-KNOWN-STALE?*");

    static private final SubLList $list3 = list(makeSymbol("*NL-TRIE-CODE-REVISION*"), makeSymbol("*MORPHOLOGY-CODE-REVISION*"), makeSymbol("*LEXICON-CACHE-CODE-REVISION*"));

    static private final SubLString $str5$___S_is_not_the_right_type_of_obj = makeString("~&~S is not the right type of object for ~S (expected a ~S).");

    public static final SubLSymbol $nl_trie_revision_globals$ = makeSymbol("*NL-TRIE-REVISION-GLOBALS*");

    static private final SubLString $str9$NL_trie_is_currently_being_initia = makeString("NL trie is currently being initialized.");

    static private final SubLString $str10$NL_trie_not_present___ = makeString("NL trie not present.~%");

    static private final SubLString $str11$NL_trie_empty___ = makeString("NL trie empty.~%");

    static private final SubLString $str12$NL_trie_built_with_stale_code__ = makeString("NL trie built with stale code~%");

    static private final SubLString $str13$NL_trie_simple_string_retrieval_f = makeString("NL trie simple string retrieval failed.~%");

    static private final SubLSymbol $sym14$NL_TRIE_REVISIONS_STALE_ = makeSymbol("NL-TRIE-REVISIONS-STALE?");

    private static final SubLString $str15$NL_trie_built_with_stale_version_ = makeString("NL trie built with stale version of ~S~%");

    private static final SubLSymbol $sym16$SINGLETON_ = makeSymbol("SINGLETON?");

    public static final SubLObject nl_trie_known_stale_p_alt() {
        return $nl_trie_known_staleP$.getGlobalValue();
    }

    public static SubLObject nl_trie_known_stale_p() {
        return $nl_trie_known_staleP$.getGlobalValue();
    }

    public static final SubLObject declare_nl_trie_known_stale_alt() {
        $nl_trie_known_staleP$.setGlobalValue(T);
        return $nl_trie_known_staleP$.getGlobalValue();
    }

    public static SubLObject declare_nl_trie_known_stale() {
        $nl_trie_known_staleP$.setGlobalValue(T);
        return $nl_trie_known_staleP$.getGlobalValue();
    }

    public static final SubLObject declare_nl_trie_not_known_stale_alt() {
        $nl_trie_known_staleP$.setGlobalValue(NIL);
        return $nl_trie_known_staleP$.getGlobalValue();
    }

    public static SubLObject declare_nl_trie_not_known_stale() {
        $nl_trie_known_staleP$.setGlobalValue(NIL);
        return $nl_trie_known_staleP$.getGlobalValue();
    }

    public static final SubLObject declare_nl_trie_staleness_acceptable_alt() {
        $nl_trie_staleness_acceptableP$.setGlobalValue(T);
        return $nl_trie_staleness_acceptableP$.getGlobalValue();
    }

    public static SubLObject declare_nl_trie_staleness_acceptable() {
        $nl_trie_staleness_acceptableP$.setGlobalValue(T);
        return $nl_trie_staleness_acceptableP$.getGlobalValue();
    }

    public static final SubLObject declare_nl_trie_staleness_unacceptable_alt() {
        $nl_trie_staleness_acceptableP$.setGlobalValue(NIL);
        return $nl_trie_staleness_acceptableP$.getGlobalValue();
    }

    public static SubLObject declare_nl_trie_staleness_unacceptable() {
        $nl_trie_staleness_acceptableP$.setGlobalValue(NIL);
        return $nl_trie_staleness_acceptableP$.getGlobalValue();
    }

    public static final SubLObject nl_trie_staleness_acceptableP_alt() {
        return $nl_trie_staleness_acceptableP$.getGlobalValue();
    }

    public static SubLObject nl_trie_staleness_acceptableP() {
        return $nl_trie_staleness_acceptableP$.getGlobalValue();
    }

    public static final SubLObject load_nl_trie_revisions_alt(SubLObject stream) {
        {
            SubLObject top = cfasl_input(stream, NIL, $EOF);
            if ((top != $EOF) && top.isList()) {
                $nl_trie_revision_globals$.setGlobalValue(top);
            } else {
                Errors.warn($str_alt5$___S_is_not_the_right_type_of_obj, top, $nl_trie_revision_globals$, LISTP);
            }
        }
        {
            SubLObject top = cfasl_input(stream, NIL, $EOF);
            if ((top != $EOF) && (NIL != list_utilities.alist_p(top))) {
                $nl_trie_revisions$.setGlobalValue(top);
            } else {
                Errors.warn($str_alt5$___S_is_not_the_right_type_of_obj, top, $nl_trie_revisions$, ALIST_P);
            }
        }
        return stream;
    }

    public static SubLObject load_nl_trie_revisions(final SubLObject stream) {
        SubLObject top = cfasl_input(stream, NIL, $EOF);
        if ((top != $EOF) && top.isList()) {
            $nl_trie_revision_globals$.setGlobalValue(top);
        } else {
            Errors.warn($str5$___S_is_not_the_right_type_of_obj, top, $nl_trie_revision_globals$, LISTP);
        }
        top = cfasl_input(stream, NIL, $EOF);
        if ((top != $EOF) && (NIL != list_utilities.alist_p(top))) {
            $nl_trie_revisions$.setGlobalValue(top);
        } else {
            Errors.warn($str5$___S_is_not_the_right_type_of_obj, top, $nl_trie_revisions$, ALIST_P);
        }
        return stream;
    }

    public static final SubLObject dump_nl_trie_revisions_alt(SubLObject stream) {
        cfasl_output($nl_trie_revision_globals$.getGlobalValue(), stream);
        cfasl_output($nl_trie_revisions$.getGlobalValue(), stream);
        return stream;
    }

    public static SubLObject dump_nl_trie_revisions(final SubLObject stream) {
        cfasl_output($nl_trie_revision_globals$.getGlobalValue(), stream);
        cfasl_output($nl_trie_revisions$.getGlobalValue(), stream);
        return stream;
    }

    /**
     * Does it look like the trie needs to be reinitialized?
     */
    @LispMethod(comment = "Does it look like the trie needs to be reinitialized?")
    public static final SubLObject nl_trie_staleP_alt() {
        {
            SubLObject staleP = NIL;
            if (NIL != nl_trie.nl_trie_being_initializedP(UNPROVIDED)) {
                Errors.warn($str_alt9$NL_trie_is_currently_being_initia);
                return NIL;
            } else {
                if (NIL != com.cyc.cycjava.cycl.nl_trie_staleness_test.nl_trie_known_stale_p()) {
                    staleP = T;
                } else {
                    if (NIL == nl_trie.nl_trie_presentP(UNPROVIDED)) {
                        Errors.warn($str_alt10$NL_trie_not_present___);
                        staleP = T;
                    } else {
                        if (NIL != nl_trie.empty_nl_trieP(UNPROVIDED)) {
                            Errors.warn($str_alt11$NL_trie_empty___);
                            staleP = T;
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.nl_trie_staleness_test.nl_trie_revisions_staleP()) {
                                Errors.warn($str_alt12$NL_trie_built_with_stale_code__);
                                staleP = T;
                            } else {
                                if (NIL == com.cyc.cycjava.cycl.nl_trie_staleness_test.nl_trie_simple_string_retrievableP(UNPROVIDED)) {
                                    Errors.warn($str_alt13$NL_trie_simple_string_retrieval_f);
                                    staleP = T;
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != staleP) {
                com.cyc.cycjava.cycl.nl_trie_staleness_test.declare_nl_trie_known_stale();
            } else {
                com.cyc.cycjava.cycl.nl_trie_staleness_test.declare_nl_trie_not_known_stale();
            }
            return staleP;
        }
    }

    /**
     * Does it look like the trie needs to be reinitialized?
     */
    @LispMethod(comment = "Does it look like the trie needs to be reinitialized?")
    public static SubLObject nl_trie_staleP() {
        SubLObject staleP = NIL;
        if (NIL != nl_trie.nl_trie_being_initializedP(UNPROVIDED)) {
            Errors.warn($str9$NL_trie_is_currently_being_initia);
            return NIL;
        }
        if (NIL != nl_trie_known_stale_p()) {
            staleP = T;
        } else
            if (NIL == nl_trie.nl_trie_presentP(UNPROVIDED)) {
                Errors.warn($str10$NL_trie_not_present___);
                staleP = T;
            } else
                if (NIL != nl_trie.empty_nl_trieP(UNPROVIDED)) {
                    Errors.warn($str11$NL_trie_empty___);
                    staleP = T;
                } else
                    if (NIL != nl_trie_revisions_staleP()) {
                        Errors.warn($str12$NL_trie_built_with_stale_code__);
                        staleP = T;
                    } else
                        if (NIL == nl_trie_simple_string_retrievableP(UNPROVIDED)) {
                            Errors.warn($str13$NL_trie_simple_string_retrieval_f);
                            staleP = T;
                        }




        if (NIL != staleP) {
            declare_nl_trie_known_stale();
        } else {
            declare_nl_trie_not_known_stale();
        }
        return staleP;
    }

    public static final SubLObject nl_trie_revisions_staleP_internal_alt() {
        {
            SubLObject staleP = NIL;
            if (NIL != $nl_trie_revisions$.getGlobalValue()) {
                if (NIL == staleP) {
                    {
                        SubLObject csome_list_var = $nl_trie_revision_globals$.getGlobalValue();
                        SubLObject global = NIL;
                        for (global = csome_list_var.first(); !((NIL != staleP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , global = csome_list_var.first()) {
                            staleP = com.cyc.cycjava.cycl.nl_trie_staleness_test.nl_trie_revision_staleP(global, UNPROVIDED);
                        }
                    }
                }
            }
            return staleP;
        }
    }

    public static SubLObject nl_trie_revisions_staleP_internal() {
        SubLObject staleP = NIL;
        if ((NIL != $nl_trie_revisions$.getGlobalValue()) && (NIL == staleP)) {
            SubLObject csome_list_var;
            SubLObject global;
            for (csome_list_var = $nl_trie_revision_globals$.getGlobalValue(), global = NIL, global = csome_list_var.first(); (NIL == staleP) && (NIL != csome_list_var); staleP = nl_trie_revision_staleP(global, UNPROVIDED) , csome_list_var = csome_list_var.rest() , global = csome_list_var.first()) {
            }
        }
        return staleP;
    }

    public static final SubLObject nl_trie_revisions_staleP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.nl_trie_staleness_test.nl_trie_revisions_staleP_internal();
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym14$NL_TRIE_REVISIONS_STALE_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym14$NL_TRIE_REVISIONS_STALE_, ZERO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym14$NL_TRIE_REVISIONS_STALE_, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                    if (results == $kw15$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.nl_trie_staleness_test.nl_trie_revisions_staleP_internal()));
                        memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject nl_trie_revisions_staleP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return nl_trie_revisions_staleP_internal();
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym14$NL_TRIE_REVISIONS_STALE_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym14$NL_TRIE_REVISIONS_STALE_, ZERO_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym14$NL_TRIE_REVISIONS_STALE_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(nl_trie_revisions_staleP_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject nl_trie_unfinishedP_alt() {
        return makeBoolean(NIL == list_utilities.proper_list_p($nl_trie_revisions$.getGlobalValue()));
    }

    public static SubLObject nl_trie_unfinishedP() {
        return makeBoolean(NIL == list_utilities.proper_list_p($nl_trie_revisions$.getGlobalValue()));
    }

    /**
     * Explicitly declare that the current NL trie revisions should not be considered stale.
     */
    @LispMethod(comment = "Explicitly declare that the current NL trie revisions should not be considered stale.")
    public static final SubLObject declare_nl_trie_revisions_not_stale_alt() {
        com.cyc.cycjava.cycl.nl_trie_staleness_test.nl_trie_note_revisions();
        return $nl_trie_revisions$.getGlobalValue();
    }

    /**
     * Explicitly declare that the current NL trie revisions should not be considered stale.
     */
    @LispMethod(comment = "Explicitly declare that the current NL trie revisions should not be considered stale.")
    public static SubLObject declare_nl_trie_revisions_not_stale() {
        nl_trie_note_revisions();
        return $nl_trie_revisions$.getGlobalValue();
    }

    public static final SubLObject nl_trie_note_revisions_alt() {
        com.cyc.cycjava.cycl.nl_trie_staleness_test.nl_trie_clear_revisions();
        {
            SubLObject cdolist_list_var = $nl_trie_revision_globals$.getGlobalValue();
            SubLObject global = NIL;
            for (global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , global = cdolist_list_var.first()) {
                $nl_trie_revisions$.setGlobalValue(list_utilities.alist_enter($nl_trie_revisions$.getGlobalValue(), global, symbol_value(global), UNPROVIDED));
            }
        }
        com.cyc.cycjava.cycl.nl_trie_staleness_test.declare_nl_trie_staleness_unacceptable();
        return $nl_trie_revisions$.getGlobalValue();
    }

    public static SubLObject nl_trie_note_revisions() {
        nl_trie_clear_revisions();
        SubLObject cdolist_list_var = $nl_trie_revision_globals$.getGlobalValue();
        SubLObject global = NIL;
        global = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            $nl_trie_revisions$.setGlobalValue(list_utilities.alist_enter($nl_trie_revisions$.getGlobalValue(), global, symbol_value(global), UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            global = cdolist_list_var.first();
        } 
        declare_nl_trie_staleness_unacceptable();
        return $nl_trie_revisions$.getGlobalValue();
    }

    public static final SubLObject nl_trie_clear_revisions_alt() {
        $nl_trie_revisions$.setGlobalValue(NIL);
        return $nl_trie_revisions$.getGlobalValue();
    }

    public static SubLObject nl_trie_clear_revisions() {
        $nl_trie_revisions$.setGlobalValue(NIL);
        return $nl_trie_revisions$.getGlobalValue();
    }

    public static final SubLObject nl_trie_revision_staleP_alt(SubLObject global, SubLObject warnP) {
        if (warnP == UNPROVIDED) {
            warnP = T;
        }
        {
            SubLObject recorded_value = com.cyc.cycjava.cycl.nl_trie_staleness_test.nl_trie_revision_recorded_value(global);
            SubLObject current_value = symbol_value(global);
            SubLObject okP = lexicon_vars.lexicon_global_revision_noop_p(global, recorded_value, current_value);
            if (!((NIL != okP) || (NIL == warnP))) {
                Errors.warn($str_alt16$NL_trie_built_with_stale_version_, global);
            }
            return makeBoolean(NIL == okP);
        }
    }

    public static SubLObject nl_trie_revision_staleP(final SubLObject global, SubLObject warnP) {
        if (warnP == UNPROVIDED) {
            warnP = T;
        }
        final SubLObject recorded_value = nl_trie_revision_recorded_value(global);
        final SubLObject current_value = symbol_value(global);
        final SubLObject okP = lexicon_vars.lexicon_global_revision_noop_p(global, recorded_value, current_value);
        if ((NIL == okP) && (NIL != warnP)) {
            Errors.warn($str15$NL_trie_built_with_stale_version_, global);
        }
        return makeBoolean(NIL == okP);
    }

    public static final SubLObject nl_trie_revision_recorded_value_alt(SubLObject global) {
        return list_utilities.alist_lookup($nl_trie_revisions$.getGlobalValue(), global, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject nl_trie_revision_recorded_value(final SubLObject global) {
        return list_utilities.alist_lookup($nl_trie_revisions$.getGlobalValue(), global, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Find a simple string entry in the trie, and then see if we can retrieve it,
     * to make sure the input and output are still working.
     */
    @LispMethod(comment = "Find a simple string entry in the trie, and then see if we can retrieve it,\r\nto make sure the input and output are still working.\nFind a simple string entry in the trie, and then see if we can retrieve it,\nto make sure the input and output are still working.")
    public static final SubLObject nl_trie_simple_string_retrievableP_alt(SubLObject v_nl_trie) {
        if (v_nl_trie == UNPROVIDED) {
            v_nl_trie = nl_trie.get_nl_trie();
        }
        {
            SubLObject simple_entry = find_if($sym17$SINGLETON_, strie.strie_keys(v_nl_trie), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject simple_string = simple_entry.first();
            return list_utilities.proper_list_p(nl_trie.nl_trie_search(simple_string, UNPROVIDED, UNPROVIDED));
        }
    }

    @LispMethod(comment = "Find a simple string entry in the trie, and then see if we can retrieve it,\r\nto make sure the input and output are still working.\nFind a simple string entry in the trie, and then see if we can retrieve it,\nto make sure the input and output are still working.")
    public static SubLObject nl_trie_simple_string_retrievableP(SubLObject v_nl_trie) {
        if (v_nl_trie == UNPROVIDED) {
            v_nl_trie = nl_trie.get_nl_trie();
        }
        final SubLObject simple_entry = find_if($sym16$SINGLETON_, strie.strie_keys(v_nl_trie), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject simple_string = simple_entry.first();
        return list_utilities.proper_list_p(nl_trie.nl_trie_search(simple_string, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject declare_nl_trie_staleness_test_file() {
        declareFunction("nl_trie_known_stale_p", "NL-TRIE-KNOWN-STALE-P", 0, 0, false);
        declareFunction("declare_nl_trie_known_stale", "DECLARE-NL-TRIE-KNOWN-STALE", 0, 0, false);
        declareFunction("declare_nl_trie_not_known_stale", "DECLARE-NL-TRIE-NOT-KNOWN-STALE", 0, 0, false);
        declareFunction("declare_nl_trie_staleness_acceptable", "DECLARE-NL-TRIE-STALENESS-ACCEPTABLE", 0, 0, false);
        declareFunction("declare_nl_trie_staleness_unacceptable", "DECLARE-NL-TRIE-STALENESS-UNACCEPTABLE", 0, 0, false);
        declareFunction("nl_trie_staleness_acceptableP", "NL-TRIE-STALENESS-ACCEPTABLE?", 0, 0, false);
        declareFunction("load_nl_trie_revisions", "LOAD-NL-TRIE-REVISIONS", 1, 0, false);
        declareFunction("dump_nl_trie_revisions", "DUMP-NL-TRIE-REVISIONS", 1, 0, false);
        declareFunction("nl_trie_staleP", "NL-TRIE-STALE?", 0, 0, false);
        declareFunction("nl_trie_revisions_staleP_internal", "NL-TRIE-REVISIONS-STALE?-INTERNAL", 0, 0, false);
        declareFunction("nl_trie_revisions_staleP", "NL-TRIE-REVISIONS-STALE?", 0, 0, false);
        declareFunction("nl_trie_unfinishedP", "NL-TRIE-UNFINISHED?", 0, 0, false);
        declareFunction("declare_nl_trie_revisions_not_stale", "DECLARE-NL-TRIE-REVISIONS-NOT-STALE", 0, 0, false);
        declareFunction("nl_trie_note_revisions", "NL-TRIE-NOTE-REVISIONS", 0, 0, false);
        declareFunction("nl_trie_clear_revisions", "NL-TRIE-CLEAR-REVISIONS", 0, 0, false);
        declareFunction("nl_trie_revision_staleP", "NL-TRIE-REVISION-STALE?", 1, 1, false);
        declareFunction("nl_trie_revision_recorded_value", "NL-TRIE-REVISION-RECORDED-VALUE", 1, 0, false);
        declareFunction("nl_trie_simple_string_retrievableP", "NL-TRIE-SIMPLE-STRING-RETRIEVABLE?", 0, 1, false);
        return NIL;
    }

    public static final SubLObject init_nl_trie_staleness_test_file_alt() {
        deflexical("*NL-TRIE-REVISIONS*", NIL != boundp($nl_trie_revisions$) ? ((SubLObject) ($nl_trie_revisions$.getGlobalValue())) : NIL);
        deflexical("*NL-TRIE-STALENESS-ACCEPTABLE?*", NIL != boundp($nl_trie_staleness_acceptableP$) ? ((SubLObject) ($nl_trie_staleness_acceptableP$.getGlobalValue())) : T);
        deflexical("*NL-TRIE-KNOWN-STALE?*", NIL != boundp($nl_trie_known_staleP$) ? ((SubLObject) ($nl_trie_known_staleP$.getGlobalValue())) : NIL);
        deflexical("*NL-TRIE-REVISION-GLOBALS*", $list_alt3);
        return NIL;
    }

    public static SubLObject init_nl_trie_staleness_test_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*NL-TRIE-REVISIONS*", SubLTrampolineFile.maybeDefault($nl_trie_revisions$, $nl_trie_revisions$, NIL));
            deflexical("*NL-TRIE-STALENESS-ACCEPTABLE?*", SubLTrampolineFile.maybeDefault($nl_trie_staleness_acceptableP$, $nl_trie_staleness_acceptableP$, T));
            deflexical("*NL-TRIE-KNOWN-STALE?*", SubLTrampolineFile.maybeDefault($nl_trie_known_staleP$, $nl_trie_known_staleP$, NIL));
            deflexical("*NL-TRIE-REVISION-GLOBALS*", $list3);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*NL-TRIE-REVISIONS*", NIL != boundp($nl_trie_revisions$) ? ((SubLObject) ($nl_trie_revisions$.getGlobalValue())) : NIL);
            deflexical("*NL-TRIE-STALENESS-ACCEPTABLE?*", NIL != boundp($nl_trie_staleness_acceptableP$) ? ((SubLObject) ($nl_trie_staleness_acceptableP$.getGlobalValue())) : T);
            deflexical("*NL-TRIE-KNOWN-STALE?*", NIL != boundp($nl_trie_known_staleP$) ? ((SubLObject) ($nl_trie_known_staleP$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_nl_trie_staleness_test_file_Previous() {
        deflexical("*NL-TRIE-REVISIONS*", SubLTrampolineFile.maybeDefault($nl_trie_revisions$, $nl_trie_revisions$, NIL));
        deflexical("*NL-TRIE-STALENESS-ACCEPTABLE?*", SubLTrampolineFile.maybeDefault($nl_trie_staleness_acceptableP$, $nl_trie_staleness_acceptableP$, T));
        deflexical("*NL-TRIE-KNOWN-STALE?*", SubLTrampolineFile.maybeDefault($nl_trie_known_staleP$, $nl_trie_known_staleP$, NIL));
        deflexical("*NL-TRIE-REVISION-GLOBALS*", $list3);
        return NIL;
    }

    public static final SubLObject setup_nl_trie_staleness_test_file_alt() {
        declare_defglobal($nl_trie_revisions$);
        declare_defglobal($nl_trie_staleness_acceptableP$);
        declare_defglobal($nl_trie_known_staleP$);
        {
            SubLObject cdolist_list_var = $nl_trie_revision_globals$.getGlobalValue();
            SubLObject symbol = NIL;
            for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                register_kb_function(symbol);
            }
        }
        memoization_state.note_memoized_function($sym14$NL_TRIE_REVISIONS_STALE_);
        return NIL;
    }

    public static SubLObject setup_nl_trie_staleness_test_file() {
        if (SubLFiles.USE_V1) {
            declare_defglobal($nl_trie_revisions$);
            declare_defglobal($nl_trie_staleness_acceptableP$);
            declare_defglobal($nl_trie_known_staleP$);
            SubLObject cdolist_list_var = $nl_trie_revision_globals$.getGlobalValue();
            SubLObject symbol = NIL;
            symbol = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                register_kb_function(symbol);
                cdolist_list_var = cdolist_list_var.rest();
                symbol = cdolist_list_var.first();
            } 
            memoization_state.note_memoized_function($sym14$NL_TRIE_REVISIONS_STALE_);
        }
        if (SubLFiles.USE_V2) {
            {
                SubLObject cdolist_list_var = $nl_trie_revision_globals$.getGlobalValue();
                SubLObject symbol = NIL;
                for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                    register_kb_function(symbol);
                }
            }
        }
        return NIL;
    }

    public static SubLObject setup_nl_trie_staleness_test_file_Previous() {
        declare_defglobal($nl_trie_revisions$);
        declare_defglobal($nl_trie_staleness_acceptableP$);
        declare_defglobal($nl_trie_known_staleP$);
        SubLObject cdolist_list_var = $nl_trie_revision_globals$.getGlobalValue();
        SubLObject symbol = NIL;
        symbol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            register_kb_function(symbol);
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        } 
        memoization_state.note_memoized_function($sym14$NL_TRIE_REVISIONS_STALE_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_nl_trie_staleness_test_file();
    }

    @Override
    public void initializeVariables() {
        init_nl_trie_staleness_test_file();
    }

    static private final SubLList $list_alt3 = list(makeSymbol("*NL-TRIE-CODE-REVISION*"), makeSymbol("*MORPHOLOGY-CODE-REVISION*"), makeSymbol("*LEXICON-CACHE-CODE-REVISION*"));

    @Override
    public void runTopLevelForms() {
        setup_nl_trie_staleness_test_file();
    }

    static private final SubLString $str_alt5$___S_is_not_the_right_type_of_obj = makeString("~&~S is not the right type of object for ~S (expected a ~S).");

    

    static private final SubLString $str_alt9$NL_trie_is_currently_being_initia = makeString("NL trie is currently being initialized.");

    static private final SubLString $str_alt10$NL_trie_not_present___ = makeString("NL trie not present.~%");

    static private final SubLString $str_alt11$NL_trie_empty___ = makeString("NL trie empty.~%");

    static private final SubLString $str_alt12$NL_trie_built_with_stale_code__ = makeString("NL trie built with stale code~%");

    static private final SubLString $str_alt13$NL_trie_simple_string_retrieval_f = makeString("NL trie simple string retrieval failed.~%");

    public static final SubLSymbol $kw15$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt16$NL_trie_built_with_stale_version_ = makeString("NL trie built with stale version of ~S~%");

    static private final SubLSymbol $sym17$SINGLETON_ = makeSymbol("SINGLETON?");
}

/**
 * Total time: 91 ms
 */
