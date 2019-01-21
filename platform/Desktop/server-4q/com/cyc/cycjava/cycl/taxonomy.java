package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.owl.owl_cycl_to_xml;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes;
import com.cyc.cycjava.cycl.owl.owlification;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class taxonomy extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.taxonomy";
    public static final String myFingerPrint = "a196ba04242cff160479054f0fabd23a29eac5dc78d94cf710b60e1c394e4d62";
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 1319L)
    private static SubLSymbol $taxonomy_term_relations_dict$;
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 3342L)
    private static SubLSymbol $taxonomy_generate_non_singular_phrase_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 4998L)
    private static SubLSymbol $taxonomy_term_name_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 5615L)
    private static SubLSymbol $taxonomy_suppressed_facets_caching_state$;
    private static final SubLSymbol $sym0$_MT;
    private static final SubLObject $const1$contextOfPCW;
    private static final SubLList $list2;
    private static final SubLObject $const3$InferencePSC;
    private static final SubLSymbol $sym4$_TERM;
    private static final SubLObject $const5$and;
    private static final SubLObject $const6$nodeInSystem;
    private static final SubLList $list7;
    private static final SubLObject $const8$TaxonomyMt;
    private static final SubLSymbol $sym9$_X;
    private static final SubLObject $const10$broaderTerm;
    private static final SubLSymbol $sym11$TAXONOMY_GENERATE_NON_SINGULAR_PHRASE;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$_TAXONOMY_GENERATE_NON_SINGULAR_PHRASE_CACHING_STATE_;
    private static final SubLInteger $int14$100;
    private static final SubLString $str15$No_disambiguating_generalization_;
    private static final SubLString $str16$__;
    private static final SubLString $str17$_;
    private static final SubLSymbol $sym18$TAXONOMY_TERM_NAME;
    private static final SubLObject $const19$conceptInSystemDefaultDisplayStri;
    private static final SubLList $list20;
    private static final SubLString $str21$_;
    private static final SubLString $str22$_;
    private static final SubLSymbol $sym23$_TAXONOMY_TERM_NAME_CACHING_STATE_;
    private static final SubLInteger $int24$1000;
    private static final SubLSymbol $sym25$TAXONOMY_SUPPRESSED_FACETS;
    private static final SubLSymbol $sym26$_FACET;
    private static final SubLObject $const27$suppressFacet;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$_TAXONOMY_SUPPRESSED_FACETS_CACHING_STATE_;
    private static final SubLObject $const30$facets_Generic;
    private static final SubLObject $const31$taxonomyIrrelevantString;
    private static final SubLSymbol $kw32$CYCL;
    private static final SubLString $str33$_S_is_being_used_as_a_name_for__A;
    private static final SubLSymbol $kw34$USE;
    private static final SubLString $str35$_S_is_being_used_as_an_alternate_;
    private static final SubLSymbol $kw36$UID;
    private static final SubLInteger $int37$10000;
    private static final SubLString $str38$_S_is_being_used_as_a_name_for__A;
    private static final SubLSymbol $kw39$BT;
    private static final SubLSymbol $kw40$NT;
    private static final SubLSymbol $kw41$UF;
    private static final SubLSymbol $kw42$CLEARED;
    private static final SubLSymbol $sym43$STRING_LESSP;
    private static final SubLString $str44$_____A__;
    private static final SubLString $str45$______A___;
    private static final SubLString $str46$_A__;
    private static final SubLString $str47$__BT__;
    private static final SubLString $str48$__NT__;
    private static final SubLString $str49$__UF__;
    private static final SubLString $str50$__USE_______A__;
    private static final SubLString $str51$__;
    private static final SubLSymbol $kw52$OUTPUT;
    private static final SubLString $str53$Unable_to_open__S;
    private static final SubLSymbol $sym54$STRING_;
    private static final SubLString $str55$Did_not_write_out__S_because_it_s;
    private static final SubLString $str56$_C;
    private static final SubLString $str57$__A___;
    private static final SubLSymbol $sym58$CYCL_REPRESENTED_TERM_P;
    private static final SubLSymbol $sym59$LISTP;
    private static final SubLString $str60$__;
    private static final SubLString $str61$_;
    private static final SubLString $str62$_node_name__S_nodeType__term__cyc;
    private static final SubLString $str63$_usedFor__S;
    private static final SubLSymbol $sym64$STR_BY_TYPE;
    private static final SubLString $str65$__;
    private static final SubLString $str66$_isLeaf__S___;
    private static final SubLString $str67$false;
    private static final SubLString $str68$true;
    private static final SubLString $str69$_node_name__S_nodeType__facet__cy;
    private static final SubLString $str70$__node___;
    private static final SubLString $str71$_root___;
    private static final SubLString $str72$__root_;
    private static final SubLSymbol $sym73$STRINGP;
    private static final SubLSymbol $kw74$APPEND;
    private static final SubLString $str75$_S__S__EN___;
    private static final SubLString $str76$_S__S__BT___S__S__;
    private static final SubLString $str77$_S__S__NT___S__S__;
    private static final SubLString $str78$_S__S__UF___S__S__;
    private static final SubLString $str79$_S__S__USE___S__S__;
    private static final SubLSymbol $sym80$FORT_P;
    private static final SubLList $list81;
    private static final SubLString $str82$Human_readable_OWL_export_require;
    private static final SubLSymbol $sym83$TAXONOMY_TREE_DEPTH;
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 1646L)
    public static SubLObject taxonomy_term_relations_dict() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return taxonomy.$taxonomy_term_relations_dict$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 1735L)
    public static SubLObject taxonomy_mt(final SubLObject v_taxonomy) {
        return narts_high.nart_substitute(ask_utilities.query_variable((SubLObject)taxonomy.$sym0$_MT, (SubLObject)ConsesLow.listS(taxonomy.$const1$contextOfPCW, v_taxonomy, (SubLObject)taxonomy.$list2), taxonomy.$const3$InferencePSC, (SubLObject)taxonomy.UNPROVIDED).first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 2122L)
    public static SubLObject taxonomy_irrelevant_terms(final SubLObject v_taxonomy) {
        return ask_utilities.query_variable((SubLObject)taxonomy.$sym4$_TERM, (SubLObject)ConsesLow.listS(taxonomy.$const5$and, (SubLObject)ConsesLow.list(taxonomy.$const6$nodeInSystem, (SubLObject)taxonomy.$sym4$_TERM, v_taxonomy), (SubLObject)taxonomy.$list7), taxonomy.$const8$TaxonomyMt, (SubLObject)taxonomy.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 2411L)
    public static SubLObject taxonomy_terms(final SubLObject v_taxonomy, final SubLObject roots, final SubLObject taxonomy_mt) {
        SubLObject terms = (SubLObject)taxonomy.NIL;
        SubLObject cdolist_list_var = roots;
        SubLObject root = (SubLObject)taxonomy.NIL;
        root = cdolist_list_var.first();
        while (taxonomy.NIL != cdolist_list_var) {
            terms = conses_high.union(terms, ask_utilities.query_variable((SubLObject)taxonomy.$sym9$_X, (SubLObject)ConsesLow.list(taxonomy.$const10$broaderTerm, (SubLObject)taxonomy.$sym9$_X, root), taxonomy_mt, (SubLObject)taxonomy.UNPROVIDED), Symbols.symbol_function((SubLObject)taxonomy.EQUAL), (SubLObject)taxonomy.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            root = cdolist_list_var.first();
        }
        terms = conses_high.union(terms, roots, Symbols.symbol_function((SubLObject)taxonomy.EQUAL), (SubLObject)taxonomy.UNPROVIDED);
        terms = conses_high.set_difference(terms, taxonomy_irrelevant_terms(v_taxonomy), Symbols.symbol_function((SubLObject)taxonomy.EQUAL), (SubLObject)taxonomy.UNPROVIDED);
        return terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 3143L)
    public static SubLObject taxonomy_term_name_needs_disambiguationP(final SubLObject term_name) {
        if (Sequences.length(lexicon_accessors.denots_of_string(term_name, (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED)).numG((SubLObject)taxonomy.ONE_INTEGER)) {
            return (SubLObject)taxonomy.T;
        }
        return (SubLObject)taxonomy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 3342L)
    public static SubLObject clear_taxonomy_generate_non_singular_phrase() {
        final SubLObject cs = taxonomy.$taxonomy_generate_non_singular_phrase_caching_state$.getGlobalValue();
        if (taxonomy.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)taxonomy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 3342L)
    public static SubLObject remove_taxonomy_generate_non_singular_phrase(final SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args(taxonomy.$taxonomy_generate_non_singular_phrase_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_term), (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 3342L)
    public static SubLObject taxonomy_generate_non_singular_phrase_internal(final SubLObject v_term) {
        return pph_main.generate_phrase(v_term, (SubLObject)taxonomy.$list12, (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 3342L)
    public static SubLObject taxonomy_generate_non_singular_phrase(final SubLObject v_term) {
        SubLObject caching_state = taxonomy.$taxonomy_generate_non_singular_phrase_caching_state$.getGlobalValue();
        if (taxonomy.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)taxonomy.$sym11$TAXONOMY_GENERATE_NON_SINGULAR_PHRASE, (SubLObject)taxonomy.$sym13$_TAXONOMY_GENERATE_NON_SINGULAR_PHRASE_CACHING_STATE_, (SubLObject)taxonomy.$int14$100, (SubLObject)taxonomy.EQL, (SubLObject)taxonomy.ONE_INTEGER, (SubLObject)taxonomy.$int14$100);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(taxonomy_generate_non_singular_phrase_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, (SubLObject)taxonomy.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 3509L)
    public static SubLObject taxonomy_term_disambiguation_string(final SubLObject v_term, SubLObject secondaryP) {
        if (secondaryP == taxonomy.UNPROVIDED) {
            secondaryP = (SubLObject)taxonomy.NIL;
        }
        final SubLObject disambiguating_term = (taxonomy.NIL != secondaryP) ? v_term : pph_disambiguation.pph_disambiguating_generalizations((SubLObject)ConsesLow.list(v_term), (SubLObject)taxonomy.UNPROVIDED).first();
        if (taxonomy.NIL == disambiguating_term) {
            Errors.warn((SubLObject)taxonomy.$str15$No_disambiguating_generalization_, v_term);
            return (SubLObject)taxonomy.NIL;
        }
        return taxonomy_generate_non_singular_phrase(disambiguating_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 4370L)
    public static SubLObject taxonomy_disambiguated_term_string(final SubLObject v_term, final SubLObject term_string, SubLObject secondaryP) {
        if (secondaryP == taxonomy.UNPROVIDED) {
            secondaryP = (SubLObject)taxonomy.NIL;
        }
        if (taxonomy.NIL != taxonomy_term_name_needs_disambiguationP(term_string)) {
            return Sequences.cconcatenate(format_nil.format_nil_a_no_copy(term_string), new SubLObject[] { taxonomy.$str16$__, format_nil.format_nil_a_no_copy(taxonomy_term_disambiguation_string(v_term, secondaryP)), taxonomy.$str17$_ });
        }
        return term_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 4998L)
    public static SubLObject clear_taxonomy_term_name() {
        final SubLObject cs = taxonomy.$taxonomy_term_name_caching_state$.getGlobalValue();
        if (taxonomy.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)taxonomy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 4998L)
    public static SubLObject remove_taxonomy_term_name(final SubLObject v_taxonomy, final SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args(taxonomy.$taxonomy_term_name_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_taxonomy, v_term), (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 4998L)
    public static SubLObject taxonomy_term_name_internal(final SubLObject v_taxonomy, final SubLObject v_term) {
        SubLObject name = ask_utilities.query_variable((SubLObject)taxonomy.$sym9$_X, (SubLObject)ConsesLow.listS(taxonomy.$const19$conceptInSystemDefaultDisplayStri, v_term, v_taxonomy, (SubLObject)taxonomy.$list20), taxonomy.$const3$InferencePSC, (SubLObject)taxonomy.UNPROVIDED);
        if (taxonomy.NIL != name) {
            return name.first();
        }
        name = taxonomy_disambiguated_term_string(v_term, taxonomy_generate_non_singular_phrase(v_term), (SubLObject)taxonomy.UNPROVIDED);
        return string_utilities.string_substitute((SubLObject)taxonomy.$str21$_, (SubLObject)taxonomy.$str22$_, name, (SubLObject)taxonomy.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 4998L)
    public static SubLObject taxonomy_term_name(final SubLObject v_taxonomy, final SubLObject v_term) {
        SubLObject caching_state = taxonomy.$taxonomy_term_name_caching_state$.getGlobalValue();
        if (taxonomy.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)taxonomy.$sym18$TAXONOMY_TERM_NAME, (SubLObject)taxonomy.$sym23$_TAXONOMY_TERM_NAME_CACHING_STATE_, (SubLObject)taxonomy.$int24$1000, (SubLObject)taxonomy.EQL, (SubLObject)taxonomy.TWO_INTEGER, (SubLObject)taxonomy.$int24$1000);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_taxonomy, v_term);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)taxonomy.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)taxonomy.NIL;
            collision = cdolist_list_var.first();
            while (taxonomy.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_taxonomy.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (taxonomy.NIL != cached_args && taxonomy.NIL == cached_args.rest() && v_term.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(taxonomy_term_name_internal(v_taxonomy, v_term)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_taxonomy, v_term));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 5615L)
    public static SubLObject clear_taxonomy_suppressed_facets() {
        final SubLObject cs = taxonomy.$taxonomy_suppressed_facets_caching_state$.getGlobalValue();
        if (taxonomy.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)taxonomy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 5615L)
    public static SubLObject remove_taxonomy_suppressed_facets(final SubLObject v_taxonomy, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(taxonomy.$taxonomy_suppressed_facets_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_taxonomy, mt), (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 5615L)
    public static SubLObject taxonomy_suppressed_facets_internal(final SubLObject v_taxonomy, final SubLObject mt) {
        return ask_utilities.query_variable((SubLObject)taxonomy.$sym26$_FACET, (SubLObject)ConsesLow.listS(taxonomy.$const27$suppressFacet, v_taxonomy, (SubLObject)taxonomy.$list28), mt, (SubLObject)taxonomy.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 5615L)
    public static SubLObject taxonomy_suppressed_facets(final SubLObject v_taxonomy, final SubLObject mt) {
        SubLObject caching_state = taxonomy.$taxonomy_suppressed_facets_caching_state$.getGlobalValue();
        if (taxonomy.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)taxonomy.$sym25$TAXONOMY_SUPPRESSED_FACETS, (SubLObject)taxonomy.$sym29$_TAXONOMY_SUPPRESSED_FACETS_CACHING_STATE_, (SubLObject)taxonomy.$int14$100, (SubLObject)taxonomy.EQL, (SubLObject)taxonomy.TWO_INTEGER, (SubLObject)taxonomy.$int14$100);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_taxonomy, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)taxonomy.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)taxonomy.NIL;
            collision = cdolist_list_var.first();
            while (taxonomy.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_taxonomy.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (taxonomy.NIL != cached_args && taxonomy.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(taxonomy_suppressed_facets_internal(v_taxonomy, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_taxonomy, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 5794L)
    public static SubLObject taxonomy_grouped_narrower_terms(final SubLObject nts, final SubLObject v_taxonomy, final SubLObject v_term, final SubLObject mt) {
        final SubLObject all_facets = ask_utilities.query_variable((SubLObject)taxonomy.$sym26$_FACET, (SubLObject)ConsesLow.listS(taxonomy.$const30$facets_Generic, v_term, (SubLObject)taxonomy.$list28), taxonomy.$const3$InferencePSC, (SubLObject)taxonomy.UNPROVIDED);
        final SubLObject suppressed_facets = taxonomy_suppressed_facets(v_taxonomy, mt);
        final SubLObject v_facets = conses_high.set_difference(all_facets, suppressed_facets, (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED);
        SubLObject non_grouped_nts = nts;
        SubLObject grouped_nts = (SubLObject)taxonomy.NIL;
        SubLObject cdolist_list_var = v_facets;
        SubLObject facet = (SubLObject)taxonomy.NIL;
        facet = cdolist_list_var.first();
        while (taxonomy.NIL != cdolist_list_var) {
            final SubLObject values = conses_high.intersection(nts, isa.all_fort_instances(facet, taxonomy.$const3$InferencePSC, (SubLObject)taxonomy.UNPROVIDED), (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED);
            if (taxonomy.NIL != values) {
                grouped_nts = conses_high.acons(facet, values, grouped_nts);
                non_grouped_nts = conses_high.set_difference(non_grouped_nts, values, (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            facet = cdolist_list_var.first();
        }
        return Values.values(grouped_nts, non_grouped_nts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 6886L)
    public static SubLObject taxonomy_nearest_broader_terms(final SubLObject pred, SubLObject v_term, final SubLObject mt) {
        v_term = narts_high.nart_substitute(v_term);
        if (taxonomy.NIL != gt_utilities.gt_term_p(v_term)) {
            return gt_methods.gt_min_superiors(pred, v_term, mt);
        }
        return (SubLObject)taxonomy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 7075L)
    public static SubLObject taxonomy_nearest_narrower_terms(final SubLObject pred, SubLObject v_term, final SubLObject mt) {
        v_term = narts_high.nart_substitute(v_term);
        if (taxonomy.NIL != gt_utilities.gt_term_p(v_term)) {
            return gt_methods.gt_max_inferiors(pred, v_term, mt);
        }
        return (SubLObject)taxonomy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 7265L)
    public static SubLObject taxonomy_term_used_for(final SubLObject v_taxonomy, final SubLObject v_term, final SubLObject mt, final SubLObject term_name, SubLObject disambiguateP) {
        if (disambiguateP == taxonomy.UNPROVIDED) {
            disambiguateP = (SubLObject)taxonomy.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject taxonomy_irrelevant_names = ask_utilities.query_variable((SubLObject)taxonomy.$sym9$_X, (SubLObject)ConsesLow.listS(taxonomy.$const31$taxonomyIrrelevantString, v_taxonomy, v_term, (SubLObject)taxonomy.$list20), mt, (SubLObject)taxonomy.UNPROVIDED);
        final SubLObject taxonomy_term_relations_dict = taxonomy_term_relations_dict();
        SubLObject all_names = (SubLObject)taxonomy.NIL;
        SubLObject other_names = (SubLObject)taxonomy.NIL;
        SubLObject result = (SubLObject)taxonomy.NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
        try {
            pph_vars.$pph_demerit_cutoff$.bind((SubLObject)taxonomy.TWO_INTEGER, thread);
            all_names = pph_methods_lexicon.all_phrases_for_term(v_term, (SubLObject)taxonomy.$list12, (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED);
        }
        finally {
            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0, thread);
        }
        other_names = Sequences.remove(taxonomy_generate_non_singular_phrase(v_term), conses_high.set_difference(all_names, taxonomy_irrelevant_names, (SubLObject)taxonomy.EQUAL, (SubLObject)taxonomy.UNPROVIDED), (SubLObject)taxonomy.EQUAL, (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED);
        if (taxonomy.NIL == disambiguateP) {
            return other_names;
        }
        SubLObject cdolist_list_var = other_names;
        SubLObject name = (SubLObject)taxonomy.NIL;
        name = cdolist_list_var.first();
        while (taxonomy.NIL != cdolist_list_var) {
            final SubLObject alternate_name = taxonomy_disambiguated_term_string(v_term, name, (SubLObject)taxonomy.T);
            if (taxonomy.NIL != taxonomy_term_relations_dict) {
                final SubLObject dict_term_plist = dictionary.dictionary_lookup(taxonomy_term_relations_dict, alternate_name, (SubLObject)taxonomy.UNPROVIDED);
                if (taxonomy.NIL != dict_term_plist) {
                    final SubLObject dict_term = conses_high.getf(dict_term_plist, (SubLObject)taxonomy.$kw32$CYCL, (SubLObject)taxonomy.UNPROVIDED);
                    if (taxonomy.NIL != dict_term) {
                        Errors.warn((SubLObject)taxonomy.$str33$_S_is_being_used_as_a_name_for__A, alternate_name, dict_term, v_term);
                    }
                    else {
                        final SubLObject use_term_name = conses_high.getf(dict_term_plist, (SubLObject)taxonomy.$kw34$USE, (SubLObject)taxonomy.UNPROVIDED);
                        final SubLObject use_term = conses_high.getf(dictionary.dictionary_lookup(taxonomy_term_relations_dict, use_term_name, (SubLObject)taxonomy.UNPROVIDED), (SubLObject)taxonomy.$kw32$CYCL, (SubLObject)taxonomy.UNPROVIDED);
                        Errors.warn((SubLObject)taxonomy.$str35$_S_is_being_used_as_an_alternate_, new SubLObject[] { alternate_name, use_term_name, use_term, v_term });
                    }
                }
                else {
                    dictionary.dictionary_enter(taxonomy_term_relations_dict, alternate_name, (SubLObject)ConsesLow.list((SubLObject)taxonomy.$kw36$UID, Numbers.add(dictionary.dictionary_length(taxonomy_term_relations_dict), (SubLObject)taxonomy.$int37$10000), (SubLObject)taxonomy.$kw34$USE, term_name));
                }
            }
            result = (SubLObject)ConsesLow.cons(alternate_name, result);
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 9549L)
    public static SubLObject taxonomy_initialize_term_relations_dict(final SubLObject v_taxonomy, final SubLObject terms, final SubLObject mt, SubLObject pred) {
        if (pred == taxonomy.UNPROVIDED) {
            pred = taxonomy.$const10$broaderTerm;
        }
        final SubLObject taxonomy_term_relations_dict = taxonomy_term_relations_dict();
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = (SubLObject)taxonomy.NIL;
        v_term = cdolist_list_var.first();
        while (taxonomy.NIL != cdolist_list_var) {
            final SubLObject term_name = taxonomy_term_name(v_taxonomy, v_term);
            final SubLObject dict_term = conses_high.getf(dictionary.dictionary_lookup(taxonomy_term_relations_dict, term_name, (SubLObject)taxonomy.UNPROVIDED), (SubLObject)taxonomy.$kw32$CYCL, (SubLObject)taxonomy.UNPROVIDED);
            if (taxonomy.NIL != dict_term) {
                Errors.warn((SubLObject)taxonomy.$str38$_S_is_being_used_as_a_name_for__A, term_name, dict_term, v_term);
            }
            else {
                final SubLObject broader_terms = taxonomy_nearest_broader_terms(pred, v_term, mt);
                final SubLObject narrower_terms = taxonomy_nearest_narrower_terms(pred, v_term, mt);
                final SubLObject used_for = taxonomy_term_used_for(v_taxonomy, v_term, mt, term_name, (SubLObject)taxonomy.UNPROVIDED);
                final SubLObject term_plist = (SubLObject)ConsesLow.list(new SubLObject[] { taxonomy.$kw36$UID, Numbers.add(dictionary.dictionary_length(taxonomy_term_relations_dict), (SubLObject)taxonomy.$int37$10000), taxonomy.$kw32$CYCL, v_term, taxonomy.$kw39$BT, broader_terms, taxonomy.$kw40$NT, narrower_terms, taxonomy.$kw41$UF, used_for });
                dictionary.dictionary_enter(taxonomy_term_relations_dict, term_name, term_plist);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return v_taxonomy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 10726L)
    public static SubLObject clear_taxonomy_caches() {
        clear_taxonomy_generate_non_singular_phrase();
        clear_taxonomy_term_name();
        clear_taxonomy_suppressed_facets();
        return (SubLObject)taxonomy.$kw42$CLEARED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 10921L)
    public static SubLObject taxonomy_write_list(final SubLObject v_taxonomy, final SubLObject terms, final SubLObject stream, SubLObject extra_spaces) {
        if (extra_spaces == taxonomy.UNPROVIDED) {
            extra_spaces = (SubLObject)taxonomy.ZERO_INTEGER;
        }
        SubLObject names = (SubLObject)taxonomy.NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = (SubLObject)taxonomy.NIL;
        v_term = cdolist_list_var.first();
        while (taxonomy.NIL != cdolist_list_var) {
            names = (SubLObject)ConsesLow.cons(taxonomy_term_name(v_taxonomy, v_term), names);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        names = (cdolist_list_var = Sort.sort(names, (SubLObject)taxonomy.$sym43$STRING_LESSP, (SubLObject)taxonomy.UNPROVIDED));
        SubLObject name = (SubLObject)taxonomy.NIL;
        name = cdolist_list_var.first();
        while (taxonomy.NIL != cdolist_list_var) {
            string_utilities.indent(stream, extra_spaces);
            PrintLow.format(stream, (SubLObject)taxonomy.$str44$_____A__, name);
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        }
        return v_taxonomy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 11688L)
    public static SubLObject taxonomy_write_alist(final SubLObject v_taxonomy, final SubLObject grouped_terms, final SubLObject stream) {
        SubLObject cdolist_list_var = grouped_terms;
        SubLObject term_group = (SubLObject)taxonomy.NIL;
        term_group = cdolist_list_var.first();
        while (taxonomy.NIL != cdolist_list_var) {
            PrintLow.format(stream, (SubLObject)taxonomy.$str45$______A___, taxonomy_term_name(v_taxonomy, term_group.first()));
            taxonomy_write_list(v_taxonomy, term_group.rest(), stream, (SubLObject)taxonomy.TWO_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            term_group = cdolist_list_var.first();
        }
        return v_taxonomy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 12088L)
    public static SubLObject display_taxonomy_term_details(final SubLObject v_taxonomy, final SubLObject mt, final SubLObject term_name, final SubLObject term_plist, SubLObject stream, SubLObject group_ntsP) {
        if (stream == taxonomy.UNPROVIDED) {
            stream = (SubLObject)taxonomy.T;
        }
        if (group_ntsP == taxonomy.UNPROVIDED) {
            group_ntsP = (SubLObject)taxonomy.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = conses_high.getf(term_plist, (SubLObject)taxonomy.$kw32$CYCL, (SubLObject)taxonomy.UNPROVIDED);
        final SubLObject broader_terms = conses_high.getf(term_plist, (SubLObject)taxonomy.$kw39$BT, (SubLObject)taxonomy.UNPROVIDED);
        final SubLObject narrower_terms = conses_high.getf(term_plist, (SubLObject)taxonomy.$kw40$NT, (SubLObject)taxonomy.UNPROVIDED);
        final SubLObject used_for = conses_high.getf(term_plist, (SubLObject)taxonomy.$kw41$UF, (SubLObject)taxonomy.UNPROVIDED);
        final SubLObject use = conses_high.getf(term_plist, (SubLObject)taxonomy.$kw34$USE, (SubLObject)taxonomy.UNPROVIDED);
        SubLObject unfaceted_nts = narrower_terms;
        SubLObject faceted_nts = (SubLObject)taxonomy.NIL;
        PrintLow.format(stream, (SubLObject)taxonomy.$str46$_A__, term_name);
        if (taxonomy.NIL != broader_terms) {
            PrintLow.format(stream, (SubLObject)taxonomy.$str47$__BT__);
            taxonomy_write_list(v_taxonomy, broader_terms, stream, (SubLObject)taxonomy.UNPROVIDED);
        }
        if (taxonomy.NIL != group_ntsP) {
            thread.resetMultipleValues();
            final SubLObject faceted_nts_$1 = taxonomy_grouped_narrower_terms(narrower_terms, v_taxonomy, v_term, mt);
            final SubLObject unfaceted_nts_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            faceted_nts = faceted_nts_$1;
            unfaceted_nts = unfaceted_nts_$2;
        }
        if (taxonomy.NIL != faceted_nts || taxonomy.NIL != unfaceted_nts) {
            PrintLow.format(stream, (SubLObject)taxonomy.$str48$__NT__);
            taxonomy_write_list(v_taxonomy, unfaceted_nts, stream, (SubLObject)taxonomy.UNPROVIDED);
            taxonomy_write_alist(v_taxonomy, faceted_nts, stream);
        }
        if (taxonomy.NIL != used_for) {
            PrintLow.format(stream, (SubLObject)taxonomy.$str49$__UF__);
            SubLObject cdolist_list_var = Sort.sort(used_for, (SubLObject)taxonomy.$sym43$STRING_LESSP, (SubLObject)taxonomy.UNPROVIDED);
            SubLObject v_term_$3 = (SubLObject)taxonomy.NIL;
            v_term_$3 = cdolist_list_var.first();
            while (taxonomy.NIL != cdolist_list_var) {
                PrintLow.format(stream, (SubLObject)taxonomy.$str44$_____A__, v_term_$3);
                cdolist_list_var = cdolist_list_var.rest();
                v_term_$3 = cdolist_list_var.first();
            }
        }
        if (taxonomy.NIL != use) {
            PrintLow.format(stream, (SubLObject)taxonomy.$str50$__USE_______A__, use);
        }
        return term_name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 13260L)
    public static SubLObject write_taxonomy_flat(final SubLObject v_taxonomy, final SubLObject roots, SubLObject stream, SubLObject terms, SubLObject group_ntsP) {
        if (stream == taxonomy.UNPROVIDED) {
            stream = (SubLObject)taxonomy.T;
        }
        if (terms == taxonomy.UNPROVIDED) {
            terms = (SubLObject)taxonomy.NIL;
        }
        if (group_ntsP == taxonomy.UNPROVIDED) {
            group_ntsP = (SubLObject)taxonomy.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = taxonomy_mt(v_taxonomy);
        final SubLObject _prev_bind_0 = taxonomy.$taxonomy_term_relations_dict$.currentBinding(thread);
        try {
            taxonomy.$taxonomy_term_relations_dict$.bind(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)taxonomy.EQUAL), (SubLObject)taxonomy.UNPROVIDED), thread);
            SubLObject sorted_alist = (SubLObject)taxonomy.NIL;
            if (taxonomy.NIL == terms) {
                terms = taxonomy_terms(v_taxonomy, roots, mt);
            }
            taxonomy_initialize_term_relations_dict(v_taxonomy, terms, mt, (SubLObject)taxonomy.UNPROVIDED);
            SubLObject cdolist_list_var;
            sorted_alist = (cdolist_list_var = dictionary_utilities.sort_dictionary_by_keys(taxonomy_term_relations_dict(), (SubLObject)taxonomy.$sym43$STRING_LESSP));
            SubLObject pair = (SubLObject)taxonomy.NIL;
            pair = cdolist_list_var.first();
            while (taxonomy.NIL != cdolist_list_var) {
                final SubLObject term_name = pair.first();
                final SubLObject term_plist = pair.rest();
                display_taxonomy_term_details(v_taxonomy, mt, term_name, term_plist, stream, group_ntsP);
                PrintLow.format(stream, (SubLObject)taxonomy.$str51$__);
                cdolist_list_var = cdolist_list_var.rest();
                pair = cdolist_list_var.first();
            }
        }
        finally {
            taxonomy.$taxonomy_term_relations_dict$.rebind(_prev_bind_0, thread);
        }
        return v_taxonomy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 14249L)
    public static SubLObject write_taxonomy_flat_to_file(final SubLObject pathname, final SubLObject v_taxonomy, final SubLObject topics, SubLObject group_ntsP) {
        if (group_ntsP == taxonomy.UNPROVIDED) {
            group_ntsP = (SubLObject)taxonomy.T;
        }
        SubLObject stream = (SubLObject)taxonomy.NIL;
        try {
            stream = compatibility.open_text(pathname, (SubLObject)taxonomy.$kw52$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)taxonomy.$str53$Unable_to_open__S, pathname);
            }
            final SubLObject s_out = stream;
            final SubLObject mt = taxonomy_mt(v_taxonomy);
            final SubLObject terms = taxonomy_terms(v_taxonomy, topics, mt);
            write_taxonomy_flat(v_taxonomy, (SubLObject)taxonomy.NIL, s_out, terms, group_ntsP);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)taxonomy.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)taxonomy.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return pathname;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 14572L)
    public static SubLObject taxonomy_sort_by_name(final SubLObject v_taxonomy, final SubLObject terms) {
        SubLObject term_names = (SubLObject)taxonomy.NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = (SubLObject)taxonomy.NIL;
        v_term = cdolist_list_var.first();
        while (taxonomy.NIL != cdolist_list_var) {
            term_names = conses_high.acons(v_term, Strings.string_downcase(taxonomy_term_name(v_taxonomy, v_term), (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED), term_names);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        term_names = list_utilities.sort_alist_by_values(term_names, (SubLObject)taxonomy.$sym54$STRING_);
        return list_utilities.alist_keys(term_names);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 15038L)
    public static SubLObject taxonomy_update_used_names(final SubLObject used_names, final SubLObject term_name, final SubLObject v_term) {
        final SubLObject term_value = dictionary.dictionary_lookup(used_names, term_name, (SubLObject)taxonomy.UNPROVIDED);
        if (taxonomy.NIL != term_value) {
            if (!term_value.equal(v_term)) {
                Errors.warn((SubLObject)taxonomy.$str55$Did_not_write_out__S_because_it_s, v_term, term_value);
                return (SubLObject)taxonomy.NIL;
            }
        }
        else {
            dictionary.dictionary_enter(used_names, term_name, v_term);
        }
        return used_names;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 15508L)
    public static SubLObject display_taxonomy(final SubLObject v_taxonomy, final SubLObject topic, SubLObject used_names, final SubLObject irrelevant_terms, SubLObject stream, SubLObject spaces, SubLObject v_char, SubLObject group_ntsP) {
        if (stream == taxonomy.UNPROVIDED) {
            stream = (SubLObject)taxonomy.T;
        }
        if (spaces == taxonomy.UNPROVIDED) {
            spaces = (SubLObject)taxonomy.ZERO_INTEGER;
        }
        if (v_char == taxonomy.UNPROVIDED) {
            v_char = (SubLObject)Characters.CHAR_period;
        }
        if (group_ntsP == taxonomy.UNPROVIDED) {
            group_ntsP = (SubLObject)taxonomy.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (taxonomy.NIL != subl_promotions.memberP(topic, irrelevant_terms, Symbols.symbol_function((SubLObject)taxonomy.EQUAL), (SubLObject)taxonomy.UNPROVIDED)) {
            return (SubLObject)taxonomy.NIL;
        }
        final SubLObject mt = taxonomy_mt(v_taxonomy);
        final SubLObject topic_name = taxonomy_term_name(v_taxonomy, topic);
        used_names = taxonomy_update_used_names(used_names, topic_name, topic);
        if (taxonomy.NIL == used_names) {
            return (SubLObject)taxonomy.NIL;
        }
        SubLObject i;
        for (i = (SubLObject)taxonomy.NIL, i = (SubLObject)taxonomy.ZERO_INTEGER; i.numL(spaces); i = Numbers.add(i, (SubLObject)taxonomy.ONE_INTEGER)) {
            PrintLow.format(stream, (SubLObject)taxonomy.$str56$_C, v_char);
        }
        PrintLow.format(stream, (SubLObject)taxonomy.$str46$_A__, topic_name);
        spaces = Numbers.add(spaces, (SubLObject)taxonomy.ONE_INTEGER);
        SubLObject unfaceted_nts;
        final SubLObject narrower_terms = unfaceted_nts = taxonomy_nearest_narrower_terms(taxonomy.$const10$broaderTerm, topic, mt);
        SubLObject faceted_nts = (SubLObject)taxonomy.NIL;
        if (taxonomy.NIL != group_ntsP) {
            thread.resetMultipleValues();
            final SubLObject faceted_nts_$4 = taxonomy_grouped_narrower_terms(narrower_terms, v_taxonomy, topic, mt);
            final SubLObject unfaceted_nts_$5 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            faceted_nts = faceted_nts_$4;
            unfaceted_nts = unfaceted_nts_$5;
        }
        SubLObject cdolist_list_var = taxonomy_sort_by_name(v_taxonomy, unfaceted_nts);
        SubLObject child = (SubLObject)taxonomy.NIL;
        child = cdolist_list_var.first();
        while (taxonomy.NIL != cdolist_list_var) {
            display_taxonomy(v_taxonomy, child, used_names, irrelevant_terms, stream, spaces, v_char, group_ntsP);
            cdolist_list_var = cdolist_list_var.rest();
            child = cdolist_list_var.first();
        }
        cdolist_list_var = faceted_nts;
        SubLObject faceted_nt = (SubLObject)taxonomy.NIL;
        faceted_nt = cdolist_list_var.first();
        while (taxonomy.NIL != cdolist_list_var) {
            final SubLObject facet = faceted_nt.first();
            final SubLObject facet_name = taxonomy_term_name(v_taxonomy, facet);
            if (taxonomy.NIL != subl_promotions.memberP(facet, irrelevant_terms, Symbols.symbol_function((SubLObject)taxonomy.EQUAL), (SubLObject)taxonomy.UNPROVIDED)) {
                return (SubLObject)taxonomy.NIL;
            }
            used_names = taxonomy_update_used_names(used_names, facet_name, facet);
            if (taxonomy.NIL == used_names) {
                return (SubLObject)taxonomy.NIL;
            }
            SubLObject j;
            for (j = (SubLObject)taxonomy.NIL, j = (SubLObject)taxonomy.ZERO_INTEGER; j.numL(spaces); j = Numbers.add(j, (SubLObject)taxonomy.ONE_INTEGER)) {
                PrintLow.format(stream, (SubLObject)taxonomy.$str56$_C, v_char);
            }
            PrintLow.format(stream, (SubLObject)taxonomy.$str57$__A___, facet_name);
            SubLObject cdolist_list_var_$6 = taxonomy_sort_by_name(v_taxonomy, faceted_nt.rest());
            SubLObject child2 = (SubLObject)taxonomy.NIL;
            child2 = cdolist_list_var_$6.first();
            while (taxonomy.NIL != cdolist_list_var_$6) {
                display_taxonomy(v_taxonomy, child2, used_names, irrelevant_terms, stream, Numbers.add(spaces, (SubLObject)taxonomy.ONE_INTEGER), v_char, group_ntsP);
                cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                child2 = cdolist_list_var_$6.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            faceted_nt = cdolist_list_var.first();
        }
        return topic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 17168L)
    public static SubLObject write_taxonomy_hierarchy(final SubLObject v_taxonomy, final SubLObject roots, SubLObject stream, SubLObject v_char, SubLObject group_ntsP) {
        if (stream == taxonomy.UNPROVIDED) {
            stream = (SubLObject)taxonomy.T;
        }
        if (v_char == taxonomy.UNPROVIDED) {
            v_char = (SubLObject)Characters.CHAR_period;
        }
        if (group_ntsP == taxonomy.UNPROVIDED) {
            group_ntsP = (SubLObject)taxonomy.T;
        }
        assert taxonomy.NIL != cycl_grammar.cycl_represented_term_p(v_taxonomy) : v_taxonomy;
        assert taxonomy.NIL != Types.listp(roots) : roots;
        final SubLObject used_names = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)taxonomy.EQUAL), (SubLObject)taxonomy.UNPROVIDED);
        final SubLObject irrelevant_terms = taxonomy_irrelevant_terms(v_taxonomy);
        SubLObject cdolist_list_var = taxonomy_sort_by_name(v_taxonomy, roots);
        SubLObject root = (SubLObject)taxonomy.NIL;
        root = cdolist_list_var.first();
        while (taxonomy.NIL != cdolist_list_var) {
            display_taxonomy(v_taxonomy, root, used_names, irrelevant_terms, stream, (SubLObject)taxonomy.ZERO_INTEGER, v_char, group_ntsP);
            PrintLow.format(stream, (SubLObject)taxonomy.$str51$__);
            cdolist_list_var = cdolist_list_var.rest();
            root = cdolist_list_var.first();
        }
        return v_taxonomy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 17664L)
    public static SubLObject write_taxonomy_hierarchy_to_file(final SubLObject pathname, final SubLObject v_taxonomy, final SubLObject topics, SubLObject v_char, SubLObject group_ntsP) {
        if (v_char == taxonomy.UNPROVIDED) {
            v_char = (SubLObject)Characters.CHAR_period;
        }
        if (group_ntsP == taxonomy.UNPROVIDED) {
            group_ntsP = (SubLObject)taxonomy.T;
        }
        SubLObject stream = (SubLObject)taxonomy.NIL;
        try {
            stream = compatibility.open_text(pathname, (SubLObject)taxonomy.$kw52$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)taxonomy.$str53$Unable_to_open__S, pathname);
            }
            final SubLObject s_out = stream;
            write_taxonomy_hierarchy(v_taxonomy, topics, s_out, v_char, group_ntsP);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)taxonomy.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)taxonomy.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return pathname;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 18043L)
    public static SubLObject taxonomy_term_cycl_name(final SubLObject cycl_term) {
        return string_utilities.remove_substring(format_nil.format_nil_a(cycl_term), (SubLObject)taxonomy.$str60$__);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 18167L)
    public static SubLObject display_taxonomy_hierarchy_in_xml(final SubLObject v_taxonomy, final SubLObject topic, SubLObject used_names, final SubLObject irrelevant_terms, SubLObject stream, SubLObject spaces, SubLObject group_ntsP, SubLObject disambiguate_ufsP) {
        if (stream == taxonomy.UNPROVIDED) {
            stream = (SubLObject)taxonomy.T;
        }
        if (spaces == taxonomy.UNPROVIDED) {
            spaces = (SubLObject)taxonomy.ZERO_INTEGER;
        }
        if (group_ntsP == taxonomy.UNPROVIDED) {
            group_ntsP = (SubLObject)taxonomy.T;
        }
        if (disambiguate_ufsP == taxonomy.UNPROVIDED) {
            disambiguate_ufsP = (SubLObject)taxonomy.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (taxonomy.NIL != subl_promotions.memberP(topic, irrelevant_terms, Symbols.symbol_function((SubLObject)taxonomy.EQUAL), (SubLObject)taxonomy.UNPROVIDED)) {
            return (SubLObject)taxonomy.NIL;
        }
        final SubLObject mt = taxonomy_mt(v_taxonomy);
        final SubLObject topic_name = taxonomy_term_name(v_taxonomy, topic);
        used_names = taxonomy_update_used_names(used_names, topic_name, topic);
        if (taxonomy.NIL == used_names) {
            return (SubLObject)taxonomy.NIL;
        }
        SubLObject i;
        for (i = (SubLObject)taxonomy.NIL, i = (SubLObject)taxonomy.ZERO_INTEGER; i.numL(spaces); i = Numbers.add(i, (SubLObject)taxonomy.ONE_INTEGER)) {
            PrintLow.format(stream, (SubLObject)taxonomy.$str61$_);
        }
        PrintLow.format(stream, (SubLObject)taxonomy.$str62$_node_name__S_nodeType__term__cyc, topic_name, taxonomy_term_cycl_name(topic));
        final SubLObject alternate_names = taxonomy_term_used_for(v_taxonomy, topic, mt, topic_name, disambiguate_ufsP);
        if (taxonomy.NIL != alternate_names) {
            PrintLow.format(stream, (SubLObject)taxonomy.$str63$_usedFor__S, string_utilities.stringify_items(alternate_names, Symbols.symbol_function((SubLObject)taxonomy.$sym64$STR_BY_TYPE), (SubLObject)taxonomy.$str65$__, (SubLObject)taxonomy.UNPROVIDED));
        }
        spaces = Numbers.add(spaces, (SubLObject)taxonomy.TWO_INTEGER);
        final SubLObject narrower_terms = taxonomy_nearest_narrower_terms(taxonomy.$const10$broaderTerm, topic, mt);
        PrintLow.format(stream, (SubLObject)taxonomy.$str66$_isLeaf__S___, (SubLObject)((taxonomy.NIL != narrower_terms) ? taxonomy.$str67$false : taxonomy.$str68$true));
        if (taxonomy.NIL != narrower_terms) {
            SubLObject unfaceted_nts = narrower_terms;
            SubLObject faceted_nts = (SubLObject)taxonomy.NIL;
            if (taxonomy.NIL != group_ntsP) {
                thread.resetMultipleValues();
                final SubLObject faceted_nts_$7 = taxonomy_grouped_narrower_terms(narrower_terms, v_taxonomy, topic, mt);
                final SubLObject unfaceted_nts_$8 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                faceted_nts = faceted_nts_$7;
                unfaceted_nts = unfaceted_nts_$8;
            }
            SubLObject cdolist_list_var = taxonomy_sort_by_name(v_taxonomy, unfaceted_nts);
            SubLObject child = (SubLObject)taxonomy.NIL;
            child = cdolist_list_var.first();
            while (taxonomy.NIL != cdolist_list_var) {
                display_taxonomy_hierarchy_in_xml(v_taxonomy, child, used_names, irrelevant_terms, stream, spaces, group_ntsP, disambiguate_ufsP);
                cdolist_list_var = cdolist_list_var.rest();
                child = cdolist_list_var.first();
            }
            cdolist_list_var = faceted_nts;
            SubLObject faceted_nt = (SubLObject)taxonomy.NIL;
            faceted_nt = cdolist_list_var.first();
            while (taxonomy.NIL != cdolist_list_var) {
                final SubLObject facet = faceted_nt.first();
                final SubLObject facet_name = taxonomy_term_name(v_taxonomy, facet);
                if (taxonomy.NIL != subl_promotions.memberP(facet, irrelevant_terms, Symbols.symbol_function((SubLObject)taxonomy.EQUAL), (SubLObject)taxonomy.UNPROVIDED)) {
                    return (SubLObject)taxonomy.NIL;
                }
                used_names = taxonomy_update_used_names(used_names, facet_name, facet);
                if (taxonomy.NIL == used_names) {
                    return (SubLObject)taxonomy.NIL;
                }
                SubLObject j;
                for (j = (SubLObject)taxonomy.NIL, j = (SubLObject)taxonomy.ZERO_INTEGER; j.numL(spaces); j = Numbers.add(j, (SubLObject)taxonomy.ONE_INTEGER)) {
                    PrintLow.format(stream, (SubLObject)taxonomy.$str61$_);
                }
                PrintLow.format(stream, (SubLObject)taxonomy.$str69$_node_name__S_nodeType__facet__cy, facet_name, taxonomy_term_cycl_name(facet));
                SubLObject cdolist_list_var_$9 = taxonomy_sort_by_name(v_taxonomy, faceted_nt.rest());
                SubLObject child2 = (SubLObject)taxonomy.NIL;
                child2 = cdolist_list_var_$9.first();
                while (taxonomy.NIL != cdolist_list_var_$9) {
                    display_taxonomy_hierarchy_in_xml(v_taxonomy, child2, used_names, irrelevant_terms, stream, Numbers.add(spaces, (SubLObject)taxonomy.TWO_INTEGER), group_ntsP, disambiguate_ufsP);
                    cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                    child2 = cdolist_list_var_$9.first();
                }
                SubLObject k;
                for (k = (SubLObject)taxonomy.NIL, k = (SubLObject)taxonomy.ZERO_INTEGER; k.numL(spaces); k = Numbers.add(k, (SubLObject)taxonomy.ONE_INTEGER)) {
                    PrintLow.format(stream, (SubLObject)taxonomy.$str61$_);
                }
                PrintLow.format(stream, (SubLObject)taxonomy.$str70$__node___);
                cdolist_list_var = cdolist_list_var.rest();
                faceted_nt = cdolist_list_var.first();
            }
        }
        SubLObject cdotimes_end_var;
        SubLObject l;
        for (cdotimes_end_var = Numbers.subtract(spaces, (SubLObject)taxonomy.TWO_INTEGER), l = (SubLObject)taxonomy.NIL, l = (SubLObject)taxonomy.ZERO_INTEGER; l.numL(cdotimes_end_var); l = Numbers.add(l, (SubLObject)taxonomy.ONE_INTEGER)) {
            PrintLow.format(stream, (SubLObject)taxonomy.$str61$_);
        }
        PrintLow.format(stream, (SubLObject)taxonomy.$str70$__node___);
        return topic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 21351L)
    public static SubLObject write_taxonomy_hierarchy_in_xml(final SubLObject v_taxonomy, final SubLObject roots, SubLObject stream, SubLObject group_ntsP, SubLObject disambiguate_ufsP) {
        if (stream == taxonomy.UNPROVIDED) {
            stream = (SubLObject)taxonomy.T;
        }
        if (group_ntsP == taxonomy.UNPROVIDED) {
            group_ntsP = (SubLObject)taxonomy.T;
        }
        if (disambiguate_ufsP == taxonomy.UNPROVIDED) {
            disambiguate_ufsP = (SubLObject)taxonomy.T;
        }
        assert taxonomy.NIL != cycl_grammar.cycl_represented_term_p(v_taxonomy) : v_taxonomy;
        assert taxonomy.NIL != Types.listp(roots) : roots;
        final SubLObject used_names = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)taxonomy.EQUAL), (SubLObject)taxonomy.UNPROVIDED);
        final SubLObject irrelevant_terms = taxonomy_irrelevant_terms(v_taxonomy);
        PrintLow.format(stream, (SubLObject)taxonomy.$str71$_root___);
        SubLObject cdolist_list_var = taxonomy_sort_by_name(v_taxonomy, roots);
        SubLObject root = (SubLObject)taxonomy.NIL;
        root = cdolist_list_var.first();
        while (taxonomy.NIL != cdolist_list_var) {
            display_taxonomy_hierarchy_in_xml(v_taxonomy, root, used_names, irrelevant_terms, stream, (SubLObject)taxonomy.ZERO_INTEGER, group_ntsP, disambiguate_ufsP);
            PrintLow.format(stream, (SubLObject)taxonomy.$str51$__);
            cdolist_list_var = cdolist_list_var.rest();
            root = cdolist_list_var.first();
        }
        PrintLow.format(stream, (SubLObject)taxonomy.$str72$__root_);
        return v_taxonomy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 22288L)
    public static SubLObject write_taxonomy_hierarchy_to_xml_file(final SubLObject pathname, final SubLObject v_taxonomy, final SubLObject topics, SubLObject group_ntsP, SubLObject disambiguate_ufsP) {
        if (group_ntsP == taxonomy.UNPROVIDED) {
            group_ntsP = (SubLObject)taxonomy.T;
        }
        if (disambiguate_ufsP == taxonomy.UNPROVIDED) {
            disambiguate_ufsP = (SubLObject)taxonomy.T;
        }
        assert taxonomy.NIL != Types.stringp(pathname) : pathname;
        SubLObject stream = (SubLObject)taxonomy.NIL;
        try {
            stream = compatibility.open_text(pathname, (SubLObject)taxonomy.$kw52$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)taxonomy.$str53$Unable_to_open__S, pathname);
            }
            final SubLObject s_out = stream;
            write_taxonomy_hierarchy_in_xml(v_taxonomy, topics, s_out, group_ntsP, disambiguate_ufsP);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)taxonomy.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)taxonomy.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return pathname;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 22692L)
    public static SubLObject write_taxonomy_terms_info_as_csv_files(final SubLObject f1, final SubLObject f2, final SubLObject v_taxonomy, final SubLObject roots, SubLObject terms_info_dict) {
        if (terms_info_dict == taxonomy.UNPROVIDED) {
            terms_info_dict = (SubLObject)taxonomy.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = taxonomy_mt(v_taxonomy);
        if (taxonomy.NIL == terms_info_dict) {
            final SubLObject _prev_bind_0 = taxonomy.$taxonomy_term_relations_dict$.currentBinding(thread);
            try {
                taxonomy.$taxonomy_term_relations_dict$.bind(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)taxonomy.EQUAL), (SubLObject)taxonomy.UNPROVIDED), thread);
                final SubLObject terms = taxonomy_terms(v_taxonomy, roots, mt);
                taxonomy_initialize_term_relations_dict(v_taxonomy, terms, mt, (SubLObject)taxonomy.UNPROVIDED);
                terms_info_dict = taxonomy_term_relations_dict();
            }
            finally {
                taxonomy.$taxonomy_term_relations_dict$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_keys(terms_info_dict, (SubLObject)taxonomy.$sym43$STRING_LESSP);
        SubLObject pair = (SubLObject)taxonomy.NIL;
        pair = cdolist_list_var.first();
        while (taxonomy.NIL != cdolist_list_var) {
            final SubLObject term_name = pair.first();
            final SubLObject term_plist = pair.rest();
            final SubLObject term_uid = conses_high.getf(term_plist, (SubLObject)taxonomy.$kw36$UID, (SubLObject)taxonomy.UNPROVIDED);
            final SubLObject bts = conses_high.getf(term_plist, (SubLObject)taxonomy.$kw39$BT, (SubLObject)taxonomy.UNPROVIDED);
            final SubLObject nts = conses_high.getf(term_plist, (SubLObject)taxonomy.$kw40$NT, (SubLObject)taxonomy.UNPROVIDED);
            final SubLObject ufs = conses_high.getf(term_plist, (SubLObject)taxonomy.$kw41$UF, (SubLObject)taxonomy.UNPROVIDED);
            final SubLObject use = conses_high.getf(term_plist, (SubLObject)taxonomy.$kw34$USE, (SubLObject)taxonomy.UNPROVIDED);
            SubLObject stream = (SubLObject)taxonomy.NIL;
            try {
                stream = compatibility.open_text(f1, (SubLObject)taxonomy.$kw74$APPEND);
                if (!stream.isStream()) {
                    Errors.error((SubLObject)taxonomy.$str53$Unable_to_open__S, f1);
                }
                final SubLObject s1 = stream;
                PrintLow.format(s1, (SubLObject)taxonomy.$str75$_S__S__EN___, term_name, term_uid);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)taxonomy.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)taxonomy.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            SubLObject stream_$10 = (SubLObject)taxonomy.NIL;
            try {
                stream_$10 = compatibility.open_text(f2, (SubLObject)taxonomy.$kw74$APPEND);
                if (!stream_$10.isStream()) {
                    Errors.error((SubLObject)taxonomy.$str53$Unable_to_open__S, f2);
                }
                final SubLObject s2 = stream_$10;
                SubLObject cdolist_list_var_$11 = bts;
                SubLObject bt = (SubLObject)taxonomy.NIL;
                bt = cdolist_list_var_$11.first();
                while (taxonomy.NIL != cdolist_list_var_$11) {
                    final SubLObject bt_name = taxonomy_term_name(v_taxonomy, bt);
                    PrintLow.format(s2, (SubLObject)taxonomy.$str76$_S__S__BT___S__S__, new SubLObject[] { term_name, term_uid, bt_name, conses_high.getf(dictionary.dictionary_lookup(terms_info_dict, bt_name, (SubLObject)taxonomy.UNPROVIDED), (SubLObject)taxonomy.$kw36$UID, (SubLObject)taxonomy.UNPROVIDED) });
                    cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                    bt = cdolist_list_var_$11.first();
                }
                SubLObject cdolist_list_var_$12 = nts;
                SubLObject nt = (SubLObject)taxonomy.NIL;
                nt = cdolist_list_var_$12.first();
                while (taxonomy.NIL != cdolist_list_var_$12) {
                    final SubLObject nt_name = taxonomy_term_name(v_taxonomy, nt);
                    PrintLow.format(s2, (SubLObject)taxonomy.$str77$_S__S__NT___S__S__, new SubLObject[] { term_name, term_uid, nt_name, conses_high.getf(dictionary.dictionary_lookup(terms_info_dict, nt_name, (SubLObject)taxonomy.UNPROVIDED), (SubLObject)taxonomy.$kw36$UID, (SubLObject)taxonomy.UNPROVIDED) });
                    cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                    nt = cdolist_list_var_$12.first();
                }
                SubLObject cdolist_list_var_$13 = ufs;
                SubLObject uf = (SubLObject)taxonomy.NIL;
                uf = cdolist_list_var_$13.first();
                while (taxonomy.NIL != cdolist_list_var_$13) {
                    PrintLow.format(s2, (SubLObject)taxonomy.$str78$_S__S__UF___S__S__, new SubLObject[] { term_name, term_uid, uf, conses_high.getf(dictionary.dictionary_lookup(terms_info_dict, uf, (SubLObject)taxonomy.UNPROVIDED), (SubLObject)taxonomy.$kw36$UID, (SubLObject)taxonomy.UNPROVIDED) });
                    cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                    uf = cdolist_list_var_$13.first();
                }
                if (taxonomy.NIL != use) {
                    PrintLow.format(s2, (SubLObject)taxonomy.$str79$_S__S__USE___S__S__, new SubLObject[] { term_name, term_uid, use, conses_high.getf(dictionary.dictionary_lookup(terms_info_dict, use, (SubLObject)taxonomy.UNPROVIDED), (SubLObject)taxonomy.$kw36$UID, (SubLObject)taxonomy.UNPROVIDED) });
                }
            }
            finally {
                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)taxonomy.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if (stream_$10.isStream()) {
                        streams_high.close(stream_$10, (SubLObject)taxonomy.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return v_taxonomy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 24335L)
    public static SubLObject export_taxonomy_to_owl(final SubLObject v_taxonomy, final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_forts = list_utilities.remove_if_not((SubLObject)taxonomy.$sym80$FORT_P, ask_utilities.query_variable((SubLObject)taxonomy.$sym4$_TERM, (SubLObject)ConsesLow.list(taxonomy.$const6$nodeInSystem, (SubLObject)taxonomy.$sym4$_TERM, v_taxonomy), taxonomy.$const3$InferencePSC, (SubLObject)taxonomy.$list81), (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED);
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
            owlification.$owl_use_pretty_stringsP$.bind((SubLObject)taxonomy.T, thread);
            owlification.$owl_use_external_ids_for_namesP$.bind((SubLObject)taxonomy.T, thread);
            owl_uris_and_prefixes.$owl_export_version_date$.bind(owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread), thread);
            owlification.$owl_use_entity_referencesP$.bind((SubLObject)taxonomy.NIL, thread);
            owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.bind((SubLObject)taxonomy.T, thread);
            owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.bind((SubLObject)taxonomy.T, thread);
            owlification.$owl_export_from_opencyc_kbP$.bind((SubLObject)taxonomy.T, thread);
            owlification.$owl_use_external_ids_for_namesP$.bind((SubLObject)taxonomy.NIL, thread);
            owl_uris_and_prefixes.$owl_export_version_date$.bind(owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread), thread);
            if (taxonomy.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && taxonomy.NIL == numeric_date_utilities.universal_date_p(owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread))) {
                Errors.error((SubLObject)taxonomy.$str82$Human_readable_OWL_export_require, owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread));
            }
            SubLObject stream = (SubLObject)taxonomy.NIL;
            try {
                final SubLObject _prev_bind_0_$14 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)taxonomy.NIL, thread);
                    stream = compatibility.open_text(filename, (SubLObject)taxonomy.$kw52$OUTPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$14, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)taxonomy.$str53$Unable_to_open__S, filename);
                }
                final SubLObject stream_$15 = stream;
                owl_cycl_to_xml.owl_export_terms(v_forts, stream_$15, (SubLObject)taxonomy.UNPROVIDED);
            }
            finally {
                final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)taxonomy.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)taxonomy.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                }
            }
        }
        finally {
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
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 24801L)
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
            owlification.$owl_use_pretty_stringsP$.bind((SubLObject)taxonomy.T, thread);
            owlification.$owl_use_external_ids_for_namesP$.bind((SubLObject)taxonomy.T, thread);
            owl_uris_and_prefixes.$owl_export_version_date$.bind(owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread), thread);
            owlification.$owl_use_entity_referencesP$.bind((SubLObject)taxonomy.NIL, thread);
            owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.bind((SubLObject)taxonomy.T, thread);
            owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.bind((SubLObject)taxonomy.T, thread);
            owlification.$owl_export_from_opencyc_kbP$.bind((SubLObject)taxonomy.T, thread);
            owlification.$owl_use_external_ids_for_namesP$.bind((SubLObject)taxonomy.NIL, thread);
            owl_uris_and_prefixes.$owl_export_version_date$.bind(owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread), thread);
            if (taxonomy.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && taxonomy.NIL == numeric_date_utilities.universal_date_p(owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread))) {
                Errors.error((SubLObject)taxonomy.$str82$Human_readable_OWL_export_require, owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread));
            }
            SubLObject stream = (SubLObject)taxonomy.NIL;
            try {
                final SubLObject _prev_bind_0_$17 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)taxonomy.NIL, thread);
                    stream = compatibility.open_text(filename, (SubLObject)taxonomy.$kw52$OUTPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$17, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)taxonomy.$str53$Unable_to_open__S, filename);
                }
                final SubLObject stream_$18 = stream;
                owl_cycl_to_xml.owl_export_terms(v_forts, stream_$18, (SubLObject)taxonomy.UNPROVIDED);
            }
            finally {
                final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)taxonomy.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)taxonomy.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                }
            }
        }
        finally {
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
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 25094L)
    public static SubLObject get_taxonomy_sample(final SubLObject v_taxonomy, final SubLObject root) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tree = construct_taxonomy_tree(v_taxonomy, root, (SubLObject)taxonomy.UNPROVIDED);
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                tree = nprune_taxonomy_tree(tree);
            }
            finally {
                final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)taxonomy.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Sequences.delete_duplicates(list_utilities.flatten(tree), (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 25331L)
    public static SubLObject construct_taxonomy_tree(final SubLObject v_taxonomy, final SubLObject root, SubLObject path) {
        if (path == taxonomy.UNPROVIDED) {
            path = (SubLObject)taxonomy.NIL;
        }
        SubLObject tree = (SubLObject)ConsesLow.list(root);
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_any_mt(root, taxonomy.$const10$broaderTerm, (SubLObject)taxonomy.TWO_INTEGER, (SubLObject)taxonomy.ONE_INTEGER, (SubLObject)taxonomy.UNPROVIDED);
        SubLObject subnode = (SubLObject)taxonomy.NIL;
        subnode = cdolist_list_var.first();
        while (taxonomy.NIL != cdolist_list_var) {
            if (taxonomy.NIL != kb_indexing_datastructures.indexed_term_p(subnode) && taxonomy.NIL == Sequences.find(subnode, path, Symbols.symbol_function((SubLObject)taxonomy.EQUAL), (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED) && taxonomy.NIL != backward.removal_ask((SubLObject)ConsesLow.list(taxonomy.$const6$nodeInSystem, subnode, v_taxonomy), taxonomy.$const3$InferencePSC, (SubLObject)taxonomy.UNPROVIDED, (SubLObject)taxonomy.UNPROVIDED)) {
                tree = list_utilities.nadd_to_end(construct_taxonomy_tree(v_taxonomy, subnode, (SubLObject)ConsesLow.cons(root, path)), tree);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subnode = cdolist_list_var.first();
        }
        return tree;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 25775L)
    public static SubLObject nprune_taxonomy_tree(final SubLObject tree) {
        if (taxonomy.NIL != list_utilities.lengthG(tree, (SubLObject)taxonomy.ONE_INTEGER, (SubLObject)taxonomy.UNPROVIDED)) {
            final SubLObject subtrees = tree.rest();
            final SubLObject maximal_subtree = number_utilities.maximum(subtrees, Symbols.symbol_function((SubLObject)taxonomy.$sym83$TAXONOMY_TREE_DEPTH));
            SubLObject list_var = (SubLObject)taxonomy.NIL;
            SubLObject subtree = (SubLObject)taxonomy.NIL;
            SubLObject i = (SubLObject)taxonomy.NIL;
            list_var = tree;
            subtree = list_var.first();
            for (i = (SubLObject)taxonomy.ZERO_INTEGER; taxonomy.NIL != list_var; list_var = list_var.rest(), subtree = list_var.first(), i = Numbers.add((SubLObject)taxonomy.ONE_INTEGER, i)) {
                if (!i.isZero()) {
                    if (subtree.eql(maximal_subtree)) {
                        ConsesLow.set_nth(i, tree, nprune_taxonomy_tree(maximal_subtree));
                    }
                    else {
                        ConsesLow.set_nth(i, tree, (SubLObject)ConsesLow.list(subtree.first()));
                    }
                }
            }
        }
        return tree;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 26183L)
    public static SubLObject taxonomy_tree_depth_internal(final SubLObject tree) {
        SubLObject depth = (SubLObject)taxonomy.ONE_INTEGER;
        SubLObject cdolist_list_var = tree.rest();
        SubLObject subtree = (SubLObject)taxonomy.NIL;
        subtree = cdolist_list_var.first();
        while (taxonomy.NIL != cdolist_list_var) {
            final SubLObject subtree_depth = taxonomy_tree_depth(subtree);
            if (subtree_depth.numGE(depth)) {
                depth = number_utilities.f_1X(subtree_depth);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subtree = cdolist_list_var.first();
        }
        return depth;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/taxonomy.lisp", position = 26183L)
    public static SubLObject taxonomy_tree_depth(final SubLObject tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)taxonomy.NIL;
        if (taxonomy.NIL == v_memoization_state) {
            return taxonomy_tree_depth_internal(tree);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)taxonomy.$sym83$TAXONOMY_TREE_DEPTH, (SubLObject)taxonomy.UNPROVIDED);
        if (taxonomy.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)taxonomy.$sym83$TAXONOMY_TREE_DEPTH, (SubLObject)taxonomy.ONE_INTEGER, (SubLObject)taxonomy.NIL, (SubLObject)taxonomy.EQ, (SubLObject)taxonomy.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)taxonomy.$sym83$TAXONOMY_TREE_DEPTH, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, tree, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(taxonomy_tree_depth_internal(tree)));
            memoization_state.caching_state_put(caching_state, tree, results, (SubLObject)taxonomy.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    public static SubLObject declare_taxonomy_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "taxonomy_term_relations_dict", "TAXONOMY-TERM-RELATIONS-DICT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "taxonomy_mt", "TAXONOMY-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "taxonomy_irrelevant_terms", "TAXONOMY-IRRELEVANT-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "taxonomy_terms", "TAXONOMY-TERMS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "taxonomy_term_name_needs_disambiguationP", "TAXONOMY-TERM-NAME-NEEDS-DISAMBIGUATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "clear_taxonomy_generate_non_singular_phrase", "CLEAR-TAXONOMY-GENERATE-NON-SINGULAR-PHRASE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "remove_taxonomy_generate_non_singular_phrase", "REMOVE-TAXONOMY-GENERATE-NON-SINGULAR-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "taxonomy_generate_non_singular_phrase_internal", "TAXONOMY-GENERATE-NON-SINGULAR-PHRASE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "taxonomy_generate_non_singular_phrase", "TAXONOMY-GENERATE-NON-SINGULAR-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "taxonomy_term_disambiguation_string", "TAXONOMY-TERM-DISAMBIGUATION-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "taxonomy_disambiguated_term_string", "TAXONOMY-DISAMBIGUATED-TERM-STRING", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "clear_taxonomy_term_name", "CLEAR-TAXONOMY-TERM-NAME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "remove_taxonomy_term_name", "REMOVE-TAXONOMY-TERM-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "taxonomy_term_name_internal", "TAXONOMY-TERM-NAME-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "taxonomy_term_name", "TAXONOMY-TERM-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "clear_taxonomy_suppressed_facets", "CLEAR-TAXONOMY-SUPPRESSED-FACETS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "remove_taxonomy_suppressed_facets", "REMOVE-TAXONOMY-SUPPRESSED-FACETS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "taxonomy_suppressed_facets_internal", "TAXONOMY-SUPPRESSED-FACETS-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "taxonomy_suppressed_facets", "TAXONOMY-SUPPRESSED-FACETS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "taxonomy_grouped_narrower_terms", "TAXONOMY-GROUPED-NARROWER-TERMS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "taxonomy_nearest_broader_terms", "TAXONOMY-NEAREST-BROADER-TERMS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "taxonomy_nearest_narrower_terms", "TAXONOMY-NEAREST-NARROWER-TERMS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "taxonomy_term_used_for", "TAXONOMY-TERM-USED-FOR", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "taxonomy_initialize_term_relations_dict", "TAXONOMY-INITIALIZE-TERM-RELATIONS-DICT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "clear_taxonomy_caches", "CLEAR-TAXONOMY-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "taxonomy_write_list", "TAXONOMY-WRITE-LIST", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "taxonomy_write_alist", "TAXONOMY-WRITE-ALIST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "display_taxonomy_term_details", "DISPLAY-TAXONOMY-TERM-DETAILS", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "write_taxonomy_flat", "WRITE-TAXONOMY-FLAT", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "write_taxonomy_flat_to_file", "WRITE-TAXONOMY-FLAT-TO-FILE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "taxonomy_sort_by_name", "TAXONOMY-SORT-BY-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "taxonomy_update_used_names", "TAXONOMY-UPDATE-USED-NAMES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "display_taxonomy", "DISPLAY-TAXONOMY", 4, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "write_taxonomy_hierarchy", "WRITE-TAXONOMY-HIERARCHY", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "write_taxonomy_hierarchy_to_file", "WRITE-TAXONOMY-HIERARCHY-TO-FILE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "taxonomy_term_cycl_name", "TAXONOMY-TERM-CYCL-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "display_taxonomy_hierarchy_in_xml", "DISPLAY-TAXONOMY-HIERARCHY-IN-XML", 4, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "write_taxonomy_hierarchy_in_xml", "WRITE-TAXONOMY-HIERARCHY-IN-XML", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "write_taxonomy_hierarchy_to_xml_file", "WRITE-TAXONOMY-HIERARCHY-TO-XML-FILE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "write_taxonomy_terms_info_as_csv_files", "WRITE-TAXONOMY-TERMS-INFO-AS-CSV-FILES", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "export_taxonomy_to_owl", "EXPORT-TAXONOMY-TO-OWL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "export_taxonomy_sample_to_owl", "EXPORT-TAXONOMY-SAMPLE-TO-OWL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "get_taxonomy_sample", "GET-TAXONOMY-SAMPLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "construct_taxonomy_tree", "CONSTRUCT-TAXONOMY-TREE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "nprune_taxonomy_tree", "NPRUNE-TAXONOMY-TREE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "taxonomy_tree_depth_internal", "TAXONOMY-TREE-DEPTH-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.taxonomy", "taxonomy_tree_depth", "TAXONOMY-TREE-DEPTH", 1, 0, false);
        return (SubLObject)taxonomy.NIL;
    }
    
    public static SubLObject init_taxonomy_file() {
        taxonomy.$taxonomy_term_relations_dict$ = SubLFiles.defparameter("*TAXONOMY-TERM-RELATIONS-DICT*", (SubLObject)taxonomy.NIL);
        taxonomy.$taxonomy_generate_non_singular_phrase_caching_state$ = SubLFiles.deflexical("*TAXONOMY-GENERATE-NON-SINGULAR-PHRASE-CACHING-STATE*", (SubLObject)taxonomy.NIL);
        taxonomy.$taxonomy_term_name_caching_state$ = SubLFiles.deflexical("*TAXONOMY-TERM-NAME-CACHING-STATE*", (SubLObject)taxonomy.NIL);
        taxonomy.$taxonomy_suppressed_facets_caching_state$ = SubLFiles.deflexical("*TAXONOMY-SUPPRESSED-FACETS-CACHING-STATE*", (SubLObject)taxonomy.NIL);
        return (SubLObject)taxonomy.NIL;
    }
    
    public static SubLObject setup_taxonomy_file() {
        memoization_state.note_globally_cached_function((SubLObject)taxonomy.$sym11$TAXONOMY_GENERATE_NON_SINGULAR_PHRASE);
        memoization_state.note_globally_cached_function((SubLObject)taxonomy.$sym18$TAXONOMY_TERM_NAME);
        memoization_state.note_globally_cached_function((SubLObject)taxonomy.$sym25$TAXONOMY_SUPPRESSED_FACETS);
        memoization_state.note_memoized_function((SubLObject)taxonomy.$sym83$TAXONOMY_TREE_DEPTH);
        return (SubLObject)taxonomy.NIL;
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
        me = (SubLFile)new taxonomy();
        taxonomy.$taxonomy_term_relations_dict$ = null;
        taxonomy.$taxonomy_generate_non_singular_phrase_caching_state$ = null;
        taxonomy.$taxonomy_term_name_caching_state$ = null;
        taxonomy.$taxonomy_suppressed_facets_caching_state$ = null;
        $sym0$_MT = SubLObjectFactory.makeSymbol("?MT");
        $const1$contextOfPCW = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("contextOfPCW"));
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?MT"));
        $const3$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym4$_TERM = SubLObjectFactory.makeSymbol("?TERM");
        $const5$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const6$nodeInSystem = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nodeInSystem"));
        $list7 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keIrrelevantTerm")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM")));
        $const8$TaxonomyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TaxonomyMt"));
        $sym9$_X = SubLObjectFactory.makeSymbol("?X");
        $const10$broaderTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("broaderTerm"));
        $sym11$TAXONOMY_GENERATE_NON_SINGULAR_PHRASE = SubLObjectFactory.makeSymbol("TAXONOMY-GENERATE-NON-SINGULAR-PHRASE");
        $list12 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonSingular-Generic")));
        $sym13$_TAXONOMY_GENERATE_NON_SINGULAR_PHRASE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*TAXONOMY-GENERATE-NON-SINGULAR-PHRASE-CACHING-STATE*");
        $int14$100 = SubLObjectFactory.makeInteger(100);
        $str15$No_disambiguating_generalization_ = SubLObjectFactory.makeString("No disambiguating generalization could be found for ~A");
        $str16$__ = SubLObjectFactory.makeString(" (");
        $str17$_ = SubLObjectFactory.makeString(")");
        $sym18$TAXONOMY_TERM_NAME = SubLObjectFactory.makeSymbol("TAXONOMY-TERM-NAME");
        $const19$conceptInSystemDefaultDisplayStri = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conceptInSystemDefaultDisplayString"));
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?X"));
        $str21$_ = SubLObjectFactory.makeString("'");
        $str22$_ = SubLObjectFactory.makeString("\"");
        $sym23$_TAXONOMY_TERM_NAME_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*TAXONOMY-TERM-NAME-CACHING-STATE*");
        $int24$1000 = SubLObjectFactory.makeInteger(1000);
        $sym25$TAXONOMY_SUPPRESSED_FACETS = SubLObjectFactory.makeSymbol("TAXONOMY-SUPPRESSED-FACETS");
        $sym26$_FACET = SubLObjectFactory.makeSymbol("?FACET");
        $const27$suppressFacet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("suppressFacet"));
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?FACET"));
        $sym29$_TAXONOMY_SUPPRESSED_FACETS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*TAXONOMY-SUPPRESSED-FACETS-CACHING-STATE*");
        $const30$facets_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("facets-Generic"));
        $const31$taxonomyIrrelevantString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("taxonomyIrrelevantString"));
        $kw32$CYCL = SubLObjectFactory.makeKeyword("CYCL");
        $str33$_S_is_being_used_as_a_name_for__A = SubLObjectFactory.makeString("~S is being used as a name for ~A. So, it cannot be used as an alternate-name for ~A.");
        $kw34$USE = SubLObjectFactory.makeKeyword("USE");
        $str35$_S_is_being_used_as_an_alternate_ = SubLObjectFactory.makeString("~S is being used as an alternate-name for ~S (~A). So, it cannot be used as an alternate-name for ~A.");
        $kw36$UID = SubLObjectFactory.makeKeyword("UID");
        $int37$10000 = SubLObjectFactory.makeInteger(10000);
        $str38$_S_is_being_used_as_a_name_for__A = SubLObjectFactory.makeString("~S is being used as a name for ~A.  Hence, it will not be used for ~A, which is ignored.");
        $kw39$BT = SubLObjectFactory.makeKeyword("BT");
        $kw40$NT = SubLObjectFactory.makeKeyword("NT");
        $kw41$UF = SubLObjectFactory.makeKeyword("UF");
        $kw42$CLEARED = SubLObjectFactory.makeKeyword("CLEARED");
        $sym43$STRING_LESSP = SubLObjectFactory.makeSymbol("STRING-LESSP");
        $str44$_____A__ = SubLObjectFactory.makeString("    ~A~%");
        $str45$______A___ = SubLObjectFactory.makeString("    <~A>~%");
        $str46$_A__ = SubLObjectFactory.makeString("~A~%");
        $str47$__BT__ = SubLObjectFactory.makeString("  BT~%");
        $str48$__NT__ = SubLObjectFactory.makeString("  NT~%");
        $str49$__UF__ = SubLObjectFactory.makeString("  UF~%");
        $str50$__USE_______A__ = SubLObjectFactory.makeString("  USE~%    ~A~%");
        $str51$__ = SubLObjectFactory.makeString("~%");
        $kw52$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str53$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $sym54$STRING_ = SubLObjectFactory.makeSymbol("STRING<");
        $str55$Did_not_write_out__S_because_it_s = SubLObjectFactory.makeString("Did not write out ~S because it shares taxonomy-name with ~S");
        $str56$_C = SubLObjectFactory.makeString("~C");
        $str57$__A___ = SubLObjectFactory.makeString("<~A>~%");
        $sym58$CYCL_REPRESENTED_TERM_P = SubLObjectFactory.makeSymbol("CYCL-REPRESENTED-TERM-P");
        $sym59$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $str60$__ = SubLObjectFactory.makeString("#$");
        $str61$_ = SubLObjectFactory.makeString(" ");
        $str62$_node_name__S_nodeType__term__cyc = SubLObjectFactory.makeString("<node name=~S nodeType=\"term\" cycTerm=~S");
        $str63$_usedFor__S = SubLObjectFactory.makeString(" usedFor=~S");
        $sym64$STR_BY_TYPE = SubLObjectFactory.makeSymbol("STR-BY-TYPE");
        $str65$__ = SubLObjectFactory.makeString(", ");
        $str66$_isLeaf__S___ = SubLObjectFactory.makeString(" isLeaf=~S>~%");
        $str67$false = SubLObjectFactory.makeString("false");
        $str68$true = SubLObjectFactory.makeString("true");
        $str69$_node_name__S_nodeType__facet__cy = SubLObjectFactory.makeString("<node name=~S nodeType=\"facet\" cycTerm=~S isLeaf=\"false\">~%");
        $str70$__node___ = SubLObjectFactory.makeString("</node>~%");
        $str71$_root___ = SubLObjectFactory.makeString("<root>~%");
        $str72$__root_ = SubLObjectFactory.makeString("</root>");
        $sym73$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw74$APPEND = SubLObjectFactory.makeKeyword("APPEND");
        $str75$_S__S__EN___ = SubLObjectFactory.makeString("~S,~S,\"EN\"~%");
        $str76$_S__S__BT___S__S__ = SubLObjectFactory.makeString("~S,~S,\"BT\",~S,~S~%");
        $str77$_S__S__NT___S__S__ = SubLObjectFactory.makeString("~S,~S,\"NT\",~S,~S~%");
        $str78$_S__S__UF___S__S__ = SubLObjectFactory.makeString("~S,~S,\"UF\",~S,~S~%");
        $str79$_S__S__USE___S__S__ = SubLObjectFactory.makeString("~S,~S,\"USE\",~S,~S~%");
        $sym80$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"), (SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("MINIMAL"));
        $str82$Human_readable_OWL_export_require = SubLObjectFactory.makeString("Human-readable OWL export requires a valid (UNIVERSAL-DATE-P) version date. Got ~S");
        $sym83$TAXONOMY_TREE_DEPTH = SubLObjectFactory.makeSymbol("TAXONOMY-TREE-DEPTH");
    }
}

/*

	Total time: 401 ms
	
*/