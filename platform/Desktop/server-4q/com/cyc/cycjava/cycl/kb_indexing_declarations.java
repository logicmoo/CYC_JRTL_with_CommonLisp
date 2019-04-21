package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_indexing_declarations extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.kb_indexing_declarations";
    public static final String myFingerPrint = "825e227b3c5d2ea7e5b5df9f69ec04bb7445acb925803a30ad2aae92693b51d6";
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-declarations.lisp", position = 634L)
    private static SubLSymbol $default_intermediate_index_equal_test$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-declarations.lisp", position = 714L)
    private static SubLSymbol $kb_indexing_declaration_store$;
    private static final SubLSymbol $sym0$_KB_INDEXING_DECLARATION_STORE_;
    private static final SubLList $list1;
    private static final SubLList $list2;
    private static final SubLSymbol $kw3$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw4$DONE;
    private static final SubLSymbol $sym5$DO_DICTIONARY;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$KB_INDEXING_DECLARATION_STORE;
    private static final SubLSymbol $sym8$DO_KB_INDICES;
    private static final SubLSymbol $kw9$TOP_LEVEL_KEY;
    private static final SubLList $list10;
    private static final SubLString $str11$Could_not_find_an_index_with_top_;
    private static final SubLSymbol $kw12$KEYS;
    private static final SubLSymbol $kw13$EQUAL_TEST;
    private static final SubLSymbol $kw14$GAF_ARG;
    private static final SubLList $list15;
    private static final SubLSymbol $kw16$NART_ARG;
    private static final SubLList $list17;
    private static final SubLSymbol $kw18$PREDICATE_EXTENT;
    private static final SubLList $list19;
    private static final SubLSymbol $kw20$FUNCTION_EXTENT;
    private static final SubLList $list21;
    private static final SubLSymbol $kw22$PREDICATE_RULE;
    private static final SubLList $list23;
    private static final SubLSymbol $kw24$DECONTEXTUALIZED_IST_PREDICATE_RULE;
    private static final SubLList $list25;
    private static final SubLSymbol $kw26$ISA_RULE;
    private static final SubLList $list27;
    private static final SubLSymbol $kw28$QUOTED_ISA_RULE;
    private static final SubLList $list29;
    private static final SubLSymbol $kw30$GENLS_RULE;
    private static final SubLList $list31;
    private static final SubLSymbol $kw32$GENL_MT_RULE;
    private static final SubLList $list33;
    private static final SubLSymbol $kw34$FUNCTION_RULE;
    private static final SubLList $list35;
    private static final SubLSymbol $kw36$EXCEPTION_RULE;
    private static final SubLList $list37;
    private static final SubLSymbol $kw38$PRAGMA_RULE;
    private static final SubLList $list39;
    private static final SubLSymbol $kw40$MICROTHEORY_CONTENTS;
    private static final SubLList $list41;
    private static final SubLSymbol $kw42$MISCELLANEOUS;
    private static final SubLList $list43;
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-declarations.lisp", position = 790L)
    public static SubLObject do_kb_indices(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_declarations.$list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject index = (SubLObject)kb_indexing_declarations.NIL;
        SubLObject plist = (SubLObject)kb_indexing_declarations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_declarations.$list1);
        index = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_declarations.$list1);
        plist = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_indexing_declarations.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_indexing_declarations.NIL;
        SubLObject current_$1 = (SubLObject)kb_indexing_declarations.NIL;
        while (kb_indexing_declarations.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_declarations.$list1);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_declarations.$list1);
            if (kb_indexing_declarations.NIL == conses_high.member(current_$1, (SubLObject)kb_indexing_declarations.$list2, (SubLObject)kb_indexing_declarations.UNPROVIDED, (SubLObject)kb_indexing_declarations.UNPROVIDED)) {
                bad = (SubLObject)kb_indexing_declarations.T;
            }
            if (current_$1 == kb_indexing_declarations.$kw3$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_indexing_declarations.NIL != bad && kb_indexing_declarations.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_declarations.$list1);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_indexing_declarations.$kw4$DONE, current);
        final SubLObject done = (SubLObject)((kb_indexing_declarations.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_indexing_declarations.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_declarations.$sym5$DO_DICTIONARY, (SubLObject)ConsesLow.list(index, plist, (SubLObject)kb_indexing_declarations.$list6, done), ConsesLow.append(body, (SubLObject)kb_indexing_declarations.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-declarations.lisp", position = 963L)
    public static SubLObject kb_indexing_declaration_store() {
        return kb_indexing_declarations.$kb_indexing_declaration_store$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-declarations.lisp", position = 1084L)
    public static SubLObject clear_kb_indexing_declaration_store() {
        kb_indexing_declarations.$kb_indexing_declaration_store$.setGlobalValue(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)kb_indexing_declarations.EQL), (SubLObject)kb_indexing_declarations.UNPROVIDED));
        return kb_indexing_declarations.$kb_indexing_declaration_store$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-declarations.lisp", position = 1310L)
    public static SubLObject add_index_to_kb_indexing_declaration_store(final SubLObject index, final SubLObject plist) {
        return dictionary.dictionary_enter(kb_indexing_declarations.$kb_indexing_declaration_store$.getGlobalValue(), index, plist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-declarations.lisp", position = 1456L)
    public static SubLObject remove_index_from_kb_indexing_declaration_store(final SubLObject index) {
        return dictionary.dictionary_remove(kb_indexing_declarations.$kb_indexing_declaration_store$.getGlobalValue(), index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-declarations.lisp", position = 1596L)
    public static SubLObject get_index_from_kb_indexing_declaration_store(final SubLObject index) {
        return dictionary.dictionary_lookup(kb_indexing_declarations.$kb_indexing_declaration_store$.getGlobalValue(), index, (SubLObject)kb_indexing_declarations.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-declarations.lisp", position = 1733L)
    public static SubLObject find_index_by_top_level_key(final SubLObject top_level_key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject index = get_index_from_kb_indexing_declaration_store(top_level_key);
        if (kb_indexing_declarations.NIL != index && top_level_key.eql(get_index_prop(index, (SubLObject)kb_indexing_declarations.$kw9$TOP_LEVEL_KEY))) {
            return index;
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(kb_indexing_declaration_store())); kb_indexing_declarations.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject index2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject plist = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (top_level_key.eql(get_index_prop(index2, (SubLObject)kb_indexing_declarations.$kw9$TOP_LEVEL_KEY))) {
                return index2;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)kb_indexing_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-declarations.lisp", position = 2192L)
    public static SubLObject get_index_key_prop(final SubLObject key_info, final SubLObject indicator, SubLObject v_default) {
        if (v_default == kb_indexing_declarations.UNPROVIDED) {
            v_default = (SubLObject)kb_indexing_declarations.NIL;
        }
        return conses_high.getf(key_info, indicator, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-declarations.lisp", position = 2310L)
    public static SubLObject get_index_prop(final SubLObject index, final SubLObject indicator) {
        return conses_high.getf(get_index_from_kb_indexing_declaration_store(index), indicator, (SubLObject)kb_indexing_declarations.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-declarations.lisp", position = 2464L)
    public static SubLObject declare_index(final SubLObject index, final SubLObject plist) {
        add_index_to_kb_indexing_declaration_store(index, plist);
        return index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-declarations.lisp", position = 2694L)
    public static SubLObject index_equality_test_for_keys(final SubLObject keys) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject top_level_key = (SubLObject)kb_indexing_declarations.NIL;
        SubLObject rest_keys = (SubLObject)kb_indexing_declarations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(keys, keys, (SubLObject)kb_indexing_declarations.$list10);
        top_level_key = keys.first();
        final SubLObject current = rest_keys = keys.rest();
        final SubLObject index = find_index_by_top_level_key(top_level_key);
        if (kb_indexing_declarations.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && kb_indexing_declarations.NIL == index) {
            Errors.error((SubLObject)kb_indexing_declarations.$str11$Could_not_find_an_index_with_top_, top_level_key);
        }
        final SubLObject key_info_list = get_index_prop(index, (SubLObject)kb_indexing_declarations.$kw12$KEYS);
        final SubLObject levels_deep = Sequences.length(rest_keys);
        final SubLObject key_info_for_this_level = ConsesLow.nth(levels_deep, key_info_list);
        final SubLObject equal_test = get_index_key_prop(key_info_for_this_level, (SubLObject)kb_indexing_declarations.$kw13$EQUAL_TEST, kb_indexing_declarations.$default_intermediate_index_equal_test$.getGlobalValue());
        return equal_test;
    }
    
    public static SubLObject declare_kb_indexing_declarations_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_declarations", "do_kb_indices", "DO-KB-INDICES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_declarations", "kb_indexing_declaration_store", "KB-INDEXING-DECLARATION-STORE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_declarations", "clear_kb_indexing_declaration_store", "CLEAR-KB-INDEXING-DECLARATION-STORE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_declarations", "add_index_to_kb_indexing_declaration_store", "ADD-INDEX-TO-KB-INDEXING-DECLARATION-STORE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_declarations", "remove_index_from_kb_indexing_declaration_store", "REMOVE-INDEX-FROM-KB-INDEXING-DECLARATION-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_declarations", "get_index_from_kb_indexing_declaration_store", "GET-INDEX-FROM-KB-INDEXING-DECLARATION-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_declarations", "find_index_by_top_level_key", "FIND-INDEX-BY-TOP-LEVEL-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_declarations", "get_index_key_prop", "GET-INDEX-KEY-PROP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_declarations", "get_index_prop", "GET-INDEX-PROP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_declarations", "declare_index", "DECLARE-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_declarations", "index_equality_test_for_keys", "INDEX-EQUALITY-TEST-FOR-KEYS", 1, 0, false);
        return (SubLObject)kb_indexing_declarations.NIL;
    }
    
    public static SubLObject init_kb_indexing_declarations_file() {
        kb_indexing_declarations.$default_intermediate_index_equal_test$ = SubLFiles.deflexical("*DEFAULT-INTERMEDIATE-INDEX-EQUAL-TEST*", Symbols.symbol_function((SubLObject)kb_indexing_declarations.EQL));
        kb_indexing_declarations.$kb_indexing_declaration_store$ = SubLFiles.deflexical("*KB-INDEXING-DECLARATION-STORE*", maybeDefault((SubLObject)kb_indexing_declarations.$sym0$_KB_INDEXING_DECLARATION_STORE_, kb_indexing_declarations.$kb_indexing_declaration_store$, ()->(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)kb_indexing_declarations.EQL), (SubLObject)kb_indexing_declarations.UNPROVIDED))));
        return (SubLObject)kb_indexing_declarations.NIL;
    }
    
    public static SubLObject setup_kb_indexing_declarations_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)kb_indexing_declarations.$sym0$_KB_INDEXING_DECLARATION_STORE_);
        access_macros.register_macro_helper((SubLObject)kb_indexing_declarations.$sym7$KB_INDEXING_DECLARATION_STORE, (SubLObject)kb_indexing_declarations.$sym8$DO_KB_INDICES);
        declare_index((SubLObject)kb_indexing_declarations.$kw14$GAF_ARG, (SubLObject)kb_indexing_declarations.$list15);
        declare_index((SubLObject)kb_indexing_declarations.$kw16$NART_ARG, (SubLObject)kb_indexing_declarations.$list17);
        declare_index((SubLObject)kb_indexing_declarations.$kw18$PREDICATE_EXTENT, (SubLObject)kb_indexing_declarations.$list19);
        declare_index((SubLObject)kb_indexing_declarations.$kw20$FUNCTION_EXTENT, (SubLObject)kb_indexing_declarations.$list21);
        declare_index((SubLObject)kb_indexing_declarations.$kw22$PREDICATE_RULE, (SubLObject)kb_indexing_declarations.$list23);
        declare_index((SubLObject)kb_indexing_declarations.$kw24$DECONTEXTUALIZED_IST_PREDICATE_RULE, (SubLObject)kb_indexing_declarations.$list25);
        declare_index((SubLObject)kb_indexing_declarations.$kw26$ISA_RULE, (SubLObject)kb_indexing_declarations.$list27);
        declare_index((SubLObject)kb_indexing_declarations.$kw28$QUOTED_ISA_RULE, (SubLObject)kb_indexing_declarations.$list29);
        declare_index((SubLObject)kb_indexing_declarations.$kw30$GENLS_RULE, (SubLObject)kb_indexing_declarations.$list31);
        declare_index((SubLObject)kb_indexing_declarations.$kw32$GENL_MT_RULE, (SubLObject)kb_indexing_declarations.$list33);
        declare_index((SubLObject)kb_indexing_declarations.$kw34$FUNCTION_RULE, (SubLObject)kb_indexing_declarations.$list35);
        declare_index((SubLObject)kb_indexing_declarations.$kw36$EXCEPTION_RULE, (SubLObject)kb_indexing_declarations.$list37);
        declare_index((SubLObject)kb_indexing_declarations.$kw38$PRAGMA_RULE, (SubLObject)kb_indexing_declarations.$list39);
        declare_index((SubLObject)kb_indexing_declarations.$kw40$MICROTHEORY_CONTENTS, (SubLObject)kb_indexing_declarations.$list41);
        declare_index((SubLObject)kb_indexing_declarations.$kw42$MISCELLANEOUS, (SubLObject)kb_indexing_declarations.$list43);
        return (SubLObject)kb_indexing_declarations.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_kb_indexing_declarations_file();
    }
    
    @Override
	public void initializeVariables() {
        init_kb_indexing_declarations_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_kb_indexing_declarations_file();
    }
    
    static {
        me = (SubLFile)new kb_indexing_declarations();
        kb_indexing_declarations.$default_intermediate_index_equal_test$ = null;
        kb_indexing_declarations.$kb_indexing_declaration_store$ = null;
        $sym0$_KB_INDEXING_DECLARATION_STORE_ = SubLObjectFactory.makeSymbol("*KB-INDEXING-DECLARATION-STORE*");
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("PLIST"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw3$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw4$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym5$DO_DICTIONARY = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KB-INDEXING-DECLARATION-STORE"));
        $sym7$KB_INDEXING_DECLARATION_STORE = SubLObjectFactory.makeSymbol("KB-INDEXING-DECLARATION-STORE");
        $sym8$DO_KB_INDICES = SubLObjectFactory.makeSymbol("DO-KB-INDICES");
        $kw9$TOP_LEVEL_KEY = SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY");
        $list10 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("TOP-LEVEL-KEY"), (SubLObject)SubLObjectFactory.makeSymbol("REST-KEYS"));
        $str11$Could_not_find_an_index_with_top_ = SubLObjectFactory.makeString("Could not find an index with top-level key ~S");
        $kw12$KEYS = SubLObjectFactory.makeKeyword("KEYS");
        $kw13$EQUAL_TEST = SubLObjectFactory.makeKeyword("EQUAL-TEST");
        $kw14$GAF_ARG = SubLObjectFactory.makeKeyword("GAF-ARG");
        $list15 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("GAF Arg"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("term"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("GAF-ARG"), SubLObjectFactory.makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("argnum"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)kb_indexing_declarations.EQL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("pred"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P"), (SubLObject)SubLObjectFactory.makeKeyword("RELEVANCE-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-PRED?"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)kb_indexing_declarations.EQL), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("mt"), SubLObjectFactory.makeKeyword("MT?"), kb_indexing_declarations.T, SubLObjectFactory.makeKeyword("VALIDITY-TEST"), SubLObjectFactory.makeSymbol("HLMT-P"), SubLObjectFactory.makeKeyword("RELEVANCE-TEST"), SubLObjectFactory.makeSymbol("RELEVANT-MT?"), SubLObjectFactory.makeKeyword("EQUAL-TEST"), kb_indexing_declarations.EQUAL })), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("gaf"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("GAF-ASSERTION?"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("A gaf assertion in mt MT with predicate PRED which mentions TERM\nin position ARGNUM")), SubLObjectFactory.makeKeyword("DUPLICATE-VALUES?"), kb_indexing_declarations.T, SubLObjectFactory.makeKeyword("NUM-FUNCTION"), SubLObjectFactory.makeSymbol("NUM-GAF-ARG-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-GAF-ARG-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-GAF-ARG-INDEX-WITH-CUTOFF"), SubLObjectFactory.makeKeyword("KEY-FUNCTION"), SubLObjectFactory.makeSymbol("KEY-GAF-ARG-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("RELEVANT-KEY-GAF-ARG-INDEX"), SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION"), SubLObjectFactory.makeSymbol("MATCHES-GAF-ARG-INDEX"), SubLObjectFactory.makeKeyword("SIMPLE-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("SIMPLE-KEY-GAF-ARG-INDEX"), SubLObjectFactory.makeKeyword("GET-SUBINDEX-FUNCTION"), SubLObjectFactory.makeSymbol("GET-GAF-ARG-SUBINDEX") });
        $kw16$NART_ARG = SubLObjectFactory.makeKeyword("NART-ARG");
        $list17 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("NART Arg"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("term"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("NART-ARG"), SubLObjectFactory.makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("argnum"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)kb_indexing_declarations.EQL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("func"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)kb_indexing_declarations.EQL)), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("tou-ass"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("TERM-OF-UNIT-ASSERTION-P"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("A #$termOfUnit assertion whose arg2 is a naut with functor FUNC\nwhich mentions TERM in position ARGNUM")), SubLObjectFactory.makeKeyword("DUPLICATE-VALUES?"), kb_indexing_declarations.T, SubLObjectFactory.makeKeyword("NUM-FUNCTION"), SubLObjectFactory.makeSymbol("NUM-NART-ARG-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-NART-ARG-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-NART-ARG-INDEX-WITH-CUTOFF"), SubLObjectFactory.makeKeyword("KEY-FUNCTION"), SubLObjectFactory.makeSymbol("KEY-NART-ARG-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("RELEVANT-KEY-NART-ARG-INDEX"), SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION"), SubLObjectFactory.makeSymbol("MATCHES-NART-ARG-INDEX"), SubLObjectFactory.makeKeyword("SIMPLE-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("SIMPLE-KEY-NART-ARG-INDEX"), SubLObjectFactory.makeKeyword("GET-SUBINDEX-FUNCTION"), SubLObjectFactory.makeSymbol("GET-NART-ARG-SUBINDEX") });
        $kw18$PREDICATE_EXTENT = SubLObjectFactory.makeKeyword("PREDICATE-EXTENT");
        $list19 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Predicate Extent"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("pred"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("PREDICATE-EXTENT"), SubLObjectFactory.makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("mt"), SubLObjectFactory.makeKeyword("MT?"), kb_indexing_declarations.T, SubLObjectFactory.makeKeyword("VALIDITY-TEST"), SubLObjectFactory.makeSymbol("HLMT-P"), SubLObjectFactory.makeKeyword("RELEVANCE-TEST"), SubLObjectFactory.makeSymbol("RELEVANT-MT?"), SubLObjectFactory.makeKeyword("EQUAL-TEST"), kb_indexing_declarations.EQUAL })), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("gaf"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("GAF-ASSERTION?"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("A gaf assertion in mt MT with predicate PRED.")), SubLObjectFactory.makeKeyword("DUPLICATE-VALUES?"), kb_indexing_declarations.NIL, SubLObjectFactory.makeKeyword("NUM-FUNCTION"), SubLObjectFactory.makeSymbol("NUM-PREDICATE-EXTENT-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-PREDICATE-EXTENT-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-PREDICATE-EXTENT-INDEX-WITH-CUTOFF"), SubLObjectFactory.makeKeyword("KEY-FUNCTION"), SubLObjectFactory.makeSymbol("KEY-PREDICATE-EXTENT-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("RELEVANT-KEY-PREDICATE-EXTENT-INDEX"), SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION"), SubLObjectFactory.makeSymbol("MATCHES-PREDICATE-EXTENT-INDEX"), SubLObjectFactory.makeKeyword("SIMPLE-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("SIMPLE-KEY-PREDICATE-EXTENT-INDEX"), SubLObjectFactory.makeKeyword("GET-SUBINDEX-FUNCTION"), SubLObjectFactory.makeSymbol("GET-PREDICATE-EXTENT-SUBINDEX") });
        $kw20$FUNCTION_EXTENT = SubLObjectFactory.makeKeyword("FUNCTION-EXTENT");
        $list21 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Function Extent"), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("FUNCTION-EXTENT"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("func"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("tou-ass"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("TERM-OF-UNIT-ASSERTION-P"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("A #$termOfUnit assertion whose arg2 is a naut with functor FUNC")), SubLObjectFactory.makeKeyword("DUPLICATE-VALUES?"), kb_indexing_declarations.NIL, SubLObjectFactory.makeKeyword("NUM-FUNCTION"), SubLObjectFactory.makeSymbol("NUM-FUNCTION-EXTENT-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-FUNCTION-EXTENT-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-FUNCTION-EXTENT-INDEX-WITH-CUTOFF"), SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION"), SubLObjectFactory.makeSymbol("MATCHES-FUNCTION-EXTENT-INDEX"), SubLObjectFactory.makeKeyword("GET-SUBINDEX-FUNCTION"), SubLObjectFactory.makeSymbol("GET-FUNCTION-EXTENT-SUBINDEX") });
        $kw22$PREDICATE_RULE = SubLObjectFactory.makeKeyword("PREDICATE-RULE");
        $list23 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Predicate Rules"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("pred"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("PREDICATE-RULE"), SubLObjectFactory.makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("sense"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)kb_indexing_declarations.EQ), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("mt"), SubLObjectFactory.makeKeyword("MT?"), kb_indexing_declarations.T, SubLObjectFactory.makeKeyword("VALIDITY-TEST"), SubLObjectFactory.makeSymbol("HLMT-P"), SubLObjectFactory.makeKeyword("RELEVANCE-TEST"), SubLObjectFactory.makeSymbol("RELEVANT-MT?"), SubLObjectFactory.makeKeyword("EQUAL-TEST"), kb_indexing_declarations.EQUAL }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("direction"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)kb_indexing_declarations.EQ)), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("rule"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("RULE-ASSERTION?"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na SENSE-lit with predicate PRED")), SubLObjectFactory.makeKeyword("DUPLICATE-VALUES?"), kb_indexing_declarations.T, SubLObjectFactory.makeKeyword("NUM-FUNCTION"), SubLObjectFactory.makeSymbol("NUM-PREDICATE-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-PREDICATE-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-PREDICATE-RULE-INDEX-WITH-CUTOFF"), SubLObjectFactory.makeKeyword("KEY-FUNCTION"), SubLObjectFactory.makeSymbol("KEY-PREDICATE-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("RELEVANT-KEY-PREDICATE-RULE-INDEX"), SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION"), SubLObjectFactory.makeSymbol("MATCHES-PREDICATE-RULE-INDEX"), SubLObjectFactory.makeKeyword("SIMPLE-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("SIMPLE-KEY-PREDICATE-RULE-INDEX"), SubLObjectFactory.makeKeyword("GET-SUBINDEX-FUNCTION"), SubLObjectFactory.makeSymbol("GET-PREDICATE-RULE-SUBINDEX") });
        $kw24$DECONTEXTUALIZED_IST_PREDICATE_RULE = SubLObjectFactory.makeKeyword("DECONTEXTUALIZED-IST-PREDICATE-RULE");
        $list25 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Decontextualized #$ist Predicate Rules"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("pred"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("DECONTEXTUALIZED-IST-PREDICATE-RULE"), SubLObjectFactory.makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("sense"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)kb_indexing_declarations.EQ), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("direction"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)kb_indexing_declarations.EQ)), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("rule"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("RULE-ASSERTION?"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("A rule assertion with direction DIRECTION, which contains\na SENSE-lit wrapped in an #$ist with predicate PRED.  The mt of the rule is ignored.")), SubLObjectFactory.makeKeyword("DUPLICATE-VALUES?"), kb_indexing_declarations.T, SubLObjectFactory.makeKeyword("NUM-FUNCTION"), SubLObjectFactory.makeSymbol("NUM-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-WITH-CUTOFF"), SubLObjectFactory.makeKeyword("KEY-FUNCTION"), SubLObjectFactory.makeSymbol("KEY-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("RELEVANT-KEY-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX"), SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION"), SubLObjectFactory.makeSymbol("MATCHES-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX"), SubLObjectFactory.makeKeyword("SIMPLE-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("SIMPLE-KEY-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX"), SubLObjectFactory.makeKeyword("GET-SUBINDEX-FUNCTION"), SubLObjectFactory.makeSymbol("GET-DECONTEXTUALIZED-IST-PREDICATE-RULE-SUBINDEX") });
        $kw26$ISA_RULE = SubLObjectFactory.makeKeyword("ISA-RULE");
        $list27 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("#$isa Rules"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("col"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("ISA-RULE"), SubLObjectFactory.makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("sense"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)kb_indexing_declarations.EQ), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("mt"), SubLObjectFactory.makeKeyword("MT?"), kb_indexing_declarations.T, SubLObjectFactory.makeKeyword("VALIDITY-TEST"), SubLObjectFactory.makeSymbol("HLMT-P"), SubLObjectFactory.makeKeyword("RELEVANCE-TEST"), SubLObjectFactory.makeSymbol("RELEVANT-MT?"), SubLObjectFactory.makeKeyword("EQUAL-TEST"), kb_indexing_declarations.EQUAL }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("direction"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)kb_indexing_declarations.EQ)), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("rule"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("RULE-ASSERTION?"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na SENSE-lit with predicate #$isa and arg2 COL")), SubLObjectFactory.makeKeyword("DUPLICATE-VALUES?"), kb_indexing_declarations.T, SubLObjectFactory.makeKeyword("NUM-FUNCTION"), SubLObjectFactory.makeSymbol("NUM-ISA-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-ISA-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-ISA-RULE-INDEX-WITH-CUTOFF"), SubLObjectFactory.makeKeyword("KEY-FUNCTION"), SubLObjectFactory.makeSymbol("KEY-ISA-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("RELEVANT-KEY-ISA-RULE-INDEX"), SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION"), SubLObjectFactory.makeSymbol("MATCHES-ISA-RULE-INDEX"), SubLObjectFactory.makeKeyword("SIMPLE-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("SIMPLE-KEY-ISA-RULE-INDEX"), SubLObjectFactory.makeKeyword("GET-SUBINDEX-FUNCTION"), SubLObjectFactory.makeSymbol("GET-ISA-RULE-SUBINDEX") });
        $kw28$QUOTED_ISA_RULE = SubLObjectFactory.makeKeyword("QUOTED-ISA-RULE");
        $list29 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("#$quotedIsa Rules"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("col"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("QUOTED-ISA-RULE"), SubLObjectFactory.makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("sense"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)kb_indexing_declarations.EQ), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("mt"), SubLObjectFactory.makeKeyword("MT?"), kb_indexing_declarations.T, SubLObjectFactory.makeKeyword("VALIDITY-TEST"), SubLObjectFactory.makeSymbol("HLMT-P"), SubLObjectFactory.makeKeyword("RELEVANCE-TEST"), SubLObjectFactory.makeSymbol("RELEVANT-MT?"), SubLObjectFactory.makeKeyword("EQUAL-TEST"), kb_indexing_declarations.EQUAL }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("direction"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)kb_indexing_declarations.EQ)), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("rule"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("RULE-ASSERTION?"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na SENSE-lit with predicate #$quotedIsa and arg2 COL")), SubLObjectFactory.makeKeyword("DUPLICATE-VALUES?"), kb_indexing_declarations.T, SubLObjectFactory.makeKeyword("NUM-FUNCTION"), SubLObjectFactory.makeSymbol("NUM-QUOTED-ISA-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-QUOTED-ISA-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-QUOTED-ISA-RULE-INDEX-WITH-CUTOFF"), SubLObjectFactory.makeKeyword("KEY-FUNCTION"), SubLObjectFactory.makeSymbol("KEY-QUOTED-ISA-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("RELEVANT-KEY-QUOTED-ISA-RULE-INDEX"), SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION"), SubLObjectFactory.makeSymbol("MATCHES-QUOTED-ISA-RULE-INDEX"), SubLObjectFactory.makeKeyword("SIMPLE-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("SIMPLE-KEY-QUOTED-ISA-RULE-INDEX"), SubLObjectFactory.makeKeyword("GET-SUBINDEX-FUNCTION"), SubLObjectFactory.makeSymbol("GET-QUOTED-ISA-RULE-SUBINDEX") });
        $kw30$GENLS_RULE = SubLObjectFactory.makeKeyword("GENLS-RULE");
        $list31 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("#$genls Rules"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("col"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("GENLS-RULE"), SubLObjectFactory.makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("sense"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)kb_indexing_declarations.EQ), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("mt"), SubLObjectFactory.makeKeyword("MT?"), kb_indexing_declarations.T, SubLObjectFactory.makeKeyword("VALIDITY-TEST"), SubLObjectFactory.makeSymbol("HLMT-P"), SubLObjectFactory.makeKeyword("RELEVANCE-TEST"), SubLObjectFactory.makeSymbol("RELEVANT-MT?"), SubLObjectFactory.makeKeyword("EQUAL-TEST"), kb_indexing_declarations.EQUAL }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("direction"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)kb_indexing_declarations.EQ)), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("rule"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("RULE-ASSERTION?"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na SENSE-lit with predicate #$genls and arg2 COL")), SubLObjectFactory.makeKeyword("DUPLICATE-VALUES?"), kb_indexing_declarations.T, SubLObjectFactory.makeKeyword("NUM-FUNCTION"), SubLObjectFactory.makeSymbol("NUM-GENLS-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-GENLS-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-GENLS-RULE-INDEX-WITH-CUTOFF"), SubLObjectFactory.makeKeyword("KEY-FUNCTION"), SubLObjectFactory.makeSymbol("KEY-GENLS-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("RELEVANT-KEY-GENLS-RULE-INDEX"), SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION"), SubLObjectFactory.makeSymbol("MATCHES-GENLS-RULE-INDEX"), SubLObjectFactory.makeKeyword("SIMPLE-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("SIMPLE-KEY-GENLS-RULE-INDEX"), SubLObjectFactory.makeKeyword("GET-SUBINDEX-FUNCTION"), SubLObjectFactory.makeSymbol("GET-GENLS-RULE-SUBINDEX") });
        $kw32$GENL_MT_RULE = SubLObjectFactory.makeKeyword("GENL-MT-RULE");
        $list33 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("#$genlMt Rules"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("genl-mt"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT-P")), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("GENL-MT-RULE"), SubLObjectFactory.makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("sense"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)kb_indexing_declarations.EQ), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("rule-mt"), SubLObjectFactory.makeKeyword("MT?"), kb_indexing_declarations.T, SubLObjectFactory.makeKeyword("VALIDITY-TEST"), SubLObjectFactory.makeSymbol("HLMT-P"), SubLObjectFactory.makeKeyword("RELEVANCE-TEST"), SubLObjectFactory.makeSymbol("RELEVANT-MT?"), SubLObjectFactory.makeKeyword("EQUAL-TEST"), kb_indexing_declarations.EQUAL }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("direction"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)kb_indexing_declarations.EQ)), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("rule"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("RULE-ASSERTION?"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("A rule assertion in mt RULE-MT with direction DIRECTION, which contains\na SENSE-lit with predicate #$genlMt and arg2 GENL-MT")), SubLObjectFactory.makeKeyword("DUPLICATE-VALUES?"), kb_indexing_declarations.T, SubLObjectFactory.makeKeyword("NUM-FUNCTION"), SubLObjectFactory.makeSymbol("NUM-GENL-MT-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-GENL-MT-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-GENL-MT-RULE-INDEX-WITH-CUTOFF"), SubLObjectFactory.makeKeyword("KEY-FUNCTION"), SubLObjectFactory.makeSymbol("KEY-GENL-MT-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("RELEVANT-KEY-GENL-MT-RULE-INDEX"), SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION"), SubLObjectFactory.makeSymbol("MATCHES-GENL-MT-RULE-INDEX"), SubLObjectFactory.makeKeyword("SIMPLE-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("SIMPLE-KEY-GENL-MT-RULE-INDEX"), SubLObjectFactory.makeKeyword("GET-SUBINDEX-FUNCTION"), SubLObjectFactory.makeSymbol("GET-GENL-MT-RULE-SUBINDEX") });
        $kw34$FUNCTION_RULE = SubLObjectFactory.makeKeyword("FUNCTION-RULE");
        $list35 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Function Rules"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("func"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("FUNCTION-RULE"), SubLObjectFactory.makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("mt"), SubLObjectFactory.makeKeyword("MT?"), kb_indexing_declarations.T, SubLObjectFactory.makeKeyword("VALIDITY-TEST"), SubLObjectFactory.makeSymbol("HLMT-P"), SubLObjectFactory.makeKeyword("RELEVANCE-TEST"), SubLObjectFactory.makeSymbol("RELEVANT-MT?"), SubLObjectFactory.makeKeyword("EQUAL-TEST"), kb_indexing_declarations.EQUAL }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("direction"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)kb_indexing_declarations.EQ)), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("rule"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("RULE-ASSERTION?"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na neg-lit whose predicate is #$termOfUnit and whose arg2 is a naut with functor FUNC")), SubLObjectFactory.makeKeyword("DUPLICATE-VALUES?"), kb_indexing_declarations.NIL, SubLObjectFactory.makeKeyword("NUM-FUNCTION"), SubLObjectFactory.makeSymbol("NUM-FUNCTION-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-FUNCTION-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-FUNCTION-RULE-INDEX-WITH-CUTOFF"), SubLObjectFactory.makeKeyword("KEY-FUNCTION"), SubLObjectFactory.makeSymbol("KEY-FUNCTION-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("RELEVANT-KEY-FUNCTION-RULE-INDEX"), SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION"), SubLObjectFactory.makeSymbol("MATCHES-FUNCTION-RULE-INDEX"), SubLObjectFactory.makeKeyword("SIMPLE-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("SIMPLE-KEY-FUNCTION-RULE-INDEX"), SubLObjectFactory.makeKeyword("GET-SUBINDEX-FUNCTION"), SubLObjectFactory.makeSymbol("GET-FUNCTION-RULE-SUBINDEX") });
        $kw36$EXCEPTION_RULE = SubLObjectFactory.makeKeyword("EXCEPTION-RULE");
        $list37 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Exception Rules"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("rule"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("RULE-ASSERTION?")), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("EXCEPTION-RULE"), SubLObjectFactory.makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("mt"), SubLObjectFactory.makeKeyword("MT?"), kb_indexing_declarations.T, SubLObjectFactory.makeKeyword("VALIDITY-TEST"), SubLObjectFactory.makeSymbol("HLMT-P"), SubLObjectFactory.makeKeyword("RELEVANCE-TEST"), SubLObjectFactory.makeSymbol("RELEVANT-MT?"), SubLObjectFactory.makeKeyword("EQUAL-TEST"), kb_indexing_declarations.EQUAL }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("direction"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)kb_indexing_declarations.EQ)), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("exception-rule"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("RULE-ASSERTION?"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na pos-lit whose predicate is #$abnormal and whose arg2 is RULE")), SubLObjectFactory.makeKeyword("DUPLICATE-VALUES?"), kb_indexing_declarations.NIL, SubLObjectFactory.makeKeyword("NUM-FUNCTION"), SubLObjectFactory.makeSymbol("NUM-EXCEPTION-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-EXCEPTION-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-EXCEPTION-RULE-INDEX-WITH-CUTOFF"), SubLObjectFactory.makeKeyword("KEY-FUNCTION"), SubLObjectFactory.makeSymbol("KEY-EXCEPTION-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("RELEVANT-KEY-EXCEPTION-RULE-INDEX"), SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION"), SubLObjectFactory.makeSymbol("MATCHES-EXCEPTION-RULE-INDEX"), SubLObjectFactory.makeKeyword("SIMPLE-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("SIMPLE-KEY-EXCEPTION-RULE-INDEX"), SubLObjectFactory.makeKeyword("GET-SUBINDEX-FUNCTION"), SubLObjectFactory.makeSymbol("GET-EXCEPTION-RULE-SUBINDEX") });
        $kw38$PRAGMA_RULE = SubLObjectFactory.makeKeyword("PRAGMA-RULE");
        $list39 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Pragmatic Requirement Rules"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("rule"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("RULE-ASSERTION?")), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("PRAGMA-RULE"), SubLObjectFactory.makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("mt"), SubLObjectFactory.makeKeyword("MT?"), kb_indexing_declarations.T, SubLObjectFactory.makeKeyword("VALIDITY-TEST"), SubLObjectFactory.makeSymbol("HLMT-P"), SubLObjectFactory.makeKeyword("RELEVANCE-TEST"), SubLObjectFactory.makeSymbol("RELEVANT-MT?"), SubLObjectFactory.makeKeyword("EQUAL-TEST"), kb_indexing_declarations.EQUAL }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("direction"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)kb_indexing_declarations.EQ)), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("pragma-rule"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("RULE-ASSERTION?"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na pos-lit whose predicate is #$meetsPragmaticRequirement and whose arg2 is RULE")), SubLObjectFactory.makeKeyword("DUPLICATE-VALUES?"), kb_indexing_declarations.NIL, SubLObjectFactory.makeKeyword("NUM-FUNCTION"), SubLObjectFactory.makeSymbol("NUM-PRAGMA-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-PRAGMA-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-PRAGMA-RULE-INDEX-WITH-CUTOFF"), SubLObjectFactory.makeKeyword("KEY-FUNCTION"), SubLObjectFactory.makeSymbol("KEY-PRAGMA-RULE-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("RELEVANT-KEY-PRAGMA-RULE-INDEX"), SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION"), SubLObjectFactory.makeSymbol("MATCHES-PRAGMA-RULE-INDEX"), SubLObjectFactory.makeKeyword("SIMPLE-KEY-FUNCTION"), SubLObjectFactory.makeSymbol("SIMPLE-KEY-PRAGMA-RULE-INDEX"), SubLObjectFactory.makeKeyword("GET-SUBINDEX-FUNCTION"), SubLObjectFactory.makeSymbol("GET-PRAGMA-RULE-SUBINDEX") });
        $kw40$MICROTHEORY_CONTENTS = SubLObjectFactory.makeKeyword("MICROTHEORY-CONTENTS");
        $list41 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Microtheory Contents"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("mt"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT-P")), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("IST"), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("ass"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-P"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("An assertion in mt MT")), SubLObjectFactory.makeKeyword("DUPLICATE-VALUES?"), kb_indexing_declarations.NIL, SubLObjectFactory.makeKeyword("NUM-FUNCTION"), SubLObjectFactory.makeSymbol("NUM-MT-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-MT-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-MT-INDEX-WITH-CUTOFF"), SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION"), SubLObjectFactory.makeSymbol("MATCHES-MT-INDEX"), SubLObjectFactory.makeKeyword("GET-SUBINDEX-FUNCTION"), SubLObjectFactory.makeSymbol("GET-MT-SUBINDEX") });
        $kw42$MISCELLANEOUS = SubLObjectFactory.makeKeyword("MISCELLANEOUS");
        $list43 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Miscellaneous"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("term"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("OTHER"), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("ass"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-P"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("An assertion mentioning TERM but not indexed by any other means")), SubLObjectFactory.makeKeyword("DUPLICATE-VALUES?"), kb_indexing_declarations.NIL, SubLObjectFactory.makeKeyword("NUM-FUNCTION"), SubLObjectFactory.makeSymbol("NUM-OTHER-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-OTHER-INDEX"), SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), SubLObjectFactory.makeSymbol("RELEVANT-NUM-OTHER-INDEX-WITH-CUTOFF"), SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION"), SubLObjectFactory.makeSymbol("MATCHES-OTHER-INDEX"), SubLObjectFactory.makeKeyword("GET-SUBINDEX-FUNCTION"), SubLObjectFactory.makeSymbol("GET-OTHER-SUBINDEX") });
    }
}

/*

	Total time: 249 ms
	
*/