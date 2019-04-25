package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reformulator_module_harness extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_harness";
    public static final String myFingerPrint = "21b3acfa90587f0a84528e320ee923de3d51d1c54ce57cbb1c334bd82ee3e0d6";
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
    public static SubLSymbol $dtp_rl_module$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 11424L)
    private static SubLSymbol $rl_module_store$;
    private static final SubLSymbol $sym0$RL_MODULE;
    private static final SubLSymbol $sym1$RL_MODULE_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_RL_MODULE;
    private static final SubLSymbol $sym7$RL_MODULE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$RLM_NAME;
    private static final SubLSymbol $sym10$_CSETF_RLM_NAME;
    private static final SubLSymbol $sym11$RLM_REQUIRED;
    private static final SubLSymbol $sym12$_CSETF_RLM_REQUIRED;
    private static final SubLSymbol $sym13$RLM_COST;
    private static final SubLSymbol $sym14$_CSETF_RLM_COST;
    private static final SubLSymbol $sym15$RLM_REFORMULATE;
    private static final SubLSymbol $sym16$_CSETF_RLM_REFORMULATE;
    private static final SubLSymbol $sym17$RLM_DOCUMENTATION;
    private static final SubLSymbol $sym18$_CSETF_RLM_DOCUMENTATION;
    private static final SubLSymbol $sym19$RLM_EXAMPLE_SOURCE;
    private static final SubLSymbol $sym20$_CSETF_RLM_EXAMPLE_SOURCE;
    private static final SubLSymbol $sym21$RLM_EXAMPLE_TARGET;
    private static final SubLSymbol $sym22$_CSETF_RLM_EXAMPLE_TARGET;
    private static final SubLSymbol $sym23$RLM_PLIST;
    private static final SubLSymbol $sym24$_CSETF_RLM_PLIST;
    private static final SubLSymbol $kw25$NAME;
    private static final SubLSymbol $kw26$REQUIRED;
    private static final SubLSymbol $kw27$COST;
    private static final SubLSymbol $kw28$REFORMULATE;
    private static final SubLSymbol $kw29$DOCUMENTATION;
    private static final SubLSymbol $kw30$EXAMPLE_SOURCE;
    private static final SubLSymbol $kw31$EXAMPLE_TARGET;
    private static final SubLSymbol $kw32$PLIST;
    private static final SubLString $str33$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw34$BEGIN;
    private static final SubLSymbol $sym35$MAKE_RL_MODULE;
    private static final SubLSymbol $kw36$SLOT;
    private static final SubLSymbol $kw37$END;
    private static final SubLSymbol $sym38$VISIT_DEFSTRUCT_OBJECT_RL_MODULE_METHOD;
    private static final SubLString $str39$__RL_Module__Name__________S__;
    private static final SubLString $str40$_____________Required______S__;
    private static final SubLString $str41$_____________Cost__________S__;
    private static final SubLString $str42$_____________Reformulate___S___;
    private static final SubLString $str43$__Documentation___A;
    private static final SubLString $str44$____Input_____S;
    private static final SubLString $str45$_____;
    private static final SubLString $str46$____Desired_output_____S;
    private static final SubLString $str47$__Missing__required_info__Abortin;
    private static final SubLString $str48$__Missing__cost_info__Aborting;
    private static final SubLString $str49$__Missing__reformulate_info__Abor;
    private static final SubLString $str50$__Missing__documentation_info__Ba;
    private static final SubLString $str51$__Missing__example_source_info__B;
    private static final SubLString $str52$__Missing__example_target_info__B;
    private static final SubLList $list53;
    private static final SubLSymbol $sym54$CDOLIST;
    private static final SubLList $list55;
    private static final SubLSymbol $sym56$CLET;
    private static final SubLList $list57;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$CSOME;
    private static final SubLSymbol $sym60$MOD;
    private static final SubLList $list61;
    private static final SubLSymbol $sym62$_RL_MODULE_STORE_;
    private static final SubLSymbol $sym63$RL_MODULE_NAME;
    private static final SubLString $str64$RL_module_store_corrupt__clearing;
    private static final SubLString $str65$RL_module__S_already_exists_in_th;
    private static final SubLString $str66$__No_module_named__S_found_in_the;
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
    public static SubLObject rl_module_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_rl_module(v_object, stream, (SubLObject)reformulator_module_harness.ZERO_INTEGER);
        return (SubLObject)reformulator_module_harness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
    public static SubLObject rl_module_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $rl_module_native.class) ? reformulator_module_harness.T : reformulator_module_harness.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
    public static SubLObject rlm_name(final SubLObject v_object) {
        assert reformulator_module_harness.NIL != rl_module_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
    public static SubLObject rlm_required(final SubLObject v_object) {
        assert reformulator_module_harness.NIL != rl_module_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
    public static SubLObject rlm_cost(final SubLObject v_object) {
        assert reformulator_module_harness.NIL != rl_module_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
    public static SubLObject rlm_reformulate(final SubLObject v_object) {
        assert reformulator_module_harness.NIL != rl_module_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
    public static SubLObject rlm_documentation(final SubLObject v_object) {
        assert reformulator_module_harness.NIL != rl_module_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
    public static SubLObject rlm_example_source(final SubLObject v_object) {
        assert reformulator_module_harness.NIL != rl_module_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
    public static SubLObject rlm_example_target(final SubLObject v_object) {
        assert reformulator_module_harness.NIL != rl_module_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
    public static SubLObject rlm_plist(final SubLObject v_object) {
        assert reformulator_module_harness.NIL != rl_module_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
    public static SubLObject _csetf_rlm_name(final SubLObject v_object, final SubLObject value) {
        assert reformulator_module_harness.NIL != rl_module_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
    public static SubLObject _csetf_rlm_required(final SubLObject v_object, final SubLObject value) {
        assert reformulator_module_harness.NIL != rl_module_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
    public static SubLObject _csetf_rlm_cost(final SubLObject v_object, final SubLObject value) {
        assert reformulator_module_harness.NIL != rl_module_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
    public static SubLObject _csetf_rlm_reformulate(final SubLObject v_object, final SubLObject value) {
        assert reformulator_module_harness.NIL != rl_module_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
    public static SubLObject _csetf_rlm_documentation(final SubLObject v_object, final SubLObject value) {
        assert reformulator_module_harness.NIL != rl_module_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
    public static SubLObject _csetf_rlm_example_source(final SubLObject v_object, final SubLObject value) {
        assert reformulator_module_harness.NIL != rl_module_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
    public static SubLObject _csetf_rlm_example_target(final SubLObject v_object, final SubLObject value) {
        assert reformulator_module_harness.NIL != rl_module_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
    public static SubLObject _csetf_rlm_plist(final SubLObject v_object, final SubLObject value) {
        assert reformulator_module_harness.NIL != rl_module_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
    public static SubLObject make_rl_module(SubLObject arglist) {
        if (arglist == reformulator_module_harness.UNPROVIDED) {
            arglist = (SubLObject)reformulator_module_harness.NIL;
        }
        final SubLObject v_new = (SubLObject)new $rl_module_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)reformulator_module_harness.NIL, next = arglist; reformulator_module_harness.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)reformulator_module_harness.$kw25$NAME)) {
                _csetf_rlm_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)reformulator_module_harness.$kw26$REQUIRED)) {
                _csetf_rlm_required(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)reformulator_module_harness.$kw27$COST)) {
                _csetf_rlm_cost(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)reformulator_module_harness.$kw28$REFORMULATE)) {
                _csetf_rlm_reformulate(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)reformulator_module_harness.$kw29$DOCUMENTATION)) {
                _csetf_rlm_documentation(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)reformulator_module_harness.$kw30$EXAMPLE_SOURCE)) {
                _csetf_rlm_example_source(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)reformulator_module_harness.$kw31$EXAMPLE_TARGET)) {
                _csetf_rlm_example_target(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)reformulator_module_harness.$kw32$PLIST)) {
                _csetf_rlm_plist(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)reformulator_module_harness.$str33$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
    public static SubLObject visit_defstruct_rl_module(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)reformulator_module_harness.$kw34$BEGIN, (SubLObject)reformulator_module_harness.$sym35$MAKE_RL_MODULE, (SubLObject)reformulator_module_harness.EIGHT_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)reformulator_module_harness.$kw36$SLOT, (SubLObject)reformulator_module_harness.$kw25$NAME, rlm_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)reformulator_module_harness.$kw36$SLOT, (SubLObject)reformulator_module_harness.$kw26$REQUIRED, rlm_required(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)reformulator_module_harness.$kw36$SLOT, (SubLObject)reformulator_module_harness.$kw27$COST, rlm_cost(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)reformulator_module_harness.$kw36$SLOT, (SubLObject)reformulator_module_harness.$kw28$REFORMULATE, rlm_reformulate(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)reformulator_module_harness.$kw36$SLOT, (SubLObject)reformulator_module_harness.$kw29$DOCUMENTATION, rlm_documentation(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)reformulator_module_harness.$kw36$SLOT, (SubLObject)reformulator_module_harness.$kw30$EXAMPLE_SOURCE, rlm_example_source(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)reformulator_module_harness.$kw36$SLOT, (SubLObject)reformulator_module_harness.$kw31$EXAMPLE_TARGET, rlm_example_target(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)reformulator_module_harness.$kw36$SLOT, (SubLObject)reformulator_module_harness.$kw32$PLIST, rlm_plist(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)reformulator_module_harness.$kw37$END, (SubLObject)reformulator_module_harness.$sym35$MAKE_RL_MODULE, (SubLObject)reformulator_module_harness.EIGHT_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4337L)
    public static SubLObject visit_defstruct_object_rl_module_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rl_module(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 4552L)
    public static SubLObject print_rl_module(final SubLObject rl_module, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)reformulator_module_harness.$str39$__RL_Module__Name__________S__, rl_module_name(rl_module));
        PrintLow.format(stream, (SubLObject)reformulator_module_harness.$str40$_____________Required______S__, rl_module_required_function(rl_module));
        PrintLow.format(stream, (SubLObject)reformulator_module_harness.$str41$_____________Cost__________S__, rl_module_cost_function(rl_module));
        PrintLow.format(stream, (SubLObject)reformulator_module_harness.$str42$_____________Reformulate___S___, rl_module_reformulate_function(rl_module));
        return rl_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 5253L)
    public static SubLObject print_rl_module_documentation(final SubLObject rl_module, SubLObject stream) {
        if (stream == reformulator_module_harness.UNPROVIDED) {
            stream = (SubLObject)reformulator_module_harness.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding(thread);
        try {
            print_high.$print_pretty$.bind((SubLObject)reformulator_module_harness.NIL, thread);
            PrintLow.format(stream, (SubLObject)reformulator_module_harness.$str43$__Documentation___A, rl_module_documentation(rl_module));
            PrintLow.format(stream, (SubLObject)reformulator_module_harness.$str44$____Input_____S, rl_module_example_source(rl_module));
            PrintLow.format(stream, (SubLObject)reformulator_module_harness.$str45$_____);
            PrintLow.format(stream, (SubLObject)reformulator_module_harness.$str46$____Desired_output_____S, rl_module_example_target(rl_module));
        }
        finally {
            print_high.$print_pretty$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)reformulator_module_harness.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 5641L)
    public static SubLObject new_rl_module(final SubLObject module_keyword, final SubLObject plist) {
        final SubLObject rl_module = make_rl_module((SubLObject)reformulator_module_harness.UNPROVIDED);
        final SubLObject required_function = conses_high.getf(plist, (SubLObject)reformulator_module_harness.$kw26$REQUIRED, (SubLObject)reformulator_module_harness.UNPROVIDED);
        final SubLObject cost_function = conses_high.getf(plist, (SubLObject)reformulator_module_harness.$kw27$COST, (SubLObject)reformulator_module_harness.UNPROVIDED);
        final SubLObject reformulate_function = conses_high.getf(plist, (SubLObject)reformulator_module_harness.$kw28$REFORMULATE, (SubLObject)reformulator_module_harness.UNPROVIDED);
        final SubLObject documentation = conses_high.getf(plist, (SubLObject)reformulator_module_harness.$kw29$DOCUMENTATION, (SubLObject)reformulator_module_harness.UNPROVIDED);
        final SubLObject example_source = conses_high.getf(plist, (SubLObject)reformulator_module_harness.$kw30$EXAMPLE_SOURCE, (SubLObject)reformulator_module_harness.UNPROVIDED);
        final SubLObject example_target = conses_high.getf(plist, (SubLObject)reformulator_module_harness.$kw31$EXAMPLE_TARGET, (SubLObject)reformulator_module_harness.UNPROVIDED);
        if (reformulator_module_harness.NIL == required_function) {
            reformulator_hub.ref_warn((SubLObject)reformulator_module_harness.ZERO_INTEGER, (SubLObject)reformulator_module_harness.$str47$__Missing__required_info__Abortin, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED);
            return (SubLObject)reformulator_module_harness.NIL;
        }
        _csetf_rlm_required(rl_module, required_function);
        if (reformulator_module_harness.NIL == cost_function) {
            reformulator_hub.ref_warn((SubLObject)reformulator_module_harness.ZERO_INTEGER, (SubLObject)reformulator_module_harness.$str48$__Missing__cost_info__Aborting, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED);
            return (SubLObject)reformulator_module_harness.NIL;
        }
        _csetf_rlm_cost(rl_module, cost_function);
        if (reformulator_module_harness.NIL == reformulate_function) {
            reformulator_hub.ref_warn((SubLObject)reformulator_module_harness.ZERO_INTEGER, (SubLObject)reformulator_module_harness.$str49$__Missing__reformulate_info__Abor, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED);
            return (SubLObject)reformulator_module_harness.NIL;
        }
        _csetf_rlm_reformulate(rl_module, reformulate_function);
        _csetf_rlm_name(rl_module, module_keyword);
        if (reformulator_module_harness.NIL == documentation) {
            reformulator_hub.ref_warn((SubLObject)reformulator_module_harness.TWO_INTEGER, (SubLObject)reformulator_module_harness.$str50$__Missing__documentation_info__Ba, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED);
        }
        _csetf_rlm_documentation(rl_module, documentation);
        if (reformulator_module_harness.NIL == example_source) {
            reformulator_hub.ref_warn((SubLObject)reformulator_module_harness.TWO_INTEGER, (SubLObject)reformulator_module_harness.$str51$__Missing__example_source_info__B, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED);
        }
        _csetf_rlm_example_source(rl_module, example_source);
        if (reformulator_module_harness.NIL == example_target) {
            reformulator_hub.ref_warn((SubLObject)reformulator_module_harness.TWO_INTEGER, (SubLObject)reformulator_module_harness.$str52$__Missing__example_target_info__B, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED);
        }
        _csetf_rlm_example_target(rl_module, example_target);
        return rl_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 7399L)
    public static SubLObject rl_module_name(final SubLObject rl_module) {
        return rlm_name(rl_module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 7475L)
    public static SubLObject rl_module_required_function(final SubLObject rl_module) {
        return rlm_required(rl_module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 7602L)
    public static SubLObject rl_module_cost_function(final SubLObject rl_module) {
        return rlm_cost(rl_module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 7721L)
    public static SubLObject rl_module_reformulate_function(final SubLObject rl_module) {
        return rlm_reformulate(rl_module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 7854L)
    public static SubLObject rl_module_documentation(final SubLObject rl_module) {
        return rlm_documentation(rl_module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 7946L)
    public static SubLObject rl_module_example_source(final SubLObject rl_module) {
        return rlm_example_source(rl_module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 8040L)
    public static SubLObject rl_module_example_target(final SubLObject rl_module) {
        return rlm_example_target(rl_module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 8134L)
    public static SubLObject rl_module_plist(final SubLObject rl_module) {
        return rlm_plist(rl_module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 8210L)
    public static SubLObject valid_rl_moduleP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_harness.NIL != rl_module_p(v_object) && reformulator_module_harness.NIL != constant_handles.constant_p(rl_module_name(v_object)) && rl_module_required_function(v_object).isFunctionSpec() && rl_module_cost_function(v_object).isFunctionSpec() && rl_module_reformulate_function(v_object).isFunctionSpec());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 8515L)
    public static SubLObject do_rl_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)reformulator_module_harness.$list53);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject module = (SubLObject)reformulator_module_harness.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)reformulator_module_harness.$list53);
        module = current.first();
        current = current.rest();
        if (reformulator_module_harness.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)reformulator_module_harness.$sym54$CDOLIST, (SubLObject)reformulator_module_harness.$list55, (SubLObject)ConsesLow.listS((SubLObject)reformulator_module_harness.$sym56$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(module, (SubLObject)reformulator_module_harness.$list57)), ConsesLow.append(body, (SubLObject)reformulator_module_harness.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)reformulator_module_harness.$list53);
        return (SubLObject)reformulator_module_harness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 9017L)
    public static SubLObject some_rl_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)reformulator_module_harness.$list58);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject module = (SubLObject)reformulator_module_harness.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)reformulator_module_harness.$list58);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : reformulator_module_harness.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)reformulator_module_harness.$list58);
        current = current.rest();
        if (reformulator_module_harness.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)reformulator_module_harness.$sym59$CSOME, (SubLObject)ConsesLow.list((SubLObject)reformulator_module_harness.$sym60$MOD, (SubLObject)reformulator_module_harness.$list61, done_var), (SubLObject)ConsesLow.listS((SubLObject)reformulator_module_harness.$sym56$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(module, (SubLObject)reformulator_module_harness.$list57)), ConsesLow.append(body, (SubLObject)reformulator_module_harness.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)reformulator_module_harness.$list58);
        return (SubLObject)reformulator_module_harness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 9364L)
    public static SubLObject declare_rl_module(final SubLObject module_constant, final SubLObject plist) {
        clear_rl_module_store_if_corrupt();
        final SubLObject module = new_rl_module(module_constant, plist);
        add_rl_module_to_store(module);
        return module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 11467L)
    public static SubLObject rl_module_store() {
        return reformulator_module_harness.$rl_module_store$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 11577L)
    public static SubLObject rl_module_names() {
        return Mapping.mapcar((SubLObject)reformulator_module_harness.$sym63$RL_MODULE_NAME, rl_module_store());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 11667L)
    public static SubLObject rl_module_store_size() {
        return Sequences.length(reformulator_module_harness.$rl_module_store$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 11863L)
    public static SubLObject clear_rl_module_store() {
        reformulator_module_harness.$rl_module_store$.setGlobalValue((SubLObject)reformulator_module_harness.NIL);
        return (SubLObject)reformulator_module_harness.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 11948L)
    public static SubLObject clear_rl_module_store_if_corrupt() {
        SubLObject cdolist_list_var = rl_module_store();
        SubLObject mod = (SubLObject)reformulator_module_harness.NIL;
        mod = cdolist_list_var.first();
        while (reformulator_module_harness.NIL != cdolist_list_var) {
            final SubLObject rl_module = mod;
            if (reformulator_module_harness.NIL == valid_rl_moduleP(rl_module)) {
                reformulator_hub.ref_warn((SubLObject)reformulator_module_harness.ZERO_INTEGER, (SubLObject)reformulator_module_harness.$str64$RL_module_store_corrupt__clearing, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED);
                clear_rl_module_store();
                return (SubLObject)reformulator_module_harness.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            mod = cdolist_list_var.first();
        }
        return (SubLObject)reformulator_module_harness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 12341L)
    public static SubLObject get_rl_module_from_store(final SubLObject constant) {
        SubLObject module_found = (SubLObject)reformulator_module_harness.NIL;
        if (reformulator_module_harness.NIL == module_found) {
            SubLObject csome_list_var = rl_module_store();
            SubLObject mod = (SubLObject)reformulator_module_harness.NIL;
            mod = csome_list_var.first();
            while (reformulator_module_harness.NIL == module_found && reformulator_module_harness.NIL != csome_list_var) {
                final SubLObject rl_module = mod;
                if (constant.eql(rl_module_name(rl_module))) {
                    module_found = rl_module;
                }
                csome_list_var = csome_list_var.rest();
                mod = csome_list_var.first();
            }
        }
        return module_found;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 12750L)
    public static SubLObject add_rl_module_to_store(final SubLObject rl_module) {
        final SubLObject constant = rl_module_name(rl_module);
        if (reformulator_module_harness.NIL != get_rl_module_from_store(constant)) {
            reformulator_hub.ref_warn((SubLObject)reformulator_module_harness.FIVE_INTEGER, (SubLObject)reformulator_module_harness.$str65$RL_module__S_already_exists_in_th, constant, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED);
            remove_rl_module_from_store(constant);
        }
        reformulator_module_harness.$rl_module_store$.setGlobalValue((SubLObject)ConsesLow.cons(rl_module, reformulator_module_harness.$rl_module_store$.getGlobalValue()));
        return (SubLObject)reformulator_module_harness.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 13245L)
    public static SubLObject remove_rl_module_from_store(final SubLObject constant) {
        SubLObject others = (SubLObject)reformulator_module_harness.NIL;
        SubLObject cdolist_list_var = rl_module_store();
        SubLObject mod = (SubLObject)reformulator_module_harness.NIL;
        mod = cdolist_list_var.first();
        while (reformulator_module_harness.NIL != cdolist_list_var) {
            final SubLObject module = mod;
            if (!constant.eql(rl_module_name(module))) {
                others = (SubLObject)ConsesLow.cons(module, others);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mod = cdolist_list_var.first();
        }
        if (reformulator_module_harness.NIL != list_utilities.same_length_p(rl_module_store(), others)) {
            reformulator_hub.ref_warn((SubLObject)reformulator_module_harness.TWO_INTEGER, (SubLObject)reformulator_module_harness.$str66$__No_module_named__S_found_in_the, constant, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED, (SubLObject)reformulator_module_harness.UNPROVIDED);
            return (SubLObject)reformulator_module_harness.NIL;
        }
        reformulator_module_harness.$rl_module_store$.setGlobalValue(Sequences.nreverse(others));
        return (SubLObject)reformulator_module_harness.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 13820L)
    public static SubLObject rl_module_applicableP(final SubLObject rl_module, final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return Functions.funcall(rl_module_required_function(rl_module), expression, mt, settings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 14304L)
    public static SubLObject rl_module_cost(final SubLObject rl_module, final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return Functions.funcall(rl_module_cost_function(rl_module), expression, mt, settings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-harness.lisp", position = 14567L)
    public static SubLObject rl_module_reformulate(final SubLObject rl_module, final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        return Functions.funcall(rl_module_reformulate_function(rl_module), expression, original_clause, mt, settings);
    }
    
    public static SubLObject declare_reformulator_module_harness_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "rl_module_print_function_trampoline", "RL-MODULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "rl_module_p", "RL-MODULE-P", 1, 0, false);
        new $rl_module_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "rlm_name", "RLM-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "rlm_required", "RLM-REQUIRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "rlm_cost", "RLM-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "rlm_reformulate", "RLM-REFORMULATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "rlm_documentation", "RLM-DOCUMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "rlm_example_source", "RLM-EXAMPLE-SOURCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "rlm_example_target", "RLM-EXAMPLE-TARGET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "rlm_plist", "RLM-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "_csetf_rlm_name", "_CSETF-RLM-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "_csetf_rlm_required", "_CSETF-RLM-REQUIRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "_csetf_rlm_cost", "_CSETF-RLM-COST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "_csetf_rlm_reformulate", "_CSETF-RLM-REFORMULATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "_csetf_rlm_documentation", "_CSETF-RLM-DOCUMENTATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "_csetf_rlm_example_source", "_CSETF-RLM-EXAMPLE-SOURCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "_csetf_rlm_example_target", "_CSETF-RLM-EXAMPLE-TARGET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "_csetf_rlm_plist", "_CSETF-RLM-PLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "make_rl_module", "MAKE-RL-MODULE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "visit_defstruct_rl_module", "VISIT-DEFSTRUCT-RL-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "visit_defstruct_object_rl_module_method", "VISIT-DEFSTRUCT-OBJECT-RL-MODULE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "print_rl_module", "PRINT-RL-MODULE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "print_rl_module_documentation", "PRINT-RL-MODULE-DOCUMENTATION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "new_rl_module", "NEW-RL-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "rl_module_name", "RL-MODULE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "rl_module_required_function", "RL-MODULE-REQUIRED-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "rl_module_cost_function", "RL-MODULE-COST-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "rl_module_reformulate_function", "RL-MODULE-REFORMULATE-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "rl_module_documentation", "RL-MODULE-DOCUMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "rl_module_example_source", "RL-MODULE-EXAMPLE-SOURCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "rl_module_example_target", "RL-MODULE-EXAMPLE-TARGET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "rl_module_plist", "RL-MODULE-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "valid_rl_moduleP", "VALID-RL-MODULE?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.reformulator_module_harness", "do_rl_modules", "DO-RL-MODULES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.reformulator_module_harness", "some_rl_modules", "SOME-RL-MODULES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "declare_rl_module", "DECLARE-RL-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "rl_module_store", "RL-MODULE-STORE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "rl_module_names", "RL-MODULE-NAMES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "rl_module_store_size", "RL-MODULE-STORE-SIZE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "clear_rl_module_store", "CLEAR-RL-MODULE-STORE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "clear_rl_module_store_if_corrupt", "CLEAR-RL-MODULE-STORE-IF-CORRUPT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "get_rl_module_from_store", "GET-RL-MODULE-FROM-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "add_rl_module_to_store", "ADD-RL-MODULE-TO-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "remove_rl_module_from_store", "REMOVE-RL-MODULE-FROM-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "rl_module_applicableP", "RL-MODULE-APPLICABLE?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "rl_module_cost", "RL-MODULE-COST", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_harness", "rl_module_reformulate", "RL-MODULE-REFORMULATE", 5, 0, false);
        return (SubLObject)reformulator_module_harness.NIL;
    }
    
    public static SubLObject init_reformulator_module_harness_file() {
        reformulator_module_harness.$dtp_rl_module$ = SubLFiles.defconstant("*DTP-RL-MODULE*", (SubLObject)reformulator_module_harness.$sym0$RL_MODULE);
        reformulator_module_harness.$rl_module_store$ = SubLFiles.deflexical("*RL-MODULE-STORE*", (SubLObject)(maybeDefault((SubLObject)reformulator_module_harness.$sym62$_RL_MODULE_STORE_, reformulator_module_harness.$rl_module_store$, reformulator_module_harness.NIL)));
        return (SubLObject)reformulator_module_harness.NIL;
    }
    
    public static SubLObject setup_reformulator_module_harness_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), reformulator_module_harness.$dtp_rl_module$.getGlobalValue(), Symbols.symbol_function((SubLObject)reformulator_module_harness.$sym7$RL_MODULE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)reformulator_module_harness.$list8);
        Structures.def_csetf((SubLObject)reformulator_module_harness.$sym9$RLM_NAME, (SubLObject)reformulator_module_harness.$sym10$_CSETF_RLM_NAME);
        Structures.def_csetf((SubLObject)reformulator_module_harness.$sym11$RLM_REQUIRED, (SubLObject)reformulator_module_harness.$sym12$_CSETF_RLM_REQUIRED);
        Structures.def_csetf((SubLObject)reformulator_module_harness.$sym13$RLM_COST, (SubLObject)reformulator_module_harness.$sym14$_CSETF_RLM_COST);
        Structures.def_csetf((SubLObject)reformulator_module_harness.$sym15$RLM_REFORMULATE, (SubLObject)reformulator_module_harness.$sym16$_CSETF_RLM_REFORMULATE);
        Structures.def_csetf((SubLObject)reformulator_module_harness.$sym17$RLM_DOCUMENTATION, (SubLObject)reformulator_module_harness.$sym18$_CSETF_RLM_DOCUMENTATION);
        Structures.def_csetf((SubLObject)reformulator_module_harness.$sym19$RLM_EXAMPLE_SOURCE, (SubLObject)reformulator_module_harness.$sym20$_CSETF_RLM_EXAMPLE_SOURCE);
        Structures.def_csetf((SubLObject)reformulator_module_harness.$sym21$RLM_EXAMPLE_TARGET, (SubLObject)reformulator_module_harness.$sym22$_CSETF_RLM_EXAMPLE_TARGET);
        Structures.def_csetf((SubLObject)reformulator_module_harness.$sym23$RLM_PLIST, (SubLObject)reformulator_module_harness.$sym24$_CSETF_RLM_PLIST);
        Equality.identity((SubLObject)reformulator_module_harness.$sym0$RL_MODULE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), reformulator_module_harness.$dtp_rl_module$.getGlobalValue(), Symbols.symbol_function((SubLObject)reformulator_module_harness.$sym38$VISIT_DEFSTRUCT_OBJECT_RL_MODULE_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)reformulator_module_harness.$sym62$_RL_MODULE_STORE_);
        return (SubLObject)reformulator_module_harness.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_reformulator_module_harness_file();
    }
    
    @Override
	public void initializeVariables() {
        init_reformulator_module_harness_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_reformulator_module_harness_file();
    }
    
    static {
        me = (SubLFile)new reformulator_module_harness();
        reformulator_module_harness.$dtp_rl_module$ = null;
        reformulator_module_harness.$rl_module_store$ = null;
        $sym0$RL_MODULE = SubLObjectFactory.makeSymbol("RL-MODULE");
        $sym1$RL_MODULE_P = SubLObjectFactory.makeSymbol("RL-MODULE-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("REQUIRED"), (SubLObject)SubLObjectFactory.makeSymbol("COST"), (SubLObject)SubLObjectFactory.makeSymbol("REFORMULATE"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeSymbol("EXAMPLE-SOURCE"), (SubLObject)SubLObjectFactory.makeSymbol("EXAMPLE-TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("PLIST"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED"), (SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)SubLObjectFactory.makeKeyword("REFORMULATE"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeKeyword("EXAMPLE-SOURCE"), (SubLObject)SubLObjectFactory.makeKeyword("EXAMPLE-TARGET"), (SubLObject)SubLObjectFactory.makeKeyword("PLIST"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLM-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("RLM-REQUIRED"), (SubLObject)SubLObjectFactory.makeSymbol("RLM-COST"), (SubLObject)SubLObjectFactory.makeSymbol("RLM-REFORMULATE"), (SubLObject)SubLObjectFactory.makeSymbol("RLM-DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeSymbol("RLM-EXAMPLE-SOURCE"), (SubLObject)SubLObjectFactory.makeSymbol("RLM-EXAMPLE-TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("RLM-PLIST"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RLM-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RLM-REQUIRED"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RLM-COST"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RLM-REFORMULATE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RLM-DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RLM-EXAMPLE-SOURCE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RLM-EXAMPLE-TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RLM-PLIST"));
        $sym6$PRINT_RL_MODULE = SubLObjectFactory.makeSymbol("PRINT-RL-MODULE");
        $sym7$RL_MODULE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("RL-MODULE-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("RL-MODULE-P"));
        $sym9$RLM_NAME = SubLObjectFactory.makeSymbol("RLM-NAME");
        $sym10$_CSETF_RLM_NAME = SubLObjectFactory.makeSymbol("_CSETF-RLM-NAME");
        $sym11$RLM_REQUIRED = SubLObjectFactory.makeSymbol("RLM-REQUIRED");
        $sym12$_CSETF_RLM_REQUIRED = SubLObjectFactory.makeSymbol("_CSETF-RLM-REQUIRED");
        $sym13$RLM_COST = SubLObjectFactory.makeSymbol("RLM-COST");
        $sym14$_CSETF_RLM_COST = SubLObjectFactory.makeSymbol("_CSETF-RLM-COST");
        $sym15$RLM_REFORMULATE = SubLObjectFactory.makeSymbol("RLM-REFORMULATE");
        $sym16$_CSETF_RLM_REFORMULATE = SubLObjectFactory.makeSymbol("_CSETF-RLM-REFORMULATE");
        $sym17$RLM_DOCUMENTATION = SubLObjectFactory.makeSymbol("RLM-DOCUMENTATION");
        $sym18$_CSETF_RLM_DOCUMENTATION = SubLObjectFactory.makeSymbol("_CSETF-RLM-DOCUMENTATION");
        $sym19$RLM_EXAMPLE_SOURCE = SubLObjectFactory.makeSymbol("RLM-EXAMPLE-SOURCE");
        $sym20$_CSETF_RLM_EXAMPLE_SOURCE = SubLObjectFactory.makeSymbol("_CSETF-RLM-EXAMPLE-SOURCE");
        $sym21$RLM_EXAMPLE_TARGET = SubLObjectFactory.makeSymbol("RLM-EXAMPLE-TARGET");
        $sym22$_CSETF_RLM_EXAMPLE_TARGET = SubLObjectFactory.makeSymbol("_CSETF-RLM-EXAMPLE-TARGET");
        $sym23$RLM_PLIST = SubLObjectFactory.makeSymbol("RLM-PLIST");
        $sym24$_CSETF_RLM_PLIST = SubLObjectFactory.makeSymbol("_CSETF-RLM-PLIST");
        $kw25$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw26$REQUIRED = SubLObjectFactory.makeKeyword("REQUIRED");
        $kw27$COST = SubLObjectFactory.makeKeyword("COST");
        $kw28$REFORMULATE = SubLObjectFactory.makeKeyword("REFORMULATE");
        $kw29$DOCUMENTATION = SubLObjectFactory.makeKeyword("DOCUMENTATION");
        $kw30$EXAMPLE_SOURCE = SubLObjectFactory.makeKeyword("EXAMPLE-SOURCE");
        $kw31$EXAMPLE_TARGET = SubLObjectFactory.makeKeyword("EXAMPLE-TARGET");
        $kw32$PLIST = SubLObjectFactory.makeKeyword("PLIST");
        $str33$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw34$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym35$MAKE_RL_MODULE = SubLObjectFactory.makeSymbol("MAKE-RL-MODULE");
        $kw36$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw37$END = SubLObjectFactory.makeKeyword("END");
        $sym38$VISIT_DEFSTRUCT_OBJECT_RL_MODULE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-RL-MODULE-METHOD");
        $str39$__RL_Module__Name__________S__ = SubLObjectFactory.makeString("#<RL-Module: Name:        ~S~%");
        $str40$_____________Required______S__ = SubLObjectFactory.makeString("             Required:    ~S~%");
        $str41$_____________Cost__________S__ = SubLObjectFactory.makeString("             Cost:        ~S~%");
        $str42$_____________Reformulate___S___ = SubLObjectFactory.makeString("             Reformulate: ~S>~%");
        $str43$__Documentation___A = SubLObjectFactory.makeString("~%Documentation: ~A");
        $str44$____Input_____S = SubLObjectFactory.makeString("~%~%Input: ~%~S");
        $str45$_____ = SubLObjectFactory.makeString("~%==>");
        $str46$____Desired_output_____S = SubLObjectFactory.makeString("~%~%Desired output: ~%~S");
        $str47$__Missing__required_info__Abortin = SubLObjectFactory.makeString("~%Missing :required info. Aborting");
        $str48$__Missing__cost_info__Aborting = SubLObjectFactory.makeString("~%Missing :cost info. Aborting");
        $str49$__Missing__reformulate_info__Abor = SubLObjectFactory.makeString("~%Missing :reformulate info. Aborting");
        $str50$__Missing__documentation_info__Ba = SubLObjectFactory.makeString("~%Missing :documentation info. Bad programmer!");
        $str51$__Missing__example_source_info__B = SubLObjectFactory.makeString("~%Missing :example-source info. Bad programmer!");
        $str52$__Missing__example_target_info__B = SubLObjectFactory.makeString("~%Missing :example-target info. Bad programmer!");
        $list53 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODULE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym54$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RL-MODULE-STORE")));
        $sym56$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MOD"));
        $list58 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR"), (SubLObject)reformulator_module_harness.NIL)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym59$CSOME = SubLObjectFactory.makeSymbol("CSOME");
        $sym60$MOD = SubLObjectFactory.makeSymbol("MOD");
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RL-MODULE-STORE"));
        $sym62$_RL_MODULE_STORE_ = SubLObjectFactory.makeSymbol("*RL-MODULE-STORE*");
        $sym63$RL_MODULE_NAME = SubLObjectFactory.makeSymbol("RL-MODULE-NAME");
        $str64$RL_module_store_corrupt__clearing = SubLObjectFactory.makeString("RL module store corrupt; clearing...");
        $str65$RL_module__S_already_exists_in_th = SubLObjectFactory.makeString("RL module ~S already exists in the store; replacing.");
        $str66$__No_module_named__S_found_in_the = SubLObjectFactory.makeString("~%No module named ~S found in the store; could not remove.");
    }
    
    public static final class $rl_module_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $required;
        public SubLObject $cost;
        public SubLObject $reformulate;
        public SubLObject $documentation;
        public SubLObject $example_source;
        public SubLObject $example_target;
        public SubLObject $plist;
        private static final SubLStructDeclNative structDecl;
        
        public $rl_module_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$required = (SubLObject)CommonSymbols.NIL;
            this.$cost = (SubLObject)CommonSymbols.NIL;
            this.$reformulate = (SubLObject)CommonSymbols.NIL;
            this.$documentation = (SubLObject)CommonSymbols.NIL;
            this.$example_source = (SubLObject)CommonSymbols.NIL;
            this.$example_target = (SubLObject)CommonSymbols.NIL;
            this.$plist = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$rl_module_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$name;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$required;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$cost;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$reformulate;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$documentation;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$example_source;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$example_target;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$plist;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$required = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$cost = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$reformulate = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$documentation = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$example_source = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$example_target = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$plist = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$rl_module_native.class, reformulator_module_harness.$sym0$RL_MODULE, reformulator_module_harness.$sym1$RL_MODULE_P, reformulator_module_harness.$list2, reformulator_module_harness.$list3, new String[] { "$name", "$required", "$cost", "$reformulate", "$documentation", "$example_source", "$example_target", "$plist" }, reformulator_module_harness.$list4, reformulator_module_harness.$list5, reformulator_module_harness.$sym6$PRINT_RL_MODULE);
        }
    }
    
    public static final class $rl_module_p$UnaryFunction extends UnaryFunction
    {
        public $rl_module_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RL-MODULE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return reformulator_module_harness.rl_module_p(arg1);
        }
    }
}

/*

	Total time: 126 ms
	
*/