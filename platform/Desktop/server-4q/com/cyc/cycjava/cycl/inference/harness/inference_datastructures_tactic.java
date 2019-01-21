package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_datastructures_tactic extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic";
    public static final String myFingerPrint = "cc8700a5c12d70cb46fdffd0bc03675065b9c3b955e19f8972fc61b4c630f3e1";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 882L)
    public static SubLSymbol $leviathan_avoid_logical_tactic_productivity_computationP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1331L)
    public static SubLSymbol $dtp_tactic$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 10659L)
    private static SubLSymbol $tactic_productivity_smoothing_method$;
    private static final SubLSymbol $sym0$TACTIC;
    private static final SubLSymbol $sym1$TACTIC_P;
    private static final SubLInteger $int2$210;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$PRINT_TACTIC;
    private static final SubLSymbol $sym8$TACTIC_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$TACT_SUID;
    private static final SubLSymbol $sym11$_CSETF_TACT_SUID;
    private static final SubLSymbol $sym12$TACT_PROBLEM;
    private static final SubLSymbol $sym13$_CSETF_TACT_PROBLEM;
    private static final SubLSymbol $sym14$TACT_TYPE;
    private static final SubLSymbol $sym15$_CSETF_TACT_TYPE;
    private static final SubLSymbol $sym16$TACT_HL_MODULE;
    private static final SubLSymbol $sym17$_CSETF_TACT_HL_MODULE;
    private static final SubLSymbol $sym18$TACT_COMPLETENESS;
    private static final SubLSymbol $sym19$_CSETF_TACT_COMPLETENESS;
    private static final SubLSymbol $sym20$TACT_PREFERENCE_LEVEL_JUSTIFICATION;
    private static final SubLSymbol $sym21$_CSETF_TACT_PREFERENCE_LEVEL_JUSTIFICATION;
    private static final SubLSymbol $sym22$TACT_PRODUCTIVITY;
    private static final SubLSymbol $sym23$_CSETF_TACT_PRODUCTIVITY;
    private static final SubLSymbol $sym24$TACT_ORIGINAL_PRODUCTIVITY;
    private static final SubLSymbol $sym25$_CSETF_TACT_ORIGINAL_PRODUCTIVITY;
    private static final SubLSymbol $sym26$TACT_STATUS;
    private static final SubLSymbol $sym27$_CSETF_TACT_STATUS;
    private static final SubLSymbol $sym28$TACT_PROGRESS_ITERATOR;
    private static final SubLSymbol $sym29$_CSETF_TACT_PROGRESS_ITERATOR;
    private static final SubLSymbol $sym30$TACT_DATA;
    private static final SubLSymbol $sym31$_CSETF_TACT_DATA;
    private static final SubLSymbol $sym32$TACT_PROPERTIES;
    private static final SubLSymbol $sym33$_CSETF_TACT_PROPERTIES;
    private static final SubLSymbol $kw34$SUID;
    private static final SubLSymbol $kw35$PROBLEM;
    private static final SubLSymbol $kw36$TYPE;
    private static final SubLSymbol $kw37$HL_MODULE;
    private static final SubLSymbol $kw38$COMPLETENESS;
    private static final SubLSymbol $kw39$PREFERENCE_LEVEL_JUSTIFICATION;
    private static final SubLSymbol $kw40$PRODUCTIVITY;
    private static final SubLSymbol $kw41$ORIGINAL_PRODUCTIVITY;
    private static final SubLSymbol $kw42$STATUS;
    private static final SubLSymbol $kw43$PROGRESS_ITERATOR;
    private static final SubLSymbol $kw44$DATA;
    private static final SubLSymbol $kw45$PROPERTIES;
    private static final SubLString $str46$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw47$BEGIN;
    private static final SubLSymbol $sym48$MAKE_TACTIC;
    private static final SubLSymbol $kw49$SLOT;
    private static final SubLSymbol $kw50$END;
    private static final SubLSymbol $sym51$VISIT_DEFSTRUCT_OBJECT_TACTIC_METHOD;
    private static final SubLSymbol $kw52$FREE;
    private static final SubLString $str53$_Invalid_TACTIC__s_;
    private static final SubLString $str54$__a_TACTIC__a__a__a___a__a__;
    private static final SubLSymbol $sym55$SXHASH_TACTIC_METHOD;
    private static final SubLSymbol $sym56$PROBLEM_P;
    private static final SubLSymbol $sym57$HL_MODULE_P;
    private static final SubLSymbol $kw58$POSSIBLE;
    private static final SubLSymbol $kw59$RECURSIVE_INFERENCES;
    private static final SubLString $str60$proofy_problem__a_is_possible_but;
    private static final SubLSymbol $sym61$PREFERENCE_LEVEL_P;
    private static final SubLString $str62$tactical_productivity_being_refer;
    private static final SubLSymbol $sym63$COMPLETENESS_P;
    private static final SubLString $str64$;
    private static final SubLSymbol $sym65$PRODUCTIVITY_P;
    private static final SubLSymbol $sym66$TACTIC_STATUS_P;
    private static final SubLSymbol $sym67$META_SPLIT_TACTIC_P;
    private static final SubLSymbol $sym68$PROPERTY_LIST_P;
    private static final SubLList $list69;
    private static final SubLSymbol $sym70$DO_PROBLEM_RELEVANT_STRATEGIES;
    private static final SubLSymbol $sym71$TACTIC_PROBLEM;
    private static final SubLList $list72;
    private static final SubLList $list73;
    private static final SubLSymbol $kw74$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw75$DONE;
    private static final SubLSymbol $kw76$PREFERENCE_LEVEL;
    private static final SubLSymbol $sym77$TACTIC_VAR;
    private static final SubLSymbol $sym78$CLET;
    private static final SubLSymbol $sym79$DO_PROBLEM_TACTICS;
    private static final SubLSymbol $sym80$PUNLESS;
    private static final SubLSymbol $kw81$EXECUTED;
    private static final SubLSymbol $kw82$DISCARDED;
    private static final SubLSymbol $kw83$NON_DISCARDED;
    private static final SubLSymbol $kw84$IN_PROGRESS;
    private static final SubLSymbol $kw85$EXECUTED_OR_IN_PROGRESS;
    private static final SubLSymbol $sym86$TACTIC_POSSIBLE_;
    private static final SubLSymbol $sym87$TACTIC_PROGRESS_ITERATOR_P;
    private static final SubLSymbol $sym88$_;
    private static final SubLSymbol $sym89$TACTIC_PRODUCTIVITY;
    private static final SubLSymbol $kw90$SKIP;
    private static final SubLSymbol $sym91$TACTIC_PROGRESS_DONE_;
    private static final SubLSymbol $sym92$TACTIC_PROGRESS_NEXT;
    private static final SubLSymbol $sym93$TACTIC_PROGRESS_FINALIZE;
    private static final SubLList $list94;
    private static final SubLSymbol $kw95$REMOVAL_EXPAND;
    private static final SubLSymbol $kw96$REMOVAL_OUTPUT_GENERATE;
    private static final SubLList $list97;
    private static final SubLSymbol $kw98$CONJUNCTIVE_REMOVAL_EXPAND;
    private static final SubLSymbol $kw99$CONJUNCTIVE_REMOVAL_EXPAND_ITERATIVE;
    private static final SubLSymbol $kw100$TRANSFORMATION_RULE_SELECT;
    private static final SubLSymbol $kw101$META_STRUCTURAL;
    private static final SubLString $str102$Time_to_implement_tactic_progress;
    private static final SubLList $list103;
    private static final SubLString $str104$Time_to_implement_tactic_progress;
    private static final SubLString $str105$Time_to_implement_tactic_progress;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1331L)
    public static SubLObject tactic_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_tactic(v_object, stream, (SubLObject)inference_datastructures_tactic.ZERO_INTEGER);
        return (SubLObject)inference_datastructures_tactic.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1331L)
    public static SubLObject tactic_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $tactic_native.class) ? inference_datastructures_tactic.T : inference_datastructures_tactic.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1331L)
    public static SubLObject tact_suid(final SubLObject v_object) {
        assert inference_datastructures_tactic.NIL != tactic_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1331L)
    public static SubLObject tact_problem(final SubLObject v_object) {
        assert inference_datastructures_tactic.NIL != tactic_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1331L)
    public static SubLObject tact_type(final SubLObject v_object) {
        assert inference_datastructures_tactic.NIL != tactic_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1331L)
    public static SubLObject tact_hl_module(final SubLObject v_object) {
        assert inference_datastructures_tactic.NIL != tactic_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1331L)
    public static SubLObject tact_completeness(final SubLObject v_object) {
        assert inference_datastructures_tactic.NIL != tactic_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1331L)
    public static SubLObject tact_preference_level_justification(final SubLObject v_object) {
        assert inference_datastructures_tactic.NIL != tactic_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1331L)
    public static SubLObject tact_productivity(final SubLObject v_object) {
        assert inference_datastructures_tactic.NIL != tactic_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1331L)
    public static SubLObject tact_original_productivity(final SubLObject v_object) {
        assert inference_datastructures_tactic.NIL != tactic_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1331L)
    public static SubLObject tact_status(final SubLObject v_object) {
        assert inference_datastructures_tactic.NIL != tactic_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1331L)
    public static SubLObject tact_progress_iterator(final SubLObject v_object) {
        assert inference_datastructures_tactic.NIL != tactic_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1331L)
    public static SubLObject tact_data(final SubLObject v_object) {
        assert inference_datastructures_tactic.NIL != tactic_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1331L)
    public static SubLObject tact_properties(final SubLObject v_object) {
        assert inference_datastructures_tactic.NIL != tactic_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1331L)
    public static SubLObject _csetf_tact_suid(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_tactic.NIL != tactic_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1331L)
    public static SubLObject _csetf_tact_problem(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_tactic.NIL != tactic_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1331L)
    public static SubLObject _csetf_tact_type(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_tactic.NIL != tactic_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1331L)
    public static SubLObject _csetf_tact_hl_module(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_tactic.NIL != tactic_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1331L)
    public static SubLObject _csetf_tact_completeness(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_tactic.NIL != tactic_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1331L)
    public static SubLObject _csetf_tact_preference_level_justification(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_tactic.NIL != tactic_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1331L)
    public static SubLObject _csetf_tact_productivity(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_tactic.NIL != tactic_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1331L)
    public static SubLObject _csetf_tact_original_productivity(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_tactic.NIL != tactic_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1331L)
    public static SubLObject _csetf_tact_status(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_tactic.NIL != tactic_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1331L)
    public static SubLObject _csetf_tact_progress_iterator(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_tactic.NIL != tactic_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1331L)
    public static SubLObject _csetf_tact_data(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_tactic.NIL != tactic_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1331L)
    public static SubLObject _csetf_tact_properties(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_tactic.NIL != tactic_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1331L)
    public static SubLObject make_tactic(SubLObject arglist) {
        if (arglist == inference_datastructures_tactic.UNPROVIDED) {
            arglist = (SubLObject)inference_datastructures_tactic.NIL;
        }
        final SubLObject v_new = (SubLObject)new $tactic_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)inference_datastructures_tactic.NIL, next = arglist; inference_datastructures_tactic.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)inference_datastructures_tactic.$kw34$SUID)) {
                _csetf_tact_suid(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_tactic.$kw35$PROBLEM)) {
                _csetf_tact_problem(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_tactic.$kw36$TYPE)) {
                _csetf_tact_type(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_tactic.$kw37$HL_MODULE)) {
                _csetf_tact_hl_module(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_tactic.$kw38$COMPLETENESS)) {
                _csetf_tact_completeness(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_tactic.$kw39$PREFERENCE_LEVEL_JUSTIFICATION)) {
                _csetf_tact_preference_level_justification(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_tactic.$kw40$PRODUCTIVITY)) {
                _csetf_tact_productivity(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_tactic.$kw41$ORIGINAL_PRODUCTIVITY)) {
                _csetf_tact_original_productivity(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_tactic.$kw42$STATUS)) {
                _csetf_tact_status(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_tactic.$kw43$PROGRESS_ITERATOR)) {
                _csetf_tact_progress_iterator(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_tactic.$kw44$DATA)) {
                _csetf_tact_data(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_tactic.$kw45$PROPERTIES)) {
                _csetf_tact_properties(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)inference_datastructures_tactic.$str46$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1331L)
    public static SubLObject visit_defstruct_tactic(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_tactic.$kw47$BEGIN, (SubLObject)inference_datastructures_tactic.$sym48$MAKE_TACTIC, (SubLObject)inference_datastructures_tactic.TWELVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_tactic.$kw49$SLOT, (SubLObject)inference_datastructures_tactic.$kw34$SUID, tact_suid(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_tactic.$kw49$SLOT, (SubLObject)inference_datastructures_tactic.$kw35$PROBLEM, tact_problem(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_tactic.$kw49$SLOT, (SubLObject)inference_datastructures_tactic.$kw36$TYPE, tact_type(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_tactic.$kw49$SLOT, (SubLObject)inference_datastructures_tactic.$kw37$HL_MODULE, tact_hl_module(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_tactic.$kw49$SLOT, (SubLObject)inference_datastructures_tactic.$kw38$COMPLETENESS, tact_completeness(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_tactic.$kw49$SLOT, (SubLObject)inference_datastructures_tactic.$kw39$PREFERENCE_LEVEL_JUSTIFICATION, tact_preference_level_justification(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_tactic.$kw49$SLOT, (SubLObject)inference_datastructures_tactic.$kw40$PRODUCTIVITY, tact_productivity(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_tactic.$kw49$SLOT, (SubLObject)inference_datastructures_tactic.$kw41$ORIGINAL_PRODUCTIVITY, tact_original_productivity(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_tactic.$kw49$SLOT, (SubLObject)inference_datastructures_tactic.$kw42$STATUS, tact_status(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_tactic.$kw49$SLOT, (SubLObject)inference_datastructures_tactic.$kw43$PROGRESS_ITERATOR, tact_progress_iterator(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_tactic.$kw49$SLOT, (SubLObject)inference_datastructures_tactic.$kw44$DATA, tact_data(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_tactic.$kw49$SLOT, (SubLObject)inference_datastructures_tactic.$kw45$PROPERTIES, tact_properties(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_tactic.$kw50$END, (SubLObject)inference_datastructures_tactic.$sym48$MAKE_TACTIC, (SubLObject)inference_datastructures_tactic.TWELVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1331L)
    public static SubLObject visit_defstruct_object_tactic_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_tactic(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 3058L)
    public static SubLObject valid_tactic_p(final SubLObject tactic) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_tactic.NIL != tactic_p(tactic) && inference_datastructures_tactic.NIL == tactic_invalid_p(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 3174L)
    public static SubLObject invalid_tactic_p(final SubLObject tactic) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_tactic.NIL != tactic_p(tactic) && inference_datastructures_tactic.NIL != tactic_invalid_p(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 3285L)
    public static SubLObject tactic_invalid_p(final SubLObject tactic) {
        return Equality.eq((SubLObject)inference_datastructures_tactic.$kw52$FREE, tactic_status(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 3405L)
    public static SubLObject print_tactic(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_datastructures_tactic.NIL != tactic_invalid_p(v_object)) {
            PrintLow.format(stream, (SubLObject)inference_datastructures_tactic.$str53$_Invalid_TACTIC__s_, tactic_suid(v_object));
        }
        else {
            final SubLObject problem = tactic_problem(v_object);
            PrintLow.format(stream, (SubLObject)inference_datastructures_tactic.$str54$__a_TACTIC__a__a__a___a__a__, new SubLObject[] { tactic_hl_module_name(v_object), inference_datastructures_problem_store.problem_store_suid(inference_datastructures_problem.problem_store(problem)), inference_datastructures_problem.problem_suid(problem), tactic_suid(v_object), (inference_datastructures_tactic.NIL != inference_datastructures_tactic.$leviathan_avoid_logical_tactic_productivity_computationP$.getDynamicValue(thread) && inference_datastructures_tactic.NIL != inference_worker.logical_tactic_p(v_object)) ? inference_datastructures_tactic.NIL : tactic_productivity(v_object), tact_completeness(v_object) });
        }
        return (SubLObject)inference_datastructures_tactic.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 4077L)
    public static SubLObject sxhash_tactic_method(final SubLObject v_object) {
        final SubLObject problem = tactic_problem(v_object);
        if (inference_datastructures_tactic.NIL != inference_datastructures_problem.valid_problem_p(problem)) {
            return Numbers.logxor(inference_datastructures_problem.problem_suid(problem), tactic_suid(v_object));
        }
        return (SubLObject)inference_datastructures_tactic.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 4429L)
    public static SubLObject new_tactic(final SubLObject problem, final SubLObject hl_module, SubLObject data) {
        if (data == inference_datastructures_tactic.UNPROVIDED) {
            data = (SubLObject)inference_datastructures_tactic.NIL;
        }
        assert inference_datastructures_tactic.NIL != inference_datastructures_problem.problem_p(problem) : problem;
        assert inference_datastructures_tactic.NIL != inference_modules.hl_module_p(hl_module) : hl_module;
        final SubLObject tactic = make_tactic((SubLObject)inference_datastructures_tactic.UNPROVIDED);
        final SubLObject suid = inference_datastructures_problem.problem_next_tactic_suid(problem);
        _csetf_tact_suid(tactic, suid);
        _csetf_tact_problem(tactic, problem);
        _csetf_tact_type(tactic, inference_datastructures_enumerated_types.tactic_type_from_hl_module(hl_module));
        _csetf_tact_hl_module(tactic, hl_module);
        set_tactic_status(tactic, (SubLObject)inference_datastructures_tactic.$kw58$POSSIBLE);
        _csetf_tact_progress_iterator(tactic, (SubLObject)inference_datastructures_tactic.NIL);
        set_tactic_data(tactic, data);
        inference_datastructures_problem.add_problem_tactic(problem, tactic);
        inference_metrics.increment_tactic_historical_count();
        inference_datastructures_problem_store.problem_store_increment_historical_tactic_count(inference_datastructures_problem.problem_store(problem));
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 5358L)
    public static SubLObject destroy_problem_tactic(final SubLObject tactic) {
        if (inference_datastructures_tactic.NIL != valid_tactic_p(tactic)) {
            SubLObject cdolist_list_var;
            final SubLObject recursive_inferences = cdolist_list_var = conses_high.getf(tactic_properties(tactic), (SubLObject)inference_datastructures_tactic.$kw59$RECURSIVE_INFERENCES, (SubLObject)inference_datastructures_tactic.UNPROVIDED);
            SubLObject recursive_inference = (SubLObject)inference_datastructures_tactic.NIL;
            recursive_inference = cdolist_list_var.first();
            while (inference_datastructures_tactic.NIL != cdolist_list_var) {
                if (tactic_store(tactic).eql(inference_datastructures_inference.inference_problem_store(recursive_inference))) {
                    inference_datastructures_inference.destroy_inference(recursive_inference);
                }
                cdolist_list_var = cdolist_list_var.rest();
                recursive_inference = cdolist_list_var.first();
            }
            destroy_tactic_progress_iterator(tactic);
            note_tactic_invalid(tactic);
            final SubLObject problem = tactic_problem(tactic);
            destroy_tactic_int(tactic);
            if (inference_datastructures_tactic.NIL != inference_datastructures_problem.tactically_possible_problem_p(problem) && inference_datastructures_problem.problem_tactic_count(problem).isZero()) {
                if (inference_datastructures_tactic.NIL != inference_datastructures_problem.problem_has_some_proven_proofP(problem)) {
                    Errors.warn((SubLObject)inference_datastructures_tactic.$str60$proofy_problem__a_is_possible_but, problem);
                }
                else {
                    inference_datastructures_problem.destroy_problem(problem);
                }
            }
        }
        return (SubLObject)inference_datastructures_tactic.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 6231L)
    public static SubLObject destroy_problem_tactic_and_backpointers(final SubLObject tactic) {
        final SubLObject problem = tactic_problem(tactic);
        if (inference_datastructures_tactic.NIL != inference_datastructures_problem.valid_problem_p(problem)) {
            inference_datastructures_problem.remove_problem_tactic(problem, tactic);
        }
        destroy_problem_tactic(tactic);
        return (SubLObject)inference_datastructures_tactic.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 6474L)
    public static SubLObject destroy_tactic_progress_iterator(final SubLObject tactic) {
        final SubLObject progress_iterator = tactic_progress_iterator(tactic);
        if (inference_datastructures_tactic.NIL != tactic_progress_iterator_p(progress_iterator)) {
            finalize_tactic_progress_iterator(progress_iterator);
            _csetf_tact_progress_iterator(tactic, (SubLObject)inference_datastructures_tactic.NIL);
        }
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 6783L)
    public static SubLObject destroy_tactic_int(final SubLObject tactic) {
        _csetf_tact_properties(tactic, (SubLObject)inference_datastructures_tactic.$kw52$FREE);
        _csetf_tact_data(tactic, (SubLObject)inference_datastructures_tactic.$kw52$FREE);
        _csetf_tact_progress_iterator(tactic, (SubLObject)inference_datastructures_tactic.$kw52$FREE);
        _csetf_tact_completeness(tactic, (SubLObject)inference_datastructures_tactic.$kw52$FREE);
        _csetf_tact_preference_level_justification(tactic, (SubLObject)inference_datastructures_tactic.$kw52$FREE);
        _csetf_tact_productivity(tactic, (SubLObject)inference_datastructures_tactic.$kw52$FREE);
        _csetf_tact_original_productivity(tactic, (SubLObject)inference_datastructures_tactic.$kw52$FREE);
        _csetf_tact_hl_module(tactic, (SubLObject)inference_datastructures_tactic.$kw52$FREE);
        _csetf_tact_problem(tactic, (SubLObject)inference_datastructures_tactic.$kw52$FREE);
        return (SubLObject)inference_datastructures_tactic.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 7290L)
    public static SubLObject note_tactic_invalid(final SubLObject tactic) {
        _csetf_tact_status(tactic, (SubLObject)inference_datastructures_tactic.$kw52$FREE);
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 7389L)
    public static SubLObject tactic_suid(final SubLObject tactic) {
        assert inference_datastructures_tactic.NIL != tactic_p(tactic) : tactic;
        return tact_suid(tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 7562L)
    public static SubLObject tactic_problem(final SubLObject tactic) {
        assert inference_datastructures_tactic.NIL != tactic_p(tactic) : tactic;
        return tact_problem(tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 7667L)
    public static SubLObject tactic_hl_module(final SubLObject tactic) {
        assert inference_datastructures_tactic.NIL != tactic_p(tactic) : tactic;
        return tact_hl_module(tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 7776L)
    public static SubLObject tactic_type(final SubLObject tactic) {
        assert inference_datastructures_tactic.NIL != tactic_p(tactic) : tactic;
        return tact_type(tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 7981L)
    public static SubLObject tactic_completeness(final SubLObject tactic) {
        assert inference_datastructures_tactic.NIL != tactic_p(tactic) : tactic;
        SubLObject completeness_or_preference = tact_completeness(tactic);
        if (inference_datastructures_tactic.NIL != preference_modules.preference_level_p(completeness_or_preference)) {
            completeness_or_preference = preference_modules.preference_level_to_completeness(completeness_or_preference);
        }
        return completeness_or_preference;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 8426L)
    public static SubLObject tactic_preference_level(final SubLObject tactic) {
        assert inference_datastructures_tactic.NIL != tactic_p(tactic) : tactic;
        final SubLObject completeness_or_preference = tact_completeness(tactic);
        if (inference_datastructures_tactic.NIL != completeness_or_preference && !inference_datastructures_tactic.assertionsDisabledInClass && inference_datastructures_tactic.NIL == preference_modules.preference_level_p(completeness_or_preference)) {
            throw new AssertionError(completeness_or_preference);
        }
        return completeness_or_preference;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 8875L)
    public static SubLObject tactic_preference_level_justification(final SubLObject tactic) {
        assert inference_datastructures_tactic.NIL != tactic_p(tactic) : tactic;
        return tact_preference_level_justification(tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 9026L)
    public static SubLObject tactic_productivity(final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_datastructures_tactic.NIL != tactic_p(tactic) : tactic;
        if (inference_datastructures_tactic.NIL != inference_datastructures_tactic.$leviathan_avoid_logical_tactic_productivity_computationP$.getDynamicValue(thread) && inference_datastructures_tactic.NIL != inference_worker.logical_tactic_p(tactic)) {
            return Errors.error((SubLObject)inference_datastructures_tactic.$str62$tactical_productivity_being_refer, tactic);
        }
        return tact_productivity(tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 9323L)
    public static SubLObject tactic_original_productivity(final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_datastructures_tactic.NIL != tactic_p(tactic) : tactic;
        if (inference_datastructures_tactic.NIL != inference_datastructures_tactic.$leviathan_avoid_logical_tactic_productivity_computationP$.getDynamicValue(thread) && inference_datastructures_tactic.NIL != inference_worker.logical_tactic_p(tactic)) {
            return Errors.error((SubLObject)inference_datastructures_tactic.$str62$tactical_productivity_being_refer, tactic);
        }
        return tact_original_productivity(tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 9638L)
    public static SubLObject tactic_status(final SubLObject tactic) {
        assert inference_datastructures_tactic.NIL != tactic_p(tactic) : tactic;
        return tact_status(tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 9741L)
    public static SubLObject tactic_progress_iterator(final SubLObject tactic) {
        assert inference_datastructures_tactic.NIL != tactic_p(tactic) : tactic;
        return tact_progress_iterator(tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 9866L)
    public static SubLObject tactic_data(final SubLObject tactic) {
        assert inference_datastructures_tactic.NIL != tactic_p(tactic) : tactic;
        return tact_data(tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 9965L)
    public static SubLObject tactic_properties(final SubLObject tactic) {
        assert inference_datastructures_tactic.NIL != tactic_p(tactic) : tactic;
        return tact_properties(tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 10076L)
    public static SubLObject set_tactic_completeness(final SubLObject tactic, final SubLObject completeness) {
        assert inference_datastructures_tactic.NIL != tactic_p(tactic) : tactic;
        assert inference_datastructures_tactic.NIL != inference_datastructures_enumerated_types.completeness_p(completeness) : completeness;
        _csetf_tact_completeness(tactic, completeness);
        _csetf_tact_preference_level_justification(tactic, (SubLObject)inference_datastructures_tactic.$str64$);
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 10351L)
    public static SubLObject set_tactic_preference_level(final SubLObject tactic, final SubLObject preference_level, final SubLObject justification) {
        assert inference_datastructures_tactic.NIL != tactic_p(tactic) : tactic;
        assert inference_datastructures_tactic.NIL != preference_modules.preference_level_p(preference_level) : preference_level;
        _csetf_tact_completeness(tactic, preference_level);
        _csetf_tact_preference_level_justification(tactic, justification);
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 10835L)
    public static SubLObject set_tactic_productivity(final SubLObject tactic, SubLObject productivity, SubLObject set_originalP) {
        if (set_originalP == inference_datastructures_tactic.UNPROVIDED) {
            set_originalP = (SubLObject)inference_datastructures_tactic.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_datastructures_tactic.NIL != tactic_p(tactic) : tactic;
        assert inference_datastructures_tactic.NIL != inference_datastructures_enumerated_types.productivity_p(productivity) : productivity;
        if (inference_datastructures_tactic.NIL != inference_datastructures_tactic.$leviathan_avoid_logical_tactic_productivity_computationP$.getDynamicValue(thread) && inference_datastructures_tactic.NIL != inference_worker.logical_tactic_p(tactic)) {
            return tactic;
        }
        if (inference_datastructures_tactic.NIL != inference_datastructures_tactic.$tactic_productivity_smoothing_method$.getDynamicValue(thread)) {
            productivity = Functions.funcall(inference_datastructures_tactic.$tactic_productivity_smoothing_method$.getDynamicValue(thread), productivity);
        }
        _csetf_tact_productivity(tactic, productivity);
        if (inference_datastructures_tactic.NIL != set_originalP) {
            _csetf_tact_original_productivity(tactic, productivity);
        }
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 11473L)
    public static SubLObject set_tactic_status(final SubLObject tactic, final SubLObject status) {
        assert inference_datastructures_tactic.NIL != tactic_p(tactic) : tactic;
        assert inference_datastructures_tactic.NIL != inference_datastructures_enumerated_types.tactic_status_p(status) : status;
        _csetf_tact_status(tactic, status);
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 11647L)
    public static SubLObject set_tactic_data(final SubLObject tactic, final SubLObject data) {
        assert inference_datastructures_tactic.NIL != tactic_p(tactic) : tactic;
        _csetf_tact_data(tactic, data);
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 11803L)
    public static SubLObject set_meta_split_tactic_data(final SubLObject tactic, final SubLObject data) {
        assert inference_datastructures_tactic.NIL != inference_worker_split.meta_split_tactic_p(tactic) : tactic;
        return set_tactic_data(tactic, data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 11944L)
    public static SubLObject set_tactic_properties(final SubLObject tactic, final SubLObject v_properties) {
        assert inference_datastructures_tactic.NIL != tactic_p(tactic) : tactic;
        assert inference_datastructures_tactic.NIL != list_utilities.property_list_p(v_properties) : v_properties;
        _csetf_tact_properties(tactic, v_properties);
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 12140L)
    public static SubLObject set_tactic_property(final SubLObject tactic, final SubLObject key, final SubLObject value) {
        assert inference_datastructures_tactic.NIL != tactic_p(tactic) : tactic;
        conses_high.putf(tact_properties(tactic), key, value);
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 12289L)
    public static SubLObject push_tactic_property(final SubLObject tactic, final SubLObject key, final SubLObject value) {
        assert inference_datastructures_tactic.NIL != tactic_p(tactic) : tactic;
        SubLObject v_properties = tact_properties(tactic);
        v_properties = conses_high.putf(v_properties, key, (SubLObject)ConsesLow.cons(value, list_utilities.plist_lookup(v_properties, key, (SubLObject)inference_datastructures_tactic.NIL)));
        _csetf_tact_properties(tactic, v_properties);
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 12530L)
    public static SubLObject do_tactic_relevant_strategies(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_tactic.$list69);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject strategy_var = (SubLObject)inference_datastructures_tactic.NIL;
        SubLObject tactic = (SubLObject)inference_datastructures_tactic.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_tactic.$list69);
        strategy_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_tactic.$list69);
        tactic = current.first();
        current = current.rest();
        if (inference_datastructures_tactic.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_tactic.$sym70$DO_PROBLEM_RELEVANT_STRATEGIES, (SubLObject)ConsesLow.list(strategy_var, (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_tactic.$sym71$TACTIC_PROBLEM, tactic)), ConsesLow.append(body, (SubLObject)inference_datastructures_tactic.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_tactic.$list69);
        return (SubLObject)inference_datastructures_tactic.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 12841L)
    public static SubLObject do_tactic_sibling_tactics(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_tactic.$list72);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sibling_tactic_var = (SubLObject)inference_datastructures_tactic.NIL;
        SubLObject tactic = (SubLObject)inference_datastructures_tactic.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_tactic.$list72);
        sibling_tactic_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_tactic.$list72);
        tactic = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_datastructures_tactic.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_datastructures_tactic.NIL;
        SubLObject current_$1 = (SubLObject)inference_datastructures_tactic.NIL;
        while (inference_datastructures_tactic.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_tactic.$list72);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_tactic.$list72);
            if (inference_datastructures_tactic.NIL == conses_high.member(current_$1, (SubLObject)inference_datastructures_tactic.$list73, (SubLObject)inference_datastructures_tactic.UNPROVIDED, (SubLObject)inference_datastructures_tactic.UNPROVIDED)) {
                bad = (SubLObject)inference_datastructures_tactic.T;
            }
            if (current_$1 == inference_datastructures_tactic.$kw74$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_datastructures_tactic.NIL != bad && inference_datastructures_tactic.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_tactic.$list72);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_tactic.$kw75$DONE, current);
        final SubLObject done = (SubLObject)((inference_datastructures_tactic.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_datastructures_tactic.NIL);
        final SubLObject status_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_tactic.$kw42$STATUS, current);
        final SubLObject status = (SubLObject)((inference_datastructures_tactic.NIL != status_tail) ? conses_high.cadr(status_tail) : inference_datastructures_tactic.NIL);
        final SubLObject completeness_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_tactic.$kw38$COMPLETENESS, current);
        final SubLObject completeness = (SubLObject)((inference_datastructures_tactic.NIL != completeness_tail) ? conses_high.cadr(completeness_tail) : inference_datastructures_tactic.NIL);
        final SubLObject preference_level_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_tactic.$kw76$PREFERENCE_LEVEL, current);
        final SubLObject preference_level = (SubLObject)((inference_datastructures_tactic.NIL != preference_level_tail) ? conses_high.cadr(preference_level_tail) : inference_datastructures_tactic.NIL);
        final SubLObject hl_module_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_tactic.$kw37$HL_MODULE, current);
        final SubLObject hl_module = (SubLObject)((inference_datastructures_tactic.NIL != hl_module_tail) ? conses_high.cadr(hl_module_tail) : inference_datastructures_tactic.NIL);
        final SubLObject type_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_tactic.$kw36$TYPE, current);
        final SubLObject type = (SubLObject)((inference_datastructures_tactic.NIL != type_tail) ? conses_high.cadr(type_tail) : inference_datastructures_tactic.NIL);
        final SubLObject productivity_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_tactic.$kw40$PRODUCTIVITY, current);
        final SubLObject productivity = (SubLObject)((inference_datastructures_tactic.NIL != productivity_tail) ? conses_high.cadr(productivity_tail) : inference_datastructures_tactic.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject tactic_var = (SubLObject)inference_datastructures_tactic.$sym77$TACTIC_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_tactic.$sym78$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(tactic_var, tactic)), (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_tactic.$sym79$DO_PROBLEM_TACTICS, (SubLObject)ConsesLow.list(new SubLObject[] { sibling_tactic_var, ConsesLow.list((SubLObject)inference_datastructures_tactic.$sym71$TACTIC_PROBLEM, tactic_var), inference_datastructures_tactic.$kw75$DONE, done, inference_datastructures_tactic.$kw42$STATUS, status, inference_datastructures_tactic.$kw38$COMPLETENESS, completeness, inference_datastructures_tactic.$kw76$PREFERENCE_LEVEL, preference_level, inference_datastructures_tactic.$kw37$HL_MODULE, hl_module, inference_datastructures_tactic.$kw36$TYPE, type, inference_datastructures_tactic.$kw40$PRODUCTIVITY, productivity }), (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_tactic.$sym80$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_tactic.EQ, sibling_tactic_var, tactic_var), ConsesLow.append(body, (SubLObject)inference_datastructures_tactic.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 13485L)
    public static SubLObject tactic_ids(final SubLObject tactic) {
        return Values.values(inference_datastructures_problem_store.problem_store_suid(tactic_store(tactic)), inference_datastructures_problem.problem_suid(tactic_problem(tactic)), tactic_suid(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 13690L)
    public static SubLObject find_tactic_by_id(final SubLObject problem, final SubLObject id) {
        assert inference_datastructures_tactic.NIL != inference_datastructures_problem.problem_p(problem) : problem;
        final SubLObject count = inference_datastructures_problem.problem_tactic_count(problem);
        final SubLObject index = number_utilities.f_1_(Numbers.subtract(count, id));
        if (inference_datastructures_tactic.NIL != subl_promotions.non_negative_integer_p(index)) {
            final SubLObject tactics = inference_datastructures_problem.problem_tactics(problem);
            return ConsesLow.nth(index, tactics);
        }
        return (SubLObject)inference_datastructures_tactic.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 14044L)
    public static SubLObject find_tactic_by_ids(final SubLObject store_suid, final SubLObject problem_suid, final SubLObject tactic_suid) {
        final SubLObject problem = inference_datastructures_problem_store.find_problem_by_ids(store_suid, problem_suid);
        if (inference_datastructures_tactic.NIL != problem) {
            final SubLObject tactic = find_tactic_by_id(problem, tactic_suid);
            return tactic;
        }
        return (SubLObject)inference_datastructures_tactic.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 14286L)
    public static SubLObject tactic_hl_module_name(final SubLObject tactic) {
        return inference_modules.hl_module_name(tactic_hl_module(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 14388L)
    public static SubLObject tactic_possibleP(final SubLObject tactic) {
        return Equality.eq((SubLObject)inference_datastructures_tactic.$kw58$POSSIBLE, tactic_status(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 14480L)
    public static SubLObject tactic_in_progressP(final SubLObject tactic) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_tactic.NIL != tactic_possibleP(tactic) && inference_datastructures_tactic.NIL != tactic_progress_iterator_p(tactic_progress_iterator(tactic)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 14639L)
    public static SubLObject tactic_not_possibleP(final SubLObject tactic) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_tactic.NIL == tactic_possibleP(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 14730L)
    public static SubLObject tactic_executedP(final SubLObject tactic) {
        return Equality.eq((SubLObject)inference_datastructures_tactic.$kw81$EXECUTED, tactic_status(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 14822L)
    public static SubLObject tactic_discardedP(final SubLObject tactic) {
        return Equality.eq((SubLObject)inference_datastructures_tactic.$kw82$DISCARDED, tactic_status(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 14916L)
    public static SubLObject tactic_has_statusP(final SubLObject tactic, final SubLObject status_spec) {
        if (status_spec.eql((SubLObject)inference_datastructures_tactic.$kw83$NON_DISCARDED)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_tactic.NIL == tactic_discardedP(tactic));
        }
        if (status_spec.eql((SubLObject)inference_datastructures_tactic.$kw84$IN_PROGRESS)) {
            return tactic_in_progressP(tactic);
        }
        if (status_spec.eql((SubLObject)inference_datastructures_tactic.$kw85$EXECUTED_OR_IN_PROGRESS)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_tactic.NIL != tactic_executedP(tactic) || inference_datastructures_tactic.NIL != tactic_in_progressP(tactic));
        }
        return Equality.eq(status_spec, tactic_status(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 15351L)
    public static SubLObject abductive_tacticP(final SubLObject tactic) {
        return inference_modules.abductive_hl_moduleP(tactic_hl_module(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 15455L)
    public static SubLObject tactic_store(final SubLObject tactic) {
        return inference_datastructures_problem.problem_store(tactic_problem(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 15545L)
    public static SubLObject tactic_problem_query(final SubLObject tactic) {
        final SubLObject problem = tactic_problem(tactic);
        return inference_datastructures_problem.problem_query(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 15722L)
    public static SubLObject tactic_problem_sole_clause(final SubLObject tactic) {
        final SubLObject problem = tactic_problem(tactic);
        return inference_datastructures_problem.problem_sole_clause(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 15980L)
    public static SubLObject update_tactic_productivity(final SubLObject tactic, final SubLObject new_productivity) {
        final SubLObject old_productivity = tactic_productivity(tactic);
        set_tactic_productivity(tactic, new_productivity, (SubLObject)inference_datastructures_tactic.NIL);
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 16395L)
    public static SubLObject decrement_tactic_productivity_for_number_of_children(final SubLObject tactic, SubLObject number) {
        if (number == inference_datastructures_tactic.UNPROVIDED) {
            number = (SubLObject)inference_datastructures_tactic.ONE_INTEGER;
        }
        final SubLObject old_productivity = tactic_productivity(tactic);
        SubLObject new_productivity = inference_datastructures_enumerated_types.decrement_productivity_for_number_of_children(old_productivity, number);
        new_productivity = Numbers.max(new_productivity, (SubLObject)inference_datastructures_tactic.ZERO_INTEGER);
        set_tactic_productivity(tactic, new_productivity, (SubLObject)inference_datastructures_tactic.NIL);
        return new_productivity;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 16870L)
    public static SubLObject note_tactic_executed(final SubLObject tactic) {
        set_tactic_status(tactic, (SubLObject)inference_datastructures_tactic.$kw81$EXECUTED);
        inference_metrics.increment_executed_tactic_historical_count();
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 17021L)
    public static SubLObject note_tactic_discarded(final SubLObject tactic) {
        if (inference_datastructures_tactic.NIL != valid_tactic_p(tactic)) {
            clear_tactic_progress_iterator(tactic);
            set_tactic_status(tactic, (SubLObject)inference_datastructures_tactic.$kw82$DISCARDED);
            inference_metrics.increment_discarded_tactic_historical_count();
            inference_datastructures_strategy.set_tactic_recompute_thrown_away_wrt_all_relevant_strategies(tactic);
        }
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 17396L)
    public static SubLObject note_tactic_progress_iterator(final SubLObject tactic, final SubLObject progress_iterator) {
        assert inference_datastructures_tactic.NIL != tactic_possibleP(tactic) : tactic;
        assert inference_datastructures_tactic.NIL != tactic_progress_iterator_p(progress_iterator) : progress_iterator;
        _csetf_tact_progress_iterator(tactic, progress_iterator);
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 17647L)
    public static SubLObject clear_tactic_progress_iterator(final SubLObject tactic) {
        assert inference_datastructures_tactic.NIL != tactic_possibleP(tactic) : tactic;
        destroy_tactic_progress_iterator(tactic);
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 17805L)
    public static SubLObject tactic_in_progress_next(final SubLObject tactic) {
        final SubLObject progress_iterator = tactic_progress_iterator(tactic);
        SubLObject successP = (SubLObject)inference_datastructures_tactic.NIL;
        try {
            if (inference_datastructures_tactic.NIL == iteration.iteration_done(progress_iterator)) {
                iteration.iteration_next(progress_iterator);
                successP = (SubLObject)inference_datastructures_tactic.T;
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)inference_datastructures_tactic.T);
                final SubLObject _values = Values.getValuesAsVector();
                if ((inference_datastructures_tactic.NIL == successP || inference_datastructures_tactic.NIL != iteration.iteration_done(progress_iterator)) && inference_datastructures_tactic.NIL != tactic_possibleP(tactic)) {
                    clear_tactic_progress_iterator(tactic);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 18331L)
    public static SubLObject possibly_update_tactic_productivity_from_iterator(final SubLObject tactic, final SubLObject output_iterator) {
        SubLObject number_of_children = (SubLObject)inference_datastructures_tactic.NIL;
        SubLObject new_productivity = (SubLObject)inference_datastructures_tactic.NIL;
        if (inference_datastructures_tactic.NIL != iteration.list_iterator_p(output_iterator)) {
            number_of_children = iteration.list_iterator_size(output_iterator);
        }
        else if (inference_datastructures_tactic.NIL != inference_worker_removal.conjunctive_removal_tactic_p(tactic) && inference_datastructures_tactic.NIL != sksi_query_utilities.sksi_cost_recording_iterator_p(output_iterator)) {
            number_of_children = sksi_query_utilities.sksi_cost_recording_iterator_size(output_iterator);
        }
        if (inference_datastructures_tactic.NIL != number_of_children) {
            new_productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(number_of_children);
        }
        if (inference_datastructures_tactic.NIL != inference_datastructures_enumerated_types.productivity_p(new_productivity)) {
            update_tactic_productivity(tactic, new_productivity);
            return (SubLObject)inference_datastructures_tactic.T;
        }
        return (SubLObject)inference_datastructures_tactic.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 19108L)
    public static SubLObject select_least_productive_tactic(final SubLObject tactics) {
        return list_utilities.extremal(tactics, Symbols.symbol_function((SubLObject)inference_datastructures_tactic.$sym88$_), (SubLObject)inference_datastructures_tactic.$sym89$TACTIC_PRODUCTIVITY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 19278L)
    public static SubLObject total_productivity_of_tactics(final SubLObject tactics) {
        SubLObject productivity = (SubLObject)inference_datastructures_tactic.ZERO_INTEGER;
        SubLObject cdolist_list_var = tactics;
        SubLObject tactic = (SubLObject)inference_datastructures_tactic.NIL;
        tactic = cdolist_list_var.first();
        while (inference_datastructures_tactic.NIL != cdolist_list_var) {
            productivity = Numbers.add(productivity, tactic_productivity(tactic));
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return productivity;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 19475L)
    public static SubLObject total_productivity_of_problem_possible_tactics(final SubLObject problem) {
        SubLObject productivity = (SubLObject)inference_datastructures_tactic.ZERO_INTEGER;
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = (SubLObject)inference_datastructures_tactic.NIL;
        tactic = cdolist_list_var.first();
        while (inference_datastructures_tactic.NIL != cdolist_list_var) {
            if (inference_datastructures_tactic.NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, (SubLObject)inference_datastructures_tactic.$kw58$POSSIBLE)) {
                productivity = inference_datastructures_enumerated_types.productivity_X(productivity, tactic_productivity(tactic));
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return productivity;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 19749L)
    public static SubLObject min_productivity_of_problem_possible_tactics(final SubLObject problem) {
        SubLObject least_productivity = number_utilities.positive_infinity();
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = (SubLObject)inference_datastructures_tactic.NIL;
        tactic = cdolist_list_var.first();
        while (inference_datastructures_tactic.NIL != cdolist_list_var) {
            if (inference_datastructures_tactic.NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, (SubLObject)inference_datastructures_tactic.$kw58$POSSIBLE)) {
                final SubLObject productivity = tactic_productivity(tactic);
                if (inference_datastructures_tactic.NIL != inference_datastructures_enumerated_types.productivity_L(productivity, least_productivity)) {
                    least_productivity = productivity;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return least_productivity;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 20125L)
    public static SubLObject note_tactic_most_recent_executed(final SubLObject tactic) {
        assert inference_datastructures_tactic.NIL != tactic_p(tactic) : tactic;
        inference_datastructures_problem_store.note_problem_store_most_recent_tactic_executed(tactic_store(tactic), tactic);
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 20313L)
    public static SubLObject problem_store_tactic_execution_count(final SubLObject store) {
        SubLObject count = (SubLObject)inference_datastructures_tactic.ZERO_INTEGER;
        final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (inference_datastructures_tactic.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_datastructures_tactic.$kw90$SKIP)) {
            final SubLObject idx_$2 = idx;
            if (inference_datastructures_tactic.NIL == id_index.id_index_dense_objects_empty_p(idx_$2, (SubLObject)inference_datastructures_tactic.$kw90$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$2);
                final SubLObject backwardP_var = (SubLObject)inference_datastructures_tactic.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                SubLObject cdolist_list_var;
                SubLObject tactic;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_datastructures_tactic.NIL, v_iteration = (SubLObject)inference_datastructures_tactic.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_datastructures_tactic.ONE_INTEGER)) {
                    id = ((inference_datastructures_tactic.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_datastructures_tactic.ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (inference_datastructures_tactic.NIL == id_index.id_index_tombstone_p(problem) || inference_datastructures_tactic.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_datastructures_tactic.$kw90$SKIP)) {
                        if (inference_datastructures_tactic.NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = (SubLObject)inference_datastructures_tactic.$kw90$SKIP;
                        }
                        cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
                        tactic = (SubLObject)inference_datastructures_tactic.NIL;
                        tactic = cdolist_list_var.first();
                        while (inference_datastructures_tactic.NIL != cdolist_list_var) {
                            count = Numbers.add(count, tactic_execution_count(tactic));
                            cdolist_list_var = cdolist_list_var.rest();
                            tactic = cdolist_list_var.first();
                        }
                    }
                }
            }
            final SubLObject idx_$3 = idx;
            if (inference_datastructures_tactic.NIL == id_index.id_index_sparse_objects_empty_p(idx_$3)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$3);
                SubLObject id2 = (SubLObject)inference_datastructures_tactic.NIL;
                SubLObject problem2 = (SubLObject)inference_datastructures_tactic.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        SubLObject cdolist_list_var2 = inference_datastructures_problem.problem_tactics(problem2);
                        SubLObject tactic2 = (SubLObject)inference_datastructures_tactic.NIL;
                        tactic2 = cdolist_list_var2.first();
                        while (inference_datastructures_tactic.NIL != cdolist_list_var2) {
                            count = Numbers.add(count, tactic_execution_count(tactic2));
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            tactic2 = cdolist_list_var2.first();
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 20789L)
    public static SubLObject tactic_execution_count(final SubLObject tactic) {
        if (inference_datastructures_tactic.NIL != inference_worker.content_tactic_p(tactic)) {
            return Numbers.round(inference_datastructures_enumerated_types.number_of_children_for_productivity(inference_worker.content_tactic_actual_productivity(tactic)), (SubLObject)inference_datastructures_tactic.UNPROVIDED);
        }
        if (inference_datastructures_tactic.NIL != tactic_executedP(tactic)) {
            return (SubLObject)inference_datastructures_tactic.ONE_INTEGER;
        }
        return (SubLObject)inference_datastructures_tactic.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 21144L)
    public static SubLObject tactic_progress_iterator_p(final SubLObject v_object) {
        return iteration.iterator_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 21340L)
    public static SubLObject new_tactic_progress_iterator(final SubLObject iteration_type, final SubLObject tactic, final SubLObject sub_state) {
        return iteration.new_iterator(make_tactic_progress_iterator_state(iteration_type, tactic, sub_state), (SubLObject)inference_datastructures_tactic.$sym91$TACTIC_PROGRESS_DONE_, (SubLObject)inference_datastructures_tactic.$sym92$TACTIC_PROGRESS_NEXT, (SubLObject)inference_datastructures_tactic.$sym93$TACTIC_PROGRESS_FINALIZE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 21632L)
    public static SubLObject make_tactic_progress_iterator_state(final SubLObject iteration_type, final SubLObject tactic, final SubLObject sub_state) {
        return (SubLObject)ConsesLow.list(sub_state, iteration_type, tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 21798L)
    public static SubLObject tactic_progress_doneP(final SubLObject state) {
        SubLObject current_$4 = (SubLObject)inference_datastructures_tactic.NIL;
        SubLObject iteration_type = (SubLObject)inference_datastructures_tactic.NIL;
        SubLObject tactic = (SubLObject)inference_datastructures_tactic.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)inference_datastructures_tactic.$list94);
        current_$4 = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)inference_datastructures_tactic.$list94);
        iteration_type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)inference_datastructures_tactic.$list94);
        tactic = current.first();
        current = current.rest();
        if (inference_datastructures_tactic.NIL == current) {
            final SubLObject pcase_var = iteration_type;
            if (pcase_var.eql((SubLObject)inference_datastructures_tactic.$kw95$REMOVAL_EXPAND)) {
                return Types.sublisp_null(current_$4);
            }
            if (pcase_var.eql((SubLObject)inference_datastructures_tactic.$kw96$REMOVAL_OUTPUT_GENERATE)) {
                SubLObject current_$5;
                final SubLObject datum_$5 = current_$5 = current_$4;
                SubLObject output_iterator = (SubLObject)inference_datastructures_tactic.NIL;
                SubLObject v_bindings = (SubLObject)inference_datastructures_tactic.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$5, datum_$5, (SubLObject)inference_datastructures_tactic.$list97);
                output_iterator = current_$5.first();
                current_$5 = current_$5.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$5, datum_$5, (SubLObject)inference_datastructures_tactic.$list97);
                v_bindings = current_$5.first();
                current_$5 = current_$5.rest();
                if (inference_datastructures_tactic.NIL == current_$5) {
                    return iteration.iteration_done(output_iterator);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$5, (SubLObject)inference_datastructures_tactic.$list97);
            }
            else {
                if (pcase_var.eql((SubLObject)inference_datastructures_tactic.$kw98$CONJUNCTIVE_REMOVAL_EXPAND)) {
                    return Types.sublisp_null(current_$4);
                }
                if (pcase_var.eql((SubLObject)inference_datastructures_tactic.$kw99$CONJUNCTIVE_REMOVAL_EXPAND_ITERATIVE)) {
                    return iteration.iteration_done(current_$4);
                }
                if (pcase_var.eql((SubLObject)inference_datastructures_tactic.$kw100$TRANSFORMATION_RULE_SELECT)) {
                    return Types.sublisp_null(current_$4);
                }
                if (pcase_var.eql((SubLObject)inference_datastructures_tactic.$kw101$META_STRUCTURAL)) {
                    return inference_worker_split.meta_structural_progress_iterator_doneP(tactic);
                }
                return Errors.error((SubLObject)inference_datastructures_tactic.$str102$Time_to_implement_tactic_progress, iteration_type);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)inference_datastructures_tactic.$list94);
        }
        return (SubLObject)inference_datastructures_tactic.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 22599L)
    public static SubLObject tactic_progress_next(final SubLObject state) {
        SubLObject current_$7 = (SubLObject)inference_datastructures_tactic.NIL;
        SubLObject iteration_type = (SubLObject)inference_datastructures_tactic.NIL;
        SubLObject tactic = (SubLObject)inference_datastructures_tactic.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)inference_datastructures_tactic.$list94);
        current_$7 = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)inference_datastructures_tactic.$list94);
        iteration_type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)inference_datastructures_tactic.$list94);
        tactic = current.first();
        current = current.rest();
        if (inference_datastructures_tactic.NIL == current) {
            final SubLObject pcase_var = iteration_type;
            if (pcase_var.eql((SubLObject)inference_datastructures_tactic.$kw95$REMOVAL_EXPAND)) {
                final SubLObject expand_result = current_$7.first();
                final SubLObject update = current_$7.rest();
                ConsesLow.rplaca(state, update);
                final SubLObject side_effect_result = inference_worker_removal.handle_one_removal_tactic_expand_result(tactic, expand_result);
                return subl_promotions.values3(side_effect_result, state, (SubLObject)inference_datastructures_tactic.NIL);
            }
            if (pcase_var.eql((SubLObject)inference_datastructures_tactic.$kw96$REMOVAL_OUTPUT_GENERATE)) {
                SubLObject current_$8;
                final SubLObject datum_$8 = current_$8 = current_$7;
                SubLObject output_iterator = (SubLObject)inference_datastructures_tactic.NIL;
                SubLObject encoded_bindings = (SubLObject)inference_datastructures_tactic.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$8, datum_$8, (SubLObject)inference_datastructures_tactic.$list103);
                output_iterator = current_$8.first();
                current_$8 = current_$8.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$8, datum_$8, (SubLObject)inference_datastructures_tactic.$list103);
                encoded_bindings = current_$8.first();
                current_$8 = current_$8.rest();
                if (inference_datastructures_tactic.NIL == current_$8) {
                    final SubLObject side_effect_result2 = inference_worker_removal.handle_one_removal_tactic_output_generate_result(tactic, output_iterator, encoded_bindings);
                    return subl_promotions.values3(side_effect_result2, state, (SubLObject)inference_datastructures_tactic.NIL);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$8, (SubLObject)inference_datastructures_tactic.$list103);
            }
            else {
                if (pcase_var.eql((SubLObject)inference_datastructures_tactic.$kw98$CONJUNCTIVE_REMOVAL_EXPAND)) {
                    final SubLObject expand_result = current_$7.first();
                    final SubLObject update = current_$7.rest();
                    ConsesLow.rplaca(state, update);
                    final SubLObject side_effect_result = inference_worker_removal.handle_one_conjunctive_removal_tactic_expand_result(tactic, expand_result);
                    return subl_promotions.values3(side_effect_result, state, (SubLObject)inference_datastructures_tactic.NIL);
                }
                if (pcase_var.eql((SubLObject)inference_datastructures_tactic.$kw99$CONJUNCTIVE_REMOVAL_EXPAND_ITERATIVE)) {
                    final SubLObject side_effect_result3 = inference_worker_removal.handle_one_conjunctive_removal_tactic_expand_iterative_result(tactic, current_$7);
                    return subl_promotions.values3(side_effect_result3, state, (SubLObject)inference_datastructures_tactic.NIL);
                }
                if (pcase_var.eql((SubLObject)inference_datastructures_tactic.$kw100$TRANSFORMATION_RULE_SELECT)) {
                    final SubLObject rule = current_$7.first();
                    final SubLObject update = current_$7.rest();
                    ConsesLow.rplaca(state, update);
                    final SubLObject side_effect_result = inference_worker_transformation.handle_one_transformation_tactic_rule_select_result(tactic, rule);
                    return subl_promotions.values3(side_effect_result, state, (SubLObject)inference_datastructures_tactic.NIL);
                }
                if (pcase_var.eql((SubLObject)inference_datastructures_tactic.$kw101$META_STRUCTURAL)) {
                    inference_worker_split.execute_meta_split_tactic(tactic);
                    return subl_promotions.values3((SubLObject)inference_datastructures_tactic.NIL, state, (SubLObject)inference_datastructures_tactic.NIL);
                }
                return Errors.error((SubLObject)inference_datastructures_tactic.$str104$Time_to_implement_tactic_progress, iteration_type);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)inference_datastructures_tactic.$list94);
        }
        return (SubLObject)inference_datastructures_tactic.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 24319L)
    public static SubLObject tactic_progress_finalize(final SubLObject state) {
        SubLObject current_$10 = (SubLObject)inference_datastructures_tactic.NIL;
        SubLObject iteration_type = (SubLObject)inference_datastructures_tactic.NIL;
        SubLObject tactic = (SubLObject)inference_datastructures_tactic.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)inference_datastructures_tactic.$list94);
        current_$10 = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)inference_datastructures_tactic.$list94);
        iteration_type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)inference_datastructures_tactic.$list94);
        tactic = current.first();
        current = current.rest();
        if (inference_datastructures_tactic.NIL == current) {
            final SubLObject pcase_var = iteration_type;
            if (pcase_var.eql((SubLObject)inference_datastructures_tactic.$kw95$REMOVAL_EXPAND)) {
                return (SubLObject)inference_datastructures_tactic.T;
            }
            if (pcase_var.eql((SubLObject)inference_datastructures_tactic.$kw96$REMOVAL_OUTPUT_GENERATE)) {
                SubLObject current_$11;
                final SubLObject datum_$11 = current_$11 = current_$10;
                SubLObject output_iterator = (SubLObject)inference_datastructures_tactic.NIL;
                SubLObject encoded_bindings = (SubLObject)inference_datastructures_tactic.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$11, datum_$11, (SubLObject)inference_datastructures_tactic.$list103);
                output_iterator = current_$11.first();
                current_$11 = current_$11.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$11, datum_$11, (SubLObject)inference_datastructures_tactic.$list103);
                encoded_bindings = current_$11.first();
                current_$11 = current_$11.rest();
                if (inference_datastructures_tactic.NIL == current_$11) {
                    return iteration.iteration_finalize(output_iterator);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$11, (SubLObject)inference_datastructures_tactic.$list103);
            }
            else {
                if (pcase_var.eql((SubLObject)inference_datastructures_tactic.$kw98$CONJUNCTIVE_REMOVAL_EXPAND)) {
                    return (SubLObject)inference_datastructures_tactic.T;
                }
                if (pcase_var.eql((SubLObject)inference_datastructures_tactic.$kw99$CONJUNCTIVE_REMOVAL_EXPAND_ITERATIVE)) {
                    return iteration.iteration_finalize(current_$10);
                }
                if (pcase_var.eql((SubLObject)inference_datastructures_tactic.$kw100$TRANSFORMATION_RULE_SELECT)) {
                    return (SubLObject)inference_datastructures_tactic.T;
                }
                if (pcase_var.eql((SubLObject)inference_datastructures_tactic.$kw101$META_STRUCTURAL)) {
                    return (SubLObject)inference_datastructures_tactic.T;
                }
                return Errors.error((SubLObject)inference_datastructures_tactic.$str105$Time_to_implement_tactic_progress, iteration_type);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)inference_datastructures_tactic.$list94);
        }
        return (SubLObject)inference_datastructures_tactic.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 25066L)
    public static SubLObject finalize_tactic_progress_iterator(final SubLObject progress_iterator) {
        assert inference_datastructures_tactic.NIL != tactic_progress_iterator_p(progress_iterator) : progress_iterator;
        iteration.iteration_finalize(progress_iterator);
        return progress_iterator;
    }
    
    public static SubLObject declare_inference_datastructures_tactic_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_print_function_trampoline", "TACTIC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_p", "TACTIC-P", 1, 0, false);
        new $tactic_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tact_suid", "TACT-SUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tact_problem", "TACT-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tact_type", "TACT-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tact_hl_module", "TACT-HL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tact_completeness", "TACT-COMPLETENESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tact_preference_level_justification", "TACT-PREFERENCE-LEVEL-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tact_productivity", "TACT-PRODUCTIVITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tact_original_productivity", "TACT-ORIGINAL-PRODUCTIVITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tact_status", "TACT-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tact_progress_iterator", "TACT-PROGRESS-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tact_data", "TACT-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tact_properties", "TACT-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "_csetf_tact_suid", "_CSETF-TACT-SUID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "_csetf_tact_problem", "_CSETF-TACT-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "_csetf_tact_type", "_CSETF-TACT-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "_csetf_tact_hl_module", "_CSETF-TACT-HL-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "_csetf_tact_completeness", "_CSETF-TACT-COMPLETENESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "_csetf_tact_preference_level_justification", "_CSETF-TACT-PREFERENCE-LEVEL-JUSTIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "_csetf_tact_productivity", "_CSETF-TACT-PRODUCTIVITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "_csetf_tact_original_productivity", "_CSETF-TACT-ORIGINAL-PRODUCTIVITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "_csetf_tact_status", "_CSETF-TACT-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "_csetf_tact_progress_iterator", "_CSETF-TACT-PROGRESS-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "_csetf_tact_data", "_CSETF-TACT-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "_csetf_tact_properties", "_CSETF-TACT-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "make_tactic", "MAKE-TACTIC", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "visit_defstruct_tactic", "VISIT-DEFSTRUCT-TACTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "visit_defstruct_object_tactic_method", "VISIT-DEFSTRUCT-OBJECT-TACTIC-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "valid_tactic_p", "VALID-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "invalid_tactic_p", "INVALID-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_invalid_p", "TACTIC-INVALID-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "print_tactic", "PRINT-TACTIC", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "sxhash_tactic_method", "SXHASH-TACTIC-METHOD", 1, 0, false);
        new $sxhash_tactic_method$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "new_tactic", "NEW-TACTIC", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "destroy_problem_tactic", "DESTROY-PROBLEM-TACTIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "destroy_problem_tactic_and_backpointers", "DESTROY-PROBLEM-TACTIC-AND-BACKPOINTERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "destroy_tactic_progress_iterator", "DESTROY-TACTIC-PROGRESS-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "destroy_tactic_int", "DESTROY-TACTIC-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "note_tactic_invalid", "NOTE-TACTIC-INVALID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_suid", "TACTIC-SUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_problem", "TACTIC-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_hl_module", "TACTIC-HL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_type", "TACTIC-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_completeness", "TACTIC-COMPLETENESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_preference_level", "TACTIC-PREFERENCE-LEVEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_preference_level_justification", "TACTIC-PREFERENCE-LEVEL-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_productivity", "TACTIC-PRODUCTIVITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_original_productivity", "TACTIC-ORIGINAL-PRODUCTIVITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_status", "TACTIC-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_progress_iterator", "TACTIC-PROGRESS-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_data", "TACTIC-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_properties", "TACTIC-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "set_tactic_completeness", "SET-TACTIC-COMPLETENESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "set_tactic_preference_level", "SET-TACTIC-PREFERENCE-LEVEL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "set_tactic_productivity", "SET-TACTIC-PRODUCTIVITY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "set_tactic_status", "SET-TACTIC-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "set_tactic_data", "SET-TACTIC-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "set_meta_split_tactic_data", "SET-META-SPLIT-TACTIC-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "set_tactic_properties", "SET-TACTIC-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "set_tactic_property", "SET-TACTIC-PROPERTY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "push_tactic_property", "PUSH-TACTIC-PROPERTY", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "do_tactic_relevant_strategies", "DO-TACTIC-RELEVANT-STRATEGIES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "do_tactic_sibling_tactics", "DO-TACTIC-SIBLING-TACTICS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_ids", "TACTIC-IDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "find_tactic_by_id", "FIND-TACTIC-BY-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "find_tactic_by_ids", "FIND-TACTIC-BY-IDS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_hl_module_name", "TACTIC-HL-MODULE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_possibleP", "TACTIC-POSSIBLE?", 1, 0, false);
        new $tactic_possibleP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_in_progressP", "TACTIC-IN-PROGRESS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_not_possibleP", "TACTIC-NOT-POSSIBLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_executedP", "TACTIC-EXECUTED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_discardedP", "TACTIC-DISCARDED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_has_statusP", "TACTIC-HAS-STATUS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "abductive_tacticP", "ABDUCTIVE-TACTIC?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_store", "TACTIC-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_problem_query", "TACTIC-PROBLEM-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_problem_sole_clause", "TACTIC-PROBLEM-SOLE-CLAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "update_tactic_productivity", "UPDATE-TACTIC-PRODUCTIVITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "decrement_tactic_productivity_for_number_of_children", "DECREMENT-TACTIC-PRODUCTIVITY-FOR-NUMBER-OF-CHILDREN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "note_tactic_executed", "NOTE-TACTIC-EXECUTED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "note_tactic_discarded", "NOTE-TACTIC-DISCARDED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "note_tactic_progress_iterator", "NOTE-TACTIC-PROGRESS-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "clear_tactic_progress_iterator", "CLEAR-TACTIC-PROGRESS-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_in_progress_next", "TACTIC-IN-PROGRESS-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "possibly_update_tactic_productivity_from_iterator", "POSSIBLY-UPDATE-TACTIC-PRODUCTIVITY-FROM-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "select_least_productive_tactic", "SELECT-LEAST-PRODUCTIVE-TACTIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "total_productivity_of_tactics", "TOTAL-PRODUCTIVITY-OF-TACTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "total_productivity_of_problem_possible_tactics", "TOTAL-PRODUCTIVITY-OF-PROBLEM-POSSIBLE-TACTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "min_productivity_of_problem_possible_tactics", "MIN-PRODUCTIVITY-OF-PROBLEM-POSSIBLE-TACTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "note_tactic_most_recent_executed", "NOTE-TACTIC-MOST-RECENT-EXECUTED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "problem_store_tactic_execution_count", "PROBLEM-STORE-TACTIC-EXECUTION-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_execution_count", "TACTIC-EXECUTION-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_progress_iterator_p", "TACTIC-PROGRESS-ITERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "new_tactic_progress_iterator", "NEW-TACTIC-PROGRESS-ITERATOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "make_tactic_progress_iterator_state", "MAKE-TACTIC-PROGRESS-ITERATOR-STATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_progress_doneP", "TACTIC-PROGRESS-DONE?", 1, 0, false);
        new $tactic_progress_doneP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_progress_next", "TACTIC-PROGRESS-NEXT", 1, 0, false);
        new $tactic_progress_next$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "tactic_progress_finalize", "TACTIC-PROGRESS-FINALIZE", 1, 0, false);
        new $tactic_progress_finalize$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic", "finalize_tactic_progress_iterator", "FINALIZE-TACTIC-PROGRESS-ITERATOR", 1, 0, false);
        return (SubLObject)inference_datastructures_tactic.NIL;
    }
    
    public static SubLObject init_inference_datastructures_tactic_file() {
        inference_datastructures_tactic.$leviathan_avoid_logical_tactic_productivity_computationP$ = SubLFiles.defvar("*LEVIATHAN-AVOID-LOGICAL-TACTIC-PRODUCTIVITY-COMPUTATION?*", (SubLObject)inference_datastructures_tactic.NIL);
        inference_datastructures_tactic.$dtp_tactic$ = SubLFiles.defconstant("*DTP-TACTIC*", (SubLObject)inference_datastructures_tactic.$sym0$TACTIC);
        inference_datastructures_tactic.$tactic_productivity_smoothing_method$ = SubLFiles.defparameter("*TACTIC-PRODUCTIVITY-SMOOTHING-METHOD*", (SubLObject)inference_datastructures_tactic.NIL);
        return (SubLObject)inference_datastructures_tactic.NIL;
    }
    
    public static SubLObject setup_inference_datastructures_tactic_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), inference_datastructures_tactic.$dtp_tactic$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_datastructures_tactic.$sym8$TACTIC_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)inference_datastructures_tactic.$list9);
        Structures.def_csetf((SubLObject)inference_datastructures_tactic.$sym10$TACT_SUID, (SubLObject)inference_datastructures_tactic.$sym11$_CSETF_TACT_SUID);
        Structures.def_csetf((SubLObject)inference_datastructures_tactic.$sym12$TACT_PROBLEM, (SubLObject)inference_datastructures_tactic.$sym13$_CSETF_TACT_PROBLEM);
        Structures.def_csetf((SubLObject)inference_datastructures_tactic.$sym14$TACT_TYPE, (SubLObject)inference_datastructures_tactic.$sym15$_CSETF_TACT_TYPE);
        Structures.def_csetf((SubLObject)inference_datastructures_tactic.$sym16$TACT_HL_MODULE, (SubLObject)inference_datastructures_tactic.$sym17$_CSETF_TACT_HL_MODULE);
        Structures.def_csetf((SubLObject)inference_datastructures_tactic.$sym18$TACT_COMPLETENESS, (SubLObject)inference_datastructures_tactic.$sym19$_CSETF_TACT_COMPLETENESS);
        Structures.def_csetf((SubLObject)inference_datastructures_tactic.$sym20$TACT_PREFERENCE_LEVEL_JUSTIFICATION, (SubLObject)inference_datastructures_tactic.$sym21$_CSETF_TACT_PREFERENCE_LEVEL_JUSTIFICATION);
        Structures.def_csetf((SubLObject)inference_datastructures_tactic.$sym22$TACT_PRODUCTIVITY, (SubLObject)inference_datastructures_tactic.$sym23$_CSETF_TACT_PRODUCTIVITY);
        Structures.def_csetf((SubLObject)inference_datastructures_tactic.$sym24$TACT_ORIGINAL_PRODUCTIVITY, (SubLObject)inference_datastructures_tactic.$sym25$_CSETF_TACT_ORIGINAL_PRODUCTIVITY);
        Structures.def_csetf((SubLObject)inference_datastructures_tactic.$sym26$TACT_STATUS, (SubLObject)inference_datastructures_tactic.$sym27$_CSETF_TACT_STATUS);
        Structures.def_csetf((SubLObject)inference_datastructures_tactic.$sym28$TACT_PROGRESS_ITERATOR, (SubLObject)inference_datastructures_tactic.$sym29$_CSETF_TACT_PROGRESS_ITERATOR);
        Structures.def_csetf((SubLObject)inference_datastructures_tactic.$sym30$TACT_DATA, (SubLObject)inference_datastructures_tactic.$sym31$_CSETF_TACT_DATA);
        Structures.def_csetf((SubLObject)inference_datastructures_tactic.$sym32$TACT_PROPERTIES, (SubLObject)inference_datastructures_tactic.$sym33$_CSETF_TACT_PROPERTIES);
        Equality.identity((SubLObject)inference_datastructures_tactic.$sym0$TACTIC);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), inference_datastructures_tactic.$dtp_tactic$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_datastructures_tactic.$sym51$VISIT_DEFSTRUCT_OBJECT_TACTIC_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), inference_datastructures_tactic.$dtp_tactic$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_datastructures_tactic.$sym55$SXHASH_TACTIC_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)inference_datastructures_tactic.$sym91$TACTIC_PROGRESS_DONE_);
        utilities_macros.note_funcall_helper_function((SubLObject)inference_datastructures_tactic.$sym92$TACTIC_PROGRESS_NEXT);
        utilities_macros.note_funcall_helper_function((SubLObject)inference_datastructures_tactic.$sym93$TACTIC_PROGRESS_FINALIZE);
        return (SubLObject)inference_datastructures_tactic.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_inference_datastructures_tactic_file();
    }
    
    @Override
	public void initializeVariables() {
        init_inference_datastructures_tactic_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_inference_datastructures_tactic_file();
    }
    
    static {
        me = (SubLFile)new inference_datastructures_tactic();
        inference_datastructures_tactic.$leviathan_avoid_logical_tactic_productivity_computationP$ = null;
        inference_datastructures_tactic.$dtp_tactic$ = null;
        inference_datastructures_tactic.$tactic_productivity_smoothing_method$ = null;
        $sym0$TACTIC = SubLObjectFactory.makeSymbol("TACTIC");
        $sym1$TACTIC_P = SubLObjectFactory.makeSymbol("TACTIC-P");
        $int2$210 = SubLObjectFactory.makeInteger(210);
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("SUID"), SubLObjectFactory.makeSymbol("PROBLEM"), SubLObjectFactory.makeSymbol("TYPE"), SubLObjectFactory.makeSymbol("HL-MODULE"), SubLObjectFactory.makeSymbol("COMPLETENESS"), SubLObjectFactory.makeSymbol("PREFERENCE-LEVEL-JUSTIFICATION"), SubLObjectFactory.makeSymbol("PRODUCTIVITY"), SubLObjectFactory.makeSymbol("ORIGINAL-PRODUCTIVITY"), SubLObjectFactory.makeSymbol("STATUS"), SubLObjectFactory.makeSymbol("PROGRESS-ITERATOR"), SubLObjectFactory.makeSymbol("DATA"), SubLObjectFactory.makeSymbol("PROPERTIES") });
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SUID"), SubLObjectFactory.makeKeyword("PROBLEM"), SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("HL-MODULE"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL-JUSTIFICATION"), SubLObjectFactory.makeKeyword("PRODUCTIVITY"), SubLObjectFactory.makeKeyword("ORIGINAL-PRODUCTIVITY"), SubLObjectFactory.makeKeyword("STATUS"), SubLObjectFactory.makeKeyword("PROGRESS-ITERATOR"), SubLObjectFactory.makeKeyword("DATA"), SubLObjectFactory.makeKeyword("PROPERTIES") });
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("TACT-SUID"), SubLObjectFactory.makeSymbol("TACT-PROBLEM"), SubLObjectFactory.makeSymbol("TACT-TYPE"), SubLObjectFactory.makeSymbol("TACT-HL-MODULE"), SubLObjectFactory.makeSymbol("TACT-COMPLETENESS"), SubLObjectFactory.makeSymbol("TACT-PREFERENCE-LEVEL-JUSTIFICATION"), SubLObjectFactory.makeSymbol("TACT-PRODUCTIVITY"), SubLObjectFactory.makeSymbol("TACT-ORIGINAL-PRODUCTIVITY"), SubLObjectFactory.makeSymbol("TACT-STATUS"), SubLObjectFactory.makeSymbol("TACT-PROGRESS-ITERATOR"), SubLObjectFactory.makeSymbol("TACT-DATA"), SubLObjectFactory.makeSymbol("TACT-PROPERTIES") });
        $list6 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-TACT-SUID"), SubLObjectFactory.makeSymbol("_CSETF-TACT-PROBLEM"), SubLObjectFactory.makeSymbol("_CSETF-TACT-TYPE"), SubLObjectFactory.makeSymbol("_CSETF-TACT-HL-MODULE"), SubLObjectFactory.makeSymbol("_CSETF-TACT-COMPLETENESS"), SubLObjectFactory.makeSymbol("_CSETF-TACT-PREFERENCE-LEVEL-JUSTIFICATION"), SubLObjectFactory.makeSymbol("_CSETF-TACT-PRODUCTIVITY"), SubLObjectFactory.makeSymbol("_CSETF-TACT-ORIGINAL-PRODUCTIVITY"), SubLObjectFactory.makeSymbol("_CSETF-TACT-STATUS"), SubLObjectFactory.makeSymbol("_CSETF-TACT-PROGRESS-ITERATOR"), SubLObjectFactory.makeSymbol("_CSETF-TACT-DATA"), SubLObjectFactory.makeSymbol("_CSETF-TACT-PROPERTIES") });
        $sym7$PRINT_TACTIC = SubLObjectFactory.makeSymbol("PRINT-TACTIC");
        $sym8$TACTIC_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("TACTIC-PRINT-FUNCTION-TRAMPOLINE");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("TACTIC-P"));
        $sym10$TACT_SUID = SubLObjectFactory.makeSymbol("TACT-SUID");
        $sym11$_CSETF_TACT_SUID = SubLObjectFactory.makeSymbol("_CSETF-TACT-SUID");
        $sym12$TACT_PROBLEM = SubLObjectFactory.makeSymbol("TACT-PROBLEM");
        $sym13$_CSETF_TACT_PROBLEM = SubLObjectFactory.makeSymbol("_CSETF-TACT-PROBLEM");
        $sym14$TACT_TYPE = SubLObjectFactory.makeSymbol("TACT-TYPE");
        $sym15$_CSETF_TACT_TYPE = SubLObjectFactory.makeSymbol("_CSETF-TACT-TYPE");
        $sym16$TACT_HL_MODULE = SubLObjectFactory.makeSymbol("TACT-HL-MODULE");
        $sym17$_CSETF_TACT_HL_MODULE = SubLObjectFactory.makeSymbol("_CSETF-TACT-HL-MODULE");
        $sym18$TACT_COMPLETENESS = SubLObjectFactory.makeSymbol("TACT-COMPLETENESS");
        $sym19$_CSETF_TACT_COMPLETENESS = SubLObjectFactory.makeSymbol("_CSETF-TACT-COMPLETENESS");
        $sym20$TACT_PREFERENCE_LEVEL_JUSTIFICATION = SubLObjectFactory.makeSymbol("TACT-PREFERENCE-LEVEL-JUSTIFICATION");
        $sym21$_CSETF_TACT_PREFERENCE_LEVEL_JUSTIFICATION = SubLObjectFactory.makeSymbol("_CSETF-TACT-PREFERENCE-LEVEL-JUSTIFICATION");
        $sym22$TACT_PRODUCTIVITY = SubLObjectFactory.makeSymbol("TACT-PRODUCTIVITY");
        $sym23$_CSETF_TACT_PRODUCTIVITY = SubLObjectFactory.makeSymbol("_CSETF-TACT-PRODUCTIVITY");
        $sym24$TACT_ORIGINAL_PRODUCTIVITY = SubLObjectFactory.makeSymbol("TACT-ORIGINAL-PRODUCTIVITY");
        $sym25$_CSETF_TACT_ORIGINAL_PRODUCTIVITY = SubLObjectFactory.makeSymbol("_CSETF-TACT-ORIGINAL-PRODUCTIVITY");
        $sym26$TACT_STATUS = SubLObjectFactory.makeSymbol("TACT-STATUS");
        $sym27$_CSETF_TACT_STATUS = SubLObjectFactory.makeSymbol("_CSETF-TACT-STATUS");
        $sym28$TACT_PROGRESS_ITERATOR = SubLObjectFactory.makeSymbol("TACT-PROGRESS-ITERATOR");
        $sym29$_CSETF_TACT_PROGRESS_ITERATOR = SubLObjectFactory.makeSymbol("_CSETF-TACT-PROGRESS-ITERATOR");
        $sym30$TACT_DATA = SubLObjectFactory.makeSymbol("TACT-DATA");
        $sym31$_CSETF_TACT_DATA = SubLObjectFactory.makeSymbol("_CSETF-TACT-DATA");
        $sym32$TACT_PROPERTIES = SubLObjectFactory.makeSymbol("TACT-PROPERTIES");
        $sym33$_CSETF_TACT_PROPERTIES = SubLObjectFactory.makeSymbol("_CSETF-TACT-PROPERTIES");
        $kw34$SUID = SubLObjectFactory.makeKeyword("SUID");
        $kw35$PROBLEM = SubLObjectFactory.makeKeyword("PROBLEM");
        $kw36$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw37$HL_MODULE = SubLObjectFactory.makeKeyword("HL-MODULE");
        $kw38$COMPLETENESS = SubLObjectFactory.makeKeyword("COMPLETENESS");
        $kw39$PREFERENCE_LEVEL_JUSTIFICATION = SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL-JUSTIFICATION");
        $kw40$PRODUCTIVITY = SubLObjectFactory.makeKeyword("PRODUCTIVITY");
        $kw41$ORIGINAL_PRODUCTIVITY = SubLObjectFactory.makeKeyword("ORIGINAL-PRODUCTIVITY");
        $kw42$STATUS = SubLObjectFactory.makeKeyword("STATUS");
        $kw43$PROGRESS_ITERATOR = SubLObjectFactory.makeKeyword("PROGRESS-ITERATOR");
        $kw44$DATA = SubLObjectFactory.makeKeyword("DATA");
        $kw45$PROPERTIES = SubLObjectFactory.makeKeyword("PROPERTIES");
        $str46$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw47$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym48$MAKE_TACTIC = SubLObjectFactory.makeSymbol("MAKE-TACTIC");
        $kw49$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw50$END = SubLObjectFactory.makeKeyword("END");
        $sym51$VISIT_DEFSTRUCT_OBJECT_TACTIC_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-TACTIC-METHOD");
        $kw52$FREE = SubLObjectFactory.makeKeyword("FREE");
        $str53$_Invalid_TACTIC__s_ = SubLObjectFactory.makeString("<Invalid TACTIC ~s>");
        $str54$__a_TACTIC__a__a__a___a__a__ = SubLObjectFactory.makeString("<~a TACTIC ~a.~a.~a:(~a ~a)>");
        $sym55$SXHASH_TACTIC_METHOD = SubLObjectFactory.makeSymbol("SXHASH-TACTIC-METHOD");
        $sym56$PROBLEM_P = SubLObjectFactory.makeSymbol("PROBLEM-P");
        $sym57$HL_MODULE_P = SubLObjectFactory.makeSymbol("HL-MODULE-P");
        $kw58$POSSIBLE = SubLObjectFactory.makeKeyword("POSSIBLE");
        $kw59$RECURSIVE_INFERENCES = SubLObjectFactory.makeKeyword("RECURSIVE-INFERENCES");
        $str60$proofy_problem__a_is_possible_but = SubLObjectFactory.makeString("proofy problem ~a is possible but has no tactics");
        $sym61$PREFERENCE_LEVEL_P = SubLObjectFactory.makeSymbol("PREFERENCE-LEVEL-P");
        $str62$tactical_productivity_being_refer = SubLObjectFactory.makeString("tactical productivity being referenced on ~S");
        $sym63$COMPLETENESS_P = SubLObjectFactory.makeSymbol("COMPLETENESS-P");
        $str64$ = SubLObjectFactory.makeString("");
        $sym65$PRODUCTIVITY_P = SubLObjectFactory.makeSymbol("PRODUCTIVITY-P");
        $sym66$TACTIC_STATUS_P = SubLObjectFactory.makeSymbol("TACTIC-STATUS-P");
        $sym67$META_SPLIT_TACTIC_P = SubLObjectFactory.makeSymbol("META-SPLIT-TACTIC-P");
        $sym68$PROPERTY_LIST_P = SubLObjectFactory.makeSymbol("PROPERTY-LIST-P");
        $list69 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRATEGY-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TACTIC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym70$DO_PROBLEM_RELEVANT_STRATEGIES = SubLObjectFactory.makeSymbol("DO-PROBLEM-RELEVANT-STRATEGIES");
        $sym71$TACTIC_PROBLEM = SubLObjectFactory.makeSymbol("TACTIC-PROBLEM");
        $list72 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("SIBLING-TACTIC-VAR"), SubLObjectFactory.makeSymbol("TACTIC"), SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("DONE"), SubLObjectFactory.makeSymbol("STATUS"), SubLObjectFactory.makeSymbol("COMPLETENESS"), SubLObjectFactory.makeSymbol("PREFERENCE-LEVEL"), SubLObjectFactory.makeSymbol("HL-MODULE"), SubLObjectFactory.makeSymbol("TYPE"), SubLObjectFactory.makeSymbol("PRODUCTIVITY") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list73 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("STATUS"), (SubLObject)SubLObjectFactory.makeKeyword("COMPLETENESS"), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("HL-MODULE"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("PRODUCTIVITY"));
        $kw74$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw75$DONE = SubLObjectFactory.makeKeyword("DONE");
        $kw76$PREFERENCE_LEVEL = SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL");
        $sym77$TACTIC_VAR = SubLObjectFactory.makeUninternedSymbol("TACTIC-VAR");
        $sym78$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym79$DO_PROBLEM_TACTICS = SubLObjectFactory.makeSymbol("DO-PROBLEM-TACTICS");
        $sym80$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $kw81$EXECUTED = SubLObjectFactory.makeKeyword("EXECUTED");
        $kw82$DISCARDED = SubLObjectFactory.makeKeyword("DISCARDED");
        $kw83$NON_DISCARDED = SubLObjectFactory.makeKeyword("NON-DISCARDED");
        $kw84$IN_PROGRESS = SubLObjectFactory.makeKeyword("IN-PROGRESS");
        $kw85$EXECUTED_OR_IN_PROGRESS = SubLObjectFactory.makeKeyword("EXECUTED-OR-IN-PROGRESS");
        $sym86$TACTIC_POSSIBLE_ = SubLObjectFactory.makeSymbol("TACTIC-POSSIBLE?");
        $sym87$TACTIC_PROGRESS_ITERATOR_P = SubLObjectFactory.makeSymbol("TACTIC-PROGRESS-ITERATOR-P");
        $sym88$_ = SubLObjectFactory.makeSymbol("<");
        $sym89$TACTIC_PRODUCTIVITY = SubLObjectFactory.makeSymbol("TACTIC-PRODUCTIVITY");
        $kw90$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $sym91$TACTIC_PROGRESS_DONE_ = SubLObjectFactory.makeSymbol("TACTIC-PROGRESS-DONE?");
        $sym92$TACTIC_PROGRESS_NEXT = SubLObjectFactory.makeSymbol("TACTIC-PROGRESS-NEXT");
        $sym93$TACTIC_PROGRESS_FINALIZE = SubLObjectFactory.makeSymbol("TACTIC-PROGRESS-FINALIZE");
        $list94 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("ITERATION-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TACTIC"));
        $kw95$REMOVAL_EXPAND = SubLObjectFactory.makeKeyword("REMOVAL-EXPAND");
        $kw96$REMOVAL_OUTPUT_GENERATE = SubLObjectFactory.makeKeyword("REMOVAL-OUTPUT-GENERATE");
        $list97 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"));
        $kw98$CONJUNCTIVE_REMOVAL_EXPAND = SubLObjectFactory.makeKeyword("CONJUNCTIVE-REMOVAL-EXPAND");
        $kw99$CONJUNCTIVE_REMOVAL_EXPAND_ITERATIVE = SubLObjectFactory.makeKeyword("CONJUNCTIVE-REMOVAL-EXPAND-ITERATIVE");
        $kw100$TRANSFORMATION_RULE_SELECT = SubLObjectFactory.makeKeyword("TRANSFORMATION-RULE-SELECT");
        $kw101$META_STRUCTURAL = SubLObjectFactory.makeKeyword("META-STRUCTURAL");
        $str102$Time_to_implement_tactic_progress = SubLObjectFactory.makeString("Time to implement tactic-progress-done? for ~S");
        $list103 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("ENCODED-BINDINGS"));
        $str104$Time_to_implement_tactic_progress = SubLObjectFactory.makeString("Time to implement tactic-progress-next for ~S");
        $str105$Time_to_implement_tactic_progress = SubLObjectFactory.makeString("Time to implement tactic-progress-finalize for ~S");
    }
    
    public static final class $tactic_native extends SubLStructNative
    {
        public SubLObject $suid;
        public SubLObject $problem;
        public SubLObject $type;
        public SubLObject $hl_module;
        public SubLObject $completeness;
        public SubLObject $preference_level_justification;
        public SubLObject $productivity;
        public SubLObject $original_productivity;
        public SubLObject $status;
        public SubLObject $progress_iterator;
        public SubLObject $data;
        public SubLObject $properties;
        private static final SubLStructDeclNative structDecl;
        
        public $tactic_native() {
            this.$suid = (SubLObject)CommonSymbols.NIL;
            this.$problem = (SubLObject)CommonSymbols.NIL;
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$hl_module = (SubLObject)CommonSymbols.NIL;
            this.$completeness = (SubLObject)CommonSymbols.NIL;
            this.$preference_level_justification = (SubLObject)CommonSymbols.NIL;
            this.$productivity = (SubLObject)CommonSymbols.NIL;
            this.$original_productivity = (SubLObject)CommonSymbols.NIL;
            this.$status = (SubLObject)CommonSymbols.NIL;
            this.$progress_iterator = (SubLObject)CommonSymbols.NIL;
            this.$data = (SubLObject)CommonSymbols.NIL;
            this.$properties = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$tactic_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$suid;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$problem;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$type;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$hl_module;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$completeness;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$preference_level_justification;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$productivity;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$original_productivity;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$status;
        }
        
        @Override
		public SubLObject getField11() {
            return this.$progress_iterator;
        }
        
        @Override
		public SubLObject getField12() {
            return this.$data;
        }
        
        @Override
		public SubLObject getField13() {
            return this.$properties;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$suid = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$problem = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$type = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$hl_module = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$completeness = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$preference_level_justification = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$productivity = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$original_productivity = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$status = value;
        }
        
        @Override
		public SubLObject setField11(final SubLObject value) {
            return this.$progress_iterator = value;
        }
        
        @Override
		public SubLObject setField12(final SubLObject value) {
            return this.$data = value;
        }
        
        @Override
		public SubLObject setField13(final SubLObject value) {
            return this.$properties = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$tactic_native.class, inference_datastructures_tactic.$sym0$TACTIC, inference_datastructures_tactic.$sym1$TACTIC_P, inference_datastructures_tactic.$list3, inference_datastructures_tactic.$list4, new String[] { "$suid", "$problem", "$type", "$hl_module", "$completeness", "$preference_level_justification", "$productivity", "$original_productivity", "$status", "$progress_iterator", "$data", "$properties" }, inference_datastructures_tactic.$list5, inference_datastructures_tactic.$list6, inference_datastructures_tactic.$sym7$PRINT_TACTIC);
        }
    }
    
    public static final class $tactic_p$UnaryFunction extends UnaryFunction
    {
        public $tactic_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TACTIC-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_tactic.tactic_p(arg1);
        }
    }
    
    public static final class $sxhash_tactic_method$UnaryFunction extends UnaryFunction
    {
        public $sxhash_tactic_method$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SXHASH-TACTIC-METHOD"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_tactic.sxhash_tactic_method(arg1);
        }
    }
    
    public static final class $tactic_possibleP$UnaryFunction extends UnaryFunction
    {
        public $tactic_possibleP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TACTIC-POSSIBLE?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_tactic.tactic_possibleP(arg1);
        }
    }
    
    public static final class $tactic_progress_doneP$UnaryFunction extends UnaryFunction
    {
        public $tactic_progress_doneP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TACTIC-PROGRESS-DONE?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_tactic.tactic_progress_doneP(arg1);
        }
    }
    
    public static final class $tactic_progress_next$UnaryFunction extends UnaryFunction
    {
        public $tactic_progress_next$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TACTIC-PROGRESS-NEXT"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_tactic.tactic_progress_next(arg1);
        }
    }
    
    public static final class $tactic_progress_finalize$UnaryFunction extends UnaryFunction
    {
        public $tactic_progress_finalize$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TACTIC-PROGRESS-FINALIZE"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_tactic.tactic_progress_finalize(arg1);
        }
    }
}

/*

	Total time: 429 ms
	 synthetic 
*/