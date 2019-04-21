package com.cyc.cycjava.cycl.sbhl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.genl_predicates;
import java.util.Map;
import java.util.Iterator;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sbhl_cache extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_cache";
    public static final String myFingerPrint = "107c36b89ace2d69208df8c2177734ea1c3aa44e835a88ea73f26d8e0001662e";
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 1283L)
    private static SubLSymbol $sbhl_caches_initializedP$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 2452L)
    private static SubLSymbol $cached_genl_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 3132L)
    public static SubLSymbol $cached_genl_predicates_set$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 3313L)
    public static SubLSymbol $genl_predicate_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 3424L)
    public static SubLSymbol $genl_inverse_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 3530L)
    public static SubLSymbol $all_mts_genl_predicate_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 3672L)
    public static SubLSymbol $all_mts_genl_inverse_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 3809L)
    private static SubLSymbol $cached_genls$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 4349L)
    public static SubLSymbol $cached_genls_set$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 4489L)
    public static SubLSymbol $genls_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 4582L)
    public static SubLSymbol $all_mts_genls_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 4683L)
    public static SubLSymbol $definitional_fort_typing_collections$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 4927L)
    public static SubLSymbol $additional_fort_typing_collections$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 6650L)
    public static SubLSymbol $application_specific_fort_typing_collections$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 7720L)
    public static SubLSymbol $implicit_fort_typing_collections$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 7979L)
    public static SubLSymbol $cached_isas$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 8203L)
    public static SubLSymbol $cached_isas_set$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 9526L)
    public static SubLSymbol $isa_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 9623L)
    public static SubLSymbol $implicit_fort_type_mapping$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 9806L)
    public static SubLSymbol $all_mts_isa_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 9884L)
    public static SubLSymbol $cached_quoted_isas$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 10211L)
    public static SubLSymbol $cached_quoted_isas_set$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 11083L)
    public static SubLSymbol $quoted_isa_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 11194L)
    public static SubLSymbol $all_mts_quoted_isa_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 11286L)
    public static SubLSymbol $cached_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 13653L)
    public static SubLSymbol $sbhl_cache_misses_hash_table$;
    private static final SubLSymbol $sym0$_SBHL_CACHES_INITIALIZED__;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$_GENL_PREDICATE_CACHE_;
    private static final SubLSymbol $sym3$_GENL_INVERSE_CACHE_;
    private static final SubLSymbol $sym4$_ALL_MTS_GENL_PREDICATE_CACHE_;
    private static final SubLSymbol $sym5$_ALL_MTS_GENL_INVERSE_CACHE_;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$_GENLS_CACHE_;
    private static final SubLSymbol $sym8$_ALL_MTS_GENLS_CACHE_;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLList $list11;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$FORT_P;
    private static final SubLObject $const14$isa;
    private static final SubLSymbol $sym15$_ISA_CACHE_;
    private static final SubLSymbol $sym16$_IMPLICIT_FORT_TYPE_MAPPING_;
    private static final SubLSymbol $sym17$_ALL_MTS_ISA_CACHE_;
    private static final SubLList $list18;
    private static final SubLObject $const19$quotedIsa;
    private static final SubLSymbol $sym20$_QUOTED_ISA_CACHE_;
    private static final SubLSymbol $sym21$_ALL_MTS_QUOTED_ISA_CACHE_;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$DO_SET;
    private static final SubLSymbol $sym25$GET_CACHED_NODES_SET_FOR_PRED;
    private static final SubLObject $const26$genls;
    private static final SubLObject $const27$genlPreds;
    private static final SubLObject $const28$genlInverse;
    private static final SubLString $str29$_sbhl_cache_misses_hash_table__is;
    private static final SubLString $str30$_A___S__;
    private static final SubLSymbol $sym31$_;
    private static final SubLSymbol $sym32$SBHL_PREDICATE_P;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$SUBNODES_VAR;
    private static final SubLSymbol $sym35$DO_DICTIONARY;
    private static final SubLSymbol $sym36$GET_SBHL_CACHE_FOR_PRED;
    private static final SubLSymbol $sym37$PWHEN;
    private static final SubLSymbol $sym38$DICTIONARY_P;
    private static final SubLSymbol $sym39$CLET;
    private static final SubLSymbol $sym40$DICTIONARY_LOOKUP;
    private static final SubLSymbol $sym41$HLMT_EQUAL;
    private static final SubLString $str42$Initializing_SBHL_cache_for_;
    private static final SubLString $str43$_;
    private static final SubLString $str44$Adding_;
    private static final SubLString $str45$_to_SBHL_cache_for_;
    private static final SubLList $list46;
    private static final SubLSymbol $sym47$SUBNODES;
    private static final SubLSymbol $sym48$NODES;
    private static final SubLSymbol $sym49$CACHE;
    private static final SubLSymbol $sym50$GET_SBHL_ALL_MTS_CACHE_FOR_PRED;
    private static final SubLSymbol $sym51$PIF;
    private static final SubLSymbol $sym52$FORT_ID_INDEX_P;
    private static final SubLSymbol $sym53$DO_FORT_ID_INDEX;
    private static final SubLList $list54;
    private static final SubLSymbol $sym55$CACHE;
    private static final SubLSymbol $sym56$CACHED_NODES_STORE;
    private static final SubLSymbol $sym57$MEMBER_;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$CACHE;
    private static final SubLSymbol $sym60$SUBNODES;
    private static final SubLSymbol $sym61$SBHL_PRED_ALL_MTS_CACHE_USES_ID_INDEX_P;
    private static final SubLSymbol $sym62$SBHL_ID_INDEX_LOOKUP;
    private static final SubLSymbol $sym63$SET_MEMBER_;
    private static final SubLList $list64;
    private static final SubLObject $const65$Relation;
    private static final SubLObject $const66$Predicate;
    private static final SubLObject $const67$Function_Denotational;
    private static final SubLObject $const68$LogicalConnective;
    private static final SubLObject $const69$Quantifier;
    private static final SubLString $str70$Computing_all_mts_SBHL_caches_;
    private static final SubLString $str71$cdolist;
    private static final SubLString $str72$Computing_SBHL_caches_from_all_mt;
    private static final SubLSymbol $sym73$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const74$EverythingPSC;
    private static final SubLSymbol $kw75$TRUE;
    private static final SubLObject $const76$UniversalVocabularyMt;
    private static final SubLSymbol $kw77$DEPTH;
    private static final SubLSymbol $kw78$STACK;
    private static final SubLSymbol $kw79$QUEUE;
    private static final SubLSymbol $sym80$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw81$ERROR;
    private static final SubLString $str82$_A_is_not_a__A;
    private static final SubLSymbol $sym83$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw84$CERROR;
    private static final SubLString $str85$continue_anyway;
    private static final SubLSymbol $kw86$WARN;
    private static final SubLString $str87$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLString $str88$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str89$attempting_to_bind_direction_link;
    private static final SubLString $str90$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLSymbol $kw91$SKIP;
    private static final SubLString $str92$genlPreds___genlInverse_after_add;
    private static final SubLSymbol $sym93$RESET_CACHED_GENL_PRED_AND_INVERSE_RELATIONS;
    private static final SubLSymbol $kw94$BREADTH;
    private static final SubLSymbol $sym95$RESET_CACHED_ISA_RELATIONS;
    private static final SubLSymbol $sym96$RESET_CACHED_QUOTED_ISA_RELATIONS;
    private static final SubLSymbol $sym97$RESET_CACHED_GENLS_RELATIONS;
    private static final SubLList $list98;
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 2265L)
    public static SubLObject note_sbhl_caches_initialized() {
        sbhl_cache.$sbhl_caches_initializedP$.setGlobalValue((SubLObject)sbhl_cache.T);
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 2368L)
    public static SubLObject sbhl_caches_initialized_p() {
        return sbhl_cache.$sbhl_caches_initializedP$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 8464L)
    public static SubLObject sbhl_cache_add_new_additional_fort_typing_collection(final SubLObject collection) {
        if (sbhl_cache.NIL == conses_high.member(collection, sbhl_cache.$additional_fort_typing_collections$.getGlobalValue(), Symbols.symbol_function((SubLObject)sbhl_cache.EQL), Symbols.symbol_function((SubLObject)sbhl_cache.IDENTITY))) {
            sbhl_cache.$additional_fort_typing_collections$.setGlobalValue((SubLObject)ConsesLow.cons(collection, sbhl_cache.$additional_fort_typing_collections$.getGlobalValue()));
        }
        sbhl_cache.$cached_isas$.setGlobalValue(ConsesLow.append(sbhl_cache.$definitional_fort_typing_collections$.getGlobalValue(), sbhl_cache.$additional_fort_typing_collections$.getGlobalValue(), sbhl_cache.$application_specific_fort_typing_collections$.getGlobalValue(), sbhl_cache.$implicit_fort_typing_collections$.getGlobalValue()));
        sbhl_cache.$cached_isas_set$.setGlobalValue(set_utilities.construct_set_from_list(Sequences.reverse(sbhl_cache.$cached_isas$.getGlobalValue()), Symbols.symbol_function((SubLObject)sbhl_cache.EQL), (SubLObject)sbhl_cache.UNPROVIDED));
        SubLObject cdolist_list_var;
        final SubLObject all_instances = cdolist_list_var = list_utilities.remove_if_not((SubLObject)sbhl_cache.$sym13$FORT_P, isa.all_instances_in_all_mts(collection), (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED);
        SubLObject instance = (SubLObject)sbhl_cache.NIL;
        instance = cdolist_list_var.first();
        while (sbhl_cache.NIL != cdolist_list_var) {
            reset_cached_sbhl_relations_for_node(sbhl_cache.$const14$isa, instance, (SubLObject)sbhl_cache.T);
            cdolist_list_var = cdolist_list_var.rest();
            instance = cdolist_list_var.first();
        }
        return collection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 9316L)
    public static SubLObject all_fort_types() {
        return sbhl_cache.$cached_isas$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 9377L)
    public static SubLObject valid_fort_typeP(final SubLObject type) {
        return cached_nodeP(type, sbhl_cache.$const14$isa);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 10399L)
    public static SubLObject sbhl_cache_add_new_additional_fort_typing_collection_quoted(final SubLObject collection) {
        if (sbhl_cache.NIL == conses_high.member(collection, sbhl_cache.$cached_quoted_isas$.getGlobalValue(), Symbols.symbol_function((SubLObject)sbhl_cache.EQL), Symbols.symbol_function((SubLObject)sbhl_cache.IDENTITY))) {
            sbhl_cache.$cached_quoted_isas$.setGlobalValue((SubLObject)ConsesLow.cons(collection, sbhl_cache.$cached_quoted_isas$.getGlobalValue()));
        }
        sbhl_cache.$cached_quoted_isas_set$.setGlobalValue(set_utilities.construct_set_from_list(Sequences.reverse(sbhl_cache.$cached_quoted_isas$.getGlobalValue()), Symbols.symbol_function((SubLObject)sbhl_cache.EQL), (SubLObject)sbhl_cache.UNPROVIDED));
        SubLObject cdolist_list_var;
        final SubLObject all_quoted_instances = cdolist_list_var = list_utilities.remove_if_not((SubLObject)sbhl_cache.$sym13$FORT_P, isa.all_quoted_instances_in_all_mts(collection), (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED);
        SubLObject quoted_instance = (SubLObject)sbhl_cache.NIL;
        quoted_instance = cdolist_list_var.first();
        while (sbhl_cache.NIL != cdolist_list_var) {
            reset_cached_sbhl_relations_for_node(sbhl_cache.$const19$quotedIsa, quoted_instance, (SubLObject)sbhl_cache.T);
            cdolist_list_var = cdolist_list_var.rest();
            quoted_instance = cdolist_list_var.first();
        }
        return collection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 11380L)
    public static SubLObject do_sbhl_cached_subsumption_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_cache.$list23);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject node_var = (SubLObject)sbhl_cache.NIL;
        SubLObject pred = (SubLObject)sbhl_cache.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_cache.$list23);
        node_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_cache.$list23);
        pred = current.first();
        current = current.rest();
        if (sbhl_cache.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_cache.$sym24$DO_SET, (SubLObject)ConsesLow.list(node_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_cache.$sym25$GET_CACHED_NODES_SET_FOR_PRED, pred)), ConsesLow.append(body, (SubLObject)sbhl_cache.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_cache.$list23);
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 11699L)
    public static SubLObject cached_nodeP(final SubLObject node, final SubLObject pred) {
        return set.set_memberP(node, get_cached_nodes_set_for_pred(pred));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 11915L)
    public static SubLObject sbhl_id_index_lookup(final SubLObject v_id_index, final SubLObject node) {
        return (SubLObject)((sbhl_cache.NIL != forts.fort_p(node)) ? forts.fort_id_index_lookup(v_id_index, node) : sbhl_cache.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 12124L)
    public static SubLObject get_cached_nodes_set_for_pred(final SubLObject pred) {
        if (pred.eql(sbhl_cache.$const14$isa)) {
            return sbhl_cache.$cached_isas_set$.getGlobalValue();
        }
        if (pred.eql(sbhl_cache.$const19$quotedIsa)) {
            return sbhl_cache.$cached_quoted_isas_set$.getGlobalValue();
        }
        if (pred.eql(sbhl_cache.$const26$genls)) {
            return sbhl_cache.$cached_genls_set$.getGlobalValue();
        }
        if (pred.eql(sbhl_cache.$const27$genlPreds)) {
            return sbhl_cache.$cached_genl_predicates_set$.getGlobalValue();
        }
        if (pred.eql(sbhl_cache.$const28$genlInverse)) {
            return sbhl_cache.$cached_genl_predicates_set$.getGlobalValue();
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 12642L)
    public static SubLObject get_sbhl_cached_nodes_for_pred(final SubLObject pred) {
        if (pred.eql(sbhl_cache.$const14$isa)) {
            return sbhl_cache.$cached_isas$.getGlobalValue();
        }
        if (pred.eql(sbhl_cache.$const19$quotedIsa)) {
            return sbhl_cache.$cached_quoted_isas$.getGlobalValue();
        }
        if (pred.eql(sbhl_cache.$const26$genls)) {
            return sbhl_cache.$cached_genls$.getGlobalValue();
        }
        if (pred.eql(sbhl_cache.$const27$genlPreds)) {
            return sbhl_cache.$cached_genl_predicates$.getGlobalValue();
        }
        if (pred.eql(sbhl_cache.$const28$genlInverse)) {
            return sbhl_cache.$cached_genl_predicates$.getGlobalValue();
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 13074L)
    public static SubLObject valid_cached_predicate_p(final SubLObject pred) {
        return cached_nodeP(pred, sbhl_cache.$const27$genlPreds);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 13218L)
    public static SubLObject valid_cached_fort_type_p(final SubLObject col) {
        return cached_nodeP(col, sbhl_cache.$const14$isa);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 13348L)
    public static SubLObject valid_cached_genl_p(final SubLObject col) {
        return cached_nodeP(col, sbhl_cache.$const26$genls);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 13470L)
    public static SubLObject sbhl_pred_has_caching_p(final SubLObject pred) {
        return subl_promotions.memberP(pred, sbhl_cache.$cached_preds$.getGlobalValue(), Symbols.symbol_function((SubLObject)sbhl_cache.EQL), (SubLObject)sbhl_cache.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 13919L)
    public static SubLObject print_sbhl_cache_misses_top_n(SubLObject n) {
        if (n == sbhl_cache.UNPROVIDED) {
            n = (SubLObject)sbhl_cache.TEN_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!sbhl_cache.$sbhl_cache_misses_hash_table$.getDynamicValue(thread).isHashtable()) {
            Errors.warn((SubLObject)sbhl_cache.$str29$_sbhl_cache_misses_hash_table__is);
        }
        else {
            SubLObject cdolist_list_var = list_utilities.first_n(n, Sort.sort(Sequences.remove_duplicates(hash_table_utilities.hash_table_values(sbhl_cache.$sbhl_cache_misses_hash_table$.getDynamicValue(thread)), (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED), (SubLObject)sbhl_cache.$sym31$_, (SubLObject)sbhl_cache.UNPROVIDED));
            SubLObject v = (SubLObject)sbhl_cache.NIL;
            v = cdolist_list_var.first();
            while (sbhl_cache.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$1 = hash_table_utilities.hash_table_keys_with_value(sbhl_cache.$sbhl_cache_misses_hash_table$.getDynamicValue(thread), v, (SubLObject)sbhl_cache.UNPROVIDED);
                SubLObject k = (SubLObject)sbhl_cache.NIL;
                k = cdolist_list_var_$1.first();
                while (sbhl_cache.NIL != cdolist_list_var_$1) {
                    PrintLow.format((SubLObject)sbhl_cache.T, (SubLObject)sbhl_cache.$str30$_A___S__, v, k);
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    k = cdolist_list_var_$1.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                v = cdolist_list_var.first();
            }
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 14431L)
    public static SubLObject sbhl_cache_use_possible_p(final SubLObject pred, final SubLObject node1, final SubLObject node2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject result = (SubLObject)SubLObjectFactory.makeBoolean(sbhl_cache.NIL != sbhl_paranoia.check_sbhl_cachesP() && sbhl_cache.NIL != sbhl_pred_has_caching_p(pred) && sbhl_cache.NIL != forts.fort_p(node1) && sbhl_cache.NIL != cached_nodeP(node2, pred));
        if (sbhl_cache.$sbhl_cache_misses_hash_table$.getDynamicValue(thread).isHashtable() && sbhl_cache.NIL != forts.fort_p(node1) && sbhl_cache.NIL != sbhl_paranoia.check_sbhl_cachesP() && sbhl_cache.NIL == result) {
            hash_table_utilities.cinc_hash((SubLObject)ConsesLow.list(pred, node2), sbhl_cache.$sbhl_cache_misses_hash_table$.getDynamicValue(thread), (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 15046L)
    public static SubLObject sbhl_cache_use_possible_for_nodes_p(final SubLObject pred, final SubLObject nodes, final SubLObject node) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_cache.NIL != sbhl_paranoia.check_sbhl_cachesP() && sbhl_cache.NIL != sbhl_pred_has_caching_p(pred) && sbhl_cache.NIL != list_utilities.every_in_list((SubLObject)sbhl_cache.$sym13$FORT_P, nodes, (SubLObject)sbhl_cache.UNPROVIDED) && sbhl_cache.NIL != cached_nodeP(node, pred));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 15329L)
    public static SubLObject sbhl_cached_predicate_relation_p(final SubLObject pred, final SubLObject subnode, final SubLObject node, SubLObject mt) {
        if (mt == sbhl_cache.UNPROVIDED) {
            mt = (SubLObject)sbhl_cache.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        inference_metrics.increment_sbhl_cache_attempt_historical_count();
        possibly_initialize_sbhl_caches_for_pred_and_node(pred, node);
        SubLObject result = (SubLObject)sbhl_cache.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = sbhl_cached_relation_p(pred, subnode, node);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (sbhl_cache.NIL != result) {
            inference_metrics.increment_sbhl_cache_success_historical_count();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 16137L)
    public static SubLObject sbhl_cached_relations_for_node(final SubLObject pred, final SubLObject node, SubLObject mt) {
        if (mt == sbhl_cache.UNPROVIDED) {
            mt = (SubLObject)sbhl_cache.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sbhl_cache.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = sbhl_cached_relations(pred, node);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 16495L)
    public static SubLObject sbhl_all_subnodes_for_cached_node(final SubLObject pred, final SubLObject cached_node) {
        return dictionary.dictionary_keys(dictionary.dictionary_lookup(get_sbhl_cache_for_pred(pred), cached_node, (SubLObject)sbhl_cache.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 16844L)
    public static SubLObject sbhl_cached_relation_p(final SubLObject pred, final SubLObject subnode, final SubLObject node) {
        return (sbhl_cache.NIL != mt_relevance_macros.all_mts_are_relevantP()) ? cached_all_mts_relation_p(pred, subnode, node) : cached_relation_p(pred, subnode, node);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 17064L)
    public static SubLObject sbhl_cached_relations(final SubLObject pred, final SubLObject node) {
        return (sbhl_cache.NIL != mt_relevance_macros.all_mts_are_relevantP()) ? cached_all_mts_relations_for_node(pred, node) : cached_relations_for_node(pred, node);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 17248L)
    public static SubLObject get_sbhl_cache_for_pred(final SubLObject pred) {
        possibly_initialize_sbhl_caches_for_pred(pred);
        return get_sbhl_cache_for_pred_int(pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 17457L)
    public static SubLObject get_sbhl_cache_for_pred_int(final SubLObject pred) {
        if (pred.eql(sbhl_cache.$const14$isa)) {
            return sbhl_cache.$isa_cache$.getGlobalValue();
        }
        if (pred.eql(sbhl_cache.$const19$quotedIsa)) {
            return sbhl_cache.$quoted_isa_cache$.getGlobalValue();
        }
        if (pred.eql(sbhl_cache.$const27$genlPreds)) {
            return sbhl_cache.$genl_predicate_cache$.getGlobalValue();
        }
        if (pred.eql(sbhl_cache.$const28$genlInverse)) {
            return sbhl_cache.$genl_inverse_cache$.getGlobalValue();
        }
        if (pred.eql(sbhl_cache.$const26$genls)) {
            return sbhl_cache.$genls_cache$.getGlobalValue();
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 17902L)
    public static SubLObject get_mts_for_cached_sbhl_relation(final SubLObject pred, final SubLObject subnode, final SubLObject node) {
        assert sbhl_cache.NIL != sbhl_module_utilities.sbhl_predicate_p(pred) : pred;
        final SubLObject v_cache = get_sbhl_cache_for_pred(pred);
        if (sbhl_cache.NIL != v_cache) {
            final SubLObject subnode_store = dictionary.dictionary_lookup_without_values(v_cache, node, (SubLObject)sbhl_cache.UNPROVIDED);
            return (SubLObject)((sbhl_cache.NIL != subnode_store) ? dictionary.dictionary_lookup_without_values(subnode_store, subnode, (SubLObject)sbhl_cache.UNPROVIDED) : sbhl_cache.NIL);
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 18344L)
    public static SubLObject cached_relation_p(final SubLObject pred, final SubLObject subnode, final SubLObject node) {
        return mt_relevance_macros.any_relevant_mtP(get_mts_for_cached_sbhl_relation(pred, subnode, node));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 18678L)
    public static SubLObject do_sbhl_cached_relations_for_node(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_cache.$list33);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject cached_node_var = (SubLObject)sbhl_cache.NIL;
        SubLObject mts_var = (SubLObject)sbhl_cache.NIL;
        SubLObject subnode = (SubLObject)sbhl_cache.NIL;
        SubLObject pred = (SubLObject)sbhl_cache.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_cache.$list33);
        cached_node_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_cache.$list33);
        mts_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_cache.$list33);
        subnode = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_cache.$list33);
        pred = current.first();
        current = current.rest();
        if (sbhl_cache.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject subnodes_var = (SubLObject)sbhl_cache.$sym34$SUBNODES_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_cache.$sym35$DO_DICTIONARY, (SubLObject)ConsesLow.list(cached_node_var, subnodes_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_cache.$sym36$GET_SBHL_CACHE_FOR_PRED, pred)), (SubLObject)ConsesLow.list((SubLObject)sbhl_cache.$sym37$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sbhl_cache.$sym38$DICTIONARY_P, subnodes_var), (SubLObject)ConsesLow.list((SubLObject)sbhl_cache.$sym39$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(mts_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_cache.$sym40$DICTIONARY_LOOKUP, subnodes_var, subnode))), (SubLObject)ConsesLow.listS((SubLObject)sbhl_cache.$sym37$PWHEN, mts_var, ConsesLow.append(body, (SubLObject)sbhl_cache.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_cache.$list33);
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 19237L)
    public static SubLObject cached_relations_for_node(final SubLObject pred, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sbhl_cache.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(get_sbhl_cache_for_pred(pred))); sbhl_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject cached_node = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject subnodes_var = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sbhl_cache.NIL != dictionary.dictionary_p(subnodes_var)) {
                final SubLObject mts = dictionary.dictionary_lookup(subnodes_var, node, (SubLObject)sbhl_cache.UNPROVIDED);
                if (sbhl_cache.NIL != mts && sbhl_cache.NIL != mt_relevance_macros.any_relevant_mtP(mts)) {
                    result = (SubLObject)ConsesLow.cons(cached_node, result);
                }
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 19644L)
    public static SubLObject cached_relation_in_cache_p(final SubLObject pred, final SubLObject subnode, final SubLObject node, final SubLObject mt) {
        return subl_promotions.memberP(mt, dictionary.dictionary_lookup(dictionary.dictionary_lookup(get_sbhl_cache_for_pred(pred), node, (SubLObject)sbhl_cache.UNPROVIDED), subnode, (SubLObject)sbhl_cache.UNPROVIDED), (SubLObject)sbhl_cache.$sym41$HLMT_EQUAL, (SubLObject)sbhl_cache.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 20038L)
    public static SubLObject sbhl_pred_all_mts_cache_uses_id_index_p(final SubLObject pred) {
        return Equality.eql(pred, sbhl_cache.$const14$isa);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 20217L)
    public static SubLObject sbhl_finalize_all_mts_cache(final SubLObject pred) {
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 20439L)
    public static SubLObject get_sbhl_all_mts_cache_for_pred(final SubLObject pred) {
        possibly_initialize_sbhl_caches_for_pred(pred);
        return get_sbhl_all_mts_cache_for_pred_int(pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 20597L)
    public static SubLObject get_sbhl_all_mts_cache_for_pred_int(final SubLObject pred) {
        if (pred.eql(sbhl_cache.$const14$isa)) {
            return sbhl_cache.$all_mts_isa_cache$.getGlobalValue();
        }
        if (pred.eql(sbhl_cache.$const19$quotedIsa)) {
            return sbhl_cache.$all_mts_quoted_isa_cache$.getGlobalValue();
        }
        if (pred.eql(sbhl_cache.$const27$genlPreds)) {
            return sbhl_cache.$all_mts_genl_predicate_cache$.getGlobalValue();
        }
        if (pred.eql(sbhl_cache.$const28$genlInverse)) {
            return sbhl_cache.$all_mts_genl_inverse_cache$.getGlobalValue();
        }
        if (pred.eql(sbhl_cache.$const26$genls)) {
            return sbhl_cache.$all_mts_genls_cache$.getGlobalValue();
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 21092L)
    public static SubLObject possibly_initialize_sbhl_caches_for_pred(final SubLObject pred) {
        if (sbhl_cache.NIL == get_sbhl_all_mts_cache_for_pred_int(pred) || sbhl_cache.NIL == get_sbhl_cache_for_pred_int(pred)) {
            initialize_sbhl_caches_for_pred(pred);
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 21313L)
    public static SubLObject initialize_sbhl_caches_for_pred(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = utilities_macros.$noting_progress_delayed_mode_seconds$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$noting_progress_delayed_mode_string$.currentBinding(thread);
        try {
            utilities_macros.$noting_progress_delayed_mode_seconds$.bind((SubLObject)sbhl_cache.TWO_INTEGER, thread);
            utilities_macros.$noting_progress_delayed_mode_string$.bind(Sequences.cconcatenate((SubLObject)sbhl_cache.$str42$Initializing_SBHL_cache_for_, new SubLObject[] { format_nil.format_nil_a_no_copy(pred), sbhl_cache.$str43$_ }), thread);
            final SubLObject str = Sequences.cconcatenate((SubLObject)sbhl_cache.$str42$Initializing_SBHL_cache_for_, new SubLObject[] { format_nil.format_nil_a_no_copy(pred), sbhl_cache.$str43$_ });
            final SubLObject _prev_bind_0_$2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_1_$3 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
            try {
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                utilities_macros.$progress_notification_count$.bind((SubLObject)sbhl_cache.ZERO_INTEGER, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)sbhl_cache.ZERO_INTEGER, thread);
                utilities_macros.$progress_count$.bind((SubLObject)sbhl_cache.ZERO_INTEGER, thread);
                utilities_macros.$is_noting_progressP$.bind((SubLObject)sbhl_cache.T, thread);
                utilities_macros.$silent_progressP$.bind((SubLObject)((sbhl_cache.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : sbhl_cache.T), thread);
                utilities_macros.noting_progress_preamble(str);
                reset_sbhl_all_mts_cache_for_pred(pred);
                reset_sbhl_cache_for_pred(pred);
                initialize_all_mts_caching_for_pred(pred);
                compute_sbhl_cache_from_all_mts_cache(pred);
                utilities_macros.noting_progress_postamble();
            }
            finally {
                utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$2, thread);
            }
        }
        finally {
            utilities_macros.$noting_progress_delayed_mode_string$.rebind(_prev_bind_2, thread);
            utilities_macros.$noting_progress_delayed_mode_seconds$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 21642L)
    public static SubLObject possibly_initialize_sbhl_caches_for_pred_and_node(final SubLObject pred, final SubLObject node) {
        possibly_initialize_sbhl_caches_for_pred(pred);
        if (sbhl_cache.NIL == dictionary_utilities.dictionary_has_keyP(get_sbhl_cache_for_pred_int(pred), node) && sbhl_cache.NIL != cached_nodeP(node, pred) && sbhl_cache.NIL != kb_mapping_utilities.fpred_value_in_any_mt(node, pred, (SubLObject)sbhl_cache.TWO_INTEGER, (SubLObject)sbhl_cache.ONE_INTEGER, (SubLObject)sbhl_cache.UNPROVIDED)) {
            initialize_sbhl_caches_for_pred_and_node(pred, node);
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 22006L)
    public static SubLObject initialize_sbhl_caches_for_pred_and_node(final SubLObject pred, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pred.eql(sbhl_cache.$const14$isa)) {
            final SubLObject _prev_bind_0 = utilities_macros.$noting_progress_delayed_mode_seconds$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$noting_progress_delayed_mode_string$.currentBinding(thread);
            try {
                utilities_macros.$noting_progress_delayed_mode_seconds$.bind((SubLObject)sbhl_cache.TWO_INTEGER, thread);
                utilities_macros.$noting_progress_delayed_mode_string$.bind(Sequences.cconcatenate((SubLObject)sbhl_cache.$str44$Adding_, new SubLObject[] { format_nil.format_nil_a_no_copy(node), sbhl_cache.$str45$_to_SBHL_cache_for_, format_nil.format_nil_a_no_copy(pred), sbhl_cache.$str43$_ }), thread);
                final SubLObject str = Sequences.cconcatenate((SubLObject)sbhl_cache.$str44$Adding_, new SubLObject[] { format_nil.format_nil_a_no_copy(node), sbhl_cache.$str45$_to_SBHL_cache_for_, format_nil.format_nil_a_no_copy(pred), sbhl_cache.$str43$_ });
                final SubLObject _prev_bind_0_$4 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$5 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)sbhl_cache.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)sbhl_cache.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)sbhl_cache.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)sbhl_cache.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((sbhl_cache.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : sbhl_cache.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    sbhl_cache_add_new_additional_fort_typing_collection(node);
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$5, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$4, thread);
                }
            }
            finally {
                utilities_macros.$noting_progress_delayed_mode_string$.rebind(_prev_bind_2, thread);
                utilities_macros.$noting_progress_delayed_mode_seconds$.rebind(_prev_bind_0, thread);
            }
        }
        else if (pred.eql(sbhl_cache.$const19$quotedIsa)) {
            final SubLObject _prev_bind_0 = utilities_macros.$noting_progress_delayed_mode_seconds$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$noting_progress_delayed_mode_string$.currentBinding(thread);
            try {
                utilities_macros.$noting_progress_delayed_mode_seconds$.bind((SubLObject)sbhl_cache.TWO_INTEGER, thread);
                utilities_macros.$noting_progress_delayed_mode_string$.bind(Sequences.cconcatenate((SubLObject)sbhl_cache.$str44$Adding_, new SubLObject[] { format_nil.format_nil_a_no_copy(node), sbhl_cache.$str45$_to_SBHL_cache_for_, format_nil.format_nil_a_no_copy(pred), sbhl_cache.$str43$_ }), thread);
                final SubLObject str = Sequences.cconcatenate((SubLObject)sbhl_cache.$str44$Adding_, new SubLObject[] { format_nil.format_nil_a_no_copy(node), sbhl_cache.$str45$_to_SBHL_cache_for_, format_nil.format_nil_a_no_copy(pred), sbhl_cache.$str43$_ });
                final SubLObject _prev_bind_0_$5 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$6 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)sbhl_cache.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)sbhl_cache.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)sbhl_cache.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)sbhl_cache.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((sbhl_cache.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : sbhl_cache.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    sbhl_cache_add_new_additional_fort_typing_collection_quoted(node);
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$6, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$5, thread);
                }
            }
            finally {
                utilities_macros.$noting_progress_delayed_mode_string$.rebind(_prev_bind_2, thread);
                utilities_macros.$noting_progress_delayed_mode_seconds$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            initialize_sbhl_caches_for_pred(pred);
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 22560L)
    public static SubLObject cached_all_mts_relation_p(final SubLObject pred, final SubLObject subnode, final SubLObject node) {
        final SubLObject pred_uses_id_indexP = sbhl_pred_all_mts_cache_uses_id_index_p(pred);
        final SubLObject all_mts_cache = get_sbhl_all_mts_cache_for_pred(pred);
        final SubLObject cached_list = (sbhl_cache.NIL != pred_uses_id_indexP) ? sbhl_id_index_lookup(all_mts_cache, subnode) : dictionary.dictionary_lookup_without_values(all_mts_cache, node, (SubLObject)sbhl_cache.UNPROVIDED);
        return (SubLObject)((sbhl_cache.NIL != set.set_p(cached_list)) ? ((sbhl_cache.NIL != pred_uses_id_indexP) ? set.set_memberP(node, cached_list) : set.set_memberP(subnode, cached_list)) : sbhl_cache.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 23262L)
    public static SubLObject cached_all_mts_relations_for_node(final SubLObject pred, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_cache.NIL != sbhl_pred_all_mts_cache_uses_id_index_p(pred)) {
            final SubLObject relation_set = sbhl_id_index_lookup(get_sbhl_all_mts_cache_for_pred(pred), node);
            return (SubLObject)((sbhl_cache.NIL != set.set_p(relation_set)) ? set.set_element_list(relation_set) : sbhl_cache.NIL);
        }
        SubLObject cached_relations = (SubLObject)sbhl_cache.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(get_sbhl_all_mts_cache_for_pred(pred))); sbhl_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject cached_node = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject subnodes = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sbhl_cache.NIL != set.set_memberP(node, subnodes)) {
                cached_relations = (SubLObject)ConsesLow.cons(cached_node, cached_relations);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return cached_relations;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 23974L)
    public static SubLObject do_sbhl_cached_all_mts_relations(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_cache.$list46);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = (SubLObject)sbhl_cache.NIL;
        SubLObject subnode_var = (SubLObject)sbhl_cache.NIL;
        SubLObject pred = (SubLObject)sbhl_cache.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_cache.$list46);
        link_node_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_cache.$list46);
        subnode_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_cache.$list46);
        pred = current.first();
        current = current.rest();
        if (sbhl_cache.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject subnodes = (SubLObject)sbhl_cache.$sym47$SUBNODES;
            final SubLObject nodes = (SubLObject)sbhl_cache.$sym48$NODES;
            final SubLObject v_cache = (SubLObject)sbhl_cache.$sym49$CACHE;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_cache.$sym39$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(v_cache, (SubLObject)ConsesLow.list((SubLObject)sbhl_cache.$sym50$GET_SBHL_ALL_MTS_CACHE_FOR_PRED, pred))), (SubLObject)ConsesLow.list((SubLObject)sbhl_cache.$sym51$PIF, (SubLObject)ConsesLow.list((SubLObject)sbhl_cache.$sym52$FORT_ID_INDEX_P, v_cache), (SubLObject)ConsesLow.list((SubLObject)sbhl_cache.$sym53$DO_FORT_ID_INDEX, (SubLObject)ConsesLow.list(subnode_var, nodes, v_cache), (SubLObject)ConsesLow.listS((SubLObject)sbhl_cache.$sym24$DO_SET, (SubLObject)ConsesLow.list(link_node_var, nodes), ConsesLow.append(body, (SubLObject)sbhl_cache.NIL))), (SubLObject)ConsesLow.list((SubLObject)sbhl_cache.$sym35$DO_DICTIONARY, (SubLObject)ConsesLow.list(link_node_var, subnodes, v_cache), (SubLObject)ConsesLow.listS((SubLObject)sbhl_cache.$sym24$DO_SET, (SubLObject)ConsesLow.list(subnode_var, subnodes), ConsesLow.append(body, (SubLObject)sbhl_cache.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_cache.$list46);
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 24594L)
    public static SubLObject do_sbhl_cached_link_nodes_for_node_in_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_cache.$list54);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject cached_link_node = (SubLObject)sbhl_cache.NIL;
        SubLObject pred = (SubLObject)sbhl_cache.NIL;
        SubLObject subnode = (SubLObject)sbhl_cache.NIL;
        SubLObject mt = (SubLObject)sbhl_cache.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_cache.$list54);
        cached_link_node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_cache.$list54);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_cache.$list54);
        subnode = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_cache.$list54);
        mt = current.first();
        current = current.rest();
        if (sbhl_cache.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject v_cache = (SubLObject)sbhl_cache.$sym55$CACHE;
            final SubLObject cached_nodes_store = (SubLObject)sbhl_cache.$sym56$CACHED_NODES_STORE;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_cache.$sym39$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(v_cache, (SubLObject)ConsesLow.list((SubLObject)sbhl_cache.$sym36$GET_SBHL_CACHE_FOR_PRED, pred))), (SubLObject)ConsesLow.list((SubLObject)sbhl_cache.$sym35$DO_DICTIONARY, (SubLObject)ConsesLow.list(cached_link_node, cached_nodes_store, v_cache), (SubLObject)ConsesLow.listS((SubLObject)sbhl_cache.$sym37$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sbhl_cache.$sym57$MEMBER_, mt, (SubLObject)ConsesLow.list((SubLObject)sbhl_cache.$sym40$DICTIONARY_LOOKUP, cached_nodes_store, subnode)), ConsesLow.append(body, (SubLObject)sbhl_cache.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_cache.$list54);
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 25070L)
    public static SubLObject do_sbhl_cached_all_mts_relations_for_node(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_cache.$list58);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject cached_link_node = (SubLObject)sbhl_cache.NIL;
        SubLObject pred = (SubLObject)sbhl_cache.NIL;
        SubLObject subnode = (SubLObject)sbhl_cache.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_cache.$list58);
        cached_link_node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_cache.$list58);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_cache.$list58);
        subnode = current.first();
        current = current.rest();
        if (sbhl_cache.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject v_cache = (SubLObject)sbhl_cache.$sym59$CACHE;
            final SubLObject subnodes = (SubLObject)sbhl_cache.$sym60$SUBNODES;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_cache.$sym39$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(v_cache, (SubLObject)ConsesLow.list((SubLObject)sbhl_cache.$sym50$GET_SBHL_ALL_MTS_CACHE_FOR_PRED, pred))), (SubLObject)ConsesLow.list((SubLObject)sbhl_cache.$sym51$PIF, (SubLObject)ConsesLow.list((SubLObject)sbhl_cache.$sym61$SBHL_PRED_ALL_MTS_CACHE_USES_ID_INDEX_P, pred), (SubLObject)ConsesLow.listS((SubLObject)sbhl_cache.$sym24$DO_SET, (SubLObject)ConsesLow.list(cached_link_node, (SubLObject)ConsesLow.list((SubLObject)sbhl_cache.$sym62$SBHL_ID_INDEX_LOOKUP, v_cache, subnode)), ConsesLow.append(body, (SubLObject)sbhl_cache.NIL)), (SubLObject)ConsesLow.list((SubLObject)sbhl_cache.$sym35$DO_DICTIONARY, (SubLObject)ConsesLow.list(cached_link_node, subnodes, v_cache), (SubLObject)ConsesLow.listS((SubLObject)sbhl_cache.$sym37$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sbhl_cache.$sym63$SET_MEMBER_, subnode, subnodes), ConsesLow.append(body, (SubLObject)sbhl_cache.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_cache.$list58);
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 25651L)
    public static SubLObject initialize_sbhl_caches() {
        reset_sbhl_cache_for_pred(sbhl_cache.$const27$genlPreds);
        reset_sbhl_cache_for_pred(sbhl_cache.$const28$genlInverse);
        reset_sbhl_cache_for_pred(sbhl_cache.$const26$genls);
        reset_sbhl_cache_for_pred(sbhl_cache.$const14$isa);
        reset_sbhl_cache_for_pred(sbhl_cache.$const19$quotedIsa);
        SubLObject cdolist_list_var = (SubLObject)sbhl_cache.$list64;
        SubLObject pred = (SubLObject)sbhl_cache.NIL;
        pred = cdolist_list_var.first();
        while (sbhl_cache.NIL != cdolist_list_var) {
            if (sbhl_cache.NIL != pred) {
                final SubLObject set_var = get_cached_nodes_set_for_pred(pred);
                final SubLObject set_contents_var = set.do_set_internal(set_var);
                SubLObject basis_object;
                SubLObject state;
                SubLObject node;
                SubLObject table;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    node = set_contents.do_set_contents_next(basis_object, state);
                    if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state, node)) {
                        table = new_sbhl_sub_cache();
                        dictionary.dictionary_enter(get_sbhl_cache_for_pred_int(pred), node, table);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 26270L)
    public static SubLObject reset_sbhl_cache_for_pred(final SubLObject pred) {
        if (pred.eql(sbhl_cache.$const14$isa)) {
            sbhl_cache.$isa_cache$.setGlobalValue(new_sbhl_cache());
        }
        else if (pred.eql(sbhl_cache.$const19$quotedIsa)) {
            sbhl_cache.$quoted_isa_cache$.setGlobalValue(new_sbhl_cache());
        }
        else if (pred.eql(sbhl_cache.$const27$genlPreds)) {
            sbhl_cache.$genl_predicate_cache$.setGlobalValue(new_sbhl_cache());
        }
        else if (pred.eql(sbhl_cache.$const28$genlInverse)) {
            sbhl_cache.$genl_inverse_cache$.setGlobalValue(new_sbhl_cache());
        }
        else if (pred.eql(sbhl_cache.$const26$genls)) {
            sbhl_cache.$genls_cache$.setGlobalValue(new_sbhl_cache());
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 26806L)
    public static SubLObject initialize_all_mts_sbhl_caches() {
        reset_sbhl_all_mts_cache_for_pred(sbhl_cache.$const27$genlPreds);
        reset_sbhl_all_mts_cache_for_pred(sbhl_cache.$const28$genlInverse);
        reset_sbhl_all_mts_cache_for_pred(sbhl_cache.$const26$genls);
        reset_sbhl_all_mts_cache_for_pred(sbhl_cache.$const14$isa);
        reset_sbhl_all_mts_cache_for_pred(sbhl_cache.$const19$quotedIsa);
        initialize_implicit_fort_type_mapping();
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 27154L)
    public static SubLObject reset_sbhl_all_mts_cache_for_pred(final SubLObject pred) {
        if (pred.eql(sbhl_cache.$const14$isa)) {
            sbhl_cache.$all_mts_isa_cache$.setGlobalValue(forts.new_fort_id_index());
        }
        else if (pred.eql(sbhl_cache.$const19$quotedIsa)) {
            sbhl_cache.$all_mts_quoted_isa_cache$.setGlobalValue(new_sbhl_cache());
        }
        else if (pred.eql(sbhl_cache.$const27$genlPreds)) {
            sbhl_cache.$all_mts_genl_predicate_cache$.setGlobalValue(new_sbhl_cache());
        }
        else if (pred.eql(sbhl_cache.$const28$genlInverse)) {
            sbhl_cache.$all_mts_genl_inverse_cache$.setGlobalValue(new_sbhl_cache());
        }
        else if (pred.eql(sbhl_cache.$const26$genls)) {
            sbhl_cache.$all_mts_genls_cache$.setGlobalValue(new_sbhl_cache());
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 27843L)
    public static SubLObject new_sbhl_cache() {
        return dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sbhl_cache.EQL), (SubLObject)sbhl_cache.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 27910L)
    public static SubLObject new_sbhl_sub_cache() {
        return dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sbhl_cache.EQL), (SubLObject)sbhl_cache.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 27981L)
    public static SubLObject initialize_implicit_fort_type_mapping() {
        sbhl_cache.$implicit_fort_type_mapping$.setGlobalValue(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sbhl_cache.EQL), (SubLObject)sbhl_cache.UNPROVIDED));
        dictionary.dictionary_enter(sbhl_cache.$implicit_fort_type_mapping$.getGlobalValue(), sbhl_cache.$const65$Relation, (SubLObject)ConsesLow.list(sbhl_cache.$const66$Predicate, sbhl_cache.$const67$Function_Denotational, sbhl_cache.$const68$LogicalConnective, sbhl_cache.$const69$Quantifier));
        return sbhl_cache.$implicit_fort_type_mapping$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 28276L)
    public static SubLObject initialize_all_sbhl_caching() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        try {
            system_parameters.$suspend_sbhl_type_checkingP$.bind((SubLObject)sbhl_cache.T, thread);
            initialize_all_mts_sbhl_caches();
            initialize_sbhl_caches();
            SubLObject list_var = (SubLObject)sbhl_cache.$list64;
            final SubLObject _prev_bind_0_$8 = utilities_macros.$progress_note$.currentBinding(thread);
            SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)sbhl_cache.$str70$Computing_all_mts_SBHL_caches_, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)sbhl_cache.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)sbhl_cache.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)sbhl_cache.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)sbhl_cache.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject pred = (SubLObject)sbhl_cache.NIL;
                    pred = csome_list_var.first();
                    while (sbhl_cache.NIL != csome_list_var) {
                        initialize_all_mts_caching_for_pred(pred);
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)sbhl_cache.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        pred = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sbhl_cache.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$8, thread);
            }
            list_var = (SubLObject)sbhl_cache.$list64;
            final SubLObject _prev_bind_0_$10 = utilities_macros.$progress_note$.currentBinding(thread);
            _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)sbhl_cache.$str72$Computing_SBHL_caches_from_all_mt, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)sbhl_cache.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)sbhl_cache.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)sbhl_cache.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)sbhl_cache.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject pred = (SubLObject)sbhl_cache.NIL;
                    pred = csome_list_var.first();
                    while (sbhl_cache.NIL != csome_list_var) {
                        compute_sbhl_cache_from_all_mts_cache(pred);
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)sbhl_cache.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        pred = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sbhl_cache.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$10, thread);
            }
        }
        finally {
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_0, thread);
        }
        sbhl_cache.$sbhl_caches_initializedP$.setGlobalValue((SubLObject)sbhl_cache.T);
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 28931L)
    public static SubLObject initialize_all_mts_caching_for_pred(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            sbhl_paranoia.$suspend_sbhl_cache_useP$.bind((SubLObject)sbhl_cache.T, thread);
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sbhl_cache.$sym73$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(sbhl_cache.$const74$EverythingPSC, thread);
            if (pred.eql(sbhl_cache.$const27$genlPreds) || pred.eql(sbhl_cache.$const28$genlInverse)) {
                initialize_all_mts_cache_for_genl_preds_and_inverse();
            }
            else if (pred.eql(sbhl_cache.$const26$genls)) {
                initialize_all_mts_cache_for_genls();
            }
            else if (pred.eql(sbhl_cache.$const14$isa)) {
                initialize_all_mts_cache_for_isa();
            }
            else if (pred.eql(sbhl_cache.$const19$quotedIsa)) {
                initialize_all_mts_cache_for_quoted_isa();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_0, thread);
        }
        if (sbhl_cache.NIL != sbhl_pred_all_mts_cache_uses_id_index_p(pred)) {
            sbhl_finalize_all_mts_cache(pred);
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 29478L)
    public static SubLObject compute_sbhl_cache_from_all_mts_cache(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            sbhl_paranoia.$suspend_sbhl_cache_useP$.bind((SubLObject)sbhl_cache.T, thread);
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sbhl_cache.$sym73$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(sbhl_cache.$const74$EverythingPSC, thread);
            if (pred.eql(sbhl_cache.$const27$genlPreds)) {
                compute_cached_predicates_from_all_mts_cache();
            }
            else if (pred.eql(sbhl_cache.$const28$genlInverse)) {
                compute_cached_inverses_from_all_mts_cache();
            }
            else if (pred.eql(sbhl_cache.$const26$genls)) {
                compute_cached_genls_from_all_mts_cache();
            }
            else if (pred.eql(sbhl_cache.$const14$isa)) {
                compute_cached_isas_from_all_mts_cache();
            }
            else if (pred.eql(sbhl_cache.$const19$quotedIsa)) {
                compute_cached_quoted_isas_from_all_mts_cache();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 29954L)
    public static SubLObject extend_sbhl_caches(final SubLObject pred, final SubLObject node, final SubLObject subnode, final SubLObject mt) {
        add_to_sbhl_cache(pred, node, subnode, mt);
        add_to_sbhl_all_mts_cache(pred, node, subnode);
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 30286L)
    public static SubLObject add_to_sbhl_cache(final SubLObject pred, final SubLObject node, final SubLObject subnode, final SubLObject mt) {
        final SubLObject v_cache = get_sbhl_cache_for_pred(pred);
        SubLObject subnodes = dictionary.dictionary_lookup(v_cache, node, (SubLObject)sbhl_cache.UNPROVIDED);
        if (sbhl_cache.NIL == subnodes) {
            subnodes = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sbhl_cache.EQL), (SubLObject)sbhl_cache.UNPROVIDED);
        }
        dictionary_utilities.dictionary_pushnew(subnodes, subnode, mt, Symbols.symbol_function((SubLObject)sbhl_cache.EQL), (SubLObject)sbhl_cache.UNPROVIDED);
        dictionary.dictionary_enter(v_cache, node, subnodes);
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 30721L)
    public static SubLObject add_to_sbhl_cache_for_relevant_mts(final SubLObject pred, final SubLObject node, final SubLObject subnode) {
        SubLObject cdolist_list_var;
        final SubLObject mts = cdolist_list_var = sbhl_search_what_mts.sbhl_max_floor_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module(pred), subnode, node, (SubLObject)sbhl_cache.UNPROVIDED);
        SubLObject mt = (SubLObject)sbhl_cache.NIL;
        mt = cdolist_list_var.first();
        while (sbhl_cache.NIL != cdolist_list_var) {
            add_to_sbhl_cache(pred, node, subnode, mt);
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        }
        return mts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 31126L)
    public static SubLObject add_to_sbhl_all_mts_cache(final SubLObject pred, final SubLObject node, final SubLObject subnode) {
        final SubLObject v_cache = get_sbhl_all_mts_cache_for_pred(pred);
        if (sbhl_cache.NIL != sbhl_pred_all_mts_cache_uses_id_index_p(pred)) {
            SubLObject nodes = sbhl_id_index_lookup(v_cache, subnode);
            if (sbhl_cache.NIL == nodes) {
                nodes = set.new_set(Symbols.symbol_function((SubLObject)sbhl_cache.EQL), (SubLObject)sbhl_cache.UNPROVIDED);
            }
            set.set_add(node, nodes);
            forts.fort_id_index_enter(v_cache, subnode, nodes);
        }
        else {
            SubLObject subnodes = dictionary.dictionary_lookup(v_cache, node, (SubLObject)sbhl_cache.UNPROVIDED);
            if (sbhl_cache.NIL == subnodes) {
                subnodes = set.new_set(Symbols.symbol_function((SubLObject)sbhl_cache.EQL), (SubLObject)sbhl_cache.UNPROVIDED);
            }
            set.set_add(subnode, subnodes);
            dictionary.dictionary_enter(v_cache, node, subnodes);
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 31798L)
    public static SubLObject sbhl_cache_addition_maintainence(final SubLObject assertion) {
        if (sbhl_cache.NIL != recache_sbhl_cachesP() && sbhl_cache.NIL != assertions_high.assertion_has_truth(assertion, (SubLObject)sbhl_cache.$kw75$TRUE)) {
            final SubLObject pcase_var;
            final SubLObject pred = pcase_var = assertions_high.gaf_predicate(assertion);
            if (pcase_var.eql(sbhl_cache.$const14$isa)) {
                isa_cache_addition_maintainence(assertion);
            }
            else if (pcase_var.eql(sbhl_cache.$const19$quotedIsa)) {
                quoted_isa_cache_addition_maintainence(assertion);
            }
            else if (pcase_var.eql(sbhl_cache.$const26$genls)) {
                genls_cache_addition_maintainence(assertion);
            }
            else if (pcase_var.eql(sbhl_cache.$const27$genlPreds)) {
                sbhl_genl_preds_cache_addition_maintainence(assertion);
            }
            else if (pcase_var.eql(sbhl_cache.$const28$genlInverse)) {
                sbhl_genl_preds_cache_addition_maintainence(assertion);
            }
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 32520L)
    public static SubLObject possibly_add_to_sbhl_caches(final SubLObject assertion, final SubLObject term2_check_pred, final SubLObject cache_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject addedP = (SubLObject)sbhl_cache.NIL;
        final SubLObject _prev_bind_0 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
        try {
            sbhl_paranoia.$suspend_sbhl_cache_useP$.bind((SubLObject)sbhl_cache.T, thread);
            final SubLObject term1 = assertions_high.gaf_arg1(assertion);
            final SubLObject term2 = assertions_high.gaf_arg2(assertion);
            final SubLObject new_cached_relations = sbhl_predicate_relation_to_which_cached_nodes(term2_check_pred, term2, cache_pred);
            final SubLObject old_cached_relations = cached_all_mts_relations_for_node(cache_pred, term1);
            SubLObject cdolist_list_var;
            final SubLObject cached_relations_gained = cdolist_list_var = conses_high.set_difference(new_cached_relations, old_cached_relations, Symbols.symbol_function((SubLObject)sbhl_cache.EQL), (SubLObject)sbhl_cache.UNPROVIDED);
            SubLObject new_cached_relation = (SubLObject)sbhl_cache.NIL;
            new_cached_relation = cdolist_list_var.first();
            while (sbhl_cache.NIL != cdolist_list_var) {
                addedP = (SubLObject)sbhl_cache.T;
                add_to_sbhl_all_mts_cache(cache_pred, new_cached_relation, term1);
                cdolist_list_var = cdolist_list_var.rest();
                new_cached_relation = cdolist_list_var.first();
            }
            cdolist_list_var = new_cached_relations;
            SubLObject new_type = (SubLObject)sbhl_cache.NIL;
            new_type = cdolist_list_var.first();
            while (sbhl_cache.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$12 = sbhl_search_what_mts.sbhl_max_floor_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module(cache_pred), term1, term2, (SubLObject)sbhl_cache.UNPROVIDED);
                SubLObject mt = (SubLObject)sbhl_cache.NIL;
                mt = cdolist_list_var_$12.first();
                while (sbhl_cache.NIL != cdolist_list_var_$12) {
                    if (sbhl_cache.NIL == cached_relation_in_cache_p(cache_pred, term1, new_type, mt)) {
                        addedP = (SubLObject)sbhl_cache.T;
                        add_to_sbhl_cache(cache_pred, new_type, term1, mt);
                    }
                    cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                    mt = cdolist_list_var_$12.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                new_type = cdolist_list_var.first();
            }
        }
        finally {
            sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_0, thread);
        }
        return addedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 33875L)
    public static SubLObject retract_cached_relation(final SubLObject pred, final SubLObject node, final SubLObject subnode, final SubLObject mt) {
        SubLObject retracted_last_oneP = (SubLObject)sbhl_cache.NIL;
        retracted_last_oneP = retract_from_sbhl_cache(pred, node, subnode, mt);
        if (sbhl_cache.NIL != retracted_last_oneP) {
            retract_from_sbhl_all_mts_cache(pred, node, subnode);
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 34349L)
    public static SubLObject retract_from_sbhl_cache(final SubLObject pred, final SubLObject node, final SubLObject subnode, final SubLObject mt) {
        final SubLObject nodes_cache = dictionary.dictionary_lookup(get_sbhl_cache_for_pred(pred), node, (SubLObject)sbhl_cache.UNPROVIDED);
        final SubLObject cached_mts = dictionary.dictionary_lookup(nodes_cache, subnode, (SubLObject)sbhl_cache.UNPROVIDED);
        if (sbhl_cache.NIL != list_utilities.singletonP(cached_mts) && mt.eql(cached_mts.first())) {
            dictionary.dictionary_remove(nodes_cache, subnode);
            return (SubLObject)sbhl_cache.T;
        }
        dictionary_utilities.dictionary_remove_from_value(nodes_cache, subnode, mt, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED);
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 34958L)
    public static SubLObject retract_from_sbhl_all_mts_cache(final SubLObject pred, final SubLObject node, final SubLObject subnode) {
        final SubLObject v_cache = get_sbhl_all_mts_cache_for_pred(pred);
        if (sbhl_cache.NIL != sbhl_pred_all_mts_cache_uses_id_index_p(pred)) {
            final SubLObject nodes = sbhl_id_index_lookup(v_cache, subnode);
            set.set_remove(node, nodes);
            if (sbhl_cache.NIL != set.set_emptyP(nodes)) {
                forts.fort_id_index_remove(v_cache, subnode);
            }
            else {
                forts.fort_id_index_enter(v_cache, subnode, nodes);
            }
        }
        else {
            final SubLObject subnodes = dictionary.dictionary_lookup(v_cache, node, (SubLObject)sbhl_cache.UNPROVIDED);
            set.set_remove(subnode, subnodes);
            if (sbhl_cache.NIL != set.set_emptyP(subnodes)) {
                dictionary.dictionary_remove(v_cache, node);
            }
            else {
                dictionary.dictionary_enter(v_cache, node, subnodes);
            }
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 35583L)
    public static SubLObject sbhl_cache_removal_maintainence(final SubLObject assertion) {
        if (sbhl_cache.NIL != recache_sbhl_cachesP() && sbhl_cache.NIL != assertions_high.assertion_has_truth(assertion, (SubLObject)sbhl_cache.$kw75$TRUE)) {
            final SubLObject pcase_var;
            final SubLObject pred = pcase_var = assertions_high.gaf_predicate(assertion);
            if (pcase_var.eql(sbhl_cache.$const14$isa)) {
                isa_cache_removal_maintainence(assertion);
            }
            else if (pcase_var.eql(sbhl_cache.$const19$quotedIsa)) {
                quoted_isa_cache_removal_maintainence(assertion);
            }
            else if (pcase_var.eql(sbhl_cache.$const26$genls)) {
                genls_cache_removal_maintainence(assertion);
            }
            else if (pcase_var.eql(sbhl_cache.$const27$genlPreds)) {
                sbhl_genl_preds_cache_removal_maintainence(assertion);
            }
            else if (pcase_var.eql(sbhl_cache.$const28$genlInverse)) {
                sbhl_genl_preds_cache_removal_maintainence(assertion);
            }
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 36299L)
    public static SubLObject possibly_remove_from_sbhl_caches(final SubLObject pred, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject retractedP = (SubLObject)sbhl_cache.NIL;
        final SubLObject _prev_bind_0 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
        try {
            sbhl_paranoia.$suspend_sbhl_cache_useP$.bind((SubLObject)sbhl_cache.T, thread);
            final SubLObject term1 = assertions_high.gaf_arg1(assertion);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject current_cached_relations = cached_all_mts_relations_for_node(pred, term1);
            final SubLObject new_cached_relations = sbhl_predicate_relation_to_which_cached_nodes(pred, term1, pred);
            SubLObject cdolist_list_var;
            final SubLObject cached_relations_lost = cdolist_list_var = conses_high.set_difference(current_cached_relations, new_cached_relations, Symbols.symbol_function((SubLObject)sbhl_cache.EQL), (SubLObject)sbhl_cache.UNPROVIDED);
            SubLObject lost_cached_relation = (SubLObject)sbhl_cache.NIL;
            lost_cached_relation = cdolist_list_var.first();
            while (sbhl_cache.NIL != cdolist_list_var) {
                retractedP = (SubLObject)sbhl_cache.T;
                retract_from_sbhl_all_mts_cache(pred, lost_cached_relation, term1);
                cdolist_list_var = cdolist_list_var.rest();
                lost_cached_relation = cdolist_list_var.first();
            }
            final SubLObject mt_matching_isas = sbhl_link_methods.sbhl_mt_matching_link_nodes(sbhl_module_vars.get_sbhl_module(pred), term1, mt);
            final SubLObject v_cache = get_sbhl_cache_for_pred(pred);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_cache)); sbhl_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject cached_relation = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject cached_nodes_store = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (sbhl_cache.NIL != subl_promotions.memberP(mt, dictionary.dictionary_lookup(cached_nodes_store, term1, (SubLObject)sbhl_cache.UNPROVIDED), (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED)) {
                    final SubLObject literal = el_utilities.make_binary_formula(pred, term1, cached_relation);
                    final SubLObject possibly_decontextualized_mt = (sbhl_cache.NIL != kb_accessors.decontextualized_literalP(literal)) ? kb_accessors.decontextualized_literal_convention_mt(literal) : mt;
                    if (sbhl_cache.NIL == mt_matching_isas || sbhl_cache.NIL == sbhl_search_methods.sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module(pred), term1, cached_relation, possibly_decontextualized_mt, (SubLObject)sbhl_cache.UNPROVIDED)) {
                        retractedP = (SubLObject)sbhl_cache.T;
                        retract_from_sbhl_cache(pred, cached_relation, term1, possibly_decontextualized_mt);
                    }
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        finally {
            sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_0, thread);
        }
        return retractedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 38001L)
    public static SubLObject recache_sbhl_cachesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_cache.NIL != sbhl_paranoia.check_sbhl_cachesP() && sbhl_cache.NIL == sbhl_paranoia.$suppress_sbhl_recachingP$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 38186L)
    public static SubLObject already_in_sbhl_caches_p(final SubLObject pred, final SubLObject subnode, final SubLObject node, final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_cache.NIL != cached_all_mts_relation_p(pred, subnode, node) && sbhl_cache.NIL != cached_relation_in_cache_p(pred, subnode, node, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 38408L)
    public static SubLObject sbhl_predicate_relation_to_which_cached_nodes(final SubLObject pred, final SubLObject node, final SubLObject cache_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cached_nodes = get_sbhl_cached_nodes_for_pred(cache_pred);
        SubLObject result = (SubLObject)sbhl_cache.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sbhl_cache.$sym73$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(sbhl_cache.$const74$EverythingPSC, thread);
            result = sbhl_search_methods.sbhl_predicate_relation_to_which(sbhl_module_vars.get_sbhl_module(pred), node, cached_nodes, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 38740L)
    public static SubLObject sbhl_predicate_relation_to_which_cached_nodes_excluding_link_node(final SubLObject pred, final SubLObject node, final SubLObject cache_pred, final SubLObject excl_link_node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cached_nodes = get_sbhl_cached_nodes_for_pred(cache_pred);
        SubLObject result = (SubLObject)sbhl_cache.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sbhl_cache.$sym73$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(sbhl_cache.$const74$EverythingPSC, thread);
            result = sbhl_search_methods.sbhl_predicate_relation_to_which_excluding_link_node(sbhl_module_vars.get_sbhl_module(pred), node, cached_nodes, excl_link_node, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 39148L)
    public static SubLObject clear_sbhl_cached_all_mts_relations_for_node(final SubLObject node, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_cache.NIL != sbhl_pred_all_mts_cache_uses_id_index_p(pred)) {
            forts.fort_id_index_remove(get_sbhl_all_mts_cache_for_pred(pred), node);
        }
        else {
            final SubLObject v_cache = get_sbhl_all_mts_cache_for_pred(pred);
            final SubLObject v_cache_$13 = get_sbhl_all_mts_cache_for_pred(pred);
            if (sbhl_cache.NIL != sbhl_pred_all_mts_cache_uses_id_index_p(pred)) {
                final SubLObject set_var = sbhl_id_index_lookup(v_cache_$13, node);
                final SubLObject set_contents_var = set.do_set_internal(set_var);
                SubLObject basis_object;
                SubLObject state;
                SubLObject link_node;
                SubLObject v_set;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    link_node = set_contents.do_set_contents_next(basis_object, state);
                    if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                        v_set = dictionary.dictionary_lookup(v_cache, link_node, (SubLObject)sbhl_cache.UNPROVIDED);
                        if (sbhl_cache.NIL != v_set) {
                            set.set_remove(node, v_set);
                        }
                    }
                }
            }
            else {
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_cache_$13)); sbhl_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject link_node2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject subnodes = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (sbhl_cache.NIL != set.set_memberP(node, subnodes)) {
                        final SubLObject v_set2 = dictionary.dictionary_lookup(v_cache, link_node2, (SubLObject)sbhl_cache.UNPROVIDED);
                        if (sbhl_cache.NIL != v_set2) {
                            set.set_remove(node, v_set2);
                        }
                    }
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 39705L)
    public static SubLObject clear_sbhl_cached_relations_for_node(final SubLObject node, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(get_sbhl_cache_for_pred(pred))); sbhl_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject cached_node = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject subnodes = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sbhl_cache.NIL != dictionary.dictionary_p(subnodes)) {
                dictionary.dictionary_remove(subnodes, node);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 39996L)
    public static SubLObject reset_cached_sbhl_relations_for_node(final SubLObject pred, final SubLObject node, SubLObject clearP) {
        if (clearP == sbhl_cache.UNPROVIDED) {
            clearP = (SubLObject)sbhl_cache.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            sbhl_paranoia.$suspend_sbhl_cache_useP$.bind((SubLObject)sbhl_cache.T, thread);
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sbhl_cache.$sym73$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(sbhl_cache.$const74$EverythingPSC, thread);
            if (sbhl_cache.NIL != clearP) {
                clear_sbhl_cached_all_mts_relations_for_node(node, pred);
                clear_sbhl_cached_relations_for_node(node, pred);
            }
            SubLObject cdolist_list_var;
            final SubLObject cached_relations = cdolist_list_var = sbhl_predicate_relation_to_which_cached_nodes(pred, node, pred);
            SubLObject cached_relation = (SubLObject)sbhl_cache.NIL;
            cached_relation = cdolist_list_var.first();
            while (sbhl_cache.NIL != cdolist_list_var) {
                add_to_sbhl_all_mts_cache(pred, cached_relation, node);
                if (sbhl_cache.NIL != sbhl_module_utilities.sbhl_reflexive_module_p(sbhl_module_vars.get_sbhl_module(pred)) && cached_relation.eql(node)) {
                    add_to_sbhl_cache(pred, node, node, sbhl_cache.$const76$UniversalVocabularyMt);
                }
                else {
                    add_to_sbhl_cache_for_relevant_mts(pred, cached_relation, node);
                }
                cdolist_list_var = cdolist_list_var.rest();
                cached_relation = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 40746L)
    public static SubLObject initialize_all_mts_cache_for_genl_preds_and_inverse() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject set_var = get_cached_nodes_set_for_pred(sbhl_cache.$const27$genlPreds);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject pred;
        SubLObject node_var;
        SubLObject deck_type;
        SubLObject recur_deck;
        SubLObject node_and_predicate_mode;
        SubLObject _prev_bind_0;
        SubLObject tv_var;
        SubLObject _prev_bind_0_$14;
        SubLObject _prev_bind_2;
        SubLObject pcase_var;
        SubLObject _prev_bind_0_$15;
        SubLObject _prev_bind_1_$16;
        SubLObject _prev_bind_3;
        SubLObject _prev_bind_4;
        SubLObject _prev_bind_5;
        SubLObject _prev_bind_0_$16;
        SubLObject _prev_bind_1_$17;
        SubLObject _prev_bind_2_$19;
        SubLObject node_var_$20;
        SubLObject predicate_mode;
        SubLObject spec;
        SubLObject _prev_bind_0_$17;
        SubLObject inverse_mode_p;
        SubLObject cdolist_list_var;
        SubLObject accessible_modules;
        SubLObject module_var;
        SubLObject _prev_bind_0_$18;
        SubLObject _prev_bind_1_$18;
        SubLObject node;
        SubLObject d_link;
        SubLObject mt_links;
        SubLObject iteration_state;
        SubLObject mt;
        SubLObject tv_links;
        SubLObject _prev_bind_0_$19;
        SubLObject iteration_state_$25;
        SubLObject tv;
        SubLObject link_nodes;
        SubLObject _prev_bind_0_$20;
        SubLObject sol;
        SubLObject set_contents_var_$27;
        SubLObject basis_object_$28;
        SubLObject state_$29;
        SubLObject node_vars_link_node;
        SubLObject csome_list_var;
        SubLObject node_vars_link_node2;
        SubLObject cdolist_list_var_$30;
        SubLObject new_list;
        SubLObject generating_fn;
        SubLObject _prev_bind_0_$21;
        SubLObject sol2;
        SubLObject link_nodes2;
        SubLObject set_contents_var_$28;
        SubLObject basis_object_$29;
        SubLObject state_$30;
        SubLObject node_vars_link_node3;
        SubLObject csome_list_var2;
        SubLObject node_vars_link_node4;
        SubLObject _prev_bind_0_$22;
        SubLObject _values;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            pred = set_contents.do_set_contents_next(basis_object, state);
            if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state, pred)) {
                node_var = pred;
                deck_type = (SubLObject)sbhl_cache.$kw79$QUEUE;
                recur_deck = deck.create_deck(deck_type);
                node_and_predicate_mode = (SubLObject)sbhl_cache.NIL;
                _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        tv_var = (SubLObject)sbhl_cache.NIL;
                        _prev_bind_0_$14 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((sbhl_cache.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((sbhl_cache.NIL != tv_var) ? sbhl_cache.$sym80$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (sbhl_cache.NIL != tv_var && sbhl_cache.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_cache.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)sbhl_cache.$kw81$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)sbhl_cache.ONE_INTEGER, (SubLObject)sbhl_cache.$str82$_A_is_not_a__A, tv_var, (SubLObject)sbhl_cache.$sym83$SBHL_TRUE_TV_P, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)sbhl_cache.$kw84$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_cache.ONE_INTEGER, (SubLObject)sbhl_cache.$str85$continue_anyway, (SubLObject)sbhl_cache.$str82$_A_is_not_a__A, tv_var, (SubLObject)sbhl_cache.$sym83$SBHL_TRUE_TV_P, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)sbhl_cache.$kw86$WARN)) {
                                    Errors.warn((SubLObject)sbhl_cache.$str82$_A_is_not_a__A, tv_var, (SubLObject)sbhl_cache.$sym83$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)sbhl_cache.$str87$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)sbhl_cache.$str85$continue_anyway, (SubLObject)sbhl_cache.$str82$_A_is_not_a__A, tv_var, (SubLObject)sbhl_cache.$sym83$SBHL_TRUE_TV_P);
                                }
                            }
                            _prev_bind_0_$15 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            _prev_bind_1_$16 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(sbhl_cache.$const27$genlPreds), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(sbhl_cache.$const27$genlPreds)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(sbhl_cache.$const27$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)sbhl_cache.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(sbhl_cache.$const27$genlPreds), thread);
                                if (sbhl_cache.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || sbhl_cache.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED))) {
                                    _prev_bind_0_$16 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    _prev_bind_1_$17 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    _prev_bind_2_$19 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(sbhl_cache.$const27$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)sbhl_cache.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)sbhl_cache.UNPROVIDED);
                                        for (node_and_predicate_mode = (SubLObject)ConsesLow.list(pred, sbhl_search_vars.genl_inverse_mode_p()); sbhl_cache.NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            node_var_$20 = node_and_predicate_mode.first();
                                            predicate_mode = conses_high.second(node_and_predicate_mode);
                                            spec = node_var_$20;
                                            _prev_bind_0_$17 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                inverse_mode_p = predicate_mode;
                                                if (sbhl_cache.NIL != forts.fort_p(spec)) {
                                                    if (sbhl_cache.NIL != inverse_mode_p) {
                                                        add_to_sbhl_all_mts_cache(sbhl_cache.$const28$genlInverse, pred, spec);
                                                    }
                                                    else {
                                                        add_to_sbhl_all_mts_cache(sbhl_cache.$const27$genlPreds, pred, spec);
                                                    }
                                                }
                                                accessible_modules = (cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(sbhl_cache.$const27$genlPreds)));
                                                module_var = (SubLObject)sbhl_cache.NIL;
                                                module_var = cdolist_list_var.first();
                                                while (sbhl_cache.NIL != cdolist_list_var) {
                                                    _prev_bind_0_$18 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    _prev_bind_1_$18 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((sbhl_cache.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(sbhl_cache.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        node = function_terms.naut_to_nart(node_var_$20);
                                                        if (sbhl_cache.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED));
                                                            if (sbhl_cache.NIL != d_link) {
                                                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED));
                                                                if (sbhl_cache.NIL != mt_links) {
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); sbhl_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (sbhl_cache.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            _prev_bind_0_$19 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                for (iteration_state_$25 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); sbhl_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$25); iteration_state_$25 = dictionary_contents.do_dictionary_contents_next(iteration_state_$25)) {
                                                                                    thread.resetMultipleValues();
                                                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$25);
                                                                                    link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (sbhl_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        _prev_bind_0_$20 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            sol = link_nodes;
                                                                                            if (sbhl_cache.NIL != set.set_p(sol)) {
                                                                                                set_contents_var_$27 = set.do_set_internal(sol);
                                                                                                for (basis_object_$28 = set_contents.do_set_contents_basis_object(set_contents_var_$27), state_$29 = (SubLObject)sbhl_cache.NIL, state_$29 = set_contents.do_set_contents_initial_state(basis_object_$28, set_contents_var_$27); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object_$28, state_$29); state_$29 = set_contents.do_set_contents_update_state(state_$29)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object_$28, state_$29);
                                                                                                    if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state_$29, node_vars_link_node) && sbhl_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)sbhl_cache.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)sbhl_cache.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                csome_list_var = sol;
                                                                                                node_vars_link_node2 = (SubLObject)sbhl_cache.NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (sbhl_cache.NIL != csome_list_var) {
                                                                                                    if (sbhl_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)sbhl_cache.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)sbhl_cache.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)sbhl_cache.$str88$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$20, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$25);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$19, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)sbhl_cache.FIVE_INTEGER, (SubLObject)sbhl_cache.$str89$attempting_to_bind_direction_link, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (sbhl_cache.NIL != obsolete.cnat_p(node, (SubLObject)sbhl_cache.UNPROVIDED)) {
                                                            new_list = (cdolist_list_var_$30 = ((sbhl_cache.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED))));
                                                            generating_fn = (SubLObject)sbhl_cache.NIL;
                                                            generating_fn = cdolist_list_var_$30.first();
                                                            while (sbhl_cache.NIL != cdolist_list_var_$30) {
                                                                _prev_bind_0_$21 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                    if (sbhl_cache.NIL != set.set_p(sol2)) {
                                                                        set_contents_var_$28 = set.do_set_internal(sol2);
                                                                        for (basis_object_$29 = set_contents.do_set_contents_basis_object(set_contents_var_$28), state_$30 = (SubLObject)sbhl_cache.NIL, state_$30 = set_contents.do_set_contents_initial_state(basis_object_$29, set_contents_var_$28); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object_$29, state_$30); state_$30 = set_contents.do_set_contents_update_state(state_$30)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object_$29, state_$30);
                                                                            if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state_$30, node_vars_link_node3) && sbhl_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)sbhl_cache.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)sbhl_cache.UNPROVIDED);
                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        csome_list_var2 = sol2;
                                                                        node_vars_link_node4 = (SubLObject)sbhl_cache.NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (sbhl_cache.NIL != csome_list_var2) {
                                                                            if (sbhl_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)sbhl_cache.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)sbhl_cache.UNPROVIDED);
                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)sbhl_cache.$str88$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$21, thread);
                                                                }
                                                                cdolist_list_var_$30 = cdolist_list_var_$30.rest();
                                                                generating_fn = cdolist_list_var_$30.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$18, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$18, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$17, thread);
                                            }
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$19, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$17, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$16, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)sbhl_cache.TWO_INTEGER, (SubLObject)sbhl_cache.$str90$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED)), (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$16, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$15, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$14, thread);
                        }
                    }
                    finally {
                        _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sbhl_cache.T, thread);
                            _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 41303L)
    public static SubLObject compute_cached_predicates_from_all_mts_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_cache = get_sbhl_all_mts_cache_for_pred(sbhl_cache.$const27$genlPreds);
        if (sbhl_cache.NIL != forts.fort_id_index_p(v_cache)) {
            final SubLObject fii = v_cache;
            SubLObject idx = forts.do_fii_get_constants(fii);
            if (sbhl_cache.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)sbhl_cache.$kw91$SKIP)) {
                final SubLObject idx_$36 = idx;
                if (sbhl_cache.NIL == id_index.id_index_dense_objects_empty_p(idx_$36, (SubLObject)sbhl_cache.$kw91$SKIP)) {
                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$36);
                    final SubLObject backwardP_var = (SubLObject)sbhl_cache.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject nodes;
                    SubLObject spec;
                    SubLObject set_contents_var;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject pred;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)sbhl_cache.NIL, v_iteration = (SubLObject)sbhl_cache.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)sbhl_cache.ONE_INTEGER)) {
                        id = ((sbhl_cache.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)sbhl_cache.ONE_INTEGER) : v_iteration);
                        nodes = Vectors.aref(vector_var, id);
                        if (sbhl_cache.NIL == id_index.id_index_tombstone_p(nodes) || sbhl_cache.NIL == id_index.id_index_skip_tombstones_p((SubLObject)sbhl_cache.$kw91$SKIP)) {
                            if (sbhl_cache.NIL != id_index.id_index_tombstone_p(nodes)) {
                                nodes = (SubLObject)sbhl_cache.$kw91$SKIP;
                            }
                            spec = constants_high.find_constant_by_internal_id(id);
                            if (sbhl_cache.NIL != spec) {
                                set_contents_var = set.do_set_internal(nodes);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    pred = set_contents.do_set_contents_next(basis_object, state);
                                    if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state, pred)) {
                                        add_to_sbhl_cache(sbhl_cache.$const27$genlPreds, pred, pred, sbhl_cache.$const76$UniversalVocabularyMt);
                                        add_to_sbhl_cache_for_relevant_mts(sbhl_cache.$const27$genlPreds, pred, spec);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject idx_$37 = idx;
                if (sbhl_cache.NIL == id_index.id_index_sparse_objects_empty_p(idx_$37)) {
                    final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$37);
                    SubLObject id2 = (SubLObject)sbhl_cache.NIL;
                    SubLObject nodes2 = (SubLObject)sbhl_cache.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            nodes2 = Hashtables.getEntryValue(cdohash_entry);
                            final SubLObject spec2 = constants_high.find_constant_by_internal_id(id2);
                            if (sbhl_cache.NIL != spec2) {
                                final SubLObject set_contents_var2 = set.do_set_internal(nodes2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject pred2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)sbhl_cache.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    pred2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state2, pred2)) {
                                        add_to_sbhl_cache(sbhl_cache.$const27$genlPreds, pred2, pred2, sbhl_cache.$const76$UniversalVocabularyMt);
                                        add_to_sbhl_cache_for_relevant_mts(sbhl_cache.$const27$genlPreds, pred2, spec2);
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            idx = forts.do_fii_get_narts(fii);
            if (sbhl_cache.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)sbhl_cache.$kw91$SKIP)) {
                final SubLObject idx_$38 = idx;
                if (sbhl_cache.NIL == id_index.id_index_dense_objects_empty_p(idx_$38, (SubLObject)sbhl_cache.$kw91$SKIP)) {
                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$38);
                    final SubLObject backwardP_var = (SubLObject)sbhl_cache.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject nodes;
                    SubLObject spec;
                    SubLObject set_contents_var;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject pred;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)sbhl_cache.NIL, v_iteration = (SubLObject)sbhl_cache.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)sbhl_cache.ONE_INTEGER)) {
                        id = ((sbhl_cache.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)sbhl_cache.ONE_INTEGER) : v_iteration);
                        nodes = Vectors.aref(vector_var, id);
                        if (sbhl_cache.NIL == id_index.id_index_tombstone_p(nodes) || sbhl_cache.NIL == id_index.id_index_skip_tombstones_p((SubLObject)sbhl_cache.$kw91$SKIP)) {
                            if (sbhl_cache.NIL != id_index.id_index_tombstone_p(nodes)) {
                                nodes = (SubLObject)sbhl_cache.$kw91$SKIP;
                            }
                            spec = nart_handles.find_nart_by_id(id);
                            if (sbhl_cache.NIL != spec) {
                                set_contents_var = set.do_set_internal(nodes);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    pred = set_contents.do_set_contents_next(basis_object, state);
                                    if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state, pred)) {
                                        add_to_sbhl_cache(sbhl_cache.$const27$genlPreds, pred, pred, sbhl_cache.$const76$UniversalVocabularyMt);
                                        add_to_sbhl_cache_for_relevant_mts(sbhl_cache.$const27$genlPreds, pred, spec);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject idx_$39 = idx;
                if (sbhl_cache.NIL == id_index.id_index_sparse_objects_empty_p(idx_$39)) {
                    final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$39);
                    SubLObject id2 = (SubLObject)sbhl_cache.NIL;
                    SubLObject nodes2 = (SubLObject)sbhl_cache.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            nodes2 = Hashtables.getEntryValue(cdohash_entry);
                            final SubLObject spec2 = nart_handles.find_nart_by_id(id2);
                            if (sbhl_cache.NIL != spec2) {
                                final SubLObject set_contents_var2 = set.do_set_internal(nodes2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject pred2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)sbhl_cache.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    pred2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state2, pred2)) {
                                        add_to_sbhl_cache(sbhl_cache.$const27$genlPreds, pred2, pred2, sbhl_cache.$const76$UniversalVocabularyMt);
                                        add_to_sbhl_cache_for_relevant_mts(sbhl_cache.$const27$genlPreds, pred2, spec2);
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
        }
        else {
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_cache)); sbhl_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject pred3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject subnodes = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject set_contents_var3 = set.do_set_internal(subnodes);
                SubLObject basis_object3;
                SubLObject state3;
                SubLObject spec3;
                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)sbhl_cache.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                    spec3 = set_contents.do_set_contents_next(basis_object3, state3);
                    if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state3, spec3)) {
                        add_to_sbhl_cache(sbhl_cache.$const27$genlPreds, pred3, pred3, sbhl_cache.$const76$UniversalVocabularyMt);
                        add_to_sbhl_cache_for_relevant_mts(sbhl_cache.$const27$genlPreds, pred3, spec3);
                    }
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 41601L)
    public static SubLObject compute_cached_inverses_from_all_mts_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_cache = get_sbhl_all_mts_cache_for_pred(sbhl_cache.$const28$genlInverse);
        if (sbhl_cache.NIL != forts.fort_id_index_p(v_cache)) {
            final SubLObject fii = v_cache;
            SubLObject idx = forts.do_fii_get_constants(fii);
            if (sbhl_cache.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)sbhl_cache.$kw91$SKIP)) {
                final SubLObject idx_$40 = idx;
                if (sbhl_cache.NIL == id_index.id_index_dense_objects_empty_p(idx_$40, (SubLObject)sbhl_cache.$kw91$SKIP)) {
                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$40);
                    final SubLObject backwardP_var = (SubLObject)sbhl_cache.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject nodes;
                    SubLObject spec;
                    SubLObject set_contents_var;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject pred;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)sbhl_cache.NIL, v_iteration = (SubLObject)sbhl_cache.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)sbhl_cache.ONE_INTEGER)) {
                        id = ((sbhl_cache.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)sbhl_cache.ONE_INTEGER) : v_iteration);
                        nodes = Vectors.aref(vector_var, id);
                        if (sbhl_cache.NIL == id_index.id_index_tombstone_p(nodes) || sbhl_cache.NIL == id_index.id_index_skip_tombstones_p((SubLObject)sbhl_cache.$kw91$SKIP)) {
                            if (sbhl_cache.NIL != id_index.id_index_tombstone_p(nodes)) {
                                nodes = (SubLObject)sbhl_cache.$kw91$SKIP;
                            }
                            spec = constants_high.find_constant_by_internal_id(id);
                            if (sbhl_cache.NIL != spec) {
                                set_contents_var = set.do_set_internal(nodes);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    pred = set_contents.do_set_contents_next(basis_object, state);
                                    if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state, pred)) {
                                        add_to_sbhl_cache_for_relevant_mts(sbhl_cache.$const28$genlInverse, pred, spec);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject idx_$41 = idx;
                if (sbhl_cache.NIL == id_index.id_index_sparse_objects_empty_p(idx_$41)) {
                    final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$41);
                    SubLObject id2 = (SubLObject)sbhl_cache.NIL;
                    SubLObject nodes2 = (SubLObject)sbhl_cache.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            nodes2 = Hashtables.getEntryValue(cdohash_entry);
                            final SubLObject spec2 = constants_high.find_constant_by_internal_id(id2);
                            if (sbhl_cache.NIL != spec2) {
                                final SubLObject set_contents_var2 = set.do_set_internal(nodes2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject pred2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)sbhl_cache.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    pred2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state2, pred2)) {
                                        add_to_sbhl_cache_for_relevant_mts(sbhl_cache.$const28$genlInverse, pred2, spec2);
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            idx = forts.do_fii_get_narts(fii);
            if (sbhl_cache.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)sbhl_cache.$kw91$SKIP)) {
                final SubLObject idx_$42 = idx;
                if (sbhl_cache.NIL == id_index.id_index_dense_objects_empty_p(idx_$42, (SubLObject)sbhl_cache.$kw91$SKIP)) {
                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$42);
                    final SubLObject backwardP_var = (SubLObject)sbhl_cache.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject nodes;
                    SubLObject spec;
                    SubLObject set_contents_var;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject pred;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)sbhl_cache.NIL, v_iteration = (SubLObject)sbhl_cache.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)sbhl_cache.ONE_INTEGER)) {
                        id = ((sbhl_cache.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)sbhl_cache.ONE_INTEGER) : v_iteration);
                        nodes = Vectors.aref(vector_var, id);
                        if (sbhl_cache.NIL == id_index.id_index_tombstone_p(nodes) || sbhl_cache.NIL == id_index.id_index_skip_tombstones_p((SubLObject)sbhl_cache.$kw91$SKIP)) {
                            if (sbhl_cache.NIL != id_index.id_index_tombstone_p(nodes)) {
                                nodes = (SubLObject)sbhl_cache.$kw91$SKIP;
                            }
                            spec = nart_handles.find_nart_by_id(id);
                            if (sbhl_cache.NIL != spec) {
                                set_contents_var = set.do_set_internal(nodes);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    pred = set_contents.do_set_contents_next(basis_object, state);
                                    if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state, pred)) {
                                        add_to_sbhl_cache_for_relevant_mts(sbhl_cache.$const28$genlInverse, pred, spec);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject idx_$43 = idx;
                if (sbhl_cache.NIL == id_index.id_index_sparse_objects_empty_p(idx_$43)) {
                    final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$43);
                    SubLObject id2 = (SubLObject)sbhl_cache.NIL;
                    SubLObject nodes2 = (SubLObject)sbhl_cache.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            nodes2 = Hashtables.getEntryValue(cdohash_entry);
                            final SubLObject spec2 = nart_handles.find_nart_by_id(id2);
                            if (sbhl_cache.NIL != spec2) {
                                final SubLObject set_contents_var2 = set.do_set_internal(nodes2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject pred2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)sbhl_cache.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    pred2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state2, pred2)) {
                                        add_to_sbhl_cache_for_relevant_mts(sbhl_cache.$const28$genlInverse, pred2, spec2);
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
        }
        else {
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_cache)); sbhl_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject pred3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject subnodes = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject set_contents_var3 = set.do_set_internal(subnodes);
                SubLObject basis_object3;
                SubLObject state3;
                SubLObject spec3;
                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)sbhl_cache.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                    spec3 = set_contents.do_set_contents_next(basis_object3, state3);
                    if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state3, spec3)) {
                        add_to_sbhl_cache_for_relevant_mts(sbhl_cache.$const28$genlInverse, pred3, spec3);
                    }
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 41805L)
    public static SubLObject sbhl_genl_preds_cache_addition_maintainence(final SubLObject assertion) {
        SubLObject extendedP = (SubLObject)sbhl_cache.NIL;
        final SubLObject pcase_var = assertions_high.gaf_predicate(assertion);
        if (pcase_var.eql(sbhl_cache.$const27$genlPreds)) {
            final SubLObject genl_pred_extendedP = possibly_add_to_sbhl_caches(assertion, sbhl_cache.$const27$genlPreds, sbhl_cache.$const27$genlPreds);
            final SubLObject genl_inverse_extendedP = possibly_add_to_sbhl_caches(assertion, sbhl_cache.$const28$genlInverse, sbhl_cache.$const28$genlInverse);
            extendedP = (SubLObject)SubLObjectFactory.makeBoolean(sbhl_cache.NIL != genl_pred_extendedP || sbhl_cache.NIL != genl_inverse_extendedP);
        }
        else if (pcase_var.eql(sbhl_cache.$const28$genlInverse)) {
            final SubLObject genl_pred_extendedP = possibly_add_to_sbhl_caches(assertion, sbhl_cache.$const27$genlPreds, sbhl_cache.$const28$genlInverse);
            final SubLObject genl_inverse_extendedP = possibly_add_to_sbhl_caches(assertion, sbhl_cache.$const28$genlInverse, sbhl_cache.$const27$genlPreds);
            extendedP = (SubLObject)SubLObjectFactory.makeBoolean(sbhl_cache.NIL != genl_pred_extendedP || sbhl_cache.NIL != genl_inverse_extendedP);
        }
        else {
            sbhl_paranoia.sbhl_error((SubLObject)sbhl_cache.THREE_INTEGER, (SubLObject)sbhl_cache.$str92$genlPreds___genlInverse_after_add, assertions_high.gaf_predicate(assertion), (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED);
        }
        if (sbhl_cache.NIL != extendedP) {
            final SubLObject spec_pred = assertions_high.gaf_arg1(assertion);
            reset_cached_spec_preds_and_spec_inverses(spec_pred);
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 42850L)
    public static SubLObject sbhl_genl_preds_cache_removal_maintainence(final SubLObject assertion) {
        final SubLObject genl_pred_retractedP = possibly_remove_from_sbhl_caches(sbhl_cache.$const27$genlPreds, assertion);
        final SubLObject genl_inverse_retractedP = possibly_remove_from_sbhl_caches(sbhl_cache.$const28$genlInverse, assertion);
        final SubLObject retractedP = (SubLObject)SubLObjectFactory.makeBoolean(sbhl_cache.NIL != genl_pred_retractedP || sbhl_cache.NIL != genl_inverse_retractedP);
        if (sbhl_cache.NIL != retractedP) {
            final SubLObject spec_pred = assertions_high.gaf_arg1(assertion);
            reset_cached_spec_preds_and_spec_inverses(spec_pred);
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 43321L)
    public static SubLObject reset_cached_spec_preds_and_spec_inverses(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sbhl_cache.$sym73$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(sbhl_cache.$const74$EverythingPSC, thread);
            sbhl_paranoia.$suspend_sbhl_cache_useP$.bind((SubLObject)sbhl_cache.T, thread);
            genl_predicates.map_all_spec_preds_and_inverses((SubLObject)sbhl_cache.$sym93$RESET_CACHED_GENL_PRED_AND_INVERSE_RELATIONS, pred, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED);
        }
        finally {
            sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 43536L)
    public static SubLObject reset_cached_genl_pred_and_inverse_relations(final SubLObject pred) {
        reset_cached_sbhl_relations_for_node(sbhl_cache.$const27$genlPreds, pred, (SubLObject)sbhl_cache.T);
        reset_cached_sbhl_relations_for_node(sbhl_cache.$const28$genlInverse, pred, (SubLObject)sbhl_cache.T);
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 43740L)
    public static SubLObject initialize_all_mts_cache_for_genls() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject set_var = get_cached_nodes_set_for_pred(sbhl_cache.$const26$genls);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject genl;
        SubLObject node_var;
        SubLObject deck_type;
        SubLObject recur_deck;
        SubLObject _prev_bind_0;
        SubLObject tv_var;
        SubLObject _prev_bind_0_$44;
        SubLObject _prev_bind_2;
        SubLObject pcase_var;
        SubLObject _prev_bind_0_$45;
        SubLObject _prev_bind_1_$46;
        SubLObject _prev_bind_3;
        SubLObject _prev_bind_4;
        SubLObject _prev_bind_5;
        SubLObject _prev_bind_0_$46;
        SubLObject _prev_bind_1_$47;
        SubLObject _prev_bind_2_$49;
        SubLObject spec;
        SubLObject cdolist_list_var;
        SubLObject accessible_modules;
        SubLObject module_var;
        SubLObject _prev_bind_0_$47;
        SubLObject _prev_bind_1_$48;
        SubLObject node;
        SubLObject d_link;
        SubLObject mt_links;
        SubLObject iteration_state;
        SubLObject mt;
        SubLObject tv_links;
        SubLObject _prev_bind_0_$48;
        SubLObject iteration_state_$53;
        SubLObject tv;
        SubLObject link_nodes;
        SubLObject _prev_bind_0_$49;
        SubLObject sol;
        SubLObject set_contents_var_$55;
        SubLObject basis_object_$56;
        SubLObject state_$57;
        SubLObject node_vars_link_node;
        SubLObject csome_list_var;
        SubLObject node_vars_link_node2;
        SubLObject cdolist_list_var_$58;
        SubLObject new_list;
        SubLObject generating_fn;
        SubLObject _prev_bind_0_$50;
        SubLObject sol2;
        SubLObject link_nodes2;
        SubLObject set_contents_var_$56;
        SubLObject basis_object_$57;
        SubLObject state_$58;
        SubLObject node_vars_link_node3;
        SubLObject csome_list_var2;
        SubLObject node_vars_link_node4;
        SubLObject _prev_bind_0_$51;
        SubLObject _values;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            genl = set_contents.do_set_contents_next(basis_object, state);
            if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state, genl)) {
                node_var = genl;
                deck_type = (SubLObject)sbhl_cache.$kw78$STACK;
                recur_deck = deck.create_deck(deck_type);
                _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        tv_var = (SubLObject)sbhl_cache.NIL;
                        _prev_bind_0_$44 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((sbhl_cache.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((sbhl_cache.NIL != tv_var) ? sbhl_cache.$sym80$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (sbhl_cache.NIL != tv_var && sbhl_cache.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_cache.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)sbhl_cache.$kw81$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)sbhl_cache.ONE_INTEGER, (SubLObject)sbhl_cache.$str82$_A_is_not_a__A, tv_var, (SubLObject)sbhl_cache.$sym83$SBHL_TRUE_TV_P, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)sbhl_cache.$kw84$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_cache.ONE_INTEGER, (SubLObject)sbhl_cache.$str85$continue_anyway, (SubLObject)sbhl_cache.$str82$_A_is_not_a__A, tv_var, (SubLObject)sbhl_cache.$sym83$SBHL_TRUE_TV_P, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)sbhl_cache.$kw86$WARN)) {
                                    Errors.warn((SubLObject)sbhl_cache.$str82$_A_is_not_a__A, tv_var, (SubLObject)sbhl_cache.$sym83$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)sbhl_cache.$str87$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)sbhl_cache.$str85$continue_anyway, (SubLObject)sbhl_cache.$str82$_A_is_not_a__A, tv_var, (SubLObject)sbhl_cache.$sym83$SBHL_TRUE_TV_P);
                                }
                            }
                            _prev_bind_0_$45 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            _prev_bind_1_$46 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(sbhl_cache.$const26$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(sbhl_cache.$const26$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(sbhl_cache.$const26$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)sbhl_cache.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(sbhl_cache.$const26$genls), thread);
                                if (sbhl_cache.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || sbhl_cache.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(genl, sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED))) {
                                    _prev_bind_0_$46 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    _prev_bind_1_$47 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    _prev_bind_2_$49 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(sbhl_cache.$const26$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)sbhl_cache.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)sbhl_cache.UNPROVIDED);
                                        while (sbhl_cache.NIL != node_var) {
                                            spec = node_var;
                                            if (sbhl_cache.NIL != forts.fort_p(spec)) {
                                                add_to_sbhl_all_mts_cache(sbhl_cache.$const26$genls, genl, spec);
                                            }
                                            accessible_modules = (cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(sbhl_cache.$const26$genls)));
                                            module_var = (SubLObject)sbhl_cache.NIL;
                                            module_var = cdolist_list_var.first();
                                            while (sbhl_cache.NIL != cdolist_list_var) {
                                                _prev_bind_0_$47 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                _prev_bind_1_$48 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((sbhl_cache.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(sbhl_cache.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    node = function_terms.naut_to_nart(node_var);
                                                    if (sbhl_cache.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED));
                                                        if (sbhl_cache.NIL != d_link) {
                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED));
                                                            if (sbhl_cache.NIL != mt_links) {
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); sbhl_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (sbhl_cache.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        _prev_bind_0_$48 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            for (iteration_state_$53 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); sbhl_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$53); iteration_state_$53 = dictionary_contents.do_dictionary_contents_next(iteration_state_$53)) {
                                                                                thread.resetMultipleValues();
                                                                                tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$53);
                                                                                link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (sbhl_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    _prev_bind_0_$49 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        sol = link_nodes;
                                                                                        if (sbhl_cache.NIL != set.set_p(sol)) {
                                                                                            set_contents_var_$55 = set.do_set_internal(sol);
                                                                                            for (basis_object_$56 = set_contents.do_set_contents_basis_object(set_contents_var_$55), state_$57 = (SubLObject)sbhl_cache.NIL, state_$57 = set_contents.do_set_contents_initial_state(basis_object_$56, set_contents_var_$55); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object_$56, state_$57); state_$57 = set_contents.do_set_contents_update_state(state_$57)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object_$56, state_$57);
                                                                                                if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state_$57, node_vars_link_node) && sbhl_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)sbhl_cache.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)sbhl_cache.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            csome_list_var = sol;
                                                                                            node_vars_link_node2 = (SubLObject)sbhl_cache.NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (sbhl_cache.NIL != csome_list_var) {
                                                                                                if (sbhl_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)sbhl_cache.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)sbhl_cache.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)sbhl_cache.$str88$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$49, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$53);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$48, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)sbhl_cache.FIVE_INTEGER, (SubLObject)sbhl_cache.$str89$attempting_to_bind_direction_link, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (sbhl_cache.NIL != obsolete.cnat_p(node, (SubLObject)sbhl_cache.UNPROVIDED)) {
                                                        new_list = (cdolist_list_var_$58 = ((sbhl_cache.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED))));
                                                        generating_fn = (SubLObject)sbhl_cache.NIL;
                                                        generating_fn = cdolist_list_var_$58.first();
                                                        while (sbhl_cache.NIL != cdolist_list_var_$58) {
                                                            _prev_bind_0_$50 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                if (sbhl_cache.NIL != set.set_p(sol2)) {
                                                                    set_contents_var_$56 = set.do_set_internal(sol2);
                                                                    for (basis_object_$57 = set_contents.do_set_contents_basis_object(set_contents_var_$56), state_$58 = (SubLObject)sbhl_cache.NIL, state_$58 = set_contents.do_set_contents_initial_state(basis_object_$57, set_contents_var_$56); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object_$57, state_$58); state_$58 = set_contents.do_set_contents_update_state(state_$58)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object_$57, state_$58);
                                                                        if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state_$58, node_vars_link_node3) && sbhl_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)sbhl_cache.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)sbhl_cache.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    csome_list_var2 = sol2;
                                                                    node_vars_link_node4 = (SubLObject)sbhl_cache.NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (sbhl_cache.NIL != csome_list_var2) {
                                                                        if (sbhl_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)sbhl_cache.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)sbhl_cache.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)sbhl_cache.$str88$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$50, thread);
                                                            }
                                                            cdolist_list_var_$58 = cdolist_list_var_$58.rest();
                                                            generating_fn = cdolist_list_var_$58.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$48, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$47, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$49, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$47, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$46, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)sbhl_cache.TWO_INTEGER, (SubLObject)sbhl_cache.$str90$Node__a_does_not_pass_sbhl_type_t, genl, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED)), (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$46, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$45, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$44, thread);
                        }
                    }
                    finally {
                        _prev_bind_0_$51 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sbhl_cache.T, thread);
                            _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$51, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 44012L)
    public static SubLObject compute_cached_genls_from_all_mts_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_cache = get_sbhl_all_mts_cache_for_pred(sbhl_cache.$const26$genls);
        if (sbhl_cache.NIL != forts.fort_id_index_p(v_cache)) {
            final SubLObject fii = v_cache;
            SubLObject idx = forts.do_fii_get_constants(fii);
            if (sbhl_cache.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)sbhl_cache.$kw91$SKIP)) {
                final SubLObject idx_$64 = idx;
                if (sbhl_cache.NIL == id_index.id_index_dense_objects_empty_p(idx_$64, (SubLObject)sbhl_cache.$kw91$SKIP)) {
                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$64);
                    final SubLObject backwardP_var = (SubLObject)sbhl_cache.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject nodes;
                    SubLObject spec;
                    SubLObject set_contents_var;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject genl;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)sbhl_cache.NIL, v_iteration = (SubLObject)sbhl_cache.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)sbhl_cache.ONE_INTEGER)) {
                        id = ((sbhl_cache.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)sbhl_cache.ONE_INTEGER) : v_iteration);
                        nodes = Vectors.aref(vector_var, id);
                        if (sbhl_cache.NIL == id_index.id_index_tombstone_p(nodes) || sbhl_cache.NIL == id_index.id_index_skip_tombstones_p((SubLObject)sbhl_cache.$kw91$SKIP)) {
                            if (sbhl_cache.NIL != id_index.id_index_tombstone_p(nodes)) {
                                nodes = (SubLObject)sbhl_cache.$kw91$SKIP;
                            }
                            spec = constants_high.find_constant_by_internal_id(id);
                            if (sbhl_cache.NIL != spec) {
                                set_contents_var = set.do_set_internal(nodes);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    genl = set_contents.do_set_contents_next(basis_object, state);
                                    if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state, genl)) {
                                        add_to_sbhl_cache(sbhl_cache.$const26$genls, genl, genl, sbhl_cache.$const76$UniversalVocabularyMt);
                                        add_to_sbhl_cache_for_relevant_mts(sbhl_cache.$const26$genls, genl, spec);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject idx_$65 = idx;
                if (sbhl_cache.NIL == id_index.id_index_sparse_objects_empty_p(idx_$65)) {
                    final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$65);
                    SubLObject id2 = (SubLObject)sbhl_cache.NIL;
                    SubLObject nodes2 = (SubLObject)sbhl_cache.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            nodes2 = Hashtables.getEntryValue(cdohash_entry);
                            final SubLObject spec2 = constants_high.find_constant_by_internal_id(id2);
                            if (sbhl_cache.NIL != spec2) {
                                final SubLObject set_contents_var2 = set.do_set_internal(nodes2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject genl2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)sbhl_cache.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    genl2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state2, genl2)) {
                                        add_to_sbhl_cache(sbhl_cache.$const26$genls, genl2, genl2, sbhl_cache.$const76$UniversalVocabularyMt);
                                        add_to_sbhl_cache_for_relevant_mts(sbhl_cache.$const26$genls, genl2, spec2);
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            idx = forts.do_fii_get_narts(fii);
            if (sbhl_cache.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)sbhl_cache.$kw91$SKIP)) {
                final SubLObject idx_$66 = idx;
                if (sbhl_cache.NIL == id_index.id_index_dense_objects_empty_p(idx_$66, (SubLObject)sbhl_cache.$kw91$SKIP)) {
                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$66);
                    final SubLObject backwardP_var = (SubLObject)sbhl_cache.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject nodes;
                    SubLObject spec;
                    SubLObject set_contents_var;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject genl;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)sbhl_cache.NIL, v_iteration = (SubLObject)sbhl_cache.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)sbhl_cache.ONE_INTEGER)) {
                        id = ((sbhl_cache.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)sbhl_cache.ONE_INTEGER) : v_iteration);
                        nodes = Vectors.aref(vector_var, id);
                        if (sbhl_cache.NIL == id_index.id_index_tombstone_p(nodes) || sbhl_cache.NIL == id_index.id_index_skip_tombstones_p((SubLObject)sbhl_cache.$kw91$SKIP)) {
                            if (sbhl_cache.NIL != id_index.id_index_tombstone_p(nodes)) {
                                nodes = (SubLObject)sbhl_cache.$kw91$SKIP;
                            }
                            spec = nart_handles.find_nart_by_id(id);
                            if (sbhl_cache.NIL != spec) {
                                set_contents_var = set.do_set_internal(nodes);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    genl = set_contents.do_set_contents_next(basis_object, state);
                                    if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state, genl)) {
                                        add_to_sbhl_cache(sbhl_cache.$const26$genls, genl, genl, sbhl_cache.$const76$UniversalVocabularyMt);
                                        add_to_sbhl_cache_for_relevant_mts(sbhl_cache.$const26$genls, genl, spec);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject idx_$67 = idx;
                if (sbhl_cache.NIL == id_index.id_index_sparse_objects_empty_p(idx_$67)) {
                    final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$67);
                    SubLObject id2 = (SubLObject)sbhl_cache.NIL;
                    SubLObject nodes2 = (SubLObject)sbhl_cache.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            nodes2 = Hashtables.getEntryValue(cdohash_entry);
                            final SubLObject spec2 = nart_handles.find_nart_by_id(id2);
                            if (sbhl_cache.NIL != spec2) {
                                final SubLObject set_contents_var2 = set.do_set_internal(nodes2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject genl2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)sbhl_cache.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    genl2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state2, genl2)) {
                                        add_to_sbhl_cache(sbhl_cache.$const26$genls, genl2, genl2, sbhl_cache.$const76$UniversalVocabularyMt);
                                        add_to_sbhl_cache_for_relevant_mts(sbhl_cache.$const26$genls, genl2, spec2);
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
        }
        else {
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_cache)); sbhl_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject genl3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject subnodes = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject set_contents_var3 = set.do_set_internal(subnodes);
                SubLObject basis_object3;
                SubLObject state3;
                SubLObject spec3;
                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)sbhl_cache.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                    spec3 = set_contents.do_set_contents_next(basis_object3, state3);
                    if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state3, spec3)) {
                        add_to_sbhl_cache(sbhl_cache.$const26$genls, genl3, genl3, sbhl_cache.$const76$UniversalVocabularyMt);
                        add_to_sbhl_cache_for_relevant_mts(sbhl_cache.$const26$genls, genl3, spec3);
                    }
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 44291L)
    public static SubLObject genls_cache_addition_maintainence(final SubLObject assertion) {
        final SubLObject spec = assertions_high.gaf_arg1(assertion);
        final SubLObject genl = assertions_high.gaf_arg2(assertion);
        SubLObject extendedP = (SubLObject)sbhl_cache.NIL;
        extendedP = possibly_add_to_sbhl_caches(assertion, sbhl_cache.$const26$genls, sbhl_cache.$const26$genls);
        if (sbhl_cache.NIL != extendedP) {
            reset_cached_genls_of_all_specs(spec);
        }
        final SubLObject new_cached_isas = sbhl_predicate_relation_to_which_cached_nodes(sbhl_cache.$const26$genls, spec, sbhl_cache.$const14$isa);
        final SubLObject old_cached_isas = sbhl_predicate_relation_to_which_cached_nodes_excluding_link_node(sbhl_cache.$const26$genls, spec, sbhl_cache.$const14$isa, genl);
        SubLObject types_gained = conses_high.set_difference(new_cached_isas, old_cached_isas, Symbols.symbol_function((SubLObject)sbhl_cache.EQL), (SubLObject)sbhl_cache.UNPROVIDED);
        if (sbhl_cache.NIL != types_gained) {
            reset_sbhl_types_of_all_instances(spec);
        }
        final SubLObject new_cached_quoted_isas = sbhl_predicate_relation_to_which_cached_nodes(sbhl_cache.$const26$genls, spec, sbhl_cache.$const19$quotedIsa);
        final SubLObject old_cached_quoted_isas = sbhl_predicate_relation_to_which_cached_nodes_excluding_link_node(sbhl_cache.$const26$genls, spec, sbhl_cache.$const19$quotedIsa, genl);
        types_gained = conses_high.set_difference(new_cached_quoted_isas, old_cached_quoted_isas, Symbols.symbol_function((SubLObject)sbhl_cache.EQL), (SubLObject)sbhl_cache.UNPROVIDED);
        if (sbhl_cache.NIL != types_gained) {
            reset_sbhl_types_of_all_quoted_instances(spec);
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 45534L)
    public static SubLObject genls_cache_removal_maintainence(final SubLObject assertion) {
        final SubLObject spec = assertions_high.gaf_arg1(assertion);
        final SubLObject genl = assertions_high.gaf_arg2(assertion);
        SubLObject retractedP = (SubLObject)sbhl_cache.NIL;
        retractedP = possibly_remove_from_sbhl_caches(sbhl_cache.$const26$genls, assertion);
        if (sbhl_cache.NIL != retractedP) {
            reset_cached_genls_of_all_specs(spec);
        }
        final SubLObject new_cached_isas = sbhl_predicate_relation_to_which_cached_nodes(sbhl_cache.$const26$genls, spec, sbhl_cache.$const14$isa);
        final SubLObject old_cached_isas = sbhl_predicate_relation_to_which_cached_nodes(sbhl_cache.$const26$genls, genl, sbhl_cache.$const14$isa);
        SubLObject types_lost = conses_high.set_difference(old_cached_isas, new_cached_isas, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED);
        if (sbhl_cache.NIL != types_lost) {
            reset_sbhl_types_of_all_instances(spec);
        }
        final SubLObject new_cached_quoted_isas = sbhl_predicate_relation_to_which_cached_nodes(sbhl_cache.$const26$genls, spec, sbhl_cache.$const19$quotedIsa);
        final SubLObject old_cached_quoted_isas = sbhl_predicate_relation_to_which_cached_nodes(sbhl_cache.$const26$genls, genl, sbhl_cache.$const19$quotedIsa);
        types_lost = conses_high.set_difference(old_cached_quoted_isas, new_cached_quoted_isas, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED);
        if (sbhl_cache.NIL != types_lost) {
            reset_sbhl_types_of_all_quoted_instances(spec);
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 46617L)
    public static SubLObject reset_sbhl_types_of_all_instances(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sbhl_cache.$sym73$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(sbhl_cache.$const74$EverythingPSC, thread);
            sbhl_paranoia.$suspend_sbhl_cache_useP$.bind((SubLObject)sbhl_cache.T, thread);
            isa.map_all_instances((SubLObject)sbhl_cache.$sym95$RESET_CACHED_ISA_RELATIONS, col, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED);
        }
        finally {
            sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 46790L)
    public static SubLObject reset_sbhl_types_of_all_quoted_instances(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sbhl_cache.$sym73$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(sbhl_cache.$const74$EverythingPSC, thread);
            sbhl_paranoia.$suspend_sbhl_cache_useP$.bind((SubLObject)sbhl_cache.T, thread);
            isa.map_all_instances((SubLObject)sbhl_cache.$sym96$RESET_CACHED_QUOTED_ISA_RELATIONS, col, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED);
        }
        finally {
            sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 46977L)
    public static SubLObject reset_cached_genls_of_all_specs(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sbhl_cache.$sym73$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(sbhl_cache.$const74$EverythingPSC, thread);
            sbhl_paranoia.$suspend_sbhl_cache_useP$.bind((SubLObject)sbhl_cache.T, thread);
            genls.map_all_specs((SubLObject)sbhl_cache.$sym97$RESET_CACHED_GENLS_RELATIONS, col, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED);
        }
        finally {
            sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 47146L)
    public static SubLObject reset_cached_genls_relations(final SubLObject col) {
        reset_cached_sbhl_relations_for_node(sbhl_cache.$const26$genls, col, (SubLObject)sbhl_cache.T);
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 47266L)
    public static SubLObject initialize_all_mts_cache_for_isa() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject set_var = get_cached_nodes_set_for_pred(sbhl_cache.$const14$isa);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject type;
        SubLObject node_var;
        SubLObject _prev_bind_0;
        SubLObject _prev_bind_2;
        SubLObject node_var_$68;
        SubLObject deck_type;
        SubLObject recur_deck;
        SubLObject _prev_bind_0_$69;
        SubLObject tv_var;
        SubLObject _prev_bind_0_$70;
        SubLObject _prev_bind_1_$71;
        SubLObject pcase_var;
        SubLObject _prev_bind_0_$71;
        SubLObject _prev_bind_1_$72;
        SubLObject _prev_bind_3;
        SubLObject _prev_bind_4;
        SubLObject _prev_bind_5;
        SubLObject _prev_bind_0_$72;
        SubLObject _prev_bind_1_$73;
        SubLObject _prev_bind_2_$76;
        SubLObject tt_node_var;
        SubLObject cdolist_list_var;
        SubLObject accessible_modules;
        SubLObject module_var;
        SubLObject _prev_bind_0_$73;
        SubLObject _prev_bind_1_$74;
        SubLObject node;
        SubLObject d_link;
        SubLObject mt_links;
        SubLObject iteration_state;
        SubLObject mt;
        SubLObject tv_links;
        SubLObject _prev_bind_0_$74;
        SubLObject iteration_state_$80;
        SubLObject tv;
        SubLObject link_nodes;
        SubLObject _prev_bind_0_$75;
        SubLObject sol;
        SubLObject set_contents_var_$82;
        SubLObject basis_object_$83;
        SubLObject state_$84;
        SubLObject instance;
        SubLObject csome_list_var;
        SubLObject instance2;
        SubLObject csome_list_var2;
        SubLObject instance_tuple;
        SubLObject current;
        SubLObject datum;
        SubLObject link_node;
        SubLObject mt2;
        SubLObject tv2;
        SubLObject _prev_bind_0_$76;
        SubLObject _prev_bind_0_$77;
        SubLObject link_nodes2;
        SubLObject set_contents_var_$83;
        SubLObject basis_object_$84;
        SubLObject state_$85;
        SubLObject csome_list_var_$90;
        SubLObject cdolist_list_var_$91;
        SubLObject new_list;
        SubLObject generating_fn;
        SubLObject _prev_bind_0_$78;
        SubLObject sol2;
        SubLObject link_nodes3;
        SubLObject set_contents_var_$84;
        SubLObject basis_object_$85;
        SubLObject state_$86;
        SubLObject instance3;
        SubLObject csome_list_var3;
        SubLObject instance4;
        SubLObject cdolist_list_var2;
        SubLObject accessible_modules2;
        SubLObject module_var2;
        SubLObject _prev_bind_0_$79;
        SubLObject _prev_bind_1_$75;
        SubLObject node2;
        SubLObject d_link2;
        SubLObject mt_links2;
        SubLObject iteration_state2;
        SubLObject mt3;
        SubLObject tv_links2;
        SubLObject _prev_bind_0_$80;
        SubLObject iteration_state_$81;
        SubLObject link_nodes4;
        SubLObject _prev_bind_0_$81;
        SubLObject sol3;
        SubLObject set_contents_var_$85;
        SubLObject basis_object_$86;
        SubLObject state_$87;
        SubLObject node_vars_link_node;
        SubLObject csome_list_var4;
        SubLObject node_vars_link_node2;
        SubLObject cdolist_list_var_$92;
        SubLObject new_list2;
        SubLObject generating_fn2;
        SubLObject _prev_bind_0_$82;
        SubLObject sol4;
        SubLObject link_nodes5;
        SubLObject set_contents_var_$86;
        SubLObject basis_object_$87;
        SubLObject state_$88;
        SubLObject node_vars_link_node3;
        SubLObject csome_list_var5;
        SubLObject node_vars_link_node4;
        SubLObject _prev_bind_0_$83;
        SubLObject _values;
        SubLObject _prev_bind_0_$84;
        SubLObject _values2;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            type = set_contents.do_set_contents_next(basis_object, state);
            if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state, type)) {
                node_var = type;
                _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(sbhl_cache.$const14$isa), thread);
                    sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        node_var_$68 = node_var;
                        deck_type = (SubLObject)sbhl_cache.$kw78$STACK;
                        recur_deck = deck.create_deck(deck_type);
                        _prev_bind_0_$69 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                tv_var = (SubLObject)sbhl_cache.NIL;
                                _prev_bind_0_$70 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                _prev_bind_1_$71 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind((sbhl_cache.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((sbhl_cache.NIL != tv_var) ? sbhl_cache.$sym80$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                    if (sbhl_cache.NIL != tv_var && sbhl_cache.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_cache.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                        pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql((SubLObject)sbhl_cache.$kw81$ERROR)) {
                                            sbhl_paranoia.sbhl_error((SubLObject)sbhl_cache.ONE_INTEGER, (SubLObject)sbhl_cache.$str82$_A_is_not_a__A, tv_var, (SubLObject)sbhl_cache.$sym83$SBHL_TRUE_TV_P, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED);
                                        }
                                        else if (pcase_var.eql((SubLObject)sbhl_cache.$kw84$CERROR)) {
                                            sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_cache.ONE_INTEGER, (SubLObject)sbhl_cache.$str85$continue_anyway, (SubLObject)sbhl_cache.$str82$_A_is_not_a__A, tv_var, (SubLObject)sbhl_cache.$sym83$SBHL_TRUE_TV_P, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED);
                                        }
                                        else if (pcase_var.eql((SubLObject)sbhl_cache.$kw86$WARN)) {
                                            Errors.warn((SubLObject)sbhl_cache.$str82$_A_is_not_a__A, tv_var, (SubLObject)sbhl_cache.$sym83$SBHL_TRUE_TV_P);
                                        }
                                        else {
                                            Errors.warn((SubLObject)sbhl_cache.$str87$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror((SubLObject)sbhl_cache.$str85$continue_anyway, (SubLObject)sbhl_cache.$str82$_A_is_not_a__A, tv_var, (SubLObject)sbhl_cache.$sym83$SBHL_TRUE_TV_P);
                                        }
                                    }
                                    _prev_bind_0_$71 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    _prev_bind_1_$72 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(sbhl_cache.$const14$isa)), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(sbhl_cache.$const14$isa))), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(sbhl_cache.$const14$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)sbhl_cache.NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(sbhl_cache.$const14$isa)), thread);
                                        if (sbhl_cache.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || sbhl_cache.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED))) {
                                            _prev_bind_0_$72 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            _prev_bind_1_$73 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            _prev_bind_2_$76 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(sbhl_cache.$const14$isa))), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)sbhl_cache.NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$68, (SubLObject)sbhl_cache.UNPROVIDED);
                                                while (sbhl_cache.NIL != node_var_$68) {
                                                    tt_node_var = node_var_$68;
                                                    accessible_modules = (cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(sbhl_cache.$const14$isa)));
                                                    module_var = (SubLObject)sbhl_cache.NIL;
                                                    module_var = cdolist_list_var.first();
                                                    while (sbhl_cache.NIL != cdolist_list_var) {
                                                        _prev_bind_0_$73 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$74 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((sbhl_cache.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(sbhl_cache.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                            node = function_terms.naut_to_nart(tt_node_var);
                                                            if (sbhl_cache.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED));
                                                                if (sbhl_cache.NIL != d_link) {
                                                                    mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(sbhl_cache.$const14$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED));
                                                                    if (sbhl_cache.NIL != mt_links) {
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); sbhl_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (sbhl_cache.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                _prev_bind_0_$74 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                    for (iteration_state_$80 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); sbhl_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$80); iteration_state_$80 = dictionary_contents.do_dictionary_contents_next(iteration_state_$80)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$80);
                                                                                        link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (sbhl_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            _prev_bind_0_$75 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                sol = link_nodes;
                                                                                                if (sbhl_cache.NIL != set.set_p(sol)) {
                                                                                                    set_contents_var_$82 = set.do_set_internal(sol);
                                                                                                    for (basis_object_$83 = set_contents.do_set_contents_basis_object(set_contents_var_$82), state_$84 = (SubLObject)sbhl_cache.NIL, state_$84 = set_contents.do_set_contents_initial_state(basis_object_$83, set_contents_var_$82); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object_$83, state_$84); state_$84 = set_contents.do_set_contents_update_state(state_$84)) {
                                                                                                        instance = set_contents.do_set_contents_next(basis_object_$83, state_$84);
                                                                                                        if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state_$84, instance) && sbhl_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (sbhl_cache.NIL != forts.fort_p(instance)) {
                                                                                                                add_to_sbhl_all_mts_cache(sbhl_cache.$const14$isa, type, instance);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (sol.isList()) {
                                                                                                    csome_list_var = sol;
                                                                                                    instance2 = (SubLObject)sbhl_cache.NIL;
                                                                                                    instance2 = csome_list_var.first();
                                                                                                    while (sbhl_cache.NIL != csome_list_var) {
                                                                                                        if (sbhl_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (sbhl_cache.NIL != forts.fort_p(instance2)) {
                                                                                                                add_to_sbhl_all_mts_cache(sbhl_cache.$const14$isa, type, instance2);
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        instance2 = csome_list_var.first();
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)sbhl_cache.$str88$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$75, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$80);
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$74, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                }
                                                                else {
                                                                    sbhl_paranoia.sbhl_error((SubLObject)sbhl_cache.FIVE_INTEGER, (SubLObject)sbhl_cache.$str89$attempting_to_bind_direction_link, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED);
                                                                }
                                                                if (sbhl_cache.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED))) {
                                                                    csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                    instance_tuple = (SubLObject)sbhl_cache.NIL;
                                                                    instance_tuple = csome_list_var2.first();
                                                                    while (sbhl_cache.NIL != csome_list_var2) {
                                                                        datum = (current = instance_tuple);
                                                                        link_node = (SubLObject)sbhl_cache.NIL;
                                                                        mt2 = (SubLObject)sbhl_cache.NIL;
                                                                        tv2 = (SubLObject)sbhl_cache.NIL;
                                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_cache.$list98);
                                                                        link_node = current.first();
                                                                        current = current.rest();
                                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_cache.$list98);
                                                                        mt2 = current.first();
                                                                        current = current.rest();
                                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_cache.$list98);
                                                                        tv2 = current.first();
                                                                        current = current.rest();
                                                                        if (sbhl_cache.NIL == current) {
                                                                            if (sbhl_cache.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                                _prev_bind_0_$76 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                    if (sbhl_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        _prev_bind_0_$77 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            link_nodes2 = (sol = (SubLObject)ConsesLow.list(link_node));
                                                                                            if (sbhl_cache.NIL != set.set_p(sol)) {
                                                                                                set_contents_var_$83 = set.do_set_internal(sol);
                                                                                                for (basis_object_$84 = set_contents.do_set_contents_basis_object(set_contents_var_$83), state_$85 = (SubLObject)sbhl_cache.NIL, state_$85 = set_contents.do_set_contents_initial_state(basis_object_$84, set_contents_var_$83); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object_$84, state_$85); state_$85 = set_contents.do_set_contents_update_state(state_$85)) {
                                                                                                    instance = set_contents.do_set_contents_next(basis_object_$84, state_$85);
                                                                                                    if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state_$85, instance) && sbhl_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (sbhl_cache.NIL != forts.fort_p(instance)) {
                                                                                                            add_to_sbhl_all_mts_cache(sbhl_cache.$const14$isa, type, instance);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                csome_list_var_$90 = sol;
                                                                                                instance2 = (SubLObject)sbhl_cache.NIL;
                                                                                                instance2 = csome_list_var_$90.first();
                                                                                                while (sbhl_cache.NIL != csome_list_var_$90) {
                                                                                                    if (sbhl_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (sbhl_cache.NIL != forts.fort_p(instance2)) {
                                                                                                            add_to_sbhl_all_mts_cache(sbhl_cache.$const14$isa, type, instance2);
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var_$90 = csome_list_var_$90.rest();
                                                                                                    instance2 = csome_list_var_$90.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)sbhl_cache.$str88$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$77, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$76, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        else {
                                                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_cache.$list98);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        instance_tuple = csome_list_var2.first();
                                                                    }
                                                                }
                                                            }
                                                            else if (sbhl_cache.NIL != obsolete.cnat_p(node, (SubLObject)sbhl_cache.UNPROVIDED)) {
                                                                new_list = (cdolist_list_var_$91 = ((sbhl_cache.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(sbhl_cache.$const14$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(sbhl_cache.$const14$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED))));
                                                                generating_fn = (SubLObject)sbhl_cache.NIL;
                                                                generating_fn = cdolist_list_var_$91.first();
                                                                while (sbhl_cache.NIL != cdolist_list_var_$91) {
                                                                    _prev_bind_0_$78 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        link_nodes3 = (sol2 = Functions.funcall(generating_fn, node));
                                                                        if (sbhl_cache.NIL != set.set_p(sol2)) {
                                                                            set_contents_var_$84 = set.do_set_internal(sol2);
                                                                            for (basis_object_$85 = set_contents.do_set_contents_basis_object(set_contents_var_$84), state_$86 = (SubLObject)sbhl_cache.NIL, state_$86 = set_contents.do_set_contents_initial_state(basis_object_$85, set_contents_var_$84); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object_$85, state_$86); state_$86 = set_contents.do_set_contents_update_state(state_$86)) {
                                                                                instance3 = set_contents.do_set_contents_next(basis_object_$85, state_$86);
                                                                                if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state_$86, instance3) && sbhl_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if (sbhl_cache.NIL != forts.fort_p(instance3)) {
                                                                                        add_to_sbhl_all_mts_cache(sbhl_cache.$const14$isa, type, instance3);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (sol2.isList()) {
                                                                            csome_list_var3 = sol2;
                                                                            instance4 = (SubLObject)sbhl_cache.NIL;
                                                                            instance4 = csome_list_var3.first();
                                                                            while (sbhl_cache.NIL != csome_list_var3) {
                                                                                if (sbhl_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if (sbhl_cache.NIL != forts.fort_p(instance4)) {
                                                                                        add_to_sbhl_all_mts_cache(sbhl_cache.$const14$isa, type, instance4);
                                                                                    }
                                                                                }
                                                                                csome_list_var3 = csome_list_var3.rest();
                                                                                instance4 = csome_list_var3.first();
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)sbhl_cache.$str88$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$78, thread);
                                                                    }
                                                                    cdolist_list_var_$91 = cdolist_list_var_$91.rest();
                                                                    generating_fn = cdolist_list_var_$91.first();
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$74, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$73, thread);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        module_var = cdolist_list_var.first();
                                                    }
                                                    accessible_modules2 = (cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(sbhl_cache.$const14$isa))));
                                                    module_var2 = (SubLObject)sbhl_cache.NIL;
                                                    module_var2 = cdolist_list_var2.first();
                                                    while (sbhl_cache.NIL != cdolist_list_var2) {
                                                        _prev_bind_0_$79 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$75 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((sbhl_cache.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(sbhl_cache.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                            node2 = function_terms.naut_to_nart(node_var_$68);
                                                            if (sbhl_cache.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED));
                                                                if (sbhl_cache.NIL != d_link2) {
                                                                    mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED));
                                                                    if (sbhl_cache.NIL != mt_links2) {
                                                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); sbhl_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                            thread.resetMultipleValues();
                                                                            mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                            tv_links2 = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (sbhl_cache.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                                _prev_bind_0_$80 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                    for (iteration_state_$81 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); sbhl_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$81); iteration_state_$81 = dictionary_contents.do_dictionary_contents_next(iteration_state_$81)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$81);
                                                                                        link_nodes4 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (sbhl_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                            _prev_bind_0_$81 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                sol3 = link_nodes4;
                                                                                                if (sbhl_cache.NIL != set.set_p(sol3)) {
                                                                                                    set_contents_var_$85 = set.do_set_internal(sol3);
                                                                                                    for (basis_object_$86 = set_contents.do_set_contents_basis_object(set_contents_var_$85), state_$87 = (SubLObject)sbhl_cache.NIL, state_$87 = set_contents.do_set_contents_initial_state(basis_object_$86, set_contents_var_$85); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object_$86, state_$87); state_$87 = set_contents.do_set_contents_update_state(state_$87)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object_$86, state_$87);
                                                                                                        if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state_$87, node_vars_link_node) && sbhl_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)sbhl_cache.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)sbhl_cache.UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (sol3.isList()) {
                                                                                                    csome_list_var4 = sol3;
                                                                                                    node_vars_link_node2 = (SubLObject)sbhl_cache.NIL;
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                    while (sbhl_cache.NIL != csome_list_var4) {
                                                                                                        if (sbhl_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)sbhl_cache.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)sbhl_cache.UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var4 = csome_list_var4.rest();
                                                                                                        node_vars_link_node2 = csome_list_var4.first();
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)sbhl_cache.$str88$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$81, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$81);
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$80, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                    }
                                                                }
                                                                else {
                                                                    sbhl_paranoia.sbhl_error((SubLObject)sbhl_cache.FIVE_INTEGER, (SubLObject)sbhl_cache.$str89$attempting_to_bind_direction_link, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED);
                                                                }
                                                            }
                                                            else if (sbhl_cache.NIL != obsolete.cnat_p(node2, (SubLObject)sbhl_cache.UNPROVIDED)) {
                                                                new_list2 = (cdolist_list_var_$92 = ((sbhl_cache.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED))));
                                                                generating_fn2 = (SubLObject)sbhl_cache.NIL;
                                                                generating_fn2 = cdolist_list_var_$92.first();
                                                                while (sbhl_cache.NIL != cdolist_list_var_$92) {
                                                                    _prev_bind_0_$82 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                        link_nodes5 = (sol4 = Functions.funcall(generating_fn2, node2));
                                                                        if (sbhl_cache.NIL != set.set_p(sol4)) {
                                                                            set_contents_var_$86 = set.do_set_internal(sol4);
                                                                            for (basis_object_$87 = set_contents.do_set_contents_basis_object(set_contents_var_$86), state_$88 = (SubLObject)sbhl_cache.NIL, state_$88 = set_contents.do_set_contents_initial_state(basis_object_$87, set_contents_var_$86); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object_$87, state_$88); state_$88 = set_contents.do_set_contents_update_state(state_$88)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object_$87, state_$88);
                                                                                if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state_$88, node_vars_link_node3) && sbhl_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)sbhl_cache.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)sbhl_cache.UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (sol4.isList()) {
                                                                            csome_list_var5 = sol4;
                                                                            node_vars_link_node4 = (SubLObject)sbhl_cache.NIL;
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                            while (sbhl_cache.NIL != csome_list_var5) {
                                                                                if (sbhl_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)sbhl_cache.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)sbhl_cache.UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var5 = csome_list_var5.rest();
                                                                                node_vars_link_node4 = csome_list_var5.first();
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)sbhl_cache.$str88$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$82, thread);
                                                                    }
                                                                    cdolist_list_var_$92 = cdolist_list_var_$92.rest();
                                                                    generating_fn2 = cdolist_list_var_$92.first();
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$75, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$79, thread);
                                                        }
                                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                                        module_var2 = cdolist_list_var2.first();
                                                    }
                                                    node_var_$68 = deck.deck_pop(recur_deck);
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$76, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$73, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$72, thread);
                                            }
                                        }
                                        else {
                                            sbhl_paranoia.sbhl_warn((SubLObject)sbhl_cache.TWO_INTEGER, (SubLObject)sbhl_cache.$str90$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED)), (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$72, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$71, thread);
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$71, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$70, thread);
                                }
                            }
                            finally {
                                _prev_bind_0_$83 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sbhl_cache.T, thread);
                                    _values = Values.getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$83, thread);
                                }
                            }
                        }
                        finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$69, thread);
                        }
                    }
                    finally {
                        _prev_bind_0_$84 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sbhl_cache.T, thread);
                            _values2 = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$84, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 47522L)
    public static SubLObject compute_cached_isas_from_all_mts_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_cache = get_sbhl_all_mts_cache_for_pred(sbhl_cache.$const14$isa);
        if (sbhl_cache.NIL != forts.fort_id_index_p(v_cache)) {
            final SubLObject fii = v_cache;
            SubLObject idx = forts.do_fii_get_constants(fii);
            if (sbhl_cache.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)sbhl_cache.$kw91$SKIP)) {
                final SubLObject idx_$111 = idx;
                if (sbhl_cache.NIL == id_index.id_index_dense_objects_empty_p(idx_$111, (SubLObject)sbhl_cache.$kw91$SKIP)) {
                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$111);
                    final SubLObject backwardP_var = (SubLObject)sbhl_cache.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject nodes;
                    SubLObject instance;
                    SubLObject set_contents_var;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject type;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)sbhl_cache.NIL, v_iteration = (SubLObject)sbhl_cache.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)sbhl_cache.ONE_INTEGER)) {
                        id = ((sbhl_cache.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)sbhl_cache.ONE_INTEGER) : v_iteration);
                        nodes = Vectors.aref(vector_var, id);
                        if (sbhl_cache.NIL == id_index.id_index_tombstone_p(nodes) || sbhl_cache.NIL == id_index.id_index_skip_tombstones_p((SubLObject)sbhl_cache.$kw91$SKIP)) {
                            if (sbhl_cache.NIL != id_index.id_index_tombstone_p(nodes)) {
                                nodes = (SubLObject)sbhl_cache.$kw91$SKIP;
                            }
                            instance = constants_high.find_constant_by_internal_id(id);
                            if (sbhl_cache.NIL != instance) {
                                set_contents_var = set.do_set_internal(nodes);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    type = set_contents.do_set_contents_next(basis_object, state);
                                    if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state, type)) {
                                        add_to_sbhl_cache_for_relevant_mts(sbhl_cache.$const14$isa, type, instance);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject idx_$112 = idx;
                if (sbhl_cache.NIL == id_index.id_index_sparse_objects_empty_p(idx_$112)) {
                    final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$112);
                    SubLObject id2 = (SubLObject)sbhl_cache.NIL;
                    SubLObject nodes2 = (SubLObject)sbhl_cache.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            nodes2 = Hashtables.getEntryValue(cdohash_entry);
                            final SubLObject instance2 = constants_high.find_constant_by_internal_id(id2);
                            if (sbhl_cache.NIL != instance2) {
                                final SubLObject set_contents_var2 = set.do_set_internal(nodes2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject type2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)sbhl_cache.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    type2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state2, type2)) {
                                        add_to_sbhl_cache_for_relevant_mts(sbhl_cache.$const14$isa, type2, instance2);
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            idx = forts.do_fii_get_narts(fii);
            if (sbhl_cache.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)sbhl_cache.$kw91$SKIP)) {
                final SubLObject idx_$113 = idx;
                if (sbhl_cache.NIL == id_index.id_index_dense_objects_empty_p(idx_$113, (SubLObject)sbhl_cache.$kw91$SKIP)) {
                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$113);
                    final SubLObject backwardP_var = (SubLObject)sbhl_cache.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject nodes;
                    SubLObject instance;
                    SubLObject set_contents_var;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject type;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)sbhl_cache.NIL, v_iteration = (SubLObject)sbhl_cache.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)sbhl_cache.ONE_INTEGER)) {
                        id = ((sbhl_cache.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)sbhl_cache.ONE_INTEGER) : v_iteration);
                        nodes = Vectors.aref(vector_var, id);
                        if (sbhl_cache.NIL == id_index.id_index_tombstone_p(nodes) || sbhl_cache.NIL == id_index.id_index_skip_tombstones_p((SubLObject)sbhl_cache.$kw91$SKIP)) {
                            if (sbhl_cache.NIL != id_index.id_index_tombstone_p(nodes)) {
                                nodes = (SubLObject)sbhl_cache.$kw91$SKIP;
                            }
                            instance = nart_handles.find_nart_by_id(id);
                            if (sbhl_cache.NIL != instance) {
                                set_contents_var = set.do_set_internal(nodes);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    type = set_contents.do_set_contents_next(basis_object, state);
                                    if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state, type)) {
                                        add_to_sbhl_cache_for_relevant_mts(sbhl_cache.$const14$isa, type, instance);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject idx_$114 = idx;
                if (sbhl_cache.NIL == id_index.id_index_sparse_objects_empty_p(idx_$114)) {
                    final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$114);
                    SubLObject id2 = (SubLObject)sbhl_cache.NIL;
                    SubLObject nodes2 = (SubLObject)sbhl_cache.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            nodes2 = Hashtables.getEntryValue(cdohash_entry);
                            final SubLObject instance2 = nart_handles.find_nart_by_id(id2);
                            if (sbhl_cache.NIL != instance2) {
                                final SubLObject set_contents_var2 = set.do_set_internal(nodes2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject type2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)sbhl_cache.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    type2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state2, type2)) {
                                        add_to_sbhl_cache_for_relevant_mts(sbhl_cache.$const14$isa, type2, instance2);
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
        }
        else {
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_cache)); sbhl_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject type3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject subnodes = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject set_contents_var3 = set.do_set_internal(subnodes);
                SubLObject basis_object3;
                SubLObject state3;
                SubLObject instance3;
                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)sbhl_cache.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                    instance3 = set_contents.do_set_contents_next(basis_object3, state3);
                    if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state3, instance3)) {
                        add_to_sbhl_cache_for_relevant_mts(sbhl_cache.$const14$isa, type3, instance3);
                    }
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 47714L)
    public static SubLObject isa_cache_addition_maintainence(final SubLObject assertion) {
        possibly_add_to_sbhl_caches(assertion, sbhl_cache.$const26$genls, sbhl_cache.$const14$isa);
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 47872L)
    public static SubLObject isa_cache_removal_maintainence(final SubLObject assertion) {
        possibly_remove_from_sbhl_caches(sbhl_cache.$const14$isa, assertion);
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 48000L)
    public static SubLObject reset_cached_isa_relations(final SubLObject node) {
        reset_cached_sbhl_relations_for_node(sbhl_cache.$const14$isa, node, (SubLObject)sbhl_cache.T);
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 48118L)
    public static SubLObject initialize_all_mts_cache_for_quoted_isa() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject set_var = get_cached_nodes_set_for_pred(sbhl_cache.$const19$quotedIsa);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject type;
        SubLObject node_var;
        SubLObject _prev_bind_0;
        SubLObject _prev_bind_2;
        SubLObject node_var_$115;
        SubLObject deck_type;
        SubLObject recur_deck;
        SubLObject _prev_bind_0_$116;
        SubLObject tv_var;
        SubLObject _prev_bind_0_$117;
        SubLObject _prev_bind_1_$118;
        SubLObject pcase_var;
        SubLObject _prev_bind_0_$118;
        SubLObject _prev_bind_1_$119;
        SubLObject _prev_bind_3;
        SubLObject _prev_bind_4;
        SubLObject _prev_bind_5;
        SubLObject _prev_bind_0_$119;
        SubLObject _prev_bind_1_$120;
        SubLObject _prev_bind_2_$123;
        SubLObject tt_node_var;
        SubLObject cdolist_list_var;
        SubLObject accessible_modules;
        SubLObject module_var;
        SubLObject _prev_bind_0_$120;
        SubLObject _prev_bind_1_$121;
        SubLObject node;
        SubLObject d_link;
        SubLObject mt_links;
        SubLObject iteration_state;
        SubLObject mt;
        SubLObject tv_links;
        SubLObject _prev_bind_0_$121;
        SubLObject iteration_state_$127;
        SubLObject tv;
        SubLObject link_nodes;
        SubLObject _prev_bind_0_$122;
        SubLObject sol;
        SubLObject set_contents_var_$129;
        SubLObject basis_object_$130;
        SubLObject state_$131;
        SubLObject instance;
        SubLObject csome_list_var;
        SubLObject instance2;
        SubLObject csome_list_var2;
        SubLObject instance_tuple;
        SubLObject current;
        SubLObject datum;
        SubLObject link_node;
        SubLObject mt2;
        SubLObject tv2;
        SubLObject _prev_bind_0_$123;
        SubLObject _prev_bind_0_$124;
        SubLObject link_nodes2;
        SubLObject set_contents_var_$130;
        SubLObject basis_object_$131;
        SubLObject state_$132;
        SubLObject csome_list_var_$137;
        SubLObject cdolist_list_var_$138;
        SubLObject new_list;
        SubLObject generating_fn;
        SubLObject _prev_bind_0_$125;
        SubLObject sol2;
        SubLObject link_nodes3;
        SubLObject set_contents_var_$131;
        SubLObject basis_object_$132;
        SubLObject state_$133;
        SubLObject instance3;
        SubLObject csome_list_var3;
        SubLObject instance4;
        SubLObject cdolist_list_var2;
        SubLObject accessible_modules2;
        SubLObject module_var2;
        SubLObject _prev_bind_0_$126;
        SubLObject _prev_bind_1_$122;
        SubLObject node2;
        SubLObject d_link2;
        SubLObject mt_links2;
        SubLObject iteration_state2;
        SubLObject mt3;
        SubLObject tv_links2;
        SubLObject _prev_bind_0_$127;
        SubLObject iteration_state_$128;
        SubLObject link_nodes4;
        SubLObject _prev_bind_0_$128;
        SubLObject sol3;
        SubLObject set_contents_var_$132;
        SubLObject basis_object_$133;
        SubLObject state_$134;
        SubLObject node_vars_link_node;
        SubLObject csome_list_var4;
        SubLObject node_vars_link_node2;
        SubLObject cdolist_list_var_$139;
        SubLObject new_list2;
        SubLObject generating_fn2;
        SubLObject _prev_bind_0_$129;
        SubLObject sol4;
        SubLObject link_nodes5;
        SubLObject set_contents_var_$133;
        SubLObject basis_object_$134;
        SubLObject state_$135;
        SubLObject node_vars_link_node3;
        SubLObject csome_list_var5;
        SubLObject node_vars_link_node4;
        SubLObject _prev_bind_0_$130;
        SubLObject _values;
        SubLObject _prev_bind_0_$131;
        SubLObject _values2;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            type = set_contents.do_set_contents_next(basis_object, state);
            if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state, type)) {
                node_var = type;
                _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(sbhl_cache.$const19$quotedIsa), thread);
                    sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        node_var_$115 = node_var;
                        deck_type = (SubLObject)sbhl_cache.$kw78$STACK;
                        recur_deck = deck.create_deck(deck_type);
                        _prev_bind_0_$116 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                tv_var = (SubLObject)sbhl_cache.NIL;
                                _prev_bind_0_$117 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                _prev_bind_1_$118 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind((sbhl_cache.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((sbhl_cache.NIL != tv_var) ? sbhl_cache.$sym80$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                    if (sbhl_cache.NIL != tv_var && sbhl_cache.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_cache.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                        pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql((SubLObject)sbhl_cache.$kw81$ERROR)) {
                                            sbhl_paranoia.sbhl_error((SubLObject)sbhl_cache.ONE_INTEGER, (SubLObject)sbhl_cache.$str82$_A_is_not_a__A, tv_var, (SubLObject)sbhl_cache.$sym83$SBHL_TRUE_TV_P, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED);
                                        }
                                        else if (pcase_var.eql((SubLObject)sbhl_cache.$kw84$CERROR)) {
                                            sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_cache.ONE_INTEGER, (SubLObject)sbhl_cache.$str85$continue_anyway, (SubLObject)sbhl_cache.$str82$_A_is_not_a__A, tv_var, (SubLObject)sbhl_cache.$sym83$SBHL_TRUE_TV_P, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED);
                                        }
                                        else if (pcase_var.eql((SubLObject)sbhl_cache.$kw86$WARN)) {
                                            Errors.warn((SubLObject)sbhl_cache.$str82$_A_is_not_a__A, tv_var, (SubLObject)sbhl_cache.$sym83$SBHL_TRUE_TV_P);
                                        }
                                        else {
                                            Errors.warn((SubLObject)sbhl_cache.$str87$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror((SubLObject)sbhl_cache.$str85$continue_anyway, (SubLObject)sbhl_cache.$str82$_A_is_not_a__A, tv_var, (SubLObject)sbhl_cache.$sym83$SBHL_TRUE_TV_P);
                                        }
                                    }
                                    _prev_bind_0_$118 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    _prev_bind_1_$119 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(sbhl_cache.$const19$quotedIsa)), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(sbhl_cache.$const19$quotedIsa))), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(sbhl_cache.$const19$quotedIsa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)sbhl_cache.NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(sbhl_cache.$const19$quotedIsa)), thread);
                                        if (sbhl_cache.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || sbhl_cache.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED))) {
                                            _prev_bind_0_$119 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            _prev_bind_1_$120 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            _prev_bind_2_$123 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(sbhl_cache.$const19$quotedIsa))), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)sbhl_cache.NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$115, (SubLObject)sbhl_cache.UNPROVIDED);
                                                while (sbhl_cache.NIL != node_var_$115) {
                                                    tt_node_var = node_var_$115;
                                                    accessible_modules = (cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(sbhl_cache.$const19$quotedIsa)));
                                                    module_var = (SubLObject)sbhl_cache.NIL;
                                                    module_var = cdolist_list_var.first();
                                                    while (sbhl_cache.NIL != cdolist_list_var) {
                                                        _prev_bind_0_$120 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$121 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((sbhl_cache.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(sbhl_cache.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                            node = function_terms.naut_to_nart(tt_node_var);
                                                            if (sbhl_cache.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED));
                                                                if (sbhl_cache.NIL != d_link) {
                                                                    mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(sbhl_cache.$const19$quotedIsa)), sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED));
                                                                    if (sbhl_cache.NIL != mt_links) {
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); sbhl_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (sbhl_cache.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                _prev_bind_0_$121 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                    for (iteration_state_$127 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); sbhl_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$127); iteration_state_$127 = dictionary_contents.do_dictionary_contents_next(iteration_state_$127)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$127);
                                                                                        link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (sbhl_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            _prev_bind_0_$122 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                sol = link_nodes;
                                                                                                if (sbhl_cache.NIL != set.set_p(sol)) {
                                                                                                    set_contents_var_$129 = set.do_set_internal(sol);
                                                                                                    for (basis_object_$130 = set_contents.do_set_contents_basis_object(set_contents_var_$129), state_$131 = (SubLObject)sbhl_cache.NIL, state_$131 = set_contents.do_set_contents_initial_state(basis_object_$130, set_contents_var_$129); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object_$130, state_$131); state_$131 = set_contents.do_set_contents_update_state(state_$131)) {
                                                                                                        instance = set_contents.do_set_contents_next(basis_object_$130, state_$131);
                                                                                                        if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state_$131, instance) && sbhl_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (sbhl_cache.NIL != forts.fort_p(instance)) {
                                                                                                                add_to_sbhl_all_mts_cache(sbhl_cache.$const19$quotedIsa, type, instance);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (sol.isList()) {
                                                                                                    csome_list_var = sol;
                                                                                                    instance2 = (SubLObject)sbhl_cache.NIL;
                                                                                                    instance2 = csome_list_var.first();
                                                                                                    while (sbhl_cache.NIL != csome_list_var) {
                                                                                                        if (sbhl_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (sbhl_cache.NIL != forts.fort_p(instance2)) {
                                                                                                                add_to_sbhl_all_mts_cache(sbhl_cache.$const19$quotedIsa, type, instance2);
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        instance2 = csome_list_var.first();
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)sbhl_cache.$str88$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$122, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$127);
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$121, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                }
                                                                else {
                                                                    sbhl_paranoia.sbhl_error((SubLObject)sbhl_cache.FIVE_INTEGER, (SubLObject)sbhl_cache.$str89$attempting_to_bind_direction_link, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED);
                                                                }
                                                                if (sbhl_cache.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED))) {
                                                                    csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                    instance_tuple = (SubLObject)sbhl_cache.NIL;
                                                                    instance_tuple = csome_list_var2.first();
                                                                    while (sbhl_cache.NIL != csome_list_var2) {
                                                                        datum = (current = instance_tuple);
                                                                        link_node = (SubLObject)sbhl_cache.NIL;
                                                                        mt2 = (SubLObject)sbhl_cache.NIL;
                                                                        tv2 = (SubLObject)sbhl_cache.NIL;
                                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_cache.$list98);
                                                                        link_node = current.first();
                                                                        current = current.rest();
                                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_cache.$list98);
                                                                        mt2 = current.first();
                                                                        current = current.rest();
                                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_cache.$list98);
                                                                        tv2 = current.first();
                                                                        current = current.rest();
                                                                        if (sbhl_cache.NIL == current) {
                                                                            if (sbhl_cache.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                                _prev_bind_0_$123 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                    if (sbhl_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        _prev_bind_0_$124 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            link_nodes2 = (sol = (SubLObject)ConsesLow.list(link_node));
                                                                                            if (sbhl_cache.NIL != set.set_p(sol)) {
                                                                                                set_contents_var_$130 = set.do_set_internal(sol);
                                                                                                for (basis_object_$131 = set_contents.do_set_contents_basis_object(set_contents_var_$130), state_$132 = (SubLObject)sbhl_cache.NIL, state_$132 = set_contents.do_set_contents_initial_state(basis_object_$131, set_contents_var_$130); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object_$131, state_$132); state_$132 = set_contents.do_set_contents_update_state(state_$132)) {
                                                                                                    instance = set_contents.do_set_contents_next(basis_object_$131, state_$132);
                                                                                                    if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state_$132, instance) && sbhl_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (sbhl_cache.NIL != forts.fort_p(instance)) {
                                                                                                            add_to_sbhl_all_mts_cache(sbhl_cache.$const19$quotedIsa, type, instance);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                csome_list_var_$137 = sol;
                                                                                                instance2 = (SubLObject)sbhl_cache.NIL;
                                                                                                instance2 = csome_list_var_$137.first();
                                                                                                while (sbhl_cache.NIL != csome_list_var_$137) {
                                                                                                    if (sbhl_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (sbhl_cache.NIL != forts.fort_p(instance2)) {
                                                                                                            add_to_sbhl_all_mts_cache(sbhl_cache.$const19$quotedIsa, type, instance2);
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var_$137 = csome_list_var_$137.rest();
                                                                                                    instance2 = csome_list_var_$137.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)sbhl_cache.$str88$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$124, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$123, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        else {
                                                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_cache.$list98);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        instance_tuple = csome_list_var2.first();
                                                                    }
                                                                }
                                                            }
                                                            else if (sbhl_cache.NIL != obsolete.cnat_p(node, (SubLObject)sbhl_cache.UNPROVIDED)) {
                                                                new_list = (cdolist_list_var_$138 = ((sbhl_cache.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(sbhl_cache.$const19$quotedIsa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(sbhl_cache.$const19$quotedIsa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED))));
                                                                generating_fn = (SubLObject)sbhl_cache.NIL;
                                                                generating_fn = cdolist_list_var_$138.first();
                                                                while (sbhl_cache.NIL != cdolist_list_var_$138) {
                                                                    _prev_bind_0_$125 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        link_nodes3 = (sol2 = Functions.funcall(generating_fn, node));
                                                                        if (sbhl_cache.NIL != set.set_p(sol2)) {
                                                                            set_contents_var_$131 = set.do_set_internal(sol2);
                                                                            for (basis_object_$132 = set_contents.do_set_contents_basis_object(set_contents_var_$131), state_$133 = (SubLObject)sbhl_cache.NIL, state_$133 = set_contents.do_set_contents_initial_state(basis_object_$132, set_contents_var_$131); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object_$132, state_$133); state_$133 = set_contents.do_set_contents_update_state(state_$133)) {
                                                                                instance3 = set_contents.do_set_contents_next(basis_object_$132, state_$133);
                                                                                if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state_$133, instance3) && sbhl_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if (sbhl_cache.NIL != forts.fort_p(instance3)) {
                                                                                        add_to_sbhl_all_mts_cache(sbhl_cache.$const19$quotedIsa, type, instance3);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (sol2.isList()) {
                                                                            csome_list_var3 = sol2;
                                                                            instance4 = (SubLObject)sbhl_cache.NIL;
                                                                            instance4 = csome_list_var3.first();
                                                                            while (sbhl_cache.NIL != csome_list_var3) {
                                                                                if (sbhl_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if (sbhl_cache.NIL != forts.fort_p(instance4)) {
                                                                                        add_to_sbhl_all_mts_cache(sbhl_cache.$const19$quotedIsa, type, instance4);
                                                                                    }
                                                                                }
                                                                                csome_list_var3 = csome_list_var3.rest();
                                                                                instance4 = csome_list_var3.first();
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)sbhl_cache.$str88$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$125, thread);
                                                                    }
                                                                    cdolist_list_var_$138 = cdolist_list_var_$138.rest();
                                                                    generating_fn = cdolist_list_var_$138.first();
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$121, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$120, thread);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        module_var = cdolist_list_var.first();
                                                    }
                                                    accessible_modules2 = (cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(sbhl_cache.$const19$quotedIsa))));
                                                    module_var2 = (SubLObject)sbhl_cache.NIL;
                                                    module_var2 = cdolist_list_var2.first();
                                                    while (sbhl_cache.NIL != cdolist_list_var2) {
                                                        _prev_bind_0_$126 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$122 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((sbhl_cache.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(sbhl_cache.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                            node2 = function_terms.naut_to_nart(node_var_$115);
                                                            if (sbhl_cache.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED));
                                                                if (sbhl_cache.NIL != d_link2) {
                                                                    mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED));
                                                                    if (sbhl_cache.NIL != mt_links2) {
                                                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); sbhl_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                            thread.resetMultipleValues();
                                                                            mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                            tv_links2 = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (sbhl_cache.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                                _prev_bind_0_$127 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                    for (iteration_state_$128 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); sbhl_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$128); iteration_state_$128 = dictionary_contents.do_dictionary_contents_next(iteration_state_$128)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$128);
                                                                                        link_nodes4 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (sbhl_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                            _prev_bind_0_$128 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                sol3 = link_nodes4;
                                                                                                if (sbhl_cache.NIL != set.set_p(sol3)) {
                                                                                                    set_contents_var_$132 = set.do_set_internal(sol3);
                                                                                                    for (basis_object_$133 = set_contents.do_set_contents_basis_object(set_contents_var_$132), state_$134 = (SubLObject)sbhl_cache.NIL, state_$134 = set_contents.do_set_contents_initial_state(basis_object_$133, set_contents_var_$132); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object_$133, state_$134); state_$134 = set_contents.do_set_contents_update_state(state_$134)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object_$133, state_$134);
                                                                                                        if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state_$134, node_vars_link_node) && sbhl_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)sbhl_cache.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)sbhl_cache.UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (sol3.isList()) {
                                                                                                    csome_list_var4 = sol3;
                                                                                                    node_vars_link_node2 = (SubLObject)sbhl_cache.NIL;
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                    while (sbhl_cache.NIL != csome_list_var4) {
                                                                                                        if (sbhl_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)sbhl_cache.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)sbhl_cache.UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var4 = csome_list_var4.rest();
                                                                                                        node_vars_link_node2 = csome_list_var4.first();
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)sbhl_cache.$str88$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$128, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$128);
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$127, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                    }
                                                                }
                                                                else {
                                                                    sbhl_paranoia.sbhl_error((SubLObject)sbhl_cache.FIVE_INTEGER, (SubLObject)sbhl_cache.$str89$attempting_to_bind_direction_link, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED);
                                                                }
                                                            }
                                                            else if (sbhl_cache.NIL != obsolete.cnat_p(node2, (SubLObject)sbhl_cache.UNPROVIDED)) {
                                                                new_list2 = (cdolist_list_var_$139 = ((sbhl_cache.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED))));
                                                                generating_fn2 = (SubLObject)sbhl_cache.NIL;
                                                                generating_fn2 = cdolist_list_var_$139.first();
                                                                while (sbhl_cache.NIL != cdolist_list_var_$139) {
                                                                    _prev_bind_0_$129 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                        link_nodes5 = (sol4 = Functions.funcall(generating_fn2, node2));
                                                                        if (sbhl_cache.NIL != set.set_p(sol4)) {
                                                                            set_contents_var_$133 = set.do_set_internal(sol4);
                                                                            for (basis_object_$134 = set_contents.do_set_contents_basis_object(set_contents_var_$133), state_$135 = (SubLObject)sbhl_cache.NIL, state_$135 = set_contents.do_set_contents_initial_state(basis_object_$134, set_contents_var_$133); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object_$134, state_$135); state_$135 = set_contents.do_set_contents_update_state(state_$135)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object_$134, state_$135);
                                                                                if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state_$135, node_vars_link_node3) && sbhl_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)sbhl_cache.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)sbhl_cache.UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (sol4.isList()) {
                                                                            csome_list_var5 = sol4;
                                                                            node_vars_link_node4 = (SubLObject)sbhl_cache.NIL;
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                            while (sbhl_cache.NIL != csome_list_var5) {
                                                                                if (sbhl_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)sbhl_cache.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)sbhl_cache.UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var5 = csome_list_var5.rest();
                                                                                node_vars_link_node4 = csome_list_var5.first();
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)sbhl_cache.$str88$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$129, thread);
                                                                    }
                                                                    cdolist_list_var_$139 = cdolist_list_var_$139.rest();
                                                                    generating_fn2 = cdolist_list_var_$139.first();
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$122, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$126, thread);
                                                        }
                                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                                        module_var2 = cdolist_list_var2.first();
                                                    }
                                                    node_var_$115 = deck.deck_pop(recur_deck);
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$123, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$120, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$119, thread);
                                            }
                                        }
                                        else {
                                            sbhl_paranoia.sbhl_warn((SubLObject)sbhl_cache.TWO_INTEGER, (SubLObject)sbhl_cache.$str90$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_cache.UNPROVIDED)), (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED, (SubLObject)sbhl_cache.UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$119, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$118, thread);
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$118, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$117, thread);
                                }
                            }
                            finally {
                                _prev_bind_0_$130 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sbhl_cache.T, thread);
                                    _values = Values.getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$130, thread);
                                }
                            }
                        }
                        finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$116, thread);
                        }
                    }
                    finally {
                        _prev_bind_0_$131 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sbhl_cache.T, thread);
                            _values2 = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$131, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 48412L)
    public static SubLObject compute_cached_quoted_isas_from_all_mts_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_cache = get_sbhl_all_mts_cache_for_pred(sbhl_cache.$const19$quotedIsa);
        if (sbhl_cache.NIL != forts.fort_id_index_p(v_cache)) {
            final SubLObject fii = v_cache;
            SubLObject idx = forts.do_fii_get_constants(fii);
            if (sbhl_cache.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)sbhl_cache.$kw91$SKIP)) {
                final SubLObject idx_$158 = idx;
                if (sbhl_cache.NIL == id_index.id_index_dense_objects_empty_p(idx_$158, (SubLObject)sbhl_cache.$kw91$SKIP)) {
                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$158);
                    final SubLObject backwardP_var = (SubLObject)sbhl_cache.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject nodes;
                    SubLObject instance;
                    SubLObject set_contents_var;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject type;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)sbhl_cache.NIL, v_iteration = (SubLObject)sbhl_cache.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)sbhl_cache.ONE_INTEGER)) {
                        id = ((sbhl_cache.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)sbhl_cache.ONE_INTEGER) : v_iteration);
                        nodes = Vectors.aref(vector_var, id);
                        if (sbhl_cache.NIL == id_index.id_index_tombstone_p(nodes) || sbhl_cache.NIL == id_index.id_index_skip_tombstones_p((SubLObject)sbhl_cache.$kw91$SKIP)) {
                            if (sbhl_cache.NIL != id_index.id_index_tombstone_p(nodes)) {
                                nodes = (SubLObject)sbhl_cache.$kw91$SKIP;
                            }
                            instance = constants_high.find_constant_by_internal_id(id);
                            if (sbhl_cache.NIL != instance) {
                                set_contents_var = set.do_set_internal(nodes);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    type = set_contents.do_set_contents_next(basis_object, state);
                                    if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state, type)) {
                                        add_to_sbhl_cache_for_relevant_mts(sbhl_cache.$const19$quotedIsa, type, instance);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject idx_$159 = idx;
                if (sbhl_cache.NIL == id_index.id_index_sparse_objects_empty_p(idx_$159)) {
                    final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$159);
                    SubLObject id2 = (SubLObject)sbhl_cache.NIL;
                    SubLObject nodes2 = (SubLObject)sbhl_cache.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            nodes2 = Hashtables.getEntryValue(cdohash_entry);
                            final SubLObject instance2 = constants_high.find_constant_by_internal_id(id2);
                            if (sbhl_cache.NIL != instance2) {
                                final SubLObject set_contents_var2 = set.do_set_internal(nodes2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject type2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)sbhl_cache.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    type2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state2, type2)) {
                                        add_to_sbhl_cache_for_relevant_mts(sbhl_cache.$const19$quotedIsa, type2, instance2);
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            idx = forts.do_fii_get_narts(fii);
            if (sbhl_cache.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)sbhl_cache.$kw91$SKIP)) {
                final SubLObject idx_$160 = idx;
                if (sbhl_cache.NIL == id_index.id_index_dense_objects_empty_p(idx_$160, (SubLObject)sbhl_cache.$kw91$SKIP)) {
                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$160);
                    final SubLObject backwardP_var = (SubLObject)sbhl_cache.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject nodes;
                    SubLObject instance;
                    SubLObject set_contents_var;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject type;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)sbhl_cache.NIL, v_iteration = (SubLObject)sbhl_cache.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)sbhl_cache.ONE_INTEGER)) {
                        id = ((sbhl_cache.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)sbhl_cache.ONE_INTEGER) : v_iteration);
                        nodes = Vectors.aref(vector_var, id);
                        if (sbhl_cache.NIL == id_index.id_index_tombstone_p(nodes) || sbhl_cache.NIL == id_index.id_index_skip_tombstones_p((SubLObject)sbhl_cache.$kw91$SKIP)) {
                            if (sbhl_cache.NIL != id_index.id_index_tombstone_p(nodes)) {
                                nodes = (SubLObject)sbhl_cache.$kw91$SKIP;
                            }
                            instance = nart_handles.find_nart_by_id(id);
                            if (sbhl_cache.NIL != instance) {
                                set_contents_var = set.do_set_internal(nodes);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    type = set_contents.do_set_contents_next(basis_object, state);
                                    if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state, type)) {
                                        add_to_sbhl_cache_for_relevant_mts(sbhl_cache.$const19$quotedIsa, type, instance);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject idx_$161 = idx;
                if (sbhl_cache.NIL == id_index.id_index_sparse_objects_empty_p(idx_$161)) {
                    final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$161);
                    SubLObject id2 = (SubLObject)sbhl_cache.NIL;
                    SubLObject nodes2 = (SubLObject)sbhl_cache.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            nodes2 = Hashtables.getEntryValue(cdohash_entry);
                            final SubLObject instance2 = nart_handles.find_nart_by_id(id2);
                            if (sbhl_cache.NIL != instance2) {
                                final SubLObject set_contents_var2 = set.do_set_internal(nodes2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject type2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)sbhl_cache.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    type2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state2, type2)) {
                                        add_to_sbhl_cache_for_relevant_mts(sbhl_cache.$const19$quotedIsa, type2, instance2);
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
        }
        else {
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_cache)); sbhl_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject type3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject subnodes = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject set_contents_var3 = set.do_set_internal(subnodes);
                SubLObject basis_object3;
                SubLObject state3;
                SubLObject instance3;
                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)sbhl_cache.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); sbhl_cache.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                    instance3 = set_contents.do_set_contents_next(basis_object3, state3);
                    if (sbhl_cache.NIL != set_contents.do_set_contents_element_validP(state3, instance3)) {
                        add_to_sbhl_cache_for_relevant_mts(sbhl_cache.$const19$quotedIsa, type3, instance3);
                    }
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 48623L)
    public static SubLObject quoted_isa_cache_addition_maintainence(final SubLObject assertion) {
        possibly_add_to_sbhl_caches(assertion, sbhl_cache.$const26$genls, sbhl_cache.$const19$quotedIsa);
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 48794L)
    public static SubLObject quoted_isa_cache_removal_maintainence(final SubLObject assertion) {
        possibly_remove_from_sbhl_caches(sbhl_cache.$const19$quotedIsa, assertion);
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 48935L)
    public static SubLObject reset_cached_quoted_isa_relations(final SubLObject node) {
        reset_cached_sbhl_relations_for_node(sbhl_cache.$const19$quotedIsa, node, (SubLObject)sbhl_cache.T);
        return (SubLObject)sbhl_cache.NIL;
    }
    
    public static SubLObject declare_sbhl_cache_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "note_sbhl_caches_initialized", "NOTE-SBHL-CACHES-INITIALIZED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "sbhl_caches_initialized_p", "SBHL-CACHES-INITIALIZED-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "sbhl_cache_add_new_additional_fort_typing_collection", "SBHL-CACHE-ADD-NEW-ADDITIONAL-FORT-TYPING-COLLECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "all_fort_types", "ALL-FORT-TYPES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "valid_fort_typeP", "VALID-FORT-TYPE?", 1, 0, false);
        new $valid_fort_typeP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "sbhl_cache_add_new_additional_fort_typing_collection_quoted", "SBHL-CACHE-ADD-NEW-ADDITIONAL-FORT-TYPING-COLLECTION-QUOTED", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "do_sbhl_cached_subsumption_nodes", "DO-SBHL-CACHED-SUBSUMPTION-NODES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "cached_nodeP", "CACHED-NODE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "sbhl_id_index_lookup", "SBHL-ID-INDEX-LOOKUP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "get_cached_nodes_set_for_pred", "GET-CACHED-NODES-SET-FOR-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "get_sbhl_cached_nodes_for_pred", "GET-SBHL-CACHED-NODES-FOR-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "valid_cached_predicate_p", "VALID-CACHED-PREDICATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "valid_cached_fort_type_p", "VALID-CACHED-FORT-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "valid_cached_genl_p", "VALID-CACHED-GENL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "sbhl_pred_has_caching_p", "SBHL-PRED-HAS-CACHING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "print_sbhl_cache_misses_top_n", "PRINT-SBHL-CACHE-MISSES-TOP-N", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "sbhl_cache_use_possible_p", "SBHL-CACHE-USE-POSSIBLE-P", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "sbhl_cache_use_possible_for_nodes_p", "SBHL-CACHE-USE-POSSIBLE-FOR-NODES-P", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "sbhl_cached_predicate_relation_p", "SBHL-CACHED-PREDICATE-RELATION-P", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "sbhl_cached_relations_for_node", "SBHL-CACHED-RELATIONS-FOR-NODE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "sbhl_all_subnodes_for_cached_node", "SBHL-ALL-SUBNODES-FOR-CACHED-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "sbhl_cached_relation_p", "SBHL-CACHED-RELATION-P", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "sbhl_cached_relations", "SBHL-CACHED-RELATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "get_sbhl_cache_for_pred", "GET-SBHL-CACHE-FOR-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "get_sbhl_cache_for_pred_int", "GET-SBHL-CACHE-FOR-PRED-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "get_mts_for_cached_sbhl_relation", "GET-MTS-FOR-CACHED-SBHL-RELATION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "cached_relation_p", "CACHED-RELATION-P", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "do_sbhl_cached_relations_for_node", "DO-SBHL-CACHED-RELATIONS-FOR-NODE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "cached_relations_for_node", "CACHED-RELATIONS-FOR-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "cached_relation_in_cache_p", "CACHED-RELATION-IN-CACHE-P", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "sbhl_pred_all_mts_cache_uses_id_index_p", "SBHL-PRED-ALL-MTS-CACHE-USES-ID-INDEX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "sbhl_finalize_all_mts_cache", "SBHL-FINALIZE-ALL-MTS-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "get_sbhl_all_mts_cache_for_pred", "GET-SBHL-ALL-MTS-CACHE-FOR-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "get_sbhl_all_mts_cache_for_pred_int", "GET-SBHL-ALL-MTS-CACHE-FOR-PRED-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "possibly_initialize_sbhl_caches_for_pred", "POSSIBLY-INITIALIZE-SBHL-CACHES-FOR-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "initialize_sbhl_caches_for_pred", "INITIALIZE-SBHL-CACHES-FOR-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "possibly_initialize_sbhl_caches_for_pred_and_node", "POSSIBLY-INITIALIZE-SBHL-CACHES-FOR-PRED-AND-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "initialize_sbhl_caches_for_pred_and_node", "INITIALIZE-SBHL-CACHES-FOR-PRED-AND-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "cached_all_mts_relation_p", "CACHED-ALL-MTS-RELATION-P", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "cached_all_mts_relations_for_node", "CACHED-ALL-MTS-RELATIONS-FOR-NODE", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "do_sbhl_cached_all_mts_relations", "DO-SBHL-CACHED-ALL-MTS-RELATIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "do_sbhl_cached_link_nodes_for_node_in_mt", "DO-SBHL-CACHED-LINK-NODES-FOR-NODE-IN-MT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "do_sbhl_cached_all_mts_relations_for_node", "DO-SBHL-CACHED-ALL-MTS-RELATIONS-FOR-NODE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "initialize_sbhl_caches", "INITIALIZE-SBHL-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "reset_sbhl_cache_for_pred", "RESET-SBHL-CACHE-FOR-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "initialize_all_mts_sbhl_caches", "INITIALIZE-ALL-MTS-SBHL-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "reset_sbhl_all_mts_cache_for_pred", "RESET-SBHL-ALL-MTS-CACHE-FOR-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "new_sbhl_cache", "NEW-SBHL-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "new_sbhl_sub_cache", "NEW-SBHL-SUB-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "initialize_implicit_fort_type_mapping", "INITIALIZE-IMPLICIT-FORT-TYPE-MAPPING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "initialize_all_sbhl_caching", "INITIALIZE-ALL-SBHL-CACHING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "initialize_all_mts_caching_for_pred", "INITIALIZE-ALL-MTS-CACHING-FOR-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "compute_sbhl_cache_from_all_mts_cache", "COMPUTE-SBHL-CACHE-FROM-ALL-MTS-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "extend_sbhl_caches", "EXTEND-SBHL-CACHES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "add_to_sbhl_cache", "ADD-TO-SBHL-CACHE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "add_to_sbhl_cache_for_relevant_mts", "ADD-TO-SBHL-CACHE-FOR-RELEVANT-MTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "add_to_sbhl_all_mts_cache", "ADD-TO-SBHL-ALL-MTS-CACHE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "sbhl_cache_addition_maintainence", "SBHL-CACHE-ADDITION-MAINTAINENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "possibly_add_to_sbhl_caches", "POSSIBLY-ADD-TO-SBHL-CACHES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "retract_cached_relation", "RETRACT-CACHED-RELATION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "retract_from_sbhl_cache", "RETRACT-FROM-SBHL-CACHE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "retract_from_sbhl_all_mts_cache", "RETRACT-FROM-SBHL-ALL-MTS-CACHE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "sbhl_cache_removal_maintainence", "SBHL-CACHE-REMOVAL-MAINTAINENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "possibly_remove_from_sbhl_caches", "POSSIBLY-REMOVE-FROM-SBHL-CACHES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "recache_sbhl_cachesP", "RECACHE-SBHL-CACHES?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "already_in_sbhl_caches_p", "ALREADY-IN-SBHL-CACHES-P", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "sbhl_predicate_relation_to_which_cached_nodes", "SBHL-PREDICATE-RELATION-TO-WHICH-CACHED-NODES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "sbhl_predicate_relation_to_which_cached_nodes_excluding_link_node", "SBHL-PREDICATE-RELATION-TO-WHICH-CACHED-NODES-EXCLUDING-LINK-NODE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "clear_sbhl_cached_all_mts_relations_for_node", "CLEAR-SBHL-CACHED-ALL-MTS-RELATIONS-FOR-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "clear_sbhl_cached_relations_for_node", "CLEAR-SBHL-CACHED-RELATIONS-FOR-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "reset_cached_sbhl_relations_for_node", "RESET-CACHED-SBHL-RELATIONS-FOR-NODE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "initialize_all_mts_cache_for_genl_preds_and_inverse", "INITIALIZE-ALL-MTS-CACHE-FOR-GENL-PREDS-AND-INVERSE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "compute_cached_predicates_from_all_mts_cache", "COMPUTE-CACHED-PREDICATES-FROM-ALL-MTS-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "compute_cached_inverses_from_all_mts_cache", "COMPUTE-CACHED-INVERSES-FROM-ALL-MTS-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "sbhl_genl_preds_cache_addition_maintainence", "SBHL-GENL-PREDS-CACHE-ADDITION-MAINTAINENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "sbhl_genl_preds_cache_removal_maintainence", "SBHL-GENL-PREDS-CACHE-REMOVAL-MAINTAINENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "reset_cached_spec_preds_and_spec_inverses", "RESET-CACHED-SPEC-PREDS-AND-SPEC-INVERSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "reset_cached_genl_pred_and_inverse_relations", "RESET-CACHED-GENL-PRED-AND-INVERSE-RELATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "initialize_all_mts_cache_for_genls", "INITIALIZE-ALL-MTS-CACHE-FOR-GENLS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "compute_cached_genls_from_all_mts_cache", "COMPUTE-CACHED-GENLS-FROM-ALL-MTS-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "genls_cache_addition_maintainence", "GENLS-CACHE-ADDITION-MAINTAINENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "genls_cache_removal_maintainence", "GENLS-CACHE-REMOVAL-MAINTAINENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "reset_sbhl_types_of_all_instances", "RESET-SBHL-TYPES-OF-ALL-INSTANCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "reset_sbhl_types_of_all_quoted_instances", "RESET-SBHL-TYPES-OF-ALL-QUOTED-INSTANCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "reset_cached_genls_of_all_specs", "RESET-CACHED-GENLS-OF-ALL-SPECS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "reset_cached_genls_relations", "RESET-CACHED-GENLS-RELATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "initialize_all_mts_cache_for_isa", "INITIALIZE-ALL-MTS-CACHE-FOR-ISA", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "compute_cached_isas_from_all_mts_cache", "COMPUTE-CACHED-ISAS-FROM-ALL-MTS-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "isa_cache_addition_maintainence", "ISA-CACHE-ADDITION-MAINTAINENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "isa_cache_removal_maintainence", "ISA-CACHE-REMOVAL-MAINTAINENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "reset_cached_isa_relations", "RESET-CACHED-ISA-RELATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "initialize_all_mts_cache_for_quoted_isa", "INITIALIZE-ALL-MTS-CACHE-FOR-QUOTED-ISA", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "compute_cached_quoted_isas_from_all_mts_cache", "COMPUTE-CACHED-QUOTED-ISAS-FROM-ALL-MTS-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "quoted_isa_cache_addition_maintainence", "QUOTED-ISA-CACHE-ADDITION-MAINTAINENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "quoted_isa_cache_removal_maintainence", "QUOTED-ISA-CACHE-REMOVAL-MAINTAINENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_cache", "reset_cached_quoted_isa_relations", "RESET-CACHED-QUOTED-ISA-RELATIONS", 1, 0, false);
        return (SubLObject)sbhl_cache.NIL;
    }
    
    public static SubLObject init_sbhl_cache_file() {
        sbhl_cache.$sbhl_caches_initializedP$ = SubLFiles.deflexical("*SBHL-CACHES-INITIALIZED?*", (SubLObject)(maybeDefault((SubLObject)sbhl_cache.$sym0$_SBHL_CACHES_INITIALIZED__, sbhl_cache.$sbhl_caches_initializedP$, sbhl_cache.NIL)));
        sbhl_cache.$cached_genl_predicates$ = SubLFiles.deflexical("*CACHED-GENL-PREDICATES*", (SubLObject)sbhl_cache.$list1);
        sbhl_cache.$cached_genl_predicates_set$ = SubLFiles.deflexical("*CACHED-GENL-PREDICATES-SET*", set_utilities.construct_set_from_list(sbhl_cache.$cached_genl_predicates$.getGlobalValue(), Symbols.symbol_function((SubLObject)sbhl_cache.EQL), (SubLObject)sbhl_cache.UNPROVIDED));
        sbhl_cache.$genl_predicate_cache$ = SubLFiles.deflexical("*GENL-PREDICATE-CACHE*", (SubLObject)(maybeDefault((SubLObject)sbhl_cache.$sym2$_GENL_PREDICATE_CACHE_, sbhl_cache.$genl_predicate_cache$, sbhl_cache.NIL)));
        sbhl_cache.$genl_inverse_cache$ = SubLFiles.deflexical("*GENL-INVERSE-CACHE*", (SubLObject)(maybeDefault((SubLObject)sbhl_cache.$sym3$_GENL_INVERSE_CACHE_, sbhl_cache.$genl_inverse_cache$, sbhl_cache.NIL)));
        sbhl_cache.$all_mts_genl_predicate_cache$ = SubLFiles.deflexical("*ALL-MTS-GENL-PREDICATE-CACHE*", (SubLObject)(maybeDefault((SubLObject)sbhl_cache.$sym4$_ALL_MTS_GENL_PREDICATE_CACHE_, sbhl_cache.$all_mts_genl_predicate_cache$, sbhl_cache.NIL)));
        sbhl_cache.$all_mts_genl_inverse_cache$ = SubLFiles.deflexical("*ALL-MTS-GENL-INVERSE-CACHE*", (SubLObject)(maybeDefault((SubLObject)sbhl_cache.$sym5$_ALL_MTS_GENL_INVERSE_CACHE_, sbhl_cache.$all_mts_genl_inverse_cache$, sbhl_cache.NIL)));
        sbhl_cache.$cached_genls$ = SubLFiles.deflexical("*CACHED-GENLS*", (SubLObject)sbhl_cache.$list6);
        sbhl_cache.$cached_genls_set$ = SubLFiles.deflexical("*CACHED-GENLS-SET*", set_utilities.construct_set_from_list(sbhl_cache.$cached_genls$.getGlobalValue(), Symbols.symbol_function((SubLObject)sbhl_cache.EQL), (SubLObject)sbhl_cache.UNPROVIDED));
        sbhl_cache.$genls_cache$ = SubLFiles.deflexical("*GENLS-CACHE*", (SubLObject)(maybeDefault((SubLObject)sbhl_cache.$sym7$_GENLS_CACHE_, sbhl_cache.$genls_cache$, sbhl_cache.NIL)));
        sbhl_cache.$all_mts_genls_cache$ = SubLFiles.deflexical("*ALL-MTS-GENLS-CACHE*", (SubLObject)(maybeDefault((SubLObject)sbhl_cache.$sym8$_ALL_MTS_GENLS_CACHE_, sbhl_cache.$all_mts_genls_cache$, sbhl_cache.NIL)));
        sbhl_cache.$definitional_fort_typing_collections$ = SubLFiles.defconstant("*DEFINITIONAL-FORT-TYPING-COLLECTIONS*", (SubLObject)sbhl_cache.$list9);
        sbhl_cache.$additional_fort_typing_collections$ = SubLFiles.deflexical("*ADDITIONAL-FORT-TYPING-COLLECTIONS*", (SubLObject)sbhl_cache.$list10);
        sbhl_cache.$application_specific_fort_typing_collections$ = SubLFiles.defconstant("*APPLICATION-SPECIFIC-FORT-TYPING-COLLECTIONS*", (SubLObject)sbhl_cache.$list11);
        sbhl_cache.$implicit_fort_typing_collections$ = SubLFiles.deflexical("*IMPLICIT-FORT-TYPING-COLLECTIONS*", (SubLObject)sbhl_cache.$list12);
        sbhl_cache.$cached_isas$ = SubLFiles.deflexical("*CACHED-ISAS*", ConsesLow.append(sbhl_cache.$definitional_fort_typing_collections$.getGlobalValue(), sbhl_cache.$additional_fort_typing_collections$.getGlobalValue(), sbhl_cache.$application_specific_fort_typing_collections$.getGlobalValue(), sbhl_cache.$implicit_fort_typing_collections$.getGlobalValue()));
        sbhl_cache.$cached_isas_set$ = SubLFiles.deflexical("*CACHED-ISAS-SET*", set_utilities.construct_set_from_list(Sequences.reverse(sbhl_cache.$cached_isas$.getGlobalValue()), Symbols.symbol_function((SubLObject)sbhl_cache.EQL), (SubLObject)sbhl_cache.UNPROVIDED));
        sbhl_cache.$isa_cache$ = SubLFiles.deflexical("*ISA-CACHE*", (SubLObject)(maybeDefault((SubLObject)sbhl_cache.$sym15$_ISA_CACHE_, sbhl_cache.$isa_cache$, sbhl_cache.NIL)));
        sbhl_cache.$implicit_fort_type_mapping$ = SubLFiles.deflexical("*IMPLICIT-FORT-TYPE-MAPPING*", (SubLObject)(maybeDefault((SubLObject)sbhl_cache.$sym16$_IMPLICIT_FORT_TYPE_MAPPING_, sbhl_cache.$implicit_fort_type_mapping$, sbhl_cache.NIL)));
        sbhl_cache.$all_mts_isa_cache$ = SubLFiles.deflexical("*ALL-MTS-ISA-CACHE*", (SubLObject)(maybeDefault((SubLObject)sbhl_cache.$sym17$_ALL_MTS_ISA_CACHE_, sbhl_cache.$all_mts_isa_cache$, sbhl_cache.NIL)));
        sbhl_cache.$cached_quoted_isas$ = SubLFiles.deflexical("*CACHED-QUOTED-ISAS*", (SubLObject)sbhl_cache.$list18);
        sbhl_cache.$cached_quoted_isas_set$ = SubLFiles.deflexical("*CACHED-QUOTED-ISAS-SET*", set_utilities.construct_set_from_list(Sequences.reverse(sbhl_cache.$cached_quoted_isas$.getGlobalValue()), Symbols.symbol_function((SubLObject)sbhl_cache.EQL), (SubLObject)sbhl_cache.UNPROVIDED));
        sbhl_cache.$quoted_isa_cache$ = SubLFiles.deflexical("*QUOTED-ISA-CACHE*", (SubLObject)(maybeDefault((SubLObject)sbhl_cache.$sym20$_QUOTED_ISA_CACHE_, sbhl_cache.$quoted_isa_cache$, sbhl_cache.NIL)));
        sbhl_cache.$all_mts_quoted_isa_cache$ = SubLFiles.deflexical("*ALL-MTS-QUOTED-ISA-CACHE*", (SubLObject)(maybeDefault((SubLObject)sbhl_cache.$sym21$_ALL_MTS_QUOTED_ISA_CACHE_, sbhl_cache.$all_mts_quoted_isa_cache$, sbhl_cache.NIL)));
        sbhl_cache.$cached_preds$ = SubLFiles.deflexical("*CACHED-PREDS*", (SubLObject)sbhl_cache.$list22);
        sbhl_cache.$sbhl_cache_misses_hash_table$ = SubLFiles.defvar("*SBHL-CACHE-MISSES-HASH-TABLE*", (SubLObject)sbhl_cache.NIL);
        return (SubLObject)sbhl_cache.NIL;
    }
    
    public static SubLObject setup_sbhl_cache_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_cache.$sym0$_SBHL_CACHES_INITIALIZED__);
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_cache.$sym2$_GENL_PREDICATE_CACHE_);
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_cache.$sym3$_GENL_INVERSE_CACHE_);
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_cache.$sym4$_ALL_MTS_GENL_PREDICATE_CACHE_);
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_cache.$sym5$_ALL_MTS_GENL_INVERSE_CACHE_);
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_cache.$sym7$_GENLS_CACHE_);
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_cache.$sym8$_ALL_MTS_GENLS_CACHE_);
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_cache.$sym15$_ISA_CACHE_);
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_cache.$sym16$_IMPLICIT_FORT_TYPE_MAPPING_);
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_cache.$sym17$_ALL_MTS_ISA_CACHE_);
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_cache.$sym20$_QUOTED_ISA_CACHE_);
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_cache.$sym21$_ALL_MTS_QUOTED_ISA_CACHE_);
        return (SubLObject)sbhl_cache.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sbhl_cache_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sbhl_cache_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sbhl_cache_file();
    }
    
    static {
        me = (SubLFile)new sbhl_cache();
        sbhl_cache.$sbhl_caches_initializedP$ = null;
        sbhl_cache.$cached_genl_predicates$ = null;
        sbhl_cache.$cached_genl_predicates_set$ = null;
        sbhl_cache.$genl_predicate_cache$ = null;
        sbhl_cache.$genl_inverse_cache$ = null;
        sbhl_cache.$all_mts_genl_predicate_cache$ = null;
        sbhl_cache.$all_mts_genl_inverse_cache$ = null;
        sbhl_cache.$cached_genls$ = null;
        sbhl_cache.$cached_genls_set$ = null;
        sbhl_cache.$genls_cache$ = null;
        sbhl_cache.$all_mts_genls_cache$ = null;
        sbhl_cache.$definitional_fort_typing_collections$ = null;
        sbhl_cache.$additional_fort_typing_collections$ = null;
        sbhl_cache.$application_specific_fort_typing_collections$ = null;
        sbhl_cache.$implicit_fort_typing_collections$ = null;
        sbhl_cache.$cached_isas$ = null;
        sbhl_cache.$cached_isas_set$ = null;
        sbhl_cache.$isa_cache$ = null;
        sbhl_cache.$implicit_fort_type_mapping$ = null;
        sbhl_cache.$all_mts_isa_cache$ = null;
        sbhl_cache.$cached_quoted_isas$ = null;
        sbhl_cache.$cached_quoted_isas_set$ = null;
        sbhl_cache.$quoted_isa_cache$ = null;
        sbhl_cache.$all_mts_quoted_isa_cache$ = null;
        sbhl_cache.$cached_preds$ = null;
        sbhl_cache.$sbhl_cache_misses_hash_table$ = null;
        $sym0$_SBHL_CACHES_INITIALIZED__ = SubLObjectFactory.makeSymbol("*SBHL-CACHES-INITIALIZED?*");
        $list1 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("different")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equalSymbols")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksiIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksiUnknownSentence")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subStructures")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectFoundInLocation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("physicalDecompositions")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("properSubEvents")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startsAfterEndingOf")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("elementOf")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("memberOfList")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quantitySubsumes")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("agendaHasTaskWithPriority")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unlikelyValueRangeForGaugeInWell")) });
        $sym2$_GENL_PREDICATE_CACHE_ = SubLObjectFactory.makeSymbol("*GENL-PREDICATE-CACHE*");
        $sym3$_GENL_INVERSE_CACHE_ = SubLObjectFactory.makeSymbol("*GENL-INVERSE-CACHE*");
        $sym4$_ALL_MTS_GENL_PREDICATE_CACHE_ = SubLObjectFactory.makeSymbol("*ALL-MTS-GENL-PREDICATE-CACHE*");
        $sym5$_ALL_MTS_GENL_INVERSE_CACHE_ = SubLObjectFactory.makeSymbol("*ALL-MTS-GENL-INVERSE-CACHE*");
        $list6 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLAssertion")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLExpression")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLExpression-Askable")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLExpression-Assertible")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLFormula")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLIndexedTerm")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLReifiableDenotationalTerm")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLSentence")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLSentence-Askable")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLSentence-Assertible")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLList")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Function-Denotational")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CalendarMonth")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Time-Quantity")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Fraction")) });
        $sym7$_GENLS_CACHE_ = SubLObjectFactory.makeSymbol("*GENLS-CACHE*");
        $sym8$_ALL_MTS_GENLS_CACHE_ = SubLObjectFactory.makeSymbol("*ALL-MTS-GENLS-CACHE*");
        $list9 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Function-Denotational")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory")));
        $list10 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AntiSymmetricBinaryPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AntiTransitiveBinaryPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArgTypeBinaryPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArgTypeTernaryPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AsymmetricBinaryPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BookkeepingPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BroadMicrotheory")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CalendarCoveringType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CommutativeRelation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConventionallyClassifiedTimeIntervalSeries-DisjointWithGaps")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DefaultMonotonicPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DisjointCollectionType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DistributingMetaKnowledgePredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DocumentationPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ELRelation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EvaluatableFunction")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EvaluatablePredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EvaluatableRelation-Contextualized")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExistentialQuantifier")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExistentialQuantifier-Bounded")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IndeterminateTermDenotingFunction")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferenceRelatedBookkeepingPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IrreflexiveBinaryPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LogicalConnective")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MicrotheoryDesignatingRelation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PartiallyCommutativePredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PartiallyCommutativeRelation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProblemSolvingCntxt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Quantifier")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReflexiveBinaryPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReifiableFunction")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RuleMacroPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ScopingRelation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SiblingDisjointCollectionType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SkolemFunction")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SymmetricBinaryPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TransitiveBinaryPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TruthFunction")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnitOfMeasure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnknownScalarInterval")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VariableArityRelation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FirstOrderCollection")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SecondOrderCollection")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThirdOrderCollection")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FourthOrderCollection")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionDenotingFunction")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WFFConstraintPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthOfYearType")) });
        $list11 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLDefinitenessAttribute")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLQuantAttribute")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLSemanticPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperNamePredicate-Strict")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SpeechPart")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLComparisonPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLConstantFunction")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLFunction")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLLogicalConnective")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLQuantifier")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LogicalSchema")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSIContentMicrotheory")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSIExternalTermDenotingFunction")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSISupportedComparisonPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSISupportedConstant")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSISupportedFunction")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StructuredKnowledgeSource")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CytologicalProcessProjectKBContentTestQuery")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SingleInteractionContextEventType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlannedEvent")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InteractionHistoryMicrotheory")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BELLAInteractionHistoryMicrotheory")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstantaneousSimulatedActionType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathematicalExpressionDenotingFunction")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SpreadsheetSKS")) });
        $list12 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Relation")));
        $sym13$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $const14$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $sym15$_ISA_CACHE_ = SubLObjectFactory.makeSymbol("*ISA-CACHE*");
        $sym16$_IMPLICIT_FORT_TYPE_MAPPING_ = SubLObjectFactory.makeSymbol("*IMPLICIT-FORT-TYPE-MAPPING*");
        $sym17$_ALL_MTS_ISA_CACHE_ = SubLObjectFactory.makeSymbol("*ALL-MTS-ISA-CACHE*");
        $list18 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoreUnionConstant")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IndeterminateTerm")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LogicalFieldIndexical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NonSkolemIndeterminateTerm")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhysicalFieldIndexical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TermAcceptableForQuerySearch-TriggerOnly")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TermExemptFromUniqueNamesAssumption")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ObsoleteConstant")));
        $const19$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $sym20$_QUOTED_ISA_CACHE_ = SubLObjectFactory.makeSymbol("*QUOTED-ISA-CACHE*");
        $sym21$_ALL_MTS_QUOTED_ISA_CACHE_ = SubLObjectFactory.makeSymbol("*ALL-MTS-QUOTED-ISA-CACHE*");
        $list22 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")));
        $list23 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym24$DO_SET = SubLObjectFactory.makeSymbol("DO-SET");
        $sym25$GET_CACHED_NODES_SET_FOR_PRED = SubLObjectFactory.makeSymbol("GET-CACHED-NODES-SET-FOR-PRED");
        $const26$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $const27$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $const28$genlInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $str29$_sbhl_cache_misses_hash_table__is = SubLObjectFactory.makeString("*sbhl-cache-misses-hash-table* is not a hash table");
        $str30$_A___S__ = SubLObjectFactory.makeString("~A: ~S~%");
        $sym31$_ = SubLObjectFactory.makeSymbol(">");
        $sym32$SBHL_PREDICATE_P = SubLObjectFactory.makeSymbol("SBHL-PREDICATE-P");
        $list33 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CACHED-NODE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MTS-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SUBNODE"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym34$SUBNODES_VAR = SubLObjectFactory.makeUninternedSymbol("SUBNODES-VAR");
        $sym35$DO_DICTIONARY = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
        $sym36$GET_SBHL_CACHE_FOR_PRED = SubLObjectFactory.makeSymbol("GET-SBHL-CACHE-FOR-PRED");
        $sym37$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym38$DICTIONARY_P = SubLObjectFactory.makeSymbol("DICTIONARY-P");
        $sym39$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym40$DICTIONARY_LOOKUP = SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP");
        $sym41$HLMT_EQUAL = SubLObjectFactory.makeSymbol("HLMT-EQUAL");
        $str42$Initializing_SBHL_cache_for_ = SubLObjectFactory.makeString("Initializing SBHL cache for ");
        $str43$_ = SubLObjectFactory.makeString(".");
        $str44$Adding_ = SubLObjectFactory.makeString("Adding ");
        $str45$_to_SBHL_cache_for_ = SubLObjectFactory.makeString(" to SBHL cache for ");
        $list46 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-NODE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SUBNODE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym47$SUBNODES = SubLObjectFactory.makeUninternedSymbol("SUBNODES");
        $sym48$NODES = SubLObjectFactory.makeUninternedSymbol("NODES");
        $sym49$CACHE = SubLObjectFactory.makeUninternedSymbol("CACHE");
        $sym50$GET_SBHL_ALL_MTS_CACHE_FOR_PRED = SubLObjectFactory.makeSymbol("GET-SBHL-ALL-MTS-CACHE-FOR-PRED");
        $sym51$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym52$FORT_ID_INDEX_P = SubLObjectFactory.makeSymbol("FORT-ID-INDEX-P");
        $sym53$DO_FORT_ID_INDEX = SubLObjectFactory.makeSymbol("DO-FORT-ID-INDEX");
        $list54 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CACHED-LINK-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("SUBNODE"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym55$CACHE = SubLObjectFactory.makeUninternedSymbol("CACHE");
        $sym56$CACHED_NODES_STORE = SubLObjectFactory.makeUninternedSymbol("CACHED-NODES-STORE");
        $sym57$MEMBER_ = SubLObjectFactory.makeSymbol("MEMBER?");
        $list58 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CACHED-LINK-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("SUBNODE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym59$CACHE = SubLObjectFactory.makeUninternedSymbol("CACHE");
        $sym60$SUBNODES = SubLObjectFactory.makeUninternedSymbol("SUBNODES");
        $sym61$SBHL_PRED_ALL_MTS_CACHE_USES_ID_INDEX_P = SubLObjectFactory.makeSymbol("SBHL-PRED-ALL-MTS-CACHE-USES-ID-INDEX-P");
        $sym62$SBHL_ID_INDEX_LOOKUP = SubLObjectFactory.makeSymbol("SBHL-ID-INDEX-LOOKUP");
        $sym63$SET_MEMBER_ = SubLObjectFactory.makeSymbol("SET-MEMBER?");
        $list64 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa")));
        $const65$Relation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Relation"));
        $const66$Predicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate"));
        $const67$Function_Denotational = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Function-Denotational"));
        $const68$LogicalConnective = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LogicalConnective"));
        $const69$Quantifier = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Quantifier"));
        $str70$Computing_all_mts_SBHL_caches_ = SubLObjectFactory.makeString("Computing all-mts SBHL caches.");
        $str71$cdolist = SubLObjectFactory.makeString("cdolist");
        $str72$Computing_SBHL_caches_from_all_mt = SubLObjectFactory.makeString("Computing SBHL caches from all-mts caches.");
        $sym73$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const74$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $kw75$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $const76$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $kw77$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $kw78$STACK = SubLObjectFactory.makeKeyword("STACK");
        $kw79$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $sym80$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw81$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str82$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym83$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw84$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str85$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw86$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str87$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $str88$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str89$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str90$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $kw91$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $str92$genlPreds___genlInverse_after_add = SubLObjectFactory.makeString("genlPreds / genlInverse after adding used for assertion with predicate ~a.");
        $sym93$RESET_CACHED_GENL_PRED_AND_INVERSE_RELATIONS = SubLObjectFactory.makeSymbol("RESET-CACHED-GENL-PRED-AND-INVERSE-RELATIONS");
        $kw94$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $sym95$RESET_CACHED_ISA_RELATIONS = SubLObjectFactory.makeSymbol("RESET-CACHED-ISA-RELATIONS");
        $sym96$RESET_CACHED_QUOTED_ISA_RELATIONS = SubLObjectFactory.makeSymbol("RESET-CACHED-QUOTED-ISA-RELATIONS");
        $sym97$RESET_CACHED_GENLS_RELATIONS = SubLObjectFactory.makeSymbol("RESET-CACHED-GENLS-RELATIONS");
        $list98 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("LINK-NODE"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("MT"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("TV"));
    }
    
    public static final class $valid_fort_typeP$UnaryFunction extends UnaryFunction
    {
        public $valid_fort_typeP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("VALID-FORT-TYPE?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return sbhl_cache.valid_fort_typeP(arg1);
        }
    }
}

/*

	Total time: 3475 ms
	
*/