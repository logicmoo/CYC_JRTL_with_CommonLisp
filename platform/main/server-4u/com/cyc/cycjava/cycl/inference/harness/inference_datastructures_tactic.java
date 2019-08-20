/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.id_index.do_id_index_empty_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_id_and_object_validP;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_state;
import static com.cyc.cycjava.cycl.id_index.do_id_index_state_object;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.abductive_hl_moduleP;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_name;
import static com.cyc.cycjava.cycl.inference.harness.inference_worker_split.execute_meta_split_tactic;
import static com.cyc.cycjava.cycl.inference.harness.inference_worker_split.meta_structural_progress_iterator_doneP;
import static com.cyc.cycjava.cycl.list_utilities.extremal;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.logxor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.round;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      INFERENCE-DATASTRUCTURES-TACTIC
 * source file: /cyc/top/cycl/inference/harness/inference-datastructures-tactic.lisp
 * created:     2019/07/03 17:37:38
 */
public final class inference_datastructures_tactic extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt53$ = makeString("");

    public static final SubLFile me = new inference_datastructures_tactic();



    // defvar
    // Definitions
    /**
     * When non-nil, we don't bother to compute the tactic productivity for logical
     * tactics.
     */
    @LispMethod(comment = "When non-nil, we don\'t bother to compute the tactic productivity for logical\r\ntactics.\ndefvar\nWhen non-nil, we don\'t bother to compute the tactic productivity for logical\ntactics.")
    public static final SubLSymbol $leviathan_avoid_logical_tactic_productivity_computationP$ = makeSymbol("*LEVIATHAN-AVOID-LOGICAL-TACTIC-PRODUCTIVITY-COMPUTATION?*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_tactic$ = makeSymbol("*DTP-TACTIC*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $tactic_productivity_smoothing_method$ = makeSymbol("*TACTIC-PRODUCTIVITY-SMOOTHING-METHOD*");

    private static final SubLInteger $int$210 = makeInteger(210);

    static private final SubLList $list3 = list(new SubLObject[]{ makeSymbol("SUID"), makeSymbol("PROBLEM"), makeSymbol("TYPE"), makeSymbol("HL-MODULE"), makeSymbol("COMPLETENESS"), makeSymbol("PREFERENCE-LEVEL-JUSTIFICATION"), makeSymbol("PRODUCTIVITY"), makeSymbol("ORIGINAL-PRODUCTIVITY"), makeSymbol("STATUS"), makeSymbol("PROGRESS-ITERATOR"), makeSymbol("DATA"), makeSymbol("PROPERTIES") });

    static private final SubLList $list4 = list(new SubLObject[]{ $SUID, makeKeyword("PROBLEM"), $TYPE, makeKeyword("HL-MODULE"), makeKeyword("COMPLETENESS"), makeKeyword("PREFERENCE-LEVEL-JUSTIFICATION"), makeKeyword("PRODUCTIVITY"), makeKeyword("ORIGINAL-PRODUCTIVITY"), makeKeyword("STATUS"), makeKeyword("PROGRESS-ITERATOR"), $DATA, makeKeyword("PROPERTIES") });

    static private final SubLList $list5 = list(new SubLObject[]{ makeSymbol("TACT-SUID"), makeSymbol("TACT-PROBLEM"), makeSymbol("TACT-TYPE"), makeSymbol("TACT-HL-MODULE"), makeSymbol("TACT-COMPLETENESS"), makeSymbol("TACT-PREFERENCE-LEVEL-JUSTIFICATION"), makeSymbol("TACT-PRODUCTIVITY"), makeSymbol("TACT-ORIGINAL-PRODUCTIVITY"), makeSymbol("TACT-STATUS"), makeSymbol("TACT-PROGRESS-ITERATOR"), makeSymbol("TACT-DATA"), makeSymbol("TACT-PROPERTIES") });

    static private final SubLList $list6 = list(new SubLObject[]{ makeSymbol("_CSETF-TACT-SUID"), makeSymbol("_CSETF-TACT-PROBLEM"), makeSymbol("_CSETF-TACT-TYPE"), makeSymbol("_CSETF-TACT-HL-MODULE"), makeSymbol("_CSETF-TACT-COMPLETENESS"), makeSymbol("_CSETF-TACT-PREFERENCE-LEVEL-JUSTIFICATION"), makeSymbol("_CSETF-TACT-PRODUCTIVITY"), makeSymbol("_CSETF-TACT-ORIGINAL-PRODUCTIVITY"), makeSymbol("_CSETF-TACT-STATUS"), makeSymbol("_CSETF-TACT-PROGRESS-ITERATOR"), makeSymbol("_CSETF-TACT-DATA"), makeSymbol("_CSETF-TACT-PROPERTIES") });

    private static final SubLSymbol PRINT_TACTIC = makeSymbol("PRINT-TACTIC");

    private static final SubLSymbol TACTIC_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TACTIC-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TACTIC-P"));

    private static final SubLSymbol TACT_SUID = makeSymbol("TACT-SUID");

    private static final SubLSymbol _CSETF_TACT_SUID = makeSymbol("_CSETF-TACT-SUID");

    private static final SubLSymbol TACT_PROBLEM = makeSymbol("TACT-PROBLEM");

    private static final SubLSymbol _CSETF_TACT_PROBLEM = makeSymbol("_CSETF-TACT-PROBLEM");

    private static final SubLSymbol TACT_TYPE = makeSymbol("TACT-TYPE");

    private static final SubLSymbol _CSETF_TACT_TYPE = makeSymbol("_CSETF-TACT-TYPE");

    private static final SubLSymbol TACT_HL_MODULE = makeSymbol("TACT-HL-MODULE");

    private static final SubLSymbol _CSETF_TACT_HL_MODULE = makeSymbol("_CSETF-TACT-HL-MODULE");

    private static final SubLSymbol TACT_COMPLETENESS = makeSymbol("TACT-COMPLETENESS");

    private static final SubLSymbol _CSETF_TACT_COMPLETENESS = makeSymbol("_CSETF-TACT-COMPLETENESS");

    private static final SubLSymbol TACT_PREFERENCE_LEVEL_JUSTIFICATION = makeSymbol("TACT-PREFERENCE-LEVEL-JUSTIFICATION");

    private static final SubLSymbol _CSETF_TACT_PREFERENCE_LEVEL_JUSTIFICATION = makeSymbol("_CSETF-TACT-PREFERENCE-LEVEL-JUSTIFICATION");

    private static final SubLSymbol TACT_PRODUCTIVITY = makeSymbol("TACT-PRODUCTIVITY");

    private static final SubLSymbol _CSETF_TACT_PRODUCTIVITY = makeSymbol("_CSETF-TACT-PRODUCTIVITY");

    private static final SubLSymbol TACT_ORIGINAL_PRODUCTIVITY = makeSymbol("TACT-ORIGINAL-PRODUCTIVITY");

    private static final SubLSymbol _CSETF_TACT_ORIGINAL_PRODUCTIVITY = makeSymbol("_CSETF-TACT-ORIGINAL-PRODUCTIVITY");

    private static final SubLSymbol TACT_STATUS = makeSymbol("TACT-STATUS");

    private static final SubLSymbol _CSETF_TACT_STATUS = makeSymbol("_CSETF-TACT-STATUS");

    private static final SubLSymbol TACT_PROGRESS_ITERATOR = makeSymbol("TACT-PROGRESS-ITERATOR");

    private static final SubLSymbol _CSETF_TACT_PROGRESS_ITERATOR = makeSymbol("_CSETF-TACT-PROGRESS-ITERATOR");

    private static final SubLSymbol TACT_DATA = makeSymbol("TACT-DATA");

    private static final SubLSymbol _CSETF_TACT_DATA = makeSymbol("_CSETF-TACT-DATA");

    private static final SubLSymbol TACT_PROPERTIES = makeSymbol("TACT-PROPERTIES");

    private static final SubLSymbol _CSETF_TACT_PROPERTIES = makeSymbol("_CSETF-TACT-PROPERTIES");

    private static final SubLSymbol $PREFERENCE_LEVEL_JUSTIFICATION = makeKeyword("PREFERENCE-LEVEL-JUSTIFICATION");

    private static final SubLString $str46$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_TACTIC = makeSymbol("MAKE-TACTIC");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TACTIC_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TACTIC-METHOD");

    private static final SubLString $str53$_Invalid_TACTIC__s_ = makeString("<Invalid TACTIC ~s>");

    private static final SubLString $str54$__a_TACTIC__a__a__a___a__a__ = makeString("<~a TACTIC ~a.~a.~a:(~a ~a)>");

    private static final SubLSymbol SXHASH_TACTIC_METHOD = makeSymbol("SXHASH-TACTIC-METHOD");

    private static final SubLString $str60$proofy_problem__a_is_possible_but = makeString("proofy problem ~a is possible but has no tactics");

    private static final SubLSymbol PREFERENCE_LEVEL_P = makeSymbol("PREFERENCE-LEVEL-P");

    private static final SubLString $str62$tactical_productivity_being_refer = makeString("tactical productivity being referenced on ~S");

    private static final SubLSymbol COMPLETENESS_P = makeSymbol("COMPLETENESS-P");

    private static final SubLString $str64$ = makeString("");

    private static final SubLSymbol PRODUCTIVITY_P = makeSymbol("PRODUCTIVITY-P");

    private static final SubLSymbol TACTIC_STATUS_P = makeSymbol("TACTIC-STATUS-P");

    private static final SubLSymbol META_SPLIT_TACTIC_P = makeSymbol("META-SPLIT-TACTIC-P");

    private static final SubLList $list69 = list(list(makeSymbol("STRATEGY-VAR"), makeSymbol("TACTIC")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DO_PROBLEM_RELEVANT_STRATEGIES = makeSymbol("DO-PROBLEM-RELEVANT-STRATEGIES");

    private static final SubLSymbol TACTIC_PROBLEM = makeSymbol("TACTIC-PROBLEM");

    private static final SubLList $list72 = list(list(new SubLObject[]{ makeSymbol("SIBLING-TACTIC-VAR"), makeSymbol("TACTIC"), makeSymbol("&KEY"), makeSymbol("DONE"), makeSymbol("STATUS"), makeSymbol("COMPLETENESS"), makeSymbol("PREFERENCE-LEVEL"), makeSymbol("HL-MODULE"), makeSymbol("TYPE"), makeSymbol("PRODUCTIVITY") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list73 = list($DONE, makeKeyword("STATUS"), makeKeyword("COMPLETENESS"), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("HL-MODULE"), $TYPE, makeKeyword("PRODUCTIVITY"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $sym77$TACTIC_VAR = makeUninternedSymbol("TACTIC-VAR");

    private static final SubLSymbol DO_PROBLEM_TACTICS = makeSymbol("DO-PROBLEM-TACTICS");

    private static final SubLSymbol $EXECUTED_OR_IN_PROGRESS = makeKeyword("EXECUTED-OR-IN-PROGRESS");

    private static final SubLSymbol $sym86$TACTIC_POSSIBLE_ = makeSymbol("TACTIC-POSSIBLE?");

    private static final SubLSymbol TACTIC_PROGRESS_ITERATOR_P = makeSymbol("TACTIC-PROGRESS-ITERATOR-P");

    private static final SubLSymbol $sym88$_ = makeSymbol("<");

    private static final SubLSymbol TACTIC_PRODUCTIVITY = makeSymbol("TACTIC-PRODUCTIVITY");

    private static final SubLSymbol $sym91$TACTIC_PROGRESS_DONE_ = makeSymbol("TACTIC-PROGRESS-DONE?");

    private static final SubLSymbol TACTIC_PROGRESS_NEXT = makeSymbol("TACTIC-PROGRESS-NEXT");

    private static final SubLSymbol TACTIC_PROGRESS_FINALIZE = makeSymbol("TACTIC-PROGRESS-FINALIZE");

    private static final SubLList $list94 = list(makeSymbol("CURRENT"), makeSymbol("ITERATION-TYPE"), makeSymbol("TACTIC"));

    private static final SubLSymbol $REMOVAL_OUTPUT_GENERATE = makeKeyword("REMOVAL-OUTPUT-GENERATE");

    private static final SubLList $list97 = list(makeSymbol("OUTPUT-ITERATOR"), makeSymbol("BINDINGS"));

    private static final SubLSymbol $CONJUNCTIVE_REMOVAL_EXPAND = makeKeyword("CONJUNCTIVE-REMOVAL-EXPAND");

    private static final SubLSymbol $CONJUNCTIVE_REMOVAL_EXPAND_ITERATIVE = makeKeyword("CONJUNCTIVE-REMOVAL-EXPAND-ITERATIVE");

    private static final SubLSymbol $TRANSFORMATION_RULE_SELECT = makeKeyword("TRANSFORMATION-RULE-SELECT");

    private static final SubLString $str102$Time_to_implement_tactic_progress = makeString("Time to implement tactic-progress-done? for ~S");

    private static final SubLList $list103 = list(makeSymbol("OUTPUT-ITERATOR"), makeSymbol("ENCODED-BINDINGS"));

    private static final SubLString $str104$Time_to_implement_tactic_progress = makeString("Time to implement tactic-progress-next for ~S");

    private static final SubLString $str105$Time_to_implement_tactic_progress = makeString("Time to implement tactic-progress-finalize for ~S");

    public static final SubLObject tactic_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.print_tactic(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject tactic_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        inference_datastructures_tactic.print_tactic(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject tactic_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.$tactic_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject tactic_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.$tactic_native.class ? T : NIL;
    }

    public static final SubLObject tact_suid_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TACTIC_P);
        return (($tactic_native)v_object).$suid;
    }

    public static SubLObject tact_suid(final SubLObject v_object) {
        assert NIL != inference_datastructures_tactic.tactic_p(v_object) : "! inference_datastructures_tactic.tactic_p(v_object) " + "inference_datastructures_tactic.tactic_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject tact_problem_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TACTIC_P);
        return (($tactic_native)v_object).$problem;
    }

    public static SubLObject tact_problem(final SubLObject v_object) {
        assert NIL != inference_datastructures_tactic.tactic_p(v_object) : "! inference_datastructures_tactic.tactic_p(v_object) " + "inference_datastructures_tactic.tactic_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject tact_type_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TACTIC_P);
        return (($tactic_native)v_object).$type;
    }

    public static SubLObject tact_type(final SubLObject v_object) {
        assert NIL != inference_datastructures_tactic.tactic_p(v_object) : "! inference_datastructures_tactic.tactic_p(v_object) " + "inference_datastructures_tactic.tactic_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject tact_hl_module_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TACTIC_P);
        return (($tactic_native)v_object).$hl_module;
    }

    public static SubLObject tact_hl_module(final SubLObject v_object) {
        assert NIL != inference_datastructures_tactic.tactic_p(v_object) : "! inference_datastructures_tactic.tactic_p(v_object) " + "inference_datastructures_tactic.tactic_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject tact_completeness_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TACTIC_P);
        return (($tactic_native)v_object).$completeness;
    }

    public static SubLObject tact_completeness(final SubLObject v_object) {
        assert NIL != inference_datastructures_tactic.tactic_p(v_object) : "! inference_datastructures_tactic.tactic_p(v_object) " + "inference_datastructures_tactic.tactic_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject tact_preference_level_justification_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TACTIC_P);
        return (($tactic_native)v_object).$preference_level_justification;
    }

    public static SubLObject tact_preference_level_justification(final SubLObject v_object) {
        assert NIL != inference_datastructures_tactic.tactic_p(v_object) : "! inference_datastructures_tactic.tactic_p(v_object) " + "inference_datastructures_tactic.tactic_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject tact_productivity_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TACTIC_P);
        return (($tactic_native)v_object).$productivity;
    }

    public static SubLObject tact_productivity(final SubLObject v_object) {
        assert NIL != inference_datastructures_tactic.tactic_p(v_object) : "! inference_datastructures_tactic.tactic_p(v_object) " + "inference_datastructures_tactic.tactic_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject tact_original_productivity_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TACTIC_P);
        return (($tactic_native)v_object).$productivity;
    }

    public static SubLObject tact_original_productivity(final SubLObject v_object) {
        assert NIL != inference_datastructures_tactic.tactic_p(v_object) : "! inference_datastructures_tactic.tactic_p(v_object) " + "inference_datastructures_tactic.tactic_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject tact_status_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TACTIC_P);
        return (($tactic_native)v_object).$status;
    }

    public static SubLObject tact_status(final SubLObject v_object) {
        assert NIL != inference_datastructures_tactic.tactic_p(v_object) : "! inference_datastructures_tactic.tactic_p(v_object) " + "inference_datastructures_tactic.tactic_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject tact_progress_iterator_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TACTIC_P);
        return (($tactic_native)v_object).$progress_iterator;
    }

    public static SubLObject tact_progress_iterator(final SubLObject v_object) {
        assert NIL != inference_datastructures_tactic.tactic_p(v_object) : "! inference_datastructures_tactic.tactic_p(v_object) " + "inference_datastructures_tactic.tactic_p error :" + v_object;
        return v_object.getField11();
    }

    public static final SubLObject tact_data_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TACTIC_P);
        return (($tactic_native)v_object).$data;
    }

    public static SubLObject tact_data(final SubLObject v_object) {
        assert NIL != inference_datastructures_tactic.tactic_p(v_object) : "! inference_datastructures_tactic.tactic_p(v_object) " + "inference_datastructures_tactic.tactic_p error :" + v_object;
        return v_object.getField12();
    }

    public static SubLObject tact_properties(final SubLObject v_object) {
        assert NIL != inference_datastructures_tactic.tactic_p(v_object) : "! inference_datastructures_tactic.tactic_p(v_object) " + "inference_datastructures_tactic.tactic_p error :" + v_object;
        return v_object.getField13();
    }

    public static final SubLObject _csetf_tact_suid_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TACTIC_P);
        return (($tactic_native)v_object).$suid = (value);
    }

    public static SubLObject _csetf_tact_suid(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_datastructures_tactic.tactic_p(v_object) : "! inference_datastructures_tactic.tactic_p(v_object) " + "inference_datastructures_tactic.tactic_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_tact_problem_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TACTIC_P);
        return (($tactic_native)v_object).$problem = (value);
    }

    public static SubLObject _csetf_tact_problem(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_datastructures_tactic.tactic_p(v_object) : "! inference_datastructures_tactic.tactic_p(v_object) " + "inference_datastructures_tactic.tactic_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_tact_type_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TACTIC_P);
        return (($tactic_native)v_object).$type = (value);
    }

    public static SubLObject _csetf_tact_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_datastructures_tactic.tactic_p(v_object) : "! inference_datastructures_tactic.tactic_p(v_object) " + "inference_datastructures_tactic.tactic_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_tact_hl_module_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TACTIC_P);
        return (($tactic_native)v_object).$hl_module = (value);
    }

    public static SubLObject _csetf_tact_hl_module(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_datastructures_tactic.tactic_p(v_object) : "! inference_datastructures_tactic.tactic_p(v_object) " + "inference_datastructures_tactic.tactic_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_tact_completeness_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TACTIC_P);
        return (($tactic_native)v_object).$completeness = (value);
    }

    public static SubLObject _csetf_tact_completeness(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_datastructures_tactic.tactic_p(v_object) : "! inference_datastructures_tactic.tactic_p(v_object) " + "inference_datastructures_tactic.tactic_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_tact_preference_level_justification_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TACTIC_P);
        return (($tactic_native)v_object).$preference_level_justification = (value);
    }

    public static SubLObject _csetf_tact_preference_level_justification(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_datastructures_tactic.tactic_p(v_object) : "! inference_datastructures_tactic.tactic_p(v_object) " + "inference_datastructures_tactic.tactic_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_tact_productivity_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TACTIC_P);
        return (($tactic_native)v_object).$productivity = (value);
    }

    public static SubLObject _csetf_tact_productivity(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_datastructures_tactic.tactic_p(v_object) : "! inference_datastructures_tactic.tactic_p(v_object) " + "inference_datastructures_tactic.tactic_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_tact_original_productivity_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TACTIC_P);
        return (($tactic_native)v_object).$productivity = (value);
    }

    public static SubLObject _csetf_tact_original_productivity(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_datastructures_tactic.tactic_p(v_object) : "! inference_datastructures_tactic.tactic_p(v_object) " + "inference_datastructures_tactic.tactic_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_tact_status_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TACTIC_P);
        return (($tactic_native)v_object).$status = (value);
    }

    public static SubLObject _csetf_tact_status(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_datastructures_tactic.tactic_p(v_object) : "! inference_datastructures_tactic.tactic_p(v_object) " + "inference_datastructures_tactic.tactic_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_tact_progress_iterator_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TACTIC_P);
        return (($tactic_native)v_object).$progress_iterator = (value);
    }

    public static SubLObject _csetf_tact_progress_iterator(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_datastructures_tactic.tactic_p(v_object) : "! inference_datastructures_tactic.tactic_p(v_object) " + "inference_datastructures_tactic.tactic_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_tact_data_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TACTIC_P);
        return (($tactic_native)v_object).$data = (value);
    }

    public static SubLObject _csetf_tact_data(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_datastructures_tactic.tactic_p(v_object) : "! inference_datastructures_tactic.tactic_p(v_object) " + "inference_datastructures_tactic.tactic_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_tact_properties(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_datastructures_tactic.tactic_p(v_object) : "! inference_datastructures_tactic.tactic_p(v_object) " + "inference_datastructures_tactic.tactic_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static final SubLObject make_tactic_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.$tactic_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($SUID)) {
                        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_suid(v_new, current_value);
                    } else {
                        if (pcase_var.eql($PROBLEM)) {
                            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_problem(v_new, current_value);
                        } else {
                            if (pcase_var.eql($TYPE)) {
                                com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_type(v_new, current_value);
                            } else {
                                if (pcase_var.eql($HL_MODULE)) {
                                    com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_hl_module(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($COMPLETENESS)) {
                                        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_completeness(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($PREFERENCE_LEVEL_JUSTIFICATION)) {
                                            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_preference_level_justification(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($PRODUCTIVITY)) {
                                                com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_productivity(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($ORIGINAL_PRODUCTIVITY)) {
                                                    com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_original_productivity(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($STATUS)) {
                                                        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_status(v_new, current_value);
                                                    } else {
                                                        if (pcase_var.eql($PROGRESS_ITERATOR)) {
                                                            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_progress_iterator(v_new, current_value);
                                                        } else {
                                                            if (pcase_var.eql($DATA)) {
                                                                com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_data(v_new, current_value);
                                                            } else {
                                                                Errors.error($str_alt42$Invalid_slot__S_for_construction_, current_arg);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_tactic(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.$tactic_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SUID)) {
                inference_datastructures_tactic._csetf_tact_suid(v_new, current_value);
            } else
                if (pcase_var.eql($PROBLEM)) {
                    inference_datastructures_tactic._csetf_tact_problem(v_new, current_value);
                } else
                    if (pcase_var.eql($TYPE)) {
                        inference_datastructures_tactic._csetf_tact_type(v_new, current_value);
                    } else
                        if (pcase_var.eql($HL_MODULE)) {
                            inference_datastructures_tactic._csetf_tact_hl_module(v_new, current_value);
                        } else
                            if (pcase_var.eql($COMPLETENESS)) {
                                inference_datastructures_tactic._csetf_tact_completeness(v_new, current_value);
                            } else
                                if (pcase_var.eql(inference_datastructures_tactic.$PREFERENCE_LEVEL_JUSTIFICATION)) {
                                    inference_datastructures_tactic._csetf_tact_preference_level_justification(v_new, current_value);
                                } else
                                    if (pcase_var.eql($PRODUCTIVITY)) {
                                        inference_datastructures_tactic._csetf_tact_productivity(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($ORIGINAL_PRODUCTIVITY)) {
                                            inference_datastructures_tactic._csetf_tact_original_productivity(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($STATUS)) {
                                                inference_datastructures_tactic._csetf_tact_status(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($PROGRESS_ITERATOR)) {
                                                    inference_datastructures_tactic._csetf_tact_progress_iterator(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($DATA)) {
                                                        inference_datastructures_tactic._csetf_tact_data(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($PROPERTIES)) {
                                                            inference_datastructures_tactic._csetf_tact_properties(v_new, current_value);
                                                        } else {
                                                            Errors.error(inference_datastructures_tactic.$str46$Invalid_slot__S_for_construction_, current_arg);
                                                        }











        }
        return v_new;
    }

    public static SubLObject visit_defstruct_tactic(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, inference_datastructures_tactic.MAKE_TACTIC, TWELVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SUID, inference_datastructures_tactic.tact_suid(obj));
        funcall(visitor_fn, obj, $SLOT, $PROBLEM, inference_datastructures_tactic.tact_problem(obj));
        funcall(visitor_fn, obj, $SLOT, $TYPE, inference_datastructures_tactic.tact_type(obj));
        funcall(visitor_fn, obj, $SLOT, $HL_MODULE, inference_datastructures_tactic.tact_hl_module(obj));
        funcall(visitor_fn, obj, $SLOT, $COMPLETENESS, inference_datastructures_tactic.tact_completeness(obj));
        funcall(visitor_fn, obj, $SLOT, inference_datastructures_tactic.$PREFERENCE_LEVEL_JUSTIFICATION, inference_datastructures_tactic.tact_preference_level_justification(obj));
        funcall(visitor_fn, obj, $SLOT, $PRODUCTIVITY, inference_datastructures_tactic.tact_productivity(obj));
        funcall(visitor_fn, obj, $SLOT, $ORIGINAL_PRODUCTIVITY, inference_datastructures_tactic.tact_original_productivity(obj));
        funcall(visitor_fn, obj, $SLOT, $STATUS, inference_datastructures_tactic.tact_status(obj));
        funcall(visitor_fn, obj, $SLOT, $PROGRESS_ITERATOR, inference_datastructures_tactic.tact_progress_iterator(obj));
        funcall(visitor_fn, obj, $SLOT, $DATA, inference_datastructures_tactic.tact_data(obj));
        funcall(visitor_fn, obj, $SLOT, $PROPERTIES, inference_datastructures_tactic.tact_properties(obj));
        funcall(visitor_fn, obj, $END, inference_datastructures_tactic.MAKE_TACTIC, TWELVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_tactic_method(final SubLObject obj, final SubLObject visitor_fn) {
        return inference_datastructures_tactic.visit_defstruct_tactic(obj, visitor_fn);
    }

    public static final SubLObject valid_tactic_p_alt(SubLObject tactic) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_p(tactic)) && (NIL == com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_invalid_p(tactic)));
    }

    public static SubLObject valid_tactic_p(final SubLObject tactic) {
        return makeBoolean((NIL != inference_datastructures_tactic.tactic_p(tactic)) && (NIL == inference_datastructures_tactic.tactic_invalid_p(tactic)));
    }

    public static final SubLObject invalid_tactic_p_alt(SubLObject tactic) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_p(tactic)) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_invalid_p(tactic)));
    }

    public static SubLObject invalid_tactic_p(final SubLObject tactic) {
        return makeBoolean((NIL != inference_datastructures_tactic.tactic_p(tactic)) && (NIL != inference_datastructures_tactic.tactic_invalid_p(tactic)));
    }

    public static final SubLObject tactic_invalid_p_alt(SubLObject tactic) {
        return eq($FREE, com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_status(tactic));
    }

    public static SubLObject tactic_invalid_p(final SubLObject tactic) {
        return eq($FREE, inference_datastructures_tactic.tactic_status(tactic));
    }

    public static final SubLObject print_tactic_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_invalid_p(v_object)) {
                format(stream, $str_alt44$_Invalid_TACTIC__s_, com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_suid(v_object));
            } else {
                {
                    SubLObject problem = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_problem(v_object);
                    format(stream, $str_alt45$__a_TACTIC__a__a__a___a__a__, new SubLObject[]{ com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_hl_module_name(v_object), inference_datastructures_problem_store.problem_store_suid(inference_datastructures_problem.problem_store(problem)), inference_datastructures_problem.problem_suid(problem), com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_suid(v_object), (NIL != $leviathan_avoid_logical_tactic_productivity_computationP$.getDynamicValue(thread)) && (NIL != inference_worker.logical_tactic_p(v_object)) ? ((SubLObject) (NIL)) : com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_productivity(v_object), com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tact_completeness(v_object) });
                }
            }
            return NIL;
        }
    }

    public static SubLObject print_tactic(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != inference_datastructures_tactic.tactic_invalid_p(v_object)) {
            format(stream, inference_datastructures_tactic.$str53$_Invalid_TACTIC__s_, inference_datastructures_tactic.tactic_suid(v_object));
        } else {
            final SubLObject problem = inference_datastructures_tactic.tactic_problem(v_object);
            format(stream, inference_datastructures_tactic.$str54$__a_TACTIC__a__a__a___a__a__, new SubLObject[]{ inference_datastructures_tactic.tactic_hl_module_name(v_object), inference_datastructures_problem_store.problem_store_suid(inference_datastructures_problem.problem_store(problem)), inference_datastructures_problem.problem_suid(problem), inference_datastructures_tactic.tactic_suid(v_object), (NIL != inference_datastructures_tactic.$leviathan_avoid_logical_tactic_productivity_computationP$.getDynamicValue(thread)) && (NIL != inference_worker.logical_tactic_p(v_object)) ? NIL : inference_datastructures_tactic.tactic_productivity(v_object), inference_datastructures_tactic.tact_completeness(v_object) });
        }
        return NIL;
    }

    public static final SubLObject sxhash_tactic_method_alt(SubLObject v_object) {
        {
            SubLObject problem = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_problem(v_object);
            if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
                return logxor(inference_datastructures_problem.problem_suid(problem), com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_suid(v_object));
            }
        }
        return ZERO_INTEGER;
    }

    public static SubLObject sxhash_tactic_method(final SubLObject v_object) {
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(v_object);
        if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
            return logxor(inference_datastructures_problem.problem_suid(problem), inference_datastructures_tactic.tactic_suid(v_object));
        }
        return ZERO_INTEGER;
    }

    public static final SubLObject new_tactic_alt(SubLObject problem, SubLObject hl_module, SubLObject data) {
        if (data == UNPROVIDED) {
            data = NIL;
        }
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        SubLTrampolineFile.checkType(hl_module, HL_MODULE_P);
        {
            SubLObject tactic = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.make_tactic(UNPROVIDED);
            SubLObject suid = inference_datastructures_problem.problem_next_tactic_suid(problem);
            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_suid(tactic, suid);
            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_problem(tactic, problem);
            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_type(tactic, inference_datastructures_enumerated_types.tactic_type_from_hl_module(hl_module));
            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_hl_module(tactic, hl_module);
            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.set_tactic_status(tactic, $POSSIBLE);
            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_progress_iterator(tactic, NIL);
            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.set_tactic_data(tactic, data);
            inference_datastructures_problem.add_problem_tactic(problem, tactic);
            inference_metrics.increment_tactic_historical_count();
            inference_datastructures_problem_store.problem_store_increment_historical_tactic_count(inference_datastructures_problem.problem_store(problem));
            return tactic;
        }
    }

    public static SubLObject new_tactic(final SubLObject problem, final SubLObject hl_module, SubLObject data) {
        if (data == UNPROVIDED) {
            data = NIL;
        }
        assert NIL != inference_datastructures_problem.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) " + ("inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ") + problem;
        assert NIL != inference_modules.hl_module_p(hl_module) : "! inference_modules.hl_module_p(hl_module) " + ("inference_modules.hl_module_p(hl_module) " + "CommonSymbols.NIL != inference_modules.hl_module_p(hl_module) ") + hl_module;
        final SubLObject tactic = inference_datastructures_tactic.make_tactic(UNPROVIDED);
        final SubLObject suid = inference_datastructures_problem.problem_next_tactic_suid(problem);
        inference_datastructures_tactic._csetf_tact_suid(tactic, suid);
        inference_datastructures_tactic._csetf_tact_problem(tactic, problem);
        inference_datastructures_tactic._csetf_tact_type(tactic, inference_datastructures_enumerated_types.tactic_type_from_hl_module(hl_module));
        inference_datastructures_tactic._csetf_tact_hl_module(tactic, hl_module);
        inference_datastructures_tactic.set_tactic_status(tactic, $POSSIBLE);
        inference_datastructures_tactic._csetf_tact_progress_iterator(tactic, NIL);
        inference_datastructures_tactic.set_tactic_data(tactic, data);
        inference_datastructures_problem.add_problem_tactic(problem, tactic);
        inference_metrics.increment_tactic_historical_count();
        inference_datastructures_problem_store.problem_store_increment_historical_tactic_count(inference_datastructures_problem.problem_store(problem));
        return tactic;
    }

    public static final SubLObject destroy_problem_tactic_alt(SubLObject tactic) {
        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.valid_tactic_p(tactic)) {
            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.destroy_tactic_progress_iterator(tactic);
            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.note_tactic_invalid(tactic);
            return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.destroy_tactic_int(tactic);
        }
        return NIL;
    }

    public static SubLObject destroy_problem_tactic(final SubLObject tactic) {
        if (NIL != inference_datastructures_tactic.valid_tactic_p(tactic)) {
            SubLObject cdolist_list_var;
            final SubLObject recursive_inferences = cdolist_list_var = getf(inference_datastructures_tactic.tactic_properties(tactic), $RECURSIVE_INFERENCES, UNPROVIDED);
            SubLObject recursive_inference = NIL;
            recursive_inference = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (inference_datastructures_tactic.tactic_store(tactic).eql(inference_datastructures_inference.inference_problem_store(recursive_inference))) {
                    inference_datastructures_inference.destroy_inference(recursive_inference);
                }
                cdolist_list_var = cdolist_list_var.rest();
                recursive_inference = cdolist_list_var.first();
            } 
            inference_datastructures_tactic.destroy_tactic_progress_iterator(tactic);
            inference_datastructures_tactic.note_tactic_invalid(tactic);
            final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
            inference_datastructures_tactic.destroy_tactic_int(tactic);
            if ((NIL != inference_datastructures_problem.tactically_possible_problem_p(problem)) && inference_datastructures_problem.problem_tactic_count(problem).isZero()) {
                if (NIL != inference_datastructures_problem.problem_has_some_proven_proofP(problem)) {
                    Errors.warn(inference_datastructures_tactic.$str60$proofy_problem__a_is_possible_but, problem);
                } else {
                    inference_datastructures_problem.destroy_problem(problem);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject destroy_problem_tactic_and_backpointers_alt(SubLObject tactic) {
        {
            SubLObject problem = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_problem(tactic);
            if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
                inference_datastructures_problem.remove_problem_tactic(problem, tactic);
            }
        }
        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.destroy_problem_tactic(tactic);
        return NIL;
    }

    public static SubLObject destroy_problem_tactic_and_backpointers(final SubLObject tactic) {
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
            inference_datastructures_problem.remove_problem_tactic(problem, tactic);
        }
        inference_datastructures_tactic.destroy_problem_tactic(tactic);
        return NIL;
    }

    public static final SubLObject destroy_tactic_progress_iterator_alt(SubLObject tactic) {
        {
            SubLObject progress_iterator = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_progress_iterator(tactic);
            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_progress_iterator_p(progress_iterator)) {
                com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.finalize_tactic_progress_iterator(progress_iterator);
                com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_progress_iterator(tactic, NIL);
            }
        }
        return tactic;
    }

    public static SubLObject destroy_tactic_progress_iterator(final SubLObject tactic) {
        final SubLObject progress_iterator = inference_datastructures_tactic.tactic_progress_iterator(tactic);
        if (NIL != inference_datastructures_tactic.tactic_progress_iterator_p(progress_iterator)) {
            inference_datastructures_tactic.finalize_tactic_progress_iterator(progress_iterator);
            inference_datastructures_tactic._csetf_tact_progress_iterator(tactic, NIL);
        }
        return tactic;
    }

    public static final SubLObject destroy_tactic_int_alt(SubLObject tactic) {
        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_data(tactic, $FREE);
        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_progress_iterator(tactic, $FREE);
        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_completeness(tactic, $FREE);
        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_preference_level_justification(tactic, $FREE);
        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_productivity(tactic, $FREE);
        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_original_productivity(tactic, $FREE);
        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_hl_module(tactic, $FREE);
        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_problem(tactic, $FREE);
        return NIL;
    }

    public static SubLObject destroy_tactic_int(final SubLObject tactic) {
        inference_datastructures_tactic._csetf_tact_properties(tactic, $FREE);
        inference_datastructures_tactic._csetf_tact_data(tactic, $FREE);
        inference_datastructures_tactic._csetf_tact_progress_iterator(tactic, $FREE);
        inference_datastructures_tactic._csetf_tact_completeness(tactic, $FREE);
        inference_datastructures_tactic._csetf_tact_preference_level_justification(tactic, $FREE);
        inference_datastructures_tactic._csetf_tact_productivity(tactic, $FREE);
        inference_datastructures_tactic._csetf_tact_original_productivity(tactic, $FREE);
        inference_datastructures_tactic._csetf_tact_hl_module(tactic, $FREE);
        inference_datastructures_tactic._csetf_tact_problem(tactic, $FREE);
        return NIL;
    }

    public static final SubLObject note_tactic_invalid_alt(SubLObject tactic) {
        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_status(tactic, $FREE);
        return tactic;
    }

    public static SubLObject note_tactic_invalid(final SubLObject tactic) {
        inference_datastructures_tactic._csetf_tact_status(tactic, $FREE);
        return tactic;
    }

    /**
     * Return an SUID for tactic that is unique wrt its problem.
     */
    @LispMethod(comment = "Return an SUID for tactic that is unique wrt its problem.")
    public static final SubLObject tactic_suid_alt(SubLObject tactic) {
        SubLTrampolineFile.checkType(tactic, TACTIC_P);
        return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tact_suid(tactic);
    }

    /**
     * Return an SUID for tactic that is unique wrt its problem.
     */
    @LispMethod(comment = "Return an SUID for tactic that is unique wrt its problem.")
    public static SubLObject tactic_suid(final SubLObject tactic) {
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "! inference_datastructures_tactic.tactic_p(tactic) " + ("inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) ") + tactic;
        return inference_datastructures_tactic.tact_suid(tactic);
    }

    public static final SubLObject tactic_problem_alt(SubLObject tactic) {
        SubLTrampolineFile.checkType(tactic, TACTIC_P);
        return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tact_problem(tactic);
    }

    public static SubLObject tactic_problem(final SubLObject tactic) {
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "! inference_datastructures_tactic.tactic_p(tactic) " + ("inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) ") + tactic;
        return inference_datastructures_tactic.tact_problem(tactic);
    }

    public static final SubLObject tactic_hl_module_alt(SubLObject tactic) {
        SubLTrampolineFile.checkType(tactic, TACTIC_P);
        return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tact_hl_module(tactic);
    }

    public static SubLObject tactic_hl_module(final SubLObject tactic) {
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "! inference_datastructures_tactic.tactic_p(tactic) " + ("inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) ") + tactic;
        return inference_datastructures_tactic.tact_hl_module(tactic);
    }

    /**
     *
     *
     * @return tactic-type-p; the type of tactic, deducible from HL-MODULE, but stored anyway for efficiency
     */
    @LispMethod(comment = "@return tactic-type-p; the type of tactic, deducible from HL-MODULE, but stored anyway for efficiency")
    public static final SubLObject tactic_type_alt(SubLObject tactic) {
        SubLTrampolineFile.checkType(tactic, TACTIC_P);
        return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tact_type(tactic);
    }

    /**
     *
     *
     * @return tactic-type-p; the type of tactic, deducible from HL-MODULE, but stored anyway for efficiency
     */
    @LispMethod(comment = "@return tactic-type-p; the type of tactic, deducible from HL-MODULE, but stored anyway for efficiency")
    public static SubLObject tactic_type(final SubLObject tactic) {
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "! inference_datastructures_tactic.tactic_p(tactic) " + ("inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) ") + tactic;
        return inference_datastructures_tactic.tact_type(tactic);
    }

    public static final SubLObject tactic_completeness_alt(SubLObject tactic) {
        SubLTrampolineFile.checkType(tactic, TACTIC_P);
        {
            SubLObject completeness_or_preference = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tact_completeness(tactic);
            if (NIL != completeness_or_preference) {
                SubLTrampolineFile.checkType(completeness_or_preference, COMPLETENESS_P);
            }
            return completeness_or_preference;
        }
    }

    public static SubLObject tactic_completeness(final SubLObject tactic) {
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "! inference_datastructures_tactic.tactic_p(tactic) " + ("inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) ") + tactic;
        SubLObject completeness_or_preference = inference_datastructures_tactic.tact_completeness(tactic);
        if (NIL != preference_modules.preference_level_p(completeness_or_preference)) {
            completeness_or_preference = preference_modules.preference_level_to_completeness(completeness_or_preference);
        }
        return completeness_or_preference;
    }

    public static final SubLObject tactic_preference_level_alt(SubLObject tactic) {
        SubLTrampolineFile.checkType(tactic, TACTIC_P);
        {
            SubLObject completeness_or_preference = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tact_completeness(tactic);
            if (NIL != completeness_or_preference) {
                SubLTrampolineFile.checkType(completeness_or_preference, PREFERENCE_LEVEL_P);
            }
            return completeness_or_preference;
        }
    }

    public static SubLObject tactic_preference_level(final SubLObject tactic) {
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "! inference_datastructures_tactic.tactic_p(tactic) " + ("inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) ") + tactic;
        final SubLObject completeness_or_preference = inference_datastructures_tactic.tact_completeness(tactic);
        if (((NIL != completeness_or_preference) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == preference_modules.preference_level_p(completeness_or_preference))) {
            throw new AssertionError(completeness_or_preference);
        }
        return completeness_or_preference;
    }

    public static final SubLObject tactic_preference_level_justification_alt(SubLObject tactic) {
        SubLTrampolineFile.checkType(tactic, TACTIC_P);
        return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tact_preference_level_justification(tactic);
    }

    public static SubLObject tactic_preference_level_justification(final SubLObject tactic) {
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "! inference_datastructures_tactic.tactic_p(tactic) " + ("inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) ") + tactic;
        return inference_datastructures_tactic.tact_preference_level_justification(tactic);
    }

    public static final SubLObject tactic_productivity_alt(SubLObject tactic) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(tactic, TACTIC_P);
            if ((NIL != $leviathan_avoid_logical_tactic_productivity_computationP$.getDynamicValue(thread)) && (NIL != inference_worker.logical_tactic_p(tactic))) {
                return Errors.error($str_alt52$tactical_productivity_being_refer, tactic);
            }
            return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tact_productivity(tactic);
        }
    }

    public static SubLObject tactic_productivity(final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "! inference_datastructures_tactic.tactic_p(tactic) " + ("inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) ") + tactic;
        if ((NIL != inference_datastructures_tactic.$leviathan_avoid_logical_tactic_productivity_computationP$.getDynamicValue(thread)) && (NIL != inference_worker.logical_tactic_p(tactic))) {
            return Errors.error(inference_datastructures_tactic.$str62$tactical_productivity_being_refer, tactic);
        }
        return inference_datastructures_tactic.tact_productivity(tactic);
    }

    public static final SubLObject tactic_original_productivity_alt(SubLObject tactic) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(tactic, TACTIC_P);
            if ((NIL != $leviathan_avoid_logical_tactic_productivity_computationP$.getDynamicValue(thread)) && (NIL != inference_worker.logical_tactic_p(tactic))) {
                return Errors.error($str_alt52$tactical_productivity_being_refer, tactic);
            }
            return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tact_original_productivity(tactic);
        }
    }

    public static SubLObject tactic_original_productivity(final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "! inference_datastructures_tactic.tactic_p(tactic) " + ("inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) ") + tactic;
        if ((NIL != inference_datastructures_tactic.$leviathan_avoid_logical_tactic_productivity_computationP$.getDynamicValue(thread)) && (NIL != inference_worker.logical_tactic_p(tactic))) {
            return Errors.error(inference_datastructures_tactic.$str62$tactical_productivity_being_refer, tactic);
        }
        return inference_datastructures_tactic.tact_original_productivity(tactic);
    }

    public static final SubLObject tactic_status_alt(SubLObject tactic) {
        SubLTrampolineFile.checkType(tactic, TACTIC_P);
        return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tact_status(tactic);
    }

    public static SubLObject tactic_status(final SubLObject tactic) {
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "! inference_datastructures_tactic.tactic_p(tactic) " + ("inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) ") + tactic;
        return inference_datastructures_tactic.tact_status(tactic);
    }

    public static final SubLObject tactic_progress_iterator_alt(SubLObject tactic) {
        SubLTrampolineFile.checkType(tactic, TACTIC_P);
        return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tact_progress_iterator(tactic);
    }

    public static SubLObject tactic_progress_iterator(final SubLObject tactic) {
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "! inference_datastructures_tactic.tactic_p(tactic) " + ("inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) ") + tactic;
        return inference_datastructures_tactic.tact_progress_iterator(tactic);
    }

    public static final SubLObject tactic_data_alt(SubLObject tactic) {
        SubLTrampolineFile.checkType(tactic, TACTIC_P);
        return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tact_data(tactic);
    }

    public static SubLObject tactic_data(final SubLObject tactic) {
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "! inference_datastructures_tactic.tactic_p(tactic) " + ("inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) ") + tactic;
        return inference_datastructures_tactic.tact_data(tactic);
    }

    public static SubLObject tactic_properties(final SubLObject tactic) {
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "! inference_datastructures_tactic.tactic_p(tactic) " + ("inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) ") + tactic;
        return inference_datastructures_tactic.tact_properties(tactic);
    }

    public static final SubLObject set_tactic_completeness_alt(SubLObject tactic, SubLObject completeness) {
        SubLTrampolineFile.checkType(tactic, TACTIC_P);
        SubLTrampolineFile.checkType(completeness, COMPLETENESS_P);
        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_completeness(tactic, completeness);
        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_preference_level_justification(tactic, $str_alt53$);
        return tactic;
    }

    public static SubLObject set_tactic_completeness(final SubLObject tactic, final SubLObject completeness) {
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "! inference_datastructures_tactic.tactic_p(tactic) " + ("inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) ") + tactic;
        assert NIL != inference_datastructures_enumerated_types.completeness_p(completeness) : "! inference_datastructures_enumerated_types.completeness_p(completeness) " + ("inference_datastructures_enumerated_types.completeness_p(completeness) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.completeness_p(completeness) ") + completeness;
        inference_datastructures_tactic._csetf_tact_completeness(tactic, completeness);
        inference_datastructures_tactic._csetf_tact_preference_level_justification(tactic, inference_datastructures_tactic.$str64$);
        return tactic;
    }

    public static final SubLObject set_tactic_preference_level_alt(SubLObject tactic, SubLObject preference_level, SubLObject justification) {
        SubLTrampolineFile.checkType(tactic, TACTIC_P);
        SubLTrampolineFile.checkType(preference_level, PREFERENCE_LEVEL_P);
        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_completeness(tactic, preference_level);
        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_preference_level_justification(tactic, justification);
        return tactic;
    }

    public static SubLObject set_tactic_preference_level(final SubLObject tactic, final SubLObject preference_level, final SubLObject justification) {
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "! inference_datastructures_tactic.tactic_p(tactic) " + ("inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) ") + tactic;
        assert NIL != preference_modules.preference_level_p(preference_level) : "! preference_modules.preference_level_p(preference_level) " + ("preference_modules.preference_level_p(preference_level) " + "CommonSymbols.NIL != preference_modules.preference_level_p(preference_level) ") + preference_level;
        inference_datastructures_tactic._csetf_tact_completeness(tactic, preference_level);
        inference_datastructures_tactic._csetf_tact_preference_level_justification(tactic, justification);
        return tactic;
    }

    public static final SubLObject set_tactic_productivity_alt(SubLObject tactic, SubLObject productivity, SubLObject set_originalP) {
        if (set_originalP == UNPROVIDED) {
            set_originalP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(tactic, TACTIC_P);
            SubLTrampolineFile.checkType(productivity, PRODUCTIVITY_P);
            if ((NIL != $leviathan_avoid_logical_tactic_productivity_computationP$.getDynamicValue(thread)) && (NIL != inference_worker.logical_tactic_p(tactic))) {
                return tactic;
            }
            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_productivity(tactic, productivity);
            if (NIL != set_originalP) {
                com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_original_productivity(tactic, productivity);
            }
            return tactic;
        }
    }

    public static SubLObject set_tactic_productivity(final SubLObject tactic, SubLObject productivity, SubLObject set_originalP) {
        if (set_originalP == UNPROVIDED) {
            set_originalP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "! inference_datastructures_tactic.tactic_p(tactic) " + ("inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) ") + tactic;
        assert NIL != inference_datastructures_enumerated_types.productivity_p(productivity) : "! inference_datastructures_enumerated_types.productivity_p(productivity) " + ("inference_datastructures_enumerated_types.productivity_p(productivity) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.productivity_p(productivity) ") + productivity;
        if ((NIL != inference_datastructures_tactic.$leviathan_avoid_logical_tactic_productivity_computationP$.getDynamicValue(thread)) && (NIL != inference_worker.logical_tactic_p(tactic))) {
            return tactic;
        }
        if (NIL != inference_datastructures_tactic.$tactic_productivity_smoothing_method$.getDynamicValue(thread)) {
            productivity = funcall(inference_datastructures_tactic.$tactic_productivity_smoothing_method$.getDynamicValue(thread), productivity);
        }
        inference_datastructures_tactic._csetf_tact_productivity(tactic, productivity);
        if (NIL != set_originalP) {
            inference_datastructures_tactic._csetf_tact_original_productivity(tactic, productivity);
        }
        return tactic;
    }

    public static final SubLObject set_tactic_status_alt(SubLObject tactic, SubLObject status) {
        SubLTrampolineFile.checkType(tactic, TACTIC_P);
        SubLTrampolineFile.checkType(status, TACTIC_STATUS_P);
        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_status(tactic, status);
        return tactic;
    }

    public static SubLObject set_tactic_status(final SubLObject tactic, final SubLObject status) {
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "! inference_datastructures_tactic.tactic_p(tactic) " + ("inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) ") + tactic;
        assert NIL != inference_datastructures_enumerated_types.tactic_status_p(status) : "! inference_datastructures_enumerated_types.tactic_status_p(status) " + ("inference_datastructures_enumerated_types.tactic_status_p(status) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.tactic_status_p(status) ") + status;
        inference_datastructures_tactic._csetf_tact_status(tactic, status);
        return tactic;
    }

    public static final SubLObject set_tactic_data_alt(SubLObject tactic, SubLObject data) {
        SubLTrampolineFile.checkType(tactic, TACTIC_P);
        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_data(tactic, data);
        return tactic;
    }

    public static SubLObject set_tactic_data(final SubLObject tactic, final SubLObject data) {
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "! inference_datastructures_tactic.tactic_p(tactic) " + ("inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) ") + tactic;
        inference_datastructures_tactic._csetf_tact_data(tactic, data);
        return tactic;
    }

    public static final SubLObject set_meta_split_tactic_data_alt(SubLObject tactic, SubLObject data) {
        SubLTrampolineFile.checkType(tactic, META_SPLIT_TACTIC_P);
        return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.set_tactic_data(tactic, data);
    }

    public static SubLObject set_meta_split_tactic_data(final SubLObject tactic, final SubLObject data) {
        assert NIL != inference_worker_split.meta_split_tactic_p(tactic) : "! inference_worker_split.meta_split_tactic_p(tactic) " + ("inference_worker_split.meta_split_tactic_p(tactic) " + "CommonSymbols.NIL != inference_worker_split.meta_split_tactic_p(tactic) ") + tactic;
        return inference_datastructures_tactic.set_tactic_data(tactic, data);
    }

    public static SubLObject set_tactic_properties(final SubLObject tactic, final SubLObject v_properties) {
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "! inference_datastructures_tactic.tactic_p(tactic) " + ("inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) ") + tactic;
        assert NIL != list_utilities.property_list_p(v_properties) : "! list_utilities.property_list_p(v_properties) " + ("list_utilities.property_list_p(v_properties) " + "CommonSymbols.NIL != list_utilities.property_list_p(v_properties) ") + v_properties;
        inference_datastructures_tactic._csetf_tact_properties(tactic, v_properties);
        return tactic;
    }

    public static SubLObject set_tactic_property(final SubLObject tactic, final SubLObject key, final SubLObject value) {
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "! inference_datastructures_tactic.tactic_p(tactic) " + ("inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) ") + tactic;
        putf(inference_datastructures_tactic.tact_properties(tactic), key, value);
        return tactic;
    }

    public static SubLObject push_tactic_property(final SubLObject tactic, final SubLObject key, final SubLObject value) {
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "! inference_datastructures_tactic.tactic_p(tactic) " + ("inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) ") + tactic;
        SubLObject v_properties = inference_datastructures_tactic.tact_properties(tactic);
        v_properties = putf(v_properties, key, cons(value, list_utilities.plist_lookup(v_properties, key, NIL)));
        inference_datastructures_tactic._csetf_tact_properties(tactic, v_properties);
        return tactic;
    }

    /**
     *
     *
     * @unknown STRATEGY-VAR strategy-p; all strategies relevant to TACTIC's problem.
     * @see do-problem-relevant-inferences
     */
    @LispMethod(comment = "@unknown STRATEGY-VAR strategy-p; all strategies relevant to TACTIC\'s problem.\r\n@see do-problem-relevant-inferences")
    public static final SubLObject do_tactic_relevant_strategies_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt57);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject strategy_var = NIL;
                    SubLObject tactic = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt57);
                    strategy_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt57);
                    tactic = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(DO_PROBLEM_RELEVANT_STRATEGIES, list(strategy_var, list(TACTIC_PROBLEM, tactic)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt57);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown STRATEGY-VAR strategy-p; all strategies relevant to TACTIC's problem.
     * @see do-problem-relevant-inferences
     */
    @LispMethod(comment = "@unknown STRATEGY-VAR strategy-p; all strategies relevant to TACTIC\'s problem.\r\n@see do-problem-relevant-inferences")
    public static SubLObject do_tactic_relevant_strategies(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, inference_datastructures_tactic.$list69);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject strategy_var = NIL;
        SubLObject tactic = NIL;
        destructuring_bind_must_consp(current, datum, inference_datastructures_tactic.$list69);
        strategy_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, inference_datastructures_tactic.$list69);
        tactic = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(inference_datastructures_tactic.DO_PROBLEM_RELEVANT_STRATEGIES, list(strategy_var, list(inference_datastructures_tactic.TACTIC_PROBLEM, tactic)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, inference_datastructures_tactic.$list69);
        return NIL;
    }

    /**
     *
     *
     * @unknown TACTIC-VAR tactic-p; all tactics on TACTIC's problem other than TACTIC itself.
     */
    @LispMethod(comment = "@unknown TACTIC-VAR tactic-p; all tactics on TACTIC\'s problem other than TACTIC itself.")
    public static final SubLObject do_tactic_sibling_tactics_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt60);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject sibling_tactic_var = NIL;
                    SubLObject tactic = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt60);
                    sibling_tactic_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt60);
                    tactic = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt60);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt60);
                            if (NIL == member(current_1, $list_alt61, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt60);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            SubLObject status_tail = property_list_member($STATUS, current);
                            SubLObject status = (NIL != status_tail) ? ((SubLObject) (cadr(status_tail))) : NIL;
                            SubLObject completeness_tail = property_list_member($COMPLETENESS, current);
                            SubLObject completeness = (NIL != completeness_tail) ? ((SubLObject) (cadr(completeness_tail))) : NIL;
                            SubLObject preference_level_tail = property_list_member($PREFERENCE_LEVEL, current);
                            SubLObject preference_level = (NIL != preference_level_tail) ? ((SubLObject) (cadr(preference_level_tail))) : NIL;
                            SubLObject hl_module_tail = property_list_member($HL_MODULE, current);
                            SubLObject hl_module = (NIL != hl_module_tail) ? ((SubLObject) (cadr(hl_module_tail))) : NIL;
                            SubLObject type_tail = property_list_member($TYPE, current);
                            SubLObject type = (NIL != type_tail) ? ((SubLObject) (cadr(type_tail))) : NIL;
                            SubLObject productivity_tail = property_list_member($PRODUCTIVITY, current);
                            SubLObject productivity = (NIL != productivity_tail) ? ((SubLObject) (cadr(productivity_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject tactic_var = $sym65$TACTIC_VAR;
                                return list(CLET, list(list(tactic_var, tactic)), list(DO_PROBLEM_TACTICS, list(new SubLObject[]{ sibling_tactic_var, list(TACTIC_PROBLEM, tactic_var), $DONE, done, $STATUS, status, $COMPLETENESS, completeness, $PREFERENCE_LEVEL, preference_level, $HL_MODULE, hl_module, $TYPE, type, $PRODUCTIVITY, productivity }), listS(PUNLESS, list(EQ, sibling_tactic_var, tactic_var), append(body, NIL))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @unknown TACTIC-VAR tactic-p; all tactics on TACTIC's problem other than TACTIC itself.
     */
    @LispMethod(comment = "@unknown TACTIC-VAR tactic-p; all tactics on TACTIC\'s problem other than TACTIC itself.")
    public static SubLObject do_tactic_sibling_tactics(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, inference_datastructures_tactic.$list72);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sibling_tactic_var = NIL;
        SubLObject tactic = NIL;
        destructuring_bind_must_consp(current, datum, inference_datastructures_tactic.$list72);
        sibling_tactic_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, inference_datastructures_tactic.$list72);
        tactic = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, inference_datastructures_tactic.$list72);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, inference_datastructures_tactic.$list72);
            if (NIL == member(current_$1, inference_datastructures_tactic.$list73, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == inference_datastructures_tactic.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, inference_datastructures_tactic.$list72);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject status_tail = property_list_member($STATUS, current);
        final SubLObject status = (NIL != status_tail) ? cadr(status_tail) : NIL;
        final SubLObject completeness_tail = property_list_member($COMPLETENESS, current);
        final SubLObject completeness = (NIL != completeness_tail) ? cadr(completeness_tail) : NIL;
        final SubLObject preference_level_tail = property_list_member($PREFERENCE_LEVEL, current);
        final SubLObject preference_level = (NIL != preference_level_tail) ? cadr(preference_level_tail) : NIL;
        final SubLObject hl_module_tail = property_list_member($HL_MODULE, current);
        final SubLObject hl_module = (NIL != hl_module_tail) ? cadr(hl_module_tail) : NIL;
        final SubLObject type_tail = property_list_member($TYPE, current);
        final SubLObject type = (NIL != type_tail) ? cadr(type_tail) : NIL;
        final SubLObject productivity_tail = property_list_member($PRODUCTIVITY, current);
        final SubLObject productivity = (NIL != productivity_tail) ? cadr(productivity_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject tactic_var = inference_datastructures_tactic.$sym77$TACTIC_VAR;
        return list(CLET, list(list(tactic_var, tactic)), list(inference_datastructures_tactic.DO_PROBLEM_TACTICS, list(new SubLObject[]{ sibling_tactic_var, list(inference_datastructures_tactic.TACTIC_PROBLEM, tactic_var), $DONE, done, $STATUS, status, $COMPLETENESS, completeness, $PREFERENCE_LEVEL, preference_level, $HL_MODULE, hl_module, $TYPE, type, $PRODUCTIVITY, productivity }), listS(PUNLESS, list(EQ, sibling_tactic_var, tactic_var), append(body, NIL))));
    }

    public static final SubLObject tactic_ids_alt(SubLObject tactic) {
        return values(inference_datastructures_problem_store.problem_store_suid(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_store(tactic)), inference_datastructures_problem.problem_suid(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_problem(tactic)), com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_suid(tactic));
    }

    public static SubLObject tactic_ids(final SubLObject tactic) {
        return values(inference_datastructures_problem_store.problem_store_suid(inference_datastructures_tactic.tactic_store(tactic)), inference_datastructures_problem.problem_suid(inference_datastructures_tactic.tactic_problem(tactic)), inference_datastructures_tactic.tactic_suid(tactic));
    }

    public static final SubLObject find_tactic_by_id_alt(SubLObject problem, SubLObject id) {
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        {
            SubLObject count = inference_datastructures_problem.problem_tactic_count(problem);
            SubLObject index = number_utilities.f_1_(subtract(count, id));
            if (NIL != subl_promotions.non_negative_integer_p(index)) {
                {
                    SubLObject tactics = inference_datastructures_problem.problem_tactics(problem);
                    return nth(index, tactics);
                }
            }
        }
        return NIL;
    }

    public static SubLObject find_tactic_by_id(final SubLObject problem, final SubLObject id) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) " + ("inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ") + problem;
        final SubLObject count = inference_datastructures_problem.problem_tactic_count(problem);
        final SubLObject index = number_utilities.f_1_(subtract(count, id));
        if (NIL != subl_promotions.non_negative_integer_p(index)) {
            final SubLObject tactics = inference_datastructures_problem.problem_tactics(problem);
            return nth(index, tactics);
        }
        return NIL;
    }

    public static final SubLObject find_tactic_by_ids_alt(SubLObject store_suid, SubLObject problem_suid, SubLObject tactic_suid) {
        {
            SubLObject problem = inference_datastructures_problem_store.find_problem_by_ids(store_suid, problem_suid);
            if (NIL != problem) {
                {
                    SubLObject tactic = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.find_tactic_by_id(problem, tactic_suid);
                    return tactic;
                }
            }
        }
        return NIL;
    }

    public static SubLObject find_tactic_by_ids(final SubLObject store_suid, final SubLObject problem_suid, final SubLObject tactic_suid) {
        final SubLObject problem = inference_datastructures_problem_store.find_problem_by_ids(store_suid, problem_suid);
        if (NIL != problem) {
            final SubLObject tactic = inference_datastructures_tactic.find_tactic_by_id(problem, tactic_suid);
            return tactic;
        }
        return NIL;
    }

    public static final SubLObject tactic_hl_module_name_alt(SubLObject tactic) {
        return hl_module_name(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_hl_module(tactic));
    }

    public static SubLObject tactic_hl_module_name(final SubLObject tactic) {
        return inference_modules.hl_module_name(inference_datastructures_tactic.tactic_hl_module(tactic));
    }

    public static final SubLObject tactic_possibleP_alt(SubLObject tactic) {
        return eq($POSSIBLE, com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_status(tactic));
    }

    public static SubLObject tactic_possibleP(final SubLObject tactic) {
        return eq($POSSIBLE, inference_datastructures_tactic.tactic_status(tactic));
    }

    public static final SubLObject tactic_in_progressP_alt(SubLObject tactic) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_possibleP(tactic)) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_progress_iterator_p(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_progress_iterator(tactic))));
    }

    public static SubLObject tactic_in_progressP(final SubLObject tactic) {
        return makeBoolean((NIL != inference_datastructures_tactic.tactic_possibleP(tactic)) && (NIL != inference_datastructures_tactic.tactic_progress_iterator_p(inference_datastructures_tactic.tactic_progress_iterator(tactic))));
    }

    public static final SubLObject tactic_not_possibleP_alt(SubLObject tactic) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_possibleP(tactic));
    }

    public static SubLObject tactic_not_possibleP(final SubLObject tactic) {
        return makeBoolean(NIL == inference_datastructures_tactic.tactic_possibleP(tactic));
    }

    public static final SubLObject tactic_executedP_alt(SubLObject tactic) {
        return eq($EXECUTED, com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_status(tactic));
    }

    public static SubLObject tactic_executedP(final SubLObject tactic) {
        return eq($EXECUTED, inference_datastructures_tactic.tactic_status(tactic));
    }

    public static final SubLObject tactic_discardedP_alt(SubLObject tactic) {
        return eq($DISCARDED, com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_status(tactic));
    }

    public static SubLObject tactic_discardedP(final SubLObject tactic) {
        return eq($DISCARDED, inference_datastructures_tactic.tactic_status(tactic));
    }

    public static final SubLObject tactic_has_statusP_alt(SubLObject tactic, SubLObject status_spec) {
        {
            SubLObject pcase_var = status_spec;
            if (pcase_var.eql($NON_DISCARDED)) {
                return makeBoolean(NIL == com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_discardedP(tactic));
            } else {
                if (pcase_var.eql($IN_PROGESS)) {
                    return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_in_progressP(tactic);
                } else {
                    return eq(status_spec, com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_status(tactic));
                }
            }
        }
    }

    public static SubLObject tactic_has_statusP(final SubLObject tactic, final SubLObject status_spec) {
        if (status_spec.eql($NON_DISCARDED)) {
            return makeBoolean(NIL == inference_datastructures_tactic.tactic_discardedP(tactic));
        }
        if (status_spec.eql($IN_PROGRESS)) {
            return inference_datastructures_tactic.tactic_in_progressP(tactic);
        }
        if (status_spec.eql(inference_datastructures_tactic.$EXECUTED_OR_IN_PROGRESS)) {
            return makeBoolean((NIL != inference_datastructures_tactic.tactic_executedP(tactic)) || (NIL != inference_datastructures_tactic.tactic_in_progressP(tactic)));
        }
        return eq(status_spec, inference_datastructures_tactic.tactic_status(tactic));
    }

    public static final SubLObject abductive_tacticP_alt(SubLObject tactic) {
        return abductive_hl_moduleP(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_hl_module(tactic));
    }

    public static SubLObject abductive_tacticP(final SubLObject tactic) {
        return inference_modules.abductive_hl_moduleP(inference_datastructures_tactic.tactic_hl_module(tactic));
    }

    public static final SubLObject tactic_store_alt(SubLObject tactic) {
        return inference_datastructures_problem.problem_store(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_problem(tactic));
    }

    public static SubLObject tactic_store(final SubLObject tactic) {
        return inference_datastructures_problem.problem_store(inference_datastructures_tactic.tactic_problem(tactic));
    }

    /**
     * Return the query for the problem of TACTIC.
     */
    @LispMethod(comment = "Return the query for the problem of TACTIC.")
    public static final SubLObject tactic_problem_query_alt(SubLObject tactic) {
        {
            SubLObject problem = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_problem(tactic);
            return inference_datastructures_problem.problem_query(problem);
        }
    }

    /**
     * Return the query for the problem of TACTIC.
     */
    @LispMethod(comment = "Return the query for the problem of TACTIC.")
    public static SubLObject tactic_problem_query(final SubLObject tactic) {
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        return inference_datastructures_problem.problem_query(problem);
    }

    /**
     *
     *
     * @return contextualized-dnf-clause-p; the sole contextualized dnf clause for the query for the problem of TACTIC.
     */
    @LispMethod(comment = "@return contextualized-dnf-clause-p; the sole contextualized dnf clause for the query for the problem of TACTIC.")
    public static final SubLObject tactic_problem_sole_clause_alt(SubLObject tactic) {
        {
            SubLObject problem = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_problem(tactic);
            return inference_datastructures_problem.problem_sole_clause(problem);
        }
    }

    /**
     *
     *
     * @return contextualized-dnf-clause-p; the sole contextualized dnf clause for the query for the problem of TACTIC.
     */
    @LispMethod(comment = "@return contextualized-dnf-clause-p; the sole contextualized dnf clause for the query for the problem of TACTIC.")
    public static SubLObject tactic_problem_sole_clause(final SubLObject tactic) {
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        return inference_datastructures_problem.problem_sole_clause(problem);
    }

    public static final SubLObject update_tactic_productivity_alt(SubLObject tactic, SubLObject new_productivity) {
        {
            SubLObject old_productivity = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_productivity(tactic);
            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.set_tactic_productivity(tactic, new_productivity, NIL);
        }
        return tactic;
    }

    public static SubLObject update_tactic_productivity(final SubLObject tactic, final SubLObject new_productivity) {
        final SubLObject old_productivity = inference_datastructures_tactic.tactic_productivity(tactic);
        inference_datastructures_tactic.set_tactic_productivity(tactic, new_productivity, NIL);
        return tactic;
    }

    public static final SubLObject decrement_tactic_productivity_for_number_of_children_alt(SubLObject tactic, SubLObject number) {
        if (number == UNPROVIDED) {
            number = ONE_INTEGER;
        }
        {
            SubLObject old_productivity = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_productivity(tactic);
            SubLObject new_productivity = inference_datastructures_enumerated_types.decrement_productivity_for_number_of_children(old_productivity, number);
            new_productivity = max(new_productivity, ZERO_INTEGER);
            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.set_tactic_productivity(tactic, new_productivity, NIL);
            return new_productivity;
        }
    }

    public static SubLObject decrement_tactic_productivity_for_number_of_children(final SubLObject tactic, SubLObject number) {
        if (number == UNPROVIDED) {
            number = ONE_INTEGER;
        }
        final SubLObject old_productivity = inference_datastructures_tactic.tactic_productivity(tactic);
        SubLObject new_productivity = inference_datastructures_enumerated_types.decrement_productivity_for_number_of_children(old_productivity, number);
        new_productivity = max(new_productivity, ZERO_INTEGER);
        inference_datastructures_tactic.set_tactic_productivity(tactic, new_productivity, NIL);
        return new_productivity;
    }

    public static final SubLObject note_tactic_executed_alt(SubLObject tactic) {
        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.set_tactic_status(tactic, $EXECUTED);
        inference_metrics.increment_executed_tactic_historical_count();
        return tactic;
    }

    public static SubLObject note_tactic_executed(final SubLObject tactic) {
        inference_datastructures_tactic.set_tactic_status(tactic, $EXECUTED);
        inference_metrics.increment_executed_tactic_historical_count();
        return tactic;
    }

    public static final SubLObject note_tactic_discarded_alt(SubLObject tactic) {
        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.valid_tactic_p(tactic)) {
            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.clear_tactic_progress_iterator(tactic);
            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.set_tactic_status(tactic, $DISCARDED);
            inference_metrics.increment_discarded_tactic_historical_count();
            probably_approximately_done.pad_note_tactic_discarded();
        }
        return tactic;
    }

    public static SubLObject note_tactic_discarded(final SubLObject tactic) {
        if (NIL != inference_datastructures_tactic.valid_tactic_p(tactic)) {
            inference_datastructures_tactic.clear_tactic_progress_iterator(tactic);
            inference_datastructures_tactic.set_tactic_status(tactic, $DISCARDED);
            inference_metrics.increment_discarded_tactic_historical_count();
            inference_datastructures_strategy.set_tactic_recompute_thrown_away_wrt_all_relevant_strategies(tactic);
        }
        return tactic;
    }

    public static final SubLObject note_tactic_progress_iterator_alt(SubLObject tactic, SubLObject progress_iterator) {
        SubLTrampolineFile.checkType(tactic, $sym73$TACTIC_POSSIBLE_);
        SubLTrampolineFile.checkType(progress_iterator, TACTIC_PROGRESS_ITERATOR_P);
        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic._csetf_tact_progress_iterator(tactic, progress_iterator);
        return tactic;
    }

    public static SubLObject note_tactic_progress_iterator(final SubLObject tactic, final SubLObject progress_iterator) {
        assert NIL != inference_datastructures_tactic.tactic_possibleP(tactic) : "! inference_datastructures_tactic.tactic_possibleP(tactic) " + ("inference_datastructures_tactic.tactic_possibleP(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_possibleP(tactic) ") + tactic;
        assert NIL != inference_datastructures_tactic.tactic_progress_iterator_p(progress_iterator) : "! inference_datastructures_tactic.tactic_progress_iterator_p(progress_iterator) " + ("inference_datastructures_tactic.tactic_progress_iterator_p(progress_iterator) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_progress_iterator_p(progress_iterator) ") + progress_iterator;
        inference_datastructures_tactic._csetf_tact_progress_iterator(tactic, progress_iterator);
        return tactic;
    }

    public static final SubLObject clear_tactic_progress_iterator_alt(SubLObject tactic) {
        SubLTrampolineFile.checkType(tactic, $sym73$TACTIC_POSSIBLE_);
        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.destroy_tactic_progress_iterator(tactic);
        return tactic;
    }

    public static SubLObject clear_tactic_progress_iterator(final SubLObject tactic) {
        assert NIL != inference_datastructures_tactic.tactic_possibleP(tactic) : "! inference_datastructures_tactic.tactic_possibleP(tactic) " + ("inference_datastructures_tactic.tactic_possibleP(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_possibleP(tactic) ") + tactic;
        inference_datastructures_tactic.destroy_tactic_progress_iterator(tactic);
        return tactic;
    }

    public static final SubLObject tactic_in_progress_next_alt(SubLObject tactic) {
        {
            SubLObject progress_iterator = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_progress_iterator(tactic);
            SubLObject successP = NIL;
            try {
                if (NIL == iteration.iteration_done(progress_iterator)) {
                    iteration.iteration_next(progress_iterator);
                    successP = T;
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if ((NIL == successP) || (NIL != iteration.iteration_done(progress_iterator))) {
                            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_possibleP(tactic)) {
                                com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.clear_tactic_progress_iterator(tactic);
                            }
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return successP;
        }
    }

    public static SubLObject tactic_in_progress_next(final SubLObject tactic) {
        final SubLObject progress_iterator = inference_datastructures_tactic.tactic_progress_iterator(tactic);
        SubLObject successP = NIL;
        try {
            if (NIL == iteration.iteration_done(progress_iterator)) {
                iteration.iteration_next(progress_iterator);
                successP = T;
            }
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (((NIL == successP) || (NIL != iteration.iteration_done(progress_iterator))) && (NIL != inference_datastructures_tactic.tactic_possibleP(tactic))) {
                    inference_datastructures_tactic.clear_tactic_progress_iterator(tactic);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return successP;
    }

    public static final SubLObject possibly_update_tactic_productivity_from_iterator_alt(SubLObject tactic, SubLObject output_iterator) {
        {
            SubLObject number_of_children = NIL;
            SubLObject new_productivity = NIL;
            if (NIL != iteration.list_iterator_p(output_iterator)) {
                number_of_children = iteration.list_iterator_size(output_iterator);
            } else {
                if ((NIL != inference_worker_removal.conjunctive_removal_tactic_p(tactic)) && (NIL != sksi_query_utilities.sksi_cost_recording_iterator_p(output_iterator))) {
                    number_of_children = sksi_query_utilities.sksi_cost_recording_iterator_size(output_iterator);
                }
            }
            if (NIL != number_of_children) {
                new_productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(number_of_children);
            }
            if (NIL != inference_datastructures_enumerated_types.productivity_p(new_productivity)) {
                com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.update_tactic_productivity(tactic, new_productivity);
                return T;
            }
            return NIL;
        }
    }

    public static SubLObject possibly_update_tactic_productivity_from_iterator(final SubLObject tactic, final SubLObject output_iterator) {
        SubLObject number_of_children = NIL;
        SubLObject new_productivity = NIL;
        if (NIL != iteration.list_iterator_p(output_iterator)) {
            number_of_children = iteration.list_iterator_size(output_iterator);
        } else
            if ((NIL != inference_worker_removal.conjunctive_removal_tactic_p(tactic)) && (NIL != sksi_query_utilities.sksi_cost_recording_iterator_p(output_iterator))) {
                number_of_children = sksi_query_utilities.sksi_cost_recording_iterator_size(output_iterator);
            }

        if (NIL != number_of_children) {
            new_productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(number_of_children);
        }
        if (NIL != inference_datastructures_enumerated_types.productivity_p(new_productivity)) {
            inference_datastructures_tactic.update_tactic_productivity(tactic, new_productivity);
            return T;
        }
        return NIL;
    }

    /**
     * This is implementing least commitment.
     */
    @LispMethod(comment = "This is implementing least commitment.")
    public static final SubLObject select_least_productive_tactic_alt(SubLObject tactics) {
        return extremal(tactics, symbol_function($sym75$_), TACTIC_PRODUCTIVITY);
    }

    /**
     * This is implementing least commitment.
     */
    @LispMethod(comment = "This is implementing least commitment.")
    public static SubLObject select_least_productive_tactic(final SubLObject tactics) {
        return list_utilities.extremal(tactics, symbol_function(inference_datastructures_tactic.$sym88$_), inference_datastructures_tactic.TACTIC_PRODUCTIVITY);
    }

    public static final SubLObject total_productivity_of_tactics_alt(SubLObject tactics) {
        {
            SubLObject productivity = ZERO_INTEGER;
            SubLObject cdolist_list_var = tactics;
            SubLObject tactic = NIL;
            for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactic = cdolist_list_var.first()) {
                productivity = add(productivity, com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_productivity(tactic));
            }
            return productivity;
        }
    }

    public static SubLObject total_productivity_of_tactics(final SubLObject tactics) {
        SubLObject productivity = ZERO_INTEGER;
        SubLObject cdolist_list_var = tactics;
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            productivity = add(productivity, inference_datastructures_tactic.tactic_productivity(tactic));
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        return productivity;
    }

    public static final SubLObject total_productivity_of_problem_possible_tactics_alt(SubLObject problem) {
        {
            SubLObject productivity = ZERO_INTEGER;
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject tactic = NIL;
            for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactic = cdolist_list_var.first()) {
                if (NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, $POSSIBLE)) {
                    productivity = inference_datastructures_enumerated_types.productivity_X(productivity, com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_productivity(tactic));
                }
            }
            return productivity;
        }
    }

    public static SubLObject total_productivity_of_problem_possible_tactics(final SubLObject problem) {
        SubLObject productivity = ZERO_INTEGER;
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, $POSSIBLE)) {
                productivity = inference_datastructures_enumerated_types.productivity_X(productivity, inference_datastructures_tactic.tactic_productivity(tactic));
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        return productivity;
    }

    public static final SubLObject min_productivity_of_problem_possible_tactics_alt(SubLObject problem) {
        {
            SubLObject least_productivity = number_utilities.positive_infinity();
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject tactic = NIL;
            for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactic = cdolist_list_var.first()) {
                if (NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, $POSSIBLE)) {
                    {
                        SubLObject productivity = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_productivity(tactic);
                        if (NIL != inference_datastructures_enumerated_types.productivity_L(productivity, least_productivity)) {
                            least_productivity = productivity;
                        }
                    }
                }
            }
            return least_productivity;
        }
    }

    public static SubLObject min_productivity_of_problem_possible_tactics(final SubLObject problem) {
        SubLObject least_productivity = number_utilities.positive_infinity();
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, $POSSIBLE)) {
                final SubLObject productivity = inference_datastructures_tactic.tactic_productivity(tactic);
                if (NIL != inference_datastructures_enumerated_types.productivity_L(productivity, least_productivity)) {
                    least_productivity = productivity;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        return least_productivity;
    }

    public static final SubLObject note_tactic_most_recent_executed_alt(SubLObject tactic) {
        SubLTrampolineFile.checkType(tactic, TACTIC_P);
        inference_datastructures_problem_store.note_problem_store_most_recent_tactic_executed(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_store(tactic), tactic);
        return tactic;
    }

    public static SubLObject note_tactic_most_recent_executed(final SubLObject tactic) {
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "! inference_datastructures_tactic.tactic_p(tactic) " + ("inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) ") + tactic;
        inference_datastructures_problem_store.note_problem_store_most_recent_tactic_executed(inference_datastructures_tactic.tactic_store(tactic), tactic);
        return tactic;
    }

    /**
     *
     *
     * @return non-negative-integer-p; an estimate of the number of historical tactic executions in STORE.
    Differs from @xref problem-store-executed-tactic-count in that tactics with
    progress iterators will count as N rather than 1.
     */
    @LispMethod(comment = "@return non-negative-integer-p; an estimate of the number of historical tactic executions in STORE.\r\nDiffers from @xref problem-store-executed-tactic-count in that tactics with\r\nprogress iterators will count as N rather than 1.")
    public static final SubLObject problem_store_tactic_execution_count_alt(SubLObject store) {
        {
            SubLObject count = ZERO_INTEGER;
            SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                {
                    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                    SubLObject problem = NIL;
                    while (NIL != id) {
                        problem = do_id_index_state_object(idx, $SKIP, id, state_var);
                        if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
                            {
                                SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
                                SubLObject tactic = NIL;
                                for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactic = cdolist_list_var.first()) {
                                    count = add(count, com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_execution_count(tactic));
                                }
                            }
                        }
                        id = do_id_index_next_id(idx, NIL, id, state_var);
                        state_var = do_id_index_next_state(idx, NIL, id, state_var);
                    } 
                }
            }
            return count;
        }
    }

    /**
     *
     *
     * @return non-negative-integer-p; an estimate of the number of historical tactic executions in STORE.
    Differs from @xref problem-store-executed-tactic-count in that tactics with
    progress iterators will count as N rather than 1.
     */
    @LispMethod(comment = "@return non-negative-integer-p; an estimate of the number of historical tactic executions in STORE.\r\nDiffers from @xref problem-store-executed-tactic-count in that tactics with\r\nprogress iterators will count as N rather than 1.")
    public static SubLObject problem_store_tactic_execution_count(final SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$2 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$2, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$2);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                SubLObject cdolist_list_var;
                SubLObject tactic;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    problem = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
                        tactic = NIL;
                        tactic = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            count = add(count, inference_datastructures_tactic.tactic_execution_count(tactic));
                            cdolist_list_var = cdolist_list_var.rest();
                            tactic = cdolist_list_var.first();
                        } 
                    }
                }
            }
            final SubLObject idx_$3 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$3)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$3);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        problem2 = getEntryValue(cdohash_entry);
                        SubLObject cdolist_list_var2 = inference_datastructures_problem.problem_tactics(problem2);
                        SubLObject tactic2 = NIL;
                        tactic2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            count = add(count, inference_datastructures_tactic.tactic_execution_count(tactic2));
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            tactic2 = cdolist_list_var2.first();
                        } 
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    /**
     *
     *
     * @return non-negative-integer-p; an estimate of the number of times EXECUTE-TACTIC was called on TACTIC.
     */
    @LispMethod(comment = "@return non-negative-integer-p; an estimate of the number of times EXECUTE-TACTIC was called on TACTIC.")
    public static final SubLObject tactic_execution_count_alt(SubLObject tactic) {
        if (NIL != inference_worker.content_tactic_p(tactic)) {
            return round(inference_datastructures_enumerated_types.number_of_children_for_productivity(inference_worker.content_tactic_actual_productivity(tactic)), UNPROVIDED);
        } else {
            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.tactic_executedP(tactic)) {
                return ONE_INTEGER;
            } else {
                return ZERO_INTEGER;
            }
        }
    }

    /**
     *
     *
     * @return non-negative-integer-p; an estimate of the number of times EXECUTE-TACTIC was called on TACTIC.
     */
    @LispMethod(comment = "@return non-negative-integer-p; an estimate of the number of times EXECUTE-TACTIC was called on TACTIC.")
    public static SubLObject tactic_execution_count(final SubLObject tactic) {
        if (NIL != inference_worker.content_tactic_p(tactic)) {
            return round(inference_datastructures_enumerated_types.number_of_children_for_productivity(inference_worker.content_tactic_actual_productivity(tactic)), UNPROVIDED);
        }
        if (NIL != inference_datastructures_tactic.tactic_executedP(tactic)) {
            return ONE_INTEGER;
        }
        return ZERO_INTEGER;
    }

    public static final SubLObject tactic_progress_iterator_p_alt(SubLObject v_object) {
        return iteration.iterator_p(v_object);
    }

    public static SubLObject tactic_progress_iterator_p(final SubLObject v_object) {
        return iteration.iterator_p(v_object);
    }

    public static final SubLObject new_tactic_progress_iterator_alt(SubLObject iteration_type, SubLObject tactic, SubLObject sub_state) {
        return iteration.new_iterator(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.make_tactic_progress_iterator_state(iteration_type, tactic, sub_state), $sym78$TACTIC_PROGRESS_DONE_, TACTIC_PROGRESS_NEXT, TACTIC_PROGRESS_FINALIZE);
    }

    public static SubLObject new_tactic_progress_iterator(final SubLObject iteration_type, final SubLObject tactic, final SubLObject sub_state) {
        return iteration.new_iterator(inference_datastructures_tactic.make_tactic_progress_iterator_state(iteration_type, tactic, sub_state), inference_datastructures_tactic.$sym91$TACTIC_PROGRESS_DONE_, inference_datastructures_tactic.TACTIC_PROGRESS_NEXT, inference_datastructures_tactic.TACTIC_PROGRESS_FINALIZE);
    }

    public static final SubLObject make_tactic_progress_iterator_state_alt(SubLObject iteration_type, SubLObject tactic, SubLObject sub_state) {
        {
            SubLObject current = sub_state;
            return list(current, iteration_type, tactic);
        }
    }

    public static SubLObject make_tactic_progress_iterator_state(final SubLObject iteration_type, final SubLObject tactic, final SubLObject sub_state) {
        return list(sub_state, iteration_type, tactic);
    }

    public static final SubLObject tactic_progress_doneP_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject current_2 = NIL;
            SubLObject iteration_type = NIL;
            SubLObject tactic = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt81);
            current_2 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt81);
            iteration_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt81);
            tactic = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject pcase_var = iteration_type;
                    if (pcase_var.eql($REMOVAL_EXPAND)) {
                        return sublisp_null(current_2);
                    } else {
                        if (pcase_var.eql($REMOVAL_OUTPUT_GENERATE)) {
                            {
                                SubLObject datum_3 = current_2;
                                SubLObject current_4 = datum_3;
                                SubLObject output_iterator = NIL;
                                SubLObject v_bindings = NIL;
                                destructuring_bind_must_consp(current_4, datum_3, $list_alt84);
                                output_iterator = current_4.first();
                                current_4 = current_4.rest();
                                destructuring_bind_must_consp(current_4, datum_3, $list_alt84);
                                v_bindings = current_4.first();
                                current_4 = current_4.rest();
                                if (NIL == current_4) {
                                    return iteration.iteration_done(output_iterator);
                                } else {
                                    cdestructuring_bind_error(datum_3, $list_alt84);
                                }
                            }
                        } else {
                            if (pcase_var.eql($CONJUNCTIVE_REMOVAL_EXPAND)) {
                                return sublisp_null(current_2);
                            } else {
                                if (pcase_var.eql($CONJUNCTIVE_REMOVAL_EXPAND_ITERATIVE)) {
                                    return iteration.iteration_done(current_2);
                                } else {
                                    if (pcase_var.eql($TRANSFORMATION_RULE_SELECT)) {
                                        return sublisp_null(current_2);
                                    } else {
                                        if (pcase_var.eql($META_STRUCTURAL)) {
                                            return meta_structural_progress_iterator_doneP(tactic);
                                        } else {
                                            return Errors.error($str_alt89$Time_to_implement_tactic_progress, iteration_type);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt81);
            }
        }
        return NIL;
    }

    public static SubLObject tactic_progress_doneP(final SubLObject state) {
        SubLObject current_$4 = NIL;
        SubLObject iteration_type = NIL;
        SubLObject tactic = NIL;
        destructuring_bind_must_consp(state, state, inference_datastructures_tactic.$list94);
        current_$4 = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, inference_datastructures_tactic.$list94);
        iteration_type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, inference_datastructures_tactic.$list94);
        tactic = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject pcase_var = iteration_type;
            if (pcase_var.eql($REMOVAL_EXPAND)) {
                return sublisp_null(current_$4);
            }
            if (pcase_var.eql(inference_datastructures_tactic.$REMOVAL_OUTPUT_GENERATE)) {
                SubLObject current_$5;
                final SubLObject datum_$5 = current_$5 = current_$4;
                SubLObject output_iterator = NIL;
                SubLObject v_bindings = NIL;
                destructuring_bind_must_consp(current_$5, datum_$5, inference_datastructures_tactic.$list97);
                output_iterator = current_$5.first();
                current_$5 = current_$5.rest();
                destructuring_bind_must_consp(current_$5, datum_$5, inference_datastructures_tactic.$list97);
                v_bindings = current_$5.first();
                current_$5 = current_$5.rest();
                if (NIL == current_$5) {
                    return iteration.iteration_done(output_iterator);
                }
                cdestructuring_bind_error(datum_$5, inference_datastructures_tactic.$list97);
            } else {
                if (pcase_var.eql(inference_datastructures_tactic.$CONJUNCTIVE_REMOVAL_EXPAND)) {
                    return sublisp_null(current_$4);
                }
                if (pcase_var.eql(inference_datastructures_tactic.$CONJUNCTIVE_REMOVAL_EXPAND_ITERATIVE)) {
                    return iteration.iteration_done(current_$4);
                }
                if (pcase_var.eql(inference_datastructures_tactic.$TRANSFORMATION_RULE_SELECT)) {
                    return sublisp_null(current_$4);
                }
                if (pcase_var.eql($META_STRUCTURAL)) {
                    return inference_worker_split.meta_structural_progress_iterator_doneP(tactic);
                }
                return Errors.error(inference_datastructures_tactic.$str102$Time_to_implement_tactic_progress, iteration_type);
            }
        } else {
            cdestructuring_bind_error(state, inference_datastructures_tactic.$list94);
        }
        return NIL;
    }

    public static final SubLObject tactic_progress_next_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject current_5 = NIL;
            SubLObject iteration_type = NIL;
            SubLObject tactic = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt81);
            current_5 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt81);
            iteration_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt81);
            tactic = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject pcase_var = iteration_type;
                    if (pcase_var.eql($REMOVAL_EXPAND)) {
                        {
                            SubLObject expand_result = current_5.first();
                            SubLObject update = current_5.rest();
                            rplaca(state, update);
                            {
                                SubLObject side_effect_result = inference_worker_removal.handle_one_removal_tactic_expand_result(tactic, expand_result);
                                return values(side_effect_result, state);
                            }
                        }
                    } else {
                        if (pcase_var.eql($REMOVAL_OUTPUT_GENERATE)) {
                            {
                                SubLObject datum_6 = current_5;
                                SubLObject current_7 = datum_6;
                                SubLObject output_iterator = NIL;
                                SubLObject encoded_bindings = NIL;
                                destructuring_bind_must_consp(current_7, datum_6, $list_alt90);
                                output_iterator = current_7.first();
                                current_7 = current_7.rest();
                                destructuring_bind_must_consp(current_7, datum_6, $list_alt90);
                                encoded_bindings = current_7.first();
                                current_7 = current_7.rest();
                                if (NIL == current_7) {
                                    {
                                        SubLObject side_effect_result = inference_worker_removal.handle_one_removal_tactic_output_generate_result(tactic, output_iterator, encoded_bindings);
                                        return values(side_effect_result, state);
                                    }
                                } else {
                                    cdestructuring_bind_error(datum_6, $list_alt90);
                                }
                            }
                        } else {
                            if (pcase_var.eql($CONJUNCTIVE_REMOVAL_EXPAND)) {
                                {
                                    SubLObject expand_result = current_5.first();
                                    SubLObject update = current_5.rest();
                                    rplaca(state, update);
                                    {
                                        SubLObject side_effect_result = inference_worker_removal.handle_one_conjunctive_removal_tactic_expand_result(tactic, expand_result);
                                        return values(side_effect_result, state);
                                    }
                                }
                            } else {
                                if (pcase_var.eql($CONJUNCTIVE_REMOVAL_EXPAND_ITERATIVE)) {
                                    {
                                        SubLObject side_effect_result = inference_worker_removal.handle_one_conjunctive_removal_tactic_expand_iterative_result(tactic, current_5);
                                        return values(side_effect_result, state);
                                    }
                                } else {
                                    if (pcase_var.eql($TRANSFORMATION_RULE_SELECT)) {
                                        {
                                            SubLObject rule = current_5.first();
                                            SubLObject update = current_5.rest();
                                            rplaca(state, update);
                                            {
                                                SubLObject side_effect_result = inference_worker_transformation.handle_one_transformation_tactic_rule_select_result(tactic, rule);
                                                return values(side_effect_result, state);
                                            }
                                        }
                                    } else {
                                        if (pcase_var.eql($META_STRUCTURAL)) {
                                            execute_meta_split_tactic(tactic);
                                            return values(NIL, state);
                                        } else {
                                            return Errors.error($str_alt91$Time_to_implement_tactic_progress, iteration_type);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt81);
            }
        }
        return NIL;
    }

    public static SubLObject tactic_progress_next(final SubLObject state) {
        SubLObject current_$7 = NIL;
        SubLObject iteration_type = NIL;
        SubLObject tactic = NIL;
        destructuring_bind_must_consp(state, state, inference_datastructures_tactic.$list94);
        current_$7 = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, inference_datastructures_tactic.$list94);
        iteration_type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, inference_datastructures_tactic.$list94);
        tactic = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject pcase_var = iteration_type;
            if (pcase_var.eql($REMOVAL_EXPAND)) {
                final SubLObject expand_result = current_$7.first();
                final SubLObject update = current_$7.rest();
                rplaca(state, update);
                final SubLObject side_effect_result = inference_worker_removal.handle_one_removal_tactic_expand_result(tactic, expand_result);
                return subl_promotions.values3(side_effect_result, state, NIL);
            }
            if (pcase_var.eql(inference_datastructures_tactic.$REMOVAL_OUTPUT_GENERATE)) {
                SubLObject current_$8;
                final SubLObject datum_$8 = current_$8 = current_$7;
                SubLObject output_iterator = NIL;
                SubLObject encoded_bindings = NIL;
                destructuring_bind_must_consp(current_$8, datum_$8, inference_datastructures_tactic.$list103);
                output_iterator = current_$8.first();
                current_$8 = current_$8.rest();
                destructuring_bind_must_consp(current_$8, datum_$8, inference_datastructures_tactic.$list103);
                encoded_bindings = current_$8.first();
                current_$8 = current_$8.rest();
                if (NIL == current_$8) {
                    final SubLObject side_effect_result2 = inference_worker_removal.handle_one_removal_tactic_output_generate_result(tactic, output_iterator, encoded_bindings);
                    return subl_promotions.values3(side_effect_result2, state, NIL);
                }
                cdestructuring_bind_error(datum_$8, inference_datastructures_tactic.$list103);
            } else {
                if (pcase_var.eql(inference_datastructures_tactic.$CONJUNCTIVE_REMOVAL_EXPAND)) {
                    final SubLObject expand_result = current_$7.first();
                    final SubLObject update = current_$7.rest();
                    rplaca(state, update);
                    final SubLObject side_effect_result = inference_worker_removal.handle_one_conjunctive_removal_tactic_expand_result(tactic, expand_result);
                    return subl_promotions.values3(side_effect_result, state, NIL);
                }
                if (pcase_var.eql(inference_datastructures_tactic.$CONJUNCTIVE_REMOVAL_EXPAND_ITERATIVE)) {
                    final SubLObject side_effect_result3 = inference_worker_removal.handle_one_conjunctive_removal_tactic_expand_iterative_result(tactic, current_$7);
                    return subl_promotions.values3(side_effect_result3, state, NIL);
                }
                if (pcase_var.eql(inference_datastructures_tactic.$TRANSFORMATION_RULE_SELECT)) {
                    final SubLObject rule = current_$7.first();
                    final SubLObject update = current_$7.rest();
                    rplaca(state, update);
                    final SubLObject side_effect_result = inference_worker_transformation.handle_one_transformation_tactic_rule_select_result(tactic, rule);
                    return subl_promotions.values3(side_effect_result, state, NIL);
                }
                if (pcase_var.eql($META_STRUCTURAL)) {
                    inference_worker_split.execute_meta_split_tactic(tactic);
                    return subl_promotions.values3(NIL, state, NIL);
                }
                return Errors.error(inference_datastructures_tactic.$str104$Time_to_implement_tactic_progress, iteration_type);
            }
        } else {
            cdestructuring_bind_error(state, inference_datastructures_tactic.$list94);
        }
        return NIL;
    }

    public static final SubLObject tactic_progress_finalize_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject current_8 = NIL;
            SubLObject iteration_type = NIL;
            SubLObject tactic = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt81);
            current_8 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt81);
            iteration_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt81);
            tactic = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject pcase_var = iteration_type;
                    if (pcase_var.eql($REMOVAL_EXPAND)) {
                        return T;
                    } else {
                        if (pcase_var.eql($REMOVAL_OUTPUT_GENERATE)) {
                            {
                                SubLObject datum_9 = current_8;
                                SubLObject current_10 = datum_9;
                                SubLObject output_iterator = NIL;
                                SubLObject encoded_bindings = NIL;
                                destructuring_bind_must_consp(current_10, datum_9, $list_alt90);
                                output_iterator = current_10.first();
                                current_10 = current_10.rest();
                                destructuring_bind_must_consp(current_10, datum_9, $list_alt90);
                                encoded_bindings = current_10.first();
                                current_10 = current_10.rest();
                                if (NIL == current_10) {
                                    return iteration.iteration_finalize(output_iterator);
                                } else {
                                    cdestructuring_bind_error(datum_9, $list_alt90);
                                }
                            }
                        } else {
                            if (pcase_var.eql($CONJUNCTIVE_REMOVAL_EXPAND)) {
                                return T;
                            } else {
                                if (pcase_var.eql($CONJUNCTIVE_REMOVAL_EXPAND_ITERATIVE)) {
                                    return iteration.iteration_finalize(current_8);
                                } else {
                                    if (pcase_var.eql($TRANSFORMATION_RULE_SELECT)) {
                                        return T;
                                    } else {
                                        if (pcase_var.eql($META_STRUCTURAL)) {
                                            return T;
                                        } else {
                                            return Errors.error($str_alt92$Time_to_implement_tactic_progress, iteration_type);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt81);
            }
        }
        return NIL;
    }

    public static SubLObject tactic_progress_finalize(final SubLObject state) {
        SubLObject current_$10 = NIL;
        SubLObject iteration_type = NIL;
        SubLObject tactic = NIL;
        destructuring_bind_must_consp(state, state, inference_datastructures_tactic.$list94);
        current_$10 = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, inference_datastructures_tactic.$list94);
        iteration_type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, inference_datastructures_tactic.$list94);
        tactic = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject pcase_var = iteration_type;
            if (pcase_var.eql($REMOVAL_EXPAND)) {
                return T;
            }
            if (pcase_var.eql(inference_datastructures_tactic.$REMOVAL_OUTPUT_GENERATE)) {
                SubLObject current_$11;
                final SubLObject datum_$11 = current_$11 = current_$10;
                SubLObject output_iterator = NIL;
                SubLObject encoded_bindings = NIL;
                destructuring_bind_must_consp(current_$11, datum_$11, inference_datastructures_tactic.$list103);
                output_iterator = current_$11.first();
                current_$11 = current_$11.rest();
                destructuring_bind_must_consp(current_$11, datum_$11, inference_datastructures_tactic.$list103);
                encoded_bindings = current_$11.first();
                current_$11 = current_$11.rest();
                if (NIL == current_$11) {
                    return iteration.iteration_finalize(output_iterator);
                }
                cdestructuring_bind_error(datum_$11, inference_datastructures_tactic.$list103);
            } else {
                if (pcase_var.eql(inference_datastructures_tactic.$CONJUNCTIVE_REMOVAL_EXPAND)) {
                    return T;
                }
                if (pcase_var.eql(inference_datastructures_tactic.$CONJUNCTIVE_REMOVAL_EXPAND_ITERATIVE)) {
                    return iteration.iteration_finalize(current_$10);
                }
                if (pcase_var.eql(inference_datastructures_tactic.$TRANSFORMATION_RULE_SELECT)) {
                    return T;
                }
                if (pcase_var.eql($META_STRUCTURAL)) {
                    return T;
                }
                return Errors.error(inference_datastructures_tactic.$str105$Time_to_implement_tactic_progress, iteration_type);
            }
        } else {
            cdestructuring_bind_error(state, inference_datastructures_tactic.$list94);
        }
        return NIL;
    }

    public static final SubLObject finalize_tactic_progress_iterator_alt(SubLObject progress_iterator) {
        SubLTrampolineFile.checkType(progress_iterator, TACTIC_PROGRESS_ITERATOR_P);
        iteration.iteration_finalize(progress_iterator);
        return progress_iterator;
    }

    public static SubLObject finalize_tactic_progress_iterator(final SubLObject progress_iterator) {
        assert NIL != inference_datastructures_tactic.tactic_progress_iterator_p(progress_iterator) : "! inference_datastructures_tactic.tactic_progress_iterator_p(progress_iterator) " + ("inference_datastructures_tactic.tactic_progress_iterator_p(progress_iterator) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_progress_iterator_p(progress_iterator) ") + progress_iterator;
        iteration.iteration_finalize(progress_iterator);
        return progress_iterator;
    }

    public static SubLObject declare_inference_datastructures_tactic_file() {
        declareFunction("tactic_print_function_trampoline", "TACTIC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("tactic_p", "TACTIC-P", 1, 0, false);
        new inference_datastructures_tactic.$tactic_p$UnaryFunction();
        declareFunction("tact_suid", "TACT-SUID", 1, 0, false);
        declareFunction("tact_problem", "TACT-PROBLEM", 1, 0, false);
        declareFunction("tact_type", "TACT-TYPE", 1, 0, false);
        declareFunction("tact_hl_module", "TACT-HL-MODULE", 1, 0, false);
        declareFunction("tact_completeness", "TACT-COMPLETENESS", 1, 0, false);
        declareFunction("tact_preference_level_justification", "TACT-PREFERENCE-LEVEL-JUSTIFICATION", 1, 0, false);
        declareFunction("tact_productivity", "TACT-PRODUCTIVITY", 1, 0, false);
        declareFunction("tact_original_productivity", "TACT-ORIGINAL-PRODUCTIVITY", 1, 0, false);
        declareFunction("tact_status", "TACT-STATUS", 1, 0, false);
        declareFunction("tact_progress_iterator", "TACT-PROGRESS-ITERATOR", 1, 0, false);
        declareFunction("tact_data", "TACT-DATA", 1, 0, false);
        declareFunction("tact_properties", "TACT-PROPERTIES", 1, 0, false);
        declareFunction("_csetf_tact_suid", "_CSETF-TACT-SUID", 2, 0, false);
        declareFunction("_csetf_tact_problem", "_CSETF-TACT-PROBLEM", 2, 0, false);
        declareFunction("_csetf_tact_type", "_CSETF-TACT-TYPE", 2, 0, false);
        declareFunction("_csetf_tact_hl_module", "_CSETF-TACT-HL-MODULE", 2, 0, false);
        declareFunction("_csetf_tact_completeness", "_CSETF-TACT-COMPLETENESS", 2, 0, false);
        declareFunction("_csetf_tact_preference_level_justification", "_CSETF-TACT-PREFERENCE-LEVEL-JUSTIFICATION", 2, 0, false);
        declareFunction("_csetf_tact_productivity", "_CSETF-TACT-PRODUCTIVITY", 2, 0, false);
        declareFunction("_csetf_tact_original_productivity", "_CSETF-TACT-ORIGINAL-PRODUCTIVITY", 2, 0, false);
        declareFunction("_csetf_tact_status", "_CSETF-TACT-STATUS", 2, 0, false);
        declareFunction("_csetf_tact_progress_iterator", "_CSETF-TACT-PROGRESS-ITERATOR", 2, 0, false);
        declareFunction("_csetf_tact_data", "_CSETF-TACT-DATA", 2, 0, false);
        declareFunction("_csetf_tact_properties", "_CSETF-TACT-PROPERTIES", 2, 0, false);
        declareFunction("make_tactic", "MAKE-TACTIC", 0, 1, false);
        declareFunction("visit_defstruct_tactic", "VISIT-DEFSTRUCT-TACTIC", 2, 0, false);
        declareFunction("visit_defstruct_object_tactic_method", "VISIT-DEFSTRUCT-OBJECT-TACTIC-METHOD", 2, 0, false);
        declareFunction("valid_tactic_p", "VALID-TACTIC-P", 1, 0, false);
        declareFunction("invalid_tactic_p", "INVALID-TACTIC-P", 1, 0, false);
        declareFunction("tactic_invalid_p", "TACTIC-INVALID-P", 1, 0, false);
        declareFunction("print_tactic", "PRINT-TACTIC", 3, 0, false);
        declareFunction("sxhash_tactic_method", "SXHASH-TACTIC-METHOD", 1, 0, false);
        new inference_datastructures_tactic.$sxhash_tactic_method$UnaryFunction();
        declareFunction("new_tactic", "NEW-TACTIC", 2, 1, false);
        declareFunction("destroy_problem_tactic", "DESTROY-PROBLEM-TACTIC", 1, 0, false);
        declareFunction("destroy_problem_tactic_and_backpointers", "DESTROY-PROBLEM-TACTIC-AND-BACKPOINTERS", 1, 0, false);
        declareFunction("destroy_tactic_progress_iterator", "DESTROY-TACTIC-PROGRESS-ITERATOR", 1, 0, false);
        declareFunction("destroy_tactic_int", "DESTROY-TACTIC-INT", 1, 0, false);
        declareFunction("note_tactic_invalid", "NOTE-TACTIC-INVALID", 1, 0, false);
        declareFunction("tactic_suid", "TACTIC-SUID", 1, 0, false);
        declareFunction("tactic_problem", "TACTIC-PROBLEM", 1, 0, false);
        declareFunction("tactic_hl_module", "TACTIC-HL-MODULE", 1, 0, false);
        declareFunction("tactic_type", "TACTIC-TYPE", 1, 0, false);
        declareFunction("tactic_completeness", "TACTIC-COMPLETENESS", 1, 0, false);
        declareFunction("tactic_preference_level", "TACTIC-PREFERENCE-LEVEL", 1, 0, false);
        declareFunction("tactic_preference_level_justification", "TACTIC-PREFERENCE-LEVEL-JUSTIFICATION", 1, 0, false);
        declareFunction("tactic_productivity", "TACTIC-PRODUCTIVITY", 1, 0, false);
        declareFunction("tactic_original_productivity", "TACTIC-ORIGINAL-PRODUCTIVITY", 1, 0, false);
        declareFunction("tactic_status", "TACTIC-STATUS", 1, 0, false);
        declareFunction("tactic_progress_iterator", "TACTIC-PROGRESS-ITERATOR", 1, 0, false);
        declareFunction("tactic_data", "TACTIC-DATA", 1, 0, false);
        declareFunction("tactic_properties", "TACTIC-PROPERTIES", 1, 0, false);
        declareFunction("set_tactic_completeness", "SET-TACTIC-COMPLETENESS", 2, 0, false);
        declareFunction("set_tactic_preference_level", "SET-TACTIC-PREFERENCE-LEVEL", 3, 0, false);
        declareFunction("set_tactic_productivity", "SET-TACTIC-PRODUCTIVITY", 2, 1, false);
        declareFunction("set_tactic_status", "SET-TACTIC-STATUS", 2, 0, false);
        declareFunction("set_tactic_data", "SET-TACTIC-DATA", 2, 0, false);
        declareFunction("set_meta_split_tactic_data", "SET-META-SPLIT-TACTIC-DATA", 2, 0, false);
        declareFunction("set_tactic_properties", "SET-TACTIC-PROPERTIES", 2, 0, false);
        declareFunction("set_tactic_property", "SET-TACTIC-PROPERTY", 3, 0, false);
        declareFunction("push_tactic_property", "PUSH-TACTIC-PROPERTY", 3, 0, false);
        declareMacro("do_tactic_relevant_strategies", "DO-TACTIC-RELEVANT-STRATEGIES");
        declareMacro("do_tactic_sibling_tactics", "DO-TACTIC-SIBLING-TACTICS");
        declareFunction("tactic_ids", "TACTIC-IDS", 1, 0, false);
        declareFunction("find_tactic_by_id", "FIND-TACTIC-BY-ID", 2, 0, false);
        declareFunction("find_tactic_by_ids", "FIND-TACTIC-BY-IDS", 3, 0, false);
        declareFunction("tactic_hl_module_name", "TACTIC-HL-MODULE-NAME", 1, 0, false);
        declareFunction("tactic_possibleP", "TACTIC-POSSIBLE?", 1, 0, false);
        new inference_datastructures_tactic.$tactic_possibleP$UnaryFunction();
        declareFunction("tactic_in_progressP", "TACTIC-IN-PROGRESS?", 1, 0, false);
        declareFunction("tactic_not_possibleP", "TACTIC-NOT-POSSIBLE?", 1, 0, false);
        declareFunction("tactic_executedP", "TACTIC-EXECUTED?", 1, 0, false);
        declareFunction("tactic_discardedP", "TACTIC-DISCARDED?", 1, 0, false);
        declareFunction("tactic_has_statusP", "TACTIC-HAS-STATUS?", 2, 0, false);
        declareFunction("abductive_tacticP", "ABDUCTIVE-TACTIC?", 1, 0, false);
        declareFunction("tactic_store", "TACTIC-STORE", 1, 0, false);
        declareFunction("tactic_problem_query", "TACTIC-PROBLEM-QUERY", 1, 0, false);
        declareFunction("tactic_problem_sole_clause", "TACTIC-PROBLEM-SOLE-CLAUSE", 1, 0, false);
        declareFunction("update_tactic_productivity", "UPDATE-TACTIC-PRODUCTIVITY", 2, 0, false);
        declareFunction("decrement_tactic_productivity_for_number_of_children", "DECREMENT-TACTIC-PRODUCTIVITY-FOR-NUMBER-OF-CHILDREN", 1, 1, false);
        declareFunction("note_tactic_executed", "NOTE-TACTIC-EXECUTED", 1, 0, false);
        declareFunction("note_tactic_discarded", "NOTE-TACTIC-DISCARDED", 1, 0, false);
        declareFunction("note_tactic_progress_iterator", "NOTE-TACTIC-PROGRESS-ITERATOR", 2, 0, false);
        declareFunction("clear_tactic_progress_iterator", "CLEAR-TACTIC-PROGRESS-ITERATOR", 1, 0, false);
        declareFunction("tactic_in_progress_next", "TACTIC-IN-PROGRESS-NEXT", 1, 0, false);
        declareFunction("possibly_update_tactic_productivity_from_iterator", "POSSIBLY-UPDATE-TACTIC-PRODUCTIVITY-FROM-ITERATOR", 2, 0, false);
        declareFunction("select_least_productive_tactic", "SELECT-LEAST-PRODUCTIVE-TACTIC", 1, 0, false);
        declareFunction("total_productivity_of_tactics", "TOTAL-PRODUCTIVITY-OF-TACTICS", 1, 0, false);
        declareFunction("total_productivity_of_problem_possible_tactics", "TOTAL-PRODUCTIVITY-OF-PROBLEM-POSSIBLE-TACTICS", 1, 0, false);
        declareFunction("min_productivity_of_problem_possible_tactics", "MIN-PRODUCTIVITY-OF-PROBLEM-POSSIBLE-TACTICS", 1, 0, false);
        declareFunction("note_tactic_most_recent_executed", "NOTE-TACTIC-MOST-RECENT-EXECUTED", 1, 0, false);
        declareFunction("problem_store_tactic_execution_count", "PROBLEM-STORE-TACTIC-EXECUTION-COUNT", 1, 0, false);
        declareFunction("tactic_execution_count", "TACTIC-EXECUTION-COUNT", 1, 0, false);
        declareFunction("tactic_progress_iterator_p", "TACTIC-PROGRESS-ITERATOR-P", 1, 0, false);
        declareFunction("new_tactic_progress_iterator", "NEW-TACTIC-PROGRESS-ITERATOR", 3, 0, false);
        declareFunction("make_tactic_progress_iterator_state", "MAKE-TACTIC-PROGRESS-ITERATOR-STATE", 3, 0, false);
        declareFunction("tactic_progress_doneP", "TACTIC-PROGRESS-DONE?", 1, 0, false);
        new inference_datastructures_tactic.$tactic_progress_doneP$UnaryFunction();
        declareFunction("tactic_progress_next", "TACTIC-PROGRESS-NEXT", 1, 0, false);
        new inference_datastructures_tactic.$tactic_progress_next$UnaryFunction();
        declareFunction("tactic_progress_finalize", "TACTIC-PROGRESS-FINALIZE", 1, 0, false);
        new inference_datastructures_tactic.$tactic_progress_finalize$UnaryFunction();
        declareFunction("finalize_tactic_progress_iterator", "FINALIZE-TACTIC-PROGRESS-ITERATOR", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt3 = list(new SubLObject[]{ makeSymbol("SUID"), makeSymbol("PROBLEM"), makeSymbol("TYPE"), makeSymbol("HL-MODULE"), makeSymbol("COMPLETENESS"), makeSymbol("PREFERENCE-LEVEL-JUSTIFICATION"), makeSymbol("PRODUCTIVITY"), makeSymbol("ORIGINAL-PRODUCTIVITY"), makeSymbol("STATUS"), makeSymbol("PROGRESS-ITERATOR"), makeSymbol("DATA") });

    static private final SubLList $list_alt4 = list(new SubLObject[]{ $SUID, makeKeyword("PROBLEM"), $TYPE, makeKeyword("HL-MODULE"), makeKeyword("COMPLETENESS"), makeKeyword("PREFERENCE-LEVEL-JUSTIFICATION"), makeKeyword("PRODUCTIVITY"), makeKeyword("ORIGINAL-PRODUCTIVITY"), makeKeyword("STATUS"), makeKeyword("PROGRESS-ITERATOR"), $DATA });

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeSymbol("TACT-SUID"), makeSymbol("TACT-PROBLEM"), makeSymbol("TACT-TYPE"), makeSymbol("TACT-HL-MODULE"), makeSymbol("TACT-COMPLETENESS"), makeSymbol("TACT-PREFERENCE-LEVEL-JUSTIFICATION"), makeSymbol("TACT-PRODUCTIVITY"), makeSymbol("TACT-ORIGINAL-PRODUCTIVITY"), makeSymbol("TACT-STATUS"), makeSymbol("TACT-PROGRESS-ITERATOR"), makeSymbol("TACT-DATA") });

    static private final SubLList $list_alt6 = list(new SubLObject[]{ makeSymbol("_CSETF-TACT-SUID"), makeSymbol("_CSETF-TACT-PROBLEM"), makeSymbol("_CSETF-TACT-TYPE"), makeSymbol("_CSETF-TACT-HL-MODULE"), makeSymbol("_CSETF-TACT-COMPLETENESS"), makeSymbol("_CSETF-TACT-PREFERENCE-LEVEL-JUSTIFICATION"), makeSymbol("_CSETF-TACT-PRODUCTIVITY"), makeSymbol("_CSETF-TACT-ORIGINAL-PRODUCTIVITY"), makeSymbol("_CSETF-TACT-STATUS"), makeSymbol("_CSETF-TACT-PROGRESS-ITERATOR"), makeSymbol("_CSETF-TACT-DATA") });

    static private final SubLString $str_alt42$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt44$_Invalid_TACTIC__s_ = makeString("<Invalid TACTIC ~s>");

    static private final SubLString $str_alt45$__a_TACTIC__a__a__a___a__a__ = makeString("<~a TACTIC ~a.~a.~a:(~a ~a)>");

    static private final SubLString $str_alt52$tactical_productivity_being_refer = makeString("tactical productivity being referenced on ~S");

    static private final SubLList $list_alt57 = list(list(makeSymbol("STRATEGY-VAR"), makeSymbol("TACTIC")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt60 = list(list(new SubLObject[]{ makeSymbol("SIBLING-TACTIC-VAR"), makeSymbol("TACTIC"), makeSymbol("&KEY"), makeSymbol("DONE"), makeSymbol("STATUS"), makeSymbol("COMPLETENESS"), makeSymbol("PREFERENCE-LEVEL"), makeSymbol("HL-MODULE"), makeSymbol("TYPE"), makeSymbol("PRODUCTIVITY") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt61 = list($DONE, makeKeyword("STATUS"), makeKeyword("COMPLETENESS"), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("HL-MODULE"), $TYPE, makeKeyword("PRODUCTIVITY"));

    static private final SubLSymbol $sym65$TACTIC_VAR = makeUninternedSymbol("TACTIC-VAR");

    private static final SubLSymbol $IN_PROGESS = makeKeyword("IN-PROGESS");

    static private final SubLSymbol $sym73$TACTIC_POSSIBLE_ = makeSymbol("TACTIC-POSSIBLE?");

    static private final SubLSymbol $sym75$_ = makeSymbol("<");

    static private final SubLSymbol $sym78$TACTIC_PROGRESS_DONE_ = makeSymbol("TACTIC-PROGRESS-DONE?");

    static private final SubLList $list_alt81 = list(makeSymbol("CURRENT"), makeSymbol("ITERATION-TYPE"), makeSymbol("TACTIC"));

    static private final SubLList $list_alt84 = list(makeSymbol("OUTPUT-ITERATOR"), makeSymbol("BINDINGS"));

    static private final SubLString $str_alt89$Time_to_implement_tactic_progress = makeString("Time to implement tactic-progress-done? for ~S");

    static private final SubLList $list_alt90 = list(makeSymbol("OUTPUT-ITERATOR"), makeSymbol("ENCODED-BINDINGS"));

    static private final SubLString $str_alt91$Time_to_implement_tactic_progress = makeString("Time to implement tactic-progress-next for ~S");

    static private final SubLString $str_alt92$Time_to_implement_tactic_progress = makeString("Time to implement tactic-progress-finalize for ~S");

    public static SubLObject init_inference_datastructures_tactic_file() {
        defvar("*LEVIATHAN-AVOID-LOGICAL-TACTIC-PRODUCTIVITY-COMPUTATION?*", NIL);
        defconstant("*DTP-TACTIC*", TACTIC);
        defparameter("*TACTIC-PRODUCTIVITY-SMOOTHING-METHOD*", NIL);
        return NIL;
    }

    public static final SubLObject setup_inference_datastructures_tactic_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_tactic$.getGlobalValue(), symbol_function(TACTIC_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(TACT_SUID, _CSETF_TACT_SUID);
        def_csetf(TACT_PROBLEM, _CSETF_TACT_PROBLEM);
        def_csetf(TACT_TYPE, _CSETF_TACT_TYPE);
        def_csetf(TACT_HL_MODULE, _CSETF_TACT_HL_MODULE);
        def_csetf(TACT_COMPLETENESS, _CSETF_TACT_COMPLETENESS);
        def_csetf(TACT_PREFERENCE_LEVEL_JUSTIFICATION, _CSETF_TACT_PREFERENCE_LEVEL_JUSTIFICATION);
        def_csetf(TACT_PRODUCTIVITY, _CSETF_TACT_PRODUCTIVITY);
        def_csetf(TACT_ORIGINAL_PRODUCTIVITY, _CSETF_TACT_ORIGINAL_PRODUCTIVITY);
        def_csetf(TACT_STATUS, _CSETF_TACT_STATUS);
        def_csetf(TACT_PROGRESS_ITERATOR, _CSETF_TACT_PROGRESS_ITERATOR);
        def_csetf(TACT_DATA, _CSETF_TACT_DATA);
        identity(TACTIC);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_tactic$.getGlobalValue(), symbol_function(SXHASH_TACTIC_METHOD));
        note_funcall_helper_function($sym78$TACTIC_PROGRESS_DONE_);
        note_funcall_helper_function(TACTIC_PROGRESS_NEXT);
        note_funcall_helper_function(TACTIC_PROGRESS_FINALIZE);
        return NIL;
    }

    public static SubLObject setup_inference_datastructures_tactic_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), inference_datastructures_tactic.$dtp_tactic$.getGlobalValue(), symbol_function(inference_datastructures_tactic.TACTIC_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(inference_datastructures_tactic.$list9);
            def_csetf(inference_datastructures_tactic.TACT_SUID, inference_datastructures_tactic._CSETF_TACT_SUID);
            def_csetf(inference_datastructures_tactic.TACT_PROBLEM, inference_datastructures_tactic._CSETF_TACT_PROBLEM);
            def_csetf(inference_datastructures_tactic.TACT_TYPE, inference_datastructures_tactic._CSETF_TACT_TYPE);
            def_csetf(inference_datastructures_tactic.TACT_HL_MODULE, inference_datastructures_tactic._CSETF_TACT_HL_MODULE);
            def_csetf(inference_datastructures_tactic.TACT_COMPLETENESS, inference_datastructures_tactic._CSETF_TACT_COMPLETENESS);
            def_csetf(inference_datastructures_tactic.TACT_PREFERENCE_LEVEL_JUSTIFICATION, inference_datastructures_tactic._CSETF_TACT_PREFERENCE_LEVEL_JUSTIFICATION);
            def_csetf(inference_datastructures_tactic.TACT_PRODUCTIVITY, inference_datastructures_tactic._CSETF_TACT_PRODUCTIVITY);
            def_csetf(inference_datastructures_tactic.TACT_ORIGINAL_PRODUCTIVITY, inference_datastructures_tactic._CSETF_TACT_ORIGINAL_PRODUCTIVITY);
            def_csetf(inference_datastructures_tactic.TACT_STATUS, inference_datastructures_tactic._CSETF_TACT_STATUS);
            def_csetf(inference_datastructures_tactic.TACT_PROGRESS_ITERATOR, inference_datastructures_tactic._CSETF_TACT_PROGRESS_ITERATOR);
            def_csetf(inference_datastructures_tactic.TACT_DATA, inference_datastructures_tactic._CSETF_TACT_DATA);
            def_csetf(inference_datastructures_tactic.TACT_PROPERTIES, inference_datastructures_tactic._CSETF_TACT_PROPERTIES);
            identity(TACTIC);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), inference_datastructures_tactic.$dtp_tactic$.getGlobalValue(), symbol_function(inference_datastructures_tactic.VISIT_DEFSTRUCT_OBJECT_TACTIC_METHOD));
            register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), inference_datastructures_tactic.$dtp_tactic$.getGlobalValue(), symbol_function(inference_datastructures_tactic.SXHASH_TACTIC_METHOD));
            note_funcall_helper_function(inference_datastructures_tactic.$sym91$TACTIC_PROGRESS_DONE_);
            note_funcall_helper_function(inference_datastructures_tactic.TACTIC_PROGRESS_NEXT);
            note_funcall_helper_function(inference_datastructures_tactic.TACTIC_PROGRESS_FINALIZE);
        }
        if (SubLFiles.USE_V2) {
            note_funcall_helper_function($sym78$TACTIC_PROGRESS_DONE_);
        }
        return NIL;
    }

    public static SubLObject setup_inference_datastructures_tactic_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), inference_datastructures_tactic.$dtp_tactic$.getGlobalValue(), symbol_function(inference_datastructures_tactic.TACTIC_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(inference_datastructures_tactic.$list9);
        def_csetf(inference_datastructures_tactic.TACT_SUID, inference_datastructures_tactic._CSETF_TACT_SUID);
        def_csetf(inference_datastructures_tactic.TACT_PROBLEM, inference_datastructures_tactic._CSETF_TACT_PROBLEM);
        def_csetf(inference_datastructures_tactic.TACT_TYPE, inference_datastructures_tactic._CSETF_TACT_TYPE);
        def_csetf(inference_datastructures_tactic.TACT_HL_MODULE, inference_datastructures_tactic._CSETF_TACT_HL_MODULE);
        def_csetf(inference_datastructures_tactic.TACT_COMPLETENESS, inference_datastructures_tactic._CSETF_TACT_COMPLETENESS);
        def_csetf(inference_datastructures_tactic.TACT_PREFERENCE_LEVEL_JUSTIFICATION, inference_datastructures_tactic._CSETF_TACT_PREFERENCE_LEVEL_JUSTIFICATION);
        def_csetf(inference_datastructures_tactic.TACT_PRODUCTIVITY, inference_datastructures_tactic._CSETF_TACT_PRODUCTIVITY);
        def_csetf(inference_datastructures_tactic.TACT_ORIGINAL_PRODUCTIVITY, inference_datastructures_tactic._CSETF_TACT_ORIGINAL_PRODUCTIVITY);
        def_csetf(inference_datastructures_tactic.TACT_STATUS, inference_datastructures_tactic._CSETF_TACT_STATUS);
        def_csetf(inference_datastructures_tactic.TACT_PROGRESS_ITERATOR, inference_datastructures_tactic._CSETF_TACT_PROGRESS_ITERATOR);
        def_csetf(inference_datastructures_tactic.TACT_DATA, inference_datastructures_tactic._CSETF_TACT_DATA);
        def_csetf(inference_datastructures_tactic.TACT_PROPERTIES, inference_datastructures_tactic._CSETF_TACT_PROPERTIES);
        identity(TACTIC);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), inference_datastructures_tactic.$dtp_tactic$.getGlobalValue(), symbol_function(inference_datastructures_tactic.VISIT_DEFSTRUCT_OBJECT_TACTIC_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), inference_datastructures_tactic.$dtp_tactic$.getGlobalValue(), symbol_function(inference_datastructures_tactic.SXHASH_TACTIC_METHOD));
        note_funcall_helper_function(inference_datastructures_tactic.$sym91$TACTIC_PROGRESS_DONE_);
        note_funcall_helper_function(inference_datastructures_tactic.TACTIC_PROGRESS_NEXT);
        note_funcall_helper_function(inference_datastructures_tactic.TACTIC_PROGRESS_FINALIZE);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        inference_datastructures_tactic.declare_inference_datastructures_tactic_file();
    }

    @Override
    public void initializeVariables() {
        inference_datastructures_tactic.init_inference_datastructures_tactic_file();
    }

    @Override
    public void runTopLevelForms() {
        inference_datastructures_tactic.setup_inference_datastructures_tactic_file();
    }

    static {
    }

    public static final class $tactic_native extends SubLStructNative {
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
            inference_datastructures_tactic.$tactic_native.this.$suid = Lisp.NIL;
            inference_datastructures_tactic.$tactic_native.this.$problem = Lisp.NIL;
            inference_datastructures_tactic.$tactic_native.this.$type = Lisp.NIL;
            inference_datastructures_tactic.$tactic_native.this.$hl_module = Lisp.NIL;
            inference_datastructures_tactic.$tactic_native.this.$completeness = Lisp.NIL;
            inference_datastructures_tactic.$tactic_native.this.$preference_level_justification = Lisp.NIL;
            inference_datastructures_tactic.$tactic_native.this.$productivity = Lisp.NIL;
            inference_datastructures_tactic.$tactic_native.this.$original_productivity = Lisp.NIL;
            inference_datastructures_tactic.$tactic_native.this.$status = Lisp.NIL;
            inference_datastructures_tactic.$tactic_native.this.$progress_iterator = Lisp.NIL;
            inference_datastructures_tactic.$tactic_native.this.$data = Lisp.NIL;
            inference_datastructures_tactic.$tactic_native.this.$properties = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return inference_datastructures_tactic.$tactic_native.this.$suid;
        }

        @Override
        public SubLObject getField3() {
            return inference_datastructures_tactic.$tactic_native.this.$problem;
        }

        @Override
        public SubLObject getField4() {
            return inference_datastructures_tactic.$tactic_native.this.$type;
        }

        @Override
        public SubLObject getField5() {
            return inference_datastructures_tactic.$tactic_native.this.$hl_module;
        }

        @Override
        public SubLObject getField6() {
            return inference_datastructures_tactic.$tactic_native.this.$completeness;
        }

        @Override
        public SubLObject getField7() {
            return inference_datastructures_tactic.$tactic_native.this.$preference_level_justification;
        }

        @Override
        public SubLObject getField8() {
            return inference_datastructures_tactic.$tactic_native.this.$productivity;
        }

        @Override
        public SubLObject getField9() {
            return inference_datastructures_tactic.$tactic_native.this.$original_productivity;
        }

        @Override
        public SubLObject getField10() {
            return inference_datastructures_tactic.$tactic_native.this.$status;
        }

        @Override
        public SubLObject getField11() {
            return inference_datastructures_tactic.$tactic_native.this.$progress_iterator;
        }

        @Override
        public SubLObject getField12() {
            return inference_datastructures_tactic.$tactic_native.this.$data;
        }

        @Override
        public SubLObject getField13() {
            return inference_datastructures_tactic.$tactic_native.this.$properties;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return inference_datastructures_tactic.$tactic_native.this.$suid = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return inference_datastructures_tactic.$tactic_native.this.$problem = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return inference_datastructures_tactic.$tactic_native.this.$type = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return inference_datastructures_tactic.$tactic_native.this.$hl_module = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return inference_datastructures_tactic.$tactic_native.this.$completeness = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return inference_datastructures_tactic.$tactic_native.this.$preference_level_justification = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return inference_datastructures_tactic.$tactic_native.this.$productivity = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return inference_datastructures_tactic.$tactic_native.this.$original_productivity = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return inference_datastructures_tactic.$tactic_native.this.$status = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return inference_datastructures_tactic.$tactic_native.this.$progress_iterator = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return inference_datastructures_tactic.$tactic_native.this.$data = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return inference_datastructures_tactic.$tactic_native.this.$properties = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic.$tactic_native.class, TACTIC, TACTIC_P, inference_datastructures_tactic.$list3, inference_datastructures_tactic.$list4, new String[]{ "$suid", "$problem", "$type", "$hl_module", "$completeness", "$preference_level_justification", "$productivity", "$original_productivity", "$status", "$progress_iterator", "$data", "$properties" }, inference_datastructures_tactic.$list5, inference_datastructures_tactic.$list6, inference_datastructures_tactic.PRINT_TACTIC);
        }
    }

    public static final class $tactic_p$UnaryFunction extends UnaryFunction {
        public $tactic_p$UnaryFunction() {
            super(extractFunctionNamed("TACTIC-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_tactic.tactic_p(arg1);
        }
    }

    public static final class $sxhash_tactic_method$UnaryFunction extends UnaryFunction {
        public $sxhash_tactic_method$UnaryFunction() {
            super(extractFunctionNamed("SXHASH-TACTIC-METHOD"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_tactic.sxhash_tactic_method(arg1);
        }
    }

    public static final class $tactic_possibleP$UnaryFunction extends UnaryFunction {
        public $tactic_possibleP$UnaryFunction() {
            super(extractFunctionNamed("TACTIC-POSSIBLE?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_tactic.tactic_possibleP(arg1);
        }
    }

    public static final class $tactic_progress_doneP$UnaryFunction extends UnaryFunction {
        public $tactic_progress_doneP$UnaryFunction() {
            super(extractFunctionNamed("TACTIC-PROGRESS-DONE?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_tactic.tactic_progress_doneP(arg1);
        }
    }

    public static final class $tactic_progress_next$UnaryFunction extends UnaryFunction {
        public $tactic_progress_next$UnaryFunction() {
            super(extractFunctionNamed("TACTIC-PROGRESS-NEXT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_tactic.tactic_progress_next(arg1);
        }
    }

    public static final class $tactic_progress_finalize$UnaryFunction extends UnaryFunction {
        public $tactic_progress_finalize$UnaryFunction() {
            super(extractFunctionNamed("TACTIC-PROGRESS-FINALIZE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_tactic.tactic_progress_finalize(arg1);
        }
    }
}

/**
 * Total time: 429 ms synthetic
 */
