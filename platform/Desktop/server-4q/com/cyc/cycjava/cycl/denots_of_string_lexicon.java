package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class denots_of_string_lexicon extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.denots_of_string_lexicon";
    public static final String myFingerPrint = "aa0d0a70de10a580ca916bc4f60653a6c49a9be8f60281722e9c5d7e89482dbb";
    private static final SubLSymbol $sym0$LEXICON_FOR_DENOTS_OF_STRING;
    private static final SubLSymbol $kw1$DENOT;
    private static final SubLSymbol $sym2$SET_CASE_SENSITIVITY;
    private static final SubLSymbol $sym3$CONVERT_TO_EL_;
    private static final SubLSymbol $sym4$DEFAULT_EXCLUDE_MTS;
    private static final SubLSymbol $sym5$SET_BASE_MT;
    private static final SubLSymbol $sym6$INITIALIZE_ALLOWED_MTS;
    private static final SubLSymbol $sym7$ALLOW_MT;
    private static final SubLObject $const8$CommonEnglishMisspellingsMt;
    private static final SubLSymbol $sym9$FORBID_MT;
    private static final SubLSymbol $sym10$INITIALIZE_EXCLUDED_PREDS;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$EXCLUDE_PREDICATE;
    private static final SubLSymbol $kw13$ACRONYMS;
    private static final SubLSymbol $kw14$ABBREVS;
    private static final SubLSymbol $kw15$ANY;
    private static final SubLSymbol $sym16$ALLOW_PREDICATE;
    private static final SubLSymbol $sym17$GET;
    private static final SubLSymbol $kw18$PREDICATE;
    private static final SubLSymbol $kw19$INFLECTIONS;
    
    @SubLTranslatedFile.SubL(source = "cycl/denots-of-string-lexicon.lisp", position = 897L)
    public static SubLObject lexicon_for_denots_of_string_internal(SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject skip_namestringsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (abbrev_types == denots_of_string_lexicon.UNPROVIDED) {
            abbrev_types = (SubLObject)denots_of_string_lexicon.NIL;
        }
        if (denot_type == denots_of_string_lexicon.UNPROVIDED) {
            denot_type = (SubLObject)denots_of_string_lexicon.$kw1$DENOT;
        }
        if (misspellingsP == denots_of_string_lexicon.UNPROVIDED) {
            misspellingsP = (SubLObject)denots_of_string_lexicon.T;
        }
        if (skip_namestringsP == denots_of_string_lexicon.UNPROVIDED) {
            skip_namestringsP = (SubLObject)denots_of_string_lexicon.NIL;
        }
        if (lookup_mt == denots_of_string_lexicon.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == denots_of_string_lexicon.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lexicon = term_lexicon.new_term_lexicon();
        methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)denots_of_string_lexicon.$sym2$SET_CASE_SENSITIVITY, case_sensitivity);
        instances.set_slot(lexicon, (SubLObject)denots_of_string_lexicon.$sym3$CONVERT_TO_EL_, (SubLObject)denots_of_string_lexicon.NIL);
        instances.set_slot(lexicon, (SubLObject)denots_of_string_lexicon.$sym4$DEFAULT_EXCLUDE_MTS, (SubLObject)denots_of_string_lexicon.NIL);
        methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)denots_of_string_lexicon.$sym5$SET_BASE_MT, lookup_mt);
        methods.funcall_instance_method_with_0_args(lexicon, (SubLObject)denots_of_string_lexicon.$sym6$INITIALIZE_ALLOWED_MTS);
        if (denots_of_string_lexicon.NIL != misspellingsP) {
            methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)denots_of_string_lexicon.$sym7$ALLOW_MT, denots_of_string_lexicon.$const8$CommonEnglishMisspellingsMt);
        }
        else {
            methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)denots_of_string_lexicon.$sym9$FORBID_MT, denots_of_string_lexicon.$const8$CommonEnglishMisspellingsMt);
        }
        methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)denots_of_string_lexicon.$sym10$INITIALIZE_EXCLUDED_PREDS, (SubLObject)denots_of_string_lexicon.NIL);
        if (denots_of_string_lexicon.NIL != skip_namestringsP) {
            SubLObject iterator = map_utilities.new_map_iterator(lexicon_vars.name_string_preds_set((SubLObject)denots_of_string_lexicon.UNPROVIDED));
            SubLObject valid;
            for (SubLObject done_var = (SubLObject)denots_of_string_lexicon.NIL; denots_of_string_lexicon.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(denots_of_string_lexicon.NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (denots_of_string_lexicon.NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject pred = (SubLObject)denots_of_string_lexicon.NIL;
                    SubLObject value = (SubLObject)denots_of_string_lexicon.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)denots_of_string_lexicon.$list11);
                    pred = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)denots_of_string_lexicon.$list11);
                    value = current.first();
                    current = current.rest();
                    if (denots_of_string_lexicon.NIL == current) {
                        methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)denots_of_string_lexicon.$sym12$EXCLUDE_PREDICATE, pred);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)denots_of_string_lexicon.$list11);
                    }
                }
            }
            iterator = map_utilities.new_map_iterator(lexicon_vars.term_strings_preds_set((SubLObject)denots_of_string_lexicon.UNPROVIDED));
            for (SubLObject done_var = (SubLObject)denots_of_string_lexicon.NIL; denots_of_string_lexicon.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(denots_of_string_lexicon.NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (denots_of_string_lexicon.NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject pred = (SubLObject)denots_of_string_lexicon.NIL;
                    SubLObject value = (SubLObject)denots_of_string_lexicon.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)denots_of_string_lexicon.$list11);
                    pred = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)denots_of_string_lexicon.$list11);
                    value = current.first();
                    current = current.rest();
                    if (denots_of_string_lexicon.NIL == current) {
                        methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)denots_of_string_lexicon.$sym12$EXCLUDE_PREDICATE, pred);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)denots_of_string_lexicon.$list11);
                    }
                }
            }
        }
        if (denots_of_string_lexicon.NIL == subl_promotions.memberP((SubLObject)denots_of_string_lexicon.$kw13$ACRONYMS, abbrev_types, (SubLObject)denots_of_string_lexicon.UNPROVIDED, (SubLObject)denots_of_string_lexicon.UNPROVIDED)) {
            SubLObject cdolist_list_var = lexicon_vars.acronym_predicates();
            SubLObject pred2 = (SubLObject)denots_of_string_lexicon.NIL;
            pred2 = cdolist_list_var.first();
            while (denots_of_string_lexicon.NIL != cdolist_list_var) {
                methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)denots_of_string_lexicon.$sym12$EXCLUDE_PREDICATE, pred2);
                cdolist_list_var = cdolist_list_var.rest();
                pred2 = cdolist_list_var.first();
            }
        }
        if (denots_of_string_lexicon.NIL == subl_promotions.memberP((SubLObject)denots_of_string_lexicon.$kw14$ABBREVS, abbrev_types, (SubLObject)denots_of_string_lexicon.UNPROVIDED, (SubLObject)denots_of_string_lexicon.UNPROVIDED)) {
            SubLObject cdolist_list_var = lexicon_vars.abbreviation_predicates();
            SubLObject pred2 = (SubLObject)denots_of_string_lexicon.NIL;
            pred2 = cdolist_list_var.first();
            while (denots_of_string_lexicon.NIL != cdolist_list_var) {
                methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)denots_of_string_lexicon.$sym12$EXCLUDE_PREDICATE, pred2);
                cdolist_list_var = cdolist_list_var.rest();
                pred2 = cdolist_list_var.first();
            }
        }
        SubLObject cdolist_list_var = lexicon_accessors.determine_denotation_preds((SubLObject)denots_of_string_lexicon.$kw15$ANY);
        SubLObject denotation_pred = (SubLObject)denots_of_string_lexicon.NIL;
        denotation_pred = cdolist_list_var.first();
        while (denots_of_string_lexicon.NIL != cdolist_list_var) {
            methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)denots_of_string_lexicon.$sym12$EXCLUDE_PREDICATE, denotation_pred);
            cdolist_list_var = cdolist_list_var.rest();
            denotation_pred = cdolist_list_var.first();
        }
        cdolist_list_var = lexicon_accessors.determine_denotation_preds(denot_type);
        denotation_pred = (SubLObject)denots_of_string_lexicon.NIL;
        denotation_pred = cdolist_list_var.first();
        while (denots_of_string_lexicon.NIL != cdolist_list_var) {
            methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)denots_of_string_lexicon.$sym16$ALLOW_PREDICATE, denotation_pred);
            cdolist_list_var = cdolist_list_var.rest();
            denotation_pred = cdolist_list_var.first();
        }
        return lexicon;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/denots-of-string-lexicon.lisp", position = 897L)
    public static SubLObject lexicon_for_denots_of_string(SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject skip_namestringsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (abbrev_types == denots_of_string_lexicon.UNPROVIDED) {
            abbrev_types = (SubLObject)denots_of_string_lexicon.NIL;
        }
        if (denot_type == denots_of_string_lexicon.UNPROVIDED) {
            denot_type = (SubLObject)denots_of_string_lexicon.$kw1$DENOT;
        }
        if (misspellingsP == denots_of_string_lexicon.UNPROVIDED) {
            misspellingsP = (SubLObject)denots_of_string_lexicon.T;
        }
        if (skip_namestringsP == denots_of_string_lexicon.UNPROVIDED) {
            skip_namestringsP = (SubLObject)denots_of_string_lexicon.NIL;
        }
        if (lookup_mt == denots_of_string_lexicon.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == denots_of_string_lexicon.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)denots_of_string_lexicon.NIL;
        if (denots_of_string_lexicon.NIL == v_memoization_state) {
            return lexicon_for_denots_of_string_internal(abbrev_types, denot_type, misspellingsP, skip_namestringsP, lookup_mt, case_sensitivity);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)denots_of_string_lexicon.$sym0$LEXICON_FOR_DENOTS_OF_STRING, (SubLObject)denots_of_string_lexicon.UNPROVIDED);
        if (denots_of_string_lexicon.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)denots_of_string_lexicon.$sym0$LEXICON_FOR_DENOTS_OF_STRING, (SubLObject)denots_of_string_lexicon.SIX_INTEGER, (SubLObject)denots_of_string_lexicon.NIL, (SubLObject)denots_of_string_lexicon.EQUAL, (SubLObject)denots_of_string_lexicon.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)denots_of_string_lexicon.$sym0$LEXICON_FOR_DENOTS_OF_STRING, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(abbrev_types, denot_type, misspellingsP, skip_namestringsP, lookup_mt, case_sensitivity);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)denots_of_string_lexicon.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)denots_of_string_lexicon.NIL;
            collision = cdolist_list_var.first();
            while (denots_of_string_lexicon.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (abbrev_types.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (denot_type.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (misspellingsP.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (skip_namestringsP.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (lookup_mt.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (denots_of_string_lexicon.NIL != cached_args && denots_of_string_lexicon.NIL == cached_args.rest() && case_sensitivity.equal(cached_args.first())) {
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
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(lexicon_for_denots_of_string_internal(abbrev_types, denot_type, misspellingsP, skip_namestringsP, lookup_mt, case_sensitivity)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(abbrev_types, denot_type, misspellingsP, skip_namestringsP, lookup_mt, case_sensitivity));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/denots-of-string-lexicon.lisp", position = 2987L)
    public static SubLObject lexicon_denots_of_string(final SubLObject string, final SubLObject lexicon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denots = (SubLObject)denots_of_string_lexicon.NIL;
        SubLObject pred_lists = (SubLObject)denots_of_string_lexicon.NIL;
        final SubLObject results_dictionary = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)denots_of_string_lexicon.EQUAL), (SubLObject)denots_of_string_lexicon.UNPROVIDED);
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)denots_of_string_lexicon.$sym17$GET, string);
        SubLObject lex_entry = (SubLObject)denots_of_string_lexicon.NIL;
        lex_entry = cdolist_list_var.first();
        while (denots_of_string_lexicon.NIL != cdolist_list_var) {
            final SubLObject denot = methods.funcall_instance_method_with_1_args(lex_entry, (SubLObject)denots_of_string_lexicon.$sym17$GET, (SubLObject)denots_of_string_lexicon.$kw1$DENOT);
            if (denots_of_string_lexicon.NIL != denot) {
                final SubLObject predicate = methods.funcall_instance_method_with_1_args(lex_entry, (SubLObject)denots_of_string_lexicon.$sym17$GET, (SubLObject)denots_of_string_lexicon.$kw18$PREDICATE);
                if (denots_of_string_lexicon.NIL != lexicon_vars.name_string_predP(predicate) || denots_of_string_lexicon.NIL != lexicon_vars.term_strings_predP(predicate)) {
                    dictionary_utilities.dictionary_pushnew(results_dictionary, denot, predicate, (SubLObject)denots_of_string_lexicon.UNPROVIDED, (SubLObject)denots_of_string_lexicon.UNPROVIDED);
                }
                else {
                    SubLObject cdolist_list_var_$1 = methods.funcall_instance_method_with_1_args(lex_entry, (SubLObject)denots_of_string_lexicon.$sym17$GET, (SubLObject)denots_of_string_lexicon.$kw19$INFLECTIONS);
                    SubLObject pred = (SubLObject)denots_of_string_lexicon.NIL;
                    pred = cdolist_list_var_$1.first();
                    while (denots_of_string_lexicon.NIL != cdolist_list_var_$1) {
                        dictionary_utilities.dictionary_pushnew(results_dictionary, denot, pred, (SubLObject)denots_of_string_lexicon.UNPROVIDED, (SubLObject)denots_of_string_lexicon.UNPROVIDED);
                        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                        pred = cdolist_list_var_$1.first();
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            lex_entry = cdolist_list_var.first();
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(results_dictionary)); denots_of_string_lexicon.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject denot2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject preds = thread.secondMultipleValue();
            thread.resetMultipleValues();
            denots = (SubLObject)ConsesLow.cons(denot2, denots);
            pred_lists = (SubLObject)ConsesLow.cons(preds, pred_lists);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return Values.values(denots, pred_lists);
    }
    
    public static SubLObject declare_denots_of_string_lexicon_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.denots_of_string_lexicon", "lexicon_for_denots_of_string_internal", "LEXICON-FOR-DENOTS-OF-STRING-INTERNAL", 0, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.denots_of_string_lexicon", "lexicon_for_denots_of_string", "LEXICON-FOR-DENOTS-OF-STRING", 0, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.denots_of_string_lexicon", "lexicon_denots_of_string", "LEXICON-DENOTS-OF-STRING", 2, 0, false);
        return (SubLObject)denots_of_string_lexicon.NIL;
    }
    
    public static SubLObject init_denots_of_string_lexicon_file() {
        return (SubLObject)denots_of_string_lexicon.NIL;
    }
    
    public static SubLObject setup_denots_of_string_lexicon_file() {
        memoization_state.note_memoized_function((SubLObject)denots_of_string_lexicon.$sym0$LEXICON_FOR_DENOTS_OF_STRING);
        return (SubLObject)denots_of_string_lexicon.NIL;
    }
    
    public void declareFunctions() {
        declare_denots_of_string_lexicon_file();
    }
    
    public void initializeVariables() {
        init_denots_of_string_lexicon_file();
    }
    
    public void runTopLevelForms() {
        setup_denots_of_string_lexicon_file();
    }
    
    static {
        me = (SubLFile)new denots_of_string_lexicon();
        $sym0$LEXICON_FOR_DENOTS_OF_STRING = SubLObjectFactory.makeSymbol("LEXICON-FOR-DENOTS-OF-STRING");
        $kw1$DENOT = SubLObjectFactory.makeKeyword("DENOT");
        $sym2$SET_CASE_SENSITIVITY = SubLObjectFactory.makeSymbol("SET-CASE-SENSITIVITY");
        $sym3$CONVERT_TO_EL_ = SubLObjectFactory.makeSymbol("CONVERT-TO-EL?");
        $sym4$DEFAULT_EXCLUDE_MTS = SubLObjectFactory.makeSymbol("DEFAULT-EXCLUDE-MTS");
        $sym5$SET_BASE_MT = SubLObjectFactory.makeSymbol("SET-BASE-MT");
        $sym6$INITIALIZE_ALLOWED_MTS = SubLObjectFactory.makeSymbol("INITIALIZE-ALLOWED-MTS");
        $sym7$ALLOW_MT = SubLObjectFactory.makeSymbol("ALLOW-MT");
        $const8$CommonEnglishMisspellingsMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CommonEnglishMisspellingsMt"));
        $sym9$FORBID_MT = SubLObjectFactory.makeSymbol("FORBID-MT");
        $sym10$INITIALIZE_EXCLUDED_PREDS = SubLObjectFactory.makeSymbol("INITIALIZE-EXCLUDED-PREDS");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $sym12$EXCLUDE_PREDICATE = SubLObjectFactory.makeSymbol("EXCLUDE-PREDICATE");
        $kw13$ACRONYMS = SubLObjectFactory.makeKeyword("ACRONYMS");
        $kw14$ABBREVS = SubLObjectFactory.makeKeyword("ABBREVS");
        $kw15$ANY = SubLObjectFactory.makeKeyword("ANY");
        $sym16$ALLOW_PREDICATE = SubLObjectFactory.makeSymbol("ALLOW-PREDICATE");
        $sym17$GET = SubLObjectFactory.makeSymbol("GET");
        $kw18$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $kw19$INFLECTIONS = SubLObjectFactory.makeKeyword("INFLECTIONS");
    }
}

/*

	Total time: 117 ms
	
*/