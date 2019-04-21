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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_browser_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_sks_gaf_arg_indexing extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing";
    public static final String myFingerPrint = "0a8811e220eb851d500a38f9c5cb93873413d726ca68c66ea71ee1268191009b";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 2173L)
    public static SubLSymbol $dtp_sksi_supported_gaf_argument_cache_entry$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 4346L)
    private static SubLSymbol $sksi_supported_gaf_argument_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 19031L)
    private static SubLSymbol $sksi_default_count_for_term_argnum_pred$;
    private static final SubLSymbol $sym0$SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY;
    private static final SubLSymbol $sym1$SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY;
    private static final SubLSymbol $sym7$SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$SKSI_GAF_ARG_ENTRY_ARGUMENT_POSITION;
    private static final SubLSymbol $sym10$_CSETF_SKSI_GAF_ARG_ENTRY_ARGUMENT_POSITION;
    private static final SubLSymbol $sym11$SKSI_GAF_ARG_ENTRY_QUERY_FORM;
    private static final SubLSymbol $sym12$_CSETF_SKSI_GAF_ARG_ENTRY_QUERY_FORM;
    private static final SubLSymbol $sym13$SKSI_GAF_ARG_ENTRY_PREDICATE;
    private static final SubLSymbol $sym14$_CSETF_SKSI_GAF_ARG_ENTRY_PREDICATE;
    private static final SubLSymbol $sym15$SKSI_GAF_ARG_ENTRY_MT;
    private static final SubLSymbol $sym16$_CSETF_SKSI_GAF_ARG_ENTRY_MT;
    private static final SubLSymbol $sym17$SKSI_GAF_ARG_ENTRY_COUNT;
    private static final SubLSymbol $sym18$_CSETF_SKSI_GAF_ARG_ENTRY_COUNT;
    private static final SubLSymbol $sym19$SKSI_GAF_ARG_ENTRY_MODULES;
    private static final SubLSymbol $sym20$_CSETF_SKSI_GAF_ARG_ENTRY_MODULES;
    private static final SubLSymbol $kw21$ARGUMENT_POSITION;
    private static final SubLSymbol $kw22$QUERY_FORM;
    private static final SubLSymbol $kw23$PREDICATE;
    private static final SubLSymbol $kw24$MT;
    private static final SubLSymbol $kw25$COUNT;
    private static final SubLSymbol $kw26$MODULES;
    private static final SubLString $str27$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw28$BEGIN;
    private static final SubLSymbol $sym29$MAKE_SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY;
    private static final SubLSymbol $kw30$SLOT;
    private static final SubLSymbol $kw31$END;
    private static final SubLSymbol $sym32$VISIT_DEFSTRUCT_OBJECT_SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_ME;
    private static final SubLSymbol $sym33$SXHASH_SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_METHOD;
    private static final SubLString $str34$__GACE__s__s__s__s__s__s_;
    private static final SubLSymbol $sym35$_SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_;
    private static final SubLSymbol $sym36$SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_PREDICATE;
    private static final SubLSymbol $sym37$SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_MT;
    private static final SubLSymbol $sym38$HLMT_EQUAL;
    private static final SubLList $list39;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 2173L)
    public static SubLObject sksi_supported_gaf_argument_cache_entry_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sksi_supported_gaf_argument_cache_entry(v_object, stream, (SubLObject)sksi_sks_gaf_arg_indexing.ZERO_INTEGER);
        return (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 2173L)
    public static SubLObject sksi_supported_gaf_argument_cache_entry_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sksi_supported_gaf_argument_cache_entry_native.class) ? sksi_sks_gaf_arg_indexing.T : sksi_sks_gaf_arg_indexing.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 2173L)
    public static SubLObject sksi_gaf_arg_entry_argument_position(final SubLObject v_object) {
        assert sksi_sks_gaf_arg_indexing.NIL != sksi_supported_gaf_argument_cache_entry_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 2173L)
    public static SubLObject sksi_gaf_arg_entry_query_form(final SubLObject v_object) {
        assert sksi_sks_gaf_arg_indexing.NIL != sksi_supported_gaf_argument_cache_entry_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 2173L)
    public static SubLObject sksi_gaf_arg_entry_predicate(final SubLObject v_object) {
        assert sksi_sks_gaf_arg_indexing.NIL != sksi_supported_gaf_argument_cache_entry_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 2173L)
    public static SubLObject sksi_gaf_arg_entry_mt(final SubLObject v_object) {
        assert sksi_sks_gaf_arg_indexing.NIL != sksi_supported_gaf_argument_cache_entry_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 2173L)
    public static SubLObject sksi_gaf_arg_entry_count(final SubLObject v_object) {
        assert sksi_sks_gaf_arg_indexing.NIL != sksi_supported_gaf_argument_cache_entry_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 2173L)
    public static SubLObject sksi_gaf_arg_entry_modules(final SubLObject v_object) {
        assert sksi_sks_gaf_arg_indexing.NIL != sksi_supported_gaf_argument_cache_entry_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 2173L)
    public static SubLObject _csetf_sksi_gaf_arg_entry_argument_position(final SubLObject v_object, final SubLObject value) {
        assert sksi_sks_gaf_arg_indexing.NIL != sksi_supported_gaf_argument_cache_entry_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 2173L)
    public static SubLObject _csetf_sksi_gaf_arg_entry_query_form(final SubLObject v_object, final SubLObject value) {
        assert sksi_sks_gaf_arg_indexing.NIL != sksi_supported_gaf_argument_cache_entry_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 2173L)
    public static SubLObject _csetf_sksi_gaf_arg_entry_predicate(final SubLObject v_object, final SubLObject value) {
        assert sksi_sks_gaf_arg_indexing.NIL != sksi_supported_gaf_argument_cache_entry_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 2173L)
    public static SubLObject _csetf_sksi_gaf_arg_entry_mt(final SubLObject v_object, final SubLObject value) {
        assert sksi_sks_gaf_arg_indexing.NIL != sksi_supported_gaf_argument_cache_entry_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 2173L)
    public static SubLObject _csetf_sksi_gaf_arg_entry_count(final SubLObject v_object, final SubLObject value) {
        assert sksi_sks_gaf_arg_indexing.NIL != sksi_supported_gaf_argument_cache_entry_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 2173L)
    public static SubLObject _csetf_sksi_gaf_arg_entry_modules(final SubLObject v_object, final SubLObject value) {
        assert sksi_sks_gaf_arg_indexing.NIL != sksi_supported_gaf_argument_cache_entry_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 2173L)
    public static SubLObject make_sksi_supported_gaf_argument_cache_entry(SubLObject arglist) {
        if (arglist == sksi_sks_gaf_arg_indexing.UNPROVIDED) {
            arglist = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sksi_supported_gaf_argument_cache_entry_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)sksi_sks_gaf_arg_indexing.NIL, next = arglist; sksi_sks_gaf_arg_indexing.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)sksi_sks_gaf_arg_indexing.$kw21$ARGUMENT_POSITION)) {
                _csetf_sksi_gaf_arg_entry_argument_position(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_sks_gaf_arg_indexing.$kw22$QUERY_FORM)) {
                _csetf_sksi_gaf_arg_entry_query_form(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_sks_gaf_arg_indexing.$kw23$PREDICATE)) {
                _csetf_sksi_gaf_arg_entry_predicate(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_sks_gaf_arg_indexing.$kw24$MT)) {
                _csetf_sksi_gaf_arg_entry_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_sks_gaf_arg_indexing.$kw25$COUNT)) {
                _csetf_sksi_gaf_arg_entry_count(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_sks_gaf_arg_indexing.$kw26$MODULES)) {
                _csetf_sksi_gaf_arg_entry_modules(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)sksi_sks_gaf_arg_indexing.$str27$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 2173L)
    public static SubLObject visit_defstruct_sksi_supported_gaf_argument_cache_entry(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_sks_gaf_arg_indexing.$kw28$BEGIN, (SubLObject)sksi_sks_gaf_arg_indexing.$sym29$MAKE_SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY, (SubLObject)sksi_sks_gaf_arg_indexing.SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_sks_gaf_arg_indexing.$kw30$SLOT, (SubLObject)sksi_sks_gaf_arg_indexing.$kw21$ARGUMENT_POSITION, sksi_gaf_arg_entry_argument_position(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_sks_gaf_arg_indexing.$kw30$SLOT, (SubLObject)sksi_sks_gaf_arg_indexing.$kw22$QUERY_FORM, sksi_gaf_arg_entry_query_form(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_sks_gaf_arg_indexing.$kw30$SLOT, (SubLObject)sksi_sks_gaf_arg_indexing.$kw23$PREDICATE, sksi_gaf_arg_entry_predicate(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_sks_gaf_arg_indexing.$kw30$SLOT, (SubLObject)sksi_sks_gaf_arg_indexing.$kw24$MT, sksi_gaf_arg_entry_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_sks_gaf_arg_indexing.$kw30$SLOT, (SubLObject)sksi_sks_gaf_arg_indexing.$kw25$COUNT, sksi_gaf_arg_entry_count(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_sks_gaf_arg_indexing.$kw30$SLOT, (SubLObject)sksi_sks_gaf_arg_indexing.$kw26$MODULES, sksi_gaf_arg_entry_modules(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_sks_gaf_arg_indexing.$kw31$END, (SubLObject)sksi_sks_gaf_arg_indexing.$sym29$MAKE_SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY, (SubLObject)sksi_sks_gaf_arg_indexing.SIX_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 2173L)
    public static SubLObject visit_defstruct_object_sksi_supported_gaf_argument_cache_entry_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sksi_supported_gaf_argument_cache_entry(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 2406L)
    public static SubLObject sxhash_sksi_supported_gaf_argument_cache_entry_method(final SubLObject v_object) {
        return Sxhash.sxhash(sksi_gaf_arg_entry_predicate(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 2536L)
    public static SubLObject new_sksi_supported_gaf_argument_cache_entry(final SubLObject argument_position, final SubLObject query_form, final SubLObject predicate, final SubLObject mt, final SubLObject count, final SubLObject module) {
        final SubLObject entry = make_sksi_supported_gaf_argument_cache_entry((SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED);
        _csetf_sksi_gaf_arg_entry_argument_position(entry, argument_position);
        _csetf_sksi_gaf_arg_entry_query_form(entry, query_form);
        _csetf_sksi_gaf_arg_entry_predicate(entry, predicate);
        _csetf_sksi_gaf_arg_entry_mt(entry, mt);
        _csetf_sksi_gaf_arg_entry_count(entry, count);
        _csetf_sksi_gaf_arg_entry_modules(entry, (SubLObject)ConsesLow.list(module));
        return entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 3093L)
    public static SubLObject sksi_supported_gaf_argument_cache_entry_argument_position(final SubLObject entry) {
        return sksi_gaf_arg_entry_argument_position(entry);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 3230L)
    public static SubLObject sksi_supported_gaf_argument_cache_entry_query_form(final SubLObject entry) {
        return sksi_gaf_arg_entry_query_form(entry);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 3353L)
    public static SubLObject sksi_supported_gaf_argument_cache_entry_predicate(final SubLObject entry) {
        return sksi_gaf_arg_entry_predicate(entry);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 3474L)
    public static SubLObject sksi_supported_gaf_argument_cache_entry_mt(final SubLObject entry) {
        return sksi_gaf_arg_entry_mt(entry);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 3581L)
    public static SubLObject sksi_supported_gaf_argument_cache_entry_count(final SubLObject entry) {
        return sksi_gaf_arg_entry_count(entry);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 3694L)
    public static SubLObject sksi_supported_gaf_argument_cache_entry_modules(final SubLObject entry) {
        return sksi_gaf_arg_entry_modules(entry);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 3811L)
    public static SubLObject print_sksi_supported_gaf_argument_cache_entry(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)sksi_sks_gaf_arg_indexing.$str34$__GACE__s__s__s__s__s__s_, new SubLObject[] { sksi_supported_gaf_argument_cache_entry_argument_position(v_object), sksi_supported_gaf_argument_cache_entry_query_form(v_object), sksi_supported_gaf_argument_cache_entry_predicate(v_object), sksi_supported_gaf_argument_cache_entry_mt(v_object), sksi_supported_gaf_argument_cache_entry_count(v_object), sksi_supported_gaf_argument_cache_entry_modules(v_object) });
        return (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 5512L)
    public static SubLObject clear_sksi_supported_gaf_argument_cache() {
        return dictionary.clear_dictionary(sksi_sks_gaf_arg_indexing.$sksi_supported_gaf_argument_cache$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 5904L)
    public static SubLObject sksi_supported_gaf_argument_cache_lookup(final SubLObject v_term) {
        return dictionary.dictionary_lookup_without_values(sksi_sks_gaf_arg_indexing.$sksi_supported_gaf_argument_cache$.getGlobalValue(), v_term, (SubLObject)sksi_sks_gaf_arg_indexing.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 6058L)
    public static SubLObject sksi_supported_gaf_argument_browsing_registeredP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_sks_gaf_arg_indexing.NIL == dictionary.dictionary_empty_p(sksi_sks_gaf_arg_indexing.$sksi_supported_gaf_argument_cache$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 6202L)
    public static SubLObject new_sksi_supported_gaf_argument_arg_position_cache() {
        return set.new_set(Symbols.symbol_function((SubLObject)sksi_sks_gaf_arg_indexing.EQUAL), (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 6300L)
    public static SubLObject sksi_supported_gaf_argument_cache_enter(final SubLObject v_term, final SubLObject entry, SubLObject v_cache) {
        if (v_cache == sksi_sks_gaf_arg_indexing.UNPROVIDED) {
            v_cache = sksi_sks_gaf_arg_indexing.$sksi_supported_gaf_argument_cache$.getGlobalValue();
        }
        final SubLObject current_entries = sksi_supported_gaf_argument_cache_entries_for_term_argument_position_predicate_mt(v_term, sksi_supported_gaf_argument_cache_entry_argument_position(entry), sksi_supported_gaf_argument_cache_entry_predicate(entry), sksi_supported_gaf_argument_cache_entry_mt(entry));
        if (sksi_sks_gaf_arg_indexing.NIL == sksi_merge_gaf_argument_cache_entry_if_possible(entry, current_entries)) {
            SubLObject cache_for_term = dictionary.dictionary_lookup(v_cache, v_term, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED);
            final SubLObject arg_position = sksi_supported_gaf_argument_cache_entry_argument_position(entry);
            SubLObject cache_for_arg_position = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
            if (sksi_sks_gaf_arg_indexing.NIL == cache_for_term) {
                cache_for_term = dictionary.new_dictionary((SubLObject)sksi_sks_gaf_arg_indexing.EQUAL, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED);
                dictionary.dictionary_enter(v_cache, v_term, cache_for_term);
            }
            cache_for_arg_position = dictionary.dictionary_lookup(cache_for_term, arg_position, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED);
            if (sksi_sks_gaf_arg_indexing.NIL == cache_for_arg_position) {
                cache_for_arg_position = new_sksi_supported_gaf_argument_arg_position_cache();
                dictionary.dictionary_enter(cache_for_term, arg_position, cache_for_arg_position);
            }
            set.set_add(entry, cache_for_arg_position);
        }
        return (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 7820L)
    public static SubLObject sksi_merge_gaf_argument_cache_entry_if_possible(final SubLObject entry, final SubLObject current_entries) {
        final SubLObject new_query_form = sksi_supported_gaf_argument_cache_entry_query_form(entry);
        final SubLObject new_modules = sksi_supported_gaf_argument_cache_entry_modules(entry);
        final SubLObject new_count = sksi_supported_gaf_argument_cache_entry_count(entry);
        SubLObject mergedP = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
        if (sksi_sks_gaf_arg_indexing.NIL == mergedP) {
            SubLObject csome_list_var = current_entries;
            SubLObject current_entry = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
            current_entry = csome_list_var.first();
            while (sksi_sks_gaf_arg_indexing.NIL == mergedP && sksi_sks_gaf_arg_indexing.NIL != csome_list_var) {
                final SubLObject current_query_form = sksi_supported_gaf_argument_cache_entry_query_form(current_entry);
                final SubLObject current_modules = sksi_supported_gaf_argument_cache_entry_modules(current_entry);
                if (sksi_sks_gaf_arg_indexing.NIL != sksi_sks_indexing_utilities.sksi_query_forms_unifyP(new_query_form, current_query_form)) {
                    _csetf_sksi_gaf_arg_entry_modules(current_entry, ConsesLow.append(current_modules, new_modules));
                    _csetf_sksi_gaf_arg_entry_count(current_entry, sksi_external_browser_utilities.sksi_compute_count_for_external_browser_cache_entry_merge(sksi_gaf_arg_entry_count(current_entry), new_count));
                    mergedP = (SubLObject)sksi_sks_gaf_arg_indexing.T;
                }
                csome_list_var = csome_list_var.rest();
                current_entry = csome_list_var.first();
            }
        }
        return mergedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 8964L)
    public static SubLObject sksi_supported_gaf_argument_remove(final SubLObject v_term, final SubLObject entry, final SubLObject module, final SubLObject count, SubLObject v_cache) {
        if (v_cache == sksi_sks_gaf_arg_indexing.UNPROVIDED) {
            v_cache = sksi_sks_gaf_arg_indexing.$sksi_supported_gaf_argument_cache$.getGlobalValue();
        }
        final SubLObject entry_modules = sksi_supported_gaf_argument_cache_entry_modules(entry);
        SubLObject removedP = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
        if (sksi_sks_gaf_arg_indexing.NIL != subl_promotions.memberP(module, entry_modules, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED)) {
            if (sksi_sks_gaf_arg_indexing.NIL != list_utilities.singletonP(entry_modules)) {
                final SubLObject arg_position = sksi_supported_gaf_argument_cache_entry_argument_position(entry);
                final SubLObject cache_for_term = dictionary.dictionary_lookup(v_cache, v_term, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED);
                SubLObject cache_for_arg_position = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
                if (sksi_sks_gaf_arg_indexing.NIL != dictionary.dictionary_p(cache_for_term)) {
                    cache_for_arg_position = dictionary.dictionary_lookup(cache_for_term, arg_position, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED);
                }
                if (sksi_sks_gaf_arg_indexing.NIL != set.set_p(cache_for_arg_position)) {
                    set.set_remove(entry, cache_for_arg_position);
                }
            }
            else {
                _csetf_sksi_gaf_arg_entry_modules(entry, Sequences.remove(module, entry_modules, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED));
                _csetf_sksi_gaf_arg_entry_count(entry, sksi_external_browser_utilities.sksi_compute_count_for_external_browser_cache_entry_demerge(sksi_gaf_arg_entry_count(entry), count));
            }
            removedP = (SubLObject)sksi_sks_gaf_arg_indexing.T;
        }
        return removedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 10233L)
    public static SubLObject sksi_supported_gaf_argument_cache_entries_for_term(final SubLObject v_term, SubLObject mt) {
        if (mt == sksi_sks_gaf_arg_indexing.UNPROVIDED) {
            mt = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term_entries_by_arg_position = sksi_supported_gaf_argument_cache_lookup(v_term);
        SubLObject return_entries = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
        if (sksi_sks_gaf_arg_indexing.NIL != dictionary.dictionary_p(term_entries_by_arg_position)) {
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(term_entries_by_arg_position)); sksi_sks_gaf_arg_indexing.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject entry_set = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject set_contents_var = set.do_set_internal(entry_set);
                SubLObject basis_object;
                SubLObject state;
                SubLObject entry;
                SubLObject cache_entry_mt;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sksi_sks_gaf_arg_indexing.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sksi_sks_gaf_arg_indexing.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    entry = set_contents.do_set_contents_next(basis_object, state);
                    if (sksi_sks_gaf_arg_indexing.NIL != set_contents.do_set_contents_element_validP(state, entry)) {
                        if (sksi_sks_gaf_arg_indexing.NIL != hlmt.hlmt_p(mt)) {
                            cache_entry_mt = sksi_supported_gaf_argument_cache_entry_mt(entry);
                            if (sksi_sks_gaf_arg_indexing.NIL != sksi_sks_mt_indexing.content_mt_of_activated_external_sourceP(cache_entry_mt) && sksi_sks_gaf_arg_indexing.NIL != genl_mts.genl_mtP(mt, cache_entry_mt, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED)) {
                                return_entries = (SubLObject)ConsesLow.cons(entry, return_entries);
                            }
                        }
                        else {
                            return_entries = (SubLObject)ConsesLow.cons(entry, return_entries);
                        }
                    }
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        return Sequences.nreverse(return_entries);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 11301L)
    public static SubLObject sksi_supported_gaf_argument_positions_for_term(final SubLObject v_term, SubLObject mt) {
        if (mt == sksi_sks_gaf_arg_indexing.UNPROVIDED) {
            mt = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
        }
        final SubLObject cache_entries_for_term = sksi_supported_gaf_argument_cache_entries_for_term(v_term, mt);
        SubLObject v_answer = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
        SubLObject cdolist_list_var = cache_entries_for_term;
        SubLObject cache_entry = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
        cache_entry = cdolist_list_var.first();
        while (sksi_sks_gaf_arg_indexing.NIL != cdolist_list_var) {
            v_answer = (SubLObject)ConsesLow.cons(sksi_supported_gaf_argument_cache_entry_argument_position(cache_entry), v_answer);
            cdolist_list_var = cdolist_list_var.rest();
            cache_entry = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(v_answer, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 11907L)
    public static SubLObject sksi_supported_gaf_argument_predicates_for_term_argument_position(final SubLObject v_term, final SubLObject argument_position, SubLObject mt) {
        if (mt == sksi_sks_gaf_arg_indexing.UNPROVIDED) {
            mt = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
        }
        final SubLObject cache_entries_for_term_and_arg = sksi_supported_gaf_argument_cache_entries_for_term_argument_position(v_term, argument_position, mt);
        return list_utilities.fast_delete_duplicates(Mapping.mapcar((SubLObject)sksi_sks_gaf_arg_indexing.$sym36$SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_PREDICATE, cache_entries_for_term_and_arg), (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 12304L)
    public static SubLObject sksi_supported_gaf_argument_cache_entries_for_term_argument_position(final SubLObject v_term, final SubLObject argument_position, SubLObject mt) {
        if (mt == sksi_sks_gaf_arg_indexing.UNPROVIDED) {
            mt = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
        }
        final SubLObject cache_entries_for_term = sksi_supported_gaf_argument_cache_entries_for_term(v_term, mt);
        SubLObject v_answer = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
        SubLObject cdolist_list_var = cache_entries_for_term;
        SubLObject cache_entry = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
        cache_entry = cdolist_list_var.first();
        while (sksi_sks_gaf_arg_indexing.NIL != cdolist_list_var) {
            if (argument_position.eql(sksi_supported_gaf_argument_cache_entry_argument_position(cache_entry))) {
                v_answer = (SubLObject)ConsesLow.cons(cache_entry, v_answer);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cache_entry = cdolist_list_var.first();
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 12969L)
    public static SubLObject sksi_supported_gaf_argument_mts_for_term_argument_position_predicate(final SubLObject v_term, final SubLObject argument_position, final SubLObject pred, SubLObject visible_mt) {
        if (visible_mt == sksi_sks_gaf_arg_indexing.UNPROVIDED) {
            visible_mt = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
        }
        final SubLObject cache_entries_for_term_and_arg_pred = sksi_supported_gaf_argument_cache_entries_for_term_argument_position_predicate(v_term, argument_position, pred, visible_mt);
        return list_utilities.fast_delete_duplicates(Mapping.mapcar((SubLObject)sksi_sks_gaf_arg_indexing.$sym37$SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_MT, cache_entries_for_term_and_arg_pred), (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 13408L)
    public static SubLObject sksi_supported_gaf_argument_mt_count_pairs_for_term_argument_position_predicate(final SubLObject v_term, final SubLObject argument_position, final SubLObject predicate, SubLObject mt) {
        if (mt == sksi_sks_gaf_arg_indexing.UNPROVIDED) {
            mt = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
        }
        final SubLObject cache_entries = sksi_supported_gaf_argument_cache_entries_for_term(v_term, mt);
        SubLObject mt_count_pairs = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
        SubLObject cdolist_list_var = cache_entries;
        SubLObject entry = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
        entry = cdolist_list_var.first();
        while (sksi_sks_gaf_arg_indexing.NIL != cdolist_list_var) {
            final SubLObject pred = sksi_supported_gaf_argument_cache_entry_predicate(entry);
            final SubLObject arg = sksi_supported_gaf_argument_cache_entry_argument_position(entry);
            final SubLObject mt_$1 = sksi_supported_gaf_argument_cache_entry_mt(entry);
            if (pred.eql(predicate) && arg.eql(argument_position)) {
                SubLObject count = sksi_supported_gaf_argument_cache_entry_count(entry);
                final SubLObject last_entry = mt_count_pairs.first();
                final SubLObject last_entry_mt = last_entry.first();
                final SubLObject last_entry_count = conses_high.second(last_entry);
                if (mt_$1.eql(last_entry_mt)) {
                    if (last_entry_count.isInteger()) {
                        if (count.isInteger()) {
                            count = Numbers.add(count, last_entry_count);
                        }
                        else {
                            count = last_entry_count;
                        }
                    }
                    mt_count_pairs = ConsesLow.rplaca(mt_count_pairs, (SubLObject)ConsesLow.list(mt_$1, count));
                }
                else {
                    mt_count_pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(mt_$1, count), mt_count_pairs);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return Sequences.nreverse(mt_count_pairs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 14687L)
    public static SubLObject sksi_supported_gaf_argument_cache_entries_for_term_argument_position_predicate(final SubLObject v_term, final SubLObject argument_position, final SubLObject pred, SubLObject mt) {
        if (mt == sksi_sks_gaf_arg_indexing.UNPROVIDED) {
            mt = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
        }
        final SubLObject cache_entries_for_term_and_arg = sksi_supported_gaf_argument_cache_entries_for_term_argument_position(v_term, argument_position, mt);
        return list_utilities.find_all(pred, cache_entries_for_term_and_arg, Symbols.symbol_function((SubLObject)sksi_sks_gaf_arg_indexing.EQ), (SubLObject)sksi_sks_gaf_arg_indexing.$sym36$SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_PREDICATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 15089L)
    public static SubLObject sksi_supported_gaf_argument_cache_entries_for_term_argument_position_predicate_mt(final SubLObject v_term, final SubLObject argument_position, final SubLObject pred, final SubLObject mt) {
        if (sksi_sks_gaf_arg_indexing.NIL == sksi_sks_mt_indexing.content_mt_of_activated_external_sourceP(mt)) {
            return (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
        }
        final SubLObject cache_entries_for_term_and_arg_pred = sksi_supported_gaf_argument_cache_entries_for_term_argument_position_predicate(v_term, argument_position, pred, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED);
        return list_utilities.find_all(mt, cache_entries_for_term_and_arg_pred, (SubLObject)sksi_sks_gaf_arg_indexing.$sym38$HLMT_EQUAL, (SubLObject)sksi_sks_gaf_arg_indexing.$sym37$SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_MT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 15774L)
    public static SubLObject gather_query_form_module_list_pairs_from_sksi_supported_gaf_argument_cache_entries_for_term_argument_position_predicate_mt(final SubLObject index_hook, final SubLObject arg, final SubLObject predicate, final SubLObject mt) {
        if (sksi_sks_gaf_arg_indexing.NIL == sksi_sks_mt_indexing.content_mt_of_activated_external_sourceP(mt)) {
            return (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
        }
        final SubLObject cache_entries_for_term = sksi_supported_gaf_argument_cache_entries_for_term(index_hook, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED);
        SubLObject query_form_module_list_pairs = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
        SubLObject cdolist_list_var = cache_entries_for_term;
        SubLObject entry = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
        entry = cdolist_list_var.first();
        while (sksi_sks_gaf_arg_indexing.NIL != cdolist_list_var) {
            if (arg.eql(sksi_supported_gaf_argument_cache_entry_argument_position(entry)) && predicate.eql(sksi_supported_gaf_argument_cache_entry_predicate(entry)) && sksi_sks_gaf_arg_indexing.NIL != hlmt.hlmt_equal(mt, sksi_supported_gaf_argument_cache_entry_mt(entry))) {
                query_form_module_list_pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(sksi_supported_gaf_argument_cache_entry_query_form(entry), sksi_supported_gaf_argument_cache_entry_modules(entry)), query_form_module_list_pairs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return Sequences.nreverse(query_form_module_list_pairs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 16871L)
    public static SubLObject gather_relevant_query_form_mt_module_list_tuples_from_sksi_supported_gaf_argument_cache_for_term_argument_position_predicate(final SubLObject index_hook, final SubLObject arg, final SubLObject predicate) {
        final SubLObject cache_entries_for_term = sksi_supported_gaf_argument_cache_entries_for_term(index_hook, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED);
        SubLObject query_form_module_list_pairs = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
        SubLObject cdolist_list_var = cache_entries_for_term;
        SubLObject entry = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
        entry = cdolist_list_var.first();
        while (sksi_sks_gaf_arg_indexing.NIL != cdolist_list_var) {
            if (arg.eql(sksi_supported_gaf_argument_cache_entry_argument_position(entry)) && predicate.eql(sksi_supported_gaf_argument_cache_entry_predicate(entry)) && sksi_sks_gaf_arg_indexing.NIL != mt_relevance_macros.relevant_mtP(sksi_supported_gaf_argument_cache_entry_mt(entry))) {
                query_form_module_list_pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(sksi_supported_gaf_argument_cache_entry_query_form(entry), sksi_supported_gaf_argument_cache_entry_mt(entry), sksi_supported_gaf_argument_cache_entry_modules(entry)), query_form_module_list_pairs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return Sequences.nreverse(query_form_module_list_pairs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 17956L)
    public static SubLObject gather_relevant_query_form_mt_module_list_tuples_from_sksi_supported_gaf_argument_cache_for_term_argument_position(final SubLObject index_hook, final SubLObject arg) {
        final SubLObject cache_entries_for_term = sksi_supported_gaf_argument_cache_entries_for_term(index_hook, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED);
        SubLObject query_form_module_list_pairs = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
        SubLObject cdolist_list_var = cache_entries_for_term;
        SubLObject entry = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
        entry = cdolist_list_var.first();
        while (sksi_sks_gaf_arg_indexing.NIL != cdolist_list_var) {
            if (arg.eql(sksi_supported_gaf_argument_cache_entry_argument_position(entry)) && sksi_sks_gaf_arg_indexing.NIL != sksi_tva_utilities.sksi_gt_relevant_predP(sksi_supported_gaf_argument_cache_entry_predicate(entry)) && sksi_sks_gaf_arg_indexing.NIL != mt_relevance_macros.relevant_mtP(sksi_supported_gaf_argument_cache_entry_mt(entry))) {
                query_form_module_list_pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(sksi_supported_gaf_argument_cache_entry_query_form(entry), sksi_supported_gaf_argument_cache_entry_mt(entry), sksi_supported_gaf_argument_cache_entry_modules(entry)), query_form_module_list_pairs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return Sequences.nreverse(query_form_module_list_pairs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 19100L)
    public static SubLObject gather_sum_of_relevant_counts_for_term_argnum_pred(final SubLObject v_term, final SubLObject argnum, final SubLObject predicate) {
        final SubLObject cache_entries_for_term = sksi_supported_gaf_argument_cache_entries_for_term(v_term, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED);
        SubLObject count_sum = (SubLObject)sksi_sks_gaf_arg_indexing.ZERO_INTEGER;
        if (sksi_sks_gaf_arg_indexing.NIL == cache_entries_for_term && sksi_sks_gaf_arg_indexing.NIL != sksi_sks_predicate_indexing.sksi_supported_predicateP(predicate)) {
            return sksi_sks_gaf_arg_indexing.$sksi_default_count_for_term_argnum_pred$.getGlobalValue();
        }
        SubLObject cdolist_list_var = cache_entries_for_term;
        SubLObject entry = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
        entry = cdolist_list_var.first();
        while (sksi_sks_gaf_arg_indexing.NIL != cdolist_list_var) {
            if (argnum.eql(sksi_supported_gaf_argument_cache_entry_argument_position(entry)) && predicate.eql(sksi_supported_gaf_argument_cache_entry_predicate(entry)) && sksi_sks_gaf_arg_indexing.NIL != mt_relevance_macros.relevant_mtP(sksi_supported_gaf_argument_cache_entry_mt(entry))) {
                count_sum = Numbers.add(count_sum, sksi_supported_gaf_argument_cache_entry_count(entry).isNumber() ? sksi_supported_gaf_argument_cache_entry_count(entry) : sksi_sks_gaf_arg_indexing.$sksi_default_count_for_term_argnum_pred$.getGlobalValue());
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return count_sum;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 20356L)
    public static SubLObject sksi_supported_gaf_argumentP(final SubLObject v_term) {
        if (sksi_sks_gaf_arg_indexing.NIL != sksi_supported_gaf_argument_browsing_registeredP() && sksi_sks_gaf_arg_indexing.NIL == sksi_kb_accessors.isa_logical_schemaP(v_term)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(sksi_sks_gaf_arg_indexing.NIL != dictionary.dictionary_p(sksi_supported_gaf_argument_cache_lookup(v_term)) && sksi_sks_gaf_arg_indexing.NIL == dictionary.dictionary_empty_p(sksi_supported_gaf_argument_cache_lookup(v_term)));
        }
        return (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 20896L)
    public static SubLObject register_sksi_supported_gaf_arguments(final SubLObject term_arguments, final SubLObject code_mapping_terms, final SubLObject required_pattern, final SubLObject predicate_list, final SubLObject content_mt, final SubLObject count, final SubLObject module) {
        final SubLObject query_form = sksi_external_browser_utilities.sksi_create_query_form_from_required_pattern(required_pattern);
        if (sksi_sks_gaf_arg_indexing.NIL != query_form) {
            SubLObject cdolist_list_var = predicate_list;
            SubLObject pred = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
            pred = cdolist_list_var.first();
            while (sksi_sks_gaf_arg_indexing.NIL != cdolist_list_var) {
                if (sksi_sks_gaf_arg_indexing.NIL != sksi_infrastructure_utilities.sksi_supported_predicate_type_p(pred, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED)) {
                    register_sksi_supported_gaf_arguments_int(term_arguments, code_mapping_terms, query_form, pred, content_mt, count, module);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            }
        }
        return (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 21550L)
    public static SubLObject register_sksi_supported_gaf_arguments_int(final SubLObject term_arguments, final SubLObject code_mapping_terms, final SubLObject query_form, final SubLObject predicate, final SubLObject content_mt, final SubLObject count, final SubLObject module) {
        final SubLObject cache_entry_query_form = el_utilities.make_el_formula(predicate, cycl_utilities.formula_args(query_form, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED), (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED);
        final SubLObject v_cache = sksi_sks_gaf_arg_indexing.$sksi_supported_gaf_argument_cache$.getGlobalValue();
        SubLObject cdolist_list_var = term_arguments;
        SubLObject v_term = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
        v_term = cdolist_list_var.first();
        while (sksi_sks_gaf_arg_indexing.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2;
            final SubLObject argument_positions = cdolist_list_var_$2 = cycl_utilities.formula_arg_positions(cache_entry_query_form, v_term, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED);
            SubLObject arg_pos = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
            arg_pos = cdolist_list_var_$2.first();
            while (sksi_sks_gaf_arg_indexing.NIL != cdolist_list_var_$2) {
                final SubLObject entry = new_sksi_supported_gaf_argument_cache_entry(arg_pos, cache_entry_query_form, predicate, content_mt, count, module);
                sksi_supported_gaf_argument_cache_enter(v_term, entry, v_cache);
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                arg_pos = cdolist_list_var_$2.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        cdolist_list_var = code_mapping_terms;
        SubLObject arg_pos_terms_pair = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
        arg_pos_terms_pair = cdolist_list_var.first();
        while (sksi_sks_gaf_arg_indexing.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = arg_pos_terms_pair;
            SubLObject arg_pos = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
            SubLObject terms = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_gaf_arg_indexing.$list39);
            arg_pos = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_gaf_arg_indexing.$list39);
            terms = current.first();
            current = current.rest();
            if (sksi_sks_gaf_arg_indexing.NIL == current) {
                SubLObject cdolist_list_var_$3 = terms;
                SubLObject v_term2 = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
                v_term2 = cdolist_list_var_$3.first();
                while (sksi_sks_gaf_arg_indexing.NIL != cdolist_list_var_$3) {
                    final SubLObject term_cache_entry_query_form = el_utilities.replace_formula_arg(arg_pos, v_term2, cache_entry_query_form);
                    final SubLObject entry2 = new_sksi_supported_gaf_argument_cache_entry(arg_pos, term_cache_entry_query_form, predicate, content_mt, count, module);
                    sksi_supported_gaf_argument_cache_enter(v_term2, entry2, v_cache);
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    v_term2 = cdolist_list_var_$3.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_sks_gaf_arg_indexing.$list39);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_pos_terms_pair = cdolist_list_var.first();
        }
        return (SubLObject)sksi_sks_gaf_arg_indexing.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 23006L)
    public static SubLObject deregister_sksi_supported_gaf_arguments(final SubLObject term_arguments, final SubLObject code_mapping_terms, final SubLObject required_pattern, final SubLObject predicate, final SubLObject content_mt, final SubLObject module, final SubLObject count) {
        final SubLObject v_cache = sksi_sks_gaf_arg_indexing.$sksi_supported_gaf_argument_cache$.getGlobalValue();
        SubLObject cdolist_list_var = term_arguments;
        SubLObject v_term = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
        v_term = cdolist_list_var.first();
        while (sksi_sks_gaf_arg_indexing.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$4;
            final SubLObject argument_positions = cdolist_list_var_$4 = cycl_utilities.formula_arg_positions(required_pattern, v_term, (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED);
            SubLObject position = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
            position = cdolist_list_var_$4.first();
            while (sksi_sks_gaf_arg_indexing.NIL != cdolist_list_var_$4) {
                SubLObject cdolist_list_var_$5;
                final SubLObject cache_entries = cdolist_list_var_$5 = sksi_supported_gaf_argument_cache_entries_for_term_argument_position_predicate_mt(v_term, position, predicate, content_mt);
                SubLObject entry = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
                entry = cdolist_list_var_$5.first();
                while (sksi_sks_gaf_arg_indexing.NIL != cdolist_list_var_$5) {
                    sksi_supported_gaf_argument_remove(v_term, entry, module, count, v_cache);
                    cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                    entry = cdolist_list_var_$5.first();
                }
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                position = cdolist_list_var_$4.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        deregister_code_mapping_terms_entries_from_gaf_arguments_cache(content_mt, predicate, code_mapping_terms, module, count);
        return (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-gaf-arg-indexing.lisp", position = 24108L)
    public static SubLObject deregister_code_mapping_terms_entries_from_gaf_arguments_cache(final SubLObject content_mt, final SubLObject predicate, final SubLObject code_mapping_terms, final SubLObject module, final SubLObject count) {
        final SubLObject v_cache = sksi_sks_gaf_arg_indexing.$sksi_supported_gaf_argument_cache$.getGlobalValue();
        SubLObject cdolist_list_var = code_mapping_terms;
        SubLObject arg_pos_terms_pair = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
        arg_pos_terms_pair = cdolist_list_var.first();
        while (sksi_sks_gaf_arg_indexing.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = arg_pos_terms_pair;
            SubLObject arg_pos = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
            SubLObject terms = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_gaf_arg_indexing.$list39);
            arg_pos = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_gaf_arg_indexing.$list39);
            terms = current.first();
            current = current.rest();
            if (sksi_sks_gaf_arg_indexing.NIL == current) {
                SubLObject cdolist_list_var_$6 = terms;
                SubLObject v_term = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
                v_term = cdolist_list_var_$6.first();
                while (sksi_sks_gaf_arg_indexing.NIL != cdolist_list_var_$6) {
                    SubLObject cdolist_list_var_$7;
                    final SubLObject cache_entries = cdolist_list_var_$7 = sksi_supported_gaf_argument_cache_entries_for_term_argument_position_predicate_mt(v_term, arg_pos, predicate, content_mt);
                    SubLObject entry = (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
                    entry = cdolist_list_var_$7.first();
                    while (sksi_sks_gaf_arg_indexing.NIL != cdolist_list_var_$7) {
                        sksi_supported_gaf_argument_remove(v_term, entry, module, count, v_cache);
                        cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                        entry = cdolist_list_var_$7.first();
                    }
                    cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                    v_term = cdolist_list_var_$6.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_sks_gaf_arg_indexing.$list39);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_pos_terms_pair = cdolist_list_var.first();
        }
        return (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
    }
    
    public static SubLObject declare_sksi_sks_gaf_arg_indexing_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "sksi_supported_gaf_argument_cache_entry_print_function_trampoline", "SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "sksi_supported_gaf_argument_cache_entry_p", "SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-P", 1, 0, false);
        new $sksi_supported_gaf_argument_cache_entry_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "sksi_gaf_arg_entry_argument_position", "SKSI-GAF-ARG-ENTRY-ARGUMENT-POSITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "sksi_gaf_arg_entry_query_form", "SKSI-GAF-ARG-ENTRY-QUERY-FORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "sksi_gaf_arg_entry_predicate", "SKSI-GAF-ARG-ENTRY-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "sksi_gaf_arg_entry_mt", "SKSI-GAF-ARG-ENTRY-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "sksi_gaf_arg_entry_count", "SKSI-GAF-ARG-ENTRY-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "sksi_gaf_arg_entry_modules", "SKSI-GAF-ARG-ENTRY-MODULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "_csetf_sksi_gaf_arg_entry_argument_position", "_CSETF-SKSI-GAF-ARG-ENTRY-ARGUMENT-POSITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "_csetf_sksi_gaf_arg_entry_query_form", "_CSETF-SKSI-GAF-ARG-ENTRY-QUERY-FORM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "_csetf_sksi_gaf_arg_entry_predicate", "_CSETF-SKSI-GAF-ARG-ENTRY-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "_csetf_sksi_gaf_arg_entry_mt", "_CSETF-SKSI-GAF-ARG-ENTRY-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "_csetf_sksi_gaf_arg_entry_count", "_CSETF-SKSI-GAF-ARG-ENTRY-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "_csetf_sksi_gaf_arg_entry_modules", "_CSETF-SKSI-GAF-ARG-ENTRY-MODULES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "make_sksi_supported_gaf_argument_cache_entry", "MAKE-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "visit_defstruct_sksi_supported_gaf_argument_cache_entry", "VISIT-DEFSTRUCT-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "visit_defstruct_object_sksi_supported_gaf_argument_cache_entry_method", "VISIT-DEFSTRUCT-OBJECT-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "sxhash_sksi_supported_gaf_argument_cache_entry_method", "SXHASH-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "new_sksi_supported_gaf_argument_cache_entry", "NEW-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "sksi_supported_gaf_argument_cache_entry_argument_position", "SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-ARGUMENT-POSITION", 1, 0, false);
        new $sksi_supported_gaf_argument_cache_entry_argument_position$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "sksi_supported_gaf_argument_cache_entry_query_form", "SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-QUERY-FORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "sksi_supported_gaf_argument_cache_entry_predicate", "SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "sksi_supported_gaf_argument_cache_entry_mt", "SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "sksi_supported_gaf_argument_cache_entry_count", "SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "sksi_supported_gaf_argument_cache_entry_modules", "SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-MODULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "print_sksi_supported_gaf_argument_cache_entry", "PRINT-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "clear_sksi_supported_gaf_argument_cache", "CLEAR-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "sksi_supported_gaf_argument_cache_lookup", "SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-LOOKUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "sksi_supported_gaf_argument_browsing_registeredP", "SKSI-SUPPORTED-GAF-ARGUMENT-BROWSING-REGISTERED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "new_sksi_supported_gaf_argument_arg_position_cache", "NEW-SKSI-SUPPORTED-GAF-ARGUMENT-ARG-POSITION-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "sksi_supported_gaf_argument_cache_enter", "SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTER", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "sksi_merge_gaf_argument_cache_entry_if_possible", "SKSI-MERGE-GAF-ARGUMENT-CACHE-ENTRY-IF-POSSIBLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "sksi_supported_gaf_argument_remove", "SKSI-SUPPORTED-GAF-ARGUMENT-REMOVE", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "sksi_supported_gaf_argument_cache_entries_for_term", "SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRIES-FOR-TERM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "sksi_supported_gaf_argument_positions_for_term", "SKSI-SUPPORTED-GAF-ARGUMENT-POSITIONS-FOR-TERM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "sksi_supported_gaf_argument_predicates_for_term_argument_position", "SKSI-SUPPORTED-GAF-ARGUMENT-PREDICATES-FOR-TERM-ARGUMENT-POSITION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "sksi_supported_gaf_argument_cache_entries_for_term_argument_position", "SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRIES-FOR-TERM-ARGUMENT-POSITION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "sksi_supported_gaf_argument_mts_for_term_argument_position_predicate", "SKSI-SUPPORTED-GAF-ARGUMENT-MTS-FOR-TERM-ARGUMENT-POSITION-PREDICATE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "sksi_supported_gaf_argument_mt_count_pairs_for_term_argument_position_predicate", "SKSI-SUPPORTED-GAF-ARGUMENT-MT-COUNT-PAIRS-FOR-TERM-ARGUMENT-POSITION-PREDICATE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "sksi_supported_gaf_argument_cache_entries_for_term_argument_position_predicate", "SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRIES-FOR-TERM-ARGUMENT-POSITION-PREDICATE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "sksi_supported_gaf_argument_cache_entries_for_term_argument_position_predicate_mt", "SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRIES-FOR-TERM-ARGUMENT-POSITION-PREDICATE-MT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "gather_query_form_module_list_pairs_from_sksi_supported_gaf_argument_cache_entries_for_term_argument_position_predicate_mt", "GATHER-QUERY-FORM-MODULE-LIST-PAIRS-FROM-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRIES-FOR-TERM-ARGUMENT-POSITION-PREDICATE-MT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "gather_relevant_query_form_mt_module_list_tuples_from_sksi_supported_gaf_argument_cache_for_term_argument_position_predicate", "GATHER-RELEVANT-QUERY-FORM-MT-MODULE-LIST-TUPLES-FROM-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-FOR-TERM-ARGUMENT-POSITION-PREDICATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "gather_relevant_query_form_mt_module_list_tuples_from_sksi_supported_gaf_argument_cache_for_term_argument_position", "GATHER-RELEVANT-QUERY-FORM-MT-MODULE-LIST-TUPLES-FROM-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-FOR-TERM-ARGUMENT-POSITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "gather_sum_of_relevant_counts_for_term_argnum_pred", "GATHER-SUM-OF-RELEVANT-COUNTS-FOR-TERM-ARGNUM-PRED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "sksi_supported_gaf_argumentP", "SKSI-SUPPORTED-GAF-ARGUMENT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "register_sksi_supported_gaf_arguments", "REGISTER-SKSI-SUPPORTED-GAF-ARGUMENTS", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "register_sksi_supported_gaf_arguments_int", "REGISTER-SKSI-SUPPORTED-GAF-ARGUMENTS-INT", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "deregister_sksi_supported_gaf_arguments", "DEREGISTER-SKSI-SUPPORTED-GAF-ARGUMENTS", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing", "deregister_code_mapping_terms_entries_from_gaf_arguments_cache", "DEREGISTER-CODE-MAPPING-TERMS-ENTRIES-FROM-GAF-ARGUMENTS-CACHE", 5, 0, false);
        return (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
    }
    
    public static SubLObject init_sksi_sks_gaf_arg_indexing_file() {
        sksi_sks_gaf_arg_indexing.$dtp_sksi_supported_gaf_argument_cache_entry$ = SubLFiles.defconstant("*DTP-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY*", (SubLObject)sksi_sks_gaf_arg_indexing.$sym0$SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY);
        sksi_sks_gaf_arg_indexing.$sksi_supported_gaf_argument_cache$ = SubLFiles.deflexical("*SKSI-SUPPORTED-GAF-ARGUMENT-CACHE*", maybeDefault((SubLObject)sksi_sks_gaf_arg_indexing.$sym35$_SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_, sksi_sks_gaf_arg_indexing.$sksi_supported_gaf_argument_cache$, ()->(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_sks_gaf_arg_indexing.EQ), (SubLObject)sksi_sks_gaf_arg_indexing.UNPROVIDED))));
        sksi_sks_gaf_arg_indexing.$sksi_default_count_for_term_argnum_pred$ = SubLFiles.deflexical("*SKSI-DEFAULT-COUNT-FOR-TERM-ARGNUM-PRED*", (SubLObject)sksi_sks_gaf_arg_indexing.SEVENTEEN_INTEGER);
        return (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
    }
    
    public static SubLObject setup_sksi_sks_gaf_arg_indexing_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), sksi_sks_gaf_arg_indexing.$dtp_sksi_supported_gaf_argument_cache_entry$.getGlobalValue(), Symbols.symbol_function((SubLObject)sksi_sks_gaf_arg_indexing.$sym7$SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)sksi_sks_gaf_arg_indexing.$list8);
        Structures.def_csetf((SubLObject)sksi_sks_gaf_arg_indexing.$sym9$SKSI_GAF_ARG_ENTRY_ARGUMENT_POSITION, (SubLObject)sksi_sks_gaf_arg_indexing.$sym10$_CSETF_SKSI_GAF_ARG_ENTRY_ARGUMENT_POSITION);
        Structures.def_csetf((SubLObject)sksi_sks_gaf_arg_indexing.$sym11$SKSI_GAF_ARG_ENTRY_QUERY_FORM, (SubLObject)sksi_sks_gaf_arg_indexing.$sym12$_CSETF_SKSI_GAF_ARG_ENTRY_QUERY_FORM);
        Structures.def_csetf((SubLObject)sksi_sks_gaf_arg_indexing.$sym13$SKSI_GAF_ARG_ENTRY_PREDICATE, (SubLObject)sksi_sks_gaf_arg_indexing.$sym14$_CSETF_SKSI_GAF_ARG_ENTRY_PREDICATE);
        Structures.def_csetf((SubLObject)sksi_sks_gaf_arg_indexing.$sym15$SKSI_GAF_ARG_ENTRY_MT, (SubLObject)sksi_sks_gaf_arg_indexing.$sym16$_CSETF_SKSI_GAF_ARG_ENTRY_MT);
        Structures.def_csetf((SubLObject)sksi_sks_gaf_arg_indexing.$sym17$SKSI_GAF_ARG_ENTRY_COUNT, (SubLObject)sksi_sks_gaf_arg_indexing.$sym18$_CSETF_SKSI_GAF_ARG_ENTRY_COUNT);
        Structures.def_csetf((SubLObject)sksi_sks_gaf_arg_indexing.$sym19$SKSI_GAF_ARG_ENTRY_MODULES, (SubLObject)sksi_sks_gaf_arg_indexing.$sym20$_CSETF_SKSI_GAF_ARG_ENTRY_MODULES);
        Equality.identity((SubLObject)sksi_sks_gaf_arg_indexing.$sym0$SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sksi_sks_gaf_arg_indexing.$dtp_sksi_supported_gaf_argument_cache_entry$.getGlobalValue(), Symbols.symbol_function((SubLObject)sksi_sks_gaf_arg_indexing.$sym32$VISIT_DEFSTRUCT_OBJECT_SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_ME));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), sksi_sks_gaf_arg_indexing.$dtp_sksi_supported_gaf_argument_cache_entry$.getGlobalValue(), Symbols.symbol_function((SubLObject)sksi_sks_gaf_arg_indexing.$sym33$SXHASH_SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)sksi_sks_gaf_arg_indexing.$sym35$_SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_);
        return (SubLObject)sksi_sks_gaf_arg_indexing.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sksi_sks_gaf_arg_indexing_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sksi_sks_gaf_arg_indexing_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sksi_sks_gaf_arg_indexing_file();
    }
    
    static {
        me = (SubLFile)new sksi_sks_gaf_arg_indexing();
        sksi_sks_gaf_arg_indexing.$dtp_sksi_supported_gaf_argument_cache_entry$ = null;
        sksi_sks_gaf_arg_indexing.$sksi_supported_gaf_argument_cache$ = null;
        sksi_sks_gaf_arg_indexing.$sksi_default_count_for_term_argnum_pred$ = null;
        $sym0$SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY = SubLObjectFactory.makeSymbol("SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY");
        $sym1$SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_P = SubLObjectFactory.makeSymbol("SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARGUMENT-POSITION"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("MODULES"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ARGUMENT-POSITION"), (SubLObject)SubLObjectFactory.makeKeyword("QUERY-FORM"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeKeyword("COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("MODULES"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SKSI-GAF-ARG-ENTRY-ARGUMENT-POSITION"), (SubLObject)SubLObjectFactory.makeSymbol("SKSI-GAF-ARG-ENTRY-QUERY-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("SKSI-GAF-ARG-ENTRY-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("SKSI-GAF-ARG-ENTRY-MT"), (SubLObject)SubLObjectFactory.makeSymbol("SKSI-GAF-ARG-ENTRY-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("SKSI-GAF-ARG-ENTRY-MODULES"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SKSI-GAF-ARG-ENTRY-ARGUMENT-POSITION"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SKSI-GAF-ARG-ENTRY-QUERY-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SKSI-GAF-ARG-ENTRY-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SKSI-GAF-ARG-ENTRY-MT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SKSI-GAF-ARG-ENTRY-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SKSI-GAF-ARG-ENTRY-MODULES"));
        $sym6$PRINT_SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY = SubLObjectFactory.makeSymbol("PRINT-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY");
        $sym7$SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-P"));
        $sym9$SKSI_GAF_ARG_ENTRY_ARGUMENT_POSITION = SubLObjectFactory.makeSymbol("SKSI-GAF-ARG-ENTRY-ARGUMENT-POSITION");
        $sym10$_CSETF_SKSI_GAF_ARG_ENTRY_ARGUMENT_POSITION = SubLObjectFactory.makeSymbol("_CSETF-SKSI-GAF-ARG-ENTRY-ARGUMENT-POSITION");
        $sym11$SKSI_GAF_ARG_ENTRY_QUERY_FORM = SubLObjectFactory.makeSymbol("SKSI-GAF-ARG-ENTRY-QUERY-FORM");
        $sym12$_CSETF_SKSI_GAF_ARG_ENTRY_QUERY_FORM = SubLObjectFactory.makeSymbol("_CSETF-SKSI-GAF-ARG-ENTRY-QUERY-FORM");
        $sym13$SKSI_GAF_ARG_ENTRY_PREDICATE = SubLObjectFactory.makeSymbol("SKSI-GAF-ARG-ENTRY-PREDICATE");
        $sym14$_CSETF_SKSI_GAF_ARG_ENTRY_PREDICATE = SubLObjectFactory.makeSymbol("_CSETF-SKSI-GAF-ARG-ENTRY-PREDICATE");
        $sym15$SKSI_GAF_ARG_ENTRY_MT = SubLObjectFactory.makeSymbol("SKSI-GAF-ARG-ENTRY-MT");
        $sym16$_CSETF_SKSI_GAF_ARG_ENTRY_MT = SubLObjectFactory.makeSymbol("_CSETF-SKSI-GAF-ARG-ENTRY-MT");
        $sym17$SKSI_GAF_ARG_ENTRY_COUNT = SubLObjectFactory.makeSymbol("SKSI-GAF-ARG-ENTRY-COUNT");
        $sym18$_CSETF_SKSI_GAF_ARG_ENTRY_COUNT = SubLObjectFactory.makeSymbol("_CSETF-SKSI-GAF-ARG-ENTRY-COUNT");
        $sym19$SKSI_GAF_ARG_ENTRY_MODULES = SubLObjectFactory.makeSymbol("SKSI-GAF-ARG-ENTRY-MODULES");
        $sym20$_CSETF_SKSI_GAF_ARG_ENTRY_MODULES = SubLObjectFactory.makeSymbol("_CSETF-SKSI-GAF-ARG-ENTRY-MODULES");
        $kw21$ARGUMENT_POSITION = SubLObjectFactory.makeKeyword("ARGUMENT-POSITION");
        $kw22$QUERY_FORM = SubLObjectFactory.makeKeyword("QUERY-FORM");
        $kw23$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $kw24$MT = SubLObjectFactory.makeKeyword("MT");
        $kw25$COUNT = SubLObjectFactory.makeKeyword("COUNT");
        $kw26$MODULES = SubLObjectFactory.makeKeyword("MODULES");
        $str27$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw28$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym29$MAKE_SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY = SubLObjectFactory.makeSymbol("MAKE-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY");
        $kw30$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw31$END = SubLObjectFactory.makeKeyword("END");
        $sym32$VISIT_DEFSTRUCT_OBJECT_SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_ME = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-METHOD");
        $sym33$SXHASH_SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_METHOD = SubLObjectFactory.makeSymbol("SXHASH-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-METHOD");
        $str34$__GACE__s__s__s__s__s__s_ = SubLObjectFactory.makeString("#<GACE:~s:~s:~s:~s:~s:~s>");
        $sym35$_SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ = SubLObjectFactory.makeSymbol("*SKSI-SUPPORTED-GAF-ARGUMENT-CACHE*");
        $sym36$SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_PREDICATE = SubLObjectFactory.makeSymbol("SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-PREDICATE");
        $sym37$SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_MT = SubLObjectFactory.makeSymbol("SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-MT");
        $sym38$HLMT_EQUAL = SubLObjectFactory.makeSymbol("HLMT-EQUAL");
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG-POS"), (SubLObject)SubLObjectFactory.makeSymbol("TERMS"));
    }
    
    public static final class $sksi_supported_gaf_argument_cache_entry_native extends SubLStructNative
    {
        public SubLObject $argument_position;
        public SubLObject $query_form;
        public SubLObject $predicate;
        public SubLObject $mt;
        public SubLObject $count;
        public SubLObject $modules;
        private static final SubLStructDeclNative structDecl;
        
        public $sksi_supported_gaf_argument_cache_entry_native() {
            this.$argument_position = (SubLObject)CommonSymbols.NIL;
            this.$query_form = (SubLObject)CommonSymbols.NIL;
            this.$predicate = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
            this.$count = (SubLObject)CommonSymbols.NIL;
            this.$modules = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sksi_supported_gaf_argument_cache_entry_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$argument_position;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$query_form;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$predicate;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$mt;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$count;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$modules;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$argument_position = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$query_form = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$predicate = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$mt = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$count = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$modules = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sksi_supported_gaf_argument_cache_entry_native.class, sksi_sks_gaf_arg_indexing.$sym0$SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY, sksi_sks_gaf_arg_indexing.$sym1$SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_P, sksi_sks_gaf_arg_indexing.$list2, sksi_sks_gaf_arg_indexing.$list3, new String[] { "$argument_position", "$query_form", "$predicate", "$mt", "$count", "$modules" }, sksi_sks_gaf_arg_indexing.$list4, sksi_sks_gaf_arg_indexing.$list5, sksi_sks_gaf_arg_indexing.$sym6$PRINT_SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY);
        }
    }
    
    public static final class $sksi_supported_gaf_argument_cache_entry_p$UnaryFunction extends UnaryFunction
    {
        public $sksi_supported_gaf_argument_cache_entry_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_cache_entry_p(arg1);
        }
    }
    
    public static final class $sksi_supported_gaf_argument_cache_entry_argument_position$UnaryFunction extends UnaryFunction
    {
        public $sksi_supported_gaf_argument_cache_entry_argument_position$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-ARGUMENT-POSITION"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_cache_entry_argument_position(arg1);
        }
    }
}

/*

	Total time: 152 ms
	
*/