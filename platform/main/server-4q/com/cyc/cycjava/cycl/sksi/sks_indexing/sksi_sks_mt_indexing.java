package com.cyc.cycjava.cycl.sksi.sks_indexing;


import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_browser_utilities;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing;
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
import static com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class sksi_sks_mt_indexing extends SubLTranslatedFile {
    public static final SubLFile me = new sksi_sks_mt_indexing();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing";

    public static final String myFingerPrint = "cf745c668dd579c681b0cb21bf8bfcdd46f6c42d4a9b7057966e6dd1be472162";

    // defconstant
    public static final SubLSymbol $dtp_sksi_supported_mt_cache_entry$ = makeSymbol("*DTP-SKSI-SUPPORTED-MT-CACHE-ENTRY*");



    // Internal Constants
    public static final SubLSymbol SKSI_SUPPORTED_MT_CACHE_ENTRY = makeSymbol("SKSI-SUPPORTED-MT-CACHE-ENTRY");

    public static final SubLSymbol SKSI_SUPPORTED_MT_CACHE_ENTRY_P = makeSymbol("SKSI-SUPPORTED-MT-CACHE-ENTRY-P");

    public static final SubLList $list2 = list(makeSymbol("QUERY-FORM"), makeSymbol("PREDICATE"), makeSymbol("COUNT"), makeSymbol("MODULES"));

    public static final SubLList $list3 = list(makeKeyword("QUERY-FORM"), makeKeyword("PREDICATE"), makeKeyword("COUNT"), makeKeyword("MODULES"));

    public static final SubLList $list4 = list(makeSymbol("SKSI-MT-ENTRY-QUERY-FORM"), makeSymbol("SKSI-MT-ENTRY-PREDICATE"), makeSymbol("SKSI-MT-ENTRY-COUNT"), makeSymbol("SKSI-MT-ENTRY-MODULES"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-SKSI-MT-ENTRY-QUERY-FORM"), makeSymbol("_CSETF-SKSI-MT-ENTRY-PREDICATE"), makeSymbol("_CSETF-SKSI-MT-ENTRY-COUNT"), makeSymbol("_CSETF-SKSI-MT-ENTRY-MODULES"));

    public static final SubLSymbol PRINT_SKSI_SUPPORTED_MT_CACHE_ENTRY = makeSymbol("PRINT-SKSI-SUPPORTED-MT-CACHE-ENTRY");

    public static final SubLSymbol SKSI_SUPPORTED_MT_CACHE_ENTRY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SKSI-SUPPORTED-MT-CACHE-ENTRY-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SKSI-SUPPORTED-MT-CACHE-ENTRY-P"));

    private static final SubLSymbol SKSI_MT_ENTRY_QUERY_FORM = makeSymbol("SKSI-MT-ENTRY-QUERY-FORM");

    private static final SubLSymbol _CSETF_SKSI_MT_ENTRY_QUERY_FORM = makeSymbol("_CSETF-SKSI-MT-ENTRY-QUERY-FORM");

    private static final SubLSymbol SKSI_MT_ENTRY_PREDICATE = makeSymbol("SKSI-MT-ENTRY-PREDICATE");

    private static final SubLSymbol _CSETF_SKSI_MT_ENTRY_PREDICATE = makeSymbol("_CSETF-SKSI-MT-ENTRY-PREDICATE");

    private static final SubLSymbol SKSI_MT_ENTRY_COUNT = makeSymbol("SKSI-MT-ENTRY-COUNT");

    private static final SubLSymbol _CSETF_SKSI_MT_ENTRY_COUNT = makeSymbol("_CSETF-SKSI-MT-ENTRY-COUNT");

    private static final SubLSymbol SKSI_MT_ENTRY_MODULES = makeSymbol("SKSI-MT-ENTRY-MODULES");

    private static final SubLSymbol _CSETF_SKSI_MT_ENTRY_MODULES = makeSymbol("_CSETF-SKSI-MT-ENTRY-MODULES");









    private static final SubLString $str21$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_SKSI_SUPPORTED_MT_CACHE_ENTRY = makeSymbol("MAKE-SKSI-SUPPORTED-MT-CACHE-ENTRY");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SKSI_SUPPORTED_MT_CACHE_ENTRY_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SKSI-SUPPORTED-MT-CACHE-ENTRY-METHOD");

    private static final SubLString $str27$__MCE__s__s__s__s_ = makeString("#<MCE:~s:~s:~s:~s>");

    private static final SubLSymbol $sksi_supported_mt_cache$ = makeSymbol("*SKSI-SUPPORTED-MT-CACHE*");

    private static final SubLSymbol $sym29$SKSI_TERM___W__CONSTANTS_BY_NAME_ON = makeSymbol("SKSI-TERM-<-W/-CONSTANTS-BY-NAME-ON");

    private static final SubLSymbol SKSI_SUPPORTED_MT_CACHE_ENTRY_PREDICATE = makeSymbol("SKSI-SUPPORTED-MT-CACHE-ENTRY-PREDICATE");

    private static final SubLSymbol $sym31$CONTENT_MT_OF_ACTIVATED_EXTERNAL_SOURCE_ = makeSymbol("CONTENT-MT-OF-ACTIVATED-EXTERNAL-SOURCE?");

    public static SubLObject sksi_supported_mt_cache_entry_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sksi_supported_mt_cache_entry(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sksi_supported_mt_cache_entry_p(final SubLObject v_object) {
        return v_object.getClass() == $sksi_supported_mt_cache_entry_native.class ? T : NIL;
    }

    public static SubLObject sksi_mt_entry_query_form(final SubLObject v_object) {
        assert NIL != sksi_supported_mt_cache_entry_p(v_object) : "sksi_sks_mt_indexing.sksi_supported_mt_cache_entry_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sksi_mt_entry_predicate(final SubLObject v_object) {
        assert NIL != sksi_supported_mt_cache_entry_p(v_object) : "sksi_sks_mt_indexing.sksi_supported_mt_cache_entry_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject sksi_mt_entry_count(final SubLObject v_object) {
        assert NIL != sksi_supported_mt_cache_entry_p(v_object) : "sksi_sks_mt_indexing.sksi_supported_mt_cache_entry_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject sksi_mt_entry_modules(final SubLObject v_object) {
        assert NIL != sksi_supported_mt_cache_entry_p(v_object) : "sksi_sks_mt_indexing.sksi_supported_mt_cache_entry_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_sksi_mt_entry_query_form(final SubLObject v_object, final SubLObject value) {
        assert NIL != sksi_supported_mt_cache_entry_p(v_object) : "sksi_sks_mt_indexing.sksi_supported_mt_cache_entry_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sksi_mt_entry_predicate(final SubLObject v_object, final SubLObject value) {
        assert NIL != sksi_supported_mt_cache_entry_p(v_object) : "sksi_sks_mt_indexing.sksi_supported_mt_cache_entry_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sksi_mt_entry_count(final SubLObject v_object, final SubLObject value) {
        assert NIL != sksi_supported_mt_cache_entry_p(v_object) : "sksi_sks_mt_indexing.sksi_supported_mt_cache_entry_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sksi_mt_entry_modules(final SubLObject v_object, final SubLObject value) {
        assert NIL != sksi_supported_mt_cache_entry_p(v_object) : "sksi_sks_mt_indexing.sksi_supported_mt_cache_entry_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_sksi_supported_mt_cache_entry(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sksi_supported_mt_cache_entry_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($QUERY_FORM)) {
                _csetf_sksi_mt_entry_query_form(v_new, current_value);
            } else
                if (pcase_var.eql($PREDICATE)) {
                    _csetf_sksi_mt_entry_predicate(v_new, current_value);
                } else
                    if (pcase_var.eql($COUNT)) {
                        _csetf_sksi_mt_entry_count(v_new, current_value);
                    } else
                        if (pcase_var.eql($MODULES)) {
                            _csetf_sksi_mt_entry_modules(v_new, current_value);
                        } else {
                            Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sksi_supported_mt_cache_entry(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SKSI_SUPPORTED_MT_CACHE_ENTRY, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $QUERY_FORM, sksi_mt_entry_query_form(obj));
        funcall(visitor_fn, obj, $SLOT, $PREDICATE, sksi_mt_entry_predicate(obj));
        funcall(visitor_fn, obj, $SLOT, $COUNT, sksi_mt_entry_count(obj));
        funcall(visitor_fn, obj, $SLOT, $MODULES, sksi_mt_entry_modules(obj));
        funcall(visitor_fn, obj, $END, MAKE_SKSI_SUPPORTED_MT_CACHE_ENTRY, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sksi_supported_mt_cache_entry_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sksi_supported_mt_cache_entry(obj, visitor_fn);
    }

    public static SubLObject new_sksi_supported_mt_cache_entry(final SubLObject predicate, final SubLObject query_form, final SubLObject count, final SubLObject module) {
        final SubLObject entry = make_sksi_supported_mt_cache_entry(UNPROVIDED);
        _csetf_sksi_mt_entry_query_form(entry, query_form);
        _csetf_sksi_mt_entry_predicate(entry, predicate);
        _csetf_sksi_mt_entry_count(entry, count);
        _csetf_sksi_mt_entry_modules(entry, list(module));
        return entry;
    }

    public static SubLObject sksi_supported_mt_cache_entry_query_form(final SubLObject entry) {
        return sksi_mt_entry_query_form(entry);
    }

    public static SubLObject sksi_supported_mt_cache_entry_predicate(final SubLObject entry) {
        return sksi_mt_entry_predicate(entry);
    }

    public static SubLObject sksi_supported_mt_cache_entry_count(final SubLObject entry) {
        return sksi_mt_entry_count(entry);
    }

    public static SubLObject sksi_supported_mt_cache_entry_modules(final SubLObject entry) {
        return sksi_mt_entry_modules(entry);
    }

    public static SubLObject print_sksi_supported_mt_cache_entry(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str27$__MCE__s__s__s__s_, new SubLObject[]{ sksi_supported_mt_cache_entry_query_form(v_object), sksi_supported_mt_cache_entry_predicate(v_object), sksi_supported_mt_cache_entry_count(v_object), sksi_supported_mt_cache_entry_modules(v_object) });
        return NIL;
    }

    public static SubLObject clear_sksi_supported_mt_cache() {
        return dictionary.clear_dictionary($sksi_supported_mt_cache$.getGlobalValue());
    }

    public static SubLObject sksi_supported_mt_cache_lookup(final SubLObject mt) {
        return dictionary.dictionary_lookup_without_values($sksi_supported_mt_cache$.getGlobalValue(), mt, NIL);
    }

    public static SubLObject sksi_supported_mt_browsing_registeredP() {
        return makeBoolean(NIL == dictionary.dictionary_empty_p($sksi_supported_mt_cache$.getGlobalValue()));
    }

    public static SubLObject sksi_supported_mt_cache_enter(final SubLObject mt, final SubLObject entry) {
        final SubLObject new_query_form = sksi_supported_mt_cache_entry_query_form(entry);
        final SubLObject new_modules = sksi_supported_mt_cache_entry_modules(entry);
        final SubLObject new_count = sksi_supported_mt_cache_entry_count(entry);
        final SubLObject current_entries = sksi_supported_mt_cache_entries_for_mt_and_predicate(mt, sksi_supported_mt_cache_entry_predicate(entry));
        SubLObject mergedP = NIL;
        if (NIL == mergedP) {
            SubLObject csome_list_var = current_entries;
            SubLObject current_entry = NIL;
            current_entry = csome_list_var.first();
            while ((NIL == mergedP) && (NIL != csome_list_var)) {
                final SubLObject current_query_form = sksi_supported_mt_cache_entry_query_form(current_entry);
                final SubLObject current_modules = sksi_supported_mt_cache_entry_modules(current_entry);
                if (NIL != sksi_sks_indexing_utilities.sksi_query_forms_unifyP(new_query_form, current_query_form)) {
                    _csetf_sksi_mt_entry_modules(current_entry, append(current_modules, new_modules));
                    _csetf_sksi_mt_entry_count(current_entry, sksi_external_browser_utilities.sksi_compute_count_for_external_browser_cache_entry_merge(sksi_mt_entry_count(current_entry), new_count));
                    mergedP = T;
                }
                csome_list_var = csome_list_var.rest();
                current_entry = csome_list_var.first();
            } 
        }
        if (NIL == mergedP) {
            dictionary_utilities.dictionary_add_to_value_sorted($sksi_supported_mt_cache$.getGlobalValue(), mt, entry, $sym29$SKSI_TERM___W__CONSTANTS_BY_NAME_ON, SKSI_SUPPORTED_MT_CACHE_ENTRY_PREDICATE);
        }
        return sksi_supported_mt_cache_lookup(mt);
    }

    public static SubLObject sksi_supported_mt_cache_remove(final SubLObject mt, final SubLObject entry, final SubLObject module, final SubLObject count) {
        final SubLObject entry_modules = sksi_supported_mt_cache_entry_modules(entry);
        SubLObject removedP = NIL;
        if (NIL != subl_promotions.memberP(module, entry_modules, UNPROVIDED, UNPROVIDED)) {
            if (NIL != list_utilities.singletonP(entry_modules)) {
                dictionary_utilities.dictionary_delete_from_value($sksi_supported_mt_cache$.getGlobalValue(), mt, entry, symbol_function(EQUALP), UNPROVIDED);
            } else {
                _csetf_sksi_mt_entry_modules(entry, remove(module, entry_modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                _csetf_sksi_mt_entry_count(entry, sksi_external_browser_utilities.sksi_compute_count_for_external_browser_cache_entry_demerge(sksi_mt_entry_count(entry), count));
            }
            removedP = T;
        }
        return removedP;
    }

    public static SubLObject sksi_supported_mt_cache_entries_for_mt(final SubLObject mt) {
        return sksi_supported_mt_cache_lookup(mt);
    }

    public static SubLObject sksi_supported_mt_predicate_list_for_mt(final SubLObject mt) {
        return list_utilities.fast_delete_duplicates(Mapping.mapcar(SKSI_SUPPORTED_MT_CACHE_ENTRY_PREDICATE, sksi_supported_mt_cache_entries_for_mt(mt)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sksi_supported_mt_predicate_count_pairs_for_mt(final SubLObject mt) {
        if (NIL == content_mt_of_activated_external_sourceP(mt)) {
            return NIL;
        }
        final SubLObject cache_entries = sksi_supported_mt_cache_entries_for_mt(mt);
        SubLObject predicate_count_pairs = NIL;
        SubLObject cdolist_list_var = cache_entries;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject predicate = sksi_supported_mt_cache_entry_predicate(entry);
            SubLObject count = sksi_supported_mt_cache_entry_count(entry);
            final SubLObject last_entry = predicate_count_pairs.first();
            final SubLObject last_entry_pred = last_entry.first();
            final SubLObject last_entry_count = second(last_entry);
            if (predicate.eql(last_entry_pred)) {
                if (last_entry_count.isInteger()) {
                    if (count.isInteger()) {
                        count = add(count, last_entry_count);
                    } else {
                        count = last_entry_count;
                    }
                }
                predicate_count_pairs = rplaca(predicate_count_pairs, list(predicate, count));
            } else {
                predicate_count_pairs = cons(list(predicate, count), predicate_count_pairs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return nreverse(predicate_count_pairs);
    }

    public static SubLObject sksi_supported_mt_cache_entries_for_mt_and_predicate(final SubLObject mt, final SubLObject predicate) {
        final SubLObject cache_entries_for_mt = sksi_supported_mt_cache_entries_for_mt(mt);
        return list_utilities.find_all(predicate, cache_entries_for_mt, EQL, SKSI_SUPPORTED_MT_CACHE_ENTRY_PREDICATE);
    }

    public static SubLObject gather_query_form_module_list_pairs_from_sksi_supported_mt_cache_entries_for_mt_and_predicate(final SubLObject mt, final SubLObject predicate) {
        final SubLObject cache_entries_for_mt = sksi_supported_mt_cache_entries_for_mt(mt);
        SubLObject query_form_module_list_pairs = NIL;
        SubLObject cdolist_list_var = cache_entries_for_mt;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (predicate.eql(sksi_supported_mt_cache_entry_predicate(entry))) {
                query_form_module_list_pairs = cons(list(sksi_supported_mt_cache_entry_query_form(entry), sksi_supported_mt_cache_entry_modules(entry)), query_form_module_list_pairs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return nreverse(query_form_module_list_pairs);
    }

    public static SubLObject sksi_supported_mtP(final SubLObject mt) {
        return makeBoolean((NIL != sksi_supported_mt_cache_lookup(mt)) && (NIL != content_mt_of_activated_external_sourceP(mt)));
    }

    public static SubLObject content_mt_of_activated_external_sourceP_internal(final SubLObject mt) {
        return sksi_infrastructure_utilities.external_source_activated_in_imageP(sksi_kb_accessors.content_mt_sk_source_in_any_mt(mt));
    }

    public static SubLObject content_mt_of_activated_external_sourceP(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return content_mt_of_activated_external_sourceP_internal(mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym31$CONTENT_MT_OF_ACTIVATED_EXTERNAL_SOURCE_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym31$CONTENT_MT_OF_ACTIVATED_EXTERNAL_SOURCE_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym31$CONTENT_MT_OF_ACTIVATED_EXTERNAL_SOURCE_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(content_mt_of_activated_external_sourceP_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject register_sksi_supported_mt(final SubLObject mt, final SubLObject pred_list, final SubLObject required_pattern, final SubLObject count, final SubLObject module) {
        final SubLObject query_form = sksi_external_browser_utilities.sksi_create_query_form_from_required_pattern(required_pattern);
        if (NIL != query_form) {
            SubLObject cdolist_list_var = pred_list;
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != sksi_infrastructure_utilities.sksi_supported_predicate_type_p(pred, UNPROVIDED)) {
                    register_sksi_supported_mt_int(mt, pred, query_form, count, module);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject register_sksi_supported_mt_int(final SubLObject mt, final SubLObject pred, final SubLObject query_form, final SubLObject count, final SubLObject module) {
        final SubLObject cache_entry_query_form = make_el_formula(pred, cycl_utilities.formula_args(query_form, UNPROVIDED), UNPROVIDED);
        final SubLObject cache_entry = new_sksi_supported_mt_cache_entry(pred, cache_entry_query_form, count, module);
        return sksi_supported_mt_cache_enter(mt, cache_entry);
    }

    public static SubLObject deregister_sksi_supported_mt(final SubLObject mt, final SubLObject pred, final SubLObject module, final SubLObject count) {
        SubLObject cdolist_list_var;
        final SubLObject cache_entries = cdolist_list_var = sksi_supported_mt_cache_entries_for_mt_and_predicate(mt, pred);
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sksi_supported_mt_cache_remove(mt, entry, module, count);
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return sksi_supported_mt_cache_entries_for_mt(mt);
    }

    public static SubLObject declare_sksi_sks_mt_indexing_file() {
        declareFunction(me, "sksi_supported_mt_cache_entry_print_function_trampoline", "SKSI-SUPPORTED-MT-CACHE-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sksi_supported_mt_cache_entry_p", "SKSI-SUPPORTED-MT-CACHE-ENTRY-P", 1, 0, false);
        new sksi_sks_mt_indexing.$sksi_supported_mt_cache_entry_p$UnaryFunction();
        declareFunction(me, "sksi_mt_entry_query_form", "SKSI-MT-ENTRY-QUERY-FORM", 1, 0, false);
        declareFunction(me, "sksi_mt_entry_predicate", "SKSI-MT-ENTRY-PREDICATE", 1, 0, false);
        declareFunction(me, "sksi_mt_entry_count", "SKSI-MT-ENTRY-COUNT", 1, 0, false);
        declareFunction(me, "sksi_mt_entry_modules", "SKSI-MT-ENTRY-MODULES", 1, 0, false);
        declareFunction(me, "_csetf_sksi_mt_entry_query_form", "_CSETF-SKSI-MT-ENTRY-QUERY-FORM", 2, 0, false);
        declareFunction(me, "_csetf_sksi_mt_entry_predicate", "_CSETF-SKSI-MT-ENTRY-PREDICATE", 2, 0, false);
        declareFunction(me, "_csetf_sksi_mt_entry_count", "_CSETF-SKSI-MT-ENTRY-COUNT", 2, 0, false);
        declareFunction(me, "_csetf_sksi_mt_entry_modules", "_CSETF-SKSI-MT-ENTRY-MODULES", 2, 0, false);
        declareFunction(me, "make_sksi_supported_mt_cache_entry", "MAKE-SKSI-SUPPORTED-MT-CACHE-ENTRY", 0, 1, false);
        declareFunction(me, "visit_defstruct_sksi_supported_mt_cache_entry", "VISIT-DEFSTRUCT-SKSI-SUPPORTED-MT-CACHE-ENTRY", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sksi_supported_mt_cache_entry_method", "VISIT-DEFSTRUCT-OBJECT-SKSI-SUPPORTED-MT-CACHE-ENTRY-METHOD", 2, 0, false);
        declareFunction(me, "new_sksi_supported_mt_cache_entry", "NEW-SKSI-SUPPORTED-MT-CACHE-ENTRY", 4, 0, false);
        declareFunction(me, "sksi_supported_mt_cache_entry_query_form", "SKSI-SUPPORTED-MT-CACHE-ENTRY-QUERY-FORM", 1, 0, false);
        declareFunction(me, "sksi_supported_mt_cache_entry_predicate", "SKSI-SUPPORTED-MT-CACHE-ENTRY-PREDICATE", 1, 0, false);
        declareFunction(me, "sksi_supported_mt_cache_entry_count", "SKSI-SUPPORTED-MT-CACHE-ENTRY-COUNT", 1, 0, false);
        declareFunction(me, "sksi_supported_mt_cache_entry_modules", "SKSI-SUPPORTED-MT-CACHE-ENTRY-MODULES", 1, 0, false);
        declareFunction(me, "print_sksi_supported_mt_cache_entry", "PRINT-SKSI-SUPPORTED-MT-CACHE-ENTRY", 3, 0, false);
        declareFunction(me, "clear_sksi_supported_mt_cache", "CLEAR-SKSI-SUPPORTED-MT-CACHE", 0, 0, false);
        declareFunction(me, "sksi_supported_mt_cache_lookup", "SKSI-SUPPORTED-MT-CACHE-LOOKUP", 1, 0, false);
        declareFunction(me, "sksi_supported_mt_browsing_registeredP", "SKSI-SUPPORTED-MT-BROWSING-REGISTERED?", 0, 0, false);
        declareFunction(me, "sksi_supported_mt_cache_enter", "SKSI-SUPPORTED-MT-CACHE-ENTER", 2, 0, false);
        declareFunction(me, "sksi_supported_mt_cache_remove", "SKSI-SUPPORTED-MT-CACHE-REMOVE", 4, 0, false);
        declareFunction(me, "sksi_supported_mt_cache_entries_for_mt", "SKSI-SUPPORTED-MT-CACHE-ENTRIES-FOR-MT", 1, 0, false);
        declareFunction(me, "sksi_supported_mt_predicate_list_for_mt", "SKSI-SUPPORTED-MT-PREDICATE-LIST-FOR-MT", 1, 0, false);
        declareFunction(me, "sksi_supported_mt_predicate_count_pairs_for_mt", "SKSI-SUPPORTED-MT-PREDICATE-COUNT-PAIRS-FOR-MT", 1, 0, false);
        declareFunction(me, "sksi_supported_mt_cache_entries_for_mt_and_predicate", "SKSI-SUPPORTED-MT-CACHE-ENTRIES-FOR-MT-AND-PREDICATE", 2, 0, false);
        declareFunction(me, "gather_query_form_module_list_pairs_from_sksi_supported_mt_cache_entries_for_mt_and_predicate", "GATHER-QUERY-FORM-MODULE-LIST-PAIRS-FROM-SKSI-SUPPORTED-MT-CACHE-ENTRIES-FOR-MT-AND-PREDICATE", 2, 0, false);
        declareFunction(me, "sksi_supported_mtP", "SKSI-SUPPORTED-MT?", 1, 0, false);
        declareFunction(me, "content_mt_of_activated_external_sourceP_internal", "CONTENT-MT-OF-ACTIVATED-EXTERNAL-SOURCE?-INTERNAL", 1, 0, false);
        declareFunction(me, "content_mt_of_activated_external_sourceP", "CONTENT-MT-OF-ACTIVATED-EXTERNAL-SOURCE?", 1, 0, false);
        declareFunction(me, "register_sksi_supported_mt", "REGISTER-SKSI-SUPPORTED-MT", 5, 0, false);
        declareFunction(me, "register_sksi_supported_mt_int", "REGISTER-SKSI-SUPPORTED-MT-INT", 5, 0, false);
        declareFunction(me, "deregister_sksi_supported_mt", "DEREGISTER-SKSI-SUPPORTED-MT", 4, 0, false);
        return NIL;
    }

    public static SubLObject init_sksi_sks_mt_indexing_file() {
        defconstant("*DTP-SKSI-SUPPORTED-MT-CACHE-ENTRY*", SKSI_SUPPORTED_MT_CACHE_ENTRY);
        deflexical("*SKSI-SUPPORTED-MT-CACHE*", SubLTrampolineFile.maybeDefault($sksi_supported_mt_cache$, $sksi_supported_mt_cache$, () -> dictionary.new_dictionary(EQUAL, UNPROVIDED)));
        return NIL;
    }

    public static SubLObject setup_sksi_sks_mt_indexing_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sksi_supported_mt_cache_entry$.getGlobalValue(), symbol_function(SKSI_SUPPORTED_MT_CACHE_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(SKSI_MT_ENTRY_QUERY_FORM, _CSETF_SKSI_MT_ENTRY_QUERY_FORM);
        def_csetf(SKSI_MT_ENTRY_PREDICATE, _CSETF_SKSI_MT_ENTRY_PREDICATE);
        def_csetf(SKSI_MT_ENTRY_COUNT, _CSETF_SKSI_MT_ENTRY_COUNT);
        def_csetf(SKSI_MT_ENTRY_MODULES, _CSETF_SKSI_MT_ENTRY_MODULES);
        identity(SKSI_SUPPORTED_MT_CACHE_ENTRY);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sksi_supported_mt_cache_entry$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SKSI_SUPPORTED_MT_CACHE_ENTRY_METHOD));
        declare_defglobal($sksi_supported_mt_cache$);
        memoization_state.note_memoized_function($sym31$CONTENT_MT_OF_ACTIVATED_EXTERNAL_SOURCE_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_sks_mt_indexing_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_sks_mt_indexing_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_sks_mt_indexing_file();
    }

    static {



































    }

    public static final class $sksi_supported_mt_cache_entry_native extends SubLStructNative {
        public SubLObject $query_form;

        public SubLObject $predicate;

        public SubLObject $count;

        public SubLObject $modules;

        private static final SubLStructDeclNative structDecl;

        private $sksi_supported_mt_cache_entry_native() {
            this.$query_form = Lisp.NIL;
            this.$predicate = Lisp.NIL;
            this.$count = Lisp.NIL;
            this.$modules = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$query_form;
        }

        @Override
        public SubLObject getField3() {
            return this.$predicate;
        }

        @Override
        public SubLObject getField4() {
            return this.$count;
        }

        @Override
        public SubLObject getField5() {
            return this.$modules;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$query_form = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$predicate = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$count = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$modules = value;
        }

        static {
            structDecl = makeStructDeclNative($sksi_supported_mt_cache_entry_native.class, SKSI_SUPPORTED_MT_CACHE_ENTRY, SKSI_SUPPORTED_MT_CACHE_ENTRY_P, $list2, $list3, new String[]{ "$query_form", "$predicate", "$count", "$modules" }, $list4, $list5, PRINT_SKSI_SUPPORTED_MT_CACHE_ENTRY);
        }
    }

    public static final class $sksi_supported_mt_cache_entry_p$UnaryFunction extends UnaryFunction {
        public $sksi_supported_mt_cache_entry_p$UnaryFunction() {
            super(extractFunctionNamed("SKSI-SUPPORTED-MT-CACHE-ENTRY-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sksi_supported_mt_cache_entry_p(arg1);
        }
    }
}

/**
 * Total time: 164 ms
 */
