package com.cyc.cycjava.cycl.sksi.sks_indexing;


import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_browser_utilities;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_predicate_indexing;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.function.Supplier;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_predicate_indexing.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class sksi_sks_predicate_indexing extends SubLTranslatedFile {
    public static final SubLFile me = new sksi_sks_predicate_indexing();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_predicate_indexing";

    public static final String myFingerPrint = "92a8ebdd651e7dac51db4acf13cbb66a99961ad71e3c2252136bddea99288641";

    // defconstant
    public static final SubLSymbol $dtp_sksi_supported_predicate_cache_entry$ = makeSymbol("*DTP-SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY*");



    // Internal Constants
    public static final SubLSymbol SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY = makeSymbol("SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY");

    public static final SubLSymbol SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY_P = makeSymbol("SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY-P");

    public static final SubLList $list2 = list(makeSymbol("MEANING-SENTENCE"), makeSymbol("QUERY-FORM"), makeSymbol("MT"), makeSymbol("COUNT"), makeSymbol("MODULES"));

    public static final SubLList $list3 = list(makeKeyword("MEANING-SENTENCE"), makeKeyword("QUERY-FORM"), makeKeyword("MT"), makeKeyword("COUNT"), makeKeyword("MODULES"));

    public static final SubLList $list4 = list(makeSymbol("SKSI-PRED-ENTRY-MEANING-SENTENCE"), makeSymbol("SKSI-PRED-ENTRY-QUERY-FORM"), makeSymbol("SKSI-PRED-ENTRY-MT"), makeSymbol("SKSI-PRED-ENTRY-COUNT"), makeSymbol("SKSI-PRED-ENTRY-MODULES"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-SKSI-PRED-ENTRY-MEANING-SENTENCE"), makeSymbol("_CSETF-SKSI-PRED-ENTRY-QUERY-FORM"), makeSymbol("_CSETF-SKSI-PRED-ENTRY-MT"), makeSymbol("_CSETF-SKSI-PRED-ENTRY-COUNT"), makeSymbol("_CSETF-SKSI-PRED-ENTRY-MODULES"));

    public static final SubLSymbol PRINT_SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY = makeSymbol("PRINT-SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY");

    public static final SubLSymbol SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY-P"));

    private static final SubLSymbol SKSI_PRED_ENTRY_MEANING_SENTENCE = makeSymbol("SKSI-PRED-ENTRY-MEANING-SENTENCE");

    private static final SubLSymbol _CSETF_SKSI_PRED_ENTRY_MEANING_SENTENCE = makeSymbol("_CSETF-SKSI-PRED-ENTRY-MEANING-SENTENCE");

    private static final SubLSymbol SKSI_PRED_ENTRY_QUERY_FORM = makeSymbol("SKSI-PRED-ENTRY-QUERY-FORM");

    private static final SubLSymbol _CSETF_SKSI_PRED_ENTRY_QUERY_FORM = makeSymbol("_CSETF-SKSI-PRED-ENTRY-QUERY-FORM");

    private static final SubLSymbol SKSI_PRED_ENTRY_MT = makeSymbol("SKSI-PRED-ENTRY-MT");

    private static final SubLSymbol _CSETF_SKSI_PRED_ENTRY_MT = makeSymbol("_CSETF-SKSI-PRED-ENTRY-MT");

    private static final SubLSymbol SKSI_PRED_ENTRY_COUNT = makeSymbol("SKSI-PRED-ENTRY-COUNT");

    private static final SubLSymbol _CSETF_SKSI_PRED_ENTRY_COUNT = makeSymbol("_CSETF-SKSI-PRED-ENTRY-COUNT");

    private static final SubLSymbol SKSI_PRED_ENTRY_MODULES = makeSymbol("SKSI-PRED-ENTRY-MODULES");

    private static final SubLSymbol _CSETF_SKSI_PRED_ENTRY_MODULES = makeSymbol("_CSETF-SKSI-PRED-ENTRY-MODULES");











    private static final SubLString $str24$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY = makeSymbol("MAKE-SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY");





    private static final SubLSymbol $sym29$VISIT_DEFSTRUCT_OBJECT_SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY_METHO = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY-METHOD");

    private static final SubLString $str30$__PCE__s__s__s__s_ = makeString("#<PCE:~s:~s:~s:~s>");

    private static final SubLSymbol $sksi_supported_predicate_cache$ = makeSymbol("*SKSI-SUPPORTED-PREDICATE-CACHE*");

    private static final SubLSymbol $sym32$SKSI_TERM___W__CONSTANTS_BY_NAME_ON = makeSymbol("SKSI-TERM-<-W/-CONSTANTS-BY-NAME-ON");

    private static final SubLSymbol SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY_MT = makeSymbol("SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY-MT");



    public static SubLObject sksi_supported_predicate_cache_entry_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sksi_supported_predicate_cache_entry(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sksi_supported_predicate_cache_entry_p(final SubLObject v_object) {
        return v_object.getClass() == sksi_sks_predicate_indexing.$sksi_supported_predicate_cache_entry_native.class ? T : NIL;
    }

    public static SubLObject sksi_pred_entry_meaning_sentence(final SubLObject v_object) {
        assert NIL != sksi_supported_predicate_cache_entry_p(v_object) : "sksi_sks_predicate_indexing.sksi_supported_predicate_cache_entry_p(v_object) " + "CommonSymbols.NIL != sksi_sks_predicate_indexing.sksi_supported_predicate_cache_entry_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject sksi_pred_entry_query_form(final SubLObject v_object) {
        assert NIL != sksi_supported_predicate_cache_entry_p(v_object) : "sksi_sks_predicate_indexing.sksi_supported_predicate_cache_entry_p(v_object) " + "CommonSymbols.NIL != sksi_sks_predicate_indexing.sksi_supported_predicate_cache_entry_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject sksi_pred_entry_mt(final SubLObject v_object) {
        assert NIL != sksi_supported_predicate_cache_entry_p(v_object) : "sksi_sks_predicate_indexing.sksi_supported_predicate_cache_entry_p(v_object) " + "CommonSymbols.NIL != sksi_sks_predicate_indexing.sksi_supported_predicate_cache_entry_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject sksi_pred_entry_count(final SubLObject v_object) {
        assert NIL != sksi_supported_predicate_cache_entry_p(v_object) : "sksi_sks_predicate_indexing.sksi_supported_predicate_cache_entry_p(v_object) " + "CommonSymbols.NIL != sksi_sks_predicate_indexing.sksi_supported_predicate_cache_entry_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject sksi_pred_entry_modules(final SubLObject v_object) {
        assert NIL != sksi_supported_predicate_cache_entry_p(v_object) : "sksi_sks_predicate_indexing.sksi_supported_predicate_cache_entry_p(v_object) " + "CommonSymbols.NIL != sksi_sks_predicate_indexing.sksi_supported_predicate_cache_entry_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject _csetf_sksi_pred_entry_meaning_sentence(final SubLObject v_object, final SubLObject value) {
        assert NIL != sksi_supported_predicate_cache_entry_p(v_object) : "sksi_sks_predicate_indexing.sksi_supported_predicate_cache_entry_p(v_object) " + "CommonSymbols.NIL != sksi_sks_predicate_indexing.sksi_supported_predicate_cache_entry_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sksi_pred_entry_query_form(final SubLObject v_object, final SubLObject value) {
        assert NIL != sksi_supported_predicate_cache_entry_p(v_object) : "sksi_sks_predicate_indexing.sksi_supported_predicate_cache_entry_p(v_object) " + "CommonSymbols.NIL != sksi_sks_predicate_indexing.sksi_supported_predicate_cache_entry_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sksi_pred_entry_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != sksi_supported_predicate_cache_entry_p(v_object) : "sksi_sks_predicate_indexing.sksi_supported_predicate_cache_entry_p(v_object) " + "CommonSymbols.NIL != sksi_sks_predicate_indexing.sksi_supported_predicate_cache_entry_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sksi_pred_entry_count(final SubLObject v_object, final SubLObject value) {
        assert NIL != sksi_supported_predicate_cache_entry_p(v_object) : "sksi_sks_predicate_indexing.sksi_supported_predicate_cache_entry_p(v_object) " + "CommonSymbols.NIL != sksi_sks_predicate_indexing.sksi_supported_predicate_cache_entry_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_sksi_pred_entry_modules(final SubLObject v_object, final SubLObject value) {
        assert NIL != sksi_supported_predicate_cache_entry_p(v_object) : "sksi_sks_predicate_indexing.sksi_supported_predicate_cache_entry_p(v_object) " + "CommonSymbols.NIL != sksi_sks_predicate_indexing.sksi_supported_predicate_cache_entry_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject make_sksi_supported_predicate_cache_entry(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new sksi_sks_predicate_indexing.$sksi_supported_predicate_cache_entry_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($MEANING_SENTENCE)) {
                _csetf_sksi_pred_entry_meaning_sentence(v_new, current_value);
            } else
                if (pcase_var.eql($QUERY_FORM)) {
                    _csetf_sksi_pred_entry_query_form(v_new, current_value);
                } else
                    if (pcase_var.eql($MT)) {
                        _csetf_sksi_pred_entry_mt(v_new, current_value);
                    } else
                        if (pcase_var.eql($COUNT)) {
                            _csetf_sksi_pred_entry_count(v_new, current_value);
                        } else
                            if (pcase_var.eql($MODULES)) {
                                _csetf_sksi_pred_entry_modules(v_new, current_value);
                            } else {
                                Errors.error($str24$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sksi_supported_predicate_cache_entry(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $MEANING_SENTENCE, sksi_pred_entry_meaning_sentence(obj));
        funcall(visitor_fn, obj, $SLOT, $QUERY_FORM, sksi_pred_entry_query_form(obj));
        funcall(visitor_fn, obj, $SLOT, $MT, sksi_pred_entry_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $COUNT, sksi_pred_entry_count(obj));
        funcall(visitor_fn, obj, $SLOT, $MODULES, sksi_pred_entry_modules(obj));
        funcall(visitor_fn, obj, $END, MAKE_SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sksi_supported_predicate_cache_entry_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sksi_supported_predicate_cache_entry(obj, visitor_fn);
    }

    public static SubLObject new_sksi_supported_predicate_cache_entry(final SubLObject meaning_sentence, final SubLObject query_form, final SubLObject mt, final SubLObject count, final SubLObject module) {
        final SubLObject entry = make_sksi_supported_predicate_cache_entry(UNPROVIDED);
        _csetf_sksi_pred_entry_meaning_sentence(entry, meaning_sentence);
        _csetf_sksi_pred_entry_query_form(entry, query_form);
        _csetf_sksi_pred_entry_mt(entry, mt);
        _csetf_sksi_pred_entry_count(entry, count);
        _csetf_sksi_pred_entry_modules(entry, list(module));
        return entry;
    }

    public static SubLObject sksi_supported_predicate_cache_entry_meaning_sentence(final SubLObject entry) {
        return sksi_pred_entry_meaning_sentence(entry);
    }

    public static SubLObject sksi_supported_predicate_cache_entry_query_form(final SubLObject entry) {
        return sksi_pred_entry_query_form(entry);
    }

    public static SubLObject sksi_supported_predicate_cache_entry_mt(final SubLObject entry) {
        return sksi_pred_entry_mt(entry);
    }

    public static SubLObject sksi_supported_predicate_cache_entry_count(final SubLObject entry) {
        return sksi_pred_entry_count(entry);
    }

    public static SubLObject sksi_supported_predicate_cache_entry_modules(final SubLObject entry) {
        return sksi_pred_entry_modules(entry);
    }

    public static SubLObject print_sksi_supported_predicate_cache_entry(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str30$__PCE__s__s__s__s_, new SubLObject[]{ sksi_supported_predicate_cache_entry_query_form(v_object), sksi_supported_predicate_cache_entry_mt(v_object), sksi_supported_predicate_cache_entry_count(v_object), sksi_supported_predicate_cache_entry_modules(v_object) });
        return NIL;
    }

    public static SubLObject clear_sksi_supported_predicate_cache() {
        return dictionary.clear_dictionary($sksi_supported_predicate_cache$.getGlobalValue());
    }

    public static SubLObject sksi_supported_predicate_cache_lookup(final SubLObject pred) {
        return dictionary.dictionary_lookup_without_values($sksi_supported_predicate_cache$.getGlobalValue(), pred, NIL);
    }

    public static SubLObject sksi_supported_predicate_browsing_registeredP() {
        return makeBoolean(NIL == dictionary.dictionary_empty_p($sksi_supported_predicate_cache$.getGlobalValue()));
    }

    public static SubLObject sksi_supported_predicate_cache_enter(final SubLObject pred, final SubLObject entry) {
        final SubLObject new_query_form = sksi_supported_predicate_cache_entry_query_form(entry);
        final SubLObject new_modules = sksi_supported_predicate_cache_entry_modules(entry);
        final SubLObject new_count = sksi_supported_predicate_cache_entry_count(entry);
        final SubLObject current_entries = sksi_supported_predicate_cache_entries_for_predicate_and_mt(pred, sksi_supported_predicate_cache_entry_mt(entry));
        SubLObject mergedP = NIL;
        if (NIL == mergedP) {
            SubLObject csome_list_var = current_entries;
            SubLObject current_entry = NIL;
            current_entry = csome_list_var.first();
            while ((NIL == mergedP) && (NIL != csome_list_var)) {
                final SubLObject current_query_form = sksi_supported_predicate_cache_entry_query_form(current_entry);
                final SubLObject current_modules = sksi_supported_predicate_cache_entry_modules(current_entry);
                if (NIL != sksi_sks_indexing_utilities.sksi_query_forms_unifyP(new_query_form, current_query_form)) {
                    _csetf_sksi_pred_entry_modules(current_entry, append(current_modules, new_modules));
                    _csetf_sksi_pred_entry_count(current_entry, sksi_external_browser_utilities.sksi_compute_count_for_external_browser_cache_entry_merge(sksi_pred_entry_count(current_entry), new_count));
                    mergedP = T;
                }
                csome_list_var = csome_list_var.rest();
                current_entry = csome_list_var.first();
            } 
        }
        if (NIL == mergedP) {
            dictionary_utilities.dictionary_add_to_value_sorted($sksi_supported_predicate_cache$.getGlobalValue(), pred, entry, $sym32$SKSI_TERM___W__CONSTANTS_BY_NAME_ON, SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY_MT);
        }
        return sksi_supported_predicate_cache_lookup(pred);
    }

    public static SubLObject sksi_supported_predicate_cache_remove(final SubLObject pred, final SubLObject entry, final SubLObject module, final SubLObject count) {
        final SubLObject entry_modules = sksi_supported_predicate_cache_entry_modules(entry);
        SubLObject removedP = NIL;
        if (NIL != subl_promotions.memberP(module, entry_modules, UNPROVIDED, UNPROVIDED)) {
            if (NIL != list_utilities.singletonP(entry_modules)) {
                dictionary_utilities.dictionary_delete_from_value($sksi_supported_predicate_cache$.getGlobalValue(), pred, entry, symbol_function(EQUALP), UNPROVIDED);
            } else {
                _csetf_sksi_pred_entry_modules(entry, remove(module, entry_modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                _csetf_sksi_pred_entry_count(entry, sksi_external_browser_utilities.sksi_compute_count_for_external_browser_cache_entry_demerge(sksi_pred_entry_count(entry), count));
            }
            removedP = T;
        }
        return removedP;
    }

    public static SubLObject sksi_supported_predicate_cache_entries_for_predicate(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject all_pred_entries = sksi_supported_predicate_cache_lookup(pred);
        if (NIL != hlmt.hlmt_p(mt)) {
            SubLObject all_pred_entries_for_mt = NIL;
            SubLObject cdolist_list_var = all_pred_entries;
            SubLObject entry = NIL;
            entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != genl_mts.genl_mtP(mt, sksi_supported_predicate_cache_entry_mt(entry), UNPROVIDED, UNPROVIDED)) {
                    all_pred_entries_for_mt = cons(entry, all_pred_entries_for_mt);
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            } 
            return nreverse(all_pred_entries_for_mt);
        }
        return all_pred_entries;
    }

    public static SubLObject sksi_supported_predicate_mt_list_for_pred(final SubLObject pred, SubLObject visible_mt) {
        if (visible_mt == UNPROVIDED) {
            visible_mt = NIL;
        }
        return list_utilities.fast_delete_duplicates(Mapping.mapcar(SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY_MT, sksi_supported_predicate_cache_entries_for_predicate(pred, visible_mt)), HLMT_EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sksi_supported_predicate_mt_count_pairs_for_predicate(final SubLObject predicate, SubLObject visible_mt) {
        if (visible_mt == UNPROVIDED) {
            visible_mt = NIL;
        }
        final SubLObject cache_entries = sksi_supported_predicate_cache_entries_for_predicate(predicate, visible_mt);
        SubLObject mt_count_pairs = NIL;
        SubLObject cdolist_list_var = cache_entries;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject mt = sksi_supported_predicate_cache_entry_mt(entry);
            if (NIL != sksi_sks_mt_indexing.content_mt_of_activated_external_sourceP(mt)) {
                SubLObject count = sksi_supported_predicate_cache_entry_count(entry);
                final SubLObject last_entry = mt_count_pairs.first();
                final SubLObject last_entry_mt = last_entry.first();
                final SubLObject last_entry_count = second(last_entry);
                if (mt.eql(last_entry_mt)) {
                    if (last_entry_count.isInteger()) {
                        if (count.isInteger()) {
                            count = add(count, last_entry_count);
                        } else {
                            count = last_entry_count;
                        }
                    }
                    mt_count_pairs = rplaca(mt_count_pairs, list(mt, count));
                } else {
                    mt_count_pairs = cons(list(mt, count), mt_count_pairs);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return nreverse(mt_count_pairs);
    }

    public static SubLObject sksi_supported_predicate_cache_entries_for_predicate_and_mt(final SubLObject predicate, final SubLObject mt) {
        final SubLObject cache_entries_for_pred = sksi_supported_predicate_cache_entries_for_predicate(predicate, UNPROVIDED);
        return list_utilities.find_all(mt, cache_entries_for_pred, HLMT_EQUAL, SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY_MT);
    }

    public static SubLObject gather_query_form_module_list_pairs_from_sksi_supported_predicate_cache_entries_for_predicate_and_mt(final SubLObject predicate, final SubLObject mt) {
        final SubLObject cache_entries_for_pred = sksi_supported_predicate_cache_entries_for_predicate(predicate, UNPROVIDED);
        SubLObject query_form_module_list_pairs = NIL;
        SubLObject cdolist_list_var = cache_entries_for_pred;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != hlmt.hlmt_equal(mt, sksi_supported_predicate_cache_entry_mt(entry))) {
                query_form_module_list_pairs = cons(list(sksi_supported_predicate_cache_entry_query_form(entry), sksi_supported_predicate_cache_entry_modules(entry)), query_form_module_list_pairs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return nreverse(query_form_module_list_pairs);
    }

    public static SubLObject gather_query_form_mt_module_list_pairs_from_sksi_supported_predicate_cache_entries_for_predicate(final SubLObject predicate) {
        final SubLObject cache_entries_for_pred = sksi_supported_predicate_cache_entries_for_predicate(predicate, UNPROVIDED);
        SubLObject query_form_module_list_pairs = NIL;
        SubLObject cdolist_list_var = cache_entries_for_pred;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != mt_relevance_macros.relevant_mtP(sksi_supported_predicate_cache_entry_mt(entry))) {
                query_form_module_list_pairs = cons(list(sksi_supported_predicate_cache_entry_query_form(entry), sksi_supported_predicate_cache_entry_mt(entry), sksi_supported_predicate_cache_entry_modules(entry)), query_form_module_list_pairs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return nreverse(query_form_module_list_pairs);
    }

    public static SubLObject gather_relevant_meaning_sentence_query_form_mt_module_list_tuples_from_sksi_supported_predicate_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject meaning_sentence_query_form_mt_module_list_tuples = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($sksi_supported_predicate_cache$.getGlobalValue())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entries = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != sksi_tva_utilities.sksi_gt_relevant_predP(pred)) {
                final SubLObject pred_tuples = gather_meaning_sentence_query_form_mt_module_list_tuples_from_sksi_supported_predicate_cache_entries(entries);
                meaning_sentence_query_form_mt_module_list_tuples = nconc(meaning_sentence_query_form_mt_module_list_tuples, pred_tuples);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return meaning_sentence_query_form_mt_module_list_tuples;
    }

    public static SubLObject gather_meaning_sentence_query_form_mt_module_list_tuples_from_sksi_supported_predicate_cache_entries(final SubLObject cache_entries) {
        SubLObject meaning_sentence_query_form_mt_module_list_tuples = NIL;
        SubLObject cdolist_list_var = cache_entries;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != mt_relevance_macros.relevant_mtP(sksi_supported_predicate_cache_entry_mt(entry))) {
                meaning_sentence_query_form_mt_module_list_tuples = cons(list(sksi_supported_predicate_cache_entry_meaning_sentence(entry), sksi_supported_predicate_cache_entry_query_form(entry), sksi_supported_predicate_cache_entry_mt(entry), sksi_supported_predicate_cache_entry_modules(entry)), meaning_sentence_query_form_mt_module_list_tuples);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return nreverse(meaning_sentence_query_form_mt_module_list_tuples);
    }

    public static SubLObject predicate_sksi_indexed_relevant_in_mtP(final SubLObject predicate) {
        final SubLObject cache_entries = sksi_supported_predicate_cache_entries_for_predicate(predicate, UNPROVIDED);
        SubLObject v_answer = NIL;
        if (NIL == v_answer) {
            SubLObject csome_list_var = cache_entries;
            SubLObject entry = NIL;
            entry = csome_list_var.first();
            while ((NIL == v_answer) && (NIL != csome_list_var)) {
                if (NIL != mt_relevance_macros.relevant_mtP(sksi_supported_predicate_cache_entry_mt(entry))) {
                    v_answer = T;
                }
                csome_list_var = csome_list_var.rest();
                entry = csome_list_var.first();
            } 
        }
        return v_answer;
    }

    public static SubLObject sksi_indexed_predicate_extent_count_in_relevant_mts(final SubLObject predicate) {
        final SubLObject cache_entries = sksi_supported_predicate_cache_entries_for_predicate(predicate, UNPROVIDED);
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = cache_entries;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != mt_relevance_macros.relevant_mtP(sksi_supported_predicate_cache_entry_mt(entry))) {
                final SubLObject entry_count = sksi_supported_predicate_cache_entry_count(entry);
                if (entry_count.isNumber()) {
                    count = add(count, entry_count);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return count;
    }

    public static SubLObject sksi_supported_predicateP(final SubLObject v_term) {
        if ((NIL != sksi_supported_predicate_browsing_registeredP()) && (NIL == sksi_kb_accessors.isa_logical_schemaP(v_term))) {
            return sksi_supported_predicate_cache_lookup(v_term);
        }
        return NIL;
    }

    public static SubLObject register_sksi_supported_predicates(final SubLObject pred_list, final SubLObject meaning_sentence, final SubLObject required_pattern, final SubLObject required_mt, final SubLObject count, final SubLObject module) {
        final SubLObject query_form = sksi_external_browser_utilities.sksi_create_query_form_from_required_pattern(required_pattern);
        if (NIL != query_form) {
            SubLObject cdolist_list_var = pred_list;
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != sksi_infrastructure_utilities.sksi_supported_predicate_type_p(pred, UNPROVIDED)) {
                    register_sksi_supported_predicate(pred, meaning_sentence, query_form, required_mt, count, module);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject register_sksi_supported_predicate(final SubLObject pred, final SubLObject meaning_sentence, final SubLObject query_form, final SubLObject required_mt, final SubLObject count, final SubLObject module) {
        final SubLObject cache_entry_query_form = make_el_formula(pred, cycl_utilities.formula_args(query_form, UNPROVIDED), UNPROVIDED);
        final SubLObject cache_entry = new_sksi_supported_predicate_cache_entry(meaning_sentence, cache_entry_query_form, required_mt, count, module);
        return sksi_supported_predicate_cache_enter(pred, cache_entry);
    }

    public static SubLObject deregister_sksi_supported_predicate(final SubLObject pred, final SubLObject required_mt, final SubLObject module, final SubLObject count) {
        SubLObject cdolist_list_var;
        final SubLObject cache_entries = cdolist_list_var = sksi_supported_predicate_cache_entries_for_predicate_and_mt(pred, required_mt);
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sksi_supported_predicate_cache_remove(pred, entry, module, count);
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return sksi_supported_predicate_cache_entries_for_predicate(pred, UNPROVIDED);
    }

    public static SubLObject declare_sksi_sks_predicate_indexing_file() {
        declareFunction(me, "sksi_supported_predicate_cache_entry_print_function_trampoline", "SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sksi_supported_predicate_cache_entry_p", "SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY-P", 1, 0, false);
        new sksi_sks_predicate_indexing.$sksi_supported_predicate_cache_entry_p$UnaryFunction();
        declareFunction(me, "sksi_pred_entry_meaning_sentence", "SKSI-PRED-ENTRY-MEANING-SENTENCE", 1, 0, false);
        declareFunction(me, "sksi_pred_entry_query_form", "SKSI-PRED-ENTRY-QUERY-FORM", 1, 0, false);
        declareFunction(me, "sksi_pred_entry_mt", "SKSI-PRED-ENTRY-MT", 1, 0, false);
        declareFunction(me, "sksi_pred_entry_count", "SKSI-PRED-ENTRY-COUNT", 1, 0, false);
        declareFunction(me, "sksi_pred_entry_modules", "SKSI-PRED-ENTRY-MODULES", 1, 0, false);
        declareFunction(me, "_csetf_sksi_pred_entry_meaning_sentence", "_CSETF-SKSI-PRED-ENTRY-MEANING-SENTENCE", 2, 0, false);
        declareFunction(me, "_csetf_sksi_pred_entry_query_form", "_CSETF-SKSI-PRED-ENTRY-QUERY-FORM", 2, 0, false);
        declareFunction(me, "_csetf_sksi_pred_entry_mt", "_CSETF-SKSI-PRED-ENTRY-MT", 2, 0, false);
        declareFunction(me, "_csetf_sksi_pred_entry_count", "_CSETF-SKSI-PRED-ENTRY-COUNT", 2, 0, false);
        declareFunction(me, "_csetf_sksi_pred_entry_modules", "_CSETF-SKSI-PRED-ENTRY-MODULES", 2, 0, false);
        declareFunction(me, "make_sksi_supported_predicate_cache_entry", "MAKE-SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY", 0, 1, false);
        declareFunction(me, "visit_defstruct_sksi_supported_predicate_cache_entry", "VISIT-DEFSTRUCT-SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sksi_supported_predicate_cache_entry_method", "VISIT-DEFSTRUCT-OBJECT-SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY-METHOD", 2, 0, false);
        declareFunction(me, "new_sksi_supported_predicate_cache_entry", "NEW-SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY", 5, 0, false);
        declareFunction(me, "sksi_supported_predicate_cache_entry_meaning_sentence", "SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY-MEANING-SENTENCE", 1, 0, false);
        declareFunction(me, "sksi_supported_predicate_cache_entry_query_form", "SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY-QUERY-FORM", 1, 0, false);
        declareFunction(me, "sksi_supported_predicate_cache_entry_mt", "SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY-MT", 1, 0, false);
        declareFunction(me, "sksi_supported_predicate_cache_entry_count", "SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY-COUNT", 1, 0, false);
        declareFunction(me, "sksi_supported_predicate_cache_entry_modules", "SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY-MODULES", 1, 0, false);
        declareFunction(me, "print_sksi_supported_predicate_cache_entry", "PRINT-SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY", 3, 0, false);
        declareFunction(me, "clear_sksi_supported_predicate_cache", "CLEAR-SKSI-SUPPORTED-PREDICATE-CACHE", 0, 0, false);
        declareFunction(me, "sksi_supported_predicate_cache_lookup", "SKSI-SUPPORTED-PREDICATE-CACHE-LOOKUP", 1, 0, false);
        declareFunction(me, "sksi_supported_predicate_browsing_registeredP", "SKSI-SUPPORTED-PREDICATE-BROWSING-REGISTERED?", 0, 0, false);
        declareFunction(me, "sksi_supported_predicate_cache_enter", "SKSI-SUPPORTED-PREDICATE-CACHE-ENTER", 2, 0, false);
        declareFunction(me, "sksi_supported_predicate_cache_remove", "SKSI-SUPPORTED-PREDICATE-CACHE-REMOVE", 4, 0, false);
        declareFunction(me, "sksi_supported_predicate_cache_entries_for_predicate", "SKSI-SUPPORTED-PREDICATE-CACHE-ENTRIES-FOR-PREDICATE", 1, 1, false);
        declareFunction(me, "sksi_supported_predicate_mt_list_for_pred", "SKSI-SUPPORTED-PREDICATE-MT-LIST-FOR-PRED", 1, 1, false);
        declareFunction(me, "sksi_supported_predicate_mt_count_pairs_for_predicate", "SKSI-SUPPORTED-PREDICATE-MT-COUNT-PAIRS-FOR-PREDICATE", 1, 1, false);
        declareFunction(me, "sksi_supported_predicate_cache_entries_for_predicate_and_mt", "SKSI-SUPPORTED-PREDICATE-CACHE-ENTRIES-FOR-PREDICATE-AND-MT", 2, 0, false);
        declareFunction(me, "gather_query_form_module_list_pairs_from_sksi_supported_predicate_cache_entries_for_predicate_and_mt", "GATHER-QUERY-FORM-MODULE-LIST-PAIRS-FROM-SKSI-SUPPORTED-PREDICATE-CACHE-ENTRIES-FOR-PREDICATE-AND-MT", 2, 0, false);
        declareFunction(me, "gather_query_form_mt_module_list_pairs_from_sksi_supported_predicate_cache_entries_for_predicate", "GATHER-QUERY-FORM-MT-MODULE-LIST-PAIRS-FROM-SKSI-SUPPORTED-PREDICATE-CACHE-ENTRIES-FOR-PREDICATE", 1, 0, false);
        declareFunction(me, "gather_relevant_meaning_sentence_query_form_mt_module_list_tuples_from_sksi_supported_predicate_cache", "GATHER-RELEVANT-MEANING-SENTENCE-QUERY-FORM-MT-MODULE-LIST-TUPLES-FROM-SKSI-SUPPORTED-PREDICATE-CACHE", 0, 0, false);
        declareFunction(me, "gather_meaning_sentence_query_form_mt_module_list_tuples_from_sksi_supported_predicate_cache_entries", "GATHER-MEANING-SENTENCE-QUERY-FORM-MT-MODULE-LIST-TUPLES-FROM-SKSI-SUPPORTED-PREDICATE-CACHE-ENTRIES", 1, 0, false);
        declareFunction(me, "predicate_sksi_indexed_relevant_in_mtP", "PREDICATE-SKSI-INDEXED-RELEVANT-IN-MT?", 1, 0, false);
        declareFunction(me, "sksi_indexed_predicate_extent_count_in_relevant_mts", "SKSI-INDEXED-PREDICATE-EXTENT-COUNT-IN-RELEVANT-MTS", 1, 0, false);
        declareFunction(me, "sksi_supported_predicateP", "SKSI-SUPPORTED-PREDICATE?", 1, 0, false);
        declareFunction(me, "register_sksi_supported_predicates", "REGISTER-SKSI-SUPPORTED-PREDICATES", 6, 0, false);
        declareFunction(me, "register_sksi_supported_predicate", "REGISTER-SKSI-SUPPORTED-PREDICATE", 6, 0, false);
        declareFunction(me, "deregister_sksi_supported_predicate", "DEREGISTER-SKSI-SUPPORTED-PREDICATE", 4, 0, false);
        return NIL;
    }

    public static SubLObject init_sksi_sks_predicate_indexing_file() {
        defconstant("*DTP-SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY*", SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY);
        deflexical("*SKSI-SUPPORTED-PREDICATE-CACHE*", SubLTrampolineFile.maybeDefault($sksi_supported_predicate_cache$, $sksi_supported_predicate_cache$, () -> dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED)));
        return NIL;
    }

    public static SubLObject setup_sksi_sks_predicate_indexing_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sksi_supported_predicate_cache_entry$.getGlobalValue(), symbol_function(SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(SKSI_PRED_ENTRY_MEANING_SENTENCE, _CSETF_SKSI_PRED_ENTRY_MEANING_SENTENCE);
        def_csetf(SKSI_PRED_ENTRY_QUERY_FORM, _CSETF_SKSI_PRED_ENTRY_QUERY_FORM);
        def_csetf(SKSI_PRED_ENTRY_MT, _CSETF_SKSI_PRED_ENTRY_MT);
        def_csetf(SKSI_PRED_ENTRY_COUNT, _CSETF_SKSI_PRED_ENTRY_COUNT);
        def_csetf(SKSI_PRED_ENTRY_MODULES, _CSETF_SKSI_PRED_ENTRY_MODULES);
        identity(SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sksi_supported_predicate_cache_entry$.getGlobalValue(), symbol_function($sym29$VISIT_DEFSTRUCT_OBJECT_SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY_METHO));
        declare_defglobal($sksi_supported_predicate_cache$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_sks_predicate_indexing_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_sks_predicate_indexing_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_sks_predicate_indexing_file();
    }

    static {






































    }

    public static final class $sksi_supported_predicate_cache_entry_native extends SubLStructNative {
        public SubLObject $meaning_sentence;

        public SubLObject $query_form;

        public SubLObject $mt;

        public SubLObject $count;

        public SubLObject $modules;

        private static final SubLStructDeclNative structDecl;

        public $sksi_supported_predicate_cache_entry_native() {
            this.$meaning_sentence = Lisp.NIL;
            this.$query_form = Lisp.NIL;
            this.$mt = Lisp.NIL;
            this.$count = Lisp.NIL;
            this.$modules = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$meaning_sentence;
        }

        @Override
        public SubLObject getField3() {
            return this.$query_form;
        }

        @Override
        public SubLObject getField4() {
            return this.$mt;
        }

        @Override
        public SubLObject getField5() {
            return this.$count;
        }

        @Override
        public SubLObject getField6() {
            return this.$modules;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$meaning_sentence = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$query_form = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$mt = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$count = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$modules = value;
        }

        static {
            structDecl = makeStructDeclNative(sksi_sks_predicate_indexing.$sksi_supported_predicate_cache_entry_native.class, SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY, SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY_P, $list2, $list3, new String[]{ "$meaning_sentence", "$query_form", "$mt", "$count", "$modules" }, $list4, $list5, PRINT_SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY);
        }
    }

    public static final class $sksi_supported_predicate_cache_entry_p$UnaryFunction extends UnaryFunction {
        public $sksi_supported_predicate_cache_entry_p$UnaryFunction() {
            super(extractFunctionNamed("SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sksi_supported_predicate_cache_entry_p(arg1);
        }
    }
}

/**
 * Total time: 160 ms
 */
