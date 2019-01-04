package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class tva_inference extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.tva_inference";
    public static final String myFingerPrint = "e4deae80b7b9b84d7da951a411ea5db9875a98350d197bb9c4fa57a03337aeab";
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1100L)
    private static SubLSymbol $tva_max_time_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1282L)
    public static SubLSymbol $dtp_tva_inference$;
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 4412L)
    public static SubLSymbol $tva_inference$;
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 7563L)
    private static SubLSymbol $tva_reuse_spacesP$;
    private static final SubLSymbol $sym0$TVA_INFERENCE;
    private static final SubLSymbol $sym1$TVA_INFERENCE_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_TVA_INFERENCE;
    private static final SubLSymbol $sym7$TVA_INFERENCE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$TVA_INF_PROBLEM;
    private static final SubLSymbol $sym10$_CSETF_TVA_INF_PROBLEM;
    private static final SubLSymbol $sym11$TVA_INF_ASENT_PRED;
    private static final SubLSymbol $sym12$_CSETF_TVA_INF_ASENT_PRED;
    private static final SubLSymbol $sym13$TVA_INF_ASENT_ARGS;
    private static final SubLSymbol $sym14$_CSETF_TVA_INF_ASENT_ARGS;
    private static final SubLSymbol $sym15$TVA_INF_ARGS_ADMITTED;
    private static final SubLSymbol $sym16$_CSETF_TVA_INF_ARGS_ADMITTED;
    private static final SubLSymbol $sym17$TVA_INF_TERM_ARGNUMS;
    private static final SubLSymbol $sym18$_CSETF_TVA_INF_TERM_ARGNUMS;
    private static final SubLSymbol $sym19$TVA_INF_VAR_ARGNUMS;
    private static final SubLSymbol $sym20$_CSETF_TVA_INF_VAR_ARGNUMS;
    private static final SubLSymbol $sym21$TVA_INF_PRECOMPUTATIONS;
    private static final SubLSymbol $sym22$_CSETF_TVA_INF_PRECOMPUTATIONS;
    private static final SubLSymbol $sym23$TVA_INF_REUSED_SPACES;
    private static final SubLSymbol $sym24$_CSETF_TVA_INF_REUSED_SPACES;
    private static final SubLSymbol $sym25$TVA_INF_ONE_ANSWER_;
    private static final SubLSymbol $sym26$_CSETF_TVA_INF_ONE_ANSWER_;
    private static final SubLSymbol $sym27$TVA_INF_JUSTIFY_;
    private static final SubLSymbol $sym28$_CSETF_TVA_INF_JUSTIFY_;
    private static final SubLSymbol $sym29$TVA_INF_RESTRICTED_ASSERTION;
    private static final SubLSymbol $sym30$_CSETF_TVA_INF_RESTRICTED_ASSERTION;
    private static final SubLSymbol $sym31$TVA_INF_ANSWERS;
    private static final SubLSymbol $sym32$_CSETF_TVA_INF_ANSWERS;
    private static final SubLSymbol $kw33$PROBLEM;
    private static final SubLSymbol $kw34$ASENT_PRED;
    private static final SubLSymbol $kw35$ASENT_ARGS;
    private static final SubLSymbol $kw36$ARGS_ADMITTED;
    private static final SubLSymbol $kw37$TERM_ARGNUMS;
    private static final SubLSymbol $kw38$VAR_ARGNUMS;
    private static final SubLSymbol $kw39$PRECOMPUTATIONS;
    private static final SubLSymbol $kw40$REUSED_SPACES;
    private static final SubLSymbol $kw41$ONE_ANSWER_;
    private static final SubLSymbol $kw42$JUSTIFY_;
    private static final SubLSymbol $kw43$RESTRICTED_ASSERTION;
    private static final SubLSymbol $kw44$ANSWERS;
    private static final SubLString $str45$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw46$BEGIN;
    private static final SubLSymbol $sym47$MAKE_TVA_INFERENCE;
    private static final SubLSymbol $kw48$SLOT;
    private static final SubLSymbol $kw49$END;
    private static final SubLSymbol $sym50$VISIT_DEFSTRUCT_OBJECT_TVA_INFERENCE_METHOD;
    private static final SubLSymbol $sym51$CLET;
    private static final SubLList $list52;
    private static final SubLSymbol $kw53$FAIL;
    private static final SubLSymbol $kw54$NONE;
    private static final SubLSymbol $kw55$TVA_MAX_TIME;
    private static final SubLObject $const56$genlPreds;
    private static final SubLSymbol $sym57$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw58$ERROR;
    private static final SubLString $str59$_A_is_not_a__A;
    private static final SubLSymbol $sym60$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw61$CERROR;
    private static final SubLString $str62$continue_anyway;
    private static final SubLSymbol $kw63$WARN;
    private static final SubLString $str64$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLObject $const65$True_JustificationTruth;
    private static final SubLSymbol $kw66$OLD;
    private static final SubLSymbol $kw67$RESOURCE;
    private static final SubLString $str68$SKSI_SQL_statement_cache_;
    private static final SubLSymbol $kw69$DEPTH;
    private static final SubLSymbol $kw70$STACK;
    private static final SubLSymbol $kw71$QUEUE;
    private static final SubLString $str72$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str73$attempting_to_bind_direction_link;
    private static final SubLString $str74$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLSymbol $kw75$IGNORE;
    private static final SubLList $list76;
    private static final SubLList $list77;
    private static final SubLSymbol $kw78$FOCUSED;
    private static final SubLSymbol $sym79$TVA_UNIFY_CLOSURE_ITERATOR_DONE;
    private static final SubLSymbol $sym80$TVA_UNIFY_CLOSURE_ITERATOR_NEXT;
    private static final SubLSymbol $sym81$TVA_UNIFY_CLOSURE_ITERATOR_FINALIZE;
    private static final SubLList $list82;
    private static final SubLList $list83;
    private static final SubLList $list84;
    private static final SubLList $list85;
    private static final SubLSymbol $sym86$TVA_UNIFY_CLOSURE_VAR_BINDINGS_ITERATOR_DONE;
    private static final SubLSymbol $sym87$TVA_UNIFY_CLOSURE_VAR_BINDINGS_ITERATOR_NEXT;
    private static final SubLSymbol $sym88$TVA_UNIFY_CLOSURE_VAR_BINDINGS_ITERATOR_FINALIZE;
    private static final SubLList $list89;
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1282L)
    public static SubLObject tva_inference_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_tva_inference(v_object, stream, (SubLObject)tva_inference.ZERO_INTEGER);
        return (SubLObject)tva_inference.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1282L)
    public static SubLObject tva_inference_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $tva_inference_native.class) ? tva_inference.T : tva_inference.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1282L)
    public static SubLObject tva_inf_problem(final SubLObject v_object) {
        assert tva_inference.NIL != tva_inference_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1282L)
    public static SubLObject tva_inf_asent_pred(final SubLObject v_object) {
        assert tva_inference.NIL != tva_inference_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1282L)
    public static SubLObject tva_inf_asent_args(final SubLObject v_object) {
        assert tva_inference.NIL != tva_inference_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1282L)
    public static SubLObject tva_inf_args_admitted(final SubLObject v_object) {
        assert tva_inference.NIL != tva_inference_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1282L)
    public static SubLObject tva_inf_term_argnums(final SubLObject v_object) {
        assert tva_inference.NIL != tva_inference_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1282L)
    public static SubLObject tva_inf_var_argnums(final SubLObject v_object) {
        assert tva_inference.NIL != tva_inference_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1282L)
    public static SubLObject tva_inf_precomputations(final SubLObject v_object) {
        assert tva_inference.NIL != tva_inference_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1282L)
    public static SubLObject tva_inf_reused_spaces(final SubLObject v_object) {
        assert tva_inference.NIL != tva_inference_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1282L)
    public static SubLObject tva_inf_one_answerP(final SubLObject v_object) {
        assert tva_inference.NIL != tva_inference_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1282L)
    public static SubLObject tva_inf_justifyP(final SubLObject v_object) {
        assert tva_inference.NIL != tva_inference_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1282L)
    public static SubLObject tva_inf_restricted_assertion(final SubLObject v_object) {
        assert tva_inference.NIL != tva_inference_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1282L)
    public static SubLObject tva_inf_answers(final SubLObject v_object) {
        assert tva_inference.NIL != tva_inference_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1282L)
    public static SubLObject _csetf_tva_inf_problem(final SubLObject v_object, final SubLObject value) {
        assert tva_inference.NIL != tva_inference_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1282L)
    public static SubLObject _csetf_tva_inf_asent_pred(final SubLObject v_object, final SubLObject value) {
        assert tva_inference.NIL != tva_inference_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1282L)
    public static SubLObject _csetf_tva_inf_asent_args(final SubLObject v_object, final SubLObject value) {
        assert tva_inference.NIL != tva_inference_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1282L)
    public static SubLObject _csetf_tva_inf_args_admitted(final SubLObject v_object, final SubLObject value) {
        assert tva_inference.NIL != tva_inference_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1282L)
    public static SubLObject _csetf_tva_inf_term_argnums(final SubLObject v_object, final SubLObject value) {
        assert tva_inference.NIL != tva_inference_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1282L)
    public static SubLObject _csetf_tva_inf_var_argnums(final SubLObject v_object, final SubLObject value) {
        assert tva_inference.NIL != tva_inference_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1282L)
    public static SubLObject _csetf_tva_inf_precomputations(final SubLObject v_object, final SubLObject value) {
        assert tva_inference.NIL != tva_inference_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1282L)
    public static SubLObject _csetf_tva_inf_reused_spaces(final SubLObject v_object, final SubLObject value) {
        assert tva_inference.NIL != tva_inference_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1282L)
    public static SubLObject _csetf_tva_inf_one_answerP(final SubLObject v_object, final SubLObject value) {
        assert tva_inference.NIL != tva_inference_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1282L)
    public static SubLObject _csetf_tva_inf_justifyP(final SubLObject v_object, final SubLObject value) {
        assert tva_inference.NIL != tva_inference_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1282L)
    public static SubLObject _csetf_tva_inf_restricted_assertion(final SubLObject v_object, final SubLObject value) {
        assert tva_inference.NIL != tva_inference_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1282L)
    public static SubLObject _csetf_tva_inf_answers(final SubLObject v_object, final SubLObject value) {
        assert tva_inference.NIL != tva_inference_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1282L)
    public static SubLObject make_tva_inference(SubLObject arglist) {
        if (arglist == tva_inference.UNPROVIDED) {
            arglist = (SubLObject)tva_inference.NIL;
        }
        final SubLObject v_new = (SubLObject)new $tva_inference_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)tva_inference.NIL, next = arglist; tva_inference.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)tva_inference.$kw33$PROBLEM)) {
                _csetf_tva_inf_problem(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tva_inference.$kw34$ASENT_PRED)) {
                _csetf_tva_inf_asent_pred(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tva_inference.$kw35$ASENT_ARGS)) {
                _csetf_tva_inf_asent_args(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tva_inference.$kw36$ARGS_ADMITTED)) {
                _csetf_tva_inf_args_admitted(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tva_inference.$kw37$TERM_ARGNUMS)) {
                _csetf_tva_inf_term_argnums(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tva_inference.$kw38$VAR_ARGNUMS)) {
                _csetf_tva_inf_var_argnums(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tva_inference.$kw39$PRECOMPUTATIONS)) {
                _csetf_tva_inf_precomputations(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tva_inference.$kw40$REUSED_SPACES)) {
                _csetf_tva_inf_reused_spaces(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tva_inference.$kw41$ONE_ANSWER_)) {
                _csetf_tva_inf_one_answerP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tva_inference.$kw42$JUSTIFY_)) {
                _csetf_tva_inf_justifyP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tva_inference.$kw43$RESTRICTED_ASSERTION)) {
                _csetf_tva_inf_restricted_assertion(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tva_inference.$kw44$ANSWERS)) {
                _csetf_tva_inf_answers(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)tva_inference.$str45$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1282L)
    public static SubLObject visit_defstruct_tva_inference(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_inference.$kw46$BEGIN, (SubLObject)tva_inference.$sym47$MAKE_TVA_INFERENCE, (SubLObject)tva_inference.TWELVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_inference.$kw48$SLOT, (SubLObject)tva_inference.$kw33$PROBLEM, tva_inf_problem(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_inference.$kw48$SLOT, (SubLObject)tva_inference.$kw34$ASENT_PRED, tva_inf_asent_pred(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_inference.$kw48$SLOT, (SubLObject)tva_inference.$kw35$ASENT_ARGS, tva_inf_asent_args(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_inference.$kw48$SLOT, (SubLObject)tva_inference.$kw36$ARGS_ADMITTED, tva_inf_args_admitted(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_inference.$kw48$SLOT, (SubLObject)tva_inference.$kw37$TERM_ARGNUMS, tva_inf_term_argnums(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_inference.$kw48$SLOT, (SubLObject)tva_inference.$kw38$VAR_ARGNUMS, tva_inf_var_argnums(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_inference.$kw48$SLOT, (SubLObject)tva_inference.$kw39$PRECOMPUTATIONS, tva_inf_precomputations(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_inference.$kw48$SLOT, (SubLObject)tva_inference.$kw40$REUSED_SPACES, tva_inf_reused_spaces(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_inference.$kw48$SLOT, (SubLObject)tva_inference.$kw41$ONE_ANSWER_, tva_inf_one_answerP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_inference.$kw48$SLOT, (SubLObject)tva_inference.$kw42$JUSTIFY_, tva_inf_justifyP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_inference.$kw48$SLOT, (SubLObject)tva_inference.$kw43$RESTRICTED_ASSERTION, tva_inf_restricted_assertion(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_inference.$kw48$SLOT, (SubLObject)tva_inference.$kw44$ANSWERS, tva_inf_answers(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_inference.$kw49$END, (SubLObject)tva_inference.$sym47$MAKE_TVA_INFERENCE, (SubLObject)tva_inference.TWELVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1282L)
    public static SubLObject visit_defstruct_object_tva_inference_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_tva_inference(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1773L)
    public static SubLObject print_tva_inference(final SubLObject v_tva_inference, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (tva_inference.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_tva_inference, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_tva_inference, (SubLObject)tva_inference.T, (SubLObject)tva_inference.NIL);
            print_macros.print_unreadable_object_postamble(stream, v_tva_inference, (SubLObject)tva_inference.T, (SubLObject)tva_inference.T);
        }
        return (SubLObject)tva_inference.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 1940L)
    public static SubLObject initialize_tva_inference(final SubLObject asent, final SubLObject one_answerP, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inf = tva_inference.$tva_inference$.getDynamicValue(thread);
        _csetf_tva_inf_asent_pred(inf, cycl_utilities.atomic_sentence_predicate(asent));
        _csetf_tva_inf_asent_args(inf, initialize_tva_asent_vector(asent));
        _csetf_tva_inf_args_admitted(inf, initialize_tva_args_admitted_vector(asent));
        _csetf_tva_inf_term_argnums(inf, determine_term_argnums(asent));
        _csetf_tva_inf_var_argnums(inf, determine_var_argnums(asent));
        _csetf_tva_inf_precomputations(inf, dictionary.new_dictionary((SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED));
        _csetf_tva_inf_reused_spaces(inf, dictionary.new_dictionary(Symbols.symbol_function((SubLObject)tva_inference.EQUAL), (SubLObject)tva_inference.UNPROVIDED));
        _csetf_tva_inf_one_answerP(inf, one_answerP);
        _csetf_tva_inf_restricted_assertion(inf, determine_restricted_assertion(asent));
        _csetf_tva_inf_justifyP(inf, justifyP);
        return inf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 2745L)
    public static SubLObject tva_inference_asent_pred(final SubLObject inf) {
        return tva_inf_asent_pred(inf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 2851L)
    public static SubLObject tva_inference_asent_args(final SubLObject inf) {
        return tva_inf_asent_args(inf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 2933L)
    public static SubLObject tva_inference_args_admitted(final SubLObject inf) {
        return tva_inf_args_admitted(inf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 3021L)
    public static SubLObject tva_inference_term_argnums(final SubLObject inf) {
        return tva_inf_term_argnums(inf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 3107L)
    public static SubLObject tva_inference_var_argnums(final SubLObject inf) {
        return tva_inf_var_argnums(inf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 3191L)
    public static SubLObject tva_inference_precomputations(final SubLObject inf) {
        return tva_inf_precomputations(inf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 3283L)
    public static SubLObject tva_inference_reused_spaces(final SubLObject inf) {
        return tva_inf_reused_spaces(inf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 3371L)
    public static SubLObject tva_inference_justifyP(final SubLObject inf) {
        return tva_inf_justifyP(inf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 3449L)
    public static SubLObject tva_inference_one_answerP(final SubLObject inf) {
        return tva_inf_one_answerP(inf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 3533L)
    public static SubLObject tva_inference_restricted_assertion(final SubLObject inf) {
        return tva_inf_restricted_assertion(inf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 3635L)
    public static SubLObject tva_inference_answers(final SubLObject inf) {
        return tva_inf_answers(inf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 3711L)
    public static SubLObject tva_inference_asent_arg(final SubLObject inf, final SubLObject argnum) {
        return Vectors.aref(tva_inference_asent_args(inf), argnum);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 3832L)
    public static SubLObject tva_inference_arg_admitted(final SubLObject inf, final SubLObject argnum) {
        return Vectors.aref(tva_inference_args_admitted(inf), argnum);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 3946L)
    public static SubLObject store_tva_inference_precomputation(final SubLObject inf, final SubLObject tactic, final SubLObject precomputation) {
        dictionary.dictionary_enter(tva_inf_precomputations(inf), tactic, precomputation);
        return (SubLObject)tva_inference.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 4126L)
    public static SubLObject store_tva_inference_reused_spaces(final SubLObject inf, final SubLObject key, final SubLObject spaces) {
        dictionary.dictionary_enter(tva_inf_reused_spaces(inf), key, spaces);
        return (SubLObject)tva_inference.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 4267L)
    public static SubLObject set_tva_inference_arg_admitted(final SubLObject inf, final SubLObject argnum, final SubLObject val) {
        Vectors.set_aref(tva_inference_args_admitted(inf), number_utilities.f_1_(argnum), val);
        return (SubLObject)tva_inference.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 4618L)
    public static SubLObject with_new_tva_inference(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)tva_inference.$sym51$CLET, (SubLObject)tva_inference.$list52, ConsesLow.append(body, (SubLObject)tva_inference.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 4741L)
    public static SubLObject tva_asent_pred() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return tva_inference_asent_pred(tva_inference.$tva_inference$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 4940L)
    public static SubLObject tva_var_argnums() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return tva_inference_var_argnums(tva_inference.$tva_inference$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 5076L)
    public static SubLObject tva_var_argnum(final SubLObject var) {
        SubLObject argnum = (SubLObject)tva_inference.NIL;
        if (tva_inference.NIL == argnum) {
            SubLObject csome_list_var = tva_var_argnums();
            SubLObject pair = (SubLObject)tva_inference.NIL;
            pair = csome_list_var.first();
            while (tva_inference.NIL == argnum && tva_inference.NIL != csome_list_var) {
                if (pair.first().eql(var)) {
                    argnum = conses_high.second(pair);
                }
                csome_list_var = csome_list_var.rest();
                pair = csome_list_var.first();
            }
        }
        return argnum;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 5294L)
    public static SubLObject tva_term_argnums() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return tva_inference_term_argnums(tva_inference.$tva_inference$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 5427L)
    public static SubLObject tva_asent_arg(final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return tva_inference_asent_arg(tva_inference.$tva_inference$.getDynamicValue(thread), number_utilities.f_1_(argnum));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 5583L)
    public static SubLObject tva_asent_arg_admitted(final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return tva_inference_arg_admitted(tva_inference.$tva_inference$.getDynamicValue(thread), number_utilities.f_1_(argnum));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 5791L)
    public static SubLObject set_tva_asent_arg_admitted(final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        set_tva_inference_arg_admitted(tva_inference.$tva_inference$.getDynamicValue(thread), argnum, (SubLObject)tva_inference.T);
        return (SubLObject)tva_inference.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 5919L)
    public static SubLObject set_tva_asent_arg_failed(final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        set_tva_inference_arg_admitted(tva_inference.$tva_inference$.getDynamicValue(thread), argnum, (SubLObject)tva_inference.$kw53$FAIL);
        return (SubLObject)tva_inference.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 6049L)
    public static SubLObject tva_return_one_answerP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return tva_inference_one_answerP(tva_inference.$tva_inference$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 6147L)
    public static SubLObject tva_compute_justificationsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return tva_inference_justifyP(tva_inference.$tva_inference$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 6247L)
    public static SubLObject tva_tactic_precomputations(final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_lookup(tva_inference_precomputations(tva_inference.$tva_inference$.getDynamicValue(thread)), tactic, (SubLObject)tva_inference.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 6513L)
    public static SubLObject tva_store_precomputation(final SubLObject tactic, final SubLObject precomputation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        store_tva_inference_precomputation(tva_inference.$tva_inference$.getDynamicValue(thread), tactic, precomputation);
        return (SubLObject)tva_inference.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 6790L)
    public static SubLObject tva_restricted_assertion_p(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Equality.eq(assertion, tva_inference_restricted_assertion(tva_inference.$tva_inference$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 7095L)
    public static SubLObject tva_reused_spaces() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return tva_inference_reused_spaces(tva_inference.$tva_inference$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 7250L)
    public static SubLObject tva_store_reused_spaces(final SubLObject key, final SubLObject spaces) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        store_tva_inference_reused_spaces(tva_inference.$tva_inference$.getDynamicValue(thread), key, spaces);
        return (SubLObject)tva_inference.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 7804L)
    public static SubLObject tva_reused_spaces_for_relation(final SubLObject trans_pred, final SubLObject goal_node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject key = (SubLObject)ConsesLow.list(trans_pred, goal_node);
        SubLObject spaces = dictionary.dictionary_lookup(tva_reused_spaces(), key, (SubLObject)tva_inference.UNPROVIDED);
        if (tva_inference.NIL != spaces) {
            return spaces;
        }
        final SubLObject fail_space = ghl_marking_utilities.ghl_instantiate_new_space();
        final SubLObject goal_space = ghl_marking_utilities.ghl_instantiate_new_space();
        spaces = (SubLObject)ConsesLow.list(fail_space, goal_space);
        if (tva_inference.NIL != tva_inference.$tva_reuse_spacesP$.getDynamicValue(thread)) {
            tva_store_reused_spaces(key, spaces);
        }
        return spaces;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 8386L)
    public static SubLObject tva_answers() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return tva_inference_answers(tva_inference.$tva_inference$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 8467L)
    public static SubLObject add_to_tva_answers(final SubLObject new_answers) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        _csetf_tva_inf_answers(tva_inference.$tva_inference$.getDynamicValue(thread), ConsesLow.nconc(new_answers, tva_answers()));
        return (SubLObject)tva_inference.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 8608L)
    public static SubLObject determine_term_argnums(final SubLObject asent) {
        SubLObject result = (SubLObject)tva_inference.NIL;
        SubLObject cdolist_list_var = list_utilities.num_list(el_utilities.formula_length(asent, (SubLObject)tva_inference.UNPROVIDED), (SubLObject)tva_inference.UNPROVIDED).rest();
        SubLObject num = (SubLObject)tva_inference.NIL;
        num = cdolist_list_var.first();
        while (tva_inference.NIL != cdolist_list_var) {
            if (tva_inference.NIL != variables.fully_bound_p(cycl_utilities.atomic_sentence_arg(asent, num, (SubLObject)tva_inference.UNPROVIDED))) {
                result = (SubLObject)ConsesLow.cons(num, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            num = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 8947L)
    public static SubLObject determine_var_argnums(final SubLObject asent) {
        SubLObject result = (SubLObject)tva_inference.NIL;
        SubLObject cdolist_list_var = list_utilities.num_list(el_utilities.formula_length(asent, (SubLObject)tva_inference.UNPROVIDED), (SubLObject)tva_inference.UNPROVIDED).rest();
        SubLObject num = (SubLObject)tva_inference.NIL;
        num = cdolist_list_var.first();
        while (tva_inference.NIL != cdolist_list_var) {
            if (tva_inference.NIL != cycl_grammar.hl_variable_p(cycl_utilities.atomic_sentence_arg(asent, num, (SubLObject)tva_inference.UNPROVIDED))) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(cycl_utilities.atomic_sentence_arg(asent, num, (SubLObject)tva_inference.UNPROVIDED), num), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            num = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 9304L)
    public static SubLObject determine_restricted_assertion(final SubLObject asent) {
        if (tva_inference.NIL != variables.fully_bound_p(asent)) {
            return czer_meta.find_assertion_cycl(asent, (SubLObject)tva_inference.UNPROVIDED);
        }
        return (SubLObject)tva_inference.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 9612L)
    public static SubLObject initialize_tva_asent_vector(final SubLObject asent) {
        final SubLObject arg_count = el_utilities.formula_arity(asent, (SubLObject)tva_inference.UNPROVIDED);
        final SubLObject vector = Vectors.make_vector(arg_count, (SubLObject)tva_inference.UNPROVIDED);
        SubLObject n;
        for (n = (SubLObject)tva_inference.NIL, n = (SubLObject)tva_inference.ZERO_INTEGER; n.numL(arg_count); n = Numbers.add(n, (SubLObject)tva_inference.ONE_INTEGER)) {
            Vectors.set_aref(vector, n, cycl_utilities.atomic_sentence_arg(asent, Numbers.add((SubLObject)tva_inference.ONE_INTEGER, n), (SubLObject)tva_inference.UNPROVIDED));
        }
        return vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 9922L)
    public static SubLObject initialize_tva_args_admitted_vector(final SubLObject asent) {
        final SubLObject arg_count = el_utilities.formula_arity(asent, (SubLObject)tva_inference.UNPROVIDED);
        final SubLObject vector = Vectors.make_vector(arg_count, (SubLObject)tva_inference.UNPROVIDED);
        return vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 10081L)
    public static SubLObject tva_unify(final SubLObject asent, SubLObject mt, SubLObject return_one_answer_p, SubLObject compute_justifications_p, SubLObject closure_mode, SubLObject checking_spec_preds_for_cache_resultsP, SubLObject prove_negationP) {
        if (mt == tva_inference.UNPROVIDED) {
            mt = (SubLObject)tva_inference.NIL;
        }
        if (return_one_answer_p == tva_inference.UNPROVIDED) {
            return_one_answer_p = (SubLObject)tva_inference.NIL;
        }
        if (compute_justifications_p == tva_inference.UNPROVIDED) {
            compute_justifications_p = (SubLObject)tva_inference.NIL;
        }
        if (closure_mode == tva_inference.UNPROVIDED) {
            closure_mode = (SubLObject)tva_inference.$kw54$NONE;
        }
        if (checking_spec_preds_for_cache_resultsP == tva_inference.UNPROVIDED) {
            checking_spec_preds_for_cache_resultsP = (SubLObject)tva_inference.T;
        }
        if (prove_negationP == tva_inference.UNPROVIDED) {
            prove_negationP = (SubLObject)tva_inference.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject answers = tva_unify_from_cache(asent, mt, return_one_answer_p, compute_justifications_p);
        final SubLObject use_general_methodP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (tva_inference.NIL != use_general_methodP) {
            SubLObject timed_outP = (SubLObject)tva_inference.NIL;
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (tva_inference.NIL != sksi_sks_interaction.within_sksi_sql_connection_resourcingP()) {
                    final SubLObject _prev_bind_0_$1 = tva_inference.$tva_inference$.currentBinding(thread);
                    try {
                        tva_inference.$tva_inference$.bind(make_tva_inference((SubLObject)tva_inference.UNPROVIDED), thread);
                        initialize_tva_inference(asent, return_one_answer_p, compute_justifications_p);
                        try {
                            thread.throwStack.push(tva_inference.$kw55$TVA_MAX_TIME);
                            final SubLObject strategy = tva_strategy.make_tva_default_strategy();
                            final SubLObject _prev_bind_0_$2 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$3 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$4 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(tva_inference.$const56$genlPreds), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(tva_inference.$const56$genlPreds)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(tva_inference.$const56$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_inference.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(tva_inference.$const56$genlPreds), thread);
                                final SubLObject mt_var_$5 = mt;
                                final SubLObject _prev_bind_0_$3 = mt_relevance_macros.$mt$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$5 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var_$5), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var_$5), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var_$5), thread);
                                    final SubLObject tv_var = (SubLObject)tva_inference.NIL;
                                    final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$5 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_tv$.bind((tva_inference.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((tva_inference.NIL != tv_var) ? tva_inference.$sym57$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                        if (tva_inference.NIL != tv_var && tva_inference.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && tva_inference.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                            if (pcase_var.eql((SubLObject)tva_inference.$kw58$ERROR)) {
                                                sbhl_paranoia.sbhl_error((SubLObject)tva_inference.ONE_INTEGER, (SubLObject)tva_inference.$str59$_A_is_not_a__A, tv_var, (SubLObject)tva_inference.$sym60$SBHL_TRUE_TV_P, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED);
                                            }
                                            else if (pcase_var.eql((SubLObject)tva_inference.$kw61$CERROR)) {
                                                sbhl_paranoia.sbhl_cerror((SubLObject)tva_inference.ONE_INTEGER, (SubLObject)tva_inference.$str62$continue_anyway, (SubLObject)tva_inference.$str59$_A_is_not_a__A, tv_var, (SubLObject)tva_inference.$sym60$SBHL_TRUE_TV_P, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED);
                                            }
                                            else if (pcase_var.eql((SubLObject)tva_inference.$kw63$WARN)) {
                                                Errors.warn((SubLObject)tva_inference.$str59$_A_is_not_a__A, tv_var, (SubLObject)tva_inference.$sym60$SBHL_TRUE_TV_P);
                                            }
                                            else {
                                                Errors.warn((SubLObject)tva_inference.$str64$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror((SubLObject)tva_inference.$str62$continue_anyway, (SubLObject)tva_inference.$str59$_A_is_not_a__A, tv_var, (SubLObject)tva_inference.$sym60$SBHL_TRUE_TV_P);
                                            }
                                        }
                                        final SubLObject _prev_bind_0_$5 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$6 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$6 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_truth$.bind(tva_inference.$const65$True_JustificationTruth, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module((SubLObject)tva_inference.UNPROVIDED)), thread);
                                            final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                            final SubLObject _prev_bind_0_$6 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$sbhl_space$.bind((source == tva_inference.$kw66$OLD) ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                final SubLObject _prev_bind_0_$7 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                try {
                                                    sbhl_marking_vars.$sbhl_gather_space$.bind((source == tva_inference.$kw66$OLD) ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                    final SubLObject _prev_bind_0_$8 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$7 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                    final SubLObject _prev_bind_3_$19 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                    final SubLObject _prev_bind_4_$20 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_finishedP$.bind((SubLObject)tva_inference.NIL, thread);
                                                        sbhl_search_vars.$sbhl_stop_search_pathP$.bind((SubLObject)tva_inference.NIL, thread);
                                                        sbhl_search_vars.$sbhl_search_parent_marking$.bind((SubLObject)tva_inference.NIL, thread);
                                                        sbhl_search_vars.$sbhl_nodes_previous_marking$.bind((SubLObject)tva_inference.NIL, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_inference.NIL, thread);
                                                        final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                        SubLObject needs_to_releaseP = (SubLObject)tva_inference.NIL;
                                                        try {
                                                            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                                            thread.resetMultipleValues();
                                                            final SubLObject spec_preds = tva_utilities.tva_spec_preds_and_inverses(tva_asent_pred(), prove_negationP);
                                                            final SubLObject spec_inverses = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            SubLObject rest;
                                                            SubLObject pred;
                                                            for (rest = (SubLObject)tva_inference.NIL, rest = spec_preds; (tva_inference.NIL == tva_return_one_answerP() || tva_inference.NIL == tva_answers()) && tva_inference.NIL != rest; rest = rest.rest()) {
                                                                pred = rest.first();
                                                                tva_mark_and_sweep(pred, strategy);
                                                            }
                                                            final SubLObject _prev_bind_0_$9 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_inference.T, thread);
                                                                SubLObject rest2;
                                                                SubLObject pred2;
                                                                for (rest2 = (SubLObject)tva_inference.NIL, rest2 = spec_inverses; (tva_inference.NIL == tva_return_one_answerP() || tva_inference.NIL == tva_answers()) && tva_inference.NIL != rest2; rest2 = rest2.rest()) {
                                                                    pred2 = rest2.first();
                                                                    tva_mark_and_sweep(pred2, strategy);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$9, thread);
                                                            }
                                                        }
                                                        finally {
                                                            if (tva_inference.NIL != needs_to_releaseP) {
                                                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$20, thread);
                                                        sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$19, thread);
                                                        sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$7, thread);
                                                        sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$7, thread);
                                                        sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$8, thread);
                                                    }
                                                    if (source == tva_inference.$kw67$RESOURCE) {
                                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                    }
                                                }
                                                finally {
                                                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$7, thread);
                                                }
                                                if (source == tva_inference.$kw67$RESOURCE) {
                                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                }
                                            }
                                            finally {
                                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$6, thread);
                                            }
                                        }
                                        finally {
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$6, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$6, thread);
                                            sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$5, thread);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$5, thread);
                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$4, thread);
                                    }
                                }
                                finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$5, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$4, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$3, thread);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$4, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$3, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$2, thread);
                            }
                        }
                        catch (Throwable ccatch_env_var) {
                            timed_outP = Errors.handleThrowable(ccatch_env_var, (SubLObject)tva_inference.$kw55$TVA_MAX_TIME);
                        }
                        finally {
                            thread.throwStack.pop();
                        }
                        answers = list_utilities.fast_delete_duplicates(tva_answers(), Symbols.symbol_function((SubLObject)tva_inference.EQUAL), (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED);
                        if (tva_inference.NIL == return_one_answer_p) {
                            answers = tva_unify_closure(answers, closure_mode);
                        }
                    }
                    finally {
                        tva_inference.$tva_inference$.rebind(_prev_bind_0_$1, thread);
                    }
                }
                else {
                    final SubLObject _prev_bind_0_$10 = sksi_macros.$sksi_sql_connection_cache$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$8 = sksi_macros.$sksi_sql_statement_cache$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$8 = sksi_macros.$sksi_sql_statement_pool_lock$.currentBinding(thread);
                    try {
                        sksi_macros.$sksi_sql_connection_cache$.bind(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)tva_inference.EQUALP), (SubLObject)tva_inference.UNPROVIDED), thread);
                        sksi_macros.$sksi_sql_statement_cache$.bind(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)tva_inference.EQ), (SubLObject)tva_inference.UNPROVIDED), thread);
                        sksi_macros.$sksi_sql_statement_pool_lock$.bind(Locks.make_lock(Strings.string(Symbols.gensym((SubLObject)tva_inference.$str68$SKSI_SQL_statement_cache_))), thread);
                        SubLObject resourcing_caches_finalizedP = (SubLObject)tva_inference.NIL;
                        try {
                            final SubLObject _prev_bind_0_$11 = tva_inference.$tva_inference$.currentBinding(thread);
                            try {
                                tva_inference.$tva_inference$.bind(make_tva_inference((SubLObject)tva_inference.UNPROVIDED), thread);
                                initialize_tva_inference(asent, return_one_answer_p, compute_justifications_p);
                                try {
                                    thread.throwStack.push(tva_inference.$kw55$TVA_MAX_TIME);
                                    final SubLObject strategy2 = tva_strategy.make_tva_default_strategy();
                                    final SubLObject _prev_bind_0_$12 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$9 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$9 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_7 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(tva_inference.$const56$genlPreds), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(tva_inference.$const56$genlPreds)), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(tva_inference.$const56$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_inference.NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(tva_inference.$const56$genlPreds), thread);
                                        final SubLObject mt_var_$6 = mt;
                                        final SubLObject _prev_bind_0_$13 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$10 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$10 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var_$6), thread);
                                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var_$6), thread);
                                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var_$6), thread);
                                            final SubLObject tv_var2 = (SubLObject)tva_inference.NIL;
                                            final SubLObject _prev_bind_0_$14 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$11 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind((tva_inference.NIL != tv_var2) ? tv_var2 : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((tva_inference.NIL != tv_var2) ? tva_inference.$sym57$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                                if (tva_inference.NIL != tv_var2 && tva_inference.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && tva_inference.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var2)) {
                                                    final SubLObject pcase_var2 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                    if (pcase_var2.eql((SubLObject)tva_inference.$kw58$ERROR)) {
                                                        sbhl_paranoia.sbhl_error((SubLObject)tva_inference.ONE_INTEGER, (SubLObject)tva_inference.$str59$_A_is_not_a__A, tv_var2, (SubLObject)tva_inference.$sym60$SBHL_TRUE_TV_P, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED);
                                                    }
                                                    else if (pcase_var2.eql((SubLObject)tva_inference.$kw61$CERROR)) {
                                                        sbhl_paranoia.sbhl_cerror((SubLObject)tva_inference.ONE_INTEGER, (SubLObject)tva_inference.$str62$continue_anyway, (SubLObject)tva_inference.$str59$_A_is_not_a__A, tv_var2, (SubLObject)tva_inference.$sym60$SBHL_TRUE_TV_P, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED);
                                                    }
                                                    else if (pcase_var2.eql((SubLObject)tva_inference.$kw63$WARN)) {
                                                        Errors.warn((SubLObject)tva_inference.$str59$_A_is_not_a__A, tv_var2, (SubLObject)tva_inference.$sym60$SBHL_TRUE_TV_P);
                                                    }
                                                    else {
                                                        Errors.warn((SubLObject)tva_inference.$str64$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                        Errors.cerror((SubLObject)tva_inference.$str62$continue_anyway, (SubLObject)tva_inference.$str59$_A_is_not_a__A, tv_var2, (SubLObject)tva_inference.$sym60$SBHL_TRUE_TV_P);
                                                    }
                                                }
                                                final SubLObject _prev_bind_0_$15 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$12 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                final SubLObject _prev_bind_2_$11 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_search_truth$.bind(tva_inference.$const65$True_JustificationTruth, thread);
                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module((SubLObject)tva_inference.UNPROVIDED)), thread);
                                                    final SubLObject source2 = sbhl_marking_vars.sbhl_new_space_source();
                                                    final SubLObject _prev_bind_0_$16 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                    try {
                                                        sbhl_marking_vars.$sbhl_space$.bind((source2 == tva_inference.$kw66$OLD) ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source2), thread);
                                                        final SubLObject _prev_bind_0_$17 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                        try {
                                                            sbhl_marking_vars.$sbhl_gather_space$.bind((source2 == tva_inference.$kw66$OLD) ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source2), thread);
                                                            final SubLObject _prev_bind_0_$18 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$13 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                            final SubLObject _prev_bind_2_$12 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                            final SubLObject _prev_bind_3_$20 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                            final SubLObject _prev_bind_4_$21 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_search_vars.$sbhl_finishedP$.bind((SubLObject)tva_inference.NIL, thread);
                                                                sbhl_search_vars.$sbhl_stop_search_pathP$.bind((SubLObject)tva_inference.NIL, thread);
                                                                sbhl_search_vars.$sbhl_search_parent_marking$.bind((SubLObject)tva_inference.NIL, thread);
                                                                sbhl_search_vars.$sbhl_nodes_previous_marking$.bind((SubLObject)tva_inference.NIL, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_inference.NIL, thread);
                                                                final SubLObject rw_lock_var2 = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                                SubLObject needs_to_releaseP2 = (SubLObject)tva_inference.NIL;
                                                                try {
                                                                    needs_to_releaseP2 = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var2);
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject spec_preds2 = tva_utilities.tva_spec_preds_and_inverses(tva_asent_pred(), prove_negationP);
                                                                    final SubLObject spec_inverses2 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    SubLObject rest3;
                                                                    SubLObject pred3;
                                                                    for (rest3 = (SubLObject)tva_inference.NIL, rest3 = spec_preds2; (tva_inference.NIL == tva_return_one_answerP() || tva_inference.NIL == tva_answers()) && tva_inference.NIL != rest3; rest3 = rest3.rest()) {
                                                                        pred3 = rest3.first();
                                                                        tva_mark_and_sweep(pred3, strategy2);
                                                                    }
                                                                    final SubLObject _prev_bind_0_$19 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_inference.T, thread);
                                                                        SubLObject rest4;
                                                                        SubLObject pred4;
                                                                        for (rest4 = (SubLObject)tva_inference.NIL, rest4 = spec_inverses2; (tva_inference.NIL == tva_return_one_answerP() || tva_inference.NIL == tva_answers()) && tva_inference.NIL != rest4; rest4 = rest4.rest()) {
                                                                            pred4 = rest4.first();
                                                                            tva_mark_and_sweep(pred4, strategy2);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$19, thread);
                                                                    }
                                                                }
                                                                finally {
                                                                    if (tva_inference.NIL != needs_to_releaseP2) {
                                                                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var2);
                                                                    }
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$21, thread);
                                                                sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$20, thread);
                                                                sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$12, thread);
                                                                sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$13, thread);
                                                                sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$18, thread);
                                                            }
                                                            if (source2 == tva_inference.$kw67$RESOURCE) {
                                                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$17, thread);
                                                        }
                                                        if (source2 == tva_inference.$kw67$RESOURCE) {
                                                            sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$16, thread);
                                                    }
                                                }
                                                finally {
                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$11, thread);
                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$12, thread);
                                                    sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$15, thread);
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$11, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$14, thread);
                                            }
                                        }
                                        finally {
                                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$10, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$10, thread);
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_$13, thread);
                                        }
                                    }
                                    finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_7, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_6, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$9, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$9, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$12, thread);
                                    }
                                }
                                catch (Throwable ccatch_env_var2) {
                                    timed_outP = Errors.handleThrowable(ccatch_env_var2, (SubLObject)tva_inference.$kw55$TVA_MAX_TIME);
                                }
                                finally {
                                    thread.throwStack.pop();
                                }
                                answers = list_utilities.fast_delete_duplicates(tva_answers(), Symbols.symbol_function((SubLObject)tva_inference.EQUAL), (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED);
                                if (tva_inference.NIL == return_one_answer_p) {
                                    answers = tva_unify_closure(answers, closure_mode);
                                }
                            }
                            finally {
                                tva_inference.$tva_inference$.rebind(_prev_bind_0_$11, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_inference.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                try {
                                    resourcing_caches_finalizedP = sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_inference.T, thread);
                                        final SubLObject _values_$48 = Values.getValuesAsVector();
                                        if (tva_inference.NIL == resourcing_caches_finalizedP) {
                                            sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                        }
                                        Values.restoreValuesFromVector(_values_$48);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                                    }
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                            }
                        }
                    }
                    finally {
                        sksi_macros.$sksi_sql_statement_pool_lock$.rebind(_prev_bind_2_$8, thread);
                        sksi_macros.$sksi_sql_statement_cache$.rebind(_prev_bind_1_$8, thread);
                        sksi_macros.$sksi_sql_connection_cache$.rebind(_prev_bind_0_$10, thread);
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        else if (tva_inference.NIL == checking_spec_preds_for_cache_resultsP) {
            final SubLObject node_var;
            final SubLObject arg0 = node_var = cycl_utilities.atomic_sentence_predicate(asent);
            final SubLObject deck_type = (SubLObject)tva_inference.$kw71$QUEUE;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = (SubLObject)tva_inference.NIL;
            final SubLObject _prev_bind_8 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var3 = (SubLObject)tva_inference.NIL;
                    final SubLObject _prev_bind_0_$22 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind((tva_inference.NIL != tv_var3) ? tv_var3 : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((tva_inference.NIL != tv_var3) ? tva_inference.$sym57$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if (tva_inference.NIL != tv_var3 && tva_inference.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && tva_inference.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var3)) {
                            final SubLObject pcase_var3 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var3.eql((SubLObject)tva_inference.$kw58$ERROR)) {
                                sbhl_paranoia.sbhl_error((SubLObject)tva_inference.ONE_INTEGER, (SubLObject)tva_inference.$str59$_A_is_not_a__A, tv_var3, (SubLObject)tva_inference.$sym60$SBHL_TRUE_TV_P, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED);
                            }
                            else if (pcase_var3.eql((SubLObject)tva_inference.$kw61$CERROR)) {
                                sbhl_paranoia.sbhl_cerror((SubLObject)tva_inference.ONE_INTEGER, (SubLObject)tva_inference.$str62$continue_anyway, (SubLObject)tva_inference.$str59$_A_is_not_a__A, tv_var3, (SubLObject)tva_inference.$sym60$SBHL_TRUE_TV_P, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED);
                            }
                            else if (pcase_var3.eql((SubLObject)tva_inference.$kw63$WARN)) {
                                Errors.warn((SubLObject)tva_inference.$str59$_A_is_not_a__A, tv_var3, (SubLObject)tva_inference.$sym60$SBHL_TRUE_TV_P);
                            }
                            else {
                                Errors.warn((SubLObject)tva_inference.$str64$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror((SubLObject)tva_inference.$str62$continue_anyway, (SubLObject)tva_inference.$str59$_A_is_not_a__A, tv_var3, (SubLObject)tva_inference.$sym60$SBHL_TRUE_TV_P);
                            }
                        }
                        final SubLObject _prev_bind_0_$23 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$14 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_10 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_11 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_12 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(tva_inference.$const56$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(tva_inference.$const56$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(tva_inference.$const56$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_inference.NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(tva_inference.$const56$genlPreds), thread);
                            if (tva_inference.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || tva_inference.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(arg0, sbhl_module_vars.get_sbhl_module((SubLObject)tva_inference.UNPROVIDED))) {
                                final SubLObject _prev_bind_0_$24 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$15 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(tva_inference.$const56$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_inference.NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)tva_inference.UNPROVIDED);
                                    for (node_and_predicate_mode = (SubLObject)ConsesLow.list(arg0, sbhl_search_vars.genl_inverse_mode_p()); tva_inference.NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                        final SubLObject node_var_$55 = node_and_predicate_mode.first();
                                        final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                        final SubLObject spec_pred = node_var_$55;
                                        final SubLObject _prev_bind_0_$25 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            final SubLObject inverseP = predicate_mode;
                                            if (!spec_pred.equal(arg0) && tva_inference.NIL != tva_utilities.some_transitive_via_arg_assertionP(spec_pred)) {
                                                final SubLObject new_asent = (tva_inference.NIL != inverseP) ? el_utilities.make_formula(spec_pred, Sequences.reverse(cycl_utilities.atomic_sentence_args(asent, (SubLObject)tva_inference.UNPROVIDED)), (SubLObject)tva_inference.UNPROVIDED) : el_utilities.replace_formula_arg((SubLObject)tva_inference.ZERO_INTEGER, spec_pred, asent);
                                                SubLObject cdolist_list_var = tva_unify(new_asent, mt, return_one_answer_p, compute_justifications_p, closure_mode, (SubLObject)tva_inference.T, (SubLObject)tva_inference.UNPROVIDED);
                                                SubLObject v_answer = (SubLObject)tva_inference.NIL;
                                                v_answer = cdolist_list_var.first();
                                                while (tva_inference.NIL != cdolist_list_var) {
                                                    final SubLObject item_var = v_answer;
                                                    if (tva_inference.NIL == conses_high.member(item_var, answers, Symbols.symbol_function((SubLObject)tva_inference.EQUAL), Symbols.symbol_function((SubLObject)tva_inference.IDENTITY))) {
                                                        answers = (SubLObject)ConsesLow.cons(item_var, answers);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    v_answer = cdolist_list_var.first();
                                                }
                                            }
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(tva_inference.$const56$genlPreds));
                                            SubLObject module_var = (SubLObject)tva_inference.NIL;
                                            module_var = cdolist_list_var.first();
                                            while (tva_inference.NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$26 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$16 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((tva_inference.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(tva_inference.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var_$55);
                                                    if (tva_inference.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)tva_inference.UNPROVIDED));
                                                        if (tva_inference.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)tva_inference.UNPROVIDED));
                                                            if (tva_inference.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); tva_inference.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt_$59 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (tva_inference.NIL != mt_relevance_macros.relevant_mtP(mt_$59)) {
                                                                        final SubLObject _prev_bind_0_$27 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$59, thread);
                                                                            SubLObject iteration_state_$61;
                                                                            for (iteration_state_$61 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); tva_inference.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$61); iteration_state_$61 = dictionary_contents.do_dictionary_contents_next(iteration_state_$61)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$61);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (tva_inference.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$28 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (tva_inference.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)tva_inference.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); tva_inference.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (tva_inference.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && tva_inference.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)tva_inference.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)tva_inference.UNPROVIDED);
                                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = (SubLObject)tva_inference.NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (tva_inference.NIL != csome_list_var) {
                                                                                                if (tva_inference.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)tva_inference.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)tva_inference.UNPROVIDED);
                                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)tva_inference.$str72$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$28, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$61);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$27, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)tva_inference.FIVE_INTEGER, (SubLObject)tva_inference.$str73$attempting_to_bind_direction_link, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (tva_inference.NIL != obsolete.cnat_p(node, (SubLObject)tva_inference.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$63;
                                                        final SubLObject new_list = cdolist_list_var_$63 = ((tva_inference.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_inference.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_inference.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)tva_inference.NIL;
                                                        generating_fn = cdolist_list_var_$63.first();
                                                        while (tva_inference.NIL != cdolist_list_var_$63) {
                                                            final SubLObject _prev_bind_0_$29 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (tva_inference.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)tva_inference.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); tva_inference.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (tva_inference.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && tva_inference.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)tva_inference.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)tva_inference.UNPROVIDED);
                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var2 = sol2;
                                                                    SubLObject node_vars_link_node4 = (SubLObject)tva_inference.NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (tva_inference.NIL != csome_list_var2) {
                                                                        if (tva_inference.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)tva_inference.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)tva_inference.UNPROVIDED);
                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)tva_inference.$str72$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$29, thread);
                                                            }
                                                            cdolist_list_var_$63 = cdolist_list_var_$63.rest();
                                                            generating_fn = cdolist_list_var_$63.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$16, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$26, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$25, thread);
                                        }
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$13, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$15, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$24, thread);
                                }
                            }
                            else {
                                sbhl_paranoia.sbhl_warn((SubLObject)tva_inference.TWO_INTEGER, (SubLObject)tva_inference.$str74$Node__a_does_not_pass_sbhl_type_t, arg0, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)tva_inference.UNPROVIDED)), (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED);
                            }
                        }
                        finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_12, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_11, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_10, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$14, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$23, thread);
                        }
                    }
                    finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_9, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$22, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_inference.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_8, thread);
            }
        }
        return answers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 12540L)
    public static SubLObject tva_unify_from_cache(final SubLObject asent, final SubLObject mt, SubLObject return_one_answer_p, SubLObject compute_justifications_p) {
        if (return_one_answer_p == tva_inference.UNPROVIDED) {
            return_one_answer_p = (SubLObject)tva_inference.NIL;
        }
        if (compute_justifications_p == tva_inference.UNPROVIDED) {
            compute_justifications_p = (SubLObject)tva_inference.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject use_general_methodP = (SubLObject)tva_inference.T;
        SubLObject answers = (SubLObject)tva_inference.NIL;
        final SubLObject arg0 = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject doneP = (SubLObject)tva_inference.NIL;
        if (tva_inference.NIL != tva_cache.tva_cache_enabled_p()) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                SubLObject index_argnum = (SubLObject)tva_inference.ZERO_INTEGER;
                final SubLObject args = cycl_utilities.formula_args(asent, (SubLObject)tva_inference.$kw75$IGNORE);
                SubLObject rest;
                SubLObject index_arg;
                SubLObject gather_arg;
                SubLObject alist;
                SubLObject _prev_bind_0_$66;
                SubLObject rest_$67;
                SubLObject cons;
                SubLObject current;
                SubLObject datum;
                SubLObject gather_arg_value;
                SubLObject supports;
                SubLObject v_bindings;
                SubLObject justification;
                for (rest = (SubLObject)tva_inference.NIL, rest = args; tva_inference.NIL == doneP && tva_inference.NIL != rest; rest = rest.rest()) {
                    index_arg = rest.first();
                    index_argnum = Numbers.add(index_argnum, (SubLObject)tva_inference.ONE_INTEGER);
                    if (tva_inference.NIL != variables.fully_bound_p(index_arg) && tva_inference.NIL != tva_cache.tva_cache_predicate_index_arg_cached_p(arg0, index_argnum)) {
                        gather_arg = cycl_utilities.atomic_sentence_arg(asent, Numbers.subtract((SubLObject)tva_inference.THREE_INTEGER, index_argnum), (SubLObject)tva_inference.UNPROVIDED);
                        alist = ((tva_inference.NIL != variables.fully_bound_p(gather_arg)) ? tva_cache.tva_cache_check_value(index_arg, arg0, index_argnum, gather_arg, Symbols.symbol_function((SubLObject)tva_inference.EQUAL), compute_justifications_p) : tva_cache.tva_cache_get_values(index_arg, arg0, index_argnum, compute_justifications_p));
                        _prev_bind_0_$66 = unification.$unify_return_justificationP$.currentBinding(thread);
                        try {
                            unification.$unify_return_justificationP$.bind(compute_justifications_p, thread);
                            for (rest_$67 = (SubLObject)tva_inference.NIL, rest_$67 = alist; tva_inference.NIL == doneP && tva_inference.NIL != rest_$67; rest_$67 = rest_$67.rest()) {
                                cons = rest_$67.first();
                                datum = (current = cons);
                                gather_arg_value = (SubLObject)tva_inference.NIL;
                                supports = (SubLObject)tva_inference.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_inference.$list76);
                                gather_arg_value = current.first();
                                current = (supports = current.rest());
                                thread.resetMultipleValues();
                                v_bindings = unification_utilities.term_unify(gather_arg, gather_arg_value, (SubLObject)tva_inference.T, (SubLObject)tva_inference.UNPROVIDED);
                                justification = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                answers = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_bindings, ConsesLow.append(supports, justification)), answers);
                                if (tva_inference.NIL != variables.fully_bound_p(gather_arg) && tva_inference.NIL == compute_justifications_p) {
                                    doneP = (SubLObject)tva_inference.T;
                                }
                            }
                        }
                        finally {
                            unification.$unify_return_justificationP$.rebind(_prev_bind_0_$66, thread);
                        }
                        use_general_methodP = (SubLObject)tva_inference.NIL;
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return Values.values(answers, use_general_methodP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 14013L)
    public static SubLObject tva_unify_closure(final SubLObject answers, final SubLObject closure_mode) {
        if (closure_mode.eql((SubLObject)tva_inference.$kw54$NONE)) {
            return answers;
        }
        SubLObject closure = (SubLObject)tva_inference.NIL;
        SubLObject cdolist_list_var = answers;
        SubLObject v_answer = (SubLObject)tva_inference.NIL;
        v_answer = cdolist_list_var.first();
        while (tva_inference.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = v_answer;
            SubLObject v_bindings = (SubLObject)tva_inference.NIL;
            SubLObject supports = (SubLObject)tva_inference.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_inference.$list77);
            v_bindings = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_inference.$list77);
            supports = current.first();
            current = current.rest();
            if (tva_inference.NIL == current) {
                SubLObject answer_closure = (SubLObject)tva_inference.NIL;
                SubLObject cdolist_list_var_$68 = v_bindings;
                SubLObject binding = (SubLObject)tva_inference.NIL;
                binding = cdolist_list_var_$68.first();
                while (tva_inference.NIL != cdolist_list_var_$68) {
                    final SubLObject var = bindings.variable_binding_variable(binding);
                    final SubLObject value = bindings.variable_binding_value(binding);
                    final SubLObject argnum = tva_var_argnum(var);
                    SubLObject var_closure = (SubLObject)ConsesLow.list(binding);
                    SubLObject csome_list_var = tva_utilities.get_tva_predicates();
                    SubLObject tva_pred = (SubLObject)tva_inference.NIL;
                    tva_pred = csome_list_var.first();
                    while (tva_inference.NIL != csome_list_var) {
                        final SubLObject direction = tva_utilities.tva_direction_to_ghl_closure_direction(tva_utilities.tva_direction_for_tva_pred(tva_pred));
                        SubLObject cdolist_list_var_$69 = tva_utilities.tva_gather_transitive_predicates_for_arg(tva_pred, tva_asent_pred(), argnum, (SubLObject)tva_inference.NIL, (SubLObject)tva_inference.UNPROVIDED);
                        SubLObject trans_pred = (SubLObject)tva_inference.NIL;
                        trans_pred = cdolist_list_var_$69.first();
                        while (tva_inference.NIL != cdolist_list_var_$69) {
                            if (closure_mode != tva_inference.$kw78$FOCUSED || !direction.eql(ghl_search_vars.ghl_fan_out_direction(trans_pred))) {
                                SubLObject cdolist_list_var_$70 = ghl_search_methods.ghl_closure(trans_pred, value, direction, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED);
                                SubLObject node = (SubLObject)tva_inference.NIL;
                                node = cdolist_list_var_$70.first();
                                while (tva_inference.NIL != cdolist_list_var_$70) {
                                    var_closure = (SubLObject)ConsesLow.cons(bindings.make_variable_binding(var, node), var_closure);
                                    cdolist_list_var_$70 = cdolist_list_var_$70.rest();
                                    node = cdolist_list_var_$70.first();
                                }
                            }
                            cdolist_list_var_$69 = cdolist_list_var_$69.rest();
                            trans_pred = cdolist_list_var_$69.first();
                        }
                        csome_list_var = csome_list_var.rest();
                        tva_pred = csome_list_var.first();
                    }
                    answer_closure = (SubLObject)ConsesLow.cons(list_utilities.fast_delete_duplicates(var_closure, Symbols.symbol_function((SubLObject)tva_inference.EQUAL), (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED), answer_closure);
                    cdolist_list_var_$68 = cdolist_list_var_$68.rest();
                    binding = cdolist_list_var_$68.first();
                }
                SubLObject cdolist_list_var_$71 = list_utilities.cartesian_product(Sequences.nreverse(answer_closure), (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED);
                SubLObject new_bindings = (SubLObject)tva_inference.NIL;
                new_bindings = cdolist_list_var_$71.first();
                while (tva_inference.NIL != cdolist_list_var_$71) {
                    closure = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(new_bindings, supports), closure);
                    cdolist_list_var_$71 = cdolist_list_var_$71.rest();
                    new_bindings = cdolist_list_var_$71.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_inference.$list77);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(ConsesLow.append(answers, closure), Symbols.symbol_function((SubLObject)tva_inference.EQUAL), (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 15442L)
    public static SubLObject tva_marked_p(final SubLObject pred, final SubLObject new_strategy) {
        SubLObject subsumedP = (SubLObject)tva_inference.NIL;
        if (tva_inference.NIL == subsumedP) {
            SubLObject csome_list_var = sbhl_marking_utilities.sbhl_marked_with(pred, (SubLObject)tva_inference.UNPROVIDED);
            SubLObject old_strategy = (SubLObject)tva_inference.NIL;
            old_strategy = csome_list_var.first();
            while (tva_inference.NIL == subsumedP && tva_inference.NIL != csome_list_var) {
                if (tva_inference.NIL != tva_strategy.tva_strategy_subsumes_strategy_p(old_strategy, new_strategy)) {
                    subsumedP = (SubLObject)tva_inference.T;
                }
                csome_list_var = csome_list_var.rest();
                old_strategy = csome_list_var.first();
            }
        }
        return subsumedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 15791L)
    public static SubLObject tva_mark_node_marked(final SubLObject pred, final SubLObject strategy) {
        sbhl_marking_utilities.prepend_to_sbhl_marking_state(pred, strategy, (SubLObject)tva_inference.UNPROVIDED);
        return (SubLObject)tva_inference.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 16042L)
    public static SubLObject tva_mark_and_sweep(final SubLObject pred, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (tva_inference.NIL != tva_inference.$tva_max_time_enabledP$.getGlobalValue() && tva_inference.NIL != inference_strategist.current_controlling_inference_max_time_reachedP()) {
            Dynamic.sublisp_throw((SubLObject)tva_inference.$kw55$TVA_MAX_TIME, (SubLObject)tva_inference.T);
        }
        final SubLObject flipped_modeP = (SubLObject)SubLObjectFactory.makeBoolean(!tva_strategy.tva_strategy_inverse_mode_p(strategy).eql(sbhl_search_vars.genl_inverse_mode_p()));
        final SubLObject new_strategy = tva_strategy.tva_restrategize(pred, strategy, flipped_modeP);
        if (tva_inference.NIL == tva_marked_p(pred, new_strategy)) {
            tva_mark_node_marked(pred, new_strategy);
            if (tva_inference.NIL != tva_strategy.tva_strategy_p(new_strategy)) {
                add_to_tva_answers(tva_strategy.proceed_with_tva_strategy(new_strategy));
            }
            if (tva_inference.NIL != tva_return_one_answerP() && tva_inference.NIL != tva_answers()) {
                sbhl_search_vars.$sbhl_finishedP$.setDynamicValue((SubLObject)tva_inference.T, thread);
            }
            if (tva_inference.NIL != tva_strategy.tva_strategy_p(new_strategy)) {
                final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module((SubLObject)tva_inference.UNPROVIDED));
                SubLObject rest;
                SubLObject module_var;
                SubLObject _prev_bind_0;
                SubLObject _prev_bind_2;
                SubLObject node;
                SubLObject d_link;
                SubLObject mt_links;
                SubLObject iteration_state;
                SubLObject mt;
                SubLObject tv_links;
                SubLObject _prev_bind_0_$72;
                SubLObject iteration_state_$73;
                SubLObject tv;
                SubLObject link_nodes;
                SubLObject _prev_bind_0_$73;
                SubLObject sol;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject link_pred;
                SubLObject csome_list_var;
                SubLObject link_pred2;
                SubLObject new_list;
                SubLObject rest_$75;
                SubLObject generating_fn;
                SubLObject _prev_bind_0_$74;
                SubLObject sol2;
                SubLObject link_nodes2;
                SubLObject set_contents_var2;
                SubLObject basis_object2;
                SubLObject state2;
                SubLObject link_pred3;
                SubLObject csome_list_var2;
                SubLObject link_pred4;
                for (rest = (SubLObject)tva_inference.NIL, rest = accessible_modules; tva_inference.NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread) && tva_inference.NIL != rest; rest = rest.rest()) {
                    module_var = rest.first();
                    _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    _prev_bind_2 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    try {
                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((tva_inference.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(tva_inference.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                        node = function_terms.naut_to_nart(pred);
                        if (tva_inference.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                            d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)tva_inference.UNPROVIDED));
                            if (tva_inference.NIL != d_link) {
                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)tva_inference.UNPROVIDED));
                                if (tva_inference.NIL != mt_links) {
                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); tva_inference.NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread) && tva_inference.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                        thread.resetMultipleValues();
                                        mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                        tv_links = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (tva_inference.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                            _prev_bind_0_$72 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                            try {
                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                for (iteration_state_$73 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); tva_inference.NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread) && tva_inference.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$73); iteration_state_$73 = dictionary_contents.do_dictionary_contents_next(iteration_state_$73)) {
                                                    thread.resetMultipleValues();
                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$73);
                                                    link_nodes = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (tva_inference.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                        _prev_bind_0_$73 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                            sol = link_nodes;
                                                            if (tva_inference.NIL != set.set_p(sol)) {
                                                                set_contents_var = set.do_set_internal(sol);
                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)tva_inference.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); tva_inference.NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread) && tva_inference.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                    link_pred = set_contents.do_set_contents_next(basis_object, state);
                                                                    if (tva_inference.NIL != set_contents.do_set_contents_element_validP(state, link_pred)) {
                                                                        tva_mark_and_sweep(link_pred, new_strategy);
                                                                    }
                                                                }
                                                            }
                                                            else if (sol.isList()) {
                                                                if (tva_inference.NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                                                    csome_list_var = sol;
                                                                    link_pred2 = (SubLObject)tva_inference.NIL;
                                                                    link_pred2 = csome_list_var.first();
                                                                    while (tva_inference.NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread) && tva_inference.NIL != csome_list_var) {
                                                                        tva_mark_and_sweep(link_pred2, new_strategy);
                                                                        csome_list_var = csome_list_var.rest();
                                                                        link_pred2 = csome_list_var.first();
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)tva_inference.$str72$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$73, thread);
                                                        }
                                                    }
                                                }
                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$73);
                                            }
                                            finally {
                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$72, thread);
                                            }
                                        }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                }
                            }
                            else {
                                sbhl_paranoia.sbhl_error((SubLObject)tva_inference.FIVE_INTEGER, (SubLObject)tva_inference.$str73$attempting_to_bind_direction_link, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED);
                            }
                        }
                        else if (tva_inference.NIL != obsolete.cnat_p(node, (SubLObject)tva_inference.UNPROVIDED)) {
                            new_list = ((tva_inference.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_inference.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_inference.UNPROVIDED)));
                            for (rest_$75 = (SubLObject)tva_inference.NIL, rest_$75 = new_list; tva_inference.NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread) && tva_inference.NIL != rest_$75; rest_$75 = rest_$75.rest()) {
                                generating_fn = rest_$75.first();
                                _prev_bind_0_$74 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                try {
                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                    link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                    if (tva_inference.NIL != set.set_p(sol2)) {
                                        set_contents_var2 = set.do_set_internal(sol2);
                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)tva_inference.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); tva_inference.NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread) && tva_inference.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                            link_pred3 = set_contents.do_set_contents_next(basis_object2, state2);
                                            if (tva_inference.NIL != set_contents.do_set_contents_element_validP(state2, link_pred3)) {
                                                tva_mark_and_sweep(link_pred3, new_strategy);
                                            }
                                        }
                                    }
                                    else if (sol2.isList()) {
                                        if (tva_inference.NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                            csome_list_var2 = sol2;
                                            link_pred4 = (SubLObject)tva_inference.NIL;
                                            link_pred4 = csome_list_var2.first();
                                            while (tva_inference.NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread) && tva_inference.NIL != csome_list_var2) {
                                                tva_mark_and_sweep(link_pred4, new_strategy);
                                                csome_list_var2 = csome_list_var2.rest();
                                                link_pred4 = csome_list_var2.first();
                                            }
                                        }
                                    }
                                    else {
                                        Errors.error((SubLObject)tva_inference.$str72$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                    }
                                }
                                finally {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$74, thread);
                                }
                            }
                        }
                    }
                    finally {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2, thread);
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        }
        return (SubLObject)tva_inference.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 17260L)
    public static SubLObject tva_unify_closure_iterator(final SubLObject asent, SubLObject mt, SubLObject closure_mode) {
        if (mt == tva_inference.UNPROVIDED) {
            mt = (SubLObject)tva_inference.NIL;
        }
        if (closure_mode == tva_inference.UNPROVIDED) {
            closure_mode = (SubLObject)tva_inference.$kw54$NONE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iterator = (SubLObject)tva_inference.NIL;
        SubLObject timed_outP = (SubLObject)tva_inference.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (tva_inference.NIL != sksi_sks_interaction.within_sksi_sql_connection_resourcingP()) {
                final SubLObject _prev_bind_0_$77 = tva_inference.$tva_inference$.currentBinding(thread);
                try {
                    tva_inference.$tva_inference$.bind(make_tva_inference((SubLObject)tva_inference.UNPROVIDED), thread);
                    initialize_tva_inference(asent, (SubLObject)tva_inference.NIL, (SubLObject)tva_inference.NIL);
                    try {
                        thread.throwStack.push(tva_inference.$kw55$TVA_MAX_TIME);
                        final SubLObject strategy = tva_strategy.make_tva_default_strategy();
                        final SubLObject _prev_bind_0_$78 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$79 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$80 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(tva_inference.$const56$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(tva_inference.$const56$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(tva_inference.$const56$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_inference.NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(tva_inference.$const56$genlPreds), thread);
                            final SubLObject mt_var_$81 = mt;
                            final SubLObject _prev_bind_0_$79 = mt_relevance_macros.$mt$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$80 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$81 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var_$81), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var_$81), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var_$81), thread);
                                final SubLObject tv_var = (SubLObject)tva_inference.NIL;
                                final SubLObject _prev_bind_0_$80 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$81 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind((tva_inference.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((tva_inference.NIL != tv_var) ? tva_inference.$sym57$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                    if (tva_inference.NIL != tv_var && tva_inference.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && tva_inference.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql((SubLObject)tva_inference.$kw58$ERROR)) {
                                            sbhl_paranoia.sbhl_error((SubLObject)tva_inference.ONE_INTEGER, (SubLObject)tva_inference.$str59$_A_is_not_a__A, tv_var, (SubLObject)tva_inference.$sym60$SBHL_TRUE_TV_P, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED);
                                        }
                                        else if (pcase_var.eql((SubLObject)tva_inference.$kw61$CERROR)) {
                                            sbhl_paranoia.sbhl_cerror((SubLObject)tva_inference.ONE_INTEGER, (SubLObject)tva_inference.$str62$continue_anyway, (SubLObject)tva_inference.$str59$_A_is_not_a__A, tv_var, (SubLObject)tva_inference.$sym60$SBHL_TRUE_TV_P, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED);
                                        }
                                        else if (pcase_var.eql((SubLObject)tva_inference.$kw63$WARN)) {
                                            Errors.warn((SubLObject)tva_inference.$str59$_A_is_not_a__A, tv_var, (SubLObject)tva_inference.$sym60$SBHL_TRUE_TV_P);
                                        }
                                        else {
                                            Errors.warn((SubLObject)tva_inference.$str64$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror((SubLObject)tva_inference.$str62$continue_anyway, (SubLObject)tva_inference.$str59$_A_is_not_a__A, tv_var, (SubLObject)tva_inference.$sym60$SBHL_TRUE_TV_P);
                                        }
                                    }
                                    final SubLObject _prev_bind_0_$81 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$82 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$82 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_truth$.bind(tva_inference.$const65$True_JustificationTruth, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module((SubLObject)tva_inference.UNPROVIDED)), thread);
                                        final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                        final SubLObject _prev_bind_0_$82 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_space$.bind((source == tva_inference.$kw66$OLD) ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                            final SubLObject _prev_bind_0_$83 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$sbhl_gather_space$.bind((source == tva_inference.$kw66$OLD) ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                final SubLObject _prev_bind_0_$84 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$83 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                final SubLObject _prev_bind_2_$83 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                final SubLObject _prev_bind_3_$95 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                final SubLObject _prev_bind_4_$96 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_finishedP$.bind((SubLObject)tva_inference.NIL, thread);
                                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind((SubLObject)tva_inference.NIL, thread);
                                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind((SubLObject)tva_inference.NIL, thread);
                                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind((SubLObject)tva_inference.NIL, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_inference.NIL, thread);
                                                    final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                    SubLObject needs_to_releaseP = (SubLObject)tva_inference.NIL;
                                                    try {
                                                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                                        tva_mark_and_sweep(tva_asent_pred(), strategy);
                                                    }
                                                    finally {
                                                        if (tva_inference.NIL != needs_to_releaseP) {
                                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$96, thread);
                                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$95, thread);
                                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$83, thread);
                                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$83, thread);
                                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$84, thread);
                                                }
                                                if (source == tva_inference.$kw67$RESOURCE) {
                                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                }
                                            }
                                            finally {
                                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$83, thread);
                                            }
                                            if (source == tva_inference.$kw67$RESOURCE) {
                                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                            }
                                        }
                                        finally {
                                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$82, thread);
                                        }
                                    }
                                    finally {
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$82, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$82, thread);
                                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$81, thread);
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$81, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$80, thread);
                                }
                            }
                            finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$81, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$80, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$79, thread);
                            }
                        }
                        finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$80, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$79, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$78, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        timed_outP = Errors.handleThrowable(ccatch_env_var, (SubLObject)tva_inference.$kw55$TVA_MAX_TIME);
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                    iterator = tva_unify_closure_iterator_int(list_utilities.fast_delete_duplicates(tva_answers(), Symbols.symbol_function((SubLObject)tva_inference.EQUAL), (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED), closure_mode);
                }
                finally {
                    tva_inference.$tva_inference$.rebind(_prev_bind_0_$77, thread);
                }
            }
            else {
                final SubLObject _prev_bind_0_$85 = sksi_macros.$sksi_sql_connection_cache$.currentBinding(thread);
                final SubLObject _prev_bind_1_$84 = sksi_macros.$sksi_sql_statement_cache$.currentBinding(thread);
                final SubLObject _prev_bind_2_$84 = sksi_macros.$sksi_sql_statement_pool_lock$.currentBinding(thread);
                try {
                    sksi_macros.$sksi_sql_connection_cache$.bind(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)tva_inference.EQUALP), (SubLObject)tva_inference.UNPROVIDED), thread);
                    sksi_macros.$sksi_sql_statement_cache$.bind(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)tva_inference.EQ), (SubLObject)tva_inference.UNPROVIDED), thread);
                    sksi_macros.$sksi_sql_statement_pool_lock$.bind(Locks.make_lock(Strings.string(Symbols.gensym((SubLObject)tva_inference.$str68$SKSI_SQL_statement_cache_))), thread);
                    SubLObject resourcing_caches_finalizedP = (SubLObject)tva_inference.NIL;
                    try {
                        final SubLObject _prev_bind_0_$86 = tva_inference.$tva_inference$.currentBinding(thread);
                        try {
                            tva_inference.$tva_inference$.bind(make_tva_inference((SubLObject)tva_inference.UNPROVIDED), thread);
                            initialize_tva_inference(asent, (SubLObject)tva_inference.NIL, (SubLObject)tva_inference.NIL);
                            try {
                                thread.throwStack.push(tva_inference.$kw55$TVA_MAX_TIME);
                                final SubLObject strategy2 = tva_strategy.make_tva_default_strategy();
                                final SubLObject _prev_bind_0_$87 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$85 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$85 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_7 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(tva_inference.$const56$genlPreds), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(tva_inference.$const56$genlPreds)), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(tva_inference.$const56$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_inference.NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(tva_inference.$const56$genlPreds), thread);
                                    final SubLObject mt_var_$82 = mt;
                                    final SubLObject _prev_bind_0_$88 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$86 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$86 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var_$82), thread);
                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var_$82), thread);
                                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var_$82), thread);
                                        final SubLObject tv_var2 = (SubLObject)tva_inference.NIL;
                                        final SubLObject _prev_bind_0_$89 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$87 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_tv$.bind((tva_inference.NIL != tv_var2) ? tv_var2 : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((tva_inference.NIL != tv_var2) ? tva_inference.$sym57$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                            if (tva_inference.NIL != tv_var2 && tva_inference.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && tva_inference.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var2)) {
                                                final SubLObject pcase_var2 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                if (pcase_var2.eql((SubLObject)tva_inference.$kw58$ERROR)) {
                                                    sbhl_paranoia.sbhl_error((SubLObject)tva_inference.ONE_INTEGER, (SubLObject)tva_inference.$str59$_A_is_not_a__A, tv_var2, (SubLObject)tva_inference.$sym60$SBHL_TRUE_TV_P, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED);
                                                }
                                                else if (pcase_var2.eql((SubLObject)tva_inference.$kw61$CERROR)) {
                                                    sbhl_paranoia.sbhl_cerror((SubLObject)tva_inference.ONE_INTEGER, (SubLObject)tva_inference.$str62$continue_anyway, (SubLObject)tva_inference.$str59$_A_is_not_a__A, tv_var2, (SubLObject)tva_inference.$sym60$SBHL_TRUE_TV_P, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED);
                                                }
                                                else if (pcase_var2.eql((SubLObject)tva_inference.$kw63$WARN)) {
                                                    Errors.warn((SubLObject)tva_inference.$str59$_A_is_not_a__A, tv_var2, (SubLObject)tva_inference.$sym60$SBHL_TRUE_TV_P);
                                                }
                                                else {
                                                    Errors.warn((SubLObject)tva_inference.$str64$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                    Errors.cerror((SubLObject)tva_inference.$str62$continue_anyway, (SubLObject)tva_inference.$str59$_A_is_not_a__A, tv_var2, (SubLObject)tva_inference.$sym60$SBHL_TRUE_TV_P);
                                                }
                                            }
                                            final SubLObject _prev_bind_0_$90 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$88 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$87 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_truth$.bind(tva_inference.$const65$True_JustificationTruth, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module((SubLObject)tva_inference.UNPROVIDED)), thread);
                                                final SubLObject source2 = sbhl_marking_vars.sbhl_new_space_source();
                                                final SubLObject _prev_bind_0_$91 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                try {
                                                    sbhl_marking_vars.$sbhl_space$.bind((source2 == tva_inference.$kw66$OLD) ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source2), thread);
                                                    final SubLObject _prev_bind_0_$92 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                    try {
                                                        sbhl_marking_vars.$sbhl_gather_space$.bind((source2 == tva_inference.$kw66$OLD) ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source2), thread);
                                                        final SubLObject _prev_bind_0_$93 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$89 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                        final SubLObject _prev_bind_2_$88 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                        final SubLObject _prev_bind_3_$96 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                        final SubLObject _prev_bind_4_$97 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_finishedP$.bind((SubLObject)tva_inference.NIL, thread);
                                                            sbhl_search_vars.$sbhl_stop_search_pathP$.bind((SubLObject)tva_inference.NIL, thread);
                                                            sbhl_search_vars.$sbhl_search_parent_marking$.bind((SubLObject)tva_inference.NIL, thread);
                                                            sbhl_search_vars.$sbhl_nodes_previous_marking$.bind((SubLObject)tva_inference.NIL, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_inference.NIL, thread);
                                                            final SubLObject rw_lock_var2 = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                            SubLObject needs_to_releaseP2 = (SubLObject)tva_inference.NIL;
                                                            try {
                                                                needs_to_releaseP2 = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var2);
                                                                tva_mark_and_sweep(tva_asent_pred(), strategy2);
                                                            }
                                                            finally {
                                                                if (tva_inference.NIL != needs_to_releaseP2) {
                                                                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var2);
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$97, thread);
                                                            sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$96, thread);
                                                            sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$88, thread);
                                                            sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$89, thread);
                                                            sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$93, thread);
                                                        }
                                                        if (source2 == tva_inference.$kw67$RESOURCE) {
                                                            sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$92, thread);
                                                    }
                                                    if (source2 == tva_inference.$kw67$RESOURCE) {
                                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                    }
                                                }
                                                finally {
                                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$91, thread);
                                                }
                                            }
                                            finally {
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$87, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$88, thread);
                                                sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$90, thread);
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$87, thread);
                                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$89, thread);
                                        }
                                    }
                                    finally {
                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$86, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$86, thread);
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$88, thread);
                                    }
                                }
                                finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_7, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_6, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$85, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$85, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$87, thread);
                                }
                            }
                            catch (Throwable ccatch_env_var2) {
                                timed_outP = Errors.handleThrowable(ccatch_env_var2, (SubLObject)tva_inference.$kw55$TVA_MAX_TIME);
                            }
                            finally {
                                thread.throwStack.pop();
                            }
                            iterator = tva_unify_closure_iterator_int(list_utilities.fast_delete_duplicates(tva_answers(), Symbols.symbol_function((SubLObject)tva_inference.EQUAL), (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED), closure_mode);
                        }
                        finally {
                            tva_inference.$tva_inference$.rebind(_prev_bind_0_$86, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$94 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_inference.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            try {
                                resourcing_caches_finalizedP = sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                            }
                            finally {
                                final SubLObject _prev_bind_0_$95 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_inference.T, thread);
                                    final SubLObject _values_$122 = Values.getValuesAsVector();
                                    if (tva_inference.NIL == resourcing_caches_finalizedP) {
                                        sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                    }
                                    Values.restoreValuesFromVector(_values_$122);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$95, thread);
                                }
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$94, thread);
                        }
                    }
                }
                finally {
                    sksi_macros.$sksi_sql_statement_pool_lock$.rebind(_prev_bind_2_$84, thread);
                    sksi_macros.$sksi_sql_statement_cache$.rebind(_prev_bind_1_$84, thread);
                    sksi_macros.$sksi_sql_connection_cache$.rebind(_prev_bind_0_$85, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return iterator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 18132L)
    public static SubLObject tva_unify_closure_iterator_int(final SubLObject tva_answers, final SubLObject closure_mode) {
        return (tva_inference.$kw54$NONE == closure_mode) ? iteration.new_list_iterator(tva_answers) : iteration.new_iterator(tva_unify_closure_iterator_state(tva_answers, closure_mode), (SubLObject)tva_inference.$sym79$TVA_UNIFY_CLOSURE_ITERATOR_DONE, (SubLObject)tva_inference.$sym80$TVA_UNIFY_CLOSURE_ITERATOR_NEXT, (SubLObject)tva_inference.$sym81$TVA_UNIFY_CLOSURE_ITERATOR_FINALIZE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 18481L)
    public static SubLObject tva_unify_closure_iterator_state(final SubLObject tva_answers, final SubLObject closure_mode) {
        final SubLObject var_pred_direction = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)tva_inference.EQ), (SubLObject)tva_inference.UNPROVIDED);
        SubLObject cdolist_list_var = tva_var_argnums();
        SubLObject var_argnum = (SubLObject)tva_inference.NIL;
        var_argnum = cdolist_list_var.first();
        while (tva_inference.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = var_argnum;
            SubLObject var = (SubLObject)tva_inference.NIL;
            SubLObject argnum = (SubLObject)tva_inference.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_inference.$list82);
            var = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_inference.$list82);
            argnum = current.first();
            current = current.rest();
            if (tva_inference.NIL == current) {
                SubLObject csome_list_var = tva_utilities.get_tva_predicates();
                SubLObject tva_pred = (SubLObject)tva_inference.NIL;
                tva_pred = csome_list_var.first();
                while (tva_inference.NIL != csome_list_var) {
                    final SubLObject direction = tva_utilities.tva_direction_to_ghl_closure_direction(tva_utilities.tva_direction_for_tva_pred(tva_pred));
                    SubLObject cdolist_list_var_$123 = tva_utilities.tva_gather_transitive_predicates_for_arg(tva_pred, tva_asent_pred(), argnum, (SubLObject)tva_inference.NIL, (SubLObject)tva_inference.UNPROVIDED);
                    SubLObject trans_pred = (SubLObject)tva_inference.NIL;
                    trans_pred = cdolist_list_var_$123.first();
                    while (tva_inference.NIL != cdolist_list_var_$123) {
                        if (closure_mode != tva_inference.$kw78$FOCUSED || !direction.eql(ghl_search_vars.ghl_fan_out_direction(trans_pred))) {
                            dictionary_utilities.dictionary_pushnew(var_pred_direction, var, (SubLObject)ConsesLow.list(trans_pred, direction), Symbols.symbol_function((SubLObject)tva_inference.EQUAL), (SubLObject)tva_inference.UNPROVIDED);
                        }
                        cdolist_list_var_$123 = cdolist_list_var_$123.rest();
                        trans_pred = cdolist_list_var_$123.first();
                    }
                    csome_list_var = csome_list_var.rest();
                    tva_pred = csome_list_var.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_inference.$list82);
            }
            cdolist_list_var = cdolist_list_var.rest();
            var_argnum = cdolist_list_var.first();
        }
        return (SubLObject)ConsesLow.list((SubLObject)tva_inference.NIL, tva_answers, var_pred_direction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 19180L)
    public static SubLObject tva_unify_closure_iterator_done(final SubLObject state) {
        SubLObject iterator = (SubLObject)tva_inference.NIL;
        SubLObject tva_answers = (SubLObject)tva_inference.NIL;
        SubLObject var_pred_direction = (SubLObject)tva_inference.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)tva_inference.$list83);
        iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)tva_inference.$list83);
        tva_answers = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)tva_inference.$list83);
        var_pred_direction = current.first();
        current = current.rest();
        if (tva_inference.NIL == current) {
            return (SubLObject)SubLObjectFactory.makeBoolean(tva_inference.NIL == tva_answers && (tva_inference.NIL == iterator || tva_inference.NIL != iteration.iteration_done(iterator)));
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)tva_inference.$list83);
        return (SubLObject)tva_inference.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 19442L)
    public static SubLObject tva_unify_closure_iterator_next(final SubLObject state) {
        SubLObject iterator = (SubLObject)tva_inference.NIL;
        SubLObject tva_answers = (SubLObject)tva_inference.NIL;
        SubLObject var_pred_direction = (SubLObject)tva_inference.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)tva_inference.$list83);
        iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)tva_inference.$list83);
        tva_answers = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)tva_inference.$list83);
        var_pred_direction = current.first();
        current = current.rest();
        if (tva_inference.NIL == current) {
            SubLObject result = (SubLObject)tva_inference.NIL;
            SubLObject doneP = (SubLObject)tva_inference.NIL;
            while (tva_inference.NIL == result && tva_inference.NIL == doneP) {
                if (tva_inference.NIL == iterator) {
                    iterator = new_tva_unify_closure_answer_iterator(tva_answers.first(), var_pred_direction);
                    ConsesLow.set_nth((SubLObject)tva_inference.ZERO_INTEGER, state, iterator);
                    ConsesLow.set_nth((SubLObject)tva_inference.ONE_INTEGER, state, tva_answers.rest());
                    if (tva_inference.NIL != iteration.iterator_p(iterator)) {
                        continue;
                    }
                    doneP = (SubLObject)tva_inference.T;
                }
                else if (tva_inference.NIL != iteration.iteration_done(iterator)) {
                    iterator = (SubLObject)tva_inference.NIL;
                    ConsesLow.set_nth((SubLObject)tva_inference.ZERO_INTEGER, state, (SubLObject)tva_inference.NIL);
                }
                else {
                    result = iteration.iteration_next_without_values(iterator, (SubLObject)tva_inference.UNPROVIDED);
                }
            }
            return Values.values(result, state, Types.sublisp_null(result));
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)tva_inference.$list83);
        return (SubLObject)tva_inference.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 20082L)
    public static SubLObject tva_unify_closure_iterator_finalize(final SubLObject state) {
        SubLObject iterator = (SubLObject)tva_inference.NIL;
        SubLObject tva_answers = (SubLObject)tva_inference.NIL;
        SubLObject var_pred_direction = (SubLObject)tva_inference.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)tva_inference.$list83);
        iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)tva_inference.$list83);
        tva_answers = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)tva_inference.$list83);
        var_pred_direction = current.first();
        current = current.rest();
        if (tva_inference.NIL == current) {
            dictionary.clear_dictionary(var_pred_direction);
            if (tva_inference.NIL != iterator) {
                iteration.iteration_finalize(iterator);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)tva_inference.$list83);
        }
        return (SubLObject)tva_inference.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 20352L)
    public static SubLObject new_tva_unify_closure_answer_iterator(final SubLObject tva_answer, final SubLObject var_pred_direction) {
        SubLObject v_bindings = (SubLObject)tva_inference.NIL;
        SubLObject support = (SubLObject)tva_inference.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(tva_answer, tva_answer, (SubLObject)tva_inference.$list84);
        v_bindings = tva_answer.first();
        SubLObject current = tva_answer.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, tva_answer, (SubLObject)tva_inference.$list84);
        support = current.first();
        current = current.rest();
        if (tva_inference.NIL == current) {
            final SubLObject iterators = new_tva_unify_closure_bindings_iterators(v_bindings, var_pred_direction);
            return iteration.new_reusable_iterator_cartesian_iterator(iterators);
        }
        cdestructuring_bind.cdestructuring_bind_error(tva_answer, (SubLObject)tva_inference.$list84);
        return (SubLObject)tva_inference.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 20677L)
    public static SubLObject new_tva_unify_closure_bindings_iterators(final SubLObject v_bindings, final SubLObject var_pred_direction) {
        SubLObject iterators = (SubLObject)tva_inference.NIL;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = (SubLObject)tva_inference.NIL;
        binding = cdolist_list_var.first();
        while (tva_inference.NIL != cdolist_list_var) {
            final SubLObject var = bindings.variable_binding_variable(binding);
            final SubLObject value = bindings.variable_binding_value(binding);
            SubLObject var_iterators = (SubLObject)tva_inference.NIL;
            SubLObject cdolist_list_var_$124 = dictionary.dictionary_lookup_without_values(var_pred_direction, var, (SubLObject)tva_inference.UNPROVIDED);
            SubLObject pred_direction = (SubLObject)tva_inference.NIL;
            pred_direction = cdolist_list_var_$124.first();
            while (tva_inference.NIL != cdolist_list_var_$124) {
                SubLObject current;
                final SubLObject datum = current = pred_direction;
                SubLObject pred = (SubLObject)tva_inference.NIL;
                SubLObject direction = (SubLObject)tva_inference.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_inference.$list85);
                pred = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_inference.$list85);
                direction = current.first();
                current = current.rest();
                if (tva_inference.NIL == current) {
                    final SubLObject closure_iterator = ghl_search_methods.new_ghl_closure_iterator(pred, value, direction, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED, (SubLObject)tva_inference.UNPROVIDED);
                    final SubLObject bindings_iterator = new_tva_unify_closure_var_bindings_iterator(var, closure_iterator);
                    var_iterators = (SubLObject)ConsesLow.cons(bindings_iterator, var_iterators);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_inference.$list85);
                }
                cdolist_list_var_$124 = cdolist_list_var_$124.rest();
                pred_direction = cdolist_list_var_$124.first();
            }
            var_iterators = (SubLObject)ConsesLow.cons(iteration.new_singleton_iterator(binding), var_iterators);
            final SubLObject var_iterator_iterator = iteration.new_rotating_iterator_iterator(var_iterators);
            final SubLObject var_reusable_iterator = iteration.new_reusable_iterator_from_iterator(var_iterator_iterator);
            iterators = (SubLObject)ConsesLow.cons(var_reusable_iterator, iterators);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return Sequences.nreverse(iterators);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 21615L)
    public static SubLObject new_tva_unify_closure_var_bindings_iterator(final SubLObject var, final SubLObject iterator) {
        return iteration.new_iterator((SubLObject)ConsesLow.list(var, iterator), (SubLObject)tva_inference.$sym86$TVA_UNIFY_CLOSURE_VAR_BINDINGS_ITERATOR_DONE, (SubLObject)tva_inference.$sym87$TVA_UNIFY_CLOSURE_VAR_BINDINGS_ITERATOR_NEXT, (SubLObject)tva_inference.$sym88$TVA_UNIFY_CLOSURE_VAR_BINDINGS_ITERATOR_FINALIZE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 21898L)
    public static SubLObject tva_unify_closure_var_bindings_iterator_done(final SubLObject state) {
        SubLObject var = (SubLObject)tva_inference.NIL;
        SubLObject iterator = (SubLObject)tva_inference.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)tva_inference.$list89);
        var = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)tva_inference.$list89);
        iterator = current.first();
        current = current.rest();
        if (tva_inference.NIL == current) {
            return iteration.iteration_done(iterator);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)tva_inference.$list89);
        return (SubLObject)tva_inference.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 22069L)
    public static SubLObject tva_unify_closure_var_bindings_iterator_next(final SubLObject state) {
        SubLObject var = (SubLObject)tva_inference.NIL;
        SubLObject iterator = (SubLObject)tva_inference.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)tva_inference.$list89);
        var = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)tva_inference.$list89);
        iterator = current.first();
        current = current.rest();
        if (tva_inference.NIL == current) {
            final SubLObject value = iteration.iteration_next_without_values(iterator, (SubLObject)tva_inference.UNPROVIDED);
            return (tva_inference.NIL != value) ? Values.values(bindings.make_variable_binding(var, value), state, (SubLObject)tva_inference.NIL) : Values.values((SubLObject)tva_inference.NIL, state, (SubLObject)tva_inference.T);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)tva_inference.$list89);
        return (SubLObject)tva_inference.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-inference.lisp", position = 22351L)
    public static SubLObject tva_unify_closure_var_bindings_iterator_finalize(final SubLObject state) {
        SubLObject var = (SubLObject)tva_inference.NIL;
        SubLObject iterator = (SubLObject)tva_inference.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)tva_inference.$list89);
        var = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)tva_inference.$list89);
        iterator = current.first();
        current = current.rest();
        if (tva_inference.NIL == current) {
            return iteration.iteration_finalize(iterator);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)tva_inference.$list89);
        return (SubLObject)tva_inference.NIL;
    }
    
    public static SubLObject declare_tva_inference_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_inference_print_function_trampoline", "TVA-INFERENCE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_inference_p", "TVA-INFERENCE-P", 1, 0, false);
        new $tva_inference_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_inf_problem", "TVA-INF-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_inf_asent_pred", "TVA-INF-ASENT-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_inf_asent_args", "TVA-INF-ASENT-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_inf_args_admitted", "TVA-INF-ARGS-ADMITTED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_inf_term_argnums", "TVA-INF-TERM-ARGNUMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_inf_var_argnums", "TVA-INF-VAR-ARGNUMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_inf_precomputations", "TVA-INF-PRECOMPUTATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_inf_reused_spaces", "TVA-INF-REUSED-SPACES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_inf_one_answerP", "TVA-INF-ONE-ANSWER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_inf_justifyP", "TVA-INF-JUSTIFY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_inf_restricted_assertion", "TVA-INF-RESTRICTED-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_inf_answers", "TVA-INF-ANSWERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "_csetf_tva_inf_problem", "_CSETF-TVA-INF-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "_csetf_tva_inf_asent_pred", "_CSETF-TVA-INF-ASENT-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "_csetf_tva_inf_asent_args", "_CSETF-TVA-INF-ASENT-ARGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "_csetf_tva_inf_args_admitted", "_CSETF-TVA-INF-ARGS-ADMITTED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "_csetf_tva_inf_term_argnums", "_CSETF-TVA-INF-TERM-ARGNUMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "_csetf_tva_inf_var_argnums", "_CSETF-TVA-INF-VAR-ARGNUMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "_csetf_tva_inf_precomputations", "_CSETF-TVA-INF-PRECOMPUTATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "_csetf_tva_inf_reused_spaces", "_CSETF-TVA-INF-REUSED-SPACES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "_csetf_tva_inf_one_answerP", "_CSETF-TVA-INF-ONE-ANSWER?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "_csetf_tva_inf_justifyP", "_CSETF-TVA-INF-JUSTIFY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "_csetf_tva_inf_restricted_assertion", "_CSETF-TVA-INF-RESTRICTED-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "_csetf_tva_inf_answers", "_CSETF-TVA-INF-ANSWERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "make_tva_inference", "MAKE-TVA-INFERENCE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "visit_defstruct_tva_inference", "VISIT-DEFSTRUCT-TVA-INFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "visit_defstruct_object_tva_inference_method", "VISIT-DEFSTRUCT-OBJECT-TVA-INFERENCE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "print_tva_inference", "PRINT-TVA-INFERENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "initialize_tva_inference", "INITIALIZE-TVA-INFERENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_inference_asent_pred", "TVA-INFERENCE-ASENT-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_inference_asent_args", "TVA-INFERENCE-ASENT-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_inference_args_admitted", "TVA-INFERENCE-ARGS-ADMITTED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_inference_term_argnums", "TVA-INFERENCE-TERM-ARGNUMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_inference_var_argnums", "TVA-INFERENCE-VAR-ARGNUMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_inference_precomputations", "TVA-INFERENCE-PRECOMPUTATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_inference_reused_spaces", "TVA-INFERENCE-REUSED-SPACES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_inference_justifyP", "TVA-INFERENCE-JUSTIFY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_inference_one_answerP", "TVA-INFERENCE-ONE-ANSWER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_inference_restricted_assertion", "TVA-INFERENCE-RESTRICTED-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_inference_answers", "TVA-INFERENCE-ANSWERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_inference_asent_arg", "TVA-INFERENCE-ASENT-ARG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_inference_arg_admitted", "TVA-INFERENCE-ARG-ADMITTED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "store_tva_inference_precomputation", "STORE-TVA-INFERENCE-PRECOMPUTATION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "store_tva_inference_reused_spaces", "STORE-TVA-INFERENCE-REUSED-SPACES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "set_tva_inference_arg_admitted", "SET-TVA-INFERENCE-ARG-ADMITTED", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.tva_inference", "with_new_tva_inference", "WITH-NEW-TVA-INFERENCE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_asent_pred", "TVA-ASENT-PRED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_var_argnums", "TVA-VAR-ARGNUMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_var_argnum", "TVA-VAR-ARGNUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_term_argnums", "TVA-TERM-ARGNUMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_asent_arg", "TVA-ASENT-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_asent_arg_admitted", "TVA-ASENT-ARG-ADMITTED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "set_tva_asent_arg_admitted", "SET-TVA-ASENT-ARG-ADMITTED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "set_tva_asent_arg_failed", "SET-TVA-ASENT-ARG-FAILED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_return_one_answerP", "TVA-RETURN-ONE-ANSWER?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_compute_justificationsP", "TVA-COMPUTE-JUSTIFICATIONS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_tactic_precomputations", "TVA-TACTIC-PRECOMPUTATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_store_precomputation", "TVA-STORE-PRECOMPUTATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_restricted_assertion_p", "TVA-RESTRICTED-ASSERTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_reused_spaces", "TVA-REUSED-SPACES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_store_reused_spaces", "TVA-STORE-REUSED-SPACES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_reused_spaces_for_relation", "TVA-REUSED-SPACES-FOR-RELATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_answers", "TVA-ANSWERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "add_to_tva_answers", "ADD-TO-TVA-ANSWERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "determine_term_argnums", "DETERMINE-TERM-ARGNUMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "determine_var_argnums", "DETERMINE-VAR-ARGNUMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "determine_restricted_assertion", "DETERMINE-RESTRICTED-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "initialize_tva_asent_vector", "INITIALIZE-TVA-ASENT-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "initialize_tva_args_admitted_vector", "INITIALIZE-TVA-ARGS-ADMITTED-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_unify", "TVA-UNIFY", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_unify_from_cache", "TVA-UNIFY-FROM-CACHE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_unify_closure", "TVA-UNIFY-CLOSURE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_marked_p", "TVA-MARKED-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_mark_node_marked", "TVA-MARK-NODE-MARKED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_mark_and_sweep", "TVA-MARK-AND-SWEEP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_unify_closure_iterator", "TVA-UNIFY-CLOSURE-ITERATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_unify_closure_iterator_int", "TVA-UNIFY-CLOSURE-ITERATOR-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_unify_closure_iterator_state", "TVA-UNIFY-CLOSURE-ITERATOR-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_unify_closure_iterator_done", "TVA-UNIFY-CLOSURE-ITERATOR-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_unify_closure_iterator_next", "TVA-UNIFY-CLOSURE-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_unify_closure_iterator_finalize", "TVA-UNIFY-CLOSURE-ITERATOR-FINALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "new_tva_unify_closure_answer_iterator", "NEW-TVA-UNIFY-CLOSURE-ANSWER-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "new_tva_unify_closure_bindings_iterators", "NEW-TVA-UNIFY-CLOSURE-BINDINGS-ITERATORS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "new_tva_unify_closure_var_bindings_iterator", "NEW-TVA-UNIFY-CLOSURE-VAR-BINDINGS-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_unify_closure_var_bindings_iterator_done", "TVA-UNIFY-CLOSURE-VAR-BINDINGS-ITERATOR-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_unify_closure_var_bindings_iterator_next", "TVA-UNIFY-CLOSURE-VAR-BINDINGS-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_inference", "tva_unify_closure_var_bindings_iterator_finalize", "TVA-UNIFY-CLOSURE-VAR-BINDINGS-ITERATOR-FINALIZE", 1, 0, false);
        return (SubLObject)tva_inference.NIL;
    }
    
    public static SubLObject init_tva_inference_file() {
        tva_inference.$tva_max_time_enabledP$ = SubLFiles.deflexical("*TVA-MAX-TIME-ENABLED?*", (SubLObject)tva_inference.T);
        tva_inference.$dtp_tva_inference$ = SubLFiles.defconstant("*DTP-TVA-INFERENCE*", (SubLObject)tva_inference.$sym0$TVA_INFERENCE);
        tva_inference.$tva_inference$ = SubLFiles.defparameter("*TVA-INFERENCE*", (SubLObject)tva_inference.NIL);
        tva_inference.$tva_reuse_spacesP$ = SubLFiles.defparameter("*TVA-REUSE-SPACES?*", (SubLObject)tva_inference.NIL);
        return (SubLObject)tva_inference.NIL;
    }
    
    public static SubLObject setup_tva_inference_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), tva_inference.$dtp_tva_inference$.getGlobalValue(), Symbols.symbol_function((SubLObject)tva_inference.$sym7$TVA_INFERENCE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)tva_inference.$list8);
        Structures.def_csetf((SubLObject)tva_inference.$sym9$TVA_INF_PROBLEM, (SubLObject)tva_inference.$sym10$_CSETF_TVA_INF_PROBLEM);
        Structures.def_csetf((SubLObject)tva_inference.$sym11$TVA_INF_ASENT_PRED, (SubLObject)tva_inference.$sym12$_CSETF_TVA_INF_ASENT_PRED);
        Structures.def_csetf((SubLObject)tva_inference.$sym13$TVA_INF_ASENT_ARGS, (SubLObject)tva_inference.$sym14$_CSETF_TVA_INF_ASENT_ARGS);
        Structures.def_csetf((SubLObject)tva_inference.$sym15$TVA_INF_ARGS_ADMITTED, (SubLObject)tva_inference.$sym16$_CSETF_TVA_INF_ARGS_ADMITTED);
        Structures.def_csetf((SubLObject)tva_inference.$sym17$TVA_INF_TERM_ARGNUMS, (SubLObject)tva_inference.$sym18$_CSETF_TVA_INF_TERM_ARGNUMS);
        Structures.def_csetf((SubLObject)tva_inference.$sym19$TVA_INF_VAR_ARGNUMS, (SubLObject)tva_inference.$sym20$_CSETF_TVA_INF_VAR_ARGNUMS);
        Structures.def_csetf((SubLObject)tva_inference.$sym21$TVA_INF_PRECOMPUTATIONS, (SubLObject)tva_inference.$sym22$_CSETF_TVA_INF_PRECOMPUTATIONS);
        Structures.def_csetf((SubLObject)tva_inference.$sym23$TVA_INF_REUSED_SPACES, (SubLObject)tva_inference.$sym24$_CSETF_TVA_INF_REUSED_SPACES);
        Structures.def_csetf((SubLObject)tva_inference.$sym25$TVA_INF_ONE_ANSWER_, (SubLObject)tva_inference.$sym26$_CSETF_TVA_INF_ONE_ANSWER_);
        Structures.def_csetf((SubLObject)tva_inference.$sym27$TVA_INF_JUSTIFY_, (SubLObject)tva_inference.$sym28$_CSETF_TVA_INF_JUSTIFY_);
        Structures.def_csetf((SubLObject)tva_inference.$sym29$TVA_INF_RESTRICTED_ASSERTION, (SubLObject)tva_inference.$sym30$_CSETF_TVA_INF_RESTRICTED_ASSERTION);
        Structures.def_csetf((SubLObject)tva_inference.$sym31$TVA_INF_ANSWERS, (SubLObject)tva_inference.$sym32$_CSETF_TVA_INF_ANSWERS);
        Equality.identity((SubLObject)tva_inference.$sym0$TVA_INFERENCE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), tva_inference.$dtp_tva_inference$.getGlobalValue(), Symbols.symbol_function((SubLObject)tva_inference.$sym50$VISIT_DEFSTRUCT_OBJECT_TVA_INFERENCE_METHOD));
        return (SubLObject)tva_inference.NIL;
    }
    
    public void declareFunctions() {
        declare_tva_inference_file();
    }
    
    public void initializeVariables() {
        init_tva_inference_file();
    }
    
    public void runTopLevelForms() {
        setup_tva_inference_file();
    }
    
    static {
        me = (SubLFile)new tva_inference();
        tva_inference.$tva_max_time_enabledP$ = null;
        tva_inference.$dtp_tva_inference$ = null;
        tva_inference.$tva_inference$ = null;
        tva_inference.$tva_reuse_spacesP$ = null;
        $sym0$TVA_INFERENCE = SubLObjectFactory.makeSymbol("TVA-INFERENCE");
        $sym1$TVA_INFERENCE_P = SubLObjectFactory.makeSymbol("TVA-INFERENCE-P");
        $list2 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("PROBLEM"), SubLObjectFactory.makeSymbol("ASENT-PRED"), SubLObjectFactory.makeSymbol("ASENT-ARGS"), SubLObjectFactory.makeSymbol("ARGS-ADMITTED"), SubLObjectFactory.makeSymbol("TERM-ARGNUMS"), SubLObjectFactory.makeSymbol("VAR-ARGNUMS"), SubLObjectFactory.makeSymbol("PRECOMPUTATIONS"), SubLObjectFactory.makeSymbol("REUSED-SPACES"), SubLObjectFactory.makeSymbol("ONE-ANSWER?"), SubLObjectFactory.makeSymbol("JUSTIFY?"), SubLObjectFactory.makeSymbol("RESTRICTED-ASSERTION"), SubLObjectFactory.makeSymbol("ANSWERS") });
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PROBLEM"), SubLObjectFactory.makeKeyword("ASENT-PRED"), SubLObjectFactory.makeKeyword("ASENT-ARGS"), SubLObjectFactory.makeKeyword("ARGS-ADMITTED"), SubLObjectFactory.makeKeyword("TERM-ARGNUMS"), SubLObjectFactory.makeKeyword("VAR-ARGNUMS"), SubLObjectFactory.makeKeyword("PRECOMPUTATIONS"), SubLObjectFactory.makeKeyword("REUSED-SPACES"), SubLObjectFactory.makeKeyword("ONE-ANSWER?"), SubLObjectFactory.makeKeyword("JUSTIFY?"), SubLObjectFactory.makeKeyword("RESTRICTED-ASSERTION"), SubLObjectFactory.makeKeyword("ANSWERS") });
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("TVA-INF-PROBLEM"), SubLObjectFactory.makeSymbol("TVA-INF-ASENT-PRED"), SubLObjectFactory.makeSymbol("TVA-INF-ASENT-ARGS"), SubLObjectFactory.makeSymbol("TVA-INF-ARGS-ADMITTED"), SubLObjectFactory.makeSymbol("TVA-INF-TERM-ARGNUMS"), SubLObjectFactory.makeSymbol("TVA-INF-VAR-ARGNUMS"), SubLObjectFactory.makeSymbol("TVA-INF-PRECOMPUTATIONS"), SubLObjectFactory.makeSymbol("TVA-INF-REUSED-SPACES"), SubLObjectFactory.makeSymbol("TVA-INF-ONE-ANSWER?"), SubLObjectFactory.makeSymbol("TVA-INF-JUSTIFY?"), SubLObjectFactory.makeSymbol("TVA-INF-RESTRICTED-ASSERTION"), SubLObjectFactory.makeSymbol("TVA-INF-ANSWERS") });
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-TVA-INF-PROBLEM"), SubLObjectFactory.makeSymbol("_CSETF-TVA-INF-ASENT-PRED"), SubLObjectFactory.makeSymbol("_CSETF-TVA-INF-ASENT-ARGS"), SubLObjectFactory.makeSymbol("_CSETF-TVA-INF-ARGS-ADMITTED"), SubLObjectFactory.makeSymbol("_CSETF-TVA-INF-TERM-ARGNUMS"), SubLObjectFactory.makeSymbol("_CSETF-TVA-INF-VAR-ARGNUMS"), SubLObjectFactory.makeSymbol("_CSETF-TVA-INF-PRECOMPUTATIONS"), SubLObjectFactory.makeSymbol("_CSETF-TVA-INF-REUSED-SPACES"), SubLObjectFactory.makeSymbol("_CSETF-TVA-INF-ONE-ANSWER?"), SubLObjectFactory.makeSymbol("_CSETF-TVA-INF-JUSTIFY?"), SubLObjectFactory.makeSymbol("_CSETF-TVA-INF-RESTRICTED-ASSERTION"), SubLObjectFactory.makeSymbol("_CSETF-TVA-INF-ANSWERS") });
        $sym6$PRINT_TVA_INFERENCE = SubLObjectFactory.makeSymbol("PRINT-TVA-INFERENCE");
        $sym7$TVA_INFERENCE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("TVA-INFERENCE-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("TVA-INFERENCE-P"));
        $sym9$TVA_INF_PROBLEM = SubLObjectFactory.makeSymbol("TVA-INF-PROBLEM");
        $sym10$_CSETF_TVA_INF_PROBLEM = SubLObjectFactory.makeSymbol("_CSETF-TVA-INF-PROBLEM");
        $sym11$TVA_INF_ASENT_PRED = SubLObjectFactory.makeSymbol("TVA-INF-ASENT-PRED");
        $sym12$_CSETF_TVA_INF_ASENT_PRED = SubLObjectFactory.makeSymbol("_CSETF-TVA-INF-ASENT-PRED");
        $sym13$TVA_INF_ASENT_ARGS = SubLObjectFactory.makeSymbol("TVA-INF-ASENT-ARGS");
        $sym14$_CSETF_TVA_INF_ASENT_ARGS = SubLObjectFactory.makeSymbol("_CSETF-TVA-INF-ASENT-ARGS");
        $sym15$TVA_INF_ARGS_ADMITTED = SubLObjectFactory.makeSymbol("TVA-INF-ARGS-ADMITTED");
        $sym16$_CSETF_TVA_INF_ARGS_ADMITTED = SubLObjectFactory.makeSymbol("_CSETF-TVA-INF-ARGS-ADMITTED");
        $sym17$TVA_INF_TERM_ARGNUMS = SubLObjectFactory.makeSymbol("TVA-INF-TERM-ARGNUMS");
        $sym18$_CSETF_TVA_INF_TERM_ARGNUMS = SubLObjectFactory.makeSymbol("_CSETF-TVA-INF-TERM-ARGNUMS");
        $sym19$TVA_INF_VAR_ARGNUMS = SubLObjectFactory.makeSymbol("TVA-INF-VAR-ARGNUMS");
        $sym20$_CSETF_TVA_INF_VAR_ARGNUMS = SubLObjectFactory.makeSymbol("_CSETF-TVA-INF-VAR-ARGNUMS");
        $sym21$TVA_INF_PRECOMPUTATIONS = SubLObjectFactory.makeSymbol("TVA-INF-PRECOMPUTATIONS");
        $sym22$_CSETF_TVA_INF_PRECOMPUTATIONS = SubLObjectFactory.makeSymbol("_CSETF-TVA-INF-PRECOMPUTATIONS");
        $sym23$TVA_INF_REUSED_SPACES = SubLObjectFactory.makeSymbol("TVA-INF-REUSED-SPACES");
        $sym24$_CSETF_TVA_INF_REUSED_SPACES = SubLObjectFactory.makeSymbol("_CSETF-TVA-INF-REUSED-SPACES");
        $sym25$TVA_INF_ONE_ANSWER_ = SubLObjectFactory.makeSymbol("TVA-INF-ONE-ANSWER?");
        $sym26$_CSETF_TVA_INF_ONE_ANSWER_ = SubLObjectFactory.makeSymbol("_CSETF-TVA-INF-ONE-ANSWER?");
        $sym27$TVA_INF_JUSTIFY_ = SubLObjectFactory.makeSymbol("TVA-INF-JUSTIFY?");
        $sym28$_CSETF_TVA_INF_JUSTIFY_ = SubLObjectFactory.makeSymbol("_CSETF-TVA-INF-JUSTIFY?");
        $sym29$TVA_INF_RESTRICTED_ASSERTION = SubLObjectFactory.makeSymbol("TVA-INF-RESTRICTED-ASSERTION");
        $sym30$_CSETF_TVA_INF_RESTRICTED_ASSERTION = SubLObjectFactory.makeSymbol("_CSETF-TVA-INF-RESTRICTED-ASSERTION");
        $sym31$TVA_INF_ANSWERS = SubLObjectFactory.makeSymbol("TVA-INF-ANSWERS");
        $sym32$_CSETF_TVA_INF_ANSWERS = SubLObjectFactory.makeSymbol("_CSETF-TVA-INF-ANSWERS");
        $kw33$PROBLEM = SubLObjectFactory.makeKeyword("PROBLEM");
        $kw34$ASENT_PRED = SubLObjectFactory.makeKeyword("ASENT-PRED");
        $kw35$ASENT_ARGS = SubLObjectFactory.makeKeyword("ASENT-ARGS");
        $kw36$ARGS_ADMITTED = SubLObjectFactory.makeKeyword("ARGS-ADMITTED");
        $kw37$TERM_ARGNUMS = SubLObjectFactory.makeKeyword("TERM-ARGNUMS");
        $kw38$VAR_ARGNUMS = SubLObjectFactory.makeKeyword("VAR-ARGNUMS");
        $kw39$PRECOMPUTATIONS = SubLObjectFactory.makeKeyword("PRECOMPUTATIONS");
        $kw40$REUSED_SPACES = SubLObjectFactory.makeKeyword("REUSED-SPACES");
        $kw41$ONE_ANSWER_ = SubLObjectFactory.makeKeyword("ONE-ANSWER?");
        $kw42$JUSTIFY_ = SubLObjectFactory.makeKeyword("JUSTIFY?");
        $kw43$RESTRICTED_ASSERTION = SubLObjectFactory.makeKeyword("RESTRICTED-ASSERTION");
        $kw44$ANSWERS = SubLObjectFactory.makeKeyword("ANSWERS");
        $str45$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw46$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym47$MAKE_TVA_INFERENCE = SubLObjectFactory.makeSymbol("MAKE-TVA-INFERENCE");
        $kw48$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw49$END = SubLObjectFactory.makeKeyword("END");
        $sym50$VISIT_DEFSTRUCT_OBJECT_TVA_INFERENCE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-TVA-INFERENCE-METHOD");
        $sym51$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list52 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*TVA-INFERENCE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-TVA-INFERENCE"))));
        $kw53$FAIL = SubLObjectFactory.makeKeyword("FAIL");
        $kw54$NONE = SubLObjectFactory.makeKeyword("NONE");
        $kw55$TVA_MAX_TIME = SubLObjectFactory.makeKeyword("TVA-MAX-TIME");
        $const56$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $sym57$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw58$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str59$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym60$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw61$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str62$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw63$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str64$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $const65$True_JustificationTruth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $kw66$OLD = SubLObjectFactory.makeKeyword("OLD");
        $kw67$RESOURCE = SubLObjectFactory.makeKeyword("RESOURCE");
        $str68$SKSI_SQL_statement_cache_ = SubLObjectFactory.makeString("SKSI SQL statement cache ");
        $kw69$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $kw70$STACK = SubLObjectFactory.makeKeyword("STACK");
        $kw71$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $str72$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str73$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str74$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $kw75$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $list76 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARG-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"));
        $list77 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"));
        $kw78$FOCUSED = SubLObjectFactory.makeKeyword("FOCUSED");
        $sym79$TVA_UNIFY_CLOSURE_ITERATOR_DONE = SubLObjectFactory.makeSymbol("TVA-UNIFY-CLOSURE-ITERATOR-DONE");
        $sym80$TVA_UNIFY_CLOSURE_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("TVA-UNIFY-CLOSURE-ITERATOR-NEXT");
        $sym81$TVA_UNIFY_CLOSURE_ITERATOR_FINALIZE = SubLObjectFactory.makeSymbol("TVA-UNIFY-CLOSURE-ITERATOR-FINALIZE");
        $list82 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ARGNUM"));
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("TVA-ANSWERS"), (SubLObject)SubLObjectFactory.makeSymbol("VAR-PRED-DIRECTION"));
        $list84 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORT"));
        $list85 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"));
        $sym86$TVA_UNIFY_CLOSURE_VAR_BINDINGS_ITERATOR_DONE = SubLObjectFactory.makeSymbol("TVA-UNIFY-CLOSURE-VAR-BINDINGS-ITERATOR-DONE");
        $sym87$TVA_UNIFY_CLOSURE_VAR_BINDINGS_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("TVA-UNIFY-CLOSURE-VAR-BINDINGS-ITERATOR-NEXT");
        $sym88$TVA_UNIFY_CLOSURE_VAR_BINDINGS_ITERATOR_FINALIZE = SubLObjectFactory.makeSymbol("TVA-UNIFY-CLOSURE-VAR-BINDINGS-ITERATOR-FINALIZE");
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ITERATOR"));
    }
    
    public static final class $tva_inference_native extends SubLStructNative
    {
        public SubLObject $problem;
        public SubLObject $asent_pred;
        public SubLObject $asent_args;
        public SubLObject $args_admitted;
        public SubLObject $term_argnums;
        public SubLObject $var_argnums;
        public SubLObject $precomputations;
        public SubLObject $reused_spaces;
        public SubLObject $one_answerP;
        public SubLObject $justifyP;
        public SubLObject $restricted_assertion;
        public SubLObject $answers;
        private static final SubLStructDeclNative structDecl;
        
        public $tva_inference_native() {
            this.$problem = (SubLObject)CommonSymbols.NIL;
            this.$asent_pred = (SubLObject)CommonSymbols.NIL;
            this.$asent_args = (SubLObject)CommonSymbols.NIL;
            this.$args_admitted = (SubLObject)CommonSymbols.NIL;
            this.$term_argnums = (SubLObject)CommonSymbols.NIL;
            this.$var_argnums = (SubLObject)CommonSymbols.NIL;
            this.$precomputations = (SubLObject)CommonSymbols.NIL;
            this.$reused_spaces = (SubLObject)CommonSymbols.NIL;
            this.$one_answerP = (SubLObject)CommonSymbols.NIL;
            this.$justifyP = (SubLObject)CommonSymbols.NIL;
            this.$restricted_assertion = (SubLObject)CommonSymbols.NIL;
            this.$answers = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$tva_inference_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$problem;
        }
        
        public SubLObject getField3() {
            return this.$asent_pred;
        }
        
        public SubLObject getField4() {
            return this.$asent_args;
        }
        
        public SubLObject getField5() {
            return this.$args_admitted;
        }
        
        public SubLObject getField6() {
            return this.$term_argnums;
        }
        
        public SubLObject getField7() {
            return this.$var_argnums;
        }
        
        public SubLObject getField8() {
            return this.$precomputations;
        }
        
        public SubLObject getField9() {
            return this.$reused_spaces;
        }
        
        public SubLObject getField10() {
            return this.$one_answerP;
        }
        
        public SubLObject getField11() {
            return this.$justifyP;
        }
        
        public SubLObject getField12() {
            return this.$restricted_assertion;
        }
        
        public SubLObject getField13() {
            return this.$answers;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$problem = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$asent_pred = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$asent_args = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$args_admitted = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$term_argnums = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$var_argnums = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$precomputations = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$reused_spaces = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$one_answerP = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$justifyP = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$restricted_assertion = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$answers = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$tva_inference_native.class, tva_inference.$sym0$TVA_INFERENCE, tva_inference.$sym1$TVA_INFERENCE_P, tva_inference.$list2, tva_inference.$list3, new String[] { "$problem", "$asent_pred", "$asent_args", "$args_admitted", "$term_argnums", "$var_argnums", "$precomputations", "$reused_spaces", "$one_answerP", "$justifyP", "$restricted_assertion", "$answers" }, tva_inference.$list4, tva_inference.$list5, tva_inference.$sym6$PRINT_TVA_INFERENCE);
        }
    }
    
    public static final class $tva_inference_p$UnaryFunction extends UnaryFunction
    {
        public $tva_inference_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TVA-INFERENCE-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return tva_inference.tva_inference_p(arg1);
        }
    }
}

/*

	Total time: 3011 ms
	
*/