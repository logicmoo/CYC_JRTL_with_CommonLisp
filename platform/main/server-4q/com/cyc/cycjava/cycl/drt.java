/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      DRT
 * source file: /cyc/top/cycl/drt.lisp
 * created:     2019/07/03 17:37:55
 */
public final class drt extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new drt();

 public static final String myName = "com.cyc.cycjava.cycl.drt";


    // defparameter
    // Definitions
    @LispMethod(comment = "The list of all DRS\'s constructed.\ndefparameter")
    /**
     * The list of all DRS's constructed.
     */
    public static final SubLSymbol $drt_drs_list$ = makeSymbol("*DRT-DRS-LIST*");

    // defparameter
    /**
     * The hash table of the mappings between reference markers. Both keys and
     * values will be RM instances. Mapping are added with the map-rm function and
     * retrieved with real-rm.
     */
    @LispMethod(comment = "The hash table of the mappings between reference markers. Both keys and\r\nvalues will be RM instances. Mapping are added with the map-rm function and\r\nretrieved with real-rm.\ndefparameter\nThe hash table of the mappings between reference markers. Both keys and\nvalues will be RM instances. Mapping are added with the map-rm function and\nretrieved with real-rm.")
    public static final SubLSymbol $drt_coreferences$ = makeSymbol("*DRT-COREFERENCES*");

    // defparameter
    /**
     * The hash table where the key is a cycl term for the speaker and the value is
     * the last DRS for which that speaker was the speaker or the audience.
     */
    @LispMethod(comment = "The hash table where the key is a cycl term for the speaker and the value is\r\nthe last DRS for which that speaker was the speaker or the audience.\ndefparameter\nThe hash table where the key is a cycl term for the speaker and the value is\nthe last DRS for which that speaker was the speaker or the audience.")
    public static final SubLSymbol $drt_last_drs_for_speaker$ = makeSymbol("*DRT-LAST-DRS-FOR-SPEAKER*");

    // defparameter
    // The stream trace information will be printed to.
    /**
     * The stream trace information will be printed to.
     */
    @LispMethod(comment = "The stream trace information will be printed to.\ndefparameter")
    public static final SubLSymbol $drt_trace_stream$ = makeSymbol("*DRT-TRACE-STREAM*");

    static private final SubLList $list1 = list(makeSymbol("FORMAT-STRING"), makeSymbol("&REST"), makeSymbol("ARGS"));

    static private final SubLList $list3 = list(makeSymbol(">="), makeSymbol("*DRT-TRACE-LEVEL*"), ONE_INTEGER);

    static private final SubLList $list5 = list(makeSymbol("LEVEL"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list7 = list(makeSymbol("CNOT"), list(makeSymbol("NUMBERP"), makeSymbol("*DRT-TRACE-LEVEL*")));

    static private final SubLSymbol $sym8$__ = makeSymbol(">=");

    public static final SubLSymbol $drt_trace_level$ = makeSymbol("*DRT-TRACE-LEVEL*");

    static private final SubLList $list10 = list(makeSymbol("LEVEL"), makeSymbol("&REST"), makeSymbol("OPTIONS"));

    private static final SubLSymbol DRT_TRACER_OUTPUT = makeSymbol("DRT-TRACER-OUTPUT");

    private static final SubLSymbol CONSTRUCT_CYCL = makeSymbol("CONSTRUCT-CYCL");

    static private final SubLString $str16$Discourse_Representation_Theory_T = makeString("Discourse Representation Theory Test Category");

    static private final SubLString $str17$Discourse_Representation_Theory_T = makeString("Discourse Representation Theory Test Suite");

    static private final SubLList $list18 = list(makeString("Discourse Representation Theory Test Category"));

    static private final SubLList $list19 = list(list(makeString("drt"), makeString("cycl")), list(makeString("drt-rm"), makeString("cycl")), list(makeString("drt-drs"), makeString("cycl")));

    /**
     * Clears the global coreference table.
     */
    @LispMethod(comment = "Clears the global coreference table.")
    public static final SubLObject clear_drt_coreferences_alt() {
        $drt_coreferences$.setDynamicValue(make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    /**
     * Clears the global coreference table.
     */
    @LispMethod(comment = "Clears the global coreference table.")
    public static SubLObject clear_drt_coreferences() {
        $drt_coreferences$.setDynamicValue(make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    /**
     * Gets the coreference for a RM.
     */
    @LispMethod(comment = "Gets the coreference for a RM.")
    public static final SubLObject drt_get_coreference_alt(SubLObject rm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return gethash(rm, $drt_coreferences$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    /**
     * Gets the coreference for a RM.
     */
    @LispMethod(comment = "Gets the coreference for a RM.")
    public static SubLObject drt_get_coreference(final SubLObject rm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return gethash(rm, $drt_coreferences$.getDynamicValue(thread), UNPROVIDED);
    }

    /**
     * Sets the coreference TARGET-RM for a RM.
     */
    @LispMethod(comment = "Sets the coreference TARGET-RM for a RM.")
    public static final SubLObject drt_set_coreference_alt(SubLObject rm, SubLObject target_rm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return sethash(rm, $drt_coreferences$.getDynamicValue(thread), target_rm);
        }
    }

    /**
     * Sets the coreference TARGET-RM for a RM.
     */
    @LispMethod(comment = "Sets the coreference TARGET-RM for a RM.")
    public static SubLObject drt_set_coreference(final SubLObject rm, final SubLObject target_rm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sethash(rm, $drt_coreferences$.getDynamicValue(thread), target_rm);
    }

    /**
     * Clears the last drs for speaker table.
     */
    @LispMethod(comment = "Clears the last drs for speaker table.")
    public static final SubLObject clear_drt_last_drs_for_speaker_alt() {
        $drt_last_drs_for_speaker$.setDynamicValue(make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    /**
     * Clears the last drs for speaker table.
     */
    @LispMethod(comment = "Clears the last drs for speaker table.")
    public static SubLObject clear_drt_last_drs_for_speaker() {
        $drt_last_drs_for_speaker$.setDynamicValue(make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    /**
     * Gets the last drs for SPEAKER.
     */
    @LispMethod(comment = "Gets the last drs for SPEAKER.")
    public static final SubLObject drt_get_last_drs_for_speaker_alt(SubLObject speaker) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return gethash(speaker, $drt_last_drs_for_speaker$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    /**
     * Gets the last drs for SPEAKER.
     */
    @LispMethod(comment = "Gets the last drs for SPEAKER.")
    public static SubLObject drt_get_last_drs_for_speaker(final SubLObject speaker) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return gethash(speaker, $drt_last_drs_for_speaker$.getDynamicValue(thread), UNPROVIDED);
    }

    /**
     * Sets the last DRS for SPEAKER.
     */
    @LispMethod(comment = "Sets the last DRS for SPEAKER.")
    public static final SubLObject drt_set_last_drs_for_speaker_alt(SubLObject speaker, SubLObject drs) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return sethash(speaker, $drt_last_drs_for_speaker$.getDynamicValue(thread), drs);
        }
    }

    /**
     * Sets the last DRS for SPEAKER.
     */
    @LispMethod(comment = "Sets the last DRS for SPEAKER.")
    public static SubLObject drt_set_last_drs_for_speaker(final SubLObject speaker, final SubLObject drs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sethash(speaker, $drt_last_drs_for_speaker$.getDynamicValue(thread), drs);
    }

    /**
     * Initializes a clean DRT state.
     */
    @LispMethod(comment = "Initializes a clean DRT state.")
    public static final SubLObject drt_initialize_alt() {
        $drt_drs_list$.setDynamicValue(NIL);
        com.cyc.cycjava.cycl.drt.clear_drt_coreferences();
        com.cyc.cycjava.cycl.drt.clear_drt_last_drs_for_speaker();
        return NIL;
    }

    /**
     * Initializes a clean DRT state.
     */
    @LispMethod(comment = "Initializes a clean DRT state.")
    public static SubLObject drt_initialize() {
        $drt_drs_list$.setDynamicValue(NIL);
        clear_drt_coreferences();
        clear_drt_last_drs_for_speaker();
        return NIL;
    }

    public static final SubLObject drt_warn_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject format_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt1);
            format_string = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return list(PWHEN, $list_alt3, listS(WARN, format_string, append(args, NIL)));
            }
        }
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

    public static final SubLObject drt_trace_progn_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject level = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            level = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(PWHEN, list(COR, $list_alt7, list($sym8$__, $drt_trace_level$, level)), append(body, NIL));
            }
        }
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

    /**
     * Sends a message to the user if LEVEL is <= *DRT-TRACE-LEVEL*
     */
    @LispMethod(comment = "Sends a message to the user if LEVEL is <= *DRT-TRACE-LEVEL*")
    public static final SubLObject drt_trace_out_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject level = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt10);
            level = current.first();
            current = current.rest();
            {
                SubLObject options = current;
                return list(PWHEN, list(COR, $list_alt7, list($sym8$__, $drt_trace_level$, level)), list(DRT_TRACER_OUTPUT, level, bq_cons(LIST, append(options, NIL))));
            }
        }
    }

    @LispMethod(comment = "Sends a message to the user if LEVEL is <= *DRT-TRACE-LEVEL*")
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

    /**
     *
     *
     * @param LEVEL
     * 		integer; the trace level required for TRACE-OUTPUT to be sent to user
     * @param TRACE-OUTPUT
     * 		string; the string to be show to the user
     * @return string; the output
     */
    @LispMethod(comment = "@param LEVEL\r\n\t\tinteger; the trace level required for TRACE-OUTPUT to be sent to user\r\n@param TRACE-OUTPUT\r\n\t\tstring; the string to be show to the user\r\n@return string; the output")
    public static final SubLObject drt_tracer_output_alt(SubLObject level, SubLObject format_control) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            apply(symbol_function(FORMAT), cons($drt_trace_stream$.getDynamicValue(thread), format_control));
            return $drt_trace_level$.getDynamicValue(thread);
        }
    }

    /**
     *
     *
     * @param LEVEL
     * 		integer; the trace level required for TRACE-OUTPUT to be sent to user
     * @param TRACE-OUTPUT
     * 		string; the string to be show to the user
     * @return string; the output
     */
    @LispMethod(comment = "@param LEVEL\r\n\t\tinteger; the trace level required for TRACE-OUTPUT to be sent to user\r\n@param TRACE-OUTPUT\r\n\t\tstring; the string to be show to the user\r\n@return string; the output")
    public static SubLObject drt_tracer_output(final SubLObject level, final SubLObject format_control) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        apply(symbol_function(FORMAT), cons($drt_trace_stream$.getDynamicValue(thread), format_control));
        return $drt_trace_level$.getDynamicValue(thread);
    }

    /**
     *
     *
     * @param LEVEL
    integer
     * 		
     * @return integer; the present drt trace-level
     */
    @LispMethod(comment = "@param LEVEL\ninteger\r\n\t\t\r\n@return integer; the present drt trace-level")
    public static final SubLObject drt_trace_alt(SubLObject level) {
        if (level == UNPROVIDED) {
            level = ZERO_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $drt_trace_level$.setDynamicValue(level, thread);
            return $drt_trace_level$.getDynamicValue(thread);
        }
    }

    /**
     *
     *
     * @param LEVEL
    integer
     * 		
     * @return integer; the present drt trace-level
     */
    @LispMethod(comment = "@param LEVEL\ninteger\r\n\t\t\r\n@return integer; the present drt trace-level")
    public static SubLObject drt_trace(SubLObject level) {
        if (level == UNPROVIDED) {
            level = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        $drt_trace_level$.setDynamicValue(level, thread);
        return $drt_trace_level$.getDynamicValue(thread);
    }

    /**
     * Given a list of possible coreferences (the result of a drs-construct-cycl-method call), maps each rm to the best option in the sets of possible rms.
     */
    @LispMethod(comment = "Given a list of possible coreferences (the result of a drs-construct-cycl-method call), maps each rm to the best option in the sets of possible rms.")
    public static final SubLObject drt_map_best_coreferences_alt(SubLObject possible_coreferences) {
        {
            SubLObject cdolist_list_var = possible_coreferences;
            SubLObject possible_coreference = NIL;
            for (possible_coreference = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , possible_coreference = cdolist_list_var.first()) {
                {
                    SubLObject source_rm = drt_drs.possible_rm_coreference_source_rm(possible_coreference);
                    SubLObject possible_coreference_targets = drt_drs.possible_rm_coreference_targets(possible_coreference);
                    SubLObject chosen_target_probability = NIL;
                    SubLObject chosen_target_rm = NIL;
                    SubLObject cdolist_list_var_1 = possible_coreference_targets;
                    SubLObject possible_coreference_target = NIL;
                    for (possible_coreference_target = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , possible_coreference_target = cdolist_list_var_1.first()) {
                        {
                            SubLObject target_rm = drt_drs.possible_rm_coreference_target_rm(possible_coreference_target);
                            SubLObject target_probability = drt_drs.possible_rm_coreference_target_probability(possible_coreference_target);
                            if (NIL == chosen_target_rm) {
                                chosen_target_rm = target_rm;
                                chosen_target_probability = target_probability;
                            } else {
                                if (target_probability.numG(chosen_target_probability)) {
                                    chosen_target_rm = target_rm;
                                    chosen_target_probability = target_probability;
                                }
                            }
                        }
                    }
                    if (NIL != chosen_target_rm) {
                        drt_rm.map_rm(source_rm, chosen_target_rm);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Given a list of possible coreferences (the result of a drs-construct-cycl-method call), maps each rm to the best option in the sets of possible rms.
     */
    @LispMethod(comment = "Given a list of possible coreferences (the result of a drs-construct-cycl-method call), maps each rm to the best option in the sets of possible rms.")
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

    /**
     * Given a formula containing intermediate vocab (ie. NL implementation constants), use DRT w/o any user interaction to find the best possible CycL formula.
     */
    @LispMethod(comment = "Given a formula containing intermediate vocab (ie. NL implementation constants), use DRT w/o any user interaction to find the best possible CycL formula.")
    public static final SubLObject drt_best_guess_alt(SubLObject formula, SubLObject interaction_mt, SubLObject parsing_mt, SubLObject speaker, SubLObject audience) {
        if (speaker == UNPROVIDED) {
            speaker = NIL;
        }
        if (audience == UNPROVIDED) {
            audience = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject drs = drt_drs.create_drs_from_formula(formula, interaction_mt, parsing_mt, speaker, audience);
                SubLObject possible_coreferences = methods.funcall_instance_method_with_0_args(drs, PROCESS);
                SubLObject result_cycl = NIL;
                if (possible_coreferences == T) {
                    result_cycl = T;
                } else {
                    com.cyc.cycjava.cycl.drt.drt_map_best_coreferences(possible_coreferences);
                    result_cycl = methods.funcall_instance_method_with_0_args(drs, CONSTRUCT_CYCL);
                }
                if (result_cycl.isList()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_object = list_utilities.tree_find(NIL, result_cycl, UNPROVIDED, UNPROVIDED);
                        SubLObject foundP = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != foundP) {
                            result_cycl = T;
                        }
                    }
                }
                return result_cycl;
            }
        }
    }

    /**
     * Given a formula containing intermediate vocab (ie. NL implementation constants), use DRT w/o any user interaction to find the best possible CycL formula.
     */
    @LispMethod(comment = "Given a formula containing intermediate vocab (ie. NL implementation constants), use DRT w/o any user interaction to find the best possible CycL formula.")
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
        declareFunction("clear_drt_coreferences", "CLEAR-DRT-COREFERENCES", 0, 0, false);
        declareFunction("drt_get_coreference", "DRT-GET-COREFERENCE", 1, 0, false);
        declareFunction("drt_set_coreference", "DRT-SET-COREFERENCE", 2, 0, false);
        declareFunction("clear_drt_last_drs_for_speaker", "CLEAR-DRT-LAST-DRS-FOR-SPEAKER", 0, 0, false);
        declareFunction("drt_get_last_drs_for_speaker", "DRT-GET-LAST-DRS-FOR-SPEAKER", 1, 0, false);
        declareFunction("drt_set_last_drs_for_speaker", "DRT-SET-LAST-DRS-FOR-SPEAKER", 2, 0, false);
        declareFunction("drt_initialize", "DRT-INITIALIZE", 0, 0, false);
        declareMacro("drt_warn", "DRT-WARN");
        declareMacro("drt_trace_progn", "DRT-TRACE-PROGN");
        declareMacro("drt_trace_out", "DRT-TRACE-OUT");
        declareFunction("drt_tracer_output", "DRT-TRACER-OUTPUT", 2, 0, false);
        declareFunction("drt_trace", "DRT-TRACE", 0, 1, false);
        declareFunction("drt_map_best_coreferences", "DRT-MAP-BEST-COREFERENCES", 1, 0, false);
        declareFunction("drt_best_guess", "DRT-BEST-GUESS", 3, 2, false);
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

    static private final SubLList $list_alt1 = list(makeSymbol("FORMAT-STRING"), makeSymbol("&REST"), makeSymbol("ARGS"));

    static private final SubLList $list_alt3 = list(makeSymbol(">="), makeSymbol("*DRT-TRACE-LEVEL*"), ONE_INTEGER);

    static private final SubLList $list_alt5 = list(makeSymbol("LEVEL"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt7 = list(makeSymbol("CNOT"), list(makeSymbol("NUMBERP"), makeSymbol("*DRT-TRACE-LEVEL*")));

    static private final SubLList $list_alt10 = list(makeSymbol("LEVEL"), makeSymbol("&REST"), makeSymbol("OPTIONS"));

    static private final SubLString $str_alt16$Discourse_Representation_Theory_T = makeString("Discourse Representation Theory Test Category");

    static private final SubLString $str_alt17$Discourse_Representation_Theory_T = makeString("Discourse Representation Theory Test Suite");

    static private final SubLList $list_alt18 = list(makeString("Discourse Representation Theory Test Category"));

    static private final SubLList $list_alt19 = list(list(makeString("drt"), makeString("cycl")), list(makeString("drt-rm"), makeString("cycl")), list(makeString("drt-drs"), makeString("cycl")));
}

/**
 * Total time: 88 ms
 */
