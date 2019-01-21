package com.cyc.cycjava.cycl.sksi.sks_indexing;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_browser_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_sks_mt_indexing extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing";
    public static final String myFingerPrint = "cf745c668dd579c681b0cb21bf8bfcdd46f6c42d4a9b7057966e6dd1be472162";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 1827L)
    public static SubLSymbol $dtp_sksi_supported_mt_cache_entry$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 3151L)
    private static SubLSymbol $sksi_supported_mt_cache$;
    private static final SubLSymbol $sym0$SKSI_SUPPORTED_MT_CACHE_ENTRY;
    private static final SubLSymbol $sym1$SKSI_SUPPORTED_MT_CACHE_ENTRY_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_SKSI_SUPPORTED_MT_CACHE_ENTRY;
    private static final SubLSymbol $sym7$SKSI_SUPPORTED_MT_CACHE_ENTRY_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$SKSI_MT_ENTRY_QUERY_FORM;
    private static final SubLSymbol $sym10$_CSETF_SKSI_MT_ENTRY_QUERY_FORM;
    private static final SubLSymbol $sym11$SKSI_MT_ENTRY_PREDICATE;
    private static final SubLSymbol $sym12$_CSETF_SKSI_MT_ENTRY_PREDICATE;
    private static final SubLSymbol $sym13$SKSI_MT_ENTRY_COUNT;
    private static final SubLSymbol $sym14$_CSETF_SKSI_MT_ENTRY_COUNT;
    private static final SubLSymbol $sym15$SKSI_MT_ENTRY_MODULES;
    private static final SubLSymbol $sym16$_CSETF_SKSI_MT_ENTRY_MODULES;
    private static final SubLSymbol $kw17$QUERY_FORM;
    private static final SubLSymbol $kw18$PREDICATE;
    private static final SubLSymbol $kw19$COUNT;
    private static final SubLSymbol $kw20$MODULES;
    private static final SubLString $str21$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw22$BEGIN;
    private static final SubLSymbol $sym23$MAKE_SKSI_SUPPORTED_MT_CACHE_ENTRY;
    private static final SubLSymbol $kw24$SLOT;
    private static final SubLSymbol $kw25$END;
    private static final SubLSymbol $sym26$VISIT_DEFSTRUCT_OBJECT_SKSI_SUPPORTED_MT_CACHE_ENTRY_METHOD;
    private static final SubLString $str27$__MCE__s__s__s__s_;
    private static final SubLSymbol $sym28$_SKSI_SUPPORTED_MT_CACHE_;
    private static final SubLSymbol $sym29$SKSI_TERM___W__CONSTANTS_BY_NAME_ON;
    private static final SubLSymbol $sym30$SKSI_SUPPORTED_MT_CACHE_ENTRY_PREDICATE;
    private static final SubLSymbol $sym31$CONTENT_MT_OF_ACTIVATED_EXTERNAL_SOURCE_;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 1827L)
    public static SubLObject sksi_supported_mt_cache_entry_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sksi_supported_mt_cache_entry(v_object, stream, (SubLObject)sksi_sks_mt_indexing.ZERO_INTEGER);
        return (SubLObject)sksi_sks_mt_indexing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 1827L)
    public static SubLObject sksi_supported_mt_cache_entry_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sksi_supported_mt_cache_entry_native.class) ? sksi_sks_mt_indexing.T : sksi_sks_mt_indexing.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 1827L)
    public static SubLObject sksi_mt_entry_query_form(final SubLObject v_object) {
        assert sksi_sks_mt_indexing.NIL != sksi_supported_mt_cache_entry_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 1827L)
    public static SubLObject sksi_mt_entry_predicate(final SubLObject v_object) {
        assert sksi_sks_mt_indexing.NIL != sksi_supported_mt_cache_entry_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 1827L)
    public static SubLObject sksi_mt_entry_count(final SubLObject v_object) {
        assert sksi_sks_mt_indexing.NIL != sksi_supported_mt_cache_entry_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 1827L)
    public static SubLObject sksi_mt_entry_modules(final SubLObject v_object) {
        assert sksi_sks_mt_indexing.NIL != sksi_supported_mt_cache_entry_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 1827L)
    public static SubLObject _csetf_sksi_mt_entry_query_form(final SubLObject v_object, final SubLObject value) {
        assert sksi_sks_mt_indexing.NIL != sksi_supported_mt_cache_entry_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 1827L)
    public static SubLObject _csetf_sksi_mt_entry_predicate(final SubLObject v_object, final SubLObject value) {
        assert sksi_sks_mt_indexing.NIL != sksi_supported_mt_cache_entry_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 1827L)
    public static SubLObject _csetf_sksi_mt_entry_count(final SubLObject v_object, final SubLObject value) {
        assert sksi_sks_mt_indexing.NIL != sksi_supported_mt_cache_entry_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 1827L)
    public static SubLObject _csetf_sksi_mt_entry_modules(final SubLObject v_object, final SubLObject value) {
        assert sksi_sks_mt_indexing.NIL != sksi_supported_mt_cache_entry_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 1827L)
    public static SubLObject make_sksi_supported_mt_cache_entry(SubLObject arglist) {
        if (arglist == sksi_sks_mt_indexing.UNPROVIDED) {
            arglist = (SubLObject)sksi_sks_mt_indexing.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sksi_supported_mt_cache_entry_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)sksi_sks_mt_indexing.NIL, next = arglist; sksi_sks_mt_indexing.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)sksi_sks_mt_indexing.$kw17$QUERY_FORM)) {
                _csetf_sksi_mt_entry_query_form(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_sks_mt_indexing.$kw18$PREDICATE)) {
                _csetf_sksi_mt_entry_predicate(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_sks_mt_indexing.$kw19$COUNT)) {
                _csetf_sksi_mt_entry_count(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_sks_mt_indexing.$kw20$MODULES)) {
                _csetf_sksi_mt_entry_modules(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)sksi_sks_mt_indexing.$str21$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 1827L)
    public static SubLObject visit_defstruct_sksi_supported_mt_cache_entry(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_sks_mt_indexing.$kw22$BEGIN, (SubLObject)sksi_sks_mt_indexing.$sym23$MAKE_SKSI_SUPPORTED_MT_CACHE_ENTRY, (SubLObject)sksi_sks_mt_indexing.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_sks_mt_indexing.$kw24$SLOT, (SubLObject)sksi_sks_mt_indexing.$kw17$QUERY_FORM, sksi_mt_entry_query_form(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_sks_mt_indexing.$kw24$SLOT, (SubLObject)sksi_sks_mt_indexing.$kw18$PREDICATE, sksi_mt_entry_predicate(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_sks_mt_indexing.$kw24$SLOT, (SubLObject)sksi_sks_mt_indexing.$kw19$COUNT, sksi_mt_entry_count(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_sks_mt_indexing.$kw24$SLOT, (SubLObject)sksi_sks_mt_indexing.$kw20$MODULES, sksi_mt_entry_modules(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_sks_mt_indexing.$kw25$END, (SubLObject)sksi_sks_mt_indexing.$sym23$MAKE_SKSI_SUPPORTED_MT_CACHE_ENTRY, (SubLObject)sksi_sks_mt_indexing.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 1827L)
    public static SubLObject visit_defstruct_object_sksi_supported_mt_cache_entry_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sksi_supported_mt_cache_entry(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 2010L)
    public static SubLObject new_sksi_supported_mt_cache_entry(final SubLObject predicate, final SubLObject query_form, final SubLObject count, final SubLObject module) {
        final SubLObject entry = make_sksi_supported_mt_cache_entry((SubLObject)sksi_sks_mt_indexing.UNPROVIDED);
        _csetf_sksi_mt_entry_query_form(entry, query_form);
        _csetf_sksi_mt_entry_predicate(entry, predicate);
        _csetf_sksi_mt_entry_count(entry, count);
        _csetf_sksi_mt_entry_modules(entry, (SubLObject)ConsesLow.list(module));
        return entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 2383L)
    public static SubLObject sksi_supported_mt_cache_entry_query_form(final SubLObject entry) {
        return sksi_mt_entry_query_form(entry);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 2492L)
    public static SubLObject sksi_supported_mt_cache_entry_predicate(final SubLObject entry) {
        return sksi_mt_entry_predicate(entry);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 2598L)
    public static SubLObject sksi_supported_mt_cache_entry_count(final SubLObject entry) {
        return sksi_mt_entry_count(entry);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 2696L)
    public static SubLObject sksi_supported_mt_cache_entry_modules(final SubLObject entry) {
        return sksi_mt_entry_modules(entry);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 2798L)
    public static SubLObject print_sksi_supported_mt_cache_entry(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)sksi_sks_mt_indexing.$str27$__MCE__s__s__s__s_, new SubLObject[] { sksi_supported_mt_cache_entry_query_form(v_object), sksi_supported_mt_cache_entry_predicate(v_object), sksi_supported_mt_cache_entry_count(v_object), sksi_supported_mt_cache_entry_modules(v_object) });
        return (SubLObject)sksi_sks_mt_indexing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 3527L)
    public static SubLObject clear_sksi_supported_mt_cache() {
        return dictionary.clear_dictionary(sksi_sks_mt_indexing.$sksi_supported_mt_cache$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 3633L)
    public static SubLObject sksi_supported_mt_cache_lookup(final SubLObject mt) {
        return dictionary.dictionary_lookup_without_values(sksi_sks_mt_indexing.$sksi_supported_mt_cache$.getGlobalValue(), mt, (SubLObject)sksi_sks_mt_indexing.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 3763L)
    public static SubLObject sksi_supported_mt_browsing_registeredP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_sks_mt_indexing.NIL == dictionary.dictionary_empty_p(sksi_sks_mt_indexing.$sksi_supported_mt_cache$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 3887L)
    public static SubLObject sksi_supported_mt_cache_enter(final SubLObject mt, final SubLObject entry) {
        final SubLObject new_query_form = sksi_supported_mt_cache_entry_query_form(entry);
        final SubLObject new_modules = sksi_supported_mt_cache_entry_modules(entry);
        final SubLObject new_count = sksi_supported_mt_cache_entry_count(entry);
        final SubLObject current_entries = sksi_supported_mt_cache_entries_for_mt_and_predicate(mt, sksi_supported_mt_cache_entry_predicate(entry));
        SubLObject mergedP = (SubLObject)sksi_sks_mt_indexing.NIL;
        if (sksi_sks_mt_indexing.NIL == mergedP) {
            SubLObject csome_list_var = current_entries;
            SubLObject current_entry = (SubLObject)sksi_sks_mt_indexing.NIL;
            current_entry = csome_list_var.first();
            while (sksi_sks_mt_indexing.NIL == mergedP && sksi_sks_mt_indexing.NIL != csome_list_var) {
                final SubLObject current_query_form = sksi_supported_mt_cache_entry_query_form(current_entry);
                final SubLObject current_modules = sksi_supported_mt_cache_entry_modules(current_entry);
                if (sksi_sks_mt_indexing.NIL != sksi_sks_indexing_utilities.sksi_query_forms_unifyP(new_query_form, current_query_form)) {
                    _csetf_sksi_mt_entry_modules(current_entry, ConsesLow.append(current_modules, new_modules));
                    _csetf_sksi_mt_entry_count(current_entry, sksi_external_browser_utilities.sksi_compute_count_for_external_browser_cache_entry_merge(sksi_mt_entry_count(current_entry), new_count));
                    mergedP = (SubLObject)sksi_sks_mt_indexing.T;
                }
                csome_list_var = csome_list_var.rest();
                current_entry = csome_list_var.first();
            }
        }
        if (sksi_sks_mt_indexing.NIL == mergedP) {
            dictionary_utilities.dictionary_add_to_value_sorted(sksi_sks_mt_indexing.$sksi_supported_mt_cache$.getGlobalValue(), mt, entry, (SubLObject)sksi_sks_mt_indexing.$sym29$SKSI_TERM___W__CONSTANTS_BY_NAME_ON, (SubLObject)sksi_sks_mt_indexing.$sym30$SKSI_SUPPORTED_MT_CACHE_ENTRY_PREDICATE);
        }
        return sksi_supported_mt_cache_lookup(mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 5396L)
    public static SubLObject sksi_supported_mt_cache_remove(final SubLObject mt, final SubLObject entry, final SubLObject module, final SubLObject count) {
        final SubLObject entry_modules = sksi_supported_mt_cache_entry_modules(entry);
        SubLObject removedP = (SubLObject)sksi_sks_mt_indexing.NIL;
        if (sksi_sks_mt_indexing.NIL != subl_promotions.memberP(module, entry_modules, (SubLObject)sksi_sks_mt_indexing.UNPROVIDED, (SubLObject)sksi_sks_mt_indexing.UNPROVIDED)) {
            if (sksi_sks_mt_indexing.NIL != list_utilities.singletonP(entry_modules)) {
                dictionary_utilities.dictionary_delete_from_value(sksi_sks_mt_indexing.$sksi_supported_mt_cache$.getGlobalValue(), mt, entry, Symbols.symbol_function((SubLObject)sksi_sks_mt_indexing.EQUALP), (SubLObject)sksi_sks_mt_indexing.UNPROVIDED);
            }
            else {
                _csetf_sksi_mt_entry_modules(entry, Sequences.remove(module, entry_modules, (SubLObject)sksi_sks_mt_indexing.UNPROVIDED, (SubLObject)sksi_sks_mt_indexing.UNPROVIDED, (SubLObject)sksi_sks_mt_indexing.UNPROVIDED, (SubLObject)sksi_sks_mt_indexing.UNPROVIDED, (SubLObject)sksi_sks_mt_indexing.UNPROVIDED));
                _csetf_sksi_mt_entry_count(entry, sksi_external_browser_utilities.sksi_compute_count_for_external_browser_cache_entry_demerge(sksi_mt_entry_count(entry), count));
            }
            removedP = (SubLObject)sksi_sks_mt_indexing.T;
        }
        return removedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 6248L)
    public static SubLObject sksi_supported_mt_cache_entries_for_mt(final SubLObject mt) {
        return sksi_supported_mt_cache_lookup(mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 6386L)
    public static SubLObject sksi_supported_mt_predicate_list_for_mt(final SubLObject mt) {
        return list_utilities.fast_delete_duplicates(Mapping.mapcar((SubLObject)sksi_sks_mt_indexing.$sym30$SKSI_SUPPORTED_MT_CACHE_ENTRY_PREDICATE, sksi_supported_mt_cache_entries_for_mt(mt)), (SubLObject)sksi_sks_mt_indexing.UNPROVIDED, (SubLObject)sksi_sks_mt_indexing.UNPROVIDED, (SubLObject)sksi_sks_mt_indexing.UNPROVIDED, (SubLObject)sksi_sks_mt_indexing.UNPROVIDED, (SubLObject)sksi_sks_mt_indexing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 6589L)
    public static SubLObject sksi_supported_mt_predicate_count_pairs_for_mt(final SubLObject mt) {
        if (sksi_sks_mt_indexing.NIL == content_mt_of_activated_external_sourceP(mt)) {
            return (SubLObject)sksi_sks_mt_indexing.NIL;
        }
        final SubLObject cache_entries = sksi_supported_mt_cache_entries_for_mt(mt);
        SubLObject predicate_count_pairs = (SubLObject)sksi_sks_mt_indexing.NIL;
        SubLObject cdolist_list_var = cache_entries;
        SubLObject entry = (SubLObject)sksi_sks_mt_indexing.NIL;
        entry = cdolist_list_var.first();
        while (sksi_sks_mt_indexing.NIL != cdolist_list_var) {
            final SubLObject predicate = sksi_supported_mt_cache_entry_predicate(entry);
            SubLObject count = sksi_supported_mt_cache_entry_count(entry);
            final SubLObject last_entry = predicate_count_pairs.first();
            final SubLObject last_entry_pred = last_entry.first();
            final SubLObject last_entry_count = conses_high.second(last_entry);
            if (predicate.eql(last_entry_pred)) {
                if (last_entry_count.isInteger()) {
                    if (count.isInteger()) {
                        count = Numbers.add(count, last_entry_count);
                    }
                    else {
                        count = last_entry_count;
                    }
                }
                predicate_count_pairs = ConsesLow.rplaca(predicate_count_pairs, (SubLObject)ConsesLow.list(predicate, count));
            }
            else {
                predicate_count_pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(predicate, count), predicate_count_pairs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return Sequences.nreverse(predicate_count_pairs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 7703L)
    public static SubLObject sksi_supported_mt_cache_entries_for_mt_and_predicate(final SubLObject mt, final SubLObject predicate) {
        final SubLObject cache_entries_for_mt = sksi_supported_mt_cache_entries_for_mt(mt);
        return list_utilities.find_all(predicate, cache_entries_for_mt, (SubLObject)sksi_sks_mt_indexing.EQL, (SubLObject)sksi_sks_mt_indexing.$sym30$SKSI_SUPPORTED_MT_CACHE_ENTRY_PREDICATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 7965L)
    public static SubLObject gather_query_form_module_list_pairs_from_sksi_supported_mt_cache_entries_for_mt_and_predicate(final SubLObject mt, final SubLObject predicate) {
        final SubLObject cache_entries_for_mt = sksi_supported_mt_cache_entries_for_mt(mt);
        SubLObject query_form_module_list_pairs = (SubLObject)sksi_sks_mt_indexing.NIL;
        SubLObject cdolist_list_var = cache_entries_for_mt;
        SubLObject entry = (SubLObject)sksi_sks_mt_indexing.NIL;
        entry = cdolist_list_var.first();
        while (sksi_sks_mt_indexing.NIL != cdolist_list_var) {
            if (predicate.eql(sksi_supported_mt_cache_entry_predicate(entry))) {
                query_form_module_list_pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(sksi_supported_mt_cache_entry_query_form(entry), sksi_supported_mt_cache_entry_modules(entry)), query_form_module_list_pairs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return Sequences.nreverse(query_form_module_list_pairs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 8535L)
    public static SubLObject sksi_supported_mtP(final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_sks_mt_indexing.NIL != sksi_supported_mt_cache_lookup(mt) && sksi_sks_mt_indexing.NIL != content_mt_of_activated_external_sourceP(mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 8883L)
    public static SubLObject content_mt_of_activated_external_sourceP_internal(final SubLObject mt) {
        return sksi_infrastructure_utilities.external_source_activated_in_imageP(sksi_kb_accessors.content_mt_sk_source_in_any_mt(mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 8883L)
    public static SubLObject content_mt_of_activated_external_sourceP(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_sks_mt_indexing.NIL;
        if (sksi_sks_mt_indexing.NIL == v_memoization_state) {
            return content_mt_of_activated_external_sourceP_internal(mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_sks_mt_indexing.$sym31$CONTENT_MT_OF_ACTIVATED_EXTERNAL_SOURCE_, (SubLObject)sksi_sks_mt_indexing.UNPROVIDED);
        if (sksi_sks_mt_indexing.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_sks_mt_indexing.$sym31$CONTENT_MT_OF_ACTIVATED_EXTERNAL_SOURCE_, (SubLObject)sksi_sks_mt_indexing.ONE_INTEGER, (SubLObject)sksi_sks_mt_indexing.NIL, (SubLObject)sksi_sks_mt_indexing.EQUAL, (SubLObject)sksi_sks_mt_indexing.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_sks_mt_indexing.$sym31$CONTENT_MT_OF_ACTIVATED_EXTERNAL_SOURCE_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(content_mt_of_activated_external_sourceP_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, (SubLObject)sksi_sks_mt_indexing.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 9082L)
    public static SubLObject register_sksi_supported_mt(final SubLObject mt, final SubLObject pred_list, final SubLObject required_pattern, final SubLObject count, final SubLObject module) {
        final SubLObject query_form = sksi_external_browser_utilities.sksi_create_query_form_from_required_pattern(required_pattern);
        if (sksi_sks_mt_indexing.NIL != query_form) {
            SubLObject cdolist_list_var = pred_list;
            SubLObject pred = (SubLObject)sksi_sks_mt_indexing.NIL;
            pred = cdolist_list_var.first();
            while (sksi_sks_mt_indexing.NIL != cdolist_list_var) {
                if (sksi_sks_mt_indexing.NIL != sksi_infrastructure_utilities.sksi_supported_predicate_type_p(pred, (SubLObject)sksi_sks_mt_indexing.UNPROVIDED)) {
                    register_sksi_supported_mt_int(mt, pred, query_form, count, module);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            }
        }
        return (SubLObject)sksi_sks_mt_indexing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 9637L)
    public static SubLObject register_sksi_supported_mt_int(final SubLObject mt, final SubLObject pred, final SubLObject query_form, final SubLObject count, final SubLObject module) {
        final SubLObject cache_entry_query_form = el_utilities.make_el_formula(pred, cycl_utilities.formula_args(query_form, (SubLObject)sksi_sks_mt_indexing.UNPROVIDED), (SubLObject)sksi_sks_mt_indexing.UNPROVIDED);
        final SubLObject cache_entry = new_sksi_supported_mt_cache_entry(pred, cache_entry_query_form, count, module);
        return sksi_supported_mt_cache_enter(mt, cache_entry);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mt-indexing.lisp", position = 9955L)
    public static SubLObject deregister_sksi_supported_mt(final SubLObject mt, final SubLObject pred, final SubLObject module, final SubLObject count) {
        SubLObject cdolist_list_var;
        final SubLObject cache_entries = cdolist_list_var = sksi_supported_mt_cache_entries_for_mt_and_predicate(mt, pred);
        SubLObject entry = (SubLObject)sksi_sks_mt_indexing.NIL;
        entry = cdolist_list_var.first();
        while (sksi_sks_mt_indexing.NIL != cdolist_list_var) {
            sksi_supported_mt_cache_remove(mt, entry, module, count);
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return sksi_supported_mt_cache_entries_for_mt(mt);
    }
    
    public static SubLObject declare_sksi_sks_mt_indexing_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "sksi_supported_mt_cache_entry_print_function_trampoline", "SKSI-SUPPORTED-MT-CACHE-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "sksi_supported_mt_cache_entry_p", "SKSI-SUPPORTED-MT-CACHE-ENTRY-P", 1, 0, false);
        new $sksi_supported_mt_cache_entry_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "sksi_mt_entry_query_form", "SKSI-MT-ENTRY-QUERY-FORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "sksi_mt_entry_predicate", "SKSI-MT-ENTRY-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "sksi_mt_entry_count", "SKSI-MT-ENTRY-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "sksi_mt_entry_modules", "SKSI-MT-ENTRY-MODULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "_csetf_sksi_mt_entry_query_form", "_CSETF-SKSI-MT-ENTRY-QUERY-FORM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "_csetf_sksi_mt_entry_predicate", "_CSETF-SKSI-MT-ENTRY-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "_csetf_sksi_mt_entry_count", "_CSETF-SKSI-MT-ENTRY-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "_csetf_sksi_mt_entry_modules", "_CSETF-SKSI-MT-ENTRY-MODULES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "make_sksi_supported_mt_cache_entry", "MAKE-SKSI-SUPPORTED-MT-CACHE-ENTRY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "visit_defstruct_sksi_supported_mt_cache_entry", "VISIT-DEFSTRUCT-SKSI-SUPPORTED-MT-CACHE-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "visit_defstruct_object_sksi_supported_mt_cache_entry_method", "VISIT-DEFSTRUCT-OBJECT-SKSI-SUPPORTED-MT-CACHE-ENTRY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "new_sksi_supported_mt_cache_entry", "NEW-SKSI-SUPPORTED-MT-CACHE-ENTRY", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "sksi_supported_mt_cache_entry_query_form", "SKSI-SUPPORTED-MT-CACHE-ENTRY-QUERY-FORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "sksi_supported_mt_cache_entry_predicate", "SKSI-SUPPORTED-MT-CACHE-ENTRY-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "sksi_supported_mt_cache_entry_count", "SKSI-SUPPORTED-MT-CACHE-ENTRY-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "sksi_supported_mt_cache_entry_modules", "SKSI-SUPPORTED-MT-CACHE-ENTRY-MODULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "print_sksi_supported_mt_cache_entry", "PRINT-SKSI-SUPPORTED-MT-CACHE-ENTRY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "clear_sksi_supported_mt_cache", "CLEAR-SKSI-SUPPORTED-MT-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "sksi_supported_mt_cache_lookup", "SKSI-SUPPORTED-MT-CACHE-LOOKUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "sksi_supported_mt_browsing_registeredP", "SKSI-SUPPORTED-MT-BROWSING-REGISTERED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "sksi_supported_mt_cache_enter", "SKSI-SUPPORTED-MT-CACHE-ENTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "sksi_supported_mt_cache_remove", "SKSI-SUPPORTED-MT-CACHE-REMOVE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "sksi_supported_mt_cache_entries_for_mt", "SKSI-SUPPORTED-MT-CACHE-ENTRIES-FOR-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "sksi_supported_mt_predicate_list_for_mt", "SKSI-SUPPORTED-MT-PREDICATE-LIST-FOR-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "sksi_supported_mt_predicate_count_pairs_for_mt", "SKSI-SUPPORTED-MT-PREDICATE-COUNT-PAIRS-FOR-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "sksi_supported_mt_cache_entries_for_mt_and_predicate", "SKSI-SUPPORTED-MT-CACHE-ENTRIES-FOR-MT-AND-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "gather_query_form_module_list_pairs_from_sksi_supported_mt_cache_entries_for_mt_and_predicate", "GATHER-QUERY-FORM-MODULE-LIST-PAIRS-FROM-SKSI-SUPPORTED-MT-CACHE-ENTRIES-FOR-MT-AND-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "sksi_supported_mtP", "SKSI-SUPPORTED-MT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "content_mt_of_activated_external_sourceP_internal", "CONTENT-MT-OF-ACTIVATED-EXTERNAL-SOURCE?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "content_mt_of_activated_external_sourceP", "CONTENT-MT-OF-ACTIVATED-EXTERNAL-SOURCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "register_sksi_supported_mt", "REGISTER-SKSI-SUPPORTED-MT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "register_sksi_supported_mt_int", "REGISTER-SKSI-SUPPORTED-MT-INT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing", "deregister_sksi_supported_mt", "DEREGISTER-SKSI-SUPPORTED-MT", 4, 0, false);
        return (SubLObject)sksi_sks_mt_indexing.NIL;
    }
    
    public static SubLObject init_sksi_sks_mt_indexing_file() {
        sksi_sks_mt_indexing.$dtp_sksi_supported_mt_cache_entry$ = SubLFiles.defconstant("*DTP-SKSI-SUPPORTED-MT-CACHE-ENTRY*", (SubLObject)sksi_sks_mt_indexing.$sym0$SKSI_SUPPORTED_MT_CACHE_ENTRY);
        sksi_sks_mt_indexing.$sksi_supported_mt_cache$ = SubLFiles.deflexical("*SKSI-SUPPORTED-MT-CACHE*", (sksi_sks_mt_indexing.NIL != Symbols.boundp((SubLObject)sksi_sks_mt_indexing.$sym28$_SKSI_SUPPORTED_MT_CACHE_)) ? sksi_sks_mt_indexing.$sksi_supported_mt_cache$.getGlobalValue() : dictionary.new_dictionary((SubLObject)sksi_sks_mt_indexing.EQUAL, (SubLObject)sksi_sks_mt_indexing.UNPROVIDED));
        return (SubLObject)sksi_sks_mt_indexing.NIL;
    }
    
    public static SubLObject setup_sksi_sks_mt_indexing_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), sksi_sks_mt_indexing.$dtp_sksi_supported_mt_cache_entry$.getGlobalValue(), Symbols.symbol_function((SubLObject)sksi_sks_mt_indexing.$sym7$SKSI_SUPPORTED_MT_CACHE_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)sksi_sks_mt_indexing.$list8);
        Structures.def_csetf((SubLObject)sksi_sks_mt_indexing.$sym9$SKSI_MT_ENTRY_QUERY_FORM, (SubLObject)sksi_sks_mt_indexing.$sym10$_CSETF_SKSI_MT_ENTRY_QUERY_FORM);
        Structures.def_csetf((SubLObject)sksi_sks_mt_indexing.$sym11$SKSI_MT_ENTRY_PREDICATE, (SubLObject)sksi_sks_mt_indexing.$sym12$_CSETF_SKSI_MT_ENTRY_PREDICATE);
        Structures.def_csetf((SubLObject)sksi_sks_mt_indexing.$sym13$SKSI_MT_ENTRY_COUNT, (SubLObject)sksi_sks_mt_indexing.$sym14$_CSETF_SKSI_MT_ENTRY_COUNT);
        Structures.def_csetf((SubLObject)sksi_sks_mt_indexing.$sym15$SKSI_MT_ENTRY_MODULES, (SubLObject)sksi_sks_mt_indexing.$sym16$_CSETF_SKSI_MT_ENTRY_MODULES);
        Equality.identity((SubLObject)sksi_sks_mt_indexing.$sym0$SKSI_SUPPORTED_MT_CACHE_ENTRY);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sksi_sks_mt_indexing.$dtp_sksi_supported_mt_cache_entry$.getGlobalValue(), Symbols.symbol_function((SubLObject)sksi_sks_mt_indexing.$sym26$VISIT_DEFSTRUCT_OBJECT_SKSI_SUPPORTED_MT_CACHE_ENTRY_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)sksi_sks_mt_indexing.$sym28$_SKSI_SUPPORTED_MT_CACHE_);
        memoization_state.note_memoized_function((SubLObject)sksi_sks_mt_indexing.$sym31$CONTENT_MT_OF_ACTIVATED_EXTERNAL_SOURCE_);
        return (SubLObject)sksi_sks_mt_indexing.NIL;
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
        me = (SubLFile)new sksi_sks_mt_indexing();
        sksi_sks_mt_indexing.$dtp_sksi_supported_mt_cache_entry$ = null;
        sksi_sks_mt_indexing.$sksi_supported_mt_cache$ = null;
        $sym0$SKSI_SUPPORTED_MT_CACHE_ENTRY = SubLObjectFactory.makeSymbol("SKSI-SUPPORTED-MT-CACHE-ENTRY");
        $sym1$SKSI_SUPPORTED_MT_CACHE_ENTRY_P = SubLObjectFactory.makeSymbol("SKSI-SUPPORTED-MT-CACHE-ENTRY-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("MODULES"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUERY-FORM"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("MODULES"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SKSI-MT-ENTRY-QUERY-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("SKSI-MT-ENTRY-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("SKSI-MT-ENTRY-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("SKSI-MT-ENTRY-MODULES"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SKSI-MT-ENTRY-QUERY-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SKSI-MT-ENTRY-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SKSI-MT-ENTRY-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SKSI-MT-ENTRY-MODULES"));
        $sym6$PRINT_SKSI_SUPPORTED_MT_CACHE_ENTRY = SubLObjectFactory.makeSymbol("PRINT-SKSI-SUPPORTED-MT-CACHE-ENTRY");
        $sym7$SKSI_SUPPORTED_MT_CACHE_ENTRY_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SKSI-SUPPORTED-MT-CACHE-ENTRY-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SKSI-SUPPORTED-MT-CACHE-ENTRY-P"));
        $sym9$SKSI_MT_ENTRY_QUERY_FORM = SubLObjectFactory.makeSymbol("SKSI-MT-ENTRY-QUERY-FORM");
        $sym10$_CSETF_SKSI_MT_ENTRY_QUERY_FORM = SubLObjectFactory.makeSymbol("_CSETF-SKSI-MT-ENTRY-QUERY-FORM");
        $sym11$SKSI_MT_ENTRY_PREDICATE = SubLObjectFactory.makeSymbol("SKSI-MT-ENTRY-PREDICATE");
        $sym12$_CSETF_SKSI_MT_ENTRY_PREDICATE = SubLObjectFactory.makeSymbol("_CSETF-SKSI-MT-ENTRY-PREDICATE");
        $sym13$SKSI_MT_ENTRY_COUNT = SubLObjectFactory.makeSymbol("SKSI-MT-ENTRY-COUNT");
        $sym14$_CSETF_SKSI_MT_ENTRY_COUNT = SubLObjectFactory.makeSymbol("_CSETF-SKSI-MT-ENTRY-COUNT");
        $sym15$SKSI_MT_ENTRY_MODULES = SubLObjectFactory.makeSymbol("SKSI-MT-ENTRY-MODULES");
        $sym16$_CSETF_SKSI_MT_ENTRY_MODULES = SubLObjectFactory.makeSymbol("_CSETF-SKSI-MT-ENTRY-MODULES");
        $kw17$QUERY_FORM = SubLObjectFactory.makeKeyword("QUERY-FORM");
        $kw18$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $kw19$COUNT = SubLObjectFactory.makeKeyword("COUNT");
        $kw20$MODULES = SubLObjectFactory.makeKeyword("MODULES");
        $str21$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw22$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym23$MAKE_SKSI_SUPPORTED_MT_CACHE_ENTRY = SubLObjectFactory.makeSymbol("MAKE-SKSI-SUPPORTED-MT-CACHE-ENTRY");
        $kw24$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw25$END = SubLObjectFactory.makeKeyword("END");
        $sym26$VISIT_DEFSTRUCT_OBJECT_SKSI_SUPPORTED_MT_CACHE_ENTRY_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SKSI-SUPPORTED-MT-CACHE-ENTRY-METHOD");
        $str27$__MCE__s__s__s__s_ = SubLObjectFactory.makeString("#<MCE:~s:~s:~s:~s>");
        $sym28$_SKSI_SUPPORTED_MT_CACHE_ = SubLObjectFactory.makeSymbol("*SKSI-SUPPORTED-MT-CACHE*");
        $sym29$SKSI_TERM___W__CONSTANTS_BY_NAME_ON = SubLObjectFactory.makeSymbol("SKSI-TERM-<-W/-CONSTANTS-BY-NAME-ON");
        $sym30$SKSI_SUPPORTED_MT_CACHE_ENTRY_PREDICATE = SubLObjectFactory.makeSymbol("SKSI-SUPPORTED-MT-CACHE-ENTRY-PREDICATE");
        $sym31$CONTENT_MT_OF_ACTIVATED_EXTERNAL_SOURCE_ = SubLObjectFactory.makeSymbol("CONTENT-MT-OF-ACTIVATED-EXTERNAL-SOURCE?");
    }
    
    public static final class $sksi_supported_mt_cache_entry_native extends SubLStructNative
    {
        public SubLObject $query_form;
        public SubLObject $predicate;
        public SubLObject $count;
        public SubLObject $modules;
        private static final SubLStructDeclNative structDecl;
        
        public $sksi_supported_mt_cache_entry_native() {
            this.$query_form = (SubLObject)CommonSymbols.NIL;
            this.$predicate = (SubLObject)CommonSymbols.NIL;
            this.$count = (SubLObject)CommonSymbols.NIL;
            this.$modules = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sksi_supported_mt_cache_entry_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$sksi_supported_mt_cache_entry_native.class, sksi_sks_mt_indexing.$sym0$SKSI_SUPPORTED_MT_CACHE_ENTRY, sksi_sks_mt_indexing.$sym1$SKSI_SUPPORTED_MT_CACHE_ENTRY_P, sksi_sks_mt_indexing.$list2, sksi_sks_mt_indexing.$list3, new String[] { "$query_form", "$predicate", "$count", "$modules" }, sksi_sks_mt_indexing.$list4, sksi_sks_mt_indexing.$list5, sksi_sks_mt_indexing.$sym6$PRINT_SKSI_SUPPORTED_MT_CACHE_ENTRY);
        }
    }
    
    public static final class $sksi_supported_mt_cache_entry_p$UnaryFunction extends UnaryFunction
    {
        public $sksi_supported_mt_cache_entry_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SKSI-SUPPORTED-MT-CACHE-ENTRY-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return sksi_sks_mt_indexing.sksi_supported_mt_cache_entry_p(arg1);
        }
    }
}

/*

	Total time: 164 ms
	
*/