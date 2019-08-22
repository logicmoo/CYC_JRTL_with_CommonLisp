/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.acons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.owl.owl_cycl_to_xml;
import com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes;
import com.cyc.cycjava.cycl.owl.owlification;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class taxonomy extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new taxonomy();

 public static final String myName = "com.cyc.cycjava.cycl.taxonomy";


    // defparameter
    // Definitions
    @LispMethod(comment = "A dictionary-p that contains the taxonomy terms as the keys and their\r\nimmediate relations as the values.  It is a temporary data-structure that\r\ngets cleared once the taxonomy is written out.\ndefparameter\nA dictionary-p that contains the taxonomy terms as the keys and their\nimmediate relations as the values.  It is a temporary data-structure that\ngets cleared once the taxonomy is written out.")
    private static final SubLSymbol $taxonomy_term_relations_dict$ = makeSymbol("*TAXONOMY-TERM-RELATIONS-DICT*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLSymbol $sym0$_MT = makeSymbol("?MT");



    static private final SubLList $list2 = list(makeSymbol("?MT"));



    static private final SubLSymbol $sym4$_TERM = makeSymbol("?TERM");





    static private final SubLList $list7 = list(list(reader_make_constant_shell("keIrrelevantTerm"), makeSymbol("?TERM")));



    static private final SubLSymbol $sym9$_X = makeSymbol("?X");



    private static final SubLSymbol TAXONOMY_GENERATE_NON_SINGULAR_PHRASE = makeSymbol("TAXONOMY-GENERATE-NON-SINGULAR-PHRASE");

    static private final SubLList $list12 = list(reader_make_constant_shell("nonSingular-Generic"));

    public static final SubLSymbol $taxonomy_generate_non_singular_phrase_caching_state$ = makeSymbol("*TAXONOMY-GENERATE-NON-SINGULAR-PHRASE-CACHING-STATE*");

    private static final SubLString $str15$No_disambiguating_generalization_ = makeString("No disambiguating generalization could be found for ~A");

    private static final SubLString $str16$__ = makeString(" (");

    private static final SubLString $str17$_ = makeString(")");

    private static final SubLSymbol TAXONOMY_TERM_NAME = makeSymbol("TAXONOMY-TERM-NAME");

    private static final SubLObject $const19$conceptInSystemDefaultDisplayStri = reader_make_constant_shell("conceptInSystemDefaultDisplayString");

    private static final SubLList $list20 = list(makeSymbol("?X"));

    private static final SubLString $str21$_ = makeString("'");

    static private final SubLString $str22$_ = makeString("\"");

    private static final SubLSymbol $taxonomy_term_name_caching_state$ = makeSymbol("*TAXONOMY-TERM-NAME-CACHING-STATE*");

    private static final SubLSymbol TAXONOMY_SUPPRESSED_FACETS = makeSymbol("TAXONOMY-SUPPRESSED-FACETS");

    private static final SubLSymbol $sym26$_FACET = makeSymbol("?FACET");



    private static final SubLList $list28 = list(makeSymbol("?FACET"));

    private static final SubLSymbol $taxonomy_suppressed_facets_caching_state$ = makeSymbol("*TAXONOMY-SUPPRESSED-FACETS-CACHING-STATE*");

    private static final SubLObject $$facets_Generic = reader_make_constant_shell("facets-Generic");



    private static final SubLString $str33$_S_is_being_used_as_a_name_for__A = makeString("~S is being used as a name for ~A. So, it cannot be used as an alternate-name for ~A.");

    private static final SubLString $str35$_S_is_being_used_as_an_alternate_ = makeString("~S is being used as an alternate-name for ~S (~A). So, it cannot be used as an alternate-name for ~A.");

    private static final SubLInteger $int$10000 = makeInteger(10000);

    static private final SubLString $str38$_S_is_being_used_as_a_name_for__A = makeString("~S is being used as a name for ~A.  Hence, it will not be used for ~A, which is ignored.");

    private static final SubLString $str44$_____A__ = makeString("    ~A~%");

    private static final SubLString $str45$______A___ = makeString("    <~A>~%");

    private static final SubLString $str46$_A__ = makeString("~A~%");

    private static final SubLString $str47$__BT__ = makeString("  BT~%");

    private static final SubLString $str48$__NT__ = makeString("  NT~%");

    private static final SubLString $str49$__UF__ = makeString("  UF~%");

    private static final SubLString $str50$__USE_______A__ = makeString("  USE~%    ~A~%");

    private static final SubLString $str51$__ = makeString("~%");

    private static final SubLString $str53$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLSymbol $sym54$STRING_ = makeSymbol("STRING<");

    private static final SubLString $str55$Did_not_write_out__S_because_it_s = makeString("Did not write out ~S because it shares taxonomy-name with ~S");

    private static final SubLString $str56$_C = makeString("~C");

    private static final SubLString $str57$__A___ = makeString("<~A>~%");

    private static final SubLSymbol CYCL_REPRESENTED_TERM_P = makeSymbol("CYCL-REPRESENTED-TERM-P");

    private static final SubLString $str60$__ = makeString("#$");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str62$_node_name__S_nodeType__term__cyc = makeString("<node name=~S nodeType=\"term\" cycTerm=~S");

    private static final SubLString $str63$_usedFor__S = makeString(" usedFor=~S");

    private static final SubLSymbol STR_BY_TYPE = makeSymbol("STR-BY-TYPE");

    static private final SubLString $str65$__ = makeString(", ");

    private static final SubLString $str66$_isLeaf__S___ = makeString(" isLeaf=~S>~%");

    private static final SubLString $$$false = makeString("false");

    private static final SubLString $$$true = makeString("true");

    private static final SubLString $str69$_node_name__S_nodeType__facet__cy = makeString("<node name=~S nodeType=\"facet\" cycTerm=~S isLeaf=\"false\">~%");

    private static final SubLString $str70$__node___ = makeString("</node>~%");

    private static final SubLString $str71$_root___ = makeString("<root>~%");

    private static final SubLString $str72$__root_ = makeString("</root>");

    private static final SubLString $str75$_S__S__EN___ = makeString("~S,~S,\"EN\"~%");

    private static final SubLString $str76$_S__S__BT___S__S__ = makeString("~S,~S,\"BT\",~S,~S~%");

    private static final SubLString $str77$_S__S__NT___S__S__ = makeString("~S,~S,\"NT\",~S,~S~%");

    private static final SubLString $str78$_S__S__UF___S__S__ = makeString("~S,~S,\"UF\",~S,~S~%");

    private static final SubLString $str79$_S__S__USE___S__S__ = makeString("~S,~S,\"USE\",~S,~S~%");

    private static final SubLList $list81 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("INFERENCE-MODE"), makeKeyword("MINIMAL"));

    private static final SubLString $str82$Human_readable_OWL_export_require = makeString("Human-readable OWL export requires a valid (UNIVERSAL-DATE-P) version date. Got ~S");

    private static final SubLSymbol TAXONOMY_TREE_DEPTH = makeSymbol("TAXONOMY-TREE-DEPTH");

    public static final SubLObject taxonomy_term_relations_dict_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $taxonomy_term_relations_dict$.getDynamicValue(thread);
        }
    }

    public static SubLObject taxonomy_term_relations_dict() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $taxonomy_term_relations_dict$.getDynamicValue(thread);
    }

    /**
     * Returns the HL Microtheory that is the context MT of TAXONOMY.
     *
     * @param TAXONOMY
    cycl-represented-term-p
     * 		
     * @return hlmt-p
     */
    @LispMethod(comment = "Returns the HL Microtheory that is the context MT of TAXONOMY.\r\n\r\n@param TAXONOMY\ncycl-represented-term-p\r\n\t\t\r\n@return hlmt-p")
    public static final SubLObject taxonomy_mt_alt(SubLObject v_taxonomy) {
        return narts_high.nart_substitute(ask_utilities.query_variable($sym0$_MT, listS($$contextOfPCW, v_taxonomy, $list_alt2), $$InferencePSC, UNPROVIDED).first());
    }

    /**
     * Returns the HL Microtheory that is the context MT of TAXONOMY.
     *
     * @param TAXONOMY
    		cycl-represented-term-p
     * 		
     * @return hlmt-p
     */
    @LispMethod(comment = "Returns the HL Microtheory that is the context MT of TAXONOMY.\r\n\r\n@param TAXONOMY\n\t\tcycl-represented-term-p\r\n\t\t\r\n@return hlmt-p")
    public static SubLObject taxonomy_mt(final SubLObject v_taxonomy) {
        return narts_high.nart_substitute(ask_utilities.query_variable($sym0$_MT, listS($$contextOfPCW, v_taxonomy, $list2), $$InferencePSC, UNPROVIDED).first());
    }

    /**
     * Returns a list of irrelevant CycL terms in TAXONOMY
     *
     * @param TAXONOMY
    cycl-represented-term-p
     * 		
     */
    @LispMethod(comment = "Returns a list of irrelevant CycL terms in TAXONOMY\r\n\r\n@param TAXONOMY\ncycl-represented-term-p")
    public static final SubLObject taxonomy_irrelevant_terms_alt(SubLObject v_taxonomy) {
        return ask_utilities.query_variable($sym4$_TERM, listS($$and, list($$nodeInSystem, $sym4$_TERM, v_taxonomy), $list_alt7), $$TaxonomyMt, UNPROVIDED);
    }

    /**
     * Returns a list of irrelevant CycL terms in TAXONOMY
     *
     * @param TAXONOMY
    		cycl-represented-term-p
     * 		
     */
    @LispMethod(comment = "Returns a list of irrelevant CycL terms in TAXONOMY\r\n\r\n@param TAXONOMY\n\t\tcycl-represented-term-p")
    public static SubLObject taxonomy_irrelevant_terms(final SubLObject v_taxonomy) {
        return ask_utilities.query_variable($sym4$_TERM, listS($$and, list($$nodeInSystem, $sym4$_TERM, v_taxonomy), $list7), $$TaxonomyMt, UNPROVIDED);
    }

    /**
     * Returns a list of CycL terms under each of ROOTS, that are relevant in
     * TAXONOMY-MT.
     *
     * @param TAXONOMY
    cycl-represented-term-p
     * 		
     * @param ROOTS
     * 		listp; list of cycl-represented-term-p
     * @param TAXONOMY-MT
    hlmt-p
     * 		
     * @return TERMS listp; list of cycl-represented-term-p
     */
    @LispMethod(comment = "Returns a list of CycL terms under each of ROOTS, that are relevant in\r\nTAXONOMY-MT.\r\n\r\n@param TAXONOMY\ncycl-represented-term-p\r\n\t\t\r\n@param ROOTS\r\n\t\tlistp; list of cycl-represented-term-p\r\n@param TAXONOMY-MT\nhlmt-p\r\n\t\t\r\n@return TERMS listp; list of cycl-represented-term-p\nReturns a list of CycL terms under each of ROOTS, that are relevant in\nTAXONOMY-MT.")
    public static final SubLObject taxonomy_terms_alt(SubLObject v_taxonomy, SubLObject roots, SubLObject taxonomy_mt) {
        {
            SubLObject terms = NIL;
            SubLObject cdolist_list_var = roots;
            SubLObject root = NIL;
            for (root = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , root = cdolist_list_var.first()) {
                terms = union(terms, ask_utilities.query_variable($sym9$_X, list($$broaderTerm, $sym9$_X, root), taxonomy_mt, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED);
            }
            terms = union(terms, roots, symbol_function(EQUAL), UNPROVIDED);
            terms = set_difference(terms, com.cyc.cycjava.cycl.taxonomy.taxonomy_irrelevant_terms(v_taxonomy), symbol_function(EQUAL), UNPROVIDED);
            return terms;
        }
    }

    /**
     * Returns a list of CycL terms under each of ROOTS, that are relevant in
     * TAXONOMY-MT.
     *
     * @param TAXONOMY
    		cycl-represented-term-p
     * 		
     * @param ROOTS
     * 		listp; list of cycl-represented-term-p
     * @param TAXONOMY-MT
    		hlmt-p
     * 		
     * @return TERMS listp; list of cycl-represented-term-p
     */
    @LispMethod(comment = "Returns a list of CycL terms under each of ROOTS, that are relevant in\r\nTAXONOMY-MT.\r\n\r\n@param TAXONOMY\n\t\tcycl-represented-term-p\r\n\t\t\r\n@param ROOTS\r\n\t\tlistp; list of cycl-represented-term-p\r\n@param TAXONOMY-MT\n\t\thlmt-p\r\n\t\t\r\n@return TERMS listp; list of cycl-represented-term-p\nReturns a list of CycL terms under each of ROOTS, that are relevant in\nTAXONOMY-MT.")
    public static SubLObject taxonomy_terms(final SubLObject v_taxonomy, final SubLObject roots, final SubLObject taxonomy_mt) {
        SubLObject terms = NIL;
        SubLObject cdolist_list_var = roots;
        SubLObject root = NIL;
        root = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            terms = union(terms, ask_utilities.query_variable($sym9$_X, list($$broaderTerm, $sym9$_X, root), taxonomy_mt, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            root = cdolist_list_var.first();
        } 
        terms = union(terms, roots, symbol_function(EQUAL), UNPROVIDED);
        terms = set_difference(terms, taxonomy_irrelevant_terms(v_taxonomy), symbol_function(EQUAL), UNPROVIDED);
        return terms;
    }

    /**
     *
     *
     * @param TERM-NAME
    stringp;
     * 		
     * @return booleanp
     */
    @LispMethod(comment = "@param TERM-NAME\nstringp;\r\n\t\t\r\n@return booleanp")
    public static final SubLObject taxonomy_term_name_needs_disambiguationP_alt(SubLObject term_name) {
        if (length(lexicon_accessors.denots_of_string(term_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)).numG(ONE_INTEGER)) {
            return T;
        }
        return NIL;
    }

    /**
     *
     *
     * @param TERM-NAME
    stringp;
     * 		
     * @return booleanp
     */
    @LispMethod(comment = "@param TERM-NAME\nstringp;\r\n\t\t\r\n@return booleanp")
    public static SubLObject taxonomy_term_name_needs_disambiguationP(final SubLObject term_name) {
        if (length(lexicon_accessors.denots_of_string(term_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)).numG(ONE_INTEGER)) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject clear_taxonomy_generate_non_singular_phrase_alt() {
        {
            SubLObject cs = $taxonomy_generate_non_singular_phrase_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_taxonomy_generate_non_singular_phrase() {
        final SubLObject cs = $taxonomy_generate_non_singular_phrase_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_taxonomy_generate_non_singular_phrase_alt(SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args($taxonomy_generate_non_singular_phrase_caching_state$.getGlobalValue(), list(v_term), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_taxonomy_generate_non_singular_phrase(final SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args($taxonomy_generate_non_singular_phrase_caching_state$.getGlobalValue(), list(v_term), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject taxonomy_generate_non_singular_phrase_internal_alt(SubLObject v_term) {
        return pph_main.generate_phrase(v_term, $list_alt12, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject taxonomy_generate_non_singular_phrase_internal(final SubLObject v_term) {
        return pph_main.generate_phrase(v_term, $list12, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject taxonomy_generate_non_singular_phrase_alt(SubLObject v_term) {
        {
            SubLObject caching_state = $taxonomy_generate_non_singular_phrase_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(TAXONOMY_GENERATE_NON_SINGULAR_PHRASE, $taxonomy_generate_non_singular_phrase_caching_state$, $int$100, EQL, ONE_INTEGER, $int$100);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, $kw15$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw15$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.taxonomy.taxonomy_generate_non_singular_phrase_internal(v_term)));
                    memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject taxonomy_generate_non_singular_phrase(final SubLObject v_term) {
        SubLObject caching_state = $taxonomy_generate_non_singular_phrase_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(TAXONOMY_GENERATE_NON_SINGULAR_PHRASE, $taxonomy_generate_non_singular_phrase_caching_state$, $int$100, EQL, ONE_INTEGER, $int$100);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(taxonomy_generate_non_singular_phrase_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     * Returns a disambiguation string that can be added to the original NL
     * represenation of TERM.  If SECONDARY? is T, i.e. if the disambiguation string
     * is needed for an alternate/secondary NL representation of TERM, then it
     * returns the primary NL representation of the term itself.
     *
     * @param TERM
    cycl-represented-term-p;
     * 		
     * @param SECONDARY?
    booleanp;
     * 		
     * @return stringp
     */
    @LispMethod(comment = "Returns a disambiguation string that can be added to the original NL\r\nrepresenation of TERM.  If SECONDARY? is T, i.e. if the disambiguation string\r\nis needed for an alternate/secondary NL representation of TERM, then it\r\nreturns the primary NL representation of the term itself.\r\n\r\n@param TERM\ncycl-represented-term-p;\r\n\t\t\r\n@param SECONDARY?\nbooleanp;\r\n\t\t\r\n@return stringp\nReturns a disambiguation string that can be added to the original NL\nrepresenation of TERM.  If SECONDARY? is T, i.e. if the disambiguation string\nis needed for an alternate/secondary NL representation of TERM, then it\nreturns the primary NL representation of the term itself.")
    public static final SubLObject taxonomy_term_disambiguation_string_alt(SubLObject v_term, SubLObject secondaryP) {
        if (secondaryP == UNPROVIDED) {
            secondaryP = NIL;
        }
        {
            SubLObject disambiguating_term = (NIL != secondaryP) ? ((SubLObject) (v_term)) : pph_disambiguation.pph_disambiguating_generalizations(list(v_term), UNPROVIDED).first();
            if (NIL == disambiguating_term) {
                Errors.warn($str_alt16$No_disambiguating_generalization_, v_term);
                return NIL;
            }
            return com.cyc.cycjava.cycl.taxonomy.taxonomy_generate_non_singular_phrase(disambiguating_term);
        }
    }

    /**
     * Returns a disambiguation string that can be added to the original NL
     * represenation of TERM.  If SECONDARY? is T, i.e. if the disambiguation string
     * is needed for an alternate/secondary NL representation of TERM, then it
     * returns the primary NL representation of the term itself.
     *
     * @param TERM
    		cycl-represented-term-p;
     * 		
     * @param SECONDARY?
    		booleanp;
     * 		
     * @return stringp
     */
    @LispMethod(comment = "Returns a disambiguation string that can be added to the original NL\r\nrepresenation of TERM.  If SECONDARY? is T, i.e. if the disambiguation string\r\nis needed for an alternate/secondary NL representation of TERM, then it\r\nreturns the primary NL representation of the term itself.\r\n\r\n@param TERM\n\t\tcycl-represented-term-p;\r\n\t\t\r\n@param SECONDARY?\n\t\tbooleanp;\r\n\t\t\r\n@return stringp\nReturns a disambiguation string that can be added to the original NL\nrepresenation of TERM.  If SECONDARY? is T, i.e. if the disambiguation string\nis needed for an alternate/secondary NL representation of TERM, then it\nreturns the primary NL representation of the term itself.")
    public static SubLObject taxonomy_term_disambiguation_string(final SubLObject v_term, SubLObject secondaryP) {
        if (secondaryP == UNPROVIDED) {
            secondaryP = NIL;
        }
        final SubLObject disambiguating_term = (NIL != secondaryP) ? v_term : pph_disambiguation.pph_disambiguating_generalizations(list(v_term), UNPROVIDED).first();
        if (NIL == disambiguating_term) {
            Errors.warn($str15$No_disambiguating_generalization_, v_term);
            return NIL;
        }
        return taxonomy_generate_non_singular_phrase(disambiguating_term);
    }

    /**
     * Returns a disambiguated NL representation of TERM.  TERM-STRING is the
     * ambiguous NL representation of TERM.  If SECONDARY? is T, then it means that
     * TERM-STRING is an alternate/secondary NL representation.
     *
     * @param TERM
    cycl-represented-term-p
     * 		
     * @param TERM-STRING
    stringp
     * 		
     * @param SECONDARY?
    booleanp
     * 		
     * @return stringp
     */
    @LispMethod(comment = "Returns a disambiguated NL representation of TERM.  TERM-STRING is the\r\nambiguous NL representation of TERM.  If SECONDARY? is T, then it means that\r\nTERM-STRING is an alternate/secondary NL representation.\r\n\r\n@param TERM\ncycl-represented-term-p\r\n\t\t\r\n@param TERM-STRING\nstringp\r\n\t\t\r\n@param SECONDARY?\nbooleanp\r\n\t\t\r\n@return stringp\nReturns a disambiguated NL representation of TERM.  TERM-STRING is the\nambiguous NL representation of TERM.  If SECONDARY? is T, then it means that\nTERM-STRING is an alternate/secondary NL representation.")
    public static final SubLObject taxonomy_disambiguated_term_string_alt(SubLObject v_term, SubLObject term_string, SubLObject secondaryP) {
        if (secondaryP == UNPROVIDED) {
            secondaryP = NIL;
        }
        if (NIL != com.cyc.cycjava.cycl.taxonomy.taxonomy_term_name_needs_disambiguationP(term_string)) {
            return cconcatenate(format_nil.format_nil_a_no_copy(term_string), new SubLObject[]{ $str_alt17$__, format_nil.format_nil_a_no_copy(com.cyc.cycjava.cycl.taxonomy.taxonomy_term_disambiguation_string(v_term, secondaryP)), $str_alt18$_ });
        }
        return term_string;
    }

    /**
     * Returns a disambiguated NL representation of TERM.  TERM-STRING is the
     * ambiguous NL representation of TERM.  If SECONDARY? is T, then it means that
     * TERM-STRING is an alternate/secondary NL representation.
     *
     * @param TERM
    		cycl-represented-term-p
     * 		
     * @param TERM-STRING
    		stringp
     * 		
     * @param SECONDARY?
    		booleanp
     * 		
     * @return stringp
     */
    @LispMethod(comment = "Returns a disambiguated NL representation of TERM.  TERM-STRING is the\r\nambiguous NL representation of TERM.  If SECONDARY? is T, then it means that\r\nTERM-STRING is an alternate/secondary NL representation.\r\n\r\n@param TERM\n\t\tcycl-represented-term-p\r\n\t\t\r\n@param TERM-STRING\n\t\tstringp\r\n\t\t\r\n@param SECONDARY?\n\t\tbooleanp\r\n\t\t\r\n@return stringp\nReturns a disambiguated NL representation of TERM.  TERM-STRING is the\nambiguous NL representation of TERM.  If SECONDARY? is T, then it means that\nTERM-STRING is an alternate/secondary NL representation.")
    public static SubLObject taxonomy_disambiguated_term_string(final SubLObject v_term, final SubLObject term_string, SubLObject secondaryP) {
        if (secondaryP == UNPROVIDED) {
            secondaryP = NIL;
        }
        if (NIL != taxonomy_term_name_needs_disambiguationP(term_string)) {
            return cconcatenate(format_nil.format_nil_a_no_copy(term_string), new SubLObject[]{ $str16$__, format_nil.format_nil_a_no_copy(taxonomy_term_disambiguation_string(v_term, secondaryP)), $str17$_ });
        }
        return term_string;
    }

    public static final SubLObject clear_taxonomy_term_name_alt() {
        {
            SubLObject cs = $taxonomy_term_name_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_taxonomy_term_name() {
        final SubLObject cs = $taxonomy_term_name_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_taxonomy_term_name_alt(SubLObject v_taxonomy, SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args($taxonomy_term_name_caching_state$.getGlobalValue(), list(v_taxonomy, v_term), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_taxonomy_term_name(final SubLObject v_taxonomy, final SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args($taxonomy_term_name_caching_state$.getGlobalValue(), list(v_taxonomy, v_term), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns a disambiguated primary NL representation of TERM in TAXONOMY.
     *
     * @param TAXONOMY
    cycl-represented-term-p
     * 		
     * @param TERM
    cycl-represented-term-p
     * 		
     * @param MT
    hlmt-p
     * 		
     * @return stringp
     */
    @LispMethod(comment = "Returns a disambiguated primary NL representation of TERM in TAXONOMY.\r\n\r\n@param TAXONOMY\ncycl-represented-term-p\r\n\t\t\r\n@param TERM\ncycl-represented-term-p\r\n\t\t\r\n@param MT\nhlmt-p\r\n\t\t\r\n@return stringp")
    public static final SubLObject taxonomy_term_name_internal_alt(SubLObject v_taxonomy, SubLObject v_term) {
        {
            SubLObject name = ask_utilities.query_variable($sym9$_X, listS($const20$conceptInSystemDefaultDisplayStri, v_term, v_taxonomy, $list_alt21), $$InferencePSC, UNPROVIDED);
            if (NIL != name) {
                return name.first();
            }
            name = com.cyc.cycjava.cycl.taxonomy.taxonomy_disambiguated_term_string(v_term, com.cyc.cycjava.cycl.taxonomy.taxonomy_generate_non_singular_phrase(v_term), UNPROVIDED);
            return string_utilities.string_substitute($str_alt22$_, $str_alt23$_, name, UNPROVIDED);
        }
    }

    /**
     * Returns a disambiguated primary NL representation of TERM in TAXONOMY.
     *
     * @param TAXONOMY
    		cycl-represented-term-p
     * 		
     * @param TERM
    		cycl-represented-term-p
     * 		
     * @param MT
    		hlmt-p
     * 		
     * @return stringp
     */
    @LispMethod(comment = "Returns a disambiguated primary NL representation of TERM in TAXONOMY.\r\n\r\n@param TAXONOMY\n\t\tcycl-represented-term-p\r\n\t\t\r\n@param TERM\n\t\tcycl-represented-term-p\r\n\t\t\r\n@param MT\n\t\thlmt-p\r\n\t\t\r\n@return stringp")
    public static SubLObject taxonomy_term_name_internal(final SubLObject v_taxonomy, final SubLObject v_term) {
        SubLObject name = ask_utilities.query_variable($sym9$_X, listS($const19$conceptInSystemDefaultDisplayStri, v_term, v_taxonomy, $list20), $$InferencePSC, UNPROVIDED);
        if (NIL != name) {
            return name.first();
        }
        name = taxonomy_disambiguated_term_string(v_term, taxonomy_generate_non_singular_phrase(v_term), UNPROVIDED);
        return string_utilities.string_substitute($str21$_, $str22$_, name, UNPROVIDED);
    }

    public static final SubLObject taxonomy_term_name_alt(SubLObject v_taxonomy, SubLObject v_term) {
        {
            SubLObject caching_state = $taxonomy_term_name_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(TAXONOMY_TERM_NAME, $taxonomy_term_name_caching_state$, $int$1000, EQL, TWO_INTEGER, $int$1000);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(v_taxonomy, v_term);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw15$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (v_taxonomy.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && v_term.eql(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.taxonomy.taxonomy_term_name_internal(v_taxonomy, v_term)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_taxonomy, v_term));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject taxonomy_term_name(final SubLObject v_taxonomy, final SubLObject v_term) {
        SubLObject caching_state = $taxonomy_term_name_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(TAXONOMY_TERM_NAME, $taxonomy_term_name_caching_state$, $int$1000, EQL, TWO_INTEGER, $int$1000);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_taxonomy, v_term);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_taxonomy.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && v_term.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(taxonomy_term_name_internal(v_taxonomy, v_term)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_taxonomy, v_term));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject clear_taxonomy_suppressed_facets_alt() {
        {
            SubLObject cs = $taxonomy_suppressed_facets_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_taxonomy_suppressed_facets() {
        final SubLObject cs = $taxonomy_suppressed_facets_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_taxonomy_suppressed_facets_alt(SubLObject v_taxonomy, SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($taxonomy_suppressed_facets_caching_state$.getGlobalValue(), list(v_taxonomy, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_taxonomy_suppressed_facets(final SubLObject v_taxonomy, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($taxonomy_suppressed_facets_caching_state$.getGlobalValue(), list(v_taxonomy, mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject taxonomy_suppressed_facets_internal_alt(SubLObject v_taxonomy, SubLObject mt) {
        return ask_utilities.query_variable($sym27$_FACET, listS($$suppressFacet, v_taxonomy, $list_alt29), mt, UNPROVIDED);
    }

    public static SubLObject taxonomy_suppressed_facets_internal(final SubLObject v_taxonomy, final SubLObject mt) {
        return ask_utilities.query_variable($sym26$_FACET, listS($$suppressFacet, v_taxonomy, $list28), mt, UNPROVIDED);
    }

    public static final SubLObject taxonomy_suppressed_facets_alt(SubLObject v_taxonomy, SubLObject mt) {
        {
            SubLObject caching_state = $taxonomy_suppressed_facets_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(TAXONOMY_SUPPRESSED_FACETS, $taxonomy_suppressed_facets_caching_state$, $int$100, EQL, TWO_INTEGER, $int$100);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(v_taxonomy, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw15$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (v_taxonomy.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.taxonomy.taxonomy_suppressed_facets_internal(v_taxonomy, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_taxonomy, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject taxonomy_suppressed_facets(final SubLObject v_taxonomy, final SubLObject mt) {
        SubLObject caching_state = $taxonomy_suppressed_facets_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(TAXONOMY_SUPPRESSED_FACETS, $taxonomy_suppressed_facets_caching_state$, $int$100, EQL, TWO_INTEGER, $int$100);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_taxonomy, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_taxonomy.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(taxonomy_suppressed_facets_internal(v_taxonomy, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_taxonomy, mt));
        return memoization_state.caching_results(results3);
    }

    /**
     * Returns an alist of narrower-terms (subset of NTS) grouped by facets on TERM,
     * and a list of narrower-terms (subset of NTS) that are not grouped.
     *
     * @param NTS
     * 		listp of cycl-represented-term-p
     * @param TAXONOMY
    cycl-represented-term-p
     * 		
     * @param TERM
    cycl-represented-term-p
     * 		
     * @param MT
    hlmt-p
     * 		
     * @return alistp - key: cycl-represented-term-p
    value: listp of cycl-represented-term-p
     * @return listp of cycl-represented-term-p
     */
    @LispMethod(comment = "Returns an alist of narrower-terms (subset of NTS) grouped by facets on TERM,\r\nand a list of narrower-terms (subset of NTS) that are not grouped.\r\n\r\n@param NTS\r\n\t\tlistp of cycl-represented-term-p\r\n@param TAXONOMY\ncycl-represented-term-p\r\n\t\t\r\n@param TERM\ncycl-represented-term-p\r\n\t\t\r\n@param MT\nhlmt-p\r\n\t\t\r\n@return alistp - key: cycl-represented-term-p\r\nvalue: listp of cycl-represented-term-p\r\n@return listp of cycl-represented-term-p\nReturns an alist of narrower-terms (subset of NTS) grouped by facets on TERM,\nand a list of narrower-terms (subset of NTS) that are not grouped.")
    public static final SubLObject taxonomy_grouped_narrower_terms_alt(SubLObject nts, SubLObject v_taxonomy, SubLObject v_term, SubLObject mt) {
        {
            SubLObject all_facets = ask_utilities.query_variable($sym27$_FACET, listS($$facets_Generic, v_term, $list_alt29), $$InferencePSC, UNPROVIDED);
            SubLObject suppressed_facets = com.cyc.cycjava.cycl.taxonomy.taxonomy_suppressed_facets(v_taxonomy, mt);
            SubLObject v_facets = set_difference(all_facets, suppressed_facets, UNPROVIDED, UNPROVIDED);
            SubLObject non_grouped_nts = nts;
            SubLObject grouped_nts = NIL;
            SubLObject cdolist_list_var = v_facets;
            SubLObject facet = NIL;
            for (facet = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , facet = cdolist_list_var.first()) {
                {
                    SubLObject values = intersection(nts, isa.all_fort_instances(facet, $$InferencePSC, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                    if (NIL != values) {
                        grouped_nts = acons(facet, values, grouped_nts);
                        non_grouped_nts = set_difference(non_grouped_nts, values, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            return values(grouped_nts, non_grouped_nts);
        }
    }

    /**
     * Returns an alist of narrower-terms (subset of NTS) grouped by facets on TERM,
     * and a list of narrower-terms (subset of NTS) that are not grouped.
     *
     * @param NTS
     * 		listp of cycl-represented-term-p
     * @param TAXONOMY
    		cycl-represented-term-p
     * 		
     * @param TERM
    		cycl-represented-term-p
     * 		
     * @param MT
    		hlmt-p
     * 		
     * @return alistp - key: cycl-represented-term-p
    value: listp of cycl-represented-term-p
     * @return listp of cycl-represented-term-p
     */
    @LispMethod(comment = "Returns an alist of narrower-terms (subset of NTS) grouped by facets on TERM,\r\nand a list of narrower-terms (subset of NTS) that are not grouped.\r\n\r\n@param NTS\r\n\t\tlistp of cycl-represented-term-p\r\n@param TAXONOMY\n\t\tcycl-represented-term-p\r\n\t\t\r\n@param TERM\n\t\tcycl-represented-term-p\r\n\t\t\r\n@param MT\n\t\thlmt-p\r\n\t\t\r\n@return alistp - key: cycl-represented-term-p\r\nvalue: listp of cycl-represented-term-p\r\n@return listp of cycl-represented-term-p\nReturns an alist of narrower-terms (subset of NTS) grouped by facets on TERM,\nand a list of narrower-terms (subset of NTS) that are not grouped.")
    public static SubLObject taxonomy_grouped_narrower_terms(final SubLObject nts, final SubLObject v_taxonomy, final SubLObject v_term, final SubLObject mt) {
        final SubLObject all_facets = ask_utilities.query_variable($sym26$_FACET, listS($$facets_Generic, v_term, $list28), $$InferencePSC, UNPROVIDED);
        final SubLObject suppressed_facets = taxonomy_suppressed_facets(v_taxonomy, mt);
        final SubLObject v_facets = set_difference(all_facets, suppressed_facets, UNPROVIDED, UNPROVIDED);
        SubLObject non_grouped_nts = nts;
        SubLObject grouped_nts = NIL;
        SubLObject cdolist_list_var = v_facets;
        SubLObject facet = NIL;
        facet = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject values = intersection(nts, isa.all_fort_instances(facet, $$InferencePSC, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            if (NIL != values) {
                grouped_nts = acons(facet, values, grouped_nts);
                non_grouped_nts = set_difference(non_grouped_nts, values, UNPROVIDED, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            facet = cdolist_list_var.first();
        } 
        return values(grouped_nts, non_grouped_nts);
    }

    public static final SubLObject taxonomy_nearest_broader_terms_alt(SubLObject pred, SubLObject v_term, SubLObject mt) {
        v_term = narts_high.nart_substitute(v_term);
        if (NIL != gt_utilities.gt_term_p(v_term)) {
            return gt_methods.gt_min_superiors(pred, v_term, mt);
        } else {
            return NIL;
        }
    }

    public static SubLObject taxonomy_nearest_broader_terms(final SubLObject pred, SubLObject v_term, final SubLObject mt) {
        v_term = narts_high.nart_substitute(v_term);
        if (NIL != gt_utilities.gt_term_p(v_term)) {
            return gt_methods.gt_min_superiors(pred, v_term, mt);
        }
        return NIL;
    }

    public static final SubLObject taxonomy_nearest_narrower_terms_alt(SubLObject pred, SubLObject v_term, SubLObject mt) {
        v_term = narts_high.nart_substitute(v_term);
        if (NIL != gt_utilities.gt_term_p(v_term)) {
            return gt_methods.gt_max_inferiors(pred, v_term, mt);
        } else {
            return NIL;
        }
    }

    public static SubLObject taxonomy_nearest_narrower_terms(final SubLObject pred, SubLObject v_term, final SubLObject mt) {
        v_term = narts_high.nart_substitute(v_term);
        if (NIL != gt_utilities.gt_term_p(v_term)) {
            return gt_methods.gt_max_inferiors(pred, v_term, mt);
        }
        return NIL;
    }

    /**
     * Returns a list of strings for which the name of TERM should be used.  It is a
     * list of valid alternate names of TERM.  If DISAMBIGUATE? is non-NIL, then a
     * disambiguation string is attached to an alternate name if needed.
     *
     * @param taxonomy
    cycl-represented-term-p;
     * 		
     * @param term
    cycl-represented-term-p;
     * 		
     * @param mt
    hlmt-p;
     * 		
     * @param term-name
    stringp;
     * 		
     * @return listp; list of stringp
     */
    @LispMethod(comment = "Returns a list of strings for which the name of TERM should be used.  It is a\r\nlist of valid alternate names of TERM.  If DISAMBIGUATE? is non-NIL, then a\r\ndisambiguation string is attached to an alternate name if needed.\r\n\r\n@param taxonomy\ncycl-represented-term-p;\r\n\t\t\r\n@param term\ncycl-represented-term-p;\r\n\t\t\r\n@param mt\nhlmt-p;\r\n\t\t\r\n@param term-name\nstringp;\r\n\t\t\r\n@return listp; list of stringp\nReturns a list of strings for which the name of TERM should be used.  It is a\nlist of valid alternate names of TERM.  If DISAMBIGUATE? is non-NIL, then a\ndisambiguation string is attached to an alternate name if needed.")
    public static final SubLObject taxonomy_term_used_for_alt(SubLObject v_taxonomy, SubLObject v_term, SubLObject mt, SubLObject term_name, SubLObject disambiguateP) {
        if (disambiguateP == UNPROVIDED) {
            disambiguateP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject taxonomy_irrelevant_names = ask_utilities.query_variable($sym9$_X, listS($$taxonomyIrrelevantString, v_taxonomy, v_term, $list_alt21), mt, UNPROVIDED);
                SubLObject taxonomy_term_relations_dict = com.cyc.cycjava.cycl.taxonomy.taxonomy_term_relations_dict();
                SubLObject all_names = NIL;
                SubLObject other_names = NIL;
                SubLObject result = NIL;
                if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_macros.valid_pph_demerit_cutoff_p(TWO_INTEGER)))) {
                    {
                        SubLObject new_format_string = cconcatenate($str_alt33$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt34$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(TWO_INTEGER), new SubLObject[]{ $str_alt35$_is_not_a_, format_nil.format_nil_s_no_copy(VALID_PPH_DEMERIT_CUTOFF_P) })) });
                        pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                    }
                }
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                    try {
                        pph_vars.$pph_demerit_cutoff$.bind(TWO_INTEGER, thread);
                        all_names = pph_methods_lexicon.all_phrases_for_term(v_term, $list_alt12, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0, thread);
                    }
                }
                other_names = remove(com.cyc.cycjava.cycl.taxonomy.taxonomy_generate_non_singular_phrase(v_term), set_difference(all_names, taxonomy_irrelevant_names, EQUAL, UNPROVIDED), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == disambiguateP) {
                    return other_names;
                }
                {
                    SubLObject cdolist_list_var = other_names;
                    SubLObject name = NIL;
                    for (name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , name = cdolist_list_var.first()) {
                        {
                            SubLObject alternate_name = com.cyc.cycjava.cycl.taxonomy.taxonomy_disambiguated_term_string(v_term, name, T);
                            if (NIL != taxonomy_term_relations_dict) {
                                {
                                    SubLObject dict_term_plist = dictionary.dictionary_lookup(taxonomy_term_relations_dict, alternate_name, UNPROVIDED);
                                    if (NIL != dict_term_plist) {
                                        {
                                            SubLObject dict_term = getf(dict_term_plist, $CYCL, UNPROVIDED);
                                            if (NIL != dict_term) {
                                                Errors.warn($str_alt38$_S_is_being_used_as_a_name_for__A, alternate_name, dict_term, v_term);
                                            } else {
                                                {
                                                    SubLObject use_term_name = getf(dict_term_plist, $USE, UNPROVIDED);
                                                    SubLObject use_term = getf(dictionary.dictionary_lookup(taxonomy_term_relations_dict, use_term_name, UNPROVIDED), $CYCL, UNPROVIDED);
                                                    Errors.warn($str_alt40$_S_is_being_used_as_an_alternate_, new SubLObject[]{ alternate_name, use_term_name, use_term, v_term });
                                                }
                                            }
                                        }
                                    } else {
                                        dictionary.dictionary_enter(taxonomy_term_relations_dict, alternate_name, list($UID, add(dictionary.dictionary_length(taxonomy_term_relations_dict), $int$10000), $USE, term_name));
                                    }
                                }
                            }
                            result = cons(alternate_name, result);
                        }
                    }
                }
                return result;
            }
        }
    }

    /**
     * Returns a list of strings for which the name of TERM should be used.  It is a
     * list of valid alternate names of TERM.  If DISAMBIGUATE? is non-NIL, then a
     * disambiguation string is attached to an alternate name if needed.
     *
     * @param taxonomy
    		cycl-represented-term-p;
     * 		
     * @param term
    		cycl-represented-term-p;
     * 		
     * @param mt
    		hlmt-p;
     * 		
     * @param term-name
    		stringp;
     * 		
     * @return listp; list of stringp
     */
    @LispMethod(comment = "Returns a list of strings for which the name of TERM should be used.  It is a\r\nlist of valid alternate names of TERM.  If DISAMBIGUATE? is non-NIL, then a\r\ndisambiguation string is attached to an alternate name if needed.\r\n\r\n@param taxonomy\n\t\tcycl-represented-term-p;\r\n\t\t\r\n@param term\n\t\tcycl-represented-term-p;\r\n\t\t\r\n@param mt\n\t\thlmt-p;\r\n\t\t\r\n@param term-name\n\t\tstringp;\r\n\t\t\r\n@return listp; list of stringp\nReturns a list of strings for which the name of TERM should be used.  It is a\nlist of valid alternate names of TERM.  If DISAMBIGUATE? is non-NIL, then a\ndisambiguation string is attached to an alternate name if needed.")
    public static SubLObject taxonomy_term_used_for(final SubLObject v_taxonomy, final SubLObject v_term, final SubLObject mt, final SubLObject term_name, SubLObject disambiguateP) {
        if (disambiguateP == UNPROVIDED) {
            disambiguateP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject taxonomy_irrelevant_names = ask_utilities.query_variable($sym9$_X, listS($$taxonomyIrrelevantString, v_taxonomy, v_term, $list20), mt, UNPROVIDED);
        final SubLObject taxonomy_term_relations_dict = taxonomy_term_relations_dict();
        SubLObject all_names = NIL;
        SubLObject other_names = NIL;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
        try {
            pph_vars.$pph_demerit_cutoff$.bind(TWO_INTEGER, thread);
            all_names = pph_methods_lexicon.all_phrases_for_term(v_term, $list12, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0, thread);
        }
        other_names = remove(taxonomy_generate_non_singular_phrase(v_term), set_difference(all_names, taxonomy_irrelevant_names, EQUAL, UNPROVIDED), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == disambiguateP) {
            return other_names;
        }
        SubLObject cdolist_list_var = other_names;
        SubLObject name = NIL;
        name = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject alternate_name = taxonomy_disambiguated_term_string(v_term, name, T);
            if (NIL != taxonomy_term_relations_dict) {
                final SubLObject dict_term_plist = dictionary.dictionary_lookup(taxonomy_term_relations_dict, alternate_name, UNPROVIDED);
                if (NIL != dict_term_plist) {
                    final SubLObject dict_term = getf(dict_term_plist, $CYCL, UNPROVIDED);
                    if (NIL != dict_term) {
                        Errors.warn($str33$_S_is_being_used_as_a_name_for__A, alternate_name, dict_term, v_term);
                    } else {
                        final SubLObject use_term_name = getf(dict_term_plist, $USE, UNPROVIDED);
                        final SubLObject use_term = getf(dictionary.dictionary_lookup(taxonomy_term_relations_dict, use_term_name, UNPROVIDED), $CYCL, UNPROVIDED);
                        Errors.warn($str35$_S_is_being_used_as_an_alternate_, new SubLObject[]{ alternate_name, use_term_name, use_term, v_term });
                    }
                } else {
                    dictionary.dictionary_enter(taxonomy_term_relations_dict, alternate_name, list($UID, add(dictionary.dictionary_length(taxonomy_term_relations_dict), $int$10000), $USE, term_name));
                }
            }
            result = cons(alternate_name, result);
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject taxonomy_initialize_term_relations_dict_alt(SubLObject v_taxonomy, SubLObject terms, SubLObject mt, SubLObject pred) {
        if (pred == UNPROVIDED) {
            pred = $$broaderTerm;
        }
        {
            SubLObject taxonomy_term_relations_dict = com.cyc.cycjava.cycl.taxonomy.taxonomy_term_relations_dict();
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                {
                    SubLObject term_name = com.cyc.cycjava.cycl.taxonomy.taxonomy_term_name(v_taxonomy, v_term);
                    SubLObject dict_term = getf(dictionary.dictionary_lookup(taxonomy_term_relations_dict, term_name, UNPROVIDED), $CYCL, UNPROVIDED);
                    if (NIL != dict_term) {
                        Errors.warn($str_alt43$_S_is_being_used_as_a_name_for__A, term_name, dict_term, v_term);
                    } else {
                        {
                            SubLObject broader_terms = com.cyc.cycjava.cycl.taxonomy.taxonomy_nearest_broader_terms(pred, v_term, mt);
                            SubLObject narrower_terms = com.cyc.cycjava.cycl.taxonomy.taxonomy_nearest_narrower_terms(pred, v_term, mt);
                            SubLObject used_for = com.cyc.cycjava.cycl.taxonomy.taxonomy_term_used_for(v_taxonomy, v_term, mt, term_name, UNPROVIDED);
                            SubLObject term_plist = list(new SubLObject[]{ $UID, add(dictionary.dictionary_length(taxonomy_term_relations_dict), $int$10000), $CYCL, v_term, $BT, broader_terms, $NT, narrower_terms, $UF, used_for });
                            dictionary.dictionary_enter(taxonomy_term_relations_dict, term_name, term_plist);
                        }
                    }
                }
            }
        }
        return v_taxonomy;
    }

    public static SubLObject taxonomy_initialize_term_relations_dict(final SubLObject v_taxonomy, final SubLObject terms, final SubLObject mt, SubLObject pred) {
        if (pred == UNPROVIDED) {
            pred = $$broaderTerm;
        }
        final SubLObject taxonomy_term_relations_dict = taxonomy_term_relations_dict();
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject term_name = taxonomy_term_name(v_taxonomy, v_term);
            final SubLObject dict_term = getf(dictionary.dictionary_lookup(taxonomy_term_relations_dict, term_name, UNPROVIDED), $CYCL, UNPROVIDED);
            if (NIL != dict_term) {
                Errors.warn($str38$_S_is_being_used_as_a_name_for__A, term_name, dict_term, v_term);
            } else {
                final SubLObject broader_terms = taxonomy_nearest_broader_terms(pred, v_term, mt);
                final SubLObject narrower_terms = taxonomy_nearest_narrower_terms(pred, v_term, mt);
                final SubLObject used_for = taxonomy_term_used_for(v_taxonomy, v_term, mt, term_name, UNPROVIDED);
                final SubLObject term_plist = list(new SubLObject[]{ $UID, add(dictionary.dictionary_length(taxonomy_term_relations_dict), $int$10000), $CYCL, v_term, $BT, broader_terms, $NT, narrower_terms, $UF, used_for });
                dictionary.dictionary_enter(taxonomy_term_relations_dict, term_name, term_plist);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return v_taxonomy;
    }

    public static final SubLObject clear_taxonomy_caches_alt() {
        com.cyc.cycjava.cycl.taxonomy.clear_taxonomy_generate_non_singular_phrase();
        com.cyc.cycjava.cycl.taxonomy.clear_taxonomy_term_name();
        com.cyc.cycjava.cycl.taxonomy.clear_taxonomy_suppressed_facets();
        return $CLEARED;
    }

    public static SubLObject clear_taxonomy_caches() {
        clear_taxonomy_generate_non_singular_phrase();
        clear_taxonomy_term_name();
        clear_taxonomy_suppressed_facets();
        return $CLEARED;
    }

    /**
     * Write out the string representations of TERMS in alphabetical order.
     * EXTRA-SPACES is the number of extra leading spaces that should be written
     * out before the string.
     *
     * @param TAXONOMY
    cycl-represented-term-p
     * 		
     * @param TERMS
     * 		listp of cycl-represented-term-p
     * @param MT
    hlmt-p
     * 		
     * @param STREAM
     * 		
     * @param EXTRA-SPACES
    non-negative-integer-p
     * 		
     */
    @LispMethod(comment = "Write out the string representations of TERMS in alphabetical order.\r\nEXTRA-SPACES is the number of extra leading spaces that should be written\r\nout before the string.\r\n\r\n@param TAXONOMY\ncycl-represented-term-p\r\n\t\t\r\n@param TERMS\r\n\t\tlistp of cycl-represented-term-p\r\n@param MT\nhlmt-p\r\n\t\t\r\n@param STREAM\r\n\t\t\r\n@param EXTRA-SPACES\nnon-negative-integer-p\nWrite out the string representations of TERMS in alphabetical order.\nEXTRA-SPACES is the number of extra leading spaces that should be written\nout before the string.")
    public static final SubLObject taxonomy_write_list_alt(SubLObject v_taxonomy, SubLObject terms, SubLObject stream, SubLObject extra_spaces) {
        if (extra_spaces == UNPROVIDED) {
            extra_spaces = ZERO_INTEGER;
        }
        {
            SubLObject names = NIL;
            {
                SubLObject cdolist_list_var = terms;
                SubLObject v_term = NIL;
                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                    names = cons(com.cyc.cycjava.cycl.taxonomy.taxonomy_term_name(v_taxonomy, v_term), names);
                }
            }
            names = Sort.sort(names, STRING_LESSP, UNPROVIDED);
            {
                SubLObject cdolist_list_var = names;
                SubLObject name = NIL;
                for (name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , name = cdolist_list_var.first()) {
                    string_utilities.indent(stream, extra_spaces);
                    format(stream, $str_alt49$_____A__, name);
                }
            }
        }
        return v_taxonomy;
    }

    /**
     * Write out the string representations of TERMS in alphabetical order.
     * EXTRA-SPACES is the number of extra leading spaces that should be written
     * out before the string.
     *
     * @param TAXONOMY
    		cycl-represented-term-p
     * 		
     * @param TERMS
     * 		listp of cycl-represented-term-p
     * @param MT
    		hlmt-p
     * 		
     * @param STREAM
     * 		
     * @param EXTRA-SPACES
    		non-negative-integer-p
     * 		
     */
    @LispMethod(comment = "Write out the string representations of TERMS in alphabetical order.\r\nEXTRA-SPACES is the number of extra leading spaces that should be written\r\nout before the string.\r\n\r\n@param TAXONOMY\n\t\tcycl-represented-term-p\r\n\t\t\r\n@param TERMS\r\n\t\tlistp of cycl-represented-term-p\r\n@param MT\n\t\thlmt-p\r\n\t\t\r\n@param STREAM\r\n\t\t\r\n@param EXTRA-SPACES\n\t\tnon-negative-integer-p\nWrite out the string representations of TERMS in alphabetical order.\nEXTRA-SPACES is the number of extra leading spaces that should be written\nout before the string.")
    public static SubLObject taxonomy_write_list(final SubLObject v_taxonomy, final SubLObject terms, final SubLObject stream, SubLObject extra_spaces) {
        if (extra_spaces == UNPROVIDED) {
            extra_spaces = ZERO_INTEGER;
        }
        SubLObject names = NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            names = cons(taxonomy_term_name(v_taxonomy, v_term), names);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        names = cdolist_list_var = Sort.sort(names, STRING_LESSP, UNPROVIDED);
        SubLObject name = NIL;
        name = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            string_utilities.indent(stream, extra_spaces);
            format(stream, $str44$_____A__, name);
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        } 
        return v_taxonomy;
    }

    /**
     * Write out the string representations of values of GROUPED-TERMS under the
     * keys in alphabetical order and proper indentation.
     */
    @LispMethod(comment = "Write out the string representations of values of GROUPED-TERMS under the\r\nkeys in alphabetical order and proper indentation.\nWrite out the string representations of values of GROUPED-TERMS under the\nkeys in alphabetical order and proper indentation.")
    public static final SubLObject taxonomy_write_alist_alt(SubLObject v_taxonomy, SubLObject grouped_terms, SubLObject stream) {
        {
            SubLObject cdolist_list_var = grouped_terms;
            SubLObject term_group = NIL;
            for (term_group = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , term_group = cdolist_list_var.first()) {
                format(stream, $str_alt50$______A___, com.cyc.cycjava.cycl.taxonomy.taxonomy_term_name(v_taxonomy, term_group.first()));
                com.cyc.cycjava.cycl.taxonomy.taxonomy_write_list(v_taxonomy, term_group.rest(), stream, TWO_INTEGER);
            }
        }
        return v_taxonomy;
    }

    @LispMethod(comment = "Write out the string representations of values of GROUPED-TERMS under the\r\nkeys in alphabetical order and proper indentation.\nWrite out the string representations of values of GROUPED-TERMS under the\nkeys in alphabetical order and proper indentation.")
    public static SubLObject taxonomy_write_alist(final SubLObject v_taxonomy, final SubLObject grouped_terms, final SubLObject stream) {
        SubLObject cdolist_list_var = grouped_terms;
        SubLObject term_group = NIL;
        term_group = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            format(stream, $str45$______A___, taxonomy_term_name(v_taxonomy, term_group.first()));
            taxonomy_write_list(v_taxonomy, term_group.rest(), stream, TWO_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            term_group = cdolist_list_var.first();
        } 
        return v_taxonomy;
    }

    /**
     * Write the details of a term in TAXONOMY.  This is a part of the 'Flat
     * Display' of the taxonomy.
     */
    @LispMethod(comment = "Write the details of a term in TAXONOMY.  This is a part of the \'Flat\r\nDisplay\' of the taxonomy.\nWrite the details of a term in TAXONOMY.  This is a part of the \'Flat\nDisplay\' of the taxonomy.")
    public static final SubLObject display_taxonomy_term_details_alt(SubLObject v_taxonomy, SubLObject mt, SubLObject term_name, SubLObject term_plist, SubLObject stream, SubLObject group_ntsP) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (group_ntsP == UNPROVIDED) {
            group_ntsP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_term = getf(term_plist, $CYCL, UNPROVIDED);
                SubLObject broader_terms = getf(term_plist, $BT, UNPROVIDED);
                SubLObject narrower_terms = getf(term_plist, $NT, UNPROVIDED);
                SubLObject used_for = getf(term_plist, $UF, UNPROVIDED);
                SubLObject use = getf(term_plist, $USE, UNPROVIDED);
                SubLObject unfaceted_nts = narrower_terms;
                SubLObject faceted_nts = NIL;
                format(stream, $str_alt51$_A__, term_name);
                if (NIL != broader_terms) {
                    format(stream, $str_alt52$__BT__);
                    com.cyc.cycjava.cycl.taxonomy.taxonomy_write_list(v_taxonomy, broader_terms, stream, UNPROVIDED);
                }
                if (NIL != group_ntsP) {
                    thread.resetMultipleValues();
                    {
                        SubLObject faceted_nts_1 = com.cyc.cycjava.cycl.taxonomy.taxonomy_grouped_narrower_terms(narrower_terms, v_taxonomy, v_term, mt);
                        SubLObject unfaceted_nts_2 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        faceted_nts = faceted_nts_1;
                        unfaceted_nts = unfaceted_nts_2;
                    }
                }
                if ((NIL != faceted_nts) || (NIL != unfaceted_nts)) {
                    format(stream, $str_alt53$__NT__);
                    com.cyc.cycjava.cycl.taxonomy.taxonomy_write_list(v_taxonomy, unfaceted_nts, stream, UNPROVIDED);
                    com.cyc.cycjava.cycl.taxonomy.taxonomy_write_alist(v_taxonomy, faceted_nts, stream);
                }
                if (NIL != used_for) {
                    format(stream, $str_alt54$__UF__);
                    {
                        SubLObject cdolist_list_var = Sort.sort(used_for, STRING_LESSP, UNPROVIDED);
                        SubLObject v_term_3 = NIL;
                        for (v_term_3 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term_3 = cdolist_list_var.first()) {
                            format(stream, $str_alt49$_____A__, v_term_3);
                        }
                    }
                }
                if (NIL != use) {
                    format(stream, $str_alt55$__USE_______A__, use);
                }
            }
            return term_name;
        }
    }

    @LispMethod(comment = "Write the details of a term in TAXONOMY.  This is a part of the \'Flat\r\nDisplay\' of the taxonomy.\nWrite the details of a term in TAXONOMY.  This is a part of the \'Flat\nDisplay\' of the taxonomy.")
    public static SubLObject display_taxonomy_term_details(final SubLObject v_taxonomy, final SubLObject mt, final SubLObject term_name, final SubLObject term_plist, SubLObject stream, SubLObject group_ntsP) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (group_ntsP == UNPROVIDED) {
            group_ntsP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = getf(term_plist, $CYCL, UNPROVIDED);
        final SubLObject broader_terms = getf(term_plist, $BT, UNPROVIDED);
        final SubLObject narrower_terms = getf(term_plist, $NT, UNPROVIDED);
        final SubLObject used_for = getf(term_plist, $UF, UNPROVIDED);
        final SubLObject use = getf(term_plist, $USE, UNPROVIDED);
        SubLObject unfaceted_nts = narrower_terms;
        SubLObject faceted_nts = NIL;
        format(stream, $str46$_A__, term_name);
        if (NIL != broader_terms) {
            format(stream, $str47$__BT__);
            taxonomy_write_list(v_taxonomy, broader_terms, stream, UNPROVIDED);
        }
        if (NIL != group_ntsP) {
            thread.resetMultipleValues();
            final SubLObject faceted_nts_$1 = taxonomy_grouped_narrower_terms(narrower_terms, v_taxonomy, v_term, mt);
            final SubLObject unfaceted_nts_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            faceted_nts = faceted_nts_$1;
            unfaceted_nts = unfaceted_nts_$2;
        }
        if ((NIL != faceted_nts) || (NIL != unfaceted_nts)) {
            format(stream, $str48$__NT__);
            taxonomy_write_list(v_taxonomy, unfaceted_nts, stream, UNPROVIDED);
            taxonomy_write_alist(v_taxonomy, faceted_nts, stream);
        }
        if (NIL != used_for) {
            format(stream, $str49$__UF__);
            SubLObject cdolist_list_var = Sort.sort(used_for, STRING_LESSP, UNPROVIDED);
            SubLObject v_term_$3 = NIL;
            v_term_$3 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                format(stream, $str44$_____A__, v_term_$3);
                cdolist_list_var = cdolist_list_var.rest();
                v_term_$3 = cdolist_list_var.first();
            } 
        }
        if (NIL != use) {
            format(stream, $str50$__USE_______A__, use);
        }
        return term_name;
    }

    /**
     * Provides a flat display of TAXONOMY.  The flat display is a an alphabetized
     * list of the terms (and their individual relations) that occur in this
     * taxonomy.  If GROUP-NTS? is non-NIL, then the narrower terms will be grouped
     * together based on facets of their broader term.
     */
    @LispMethod(comment = "Provides a flat display of TAXONOMY.  The flat display is a an alphabetized\r\nlist of the terms (and their individual relations) that occur in this\r\ntaxonomy.  If GROUP-NTS? is non-NIL, then the narrower terms will be grouped\r\ntogether based on facets of their broader term.\nProvides a flat display of TAXONOMY.  The flat display is a an alphabetized\nlist of the terms (and their individual relations) that occur in this\ntaxonomy.  If GROUP-NTS? is non-NIL, then the narrower terms will be grouped\ntogether based on facets of their broader term.")
    public static final SubLObject write_taxonomy_flat_alt(SubLObject v_taxonomy, SubLObject roots, SubLObject stream, SubLObject terms, SubLObject group_ntsP) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (terms == UNPROVIDED) {
            terms = NIL;
        }
        if (group_ntsP == UNPROVIDED) {
            group_ntsP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt = com.cyc.cycjava.cycl.taxonomy.taxonomy_mt(v_taxonomy);
                {
                    SubLObject _prev_bind_0 = $taxonomy_term_relations_dict$.currentBinding(thread);
                    try {
                        $taxonomy_term_relations_dict$.bind(dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED), thread);
                        {
                            SubLObject sorted_alist = NIL;
                            if (NIL == terms) {
                                terms = com.cyc.cycjava.cycl.taxonomy.taxonomy_terms(v_taxonomy, roots, mt);
                            }
                            com.cyc.cycjava.cycl.taxonomy.taxonomy_initialize_term_relations_dict(v_taxonomy, terms, mt, UNPROVIDED);
                            sorted_alist = dictionary_utilities.sort_dictionary_by_keys(com.cyc.cycjava.cycl.taxonomy.taxonomy_term_relations_dict(), STRING_LESSP);
                            {
                                SubLObject cdolist_list_var = sorted_alist;
                                SubLObject pair = NIL;
                                for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                                    {
                                        SubLObject term_name = pair.first();
                                        SubLObject term_plist = pair.rest();
                                        com.cyc.cycjava.cycl.taxonomy.display_taxonomy_term_details(v_taxonomy, mt, term_name, term_plist, stream, group_ntsP);
                                        format(stream, $str_alt56$__);
                                    }
                                }
                            }
                        }
                    } finally {
                        $taxonomy_term_relations_dict$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return v_taxonomy;
        }
    }

    /**
     * Provides a flat display of TAXONOMY.  The flat display is a an alphabetized
     * list of the terms (and their individual relations) that occur in this
     * taxonomy.  If GROUP-NTS? is non-NIL, then the narrower terms will be grouped
     * together based on facets of their broader term.
     */
    @LispMethod(comment = "Provides a flat display of TAXONOMY.  The flat display is a an alphabetized\r\nlist of the terms (and their individual relations) that occur in this\r\ntaxonomy.  If GROUP-NTS? is non-NIL, then the narrower terms will be grouped\r\ntogether based on facets of their broader term.\nProvides a flat display of TAXONOMY.  The flat display is a an alphabetized\nlist of the terms (and their individual relations) that occur in this\ntaxonomy.  If GROUP-NTS? is non-NIL, then the narrower terms will be grouped\ntogether based on facets of their broader term.")
    public static SubLObject write_taxonomy_flat(final SubLObject v_taxonomy, final SubLObject roots, SubLObject stream, SubLObject terms, SubLObject group_ntsP) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (terms == UNPROVIDED) {
            terms = NIL;
        }
        if (group_ntsP == UNPROVIDED) {
            group_ntsP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = taxonomy_mt(v_taxonomy);
        final SubLObject _prev_bind_0 = $taxonomy_term_relations_dict$.currentBinding(thread);
        try {
            $taxonomy_term_relations_dict$.bind(dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED), thread);
            SubLObject sorted_alist = NIL;
            if (NIL == terms) {
                terms = taxonomy_terms(v_taxonomy, roots, mt);
            }
            taxonomy_initialize_term_relations_dict(v_taxonomy, terms, mt, UNPROVIDED);
            SubLObject cdolist_list_var;
            sorted_alist = cdolist_list_var = dictionary_utilities.sort_dictionary_by_keys(taxonomy_term_relations_dict(), STRING_LESSP);
            SubLObject pair = NIL;
            pair = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject term_name = pair.first();
                final SubLObject term_plist = pair.rest();
                display_taxonomy_term_details(v_taxonomy, mt, term_name, term_plist, stream, group_ntsP);
                format(stream, $str51$__);
                cdolist_list_var = cdolist_list_var.rest();
                pair = cdolist_list_var.first();
            } 
        } finally {
            $taxonomy_term_relations_dict$.rebind(_prev_bind_0, thread);
        }
        return v_taxonomy;
    }

    public static final SubLObject write_taxonomy_flat_to_file_alt(SubLObject pathname, SubLObject v_taxonomy, SubLObject topics, SubLObject group_ntsP) {
        if (group_ntsP == UNPROVIDED) {
            group_ntsP = T;
        }
        {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(pathname, $OUTPUT, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt58$Unable_to_open__S, pathname);
                }
                {
                    SubLObject s_out = stream;
                    SubLObject mt = com.cyc.cycjava.cycl.taxonomy.taxonomy_mt(v_taxonomy);
                    SubLObject terms = com.cyc.cycjava.cycl.taxonomy.taxonomy_terms(v_taxonomy, topics, mt);
                    com.cyc.cycjava.cycl.taxonomy.write_taxonomy_flat(v_taxonomy, NIL, s_out, terms, group_ntsP);
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
        return pathname;
    }

    public static SubLObject write_taxonomy_flat_to_file(final SubLObject pathname, final SubLObject v_taxonomy, final SubLObject topics, SubLObject group_ntsP) {
        if (group_ntsP == UNPROVIDED) {
            group_ntsP = T;
        }
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(pathname, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str53$Unable_to_open__S, pathname);
            }
            final SubLObject s_out = stream;
            final SubLObject mt = taxonomy_mt(v_taxonomy);
            final SubLObject terms = taxonomy_terms(v_taxonomy, topics, mt);
            write_taxonomy_flat(v_taxonomy, NIL, s_out, terms, group_ntsP);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return pathname;
    }

    /**
     * Sort a list of cycl-represented-term-p based on their NL representations.
     */
    @LispMethod(comment = "Sort a list of cycl-represented-term-p based on their NL representations.")
    public static final SubLObject taxonomy_sort_by_name_alt(SubLObject v_taxonomy, SubLObject terms) {
        {
            SubLObject term_names = NIL;
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                term_names = acons(v_term, Strings.string_downcase(com.cyc.cycjava.cycl.taxonomy.taxonomy_term_name(v_taxonomy, v_term), UNPROVIDED, UNPROVIDED), term_names);
            }
            term_names = list_utilities.sort_alist_by_values(term_names, $sym59$STRING_);
            return list_utilities.alist_keys(term_names);
        }
    }

    @LispMethod(comment = "Sort a list of cycl-represented-term-p based on their NL representations.")
    public static SubLObject taxonomy_sort_by_name(final SubLObject v_taxonomy, final SubLObject terms) {
        SubLObject term_names = NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            term_names = acons(v_term, Strings.string_downcase(taxonomy_term_name(v_taxonomy, v_term), UNPROVIDED, UNPROVIDED), term_names);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        term_names = list_utilities.sort_alist_by_values(term_names, $sym54$STRING_);
        return list_utilities.alist_keys(term_names);
    }/**
     * Sort a list of cycl-represented-term-p based on their NL representations.
     */


    /**
     *
     *
     * @param USED-NAMES
    dictionary-p
     * 		
     * @param term-name
    stringp
     * 		
     * @param term
    cycl-represented-term-p
     * 		
     */
    @LispMethod(comment = "@param USED-NAMES\ndictionary-p\r\n\t\t\r\n@param term-name\nstringp\r\n\t\t\r\n@param term\ncycl-represented-term-p")
    public static final SubLObject taxonomy_update_used_names_alt(SubLObject used_names, SubLObject term_name, SubLObject v_term) {
        {
            SubLObject term_value = dictionary.dictionary_lookup(used_names, term_name, UNPROVIDED);
            if (NIL != term_value) {
                if (!term_value.equal(v_term)) {
                    Errors.warn($str_alt60$Did_not_write_out__S_because_it_s, v_term, term_value);
                    return NIL;
                }
            } else {
                dictionary.dictionary_enter(used_names, term_name, v_term);
            }
        }
        return used_names;
    }

    /**
     *
     *
     * @param USED-NAMES
    dictionary-p
     * 		
     * @param term-name
    stringp
     * 		
     * @param term
    cycl-represented-term-p
     * 		
     */
    @LispMethod(comment = "@param USED-NAMES\ndictionary-p\r\n\t\t\r\n@param term-name\nstringp\r\n\t\t\r\n@param term\ncycl-represented-term-p")
    public static SubLObject taxonomy_update_used_names(final SubLObject used_names, final SubLObject term_name, final SubLObject v_term) {
        final SubLObject term_value = dictionary.dictionary_lookup(used_names, term_name, UNPROVIDED);
        if (NIL != term_value) {
            if (!term_value.equal(v_term)) {
                Errors.warn($str55$Did_not_write_out__S_because_it_s, v_term, term_value);
                return NIL;
            }
        } else {
            dictionary.dictionary_enter(used_names, term_name, v_term);
        }
        return used_names;
    }

    public static final SubLObject display_taxonomy_alt(SubLObject v_taxonomy, SubLObject topic, SubLObject used_names, SubLObject irrelevant_terms, SubLObject stream, SubLObject spaces, SubLObject v_char, SubLObject group_ntsP) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (spaces == UNPROVIDED) {
            spaces = ZERO_INTEGER;
        }
        if (v_char == UNPROVIDED) {
            v_char = CHAR_period;
        }
        if (group_ntsP == UNPROVIDED) {
            group_ntsP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != subl_promotions.memberP(topic, irrelevant_terms, symbol_function(EQUAL), UNPROVIDED)) {
                return NIL;
            }
            {
                SubLObject mt = com.cyc.cycjava.cycl.taxonomy.taxonomy_mt(v_taxonomy);
                SubLObject topic_name = com.cyc.cycjava.cycl.taxonomy.taxonomy_term_name(v_taxonomy, topic);
                used_names = com.cyc.cycjava.cycl.taxonomy.taxonomy_update_used_names(used_names, topic_name, topic);
                if (NIL == used_names) {
                    return NIL;
                }
                {
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(spaces); i = add(i, ONE_INTEGER)) {
                        format(stream, $str_alt61$_C, v_char);
                    }
                }
                format(stream, $str_alt51$_A__, topic_name);
                spaces = add(spaces, ONE_INTEGER);
                {
                    SubLObject narrower_terms = com.cyc.cycjava.cycl.taxonomy.taxonomy_nearest_narrower_terms($$broaderTerm, topic, mt);
                    SubLObject unfaceted_nts = narrower_terms;
                    SubLObject faceted_nts = NIL;
                    if (NIL != group_ntsP) {
                        thread.resetMultipleValues();
                        {
                            SubLObject faceted_nts_4 = com.cyc.cycjava.cycl.taxonomy.taxonomy_grouped_narrower_terms(narrower_terms, v_taxonomy, topic, mt);
                            SubLObject unfaceted_nts_5 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            faceted_nts = faceted_nts_4;
                            unfaceted_nts = unfaceted_nts_5;
                        }
                    }
                    {
                        SubLObject cdolist_list_var = com.cyc.cycjava.cycl.taxonomy.taxonomy_sort_by_name(v_taxonomy, unfaceted_nts);
                        SubLObject child = NIL;
                        for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                            com.cyc.cycjava.cycl.taxonomy.display_taxonomy(v_taxonomy, child, used_names, irrelevant_terms, stream, spaces, v_char, group_ntsP);
                        }
                    }
                    {
                        SubLObject cdolist_list_var = faceted_nts;
                        SubLObject faceted_nt = NIL;
                        for (faceted_nt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , faceted_nt = cdolist_list_var.first()) {
                            {
                                SubLObject facet = faceted_nt.first();
                                SubLObject facet_name = com.cyc.cycjava.cycl.taxonomy.taxonomy_term_name(v_taxonomy, facet);
                                if (NIL != subl_promotions.memberP(facet, irrelevant_terms, symbol_function(EQUAL), UNPROVIDED)) {
                                    return NIL;
                                }
                                used_names = com.cyc.cycjava.cycl.taxonomy.taxonomy_update_used_names(used_names, facet_name, facet);
                                if (NIL == used_names) {
                                    return NIL;
                                }
                                {
                                    SubLObject i = NIL;
                                    for (i = ZERO_INTEGER; i.numL(spaces); i = add(i, ONE_INTEGER)) {
                                        format(stream, $str_alt61$_C, v_char);
                                    }
                                }
                                format(stream, $str_alt62$__A___, facet_name);
                            }
                            {
                                SubLObject cdolist_list_var_6 = com.cyc.cycjava.cycl.taxonomy.taxonomy_sort_by_name(v_taxonomy, faceted_nt.rest());
                                SubLObject child = NIL;
                                for (child = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , child = cdolist_list_var_6.first()) {
                                    com.cyc.cycjava.cycl.taxonomy.display_taxonomy(v_taxonomy, child, used_names, irrelevant_terms, stream, add(spaces, ONE_INTEGER), v_char, group_ntsP);
                                }
                            }
                        }
                    }
                }
            }
            return topic;
        }
    }

    public static SubLObject display_taxonomy(final SubLObject v_taxonomy, final SubLObject topic, SubLObject used_names, final SubLObject irrelevant_terms, SubLObject stream, SubLObject spaces, SubLObject v_char, SubLObject group_ntsP) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (spaces == UNPROVIDED) {
            spaces = ZERO_INTEGER;
        }
        if (v_char == UNPROVIDED) {
            v_char = CHAR_period;
        }
        if (group_ntsP == UNPROVIDED) {
            group_ntsP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != subl_promotions.memberP(topic, irrelevant_terms, symbol_function(EQUAL), UNPROVIDED)) {
            return NIL;
        }
        final SubLObject mt = taxonomy_mt(v_taxonomy);
        final SubLObject topic_name = taxonomy_term_name(v_taxonomy, topic);
        used_names = taxonomy_update_used_names(used_names, topic_name, topic);
        if (NIL == used_names) {
            return NIL;
        }
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(spaces); i = add(i, ONE_INTEGER)) {
            format(stream, $str56$_C, v_char);
        }
        format(stream, $str46$_A__, topic_name);
        spaces = add(spaces, ONE_INTEGER);
        SubLObject unfaceted_nts;
        final SubLObject narrower_terms = unfaceted_nts = taxonomy_nearest_narrower_terms($$broaderTerm, topic, mt);
        SubLObject faceted_nts = NIL;
        if (NIL != group_ntsP) {
            thread.resetMultipleValues();
            final SubLObject faceted_nts_$4 = taxonomy_grouped_narrower_terms(narrower_terms, v_taxonomy, topic, mt);
            final SubLObject unfaceted_nts_$5 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            faceted_nts = faceted_nts_$4;
            unfaceted_nts = unfaceted_nts_$5;
        }
        SubLObject cdolist_list_var = taxonomy_sort_by_name(v_taxonomy, unfaceted_nts);
        SubLObject child = NIL;
        child = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            display_taxonomy(v_taxonomy, child, used_names, irrelevant_terms, stream, spaces, v_char, group_ntsP);
            cdolist_list_var = cdolist_list_var.rest();
            child = cdolist_list_var.first();
        } 
        cdolist_list_var = faceted_nts;
        SubLObject faceted_nt = NIL;
        faceted_nt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject facet = faceted_nt.first();
            final SubLObject facet_name = taxonomy_term_name(v_taxonomy, facet);
            if (NIL != subl_promotions.memberP(facet, irrelevant_terms, symbol_function(EQUAL), UNPROVIDED)) {
                return NIL;
            }
            used_names = taxonomy_update_used_names(used_names, facet_name, facet);
            if (NIL == used_names) {
                return NIL;
            }
            SubLObject j;
            for (j = NIL, j = ZERO_INTEGER; j.numL(spaces); j = add(j, ONE_INTEGER)) {
                format(stream, $str56$_C, v_char);
            }
            format(stream, $str57$__A___, facet_name);
            SubLObject cdolist_list_var_$6 = taxonomy_sort_by_name(v_taxonomy, faceted_nt.rest());
            SubLObject child2 = NIL;
            child2 = cdolist_list_var_$6.first();
            while (NIL != cdolist_list_var_$6) {
                display_taxonomy(v_taxonomy, child2, used_names, irrelevant_terms, stream, add(spaces, ONE_INTEGER), v_char, group_ntsP);
                cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                child2 = cdolist_list_var_$6.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            faceted_nt = cdolist_list_var.first();
        } 
        return topic;
    }

    public static final SubLObject write_taxonomy_hierarchy_alt(SubLObject v_taxonomy, SubLObject roots, SubLObject stream, SubLObject v_char, SubLObject group_ntsP) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (v_char == UNPROVIDED) {
            v_char = CHAR_period;
        }
        if (group_ntsP == UNPROVIDED) {
            group_ntsP = T;
        }
        SubLTrampolineFile.checkType(v_taxonomy, CYCL_REPRESENTED_TERM_P);
        SubLTrampolineFile.checkType(roots, LISTP);
        {
            SubLObject used_names = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
            SubLObject irrelevant_terms = com.cyc.cycjava.cycl.taxonomy.taxonomy_irrelevant_terms(v_taxonomy);
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.taxonomy.taxonomy_sort_by_name(v_taxonomy, roots);
            SubLObject root = NIL;
            for (root = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , root = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.taxonomy.display_taxonomy(v_taxonomy, root, used_names, irrelevant_terms, stream, ZERO_INTEGER, v_char, group_ntsP);
                format(stream, $str_alt56$__);
            }
        }
        return v_taxonomy;
    }

    public static SubLObject write_taxonomy_hierarchy(final SubLObject v_taxonomy, final SubLObject roots, SubLObject stream, SubLObject v_char, SubLObject group_ntsP) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (v_char == UNPROVIDED) {
            v_char = CHAR_period;
        }
        if (group_ntsP == UNPROVIDED) {
            group_ntsP = T;
        }
        assert NIL != cycl_grammar.cycl_represented_term_p(v_taxonomy) : "! cycl_grammar.cycl_represented_term_p(v_taxonomy) " + ("cycl_grammar.cycl_represented_term_p(v_taxonomy) " + "CommonSymbols.NIL != cycl_grammar.cycl_represented_term_p(v_taxonomy) ") + v_taxonomy;
        assert NIL != listp(roots) : "! listp(roots) " + ("Types.listp(roots) " + "CommonSymbols.NIL != Types.listp(roots) ") + roots;
        final SubLObject used_names = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject irrelevant_terms = taxonomy_irrelevant_terms(v_taxonomy);
        SubLObject cdolist_list_var = taxonomy_sort_by_name(v_taxonomy, roots);
        SubLObject root = NIL;
        root = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            display_taxonomy(v_taxonomy, root, used_names, irrelevant_terms, stream, ZERO_INTEGER, v_char, group_ntsP);
            format(stream, $str51$__);
            cdolist_list_var = cdolist_list_var.rest();
            root = cdolist_list_var.first();
        } 
        return v_taxonomy;
    }

    public static final SubLObject write_taxonomy_hierarchy_to_file_alt(SubLObject pathname, SubLObject v_taxonomy, SubLObject topics, SubLObject v_char, SubLObject group_ntsP) {
        if (v_char == UNPROVIDED) {
            v_char = CHAR_period;
        }
        if (group_ntsP == UNPROVIDED) {
            group_ntsP = T;
        }
        {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(pathname, $OUTPUT, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt58$Unable_to_open__S, pathname);
                }
                {
                    SubLObject s_out = stream;
                    com.cyc.cycjava.cycl.taxonomy.write_taxonomy_hierarchy(v_taxonomy, topics, s_out, v_char, group_ntsP);
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
        return pathname;
    }

    public static SubLObject write_taxonomy_hierarchy_to_file(final SubLObject pathname, final SubLObject v_taxonomy, final SubLObject topics, SubLObject v_char, SubLObject group_ntsP) {
        if (v_char == UNPROVIDED) {
            v_char = CHAR_period;
        }
        if (group_ntsP == UNPROVIDED) {
            group_ntsP = T;
        }
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(pathname, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str53$Unable_to_open__S, pathname);
            }
            final SubLObject s_out = stream;
            write_taxonomy_hierarchy(v_taxonomy, topics, s_out, v_char, group_ntsP);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return pathname;
    }

    public static final SubLObject taxonomy_term_cycl_name_alt(SubLObject cycl_term) {
        return string_utilities.remove_substring(format_nil.format_nil_a(cycl_term), $str_alt65$__);
    }

    public static SubLObject taxonomy_term_cycl_name(final SubLObject cycl_term) {
        return string_utilities.remove_substring(format_nil.format_nil_a(cycl_term), $str60$__);
    }

    /**
     * Recursively displays the hierarchy of the terms (except IRRELEVANT-TERMS) in
     * TAXONOMY in XML format.  USED-NAMES is the list of all terms already
     * displayed in the hierarchy.  If GROUP-NTS? is non-NIL, then the narrower
     * terms will be grouped together based on facets of their broader term.  If
     * DISAMBIGUATE? is non-NIL, then a disambiguation string is attached to an
     * alternate name, if needed.
     *
     * @param TAXONOMY
    cycl-represented-term-p
     * 		
     * @param TOPIC
    cycl-represented-term-p
     * 		
     * @param USED-NAMES
     * 		listp; a list of stringp
     * @param IRRELEVANT-TERMS
     * 		listp; a list of cycl-represented-term-p
     */
    @LispMethod(comment = "Recursively displays the hierarchy of the terms (except IRRELEVANT-TERMS) in\r\nTAXONOMY in XML format.  USED-NAMES is the list of all terms already\r\ndisplayed in the hierarchy.  If GROUP-NTS? is non-NIL, then the narrower\r\nterms will be grouped together based on facets of their broader term.  If\r\nDISAMBIGUATE? is non-NIL, then a disambiguation string is attached to an\r\nalternate name, if needed.\r\n\r\n@param TAXONOMY\ncycl-represented-term-p\r\n\t\t\r\n@param TOPIC\ncycl-represented-term-p\r\n\t\t\r\n@param USED-NAMES\r\n\t\tlistp; a list of stringp\r\n@param IRRELEVANT-TERMS\r\n\t\tlistp; a list of cycl-represented-term-p\nRecursively displays the hierarchy of the terms (except IRRELEVANT-TERMS) in\nTAXONOMY in XML format.  USED-NAMES is the list of all terms already\ndisplayed in the hierarchy.  If GROUP-NTS? is non-NIL, then the narrower\nterms will be grouped together based on facets of their broader term.  If\nDISAMBIGUATE? is non-NIL, then a disambiguation string is attached to an\nalternate name, if needed.")
    public static final SubLObject display_taxonomy_hierarchy_in_xml_alt(SubLObject v_taxonomy, SubLObject topic, SubLObject used_names, SubLObject irrelevant_terms, SubLObject stream, SubLObject spaces, SubLObject group_ntsP, SubLObject disambiguate_ufsP) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (spaces == UNPROVIDED) {
            spaces = ZERO_INTEGER;
        }
        if (group_ntsP == UNPROVIDED) {
            group_ntsP = T;
        }
        if (disambiguate_ufsP == UNPROVIDED) {
            disambiguate_ufsP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != subl_promotions.memberP(topic, irrelevant_terms, symbol_function(EQUAL), UNPROVIDED)) {
                return NIL;
            }
            {
                SubLObject mt = com.cyc.cycjava.cycl.taxonomy.taxonomy_mt(v_taxonomy);
                SubLObject topic_name = com.cyc.cycjava.cycl.taxonomy.taxonomy_term_name(v_taxonomy, topic);
                used_names = com.cyc.cycjava.cycl.taxonomy.taxonomy_update_used_names(used_names, topic_name, topic);
                if (NIL == used_names) {
                    return NIL;
                }
                {
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(spaces); i = add(i, ONE_INTEGER)) {
                        format(stream, $str_alt66$_);
                    }
                }
                format(stream, $str_alt67$_node_name__S_nodeType__term__cyc, topic_name, com.cyc.cycjava.cycl.taxonomy.taxonomy_term_cycl_name(topic));
                {
                    SubLObject alternate_names = com.cyc.cycjava.cycl.taxonomy.taxonomy_term_used_for(v_taxonomy, topic, mt, topic_name, disambiguate_ufsP);
                    if (NIL != alternate_names) {
                        format(stream, $str_alt68$_usedFor__S, string_utilities.stringify_items(alternate_names, symbol_function(STR_BY_TYPE), $str_alt70$__, UNPROVIDED));
                    }
                }
                spaces = add(spaces, TWO_INTEGER);
                {
                    SubLObject narrower_terms = com.cyc.cycjava.cycl.taxonomy.taxonomy_nearest_narrower_terms($$broaderTerm, topic, mt);
                    format(stream, $str_alt71$_isLeaf__S___, NIL != narrower_terms ? ((SubLObject) ($$$false)) : $$$true);
                    if (NIL != narrower_terms) {
                        {
                            SubLObject unfaceted_nts = narrower_terms;
                            SubLObject faceted_nts = NIL;
                            if (NIL != group_ntsP) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject faceted_nts_7 = com.cyc.cycjava.cycl.taxonomy.taxonomy_grouped_narrower_terms(narrower_terms, v_taxonomy, topic, mt);
                                    SubLObject unfaceted_nts_8 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    faceted_nts = faceted_nts_7;
                                    unfaceted_nts = unfaceted_nts_8;
                                }
                            }
                            {
                                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.taxonomy.taxonomy_sort_by_name(v_taxonomy, unfaceted_nts);
                                SubLObject child = NIL;
                                for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                                    com.cyc.cycjava.cycl.taxonomy.display_taxonomy_hierarchy_in_xml(v_taxonomy, child, used_names, irrelevant_terms, stream, spaces, group_ntsP, disambiguate_ufsP);
                                }
                            }
                            {
                                SubLObject cdolist_list_var = faceted_nts;
                                SubLObject faceted_nt = NIL;
                                for (faceted_nt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , faceted_nt = cdolist_list_var.first()) {
                                    {
                                        SubLObject facet = faceted_nt.first();
                                        SubLObject facet_name = com.cyc.cycjava.cycl.taxonomy.taxonomy_term_name(v_taxonomy, facet);
                                        if (NIL != subl_promotions.memberP(facet, irrelevant_terms, symbol_function(EQUAL), UNPROVIDED)) {
                                            return NIL;
                                        }
                                        used_names = com.cyc.cycjava.cycl.taxonomy.taxonomy_update_used_names(used_names, facet_name, facet);
                                        if (NIL == used_names) {
                                            return NIL;
                                        }
                                        {
                                            SubLObject i = NIL;
                                            for (i = ZERO_INTEGER; i.numL(spaces); i = add(i, ONE_INTEGER)) {
                                                format(stream, $str_alt66$_);
                                            }
                                        }
                                        format(stream, $str_alt74$_node_name__S_nodeType__facet__cy, facet_name, com.cyc.cycjava.cycl.taxonomy.taxonomy_term_cycl_name(facet));
                                    }
                                    {
                                        SubLObject cdolist_list_var_9 = com.cyc.cycjava.cycl.taxonomy.taxonomy_sort_by_name(v_taxonomy, faceted_nt.rest());
                                        SubLObject child = NIL;
                                        for (child = cdolist_list_var_9.first(); NIL != cdolist_list_var_9; cdolist_list_var_9 = cdolist_list_var_9.rest() , child = cdolist_list_var_9.first()) {
                                            com.cyc.cycjava.cycl.taxonomy.display_taxonomy_hierarchy_in_xml(v_taxonomy, child, used_names, irrelevant_terms, stream, add(spaces, TWO_INTEGER), group_ntsP, disambiguate_ufsP);
                                        }
                                    }
                                    {
                                        SubLObject i = NIL;
                                        for (i = ZERO_INTEGER; i.numL(spaces); i = add(i, ONE_INTEGER)) {
                                            format(stream, $str_alt66$_);
                                        }
                                    }
                                    format(stream, $str_alt75$__node___);
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject cdotimes_end_var = subtract(spaces, TWO_INTEGER);
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                        format(stream, $str_alt66$_);
                    }
                }
                format(stream, $str_alt75$__node___);
            }
            return topic;
        }
    }

    /**
     * Recursively displays the hierarchy of the terms (except IRRELEVANT-TERMS) in
     * TAXONOMY in XML format.  USED-NAMES is the list of all terms already
     * displayed in the hierarchy.  If GROUP-NTS? is non-NIL, then the narrower
     * terms will be grouped together based on facets of their broader term.  If
     * DISAMBIGUATE? is non-NIL, then a disambiguation string is attached to an
     * alternate name, if needed.
     *
     * @param TAXONOMY
    		cycl-represented-term-p
     * 		
     * @param TOPIC
    		cycl-represented-term-p
     * 		
     * @param USED-NAMES
     * 		listp; a list of stringp
     * @param IRRELEVANT-TERMS
     * 		listp; a list of cycl-represented-term-p
     */
    @LispMethod(comment = "Recursively displays the hierarchy of the terms (except IRRELEVANT-TERMS) in\r\nTAXONOMY in XML format.  USED-NAMES is the list of all terms already\r\ndisplayed in the hierarchy.  If GROUP-NTS? is non-NIL, then the narrower\r\nterms will be grouped together based on facets of their broader term.  If\r\nDISAMBIGUATE? is non-NIL, then a disambiguation string is attached to an\r\nalternate name, if needed.\r\n\r\n@param TAXONOMY\n\t\tcycl-represented-term-p\r\n\t\t\r\n@param TOPIC\n\t\tcycl-represented-term-p\r\n\t\t\r\n@param USED-NAMES\r\n\t\tlistp; a list of stringp\r\n@param IRRELEVANT-TERMS\r\n\t\tlistp; a list of cycl-represented-term-p\nRecursively displays the hierarchy of the terms (except IRRELEVANT-TERMS) in\nTAXONOMY in XML format.  USED-NAMES is the list of all terms already\ndisplayed in the hierarchy.  If GROUP-NTS? is non-NIL, then the narrower\nterms will be grouped together based on facets of their broader term.  If\nDISAMBIGUATE? is non-NIL, then a disambiguation string is attached to an\nalternate name, if needed.")
    public static SubLObject display_taxonomy_hierarchy_in_xml(final SubLObject v_taxonomy, final SubLObject topic, SubLObject used_names, final SubLObject irrelevant_terms, SubLObject stream, SubLObject spaces, SubLObject group_ntsP, SubLObject disambiguate_ufsP) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (spaces == UNPROVIDED) {
            spaces = ZERO_INTEGER;
        }
        if (group_ntsP == UNPROVIDED) {
            group_ntsP = T;
        }
        if (disambiguate_ufsP == UNPROVIDED) {
            disambiguate_ufsP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != subl_promotions.memberP(topic, irrelevant_terms, symbol_function(EQUAL), UNPROVIDED)) {
            return NIL;
        }
        final SubLObject mt = taxonomy_mt(v_taxonomy);
        final SubLObject topic_name = taxonomy_term_name(v_taxonomy, topic);
        used_names = taxonomy_update_used_names(used_names, topic_name, topic);
        if (NIL == used_names) {
            return NIL;
        }
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(spaces); i = add(i, ONE_INTEGER)) {
            format(stream, $$$_);
        }
        format(stream, $str62$_node_name__S_nodeType__term__cyc, topic_name, taxonomy_term_cycl_name(topic));
        final SubLObject alternate_names = taxonomy_term_used_for(v_taxonomy, topic, mt, topic_name, disambiguate_ufsP);
        if (NIL != alternate_names) {
            format(stream, $str63$_usedFor__S, string_utilities.stringify_items(alternate_names, symbol_function(STR_BY_TYPE), $str65$__, UNPROVIDED));
        }
        spaces = add(spaces, TWO_INTEGER);
        final SubLObject narrower_terms = taxonomy_nearest_narrower_terms($$broaderTerm, topic, mt);
        format(stream, $str66$_isLeaf__S___, NIL != narrower_terms ? $$$false : $$$true);
        if (NIL != narrower_terms) {
            SubLObject unfaceted_nts = narrower_terms;
            SubLObject faceted_nts = NIL;
            if (NIL != group_ntsP) {
                thread.resetMultipleValues();
                final SubLObject faceted_nts_$7 = taxonomy_grouped_narrower_terms(narrower_terms, v_taxonomy, topic, mt);
                final SubLObject unfaceted_nts_$8 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                faceted_nts = faceted_nts_$7;
                unfaceted_nts = unfaceted_nts_$8;
            }
            SubLObject cdolist_list_var = taxonomy_sort_by_name(v_taxonomy, unfaceted_nts);
            SubLObject child = NIL;
            child = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                display_taxonomy_hierarchy_in_xml(v_taxonomy, child, used_names, irrelevant_terms, stream, spaces, group_ntsP, disambiguate_ufsP);
                cdolist_list_var = cdolist_list_var.rest();
                child = cdolist_list_var.first();
            } 
            cdolist_list_var = faceted_nts;
            SubLObject faceted_nt = NIL;
            faceted_nt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject facet = faceted_nt.first();
                final SubLObject facet_name = taxonomy_term_name(v_taxonomy, facet);
                if (NIL != subl_promotions.memberP(facet, irrelevant_terms, symbol_function(EQUAL), UNPROVIDED)) {
                    return NIL;
                }
                used_names = taxonomy_update_used_names(used_names, facet_name, facet);
                if (NIL == used_names) {
                    return NIL;
                }
                SubLObject j;
                for (j = NIL, j = ZERO_INTEGER; j.numL(spaces); j = add(j, ONE_INTEGER)) {
                    format(stream, $$$_);
                }
                format(stream, $str69$_node_name__S_nodeType__facet__cy, facet_name, taxonomy_term_cycl_name(facet));
                SubLObject cdolist_list_var_$9 = taxonomy_sort_by_name(v_taxonomy, faceted_nt.rest());
                SubLObject child2 = NIL;
                child2 = cdolist_list_var_$9.first();
                while (NIL != cdolist_list_var_$9) {
                    display_taxonomy_hierarchy_in_xml(v_taxonomy, child2, used_names, irrelevant_terms, stream, add(spaces, TWO_INTEGER), group_ntsP, disambiguate_ufsP);
                    cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                    child2 = cdolist_list_var_$9.first();
                } 
                SubLObject k;
                for (k = NIL, k = ZERO_INTEGER; k.numL(spaces); k = add(k, ONE_INTEGER)) {
                    format(stream, $$$_);
                }
                format(stream, $str70$__node___);
                cdolist_list_var = cdolist_list_var.rest();
                faceted_nt = cdolist_list_var.first();
            } 
        }
        SubLObject cdotimes_end_var;
        SubLObject l;
        for (cdotimes_end_var = subtract(spaces, TWO_INTEGER), l = NIL, l = ZERO_INTEGER; l.numL(cdotimes_end_var); l = add(l, ONE_INTEGER)) {
            format(stream, $$$_);
        }
        format(stream, $str70$__node___);
        return topic;
    }

    /**
     * Recursively displays the hierarchy of the terms under ROOTS in TAXONOMY in
     * XML format.  If GROUP-NTS? is non-NIL, then the narrower terms will be
     * grouped together based on facets of their broader term.  If DISAMBIGUATE? is
     * non-NIL, then a disambiguation string is attached to an alternate name, if
     * needed.
     */
    @LispMethod(comment = "Recursively displays the hierarchy of the terms under ROOTS in TAXONOMY in\r\nXML format.  If GROUP-NTS? is non-NIL, then the narrower terms will be\r\ngrouped together based on facets of their broader term.  If DISAMBIGUATE? is\r\nnon-NIL, then a disambiguation string is attached to an alternate name, if\r\nneeded.\nRecursively displays the hierarchy of the terms under ROOTS in TAXONOMY in\nXML format.  If GROUP-NTS? is non-NIL, then the narrower terms will be\ngrouped together based on facets of their broader term.  If DISAMBIGUATE? is\nnon-NIL, then a disambiguation string is attached to an alternate name, if\nneeded.")
    public static final SubLObject write_taxonomy_hierarchy_in_xml_alt(SubLObject v_taxonomy, SubLObject roots, SubLObject stream, SubLObject group_ntsP, SubLObject disambiguate_ufsP) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (group_ntsP == UNPROVIDED) {
            group_ntsP = T;
        }
        if (disambiguate_ufsP == UNPROVIDED) {
            disambiguate_ufsP = T;
        }
        SubLTrampolineFile.checkType(v_taxonomy, CYCL_REPRESENTED_TERM_P);
        SubLTrampolineFile.checkType(roots, LISTP);
        {
            SubLObject used_names = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
            SubLObject irrelevant_terms = com.cyc.cycjava.cycl.taxonomy.taxonomy_irrelevant_terms(v_taxonomy);
            format(stream, $str_alt76$_root___);
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.taxonomy.taxonomy_sort_by_name(v_taxonomy, roots);
                SubLObject root = NIL;
                for (root = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , root = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.taxonomy.display_taxonomy_hierarchy_in_xml(v_taxonomy, root, used_names, irrelevant_terms, stream, ZERO_INTEGER, group_ntsP, disambiguate_ufsP);
                    format(stream, $str_alt56$__);
                }
            }
            format(stream, $str_alt77$__root_);
        }
        return v_taxonomy;
    }

    @LispMethod(comment = "Recursively displays the hierarchy of the terms under ROOTS in TAXONOMY in\r\nXML format.  If GROUP-NTS? is non-NIL, then the narrower terms will be\r\ngrouped together based on facets of their broader term.  If DISAMBIGUATE? is\r\nnon-NIL, then a disambiguation string is attached to an alternate name, if\r\nneeded.\nRecursively displays the hierarchy of the terms under ROOTS in TAXONOMY in\nXML format.  If GROUP-NTS? is non-NIL, then the narrower terms will be\ngrouped together based on facets of their broader term.  If DISAMBIGUATE? is\nnon-NIL, then a disambiguation string is attached to an alternate name, if\nneeded.")
    public static SubLObject write_taxonomy_hierarchy_in_xml(final SubLObject v_taxonomy, final SubLObject roots, SubLObject stream, SubLObject group_ntsP, SubLObject disambiguate_ufsP) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (group_ntsP == UNPROVIDED) {
            group_ntsP = T;
        }
        if (disambiguate_ufsP == UNPROVIDED) {
            disambiguate_ufsP = T;
        }
        assert NIL != cycl_grammar.cycl_represented_term_p(v_taxonomy) : "! cycl_grammar.cycl_represented_term_p(v_taxonomy) " + ("cycl_grammar.cycl_represented_term_p(v_taxonomy) " + "CommonSymbols.NIL != cycl_grammar.cycl_represented_term_p(v_taxonomy) ") + v_taxonomy;
        assert NIL != listp(roots) : "! listp(roots) " + ("Types.listp(roots) " + "CommonSymbols.NIL != Types.listp(roots) ") + roots;
        final SubLObject used_names = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject irrelevant_terms = taxonomy_irrelevant_terms(v_taxonomy);
        format(stream, $str71$_root___);
        SubLObject cdolist_list_var = taxonomy_sort_by_name(v_taxonomy, roots);
        SubLObject root = NIL;
        root = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            display_taxonomy_hierarchy_in_xml(v_taxonomy, root, used_names, irrelevant_terms, stream, ZERO_INTEGER, group_ntsP, disambiguate_ufsP);
            format(stream, $str51$__);
            cdolist_list_var = cdolist_list_var.rest();
            root = cdolist_list_var.first();
        } 
        format(stream, $str72$__root_);
        return v_taxonomy;
    }/**
     * Recursively displays the hierarchy of the terms under ROOTS in TAXONOMY in
     * XML format.  If GROUP-NTS? is non-NIL, then the narrower terms will be
     * grouped together based on facets of their broader term.  If DISAMBIGUATE? is
     * non-NIL, then a disambiguation string is attached to an alternate name, if
     * needed.
     */


    /**
     * Wrapper that ensures that WRITE-TAXONOMY-HIERARCHY-IN-XML writes to a file
     */
    @LispMethod(comment = "Wrapper that ensures that WRITE-TAXONOMY-HIERARCHY-IN-XML writes to a file")
    public static final SubLObject write_taxonomy_hierarchy_to_xml_file_alt(SubLObject pathname, SubLObject v_taxonomy, SubLObject topics, SubLObject group_ntsP, SubLObject disambiguate_ufsP) {
        if (group_ntsP == UNPROVIDED) {
            group_ntsP = T;
        }
        if (disambiguate_ufsP == UNPROVIDED) {
            disambiguate_ufsP = T;
        }
        SubLTrampolineFile.checkType(pathname, STRINGP);
        {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(pathname, $OUTPUT, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt58$Unable_to_open__S, pathname);
                }
                {
                    SubLObject s_out = stream;
                    com.cyc.cycjava.cycl.taxonomy.write_taxonomy_hierarchy_in_xml(v_taxonomy, topics, s_out, group_ntsP, disambiguate_ufsP);
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
        return pathname;
    }

    @LispMethod(comment = "Wrapper that ensures that WRITE-TAXONOMY-HIERARCHY-IN-XML writes to a file")
    public static SubLObject write_taxonomy_hierarchy_to_xml_file(final SubLObject pathname, final SubLObject v_taxonomy, final SubLObject topics, SubLObject group_ntsP, SubLObject disambiguate_ufsP) {
        if (group_ntsP == UNPROVIDED) {
            group_ntsP = T;
        }
        if (disambiguate_ufsP == UNPROVIDED) {
            disambiguate_ufsP = T;
        }
        assert NIL != stringp(pathname) : "! stringp(pathname) " + ("Types.stringp(pathname) " + "CommonSymbols.NIL != Types.stringp(pathname) ") + pathname;
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(pathname, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str53$Unable_to_open__S, pathname);
            }
            final SubLObject s_out = stream;
            write_taxonomy_hierarchy_in_xml(v_taxonomy, topics, s_out, group_ntsP, disambiguate_ufsP);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return pathname;
    }/**
     * Wrapper that ensures that WRITE-TAXONOMY-HIERARCHY-IN-XML writes to a file
     */


    public static final SubLObject write_taxonomy_terms_info_as_csv_files_alt(SubLObject f1, SubLObject f2, SubLObject v_taxonomy, SubLObject roots, SubLObject terms_info_dict) {
        if (terms_info_dict == UNPROVIDED) {
            terms_info_dict = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt = com.cyc.cycjava.cycl.taxonomy.taxonomy_mt(v_taxonomy);
                if (NIL == terms_info_dict) {
                    {
                        SubLObject _prev_bind_0 = $taxonomy_term_relations_dict$.currentBinding(thread);
                        try {
                            $taxonomy_term_relations_dict$.bind(dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED), thread);
                            {
                                SubLObject terms = com.cyc.cycjava.cycl.taxonomy.taxonomy_terms(v_taxonomy, roots, mt);
                                com.cyc.cycjava.cycl.taxonomy.taxonomy_initialize_term_relations_dict(v_taxonomy, terms, mt, UNPROVIDED);
                                terms_info_dict = com.cyc.cycjava.cycl.taxonomy.taxonomy_term_relations_dict();
                            }
                        } finally {
                            $taxonomy_term_relations_dict$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_keys(terms_info_dict, STRING_LESSP);
                    SubLObject pair = NIL;
                    for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                        {
                            SubLObject term_name = pair.first();
                            SubLObject term_plist = pair.rest();
                            SubLObject term_uid = getf(term_plist, $UID, UNPROVIDED);
                            SubLObject bts = getf(term_plist, $BT, UNPROVIDED);
                            SubLObject nts = getf(term_plist, $NT, UNPROVIDED);
                            SubLObject ufs = getf(term_plist, $UF, UNPROVIDED);
                            SubLObject use = getf(term_plist, $USE, UNPROVIDED);
                            SubLObject stream = NIL;
                            try {
                                stream = compatibility.open_text(f1, $APPEND, NIL);
                                if (!stream.isStream()) {
                                    Errors.error($str_alt58$Unable_to_open__S, f1);
                                }
                                {
                                    SubLObject s1 = stream;
                                    format(s1, $str_alt80$_S__S__EN___, term_name, term_uid);
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
                            {
                                SubLObject stream_10 = NIL;
                                try {
                                    stream_10 = compatibility.open_text(f2, $APPEND, NIL);
                                    if (!stream_10.isStream()) {
                                        Errors.error($str_alt58$Unable_to_open__S, f2);
                                    }
                                    {
                                        SubLObject s2 = stream_10;
                                        {
                                            SubLObject cdolist_list_var_11 = bts;
                                            SubLObject bt = NIL;
                                            for (bt = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest() , bt = cdolist_list_var_11.first()) {
                                                {
                                                    SubLObject bt_name = com.cyc.cycjava.cycl.taxonomy.taxonomy_term_name(v_taxonomy, bt);
                                                    format(s2, $str_alt81$_S__S__BT___S__S__, new SubLObject[]{ term_name, term_uid, bt_name, getf(dictionary.dictionary_lookup(terms_info_dict, bt_name, UNPROVIDED), $UID, UNPROVIDED) });
                                                }
                                            }
                                        }
                                        {
                                            SubLObject cdolist_list_var_12 = nts;
                                            SubLObject nt = NIL;
                                            for (nt = cdolist_list_var_12.first(); NIL != cdolist_list_var_12; cdolist_list_var_12 = cdolist_list_var_12.rest() , nt = cdolist_list_var_12.first()) {
                                                {
                                                    SubLObject nt_name = com.cyc.cycjava.cycl.taxonomy.taxonomy_term_name(v_taxonomy, nt);
                                                    format(s2, $str_alt82$_S__S__NT___S__S__, new SubLObject[]{ term_name, term_uid, nt_name, getf(dictionary.dictionary_lookup(terms_info_dict, nt_name, UNPROVIDED), $UID, UNPROVIDED) });
                                                }
                                            }
                                        }
                                        {
                                            SubLObject cdolist_list_var_13 = ufs;
                                            SubLObject uf = NIL;
                                            for (uf = cdolist_list_var_13.first(); NIL != cdolist_list_var_13; cdolist_list_var_13 = cdolist_list_var_13.rest() , uf = cdolist_list_var_13.first()) {
                                                format(s2, $str_alt83$_S__S__UF___S__S__, new SubLObject[]{ term_name, term_uid, uf, getf(dictionary.dictionary_lookup(terms_info_dict, uf, UNPROVIDED), $UID, UNPROVIDED) });
                                            }
                                        }
                                        if (NIL != use) {
                                            format(s2, $str_alt84$_S__S__USE___S__S__, new SubLObject[]{ term_name, term_uid, use, getf(dictionary.dictionary_lookup(terms_info_dict, use, UNPROVIDED), $UID, UNPROVIDED) });
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            if (stream_10.isStream()) {
                                                close(stream_10, UNPROVIDED);
                                            }
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_taxonomy;
        }
    }

    public static SubLObject write_taxonomy_terms_info_as_csv_files(final SubLObject f1, final SubLObject f2, final SubLObject v_taxonomy, final SubLObject roots, SubLObject terms_info_dict) {
        if (terms_info_dict == UNPROVIDED) {
            terms_info_dict = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = taxonomy_mt(v_taxonomy);
        if (NIL == terms_info_dict) {
            final SubLObject _prev_bind_0 = $taxonomy_term_relations_dict$.currentBinding(thread);
            try {
                $taxonomy_term_relations_dict$.bind(dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED), thread);
                final SubLObject terms = taxonomy_terms(v_taxonomy, roots, mt);
                taxonomy_initialize_term_relations_dict(v_taxonomy, terms, mt, UNPROVIDED);
                terms_info_dict = taxonomy_term_relations_dict();
            } finally {
                $taxonomy_term_relations_dict$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_keys(terms_info_dict, STRING_LESSP);
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject term_name = pair.first();
            final SubLObject term_plist = pair.rest();
            final SubLObject term_uid = getf(term_plist, $UID, UNPROVIDED);
            final SubLObject bts = getf(term_plist, $BT, UNPROVIDED);
            final SubLObject nts = getf(term_plist, $NT, UNPROVIDED);
            final SubLObject ufs = getf(term_plist, $UF, UNPROVIDED);
            final SubLObject use = getf(term_plist, $USE, UNPROVIDED);
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(f1, $APPEND);
                if (!stream.isStream()) {
                    Errors.error($str53$Unable_to_open__S, f1);
                }
                final SubLObject s1 = stream;
                format(s1, $str75$_S__S__EN___, term_name, term_uid);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            SubLObject stream_$10 = NIL;
            try {
                stream_$10 = compatibility.open_text(f2, $APPEND);
                if (!stream_$10.isStream()) {
                    Errors.error($str53$Unable_to_open__S, f2);
                }
                final SubLObject s2 = stream_$10;
                SubLObject cdolist_list_var_$11 = bts;
                SubLObject bt = NIL;
                bt = cdolist_list_var_$11.first();
                while (NIL != cdolist_list_var_$11) {
                    final SubLObject bt_name = taxonomy_term_name(v_taxonomy, bt);
                    format(s2, $str76$_S__S__BT___S__S__, new SubLObject[]{ term_name, term_uid, bt_name, getf(dictionary.dictionary_lookup(terms_info_dict, bt_name, UNPROVIDED), $UID, UNPROVIDED) });
                    cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                    bt = cdolist_list_var_$11.first();
                } 
                SubLObject cdolist_list_var_$12 = nts;
                SubLObject nt = NIL;
                nt = cdolist_list_var_$12.first();
                while (NIL != cdolist_list_var_$12) {
                    final SubLObject nt_name = taxonomy_term_name(v_taxonomy, nt);
                    format(s2, $str77$_S__S__NT___S__S__, new SubLObject[]{ term_name, term_uid, nt_name, getf(dictionary.dictionary_lookup(terms_info_dict, nt_name, UNPROVIDED), $UID, UNPROVIDED) });
                    cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                    nt = cdolist_list_var_$12.first();
                } 
                SubLObject cdolist_list_var_$13 = ufs;
                SubLObject uf = NIL;
                uf = cdolist_list_var_$13.first();
                while (NIL != cdolist_list_var_$13) {
                    format(s2, $str78$_S__S__UF___S__S__, new SubLObject[]{ term_name, term_uid, uf, getf(dictionary.dictionary_lookup(terms_info_dict, uf, UNPROVIDED), $UID, UNPROVIDED) });
                    cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                    uf = cdolist_list_var_$13.first();
                } 
                if (NIL != use) {
                    format(s2, $str79$_S__S__USE___S__S__, new SubLObject[]{ term_name, term_uid, use, getf(dictionary.dictionary_lookup(terms_info_dict, use, UNPROVIDED), $UID, UNPROVIDED) });
                }
            } finally {
                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    if (stream_$10.isStream()) {
                        close(stream_$10, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return v_taxonomy;
    }

    public static final SubLObject export_taxonomy_to_owl_alt(SubLObject v_taxonomy, SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_forts = list_utilities.remove_if_not(FORT_P, ask_utilities.query_variable($sym4$_TERM, list($$nodeInSystem, $sym4$_TERM, v_taxonomy), $$InferencePSC, $list_alt86), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = owlification.$owl_use_pretty_stringsP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = owlification.$owl_use_external_ids_for_namesP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding(thread);
                    SubLObject _prev_bind_3 = owlification.$owl_use_entity_referencesP$.currentBinding(thread);
                    SubLObject _prev_bind_4 = owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.currentBinding(thread);
                    SubLObject _prev_bind_5 = owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.currentBinding(thread);
                    SubLObject _prev_bind_6 = owlification.$owl_export_from_opencyc_kbP$.currentBinding(thread);
                    SubLObject _prev_bind_7 = owlification.$owl_use_external_ids_for_namesP$.currentBinding(thread);
                    SubLObject _prev_bind_8 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding(thread);
                    try {
                        owlification.$owl_use_pretty_stringsP$.bind(T, thread);
                        owlification.$owl_use_external_ids_for_namesP$.bind(T, thread);
                        owl_uris_and_prefixes.$owl_export_version_date$.bind(owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread), thread);
                        owlification.$owl_use_entity_referencesP$.bind(NIL, thread);
                        owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.bind(T, thread);
                        owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.bind(T, thread);
                        owlification.$owl_export_from_opencyc_kbP$.bind(T, thread);
                        owlification.$owl_use_external_ids_for_namesP$.bind(NIL, thread);
                        owl_uris_and_prefixes.$owl_export_version_date$.bind(owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread), thread);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == numeric_date_utilities.universal_date_p(owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread))) {
                                Errors.error($str_alt87$Human_readable_OWL_export_require, owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread));
                            }
                        }
                        {
                            SubLObject stream = NIL;
                            try {
                                {
                                    SubLObject _prev_bind_0_14 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                    try {
                                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                        stream = compatibility.open_text(filename, $OUTPUT, NIL);
                                    } finally {
                                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_14, thread);
                                    }
                                }
                                if (!stream.isStream()) {
                                    Errors.error($str_alt58$Unable_to_open__S, filename);
                                }
                                {
                                    SubLObject stream_15 = stream;
                                    owl_cycl_to_xml.owl_export_terms(v_forts, stream_15, UNPROVIDED);
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (stream.isStream()) {
                                            close(stream, UNPROVIDED);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_16, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        owl_uris_and_prefixes.$owl_export_version_date$.rebind(_prev_bind_8, thread);
                        owlification.$owl_use_external_ids_for_namesP$.rebind(_prev_bind_7, thread);
                        owlification.$owl_export_from_opencyc_kbP$.rebind(_prev_bind_6, thread);
                        owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.rebind(_prev_bind_5, thread);
                        owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.rebind(_prev_bind_4, thread);
                        owlification.$owl_use_entity_referencesP$.rebind(_prev_bind_3, thread);
                        owl_uris_and_prefixes.$owl_export_version_date$.rebind(_prev_bind_2, thread);
                        owlification.$owl_use_external_ids_for_namesP$.rebind(_prev_bind_1, thread);
                        owlification.$owl_use_pretty_stringsP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return filename;
        }
    }

    public static SubLObject export_taxonomy_to_owl(final SubLObject v_taxonomy, final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_forts = list_utilities.remove_if_not(FORT_P, ask_utilities.query_variable($sym4$_TERM, list($$nodeInSystem, $sym4$_TERM, v_taxonomy), $$InferencePSC, $list81), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = owlification.$owl_use_pretty_stringsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = owlification.$owl_use_external_ids_for_namesP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding(thread);
        final SubLObject _prev_bind_4 = owlification.$owl_use_entity_referencesP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = owlification.$owl_export_from_opencyc_kbP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = owlification.$owl_use_external_ids_for_namesP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding(thread);
        try {
            owlification.$owl_use_pretty_stringsP$.bind(T, thread);
            owlification.$owl_use_external_ids_for_namesP$.bind(T, thread);
            owl_uris_and_prefixes.$owl_export_version_date$.bind(owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread), thread);
            owlification.$owl_use_entity_referencesP$.bind(NIL, thread);
            owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.bind(T, thread);
            owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.bind(T, thread);
            owlification.$owl_export_from_opencyc_kbP$.bind(T, thread);
            owlification.$owl_use_external_ids_for_namesP$.bind(NIL, thread);
            owl_uris_and_prefixes.$owl_export_version_date$.bind(owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread), thread);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == numeric_date_utilities.universal_date_p(owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread)))) {
                Errors.error($str82$Human_readable_OWL_export_require, owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread));
            }
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0_$14 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(filename, $OUTPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$14, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str53$Unable_to_open__S, filename);
                }
                final SubLObject stream_$15 = stream;
                owl_cycl_to_xml.owl_export_terms(v_forts, stream_$15, UNPROVIDED);
            } finally {
                final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                }
            }
        } finally {
            owl_uris_and_prefixes.$owl_export_version_date$.rebind(_prev_bind_9, thread);
            owlification.$owl_use_external_ids_for_namesP$.rebind(_prev_bind_8, thread);
            owlification.$owl_export_from_opencyc_kbP$.rebind(_prev_bind_7, thread);
            owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.rebind(_prev_bind_6, thread);
            owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.rebind(_prev_bind_5, thread);
            owlification.$owl_use_entity_referencesP$.rebind(_prev_bind_4, thread);
            owl_uris_and_prefixes.$owl_export_version_date$.rebind(_prev_bind_3, thread);
            owlification.$owl_use_external_ids_for_namesP$.rebind(_prev_bind_2, thread);
            owlification.$owl_use_pretty_stringsP$.rebind(_prev_bind_0, thread);
        }
        return filename;
    }

    public static final SubLObject export_taxonomy_sample_to_owl_alt(SubLObject v_taxonomy, SubLObject root, SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_forts = com.cyc.cycjava.cycl.taxonomy.get_taxonomy_sample(v_taxonomy, root);
                {
                    SubLObject _prev_bind_0 = owlification.$owl_use_pretty_stringsP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = owlification.$owl_use_external_ids_for_namesP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding(thread);
                    SubLObject _prev_bind_3 = owlification.$owl_use_entity_referencesP$.currentBinding(thread);
                    SubLObject _prev_bind_4 = owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.currentBinding(thread);
                    SubLObject _prev_bind_5 = owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.currentBinding(thread);
                    SubLObject _prev_bind_6 = owlification.$owl_export_from_opencyc_kbP$.currentBinding(thread);
                    SubLObject _prev_bind_7 = owlification.$owl_use_external_ids_for_namesP$.currentBinding(thread);
                    SubLObject _prev_bind_8 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding(thread);
                    try {
                        owlification.$owl_use_pretty_stringsP$.bind(T, thread);
                        owlification.$owl_use_external_ids_for_namesP$.bind(T, thread);
                        owl_uris_and_prefixes.$owl_export_version_date$.bind(owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread), thread);
                        owlification.$owl_use_entity_referencesP$.bind(NIL, thread);
                        owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.bind(T, thread);
                        owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.bind(T, thread);
                        owlification.$owl_export_from_opencyc_kbP$.bind(T, thread);
                        owlification.$owl_use_external_ids_for_namesP$.bind(NIL, thread);
                        owl_uris_and_prefixes.$owl_export_version_date$.bind(owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread), thread);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == numeric_date_utilities.universal_date_p(owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread))) {
                                Errors.error($str_alt87$Human_readable_OWL_export_require, owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread));
                            }
                        }
                        {
                            SubLObject stream = NIL;
                            try {
                                {
                                    SubLObject _prev_bind_0_17 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                    try {
                                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                        stream = compatibility.open_text(filename, $OUTPUT, NIL);
                                    } finally {
                                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_17, thread);
                                    }
                                }
                                if (!stream.isStream()) {
                                    Errors.error($str_alt58$Unable_to_open__S, filename);
                                }
                                {
                                    SubLObject stream_18 = stream;
                                    owl_cycl_to_xml.owl_export_terms(v_forts, stream_18, UNPROVIDED);
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (stream.isStream()) {
                                            close(stream, UNPROVIDED);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_19, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        owl_uris_and_prefixes.$owl_export_version_date$.rebind(_prev_bind_8, thread);
                        owlification.$owl_use_external_ids_for_namesP$.rebind(_prev_bind_7, thread);
                        owlification.$owl_export_from_opencyc_kbP$.rebind(_prev_bind_6, thread);
                        owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.rebind(_prev_bind_5, thread);
                        owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.rebind(_prev_bind_4, thread);
                        owlification.$owl_use_entity_referencesP$.rebind(_prev_bind_3, thread);
                        owl_uris_and_prefixes.$owl_export_version_date$.rebind(_prev_bind_2, thread);
                        owlification.$owl_use_external_ids_for_namesP$.rebind(_prev_bind_1, thread);
                        owlification.$owl_use_pretty_stringsP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return filename;
        }
    }

    public static SubLObject export_taxonomy_sample_to_owl(final SubLObject v_taxonomy, final SubLObject root, final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_forts = get_taxonomy_sample(v_taxonomy, root);
        final SubLObject _prev_bind_0 = owlification.$owl_use_pretty_stringsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = owlification.$owl_use_external_ids_for_namesP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding(thread);
        final SubLObject _prev_bind_4 = owlification.$owl_use_entity_referencesP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = owlification.$owl_export_from_opencyc_kbP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = owlification.$owl_use_external_ids_for_namesP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding(thread);
        try {
            owlification.$owl_use_pretty_stringsP$.bind(T, thread);
            owlification.$owl_use_external_ids_for_namesP$.bind(T, thread);
            owl_uris_and_prefixes.$owl_export_version_date$.bind(owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread), thread);
            owlification.$owl_use_entity_referencesP$.bind(NIL, thread);
            owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.bind(T, thread);
            owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.bind(T, thread);
            owlification.$owl_export_from_opencyc_kbP$.bind(T, thread);
            owlification.$owl_use_external_ids_for_namesP$.bind(NIL, thread);
            owl_uris_and_prefixes.$owl_export_version_date$.bind(owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread), thread);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == numeric_date_utilities.universal_date_p(owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread)))) {
                Errors.error($str82$Human_readable_OWL_export_require, owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread));
            }
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0_$17 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(filename, $OUTPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$17, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str53$Unable_to_open__S, filename);
                }
                final SubLObject stream_$18 = stream;
                owl_cycl_to_xml.owl_export_terms(v_forts, stream_$18, UNPROVIDED);
            } finally {
                final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                }
            }
        } finally {
            owl_uris_and_prefixes.$owl_export_version_date$.rebind(_prev_bind_9, thread);
            owlification.$owl_use_external_ids_for_namesP$.rebind(_prev_bind_8, thread);
            owlification.$owl_export_from_opencyc_kbP$.rebind(_prev_bind_7, thread);
            owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.rebind(_prev_bind_6, thread);
            owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.rebind(_prev_bind_5, thread);
            owlification.$owl_use_entity_referencesP$.rebind(_prev_bind_4, thread);
            owl_uris_and_prefixes.$owl_export_version_date$.rebind(_prev_bind_3, thread);
            owlification.$owl_use_external_ids_for_namesP$.rebind(_prev_bind_2, thread);
            owlification.$owl_use_pretty_stringsP$.rebind(_prev_bind_0, thread);
        }
        return filename;
    }

    public static final SubLObject get_taxonomy_sample_alt(SubLObject v_taxonomy, SubLObject root) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tree = com.cyc.cycjava.cycl.taxonomy.construct_taxonomy_tree(v_taxonomy, root, UNPROVIDED);
                SubLObject state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                            Errors.error($str_alt88$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                tree = com.cyc.cycjava.cycl.taxonomy.nprune_taxonomy_tree(tree);
                            } finally {
                                {
                                    SubLObject _prev_bind_0_20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_20, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return delete_duplicates(list_utilities.flatten(tree), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    public static SubLObject get_taxonomy_sample(final SubLObject v_taxonomy, final SubLObject root) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tree = construct_taxonomy_tree(v_taxonomy, root, UNPROVIDED);
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                tree = nprune_taxonomy_tree(tree);
            } finally {
                final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return delete_duplicates(list_utilities.flatten(tree), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject construct_taxonomy_tree_alt(SubLObject v_taxonomy, SubLObject root, SubLObject path) {
        if (path == UNPROVIDED) {
            path = NIL;
        }
        {
            SubLObject tree = list(root);
            SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_any_mt(root, $$broaderTerm, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
            SubLObject subnode = NIL;
            for (subnode = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subnode = cdolist_list_var.first()) {
                if (((NIL != indexed_term_p(subnode)) && (NIL == find(subnode, path, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != backward.removal_ask(list($$nodeInSystem, subnode, v_taxonomy), $$InferencePSC, UNPROVIDED, UNPROVIDED))) {
                    tree = list_utilities.nadd_to_end(com.cyc.cycjava.cycl.taxonomy.construct_taxonomy_tree(v_taxonomy, subnode, cons(root, path)), tree);
                }
            }
            return tree;
        }
    }

    public static SubLObject construct_taxonomy_tree(final SubLObject v_taxonomy, final SubLObject root, SubLObject path) {
        if (path == UNPROVIDED) {
            path = NIL;
        }
        SubLObject tree = list(root);
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_any_mt(root, $$broaderTerm, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        SubLObject subnode = NIL;
        subnode = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (((NIL != indexed_term_p(subnode)) && (NIL == find(subnode, path, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != backward.removal_ask(list($$nodeInSystem, subnode, v_taxonomy), $$InferencePSC, UNPROVIDED, UNPROVIDED))) {
                tree = list_utilities.nadd_to_end(construct_taxonomy_tree(v_taxonomy, subnode, cons(root, path)), tree);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subnode = cdolist_list_var.first();
        } 
        return tree;
    }

    public static final SubLObject nprune_taxonomy_tree_alt(SubLObject tree) {
        if (NIL != list_utilities.lengthG(tree, ONE_INTEGER, UNPROVIDED)) {
            {
                SubLObject subtrees = tree.rest();
                SubLObject maximal_subtree = number_utilities.maximum(subtrees, symbol_function(TAXONOMY_TREE_DEPTH));
                SubLObject list_var = NIL;
                SubLObject subtree = NIL;
                SubLObject i = NIL;
                for (list_var = tree, subtree = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , subtree = list_var.first() , i = add(ONE_INTEGER, i)) {
                    if (i.isZero()) {
                    } else {
                        if (subtree == maximal_subtree) {
                            set_nth(i, tree, com.cyc.cycjava.cycl.taxonomy.nprune_taxonomy_tree(maximal_subtree));
                        } else {
                            set_nth(i, tree, list(subtree.first()));
                        }
                    }
                }
            }
        }
        return tree;
    }

    public static SubLObject nprune_taxonomy_tree(final SubLObject tree) {
        if (NIL != list_utilities.lengthG(tree, ONE_INTEGER, UNPROVIDED)) {
            final SubLObject subtrees = tree.rest();
            final SubLObject maximal_subtree = number_utilities.maximum(subtrees, symbol_function(TAXONOMY_TREE_DEPTH));
            SubLObject list_var = NIL;
            SubLObject subtree = NIL;
            SubLObject i = NIL;
            list_var = tree;
            subtree = list_var.first();
            for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , subtree = list_var.first() , i = add(ONE_INTEGER, i)) {
                if (!i.isZero()) {
                    if (subtree.eql(maximal_subtree)) {
                        set_nth(i, tree, nprune_taxonomy_tree(maximal_subtree));
                    } else {
                        set_nth(i, tree, list(subtree.first()));
                    }
                }
            }
        }
        return tree;
    }

    public static final SubLObject taxonomy_tree_depth_internal_alt(SubLObject tree) {
        {
            SubLObject depth = ONE_INTEGER;
            SubLObject cdolist_list_var = tree.rest();
            SubLObject subtree = NIL;
            for (subtree = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subtree = cdolist_list_var.first()) {
                {
                    SubLObject subtree_depth = com.cyc.cycjava.cycl.taxonomy.taxonomy_tree_depth(subtree);
                    if (subtree_depth.numGE(depth)) {
                        depth = number_utilities.f_1X(subtree_depth);
                    }
                }
            }
            return depth;
        }
    }

    public static SubLObject taxonomy_tree_depth_internal(final SubLObject tree) {
        SubLObject depth = ONE_INTEGER;
        SubLObject cdolist_list_var = tree.rest();
        SubLObject subtree = NIL;
        subtree = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject subtree_depth = taxonomy_tree_depth(subtree);
            if (subtree_depth.numGE(depth)) {
                depth = number_utilities.f_1X(subtree_depth);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subtree = cdolist_list_var.first();
        } 
        return depth;
    }

    public static final SubLObject taxonomy_tree_depth_alt(SubLObject tree) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.taxonomy.taxonomy_tree_depth_internal(tree);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TAXONOMY_TREE_DEPTH, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TAXONOMY_TREE_DEPTH, ONE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, TAXONOMY_TREE_DEPTH, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, tree, $kw15$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw15$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.taxonomy.taxonomy_tree_depth_internal(tree)));
                        memoization_state.caching_state_put(caching_state, tree, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject taxonomy_tree_depth(final SubLObject tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return taxonomy_tree_depth_internal(tree);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TAXONOMY_TREE_DEPTH, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TAXONOMY_TREE_DEPTH, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, TAXONOMY_TREE_DEPTH, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, tree, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(taxonomy_tree_depth_internal(tree)));
            memoization_state.caching_state_put(caching_state, tree, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject declare_taxonomy_file() {
        declareFunction("taxonomy_term_relations_dict", "TAXONOMY-TERM-RELATIONS-DICT", 0, 0, false);
        declareFunction("taxonomy_mt", "TAXONOMY-MT", 1, 0, false);
        declareFunction("taxonomy_irrelevant_terms", "TAXONOMY-IRRELEVANT-TERMS", 1, 0, false);
        declareFunction("taxonomy_terms", "TAXONOMY-TERMS", 3, 0, false);
        declareFunction("taxonomy_term_name_needs_disambiguationP", "TAXONOMY-TERM-NAME-NEEDS-DISAMBIGUATION?", 1, 0, false);
        declareFunction("clear_taxonomy_generate_non_singular_phrase", "CLEAR-TAXONOMY-GENERATE-NON-SINGULAR-PHRASE", 0, 0, false);
        declareFunction("remove_taxonomy_generate_non_singular_phrase", "REMOVE-TAXONOMY-GENERATE-NON-SINGULAR-PHRASE", 1, 0, false);
        declareFunction("taxonomy_generate_non_singular_phrase_internal", "TAXONOMY-GENERATE-NON-SINGULAR-PHRASE-INTERNAL", 1, 0, false);
        declareFunction("taxonomy_generate_non_singular_phrase", "TAXONOMY-GENERATE-NON-SINGULAR-PHRASE", 1, 0, false);
        declareFunction("taxonomy_term_disambiguation_string", "TAXONOMY-TERM-DISAMBIGUATION-STRING", 1, 1, false);
        declareFunction("taxonomy_disambiguated_term_string", "TAXONOMY-DISAMBIGUATED-TERM-STRING", 2, 1, false);
        declareFunction("clear_taxonomy_term_name", "CLEAR-TAXONOMY-TERM-NAME", 0, 0, false);
        declareFunction("remove_taxonomy_term_name", "REMOVE-TAXONOMY-TERM-NAME", 2, 0, false);
        declareFunction("taxonomy_term_name_internal", "TAXONOMY-TERM-NAME-INTERNAL", 2, 0, false);
        declareFunction("taxonomy_term_name", "TAXONOMY-TERM-NAME", 2, 0, false);
        declareFunction("clear_taxonomy_suppressed_facets", "CLEAR-TAXONOMY-SUPPRESSED-FACETS", 0, 0, false);
        declareFunction("remove_taxonomy_suppressed_facets", "REMOVE-TAXONOMY-SUPPRESSED-FACETS", 2, 0, false);
        declareFunction("taxonomy_suppressed_facets_internal", "TAXONOMY-SUPPRESSED-FACETS-INTERNAL", 2, 0, false);
        declareFunction("taxonomy_suppressed_facets", "TAXONOMY-SUPPRESSED-FACETS", 2, 0, false);
        declareFunction("taxonomy_grouped_narrower_terms", "TAXONOMY-GROUPED-NARROWER-TERMS", 4, 0, false);
        declareFunction("taxonomy_nearest_broader_terms", "TAXONOMY-NEAREST-BROADER-TERMS", 3, 0, false);
        declareFunction("taxonomy_nearest_narrower_terms", "TAXONOMY-NEAREST-NARROWER-TERMS", 3, 0, false);
        declareFunction("taxonomy_term_used_for", "TAXONOMY-TERM-USED-FOR", 4, 1, false);
        declareFunction("taxonomy_initialize_term_relations_dict", "TAXONOMY-INITIALIZE-TERM-RELATIONS-DICT", 3, 1, false);
        declareFunction("clear_taxonomy_caches", "CLEAR-TAXONOMY-CACHES", 0, 0, false);
        declareFunction("taxonomy_write_list", "TAXONOMY-WRITE-LIST", 3, 1, false);
        declareFunction("taxonomy_write_alist", "TAXONOMY-WRITE-ALIST", 3, 0, false);
        declareFunction("display_taxonomy_term_details", "DISPLAY-TAXONOMY-TERM-DETAILS", 4, 2, false);
        declareFunction("write_taxonomy_flat", "WRITE-TAXONOMY-FLAT", 2, 3, false);
        declareFunction("write_taxonomy_flat_to_file", "WRITE-TAXONOMY-FLAT-TO-FILE", 3, 1, false);
        declareFunction("taxonomy_sort_by_name", "TAXONOMY-SORT-BY-NAME", 2, 0, false);
        declareFunction("taxonomy_update_used_names", "TAXONOMY-UPDATE-USED-NAMES", 3, 0, false);
        declareFunction("display_taxonomy", "DISPLAY-TAXONOMY", 4, 4, false);
        declareFunction("write_taxonomy_hierarchy", "WRITE-TAXONOMY-HIERARCHY", 2, 3, false);
        declareFunction("write_taxonomy_hierarchy_to_file", "WRITE-TAXONOMY-HIERARCHY-TO-FILE", 3, 2, false);
        declareFunction("taxonomy_term_cycl_name", "TAXONOMY-TERM-CYCL-NAME", 1, 0, false);
        declareFunction("display_taxonomy_hierarchy_in_xml", "DISPLAY-TAXONOMY-HIERARCHY-IN-XML", 4, 4, false);
        declareFunction("write_taxonomy_hierarchy_in_xml", "WRITE-TAXONOMY-HIERARCHY-IN-XML", 2, 3, false);
        declareFunction("write_taxonomy_hierarchy_to_xml_file", "WRITE-TAXONOMY-HIERARCHY-TO-XML-FILE", 3, 2, false);
        declareFunction("write_taxonomy_terms_info_as_csv_files", "WRITE-TAXONOMY-TERMS-INFO-AS-CSV-FILES", 4, 1, false);
        declareFunction("export_taxonomy_to_owl", "EXPORT-TAXONOMY-TO-OWL", 2, 0, false);
        declareFunction("export_taxonomy_sample_to_owl", "EXPORT-TAXONOMY-SAMPLE-TO-OWL", 3, 0, false);
        declareFunction("get_taxonomy_sample", "GET-TAXONOMY-SAMPLE", 2, 0, false);
        declareFunction("construct_taxonomy_tree", "CONSTRUCT-TAXONOMY-TREE", 2, 1, false);
        declareFunction("nprune_taxonomy_tree", "NPRUNE-TAXONOMY-TREE", 1, 0, false);
        declareFunction("taxonomy_tree_depth_internal", "TAXONOMY-TREE-DEPTH-INTERNAL", 1, 0, false);
        declareFunction("taxonomy_tree_depth", "TAXONOMY-TREE-DEPTH", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_taxonomy_file() {
        defparameter("*TAXONOMY-TERM-RELATIONS-DICT*", NIL);
        deflexical("*TAXONOMY-GENERATE-NON-SINGULAR-PHRASE-CACHING-STATE*", NIL);
        deflexical("*TAXONOMY-TERM-NAME-CACHING-STATE*", NIL);
        deflexical("*TAXONOMY-SUPPRESSED-FACETS-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_taxonomy_file() {
        memoization_state.note_globally_cached_function(TAXONOMY_GENERATE_NON_SINGULAR_PHRASE);
        memoization_state.note_globally_cached_function(TAXONOMY_TERM_NAME);
        memoization_state.note_globally_cached_function(TAXONOMY_SUPPRESSED_FACETS);
        memoization_state.note_memoized_function(TAXONOMY_TREE_DEPTH);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_taxonomy_file();
    }

    @Override
    public void initializeVariables() {
        init_taxonomy_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_taxonomy_file();
    }

    

    static private final SubLList $list_alt2 = list(makeSymbol("?MT"));

    static private final SubLList $list_alt7 = list(list(reader_make_constant_shell("keIrrelevantTerm"), makeSymbol("?TERM")));

    static private final SubLList $list_alt12 = list(reader_make_constant_shell("nonSingular-Generic"));

    public static final SubLSymbol $kw15$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt16$No_disambiguating_generalization_ = makeString("No disambiguating generalization could be found for ~A");

    static private final SubLString $str_alt17$__ = makeString(" (");

    static private final SubLString $str_alt18$_ = makeString(")");

    public static final SubLObject $const20$conceptInSystemDefaultDisplayStri = reader_make_constant_shell("conceptInSystemDefaultDisplayString");

    static private final SubLList $list_alt21 = list(makeSymbol("?X"));

    static private final SubLString $str_alt22$_ = makeString("'");

    static private final SubLString $str_alt23$_ = makeString("\"");

    static private final SubLSymbol $sym27$_FACET = makeSymbol("?FACET");

    static private final SubLList $list_alt29 = list(makeSymbol("?FACET"));

    static private final SubLString $str_alt33$_PPH_error_level_ = makeString("(PPH error level ");

    static private final SubLString $str_alt34$__ = makeString(") ");

    static private final SubLString $str_alt35$_is_not_a_ = makeString(" is not a ");

    static private final SubLString $str_alt38$_S_is_being_used_as_a_name_for__A = makeString("~S is being used as a name for ~A. So, it cannot be used as an alternate-name for ~A.");

    static private final SubLString $str_alt40$_S_is_being_used_as_an_alternate_ = makeString("~S is being used as an alternate-name for ~S (~A). So, it cannot be used as an alternate-name for ~A.");

    static private final SubLString $str_alt43$_S_is_being_used_as_a_name_for__A = makeString("~S is being used as a name for ~A.  Hence, it will not be used for ~A, which is ignored.");

    static private final SubLString $str_alt49$_____A__ = makeString("    ~A~%");

    static private final SubLString $str_alt50$______A___ = makeString("    <~A>~%");

    static private final SubLString $str_alt51$_A__ = makeString("~A~%");

    static private final SubLString $str_alt52$__BT__ = makeString("  BT~%");

    static private final SubLString $str_alt53$__NT__ = makeString("  NT~%");

    static private final SubLString $str_alt54$__UF__ = makeString("  UF~%");

    static private final SubLString $str_alt55$__USE_______A__ = makeString("  USE~%    ~A~%");

    static private final SubLString $str_alt56$__ = makeString("~%");

    static private final SubLString $str_alt58$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLSymbol $sym59$STRING_ = makeSymbol("STRING<");

    static private final SubLString $str_alt60$Did_not_write_out__S_because_it_s = makeString("Did not write out ~S because it shares taxonomy-name with ~S");

    static private final SubLString $str_alt61$_C = makeString("~C");

    static private final SubLString $str_alt62$__A___ = makeString("<~A>~%");

    static private final SubLString $str_alt65$__ = makeString("#$");

    static private final SubLString $str_alt66$_ = makeString(" ");

    static private final SubLString $str_alt67$_node_name__S_nodeType__term__cyc = makeString("<node name=~S nodeType=\"term\" cycTerm=~S");

    static private final SubLString $str_alt68$_usedFor__S = makeString(" usedFor=~S");

    static private final SubLString $str_alt70$__ = makeString(", ");

    static private final SubLString $str_alt71$_isLeaf__S___ = makeString(" isLeaf=~S>~%");

    static private final SubLString $str_alt74$_node_name__S_nodeType__facet__cy = makeString("<node name=~S nodeType=\"facet\" cycTerm=~S isLeaf=\"false\">~%");

    static private final SubLString $str_alt75$__node___ = makeString("</node>~%");

    static private final SubLString $str_alt76$_root___ = makeString("<root>~%");

    static private final SubLString $str_alt77$__root_ = makeString("</root>");

    static private final SubLString $str_alt80$_S__S__EN___ = makeString("~S,~S,\"EN\"~%");

    static private final SubLString $str_alt81$_S__S__BT___S__S__ = makeString("~S,~S,\"BT\",~S,~S~%");

    static private final SubLString $str_alt82$_S__S__NT___S__S__ = makeString("~S,~S,\"NT\",~S,~S~%");

    static private final SubLString $str_alt83$_S__S__UF___S__S__ = makeString("~S,~S,\"UF\",~S,~S~%");

    static private final SubLString $str_alt84$_S__S__USE___S__S__ = makeString("~S,~S,\"USE\",~S,~S~%");

    static private final SubLList $list_alt86 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("INFERENCE-MODE"), makeKeyword("MINIMAL"));

    static private final SubLString $str_alt87$Human_readable_OWL_export_require = makeString("Human-readable OWL export requires a valid (UNIVERSAL-DATE-P) version date. Got ~S");

    static private final SubLString $str_alt88$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
}

/**
 * Total time: 401 ms
 */
