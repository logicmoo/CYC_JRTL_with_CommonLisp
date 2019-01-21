package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.inference.harness.after_adding;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class tva_cache extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.tva_cache";
    public static final String myFingerPrint = "87dd1772214b797a7bda9866b7990a62e9da4ab8cc809ac32200215bbb3a0065";
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 1003L)
    public static SubLSymbol $use_tva_cacheP$;
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 1133L)
    public static SubLSymbol $update_tva_cacheP$;
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 5829L)
    public static SubLSymbol $dtp_tva_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 7409L)
    public static SubLSymbol $swappable_tva_cache_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 8330L)
    private static SubLSymbol $tva_cache_registry$;
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 12070L)
    public static SubLSymbol $tva_cache_use_memoized_spec_pred_listsP$;
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 12306L)
    private static SubLSymbol $tva_cache_spec_pred_stats$;
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 21864L)
    private static SubLSymbol $tva_cache_assume_supports_are_validP$;
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 24860L)
    private static SubLSymbol $add_tva_cache_value_cached_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 25861L)
    private static SubLSymbol $remove_tva_cache_value_cached_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 27008L)
    private static SubLSymbol $add_tva_cache_key_cached_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 33891L)
    private static SubLSymbol $tva_cache_max_instances_to_cache_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 51124L)
    private static SubLSymbol $cfasl_opcode_tva_cache$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$PRED_CACHES;
    private static final SubLSymbol $sym2$DO_DICTIONARY;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$CDOLIST;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$ENTRY;
    private static final SubLSymbol $sym7$DO_MAP;
    private static final SubLSymbol $sym8$TVA_CACHE_MAP;
    private static final SubLSymbol $sym9$CDESTRUCTURING_BIND;
    private static final SubLSymbol $sym10$POSITIVE_INTEGER_P;
    private static final SubLObject $const11$cacheTransitiveClosureForArgs;
    private static final SubLSymbol $sym12$RELEVANT_MT_IS_ANY_MT;
    private static final SubLObject $const13$InferencePSC;
    private static final SubLString $str14$Initialize_TVA_Caches_____;
    private static final SubLSymbol $kw15$GAF;
    private static final SubLList $list16;
    private static final SubLSymbol $sym17$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str18$Problem_initializing_TVA_CACHE_fo;
    private static final SubLList $list19;
    private static final SubLList $list20;
    private static final SubLSymbol $sym21$TVA_CACHE;
    private static final SubLSymbol $sym22$TVA_CACHE_P;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$PPRINT_TVA_CACHE;
    private static final SubLSymbol $sym28$TVA_CACHE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$TVA_CACHE_PRED;
    private static final SubLSymbol $sym31$_CSETF_TVA_CACHE_PRED;
    private static final SubLSymbol $sym32$TVA_CACHE_INDEX_ARGNUM;
    private static final SubLSymbol $sym33$_CSETF_TVA_CACHE_INDEX_ARGNUM;
    private static final SubLSymbol $sym34$TVA_CACHE_TVA_PRED_GAFS;
    private static final SubLSymbol $sym35$_CSETF_TVA_CACHE_TVA_PRED_GAFS;
    private static final SubLSymbol $sym36$TVA_CACHE_TVAI_PRED_GAFS;
    private static final SubLSymbol $sym37$_CSETF_TVA_CACHE_TVAI_PRED_GAFS;
    private static final SubLSymbol $sym38$_CSETF_TVA_CACHE_MAP;
    private static final SubLSymbol $kw39$PRED;
    private static final SubLSymbol $kw40$INDEX_ARGNUM;
    private static final SubLSymbol $kw41$TVA_PRED_GAFS;
    private static final SubLSymbol $kw42$TVAI_PRED_GAFS;
    private static final SubLSymbol $kw43$MAP;
    private static final SubLString $str44$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw45$BEGIN;
    private static final SubLSymbol $sym46$MAKE_TVA_CACHE;
    private static final SubLSymbol $kw47$SLOT;
    private static final SubLSymbol $kw48$END;
    private static final SubLSymbol $sym49$VISIT_DEFSTRUCT_OBJECT_TVA_CACHE_METHOD;
    private static final SubLSymbol $sym50$SXHASH_TVA_CACHE_METHOD;
    private static final SubLString $str51$__TVA_CACHE__S__S_;
    private static final SubLSymbol $kw52$SWAPPED_OUT;
    private static final SubLSymbol $sym53$_SWAPPABLE_TVA_CACHE_LOCK_;
    private static final SubLString $str54$Swappable_TVA_Cache;
    private static final SubLString $str55$Cannot_reconnect__A__which_is_not;
    private static final SubLSymbol $sym56$_TVA_CACHE_REGISTRY_;
    private static final SubLObject $const57$genlPreds;
    private static final SubLSymbol $kw58$BREADTH;
    private static final SubLSymbol $kw59$DEPTH;
    private static final SubLSymbol $kw60$STACK;
    private static final SubLSymbol $kw61$QUEUE;
    private static final SubLObject $const62$True_JustificationTruth;
    private static final SubLSymbol $sym63$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw64$ERROR;
    private static final SubLString $str65$_A_is_not_a__A;
    private static final SubLSymbol $sym66$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw67$CERROR;
    private static final SubLString $str68$continue_anyway;
    private static final SubLSymbol $kw69$WARN;
    private static final SubLString $str70$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLString $str71$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str72$attempting_to_bind_direction_link;
    private static final SubLString $str73$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLString $str74$Creating_TVA_cache_for_;
    private static final SubLString $str75$__arg_;
    private static final SubLString $str76$_;
    private static final SubLSymbol $sym77$_TVA_CACHE_SPEC_PRED_STATS_;
    private static final SubLList $list78;
    private static final SubLList $list79;
    private static final SubLList $list80;
    private static final SubLSymbol $kw81$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw82$DONE_;
    private static final SubLSymbol $sym83$PIF;
    private static final SubLSymbol $sym84$_TVA_CACHE_USE_MEMOIZED_SPEC_PRED_LISTS__;
    private static final SubLSymbol $sym85$DO_TVA_SUB_CACHES_VIA_MEMOIZED_LISTS;
    private static final SubLSymbol $sym86$DO_TVA_SUB_CACHES_VIA_INDEX_SURFING;
    private static final SubLSymbol $sym87$SPEC_PRED;
    private static final SubLSymbol $sym88$DO_ALL_SPEC_PREDICATES_AND_INVERSES;
    private static final SubLSymbol $sym89$CLET;
    private static final SubLSymbol $sym90$FIF;
    private static final SubLSymbol $sym91$FIND_TVA_SUB_CACHE;
    private static final SubLSymbol $sym92$SPEC_PRED;
    private static final SubLSymbol $sym93$SPEC_PREDS;
    private static final SubLSymbol $sym94$SPEC_INVERSES;
    private static final SubLSymbol $sym95$CMULTIPLE_VALUE_BIND;
    private static final SubLSymbol $sym96$TVA_CACHE_SPEC_PREDS_AND_INVERSES;
    private static final SubLSymbol $sym97$CSOME;
    private static final SubLList $list98;
    private static final SubLList $list99;
    private static final SubLSymbol $sym100$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const101$EverythingPSC;
    private static final SubLSymbol $sym102$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER;
    private static final SubLSymbol $sym103$RELEVANT_MT_IS_GENL_MT;
    private static final SubLInteger $int104$5000;
    private static final SubLSymbol $sym105$_EXIT;
    private static final SubLList $list106;
    private static final SubLList $list107;
    private static final SubLSymbol $sym108$TVA_CACHE_SUPPORT_EQUAL_;
    private static final SubLSymbol $kw109$GENLPREDS;
    private static final SubLSymbol $sym110$WITH_FILE_VECTOR_BACKED_MAP_STREAM_LOCK;
    private static final SubLList $list111;
    private static final SubLSymbol $sym112$TVA_CACHE_LOOKUP_INTERNAL;
    private static final SubLList $list113;
    private static final SubLList $list114;
    private static final SubLList $list115;
    private static final SubLInteger $int116$32768;
    private static final SubLSymbol $sym117$TVA_CACHE_VALID_SUPPORT_;
    private static final SubLList $list118;
    private static final SubLString $str119$No_specified_pred_for__S;
    private static final SubLSymbol $kw120$INVERSE;
    private static final SubLSymbol $kw121$SPEC_PRED;
    private static final SubLSymbol $sym122$ADD_TVA_CACHE_VALUE;
    private static final SubLSymbol $sym123$ADD_TVA_CACHE_VALUE_CACHED;
    private static final SubLList $list124;
    private static final SubLSymbol $sym125$_ADD_TVA_CACHE_VALUE_CACHED_CACHING_STATE_;
    private static final SubLSymbol $sym126$REMOVE_TVA_CACHE_VALUE;
    private static final SubLSymbol $sym127$REMOVE_TVA_CACHE_VALUE_CACHED;
    private static final SubLSymbol $sym128$_REMOVE_TVA_CACHE_VALUE_CACHED_CACHING_STATE_;
    private static final SubLSymbol $sym129$ADD_TVA_CACHE_KEY;
    private static final SubLSymbol $sym130$ADD_TVA_CACHE_KEY_CACHED;
    private static final SubLList $list131;
    private static final SubLList $list132;
    private static final SubLSymbol $sym133$_ADD_TVA_CACHE_KEY_CACHED_CACHING_STATE_;
    private static final SubLSymbol $sym134$REMOVE_TVA_CACHE_KEY;
    private static final SubLList $list135;
    private static final SubLList $list136;
    private static final SubLSymbol $sym137$BINARY_PREDICATE_;
    private static final SubLObject $const138$transitiveViaArg;
    private static final SubLSymbol $kw139$TRUE;
    private static final SubLObject $const140$transitiveViaArgInverse;
    private static final SubLString $str141$Error_initializing__S_____S___Der;
    private static final SubLString $str142$TVA_Caching_;
    private static final SubLString $str143$_;
    private static final SubLString $str144$_assertions___;
    private static final SubLObject $const145$relationAllInstance;
    private static final SubLSymbol $sym146$TVA_CACHE_MAX_INSTANCES_TO_CACHE;
    private static final SubLInteger $int147$25;
    private static final SubLSymbol $sym148$_TVA_CACHE_MAX_INSTANCES_TO_CACHE_CACHING_STATE_;
    private static final SubLObject $const149$isa;
    private static final SubLList $list150;
    private static final SubLObject $const151$relationInstanceAll;
    private static final SubLSymbol $kw152$COMPLEX;
    private static final SubLString $str153$Complex_TVA_cache_support_in__S;
    private static final SubLList $list154;
    private static final SubLList $list155;
    private static final SubLSymbol $sym156$INDEXED_TERM_P;
    private static final SubLSymbol $kw157$TOP;
    private static final SubLSymbol $kw158$TRUE_DEF;
    private static final SubLList $list159;
    private static final SubLSymbol $sym160$PRED;
    private static final SubLString $str161$Don_t_know_how_to_find_the_transi;
    private static final SubLList $list162;
    private static final SubLString $str163$Can_t_get_transitivity_support_fr;
    private static final SubLSymbol $sym164$TVA_CACHE_SUPPORT_GAF;
    private static final SubLList $list165;
    private static final SubLObject $const166$TransitiveBinaryPredicate;
    private static final SubLInteger $int167$96;
    private static final SubLSymbol $sym168$CFASL_INPUT_TVA_CACHE;
    private static final SubLSymbol $sym169$CFASL_OUTPUT_OBJECT_TVA_CACHE_METHOD;
    private static final SubLString $str170$tva_cache_contents;
    private static final SubLString $str171$tva_cache_contents_index;
    private static final SubLList $list172;
    private static final SubLString $str173$Reconnecting_to_legacy_unit_files;
    private static final SubLSymbol $sym174$DUMP_TVA_CACHE_TO_STREAM;
    private static final SubLList $list175;
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 1316L)
    public static SubLObject do_tva_caches(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_cache = (SubLObject)tva_cache.NIL;
        SubLObject bin_pred = (SubLObject)tva_cache.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list0);
        v_cache = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list0);
        bin_pred = current.first();
        current = current.rest();
        if (tva_cache.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject pred_caches = (SubLObject)tva_cache.$sym1$PRED_CACHES;
            return (SubLObject)ConsesLow.list((SubLObject)tva_cache.$sym2$DO_DICTIONARY, (SubLObject)ConsesLow.listS(bin_pred, pred_caches, (SubLObject)tva_cache.$list3), (SubLObject)ConsesLow.listS((SubLObject)tva_cache.$sym4$CDOLIST, (SubLObject)ConsesLow.list(v_cache, pred_caches), ConsesLow.append(body, (SubLObject)tva_cache.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_cache.$list0);
        return (SubLObject)tva_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 1614L)
    public static SubLObject do_tva_cache(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list5);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)tva_cache.NIL;
        SubLObject raw_supported_values = (SubLObject)tva_cache.NIL;
        SubLObject supported_subkeys = (SubLObject)tva_cache.NIL;
        SubLObject v_cache = (SubLObject)tva_cache.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list5);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list5);
        raw_supported_values = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list5);
        supported_subkeys = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list5);
        v_cache = current.first();
        current = current.rest();
        if (tva_cache.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject entry = (SubLObject)tva_cache.$sym6$ENTRY;
            return (SubLObject)ConsesLow.list((SubLObject)tva_cache.$sym7$DO_MAP, (SubLObject)ConsesLow.list(key, entry, (SubLObject)ConsesLow.list((SubLObject)tva_cache.$sym8$TVA_CACHE_MAP, v_cache)), (SubLObject)ConsesLow.listS((SubLObject)tva_cache.$sym9$CDESTRUCTURING_BIND, reader.bq_cons(raw_supported_values, supported_subkeys), entry, ConsesLow.append(body, (SubLObject)tva_cache.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_cache.$list5);
        return (SubLObject)tva_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 2096L)
    public static SubLObject tva_cache_get_values(final SubLObject v_term, final SubLObject predicate, final SubLObject index_argnum, final SubLObject compute_justifications_p) {
        assert tva_cache.NIL != subl_promotions.positive_integer_p(index_argnum) : index_argnum;
        final SubLObject v_cache = tva_cache_for_predicate_and_index_argnum(predicate, index_argnum);
        return (SubLObject)((tva_cache.NIL != tva_cache_p(v_cache)) ? tva_cache_lookup(v_cache, v_term, compute_justifications_p, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED) : tva_cache.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 2632L)
    public static SubLObject tva_cache_check_value(final SubLObject v_term, final SubLObject predicate, final SubLObject index_argnum, final SubLObject target, SubLObject test, SubLObject compute_justifications_p) {
        if (test == tva_cache.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)tva_cache.EQL);
        }
        if (compute_justifications_p == tva_cache.UNPROVIDED) {
            compute_justifications_p = (SubLObject)tva_cache.NIL;
        }
        assert tva_cache.NIL != subl_promotions.positive_integer_p(index_argnum) : index_argnum;
        final SubLObject v_cache = tva_cache_for_predicate_and_index_argnum(predicate, index_argnum);
        return (SubLObject)((tva_cache.NIL != tva_cache_p(v_cache)) ? tva_cache_lookup(v_cache, v_term, compute_justifications_p, target, test) : tva_cache.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 3230L)
    public static SubLObject tva_cache_predicate_index_arg_cached_p(final SubLObject predicate, final SubLObject index_arg) {
        return list_utilities.sublisp_boolean(tva_cache_for_predicate_and_index_argnum(predicate, index_arg));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 3392L)
    public static SubLObject initialize_tva_caches() {
        return initialize_tva_caches_int((SubLObject)tva_cache.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 3475L)
    public static SubLObject initialize_uninitialized_tva_caches() {
        return initialize_tva_caches_int((SubLObject)tva_cache.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 3574L)
    public static SubLObject initialize_tva_caches_int(final SubLObject redo_if_presentP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (tva_cache.NIL != redo_if_presentP) {
            dictionary.clear_dictionary(tva_cache_registry());
        }
        final SubLObject should_maintain_assertion_usage_countsP = assertion_manager.assertion_manager_usage_counts_enabledP();
        try {
            assertion_manager.assertion_manager_dont_maintain_usages_counts();
            final SubLObject pred = tva_cache.$const11$cacheTransitiveClosureForArgs;
            if (tva_cache.NIL != constant_handles.valid_constantP(pred, (SubLObject)tva_cache.UNPROVIDED)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)tva_cache.$sym12$RELEVANT_MT_IS_ANY_MT, thread);
                    mt_relevance_macros.$mt$.bind(tva_cache.$const13$InferencePSC, thread);
                    final SubLObject pred_var = pred;
                    if (tva_cache.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                        final SubLObject str = (SubLObject)tva_cache.$str14$Initialize_TVA_Caches_____;
                        final SubLObject _prev_bind_0_$1 = utilities_macros.$progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
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
                            utilities_macros.$progress_notification_count$.bind((SubLObject)tva_cache.ZERO_INTEGER, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)tva_cache.ZERO_INTEGER, thread);
                            utilities_macros.$progress_count$.bind((SubLObject)tva_cache.ZERO_INTEGER, thread);
                            utilities_macros.$is_noting_progressP$.bind((SubLObject)tva_cache.T, thread);
                            utilities_macros.$silent_progressP$.bind((SubLObject)((tva_cache.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : tva_cache.T), thread);
                            utilities_macros.noting_progress_preamble(str);
                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                            SubLObject done_var = (SubLObject)tva_cache.NIL;
                            final SubLObject token_var = (SubLObject)tva_cache.NIL;
                            while (tva_cache.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (tva_cache.NIL != valid) {
                                    utilities_macros.note_progress();
                                    SubLObject final_index_iterator = (SubLObject)tva_cache.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)tva_cache.$kw15$GAF, (SubLObject)tva_cache.NIL, (SubLObject)tva_cache.NIL);
                                        SubLObject done_var_$3 = (SubLObject)tva_cache.NIL;
                                        final SubLObject token_var_$4 = (SubLObject)tva_cache.NIL;
                                        while (tva_cache.NIL == done_var_$3) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                            final SubLObject valid_$5 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$4.eql(gaf));
                                            if (tva_cache.NIL != valid_$5) {
                                                SubLObject current;
                                                final SubLObject datum = current = assertions_high.gaf_args(gaf);
                                                SubLObject binary_predicate = (SubLObject)tva_cache.NIL;
                                                SubLObject index_argnum = (SubLObject)tva_cache.NIL;
                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list16);
                                                binary_predicate = current.first();
                                                current = current.rest();
                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list16);
                                                index_argnum = current.first();
                                                current = current.rest();
                                                if (tva_cache.NIL == current) {
                                                    if (tva_cache.NIL != redo_if_presentP || tva_cache.NIL == tva_cache_for_predicate_and_index_argnum(binary_predicate, index_argnum)) {
                                                        SubLObject error_message = (SubLObject)tva_cache.NIL;
                                                        try {
                                                            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                                            final SubLObject _prev_bind_0_$2 = Errors.$error_handler$.currentBinding(thread);
                                                            try {
                                                                Errors.$error_handler$.bind((SubLObject)tva_cache.$sym17$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                                try {
                                                                    create_tva_cache(binary_predicate, index_argnum, (SubLObject)tva_cache.T);
                                                                }
                                                                catch (Throwable catch_var) {
                                                                    Errors.handleThrowable(catch_var, (SubLObject)tva_cache.NIL);
                                                                }
                                                            }
                                                            finally {
                                                                Errors.$error_handler$.rebind(_prev_bind_0_$2, thread);
                                                            }
                                                        }
                                                        catch (Throwable ccatch_env_var) {
                                                            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                                        }
                                                        finally {
                                                            thread.throwStack.pop();
                                                        }
                                                        if (error_message.isString()) {
                                                            Errors.warn((SubLObject)tva_cache.$str18$Problem_initializing_TVA_CACHE_fo, binary_predicate, error_message);
                                                        }
                                                    }
                                                }
                                                else {
                                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_cache.$list16);
                                                }
                                            }
                                            done_var_$3 = (SubLObject)SubLObjectFactory.makeBoolean(tva_cache.NIL == valid_$5);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_cache.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (tva_cache.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(tva_cache.NIL == valid);
                            }
                            utilities_macros.noting_progress_postamble();
                        }
                        finally {
                            utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                            utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$2, thread);
                            utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$1, thread);
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_cache.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (tva_cache.NIL != should_maintain_assertion_usage_countsP) {
                    assertion_manager.assertion_manager_maintain_usage_counts();
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_9, thread);
            }
        }
        return tva_cache_registry();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 5131L)
    public static SubLObject tva_cache_enabled_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(tva_cache.NIL != list_utilities.sublisp_boolean(tva_cache.$use_tva_cacheP$.getDynamicValue(thread)) && tva_cache.NIL != list_utilities.sublisp_boolean(tva_cache.$update_tva_cacheP$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 5252L)
    public static SubLObject cached_tva_value_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)tva_cache.ZERO_INTEGER;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tva_cache_registry())); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject bin_pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject pred_caches = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = pred_caches;
            SubLObject v_cache = (SubLObject)tva_cache.NIL;
            v_cache = cdolist_list_var.first();
            while (tva_cache.NIL != cdolist_list_var) {
                final SubLObject iterator = map_utilities.new_map_iterator(tva_cache_map(v_cache));
                SubLObject valid;
                for (SubLObject done_var = (SubLObject)tva_cache.NIL; tva_cache.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(tva_cache.NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject var = iteration.iteration_next(iterator);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (tva_cache.NIL != valid) {
                        SubLObject current;
                        final SubLObject datum = current = var;
                        SubLObject key = (SubLObject)tva_cache.NIL;
                        SubLObject entry = (SubLObject)tva_cache.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list19);
                        key = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list19);
                        entry = current.first();
                        current = current.rest();
                        if (tva_cache.NIL == current) {
                            SubLObject current_$9;
                            final SubLObject datum_$8 = current_$9 = entry;
                            SubLObject raw_supported_values = (SubLObject)tva_cache.NIL;
                            SubLObject supported_subkeys = (SubLObject)tva_cache.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current_$9, datum_$8, (SubLObject)tva_cache.$list20);
                            raw_supported_values = current_$9.first();
                            current_$9 = (supported_subkeys = current_$9.rest());
                            count = Numbers.add(count, map_utilities.map_size(raw_supported_values));
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_cache.$list19);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_cache = cdolist_list_var.first();
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 5829L)
    public static SubLObject tva_cache_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_tva_cache(v_object, stream, (SubLObject)tva_cache.ZERO_INTEGER);
        return (SubLObject)tva_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 5829L)
    public static SubLObject tva_cache_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $tva_cache_native.class) ? tva_cache.T : tva_cache.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 5829L)
    public static SubLObject tva_cache_pred(final SubLObject v_object) {
        assert tva_cache.NIL != tva_cache_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 5829L)
    public static SubLObject tva_cache_index_argnum(final SubLObject v_object) {
        assert tva_cache.NIL != tva_cache_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 5829L)
    public static SubLObject tva_cache_tva_pred_gafs(final SubLObject v_object) {
        assert tva_cache.NIL != tva_cache_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 5829L)
    public static SubLObject tva_cache_tvai_pred_gafs(final SubLObject v_object) {
        assert tva_cache.NIL != tva_cache_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 5829L)
    public static SubLObject tva_cache_map(final SubLObject v_object) {
        assert tva_cache.NIL != tva_cache_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 5829L)
    public static SubLObject _csetf_tva_cache_pred(final SubLObject v_object, final SubLObject value) {
        assert tva_cache.NIL != tva_cache_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 5829L)
    public static SubLObject _csetf_tva_cache_index_argnum(final SubLObject v_object, final SubLObject value) {
        assert tva_cache.NIL != tva_cache_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 5829L)
    public static SubLObject _csetf_tva_cache_tva_pred_gafs(final SubLObject v_object, final SubLObject value) {
        assert tva_cache.NIL != tva_cache_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 5829L)
    public static SubLObject _csetf_tva_cache_tvai_pred_gafs(final SubLObject v_object, final SubLObject value) {
        assert tva_cache.NIL != tva_cache_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 5829L)
    public static SubLObject _csetf_tva_cache_map(final SubLObject v_object, final SubLObject value) {
        assert tva_cache.NIL != tva_cache_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 5829L)
    public static SubLObject make_tva_cache(SubLObject arglist) {
        if (arglist == tva_cache.UNPROVIDED) {
            arglist = (SubLObject)tva_cache.NIL;
        }
        final SubLObject v_new = (SubLObject)new $tva_cache_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)tva_cache.NIL, next = arglist; tva_cache.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)tva_cache.$kw39$PRED)) {
                _csetf_tva_cache_pred(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tva_cache.$kw40$INDEX_ARGNUM)) {
                _csetf_tva_cache_index_argnum(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tva_cache.$kw41$TVA_PRED_GAFS)) {
                _csetf_tva_cache_tva_pred_gafs(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tva_cache.$kw42$TVAI_PRED_GAFS)) {
                _csetf_tva_cache_tvai_pred_gafs(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tva_cache.$kw43$MAP)) {
                _csetf_tva_cache_map(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)tva_cache.$str44$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 5829L)
    public static SubLObject visit_defstruct_tva_cache(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_cache.$kw45$BEGIN, (SubLObject)tva_cache.$sym46$MAKE_TVA_CACHE, (SubLObject)tva_cache.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_cache.$kw47$SLOT, (SubLObject)tva_cache.$kw39$PRED, tva_cache_pred(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_cache.$kw47$SLOT, (SubLObject)tva_cache.$kw40$INDEX_ARGNUM, tva_cache_index_argnum(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_cache.$kw47$SLOT, (SubLObject)tva_cache.$kw41$TVA_PRED_GAFS, tva_cache_tva_pred_gafs(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_cache.$kw47$SLOT, (SubLObject)tva_cache.$kw42$TVAI_PRED_GAFS, tva_cache_tvai_pred_gafs(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_cache.$kw47$SLOT, (SubLObject)tva_cache.$kw43$MAP, tva_cache_map(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_cache.$kw48$END, (SubLObject)tva_cache.$sym46$MAKE_TVA_CACHE, (SubLObject)tva_cache.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 5829L)
    public static SubLObject visit_defstruct_object_tva_cache_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_tva_cache(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 6097L)
    public static SubLObject sxhash_tva_cache_method(final SubLObject v_object) {
        return Sxhash.sxhash(tva_cache_pred(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 6184L)
    public static SubLObject pprint_tva_cache(final SubLObject v_tva_cache, SubLObject stream, SubLObject depth) {
        if (stream == tva_cache.UNPROVIDED) {
            stream = (SubLObject)tva_cache.NIL;
        }
        if (depth == tva_cache.UNPROVIDED) {
            depth = (SubLObject)tva_cache.NIL;
        }
        PrintLow.format(stream, (SubLObject)tva_cache.$str51$__TVA_CACHE__S__S_, tva_cache_pred(v_tva_cache), tva_cache_index_argnum(v_tva_cache));
        return v_tva_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 6397L)
    public static SubLObject clone_swappable_tva_cache(final SubLObject old_tva_cache, final SubLObject fvector) {
        final SubLObject new_tva_cache = make_tva_cache((SubLObject)tva_cache.UNPROVIDED);
        _csetf_tva_cache_pred(new_tva_cache, tva_cache_pred(old_tva_cache));
        _csetf_tva_cache_index_argnum(new_tva_cache, tva_cache_index_argnum(old_tva_cache));
        _csetf_tva_cache_tva_pred_gafs(new_tva_cache, tva_cache_tva_pred_gafs(old_tva_cache));
        _csetf_tva_cache_tvai_pred_gafs(new_tva_cache, tva_cache_tvai_pred_gafs(old_tva_cache));
        final SubLObject old_map = tva_cache_map(old_tva_cache);
        final SubLObject unbacked_map = dictionary.new_dictionary(map_utilities.map_test(old_map), map_utilities.map_size(old_map));
        final SubLObject new_map = file_vector_utilities.populate_file_vector_backed_map_from_map(old_map, unbacked_map, fvector, (SubLObject)tva_cache.$kw52$SWAPPED_OUT, (SubLObject)tva_cache.UNPROVIDED);
        final SubLObject backed_map = file_vector_utilities.new_future_backed_map(new_map);
        _csetf_tva_cache_map(new_tva_cache, backed_map);
        return new_tva_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 7551L)
    public static SubLObject using_swappable_tva_cachesP() {
        return Types.lock_p(tva_cache.$swappable_tva_cache_lock$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 7644L)
    public static SubLObject ensure_swappable_tva_cache_lock() {
        if (tva_cache.NIL == using_swappable_tva_cachesP()) {
            tva_cache.$swappable_tva_cache_lock$.setGlobalValue(Locks.make_lock((SubLObject)tva_cache.$str54$Swappable_TVA_Cache));
        }
        return (SubLObject)tva_cache.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 7823L)
    public static SubLObject reconnect_swappable_tva_cache(final SubLObject v_tva_cache, final SubLObject fvector, SubLObject common_symbols) {
        if (common_symbols == tva_cache.UNPROVIDED) {
            common_symbols = (SubLObject)tva_cache.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject backed_map = tva_cache_map(v_tva_cache);
        if (tva_cache.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && tva_cache.NIL == file_vector_utilities.backed_map_p(backed_map)) {
            Errors.error((SubLObject)tva_cache.$str55$Cannot_reconnect__A__which_is_not, backed_map);
        }
        file_vector_utilities.reconnect_backed_map(backed_map, fvector, common_symbols);
        ensure_swappable_tva_cache_lock();
        return v_tva_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 8577L)
    public static SubLObject tva_cache_registry() {
        return tva_cache.$tva_cache_registry$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 8646L)
    public static SubLObject register_tva_cache(final SubLObject v_cache) {
        final SubLObject predicate = tva_cache_pred(v_cache);
        dictionary_utilities.dictionary_pushnew(tva_cache.$tva_cache_registry$.getGlobalValue(), predicate, v_cache, Symbols.symbol_function((SubLObject)tva_cache.EQ), (SubLObject)tva_cache.UNPROVIDED);
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 8818L)
    public static SubLObject tva_caches_for_predicate(final SubLObject predicate) {
        return dictionary.dictionary_lookup_without_values(tva_cache_registry(), predicate, (SubLObject)tva_cache.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 8950L)
    public static SubLObject tva_caches_implied_by_predicate(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject caches = (SubLObject)tva_cache.NIL;
        SubLObject inverse_caches = (SubLObject)tva_cache.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)tva_cache.$sym12$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind(tva_cache.$const13$InferencePSC, thread);
            final SubLObject module = sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds);
            final SubLObject deck_type = (SubLObject)((tva_cache.$kw58$BREADTH == tva_cache.$kw59$DEPTH) ? tva_cache.$kw60$STACK : tva_cache.$kw61$QUEUE);
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = (SubLObject)tva_cache.NIL;
            final SubLObject _prev_bind_0_$10 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = tva_cache.$const62$True_JustificationTruth;
                    final SubLObject _prev_bind_0_$11 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$12 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind((tva_cache.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((tva_cache.NIL != tv_var) ? tva_cache.$sym63$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if (tva_cache.NIL != tv_var && tva_cache.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && tva_cache.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql((SubLObject)tva_cache.$kw64$ERROR)) {
                                sbhl_paranoia.sbhl_error((SubLObject)tva_cache.ONE_INTEGER, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)tva_cache.$kw67$CERROR)) {
                                sbhl_paranoia.sbhl_cerror((SubLObject)tva_cache.ONE_INTEGER, (SubLObject)tva_cache.$str68$continue_anyway, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)tva_cache.$kw69$WARN)) {
                                Errors.warn((SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P);
                            }
                            else {
                                Errors.warn((SubLObject)tva_cache.$str70$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror((SubLObject)tva_cache.$str68$continue_anyway, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P);
                            }
                        }
                        final SubLObject _prev_bind_0_$12 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$13 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_cache.NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(module, thread);
                            if (tva_cache.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || tva_cache.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(predicate, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) {
                                final SubLObject _prev_bind_0_$13 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$14 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$17 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), module), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_cache.NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(predicate, (SubLObject)tva_cache.UNPROVIDED);
                                    for (node_and_predicate_mode = (SubLObject)ConsesLow.list(predicate, sbhl_search_vars.genl_inverse_mode_p()); tva_cache.NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                        final SubLObject node_var_$18 = node_and_predicate_mode.first();
                                        final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                        final SubLObject genl_pred = node_var_$18;
                                        final SubLObject _prev_bind_0_$14 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            final SubLObject inverseP = predicate_mode;
                                            SubLObject cdolist_list_var = tva_caches_for_predicate(genl_pred);
                                            SubLObject v_cache = (SubLObject)tva_cache.NIL;
                                            v_cache = cdolist_list_var.first();
                                            while (tva_cache.NIL != cdolist_list_var) {
                                                if (tva_cache.NIL != inverseP) {
                                                    inverse_caches = (SubLObject)ConsesLow.cons(v_cache, inverse_caches);
                                                }
                                                else {
                                                    caches = (SubLObject)ConsesLow.cons(v_cache, caches);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                v_cache = cdolist_list_var.first();
                                            }
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(module);
                                            SubLObject module_var = (SubLObject)tva_cache.NIL;
                                            module_var = cdolist_list_var.first();
                                            while (tva_cache.NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$15 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((tva_cache.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(tva_cache.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var_$18);
                                                    if (tva_cache.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                        if (tva_cache.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                            if (tva_cache.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (tva_cache.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$23;
                                                                            for (iteration_state_$23 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$23); iteration_state_$23 = dictionary_contents.do_dictionary_contents_next(iteration_state_$23)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$23);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (tva_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$17 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (tva_cache.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)tva_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)tva_cache.UNPROVIDED);
                                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = (SubLObject)tva_cache.NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (tva_cache.NIL != csome_list_var) {
                                                                                                if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)tva_cache.UNPROVIDED);
                                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$17, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$23);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$16, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)tva_cache.FIVE_INTEGER, (SubLObject)tva_cache.$str72$attempting_to_bind_direction_link, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (tva_cache.NIL != obsolete.cnat_p(node, (SubLObject)tva_cache.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$25;
                                                        final SubLObject new_list = cdolist_list_var_$25 = ((tva_cache.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)tva_cache.NIL;
                                                        generating_fn = cdolist_list_var_$25.first();
                                                        while (tva_cache.NIL != cdolist_list_var_$25) {
                                                            final SubLObject _prev_bind_0_$18 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (tva_cache.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)tva_cache.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)tva_cache.UNPROVIDED);
                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var2 = sol2;
                                                                    SubLObject node_vars_link_node4 = (SubLObject)tva_cache.NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (tva_cache.NIL != csome_list_var2) {
                                                                        if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)tva_cache.UNPROVIDED);
                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$18, thread);
                                                            }
                                                            cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                                                            generating_fn = cdolist_list_var_$25.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$15, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$15, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$14, thread);
                                        }
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$17, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$14, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$13, thread);
                                }
                            }
                            else {
                                sbhl_paranoia.sbhl_warn((SubLObject)tva_cache.TWO_INTEGER, (SubLObject)tva_cache.$str73$Node__a_does_not_pass_sbhl_type_t, predicate, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED)), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                            }
                        }
                        finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$13, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$12, thread);
                        }
                    }
                    finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$12, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$11, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_cache.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$10, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return Values.values(caches, inverse_caches);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 9447L)
    public static SubLObject tva_caches_with_transitive_predicate(final SubLObject trans_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject caches = (SubLObject)tva_cache.NIL;
        SubLObject inverse_caches = (SubLObject)tva_cache.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)tva_cache.$sym12$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind(tva_cache.$const13$InferencePSC, thread);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tva_cache_registry())); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject bin_pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject bin_pred_caches = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject cdolist_list_var = bin_pred_caches;
                SubLObject v_cache = (SubLObject)tva_cache.NIL;
                v_cache = cdolist_list_var.first();
                while (tva_cache.NIL != cdolist_list_var) {
                    SubLObject badP = (SubLObject)tva_cache.NIL;
                    if (tva_cache.NIL == badP) {
                        SubLObject csome_list_var = tva_cache_tva_pred_gafs(v_cache);
                        SubLObject gaf = (SubLObject)tva_cache.NIL;
                        gaf = csome_list_var.first();
                        while (tva_cache.NIL == badP && tva_cache.NIL != csome_list_var) {
                            if (tva_cache.NIL != assertion_handles.valid_assertionP(gaf, (SubLObject)tva_cache.UNPROVIDED)) {
                                final SubLObject original_pred = tva_cache_tva_pred_from_support(gaf);
                                final SubLObject gaf_argnum = assertions_high.gaf_arg3(gaf);
                                if (gaf_argnum.eql(tva_cache_index_argnum(v_cache))) {
                                    if (tva_cache.NIL != genl_predicates.genl_predicateP(trans_pred, original_pred, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)) {
                                        caches = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_cache, (SubLObject)tva_cache.NIL, original_pred), caches);
                                    }
                                    if (tva_cache.NIL != genl_predicates.genl_inverseP(trans_pred, original_pred, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)) {
                                        caches = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_cache, (SubLObject)tva_cache.T, original_pred), caches);
                                    }
                                }
                            }
                            else {
                                badP = (SubLObject)tva_cache.T;
                            }
                            csome_list_var = csome_list_var.rest();
                            gaf = csome_list_var.first();
                        }
                    }
                    if (tva_cache.NIL == badP) {
                        SubLObject csome_list_var = tva_cache_tvai_pred_gafs(v_cache);
                        SubLObject gaf = (SubLObject)tva_cache.NIL;
                        gaf = csome_list_var.first();
                        while (tva_cache.NIL == badP && tva_cache.NIL != csome_list_var) {
                            if (tva_cache.NIL != assertion_handles.valid_assertionP(gaf, (SubLObject)tva_cache.UNPROVIDED)) {
                                final SubLObject original_pred = tva_cache_tva_pred_from_support(gaf);
                                final SubLObject gaf_argnum = assertions_high.gaf_arg3(gaf);
                                if (gaf_argnum.eql(tva_cache_index_argnum(v_cache))) {
                                    if (tva_cache.NIL != genl_predicates.genl_predicateP(trans_pred, original_pred, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)) {
                                        inverse_caches = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_cache, (SubLObject)tva_cache.NIL, original_pred), inverse_caches);
                                    }
                                    if (tva_cache.NIL != genl_predicates.genl_inverseP(trans_pred, original_pred, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)) {
                                        inverse_caches = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_cache, (SubLObject)tva_cache.T, original_pred), inverse_caches);
                                    }
                                }
                            }
                            else {
                                badP = (SubLObject)tva_cache.T;
                            }
                            csome_list_var = csome_list_var.rest();
                            gaf = csome_list_var.first();
                        }
                    }
                    if (tva_cache.NIL != badP) {
                        deregister_tva_cache(v_cache, bin_pred);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_cache = cdolist_list_var.first();
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return Values.values(caches, inverse_caches);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 10916L)
    public static SubLObject tva_cache_for_predicate_and_index_argnum(final SubLObject predicate, final SubLObject index_argnum) {
        final SubLObject caches = tva_caches_for_predicate(predicate);
        final SubLObject v_cache = Sequences.find(index_argnum, caches, Symbols.symbol_function((SubLObject)tva_cache.EQL), (SubLObject)tva_cache.$sym32$TVA_CACHE_INDEX_ARGNUM, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 11141L)
    public static SubLObject ensure_tva_cache_created(final SubLObject binary_predicate, final SubLObject index_argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_cache = tva_cache_for_predicate_and_index_argnum(binary_predicate, index_argnum);
        if (tva_cache.NIL == v_cache) {
            final SubLObject _prev_bind_0 = utilities_macros.$noting_progress_delayed_mode_seconds$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$noting_progress_delayed_mode_string$.currentBinding(thread);
            try {
                utilities_macros.$noting_progress_delayed_mode_seconds$.bind((SubLObject)tva_cache.TWO_INTEGER, thread);
                utilities_macros.$noting_progress_delayed_mode_string$.bind(Sequences.cconcatenate((SubLObject)tva_cache.$str74$Creating_TVA_cache_for_, new SubLObject[] { format_nil.format_nil_s_no_copy(binary_predicate), tva_cache.$str75$__arg_, format_nil.format_nil_d_no_copy(index_argnum), tva_cache.$str76$_ }), thread);
                final SubLObject str = Sequences.cconcatenate((SubLObject)tva_cache.$str74$Creating_TVA_cache_for_, new SubLObject[] { format_nil.format_nil_s_no_copy(binary_predicate), tva_cache.$str75$__arg_, format_nil.format_nil_d_no_copy(index_argnum), tva_cache.$str76$_ });
                final SubLObject _prev_bind_0_$28 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$29 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
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
                    utilities_macros.$progress_notification_count$.bind((SubLObject)tva_cache.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)tva_cache.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)tva_cache.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)tva_cache.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((tva_cache.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : tva_cache.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    v_cache = create_tva_cache(binary_predicate, index_argnum, (SubLObject)tva_cache.T);
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$29, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$28, thread);
                }
            }
            finally {
                utilities_macros.$noting_progress_delayed_mode_string$.rebind(_prev_bind_2, thread);
                utilities_macros.$noting_progress_delayed_mode_seconds$.rebind(_prev_bind_0, thread);
            }
        }
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 11531L)
    public static SubLObject deregister_tva_cache(final SubLObject v_cache, SubLObject bin_pred) {
        if (bin_pred == tva_cache.UNPROVIDED) {
            bin_pred = (SubLObject)tva_cache.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (tva_cache.NIL != bin_pred) {
            return dictionary_utilities.dictionary_remove_from_value(tva_cache_registry(), bin_pred, v_cache, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tva_cache_registry())); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject this_pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject pred_caches = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = pred_caches;
            SubLObject this_cache = (SubLObject)tva_cache.NIL;
            this_cache = cdolist_list_var.first();
            while (tva_cache.NIL != cdolist_list_var) {
                if (v_cache.eql(this_cache)) {
                    deregister_tva_cache(this_cache, this_pred);
                }
                cdolist_list_var = cdolist_list_var.rest();
                this_cache = cdolist_list_var.first();
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)tva_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 11830L)
    public static SubLObject deregister_all_tva_caches_for_predicate(final SubLObject bin_pred) {
        SubLObject cdolist_list_var = tva_caches_for_predicate(bin_pred);
        SubLObject v_cache = (SubLObject)tva_cache.NIL;
        v_cache = cdolist_list_var.first();
        while (tva_cache.NIL != cdolist_list_var) {
            deregister_tva_cache(v_cache, bin_pred);
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        return (SubLObject)tva_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 12410L)
    public static SubLObject reset_tva_cache_spec_pred_stats() {
        return dictionary.clear_dictionary(tva_cache.$tva_cache_spec_pred_stats$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 12520L)
    public static SubLObject tva_cache_spec_preds_total_time() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = (SubLObject)tva_cache.ZERO_INTEGER;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tva_cache.$tva_cache_spec_pred_stats$.getGlobalValue())); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject info = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = info;
            SubLObject pair = (SubLObject)tva_cache.NIL;
            pair = cdolist_list_var.first();
            while (tva_cache.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = pair;
                SubLObject mt_info = (SubLObject)tva_cache.NIL;
                SubLObject time = (SubLObject)tva_cache.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list78);
                mt_info = current.first();
                current = (time = current.rest());
                if (time.numG((SubLObject)tva_cache.ZERO_INTEGER)) {
                    total = Numbers.add(total, time);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pair = cdolist_list_var.first();
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 12830L)
    public static SubLObject do_tva_sub_caches(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list79);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sub_cache = (SubLObject)tva_cache.NIL;
        SubLObject v_cache = (SubLObject)tva_cache.NIL;
        SubLObject inverseP = (SubLObject)tva_cache.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list79);
        sub_cache = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list79);
        v_cache = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list79);
        inverseP = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)tva_cache.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)tva_cache.NIL;
        SubLObject current_$30 = (SubLObject)tva_cache.NIL;
        while (tva_cache.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)tva_cache.$list79);
            current_$30 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)tva_cache.$list79);
            if (tva_cache.NIL == conses_high.member(current_$30, (SubLObject)tva_cache.$list80, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)) {
                bad = (SubLObject)tva_cache.T;
            }
            if (current_$30 == tva_cache.$kw81$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (tva_cache.NIL != bad && tva_cache.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_cache.$list79);
        }
        final SubLObject doneP_tail = cdestructuring_bind.property_list_member((SubLObject)tva_cache.$kw82$DONE_, current);
        final SubLObject doneP = (SubLObject)((tva_cache.NIL != doneP_tail) ? conses_high.cadr(doneP_tail) : tva_cache.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)tva_cache.$sym83$PIF, (SubLObject)tva_cache.$sym84$_TVA_CACHE_USE_MEMOIZED_SPEC_PRED_LISTS__, (SubLObject)ConsesLow.listS((SubLObject)tva_cache.$sym85$DO_TVA_SUB_CACHES_VIA_MEMOIZED_LISTS, (SubLObject)ConsesLow.list(sub_cache, v_cache, inverseP, (SubLObject)tva_cache.$kw82$DONE_, doneP), ConsesLow.append(body, (SubLObject)tva_cache.NIL)), (SubLObject)ConsesLow.listS((SubLObject)tva_cache.$sym86$DO_TVA_SUB_CACHES_VIA_INDEX_SURFING, (SubLObject)ConsesLow.list(sub_cache, v_cache, inverseP, (SubLObject)tva_cache.$kw82$DONE_, doneP), ConsesLow.append(body, (SubLObject)tva_cache.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 13386L)
    public static SubLObject do_tva_sub_caches_via_index_surfing(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list79);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sub_cache = (SubLObject)tva_cache.NIL;
        SubLObject v_cache = (SubLObject)tva_cache.NIL;
        SubLObject inverseP = (SubLObject)tva_cache.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list79);
        sub_cache = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list79);
        v_cache = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list79);
        inverseP = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)tva_cache.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)tva_cache.NIL;
        SubLObject current_$31 = (SubLObject)tva_cache.NIL;
        while (tva_cache.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)tva_cache.$list79);
            current_$31 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)tva_cache.$list79);
            if (tva_cache.NIL == conses_high.member(current_$31, (SubLObject)tva_cache.$list80, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)) {
                bad = (SubLObject)tva_cache.T;
            }
            if (current_$31 == tva_cache.$kw81$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (tva_cache.NIL != bad && tva_cache.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_cache.$list79);
        }
        final SubLObject doneP_tail = cdestructuring_bind.property_list_member((SubLObject)tva_cache.$kw82$DONE_, current);
        final SubLObject doneP = (SubLObject)((tva_cache.NIL != doneP_tail) ? conses_high.cadr(doneP_tail) : tva_cache.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject spec_pred = (SubLObject)tva_cache.$sym87$SPEC_PRED;
        return (SubLObject)ConsesLow.list((SubLObject)tva_cache.$sym88$DO_ALL_SPEC_PREDICATES_AND_INVERSES, (SubLObject)ConsesLow.list(spec_pred, inverseP, (SubLObject)ConsesLow.list((SubLObject)tva_cache.$sym30$TVA_CACHE_PRED, v_cache), (SubLObject)tva_cache.NIL, (SubLObject)tva_cache.NIL, doneP), (SubLObject)ConsesLow.listS((SubLObject)tva_cache.$sym89$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(sub_cache, (SubLObject)ConsesLow.list((SubLObject)tva_cache.$sym90$FIF, (SubLObject)ConsesLow.list((SubLObject)tva_cache.EQUAL, spec_pred, (SubLObject)ConsesLow.list((SubLObject)tva_cache.$sym30$TVA_CACHE_PRED, v_cache)), v_cache, (SubLObject)ConsesLow.list((SubLObject)tva_cache.$sym91$FIND_TVA_SUB_CACHE, v_cache, spec_pred, inverseP)))), ConsesLow.append(body, (SubLObject)tva_cache.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 13992L)
    public static SubLObject do_tva_sub_caches_via_memoized_lists(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list79);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sub_cache = (SubLObject)tva_cache.NIL;
        SubLObject v_cache = (SubLObject)tva_cache.NIL;
        SubLObject inverseP = (SubLObject)tva_cache.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list79);
        sub_cache = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list79);
        v_cache = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list79);
        inverseP = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)tva_cache.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)tva_cache.NIL;
        SubLObject current_$32 = (SubLObject)tva_cache.NIL;
        while (tva_cache.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)tva_cache.$list79);
            current_$32 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)tva_cache.$list79);
            if (tva_cache.NIL == conses_high.member(current_$32, (SubLObject)tva_cache.$list80, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)) {
                bad = (SubLObject)tva_cache.T;
            }
            if (current_$32 == tva_cache.$kw81$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (tva_cache.NIL != bad && tva_cache.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_cache.$list79);
        }
        final SubLObject doneP_tail = cdestructuring_bind.property_list_member((SubLObject)tva_cache.$kw82$DONE_, current);
        final SubLObject doneP = (SubLObject)((tva_cache.NIL != doneP_tail) ? conses_high.cadr(doneP_tail) : tva_cache.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject spec_pred = (SubLObject)tva_cache.$sym92$SPEC_PRED;
        final SubLObject spec_preds = (SubLObject)tva_cache.$sym93$SPEC_PREDS;
        final SubLObject spec_inverses = (SubLObject)tva_cache.$sym94$SPEC_INVERSES;
        return (SubLObject)ConsesLow.list((SubLObject)tva_cache.$sym95$CMULTIPLE_VALUE_BIND, (SubLObject)ConsesLow.list(spec_preds, spec_inverses), (SubLObject)ConsesLow.list((SubLObject)tva_cache.$sym96$TVA_CACHE_SPEC_PREDS_AND_INVERSES, (SubLObject)ConsesLow.list((SubLObject)tva_cache.$sym30$TVA_CACHE_PRED, v_cache)), (SubLObject)ConsesLow.list((SubLObject)tva_cache.$sym97$CSOME, (SubLObject)ConsesLow.list(spec_pred, spec_preds, doneP), (SubLObject)ConsesLow.listS((SubLObject)tva_cache.$sym89$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(inverseP, (SubLObject)tva_cache.$list98), (SubLObject)ConsesLow.list(sub_cache, (SubLObject)ConsesLow.list((SubLObject)tva_cache.$sym90$FIF, (SubLObject)ConsesLow.list((SubLObject)tva_cache.EQUAL, spec_pred, (SubLObject)ConsesLow.list((SubLObject)tva_cache.$sym30$TVA_CACHE_PRED, v_cache)), v_cache, (SubLObject)ConsesLow.list((SubLObject)tva_cache.$sym91$FIND_TVA_SUB_CACHE, v_cache, spec_pred, inverseP)))), ConsesLow.append(body, (SubLObject)tva_cache.NIL))), (SubLObject)ConsesLow.list((SubLObject)tva_cache.$sym97$CSOME, (SubLObject)ConsesLow.list(spec_pred, spec_inverses, doneP), (SubLObject)ConsesLow.listS((SubLObject)tva_cache.$sym89$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(inverseP, (SubLObject)tva_cache.$list99), (SubLObject)ConsesLow.list(sub_cache, (SubLObject)ConsesLow.list((SubLObject)tva_cache.$sym90$FIF, (SubLObject)ConsesLow.list((SubLObject)tva_cache.EQUAL, spec_pred, (SubLObject)ConsesLow.list((SubLObject)tva_cache.$sym30$TVA_CACHE_PRED, v_cache)), v_cache, (SubLObject)ConsesLow.list((SubLObject)tva_cache.$sym91$FIND_TVA_SUB_CACHE, v_cache, spec_pred, inverseP)))), ConsesLow.append(body, (SubLObject)tva_cache.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 15027L)
    public static SubLObject tva_cache_spec_preds_and_inverses_internal(final SubLObject pred, SubLObject mt_info) {
        if (mt_info == tva_cache.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)tva_cache.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject spec_preds = (SubLObject)tva_cache.NIL;
        SubLObject spec_inverses = (SubLObject)tva_cache.NIL;
        SubLObject time = (SubLObject)tva_cache.NIL;
        final SubLObject time_var = Time.get_internal_real_time();
        if (tva_cache.NIL != mt_relevance_macros.mt_function_eq(mt_info, (SubLObject)tva_cache.$sym100$RELEVANT_MT_IS_EVERYTHING)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)tva_cache.$sym100$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(tva_cache.$const101$EverythingPSC, thread);
                final SubLObject deck_type = (SubLObject)tva_cache.$kw61$QUEUE;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = (SubLObject)tva_cache.NIL;
                final SubLObject _prev_bind_0_$33 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)tva_cache.NIL;
                        final SubLObject _prev_bind_0_$34 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$35 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((tva_cache.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((tva_cache.NIL != tv_var) ? tva_cache.$sym63$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (tva_cache.NIL != tv_var && tva_cache.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && tva_cache.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)tva_cache.$kw64$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)tva_cache.ONE_INTEGER, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)tva_cache.$kw67$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)tva_cache.ONE_INTEGER, (SubLObject)tva_cache.$str68$continue_anyway, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)tva_cache.$kw69$WARN)) {
                                    Errors.warn((SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)tva_cache.$str70$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)tva_cache.$str68$continue_anyway, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$35 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$36 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_cache.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds), thread);
                                if (tva_cache.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || tva_cache.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$36 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$37 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$40 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_cache.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred, (SubLObject)tva_cache.UNPROVIDED);
                                        for (node_and_predicate_mode = (SubLObject)ConsesLow.list(pred, sbhl_search_vars.genl_inverse_mode_p()); tva_cache.NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            final SubLObject node_var_$41 = node_and_predicate_mode.first();
                                            final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                            final SubLObject spec_pred = node_var_$41;
                                            final SubLObject _prev_bind_0_$37 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                final SubLObject inverseP = predicate_mode;
                                                if (tva_cache.NIL != inverseP) {
                                                    spec_inverses = (SubLObject)ConsesLow.cons(spec_pred, spec_inverses);
                                                }
                                                else {
                                                    spec_preds = (SubLObject)ConsesLow.cons(spec_pred, spec_preds);
                                                }
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds));
                                                SubLObject module_var = (SubLObject)tva_cache.NIL;
                                                module_var = cdolist_list_var.first();
                                                while (tva_cache.NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$38 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$38 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((tva_cache.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(tva_cache.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(node_var_$41);
                                                        if (tva_cache.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                            if (tva_cache.NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                                if (tva_cache.NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (tva_cache.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$39 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$46;
                                                                                for (iteration_state_$46 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$46); iteration_state_$46 = dictionary_contents.do_dictionary_contents_next(iteration_state_$46)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$46);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (tva_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$40 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (tva_cache.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)tva_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)tva_cache.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject node_vars_link_node2 = (SubLObject)tva_cache.NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (tva_cache.NIL != csome_list_var) {
                                                                                                    if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)tva_cache.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$40, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$46);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$39, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)tva_cache.FIVE_INTEGER, (SubLObject)tva_cache.$str72$attempting_to_bind_direction_link, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (tva_cache.NIL != obsolete.cnat_p(node, (SubLObject)tva_cache.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$48;
                                                            final SubLObject new_list = cdolist_list_var_$48 = ((tva_cache.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED)));
                                                            SubLObject generating_fn = (SubLObject)tva_cache.NIL;
                                                            generating_fn = cdolist_list_var_$48.first();
                                                            while (tva_cache.NIL != cdolist_list_var_$48) {
                                                                final SubLObject _prev_bind_0_$41 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                    if (tva_cache.NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)tva_cache.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)tva_cache.UNPROVIDED);
                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        SubLObject csome_list_var2 = sol2;
                                                                        SubLObject node_vars_link_node4 = (SubLObject)tva_cache.NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (tva_cache.NIL != csome_list_var2) {
                                                                            if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)tva_cache.UNPROVIDED);
                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$41, thread);
                                                                }
                                                                cdolist_list_var_$48 = cdolist_list_var_$48.rest();
                                                                generating_fn = cdolist_list_var_$48.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$38, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$38, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$37, thread);
                                            }
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$40, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$37, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$36, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)tva_cache.TWO_INTEGER, (SubLObject)tva_cache.$str73$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED)), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$36, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$35, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$35, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$34, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$42 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_cache.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$33, thread);
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (tva_cache.NIL != mt_relevance_macros.mt_function_eq(mt_info, (SubLObject)tva_cache.$sym12$RELEVANT_MT_IS_ANY_MT)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)tva_cache.$sym12$RELEVANT_MT_IS_ANY_MT, thread);
                mt_relevance_macros.$mt$.bind(tva_cache.$const13$InferencePSC, thread);
                final SubLObject deck_type = (SubLObject)tva_cache.$kw61$QUEUE;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = (SubLObject)tva_cache.NIL;
                final SubLObject _prev_bind_0_$43 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)tva_cache.NIL;
                        final SubLObject _prev_bind_0_$44 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$39 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((tva_cache.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((tva_cache.NIL != tv_var) ? tva_cache.$sym63$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (tva_cache.NIL != tv_var && tva_cache.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && tva_cache.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)tva_cache.$kw64$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)tva_cache.ONE_INTEGER, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)tva_cache.$kw67$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)tva_cache.ONE_INTEGER, (SubLObject)tva_cache.$str68$continue_anyway, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)tva_cache.$kw69$WARN)) {
                                    Errors.warn((SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)tva_cache.$str70$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)tva_cache.$str68$continue_anyway, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$45 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$40 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_cache.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds), thread);
                                if (tva_cache.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || tva_cache.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$46 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$41 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$41 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_cache.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred, (SubLObject)tva_cache.UNPROVIDED);
                                        for (node_and_predicate_mode = (SubLObject)ConsesLow.list(pred, sbhl_search_vars.genl_inverse_mode_p()); tva_cache.NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            final SubLObject node_var_$42 = node_and_predicate_mode.first();
                                            final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                            final SubLObject spec_pred = node_var_$42;
                                            final SubLObject _prev_bind_0_$47 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                final SubLObject inverseP = predicate_mode;
                                                if (tva_cache.NIL != inverseP) {
                                                    spec_inverses = (SubLObject)ConsesLow.cons(spec_pred, spec_inverses);
                                                }
                                                else {
                                                    spec_preds = (SubLObject)ConsesLow.cons(spec_pred, spec_preds);
                                                }
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds));
                                                SubLObject module_var = (SubLObject)tva_cache.NIL;
                                                module_var = cdolist_list_var.first();
                                                while (tva_cache.NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$48 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$42 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((tva_cache.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(tva_cache.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(node_var_$42);
                                                        if (tva_cache.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                            if (tva_cache.NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                                if (tva_cache.NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (tva_cache.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$49 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$47;
                                                                                for (iteration_state_$47 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$47); iteration_state_$47 = dictionary_contents.do_dictionary_contents_next(iteration_state_$47)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$47);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (tva_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$50 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (tva_cache.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)tva_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)tva_cache.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject node_vars_link_node2 = (SubLObject)tva_cache.NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (tva_cache.NIL != csome_list_var) {
                                                                                                    if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)tva_cache.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$50, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$47);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$49, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)tva_cache.FIVE_INTEGER, (SubLObject)tva_cache.$str72$attempting_to_bind_direction_link, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (tva_cache.NIL != obsolete.cnat_p(node, (SubLObject)tva_cache.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$49;
                                                            final SubLObject new_list = cdolist_list_var_$49 = ((tva_cache.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED)));
                                                            SubLObject generating_fn = (SubLObject)tva_cache.NIL;
                                                            generating_fn = cdolist_list_var_$49.first();
                                                            while (tva_cache.NIL != cdolist_list_var_$49) {
                                                                final SubLObject _prev_bind_0_$51 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                    if (tva_cache.NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)tva_cache.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)tva_cache.UNPROVIDED);
                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        SubLObject csome_list_var2 = sol2;
                                                                        SubLObject node_vars_link_node4 = (SubLObject)tva_cache.NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (tva_cache.NIL != csome_list_var2) {
                                                                            if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)tva_cache.UNPROVIDED);
                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$51, thread);
                                                                }
                                                                cdolist_list_var_$49 = cdolist_list_var_$49.rest();
                                                                generating_fn = cdolist_list_var_$49.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$42, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$48, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$47, thread);
                                            }
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$41, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$41, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$46, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)tva_cache.TWO_INTEGER, (SubLObject)tva_cache.$str73$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED)), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$40, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$45, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$39, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$44, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$52 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_cache.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$43, thread);
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (tva_cache.NIL != hlmt.mt_union_naut_p(mt_info)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)tva_cache.$sym102$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                final SubLObject deck_type = (SubLObject)tva_cache.$kw61$QUEUE;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = (SubLObject)tva_cache.NIL;
                final SubLObject _prev_bind_0_$53 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)tva_cache.NIL;
                        final SubLObject _prev_bind_0_$54 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$43 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((tva_cache.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((tva_cache.NIL != tv_var) ? tva_cache.$sym63$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (tva_cache.NIL != tv_var && tva_cache.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && tva_cache.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)tva_cache.$kw64$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)tva_cache.ONE_INTEGER, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)tva_cache.$kw67$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)tva_cache.ONE_INTEGER, (SubLObject)tva_cache.$str68$continue_anyway, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)tva_cache.$kw69$WARN)) {
                                    Errors.warn((SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)tva_cache.$str70$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)tva_cache.$str68$continue_anyway, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$55 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$44 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_cache.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds), thread);
                                if (tva_cache.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || tva_cache.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$56 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$45 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$42 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_cache.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred, (SubLObject)tva_cache.UNPROVIDED);
                                        for (node_and_predicate_mode = (SubLObject)ConsesLow.list(pred, sbhl_search_vars.genl_inverse_mode_p()); tva_cache.NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            final SubLObject node_var_$43 = node_and_predicate_mode.first();
                                            final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                            final SubLObject spec_pred = node_var_$43;
                                            final SubLObject _prev_bind_0_$57 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                final SubLObject inverseP = predicate_mode;
                                                if (tva_cache.NIL != inverseP) {
                                                    spec_inverses = (SubLObject)ConsesLow.cons(spec_pred, spec_inverses);
                                                }
                                                else {
                                                    spec_preds = (SubLObject)ConsesLow.cons(spec_pred, spec_preds);
                                                }
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds));
                                                SubLObject module_var = (SubLObject)tva_cache.NIL;
                                                module_var = cdolist_list_var.first();
                                                while (tva_cache.NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$58 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$46 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((tva_cache.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(tva_cache.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(node_var_$43);
                                                        if (tva_cache.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                            if (tva_cache.NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                                if (tva_cache.NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (tva_cache.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$59 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$48;
                                                                                for (iteration_state_$48 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$48); iteration_state_$48 = dictionary_contents.do_dictionary_contents_next(iteration_state_$48)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$48);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (tva_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$60 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (tva_cache.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)tva_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)tva_cache.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject node_vars_link_node2 = (SubLObject)tva_cache.NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (tva_cache.NIL != csome_list_var) {
                                                                                                    if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)tva_cache.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$60, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$48);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$59, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)tva_cache.FIVE_INTEGER, (SubLObject)tva_cache.$str72$attempting_to_bind_direction_link, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (tva_cache.NIL != obsolete.cnat_p(node, (SubLObject)tva_cache.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$50;
                                                            final SubLObject new_list = cdolist_list_var_$50 = ((tva_cache.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED)));
                                                            SubLObject generating_fn = (SubLObject)tva_cache.NIL;
                                                            generating_fn = cdolist_list_var_$50.first();
                                                            while (tva_cache.NIL != cdolist_list_var_$50) {
                                                                final SubLObject _prev_bind_0_$61 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                    if (tva_cache.NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)tva_cache.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)tva_cache.UNPROVIDED);
                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        SubLObject csome_list_var2 = sol2;
                                                                        SubLObject node_vars_link_node4 = (SubLObject)tva_cache.NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (tva_cache.NIL != csome_list_var2) {
                                                                            if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)tva_cache.UNPROVIDED);
                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$61, thread);
                                                                }
                                                                cdolist_list_var_$50 = cdolist_list_var_$50.rest();
                                                                generating_fn = cdolist_list_var_$50.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$46, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$58, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$57, thread);
                                            }
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$42, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$45, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$56, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)tva_cache.TWO_INTEGER, (SubLObject)tva_cache.$str73$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED)), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$44, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$55, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$43, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$54, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$62 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_cache.T, thread);
                            final SubLObject _values3 = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values3);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$62, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$53, thread);
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)tva_cache.$sym103$RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind(mt_info, thread);
                final SubLObject deck_type = (SubLObject)tva_cache.$kw61$QUEUE;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = (SubLObject)tva_cache.NIL;
                final SubLObject _prev_bind_0_$63 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)tva_cache.NIL;
                        final SubLObject _prev_bind_0_$64 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$47 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((tva_cache.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((tva_cache.NIL != tv_var) ? tva_cache.$sym63$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (tva_cache.NIL != tv_var && tva_cache.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && tva_cache.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)tva_cache.$kw64$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)tva_cache.ONE_INTEGER, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)tva_cache.$kw67$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)tva_cache.ONE_INTEGER, (SubLObject)tva_cache.$str68$continue_anyway, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)tva_cache.$kw69$WARN)) {
                                    Errors.warn((SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)tva_cache.$str70$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)tva_cache.$str68$continue_anyway, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$65 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$48 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_cache.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds), thread);
                                if (tva_cache.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || tva_cache.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$66 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$49 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$43 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_cache.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred, (SubLObject)tva_cache.UNPROVIDED);
                                        for (node_and_predicate_mode = (SubLObject)ConsesLow.list(pred, sbhl_search_vars.genl_inverse_mode_p()); tva_cache.NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            final SubLObject node_var_$44 = node_and_predicate_mode.first();
                                            final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                            final SubLObject spec_pred = node_var_$44;
                                            final SubLObject _prev_bind_0_$67 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                final SubLObject inverseP = predicate_mode;
                                                if (tva_cache.NIL != inverseP) {
                                                    spec_inverses = (SubLObject)ConsesLow.cons(spec_pred, spec_inverses);
                                                }
                                                else {
                                                    spec_preds = (SubLObject)ConsesLow.cons(spec_pred, spec_preds);
                                                }
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds));
                                                SubLObject module_var = (SubLObject)tva_cache.NIL;
                                                module_var = cdolist_list_var.first();
                                                while (tva_cache.NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$68 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$50 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((tva_cache.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(tva_cache.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(node_var_$44);
                                                        if (tva_cache.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                            if (tva_cache.NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                                if (tva_cache.NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (tva_cache.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$69 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$49;
                                                                                for (iteration_state_$49 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$49); iteration_state_$49 = dictionary_contents.do_dictionary_contents_next(iteration_state_$49)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$49);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (tva_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$70 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (tva_cache.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)tva_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)tva_cache.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject node_vars_link_node2 = (SubLObject)tva_cache.NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (tva_cache.NIL != csome_list_var) {
                                                                                                    if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)tva_cache.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$70, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$49);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$69, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)tva_cache.FIVE_INTEGER, (SubLObject)tva_cache.$str72$attempting_to_bind_direction_link, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (tva_cache.NIL != obsolete.cnat_p(node, (SubLObject)tva_cache.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$51;
                                                            final SubLObject new_list = cdolist_list_var_$51 = ((tva_cache.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED)));
                                                            SubLObject generating_fn = (SubLObject)tva_cache.NIL;
                                                            generating_fn = cdolist_list_var_$51.first();
                                                            while (tva_cache.NIL != cdolist_list_var_$51) {
                                                                final SubLObject _prev_bind_0_$71 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                    if (tva_cache.NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)tva_cache.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)tva_cache.UNPROVIDED);
                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        SubLObject csome_list_var2 = sol2;
                                                                        SubLObject node_vars_link_node4 = (SubLObject)tva_cache.NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (tva_cache.NIL != csome_list_var2) {
                                                                            if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)tva_cache.UNPROVIDED);
                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$71, thread);
                                                                }
                                                                cdolist_list_var_$51 = cdolist_list_var_$51.rest();
                                                                generating_fn = cdolist_list_var_$51.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$50, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$68, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$67, thread);
                                            }
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$43, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$49, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$66, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)tva_cache.TWO_INTEGER, (SubLObject)tva_cache.$str73$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED)), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$48, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$65, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$47, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$64, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$72 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_cache.T, thread);
                            final SubLObject _values4 = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values4);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$72, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$63, thread);
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        dictionary_utilities.dictionary_push(tva_cache.$tva_cache_spec_pred_stats$.getGlobalValue(), pred, (SubLObject)ConsesLow.cons(mt_info, time));
        return Values.values(Sequences.nreverse(spec_preds), Sequences.nreverse(spec_inverses));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 15027L)
    public static SubLObject tva_cache_spec_preds_and_inverses(final SubLObject pred, SubLObject mt_info) {
        if (mt_info == tva_cache.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)tva_cache.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)tva_cache.NIL;
        if (tva_cache.NIL == v_memoization_state) {
            return tva_cache_spec_preds_and_inverses_internal(pred, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)tva_cache.$sym96$TVA_CACHE_SPEC_PREDS_AND_INVERSES, (SubLObject)tva_cache.UNPROVIDED);
        if (tva_cache.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)tva_cache.$sym96$TVA_CACHE_SPEC_PREDS_AND_INVERSES, (SubLObject)tva_cache.TWO_INTEGER, (SubLObject)tva_cache.$int104$5000, (SubLObject)tva_cache.EQUAL, (SubLObject)tva_cache.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)tva_cache.$sym96$TVA_CACHE_SPEC_PREDS_AND_INVERSES, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)tva_cache.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)tva_cache.NIL;
            collision = cdolist_list_var.first();
            while (tva_cache.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (tva_cache.NIL != cached_args && tva_cache.NIL == cached_args.rest() && mt_info.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(tva_cache_spec_preds_and_inverses_internal(pred, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred, mt_info));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 15569L)
    public static SubLObject find_tva_sub_cache(final SubLObject v_cache, final SubLObject spec_pred, final SubLObject inverseP) {
        final SubLObject index_argnum = (tva_cache.NIL != inverseP) ? invert_binary_argnum(tva_cache_index_argnum(v_cache)) : tva_cache_index_argnum(v_cache);
        return tva_cache_for_predicate_and_index_argnum(spec_pred, index_argnum);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 15842L)
    public static SubLObject tva_cache_lookup(final SubLObject v_cache, final SubLObject key, SubLObject compute_justifications_p, SubLObject target, SubLObject target_test) {
        if (compute_justifications_p == tva_cache.UNPROVIDED) {
            compute_justifications_p = (SubLObject)tva_cache.NIL;
        }
        if (target == tva_cache.UNPROVIDED) {
            target = (SubLObject)tva_cache.NIL;
        }
        if (target_test == tva_cache.UNPROVIDED) {
            target_test = Symbols.symbol_function((SubLObject)tva_cache.EQL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                return tva_cache_lookup_recursive(v_cache, key, compute_justifications_p, target, target_test, dictionary.new_dictionary(Symbols.symbol_function((SubLObject)tva_cache.EQUAL), (SubLObject)tva_cache.UNPROVIDED));
            }
            finally {
                final SubLObject _prev_bind_0_$105 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_cache.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$105, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 16109L)
    public static SubLObject tva_cache_lookup_recursive(final SubLObject v_cache, final SubLObject key, final SubLObject compute_justifications_p, final SubLObject target, final SubLObject target_test, final SubLObject tried) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject top_levelP = dictionary.dictionary_empty_p(tried);
        SubLObject doneP = subl_promotions.memberP(key, dictionary.dictionary_lookup_without_values(tried, v_cache, (SubLObject)tva_cache.NIL), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
        SubLObject possibly_supported_values = (SubLObject)((tva_cache.NIL != doneP) ? tva_cache.NIL : tva_cache_lookup_internal(v_cache, key, compute_justifications_p, target, target_test, set.new_set(Symbols.symbol_function((SubLObject)tva_cache.EQUAL), (SubLObject)tva_cache.UNPROVIDED)));
        final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
        try {
            thread.throwStack.push(tag);
            final SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
            try {
                subl_macro_promotions.$within_with_timeout$.bind((SubLObject)tva_cache.T, thread);
                SubLObject timer = (SubLObject)tva_cache.NIL;
                try {
                    final SubLObject _prev_bind_0_$106 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                    try {
                        subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)tva_cache.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                        timer = subl_macro_promotions.with_timeout_start_timer((SubLObject)((tva_cache.NIL != top_levelP) ? inference_strategist.current_controlling_inference_time_remaining() : tva_cache.NIL), tag);
                        dictionary_utilities.dictionary_push(tried, v_cache, key);
                        if (tva_cache.NIL != tva_cache.$tva_cache_use_memoized_spec_pred_listsP$.getDynamicValue(thread)) {
                            thread.resetMultipleValues();
                            final SubLObject spec_preds = tva_cache_spec_preds_and_inverses(tva_cache_pred(v_cache), (SubLObject)tva_cache.UNPROVIDED);
                            final SubLObject spec_inverses = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (tva_cache.NIL == doneP) {
                                SubLObject csome_list_var = spec_preds;
                                SubLObject spec_pred = (SubLObject)tva_cache.NIL;
                                spec_pred = csome_list_var.first();
                                while (tva_cache.NIL == doneP && tva_cache.NIL != csome_list_var) {
                                    final SubLObject inverseP = (SubLObject)tva_cache.NIL;
                                    final SubLObject sub_cache = spec_pred.equal(tva_cache_pred(v_cache)) ? v_cache : find_tva_sub_cache(v_cache, spec_pred, inverseP);
                                    thread.resetMultipleValues();
                                    final SubLObject possibly_supported_values_$107 = tva_cache_lookup_recursive_internal(v_cache, sub_cache, inverseP, possibly_supported_values, tried, key, compute_justifications_p, target, target_test);
                                    final SubLObject doneP_$108 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    possibly_supported_values = possibly_supported_values_$107;
                                    doneP = doneP_$108;
                                    csome_list_var = csome_list_var.rest();
                                    spec_pred = csome_list_var.first();
                                }
                            }
                            if (tva_cache.NIL == doneP) {
                                SubLObject csome_list_var = spec_inverses;
                                SubLObject spec_pred = (SubLObject)tva_cache.NIL;
                                spec_pred = csome_list_var.first();
                                while (tva_cache.NIL == doneP && tva_cache.NIL != csome_list_var) {
                                    final SubLObject inverseP = (SubLObject)tva_cache.T;
                                    final SubLObject sub_cache = spec_pred.equal(tva_cache_pred(v_cache)) ? v_cache : find_tva_sub_cache(v_cache, spec_pred, inverseP);
                                    thread.resetMultipleValues();
                                    final SubLObject possibly_supported_values_$108 = tva_cache_lookup_recursive_internal(v_cache, sub_cache, inverseP, possibly_supported_values, tried, key, compute_justifications_p, target, target_test);
                                    final SubLObject doneP_$109 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    possibly_supported_values = possibly_supported_values_$108;
                                    doneP = doneP_$109;
                                    csome_list_var = csome_list_var.rest();
                                    spec_pred = csome_list_var.first();
                                }
                            }
                        }
                        else if (tva_cache.NIL == doneP) {
                            final SubLObject node_var = tva_cache_pred(v_cache);
                            final SubLObject deck_type = (SubLObject)tva_cache.$kw61$QUEUE;
                            final SubLObject recur_deck = deck.create_deck(deck_type);
                            SubLObject node_and_predicate_mode = (SubLObject)tva_cache.NIL;
                            final SubLObject _prev_bind_0_$107 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                try {
                                    final SubLObject tv_var = (SubLObject)tva_cache.NIL;
                                    final SubLObject _prev_bind_0_$108 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                    final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_tv$.bind((tva_cache.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((tva_cache.NIL != tv_var) ? tva_cache.$sym63$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                        if (tva_cache.NIL != tv_var && tva_cache.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && tva_cache.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                            if (pcase_var.eql((SubLObject)tva_cache.$kw64$ERROR)) {
                                                sbhl_paranoia.sbhl_error((SubLObject)tva_cache.ONE_INTEGER, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                            }
                                            else if (pcase_var.eql((SubLObject)tva_cache.$kw67$CERROR)) {
                                                sbhl_paranoia.sbhl_cerror((SubLObject)tva_cache.ONE_INTEGER, (SubLObject)tva_cache.$str68$continue_anyway, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                            }
                                            else if (pcase_var.eql((SubLObject)tva_cache.$kw69$WARN)) {
                                                Errors.warn((SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P);
                                            }
                                            else {
                                                Errors.warn((SubLObject)tva_cache.$str70$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror((SubLObject)tva_cache.$str68$continue_anyway, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P);
                                            }
                                        }
                                        final SubLObject _prev_bind_0_$109 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$114 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds), thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds)), thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_cache.NIL, thread);
                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds), thread);
                                            if (tva_cache.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || tva_cache.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(tva_cache_pred(v_cache), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) {
                                                final SubLObject _prev_bind_0_$110 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$115 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                final SubLObject _prev_bind_2_$117 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds)), thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_cache.NIL, thread);
                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)tva_cache.UNPROVIDED);
                                                    for (node_and_predicate_mode = (SubLObject)ConsesLow.list(tva_cache_pred(v_cache), sbhl_search_vars.genl_inverse_mode_p()); tva_cache.NIL != node_and_predicate_mode && tva_cache.NIL == doneP; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                                        final SubLObject node_var_$118 = node_and_predicate_mode.first();
                                                        final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                                        final SubLObject spec_pred2 = node_var_$118;
                                                        final SubLObject _prev_bind_0_$111 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                            final SubLObject inverseP2 = predicate_mode;
                                                            final SubLObject sub_cache2 = spec_pred2.equal(tva_cache_pred(v_cache)) ? v_cache : find_tva_sub_cache(v_cache, spec_pred2, inverseP2);
                                                            thread.resetMultipleValues();
                                                            final SubLObject possibly_supported_values_$109 = tva_cache_lookup_recursive_internal(v_cache, sub_cache2, inverseP2, possibly_supported_values, tried, key, compute_justifications_p, target, target_test);
                                                            final SubLObject doneP_$110 = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            possibly_supported_values = possibly_supported_values_$109;
                                                            doneP = doneP_$110;
                                                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds));
                                                            SubLObject rest;
                                                            SubLObject module_var;
                                                            SubLObject _prev_bind_0_$112;
                                                            SubLObject _prev_bind_1_$116;
                                                            SubLObject node;
                                                            SubLObject d_link;
                                                            SubLObject mt_links;
                                                            SubLObject iteration_state;
                                                            SubLObject mt;
                                                            SubLObject tv_links;
                                                            SubLObject _prev_bind_0_$113;
                                                            SubLObject iteration_state_$125;
                                                            SubLObject tv;
                                                            SubLObject link_nodes;
                                                            SubLObject _prev_bind_0_$114;
                                                            SubLObject sol;
                                                            SubLObject set_contents_var;
                                                            SubLObject basis_object;
                                                            SubLObject state;
                                                            SubLObject node_vars_link_node;
                                                            SubLObject csome_list_var2;
                                                            SubLObject node_vars_link_node2;
                                                            SubLObject new_list;
                                                            SubLObject rest_$127;
                                                            SubLObject generating_fn;
                                                            SubLObject _prev_bind_0_$115;
                                                            SubLObject sol2;
                                                            SubLObject link_nodes2;
                                                            SubLObject set_contents_var2;
                                                            SubLObject basis_object2;
                                                            SubLObject state2;
                                                            SubLObject node_vars_link_node3;
                                                            SubLObject csome_list_var3;
                                                            SubLObject node_vars_link_node4;
                                                            for (rest = (SubLObject)tva_cache.NIL, rest = accessible_modules; tva_cache.NIL == doneP && tva_cache.NIL != rest; rest = rest.rest()) {
                                                                module_var = rest.first();
                                                                _prev_bind_0_$112 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                _prev_bind_1_$116 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((tva_cache.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(tva_cache.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                                    node = function_terms.naut_to_nart(node_var_$118);
                                                                    if (tva_cache.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                                        if (tva_cache.NIL != d_link) {
                                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                                            if (tva_cache.NIL != mt_links) {
                                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); tva_cache.NIL == doneP && tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                    thread.resetMultipleValues();
                                                                                    mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                    tv_links = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (tva_cache.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                        _prev_bind_0_$113 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                            for (iteration_state_$125 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); tva_cache.NIL == doneP && tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$125); iteration_state_$125 = dictionary_contents.do_dictionary_contents_next(iteration_state_$125)) {
                                                                                                thread.resetMultipleValues();
                                                                                                tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$125);
                                                                                                link_nodes = thread.secondMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (tva_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                    _prev_bind_0_$114 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                        sol = link_nodes;
                                                                                                        if (tva_cache.NIL != set.set_p(sol)) {
                                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)tva_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); tva_cache.NIL == doneP && tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                                if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)tva_cache.UNPROVIDED);
                                                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else if (sol.isList()) {
                                                                                                            if (tva_cache.NIL == doneP) {
                                                                                                                csome_list_var2 = sol;
                                                                                                                node_vars_link_node2 = (SubLObject)tva_cache.NIL;
                                                                                                                node_vars_link_node2 = csome_list_var2.first();
                                                                                                                while (tva_cache.NIL == doneP && tva_cache.NIL != csome_list_var2) {
                                                                                                                    if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)tva_cache.UNPROVIDED);
                                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                    }
                                                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                                                    node_vars_link_node2 = csome_list_var2.first();
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else {
                                                                                                            Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                        }
                                                                                                    }
                                                                                                    finally {
                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$114, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$125);
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$113, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                            }
                                                                        }
                                                                        else {
                                                                            sbhl_paranoia.sbhl_error((SubLObject)tva_cache.FIVE_INTEGER, (SubLObject)tva_cache.$str72$attempting_to_bind_direction_link, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                                                        }
                                                                    }
                                                                    else if (tva_cache.NIL != obsolete.cnat_p(node, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                        new_list = ((tva_cache.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED)));
                                                                        for (rest_$127 = (SubLObject)tva_cache.NIL, rest_$127 = new_list; tva_cache.NIL == doneP && tva_cache.NIL != rest_$127; rest_$127 = rest_$127.rest()) {
                                                                            generating_fn = rest_$127.first();
                                                                            _prev_bind_0_$115 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                                if (tva_cache.NIL != set.set_p(sol2)) {
                                                                                    set_contents_var2 = set.do_set_internal(sol2);
                                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)tva_cache.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); tva_cache.NIL == doneP && tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                        if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)tva_cache.UNPROVIDED);
                                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (sol2.isList()) {
                                                                                    if (tva_cache.NIL == doneP) {
                                                                                        csome_list_var3 = sol2;
                                                                                        node_vars_link_node4 = (SubLObject)tva_cache.NIL;
                                                                                        node_vars_link_node4 = csome_list_var3.first();
                                                                                        while (tva_cache.NIL == doneP && tva_cache.NIL != csome_list_var3) {
                                                                                            if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)tva_cache.UNPROVIDED);
                                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                                            node_vars_link_node4 = csome_list_var3.first();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$115, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$116, thread);
                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$112, thread);
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$111, thread);
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$117, thread);
                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$115, thread);
                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$110, thread);
                                                }
                                            }
                                            else {
                                                sbhl_paranoia.sbhl_warn((SubLObject)tva_cache.TWO_INTEGER, (SubLObject)tva_cache.$str73$Node__a_does_not_pass_sbhl_type_t, tva_cache_pred(v_cache), sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED)), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                            }
                                        }
                                        finally {
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$114, thread);
                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$109, thread);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$108, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$116 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_cache.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$116, thread);
                                    }
                                }
                            }
                            finally {
                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$107, thread);
                            }
                        }
                    }
                    finally {
                        subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$106, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$117 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_cache.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        subl_macro_promotions.with_timeout_stop_timer(timer);
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$117, thread);
                    }
                }
            }
            finally {
                subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            doneP = Errors.handleThrowable(ccatch_env_var, tag);
        }
        finally {
            thread.throwStack.pop();
        }
        return possibly_supported_values;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 16943L)
    public static SubLObject tva_cache_lookup_recursive_internal(final SubLObject v_cache, final SubLObject sub_cache, final SubLObject inverseP, SubLObject possibly_supported_values, final SubLObject tried, final SubLObject key, final SubLObject compute_justifications_p, final SubLObject target, final SubLObject target_test) {
        final SubLObject sub_cache_results = (SubLObject)((tva_cache.NIL != tva_cache_p(sub_cache)) ? tva_cache_lookup_recursive(sub_cache, key, compute_justifications_p, (SubLObject)tva_cache.NIL, target_test, tried) : tva_cache.NIL);
        SubLObject doneP;
        SubLObject rest;
        SubLObject cons;
        SubLObject current;
        SubLObject datum;
        SubLObject value;
        SubLObject supports;
        SubLObject cache_pred;
        SubLObject this_pred;
        SubLObject support;
        SubLObject rest_$131;
        SubLObject cons_$132;
        SubLObject current_$134;
        SubLObject datum_$133;
        SubLObject transitive_value;
        SubLObject more_supports;
        for (doneP = (SubLObject)tva_cache.NIL, rest = (SubLObject)tva_cache.NIL, rest = sub_cache_results; tva_cache.NIL == doneP && tva_cache.NIL != rest; rest = rest.rest()) {
            cons = rest.first();
            datum = (current = cons);
            value = (SubLObject)tva_cache.NIL;
            supports = (SubLObject)tva_cache.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list106);
            value = current.first();
            current = (supports = current.rest());
            if (tva_cache.NIL != compute_justifications_p && !tva_cache_pred(sub_cache).equal(tva_cache_pred(v_cache))) {
                cache_pred = tva_cache_pred(v_cache);
                this_pred = tva_cache_pred(sub_cache);
                support = ((tva_cache.NIL != inverseP) ? removal_module_utilities.make_genl_inverse_support(this_pred, cache_pred) : removal_module_utilities.make_genl_preds_support(this_pred, cache_pred));
                supports = (SubLObject)ConsesLow.cons(support, supports);
            }
            if (tva_cache.NIL == target || tva_cache.NIL != Functions.funcall(target_test, target, value)) {
                possibly_supported_values = list_utilities.alist_enter(possibly_supported_values, value, supports, (SubLObject)tva_cache.UNPROVIDED);
            }
            if (tva_cache.NIL != fort_types_interface.transitive_binary_predicate_p(tva_cache_pred(sub_cache))) {
                for (rest_$131 = (SubLObject)tva_cache.NIL, rest_$131 = tva_cache_lookup_recursive(sub_cache, value, compute_justifications_p, target, target_test, tried); tva_cache.NIL == doneP && tva_cache.NIL != rest_$131; rest_$131 = rest_$131.rest()) {
                    cons_$132 = rest_$131.first();
                    datum_$133 = (current_$134 = cons_$132);
                    transitive_value = (SubLObject)tva_cache.NIL;
                    more_supports = (SubLObject)tva_cache.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$134, datum_$133, (SubLObject)tva_cache.$list107);
                    transitive_value = current_$134.first();
                    current_$134 = (more_supports = current_$134.rest());
                    if (tva_cache.NIL != compute_justifications_p) {
                        more_supports = (SubLObject)ConsesLow.cons(tva_cache_transitive_binary_predicate_support(tva_cache_pred(sub_cache)), more_supports);
                    }
                    possibly_supported_values = list_utilities.alist_enter(possibly_supported_values, transitive_value, conses_high.union(supports, more_supports, Symbols.symbol_function((SubLObject)tva_cache.$sym108$TVA_CACHE_SUPPORT_EQUAL_), (SubLObject)tva_cache.UNPROVIDED), (SubLObject)tva_cache.UNPROVIDED);
                }
            }
        }
        if (tva_cache.NIL != target && tva_cache.NIL != list_utilities.non_empty_list_p(possibly_supported_values)) {
            doneP = (SubLObject)tva_cache.T;
        }
        return Values.values(possibly_supported_values, doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 18609L)
    public static SubLObject cleanup_tva_cache_supports_genl_preds_chains(final SubLObject supports) {
        SubLObject clean = (SubLObject)tva_cache.NIL;
        SubLObject genl_preds_supports = (SubLObject)tva_cache.NIL;
        SubLObject cdolist_list_var = supports;
        SubLObject support = (SubLObject)tva_cache.NIL;
        support = cdolist_list_var.first();
        while (tva_cache.NIL != cdolist_list_var) {
            if (tva_cache.$kw109$GENLPREDS.eql(arguments.support_module(support))) {
                genl_preds_supports = (SubLObject)ConsesLow.cons(support, genl_preds_supports);
            }
            else {
                clean = (SubLObject)ConsesLow.cons(support, clean);
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        return clean;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 18916L)
    public static SubLObject with_tva_cache_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)tva_cache.$sym110$WITH_FILE_VECTOR_BACKED_MAP_STREAM_LOCK, (SubLObject)tva_cache.$list111, ConsesLow.append(body, (SubLObject)tva_cache.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 19059L)
    public static SubLObject tva_cache_entry_for_key(final SubLObject v_cache, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject entry = (SubLObject)tva_cache.NIL;
        if (tva_cache.NIL != using_swappable_tva_cachesP()) {
            final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
            try {
                file_vector_utilities.$file_vector_backed_map_read_lock$.bind(tva_cache.$swappable_tva_cache_lock$.getGlobalValue(), thread);
                entry = map_utilities.map_get_without_values(tva_cache_map(v_cache), key, (SubLObject)tva_cache.NIL);
            }
            finally {
                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            entry = map_utilities.map_get_without_values(tva_cache_map(v_cache), key, (SubLObject)tva_cache.NIL);
        }
        return entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 19375L)
    public static SubLObject tva_cache_lookup_internal_internal(final SubLObject v_cache, final SubLObject key, final SubLObject compute_justifications_p, final SubLObject target, final SubLObject target_test, final SubLObject checked_keys) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject entry = tva_cache_entry_for_key(v_cache, key);
        SubLObject possibly_supported_values = (SubLObject)tva_cache.NIL;
        SubLObject doneP = (SubLObject)tva_cache.NIL;
        if (tva_cache.NIL != entry) {
            set.set_add(key, checked_keys);
            SubLObject current;
            final SubLObject datum = current = entry;
            SubLObject raw_supported_values = (SubLObject)tva_cache.NIL;
            SubLObject supported_subkeys = (SubLObject)tva_cache.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list20);
            raw_supported_values = current.first();
            current = (supported_subkeys = current.rest());
            SubLObject iterator = map_utilities.new_map_iterator(raw_supported_values);
            SubLObject valid;
            for (SubLObject done_var = doneP; tva_cache.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(tva_cache.NIL == valid || tva_cache.NIL != doneP)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (tva_cache.NIL != valid) {
                    SubLObject current_$136;
                    final SubLObject datum_$135 = current_$136 = var;
                    SubLObject value = (SubLObject)tva_cache.NIL;
                    SubLObject supports = (SubLObject)tva_cache.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$136, datum_$135, (SubLObject)tva_cache.$list113);
                    value = current_$136.first();
                    current_$136 = current_$136.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$136, datum_$135, (SubLObject)tva_cache.$list113);
                    supports = current_$136.first();
                    current_$136 = current_$136.rest();
                    if (tva_cache.NIL == current_$136) {
                        if ((tva_cache.NIL == target || tva_cache.NIL != Functions.funcall(target_test, value, target)) && tva_cache.NIL == doneP) {
                            SubLObject csome_list_var = supports;
                            SubLObject support = (SubLObject)tva_cache.NIL;
                            support = csome_list_var.first();
                            while (tva_cache.NIL == doneP && tva_cache.NIL != csome_list_var) {
                                final SubLObject valid_supports = unpack_and_validate_tva_cache_support(support, compute_justifications_p, tva_cache_pred(v_cache));
                                if (tva_cache.NIL != valid_supports) {
                                    possibly_supported_values = list_utilities.alist_enter(possibly_supported_values, value, (SubLObject)((tva_cache.NIL != compute_justifications_p) ? valid_supports : tva_cache.NIL), (SubLObject)tva_cache.UNPROVIDED);
                                    if (tva_cache.NIL != target) {
                                        doneP = (SubLObject)tva_cache.T;
                                    }
                                }
                                csome_list_var = csome_list_var.rest();
                                support = csome_list_var.first();
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$135, (SubLObject)tva_cache.$list113);
                    }
                }
            }
            iterator = map_utilities.new_map_iterator(supported_subkeys);
            for (SubLObject done_var = doneP; tva_cache.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(tva_cache.NIL == valid || tva_cache.NIL != doneP)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (tva_cache.NIL != valid) {
                    SubLObject current_$137;
                    final SubLObject datum_$136 = current_$137 = var;
                    SubLObject subkey = (SubLObject)tva_cache.NIL;
                    SubLObject subkey_supports = (SubLObject)tva_cache.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$137, datum_$136, (SubLObject)tva_cache.$list114);
                    subkey = current_$137.first();
                    current_$137 = current_$137.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$137, datum_$136, (SubLObject)tva_cache.$list114);
                    subkey_supports = current_$137.first();
                    current_$137 = current_$137.rest();
                    if (tva_cache.NIL == current_$137) {
                        if (tva_cache.NIL == set.set_memberP(subkey, checked_keys) && tva_cache.NIL == doneP) {
                            SubLObject csome_list_var = subkey_supports;
                            SubLObject subkey_support = (SubLObject)tva_cache.NIL;
                            subkey_support = csome_list_var.first();
                            while (tva_cache.NIL == doneP && tva_cache.NIL != csome_list_var) {
                                SubLObject valid_subkey_supports = unpack_and_validate_tva_cache_support(subkey_support, compute_justifications_p, (SubLObject)tva_cache.UNPROVIDED);
                                final SubLObject transitivity_support = (SubLObject)((tva_cache.NIL != valid_subkey_supports) ? tva_cache_transitivity_support(v_cache, subkey_support, (SubLObject)tva_cache.UNPROVIDED) : tva_cache.NIL);
                                if (tva_cache.NIL != transitivity_support) {
                                    if (tva_cache.NIL != compute_justifications_p) {
                                        valid_subkey_supports = (SubLObject)ConsesLow.cons(transitivity_support, valid_subkey_supports);
                                    }
                                    if (tva_cache.NIL == doneP) {
                                        SubLObject csome_list_var_$139 = tva_cache_lookup_internal(v_cache, subkey, compute_justifications_p, target, target_test, checked_keys);
                                        SubLObject supported_subkey_value = (SubLObject)tva_cache.NIL;
                                        supported_subkey_value = csome_list_var_$139.first();
                                        while (tva_cache.NIL == doneP && tva_cache.NIL != csome_list_var_$139) {
                                            SubLObject current_$138;
                                            final SubLObject datum_$137 = current_$138 = supported_subkey_value;
                                            SubLObject subkey_value = (SubLObject)tva_cache.NIL;
                                            SubLObject subkey_value_supports = (SubLObject)tva_cache.NIL;
                                            cdestructuring_bind.destructuring_bind_must_consp(current_$138, datum_$137, (SubLObject)tva_cache.$list115);
                                            subkey_value = current_$138.first();
                                            current_$138 = (subkey_value_supports = current_$138.rest());
                                            if (tva_cache.NIL == target || tva_cache.NIL != Functions.funcall(target_test, subkey_value, target)) {
                                                final SubLObject new_value_supports = (SubLObject)((tva_cache.NIL != compute_justifications_p) ? list_utilities.fast_delete_duplicates(ConsesLow.append(subkey_value_supports, valid_subkey_supports), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED) : tva_cache.NIL);
                                                possibly_supported_values = list_utilities.alist_enter(possibly_supported_values, subkey_value, new_value_supports, (SubLObject)tva_cache.UNPROVIDED);
                                                if (tva_cache.NIL != target) {
                                                    doneP = (SubLObject)tva_cache.T;
                                                }
                                            }
                                            csome_list_var_$139 = csome_list_var_$139.rest();
                                            supported_subkey_value = csome_list_var_$139.first();
                                        }
                                    }
                                }
                                csome_list_var = csome_list_var.rest();
                                subkey_support = csome_list_var.first();
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$136, (SubLObject)tva_cache.$list114);
                    }
                }
            }
        }
        return possibly_supported_values;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 19375L)
    public static SubLObject tva_cache_lookup_internal(final SubLObject v_cache, final SubLObject key, final SubLObject compute_justifications_p, final SubLObject target, final SubLObject target_test, final SubLObject checked_keys) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)tva_cache.NIL;
        if (tva_cache.NIL == v_memoization_state) {
            return tva_cache_lookup_internal_internal(v_cache, key, compute_justifications_p, target, target_test, checked_keys);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)tva_cache.$sym112$TVA_CACHE_LOOKUP_INTERNAL, (SubLObject)tva_cache.UNPROVIDED);
        if (tva_cache.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)tva_cache.$sym112$TVA_CACHE_LOOKUP_INTERNAL, (SubLObject)tva_cache.SIX_INTEGER, (SubLObject)tva_cache.$int116$32768, (SubLObject)tva_cache.EQUAL, (SubLObject)tva_cache.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)tva_cache.$sym112$TVA_CACHE_LOOKUP_INTERNAL, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(v_cache, key, compute_justifications_p, target, target_test, checked_keys);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)tva_cache.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)tva_cache.NIL;
            collision = cdolist_list_var.first();
            while (tva_cache.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_cache.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (key.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (compute_justifications_p.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (target.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (target_test.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (tva_cache.NIL != cached_args && tva_cache.NIL == cached_args.rest() && checked_keys.equal(cached_args.first())) {
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
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(tva_cache_lookup_internal_internal(v_cache, key, compute_justifications_p, target, target_test, checked_keys)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_cache, key, compute_justifications_p, target, target_test, checked_keys));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 21701L)
    public static SubLObject tva_cache_has_keyP(final SubLObject v_cache, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)tva_cache.NIL;
        final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
        try {
            file_vector_utilities.$file_vector_backed_map_read_lock$.bind(tva_cache.$swappable_tva_cache_lock$.getGlobalValue(), thread);
            ans = map_utilities.map_has_keyP(tva_cache_map(v_cache), key);
        }
        finally {
            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 21931L)
    public static SubLObject tva_cache_valid_supportP_internal(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (tva_cache.NIL != tva_cache.$tva_cache_assume_supports_are_validP$.getDynamicValue(thread)) {
            return (SubLObject)tva_cache.T;
        }
        if (tva_cache.NIL != assertion_handles.assertion_p(support)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(tva_cache.NIL != assertion_handles.valid_assertionP(support, (SubLObject)tva_cache.UNPROVIDED) && tva_cache.NIL != mt_relevance_macros.relevant_mtP(arguments.support_mt(support)));
        }
        if (tva_cache.NIL != arguments.hl_support_p(support)) {
            final SubLObject support_in_current_mt = arguments.make_hl_support(arguments.hl_support_module(support), arguments.hl_support_sentence(support), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
            final SubLObject okP = hl_supports.hl_verify(support_in_current_mt);
            return okP;
        }
        return (SubLObject)tva_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 21931L)
    public static SubLObject tva_cache_valid_supportP(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)tva_cache.NIL;
        if (tva_cache.NIL == v_memoization_state) {
            return tva_cache_valid_supportP_internal(support);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)tva_cache.$sym117$TVA_CACHE_VALID_SUPPORT_, (SubLObject)tva_cache.UNPROVIDED);
        if (tva_cache.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)tva_cache.$sym117$TVA_CACHE_VALID_SUPPORT_, (SubLObject)tva_cache.ONE_INTEGER, (SubLObject)tva_cache.NIL, (SubLObject)tva_cache.EQUAL, (SubLObject)tva_cache.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)tva_cache.$sym117$TVA_CACHE_VALID_SUPPORT_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, support, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(tva_cache_valid_supportP_internal(support)));
            memoization_state.caching_state_put(caching_state, support, results, (SubLObject)tva_cache.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 22419L)
    public static SubLObject tva_cache_support_gaf(final SubLObject support) {
        return (tva_cache.NIL != assertion_handles.assertion_p(support)) ? support : conses_high.second(support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 22535L)
    public static SubLObject tva_cache_support_equalP(final SubLObject support1, final SubLObject support2) {
        if (tva_cache.NIL != tva_cache_support_complex_p(support1)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(tva_cache.NIL != tva_cache_support_complex_p(support2) && tva_cache.NIL != tva_cache_complex_support_equalP(support1, support2));
        }
        return Equality.eql(tva_cache_support_gaf(support1), tva_cache_support_gaf(support2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 22849L)
    public static SubLObject unpack_and_validate_tva_cache_support(final SubLObject support, final SubLObject compute_justifications_p, SubLObject cache_pred) {
        if (cache_pred == tva_cache.UNPROVIDED) {
            cache_pred = (SubLObject)tva_cache.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (tva_cache.NIL != arguments.support_p(support)) {
            return (SubLObject)((tva_cache.NIL != tva_cache_valid_supportP(support)) ? ConsesLow.list(support) : tva_cache.NIL);
        }
        if (tva_cache.NIL != tva_cache_support_complex_p(support)) {
            return unpack_and_validate_tva_cache_complex_support(support, compute_justifications_p, cache_pred);
        }
        SubLObject ans = (SubLObject)tva_cache.NIL;
        SubLObject type = (SubLObject)tva_cache.NIL;
        SubLObject gaf = (SubLObject)tva_cache.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)tva_cache.$list118);
        type = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)tva_cache.$list118);
        gaf = current.first();
        current = current.rest();
        final SubLObject specified_pred = (SubLObject)(current.isCons() ? current.first() : tva_cache.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, support, (SubLObject)tva_cache.$list118);
        current = current.rest();
        if (tva_cache.NIL == current) {
            final SubLObject genl_pred = (tva_cache.NIL != specified_pred) ? specified_pred : cache_pred;
            if (tva_cache.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && tva_cache.NIL == genl_pred) {
                Errors.error((SubLObject)tva_cache.$str119$No_specified_pred_for__S, support);
            }
            if (tva_cache.NIL != tva_cache_valid_supportP(gaf)) {
                final SubLObject pcase_var = type;
                if (pcase_var.eql((SubLObject)tva_cache.$kw120$INVERSE)) {
                    if (tva_cache.NIL != genl_predicates.genl_inverseP(assertions_high.gaf_arg0(gaf), genl_pred, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)) {
                        if (tva_cache.NIL != compute_justifications_p) {
                            ans = (SubLObject)ConsesLow.cons(removal_module_utilities.make_genl_inverse_support(assertions_high.gaf_arg0(gaf), genl_pred), ans);
                        }
                        ans = (SubLObject)ConsesLow.cons(gaf, ans);
                    }
                }
                else if (pcase_var.eql((SubLObject)tva_cache.$kw121$SPEC_PRED) && tva_cache.NIL != genl_predicates.genl_predicateP(assertions_high.gaf_arg0(gaf), genl_pred, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)) {
                    if (tva_cache.NIL != compute_justifications_p) {
                        ans = (SubLObject)ConsesLow.cons(removal_module_utilities.make_genl_preds_support(assertions_high.gaf_arg0(gaf), genl_pred), ans);
                    }
                    ans = (SubLObject)ConsesLow.cons(gaf, ans);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)tva_cache.$list118);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 24019L)
    public static SubLObject unpack_and_validate_tva_cache_complex_support(final SubLObject support, final SubLObject compute_justifications_p, SubLObject cache_pred) {
        if (cache_pred == tva_cache.UNPROVIDED) {
            cache_pred = (SubLObject)tva_cache.NIL;
        }
        SubLObject invalidP = (SubLObject)tva_cache.NIL;
        SubLObject validated = (SubLObject)tva_cache.NIL;
        if (tva_cache.NIL == invalidP) {
            SubLObject csome_list_var = support.rest();
            SubLObject component_support = (SubLObject)tva_cache.NIL;
            component_support = csome_list_var.first();
            while (tva_cache.NIL == invalidP && tva_cache.NIL != csome_list_var) {
                final SubLObject result = unpack_and_validate_tva_cache_support(component_support, compute_justifications_p, cache_pred);
                if (tva_cache.NIL != result) {
                    SubLObject cdolist_list_var = result;
                    SubLObject validated_support = (SubLObject)tva_cache.NIL;
                    validated_support = cdolist_list_var.first();
                    while (tva_cache.NIL != cdolist_list_var) {
                        validated = (SubLObject)ConsesLow.cons(validated_support, validated);
                        cdolist_list_var = cdolist_list_var.rest();
                        validated_support = cdolist_list_var.first();
                    }
                }
                else {
                    invalidP = (SubLObject)tva_cache.T;
                }
                csome_list_var = csome_list_var.rest();
                component_support = csome_list_var.first();
            }
        }
        return (SubLObject)((tva_cache.NIL != invalidP) ? tva_cache.NIL : validated);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 24536L)
    public static SubLObject add_tva_cache_value(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (tva_cache.NIL != tva_cache.$update_tva_cacheP$.getDynamicValue(thread) && tva_cache.NIL != after_adding.initial_assertion_argumentP(argument, assertion)) {
            return add_tva_cache_value_cached(assertion);
        }
        return (SubLObject)tva_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 24860L)
    public static SubLObject clear_add_tva_cache_value_cached() {
        final SubLObject cs = tva_cache.$add_tva_cache_value_cached_caching_state$.getGlobalValue();
        if (tva_cache.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)tva_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 24860L)
    public static SubLObject remove_add_tva_cache_value_cached(final SubLObject assertion) {
        return memoization_state.caching_state_remove_function_results_with_args(tva_cache.$add_tva_cache_value_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(assertion), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 24860L)
    public static SubLObject add_tva_cache_value_cached_internal(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(assertions_high.gaf_hl_formula(assertion), (SubLObject)tva_cache.UNPROVIDED);
        SubLObject bin_pred = (SubLObject)tva_cache.NIL;
        SubLObject arg1 = (SubLObject)tva_cache.NIL;
        SubLObject arg2 = (SubLObject)tva_cache.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list124);
        bin_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list124);
        arg1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list124);
        arg2 = current.first();
        current = current.rest();
        if (tva_cache.NIL == current) {
            thread.resetMultipleValues();
            final SubLObject caches = tva_caches_implied_by_predicate(bin_pred);
            final SubLObject inverse_caches = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(assertions_high.assertion_mt(assertion));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject cdolist_list_var = caches;
                SubLObject v_cache = (SubLObject)tva_cache.NIL;
                v_cache = cdolist_list_var.first();
                while (tva_cache.NIL != cdolist_list_var) {
                    final SubLObject pcase_var = tva_cache_index_argnum(v_cache);
                    if (pcase_var.eql((SubLObject)tva_cache.ONE_INTEGER)) {
                        tva_cache_store_one_value(v_cache, arg2);
                    }
                    else if (pcase_var.eql((SubLObject)tva_cache.TWO_INTEGER)) {
                        tva_cache_store_one_value(v_cache, arg1);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_cache = cdolist_list_var.first();
                }
                cdolist_list_var = inverse_caches;
                v_cache = (SubLObject)tva_cache.NIL;
                v_cache = cdolist_list_var.first();
                while (tva_cache.NIL != cdolist_list_var) {
                    final SubLObject pcase_var = tva_cache_index_argnum(v_cache);
                    if (pcase_var.eql((SubLObject)tva_cache.TWO_INTEGER)) {
                        tva_cache_store_one_value(v_cache, arg2);
                    }
                    else if (pcase_var.eql((SubLObject)tva_cache.ONE_INTEGER)) {
                        tva_cache_store_one_value(v_cache, arg1);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_cache = cdolist_list_var.first();
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_cache.$list124);
        }
        return (SubLObject)tva_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 24860L)
    public static SubLObject add_tva_cache_value_cached(final SubLObject assertion) {
        SubLObject caching_state = tva_cache.$add_tva_cache_value_cached_caching_state$.getGlobalValue();
        if (tva_cache.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)tva_cache.$sym123$ADD_TVA_CACHE_VALUE_CACHED, (SubLObject)tva_cache.$sym125$_ADD_TVA_CACHE_VALUE_CACHED_CACHING_STATE_, (SubLObject)tva_cache.NIL, (SubLObject)tva_cache.EQL, (SubLObject)tva_cache.ONE_INTEGER, (SubLObject)tva_cache.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, assertion, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(add_tva_cache_value_cached_internal(assertion)));
            memoization_state.caching_state_put(caching_state, assertion, results, (SubLObject)tva_cache.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 25557L)
    public static SubLObject remove_tva_cache_value(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (tva_cache.NIL != tva_cache.$update_tva_cacheP$.getDynamicValue(thread) && tva_cache.NIL != after_adding.final_assertion_argumentP(argument, assertion)) {
            return remove_tva_cache_value_cached(assertion);
        }
        return (SubLObject)tva_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 25861L)
    public static SubLObject clear_remove_tva_cache_value_cached() {
        final SubLObject cs = tva_cache.$remove_tva_cache_value_cached_caching_state$.getGlobalValue();
        if (tva_cache.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)tva_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 25861L)
    public static SubLObject remove_remove_tva_cache_value_cached(final SubLObject assertion) {
        return memoization_state.caching_state_remove_function_results_with_args(tva_cache.$remove_tva_cache_value_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(assertion), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 25861L)
    public static SubLObject remove_tva_cache_value_cached_internal(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(assertions_high.gaf_hl_formula(assertion), (SubLObject)tva_cache.UNPROVIDED);
        SubLObject bin_pred = (SubLObject)tva_cache.NIL;
        SubLObject arg1 = (SubLObject)tva_cache.NIL;
        SubLObject arg2 = (SubLObject)tva_cache.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list124);
        bin_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list124);
        arg1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list124);
        arg2 = current.first();
        current = current.rest();
        if (tva_cache.NIL == current) {
            thread.resetMultipleValues();
            final SubLObject caches = tva_caches_implied_by_predicate(bin_pred);
            final SubLObject inverse_caches = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(assertions_high.assertion_mt(assertion));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject cdolist_list_var = caches;
                SubLObject v_cache = (SubLObject)tva_cache.NIL;
                v_cache = cdolist_list_var.first();
                while (tva_cache.NIL != cdolist_list_var) {
                    final SubLObject pcase_var = tva_cache_index_argnum(v_cache);
                    if (pcase_var.eql((SubLObject)tva_cache.ONE_INTEGER)) {
                        tva_cache_remove_key_value_support(tva_cache_map(v_cache), arg1, arg2, assertion);
                    }
                    else if (pcase_var.eql((SubLObject)tva_cache.TWO_INTEGER)) {
                        tva_cache_remove_key_value_support(tva_cache_map(v_cache), arg2, arg1, assertion);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_cache = cdolist_list_var.first();
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            SubLObject cdolist_list_var2 = inverse_caches;
            SubLObject v_cache2 = (SubLObject)tva_cache.NIL;
            v_cache2 = cdolist_list_var2.first();
            while (tva_cache.NIL != cdolist_list_var2) {
                final SubLObject pcase_var2 = tva_cache_index_argnum(v_cache2);
                if (pcase_var2.eql((SubLObject)tva_cache.TWO_INTEGER)) {
                    tva_cache_remove_key_value_support(tva_cache_map(v_cache2), arg1, arg2, assertion);
                }
                else if (pcase_var2.eql((SubLObject)tva_cache.ONE_INTEGER)) {
                    tva_cache_remove_key_value_support(tva_cache_map(v_cache2), arg2, arg1, assertion);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                v_cache2 = cdolist_list_var2.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_cache.$list124);
        }
        return (SubLObject)tva_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 25861L)
    public static SubLObject remove_tva_cache_value_cached(final SubLObject assertion) {
        SubLObject caching_state = tva_cache.$remove_tva_cache_value_cached_caching_state$.getGlobalValue();
        if (tva_cache.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)tva_cache.$sym127$REMOVE_TVA_CACHE_VALUE_CACHED, (SubLObject)tva_cache.$sym128$_REMOVE_TVA_CACHE_VALUE_CACHED_CACHING_STATE_, (SubLObject)tva_cache.NIL, (SubLObject)tva_cache.EQL, (SubLObject)tva_cache.ONE_INTEGER, (SubLObject)tva_cache.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, assertion, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(remove_tva_cache_value_cached_internal(assertion)));
            memoization_state.caching_state_put(caching_state, assertion, results, (SubLObject)tva_cache.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 26716L)
    public static SubLObject add_tva_cache_key(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (tva_cache.NIL != tva_cache.$update_tva_cacheP$.getDynamicValue(thread) && tva_cache.NIL != after_adding.initial_assertion_argumentP(argument, assertion)) {
            return add_tva_cache_key_cached(assertion);
        }
        return (SubLObject)tva_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 27008L)
    public static SubLObject clear_add_tva_cache_key_cached() {
        final SubLObject cs = tva_cache.$add_tva_cache_key_cached_caching_state$.getGlobalValue();
        if (tva_cache.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)tva_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 27008L)
    public static SubLObject remove_add_tva_cache_key_cached(final SubLObject assertion) {
        return memoization_state.caching_state_remove_function_results_with_args(tva_cache.$add_tva_cache_key_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(assertion), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 27008L)
    public static SubLObject add_tva_cache_key_cached_internal(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(assertions_high.gaf_hl_formula(assertion), (SubLObject)tva_cache.UNPROVIDED);
        SubLObject trans_pred = (SubLObject)tva_cache.NIL;
        SubLObject arg1 = (SubLObject)tva_cache.NIL;
        SubLObject arg2 = (SubLObject)tva_cache.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list131);
        trans_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list131);
        arg1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list131);
        arg2 = current.first();
        current = current.rest();
        if (tva_cache.NIL == current) {
            thread.resetMultipleValues();
            final SubLObject cache_data = tva_caches_with_transitive_predicate(trans_pred);
            final SubLObject inverse_cache_data = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(assertions_high.assertion_mt(assertion));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject cdolist_list_var = cache_data;
                SubLObject cache_datum = (SubLObject)tva_cache.NIL;
                cache_datum = cdolist_list_var.first();
                while (tva_cache.NIL != cdolist_list_var) {
                    SubLObject current_$143;
                    final SubLObject datum_$142 = current_$143 = cache_datum;
                    SubLObject v_cache = (SubLObject)tva_cache.NIL;
                    SubLObject inverseP = (SubLObject)tva_cache.NIL;
                    SubLObject original_trans_pred = (SubLObject)tva_cache.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$143, datum_$142, (SubLObject)tva_cache.$list132);
                    v_cache = current_$143.first();
                    current_$143 = current_$143.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$143, datum_$142, (SubLObject)tva_cache.$list132);
                    inverseP = current_$143.first();
                    current_$143 = current_$143.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$143, datum_$142, (SubLObject)tva_cache.$list132);
                    original_trans_pred = current_$143.first();
                    current_$143 = current_$143.rest();
                    if (tva_cache.NIL == current_$143) {
                        final SubLObject spec_predP = (SubLObject)SubLObjectFactory.makeBoolean(!trans_pred.eql(original_trans_pred));
                        final SubLObject key = (tva_cache.NIL != inverseP) ? arg2 : arg1;
                        final SubLObject implicit_key = (tva_cache.NIL != inverseP) ? arg1 : arg2;
                        tva_cache_ensure_cache_has_key(v_cache, implicit_key);
                        tva_cache_note_implicit_key_supports(v_cache, key, implicit_key, (SubLObject)ConsesLow.list(make_tva_cache_support(assertion, inverseP, spec_predP, original_trans_pred)));
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$142, (SubLObject)tva_cache.$list132);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    cache_datum = cdolist_list_var.first();
                }
                cdolist_list_var = inverse_cache_data;
                cache_datum = (SubLObject)tva_cache.NIL;
                cache_datum = cdolist_list_var.first();
                while (tva_cache.NIL != cdolist_list_var) {
                    SubLObject current_$144;
                    final SubLObject datum_$143 = current_$144 = cache_datum;
                    SubLObject v_cache = (SubLObject)tva_cache.NIL;
                    SubLObject inverseP = (SubLObject)tva_cache.NIL;
                    SubLObject original_trans_pred = (SubLObject)tva_cache.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$144, datum_$143, (SubLObject)tva_cache.$list132);
                    v_cache = current_$144.first();
                    current_$144 = current_$144.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$144, datum_$143, (SubLObject)tva_cache.$list132);
                    inverseP = current_$144.first();
                    current_$144 = current_$144.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$144, datum_$143, (SubLObject)tva_cache.$list132);
                    original_trans_pred = current_$144.first();
                    current_$144 = current_$144.rest();
                    if (tva_cache.NIL == current_$144) {
                        final SubLObject spec_predP = (SubLObject)SubLObjectFactory.makeBoolean(!trans_pred.eql(original_trans_pred));
                        final SubLObject key = (tva_cache.NIL != inverseP) ? arg1 : arg2;
                        final SubLObject implicit_key = (tva_cache.NIL != inverseP) ? arg2 : arg1;
                        tva_cache_ensure_cache_has_key(v_cache, implicit_key);
                        tva_cache_note_implicit_key_supports(v_cache, key, implicit_key, (SubLObject)ConsesLow.list(make_tva_cache_support(assertion, inverseP, spec_predP, original_trans_pred)));
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$143, (SubLObject)tva_cache.$list132);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    cache_datum = cdolist_list_var.first();
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_cache.$list131);
        }
        return (SubLObject)tva_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 27008L)
    public static SubLObject add_tva_cache_key_cached(final SubLObject assertion) {
        SubLObject caching_state = tva_cache.$add_tva_cache_key_cached_caching_state$.getGlobalValue();
        if (tva_cache.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)tva_cache.$sym130$ADD_TVA_CACHE_KEY_CACHED, (SubLObject)tva_cache.$sym133$_ADD_TVA_CACHE_KEY_CACHED_CACHING_STATE_, (SubLObject)tva_cache.NIL, (SubLObject)tva_cache.EQL, (SubLObject)tva_cache.ONE_INTEGER, (SubLObject)tva_cache.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, assertion, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(add_tva_cache_key_cached_internal(assertion)));
            memoization_state.caching_state_put(caching_state, assertion, results, (SubLObject)tva_cache.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 28346L)
    public static SubLObject remove_tva_cache_key(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (tva_cache.NIL != tva_cache.$update_tva_cacheP$.getDynamicValue(thread)) {}
        return (SubLObject)tva_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 28674L)
    public static SubLObject tva_cache_add_transitive_via_arg(final SubLObject tva_gaf) {
        final SubLObject formula = assertions_high.gaf_hl_formula(tva_gaf);
        final SubLObject bin_pred = cycl_utilities.formula_arg1(formula, (SubLObject)tva_cache.UNPROVIDED);
        final SubLObject index_argnum = cycl_utilities.formula_arg3(formula, (SubLObject)tva_cache.UNPROVIDED);
        final SubLObject v_cache = tva_cache_for_predicate_and_index_argnum(bin_pred, index_argnum);
        if (tva_cache.NIL != v_cache) {
            _csetf_tva_cache_tva_pred_gafs(v_cache, (SubLObject)ConsesLow.cons(tva_gaf, tva_cache_tva_pred_gafs(v_cache)));
            tva_cache_add_trans_gaf(v_cache, tva_gaf, invert_binary_argnum(index_argnum), index_argnum);
        }
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 29154L)
    public static SubLObject tva_cache_add_transitive_via_arg_inverse(final SubLObject tvai_gaf) {
        final SubLObject formula = assertions_high.gaf_hl_formula(tvai_gaf);
        final SubLObject bin_pred = cycl_utilities.formula_arg1(formula, (SubLObject)tva_cache.UNPROVIDED);
        final SubLObject index_argnum = cycl_utilities.formula_arg3(formula, (SubLObject)tva_cache.UNPROVIDED);
        final SubLObject v_cache = tva_cache_for_predicate_and_index_argnum(bin_pred, index_argnum);
        if (tva_cache.NIL != v_cache) {
            _csetf_tva_cache_tvai_pred_gafs(v_cache, (SubLObject)ConsesLow.cons(tvai_gaf, tva_cache_tvai_pred_gafs(v_cache)));
            tva_cache_add_trans_gaf(v_cache, tvai_gaf, invert_binary_argnum(index_argnum), index_argnum);
        }
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 29656L)
    public static SubLObject tva_cache_remove_transitive_via_arg(final SubLObject tva_gaf) {
        SubLObject current;
        final SubLObject datum = current = assertions_high.gaf_args(tva_gaf);
        SubLObject bin_pred = (SubLObject)tva_cache.NIL;
        SubLObject arg2 = (SubLObject)tva_cache.NIL;
        SubLObject index_argnum = (SubLObject)tva_cache.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list135);
        bin_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list135);
        arg2 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list135);
        index_argnum = current.first();
        current = current.rest();
        if (tva_cache.NIL == current) {
            final SubLObject v_cache = tva_cache_for_predicate_and_index_argnum(bin_pred, index_argnum);
            if (tva_cache.NIL != v_cache) {
                _csetf_tva_cache_tva_pred_gafs(v_cache, Sequences.remove(tva_gaf, tva_cache_tva_pred_gafs(v_cache), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED));
            }
            return v_cache;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_cache.$list135);
        return (SubLObject)tva_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 30074L)
    public static SubLObject tva_cache_remove_transitive_via_arg_inverse(final SubLObject tvai_gaf) {
        SubLObject current;
        final SubLObject datum = current = assertions_high.gaf_args(tvai_gaf);
        SubLObject bin_pred = (SubLObject)tva_cache.NIL;
        SubLObject arg2 = (SubLObject)tva_cache.NIL;
        SubLObject index_argnum = (SubLObject)tva_cache.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list135);
        bin_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list135);
        arg2 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list135);
        index_argnum = current.first();
        current = current.rest();
        if (tva_cache.NIL == current) {
            final SubLObject v_cache = tva_cache_for_predicate_and_index_argnum(bin_pred, index_argnum);
            if (tva_cache.NIL != v_cache) {
                _csetf_tva_cache_tvai_pred_gafs(v_cache, Sequences.remove(tvai_gaf, tva_cache_tvai_pred_gafs(v_cache), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED));
            }
            return v_cache;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_cache.$list135);
        return (SubLObject)tva_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 30513L)
    public static SubLObject tva_cache_add_trans_gaf(final SubLObject v_cache, final SubLObject trans_gaf, final SubLObject index_arg, final SubLObject gather_arg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject iterator = map_utilities.new_map_iterator(tva_cache_map(v_cache));
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)tva_cache.NIL; tva_cache.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(tva_cache.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (tva_cache.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = (SubLObject)tva_cache.NIL;
                SubLObject value = (SubLObject)tva_cache.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list136);
                key = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list136);
                value = current.first();
                current = current.rest();
                if (tva_cache.NIL == current) {
                    tva_cache_note_implicit_keys_from_trans_gaf(v_cache, key, trans_gaf, index_arg, gather_arg);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_cache.$list136);
                }
            }
        }
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 30763L)
    public static SubLObject create_tva_cache(final SubLObject binary_predicate, final SubLObject index_argnum, SubLObject initializeP) {
        if (initializeP == tva_cache.UNPROVIDED) {
            initializeP = (SubLObject)tva_cache.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert tva_cache.NIL != kb_accessors.binary_predicateP(binary_predicate) : binary_predicate;
        final SubLObject v_cache = make_tva_cache((SubLObject)tva_cache.UNPROVIDED);
        _csetf_tva_cache_pred(v_cache, binary_predicate);
        _csetf_tva_cache_index_argnum(v_cache, index_argnum);
        _csetf_tva_cache_map(v_cache, dictionary.new_dictionary(Symbols.symbol_function((SubLObject)tva_cache.EQUAL), (SubLObject)tva_cache.UNPROVIDED));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)tva_cache.$sym12$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind(tva_cache.$const13$InferencePSC, thread);
            SubLObject pred_var = tva_cache.$const138$transitiveViaArg;
            if (tva_cache.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(binary_predicate, (SubLObject)tva_cache.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(binary_predicate, (SubLObject)tva_cache.ONE_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)tva_cache.NIL;
                final SubLObject token_var = (SubLObject)tva_cache.NIL;
                while (tva_cache.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (tva_cache.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)tva_cache.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)tva_cache.$kw15$GAF, (SubLObject)tva_cache.$kw139$TRUE, (SubLObject)tva_cache.NIL);
                            SubLObject done_var_$146 = (SubLObject)tva_cache.NIL;
                            final SubLObject token_var_$147 = (SubLObject)tva_cache.NIL;
                            while (tva_cache.NIL == done_var_$146) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$147);
                                final SubLObject valid_$148 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$147.eql(gaf));
                                if (tva_cache.NIL != valid_$148) {
                                    _csetf_tva_cache_tva_pred_gafs(v_cache, (SubLObject)ConsesLow.cons(gaf, tva_cache_tva_pred_gafs(v_cache)));
                                }
                                done_var_$146 = (SubLObject)SubLObjectFactory.makeBoolean(tva_cache.NIL == valid_$148);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$149 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_cache.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (tva_cache.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$149, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(tva_cache.NIL == valid);
                }
            }
            pred_var = tva_cache.$const140$transitiveViaArgInverse;
            if (tva_cache.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(binary_predicate, (SubLObject)tva_cache.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(binary_predicate, (SubLObject)tva_cache.ONE_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)tva_cache.NIL;
                final SubLObject token_var = (SubLObject)tva_cache.NIL;
                while (tva_cache.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (tva_cache.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)tva_cache.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)tva_cache.$kw15$GAF, (SubLObject)tva_cache.$kw139$TRUE, (SubLObject)tva_cache.NIL);
                            SubLObject done_var_$147 = (SubLObject)tva_cache.NIL;
                            final SubLObject token_var_$148 = (SubLObject)tva_cache.NIL;
                            while (tva_cache.NIL == done_var_$147) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$148);
                                final SubLObject valid_$149 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$148.eql(gaf));
                                if (tva_cache.NIL != valid_$149) {
                                    _csetf_tva_cache_tvai_pred_gafs(v_cache, (SubLObject)ConsesLow.cons(gaf, tva_cache_tvai_pred_gafs(v_cache)));
                                }
                                done_var_$147 = (SubLObject)SubLObjectFactory.makeBoolean(tva_cache.NIL == valid_$149);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$150 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_cache.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                if (tva_cache.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$150, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(tva_cache.NIL == valid);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (tva_cache.NIL != initializeP) {
            initialize_tva_cache(v_cache);
        }
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 31663L)
    public static SubLObject initialize_tva_cache(final SubLObject v_cache) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = tva_cache_pred(v_cache);
        final SubLObject index_argnum = tva_cache_index_argnum(v_cache);
        dictionary_utilities.dictionary_remove_from_value(tva_cache.$tva_cache_registry$.getGlobalValue(), predicate, v_cache, Symbols.symbol_function((SubLObject)tva_cache.EQ), (SubLObject)tva_cache.UNPROVIDED);
        map_utilities.map_remove_all(tva_cache_map(v_cache));
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_5 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)tva_cache.FIVE_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)tva_cache.T, thread);
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)tva_cache.$sym12$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind(tva_cache.$const13$InferencePSC, thread);
            tva_cache_asserted_values(v_cache);
            tva_cache_relation_all_instance_values(v_cache);
            tva_cache_relation_instance_all_values(v_cache);
            register_tva_cache(v_cache);
            SubLObject error_message = (SubLObject)tva_cache.NIL;
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0_$154 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)tva_cache.$sym17$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject node_var = predicate;
                        final SubLObject deck_type = (SubLObject)tva_cache.$kw61$QUEUE;
                        final SubLObject recur_deck = deck.create_deck(deck_type);
                        SubLObject node_and_predicate_mode = (SubLObject)tva_cache.NIL;
                        final SubLObject _prev_bind_0_$155 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject tv_var = tva_cache.$const62$True_JustificationTruth;
                                final SubLObject _prev_bind_0_$156 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$157 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind((tva_cache.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((tva_cache.NIL != tv_var) ? tva_cache.$sym63$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                    if (tva_cache.NIL != tv_var && tva_cache.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && tva_cache.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql((SubLObject)tva_cache.$kw64$ERROR)) {
                                            sbhl_paranoia.sbhl_error((SubLObject)tva_cache.ONE_INTEGER, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                        }
                                        else if (pcase_var.eql((SubLObject)tva_cache.$kw67$CERROR)) {
                                            sbhl_paranoia.sbhl_cerror((SubLObject)tva_cache.ONE_INTEGER, (SubLObject)tva_cache.$str68$continue_anyway, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                        }
                                        else if (pcase_var.eql((SubLObject)tva_cache.$kw69$WARN)) {
                                            Errors.warn((SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P);
                                        }
                                        else {
                                            Errors.warn((SubLObject)tva_cache.$str70$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror((SubLObject)tva_cache.$str68$continue_anyway, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P);
                                        }
                                    }
                                    final SubLObject _prev_bind_0_$157 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$158 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$160 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_3_$161 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_4_$162 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds)), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_cache.NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds), thread);
                                        if (tva_cache.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || tva_cache.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(predicate, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) {
                                            final SubLObject _prev_bind_0_$158 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$159 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$161 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds)), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_cache.NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)tva_cache.UNPROVIDED);
                                                for (node_and_predicate_mode = (SubLObject)ConsesLow.list(predicate, sbhl_search_vars.genl_inverse_mode_p()); tva_cache.NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                                    final SubLObject node_var_$166 = node_and_predicate_mode.first();
                                                    final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                                    final SubLObject spec_pred = node_var_$166;
                                                    final SubLObject _prev_bind_0_$159 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                        final SubLObject inverseP = predicate_mode;
                                                        if (!spec_pred.equal(predicate)) {
                                                            final SubLObject this_index_arg = (tva_cache.NIL != inverseP) ? invert_binary_argnum(index_argnum) : index_argnum;
                                                            ensure_tva_cache_created(spec_pred, this_index_arg);
                                                        }
                                                        SubLObject cdolist_list_var;
                                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds));
                                                        SubLObject module_var = (SubLObject)tva_cache.NIL;
                                                        module_var = cdolist_list_var.first();
                                                        while (tva_cache.NIL != cdolist_list_var) {
                                                            final SubLObject _prev_bind_0_$160 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$160 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((tva_cache.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(tva_cache.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                                final SubLObject node = function_terms.naut_to_nart(node_var_$166);
                                                                if (tva_cache.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                                    if (tva_cache.NIL != d_link) {
                                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                                        if (tva_cache.NIL != mt_links) {
                                                                            SubLObject iteration_state;
                                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (tva_cache.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                    final SubLObject _prev_bind_0_$161 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                        SubLObject iteration_state_$171;
                                                                                        for (iteration_state_$171 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$171); iteration_state_$171 = dictionary_contents.do_dictionary_contents_next(iteration_state_$171)) {
                                                                                            thread.resetMultipleValues();
                                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$171);
                                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (tva_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                final SubLObject _prev_bind_0_$162 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                    final SubLObject sol = link_nodes;
                                                                                                    if (tva_cache.NIL != set.set_p(sol)) {
                                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                        SubLObject basis_object;
                                                                                                        SubLObject state;
                                                                                                        SubLObject node_vars_link_node;
                                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)tva_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                            if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)tva_cache.UNPROVIDED);
                                                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    else if (sol.isList()) {
                                                                                                        SubLObject csome_list_var = sol;
                                                                                                        SubLObject node_vars_link_node2 = (SubLObject)tva_cache.NIL;
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                        while (tva_cache.NIL != csome_list_var) {
                                                                                                            if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)tva_cache.UNPROVIDED);
                                                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                            }
                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                                        }
                                                                                                    }
                                                                                                    else {
                                                                                                        Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }
                                                                                                }
                                                                                                finally {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$162, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$171);
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$161, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                        }
                                                                    }
                                                                    else {
                                                                        sbhl_paranoia.sbhl_error((SubLObject)tva_cache.FIVE_INTEGER, (SubLObject)tva_cache.$str72$attempting_to_bind_direction_link, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                                                    }
                                                                }
                                                                else if (tva_cache.NIL != obsolete.cnat_p(node, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                    SubLObject cdolist_list_var_$173;
                                                                    final SubLObject new_list = cdolist_list_var_$173 = ((tva_cache.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED)));
                                                                    SubLObject generating_fn = (SubLObject)tva_cache.NIL;
                                                                    generating_fn = cdolist_list_var_$173.first();
                                                                    while (tva_cache.NIL != cdolist_list_var_$173) {
                                                                        final SubLObject _prev_bind_0_$163 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            final SubLObject sol2;
                                                                            final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                            if (tva_cache.NIL != set.set_p(sol2)) {
                                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                SubLObject basis_object2;
                                                                                SubLObject state2;
                                                                                SubLObject node_vars_link_node3;
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)tva_cache.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)tva_cache.UNPROVIDED);
                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                    }
                                                                                }
                                                                            }
                                                                            else if (sol2.isList()) {
                                                                                SubLObject csome_list_var2 = sol2;
                                                                                SubLObject node_vars_link_node4 = (SubLObject)tva_cache.NIL;
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                                while (tva_cache.NIL != csome_list_var2) {
                                                                                    if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)tva_cache.UNPROVIDED);
                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                    }
                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                }
                                                                            }
                                                                            else {
                                                                                Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$163, thread);
                                                                        }
                                                                        cdolist_list_var_$173 = cdolist_list_var_$173.rest();
                                                                        generating_fn = cdolist_list_var_$173.first();
                                                                    }
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$160, thread);
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$160, thread);
                                                            }
                                                            cdolist_list_var = cdolist_list_var.rest();
                                                            module_var = cdolist_list_var.first();
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$159, thread);
                                                    }
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$161, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$159, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$158, thread);
                                            }
                                        }
                                        else {
                                            sbhl_paranoia.sbhl_warn((SubLObject)tva_cache.TWO_INTEGER, (SubLObject)tva_cache.$str73$Node__a_does_not_pass_sbhl_type_t, predicate, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED)), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4_$162, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3_$161, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$160, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$158, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$157, thread);
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$157, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$156, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$164 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_cache.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$164, thread);
                                }
                            }
                        }
                        finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$155, thread);
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)tva_cache.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0_$154, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            if (tva_cache.NIL != error_message) {
                Errors.warn((SubLObject)tva_cache.$str141$Error_initializing__S_____S___Der, v_cache, error_message);
                deregister_tva_cache(v_cache, (SubLObject)tva_cache.UNPROVIDED);
                Errors.error(error_message);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_5, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 32697L)
    public static SubLObject tva_cache_asserted_values(final SubLObject v_cache) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = tva_cache_pred(v_cache);
        final SubLObject index_argnum = tva_cache_index_argnum(v_cache);
        final SubLObject gather_argnum = invert_binary_argnum(index_argnum);
        final SubLObject inverseP = (SubLObject)tva_cache.NIL;
        final SubLObject this_index_arg = (tva_cache.NIL != inverseP) ? index_argnum : gather_argnum;
        final SubLObject total = kb_indexing.num_predicate_extent_index(predicate, (SubLObject)tva_cache.UNPROVIDED);
        final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$silent_progressP$.bind(tva_cache_silent_progressP(predicate, total, this_index_arg), thread);
            SubLObject sofar = (SubLObject)tva_cache.ZERO_INTEGER;
            SubLObject gafs = (SubLObject)tva_cache.NIL;
            if (total.isPositive()) {
                final SubLObject pred_var = predicate;
                if (tva_cache.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str = (SubLObject)tva_cache.NIL;
                    final SubLObject _prev_bind_0_$176 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
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
                        utilities_macros.$progress_notification_count$.bind((SubLObject)tva_cache.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)tva_cache.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)tva_cache.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)tva_cache.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((tva_cache.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : tva_cache.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = (SubLObject)tva_cache.NIL;
                        final SubLObject token_var = (SubLObject)tva_cache.NIL;
                        while (tva_cache.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (tva_cache.NIL != valid) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator = (SubLObject)tva_cache.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)tva_cache.$kw15$GAF, (SubLObject)tva_cache.$kw139$TRUE, (SubLObject)tva_cache.NIL);
                                    SubLObject done_var_$177 = (SubLObject)tva_cache.NIL;
                                    final SubLObject token_var_$178 = (SubLObject)tva_cache.NIL;
                                    while (tva_cache.NIL == done_var_$177) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$178);
                                        final SubLObject valid_$179 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$178.eql(gaf));
                                        if (tva_cache.NIL != valid_$179) {
                                            gafs = (SubLObject)ConsesLow.cons(gaf, gafs);
                                        }
                                        done_var_$177 = (SubLObject)SubLObjectFactory.makeBoolean(tva_cache.NIL == valid_$179);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$177 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_cache.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (tva_cache.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$177, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(tva_cache.NIL == valid);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$176, thread);
                    }
                }
                final SubLObject _prev_bind_0_$178 = utilities_macros.$percent_progress_delayed_mode_seconds$.currentBinding(thread);
                final SubLObject _prev_bind_9 = utilities_macros.$percent_progress_delayed_mode_string$.currentBinding(thread);
                final SubLObject _prev_bind_10 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_11 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_12 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_13 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$percent_progress_delayed_mode_seconds$.bind((SubLObject)tva_cache.TWO_INTEGER, thread);
                    utilities_macros.$percent_progress_delayed_mode_string$.bind(Sequences.cconcatenate((SubLObject)tva_cache.$str142$TVA_Caching_, new SubLObject[] { format_nil.format_nil_s_no_copy(total), tva_cache.$str143$_, format_nil.format_nil_s_no_copy(predicate), tva_cache.$str144$_assertions___ }), thread);
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)tva_cache.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)tva_cache.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)tva_cache.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(Sequences.cconcatenate((SubLObject)tva_cache.$str142$TVA_Caching_, new SubLObject[] { format_nil.format_nil_s_no_copy(total), tva_cache.$str143$_, format_nil.format_nil_s_no_copy(predicate), tva_cache.$str144$_assertions___ }));
                        SubLObject cdolist_list_var = gafs;
                        SubLObject gaf2 = (SubLObject)tva_cache.NIL;
                        gaf2 = cdolist_list_var.first();
                        while (tva_cache.NIL != cdolist_list_var) {
                            final SubLObject value = assertions_high.gaf_arg(gaf2, this_index_arg);
                            tva_cache_store_one_gaf(v_cache, gaf2, value, predicate, inverseP);
                            sofar = Numbers.add(sofar, (SubLObject)tva_cache.ONE_INTEGER);
                            utilities_macros.note_percent_progress(sofar, total);
                            cdolist_list_var = cdolist_list_var.rest();
                            gaf2 = cdolist_list_var.first();
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$179 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_cache.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$179, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_13, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_12, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_11, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_10, thread);
                    utilities_macros.$percent_progress_delayed_mode_string$.rebind(_prev_bind_9, thread);
                    utilities_macros.$percent_progress_delayed_mode_seconds$.rebind(_prev_bind_0_$178, thread);
                }
            }
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 33544L)
    public static SubLObject tva_cache_relation_all_instance_values(final SubLObject v_cache) {
        final SubLObject predicate = tva_cache_pred(v_cache);
        final SubLObject pred_var = tva_cache.$const145$relationAllInstance;
        if (tva_cache.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, (SubLObject)tva_cache.ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, (SubLObject)tva_cache.ONE_INTEGER, pred_var);
            SubLObject done_var = (SubLObject)tva_cache.NIL;
            final SubLObject token_var = (SubLObject)tva_cache.NIL;
            while (tva_cache.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (tva_cache.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)tva_cache.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)tva_cache.$kw15$GAF, (SubLObject)tva_cache.$kw139$TRUE, (SubLObject)tva_cache.NIL);
                        SubLObject done_var_$183 = (SubLObject)tva_cache.NIL;
                        final SubLObject token_var_$184 = (SubLObject)tva_cache.NIL;
                        while (tva_cache.NIL == done_var_$183) {
                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$184);
                            final SubLObject valid_$185 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$184.eql(gaf));
                            if (tva_cache.NIL != valid_$185) {
                                tva_cache_add_one_relation_all_instance_gaf(v_cache, gaf);
                            }
                            done_var_$183 = (SubLObject)SubLObjectFactory.makeBoolean(tva_cache.NIL == valid_$185);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)tva_cache.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (tva_cache.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(tva_cache.NIL == valid);
            }
        }
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 33891L)
    public static SubLObject clear_tva_cache_max_instances_to_cache() {
        final SubLObject cs = tva_cache.$tva_cache_max_instances_to_cache_caching_state$.getGlobalValue();
        if (tva_cache.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)tva_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 33891L)
    public static SubLObject remove_tva_cache_max_instances_to_cache() {
        return memoization_state.caching_state_remove_function_results_with_args(tva_cache.$tva_cache_max_instances_to_cache_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(tva_cache.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 33891L)
    public static SubLObject tva_cache_max_instances_to_cache_internal() {
        return Numbers.integerDivide(forts.fort_count(), (SubLObject)tva_cache.$int147$25);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 33891L)
    public static SubLObject tva_cache_max_instances_to_cache() {
        SubLObject caching_state = tva_cache.$tva_cache_max_instances_to_cache_caching_state$.getGlobalValue();
        if (tva_cache.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)tva_cache.$sym146$TVA_CACHE_MAX_INSTANCES_TO_CACHE, (SubLObject)tva_cache.$sym148$_TVA_CACHE_MAX_INSTANCES_TO_CACHE_CACHING_STATE_, (SubLObject)tva_cache.NIL, (SubLObject)tva_cache.EQL, (SubLObject)tva_cache.ZERO_INTEGER, (SubLObject)tva_cache.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)tva_cache.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(tva_cache_max_instances_to_cache_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)tva_cache.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 34185L)
    public static SubLObject tva_cache_add_one_relation_all_instance_gaf(final SubLObject v_cache, final SubLObject gaf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject index_argnum = tva_cache_index_argnum(v_cache);
        final SubLObject common_value = assertions_high.gaf_arg3(gaf);
        final SubLObject domain_col = assertions_high.gaf_arg2(gaf);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)tva_cache.$sym12$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind(tva_cache.$const13$InferencePSC, thread);
            if (tva_cache.NIL != kb_indexing_datastructures.indexed_term_p(domain_col) && cardinality_estimates.instance_cardinality(domain_col).numLE(tva_cache_max_instances_to_cache())) {
                final SubLObject node_var = domain_col;
                final SubLObject _prev_bind_0_$186 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                final SubLObject _prev_bind_1_$187 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa), thread);
                    sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        SubLObject node_var_$188 = node_var;
                        final SubLObject deck_type = (SubLObject)tva_cache.$kw60$STACK;
                        final SubLObject recur_deck = deck.create_deck(deck_type);
                        final SubLObject _prev_bind_0_$187 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject tv_var = (SubLObject)tva_cache.NIL;
                                final SubLObject _prev_bind_0_$188 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$188 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind((tva_cache.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((tva_cache.NIL != tv_var) ? tva_cache.$sym63$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                    if (tva_cache.NIL != tv_var && tva_cache.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && tva_cache.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql((SubLObject)tva_cache.$kw64$ERROR)) {
                                            sbhl_paranoia.sbhl_error((SubLObject)tva_cache.ONE_INTEGER, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                        }
                                        else if (pcase_var.eql((SubLObject)tva_cache.$kw67$CERROR)) {
                                            sbhl_paranoia.sbhl_cerror((SubLObject)tva_cache.ONE_INTEGER, (SubLObject)tva_cache.$str68$continue_anyway, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                        }
                                        else if (pcase_var.eql((SubLObject)tva_cache.$kw69$WARN)) {
                                            Errors.warn((SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P);
                                        }
                                        else {
                                            Errors.warn((SubLObject)tva_cache.$str70$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror((SubLObject)tva_cache.$str68$continue_anyway, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P);
                                        }
                                    }
                                    final SubLObject _prev_bind_0_$189 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$189 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa)), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa))), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_cache.NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa)), thread);
                                        if (tva_cache.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || tva_cache.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) {
                                            final SubLObject _prev_bind_0_$190 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$190 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$196 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa))), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_cache.NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$188, (SubLObject)tva_cache.UNPROVIDED);
                                                while (tva_cache.NIL != node_var_$188) {
                                                    final SubLObject tt_node_var = node_var_$188;
                                                    SubLObject cdolist_list_var;
                                                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa));
                                                    SubLObject module_var = (SubLObject)tva_cache.NIL;
                                                    module_var = cdolist_list_var.first();
                                                    while (tva_cache.NIL != cdolist_list_var) {
                                                        final SubLObject _prev_bind_0_$191 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$191 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((tva_cache.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(tva_cache.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                            final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                            if (tva_cache.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                                if (tva_cache.NIL != d_link) {
                                                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                                    if (tva_cache.NIL != mt_links) {
                                                                        SubLObject iteration_state;
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (tva_cache.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                final SubLObject _prev_bind_0_$192 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                    SubLObject iteration_state_$200;
                                                                                    for (iteration_state_$200 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$200); iteration_state_$200 = dictionary_contents.do_dictionary_contents_next(iteration_state_$200)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$200);
                                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (tva_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            final SubLObject _prev_bind_0_$193 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                final SubLObject sol = link_nodes;
                                                                                                if (tva_cache.NIL != set.set_p(sol)) {
                                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                    SubLObject basis_object;
                                                                                                    SubLObject state;
                                                                                                    SubLObject instance;
                                                                                                    SubLObject key;
                                                                                                    SubLObject value;
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)tva_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state, instance) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            key = (index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? instance : common_value);
                                                                                                            value = (index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? common_value : instance);
                                                                                                            if (tva_cache.NIL != kb_indexing_datastructures.indexed_term_p(key)) {
                                                                                                                tva_cache_ensure_cache_has_key(v_cache, key);
                                                                                                                tva_cache_note_key_value_supports(v_cache, key, value, (SubLObject)ConsesLow.list(make_tva_cache_complex_support((SubLObject)ConsesLow.list(gaf, make_tva_cache_hl_support((SubLObject)ConsesLow.list(tva_cache.$const149$isa, instance, domain_col), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)))));
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject instance2 = (SubLObject)tva_cache.NIL;
                                                                                                    instance2 = csome_list_var.first();
                                                                                                    while (tva_cache.NIL != csome_list_var) {
                                                                                                        if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            final SubLObject key2 = index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? instance2 : common_value;
                                                                                                            final SubLObject value2 = index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? common_value : instance2;
                                                                                                            if (tva_cache.NIL != kb_indexing_datastructures.indexed_term_p(key2)) {
                                                                                                                tva_cache_ensure_cache_has_key(v_cache, key2);
                                                                                                                tva_cache_note_key_value_supports(v_cache, key2, value2, (SubLObject)ConsesLow.list(make_tva_cache_complex_support((SubLObject)ConsesLow.list(gaf, make_tva_cache_hl_support((SubLObject)ConsesLow.list(tva_cache.$const149$isa, instance2, domain_col), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)))));
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        instance2 = csome_list_var.first();
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$193, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$200);
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$192, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                }
                                                                else {
                                                                    sbhl_paranoia.sbhl_error((SubLObject)tva_cache.FIVE_INTEGER, (SubLObject)tva_cache.$str72$attempting_to_bind_direction_link, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                                                }
                                                                if (tva_cache.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) {
                                                                    SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                    SubLObject instance_tuple = (SubLObject)tva_cache.NIL;
                                                                    instance_tuple = csome_list_var2.first();
                                                                    while (tva_cache.NIL != csome_list_var2) {
                                                                        SubLObject current;
                                                                        final SubLObject datum = current = instance_tuple;
                                                                        SubLObject link_node = (SubLObject)tva_cache.NIL;
                                                                        SubLObject mt2 = (SubLObject)tva_cache.NIL;
                                                                        SubLObject tv2 = (SubLObject)tva_cache.NIL;
                                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list150);
                                                                        link_node = current.first();
                                                                        current = current.rest();
                                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list150);
                                                                        mt2 = current.first();
                                                                        current = current.rest();
                                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list150);
                                                                        tv2 = current.first();
                                                                        current = current.rest();
                                                                        if (tva_cache.NIL == current) {
                                                                            if (tva_cache.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                                final SubLObject _prev_bind_0_$194 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                    if (tva_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$195 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol;
                                                                                            final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                            if (tva_cache.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject instance;
                                                                                                SubLObject key;
                                                                                                SubLObject value;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)tva_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state, instance) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        key = (index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? instance : common_value);
                                                                                                        value = (index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? common_value : instance);
                                                                                                        if (tva_cache.NIL != kb_indexing_datastructures.indexed_term_p(key)) {
                                                                                                            tva_cache_ensure_cache_has_key(v_cache, key);
                                                                                                            tva_cache_note_key_value_supports(v_cache, key, value, (SubLObject)ConsesLow.list(make_tva_cache_complex_support((SubLObject)ConsesLow.list(gaf, make_tva_cache_hl_support((SubLObject)ConsesLow.list(tva_cache.$const149$isa, instance, domain_col), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)))));
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var_$204 = sol;
                                                                                                SubLObject instance2 = (SubLObject)tva_cache.NIL;
                                                                                                instance2 = csome_list_var_$204.first();
                                                                                                while (tva_cache.NIL != csome_list_var_$204) {
                                                                                                    if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        final SubLObject key2 = index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? instance2 : common_value;
                                                                                                        final SubLObject value2 = index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? common_value : instance2;
                                                                                                        if (tva_cache.NIL != kb_indexing_datastructures.indexed_term_p(key2)) {
                                                                                                            tva_cache_ensure_cache_has_key(v_cache, key2);
                                                                                                            tva_cache_note_key_value_supports(v_cache, key2, value2, (SubLObject)ConsesLow.list(make_tva_cache_complex_support((SubLObject)ConsesLow.list(gaf, make_tva_cache_hl_support((SubLObject)ConsesLow.list(tva_cache.$const149$isa, instance2, domain_col), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)))));
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var_$204 = csome_list_var_$204.rest();
                                                                                                    instance2 = csome_list_var_$204.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$195, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$194, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        else {
                                                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_cache.$list150);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        instance_tuple = csome_list_var2.first();
                                                                    }
                                                                }
                                                            }
                                                            else if (tva_cache.NIL != obsolete.cnat_p(node, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$205;
                                                                final SubLObject new_list = cdolist_list_var_$205 = ((tva_cache.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED)));
                                                                SubLObject generating_fn = (SubLObject)tva_cache.NIL;
                                                                generating_fn = cdolist_list_var_$205.first();
                                                                while (tva_cache.NIL != cdolist_list_var_$205) {
                                                                    final SubLObject _prev_bind_0_$196 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                        if (tva_cache.NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject instance3;
                                                                            SubLObject key3;
                                                                            SubLObject value3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)tva_cache.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                instance3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state2, instance3) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    key3 = (index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? instance3 : common_value);
                                                                                    value3 = (index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? common_value : instance3);
                                                                                    if (tva_cache.NIL != kb_indexing_datastructures.indexed_term_p(key3)) {
                                                                                        tva_cache_ensure_cache_has_key(v_cache, key3);
                                                                                        tva_cache_note_key_value_supports(v_cache, key3, value3, (SubLObject)ConsesLow.list(make_tva_cache_complex_support((SubLObject)ConsesLow.list(gaf, make_tva_cache_hl_support((SubLObject)ConsesLow.list(tva_cache.$const149$isa, instance3, domain_col), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)))));
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (sol2.isList()) {
                                                                            SubLObject csome_list_var3 = sol2;
                                                                            SubLObject instance4 = (SubLObject)tva_cache.NIL;
                                                                            instance4 = csome_list_var3.first();
                                                                            while (tva_cache.NIL != csome_list_var3) {
                                                                                if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    final SubLObject key4 = index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? instance4 : common_value;
                                                                                    final SubLObject value4 = index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? common_value : instance4;
                                                                                    if (tva_cache.NIL != kb_indexing_datastructures.indexed_term_p(key4)) {
                                                                                        tva_cache_ensure_cache_has_key(v_cache, key4);
                                                                                        tva_cache_note_key_value_supports(v_cache, key4, value4, (SubLObject)ConsesLow.list(make_tva_cache_complex_support((SubLObject)ConsesLow.list(gaf, make_tva_cache_hl_support((SubLObject)ConsesLow.list(tva_cache.$const149$isa, instance4, domain_col), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)))));
                                                                                    }
                                                                                }
                                                                                csome_list_var3 = csome_list_var3.rest();
                                                                                instance4 = csome_list_var3.first();
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$196, thread);
                                                                    }
                                                                    cdolist_list_var_$205 = cdolist_list_var_$205.rest();
                                                                    generating_fn = cdolist_list_var_$205.first();
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$191, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$191, thread);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        module_var = cdolist_list_var.first();
                                                    }
                                                    SubLObject cdolist_list_var2;
                                                    final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa)));
                                                    SubLObject module_var2 = (SubLObject)tva_cache.NIL;
                                                    module_var2 = cdolist_list_var2.first();
                                                    while (tva_cache.NIL != cdolist_list_var2) {
                                                        final SubLObject _prev_bind_0_$197 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$192 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((tva_cache.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(tva_cache.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                            final SubLObject node2 = function_terms.naut_to_nart(node_var_$188);
                                                            if (tva_cache.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                                if (tva_cache.NIL != d_link2) {
                                                                    final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                                    if (tva_cache.NIL != mt_links2) {
                                                                        SubLObject iteration_state2;
                                                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                            final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (tva_cache.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                                final SubLObject _prev_bind_0_$198 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                    SubLObject iteration_state_$201;
                                                                                    for (iteration_state_$201 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$201); iteration_state_$201 = dictionary_contents.do_dictionary_contents_next(iteration_state_$201)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$201);
                                                                                        final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (tva_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                            final SubLObject _prev_bind_0_$199 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                final SubLObject sol3 = link_nodes4;
                                                                                                if (tva_cache.NIL != set.set_p(sol3)) {
                                                                                                    final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                    SubLObject basis_object3;
                                                                                                    SubLObject state3;
                                                                                                    SubLObject node_vars_link_node;
                                                                                                    for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)tva_cache.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                        if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)tva_cache.UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (sol3.isList()) {
                                                                                                    SubLObject csome_list_var4 = sol3;
                                                                                                    SubLObject node_vars_link_node2 = (SubLObject)tva_cache.NIL;
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                    while (tva_cache.NIL != csome_list_var4) {
                                                                                                        if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)tva_cache.UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var4 = csome_list_var4.rest();
                                                                                                        node_vars_link_node2 = csome_list_var4.first();
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$199, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$201);
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$198, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                    }
                                                                }
                                                                else {
                                                                    sbhl_paranoia.sbhl_error((SubLObject)tva_cache.FIVE_INTEGER, (SubLObject)tva_cache.$str72$attempting_to_bind_direction_link, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                                                }
                                                            }
                                                            else if (tva_cache.NIL != obsolete.cnat_p(node2, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$206;
                                                                final SubLObject new_list2 = cdolist_list_var_$206 = ((tva_cache.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED)));
                                                                SubLObject generating_fn2 = (SubLObject)tva_cache.NIL;
                                                                generating_fn2 = cdolist_list_var_$206.first();
                                                                while (tva_cache.NIL != cdolist_list_var_$206) {
                                                                    final SubLObject _prev_bind_0_$200 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                        final SubLObject sol4;
                                                                        final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                        if (tva_cache.NIL != set.set_p(sol4)) {
                                                                            final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                            SubLObject basis_object4;
                                                                            SubLObject state4;
                                                                            SubLObject node_vars_link_node3;
                                                                            for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)tva_cache.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)tva_cache.UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (sol4.isList()) {
                                                                            SubLObject csome_list_var5 = sol4;
                                                                            SubLObject node_vars_link_node4 = (SubLObject)tva_cache.NIL;
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                            while (tva_cache.NIL != csome_list_var5) {
                                                                                if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)tva_cache.UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var5 = csome_list_var5.rest();
                                                                                node_vars_link_node4 = csome_list_var5.first();
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$200, thread);
                                                                    }
                                                                    cdolist_list_var_$206 = cdolist_list_var_$206.rest();
                                                                    generating_fn2 = cdolist_list_var_$206.first();
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$192, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$197, thread);
                                                        }
                                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                                        module_var2 = cdolist_list_var2.first();
                                                    }
                                                    node_var_$188 = deck.deck_pop(recur_deck);
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$196, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$190, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$190, thread);
                                            }
                                        }
                                        else {
                                            sbhl_paranoia.sbhl_warn((SubLObject)tva_cache.TWO_INTEGER, (SubLObject)tva_cache.$str73$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED)), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$189, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$189, thread);
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$188, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$188, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$201 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_cache.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$201, thread);
                                }
                            }
                        }
                        finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$187, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$202 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_cache.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$202, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$187, thread);
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$186, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 34978L)
    public static SubLObject tva_cache_add_relation_instance_all_gaf(final SubLObject assertion) {
        SubLObject cdolist_list_var = tva_caches_for_predicate(assertions_high.gaf_arg1(assertion));
        SubLObject v_cache = (SubLObject)tva_cache.NIL;
        v_cache = cdolist_list_var.first();
        while (tva_cache.NIL != cdolist_list_var) {
            tva_cache_add_one_relation_instance_all_gaf(v_cache, assertion);
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 35235L)
    public static SubLObject tva_cache_add_relation_all_instance_gaf(final SubLObject assertion) {
        SubLObject cdolist_list_var = tva_caches_for_predicate(assertions_high.gaf_arg1(assertion));
        SubLObject v_cache = (SubLObject)tva_cache.NIL;
        v_cache = cdolist_list_var.first();
        while (tva_cache.NIL != cdolist_list_var) {
            tva_cache_add_one_relation_all_instance_gaf(v_cache, assertion);
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 35492L)
    public static SubLObject tva_cache_remove_relation_all_instance_gaf(final SubLObject assertion) {
        SubLObject cdolist_list_var = tva_caches_for_predicate(assertions_high.gaf_arg1(assertion));
        SubLObject v_cache = (SubLObject)tva_cache.NIL;
        v_cache = cdolist_list_var.first();
        while (tva_cache.NIL != cdolist_list_var) {
            tva_cache_remove_one_relation_all_instance_gaf(v_cache, assertion);
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 35757L)
    public static SubLObject tva_cache_remove_one_relation_all_instance_gaf(final SubLObject v_cache, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject index_argnum = tva_cache_index_argnum(v_cache);
        final SubLObject domain_col = assertions_high.gaf_arg2(assertion);
        final SubLObject common_value = assertions_high.gaf_arg3(assertion);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)tva_cache.$sym12$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind(tva_cache.$const13$InferencePSC, thread);
            final SubLObject node_var = domain_col;
            final SubLObject _prev_bind_0_$216 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_1_$217 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$218 = node_var;
                    final SubLObject deck_type = (SubLObject)tva_cache.$kw60$STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$217 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = (SubLObject)tva_cache.NIL;
                            final SubLObject _prev_bind_0_$218 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$218 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind((tva_cache.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((tva_cache.NIL != tv_var) ? tva_cache.$sym63$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                if (tva_cache.NIL != tv_var && tva_cache.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && tva_cache.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql((SubLObject)tva_cache.$kw64$ERROR)) {
                                        sbhl_paranoia.sbhl_error((SubLObject)tva_cache.ONE_INTEGER, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)tva_cache.$kw67$CERROR)) {
                                        sbhl_paranoia.sbhl_cerror((SubLObject)tva_cache.ONE_INTEGER, (SubLObject)tva_cache.$str68$continue_anyway, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)tva_cache.$kw69$WARN)) {
                                        Errors.warn((SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P);
                                    }
                                    else {
                                        Errors.warn((SubLObject)tva_cache.$str70$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror((SubLObject)tva_cache.$str68$continue_anyway, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P);
                                    }
                                }
                                final SubLObject _prev_bind_0_$219 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$219 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_cache.NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa)), thread);
                                    if (tva_cache.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || tva_cache.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) {
                                        final SubLObject _prev_bind_0_$220 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$220 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$226 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_cache.NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$218, (SubLObject)tva_cache.UNPROVIDED);
                                            while (tva_cache.NIL != node_var_$218) {
                                                final SubLObject tt_node_var = node_var_$218;
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa));
                                                SubLObject module_var = (SubLObject)tva_cache.NIL;
                                                module_var = cdolist_list_var.first();
                                                while (tva_cache.NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$221 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$221 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((tva_cache.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(tva_cache.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                        if (tva_cache.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                            if (tva_cache.NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                                if (tva_cache.NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (tva_cache.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$222 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$230;
                                                                                for (iteration_state_$230 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$230); iteration_state_$230 = dictionary_contents.do_dictionary_contents_next(iteration_state_$230)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$230);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (tva_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$223 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (tva_cache.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject instance;
                                                                                                SubLObject key;
                                                                                                SubLObject value;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)tva_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state, instance) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        key = (index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? instance : common_value);
                                                                                                        value = (index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? common_value : instance);
                                                                                                        tva_cache_remove_key_value_support(tva_cache_map(v_cache), key, value, assertion);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject instance2 = (SubLObject)tva_cache.NIL;
                                                                                                instance2 = csome_list_var.first();
                                                                                                while (tva_cache.NIL != csome_list_var) {
                                                                                                    if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        final SubLObject key2 = index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? instance2 : common_value;
                                                                                                        final SubLObject value2 = index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? common_value : instance2;
                                                                                                        tva_cache_remove_key_value_support(tva_cache_map(v_cache), key2, value2, assertion);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    instance2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$223, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$230);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$222, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)tva_cache.FIVE_INTEGER, (SubLObject)tva_cache.$str72$attempting_to_bind_direction_link, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                                            }
                                                            if (tva_cache.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) {
                                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                SubLObject instance_tuple = (SubLObject)tva_cache.NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (tva_cache.NIL != csome_list_var2) {
                                                                    SubLObject current;
                                                                    final SubLObject datum = current = instance_tuple;
                                                                    SubLObject link_node = (SubLObject)tva_cache.NIL;
                                                                    SubLObject mt2 = (SubLObject)tva_cache.NIL;
                                                                    SubLObject tv2 = (SubLObject)tva_cache.NIL;
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list150);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list150);
                                                                    mt2 = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list150);
                                                                    tv2 = current.first();
                                                                    current = current.rest();
                                                                    if (tva_cache.NIL == current) {
                                                                        if (tva_cache.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                            final SubLObject _prev_bind_0_$224 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                if (tva_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$225 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                        if (tva_cache.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject instance;
                                                                                            SubLObject key;
                                                                                            SubLObject value;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)tva_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state, instance) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    key = (index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? instance : common_value);
                                                                                                    value = (index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? common_value : instance);
                                                                                                    tva_cache_remove_key_value_support(tva_cache_map(v_cache), key, value, assertion);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var_$234 = sol;
                                                                                            SubLObject instance2 = (SubLObject)tva_cache.NIL;
                                                                                            instance2 = csome_list_var_$234.first();
                                                                                            while (tva_cache.NIL != csome_list_var_$234) {
                                                                                                if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    final SubLObject key2 = index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? instance2 : common_value;
                                                                                                    final SubLObject value2 = index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? common_value : instance2;
                                                                                                    tva_cache_remove_key_value_support(tva_cache_map(v_cache), key2, value2, assertion);
                                                                                                }
                                                                                                csome_list_var_$234 = csome_list_var_$234.rest();
                                                                                                instance2 = csome_list_var_$234.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$225, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$224, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_cache.$list150);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                }
                                                            }
                                                        }
                                                        else if (tva_cache.NIL != obsolete.cnat_p(node, (SubLObject)tva_cache.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$235;
                                                            final SubLObject new_list = cdolist_list_var_$235 = ((tva_cache.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED)));
                                                            SubLObject generating_fn = (SubLObject)tva_cache.NIL;
                                                            generating_fn = cdolist_list_var_$235.first();
                                                            while (tva_cache.NIL != cdolist_list_var_$235) {
                                                                final SubLObject _prev_bind_0_$226 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                    if (tva_cache.NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject instance3;
                                                                        SubLObject key3;
                                                                        SubLObject value3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)tva_cache.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            instance3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state2, instance3) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                key3 = (index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? instance3 : common_value);
                                                                                value3 = (index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? common_value : instance3);
                                                                                tva_cache_remove_key_value_support(tva_cache_map(v_cache), key3, value3, assertion);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        SubLObject csome_list_var3 = sol2;
                                                                        SubLObject instance4 = (SubLObject)tva_cache.NIL;
                                                                        instance4 = csome_list_var3.first();
                                                                        while (tva_cache.NIL != csome_list_var3) {
                                                                            if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                final SubLObject key4 = index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? instance4 : common_value;
                                                                                final SubLObject value4 = index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? common_value : instance4;
                                                                                tva_cache_remove_key_value_support(tva_cache_map(v_cache), key4, value4, assertion);
                                                                            }
                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                            instance4 = csome_list_var3.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$226, thread);
                                                                }
                                                                cdolist_list_var_$235 = cdolist_list_var_$235.rest();
                                                                generating_fn = cdolist_list_var_$235.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$221, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$221, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                }
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa)));
                                                SubLObject module_var2 = (SubLObject)tva_cache.NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (tva_cache.NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$227 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$222 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((tva_cache.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(tva_cache.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var_$218);
                                                        if (tva_cache.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                            if (tva_cache.NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                                if (tva_cache.NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (tva_cache.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                            final SubLObject _prev_bind_0_$228 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                SubLObject iteration_state_$231;
                                                                                for (iteration_state_$231 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$231); iteration_state_$231 = dictionary_contents.do_dictionary_contents_next(iteration_state_$231)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$231);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (tva_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$229 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol3 = link_nodes4;
                                                                                            if (tva_cache.NIL != set.set_p(sol3)) {
                                                                                                final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                SubLObject basis_object3;
                                                                                                SubLObject state3;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)tva_cache.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)tva_cache.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol3.isList()) {
                                                                                                SubLObject csome_list_var4 = sol3;
                                                                                                SubLObject node_vars_link_node2 = (SubLObject)tva_cache.NIL;
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                while (tva_cache.NIL != csome_list_var4) {
                                                                                                    if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)tva_cache.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var4 = csome_list_var4.rest();
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$229, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$231);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$228, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)tva_cache.FIVE_INTEGER, (SubLObject)tva_cache.$str72$attempting_to_bind_direction_link, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (tva_cache.NIL != obsolete.cnat_p(node2, (SubLObject)tva_cache.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$236;
                                                            final SubLObject new_list2 = cdolist_list_var_$236 = ((tva_cache.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED)));
                                                            SubLObject generating_fn2 = (SubLObject)tva_cache.NIL;
                                                            generating_fn2 = cdolist_list_var_$236.first();
                                                            while (tva_cache.NIL != cdolist_list_var_$236) {
                                                                final SubLObject _prev_bind_0_$230 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                    if (tva_cache.NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)tva_cache.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)tva_cache.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol4.isList()) {
                                                                        SubLObject csome_list_var5 = sol4;
                                                                        SubLObject node_vars_link_node4 = (SubLObject)tva_cache.NIL;
                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                        while (tva_cache.NIL != csome_list_var5) {
                                                                            if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)tva_cache.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var5 = csome_list_var5.rest();
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$230, thread);
                                                                }
                                                                cdolist_list_var_$236 = cdolist_list_var_$236.rest();
                                                                generating_fn2 = cdolist_list_var_$236.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$222, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$227, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                }
                                                node_var_$218 = deck.deck_pop(recur_deck);
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$226, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$220, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$220, thread);
                                        }
                                    }
                                    else {
                                        sbhl_paranoia.sbhl_warn((SubLObject)tva_cache.TWO_INTEGER, (SubLObject)tva_cache.$str73$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED)), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                    }
                                }
                                finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$219, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$219, thread);
                                }
                            }
                            finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$218, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$218, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$231 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_cache.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$231, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$217, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$232 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_cache.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$232, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$217, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$216, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)tva_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 36346L)
    public static SubLObject tva_cache_remove_relation_instance_all_gaf(final SubLObject assertion) {
        SubLObject cdolist_list_var = tva_caches_for_predicate(assertions_high.gaf_arg1(assertion));
        SubLObject v_cache = (SubLObject)tva_cache.NIL;
        v_cache = cdolist_list_var.first();
        while (tva_cache.NIL != cdolist_list_var) {
            tva_cache_remove_one_relation_instance_all_gaf(v_cache, assertion);
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 36611L)
    public static SubLObject tva_cache_remove_one_relation_instance_all_gaf(final SubLObject v_cache, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject index_argnum = tva_cache_index_argnum(v_cache);
        final SubLObject common_value = assertions_high.gaf_arg2(assertion);
        final SubLObject domain_col = assertions_high.gaf_arg3(assertion);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)tva_cache.$sym12$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind(tva_cache.$const13$InferencePSC, thread);
            final SubLObject node_var = domain_col;
            final SubLObject _prev_bind_0_$246 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_1_$247 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$248 = node_var;
                    final SubLObject deck_type = (SubLObject)tva_cache.$kw60$STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$247 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = (SubLObject)tva_cache.NIL;
                            final SubLObject _prev_bind_0_$248 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$248 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind((tva_cache.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((tva_cache.NIL != tv_var) ? tva_cache.$sym63$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                if (tva_cache.NIL != tv_var && tva_cache.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && tva_cache.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql((SubLObject)tva_cache.$kw64$ERROR)) {
                                        sbhl_paranoia.sbhl_error((SubLObject)tva_cache.ONE_INTEGER, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)tva_cache.$kw67$CERROR)) {
                                        sbhl_paranoia.sbhl_cerror((SubLObject)tva_cache.ONE_INTEGER, (SubLObject)tva_cache.$str68$continue_anyway, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)tva_cache.$kw69$WARN)) {
                                        Errors.warn((SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P);
                                    }
                                    else {
                                        Errors.warn((SubLObject)tva_cache.$str70$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror((SubLObject)tva_cache.$str68$continue_anyway, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P);
                                    }
                                }
                                final SubLObject _prev_bind_0_$249 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$249 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_cache.NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa)), thread);
                                    if (tva_cache.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || tva_cache.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) {
                                        final SubLObject _prev_bind_0_$250 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$250 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$256 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_cache.NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$248, (SubLObject)tva_cache.UNPROVIDED);
                                            while (tva_cache.NIL != node_var_$248) {
                                                final SubLObject tt_node_var = node_var_$248;
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa));
                                                SubLObject module_var = (SubLObject)tva_cache.NIL;
                                                module_var = cdolist_list_var.first();
                                                while (tva_cache.NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$251 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$251 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((tva_cache.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(tva_cache.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                        if (tva_cache.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                            if (tva_cache.NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                                if (tva_cache.NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (tva_cache.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$252 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$260;
                                                                                for (iteration_state_$260 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$260); iteration_state_$260 = dictionary_contents.do_dictionary_contents_next(iteration_state_$260)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$260);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (tva_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$253 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (tva_cache.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject instance;
                                                                                                SubLObject key;
                                                                                                SubLObject value;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)tva_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state, instance) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        key = (index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? instance : common_value);
                                                                                                        value = (index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? common_value : instance);
                                                                                                        tva_cache_remove_key_value_support(tva_cache_map(v_cache), key, value, assertion);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject instance2 = (SubLObject)tva_cache.NIL;
                                                                                                instance2 = csome_list_var.first();
                                                                                                while (tva_cache.NIL != csome_list_var) {
                                                                                                    if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        final SubLObject key2 = index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? instance2 : common_value;
                                                                                                        final SubLObject value2 = index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? common_value : instance2;
                                                                                                        tva_cache_remove_key_value_support(tva_cache_map(v_cache), key2, value2, assertion);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    instance2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$253, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$260);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$252, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)tva_cache.FIVE_INTEGER, (SubLObject)tva_cache.$str72$attempting_to_bind_direction_link, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                                            }
                                                            if (tva_cache.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) {
                                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                SubLObject instance_tuple = (SubLObject)tva_cache.NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (tva_cache.NIL != csome_list_var2) {
                                                                    SubLObject current;
                                                                    final SubLObject datum = current = instance_tuple;
                                                                    SubLObject link_node = (SubLObject)tva_cache.NIL;
                                                                    SubLObject mt2 = (SubLObject)tva_cache.NIL;
                                                                    SubLObject tv2 = (SubLObject)tva_cache.NIL;
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list150);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list150);
                                                                    mt2 = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list150);
                                                                    tv2 = current.first();
                                                                    current = current.rest();
                                                                    if (tva_cache.NIL == current) {
                                                                        if (tva_cache.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                            final SubLObject _prev_bind_0_$254 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                if (tva_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$255 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                        if (tva_cache.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject instance;
                                                                                            SubLObject key;
                                                                                            SubLObject value;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)tva_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state, instance) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    key = (index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? instance : common_value);
                                                                                                    value = (index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? common_value : instance);
                                                                                                    tva_cache_remove_key_value_support(tva_cache_map(v_cache), key, value, assertion);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var_$264 = sol;
                                                                                            SubLObject instance2 = (SubLObject)tva_cache.NIL;
                                                                                            instance2 = csome_list_var_$264.first();
                                                                                            while (tva_cache.NIL != csome_list_var_$264) {
                                                                                                if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    final SubLObject key2 = index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? instance2 : common_value;
                                                                                                    final SubLObject value2 = index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? common_value : instance2;
                                                                                                    tva_cache_remove_key_value_support(tva_cache_map(v_cache), key2, value2, assertion);
                                                                                                }
                                                                                                csome_list_var_$264 = csome_list_var_$264.rest();
                                                                                                instance2 = csome_list_var_$264.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$255, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$254, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_cache.$list150);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                }
                                                            }
                                                        }
                                                        else if (tva_cache.NIL != obsolete.cnat_p(node, (SubLObject)tva_cache.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$265;
                                                            final SubLObject new_list = cdolist_list_var_$265 = ((tva_cache.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED)));
                                                            SubLObject generating_fn = (SubLObject)tva_cache.NIL;
                                                            generating_fn = cdolist_list_var_$265.first();
                                                            while (tva_cache.NIL != cdolist_list_var_$265) {
                                                                final SubLObject _prev_bind_0_$256 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                    if (tva_cache.NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject instance3;
                                                                        SubLObject key3;
                                                                        SubLObject value3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)tva_cache.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            instance3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state2, instance3) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                key3 = (index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? instance3 : common_value);
                                                                                value3 = (index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? common_value : instance3);
                                                                                tva_cache_remove_key_value_support(tva_cache_map(v_cache), key3, value3, assertion);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        SubLObject csome_list_var3 = sol2;
                                                                        SubLObject instance4 = (SubLObject)tva_cache.NIL;
                                                                        instance4 = csome_list_var3.first();
                                                                        while (tva_cache.NIL != csome_list_var3) {
                                                                            if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                final SubLObject key4 = index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? instance4 : common_value;
                                                                                final SubLObject value4 = index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? common_value : instance4;
                                                                                tva_cache_remove_key_value_support(tva_cache_map(v_cache), key4, value4, assertion);
                                                                            }
                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                            instance4 = csome_list_var3.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$256, thread);
                                                                }
                                                                cdolist_list_var_$265 = cdolist_list_var_$265.rest();
                                                                generating_fn = cdolist_list_var_$265.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$251, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$251, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                }
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa)));
                                                SubLObject module_var2 = (SubLObject)tva_cache.NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (tva_cache.NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$257 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$252 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((tva_cache.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(tva_cache.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var_$248);
                                                        if (tva_cache.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                            if (tva_cache.NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                                if (tva_cache.NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (tva_cache.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                            final SubLObject _prev_bind_0_$258 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                SubLObject iteration_state_$261;
                                                                                for (iteration_state_$261 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$261); iteration_state_$261 = dictionary_contents.do_dictionary_contents_next(iteration_state_$261)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$261);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (tva_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$259 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol3 = link_nodes4;
                                                                                            if (tva_cache.NIL != set.set_p(sol3)) {
                                                                                                final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                SubLObject basis_object3;
                                                                                                SubLObject state3;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)tva_cache.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)tva_cache.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol3.isList()) {
                                                                                                SubLObject csome_list_var4 = sol3;
                                                                                                SubLObject node_vars_link_node2 = (SubLObject)tva_cache.NIL;
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                while (tva_cache.NIL != csome_list_var4) {
                                                                                                    if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)tva_cache.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var4 = csome_list_var4.rest();
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$259, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$261);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$258, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)tva_cache.FIVE_INTEGER, (SubLObject)tva_cache.$str72$attempting_to_bind_direction_link, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (tva_cache.NIL != obsolete.cnat_p(node2, (SubLObject)tva_cache.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$266;
                                                            final SubLObject new_list2 = cdolist_list_var_$266 = ((tva_cache.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED)));
                                                            SubLObject generating_fn2 = (SubLObject)tva_cache.NIL;
                                                            generating_fn2 = cdolist_list_var_$266.first();
                                                            while (tva_cache.NIL != cdolist_list_var_$266) {
                                                                final SubLObject _prev_bind_0_$260 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                    if (tva_cache.NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)tva_cache.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)tva_cache.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol4.isList()) {
                                                                        SubLObject csome_list_var5 = sol4;
                                                                        SubLObject node_vars_link_node4 = (SubLObject)tva_cache.NIL;
                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                        while (tva_cache.NIL != csome_list_var5) {
                                                                            if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)tva_cache.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var5 = csome_list_var5.rest();
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$260, thread);
                                                                }
                                                                cdolist_list_var_$266 = cdolist_list_var_$266.rest();
                                                                generating_fn2 = cdolist_list_var_$266.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$252, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$257, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                }
                                                node_var_$248 = deck.deck_pop(recur_deck);
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$256, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$250, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$250, thread);
                                        }
                                    }
                                    else {
                                        sbhl_paranoia.sbhl_warn((SubLObject)tva_cache.TWO_INTEGER, (SubLObject)tva_cache.$str73$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED)), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                    }
                                }
                                finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$249, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$249, thread);
                                }
                            }
                            finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$248, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$248, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$261 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_cache.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$261, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$247, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$262 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_cache.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$262, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$247, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$246, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)tva_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 37200L)
    public static SubLObject tva_cache_relation_instance_all_values(final SubLObject v_cache) {
        final SubLObject predicate = tva_cache_pred(v_cache);
        final SubLObject pred_var = tva_cache.$const151$relationInstanceAll;
        if (tva_cache.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, (SubLObject)tva_cache.ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, (SubLObject)tva_cache.ONE_INTEGER, pred_var);
            SubLObject done_var = (SubLObject)tva_cache.NIL;
            final SubLObject token_var = (SubLObject)tva_cache.NIL;
            while (tva_cache.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (tva_cache.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)tva_cache.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)tva_cache.$kw15$GAF, (SubLObject)tva_cache.$kw139$TRUE, (SubLObject)tva_cache.NIL);
                        SubLObject done_var_$276 = (SubLObject)tva_cache.NIL;
                        final SubLObject token_var_$277 = (SubLObject)tva_cache.NIL;
                        while (tva_cache.NIL == done_var_$276) {
                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$277);
                            final SubLObject valid_$278 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$277.eql(gaf));
                            if (tva_cache.NIL != valid_$278) {
                                tva_cache_add_one_relation_instance_all_gaf(v_cache, gaf);
                            }
                            done_var_$276 = (SubLObject)SubLObjectFactory.makeBoolean(tva_cache.NIL == valid_$278);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)tva_cache.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (tva_cache.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(tva_cache.NIL == valid);
            }
        }
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 37481L)
    public static SubLObject tva_cache_add_one_relation_instance_all_gaf(final SubLObject v_cache, final SubLObject gaf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject common_value = assertions_high.gaf_arg2(gaf);
        final SubLObject index_argnum = tva_cache_index_argnum(v_cache);
        final SubLObject domain_col = assertions_high.gaf_arg3(gaf);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)tva_cache.$sym12$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind(tva_cache.$const13$InferencePSC, thread);
            if (tva_cache.NIL != kb_indexing_datastructures.indexed_term_p(domain_col) && cardinality_estimates.instance_cardinality(domain_col).numLE(tva_cache_max_instances_to_cache())) {
                final SubLObject node_var = domain_col;
                final SubLObject _prev_bind_0_$279 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                final SubLObject _prev_bind_1_$280 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa), thread);
                    sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        SubLObject node_var_$281 = node_var;
                        final SubLObject deck_type = (SubLObject)tva_cache.$kw60$STACK;
                        final SubLObject recur_deck = deck.create_deck(deck_type);
                        final SubLObject _prev_bind_0_$280 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject tv_var = (SubLObject)tva_cache.NIL;
                                final SubLObject _prev_bind_0_$281 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$281 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind((tva_cache.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((tva_cache.NIL != tv_var) ? tva_cache.$sym63$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                    if (tva_cache.NIL != tv_var && tva_cache.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && tva_cache.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql((SubLObject)tva_cache.$kw64$ERROR)) {
                                            sbhl_paranoia.sbhl_error((SubLObject)tva_cache.ONE_INTEGER, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                        }
                                        else if (pcase_var.eql((SubLObject)tva_cache.$kw67$CERROR)) {
                                            sbhl_paranoia.sbhl_cerror((SubLObject)tva_cache.ONE_INTEGER, (SubLObject)tva_cache.$str68$continue_anyway, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                        }
                                        else if (pcase_var.eql((SubLObject)tva_cache.$kw69$WARN)) {
                                            Errors.warn((SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P);
                                        }
                                        else {
                                            Errors.warn((SubLObject)tva_cache.$str70$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror((SubLObject)tva_cache.$str68$continue_anyway, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P);
                                        }
                                    }
                                    final SubLObject _prev_bind_0_$282 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$282 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa)), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa))), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_cache.NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa)), thread);
                                        if (tva_cache.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || tva_cache.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) {
                                            final SubLObject _prev_bind_0_$283 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$283 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$289 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa))), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_cache.NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$281, (SubLObject)tva_cache.UNPROVIDED);
                                                while (tva_cache.NIL != node_var_$281) {
                                                    final SubLObject tt_node_var = node_var_$281;
                                                    SubLObject cdolist_list_var;
                                                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa));
                                                    SubLObject module_var = (SubLObject)tva_cache.NIL;
                                                    module_var = cdolist_list_var.first();
                                                    while (tva_cache.NIL != cdolist_list_var) {
                                                        final SubLObject _prev_bind_0_$284 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$284 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((tva_cache.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(tva_cache.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                            final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                            if (tva_cache.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                                if (tva_cache.NIL != d_link) {
                                                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                                    if (tva_cache.NIL != mt_links) {
                                                                        SubLObject iteration_state;
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (tva_cache.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                final SubLObject _prev_bind_0_$285 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                    SubLObject iteration_state_$293;
                                                                                    for (iteration_state_$293 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$293); iteration_state_$293 = dictionary_contents.do_dictionary_contents_next(iteration_state_$293)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$293);
                                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (tva_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            final SubLObject _prev_bind_0_$286 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                final SubLObject sol = link_nodes;
                                                                                                if (tva_cache.NIL != set.set_p(sol)) {
                                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                    SubLObject basis_object;
                                                                                                    SubLObject state;
                                                                                                    SubLObject instance;
                                                                                                    SubLObject key;
                                                                                                    SubLObject value;
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)tva_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state, instance) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            key = (index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? common_value : instance);
                                                                                                            value = (index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? instance : common_value);
                                                                                                            if (tva_cache.NIL != kb_indexing_datastructures.indexed_term_p(key)) {
                                                                                                                tva_cache_ensure_cache_has_key(v_cache, key);
                                                                                                                tva_cache_note_key_value_supports(v_cache, key, value, (SubLObject)ConsesLow.list(make_tva_cache_complex_support((SubLObject)ConsesLow.list(gaf, make_tva_cache_hl_support((SubLObject)ConsesLow.list(tva_cache.$const149$isa, instance, domain_col), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)))));
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject instance2 = (SubLObject)tva_cache.NIL;
                                                                                                    instance2 = csome_list_var.first();
                                                                                                    while (tva_cache.NIL != csome_list_var) {
                                                                                                        if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            final SubLObject key2 = index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? common_value : instance2;
                                                                                                            final SubLObject value2 = index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? instance2 : common_value;
                                                                                                            if (tva_cache.NIL != kb_indexing_datastructures.indexed_term_p(key2)) {
                                                                                                                tva_cache_ensure_cache_has_key(v_cache, key2);
                                                                                                                tva_cache_note_key_value_supports(v_cache, key2, value2, (SubLObject)ConsesLow.list(make_tva_cache_complex_support((SubLObject)ConsesLow.list(gaf, make_tva_cache_hl_support((SubLObject)ConsesLow.list(tva_cache.$const149$isa, instance2, domain_col), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)))));
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        instance2 = csome_list_var.first();
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$286, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$293);
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$285, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                }
                                                                else {
                                                                    sbhl_paranoia.sbhl_error((SubLObject)tva_cache.FIVE_INTEGER, (SubLObject)tva_cache.$str72$attempting_to_bind_direction_link, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                                                }
                                                                if (tva_cache.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) {
                                                                    SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                    SubLObject instance_tuple = (SubLObject)tva_cache.NIL;
                                                                    instance_tuple = csome_list_var2.first();
                                                                    while (tva_cache.NIL != csome_list_var2) {
                                                                        SubLObject current;
                                                                        final SubLObject datum = current = instance_tuple;
                                                                        SubLObject link_node = (SubLObject)tva_cache.NIL;
                                                                        SubLObject mt2 = (SubLObject)tva_cache.NIL;
                                                                        SubLObject tv2 = (SubLObject)tva_cache.NIL;
                                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list150);
                                                                        link_node = current.first();
                                                                        current = current.rest();
                                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list150);
                                                                        mt2 = current.first();
                                                                        current = current.rest();
                                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list150);
                                                                        tv2 = current.first();
                                                                        current = current.rest();
                                                                        if (tva_cache.NIL == current) {
                                                                            if (tva_cache.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                                final SubLObject _prev_bind_0_$287 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                    if (tva_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$288 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol;
                                                                                            final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                            if (tva_cache.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject instance;
                                                                                                SubLObject key;
                                                                                                SubLObject value;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)tva_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state, instance) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        key = (index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? common_value : instance);
                                                                                                        value = (index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? instance : common_value);
                                                                                                        if (tva_cache.NIL != kb_indexing_datastructures.indexed_term_p(key)) {
                                                                                                            tva_cache_ensure_cache_has_key(v_cache, key);
                                                                                                            tva_cache_note_key_value_supports(v_cache, key, value, (SubLObject)ConsesLow.list(make_tva_cache_complex_support((SubLObject)ConsesLow.list(gaf, make_tva_cache_hl_support((SubLObject)ConsesLow.list(tva_cache.$const149$isa, instance, domain_col), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)))));
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var_$297 = sol;
                                                                                                SubLObject instance2 = (SubLObject)tva_cache.NIL;
                                                                                                instance2 = csome_list_var_$297.first();
                                                                                                while (tva_cache.NIL != csome_list_var_$297) {
                                                                                                    if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        final SubLObject key2 = index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? common_value : instance2;
                                                                                                        final SubLObject value2 = index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? instance2 : common_value;
                                                                                                        if (tva_cache.NIL != kb_indexing_datastructures.indexed_term_p(key2)) {
                                                                                                            tva_cache_ensure_cache_has_key(v_cache, key2);
                                                                                                            tva_cache_note_key_value_supports(v_cache, key2, value2, (SubLObject)ConsesLow.list(make_tva_cache_complex_support((SubLObject)ConsesLow.list(gaf, make_tva_cache_hl_support((SubLObject)ConsesLow.list(tva_cache.$const149$isa, instance2, domain_col), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)))));
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var_$297 = csome_list_var_$297.rest();
                                                                                                    instance2 = csome_list_var_$297.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$288, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$287, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        else {
                                                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_cache.$list150);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        instance_tuple = csome_list_var2.first();
                                                                    }
                                                                }
                                                            }
                                                            else if (tva_cache.NIL != obsolete.cnat_p(node, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$298;
                                                                final SubLObject new_list = cdolist_list_var_$298 = ((tva_cache.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED)));
                                                                SubLObject generating_fn = (SubLObject)tva_cache.NIL;
                                                                generating_fn = cdolist_list_var_$298.first();
                                                                while (tva_cache.NIL != cdolist_list_var_$298) {
                                                                    final SubLObject _prev_bind_0_$289 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                        if (tva_cache.NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject instance3;
                                                                            SubLObject key3;
                                                                            SubLObject value3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)tva_cache.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                instance3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state2, instance3) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    key3 = (index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? common_value : instance3);
                                                                                    value3 = (index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? instance3 : common_value);
                                                                                    if (tva_cache.NIL != kb_indexing_datastructures.indexed_term_p(key3)) {
                                                                                        tva_cache_ensure_cache_has_key(v_cache, key3);
                                                                                        tva_cache_note_key_value_supports(v_cache, key3, value3, (SubLObject)ConsesLow.list(make_tva_cache_complex_support((SubLObject)ConsesLow.list(gaf, make_tva_cache_hl_support((SubLObject)ConsesLow.list(tva_cache.$const149$isa, instance3, domain_col), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)))));
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (sol2.isList()) {
                                                                            SubLObject csome_list_var3 = sol2;
                                                                            SubLObject instance4 = (SubLObject)tva_cache.NIL;
                                                                            instance4 = csome_list_var3.first();
                                                                            while (tva_cache.NIL != csome_list_var3) {
                                                                                if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    final SubLObject key4 = index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? common_value : instance4;
                                                                                    final SubLObject value4 = index_argnum.eql((SubLObject)tva_cache.ONE_INTEGER) ? instance4 : common_value;
                                                                                    if (tva_cache.NIL != kb_indexing_datastructures.indexed_term_p(key4)) {
                                                                                        tva_cache_ensure_cache_has_key(v_cache, key4);
                                                                                        tva_cache_note_key_value_supports(v_cache, key4, value4, (SubLObject)ConsesLow.list(make_tva_cache_complex_support((SubLObject)ConsesLow.list(gaf, make_tva_cache_hl_support((SubLObject)ConsesLow.list(tva_cache.$const149$isa, instance4, domain_col), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)))));
                                                                                    }
                                                                                }
                                                                                csome_list_var3 = csome_list_var3.rest();
                                                                                instance4 = csome_list_var3.first();
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$289, thread);
                                                                    }
                                                                    cdolist_list_var_$298 = cdolist_list_var_$298.rest();
                                                                    generating_fn = cdolist_list_var_$298.first();
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$284, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$284, thread);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        module_var = cdolist_list_var.first();
                                                    }
                                                    SubLObject cdolist_list_var2;
                                                    final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(tva_cache.$const149$isa)));
                                                    SubLObject module_var2 = (SubLObject)tva_cache.NIL;
                                                    module_var2 = cdolist_list_var2.first();
                                                    while (tva_cache.NIL != cdolist_list_var2) {
                                                        final SubLObject _prev_bind_0_$290 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$285 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((tva_cache.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(tva_cache.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                            final SubLObject node2 = function_terms.naut_to_nart(node_var_$281);
                                                            if (tva_cache.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                                if (tva_cache.NIL != d_link2) {
                                                                    final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                                    if (tva_cache.NIL != mt_links2) {
                                                                        SubLObject iteration_state2;
                                                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                            final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (tva_cache.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                                final SubLObject _prev_bind_0_$291 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                    SubLObject iteration_state_$294;
                                                                                    for (iteration_state_$294 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$294); iteration_state_$294 = dictionary_contents.do_dictionary_contents_next(iteration_state_$294)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$294);
                                                                                        final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (tva_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                            final SubLObject _prev_bind_0_$292 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                final SubLObject sol3 = link_nodes4;
                                                                                                if (tva_cache.NIL != set.set_p(sol3)) {
                                                                                                    final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                    SubLObject basis_object3;
                                                                                                    SubLObject state3;
                                                                                                    SubLObject node_vars_link_node;
                                                                                                    for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)tva_cache.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                        if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)tva_cache.UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (sol3.isList()) {
                                                                                                    SubLObject csome_list_var4 = sol3;
                                                                                                    SubLObject node_vars_link_node2 = (SubLObject)tva_cache.NIL;
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                    while (tva_cache.NIL != csome_list_var4) {
                                                                                                        if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)tva_cache.UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var4 = csome_list_var4.rest();
                                                                                                        node_vars_link_node2 = csome_list_var4.first();
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$292, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$294);
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$291, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                    }
                                                                }
                                                                else {
                                                                    sbhl_paranoia.sbhl_error((SubLObject)tva_cache.FIVE_INTEGER, (SubLObject)tva_cache.$str72$attempting_to_bind_direction_link, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                                                }
                                                            }
                                                            else if (tva_cache.NIL != obsolete.cnat_p(node2, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$299;
                                                                final SubLObject new_list2 = cdolist_list_var_$299 = ((tva_cache.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED)));
                                                                SubLObject generating_fn2 = (SubLObject)tva_cache.NIL;
                                                                generating_fn2 = cdolist_list_var_$299.first();
                                                                while (tva_cache.NIL != cdolist_list_var_$299) {
                                                                    final SubLObject _prev_bind_0_$293 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                        final SubLObject sol4;
                                                                        final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                        if (tva_cache.NIL != set.set_p(sol4)) {
                                                                            final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                            SubLObject basis_object4;
                                                                            SubLObject state4;
                                                                            SubLObject node_vars_link_node3;
                                                                            for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)tva_cache.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)tva_cache.UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (sol4.isList()) {
                                                                            SubLObject csome_list_var5 = sol4;
                                                                            SubLObject node_vars_link_node4 = (SubLObject)tva_cache.NIL;
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                            while (tva_cache.NIL != csome_list_var5) {
                                                                                if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)tva_cache.UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var5 = csome_list_var5.rest();
                                                                                node_vars_link_node4 = csome_list_var5.first();
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$293, thread);
                                                                    }
                                                                    cdolist_list_var_$299 = cdolist_list_var_$299.rest();
                                                                    generating_fn2 = cdolist_list_var_$299.first();
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$285, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$290, thread);
                                                        }
                                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                                        module_var2 = cdolist_list_var2.first();
                                                    }
                                                    node_var_$281 = deck.deck_pop(recur_deck);
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$289, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$283, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$283, thread);
                                            }
                                        }
                                        else {
                                            sbhl_paranoia.sbhl_warn((SubLObject)tva_cache.TWO_INTEGER, (SubLObject)tva_cache.$str73$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED)), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$282, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$282, thread);
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$281, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$281, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$294 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_cache.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$294, thread);
                                }
                            }
                        }
                        finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$280, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$295 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_cache.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$295, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$280, thread);
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$279, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 38274L)
    public static SubLObject tva_cache_silent_progressP(final SubLObject cache_pred, final SubLObject pred_extent_count, final SubLObject index_arg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return utilities_macros.$silent_progressP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 38548L)
    public static SubLObject tva_cache_store_one_gaf(final SubLObject v_cache, final SubLObject gaf, final SubLObject value, final SubLObject spec_pred, final SubLObject inverseP) {
        final SubLObject predicate = tva_cache_pred(v_cache);
        final SubLObject index_arg = tva_cache_index_argnum(v_cache);
        final SubLObject gather_arg = invert_binary_argnum(index_arg);
        final SubLObject this_index_arg = (tva_cache.NIL != inverseP) ? index_arg : gather_arg;
        final SubLObject this_gather_arg = invert_binary_argnum(this_index_arg);
        final SubLObject spec_predP = (SubLObject)SubLObjectFactory.makeBoolean(tva_cache.NIL == inverseP && !spec_pred.eql(predicate));
        final SubLObject key = assertions_high.gaf_arg(gaf, this_gather_arg);
        final SubLObject supports = (SubLObject)ConsesLow.list(make_tva_cache_support(gaf, inverseP, spec_predP, (SubLObject)tva_cache.NIL));
        if (tva_cache.NIL != kb_indexing_datastructures.indexed_term_p(key)) {
            tva_cache_ensure_cache_has_key(v_cache, key);
            tva_cache_note_key_value_supports(v_cache, key, value, supports);
        }
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 39231L)
    public static SubLObject tva_cache_store_one_value(final SubLObject v_cache, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = tva_cache_pred(v_cache);
        final SubLObject index_arg = tva_cache_index_argnum(v_cache);
        final SubLObject gather_arg = invert_binary_argnum(index_arg);
        final SubLObject node_var = predicate;
        final SubLObject deck_type = (SubLObject)tva_cache.$kw61$QUEUE;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = (SubLObject)tva_cache.NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = tva_cache.$const62$True_JustificationTruth;
                final SubLObject _prev_bind_0_$309 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind((tva_cache.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((tva_cache.NIL != tv_var) ? tva_cache.$sym63$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                    if (tva_cache.NIL != tv_var && tva_cache.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && tva_cache.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql((SubLObject)tva_cache.$kw64$ERROR)) {
                            sbhl_paranoia.sbhl_error((SubLObject)tva_cache.ONE_INTEGER, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                        }
                        else if (pcase_var.eql((SubLObject)tva_cache.$kw67$CERROR)) {
                            sbhl_paranoia.sbhl_cerror((SubLObject)tva_cache.ONE_INTEGER, (SubLObject)tva_cache.$str68$continue_anyway, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                        }
                        else if (pcase_var.eql((SubLObject)tva_cache.$kw69$WARN)) {
                            Errors.warn((SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P);
                        }
                        else {
                            Errors.warn((SubLObject)tva_cache.$str70$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                            Errors.cerror((SubLObject)tva_cache.$str68$continue_anyway, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P);
                        }
                    }
                    final SubLObject _prev_bind_0_$310 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$311 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_cache.NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds), thread);
                        if (tva_cache.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || tva_cache.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(predicate, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) {
                            final SubLObject _prev_bind_0_$311 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$312 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$314 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_cache.NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)tva_cache.UNPROVIDED);
                                for (node_and_predicate_mode = (SubLObject)ConsesLow.list(predicate, sbhl_search_vars.genl_inverse_mode_p()); tva_cache.NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                    final SubLObject node_var_$315 = node_and_predicate_mode.first();
                                    final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                    final SubLObject spec_pred = node_var_$315;
                                    final SubLObject _prev_bind_0_$312 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                        final SubLObject inverseP = predicate_mode;
                                        final SubLObject this_index_arg = (tva_cache.NIL != inverseP) ? index_arg : gather_arg;
                                        SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs(value, spec_pred, this_index_arg, (SubLObject)tva_cache.$kw139$TRUE);
                                        SubLObject gaf = (SubLObject)tva_cache.NIL;
                                        gaf = cdolist_list_var.first();
                                        while (tva_cache.NIL != cdolist_list_var) {
                                            tva_cache_store_one_gaf(v_cache, gaf, value, spec_pred, inverseP);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            gaf = cdolist_list_var.first();
                                        }
                                        SubLObject cdolist_list_var2;
                                        final SubLObject accessible_modules = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds));
                                        SubLObject module_var = (SubLObject)tva_cache.NIL;
                                        module_var = cdolist_list_var2.first();
                                        while (tva_cache.NIL != cdolist_list_var2) {
                                            final SubLObject _prev_bind_0_$313 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$313 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((tva_cache.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(tva_cache.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var_$315);
                                                if (tva_cache.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                    if (tva_cache.NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                        if (tva_cache.NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (tva_cache.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                    final SubLObject _prev_bind_0_$314 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$320;
                                                                        for (iteration_state_$320 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$320); iteration_state_$320 = dictionary_contents.do_dictionary_contents_next(iteration_state_$320)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$320);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (tva_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$315 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (tva_cache.NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)tva_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)tva_cache.UNPROVIDED);
                                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (sol.isList()) {
                                                                                        SubLObject csome_list_var = sol;
                                                                                        SubLObject node_vars_link_node2 = (SubLObject)tva_cache.NIL;
                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                        while (tva_cache.NIL != csome_list_var) {
                                                                                            if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)tva_cache.UNPROVIDED);
                                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                            csome_list_var = csome_list_var.rest();
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$315, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$320);
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$314, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    }
                                                    else {
                                                        sbhl_paranoia.sbhl_error((SubLObject)tva_cache.FIVE_INTEGER, (SubLObject)tva_cache.$str72$attempting_to_bind_direction_link, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                                    }
                                                }
                                                else if (tva_cache.NIL != obsolete.cnat_p(node, (SubLObject)tva_cache.UNPROVIDED)) {
                                                    SubLObject cdolist_list_var_$322;
                                                    final SubLObject new_list = cdolist_list_var_$322 = ((tva_cache.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED)));
                                                    SubLObject generating_fn = (SubLObject)tva_cache.NIL;
                                                    generating_fn = cdolist_list_var_$322.first();
                                                    while (tva_cache.NIL != cdolist_list_var_$322) {
                                                        final SubLObject _prev_bind_0_$316 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                            final SubLObject sol2;
                                                            final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                            if (tva_cache.NIL != set.set_p(sol2)) {
                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                SubLObject basis_object2;
                                                                SubLObject state2;
                                                                SubLObject node_vars_link_node3;
                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)tva_cache.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                    if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)tva_cache.UNPROVIDED);
                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                    }
                                                                }
                                                            }
                                                            else if (sol2.isList()) {
                                                                SubLObject csome_list_var2 = sol2;
                                                                SubLObject node_vars_link_node4 = (SubLObject)tva_cache.NIL;
                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                while (tva_cache.NIL != csome_list_var2) {
                                                                    if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)tva_cache.UNPROVIDED);
                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$316, thread);
                                                        }
                                                        cdolist_list_var_$322 = cdolist_list_var_$322.rest();
                                                        generating_fn = cdolist_list_var_$322.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$313, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$313, thread);
                                            }
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            module_var = cdolist_list_var2.first();
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$312, thread);
                                    }
                                }
                            }
                            finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$314, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$312, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$311, thread);
                            }
                        }
                        else {
                            sbhl_paranoia.sbhl_warn((SubLObject)tva_cache.TWO_INTEGER, (SubLObject)tva_cache.$str73$Node__a_does_not_pass_sbhl_type_t, predicate, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED)), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                        }
                    }
                    finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$311, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$310, thread);
                    }
                }
                finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$309, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$317 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_cache.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$317, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 39749L)
    public static SubLObject make_tva_cache_complex_support(final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject simple_supports = (SubLObject)tva_cache.NIL;
        if (tva_cache.NIL != list_utilities.tree_find((SubLObject)tva_cache.$kw152$COMPLEX, supports, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)) {
            SubLObject cdolist_list_var = supports;
            SubLObject support = (SubLObject)tva_cache.NIL;
            support = cdolist_list_var.first();
            while (tva_cache.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$325 = tva_cache_support_component_supports(support);
                SubLObject simple_support = (SubLObject)tva_cache.NIL;
                simple_support = cdolist_list_var_$325.first();
                while (tva_cache.NIL != cdolist_list_var_$325) {
                    simple_supports = (SubLObject)ConsesLow.cons(simple_support, simple_supports);
                    cdolist_list_var_$325 = cdolist_list_var_$325.rest();
                    simple_support = cdolist_list_var_$325.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            }
            if (tva_cache.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && tva_cache.NIL != list_utilities.tree_find((SubLObject)tva_cache.$kw152$COMPLEX, simple_supports, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)) {
                Errors.error((SubLObject)tva_cache.$str153$Complex_TVA_cache_support_in__S, simple_supports);
            }
        }
        else {
            simple_supports = supports;
        }
        simple_supports = list_utilities.fast_delete_duplicates(simple_supports, (SubLObject)tva_cache.$sym108$TVA_CACHE_SUPPORT_EQUAL_, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
        return reader.bq_cons((SubLObject)tva_cache.$kw152$COMPLEX, simple_supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 40450L)
    public static SubLObject tva_cache_support_component_supports(final SubLObject support) {
        SubLObject simple_supports = (SubLObject)tva_cache.NIL;
        if (tva_cache.NIL != tva_cache_support_complex_p(support)) {
            SubLObject cdolist_list_var = support.rest();
            SubLObject sub_support = (SubLObject)tva_cache.NIL;
            sub_support = cdolist_list_var.first();
            while (tva_cache.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$326 = tva_cache_support_component_supports(sub_support);
                SubLObject component_support = (SubLObject)tva_cache.NIL;
                component_support = cdolist_list_var_$326.first();
                while (tva_cache.NIL != cdolist_list_var_$326) {
                    simple_supports = (SubLObject)ConsesLow.cons(component_support, simple_supports);
                    cdolist_list_var_$326 = cdolist_list_var_$326.rest();
                    component_support = cdolist_list_var_$326.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                sub_support = cdolist_list_var.first();
            }
        }
        else if (tva_cache.NIL == conses_high.member(support, simple_supports, (SubLObject)tva_cache.$sym108$TVA_CACHE_SUPPORT_EQUAL_, Symbols.symbol_function((SubLObject)tva_cache.IDENTITY))) {
            simple_supports = (SubLObject)ConsesLow.cons(support, simple_supports);
        }
        return list_utilities.fast_delete_duplicates(simple_supports, (SubLObject)tva_cache.$sym108$TVA_CACHE_SUPPORT_EQUAL_, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 40909L)
    public static SubLObject tva_cache_support_complex_p(final SubLObject support) {
        return pattern_match.tree_matches_pattern(support, (SubLObject)tva_cache.$list154);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 41028L)
    public static SubLObject tva_cache_complex_support_equalP(final SubLObject support1, final SubLObject support2) {
        return list_utilities.sets_equalP(support1.rest(), support2.rest(), Symbols.symbol_function((SubLObject)tva_cache.$sym108$TVA_CACHE_SUPPORT_EQUAL_));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 41180L)
    public static SubLObject make_tva_cache_support(final SubLObject gaf, final SubLObject inverseP, final SubLObject spec_predP, final SubLObject original_predicate) {
        if (tva_cache.NIL != inverseP) {
            return (SubLObject)ConsesLow.listS((SubLObject)tva_cache.$kw120$INVERSE, gaf, (SubLObject)((tva_cache.NIL != original_predicate) ? ConsesLow.list(original_predicate) : tva_cache.NIL));
        }
        if (tva_cache.NIL != spec_predP) {
            return (SubLObject)ConsesLow.listS((SubLObject)tva_cache.$kw121$SPEC_PRED, gaf, (SubLObject)((tva_cache.NIL != original_predicate) ? ConsesLow.list(original_predicate) : tva_cache.NIL));
        }
        return gaf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 41571L)
    public static SubLObject tva_cache_ensure_cache_has_key(final SubLObject v_cache, final SubLObject key) {
        if (tva_cache.NIL == tva_cache_has_keyP(v_cache, key)) {
            tva_cache_add_key(v_cache, key);
        }
        return tva_cache_entry_for_key(v_cache, key).rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 41759L)
    public static SubLObject tva_cache_add_key(final SubLObject v_cache, final SubLObject key) {
        final SubLObject v_1_2pred_gafs = tva_cache_tva_pred_gafs(v_cache);
        final SubLObject v_2_1pred_gafs = tva_cache_tvai_pred_gafs(v_cache);
        final SubLObject cache_map = tva_cache_map(v_cache);
        map_utilities.map_put(cache_map, key, new_tva_cache_entry());
        SubLObject cdolist_list_var = v_1_2pred_gafs;
        SubLObject v_1_2pred_gaf = (SubLObject)tva_cache.NIL;
        v_1_2pred_gaf = cdolist_list_var.first();
        while (tva_cache.NIL != cdolist_list_var) {
            tva_cache_note_implicit_keys_from_trans_gaf(v_cache, key, v_1_2pred_gaf, (SubLObject)tva_cache.ONE_INTEGER, (SubLObject)tva_cache.TWO_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            v_1_2pred_gaf = cdolist_list_var.first();
        }
        cdolist_list_var = v_2_1pred_gafs;
        SubLObject v_2_1pred_gaf = (SubLObject)tva_cache.NIL;
        v_2_1pred_gaf = cdolist_list_var.first();
        while (tva_cache.NIL != cdolist_list_var) {
            tva_cache_note_implicit_keys_from_trans_gaf(v_cache, key, v_2_1pred_gaf, (SubLObject)tva_cache.TWO_INTEGER, (SubLObject)tva_cache.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            v_2_1pred_gaf = cdolist_list_var.first();
        }
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 42266L)
    public static SubLObject tva_cache_note_implicit_keys_from_trans_gaf(final SubLObject v_cache, final SubLObject key, final SubLObject pred_gaf, SubLObject index_arg, SubLObject gather_arg) {
        if (index_arg == tva_cache.UNPROVIDED) {
            index_arg = (SubLObject)tva_cache.NIL;
        }
        if (gather_arg == tva_cache.UNPROVIDED) {
            gather_arg = (SubLObject)tva_cache.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (tva_cache.NIL != kb_indexing_datastructures.indexed_term_p(key) && tva_cache_index_argnum(v_cache).eql(assertions_high.gaf_arg3(pred_gaf))) {
            final SubLObject implicit_keys = tva_cache_get_implicit_terms(key, pred_gaf, index_arg, gather_arg);
            final SubLObject iterator = map_utilities.new_map_iterator(implicit_keys);
            SubLObject valid;
            for (SubLObject done_var = (SubLObject)tva_cache.NIL; tva_cache.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(tva_cache.NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (tva_cache.NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject implicit_key = (SubLObject)tva_cache.NIL;
                    SubLObject supports = (SubLObject)tva_cache.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list155);
                    implicit_key = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list155);
                    supports = current.first();
                    current = current.rest();
                    if (tva_cache.NIL == current) {
                        if (tva_cache.NIL != kb_indexing_datastructures.indexed_term_p(implicit_key)) {
                            tva_cache_ensure_cache_has_key(v_cache, implicit_key);
                        }
                        tva_cache_note_implicit_key_supports(v_cache, key, implicit_key, supports);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_cache.$list155);
                    }
                }
            }
            return implicit_keys;
        }
        return (SubLObject)tva_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 42945L)
    public static SubLObject tva_cache_get_implicit_terms(final SubLObject v_term, final SubLObject pred_gaf, final SubLObject index_arg, final SubLObject gather_arg) {
        assert tva_cache.NIL != kb_indexing_datastructures.indexed_term_p(v_term) : v_term;
        final SubLObject pred = tva_cache_tva_pred_from_support(pred_gaf);
        final SubLObject supported_terms = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)tva_cache.EQUAL), (SubLObject)tva_cache.UNPROVIDED);
        map_utilities.map_put(supported_terms, (SubLObject)tva_cache.$kw157$TOP, v_term);
        tva_cache_get_implicit_terms_internal(v_term, pred, index_arg, gather_arg, supported_terms, (SubLObject)ConsesLow.list(pred_gaf));
        map_utilities.map_remove(supported_terms, (SubLObject)tva_cache.$kw157$TOP);
        return supported_terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 43438L)
    public static SubLObject tva_cache_get_implicit_terms_internal(final SubLObject v_term, final SubLObject pred, final SubLObject index_arg, final SubLObject gather_arg, final SubLObject supported_terms, SubLObject supports_to_here) {
        if (supports_to_here == tva_cache.UNPROVIDED) {
            supports_to_here = (SubLObject)tva_cache.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject top_term = map_utilities.map_get_without_values(supported_terms, (SubLObject)tva_cache.$kw157$TOP, (SubLObject)tva_cache.UNPROVIDED);
        final SubLObject deck_type = (SubLObject)tva_cache.$kw61$QUEUE;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = (SubLObject)tva_cache.NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = tva_cache.$const62$True_JustificationTruth;
                final SubLObject _prev_bind_0_$327 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind((tva_cache.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((tva_cache.NIL != tv_var) ? tva_cache.$sym63$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                    if (tva_cache.NIL != tv_var && tva_cache.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && tva_cache.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql((SubLObject)tva_cache.$kw64$ERROR)) {
                            sbhl_paranoia.sbhl_error((SubLObject)tva_cache.ONE_INTEGER, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                        }
                        else if (pcase_var.eql((SubLObject)tva_cache.$kw67$CERROR)) {
                            sbhl_paranoia.sbhl_cerror((SubLObject)tva_cache.ONE_INTEGER, (SubLObject)tva_cache.$str68$continue_anyway, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                        }
                        else if (pcase_var.eql((SubLObject)tva_cache.$kw69$WARN)) {
                            Errors.warn((SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P);
                        }
                        else {
                            Errors.warn((SubLObject)tva_cache.$str70$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                            Errors.cerror((SubLObject)tva_cache.$str68$continue_anyway, (SubLObject)tva_cache.$str65$_A_is_not_a__A, tv_var, (SubLObject)tva_cache.$sym66$SBHL_TRUE_TV_P);
                        }
                    }
                    final SubLObject _prev_bind_0_$328 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$329 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_cache.NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds), thread);
                        if (tva_cache.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || tva_cache.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) {
                            final SubLObject _prev_bind_0_$329 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$330 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$332 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_cache.NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(pred, (SubLObject)tva_cache.UNPROVIDED);
                                for (node_and_predicate_mode = (SubLObject)ConsesLow.list(pred, sbhl_search_vars.genl_inverse_mode_p()); tva_cache.NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                    final SubLObject node_var_$333 = node_and_predicate_mode.first();
                                    final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                    final SubLObject spec_pred = node_var_$333;
                                    final SubLObject _prev_bind_0_$330 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                        final SubLObject inverseP = predicate_mode;
                                        final SubLObject this_index_arg = (tva_cache.NIL != inverseP) ? gather_arg : index_arg;
                                        final SubLObject this_gather_arg = invert_binary_argnum(this_index_arg);
                                        final SubLObject spec_predP = (SubLObject)SubLObjectFactory.makeBoolean(tva_cache.NIL == inverseP && !spec_pred.eql(pred));
                                        SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs(v_term, spec_pred, this_index_arg, (SubLObject)tva_cache.$kw139$TRUE);
                                        SubLObject gaf = (SubLObject)tva_cache.NIL;
                                        gaf = cdolist_list_var.first();
                                        while (tva_cache.NIL != cdolist_list_var) {
                                            final SubLObject implicit_term = assertions_high.gaf_arg(gaf, this_gather_arg);
                                            if (!implicit_term.equal(top_term) && tva_cache.NIL == map_utilities.map_has_keyP(supported_terms, implicit_term)) {
                                                final SubLObject this_support = make_tva_cache_support(gaf, inverseP, spec_predP, pred);
                                                final SubLObject complex_support = make_tva_cache_complex_support(reader.bq_cons(this_support, supports_to_here));
                                                if (!implicit_term.equal(v_term)) {
                                                    map_utilities.map_push(supported_terms, implicit_term, complex_support);
                                                    tva_cache_get_implicit_terms_internal(implicit_term, pred, index_arg, gather_arg, supported_terms, (SubLObject)ConsesLow.cons(this_support, supports_to_here));
                                                }
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            gaf = cdolist_list_var.first();
                                        }
                                        SubLObject cdolist_list_var2;
                                        final SubLObject accessible_modules = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(tva_cache.$const57$genlPreds));
                                        SubLObject module_var = (SubLObject)tva_cache.NIL;
                                        module_var = cdolist_list_var2.first();
                                        while (tva_cache.NIL != cdolist_list_var2) {
                                            final SubLObject _prev_bind_0_$331 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$331 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((tva_cache.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(tva_cache.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var_$333);
                                                if (tva_cache.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                    if (tva_cache.NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED));
                                                        if (tva_cache.NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (tva_cache.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                    final SubLObject _prev_bind_0_$332 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$338;
                                                                        for (iteration_state_$338 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$338); iteration_state_$338 = dictionary_contents.do_dictionary_contents_next(iteration_state_$338)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$338);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (tva_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$333 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (tva_cache.NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)tva_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)tva_cache.UNPROVIDED);
                                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (sol.isList()) {
                                                                                        SubLObject csome_list_var = sol;
                                                                                        SubLObject node_vars_link_node2 = (SubLObject)tva_cache.NIL;
                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                        while (tva_cache.NIL != csome_list_var) {
                                                                                            if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)tva_cache.UNPROVIDED);
                                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                            csome_list_var = csome_list_var.rest();
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$333, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$338);
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$332, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    }
                                                    else {
                                                        sbhl_paranoia.sbhl_error((SubLObject)tva_cache.FIVE_INTEGER, (SubLObject)tva_cache.$str72$attempting_to_bind_direction_link, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                                                    }
                                                }
                                                else if (tva_cache.NIL != obsolete.cnat_p(node, (SubLObject)tva_cache.UNPROVIDED)) {
                                                    SubLObject cdolist_list_var_$340;
                                                    final SubLObject new_list = cdolist_list_var_$340 = ((tva_cache.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED)));
                                                    SubLObject generating_fn = (SubLObject)tva_cache.NIL;
                                                    generating_fn = cdolist_list_var_$340.first();
                                                    while (tva_cache.NIL != cdolist_list_var_$340) {
                                                        final SubLObject _prev_bind_0_$334 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                            final SubLObject sol2;
                                                            final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                            if (tva_cache.NIL != set.set_p(sol2)) {
                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                SubLObject basis_object2;
                                                                SubLObject state2;
                                                                SubLObject node_vars_link_node3;
                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)tva_cache.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); tva_cache.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                    if (tva_cache.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)tva_cache.UNPROVIDED);
                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                    }
                                                                }
                                                            }
                                                            else if (sol2.isList()) {
                                                                SubLObject csome_list_var2 = sol2;
                                                                SubLObject node_vars_link_node4 = (SubLObject)tva_cache.NIL;
                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                while (tva_cache.NIL != csome_list_var2) {
                                                                    if (tva_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)tva_cache.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)tva_cache.UNPROVIDED);
                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)tva_cache.$str71$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$334, thread);
                                                        }
                                                        cdolist_list_var_$340 = cdolist_list_var_$340.rest();
                                                        generating_fn = cdolist_list_var_$340.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$331, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$331, thread);
                                            }
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            module_var = cdolist_list_var2.first();
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$330, thread);
                                    }
                                }
                            }
                            finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$332, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$330, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$329, thread);
                            }
                        }
                        else {
                            sbhl_paranoia.sbhl_warn((SubLObject)tva_cache.TWO_INTEGER, (SubLObject)tva_cache.$str73$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)tva_cache.UNPROVIDED)), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
                        }
                    }
                    finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$329, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$328, thread);
                    }
                }
                finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$327, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$335 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_cache.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$335, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return supported_terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 44753L)
    public static SubLObject make_tva_cache_hl_support(final SubLObject sentence, SubLObject mt, SubLObject tv) {
        if (mt == tva_cache.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (tv == tva_cache.UNPROVIDED) {
            tv = (SubLObject)tva_cache.$kw158$TRUE_DEF;
        }
        final SubLObject module = tva_utilities.tva_support_module_for_pred(cycl_utilities.formula_arg0(sentence));
        return arguments.make_hl_support(module, sentence, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 44977L)
    public static SubLObject tva_cache_tva_pred_from_support(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula = arguments.support_sentence(support);
        final SubLObject pcase_var = cycl_utilities.formula_arg0(formula);
        if (pcase_var.eql(tva_cache.$const138$transitiveViaArg) || pcase_var.eql(tva_cache.$const140$transitiveViaArgInverse)) {
            return cycl_utilities.formula_arg2(formula, (SubLObject)tva_cache.UNPROVIDED);
        }
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(formula, (SubLObject)tva_cache.$list159);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (tva_cache.NIL != success) {
            final SubLObject pred = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)tva_cache.$sym160$PRED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
            return pred;
        }
        Errors.error((SubLObject)tva_cache.$str161$Don_t_know_how_to_find_the_transi, support);
        return (SubLObject)tva_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 45432L)
    public static SubLObject tva_cache_transitivity_support(final SubLObject v_cache, final SubLObject subkey_support, SubLObject original_pred) {
        if (original_pred == tva_cache.UNPROVIDED) {
            original_pred = (SubLObject)tva_cache.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (tva_cache.NIL == original_pred) {
            if (tva_cache.NIL != assertion_handles.assertion_p(subkey_support)) {
                original_pred = assertions_high.gaf_arg0(subkey_support);
            }
            else if (tva_cache.NIL != tva_cache_support_complex_p(subkey_support)) {
                if (tva_cache.NIL == original_pred) {
                    SubLObject csome_list_var = subkey_support.rest();
                    SubLObject sub_support = (SubLObject)tva_cache.NIL;
                    sub_support = csome_list_var.first();
                    while (tva_cache.NIL == original_pred && tva_cache.NIL != csome_list_var) {
                        if (tva_cache.NIL != subl_promotions.memberP(sub_support, tva_cache_tva_pred_gafs(v_cache), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED) || tva_cache.NIL != conses_high.member(sub_support, tva_cache_tvai_pred_gafs(v_cache), (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)) {
                            original_pred = tva_cache_tva_pred_from_support(sub_support);
                        }
                        csome_list_var = csome_list_var.rest();
                        sub_support = csome_list_var.first();
                    }
                }
            }
            else if (subkey_support.isList() && tva_cache.NIL != conses_high.member(subkey_support.first(), (SubLObject)tva_cache.$list162, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED)) {
                original_pred = conses_high.third(subkey_support);
            }
            if (tva_cache.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && tva_cache.NIL == original_pred) {
                Errors.error((SubLObject)tva_cache.$str163$Can_t_get_transitivity_support_fr, subkey_support);
            }
        }
        SubLObject support = (SubLObject)tva_cache.NIL;
        if (tva_cache.NIL == support) {
            SubLObject csome_list_var2 = tva_cache_tva_pred_gafs(v_cache);
            SubLObject gaf = (SubLObject)tva_cache.NIL;
            gaf = csome_list_var2.first();
            while (tva_cache.NIL == support && tva_cache.NIL != csome_list_var2) {
                if (tva_cache_tva_pred_from_support(gaf).eql(original_pred) && tva_cache.NIL != tva_cache_valid_supportP(gaf)) {
                    support = gaf;
                }
                csome_list_var2 = csome_list_var2.rest();
                gaf = csome_list_var2.first();
            }
        }
        if (tva_cache.NIL == support) {
            SubLObject csome_list_var2 = tva_cache_tvai_pred_gafs(v_cache);
            SubLObject gaf = (SubLObject)tva_cache.NIL;
            gaf = csome_list_var2.first();
            while (tva_cache.NIL == support && tva_cache.NIL != csome_list_var2) {
                if (tva_cache_tva_pred_from_support(gaf).eql(original_pred) && tva_cache.NIL != tva_cache_valid_supportP(gaf)) {
                    support = gaf;
                }
                csome_list_var2 = csome_list_var2.rest();
                gaf = csome_list_var2.first();
            }
        }
        return support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 46651L)
    public static SubLObject new_tva_cache_entry() {
        return (SubLObject)ConsesLow.cons(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)tva_cache.EQUAL), (SubLObject)tva_cache.UNPROVIDED), dictionary.new_dictionary(Symbols.symbol_function((SubLObject)tva_cache.EQUAL), (SubLObject)tva_cache.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 46817L)
    public static SubLObject tva_cache_note_key_value_supports(final SubLObject v_cache, final SubLObject key, final SubLObject value, final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject entry = tva_cache_entry_for_key(v_cache, key);
        final SubLObject supported_values = entry.first();
        final SubLObject existing_supports = map_utilities.map_get_without_values(supported_values, value, (SubLObject)tva_cache.NIL);
        final SubLObject this_value_supports = conses_high.union(supports, existing_supports, Symbols.symbol_function((SubLObject)tva_cache.EQL), (SubLObject)tva_cache.$sym164$TVA_CACHE_SUPPORT_GAF);
        map_utilities.map_put(supported_values, value, this_value_supports);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tva_cache_implied_values(v_cache, value))); tva_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject implied_value = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject more_supports = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = this_value_supports;
            SubLObject this_value_support = (SubLObject)tva_cache.NIL;
            this_value_support = cdolist_list_var.first();
            while (tva_cache.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$343 = more_supports;
                SubLObject more_support = (SubLObject)tva_cache.NIL;
                more_support = cdolist_list_var_$343.first();
                while (tva_cache.NIL != cdolist_list_var_$343) {
                    final SubLObject complex_support = make_tva_cache_complex_support((SubLObject)ConsesLow.list(this_value_support, more_support));
                    map_utilities.map_pushnew(supported_values, implied_value, complex_support, (SubLObject)tva_cache.$sym108$TVA_CACHE_SUPPORT_EQUAL_, (SubLObject)tva_cache.UNPROVIDED);
                    cdolist_list_var_$343 = cdolist_list_var_$343.rest();
                    more_support = cdolist_list_var_$343.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                this_value_support = cdolist_list_var.first();
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 47815L)
    public static SubLObject tva_cache_implied_values(final SubLObject v_cache, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ans = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)tva_cache.EQL), (SubLObject)tva_cache.UNPROVIDED);
        final SubLObject v_1_2pred_gafs = tva_cache_tva_pred_gafs(v_cache);
        final SubLObject v_2_1pred_gafs = tva_cache_tvai_pred_gafs(v_cache);
        if (tva_cache.NIL != kb_indexing_datastructures.indexed_term_p(value)) {
            final SubLObject pcase_var = tva_cache_index_argnum(v_cache);
            if (pcase_var.eql((SubLObject)tva_cache.ONE_INTEGER)) {
                SubLObject cdolist_list_var = v_1_2pred_gafs;
                SubLObject v_1_2pred_gaf = (SubLObject)tva_cache.NIL;
                v_1_2pred_gaf = cdolist_list_var.first();
                while (tva_cache.NIL != cdolist_list_var) {
                    if (tva_cache.NIL != assertion_handles.valid_assertionP(v_1_2pred_gaf, (SubLObject)tva_cache.UNPROVIDED) && tva_cache.TWO_INTEGER.eql(assertions_high.gaf_arg3(v_1_2pred_gaf))) {
                        final SubLObject iterator = map_utilities.new_map_iterator(tva_cache_get_implicit_terms(value, v_1_2pred_gaf, (SubLObject)tva_cache.ONE_INTEGER, (SubLObject)tva_cache.TWO_INTEGER));
                        SubLObject valid;
                        for (SubLObject done_var = (SubLObject)tva_cache.NIL; tva_cache.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(tva_cache.NIL == valid)) {
                            thread.resetMultipleValues();
                            final SubLObject var = iteration.iteration_next(iterator);
                            valid = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (tva_cache.NIL != valid) {
                                SubLObject current;
                                final SubLObject datum = current = var;
                                SubLObject key = (SubLObject)tva_cache.NIL;
                                SubLObject supports = (SubLObject)tva_cache.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list165);
                                key = current.first();
                                current = current.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list165);
                                supports = current.first();
                                current = current.rest();
                                if (tva_cache.NIL == current) {
                                    dictionary.dictionary_enter(ans, key, supports);
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_cache.$list165);
                                }
                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_1_2pred_gaf = cdolist_list_var.first();
                }
            }
            else if (pcase_var.eql((SubLObject)tva_cache.TWO_INTEGER)) {
                SubLObject cdolist_list_var = v_2_1pred_gafs;
                SubLObject v_2_1pred_gaf = (SubLObject)tva_cache.NIL;
                v_2_1pred_gaf = cdolist_list_var.first();
                while (tva_cache.NIL != cdolist_list_var) {
                    if (tva_cache.NIL != assertion_handles.valid_assertionP(v_2_1pred_gaf, (SubLObject)tva_cache.UNPROVIDED) && tva_cache.ONE_INTEGER.eql(assertions_high.gaf_arg3(v_2_1pred_gaf))) {
                        final SubLObject iterator = map_utilities.new_map_iterator(tva_cache_get_implicit_terms(value, v_2_1pred_gaf, (SubLObject)tva_cache.TWO_INTEGER, (SubLObject)tva_cache.ONE_INTEGER));
                        SubLObject valid;
                        for (SubLObject done_var = (SubLObject)tva_cache.NIL; tva_cache.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(tva_cache.NIL == valid)) {
                            thread.resetMultipleValues();
                            final SubLObject var = iteration.iteration_next(iterator);
                            valid = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (tva_cache.NIL != valid) {
                                SubLObject current;
                                final SubLObject datum = current = var;
                                SubLObject key = (SubLObject)tva_cache.NIL;
                                SubLObject supports = (SubLObject)tva_cache.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list165);
                                key = current.first();
                                current = current.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list165);
                                supports = current.first();
                                current = current.rest();
                                if (tva_cache.NIL == current) {
                                    dictionary.dictionary_enter(ans, key, supports);
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_cache.$list165);
                                }
                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_2_1pred_gaf = cdolist_list_var.first();
                }
            }
            if (tva_cache.NIL != fort_types_interface.transitive_binary_predicate_p(tva_cache_pred(v_cache))) {
                final SubLObject support = tva_cache_transitive_binary_predicate_support(tva_cache_pred(v_cache));
                final SubLObject index_arg = tva_cache_index_argnum(v_cache);
                final SubLObject iterator2 = map_utilities.new_map_iterator(tva_cache_get_implicit_terms(value, support, index_arg, invert_binary_argnum(index_arg)));
                SubLObject valid2;
                for (SubLObject done_var2 = (SubLObject)tva_cache.NIL; tva_cache.NIL == done_var2; done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(tva_cache.NIL == valid2)) {
                    thread.resetMultipleValues();
                    final SubLObject var2 = iteration.iteration_next(iterator2);
                    valid2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (tva_cache.NIL != valid2) {
                        SubLObject current2;
                        final SubLObject datum2 = current2 = var2;
                        SubLObject key2 = (SubLObject)tva_cache.NIL;
                        SubLObject supports2 = (SubLObject)tva_cache.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)tva_cache.$list165);
                        key2 = current2.first();
                        current2 = current2.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)tva_cache.$list165);
                        supports2 = current2.first();
                        current2 = current2.rest();
                        if (tva_cache.NIL == current2) {
                            dictionary.dictionary_enter(ans, key2, supports2);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)tva_cache.$list165);
                        }
                    }
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 49031L)
    public static SubLObject tva_cache_transitive_binary_predicate_support(final SubLObject pred) {
        final SubLObject sentence = el_utilities.make_binary_formula(tva_cache.$const149$isa, pred, tva_cache.$const166$TransitiveBinaryPredicate);
        final SubLObject assertion = czer_meta.find_assertion_cycl(sentence, (SubLObject)tva_cache.UNPROVIDED);
        return (tva_cache.NIL != assertion) ? assertion : make_tva_cache_hl_support(sentence, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 49298L)
    public static SubLObject tva_cache_note_implicit_key_supports(final SubLObject v_cache, final SubLObject key, final SubLObject implicit_key, final SubLObject supports) {
        SubLObject entry = tva_cache_entry_for_key(v_cache, implicit_key);
        if (tva_cache.NIL == entry) {
            entry = new_tva_cache_entry();
            map_utilities.map_put(tva_cache_map(v_cache), key, entry);
        }
        final SubLObject supported_subkeys = entry.rest();
        final SubLObject existing_supports = map_utilities.map_get_without_values(supported_subkeys, key, (SubLObject)tva_cache.NIL);
        map_utilities.map_put(supported_subkeys, key, conses_high.union(supports, existing_supports, Symbols.symbol_function((SubLObject)tva_cache.EQL), (SubLObject)tva_cache.$sym164$TVA_CACHE_SUPPORT_GAF));
        return entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 49927L)
    public static SubLObject tva_cache_remove_key_value_support(final SubLObject cache_map, final SubLObject key, final SubLObject value, final SubLObject support) {
        final SubLObject entry = map_utilities.map_get_without_values(cache_map, key, (SubLObject)tva_cache.UNPROVIDED);
        final SubLObject supported_values = entry.first();
        if (tva_cache.NIL != map_utilities.map_p(supported_values)) {
            final SubLObject existing_supports = map_utilities.map_get_without_values(supported_values, value, (SubLObject)tva_cache.NIL);
            map_utilities.map_put(supported_values, value, Sequences.delete(support, existing_supports, Symbols.symbol_function((SubLObject)tva_cache.EQL), (SubLObject)tva_cache.$sym164$TVA_CACHE_SUPPORT_GAF, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED));
        }
        return entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 50419L)
    public static SubLObject tva_cache_remove_implicit_key_support(final SubLObject cache_map, final SubLObject key, final SubLObject implicit_key, final SubLObject support) {
        SubLObject entry = map_utilities.map_get_without_values(cache_map, implicit_key, (SubLObject)tva_cache.NIL);
        if (tva_cache.NIL == entry) {
            entry = new_tva_cache_entry();
            map_utilities.map_put(cache_map, key, entry);
        }
        final SubLObject supported_subkeys = entry.rest();
        final SubLObject existing_supports = map_utilities.map_get_without_values(supported_subkeys, key, (SubLObject)tva_cache.NIL);
        map_utilities.map_put(supported_subkeys, key, Sequences.delete(support, existing_supports, Symbols.symbol_function((SubLObject)tva_cache.EQL), (SubLObject)tva_cache.$sym164$TVA_CACHE_SUPPORT_GAF, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED));
        return entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 51055L)
    public static SubLObject invert_binary_argnum(final SubLObject argnum) {
        return Numbers.subtract((SubLObject)tva_cache.THREE_INTEGER, argnum);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 51216L)
    public static SubLObject cfasl_output_object_tva_cache_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_tva_cache(v_object, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 51328L)
    public static SubLObject cfasl_output_tva_cache(final SubLObject v_tva_cache, final SubLObject stream) {
        cfasl.cfasl_raw_write_byte(tva_cache.$cfasl_opcode_tva_cache$.getGlobalValue(), stream);
        cfasl.cfasl_output(tva_cache_pred(v_tva_cache), stream);
        cfasl.cfasl_output(tva_cache_index_argnum(v_tva_cache), stream);
        cfasl.cfasl_output(tva_cache_tva_pred_gafs(v_tva_cache), stream);
        cfasl.cfasl_output(tva_cache_tvai_pred_gafs(v_tva_cache), stream);
        cfasl.cfasl_output(tva_cache_map(v_tva_cache), stream);
        return v_tva_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 51744L)
    public static SubLObject cfasl_input_tva_cache(final SubLObject stream) {
        SubLObject v_cache = (SubLObject)tva_cache.NIL;
        v_cache = make_tva_cache((SubLObject)tva_cache.UNPROVIDED);
        _csetf_tva_cache_pred(v_cache, cfasl.cfasl_input(stream, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED));
        _csetf_tva_cache_index_argnum(v_cache, cfasl.cfasl_input(stream, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED));
        _csetf_tva_cache_tva_pred_gafs(v_cache, cfasl.cfasl_input(stream, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED));
        _csetf_tva_cache_tvai_pred_gafs(v_cache, cfasl.cfasl_input(stream, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED));
        _csetf_tva_cache_map(v_cache, cfasl.cfasl_input(stream, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED));
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 52236L)
    public static SubLObject tva_cache_unbuiltP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)tva_cache.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)tva_cache.$sym12$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind(tva_cache.$const13$InferencePSC, thread);
            result = (SubLObject)SubLObjectFactory.makeBoolean(tva_cache.NIL == map_utilities.map_p(tva_cache.$tva_cache_registry$.getGlobalValue()) || (tva_cache.NIL != map_utilities.map_empty_p(tva_cache.$tva_cache_registry$.getGlobalValue()) && kb_indexing.num_predicate_extent_index(tva_cache.$const11$cacheTransitiveClosureForArgs, (SubLObject)tva_cache.UNPROVIDED).numG((SubLObject)tva_cache.ZERO_INTEGER)));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 53017L)
    public static SubLObject rebuild_tva_cache() {
        initialize_tva_caches();
        return (SubLObject)tva_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 53096L)
    public static SubLObject get_tva_cache_contents_data_file(SubLObject directory_path) {
        if (directory_path == tva_cache.UNPROVIDED) {
            directory_path = (SubLObject)tva_cache.NIL;
        }
        return dumper.kb_dump_file((SubLObject)tva_cache.$str170$tva_cache_contents, directory_path, (SubLObject)tva_cache.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 53236L)
    public static SubLObject get_tva_cache_contents_index_file(SubLObject directory_path) {
        if (directory_path == tva_cache.UNPROVIDED) {
            directory_path = (SubLObject)tva_cache.NIL;
        }
        return dumper.kb_dump_file((SubLObject)tva_cache.$str171$tva_cache_contents_index, directory_path, (SubLObject)tva_cache.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 53382L)
    public static SubLObject reconnect_tva_cache_registry(final SubLObject directory, final SubLObject common_symbols) {
        final SubLObject data_file = get_tva_cache_contents_data_file(directory);
        final SubLObject index_file = get_tva_cache_contents_index_file(directory);
        return reconnect_tva_cache_registry_to_file_vector_files(data_file, index_file, common_symbols);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 53757L)
    public static SubLObject reconnect_tva_cache_registry_to_file_vector_files(final SubLObject data_file, final SubLObject index_file, SubLObject common_symbols) {
        if (common_symbols == tva_cache.UNPROVIDED) {
            common_symbols = cfasl.cfasl_current_common_symbols();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject valid_files = (SubLObject)SubLObjectFactory.makeBoolean(tva_cache.NIL != file_utilities.file_existsP(data_file) && tva_cache.NIL != file_utilities.file_existsP(index_file));
        if (tva_cache.NIL != valid_files) {
            final SubLObject fvector = file_vector.new_file_vector(data_file, index_file, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED);
            final SubLObject iterator = map_utilities.new_map_iterator(tva_cache.$tva_cache_registry$.getGlobalValue());
            SubLObject valid;
            for (SubLObject done_var = (SubLObject)tva_cache.NIL; tva_cache.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(tva_cache.NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (tva_cache.NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject key = (SubLObject)tva_cache.NIL;
                    SubLObject tva_caches = (SubLObject)tva_cache.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list172);
                    key = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list172);
                    tva_caches = current.first();
                    current = current.rest();
                    if (tva_cache.NIL == current) {
                        SubLObject cdolist_list_var = tva_caches;
                        SubLObject v_tva_cache = (SubLObject)tva_cache.NIL;
                        v_tva_cache = cdolist_list_var.first();
                        while (tva_cache.NIL != cdolist_list_var) {
                            reconnect_swappable_tva_cache(v_tva_cache, fvector, common_symbols);
                            cdolist_list_var = cdolist_list_var.rest();
                            v_tva_cache = cdolist_list_var.first();
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_cache.$list172);
                    }
                }
            }
        }
        else {
            Errors.warn((SubLObject)tva_cache.$str173$Reconnecting_to_legacy_unit_files, data_file, index_file);
        }
        return valid_files;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 54688L)
    public static SubLObject dump_swappable_tva_cache_to_stream(final SubLObject stream, final SubLObject fvector) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_registry = map_utilities.new_map_with_same_properties(tva_cache.$tva_cache_registry$.getGlobalValue());
        final SubLObject map_lock = Locks.make_lock((SubLObject)tva_cache.$str54$Swappable_TVA_Cache);
        final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
        try {
            file_vector_utilities.$file_vector_backed_map_read_lock$.bind(map_lock, thread);
            final SubLObject iterator = map_utilities.new_map_iterator(tva_cache.$tva_cache_registry$.getGlobalValue());
            SubLObject valid;
            for (SubLObject done_var = (SubLObject)tva_cache.NIL; tva_cache.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(tva_cache.NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (tva_cache.NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject key = (SubLObject)tva_cache.NIL;
                    SubLObject tva_caches = (SubLObject)tva_cache.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list172);
                    key = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_cache.$list172);
                    tva_caches = current.first();
                    current = current.rest();
                    if (tva_cache.NIL == current) {
                        SubLObject new_caches = (SubLObject)tva_cache.NIL;
                        SubLObject cdolist_list_var = tva_caches;
                        SubLObject v_tva_cache = (SubLObject)tva_cache.NIL;
                        v_tva_cache = cdolist_list_var.first();
                        while (tva_cache.NIL != cdolist_list_var) {
                            final SubLObject new_cache = clone_swappable_tva_cache(v_tva_cache, fvector);
                            new_caches = (SubLObject)ConsesLow.cons(new_cache, new_caches);
                            cdolist_list_var = cdolist_list_var.rest();
                            v_tva_cache = cdolist_list_var.first();
                        }
                        new_caches = Sequences.nreverse(new_caches);
                        map_utilities.map_put(new_registry, key, new_caches);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_cache.$list172);
                    }
                }
            }
        }
        finally {
            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
        }
        cfasl.cfasl_output(new_registry, stream);
        return (SubLObject)tva_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 55523L)
    public static SubLObject dump_tva_cache_to_stream(final SubLObject stream) {
        cfasl.cfasl_output(tva_cache.$tva_cache_registry$.getGlobalValue(), stream);
        return (SubLObject)tva_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-cache.lisp", position = 55711L)
    public static SubLObject load_tva_cache_from_stream(final SubLObject stream) {
        tva_cache.$tva_cache_registry$.setGlobalValue(cfasl.cfasl_input(stream, (SubLObject)tva_cache.UNPROVIDED, (SubLObject)tva_cache.UNPROVIDED));
        return (SubLObject)tva_cache.NIL;
    }
    
    public static SubLObject declare_tva_cache_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.tva_cache", "do_tva_caches", "DO-TVA-CACHES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.tva_cache", "do_tva_cache", "DO-TVA-CACHE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_get_values", "TVA-CACHE-GET-VALUES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_check_value", "TVA-CACHE-CHECK-VALUE", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_predicate_index_arg_cached_p", "TVA-CACHE-PREDICATE-INDEX-ARG-CACHED-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "initialize_tva_caches", "INITIALIZE-TVA-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "initialize_uninitialized_tva_caches", "INITIALIZE-UNINITIALIZED-TVA-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "initialize_tva_caches_int", "INITIALIZE-TVA-CACHES-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_enabled_p", "TVA-CACHE-ENABLED-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "cached_tva_value_count", "CACHED-TVA-VALUE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_print_function_trampoline", "TVA-CACHE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_p", "TVA-CACHE-P", 1, 0, false);
        new $tva_cache_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_pred", "TVA-CACHE-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_index_argnum", "TVA-CACHE-INDEX-ARGNUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_tva_pred_gafs", "TVA-CACHE-TVA-PRED-GAFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_tvai_pred_gafs", "TVA-CACHE-TVAI-PRED-GAFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_map", "TVA-CACHE-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "_csetf_tva_cache_pred", "_CSETF-TVA-CACHE-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "_csetf_tva_cache_index_argnum", "_CSETF-TVA-CACHE-INDEX-ARGNUM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "_csetf_tva_cache_tva_pred_gafs", "_CSETF-TVA-CACHE-TVA-PRED-GAFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "_csetf_tva_cache_tvai_pred_gafs", "_CSETF-TVA-CACHE-TVAI-PRED-GAFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "_csetf_tva_cache_map", "_CSETF-TVA-CACHE-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "make_tva_cache", "MAKE-TVA-CACHE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "visit_defstruct_tva_cache", "VISIT-DEFSTRUCT-TVA-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "visit_defstruct_object_tva_cache_method", "VISIT-DEFSTRUCT-OBJECT-TVA-CACHE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "sxhash_tva_cache_method", "SXHASH-TVA-CACHE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "pprint_tva_cache", "PPRINT-TVA-CACHE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "clone_swappable_tva_cache", "CLONE-SWAPPABLE-TVA-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "using_swappable_tva_cachesP", "USING-SWAPPABLE-TVA-CACHES?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "ensure_swappable_tva_cache_lock", "ENSURE-SWAPPABLE-TVA-CACHE-LOCK", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "reconnect_swappable_tva_cache", "RECONNECT-SWAPPABLE-TVA-CACHE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_registry", "TVA-CACHE-REGISTRY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "register_tva_cache", "REGISTER-TVA-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_caches_for_predicate", "TVA-CACHES-FOR-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_caches_implied_by_predicate", "TVA-CACHES-IMPLIED-BY-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_caches_with_transitive_predicate", "TVA-CACHES-WITH-TRANSITIVE-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_for_predicate_and_index_argnum", "TVA-CACHE-FOR-PREDICATE-AND-INDEX-ARGNUM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "ensure_tva_cache_created", "ENSURE-TVA-CACHE-CREATED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "deregister_tva_cache", "DEREGISTER-TVA-CACHE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "deregister_all_tva_caches_for_predicate", "DEREGISTER-ALL-TVA-CACHES-FOR-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "reset_tva_cache_spec_pred_stats", "RESET-TVA-CACHE-SPEC-PRED-STATS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_spec_preds_total_time", "TVA-CACHE-SPEC-PREDS-TOTAL-TIME", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.tva_cache", "do_tva_sub_caches", "DO-TVA-SUB-CACHES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.tva_cache", "do_tva_sub_caches_via_index_surfing", "DO-TVA-SUB-CACHES-VIA-INDEX-SURFING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.tva_cache", "do_tva_sub_caches_via_memoized_lists", "DO-TVA-SUB-CACHES-VIA-MEMOIZED-LISTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_spec_preds_and_inverses_internal", "TVA-CACHE-SPEC-PREDS-AND-INVERSES-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_spec_preds_and_inverses", "TVA-CACHE-SPEC-PREDS-AND-INVERSES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "find_tva_sub_cache", "FIND-TVA-SUB-CACHE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_lookup", "TVA-CACHE-LOOKUP", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_lookup_recursive", "TVA-CACHE-LOOKUP-RECURSIVE", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_lookup_recursive_internal", "TVA-CACHE-LOOKUP-RECURSIVE-INTERNAL", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "cleanup_tva_cache_supports_genl_preds_chains", "CLEANUP-TVA-CACHE-SUPPORTS-GENL-PREDS-CHAINS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.tva_cache", "with_tva_cache_lock", "WITH-TVA-CACHE-LOCK");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_entry_for_key", "TVA-CACHE-ENTRY-FOR-KEY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_lookup_internal_internal", "TVA-CACHE-LOOKUP-INTERNAL-INTERNAL", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_lookup_internal", "TVA-CACHE-LOOKUP-INTERNAL", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_has_keyP", "TVA-CACHE-HAS-KEY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_valid_supportP_internal", "TVA-CACHE-VALID-SUPPORT?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_valid_supportP", "TVA-CACHE-VALID-SUPPORT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_support_gaf", "TVA-CACHE-SUPPORT-GAF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_support_equalP", "TVA-CACHE-SUPPORT-EQUAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "unpack_and_validate_tva_cache_support", "UNPACK-AND-VALIDATE-TVA-CACHE-SUPPORT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "unpack_and_validate_tva_cache_complex_support", "UNPACK-AND-VALIDATE-TVA-CACHE-COMPLEX-SUPPORT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "add_tva_cache_value", "ADD-TVA-CACHE-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "clear_add_tva_cache_value_cached", "CLEAR-ADD-TVA-CACHE-VALUE-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "remove_add_tva_cache_value_cached", "REMOVE-ADD-TVA-CACHE-VALUE-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "add_tva_cache_value_cached_internal", "ADD-TVA-CACHE-VALUE-CACHED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "add_tva_cache_value_cached", "ADD-TVA-CACHE-VALUE-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "remove_tva_cache_value", "REMOVE-TVA-CACHE-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "clear_remove_tva_cache_value_cached", "CLEAR-REMOVE-TVA-CACHE-VALUE-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "remove_remove_tva_cache_value_cached", "REMOVE-REMOVE-TVA-CACHE-VALUE-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "remove_tva_cache_value_cached_internal", "REMOVE-TVA-CACHE-VALUE-CACHED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "remove_tva_cache_value_cached", "REMOVE-TVA-CACHE-VALUE-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "add_tva_cache_key", "ADD-TVA-CACHE-KEY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "clear_add_tva_cache_key_cached", "CLEAR-ADD-TVA-CACHE-KEY-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "remove_add_tva_cache_key_cached", "REMOVE-ADD-TVA-CACHE-KEY-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "add_tva_cache_key_cached_internal", "ADD-TVA-CACHE-KEY-CACHED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "add_tva_cache_key_cached", "ADD-TVA-CACHE-KEY-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "remove_tva_cache_key", "REMOVE-TVA-CACHE-KEY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_add_transitive_via_arg", "TVA-CACHE-ADD-TRANSITIVE-VIA-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_add_transitive_via_arg_inverse", "TVA-CACHE-ADD-TRANSITIVE-VIA-ARG-INVERSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_remove_transitive_via_arg", "TVA-CACHE-REMOVE-TRANSITIVE-VIA-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_remove_transitive_via_arg_inverse", "TVA-CACHE-REMOVE-TRANSITIVE-VIA-ARG-INVERSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_add_trans_gaf", "TVA-CACHE-ADD-TRANS-GAF", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "create_tva_cache", "CREATE-TVA-CACHE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "initialize_tva_cache", "INITIALIZE-TVA-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_asserted_values", "TVA-CACHE-ASSERTED-VALUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_relation_all_instance_values", "TVA-CACHE-RELATION-ALL-INSTANCE-VALUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "clear_tva_cache_max_instances_to_cache", "CLEAR-TVA-CACHE-MAX-INSTANCES-TO-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "remove_tva_cache_max_instances_to_cache", "REMOVE-TVA-CACHE-MAX-INSTANCES-TO-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_max_instances_to_cache_internal", "TVA-CACHE-MAX-INSTANCES-TO-CACHE-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_max_instances_to_cache", "TVA-CACHE-MAX-INSTANCES-TO-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_add_one_relation_all_instance_gaf", "TVA-CACHE-ADD-ONE-RELATION-ALL-INSTANCE-GAF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_add_relation_instance_all_gaf", "TVA-CACHE-ADD-RELATION-INSTANCE-ALL-GAF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_add_relation_all_instance_gaf", "TVA-CACHE-ADD-RELATION-ALL-INSTANCE-GAF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_remove_relation_all_instance_gaf", "TVA-CACHE-REMOVE-RELATION-ALL-INSTANCE-GAF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_remove_one_relation_all_instance_gaf", "TVA-CACHE-REMOVE-ONE-RELATION-ALL-INSTANCE-GAF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_remove_relation_instance_all_gaf", "TVA-CACHE-REMOVE-RELATION-INSTANCE-ALL-GAF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_remove_one_relation_instance_all_gaf", "TVA-CACHE-REMOVE-ONE-RELATION-INSTANCE-ALL-GAF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_relation_instance_all_values", "TVA-CACHE-RELATION-INSTANCE-ALL-VALUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_add_one_relation_instance_all_gaf", "TVA-CACHE-ADD-ONE-RELATION-INSTANCE-ALL-GAF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_silent_progressP", "TVA-CACHE-SILENT-PROGRESS?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_store_one_gaf", "TVA-CACHE-STORE-ONE-GAF", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_store_one_value", "TVA-CACHE-STORE-ONE-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "make_tva_cache_complex_support", "MAKE-TVA-CACHE-COMPLEX-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_support_component_supports", "TVA-CACHE-SUPPORT-COMPONENT-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_support_complex_p", "TVA-CACHE-SUPPORT-COMPLEX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_complex_support_equalP", "TVA-CACHE-COMPLEX-SUPPORT-EQUAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "make_tva_cache_support", "MAKE-TVA-CACHE-SUPPORT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_ensure_cache_has_key", "TVA-CACHE-ENSURE-CACHE-HAS-KEY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_add_key", "TVA-CACHE-ADD-KEY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_note_implicit_keys_from_trans_gaf", "TVA-CACHE-NOTE-IMPLICIT-KEYS-FROM-TRANS-GAF", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_get_implicit_terms", "TVA-CACHE-GET-IMPLICIT-TERMS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_get_implicit_terms_internal", "TVA-CACHE-GET-IMPLICIT-TERMS-INTERNAL", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "make_tva_cache_hl_support", "MAKE-TVA-CACHE-HL-SUPPORT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_tva_pred_from_support", "TVA-CACHE-TVA-PRED-FROM-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_transitivity_support", "TVA-CACHE-TRANSITIVITY-SUPPORT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "new_tva_cache_entry", "NEW-TVA-CACHE-ENTRY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_note_key_value_supports", "TVA-CACHE-NOTE-KEY-VALUE-SUPPORTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_implied_values", "TVA-CACHE-IMPLIED-VALUES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_transitive_binary_predicate_support", "TVA-CACHE-TRANSITIVE-BINARY-PREDICATE-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_note_implicit_key_supports", "TVA-CACHE-NOTE-IMPLICIT-KEY-SUPPORTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_remove_key_value_support", "TVA-CACHE-REMOVE-KEY-VALUE-SUPPORT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_remove_implicit_key_support", "TVA-CACHE-REMOVE-IMPLICIT-KEY-SUPPORT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "invert_binary_argnum", "INVERT-BINARY-ARGNUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "cfasl_output_object_tva_cache_method", "CFASL-OUTPUT-OBJECT-TVA-CACHE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "cfasl_output_tva_cache", "CFASL-OUTPUT-TVA-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "cfasl_input_tva_cache", "CFASL-INPUT-TVA-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "tva_cache_unbuiltP", "TVA-CACHE-UNBUILT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "rebuild_tva_cache", "REBUILD-TVA-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "get_tva_cache_contents_data_file", "GET-TVA-CACHE-CONTENTS-DATA-FILE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "get_tva_cache_contents_index_file", "GET-TVA-CACHE-CONTENTS-INDEX-FILE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "reconnect_tva_cache_registry", "RECONNECT-TVA-CACHE-REGISTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "reconnect_tva_cache_registry_to_file_vector_files", "RECONNECT-TVA-CACHE-REGISTRY-TO-FILE-VECTOR-FILES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "dump_swappable_tva_cache_to_stream", "DUMP-SWAPPABLE-TVA-CACHE-TO-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "dump_tva_cache_to_stream", "DUMP-TVA-CACHE-TO-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_cache", "load_tva_cache_from_stream", "LOAD-TVA-CACHE-FROM-STREAM", 1, 0, false);
        return (SubLObject)tva_cache.NIL;
    }
    
    public static SubLObject init_tva_cache_file() {
        tva_cache.$use_tva_cacheP$ = SubLFiles.defparameter("*USE-TVA-CACHE?*", (SubLObject)tva_cache.T);
        tva_cache.$update_tva_cacheP$ = SubLFiles.defparameter("*UPDATE-TVA-CACHE?*", (SubLObject)tva_cache.T);
        tva_cache.$dtp_tva_cache$ = SubLFiles.defconstant("*DTP-TVA-CACHE*", (SubLObject)tva_cache.$sym21$TVA_CACHE);
        tva_cache.$swappable_tva_cache_lock$ = SubLFiles.deflexical("*SWAPPABLE-TVA-CACHE-LOCK*", (SubLObject)((tva_cache.NIL != Symbols.boundp((SubLObject)tva_cache.$sym53$_SWAPPABLE_TVA_CACHE_LOCK_)) ? tva_cache.$swappable_tva_cache_lock$.getGlobalValue() : tva_cache.NIL));
        tva_cache.$tva_cache_registry$ = SubLFiles.deflexical("*TVA-CACHE-REGISTRY*", (tva_cache.NIL != Symbols.boundp((SubLObject)tva_cache.$sym56$_TVA_CACHE_REGISTRY_)) ? tva_cache.$tva_cache_registry$.getGlobalValue() : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)tva_cache.EQL), (SubLObject)tva_cache.UNPROVIDED));
        tva_cache.$tva_cache_use_memoized_spec_pred_listsP$ = SubLFiles.defparameter("*TVA-CACHE-USE-MEMOIZED-SPEC-PRED-LISTS?*", (SubLObject)tva_cache.NIL);
        tva_cache.$tva_cache_spec_pred_stats$ = SubLFiles.deflexical("*TVA-CACHE-SPEC-PRED-STATS*", (tva_cache.NIL != Symbols.boundp((SubLObject)tva_cache.$sym77$_TVA_CACHE_SPEC_PRED_STATS_)) ? tva_cache.$tva_cache_spec_pred_stats$.getGlobalValue() : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)tva_cache.EQUAL), (SubLObject)tva_cache.UNPROVIDED));
        tva_cache.$tva_cache_assume_supports_are_validP$ = SubLFiles.defparameter("*TVA-CACHE-ASSUME-SUPPORTS-ARE-VALID?*", (SubLObject)tva_cache.NIL);
        tva_cache.$add_tva_cache_value_cached_caching_state$ = SubLFiles.deflexical("*ADD-TVA-CACHE-VALUE-CACHED-CACHING-STATE*", (SubLObject)tva_cache.NIL);
        tva_cache.$remove_tva_cache_value_cached_caching_state$ = SubLFiles.deflexical("*REMOVE-TVA-CACHE-VALUE-CACHED-CACHING-STATE*", (SubLObject)tva_cache.NIL);
        tva_cache.$add_tva_cache_key_cached_caching_state$ = SubLFiles.deflexical("*ADD-TVA-CACHE-KEY-CACHED-CACHING-STATE*", (SubLObject)tva_cache.NIL);
        tva_cache.$tva_cache_max_instances_to_cache_caching_state$ = SubLFiles.deflexical("*TVA-CACHE-MAX-INSTANCES-TO-CACHE-CACHING-STATE*", (SubLObject)tva_cache.NIL);
        tva_cache.$cfasl_opcode_tva_cache$ = SubLFiles.defconstant("*CFASL-OPCODE-TVA-CACHE*", (SubLObject)tva_cache.$int167$96);
        return (SubLObject)tva_cache.NIL;
    }
    
    public static SubLObject setup_tva_cache_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), tva_cache.$dtp_tva_cache$.getGlobalValue(), Symbols.symbol_function((SubLObject)tva_cache.$sym28$TVA_CACHE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)tva_cache.$list29);
        Structures.def_csetf((SubLObject)tva_cache.$sym30$TVA_CACHE_PRED, (SubLObject)tva_cache.$sym31$_CSETF_TVA_CACHE_PRED);
        Structures.def_csetf((SubLObject)tva_cache.$sym32$TVA_CACHE_INDEX_ARGNUM, (SubLObject)tva_cache.$sym33$_CSETF_TVA_CACHE_INDEX_ARGNUM);
        Structures.def_csetf((SubLObject)tva_cache.$sym34$TVA_CACHE_TVA_PRED_GAFS, (SubLObject)tva_cache.$sym35$_CSETF_TVA_CACHE_TVA_PRED_GAFS);
        Structures.def_csetf((SubLObject)tva_cache.$sym36$TVA_CACHE_TVAI_PRED_GAFS, (SubLObject)tva_cache.$sym37$_CSETF_TVA_CACHE_TVAI_PRED_GAFS);
        Structures.def_csetf((SubLObject)tva_cache.$sym8$TVA_CACHE_MAP, (SubLObject)tva_cache.$sym38$_CSETF_TVA_CACHE_MAP);
        Equality.identity((SubLObject)tva_cache.$sym21$TVA_CACHE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), tva_cache.$dtp_tva_cache$.getGlobalValue(), Symbols.symbol_function((SubLObject)tva_cache.$sym49$VISIT_DEFSTRUCT_OBJECT_TVA_CACHE_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), tva_cache.$dtp_tva_cache$.getGlobalValue(), Symbols.symbol_function((SubLObject)tva_cache.$sym50$SXHASH_TVA_CACHE_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)tva_cache.$sym53$_SWAPPABLE_TVA_CACHE_LOCK_);
        subl_macro_promotions.declare_defglobal((SubLObject)tva_cache.$sym56$_TVA_CACHE_REGISTRY_);
        subl_macro_promotions.declare_defglobal((SubLObject)tva_cache.$sym77$_TVA_CACHE_SPEC_PRED_STATS_);
        memoization_state.note_memoized_function((SubLObject)tva_cache.$sym96$TVA_CACHE_SPEC_PREDS_AND_INVERSES);
        memoization_state.note_memoized_function((SubLObject)tva_cache.$sym112$TVA_CACHE_LOOKUP_INTERNAL);
        memoization_state.note_memoized_function((SubLObject)tva_cache.$sym117$TVA_CACHE_VALID_SUPPORT_);
        utilities_macros.register_kb_function((SubLObject)tva_cache.$sym122$ADD_TVA_CACHE_VALUE);
        memoization_state.note_globally_cached_function((SubLObject)tva_cache.$sym123$ADD_TVA_CACHE_VALUE_CACHED);
        utilities_macros.register_kb_function((SubLObject)tva_cache.$sym126$REMOVE_TVA_CACHE_VALUE);
        memoization_state.note_globally_cached_function((SubLObject)tva_cache.$sym127$REMOVE_TVA_CACHE_VALUE_CACHED);
        utilities_macros.register_kb_function((SubLObject)tva_cache.$sym129$ADD_TVA_CACHE_KEY);
        memoization_state.note_globally_cached_function((SubLObject)tva_cache.$sym130$ADD_TVA_CACHE_KEY_CACHED);
        utilities_macros.register_kb_function((SubLObject)tva_cache.$sym134$REMOVE_TVA_CACHE_KEY);
        memoization_state.note_globally_cached_function((SubLObject)tva_cache.$sym146$TVA_CACHE_MAX_INSTANCES_TO_CACHE);
        cfasl.register_cfasl_input_function(tva_cache.$cfasl_opcode_tva_cache$.getGlobalValue(), (SubLObject)tva_cache.$sym168$CFASL_INPUT_TVA_CACHE);
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), tva_cache.$dtp_tva_cache$.getGlobalValue(), Symbols.symbol_function((SubLObject)tva_cache.$sym169$CFASL_OUTPUT_OBJECT_TVA_CACHE_METHOD));
        access_macros.define_obsolete_register((SubLObject)tva_cache.$sym174$DUMP_TVA_CACHE_TO_STREAM, (SubLObject)tva_cache.$list175);
        return (SubLObject)tva_cache.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_tva_cache_file();
    }
    
    @Override
	public void initializeVariables() {
        init_tva_cache_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_tva_cache_file();
    }
    
    static {
        me = (SubLFile)new tva_cache();
        tva_cache.$use_tva_cacheP$ = null;
        tva_cache.$update_tva_cacheP$ = null;
        tva_cache.$dtp_tva_cache$ = null;
        tva_cache.$swappable_tva_cache_lock$ = null;
        tva_cache.$tva_cache_registry$ = null;
        tva_cache.$tva_cache_use_memoized_spec_pred_listsP$ = null;
        tva_cache.$tva_cache_spec_pred_stats$ = null;
        tva_cache.$tva_cache_assume_supports_are_validP$ = null;
        tva_cache.$add_tva_cache_value_cached_caching_state$ = null;
        tva_cache.$remove_tva_cache_value_cached_caching_state$ = null;
        tva_cache.$add_tva_cache_key_cached_caching_state$ = null;
        tva_cache.$tva_cache_max_instances_to_cache_caching_state$ = null;
        tva_cache.$cfasl_opcode_tva_cache$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CACHE"), (SubLObject)SubLObjectFactory.makeSymbol("BIN-PRED")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1$PRED_CACHES = SubLObjectFactory.makeUninternedSymbol("PRED-CACHES");
        $sym2$DO_DICTIONARY = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
        $list3 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TVA-CACHE-REGISTRY")));
        $sym4$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $list5 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("RAW-SUPPORTED-VALUES"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTED-SUBKEYS"), (SubLObject)SubLObjectFactory.makeSymbol("CACHE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym6$ENTRY = SubLObjectFactory.makeUninternedSymbol("ENTRY");
        $sym7$DO_MAP = SubLObjectFactory.makeSymbol("DO-MAP");
        $sym8$TVA_CACHE_MAP = SubLObjectFactory.makeSymbol("TVA-CACHE-MAP");
        $sym9$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $sym10$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $const11$cacheTransitiveClosureForArgs = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cacheTransitiveClosureForArgs"));
        $sym12$RELEVANT_MT_IS_ANY_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-ANY-MT");
        $const13$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $str14$Initialize_TVA_Caches_____ = SubLObjectFactory.makeString("Initialize TVA Caches ... ");
        $kw15$GAF = SubLObjectFactory.makeKeyword("GAF");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINARY-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARGNUM"));
        $sym17$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str18$Problem_initializing_TVA_CACHE_fo = SubLObjectFactory.makeString("Problem initializing TVA-CACHE for ~A: ~A. KB Subset issue?~%");
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("ENTRY"));
        $list20 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("RAW-SUPPORTED-VALUES"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTED-SUBKEYS"));
        $sym21$TVA_CACHE = SubLObjectFactory.makeSymbol("TVA-CACHE");
        $sym22$TVA_CACHE_P = SubLObjectFactory.makeSymbol("TVA-CACHE-P");
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARGNUM"), (SubLObject)SubLObjectFactory.makeSymbol("TVA-PRED-GAFS"), (SubLObject)SubLObjectFactory.makeSymbol("TVAI-PRED-GAFS"), (SubLObject)SubLObjectFactory.makeSymbol("MAP"));
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRED"), (SubLObject)SubLObjectFactory.makeKeyword("INDEX-ARGNUM"), (SubLObject)SubLObjectFactory.makeKeyword("TVA-PRED-GAFS"), (SubLObject)SubLObjectFactory.makeKeyword("TVAI-PRED-GAFS"), (SubLObject)SubLObjectFactory.makeKeyword("MAP"));
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TVA-CACHE-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("TVA-CACHE-INDEX-ARGNUM"), (SubLObject)SubLObjectFactory.makeSymbol("TVA-CACHE-TVA-PRED-GAFS"), (SubLObject)SubLObjectFactory.makeSymbol("TVA-CACHE-TVAI-PRED-GAFS"), (SubLObject)SubLObjectFactory.makeSymbol("TVA-CACHE-MAP"));
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TVA-CACHE-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TVA-CACHE-INDEX-ARGNUM"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TVA-CACHE-TVA-PRED-GAFS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TVA-CACHE-TVAI-PRED-GAFS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TVA-CACHE-MAP"));
        $sym27$PPRINT_TVA_CACHE = SubLObjectFactory.makeSymbol("PPRINT-TVA-CACHE");
        $sym28$TVA_CACHE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("TVA-CACHE-PRINT-FUNCTION-TRAMPOLINE");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("TVA-CACHE-P"));
        $sym30$TVA_CACHE_PRED = SubLObjectFactory.makeSymbol("TVA-CACHE-PRED");
        $sym31$_CSETF_TVA_CACHE_PRED = SubLObjectFactory.makeSymbol("_CSETF-TVA-CACHE-PRED");
        $sym32$TVA_CACHE_INDEX_ARGNUM = SubLObjectFactory.makeSymbol("TVA-CACHE-INDEX-ARGNUM");
        $sym33$_CSETF_TVA_CACHE_INDEX_ARGNUM = SubLObjectFactory.makeSymbol("_CSETF-TVA-CACHE-INDEX-ARGNUM");
        $sym34$TVA_CACHE_TVA_PRED_GAFS = SubLObjectFactory.makeSymbol("TVA-CACHE-TVA-PRED-GAFS");
        $sym35$_CSETF_TVA_CACHE_TVA_PRED_GAFS = SubLObjectFactory.makeSymbol("_CSETF-TVA-CACHE-TVA-PRED-GAFS");
        $sym36$TVA_CACHE_TVAI_PRED_GAFS = SubLObjectFactory.makeSymbol("TVA-CACHE-TVAI-PRED-GAFS");
        $sym37$_CSETF_TVA_CACHE_TVAI_PRED_GAFS = SubLObjectFactory.makeSymbol("_CSETF-TVA-CACHE-TVAI-PRED-GAFS");
        $sym38$_CSETF_TVA_CACHE_MAP = SubLObjectFactory.makeSymbol("_CSETF-TVA-CACHE-MAP");
        $kw39$PRED = SubLObjectFactory.makeKeyword("PRED");
        $kw40$INDEX_ARGNUM = SubLObjectFactory.makeKeyword("INDEX-ARGNUM");
        $kw41$TVA_PRED_GAFS = SubLObjectFactory.makeKeyword("TVA-PRED-GAFS");
        $kw42$TVAI_PRED_GAFS = SubLObjectFactory.makeKeyword("TVAI-PRED-GAFS");
        $kw43$MAP = SubLObjectFactory.makeKeyword("MAP");
        $str44$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw45$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym46$MAKE_TVA_CACHE = SubLObjectFactory.makeSymbol("MAKE-TVA-CACHE");
        $kw47$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw48$END = SubLObjectFactory.makeKeyword("END");
        $sym49$VISIT_DEFSTRUCT_OBJECT_TVA_CACHE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-TVA-CACHE-METHOD");
        $sym50$SXHASH_TVA_CACHE_METHOD = SubLObjectFactory.makeSymbol("SXHASH-TVA-CACHE-METHOD");
        $str51$__TVA_CACHE__S__S_ = SubLObjectFactory.makeString("#<TVA-CACHE ~S ~S>");
        $kw52$SWAPPED_OUT = SubLObjectFactory.makeKeyword("SWAPPED-OUT");
        $sym53$_SWAPPABLE_TVA_CACHE_LOCK_ = SubLObjectFactory.makeSymbol("*SWAPPABLE-TVA-CACHE-LOCK*");
        $str54$Swappable_TVA_Cache = SubLObjectFactory.makeString("Swappable TVA Cache");
        $str55$Cannot_reconnect__A__which_is_not = SubLObjectFactory.makeString("Cannot reconnect ~A, which is not a swappable TVA cache.");
        $sym56$_TVA_CACHE_REGISTRY_ = SubLObjectFactory.makeSymbol("*TVA-CACHE-REGISTRY*");
        $const57$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $kw58$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw59$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $kw60$STACK = SubLObjectFactory.makeKeyword("STACK");
        $kw61$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $const62$True_JustificationTruth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $sym63$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw64$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str65$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym66$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw67$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str68$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw69$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str70$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $str71$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str72$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str73$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $str74$Creating_TVA_cache_for_ = SubLObjectFactory.makeString("Creating TVA cache for ");
        $str75$__arg_ = SubLObjectFactory.makeString(" (arg ");
        $str76$_ = SubLObjectFactory.makeString(")");
        $sym77$_TVA_CACHE_SPEC_PRED_STATS_ = SubLObjectFactory.makeSymbol("*TVA-CACHE-SPEC-PRED-STATS*");
        $list78 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("MT-INFO"), (SubLObject)SubLObjectFactory.makeSymbol("TIME"));
        $list79 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUB-CACHE"), (SubLObject)SubLObjectFactory.makeSymbol("CACHE"), (SubLObject)SubLObjectFactory.makeSymbol("INVERSE?"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE?")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE?"));
        $kw81$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw82$DONE_ = SubLObjectFactory.makeKeyword("DONE?");
        $sym83$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym84$_TVA_CACHE_USE_MEMOIZED_SPEC_PRED_LISTS__ = SubLObjectFactory.makeSymbol("*TVA-CACHE-USE-MEMOIZED-SPEC-PRED-LISTS?*");
        $sym85$DO_TVA_SUB_CACHES_VIA_MEMOIZED_LISTS = SubLObjectFactory.makeSymbol("DO-TVA-SUB-CACHES-VIA-MEMOIZED-LISTS");
        $sym86$DO_TVA_SUB_CACHES_VIA_INDEX_SURFING = SubLObjectFactory.makeSymbol("DO-TVA-SUB-CACHES-VIA-INDEX-SURFING");
        $sym87$SPEC_PRED = SubLObjectFactory.makeUninternedSymbol("SPEC-PRED");
        $sym88$DO_ALL_SPEC_PREDICATES_AND_INVERSES = SubLObjectFactory.makeSymbol("DO-ALL-SPEC-PREDICATES-AND-INVERSES");
        $sym89$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym90$FIF = SubLObjectFactory.makeSymbol("FIF");
        $sym91$FIND_TVA_SUB_CACHE = SubLObjectFactory.makeSymbol("FIND-TVA-SUB-CACHE");
        $sym92$SPEC_PRED = SubLObjectFactory.makeUninternedSymbol("SPEC-PRED");
        $sym93$SPEC_PREDS = SubLObjectFactory.makeUninternedSymbol("SPEC-PREDS");
        $sym94$SPEC_INVERSES = SubLObjectFactory.makeUninternedSymbol("SPEC-INVERSES");
        $sym95$CMULTIPLE_VALUE_BIND = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND");
        $sym96$TVA_CACHE_SPEC_PREDS_AND_INVERSES = SubLObjectFactory.makeSymbol("TVA-CACHE-SPEC-PREDS-AND-INVERSES");
        $sym97$CSOME = SubLObjectFactory.makeSymbol("CSOME");
        $list98 = ConsesLow.list((SubLObject)tva_cache.NIL);
        $list99 = ConsesLow.list((SubLObject)tva_cache.T);
        $sym100$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const101$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym102$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER");
        $sym103$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $int104$5000 = SubLObjectFactory.makeInteger(5000);
        $sym105$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $list106 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"));
        $list107 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("TRANSITIVE-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MORE-SUPPORTS"));
        $sym108$TVA_CACHE_SUPPORT_EQUAL_ = SubLObjectFactory.makeSymbol("TVA-CACHE-SUPPORT-EQUAL?");
        $kw109$GENLPREDS = SubLObjectFactory.makeKeyword("GENLPREDS");
        $sym110$WITH_FILE_VECTOR_BACKED_MAP_STREAM_LOCK = SubLObjectFactory.makeSymbol("WITH-FILE-VECTOR-BACKED-MAP-STREAM-LOCK");
        $list111 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SWAPPABLE-TVA-CACHE-LOCK*"));
        $sym112$TVA_CACHE_LOOKUP_INTERNAL = SubLObjectFactory.makeSymbol("TVA-CACHE-LOOKUP-INTERNAL");
        $list113 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"));
        $list114 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBKEY"), (SubLObject)SubLObjectFactory.makeSymbol("SUBKEY-SUPPORTS"));
        $list115 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("SUBKEY-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBKEY-VALUE-SUPPORTS"));
        $int116$32768 = SubLObjectFactory.makeInteger(32768);
        $sym117$TVA_CACHE_VALID_SUPPORT_ = SubLObjectFactory.makeSymbol("TVA-CACHE-VALID-SUPPORT?");
        $list118 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("GAF"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("SPECIFIED-PRED"));
        $str119$No_specified_pred_for__S = SubLObjectFactory.makeString("No specified pred for ~S");
        $kw120$INVERSE = SubLObjectFactory.makeKeyword("INVERSE");
        $kw121$SPEC_PRED = SubLObjectFactory.makeKeyword("SPEC-PRED");
        $sym122$ADD_TVA_CACHE_VALUE = SubLObjectFactory.makeSymbol("ADD-TVA-CACHE-VALUE");
        $sym123$ADD_TVA_CACHE_VALUE_CACHED = SubLObjectFactory.makeSymbol("ADD-TVA-CACHE-VALUE-CACHED");
        $list124 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BIN-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"));
        $sym125$_ADD_TVA_CACHE_VALUE_CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*ADD-TVA-CACHE-VALUE-CACHED-CACHING-STATE*");
        $sym126$REMOVE_TVA_CACHE_VALUE = SubLObjectFactory.makeSymbol("REMOVE-TVA-CACHE-VALUE");
        $sym127$REMOVE_TVA_CACHE_VALUE_CACHED = SubLObjectFactory.makeSymbol("REMOVE-TVA-CACHE-VALUE-CACHED");
        $sym128$_REMOVE_TVA_CACHE_VALUE_CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*REMOVE-TVA-CACHE-VALUE-CACHED-CACHING-STATE*");
        $sym129$ADD_TVA_CACHE_KEY = SubLObjectFactory.makeSymbol("ADD-TVA-CACHE-KEY");
        $sym130$ADD_TVA_CACHE_KEY_CACHED = SubLObjectFactory.makeSymbol("ADD-TVA-CACHE-KEY-CACHED");
        $list131 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRANS-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"));
        $list132 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CACHE"), (SubLObject)SubLObjectFactory.makeSymbol("INVERSE?"), (SubLObject)SubLObjectFactory.makeSymbol("ORIGINAL-TRANS-PRED"));
        $sym133$_ADD_TVA_CACHE_KEY_CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*ADD-TVA-CACHE-KEY-CACHED-CACHING-STATE*");
        $sym134$REMOVE_TVA_CACHE_KEY = SubLObjectFactory.makeSymbol("REMOVE-TVA-CACHE-KEY");
        $list135 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BIN-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARGNUM"));
        $list136 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $sym137$BINARY_PREDICATE_ = SubLObjectFactory.makeSymbol("BINARY-PREDICATE?");
        $const138$transitiveViaArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transitiveViaArg"));
        $kw139$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $const140$transitiveViaArgInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transitiveViaArgInverse"));
        $str141$Error_initializing__S_____S___Der = SubLObjectFactory.makeString("Error initializing ~S:~% ~S~% Deregistering cache.");
        $str142$TVA_Caching_ = SubLObjectFactory.makeString("TVA Caching ");
        $str143$_ = SubLObjectFactory.makeString(" ");
        $str144$_assertions___ = SubLObjectFactory.makeString(" assertions...");
        $const145$relationAllInstance = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllInstance"));
        $sym146$TVA_CACHE_MAX_INSTANCES_TO_CACHE = SubLObjectFactory.makeSymbol("TVA-CACHE-MAX-INSTANCES-TO-CACHE");
        $int147$25 = SubLObjectFactory.makeInteger(25);
        $sym148$_TVA_CACHE_MAX_INSTANCES_TO_CACHE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*TVA-CACHE-MAX-INSTANCES-TO-CACHE-CACHING-STATE*");
        $const149$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list150 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("LINK-NODE"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("MT"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("TV"));
        $const151$relationInstanceAll = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceAll"));
        $kw152$COMPLEX = SubLObjectFactory.makeKeyword("COMPLEX");
        $str153$Complex_TVA_cache_support_in__S = SubLObjectFactory.makeString("Complex TVA cache support in ~S");
        $list154 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("COMPLEX"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $list155 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IMPLICIT-KEY"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"));
        $sym156$INDEXED_TERM_P = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $kw157$TOP = SubLObjectFactory.makeKeyword("TOP");
        $kw158$TRUE_DEF = SubLObjectFactory.makeKeyword("TRUE-DEF");
        $list159 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TransitiveBinaryPredicate")));
        $sym160$PRED = SubLObjectFactory.makeSymbol("PRED");
        $str161$Don_t_know_how_to_find_the_transi = SubLObjectFactory.makeString("Don't know how to find the transitive predicate from~% ~S");
        $list162 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SPEC-PRED"), (SubLObject)SubLObjectFactory.makeKeyword("INVERSE"));
        $str163$Can_t_get_transitivity_support_fr = SubLObjectFactory.makeString("Can't get transitivity support from ~S");
        $sym164$TVA_CACHE_SUPPORT_GAF = SubLObjectFactory.makeSymbol("TVA-CACHE-SUPPORT-GAF");
        $list165 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"));
        $const166$TransitiveBinaryPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TransitiveBinaryPredicate"));
        $int167$96 = SubLObjectFactory.makeInteger(96);
        $sym168$CFASL_INPUT_TVA_CACHE = SubLObjectFactory.makeSymbol("CFASL-INPUT-TVA-CACHE");
        $sym169$CFASL_OUTPUT_OBJECT_TVA_CACHE_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-TVA-CACHE-METHOD");
        $str170$tva_cache_contents = SubLObjectFactory.makeString("tva-cache-contents");
        $str171$tva_cache_contents_index = SubLObjectFactory.makeString("tva-cache-contents-index");
        $list172 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TVA-CACHES"));
        $str173$Reconnecting_to_legacy_unit_files = SubLObjectFactory.makeString("Reconnecting to legacy unit files w/out TVA cache contents in ~A and ~A.");
        $sym174$DUMP_TVA_CACHE_TO_STREAM = SubLObjectFactory.makeSymbol("DUMP-TVA-CACHE-TO-STREAM");
        $list175 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DUMP-SWAPPABLE-TVA-CACHE-TO-STREAM"));
    }
    
    public static final class $tva_cache_native extends SubLStructNative
    {
        public SubLObject $pred;
        public SubLObject $index_argnum;
        public SubLObject $tva_pred_gafs;
        public SubLObject $tvai_pred_gafs;
        public SubLObject $map;
        private static final SubLStructDeclNative structDecl;
        
        public $tva_cache_native() {
            this.$pred = (SubLObject)CommonSymbols.NIL;
            this.$index_argnum = (SubLObject)CommonSymbols.NIL;
            this.$tva_pred_gafs = (SubLObject)CommonSymbols.NIL;
            this.$tvai_pred_gafs = (SubLObject)CommonSymbols.NIL;
            this.$map = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$tva_cache_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$pred;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$index_argnum;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$tva_pred_gafs;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$tvai_pred_gafs;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$map;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$pred = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$index_argnum = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$tva_pred_gafs = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$tvai_pred_gafs = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$map = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$tva_cache_native.class, tva_cache.$sym21$TVA_CACHE, tva_cache.$sym22$TVA_CACHE_P, tva_cache.$list23, tva_cache.$list24, new String[] { "$pred", "$index_argnum", "$tva_pred_gafs", "$tvai_pred_gafs", "$map" }, tva_cache.$list25, tva_cache.$list26, tva_cache.$sym27$PPRINT_TVA_CACHE);
        }
    }
    
    public static final class $tva_cache_p$UnaryFunction extends UnaryFunction
    {
        public $tva_cache_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TVA-CACHE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return tva_cache.tva_cache_p(arg1);
        }
    }
}

/*

	Total time: 9336 ms
	
*/