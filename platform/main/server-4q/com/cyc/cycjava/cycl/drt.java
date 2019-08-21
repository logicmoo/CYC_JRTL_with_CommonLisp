package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.drt;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.drt.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class drt extends SubLTranslatedFile {
    public static final SubLFile me = new drt();

    public static final String myName = "com.cyc.cycjava.cycl.drt";

    public static final String myFingerPrint = "2690ac962e6aac2ae1bab3b6761c6f1f388be248bd63481dca1aea0d67313975";

    // defparameter
    // Definitions
    public static final SubLSymbol $drt_drs_list$ = makeSymbol("*DRT-DRS-LIST*");

    // defparameter
    /**
     * The hash table of the mappings between reference markers. Both keys and
     * values will be RM instances. Mapping are added with the map-rm function and
     * retrieved with real-rm.
     */
    public static final SubLSymbol $drt_coreferences$ = makeSymbol("*DRT-COREFERENCES*");

    // defparameter
    /**
     * The hash table where the key is a cycl term for the speaker and the value is
     * the last DRS for which that speaker was the speaker or the audience.
     */
    public static final SubLSymbol $drt_last_drs_for_speaker$ = makeSymbol("*DRT-LAST-DRS-FOR-SPEAKER*");



    // defparameter
    // The stream trace information will be printed to.
    public static final SubLSymbol $drt_trace_stream$ = makeSymbol("*DRT-TRACE-STREAM*");



    public static final SubLList $list1 = list(makeSymbol("FORMAT-STRING"), makeSymbol("&REST"), makeSymbol("ARGS"));



    public static final SubLList $list3 = list(makeSymbol(">="), makeSymbol("*DRT-TRACE-LEVEL*"), ONE_INTEGER);



    public static final SubLList $list5 = list(makeSymbol("LEVEL"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list7 = list(makeSymbol("CNOT"), list(makeSymbol("NUMBERP"), makeSymbol("*DRT-TRACE-LEVEL*")));

    public static final SubLSymbol $sym8$__ = makeSymbol(">=");

    public static final SubLSymbol $drt_trace_level$ = makeSymbol("*DRT-TRACE-LEVEL*");

    public static final SubLList $list10 = list(makeSymbol("LEVEL"), makeSymbol("&REST"), makeSymbol("OPTIONS"));

    public static final SubLSymbol DRT_TRACER_OUTPUT = makeSymbol("DRT-TRACER-OUTPUT");







    public static final SubLSymbol CONSTRUCT_CYCL = makeSymbol("CONSTRUCT-CYCL");

    public static final SubLString $str16$Discourse_Representation_Theory_T = makeString("Discourse Representation Theory Test Category");

    public static final SubLString $str17$Discourse_Representation_Theory_T = makeString("Discourse Representation Theory Test Suite");

    public static final SubLList $list18 = list(makeString("Discourse Representation Theory Test Category"));

    public static final SubLList $list19 = list(list(makeString("drt"), makeString("cycl")), list(makeString("drt-rm"), makeString("cycl")), list(makeString("drt-drs"), makeString("cycl")));

    public static SubLObject clear_drt_coreferences() {
        $drt_coreferences$.setDynamicValue(make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject drt_get_coreference(final SubLObject rm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return gethash(rm, $drt_coreferences$.getDynamicValue(thread), UNPROVIDED);
    }

    public static SubLObject drt_set_coreference(final SubLObject rm, final SubLObject target_rm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sethash(rm, $drt_coreferences$.getDynamicValue(thread), target_rm);
    }

    public static SubLObject clear_drt_last_drs_for_speaker() {
        $drt_last_drs_for_speaker$.setDynamicValue(make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject drt_get_last_drs_for_speaker(final SubLObject speaker) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return gethash(speaker, $drt_last_drs_for_speaker$.getDynamicValue(thread), UNPROVIDED);
    }

    public static SubLObject drt_set_last_drs_for_speaker(final SubLObject speaker, final SubLObject drs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sethash(speaker, $drt_last_drs_for_speaker$.getDynamicValue(thread), drs);
    }

    public static SubLObject drt_initialize() {
        $drt_drs_list$.setDynamicValue(NIL);
        clear_drt_coreferences();
        clear_drt_last_drs_for_speaker();
        return NIL;
    }

    public static SubLObject drt_warn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject format_string = NIL;
        destructuring_bind_must_consp(current, datum, $list1);
        format_string = current.first();
        final SubLObject args;
        current = args = current.rest();
        return list(PWHEN, $list3, listS(WARN, format_string, append(args, NIL)));
    }

    public static SubLObject drt_trace_progn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject level = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        level = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(PWHEN, list(COR, $list7, list($sym8$__, $drt_trace_level$, level)), append(body, NIL));
    }

    public static SubLObject drt_trace_out(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject level = NIL;
        destructuring_bind_must_consp(current, datum, $list10);
        level = current.first();
        final SubLObject options;
        current = options = current.rest();
        return list(PWHEN, list(COR, $list7, list($sym8$__, $drt_trace_level$, level)), list(DRT_TRACER_OUTPUT, level, bq_cons(LIST, append(options, NIL))));
    }

    public static SubLObject drt_tracer_output(final SubLObject level, final SubLObject format_control) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        apply(symbol_function(FORMAT), cons($drt_trace_stream$.getDynamicValue(thread), format_control));
        return $drt_trace_level$.getDynamicValue(thread);
    }

    public static SubLObject drt_trace(SubLObject level) {
        if (level == UNPROVIDED) {
            level = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        $drt_trace_level$.setDynamicValue(level, thread);
        return $drt_trace_level$.getDynamicValue(thread);
    }

    public static SubLObject drt_map_best_coreferences(final SubLObject possible_coreferences) {
        SubLObject cdolist_list_var = possible_coreferences;
        SubLObject possible_coreference = NIL;
        possible_coreference = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject source_rm = drt_drs.possible_rm_coreference_source_rm(possible_coreference);
            final SubLObject possible_coreference_targets = drt_drs.possible_rm_coreference_targets(possible_coreference);
            SubLObject chosen_target_probability = NIL;
            SubLObject chosen_target_rm = NIL;
            SubLObject cdolist_list_var_$1 = possible_coreference_targets;
            SubLObject possible_coreference_target = NIL;
            possible_coreference_target = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                final SubLObject target_rm = drt_drs.possible_rm_coreference_target_rm(possible_coreference_target);
                final SubLObject target_probability = drt_drs.possible_rm_coreference_target_probability(possible_coreference_target);
                if (NIL == chosen_target_rm) {
                    chosen_target_rm = target_rm;
                    chosen_target_probability = target_probability;
                } else
                    if (target_probability.numG(chosen_target_probability)) {
                        chosen_target_rm = target_rm;
                        chosen_target_probability = target_probability;
                    }

                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                possible_coreference_target = cdolist_list_var_$1.first();
            } 
            if (NIL != chosen_target_rm) {
                drt_rm.map_rm(source_rm, chosen_target_rm);
            }
            cdolist_list_var = cdolist_list_var.rest();
            possible_coreference = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject drt_best_guess(final SubLObject formula, final SubLObject interaction_mt, final SubLObject parsing_mt, SubLObject speaker, SubLObject audience) {
        if (speaker == UNPROVIDED) {
            speaker = NIL;
        }
        if (audience == UNPROVIDED) {
            audience = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject drs = drt_drs.create_drs_from_formula(formula, interaction_mt, parsing_mt, speaker, audience);
        final SubLObject possible_coreferences = methods.funcall_instance_method_with_0_args(drs, PROCESS);
        SubLObject result_cycl = NIL;
        if (possible_coreferences == T) {
            result_cycl = T;
        } else {
            drt_map_best_coreferences(possible_coreferences);
            result_cycl = methods.funcall_instance_method_with_0_args(drs, CONSTRUCT_CYCL);
        }
        if (result_cycl.isList()) {
            thread.resetMultipleValues();
            final SubLObject v_object = list_utilities.tree_find(NIL, result_cycl, UNPROVIDED, UNPROVIDED);
            final SubLObject foundP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != foundP) {
                result_cycl = T;
            }
        }
        return result_cycl;
    }

    public static SubLObject declare_drt_file() {
        declareFunction(me, "clear_drt_coreferences", "CLEAR-DRT-COREFERENCES", 0, 0, false);
        declareFunction(me, "drt_get_coreference", "DRT-GET-COREFERENCE", 1, 0, false);
        declareFunction(me, "drt_set_coreference", "DRT-SET-COREFERENCE", 2, 0, false);
        declareFunction(me, "clear_drt_last_drs_for_speaker", "CLEAR-DRT-LAST-DRS-FOR-SPEAKER", 0, 0, false);
        declareFunction(me, "drt_get_last_drs_for_speaker", "DRT-GET-LAST-DRS-FOR-SPEAKER", 1, 0, false);
        declareFunction(me, "drt_set_last_drs_for_speaker", "DRT-SET-LAST-DRS-FOR-SPEAKER", 2, 0, false);
        declareFunction(me, "drt_initialize", "DRT-INITIALIZE", 0, 0, false);
        declareMacro(me, "drt_warn", "DRT-WARN");
        declareMacro(me, "drt_trace_progn", "DRT-TRACE-PROGN");
        declareMacro(me, "drt_trace_out", "DRT-TRACE-OUT");
        declareFunction(me, "drt_tracer_output", "DRT-TRACER-OUTPUT", 2, 0, false);
        declareFunction(me, "drt_trace", "DRT-TRACE", 0, 1, false);
        declareFunction(me, "drt_map_best_coreferences", "DRT-MAP-BEST-COREFERENCES", 1, 0, false);
        declareFunction(me, "drt_best_guess", "DRT-BEST-GUESS", 3, 2, false);
        return NIL;
    }

    public static SubLObject init_drt_file() {
        defparameter("*DRT-DRS-LIST*", NIL);
        defparameter("*DRT-COREFERENCES*", make_hash_table($int$100, UNPROVIDED, UNPROVIDED));
        defparameter("*DRT-LAST-DRS-FOR-SPEAKER*", make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*DRT-TRACE-LEVEL*", ZERO_INTEGER);
        defparameter("*DRT-TRACE-STREAM*", T);
        return NIL;
    }

    public static SubLObject setup_drt_file() {
        sunit_external.define_test_category($str16$Discourse_Representation_Theory_T, UNPROVIDED);
        sunit_external.define_test_suite($str17$Discourse_Representation_Theory_T, $list18, $list19, UNPROVIDED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_drt_file();
    }

    @Override
    public void initializeVariables() {
        init_drt_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_drt_file();
    }

    static {


























    }
}

/**
 * Total time: 88 ms
 */
