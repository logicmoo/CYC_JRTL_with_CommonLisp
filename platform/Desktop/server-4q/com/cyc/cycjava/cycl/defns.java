package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class defns extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.defns";
    public static final String myFingerPrint = "14e8cb379dbc10f8869aca5e214e3d572c58f0bb0c719ac815be8721c2577ae5";
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 4521L)
    private static SubLSymbol $index_to_defns_cache_vector$;
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 4742L)
    public static SubLSymbol $has_suf_defn_cache_index$;
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 4785L)
    public static SubLSymbol $has_quoted_suf_defn_cache_index$;
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 4835L)
    public static SubLSymbol $iff_defns_index$;
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 4869L)
    public static SubLSymbol $quoted_iff_defns_index$;
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 4910L)
    public static SubLSymbol $suf_defns_index$;
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 4944L)
    public static SubLSymbol $quoted_suf_defns_index$;
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 4985L)
    public static SubLSymbol $nec_defns_index$;
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 5019L)
    public static SubLSymbol $quoted_nec_defns_index$;
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 5060L)
    public static SubLSymbol $suf_defn_cache_index$;
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 5099L)
    public static SubLSymbol $suf_quoted_defn_cache_index$;
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 5145L)
    public static SubLSymbol $suf_function_cache_index$;
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 5189L)
    public static SubLSymbol $suf_quoted_function_cache_index$;
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 17716L)
    private static SubLSymbol $defn_term$;
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 17750L)
    private static SubLSymbol $org_collection$;
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 17788L)
    private static SubLSymbol $failing_suf_defns$;
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 17971L)
    public static SubLSymbol $new_defns_admitP_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 19230L)
    public static SubLSymbol $new_defns_rejectP_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 20350L)
    public static SubLSymbol $new_quoted_defns_admitP_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 20628L)
    public static SubLSymbol $new_quoted_defns_rejectP_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 28269L)
    public static SubLSymbol $nec_defn_rejectsP_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 37106L)
    private static SubLSymbol $min_defn_admits_map$;
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 38367L)
    private static SubLSymbol $min_quoted_defn_admits_map$;
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 43468L)
    public static SubLSymbol $new_handle_added_genl_for_suf_defns_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 43638L)
    public static SubLSymbol $new_handle_added_genl_for_suf_quoted_defns_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 44238L)
    public static SubLSymbol $new_handle_removed_genl_for_suf_defns_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 44412L)
    public static SubLSymbol $new_handle_removed_genl_for_suf_quoted_defns_meters$;
    private static final SubLSymbol $sym0$_INDEX_TO_DEFNS_CACHE_VECTOR_;
    private static final SubLInteger $int1$256;
    private static final SubLInteger $int2$200;
    private static final SubLInteger $int3$64;
    private static final SubLSymbol $sym4$DEFNS_CACHE_INDEX_P;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $kw7$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw8$DONE;
    private static final SubLSymbol $sym9$CDOHASH;
    private static final SubLSymbol $sym10$GET_DEFN_CACHE_FROM_INDEX;
    private static final SubLSymbol $sym11$PROGRESS_CDOHASH;
    private static final SubLSymbol $sym12$_NEW_DEFNS_ADMIT__METERS_;
    private static final SubLSymbol $kw13$CALLS;
    private static final SubLSymbol $kw14$TIMES;
    private static final SubLSymbol $kw15$RESULTS;
    private static final SubLSymbol $kw16$ARGS;
    private static final SubLSymbol $kw17$ARG_LIST;
    private static final SubLList $list18;
    private static final SubLSymbol $kw19$FUNCTION;
    private static final SubLSymbol $sym20$NEW_DEFNS_ADMIT_;
    private static final SubLSymbol $kw21$RESET;
    private static final SubLSymbol $sym22$RESET_NEW_DEFNS_ADMIT__METERS;
    private static final SubLSymbol $kw23$ADMITTED;
    private static final SubLSymbol $kw24$REJECTED;
    private static final SubLSymbol $sym25$_NEW_DEFNS_REJECT__METERS_;
    private static final SubLSymbol $sym26$NEW_DEFNS_REJECT_;
    private static final SubLSymbol $sym27$RESET_NEW_DEFNS_REJECT__METERS;
    private static final SubLSymbol $sym28$_NEW_QUOTED_DEFNS_ADMIT__METERS_;
    private static final SubLSymbol $sym29$NEW_QUOTED_DEFNS_ADMIT_;
    private static final SubLSymbol $sym30$RESET_NEW_QUOTED_DEFNS_ADMIT__METERS;
    private static final SubLSymbol $sym31$_NEW_QUOTED_DEFNS_REJECT__METERS_;
    private static final SubLSymbol $sym32$NEW_QUOTED_DEFNS_REJECT_;
    private static final SubLSymbol $sym33$RESET_NEW_QUOTED_DEFNS_REJECT__METERS;
    private static final SubLSymbol $kw34$BREADTH;
    private static final SubLSymbol $kw35$QUEUE;
    private static final SubLSymbol $kw36$STACK;
    private static final SubLSymbol $sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw38$ERROR;
    private static final SubLString $str39$_A_is_not_a__A;
    private static final SubLSymbol $sym40$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw41$CERROR;
    private static final SubLString $str42$continue_anyway;
    private static final SubLSymbol $kw43$WARN;
    private static final SubLString $str44$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLObject $const45$genls;
    private static final SubLString $str46$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str47$attempting_to_bind_direction_link;
    private static final SubLString $str48$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLSymbol $kw49$DISJOINT;
    private static final SubLSymbol $sym50$COL_QUOTED_DEFN_ADMITS_;
    private static final SubLSymbol $sym51$COL_DEFN_ADMITS_;
    private static final SubLList $list52;
    private static final SubLSymbol $kw53$AT_CONSTRAINT_GAF;
    private static final SubLSymbol $kw54$MAL_ARG_WRT_QUOTED_SUF_DEFNS;
    private static final SubLSymbol $kw55$MAL_ARG_WRT_SUF_DEFNS;
    private static final SubLSymbol $kw56$MAL_ARG_WRT_QUOTED_IFF_DEFN;
    private static final SubLSymbol $kw57$MAL_ARG_WRT_IFF_DEFN;
    private static final SubLSymbol $sym58$_NEC_DEFN_REJECTS__METERS_;
    private static final SubLList $list59;
    private static final SubLSymbol $sym60$NEC_DEFN_REJECTS_;
    private static final SubLSymbol $sym61$RESET_NEC_DEFN_REJECTS__METERS;
    private static final SubLSymbol $kw62$MAL_ARG_WRT_QUOTED_NEC_DEFN;
    private static final SubLSymbol $kw63$MAL_ARG_WRT_NEC_DEFN;
    private static final SubLObject $const64$EverythingPSC;
    private static final SubLSymbol $kw65$GENLS;
    private static final SubLSymbol $sym66$ADMITTING_QUOTED_DEFN_ASSERTION;
    private static final SubLSymbol $sym67$ADMITTING_DEFN_ASSERTION;
    private static final SubLSymbol $sym68$ADMITTING_QUOTED_DEFN_ASSERTIONS;
    private static final SubLSymbol $sym69$ADMITTING_DEFN_ASSERTIONS;
    private static final SubLList $list70;
    private static final SubLList $list71;
    private static final SubLSymbol $kw72$ASCENDING;
    private static final SubLList $list73;
    private static final SubLList $list74;
    private static final SubLObject $const75$CollectionIntersection2Fn;
    private static final SubLObject $const76$CollectionIntersectionFn;
    private static final SubLObject $const77$SomeFn;
    private static final SubLSymbol $kw78$IFF;
    private static final SubLSymbol $sym79$NEW_ADD_IFF_DEFN;
    private static final SubLSymbol $sym80$NEW_REMOVE_IFF_DEFN;
    private static final SubLSymbol $kw81$SUF;
    private static final SubLSymbol $sym82$NEW_ADD_SUF_DEFN;
    private static final SubLSymbol $sym83$NEW_REMOVE_SUF_DEFN;
    private static final SubLSymbol $kw84$NEC;
    private static final SubLSymbol $sym85$ADD_NEC_DEFN;
    private static final SubLSymbol $sym86$REMOVE_NEC_DEFN;
    private static final SubLSymbol $kw87$QIFF;
    private static final SubLSymbol $sym88$NEW_ADD_IFF_QUOTED_DEFN;
    private static final SubLSymbol $sym89$NEW_REMOVE_IFF_QUOTED_DEFN;
    private static final SubLSymbol $kw90$QSUF;
    private static final SubLSymbol $sym91$NEW_ADD_SUF_QUOTED_DEFN;
    private static final SubLSymbol $sym92$NEW_REMOVE_SUF_QUOTED_DEFN;
    private static final SubLSymbol $kw93$QNEC;
    private static final SubLSymbol $sym94$ADD_NEC_QUOTED_DEFN;
    private static final SubLSymbol $sym95$REMOVE_NEC_QUOTED_DEFN;
    private static final SubLSymbol $sym96$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLSymbol $sym97$_NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS_;
    private static final SubLList $list98;
    private static final SubLSymbol $sym99$NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS;
    private static final SubLSymbol $sym100$RESET_NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS;
    private static final SubLSymbol $sym101$_NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS_;
    private static final SubLSymbol $sym102$NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS;
    private static final SubLSymbol $sym103$RESET_NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS;
    private static final SubLSymbol $sym104$_NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS_;
    private static final SubLSymbol $sym105$NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS;
    private static final SubLSymbol $sym106$RESET_NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS;
    private static final SubLSymbol $sym107$_NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS_;
    private static final SubLSymbol $sym108$NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS;
    private static final SubLSymbol $sym109$RESET_NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS;
    private static final SubLInteger $int110$400;
    private static final SubLInteger $int111$100;
    private static final SubLString $str112$Initializing_defns___;
    private static final SubLObject $const113$defnIff;
    private static final SubLSymbol $kw114$GAF;
    private static final SubLSymbol $kw115$TRUE;
    private static final SubLObject $const116$defnSufficient;
    private static final SubLObject $const117$defnNecessary;
    private static final SubLObject $const118$quotedDefnIff;
    private static final SubLObject $const119$quotedDefnSufficient;
    private static final SubLObject $const120$quotedDefnNecessary;
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 5240L)
    public static SubLObject get_index_to_defns_cache_vector() {
        if (defns.NIL == defns.$index_to_defns_cache_vector$.getGlobalValue()) {
            defns.$index_to_defns_cache_vector$.setGlobalValue(Vectors.make_vector((SubLObject)defns.TWELVE_INTEGER, (SubLObject)defns.UNPROVIDED));
            Vectors.set_aref(defns.$index_to_defns_cache_vector$.getGlobalValue(), defns.$has_suf_defn_cache_index$.getGlobalValue(), (SubLObject)defns.NIL);
            Vectors.set_aref(defns.$index_to_defns_cache_vector$.getGlobalValue(), defns.$has_quoted_suf_defn_cache_index$.getGlobalValue(), (SubLObject)defns.NIL);
            Vectors.set_aref(defns.$index_to_defns_cache_vector$.getGlobalValue(), defns.$iff_defns_index$.getGlobalValue(), (SubLObject)defns.NIL);
            Vectors.set_aref(defns.$index_to_defns_cache_vector$.getGlobalValue(), defns.$quoted_iff_defns_index$.getGlobalValue(), (SubLObject)defns.NIL);
            Vectors.set_aref(defns.$index_to_defns_cache_vector$.getGlobalValue(), defns.$suf_defns_index$.getGlobalValue(), (SubLObject)defns.NIL);
            Vectors.set_aref(defns.$index_to_defns_cache_vector$.getGlobalValue(), defns.$quoted_suf_defns_index$.getGlobalValue(), (SubLObject)defns.NIL);
            Vectors.set_aref(defns.$index_to_defns_cache_vector$.getGlobalValue(), defns.$nec_defns_index$.getGlobalValue(), (SubLObject)defns.NIL);
            Vectors.set_aref(defns.$index_to_defns_cache_vector$.getGlobalValue(), defns.$quoted_nec_defns_index$.getGlobalValue(), (SubLObject)defns.NIL);
            Vectors.set_aref(defns.$index_to_defns_cache_vector$.getGlobalValue(), defns.$suf_defn_cache_index$.getGlobalValue(), Hashtables.make_hash_table((SubLObject)defns.$int1$256, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
            Vectors.set_aref(defns.$index_to_defns_cache_vector$.getGlobalValue(), defns.$suf_quoted_defn_cache_index$.getGlobalValue(), Hashtables.make_hash_table((SubLObject)defns.$int2$200, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
            Vectors.set_aref(defns.$index_to_defns_cache_vector$.getGlobalValue(), defns.$suf_function_cache_index$.getGlobalValue(), Hashtables.make_hash_table((SubLObject)defns.$int1$256, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
            Vectors.set_aref(defns.$index_to_defns_cache_vector$.getGlobalValue(), defns.$suf_quoted_function_cache_index$.getGlobalValue(), Hashtables.make_hash_table((SubLObject)defns.$int3$64, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
        }
        return defns.$index_to_defns_cache_vector$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 6402L)
    public static SubLObject get_defn_cache_from_index(final SubLObject defn_cache_index) {
        assert defns.NIL != defns_cache_index_p(defn_cache_index) : defn_cache_index;
        final SubLObject defns_cache = Vectors.aref(get_index_to_defns_cache_vector(), defn_cache_index);
        return defns_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 6737L)
    public static SubLObject defns_cache_index_p(final SubLObject possible_index) {
        return (SubLObject)((possible_index.isInteger() && possible_index.numGE((SubLObject)defns.ZERO_INTEGER) && possible_index.numL((SubLObject)defns.TWELVE_INTEGER)) ? defns.T : defns.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 7509L)
    public static SubLObject defns_cache_make_hash_table(final SubLObject defn_cache_index, final SubLObject size) {
        assert defns.NIL != defns_cache_index_p(defn_cache_index) : defn_cache_index;
        Vectors.set_aref(get_index_to_defns_cache_vector(), defn_cache_index, Hashtables.make_hash_table(size, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
        return (SubLObject)defns.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 8029L)
    public static SubLObject defns_cache_definedP(final SubLObject defn_cache_index) {
        assert defns.NIL != defns_cache_index_p(defn_cache_index) : defn_cache_index;
        return (SubLObject)((defns.NIL != get_defn_cache_from_index(defn_cache_index)) ? defns.T : defns.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 8347L)
    public static SubLObject defns_cache_hash_table_p(final SubLObject defn_cache_index) {
        assert defns.NIL != defns_cache_index_p(defn_cache_index) : defn_cache_index;
        return Types.hash_table_p(get_defn_cache_from_index(defn_cache_index));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 8676L)
    public static SubLObject defns_cache_hash_table_empty_p(final SubLObject defn_cache_index) {
        assert defns.NIL != defns_cache_index_p(defn_cache_index) : defn_cache_index;
        return hash_table_utilities.hash_table_empty_p(get_defn_cache_from_index(defn_cache_index));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 9032L)
    public static SubLObject defns_cache_clrhash(final SubLObject defn_cache_index) {
        assert defns.NIL != defns_cache_index_p(defn_cache_index) : defn_cache_index;
        return Hashtables.clrhash(get_defn_cache_from_index(defn_cache_index));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 9354L)
    public static SubLObject defns_cache_gethash(final SubLObject key, final SubLObject defn_cache_index) {
        assert defns.NIL != defns_cache_index_p(defn_cache_index) : defn_cache_index;
        return Hashtables.gethash(key, get_defn_cache_from_index(defn_cache_index), (SubLObject)defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 9688L)
    public static SubLObject defns_cache_sethash(final SubLObject key, final SubLObject defn_cache_index, final SubLObject value) {
        assert defns.NIL != defns_cache_index_p(defn_cache_index) : defn_cache_index;
        return Hashtables.sethash(key, get_defn_cache_from_index(defn_cache_index), value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 10044L)
    public static SubLObject defns_cache_remhash(final SubLObject key, final SubLObject defn_cache_index) {
        assert defns.NIL != defns_cache_index_p(defn_cache_index) : defn_cache_index;
        return Hashtables.remhash(key, get_defn_cache_from_index(defn_cache_index));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 10379L)
    public static SubLObject defns_cache_remove_value_from_hash(final SubLObject key, final SubLObject value, final SubLObject defn_cache_index) {
        assert defns.NIL != defns_cache_index_p(defn_cache_index) : defn_cache_index;
        return hash_table_utilities.remove_value_from_hash(key, value, get_defn_cache_from_index(defn_cache_index), (SubLObject)defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 10776L)
    public static SubLObject defns_cache_push_hash(final SubLObject key, final SubLObject value, final SubLObject defn_cache_index) {
        assert defns.NIL != defns_cache_index_p(defn_cache_index) : defn_cache_index;
        return hash_table_utilities.push_hash(key, value, get_defn_cache_from_index(defn_cache_index));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 11126L)
    public static SubLObject defns_cache_gethash_without_values(final SubLObject key, final SubLObject defn_cache_index) {
        assert defns.NIL != defns_cache_index_p(defn_cache_index) : defn_cache_index;
        return Hashtables.gethash_without_values(key, get_defn_cache_from_index(defn_cache_index), (SubLObject)defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 11505L)
    public static SubLObject defns_cache_hash_table_to_alist(final SubLObject defn_cache_index) {
        assert defns.NIL != defns_cache_index_p(defn_cache_index) : defn_cache_index;
        return hash_table_utilities.hash_table_to_alist(get_defn_cache_from_index(defn_cache_index));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 11865L)
    public static SubLObject defns_cache_hash_table_count(final SubLObject defn_cache_index) {
        assert defns.NIL != defns_cache_index_p(defn_cache_index) : defn_cache_index;
        return Hashtables.hash_table_count(get_defn_cache_from_index(defn_cache_index));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 12217L)
    public static SubLObject do_defns_cache_hash(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)defns.$list5);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)defns.NIL;
        SubLObject val = (SubLObject)defns.NIL;
        SubLObject defn_cache_index = (SubLObject)defns.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)defns.$list5);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)defns.$list5);
        val = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)defns.$list5);
        defn_cache_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)defns.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)defns.NIL;
        SubLObject current_$1 = (SubLObject)defns.NIL;
        while (defns.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)defns.$list5);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)defns.$list5);
            if (defns.NIL == conses_high.member(current_$1, (SubLObject)defns.$list6, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED)) {
                bad = (SubLObject)defns.T;
            }
            if (current_$1 == defns.$kw7$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (defns.NIL != bad && defns.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)defns.$list5);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)defns.$kw8$DONE, current);
        final SubLObject done = (SubLObject)((defns.NIL != done_tail) ? conses_high.cadr(done_tail) : defns.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)defns.$sym9$CDOHASH, (SubLObject)ConsesLow.list(key, val, (SubLObject)ConsesLow.list((SubLObject)defns.$sym10$GET_DEFN_CACHE_FROM_INDEX, defn_cache_index)), ConsesLow.append(body, (SubLObject)defns.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 12786L)
    public static SubLObject progress_do_defns_cache_hash(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)defns.$list5);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)defns.NIL;
        SubLObject val = (SubLObject)defns.NIL;
        SubLObject defn_cache_index = (SubLObject)defns.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)defns.$list5);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)defns.$list5);
        val = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)defns.$list5);
        defn_cache_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)defns.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)defns.NIL;
        SubLObject current_$2 = (SubLObject)defns.NIL;
        while (defns.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)defns.$list5);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)defns.$list5);
            if (defns.NIL == conses_high.member(current_$2, (SubLObject)defns.$list6, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED)) {
                bad = (SubLObject)defns.T;
            }
            if (current_$2 == defns.$kw7$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (defns.NIL != bad && defns.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)defns.$list5);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)defns.$kw8$DONE, current);
        final SubLObject done = (SubLObject)((defns.NIL != done_tail) ? conses_high.cadr(done_tail) : defns.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)defns.$sym11$PROGRESS_CDOHASH, (SubLObject)ConsesLow.list(key, val, (SubLObject)ConsesLow.list((SubLObject)defns.$sym10$GET_DEFN_CACHE_FROM_INDEX, defn_cache_index)), ConsesLow.append(body, (SubLObject)defns.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 13757L)
    public static SubLObject suf_defn_count(final SubLObject col, final SubLObject quotedP) {
        if (defns.NIL == defns_cache_definedP(defns.$has_suf_defn_cache_index$.getGlobalValue()) && defns.NIL == defns_cache_definedP(defns.$has_quoted_suf_defn_cache_index$.getGlobalValue())) {
            initialize_defns_cache();
        }
        if (defns.NIL != quotedP) {
            return defns_cache_gethash(col, defns.$has_quoted_suf_defn_cache_index$.getGlobalValue());
        }
        return defns_cache_gethash(col, defns.$has_suf_defn_cache_index$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 14301L)
    public static SubLObject has_suf_defn_somewhereP(final SubLObject col, final SubLObject quotedP) {
        return list_utilities.sublisp_boolean(suf_defn_count(col, quotedP));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 14430L)
    public static SubLObject set_suf_defn_count(final SubLObject col, final SubLObject count, final SubLObject quotedP) {
        if (defns.NIL == defns_cache_definedP(defns.$has_suf_defn_cache_index$.getGlobalValue()) && defns.NIL == defns_cache_definedP(defns.$has_quoted_suf_defn_cache_index$.getGlobalValue())) {
            initialize_defns_cache();
        }
        if (defns.NIL != quotedP) {
            return defns_cache_sethash(col, defns.$has_quoted_suf_defn_cache_index$.getGlobalValue(), count);
        }
        return defns_cache_sethash(col, defns.$has_suf_defn_cache_index$.getGlobalValue(), count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 14835L)
    public static SubLObject rem_suf_defn_count(final SubLObject col, final SubLObject quotedP) {
        if (defns.NIL == defns_cache_definedP(defns.$has_suf_defn_cache_index$.getGlobalValue()) && defns.NIL == defns_cache_definedP(defns.$has_quoted_suf_defn_cache_index$.getGlobalValue())) {
            initialize_defns_cache();
        }
        if (defns.NIL != quotedP) {
            return defns_cache_remhash(col, defns.$has_quoted_suf_defn_cache_index$.getGlobalValue());
        }
        return defns_cache_remhash(col, defns.$has_suf_defn_cache_index$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 15222L)
    public static SubLObject iff_defn(final SubLObject col, final SubLObject quotedP) {
        if (defns.NIL == defns_cache_definedP(defns.$iff_defns_index$.getGlobalValue()) && defns.NIL == defns_cache_definedP(defns.$quoted_iff_defns_index$.getGlobalValue())) {
            initialize_defns_cache();
        }
        if (defns.NIL != quotedP) {
            return defns_cache_gethash(col, defns.$quoted_iff_defns_index$.getGlobalValue());
        }
        return defns_cache_gethash(col, defns.$iff_defns_index$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 15567L)
    public static SubLObject rem_iff_defn(final SubLObject col, final SubLObject quotedP) {
        if (defns.NIL == defns_cache_definedP(defns.$iff_defns_index$.getGlobalValue()) && defns.NIL == defns_cache_definedP(defns.$quoted_iff_defns_index$.getGlobalValue())) {
            initialize_defns_cache();
        }
        if (defns.NIL != quotedP) {
            return defns_cache_remhash(col, defns.$quoted_iff_defns_index$.getGlobalValue());
        }
        return defns_cache_remhash(col, defns.$iff_defns_index$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 15913L)
    public static SubLObject suf_defns(final SubLObject col, final SubLObject quotedP) {
        if (defns.NIL == defns_cache_definedP(defns.$suf_defns_index$.getGlobalValue()) && defns.NIL == defns_cache_definedP(defns.$quoted_suf_defns_index$.getGlobalValue())) {
            initialize_defns_cache();
        }
        if (defns.NIL != quotedP) {
            return defns_cache_gethash(col, defns.$quoted_suf_defns_index$.getGlobalValue());
        }
        return defns_cache_gethash(col, defns.$suf_defns_index$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 16256L)
    public static SubLObject rem_suf_defn(final SubLObject col, final SubLObject assertion, final SubLObject quotedP) {
        if (defns.NIL == defns_cache_definedP(defns.$suf_defns_index$.getGlobalValue()) && defns.NIL == defns_cache_definedP(defns.$quoted_suf_defns_index$.getGlobalValue())) {
            initialize_defns_cache();
        }
        if (defns.NIL != quotedP) {
            return defns_cache_remove_value_from_hash(col, assertion, defns.$quoted_suf_defns_index$.getGlobalValue());
        }
        return defns_cache_remove_value_from_hash(col, assertion, defns.$suf_defns_index$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 16661L)
    public static SubLObject new_suf_defnP(final SubLObject col, final SubLObject defn, SubLObject quotedP) {
        if (quotedP == defns.UNPROVIDED) {
            quotedP = (SubLObject)defns.NIL;
        }
        SubLObject foundP = (SubLObject)defns.NIL;
        if (defns.NIL == foundP) {
            SubLObject csome_list_var = suf_defns(col, quotedP);
            SubLObject assertion = (SubLObject)defns.NIL;
            assertion = csome_list_var.first();
            while (defns.NIL == foundP && defns.NIL != csome_list_var) {
                if (defns.NIL != assertions_high.valid_assertion(assertion, (SubLObject)defns.UNPROVIDED)) {
                    foundP = Equality.eq(defn, el_utilities.cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion)));
                }
                csome_list_var = csome_list_var.rest();
                assertion = csome_list_var.first();
            }
        }
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 16967L)
    public static SubLObject nec_defns(final SubLObject col, final SubLObject quotedP) {
        if (defns.NIL == defns_cache_definedP(defns.$nec_defns_index$.getGlobalValue()) && defns.NIL == defns_cache_definedP(defns.$quoted_nec_defns_index$.getGlobalValue())) {
            initialize_defns_cache();
        }
        if (defns.NIL != quotedP) {
            return defns_cache_gethash(col, defns.$quoted_nec_defns_index$.getGlobalValue());
        }
        return defns_cache_gethash(col, defns.$nec_defns_index$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 17311L)
    public static SubLObject rem_nec_defn(final SubLObject col, final SubLObject assertion, final SubLObject quotedP) {
        if (defns.NIL == defns_cache_definedP(defns.$nec_defns_index$.getGlobalValue()) && defns.NIL == defns_cache_definedP(defns.$quoted_nec_defns_index$.getGlobalValue())) {
            initialize_defns_cache();
        }
        if (defns.NIL != quotedP) {
            return defns_cache_remove_value_from_hash(col, assertion, defns.$quoted_nec_defns_index$.getGlobalValue());
        }
        return defns_cache_remove_value_from_hash(col, assertion, defns.$nec_defns_index$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 17829L)
    public static SubLObject has_some_defnP(final SubLObject col, final SubLObject quotedP) {
        return (SubLObject)SubLObjectFactory.makeBoolean(defns.NIL != iff_defn(col, quotedP) || defns.NIL != suf_defns(col, quotedP) || defns.NIL != nec_defns(col, quotedP));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 17971L)
    public static SubLObject reset_new_defns_admitP_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)defns.$kw13$CALLS, defns.$new_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)defns.$kw14$TIMES, defns.$new_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)defns.NIL);
        Hashtables.sethash((SubLObject)defns.$kw15$RESULTS, defns.$new_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)defns.NIL);
        Hashtables.sethash((SubLObject)defns.$kw16$ARGS, defns.$new_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)defns.NIL);
        Hashtables.sethash((SubLObject)defns.$kw17$ARG_LIST, defns.$new_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)defns.$list18);
        Hashtables.sethash((SubLObject)defns.$kw19$FUNCTION, defns.$new_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)defns.$sym20$NEW_DEFNS_ADMIT_);
        return (SubLObject)defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 17971L)
    public static SubLObject new_defns_admitP_metered(final SubLObject col, final SubLObject v_term, SubLObject mt) {
        if (mt == defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return defns_admitP_int(col, v_term, mt, (SubLObject)defns.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 17971L)
    public static SubLObject new_defns_admitP(final SubLObject col, final SubLObject v_term, SubLObject mt) {
        if (mt == defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)defns.NIL;
            SubLObject run_time = (SubLObject)defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = new_defns_admitP_metered(col, v_term, mt);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)defns.$kw13$CALLS, defns.$new_defns_admitP_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)defns.$kw13$CALLS, defns.$new_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED), (SubLObject)defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)defns.$kw14$TIMES, defns.$new_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)defns.$kw14$TIMES, defns.$new_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)defns.$kw15$RESULTS, defns.$new_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)defns.$kw15$RESULTS, defns.$new_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)defns.$kw16$ARGS, defns.$new_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(col, v_term, mt), Hashtables.gethash((SubLObject)defns.$kw16$ARGS, defns.$new_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED)));
            return result;
        }
        return new_defns_admitP_metered(col, v_term, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 18237L)
    public static SubLObject defns_admitP_int(SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (defns.NIL != obsolete.reifiable_natP(col, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED)) {
            col = narts_high.find_nart(col);
        }
        if (defns.NIL != at_vars.permitting_denotational_terms_admitted_by_defn_via_isaP()) {
            if (defns.NIL != quotedP) {
                if (defns.NIL != isa.quoted_isaP(v_term, col, mt, (SubLObject)defns.UNPROVIDED)) {
                    return (SubLObject)defns.T;
                }
            }
            else if (defns.NIL != isa.isaP(v_term, col, mt, (SubLObject)defns.UNPROVIDED)) {
                return (SubLObject)defns.T;
            }
        }
        if (defns.NIL == forts.fort_p(col) && defns.NIL == has_suf_defn_somewhereP(col, quotedP)) {
            return (SubLObject)defns.NIL;
        }
        SubLObject admittedP = (SubLObject)defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.make_quoted_defn_col_history_table(), thread);
            try {
                final SubLObject pcase_var = initial_check_defn_admit_status(col, v_term, mt, quotedP);
                if (pcase_var.eql((SubLObject)defns.$kw23$ADMITTED)) {
                    admittedP = (SubLObject)defns.T;
                }
                else if (pcase_var.eql((SubLObject)defns.$kw24$REJECTED)) {
                    admittedP = (SubLObject)defns.NIL;
                }
                else if (defns.NIL != defns_walk_admitP(col, v_term, mt, quotedP)) {
                    admittedP = (SubLObject)defns.T;
                }
                else if (defns.NIL == quotedP && defns.NIL != cycl_grammar.fast_quote_term_p(v_term)) {
                    final SubLObject denoted_term = czer_main.unquote_quoted_term(v_term, (SubLObject)defns.UNPROVIDED);
                    if (defns.NIL != denoted_term && defns.NIL != at_defns.quoted_defns_admitP(col, denoted_term, mt)) {
                        admittedP = (SubLObject)defns.T;
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)defns.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    at_defns.clear_defn_space();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        }
        finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        return admittedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 19230L)
    public static SubLObject reset_new_defns_rejectP_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)defns.$kw13$CALLS, defns.$new_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)defns.$kw14$TIMES, defns.$new_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)defns.NIL);
        Hashtables.sethash((SubLObject)defns.$kw15$RESULTS, defns.$new_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)defns.NIL);
        Hashtables.sethash((SubLObject)defns.$kw16$ARGS, defns.$new_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)defns.NIL);
        Hashtables.sethash((SubLObject)defns.$kw17$ARG_LIST, defns.$new_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)defns.$list18);
        Hashtables.sethash((SubLObject)defns.$kw19$FUNCTION, defns.$new_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)defns.$sym26$NEW_DEFNS_REJECT_);
        return (SubLObject)defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 19230L)
    public static SubLObject new_defns_rejectP_metered(final SubLObject col, final SubLObject v_term, SubLObject mt) {
        if (mt == defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return defns_rejectP_int(col, v_term, mt, (SubLObject)defns.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 19230L)
    public static SubLObject new_defns_rejectP(final SubLObject col, final SubLObject v_term, SubLObject mt) {
        if (mt == defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)defns.NIL;
            SubLObject run_time = (SubLObject)defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = new_defns_rejectP_metered(col, v_term, mt);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)defns.$kw13$CALLS, defns.$new_defns_rejectP_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)defns.$kw13$CALLS, defns.$new_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED), (SubLObject)defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)defns.$kw14$TIMES, defns.$new_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)defns.$kw14$TIMES, defns.$new_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)defns.$kw15$RESULTS, defns.$new_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)defns.$kw15$RESULTS, defns.$new_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)defns.$kw16$ARGS, defns.$new_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(col, v_term, mt), Hashtables.gethash((SubLObject)defns.$kw16$ARGS, defns.$new_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED)));
            return result;
        }
        return new_defns_rejectP_metered(col, v_term, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 19346L)
    public static SubLObject defns_rejectP_int(SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (defns.NIL != obsolete.reifiable_natP(col, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED)) {
            col = narts_high.find_nart(col);
        }
        if (defns.NIL != at_vars.permitting_denotational_terms_admitted_by_defn_via_isaP()) {
            if (defns.NIL != quotedP) {
                if (defns.NIL != isa.quoted_isaP(v_term, col, mt, (SubLObject)defns.UNPROVIDED)) {
                    return (SubLObject)defns.NIL;
                }
            }
            else if (defns.NIL != isa.isaP(v_term, col, mt, (SubLObject)defns.UNPROVIDED)) {
                return (SubLObject)defns.NIL;
            }
        }
        if (defns.NIL == forts.fort_p(col)) {
            return (SubLObject)defns.NIL;
        }
        SubLObject rejectedP = (SubLObject)defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                final SubLObject pcase_var = initial_check_defn_admit_status(col, v_term, mt, quotedP);
                if (pcase_var.eql((SubLObject)defns.$kw23$ADMITTED)) {
                    rejectedP = (SubLObject)defns.NIL;
                }
                else if (pcase_var.eql((SubLObject)defns.$kw24$REJECTED)) {
                    rejectedP = (SubLObject)defns.T;
                }
                else if (defns.NIL != nec_defn_rejectsP(col, v_term, mt, quotedP, (SubLObject)defns.UNPROVIDED)) {
                    rejectedP = (SubLObject)defns.T;
                }
                else if (defns.NIL == quotedP && defns.NIL != cycl_grammar.fast_quote_term_p(v_term)) {
                    final SubLObject denoted_term = czer_main.unquote_quoted_term(v_term, (SubLObject)defns.UNPROVIDED);
                    if (defns.NIL != denoted_term && defns.NIL != at_defns.quoted_defns_rejectP(col, denoted_term, mt)) {
                        rejectedP = (SubLObject)defns.T;
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)defns.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    at_defns.clear_defn_space();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        }
        finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        if (defns.NIL == rejectedP && defns.$kw24$REJECTED == final_check_defn_admit_status(col, v_term, mt, quotedP)) {
            rejectedP = (SubLObject)defns.T;
        }
        return rejectedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 20350L)
    public static SubLObject reset_new_quoted_defns_admitP_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)defns.$kw13$CALLS, defns.$new_quoted_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)defns.$kw14$TIMES, defns.$new_quoted_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)defns.NIL);
        Hashtables.sethash((SubLObject)defns.$kw15$RESULTS, defns.$new_quoted_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)defns.NIL);
        Hashtables.sethash((SubLObject)defns.$kw16$ARGS, defns.$new_quoted_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)defns.NIL);
        Hashtables.sethash((SubLObject)defns.$kw17$ARG_LIST, defns.$new_quoted_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)defns.$list18);
        Hashtables.sethash((SubLObject)defns.$kw19$FUNCTION, defns.$new_quoted_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)defns.$sym29$NEW_QUOTED_DEFNS_ADMIT_);
        return (SubLObject)defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 20350L)
    public static SubLObject new_quoted_defns_admitP_metered(final SubLObject col, final SubLObject v_term, SubLObject mt) {
        if (mt == defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return defns_admitP_int(col, v_term, mt, (SubLObject)defns.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 20350L)
    public static SubLObject new_quoted_defns_admitP(final SubLObject col, final SubLObject v_term, SubLObject mt) {
        if (mt == defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)defns.NIL;
            SubLObject run_time = (SubLObject)defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = new_quoted_defns_admitP_metered(col, v_term, mt);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)defns.$kw13$CALLS, defns.$new_quoted_defns_admitP_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)defns.$kw13$CALLS, defns.$new_quoted_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED), (SubLObject)defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)defns.$kw14$TIMES, defns.$new_quoted_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)defns.$kw14$TIMES, defns.$new_quoted_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)defns.$kw15$RESULTS, defns.$new_quoted_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)defns.$kw15$RESULTS, defns.$new_quoted_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)defns.$kw16$ARGS, defns.$new_quoted_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(col, v_term, mt), Hashtables.gethash((SubLObject)defns.$kw16$ARGS, defns.$new_quoted_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED)));
            return result;
        }
        return new_quoted_defns_admitP_metered(col, v_term, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 20628L)
    public static SubLObject reset_new_quoted_defns_rejectP_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)defns.$kw13$CALLS, defns.$new_quoted_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)defns.$kw14$TIMES, defns.$new_quoted_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)defns.NIL);
        Hashtables.sethash((SubLObject)defns.$kw15$RESULTS, defns.$new_quoted_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)defns.NIL);
        Hashtables.sethash((SubLObject)defns.$kw16$ARGS, defns.$new_quoted_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)defns.NIL);
        Hashtables.sethash((SubLObject)defns.$kw17$ARG_LIST, defns.$new_quoted_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)defns.$list18);
        Hashtables.sethash((SubLObject)defns.$kw19$FUNCTION, defns.$new_quoted_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)defns.$sym32$NEW_QUOTED_DEFNS_REJECT_);
        return (SubLObject)defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 20628L)
    public static SubLObject new_quoted_defns_rejectP_metered(final SubLObject col, final SubLObject v_term, SubLObject mt) {
        if (mt == defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return defns_rejectP_int(col, v_term, mt, (SubLObject)defns.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 20628L)
    public static SubLObject new_quoted_defns_rejectP(final SubLObject col, final SubLObject v_term, SubLObject mt) {
        if (mt == defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)defns.NIL;
            SubLObject run_time = (SubLObject)defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = new_quoted_defns_rejectP_metered(col, v_term, mt);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)defns.$kw13$CALLS, defns.$new_quoted_defns_rejectP_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)defns.$kw13$CALLS, defns.$new_quoted_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED), (SubLObject)defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)defns.$kw14$TIMES, defns.$new_quoted_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)defns.$kw14$TIMES, defns.$new_quoted_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)defns.$kw15$RESULTS, defns.$new_quoted_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)defns.$kw15$RESULTS, defns.$new_quoted_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)defns.$kw16$ARGS, defns.$new_quoted_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(col, v_term, mt), Hashtables.gethash((SubLObject)defns.$kw16$ARGS, defns.$new_quoted_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED)));
            return result;
        }
        return new_quoted_defns_rejectP_metered(col, v_term, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 20749L)
    public static SubLObject initial_check_defn_admit_status(final SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject admit_status = defining_defns_admitsP(col, v_term, mt, quotedP);
        SubLObject doneP = (SubLObject)defns.NIL;
        final SubLObject pcase_var = admit_status;
        if (!pcase_var.eql((SubLObject)defns.$kw23$ADMITTED)) {
            if (!pcase_var.eql((SubLObject)defns.$kw24$REJECTED)) {
                if (defns.NIL != at_vars.$at_apply_necessary_defnsP$.getDynamicValue(thread)) {
                    final SubLObject _prev_bind_0 = at_vars.$defn_collection$.currentBinding(thread);
                    try {
                        at_vars.$defn_collection$.bind(col, thread);
                        if (defns.NIL == doneP) {
                            SubLObject node_var = col;
                            final SubLObject deck_type = (SubLObject)defns.$kw36$STACK;
                            final SubLObject recur_deck = deck.create_deck(deck_type);
                            final SubLObject _prev_bind_0_$5 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                try {
                                    final SubLObject _prev_bind_0_$6 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                                        final SubLObject tv_var = (SubLObject)defns.NIL;
                                        final SubLObject _prev_bind_0_$7 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$8 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_tv$.bind((defns.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((defns.NIL != tv_var) ? defns.$sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                            if (defns.NIL != tv_var && defns.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && defns.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                final SubLObject pcase_var_$9 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                if (pcase_var_$9.eql((SubLObject)defns.$kw38$ERROR)) {
                                                    sbhl_paranoia.sbhl_error((SubLObject)defns.ONE_INTEGER, (SubLObject)defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)defns.$sym40$SBHL_TRUE_TV_P, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED);
                                                }
                                                else if (pcase_var_$9.eql((SubLObject)defns.$kw41$CERROR)) {
                                                    sbhl_paranoia.sbhl_cerror((SubLObject)defns.ONE_INTEGER, (SubLObject)defns.$str42$continue_anyway, (SubLObject)defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)defns.$sym40$SBHL_TRUE_TV_P, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED);
                                                }
                                                else if (pcase_var_$9.eql((SubLObject)defns.$kw43$WARN)) {
                                                    Errors.warn((SubLObject)defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)defns.$sym40$SBHL_TRUE_TV_P);
                                                }
                                                else {
                                                    Errors.warn((SubLObject)defns.$str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                    Errors.cerror((SubLObject)defns.$str42$continue_anyway, (SubLObject)defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)defns.$sym40$SBHL_TRUE_TV_P);
                                                }
                                            }
                                            final SubLObject _prev_bind_0_$8 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$9 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$12 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(defns.$const45$genls), thread);
                                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(defns.$const45$genls)), thread);
                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(defns.$const45$genls)), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)defns.NIL, thread);
                                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(defns.$const45$genls), thread);
                                                if (defns.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || defns.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED))) {
                                                    final SubLObject _prev_bind_0_$9 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$10 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(defns.$const45$genls)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)defns.NIL, thread);
                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)defns.UNPROVIDED);
                                                        while (defns.NIL != node_var && defns.NIL == doneP) {
                                                            final SubLObject genl = node_var;
                                                            if (!genl.eql(col) && defns.NIL != nec_defn_rejectsP(genl, v_term, mt, quotedP, (SubLObject)defns.T)) {
                                                                doneP = (SubLObject)defns.T;
                                                                admit_status = (SubLObject)defns.$kw24$REJECTED;
                                                            }
                                                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(defns.$const45$genls));
                                                            SubLObject rest;
                                                            SubLObject module_var;
                                                            SubLObject _prev_bind_0_$10;
                                                            SubLObject _prev_bind_1_$11;
                                                            SubLObject node;
                                                            SubLObject d_link;
                                                            SubLObject mt_links;
                                                            SubLObject iteration_state;
                                                            SubLObject mt_$18;
                                                            SubLObject tv_links;
                                                            SubLObject _prev_bind_0_$11;
                                                            SubLObject iteration_state_$20;
                                                            SubLObject tv;
                                                            SubLObject link_nodes;
                                                            SubLObject _prev_bind_0_$12;
                                                            SubLObject sol;
                                                            SubLObject set_contents_var;
                                                            SubLObject basis_object;
                                                            SubLObject state;
                                                            SubLObject node_vars_link_node;
                                                            SubLObject csome_list_var;
                                                            SubLObject node_vars_link_node2;
                                                            SubLObject new_list;
                                                            SubLObject rest_$22;
                                                            SubLObject generating_fn;
                                                            SubLObject _prev_bind_0_$13;
                                                            SubLObject sol2;
                                                            SubLObject link_nodes2;
                                                            SubLObject set_contents_var2;
                                                            SubLObject basis_object2;
                                                            SubLObject state2;
                                                            SubLObject node_vars_link_node3;
                                                            SubLObject csome_list_var2;
                                                            SubLObject node_vars_link_node4;
                                                            for (rest = (SubLObject)defns.NIL, rest = accessible_modules; defns.NIL == doneP && defns.NIL != rest; rest = rest.rest()) {
                                                                module_var = rest.first();
                                                                _prev_bind_0_$10 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                _prev_bind_1_$11 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((defns.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(defns.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                                    node = function_terms.naut_to_nart(node_var);
                                                                    if (defns.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED));
                                                                        if (defns.NIL != d_link) {
                                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED));
                                                                            if (defns.NIL != mt_links) {
                                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); defns.NIL == doneP && defns.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                    thread.resetMultipleValues();
                                                                                    mt_$18 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                    tv_links = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (defns.NIL != mt_relevance_macros.relevant_mtP(mt_$18)) {
                                                                                        _prev_bind_0_$11 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$18, thread);
                                                                                            for (iteration_state_$20 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); defns.NIL == doneP && defns.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$20); iteration_state_$20 = dictionary_contents.do_dictionary_contents_next(iteration_state_$20)) {
                                                                                                thread.resetMultipleValues();
                                                                                                tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$20);
                                                                                                link_nodes = thread.secondMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (defns.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                    _prev_bind_0_$12 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                        sol = link_nodes;
                                                                                                        if (defns.NIL != set.set_p(sol)) {
                                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)defns.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); defns.NIL == doneP && defns.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                                if (defns.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)defns.UNPROVIDED)) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)defns.UNPROVIDED);
                                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else if (sol.isList()) {
                                                                                                            if (defns.NIL == doneP) {
                                                                                                                csome_list_var = sol;
                                                                                                                node_vars_link_node2 = (SubLObject)defns.NIL;
                                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                                while (defns.NIL == doneP && defns.NIL != csome_list_var) {
                                                                                                                    if (defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)defns.UNPROVIDED)) {
                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)defns.UNPROVIDED);
                                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                                    }
                                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else {
                                                                                                            Errors.error((SubLObject)defns.$str46$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                        }
                                                                                                    }
                                                                                                    finally {
                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$12, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$20);
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$11, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                            }
                                                                        }
                                                                        else {
                                                                            sbhl_paranoia.sbhl_error((SubLObject)defns.FIVE_INTEGER, (SubLObject)defns.$str47$attempting_to_bind_direction_link, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED);
                                                                        }
                                                                    }
                                                                    else if (defns.NIL != obsolete.cnat_p(node, (SubLObject)defns.UNPROVIDED)) {
                                                                        new_list = ((defns.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED)));
                                                                        for (rest_$22 = (SubLObject)defns.NIL, rest_$22 = new_list; defns.NIL == doneP && defns.NIL != rest_$22; rest_$22 = rest_$22.rest()) {
                                                                            generating_fn = rest_$22.first();
                                                                            _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                                if (defns.NIL != set.set_p(sol2)) {
                                                                                    set_contents_var2 = set.do_set_internal(sol2);
                                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)defns.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); defns.NIL == doneP && defns.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                        if (defns.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)defns.UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)defns.UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (sol2.isList()) {
                                                                                    if (defns.NIL == doneP) {
                                                                                        csome_list_var2 = sol2;
                                                                                        node_vars_link_node4 = (SubLObject)defns.NIL;
                                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                                        while (defns.NIL == doneP && defns.NIL != csome_list_var2) {
                                                                                            if (defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)defns.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)defns.UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                            }
                                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)defns.$str46$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$13, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$11, thread);
                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$10, thread);
                                                                }
                                                            }
                                                            node_var = deck.deck_pop(recur_deck);
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$13, thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$10, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$9, thread);
                                                    }
                                                }
                                                else {
                                                    sbhl_paranoia.sbhl_warn((SubLObject)defns.TWO_INTEGER, (SubLObject)defns.$str48$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED)), (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED);
                                                }
                                            }
                                            finally {
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$12, thread);
                                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$9, thread);
                                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$8, thread);
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$8, thread);
                                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$7, thread);
                                        }
                                    }
                                    finally {
                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$6, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)defns.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                                    }
                                }
                            }
                            finally {
                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$5, thread);
                            }
                        }
                    }
                    finally {
                        at_vars.$defn_collection$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        }
        return admit_status;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 21788L)
    public static SubLObject final_check_defn_admit_status(final SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject admit_status = (SubLObject)defns.NIL;
        if (defns.NIL != at_vars.$at_additional_defn_checking$.getDynamicValue(thread)) {
            final SubLObject _prev_bind_0 = at_vars.$defn_collection$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sdc.$ignoring_sdcP$.currentBinding(thread);
            try {
                at_vars.$defn_collection$.bind(col, thread);
                sdc.$ignoring_sdcP$.bind(Equality.eq(at_vars.$at_additional_defn_checking$.getDynamicValue(thread), (SubLObject)defns.$kw49$DISJOINT), thread);
                final SubLObject admitting_cols = (defns.NIL != quotedP) ? all_quoted_defn_admits(v_term, mt) : all_defn_admits(v_term, mt);
                if (defns.NIL != disjoint_with.any_disjoint_with_anyP_memoized(admitting_cols, (SubLObject)ConsesLow.list(col), (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED)) {
                    admit_status = (SubLObject)defns.$kw24$REJECTED;
                }
            }
            finally {
                sdc.$ignoring_sdcP$.rebind(_prev_bind_2, thread);
                at_vars.$defn_collection$.rebind(_prev_bind_0, thread);
            }
        }
        return admit_status;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 22474L)
    public static SubLObject defns_walk_admitP(final SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)defns.NIL;
        final SubLObject _prev_bind_0 = defns.$defn_term$.currentBinding(thread);
        final SubLObject _prev_bind_2 = defns.$org_collection$.currentBinding(thread);
        final SubLObject _prev_bind_3 = defns.$failing_suf_defns$.currentBinding(thread);
        try {
            defns.$defn_term$.bind(v_term, thread);
            defns.$org_collection$.bind(col, thread);
            defns.$failing_suf_defns$.bind((SubLObject)defns.NIL, thread);
            if (defns.NIL != quotedP) {
                result = sbhl_search_methods.sbhl_simply_gather_first_among_all_backward_true_nodes_with_prune(sbhl_module_vars.get_sbhl_module(defns.$const45$genls), col, Symbols.symbol_function((SubLObject)defns.$sym50$COL_QUOTED_DEFN_ADMITS_), mt, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED);
            }
            else {
                result = sbhl_search_methods.sbhl_simply_gather_first_among_all_backward_true_nodes_with_prune(sbhl_module_vars.get_sbhl_module(defns.$const45$genls), col, Symbols.symbol_function((SubLObject)defns.$sym51$COL_DEFN_ADMITS_), mt, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED);
            }
            if (defns.NIL == result && defns.NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread) && defns.NIL != wff_vars.$include_suf_defn_violationsP$.getDynamicValue(thread) && defns.NIL != defns.$failing_suf_defns$.getDynamicValue(thread) && defns.NIL != at_utilities.note_at_violationP()) {
                at_routines.note_at_violations(sufficient_defn_violations(col, v_term, defns.$failing_suf_defns$.getDynamicValue(thread), quotedP, mt));
            }
        }
        finally {
            defns.$failing_suf_defns$.rebind(_prev_bind_3, thread);
            defns.$org_collection$.rebind(_prev_bind_2, thread);
            defns.$defn_term$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 23203L)
    public static SubLObject sufficient_defn_violations(final SubLObject col, final SubLObject v_term, final SubLObject v_defns, final SubLObject quotedP, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (defns.NIL == dictionary.dictionary_p(at_routines.$at_applicable_arg_types_with_assertions$.getDynamicValue(thread))) {
            return (SubLObject)ConsesLow.list(at_defns.sufficient_defn_violation_data(col, v_term, v_defns, quotedP, mt));
        }
        final SubLObject constraints = dictionary.dictionary_lookup(at_routines.$at_applicable_arg_types_with_assertions$.getDynamicValue(thread), col, (SubLObject)defns.UNPROVIDED);
        SubLObject violations = (SubLObject)defns.NIL;
        SubLObject cdolist_list_var = constraints;
        SubLObject constraint_details = (SubLObject)defns.NIL;
        constraint_details = cdolist_list_var.first();
        while (defns.NIL != cdolist_list_var) {
            violations = (SubLObject)ConsesLow.cons(sufficient_defn_violation(col, v_term, v_defns, quotedP, mt, constraint_details), violations);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_details = cdolist_list_var.first();
        }
        return violations;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 23698L)
    public static SubLObject sufficient_defn_violation(final SubLObject col, final SubLObject v_term, final SubLObject v_defns, final SubLObject quotedP, final SubLObject mt, final SubLObject constraint_details) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject data = (SubLObject)defns.NIL;
        SubLObject constraint_reln = (SubLObject)defns.NIL;
        SubLObject via = (SubLObject)defns.NIL;
        SubLObject constraint_gaf = (SubLObject)defns.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(constraint_details, constraint_details, (SubLObject)defns.$list52);
        constraint_reln = constraint_details.first();
        SubLObject current = constraint_details.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, constraint_details, (SubLObject)defns.$list52);
        via = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, constraint_details, (SubLObject)defns.$list52);
        constraint_gaf = current.first();
        current = current.rest();
        if (defns.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(constraint_details, (SubLObject)defns.$list52);
            return (SubLObject)defns.NIL;
        }
        if (defns.NIL != constraint_reln && defns.NIL != at_vars.$at_reln$.getDynamicValue(thread) && !constraint_reln.eql(at_vars.$at_reln$.getDynamicValue(thread))) {
            data = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(via, constraint_reln), data);
        }
        if (defns.NIL != at_vars.$include_at_constraint_gafP$.getDynamicValue(thread) && defns.NIL != constraint_gaf) {
            data = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)defns.$kw53$AT_CONSTRAINT_GAF, constraint_gaf), data);
        }
        if (defns.NIL != mt) {
            data = (SubLObject)ConsesLow.cons(mt, data);
        }
        else {
            data = (SubLObject)ConsesLow.cons(mt_relevance_macros.$mt$.getDynamicValue(thread), data);
        }
        if (defns.NIL != quotedP) {
            return (SubLObject)ConsesLow.listS((SubLObject)defns.$kw54$MAL_ARG_WRT_QUOTED_SUF_DEFNS, new SubLObject[] { v_term, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), col, v_defns, data });
        }
        return (SubLObject)ConsesLow.listS((SubLObject)defns.$kw55$MAL_ARG_WRT_SUF_DEFNS, new SubLObject[] { v_term, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), col, v_defns, data });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 24391L)
    public static SubLObject col_defn_admitsP(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return col_defn_admitsP_int(col, defns.$defn_term$.getDynamicValue(thread), mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)defns.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 24492L)
    public static SubLObject col_quoted_defn_admitsP(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return col_defn_admitsP_int(col, defns.$defn_term$.getDynamicValue(thread), mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)defns.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 24594L)
    public static SubLObject col_defn_admitsP_int(final SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (defns.NIL == has_suf_defn_somewhereP(col, quotedP)) {
            return (SubLObject)ConsesLow.list((SubLObject)defns.NIL, (SubLObject)defns.T);
        }
        if (defns.NIL == has_some_defnP(col, quotedP)) {
            return (SubLObject)ConsesLow.list((SubLObject)defns.NIL, (SubLObject)defns.NIL);
        }
        SubLObject result = (SubLObject)defns.NIL;
        SubLObject doneP = (SubLObject)defns.NIL;
        final SubLObject pcase_var = (SubLObject)(defns.$org_collection$.getDynamicValue(thread).eql(col) ? defns.T : defining_defns_admitsP(col, v_term, mt, quotedP));
        if (pcase_var.eql((SubLObject)defns.$kw23$ADMITTED)) {
            result = (SubLObject)defns.T;
            doneP = (SubLObject)defns.T;
        }
        else if (pcase_var.eql((SubLObject)defns.$kw24$REJECTED)) {
            result = (SubLObject)defns.NIL;
            doneP = (SubLObject)defns.T;
        }
        else if (defns.NIL != nec_defn_permitsP(col, v_term, mt, quotedP, (SubLObject)defns.NIL)) {
            if (defns.NIL != suf_defn_admitsP(col, v_term, mt, quotedP)) {
                result = (SubLObject)defns.T;
                doneP = (SubLObject)defns.T;
            }
        }
        else {
            result = (SubLObject)defns.NIL;
            doneP = (SubLObject)defns.T;
        }
        return (SubLObject)ConsesLow.list(result, doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 25328L)
    public static SubLObject defining_defns_admitsP(final SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject iff_defn = iff_defn(col, quotedP);
        SubLObject admit_status = (SubLObject)defns.NIL;
        if (defns.NIL == iff_defn) {
            return (SubLObject)defns.NIL;
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
            if (defns.NIL != assertions_high.valid_assertion(iff_defn, (SubLObject)defns.UNPROVIDED) && defns.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(iff_defn))) {
                final SubLObject defn = el_utilities.cycl_subl_symbol_symbol(assertions_high.gaf_arg2(iff_defn));
                final SubLObject _prev_bind_0_$25 = at_vars.$defn_collection$.currentBinding(thread);
                try {
                    at_vars.$defn_collection$.bind(col, thread);
                    if (defns.NIL != at_defns.viable_defnP(defn, col)) {
                        if (defns.NIL != ((defns.NIL != quotedP) ? at_defns.quoted_defn_admitsP(defn, v_term, col, mt) : at_defns.defn_admitsP(defn, v_term, col, mt))) {
                            admit_status = (SubLObject)defns.$kw23$ADMITTED;
                        }
                        else {
                            admit_status = (SubLObject)defns.$kw24$REJECTED;
                            if (defns.NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                at_routines.note_at_violations(defining_defn_violations(col, v_term, defn, quotedP, mt));
                            }
                        }
                    }
                }
                finally {
                    at_vars.$defn_collection$.rebind(_prev_bind_0_$25, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return admit_status;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 26103L)
    public static SubLObject defining_defn_violations(final SubLObject col, final SubLObject v_term, final SubLObject defn, final SubLObject quotedP, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (defns.NIL == dictionary.dictionary_p(at_routines.$at_applicable_arg_types_with_assertions$.getDynamicValue(thread))) {
            return (SubLObject)ConsesLow.list(at_defns.defining_defn_violation_data(col, v_term, defn, quotedP, mt));
        }
        final SubLObject constraints = dictionary.dictionary_lookup(at_routines.$at_applicable_arg_types_with_assertions$.getDynamicValue(thread), col, (SubLObject)defns.UNPROVIDED);
        SubLObject violations = (SubLObject)defns.NIL;
        SubLObject cdolist_list_var = constraints;
        SubLObject constraint_details = (SubLObject)defns.NIL;
        constraint_details = cdolist_list_var.first();
        while (defns.NIL != cdolist_list_var) {
            violations = (SubLObject)ConsesLow.cons(defining_defn_violation(col, v_term, defn, quotedP, mt, constraint_details), violations);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_details = cdolist_list_var.first();
        }
        return violations;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 26588L)
    public static SubLObject defining_defn_violation(final SubLObject col, final SubLObject v_term, final SubLObject defn, final SubLObject quotedP, final SubLObject mt, final SubLObject constraint_details) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject data = (SubLObject)defns.NIL;
        SubLObject constraint_reln = (SubLObject)defns.NIL;
        SubLObject via = (SubLObject)defns.NIL;
        SubLObject constraint_gaf = (SubLObject)defns.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(constraint_details, constraint_details, (SubLObject)defns.$list52);
        constraint_reln = constraint_details.first();
        SubLObject current = constraint_details.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, constraint_details, (SubLObject)defns.$list52);
        via = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, constraint_details, (SubLObject)defns.$list52);
        constraint_gaf = current.first();
        current = current.rest();
        if (defns.NIL == current) {
            if (defns.NIL != constraint_reln && defns.NIL != at_vars.$at_reln$.getDynamicValue(thread) && !constraint_reln.eql(at_vars.$at_reln$.getDynamicValue(thread))) {
                data = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(via, constraint_reln), data);
            }
            if (defns.NIL != at_vars.$include_at_constraint_gafP$.getDynamicValue(thread) && defns.NIL != constraint_gaf) {
                data = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)defns.$kw53$AT_CONSTRAINT_GAF, constraint_gaf), data);
            }
            if (defns.NIL != mt) {
                data = (SubLObject)ConsesLow.cons(mt, data);
            }
            else {
                data = (SubLObject)ConsesLow.cons(mt_relevance_macros.$mt$.getDynamicValue(thread), data);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(constraint_details, (SubLObject)defns.$list52);
        }
        if (defns.NIL != quotedP) {
            return (SubLObject)ConsesLow.listS((SubLObject)defns.$kw56$MAL_ARG_WRT_QUOTED_IFF_DEFN, new SubLObject[] { v_term, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), col, defn, data });
        }
        return (SubLObject)ConsesLow.listS((SubLObject)defns.$kw57$MAL_ARG_WRT_IFF_DEFN, new SubLObject[] { v_term, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), col, defn, data });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 27264L)
    public static SubLObject suf_defn_admitsP(final SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject suf_defns = suf_defns(col, quotedP);
        SubLObject admittedP = (SubLObject)defns.NIL;
        SubLObject doneP = (SubLObject)defns.NIL;
        if (defns.NIL == suf_defns) {
            return (SubLObject)defns.NIL;
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
            if (defns.NIL == doneP) {
                SubLObject csome_list_var = suf_defns;
                SubLObject suf_defn = (SubLObject)defns.NIL;
                suf_defn = csome_list_var.first();
                while (defns.NIL == doneP && defns.NIL != csome_list_var) {
                    if (defns.NIL != assertions_high.valid_assertion(suf_defn, (SubLObject)defns.UNPROVIDED) && defns.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(suf_defn))) {
                        final SubLObject defn = el_utilities.cycl_subl_symbol_symbol(assertions_high.gaf_arg2(suf_defn));
                        final SubLObject _prev_bind_0_$26 = at_vars.$defn_collection$.currentBinding(thread);
                        try {
                            at_vars.$defn_collection$.bind(col, thread);
                            if (defns.NIL != at_defns.viable_defnP(defn, col)) {
                                if (defns.NIL != ((defns.NIL != quotedP) ? at_defns.quiet_quoted_defn_admitsP(defn, v_term, col, mt) : at_defns.quiet_defn_admitsP(defn, v_term, col, mt))) {
                                    admittedP = (SubLObject)defns.T;
                                    doneP = (SubLObject)defns.T;
                                }
                                else {
                                    admittedP = (SubLObject)defns.NIL;
                                    doneP = (SubLObject)defns.NIL;
                                    if (defns.NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                        final SubLObject item_var = defn;
                                        if (defns.NIL == conses_high.member(item_var, defns.$failing_suf_defns$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)defns.EQL), Symbols.symbol_function((SubLObject)defns.IDENTITY))) {
                                            defns.$failing_suf_defns$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, defns.$failing_suf_defns$.getDynamicValue(thread)), thread);
                                        }
                                    }
                                }
                            }
                        }
                        finally {
                            at_vars.$defn_collection$.rebind(_prev_bind_0_$26, thread);
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    suf_defn = csome_list_var.first();
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return admittedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 28104L)
    public static SubLObject nec_defn_permitsP(final SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP, SubLObject consider_iff_as_necP) {
        if (consider_iff_as_necP == defns.UNPROVIDED) {
            consider_iff_as_necP = (SubLObject)defns.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(defns.NIL == nec_defn_rejectsP(col, v_term, mt, quotedP, consider_iff_as_necP));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 28269L)
    public static SubLObject reset_nec_defn_rejectsP_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)defns.$kw13$CALLS, defns.$nec_defn_rejectsP_meters$.getDynamicValue(thread), (SubLObject)defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)defns.$kw14$TIMES, defns.$nec_defn_rejectsP_meters$.getDynamicValue(thread), (SubLObject)defns.NIL);
        Hashtables.sethash((SubLObject)defns.$kw15$RESULTS, defns.$nec_defn_rejectsP_meters$.getDynamicValue(thread), (SubLObject)defns.NIL);
        Hashtables.sethash((SubLObject)defns.$kw16$ARGS, defns.$nec_defn_rejectsP_meters$.getDynamicValue(thread), (SubLObject)defns.NIL);
        Hashtables.sethash((SubLObject)defns.$kw17$ARG_LIST, defns.$nec_defn_rejectsP_meters$.getDynamicValue(thread), (SubLObject)defns.$list59);
        Hashtables.sethash((SubLObject)defns.$kw19$FUNCTION, defns.$nec_defn_rejectsP_meters$.getDynamicValue(thread), (SubLObject)defns.$sym60$NEC_DEFN_REJECTS_);
        return (SubLObject)defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 28269L)
    public static SubLObject nec_defn_rejectsP_metered(final SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP, SubLObject consider_iff_as_necP) {
        if (consider_iff_as_necP == defns.UNPROVIDED) {
            consider_iff_as_necP = (SubLObject)defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject nec_defns = nec_defns(col, quotedP);
        SubLObject rejectedP = (SubLObject)defns.NIL;
        SubLObject doneP = (SubLObject)defns.NIL;
        if (defns.NIL == nec_defns) {
            if (defns.NIL != consider_iff_as_necP) {
                nec_defns = (SubLObject)ConsesLow.list(iff_defn(col, quotedP));
            }
            if (defns.NIL == nec_defns) {
                return (SubLObject)defns.NIL;
            }
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
            if (defns.NIL == doneP) {
                SubLObject csome_list_var = nec_defns;
                SubLObject nec_defn = (SubLObject)defns.NIL;
                nec_defn = csome_list_var.first();
                while (defns.NIL == doneP && defns.NIL != csome_list_var) {
                    if (defns.NIL != assertions_high.valid_assertion(nec_defn, (SubLObject)defns.UNPROVIDED) && defns.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(nec_defn))) {
                        final SubLObject defn = el_utilities.cycl_subl_symbol_symbol(assertions_high.gaf_arg2(nec_defn));
                        final SubLObject _prev_bind_0_$27 = at_vars.$defn_collection$.currentBinding(thread);
                        try {
                            at_vars.$defn_collection$.bind(col, thread);
                            if (defns.NIL != at_defns.viable_defnP(defn, col)) {
                                if (defns.NIL != ((defns.NIL != quotedP) ? at_defns.quoted_defn_admitsP(defn, v_term, col, mt) : at_defns.defn_admitsP(defn, v_term, col, mt))) {
                                    rejectedP = (SubLObject)defns.NIL;
                                    doneP = (SubLObject)defns.NIL;
                                }
                                else {
                                    rejectedP = (SubLObject)defns.T;
                                    doneP = (SubLObject)defns.T;
                                    if (defns.NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                        at_routines.note_at_violations(necessary_defn_violations(at_vars.$defn_collection$.getDynamicValue(thread), v_term, col, defn, quotedP, mt));
                                    }
                                }
                            }
                        }
                        finally {
                            at_vars.$defn_collection$.rebind(_prev_bind_0_$27, thread);
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    nec_defn = csome_list_var.first();
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return rejectedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 28269L)
    public static SubLObject nec_defn_rejectsP(final SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP, SubLObject consider_iff_as_necP) {
        if (consider_iff_as_necP == defns.UNPROVIDED) {
            consider_iff_as_necP = (SubLObject)defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)defns.NIL;
            SubLObject run_time = (SubLObject)defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = nec_defn_rejectsP_metered(col, v_term, mt, quotedP, consider_iff_as_necP);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)defns.$kw13$CALLS, defns.$nec_defn_rejectsP_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)defns.$kw13$CALLS, defns.$nec_defn_rejectsP_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED), (SubLObject)defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)defns.$kw14$TIMES, defns.$nec_defn_rejectsP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)defns.$kw14$TIMES, defns.$nec_defn_rejectsP_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)defns.$kw15$RESULTS, defns.$nec_defn_rejectsP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)defns.$kw15$RESULTS, defns.$nec_defn_rejectsP_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)defns.$kw16$ARGS, defns.$nec_defn_rejectsP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(col, v_term, mt, quotedP, consider_iff_as_necP), Hashtables.gethash((SubLObject)defns.$kw16$ARGS, defns.$nec_defn_rejectsP_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED)));
            return result;
        }
        return nec_defn_rejectsP_metered(col, v_term, mt, quotedP, consider_iff_as_necP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 29367L)
    public static SubLObject necessary_defn_violations(final SubLObject col, final SubLObject v_term, final SubLObject defn_col, final SubLObject defn, final SubLObject quotedP, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (defns.NIL == dictionary.dictionary_p(at_routines.$at_applicable_arg_types_with_assertions$.getDynamicValue(thread))) {
            return (SubLObject)ConsesLow.list(at_defns.necessary_defn_violation_data(col, v_term, defn_col, defn, quotedP, mt));
        }
        final SubLObject constraints = dictionary.dictionary_lookup(at_routines.$at_applicable_arg_types_with_assertions$.getDynamicValue(thread), col, (SubLObject)defns.UNPROVIDED);
        SubLObject violations = (SubLObject)defns.NIL;
        SubLObject cdolist_list_var = constraints;
        SubLObject constraint_details = (SubLObject)defns.NIL;
        constraint_details = cdolist_list_var.first();
        while (defns.NIL != cdolist_list_var) {
            violations = (SubLObject)ConsesLow.cons(necessary_defn_violation(col, v_term, defn_col, defn, quotedP, mt, constraint_details), violations);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_details = cdolist_list_var.first();
        }
        return violations;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 29882L)
    public static SubLObject necessary_defn_violation(final SubLObject col, final SubLObject v_term, final SubLObject defn_col, final SubLObject defn, final SubLObject quotedP, final SubLObject mt, final SubLObject constraint_details) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject data = (SubLObject)defns.NIL;
        SubLObject constraint_reln = (SubLObject)defns.NIL;
        SubLObject via = (SubLObject)defns.NIL;
        SubLObject constraint_gaf = (SubLObject)defns.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(constraint_details, constraint_details, (SubLObject)defns.$list52);
        constraint_reln = constraint_details.first();
        SubLObject current = constraint_details.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, constraint_details, (SubLObject)defns.$list52);
        via = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, constraint_details, (SubLObject)defns.$list52);
        constraint_gaf = current.first();
        current = current.rest();
        if (defns.NIL == current) {
            if (defns.NIL != constraint_reln && defns.NIL != at_vars.$at_reln$.getDynamicValue(thread) && !constraint_reln.eql(at_vars.$at_reln$.getDynamicValue(thread))) {
                data = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(via, constraint_reln), data);
            }
            if (defns.NIL != at_vars.$include_at_constraint_gafP$.getDynamicValue(thread) && defns.NIL != constraint_gaf) {
                data = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)defns.$kw53$AT_CONSTRAINT_GAF, constraint_gaf), data);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(constraint_details, (SubLObject)defns.$list52);
        }
        if (defns.NIL != mt) {
            data = (SubLObject)ConsesLow.cons(mt, data);
        }
        else {
            data = (SubLObject)ConsesLow.cons(mt_relevance_macros.$mt$.getDynamicValue(thread), data);
        }
        if (defns.NIL != quotedP) {
            return (SubLObject)ConsesLow.listS((SubLObject)defns.$kw62$MAL_ARG_WRT_QUOTED_NEC_DEFN, new SubLObject[] { v_term, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), col, defn_col, defn, data });
        }
        return (SubLObject)ConsesLow.listS((SubLObject)defns.$kw63$MAL_ARG_WRT_NEC_DEFN, new SubLObject[] { v_term, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), col, defn_col, defn, data });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 30578L)
    public static SubLObject new_mts_of_admitting_defns(final SubLObject v_term, final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
        try {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind((SubLObject)defns.NIL, thread);
            result = mts_from_defn_assertions(col, assertions_of_admitting_defns(v_term, col, defns.$const64$EverythingPSC, (SubLObject)defns.NIL, (SubLObject)defns.T));
        }
        finally {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 30971L)
    public static SubLObject mts_of_admitting_quoted_defns(final SubLObject v_term, final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
        try {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind((SubLObject)defns.NIL, thread);
            result = mts_from_defn_assertions(col, assertions_of_admitting_defns(v_term, col, defns.$const64$EverythingPSC, (SubLObject)defns.T, (SubLObject)defns.T));
        }
        finally {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 31313L)
    public static SubLObject new_hl_justify_isa_via_defns(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == defns.UNPROVIDED) {
            mt = (SubLObject)defns.NIL;
        }
        final SubLObject v_defns = assertions_of_admitting_defns(v_term, collection, mt, (SubLObject)defns.NIL, (SubLObject)defns.T);
        SubLObject supports = (SubLObject)defns.NIL;
        SubLObject cdolist_list_var = v_defns;
        SubLObject defn = (SubLObject)defns.NIL;
        defn = cdolist_list_var.first();
        while (defns.NIL != cdolist_list_var) {
            final SubLObject defn_collection = assertions_high.gaf_arg1(defn);
            if (!defn_collection.eql(collection)) {
                supports = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)defns.$kw65$GENLS, (SubLObject)ConsesLow.list(defns.$const45$genls, defn_collection, collection), (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED), supports);
            }
            supports = (SubLObject)ConsesLow.cons(defn, supports);
            cdolist_list_var = cdolist_list_var.rest();
            defn = cdolist_list_var.first();
        }
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 31729L)
    public static SubLObject hl_justify_quoted_isa_via_defns(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == defns.UNPROVIDED) {
            mt = (SubLObject)defns.NIL;
        }
        final SubLObject v_defns = assertions_of_admitting_defns(v_term, collection, mt, (SubLObject)defns.T, (SubLObject)defns.T);
        SubLObject supports = (SubLObject)defns.NIL;
        SubLObject cdolist_list_var = v_defns;
        SubLObject defn = (SubLObject)defns.NIL;
        defn = cdolist_list_var.first();
        while (defns.NIL != cdolist_list_var) {
            final SubLObject defn_collection = assertions_high.gaf_arg1(defn);
            if (!defn_collection.eql(collection)) {
                supports = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)defns.$kw65$GENLS, (SubLObject)ConsesLow.list(defns.$const45$genls, defn_collection, collection), (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED), supports);
            }
            supports = (SubLObject)ConsesLow.cons(defn, supports);
            cdolist_list_var = cdolist_list_var.rest();
            defn = cdolist_list_var.first();
        }
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 32146L)
    public static SubLObject assertions_of_admitting_defns(final SubLObject v_term, SubLObject col, final SubLObject mt, final SubLObject quotedP, final SubLObject gather_only_firstP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (defns.NIL != obsolete.reifiable_natP(col, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED)) {
            col = narts_high.find_nart(col);
        }
        if (defns.NIL == forts.fort_p(col) && defns.NIL == has_suf_defn_somewhereP(col, quotedP)) {
            return (SubLObject)defns.NIL;
        }
        SubLObject v_defns = (SubLObject)defns.NIL;
        SubLObject iff_defn = (SubLObject)defns.NIL;
        SubLObject admit_status = (SubLObject)defns.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_5 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_6 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                thread.resetMultipleValues();
                final SubLObject admit_status_$28 = initial_check_admit_defn(col, v_term, quotedP);
                final SubLObject iff_defn_$29 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                admit_status = admit_status_$28;
                iff_defn = iff_defn_$29;
            }
            finally {
                final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)defns.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    final SubLObject pcase_var = admit_status;
                    if (pcase_var.eql((SubLObject)defns.$kw23$ADMITTED)) {
                        v_defns = (SubLObject)ConsesLow.cons(iff_defn, v_defns);
                        if (defns.NIL == gather_only_firstP) {
                            v_defns = ConsesLow.nconc(v_defns, defns_of_admitting_sufficient_defns(v_term, col, quotedP, gather_only_firstP));
                        }
                    }
                    else if (!pcase_var.eql((SubLObject)defns.$kw24$REJECTED)) {
                        v_defns = defns_of_admitting_sufficient_defns(v_term, col, quotedP, gather_only_firstP);
                    }
                    if (defns.NIL == quotedP && defns.NIL == v_defns && defns.NIL != cycl_grammar.fast_quote_term_p(v_term)) {
                        final SubLObject denoted_term = czer_main.unquote_quoted_term(v_term, (SubLObject)defns.UNPROVIDED);
                        if (defns.NIL != denoted_term) {
                            v_defns = assertions_of_admitting_defns(v_term, col, mt, (SubLObject)defns.T, gather_only_firstP);
                        }
                    }
                    at_defns.clear_defn_space();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                }
            }
        }
        finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_6, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_5, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.flatten(v_defns);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 33206L)
    public static SubLObject mts_from_defn_assertions(final SubLObject col, final SubLObject v_defns) {
        SubLObject mt_sets = (SubLObject)defns.NIL;
        SubLObject cdolist_list_var = v_defns;
        SubLObject defn = (SubLObject)defns.NIL;
        defn = cdolist_list_var.first();
        while (defns.NIL != cdolist_list_var) {
            final SubLObject defn_collection = assertions_high.gaf_arg1(defn);
            final SubLObject mt = assertions_high.assertion_mt(defn);
            SubLObject cdolist_list_var_$31 = genls.min_mts_of_genls_paths(defn_collection, col, (SubLObject)defns.UNPROVIDED);
            SubLObject mt_set = (SubLObject)defns.NIL;
            mt_set = cdolist_list_var_$31.first();
            while (defns.NIL != cdolist_list_var_$31) {
                mt_sets = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(mt, mt_set), mt_sets);
                cdolist_list_var_$31 = cdolist_list_var_$31.rest();
                mt_set = cdolist_list_var_$31.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            defn = cdolist_list_var.first();
        }
        return genl_mts.max_floor_mts_from_mt_sets(mt_sets);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 33535L)
    public static SubLObject initial_check_admit_defn(final SubLObject col, final SubLObject v_term, final SubLObject quotedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject admit_status = defining_defns_admitsP(col, v_term, mt_relevance_macros.$mt$.getDynamicValue(thread), quotedP);
        SubLObject doneP = (SubLObject)defns.NIL;
        SubLObject defn = (SubLObject)defns.NIL;
        final SubLObject pcase_var = admit_status;
        if (pcase_var.eql((SubLObject)defns.$kw23$ADMITTED)) {
            defn = iff_defn(col, quotedP);
        }
        else if (!pcase_var.eql((SubLObject)defns.$kw24$REJECTED)) {
            final SubLObject _prev_bind_0 = at_vars.$defn_collection$.currentBinding(thread);
            try {
                at_vars.$defn_collection$.bind(col, thread);
                final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
                if (defns.NIL == doneP) {
                    SubLObject node_var = col;
                    final SubLObject deck_type = (SubLObject)defns.$kw36$STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$32 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject mt_var = mt;
                            final SubLObject _prev_bind_0_$33 = mt_relevance_macros.$mt$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                final SubLObject tv_var = (SubLObject)defns.NIL;
                                final SubLObject _prev_bind_0_$34 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$35 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind((defns.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((defns.NIL != tv_var) ? defns.$sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                    if (defns.NIL != tv_var && defns.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && defns.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                        final SubLObject pcase_var_$36 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var_$36.eql((SubLObject)defns.$kw38$ERROR)) {
                                            sbhl_paranoia.sbhl_error((SubLObject)defns.ONE_INTEGER, (SubLObject)defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)defns.$sym40$SBHL_TRUE_TV_P, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED);
                                        }
                                        else if (pcase_var_$36.eql((SubLObject)defns.$kw41$CERROR)) {
                                            sbhl_paranoia.sbhl_cerror((SubLObject)defns.ONE_INTEGER, (SubLObject)defns.$str42$continue_anyway, (SubLObject)defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)defns.$sym40$SBHL_TRUE_TV_P, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED);
                                        }
                                        else if (pcase_var_$36.eql((SubLObject)defns.$kw43$WARN)) {
                                            Errors.warn((SubLObject)defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)defns.$sym40$SBHL_TRUE_TV_P);
                                        }
                                        else {
                                            Errors.warn((SubLObject)defns.$str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror((SubLObject)defns.$str42$continue_anyway, (SubLObject)defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)defns.$sym40$SBHL_TRUE_TV_P);
                                        }
                                    }
                                    final SubLObject _prev_bind_0_$35 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$36 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$39 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(defns.$const45$genls), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(defns.$const45$genls)), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(defns.$const45$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)defns.NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(defns.$const45$genls), thread);
                                        if (defns.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || defns.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED))) {
                                            final SubLObject _prev_bind_0_$36 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$37 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$40 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(defns.$const45$genls)), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)defns.NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)defns.UNPROVIDED);
                                                while (defns.NIL != node_var && defns.NIL == doneP) {
                                                    final SubLObject genl = node_var;
                                                    if (!genl.eql(col) && defns.NIL != nec_defn_rejectsP(genl, v_term, mt, quotedP, (SubLObject)defns.T)) {
                                                        doneP = (SubLObject)defns.T;
                                                        admit_status = (SubLObject)defns.$kw24$REJECTED;
                                                    }
                                                    final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(defns.$const45$genls));
                                                    SubLObject rest;
                                                    SubLObject module_var;
                                                    SubLObject _prev_bind_0_$37;
                                                    SubLObject _prev_bind_1_$38;
                                                    SubLObject node;
                                                    SubLObject d_link;
                                                    SubLObject mt_links;
                                                    SubLObject iteration_state;
                                                    SubLObject mt_$45;
                                                    SubLObject tv_links;
                                                    SubLObject _prev_bind_0_$38;
                                                    SubLObject iteration_state_$47;
                                                    SubLObject tv;
                                                    SubLObject link_nodes;
                                                    SubLObject _prev_bind_0_$39;
                                                    SubLObject sol;
                                                    SubLObject set_contents_var;
                                                    SubLObject basis_object;
                                                    SubLObject state;
                                                    SubLObject node_vars_link_node;
                                                    SubLObject csome_list_var;
                                                    SubLObject node_vars_link_node2;
                                                    SubLObject new_list;
                                                    SubLObject rest_$49;
                                                    SubLObject generating_fn;
                                                    SubLObject _prev_bind_0_$40;
                                                    SubLObject sol2;
                                                    SubLObject link_nodes2;
                                                    SubLObject set_contents_var2;
                                                    SubLObject basis_object2;
                                                    SubLObject state2;
                                                    SubLObject node_vars_link_node3;
                                                    SubLObject csome_list_var2;
                                                    SubLObject node_vars_link_node4;
                                                    for (rest = (SubLObject)defns.NIL, rest = accessible_modules; defns.NIL == doneP && defns.NIL != rest; rest = rest.rest()) {
                                                        module_var = rest.first();
                                                        _prev_bind_0_$37 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$38 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((defns.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(defns.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                            node = function_terms.naut_to_nart(node_var);
                                                            if (defns.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED));
                                                                if (defns.NIL != d_link) {
                                                                    mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED));
                                                                    if (defns.NIL != mt_links) {
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); defns.NIL == doneP && defns.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            mt_$45 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (defns.NIL != mt_relevance_macros.relevant_mtP(mt_$45)) {
                                                                                _prev_bind_0_$38 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$45, thread);
                                                                                    for (iteration_state_$47 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); defns.NIL == doneP && defns.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$47); iteration_state_$47 = dictionary_contents.do_dictionary_contents_next(iteration_state_$47)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$47);
                                                                                        link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (defns.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            _prev_bind_0_$39 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                sol = link_nodes;
                                                                                                if (defns.NIL != set.set_p(sol)) {
                                                                                                    set_contents_var = set.do_set_internal(sol);
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)defns.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); defns.NIL == doneP && defns.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if (defns.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)defns.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)defns.UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (sol.isList()) {
                                                                                                    if (defns.NIL == doneP) {
                                                                                                        csome_list_var = sol;
                                                                                                        node_vars_link_node2 = (SubLObject)defns.NIL;
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                        while (defns.NIL == doneP && defns.NIL != csome_list_var) {
                                                                                                            if (defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)defns.UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)defns.UNPROVIDED);
                                                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                            }
                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)defns.$str46$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$39, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$47);
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$38, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                }
                                                                else {
                                                                    sbhl_paranoia.sbhl_error((SubLObject)defns.FIVE_INTEGER, (SubLObject)defns.$str47$attempting_to_bind_direction_link, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED);
                                                                }
                                                            }
                                                            else if (defns.NIL != obsolete.cnat_p(node, (SubLObject)defns.UNPROVIDED)) {
                                                                new_list = ((defns.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED)));
                                                                for (rest_$49 = (SubLObject)defns.NIL, rest_$49 = new_list; defns.NIL == doneP && defns.NIL != rest_$49; rest_$49 = rest_$49.rest()) {
                                                                    generating_fn = rest_$49.first();
                                                                    _prev_bind_0_$40 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                        if (defns.NIL != set.set_p(sol2)) {
                                                                            set_contents_var2 = set.do_set_internal(sol2);
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)defns.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); defns.NIL == doneP && defns.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if (defns.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)defns.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)defns.UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (sol2.isList()) {
                                                                            if (defns.NIL == doneP) {
                                                                                csome_list_var2 = sol2;
                                                                                node_vars_link_node4 = (SubLObject)defns.NIL;
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                                while (defns.NIL == doneP && defns.NIL != csome_list_var2) {
                                                                                    if (defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)defns.UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)defns.UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                    }
                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                }
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)defns.$str46$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$40, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$38, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$37, thread);
                                                        }
                                                    }
                                                    node_var = deck.deck_pop(recur_deck);
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$40, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$37, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$36, thread);
                                            }
                                        }
                                        else {
                                            sbhl_paranoia.sbhl_warn((SubLObject)defns.TWO_INTEGER, (SubLObject)defns.$str48$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED)), (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$39, thread);
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
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$33, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$41 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)defns.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$32, thread);
                    }
                }
            }
            finally {
                at_vars.$defn_collection$.rebind(_prev_bind_0, thread);
            }
        }
        return Values.values(admit_status, defn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 34077L)
    public static SubLObject defns_of_admitting_sufficient_defns(final SubLObject v_term, final SubLObject col, final SubLObject quotedP, final SubLObject gather_only_firstP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_defns = (SubLObject)defns.NIL;
        final SubLObject _prev_bind_0 = defns.$defn_term$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$defn_collection$.currentBinding(thread);
        try {
            defns.$defn_term$.bind(v_term, thread);
            at_vars.$defn_collection$.bind(col, thread);
            final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
            if (defns.NIL != gather_only_firstP) {
                if (defns.NIL != quotedP) {
                    v_defns = sbhl_search_methods.sbhl_simply_gather_first_among_all_backward_true_nodes_with_prune(sbhl_module_vars.get_sbhl_module(defns.$const45$genls), col, Symbols.symbol_function((SubLObject)defns.$sym66$ADMITTING_QUOTED_DEFN_ASSERTION), mt, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED);
                }
                else {
                    v_defns = sbhl_search_methods.sbhl_simply_gather_first_among_all_backward_true_nodes_with_prune(sbhl_module_vars.get_sbhl_module(defns.$const45$genls), col, Symbols.symbol_function((SubLObject)defns.$sym67$ADMITTING_DEFN_ASSERTION), mt, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED);
                }
            }
            else if (defns.NIL != quotedP) {
                v_defns = sbhl_search_methods.sbhl_all_backward_true_nodes_with_prune(sbhl_module_vars.get_sbhl_module(defns.$const45$genls), col, Symbols.symbol_function((SubLObject)defns.$sym68$ADMITTING_QUOTED_DEFN_ASSERTIONS), mt, (SubLObject)defns.UNPROVIDED);
            }
            else {
                v_defns = sbhl_search_methods.sbhl_all_backward_true_nodes_with_prune(sbhl_module_vars.get_sbhl_module(defns.$const45$genls), col, Symbols.symbol_function((SubLObject)defns.$sym69$ADMITTING_DEFN_ASSERTIONS), mt, (SubLObject)defns.UNPROVIDED);
            }
        }
        finally {
            at_vars.$defn_collection$.rebind(_prev_bind_2, thread);
            defns.$defn_term$.rebind(_prev_bind_0, thread);
        }
        return v_defns;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 34925L)
    public static SubLObject admitting_defn_assertions(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return admitting_defn_assertions_int(col, defns.$defn_term$.getDynamicValue(thread), (SubLObject)defns.NIL, (SubLObject)defns.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 35070L)
    public static SubLObject admitting_quoted_defn_assertions(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return admitting_defn_assertions_int(col, defns.$defn_term$.getDynamicValue(thread), (SubLObject)defns.T, (SubLObject)defns.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 35227L)
    public static SubLObject admitting_defn_assertion(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return admitting_defn_assertions_int(col, defns.$defn_term$.getDynamicValue(thread), (SubLObject)defns.NIL, (SubLObject)defns.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 35370L)
    public static SubLObject admitting_quoted_defn_assertion(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return admitting_defn_assertions_int(col, defns.$defn_term$.getDynamicValue(thread), (SubLObject)defns.T, (SubLObject)defns.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 35525L)
    public static SubLObject admitting_defn_assertions_int(final SubLObject col, final SubLObject v_term, final SubLObject quotedP, final SubLObject gather_only_firstP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (defns.NIL == has_suf_defn_somewhereP(col, quotedP)) {
            return (SubLObject)ConsesLow.list((SubLObject)defns.NIL, (SubLObject)defns.T);
        }
        if (defns.NIL == has_some_defnP(col, quotedP)) {
            return (SubLObject)ConsesLow.list((SubLObject)defns.NIL, (SubLObject)defns.NIL);
        }
        final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        SubLObject v_defns = (SubLObject)defns.NIL;
        SubLObject doneP = (SubLObject)defns.NIL;
        final SubLObject pcase_var = (SubLObject)(at_vars.$defn_collection$.getDynamicValue(thread).eql(col) ? defns.T : defining_defns_admitsP(col, v_term, mt, quotedP));
        if (pcase_var.eql((SubLObject)defns.$kw23$ADMITTED)) {
            v_defns = (SubLObject)ConsesLow.cons(iff_defn(col, quotedP), v_defns);
            doneP = gather_only_firstP;
        }
        else if (pcase_var.eql((SubLObject)defns.$kw24$REJECTED)) {
            v_defns = (SubLObject)defns.NIL;
            doneP = (SubLObject)defns.T;
        }
        else if (defns.NIL != nec_defn_permitsP(col, v_term, mt, quotedP, (SubLObject)defns.NIL)) {
            final SubLObject suf_defns = suf_admitting_defns(col, v_term, mt, quotedP);
            if (defns.NIL != suf_defns) {
                v_defns = (SubLObject)ConsesLow.cons(suf_defns, v_defns);
                doneP = gather_only_firstP;
            }
        }
        else {
            v_defns = (SubLObject)defns.NIL;
            doneP = (SubLObject)defns.T;
        }
        return (SubLObject)ConsesLow.list(v_defns, doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 36419L)
    public static SubLObject suf_admitting_defns(final SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject suf_defns = suf_defns(col, quotedP);
        SubLObject admitting_defns = (SubLObject)defns.NIL;
        if (defns.NIL == suf_defns) {
            return (SubLObject)defns.NIL;
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
            SubLObject cdolist_list_var = suf_defns;
            SubLObject suf_defn = (SubLObject)defns.NIL;
            suf_defn = cdolist_list_var.first();
            while (defns.NIL != cdolist_list_var) {
                if (defns.NIL != assertions_high.valid_assertion(suf_defn, (SubLObject)defns.UNPROVIDED) && defns.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(suf_defn))) {
                    final SubLObject defn = el_utilities.cycl_subl_symbol_symbol(assertions_high.gaf_arg2(suf_defn));
                    if (defns.NIL != at_defns.viable_defnP(defn, col) && defns.NIL != ((defns.NIL != quotedP) ? at_defns.quiet_quoted_defn_admitsP(defn, v_term, col, mt) : at_defns.quiet_defn_admitsP(defn, v_term, col, mt))) {
                        admitting_defns = (SubLObject)ConsesLow.cons(suf_defn, admitting_defns);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                suf_defn = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return admitting_defns;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 37602L)
    public static SubLObject min_defn_admits(final SubLObject v_object, SubLObject domain_mt) {
        if (domain_mt == defns.UNPROVIDED) {
            domain_mt = (SubLObject)defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject nearest_isa = (SubLObject)defns.NIL;
        final SubLObject mt_var = domain_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (defns.NIL == nearest_isa) {
                SubLObject csome_list_var = defns.$min_defn_admits_map$.getGlobalValue();
                SubLObject defn_info = (SubLObject)defns.NIL;
                defn_info = csome_list_var.first();
                while (defns.NIL == nearest_isa && defns.NIL != csome_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = defn_info;
                    SubLObject defn = (SubLObject)defns.NIL;
                    SubLObject collection = (SubLObject)defns.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)defns.$list71);
                    defn = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)defns.$list71);
                    collection = current.first();
                    current = current.rest();
                    if (defns.NIL == current) {
                        if (defns.NIL != Functions.funcall(defn, v_object)) {
                            nearest_isa = collection;
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)defns.$list71);
                    }
                    csome_list_var = csome_list_var.rest();
                    defn_info = csome_list_var.first();
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (defns.NIL != nearest_isa) {
            return (SubLObject)ConsesLow.list(nearest_isa);
        }
        return (SubLObject)defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 38039L)
    public static SubLObject all_defn_admits(final SubLObject v_object, SubLObject domain_mt) {
        if (domain_mt == defns.UNPROVIDED) {
            domain_mt = (SubLObject)defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)defns.NIL;
        final SubLObject mt_var = domain_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject nearest_isas = min_defn_admits(v_object, domain_mt);
            result = genls.union_all_genls(nearest_isas, domain_mt, (SubLObject)defns.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return cardinality_estimates.sort_by_generality_estimate(conses_high.copy_list(result), (SubLObject)defns.$kw72$ASCENDING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 38741L)
    public static SubLObject min_quoted_defn_admits(final SubLObject v_object, SubLObject domain_mt) {
        if (domain_mt == defns.UNPROVIDED) {
            domain_mt = (SubLObject)defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject nearest_quoted_isa = (SubLObject)defns.NIL;
        final SubLObject mt_var = domain_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (defns.NIL == nearest_quoted_isa) {
                SubLObject csome_list_var = defns.$min_quoted_defn_admits_map$.getGlobalValue();
                SubLObject quoted_defn_info = (SubLObject)defns.NIL;
                quoted_defn_info = csome_list_var.first();
                while (defns.NIL == nearest_quoted_isa && defns.NIL != csome_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = quoted_defn_info;
                    SubLObject quoted_defn = (SubLObject)defns.NIL;
                    SubLObject collection = (SubLObject)defns.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)defns.$list74);
                    quoted_defn = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)defns.$list74);
                    collection = current.first();
                    current = current.rest();
                    if (defns.NIL == current) {
                        if (defns.NIL != Functions.funcall(quoted_defn, v_object)) {
                            nearest_quoted_isa = collection;
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)defns.$list74);
                    }
                    csome_list_var = csome_list_var.rest();
                    quoted_defn_info = csome_list_var.first();
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (defns.NIL != nearest_quoted_isa) {
            return (SubLObject)ConsesLow.list(nearest_quoted_isa);
        }
        return (SubLObject)defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 39262L)
    public static SubLObject all_quoted_defn_admits(final SubLObject v_object, SubLObject domain_mt) {
        if (domain_mt == defns.UNPROVIDED) {
            domain_mt = (SubLObject)defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)defns.NIL;
        final SubLObject mt_var = domain_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject nearest_quoted_isas = min_quoted_defn_admits(v_object, domain_mt);
            result = genls.union_all_genls(nearest_quoted_isas, domain_mt, (SubLObject)defns.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return cardinality_estimates.sort_by_generality_estimate(conses_high.copy_list(result), (SubLObject)defns.$kw72$ASCENDING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 39618L)
    public static SubLObject min_generalizations(final SubLObject v_object, SubLObject mt) {
        if (mt == defns.UNPROVIDED) {
            mt = (SubLObject)defns.NIL;
        }
        if (defns.NIL != fort_types_interface.isa_collection_in_any_mtP(v_object)) {
            return genls.min_genls(v_object, mt, (SubLObject)defns.UNPROVIDED);
        }
        if (defns.NIL != cycl_grammar.cycl_unrepresented_term_p(v_object)) {
            return min_defn_admits(v_object, mt);
        }
        return isa.min_isa(v_object, mt, (SubLObject)defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 39939L)
    public static SubLObject genericize_term_wrt_types(final SubLObject v_term, SubLObject mt) {
        if (mt == defns.UNPROVIDED) {
            mt = (SubLObject)defns.NIL;
        }
        final SubLObject types = min_generalizations(v_term, mt);
        final SubLObject collectionP = fort_types_interface.isa_collectionP(v_term, mt);
        return genericize_term_types_int(types, collectionP, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 40215L)
    public static SubLObject genericize_constraints_wrt_types(final SubLObject isa_constraints, final SubLObject genls_constraints, SubLObject mt) {
        if (mt == defns.UNPROVIDED) {
            mt = (SubLObject)defns.NIL;
        }
        if (defns.NIL != genls_constraints) {
            return genericize_term_types_int(genls_constraints, (SubLObject)defns.T, mt);
        }
        return genericize_term_types_int(isa_constraints, (SubLObject)defns.NIL, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 40472L)
    public static SubLObject genericize_term_types_int(final SubLObject types, final SubLObject qua_collectionP, SubLObject mt) {
        if (mt == defns.UNPROVIDED) {
            mt = (SubLObject)defns.NIL;
        }
        final SubLObject col = (defns.NIL != list_utilities.singletonP(types)) ? types.first() : ((defns.NIL != list_utilities.doubletonP(types)) ? el_utilities.make_formula(defns.$const75$CollectionIntersection2Fn, types, (SubLObject)defns.UNPROVIDED) : el_utilities.make_unary_formula(defns.$const76$CollectionIntersectionFn, el_utilities.make_el_set(types, (SubLObject)defns.UNPROVIDED)));
        if (defns.NIL != qua_collectionP) {
            return col;
        }
        return el_utilities.make_unary_formula(defns.$const77$SomeFn, col);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 40962L)
    public static SubLObject update_iff_or_suf_defn(final SubLObject assertion, final SubLObject addP, final SubLObject quotedP, final SubLObject type) {
        final SubLObject col = assertions_high.gaf_arg1(assertion);
        update_suf_defn_cache(col, addP, quotedP);
        update_defns(col, assertion, addP, type);
        return col;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 41337L)
    public static SubLObject update_nec_defn(final SubLObject assertion, final SubLObject addP, final SubLObject type) {
        final SubLObject col = assertions_high.gaf_arg1(assertion);
        update_defns(col, assertion, addP, type);
        return col;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 41488L)
    public static SubLObject new_add_iff_defn(SubLObject source, final SubLObject assertion) {
        return update_iff_or_suf_defn(assertion, (SubLObject)defns.T, (SubLObject)defns.NIL, (SubLObject)defns.$kw78$IFF);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 41619L)
    public static SubLObject new_remove_iff_defn(SubLObject source, final SubLObject assertion) {
        return update_iff_or_suf_defn(assertion, (SubLObject)defns.NIL, (SubLObject)defns.NIL, (SubLObject)defns.$kw78$IFF);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 41757L)
    public static SubLObject new_add_suf_defn(SubLObject source, final SubLObject assertion) {
        return update_iff_or_suf_defn(assertion, (SubLObject)defns.T, (SubLObject)defns.NIL, (SubLObject)defns.$kw81$SUF);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 41888L)
    public static SubLObject new_remove_suf_defn(SubLObject source, final SubLObject assertion) {
        return update_iff_or_suf_defn(assertion, (SubLObject)defns.NIL, (SubLObject)defns.NIL, (SubLObject)defns.$kw81$SUF);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 42026L)
    public static SubLObject add_nec_defn(SubLObject source, final SubLObject assertion) {
        return update_nec_defn(assertion, (SubLObject)defns.T, (SubLObject)defns.$kw84$NEC);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 42142L)
    public static SubLObject remove_nec_defn(SubLObject source, final SubLObject assertion) {
        return update_nec_defn(assertion, (SubLObject)defns.NIL, (SubLObject)defns.$kw84$NEC);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 42265L)
    public static SubLObject new_add_iff_quoted_defn(SubLObject source, final SubLObject assertion) {
        return update_iff_or_suf_defn(assertion, (SubLObject)defns.T, (SubLObject)defns.T, (SubLObject)defns.$kw87$QIFF);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 42402L)
    public static SubLObject new_remove_iff_quoted_defn(SubLObject source, final SubLObject assertion) {
        return update_iff_or_suf_defn(assertion, (SubLObject)defns.NIL, (SubLObject)defns.T, (SubLObject)defns.$kw87$QIFF);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 42546L)
    public static SubLObject new_add_suf_quoted_defn(SubLObject source, final SubLObject assertion) {
        return update_iff_or_suf_defn(assertion, (SubLObject)defns.T, (SubLObject)defns.T, (SubLObject)defns.$kw90$QSUF);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 42683L)
    public static SubLObject new_remove_suf_quoted_defn(SubLObject source, final SubLObject assertion) {
        return update_iff_or_suf_defn(assertion, (SubLObject)defns.NIL, (SubLObject)defns.T, (SubLObject)defns.$kw90$QSUF);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 42827L)
    public static SubLObject add_nec_quoted_defn(SubLObject source, final SubLObject assertion) {
        return update_nec_defn(assertion, (SubLObject)defns.T, (SubLObject)defns.$kw93$QNEC);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 42951L)
    public static SubLObject remove_nec_quoted_defn(SubLObject source, final SubLObject assertion) {
        return update_nec_defn(assertion, (SubLObject)defns.NIL, (SubLObject)defns.$kw93$QNEC);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 43082L)
    public static SubLObject handle_added_genl_for_suf_defns_int(final SubLObject spec, final SubLObject genl, final SubLObject quotedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject spec_suf_count = suf_defn_count(spec, quotedP);
        if (spec_suf_count.isInteger() && spec_suf_count.numG((SubLObject)defns.ZERO_INTEGER)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)defns.$sym96$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(defns.$const64$EverythingPSC, thread);
                SubLObject node_var = genl;
                final SubLObject deck_type = (SubLObject)defns.$kw36$STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$52 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)defns.NIL;
                        final SubLObject _prev_bind_0_$53 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$54 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((defns.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((defns.NIL != tv_var) ? defns.$sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (defns.NIL != tv_var && defns.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && defns.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)defns.$kw38$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)defns.ONE_INTEGER, (SubLObject)defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)defns.$sym40$SBHL_TRUE_TV_P, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)defns.$kw41$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)defns.ONE_INTEGER, (SubLObject)defns.$str42$continue_anyway, (SubLObject)defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)defns.$sym40$SBHL_TRUE_TV_P, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)defns.$kw43$WARN)) {
                                    Errors.warn((SubLObject)defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)defns.$sym40$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)defns.$str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)defns.$str42$continue_anyway, (SubLObject)defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)defns.$sym40$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$54 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$55 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(defns.$const45$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(defns.$const45$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(defns.$const45$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)defns.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(defns.$const45$genls), thread);
                                if (defns.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || defns.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(genl, sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$55 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$56 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$59 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(defns.$const45$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)defns.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)defns.UNPROVIDED);
                                        while (defns.NIL != node_var) {
                                            final SubLObject genl_col = node_var;
                                            inc_suf_defn_count(genl_col, quotedP, spec_suf_count);
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(defns.$const45$genls));
                                            SubLObject module_var = (SubLObject)defns.NIL;
                                            module_var = cdolist_list_var.first();
                                            while (defns.NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$56 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$57 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((defns.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(defns.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var);
                                                    if (defns.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED));
                                                        if (defns.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED));
                                                            if (defns.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); defns.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (defns.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$57 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$63;
                                                                            for (iteration_state_$63 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); defns.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$63); iteration_state_$63 = dictionary_contents.do_dictionary_contents_next(iteration_state_$63)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$63);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (defns.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$58 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (defns.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)defns.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); defns.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (defns.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)defns.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)defns.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = (SubLObject)defns.NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (defns.NIL != csome_list_var) {
                                                                                                if (defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)defns.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)defns.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)defns.$str46$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$58, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$63);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$57, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)defns.FIVE_INTEGER, (SubLObject)defns.$str47$attempting_to_bind_direction_link, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (defns.NIL != obsolete.cnat_p(node, (SubLObject)defns.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$65;
                                                        final SubLObject new_list = cdolist_list_var_$65 = ((defns.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)defns.NIL;
                                                        generating_fn = cdolist_list_var_$65.first();
                                                        while (defns.NIL != cdolist_list_var_$65) {
                                                            final SubLObject _prev_bind_0_$59 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (defns.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)defns.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); defns.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (defns.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)defns.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)defns.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var2 = sol2;
                                                                    SubLObject node_vars_link_node4 = (SubLObject)defns.NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (defns.NIL != csome_list_var2) {
                                                                        if (defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)defns.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)defns.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)defns.$str46$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$59, thread);
                                                            }
                                                            cdolist_list_var_$65 = cdolist_list_var_$65.rest();
                                                            generating_fn = cdolist_list_var_$65.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$57, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$56, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$59, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$56, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$55, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)defns.TWO_INTEGER, (SubLObject)defns.$str48$Node__a_does_not_pass_sbhl_type_t, genl, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED)), (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$55, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$54, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$54, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$53, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$60 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)defns.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$60, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$52, thread);
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 43468L)
    public static SubLObject reset_new_handle_added_genl_for_suf_defns_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)defns.$kw13$CALLS, defns.$new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)defns.$kw14$TIMES, defns.$new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)defns.NIL);
        Hashtables.sethash((SubLObject)defns.$kw15$RESULTS, defns.$new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)defns.NIL);
        Hashtables.sethash((SubLObject)defns.$kw16$ARGS, defns.$new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)defns.NIL);
        Hashtables.sethash((SubLObject)defns.$kw17$ARG_LIST, defns.$new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)defns.$list98);
        Hashtables.sethash((SubLObject)defns.$kw19$FUNCTION, defns.$new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)defns.$sym99$NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS);
        return (SubLObject)defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 43468L)
    public static SubLObject new_handle_added_genl_for_suf_defns_metered(final SubLObject spec, final SubLObject genl) {
        return handle_added_genl_for_suf_defns_int(spec, genl, (SubLObject)defns.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 43468L)
    public static SubLObject new_handle_added_genl_for_suf_defns(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)defns.NIL;
            SubLObject run_time = (SubLObject)defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = new_handle_added_genl_for_suf_defns_metered(spec, genl);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)defns.$kw13$CALLS, defns.$new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)defns.$kw13$CALLS, defns.$new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED), (SubLObject)defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)defns.$kw14$TIMES, defns.$new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)defns.$kw14$TIMES, defns.$new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)defns.$kw15$RESULTS, defns.$new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)defns.$kw15$RESULTS, defns.$new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)defns.$kw16$ARGS, defns.$new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(spec, genl), Hashtables.gethash((SubLObject)defns.$kw16$ARGS, defns.$new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED)));
            return result;
        }
        return new_handle_added_genl_for_suf_defns_metered(spec, genl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 43638L)
    public static SubLObject reset_new_handle_added_genl_for_suf_quoted_defns_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)defns.$kw13$CALLS, defns.$new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)defns.$kw14$TIMES, defns.$new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)defns.NIL);
        Hashtables.sethash((SubLObject)defns.$kw15$RESULTS, defns.$new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)defns.NIL);
        Hashtables.sethash((SubLObject)defns.$kw16$ARGS, defns.$new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)defns.NIL);
        Hashtables.sethash((SubLObject)defns.$kw17$ARG_LIST, defns.$new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)defns.$list98);
        Hashtables.sethash((SubLObject)defns.$kw19$FUNCTION, defns.$new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)defns.$sym102$NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS);
        return (SubLObject)defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 43638L)
    public static SubLObject new_handle_added_genl_for_suf_quoted_defns_metered(final SubLObject spec, final SubLObject genl) {
        return handle_added_genl_for_suf_defns_int(spec, genl, (SubLObject)defns.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 43638L)
    public static SubLObject new_handle_added_genl_for_suf_quoted_defns(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)defns.NIL;
            SubLObject run_time = (SubLObject)defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = new_handle_added_genl_for_suf_quoted_defns_metered(spec, genl);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)defns.$kw13$CALLS, defns.$new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)defns.$kw13$CALLS, defns.$new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED), (SubLObject)defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)defns.$kw14$TIMES, defns.$new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)defns.$kw14$TIMES, defns.$new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)defns.$kw15$RESULTS, defns.$new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)defns.$kw15$RESULTS, defns.$new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)defns.$kw16$ARGS, defns.$new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(spec, genl), Hashtables.gethash((SubLObject)defns.$kw16$ARGS, defns.$new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED)));
            return result;
        }
        return new_handle_added_genl_for_suf_quoted_defns_metered(spec, genl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 43813L)
    public static SubLObject handle_removed_genl_for_suf_defns_int(final SubLObject spec, final SubLObject genl, final SubLObject quotedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)defns.$sym96$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(defns.$const64$EverythingPSC, thread);
            if (defns.NIL == genls.genlP(spec, genl, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED)) {
                final SubLObject spec_suf_count = suf_defn_count(spec, quotedP);
                if (spec_suf_count.isInteger() && spec_suf_count.numG((SubLObject)defns.ZERO_INTEGER)) {
                    SubLObject node_var = genl;
                    final SubLObject deck_type = (SubLObject)defns.$kw36$STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$68 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = (SubLObject)defns.NIL;
                            final SubLObject _prev_bind_0_$69 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$70 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind((defns.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((defns.NIL != tv_var) ? defns.$sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                if (defns.NIL != tv_var && defns.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && defns.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql((SubLObject)defns.$kw38$ERROR)) {
                                        sbhl_paranoia.sbhl_error((SubLObject)defns.ONE_INTEGER, (SubLObject)defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)defns.$sym40$SBHL_TRUE_TV_P, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)defns.$kw41$CERROR)) {
                                        sbhl_paranoia.sbhl_cerror((SubLObject)defns.ONE_INTEGER, (SubLObject)defns.$str42$continue_anyway, (SubLObject)defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)defns.$sym40$SBHL_TRUE_TV_P, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)defns.$kw43$WARN)) {
                                        Errors.warn((SubLObject)defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)defns.$sym40$SBHL_TRUE_TV_P);
                                    }
                                    else {
                                        Errors.warn((SubLObject)defns.$str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror((SubLObject)defns.$str42$continue_anyway, (SubLObject)defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)defns.$sym40$SBHL_TRUE_TV_P);
                                    }
                                }
                                final SubLObject _prev_bind_0_$70 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$71 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(defns.$const45$genls), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(defns.$const45$genls)), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(defns.$const45$genls)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)defns.NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(defns.$const45$genls), thread);
                                    if (defns.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || defns.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(genl, sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED))) {
                                        final SubLObject _prev_bind_0_$71 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$72 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$75 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(defns.$const45$genls)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)defns.NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)defns.UNPROVIDED);
                                            while (defns.NIL != node_var) {
                                                final SubLObject genl_col = node_var;
                                                dec_suf_defn_count(genl_col, quotedP, spec_suf_count);
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(defns.$const45$genls));
                                                SubLObject module_var = (SubLObject)defns.NIL;
                                                module_var = cdolist_list_var.first();
                                                while (defns.NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$72 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$73 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((defns.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(defns.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(node_var);
                                                        if (defns.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED));
                                                            if (defns.NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED));
                                                                if (defns.NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); defns.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (defns.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$73 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$79;
                                                                                for (iteration_state_$79 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); defns.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$79); iteration_state_$79 = dictionary_contents.do_dictionary_contents_next(iteration_state_$79)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$79);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (defns.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$74 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (defns.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)defns.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); defns.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (defns.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)defns.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)defns.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject node_vars_link_node2 = (SubLObject)defns.NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (defns.NIL != csome_list_var) {
                                                                                                    if (defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)defns.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)defns.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)defns.$str46$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$74, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$79);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$73, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)defns.FIVE_INTEGER, (SubLObject)defns.$str47$attempting_to_bind_direction_link, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (defns.NIL != obsolete.cnat_p(node, (SubLObject)defns.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$81;
                                                            final SubLObject new_list = cdolist_list_var_$81 = ((defns.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED)));
                                                            SubLObject generating_fn = (SubLObject)defns.NIL;
                                                            generating_fn = cdolist_list_var_$81.first();
                                                            while (defns.NIL != cdolist_list_var_$81) {
                                                                final SubLObject _prev_bind_0_$75 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                    if (defns.NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)defns.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); defns.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (defns.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)defns.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)defns.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        SubLObject csome_list_var2 = sol2;
                                                                        SubLObject node_vars_link_node4 = (SubLObject)defns.NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (defns.NIL != csome_list_var2) {
                                                                            if (defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)defns.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)defns.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)defns.$str46$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$75, thread);
                                                                }
                                                                cdolist_list_var_$81 = cdolist_list_var_$81.rest();
                                                                generating_fn = cdolist_list_var_$81.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$73, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$72, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                }
                                                node_var = deck.deck_pop(recur_deck);
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$75, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$72, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$71, thread);
                                        }
                                    }
                                    else {
                                        sbhl_paranoia.sbhl_warn((SubLObject)defns.TWO_INTEGER, (SubLObject)defns.$str48$Node__a_does_not_pass_sbhl_type_t, genl, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED)), (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED);
                                    }
                                }
                                finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$71, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$70, thread);
                                }
                            }
                            finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$70, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$69, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$76 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)defns.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$76, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$68, thread);
                    }
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 44238L)
    public static SubLObject reset_new_handle_removed_genl_for_suf_defns_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)defns.$kw13$CALLS, defns.$new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)defns.$kw14$TIMES, defns.$new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)defns.NIL);
        Hashtables.sethash((SubLObject)defns.$kw15$RESULTS, defns.$new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)defns.NIL);
        Hashtables.sethash((SubLObject)defns.$kw16$ARGS, defns.$new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)defns.NIL);
        Hashtables.sethash((SubLObject)defns.$kw17$ARG_LIST, defns.$new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)defns.$list98);
        Hashtables.sethash((SubLObject)defns.$kw19$FUNCTION, defns.$new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)defns.$sym105$NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS);
        return (SubLObject)defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 44238L)
    public static SubLObject new_handle_removed_genl_for_suf_defns_metered(final SubLObject spec, final SubLObject genl) {
        return handle_removed_genl_for_suf_defns_int(spec, genl, (SubLObject)defns.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 44238L)
    public static SubLObject new_handle_removed_genl_for_suf_defns(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)defns.NIL;
            SubLObject run_time = (SubLObject)defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = new_handle_removed_genl_for_suf_defns_metered(spec, genl);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)defns.$kw13$CALLS, defns.$new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)defns.$kw13$CALLS, defns.$new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED), (SubLObject)defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)defns.$kw14$TIMES, defns.$new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)defns.$kw14$TIMES, defns.$new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)defns.$kw15$RESULTS, defns.$new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)defns.$kw15$RESULTS, defns.$new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)defns.$kw16$ARGS, defns.$new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(spec, genl), Hashtables.gethash((SubLObject)defns.$kw16$ARGS, defns.$new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED)));
            return result;
        }
        return new_handle_removed_genl_for_suf_defns_metered(spec, genl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 44412L)
    public static SubLObject reset_new_handle_removed_genl_for_suf_quoted_defns_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)defns.$kw13$CALLS, defns.$new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)defns.$kw14$TIMES, defns.$new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)defns.NIL);
        Hashtables.sethash((SubLObject)defns.$kw15$RESULTS, defns.$new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)defns.NIL);
        Hashtables.sethash((SubLObject)defns.$kw16$ARGS, defns.$new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)defns.NIL);
        Hashtables.sethash((SubLObject)defns.$kw17$ARG_LIST, defns.$new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)defns.$list98);
        Hashtables.sethash((SubLObject)defns.$kw19$FUNCTION, defns.$new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)defns.$sym108$NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS);
        return (SubLObject)defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 44412L)
    public static SubLObject new_handle_removed_genl_for_suf_quoted_defns_metered(final SubLObject spec, final SubLObject genl) {
        return handle_removed_genl_for_suf_defns_int(spec, genl, (SubLObject)defns.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 44412L)
    public static SubLObject new_handle_removed_genl_for_suf_quoted_defns(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)defns.NIL;
            SubLObject run_time = (SubLObject)defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = new_handle_removed_genl_for_suf_quoted_defns_metered(spec, genl);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)defns.$kw13$CALLS, defns.$new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)defns.$kw13$CALLS, defns.$new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED), (SubLObject)defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)defns.$kw14$TIMES, defns.$new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)defns.$kw14$TIMES, defns.$new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)defns.$kw15$RESULTS, defns.$new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)defns.$kw15$RESULTS, defns.$new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)defns.$kw16$ARGS, defns.$new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(spec, genl), Hashtables.gethash((SubLObject)defns.$kw16$ARGS, defns.$new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)defns.UNPROVIDED)));
            return result;
        }
        return new_handle_removed_genl_for_suf_quoted_defns_metered(spec, genl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 44591L)
    public static SubLObject clear_defns() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (defns.NIL == at_defns.$use_new_defns_functionsP$.getDynamicValue(thread)) {
            return (SubLObject)defns.NIL;
        }
        if (defns.NIL != defns_cache_definedP(defns.$has_suf_defn_cache_index$.getGlobalValue())) {
            defns_cache_clrhash(defns.$has_suf_defn_cache_index$.getGlobalValue());
        }
        if (defns.NIL != defns_cache_definedP(defns.$iff_defns_index$.getGlobalValue())) {
            defns_cache_clrhash(defns.$iff_defns_index$.getGlobalValue());
        }
        if (defns.NIL != defns_cache_definedP(defns.$suf_defns_index$.getGlobalValue())) {
            defns_cache_clrhash(defns.$suf_defns_index$.getGlobalValue());
        }
        if (defns.NIL != defns_cache_definedP(defns.$nec_defns_index$.getGlobalValue())) {
            defns_cache_clrhash(defns.$nec_defns_index$.getGlobalValue());
        }
        if (defns.NIL != defns_cache_definedP(defns.$has_quoted_suf_defn_cache_index$.getGlobalValue())) {
            defns_cache_clrhash(defns.$has_quoted_suf_defn_cache_index$.getGlobalValue());
        }
        if (defns.NIL != defns_cache_definedP(defns.$quoted_iff_defns_index$.getGlobalValue())) {
            defns_cache_clrhash(defns.$quoted_iff_defns_index$.getGlobalValue());
        }
        if (defns.NIL != defns_cache_definedP(defns.$quoted_suf_defns_index$.getGlobalValue())) {
            defns_cache_clrhash(defns.$quoted_suf_defns_index$.getGlobalValue());
        }
        if (defns.NIL != defns_cache_definedP(defns.$quoted_nec_defns_index$.getGlobalValue())) {
            defns_cache_clrhash(defns.$quoted_nec_defns_index$.getGlobalValue());
        }
        return (SubLObject)defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 45543L)
    public static SubLObject initialize_defns_cache() {
        if (defns.NIL == defns_cache_definedP(defns.$has_suf_defn_cache_index$.getGlobalValue())) {
            defns_cache_make_hash_table(defns.$has_suf_defn_cache_index$.getGlobalValue(), (SubLObject)defns.$int110$400);
        }
        if (defns.NIL == defns_cache_definedP(defns.$iff_defns_index$.getGlobalValue())) {
            defns_cache_make_hash_table(defns.$iff_defns_index$.getGlobalValue(), (SubLObject)defns.$int111$100);
        }
        if (defns.NIL == defns_cache_definedP(defns.$suf_defns_index$.getGlobalValue())) {
            defns_cache_make_hash_table(defns.$suf_defns_index$.getGlobalValue(), (SubLObject)defns.$int111$100);
        }
        if (defns.NIL == defns_cache_definedP(defns.$nec_defns_index$.getGlobalValue())) {
            defns_cache_make_hash_table(defns.$nec_defns_index$.getGlobalValue(), (SubLObject)defns.$int111$100);
        }
        if (defns.NIL == defns_cache_definedP(defns.$has_quoted_suf_defn_cache_index$.getGlobalValue())) {
            defns_cache_make_hash_table(defns.$has_quoted_suf_defn_cache_index$.getGlobalValue(), (SubLObject)defns.$int110$400);
        }
        if (defns.NIL == defns_cache_definedP(defns.$quoted_iff_defns_index$.getGlobalValue())) {
            defns_cache_make_hash_table(defns.$quoted_iff_defns_index$.getGlobalValue(), (SubLObject)defns.$int111$100);
        }
        if (defns.NIL == defns_cache_definedP(defns.$quoted_suf_defns_index$.getGlobalValue())) {
            defns_cache_make_hash_table(defns.$quoted_suf_defns_index$.getGlobalValue(), (SubLObject)defns.$int111$100);
        }
        if (defns.NIL == defns_cache_definedP(defns.$quoted_nec_defns_index$.getGlobalValue())) {
            defns_cache_make_hash_table(defns.$quoted_nec_defns_index$.getGlobalValue(), (SubLObject)defns.$int111$100);
        }
        return (SubLObject)defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 46565L)
    public static SubLObject initialize_defns() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (defns.NIL == at_defns.$use_new_defns_functionsP$.getDynamicValue(thread)) {
            return (SubLObject)defns.NIL;
        }
        final SubLObject str = (SubLObject)defns.$str112$Initializing_defns___;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
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
            utilities_macros.$progress_notification_count$.bind((SubLObject)defns.ZERO_INTEGER, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)defns.ZERO_INTEGER, thread);
            utilities_macros.$progress_count$.bind((SubLObject)defns.ZERO_INTEGER, thread);
            utilities_macros.$is_noting_progressP$.bind((SubLObject)defns.T, thread);
            utilities_macros.$silent_progressP$.bind((SubLObject)((defns.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : defns.T), thread);
            utilities_macros.noting_progress_preamble(str);
            initialize_defns_cache();
            clear_defns();
            final SubLObject _prev_bind_0_$84 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$85 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)defns.$sym96$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(defns.$const64$EverythingPSC, thread);
                SubLObject pred_var = defns.$const113$defnIff;
                if (defns.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str_$86 = (SubLObject)defns.NIL;
                    final SubLObject _prev_bind_0_$85 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$86 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$89 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_3_$90 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_4_$91 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_5_$92 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_6_$93 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_7_$94 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)defns.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)defns.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)defns.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)defns.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((defns.NIL != str_$86) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : defns.T), thread);
                        utilities_macros.noting_progress_preamble(str_$86);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = (SubLObject)defns.NIL;
                        final SubLObject token_var = (SubLObject)defns.NIL;
                        while (defns.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (defns.NIL != valid) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator = (SubLObject)defns.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)defns.$kw114$GAF, (SubLObject)defns.$kw115$TRUE, (SubLObject)defns.NIL);
                                    SubLObject done_var_$95 = (SubLObject)defns.NIL;
                                    final SubLObject token_var_$96 = (SubLObject)defns.NIL;
                                    while (defns.NIL == done_var_$95) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$96);
                                        final SubLObject valid_$97 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$96.eql(assertion));
                                        if (defns.NIL != valid_$97) {
                                            at_defns.add_iff_defn(assertion, assertion);
                                        }
                                        done_var_$95 = (SubLObject)SubLObjectFactory.makeBoolean(defns.NIL == valid_$97);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$86 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)defns.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (defns.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$86, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(defns.NIL == valid);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_7_$94, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_6_$93, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_5_$92, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_4_$91, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_3_$90, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$89, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$86, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$85, thread);
                    }
                }
                pred_var = defns.$const116$defnSufficient;
                if (defns.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str_$87 = (SubLObject)defns.NIL;
                    final SubLObject _prev_bind_0_$87 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$87 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$90 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_3_$91 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_4_$92 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_5_$93 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_6_$94 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_7_$95 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)defns.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)defns.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)defns.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)defns.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((defns.NIL != str_$87) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : defns.T), thread);
                        utilities_macros.noting_progress_preamble(str_$87);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = (SubLObject)defns.NIL;
                        final SubLObject token_var = (SubLObject)defns.NIL;
                        while (defns.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (defns.NIL != valid) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator = (SubLObject)defns.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)defns.$kw114$GAF, (SubLObject)defns.$kw115$TRUE, (SubLObject)defns.NIL);
                                    SubLObject done_var_$96 = (SubLObject)defns.NIL;
                                    final SubLObject token_var_$97 = (SubLObject)defns.NIL;
                                    while (defns.NIL == done_var_$96) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$97);
                                        final SubLObject valid_$98 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$97.eql(assertion));
                                        if (defns.NIL != valid_$98) {
                                            at_defns.add_suf_defn(assertion, assertion);
                                        }
                                        done_var_$96 = (SubLObject)SubLObjectFactory.makeBoolean(defns.NIL == valid_$98);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$88 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)defns.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (defns.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$88, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(defns.NIL == valid);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_7_$95, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_6_$94, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_5_$93, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_4_$92, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_3_$91, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$90, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$87, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$87, thread);
                    }
                }
                pred_var = defns.$const117$defnNecessary;
                if (defns.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str_$88 = (SubLObject)defns.NIL;
                    final SubLObject _prev_bind_0_$89 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$88 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$91 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_3_$92 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_4_$93 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_5_$94 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_6_$95 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_7_$96 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)defns.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)defns.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)defns.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)defns.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((defns.NIL != str_$88) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : defns.T), thread);
                        utilities_macros.noting_progress_preamble(str_$88);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = (SubLObject)defns.NIL;
                        final SubLObject token_var = (SubLObject)defns.NIL;
                        while (defns.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (defns.NIL != valid) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator = (SubLObject)defns.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)defns.$kw114$GAF, (SubLObject)defns.$kw115$TRUE, (SubLObject)defns.NIL);
                                    SubLObject done_var_$97 = (SubLObject)defns.NIL;
                                    final SubLObject token_var_$98 = (SubLObject)defns.NIL;
                                    while (defns.NIL == done_var_$97) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$98);
                                        final SubLObject valid_$99 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$98.eql(assertion));
                                        if (defns.NIL != valid_$99) {
                                            add_nec_defn(assertion, assertion);
                                        }
                                        done_var_$97 = (SubLObject)SubLObjectFactory.makeBoolean(defns.NIL == valid_$99);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$90 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)defns.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        if (defns.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$90, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(defns.NIL == valid);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_7_$96, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_6_$95, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_5_$94, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_4_$93, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_3_$92, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$91, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$88, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$89, thread);
                    }
                }
                pred_var = defns.$const118$quotedDefnIff;
                if (defns.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str_$89 = (SubLObject)defns.NIL;
                    final SubLObject _prev_bind_0_$91 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$89 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$92 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_3_$93 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_4_$94 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_5_$95 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_6_$96 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_7_$97 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)defns.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)defns.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)defns.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)defns.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((defns.NIL != str_$89) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : defns.T), thread);
                        utilities_macros.noting_progress_preamble(str_$89);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = (SubLObject)defns.NIL;
                        final SubLObject token_var = (SubLObject)defns.NIL;
                        while (defns.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (defns.NIL != valid) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator = (SubLObject)defns.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)defns.$kw114$GAF, (SubLObject)defns.$kw115$TRUE, (SubLObject)defns.NIL);
                                    SubLObject done_var_$98 = (SubLObject)defns.NIL;
                                    final SubLObject token_var_$99 = (SubLObject)defns.NIL;
                                    while (defns.NIL == done_var_$98) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$99);
                                        final SubLObject valid_$100 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$99.eql(assertion));
                                        if (defns.NIL != valid_$100) {
                                            at_defns.add_iff_quoted_defn(assertion, assertion);
                                        }
                                        done_var_$98 = (SubLObject)SubLObjectFactory.makeBoolean(defns.NIL == valid_$100);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$92 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)defns.T, thread);
                                        final SubLObject _values4 = Values.getValuesAsVector();
                                        if (defns.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values4);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$92, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(defns.NIL == valid);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_7_$97, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_6_$96, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_5_$95, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_4_$94, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_3_$93, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$92, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$89, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$91, thread);
                    }
                }
                pred_var = defns.$const119$quotedDefnSufficient;
                if (defns.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str_$90 = (SubLObject)defns.NIL;
                    final SubLObject _prev_bind_0_$93 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$90 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$93 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_3_$94 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_4_$95 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_5_$96 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_6_$97 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_7_$98 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)defns.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)defns.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)defns.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)defns.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((defns.NIL != str_$90) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : defns.T), thread);
                        utilities_macros.noting_progress_preamble(str_$90);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = (SubLObject)defns.NIL;
                        final SubLObject token_var = (SubLObject)defns.NIL;
                        while (defns.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (defns.NIL != valid) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator = (SubLObject)defns.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)defns.$kw114$GAF, (SubLObject)defns.$kw115$TRUE, (SubLObject)defns.NIL);
                                    SubLObject done_var_$99 = (SubLObject)defns.NIL;
                                    final SubLObject token_var_$100 = (SubLObject)defns.NIL;
                                    while (defns.NIL == done_var_$99) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$100);
                                        final SubLObject valid_$101 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$100.eql(assertion));
                                        if (defns.NIL != valid_$101) {
                                            at_defns.add_suf_quoted_defn(assertion, assertion);
                                        }
                                        done_var_$99 = (SubLObject)SubLObjectFactory.makeBoolean(defns.NIL == valid_$101);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$94 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)defns.T, thread);
                                        final SubLObject _values5 = Values.getValuesAsVector();
                                        if (defns.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values5);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$94, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(defns.NIL == valid);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_7_$98, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_6_$97, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_5_$96, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_4_$95, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_3_$94, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$93, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$90, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$93, thread);
                    }
                }
                pred_var = defns.$const120$quotedDefnNecessary;
                if (defns.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str_$91 = (SubLObject)defns.NIL;
                    final SubLObject _prev_bind_0_$95 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$91 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$94 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_3_$95 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_4_$96 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_5_$97 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_6_$98 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_7_$99 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)defns.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)defns.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)defns.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)defns.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((defns.NIL != str_$91) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : defns.T), thread);
                        utilities_macros.noting_progress_preamble(str_$91);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = (SubLObject)defns.NIL;
                        final SubLObject token_var = (SubLObject)defns.NIL;
                        while (defns.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (defns.NIL != valid) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator = (SubLObject)defns.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)defns.$kw114$GAF, (SubLObject)defns.$kw115$TRUE, (SubLObject)defns.NIL);
                                    SubLObject done_var_$100 = (SubLObject)defns.NIL;
                                    final SubLObject token_var_$101 = (SubLObject)defns.NIL;
                                    while (defns.NIL == done_var_$100) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$101);
                                        final SubLObject valid_$102 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$101.eql(assertion));
                                        if (defns.NIL != valid_$102) {
                                            add_nec_quoted_defn(assertion, assertion);
                                        }
                                        done_var_$100 = (SubLObject)SubLObjectFactory.makeBoolean(defns.NIL == valid_$102);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$96 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)defns.T, thread);
                                        final SubLObject _values6 = Values.getValuesAsVector();
                                        if (defns.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values6);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$96, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(defns.NIL == valid);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_7_$99, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_6_$98, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_5_$97, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_4_$96, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_3_$95, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$94, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$91, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$95, thread);
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$85, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$84, thread);
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
            utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 47524L)
    public static SubLObject inc_suf_defn_count(final SubLObject col, final SubLObject quotedP, SubLObject count) {
        if (count == defns.UNPROVIDED) {
            count = (SubLObject)defns.ONE_INTEGER;
        }
        SubLObject suf_defn_count = suf_defn_count(col, quotedP);
        if (defns.NIL == suf_defn_count) {
            suf_defn_count = (SubLObject)defns.ZERO_INTEGER;
        }
        suf_defn_count = Numbers.add(suf_defn_count, count);
        set_suf_defn_count(col, suf_defn_count, quotedP);
        return suf_defn_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 47848L)
    public static SubLObject dec_suf_defn_count(final SubLObject col, final SubLObject quotedP, SubLObject count) {
        if (count == defns.UNPROVIDED) {
            count = (SubLObject)defns.ONE_INTEGER;
        }
        SubLObject suf_defn_count = suf_defn_count(col, quotedP);
        if (!suf_defn_count.isInteger()) {
            suf_defn_count = (SubLObject)defns.ZERO_INTEGER;
        }
        suf_defn_count = Numbers.subtract(suf_defn_count, count);
        if (suf_defn_count.numG((SubLObject)defns.ZERO_INTEGER)) {
            set_suf_defn_count(col, suf_defn_count, quotedP);
        }
        else {
            rem_suf_defn_count(col, quotedP);
        }
        return suf_defn_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 48247L)
    public static SubLObject update_suf_defn_cache(final SubLObject col, final SubLObject incP, final SubLObject quotedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)defns.$sym96$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(defns.$const64$EverythingPSC, thread);
            if (defns.NIL != incP) {
                SubLObject node_var = col;
                final SubLObject deck_type = (SubLObject)defns.$kw36$STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$164 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)defns.NIL;
                        final SubLObject _prev_bind_0_$165 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$166 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((defns.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((defns.NIL != tv_var) ? defns.$sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (defns.NIL != tv_var && defns.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && defns.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)defns.$kw38$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)defns.ONE_INTEGER, (SubLObject)defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)defns.$sym40$SBHL_TRUE_TV_P, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)defns.$kw41$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)defns.ONE_INTEGER, (SubLObject)defns.$str42$continue_anyway, (SubLObject)defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)defns.$sym40$SBHL_TRUE_TV_P, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)defns.$kw43$WARN)) {
                                    Errors.warn((SubLObject)defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)defns.$sym40$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)defns.$str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)defns.$str42$continue_anyway, (SubLObject)defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)defns.$sym40$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$166 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$167 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(defns.$const45$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(defns.$const45$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(defns.$const45$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)defns.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(defns.$const45$genls), thread);
                                if (defns.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || defns.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$167 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$168 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$171 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(defns.$const45$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)defns.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)defns.UNPROVIDED);
                                        while (defns.NIL != node_var) {
                                            final SubLObject genl = node_var;
                                            inc_suf_defn_count(genl, quotedP, (SubLObject)defns.UNPROVIDED);
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(defns.$const45$genls));
                                            SubLObject module_var = (SubLObject)defns.NIL;
                                            module_var = cdolist_list_var.first();
                                            while (defns.NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$168 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$169 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((defns.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(defns.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var);
                                                    if (defns.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED));
                                                        if (defns.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED));
                                                            if (defns.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); defns.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (defns.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$169 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$175;
                                                                            for (iteration_state_$175 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); defns.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$175); iteration_state_$175 = dictionary_contents.do_dictionary_contents_next(iteration_state_$175)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$175);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (defns.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$170 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (defns.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)defns.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); defns.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (defns.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)defns.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)defns.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = (SubLObject)defns.NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (defns.NIL != csome_list_var) {
                                                                                                if (defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)defns.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)defns.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)defns.$str46$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$170, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$175);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$169, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)defns.FIVE_INTEGER, (SubLObject)defns.$str47$attempting_to_bind_direction_link, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (defns.NIL != obsolete.cnat_p(node, (SubLObject)defns.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$177;
                                                        final SubLObject new_list = cdolist_list_var_$177 = ((defns.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)defns.NIL;
                                                        generating_fn = cdolist_list_var_$177.first();
                                                        while (defns.NIL != cdolist_list_var_$177) {
                                                            final SubLObject _prev_bind_0_$171 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (defns.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)defns.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); defns.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (defns.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)defns.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)defns.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var2 = sol2;
                                                                    SubLObject node_vars_link_node4 = (SubLObject)defns.NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (defns.NIL != csome_list_var2) {
                                                                        if (defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)defns.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)defns.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)defns.$str46$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$171, thread);
                                                            }
                                                            cdolist_list_var_$177 = cdolist_list_var_$177.rest();
                                                            generating_fn = cdolist_list_var_$177.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$169, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$168, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$171, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$168, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$167, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)defns.TWO_INTEGER, (SubLObject)defns.$str48$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED)), (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$167, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$166, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$166, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$165, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$172 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)defns.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$172, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$164, thread);
                }
            }
            else {
                SubLObject node_var = col;
                final SubLObject deck_type = (SubLObject)defns.$kw36$STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$173 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)defns.NIL;
                        final SubLObject _prev_bind_0_$174 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$170 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((defns.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((defns.NIL != tv_var) ? defns.$sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (defns.NIL != tv_var && defns.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && defns.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)defns.$kw38$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)defns.ONE_INTEGER, (SubLObject)defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)defns.$sym40$SBHL_TRUE_TV_P, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)defns.$kw41$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)defns.ONE_INTEGER, (SubLObject)defns.$str42$continue_anyway, (SubLObject)defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)defns.$sym40$SBHL_TRUE_TV_P, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)defns.$kw43$WARN)) {
                                    Errors.warn((SubLObject)defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)defns.$sym40$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)defns.$str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)defns.$str42$continue_anyway, (SubLObject)defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)defns.$sym40$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$175 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$171 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(defns.$const45$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(defns.$const45$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(defns.$const45$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)defns.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(defns.$const45$genls), thread);
                                if (defns.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || defns.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$176 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$172 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$172 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(defns.$const45$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)defns.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)defns.UNPROVIDED);
                                        while (defns.NIL != node_var) {
                                            final SubLObject genl = node_var;
                                            dec_suf_defn_count(genl, quotedP, (SubLObject)defns.UNPROVIDED);
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(defns.$const45$genls));
                                            SubLObject module_var = (SubLObject)defns.NIL;
                                            module_var = cdolist_list_var.first();
                                            while (defns.NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$177 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$173 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((defns.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(defns.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var);
                                                    if (defns.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED));
                                                        if (defns.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED));
                                                            if (defns.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); defns.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (defns.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$178 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$176;
                                                                            for (iteration_state_$176 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); defns.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$176); iteration_state_$176 = dictionary_contents.do_dictionary_contents_next(iteration_state_$176)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$176);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (defns.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$179 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (defns.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)defns.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); defns.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (defns.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)defns.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)defns.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = (SubLObject)defns.NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (defns.NIL != csome_list_var) {
                                                                                                if (defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)defns.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)defns.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)defns.$str46$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$179, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$176);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$178, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)defns.FIVE_INTEGER, (SubLObject)defns.$str47$attempting_to_bind_direction_link, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (defns.NIL != obsolete.cnat_p(node, (SubLObject)defns.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$178;
                                                        final SubLObject new_list = cdolist_list_var_$178 = ((defns.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)defns.NIL;
                                                        generating_fn = cdolist_list_var_$178.first();
                                                        while (defns.NIL != cdolist_list_var_$178) {
                                                            final SubLObject _prev_bind_0_$180 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (defns.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)defns.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); defns.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (defns.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)defns.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)defns.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var2 = sol2;
                                                                    SubLObject node_vars_link_node4 = (SubLObject)defns.NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (defns.NIL != csome_list_var2) {
                                                                        if (defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)defns.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)defns.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)defns.$str46$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$180, thread);
                                                            }
                                                            cdolist_list_var_$178 = cdolist_list_var_$178.rest();
                                                            generating_fn = cdolist_list_var_$178.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$173, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$177, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$172, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$172, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$176, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)defns.TWO_INTEGER, (SubLObject)defns.$str48$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)defns.UNPROVIDED)), (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$171, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$175, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$170, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$174, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$181 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)defns.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$181, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$173, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 48510L)
    public static SubLObject update_defns(final SubLObject col, final SubLObject defn_assertion, final SubLObject addP, final SubLObject type) {
        if (type.eql((SubLObject)defns.$kw78$IFF)) {
            if (defns.NIL != addP) {
                return defns_cache_sethash(col, defns.$iff_defns_index$.getGlobalValue(), defn_assertion);
            }
            return defns_cache_remhash(col, defns.$iff_defns_index$.getGlobalValue());
        }
        else if (type.eql((SubLObject)defns.$kw87$QIFF)) {
            if (defns.NIL != addP) {
                return defns_cache_sethash(col, defns.$quoted_iff_defns_index$.getGlobalValue(), defn_assertion);
            }
            return defns_cache_remhash(col, defns.$quoted_iff_defns_index$.getGlobalValue());
        }
        else if (type.eql((SubLObject)defns.$kw81$SUF)) {
            if (defns.NIL != addP) {
                return defns_cache_push_hash(col, defn_assertion, defns.$suf_defns_index$.getGlobalValue());
            }
            return defns_cache_remove_value_from_hash(col, defn_assertion, defns.$suf_defns_index$.getGlobalValue());
        }
        else if (type.eql((SubLObject)defns.$kw90$QSUF)) {
            if (defns.NIL != addP) {
                return defns_cache_push_hash(col, defn_assertion, defns.$quoted_suf_defns_index$.getGlobalValue());
            }
            return defns_cache_remove_value_from_hash(col, defn_assertion, defns.$quoted_suf_defns_index$.getGlobalValue());
        }
        else if (type.eql((SubLObject)defns.$kw84$NEC)) {
            if (defns.NIL != addP) {
                return defns_cache_push_hash(col, defn_assertion, defns.$nec_defns_index$.getGlobalValue());
            }
            return defns_cache_remove_value_from_hash(col, defn_assertion, defns.$nec_defns_index$.getGlobalValue());
        }
        else {
            if (!type.eql((SubLObject)defns.$kw93$QNEC)) {
                return (SubLObject)defns.NIL;
            }
            if (defns.NIL != addP) {
                return defns_cache_push_hash(col, defn_assertion, defns.$quoted_nec_defns_index$.getGlobalValue());
            }
            return defns_cache_remove_value_from_hash(col, defn_assertion, defns.$quoted_nec_defns_index$.getGlobalValue());
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 49675L)
    public static SubLObject defns_cache_unbuiltP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(defns.NIL == defns_cache_hash_table_p(defns.$has_suf_defn_cache_index$.getGlobalValue()) || defns.NIL != defns_cache_hash_table_empty_p(defns.$has_suf_defn_cache_index$.getGlobalValue()) || defns.NIL == defns_cache_hash_table_p(defns.$iff_defns_index$.getGlobalValue()) || defns.NIL != defns_cache_hash_table_empty_p(defns.$iff_defns_index$.getGlobalValue()) || defns.NIL == defns_cache_hash_table_p(defns.$suf_defns_index$.getGlobalValue()) || defns.NIL != defns_cache_hash_table_empty_p(defns.$suf_defns_index$.getGlobalValue()) || defns.NIL == defns_cache_hash_table_p(defns.$nec_defns_index$.getGlobalValue()) || defns.NIL != defns_cache_hash_table_empty_p(defns.$nec_defns_index$.getGlobalValue()) || defns.NIL == defns_cache_hash_table_p(defns.$has_quoted_suf_defn_cache_index$.getGlobalValue()) || defns.NIL != defns_cache_hash_table_empty_p(defns.$has_quoted_suf_defn_cache_index$.getGlobalValue()) || defns.NIL == defns_cache_hash_table_p(defns.$quoted_iff_defns_index$.getGlobalValue()) || defns.NIL != defns_cache_hash_table_empty_p(defns.$quoted_iff_defns_index$.getGlobalValue()) || defns.NIL == defns_cache_hash_table_p(defns.$quoted_suf_defns_index$.getGlobalValue()) || defns.NIL == defns_cache_hash_table_p(defns.$quoted_nec_defns_index$.getGlobalValue()) || defns.NIL == defns_cache_hash_table_p(defns.$suf_defn_cache_index$.getGlobalValue()) || defns.NIL != defns_cache_hash_table_empty_p(defns.$suf_defn_cache_index$.getGlobalValue()) || defns.NIL == defns_cache_hash_table_p(defns.$suf_quoted_defn_cache_index$.getGlobalValue()) || defns.NIL != defns_cache_hash_table_empty_p(defns.$suf_quoted_defn_cache_index$.getGlobalValue()) || defns.NIL == defns_cache_hash_table_p(defns.$suf_function_cache_index$.getGlobalValue()) || defns.NIL != defns_cache_hash_table_empty_p(defns.$suf_function_cache_index$.getGlobalValue()) || defns.NIL == defns_cache_hash_table_p(defns.$suf_quoted_function_cache_index$.getGlobalValue()) || defns.NIL != defns_cache_hash_table_empty_p(defns.$suf_quoted_function_cache_index$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 51332L)
    public static SubLObject clear_defns_cache() {
        clear_defns();
        at_defns.clear_suf_defns();
        at_defns.clear_suf_quoted_defns();
        at_defns.clear_suf_functions();
        at_defns.clear_suf_quoted_functions();
        return (SubLObject)defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 51535L)
    public static SubLObject rebuild_defns_cache() {
        clear_defns_cache();
        initialize_defns();
        at_defns.initialize_sufficient_defns_cache();
        at_defns.initialize_sufficient_quoted_defns_cache();
        at_defns.initialize_sufficient_functions_cache();
        at_defns.initialize_sufficient_quoted_functions_cache();
        return (SubLObject)defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 51839L)
    public static SubLObject dump_defns_cache_to_stream(final SubLObject stream) {
        cfasl.cfasl_output(get_defn_cache_from_index(defns.$has_suf_defn_cache_index$.getGlobalValue()), stream);
        cfasl.cfasl_output(get_defn_cache_from_index(defns.$iff_defns_index$.getGlobalValue()), stream);
        cfasl.cfasl_output(get_defn_cache_from_index(defns.$suf_defns_index$.getGlobalValue()), stream);
        cfasl.cfasl_output(get_defn_cache_from_index(defns.$nec_defns_index$.getGlobalValue()), stream);
        cfasl.cfasl_output(get_defn_cache_from_index(defns.$has_quoted_suf_defn_cache_index$.getGlobalValue()), stream);
        cfasl.cfasl_output(get_defn_cache_from_index(defns.$quoted_iff_defns_index$.getGlobalValue()), stream);
        cfasl.cfasl_output(get_defn_cache_from_index(defns.$quoted_suf_defns_index$.getGlobalValue()), stream);
        cfasl.cfasl_output(get_defn_cache_from_index(defns.$quoted_nec_defns_index$.getGlobalValue()), stream);
        cfasl.cfasl_output(get_defn_cache_from_index(defns.$suf_defn_cache_index$.getGlobalValue()), stream);
        cfasl.cfasl_output(get_defn_cache_from_index(defns.$suf_quoted_defn_cache_index$.getGlobalValue()), stream);
        cfasl.cfasl_output(get_defn_cache_from_index(defns.$suf_function_cache_index$.getGlobalValue()), stream);
        cfasl.cfasl_output(get_defn_cache_from_index(defns.$suf_quoted_function_cache_index$.getGlobalValue()), stream);
        cfasl.cfasl_output((SubLObject)defns.NIL, stream);
        cfasl.cfasl_output((SubLObject)defns.NIL, stream);
        cfasl.cfasl_output((SubLObject)defns.NIL, stream);
        return (SubLObject)defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defns.lisp", position = 53006L)
    public static SubLObject load_defns_cache_from_stream(final SubLObject stream) {
        SubLObject dummy = (SubLObject)defns.NIL;
        Vectors.set_aref(get_index_to_defns_cache_vector(), defns.$has_suf_defn_cache_index$.getGlobalValue(), cfasl.cfasl_input(stream, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
        Vectors.set_aref(get_index_to_defns_cache_vector(), defns.$iff_defns_index$.getGlobalValue(), cfasl.cfasl_input(stream, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
        Vectors.set_aref(get_index_to_defns_cache_vector(), defns.$suf_defns_index$.getGlobalValue(), cfasl.cfasl_input(stream, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
        Vectors.set_aref(get_index_to_defns_cache_vector(), defns.$nec_defns_index$.getGlobalValue(), cfasl.cfasl_input(stream, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
        Vectors.set_aref(get_index_to_defns_cache_vector(), defns.$has_quoted_suf_defn_cache_index$.getGlobalValue(), cfasl.cfasl_input(stream, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
        Vectors.set_aref(get_index_to_defns_cache_vector(), defns.$quoted_iff_defns_index$.getGlobalValue(), cfasl.cfasl_input(stream, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
        Vectors.set_aref(get_index_to_defns_cache_vector(), defns.$quoted_suf_defns_index$.getGlobalValue(), cfasl.cfasl_input(stream, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
        Vectors.set_aref(get_index_to_defns_cache_vector(), defns.$quoted_nec_defns_index$.getGlobalValue(), cfasl.cfasl_input(stream, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
        Vectors.set_aref(get_index_to_defns_cache_vector(), defns.$suf_defn_cache_index$.getGlobalValue(), cfasl.cfasl_input(stream, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
        Vectors.set_aref(get_index_to_defns_cache_vector(), defns.$suf_quoted_defn_cache_index$.getGlobalValue(), cfasl.cfasl_input(stream, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
        Vectors.set_aref(get_index_to_defns_cache_vector(), defns.$suf_function_cache_index$.getGlobalValue(), cfasl.cfasl_input(stream, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
        Vectors.set_aref(get_index_to_defns_cache_vector(), defns.$suf_quoted_function_cache_index$.getGlobalValue(), cfasl.cfasl_input(stream, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
        dummy = cfasl.cfasl_input(stream, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED);
        dummy = cfasl.cfasl_input(stream, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED);
        dummy = cfasl.cfasl_input(stream, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED);
        return (SubLObject)defns.NIL;
    }
    
    public static SubLObject declare_defns_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "get_index_to_defns_cache_vector", "GET-INDEX-TO-DEFNS-CACHE-VECTOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "get_defn_cache_from_index", "GET-DEFN-CACHE-FROM-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "defns_cache_index_p", "DEFNS-CACHE-INDEX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "defns_cache_make_hash_table", "DEFNS-CACHE-MAKE-HASH-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "defns_cache_definedP", "DEFNS-CACHE-DEFINED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "defns_cache_hash_table_p", "DEFNS-CACHE-HASH-TABLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "defns_cache_hash_table_empty_p", "DEFNS-CACHE-HASH-TABLE-EMPTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "defns_cache_clrhash", "DEFNS-CACHE-CLRHASH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "defns_cache_gethash", "DEFNS-CACHE-GETHASH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "defns_cache_sethash", "DEFNS-CACHE-SETHASH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "defns_cache_remhash", "DEFNS-CACHE-REMHASH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "defns_cache_remove_value_from_hash", "DEFNS-CACHE-REMOVE-VALUE-FROM-HASH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "defns_cache_push_hash", "DEFNS-CACHE-PUSH-HASH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "defns_cache_gethash_without_values", "DEFNS-CACHE-GETHASH-WITHOUT-VALUES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "defns_cache_hash_table_to_alist", "DEFNS-CACHE-HASH-TABLE-TO-ALIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "defns_cache_hash_table_count", "DEFNS-CACHE-HASH-TABLE-COUNT", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.defns", "do_defns_cache_hash", "DO-DEFNS-CACHE-HASH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.defns", "progress_do_defns_cache_hash", "PROGRESS-DO-DEFNS-CACHE-HASH");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "suf_defn_count", "SUF-DEFN-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "has_suf_defn_somewhereP", "HAS-SUF-DEFN-SOMEWHERE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "set_suf_defn_count", "SET-SUF-DEFN-COUNT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "rem_suf_defn_count", "REM-SUF-DEFN-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "iff_defn", "IFF-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "rem_iff_defn", "REM-IFF-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "suf_defns", "SUF-DEFNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "rem_suf_defn", "REM-SUF-DEFN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "new_suf_defnP", "NEW-SUF-DEFN?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "nec_defns", "NEC-DEFNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "rem_nec_defn", "REM-NEC-DEFN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "has_some_defnP", "HAS-SOME-DEFN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "reset_new_defns_admitP_meters", "RESET-NEW-DEFNS-ADMIT?-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "new_defns_admitP_metered", "NEW-DEFNS-ADMIT?-METERED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "new_defns_admitP", "NEW-DEFNS-ADMIT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "defns_admitP_int", "DEFNS-ADMIT?-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "reset_new_defns_rejectP_meters", "RESET-NEW-DEFNS-REJECT?-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "new_defns_rejectP_metered", "NEW-DEFNS-REJECT?-METERED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "new_defns_rejectP", "NEW-DEFNS-REJECT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "defns_rejectP_int", "DEFNS-REJECT?-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "reset_new_quoted_defns_admitP_meters", "RESET-NEW-QUOTED-DEFNS-ADMIT?-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "new_quoted_defns_admitP_metered", "NEW-QUOTED-DEFNS-ADMIT?-METERED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "new_quoted_defns_admitP", "NEW-QUOTED-DEFNS-ADMIT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "reset_new_quoted_defns_rejectP_meters", "RESET-NEW-QUOTED-DEFNS-REJECT?-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "new_quoted_defns_rejectP_metered", "NEW-QUOTED-DEFNS-REJECT?-METERED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "new_quoted_defns_rejectP", "NEW-QUOTED-DEFNS-REJECT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "initial_check_defn_admit_status", "INITIAL-CHECK-DEFN-ADMIT-STATUS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "final_check_defn_admit_status", "FINAL-CHECK-DEFN-ADMIT-STATUS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "defns_walk_admitP", "DEFNS-WALK-ADMIT?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "sufficient_defn_violations", "SUFFICIENT-DEFN-VIOLATIONS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "sufficient_defn_violation", "SUFFICIENT-DEFN-VIOLATION", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "col_defn_admitsP", "COL-DEFN-ADMITS?", 1, 0, false);
        new $col_defn_admitsP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "col_quoted_defn_admitsP", "COL-QUOTED-DEFN-ADMITS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "col_defn_admitsP_int", "COL-DEFN-ADMITS?-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "defining_defns_admitsP", "DEFINING-DEFNS-ADMITS?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "defining_defn_violations", "DEFINING-DEFN-VIOLATIONS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "defining_defn_violation", "DEFINING-DEFN-VIOLATION", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "suf_defn_admitsP", "SUF-DEFN-ADMITS?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "nec_defn_permitsP", "NEC-DEFN-PERMITS?", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "reset_nec_defn_rejectsP_meters", "RESET-NEC-DEFN-REJECTS?-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "nec_defn_rejectsP_metered", "NEC-DEFN-REJECTS?-METERED", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "nec_defn_rejectsP", "NEC-DEFN-REJECTS?", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "necessary_defn_violations", "NECESSARY-DEFN-VIOLATIONS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "necessary_defn_violation", "NECESSARY-DEFN-VIOLATION", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "new_mts_of_admitting_defns", "NEW-MTS-OF-ADMITTING-DEFNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "mts_of_admitting_quoted_defns", "MTS-OF-ADMITTING-QUOTED-DEFNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "new_hl_justify_isa_via_defns", "NEW-HL-JUSTIFY-ISA-VIA-DEFNS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "hl_justify_quoted_isa_via_defns", "HL-JUSTIFY-QUOTED-ISA-VIA-DEFNS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "assertions_of_admitting_defns", "ASSERTIONS-OF-ADMITTING-DEFNS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "mts_from_defn_assertions", "MTS-FROM-DEFN-ASSERTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "initial_check_admit_defn", "INITIAL-CHECK-ADMIT-DEFN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "defns_of_admitting_sufficient_defns", "DEFNS-OF-ADMITTING-SUFFICIENT-DEFNS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "admitting_defn_assertions", "ADMITTING-DEFN-ASSERTIONS", 1, 0, false);
        new $admitting_defn_assertions$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "admitting_quoted_defn_assertions", "ADMITTING-QUOTED-DEFN-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "admitting_defn_assertion", "ADMITTING-DEFN-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "admitting_quoted_defn_assertion", "ADMITTING-QUOTED-DEFN-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "admitting_defn_assertions_int", "ADMITTING-DEFN-ASSERTIONS-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "suf_admitting_defns", "SUF-ADMITTING-DEFNS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "min_defn_admits", "MIN-DEFN-ADMITS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "all_defn_admits", "ALL-DEFN-ADMITS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "min_quoted_defn_admits", "MIN-QUOTED-DEFN-ADMITS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "all_quoted_defn_admits", "ALL-QUOTED-DEFN-ADMITS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "min_generalizations", "MIN-GENERALIZATIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "genericize_term_wrt_types", "GENERICIZE-TERM-WRT-TYPES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "genericize_constraints_wrt_types", "GENERICIZE-CONSTRAINTS-WRT-TYPES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "genericize_term_types_int", "GENERICIZE-TERM-TYPES-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "update_iff_or_suf_defn", "UPDATE-IFF-OR-SUF-DEFN", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "update_nec_defn", "UPDATE-NEC-DEFN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "new_add_iff_defn", "NEW-ADD-IFF-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "new_remove_iff_defn", "NEW-REMOVE-IFF-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "new_add_suf_defn", "NEW-ADD-SUF-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "new_remove_suf_defn", "NEW-REMOVE-SUF-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "add_nec_defn", "ADD-NEC-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "remove_nec_defn", "REMOVE-NEC-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "new_add_iff_quoted_defn", "NEW-ADD-IFF-QUOTED-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "new_remove_iff_quoted_defn", "NEW-REMOVE-IFF-QUOTED-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "new_add_suf_quoted_defn", "NEW-ADD-SUF-QUOTED-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "new_remove_suf_quoted_defn", "NEW-REMOVE-SUF-QUOTED-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "add_nec_quoted_defn", "ADD-NEC-QUOTED-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "remove_nec_quoted_defn", "REMOVE-NEC-QUOTED-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "handle_added_genl_for_suf_defns_int", "HANDLE-ADDED-GENL-FOR-SUF-DEFNS-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "reset_new_handle_added_genl_for_suf_defns_meters", "RESET-NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "new_handle_added_genl_for_suf_defns_metered", "NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "new_handle_added_genl_for_suf_defns", "NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "reset_new_handle_added_genl_for_suf_quoted_defns_meters", "RESET-NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "new_handle_added_genl_for_suf_quoted_defns_metered", "NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "new_handle_added_genl_for_suf_quoted_defns", "NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "handle_removed_genl_for_suf_defns_int", "HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "reset_new_handle_removed_genl_for_suf_defns_meters", "RESET-NEW-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "new_handle_removed_genl_for_suf_defns_metered", "NEW-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "new_handle_removed_genl_for_suf_defns", "NEW-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "reset_new_handle_removed_genl_for_suf_quoted_defns_meters", "RESET-NEW-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "new_handle_removed_genl_for_suf_quoted_defns_metered", "NEW-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "new_handle_removed_genl_for_suf_quoted_defns", "NEW-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "clear_defns", "CLEAR-DEFNS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "initialize_defns_cache", "INITIALIZE-DEFNS-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "initialize_defns", "INITIALIZE-DEFNS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "inc_suf_defn_count", "INC-SUF-DEFN-COUNT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "dec_suf_defn_count", "DEC-SUF-DEFN-COUNT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "update_suf_defn_cache", "UPDATE-SUF-DEFN-CACHE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "update_defns", "UPDATE-DEFNS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "defns_cache_unbuiltP", "DEFNS-CACHE-UNBUILT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "clear_defns_cache", "CLEAR-DEFNS-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "rebuild_defns_cache", "REBUILD-DEFNS-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "dump_defns_cache_to_stream", "DUMP-DEFNS-CACHE-TO-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defns", "load_defns_cache_from_stream", "LOAD-DEFNS-CACHE-FROM-STREAM", 1, 0, false);
        return (SubLObject)defns.NIL;
    }
    
    public static SubLObject init_defns_file() {
        defns.$index_to_defns_cache_vector$ = SubLFiles.deflexical("*INDEX-TO-DEFNS-CACHE-VECTOR*", (SubLObject)(maybeDefault((SubLObject)defns.$sym0$_INDEX_TO_DEFNS_CACHE_VECTOR_, defns.$index_to_defns_cache_vector$, defns.NIL)));
        defns.$has_suf_defn_cache_index$ = SubLFiles.defconstant("*HAS-SUF-DEFN-CACHE-INDEX*", (SubLObject)defns.ZERO_INTEGER);
        defns.$has_quoted_suf_defn_cache_index$ = SubLFiles.defconstant("*HAS-QUOTED-SUF-DEFN-CACHE-INDEX*", (SubLObject)defns.ONE_INTEGER);
        defns.$iff_defns_index$ = SubLFiles.defconstant("*IFF-DEFNS-INDEX*", (SubLObject)defns.TWO_INTEGER);
        defns.$quoted_iff_defns_index$ = SubLFiles.defconstant("*QUOTED-IFF-DEFNS-INDEX*", (SubLObject)defns.THREE_INTEGER);
        defns.$suf_defns_index$ = SubLFiles.defconstant("*SUF-DEFNS-INDEX*", (SubLObject)defns.FOUR_INTEGER);
        defns.$quoted_suf_defns_index$ = SubLFiles.defconstant("*QUOTED-SUF-DEFNS-INDEX*", (SubLObject)defns.FIVE_INTEGER);
        defns.$nec_defns_index$ = SubLFiles.defconstant("*NEC-DEFNS-INDEX*", (SubLObject)defns.SIX_INTEGER);
        defns.$quoted_nec_defns_index$ = SubLFiles.defconstant("*QUOTED-NEC-DEFNS-INDEX*", (SubLObject)defns.SEVEN_INTEGER);
        defns.$suf_defn_cache_index$ = SubLFiles.defconstant("*SUF-DEFN-CACHE-INDEX*", (SubLObject)defns.EIGHT_INTEGER);
        defns.$suf_quoted_defn_cache_index$ = SubLFiles.defconstant("*SUF-QUOTED-DEFN-CACHE-INDEX*", (SubLObject)defns.NINE_INTEGER);
        defns.$suf_function_cache_index$ = SubLFiles.defconstant("*SUF-FUNCTION-CACHE-INDEX*", (SubLObject)defns.TEN_INTEGER);
        defns.$suf_quoted_function_cache_index$ = SubLFiles.defconstant("*SUF-QUOTED-FUNCTION-CACHE-INDEX*", (SubLObject)defns.ELEVEN_INTEGER);
        defns.$defn_term$ = SubLFiles.defvar("*DEFN-TERM*", (SubLObject)defns.NIL);
        defns.$org_collection$ = SubLFiles.defvar("*ORG-COLLECTION*", (SubLObject)defns.NIL);
        defns.$failing_suf_defns$ = SubLFiles.defvar("*FAILING-SUF-DEFNS*", (SubLObject)defns.NIL);
        defns.$new_defns_admitP_meters$ = SubLFiles.defparameter("*NEW-DEFNS-ADMIT?-METERS*", Hashtables.make_hash_table((SubLObject)defns.EIGHT_INTEGER, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
        defns.$new_defns_rejectP_meters$ = SubLFiles.defparameter("*NEW-DEFNS-REJECT?-METERS*", Hashtables.make_hash_table((SubLObject)defns.EIGHT_INTEGER, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
        defns.$new_quoted_defns_admitP_meters$ = SubLFiles.defparameter("*NEW-QUOTED-DEFNS-ADMIT?-METERS*", Hashtables.make_hash_table((SubLObject)defns.EIGHT_INTEGER, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
        defns.$new_quoted_defns_rejectP_meters$ = SubLFiles.defparameter("*NEW-QUOTED-DEFNS-REJECT?-METERS*", Hashtables.make_hash_table((SubLObject)defns.EIGHT_INTEGER, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
        defns.$nec_defn_rejectsP_meters$ = SubLFiles.defparameter("*NEC-DEFN-REJECTS?-METERS*", Hashtables.make_hash_table((SubLObject)defns.EIGHT_INTEGER, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
        defns.$min_defn_admits_map$ = SubLFiles.deflexical("*MIN-DEFN-ADMITS-MAP*", (SubLObject)defns.$list70);
        defns.$min_quoted_defn_admits_map$ = SubLFiles.deflexical("*MIN-QUOTED-DEFN-ADMITS-MAP*", (SubLObject)defns.$list73);
        defns.$new_handle_added_genl_for_suf_defns_meters$ = SubLFiles.defparameter("*NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERS*", Hashtables.make_hash_table((SubLObject)defns.EIGHT_INTEGER, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
        defns.$new_handle_added_genl_for_suf_quoted_defns_meters$ = SubLFiles.defparameter("*NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS*", Hashtables.make_hash_table((SubLObject)defns.EIGHT_INTEGER, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
        defns.$new_handle_removed_genl_for_suf_defns_meters$ = SubLFiles.defparameter("*NEW-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERS*", Hashtables.make_hash_table((SubLObject)defns.EIGHT_INTEGER, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
        defns.$new_handle_removed_genl_for_suf_quoted_defns_meters$ = SubLFiles.defparameter("*NEW-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERS*", Hashtables.make_hash_table((SubLObject)defns.EIGHT_INTEGER, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
        return (SubLObject)defns.NIL;
    }
    
    public static SubLObject setup_defns_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)defns.$sym0$_INDEX_TO_DEFNS_CACHE_VECTOR_);
        SubLObject item_var = (SubLObject)defns.$sym12$_NEW_DEFNS_ADMIT__METERS_;
        if (defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)defns.EQL), Symbols.symbol_function((SubLObject)defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_new_defns_admitP_meters();
        Hashtables.sethash((SubLObject)defns.$kw21$RESET, defns.$new_defns_admitP_meters$.getDynamicValue(), (SubLObject)defns.$sym22$RESET_NEW_DEFNS_ADMIT__METERS);
        SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        SubLObject v_cache = (SubLObject)defns.NIL;
        v_cache = cdolist_list_var.first();
        while (defns.NIL != cdolist_list_var) {
            if (defns.$sym20$NEW_DEFNS_ADMIT_ == Hashtables.gethash((SubLObject)defns.$kw19$FUNCTION, v_cache, (SubLObject)defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(defns.$new_defns_admitP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = (SubLObject)defns.$sym25$_NEW_DEFNS_REJECT__METERS_;
        if (defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)defns.EQL), Symbols.symbol_function((SubLObject)defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_new_defns_rejectP_meters();
        Hashtables.sethash((SubLObject)defns.$kw21$RESET, defns.$new_defns_rejectP_meters$.getDynamicValue(), (SubLObject)defns.$sym27$RESET_NEW_DEFNS_REJECT__METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)defns.NIL;
        v_cache = cdolist_list_var.first();
        while (defns.NIL != cdolist_list_var) {
            if (defns.$sym26$NEW_DEFNS_REJECT_ == Hashtables.gethash((SubLObject)defns.$kw19$FUNCTION, v_cache, (SubLObject)defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(defns.$new_defns_rejectP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = (SubLObject)defns.$sym28$_NEW_QUOTED_DEFNS_ADMIT__METERS_;
        if (defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)defns.EQL), Symbols.symbol_function((SubLObject)defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_new_quoted_defns_admitP_meters();
        Hashtables.sethash((SubLObject)defns.$kw21$RESET, defns.$new_quoted_defns_admitP_meters$.getDynamicValue(), (SubLObject)defns.$sym30$RESET_NEW_QUOTED_DEFNS_ADMIT__METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)defns.NIL;
        v_cache = cdolist_list_var.first();
        while (defns.NIL != cdolist_list_var) {
            if (defns.$sym29$NEW_QUOTED_DEFNS_ADMIT_ == Hashtables.gethash((SubLObject)defns.$kw19$FUNCTION, v_cache, (SubLObject)defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(defns.$new_quoted_defns_admitP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = (SubLObject)defns.$sym31$_NEW_QUOTED_DEFNS_REJECT__METERS_;
        if (defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)defns.EQL), Symbols.symbol_function((SubLObject)defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_new_quoted_defns_rejectP_meters();
        Hashtables.sethash((SubLObject)defns.$kw21$RESET, defns.$new_quoted_defns_rejectP_meters$.getDynamicValue(), (SubLObject)defns.$sym33$RESET_NEW_QUOTED_DEFNS_REJECT__METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)defns.NIL;
        v_cache = cdolist_list_var.first();
        while (defns.NIL != cdolist_list_var) {
            if (defns.$sym32$NEW_QUOTED_DEFNS_REJECT_ == Hashtables.gethash((SubLObject)defns.$kw19$FUNCTION, v_cache, (SubLObject)defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(defns.$new_quoted_defns_rejectP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = (SubLObject)defns.$sym58$_NEC_DEFN_REJECTS__METERS_;
        if (defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)defns.EQL), Symbols.symbol_function((SubLObject)defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_nec_defn_rejectsP_meters();
        Hashtables.sethash((SubLObject)defns.$kw21$RESET, defns.$nec_defn_rejectsP_meters$.getDynamicValue(), (SubLObject)defns.$sym61$RESET_NEC_DEFN_REJECTS__METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)defns.NIL;
        v_cache = cdolist_list_var.first();
        while (defns.NIL != cdolist_list_var) {
            if (defns.$sym60$NEC_DEFN_REJECTS_ == Hashtables.gethash((SubLObject)defns.$kw19$FUNCTION, v_cache, (SubLObject)defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(defns.$nec_defn_rejectsP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        utilities_macros.register_kb_function((SubLObject)defns.$sym79$NEW_ADD_IFF_DEFN);
        utilities_macros.register_kb_function((SubLObject)defns.$sym80$NEW_REMOVE_IFF_DEFN);
        utilities_macros.register_kb_function((SubLObject)defns.$sym82$NEW_ADD_SUF_DEFN);
        utilities_macros.register_kb_function((SubLObject)defns.$sym83$NEW_REMOVE_SUF_DEFN);
        utilities_macros.register_kb_function((SubLObject)defns.$sym85$ADD_NEC_DEFN);
        utilities_macros.register_kb_function((SubLObject)defns.$sym86$REMOVE_NEC_DEFN);
        utilities_macros.register_kb_function((SubLObject)defns.$sym88$NEW_ADD_IFF_QUOTED_DEFN);
        utilities_macros.register_kb_function((SubLObject)defns.$sym89$NEW_REMOVE_IFF_QUOTED_DEFN);
        utilities_macros.register_kb_function((SubLObject)defns.$sym91$NEW_ADD_SUF_QUOTED_DEFN);
        utilities_macros.register_kb_function((SubLObject)defns.$sym92$NEW_REMOVE_SUF_QUOTED_DEFN);
        utilities_macros.register_kb_function((SubLObject)defns.$sym94$ADD_NEC_QUOTED_DEFN);
        utilities_macros.register_kb_function((SubLObject)defns.$sym95$REMOVE_NEC_QUOTED_DEFN);
        item_var = (SubLObject)defns.$sym97$_NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS_;
        if (defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)defns.EQL), Symbols.symbol_function((SubLObject)defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_new_handle_added_genl_for_suf_defns_meters();
        Hashtables.sethash((SubLObject)defns.$kw21$RESET, defns.$new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(), (SubLObject)defns.$sym100$RESET_NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)defns.NIL;
        v_cache = cdolist_list_var.first();
        while (defns.NIL != cdolist_list_var) {
            if (defns.$sym99$NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS == Hashtables.gethash((SubLObject)defns.$kw19$FUNCTION, v_cache, (SubLObject)defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(defns.$new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = (SubLObject)defns.$sym101$_NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS_;
        if (defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)defns.EQL), Symbols.symbol_function((SubLObject)defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_new_handle_added_genl_for_suf_quoted_defns_meters();
        Hashtables.sethash((SubLObject)defns.$kw21$RESET, defns.$new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(), (SubLObject)defns.$sym103$RESET_NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)defns.NIL;
        v_cache = cdolist_list_var.first();
        while (defns.NIL != cdolist_list_var) {
            if (defns.$sym102$NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS == Hashtables.gethash((SubLObject)defns.$kw19$FUNCTION, v_cache, (SubLObject)defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(defns.$new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = (SubLObject)defns.$sym104$_NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS_;
        if (defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)defns.EQL), Symbols.symbol_function((SubLObject)defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_new_handle_removed_genl_for_suf_defns_meters();
        Hashtables.sethash((SubLObject)defns.$kw21$RESET, defns.$new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(), (SubLObject)defns.$sym106$RESET_NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)defns.NIL;
        v_cache = cdolist_list_var.first();
        while (defns.NIL != cdolist_list_var) {
            if (defns.$sym105$NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS == Hashtables.gethash((SubLObject)defns.$kw19$FUNCTION, v_cache, (SubLObject)defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(defns.$new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = (SubLObject)defns.$sym107$_NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS_;
        if (defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)defns.EQL), Symbols.symbol_function((SubLObject)defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_new_handle_removed_genl_for_suf_quoted_defns_meters();
        Hashtables.sethash((SubLObject)defns.$kw21$RESET, defns.$new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(), (SubLObject)defns.$sym109$RESET_NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)defns.NIL;
        v_cache = cdolist_list_var.first();
        while (defns.NIL != cdolist_list_var) {
            if (defns.$sym108$NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS == Hashtables.gethash((SubLObject)defns.$kw19$FUNCTION, v_cache, (SubLObject)defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED, (SubLObject)defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(defns.$new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        return (SubLObject)defns.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_defns_file();
    }
    
    @Override
	public void initializeVariables() {
        init_defns_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_defns_file();
    }
    
    static {
        me = (SubLFile)new defns();
        defns.$index_to_defns_cache_vector$ = null;
        defns.$has_suf_defn_cache_index$ = null;
        defns.$has_quoted_suf_defn_cache_index$ = null;
        defns.$iff_defns_index$ = null;
        defns.$quoted_iff_defns_index$ = null;
        defns.$suf_defns_index$ = null;
        defns.$quoted_suf_defns_index$ = null;
        defns.$nec_defns_index$ = null;
        defns.$quoted_nec_defns_index$ = null;
        defns.$suf_defn_cache_index$ = null;
        defns.$suf_quoted_defn_cache_index$ = null;
        defns.$suf_function_cache_index$ = null;
        defns.$suf_quoted_function_cache_index$ = null;
        defns.$defn_term$ = null;
        defns.$org_collection$ = null;
        defns.$failing_suf_defns$ = null;
        defns.$new_defns_admitP_meters$ = null;
        defns.$new_defns_rejectP_meters$ = null;
        defns.$new_quoted_defns_admitP_meters$ = null;
        defns.$new_quoted_defns_rejectP_meters$ = null;
        defns.$nec_defn_rejectsP_meters$ = null;
        defns.$min_defn_admits_map$ = null;
        defns.$min_quoted_defn_admits_map$ = null;
        defns.$new_handle_added_genl_for_suf_defns_meters$ = null;
        defns.$new_handle_added_genl_for_suf_quoted_defns_meters$ = null;
        defns.$new_handle_removed_genl_for_suf_defns_meters$ = null;
        defns.$new_handle_removed_genl_for_suf_quoted_defns_meters$ = null;
        $sym0$_INDEX_TO_DEFNS_CACHE_VECTOR_ = SubLObjectFactory.makeSymbol("*INDEX-TO-DEFNS-CACHE-VECTOR*");
        $int1$256 = SubLObjectFactory.makeInteger(256);
        $int2$200 = SubLObjectFactory.makeInteger(200);
        $int3$64 = SubLObjectFactory.makeInteger(64);
        $sym4$DEFNS_CACHE_INDEX_P = SubLObjectFactory.makeSymbol("DEFNS-CACHE-INDEX-P");
        $list5 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VAL"), (SubLObject)SubLObjectFactory.makeSymbol("DEFN-CACHE-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw7$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw8$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym9$CDOHASH = SubLObjectFactory.makeSymbol("CDOHASH");
        $sym10$GET_DEFN_CACHE_FROM_INDEX = SubLObjectFactory.makeSymbol("GET-DEFN-CACHE-FROM-INDEX");
        $sym11$PROGRESS_CDOHASH = SubLObjectFactory.makeSymbol("PROGRESS-CDOHASH");
        $sym12$_NEW_DEFNS_ADMIT__METERS_ = SubLObjectFactory.makeSymbol("*NEW-DEFNS-ADMIT?-METERS*");
        $kw13$CALLS = SubLObjectFactory.makeKeyword("CALLS");
        $kw14$TIMES = SubLObjectFactory.makeKeyword("TIMES");
        $kw15$RESULTS = SubLObjectFactory.makeKeyword("RESULTS");
        $kw16$ARGS = SubLObjectFactory.makeKeyword("ARGS");
        $kw17$ARG_LIST = SubLObjectFactory.makeKeyword("ARG-LIST");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $kw19$FUNCTION = SubLObjectFactory.makeKeyword("FUNCTION");
        $sym20$NEW_DEFNS_ADMIT_ = SubLObjectFactory.makeSymbol("NEW-DEFNS-ADMIT?");
        $kw21$RESET = SubLObjectFactory.makeKeyword("RESET");
        $sym22$RESET_NEW_DEFNS_ADMIT__METERS = SubLObjectFactory.makeSymbol("RESET-NEW-DEFNS-ADMIT?-METERS");
        $kw23$ADMITTED = SubLObjectFactory.makeKeyword("ADMITTED");
        $kw24$REJECTED = SubLObjectFactory.makeKeyword("REJECTED");
        $sym25$_NEW_DEFNS_REJECT__METERS_ = SubLObjectFactory.makeSymbol("*NEW-DEFNS-REJECT?-METERS*");
        $sym26$NEW_DEFNS_REJECT_ = SubLObjectFactory.makeSymbol("NEW-DEFNS-REJECT?");
        $sym27$RESET_NEW_DEFNS_REJECT__METERS = SubLObjectFactory.makeSymbol("RESET-NEW-DEFNS-REJECT?-METERS");
        $sym28$_NEW_QUOTED_DEFNS_ADMIT__METERS_ = SubLObjectFactory.makeSymbol("*NEW-QUOTED-DEFNS-ADMIT?-METERS*");
        $sym29$NEW_QUOTED_DEFNS_ADMIT_ = SubLObjectFactory.makeSymbol("NEW-QUOTED-DEFNS-ADMIT?");
        $sym30$RESET_NEW_QUOTED_DEFNS_ADMIT__METERS = SubLObjectFactory.makeSymbol("RESET-NEW-QUOTED-DEFNS-ADMIT?-METERS");
        $sym31$_NEW_QUOTED_DEFNS_REJECT__METERS_ = SubLObjectFactory.makeSymbol("*NEW-QUOTED-DEFNS-REJECT?-METERS*");
        $sym32$NEW_QUOTED_DEFNS_REJECT_ = SubLObjectFactory.makeSymbol("NEW-QUOTED-DEFNS-REJECT?");
        $sym33$RESET_NEW_QUOTED_DEFNS_REJECT__METERS = SubLObjectFactory.makeSymbol("RESET-NEW-QUOTED-DEFNS-REJECT?-METERS");
        $kw34$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw35$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw36$STACK = SubLObjectFactory.makeKeyword("STACK");
        $sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw38$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str39$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym40$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw41$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str42$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw43$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str44$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $const45$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $str46$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str47$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str48$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $kw49$DISJOINT = SubLObjectFactory.makeKeyword("DISJOINT");
        $sym50$COL_QUOTED_DEFN_ADMITS_ = SubLObjectFactory.makeSymbol("COL-QUOTED-DEFN-ADMITS?");
        $sym51$COL_DEFN_ADMITS_ = SubLObjectFactory.makeSymbol("COL-DEFN-ADMITS?");
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT-RELN"), (SubLObject)SubLObjectFactory.makeSymbol("VIA"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT-GAF"));
        $kw53$AT_CONSTRAINT_GAF = SubLObjectFactory.makeKeyword("AT-CONSTRAINT-GAF");
        $kw54$MAL_ARG_WRT_QUOTED_SUF_DEFNS = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-QUOTED-SUF-DEFNS");
        $kw55$MAL_ARG_WRT_SUF_DEFNS = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-SUF-DEFNS");
        $kw56$MAL_ARG_WRT_QUOTED_IFF_DEFN = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-QUOTED-IFF-DEFN");
        $kw57$MAL_ARG_WRT_IFF_DEFN = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-IFF-DEFN");
        $sym58$_NEC_DEFN_REJECTS__METERS_ = SubLObjectFactory.makeSymbol("*NEC-DEFN-REJECTS?-METERS*");
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("QUOTED?"), (SubLObject)SubLObjectFactory.makeSymbol("CONSIDER-IFF-AS-NEC?"));
        $sym60$NEC_DEFN_REJECTS_ = SubLObjectFactory.makeSymbol("NEC-DEFN-REJECTS?");
        $sym61$RESET_NEC_DEFN_REJECTS__METERS = SubLObjectFactory.makeSymbol("RESET-NEC-DEFN-REJECTS?-METERS");
        $kw62$MAL_ARG_WRT_QUOTED_NEC_DEFN = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-QUOTED-NEC-DEFN");
        $kw63$MAL_ARG_WRT_NEC_DEFN = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-NEC-DEFN");
        $const64$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $kw65$GENLS = SubLObjectFactory.makeKeyword("GENLS");
        $sym66$ADMITTING_QUOTED_DEFN_ASSERTION = SubLObjectFactory.makeSymbol("ADMITTING-QUOTED-DEFN-ASSERTION");
        $sym67$ADMITTING_DEFN_ASSERTION = SubLObjectFactory.makeSymbol("ADMITTING-DEFN-ASSERTION");
        $sym68$ADMITTING_QUOTED_DEFN_ASSERTIONS = SubLObjectFactory.makeSymbol("ADMITTING-QUOTED-DEFN-ASSERTIONS");
        $sym69$ADMITTING_DEFN_ASSERTIONS = SubLObjectFactory.makeSymbol("ADMITTING-DEFN-ASSERTIONS");
        $list70 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CharacterString"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PositiveInteger"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NonNegativeInteger"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGERP"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Integer"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FLOATP"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RealNumber"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))));
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFN"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION"));
        $kw72$ASCENDING = SubLObjectFactory.makeKeyword("ASCENDING");
        $list73 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLString"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGERP"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLInteger"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FLOATP"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLRealNumber"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLSymbol"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLConstant"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NART-P"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLNonAtomicReifiedTerm"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-P"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLAssertion"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLExpression"))));
        $list74 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTED-DEFN"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION"));
        $const75$CollectionIntersection2Fn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersection2Fn"));
        $const76$CollectionIntersectionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersectionFn"));
        $const77$SomeFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeFn"));
        $kw78$IFF = SubLObjectFactory.makeKeyword("IFF");
        $sym79$NEW_ADD_IFF_DEFN = SubLObjectFactory.makeSymbol("NEW-ADD-IFF-DEFN");
        $sym80$NEW_REMOVE_IFF_DEFN = SubLObjectFactory.makeSymbol("NEW-REMOVE-IFF-DEFN");
        $kw81$SUF = SubLObjectFactory.makeKeyword("SUF");
        $sym82$NEW_ADD_SUF_DEFN = SubLObjectFactory.makeSymbol("NEW-ADD-SUF-DEFN");
        $sym83$NEW_REMOVE_SUF_DEFN = SubLObjectFactory.makeSymbol("NEW-REMOVE-SUF-DEFN");
        $kw84$NEC = SubLObjectFactory.makeKeyword("NEC");
        $sym85$ADD_NEC_DEFN = SubLObjectFactory.makeSymbol("ADD-NEC-DEFN");
        $sym86$REMOVE_NEC_DEFN = SubLObjectFactory.makeSymbol("REMOVE-NEC-DEFN");
        $kw87$QIFF = SubLObjectFactory.makeKeyword("QIFF");
        $sym88$NEW_ADD_IFF_QUOTED_DEFN = SubLObjectFactory.makeSymbol("NEW-ADD-IFF-QUOTED-DEFN");
        $sym89$NEW_REMOVE_IFF_QUOTED_DEFN = SubLObjectFactory.makeSymbol("NEW-REMOVE-IFF-QUOTED-DEFN");
        $kw90$QSUF = SubLObjectFactory.makeKeyword("QSUF");
        $sym91$NEW_ADD_SUF_QUOTED_DEFN = SubLObjectFactory.makeSymbol("NEW-ADD-SUF-QUOTED-DEFN");
        $sym92$NEW_REMOVE_SUF_QUOTED_DEFN = SubLObjectFactory.makeSymbol("NEW-REMOVE-SUF-QUOTED-DEFN");
        $kw93$QNEC = SubLObjectFactory.makeKeyword("QNEC");
        $sym94$ADD_NEC_QUOTED_DEFN = SubLObjectFactory.makeSymbol("ADD-NEC-QUOTED-DEFN");
        $sym95$REMOVE_NEC_QUOTED_DEFN = SubLObjectFactory.makeSymbol("REMOVE-NEC-QUOTED-DEFN");
        $sym96$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $sym97$_NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS_ = SubLObjectFactory.makeSymbol("*NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERS*");
        $list98 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("GENL"));
        $sym99$NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS = SubLObjectFactory.makeSymbol("NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS");
        $sym100$RESET_NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS = SubLObjectFactory.makeSymbol("RESET-NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERS");
        $sym101$_NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS_ = SubLObjectFactory.makeSymbol("*NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS*");
        $sym102$NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS = SubLObjectFactory.makeSymbol("NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS");
        $sym103$RESET_NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS = SubLObjectFactory.makeSymbol("RESET-NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS");
        $sym104$_NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS_ = SubLObjectFactory.makeSymbol("*NEW-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERS*");
        $sym105$NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS = SubLObjectFactory.makeSymbol("NEW-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS");
        $sym106$RESET_NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS = SubLObjectFactory.makeSymbol("RESET-NEW-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERS");
        $sym107$_NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS_ = SubLObjectFactory.makeSymbol("*NEW-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERS*");
        $sym108$NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS = SubLObjectFactory.makeSymbol("NEW-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS");
        $sym109$RESET_NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS = SubLObjectFactory.makeSymbol("RESET-NEW-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERS");
        $int110$400 = SubLObjectFactory.makeInteger(400);
        $int111$100 = SubLObjectFactory.makeInteger(100);
        $str112$Initializing_defns___ = SubLObjectFactory.makeString("Initializing defns...");
        $const113$defnIff = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defnIff"));
        $kw114$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw115$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $const116$defnSufficient = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defnSufficient"));
        $const117$defnNecessary = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defnNecessary"));
        $const118$quotedDefnIff = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedDefnIff"));
        $const119$quotedDefnSufficient = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedDefnSufficient"));
        $const120$quotedDefnNecessary = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedDefnNecessary"));
    }
    
    public static final class $col_defn_admitsP$UnaryFunction extends UnaryFunction
    {
        public $col_defn_admitsP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("COL-DEFN-ADMITS?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return defns.col_defn_admitsP(arg1);
        }
    }
    
    public static final class $admitting_defn_assertions$UnaryFunction extends UnaryFunction
    {
        public $admitting_defn_assertions$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ADMITTING-DEFN-ASSERTIONS"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return defns.admitting_defn_assertions(arg1);
        }
    }
}

/*

	Total time: 3406 ms
	
*/