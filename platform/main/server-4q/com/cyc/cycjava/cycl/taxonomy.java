package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.owl.owl_cycl_to_xml;
import com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes;
import com.cyc.cycjava.cycl.owl.owlification;
import com.cyc.cycjava.cycl.taxonomy;
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
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.*;
import static com.cyc.cycjava.cycl.taxonomy.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class taxonomy extends SubLTranslatedFile {
    public static final SubLFile me = new taxonomy();

    public static final String myName = "com.cyc.cycjava.cycl.taxonomy";

    public static final String myFingerPrint = "a196ba04242cff160479054f0fabd23a29eac5dc78d94cf710b60e1c394e4d62";

    // defparameter
    private static final SubLSymbol $taxonomy_term_relations_dict$ = makeSymbol("*TAXONOMY-TERM-RELATIONS-DICT*");







    // Internal Constants
    public static final SubLSymbol $sym0$_MT = makeSymbol("?MT");

    private static final SubLObject $$contextOfPCW = reader_make_constant_shell(makeString("contextOfPCW"));

    public static final SubLList $list2 = list(makeSymbol("?MT"));

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    public static final SubLSymbol $sym4$_TERM = makeSymbol("?TERM");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLObject $$nodeInSystem = reader_make_constant_shell(makeString("nodeInSystem"));

    public static final SubLList $list7 = list(list(reader_make_constant_shell(makeString("keIrrelevantTerm")), makeSymbol("?TERM")));

    private static final SubLObject $$TaxonomyMt = reader_make_constant_shell(makeString("TaxonomyMt"));

    public static final SubLSymbol $sym9$_X = makeSymbol("?X");

    private static final SubLObject $$broaderTerm = reader_make_constant_shell(makeString("broaderTerm"));

    public static final SubLSymbol TAXONOMY_GENERATE_NON_SINGULAR_PHRASE = makeSymbol("TAXONOMY-GENERATE-NON-SINGULAR-PHRASE");

    public static final SubLList $list12 = list(reader_make_constant_shell(makeString("nonSingular-Generic")));

    public static final SubLSymbol $taxonomy_generate_non_singular_phrase_caching_state$ = makeSymbol("*TAXONOMY-GENERATE-NON-SINGULAR-PHRASE-CACHING-STATE*");



    private static final SubLString $str15$No_disambiguating_generalization_ = makeString("No disambiguating generalization could be found for ~A");

    private static final SubLString $str16$__ = makeString(" (");

    private static final SubLString $str17$_ = makeString(")");

    private static final SubLSymbol TAXONOMY_TERM_NAME = makeSymbol("TAXONOMY-TERM-NAME");

    private static final SubLObject $const19$conceptInSystemDefaultDisplayStri = reader_make_constant_shell(makeString("conceptInSystemDefaultDisplayString"));

    private static final SubLList $list20 = list(makeSymbol("?X"));

    private static final SubLString $str21$_ = makeString("'");

    public static final SubLString $str22$_ = makeString("\"");

    private static final SubLSymbol $taxonomy_term_name_caching_state$ = makeSymbol("*TAXONOMY-TERM-NAME-CACHING-STATE*");



    private static final SubLSymbol TAXONOMY_SUPPRESSED_FACETS = makeSymbol("TAXONOMY-SUPPRESSED-FACETS");

    private static final SubLSymbol $sym26$_FACET = makeSymbol("?FACET");

    private static final SubLObject $$suppressFacet = reader_make_constant_shell(makeString("suppressFacet"));

    private static final SubLList $list28 = list(makeSymbol("?FACET"));

    private static final SubLSymbol $taxonomy_suppressed_facets_caching_state$ = makeSymbol("*TAXONOMY-SUPPRESSED-FACETS-CACHING-STATE*");

    private static final SubLObject $$facets_Generic = reader_make_constant_shell(makeString("facets-Generic"));

    private static final SubLObject $$taxonomyIrrelevantString = reader_make_constant_shell(makeString("taxonomyIrrelevantString"));



    private static final SubLString $str33$_S_is_being_used_as_a_name_for__A = makeString("~S is being used as a name for ~A. So, it cannot be used as an alternate-name for ~A.");



    private static final SubLString $str35$_S_is_being_used_as_an_alternate_ = makeString("~S is being used as an alternate-name for ~S (~A). So, it cannot be used as an alternate-name for ~A.");



    private static final SubLInteger $int$10000 = makeInteger(10000);

    public static final SubLString $str38$_S_is_being_used_as_a_name_for__A = makeString("~S is being used as a name for ~A.  Hence, it will not be used for ~A, which is ignored.");











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

    public static final SubLString $str65$__ = makeString(", ");

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

    public static SubLObject taxonomy_term_relations_dict() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $taxonomy_term_relations_dict$.getDynamicValue(thread);
    }

    public static SubLObject taxonomy_mt(final SubLObject v_taxonomy) {
        return narts_high.nart_substitute(ask_utilities.query_variable($sym0$_MT, listS($$contextOfPCW, v_taxonomy, $list2), $$InferencePSC, UNPROVIDED).first());
    }

    public static SubLObject taxonomy_irrelevant_terms(final SubLObject v_taxonomy) {
        return ask_utilities.query_variable($sym4$_TERM, listS($$and, list($$nodeInSystem, $sym4$_TERM, v_taxonomy), $list7), $$TaxonomyMt, UNPROVIDED);
    }

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

    public static SubLObject taxonomy_term_name_needs_disambiguationP(final SubLObject term_name) {
        if (length(lexicon_accessors.denots_of_string(term_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)).numG(ONE_INTEGER)) {
            return T;
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

    public static SubLObject remove_taxonomy_generate_non_singular_phrase(final SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args($taxonomy_generate_non_singular_phrase_caching_state$.getGlobalValue(), list(v_term), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject taxonomy_generate_non_singular_phrase_internal(final SubLObject v_term) {
        return pph_main.generate_phrase(v_term, $list12, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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

    public static SubLObject taxonomy_disambiguated_term_string(final SubLObject v_term, final SubLObject term_string, SubLObject secondaryP) {
        if (secondaryP == UNPROVIDED) {
            secondaryP = NIL;
        }
        if (NIL != taxonomy_term_name_needs_disambiguationP(term_string)) {
            return cconcatenate(format_nil.format_nil_a_no_copy(term_string), new SubLObject[]{ $str16$__, format_nil.format_nil_a_no_copy(taxonomy_term_disambiguation_string(v_term, secondaryP)), $str17$_ });
        }
        return term_string;
    }

    public static SubLObject clear_taxonomy_term_name() {
        final SubLObject cs = $taxonomy_term_name_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_taxonomy_term_name(final SubLObject v_taxonomy, final SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args($taxonomy_term_name_caching_state$.getGlobalValue(), list(v_taxonomy, v_term), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject taxonomy_term_name_internal(final SubLObject v_taxonomy, final SubLObject v_term) {
        SubLObject name = ask_utilities.query_variable($sym9$_X, listS($const19$conceptInSystemDefaultDisplayStri, v_term, v_taxonomy, $list20), $$InferencePSC, UNPROVIDED);
        if (NIL != name) {
            return name.first();
        }
        name = taxonomy_disambiguated_term_string(v_term, taxonomy_generate_non_singular_phrase(v_term), UNPROVIDED);
        return string_utilities.string_substitute($str21$_, $str22$_, name, UNPROVIDED);
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

    public static SubLObject clear_taxonomy_suppressed_facets() {
        final SubLObject cs = $taxonomy_suppressed_facets_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_taxonomy_suppressed_facets(final SubLObject v_taxonomy, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($taxonomy_suppressed_facets_caching_state$.getGlobalValue(), list(v_taxonomy, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject taxonomy_suppressed_facets_internal(final SubLObject v_taxonomy, final SubLObject mt) {
        return ask_utilities.query_variable($sym26$_FACET, listS($$suppressFacet, v_taxonomy, $list28), mt, UNPROVIDED);
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

    public static SubLObject taxonomy_nearest_broader_terms(final SubLObject pred, SubLObject v_term, final SubLObject mt) {
        v_term = narts_high.nart_substitute(v_term);
        if (NIL != gt_utilities.gt_term_p(v_term)) {
            return gt_methods.gt_min_superiors(pred, v_term, mt);
        }
        return NIL;
    }

    public static SubLObject taxonomy_nearest_narrower_terms(final SubLObject pred, SubLObject v_term, final SubLObject mt) {
        v_term = narts_high.nart_substitute(v_term);
        if (NIL != gt_utilities.gt_term_p(v_term)) {
            return gt_methods.gt_max_inferiors(pred, v_term, mt);
        }
        return NIL;
    }

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

    public static SubLObject clear_taxonomy_caches() {
        clear_taxonomy_generate_non_singular_phrase();
        clear_taxonomy_term_name();
        clear_taxonomy_suppressed_facets();
        return $CLEARED;
    }

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
    }

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
        assert NIL != cycl_grammar.cycl_represented_term_p(v_taxonomy) : "cycl_grammar.cycl_represented_term_p(v_taxonomy) " + "CommonSymbols.NIL != cycl_grammar.cycl_represented_term_p(v_taxonomy) " + v_taxonomy;
        assert NIL != listp(roots) : "Types.listp(roots) " + "CommonSymbols.NIL != Types.listp(roots) " + roots;
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

    public static SubLObject taxonomy_term_cycl_name(final SubLObject cycl_term) {
        return string_utilities.remove_substring(format_nil.format_nil_a(cycl_term), $str60$__);
    }

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
        assert NIL != cycl_grammar.cycl_represented_term_p(v_taxonomy) : "cycl_grammar.cycl_represented_term_p(v_taxonomy) " + "CommonSymbols.NIL != cycl_grammar.cycl_represented_term_p(v_taxonomy) " + v_taxonomy;
        assert NIL != listp(roots) : "Types.listp(roots) " + "CommonSymbols.NIL != Types.listp(roots) " + roots;
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
    }

    public static SubLObject write_taxonomy_hierarchy_to_xml_file(final SubLObject pathname, final SubLObject v_taxonomy, final SubLObject topics, SubLObject group_ntsP, SubLObject disambiguate_ufsP) {
        if (group_ntsP == UNPROVIDED) {
            group_ntsP = T;
        }
        if (disambiguate_ufsP == UNPROVIDED) {
            disambiguate_ufsP = T;
        }
        assert NIL != stringp(pathname) : "Types.stringp(pathname) " + "CommonSymbols.NIL != Types.stringp(pathname) " + pathname;
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
        declareFunction(me, "taxonomy_term_relations_dict", "TAXONOMY-TERM-RELATIONS-DICT", 0, 0, false);
        declareFunction(me, "taxonomy_mt", "TAXONOMY-MT", 1, 0, false);
        declareFunction(me, "taxonomy_irrelevant_terms", "TAXONOMY-IRRELEVANT-TERMS", 1, 0, false);
        declareFunction(me, "taxonomy_terms", "TAXONOMY-TERMS", 3, 0, false);
        declareFunction(me, "taxonomy_term_name_needs_disambiguationP", "TAXONOMY-TERM-NAME-NEEDS-DISAMBIGUATION?", 1, 0, false);
        declareFunction(me, "clear_taxonomy_generate_non_singular_phrase", "CLEAR-TAXONOMY-GENERATE-NON-SINGULAR-PHRASE", 0, 0, false);
        declareFunction(me, "remove_taxonomy_generate_non_singular_phrase", "REMOVE-TAXONOMY-GENERATE-NON-SINGULAR-PHRASE", 1, 0, false);
        declareFunction(me, "taxonomy_generate_non_singular_phrase_internal", "TAXONOMY-GENERATE-NON-SINGULAR-PHRASE-INTERNAL", 1, 0, false);
        declareFunction(me, "taxonomy_generate_non_singular_phrase", "TAXONOMY-GENERATE-NON-SINGULAR-PHRASE", 1, 0, false);
        declareFunction(me, "taxonomy_term_disambiguation_string", "TAXONOMY-TERM-DISAMBIGUATION-STRING", 1, 1, false);
        declareFunction(me, "taxonomy_disambiguated_term_string", "TAXONOMY-DISAMBIGUATED-TERM-STRING", 2, 1, false);
        declareFunction(me, "clear_taxonomy_term_name", "CLEAR-TAXONOMY-TERM-NAME", 0, 0, false);
        declareFunction(me, "remove_taxonomy_term_name", "REMOVE-TAXONOMY-TERM-NAME", 2, 0, false);
        declareFunction(me, "taxonomy_term_name_internal", "TAXONOMY-TERM-NAME-INTERNAL", 2, 0, false);
        declareFunction(me, "taxonomy_term_name", "TAXONOMY-TERM-NAME", 2, 0, false);
        declareFunction(me, "clear_taxonomy_suppressed_facets", "CLEAR-TAXONOMY-SUPPRESSED-FACETS", 0, 0, false);
        declareFunction(me, "remove_taxonomy_suppressed_facets", "REMOVE-TAXONOMY-SUPPRESSED-FACETS", 2, 0, false);
        declareFunction(me, "taxonomy_suppressed_facets_internal", "TAXONOMY-SUPPRESSED-FACETS-INTERNAL", 2, 0, false);
        declareFunction(me, "taxonomy_suppressed_facets", "TAXONOMY-SUPPRESSED-FACETS", 2, 0, false);
        declareFunction(me, "taxonomy_grouped_narrower_terms", "TAXONOMY-GROUPED-NARROWER-TERMS", 4, 0, false);
        declareFunction(me, "taxonomy_nearest_broader_terms", "TAXONOMY-NEAREST-BROADER-TERMS", 3, 0, false);
        declareFunction(me, "taxonomy_nearest_narrower_terms", "TAXONOMY-NEAREST-NARROWER-TERMS", 3, 0, false);
        declareFunction(me, "taxonomy_term_used_for", "TAXONOMY-TERM-USED-FOR", 4, 1, false);
        declareFunction(me, "taxonomy_initialize_term_relations_dict", "TAXONOMY-INITIALIZE-TERM-RELATIONS-DICT", 3, 1, false);
        declareFunction(me, "clear_taxonomy_caches", "CLEAR-TAXONOMY-CACHES", 0, 0, false);
        declareFunction(me, "taxonomy_write_list", "TAXONOMY-WRITE-LIST", 3, 1, false);
        declareFunction(me, "taxonomy_write_alist", "TAXONOMY-WRITE-ALIST", 3, 0, false);
        declareFunction(me, "display_taxonomy_term_details", "DISPLAY-TAXONOMY-TERM-DETAILS", 4, 2, false);
        declareFunction(me, "write_taxonomy_flat", "WRITE-TAXONOMY-FLAT", 2, 3, false);
        declareFunction(me, "write_taxonomy_flat_to_file", "WRITE-TAXONOMY-FLAT-TO-FILE", 3, 1, false);
        declareFunction(me, "taxonomy_sort_by_name", "TAXONOMY-SORT-BY-NAME", 2, 0, false);
        declareFunction(me, "taxonomy_update_used_names", "TAXONOMY-UPDATE-USED-NAMES", 3, 0, false);
        declareFunction(me, "display_taxonomy", "DISPLAY-TAXONOMY", 4, 4, false);
        declareFunction(me, "write_taxonomy_hierarchy", "WRITE-TAXONOMY-HIERARCHY", 2, 3, false);
        declareFunction(me, "write_taxonomy_hierarchy_to_file", "WRITE-TAXONOMY-HIERARCHY-TO-FILE", 3, 2, false);
        declareFunction(me, "taxonomy_term_cycl_name", "TAXONOMY-TERM-CYCL-NAME", 1, 0, false);
        declareFunction(me, "display_taxonomy_hierarchy_in_xml", "DISPLAY-TAXONOMY-HIERARCHY-IN-XML", 4, 4, false);
        declareFunction(me, "write_taxonomy_hierarchy_in_xml", "WRITE-TAXONOMY-HIERARCHY-IN-XML", 2, 3, false);
        declareFunction(me, "write_taxonomy_hierarchy_to_xml_file", "WRITE-TAXONOMY-HIERARCHY-TO-XML-FILE", 3, 2, false);
        declareFunction(me, "write_taxonomy_terms_info_as_csv_files", "WRITE-TAXONOMY-TERMS-INFO-AS-CSV-FILES", 4, 1, false);
        declareFunction(me, "export_taxonomy_to_owl", "EXPORT-TAXONOMY-TO-OWL", 2, 0, false);
        declareFunction(me, "export_taxonomy_sample_to_owl", "EXPORT-TAXONOMY-SAMPLE-TO-OWL", 3, 0, false);
        declareFunction(me, "get_taxonomy_sample", "GET-TAXONOMY-SAMPLE", 2, 0, false);
        declareFunction(me, "construct_taxonomy_tree", "CONSTRUCT-TAXONOMY-TREE", 2, 1, false);
        declareFunction(me, "nprune_taxonomy_tree", "NPRUNE-TAXONOMY-TREE", 1, 0, false);
        declareFunction(me, "taxonomy_tree_depth_internal", "TAXONOMY-TREE-DEPTH-INTERNAL", 1, 0, false);
        declareFunction(me, "taxonomy_tree_depth", "TAXONOMY-TREE-DEPTH", 1, 0, false);
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

    static {

























































































    }
}

/**
 * Total time: 401 ms
 */
