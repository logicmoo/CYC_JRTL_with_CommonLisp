package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reformulator_module_subcollection_processor extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_subcollection_processor";
    public static final String myFingerPrint = "0430c72adea26f9f864433f3e29f5dcd3f5473325d86237a5a8e485032682f4c";
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 1849L)
    private static SubLSymbol $scfn_microseconds$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 2928L)
    public static SubLSymbol $dtp_rl_scfn_data$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 6957L)
    private static SubLSymbol $subcollection_macros$;
    private static final SubLObject $const0$SubcollectionProcessorRLModule;
    private static final SubLList $list1;
    private static final SubLInteger $int2$2300;
    private static final SubLSymbol $sym3$RL_SCFN_DATA;
    private static final SubLSymbol $sym4$RL_SCFN_DATA_P;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$PRINT_RL_SCFN_DATA;
    private static final SubLSymbol $sym10$RL_SCFN_DATA_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$RL_SCFN_DATA_HIERARCHY_PRED;
    private static final SubLSymbol $sym13$_CSETF_RL_SCFN_DATA_HIERARCHY_PRED;
    private static final SubLSymbol $sym14$RL_SCFN_DATA_VAR_NAME;
    private static final SubLSymbol $sym15$_CSETF_RL_SCFN_DATA_VAR_NAME;
    private static final SubLSymbol $sym16$RL_SCFN_DATA_NAUT;
    private static final SubLSymbol $sym17$_CSETF_RL_SCFN_DATA_NAUT;
    private static final SubLSymbol $sym18$RL_SCFN_DATA_SUBCOLLECTION_FN;
    private static final SubLSymbol $sym19$_CSETF_RL_SCFN_DATA_SUBCOLLECTION_FN;
    private static final SubLSymbol $sym20$RL_SCFN_DATA_ARG_FROM;
    private static final SubLSymbol $sym21$_CSETF_RL_SCFN_DATA_ARG_FROM;
    private static final SubLSymbol $sym22$RL_SCFN_DATA_PRED;
    private static final SubLSymbol $sym23$_CSETF_RL_SCFN_DATA_PRED;
    private static final SubLSymbol $sym24$RL_SCFN_DATA_ARG_TO;
    private static final SubLSymbol $sym25$_CSETF_RL_SCFN_DATA_ARG_TO;
    private static final SubLSymbol $kw26$HIERARCHY_PRED;
    private static final SubLSymbol $kw27$VAR_NAME;
    private static final SubLSymbol $kw28$NAUT;
    private static final SubLSymbol $kw29$SUBCOLLECTION_FN;
    private static final SubLSymbol $kw30$ARG_FROM;
    private static final SubLSymbol $kw31$PRED;
    private static final SubLSymbol $kw32$ARG_TO;
    private static final SubLString $str33$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw34$BEGIN;
    private static final SubLSymbol $sym35$MAKE_RL_SCFN_DATA;
    private static final SubLSymbol $kw36$SLOT;
    private static final SubLSymbol $kw37$END;
    private static final SubLSymbol $sym38$VISIT_DEFSTRUCT_OBJECT_RL_SCFN_DATA_METHOD;
    private static final SubLString $str39$__RL_Scfn_Data__H_Pred____S__;
    private static final SubLString $str40$___________________Var____S__;
    private static final SubLString $str41$__________________NAUT____S__;
    private static final SubLString $str42$_______________SubC_fn____S__;
    private static final SubLString $str43$______________Arg_from____S__;
    private static final SubLString $str44$__________________Pred____S__;
    private static final SubLString $str45$________________Arg_To____S___;
    private static final SubLList $list46;
    private static final SubLObject $const47$SubcollectionFunction;
    private static final SubLList $list48;
    private static final SubLList $list49;
    private static final SubLList $list50;
    private static final SubLList $list51;
    private static final SubLList $list52;
    private static final SubLList $list53;
    private static final SubLList $list54;
    private static final SubLList $list55;
    private static final SubLObject $const56$CollectionIntersection2Fn;
    private static final SubLObject $const57$CollectionDifferenceFn;
    private static final SubLObject $const58$isa;
    private static final SubLObject $const59$genls;
    private static final SubLObject $const60$disjointWith;
    private static final SubLObject $const61$ProspectiveCollectionFn;
    private static final SubLObject $const62$prospectiveMembers;
    private static final SubLObject $const63$relationAllInstance;
    private static final SubLSymbol $kw64$TO;
    private static final SubLSymbol $kw65$FROM;
    private static final SubLSymbol $kw66$TERM;
    private static final SubLSymbol $kw67$ARG;
    private static final SubLString $str68$Reformulator_Subcollection_Proces;
    private static final SubLString $str69$subcoll_proc_test_suite;
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 1896L)
    public static SubLObject scfn_cost_estimate(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return reformulator_module_subcollection_processor.$scfn_microseconds$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 2928L)
    public static SubLObject rl_scfn_data_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_rl_scfn_data(v_object, stream, (SubLObject)reformulator_module_subcollection_processor.ZERO_INTEGER);
        return (SubLObject)reformulator_module_subcollection_processor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 2928L)
    public static SubLObject rl_scfn_data_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $rl_scfn_data_native.class) ? reformulator_module_subcollection_processor.T : reformulator_module_subcollection_processor.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 2928L)
    public static SubLObject rl_scfn_data_hierarchy_pred(final SubLObject v_object) {
        assert reformulator_module_subcollection_processor.NIL != rl_scfn_data_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 2928L)
    public static SubLObject rl_scfn_data_var_name(final SubLObject v_object) {
        assert reformulator_module_subcollection_processor.NIL != rl_scfn_data_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 2928L)
    public static SubLObject rl_scfn_data_naut(final SubLObject v_object) {
        assert reformulator_module_subcollection_processor.NIL != rl_scfn_data_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 2928L)
    public static SubLObject rl_scfn_data_subcollection_fn(final SubLObject v_object) {
        assert reformulator_module_subcollection_processor.NIL != rl_scfn_data_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 2928L)
    public static SubLObject rl_scfn_data_arg_from(final SubLObject v_object) {
        assert reformulator_module_subcollection_processor.NIL != rl_scfn_data_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 2928L)
    public static SubLObject rl_scfn_data_pred(final SubLObject v_object) {
        assert reformulator_module_subcollection_processor.NIL != rl_scfn_data_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 2928L)
    public static SubLObject rl_scfn_data_arg_to(final SubLObject v_object) {
        assert reformulator_module_subcollection_processor.NIL != rl_scfn_data_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 2928L)
    public static SubLObject _csetf_rl_scfn_data_hierarchy_pred(final SubLObject v_object, final SubLObject value) {
        assert reformulator_module_subcollection_processor.NIL != rl_scfn_data_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 2928L)
    public static SubLObject _csetf_rl_scfn_data_var_name(final SubLObject v_object, final SubLObject value) {
        assert reformulator_module_subcollection_processor.NIL != rl_scfn_data_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 2928L)
    public static SubLObject _csetf_rl_scfn_data_naut(final SubLObject v_object, final SubLObject value) {
        assert reformulator_module_subcollection_processor.NIL != rl_scfn_data_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 2928L)
    public static SubLObject _csetf_rl_scfn_data_subcollection_fn(final SubLObject v_object, final SubLObject value) {
        assert reformulator_module_subcollection_processor.NIL != rl_scfn_data_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 2928L)
    public static SubLObject _csetf_rl_scfn_data_arg_from(final SubLObject v_object, final SubLObject value) {
        assert reformulator_module_subcollection_processor.NIL != rl_scfn_data_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 2928L)
    public static SubLObject _csetf_rl_scfn_data_pred(final SubLObject v_object, final SubLObject value) {
        assert reformulator_module_subcollection_processor.NIL != rl_scfn_data_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 2928L)
    public static SubLObject _csetf_rl_scfn_data_arg_to(final SubLObject v_object, final SubLObject value) {
        assert reformulator_module_subcollection_processor.NIL != rl_scfn_data_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 2928L)
    public static SubLObject make_rl_scfn_data(SubLObject arglist) {
        if (arglist == reformulator_module_subcollection_processor.UNPROVIDED) {
            arglist = (SubLObject)reformulator_module_subcollection_processor.NIL;
        }
        final SubLObject v_new = (SubLObject)new $rl_scfn_data_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)reformulator_module_subcollection_processor.NIL, next = arglist; reformulator_module_subcollection_processor.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)reformulator_module_subcollection_processor.$kw26$HIERARCHY_PRED)) {
                _csetf_rl_scfn_data_hierarchy_pred(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)reformulator_module_subcollection_processor.$kw27$VAR_NAME)) {
                _csetf_rl_scfn_data_var_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)reformulator_module_subcollection_processor.$kw28$NAUT)) {
                _csetf_rl_scfn_data_naut(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)reformulator_module_subcollection_processor.$kw29$SUBCOLLECTION_FN)) {
                _csetf_rl_scfn_data_subcollection_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)reformulator_module_subcollection_processor.$kw30$ARG_FROM)) {
                _csetf_rl_scfn_data_arg_from(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)reformulator_module_subcollection_processor.$kw31$PRED)) {
                _csetf_rl_scfn_data_pred(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)reformulator_module_subcollection_processor.$kw32$ARG_TO)) {
                _csetf_rl_scfn_data_arg_to(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)reformulator_module_subcollection_processor.$str33$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 2928L)
    public static SubLObject visit_defstruct_rl_scfn_data(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)reformulator_module_subcollection_processor.$kw34$BEGIN, (SubLObject)reformulator_module_subcollection_processor.$sym35$MAKE_RL_SCFN_DATA, (SubLObject)reformulator_module_subcollection_processor.SEVEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)reformulator_module_subcollection_processor.$kw36$SLOT, (SubLObject)reformulator_module_subcollection_processor.$kw26$HIERARCHY_PRED, rl_scfn_data_hierarchy_pred(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)reformulator_module_subcollection_processor.$kw36$SLOT, (SubLObject)reformulator_module_subcollection_processor.$kw27$VAR_NAME, rl_scfn_data_var_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)reformulator_module_subcollection_processor.$kw36$SLOT, (SubLObject)reformulator_module_subcollection_processor.$kw28$NAUT, rl_scfn_data_naut(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)reformulator_module_subcollection_processor.$kw36$SLOT, (SubLObject)reformulator_module_subcollection_processor.$kw29$SUBCOLLECTION_FN, rl_scfn_data_subcollection_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)reformulator_module_subcollection_processor.$kw36$SLOT, (SubLObject)reformulator_module_subcollection_processor.$kw30$ARG_FROM, rl_scfn_data_arg_from(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)reformulator_module_subcollection_processor.$kw36$SLOT, (SubLObject)reformulator_module_subcollection_processor.$kw31$PRED, rl_scfn_data_pred(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)reformulator_module_subcollection_processor.$kw36$SLOT, (SubLObject)reformulator_module_subcollection_processor.$kw32$ARG_TO, rl_scfn_data_arg_to(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)reformulator_module_subcollection_processor.$kw37$END, (SubLObject)reformulator_module_subcollection_processor.$sym35$MAKE_RL_SCFN_DATA, (SubLObject)reformulator_module_subcollection_processor.SEVEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 2928L)
    public static SubLObject visit_defstruct_object_rl_scfn_data_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rl_scfn_data(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 3410L)
    public static SubLObject print_rl_scfn_data(final SubLObject rl_scfn_data, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)reformulator_module_subcollection_processor.$str39$__RL_Scfn_Data__H_Pred____S__, rl_scfn_data_hierarchy_pred(rl_scfn_data));
        PrintLow.format(stream, (SubLObject)reformulator_module_subcollection_processor.$str40$___________________Var____S__, rl_scfn_data_var_name(rl_scfn_data));
        PrintLow.format(stream, (SubLObject)reformulator_module_subcollection_processor.$str41$__________________NAUT____S__, rl_scfn_data_naut(rl_scfn_data));
        PrintLow.format(stream, (SubLObject)reformulator_module_subcollection_processor.$str42$_______________SubC_fn____S__, rl_scfn_data_subcollection_fn(rl_scfn_data));
        PrintLow.format(stream, (SubLObject)reformulator_module_subcollection_processor.$str43$______________Arg_from____S__, rl_scfn_data_arg_from(rl_scfn_data));
        PrintLow.format(stream, (SubLObject)reformulator_module_subcollection_processor.$str44$__________________Pred____S__, rl_scfn_data_pred(rl_scfn_data));
        PrintLow.format(stream, (SubLObject)reformulator_module_subcollection_processor.$str45$________________Arg_To____S___, rl_scfn_data_arg_to(rl_scfn_data));
        return rl_scfn_data;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 4131L)
    public static SubLObject new_rl_scfn_data(final SubLObject hier, final SubLObject var, final SubLObject naut, final SubLObject scfn, final SubLObject arg_from, final SubLObject pred, final SubLObject arg_to) {
        final SubLObject rl_scfn_data = make_rl_scfn_data((SubLObject)reformulator_module_subcollection_processor.UNPROVIDED);
        _csetf_rl_scfn_data_hierarchy_pred(rl_scfn_data, hier);
        _csetf_rl_scfn_data_var_name(rl_scfn_data, var);
        _csetf_rl_scfn_data_naut(rl_scfn_data, naut);
        _csetf_rl_scfn_data_subcollection_fn(rl_scfn_data, scfn);
        _csetf_rl_scfn_data_arg_from(rl_scfn_data, arg_from);
        _csetf_rl_scfn_data_pred(rl_scfn_data, pred);
        _csetf_rl_scfn_data_arg_to(rl_scfn_data, arg_to);
        return rl_scfn_data;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 4666L)
    public static SubLObject scfn_expression_required(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        if (reformulator_module_subcollection_processor.NIL != clauses.clauses_p(expression) && reformulator_module_subcollection_processor.NIL != list_utilities.singletonP(expression) && reformulator_module_subcollection_processor.NIL != clause_utilities.pos_atomic_cnf_p(expression.first())) {
            final SubLObject sentence = clause_utilities.gaf_cnf_literal(expression.first());
            return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_subcollection_processor.NIL != el_utilities.possibly_atomic_sentence_p(sentence) && reformulator_module_subcollection_processor.NIL != el_utilities.formula_arityE(sentence, (SubLObject)reformulator_module_subcollection_processor.TWO_INTEGER, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED) && reformulator_module_subcollection_processor.NIL != conses_high.member(cycl_utilities.atomic_sentence_predicate(sentence), (SubLObject)reformulator_module_subcollection_processor.$list46, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED) && (reformulator_module_subcollection_processor.NIL != nart_handles.nart_p(cycl_utilities.sentence_arg2(sentence, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED)) || reformulator_module_subcollection_processor.NIL != el_utilities.possibly_naut_p(cycl_utilities.sentence_arg2(sentence, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED))));
        }
        return (SubLObject)reformulator_module_subcollection_processor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 5313L)
    public static SubLObject deconstruct_rl_scfn_expression(final SubLObject expression, final SubLObject mt) {
        final SubLObject sentence = clause_utilities.gaf_cnf_literal(expression.first());
        final SubLObject hier_pred = cycl_utilities.formula_arg0(sentence);
        final SubLObject var = cycl_utilities.formula_arg1(sentence, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED);
        final SubLObject nat = cycl_utilities.formula_arg2(sentence, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED);
        final SubLObject naut_candidate = function_terms.nart_to_naut(nat);
        final SubLObject naut_fn = cycl_utilities.nat_functor(naut_candidate);
        if (reformulator_module_subcollection_processor.NIL == isa.isaP(naut_fn, reformulator_module_subcollection_processor.$const47$SubcollectionFunction, mt, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED) && reformulator_module_subcollection_processor.NIL == conses_high.member(naut_fn, (SubLObject)reformulator_module_subcollection_processor.$list48, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED)) {
            return (SubLObject)reformulator_module_subcollection_processor.NIL;
        }
        if (reformulator_module_subcollection_processor.NIL == el_utilities.formula_arityE(naut_candidate, (SubLObject)reformulator_module_subcollection_processor.THREE_INTEGER, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED)) {
            final SubLObject rl_scfn_data = make_rl_scfn_data((SubLObject)reformulator_module_subcollection_processor.UNPROVIDED);
            _csetf_rl_scfn_data_hierarchy_pred(rl_scfn_data, hier_pred);
            _csetf_rl_scfn_data_var_name(rl_scfn_data, var);
            _csetf_rl_scfn_data_naut(rl_scfn_data, naut_candidate);
            _csetf_rl_scfn_data_subcollection_fn(rl_scfn_data, cycl_utilities.nat_functor(naut_candidate));
            return rl_scfn_data;
        }
        SubLObject current;
        final SubLObject datum = current = naut_candidate;
        SubLObject scfn = (SubLObject)reformulator_module_subcollection_processor.NIL;
        SubLObject arg1 = (SubLObject)reformulator_module_subcollection_processor.NIL;
        SubLObject pred = (SubLObject)reformulator_module_subcollection_processor.NIL;
        SubLObject arg2 = (SubLObject)reformulator_module_subcollection_processor.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)reformulator_module_subcollection_processor.$list49);
        scfn = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)reformulator_module_subcollection_processor.$list49);
        arg1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)reformulator_module_subcollection_processor.$list49);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)reformulator_module_subcollection_processor.$list49);
        arg2 = current.first();
        current = current.rest();
        if (reformulator_module_subcollection_processor.NIL == current) {
            SubLObject arg_from = (SubLObject)reformulator_module_subcollection_processor.NIL;
            SubLObject arg_to = (SubLObject)reformulator_module_subcollection_processor.NIL;
            if (reformulator_module_subcollection_processor.NIL != conses_high.member(scfn, (SubLObject)reformulator_module_subcollection_processor.$list50, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED)) {
                arg_from = arg1;
                arg_to = arg2;
            }
            else if (reformulator_module_subcollection_processor.NIL != conses_high.member(scfn, (SubLObject)reformulator_module_subcollection_processor.$list51, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED)) {
                arg_from = arg2;
                arg_to = arg1;
            }
            return new_rl_scfn_data(hier_pred, var, naut_candidate, scfn, arg_from, pred, arg_to);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)reformulator_module_subcollection_processor.$list49);
        return (SubLObject)reformulator_module_subcollection_processor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 7791L)
    public static SubLObject scfn_expression_reformulate(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        final SubLObject thesentence = clause_utilities.gaf_cnf_literal(expression.first());
        final SubLObject rl_scfn_data = deconstruct_rl_scfn_expression(expression, mt);
        if (reformulator_module_subcollection_processor.NIL != rl_scfn_data) {
            final SubLObject result = reconstruct_rl_scfn_expression(rl_scfn_data);
            if (reformulator_module_subcollection_processor.NIL != result) {
                final SubLObject modifiedP = (SubLObject)SubLObjectFactory.makeBoolean(!expression.equal(result));
                if (!thesentence.equal(cycl_utilities.formula_arg1(result, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED))) {
                    return Values.values(result, modifiedP);
                }
            }
        }
        return Values.values(expression, (SubLObject)reformulator_module_subcollection_processor.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 8726L)
    public static SubLObject reformulate_rl_scfn_data(final SubLObject rl_scfn_data) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject naut = rl_scfn_data_naut(rl_scfn_data);
        final SubLObject new_naut = reformulator_hub.reformulate_cycl(naut, mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)reformulator_module_subcollection_processor.$list53);
        if (reformulator_module_subcollection_processor.NIL != el_utilities.possibly_naut_p(new_naut) && reformulator_module_subcollection_processor.NIL != el_utilities.formula_arityE(new_naut, (SubLObject)reformulator_module_subcollection_processor.THREE_INTEGER, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED)) {
            SubLObject current;
            final SubLObject datum = current = new_naut;
            SubLObject scfn = (SubLObject)reformulator_module_subcollection_processor.NIL;
            SubLObject arg_from = (SubLObject)reformulator_module_subcollection_processor.NIL;
            SubLObject pred = (SubLObject)reformulator_module_subcollection_processor.NIL;
            SubLObject arg_to = (SubLObject)reformulator_module_subcollection_processor.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)reformulator_module_subcollection_processor.$list54);
            scfn = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)reformulator_module_subcollection_processor.$list54);
            arg_from = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)reformulator_module_subcollection_processor.$list54);
            pred = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)reformulator_module_subcollection_processor.$list54);
            arg_to = current.first();
            current = current.rest();
            if (reformulator_module_subcollection_processor.NIL == current) {
                _csetf_rl_scfn_data_naut(rl_scfn_data, new_naut);
                _csetf_rl_scfn_data_subcollection_fn(rl_scfn_data, scfn);
                _csetf_rl_scfn_data_arg_from(rl_scfn_data, arg_from);
                _csetf_rl_scfn_data_pred(rl_scfn_data, pred);
                _csetf_rl_scfn_data_arg_to(rl_scfn_data, arg_to);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)reformulator_module_subcollection_processor.$list54);
            }
            return rl_scfn_data;
        }
        return (SubLObject)reformulator_module_subcollection_processor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 9953L)
    public static SubLObject reconstruct_rl_scfn_expression(final SubLObject rl_scfn_data) {
        if (reformulator_module_subcollection_processor.NIL != set_operation_scfn(rl_scfn_data)) {
            return set_reconstruct(rl_scfn_data);
        }
        if (reformulator_module_subcollection_processor.NIL != prospective_collection_scfn(rl_scfn_data)) {
            return prospective_collection_reconstruct(rl_scfn_data);
        }
        if (reformulator_module_subcollection_processor.NIL != rl_scfn_data_pred(rl_scfn_data)) {
            return reconstruct_rl_scfn_expression_int(rl_scfn_data);
        }
        final SubLObject new_data = reformulate_rl_scfn_data(rl_scfn_data);
        if (reformulator_module_subcollection_processor.NIL != new_data) {
            return reconstruct_rl_scfn_expression_int(rl_scfn_data);
        }
        return (SubLObject)reformulator_module_subcollection_processor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 10681L)
    public static SubLObject reconstruct_rl_scfn_expression_int(final SubLObject rl_scfn_data) {
        final SubLObject scfn = rl_scfn_data_subcollection_fn(rl_scfn_data);
        final SubLObject var_coll = find_var_coll_from_scfn(scfn, rl_scfn_data);
        final SubLObject other_coll = find_other_coll_from_scfn(scfn, rl_scfn_data);
        final SubLObject pred = rl_scfn_data_pred(rl_scfn_data);
        final SubLObject hier_pred = rl_scfn_data_hierarchy_pred(rl_scfn_data);
        final SubLObject var = rl_scfn_data_var_name(rl_scfn_data);
        final SubLObject macro = find_macro_pred_from_scfn(scfn, hier_pred);
        final SubLObject sentence1 = el_utilities.make_binary_formula(hier_pred, var, var_coll);
        final SubLObject sentence2 = replace_into_scfn_macro(macro, pred, var, other_coll);
        return el_utilities.make_conjunction((SubLObject)ConsesLow.list(sentence1, sentence2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 11480L)
    public static SubLObject set_operation_scfn(final SubLObject rl_scfn_data) {
        return conses_high.member(rl_scfn_data_subcollection_fn(rl_scfn_data), (SubLObject)reformulator_module_subcollection_processor.$list55, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 11836L)
    public static SubLObject set_reconstruct(final SubLObject rl_scfn_data) {
        final SubLObject naut = rl_scfn_data_naut(rl_scfn_data);
        final SubLObject scfn = rl_scfn_data_subcollection_fn(rl_scfn_data);
        final SubLObject var = rl_scfn_data_var_name(rl_scfn_data);
        final SubLObject col1 = cycl_utilities.formula_arg1(naut, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED);
        final SubLObject col2 = cycl_utilities.formula_arg2(naut, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED);
        final SubLObject hier_pred = rl_scfn_data_hierarchy_pred(rl_scfn_data);
        final SubLObject literal1 = el_utilities.make_binary_formula(hier_pred, var, col1);
        SubLObject literal2 = (SubLObject)reformulator_module_subcollection_processor.NIL;
        final SubLObject pcase_var = scfn;
        if (pcase_var.eql(reformulator_module_subcollection_processor.$const56$CollectionIntersection2Fn)) {
            literal2 = el_utilities.make_binary_formula(hier_pred, var, col2);
        }
        else if (pcase_var.eql(reformulator_module_subcollection_processor.$const57$CollectionDifferenceFn)) {
            final SubLObject pcase_var_$1 = hier_pred;
            if (pcase_var_$1.eql(reformulator_module_subcollection_processor.$const58$isa)) {
                literal2 = el_utilities.make_negation(el_utilities.make_binary_formula(reformulator_module_subcollection_processor.$const58$isa, var, col2));
            }
            else if (pcase_var_$1.eql(reformulator_module_subcollection_processor.$const59$genls)) {
                literal2 = el_utilities.make_binary_formula(reformulator_module_subcollection_processor.$const60$disjointWith, var, col2);
            }
        }
        return el_utilities.make_conjunction((SubLObject)ConsesLow.list(literal1, literal2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 12775L)
    public static SubLObject prospective_collection_scfn(final SubLObject rl_scfn_data) {
        return Equality.eql(rl_scfn_data_subcollection_fn(rl_scfn_data), reformulator_module_subcollection_processor.$const61$ProspectiveCollectionFn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 13102L)
    public static SubLObject prospective_collection_reconstruct(final SubLObject rl_scfn_data) {
        final SubLObject naut = rl_scfn_data_naut(rl_scfn_data);
        final SubLObject var = rl_scfn_data_var_name(rl_scfn_data);
        final SubLObject col1 = cycl_utilities.formula_arg1(naut, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED);
        final SubLObject col2 = cycl_utilities.formula_arg2(naut, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED);
        final SubLObject hier_pred = rl_scfn_data_hierarchy_pred(rl_scfn_data);
        final SubLObject literal1 = el_utilities.make_binary_formula(hier_pred, var, col1);
        SubLObject literal2 = (SubLObject)reformulator_module_subcollection_processor.NIL;
        final SubLObject pcase_var = hier_pred;
        if (pcase_var.eql(reformulator_module_subcollection_processor.$const58$isa)) {
            literal2 = el_utilities.make_binary_formula(reformulator_module_subcollection_processor.$const62$prospectiveMembers, var, col2);
        }
        else if (pcase_var.eql(reformulator_module_subcollection_processor.$const59$genls)) {
            literal2 = el_utilities.make_ternary_formula(reformulator_module_subcollection_processor.$const63$relationAllInstance, reformulator_module_subcollection_processor.$const62$prospectiveMembers, var, col2);
        }
        return el_utilities.make_conjunction((SubLObject)ConsesLow.list(literal1, literal2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 13888L)
    public static SubLObject find_var_coll_from_scfn(final SubLObject scfn, final SubLObject rl_scfn_data) {
        final SubLObject direction = (SubLObject)((reformulator_module_subcollection_processor.NIL != conses_high.member(scfn, (SubLObject)reformulator_module_subcollection_processor.$list50, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED)) ? reformulator_module_subcollection_processor.$kw64$TO : reformulator_module_subcollection_processor.$kw65$FROM);
        if (direction.eql((SubLObject)reformulator_module_subcollection_processor.$kw64$TO)) {
            return rl_scfn_data_arg_from(rl_scfn_data);
        }
        return rl_scfn_data_arg_to(rl_scfn_data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 14389L)
    public static SubLObject find_other_coll_from_scfn(final SubLObject scfn, final SubLObject rl_scfn_data) {
        final SubLObject direction = (SubLObject)((reformulator_module_subcollection_processor.NIL != conses_high.member(scfn, (SubLObject)reformulator_module_subcollection_processor.$list50, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED)) ? reformulator_module_subcollection_processor.$kw64$TO : reformulator_module_subcollection_processor.$kw65$FROM);
        if (direction.eql((SubLObject)reformulator_module_subcollection_processor.$kw64$TO)) {
            return rl_scfn_data_arg_to(rl_scfn_data);
        }
        return rl_scfn_data_arg_from(rl_scfn_data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 14888L)
    public static SubLObject find_macro_pred_from_scfn(final SubLObject scfn, final SubLObject hier_pred) {
        return conses_high.second(conses_high.assoc(scfn, conses_high.second(conses_high.assoc(hier_pred, reformulator_module_subcollection_processor.$subcollection_macros$.getGlobalValue(), (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED)), (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-processor.lisp", position = 15241L)
    public static SubLObject replace_into_scfn_macro(final SubLObject macro, final SubLObject pred, final SubLObject v_term, final SubLObject coll) {
        return Sequences.substitute(pred, (SubLObject)reformulator_module_subcollection_processor.$kw31$PRED, Sequences.substitute(v_term, (SubLObject)reformulator_module_subcollection_processor.$kw66$TERM, Sequences.substitute(coll, (SubLObject)reformulator_module_subcollection_processor.$kw67$ARG, macro, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED), (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED), (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED);
    }
    
    public static SubLObject declare_reformulator_module_subcollection_processor_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "scfn_cost_estimate", "SCFN-COST-ESTIMATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "rl_scfn_data_print_function_trampoline", "RL-SCFN-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "rl_scfn_data_p", "RL-SCFN-DATA-P", 1, 0, false);
        new $rl_scfn_data_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "rl_scfn_data_hierarchy_pred", "RL-SCFN-DATA-HIERARCHY-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "rl_scfn_data_var_name", "RL-SCFN-DATA-VAR-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "rl_scfn_data_naut", "RL-SCFN-DATA-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "rl_scfn_data_subcollection_fn", "RL-SCFN-DATA-SUBCOLLECTION-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "rl_scfn_data_arg_from", "RL-SCFN-DATA-ARG-FROM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "rl_scfn_data_pred", "RL-SCFN-DATA-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "rl_scfn_data_arg_to", "RL-SCFN-DATA-ARG-TO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "_csetf_rl_scfn_data_hierarchy_pred", "_CSETF-RL-SCFN-DATA-HIERARCHY-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "_csetf_rl_scfn_data_var_name", "_CSETF-RL-SCFN-DATA-VAR-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "_csetf_rl_scfn_data_naut", "_CSETF-RL-SCFN-DATA-NAUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "_csetf_rl_scfn_data_subcollection_fn", "_CSETF-RL-SCFN-DATA-SUBCOLLECTION-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "_csetf_rl_scfn_data_arg_from", "_CSETF-RL-SCFN-DATA-ARG-FROM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "_csetf_rl_scfn_data_pred", "_CSETF-RL-SCFN-DATA-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "_csetf_rl_scfn_data_arg_to", "_CSETF-RL-SCFN-DATA-ARG-TO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "make_rl_scfn_data", "MAKE-RL-SCFN-DATA", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "visit_defstruct_rl_scfn_data", "VISIT-DEFSTRUCT-RL-SCFN-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "visit_defstruct_object_rl_scfn_data_method", "VISIT-DEFSTRUCT-OBJECT-RL-SCFN-DATA-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "print_rl_scfn_data", "PRINT-RL-SCFN-DATA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "new_rl_scfn_data", "NEW-RL-SCFN-DATA", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "scfn_expression_required", "SCFN-EXPRESSION-REQUIRED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "deconstruct_rl_scfn_expression", "DECONSTRUCT-RL-SCFN-EXPRESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "scfn_expression_reformulate", "SCFN-EXPRESSION-REFORMULATE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "reformulate_rl_scfn_data", "REFORMULATE-RL-SCFN-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "reconstruct_rl_scfn_expression", "RECONSTRUCT-RL-SCFN-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "reconstruct_rl_scfn_expression_int", "RECONSTRUCT-RL-SCFN-EXPRESSION-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "set_operation_scfn", "SET-OPERATION-SCFN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "set_reconstruct", "SET-RECONSTRUCT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "prospective_collection_scfn", "PROSPECTIVE-COLLECTION-SCFN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "prospective_collection_reconstruct", "PROSPECTIVE-COLLECTION-RECONSTRUCT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "find_var_coll_from_scfn", "FIND-VAR-COLL-FROM-SCFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "find_other_coll_from_scfn", "FIND-OTHER-COLL-FROM-SCFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "find_macro_pred_from_scfn", "FIND-MACRO-PRED-FROM-SCFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_processor", "replace_into_scfn_macro", "REPLACE-INTO-SCFN-MACRO", 4, 0, false);
        return (SubLObject)reformulator_module_subcollection_processor.NIL;
    }
    
    public static SubLObject init_reformulator_module_subcollection_processor_file() {
        reformulator_module_subcollection_processor.$scfn_microseconds$ = SubLFiles.deflexical("*SCFN-MICROSECONDS*", (SubLObject)reformulator_module_subcollection_processor.$int2$2300);
        reformulator_module_subcollection_processor.$dtp_rl_scfn_data$ = SubLFiles.defconstant("*DTP-RL-SCFN-DATA*", (SubLObject)reformulator_module_subcollection_processor.$sym3$RL_SCFN_DATA);
        reformulator_module_subcollection_processor.$subcollection_macros$ = SubLFiles.deflexical("*SUBCOLLECTION-MACROS*", (SubLObject)reformulator_module_subcollection_processor.$list52);
        return (SubLObject)reformulator_module_subcollection_processor.NIL;
    }
    
    public static SubLObject setup_reformulator_module_subcollection_processor_file() {
        reformulator_module_harness.declare_rl_module(reformulator_module_subcollection_processor.$const0$SubcollectionProcessorRLModule, (SubLObject)reformulator_module_subcollection_processor.$list1);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), reformulator_module_subcollection_processor.$dtp_rl_scfn_data$.getGlobalValue(), Symbols.symbol_function((SubLObject)reformulator_module_subcollection_processor.$sym10$RL_SCFN_DATA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)reformulator_module_subcollection_processor.$list11);
        Structures.def_csetf((SubLObject)reformulator_module_subcollection_processor.$sym12$RL_SCFN_DATA_HIERARCHY_PRED, (SubLObject)reformulator_module_subcollection_processor.$sym13$_CSETF_RL_SCFN_DATA_HIERARCHY_PRED);
        Structures.def_csetf((SubLObject)reformulator_module_subcollection_processor.$sym14$RL_SCFN_DATA_VAR_NAME, (SubLObject)reformulator_module_subcollection_processor.$sym15$_CSETF_RL_SCFN_DATA_VAR_NAME);
        Structures.def_csetf((SubLObject)reformulator_module_subcollection_processor.$sym16$RL_SCFN_DATA_NAUT, (SubLObject)reformulator_module_subcollection_processor.$sym17$_CSETF_RL_SCFN_DATA_NAUT);
        Structures.def_csetf((SubLObject)reformulator_module_subcollection_processor.$sym18$RL_SCFN_DATA_SUBCOLLECTION_FN, (SubLObject)reformulator_module_subcollection_processor.$sym19$_CSETF_RL_SCFN_DATA_SUBCOLLECTION_FN);
        Structures.def_csetf((SubLObject)reformulator_module_subcollection_processor.$sym20$RL_SCFN_DATA_ARG_FROM, (SubLObject)reformulator_module_subcollection_processor.$sym21$_CSETF_RL_SCFN_DATA_ARG_FROM);
        Structures.def_csetf((SubLObject)reformulator_module_subcollection_processor.$sym22$RL_SCFN_DATA_PRED, (SubLObject)reformulator_module_subcollection_processor.$sym23$_CSETF_RL_SCFN_DATA_PRED);
        Structures.def_csetf((SubLObject)reformulator_module_subcollection_processor.$sym24$RL_SCFN_DATA_ARG_TO, (SubLObject)reformulator_module_subcollection_processor.$sym25$_CSETF_RL_SCFN_DATA_ARG_TO);
        Equality.identity((SubLObject)reformulator_module_subcollection_processor.$sym3$RL_SCFN_DATA);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), reformulator_module_subcollection_processor.$dtp_rl_scfn_data$.getGlobalValue(), Symbols.symbol_function((SubLObject)reformulator_module_subcollection_processor.$sym38$VISIT_DEFSTRUCT_OBJECT_RL_SCFN_DATA_METHOD));
        sunit_external.define_test_category((SubLObject)reformulator_module_subcollection_processor.$str68$Reformulator_Subcollection_Proces, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED);
        sunit_external.define_test_suite((SubLObject)reformulator_module_subcollection_processor.$str69$subcoll_proc_test_suite, (SubLObject)ConsesLow.list((SubLObject)reformulator_module_subcollection_processor.$str68$Reformulator_Subcollection_Proces), (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED, (SubLObject)reformulator_module_subcollection_processor.UNPROVIDED);
        return (SubLObject)reformulator_module_subcollection_processor.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_reformulator_module_subcollection_processor_file();
    }
    
    @Override
	public void initializeVariables() {
        init_reformulator_module_subcollection_processor_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_reformulator_module_subcollection_processor_file();
    }
    
    static {
        me = (SubLFile)new reformulator_module_subcollection_processor();
        reformulator_module_subcollection_processor.$scfn_microseconds$ = null;
        reformulator_module_subcollection_processor.$dtp_rl_scfn_data$ = null;
        reformulator_module_subcollection_processor.$subcollection_macros$ = null;
        $const0$SubcollectionProcessorRLModule = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionProcessorRLModule"));
        $list1 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("SCFN-EXPRESSION-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("SCFN-COST-ESTIMATE"), SubLObjectFactory.makeKeyword("REFORMULATE"), SubLObjectFactory.makeSymbol("SCFN-EXPRESSION-REFORMULATE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Distributes info from a #$SubcollectionFunction NAUT into a conjunctive clause"), SubLObjectFactory.makeKeyword("EXAMPLE-SOURCE"), SubLObjectFactory.makeString("(#$isa ?VAR0 (#$SubcollectionOfWithRelationToFn #$Sheep #$hates #$Bertolo))"), SubLObjectFactory.makeKeyword("EXAMPLE-TARGET"), SubLObjectFactory.makeString("(#$and (#$isa ?VAR0 #$Sheep) (#$hates ?VAR0 #$Bertolo))") });
        $int2$2300 = SubLObjectFactory.makeInteger(2300);
        $sym3$RL_SCFN_DATA = SubLObjectFactory.makeSymbol("RL-SCFN-DATA");
        $sym4$RL_SCFN_DATA_P = SubLObjectFactory.makeSymbol("RL-SCFN-DATA-P");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HIERARCHY-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("VAR-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("NAUT"), (SubLObject)SubLObjectFactory.makeSymbol("SUBCOLLECTION-FN"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-FROM"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-TO"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HIERARCHY-PRED"), (SubLObject)SubLObjectFactory.makeKeyword("VAR-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("NAUT"), (SubLObject)SubLObjectFactory.makeKeyword("SUBCOLLECTION-FN"), (SubLObject)SubLObjectFactory.makeKeyword("ARG-FROM"), (SubLObject)SubLObjectFactory.makeKeyword("PRED"), (SubLObject)SubLObjectFactory.makeKeyword("ARG-TO"));
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RL-SCFN-DATA-HIERARCHY-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("RL-SCFN-DATA-VAR-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("RL-SCFN-DATA-NAUT"), (SubLObject)SubLObjectFactory.makeSymbol("RL-SCFN-DATA-SUBCOLLECTION-FN"), (SubLObject)SubLObjectFactory.makeSymbol("RL-SCFN-DATA-ARG-FROM"), (SubLObject)SubLObjectFactory.makeSymbol("RL-SCFN-DATA-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("RL-SCFN-DATA-ARG-TO"));
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RL-SCFN-DATA-HIERARCHY-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RL-SCFN-DATA-VAR-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RL-SCFN-DATA-NAUT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RL-SCFN-DATA-SUBCOLLECTION-FN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RL-SCFN-DATA-ARG-FROM"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RL-SCFN-DATA-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RL-SCFN-DATA-ARG-TO"));
        $sym9$PRINT_RL_SCFN_DATA = SubLObjectFactory.makeSymbol("PRINT-RL-SCFN-DATA");
        $sym10$RL_SCFN_DATA_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("RL-SCFN-DATA-PRINT-FUNCTION-TRAMPOLINE");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("RL-SCFN-DATA-P"));
        $sym12$RL_SCFN_DATA_HIERARCHY_PRED = SubLObjectFactory.makeSymbol("RL-SCFN-DATA-HIERARCHY-PRED");
        $sym13$_CSETF_RL_SCFN_DATA_HIERARCHY_PRED = SubLObjectFactory.makeSymbol("_CSETF-RL-SCFN-DATA-HIERARCHY-PRED");
        $sym14$RL_SCFN_DATA_VAR_NAME = SubLObjectFactory.makeSymbol("RL-SCFN-DATA-VAR-NAME");
        $sym15$_CSETF_RL_SCFN_DATA_VAR_NAME = SubLObjectFactory.makeSymbol("_CSETF-RL-SCFN-DATA-VAR-NAME");
        $sym16$RL_SCFN_DATA_NAUT = SubLObjectFactory.makeSymbol("RL-SCFN-DATA-NAUT");
        $sym17$_CSETF_RL_SCFN_DATA_NAUT = SubLObjectFactory.makeSymbol("_CSETF-RL-SCFN-DATA-NAUT");
        $sym18$RL_SCFN_DATA_SUBCOLLECTION_FN = SubLObjectFactory.makeSymbol("RL-SCFN-DATA-SUBCOLLECTION-FN");
        $sym19$_CSETF_RL_SCFN_DATA_SUBCOLLECTION_FN = SubLObjectFactory.makeSymbol("_CSETF-RL-SCFN-DATA-SUBCOLLECTION-FN");
        $sym20$RL_SCFN_DATA_ARG_FROM = SubLObjectFactory.makeSymbol("RL-SCFN-DATA-ARG-FROM");
        $sym21$_CSETF_RL_SCFN_DATA_ARG_FROM = SubLObjectFactory.makeSymbol("_CSETF-RL-SCFN-DATA-ARG-FROM");
        $sym22$RL_SCFN_DATA_PRED = SubLObjectFactory.makeSymbol("RL-SCFN-DATA-PRED");
        $sym23$_CSETF_RL_SCFN_DATA_PRED = SubLObjectFactory.makeSymbol("_CSETF-RL-SCFN-DATA-PRED");
        $sym24$RL_SCFN_DATA_ARG_TO = SubLObjectFactory.makeSymbol("RL-SCFN-DATA-ARG-TO");
        $sym25$_CSETF_RL_SCFN_DATA_ARG_TO = SubLObjectFactory.makeSymbol("_CSETF-RL-SCFN-DATA-ARG-TO");
        $kw26$HIERARCHY_PRED = SubLObjectFactory.makeKeyword("HIERARCHY-PRED");
        $kw27$VAR_NAME = SubLObjectFactory.makeKeyword("VAR-NAME");
        $kw28$NAUT = SubLObjectFactory.makeKeyword("NAUT");
        $kw29$SUBCOLLECTION_FN = SubLObjectFactory.makeKeyword("SUBCOLLECTION-FN");
        $kw30$ARG_FROM = SubLObjectFactory.makeKeyword("ARG-FROM");
        $kw31$PRED = SubLObjectFactory.makeKeyword("PRED");
        $kw32$ARG_TO = SubLObjectFactory.makeKeyword("ARG-TO");
        $str33$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw34$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym35$MAKE_RL_SCFN_DATA = SubLObjectFactory.makeSymbol("MAKE-RL-SCFN-DATA");
        $kw36$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw37$END = SubLObjectFactory.makeKeyword("END");
        $sym38$VISIT_DEFSTRUCT_OBJECT_RL_SCFN_DATA_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-RL-SCFN-DATA-METHOD");
        $str39$__RL_Scfn_Data__H_Pred____S__ = SubLObjectFactory.makeString("#<RL-Scfn-Data: H-Pred:  ~S~%");
        $str40$___________________Var____S__ = SubLObjectFactory.makeString("                   Var:  ~S~%");
        $str41$__________________NAUT____S__ = SubLObjectFactory.makeString("                  NAUT:  ~S~%");
        $str42$_______________SubC_fn____S__ = SubLObjectFactory.makeString("               SubC-fn:  ~S~%");
        $str43$______________Arg_from____S__ = SubLObjectFactory.makeString("              Arg-from:  ~S~%");
        $str44$__________________Pred____S__ = SubLObjectFactory.makeString("                  Pred:  ~S~%");
        $str45$________________Arg_To____S___ = SubLObjectFactory.makeString("                Arg-To:  ~S>~%");
        $list46 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")));
        $const47$SubcollectionFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionFunction"));
        $list48 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionPerformedByTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionPerformedByFn")));
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SCFN"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"));
        $list50 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")));
        $list51 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationFromFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationFromTypeFn")));
        $list52 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRED"), (SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)SubLObjectFactory.makeKeyword("ARG"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationFromFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRED"), (SubLObject)SubLObjectFactory.makeKeyword("ARG"), (SubLObject)SubLObjectFactory.makeKeyword("TERM"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExists")), (SubLObject)SubLObjectFactory.makeKeyword("PRED"), (SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)SubLObjectFactory.makeKeyword("ARG"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationFromTypeFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsInstance")), (SubLObject)SubLObjectFactory.makeKeyword("PRED"), (SubLObject)SubLObjectFactory.makeKeyword("ARG"), (SubLObject)SubLObjectFactory.makeKeyword("TERM"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllInstance")), (SubLObject)SubLObjectFactory.makeKeyword("PRED"), (SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)SubLObjectFactory.makeKeyword("ARG"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationFromFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceAll")), (SubLObject)SubLObjectFactory.makeKeyword("PRED"), (SubLObject)SubLObjectFactory.makeKeyword("ARG"), (SubLObject)SubLObjectFactory.makeKeyword("TERM"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExists")), (SubLObject)SubLObjectFactory.makeKeyword("PRED"), (SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)SubLObjectFactory.makeKeyword("ARG"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationFromTypeFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsAll")), (SubLObject)SubLObjectFactory.makeKeyword("PRED"), (SubLObject)SubLObjectFactory.makeKeyword("ARG"), (SubLObject)SubLObjectFactory.makeKeyword("TERM"))))));
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MODES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReformulatorMode-Verbosify"))), (SubLObject)SubLObjectFactory.makeKeyword("RECURSION-LIMIT"), (SubLObject)reformulator_module_subcollection_processor.ZERO_INTEGER);
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SCFN"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-FROM"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-TO"));
        $list55 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersection2Fn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionDifferenceFn")));
        $const56$CollectionIntersection2Fn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersection2Fn"));
        $const57$CollectionDifferenceFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionDifferenceFn"));
        $const58$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const59$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $const60$disjointWith = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith"));
        $const61$ProspectiveCollectionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProspectiveCollectionFn"));
        $const62$prospectiveMembers = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("prospectiveMembers"));
        $const63$relationAllInstance = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllInstance"));
        $kw64$TO = SubLObjectFactory.makeKeyword("TO");
        $kw65$FROM = SubLObjectFactory.makeKeyword("FROM");
        $kw66$TERM = SubLObjectFactory.makeKeyword("TERM");
        $kw67$ARG = SubLObjectFactory.makeKeyword("ARG");
        $str68$Reformulator_Subcollection_Proces = SubLObjectFactory.makeString("Reformulator Subcollection Processing");
        $str69$subcoll_proc_test_suite = SubLObjectFactory.makeString("subcoll-proc-test-suite");
    }
    
    public static final class $rl_scfn_data_native extends SubLStructNative
    {
        public SubLObject $hierarchy_pred;
        public SubLObject $var_name;
        public SubLObject $naut;
        public SubLObject $subcollection_fn;
        public SubLObject $arg_from;
        public SubLObject $pred;
        public SubLObject $arg_to;
        private static final SubLStructDeclNative structDecl;
        
        public $rl_scfn_data_native() {
            this.$hierarchy_pred = (SubLObject)CommonSymbols.NIL;
            this.$var_name = (SubLObject)CommonSymbols.NIL;
            this.$naut = (SubLObject)CommonSymbols.NIL;
            this.$subcollection_fn = (SubLObject)CommonSymbols.NIL;
            this.$arg_from = (SubLObject)CommonSymbols.NIL;
            this.$pred = (SubLObject)CommonSymbols.NIL;
            this.$arg_to = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$rl_scfn_data_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$hierarchy_pred;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$var_name;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$naut;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$subcollection_fn;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$arg_from;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$pred;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$arg_to;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$hierarchy_pred = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$var_name = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$naut = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$subcollection_fn = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$arg_from = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$pred = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$arg_to = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$rl_scfn_data_native.class, reformulator_module_subcollection_processor.$sym3$RL_SCFN_DATA, reformulator_module_subcollection_processor.$sym4$RL_SCFN_DATA_P, reformulator_module_subcollection_processor.$list5, reformulator_module_subcollection_processor.$list6, new String[] { "$hierarchy_pred", "$var_name", "$naut", "$subcollection_fn", "$arg_from", "$pred", "$arg_to" }, reformulator_module_subcollection_processor.$list7, reformulator_module_subcollection_processor.$list8, reformulator_module_subcollection_processor.$sym9$PRINT_RL_SCFN_DATA);
        }
    }
    
    public static final class $rl_scfn_data_p$UnaryFunction extends UnaryFunction
    {
        public $rl_scfn_data_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RL-SCFN-DATA-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return reformulator_module_subcollection_processor.rl_scfn_data_p(arg1);
        }
    }
}

/*

	Total time: 135 ms
	
*/