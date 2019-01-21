package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_regression extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.pph_regression";
    public static final String myFingerPrint = "b2f577ec4bb4f04ab327b4f16713b7547c7e100922449db07df82ce7fc5b7372";
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLSymbol $pph_tmp_regression_item$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLSymbol $pph_tmp_test_object$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLSymbol $pph_regression_failure_expectedP$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLSymbol $pph_known_problem_objects$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLSymbol $pph_regression_current_test$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    private static SubLSymbol $pph_regression_hosed_by_kb$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLSymbol $pph_regression_trace_level$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLSymbol $dtp_pph_regression_item$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLSymbol $pph_regression_item_requires_all_args$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLSymbol $pph_regression_doomed_combinations$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    private static SubLSymbol $pph_regression_item_case_blessed$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    private static SubLSymbol $pph_regression_item_case_doomed$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$PWHEN;
    private static final SubLSymbol $sym2$__;
    private static final SubLSymbol $sym3$_PPH_REGRESSION_TRACE_LEVEL_;
    private static final SubLSymbol $sym4$WARN;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$CLET;
    private static final SubLSymbol $sym8$LOUD_WARNING;
    private static final SubLSymbol $sym9$JOIN_STRINGS;
    private static final SubLSymbol $sym10$LIST;
    private static final SubLSymbol $sym11$_EMPTY_STRING_;
    private static final SubLString $str12$______PPH_REGRESSION_PROBLEM____;
    private static final SubLList $list13;
    private static final SubLList $list14;
    private static final SubLString $str15$____PPH_REGRESSION_CASE_EXPECTED_;
    private static final SubLSymbol $sym16$PPH_REGRESSION_ITEM;
    private static final SubLSymbol $sym17$PPH_REGRESSION_ITEM_P;
    private static final SubLList $list18;
    private static final SubLList $list19;
    private static final SubLList $list20;
    private static final SubLList $list21;
    private static final SubLSymbol $sym22$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym23$PPH_REGRESSION_ITEM_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list24;
    private static final SubLSymbol $sym25$PPH_REGRESSION_ITEM_TEST_CASE;
    private static final SubLSymbol $sym26$_CSETF_PPH_REGRESSION_ITEM_TEST_CASE;
    private static final SubLSymbol $sym27$PPH_REGRESSION_ITEM_PURPOSE;
    private static final SubLSymbol $sym28$_CSETF_PPH_REGRESSION_ITEM_PURPOSE;
    private static final SubLSymbol $sym29$PPH_REGRESSION_ITEM_EXCUSED;
    private static final SubLSymbol $sym30$_CSETF_PPH_REGRESSION_ITEM_EXCUSED;
    private static final SubLSymbol $sym31$PPH_REGRESSION_ITEM_LANGUAGE_MT;
    private static final SubLSymbol $sym32$_CSETF_PPH_REGRESSION_ITEM_LANGUAGE_MT;
    private static final SubLSymbol $sym33$PPH_REGRESSION_ITEM_DOMAIN_MT;
    private static final SubLSymbol $sym34$_CSETF_PPH_REGRESSION_ITEM_DOMAIN_MT;
    private static final SubLSymbol $kw35$TEST_CASE;
    private static final SubLSymbol $kw36$PURPOSE;
    private static final SubLSymbol $kw37$EXCUSED;
    private static final SubLSymbol $kw38$LANGUAGE_MT;
    private static final SubLSymbol $kw39$DOMAIN_MT;
    private static final SubLString $str40$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw41$BEGIN;
    private static final SubLSymbol $sym42$MAKE_PPH_REGRESSION_ITEM;
    private static final SubLSymbol $kw43$SLOT;
    private static final SubLSymbol $kw44$END;
    private static final SubLSymbol $sym45$VISIT_DEFSTRUCT_OBJECT_PPH_REGRESSION_ITEM_METHOD;
    private static final SubLSymbol $sym46$PROPER_LIST_P;
    private static final SubLSymbol $sym47$HLMT_;
    private static final SubLString $str48$updating_status_of__S__w_r_t__tes;
    private static final SubLString $str49$____marked_as_failing_with_force_;
    private static final SubLString $str50$____failing_to_mark_as_failing_un;
    private static final SubLString $str51$____now_blessed_as_passing_with_f;
    private static final SubLString $str52$At_least_1_argument_for_gather_pp;
    private static final SubLObject $const53$PPHRegressionPredicate;
    private static final SubLString $str54$KB_search;
    private static final SubLString $str55$skipping_this_case_as_language_mt;
    private static final SubLString $str56$skipping_this_case_as_domain_mt__;
    private static final SubLSymbol $sym57$INVALID_CONSTANT_;
    private static final SubLString $str58$_S_would_fail_regression__skippin;
    private static final SubLString $str59$_____ALERT___KB_ISSUES___ALERT___;
    private static final SubLString $str60$These_test_cases_were_skipped_due;
    private static final SubLString $str61$_S_in__S;
    private static final SubLList $list62;
    private static final SubLList $list63;
    private static final SubLSymbol $kw64$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw65$TEST_FUNC;
    private static final SubLSymbol $sym66$DO_SET;
    private static final SubLSymbol $sym67$_PPH_TMP_REGRESSION_ITEM_;
    private static final SubLSymbol $sym68$GATHER_PPH_REGRESSION_TESTS;
    private static final SubLList $list69;
    private static final SubLList $list70;
    private static final SubLSymbol $sym71$_PPH_REGRESSION_CURRENT_TEST_;
    private static final SubLSymbol $sym72$FUNCALL_INSTANCE_METHOD;
    private static final SubLSymbol $sym73$SELF;
    private static final SubLList $list74;
    private static final SubLSymbol $sym75$FUNCALL;
    private static final SubLSymbol $sym76$PPH_REGRESSION_DIAGNOSTICS;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject pph_regression_warn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject level = (SubLObject)pph_regression.NIL;
        SubLObject format_str = (SubLObject)pph_regression.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_regression.$list0);
        level = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_regression.$list0);
        format_str = current.first();
        final SubLObject args;
        current = (args = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)pph_regression.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)pph_regression.$sym2$__, (SubLObject)pph_regression.$sym3$_PPH_REGRESSION_TRACE_LEVEL_, level), (SubLObject)ConsesLow.listS((SubLObject)pph_regression.$sym4$WARN, format_str, ConsesLow.append(args, (SubLObject)pph_regression.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject pph_regression_warn_wXo_false_positives(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject format_str = (SubLObject)pph_regression.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_regression.$list5);
        format_str = current.first();
        final SubLObject args;
        current = (args = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)pph_regression.$sym1$PWHEN, (SubLObject)pph_regression.$list6, (SubLObject)ConsesLow.list((SubLObject)pph_regression.$sym7$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_regression.$sym8$LOUD_WARNING, (SubLObject)ConsesLow.listS((SubLObject)pph_regression.$sym9$JOIN_STRINGS, (SubLObject)ConsesLow.listS((SubLObject)pph_regression.$sym10$LIST, (SubLObject)pph_regression.$sym11$_EMPTY_STRING_, (SubLObject)pph_regression.$str12$______PPH_REGRESSION_PROBLEM____, format_str, (SubLObject)pph_regression.$list13), (SubLObject)pph_regression.$list14))), (SubLObject)ConsesLow.listS((SubLObject)pph_regression.$sym4$WARN, (SubLObject)pph_regression.$sym8$LOUD_WARNING, ConsesLow.append(args, (SubLObject)pph_regression.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject pph_regression_diagnostics(final SubLObject details_func) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ans = (pph_regression.NIL != pph_regression.$pph_regression_failure_expectedP$.getDynamicValue(thread)) ? PrintLow.format((SubLObject)pph_regression.NIL, (SubLObject)pph_regression.$str15$____PPH_REGRESSION_CASE_EXPECTED_, pph_regression.$pph_regression_current_test$.getDynamicValue(thread)) : string_utilities.$empty_string$.getGlobalValue();
        return Sequences.cconcatenate(ans, Functions.funcall(details_func));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject pph_regression_item_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)pph_regression.ZERO_INTEGER);
        return (SubLObject)pph_regression.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject pph_regression_item_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $pph_regression_item_native.class) ? pph_regression.T : pph_regression.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject pph_regression_item_test_case(final SubLObject v_object) {
        assert pph_regression.NIL != pph_regression_item_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject pph_regression_item_purpose(final SubLObject v_object) {
        assert pph_regression.NIL != pph_regression_item_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject pph_regression_item_excused(final SubLObject v_object) {
        assert pph_regression.NIL != pph_regression_item_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject pph_regression_item_language_mt(final SubLObject v_object) {
        assert pph_regression.NIL != pph_regression_item_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject pph_regression_item_domain_mt(final SubLObject v_object) {
        assert pph_regression.NIL != pph_regression_item_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject _csetf_pph_regression_item_test_case(final SubLObject v_object, final SubLObject value) {
        assert pph_regression.NIL != pph_regression_item_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject _csetf_pph_regression_item_purpose(final SubLObject v_object, final SubLObject value) {
        assert pph_regression.NIL != pph_regression_item_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject _csetf_pph_regression_item_excused(final SubLObject v_object, final SubLObject value) {
        assert pph_regression.NIL != pph_regression_item_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject _csetf_pph_regression_item_language_mt(final SubLObject v_object, final SubLObject value) {
        assert pph_regression.NIL != pph_regression_item_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject _csetf_pph_regression_item_domain_mt(final SubLObject v_object, final SubLObject value) {
        assert pph_regression.NIL != pph_regression_item_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject make_pph_regression_item(SubLObject arglist) {
        if (arglist == pph_regression.UNPROVIDED) {
            arglist = (SubLObject)pph_regression.NIL;
        }
        final SubLObject v_new = (SubLObject)new $pph_regression_item_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)pph_regression.NIL, next = arglist; pph_regression.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)pph_regression.$kw35$TEST_CASE)) {
                _csetf_pph_regression_item_test_case(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pph_regression.$kw36$PURPOSE)) {
                _csetf_pph_regression_item_purpose(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pph_regression.$kw37$EXCUSED)) {
                _csetf_pph_regression_item_excused(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pph_regression.$kw38$LANGUAGE_MT)) {
                _csetf_pph_regression_item_language_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pph_regression.$kw39$DOMAIN_MT)) {
                _csetf_pph_regression_item_domain_mt(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)pph_regression.$str40$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject visit_defstruct_pph_regression_item(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_regression.$kw41$BEGIN, (SubLObject)pph_regression.$sym42$MAKE_PPH_REGRESSION_ITEM, (SubLObject)pph_regression.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_regression.$kw43$SLOT, (SubLObject)pph_regression.$kw35$TEST_CASE, pph_regression_item_test_case(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_regression.$kw43$SLOT, (SubLObject)pph_regression.$kw36$PURPOSE, pph_regression_item_purpose(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_regression.$kw43$SLOT, (SubLObject)pph_regression.$kw37$EXCUSED, pph_regression_item_excused(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_regression.$kw43$SLOT, (SubLObject)pph_regression.$kw38$LANGUAGE_MT, pph_regression_item_language_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_regression.$kw43$SLOT, (SubLObject)pph_regression.$kw39$DOMAIN_MT, pph_regression_item_domain_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_regression.$kw44$END, (SubLObject)pph_regression.$sym42$MAKE_PPH_REGRESSION_ITEM, (SubLObject)pph_regression.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject visit_defstruct_object_pph_regression_item_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_pph_regression_item(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject new_pph_regression_item(final SubLObject obj, final SubLObject purp, SubLObject exc, SubLObject lang, SubLObject domain) {
        if (exc == pph_regression.UNPROVIDED) {
            exc = pph_regression.$pph_regression_item_requires_all_args$.getDynamicValue();
        }
        if (lang == pph_regression.UNPROVIDED) {
            lang = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain == pph_regression.UNPROVIDED) {
            domain = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_regression.NIL != exc && !pph_regression.assertionsDisabledInClass && pph_regression.NIL == list_utilities.proper_list_p(exc)) {
            throw new AssertionError(exc);
        }
        if (pph_regression.NIL == lang) {
            lang = pph_vars.$pph_language_mt$.getDynamicValue(thread);
        }
        if (pph_regression.NIL != lang && !pph_regression.assertionsDisabledInClass && pph_regression.NIL == hlmt.hlmtP(lang)) {
            throw new AssertionError(lang);
        }
        if (pph_regression.NIL == domain) {
            domain = pph_vars.$pph_domain_mt$.getDynamicValue(thread);
        }
        if (pph_regression.NIL != domain && !pph_regression.assertionsDisabledInClass && pph_regression.NIL == hlmt.hlmtP(domain)) {
            throw new AssertionError(domain);
        }
        final SubLObject reg_item = make_pph_regression_item((SubLObject)pph_regression.UNPROVIDED);
        _csetf_pph_regression_item_test_case(reg_item, obj);
        _csetf_pph_regression_item_purpose(reg_item, purp);
        _csetf_pph_regression_item_excused(reg_item, exc);
        _csetf_pph_regression_item_language_mt(reg_item, lang);
        _csetf_pph_regression_item_domain_mt(reg_item, domain);
        return reg_item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject copy_pph_regression_item(final SubLObject old) {
        assert pph_regression.NIL != pph_regression_item_p(old) : old;
        final SubLObject obj = pph_regression_item_test_case(old);
        final SubLObject purp = pph_regression_item_purpose(old);
        final SubLObject exc = conses_high.copy_list(pph_regression_item_excused(old));
        final SubLObject lang = pph_regression_item_language_mt(old);
        final SubLObject domain = pph_regression_item_domain_mt(old);
        return new_pph_regression_item(obj, purp, exc, lang, domain);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject new_regression_store(SubLObject test, SubLObject size) {
        if (test == pph_regression.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)pph_regression.EQUALP);
        }
        if (size == pph_regression.UNPROVIDED) {
            size = (SubLObject)pph_regression.ONE_INTEGER;
        }
        return set.new_set(test, size);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject add_case_to_pph_regression_store(final SubLObject store, final SubLObject v_object, final SubLObject docs, SubLObject exc, SubLObject lang, SubLObject dom) {
        if (exc == pph_regression.UNPROVIDED) {
            exc = (SubLObject)pph_regression.NIL;
        }
        if (lang == pph_regression.UNPROVIDED) {
            lang = (SubLObject)pph_regression.NIL;
        }
        if (dom == pph_regression.UNPROVIDED) {
            dom = (SubLObject)pph_regression.NIL;
        }
        final SubLObject new_item = new_pph_regression_item(v_object, docs, exc, lang, dom);
        set.set_add(new_item, store);
        return new_item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject add_item_to_pph_regression_store(final SubLObject store, final SubLObject item) {
        assert pph_regression.NIL != pph_regression_item_p(item) : item;
        set.set_add(item, store);
        return item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject clear_regression_store(final SubLObject store) {
        return set.clear_set(store);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject bless_or_doom_pph_regression_item(final SubLObject item, final SubLObject key_func, final SubLObject force_list, final SubLObject doomedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_regression.NIL == key_func || pph_regression.NIL == force_list) {
            return (SubLObject)pph_regression.T;
        }
        SubLObject dict = dictionary.dictionary_lookup(pph_regression.$pph_regression_doomed_combinations$.getDynamicValue(thread), item, (SubLObject)pph_regression.UNPROVIDED);
        if (pph_regression.NIL == dict) {
            if (doomedP.eql(pph_regression.$pph_regression_item_case_blessed$.getDynamicValue(thread))) {
                return (SubLObject)pph_regression.T;
            }
            dict = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)pph_regression.EQUALP), (SubLObject)pph_regression.FIVE_INTEGER);
            dictionary.dictionary_enter(pph_regression.$pph_regression_doomed_combinations$.getDynamicValue(thread), item, dict);
        }
        SubLObject v_set = dictionary.dictionary_lookup(dict, key_func, (SubLObject)pph_regression.UNPROVIDED);
        if (pph_regression.NIL == v_set) {
            if (doomedP.eql(pph_regression.$pph_regression_item_case_blessed$.getDynamicValue(thread))) {
                return (SubLObject)pph_regression.T;
            }
            v_set = set.new_set(Symbols.symbol_function((SubLObject)pph_regression.EQUALP), (SubLObject)pph_regression.UNPROVIDED);
            dictionary.dictionary_enter(dict, key_func, v_set);
        }
        if (pph_regression.$pph_regression_trace_level$.getDynamicValue(thread).numGE((SubLObject)pph_regression.ONE_INTEGER)) {
            Errors.warn((SubLObject)pph_regression.$str48$updating_status_of__S__w_r_t__tes, pph_regression_item_test_case(item), key_func);
        }
        SubLObject cdolist_list_var = force_list;
        SubLObject force = (SubLObject)pph_regression.NIL;
        force = cdolist_list_var.first();
        while (pph_regression.NIL != cdolist_list_var) {
            if (doomedP.eql(pph_regression.$pph_regression_item_case_doomed$.getDynamicValue(thread))) {
                if (pph_regression.NIL == set.set_memberP(force, v_set)) {
                    if (pph_regression.NIL != set.set_add(force, v_set)) {
                        if (pph_regression.$pph_regression_trace_level$.getDynamicValue(thread).numGE((SubLObject)pph_regression.ONE_INTEGER)) {
                            Errors.warn((SubLObject)pph_regression.$str49$____marked_as_failing_with_force_, force);
                        }
                    }
                    else {
                        Errors.sublisp_break((SubLObject)pph_regression.$str50$____failing_to_mark_as_failing_un, new SubLObject[] { force });
                    }
                }
            }
            else if (pph_regression.NIL != set.set_remove(force, v_set) && pph_regression.$pph_regression_trace_level$.getDynamicValue(thread).numGE((SubLObject)pph_regression.ONE_INTEGER)) {
                Errors.warn((SubLObject)pph_regression.$str51$____now_blessed_as_passing_with_f, force);
            }
            cdolist_list_var = cdolist_list_var.rest();
            force = cdolist_list_var.first();
        }
        return (SubLObject)pph_regression.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject doom_pph_regression_item_to_fail_with_forces(final SubLObject item, final SubLObject test_func, final SubLObject forces) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return bless_or_doom_pph_regression_item(item, test_func, forces, pph_regression.$pph_regression_item_case_doomed$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject bless_pph_regression_item_to_pass_with_forces(final SubLObject item, final SubLObject test_func, final SubLObject forces) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return bless_or_doom_pph_regression_item(item, test_func, forces, pph_regression.$pph_regression_item_case_blessed$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject gather_pph_regression_tests(final SubLObject filter, SubLObject specs, SubLObject preds) {
        if (specs == pph_regression.UNPROVIDED) {
            specs = (SubLObject)pph_regression.NIL;
        }
        if (preds == pph_regression.UNPROVIDED) {
            preds = (SubLObject)pph_regression.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_regression.NIL == specs && pph_regression.NIL == preds) {
            if (pph_regression.$pph_regression_trace_level$.getDynamicValue(thread).numGE((SubLObject)pph_regression.ZERO_INTEGER)) {
                Errors.warn((SubLObject)pph_regression.$str52$At_least_1_argument_for_gather_pp);
            }
            return set.new_set((SubLObject)pph_regression.UNPROVIDED, (SubLObject)pph_regression.UNPROVIDED);
        }
        final SubLObject master_set = set.new_set(Symbols.symbol_function((SubLObject)pph_regression.EQUALP), (SubLObject)pph_regression.UNPROVIDED);
        SubLObject cdolist_list_var = specs;
        SubLObject this_spec = (SubLObject)pph_regression.NIL;
        this_spec = cdolist_list_var.first();
        while (pph_regression.NIL != cdolist_list_var) {
            final SubLObject set_contents_var = set.do_set_internal(this_spec);
            SubLObject basis_object;
            SubLObject state;
            SubLObject this_pph_item;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_regression.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_regression.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                this_pph_item = set_contents.do_set_contents_next(basis_object, state);
                if (pph_regression.NIL != set_contents.do_set_contents_element_validP(state, this_pph_item)) {
                    assert pph_regression.NIL != pph_regression_item_p(this_pph_item) : this_pph_item;
                    if (pph_regression.NIL == test_object_doomedP(this_pph_item, filter)) {
                        set.set_add(this_pph_item, master_set);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_spec = cdolist_list_var.first();
        }
        cdolist_list_var = preds;
        SubLObject this_pred = (SubLObject)pph_regression.NIL;
        this_pred = cdolist_list_var.first();
        while (pph_regression.NIL != cdolist_list_var) {
            if (pph_regression.NIL != isa.isaP(this_pred, pph_regression.$const53$PPHRegressionPredicate, (SubLObject)pph_regression.UNPROVIDED, (SubLObject)pph_regression.UNPROVIDED)) {
                SubLObject cdolist_list_var_$1 = kb_mapping.gather_predicate_extent_index(this_pred, (SubLObject)pph_regression.UNPROVIDED, (SubLObject)pph_regression.UNPROVIDED);
                SubLObject found = (SubLObject)pph_regression.NIL;
                found = cdolist_list_var_$1.first();
                while (pph_regression.NIL != cdolist_list_var_$1) {
                    if (pph_regression.NIL != el_utilities.el_formula_p(found) && pph_regression.NIL == test_object_doomedP(found, filter)) {
                        set.set_add(new_pph_regression_item(found, (SubLObject)pph_regression.$str54$KB_search, (SubLObject)pph_regression.UNPROVIDED, (SubLObject)pph_regression.UNPROVIDED, (SubLObject)pph_regression.UNPROVIDED), master_set);
                    }
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    found = cdolist_list_var_$1.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_pred = cdolist_list_var.first();
        }
        return master_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject mark_object_as_failing_pph_regression(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_regression.NIL != el_utilities.el_formula_p(v_object) || pph_regression.NIL != constant_handles.constant_p(v_object) || v_object.isString() || v_object.isNumber() || pph_regression.NIL != hlmt.hlmtP(v_object)) {
            return set.set_add(v_object, pph_regression.$pph_known_problem_objects$.getDynamicValue(thread));
        }
        return (SubLObject)pph_regression.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject bless_object_for_pph_regression(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return set.set_remove(v_object, pph_regression.$pph_known_problem_objects$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject doomed_objectP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return set.set_memberP(v_object, pph_regression.$pph_known_problem_objects$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject test_object_doomedP(final SubLObject pph_item, final SubLObject relevant_test) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert pph_regression.NIL != pph_regression_item_p(pph_item) : pph_item;
        if (pph_regression.NIL != doomed_objectP(pph_regression_item_language_mt(pph_item))) {
            if (pph_regression.$pph_regression_trace_level$.getDynamicValue(thread).numGE((SubLObject)pph_regression.ZERO_INTEGER)) {
                Errors.warn((SubLObject)pph_regression.$str55$skipping_this_case_as_language_mt, pph_regression_item_language_mt(pph_item), pph_item);
            }
            return (SubLObject)pph_regression.T;
        }
        if (pph_regression.NIL != doomed_objectP(pph_regression_item_domain_mt(pph_item))) {
            if (pph_regression.$pph_regression_trace_level$.getDynamicValue(thread).numGE((SubLObject)pph_regression.ZERO_INTEGER)) {
                Errors.warn((SubLObject)pph_regression.$str56$skipping_this_case_as_domain_mt__, pph_regression_item_domain_mt(pph_item), pph_item);
            }
            return (SubLObject)pph_regression.T;
        }
        final SubLObject v_object = pph_regression_item_test_case(pph_item);
        final SubLObject bogus = cycl_utilities.expression_find_if((SubLObject)pph_regression.$sym57$INVALID_CONSTANT_, v_object, (SubLObject)pph_regression.UNPROVIDED, (SubLObject)pph_regression.UNPROVIDED);
        if (pph_regression.NIL != bogus) {
            pph_regression_tracking_formula_with_kb_gap(v_object, bogus);
            return (SubLObject)pph_regression.T;
        }
        final SubLObject bad_elements = (pph_regression.NIL != relevant_test) ? Functions.funcall(relevant_test, v_object) : set.new_set((SubLObject)pph_regression.UNPROVIDED, (SubLObject)pph_regression.UNPROVIDED);
        if (pph_regression.NIL == set.empty_set_p(bad_elements)) {
            if (pph_regression.$pph_regression_trace_level$.getDynamicValue(thread).numGE((SubLObject)pph_regression.ZERO_INTEGER)) {
                Errors.warn((SubLObject)pph_regression.$str58$_S_would_fail_regression__skippin, set.set_element_list(bad_elements), v_object);
            }
            return (SubLObject)pph_regression.T;
        }
        return (SubLObject)pph_regression.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject pph_regression_tracking_reset_skips() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dictionary.clear_dictionary(pph_regression.$pph_regression_hosed_by_kb$.getDynamicValue(thread));
        return (SubLObject)pph_regression.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject pph_regression_tracking_formula_with_kb_gap(final SubLObject formula, final SubLObject bogus) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_enter(pph_regression.$pph_regression_hosed_by_kb$.getDynamicValue(thread), formula, bogus);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject pph_regression_tracking_print_skips() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_regression.NIL != dictionary.non_empty_dictionary_p(pph_regression.$pph_regression_hosed_by_kb$.getDynamicValue(thread))) {
            Errors.warn((SubLObject)pph_regression.$str59$_____ALERT___KB_ISSUES___ALERT___);
            Errors.warn((SubLObject)pph_regression.$str60$These_test_cases_were_skipped_due);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(pph_regression.$pph_regression_hosed_by_kb$.getDynamicValue(thread))); pph_regression.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject this_formula = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject these_constants = thread.secondMultipleValue();
                thread.resetMultipleValues();
                Errors.warn((SubLObject)pph_regression.$str61$_S_in__S, these_constants, this_formula);
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            return (SubLObject)pph_regression.T;
        }
        return (SubLObject)pph_regression.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject do_pph_regression_store(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_regression.$list62);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject store = (SubLObject)pph_regression.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_regression.$list62);
        store = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)pph_regression.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)pph_regression.NIL;
        SubLObject current_$2 = (SubLObject)pph_regression.NIL;
        while (pph_regression.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)pph_regression.$list62);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)pph_regression.$list62);
            if (pph_regression.NIL == conses_high.member(current_$2, (SubLObject)pph_regression.$list63, (SubLObject)pph_regression.UNPROVIDED, (SubLObject)pph_regression.UNPROVIDED)) {
                bad = (SubLObject)pph_regression.T;
            }
            if (current_$2 == pph_regression.$kw64$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (pph_regression.NIL != bad && pph_regression.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_regression.$list62);
        }
        final SubLObject test_func_tail = cdestructuring_bind.property_list_member((SubLObject)pph_regression.$kw65$TEST_FUNC, current);
        final SubLObject test_func = (SubLObject)((pph_regression.NIL != test_func_tail) ? conses_high.cadr(test_func_tail) : pph_regression.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)pph_regression.$sym66$DO_SET, (SubLObject)ConsesLow.list((SubLObject)pph_regression.$sym67$_PPH_TMP_REGRESSION_ITEM_, (SubLObject)ConsesLow.list((SubLObject)pph_regression.$sym68$GATHER_PPH_REGRESSION_TESTS, test_func, (SubLObject)ConsesLow.list((SubLObject)pph_regression.$sym10$LIST, store))), ConsesLow.append(body, (SubLObject)pph_regression.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject with_pph_test_object(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)pph_regression.$sym7$CLET, (SubLObject)pph_regression.$list69, ConsesLow.append(body, (SubLObject)pph_regression.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
    public static SubLObject do_pph_test_in_proper_mode(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject test_func = (SubLObject)pph_regression.NIL;
        SubLObject reg_specific_func = (SubLObject)pph_regression.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_regression.$list70);
        test_func = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_regression.$list70);
        reg_specific_func = current.first();
        current = current.rest();
        if (pph_regression.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)pph_regression.$sym7$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_regression.$sym71$_PPH_REGRESSION_CURRENT_TEST_, test_func)), (SubLObject)ConsesLow.list((SubLObject)pph_regression.$sym72$FUNCALL_INSTANCE_METHOD, (SubLObject)pph_regression.$sym73$SELF, (SubLObject)pph_regression.$list74, (SubLObject)ConsesLow.list((SubLObject)pph_regression.$sym75$FUNCALL, test_func), (SubLObject)ConsesLow.list((SubLObject)pph_regression.$sym76$PPH_REGRESSION_DIAGNOSTICS, reg_specific_func)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_regression.$list70);
        return (SubLObject)pph_regression.NIL;
    }
    
    public static SubLObject declare_pph_regression_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_regression", "pph_regression_warn", "PPH-REGRESSION-WARN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_regression", "pph_regression_warn_wXo_false_positives", "PPH-REGRESSION-WARN-W/O-FALSE-POSITIVES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "pph_regression_diagnostics", "PPH-REGRESSION-DIAGNOSTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "pph_regression_item_print_function_trampoline", "PPH-REGRESSION-ITEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "pph_regression_item_p", "PPH-REGRESSION-ITEM-P", 1, 0, false);
        new $pph_regression_item_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "pph_regression_item_test_case", "PPH-REGRESSION-ITEM-TEST-CASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "pph_regression_item_purpose", "PPH-REGRESSION-ITEM-PURPOSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "pph_regression_item_excused", "PPH-REGRESSION-ITEM-EXCUSED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "pph_regression_item_language_mt", "PPH-REGRESSION-ITEM-LANGUAGE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "pph_regression_item_domain_mt", "PPH-REGRESSION-ITEM-DOMAIN-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "_csetf_pph_regression_item_test_case", "_CSETF-PPH-REGRESSION-ITEM-TEST-CASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "_csetf_pph_regression_item_purpose", "_CSETF-PPH-REGRESSION-ITEM-PURPOSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "_csetf_pph_regression_item_excused", "_CSETF-PPH-REGRESSION-ITEM-EXCUSED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "_csetf_pph_regression_item_language_mt", "_CSETF-PPH-REGRESSION-ITEM-LANGUAGE-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "_csetf_pph_regression_item_domain_mt", "_CSETF-PPH-REGRESSION-ITEM-DOMAIN-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "make_pph_regression_item", "MAKE-PPH-REGRESSION-ITEM", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "visit_defstruct_pph_regression_item", "VISIT-DEFSTRUCT-PPH-REGRESSION-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "visit_defstruct_object_pph_regression_item_method", "VISIT-DEFSTRUCT-OBJECT-PPH-REGRESSION-ITEM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "new_pph_regression_item", "NEW-PPH-REGRESSION-ITEM", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "copy_pph_regression_item", "COPY-PPH-REGRESSION-ITEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "new_regression_store", "NEW-REGRESSION-STORE", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "add_case_to_pph_regression_store", "ADD-CASE-TO-PPH-REGRESSION-STORE", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "add_item_to_pph_regression_store", "ADD-ITEM-TO-PPH-REGRESSION-STORE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "clear_regression_store", "CLEAR-REGRESSION-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "bless_or_doom_pph_regression_item", "BLESS-OR-DOOM-PPH-REGRESSION-ITEM", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "doom_pph_regression_item_to_fail_with_forces", "DOOM-PPH-REGRESSION-ITEM-TO-FAIL-WITH-FORCES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "bless_pph_regression_item_to_pass_with_forces", "BLESS-PPH-REGRESSION-ITEM-TO-PASS-WITH-FORCES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "gather_pph_regression_tests", "GATHER-PPH-REGRESSION-TESTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "mark_object_as_failing_pph_regression", "MARK-OBJECT-AS-FAILING-PPH-REGRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "bless_object_for_pph_regression", "BLESS-OBJECT-FOR-PPH-REGRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "doomed_objectP", "DOOMED-OBJECT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "test_object_doomedP", "TEST-OBJECT-DOOMED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "pph_regression_tracking_reset_skips", "PPH-REGRESSION-TRACKING-RESET-SKIPS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "pph_regression_tracking_formula_with_kb_gap", "PPH-REGRESSION-TRACKING-FORMULA-WITH-KB-GAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_regression", "pph_regression_tracking_print_skips", "PPH-REGRESSION-TRACKING-PRINT-SKIPS", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_regression", "do_pph_regression_store", "DO-PPH-REGRESSION-STORE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_regression", "with_pph_test_object", "WITH-PPH-TEST-OBJECT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_regression", "do_pph_test_in_proper_mode", "DO-PPH-TEST-IN-PROPER-MODE");
        return (SubLObject)pph_regression.NIL;
    }
    
    public static SubLObject init_pph_regression_file() {
        pph_regression.$pph_tmp_regression_item$ = SubLFiles.defvar("*PPH-TMP-REGRESSION-ITEM*", (SubLObject)pph_regression.NIL);
        pph_regression.$pph_tmp_test_object$ = SubLFiles.defvar("*PPH-TMP-TEST-OBJECT*", (SubLObject)pph_regression.NIL);
        pph_regression.$pph_regression_failure_expectedP$ = SubLFiles.defvar("*PPH-REGRESSION-FAILURE-EXPECTED?*", (SubLObject)pph_regression.NIL);
        pph_regression.$pph_known_problem_objects$ = SubLFiles.defvar("*PPH-KNOWN-PROBLEM-OBJECTS*", set.new_set((SubLObject)pph_regression.UNPROVIDED, (SubLObject)pph_regression.UNPROVIDED));
        pph_regression.$pph_regression_current_test$ = SubLFiles.defvar("*PPH-REGRESSION-CURRENT-TEST*", (SubLObject)pph_regression.NIL);
        pph_regression.$pph_regression_hosed_by_kb$ = SubLFiles.defvar("*PPH-REGRESSION-HOSED-BY-KB*", dictionary.new_dictionary((SubLObject)pph_regression.UNPROVIDED, (SubLObject)pph_regression.UNPROVIDED));
        pph_regression.$pph_regression_trace_level$ = SubLFiles.defparameter("*PPH-REGRESSION-TRACE-LEVEL*", (SubLObject)pph_regression.ZERO_INTEGER);
        pph_regression.$dtp_pph_regression_item$ = SubLFiles.defconstant("*DTP-PPH-REGRESSION-ITEM*", (SubLObject)pph_regression.$sym16$PPH_REGRESSION_ITEM);
        pph_regression.$pph_regression_item_requires_all_args$ = SubLFiles.defvar("*PPH-REGRESSION-ITEM-REQUIRES-ALL-ARGS*", (SubLObject)pph_regression.NIL);
        pph_regression.$pph_regression_doomed_combinations$ = SubLFiles.defvar("*PPH-REGRESSION-DOOMED-COMBINATIONS*", dictionary.new_dictionary(Symbols.symbol_function((SubLObject)pph_regression.EQUALP), (SubLObject)pph_regression.TEN_INTEGER));
        pph_regression.$pph_regression_item_case_blessed$ = SubLFiles.defparameter("*PPH-REGRESSION-ITEM-CASE-BLESSED*", (SubLObject)pph_regression.NIL);
        pph_regression.$pph_regression_item_case_doomed$ = SubLFiles.defparameter("*PPH-REGRESSION-ITEM-CASE-DOOMED*", (SubLObject)pph_regression.T);
        return (SubLObject)pph_regression.NIL;
    }
    
    public static SubLObject setup_pph_regression_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), pph_regression.$dtp_pph_regression_item$.getGlobalValue(), Symbols.symbol_function((SubLObject)pph_regression.$sym23$PPH_REGRESSION_ITEM_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)pph_regression.$list24);
        Structures.def_csetf((SubLObject)pph_regression.$sym25$PPH_REGRESSION_ITEM_TEST_CASE, (SubLObject)pph_regression.$sym26$_CSETF_PPH_REGRESSION_ITEM_TEST_CASE);
        Structures.def_csetf((SubLObject)pph_regression.$sym27$PPH_REGRESSION_ITEM_PURPOSE, (SubLObject)pph_regression.$sym28$_CSETF_PPH_REGRESSION_ITEM_PURPOSE);
        Structures.def_csetf((SubLObject)pph_regression.$sym29$PPH_REGRESSION_ITEM_EXCUSED, (SubLObject)pph_regression.$sym30$_CSETF_PPH_REGRESSION_ITEM_EXCUSED);
        Structures.def_csetf((SubLObject)pph_regression.$sym31$PPH_REGRESSION_ITEM_LANGUAGE_MT, (SubLObject)pph_regression.$sym32$_CSETF_PPH_REGRESSION_ITEM_LANGUAGE_MT);
        Structures.def_csetf((SubLObject)pph_regression.$sym33$PPH_REGRESSION_ITEM_DOMAIN_MT, (SubLObject)pph_regression.$sym34$_CSETF_PPH_REGRESSION_ITEM_DOMAIN_MT);
        Equality.identity((SubLObject)pph_regression.$sym16$PPH_REGRESSION_ITEM);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), pph_regression.$dtp_pph_regression_item$.getGlobalValue(), Symbols.symbol_function((SubLObject)pph_regression.$sym45$VISIT_DEFSTRUCT_OBJECT_PPH_REGRESSION_ITEM_METHOD));
        return (SubLObject)pph_regression.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_pph_regression_file();
    }
    
    @Override
	public void initializeVariables() {
        init_pph_regression_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_pph_regression_file();
    }
    
    static {
        me = (SubLFile)new pph_regression();
        pph_regression.$pph_tmp_regression_item$ = null;
        pph_regression.$pph_tmp_test_object$ = null;
        pph_regression.$pph_regression_failure_expectedP$ = null;
        pph_regression.$pph_known_problem_objects$ = null;
        pph_regression.$pph_regression_current_test$ = null;
        pph_regression.$pph_regression_hosed_by_kb$ = null;
        pph_regression.$pph_regression_trace_level$ = null;
        pph_regression.$dtp_pph_regression_item$ = null;
        pph_regression.$pph_regression_item_requires_all_args$ = null;
        pph_regression.$pph_regression_doomed_combinations$ = null;
        pph_regression.$pph_regression_item_case_blessed$ = null;
        pph_regression.$pph_regression_item_case_doomed$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEVEL"), (SubLObject)SubLObjectFactory.makeSymbol("FORMAT-STR"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $sym1$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym2$__ = SubLObjectFactory.makeSymbol(">=");
        $sym3$_PPH_REGRESSION_TRACE_LEVEL_ = SubLObjectFactory.makeSymbol("*PPH-REGRESSION-TRACE-LEVEL*");
        $sym4$WARN = SubLObjectFactory.makeSymbol("WARN");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT-STR"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-REGRESSION-FAILURE-EXPECTED?*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-REGRESSION-TRACE-LEVEL*"), (SubLObject)pph_regression.TWO_INTEGER));
        $sym7$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym8$LOUD_WARNING = SubLObjectFactory.makeSymbol("LOUD-WARNING");
        $sym9$JOIN_STRINGS = SubLObjectFactory.makeSymbol("JOIN-STRINGS");
        $sym10$LIST = SubLObjectFactory.makeSymbol("LIST");
        $sym11$_EMPTY_STRING_ = SubLObjectFactory.makeSymbol("*EMPTY-STRING*");
        $str12$______PPH_REGRESSION_PROBLEM____ = SubLObjectFactory.makeString("  *** PPH REGRESSION PROBLEM ***");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("  *** SEE BELOW FOR DETAILS ***"));
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~%"));
        $str15$____PPH_REGRESSION_CASE_EXPECTED_ = SubLObjectFactory.makeString("*** PPH REGRESSION CASE EXPECTED TO FAIL ~A BUT PASSED ... details:~%");
        $sym16$PPH_REGRESSION_ITEM = SubLObjectFactory.makeSymbol("PPH-REGRESSION-ITEM");
        $sym17$PPH_REGRESSION_ITEM_P = SubLObjectFactory.makeSymbol("PPH-REGRESSION-ITEM-P");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST-CASE"), (SubLObject)SubLObjectFactory.makeSymbol("PURPOSE"), (SubLObject)SubLObjectFactory.makeSymbol("EXCUSED"), (SubLObject)SubLObjectFactory.makeSymbol("LANGUAGE-MT"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN-MT"));
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST-CASE"), (SubLObject)SubLObjectFactory.makeKeyword("PURPOSE"), (SubLObject)SubLObjectFactory.makeKeyword("EXCUSED"), (SubLObject)SubLObjectFactory.makeKeyword("LANGUAGE-MT"), (SubLObject)SubLObjectFactory.makeKeyword("DOMAIN-MT"));
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-REGRESSION-ITEM-TEST-CASE"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-REGRESSION-ITEM-PURPOSE"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-REGRESSION-ITEM-EXCUSED"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-REGRESSION-ITEM-LANGUAGE-MT"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-REGRESSION-ITEM-DOMAIN-MT"));
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PPH-REGRESSION-ITEM-TEST-CASE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PPH-REGRESSION-ITEM-PURPOSE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PPH-REGRESSION-ITEM-EXCUSED"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PPH-REGRESSION-ITEM-LANGUAGE-MT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PPH-REGRESSION-ITEM-DOMAIN-MT"));
        $sym22$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym23$PPH_REGRESSION_ITEM_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PPH-REGRESSION-ITEM-PRINT-FUNCTION-TRAMPOLINE");
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-REGRESSION-ITEM-P"));
        $sym25$PPH_REGRESSION_ITEM_TEST_CASE = SubLObjectFactory.makeSymbol("PPH-REGRESSION-ITEM-TEST-CASE");
        $sym26$_CSETF_PPH_REGRESSION_ITEM_TEST_CASE = SubLObjectFactory.makeSymbol("_CSETF-PPH-REGRESSION-ITEM-TEST-CASE");
        $sym27$PPH_REGRESSION_ITEM_PURPOSE = SubLObjectFactory.makeSymbol("PPH-REGRESSION-ITEM-PURPOSE");
        $sym28$_CSETF_PPH_REGRESSION_ITEM_PURPOSE = SubLObjectFactory.makeSymbol("_CSETF-PPH-REGRESSION-ITEM-PURPOSE");
        $sym29$PPH_REGRESSION_ITEM_EXCUSED = SubLObjectFactory.makeSymbol("PPH-REGRESSION-ITEM-EXCUSED");
        $sym30$_CSETF_PPH_REGRESSION_ITEM_EXCUSED = SubLObjectFactory.makeSymbol("_CSETF-PPH-REGRESSION-ITEM-EXCUSED");
        $sym31$PPH_REGRESSION_ITEM_LANGUAGE_MT = SubLObjectFactory.makeSymbol("PPH-REGRESSION-ITEM-LANGUAGE-MT");
        $sym32$_CSETF_PPH_REGRESSION_ITEM_LANGUAGE_MT = SubLObjectFactory.makeSymbol("_CSETF-PPH-REGRESSION-ITEM-LANGUAGE-MT");
        $sym33$PPH_REGRESSION_ITEM_DOMAIN_MT = SubLObjectFactory.makeSymbol("PPH-REGRESSION-ITEM-DOMAIN-MT");
        $sym34$_CSETF_PPH_REGRESSION_ITEM_DOMAIN_MT = SubLObjectFactory.makeSymbol("_CSETF-PPH-REGRESSION-ITEM-DOMAIN-MT");
        $kw35$TEST_CASE = SubLObjectFactory.makeKeyword("TEST-CASE");
        $kw36$PURPOSE = SubLObjectFactory.makeKeyword("PURPOSE");
        $kw37$EXCUSED = SubLObjectFactory.makeKeyword("EXCUSED");
        $kw38$LANGUAGE_MT = SubLObjectFactory.makeKeyword("LANGUAGE-MT");
        $kw39$DOMAIN_MT = SubLObjectFactory.makeKeyword("DOMAIN-MT");
        $str40$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw41$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym42$MAKE_PPH_REGRESSION_ITEM = SubLObjectFactory.makeSymbol("MAKE-PPH-REGRESSION-ITEM");
        $kw43$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw44$END = SubLObjectFactory.makeKeyword("END");
        $sym45$VISIT_DEFSTRUCT_OBJECT_PPH_REGRESSION_ITEM_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PPH-REGRESSION-ITEM-METHOD");
        $sym46$PROPER_LIST_P = SubLObjectFactory.makeSymbol("PROPER-LIST-P");
        $sym47$HLMT_ = SubLObjectFactory.makeSymbol("HLMT?");
        $str48$updating_status_of__S__w_r_t__tes = SubLObjectFactory.makeString("updating status of ~S~%w.r.t. test function ~S");
        $str49$____marked_as_failing_with_force_ = SubLObjectFactory.makeString("... marked as failing with force ~S");
        $str50$____failing_to_mark_as_failing_un = SubLObjectFactory.makeString("... failing to mark as failing under force ~S");
        $str51$____now_blessed_as_passing_with_f = SubLObjectFactory.makeString("... now blessed as passing with force ~S");
        $str52$At_least_1_argument_for_gather_pp = SubLObjectFactory.makeString("At least 1 argument for gather-pph-regression tests is required");
        $const53$PPHRegressionPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PPHRegressionPredicate"));
        $str54$KB_search = SubLObjectFactory.makeString("KB search");
        $str55$skipping_this_case_as_language_mt = SubLObjectFactory.makeString("skipping this case as language-mt ~S fails regression:~%~S");
        $str56$skipping_this_case_as_domain_mt__ = SubLObjectFactory.makeString("skipping this case as domain-mt ~S fails regression:~%~S");
        $sym57$INVALID_CONSTANT_ = SubLObjectFactory.makeSymbol("INVALID-CONSTANT?");
        $str58$_S_would_fail_regression__skippin = SubLObjectFactory.makeString("~S would fail regression, skipping test case:~%~S");
        $str59$_____ALERT___KB_ISSUES___ALERT___ = SubLObjectFactory.makeString(" *** ALERT * KB ISSUES * ALERT ***");
        $str60$These_test_cases_were_skipped_due = SubLObjectFactory.makeString("These test-cases were skipped due to constants missing from the KB:~%");
        $str61$_S_in__S = SubLObjectFactory.makeString("~S in ~S");
        $list62 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STORE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TEST-FUNC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list63 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST-FUNC"));
        $kw64$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw65$TEST_FUNC = SubLObjectFactory.makeKeyword("TEST-FUNC");
        $sym66$DO_SET = SubLObjectFactory.makeSymbol("DO-SET");
        $sym67$_PPH_TMP_REGRESSION_ITEM_ = SubLObjectFactory.makeSymbol("*PPH-TMP-REGRESSION-ITEM*");
        $sym68$GATHER_PPH_REGRESSION_TESTS = SubLObjectFactory.makeSymbol("GATHER-PPH-REGRESSION-TESTS");
        $list69 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-TMP-TEST-OBJECT*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-REGRESSION-ITEM-TEST-CASE"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-TMP-REGRESSION-ITEM*"))));
        $list70 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("REG-SPECIFIC-FUNC"));
        $sym71$_PPH_REGRESSION_CURRENT_TEST_ = SubLObjectFactory.makeSymbol("*PPH-REGRESSION-CURRENT-TEST*");
        $sym72$FUNCALL_INSTANCE_METHOD = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD");
        $sym73$SELF = SubLObjectFactory.makeSymbol("SELF");
        $list74 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-REGRESSION-FAILURE-EXPECTED?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL-IF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL-UNLESS")));
        $sym75$FUNCALL = SubLObjectFactory.makeSymbol("FUNCALL");
        $sym76$PPH_REGRESSION_DIAGNOSTICS = SubLObjectFactory.makeSymbol("PPH-REGRESSION-DIAGNOSTICS");
    }
    
    public static final class $pph_regression_item_native extends SubLStructNative
    {
        public SubLObject $test_case;
        public SubLObject $purpose;
        public SubLObject $excused;
        public SubLObject $language_mt;
        public SubLObject $domain_mt;
        private static final SubLStructDeclNative structDecl;
        
        public $pph_regression_item_native() {
            this.$test_case = (SubLObject)CommonSymbols.NIL;
            this.$purpose = (SubLObject)CommonSymbols.NIL;
            this.$excused = (SubLObject)CommonSymbols.NIL;
            this.$language_mt = (SubLObject)CommonSymbols.NIL;
            this.$domain_mt = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$pph_regression_item_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$test_case;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$purpose;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$excused;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$language_mt;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$domain_mt;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$test_case = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$purpose = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$excused = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$language_mt = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$domain_mt = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$pph_regression_item_native.class, pph_regression.$sym16$PPH_REGRESSION_ITEM, pph_regression.$sym17$PPH_REGRESSION_ITEM_P, pph_regression.$list18, pph_regression.$list19, new String[] { "$test_case", "$purpose", "$excused", "$language_mt", "$domain_mt" }, pph_regression.$list20, pph_regression.$list21, pph_regression.$sym22$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $pph_regression_item_p$UnaryFunction extends UnaryFunction
    {
        public $pph_regression_item_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PPH-REGRESSION-ITEM-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return pph_regression.pph_regression_item_p(arg1);
        }
    }
}

/*

	Total time: 194 ms
	 synthetic 
*/