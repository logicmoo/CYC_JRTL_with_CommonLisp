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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import java.util.Map;
import java.util.Iterator;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_tva_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
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

public final class tva_tactic extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.tva_tactic";
    public static final String myFingerPrint = "496cb1a0401c0134a143dc69e465a12deed523264d359953f8e1f9feba42d7c6";
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 980L)
    public static SubLSymbol $dtp_tva_tactic$;
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 7112L)
    private static SubLSymbol $tva_tactic_types$;
    private static final SubLSymbol $sym0$TVA_TACTIC;
    private static final SubLSymbol $sym1$TVA_TACTIC_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_TVA_TACTIC;
    private static final SubLSymbol $sym7$TVA_TACTIC_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$TVA_TYPE;
    private static final SubLSymbol $sym10$_CSETF_TVA_TYPE;
    private static final SubLSymbol $sym11$TVA_TVA_PRED;
    private static final SubLSymbol $sym12$_CSETF_TVA_TVA_PRED;
    private static final SubLSymbol $sym13$TVA_INDEX_PRED;
    private static final SubLSymbol $sym14$_CSETF_TVA_INDEX_PRED;
    private static final SubLSymbol $sym15$TVA_TRANSITIVE_PRED;
    private static final SubLSymbol $sym16$_CSETF_TVA_TRANSITIVE_PRED;
    private static final SubLSymbol $sym17$TVA_ARGNUM;
    private static final SubLSymbol $sym18$_CSETF_TVA_ARGNUM;
    private static final SubLSymbol $sym19$TVA_TERM;
    private static final SubLSymbol $sym20$_CSETF_TVA_TERM;
    private static final SubLSymbol $sym21$TVA_COST;
    private static final SubLSymbol $sym22$_CSETF_TVA_COST;
    private static final SubLSymbol $sym23$TVA_PRECOMPUTATION;
    private static final SubLSymbol $sym24$_CSETF_TVA_PRECOMPUTATION;
    private static final SubLSymbol $sym25$TVA_PARENT_PRED;
    private static final SubLSymbol $sym26$_CSETF_TVA_PARENT_PRED;
    private static final SubLSymbol $sym27$TVA_PARENT_PRED_INVERSE_;
    private static final SubLSymbol $sym28$_CSETF_TVA_PARENT_PRED_INVERSE_;
    private static final SubLSymbol $kw29$TYPE;
    private static final SubLSymbol $kw30$TVA_PRED;
    private static final SubLSymbol $kw31$INDEX_PRED;
    private static final SubLSymbol $kw32$TRANSITIVE_PRED;
    private static final SubLSymbol $kw33$ARGNUM;
    private static final SubLSymbol $kw34$TERM;
    private static final SubLSymbol $kw35$COST;
    private static final SubLSymbol $kw36$PRECOMPUTATION;
    private static final SubLSymbol $kw37$PARENT_PRED;
    private static final SubLSymbol $kw38$PARENT_PRED_INVERSE_;
    private static final SubLString $str39$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw40$BEGIN;
    private static final SubLSymbol $sym41$MAKE_TVA_TACTIC;
    private static final SubLSymbol $kw42$SLOT;
    private static final SubLSymbol $kw43$END;
    private static final SubLSymbol $sym44$VISIT_DEFSTRUCT_OBJECT_TVA_TACTIC_METHOD;
    private static final SubLString $str45$tva_pred____a__;
    private static final SubLString $str46$tva_index_pred____a__;
    private static final SubLString $str47$tva_transitive_pred____a__;
    private static final SubLString $str48$tva_argnum____a__;
    private static final SubLString $str49$tva_term____S__;
    private static final SubLString $str50$tva_cost____a__;
    private static final SubLString $str51$tva_tactic_type____a__;
    private static final SubLString $str52$tva_precomputation____a__;
    private static final SubLString $str53$tva_parent_pred____a__;
    private static final SubLString $str54$tva_parent_pred_inverse_____a;
    private static final SubLSymbol $kw55$FREE;
    private static final SubLSymbol $kw56$FORWARD;
    private static final SubLList $list57;
    private static final SubLSymbol $sym58$MARKING_VAR;
    private static final SubLSymbol $sym59$DO_SBHL_TABLE;
    private static final SubLSymbol $sym60$TVA_TACTIC_PRECOMPUTATION;
    private static final SubLSymbol $sym61$IGNORE;
    private static final SubLSymbol $sym62$TVA_PRECOMPUTATION_P;
    private static final SubLList $list63;
    private static final SubLSymbol $kw64$LOOKUP;
    private static final SubLSymbol $kw65$PRECOMPUTED_CLOSURE;
    private static final SubLSymbol $kw66$CALCULATE_CLOSURE;
    private static final SubLSymbol $kw67$PREDICATE_EXTENT;
    private static final SubLObject $const68$transitiveViaArg;
    private static final SubLObject $const69$conservativeViaArg;
    private static final SubLObject $const70$transitiveViaArgInverse;
    private static final SubLObject $const71$conservativeViaArgInverse;
    private static final SubLObject $const72$genlPreds;
    private static final SubLObject $const73$genlInverse;
    private static final SubLString $str74$Continue_;
    private static final SubLString $str75$Error_in_predicate__a;
    private static final SubLSymbol $kw76$BACKWARD;
    private static final SubLString $str77$Error_in_direction__a;
    private static final SubLList $list78;
    private static final SubLSymbol $sym79$PROGN;
    private static final SubLSymbol $sym80$CLET;
    private static final SubLSymbol $sym81$DO_GAF_ARG_INDEX;
    private static final SubLSymbol $kw82$PREDICATE;
    private static final SubLSymbol $kw83$INDEX;
    private static final SubLSymbol $kw84$TRUTH;
    private static final SubLSymbol $kw85$TRUE;
    private static final SubLSymbol $kw86$DONE;
    private static final SubLSymbol $sym87$PWHEN_FEATURE;
    private static final SubLSymbol $kw88$CYC_SKSI;
    private static final SubLSymbol $sym89$PWHEN;
    private static final SubLSymbol $sym90$SKSI_GAF_ARG_POSSIBLE_P;
    private static final SubLSymbol $sym91$DO_SKSI_GAF_ARG_INDEX_GP;
    private static final SubLSymbol $kw92$INDEX_ARGNUM;
    private static final SubLList $list93;
    private static final SubLSymbol $sym94$PRED;
    private static final SubLSymbol $sym95$ARG;
    private static final SubLSymbol $sym96$ARGNUM;
    private static final SubLSymbol $sym97$TVA_TACTIC_ARGNUM;
    private static final SubLSymbol $sym98$TVA_TACTIC_TERM;
    private static final SubLSymbol $sym99$TVA_DO_ALL_GAF_ARG_INDEX;
    private static final SubLSymbol $sym100$PRED;
    private static final SubLSymbol $sym101$ARG;
    private static final SubLSymbol $sym102$ARGNUM;
    private static final SubLSymbol $sym103$DO_TVA_PRECOMPUTATION_TABLE;
    private static final SubLSymbol $sym104$ARG;
    private static final SubLSymbol $sym105$TRANS_PRED;
    private static final SubLSymbol $sym106$TRANS_PRED_MODULE;
    private static final SubLSymbol $sym107$DIRECTION;
    private static final SubLSymbol $sym108$ARGNUM;
    private static final SubLSymbol $sym109$PRED;
    private static final SubLSymbol $sym110$LINK_NODE;
    private static final SubLSymbol $sym111$TVA_TACTIC_TRANSITIVE_PRED;
    private static final SubLSymbol $sym112$TVA_DIRECTION_FOR_TVA_PRED;
    private static final SubLSymbol $sym113$TVA_TACTIC_TVA_PRED;
    private static final SubLSymbol $sym114$PIF;
    private static final SubLList $list115;
    private static final SubLSymbol $sym116$GET_SBHL_MODULE;
    private static final SubLSymbol $sym117$DO_ALL_SIMPLE_TRUE_LINKS_FOR_INVERSES;
    private static final SubLSymbol $sym118$DO_GHL_CLOSURE;
    private static final SubLSymbol $sym119$PUNLESS;
    private static final SubLSymbol $sym120$PRED;
    private static final SubLList $list121;
    private static final SubLSymbol $sym122$DO_PREDICATE_EXTENT_INDEX;
    private static final SubLList $list123;
    private static final SubLSymbol $sym124$DO_SKSI_PREDICATE_EXTENT_INDEX;
    private static final SubLObject $const125$temporallySubsumes;
    private static final SubLSymbol $kw126$TIME;
    private static final SubLList $list127;
    private static final SubLObject $const128$exceptForInArg;
    private static final SubLList $list129;
    private static final SubLList $list130;
    private static final SubLString $str131$Continue_Anyway_;
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 980L)
    public static SubLObject tva_tactic_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_tva_tactic(v_object, stream, (SubLObject)tva_tactic.ZERO_INTEGER);
        return (SubLObject)tva_tactic.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 980L)
    public static SubLObject tva_tactic_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $tva_tactic_native.class) ? tva_tactic.T : tva_tactic.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 980L)
    public static SubLObject tva_type(final SubLObject v_object) {
        assert tva_tactic.NIL != tva_tactic_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 980L)
    public static SubLObject tva_tva_pred(final SubLObject v_object) {
        assert tva_tactic.NIL != tva_tactic_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 980L)
    public static SubLObject tva_index_pred(final SubLObject v_object) {
        assert tva_tactic.NIL != tva_tactic_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 980L)
    public static SubLObject tva_transitive_pred(final SubLObject v_object) {
        assert tva_tactic.NIL != tva_tactic_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 980L)
    public static SubLObject tva_argnum(final SubLObject v_object) {
        assert tva_tactic.NIL != tva_tactic_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 980L)
    public static SubLObject tva_term(final SubLObject v_object) {
        assert tva_tactic.NIL != tva_tactic_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 980L)
    public static SubLObject tva_cost(final SubLObject v_object) {
        assert tva_tactic.NIL != tva_tactic_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 980L)
    public static SubLObject tva_precomputation(final SubLObject v_object) {
        assert tva_tactic.NIL != tva_tactic_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 980L)
    public static SubLObject tva_parent_pred(final SubLObject v_object) {
        assert tva_tactic.NIL != tva_tactic_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 980L)
    public static SubLObject tva_parent_pred_inverseP(final SubLObject v_object) {
        assert tva_tactic.NIL != tva_tactic_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 980L)
    public static SubLObject _csetf_tva_type(final SubLObject v_object, final SubLObject value) {
        assert tva_tactic.NIL != tva_tactic_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 980L)
    public static SubLObject _csetf_tva_tva_pred(final SubLObject v_object, final SubLObject value) {
        assert tva_tactic.NIL != tva_tactic_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 980L)
    public static SubLObject _csetf_tva_index_pred(final SubLObject v_object, final SubLObject value) {
        assert tva_tactic.NIL != tva_tactic_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 980L)
    public static SubLObject _csetf_tva_transitive_pred(final SubLObject v_object, final SubLObject value) {
        assert tva_tactic.NIL != tva_tactic_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 980L)
    public static SubLObject _csetf_tva_argnum(final SubLObject v_object, final SubLObject value) {
        assert tva_tactic.NIL != tva_tactic_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 980L)
    public static SubLObject _csetf_tva_term(final SubLObject v_object, final SubLObject value) {
        assert tva_tactic.NIL != tva_tactic_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 980L)
    public static SubLObject _csetf_tva_cost(final SubLObject v_object, final SubLObject value) {
        assert tva_tactic.NIL != tva_tactic_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 980L)
    public static SubLObject _csetf_tva_precomputation(final SubLObject v_object, final SubLObject value) {
        assert tva_tactic.NIL != tva_tactic_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 980L)
    public static SubLObject _csetf_tva_parent_pred(final SubLObject v_object, final SubLObject value) {
        assert tva_tactic.NIL != tva_tactic_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 980L)
    public static SubLObject _csetf_tva_parent_pred_inverseP(final SubLObject v_object, final SubLObject value) {
        assert tva_tactic.NIL != tva_tactic_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 980L)
    public static SubLObject make_tva_tactic(SubLObject arglist) {
        if (arglist == tva_tactic.UNPROVIDED) {
            arglist = (SubLObject)tva_tactic.NIL;
        }
        final SubLObject v_new = (SubLObject)new $tva_tactic_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)tva_tactic.NIL, next = arglist; tva_tactic.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)tva_tactic.$kw29$TYPE)) {
                _csetf_tva_type(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tva_tactic.$kw30$TVA_PRED)) {
                _csetf_tva_tva_pred(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tva_tactic.$kw31$INDEX_PRED)) {
                _csetf_tva_index_pred(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tva_tactic.$kw32$TRANSITIVE_PRED)) {
                _csetf_tva_transitive_pred(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tva_tactic.$kw33$ARGNUM)) {
                _csetf_tva_argnum(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tva_tactic.$kw34$TERM)) {
                _csetf_tva_term(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tva_tactic.$kw35$COST)) {
                _csetf_tva_cost(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tva_tactic.$kw36$PRECOMPUTATION)) {
                _csetf_tva_precomputation(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tva_tactic.$kw37$PARENT_PRED)) {
                _csetf_tva_parent_pred(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tva_tactic.$kw38$PARENT_PRED_INVERSE_)) {
                _csetf_tva_parent_pred_inverseP(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)tva_tactic.$str39$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 980L)
    public static SubLObject visit_defstruct_tva_tactic(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_tactic.$kw40$BEGIN, (SubLObject)tva_tactic.$sym41$MAKE_TVA_TACTIC, (SubLObject)tva_tactic.TEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_tactic.$kw42$SLOT, (SubLObject)tva_tactic.$kw29$TYPE, tva_type(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_tactic.$kw42$SLOT, (SubLObject)tva_tactic.$kw30$TVA_PRED, tva_tva_pred(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_tactic.$kw42$SLOT, (SubLObject)tva_tactic.$kw31$INDEX_PRED, tva_index_pred(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_tactic.$kw42$SLOT, (SubLObject)tva_tactic.$kw32$TRANSITIVE_PRED, tva_transitive_pred(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_tactic.$kw42$SLOT, (SubLObject)tva_tactic.$kw33$ARGNUM, tva_argnum(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_tactic.$kw42$SLOT, (SubLObject)tva_tactic.$kw34$TERM, tva_term(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_tactic.$kw42$SLOT, (SubLObject)tva_tactic.$kw35$COST, tva_cost(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_tactic.$kw42$SLOT, (SubLObject)tva_tactic.$kw36$PRECOMPUTATION, tva_precomputation(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_tactic.$kw42$SLOT, (SubLObject)tva_tactic.$kw37$PARENT_PRED, tva_parent_pred(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_tactic.$kw42$SLOT, (SubLObject)tva_tactic.$kw38$PARENT_PRED_INVERSE_, tva_parent_pred_inverseP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tva_tactic.$kw43$END, (SubLObject)tva_tactic.$sym41$MAKE_TVA_TACTIC, (SubLObject)tva_tactic.TEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 980L)
    public static SubLObject visit_defstruct_object_tva_tactic_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_tva_tactic(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 1509L)
    public static SubLObject print_tva_tactic(final SubLObject v_tva_tactic, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (tva_tactic.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            show_tva_tactic(v_tva_tactic, stream);
        }
        else if (tva_tactic.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_tva_tactic, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_tva_tactic, (SubLObject)tva_tactic.T, (SubLObject)tva_tactic.NIL);
            print_macros.print_unreadable_object_postamble(stream, v_tva_tactic, (SubLObject)tva_tactic.T, (SubLObject)tva_tactic.T);
        }
        return (SubLObject)tva_tactic.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 1740L)
    public static SubLObject show_tva_tactic(final SubLObject tactic, SubLObject stream) {
        if (stream == tva_tactic.UNPROVIDED) {
            stream = (SubLObject)tva_tactic.T;
        }
        PrintLow.format(stream, (SubLObject)tva_tactic.$str45$tva_pred____a__, tva_tva_pred(tactic));
        PrintLow.format(stream, (SubLObject)tva_tactic.$str46$tva_index_pred____a__, tva_index_pred(tactic));
        PrintLow.format(stream, (SubLObject)tva_tactic.$str47$tva_transitive_pred____a__, tva_transitive_pred(tactic));
        PrintLow.format(stream, (SubLObject)tva_tactic.$str48$tva_argnum____a__, tva_argnum(tactic));
        PrintLow.format(stream, (SubLObject)tva_tactic.$str49$tva_term____S__, tva_term(tactic));
        PrintLow.format(stream, (SubLObject)tva_tactic.$str50$tva_cost____a__, tva_cost(tactic));
        PrintLow.format(stream, (SubLObject)tva_tactic.$str51$tva_tactic_type____a__, tva_type(tactic));
        PrintLow.format(stream, (SubLObject)tva_tactic.$str52$tva_precomputation____a__, tva_precomputation(tactic));
        PrintLow.format(stream, (SubLObject)tva_tactic.$str53$tva_parent_pred____a__, tva_parent_pred(tactic));
        PrintLow.format(stream, (SubLObject)tva_tactic.$str54$tva_parent_pred_inverse_____a, tva_parent_pred_inverseP(tactic));
        return (SubLObject)tva_tactic.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 2516L)
    public static SubLObject new_tva_tactic(final SubLObject tva_pred, final SubLObject index_pred, final SubLObject transitive_pred, final SubLObject argnum, final SubLObject v_term, final SubLObject cost, final SubLObject type) {
        final SubLObject tactic = make_tva_tactic((SubLObject)tva_tactic.UNPROVIDED);
        _csetf_tva_tva_pred(tactic, tva_pred);
        _csetf_tva_index_pred(tactic, index_pred);
        _csetf_tva_transitive_pred(tactic, transitive_pred);
        _csetf_tva_argnum(tactic, argnum);
        _csetf_tva_term(tactic, v_term);
        _csetf_tva_cost(tactic, cost);
        _csetf_tva_type(tactic, type);
        _csetf_tva_precomputation(tactic, (SubLObject)tva_tactic.$kw55$FREE);
        _csetf_tva_parent_pred(tactic, index_pred);
        _csetf_tva_parent_pred_inverseP(tactic, sbhl_search_vars.genl_inverse_mode_p());
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 3200L)
    public static SubLObject copy_tva_tactic(final SubLObject tactic, final SubLObject flip_argnumP) {
        final SubLObject new_tactic = make_tva_tactic((SubLObject)tva_tactic.UNPROVIDED);
        final SubLObject argnum = (tva_tactic.NIL != flip_argnumP) ? misc_utilities.other_binary_arg(tva_argnum(tactic)) : tva_argnum(tactic);
        _csetf_tva_tva_pred(new_tactic, tva_tva_pred(tactic));
        _csetf_tva_index_pred(new_tactic, tva_index_pred(tactic));
        _csetf_tva_transitive_pred(new_tactic, tva_transitive_pred(tactic));
        _csetf_tva_argnum(new_tactic, argnum);
        _csetf_tva_term(new_tactic, tva_term(tactic));
        _csetf_tva_type(new_tactic, tva_type(tactic));
        _csetf_tva_precomputation(new_tactic, tva_precomputation(tactic));
        _csetf_tva_parent_pred(new_tactic, tva_parent_pred(tactic));
        _csetf_tva_parent_pred_inverseP(new_tactic, tva_parent_pred_inverseP(tactic));
        return new_tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 4181L)
    public static SubLObject tva_tactic_tva_pred(final SubLObject tactic) {
        return tva_tva_pred(tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 4275L)
    public static SubLObject tva_tactic_index_pred(final SubLObject tactic) {
        return tva_index_pred(tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 4358L)
    public static SubLObject tva_tactic_transitive_pred(final SubLObject tactic) {
        return tva_transitive_pred(tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 4451L)
    public static SubLObject tva_tactic_parent_pred(final SubLObject tactic) {
        return tva_parent_pred(tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 4536L)
    public static SubLObject tva_tactic_parent_pred_inverseP(final SubLObject tactic) {
        return tva_parent_pred_inverseP(tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 4639L)
    public static SubLObject tva_tactic_argnum(final SubLObject tactic) {
        return tva_argnum(tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 4714L)
    public static SubLObject tva_tactic_term(final SubLObject tactic) {
        return tva_term(tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 4785L)
    public static SubLObject tva_tactic_cost(final SubLObject tactic) {
        return tva_cost(tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 4856L)
    public static SubLObject tva_tactic_type(final SubLObject tactic) {
        return tva_type(tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 4927L)
    public static SubLObject tva_tactic_precomputation(final SubLObject tactic) {
        return tva_precomputation(tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 5018L)
    public static SubLObject tva_tactic_tva_argnum(final SubLObject v_tva_tactic, final SubLObject inverseP) {
        return tva_utilities.determine_tva_gather_argnum(tva_tactic_argnum(v_tva_tactic), inverseP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 5215L)
    public static SubLObject tva_tactic_direction(final SubLObject tactic) {
        return tva_utilities.tva_direction_for_tva_pred(tva_tactic_tva_pred(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 5331L)
    public static SubLObject tva_forward_direction_tacticP(final SubLObject tactic) {
        return Equality.eq((SubLObject)tva_tactic.$kw56$FORWARD, tva_tactic_direction(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 5440L)
    public static SubLObject tva_sentence_arg_for_tactic(final SubLObject sentence, final SubLObject tactic) {
        return cycl_utilities.atomic_sentence_arg(sentence, tva_tactic_argnum(tactic), (SubLObject)tva_tactic.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 5572L)
    public static SubLObject tva_tactic_argnum_to_strategy_argnum(final SubLObject tactic, final SubLObject inverseP) {
        final SubLObject argnum = tva_tactic_argnum(tactic);
        return tva_utilities.determine_tva_gather_argnum(argnum, inverseP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 5750L)
    public static SubLObject do_tva_precomputation_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list57);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject arg_var = (SubLObject)tva_tactic.NIL;
        SubLObject v_tva_tactic = (SubLObject)tva_tactic.NIL;
        SubLObject done_var = (SubLObject)tva_tactic.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list57);
        arg_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list57);
        v_tva_tactic = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list57);
        done_var = current.first();
        current = current.rest();
        if (tva_tactic.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject marking_var = (SubLObject)tva_tactic.$sym58$MARKING_VAR;
            return (SubLObject)ConsesLow.listS((SubLObject)tva_tactic.$sym59$DO_SBHL_TABLE, (SubLObject)ConsesLow.list(arg_var, marking_var, (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym60$TVA_TACTIC_PRECOMPUTATION, v_tva_tactic), done_var), (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym61$IGNORE, marking_var), ConsesLow.append(body, (SubLObject)tva_tactic.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_tactic.$list57);
        return (SubLObject)tva_tactic.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 6141L)
    public static SubLObject set_tva_tactic_index_pred(final SubLObject tactic, final SubLObject pred) {
        _csetf_tva_index_pred(tactic, pred);
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 6267L)
    public static SubLObject set_tva_tactic_cost(final SubLObject tactic, final SubLObject cost) {
        _csetf_tva_cost(tactic, cost);
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 6369L)
    public static SubLObject set_tva_tactic_precomputation(final SubLObject tactic, final SubLObject precomputation) {
        assert tva_tactic.NIL != tva_utilities.tva_precomputation_p(precomputation) : precomputation;
        _csetf_tva_precomputation(tactic, precomputation);
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 6562L)
    public static SubLObject set_tva_tactic_cost_possible_precomputation(final SubLObject tactic, final SubLObject tva_asent_argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject cost = tva_cost_and_precomputation(tactic, tva_inference.tva_asent_arg(tva_asent_argnum));
        final SubLObject precomputation = thread.secondMultipleValue();
        thread.resetMultipleValues();
        set_tva_tactic_cost(tactic, cost);
        if (tva_tactic.NIL != precomputation) {
            set_tva_tactic_precomputation(tactic, precomputation);
            tva_inference.tva_store_precomputation(tactic, precomputation);
        }
        return (SubLObject)tva_tactic.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 7002L)
    public static SubLObject sufficient_tactic_p(final SubLObject tactic) {
        return (SubLObject)SubLObjectFactory.makeBoolean(tva_tactic.NIL != tva_type(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 7359L)
    public static SubLObject tva_tactic_type_p(final SubLObject obj) {
        return subl_promotions.memberP(obj, tva_tactic.$tva_tactic_types$.getGlobalValue(), (SubLObject)tva_tactic.UNPROVIDED, (SubLObject)tva_tactic.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 7442L)
    public static SubLObject tva_typeL(final SubLObject type1, final SubLObject type2) {
        return Numbers.numL(Sequences.position(type1, tva_tactic.$tva_tactic_types$.getGlobalValue(), (SubLObject)tva_tactic.UNPROVIDED, (SubLObject)tva_tactic.UNPROVIDED, (SubLObject)tva_tactic.UNPROVIDED, (SubLObject)tva_tactic.UNPROVIDED), Sequences.position(type2, tva_tactic.$tva_tactic_types$.getGlobalValue(), (SubLObject)tva_tactic.UNPROVIDED, (SubLObject)tva_tactic.UNPROVIDED, (SubLObject)tva_tactic.UNPROVIDED, (SubLObject)tva_tactic.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 7568L)
    public static SubLObject tva_lookup_tactic_p(final SubLObject tactic) {
        return Equality.eq(tva_tactic_type(tactic), (SubLObject)tva_tactic.$kw64$LOOKUP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 7663L)
    public static SubLObject tva_precomputed_tactic_p(final SubLObject tactic) {
        return Equality.eq(tva_tactic_type(tactic), (SubLObject)tva_tactic.$kw65$PRECOMPUTED_CLOSURE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 7776L)
    public static SubLObject tva_calculate_closure_tactic_p(final SubLObject tactic) {
        return Equality.eq(tva_tactic_type(tactic), (SubLObject)tva_tactic.$kw66$CALCULATE_CLOSURE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 7893L)
    public static SubLObject tva_predicate_extent_tactic_p(final SubLObject tactic) {
        return Equality.eq(tva_tactic_type(tactic), (SubLObject)tva_tactic.$kw67$PREDICATE_EXTENT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 8008L)
    public static SubLObject tva_tacticL(final SubLObject tactic1, final SubLObject tactic2) {
        final SubLObject type1 = tva_tactic_type(tactic1);
        final SubLObject type2 = tva_tactic_type(tactic2);
        final SubLObject cost1 = tva_tactic_cost(tactic1);
        final SubLObject cost2 = tva_tactic_cost(tactic2);
        if (type1.eql(type2) && cost1.isInteger() && cost2.isInteger()) {
            return Numbers.numL(cost1, cost2);
        }
        return tva_typeL(type1, type2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 8547L)
    public static SubLObject tva_tactic_subsumes_tactic_p(final SubLObject tactic1, final SubLObject tactic2, SubLObject flipP) {
        if (flipP == tva_tactic.UNPROVIDED) {
            flipP = (SubLObject)tva_tactic.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(tva_tactic.NIL != ((tva_tactic.NIL == flipP) ? tva_tactics_overlap_p(tactic1, tactic2) : tva_inverse_tactics_overlap_p(tactic1, tactic2)) && (tva_type(tactic1).eql(tva_type(tactic2)) || tva_tactic.NIL != tva_typeL(tva_type(tactic1), tva_type(tactic2))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 9060L)
    public static SubLObject tva_tactics_overlap_p(final SubLObject tactic1, final SubLObject tactic2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(tva_tactic_argnum(tactic1).numE(tva_tactic_argnum(tactic2)) && (tva_tactic.NIL == tva_tactic_tva_pred(tactic2) || tva_tactic_tva_pred(tactic1).eql(tva_tactic_tva_pred(tactic2))) && (tva_tactic.NIL == tva_tactic_transitive_pred(tactic2) || tva_tactic_transitive_pred(tactic1).eql(tva_tactic_transitive_pred(tactic2))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 9452L)
    public static SubLObject tva_inverse_tactics_overlap_p(final SubLObject tactic1, final SubLObject tactic2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(tva_tactic_argnum(tactic1).numE(misc_utilities.other_binary_arg(tva_tactic_argnum(tactic2))) && tva_tactic_tva_pred(tactic1).eql(tva_tactic_tva_pred(tactic2)) && tva_tactic_transitive_pred(tactic1).eql(tva_tactic_transitive_pred(tactic2)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 9770L)
    public static SubLObject determine_tva_tactic_type(final SubLObject tva_pred, final SubLObject trans_pred, final SubLObject arg, final SubLObject argnum) {
        if (tva_pred.eql(tva_tactic.$const68$transitiveViaArg) || tva_pred.eql(tva_tactic.$const69$conservativeViaArg)) {
            final SubLObject inverse_cardinality = ghl_search_utilities.ghl_inverse_cardinality(trans_pred, arg);
            return determine_tactic_type_from_cardinality(trans_pred, arg, argnum, inverse_cardinality);
        }
        if (tva_pred.eql(tva_tactic.$const70$transitiveViaArgInverse) || tva_pred.eql(tva_tactic.$const71$conservativeViaArgInverse)) {
            final SubLObject predicate_cardinality = ghl_search_utilities.ghl_predicate_cardinality(trans_pred, arg);
            return determine_tactic_type_from_cardinality(trans_pred, arg, argnum, predicate_cardinality);
        }
        return (SubLObject)tva_tactic.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 10726L)
    public static SubLObject determine_tactic_type_from_cardinality(final SubLObject trans_pred, final SubLObject arg, final SubLObject argnum, final SubLObject cardinality) {
        if (tva_tactic.NIL == el_utilities.groundP(arg, (SubLObject)tva_tactic.UNPROVIDED)) {
            return (SubLObject)tva_tactic.NIL;
        }
        if (tva_tactic.NIL != tva_utilities.less_than_precompute_closure_thresholdP(cardinality) && tva_tactic.NIL != gt_utilities.gt_term_p(arg)) {
            if (tva_tactic.NIL != sksi_tva_utilities.sksi_gaf_arg_impossible_p(trans_pred, arg, argnum) || tva_tactic.NIL != tva_utilities.tva_precomputes_sksi_closuresP()) {
                return (SubLObject)tva_tactic.$kw65$PRECOMPUTED_CLOSURE;
            }
            return (SubLObject)tva_tactic.$kw66$CALCULATE_CLOSURE;
        }
        else {
            if (tva_tactic.NIL == tva_utilities.less_than_precompute_closure_thresholdP(cardinality) && tva_tactic.NIL != gt_utilities.gt_term_p(arg)) {
                return (SubLObject)tva_tactic.$kw66$CALCULATE_CLOSURE;
            }
            if (tva_tactic.NIL == abduction.abduced_term_p(arg)) {
                return (SubLObject)tva_tactic.$kw67$PREDICATE_EXTENT;
            }
            return (SubLObject)tva_tactic.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 11556L)
    public static SubLObject tva_cost_and_precomputation(final SubLObject tactic, final SubLObject arg) {
        final SubLObject direction = tva_tactic_direction(tactic);
        final SubLObject trans_pred = tva_tactic_transitive_pred(tactic);
        final SubLObject type = tva_tactic_type(tactic);
        SubLObject precomputation = (SubLObject)tva_tactic.NIL;
        SubLObject cardinality = (SubLObject)tva_tactic.NIL;
        final SubLObject pcase_var = type;
        if (pcase_var.eql((SubLObject)tva_tactic.$kw65$PRECOMPUTED_CLOSURE)) {
            precomputation = compute_tva_closure(trans_pred, arg, direction);
            cardinality = tva_closure_cardinality(precomputation);
        }
        else if (pcase_var.eql((SubLObject)tva_tactic.$kw66$CALCULATE_CLOSURE)) {
            cardinality = tva_closure_cardinality_estimate(trans_pred, arg, direction);
        }
        else if (pcase_var.eql((SubLObject)tva_tactic.$kw67$PREDICATE_EXTENT)) {}
        return Values.values(cardinality, precomputation);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 12205L)
    public static SubLObject prune_sbhl_closure_wrt_genl_preds_and_inverse(final SubLObject trans_pred, final SubLObject sbhl_closure) {
        if (trans_pred.eql(tva_tactic.$const72$genlPreds) || trans_pred.eql(tva_tactic.$const73$genlInverse)) {
            SubLObject prune_nodes = (SubLObject)tva_tactic.NIL;
            SubLObject node = (SubLObject)tva_tactic.NIL;
            SubLObject marking = (SubLObject)tva_tactic.NIL;
            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(sbhl_closure);
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    node = Hashtables.getEntryKey(cdohash_entry);
                    marking = Hashtables.getEntryValue(cdohash_entry);
                    if (marking.isCons() && tva_tactic.NIL == subl_promotions.memberP(trans_pred, marking, (SubLObject)tva_tactic.UNPROVIDED, (SubLObject)tva_tactic.UNPROVIDED)) {
                        sbhl_marking_utilities.remove_from_sbhl_marking_state(node, trans_pred.eql(tva_tactic.$const72$genlPreds) ? tva_tactic.$const73$genlInverse : tva_tactic.$const72$genlPreds, sbhl_closure);
                        if (tva_tactic.NIL == sbhl_marking_utilities.node_unmarked_completely_in_sbhl_marking_stateP(node, sbhl_closure)) {
                            continue;
                        }
                        prune_nodes = (SubLObject)ConsesLow.cons(node, prune_nodes);
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator);
            }
            SubLObject cdolist_list_var = prune_nodes;
            SubLObject node2 = (SubLObject)tva_tactic.NIL;
            node2 = cdolist_list_var.first();
            while (tva_tactic.NIL != cdolist_list_var) {
                sbhl_marking_utilities.prune_unmarked_node_from_sbhl_marking_state(node2, sbhl_closure);
                cdolist_list_var = cdolist_list_var.rest();
                node2 = cdolist_list_var.first();
            }
        }
        return sbhl_closure;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 13583L)
    public static SubLObject compute_tva_closure(final SubLObject trans_pred, final SubLObject arg, final SubLObject direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject closure = (SubLObject)tva_tactic.NIL;
        if (tva_tactic.NIL != sbhl_module_utilities.sbhl_predicate_p(trans_pred)) {
            final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
            try {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)tva_tactic.NIL, thread);
                sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject sbhl_closure = sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$1 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                        sbhl_marking_methods.sbhl_record_closure(sbhl_module_vars.get_sbhl_module(trans_pred), arg, tva_utilities.tva_direction_to_sbhl_direction(direction), (SubLObject)tva_tactic.UNPROVIDED, (SubLObject)tva_tactic.UNPROVIDED);
                        closure = prune_sbhl_closure_wrt_genl_preds_and_inverse(trans_pred, sbhl_closure);
                    }
                    finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$1, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_tactic.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_2, thread);
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0, thread);
            }
        }
        else if (tva_tactic.NIL != fort_types_interface.transitive_binary_predicate_p(trans_pred)) {
            final SubLObject _prev_bind_3 = ghl_marking_utilities.$ghl_table$.currentBinding(thread);
            try {
                ghl_marking_utilities.$ghl_table$.bind(ghl_marking_utilities.ghl_instantiate_new_space(), thread);
                final SubLObject ghl_closure = ghl_marking_utilities.$ghl_table$.getDynamicValue(thread);
                ghl_search_methods.ghl_record_closure(trans_pred, arg, tva_utilities.tva_direction_to_ghl_direction(direction), (SubLObject)tva_tactic.UNPROVIDED, (SubLObject)tva_tactic.UNPROVIDED);
                closure = ghl_closure;
            }
            finally {
                ghl_marking_utilities.$ghl_table$.rebind(_prev_bind_3, thread);
            }
        }
        else if (tva_tactic.NIL != kb_accessors.binary_predicateP(trans_pred)) {
            final SubLObject _prev_bind_3 = ghl_marking_utilities.$ghl_table$.currentBinding(thread);
            try {
                ghl_marking_utilities.$ghl_table$.bind(ghl_marking_utilities.ghl_instantiate_new_space(), thread);
                final SubLObject ghl_closure = ghl_marking_utilities.$ghl_table$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$3 = gt_vars.$gt_handle_non_transitive_predicateP$.currentBinding(thread);
                try {
                    gt_vars.$gt_handle_non_transitive_predicateP$.bind((SubLObject)tva_tactic.T, thread);
                    ghl_search_methods.ghl_record_closure(trans_pred, arg, tva_utilities.tva_direction_to_ghl_direction(direction), (SubLObject)tva_tactic.UNPROVIDED, (SubLObject)tva_tactic.UNPROVIDED);
                }
                finally {
                    gt_vars.$gt_handle_non_transitive_predicateP$.rebind(_prev_bind_0_$3, thread);
                }
                closure = ghl_closure;
            }
            finally {
                ghl_marking_utilities.$ghl_table$.rebind(_prev_bind_3, thread);
            }
        }
        else {
            Errors.cerror((SubLObject)tva_tactic.$str74$Continue_, (SubLObject)tva_tactic.$str75$Error_in_predicate__a, trans_pred);
        }
        return closure;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 14561L)
    public static SubLObject tva_closure_cardinality(final SubLObject precomputation) {
        return Hashtables.hash_table_count(precomputation);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 14662L)
    public static SubLObject tva_closure_cardinality_estimate(final SubLObject trans_pred, final SubLObject arg, final SubLObject direction) {
        if (direction == tva_tactic.$kw76$BACKWARD) {
            return ghl_search_utilities.ghl_inverse_cardinality(trans_pred, arg);
        }
        if (direction == tva_tactic.$kw56$FORWARD) {
            return ghl_search_utilities.ghl_predicate_cardinality(trans_pred, arg);
        }
        Errors.cerror((SubLObject)tva_tactic.$str74$Continue_, (SubLObject)tva_tactic.$str77$Error_in_direction__a, direction);
        return (SubLObject)tva_tactic.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 14992L)
    public static SubLObject tva_do_all_gaf_arg_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list78);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sentence_var = (SubLObject)tva_tactic.NIL;
        SubLObject mt_var = (SubLObject)tva_tactic.NIL;
        SubLObject pred = (SubLObject)tva_tactic.NIL;
        SubLObject v_term = (SubLObject)tva_tactic.NIL;
        SubLObject argnum = (SubLObject)tva_tactic.NIL;
        SubLObject doneP_var = (SubLObject)tva_tactic.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list78);
        sentence_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list78);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list78);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list78);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list78);
        argnum = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list78);
        doneP_var = current.first();
        current = current.rest();
        if (tva_tactic.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym79$PROGN, (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym80$CLET, (SubLObject)ConsesLow.list(mt_var), (SubLObject)ConsesLow.listS((SubLObject)tva_tactic.$sym81$DO_GAF_ARG_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { sentence_var, v_term, tva_tactic.$kw82$PREDICATE, pred, tva_tactic.$kw83$INDEX, argnum, tva_tactic.$kw84$TRUTH, tva_tactic.$kw85$TRUE, tva_tactic.$kw86$DONE, doneP_var }), ConsesLow.append(body, (SubLObject)tva_tactic.NIL))), (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym87$PWHEN_FEATURE, (SubLObject)tva_tactic.$kw88$CYC_SKSI, (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym89$PWHEN, (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym90$SKSI_GAF_ARG_POSSIBLE_P, pred, v_term, argnum), (SubLObject)ConsesLow.listS((SubLObject)tva_tactic.$sym91$DO_SKSI_GAF_ARG_INDEX_GP, (SubLObject)ConsesLow.list(new SubLObject[] { sentence_var, mt_var, v_term, pred, tva_tactic.$kw92$INDEX_ARGNUM, argnum, tva_tactic.$kw84$TRUTH, tva_tactic.$kw85$TRUE, tva_tactic.$kw86$DONE, doneP_var }), ConsesLow.append(body, (SubLObject)tva_tactic.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_tactic.$list78);
        return (SubLObject)tva_tactic.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 15765L)
    public static SubLObject do_tva_sentences_for_lookup_tactic(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list93);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sentence_var = (SubLObject)tva_tactic.NIL;
        SubLObject mt_var = (SubLObject)tva_tactic.NIL;
        SubLObject tactic = (SubLObject)tva_tactic.NIL;
        SubLObject doneP_var = (SubLObject)tva_tactic.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list93);
        sentence_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list93);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list93);
        tactic = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list93);
        doneP_var = current.first();
        current = current.rest();
        if (tva_tactic.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject pred = (SubLObject)tva_tactic.$sym94$PRED;
            final SubLObject arg = (SubLObject)tva_tactic.$sym95$ARG;
            final SubLObject argnum = (SubLObject)tva_tactic.$sym96$ARGNUM;
            return (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym80$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(argnum, (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym97$TVA_TACTIC_ARGNUM, tactic)), (SubLObject)ConsesLow.list(arg, (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym98$TVA_TACTIC_TERM, tactic)), (SubLObject)ConsesLow.list(pred, (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym13$TVA_INDEX_PRED, tactic))), (SubLObject)ConsesLow.listS((SubLObject)tva_tactic.$sym99$TVA_DO_ALL_GAF_ARG_INDEX, (SubLObject)ConsesLow.list(sentence_var, mt_var, pred, arg, argnum, doneP_var), ConsesLow.append(body, (SubLObject)tva_tactic.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_tactic.$list93);
        return (SubLObject)tva_tactic.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 16226L)
    public static SubLObject do_tva_sentences_for_precomputed_tactic(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list93);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sentence_var = (SubLObject)tva_tactic.NIL;
        SubLObject mt_var = (SubLObject)tva_tactic.NIL;
        SubLObject tactic = (SubLObject)tva_tactic.NIL;
        SubLObject doneP_var = (SubLObject)tva_tactic.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list93);
        sentence_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list93);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list93);
        tactic = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list93);
        doneP_var = current.first();
        current = current.rest();
        if (tva_tactic.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject pred = (SubLObject)tva_tactic.$sym100$PRED;
            final SubLObject arg = (SubLObject)tva_tactic.$sym101$ARG;
            final SubLObject argnum = (SubLObject)tva_tactic.$sym102$ARGNUM;
            return (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym80$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(argnum, (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym97$TVA_TACTIC_ARGNUM, tactic)), (SubLObject)ConsesLow.list(pred, (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym13$TVA_INDEX_PRED, tactic))), (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym103$DO_TVA_PRECOMPUTATION_TABLE, (SubLObject)ConsesLow.list(arg, tactic, doneP_var), (SubLObject)ConsesLow.listS((SubLObject)tva_tactic.$sym99$TVA_DO_ALL_GAF_ARG_INDEX, (SubLObject)ConsesLow.list(sentence_var, mt_var, pred, arg, argnum, doneP_var), ConsesLow.append(body, (SubLObject)tva_tactic.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_tactic.$list93);
        return (SubLObject)tva_tactic.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 16711L)
    public static SubLObject do_tva_sentences_for_calculate_closure_tactic(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list93);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sentence_var = (SubLObject)tva_tactic.NIL;
        SubLObject mt_var = (SubLObject)tva_tactic.NIL;
        SubLObject tactic = (SubLObject)tva_tactic.NIL;
        SubLObject doneP_var = (SubLObject)tva_tactic.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list93);
        sentence_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list93);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list93);
        tactic = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list93);
        doneP_var = current.first();
        current = current.rest();
        if (tva_tactic.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject arg = (SubLObject)tva_tactic.$sym104$ARG;
            final SubLObject trans_pred = (SubLObject)tva_tactic.$sym105$TRANS_PRED;
            final SubLObject trans_pred_module = (SubLObject)tva_tactic.$sym106$TRANS_PRED_MODULE;
            final SubLObject direction = (SubLObject)tva_tactic.$sym107$DIRECTION;
            final SubLObject argnum = (SubLObject)tva_tactic.$sym108$ARGNUM;
            final SubLObject pred = (SubLObject)tva_tactic.$sym109$PRED;
            final SubLObject link_node = (SubLObject)tva_tactic.$sym110$LINK_NODE;
            return (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym80$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(arg, (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym98$TVA_TACTIC_TERM, tactic)), (SubLObject)ConsesLow.list(trans_pred, (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym111$TVA_TACTIC_TRANSITIVE_PRED, tactic)), (SubLObject)ConsesLow.list(direction, (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym112$TVA_DIRECTION_FOR_TVA_PRED, (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym113$TVA_TACTIC_TVA_PRED, tactic))), (SubLObject)ConsesLow.list(argnum, (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym97$TVA_TACTIC_ARGNUM, tactic)), (SubLObject)ConsesLow.list(pred, (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym13$TVA_INDEX_PRED, tactic))), (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym114$PIF, (SubLObject)ConsesLow.listS((SubLObject)tva_tactic.EQL, trans_pred, (SubLObject)tva_tactic.$list115), (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym80$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(trans_pred_module, (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym116$GET_SBHL_MODULE, trans_pred))), (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym117$DO_ALL_SIMPLE_TRUE_LINKS_FOR_INVERSES, (SubLObject)ConsesLow.list(link_node, trans_pred_module, direction, arg, (SubLObject)tva_tactic.NIL, (SubLObject)tva_tactic.NIL, doneP_var), (SubLObject)ConsesLow.listS((SubLObject)tva_tactic.$sym99$TVA_DO_ALL_GAF_ARG_INDEX, (SubLObject)ConsesLow.list(sentence_var, mt_var, pred, link_node, argnum, doneP_var), ConsesLow.append(body, (SubLObject)tva_tactic.NIL)))), (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym79$PROGN, (SubLObject)ConsesLow.listS((SubLObject)tva_tactic.$sym99$TVA_DO_ALL_GAF_ARG_INDEX, (SubLObject)ConsesLow.list(sentence_var, mt_var, pred, arg, argnum, doneP_var), ConsesLow.append(body, (SubLObject)tva_tactic.NIL)), (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym118$DO_GHL_CLOSURE, (SubLObject)ConsesLow.list(link_node, trans_pred, arg, direction, (SubLObject)tva_tactic.$kw86$DONE, doneP_var), (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym119$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)tva_tactic.EQUAL, link_node, arg), (SubLObject)ConsesLow.listS((SubLObject)tva_tactic.$sym99$TVA_DO_ALL_GAF_ARG_INDEX, (SubLObject)ConsesLow.list(sentence_var, mt_var, pred, link_node, argnum, doneP_var), ConsesLow.append(body, (SubLObject)tva_tactic.NIL)))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_tactic.$list93);
        return (SubLObject)tva_tactic.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 17998L)
    public static SubLObject do_tva_sentences_for_predicate_extent_tactic(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list93);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sentence_var = (SubLObject)tva_tactic.NIL;
        SubLObject mt_var = (SubLObject)tva_tactic.NIL;
        SubLObject tactic = (SubLObject)tva_tactic.NIL;
        SubLObject doneP_var = (SubLObject)tva_tactic.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list93);
        sentence_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list93);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list93);
        tactic = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list93);
        doneP_var = current.first();
        current = current.rest();
        if (tva_tactic.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject pred = (SubLObject)tva_tactic.$sym120$PRED;
            return (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym80$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(pred, (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym13$TVA_INDEX_PRED, tactic))), (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym80$CLET, (SubLObject)ConsesLow.list(mt_var), (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym89$PWHEN, (SubLObject)tva_tactic.$list121, (SubLObject)ConsesLow.listS((SubLObject)tva_tactic.$sym122$DO_PREDICATE_EXTENT_INDEX, (SubLObject)ConsesLow.list(sentence_var, pred, (SubLObject)tva_tactic.$kw84$TRUTH, (SubLObject)tva_tactic.$kw85$TRUE, (SubLObject)tva_tactic.$kw86$DONE, doneP_var), ConsesLow.append(body, (SubLObject)tva_tactic.NIL)))), (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym87$PWHEN_FEATURE, (SubLObject)tva_tactic.$kw88$CYC_SKSI, (SubLObject)ConsesLow.list((SubLObject)tva_tactic.$sym89$PWHEN, (SubLObject)tva_tactic.$list123, (SubLObject)ConsesLow.listS((SubLObject)tva_tactic.$sym124$DO_SKSI_PREDICATE_EXTENT_INDEX, (SubLObject)ConsesLow.list(sentence_var, mt_var, pred, (SubLObject)tva_tactic.$kw84$TRUTH, (SubLObject)tva_tactic.$kw85$TRUE, (SubLObject)tva_tactic.$kw86$DONE, doneP_var), ConsesLow.append(body, (SubLObject)tva_tactic.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_tactic.$list93);
        return (SubLObject)tva_tactic.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 18688L)
    public static SubLObject possibly_discharge_evaluatable_predicate_meta_tactic(final SubLObject tactic, final SubLObject v_term, final SubLObject argnum) {
        final SubLObject trans_pred = tva_tactic_transitive_pred(tactic);
        SubLObject successP = (SubLObject)tva_tactic.NIL;
        SubLObject supports = (SubLObject)tva_tactic.NIL;
        if (trans_pred.eql(tva_tactic.$const125$temporallySubsumes)) {
            final SubLObject forwardP = tva_forward_direction_tacticP(tactic);
            final SubLObject asent_arg = tva_inference.tva_asent_arg(argnum);
            final SubLObject inferior = (tva_tactic.NIL != forwardP) ? asent_arg : v_term;
            final SubLObject superior = (tva_tactic.NIL != forwardP) ? v_term : asent_arg;
            successP = hlmt_relevance.subsumed_time_intervalP(superior, inferior);
            if (tva_tactic.NIL != successP) {
                supports = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)tva_tactic.$kw126$TIME, (SubLObject)ConsesLow.list(tva_tactic.$const125$temporallySubsumes, inferior, superior), (SubLObject)tva_tactic.UNPROVIDED, (SubLObject)tva_tactic.UNPROVIDED), supports);
            }
        }
        if (tva_tactic.NIL == successP && tva_tactic.NIL != fort_types_interface.evaluatable_predicate_p(trans_pred, (SubLObject)tva_tactic.UNPROVIDED)) {
            final SubLObject forwardP = tva_forward_direction_tacticP(tactic);
            final SubLObject asent_arg = tva_inference.tva_asent_arg(argnum);
            final SubLObject inferior = (tva_tactic.NIL != forwardP) ? asent_arg : v_term;
            final SubLObject superior = (tva_tactic.NIL != forwardP) ? v_term : asent_arg;
            final SubLObject expression = el_utilities.make_binary_formula(trans_pred, inferior, superior);
            successP = relation_evaluation.cyc_evaluate(expression);
            if (tva_tactic.NIL != successP) {
                supports = relation_evaluation.cyc_evaluate_justify(expression);
            }
        }
        return Values.values(successP, supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 20072L)
    public static SubLObject discharge_tva_precomputed_tactic(final SubLObject tactic, final SubLObject v_term, final SubLObject argnum, final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject successP = possibly_discharge_evaluatable_predicate_meta_tactic(tactic, v_term, argnum);
        SubLObject supports = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (tva_tactic.NIL == successP && tva_tactic.NIL != ghl_marking_utilities.ghl_node_marked_in_space_p(v_term, tva_tactic_precomputation(tactic)) && tva_tactic.NIL == tva_tactic_term_for_sentence_is_exceptionalP(tactic, argnum, sentence)) {
            successP = (SubLObject)tva_tactic.T;
            if (tva_tactic.NIL != tva_inference.tva_compute_justificationsP()) {
                supports = tva_justify_subsumption(tactic, v_term, supports);
            }
        }
        return Values.values(successP, supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 20638L)
    public static SubLObject discharge_tva_calculate_closure_tactic(final SubLObject tactic, final SubLObject v_term, final SubLObject argnum, final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject trans_pred = tva_tactic_transitive_pred(tactic);
        final SubLObject forwardP = tva_forward_direction_tacticP(tactic);
        final SubLObject asent_arg = tva_inference.tva_asent_arg(argnum);
        final SubLObject inferior = (tva_tactic.NIL != forwardP) ? asent_arg : v_term;
        final SubLObject superior = (tva_tactic.NIL != forwardP) ? v_term : asent_arg;
        thread.resetMultipleValues();
        SubLObject successP = possibly_discharge_evaluatable_predicate_meta_tactic(tactic, v_term, argnum);
        SubLObject supports = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (tva_tactic.NIL == successP) {
            SubLObject current;
            final SubLObject datum = current = tva_inference.tva_reused_spaces_for_relation(trans_pred, superior);
            SubLObject fail_space = (SubLObject)tva_tactic.NIL;
            SubLObject goal_space = (SubLObject)tva_tactic.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list127);
            fail_space = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list127);
            goal_space = current.first();
            current = current.rest();
            if (tva_tactic.NIL == current) {
                if (tva_tactic.NIL != ghl_search_methods.ghl_predicate_relation_within_multiple_searches_p(trans_pred, inferior, superior, fail_space, goal_space, (SubLObject)tva_tactic.UNPROVIDED, (SubLObject)tva_tactic.UNPROVIDED) && tva_tactic.NIL == tva_tactic_term_for_sentence_is_exceptionalP(tactic, argnum, sentence)) {
                    successP = (SubLObject)tva_tactic.T;
                    if (tva_tactic.NIL != tva_inference.tva_compute_justificationsP()) {
                        supports = tva_justify_subsumption(tactic, v_term, supports);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_tactic.$list127);
            }
        }
        return Values.values(successP, supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 21628L)
    public static SubLObject discharge_tva_predicate_extent_tactic(final SubLObject tactic, final SubLObject v_term, final SubLObject argnum, final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent_arg = tva_inference.tva_asent_arg(argnum);
        SubLObject successP = (SubLObject)tva_tactic.NIL;
        SubLObject supports = (SubLObject)tva_tactic.NIL;
        if (asent_arg.equal(v_term)) {
            successP = (SubLObject)tva_tactic.T;
        }
        if (tva_tactic.NIL == successP) {
            thread.resetMultipleValues();
            final SubLObject successP_$4 = possibly_discharge_evaluatable_predicate_meta_tactic(tactic, v_term, argnum);
            final SubLObject supports_$5 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            successP = successP_$4;
            supports = supports_$5;
            if (tva_tactic.NIL == successP) {
                final SubLObject trans_pred = tva_tactic_transitive_pred(tactic);
                if (tva_tactic.NIL != trans_pred) {
                    final SubLObject forwardP = tva_forward_direction_tacticP(tactic);
                    final SubLObject inferior = (tva_tactic.NIL != forwardP) ? asent_arg : v_term;
                    final SubLObject superior = (tva_tactic.NIL != forwardP) ? v_term : asent_arg;
                    final SubLObject gaf_formula = el_utilities.make_binary_formula(trans_pred, inferior, superior);
                    final SubLObject gaf = kb_indexing.find_gaf_in_relevant_mt(gaf_formula);
                    if (tva_tactic.NIL != gaf && tva_tactic.NIL == tva_tactic_term_for_sentence_is_exceptionalP(tactic, argnum, sentence)) {
                        successP = (SubLObject)tva_tactic.T;
                        supports = (SubLObject)ConsesLow.cons(gaf, supports);
                    }
                }
            }
        }
        return Values.values(successP, supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 22700L)
    public static SubLObject tva_tactic_term_for_sentence_is_exceptionalP(final SubLObject tactic, final SubLObject argnum, final SubLObject sentence) {
        if (tva_tactic.NIL != assertion_handles.assertion_p(sentence) && tva_tactic.NIL != assertion_utilities.assertion_has_meta_assertionsP(sentence)) {
            SubLObject cdolist_list_var;
            final SubLObject except_in_arg_tuples = cdolist_list_var = kb_mapping_utilities.pred_value_tuples(sentence, tva_tactic.$const128$exceptForInArg, (SubLObject)tva_tactic.THREE_INTEGER, (SubLObject)tva_tactic.$list129, (SubLObject)tva_tactic.UNPROVIDED);
            SubLObject except_in_arg_tuple = (SubLObject)tva_tactic.NIL;
            except_in_arg_tuple = cdolist_list_var.first();
            while (tva_tactic.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = except_in_arg_tuple;
                SubLObject except_term = (SubLObject)tva_tactic.NIL;
                SubLObject except_argnum = (SubLObject)tva_tactic.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list130);
                except_term = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_tactic.$list130);
                except_argnum = current.first();
                current = current.rest();
                if (tva_tactic.NIL == current) {
                    if (argnum.eql(except_argnum) && tva_tactic.NIL != ghl_search_methods.ghl_predicate_relation_p(tva_tactic_transitive_pred(tactic), tva_tactic_term(tactic), except_term, (SubLObject)tva_tactic.UNPROVIDED, (SubLObject)tva_tactic.UNPROVIDED, (SubLObject)tva_tactic.UNPROVIDED)) {
                        return (SubLObject)tva_tactic.T;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_tactic.$list130);
                }
                cdolist_list_var = cdolist_list_var.rest();
                except_in_arg_tuple = cdolist_list_var.first();
            }
        }
        return (SubLObject)tva_tactic.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 23279L)
    public static SubLObject tva_justify_subsumption(final SubLObject tactic, final SubLObject assertion_arg, final SubLObject supports) {
        SubLObject result = supports;
        final SubLObject tva_pred = tva_tactic_tva_pred(tactic);
        final SubLObject parent_pred = tva_tactic_parent_pred(tactic);
        final SubLObject trans_pred = tva_tactic_transitive_pred(tactic);
        final SubLObject tva_argnum = tva_tactic_tva_argnum(tactic, (SubLObject)SubLObjectFactory.makeBoolean(!SubLObjectFactory.makeBoolean(tva_tactic.NIL == sbhl_search_vars.genl_inverse_mode_p()).eql((SubLObject)SubLObjectFactory.makeBoolean(tva_tactic.NIL == tva_tactic_parent_pred_inverseP(tactic)))));
        final SubLObject asent_argnum = tva_tactic_argnum_to_strategy_argnum(tactic, sbhl_search_vars.genl_inverse_mode_p());
        final SubLObject asent_arg = tva_inference.tva_asent_arg(asent_argnum);
        if (tva_tactic.NIL != sbhl_search_vars.genl_inverse_mode_p() || !assertion_arg.eql(asent_arg)) {
            final SubLObject pcase_var = tva_pred;
            if (pcase_var.eql(tva_tactic.$const68$transitiveViaArg) || pcase_var.eql(tva_tactic.$const69$conservativeViaArg)) {
                result = (SubLObject)ConsesLow.cons(arguments.make_hl_support(tva_utilities.tva_support_module_for_pred(trans_pred), (SubLObject)ConsesLow.list(trans_pred, assertion_arg, asent_arg), (SubLObject)tva_tactic.UNPROVIDED, (SubLObject)tva_tactic.UNPROVIDED), result);
                result = tva_parent_to_asent_pred_justification(tactic, result);
                result = (SubLObject)ConsesLow.cons(tva_utilities.tva_assertion_support(tva_pred, parent_pred, trans_pred, tva_argnum), result);
                result = tva_index_to_parent_pred_justification(tactic, result);
            }
            else if (pcase_var.eql(tva_tactic.$const70$transitiveViaArgInverse) || pcase_var.eql(tva_tactic.$const71$conservativeViaArgInverse)) {
                result = (SubLObject)ConsesLow.cons(arguments.make_hl_support(tva_utilities.tva_support_module_for_pred(trans_pred), (SubLObject)ConsesLow.list(trans_pred, asent_arg, assertion_arg), (SubLObject)tva_tactic.UNPROVIDED, (SubLObject)tva_tactic.UNPROVIDED), result);
                result = tva_parent_to_asent_pred_justification(tactic, result);
                result = (SubLObject)ConsesLow.cons(tva_utilities.tva_assertion_support(tva_pred, parent_pred, trans_pred, tva_argnum), result);
                result = tva_index_to_parent_pred_justification(tactic, result);
            }
            else {
                Errors.cerror((SubLObject)tva_tactic.$str131$Continue_Anyway_, (SubLObject)tva_tactic.$str75$Error_in_predicate__a, tva_pred);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 25236L)
    public static SubLObject tva_index_to_parent_pred_justification(final SubLObject tactic, final SubLObject supports) {
        final SubLObject index_pred = tva_tactic_index_pred(tactic);
        final SubLObject parent_pred = tva_tactic_parent_pred(tactic);
        final SubLObject inversesP = (SubLObject)SubLObjectFactory.makeBoolean(!SubLObjectFactory.makeBoolean(tva_tactic.NIL == tva_tactic_parent_pred_inverseP(tactic)).eql((SubLObject)SubLObjectFactory.makeBoolean(tva_tactic.NIL == sbhl_search_vars.genl_inverse_mode_p())));
        if (parent_pred.eql(index_pred) && tva_tactic.NIL == inversesP) {
            return supports;
        }
        if (tva_tactic.NIL != inversesP && tva_tactic.NIL != genl_inverse_support_in_supportsP(index_pred, parent_pred, supports)) {
            return supports;
        }
        if (tva_tactic.NIL != inversesP) {
            return (SubLObject)ConsesLow.cons(tva_utilities.genl_preds_support_from_pred_to_pred(index_pred, parent_pred, (SubLObject)tva_tactic.T), supports);
        }
        if (tva_tactic.NIL != genl_preds_support_in_supportsP(index_pred, parent_pred, supports)) {
            return supports;
        }
        return (SubLObject)ConsesLow.cons(tva_utilities.genl_preds_support_from_pred_to_pred(index_pred, parent_pred, (SubLObject)tva_tactic.NIL), supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 26118L)
    public static SubLObject tva_parent_to_asent_pred_justification(final SubLObject tactic, final SubLObject supports) {
        final SubLObject asent_pred = tva_inference.tva_asent_pred();
        final SubLObject parent_pred = tva_tactic_parent_pred(tactic);
        final SubLObject inverseP = tva_tactic_parent_pred_inverseP(tactic);
        if (parent_pred.eql(asent_pred) && tva_tactic.NIL == inverseP) {
            return supports;
        }
        if (tva_tactic.NIL != inverseP && tva_tactic.NIL != genl_inverse_support_in_supportsP(parent_pred, asent_pred, supports)) {
            return supports;
        }
        if (tva_tactic.NIL != inverseP) {
            return (SubLObject)ConsesLow.cons(tva_utilities.genl_preds_support_from_pred_to_pred(parent_pred, asent_pred, (SubLObject)tva_tactic.T), supports);
        }
        if (tva_tactic.NIL != genl_preds_support_in_supportsP(parent_pred, asent_pred, supports)) {
            return supports;
        }
        return (SubLObject)ConsesLow.cons(tva_utilities.genl_preds_support_from_pred_to_pred(parent_pred, asent_pred, (SubLObject)tva_tactic.NIL), supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 26962L)
    public static SubLObject genl_inverse_support_in_supportsP(final SubLObject spec, final SubLObject genl_inverse, final SubLObject supports) {
        SubLObject foundP = (SubLObject)tva_tactic.NIL;
        if (tva_tactic.NIL == foundP) {
            SubLObject csome_list_var = supports;
            SubLObject support = (SubLObject)tva_tactic.NIL;
            support = csome_list_var.first();
            while (tva_tactic.NIL == foundP && tva_tactic.NIL != csome_list_var) {
                if (tva_tactic.NIL != arguments.hl_support_p(support) && tva_tactic.NIL != arguments.genl_preds_support_p(support)) {
                    final SubLObject sentence = arguments.hl_support_sentence(support);
                    final SubLObject pred = cycl_utilities.formula_operator(sentence);
                    if (pred.eql(tva_tactic.$const73$genlInverse)) {
                        foundP = (SubLObject)SubLObjectFactory.makeBoolean(spec.eql(cycl_utilities.formula_arg1(sentence, (SubLObject)tva_tactic.UNPROVIDED)) && genl_inverse.eql(cycl_utilities.formula_arg2(sentence, (SubLObject)tva_tactic.UNPROVIDED)));
                    }
                }
                csome_list_var = csome_list_var.rest();
                support = csome_list_var.first();
            }
        }
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-tactic.lisp", position = 27549L)
    public static SubLObject genl_preds_support_in_supportsP(final SubLObject spec, final SubLObject genl_inverse, final SubLObject supports) {
        SubLObject foundP = (SubLObject)tva_tactic.NIL;
        if (tva_tactic.NIL == foundP) {
            SubLObject csome_list_var = supports;
            SubLObject support = (SubLObject)tva_tactic.NIL;
            support = csome_list_var.first();
            while (tva_tactic.NIL == foundP && tva_tactic.NIL != csome_list_var) {
                if (tva_tactic.NIL != arguments.hl_support_p(support) && tva_tactic.NIL != arguments.genl_preds_support_p(support)) {
                    final SubLObject sentence = arguments.hl_support_sentence(support);
                    final SubLObject pred = cycl_utilities.formula_operator(sentence);
                    if (pred.eql(tva_tactic.$const72$genlPreds)) {
                        foundP = (SubLObject)SubLObjectFactory.makeBoolean(spec.eql(cycl_utilities.formula_arg1(sentence, (SubLObject)tva_tactic.UNPROVIDED)) && genl_inverse.eql(cycl_utilities.formula_arg2(sentence, (SubLObject)tva_tactic.UNPROVIDED)));
                    }
                }
                csome_list_var = csome_list_var.rest();
                support = csome_list_var.first();
            }
        }
        return foundP;
    }
    
    public static SubLObject declare_tva_tactic_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_tactic_print_function_trampoline", "TVA-TACTIC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_tactic_p", "TVA-TACTIC-P", 1, 0, false);
        new $tva_tactic_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_type", "TVA-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_tva_pred", "TVA-TVA-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_index_pred", "TVA-INDEX-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_transitive_pred", "TVA-TRANSITIVE-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_argnum", "TVA-ARGNUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_term", "TVA-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_cost", "TVA-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_precomputation", "TVA-PRECOMPUTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_parent_pred", "TVA-PARENT-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_parent_pred_inverseP", "TVA-PARENT-PRED-INVERSE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "_csetf_tva_type", "_CSETF-TVA-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "_csetf_tva_tva_pred", "_CSETF-TVA-TVA-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "_csetf_tva_index_pred", "_CSETF-TVA-INDEX-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "_csetf_tva_transitive_pred", "_CSETF-TVA-TRANSITIVE-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "_csetf_tva_argnum", "_CSETF-TVA-ARGNUM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "_csetf_tva_term", "_CSETF-TVA-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "_csetf_tva_cost", "_CSETF-TVA-COST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "_csetf_tva_precomputation", "_CSETF-TVA-PRECOMPUTATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "_csetf_tva_parent_pred", "_CSETF-TVA-PARENT-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "_csetf_tva_parent_pred_inverseP", "_CSETF-TVA-PARENT-PRED-INVERSE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "make_tva_tactic", "MAKE-TVA-TACTIC", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "visit_defstruct_tva_tactic", "VISIT-DEFSTRUCT-TVA-TACTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "visit_defstruct_object_tva_tactic_method", "VISIT-DEFSTRUCT-OBJECT-TVA-TACTIC-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "print_tva_tactic", "PRINT-TVA-TACTIC", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "show_tva_tactic", "SHOW-TVA-TACTIC", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "new_tva_tactic", "NEW-TVA-TACTIC", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "copy_tva_tactic", "COPY-TVA-TACTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_tactic_tva_pred", "TVA-TACTIC-TVA-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_tactic_index_pred", "TVA-TACTIC-INDEX-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_tactic_transitive_pred", "TVA-TACTIC-TRANSITIVE-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_tactic_parent_pred", "TVA-TACTIC-PARENT-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_tactic_parent_pred_inverseP", "TVA-TACTIC-PARENT-PRED-INVERSE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_tactic_argnum", "TVA-TACTIC-ARGNUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_tactic_term", "TVA-TACTIC-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_tactic_cost", "TVA-TACTIC-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_tactic_type", "TVA-TACTIC-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_tactic_precomputation", "TVA-TACTIC-PRECOMPUTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_tactic_tva_argnum", "TVA-TACTIC-TVA-ARGNUM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_tactic_direction", "TVA-TACTIC-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_forward_direction_tacticP", "TVA-FORWARD-DIRECTION-TACTIC?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_sentence_arg_for_tactic", "TVA-SENTENCE-ARG-FOR-TACTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_tactic_argnum_to_strategy_argnum", "TVA-TACTIC-ARGNUM-TO-STRATEGY-ARGNUM", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.tva_tactic", "do_tva_precomputation_table", "DO-TVA-PRECOMPUTATION-TABLE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "set_tva_tactic_index_pred", "SET-TVA-TACTIC-INDEX-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "set_tva_tactic_cost", "SET-TVA-TACTIC-COST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "set_tva_tactic_precomputation", "SET-TVA-TACTIC-PRECOMPUTATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "set_tva_tactic_cost_possible_precomputation", "SET-TVA-TACTIC-COST-POSSIBLE-PRECOMPUTATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "sufficient_tactic_p", "SUFFICIENT-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_tactic_type_p", "TVA-TACTIC-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_typeL", "TVA-TYPE<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_lookup_tactic_p", "TVA-LOOKUP-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_precomputed_tactic_p", "TVA-PRECOMPUTED-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_calculate_closure_tactic_p", "TVA-CALCULATE-CLOSURE-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_predicate_extent_tactic_p", "TVA-PREDICATE-EXTENT-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_tacticL", "TVA-TACTIC<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_tactic_subsumes_tactic_p", "TVA-TACTIC-SUBSUMES-TACTIC-P", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_tactics_overlap_p", "TVA-TACTICS-OVERLAP-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_inverse_tactics_overlap_p", "TVA-INVERSE-TACTICS-OVERLAP-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "determine_tva_tactic_type", "DETERMINE-TVA-TACTIC-TYPE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "determine_tactic_type_from_cardinality", "DETERMINE-TACTIC-TYPE-FROM-CARDINALITY", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_cost_and_precomputation", "TVA-COST-AND-PRECOMPUTATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "prune_sbhl_closure_wrt_genl_preds_and_inverse", "PRUNE-SBHL-CLOSURE-WRT-GENL-PREDS-AND-INVERSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "compute_tva_closure", "COMPUTE-TVA-CLOSURE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_closure_cardinality", "TVA-CLOSURE-CARDINALITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_closure_cardinality_estimate", "TVA-CLOSURE-CARDINALITY-ESTIMATE", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.tva_tactic", "tva_do_all_gaf_arg_index", "TVA-DO-ALL-GAF-ARG-INDEX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.tva_tactic", "do_tva_sentences_for_lookup_tactic", "DO-TVA-SENTENCES-FOR-LOOKUP-TACTIC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.tva_tactic", "do_tva_sentences_for_precomputed_tactic", "DO-TVA-SENTENCES-FOR-PRECOMPUTED-TACTIC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.tva_tactic", "do_tva_sentences_for_calculate_closure_tactic", "DO-TVA-SENTENCES-FOR-CALCULATE-CLOSURE-TACTIC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.tva_tactic", "do_tva_sentences_for_predicate_extent_tactic", "DO-TVA-SENTENCES-FOR-PREDICATE-EXTENT-TACTIC");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "possibly_discharge_evaluatable_predicate_meta_tactic", "POSSIBLY-DISCHARGE-EVALUATABLE-PREDICATE-META-TACTIC", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "discharge_tva_precomputed_tactic", "DISCHARGE-TVA-PRECOMPUTED-TACTIC", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "discharge_tva_calculate_closure_tactic", "DISCHARGE-TVA-CALCULATE-CLOSURE-TACTIC", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "discharge_tva_predicate_extent_tactic", "DISCHARGE-TVA-PREDICATE-EXTENT-TACTIC", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_tactic_term_for_sentence_is_exceptionalP", "TVA-TACTIC-TERM-FOR-SENTENCE-IS-EXCEPTIONAL?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_justify_subsumption", "TVA-JUSTIFY-SUBSUMPTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_index_to_parent_pred_justification", "TVA-INDEX-TO-PARENT-PRED-JUSTIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "tva_parent_to_asent_pred_justification", "TVA-PARENT-TO-ASENT-PRED-JUSTIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "genl_inverse_support_in_supportsP", "GENL-INVERSE-SUPPORT-IN-SUPPORTS?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_tactic", "genl_preds_support_in_supportsP", "GENL-PREDS-SUPPORT-IN-SUPPORTS?", 3, 0, false);
        return (SubLObject)tva_tactic.NIL;
    }
    
    public static SubLObject init_tva_tactic_file() {
        tva_tactic.$dtp_tva_tactic$ = SubLFiles.defconstant("*DTP-TVA-TACTIC*", (SubLObject)tva_tactic.$sym0$TVA_TACTIC);
        tva_tactic.$tva_tactic_types$ = SubLFiles.deflexical("*TVA-TACTIC-TYPES*", (SubLObject)tva_tactic.$list63);
        return (SubLObject)tva_tactic.NIL;
    }
    
    public static SubLObject setup_tva_tactic_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), tva_tactic.$dtp_tva_tactic$.getGlobalValue(), Symbols.symbol_function((SubLObject)tva_tactic.$sym7$TVA_TACTIC_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)tva_tactic.$list8);
        Structures.def_csetf((SubLObject)tva_tactic.$sym9$TVA_TYPE, (SubLObject)tva_tactic.$sym10$_CSETF_TVA_TYPE);
        Structures.def_csetf((SubLObject)tva_tactic.$sym11$TVA_TVA_PRED, (SubLObject)tva_tactic.$sym12$_CSETF_TVA_TVA_PRED);
        Structures.def_csetf((SubLObject)tva_tactic.$sym13$TVA_INDEX_PRED, (SubLObject)tva_tactic.$sym14$_CSETF_TVA_INDEX_PRED);
        Structures.def_csetf((SubLObject)tva_tactic.$sym15$TVA_TRANSITIVE_PRED, (SubLObject)tva_tactic.$sym16$_CSETF_TVA_TRANSITIVE_PRED);
        Structures.def_csetf((SubLObject)tva_tactic.$sym17$TVA_ARGNUM, (SubLObject)tva_tactic.$sym18$_CSETF_TVA_ARGNUM);
        Structures.def_csetf((SubLObject)tva_tactic.$sym19$TVA_TERM, (SubLObject)tva_tactic.$sym20$_CSETF_TVA_TERM);
        Structures.def_csetf((SubLObject)tva_tactic.$sym21$TVA_COST, (SubLObject)tva_tactic.$sym22$_CSETF_TVA_COST);
        Structures.def_csetf((SubLObject)tva_tactic.$sym23$TVA_PRECOMPUTATION, (SubLObject)tva_tactic.$sym24$_CSETF_TVA_PRECOMPUTATION);
        Structures.def_csetf((SubLObject)tva_tactic.$sym25$TVA_PARENT_PRED, (SubLObject)tva_tactic.$sym26$_CSETF_TVA_PARENT_PRED);
        Structures.def_csetf((SubLObject)tva_tactic.$sym27$TVA_PARENT_PRED_INVERSE_, (SubLObject)tva_tactic.$sym28$_CSETF_TVA_PARENT_PRED_INVERSE_);
        Equality.identity((SubLObject)tva_tactic.$sym0$TVA_TACTIC);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), tva_tactic.$dtp_tva_tactic$.getGlobalValue(), Symbols.symbol_function((SubLObject)tva_tactic.$sym44$VISIT_DEFSTRUCT_OBJECT_TVA_TACTIC_METHOD));
        return (SubLObject)tva_tactic.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_tva_tactic_file();
    }
    
    @Override
	public void initializeVariables() {
        init_tva_tactic_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_tva_tactic_file();
    }
    
    static {
        me = (SubLFile)new tva_tactic();
        tva_tactic.$dtp_tva_tactic$ = null;
        tva_tactic.$tva_tactic_types$ = null;
        $sym0$TVA_TACTIC = SubLObjectFactory.makeSymbol("TVA-TACTIC");
        $sym1$TVA_TACTIC_P = SubLObjectFactory.makeSymbol("TVA-TACTIC-P");
        $list2 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("TYPE"), SubLObjectFactory.makeSymbol("TVA-PRED"), SubLObjectFactory.makeSymbol("INDEX-PRED"), SubLObjectFactory.makeSymbol("TRANSITIVE-PRED"), SubLObjectFactory.makeSymbol("ARGNUM"), SubLObjectFactory.makeSymbol("TERM"), SubLObjectFactory.makeSymbol("COST"), SubLObjectFactory.makeSymbol("PRECOMPUTATION"), SubLObjectFactory.makeSymbol("PARENT-PRED"), SubLObjectFactory.makeSymbol("PARENT-PRED-INVERSE?") });
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("TVA-PRED"), SubLObjectFactory.makeKeyword("INDEX-PRED"), SubLObjectFactory.makeKeyword("TRANSITIVE-PRED"), SubLObjectFactory.makeKeyword("ARGNUM"), SubLObjectFactory.makeKeyword("TERM"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeKeyword("PRECOMPUTATION"), SubLObjectFactory.makeKeyword("PARENT-PRED"), SubLObjectFactory.makeKeyword("PARENT-PRED-INVERSE?") });
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("TVA-TYPE"), SubLObjectFactory.makeSymbol("TVA-TVA-PRED"), SubLObjectFactory.makeSymbol("TVA-INDEX-PRED"), SubLObjectFactory.makeSymbol("TVA-TRANSITIVE-PRED"), SubLObjectFactory.makeSymbol("TVA-ARGNUM"), SubLObjectFactory.makeSymbol("TVA-TERM"), SubLObjectFactory.makeSymbol("TVA-COST"), SubLObjectFactory.makeSymbol("TVA-PRECOMPUTATION"), SubLObjectFactory.makeSymbol("TVA-PARENT-PRED"), SubLObjectFactory.makeSymbol("TVA-PARENT-PRED-INVERSE?") });
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-TVA-TYPE"), SubLObjectFactory.makeSymbol("_CSETF-TVA-TVA-PRED"), SubLObjectFactory.makeSymbol("_CSETF-TVA-INDEX-PRED"), SubLObjectFactory.makeSymbol("_CSETF-TVA-TRANSITIVE-PRED"), SubLObjectFactory.makeSymbol("_CSETF-TVA-ARGNUM"), SubLObjectFactory.makeSymbol("_CSETF-TVA-TERM"), SubLObjectFactory.makeSymbol("_CSETF-TVA-COST"), SubLObjectFactory.makeSymbol("_CSETF-TVA-PRECOMPUTATION"), SubLObjectFactory.makeSymbol("_CSETF-TVA-PARENT-PRED"), SubLObjectFactory.makeSymbol("_CSETF-TVA-PARENT-PRED-INVERSE?") });
        $sym6$PRINT_TVA_TACTIC = SubLObjectFactory.makeSymbol("PRINT-TVA-TACTIC");
        $sym7$TVA_TACTIC_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("TVA-TACTIC-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("TVA-TACTIC-P"));
        $sym9$TVA_TYPE = SubLObjectFactory.makeSymbol("TVA-TYPE");
        $sym10$_CSETF_TVA_TYPE = SubLObjectFactory.makeSymbol("_CSETF-TVA-TYPE");
        $sym11$TVA_TVA_PRED = SubLObjectFactory.makeSymbol("TVA-TVA-PRED");
        $sym12$_CSETF_TVA_TVA_PRED = SubLObjectFactory.makeSymbol("_CSETF-TVA-TVA-PRED");
        $sym13$TVA_INDEX_PRED = SubLObjectFactory.makeSymbol("TVA-INDEX-PRED");
        $sym14$_CSETF_TVA_INDEX_PRED = SubLObjectFactory.makeSymbol("_CSETF-TVA-INDEX-PRED");
        $sym15$TVA_TRANSITIVE_PRED = SubLObjectFactory.makeSymbol("TVA-TRANSITIVE-PRED");
        $sym16$_CSETF_TVA_TRANSITIVE_PRED = SubLObjectFactory.makeSymbol("_CSETF-TVA-TRANSITIVE-PRED");
        $sym17$TVA_ARGNUM = SubLObjectFactory.makeSymbol("TVA-ARGNUM");
        $sym18$_CSETF_TVA_ARGNUM = SubLObjectFactory.makeSymbol("_CSETF-TVA-ARGNUM");
        $sym19$TVA_TERM = SubLObjectFactory.makeSymbol("TVA-TERM");
        $sym20$_CSETF_TVA_TERM = SubLObjectFactory.makeSymbol("_CSETF-TVA-TERM");
        $sym21$TVA_COST = SubLObjectFactory.makeSymbol("TVA-COST");
        $sym22$_CSETF_TVA_COST = SubLObjectFactory.makeSymbol("_CSETF-TVA-COST");
        $sym23$TVA_PRECOMPUTATION = SubLObjectFactory.makeSymbol("TVA-PRECOMPUTATION");
        $sym24$_CSETF_TVA_PRECOMPUTATION = SubLObjectFactory.makeSymbol("_CSETF-TVA-PRECOMPUTATION");
        $sym25$TVA_PARENT_PRED = SubLObjectFactory.makeSymbol("TVA-PARENT-PRED");
        $sym26$_CSETF_TVA_PARENT_PRED = SubLObjectFactory.makeSymbol("_CSETF-TVA-PARENT-PRED");
        $sym27$TVA_PARENT_PRED_INVERSE_ = SubLObjectFactory.makeSymbol("TVA-PARENT-PRED-INVERSE?");
        $sym28$_CSETF_TVA_PARENT_PRED_INVERSE_ = SubLObjectFactory.makeSymbol("_CSETF-TVA-PARENT-PRED-INVERSE?");
        $kw29$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw30$TVA_PRED = SubLObjectFactory.makeKeyword("TVA-PRED");
        $kw31$INDEX_PRED = SubLObjectFactory.makeKeyword("INDEX-PRED");
        $kw32$TRANSITIVE_PRED = SubLObjectFactory.makeKeyword("TRANSITIVE-PRED");
        $kw33$ARGNUM = SubLObjectFactory.makeKeyword("ARGNUM");
        $kw34$TERM = SubLObjectFactory.makeKeyword("TERM");
        $kw35$COST = SubLObjectFactory.makeKeyword("COST");
        $kw36$PRECOMPUTATION = SubLObjectFactory.makeKeyword("PRECOMPUTATION");
        $kw37$PARENT_PRED = SubLObjectFactory.makeKeyword("PARENT-PRED");
        $kw38$PARENT_PRED_INVERSE_ = SubLObjectFactory.makeKeyword("PARENT-PRED-INVERSE?");
        $str39$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw40$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym41$MAKE_TVA_TACTIC = SubLObjectFactory.makeSymbol("MAKE-TVA-TACTIC");
        $kw42$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw43$END = SubLObjectFactory.makeKeyword("END");
        $sym44$VISIT_DEFSTRUCT_OBJECT_TVA_TACTIC_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-TVA-TACTIC-METHOD");
        $str45$tva_pred____a__ = SubLObjectFactory.makeString("tva-pred : ~a~%");
        $str46$tva_index_pred____a__ = SubLObjectFactory.makeString("tva-index-pred : ~a~%");
        $str47$tva_transitive_pred____a__ = SubLObjectFactory.makeString("tva-transitive-pred : ~a~%");
        $str48$tva_argnum____a__ = SubLObjectFactory.makeString("tva-argnum : ~a~%");
        $str49$tva_term____S__ = SubLObjectFactory.makeString("tva-term : ~S~%");
        $str50$tva_cost____a__ = SubLObjectFactory.makeString("tva-cost : ~a~%");
        $str51$tva_tactic_type____a__ = SubLObjectFactory.makeString("tva-tactic-type : ~a~%");
        $str52$tva_precomputation____a__ = SubLObjectFactory.makeString("tva-precomputation : ~a~%");
        $str53$tva_parent_pred____a__ = SubLObjectFactory.makeString("tva-parent-pred : ~a~%");
        $str54$tva_parent_pred_inverse_____a = SubLObjectFactory.makeString("tva-parent-pred-inverse? : ~a");
        $kw55$FREE = SubLObjectFactory.makeKeyword("FREE");
        $kw56$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $list57 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TVA-TACTIC"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym58$MARKING_VAR = SubLObjectFactory.makeUninternedSymbol("MARKING-VAR");
        $sym59$DO_SBHL_TABLE = SubLObjectFactory.makeSymbol("DO-SBHL-TABLE");
        $sym60$TVA_TACTIC_PRECOMPUTATION = SubLObjectFactory.makeSymbol("TVA-TACTIC-PRECOMPUTATION");
        $sym61$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $sym62$TVA_PRECOMPUTATION_P = SubLObjectFactory.makeSymbol("TVA-PRECOMPUTATION-P");
        $list63 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOOKUP"), (SubLObject)SubLObjectFactory.makeKeyword("PRECOMPUTED-CLOSURE"), (SubLObject)SubLObjectFactory.makeKeyword("CALCULATE-CLOSURE"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE-EXTENT"));
        $kw64$LOOKUP = SubLObjectFactory.makeKeyword("LOOKUP");
        $kw65$PRECOMPUTED_CLOSURE = SubLObjectFactory.makeKeyword("PRECOMPUTED-CLOSURE");
        $kw66$CALCULATE_CLOSURE = SubLObjectFactory.makeKeyword("CALCULATE-CLOSURE");
        $kw67$PREDICATE_EXTENT = SubLObjectFactory.makeKeyword("PREDICATE-EXTENT");
        $const68$transitiveViaArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transitiveViaArg"));
        $const69$conservativeViaArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conservativeViaArg"));
        $const70$transitiveViaArgInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transitiveViaArgInverse"));
        $const71$conservativeViaArgInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conservativeViaArgInverse"));
        $const72$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $const73$genlInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $str74$Continue_ = SubLObjectFactory.makeString("Continue?");
        $str75$Error_in_predicate__a = SubLObjectFactory.makeString("Error in predicate ~a");
        $kw76$BACKWARD = SubLObjectFactory.makeKeyword("BACKWARD");
        $str77$Error_in_direction__a = SubLObjectFactory.makeString("Error in direction ~a");
        $list78 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("ARGNUM"), (SubLObject)SubLObjectFactory.makeSymbol("DONE?-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym79$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym80$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym81$DO_GAF_ARG_INDEX = SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX");
        $kw82$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $kw83$INDEX = SubLObjectFactory.makeKeyword("INDEX");
        $kw84$TRUTH = SubLObjectFactory.makeKeyword("TRUTH");
        $kw85$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw86$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym87$PWHEN_FEATURE = SubLObjectFactory.makeSymbol("PWHEN-FEATURE");
        $kw88$CYC_SKSI = SubLObjectFactory.makeKeyword("CYC-SKSI");
        $sym89$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym90$SKSI_GAF_ARG_POSSIBLE_P = SubLObjectFactory.makeSymbol("SKSI-GAF-ARG-POSSIBLE-P");
        $sym91$DO_SKSI_GAF_ARG_INDEX_GP = SubLObjectFactory.makeSymbol("DO-SKSI-GAF-ARG-INDEX-GP");
        $kw92$INDEX_ARGNUM = SubLObjectFactory.makeKeyword("INDEX-ARGNUM");
        $list93 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TACTIC"), (SubLObject)SubLObjectFactory.makeSymbol("DONE?-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym94$PRED = SubLObjectFactory.makeUninternedSymbol("PRED");
        $sym95$ARG = SubLObjectFactory.makeUninternedSymbol("ARG");
        $sym96$ARGNUM = SubLObjectFactory.makeUninternedSymbol("ARGNUM");
        $sym97$TVA_TACTIC_ARGNUM = SubLObjectFactory.makeSymbol("TVA-TACTIC-ARGNUM");
        $sym98$TVA_TACTIC_TERM = SubLObjectFactory.makeSymbol("TVA-TACTIC-TERM");
        $sym99$TVA_DO_ALL_GAF_ARG_INDEX = SubLObjectFactory.makeSymbol("TVA-DO-ALL-GAF-ARG-INDEX");
        $sym100$PRED = SubLObjectFactory.makeUninternedSymbol("PRED");
        $sym101$ARG = SubLObjectFactory.makeUninternedSymbol("ARG");
        $sym102$ARGNUM = SubLObjectFactory.makeUninternedSymbol("ARGNUM");
        $sym103$DO_TVA_PRECOMPUTATION_TABLE = SubLObjectFactory.makeSymbol("DO-TVA-PRECOMPUTATION-TABLE");
        $sym104$ARG = SubLObjectFactory.makeUninternedSymbol("ARG");
        $sym105$TRANS_PRED = SubLObjectFactory.makeUninternedSymbol("TRANS-PRED");
        $sym106$TRANS_PRED_MODULE = SubLObjectFactory.makeUninternedSymbol("TRANS-PRED-MODULE");
        $sym107$DIRECTION = SubLObjectFactory.makeUninternedSymbol("DIRECTION");
        $sym108$ARGNUM = SubLObjectFactory.makeUninternedSymbol("ARGNUM");
        $sym109$PRED = SubLObjectFactory.makeUninternedSymbol("PRED");
        $sym110$LINK_NODE = SubLObjectFactory.makeUninternedSymbol("LINK-NODE");
        $sym111$TVA_TACTIC_TRANSITIVE_PRED = SubLObjectFactory.makeSymbol("TVA-TACTIC-TRANSITIVE-PRED");
        $sym112$TVA_DIRECTION_FOR_TVA_PRED = SubLObjectFactory.makeSymbol("TVA-DIRECTION-FOR-TVA-PRED");
        $sym113$TVA_TACTIC_TVA_PRED = SubLObjectFactory.makeSymbol("TVA-TACTIC-TVA-PRED");
        $sym114$PIF = SubLObjectFactory.makeSymbol("PIF");
        $list115 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")));
        $sym116$GET_SBHL_MODULE = SubLObjectFactory.makeSymbol("GET-SBHL-MODULE");
        $sym117$DO_ALL_SIMPLE_TRUE_LINKS_FOR_INVERSES = SubLObjectFactory.makeSymbol("DO-ALL-SIMPLE-TRUE-LINKS-FOR-INVERSES");
        $sym118$DO_GHL_CLOSURE = SubLObjectFactory.makeSymbol("DO-GHL-CLOSURE");
        $sym119$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym120$PRED = SubLObjectFactory.makeUninternedSymbol("PRED");
        $list121 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TVA-ITERATES-KB-PREDICATE-EXTENT?"));
        $sym122$DO_PREDICATE_EXTENT_INDEX = SubLObjectFactory.makeSymbol("DO-PREDICATE-EXTENT-INDEX");
        $list123 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TVA-ITERATES-SKSI-PREDICATE-EXTENT?"));
        $sym124$DO_SKSI_PREDICATE_EXTENT_INDEX = SubLObjectFactory.makeSymbol("DO-SKSI-PREDICATE-EXTENT-INDEX");
        $const125$temporallySubsumes = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes"));
        $kw126$TIME = SubLObjectFactory.makeKeyword("TIME");
        $list127 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FAIL-SPACE"), (SubLObject)SubLObjectFactory.makeSymbol("GOAL-SPACE"));
        $const128$exceptForInArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exceptForInArg"));
        $list129 = ConsesLow.list((SubLObject)tva_tactic.ONE_INTEGER, (SubLObject)tva_tactic.TWO_INTEGER);
        $list130 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXCEPT-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("EXCEPT-ARGNUM"));
        $str131$Continue_Anyway_ = SubLObjectFactory.makeString("Continue Anyway?");
    }
    
    public static final class $tva_tactic_native extends SubLStructNative
    {
        public SubLObject $type;
        public SubLObject $tva_pred;
        public SubLObject $index_pred;
        public SubLObject $transitive_pred;
        public SubLObject $argnum;
        public SubLObject $term;
        public SubLObject $cost;
        public SubLObject $precomputation;
        public SubLObject $parent_pred;
        public SubLObject $parent_pred_inverseP;
        private static final SubLStructDeclNative structDecl;
        
        public $tva_tactic_native() {
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$tva_pred = (SubLObject)CommonSymbols.NIL;
            this.$index_pred = (SubLObject)CommonSymbols.NIL;
            this.$transitive_pred = (SubLObject)CommonSymbols.NIL;
            this.$argnum = (SubLObject)CommonSymbols.NIL;
            this.$term = (SubLObject)CommonSymbols.NIL;
            this.$cost = (SubLObject)CommonSymbols.NIL;
            this.$precomputation = (SubLObject)CommonSymbols.NIL;
            this.$parent_pred = (SubLObject)CommonSymbols.NIL;
            this.$parent_pred_inverseP = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$tva_tactic_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$type;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$tva_pred;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$index_pred;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$transitive_pred;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$argnum;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$term;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$cost;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$precomputation;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$parent_pred;
        }
        
        @Override
		public SubLObject getField11() {
            return this.$parent_pred_inverseP;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$type = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$tva_pred = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$index_pred = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$transitive_pred = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$argnum = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$term = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$cost = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$precomputation = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$parent_pred = value;
        }
        
        @Override
		public SubLObject setField11(final SubLObject value) {
            return this.$parent_pred_inverseP = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$tva_tactic_native.class, tva_tactic.$sym0$TVA_TACTIC, tva_tactic.$sym1$TVA_TACTIC_P, tva_tactic.$list2, tva_tactic.$list3, new String[] { "$type", "$tva_pred", "$index_pred", "$transitive_pred", "$argnum", "$term", "$cost", "$precomputation", "$parent_pred", "$parent_pred_inverseP" }, tva_tactic.$list4, tva_tactic.$list5, tva_tactic.$sym6$PRINT_TVA_TACTIC);
        }
    }
    
    public static final class $tva_tactic_p$UnaryFunction extends UnaryFunction
    {
        public $tva_tactic_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TVA-TACTIC-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return tva_tactic.tva_tactic_p(arg1);
        }
    }
}

/*

	Total time: 344 ms
	
*/