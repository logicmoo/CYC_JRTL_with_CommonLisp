package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class inference_datastructures_tactic extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic";
    public static String myFingerPrint = "cc8700a5c12d70cb46fdffd0bc03675065b9c3b955e19f8972fc61b4c630f3e1";
    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 800L)
    public static SubLSymbol $leviathan_avoid_logical_tactic_productivity_computationP$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1300L)
    public static SubLSymbol $dtp_tactic$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 10600L)
    private static SubLSymbol $tactic_productivity_smoothing_method$;
    private static SubLSymbol $sym0$TACTIC;
    private static SubLSymbol $sym1$TACTIC_P;
    private static SubLInteger $int$210;
    private static SubLList $list3;
    private static SubLList $list4;
    private static SubLList $list5;
    private static SubLList $list6;
    private static SubLSymbol $sym7$PRINT_TACTIC;
    private static SubLSymbol $sym8$TACTIC_PRINT_FUNCTION_TRAMPOLINE;
    private static SubLList $list9;
    private static SubLSymbol $sym10$TACT_SUID;
    private static SubLSymbol $sym11$_CSETF_TACT_SUID;
    private static SubLSymbol $sym12$TACT_PROBLEM;
    private static SubLSymbol $sym13$_CSETF_TACT_PROBLEM;
    private static SubLSymbol $sym14$TACT_TYPE;
    private static SubLSymbol $sym15$_CSETF_TACT_TYPE;
    private static SubLSymbol $sym16$TACT_HL_MODULE;
    private static SubLSymbol $sym17$_CSETF_TACT_HL_MODULE;
    private static SubLSymbol $sym18$TACT_COMPLETENESS;
    private static SubLSymbol $sym19$_CSETF_TACT_COMPLETENESS;
    private static SubLSymbol $sym20$TACT_PREFERENCE_LEVEL_JUSTIFICATION;
    private static SubLSymbol $sym21$_CSETF_TACT_PREFERENCE_LEVEL_JUSTIFICATION;
    private static SubLSymbol $sym22$TACT_PRODUCTIVITY;
    private static SubLSymbol $sym23$_CSETF_TACT_PRODUCTIVITY;
    private static SubLSymbol $sym24$TACT_ORIGINAL_PRODUCTIVITY;
    private static SubLSymbol $sym25$_CSETF_TACT_ORIGINAL_PRODUCTIVITY;
    private static SubLSymbol $sym26$TACT_STATUS;
    private static SubLSymbol $sym27$_CSETF_TACT_STATUS;
    private static SubLSymbol $sym28$TACT_PROGRESS_ITERATOR;
    private static SubLSymbol $sym29$_CSETF_TACT_PROGRESS_ITERATOR;
    private static SubLSymbol $sym30$TACT_DATA;
    private static SubLSymbol $sym31$_CSETF_TACT_DATA;
    private static SubLSymbol $sym32$TACT_PROPERTIES;
    private static SubLSymbol $sym33$_CSETF_TACT_PROPERTIES;
    private static SubLSymbol $SUID;
    private static SubLSymbol $PROBLEM;
    private static SubLSymbol $TYPE;
    private static SubLSymbol $HL_MODULE;
    private static SubLSymbol $COMPLETENESS;
    private static SubLSymbol $PREFERENCE_LEVEL_JUSTIFICATION;
    private static SubLSymbol $PRODUCTIVITY;
    private static SubLSymbol $ORIGINAL_PRODUCTIVITY;
    private static SubLSymbol $STATUS;
    private static SubLSymbol $PROGRESS_ITERATOR;
    private static SubLSymbol $DATA;
    private static SubLSymbol $PROPERTIES;
    private static SubLString $str46$Invalid_slot__S_for_construction_;
    private static SubLSymbol $BEGIN;
    private static SubLSymbol $sym48$MAKE_TACTIC;
    private static SubLSymbol $SLOT;
    private static SubLSymbol $END;
    private static SubLSymbol $sym51$VISIT_DEFSTRUCT_OBJECT_TACTIC_METHOD;
    private static SubLSymbol $FREE;
    private static SubLString $str53$_Invalid_TACTIC__s_;
    private static SubLString $str54$__a_TACTIC__a__a__a___a__a__;
    private static SubLSymbol $sym55$SXHASH_TACTIC_METHOD;
    private static SubLSymbol $sym56$PROBLEM_P;
    private static SubLSymbol $sym57$HL_MODULE_P;
    private static SubLSymbol $POSSIBLE;
    private static SubLSymbol $RECURSIVE_INFERENCES;
    private static SubLString $str60$proofy_problem__a_is_possible_but;
    private static SubLSymbol $sym61$PREFERENCE_LEVEL_P;
    private static SubLString $str62$tactical_productivity_being_refer;
    private static SubLSymbol $sym63$COMPLETENESS_P;
    private static SubLString $str64$;
    private static SubLSymbol $sym65$PRODUCTIVITY_P;
    private static SubLSymbol $sym66$TACTIC_STATUS_P;
    private static SubLSymbol $sym67$META_SPLIT_TACTIC_P;
    private static SubLSymbol $sym68$PROPERTY_LIST_P;
    private static SubLList $list69;
    private static SubLSymbol $sym70$DO_PROBLEM_RELEVANT_STRATEGIES;
    private static SubLSymbol $sym71$TACTIC_PROBLEM;
    private static SubLList $list72;
    private static SubLList $list73;
    private static SubLSymbol $ALLOW_OTHER_KEYS;
    private static SubLSymbol $DONE;
    private static SubLSymbol $PREFERENCE_LEVEL;
    private static SubLSymbol $sym77$TACTIC_VAR;
    private static SubLSymbol $sym78$CLET;
    private static SubLSymbol $sym79$DO_PROBLEM_TACTICS;
    private static SubLSymbol $sym80$PUNLESS;
    private static SubLSymbol $EXECUTED;
    private static SubLSymbol $DISCARDED;
    private static SubLSymbol $NON_DISCARDED;
    private static SubLSymbol $IN_PROGRESS;
    private static SubLSymbol $EXECUTED_OR_IN_PROGRESS;
    private static SubLSymbol $sym86$TACTIC_POSSIBLE_;
    private static SubLSymbol $sym87$TACTIC_PROGRESS_ITERATOR_P;
    private static SubLSymbol $sym88$_;
    private static SubLSymbol $sym89$TACTIC_PRODUCTIVITY;
    private static SubLSymbol $SKIP;
    private static SubLSymbol $sym91$TACTIC_PROGRESS_DONE_;
    private static SubLSymbol $sym92$TACTIC_PROGRESS_NEXT;
    private static SubLSymbol $sym93$TACTIC_PROGRESS_FINALIZE;
    private static SubLList $list94;
    private static SubLSymbol $REMOVAL_EXPAND;
    private static SubLSymbol $REMOVAL_OUTPUT_GENERATE;
    private static SubLList $list97;
    private static SubLSymbol $CONJUNCTIVE_REMOVAL_EXPAND;
    private static SubLSymbol $CONJUNCTIVE_REMOVAL_EXPAND_ITERATIVE;
    private static SubLSymbol $TRANSFORMATION_RULE_SELECT;
    private static SubLSymbol $META_STRUCTURAL;
    private static SubLString $str102$Time_to_implement_tactic_progress;
    private static SubLList $list103;
    private static SubLString $str104$Time_to_implement_tactic_progress;
    private static SubLString $str105$Time_to_implement_tactic_progress;

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1300L)
    public static SubLObject tactic_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        print_tactic(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1300L)
    public static SubLObject tactic_p(SubLObject v_object) {
        return (v_object.getClass() == $tactic_native.class) ? T : NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1300L)
    public static SubLObject tact_suid(SubLObject v_object) {
        assert NIL != tactic_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1300L)
    public static SubLObject tact_problem(SubLObject v_object) {
        assert NIL != tactic_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1300L)
    public static SubLObject tact_type(SubLObject v_object) {
        assert NIL != tactic_p(v_object) : v_object;
        return v_object.getField4();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1300L)
    public static SubLObject tact_hl_module(SubLObject v_object) {
        assert NIL != tactic_p(v_object) : v_object;
        return v_object.getField5();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1300L)
    public static SubLObject tact_completeness(SubLObject v_object) {
        assert NIL != tactic_p(v_object) : v_object;
        return v_object.getField6();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1300L)
    public static SubLObject tact_preference_level_justification(SubLObject v_object) {
        assert NIL != tactic_p(v_object) : v_object;
        return v_object.getField7();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1300L)
    public static SubLObject tact_productivity(SubLObject v_object) {
        assert NIL != tactic_p(v_object) : v_object;
        return v_object.getField8();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1300L)
    public static SubLObject tact_original_productivity(SubLObject v_object) {
        assert NIL != tactic_p(v_object) : v_object;
        return v_object.getField9();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1300L)
    public static SubLObject tact_status(SubLObject v_object) {
        assert NIL != tactic_p(v_object) : v_object;
        return v_object.getField10();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1300L)
    public static SubLObject tact_progress_iterator(SubLObject v_object) {
        assert NIL != tactic_p(v_object) : v_object;
        return v_object.getField11();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1300L)
    public static SubLObject tact_data(SubLObject v_object) {
        assert NIL != tactic_p(v_object) : v_object;
        return v_object.getField12();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1300L)
    public static SubLObject tact_properties(SubLObject v_object) {
        assert NIL != tactic_p(v_object) : v_object;
        return v_object.getField13();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1300L)
    public static SubLObject _csetf_tact_suid(SubLObject v_object, SubLObject value) {
        assert NIL != tactic_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1300L)
    public static SubLObject _csetf_tact_problem(SubLObject v_object, SubLObject value) {
        assert NIL != tactic_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1300L)
    public static SubLObject _csetf_tact_type(SubLObject v_object, SubLObject value) {
        assert NIL != tactic_p(v_object) : v_object;
        return v_object.setField4(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1300L)
    public static SubLObject _csetf_tact_hl_module(SubLObject v_object, SubLObject value) {
        assert NIL != tactic_p(v_object) : v_object;
        return v_object.setField5(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1300L)
    public static SubLObject _csetf_tact_completeness(SubLObject v_object, SubLObject value) {
        assert NIL != tactic_p(v_object) : v_object;
        return v_object.setField6(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1300L)
    public static SubLObject _csetf_tact_preference_level_justification(SubLObject v_object, SubLObject value) {
        assert NIL != tactic_p(v_object) : v_object;
        return v_object.setField7(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1300L)
    public static SubLObject _csetf_tact_productivity(SubLObject v_object, SubLObject value) {
        assert NIL != tactic_p(v_object) : v_object;
        return v_object.setField8(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1300L)
    public static SubLObject _csetf_tact_original_productivity(SubLObject v_object, SubLObject value) {
        assert NIL != tactic_p(v_object) : v_object;
        return v_object.setField9(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1300L)
    public static SubLObject _csetf_tact_status(SubLObject v_object, SubLObject value) {
        assert NIL != tactic_p(v_object) : v_object;
        return v_object.setField10(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1300L)
    public static SubLObject _csetf_tact_progress_iterator(SubLObject v_object, SubLObject value) {
        assert NIL != tactic_p(v_object) : v_object;
        return v_object.setField11(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1300L)
    public static SubLObject _csetf_tact_data(SubLObject v_object, SubLObject value) {
        assert NIL != tactic_p(v_object) : v_object;
        return v_object.setField12(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1300L)
    public static SubLObject _csetf_tact_properties(SubLObject v_object, SubLObject value) {
        assert NIL != tactic_p(v_object) : v_object;
        return v_object.setField13(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1300L)
    public static SubLObject make_tactic(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        SubLObject v_new = new $tactic_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SUID)) {
                _csetf_tact_suid(v_new, current_value);
            } else if (pcase_var.eql($PROBLEM)) {
                _csetf_tact_problem(v_new, current_value);
            } else if (pcase_var.eql($TYPE)) {
                _csetf_tact_type(v_new, current_value);
            } else if (pcase_var.eql($HL_MODULE)) {
                _csetf_tact_hl_module(v_new, current_value);
            } else if (pcase_var.eql($COMPLETENESS)) {
                _csetf_tact_completeness(v_new, current_value);
            } else if (pcase_var.eql($PREFERENCE_LEVEL_JUSTIFICATION)) {
                _csetf_tact_preference_level_justification(v_new, current_value);
            } else if (pcase_var.eql($PRODUCTIVITY)) {
                _csetf_tact_productivity(v_new, current_value);
            } else if (pcase_var.eql($ORIGINAL_PRODUCTIVITY)) {
                _csetf_tact_original_productivity(v_new, current_value);
            } else if (pcase_var.eql($STATUS)) {
                _csetf_tact_status(v_new, current_value);
            } else if (pcase_var.eql($PROGRESS_ITERATOR)) {
                _csetf_tact_progress_iterator(v_new, current_value);
            } else if (pcase_var.eql($DATA)) {
                _csetf_tact_data(v_new, current_value);
            } else if (pcase_var.eql($PROPERTIES)) {
                _csetf_tact_properties(v_new, current_value);
            } else {
                Errors.error($str46$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1300L)
    public static SubLObject visit_defstruct_tactic(SubLObject obj, SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, $BEGIN, $sym48$MAKE_TACTIC, TWELVE_INTEGER);
        Functions.funcall(visitor_fn, obj, $SLOT, $SUID, tact_suid(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PROBLEM, tact_problem(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $TYPE, tact_type(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $HL_MODULE, tact_hl_module(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $COMPLETENESS, tact_completeness(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PREFERENCE_LEVEL_JUSTIFICATION, tact_preference_level_justification(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PRODUCTIVITY, tact_productivity(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $ORIGINAL_PRODUCTIVITY, tact_original_productivity(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $STATUS, tact_status(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PROGRESS_ITERATOR, tact_progress_iterator(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $DATA, tact_data(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PROPERTIES, tact_properties(obj));
        Functions.funcall(visitor_fn, obj, $END, $sym48$MAKE_TACTIC, TWELVE_INTEGER);
        return obj;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1300L)
    public static SubLObject visit_defstruct_object_tactic_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_tactic(obj, visitor_fn);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 3000L)
    public static SubLObject valid_tactic_p(SubLObject tactic) {
        return makeBoolean(NIL != tactic_p(tactic) && NIL == tactic_invalid_p(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 3100L)
    public static SubLObject invalid_tactic_p(SubLObject tactic) {
        return makeBoolean(NIL != tactic_p(tactic) && NIL != tactic_invalid_p(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 3200L)
    public static SubLObject tactic_invalid_p(SubLObject tactic) {
        return Equality.eq($FREE, tactic_status(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 3400L)
    public static SubLObject print_tactic(SubLObject v_object, SubLObject stream, SubLObject depth) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != tactic_invalid_p(v_object)) {
            PrintLow.format(stream, $str53$_Invalid_TACTIC__s_, tactic_suid(v_object));
        } else {
            SubLObject problem = tactic_problem(v_object);
            PrintLow.format(stream, $str54$__a_TACTIC__a__a__a___a__a__, new SubLObject[] { tactic_hl_module_name(v_object), inference_datastructures_problem_store.problem_store_suid(inference_datastructures_problem.problem_store(problem)), inference_datastructures_problem.problem_suid(problem),
                    tactic_suid(v_object), (NIL != $leviathan_avoid_logical_tactic_productivity_computationP$.getDynamicValue(thread) && NIL != inference_worker.logical_tactic_p(v_object)) ? NIL : tactic_productivity(v_object), tact_completeness(v_object) });
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 4000L)
    public static SubLObject sxhash_tactic_method(SubLObject v_object) {
        SubLObject problem = tactic_problem(v_object);
        if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
            return Numbers.logxor(inference_datastructures_problem.problem_suid(problem), tactic_suid(v_object));
        }
        return ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 4400L)
    public static SubLObject new_tactic(SubLObject problem, SubLObject hl_module, SubLObject data) {
        if (data == UNPROVIDED) {
            data = NIL;
        }
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        assert NIL != inference_modules.hl_module_p(hl_module) : hl_module;
        SubLObject tactic = make_tactic(UNPROVIDED);
        SubLObject suid = inference_datastructures_problem.problem_next_tactic_suid(problem);
        _csetf_tact_suid(tactic, suid);
        _csetf_tact_problem(tactic, problem);
        _csetf_tact_type(tactic, inference_datastructures_enumerated_types.tactic_type_from_hl_module(hl_module));
        _csetf_tact_hl_module(tactic, hl_module);
        set_tactic_status(tactic, $POSSIBLE);
        _csetf_tact_progress_iterator(tactic, NIL);
        set_tactic_data(tactic, data);
        inference_datastructures_problem.add_problem_tactic(problem, tactic);
        inference_metrics.increment_tactic_historical_count();
        inference_datastructures_problem_store.problem_store_increment_historical_tactic_count(inference_datastructures_problem.problem_store(problem));
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 5300L)
    public static SubLObject destroy_problem_tactic(SubLObject tactic) {
        if (NIL != valid_tactic_p(tactic)) {
            SubLObject cdolist_list_var;
            SubLObject recursive_inferences = cdolist_list_var = conses_high.getf(tactic_properties(tactic), $RECURSIVE_INFERENCES, UNPROVIDED);
            SubLObject recursive_inference = NIL;
            recursive_inference = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (tactic_store(tactic).eql(inference_datastructures_inference.inference_problem_store(recursive_inference))) {
                    inference_datastructures_inference.destroy_inference(recursive_inference);
                }
                cdolist_list_var = cdolist_list_var.rest();
                recursive_inference = cdolist_list_var.first();
            }
            destroy_tactic_progress_iterator(tactic);
            note_tactic_invalid(tactic);
            SubLObject problem = tactic_problem(tactic);
            destroy_tactic_int(tactic);
            if (NIL != inference_datastructures_problem.tactically_possible_problem_p(problem) && inference_datastructures_problem.problem_tactic_count(problem).isZero()) {
                if (NIL != inference_datastructures_problem.problem_has_some_proven_proofP(problem)) {
                    Errors.warn($str60$proofy_problem__a_is_possible_but, problem);
                } else {
                    inference_datastructures_problem.destroy_problem(problem);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 6200L)
    public static SubLObject destroy_problem_tactic_and_backpointers(SubLObject tactic) {
        SubLObject problem = tactic_problem(tactic);
        if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
            inference_datastructures_problem.remove_problem_tactic(problem, tactic);
        }
        destroy_problem_tactic(tactic);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 6400L)
    public static SubLObject destroy_tactic_progress_iterator(SubLObject tactic) {
        SubLObject progress_iterator = tactic_progress_iterator(tactic);
        if (NIL != tactic_progress_iterator_p(progress_iterator)) {
            finalize_tactic_progress_iterator(progress_iterator);
            _csetf_tact_progress_iterator(tactic, NIL);
        }
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 6700L)
    public static SubLObject destroy_tactic_int(SubLObject tactic) {
        _csetf_tact_properties(tactic, $FREE);
        _csetf_tact_data(tactic, $FREE);
        _csetf_tact_progress_iterator(tactic, $FREE);
        _csetf_tact_completeness(tactic, $FREE);
        _csetf_tact_preference_level_justification(tactic, $FREE);
        _csetf_tact_productivity(tactic, $FREE);
        _csetf_tact_original_productivity(tactic, $FREE);
        _csetf_tact_hl_module(tactic, $FREE);
        _csetf_tact_problem(tactic, $FREE);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 7200L)
    public static SubLObject note_tactic_invalid(SubLObject tactic) {
        _csetf_tact_status(tactic, $FREE);
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 7300L)
    public static SubLObject tactic_suid(SubLObject tactic) {
        assert NIL != tactic_p(tactic) : tactic;
        return tact_suid(tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 7500L)
    public static SubLObject tactic_problem(SubLObject tactic) {
        assert NIL != tactic_p(tactic) : tactic;
        return tact_problem(tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 7600L)
    public static SubLObject tactic_hl_module(SubLObject tactic) {
        assert NIL != tactic_p(tactic) : tactic;
        return tact_hl_module(tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 7700L)
    public static SubLObject tactic_type(SubLObject tactic) {
        assert NIL != tactic_p(tactic) : tactic;
        return tact_type(tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 7900L)
    public static SubLObject tactic_completeness(SubLObject tactic) {
        assert NIL != tactic_p(tactic) : tactic;
        SubLObject completeness_or_preference = tact_completeness(tactic);
        if (NIL != preference_modules.preference_level_p(completeness_or_preference)) {
            completeness_or_preference = preference_modules.preference_level_to_completeness(completeness_or_preference);
        }
        return completeness_or_preference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 8400L)
    public static SubLObject tactic_preference_level(SubLObject tactic) {
        assert NIL != tactic_p(tactic) : tactic;
        SubLObject completeness_or_preference = tact_completeness(tactic);
        if (NIL != completeness_or_preference && !assertionsDisabledInClass && NIL == preference_modules.preference_level_p(completeness_or_preference)) {
            throw new AssertionError(completeness_or_preference);
        }
        return completeness_or_preference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 8800L)
    public static SubLObject tactic_preference_level_justification(SubLObject tactic) {
        assert NIL != tactic_p(tactic) : tactic;
        return tact_preference_level_justification(tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 9000L)
    public static SubLObject tactic_productivity(SubLObject tactic) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != tactic_p(tactic) : tactic;
        if (NIL != $leviathan_avoid_logical_tactic_productivity_computationP$.getDynamicValue(thread) && NIL != inference_worker.logical_tactic_p(tactic)) {
            return Errors.error($str62$tactical_productivity_being_refer, tactic);
        }
        return tact_productivity(tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 9300L)
    public static SubLObject tactic_original_productivity(SubLObject tactic) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != tactic_p(tactic) : tactic;
        if (NIL != $leviathan_avoid_logical_tactic_productivity_computationP$.getDynamicValue(thread) && NIL != inference_worker.logical_tactic_p(tactic)) {
            return Errors.error($str62$tactical_productivity_being_refer, tactic);
        }
        return tact_original_productivity(tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 9600L)
    public static SubLObject tactic_status(SubLObject tactic) {
        assert NIL != tactic_p(tactic) : tactic;
        return tact_status(tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 9700L)
    public static SubLObject tactic_progress_iterator(SubLObject tactic) {
        assert NIL != tactic_p(tactic) : tactic;
        return tact_progress_iterator(tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 9800L)
    public static SubLObject tactic_data(SubLObject tactic) {
        assert NIL != tactic_p(tactic) : tactic;
        return tact_data(tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 9900L)
    public static SubLObject tactic_properties(SubLObject tactic) {
        assert NIL != tactic_p(tactic) : tactic;
        return tact_properties(tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 10000L)
    public static SubLObject set_tactic_completeness(SubLObject tactic, SubLObject completeness) {
        assert NIL != tactic_p(tactic) : tactic;
        assert NIL != inference_datastructures_enumerated_types.completeness_p(completeness) : completeness;
        _csetf_tact_completeness(tactic, completeness);
        _csetf_tact_preference_level_justification(tactic, $str64$);
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 10300L)
    public static SubLObject set_tactic_preference_level(SubLObject tactic, SubLObject preference_level, SubLObject justification) {
        assert NIL != tactic_p(tactic) : tactic;
        assert NIL != preference_modules.preference_level_p(preference_level) : preference_level;
        _csetf_tact_completeness(tactic, preference_level);
        _csetf_tact_preference_level_justification(tactic, justification);
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 10800L)
    public static SubLObject set_tactic_productivity(SubLObject tactic, SubLObject productivity, SubLObject set_originalP) {
        if (set_originalP == UNPROVIDED) {
            set_originalP = T;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != tactic_p(tactic) : tactic;
        assert NIL != inference_datastructures_enumerated_types.productivity_p(productivity) : productivity;
        if (NIL != $leviathan_avoid_logical_tactic_productivity_computationP$.getDynamicValue(thread) && NIL != inference_worker.logical_tactic_p(tactic)) {
            return tactic;
        }
        if (NIL != $tactic_productivity_smoothing_method$.getDynamicValue(thread)) {
            productivity = Functions.funcall($tactic_productivity_smoothing_method$.getDynamicValue(thread), productivity);
        }
        _csetf_tact_productivity(tactic, productivity);
        if (NIL != set_originalP) {
            _csetf_tact_original_productivity(tactic, productivity);
        }
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 11400L)
    public static SubLObject set_tactic_status(SubLObject tactic, SubLObject status) {
        assert NIL != tactic_p(tactic) : tactic;
        assert NIL != inference_datastructures_enumerated_types.tactic_status_p(status) : status;
        _csetf_tact_status(tactic, status);
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 11600L)
    public static SubLObject set_tactic_data(SubLObject tactic, SubLObject data) {
        assert NIL != tactic_p(tactic) : tactic;
        _csetf_tact_data(tactic, data);
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 11800L)
    public static SubLObject set_meta_split_tactic_data(SubLObject tactic, SubLObject data) {
        assert NIL != inference_worker_split.meta_split_tactic_p(tactic) : tactic;
        return set_tactic_data(tactic, data);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 11900L)
    public static SubLObject set_tactic_properties(SubLObject tactic, SubLObject v_properties) {
        assert NIL != tactic_p(tactic) : tactic;
        assert NIL != list_utilities.property_list_p(v_properties) : v_properties;
        _csetf_tact_properties(tactic, v_properties);
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 12100L)
    public static SubLObject set_tactic_property(SubLObject tactic, SubLObject key, SubLObject value) {
        assert NIL != tactic_p(tactic) : tactic;
        conses_high.putf(tact_properties(tactic), key, value);
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 12200L)
    public static SubLObject push_tactic_property(SubLObject tactic, SubLObject key, SubLObject value) {
        assert NIL != tactic_p(tactic) : tactic;
        SubLObject v_properties = tact_properties(tactic);
        v_properties = conses_high.putf(v_properties, key, cons(value, list_utilities.plist_lookup(v_properties, key, NIL)));
        _csetf_tact_properties(tactic, v_properties);
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 12500L)
    public static SubLObject do_tactic_relevant_strategies(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list69);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject strategy_var = NIL;
        SubLObject tactic = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list69);
        strategy_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list69);
        tactic = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            return listS($sym70$DO_PROBLEM_RELEVANT_STRATEGIES, list(strategy_var, list($sym71$TACTIC_PROBLEM, tactic)), append(body, NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list69);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 12800L)
    public static SubLObject do_tactic_sibling_tactics(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list72);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject sibling_tactic_var = NIL;
        SubLObject tactic = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list72);
        sibling_tactic_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list72);
        tactic = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list72);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list72);
            if (NIL == conses_high.member(current_$1, $list73, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list72);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject status_tail = cdestructuring_bind.property_list_member($STATUS, current);
        SubLObject status = (NIL != status_tail) ? conses_high.cadr(status_tail) : NIL;
        SubLObject completeness_tail = cdestructuring_bind.property_list_member($COMPLETENESS, current);
        SubLObject completeness = (NIL != completeness_tail) ? conses_high.cadr(completeness_tail) : NIL;
        SubLObject preference_level_tail = cdestructuring_bind.property_list_member($PREFERENCE_LEVEL, current);
        SubLObject preference_level = (NIL != preference_level_tail) ? conses_high.cadr(preference_level_tail) : NIL;
        SubLObject hl_module_tail = cdestructuring_bind.property_list_member($HL_MODULE, current);
        SubLObject hl_module = (NIL != hl_module_tail) ? conses_high.cadr(hl_module_tail) : NIL;
        SubLObject type_tail = cdestructuring_bind.property_list_member($TYPE, current);
        SubLObject type = (NIL != type_tail) ? conses_high.cadr(type_tail) : NIL;
        SubLObject productivity_tail = cdestructuring_bind.property_list_member($PRODUCTIVITY, current);
        SubLObject productivity = (NIL != productivity_tail) ? conses_high.cadr(productivity_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        SubLObject tactic_var = $sym77$TACTIC_VAR;
        return list($sym78$CLET, list(list(tactic_var, tactic)),
                list($sym79$DO_PROBLEM_TACTICS,
                        list(new SubLObject[] { sibling_tactic_var, list($sym71$TACTIC_PROBLEM, tactic_var), $DONE, done, $STATUS, status, $COMPLETENESS, completeness, $PREFERENCE_LEVEL, preference_level, $HL_MODULE, hl_module, $TYPE, type, $PRODUCTIVITY, productivity }),
                        listS($sym80$PUNLESS, list(EQ, sibling_tactic_var, tactic_var), append(body, NIL))));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 13400L)
    public static SubLObject tactic_ids(SubLObject tactic) {
        return Values.values(inference_datastructures_problem_store.problem_store_suid(tactic_store(tactic)), inference_datastructures_problem.problem_suid(tactic_problem(tactic)), tactic_suid(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 13600L)
    public static SubLObject find_tactic_by_id(SubLObject problem, SubLObject id) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        SubLObject count = inference_datastructures_problem.problem_tactic_count(problem);
        SubLObject index = number_utilities.f_1_(Numbers.subtract(count, id));
        if (NIL != subl_promotions.non_negative_integer_p(index)) {
            SubLObject tactics = inference_datastructures_problem.problem_tactics(problem);
            return nth(index, tactics);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 14000L)
    public static SubLObject find_tactic_by_ids(SubLObject store_suid, SubLObject problem_suid, SubLObject tactic_suid) {
        SubLObject problem = inference_datastructures_problem_store.find_problem_by_ids(store_suid, problem_suid);
        if (NIL != problem) {
            SubLObject tactic = find_tactic_by_id(problem, tactic_suid);
            return tactic;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 14200L)
    public static SubLObject tactic_hl_module_name(SubLObject tactic) {
        return inference_modules.hl_module_name(tactic_hl_module(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 14300L)
    public static SubLObject tactic_possibleP(SubLObject tactic) {
        return Equality.eq($POSSIBLE, tactic_status(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 14400L)
    public static SubLObject tactic_in_progressP(SubLObject tactic) {
        return makeBoolean(NIL != tactic_possibleP(tactic) && NIL != tactic_progress_iterator_p(tactic_progress_iterator(tactic)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 14600L)
    public static SubLObject tactic_not_possibleP(SubLObject tactic) {
        return makeBoolean(NIL == tactic_possibleP(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 14700L)
    public static SubLObject tactic_executedP(SubLObject tactic) {
        return Equality.eq($EXECUTED, tactic_status(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 14800L)
    public static SubLObject tactic_discardedP(SubLObject tactic) {
        return Equality.eq($DISCARDED, tactic_status(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 14900L)
    public static SubLObject tactic_has_statusP(SubLObject tactic, SubLObject status_spec) {
        if (status_spec.eql($NON_DISCARDED)) {
            return makeBoolean(NIL == tactic_discardedP(tactic));
        }
        if (status_spec.eql($IN_PROGRESS)) {
            return tactic_in_progressP(tactic);
        }
        if (status_spec.eql($EXECUTED_OR_IN_PROGRESS)) {
            return makeBoolean(NIL != tactic_executedP(tactic) || NIL != tactic_in_progressP(tactic));
        }
        return Equality.eq(status_spec, tactic_status(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 15300L)
    public static SubLObject abductive_tacticP(SubLObject tactic) {
        return inference_modules.abductive_hl_moduleP(tactic_hl_module(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 15400L)
    public static SubLObject tactic_store(SubLObject tactic) {
        return inference_datastructures_problem.problem_store(tactic_problem(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 15500L)
    public static SubLObject tactic_problem_query(SubLObject tactic) {
        SubLObject problem = tactic_problem(tactic);
        return inference_datastructures_problem.problem_query(problem);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 15700L)
    public static SubLObject tactic_problem_sole_clause(SubLObject tactic) {
        SubLObject problem = tactic_problem(tactic);
        return inference_datastructures_problem.problem_sole_clause(problem);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 15900L)
    public static SubLObject update_tactic_productivity(SubLObject tactic, SubLObject new_productivity) {
        SubLObject old_productivity = tactic_productivity(tactic);
        set_tactic_productivity(tactic, new_productivity, NIL);
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 16300L)
    public static SubLObject decrement_tactic_productivity_for_number_of_children(SubLObject tactic, SubLObject number) {
        if (number == UNPROVIDED) {
            number = ONE_INTEGER;
        }
        SubLObject old_productivity = tactic_productivity(tactic);
        SubLObject new_productivity = inference_datastructures_enumerated_types.decrement_productivity_for_number_of_children(old_productivity, number);
        new_productivity = Numbers.max(new_productivity, ZERO_INTEGER);
        set_tactic_productivity(tactic, new_productivity, NIL);
        return new_productivity;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 16800L)
    public static SubLObject note_tactic_executed(SubLObject tactic) {
        set_tactic_status(tactic, $EXECUTED);
        inference_metrics.increment_executed_tactic_historical_count();
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 17000L)
    public static SubLObject note_tactic_discarded(SubLObject tactic) {
        if (NIL != valid_tactic_p(tactic)) {
            clear_tactic_progress_iterator(tactic);
            set_tactic_status(tactic, $DISCARDED);
            inference_metrics.increment_discarded_tactic_historical_count();
            inference_datastructures_strategy.set_tactic_recompute_thrown_away_wrt_all_relevant_strategies(tactic);
        }
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 17300L)
    public static SubLObject note_tactic_progress_iterator(SubLObject tactic, SubLObject progress_iterator) {
        assert NIL != tactic_possibleP(tactic) : tactic;
        assert NIL != tactic_progress_iterator_p(progress_iterator) : progress_iterator;
        _csetf_tact_progress_iterator(tactic, progress_iterator);
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 17600L)
    public static SubLObject clear_tactic_progress_iterator(SubLObject tactic) {
        assert NIL != tactic_possibleP(tactic) : tactic;
        destroy_tactic_progress_iterator(tactic);
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 17800L)
    public static SubLObject tactic_in_progress_next(SubLObject tactic) {
        SubLObject progress_iterator = tactic_progress_iterator(tactic);
        SubLObject successP = NIL;
        try {
            if (NIL == iteration.iteration_done(progress_iterator)) {
                iteration.iteration_next(progress_iterator);
                successP = T;
            }
        } finally {
            SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                SubLObject _values = Values.getValuesAsVector();
                if ((NIL == successP || NIL != iteration.iteration_done(progress_iterator)) && NIL != tactic_possibleP(tactic)) {
                    clear_tactic_progress_iterator(tactic);
                }
                Values.restoreValuesFromVector(_values);
            } finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return successP;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 18300L)
    public static SubLObject possibly_update_tactic_productivity_from_iterator(SubLObject tactic, SubLObject output_iterator) {
        SubLObject number_of_children = NIL;
        SubLObject new_productivity = NIL;
        if (NIL != iteration.list_iterator_p(output_iterator)) {
            number_of_children = iteration.list_iterator_size(output_iterator);
        } else if (NIL != inference_worker_removal.conjunctive_removal_tactic_p(tactic) && NIL != sksi_query_utilities.sksi_cost_recording_iterator_p(output_iterator)) {
            number_of_children = sksi_query_utilities.sksi_cost_recording_iterator_size(output_iterator);
        }
        if (NIL != number_of_children) {
            new_productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(number_of_children);
        }
        if (NIL != inference_datastructures_enumerated_types.productivity_p(new_productivity)) {
            update_tactic_productivity(tactic, new_productivity);
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 19100L)
    public static SubLObject select_least_productive_tactic(SubLObject tactics) {
        return list_utilities.extremal(tactics, Symbols.symbol_function($sym88$_), $sym89$TACTIC_PRODUCTIVITY);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 19200L)
    public static SubLObject total_productivity_of_tactics(SubLObject tactics) {
        SubLObject productivity = ZERO_INTEGER;
        SubLObject cdolist_list_var = tactics;
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            productivity = Numbers.add(productivity, tactic_productivity(tactic));
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return productivity;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 19400L)
    public static SubLObject total_productivity_of_problem_possible_tactics(SubLObject problem) {
        SubLObject productivity = ZERO_INTEGER;
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, $POSSIBLE)) {
                productivity = inference_datastructures_enumerated_types.productivity_X(productivity, tactic_productivity(tactic));
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return productivity;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 19700L)
    public static SubLObject min_productivity_of_problem_possible_tactics(SubLObject problem) {
        SubLObject least_productivity = number_utilities.positive_infinity();
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, $POSSIBLE)) {
                SubLObject productivity = tactic_productivity(tactic);
                if (NIL != inference_datastructures_enumerated_types.productivity_L(productivity, least_productivity)) {
                    least_productivity = productivity;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return least_productivity;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 20100L)
    public static SubLObject note_tactic_most_recent_executed(SubLObject tactic) {
        assert NIL != tactic_p(tactic) : tactic;
        inference_datastructures_problem_store.note_problem_store_most_recent_tactic_executed(tactic_store(tactic), tactic);
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 20300L)
    public static SubLObject problem_store_tactic_execution_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$2 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$2, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$2);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                SubLObject cdolist_list_var;
                SubLObject tactic;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
                        tactic = NIL;
                        tactic = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            count = Numbers.add(count, tactic_execution_count(tactic));
                            cdolist_list_var = cdolist_list_var.rest();
                            tactic = cdolist_list_var.first();
                        }
                    }
                }
            }
            SubLObject idx_$3 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$3)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$3);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        SubLObject cdolist_list_var2 = inference_datastructures_problem.problem_tactics(problem2);
                        SubLObject tactic2 = NIL;
                        tactic2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            count = Numbers.add(count, tactic_execution_count(tactic2));
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            tactic2 = cdolist_list_var2.first();
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 20700L)
    public static SubLObject tactic_execution_count(SubLObject tactic) {
        if (NIL != inference_worker.content_tactic_p(tactic)) {
            return Numbers.round(inference_datastructures_enumerated_types.number_of_children_for_productivity(inference_worker.content_tactic_actual_productivity(tactic)), UNPROVIDED);
        }
        if (NIL != tactic_executedP(tactic)) {
            return ONE_INTEGER;
        }
        return ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 21100L)
    public static SubLObject tactic_progress_iterator_p(SubLObject v_object) {
        return iteration.iterator_p(v_object);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 21300L)
    public static SubLObject new_tactic_progress_iterator(SubLObject iteration_type, SubLObject tactic, SubLObject sub_state) {
        return iteration.new_iterator(make_tactic_progress_iterator_state(iteration_type, tactic, sub_state), $sym91$TACTIC_PROGRESS_DONE_, $sym92$TACTIC_PROGRESS_NEXT, $sym93$TACTIC_PROGRESS_FINALIZE);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 21600L)
    public static SubLObject make_tactic_progress_iterator_state(SubLObject iteration_type, SubLObject tactic, SubLObject sub_state) {
        return list(sub_state, iteration_type, tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 21700L)
    public static SubLObject tactic_progress_doneP(SubLObject state) {
        SubLObject current_$4 = NIL;
        SubLObject iteration_type = NIL;
        SubLObject tactic = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, $list94);
        current_$4 = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, $list94);
        iteration_type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, $list94);
        tactic = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject pcase_var = iteration_type;
            if (pcase_var.eql($REMOVAL_EXPAND)) {
                return Types.sublisp_null(current_$4);
            }
            if (pcase_var.eql($REMOVAL_OUTPUT_GENERATE)) {
                SubLObject current_$5;
                SubLObject datum_$5 = current_$5 = current_$4;
                SubLObject output_iterator = NIL;
                SubLObject v_bindings = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$5, datum_$5, $list97);
                output_iterator = current_$5.first();
                current_$5 = current_$5.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$5, datum_$5, $list97);
                v_bindings = current_$5.first();
                current_$5 = current_$5.rest();
                if (NIL == current_$5) {
                    return iteration.iteration_done(output_iterator);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$5, $list97);
            } else {
                if (pcase_var.eql($CONJUNCTIVE_REMOVAL_EXPAND)) {
                    return Types.sublisp_null(current_$4);
                }
                if (pcase_var.eql($CONJUNCTIVE_REMOVAL_EXPAND_ITERATIVE)) {
                    return iteration.iteration_done(current_$4);
                }
                if (pcase_var.eql($TRANSFORMATION_RULE_SELECT)) {
                    return Types.sublisp_null(current_$4);
                }
                if (pcase_var.eql($META_STRUCTURAL)) {
                    return inference_worker_split.meta_structural_progress_iterator_doneP(tactic);
                }
                return Errors.error($str102$Time_to_implement_tactic_progress, iteration_type);
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(state, $list94);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 22500L)
    public static SubLObject tactic_progress_next(SubLObject state) {
        SubLObject current_$7 = NIL;
        SubLObject iteration_type = NIL;
        SubLObject tactic = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, $list94);
        current_$7 = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, $list94);
        iteration_type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, $list94);
        tactic = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject pcase_var = iteration_type;
            if (pcase_var.eql($REMOVAL_EXPAND)) {
                SubLObject expand_result = current_$7.first();
                SubLObject update = current_$7.rest();
                rplaca(state, update);
                SubLObject side_effect_result = inference_worker_removal.handle_one_removal_tactic_expand_result(tactic, expand_result);
                return subl_promotions.values3(side_effect_result, state, NIL);
            }
            if (pcase_var.eql($REMOVAL_OUTPUT_GENERATE)) {
                SubLObject current_$8;
                SubLObject datum_$8 = current_$8 = current_$7;
                SubLObject output_iterator = NIL;
                SubLObject encoded_bindings = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$8, datum_$8, $list103);
                output_iterator = current_$8.first();
                current_$8 = current_$8.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$8, datum_$8, $list103);
                encoded_bindings = current_$8.first();
                current_$8 = current_$8.rest();
                if (NIL == current_$8) {
                    SubLObject side_effect_result2 = inference_worker_removal.handle_one_removal_tactic_output_generate_result(tactic, output_iterator, encoded_bindings);
                    return subl_promotions.values3(side_effect_result2, state, NIL);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$8, $list103);
            } else {
                if (pcase_var.eql($CONJUNCTIVE_REMOVAL_EXPAND)) {
                    SubLObject expand_result = current_$7.first();
                    SubLObject update = current_$7.rest();
                    rplaca(state, update);
                    SubLObject side_effect_result = inference_worker_removal.handle_one_conjunctive_removal_tactic_expand_result(tactic, expand_result);
                    return subl_promotions.values3(side_effect_result, state, NIL);
                }
                if (pcase_var.eql($CONJUNCTIVE_REMOVAL_EXPAND_ITERATIVE)) {
                    SubLObject side_effect_result3 = inference_worker_removal.handle_one_conjunctive_removal_tactic_expand_iterative_result(tactic, current_$7);
                    return subl_promotions.values3(side_effect_result3, state, NIL);
                }
                if (pcase_var.eql($TRANSFORMATION_RULE_SELECT)) {
                    SubLObject rule = current_$7.first();
                    SubLObject update = current_$7.rest();
                    rplaca(state, update);
                    SubLObject side_effect_result = inference_worker_transformation.handle_one_transformation_tactic_rule_select_result(tactic, rule);
                    return subl_promotions.values3(side_effect_result, state, NIL);
                }
                if (pcase_var.eql($META_STRUCTURAL)) {
                    inference_worker_split.execute_meta_split_tactic(tactic);
                    return subl_promotions.values3(NIL, state, NIL);
                }
                return Errors.error($str104$Time_to_implement_tactic_progress, iteration_type);
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(state, $list94);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 24300L)
    public static SubLObject tactic_progress_finalize(SubLObject state) {
        SubLObject current_$10 = NIL;
        SubLObject iteration_type = NIL;
        SubLObject tactic = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, $list94);
        current_$10 = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, $list94);
        iteration_type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, $list94);
        tactic = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject pcase_var = iteration_type;
            if (pcase_var.eql($REMOVAL_EXPAND)) {
                return T;
            }
            if (pcase_var.eql($REMOVAL_OUTPUT_GENERATE)) {
                SubLObject current_$11;
                SubLObject datum_$11 = current_$11 = current_$10;
                SubLObject output_iterator = NIL;
                SubLObject encoded_bindings = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$11, datum_$11, $list103);
                output_iterator = current_$11.first();
                current_$11 = current_$11.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$11, datum_$11, $list103);
                encoded_bindings = current_$11.first();
                current_$11 = current_$11.rest();
                if (NIL == current_$11) {
                    return iteration.iteration_finalize(output_iterator);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$11, $list103);
            } else {
                if (pcase_var.eql($CONJUNCTIVE_REMOVAL_EXPAND)) {
                    return T;
                }
                if (pcase_var.eql($CONJUNCTIVE_REMOVAL_EXPAND_ITERATIVE)) {
                    return iteration.iteration_finalize(current_$10);
                }
                if (pcase_var.eql($TRANSFORMATION_RULE_SELECT)) {
                    return T;
                }
                if (pcase_var.eql($META_STRUCTURAL)) {
                    return T;
                }
                return Errors.error($str105$Time_to_implement_tactic_progress, iteration_type);
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(state, $list94);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 25000L)
    public static SubLObject finalize_tactic_progress_iterator(SubLObject progress_iterator) {
        assert NIL != tactic_progress_iterator_p(progress_iterator) : progress_iterator;
        iteration.iteration_finalize(progress_iterator);
        return progress_iterator;
    }

    public static SubLObject declare_inference_datastructures_tactic_file() {
        declareFunction(myName, "tactic_print_function_trampoline", "TACTIC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(myName, "tactic_p", "TACTIC-P", 1, 0, false);
        new $tactic_p$UnaryFunction();
        declareFunction(myName, "tact_suid", "TACT-SUID", 1, 0, false);
        declareFunction(myName, "tact_problem", "TACT-PROBLEM", 1, 0, false);
        declareFunction(myName, "tact_type", "TACT-TYPE", 1, 0, false);
        declareFunction(myName, "tact_hl_module", "TACT-HL-MODULE", 1, 0, false);
        declareFunction(myName, "tact_completeness", "TACT-COMPLETENESS", 1, 0, false);
        declareFunction(myName, "tact_preference_level_justification", "TACT-PREFERENCE-LEVEL-JUSTIFICATION", 1, 0, false);
        declareFunction(myName, "tact_productivity", "TACT-PRODUCTIVITY", 1, 0, false);
        declareFunction(myName, "tact_original_productivity", "TACT-ORIGINAL-PRODUCTIVITY", 1, 0, false);
        declareFunction(myName, "tact_status", "TACT-STATUS", 1, 0, false);
        declareFunction(myName, "tact_progress_iterator", "TACT-PROGRESS-ITERATOR", 1, 0, false);
        declareFunction(myName, "tact_data", "TACT-DATA", 1, 0, false);
        declareFunction(myName, "tact_properties", "TACT-PROPERTIES", 1, 0, false);
        declareFunction(myName, "_csetf_tact_suid", "_CSETF-TACT-SUID", 2, 0, false);
        declareFunction(myName, "_csetf_tact_problem", "_CSETF-TACT-PROBLEM", 2, 0, false);
        declareFunction(myName, "_csetf_tact_type", "_CSETF-TACT-TYPE", 2, 0, false);
        declareFunction(myName, "_csetf_tact_hl_module", "_CSETF-TACT-HL-MODULE", 2, 0, false);
        declareFunction(myName, "_csetf_tact_completeness", "_CSETF-TACT-COMPLETENESS", 2, 0, false);
        declareFunction(myName, "_csetf_tact_preference_level_justification", "_CSETF-TACT-PREFERENCE-LEVEL-JUSTIFICATION", 2, 0, false);
        declareFunction(myName, "_csetf_tact_productivity", "_CSETF-TACT-PRODUCTIVITY", 2, 0, false);
        declareFunction(myName, "_csetf_tact_original_productivity", "_CSETF-TACT-ORIGINAL-PRODUCTIVITY", 2, 0, false);
        declareFunction(myName, "_csetf_tact_status", "_CSETF-TACT-STATUS", 2, 0, false);
        declareFunction(myName, "_csetf_tact_progress_iterator", "_CSETF-TACT-PROGRESS-ITERATOR", 2, 0, false);
        declareFunction(myName, "_csetf_tact_data", "_CSETF-TACT-DATA", 2, 0, false);
        declareFunction(myName, "_csetf_tact_properties", "_CSETF-TACT-PROPERTIES", 2, 0, false);
        declareFunction(myName, "make_tactic", "MAKE-TACTIC", 0, 1, false);
        declareFunction(myName, "visit_defstruct_tactic", "VISIT-DEFSTRUCT-TACTIC", 2, 0, false);
        declareFunction(myName, "visit_defstruct_object_tactic_method", "VISIT-DEFSTRUCT-OBJECT-TACTIC-METHOD", 2, 0, false);
        declareFunction(myName, "valid_tactic_p", "VALID-TACTIC-P", 1, 0, false);
        declareFunction(myName, "invalid_tactic_p", "INVALID-TACTIC-P", 1, 0, false);
        declareFunction(myName, "tactic_invalid_p", "TACTIC-INVALID-P", 1, 0, false);
        declareFunction(myName, "print_tactic", "PRINT-TACTIC", 3, 0, false);
        declareFunction(myName, "sxhash_tactic_method", "SXHASH-TACTIC-METHOD", 1, 0, false);
        new $sxhash_tactic_method$UnaryFunction();
        declareFunction(myName, "new_tactic", "NEW-TACTIC", 2, 1, false);
        declareFunction(myName, "destroy_problem_tactic", "DESTROY-PROBLEM-TACTIC", 1, 0, false);
        declareFunction(myName, "destroy_problem_tactic_and_backpointers", "DESTROY-PROBLEM-TACTIC-AND-BACKPOINTERS", 1, 0, false);
        declareFunction(myName, "destroy_tactic_progress_iterator", "DESTROY-TACTIC-PROGRESS-ITERATOR", 1, 0, false);
        declareFunction(myName, "destroy_tactic_int", "DESTROY-TACTIC-INT", 1, 0, false);
        declareFunction(myName, "note_tactic_invalid", "NOTE-TACTIC-INVALID", 1, 0, false);
        declareFunction(myName, "tactic_suid", "TACTIC-SUID", 1, 0, false);
        declareFunction(myName, "tactic_problem", "TACTIC-PROBLEM", 1, 0, false);
        declareFunction(myName, "tactic_hl_module", "TACTIC-HL-MODULE", 1, 0, false);
        declareFunction(myName, "tactic_type", "TACTIC-TYPE", 1, 0, false);
        declareFunction(myName, "tactic_completeness", "TACTIC-COMPLETENESS", 1, 0, false);
        declareFunction(myName, "tactic_preference_level", "TACTIC-PREFERENCE-LEVEL", 1, 0, false);
        declareFunction(myName, "tactic_preference_level_justification", "TACTIC-PREFERENCE-LEVEL-JUSTIFICATION", 1, 0, false);
        declareFunction(myName, "tactic_productivity", "TACTIC-PRODUCTIVITY", 1, 0, false);
        declareFunction(myName, "tactic_original_productivity", "TACTIC-ORIGINAL-PRODUCTIVITY", 1, 0, false);
        declareFunction(myName, "tactic_status", "TACTIC-STATUS", 1, 0, false);
        declareFunction(myName, "tactic_progress_iterator", "TACTIC-PROGRESS-ITERATOR", 1, 0, false);
        declareFunction(myName, "tactic_data", "TACTIC-DATA", 1, 0, false);
        declareFunction(myName, "tactic_properties", "TACTIC-PROPERTIES", 1, 0, false);
        declareFunction(myName, "set_tactic_completeness", "SET-TACTIC-COMPLETENESS", 2, 0, false);
        declareFunction(myName, "set_tactic_preference_level", "SET-TACTIC-PREFERENCE-LEVEL", 3, 0, false);
        declareFunction(myName, "set_tactic_productivity", "SET-TACTIC-PRODUCTIVITY", 2, 1, false);
        declareFunction(myName, "set_tactic_status", "SET-TACTIC-STATUS", 2, 0, false);
        declareFunction(myName, "set_tactic_data", "SET-TACTIC-DATA", 2, 0, false);
        declareFunction(myName, "set_meta_split_tactic_data", "SET-META-SPLIT-TACTIC-DATA", 2, 0, false);
        declareFunction(myName, "set_tactic_properties", "SET-TACTIC-PROPERTIES", 2, 0, false);
        declareFunction(myName, "set_tactic_property", "SET-TACTIC-PROPERTY", 3, 0, false);
        declareFunction(myName, "push_tactic_property", "PUSH-TACTIC-PROPERTY", 3, 0, false);
        declareMacro(me, "do_tactic_relevant_strategies", "DO-TACTIC-RELEVANT-STRATEGIES");
        declareMacro(me, "do_tactic_sibling_tactics", "DO-TACTIC-SIBLING-TACTICS");
        declareFunction(myName, "tactic_ids", "TACTIC-IDS", 1, 0, false);
        declareFunction(myName, "find_tactic_by_id", "FIND-TACTIC-BY-ID", 2, 0, false);
        declareFunction(myName, "find_tactic_by_ids", "FIND-TACTIC-BY-IDS", 3, 0, false);
        declareFunction(myName, "tactic_hl_module_name", "TACTIC-HL-MODULE-NAME", 1, 0, false);
        declareFunction(myName, "tactic_possibleP", "TACTIC-POSSIBLE?", 1, 0, false);
        new $tactic_possibleP$UnaryFunction();
        declareFunction(myName, "tactic_in_progressP", "TACTIC-IN-PROGRESS?", 1, 0, false);
        declareFunction(myName, "tactic_not_possibleP", "TACTIC-NOT-POSSIBLE?", 1, 0, false);
        declareFunction(myName, "tactic_executedP", "TACTIC-EXECUTED?", 1, 0, false);
        declareFunction(myName, "tactic_discardedP", "TACTIC-DISCARDED?", 1, 0, false);
        declareFunction(myName, "tactic_has_statusP", "TACTIC-HAS-STATUS?", 2, 0, false);
        declareFunction(myName, "abductive_tacticP", "ABDUCTIVE-TACTIC?", 1, 0, false);
        declareFunction(myName, "tactic_store", "TACTIC-STORE", 1, 0, false);
        declareFunction(myName, "tactic_problem_query", "TACTIC-PROBLEM-QUERY", 1, 0, false);
        declareFunction(myName, "tactic_problem_sole_clause", "TACTIC-PROBLEM-SOLE-CLAUSE", 1, 0, false);
        declareFunction(myName, "update_tactic_productivity", "UPDATE-TACTIC-PRODUCTIVITY", 2, 0, false);
        declareFunction(myName, "decrement_tactic_productivity_for_number_of_children", "DECREMENT-TACTIC-PRODUCTIVITY-FOR-NUMBER-OF-CHILDREN", 1, 1, false);
        declareFunction(myName, "note_tactic_executed", "NOTE-TACTIC-EXECUTED", 1, 0, false);
        declareFunction(myName, "note_tactic_discarded", "NOTE-TACTIC-DISCARDED", 1, 0, false);
        declareFunction(myName, "note_tactic_progress_iterator", "NOTE-TACTIC-PROGRESS-ITERATOR", 2, 0, false);
        declareFunction(myName, "clear_tactic_progress_iterator", "CLEAR-TACTIC-PROGRESS-ITERATOR", 1, 0, false);
        declareFunction(myName, "tactic_in_progress_next", "TACTIC-IN-PROGRESS-NEXT", 1, 0, false);
        declareFunction(myName, "possibly_update_tactic_productivity_from_iterator", "POSSIBLY-UPDATE-TACTIC-PRODUCTIVITY-FROM-ITERATOR", 2, 0, false);
        declareFunction(myName, "select_least_productive_tactic", "SELECT-LEAST-PRODUCTIVE-TACTIC", 1, 0, false);
        declareFunction(myName, "total_productivity_of_tactics", "TOTAL-PRODUCTIVITY-OF-TACTICS", 1, 0, false);
        declareFunction(myName, "total_productivity_of_problem_possible_tactics", "TOTAL-PRODUCTIVITY-OF-PROBLEM-POSSIBLE-TACTICS", 1, 0, false);
        declareFunction(myName, "min_productivity_of_problem_possible_tactics", "MIN-PRODUCTIVITY-OF-PROBLEM-POSSIBLE-TACTICS", 1, 0, false);
        declareFunction(myName, "note_tactic_most_recent_executed", "NOTE-TACTIC-MOST-RECENT-EXECUTED", 1, 0, false);
        declareFunction(myName, "problem_store_tactic_execution_count", "PROBLEM-STORE-TACTIC-EXECUTION-COUNT", 1, 0, false);
        declareFunction(myName, "tactic_execution_count", "TACTIC-EXECUTION-COUNT", 1, 0, false);
        declareFunction(myName, "tactic_progress_iterator_p", "TACTIC-PROGRESS-ITERATOR-P", 1, 0, false);
        declareFunction(myName, "new_tactic_progress_iterator", "NEW-TACTIC-PROGRESS-ITERATOR", 3, 0, false);
        declareFunction(myName, "make_tactic_progress_iterator_state", "MAKE-TACTIC-PROGRESS-ITERATOR-STATE", 3, 0, false);
        declareFunction(myName, "tactic_progress_doneP", "TACTIC-PROGRESS-DONE?", 1, 0, false);
        new $tactic_progress_doneP$UnaryFunction();
        declareFunction(myName, "tactic_progress_next", "TACTIC-PROGRESS-NEXT", 1, 0, false);
        new $tactic_progress_next$UnaryFunction();
        declareFunction(myName, "tactic_progress_finalize", "TACTIC-PROGRESS-FINALIZE", 1, 0, false);
        new $tactic_progress_finalize$UnaryFunction();
        declareFunction(myName, "finalize_tactic_progress_iterator", "FINALIZE-TACTIC-PROGRESS-ITERATOR", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_datastructures_tactic_file() {
        $leviathan_avoid_logical_tactic_productivity_computationP$ = SubLFiles.defvar("*LEVIATHAN-AVOID-LOGICAL-TACTIC-PRODUCTIVITY-COMPUTATION?*", NIL);
        $dtp_tactic$ = defconstant("*DTP-TACTIC*", $sym0$TACTIC);
        $tactic_productivity_smoothing_method$ = defparameter("*TACTIC-PRODUCTIVITY-SMOOTHING-METHOD*", NIL);
        return NIL;
    }

    public static SubLObject setup_inference_datastructures_tactic_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_tactic$.getGlobalValue(), Symbols.symbol_function($sym8$TACTIC_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        Structures.def_csetf($sym10$TACT_SUID, $sym11$_CSETF_TACT_SUID);
        Structures.def_csetf($sym12$TACT_PROBLEM, $sym13$_CSETF_TACT_PROBLEM);
        Structures.def_csetf($sym14$TACT_TYPE, $sym15$_CSETF_TACT_TYPE);
        Structures.def_csetf($sym16$TACT_HL_MODULE, $sym17$_CSETF_TACT_HL_MODULE);
        Structures.def_csetf($sym18$TACT_COMPLETENESS, $sym19$_CSETF_TACT_COMPLETENESS);
        Structures.def_csetf($sym20$TACT_PREFERENCE_LEVEL_JUSTIFICATION, $sym21$_CSETF_TACT_PREFERENCE_LEVEL_JUSTIFICATION);
        Structures.def_csetf($sym22$TACT_PRODUCTIVITY, $sym23$_CSETF_TACT_PRODUCTIVITY);
        Structures.def_csetf($sym24$TACT_ORIGINAL_PRODUCTIVITY, $sym25$_CSETF_TACT_ORIGINAL_PRODUCTIVITY);
        Structures.def_csetf($sym26$TACT_STATUS, $sym27$_CSETF_TACT_STATUS);
        Structures.def_csetf($sym28$TACT_PROGRESS_ITERATOR, $sym29$_CSETF_TACT_PROGRESS_ITERATOR);
        Structures.def_csetf($sym30$TACT_DATA, $sym31$_CSETF_TACT_DATA);
        Structures.def_csetf($sym32$TACT_PROPERTIES, $sym33$_CSETF_TACT_PROPERTIES);
        Equality.identity($sym0$TACTIC);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_tactic$.getGlobalValue(), Symbols.symbol_function($sym51$VISIT_DEFSTRUCT_OBJECT_TACTIC_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_tactic$.getGlobalValue(), Symbols.symbol_function($sym55$SXHASH_TACTIC_METHOD));
        utilities_macros.note_funcall_helper_function($sym91$TACTIC_PROGRESS_DONE_);
        utilities_macros.note_funcall_helper_function($sym92$TACTIC_PROGRESS_NEXT);
        utilities_macros.note_funcall_helper_function($sym93$TACTIC_PROGRESS_FINALIZE);
        return NIL;
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
        me = new inference_datastructures_tactic();
        $leviathan_avoid_logical_tactic_productivity_computationP$ = null;
        $dtp_tactic$ = null;
        $tactic_productivity_smoothing_method$ = null;
        $sym0$TACTIC = makeSymbol("TACTIC");
        $sym1$TACTIC_P = makeSymbol("TACTIC-P");
        $int$210 = makeInteger(210);
        $list3 = list(new SubLObject[] { makeSymbol("SUID"), makeSymbol("PROBLEM"), makeSymbol("TYPE"), makeSymbol("HL-MODULE"), makeSymbol("COMPLETENESS"), makeSymbol("PREFERENCE-LEVEL-JUSTIFICATION"), makeSymbol("PRODUCTIVITY"), makeSymbol("ORIGINAL-PRODUCTIVITY"), makeSymbol("STATUS"),
                makeSymbol("PROGRESS-ITERATOR"), makeSymbol("DATA"), makeSymbol("PROPERTIES") });
        $list4 = list(new SubLObject[] { makeKeyword("SUID"), makeKeyword("PROBLEM"), makeKeyword("TYPE"), makeKeyword("HL-MODULE"), makeKeyword("COMPLETENESS"), makeKeyword("PREFERENCE-LEVEL-JUSTIFICATION"), makeKeyword("PRODUCTIVITY"), makeKeyword("ORIGINAL-PRODUCTIVITY"), makeKeyword("STATUS"),
                makeKeyword("PROGRESS-ITERATOR"), makeKeyword("DATA"), makeKeyword("PROPERTIES") });
        $list5 = list(new SubLObject[] { makeSymbol("TACT-SUID"), makeSymbol("TACT-PROBLEM"), makeSymbol("TACT-TYPE"), makeSymbol("TACT-HL-MODULE"), makeSymbol("TACT-COMPLETENESS"), makeSymbol("TACT-PREFERENCE-LEVEL-JUSTIFICATION"), makeSymbol("TACT-PRODUCTIVITY"),
                makeSymbol("TACT-ORIGINAL-PRODUCTIVITY"), makeSymbol("TACT-STATUS"), makeSymbol("TACT-PROGRESS-ITERATOR"), makeSymbol("TACT-DATA"), makeSymbol("TACT-PROPERTIES") });
        $list6 = list(new SubLObject[] { makeSymbol("_CSETF-TACT-SUID"), makeSymbol("_CSETF-TACT-PROBLEM"), makeSymbol("_CSETF-TACT-TYPE"), makeSymbol("_CSETF-TACT-HL-MODULE"), makeSymbol("_CSETF-TACT-COMPLETENESS"), makeSymbol("_CSETF-TACT-PREFERENCE-LEVEL-JUSTIFICATION"),
                makeSymbol("_CSETF-TACT-PRODUCTIVITY"), makeSymbol("_CSETF-TACT-ORIGINAL-PRODUCTIVITY"), makeSymbol("_CSETF-TACT-STATUS"), makeSymbol("_CSETF-TACT-PROGRESS-ITERATOR"), makeSymbol("_CSETF-TACT-DATA"), makeSymbol("_CSETF-TACT-PROPERTIES") });
        $sym7$PRINT_TACTIC = makeSymbol("PRINT-TACTIC");
        $sym8$TACTIC_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TACTIC-PRINT-FUNCTION-TRAMPOLINE");
        $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TACTIC-P"));
        $sym10$TACT_SUID = makeSymbol("TACT-SUID");
        $sym11$_CSETF_TACT_SUID = makeSymbol("_CSETF-TACT-SUID");
        $sym12$TACT_PROBLEM = makeSymbol("TACT-PROBLEM");
        $sym13$_CSETF_TACT_PROBLEM = makeSymbol("_CSETF-TACT-PROBLEM");
        $sym14$TACT_TYPE = makeSymbol("TACT-TYPE");
        $sym15$_CSETF_TACT_TYPE = makeSymbol("_CSETF-TACT-TYPE");
        $sym16$TACT_HL_MODULE = makeSymbol("TACT-HL-MODULE");
        $sym17$_CSETF_TACT_HL_MODULE = makeSymbol("_CSETF-TACT-HL-MODULE");
        $sym18$TACT_COMPLETENESS = makeSymbol("TACT-COMPLETENESS");
        $sym19$_CSETF_TACT_COMPLETENESS = makeSymbol("_CSETF-TACT-COMPLETENESS");
        $sym20$TACT_PREFERENCE_LEVEL_JUSTIFICATION = makeSymbol("TACT-PREFERENCE-LEVEL-JUSTIFICATION");
        $sym21$_CSETF_TACT_PREFERENCE_LEVEL_JUSTIFICATION = makeSymbol("_CSETF-TACT-PREFERENCE-LEVEL-JUSTIFICATION");
        $sym22$TACT_PRODUCTIVITY = makeSymbol("TACT-PRODUCTIVITY");
        $sym23$_CSETF_TACT_PRODUCTIVITY = makeSymbol("_CSETF-TACT-PRODUCTIVITY");
        $sym24$TACT_ORIGINAL_PRODUCTIVITY = makeSymbol("TACT-ORIGINAL-PRODUCTIVITY");
        $sym25$_CSETF_TACT_ORIGINAL_PRODUCTIVITY = makeSymbol("_CSETF-TACT-ORIGINAL-PRODUCTIVITY");
        $sym26$TACT_STATUS = makeSymbol("TACT-STATUS");
        $sym27$_CSETF_TACT_STATUS = makeSymbol("_CSETF-TACT-STATUS");
        $sym28$TACT_PROGRESS_ITERATOR = makeSymbol("TACT-PROGRESS-ITERATOR");
        $sym29$_CSETF_TACT_PROGRESS_ITERATOR = makeSymbol("_CSETF-TACT-PROGRESS-ITERATOR");
        $sym30$TACT_DATA = makeSymbol("TACT-DATA");
        $sym31$_CSETF_TACT_DATA = makeSymbol("_CSETF-TACT-DATA");
        $sym32$TACT_PROPERTIES = makeSymbol("TACT-PROPERTIES");
        $sym33$_CSETF_TACT_PROPERTIES = makeSymbol("_CSETF-TACT-PROPERTIES");
        $SUID = makeKeyword("SUID");
        $PROBLEM = makeKeyword("PROBLEM");
        $TYPE = makeKeyword("TYPE");
        $HL_MODULE = makeKeyword("HL-MODULE");
        $COMPLETENESS = makeKeyword("COMPLETENESS");
        $PREFERENCE_LEVEL_JUSTIFICATION = makeKeyword("PREFERENCE-LEVEL-JUSTIFICATION");
        $PRODUCTIVITY = makeKeyword("PRODUCTIVITY");
        $ORIGINAL_PRODUCTIVITY = makeKeyword("ORIGINAL-PRODUCTIVITY");
        $STATUS = makeKeyword("STATUS");
        $PROGRESS_ITERATOR = makeKeyword("PROGRESS-ITERATOR");
        $DATA = makeKeyword("DATA");
        $PROPERTIES = makeKeyword("PROPERTIES");
        $str46$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
        $BEGIN = makeKeyword("BEGIN");
        $sym48$MAKE_TACTIC = makeSymbol("MAKE-TACTIC");
        $SLOT = makeKeyword("SLOT");
        $END = makeKeyword("END");
        $sym51$VISIT_DEFSTRUCT_OBJECT_TACTIC_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TACTIC-METHOD");
        $FREE = makeKeyword("FREE");
        $str53$_Invalid_TACTIC__s_ = makeString("<Invalid TACTIC ~s>");
        $str54$__a_TACTIC__a__a__a___a__a__ = makeString("<~a TACTIC ~a.~a.~a:(~a ~a)>");
        $sym55$SXHASH_TACTIC_METHOD = makeSymbol("SXHASH-TACTIC-METHOD");
        $sym56$PROBLEM_P = makeSymbol("PROBLEM-P");
        $sym57$HL_MODULE_P = makeSymbol("HL-MODULE-P");
        $POSSIBLE = makeKeyword("POSSIBLE");
        $RECURSIVE_INFERENCES = makeKeyword("RECURSIVE-INFERENCES");
        $str60$proofy_problem__a_is_possible_but = makeString("proofy problem ~a is possible but has no tactics");
        $sym61$PREFERENCE_LEVEL_P = makeSymbol("PREFERENCE-LEVEL-P");
        $str62$tactical_productivity_being_refer = makeString("tactical productivity being referenced on ~S");
        $sym63$COMPLETENESS_P = makeSymbol("COMPLETENESS-P");
        $str64$ = makeString("");
        $sym65$PRODUCTIVITY_P = makeSymbol("PRODUCTIVITY-P");
        $sym66$TACTIC_STATUS_P = makeSymbol("TACTIC-STATUS-P");
        $sym67$META_SPLIT_TACTIC_P = makeSymbol("META-SPLIT-TACTIC-P");
        $sym68$PROPERTY_LIST_P = makeSymbol("PROPERTY-LIST-P");
        $list69 = list(list(makeSymbol("STRATEGY-VAR"), makeSymbol("TACTIC")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym70$DO_PROBLEM_RELEVANT_STRATEGIES = makeSymbol("DO-PROBLEM-RELEVANT-STRATEGIES");
        $sym71$TACTIC_PROBLEM = makeSymbol("TACTIC-PROBLEM");
        $list72 = list(list(new SubLObject[] { makeSymbol("SIBLING-TACTIC-VAR"), makeSymbol("TACTIC"), makeSymbol("&KEY"), makeSymbol("DONE"), makeSymbol("STATUS"), makeSymbol("COMPLETENESS"), makeSymbol("PREFERENCE-LEVEL"), makeSymbol("HL-MODULE"), makeSymbol("TYPE"), makeSymbol("PRODUCTIVITY") }),
                makeSymbol("&BODY"), makeSymbol("BODY"));
        $list73 = list(makeKeyword("DONE"), makeKeyword("STATUS"), makeKeyword("COMPLETENESS"), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("HL-MODULE"), makeKeyword("TYPE"), makeKeyword("PRODUCTIVITY"));
        $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
        $DONE = makeKeyword("DONE");
        $PREFERENCE_LEVEL = makeKeyword("PREFERENCE-LEVEL");
        $sym77$TACTIC_VAR = makeUninternedSymbol("TACTIC-VAR");
        $sym78$CLET = makeSymbol("CLET");
        $sym79$DO_PROBLEM_TACTICS = makeSymbol("DO-PROBLEM-TACTICS");
        $sym80$PUNLESS = makeSymbol("PUNLESS");
        $EXECUTED = makeKeyword("EXECUTED");
        $DISCARDED = makeKeyword("DISCARDED");
        $NON_DISCARDED = makeKeyword("NON-DISCARDED");
        $IN_PROGRESS = makeKeyword("IN-PROGRESS");
        $EXECUTED_OR_IN_PROGRESS = makeKeyword("EXECUTED-OR-IN-PROGRESS");
        $sym86$TACTIC_POSSIBLE_ = makeSymbol("TACTIC-POSSIBLE?");
        $sym87$TACTIC_PROGRESS_ITERATOR_P = makeSymbol("TACTIC-PROGRESS-ITERATOR-P");
        $sym88$_ = makeSymbol("<");
        $sym89$TACTIC_PRODUCTIVITY = makeSymbol("TACTIC-PRODUCTIVITY");
        $SKIP = makeKeyword("SKIP");
        $sym91$TACTIC_PROGRESS_DONE_ = makeSymbol("TACTIC-PROGRESS-DONE?");
        $sym92$TACTIC_PROGRESS_NEXT = makeSymbol("TACTIC-PROGRESS-NEXT");
        $sym93$TACTIC_PROGRESS_FINALIZE = makeSymbol("TACTIC-PROGRESS-FINALIZE");
        $list94 = list(makeSymbol("CURRENT"), makeSymbol("ITERATION-TYPE"), makeSymbol("TACTIC"));
        $REMOVAL_EXPAND = makeKeyword("REMOVAL-EXPAND");
        $REMOVAL_OUTPUT_GENERATE = makeKeyword("REMOVAL-OUTPUT-GENERATE");
        $list97 = list(makeSymbol("OUTPUT-ITERATOR"), makeSymbol("BINDINGS"));
        $CONJUNCTIVE_REMOVAL_EXPAND = makeKeyword("CONJUNCTIVE-REMOVAL-EXPAND");
        $CONJUNCTIVE_REMOVAL_EXPAND_ITERATIVE = makeKeyword("CONJUNCTIVE-REMOVAL-EXPAND-ITERATIVE");
        $TRANSFORMATION_RULE_SELECT = makeKeyword("TRANSFORMATION-RULE-SELECT");
        $META_STRUCTURAL = makeKeyword("META-STRUCTURAL");
        $str102$Time_to_implement_tactic_progress = makeString("Time to implement tactic-progress-done? for ~S");
        $list103 = list(makeSymbol("OUTPUT-ITERATOR"), makeSymbol("ENCODED-BINDINGS"));
        $str104$Time_to_implement_tactic_progress = makeString("Time to implement tactic-progress-next for ~S");
        $str105$Time_to_implement_tactic_progress = makeString("Time to implement tactic-progress-finalize for ~S");
    }

    public static class $tactic_native extends SubLStructNative {
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
        private static SubLStructDeclNative structDecl;

        public $tactic_native() {
            this.$suid = CommonSymbols.NIL;
            this.$problem = CommonSymbols.NIL;
            this.$type = CommonSymbols.NIL;
            this.$hl_module = CommonSymbols.NIL;
            this.$completeness = CommonSymbols.NIL;
            this.$preference_level_justification = CommonSymbols.NIL;
            this.$productivity = CommonSymbols.NIL;
            this.$original_productivity = CommonSymbols.NIL;
            this.$status = CommonSymbols.NIL;
            this.$progress_iterator = CommonSymbols.NIL;
            this.$data = CommonSymbols.NIL;
            this.$properties = CommonSymbols.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return $tactic_native.structDecl;
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
        public SubLObject setField2(SubLObject value) {
            return this.$suid = value;
        }

        @Override
        public SubLObject setField3(SubLObject value) {
            return this.$problem = value;
        }

        @Override
        public SubLObject setField4(SubLObject value) {
            return this.$type = value;
        }

        @Override
        public SubLObject setField5(SubLObject value) {
            return this.$hl_module = value;
        }

        @Override
        public SubLObject setField6(SubLObject value) {
            return this.$completeness = value;
        }

        @Override
        public SubLObject setField7(SubLObject value) {
            return this.$preference_level_justification = value;
        }

        @Override
        public SubLObject setField8(SubLObject value) {
            return this.$productivity = value;
        }

        @Override
        public SubLObject setField9(SubLObject value) {
            return this.$original_productivity = value;
        }

        @Override
        public SubLObject setField10(SubLObject value) {
            return this.$status = value;
        }

        @Override
        public SubLObject setField11(SubLObject value) {
            return this.$progress_iterator = value;
        }

        @Override
        public SubLObject setField12(SubLObject value) {
            return this.$data = value;
        }

        @Override
        public SubLObject setField13(SubLObject value) {
            return this.$properties = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative($tactic_native.class, $sym0$TACTIC, $sym1$TACTIC_P, $list3, $list4,
                    new String[] { "$suid", "$problem", "$type", "$hl_module", "$completeness", "$preference_level_justification", "$productivity", "$original_productivity", "$status", "$progress_iterator", "$data", "$properties" }, $list5, $list6, $sym7$PRINT_TACTIC);
        }
    }

    public static class $tactic_p$UnaryFunction extends UnaryFunction {
        public $tactic_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TACTIC-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return tactic_p(arg1);
        }
    }

    public static class $sxhash_tactic_method$UnaryFunction extends UnaryFunction {
        public $sxhash_tactic_method$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SXHASH-TACTIC-METHOD"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return sxhash_tactic_method(arg1);
        }
    }

    public static class $tactic_possibleP$UnaryFunction extends UnaryFunction {
        public $tactic_possibleP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TACTIC-POSSIBLE?"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return tactic_possibleP(arg1);
        }
    }

    public static class $tactic_progress_doneP$UnaryFunction extends UnaryFunction {
        public $tactic_progress_doneP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TACTIC-PROGRESS-DONE?"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return tactic_progress_doneP(arg1);
        }
    }

    public static class $tactic_progress_next$UnaryFunction extends UnaryFunction {
        public $tactic_progress_next$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TACTIC-PROGRESS-NEXT"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return tactic_progress_next(arg1);
        }
    }

    public static class $tactic_progress_finalize$UnaryFunction extends UnaryFunction {
        public $tactic_progress_finalize$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TACTIC-PROGRESS-FINALIZE"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return tactic_progress_finalize(arg1);
        }
    }
}
/*
 *
 * Total time: 429 ms synthetic
 */