package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_types extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.pph_types";
    public static final String myFingerPrint = "20deafdb4a765f1cb63f22b8925f2364e0cc5285fecef51d0dfeb1f26b05ae57";
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 939L)
    private static SubLSymbol $pph_type_tree$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 3192L)
    private static SubLSymbol $paraphrase_tests$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 7433L)
    private static SubLSymbol $pph_type_method_hash$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 7561L)
    private static SubLSymbol $pph_valid_method_qualities$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 17018L)
    private static SubLSymbol $pph_date_denoting_functions$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 23414L)
    private static SubLSymbol $pph_subcol_fns$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$_PPH_TYPE_METHOD_HASH_;
    private static final SubLInteger $int3$256;
    private static final SubLList $list4;
    private static final SubLString $str5$__Found__D_methods_for__S___S___;
    private static final SubLString $str6$__Found_no_methods_for__S___;
    private static final SubLList $list7;
    private static final SubLString $str8$__Found_paraphrase_methods_for__S;
    private static final SubLString $str9$__No_paraphrase_methods_found_for;
    private static final SubLString $str10$_PPH_error_level_;
    private static final SubLString $str11$__;
    private static final SubLString $str12$___S_is_not_a_valid_paraphrase_ty;
    private static final SubLString $str13$___S_is_not_a_symbol___;
    private static final SubLString $str14$___S_is_not_a_valid_paraphrase_me;
    private static final SubLSymbol $sym15$FIRST;
    private static final SubLString $str16$___S_is_not_a_registered_method_f;
    private static final SubLSymbol $sym17$PPH_METHOD_INFO;
    private static final SubLSymbol $sym18$SUSPENDING_PARAPHRASE_METHOD;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$PPH_REGISTER_METHOD_INFO;
    private static final SubLList $list21;
    private static final SubLSymbol $sym22$PPH_DEREGISTER_METHOD_INFO;
    private static final SubLSymbol $sym23$LISTP;
    private static final SubLSymbol $sym24$PPH_HIGHER_METHOD_QUALITY_;
    private static final SubLSymbol $sym25$SECOND;
    private static final SubLSymbol $sym26$_;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLString $str29$___S___passed_test__S_for_termina;
    private static final SubLString $str30$___S___passed_test__S_for_non_ter;
    private static final SubLString $str31$___S___failed_test__S_for_non_fin;
    private static final SubLString $str32$___S___failed_test__S_for_final_t;
    private static final SubLString $str33$___S___judged_to_be_non_terminal_;
    private static final SubLString $str34$___S___does_not_pass_top_level_te;
    private static final SubLObject $const35$CollectionDenotingFunction;
    private static final SubLObject $const36$TheSetOf;
    private static final SubLList $list37;
    private static final SubLList $list38;
    private static final SubLList $list39;
    private static final SubLList $list40;
    private static final SubLList $list41;
    private static final SubLObject $const42$Function_Denotational;
    private static final SubLList $list43;
    private static final SubLObject $const44$TruthFunction;
    private static final SubLObject $const45$rewriteOf;
    private static final SubLSymbol $kw46$TRUE;
    private static final SubLObject $const47$True;
    private static final SubLObject $const48$False;
    private static final SubLObject $const49$expansion;
    private static final SubLObject $const50$cfImplies;
    private static final SubLObject $const51$compositeFieldFormat;
    private static final SubLObject $const52$ScriptPredicate;
    private static final SubLList $list53;
    private static final SubLObject $const54$Collection;
    private static final SubLObject $const55$GeopoliticalEntity;
    private static final SubLObject $const56$InferencePSC;
    private static final SubLObject $const57$City;
    private static final SubLObject $const58$USCity;
    private static final SubLObject $const59$hypotheticalTerm;
    private static final SubLSymbol $kw60$UNIVERSAL_DATE;
    private static final SubLSymbol $kw61$UNIVERSAL_SECOND;
    private static final SubLSymbol $sym62$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const63$EverythingPSC;
    private static final SubLObject $const64$TruthValue;
    private static final SubLObject $const65$TheResultOfParsing;
    private static final SubLObject $const66$TheCollectionOf;
    private static final SubLObject $const67$SubcollectionRelationFunction;
    private static final SubLObject $const68$isa;
    private static final SubLSymbol $kw69$BREADTH;
    private static final SubLSymbol $kw70$QUEUE;
    private static final SubLSymbol $kw71$STACK;
    private static final SubLSymbol $sym72$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw73$ERROR;
    private static final SubLString $str74$_A_is_not_a__A;
    private static final SubLSymbol $sym75$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw76$CERROR;
    private static final SubLString $str77$continue_anyway;
    private static final SubLSymbol $kw78$WARN;
    private static final SubLString $str79$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLString $str80$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str81$attempting_to_bind_direction_link;
    private static final SubLList $list82;
    private static final SubLString $str83$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLObject $const84$CollectionSubsetFn;
    private static final SubLSymbol $kw85$INITIALIZED;
    private static final SubLList $list86;
    private static final SubLSymbol $sym87$VALUE;
    private static final SubLSymbol $sym88$BIN_PRED;
    private static final SubLSymbol $sym89$GENL;
    private static final SubLSymbol $sym90$FN;
    private static final SubLSymbol $sym91$PPH_TERM_HAS_EXPANSION_;
    private static final SubLSymbol $kw92$ANY;
    private static final SubLSymbol $sym93$PPH_MATCHING_VERB_SEMTRANS_ASSERTIONS;
    private static final SubLSymbol $kw94$IGNORE;
    private static final SubLList $list95;
    private static final SubLSymbol $sym96$ARG2;
    private static final SubLSymbol $sym97$ARG1;
    private static final SubLString $str98$Found_head_binding_conjunct_____S;
    private static final SubLObject $const99$verbSemTrans_Canonical;
    private static final SubLSymbol $kw100$GAF;
    private static final SubLString $str101$Found_matching_vST_Canonical_____;
    private static final SubLSymbol $sym102$PPH_FRAME_ARITY__;
    private static final SubLSymbol $sym103$GAF_ARG3;
    private static final SubLInteger $int104$24;
    private static final SubLObject $const105$FunctionToArg;
    private static final SubLObject $const106$Kappa;
    private static final SubLSymbol $sym107$EL_VAR_;
    private static final SubLObject $const108$fieldCodes;
    private static final SubLList $list109;
    private static final SubLObject $const110$DBEntryFn;
    private static final SubLList $list111;
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 7705L)
    public static SubLObject get_paraphrase_methods(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject types = pph_identify_type(v_object);
        SubLObject v_methods = (SubLObject)pph_types.NIL;
        SubLObject sub_type = (SubLObject)pph_types.NIL;
        SubLObject type_demerits = (SubLObject)pph_types.ZERO_INTEGER;
        SubLObject cdolist_list_var = types;
        SubLObject type = (SubLObject)pph_types.NIL;
        type = cdolist_list_var.first();
        while (pph_types.NIL != cdolist_list_var) {
            final SubLObject type_methods = pph_methods_for_type(type);
            final SubLObject transition_demerits = pph_type_transition_demerits(type, sub_type);
            type_demerits = Numbers.add(type_demerits, transition_demerits);
            if (pph_types.NIL != type_methods) {
                if (pph_types.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_types.THREE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_types.T, (SubLObject)pph_types.$str5$__Found__D_methods_for__S___S___, Sequences.length(type_methods), type, type_methods, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED);
                }
            }
            else if (pph_types.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_types.TWO_INTEGER) && pph_types.NIL == pph_error.suppress_pph_warningsP()) {
                Errors.warn((SubLObject)pph_types.$str6$__Found_no_methods_for__S___, type);
                streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            SubLObject cdolist_list_var_$1 = type_methods;
            SubLObject method = (SubLObject)pph_types.NIL;
            method = cdolist_list_var_$1.first();
            while (pph_types.NIL != cdolist_list_var_$1) {
                SubLObject current;
                final SubLObject datum = current = method;
                SubLObject method_symbol = (SubLObject)pph_types.NIL;
                SubLObject method_quality = (SubLObject)pph_types.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_types.$list7);
                method_symbol = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_types.$list7);
                method_quality = current.first();
                current = current.rest();
                if (pph_types.NIL == current) {
                    final SubLObject quality_demerits = pph_method_quality_demerits(method_quality);
                    final SubLObject method_demerits = Numbers.add(type_demerits, quality_demerits);
                    final SubLObject item_var = (SubLObject)ConsesLow.list(method_symbol, method_demerits);
                    if (pph_types.NIL == conses_high.member(item_var, v_methods, Symbols.symbol_function((SubLObject)pph_types.EQL), Symbols.symbol_function((SubLObject)pph_types.IDENTITY))) {
                        v_methods = (SubLObject)ConsesLow.cons(item_var, v_methods);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_types.$list7);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                method = cdolist_list_var_$1.first();
            }
            sub_type = type;
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        }
        v_methods = pph_sort_methods_by_demerits(Sequences.nreverse(v_methods));
        if (pph_types.NIL != v_methods) {
            if (pph_types.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_types.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_types.T, (SubLObject)pph_types.$str8$__Found_paraphrase_methods_for__S, v_object, v_methods, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED);
            }
        }
        else if (pph_types.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_types.ONE_INTEGER) && pph_types.NIL == pph_error.suppress_pph_warningsP()) {
            Errors.warn((SubLObject)pph_types.$str9$__No_paraphrase_methods_found_for, v_object);
            streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return v_methods;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 9060L)
    public static SubLObject pph_register_method(final SubLObject symbol, final SubLObject type, final SubLObject quality) {
        if (pph_types.NIL == pph_valid_typeP(type)) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_types.$str10$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_types.TWO_INTEGER), pph_types.$str11$__, format_nil.format_nil_a_no_copy((SubLObject)pph_types.$str12$___S_is_not_a_valid_paraphrase_ty) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(type));
            return (SubLObject)pph_types.NIL;
        }
        if (!symbol.isSymbol()) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_types.$str10$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_types.TWO_INTEGER), pph_types.$str11$__, format_nil.format_nil_a_no_copy((SubLObject)pph_types.$str13$___S_is_not_a_symbol___) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(symbol));
            return (SubLObject)pph_types.NIL;
        }
        if (pph_types.NIL == pph_valid_method_qualityP(quality)) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_types.$str10$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_types.TWO_INTEGER), pph_types.$str11$__, format_nil.format_nil_a_no_copy((SubLObject)pph_types.$str14$___S_is_not_a_valid_paraphrase_me) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(type, pph_types.$pph_valid_method_qualities$.getGlobalValue()));
            return (SubLObject)pph_types.NIL;
        }
        final SubLObject existing = pph_type_entries(type);
        final SubLObject new_pair = (SubLObject)ConsesLow.list(symbol, quality);
        final SubLObject new_value = pph_sort_methods((SubLObject)ConsesLow.cons(new_pair, Sequences.remove(symbol, existing, Symbols.symbol_function((SubLObject)pph_types.EQ), Symbols.symbol_function((SubLObject)pph_types.$sym15$FIRST), (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED)));
        Hashtables.sethash(type, pph_types.$pph_type_method_hash$.getGlobalValue(), new_value);
        return pph_type_entries(type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 10030L)
    public static SubLObject pph_deregister_method(final SubLObject symbol, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_types.NIL == pph_valid_typeP(type)) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_types.$str10$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_types.TWO_INTEGER), pph_types.$str11$__, format_nil.format_nil_a_no_copy((SubLObject)pph_types.$str12$___S_is_not_a_valid_paraphrase_ty) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(type));
            return (SubLObject)pph_types.NIL;
        }
        if (!symbol.isSymbol()) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_types.$str10$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_types.TWO_INTEGER), pph_types.$str11$__, format_nil.format_nil_a_no_copy((SubLObject)pph_types.$str13$___S_is_not_a_symbol___) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(symbol));
            return (SubLObject)pph_types.NIL;
        }
        final SubLObject entries = pph_type_entries(type);
        final SubLObject entry = conses_high.assoc(symbol, entries, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED);
        if (pph_types.NIL == entry) {
            if (pph_types.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_types.THREE_INTEGER) && pph_types.NIL == pph_error.suppress_pph_warningsP()) {
                Errors.warn((SubLObject)pph_types.$str16$___S_is_not_a_registered_method_f, symbol, type);
                streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
        }
        else {
            Hashtables.sethash(type, pph_types.$pph_type_method_hash$.getGlobalValue(), Sequences.remove(entry, entries, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED));
        }
        return pph_type_entries(type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 10735L)
    public static SubLObject pph_method_info(final SubLObject method_symbol, final SubLObject object_type) {
        SubLObject ans = (SubLObject)pph_types.NIL;
        if (pph_types.NIL != object_type) {
            SubLObject cdolist_list_var = pph_type_entries(object_type);
            SubLObject pair = (SubLObject)pph_types.NIL;
            pair = cdolist_list_var.first();
            while (pph_types.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = pair;
                SubLObject symbol = (SubLObject)pph_types.NIL;
                SubLObject quality = (SubLObject)pph_types.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_types.$list19);
                symbol = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_types.$list19);
                quality = current.first();
                current = current.rest();
                if (pph_types.NIL == current) {
                    if (symbol.eql(method_symbol)) {
                        ans = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(object_type, quality), ans);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_types.$list19);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pair = cdolist_list_var.first();
            }
        }
        else {
            SubLObject type = (SubLObject)pph_types.NIL;
            SubLObject pairs = (SubLObject)pph_types.NIL;
            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(pph_types.$pph_type_method_hash$.getGlobalValue());
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    type = Hashtables.getEntryKey(cdohash_entry);
                    SubLObject cdolist_list_var2;
                    pairs = (cdolist_list_var2 = Hashtables.getEntryValue(cdohash_entry));
                    SubLObject pair2 = (SubLObject)pph_types.NIL;
                    pair2 = cdolist_list_var2.first();
                    while (pph_types.NIL != cdolist_list_var2) {
                        SubLObject current2;
                        final SubLObject datum2 = current2 = pair2;
                        SubLObject symbol2 = (SubLObject)pph_types.NIL;
                        SubLObject quality2 = (SubLObject)pph_types.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)pph_types.$list19);
                        symbol2 = current2.first();
                        current2 = current2.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)pph_types.$list19);
                        quality2 = current2.first();
                        current2 = current2.rest();
                        if (pph_types.NIL == current2) {
                            if (symbol2.eql(method_symbol)) {
                                ans = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(type, quality2), ans);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)pph_types.$list19);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        pair2 = cdolist_list_var2.first();
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 11411L)
    public static SubLObject pph_register_method_info(final SubLObject method_symbol, final SubLObject info) {
        SubLObject cdolist_list_var = info;
        SubLObject pair = (SubLObject)pph_types.NIL;
        pair = cdolist_list_var.first();
        while (pph_types.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject type = (SubLObject)pph_types.NIL;
            SubLObject quality = (SubLObject)pph_types.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_types.$list21);
            type = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_types.$list21);
            quality = current.first();
            current = current.rest();
            if (pph_types.NIL == current) {
                pph_register_method(method_symbol, type, quality);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_types.$list21);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return (SubLObject)pph_types.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 11716L)
    public static SubLObject pph_deregister_method_info(final SubLObject method_symbol, final SubLObject info) {
        SubLObject cdolist_list_var = info;
        SubLObject pair = (SubLObject)pph_types.NIL;
        pair = cdolist_list_var.first();
        while (pph_types.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject type = (SubLObject)pph_types.NIL;
            SubLObject quality = (SubLObject)pph_types.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_types.$list21);
            type = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_types.$list21);
            quality = current.first();
            current = current.rest();
            if (pph_types.NIL == current) {
                pph_deregister_method(method_symbol, type);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_types.$list21);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return (SubLObject)pph_types.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 12040L)
    public static SubLObject pph_type_entries(final SubLObject type) {
        return Hashtables.gethash(type, pph_types.$pph_type_method_hash$.getGlobalValue(), (SubLObject)pph_types.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 12128L)
    public static SubLObject pph_subtypes(final SubLObject super_type) {
        return conses_high.second(list_utilities.alist_lookup(pph_types.$pph_type_tree$.getGlobalValue(), super_type, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 12231L)
    public static SubLObject pph_type_transition_demerits(final SubLObject super_type, final SubLObject sub_type) {
        final SubLObject subtypes = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)pph_types.$sym23$LISTP), pph_subtypes(super_type), (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED);
        return list_utilities.alist_lookup(subtypes, sub_type, Symbols.symbol_function((SubLObject)pph_types.EQ), (SubLObject)pph_types.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 12422L)
    public static SubLObject pph_sort_methods(final SubLObject v_methods) {
        return Sort.stable_sort(conses_high.copy_list(v_methods), Symbols.symbol_function((SubLObject)pph_types.$sym24$PPH_HIGHER_METHOD_QUALITY_), Symbols.symbol_function((SubLObject)pph_types.$sym25$SECOND));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 12602L)
    public static SubLObject pph_sort_methods_by_demerits(final SubLObject v_methods) {
        return Sort.stable_sort(conses_high.copy_list(v_methods), Symbols.symbol_function((SubLObject)pph_types.$sym26$_), Symbols.symbol_function((SubLObject)pph_types.$sym25$SECOND));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 12777L)
    public static SubLObject pph_higher_method_qualityP(final SubLObject q1, final SubLObject q2) {
        final SubLObject q1_value = pph_method_quality_score(q1);
        final SubLObject q2_value = pph_method_quality_score(q2);
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_types.NIL != q1_value && pph_types.NIL != q2_value && q1_value.numG(q2_value));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 12982L)
    public static SubLObject pph_method_quality_score(final SubLObject quality) {
        return Sequences.position(quality, pph_types.$pph_valid_method_qualities$.getGlobalValue(), (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 13151L)
    public static SubLObject pph_method_quality_demerits(final SubLObject quality) {
        final SubLObject score = pph_method_quality_score(quality);
        return (SubLObject)(score.isInteger() ? Numbers.subtract(Sequences.length(pph_types.$pph_valid_method_qualities$.getGlobalValue()), number_utilities.f_1X(score)) : pph_types.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 13349L)
    public static SubLObject pph_valid_typeP(final SubLObject v_object) {
        return list_utilities.sublisp_boolean(list_utilities.tree_find(v_object, pph_types.$pph_type_tree$.getGlobalValue(), (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 13506L)
    public static SubLObject pph_valid_method_qualityP(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, pph_types.$pph_valid_method_qualities$.getGlobalValue(), (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 13695L)
    public static SubLObject paraphrase_test(final SubLObject type_key) {
        return list_utilities.alist_lookup(pph_types.$paraphrase_tests$.getGlobalValue(), type_key, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 13874L)
    public static SubLObject pph_methods_for_type(final SubLObject type) {
        return pph_type_entries(type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 14070L)
    public static SubLObject pph_identify_type(final SubLObject v_object) {
        return pph_identify_type_int(v_object, (SubLObject)pph_types.$list27, (SubLObject)pph_types.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 14169L)
    public static SubLObject pph_identify_type_int(final SubLObject v_object, final SubLObject untried_types, SubLObject identified_types) {
        if (pph_types.NIL == untried_types) {
            return identified_types;
        }
        SubLObject type = (SubLObject)pph_types.NIL;
        SubLObject more_types = (SubLObject)pph_types.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(untried_types, untried_types, (SubLObject)pph_types.$list28);
        type = untried_types.first();
        final SubLObject current = more_types = untried_types.rest();
        if (type.isCons() && type.first().isSymbol() && type.rest().isInteger()) {
            type = type.first();
        }
        final SubLObject test = paraphrase_test(type);
        final SubLObject object_passes_testP = pph_object_has_typeP(v_object, type);
        final SubLObject sub_types = (SubLObject)((pph_types.NIL != object_passes_testP) ? pph_subtypes(type) : pph_types.NIL);
        if (pph_types.NIL != object_passes_testP) {
            identified_types = (SubLObject)ConsesLow.cons(type, identified_types);
        }
        if (pph_types.NIL != object_passes_testP) {
            if (pph_types.NIL == sub_types) {
                if (pph_types.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_types.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_types.T, (SubLObject)pph_types.$str29$___S___passed_test__S_for_termina, v_object, test, type, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED);
                }
            }
            else if (pph_types.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_types.THREE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_types.T, (SubLObject)pph_types.$str30$___S___passed_test__S_for_non_ter, v_object, test, type, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED);
            }
            return pph_identify_type_int(v_object, sub_types, identified_types);
        }
        if (pph_types.NIL != more_types) {
            if (pph_types.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_types.THREE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_types.T, (SubLObject)pph_types.$str31$___S___failed_test__S_for_non_fin, v_object, test, type, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED);
            }
            return pph_identify_type_int(v_object, more_types, identified_types);
        }
        if (pph_types.NIL != identified_types) {
            if (pph_types.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_types.THREE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_types.T, (SubLObject)pph_types.$str32$___S___failed_test__S_for_final_t, v_object, test, type, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED);
            }
            if (pph_types.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_types.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_types.T, (SubLObject)pph_types.$str33$___S___judged_to_be_non_terminal_, v_object, identified_types.first(), (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED);
            }
            return identified_types;
        }
        final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_types.$str10$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_types.ONE_INTEGER), pph_types.$str11$__, format_nil.format_nil_a_no_copy((SubLObject)pph_types.$str34$___S___does_not_pass_top_level_te) });
        pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(v_object, test));
        return (SubLObject)pph_types.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 15882L)
    public static SubLObject pph_object_has_typeP(final SubLObject v_object, final SubLObject type) {
        final SubLObject test = paraphrase_test(type);
        return (SubLObject)((pph_types.NIL != Symbols.fboundp(test)) ? Functions.funcall(test, v_object) : pph_types.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 16031L)
    public static SubLObject pph_paraphrasable_objectP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_types.NIL != cycl_grammar.cycl_term_p(v_object) || v_object.isList() || v_object.isAtom());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 16447L)
    public static SubLObject pph_collection_denoting_natP(final SubLObject naut) {
        final SubLObject fn = cycl_utilities.nat_functor(naut);
        return pph_utilities.pph_isaP(fn, pph_types.$const35$CollectionDenotingFunction, (SubLObject)pph_types.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 16589L)
    public static SubLObject pph_nl_tagged_termP(final SubLObject naut) {
        return parsing_utilities.nl_tagged_termP(naut);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 16693L)
    public static SubLObject pph_set_nautP(final SubLObject naut) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_utilities.nat_functor(naut).eql(pph_types.$const36$TheSetOf) && pph_types.NIL != el_utilities.el_formula_p(cycl_utilities.nat_arg2(naut, (SubLObject)pph_types.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 16821L)
    public static SubLObject pph_exponent_nautP(final SubLObject naut) {
        return formula_pattern_match.formula_matches_pattern(naut, (SubLObject)pph_types.$list37);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 16942L)
    public static SubLObject pph_unicode_naut_p(final SubLObject naut) {
        return unicode_nauts.unicode_naut_p(naut, (SubLObject)pph_types.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 17242L)
    public static SubLObject pph_date_p(final SubLObject naut) {
        return subl_promotions.memberP(cycl_utilities.nat_functor(naut), pph_types.$pph_date_denoting_functions$.getGlobalValue(), (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 17345L)
    public static SubLObject pph_year_p(final SubLObject naut) {
        return formula_pattern_match.formula_matches_pattern(naut, (SubLObject)pph_types.$list39);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 17460L)
    public static SubLObject pph_month_p(final SubLObject naut) {
        return formula_pattern_match.formula_matches_pattern(naut, (SubLObject)pph_types.$list40);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 17575L)
    public static SubLObject pph_day_p(final SubLObject naut) {
        return formula_pattern_match.formula_matches_pattern(naut, (SubLObject)pph_types.$list41);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 17708L)
    public static SubLObject pph_time_p(final SubLObject naut) {
        return date_utilities.time_p(naut);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 17768L)
    public static SubLObject pph_universal_with_atomic_scopeP(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)pph_types.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_domain_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ans = (SubLObject)SubLObjectFactory.makeBoolean(pph_types.NIL != pph_syntactic_universal_p(obj) && pph_types.NIL != cycl_grammar.cycl_atomic_sentence_p(cycl_utilities.formula_arg2(obj, (SubLObject)pph_types.UNPROVIDED)));
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 18018L)
    public static SubLObject pph_nautP(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg0 = obj.first();
        final SubLObject ans = (SubLObject)SubLObjectFactory.makeBoolean(pph_types.NIL != el_utilities.el_formula_p(obj) && pph_types.NIL != ((pph_types.NIL != forts.fort_p(arg0)) ? fort_types_interface.non_predicate_functionP(arg0) : pph_utilities.pph_isaP(arg0, pph_types.$const42$Function_Denotational, pph_vars.$pph_domain_mt$.getDynamicValue(thread))));
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 18282L)
    public static SubLObject ccf_bnode_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_types.NIL != el_utilities.el_formula_p(v_object) && pph_types.NIL != formula_pattern_match.formula_matches_pattern(v_object, (SubLObject)pph_types.$list43));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 18448L)
    public static SubLObject pph_cycl_sentenceP(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg0 = obj.first();
        final SubLObject ans = (SubLObject)SubLObjectFactory.makeBoolean(pph_types.NIL != el_utilities.el_formula_p(obj) && (pph_types.NIL != fort_types_interface.predicateP(arg0) || pph_types.NIL != cycl_variables.el_varP(arg0) || pph_types.NIL != ((pph_types.NIL != forts.fort_p(arg0)) ? fort_types_interface.sentential_relation_p(arg0) : pph_utilities.pph_isaP(arg0, pph_types.$const44$TruthFunction, pph_vars.$pph_domain_mt$.getDynamicValue(thread)))));
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 18768L)
    public static SubLObject pph_coordination_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_types.NIL != el_utilities.el_conjunction_p(obj) || pph_types.NIL != el_utilities.el_disjunction_p(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 18878L)
    public static SubLObject pph_syntactic_universal_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_types.NIL != el_utilities.el_universal_p(obj) && pph_types.NIL != cycl_variables.el_varP(cycl_utilities.formula_arg1(obj, (SubLObject)pph_types.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 19001L)
    public static SubLObject pph_atomic_sentenceP(final SubLObject obj) {
        return fort_types_interface.predicateP(obj.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 19077L)
    public static SubLObject pph_cycl_symbolP(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(obj.isSymbol() && pph_types.NIL != Symbols.fboundp(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 19161L)
    public static SubLObject pph_lexified_nartP(final SubLObject obj) {
        if (pph_types.NIL == nart_handles.nart_p(obj)) {
            return (SubLObject)pph_types.NIL;
        }
        if (pph_types.NIL != lexification_utilities.lexifiedP(obj, (SubLObject)pph_types.NIL)) {
            return (SubLObject)pph_types.T;
        }
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(obj, pph_types.$const45$rewriteOf, (SubLObject)pph_types.TWO_INTEGER, (SubLObject)pph_types.ONE_INTEGER, (SubLObject)pph_types.$kw46$TRUE);
        SubLObject rewrite = (SubLObject)pph_types.NIL;
        rewrite = cdolist_list_var.first();
        while (pph_types.NIL != cdolist_list_var) {
            if (pph_types.NIL != lexification_utilities.lexifiedP(rewrite, (SubLObject)pph_types.NIL)) {
                return (SubLObject)pph_types.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            rewrite = cdolist_list_var.first();
        }
        return (SubLObject)pph_types.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 19459L)
    public static SubLObject pph_non_cycl_symbolP(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(obj.isSymbol() && pph_types.NIL == Symbols.fboundp(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 19557L)
    public static SubLObject cyc_const_trueP(final SubLObject v_object) {
        return Equality.eq(v_object, pph_types.$const47$True);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 19627L)
    public static SubLObject cyc_const_falseP(final SubLObject v_object) {
        return Equality.eq(v_object, pph_types.$const48$False);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 19700L)
    public static SubLObject pph_rel_variableP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && pph_types.NIL != cycl_variables.el_varP(v_object.first()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 19900L)
    public static SubLObject pph_simple_negation_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_types.NIL != el_utilities.el_negation_p(v_object) && pph_types.NIL != el_utilities.groundP(cycl_utilities.formula_arg1(v_object, (SubLObject)pph_types.UNPROVIDED), (SubLObject)pph_types.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 20025L)
    public static SubLObject pph_rmp_sentenceP(final SubLObject asent) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        return pph_reln_has_expansionP(pred, (SubLObject)pph_types.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 20164L)
    public static SubLObject pph_reln_has_expansionP(final SubLObject reln, SubLObject mt) {
        if (mt == pph_types.UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)pph_types.NIL;
        if (pph_types.NIL != kb_indexing_datastructures.indexed_term_p(reln)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                ans = kb_mapping_utilities.some_pred_value(reln, pph_types.$const49$expansion, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 20402L)
    public static SubLObject pph_specified_scope_sentenceP(final SubLObject formula) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_types.NIL != el_utilities.el_formula_p(formula) && pph_types.NIL != el_utilities.formula_arityE(formula, (SubLObject)pph_types.THREE_INTEGER, (SubLObject)pph_types.UNPROVIDED) && pph_types.NIL != kb_indexing_datastructures.indexed_term_p(cycl_utilities.formula_arg1(formula, (SubLObject)pph_types.UNPROVIDED)) && pph_types.NIL != pph_methods_formulas.specified_wide_scope_argnum(cycl_utilities.formula_operator(formula)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 20645L)
    public static SubLObject pph_cf_implicationP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_types.NIL != constant_handles.valid_constantP(pph_types.$const50$cfImplies, (SubLObject)pph_types.UNPROVIDED) && pph_types.NIL != el_utilities.el_formula_with_operator_p(v_object, pph_types.$const50$cfImplies));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 20791L)
    public static SubLObject pph_cff_exprP(final SubLObject v_object) {
        return el_utilities.el_formula_with_operator_p(v_object, pph_types.$const51$compositeFieldFormat);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 20900L)
    public static SubLObject pph_script_expP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_types.NIL != constant_handles.valid_constantP(pph_types.$const52$ScriptPredicate, (SubLObject)pph_types.UNPROVIDED) && pph_types.NIL != el_utilities.el_formula_with_operator_p(v_object, pph_types.$const49$expansion) && pph_types.NIL != pph_utilities.pph_isaP(cycl_utilities.formula_arg1(v_object, (SubLObject)pph_types.UNPROVIDED), pph_types.$const52$ScriptPredicate, (SubLObject)pph_types.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 21105L)
    public static SubLObject pph_nth_exprP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_types.NIL != pph_formulaP(v_object) && pph_types.NIL != conses_high.member(v_object.first(), (SubLObject)pph_types.$list53, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 21260L)
    public static SubLObject pph_skolem_termP(final SubLObject obj) {
        return term.fast_skolem_natP(obj);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 21380L)
    public static SubLObject pph_gpeP(final SubLObject fort) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_types.NIL == pph_utilities.pph_isaP(fort, pph_types.$const54$Collection, (SubLObject)pph_types.UNPROVIDED) && pph_types.NIL != pph_utilities.pph_isaP(fort, pph_types.$const55$GeopoliticalEntity, pph_types.$const56$InferencePSC));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 21523L)
    public static SubLObject pph_cityP(final SubLObject fort) {
        return pph_utilities.pph_isaP(fort, pph_types.$const57$City, pph_types.$const56$InferencePSC);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 21606L)
    public static SubLObject pph_us_cityP(final SubLObject fort) {
        return pph_utilities.pph_isaP(fort, pph_types.$const58$USCity, pph_types.$const56$InferencePSC);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 21692L)
    public static SubLObject pph_non_us_cityP(final SubLObject city) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_types.NIL == pph_us_cityP(city));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 21769L)
    public static SubLObject pph_hypotheticalP(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_types.NIL != pph_vars.$pph_handle_hypotheticalsP$.getDynamicValue(thread) && pph_types.NIL != pph_utilities.pph_removal_ask_boolean((SubLObject)ConsesLow.list(pph_types.$const59$hypotheticalTerm, constant), pph_types.$const56$InferencePSC));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 21992L)
    public static SubLObject pph_lexical_wordP(final SubLObject v_object) {
        return lexicon_accessors.quick_lexical_wordP(v_object, (SubLObject)pph_types.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 22209L)
    public static SubLObject pph_universal_dateP(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_types.NIL != pph_utilities.pph_environment_search((SubLObject)pph_types.$kw60$UNIVERSAL_DATE) && pph_types.NIL != numeric_date_utilities.universal_date_p(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 22414L)
    public static SubLObject pph_universal_secondP(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_types.NIL != pph_utilities.pph_environment_search((SubLObject)pph_types.$kw61$UNIVERSAL_SECOND) && pph_types.NIL != numeric_date_utilities.universal_second_p(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 22625L)
    public static SubLObject pph_formulaP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)pph_types.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)pph_types.$sym62$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(pph_types.$const63$EverythingPSC, thread);
            ans = (SubLObject)SubLObjectFactory.makeBoolean(pph_types.NIL != el_utilities.el_formulaP(v_object) || pph_types.NIL != term.nautP(v_object, (SubLObject)pph_types.UNPROVIDED) || pph_types.NIL != pph_utilities.pph_isaP(v_object, pph_types.$const64$TruthValue, (SubLObject)pph_types.UNPROVIDED));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 22896L)
    public static SubLObject pph_rop_expressionP(final SubLObject v_object) {
        return pph_rop_natP(v_object.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 23077L)
    public static SubLObject pph_rop_natP(final SubLObject cycl) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_types.NIL != collection_defns.cycl_formulaP(cycl) && cycl_utilities.formula_operator(cycl).eql(pph_types.$const65$TheResultOfParsing));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 23210L)
    public static SubLObject pph_subcollection_relation_nautP(final SubLObject naut) {
        return pph_subcol_fnP(cycl_utilities.nat_function(naut));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 23313L)
    public static SubLObject pph_the_collection_of_natP(final SubLObject nat) {
        return Equality.eql(cycl_utilities.nat_functor(nat), pph_types.$const66$TheCollectionOf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 23473L)
    public static SubLObject initialize_pph_subcol_fns() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        set.clear_set(pph_types.$pph_subcol_fns$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)pph_types.$sym62$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(pph_types.$const63$EverythingPSC, thread);
            final SubLObject node_var = pph_types.$const67$SubcollectionRelationFunction;
            final SubLObject _prev_bind_0_$2 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_1_$3 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(pph_types.$const68$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$4 = node_var;
                    final SubLObject deck_type = (SubLObject)pph_types.$kw71$STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$3 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = (SubLObject)pph_types.NIL;
                            final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind((pph_types.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((pph_types.NIL != tv_var) ? pph_types.$sym72$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                if (pph_types.NIL != tv_var && pph_types.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && pph_types.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql((SubLObject)pph_types.$kw73$ERROR)) {
                                        sbhl_paranoia.sbhl_error((SubLObject)pph_types.ONE_INTEGER, (SubLObject)pph_types.$str74$_A_is_not_a__A, tv_var, (SubLObject)pph_types.$sym75$SBHL_TRUE_TV_P, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)pph_types.$kw76$CERROR)) {
                                        sbhl_paranoia.sbhl_cerror((SubLObject)pph_types.ONE_INTEGER, (SubLObject)pph_types.$str77$continue_anyway, (SubLObject)pph_types.$str74$_A_is_not_a__A, tv_var, (SubLObject)pph_types.$sym75$SBHL_TRUE_TV_P, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)pph_types.$kw78$WARN)) {
                                        Errors.warn((SubLObject)pph_types.$str74$_A_is_not_a__A, tv_var, (SubLObject)pph_types.$sym75$SBHL_TRUE_TV_P);
                                    }
                                    else {
                                        Errors.warn((SubLObject)pph_types.$str79$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror((SubLObject)pph_types.$str77$continue_anyway, (SubLObject)pph_types.$str74$_A_is_not_a__A, tv_var, (SubLObject)pph_types.$sym75$SBHL_TRUE_TV_P);
                                    }
                                }
                                final SubLObject _prev_bind_0_$5 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$5 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(pph_types.$const68$isa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(pph_types.$const68$isa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(pph_types.$const68$isa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)pph_types.NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(pph_types.$const68$isa)), thread);
                                    if (pph_types.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || pph_types.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)pph_types.UNPROVIDED))) {
                                        final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$6 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$12 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(pph_types.$const68$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)pph_types.NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$4, (SubLObject)pph_types.UNPROVIDED);
                                            while (pph_types.NIL != node_var_$4) {
                                                final SubLObject tt_node_var = node_var_$4;
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(pph_types.$const68$isa));
                                                SubLObject module_var = (SubLObject)pph_types.NIL;
                                                module_var = cdolist_list_var.first();
                                                while (pph_types.NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$7 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((pph_types.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(pph_types.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                        if (pph_types.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)pph_types.UNPROVIDED));
                                                            if (pph_types.NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(pph_types.$const68$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)pph_types.UNPROVIDED));
                                                                if (pph_types.NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); pph_types.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (pph_types.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$16;
                                                                                for (iteration_state_$16 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); pph_types.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$16); iteration_state_$16 = dictionary_contents.do_dictionary_contents_next(iteration_state_$16)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$16);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (pph_types.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$9 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (pph_types.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject fn;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_types.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_types.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    fn = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (pph_types.NIL != set_contents.do_set_contents_element_validP(state, fn) && pph_types.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fn, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(fn, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        set.set_add(fn, pph_types.$pph_subcol_fns$.getDynamicValue(thread));
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject fn2 = (SubLObject)pph_types.NIL;
                                                                                                fn2 = csome_list_var.first();
                                                                                                while (pph_types.NIL != csome_list_var) {
                                                                                                    if (pph_types.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fn2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(fn2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        set.set_add(fn2, pph_types.$pph_subcol_fns$.getDynamicValue(thread));
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    fn2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)pph_types.$str80$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$9, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$16);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$8, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)pph_types.FIVE_INTEGER, (SubLObject)pph_types.$str81$attempting_to_bind_direction_link, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED);
                                                            }
                                                            if (pph_types.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)pph_types.UNPROVIDED))) {
                                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                SubLObject instance_tuple = (SubLObject)pph_types.NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (pph_types.NIL != csome_list_var2) {
                                                                    SubLObject current;
                                                                    final SubLObject datum = current = instance_tuple;
                                                                    SubLObject link_node = (SubLObject)pph_types.NIL;
                                                                    SubLObject mt2 = (SubLObject)pph_types.NIL;
                                                                    SubLObject tv2 = (SubLObject)pph_types.NIL;
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_types.$list82);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_types.$list82);
                                                                    mt2 = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_types.$list82);
                                                                    tv2 = current.first();
                                                                    current = current.rest();
                                                                    if (pph_types.NIL == current) {
                                                                        if (pph_types.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                            final SubLObject _prev_bind_0_$10 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                if (pph_types.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$11 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                        if (pph_types.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject fn;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_types.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_types.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                fn = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (pph_types.NIL != set_contents.do_set_contents_element_validP(state, fn) && pph_types.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fn, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(fn, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    set.set_add(fn, pph_types.$pph_subcol_fns$.getDynamicValue(thread));
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var_$20 = sol;
                                                                                            SubLObject fn2 = (SubLObject)pph_types.NIL;
                                                                                            fn2 = csome_list_var_$20.first();
                                                                                            while (pph_types.NIL != csome_list_var_$20) {
                                                                                                if (pph_types.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fn2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(fn2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    set.set_add(fn2, pph_types.$pph_subcol_fns$.getDynamicValue(thread));
                                                                                                }
                                                                                                csome_list_var_$20 = csome_list_var_$20.rest();
                                                                                                fn2 = csome_list_var_$20.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)pph_types.$str80$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$11, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$10, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_types.$list82);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                }
                                                            }
                                                        }
                                                        else if (pph_types.NIL != obsolete.cnat_p(node, (SubLObject)pph_types.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$21;
                                                            final SubLObject new_list = cdolist_list_var_$21 = ((pph_types.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(pph_types.$const68$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_types.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(pph_types.$const68$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_types.UNPROVIDED)));
                                                            SubLObject generating_fn = (SubLObject)pph_types.NIL;
                                                            generating_fn = cdolist_list_var_$21.first();
                                                            while (pph_types.NIL != cdolist_list_var_$21) {
                                                                final SubLObject _prev_bind_0_$12 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                    if (pph_types.NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject fn3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)pph_types.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); pph_types.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            fn3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (pph_types.NIL != set_contents.do_set_contents_element_validP(state2, fn3) && pph_types.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fn3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(fn3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                set.set_add(fn3, pph_types.$pph_subcol_fns$.getDynamicValue(thread));
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        SubLObject csome_list_var3 = sol2;
                                                                        SubLObject fn4 = (SubLObject)pph_types.NIL;
                                                                        fn4 = csome_list_var3.first();
                                                                        while (pph_types.NIL != csome_list_var3) {
                                                                            if (pph_types.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fn4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(fn4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                set.set_add(fn4, pph_types.$pph_subcol_fns$.getDynamicValue(thread));
                                                                            }
                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                            fn4 = csome_list_var3.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)pph_types.$str80$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$12, thread);
                                                                }
                                                                cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                                                                generating_fn = cdolist_list_var_$21.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$7, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$7, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                }
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(pph_types.$const68$isa)));
                                                SubLObject module_var2 = (SubLObject)pph_types.NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (pph_types.NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$13 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$8 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((pph_types.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(pph_types.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var_$4);
                                                        if (pph_types.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)pph_types.UNPROVIDED));
                                                            if (pph_types.NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)pph_types.UNPROVIDED));
                                                                if (pph_types.NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); pph_types.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (pph_types.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                            final SubLObject _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                SubLObject iteration_state_$17;
                                                                                for (iteration_state_$17 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); pph_types.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$17); iteration_state_$17 = dictionary_contents.do_dictionary_contents_next(iteration_state_$17)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$17);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (pph_types.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol3 = link_nodes4;
                                                                                            if (pph_types.NIL != set.set_p(sol3)) {
                                                                                                final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                SubLObject basis_object3;
                                                                                                SubLObject state3;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)pph_types.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); pph_types.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if (pph_types.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && pph_types.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)pph_types.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)pph_types.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol3.isList()) {
                                                                                                SubLObject csome_list_var4 = sol3;
                                                                                                SubLObject node_vars_link_node2 = (SubLObject)pph_types.NIL;
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                while (pph_types.NIL != csome_list_var4) {
                                                                                                    if (pph_types.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)pph_types.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)pph_types.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var4 = csome_list_var4.rest();
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)pph_types.$str80$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$15, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$17);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$14, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)pph_types.FIVE_INTEGER, (SubLObject)pph_types.$str81$attempting_to_bind_direction_link, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (pph_types.NIL != obsolete.cnat_p(node2, (SubLObject)pph_types.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$22;
                                                            final SubLObject new_list2 = cdolist_list_var_$22 = ((pph_types.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_types.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_types.UNPROVIDED)));
                                                            SubLObject generating_fn2 = (SubLObject)pph_types.NIL;
                                                            generating_fn2 = cdolist_list_var_$22.first();
                                                            while (pph_types.NIL != cdolist_list_var_$22) {
                                                                final SubLObject _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                    if (pph_types.NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)pph_types.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); pph_types.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if (pph_types.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && pph_types.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)pph_types.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)pph_types.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol4.isList()) {
                                                                        SubLObject csome_list_var5 = sol4;
                                                                        SubLObject node_vars_link_node4 = (SubLObject)pph_types.NIL;
                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                        while (pph_types.NIL != csome_list_var5) {
                                                                            if (pph_types.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)pph_types.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)pph_types.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var5 = csome_list_var5.rest();
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)pph_types.$str80$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$16, thread);
                                                                }
                                                                cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                                                                generating_fn2 = cdolist_list_var_$22.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$8, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$13, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                }
                                                node_var_$4 = deck.deck_pop(recur_deck);
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$12, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$6, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$6, thread);
                                        }
                                    }
                                    else {
                                        sbhl_paranoia.sbhl_warn((SubLObject)pph_types.TWO_INTEGER, (SubLObject)pph_types.$str83$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)pph_types.UNPROVIDED)), (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED);
                                    }
                                }
                                finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$5, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$5, thread);
                                }
                            }
                            finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$4, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$4, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_types.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$3, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_types.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$3, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$2, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        set.set_add(pph_types.$const84$CollectionSubsetFn, pph_types.$pph_subcol_fns$.getDynamicValue(thread));
        return (SubLObject)pph_types.$kw85$INITIALIZED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 23735L)
    public static SubLObject pph_subcol_fnP(final SubLObject fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_types.NIL != set.set_emptyP(pph_types.$pph_subcol_fns$.getDynamicValue(thread))) {
            initialize_pph_subcol_fns();
        }
        return set.set_memberP(fn, pph_types.$pph_subcol_fns$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 23935L)
    public static SubLObject pph_subcollection_relation_naut_has_relational_nounP(final SubLObject subcol_naut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)pph_types.NIL;
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(subcol_naut, (SubLObject)pph_types.$list86);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (pph_types.NIL != success) {
            final SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)pph_types.$sym87$VALUE, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED);
            final SubLObject bin_pred = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)pph_types.$sym88$BIN_PRED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED);
            final SubLObject genl = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)pph_types.$sym89$GENL, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED);
            final SubLObject fn = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)pph_types.$sym90$FN, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED);
            if (pph_types.NIL != kb_indexing_datastructures.indexed_term_p(bin_pred)) {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    if (pph_types.NIL == ans) {
                        SubLObject csome_list_var = pph_methods_lexicon.pph_arg_in_reln_preds((SubLObject)pph_types.UNPROVIDED);
                        SubLObject arg_in_reln_pred = (SubLObject)pph_types.NIL;
                        arg_in_reln_pred = csome_list_var.first();
                        while (pph_types.NIL == ans && pph_types.NIL != csome_list_var) {
                            final SubLObject denot_arg = lexicon_utilities.denotatum_arg_of_pred_cached(arg_in_reln_pred);
                            if (denot_arg.isInteger() && pph_types.NIL != kb_mapping_utilities.some_pred_value(bin_pred, arg_in_reln_pred, denot_arg, (SubLObject)pph_types.$kw46$TRUE)) {
                                ans = (SubLObject)pph_types.T;
                            }
                            csome_list_var = csome_list_var.rest();
                            arg_in_reln_pred = csome_list_var.first();
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 24789L)
    public static SubLObject pph_phrase_nautP(final SubLObject naut) {
        return pph_functions.pph_phrase_fnP(cycl_utilities.nat_function(naut), (SubLObject)pph_types.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 24919L)
    public static SubLObject pph_expandible_phrase_nautP(final SubLObject naut, SubLObject mt) {
        if (mt == pph_types.UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_types.NIL != pph_phrase_nautP(naut) && pph_types.NIL != pph_term_has_expansionP(cycl_utilities.nat_functor(naut), mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 25152L)
    public static SubLObject pph_term_has_expansionP_internal(final SubLObject v_term, SubLObject mt) {
        if (mt == pph_types.UNPROVIDED) {
            mt = (SubLObject)pph_types.$kw92$ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (mt == pph_types.$kw92$ANY) {
            return kb_mapping_utilities.some_pred_value_in_any_mt(v_term, pph_types.$const49$expansion, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED);
        }
        SubLObject ans = (SubLObject)pph_types.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ans = kb_mapping_utilities.some_pred_value_in_relevant_mts(v_term, pph_types.$const49$expansion, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 25152L)
    public static SubLObject pph_term_has_expansionP(final SubLObject v_term, SubLObject mt) {
        if (mt == pph_types.UNPROVIDED) {
            mt = (SubLObject)pph_types.$kw92$ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_types.NIL;
        if (pph_types.NIL == v_memoization_state) {
            return pph_term_has_expansionP_internal(v_term, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_types.$sym91$PPH_TERM_HAS_EXPANSION_, (SubLObject)pph_types.UNPROVIDED);
        if (pph_types.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_types.$sym91$PPH_TERM_HAS_EXPANSION_, (SubLObject)pph_types.TWO_INTEGER, (SubLObject)pph_types.NIL, (SubLObject)pph_types.EQUAL, (SubLObject)pph_types.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_types.$sym91$PPH_TERM_HAS_EXPANSION_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_types.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_types.NIL;
            collision = cdolist_list_var.first();
            while (pph_types.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pph_types.NIL != cached_args && pph_types.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_term_has_expansionP_internal(v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_term, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 25505L)
    public static SubLObject pph_phrase_naut_for_string(final SubLObject string) {
        return el_utilities.make_unary_formula(pph_functions.bestnlphraseofstringfn(), string.isString() ? unicode_nauts.utf8_string_to_cycl_safe_string(string) : string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 25693L)
    public static SubLObject pph_verb_semtrans_matcherP(final SubLObject cycl, SubLObject mt) {
        if (mt == pph_types.UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        return list_utilities.sublisp_boolean(pph_matching_verb_semtrans_assertions(cycl, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 25844L)
    public static SubLObject pph_matching_verb_semtrans_assertions_internal(final SubLObject cycl, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ans = set.new_set((SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED);
        final SubLObject existential_vars = set.new_set((SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED);
        SubLObject core_cycl;
        for (core_cycl = cycl; pph_types.NIL != el_utilities.el_existential_p(core_cycl); core_cycl = cycl_utilities.formula_arg2(core_cycl, (SubLObject)pph_types.UNPROVIDED)) {
            set.set_add(cycl_utilities.formula_arg1(core_cycl, (SubLObject)pph_types.UNPROVIDED), existential_vars);
        }
        if (pph_types.NIL != pph_potential_verb_semtrans_matcherP(core_cycl, mt)) {
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(core_cycl, (SubLObject)pph_types.$kw94$IGNORE);
            SubLObject conjunct = (SubLObject)pph_types.NIL;
            conjunct = cdolist_list_var.first();
            while (pph_types.NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                final SubLObject success = formula_pattern_match.formula_matches_pattern(conjunct, (SubLObject)pph_types.$list95);
                final SubLObject v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (pph_types.NIL != success) {
                    final SubLObject arg2 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)pph_types.$sym96$ARG2, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED);
                    final SubLObject arg3 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)pph_types.$sym97$ARG1, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED);
                    if (pph_types.NIL != set.set_memberP(arg3, existential_vars)) {
                        if (pph_types.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_types.TWO_INTEGER)) {
                            format_nil.force_format((SubLObject)pph_types.T, (SubLObject)pph_types.$str98$Found_head_binding_conjunct_____S, conjunct, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED);
                        }
                        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            final SubLObject pred_var = pph_types.$const99$verbSemTrans_Canonical;
                            if (pph_types.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(arg2, (SubLObject)pph_types.FOUR_INTEGER, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(arg2, (SubLObject)pph_types.FOUR_INTEGER, pred_var);
                                SubLObject done_var = (SubLObject)pph_types.NIL;
                                final SubLObject token_var = (SubLObject)pph_types.NIL;
                                while (pph_types.NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                    if (pph_types.NIL != valid) {
                                        SubLObject final_index_iterator = (SubLObject)pph_types.NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)pph_types.$kw100$GAF, (SubLObject)pph_types.$kw46$TRUE, (SubLObject)pph_types.NIL);
                                            SubLObject done_var_$32 = (SubLObject)pph_types.NIL;
                                            final SubLObject token_var_$33 = (SubLObject)pph_types.NIL;
                                            while (pph_types.NIL == done_var_$32) {
                                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$33);
                                                final SubLObject valid_$34 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$33.eql(gaf));
                                                if (pph_types.NIL != valid_$34) {
                                                    if (pph_types.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_types.ONE_INTEGER)) {
                                                        format_nil.force_format((SubLObject)pph_types.T, (SubLObject)pph_types.$str101$Found_matching_vST_Canonical_____, gaf, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED);
                                                    }
                                                    set.set_add(gaf, ans);
                                                }
                                                done_var_$32 = (SubLObject)SubLObjectFactory.makeBoolean(pph_types.NIL == valid_$34);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_types.T, thread);
                                                final SubLObject _values = Values.getValuesAsVector();
                                                if (pph_types.NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                                            }
                                        }
                                    }
                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(pph_types.NIL == valid);
                                }
                            }
                        }
                        finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                conjunct = cdolist_list_var.first();
            }
        }
        return pph_utilities.pph_stable_sort_assertions(Sort.sort(set.set_element_list(ans), (SubLObject)pph_types.$sym102$PPH_FRAME_ARITY__, (SubLObject)pph_types.$sym103$GAF_ARG3), (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 25844L)
    public static SubLObject pph_matching_verb_semtrans_assertions(final SubLObject cycl, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_types.NIL;
        if (pph_types.NIL == v_memoization_state) {
            return pph_matching_verb_semtrans_assertions_internal(cycl, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_types.$sym93$PPH_MATCHING_VERB_SEMTRANS_ASSERTIONS, (SubLObject)pph_types.UNPROVIDED);
        if (pph_types.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_types.$sym93$PPH_MATCHING_VERB_SEMTRANS_ASSERTIONS, (SubLObject)pph_types.TWO_INTEGER, (SubLObject)pph_types.$int104$24, (SubLObject)pph_types.EQUAL, (SubLObject)pph_types.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_types.$sym93$PPH_MATCHING_VERB_SEMTRANS_ASSERTIONS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(cycl, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_types.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_types.NIL;
            collision = cdolist_list_var.first();
            while (pph_types.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (cycl.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pph_types.NIL != cached_args && pph_types.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_matching_verb_semtrans_assertions_internal(cycl, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(cycl, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 26849L)
    public static SubLObject pph_potential_verb_semtrans_matcherP(final SubLObject cycl, final SubLObject mt) {
        return el_utilities.el_conjunction_p(cycl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 26960L)
    public static SubLObject pph_frame_arity_G(final SubLObject frame1, final SubLObject frame2) {
        return Numbers.numG(lexicon_accessors.subcat_frame_arity(frame1), lexicon_accessors.subcat_frame_arity(frame2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 27118L)
    public static SubLObject pph_fn_to_argP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isList() && v_object.first().eql(pph_types.$const105$FunctionToArg) && conses_high.second(v_object).isInteger() && pph_types.NIL != fort_types_interface.predicateP(conses_high.third(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 27299L)
    public static SubLObject pph_fn_to_arg_0P(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && pph_types.NIL != pph_fn_to_argP(v_object.first()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 27426L)
    public static SubLObject pph_kappa_exprP(final SubLObject v_object) {
        if (v_object.isList() && v_object.first().eql(pph_types.$const106$Kappa)) {
            final SubLObject vars = conses_high.second(v_object);
            final SubLObject formula = conses_high.third(v_object);
            return (SubLObject)SubLObjectFactory.makeBoolean(pph_types.NIL != vars && pph_types.NIL == list_utilities.find_if_not(Symbols.symbol_function((SubLObject)pph_types.$sym107$EL_VAR_), vars, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED) && pph_types.NIL != pph_formulaP(formula));
        }
        return (SubLObject)pph_types.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 27707L)
    public static SubLObject pph_open_db_fieldP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_types.NIL != pph_db_fieldP(v_object) && pph_types.NIL != list_utilities.cons_tree_find_if(Symbols.symbol_function((SubLObject)pph_types.$sym107$EL_VAR_), v_object, (SubLObject)pph_types.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 27988L)
    public static SubLObject pph_ground_db_fieldP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_types.NIL != pph_db_fieldP(v_object) && pph_types.NIL == list_utilities.cons_tree_find_if(Symbols.symbol_function((SubLObject)pph_types.$sym107$EL_VAR_), v_object, (SubLObject)pph_types.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 28204L)
    public static SubLObject pph_db_fieldP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)pph_types.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)pph_types.$sym62$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(pph_types.$const63$EverythingPSC, thread);
            ans = (SubLObject)SubLObjectFactory.makeBoolean((pph_types.NIL != kb_indexing_datastructures.indexed_term_p(v_object) && pph_types.NIL != kb_mapping_utilities.some_pred_value(v_object, pph_types.$const108$fieldCodes, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED)) || pph_types.NIL != conses_high.member(cycl_utilities.formula_operator(v_object), (SubLObject)pph_types.$list109, (SubLObject)pph_types.UNPROVIDED, (SubLObject)pph_types.UNPROVIDED));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 28527L)
    public static SubLObject pph_db_entry_fnP(final SubLObject v_object) {
        final SubLObject lispy_form = function_terms.nart_to_naut(v_object);
        return el_utilities.el_formula_with_operator_p(lispy_form, pph_types.$const110$DBEntryFn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-types.lisp", position = 28743L)
    public static SubLObject pph_image_urlP(final SubLObject v_object, SubLObject mt) {
        if (mt == pph_types.UNPROVIDED) {
            mt = (SubLObject)pph_types.NIL;
        }
        return formula_pattern_match.formula_matches_pattern(v_object, (SubLObject)pph_types.$list111);
    }
    
    public static SubLObject declare_pph_types_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "get_paraphrase_methods", "GET-PARAPHRASE-METHODS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_register_method", "PPH-REGISTER-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_deregister_method", "PPH-DEREGISTER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_method_info", "PPH-METHOD-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_register_method_info", "PPH-REGISTER-METHOD-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_deregister_method_info", "PPH-DEREGISTER-METHOD-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_type_entries", "PPH-TYPE-ENTRIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_subtypes", "PPH-SUBTYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_type_transition_demerits", "PPH-TYPE-TRANSITION-DEMERITS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_sort_methods", "PPH-SORT-METHODS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_sort_methods_by_demerits", "PPH-SORT-METHODS-BY-DEMERITS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_higher_method_qualityP", "PPH-HIGHER-METHOD-QUALITY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_method_quality_score", "PPH-METHOD-QUALITY-SCORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_method_quality_demerits", "PPH-METHOD-QUALITY-DEMERITS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_valid_typeP", "PPH-VALID-TYPE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_valid_method_qualityP", "PPH-VALID-METHOD-QUALITY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "paraphrase_test", "PARAPHRASE-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_methods_for_type", "PPH-METHODS-FOR-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_identify_type", "PPH-IDENTIFY-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_identify_type_int", "PPH-IDENTIFY-TYPE-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_object_has_typeP", "PPH-OBJECT-HAS-TYPE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_paraphrasable_objectP", "PPH-PARAPHRASABLE-OBJECT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_collection_denoting_natP", "PPH-COLLECTION-DENOTING-NAT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_nl_tagged_termP", "PPH-NL-TAGGED-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_set_nautP", "PPH-SET-NAUT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_exponent_nautP", "PPH-EXPONENT-NAUT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_unicode_naut_p", "PPH-UNICODE-NAUT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_date_p", "PPH-DATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_year_p", "PPH-YEAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_month_p", "PPH-MONTH-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_day_p", "PPH-DAY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_time_p", "PPH-TIME-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_universal_with_atomic_scopeP", "PPH-UNIVERSAL-WITH-ATOMIC-SCOPE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_nautP", "PPH-NAUT?", 1, 0, false);
        new $pph_nautP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "ccf_bnode_p", "CCF-BNODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_cycl_sentenceP", "PPH-CYCL-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_coordination_p", "PPH-COORDINATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_syntactic_universal_p", "PPH-SYNTACTIC-UNIVERSAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_atomic_sentenceP", "PPH-ATOMIC-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_cycl_symbolP", "PPH-CYCL-SYMBOL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_lexified_nartP", "PPH-LEXIFIED-NART?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_non_cycl_symbolP", "PPH-NON-CYCL-SYMBOL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "cyc_const_trueP", "CYC-CONST-TRUE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "cyc_const_falseP", "CYC-CONST-FALSE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_rel_variableP", "PPH-REL-VARIABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_simple_negation_p", "PPH-SIMPLE-NEGATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_rmp_sentenceP", "PPH-RMP-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_reln_has_expansionP", "PPH-RELN-HAS-EXPANSION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_specified_scope_sentenceP", "PPH-SPECIFIED-SCOPE-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_cf_implicationP", "PPH-CF-IMPLICATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_cff_exprP", "PPH-CFF-EXPR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_script_expP", "PPH-SCRIPT-EXP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_nth_exprP", "PPH-NTH-EXPR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_skolem_termP", "PPH-SKOLEM-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_gpeP", "PPH-GPE?", 1, 0, false);
        new $pph_gpeP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_cityP", "PPH-CITY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_us_cityP", "PPH-US-CITY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_non_us_cityP", "PPH-NON-US-CITY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_hypotheticalP", "PPH-HYPOTHETICAL?", 1, 0, false);
        new $pph_hypotheticalP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_lexical_wordP", "PPH-LEXICAL-WORD?", 1, 0, false);
        new $pph_lexical_wordP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_universal_dateP", "PPH-UNIVERSAL-DATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_universal_secondP", "PPH-UNIVERSAL-SECOND?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_formulaP", "PPH-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_rop_expressionP", "PPH-ROP-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_rop_natP", "PPH-ROP-NAT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_subcollection_relation_nautP", "PPH-SUBCOLLECTION-RELATION-NAUT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_the_collection_of_natP", "PPH-THE-COLLECTION-OF-NAT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "initialize_pph_subcol_fns", "INITIALIZE-PPH-SUBCOL-FNS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_subcol_fnP", "PPH-SUBCOL-FN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_subcollection_relation_naut_has_relational_nounP", "PPH-SUBCOLLECTION-RELATION-NAUT-HAS-RELATIONAL-NOUN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_phrase_nautP", "PPH-PHRASE-NAUT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_expandible_phrase_nautP", "PPH-EXPANDIBLE-PHRASE-NAUT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_term_has_expansionP_internal", "PPH-TERM-HAS-EXPANSION?-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_term_has_expansionP", "PPH-TERM-HAS-EXPANSION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_phrase_naut_for_string", "PPH-PHRASE-NAUT-FOR-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_verb_semtrans_matcherP", "PPH-VERB-SEMTRANS-MATCHER?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_matching_verb_semtrans_assertions_internal", "PPH-MATCHING-VERB-SEMTRANS-ASSERTIONS-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_matching_verb_semtrans_assertions", "PPH-MATCHING-VERB-SEMTRANS-ASSERTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_potential_verb_semtrans_matcherP", "PPH-POTENTIAL-VERB-SEMTRANS-MATCHER?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_frame_arity_G", "PPH-FRAME-ARITY->", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_fn_to_argP", "PPH-FN-TO-ARG?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_fn_to_arg_0P", "PPH-FN-TO-ARG-0?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_kappa_exprP", "PPH-KAPPA-EXPR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_open_db_fieldP", "PPH-OPEN-DB-FIELD?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_ground_db_fieldP", "PPH-GROUND-DB-FIELD?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_db_fieldP", "PPH-DB-FIELD?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_db_entry_fnP", "PPH-DB-ENTRY-FN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_types", "pph_image_urlP", "PPH-IMAGE-URL?", 1, 1, false);
        return (SubLObject)pph_types.NIL;
    }
    
    public static SubLObject init_pph_types_file() {
        pph_types.$pph_type_tree$ = SubLFiles.deflexical("*PPH-TYPE-TREE*", (SubLObject)pph_types.$list0);
        pph_types.$paraphrase_tests$ = SubLFiles.deflexical("*PARAPHRASE-TESTS*", (SubLObject)pph_types.$list1);
        pph_types.$pph_type_method_hash$ = SubLFiles.deflexical("*PPH-TYPE-METHOD-HASH*", (pph_types.NIL != Symbols.boundp((SubLObject)pph_types.$sym2$_PPH_TYPE_METHOD_HASH_)) ? pph_types.$pph_type_method_hash$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)pph_types.$int3$256, Symbols.symbol_function((SubLObject)pph_types.EQ), (SubLObject)pph_types.UNPROVIDED));
        pph_types.$pph_valid_method_qualities$ = SubLFiles.deflexical("*PPH-VALID-METHOD-QUALITIES*", (SubLObject)pph_types.$list4);
        pph_types.$pph_date_denoting_functions$ = SubLFiles.deflexical("*PPH-DATE-DENOTING-FUNCTIONS*", (SubLObject)pph_types.$list38);
        pph_types.$pph_subcol_fns$ = SubLFiles.defparameter("*PPH-SUBCOL-FNS*", set.new_set(Symbols.symbol_function((SubLObject)pph_types.EQUAL), (SubLObject)pph_types.UNPROVIDED));
        return (SubLObject)pph_types.NIL;
    }
    
    public static SubLObject setup_pph_types_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)pph_types.$sym2$_PPH_TYPE_METHOD_HASH_);
        access_macros.register_macro_helper((SubLObject)pph_types.$sym17$PPH_METHOD_INFO, (SubLObject)pph_types.$sym18$SUSPENDING_PARAPHRASE_METHOD);
        access_macros.register_macro_helper((SubLObject)pph_types.$sym20$PPH_REGISTER_METHOD_INFO, (SubLObject)pph_types.$sym18$SUSPENDING_PARAPHRASE_METHOD);
        access_macros.register_macro_helper((SubLObject)pph_types.$sym22$PPH_DEREGISTER_METHOD_INFO, (SubLObject)pph_types.$sym18$SUSPENDING_PARAPHRASE_METHOD);
        memoization_state.note_memoized_function((SubLObject)pph_types.$sym91$PPH_TERM_HAS_EXPANSION_);
        memoization_state.note_memoized_function((SubLObject)pph_types.$sym93$PPH_MATCHING_VERB_SEMTRANS_ASSERTIONS);
        return (SubLObject)pph_types.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_pph_types_file();
    }
    
    @Override
	public void initializeVariables() {
        init_pph_types_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_pph_types_file();
    }
    
    static {
        me = (SubLFile)new pph_types();
        pph_types.$pph_type_tree$ = null;
        pph_types.$paraphrase_tests$ = null;
        pph_types.$pph_type_method_hash$ = null;
        pph_types.$pph_valid_method_qualities$ = null;
        pph_types.$pph_date_denoting_functions$ = null;
        pph_types.$pph_subcol_fns$ = null;
        $list0 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("->"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LIST"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)pph_types.THREE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)pph_types.THREE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NART"), (SubLObject)pph_types.THREE_INTEGER), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("NUMBER"), (SubLObject)SubLObjectFactory.makeKeyword("SYMBOL"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("->"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NAUT"), (SubLObject)pph_types.THREE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CYCL-SENTENCE"), (SubLObject)pph_types.THREE_INTEGER), (SubLObject)SubLObjectFactory.makeKeyword("ROP-EXPRESSION"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SYMBOL"), (SubLObject)SubLObjectFactory.makeSymbol("->"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)SubLObjectFactory.makeKeyword("KEYWORD"), (SubLObject)SubLObjectFactory.makeKeyword("CYCL-SYMBOL"), (SubLObject)SubLObjectFactory.makeKeyword("NON-CYCL-SYMBOL"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("->"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("LEXIFIED-VARIABLE"), (SubLObject)pph_types.THREE_INTEGER))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYCL-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("->"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ATOMIC-SENTENCE"), (SubLObject)SubLObjectFactory.makeKeyword("NEGATION"), (SubLObject)SubLObjectFactory.makeKeyword("IMPLICATION"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("EXISTENTIAL"), (SubLObject)pph_types.THREE_INTEGER), (SubLObject)SubLObjectFactory.makeKeyword("UNIVERSAL"), (SubLObject)SubLObjectFactory.makeKeyword("COORDINATION"), (SubLObject)SubLObjectFactory.makeKeyword("CFF-EXPR"), (SubLObject)SubLObjectFactory.makeKeyword("CF-IMPLICATION"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEGATION"), (SubLObject)SubLObjectFactory.makeSymbol("->"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SIMPLE-NEGATION"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ATOMIC-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("->"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ISA-EXPR"), (SubLObject)SubLObjectFactory.makeKeyword("SCRIPT-EXPANSION"), (SubLObject)SubLObjectFactory.makeKeyword("RMP-SENTENCE"), (SubLObject)SubLObjectFactory.makeKeyword("ABNORMAL"), (SubLObject)SubLObjectFactory.makeKeyword("EXCEPTION"), (SubLObject)SubLObjectFactory.makeKeyword("NTH-EXPR"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COORDINATION"), (SubLObject)SubLObjectFactory.makeSymbol("->"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONJUNCTION"), (SubLObject)SubLObjectFactory.makeKeyword("DISJUNCTION"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RMP-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("->"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SPECIFIED-SCOPE-SENTENCE"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXISTENTIAL"), (SubLObject)SubLObjectFactory.makeSymbol("->"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERB-SEMTRANS-MATCHER"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("->"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRUE"), (SubLObject)SubLObjectFactory.makeKeyword("FALSE"), (SubLObject)SubLObjectFactory.makeKeyword("HYPOTHETICAL"), (SubLObject)SubLObjectFactory.makeKeyword("LEXICAL-WORD"), (SubLObject)SubLObjectFactory.makeKeyword("DISCOURSE-PARTICIPANT"), (SubLObject)SubLObjectFactory.makeKeyword("GEOPOLITICAL-ENTITY"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NART"), (SubLObject)SubLObjectFactory.makeSymbol("->"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("LEXIFIED-NART"), (SubLObject)pph_types.ONE_INTEGER), (SubLObject)SubLObjectFactory.makeKeyword("SKOLEM-TERM"), (SubLObject)SubLObjectFactory.makeKeyword("THE-COLLECTION-OF-NAT"), (SubLObject)SubLObjectFactory.makeKeyword("GEOPOLITICAL-ENTITY"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAUT"), (SubLObject)SubLObjectFactory.makeSymbol("->"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PHRASE-DENOTING-NAUT"), SubLObjectFactory.makeKeyword("DATE-NAUT"), SubLObjectFactory.makeKeyword("IMAGE-URL"), SubLObjectFactory.makeKeyword("COLLECTION-DENOTING-NAT"), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SKSI-SUPPORTED-EXTERNAL-TERM"), (SubLObject)pph_types.THREE_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("RESOURCE-WITH-URI"), (SubLObject)pph_types.THREE_INTEGER), SubLObjectFactory.makeKeyword("SET-NAUT"), SubLObjectFactory.makeKeyword("EXPONENT-NAUT"), SubLObjectFactory.makeKeyword("UNICODE-NAUT"), SubLObjectFactory.makeKeyword("FN-TO-ARG-0"), SubLObjectFactory.makeKeyword("KAPPA-EXPR"), SubLObjectFactory.makeKeyword("SKOLEM-TERM") })), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DATE-NAUT"), (SubLObject)SubLObjectFactory.makeSymbol("->"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("YEAR-NAUT"), (SubLObject)SubLObjectFactory.makeKeyword("MONTH-NAUT"), (SubLObject)SubLObjectFactory.makeKeyword("DAY-NAUT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COLLECTION-DENOTING-NAT"), (SubLObject)SubLObjectFactory.makeSymbol("->"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUBCOLLECTION-RELATION-NAUT"), (SubLObject)SubLObjectFactory.makeKeyword("THE-COLLECTION-OF-NAT"), (SubLObject)SubLObjectFactory.makeKeyword("NL-TAGGED-TERM"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUBCOLLECTION-RELATION-NAUT"), (SubLObject)SubLObjectFactory.makeSymbol("->"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RELATIONAL-NOUN-SUBCOLLECTION-NAUT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("->"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNIVERSAL-DATE"), (SubLObject)SubLObjectFactory.makeKeyword("UNIVERSAL-SECOND"), (SubLObject)SubLObjectFactory.makeKeyword("FLOAT"))) });
        $list1 = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("TRUE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-P")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SYMBOL"), (SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NON-CYCL-SYMBOL"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-NON-CYCL-SYMBOL?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SCRIPT-EXPANSION"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-SCRIPT-EXP?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NTH-EXPR"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-NTH-EXPR?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("LEXIFIED-VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-VAR-PREVIOUSLY-LEXIFIED?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NAUT"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-NAUT?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SKSI-SUPPORTED-EXTERNAL-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("SKSI-SUPPORTED-EXTERNAL-TERM?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("RESOURCE-WITH-URI"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-RESOURCE-WITH-URI?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DATE-NAUT"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-DATE-P")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("YEAR-NAUT"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-YEAR-P")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("MONTH-NAUT"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-MONTH-P")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DAY-NAUT"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-DAY-P")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("IMAGE-URL"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-IMAGE-URL?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SET-NAUT"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-SET-NAUT?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("EXPONENT-NAUT"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-EXPONENT-NAUT?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("UNICODE-NAUT"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-UNICODE-NAUT-P")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("PHRASE-DENOTING-NAUT"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-PHRASE-NAUT?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SUBCOLLECTION-RELATION-NAUT"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-SUBCOLLECTION-RELATION-NAUT?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("THE-COLLECTION-OF-NAT"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-THE-COLLECTION-OF-NAT?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("RELATIONAL-NOUN-SUBCOLLECTION-NAUT"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-SUBCOLLECTION-RELATION-NAUT-HAS-RELATIONAL-NOUN?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBERP")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("UNIVERSAL-DATE"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-UNIVERSAL-DATE?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("UNIVERSAL-SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-UNIVERSAL-SECOND?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FLOAT"), (SubLObject)SubLObjectFactory.makeSymbol("FLOATP")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CYCL-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-CYCL-SENTENCE?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ROP-EXPRESSION"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-ROP-EXPRESSION?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("REL-VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-REL-VARIABLE?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SKOLEM-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-SKOLEM-TERM?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("GEOPOLITICAL-ENTITY"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-GPE?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CITY"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-CITY?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("US-CITY"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-US-CITY?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NON-US-CITY"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-NON-US-CITY?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDP")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CYCL-SYMBOL"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-CYCL-SYMBOL?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ATOMIC-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-ATOMIC-SENTENCE?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NEGATION"), (SubLObject)SubLObjectFactory.makeSymbol("EL-NEGATION-P")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SIMPLE-NEGATION"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-SIMPLE-NEGATION-P")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("RMP-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-RMP-SENTENCE?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SPECIFIED-SCOPE-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-SPECIFIED-SCOPE-SENTENCE?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("IMPLICATION"), (SubLObject)SubLObjectFactory.makeSymbol("EL-IMPLICATION-P")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("EXISTENTIAL"), (SubLObject)SubLObjectFactory.makeSymbol("EL-EXISTENTIAL-P")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("UNIVERSAL"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-SYNTACTIC-UNIVERSAL-P")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("COORDINATION"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-COORDINATION-P")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CONJUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("EL-CONJUNCTION-P")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DISJUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("EL-DISJUNCTION-P")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("VERB-SEMTRANS-MATCHER"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-VERB-SEMTRANS-MATCHER?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NART"), (SubLObject)SubLObjectFactory.makeSymbol("NART-P")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("LEXIFIED-NART"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-LEXIFIED-NART?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("TRUE"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-CONST-TRUE?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FALSE"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-CONST-FALSE?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("HYPOTHETICAL"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-HYPOTHETICAL?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("LEXICAL-WORD"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-LEXICAL-WORD?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DISCOURSE-PARTICIPANT"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-DISCOURSE-PARTICIPANT-P")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("OTHER-CONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("VALID-CONSTANT?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("COLLECTION-DENOTING-NAT"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-COLLECTION-DENOTING-NAT?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NL-TAGGED-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-NL-TAGGED-TERM?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DB-FIELD"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-DB-FIELD?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("GROUND-DB-FIELD"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-GROUND-DB-FIELD?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("OPEN-DB-FIELD"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-OPEN-DB-FIELD?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("KAPPA-EXPR"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-KAPPA-EXPR?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FN-TO-ARG-0"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-FN-TO-ARG-0?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ABNORMAL"), (SubLObject)SubLObjectFactory.makeSymbol("EL-ABNORMAL-P")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("EXCEPTION"), (SubLObject)SubLObjectFactory.makeSymbol("EL-EXCEPTION-P")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CFF-EXPR"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-CFF-EXPR?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CF-IMPLICATION"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-CF-IMPLICATION?")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DB-ENTRY-FN"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-DB-ENTRY-FN?")) });
        $sym2$_PPH_TYPE_METHOD_HASH_ = SubLObjectFactory.makeSymbol("*PPH-TYPE-METHOD-HASH*");
        $int3$256 = SubLObjectFactory.makeInteger(256);
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FALLBACK"), (SubLObject)SubLObjectFactory.makeKeyword("DECENT"), (SubLObject)SubLObjectFactory.makeKeyword("BEST"));
        $str5$__Found__D_methods_for__S___S___ = SubLObjectFactory.makeString("~&Found ~D methods for ~S: ~S.~%");
        $str6$__Found_no_methods_for__S___ = SubLObjectFactory.makeString("~&Found no methods for ~S.~%");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-SYMBOL"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-QUALITY"));
        $str8$__Found_paraphrase_methods_for__S = SubLObjectFactory.makeString("~&Found paraphrase methods for ~S:~% ~S~%");
        $str9$__No_paraphrase_methods_found_for = SubLObjectFactory.makeString("~&No paraphrase methods found for ~S.~%");
        $str10$_PPH_error_level_ = SubLObjectFactory.makeString("(PPH error level ");
        $str11$__ = SubLObjectFactory.makeString(") ");
        $str12$___S_is_not_a_valid_paraphrase_ty = SubLObjectFactory.makeString("~&~S is not a valid paraphrase type.~%");
        $str13$___S_is_not_a_symbol___ = SubLObjectFactory.makeString("~&~S is not a symbol.~%");
        $str14$___S_is_not_a_valid_paraphrase_me = SubLObjectFactory.makeString("~&~S is not a valid paraphrase method quality.~%Must be in ~S.~%");
        $sym15$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $str16$___S_is_not_a_registered_method_f = SubLObjectFactory.makeString("~&~S is not a registered method for ~S.~%");
        $sym17$PPH_METHOD_INFO = SubLObjectFactory.makeSymbol("PPH-METHOD-INFO");
        $sym18$SUSPENDING_PARAPHRASE_METHOD = SubLObjectFactory.makeSymbol("SUSPENDING-PARAPHRASE-METHOD");
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOL"), (SubLObject)SubLObjectFactory.makeSymbol("QUALITY"));
        $sym20$PPH_REGISTER_METHOD_INFO = SubLObjectFactory.makeSymbol("PPH-REGISTER-METHOD-INFO");
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("QUALITY"));
        $sym22$PPH_DEREGISTER_METHOD_INFO = SubLObjectFactory.makeSymbol("PPH-DEREGISTER-METHOD-INFO");
        $sym23$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym24$PPH_HIGHER_METHOD_QUALITY_ = SubLObjectFactory.makeSymbol("PPH-HIGHER-METHOD-QUALITY?");
        $sym25$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $sym26$_ = SubLObjectFactory.makeSymbol("<");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OBJECT"));
        $list28 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("MORE-TYPES"));
        $str29$___S___passed_test__S_for_termina = SubLObjectFactory.makeString("~&~S~% passed test ~S for terminal type ~S.~%");
        $str30$___S___passed_test__S_for_non_ter = SubLObjectFactory.makeString("~&~S~% passed test ~S for non-terminal type ~S.~%");
        $str31$___S___failed_test__S_for_non_fin = SubLObjectFactory.makeString("~&~S~% failed test ~S for non-final type ~S.~%");
        $str32$___S___failed_test__S_for_final_t = SubLObjectFactory.makeString("~&~S~% failed test ~S for final type ~S.~%");
        $str33$___S___judged_to_be_non_terminal_ = SubLObjectFactory.makeString("~&~S~% judged to be non-terminal type ~S.~%");
        $str34$___S___does_not_pass_top_level_te = SubLObjectFactory.makeString("~&~S~% does not pass top-level test ~S.~%");
        $const35$CollectionDenotingFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionDenotingFunction"));
        $const36$TheSetOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf"));
        $list37 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExponentFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $list38 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CenturyFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DecadeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuarterFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HourFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MinuteFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SecondFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MilliSecondFn")) });
        $list39 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P")));
        $list40 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-YEAR-P")));
        $list41 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-MONTH-P")));
        $const42$Function_Denotational = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Function-Denotational"));
        $list43 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SchemaObjectFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CCF-SDB-Bnode-CMLS")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"));
        $const44$TruthFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TruthFunction"));
        $const45$rewriteOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rewriteOf"));
        $kw46$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $const47$True = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"));
        $const48$False = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False"));
        $const49$expansion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("expansion"));
        $const50$cfImplies = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cfImplies"));
        $const51$compositeFieldFormat = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("compositeFieldFormat"));
        $const52$ScriptPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ScriptPredicate"));
        $list53 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")));
        $const54$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
        $const55$GeopoliticalEntity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeopoliticalEntity"));
        $const56$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $const57$City = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("City"));
        $const58$USCity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("USCity"));
        $const59$hypotheticalTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hypotheticalTerm"));
        $kw60$UNIVERSAL_DATE = SubLObjectFactory.makeKeyword("UNIVERSAL-DATE");
        $kw61$UNIVERSAL_SECOND = SubLObjectFactory.makeKeyword("UNIVERSAL-SECOND");
        $sym62$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const63$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const64$TruthValue = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TruthValue"));
        $const65$TheResultOfParsing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheResultOfParsing"));
        $const66$TheCollectionOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCollectionOf"));
        $const67$SubcollectionRelationFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionRelationFunction"));
        $const68$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw69$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw70$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw71$STACK = SubLObjectFactory.makeKeyword("STACK");
        $sym72$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw73$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str74$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym75$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw76$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str77$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw78$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str79$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $str80$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str81$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $list82 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("LINK-NODE"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("MT"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("TV"));
        $str83$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $const84$CollectionSubsetFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn"));
        $kw85$INITIALIZED = SubLObjectFactory.makeKeyword("INITIALIZED");
        $list86 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationFromTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationFromFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("GENL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BIN-PRED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")));
        $sym87$VALUE = SubLObjectFactory.makeSymbol("VALUE");
        $sym88$BIN_PRED = SubLObjectFactory.makeSymbol("BIN-PRED");
        $sym89$GENL = SubLObjectFactory.makeSymbol("GENL");
        $sym90$FN = SubLObjectFactory.makeSymbol("FN");
        $sym91$PPH_TERM_HAS_EXPANSION_ = SubLObjectFactory.makeSymbol("PPH-TERM-HAS-EXPANSION?");
        $kw92$ANY = SubLObjectFactory.makeKeyword("ANY");
        $sym93$PPH_MATCHING_VERB_SEMTRANS_ASSERTIONS = SubLObjectFactory.makeSymbol("PPH-MATCHING-VERB-SEMTRANS-ASSERTIONS");
        $kw94$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $list95 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2")));
        $sym96$ARG2 = SubLObjectFactory.makeSymbol("ARG2");
        $sym97$ARG1 = SubLObjectFactory.makeSymbol("ARG1");
        $str98$Found_head_binding_conjunct_____S = SubLObjectFactory.makeString("Found head-binding conjunct:~% ~S");
        $const99$verbSemTrans_Canonical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("verbSemTrans-Canonical"));
        $kw100$GAF = SubLObjectFactory.makeKeyword("GAF");
        $str101$Found_matching_vST_Canonical_____ = SubLObjectFactory.makeString("Found matching vST-Canonical:~% ~S");
        $sym102$PPH_FRAME_ARITY__ = SubLObjectFactory.makeSymbol("PPH-FRAME-ARITY->");
        $sym103$GAF_ARG3 = SubLObjectFactory.makeSymbol("GAF-ARG3");
        $int104$24 = SubLObjectFactory.makeInteger(24);
        $const105$FunctionToArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FunctionToArg"));
        $const106$Kappa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Kappa"));
        $sym107$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $const108$fieldCodes = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldCodes"));
        $list109 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SchemaLF")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SchemaPF")));
        $const110$DBEntryFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DBEntryFn"));
        $list111 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ImageURLFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
    }
    
    public static final class $pph_nautP$UnaryFunction extends UnaryFunction
    {
        public $pph_nautP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PPH-NAUT?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return pph_types.pph_nautP(arg1);
        }
    }
    
    public static final class $pph_gpeP$UnaryFunction extends UnaryFunction
    {
        public $pph_gpeP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PPH-GPE?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return pph_types.pph_gpeP(arg1);
        }
    }
    
    public static final class $pph_hypotheticalP$UnaryFunction extends UnaryFunction
    {
        public $pph_hypotheticalP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PPH-HYPOTHETICAL?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return pph_types.pph_hypotheticalP(arg1);
        }
    }
    
    public static final class $pph_lexical_wordP$UnaryFunction extends UnaryFunction
    {
        public $pph_lexical_wordP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PPH-LEXICAL-WORD?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return pph_types.pph_lexical_wordP(arg1);
        }
    }
}

/*

	Total time: 1253 ms
	
*/