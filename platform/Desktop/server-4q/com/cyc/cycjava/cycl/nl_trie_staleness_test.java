package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class nl_trie_staleness_test extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.nl_trie_staleness_test";
    public static final String myFingerPrint = "484b3508257abd2841389a78690a26ea709306f472438175a5f3afa48609f03e";
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-staleness-test.lisp", position = 872L)
    private static SubLSymbol $nl_trie_revisions$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-staleness-test.lisp", position = 1037L)
    private static SubLSymbol $nl_trie_staleness_acceptableP$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-staleness-test.lisp", position = 1263L)
    private static SubLSymbol $nl_trie_known_staleP$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-staleness-test.lisp", position = 2012L)
    private static SubLSymbol $nl_trie_revision_globals$;
    private static final SubLSymbol $sym0$_NL_TRIE_REVISIONS_;
    private static final SubLSymbol $sym1$_NL_TRIE_STALENESS_ACCEPTABLE__;
    private static final SubLSymbol $sym2$_NL_TRIE_KNOWN_STALE__;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$EOF;
    private static final SubLString $str5$___S_is_not_the_right_type_of_obj;
    private static final SubLSymbol $sym6$_NL_TRIE_REVISION_GLOBALS_;
    private static final SubLSymbol $sym7$LISTP;
    private static final SubLSymbol $sym8$ALIST_P;
    private static final SubLString $str9$NL_trie_is_currently_being_initia;
    private static final SubLString $str10$NL_trie_not_present___;
    private static final SubLString $str11$NL_trie_empty___;
    private static final SubLString $str12$NL_trie_built_with_stale_code__;
    private static final SubLString $str13$NL_trie_simple_string_retrieval_f;
    private static final SubLSymbol $sym14$NL_TRIE_REVISIONS_STALE_;
    private static final SubLString $str15$NL_trie_built_with_stale_version_;
    private static final SubLSymbol $sym16$SINGLETON_;
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-staleness-test.lisp", position = 1311L)
    public static SubLObject nl_trie_known_stale_p() {
        return nl_trie_staleness_test.$nl_trie_known_staleP$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-staleness-test.lisp", position = 1387L)
    public static SubLObject declare_nl_trie_known_stale() {
        nl_trie_staleness_test.$nl_trie_known_staleP$.setGlobalValue((SubLObject)nl_trie_staleness_test.T);
        return nl_trie_staleness_test.$nl_trie_known_staleP$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-staleness-test.lisp", position = 1504L)
    public static SubLObject declare_nl_trie_not_known_stale() {
        nl_trie_staleness_test.$nl_trie_known_staleP$.setGlobalValue((SubLObject)nl_trie_staleness_test.NIL);
        return nl_trie_staleness_test.$nl_trie_known_staleP$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-staleness-test.lisp", position = 1627L)
    public static SubLObject declare_nl_trie_staleness_acceptable() {
        nl_trie_staleness_test.$nl_trie_staleness_acceptableP$.setGlobalValue((SubLObject)nl_trie_staleness_test.T);
        return nl_trie_staleness_test.$nl_trie_staleness_acceptableP$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-staleness-test.lisp", position = 1771L)
    public static SubLObject declare_nl_trie_staleness_unacceptable() {
        nl_trie_staleness_test.$nl_trie_staleness_acceptableP$.setGlobalValue((SubLObject)nl_trie_staleness_test.NIL);
        return nl_trie_staleness_test.$nl_trie_staleness_acceptableP$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-staleness-test.lisp", position = 1919L)
    public static SubLObject nl_trie_staleness_acceptableP() {
        return nl_trie_staleness_test.$nl_trie_staleness_acceptableP$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-staleness-test.lisp", position = 2315L)
    public static SubLObject load_nl_trie_revisions(final SubLObject stream) {
        SubLObject top = cfasl.cfasl_input(stream, (SubLObject)nl_trie_staleness_test.NIL, (SubLObject)nl_trie_staleness_test.$kw4$EOF);
        if (top != nl_trie_staleness_test.$kw4$EOF && top.isList()) {
            nl_trie_staleness_test.$nl_trie_revision_globals$.setGlobalValue(top);
        }
        else {
            Errors.warn((SubLObject)nl_trie_staleness_test.$str5$___S_is_not_the_right_type_of_obj, top, (SubLObject)nl_trie_staleness_test.$sym6$_NL_TRIE_REVISION_GLOBALS_, (SubLObject)nl_trie_staleness_test.$sym7$LISTP);
        }
        top = cfasl.cfasl_input(stream, (SubLObject)nl_trie_staleness_test.NIL, (SubLObject)nl_trie_staleness_test.$kw4$EOF);
        if (top != nl_trie_staleness_test.$kw4$EOF && nl_trie_staleness_test.NIL != list_utilities.alist_p(top)) {
            nl_trie_staleness_test.$nl_trie_revisions$.setGlobalValue(top);
        }
        else {
            Errors.warn((SubLObject)nl_trie_staleness_test.$str5$___S_is_not_the_right_type_of_obj, top, (SubLObject)nl_trie_staleness_test.$sym0$_NL_TRIE_REVISIONS_, (SubLObject)nl_trie_staleness_test.$sym8$ALIST_P);
        }
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-staleness-test.lisp", position = 2525L)
    public static SubLObject dump_nl_trie_revisions(final SubLObject stream) {
        cfasl.cfasl_output(nl_trie_staleness_test.$nl_trie_revision_globals$.getGlobalValue(), stream);
        cfasl.cfasl_output(nl_trie_staleness_test.$nl_trie_revisions$.getGlobalValue(), stream);
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-staleness-test.lisp", position = 2687L)
    public static SubLObject nl_trie_staleP() {
        SubLObject staleP = (SubLObject)nl_trie_staleness_test.NIL;
        if (nl_trie_staleness_test.NIL != nl_trie.nl_trie_being_initializedP((SubLObject)nl_trie_staleness_test.UNPROVIDED)) {
            Errors.warn((SubLObject)nl_trie_staleness_test.$str9$NL_trie_is_currently_being_initia);
            return (SubLObject)nl_trie_staleness_test.NIL;
        }
        if (nl_trie_staleness_test.NIL != nl_trie_known_stale_p()) {
            staleP = (SubLObject)nl_trie_staleness_test.T;
        }
        else if (nl_trie_staleness_test.NIL == nl_trie.nl_trie_presentP((SubLObject)nl_trie_staleness_test.UNPROVIDED)) {
            Errors.warn((SubLObject)nl_trie_staleness_test.$str10$NL_trie_not_present___);
            staleP = (SubLObject)nl_trie_staleness_test.T;
        }
        else if (nl_trie_staleness_test.NIL != nl_trie.empty_nl_trieP((SubLObject)nl_trie_staleness_test.UNPROVIDED)) {
            Errors.warn((SubLObject)nl_trie_staleness_test.$str11$NL_trie_empty___);
            staleP = (SubLObject)nl_trie_staleness_test.T;
        }
        else if (nl_trie_staleness_test.NIL != nl_trie_revisions_staleP()) {
            Errors.warn((SubLObject)nl_trie_staleness_test.$str12$NL_trie_built_with_stale_code__);
            staleP = (SubLObject)nl_trie_staleness_test.T;
        }
        else if (nl_trie_staleness_test.NIL == nl_trie_simple_string_retrievableP((SubLObject)nl_trie_staleness_test.UNPROVIDED)) {
            Errors.warn((SubLObject)nl_trie_staleness_test.$str13$NL_trie_simple_string_retrieval_f);
            staleP = (SubLObject)nl_trie_staleness_test.T;
        }
        if (nl_trie_staleness_test.NIL != staleP) {
            declare_nl_trie_known_stale();
        }
        else {
            declare_nl_trie_not_known_stale();
        }
        return staleP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-staleness-test.lisp", position = 3622L)
    public static SubLObject nl_trie_revisions_staleP_internal() {
        SubLObject staleP = (SubLObject)nl_trie_staleness_test.NIL;
        if (nl_trie_staleness_test.NIL != nl_trie_staleness_test.$nl_trie_revisions$.getGlobalValue() && nl_trie_staleness_test.NIL == staleP) {
            SubLObject csome_list_var;
            SubLObject global;
            for (csome_list_var = nl_trie_staleness_test.$nl_trie_revision_globals$.getGlobalValue(), global = (SubLObject)nl_trie_staleness_test.NIL, global = csome_list_var.first(); nl_trie_staleness_test.NIL == staleP && nl_trie_staleness_test.NIL != csome_list_var; staleP = nl_trie_revision_staleP(global, (SubLObject)nl_trie_staleness_test.UNPROVIDED), csome_list_var = csome_list_var.rest(), global = csome_list_var.first()) {}
        }
        return staleP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-staleness-test.lisp", position = 3622L)
    public static SubLObject nl_trie_revisions_staleP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)nl_trie_staleness_test.NIL;
        if (nl_trie_staleness_test.NIL == v_memoization_state) {
            return nl_trie_revisions_staleP_internal();
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)nl_trie_staleness_test.$sym14$NL_TRIE_REVISIONS_STALE_, (SubLObject)nl_trie_staleness_test.UNPROVIDED);
        if (nl_trie_staleness_test.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)nl_trie_staleness_test.$sym14$NL_TRIE_REVISIONS_STALE_, (SubLObject)nl_trie_staleness_test.ZERO_INTEGER, (SubLObject)nl_trie_staleness_test.NIL, (SubLObject)nl_trie_staleness_test.EQ, (SubLObject)nl_trie_staleness_test.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)nl_trie_staleness_test.$sym14$NL_TRIE_REVISIONS_STALE_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)nl_trie_staleness_test.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(nl_trie_revisions_staleP_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)nl_trie_staleness_test.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-staleness-test.lisp", position = 3858L)
    public static SubLObject nl_trie_unfinishedP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie_staleness_test.NIL == list_utilities.proper_list_p(nl_trie_staleness_test.$nl_trie_revisions$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-staleness-test.lisp", position = 3952L)
    public static SubLObject declare_nl_trie_revisions_not_stale() {
        nl_trie_note_revisions();
        return nl_trie_staleness_test.$nl_trie_revisions$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-staleness-test.lisp", position = 4246L)
    public static SubLObject nl_trie_note_revisions() {
        nl_trie_clear_revisions();
        SubLObject cdolist_list_var = nl_trie_staleness_test.$nl_trie_revision_globals$.getGlobalValue();
        SubLObject global = (SubLObject)nl_trie_staleness_test.NIL;
        global = cdolist_list_var.first();
        while (nl_trie_staleness_test.NIL != cdolist_list_var) {
            nl_trie_staleness_test.$nl_trie_revisions$.setGlobalValue(list_utilities.alist_enter(nl_trie_staleness_test.$nl_trie_revisions$.getGlobalValue(), global, Symbols.symbol_value(global), (SubLObject)nl_trie_staleness_test.UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            global = cdolist_list_var.first();
        }
        declare_nl_trie_staleness_unacceptable();
        return nl_trie_staleness_test.$nl_trie_revisions$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-staleness-test.lisp", position = 4538L)
    public static SubLObject nl_trie_clear_revisions() {
        nl_trie_staleness_test.$nl_trie_revisions$.setGlobalValue((SubLObject)nl_trie_staleness_test.NIL);
        return nl_trie_staleness_test.$nl_trie_revisions$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-staleness-test.lisp", position = 4646L)
    public static SubLObject nl_trie_revision_staleP(final SubLObject global, SubLObject warnP) {
        if (warnP == nl_trie_staleness_test.UNPROVIDED) {
            warnP = (SubLObject)nl_trie_staleness_test.T;
        }
        final SubLObject recorded_value = nl_trie_revision_recorded_value(global);
        final SubLObject current_value = Symbols.symbol_value(global);
        final SubLObject okP = lexicon_vars.lexicon_global_revision_noop_p(global, recorded_value, current_value);
        if (nl_trie_staleness_test.NIL == okP && nl_trie_staleness_test.NIL != warnP) {
            Errors.warn((SubLObject)nl_trie_staleness_test.$str15$NL_trie_built_with_stale_version_, global);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie_staleness_test.NIL == okP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-staleness-test.lisp", position = 5024L)
    public static SubLObject nl_trie_revision_recorded_value(final SubLObject global) {
        return list_utilities.alist_lookup(nl_trie_staleness_test.$nl_trie_revisions$.getGlobalValue(), global, (SubLObject)nl_trie_staleness_test.UNPROVIDED, (SubLObject)nl_trie_staleness_test.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-staleness-test.lisp", position = 5135L)
    public static SubLObject nl_trie_simple_string_retrievableP(SubLObject v_nl_trie) {
        if (v_nl_trie == nl_trie_staleness_test.UNPROVIDED) {
            v_nl_trie = nl_trie.get_nl_trie();
        }
        final SubLObject simple_entry = Sequences.find_if((SubLObject)nl_trie_staleness_test.$sym16$SINGLETON_, strie.strie_keys(v_nl_trie), (SubLObject)nl_trie_staleness_test.UNPROVIDED, (SubLObject)nl_trie_staleness_test.UNPROVIDED, (SubLObject)nl_trie_staleness_test.UNPROVIDED);
        final SubLObject simple_string = simple_entry.first();
        return list_utilities.proper_list_p(nl_trie.nl_trie_search(simple_string, (SubLObject)nl_trie_staleness_test.UNPROVIDED, (SubLObject)nl_trie_staleness_test.UNPROVIDED));
    }
    
    public static SubLObject declare_nl_trie_staleness_test_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_staleness_test", "nl_trie_known_stale_p", "NL-TRIE-KNOWN-STALE-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_staleness_test", "declare_nl_trie_known_stale", "DECLARE-NL-TRIE-KNOWN-STALE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_staleness_test", "declare_nl_trie_not_known_stale", "DECLARE-NL-TRIE-NOT-KNOWN-STALE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_staleness_test", "declare_nl_trie_staleness_acceptable", "DECLARE-NL-TRIE-STALENESS-ACCEPTABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_staleness_test", "declare_nl_trie_staleness_unacceptable", "DECLARE-NL-TRIE-STALENESS-UNACCEPTABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_staleness_test", "nl_trie_staleness_acceptableP", "NL-TRIE-STALENESS-ACCEPTABLE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_staleness_test", "load_nl_trie_revisions", "LOAD-NL-TRIE-REVISIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_staleness_test", "dump_nl_trie_revisions", "DUMP-NL-TRIE-REVISIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_staleness_test", "nl_trie_staleP", "NL-TRIE-STALE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_staleness_test", "nl_trie_revisions_staleP_internal", "NL-TRIE-REVISIONS-STALE?-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_staleness_test", "nl_trie_revisions_staleP", "NL-TRIE-REVISIONS-STALE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_staleness_test", "nl_trie_unfinishedP", "NL-TRIE-UNFINISHED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_staleness_test", "declare_nl_trie_revisions_not_stale", "DECLARE-NL-TRIE-REVISIONS-NOT-STALE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_staleness_test", "nl_trie_note_revisions", "NL-TRIE-NOTE-REVISIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_staleness_test", "nl_trie_clear_revisions", "NL-TRIE-CLEAR-REVISIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_staleness_test", "nl_trie_revision_staleP", "NL-TRIE-REVISION-STALE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_staleness_test", "nl_trie_revision_recorded_value", "NL-TRIE-REVISION-RECORDED-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_staleness_test", "nl_trie_simple_string_retrievableP", "NL-TRIE-SIMPLE-STRING-RETRIEVABLE?", 0, 1, false);
        return (SubLObject)nl_trie_staleness_test.NIL;
    }
    
    public static SubLObject init_nl_trie_staleness_test_file() {
        nl_trie_staleness_test.$nl_trie_revisions$ = SubLFiles.deflexical("*NL-TRIE-REVISIONS*", (SubLObject)((nl_trie_staleness_test.NIL != Symbols.boundp((SubLObject)nl_trie_staleness_test.$sym0$_NL_TRIE_REVISIONS_)) ? nl_trie_staleness_test.$nl_trie_revisions$.getGlobalValue() : nl_trie_staleness_test.NIL));
        nl_trie_staleness_test.$nl_trie_staleness_acceptableP$ = SubLFiles.deflexical("*NL-TRIE-STALENESS-ACCEPTABLE?*", (SubLObject)((nl_trie_staleness_test.NIL != Symbols.boundp((SubLObject)nl_trie_staleness_test.$sym1$_NL_TRIE_STALENESS_ACCEPTABLE__)) ? nl_trie_staleness_test.$nl_trie_staleness_acceptableP$.getGlobalValue() : nl_trie_staleness_test.T));
        nl_trie_staleness_test.$nl_trie_known_staleP$ = SubLFiles.deflexical("*NL-TRIE-KNOWN-STALE?*", (SubLObject)((nl_trie_staleness_test.NIL != Symbols.boundp((SubLObject)nl_trie_staleness_test.$sym2$_NL_TRIE_KNOWN_STALE__)) ? nl_trie_staleness_test.$nl_trie_known_staleP$.getGlobalValue() : nl_trie_staleness_test.NIL));
        nl_trie_staleness_test.$nl_trie_revision_globals$ = SubLFiles.deflexical("*NL-TRIE-REVISION-GLOBALS*", (SubLObject)nl_trie_staleness_test.$list3);
        return (SubLObject)nl_trie_staleness_test.NIL;
    }
    
    public static SubLObject setup_nl_trie_staleness_test_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)nl_trie_staleness_test.$sym0$_NL_TRIE_REVISIONS_);
        subl_macro_promotions.declare_defglobal((SubLObject)nl_trie_staleness_test.$sym1$_NL_TRIE_STALENESS_ACCEPTABLE__);
        subl_macro_promotions.declare_defglobal((SubLObject)nl_trie_staleness_test.$sym2$_NL_TRIE_KNOWN_STALE__);
        SubLObject cdolist_list_var = nl_trie_staleness_test.$nl_trie_revision_globals$.getGlobalValue();
        SubLObject symbol = (SubLObject)nl_trie_staleness_test.NIL;
        symbol = cdolist_list_var.first();
        while (nl_trie_staleness_test.NIL != cdolist_list_var) {
            utilities_macros.register_kb_function(symbol);
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        }
        memoization_state.note_memoized_function((SubLObject)nl_trie_staleness_test.$sym14$NL_TRIE_REVISIONS_STALE_);
        return (SubLObject)nl_trie_staleness_test.NIL;
    }
    
    public void declareFunctions() {
        declare_nl_trie_staleness_test_file();
    }
    
    public void initializeVariables() {
        init_nl_trie_staleness_test_file();
    }
    
    public void runTopLevelForms() {
        setup_nl_trie_staleness_test_file();
    }
    
    static {
        me = (SubLFile)new nl_trie_staleness_test();
        nl_trie_staleness_test.$nl_trie_revisions$ = null;
        nl_trie_staleness_test.$nl_trie_staleness_acceptableP$ = null;
        nl_trie_staleness_test.$nl_trie_known_staleP$ = null;
        nl_trie_staleness_test.$nl_trie_revision_globals$ = null;
        $sym0$_NL_TRIE_REVISIONS_ = SubLObjectFactory.makeSymbol("*NL-TRIE-REVISIONS*");
        $sym1$_NL_TRIE_STALENESS_ACCEPTABLE__ = SubLObjectFactory.makeSymbol("*NL-TRIE-STALENESS-ACCEPTABLE?*");
        $sym2$_NL_TRIE_KNOWN_STALE__ = SubLObjectFactory.makeSymbol("*NL-TRIE-KNOWN-STALE?*");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NL-TRIE-CODE-REVISION*"), (SubLObject)SubLObjectFactory.makeSymbol("*MORPHOLOGY-CODE-REVISION*"), (SubLObject)SubLObjectFactory.makeSymbol("*LEXICON-CACHE-CODE-REVISION*"));
        $kw4$EOF = SubLObjectFactory.makeKeyword("EOF");
        $str5$___S_is_not_the_right_type_of_obj = SubLObjectFactory.makeString("~&~S is not the right type of object for ~S (expected a ~S).");
        $sym6$_NL_TRIE_REVISION_GLOBALS_ = SubLObjectFactory.makeSymbol("*NL-TRIE-REVISION-GLOBALS*");
        $sym7$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym8$ALIST_P = SubLObjectFactory.makeSymbol("ALIST-P");
        $str9$NL_trie_is_currently_being_initia = SubLObjectFactory.makeString("NL trie is currently being initialized.");
        $str10$NL_trie_not_present___ = SubLObjectFactory.makeString("NL trie not present.~%");
        $str11$NL_trie_empty___ = SubLObjectFactory.makeString("NL trie empty.~%");
        $str12$NL_trie_built_with_stale_code__ = SubLObjectFactory.makeString("NL trie built with stale code~%");
        $str13$NL_trie_simple_string_retrieval_f = SubLObjectFactory.makeString("NL trie simple string retrieval failed.~%");
        $sym14$NL_TRIE_REVISIONS_STALE_ = SubLObjectFactory.makeSymbol("NL-TRIE-REVISIONS-STALE?");
        $str15$NL_trie_built_with_stale_version_ = SubLObjectFactory.makeString("NL trie built with stale version of ~S~%");
        $sym16$SINGLETON_ = SubLObjectFactory.makeSymbol("SINGLETON?");
    }
}

/*

	Total time: 91 ms
	
*/